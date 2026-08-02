package S0;

import D.x;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.work.impl.WorkDatabase_Impl;
import com.IceFishing.LiveIceFishing.C5248R;
import com.IceFishing.LiveIceFishing.GzopActiongamesActivity;
import com.IceFishing.LiveIceFishing.MainActivity;
import com.anythink.banner.api.ATBannerListener;
import com.anythink.core.api.ATAdInfo;
import com.anythink.core.api.AdError;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.internal.ads.AG;
import com.google.android.gms.internal.ads.AbstractC2792Sd;
import com.google.android.gms.internal.ads.AbstractC2991bG;
import com.google.android.gms.internal.ads.AbstractC3182eu;
import com.google.android.gms.internal.ads.AbstractC3848rE;
import com.google.android.gms.internal.ads.AbstractC4118wE;
import com.google.android.gms.internal.ads.AbstractC4228yG;
import com.google.android.gms.internal.ads.BinderC2918Zo;
import com.google.android.gms.internal.ads.C1;
import com.google.android.gms.internal.ads.C2493Ak;
import com.google.android.gms.internal.ads.C2733Om;
import com.google.android.gms.internal.ads.C2821Tp;
import com.google.android.gms.internal.ads.C2867Wl;
import com.google.android.gms.internal.ads.C2944aN;
import com.google.android.gms.internal.ads.C3019br;
import com.google.android.gms.internal.ads.C3044cG;
import com.google.android.gms.internal.ads.C3100dI;
import com.google.android.gms.internal.ads.C3153eI;
import com.google.android.gms.internal.ads.C3223fh;
import com.google.android.gms.internal.ads.C3290gu;
import com.google.android.gms.internal.ads.C3313hG;
import com.google.android.gms.internal.ads.C3369iI;
import com.google.android.gms.internal.ads.C3421jI;
import com.google.android.gms.internal.ads.C3437jh;
import com.google.android.gms.internal.ads.C3475kI;
import com.google.android.gms.internal.ads.C3500kq;
import com.google.android.gms.internal.ads.C3523lC;
import com.google.android.gms.internal.ads.C3529lI;
import com.google.android.gms.internal.ads.C3558lu;
import com.google.android.gms.internal.ads.C3579mE;
import com.google.android.gms.internal.ads.C3583mI;
import com.google.android.gms.internal.ads.C3633nE;
import com.google.android.gms.internal.ads.C3637nI;
import com.google.android.gms.internal.ads.C3687oE;
import com.google.android.gms.internal.ads.C3691oI;
import com.google.android.gms.internal.ads.C3732p5;
import com.google.android.gms.internal.ads.C3745pI;
import com.google.android.gms.internal.ads.C3797qG;
import com.google.android.gms.internal.ads.C3808qa;
import com.google.android.gms.internal.ads.C3827qt;
import com.google.android.gms.internal.ads.C3857rN;
import com.google.android.gms.internal.ads.C3904sG;
import com.google.android.gms.internal.ads.C3941t;
import com.google.android.gms.internal.ads.C3958tG;
import com.google.android.gms.internal.ads.C4120wG;
import com.google.android.gms.internal.ads.C4216y4;
import com.google.android.gms.internal.ads.CG;
import com.google.android.gms.internal.ads.Cr;
import com.google.android.gms.internal.ads.DG;
import com.google.android.gms.internal.ads.Dt;
import com.google.android.gms.internal.ads.Eu;
import com.google.android.gms.internal.ads.GF;
import com.google.android.gms.internal.ads.H0;
import com.google.android.gms.internal.ads.I0;
import com.google.android.gms.internal.ads.InterfaceC2728Oh;
import com.google.android.gms.internal.ads.InterfaceC2883Xl;
import com.google.android.gms.internal.ads.InterfaceC3471kE;
import com.google.android.gms.internal.ads.InterfaceC3636nH;
import com.google.android.gms.internal.ads.JK;
import com.google.android.gms.internal.ads.K0;
import com.google.android.gms.internal.ads.KD;
import com.google.android.gms.internal.ads.LD;
import com.google.android.gms.internal.ads.LP;
import com.google.android.gms.internal.ads.M0;
import com.google.android.gms.internal.ads.MP;
import com.google.android.gms.internal.ads.Q0;
import com.google.android.gms.internal.ads.RB;
import com.google.android.gms.internal.ads.St;
import com.google.android.gms.internal.ads.Ux;
import com.google.android.gms.internal.ads.V2;
import com.google.android.gms.internal.ads.VG;
import com.google.android.gms.internal.ads.WC;
import com.google.android.gms.internal.ads.ZF;
import f6.C4522a;
import i1.C4585b;
import i1.C4586c;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Constructor;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.security.GeneralSecurityException;
import java.time.Instant;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;
import pl.droidsonroids.gif.GifImageView;
import r2.C4906k;
import u7.v;
import w.AbstractC5128c;
import w2.D;
import w2.t;
import w2.z;
import x1.InterfaceC5183a;

/* loaded from: classes.dex */
public final class l implements D1.o, F5.b, l3.c, ATBannerListener, K2.a, Y0.o, I0, VG, InterfaceC2728Oh, C2.b, Eu, InterfaceC2883Xl, KD, MP {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f2925n;

    /* renamed from: u, reason: collision with root package name */
    public Object f2926u;

    /* renamed from: v, reason: collision with root package name */
    public Object f2927v;

    public /* synthetic */ l(int i, Object obj, Object obj2) {
        this.f2925n = i;
        this.f2926u = obj;
        this.f2927v = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0046 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0041 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static l E(Context context) {
        FileChannel fileChannel;
        FileLock fileLock;
        try {
            fileChannel = new RandomAccessFile(new File(context.getFilesDir(), "generatefid.lock"), "rw").getChannel();
            try {
                fileLock = fileChannel.lock();
            } catch (IOException | Error | OverlappingFileLockException e9) {
                e = e9;
                fileLock = null;
            }
        } catch (IOException | Error | OverlappingFileLockException e10) {
            e = e10;
            fileChannel = null;
            fileLock = null;
        }
        try {
            return new l(28, fileChannel, fileLock);
        } catch (IOException e11) {
            e = e11;
            Log.e("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", e);
            if (fileLock != null) {
                try {
                    fileLock.release();
                } catch (IOException unused) {
                }
            }
            if (fileChannel != null) {
                try {
                    fileChannel.close();
                } catch (IOException unused2) {
                }
            }
            return null;
        } catch (Error e12) {
            e = e12;
            Log.e("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", e);
            if (fileLock != null) {
            }
            if (fileChannel != null) {
            }
            return null;
        } catch (OverlappingFileLockException e13) {
            e = e13;
            Log.e("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", e);
            if (fileLock != null) {
            }
            if (fileChannel != null) {
            }
            return null;
        }
    }

    public static final l I(C3529lI c3529lI) {
        WC zf;
        boolean z6;
        if (c3529lI == null || c3529lI.C() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
        ArrayList arrayList = new ArrayList(c3529lI.C());
        for (C3475kI c3475kI : c3529lI.B()) {
            int C8 = c3475kI.C();
            try {
                C4120wG R8 = R(c3475kI);
                C3313hG c3313hG = C3313hG.f31520b;
                CG cg = (CG) c3313hG.f31521a.get();
                cg.getClass();
                zf = !cg.f24848b.containsKey(new AG(C4120wG.class, R8.f35588b)) ? new ZF(R8) : c3313hG.e(R8);
                z6 = false;
            } catch (GeneralSecurityException e9) {
                if (GF.f25750a.f33867a.get()) {
                    throw e9;
                }
                zf = new ZF(R(c3475kI));
                z6 = true;
            }
            if (GF.f25750a.f33867a.get() && !S(c3475kI.G())) {
                throw new GeneralSecurityException("Parsing of a single key failed (wrong status) and Tink is configured via validateKeysetsOnParsing to reject such keysets.");
            }
            arrayList.add(new C3687oE(zf, c3475kI.G(), C8, C8 == c3529lI.A(), z6));
        }
        return new l(new HashMap(), Collections.unmodifiableList(arrayList));
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0117 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final l P(AbstractC3848rE abstractC3848rE) {
        int i;
        int i4;
        boolean z6;
        com.bumptech.glide.manager.o oVar = new com.bumptech.glide.manager.o(10);
        C3633nE c3633nE = new C3633nE(abstractC3848rE);
        V2 v22 = V2.f28861A;
        c3633nE.f33490c = v22;
        c3633nE.f33488a = true;
        ArrayList arrayList = (ArrayList) oVar.f24255v;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C3633nE) it.next()).f33488a = false;
        }
        arrayList.add(c3633nE);
        if (oVar.f24254u) {
            throw new GeneralSecurityException("KeysetHandle.Builder#build must only be called once");
        }
        oVar.f24254u = true;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int i6 = 0;
        while (i6 < arrayList.size() - 1) {
            int i9 = i6 + 1;
            if (((C3633nE) arrayList.get(i6)).f33490c == v22 && ((C3633nE) arrayList.get(i9)).f33490c != v22) {
                throw new GeneralSecurityException("Entries with 'withRandomId()' may only be followed by other entries with 'withRandomId()'.");
            }
            i6 = i9;
        }
        HashSet hashSet = new HashSet();
        Iterator it2 = arrayList.iterator();
        Integer num = null;
        while (it2.hasNext()) {
            C3633nE c3633nE2 = (C3633nE) it2.next();
            c3633nE2.getClass();
            V2 v23 = c3633nE2.f33490c;
            if (v23 == null) {
                throw new GeneralSecurityException("No ID was set (with withFixedId or withRandomId)");
            }
            int i10 = 3;
            if (v23 == v22) {
                int i11 = 0;
                while (true) {
                    if (i11 != 0 && !hashSet.contains(Integer.valueOf(i11))) {
                        break;
                    }
                    int i12 = DG.f25122a;
                    i11 = 0;
                    while (i11 == 0) {
                        byte[] a9 = AbstractC4228yG.a(4);
                        i11 = (a9[3] & 255) | ((a9[0] & 255) << 24) | ((a9[1] & 255) << 16) | ((a9[2] & 255) << 8);
                    }
                }
                i = i11;
            } else {
                i = 0;
            }
            Integer valueOf = Integer.valueOf(i);
            if (hashSet.contains(valueOf)) {
                int i13 = i;
                throw new GeneralSecurityException(AbstractC5128c.d(i13, "Id ", " is used twice in the keyset", new StringBuilder(String.valueOf(i13).length() + 31)));
            }
            hashSet.add(valueOf);
            AbstractC3848rE abstractC3848rE2 = c3633nE2.f33489b;
            WC b9 = C3044cG.f30222b.b(abstractC3848rE2, true != abstractC3848rE2.a() ? null : valueOf);
            Object obj = C3579mE.f32705v;
            if (!obj.equals(obj)) {
                if (C3579mE.f32706w.equals(obj)) {
                    i4 = 4;
                    z6 = c3633nE2.f33488a;
                    C3687oE c3687oE = new C3687oE(b9, i4, i, z6, false);
                    if (z6) {
                        if (num != null) {
                            throw new GeneralSecurityException("Two primaries were set");
                        }
                        num = valueOf;
                    }
                    arrayList2.add(c3687oE);
                } else {
                    if (!C3579mE.f32707x.equals(obj)) {
                        throw new IllegalStateException("Unknown key status");
                    }
                    i10 = 5;
                }
            }
            i4 = i10;
            z6 = c3633nE2.f33488a;
            C3687oE c3687oE2 = new C3687oE(b9, i4, i, z6, false);
            if (z6) {
            }
            arrayList2.add(c3687oE2);
        }
        if (num == null) {
            throw new GeneralSecurityException("No primary was set");
        }
        HashMap hashMap = (HashMap) oVar.f24256w;
        l lVar = new l(hashMap, arrayList2);
        if (hashMap.get(AbstractC2991bG.class) == null) {
            return lVar;
        }
        throw new ClassCastException();
    }

    public static C4120wG R(C3475kI c3475kI) {
        return C4120wG.a(c3475kI.B().A(), c3475kI.B().B(), C2944aN.n(c3475kI.B().G()), C2944aN.p(c3475kI.H()), c3475kI.H() == 5 ? null : Integer.valueOf(c3475kI.C()));
    }

    public static boolean S(int i) {
        int i4 = i - 2;
        return i4 == 1 || i4 == 2 || i4 == 3;
    }

    @Override // com.google.android.gms.internal.ads.MP
    public void A(int i, int i4, int i6, long j6) {
        ((MediaCodec) this.f2926u).queueInputBuffer(i, 0, i4, j6, i6);
    }

    @Override // com.google.android.gms.internal.ads.MP
    public void B(int i, long j6) {
        ((MediaCodec) this.f2926u).releaseOutputBuffer(i, j6);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2728Oh
    public /* synthetic */ void C(String str, int i, String str2, boolean z6) {
        C2733Om c2733Om = (C2733Om) this.f2926u;
        c2733Om.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("messageType", "validatorHtmlLoaded");
        hashMap.put("id", (String) ((Map) this.f2927v).get("id"));
        c2733Om.f27437b.d(hashMap);
    }

    @Override // com.google.android.gms.internal.ads.MP
    public ByteBuffer D(int i) {
        return ((MediaCodec) this.f2926u).getInputBuffer(i);
    }

    public void F(L.f fVar) {
        int i = fVar.f1702b;
        Handler handler = (Handler) this.f2927v;
        C4585b c4585b = (C4585b) this.f2926u;
        if (i != 0) {
            handler.post(new L.a(c4585b, i, 0));
        } else {
            handler.post(new LD(10, c4585b, fVar.f1701a));
        }
    }

    public void G() {
        try {
            ((FileLock) this.f2927v).release();
            ((FileChannel) this.f2926u).close();
        } catch (IOException e9) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e9);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object H(Thread thread, Throwable th, B7.c cVar) {
        I5.d dVar;
        A7.a aVar;
        int i;
        l lVar;
        C4522a a9;
        l lVar2;
        Instant now;
        Object obj;
        F5.c cVar2 = (F5.c) this.f2927v;
        if (cVar instanceof I5.d) {
            dVar = (I5.d) cVar;
            int i4 = dVar.f1336x;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                dVar.f1336x = i4 - Integer.MIN_VALUE;
                Object obj2 = dVar.f1334v;
                aVar = A7.a.f215n;
                i = dVar.f1336x;
                if (i != 0) {
                    Q3.b.s(obj2);
                    try {
                        cVar2.info("OtelCrashReporter: Starting to save crash report for ".concat(th.getClass().getSimpleName()));
                        try {
                            K1.c cVar3 = new K1.c(1);
                            String message = th.getMessage();
                            if (message == null) {
                                message = "";
                            }
                            cVar3.b("exception.message", message);
                            cVar3.b("exception.stacktrace", A8.b.w(th));
                            cVar3.b("exception.type", th.getClass().getName());
                            cVar3.b("ossdk.exception.thread.name", thread.getName());
                            a9 = cVar3.a();
                            cVar2.debug("OtelCrashReporter: Creating log record with attributes...");
                            try {
                                Object obj3 = (F5.d) this.f2926u;
                                dVar.f1332n = this;
                                dVar.f1333u = a9;
                                dVar.f1336x = 1;
                                try {
                                    obj2 = F5.j.b((F5.j) obj3, dVar);
                                    if (obj2 != aVar) {
                                        lVar2 = this;
                                    }
                                    return aVar;
                                } catch (IOException e9) {
                                    e = e9;
                                    e = e;
                                    lVar = this;
                                    ((F5.c) lVar.f2927v).error("OtelCrashReporter: IO error saving crash report: " + e.getMessage());
                                    throw e;
                                } catch (RuntimeException e10) {
                                    e = e10;
                                    e = e;
                                    lVar = this;
                                    ((F5.c) lVar.f2927v).error("OtelCrashReporter: Failed to save crash report: " + e.getMessage() + " - " + e.getClass().getSimpleName());
                                    throw e;
                                }
                            } catch (IOException e11) {
                                e = e11;
                            } catch (RuntimeException e12) {
                                e = e12;
                            }
                        } catch (IOException e13) {
                            e = e13;
                        } catch (RuntimeException e14) {
                            e = e14;
                        }
                    } catch (IOException e15) {
                        e = e15;
                    } catch (RuntimeException e16) {
                        e = e16;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        lVar = dVar.f1332n;
                        try {
                            Q3.b.s(obj2);
                            ((F5.c) lVar.f2927v).info("OtelCrashReporter: ✅ Crash report saved and flushed successfully to disk");
                            return v.f41073a;
                        } catch (IOException e17) {
                            e = e17;
                            ((F5.c) lVar.f2927v).error("OtelCrashReporter: IO error saving crash report: " + e.getMessage());
                            throw e;
                        } catch (RuntimeException e18) {
                            e = e18;
                            ((F5.c) lVar.f2927v).error("OtelCrashReporter: Failed to save crash report: " + e.getMessage() + " - " + e.getClass().getSimpleName());
                            throw e;
                        }
                    }
                    a9 = dVar.f1333u;
                    lVar2 = dVar.f1332n;
                    try {
                        Q3.b.s(obj2);
                    } catch (IOException e19) {
                        l lVar3 = lVar2;
                        e = e19;
                        lVar = lVar3;
                        ((F5.c) lVar.f2927v).error("OtelCrashReporter: IO error saving crash report: " + e.getMessage());
                        throw e;
                    } catch (RuntimeException e20) {
                        l lVar4 = lVar2;
                        e = e20;
                        lVar = lVar4;
                        ((F5.c) lVar.f2927v).error("OtelCrashReporter: Failed to save crash report: " + e.getMessage() + " - " + e.getClass().getSimpleName());
                        throw e;
                    }
                }
                l6.e e21 = ((l6.e) obj2).f(a9).e(l6.i.FATAL);
                now = Instant.now();
                e21.d(now).b();
                ((F5.c) lVar2.f2927v).debug("OtelCrashReporter: Flushing crash report to disk...");
                obj = (F5.d) lVar2.f2926u;
                dVar.f1332n = lVar2;
                dVar.f1333u = null;
                dVar.f1336x = 2;
                if (F5.j.a((F5.j) obj, dVar) != aVar) {
                    lVar = lVar2;
                    ((F5.c) lVar.f2927v).info("OtelCrashReporter: ✅ Crash report saved and flushed successfully to disk");
                    return v.f41073a;
                }
                return aVar;
            }
        }
        dVar = new I5.d(this, cVar);
        Object obj22 = dVar.f1334v;
        aVar = A7.a.f215n;
        i = dVar.f1336x;
        if (i != 0) {
        }
        l6.e e212 = ((l6.e) obj22).f(a9).e(l6.i.FATAL);
        now = Instant.now();
        e212.d(now).b();
        ((F5.c) lVar2.f2927v).debug("OtelCrashReporter: Flushing crash report to disk...");
        obj = (F5.d) lVar2.f2926u;
        dVar.f1332n = lVar2;
        dVar.f1333u = null;
        dVar.f1336x = 2;
        if (F5.j.a((F5.j) obj, dVar) != aVar) {
        }
        return aVar;
    }

    public Q0 J(Object... objArr) {
        Constructor c9;
        AtomicBoolean atomicBoolean = (AtomicBoolean) this.f2927v;
        synchronized (atomicBoolean) {
            if (!atomicBoolean.get()) {
                try {
                    c9 = ((M0) this.f2926u).c();
                } catch (ClassNotFoundException unused) {
                    ((AtomicBoolean) this.f2927v).set(true);
                } catch (Exception e9) {
                    throw new RuntimeException("Error instantiating extension", e9);
                }
            }
            c9 = null;
        }
        if (c9 == null) {
            return null;
        }
        try {
            return (Q0) c9.newInstance(objArr);
        } catch (Exception e10) {
            throw new IllegalStateException("Unexpected error creating extractor", e10);
        }
    }

    public synchronized Map K() {
        try {
            if (((Map) this.f2927v) == null) {
                this.f2927v = Collections.unmodifiableMap(new HashMap((HashMap) this.f2926u));
            }
        } catch (Throwable th) {
            throw th;
        }
        return (Map) this.f2927v;
    }

    public void L(C3797qG c3797qG) {
        if (c3797qG == null) {
            throw new NullPointerException("primitive constructor must be non-null");
        }
        C3904sG c3904sG = new C3904sG(c3797qG.f34011a, c3797qG.f34012b);
        HashMap hashMap = (HashMap) this.f2926u;
        if (!hashMap.containsKey(c3904sG)) {
            hashMap.put(c3904sG, c3797qG);
            return;
        }
        C3797qG c3797qG2 = (C3797qG) hashMap.get(c3904sG);
        if (!c3797qG2.equals(c3797qG) || !c3797qG.equals(c3797qG2)) {
            throw new GeneralSecurityException("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: ".concat(c3904sG.toString()));
        }
    }

    public C3529lI M() {
        try {
            C3369iI G2 = C3529lI.G();
            for (C3687oE c3687oE : (List) this.f2926u) {
                WC wc = c3687oE.f33665a;
                int i = c3687oE.f33670f;
                C4120wG c4120wG = (C4120wG) C3313hG.f31520b.f(wc);
                Integer e9 = wc.e();
                int i4 = c3687oE.f33667c;
                if (e9 != null && e9.intValue() != i4) {
                    throw new GeneralSecurityException("Wrong ID set for key with ID requirement");
                }
                C3421jI D8 = C3475kI.D();
                C3100dI C8 = C3153eI.C();
                String str = c4120wG.f35587a;
                C8.h();
                ((C3153eI) C8.f28504u).E(str);
                JK jk = c4120wG.f35589c;
                C8.h();
                ((C3153eI) C8.f28504u).F(jk);
                int i6 = C2944aN.i(c4120wG.f35590d);
                C8.h();
                ((C3153eI) C8.f28504u).H(i6);
                D8.h();
                ((C3475kI) D8.f28504u).E((C3153eI) C8.j());
                D8.h();
                ((C3475kI) D8.f28504u).I(i);
                D8.h();
                ((C3475kI) D8.f28504u).F(i4);
                int q8 = C2944aN.q(c4120wG.f35591e);
                D8.h();
                ((C3475kI) D8.f28504u).J(q8);
                C3475kI c3475kI = (C3475kI) D8.j();
                G2.h();
                ((C3529lI) G2.f28504u).I(c3475kI);
                if (c3687oE.f33668d) {
                    G2.h();
                    ((C3529lI) G2.f28504u).H(i4);
                }
            }
            return (C3529lI) G2.j();
        } catch (GeneralSecurityException e10) {
            throw new B0.c(e10);
        }
    }

    public C3687oE N() {
        for (C3687oE c3687oE : (List) this.f2926u) {
            if (c3687oE != null && c3687oE.f33668d) {
                if (c3687oE.f33666b == C3579mE.f32705v) {
                    return c3687oE;
                }
                throw new IllegalStateException("Keyset has primary which isn't enabled");
            }
        }
        throw new IllegalStateException("Keyset has no valid primary");
    }

    public C3687oE O(int i) {
        List list = (List) this.f2926u;
        if (i < 0 || i >= list.size()) {
            int size = list.size();
            throw new IndexOutOfBoundsException(x.o(new StringBuilder(String.valueOf(i).length() + 34 + String.valueOf(size).length()), "Invalid index ", i, " for keyset of size ", size));
        }
        C3687oE c3687oE = (C3687oE) list.get(i);
        if (!S(c3687oE.f33670f)) {
            throw new IllegalStateException(AbstractC5128c.d(i, "Keyset-Entry at position ", " has wrong status", new StringBuilder(String.valueOf(i).length() + 42)));
        }
        if (c3687oE.f33669e) {
            throw new IllegalStateException(AbstractC5128c.d(i, "Keyset-Entry at position ", " didn't parse correctly", new StringBuilder(String.valueOf(i).length() + 48)));
        }
        return (C3687oE) list.get(i);
    }

    @Override // Y0.o
    public void OnCall() {
        switch (this.f2925n) {
            case 8:
                ((GzopActiongamesActivity) this.f2927v).startActivity((Intent) this.f2926u);
                break;
            default:
                ((MainActivity) this.f2927v).startActivity((Intent) this.f2926u);
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00db, code lost:
    
        r12 = r1.D(r4).B().A();
        r0 = new java.lang.StringBuilder((java.lang.String.valueOf(r12).length() + (java.lang.String.valueOf(r4).length() + 44)) + 32);
        r0.append("Key parsing of key with index ");
        r0.append(r4);
        r0.append(" and type_url ");
        r0.append(r12);
        r0.append(" failed, unable to get primitive");
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x011f, code lost:
    
        throw new java.security.GeneralSecurityException(r0.toString());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object Q(InterfaceC3471kE interfaceC3471kE, Class cls) {
        C3529lI M8 = M();
        int i = AbstractC4118wE.f35584a;
        int A9 = M8.A();
        int i4 = 0;
        boolean z6 = true;
        int i6 = 0;
        boolean z9 = false;
        for (C3475kI c3475kI : M8.B()) {
            if (c3475kI.G() == 3) {
                if (!c3475kI.A()) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(c3475kI.C())));
                }
                if (c3475kI.H() == 2) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(c3475kI.C())));
                }
                if (c3475kI.G() == 2) {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(c3475kI.C())));
                }
                if (c3475kI.C() == A9) {
                    if (z9) {
                        throw new GeneralSecurityException("keyset contains multiple primary keys");
                    }
                    z9 = true;
                }
                z6 &= c3475kI.B().G() == 5;
                i6++;
            }
        }
        if (i6 == 0) {
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        }
        if (!z9 && !z6) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
        while (true) {
            List list = (List) this.f2926u;
            if (i4 >= list.size()) {
                return interfaceC3471kE.e(this, cls);
            }
            if (((C3687oE) list.get(i4)).f33669e || !S(((C3687oE) list.get(i4)).f33670f)) {
                break;
            }
            i4++;
        }
    }

    @Override // com.google.android.gms.internal.ads.Eu
    public Object a(Object obj) {
        C2821Tp c2821Tp = (C2821Tp) this.f2926u;
        c2821Tp.getClass();
        ContentValues contentValues = new ContentValues();
        C3732p5 c3732p5 = (C3732p5) this.f2927v;
        contentValues.put(com.anythink.expressad.foundation.d.d.f19383u, Long.valueOf(c3732p5.f33819a));
        contentValues.put("gws_query_id", (String) c3732p5.f33821c);
        contentValues.put("url", (String) c3732p5.f33822d);
        contentValues.put("event_state", Integer.valueOf(c3732p5.f33820b - 1));
        ((SQLiteDatabase) obj).insert("offline_buffered_pings", null, contentValues);
        D d9 = C4906k.f40186C.f40191c;
        Context context = c2821Tp.f28593n;
        t b9 = D.b(context);
        if (b9 != null) {
            try {
                b9.zzf(new Y2.b(context));
            } catch (RemoteException e9) {
                z.l("Failed to schedule offline ping sender.", e9);
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.MP
    public ByteBuffer b(int i) {
        return ((MediaCodec) this.f2926u).getOutputBuffer(i);
    }

    @Override // com.google.android.gms.internal.ads.VG
    /* renamed from: c */
    public /* synthetic */ InterfaceC3636nH mo13c() {
        C3437jh c3437jh = (C3437jh) this.f2926u;
        c3437jh.getClass();
        InterfaceC3636nH mo13c = ((VG) this.f2927v).mo13c();
        Ux ux = new Ux(14, c3437jh);
        return new C3223fh(c3437jh.f32077n, mo13c, c3437jh.f32071G, c3437jh.f32072H, c3437jh, ux);
    }

    @Override // com.google.android.gms.internal.ads.MP
    public int d() {
        return ((MediaCodec) this.f2926u).dequeueInputBuffer(0L);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2883Xl
    public void e(boolean z6, Context context, C2493Ak c2493Ak) {
        C3290gu c3290gu;
        try {
            C3558lu c3558lu = (C3558lu) ((C3500kq) this.f2926u).f32421b;
            c3558lu.b(z6);
            try {
                c3558lu.f32644a.I();
            } finally {
            }
        } catch (C3290gu e9) {
            int i = z.f41712b;
            x2.i.g("Cannot show rewarded video.", e9);
            throw new C2867Wl(e9.getCause());
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2883Xl
    public St f() {
        return (St) this.f2927v;
    }

    @Override // com.google.android.gms.internal.ads.MP
    public void g(ArrayList arrayList) {
        ((MediaCodec) this.f2926u).subscribeToVendorParameters(arrayList);
    }

    @Override // com.google.android.gms.internal.ads.MP
    public MediaFormat h() {
        return ((MediaCodec) this.f2926u).getOutputFormat();
    }

    @Override // com.google.android.gms.internal.ads.MP
    public void i(int i, C3857rN c3857rN, long j6, int i4) {
        ((MediaCodec) this.f2926u).queueSecureInputBuffer(i, 0, c3857rN.i, j6, i4);
    }

    @Override // K2.a
    public l3.m j() {
        l3.m j6 = ((b3.g) this.f2926u).j();
        C4586c c4586c = new C4586c(13, this);
        j6.getClass();
        return j6.e(l3.i.f38871a, c4586c);
    }

    @Override // com.google.android.gms.internal.ads.MP
    public void k() {
        ((MediaCodec) this.f2926u).flush();
    }

    @Override // com.google.android.gms.internal.ads.MP
    public void l() {
        LP lp = (LP) this.f2927v;
        MediaCodec mediaCodec = (MediaCodec) this.f2926u;
        try {
            int i = Build.VERSION.SDK_INT;
            if (i >= 30 && i < 33) {
                mediaCodec.stop();
            }
            if (i >= 35 && lp != null) {
                lp.l(mediaCodec);
            }
            mediaCodec.release();
        } catch (Throwable th) {
            if (Build.VERSION.SDK_INT >= 35 && lp != null) {
                lp.l(mediaCodec);
            }
            mediaCodec.release();
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.MP
    public void m(Bundle bundle) {
        ((MediaCodec) this.f2926u).setParameters(bundle);
    }

    @Override // com.google.android.gms.internal.ads.KD
    /* renamed from: n */
    public /* synthetic */ void mo10n(Object obj) {
        C3941t c3941t = (C3941t) this.f2927v;
        synchronized (c3941t) {
            c3941t.f34967x = null;
            ((ArrayDeque) c3941t.f34966w).addFirst((C3827qt) this.f2926u);
            if (c3941t.f34963n == 1) {
                c3941t.f();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.MP
    public void o(Surface surface) {
        ((MediaCodec) this.f2926u).setOutputSurface(surface);
    }

    @Override // com.anythink.banner.api.ATBannerListener
    public void onBannerAutoRefreshFail(AdError adError) {
        if (Y0.p.f3878g == 1) {
            LayoutInflater from = LayoutInflater.from((Context) this.f2926u);
            ViewGroup viewGroup = (ViewGroup) this.f2927v;
            View inflate = from.inflate(C5248R.layout.qureka_nativebanner_layout, viewGroup, false);
            Y0.p.d(inflate.findViewById(C5248R.id.playNowLL));
            GifImageView gifImageView = (GifImageView) inflate.findViewById(C5248R.id.iv_round_gif);
            TextView textView = (TextView) inflate.findViewById(C5248R.id.tv_text_ad_name);
            TextView textView2 = (TextView) inflate.findViewById(C5248R.id.tv_text_ad_desc);
            int nextInt = new Random().nextInt(5);
            textView.setText(Y0.p.f3869P[nextInt]);
            textView2.setText(Y0.p.f3870Q[nextInt]);
            gifImageView.setImageResource(Y0.p.f3871R[nextInt]);
            inflate.findViewById(C5248R.id.bannerclick).setOnClickListener(new Y0.l(this, 1));
            viewGroup.removeAllViews();
            viewGroup.addView(inflate);
        }
    }

    @Override // com.anythink.banner.api.ATBannerListener
    public void onBannerFailed(AdError adError) {
        if (Y0.p.f3878g == 1) {
            LayoutInflater from = LayoutInflater.from((Context) this.f2926u);
            ViewGroup viewGroup = (ViewGroup) this.f2927v;
            View inflate = from.inflate(C5248R.layout.qureka_nativebanner_layout, viewGroup, false);
            Y0.p.d(inflate.findViewById(C5248R.id.playNowLL));
            GifImageView gifImageView = (GifImageView) inflate.findViewById(C5248R.id.iv_round_gif);
            TextView textView = (TextView) inflate.findViewById(C5248R.id.tv_text_ad_name);
            TextView textView2 = (TextView) inflate.findViewById(C5248R.id.tv_text_ad_desc);
            int nextInt = new Random().nextInt(5);
            textView.setText(Y0.p.f3869P[nextInt]);
            textView2.setText(Y0.p.f3870Q[nextInt]);
            gifImageView.setImageResource(Y0.p.f3871R[nextInt]);
            inflate.findViewById(C5248R.id.bannerclick).setOnClickListener(new Y0.l(this, 0));
            viewGroup.removeAllViews();
            viewGroup.addView(inflate);
        }
    }

    @Override // C2.b
    public /* synthetic */ void onNativeAdLoaded(NativeAd nativeAd) {
        ((BinderC2918Zo) this.f2926u).U3(nativeAd, (String) this.f2927v);
    }

    @Override // com.google.android.gms.internal.ads.I0
    public H0 q(K0 k02, long j6) {
        long j9 = k02.f26571w;
        int min = (int) Math.min(20000L, k02.f26570v - j9);
        Cr cr = (Cr) this.f2927v;
        cr.y(min);
        k02.E(cr.f24997a, 0, min, false);
        int i = -1;
        int i4 = -1;
        long j10 = -9223372036854775807L;
        while (cr.B() >= 4) {
            if (C1.d(cr.f24998b, cr.f24997a) != 442) {
                cr.G(1);
            } else {
                cr.G(4);
                long a9 = C4216y4.a(cr);
                if (a9 != com.anythink.basead.exoplayer.b.f7168b) {
                    long c9 = ((Dt) this.f2926u).c(a9);
                    if (c9 > j6) {
                        return j10 == com.anythink.basead.exoplayer.b.f7168b ? new H0(-1, c9, j9) : new H0(0, com.anythink.basead.exoplayer.b.f7168b, j9 + i4);
                    }
                    if (c9 + 100000 > j6) {
                        return new H0(0, com.anythink.basead.exoplayer.b.f7168b, j9 + cr.f24998b);
                    }
                    j10 = c9;
                    i4 = cr.f24998b;
                }
                int i6 = cr.f24999c;
                if (cr.B() >= 10) {
                    cr.G(9);
                    int K7 = cr.K() & 7;
                    if (cr.B() >= K7) {
                        cr.G(K7);
                        if (cr.B() >= 4) {
                            if (C1.d(cr.f24998b, cr.f24997a) == 443) {
                                cr.G(4);
                                int L2 = cr.L();
                                if (cr.B() < L2) {
                                    cr.E(i6);
                                } else {
                                    cr.G(L2);
                                }
                            }
                            while (true) {
                                if (cr.B() < 4) {
                                    break;
                                }
                                int d9 = C1.d(cr.f24998b, cr.f24997a);
                                if (d9 == 442 || d9 == 441 || (d9 >>> 8) != 1) {
                                    break;
                                }
                                cr.G(4);
                                if (cr.B() < 2) {
                                    cr.E(i6);
                                    break;
                                }
                                cr.E(Math.min(cr.f24999c, cr.f24998b + cr.L()));
                            }
                        } else {
                            cr.E(i6);
                        }
                    } else {
                        cr.E(i6);
                    }
                } else {
                    cr.E(i6);
                }
                i = cr.f24998b;
            }
        }
        return j10 != com.anythink.basead.exoplayer.b.f7168b ? new H0(-2, j10, j9 + i) : H0.f25972d;
    }

    @Override // l3.c
    public void r(l3.m mVar) {
        ((Map) ((s) this.f2927v).f2970v).remove((l3.h) this.f2926u);
    }

    @Override // com.google.android.gms.internal.ads.MP
    public void s() {
        ((MediaCodec) this.f2926u).detachOutputSurface();
    }

    @Override // com.google.android.gms.internal.ads.MP
    public void t(int i) {
        ((MediaCodec) this.f2926u).releaseOutputBuffer(i, false);
    }

    public String toString() {
        switch (this.f2925n) {
            case 22:
                C3529lI M8 = M();
                int i = AbstractC4118wE.f35584a;
                C3583mI A9 = C3745pI.A();
                int A10 = M8.A();
                A9.h();
                ((C3745pI) A9.f28504u).B(A10);
                for (C3475kI c3475kI : M8.B()) {
                    C3637nI A11 = C3691oI.A();
                    String A12 = c3475kI.B().A();
                    A11.h();
                    ((C3691oI) A11.f28504u).B(A12);
                    int G2 = c3475kI.G();
                    A11.h();
                    ((C3691oI) A11.f28504u).D(G2);
                    int H8 = c3475kI.H();
                    A11.h();
                    ((C3691oI) A11.f28504u).E(H8);
                    int C8 = c3475kI.C();
                    A11.h();
                    ((C3691oI) A11.f28504u).C(C8);
                    C3691oI c3691oI = (C3691oI) A11.j();
                    A9.h();
                    ((C3745pI) A9.f28504u).C(c3691oI);
                }
                return ((C3745pI) A9.j()).toString();
            default:
                return super.toString();
        }
    }

    @Override // com.google.android.gms.internal.ads.MP
    public int v(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            dequeueOutputBuffer = ((MediaCodec) this.f2926u).dequeueOutputBuffer(bufferInfo, 0L);
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    @Override // com.google.android.gms.internal.ads.KD
    public void w(Throwable th) {
        C3941t c3941t = (C3941t) this.f2927v;
        synchronized (c3941t) {
            c3941t.f34967x = null;
        }
    }

    @Override // D1.o
    public void x() {
        D1.z zVar = (D1.z) this.f2926u;
        synchronized (zVar) {
            zVar.f585v = zVar.f583n.length;
        }
    }

    @Override // com.google.android.gms.internal.ads.MP
    public void y(int i) {
        ((MediaCodec) this.f2926u).setVideoScalingMode(i);
    }

    @Override // D1.o
    public void z(Bitmap bitmap, InterfaceC5183a interfaceC5183a) {
        IOException iOException = ((P1.e) this.f2927v).f2358u;
        if (iOException != null) {
            if (bitmap == null) {
                throw iOException;
            }
            interfaceC5183a.b(bitmap);
            throw iOException;
        }
    }

    public /* synthetic */ l(int i, boolean z6) {
        this.f2925n = i;
    }

    @Override // com.google.android.gms.internal.ads.I0
    /* renamed from: f, reason: collision with other method in class */
    public void mo1f() {
        byte[] bArr = AbstractC3182eu.f30783b;
        int length = bArr.length;
        ((Cr) this.f2927v).z(0, bArr);
    }

    public l(Context context) {
        b3.e eVar;
        this.f2925n = 7;
        this.f2926u = new b3.g(context, O2.f.f2270b);
        synchronized (b3.e.class) {
            try {
                if (b3.e.f5554x == null) {
                    b3.e.f5554x = new b3.e(context.getApplicationContext());
                }
                eVar = b3.e.f5554x;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f2927v = eVar;
    }

    public /* synthetic */ l(Object obj, Object obj2, int i, boolean z6) {
        this.f2925n = i;
        this.f2927v = obj;
        this.f2926u = obj2;
    }

    public l(MediaCodec mediaCodec, LP lp) {
        boolean addMediaCodec;
        this.f2925n = 27;
        this.f2926u = mediaCodec;
        this.f2927v = lp;
        if (Build.VERSION.SDK_INT < 35 || lp == null) {
            return;
        }
        LoudnessCodecController loudnessCodecController = (LoudnessCodecController) lp.f26917v;
        if (loudnessCodecController != null) {
            addMediaCodec = loudnessCodecController.addMediaCodec(mediaCodec);
            if (!addMediaCodec) {
                return;
            }
        }
        AbstractC2792Sd.H(((HashSet) lp.f26916u).add(mediaCodec));
    }

    public l(C3941t c3941t, C3827qt c3827qt) {
        this.f2925n = 19;
        this.f2926u = c3827qt;
        Objects.requireNonNull(c3941t);
        this.f2927v = c3941t;
    }

    public l(M0 m0) {
        this.f2925n = 10;
        this.f2926u = m0;
        this.f2927v = new AtomicBoolean(false);
    }

    public l(C3808qa c3808qa) {
        this.f2925n = 12;
        this.f2927v = c3808qa;
        this.f2926u = new HashMap();
    }

    public l(C3019br c3019br, C3500kq c3500kq, St st) {
        this.f2925n = 18;
        this.f2926u = c3500kq;
        this.f2927v = st;
        Objects.requireNonNull(c3019br);
    }

    public /* synthetic */ l(Dt dt) {
        this.f2925n = 11;
        this.f2926u = dt;
        this.f2927v = new Cr();
    }

    public l(C3523lC c3523lC, int[] iArr) {
        this.f2925n = 21;
        this.f2926u = RB.n(c3523lC);
        this.f2927v = iArr;
    }

    public l(HashMap hashMap, List list) {
        this.f2925n = 22;
        this.f2926u = list;
        this.f2927v = hashMap;
        if (GF.f25750a.f33867a.get()) {
            HashSet hashSet = new HashSet();
            Iterator it = list.iterator();
            boolean z6 = false;
            while (it.hasNext()) {
                C3687oE c3687oE = (C3687oE) it.next();
                boolean contains = hashSet.contains(Integer.valueOf(c3687oE.f33667c));
                int i = c3687oE.f33667c;
                if (!contains) {
                    hashSet.add(Integer.valueOf(i));
                    z6 |= c3687oE.f33668d;
                } else {
                    throw new GeneralSecurityException(AbstractC5128c.d(i, "KeyID ", " is duplicated in the keyset, and Tink is configured to reject such keysets with the flag validateKeysetsOnParsing.", new StringBuilder(String.valueOf(i).length() + 121)));
                }
            }
            if (!z6) {
                throw new GeneralSecurityException("Primary key id not found in keyset, and Tink is configured to reject such keysets with the flag validateKeysetsOnParsing.");
            }
        }
    }

    @Override // com.anythink.banner.api.ATBannerListener
    public void onBannerLoaded() {
    }

    public /* synthetic */ l(C3958tG c3958tG) {
        this.f2925n = 23;
        this.f2926u = new HashMap(c3958tG.f35043a);
        this.f2927v = new HashMap(c3958tG.f35044b);
    }

    @Override // com.anythink.banner.api.ATBannerListener
    public void onBannerAutoRefreshed(ATAdInfo aTAdInfo) {
    }

    @Override // com.anythink.banner.api.ATBannerListener
    public void onBannerClicked(ATAdInfo aTAdInfo) {
    }

    @Override // com.anythink.banner.api.ATBannerListener
    public void onBannerClose(ATAdInfo aTAdInfo) {
    }

    @Override // com.anythink.banner.api.ATBannerListener
    public void onBannerShow(ATAdInfo aTAdInfo) {
    }

    public l(int i) {
        this.f2925n = i;
        switch (i) {
            case 24:
                this.f2926u = new HashMap();
                break;
            default:
                this.f2926u = new HashMap();
                this.f2927v = new HashMap();
                break;
        }
    }

    public l(WorkDatabase_Impl workDatabase_Impl) {
        this.f2925n = 0;
        this.f2926u = workDatabase_Impl;
        this.f2927v = new b(workDatabase_Impl, 3);
    }
}
