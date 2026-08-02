package defpackage;

import android.content.Context;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule$LoadingException;
import com.google.android.gms.internal.mlkit_vision_common.zziv;
import com.google.android.gms.internal.mlkit_vision_face.n;
import com.google.android.gms.internal.mlkit_vision_face.zzks;
import com.google.android.gms.internal.mlkit_vision_face.zzkt;
import com.google.android.gms.internal.mlkit_vision_face.zzoq;
import com.google.android.gms.internal.mlkit_vision_face.zzou;
import com.google.android.gms.internal.mlkit_vision_face.zzow;
import com.google.android.gms.internal.mlkit_vision_face.zzoy;
import com.google.android.gms.internal.mlkit_vision_face.zzpa;
import com.google.mlkit.common.MlKitException;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.core.accounts.f;
import com.yandex.passport.internal.core.accounts.g;
import com.yandex.passport.internal.report.i;
import com.yandex.passport.internal.report.jd;
import com.yandex.passport.internal.report.md;
import com.yandex.passport.internal.report.o;
import com.yandex.passport.internal.report.p;
import com.yandex.passport.internal.report.reporters.RevokePlace;
import com.yandex.passport.internal.report.yd;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes15.dex */
public final class sl41 implements f, g891 {
    public Object A;
    public boolean a;
    public boolean b;
    public boolean c;
    public final Object w;
    public final Object x;
    public final Object y;
    public Object z;

    public sl41(tpr tprVar, x9o x9oVar, gi7 gi7Var, zax zaxVar, Integer num, int i) {
        zaxVar = (i & 8) != 0 ? null : zaxVar;
        boolean z = (i & 32) != 0;
        boolean z2 = (i & 64) != 0;
        boolean z3 = (i & 128) != 0;
        this.w = tprVar;
        this.x = x9oVar;
        this.y = gi7Var;
        this.z = zaxVar;
        this.A = num;
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    public static boolean b(Context context) {
        return gan.a(context, "com.google.mlkit.dynamite.face") > 0;
    }

    public static ArrayList e(zzoy zzoyVar, xzv xzvVar) {
        if (xzvVar.g == -1) {
            ByteBuffer a = i4b1.a(xzvVar);
            int i = xzvVar.d;
            int i2 = xzvVar.e;
            int i3 = xzvVar.f;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            xzvVar = new xzv(a, i, i2, i3);
            o1b1.d().a(new t1b1(17, 3, a.limit(), i2, i, SystemClock.elapsedRealtime() - elapsedRealtime, i3), zziv.INPUT_IMAGE_CONSTRUCTION);
        }
        try {
            List zzd = zzoyVar.zzd(dab1.i(xzvVar), new zzoq(xzvVar.g, xzvVar.d, xzvVar.e, qnc.a(xzvVar.f), SystemClock.elapsedRealtime()));
            ArrayList arrayList = new ArrayList();
            Iterator it = zzd.iterator();
            while (it.hasNext()) {
                arrayList.add(new i7p((zzow) it.next(), xzvVar.h));
            }
            return arrayList;
        } catch (RemoteException e) {
            throw new MlKitException(13, e, "Failed to run face detector.");
        }
    }

    @Override // defpackage.g891
    public Pair a(xzv xzvVar) {
        ArrayList arrayList;
        if (((zzoy) this.A) == null && ((zzoy) this.z) == null) {
            zzd();
        }
        if (!this.a) {
            try {
                zzoy zzoyVar = (zzoy) this.A;
                if (zzoyVar != null) {
                    zzoyVar.zze();
                }
                zzoy zzoyVar2 = (zzoy) this.z;
                if (zzoyVar2 != null) {
                    zzoyVar2.zze();
                }
                this.a = true;
            } catch (RemoteException e) {
                throw new MlKitException(13, e, "Failed to init face detector.");
            }
        }
        zzoy zzoyVar3 = (zzoy) this.A;
        ArrayList arrayList2 = null;
        if (zzoyVar3 != null) {
            arrayList = e(zzoyVar3, xzvVar);
            ((r7p) this.x).getClass();
            j3a1.e(arrayList);
        } else {
            arrayList = null;
        }
        zzoy zzoyVar4 = (zzoy) this.z;
        if (zzoyVar4 != null) {
            arrayList2 = e(zzoyVar4, xzvVar);
            j3a1.e(arrayList2);
        }
        return new Pair(arrayList, arrayList2);
    }

    public void c() {
        if (((r7p) this.x).a == 2) {
            if (((zzoy) this.z) == null) {
                this.z = d(new zzou(1, 1, 1, 2, false, 0.1f));
            }
        } else if (((zzoy) this.A) == null) {
            this.A = d(new zzou(1, 1, 1, 1, false, 0.1f));
        }
    }

    public zzoy d(zzou zzouVar) {
        Context context = (Context) this.w;
        return this.b ? zzpa.zza(gan.c(context, gan.c, "com.google.mlkit.dynamite.face").b("com.google.mlkit.vision.face.bundled.internal.ThickFaceDetectorCreator")).zzd(ObjectWrapper.wrap(context), zzouVar) : zzpa.zza(gan.c(context, gan.b, "com.google.android.gms.vision.face").b("com.google.android.gms.vision.face.mlkit.FaceDetectorCreator")).zzd(ObjectWrapper.wrap(context), zzouVar);
    }

    @Override // com.yandex.passport.internal.core.accounts.f
    public void onFailure(Exception exc) {
        ((g) this.w).f.f(o.w, new jd(Long.valueOf(((ModernAccount) this.x).getUid().getValue())), new yd(this.a, 2), new md(this.b, 22), new md(((RevokePlace) this.y).name(), 6), new i(this.c, 16));
        ((AtomicReference) this.A).set(exc);
        ((CountDownLatch) this.z).countDown();
    }

    @Override // com.yandex.passport.internal.core.accounts.f
    public void onSuccess() {
        ((g) this.w).f.f(p.w, new jd(Long.valueOf(((ModernAccount) this.x).getUid().getValue())), new yd(this.a, 2), new md(this.b, 22), new md(((RevokePlace) this.y).name(), 6), new i(this.c, 16));
        ((CountDownLatch) this.z).countDown();
    }

    @Override // defpackage.g891
    public void zzb() {
        try {
            zzoy zzoyVar = (zzoy) this.A;
            if (zzoyVar != null) {
                zzoyVar.zzf();
                this.A = null;
            }
            zzoy zzoyVar2 = (zzoy) this.z;
            if (zzoyVar2 != null) {
                zzoyVar2.zzf();
                this.z = null;
            }
        } catch (RemoteException e) {
            Log.e("DecoupledFaceDelegate", "Failed to release face detector.", e);
        }
        this.a = false;
    }

    @Override // defpackage.g891
    public boolean zzd() {
        Context context = (Context) this.w;
        n nVar = (n) this.y;
        if (((zzoy) this.A) != null || ((zzoy) this.z) != null) {
            return this.b;
        }
        if (gan.a(context, "com.google.mlkit.dynamite.face") > 0) {
            this.b = true;
            try {
                c();
            } catch (RemoteException e) {
                throw new MlKitException(13, e, "Failed to create thick face detector.");
            } catch (DynamiteModule$LoadingException e2) {
                throw new MlKitException(13, e2, "Failed to load the bundled face module.");
            }
        } else {
            this.b = false;
            try {
                c();
            } catch (RemoteException e3) {
                boolean z = this.b;
                zzks zzksVar = zzks.OPTIONAL_MODULE_INIT_ERROR;
                AtomicReference atomicReference = aga1.a;
                nVar.b(new wvb1(z, zzksVar), zzkt.ON_DEVICE_FACE_LOAD);
                throw new MlKitException(13, e3, "Failed to create thin face detector.");
            } catch (DynamiteModule$LoadingException e4) {
                if (!this.c) {
                    bg70.b(context, "face");
                    this.c = true;
                }
                boolean z2 = this.b;
                zzks zzksVar2 = zzks.OPTIONAL_MODULE_NOT_AVAILABLE;
                AtomicReference atomicReference2 = aga1.a;
                nVar.b(new wvb1(z2, zzksVar2), zzkt.ON_DEVICE_FACE_LOAD);
                throw new MlKitException(14, e4, "Waiting for the face module to be downloaded. Please wait.");
            }
        }
        boolean z3 = this.b;
        zzks zzksVar3 = zzks.NO_ERROR;
        AtomicReference atomicReference3 = aga1.a;
        nVar.b(new wvb1(z3, zzksVar3), zzkt.ON_DEVICE_FACE_LOAD);
        return this.b;
    }

    public sl41(Context context, r7p r7pVar, n nVar) {
        this.w = context;
        this.x = r7pVar;
        this.y = nVar;
    }

    public sl41(g gVar, ModernAccount modernAccount, boolean z, boolean z2, RevokePlace revokePlace, boolean z3, CountDownLatch countDownLatch, AtomicReference atomicReference) {
        this.w = gVar;
        this.x = modernAccount;
        this.a = z;
        this.b = z2;
        this.y = revokePlace;
        this.c = z3;
        this.z = countDownLatch;
        this.A = atomicReference;
    }
}
