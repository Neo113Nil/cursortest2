package defpackage;

import android.content.Context;
import android.media.Image;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.b;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule$LoadingException;
import com.google.android.gms.internal.mlkit_vision_barcode.n;
import com.google.android.gms.internal.mlkit_vision_barcode.zzcs;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrb;
import com.google.android.gms.internal.mlkit_vision_barcode.zzyb;
import com.google.android.gms.internal.mlkit_vision_barcode.zzyd;
import com.google.android.gms.internal.mlkit_vision_barcode.zzyl;
import com.google.android.gms.internal.mlkit_vision_barcode.zzyn;
import com.google.android.gms.internal.mlkit_vision_barcode.zzyo;
import com.google.android.gms.internal.mlkit_vision_barcode.zzyu;
import com.google.mlkit.common.MlKitException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes11.dex */
public final class u7b1 implements txa1 {
    public static final zzcs A = zzcs.i("com.google.android.gms.vision.barcode", "com.google.android.gms.tflite_dynamite");
    public boolean a;
    public boolean b;
    public boolean c;
    public final Context w;
    public final uv4 x;
    public final n y;
    public zzyl z;

    public u7b1(Context context, uv4 uv4Var, n nVar) {
        this.w = context;
        this.x = uv4Var;
        this.y = nVar;
    }

    public static boolean b(Context context) {
        return gan.a(context, "com.google.mlkit.dynamite.barcode") > 0;
    }

    @Override // defpackage.txa1
    public final ArrayList a(xzv xzvVar) {
        if (this.z == null) {
            zzc();
        }
        zzyl zzylVar = this.z;
        cvw.l(zzylVar);
        if (!this.a) {
            try {
                zzylVar.zze();
                this.a = true;
            } catch (RemoteException e) {
                throw new MlKitException(13, e, "Failed to init barcode scanner.");
            }
        }
        int i = xzvVar.d;
        if (xzvVar.g == 35) {
            Image.Plane[] a = xzvVar.a();
            cvw.l(a);
            i = a[0].getRowStride();
        }
        try {
            List zzd = zzylVar.zzd(dab1.i(xzvVar), new zzyu(xzvVar.g, i, xzvVar.e, qnc.a(xzvVar.f), SystemClock.elapsedRealtime()));
            ArrayList arrayList = new ArrayList();
            Iterator it = zzd.iterator();
            while (it.hasNext()) {
                arrayList.add(new fv4(new sl81((zzyb) it.next()), xzvVar.h));
            }
            return arrayList;
        } catch (RemoteException e2) {
            throw new MlKitException(13, e2, "Failed to run barcode scanner.");
        }
    }

    public final zzyl c(fan fanVar, String str, String str2) {
        Context context = this.w;
        zzyo zza = zzyn.zza(gan.c(context, fanVar, str).b(str2));
        IObjectWrapper wrap = ObjectWrapper.wrap(context);
        uv4 uv4Var = this.x;
        return zza.zzd(wrap, new zzyd(uv4Var.a, uv4Var.b));
    }

    @Override // defpackage.txa1
    public final void zzb() {
        zzyl zzylVar = this.z;
        if (zzylVar != null) {
            try {
                zzylVar.zzf();
            } catch (RemoteException e) {
                Log.e("DecoupledBarcodeScanner", "Failed to release barcode scanner.", e);
            }
            this.z = null;
            this.a = false;
        }
    }

    @Override // defpackage.txa1
    public final boolean zzc() {
        if (this.z != null) {
            return this.b;
        }
        Context context = this.w;
        boolean b = b(context);
        n nVar = this.y;
        if (b) {
            this.b = true;
            try {
                this.z = c(gan.c, "com.google.mlkit.dynamite.barcode", "com.google.mlkit.vision.barcode.bundled.internal.ThickBarcodeScannerCreator");
            } catch (RemoteException e) {
                throw new MlKitException(13, e, "Failed to create thick barcode scanner.");
            } catch (DynamiteModule$LoadingException e2) {
                throw new MlKitException(13, e2, "Failed to load the bundled barcode module.");
            }
        } else {
            boolean z = false;
            this.b = false;
            Feature[] featureArr = bg70.a;
            b.b.getClass();
            int a = b.a(context);
            zzcs zzcsVar = A;
            if (a >= 221500000) {
                z = bg70.a(context, bg70.e(zzcsVar, bg70.g));
            } else {
                try {
                    ef91 listIterator = zzcsVar.listIterator(0);
                    while (listIterator.hasNext()) {
                        gan.c(context, gan.b, (String) listIterator.next());
                    }
                    z = true;
                } catch (DynamiteModule$LoadingException unused) {
                }
            }
            if (!z) {
                if (!this.c) {
                    bg70.c(context, zzcs.i("barcode", "tflite_dynamite"));
                    this.c = true;
                }
                e891.c(nVar, zzrb.OPTIONAL_MODULE_NOT_AVAILABLE);
                throw new MlKitException("Waiting for the barcode module to be downloaded. Please wait.", 14);
            }
            try {
                this.z = c(gan.b, "com.google.android.gms.vision.barcode", "com.google.android.gms.vision.barcode.mlkit.BarcodeScannerCreator");
            } catch (RemoteException | DynamiteModule$LoadingException e3) {
                e891.c(nVar, zzrb.OPTIONAL_MODULE_INIT_ERROR);
                throw new MlKitException(13, e3, "Failed to create thin barcode scanner.");
            }
        }
        e891.c(nVar, zzrb.NO_ERROR);
        return this.b;
    }
}
