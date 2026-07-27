package com.google.android.gms.internal.ads;

import O.C0344t;
import P2.InterfaceC0372b;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.view.View;
import androidx.fragment.app.AbstractActivityC0480x;
import androidx.fragment.app.AbstractComponentCallbacksC0475s;
import b2.InterfaceC0515b;
import com.anythink.basead.ui.BaseATView;
import com.icefishing.icefishinglive2.C5275R;
import com.icefishing.icefishinglive2.GzopStretegygamesActivity;
import g2.C4524a;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Provider;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.TimeZone;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import k2.C4631a;
import n.C4743b;
import n.C4745d;
import o4.InterfaceC4798k;
import p2.C4835j;
import q2.C4920z0;
import t7.InterfaceC5044a;
import x2.InterfaceC5189c;

/* renamed from: com.google.android.gms.internal.ads.bm, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2991bm implements J0.x, I2.a, InterfaceC2903a5, InterfaceC0372b, InterfaceC5189c, KD, InterfaceC2844Wl, Hu, InterfaceC3742pl, YG, InterfaceC3613nH, InterfaceC3529lo, InterfaceC4798k, InterfaceC0515b {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f29322n;

    /* renamed from: u, reason: collision with root package name */
    public final Object f29323u;

    /* renamed from: v, reason: collision with root package name */
    public Object f29324v;

    public /* synthetic */ C2991bm(int i, Object obj, Object obj2) {
        this.f29322n = i;
        this.f29323u = obj;
        this.f29324v = obj2;
    }

    public static void U(C2991bm c2991bm, S0.s sVar) {
        C3481ku c3481ku = (C3481ku) c2991bm.f29323u;
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
        AbstractC2968bG.I((long[]) c2991bm.f29324v, jArr2, jArr5);
    }

    public void B(AbstractComponentCallbacksC0475s abstractComponentCallbacksC0475s, Bundle bundle, boolean z3) {
        androidx.fragment.app.N n9 = (androidx.fragment.app.N) this.f29324v;
        AbstractComponentCallbacksC0475s abstractComponentCallbacksC0475s2 = n9.f4870v;
        if (abstractComponentCallbacksC0475s2 != null) {
            abstractComponentCallbacksC0475s2.f().f4860l.B(abstractComponentCallbacksC0475s, bundle, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f29323u).iterator();
        while (it.hasNext()) {
            androidx.fragment.app.C c9 = (androidx.fragment.app.C) it.next();
            if (z3) {
                c9.getClass();
            }
            c9.f4817a.onFragmentActivityCreated(n9, abstractComponentCallbacksC0475s, bundle);
        }
    }

    public void C(AbstractComponentCallbacksC0475s abstractComponentCallbacksC0475s, boolean z3) {
        androidx.fragment.app.N n9 = (androidx.fragment.app.N) this.f29324v;
        AbstractActivityC0480x abstractActivityC0480x = n9.f4868t.f5076u;
        AbstractComponentCallbacksC0475s abstractComponentCallbacksC0475s2 = n9.f4870v;
        if (abstractComponentCallbacksC0475s2 != null) {
            abstractComponentCallbacksC0475s2.f().f4860l.C(abstractComponentCallbacksC0475s, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f29323u).iterator();
        while (it.hasNext()) {
            androidx.fragment.app.C c9 = (androidx.fragment.app.C) it.next();
            if (z3) {
                c9.getClass();
            }
            c9.f4817a.onFragmentAttached(n9, abstractComponentCallbacksC0475s, abstractActivityC0480x);
        }
    }

    public void D(AbstractComponentCallbacksC0475s abstractComponentCallbacksC0475s, Bundle bundle, boolean z3) {
        androidx.fragment.app.N n9 = (androidx.fragment.app.N) this.f29324v;
        AbstractComponentCallbacksC0475s abstractComponentCallbacksC0475s2 = n9.f4870v;
        if (abstractComponentCallbacksC0475s2 != null) {
            abstractComponentCallbacksC0475s2.f().f4860l.D(abstractComponentCallbacksC0475s, bundle, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f29323u).iterator();
        while (it.hasNext()) {
            androidx.fragment.app.C c9 = (androidx.fragment.app.C) it.next();
            if (z3) {
                c9.getClass();
            }
            c9.f4817a.onFragmentCreated(n9, abstractComponentCallbacksC0475s, bundle);
        }
    }

    public void E(AbstractComponentCallbacksC0475s abstractComponentCallbacksC0475s, boolean z3) {
        androidx.fragment.app.N n9 = (androidx.fragment.app.N) this.f29324v;
        AbstractComponentCallbacksC0475s abstractComponentCallbacksC0475s2 = n9.f4870v;
        if (abstractComponentCallbacksC0475s2 != null) {
            abstractComponentCallbacksC0475s2.f().f4860l.E(abstractComponentCallbacksC0475s, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f29323u).iterator();
        while (it.hasNext()) {
            androidx.fragment.app.C c9 = (androidx.fragment.app.C) it.next();
            if (z3) {
                c9.getClass();
            }
            c9.f4817a.onFragmentDestroyed(n9, abstractComponentCallbacksC0475s);
        }
    }

    public void F(AbstractComponentCallbacksC0475s abstractComponentCallbacksC0475s, boolean z3) {
        androidx.fragment.app.N n9 = (androidx.fragment.app.N) this.f29324v;
        AbstractComponentCallbacksC0475s abstractComponentCallbacksC0475s2 = n9.f4870v;
        if (abstractComponentCallbacksC0475s2 != null) {
            abstractComponentCallbacksC0475s2.f().f4860l.F(abstractComponentCallbacksC0475s, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f29323u).iterator();
        while (it.hasNext()) {
            androidx.fragment.app.C c9 = (androidx.fragment.app.C) it.next();
            if (z3) {
                c9.getClass();
            }
            c9.f4817a.onFragmentDetached(n9, abstractComponentCallbacksC0475s);
        }
    }

    public void G(AbstractComponentCallbacksC0475s abstractComponentCallbacksC0475s, boolean z3) {
        androidx.fragment.app.N n9 = (androidx.fragment.app.N) this.f29324v;
        AbstractComponentCallbacksC0475s abstractComponentCallbacksC0475s2 = n9.f4870v;
        if (abstractComponentCallbacksC0475s2 != null) {
            abstractComponentCallbacksC0475s2.f().f4860l.G(abstractComponentCallbacksC0475s, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f29323u).iterator();
        while (it.hasNext()) {
            androidx.fragment.app.C c9 = (androidx.fragment.app.C) it.next();
            if (z3) {
                c9.getClass();
            }
            c9.f4817a.onFragmentPaused(n9, abstractComponentCallbacksC0475s);
        }
    }

    public void H(AbstractComponentCallbacksC0475s abstractComponentCallbacksC0475s, boolean z3) {
        androidx.fragment.app.N n9 = (androidx.fragment.app.N) this.f29324v;
        AbstractActivityC0480x abstractActivityC0480x = n9.f4868t.f5076u;
        AbstractComponentCallbacksC0475s abstractComponentCallbacksC0475s2 = n9.f4870v;
        if (abstractComponentCallbacksC0475s2 != null) {
            abstractComponentCallbacksC0475s2.f().f4860l.H(abstractComponentCallbacksC0475s, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f29323u).iterator();
        while (it.hasNext()) {
            androidx.fragment.app.C c9 = (androidx.fragment.app.C) it.next();
            if (z3) {
                c9.getClass();
            }
            c9.f4817a.onFragmentPreAttached(n9, abstractComponentCallbacksC0475s, abstractActivityC0480x);
        }
    }

    public void I(AbstractComponentCallbacksC0475s abstractComponentCallbacksC0475s, Bundle bundle, boolean z3) {
        androidx.fragment.app.N n9 = (androidx.fragment.app.N) this.f29324v;
        AbstractComponentCallbacksC0475s abstractComponentCallbacksC0475s2 = n9.f4870v;
        if (abstractComponentCallbacksC0475s2 != null) {
            abstractComponentCallbacksC0475s2.f().f4860l.I(abstractComponentCallbacksC0475s, bundle, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f29323u).iterator();
        while (it.hasNext()) {
            androidx.fragment.app.C c9 = (androidx.fragment.app.C) it.next();
            if (z3) {
                c9.getClass();
            }
            c9.f4817a.onFragmentPreCreated(n9, abstractComponentCallbacksC0475s, bundle);
        }
    }

    public void J(AbstractComponentCallbacksC0475s abstractComponentCallbacksC0475s, boolean z3) {
        androidx.fragment.app.N n9 = (androidx.fragment.app.N) this.f29324v;
        AbstractComponentCallbacksC0475s abstractComponentCallbacksC0475s2 = n9.f4870v;
        if (abstractComponentCallbacksC0475s2 != null) {
            abstractComponentCallbacksC0475s2.f().f4860l.J(abstractComponentCallbacksC0475s, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f29323u).iterator();
        while (it.hasNext()) {
            androidx.fragment.app.C c9 = (androidx.fragment.app.C) it.next();
            if (z3) {
                c9.getClass();
            }
            c9.f4817a.onFragmentResumed(n9, abstractComponentCallbacksC0475s);
        }
    }

    public void K(AbstractComponentCallbacksC0475s abstractComponentCallbacksC0475s, Bundle bundle, boolean z3) {
        androidx.fragment.app.N n9 = (androidx.fragment.app.N) this.f29324v;
        AbstractComponentCallbacksC0475s abstractComponentCallbacksC0475s2 = n9.f4870v;
        if (abstractComponentCallbacksC0475s2 != null) {
            abstractComponentCallbacksC0475s2.f().f4860l.K(abstractComponentCallbacksC0475s, bundle, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f29323u).iterator();
        while (it.hasNext()) {
            androidx.fragment.app.C c9 = (androidx.fragment.app.C) it.next();
            if (z3) {
                c9.getClass();
            }
            c9.f4817a.onFragmentSaveInstanceState(n9, abstractComponentCallbacksC0475s, bundle);
        }
    }

    public void L(AbstractComponentCallbacksC0475s abstractComponentCallbacksC0475s, boolean z3) {
        androidx.fragment.app.N n9 = (androidx.fragment.app.N) this.f29324v;
        AbstractComponentCallbacksC0475s abstractComponentCallbacksC0475s2 = n9.f4870v;
        if (abstractComponentCallbacksC0475s2 != null) {
            abstractComponentCallbacksC0475s2.f().f4860l.L(abstractComponentCallbacksC0475s, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f29323u).iterator();
        while (it.hasNext()) {
            androidx.fragment.app.C c9 = (androidx.fragment.app.C) it.next();
            if (z3) {
                c9.getClass();
            }
            c9.f4817a.onFragmentStarted(n9, abstractComponentCallbacksC0475s);
        }
    }

    public void M(AbstractComponentCallbacksC0475s abstractComponentCallbacksC0475s, boolean z3) {
        androidx.fragment.app.N n9 = (androidx.fragment.app.N) this.f29324v;
        AbstractComponentCallbacksC0475s abstractComponentCallbacksC0475s2 = n9.f4870v;
        if (abstractComponentCallbacksC0475s2 != null) {
            abstractComponentCallbacksC0475s2.f().f4860l.M(abstractComponentCallbacksC0475s, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f29323u).iterator();
        while (it.hasNext()) {
            androidx.fragment.app.C c9 = (androidx.fragment.app.C) it.next();
            if (z3) {
                c9.getClass();
            }
            c9.f4817a.onFragmentStopped(n9, abstractComponentCallbacksC0475s);
        }
    }

    public void N(AbstractComponentCallbacksC0475s abstractComponentCallbacksC0475s, View view, Bundle bundle, boolean z3) {
        androidx.fragment.app.N n9 = (androidx.fragment.app.N) this.f29324v;
        AbstractComponentCallbacksC0475s abstractComponentCallbacksC0475s2 = n9.f4870v;
        if (abstractComponentCallbacksC0475s2 != null) {
            abstractComponentCallbacksC0475s2.f().f4860l.N(abstractComponentCallbacksC0475s, view, bundle, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f29323u).iterator();
        while (it.hasNext()) {
            androidx.fragment.app.C c9 = (androidx.fragment.app.C) it.next();
            if (z3) {
                c9.getClass();
            }
            c9.f4817a.onFragmentViewCreated(n9, abstractComponentCallbacksC0475s, view, bundle);
        }
    }

    public void O(AbstractComponentCallbacksC0475s abstractComponentCallbacksC0475s, boolean z3) {
        androidx.fragment.app.N n9 = (androidx.fragment.app.N) this.f29324v;
        AbstractComponentCallbacksC0475s abstractComponentCallbacksC0475s2 = n9.f4870v;
        if (abstractComponentCallbacksC0475s2 != null) {
            abstractComponentCallbacksC0475s2.f().f4860l.O(abstractComponentCallbacksC0475s, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f29323u).iterator();
        while (it.hasNext()) {
            androidx.fragment.app.C c9 = (androidx.fragment.app.C) it.next();
            if (z3) {
                c9.getClass();
            }
            c9.f4817a.onFragmentViewDestroyed(n9, abstractComponentCallbacksC0475s);
        }
    }

    @Override // o4.InterfaceC4798k
    public void OnCall() {
        ((GzopStretegygamesActivity) this.f29324v).startActivity((Intent) this.f29323u);
    }

    public String P(String str) {
        String str2 = (String) this.f29324v;
        Resources resources = (Resources) this.f29323u;
        int identifier = resources.getIdentifier(str, com.anythink.expressad.foundation.h.k.f19636g, str2);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }

    public Object Q(E3.u uVar) {
        return (X0.G) this.f29324v;
    }

    public Object R(float f3, float f9, Object obj, Object obj2, float f10, float f11, float f12) {
        E3.u uVar = (E3.u) this.f29323u;
        uVar.f827a = f3;
        uVar.f828b = f9;
        uVar.f832f = obj;
        uVar.f833g = obj2;
        uVar.f829c = f10;
        uVar.f830d = f11;
        uVar.f831e = f12;
        return Q(uVar);
    }

    public void S(com.bumptech.glide.d dVar) {
        boolean z3;
        androidx.lifecycle.C c9 = (androidx.lifecycle.C) this.f29323u;
        synchronized (c9.f5091a) {
            z3 = c9.f5096f == androidx.lifecycle.C.f5090k;
            c9.f5096f = dVar;
        }
        if (z3) {
            C4743b T8 = C4743b.T();
            G0.c cVar = c9.f5099j;
            C4745d c4745d = T8.f39446h;
            if (c4745d.f39449j == null) {
                synchronized (c4745d.f39448h) {
                    try {
                        if (c4745d.f39449j == null) {
                            c4745d.f39449j = C4745d.T(Looper.getMainLooper());
                        }
                    } finally {
                    }
                }
            }
            c4745d.f39449j.post(cVar);
        }
        if (dVar instanceof J0.w) {
            ((U0.k) this.f29324v).j((J0.w) dVar);
        } else if (dVar instanceof J0.u) {
            ((U0.k) this.f29324v).k(((J0.u) dVar).f1409a);
        }
    }

    public void V(ArrayList arrayList) {
        C4092wB c4092wB;
        for (int i = 0; i < arrayList.size(); i++) {
            if (((C3177fB) arrayList.get(i)).f30234a == 1) {
                try {
                    c4092wB = new C4092wB((C3177fB) arrayList.get(i));
                } catch (TA unused) {
                    c4092wB = null;
                }
                this.f29324v = c4092wB;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3742pl, com.google.android.gms.internal.ads.InterfaceC3529lo
    /* renamed from: a */
    public void mo1a(Object obj) {
        switch (this.f29322n) {
            case 20:
                Iu iu = (Iu) this.f29323u;
                ((Mu) obj).c((Ju) iu.f25613n, iu.f25614u, (Throwable) this.f29324v);
                break;
            default:
                ((InterfaceC4213yO) obj).m((C4159xO) this.f29323u, (C3514lQ) this.f29324v);
                break;
        }
    }

    @Override // I2.a
    public j3.m b() {
        j3.m b9 = ((Z2.g) this.f29323u).b();
        I0.j jVar = new I0.j(14, this);
        b9.getClass();
        return b9.e(j3.i.f38359a, jVar);
    }

    @Override // com.google.android.gms.internal.ads.Hu
    /* renamed from: c */
    public void mo4c() {
        C3892sa c3892sa = (C3892sa) ((C3424jr) this.f29323u).f31331d;
        BinderC3838ra binderC3838ra = (BinderC3838ra) this.f29324v;
        Parcel H02 = c3892sa.H0();
        AbstractC3388j8.e(H02, binderC3838ra);
        c3892sa.f1(H02, 1);
    }

    @Override // com.google.android.gms.internal.ads.YG
    public byte[] d(int i, byte[] bArr) {
        if (i > 16) {
            throw new InvalidAlgorithmParameterException("outputLength must not be larger than 16");
        }
        SecretKeySpec secretKeySpec = (SecretKeySpec) this.f29323u;
        Mac mac = Mac.getInstance("AESCMAC", (Provider) this.f29324v);
        mac.init(secretKeySpec);
        byte[] doFinal = mac.doFinal(bArr);
        return i == doFinal.length ? doFinal : Arrays.copyOf(doFinal, i);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2844Wl
    public void e(boolean z3, Context context, C2473Ak c2473Ak) {
        try {
            C3535lu c3535lu = (C3535lu) ((C3477kq) this.f29323u).f31639b;
            c3535lu.b(z3);
            try {
                c3535lu.f31864a.c3(new W2.b(context));
            } catch (Throwable th) {
                throw new C3267gu(th);
            }
        } catch (C3267gu e9) {
            throw new C2828Vl(e9.getCause());
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2844Wl
    public St f() {
        return (St) this.f29324v;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3613nH
    public long g(C2971bJ c2971bJ) {
        InterfaceC3613nH interfaceC3613nH = (InterfaceC3613nH) this.f29323u;
        this.f29324v = c2971bJ.f29279a;
        Map map = Collections.EMPTY_MAP;
        try {
            long g4 = interfaceC3613nH.g(c2971bJ);
            Uri i = interfaceC3613nH.i();
            if (i != null) {
                this.f29324v = i;
            }
            interfaceC3613nH.j();
            return g4;
        } catch (Throwable th) {
            Uri i6 = interfaceC3613nH.i();
            if (i6 != null) {
                this.f29324v = i6;
            }
            interfaceC3613nH.j();
            throw th;
        }
    }

    @Override // t7.InterfaceC5044a
    public Object get() {
        return new g2.h(new E3.e(), new a4.e(), C4524a.f37628f, (g2.j) ((F1.a) this.f29323u).get(), (InterfaceC5044a) this.f29324v);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0265 A[LOOP:0: B:2:0x0010->B:31:0x0265, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0283 A[EDGE_INSN: B:32:0x0283->B:33:0x0283 BREAK  A[LOOP:0: B:2:0x0010->B:31:0x0265], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01d7  */
    @Override // com.google.android.gms.internal.ads.InterfaceC2903a5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C3064d5 h(AbstractC3171f5 abstractC3171f5) {
        H3.q qVar;
        byte[] bArr;
        Throwable c3010c5;
        String str;
        int i;
        int i6;
        Map map;
        byte[] bArr2;
        byte[] bArr3;
        C2991bm c2991bm = this;
        C0344t c0344t = abstractC3171f5.f30041E;
        Comparator comparator = String.CASE_INSENSITIVE_ORDER;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        while (true) {
            try {
                W4 w42 = abstractC3171f5.f30039C;
                if (w42 == null) {
                    map = Collections.EMPTY_MAP;
                } else {
                    HashMap hashMap = new HashMap();
                    String str2 = w42.f28314b;
                    if (str2 != null) {
                        hashMap.put("If-None-Match", str2);
                    }
                    long j6 = w42.f28316d;
                    if (j6 > 0) {
                        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
                        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
                        hashMap.put("If-Modified-Since", simpleDateFormat.format(new Date(j6)));
                    }
                    map = hashMap;
                }
                ((V2) c2991bm.f29323u).getClass();
                qVar = V2.m(abstractC3171f5, map);
                try {
                    int i9 = qVar.f1146a;
                    List unmodifiableList = Collections.unmodifiableList((ArrayList) qVar.f1148c);
                    if (i9 == 304) {
                        SystemClock.elapsedRealtime();
                        W4 w43 = abstractC3171f5.f30039C;
                        if (w43 != null) {
                            TreeSet treeSet = new TreeSet(comparator);
                            if (!unmodifiableList.isEmpty()) {
                                Iterator it = unmodifiableList.iterator();
                                while (it.hasNext()) {
                                    treeSet.add(((Z4) it.next()).f28837a);
                                }
                            }
                            ArrayList arrayList = new ArrayList(unmodifiableList);
                            List list = w43.f28320h;
                            if (list != null) {
                                if (!list.isEmpty()) {
                                    for (Z4 z42 : w43.f28320h) {
                                        if (!treeSet.contains(z42.f28837a)) {
                                            arrayList.add(z42);
                                        }
                                    }
                                }
                            } else if (!w43.f28319g.isEmpty()) {
                                for (Map.Entry entry : w43.f28319g.entrySet()) {
                                    if (!treeSet.contains(entry.getKey())) {
                                        arrayList.add(new Z4((String) entry.getKey(), (String) entry.getValue()));
                                    }
                                }
                            }
                            return new C3064d5(BaseATView.a.f9778O, w43.f28313a, true, arrayList);
                        }
                        try {
                            return new C3064d5(BaseATView.a.f9778O, null, true, unmodifiableList);
                        } catch (IOException e9) {
                            e = e9;
                            bArr = null;
                            if (e instanceof SocketTimeoutException) {
                            }
                            i = c0344t.f2133a;
                            try {
                                i6 = c0344t.f2134b + 1;
                                c0344t.f2134b = i6;
                                c0344t.f2133a = i + i;
                                if (i6 <= 1) {
                                }
                            } catch (C3279h5 e10) {
                                abstractC3171f5.a(str + "-timeout-giveup [timeout=" + i + "]");
                                throw e10;
                            }
                        }
                    } else {
                        C3763q5 c3763q5 = (C3763q5) qVar.f1149d;
                        if (c3763q5 == null) {
                            c3763q5 = null;
                        }
                        if (c3763q5 != null) {
                            int i10 = qVar.f1147b;
                            C3493l5 c3493l5 = (C3493l5) c2991bm.f29324v;
                            C3816r5 c3816r5 = new C3816r5(c3493l5, i10);
                            try {
                                bArr3 = c3493l5.h(1024);
                                while (true) {
                                    try {
                                        int read = c3763q5.read(bArr3);
                                        if (read == -1) {
                                            break;
                                        }
                                        c3816r5.write(bArr3, 0, read);
                                    } catch (Throwable th) {
                                        th = th;
                                        try {
                                            c3763q5.close();
                                            break;
                                        } catch (IOException unused) {
                                            AbstractC3439k5.a("Error occurred when closing InputStream", new Object[0]);
                                        }
                                        c3493l5.n(bArr3);
                                        c3816r5.close();
                                        throw th;
                                    }
                                }
                                byte[] byteArray = c3816r5.toByteArray();
                                try {
                                    c3763q5.close();
                                } catch (IOException unused2) {
                                    AbstractC3439k5.a("Error occurred when closing InputStream", new Object[0]);
                                }
                                c3493l5.n(bArr3);
                                c3816r5.close();
                                bArr2 = byteArray;
                            } catch (Throwable th2) {
                                th = th2;
                                bArr3 = null;
                            }
                        } else {
                            bArr2 = new byte[0];
                        }
                        try {
                            long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                            if (AbstractC3439k5.f31377a || elapsedRealtime2 > com.anythink.expressad.video.module.a.a.m.ai) {
                                AbstractC3439k5.b("HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]", abstractC3171f5, Long.valueOf(elapsedRealtime2), bArr2 != null ? Integer.valueOf(bArr2.length) : "null", Integer.valueOf(i9), Integer.valueOf(c0344t.f2134b));
                            }
                            if (i9 < 200 || i9 > 299) {
                                throw new IOException();
                            }
                            SystemClock.elapsedRealtime();
                            return new C3064d5(i9, bArr2, false, unmodifiableList);
                        } catch (IOException e11) {
                            e = e11;
                            bArr = bArr2;
                            if (e instanceof SocketTimeoutException) {
                                boolean z3 = e instanceof MalformedURLException;
                                String str3 = abstractC3171f5.f30044v;
                                if (z3) {
                                    throw new RuntimeException("Bad URL ".concat(String.valueOf(str3)), e);
                                }
                                if (qVar == null) {
                                    throw new C3117e5(e);
                                }
                                int i11 = qVar.f1146a;
                                AbstractC3439k5.c("Unexpected response code %d for %s", Integer.valueOf(i11), str3);
                                if (bArr != null) {
                                    List<Z4> unmodifiableList2 = Collections.unmodifiableList((ArrayList) qVar.f1148c);
                                    SystemClock.elapsedRealtime();
                                    if (unmodifiableList2 != null) {
                                        if (unmodifiableList2.isEmpty()) {
                                            Map map2 = Collections.EMPTY_MAP;
                                        } else {
                                            TreeMap treeMap = new TreeMap(comparator);
                                            for (Z4 z43 : unmodifiableList2) {
                                                treeMap.put(z43.f28837a, z43.f28838b);
                                            }
                                        }
                                    }
                                    if (unmodifiableList2 != null) {
                                        Collections.unmodifiableList(unmodifiableList2);
                                    }
                                    if (i11 != 401 && i11 != 403) {
                                        if (i11 < 400 || i11 > 499) {
                                            throw new C3010c5();
                                        }
                                        throw new Y4();
                                    }
                                    c3010c5 = new V4();
                                    str = "auth";
                                } else {
                                    c3010c5 = new C3010c5();
                                    str = "network";
                                }
                            } else {
                                c3010c5 = new C3010c5();
                                str = "socket";
                            }
                            i = c0344t.f2133a;
                            i6 = c0344t.f2134b + 1;
                            c0344t.f2134b = i6;
                            c0344t.f2133a = i + i;
                            if (i6 <= 1) {
                                throw c3010c5;
                            }
                            abstractC3171f5.a(str + "-retry [timeout=" + i + "]");
                            c2991bm = this;
                        }
                    }
                } catch (IOException e12) {
                    e = e12;
                }
            } catch (IOException e13) {
                e = e13;
                qVar = null;
            }
            abstractC3171f5.a(str + "-retry [timeout=" + i + "]");
            c2991bm = this;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3613nH
    public Uri i() {
        return ((InterfaceC3613nH) this.f29323u).i();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3613nH
    public Map j() {
        return ((InterfaceC3613nH) this.f29323u).j();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3613nH
    public void k(InterfaceC3727pN interfaceC3727pN) {
        interfaceC3727pN.getClass();
        ((InterfaceC3613nH) this.f29323u).k(interfaceC3727pN);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4050vN
    public int m(byte[] bArr, int i, int i6) {
        return ((InterfaceC3613nH) this.f29323u).m(bArr, i, i6);
    }

    @Override // com.google.android.gms.internal.ads.KD
    /* renamed from: n */
    public void mo11n(Object obj) {
        switch (this.f29322n) {
            case 14:
                List list = ((C2608Ij) obj).f25558a;
                C2659Lj c2659Lj = (C2659Lj) this.f29324v;
                RD rd = c2659Lj.f26163a;
                C3864s c3864s = (C3864s) this.f29323u;
                if (list != null && !list.isEmpty()) {
                    N3.a aVar = ND.f26473u;
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        aVar = QC.t(QC.r(aVar, Throwable.class, new C4164xc(3, c3864s), rd), new C2625Jj(0, c2659Lj, c3864s, (N3.a) it.next()), rd);
                    }
                    aVar.a(new LD(0, aVar, new S0.c(c2659Lj, c3864s)), rd);
                    break;
                } else {
                    rd.execute(new RunnableC2642Kj(c3864s, 0));
                    break;
                }
            case 15:
                ((C3797qm) this.f29324v).m((View) this.f29323u, (C3209fq) obj);
                break;
            case 16:
                ((InterfaceC4061vh) obj).T0((String) this.f29323u, (InterfaceC3249gc) this.f29324v);
                break;
            default:
                String str = (String) obj;
                try {
                    C2705Oe c2705Oe = (C2705Oe) this.f29324v;
                    C2603Ie c2603Ie = (C2603Ie) this.f29323u;
                    Parcel H02 = c2705Oe.H0();
                    H02.writeString(str);
                    AbstractC3388j8.c(H02, c2603Ie);
                    c2705Oe.f1(H02, 1);
                    break;
                } catch (RemoteException e9) {
                    u2.z.l("Service can't call client", e9);
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3613nH
    public void o() {
        ((InterfaceC3613nH) this.f29323u).o();
    }

    @Override // P2.InterfaceC0372b
    public void onConnectionSuspended(int i) {
        ((C3467kg) this.f29323u).c(new RuntimeException(D.y.m(i, "onConnectionSuspended: ", new StringBuilder(String.valueOf(i).length() + 23))));
    }

    @Override // P2.InterfaceC0372b
    public void r() {
        try {
            ((C3467kg) this.f29323u).b((C4056vc) ((W8) ((N1.h) this.f29324v).f1918n).u());
        } catch (DeadObjectException e9) {
            ((C3467kg) this.f29323u).c(e9);
        }
    }

    public String toString() {
        switch (this.f29322n) {
            case 3:
                return "Bounds{lower=" + ((G.e) this.f29323u) + " upper=" + ((G.e) this.f29324v) + "}";
            default:
                return super.toString();
        }
    }

    @Override // com.google.android.gms.internal.ads.KD
    public void w(Throwable th) {
        switch (this.f29322n) {
            case 14:
                ((C3864s) this.f29323u).w(th);
                C2659Lj c2659Lj = (C2659Lj) this.f29324v;
                c2659Lj.getClass();
                AbstractC3413jg.f31273f.execute(new RunnableC3470kj(1, c2659Lj));
                break;
            case 15:
                if (((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.f32338p6)).booleanValue()) {
                    C4835j.f39730C.f39740h.e("omid native display exp", th);
                    break;
                }
                break;
            case 16:
                break;
            default:
                try {
                    C2705Oe c2705Oe = (C2705Oe) this.f29324v;
                    C4920z0 k9 = SK.k(th);
                    u2.m mVar = new u2.m(SK.n(th.getMessage()) ? k9.f40211u : th.getMessage(), k9.f40210n);
                    Parcel H02 = c2705Oe.H0();
                    AbstractC3388j8.c(H02, mVar);
                    c2705Oe.f1(H02, 2);
                    break;
                } catch (RemoteException e9) {
                    u2.z.l("Service can't call client", e9);
                }
        }
    }

    @Override // x2.InterfaceC5189c
    public void x(C4631a c4631a) {
        try {
            String canonicalName = ((BinderC2466Ad) this.f29324v).f23682n.getClass().getCanonicalName();
            int i = c4631a.f38568a;
            String str = c4631a.f38569b;
            String str2 = c4631a.f38570c;
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 41 + String.valueOf(i).length() + 17 + String.valueOf(str).length() + 16 + String.valueOf(str2).length());
            sb.append(canonicalName);
            sb.append("failed to load mediation ad: ErrorCode = ");
            sb.append(i);
            sb.append(". ErrorMessage = ");
            sb.append(str);
            sb.append(". ErrorDomain = ");
            sb.append(str2);
            v2.i.a(sb.toString());
            InterfaceC3841rd interfaceC3841rd = (InterfaceC3841rd) this.f29323u;
            interfaceC3841rd.n3(c4631a.a());
            interfaceC3841rd.O3(i, str);
            interfaceC3841rd.j0(i);
        } catch (RemoteException e9) {
            v2.i.d("", e9);
        }
    }

    public /* synthetic */ C2991bm(Object obj, Object obj2, int i, boolean z3) {
        this.f29322n = i;
        this.f29323u = obj2;
        this.f29324v = obj;
    }

    public C2991bm(N1.h hVar, C3467kg c3467kg) {
        this.f29322n = 10;
        this.f29323u = c3467kg;
        Objects.requireNonNull(hVar);
        this.f29324v = hVar;
    }

    public C2991bm(Context context, int i) {
        Z2.e eVar;
        this.f29322n = i;
        switch (i) {
            case 5:
                this.f29323u = new Z2.g(context, M2.f.f1844b);
                synchronized (Z2.e.class) {
                    try {
                        if (Z2.e.f4167x == null) {
                            Z2.e.f4167x = new Z2.e(context.getApplicationContext());
                        }
                        eVar = Z2.e.f4167x;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                this.f29324v = eVar;
                return;
            default:
                P2.w.h(context);
                Resources resources = context.getResources();
                this.f29323u = resources;
                this.f29324v = resources.getResourcePackageName(C5275R.string.common_google_play_services_unknown_issue);
                return;
        }
    }

    public C2991bm(V2 v22) {
        this.f29322n = 9;
        C3493l5 c3493l5 = new C3493l5(0, false);
        this.f29323u = v22;
        this.f29324v = c3493l5;
    }

    public C2991bm(BinderC2466Ad binderC2466Ad, InterfaceC3841rd interfaceC3841rd) {
        this.f29322n = 11;
        this.f29323u = interfaceC3841rd;
        Objects.requireNonNull(binderC2466Ad);
        this.f29324v = binderC2466Ad;
    }

    public C2991bm(C3309hi c3309hi, Context context, String str) {
        this.f29322n = 13;
        C3351iN a9 = C3351iN.a(context);
        C3243gN c3243gN = c3309hi.f30856O0;
        C4232yq c4232yq = new C4232yq(a9, c3243gN, c3309hi.f30858P0, 5);
        C3243gN a10 = C3243gN.a(new C3320ht(c3243gN, 1));
        C3243gN a11 = C3243gN.a(AbstractC2968bG.J);
        C3243gN a12 = C3243gN.a(new C2709Oi(a9, c3309hi.f30876c, c3309hi.f30851M, c4232yq, a10, a11));
        this.f29323u = C3243gN.a(new C3416jj(a12, a10, a11, 4));
        this.f29324v = C3243gN.a(new C2526Dm(C3351iN.b(str), a12, a9, a10, a11, c3309hi.i, c3309hi.f30853N, c3309hi.f30898o));
    }

    public C2991bm(C3797qm c3797qm, View view) {
        this.f29322n = 15;
        this.f29323u = view;
        Objects.requireNonNull(c3797qm);
        this.f29324v = c3797qm;
    }

    public C2991bm(C3959tn c3959tn, String str, InterfaceC3249gc interfaceC3249gc) {
        this.f29322n = 16;
        this.f29323u = str;
        this.f29324v = interfaceC3249gc;
        Objects.requireNonNull(c3959tn);
    }

    public C2991bm(BinderC2580Gp binderC2580Gp, C2705Oe c2705Oe, C2603Ie c2603Ie) {
        this.f29322n = 17;
        this.f29324v = c2705Oe;
        this.f29323u = c2603Ie;
    }

    public C2991bm(C3908sq c3908sq, C3477kq c3477kq, St st) {
        this.f29322n = 18;
        this.f29323u = c3477kq;
        this.f29324v = st;
        Objects.requireNonNull(c3908sq);
    }

    public C2991bm(C3500lC c3500lC, int[] iArr) {
        this.f29322n = 22;
        this.f29323u = RB.n(c3500lC);
        this.f29324v = iArr;
    }

    public C2991bm(InterfaceC3613nH interfaceC3613nH) {
        this.f29322n = 25;
        this.f29323u = interfaceC3613nH;
        this.f29324v = Uri.EMPTY;
        Map map = Collections.EMPTY_MAP;
    }

    public C2991bm(byte[] bArr, Provider provider) {
        this.f29322n = 24;
        if (WC.c(1)) {
            this.f29323u = new SecretKeySpec(bArr, "AES");
            this.f29324v = provider;
            return;
        }
        throw new GeneralSecurityException("Cannot use AES-CMAC in FIPS-mode, as BoringCrypto module is not available");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2991bm(S0.s sVar) {
        this(23);
        this.f29322n = 23;
        U(this, sVar);
    }

    public C2991bm(X0.G g4) {
        this.f29322n = 29;
        this.f29323u = new E3.u();
        this.f29324v = g4;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2991bm(int i) {
        this(23, new C3481ku(20), new long[10]);
        this.f29322n = i;
        switch (i) {
            case 7:
                this.f29323u = ByteBuffer.allocateDirect(500);
                break;
            case 8:
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
                this.f29323u = byteArrayOutputStream;
                this.f29324v = new DataOutputStream(byteArrayOutputStream);
                break;
            case 21:
                C3105du c3105du = new C3105du(3);
                this.f29323u = c3105du;
                this.f29324v = new C3534lt(5, c3105du);
                break;
            case 23:
                break;
            case 29:
                this.f29323u = new E3.u();
                this.f29324v = null;
                break;
            default:
                this.f29323u = new androidx.lifecycle.C();
                this.f29324v = new U0.k();
                S(J0.x.f1411g0);
                break;
        }
    }

    private final void T(Throwable th) {
    }

    public C2991bm(androidx.fragment.app.N n9) {
        this.f29322n = 6;
        this.f29323u = new CopyOnWriteArrayList();
        this.f29324v = n9;
    }
}
