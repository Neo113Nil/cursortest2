package com.google.android.gms.internal.ads;

import P2.InterfaceC0372b;
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
import p2.C4835j;
import q2.AbstractBinderC4875c0;
import q2.InterfaceC4877d0;
import v2.C5110a;

/* renamed from: com.google.android.gms.internal.ads.ku, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3481ku implements InterfaceC3433k, B4, InterfaceC0372b, InterfaceC3521lg, InterfaceC3742pl, InterfaceC2708Oh, InterfaceC2844Wl, InterfaceC4026v, InterfaceC2992bn {

    /* renamed from: x, reason: collision with root package name */
    public static C3481ku f31661x;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f31662n;

    /* renamed from: u, reason: collision with root package name */
    public Object f31663u;

    /* renamed from: v, reason: collision with root package name */
    public Object f31664v;

    /* renamed from: w, reason: collision with root package name */
    public Object f31665w;

    public /* synthetic */ C3481ku(int i, Object obj, Object obj2) {
        this.f31662n = i;
        this.f31663u = obj;
        this.f31664v = obj2;
    }

    public static C3481ku d(Context context) {
        synchronized (C3481ku.class) {
            try {
                C3481ku c3481ku = f31661x;
                if (c3481ku != null) {
                    return c3481ku;
                }
                Context applicationContext = context.getApplicationContext();
                long longValue = ((Long) AbstractC2735Qa.f27033b.r()).longValue();
                InterfaceC4877d0 interfaceC4877d0 = null;
                if (longValue > 0 && longValue <= 262180000) {
                    try {
                        interfaceC4877d0 = AbstractBinderC4875c0.asInterface((IBinder) applicationContext.getClassLoader().loadClass("com.google.android.gms.ads.internal.client.LiteSdkInfo").getConstructor(Context.class).newInstance(applicationContext));
                    } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e9) {
                        int i = u2.z.f41322b;
                        v2.i.d("Failed to retrieve lite SDK info.", e9);
                    }
                }
                C3481ku c3481ku2 = new C3481ku(applicationContext, interfaceC4877d0);
                f31661x = c3481ku2;
                return c3481ku2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void i(S0.s sVar, C3481ku c3481ku) {
        long[] jArr = (long[]) c3481ku.f31663u;
        C3481ku c3481ku2 = (C3481ku) sVar.f2840u;
        long[] jArr2 = (long[]) c3481ku2.f31663u;
        long[] jArr3 = (long[]) sVar.f2841v;
        AbstractC2968bG.I(jArr, jArr2, jArr3);
        long[] jArr4 = (long[]) c3481ku.f31664v;
        long[] jArr5 = (long[]) c3481ku2.f31664v;
        long[] jArr6 = (long[]) c3481ku2.f31665w;
        AbstractC2968bG.I(jArr4, jArr5, jArr6);
        AbstractC2968bG.I((long[]) c3481ku.f31665w, jArr6, jArr3);
    }

    public C4128wu A() {
        C3052cu f3 = ((InterfaceC3633nk) this.f31664v).f();
        C3966tu c3966tu = (C3966tu) ((C4274ze) this.f31663u).f35361v;
        C2789Te a9 = new C2773Se(c3966tu.f34418n).a();
        return new C4128wu(f3.f29623d, f3.f29626g, a9.f27754j, c3966tu.f34424z, f3.f29629k);
    }

    public void B() {
        try {
            ((BinderC2580Gp) ((InterfaceC3135eN) this.f31663u).f()).v0(((C5110a) this.f31664v).f41391n);
            if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.Hf)).booleanValue()) {
                S0.e a9 = ((C3153eo) this.f31665w).a();
                a9.v(NativeAdvancedJsUtils.f17906p, "ptard");
                a9.v("ptard", "l");
                a9.y();
            }
        } catch (RemoteException | NullPointerException e9) {
            if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.If)).booleanValue()) {
                C4835j.f39733C.f39743h.d("Preconnect Local", e9);
            }
        }
    }

    public void C(C3972u c3972u) {
        IO io = (IO) ((HashMap) this.f31663u).remove(c3972u);
        io.getClass();
        AN an = (AN) ((BN) this.f31665w).f23893n.get(io);
        if (an != null) {
            synchronized (an) {
                an.f23669d--;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3742pl, com.google.android.gms.internal.ads.InterfaceC3529lo
    /* renamed from: a */
    public /* synthetic */ void mo1a(Object obj) {
        switch (this.f31662n) {
            case 8:
                ((InterfaceC4010uk) obj).t((BinderC2821Ve) this.f31663u, (String) this.f31664v, (String) this.f31665w);
                break;
            default:
                ((InterfaceC3837rQ) obj).p(0, ((AP) this.f31663u).f23675a, (C3246gQ) this.f31664v, (C3514lQ) this.f31665w);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.B4
    public void b(Dt dt, S0 s02, F4 f42) {
        this.f31664v = dt;
        f42.a();
        f42.b();
        InterfaceC3543m1 C8 = s02.C(f42.f24745d, 5);
        this.f31665w = C8;
        C8.e((DP) this.f31663u);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4026v
    public synchronized C3972u c() {
        C3972u c9;
        BN bn = (BN) this.f31665w;
        C4242z c4242z = bn.f23883c;
        HashMap hashMap = (HashMap) this.f31663u;
        c9 = c4242z.c();
        IO io = (IO) this.f31664v;
        hashMap.put(c9, io);
        AN an = (AN) bn.f23893n.get(io);
        if (an != null) {
            synchronized (an) {
                an.f23669d++;
            }
        }
        return c9;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2844Wl
    public void e(boolean z3, Context context, C2473Ak c2473Ak) {
        try {
            a4.e eVar = C4835j.f39733C.f39737b;
            a4.e.n(context, (AdOverlayInfoParcel) ((C3467kg) this.f31663u).f31479n.get(), true, (C3153eo) ((C2530Dq) this.f31665w).f24471f);
        } catch (Exception unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2844Wl
    public St f() {
        return (St) this.f31664v;
    }

    @Override // com.google.android.gms.internal.ads.B4
    public void g(Cr cr) {
        long a9;
        long j6;
        ((Dt) this.f31664v).getClass();
        String str = AbstractC3159eu.f29993a;
        Dt dt = (Dt) this.f31664v;
        synchronized (dt) {
            try {
                long j9 = dt.f24487c;
                a9 = j9 != com.anythink.basead.exoplayer.b.f6382b ? j9 + dt.f24486b : dt.a();
            } finally {
            }
        }
        Dt dt2 = (Dt) this.f31664v;
        synchronized (dt2) {
            j6 = dt2.f24486b;
        }
        if (a9 == com.anythink.basead.exoplayer.b.f6382b || j6 == com.anythink.basead.exoplayer.b.f6382b) {
            return;
        }
        DP dp = (DP) this.f31663u;
        if (j6 != dp.f24436t) {
            C3299hP c3299hP = new C3299hP(dp);
            c3299hP.f30797s = j6;
            DP dp2 = new DP(c3299hP);
            this.f31663u = dp2;
            ((InterfaceC3543m1) this.f31665w).e(dp2);
        }
        int B9 = cr.B();
        ((InterfaceC3543m1) this.f31665w).a(B9, cr);
        ((InterfaceC3543m1) this.f31665w).c(a9, 1, B9, 0, null);
    }

    public void h(int i) {
        if (i != 16 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i * 8)));
        }
        this.f31663u = Integer.valueOf(i);
    }

    public void j(S0 s02, F4 f42) {
        int i = 0;
        while (true) {
            InterfaceC3543m1[] interfaceC3543m1Arr = (InterfaceC3543m1[]) this.f31664v;
            if (i >= interfaceC3543m1Arr.length) {
                return;
            }
            f42.a();
            f42.b();
            InterfaceC3543m1 C8 = s02.C(f42.f24745d, 3);
            DP dp = (DP) ((List) this.f31663u).get(i);
            String str = dp.f24431o;
            boolean z3 = true;
            if (!com.anythink.basead.exoplayer.k.o.f8441W.equals(str) && !com.anythink.basead.exoplayer.k.o.f8442X.equals(str)) {
                z3 = false;
            }
            AbstractC2772Sd.C(z3, "Invalid closed caption MIME type provided: %s", str);
            C3299hP c3299hP = new C3299hP();
            f42.b();
            c3299hP.f30780a = f42.f24746e;
            c3299hP.d("video/mp2t");
            c3299hP.e(str);
            c3299hP.f30784e = dp.f24422e;
            c3299hP.f30783d = dp.f24421d;
            c3299hP.f30777M = dp.f24414N;
            c3299hP.f30795q = dp.f24434r;
            C8.e(new DP(c3299hP));
            interfaceC3543m1Arr[i] = C8;
            i++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void k(Ut ut, St st, int i, C3531lq c3531lq, long j6) {
        String str;
        S0.e a9 = ((C3153eo) this.f31665w).a();
        a9.v("gqi", ut.f28004b);
        a9.s(st);
        a9.v(NativeAdvancedJsUtils.f17906p, "adapter_status");
        a9.v("adapter_l", String.valueOf(j6));
        a9.v(com.anythink.expressad.f.a.b.bI, Integer.toString(i));
        C2714On c2714On = null;
        if (c3531lq != null) {
            a9.v("arec", Integer.toString(c3531lq.f31859u.f40213n));
            String message = c3531lq.getMessage();
            Pattern pattern = ((C3427ju) this.f31663u).f31344a;
            if (pattern != null && message != null) {
                Matcher matcher = pattern.matcher(message);
                if (matcher.find()) {
                    str = matcher.group();
                    if (str != null) {
                        a9.v("areec", str);
                    }
                }
            }
            str = null;
            if (str != null) {
            }
        }
        Iterator it = st.f27642t.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C2714On b9 = ((C2731Pn) this.f31664v).b((String) it.next());
            if (b9 != null) {
                c2714On = b9;
                break;
            }
        }
        if (c2714On != null) {
            a9.v("ancn", c2714On.f26656a);
            C2804Ud c2804Ud = c2714On.f26657b;
            if (c2804Ud != null) {
                a9.v("adapter_v", c2804Ud.toString());
            }
            C2804Ud c2804Ud2 = c2714On.f26658c;
            if (c2804Ud2 != null) {
                a9.v("adapter_sv", c2804Ud2.toString());
            }
        }
        a9.y();
    }

    public void l(int i) {
        if (i < 10 || i > 16) {
            throw new GeneralSecurityException(D.y.m(i, "Invalid tag size for AesCmacParameters: ", new StringBuilder(String.valueOf(i).length() + 40)));
        }
        this.f31664v = Integer.valueOf(i);
    }

    public void m(long j6, Cr cr) {
        if (cr.B() < 9) {
            return;
        }
        int b9 = cr.b();
        int b10 = cr.b();
        int K7 = cr.K();
        if (b9 == 434 && b10 == 1195456820 && K7 == 3) {
            ((C2712Ol) this.f31665w).k(j6, cr);
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
        long[] jArr14 = (long[]) this.f31665w;
        AbstractC2968bG.L(jArr4, jArr14);
        AbstractC2968bG.L(jArr13, jArr4);
        AbstractC2968bG.L(jArr12, jArr13);
        AbstractC2968bG.I(jArr5, jArr12, jArr14);
        AbstractC2968bG.I(jArr6, jArr5, jArr4);
        AbstractC2968bG.L(jArr12, jArr6);
        AbstractC2968bG.I(jArr7, jArr12, jArr5);
        AbstractC2968bG.L(jArr12, jArr7);
        AbstractC2968bG.L(jArr13, jArr12);
        AbstractC2968bG.L(jArr12, jArr13);
        AbstractC2968bG.L(jArr13, jArr12);
        AbstractC2968bG.L(jArr12, jArr13);
        AbstractC2968bG.I(jArr8, jArr12, jArr7);
        AbstractC2968bG.L(jArr12, jArr8);
        AbstractC2968bG.L(jArr13, jArr12);
        for (int i = 2; i < 10; i += 2) {
            AbstractC2968bG.L(jArr12, jArr13);
            AbstractC2968bG.L(jArr13, jArr12);
        }
        AbstractC2968bG.I(jArr9, jArr13, jArr8);
        AbstractC2968bG.L(jArr12, jArr9);
        AbstractC2968bG.L(jArr13, jArr12);
        for (int i6 = 2; i6 < 20; i6 += 2) {
            AbstractC2968bG.L(jArr12, jArr13);
            AbstractC2968bG.L(jArr13, jArr12);
        }
        AbstractC2968bG.I(jArr12, jArr13, jArr9);
        AbstractC2968bG.L(jArr13, jArr12);
        AbstractC2968bG.L(jArr12, jArr13);
        for (int i9 = 2; i9 < 10; i9 += 2) {
            AbstractC2968bG.L(jArr13, jArr12);
            AbstractC2968bG.L(jArr12, jArr13);
        }
        AbstractC2968bG.I(jArr10, jArr12, jArr8);
        AbstractC2968bG.L(jArr12, jArr10);
        AbstractC2968bG.L(jArr13, jArr12);
        for (int i10 = 2; i10 < 50; i10 += 2) {
            AbstractC2968bG.L(jArr12, jArr13);
            AbstractC2968bG.L(jArr13, jArr12);
        }
        AbstractC2968bG.I(jArr11, jArr13, jArr10);
        AbstractC2968bG.L(jArr13, jArr11);
        AbstractC2968bG.L(jArr12, jArr13);
        for (int i11 = 2; i11 < 100; i11 += 2) {
            AbstractC2968bG.L(jArr13, jArr12);
            AbstractC2968bG.L(jArr12, jArr13);
        }
        AbstractC2968bG.I(jArr13, jArr12, jArr11);
        AbstractC2968bG.L(jArr12, jArr13);
        AbstractC2968bG.L(jArr13, jArr12);
        for (int i12 = 2; i12 < 50; i12 += 2) {
            AbstractC2968bG.L(jArr12, jArr13);
            AbstractC2968bG.L(jArr13, jArr12);
        }
        AbstractC2968bG.I(jArr12, jArr13, jArr10);
        AbstractC2968bG.L(jArr13, jArr12);
        AbstractC2968bG.L(jArr12, jArr13);
        AbstractC2968bG.L(jArr13, jArr12);
        AbstractC2968bG.L(jArr12, jArr13);
        AbstractC2968bG.L(jArr13, jArr12);
        AbstractC2968bG.I(jArr, jArr13, jArr6);
        AbstractC2968bG.I(jArr2, (long[]) this.f31663u, jArr);
        AbstractC2968bG.I(jArr3, (long[]) this.f31664v, jArr);
        byte[] O8 = AbstractC2968bG.O(jArr3);
        O8[31] = (byte) (((AbstractC2968bG.O(jArr2)[0] & 1) << 7) ^ O8[31]);
        return O8;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4026v
    public synchronized void o() {
        ((BN) this.f31665w).f23883c.o();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4026v
    public synchronized void p(C3972u c3972u) {
        ((BN) this.f31665w).f23883c.p(c3972u);
        C(c3972u);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4026v
    public synchronized void q(G2 g22) {
        ((BN) this.f31665w).f23883c.q(g22);
        while (g22 != null) {
            C3972u c3972u = (C3972u) g22.f24909v;
            c3972u.getClass();
            C(c3972u);
            g22 = (G2) g22.f24910w;
            if (g22 == null || ((C3972u) g22.f24909v) == null) {
                g22 = null;
            }
        }
    }

    @Override // P2.InterfaceC0372b
    public void r() {
        com.bumptech.glide.manager.p pVar = (com.bumptech.glide.manager.p) this.f31665w;
        synchronized (pVar.f23471w) {
            try {
                if (pVar.f23469u) {
                    return;
                }
                pVar.f23469u = true;
                W8 w82 = (W8) pVar.f23470v;
                if (w82 == null) {
                    return;
                }
                C3360ig c3360ig = AbstractC3413jg.f31268a;
                X8 x82 = (X8) this.f31663u;
                Z8 z82 = (Z8) this.f31664v;
                z82.f31479n.a(new RunnableC3973u0(5, z82, c3360ig.a(new RunnableC3244gO(this, w82, x82, z82, 2))), AbstractC3413jg.f31275h);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Ut s() {
        return (Ut) ((Yt) this.f31663u).f28754b.f25043v;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3433k
    public C3500lC t(int i, A8 a82, int[] iArr) {
        PB pb = RB.f27177u;
        MA.q(4, "initialCapacity");
        Object[] objArr = new Object[4];
        int i6 = 0;
        int i9 = 0;
        while (i6 < a82.f23635a) {
            int i10 = i;
            A8 a83 = a82;
            C3379j c3379j = new C3379j(i10, a83, i6, (C3327i) this.f31663u, iArr[i6], (String) this.f31664v, (String) this.f31665w);
            int length = objArr.length;
            int i11 = i9 + 1;
            int d2 = MB.d(length, i11);
            if (d2 > length) {
                objArr = Arrays.copyOf(objArr, d2);
            }
            objArr[i9] = c3379j;
            i6++;
            i9 = i11;
            i = i10;
            a82 = a83;
        }
        return RB.p(objArr, i9);
    }

    public String toString() {
        switch (this.f31662n) {
            case 18:
                StringBuilder sb = new StringBuilder(32);
                sb.append((String) this.f31663u);
                sb.append('{');
                S0.e eVar = (S0.e) ((S0.e) this.f31664v).f2782v;
                String str = "";
                while (eVar != null) {
                    Object obj = eVar.f2781u;
                    sb.append(str);
                    if (obj == null || !obj.getClass().isArray()) {
                        sb.append(obj);
                    } else {
                        sb.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r2.length() - 1);
                    }
                    eVar = (S0.e) eVar.f2782v;
                    str = ", ";
                }
                sb.append('}');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void u(InterfaceC3572md interfaceC3572md) {
        InterfaceC3572md adapterCreator;
        boolean booleanValue = ((Boolean) AbstractC2735Qa.f27032a.r()).booleanValue();
        AtomicReference atomicReference = (AtomicReference) this.f31665w;
        if (!booleanValue) {
            while (!atomicReference.compareAndSet(null, interfaceC3572md) && atomicReference.get() == null) {
            }
            return;
        }
        InterfaceC4877d0 interfaceC4877d0 = (InterfaceC4877d0) this.f31664v;
        if (interfaceC4877d0 != null) {
            try {
                adapterCreator = interfaceC4877d0.getAdapterCreator();
            } catch (RemoteException unused) {
            }
            if (adapterCreator == null) {
                adapterCreator = interfaceC3572md;
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

    public KE v() {
        C3105du c3105du;
        C3240gK b9;
        NE ne = (NE) this.f31663u;
        if (ne == null || (c3105du = (C3105du) this.f31664v) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (ne.f26476a != ((C3240gK) c3105du.f29859u).f30559a.length) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (ne.a() && ((Integer) this.f31665w) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!((NE) this.f31663u).a() && ((Integer) this.f31665w) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        C3933tE c3933tE = ((NE) this.f31663u).f26477b;
        if (c3933tE == C3933tE.f34236k) {
            b9 = AbstractC3344iG.f31018a;
        } else if (c3933tE == C3933tE.f34235j) {
            b9 = AbstractC3344iG.a(((Integer) this.f31665w).intValue());
        } else {
            if (c3933tE != C3933tE.i) {
                throw new IllegalStateException("Unknown AesGcmParameters.Variant: ".concat(String.valueOf(((NE) this.f31663u).f26477b)));
            }
            b9 = AbstractC3344iG.b(((Integer) this.f31665w).intValue());
        }
        return new KE((NE) this.f31663u, (C3105du) this.f31664v, b9, (Integer) this.f31665w);
    }

    public GG w() {
        Integer num = (Integer) this.f31663u;
        if (num == null) {
            throw new GeneralSecurityException("key size not set");
        }
        if (((Integer) this.f31664v) != null) {
            return new GG(num.intValue(), ((Integer) this.f31664v).intValue(), (C3933tE) this.f31665w);
        }
        throw new GeneralSecurityException("tag size not set");
    }

    public C3024cJ x() {
        C3240gK a9;
        ZI zi = (ZI) this.f31663u;
        if (zi == null) {
            throw new GeneralSecurityException("Cannot build without parameters");
        }
        ECPoint eCPoint = (ECPoint) this.f31664v;
        if (eCPoint == null) {
            throw new GeneralSecurityException("Cannot build without public point");
        }
        MF.a(eCPoint, zi.f28867b.f28668b.getCurve());
        if (((ZI) this.f31663u).a() && ((Integer) this.f31665w) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!((ZI) this.f31663u).a() && ((Integer) this.f31665w) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        C3933tE c3933tE = ((ZI) this.f31663u).f28869d;
        if (c3933tE == C3933tE.f34250y) {
            a9 = AbstractC3344iG.f31018a;
        } else if (c3933tE == C3933tE.f34249x || c3933tE == C3933tE.f34248w) {
            a9 = AbstractC3344iG.a(((Integer) this.f31665w).intValue());
        } else {
            if (c3933tE != C3933tE.f34247v) {
                throw new IllegalStateException("Unknown EcdsaParameters.Variant: ".concat(((ZI) this.f31663u).f28869d.f34252b));
            }
            a9 = AbstractC3344iG.b(((Integer) this.f31665w).intValue());
        }
        return new C3024cJ((ZI) this.f31663u, (ECPoint) this.f31664v, a9, (Integer) this.f31665w);
    }

    public C4100wJ y() {
        C3240gK a9;
        if (((C3992uJ) this.f31663u) == null) {
            throw new GeneralSecurityException("Cannot build without parameters");
        }
        BigInteger bigInteger = (BigInteger) this.f31664v;
        if (bigInteger == null) {
            throw new GeneralSecurityException("Cannot build without modulus");
        }
        int bitLength = bigInteger.bitLength();
        C3992uJ c3992uJ = (C3992uJ) this.f31663u;
        int i = c3992uJ.f34511a;
        if (bitLength != i) {
            throw new GeneralSecurityException(D.y.r(new StringBuilder(String.valueOf(bitLength).length() + 56 + String.valueOf(i).length()), "Got modulus size ", bitLength, ", but parameters requires modulus size ", i));
        }
        if (c3992uJ.a() && ((Integer) this.f31665w) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!((C3992uJ) this.f31663u).a() && ((Integer) this.f31665w) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        C3879sE c3879sE = ((C3992uJ) this.f31663u).f34513c;
        if (c3879sE == C3879sE.f33926u) {
            a9 = AbstractC3344iG.f31018a;
        } else if (c3879sE == C3879sE.f33925t || c3879sE == C3879sE.f33924s) {
            a9 = AbstractC3344iG.a(((Integer) this.f31665w).intValue());
        } else {
            if (c3879sE != C3879sE.f33923r) {
                throw new IllegalStateException("Unknown RsaSsaPssParameters.Variant: ".concat(String.valueOf(((C3992uJ) this.f31663u).f34513c)));
            }
            a9 = AbstractC3344iG.b(((Integer) this.f31665w).intValue());
        }
        return new C4100wJ((C3992uJ) this.f31663u, (BigInteger) this.f31664v, a9, (Integer) this.f31665w);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2708Oh
    public void z(String str, int i, String str2, boolean z3) {
        C3314hn c3314hn = (C3314hn) this.f31663u;
        c3314hn.getClass();
        boolean booleanValue = ((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.f32084N4)).booleanValue();
        Z8 z82 = (Z8) this.f31665w;
        C3052cu c3052cu = c3314hn.f30930a;
        InterfaceC4061vh interfaceC4061vh = (InterfaceC4061vh) this.f31664v;
        if (!booleanValue) {
            q2.Z0 z02 = c3052cu.f29620a;
            if (z02 != null && interfaceC4061vh.g() != null) {
                interfaceC4061vh.g().V3(z02);
            }
            z82.d();
            return;
        }
        if (z3) {
            q2.Z0 z03 = c3052cu.f29620a;
            if (z03 != null && interfaceC4061vh.g() != null) {
                interfaceC4061vh.g().V3(z03);
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
        z82.c(new Zq(1, u1.h.g(sb, ", Failing URL: ", str2)));
    }

    public /* synthetic */ C3481ku(int i, Object obj, Object obj2, Object obj3) {
        this.f31662n = i;
        this.f31663u = obj;
        this.f31664v = obj2;
        this.f31665w = obj3;
    }

    public /* synthetic */ C3481ku(int i, boolean z3) {
        this.f31662n = i;
        this.f31663u = null;
        this.f31664v = null;
        this.f31665w = null;
    }

    public C3481ku(Context context, C3360ig c3360ig, C3360ig c3360ig2, InterfaceC3135eN interfaceC3135eN, C5110a c5110a, C3694or c3694or, C3153eo c3153eo) {
        this.f31662n = 11;
        this.f31663u = interfaceC3135eN;
        this.f31664v = c5110a;
        this.f31665w = c3153eo;
    }

    public C3481ku(Context context, C5110a c5110a, C3068d9 c3068d9, S0.e eVar) {
        this.f31662n = 12;
        this.f31663u = context;
        this.f31665w = c5110a;
        this.f31664v = c3068d9;
    }

    public C3481ku(C4274ze c4274ze, InterfaceC3633nk interfaceC3633nk, RD rd) {
        this.f31662n = 16;
        this.f31663u = c4274ze;
        this.f31664v = interfaceC3633nk;
    }

    public C3481ku(Yt yt, St st, String str) {
        this.f31662n = 7;
        this.f31663u = yt;
        this.f31664v = st;
        this.f31665w = str == null ? "com.google.ads.mediation.admob.AdMobAdapter" : str;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3481ku(int i) {
        this(20, new long[10], new long[10], new long[10]);
        this.f31662n = i;
        switch (i) {
            case 21:
                this.f31663u = null;
                this.f31664v = null;
                this.f31665w = C3933tE.f34246u;
                break;
            default:
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3521lg, com.google.android.gms.internal.ads.InterfaceC3408jb
    /* renamed from: c */
    public void mo0c() {
        Wu wu;
        u2.z.k("loadNewJavascriptEngine (failure): Trying to acquire lock");
        g7.m mVar = (g7.m) this.f31665w;
        synchronized (mVar.f37666d) {
            try {
                u2.z.k("loadNewJavascriptEngine (failure): Lock acquired");
                mVar.f37665c = 1;
                u2.z.k("Failed loading new engine. Marking new engine destroyable.");
                ((C2851Xc) this.f31663u).u();
                if (((Boolean) AbstractC2633Ka.f25929d.r()).booleanValue() && (wu = (Wu) mVar.f37669g) != null) {
                    Su su = (Su) this.f31664v;
                    su.S("Failed loading new engine");
                    su.a(false);
                    wu.b(su.q());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        u2.z.k("loadNewJavascriptEngine (failure): Lock released");
    }

    public C3481ku(Context context, InterfaceC4877d0 interfaceC4877d0) {
        this.f31662n = 0;
        this.f31665w = new AtomicReference();
        this.f31663u = context;
        this.f31664v = interfaceC4877d0;
    }

    public C3481ku(com.bumptech.glide.manager.p pVar, X8 x82, Z8 z82) {
        this.f31662n = 4;
        this.f31663u = x82;
        this.f31664v = z82;
        this.f31665w = pVar;
    }

    public C3481ku(C4282zm c4282zm, C3153eo c3153eo) {
        this.f31662n = 15;
        this.f31663u = c4282zm;
        Dr dr = new Dr(c3153eo);
        this.f31664v = dr;
        this.f31665w = new Hr(dr, c4282zm.f35448e);
    }

    public C3481ku(C2530Dq c2530Dq, C3467kg c3467kg, St st) {
        this.f31662n = 13;
        this.f31663u = c3467kg;
        this.f31664v = st;
        Objects.requireNonNull(c2530Dq);
        this.f31665w = c2530Dq;
    }

    public C3481ku(BN bn, IO io) {
        this.f31662n = 24;
        Objects.requireNonNull(bn);
        this.f31665w = bn;
        this.f31663u = new HashMap();
        this.f31664v = io;
    }

    public /* synthetic */ C3481ku(C3405jP c3405jP) {
        this.f31662n = 25;
        Objects.requireNonNull(c3405jP);
        this.f31665w = c3405jP;
        Handler p9 = AbstractC3159eu.p();
        this.f31663u = p9;
        C3353iP c3353iP = new C3353iP(this);
        this.f31664v = c3353iP;
        c3405jP.f31248a.registerStreamEventCallback(new L(p9, 2), c3353iP);
    }

    public C3481ku(g7.m mVar, C2851Xc c2851Xc, Su su) {
        this.f31662n = 6;
        this.f31663u = c2851Xc;
        this.f31664v = su;
        Objects.requireNonNull(mVar);
        this.f31665w = mVar;
    }

    public C3481ku(String str, int i) {
        this.f31662n = i;
        switch (i) {
            case 18:
                S0.e eVar = new S0.e(22, false);
                this.f31664v = eVar;
                this.f31665w = eVar;
                this.f31663u = str;
                break;
            default:
                C3299hP c3299hP = new C3299hP();
                c3299hP.d("video/mp2t");
                c3299hP.e(str);
                this.f31663u = new DP(c3299hP);
                break;
        }
    }

    public C3481ku(List list) {
        this.f31662n = 3;
        this.f31663u = list;
        this.f31664v = new InterfaceC3543m1[list.size()];
        C2712Ol c2712Ol = new C2712Ol(new C3657o7(5, this));
        this.f31665w = c2712Ol;
        c2712Ol.j(3);
    }

    public C3481ku(InterfaceC3147ei[] interfaceC3147eiArr) {
        this.f31662n = 26;
        C3998uP c3998uP = new C3998uP();
        c3998uP.f34538m = 0;
        c3998uP.f34540o = 0;
        c3998uP.f34541p = 0;
        byte[] bArr = AbstractC3159eu.f29994b;
        c3998uP.f34539n = bArr;
        c3998uP.f34542q = bArr;
        C3041cj c3041cj = new C3041cj();
        c3041cj.f29538c = 1.0f;
        c3041cj.f29539d = 1.0f;
        C3630nh c3630nh = C3630nh.f32748e;
        c3041cj.f29540e = c3630nh;
        c3041cj.f29541f = c3630nh;
        c3041cj.f29542g = c3630nh;
        c3041cj.f29543h = c3630nh;
        ByteBuffer byteBuffer = InterfaceC3147ei.f29965a;
        c3041cj.f29545k = byteBuffer;
        c3041cj.f29546l = byteBuffer;
        c3041cj.f29537b = -1;
        InterfaceC3147ei[] interfaceC3147eiArr2 = {c3998uP, c3041cj};
        this.f31663u = interfaceC3147eiArr2;
        System.arraycopy(interfaceC3147eiArr, 0, interfaceC3147eiArr2, 0, 0);
        this.f31664v = c3998uP;
        this.f31665w = c3041cj;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3481ku(S0.s sVar) {
        this(20);
        this.f31662n = 20;
        i(sVar, this);
    }

    public C3481ku(C3481ku c3481ku) {
        this.f31662n = 20;
        this.f31663u = Arrays.copyOf((long[]) c3481ku.f31663u, 10);
        this.f31664v = Arrays.copyOf((long[]) c3481ku.f31664v, 10);
        this.f31665w = Arrays.copyOf((long[]) c3481ku.f31665w, 10);
    }

    @Override // P2.InterfaceC0372b
    public void onConnectionSuspended(int i) {
    }
}
