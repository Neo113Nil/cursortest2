package com.google.android.gms.internal.ads;

import R2.InterfaceC0376b;
import android.content.Context;
import android.os.Handler;
import android.os.IBinder;
import android.os.RemoteException;
import com.anythink.expressad.advanced.js.NativeAdvancedJsUtils;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import java.lang.reflect.InvocationTargetException;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.spec.ECPoint;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import r2.C4906k;
import s2.AbstractBinderC4924c0;
import s2.InterfaceC4926d0;
import x2.C5189a;

/* renamed from: com.google.android.gms.internal.ads.ku, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3504ku implements InterfaceC3456k, B4, InterfaceC0376b, InterfaceC3544lg, InterfaceC3765pl, InterfaceC2728Oh, InterfaceC2883Xl, InterfaceC4049v, InterfaceC3068cn {

    /* renamed from: x, reason: collision with root package name */
    public static C3504ku f32443x;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f32444n;

    /* renamed from: u, reason: collision with root package name */
    public Object f32445u;

    /* renamed from: v, reason: collision with root package name */
    public Object f32446v;

    /* renamed from: w, reason: collision with root package name */
    public Object f32447w;

    public /* synthetic */ C3504ku(int i, Object obj, Object obj2) {
        this.f32444n = i;
        this.f32445u = obj;
        this.f32446v = obj2;
    }

    public static C3504ku d(Context context) {
        synchronized (C3504ku.class) {
            try {
                C3504ku c3504ku = f32443x;
                if (c3504ku != null) {
                    return c3504ku;
                }
                Context applicationContext = context.getApplicationContext();
                long longValue = ((Long) AbstractC2755Qa.f27818b.r()).longValue();
                InterfaceC4926d0 interfaceC4926d0 = null;
                if (longValue > 0 && longValue <= 262180000) {
                    try {
                        interfaceC4926d0 = AbstractBinderC4924c0.asInterface((IBinder) applicationContext.getClassLoader().loadClass("com.google.android.gms.ads.internal.client.LiteSdkInfo").getConstructor(Context.class).newInstance(applicationContext));
                    } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e9) {
                        int i = w2.z.f41712b;
                        x2.i.d("Failed to retrieve lite SDK info.", e9);
                    }
                }
                C3504ku c3504ku2 = new C3504ku(applicationContext, interfaceC4926d0);
                f32443x = c3504ku2;
                return c3504ku2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void i(S0.s sVar, C3504ku c3504ku) {
        long[] jArr = (long[]) c3504ku.f32445u;
        C3504ku c3504ku2 = (C3504ku) sVar.f2969u;
        long[] jArr2 = (long[]) c3504ku2.f32445u;
        long[] jArr3 = (long[]) sVar.f2970v;
        AbstractC2991bG.I(jArr, jArr2, jArr3);
        long[] jArr4 = (long[]) c3504ku.f32446v;
        long[] jArr5 = (long[]) c3504ku2.f32446v;
        long[] jArr6 = (long[]) c3504ku2.f32447w;
        AbstractC2991bG.I(jArr4, jArr5, jArr6);
        AbstractC2991bG.I((long[]) c3504ku.f32447w, jArr6, jArr3);
    }

    public void A() {
        try {
            ((BinderC2600Gp) ((InterfaceC3158eN) this.f32445u).f()).s0(((C5189a) this.f32446v).f41845n);
            if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.Hf)).booleanValue()) {
                S0.e a9 = ((C3230fo) this.f32447w).a();
                a9.M(NativeAdvancedJsUtils.f18693p, "ptard");
                a9.M("ptard", "l");
                a9.N();
            }
        } catch (RemoteException | NullPointerException e9) {
            if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.If)).booleanValue()) {
                C4906k.f40186C.f40196h.d("Preconnect Local", e9);
            }
        }
    }

    public void B(C3995u c3995u) {
        IO io = (IO) ((HashMap) this.f32445u).remove(c3995u);
        io.getClass();
        AN an = (AN) ((BN) this.f32447w).f24664n.get(io);
        if (an != null) {
            synchronized (an) {
                an.f24449d--;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2728Oh
    public void C(String str, int i, String str2, boolean z6) {
        C3390in c3390in = (C3390in) this.f32445u;
        c3390in.getClass();
        boolean booleanValue = ((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f32863N4)).booleanValue();
        Z8 z82 = (Z8) this.f32447w;
        C3075cu c3075cu = c3390in.f31887a;
        InterfaceC4084vh interfaceC4084vh = (InterfaceC4084vh) this.f32446v;
        if (!booleanValue) {
            s2.Z0 z02 = c3075cu.f30390a;
            if (z02 != null && interfaceC4084vh.g() != null) {
                interfaceC4084vh.g().V3(z02);
            }
            z82.d();
            return;
        }
        if (z6) {
            s2.Z0 z03 = c3075cu.f30390a;
            if (z03 != null && interfaceC4084vh.g() != null) {
                interfaceC4084vh.g().V3(z03);
            }
            z82.d();
            return;
        }
        int length = String.valueOf(i).length();
        StringBuilder sb = new StringBuilder(length + 64 + String.valueOf(str).length() + 15 + String.valueOf(str2).length());
        sb.append("Native Video WebView failed to load. Error code: ");
        sb.append(i);
        sb.append(", Description: ");
        sb.append(str);
        z82.c(new Zq(1, Wv.i(sb, ", Failing URL: ", str2)));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3765pl, com.google.android.gms.internal.ads.InterfaceC3606mo
    /* renamed from: a */
    public /* synthetic */ void mo5a(Object obj) {
        switch (this.f32444n) {
            case 8:
                ((InterfaceC4033uk) obj).t((BinderC2844Ve) this.f32445u, (String) this.f32446v, (String) this.f32447w);
                break;
            default:
                ((InterfaceC4022uQ) obj).p(0, ((AP) this.f32445u).f24455a, (C3429jQ) this.f32446v, (C3699oQ) this.f32447w);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.B4
    public void b(Dt dt, S0 s02, F4 f42) {
        this.f32446v = dt;
        f42.a();
        f42.b();
        InterfaceC3566m1 C8 = s02.C(f42.f25501d, 5);
        this.f32447w = C8;
        C8.e((DP) this.f32445u);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4049v
    public synchronized C3995u c() {
        C3995u c9;
        BN bn = (BN) this.f32447w;
        C4265z c4265z = bn.f24654c;
        HashMap hashMap = (HashMap) this.f32445u;
        c9 = c4265z.c();
        IO io = (IO) this.f32446v;
        hashMap.put(c9, io);
        AN an = (AN) bn.f24664n.get(io);
        if (an != null) {
            synchronized (an) {
                an.f24449d++;
            }
        }
        return c9;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2883Xl
    public void e(boolean z6, Context context, C2493Ak c2493Ak) {
        try {
            c4.e eVar = C4906k.f40186C.f40190b;
            c4.e.q(context, (AdOverlayInfoParcel) ((C3490kg) this.f32445u).f32256n.get(), true, (C3230fo) ((C2550Dq) this.f32447w).f25232f);
        } catch (Exception unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2883Xl
    public St f() {
        return (St) this.f32446v;
    }

    @Override // com.google.android.gms.internal.ads.B4
    public void g(Cr cr) {
        long a9;
        long j6;
        ((Dt) this.f32446v).getClass();
        String str = AbstractC3182eu.f30782a;
        Dt dt = (Dt) this.f32446v;
        synchronized (dt) {
            try {
                long j9 = dt.f25248c;
                a9 = j9 != com.anythink.basead.exoplayer.b.f7168b ? j9 + dt.f25247b : dt.a();
            } finally {
            }
        }
        Dt dt2 = (Dt) this.f32446v;
        synchronized (dt2) {
            j6 = dt2.f25247b;
        }
        if (a9 == com.anythink.basead.exoplayer.b.f7168b || j6 == com.anythink.basead.exoplayer.b.f7168b) {
            return;
        }
        DP dp = (DP) this.f32445u;
        if (j6 != dp.f25181t) {
            C3322hP c3322hP = new C3322hP(dp);
            c3322hP.f31563s = j6;
            DP dp2 = new DP(c3322hP);
            this.f32445u = dp2;
            ((InterfaceC3566m1) this.f32447w).e(dp2);
        }
        int B3 = cr.B();
        ((InterfaceC3566m1) this.f32447w).a(B3, cr);
        ((InterfaceC3566m1) this.f32447w).c(a9, 1, B3, 0, null);
    }

    public void h(int i) {
        if (i != 16 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i * 8)));
        }
        this.f32445u = Integer.valueOf(i);
    }

    public void j(S0 s02, F4 f42) {
        int i = 0;
        while (true) {
            InterfaceC3566m1[] interfaceC3566m1Arr = (InterfaceC3566m1[]) this.f32446v;
            if (i >= interfaceC3566m1Arr.length) {
                return;
            }
            f42.a();
            f42.b();
            InterfaceC3566m1 C8 = s02.C(f42.f25501d, 3);
            DP dp = (DP) ((List) this.f32445u).get(i);
            String str = dp.f25176o;
            boolean z6 = true;
            if (!com.anythink.basead.exoplayer.k.o.f9227W.equals(str) && !com.anythink.basead.exoplayer.k.o.f9228X.equals(str)) {
                z6 = false;
            }
            AbstractC2792Sd.C(z6, "Invalid closed caption MIME type provided: %s", str);
            C3322hP c3322hP = new C3322hP();
            f42.b();
            c3322hP.f31546a = f42.f25502e;
            c3322hP.d("video/mp2t");
            c3322hP.e(str);
            c3322hP.f31550e = dp.f25167e;
            c3322hP.f31549d = dp.f25166d;
            c3322hP.f31543M = dp.f25159N;
            c3322hP.f31561q = dp.f25179r;
            C8.e(new DP(c3322hP));
            interfaceC3566m1Arr[i] = C8;
            i++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void k(Ut ut, St st, int i, C3554lq c3554lq, long j6) {
        String str;
        S0.e a9 = ((C3230fo) this.f32447w).a();
        a9.M("gqi", ut.f28801b);
        a9.I(st);
        a9.M(NativeAdvancedJsUtils.f18693p, "adapter_status");
        a9.M("adapter_l", String.valueOf(j6));
        a9.M(com.anythink.expressad.f.a.b.bI, Integer.toString(i));
        C2751Pn c2751Pn = null;
        if (c3554lq != null) {
            a9.M("arec", Integer.toString(c3554lq.f32639u.f40512n));
            String message = c3554lq.getMessage();
            Pattern pattern = ((C3450ju) this.f32445u).f32123a;
            if (pattern != null && message != null) {
                Matcher matcher = pattern.matcher(message);
                if (matcher.find()) {
                    str = matcher.group();
                    if (str != null) {
                        a9.M("areec", str);
                    }
                }
            }
            str = null;
            if (str != null) {
            }
        }
        Iterator it = st.f28425t.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C2751Pn b9 = ((C2768Qn) this.f32446v).b((String) it.next());
            if (b9 != null) {
                c2751Pn = b9;
                break;
            }
        }
        if (c2751Pn != null) {
            a9.M("ancn", c2751Pn.f27648a);
            C2826Ud c2826Ud = c2751Pn.f27649b;
            if (c2826Ud != null) {
                a9.M("adapter_v", c2826Ud.toString());
            }
            C2826Ud c2826Ud2 = c2751Pn.f27650c;
            if (c2826Ud2 != null) {
                a9.M("adapter_sv", c2826Ud2.toString());
            }
        }
        a9.N();
    }

    public void l(int i) {
        if (i < 10 || i > 16) {
            throw new GeneralSecurityException(D.x.k(i, "Invalid tag size for AesCmacParameters: ", new StringBuilder(String.valueOf(i).length() + 40)));
        }
        this.f32446v = Integer.valueOf(i);
    }

    public void m(long j6, Cr cr) {
        if (cr.B() < 9) {
            return;
        }
        int b9 = cr.b();
        int b10 = cr.b();
        int K7 = cr.K();
        if (b9 == 434 && b10 == 1195456820 && K7 == 3) {
            ((C2749Pl) this.f32447w).k(j6, cr);
        }
    }

    public byte[] n() {
        long[] jArr = new long[10];
        long[] jArr2 = new long[10];
        long[] jArr3 = new long[10];
        long[] jArr4 = new long[10];
        long[] jArr5 = new long[10];
        long[] jArr6 = new long[10];
        long[] jArr7 = new long[10];
        long[] jArr8 = new long[10];
        long[] jArr9 = new long[10];
        long[] jArr10 = new long[10];
        long[] jArr11 = new long[10];
        long[] jArr12 = new long[10];
        long[] jArr13 = new long[10];
        long[] jArr14 = (long[]) this.f32447w;
        AbstractC2991bG.L(jArr4, jArr14);
        AbstractC2991bG.L(jArr13, jArr4);
        AbstractC2991bG.L(jArr12, jArr13);
        AbstractC2991bG.I(jArr5, jArr12, jArr14);
        AbstractC2991bG.I(jArr6, jArr5, jArr4);
        AbstractC2991bG.L(jArr12, jArr6);
        AbstractC2991bG.I(jArr7, jArr12, jArr5);
        AbstractC2991bG.L(jArr12, jArr7);
        AbstractC2991bG.L(jArr13, jArr12);
        AbstractC2991bG.L(jArr12, jArr13);
        AbstractC2991bG.L(jArr13, jArr12);
        AbstractC2991bG.L(jArr12, jArr13);
        AbstractC2991bG.I(jArr8, jArr12, jArr7);
        AbstractC2991bG.L(jArr12, jArr8);
        AbstractC2991bG.L(jArr13, jArr12);
        for (int i = 2; i < 10; i += 2) {
            AbstractC2991bG.L(jArr12, jArr13);
            AbstractC2991bG.L(jArr13, jArr12);
        }
        AbstractC2991bG.I(jArr9, jArr13, jArr8);
        AbstractC2991bG.L(jArr12, jArr9);
        AbstractC2991bG.L(jArr13, jArr12);
        for (int i4 = 2; i4 < 20; i4 += 2) {
            AbstractC2991bG.L(jArr12, jArr13);
            AbstractC2991bG.L(jArr13, jArr12);
        }
        AbstractC2991bG.I(jArr12, jArr13, jArr9);
        AbstractC2991bG.L(jArr13, jArr12);
        AbstractC2991bG.L(jArr12, jArr13);
        for (int i6 = 2; i6 < 10; i6 += 2) {
            AbstractC2991bG.L(jArr13, jArr12);
            AbstractC2991bG.L(jArr12, jArr13);
        }
        AbstractC2991bG.I(jArr10, jArr12, jArr8);
        AbstractC2991bG.L(jArr12, jArr10);
        AbstractC2991bG.L(jArr13, jArr12);
        for (int i9 = 2; i9 < 50; i9 += 2) {
            AbstractC2991bG.L(jArr12, jArr13);
            AbstractC2991bG.L(jArr13, jArr12);
        }
        AbstractC2991bG.I(jArr11, jArr13, jArr10);
        AbstractC2991bG.L(jArr13, jArr11);
        AbstractC2991bG.L(jArr12, jArr13);
        for (int i10 = 2; i10 < 100; i10 += 2) {
            AbstractC2991bG.L(jArr13, jArr12);
            AbstractC2991bG.L(jArr12, jArr13);
        }
        AbstractC2991bG.I(jArr13, jArr12, jArr11);
        AbstractC2991bG.L(jArr12, jArr13);
        AbstractC2991bG.L(jArr13, jArr12);
        for (int i11 = 2; i11 < 50; i11 += 2) {
            AbstractC2991bG.L(jArr12, jArr13);
            AbstractC2991bG.L(jArr13, jArr12);
        }
        AbstractC2991bG.I(jArr12, jArr13, jArr10);
        AbstractC2991bG.L(jArr13, jArr12);
        AbstractC2991bG.L(jArr12, jArr13);
        AbstractC2991bG.L(jArr13, jArr12);
        AbstractC2991bG.L(jArr12, jArr13);
        AbstractC2991bG.L(jArr13, jArr12);
        AbstractC2991bG.I(jArr, jArr13, jArr6);
        AbstractC2991bG.I(jArr2, (long[]) this.f32445u, jArr);
        AbstractC2991bG.I(jArr3, (long[]) this.f32446v, jArr);
        byte[] O8 = AbstractC2991bG.O(jArr3);
        O8[31] = (byte) (((AbstractC2991bG.O(jArr2)[0] & 1) << 7) ^ O8[31]);
        return O8;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4049v
    public synchronized void o() {
        ((BN) this.f32447w).f24654c.o();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4049v
    public synchronized void p(C3995u c3995u) {
        ((BN) this.f32447w).f24654c.p(c3995u);
        B(c3995u);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4049v
    public synchronized void q(G2 g22) {
        ((BN) this.f32447w).f24654c.q(g22);
        while (g22 != null) {
            C3995u c3995u = (C3995u) g22.f25699v;
            c3995u.getClass();
            B(c3995u);
            g22 = (G2) g22.f25700w;
            if (g22 == null || ((C3995u) g22.f25699v) == null) {
                g22 = null;
            }
        }
    }

    public Ut r() {
        return (Ut) ((Yt) this.f32445u).f29533b.f25831v;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void s(InterfaceC3595md interfaceC3595md) {
        InterfaceC3595md adapterCreator;
        boolean booleanValue = ((Boolean) AbstractC2755Qa.f27817a.r()).booleanValue();
        AtomicReference atomicReference = (AtomicReference) this.f32447w;
        if (!booleanValue) {
            while (!atomicReference.compareAndSet(null, interfaceC3595md) && atomicReference.get() == null) {
            }
            return;
        }
        InterfaceC4926d0 interfaceC4926d0 = (InterfaceC4926d0) this.f32446v;
        if (interfaceC4926d0 != null) {
            try {
                adapterCreator = interfaceC4926d0.getAdapterCreator();
            } catch (RemoteException unused) {
            }
            if (adapterCreator == null) {
                adapterCreator = interfaceC3595md;
            }
            while (!atomicReference.compareAndSet(null, adapterCreator) && atomicReference.get() == null) {
            }
            return;
        }
        adapterCreator = null;
        if (adapterCreator == null) {
        }
        while (!atomicReference.compareAndSet(null, adapterCreator)) {
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3456k
    public C3523lC t(int i, A8 a82, int[] iArr) {
        PB pb = RB.f27933u;
        MA.q(4, "initialCapacity");
        Object[] objArr = new Object[4];
        int i4 = 0;
        int i6 = 0;
        while (i4 < a82.f24415a) {
            int i9 = i;
            A8 a83 = a82;
            C3402j c3402j = new C3402j(i9, a83, i4, (C3350i) this.f32445u, iArr[i4], (String) this.f32446v, (String) this.f32447w);
            int length = objArr.length;
            int i10 = i6 + 1;
            int d9 = MB.d(length, i10);
            if (d9 > length) {
                objArr = Arrays.copyOf(objArr, d9);
            }
            objArr[i6] = c3402j;
            i4++;
            i6 = i10;
            i = i9;
            a82 = a83;
        }
        return RB.p(objArr, i6);
    }

    public String toString() {
        switch (this.f32444n) {
            case 18:
                StringBuilder sb = new StringBuilder(32);
                sb.append((String) this.f32445u);
                sb.append('{');
                S0.e eVar = (S0.e) ((S0.e) this.f32446v).f2909v;
                String str = "";
                while (eVar != null) {
                    Object obj = eVar.f2908u;
                    sb.append(str);
                    if (obj == null || !obj.getClass().isArray()) {
                        sb.append(obj);
                    } else {
                        sb.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r2.length() - 1);
                    }
                    eVar = (S0.e) eVar.f2909v;
                    str = ", ";
                }
                sb.append('}');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public KE u() {
        C3128du c3128du;
        C3263gK b9;
        NE ne = (NE) this.f32445u;
        if (ne == null || (c3128du = (C3128du) this.f32446v) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (ne.f27260a != ((C3263gK) c3128du.f30647u).f31325a.length) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (ne.a() && ((Integer) this.f32447w) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!((NE) this.f32445u).a() && ((Integer) this.f32447w) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        C3956tE c3956tE = ((NE) this.f32445u).f27261b;
        if (c3956tE == C3956tE.f35022k) {
            b9 = AbstractC3367iG.f31791a;
        } else if (c3956tE == C3956tE.f35021j) {
            b9 = AbstractC3367iG.a(((Integer) this.f32447w).intValue());
        } else {
            if (c3956tE != C3956tE.i) {
                throw new IllegalStateException("Unknown AesGcmParameters.Variant: ".concat(String.valueOf(((NE) this.f32445u).f27261b)));
            }
            b9 = AbstractC3367iG.b(((Integer) this.f32447w).intValue());
        }
        return new KE((NE) this.f32445u, (C3128du) this.f32446v, b9, (Integer) this.f32447w);
    }

    public GG v() {
        Integer num = (Integer) this.f32445u;
        if (num == null) {
            throw new GeneralSecurityException("key size not set");
        }
        if (((Integer) this.f32446v) != null) {
            return new GG(num.intValue(), ((Integer) this.f32446v).intValue(), (C3956tE) this.f32447w);
        }
        throw new GeneralSecurityException("tag size not set");
    }

    public C3047cJ w() {
        C3263gK a9;
        ZI zi = (ZI) this.f32445u;
        if (zi == null) {
            throw new GeneralSecurityException("Cannot build without parameters");
        }
        ECPoint eCPoint = (ECPoint) this.f32446v;
        if (eCPoint == null) {
            throw new GeneralSecurityException("Cannot build without public point");
        }
        MF.a(eCPoint, zi.f29647b.f29445b.getCurve());
        if (((ZI) this.f32445u).a() && ((Integer) this.f32447w) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!((ZI) this.f32445u).a() && ((Integer) this.f32447w) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        C3956tE c3956tE = ((ZI) this.f32445u).f29649d;
        if (c3956tE == C3956tE.f35036y) {
            a9 = AbstractC3367iG.f31791a;
        } else if (c3956tE == C3956tE.f35035x || c3956tE == C3956tE.f35034w) {
            a9 = AbstractC3367iG.a(((Integer) this.f32447w).intValue());
        } else {
            if (c3956tE != C3956tE.f35033v) {
                throw new IllegalStateException("Unknown EcdsaParameters.Variant: ".concat(((ZI) this.f32445u).f29649d.f35038b));
            }
            a9 = AbstractC3367iG.b(((Integer) this.f32447w).intValue());
        }
        return new C3047cJ((ZI) this.f32445u, (ECPoint) this.f32446v, a9, (Integer) this.f32447w);
    }

    public C4123wJ x() {
        C3263gK a9;
        if (((C4015uJ) this.f32445u) == null) {
            throw new GeneralSecurityException("Cannot build without parameters");
        }
        BigInteger bigInteger = (BigInteger) this.f32446v;
        if (bigInteger == null) {
            throw new GeneralSecurityException("Cannot build without modulus");
        }
        int bitLength = bigInteger.bitLength();
        C4015uJ c4015uJ = (C4015uJ) this.f32445u;
        int i = c4015uJ.f35285a;
        if (bitLength != i) {
            throw new GeneralSecurityException(D.x.o(new StringBuilder(String.valueOf(bitLength).length() + 56 + String.valueOf(i).length()), "Got modulus size ", bitLength, ", but parameters requires modulus size ", i));
        }
        if (c4015uJ.a() && ((Integer) this.f32447w) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!((C4015uJ) this.f32445u).a() && ((Integer) this.f32447w) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        C3902sE c3902sE = ((C4015uJ) this.f32445u).f35287c;
        if (c3902sE == C3902sE.f34694u) {
            a9 = AbstractC3367iG.f31791a;
        } else if (c3902sE == C3902sE.f34693t || c3902sE == C3902sE.f34692s) {
            a9 = AbstractC3367iG.a(((Integer) this.f32447w).intValue());
        } else {
            if (c3902sE != C3902sE.f34691r) {
                throw new IllegalStateException("Unknown RsaSsaPssParameters.Variant: ".concat(String.valueOf(((C4015uJ) this.f32445u).f35287c)));
            }
            a9 = AbstractC3367iG.b(((Integer) this.f32447w).intValue());
        }
        return new C4123wJ((C4015uJ) this.f32445u, (BigInteger) this.f32446v, a9, (Integer) this.f32447w);
    }

    public C4151wu y() {
        C3075cu f2 = ((InterfaceC3656nk) this.f32446v).f();
        C3989tu c3989tu = (C3989tu) ((C4297ze) this.f32445u).f36134v;
        C2810Te a9 = new C2793Se(c3989tu.f35192n).a();
        return new C4151wu(f2.f30393d, f2.f30396g, a9.f28541j, c3989tu.f35198z, f2.f30399k);
    }

    @Override // R2.InterfaceC0376b
    public void z() {
        com.bumptech.glide.manager.o oVar = (com.bumptech.glide.manager.o) this.f32447w;
        synchronized (oVar.f24256w) {
            try {
                if (oVar.f24254u) {
                    return;
                }
                oVar.f24254u = true;
                W8 w82 = (W8) oVar.f24255v;
                if (w82 == null) {
                    return;
                }
                C3383ig c3383ig = AbstractC3436jg.f32055a;
                X8 x82 = (X8) this.f32445u;
                Z8 z82 = (Z8) this.f32446v;
                z82.f32256n.a(new RunnableC3996u0(5, z82, c3383ig.a(new RunnableC3267gO(this, w82, x82, z82, 2))), AbstractC3436jg.f32062h);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public /* synthetic */ C3504ku(int i, Object obj, Object obj2, Object obj3) {
        this.f32444n = i;
        this.f32445u = obj;
        this.f32446v = obj2;
        this.f32447w = obj3;
    }

    public /* synthetic */ C3504ku(int i, boolean z6) {
        this.f32444n = i;
        this.f32445u = null;
        this.f32446v = null;
        this.f32447w = null;
    }

    public C3504ku(Context context, C3383ig c3383ig, C3383ig c3383ig2, InterfaceC3158eN interfaceC3158eN, C5189a c5189a, C3717or c3717or, C3230fo c3230fo) {
        this.f32444n = 11;
        this.f32445u = interfaceC3158eN;
        this.f32446v = c5189a;
        this.f32447w = c3230fo;
    }

    public C3504ku(Context context, C5189a c5189a, C3091d9 c3091d9, S0.e eVar) {
        this.f32444n = 12;
        this.f32445u = context;
        this.f32447w = c5189a;
        this.f32446v = c3091d9;
    }

    public C3504ku(C4297ze c4297ze, InterfaceC3656nk interfaceC3656nk, RD rd) {
        this.f32444n = 16;
        this.f32445u = c4297ze;
        this.f32446v = interfaceC3656nk;
    }

    public C3504ku(Yt yt, St st, String str) {
        this.f32444n = 7;
        this.f32445u = yt;
        this.f32446v = st;
        this.f32447w = str == null ? "com.google.ads.mediation.admob.AdMobAdapter" : str;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3504ku(int i) {
        this(20, new long[10], new long[10], new long[10]);
        this.f32444n = i;
        switch (i) {
            case 21:
                this.f32445u = null;
                this.f32446v = null;
                this.f32447w = C3956tE.f35032u;
                break;
            default:
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3544lg, com.google.android.gms.internal.ads.InterfaceC3431jb
    /* renamed from: c */
    public void mo0c() {
        Wu wu;
        w2.z.k("loadNewJavascriptEngine (failure): Trying to acquire lock");
        g7.m mVar = (g7.m) this.f32447w;
        synchronized (mVar.f37691d) {
            try {
                w2.z.k("loadNewJavascriptEngine (failure): Lock acquired");
                mVar.f37690c = 1;
                w2.z.k("Failed loading new engine. Marking new engine destroyable.");
                ((C2874Xc) this.f32445u).u();
                if (((Boolean) AbstractC2653Ka.f26707d.r()).booleanValue() && (wu = (Wu) mVar.f37694g) != null) {
                    Su su = (Su) this.f32446v;
                    su.S("Failed loading new engine");
                    su.a(false);
                    wu.b(su.q());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        w2.z.k("loadNewJavascriptEngine (failure): Lock released");
    }

    public C3504ku(Context context, InterfaceC4926d0 interfaceC4926d0) {
        this.f32444n = 0;
        this.f32447w = new AtomicReference();
        this.f32445u = context;
        this.f32446v = interfaceC4926d0;
    }

    public C3504ku(com.bumptech.glide.manager.o oVar, X8 x82, Z8 z82) {
        this.f32444n = 4;
        this.f32445u = x82;
        this.f32446v = z82;
        this.f32447w = oVar;
    }

    public C3504ku(C2495Am c2495Am, C3230fo c3230fo) {
        this.f32444n = 15;
        this.f32445u = c2495Am;
        Dr dr = new Dr(c3230fo);
        this.f32446v = dr;
        this.f32447w = new Hr(dr, c2495Am.f24514e);
    }

    public C3504ku(C2550Dq c2550Dq, C3490kg c3490kg, St st) {
        this.f32444n = 13;
        this.f32445u = c3490kg;
        this.f32446v = st;
        Objects.requireNonNull(c2550Dq);
        this.f32447w = c2550Dq;
    }

    public C3504ku(BN bn, IO io) {
        this.f32444n = 24;
        Objects.requireNonNull(bn);
        this.f32447w = bn;
        this.f32445u = new HashMap();
        this.f32446v = io;
    }

    public /* synthetic */ C3504ku(C3428jP c3428jP) {
        this.f32444n = 25;
        Objects.requireNonNull(c3428jP);
        this.f32447w = c3428jP;
        Handler p9 = AbstractC3182eu.p();
        this.f32445u = p9;
        C3376iP c3376iP = new C3376iP(this);
        this.f32446v = c3376iP;
        c3428jP.f32035a.registerStreamEventCallback(new L(p9, 2), c3376iP);
    }

    public C3504ku(g7.m mVar, C2874Xc c2874Xc, Su su) {
        this.f32444n = 6;
        this.f32445u = c2874Xc;
        this.f32446v = su;
        Objects.requireNonNull(mVar);
        this.f32447w = mVar;
    }

    public C3504ku(String str, int i) {
        this.f32444n = i;
        switch (i) {
            case 18:
                S0.e eVar = new S0.e(25);
                this.f32446v = eVar;
                this.f32447w = eVar;
                this.f32445u = str;
                break;
            default:
                C3322hP c3322hP = new C3322hP();
                c3322hP.d("video/mp2t");
                c3322hP.e(str);
                this.f32445u = new DP(c3322hP);
                break;
        }
    }

    public C3504ku(List list) {
        this.f32444n = 3;
        this.f32445u = list;
        this.f32446v = new InterfaceC3566m1[list.size()];
        C2749Pl c2749Pl = new C2749Pl(new C3680o7(5, this));
        this.f32447w = c2749Pl;
        c2749Pl.j(3);
    }

    public C3504ku(InterfaceC3170ei[] interfaceC3170eiArr) {
        this.f32444n = 26;
        C4021uP c4021uP = new C4021uP();
        c4021uP.f35312m = 0;
        c4021uP.f35314o = 0;
        c4021uP.f35315p = 0;
        byte[] bArr = AbstractC3182eu.f30783b;
        c4021uP.f35313n = bArr;
        c4021uP.f35316q = bArr;
        C3064cj c3064cj = new C3064cj();
        c3064cj.f30323c = 1.0f;
        c3064cj.f30324d = 1.0f;
        C3653nh c3653nh = C3653nh.f33535e;
        c3064cj.f30325e = c3653nh;
        c3064cj.f30326f = c3653nh;
        c3064cj.f30327g = c3653nh;
        c3064cj.f30328h = c3653nh;
        ByteBuffer byteBuffer = InterfaceC3170ei.f30756a;
        c3064cj.f30330k = byteBuffer;
        c3064cj.f30331l = byteBuffer;
        c3064cj.f30322b = -1;
        InterfaceC3170ei[] interfaceC3170eiArr2 = {c4021uP, c3064cj};
        this.f32445u = interfaceC3170eiArr2;
        System.arraycopy(interfaceC3170eiArr, 0, interfaceC3170eiArr2, 0, 0);
        this.f32446v = c4021uP;
        this.f32447w = c3064cj;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3504ku(S0.s sVar) {
        this(20);
        this.f32444n = 20;
        i(sVar, this);
    }

    public C3504ku(C3504ku c3504ku) {
        this.f32444n = 20;
        this.f32445u = Arrays.copyOf((long[]) c3504ku.f32445u, 10);
        this.f32446v = Arrays.copyOf((long[]) c3504ku.f32446v, 10);
        this.f32447w = Arrays.copyOf((long[]) c3504ku.f32447w, 10);
    }

    @Override // R2.InterfaceC0376b
    public void onConnectionSuspended(int i) {
    }
}
