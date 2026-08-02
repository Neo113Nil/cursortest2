package S0;

import B1.D;
import D.y;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.ImageDecoder;
import android.graphics.drawable.Drawable;
import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import android.text.Spannable;
import android.text.SpannableString;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.emoji2.text.u;
import androidx.work.impl.WorkDatabase_Impl;
import com.anythink.banner.api.ATBannerListener;
import com.anythink.core.api.ATAdInfo;
import com.anythink.core.api.AdError;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.internal.ads.AG;
import com.google.android.gms.internal.ads.AbstractC2772Sd;
import com.google.android.gms.internal.ads.AbstractC2968bG;
import com.google.android.gms.internal.ads.AbstractC3159eu;
import com.google.android.gms.internal.ads.AbstractC3825rE;
import com.google.android.gms.internal.ads.AbstractC4095wE;
import com.google.android.gms.internal.ads.AbstractC4205yG;
import com.google.android.gms.internal.ads.BinderC2895Zo;
import com.google.android.gms.internal.ads.C1;
import com.google.android.gms.internal.ads.C2473Ak;
import com.google.android.gms.internal.ads.C2696Nm;
import com.google.android.gms.internal.ads.C2800Tp;
import com.google.android.gms.internal.ads.C2828Vl;
import com.google.android.gms.internal.ads.C2921aN;
import com.google.android.gms.internal.ads.C2996br;
import com.google.android.gms.internal.ads.C3021cG;
import com.google.android.gms.internal.ads.C3077dI;
import com.google.android.gms.internal.ads.C3130eI;
import com.google.android.gms.internal.ads.C3200fh;
import com.google.android.gms.internal.ads.C3267gu;
import com.google.android.gms.internal.ads.C3290hG;
import com.google.android.gms.internal.ads.C3346iI;
import com.google.android.gms.internal.ads.C3398jI;
import com.google.android.gms.internal.ads.C3414jh;
import com.google.android.gms.internal.ads.C3452kI;
import com.google.android.gms.internal.ads.C3477kq;
import com.google.android.gms.internal.ads.C3500lC;
import com.google.android.gms.internal.ads.C3506lI;
import com.google.android.gms.internal.ads.C3535lu;
import com.google.android.gms.internal.ads.C3556mE;
import com.google.android.gms.internal.ads.C3560mI;
import com.google.android.gms.internal.ads.C3610nE;
import com.google.android.gms.internal.ads.C3614nI;
import com.google.android.gms.internal.ads.C3664oE;
import com.google.android.gms.internal.ads.C3668oI;
import com.google.android.gms.internal.ads.C3709p5;
import com.google.android.gms.internal.ads.C3722pI;
import com.google.android.gms.internal.ads.C3774qG;
import com.google.android.gms.internal.ads.C3785qa;
import com.google.android.gms.internal.ads.C3804qt;
import com.google.android.gms.internal.ads.C3834rN;
import com.google.android.gms.internal.ads.C3881sG;
import com.google.android.gms.internal.ads.C3918t;
import com.google.android.gms.internal.ads.C3935tG;
import com.google.android.gms.internal.ads.C4097wG;
import com.google.android.gms.internal.ads.C4193y4;
import com.google.android.gms.internal.ads.CG;
import com.google.android.gms.internal.ads.Cr;
import com.google.android.gms.internal.ads.DG;
import com.google.android.gms.internal.ads.Dt;
import com.google.android.gms.internal.ads.Eu;
import com.google.android.gms.internal.ads.GF;
import com.google.android.gms.internal.ads.H0;
import com.google.android.gms.internal.ads.I0;
import com.google.android.gms.internal.ads.InterfaceC2708Oh;
import com.google.android.gms.internal.ads.InterfaceC2844Wl;
import com.google.android.gms.internal.ads.InterfaceC3448kE;
import com.google.android.gms.internal.ads.InterfaceC3613nH;
import com.google.android.gms.internal.ads.JK;
import com.google.android.gms.internal.ads.K0;
import com.google.android.gms.internal.ads.KD;
import com.google.android.gms.internal.ads.LP;
import com.google.android.gms.internal.ads.M0;
import com.google.android.gms.internal.ads.Q0;
import com.google.android.gms.internal.ads.RB;
import com.google.android.gms.internal.ads.St;
import com.google.android.gms.internal.ads.Ux;
import com.google.android.gms.internal.ads.V2;
import com.google.android.gms.internal.ads.VG;
import com.google.android.gms.internal.ads.WC;
import com.google.android.gms.internal.ads.ZF;
import com.icefishingapp.icefishing.C5275R;
import com.icefishingapp.icefishing.GzopPuzzleLogicActivity;
import i1.AbstractC4579a;
import i8.v;
import i8.x;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Constructor;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.security.GeneralSecurityException;
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
import o4.InterfaceC4799l;
import o4.ViewOnClickListenerC4797j;
import p2.C4835j;
import pl.droidsonroids.gif.GifImageView;
import u2.t;
import u2.z;

/* loaded from: classes.dex */
public final class l implements androidx.emoji2.text.o, I0, VG, InterfaceC2708Oh, A2.b, Eu, InterfaceC2844Wl, KD, LP, InterfaceC4799l, ATBannerListener {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f2796n;

    /* renamed from: u, reason: collision with root package name */
    public Object f2797u;

    /* renamed from: v, reason: collision with root package name */
    public Object f2798v;

    public /* synthetic */ l(int i, Object obj, Object obj2) {
        this.f2796n = i;
        this.f2797u = obj;
        this.f2798v = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0046 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0041 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static l A(Context context) {
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
            return new l(26, fileChannel, fileLock);
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

    public static D B(ImageDecoder.Source source, int i, int i6, s1.h hVar) {
        Drawable decodeDrawable;
        decodeDrawable = ImageDecoder.decodeDrawable(source, new A1.d(i, i6, hVar));
        if (A1.a.x(decodeDrawable)) {
            return new D(2, A1.a.i(decodeDrawable));
        }
        throw new IOException("Received unexpected drawable type for animated image, failing: " + decodeDrawable);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a A[Catch: IOException -> 0x006d, TryCatch #0 {IOException -> 0x006d, blocks: (B:2:0x0000, B:3:0x000a, B:5:0x000d, B:7:0x001e, B:9:0x0026, B:13:0x0042, B:15:0x003a, B:16:0x003d, B:27:0x0047, B:29:0x004a, B:32:0x005b), top: B:1:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static l F(String... strArr) {
        String str;
        try {
            y8.h[] hVarArr = new y8.h[strArr.length];
            y8.e eVar = new y8.e();
            for (int i = 0; i < strArr.length; i++) {
                String str2 = strArr[i];
                String[] strArr2 = AbstractC4579a.f38029x;
                eVar.X(34);
                int length = str2.length();
                int i6 = 0;
                for (int i9 = 0; i9 < length; i9++) {
                    char charAt = str2.charAt(i9);
                    if (charAt < 128) {
                        str = strArr2[charAt];
                        if (str == null) {
                        }
                        if (i6 < i9) {
                            eVar.c0(i6, i9, str2);
                        }
                        eVar.d0(str);
                        i6 = i9 + 1;
                    } else {
                        if (charAt == 8232) {
                            str = "\\u2028";
                        } else if (charAt == 8233) {
                            str = "\\u2029";
                        }
                        if (i6 < i9) {
                        }
                        eVar.d0(str);
                        i6 = i9 + 1;
                    }
                }
                if (i6 < length) {
                    eVar.c0(i6, length, str2);
                }
                eVar.X(34);
                eVar.z();
                hVarArr[i] = eVar.B(eVar.f41953u);
            }
            return new l(27, (String[]) strArr.clone(), y8.b.e(hVarArr));
        } catch (IOException e9) {
            throw new AssertionError(e9);
        }
    }

    public static final l I(C3506lI c3506lI) {
        WC zf;
        boolean z3;
        if (c3506lI == null || c3506lI.C() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
        ArrayList arrayList = new ArrayList(c3506lI.C());
        for (C3452kI c3452kI : c3506lI.B()) {
            int C8 = c3452kI.C();
            try {
                C4097wG R8 = R(c3452kI);
                C3290hG c3290hG = C3290hG.f30754b;
                CG cg = (CG) c3290hG.f30755a.get();
                cg.getClass();
                zf = !cg.f24085b.containsKey(new AG(C4097wG.class, R8.f34819b)) ? new ZF(R8) : c3290hG.e(R8);
                z3 = false;
            } catch (GeneralSecurityException e9) {
                if (GF.f24960a.f33077a.get()) {
                    throw e9;
                }
                zf = new ZF(R(c3452kI));
                z3 = true;
            }
            if (GF.f24960a.f33077a.get() && !S(c3452kI.G())) {
                throw new GeneralSecurityException("Parsing of a single key failed (wrong status) and Tink is configured via validateKeysetsOnParsing to reject such keysets.");
            }
            arrayList.add(new C3664oE(zf, c3452kI.G(), C8, C8 == c3506lI.A(), z3));
        }
        return new l(new HashMap(), Collections.unmodifiableList(arrayList));
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0117 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final l P(AbstractC3825rE abstractC3825rE) {
        int i;
        int i6;
        boolean z3;
        com.bumptech.glide.manager.p pVar = new com.bumptech.glide.manager.p(10);
        C3610nE c3610nE = new C3610nE(abstractC3825rE);
        V2 v22 = V2.f28064A;
        c3610nE.f32712c = v22;
        c3610nE.f32710a = true;
        ArrayList arrayList = (ArrayList) pVar.f23470v;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C3610nE) it.next()).f32710a = false;
        }
        arrayList.add(c3610nE);
        if (pVar.f23469u) {
            throw new GeneralSecurityException("KeysetHandle.Builder#build must only be called once");
        }
        pVar.f23469u = true;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int i9 = 0;
        while (i9 < arrayList.size() - 1) {
            int i10 = i9 + 1;
            if (((C3610nE) arrayList.get(i9)).f32712c == v22 && ((C3610nE) arrayList.get(i10)).f32712c != v22) {
                throw new GeneralSecurityException("Entries with 'withRandomId()' may only be followed by other entries with 'withRandomId()'.");
            }
            i9 = i10;
        }
        HashSet hashSet = new HashSet();
        Iterator it2 = arrayList.iterator();
        Integer num = null;
        while (it2.hasNext()) {
            C3610nE c3610nE2 = (C3610nE) it2.next();
            c3610nE2.getClass();
            V2 v23 = c3610nE2.f32712c;
            if (v23 == null) {
                throw new GeneralSecurityException("No ID was set (with withFixedId or withRandomId)");
            }
            int i11 = 3;
            if (v23 == v22) {
                int i12 = 0;
                while (true) {
                    if (i12 != 0 && !hashSet.contains(Integer.valueOf(i12))) {
                        break;
                    }
                    int i13 = DG.f24377a;
                    i12 = 0;
                    while (i12 == 0) {
                        byte[] a9 = AbstractC4205yG.a(4);
                        i12 = (a9[3] & 255) | ((a9[0] & 255) << 24) | ((a9[1] & 255) << 16) | ((a9[2] & 255) << 8);
                    }
                }
                i = i12;
            } else {
                i = 0;
            }
            Integer valueOf = Integer.valueOf(i);
            if (hashSet.contains(valueOf)) {
                int i14 = i;
                throw new GeneralSecurityException(u1.h.d(i14, "Id ", " is used twice in the keyset", new StringBuilder(String.valueOf(i14).length() + 31)));
            }
            hashSet.add(valueOf);
            AbstractC3825rE abstractC3825rE2 = c3610nE2.f32711b;
            WC b9 = C3021cG.f29439b.b(abstractC3825rE2, true != abstractC3825rE2.a() ? null : valueOf);
            Object obj = C3556mE.f31925v;
            if (!obj.equals(obj)) {
                if (C3556mE.f31926w.equals(obj)) {
                    i6 = 4;
                    z3 = c3610nE2.f32710a;
                    C3664oE c3664oE = new C3664oE(b9, i6, i, z3, false);
                    if (z3) {
                        if (num != null) {
                            throw new GeneralSecurityException("Two primaries were set");
                        }
                        num = valueOf;
                    }
                    arrayList2.add(c3664oE);
                } else {
                    if (!C3556mE.f31927x.equals(obj)) {
                        throw new IllegalStateException("Unknown key status");
                    }
                    i11 = 5;
                }
            }
            i6 = i11;
            z3 = c3610nE2.f32710a;
            C3664oE c3664oE2 = new C3664oE(b9, i6, i, z3, false);
            if (z3) {
            }
            arrayList2.add(c3664oE2);
        }
        if (num == null) {
            throw new GeneralSecurityException("No primary was set");
        }
        HashMap hashMap = (HashMap) pVar.f23471w;
        l lVar = new l(hashMap, arrayList2);
        if (hashMap.get(AbstractC2968bG.class) == null) {
            return lVar;
        }
        throw new ClassCastException();
    }

    public static C4097wG R(C3452kI c3452kI) {
        return C4097wG.a(c3452kI.B().A(), c3452kI.B().B(), C2921aN.n(c3452kI.B().G()), C2921aN.p(c3452kI.H()), c3452kI.H() == 5 ? null : Integer.valueOf(c3452kI.C()));
    }

    public static boolean S(int i) {
        int i6 = i - 2;
        return i6 == 1 || i6 == 2 || i6 == 3;
    }

    public synchronized List C(String str) {
        List list;
        if (!((ArrayList) this.f2797u).contains(str)) {
            ((ArrayList) this.f2797u).add(str);
        }
        list = (List) ((HashMap) this.f2798v).get(str);
        if (list == null) {
            list = new ArrayList();
            ((HashMap) this.f2798v).put(str, list);
        }
        return list;
    }

    @Override // com.google.android.gms.internal.ads.LP
    public ByteBuffer D(int i) {
        return ((MediaCodec) this.f2797u).getInputBuffer(i);
    }

    public synchronized ArrayList E(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = ((ArrayList) this.f2797u).iterator();
        while (it.hasNext()) {
            List<I1.d> list = (List) ((HashMap) this.f2798v).get((String) it.next());
            if (list != null) {
                for (I1.d dVar : list) {
                    if ((dVar.f1281a.isAssignableFrom(cls) && cls2.isAssignableFrom(dVar.f1282b)) && !arrayList.contains(dVar.f1282b)) {
                        arrayList.add(dVar.f1282b);
                    }
                }
            }
        }
        return arrayList;
    }

    public void G(v vVar) {
        x xVar = vVar.f38258z;
        try {
            ((M6.a) this.f2798v).accept(new S6.c(vVar, xVar));
            if (xVar != null) {
                xVar.close();
            }
        } catch (Throwable th) {
            if (xVar != null) {
                try {
                    xVar.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public void H() {
        try {
            ((FileLock) this.f2798v).release();
            ((FileChannel) this.f2797u).close();
        } catch (IOException e9) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e9);
        }
    }

    public Q0 J(Object... objArr) {
        Constructor c9;
        AtomicBoolean atomicBoolean = (AtomicBoolean) this.f2798v;
        synchronized (atomicBoolean) {
            if (!atomicBoolean.get()) {
                try {
                    c9 = ((M0) this.f2797u).c();
                } catch (ClassNotFoundException unused) {
                    ((AtomicBoolean) this.f2798v).set(true);
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
            if (((Map) this.f2798v) == null) {
                this.f2798v = Collections.unmodifiableMap(new HashMap((HashMap) this.f2797u));
            }
        } catch (Throwable th) {
            throw th;
        }
        return (Map) this.f2798v;
    }

    public void L(C3774qG c3774qG) {
        if (c3774qG == null) {
            throw new NullPointerException("primitive constructor must be non-null");
        }
        C3881sG c3881sG = new C3881sG(c3774qG.f33227a, c3774qG.f33228b);
        HashMap hashMap = (HashMap) this.f2797u;
        if (!hashMap.containsKey(c3881sG)) {
            hashMap.put(c3881sG, c3774qG);
            return;
        }
        C3774qG c3774qG2 = (C3774qG) hashMap.get(c3881sG);
        if (!c3774qG2.equals(c3774qG) || !c3774qG.equals(c3774qG2)) {
            throw new GeneralSecurityException("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: ".concat(c3881sG.toString()));
        }
    }

    public C3506lI M() {
        try {
            C3346iI G7 = C3506lI.G();
            for (C3664oE c3664oE : (List) this.f2797u) {
                WC wc = c3664oE.f32878a;
                int i = c3664oE.f32883f;
                C4097wG c4097wG = (C4097wG) C3290hG.f30754b.f(wc);
                Integer e9 = wc.e();
                int i6 = c3664oE.f32880c;
                if (e9 != null && e9.intValue() != i6) {
                    throw new GeneralSecurityException("Wrong ID set for key with ID requirement");
                }
                C3398jI D8 = C3452kI.D();
                C3077dI C8 = C3130eI.C();
                String str = c4097wG.f34818a;
                C8.h();
                ((C3130eI) C8.f27721u).E(str);
                JK jk = c4097wG.f34820c;
                C8.h();
                ((C3130eI) C8.f27721u).F(jk);
                int i9 = C2921aN.i(c4097wG.f34821d);
                C8.h();
                ((C3130eI) C8.f27721u).H(i9);
                D8.h();
                ((C3452kI) D8.f27721u).E((C3130eI) C8.j());
                D8.h();
                ((C3452kI) D8.f27721u).I(i);
                D8.h();
                ((C3452kI) D8.f27721u).F(i6);
                int q8 = C2921aN.q(c4097wG.f34822e);
                D8.h();
                ((C3452kI) D8.f27721u).J(q8);
                C3452kI c3452kI = (C3452kI) D8.j();
                G7.h();
                ((C3506lI) G7.f27721u).I(c3452kI);
                if (c3664oE.f32881d) {
                    G7.h();
                    ((C3506lI) G7.f27721u).H(i6);
                }
            }
            return (C3506lI) G7.j();
        } catch (GeneralSecurityException e10) {
            throw new B0.c(e10);
        }
    }

    public C3664oE N() {
        for (C3664oE c3664oE : (List) this.f2797u) {
            if (c3664oE != null && c3664oE.f32881d) {
                if (c3664oE.f32879b == C3556mE.f31925v) {
                    return c3664oE;
                }
                throw new IllegalStateException("Keyset has primary which isn't enabled");
            }
        }
        throw new IllegalStateException("Keyset has no valid primary");
    }

    public C3664oE O(int i) {
        List list = (List) this.f2797u;
        if (i < 0 || i >= list.size()) {
            int size = list.size();
            throw new IndexOutOfBoundsException(y.r(new StringBuilder(String.valueOf(i).length() + 34 + String.valueOf(size).length()), "Invalid index ", i, " for keyset of size ", size));
        }
        C3664oE c3664oE = (C3664oE) list.get(i);
        if (!S(c3664oE.f32883f)) {
            throw new IllegalStateException(u1.h.d(i, "Keyset-Entry at position ", " has wrong status", new StringBuilder(String.valueOf(i).length() + 42)));
        }
        if (c3664oE.f32882e) {
            throw new IllegalStateException(u1.h.d(i, "Keyset-Entry at position ", " didn't parse correctly", new StringBuilder(String.valueOf(i).length() + 48)));
        }
        return (C3664oE) list.get(i);
    }

    @Override // o4.InterfaceC4799l
    public void OnCall() {
        ((GzopPuzzleLogicActivity) this.f2798v).startActivity((Intent) this.f2797u);
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
    public Object Q(InterfaceC3448kE interfaceC3448kE, Class cls) {
        C3506lI M8 = M();
        int i = AbstractC4095wE.f34815a;
        int A9 = M8.A();
        int i6 = 0;
        boolean z3 = true;
        int i9 = 0;
        boolean z6 = false;
        for (C3452kI c3452kI : M8.B()) {
            if (c3452kI.G() == 3) {
                if (!c3452kI.A()) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(c3452kI.C())));
                }
                if (c3452kI.H() == 2) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(c3452kI.C())));
                }
                if (c3452kI.G() == 2) {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(c3452kI.C())));
                }
                if (c3452kI.C() == A9) {
                    if (z6) {
                        throw new GeneralSecurityException("keyset contains multiple primary keys");
                    }
                    z6 = true;
                }
                z3 &= c3452kI.B().G() == 5;
                i9++;
            }
        }
        if (i9 == 0) {
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        }
        if (!z6 && !z3) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
        while (true) {
            List list = (List) this.f2797u;
            if (i6 >= list.size()) {
                return interfaceC3448kE.e(this, cls);
            }
            if (((C3664oE) list.get(i6)).f32882e || !S(((C3664oE) list.get(i6)).f32883f)) {
                break;
            }
            i6++;
        }
    }

    @Override // com.google.android.gms.internal.ads.Eu
    public Object a(Object obj) {
        C2800Tp c2800Tp = (C2800Tp) this.f2797u;
        c2800Tp.getClass();
        ContentValues contentValues = new ContentValues();
        C3709p5 c3709p5 = (C3709p5) this.f2798v;
        contentValues.put(com.anythink.expressad.foundation.d.d.f18596u, Long.valueOf(c3709p5.f33029a));
        contentValues.put("gws_query_id", (String) c3709p5.f33031c);
        contentValues.put("url", (String) c3709p5.f33032d);
        contentValues.put("event_state", Integer.valueOf(c3709p5.f33030b - 1));
        ((SQLiteDatabase) obj).insert("offline_buffered_pings", null, contentValues);
        u2.D d2 = C4835j.f39733C.f39738c;
        Context context = c2800Tp.f27796n;
        t b9 = u2.D.b(context);
        if (b9 != null) {
            try {
                b9.zzf(new W2.b(context));
            } catch (RemoteException e9) {
                z.l("Failed to schedule offline ping sender.", e9);
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.LP
    public ByteBuffer b(int i) {
        return ((MediaCodec) this.f2797u).getOutputBuffer(i);
    }

    @Override // com.google.android.gms.internal.ads.VG
    /* renamed from: c */
    public /* synthetic */ InterfaceC3613nH mo14c() {
        C3414jh c3414jh = (C3414jh) this.f2797u;
        c3414jh.getClass();
        InterfaceC3613nH mo14c = ((VG) this.f2798v).mo14c();
        Ux ux = new Ux(14, c3414jh);
        return new C3200fh(c3414jh.f31290n, mo14c, c3414jh.f31284G, c3414jh.f31285H, c3414jh, ux);
    }

    @Override // com.google.android.gms.internal.ads.LP
    public int d() {
        return ((MediaCodec) this.f2797u).dequeueInputBuffer(0L);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2844Wl
    public void e(boolean z3, Context context, C2473Ak c2473Ak) {
        C3267gu c3267gu;
        try {
            C3535lu c3535lu = (C3535lu) ((C3477kq) this.f2797u).f31639b;
            c3535lu.b(z3);
            try {
                c3535lu.f31864a.J();
            } finally {
            }
        } catch (C3267gu e9) {
            int i = z.f41322b;
            v2.i.g("Cannot show rewarded video.", e9);
            throw new C2828Vl(e9.getCause());
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2844Wl
    public St f() {
        return (St) this.f2798v;
    }

    @Override // com.google.android.gms.internal.ads.LP
    public void g(ArrayList arrayList) {
        ((MediaCodec) this.f2797u).subscribeToVendorParameters(arrayList);
    }

    @Override // androidx.emoji2.text.o
    public Object getResult() {
        return (androidx.emoji2.text.x) this.f2797u;
    }

    @Override // com.google.android.gms.internal.ads.LP
    public MediaFormat h() {
        return ((MediaCodec) this.f2797u).getOutputFormat();
    }

    @Override // com.google.android.gms.internal.ads.LP
    public void i(int i, C3834rN c3834rN, long j6, int i6) {
        ((MediaCodec) this.f2797u).queueSecureInputBuffer(i, 0, c3834rN.i, j6, i6);
    }

    @Override // com.google.android.gms.internal.ads.LP
    public void j(Bundle bundle) {
        ((MediaCodec) this.f2797u).setParameters(bundle);
    }

    @Override // com.google.android.gms.internal.ads.LP
    public void k() {
        ((MediaCodec) this.f2797u).flush();
    }

    @Override // com.google.android.gms.internal.ads.LP
    public void l() {
        c cVar = (c) this.f2798v;
        MediaCodec mediaCodec = (MediaCodec) this.f2797u;
        try {
            int i = Build.VERSION.SDK_INT;
            if (i >= 30 && i < 33) {
                mediaCodec.stop();
            }
            if (i >= 35 && cVar != null) {
                cVar.A(mediaCodec);
            }
            mediaCodec.release();
        } catch (Throwable th) {
            if (Build.VERSION.SDK_INT >= 35 && cVar != null) {
                cVar.A(mediaCodec);
            }
            mediaCodec.release();
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.LP
    public void m(Surface surface) {
        ((MediaCodec) this.f2797u).setOutputSurface(surface);
    }

    @Override // com.google.android.gms.internal.ads.KD
    /* renamed from: n */
    public /* synthetic */ void mo11n(Object obj) {
        C3918t c3918t = (C3918t) this.f2798v;
        synchronized (c3918t) {
            c3918t.f34181x = null;
            ((ArrayDeque) c3918t.f34180w).addFirst((C3804qt) this.f2797u);
            if (c3918t.f34177n == 1) {
                c3918t.f();
            }
        }
    }

    @Override // com.anythink.banner.api.ATBannerListener
    public void onBannerAutoRefreshFail(AdError adError) {
        if (o4.m.f39615g == 1) {
            LayoutInflater from = LayoutInflater.from((Context) this.f2797u);
            ViewGroup viewGroup = (ViewGroup) this.f2798v;
            View inflate = from.inflate(C5275R.layout.qureka_nativebanner_layout, viewGroup, false);
            o4.m.d(inflate.findViewById(C5275R.id.playNowLL));
            GifImageView gifImageView = (GifImageView) inflate.findViewById(C5275R.id.iv_round_gif);
            TextView textView = (TextView) inflate.findViewById(C5275R.id.tv_text_ad_name);
            TextView textView2 = (TextView) inflate.findViewById(C5275R.id.tv_text_ad_desc);
            int nextInt = new Random().nextInt(5);
            textView.setText(o4.m.f39606P[nextInt]);
            textView2.setText(o4.m.f39607Q[nextInt]);
            gifImageView.setImageResource(o4.m.f39608R[nextInt]);
            inflate.findViewById(C5275R.id.bannerclick).setOnClickListener(new ViewOnClickListenerC4797j(this, 1));
            viewGroup.removeAllViews();
            viewGroup.addView(inflate);
        }
    }

    @Override // com.anythink.banner.api.ATBannerListener
    public void onBannerFailed(AdError adError) {
        if (o4.m.f39615g == 1) {
            LayoutInflater from = LayoutInflater.from((Context) this.f2797u);
            ViewGroup viewGroup = (ViewGroup) this.f2798v;
            View inflate = from.inflate(C5275R.layout.qureka_nativebanner_layout, viewGroup, false);
            o4.m.d(inflate.findViewById(C5275R.id.playNowLL));
            GifImageView gifImageView = (GifImageView) inflate.findViewById(C5275R.id.iv_round_gif);
            TextView textView = (TextView) inflate.findViewById(C5275R.id.tv_text_ad_name);
            TextView textView2 = (TextView) inflate.findViewById(C5275R.id.tv_text_ad_desc);
            int nextInt = new Random().nextInt(5);
            textView.setText(o4.m.f39606P[nextInt]);
            textView2.setText(o4.m.f39607Q[nextInt]);
            gifImageView.setImageResource(o4.m.f39608R[nextInt]);
            inflate.findViewById(C5275R.id.bannerclick).setOnClickListener(new ViewOnClickListenerC4797j(this, 0));
            viewGroup.removeAllViews();
            viewGroup.addView(inflate);
        }
    }

    @Override // A2.b
    public /* synthetic */ void onNativeAdLoaded(NativeAd nativeAd) {
        ((BinderC2895Zo) this.f2797u).U3(nativeAd, (String) this.f2798v);
    }

    @Override // com.google.android.gms.internal.ads.I0
    public H0 p(K0 k02, long j6) {
        long j9 = k02.f25819w;
        int min = (int) Math.min(20000L, k02.f25818v - j9);
        Cr cr = (Cr) this.f2798v;
        cr.y(min);
        k02.A(cr.f24252a, 0, min, false);
        int i = -1;
        int i6 = -1;
        long j10 = -9223372036854775807L;
        while (cr.B() >= 4) {
            if (C1.d(cr.f24253b, cr.f24252a) != 442) {
                cr.G(1);
            } else {
                cr.G(4);
                long a9 = C4193y4.a(cr);
                if (a9 != com.anythink.basead.exoplayer.b.f6382b) {
                    long c9 = ((Dt) this.f2797u).c(a9);
                    if (c9 > j6) {
                        return j10 == com.anythink.basead.exoplayer.b.f6382b ? new H0(-1, c9, j9) : new H0(0, com.anythink.basead.exoplayer.b.f6382b, j9 + i6);
                    }
                    if (c9 + 100000 > j6) {
                        return new H0(0, com.anythink.basead.exoplayer.b.f6382b, j9 + cr.f24253b);
                    }
                    j10 = c9;
                    i6 = cr.f24253b;
                }
                int i9 = cr.f24254c;
                if (cr.B() >= 10) {
                    cr.G(9);
                    int K7 = cr.K() & 7;
                    if (cr.B() >= K7) {
                        cr.G(K7);
                        if (cr.B() >= 4) {
                            if (C1.d(cr.f24253b, cr.f24252a) == 443) {
                                cr.G(4);
                                int L6 = cr.L();
                                if (cr.B() < L6) {
                                    cr.E(i9);
                                } else {
                                    cr.G(L6);
                                }
                            }
                            while (true) {
                                if (cr.B() < 4) {
                                    break;
                                }
                                int d2 = C1.d(cr.f24253b, cr.f24252a);
                                if (d2 == 442 || d2 == 441 || (d2 >>> 8) != 1) {
                                    break;
                                }
                                cr.G(4);
                                if (cr.B() < 2) {
                                    cr.E(i9);
                                    break;
                                }
                                cr.E(Math.min(cr.f24254c, cr.f24253b + cr.L()));
                            }
                        } else {
                            cr.E(i9);
                        }
                    } else {
                        cr.E(i9);
                    }
                } else {
                    cr.E(i9);
                }
                i = cr.f24253b;
            }
        }
        return j10 != com.anythink.basead.exoplayer.b.f6382b ? new H0(-2, j10, j9 + i) : H0.f25200d;
    }

    @Override // com.google.android.gms.internal.ads.LP
    public void q(int i) {
        ((MediaCodec) this.f2797u).releaseOutputBuffer(i, false);
    }

    @Override // com.google.android.gms.internal.ads.LP
    public void s() {
        ((MediaCodec) this.f2797u).detachOutputSurface();
    }

    @Override // com.google.android.gms.internal.ads.LP
    public int t(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            dequeueOutputBuffer = ((MediaCodec) this.f2797u).dequeueOutputBuffer(bufferInfo, 0L);
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    public String toString() {
        switch (this.f2796n) {
            case 19:
                C3506lI M8 = M();
                int i = AbstractC4095wE.f34815a;
                C3560mI A9 = C3722pI.A();
                int A10 = M8.A();
                A9.h();
                ((C3722pI) A9.f27721u).B(A10);
                for (C3452kI c3452kI : M8.B()) {
                    C3614nI A11 = C3668oI.A();
                    String A12 = c3452kI.B().A();
                    A11.h();
                    ((C3668oI) A11.f27721u).B(A12);
                    int G7 = c3452kI.G();
                    A11.h();
                    ((C3668oI) A11.f27721u).D(G7);
                    int H8 = c3452kI.H();
                    A11.h();
                    ((C3668oI) A11.f27721u).E(H8);
                    int C8 = c3452kI.C();
                    A11.h();
                    ((C3668oI) A11.f27721u).C(C8);
                    C3668oI c3668oI = (C3668oI) A11.j();
                    A9.h();
                    ((C3722pI) A9.f27721u).C(c3668oI);
                }
                return ((C3722pI) A9.j()).toString();
            default:
                return super.toString();
        }
    }

    @Override // com.google.android.gms.internal.ads.LP
    public void u(int i) {
        ((MediaCodec) this.f2797u).setVideoScalingMode(i);
    }

    @Override // androidx.emoji2.text.o
    public boolean v(CharSequence charSequence, int i, int i6, u uVar) {
        if ((uVar.f4805c & 4) > 0) {
            return true;
        }
        if (((androidx.emoji2.text.x) this.f2797u) == null) {
            this.f2797u = new androidx.emoji2.text.x(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
        }
        ((M2.i) this.f2798v).getClass();
        ((androidx.emoji2.text.x) this.f2797u).setSpan(new androidx.emoji2.text.v(uVar), i, i6, 33);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.KD
    public void w(Throwable th) {
        C3918t c3918t = (C3918t) this.f2798v;
        synchronized (c3918t) {
            c3918t.f34181x = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.LP
    public void x(int i, int i6, int i9, long j6) {
        ((MediaCodec) this.f2797u).queueInputBuffer(i, 0, i6, j6, i9);
    }

    @Override // com.google.android.gms.internal.ads.LP
    public void y(int i, long j6) {
        ((MediaCodec) this.f2797u).releaseOutputBuffer(i, j6);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2708Oh
    public /* synthetic */ void z(String str, int i, String str2, boolean z3) {
        C2696Nm c2696Nm = (C2696Nm) this.f2797u;
        c2696Nm.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("messageType", "validatorHtmlLoaded");
        hashMap.put("id", (String) ((Map) this.f2798v).get("id"));
        c2696Nm.f26533b.d(hashMap);
    }

    public /* synthetic */ l(Object obj, Object obj2, int i, boolean z3) {
        this.f2796n = i;
        this.f2798v = obj;
        this.f2797u = obj2;
    }

    @Override // com.google.android.gms.internal.ads.I0
    /* renamed from: f, reason: collision with other method in class */
    public void mo2f() {
        byte[] bArr = AbstractC3159eu.f29994b;
        int length = bArr.length;
        ((Cr) this.f2798v).z(0, bArr);
    }

    public l(MediaCodec mediaCodec, c cVar) {
        boolean addMediaCodec;
        this.f2796n = 24;
        this.f2797u = mediaCodec;
        this.f2798v = cVar;
        if (Build.VERSION.SDK_INT < 35 || cVar == null) {
            return;
        }
        LoudnessCodecController loudnessCodecController = (LoudnessCodecController) cVar.f2776v;
        if (loudnessCodecController != null) {
            addMediaCodec = loudnessCodecController.addMediaCodec(mediaCodec);
            if (!addMediaCodec) {
                return;
            }
        }
        AbstractC2772Sd.H(((HashSet) cVar.f2775u).add(mediaCodec));
    }

    public l(IBinder iBinder) {
        this.f2796n = 3;
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if (Objects.equals(interfaceDescriptor, "android.os.IMessenger")) {
            this.f2797u = new Messenger(iBinder);
            this.f2798v = null;
        } else if (Objects.equals(interfaceDescriptor, "com.google.android.gms.iid.IMessengerCompat")) {
            this.f2798v = new L2.g(iBinder);
            this.f2797u = null;
        } else {
            Log.w("MessengerIpcClient", "Invalid interface descriptor: ".concat(String.valueOf(interfaceDescriptor)));
            throw new RemoteException();
        }
    }

    public l(C3918t c3918t, C3804qt c3804qt) {
        this.f2796n = 16;
        this.f2797u = c3804qt;
        Objects.requireNonNull(c3918t);
        this.f2798v = c3918t;
    }

    public l(M0 m0) {
        this.f2796n = 7;
        this.f2797u = m0;
        this.f2798v = new AtomicBoolean(false);
    }

    public l(C3785qa c3785qa) {
        this.f2796n = 9;
        this.f2798v = c3785qa;
        this.f2797u = new HashMap();
    }

    public l(C2996br c2996br, C3477kq c3477kq, St st) {
        this.f2796n = 15;
        this.f2797u = c3477kq;
        this.f2798v = st;
        Objects.requireNonNull(c2996br);
    }

    public /* synthetic */ l(Dt dt) {
        this.f2796n = 8;
        this.f2797u = dt;
        this.f2798v = new Cr();
    }

    public l(C3500lC c3500lC, int[] iArr) {
        this.f2796n = 18;
        this.f2797u = RB.n(c3500lC);
        this.f2798v = iArr;
    }

    public l(HashMap hashMap, List list) {
        this.f2796n = 19;
        this.f2797u = list;
        this.f2798v = hashMap;
        if (GF.f24960a.f33077a.get()) {
            HashSet hashSet = new HashSet();
            Iterator it = list.iterator();
            boolean z3 = false;
            while (it.hasNext()) {
                C3664oE c3664oE = (C3664oE) it.next();
                boolean contains = hashSet.contains(Integer.valueOf(c3664oE.f32880c));
                int i = c3664oE.f32880c;
                if (!contains) {
                    hashSet.add(Integer.valueOf(i));
                    z3 |= c3664oE.f32881d;
                } else {
                    throw new GeneralSecurityException(u1.h.d(i, "KeyID ", " is duplicated in the keyset, and Tink is configured to reject such keysets with the flag validateKeysetsOnParsing.", new StringBuilder(String.valueOf(i).length() + 121)));
                }
            }
            if (!z3) {
                throw new GeneralSecurityException("Primary key id not found in keyset, and Tink is configured to reject such keysets with the flag validateKeysetsOnParsing.");
            }
        }
    }

    @Override // com.anythink.banner.api.ATBannerListener
    public void onBannerLoaded() {
    }

    public /* synthetic */ l(C3935tG c3935tG) {
        this.f2796n = 20;
        this.f2797u = new HashMap(c3935tG.f34257a);
        this.f2798v = new HashMap(c3935tG.f34258b);
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
        this.f2796n = i;
        switch (i) {
            case 20:
                this.f2797u = new HashMap();
                this.f2798v = new HashMap();
                break;
            case 21:
                this.f2797u = new HashMap();
                break;
            case 22:
                break;
            default:
                this.f2797u = new ArrayList();
                this.f2798v = new HashMap();
                break;
        }
    }

    public l(WorkDatabase_Impl workDatabase_Impl) {
        this.f2796n = 0;
        this.f2797u = workDatabase_Impl;
        this.f2798v = new b(workDatabase_Impl, 3);
    }

    public l(O6.a aVar) {
        this.f2796n = 4;
        this.f2797u = aVar;
    }
}
