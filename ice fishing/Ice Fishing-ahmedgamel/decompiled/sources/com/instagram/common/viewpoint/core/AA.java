package com.instagram.common.viewpoint.core;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import com.facebook.ads.androidx.media3.common.Timeline;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: assets/audience_network/classes2.dex */
public final class AA extends AbstractC2405qP implements InterfaceC2313os {
    public static byte[] A0N;
    public static String[] A0O = {"ryR4HSm2zR8tip5OkgYwdb0JWy9e3v2W", "Fm5MoQAoRuRRmRXPK4I4CJ8bYaju2JW1", "syIAGKVT8Ewa7Rni6nktnCNdH4Ja85Gc", "ScHbfbbxkU", "HZJXjhizoNO31MnMnm7FxQnRU8I8lePN", "YCsl9os6nHqs6yB8LR1hlQvfR5oCt3rk", "Ml6mHBX1GsWDWNWH2EtCrt2HpilhtHKz", "59SI8zfcXXU2xe69nRlPKARsr0343GFe"};
    public float A00;
    public int A01;
    public int A02;
    public Surface A03;
    public SurfaceHolder A04;
    public TextureView A05;
    public C2406qQ A06;
    public C2400qI A07;
    public C2400qI A08;
    public C6I A09;
    public C6I A0A;
    public InterfaceC0838Cx A0B;
    public boolean A0C;
    public final Handler A0D;
    public final AC A0E;
    public final SurfaceHolderCallbackC2307om A0F;
    public final InterfaceC2304oj A0G;
    public final CopyOnWriteArraySet<InterfaceC07448p> A0H;
    public final CopyOnWriteArraySet<C3U> A0I;
    public final CopyOnWriteArraySet<InterfaceC0797Bf> A0J;
    public final CopyOnWriteArraySet<GQ> A0K;
    public final CopyOnWriteArraySet<InterfaceC2306ol> A0L;
    public final InterfaceC2309oo[] A0M;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public AA(Context context, InterfaceC07237t interfaceC07237t, AbstractC0889Ew abstractC0889Ew, AnonymousClass74 anonymousClass74, F6 f62, A6 a62, InterfaceC2051kO<AnonymousClass45, InterfaceC2304oj> interfaceC2051kO, AnonymousClass45 anonymousClass45) {
        this.A0F = new SurfaceHolderCallbackC2307om(this);
        this.A0L = new CopyOnWriteArraySet<>();
        this.A0J = new CopyOnWriteArraySet<>();
        this.A0K = new CopyOnWriteArraySet<>();
        this.A0H = new CopyOnWriteArraySet<>();
        Looper myLooper = Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper();
        this.A0D = new Handler(myLooper);
        this.A0M = interfaceC07237t.A5Y(this.A0D, this.A0F, this.A0F, this.A0F, this.A0F, a62);
        this.A00 = 1.0f;
        this.A01 = 0;
        this.A06 = C2406qQ.A07;
        this.A02 = 1;
        this.A0E = A06(this.A0M, abstractC0889Ew, anonymousClass74, f62, anonymousClass45);
        this.A0G = interfaceC2051kO.A4B(anonymousClass45);
        this.A0G.AJf(this.A0E, myLooper);
        this.A0I = new CopyOnWriteArraySet<>();
    }

    public static String A07(int i, int i6, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A0N, i, i + i6);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] - i9) - 61);
        }
        return new String(copyOfRange);
    }

    public static void A0E() {
        A0N = new byte[]{-41, -19, -15, -12, -16, -23, -55, -4, -13, -44, -16, -27, -3, -23, -10, 12, 46, 43, 31, 26, 28, 30, 13, 30, 49, 45, 46, 43, 30, 5, 34, 44, 45, 30, 39, 30, 43, -39, 26, 37, 43, 30, 26, 29, 50, -39, 46, 39, 44, 30, 45, -39, 40, 43, -39, 43, 30, 41, 37, 26, 28, 30, 29, -25};
    }

    static {
        A0E();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.kO != com.google.common.base.Function<com.facebook.ads.androidx.media3.common.util.Clock, com.facebook.ads.androidx.media3.exoplayer.analytics.AnalyticsCollector> */
    public AA(Context context, InterfaceC07237t interfaceC07237t, AbstractC0889Ew abstractC0889Ew, AnonymousClass74 anonymousClass74, F6 f62, A6 a62, InterfaceC2051kO<AnonymousClass45, InterfaceC2304oj> interfaceC2051kO) {
        this(context, interfaceC07237t, abstractC0889Ew, anonymousClass74, f62, a62, interfaceC2051kO, AnonymousClass45.A00);
    }

    @Deprecated
    public AA(InterfaceC07237t interfaceC07237t, AbstractC0889Ew abstractC0889Ew, AnonymousClass74 anonymousClass74, F6 f62, A6 a62) {
        this(null, interfaceC07237t, abstractC0889Ew, anonymousClass74, f62, a62, new InterfaceC2051kO() { // from class: com.facebook.ads.redexgen.X.or
            @Override // com.instagram.common.viewpoint.core.InterfaceC2051kO
            public final Object A4B(Object obj) {
                return new A8((AnonymousClass45) obj);
            }
        });
    }

    private final AC A06(InterfaceC2309oo[] interfaceC2309ooArr, AbstractC0889Ew abstractC0889Ew, AnonymousClass74 anonymousClass74, F6 f62, AnonymousClass45 anonymousClass45) {
        return new AC(interfaceC2309ooArr, abstractC0889Ew, anonymousClass74, f62, anonymousClass45);
    }

    private void A0D() {
        if (this.A05 != null) {
            if (this.A05.getSurfaceTextureListener() != this.A0F) {
                Log.w(A07(0, 15, 71), A07(15, 49, 124));
            } else {
                this.A05.setSurfaceTextureListener(null);
            }
            this.A05 = null;
        }
        if (this.A04 != null) {
            this.A04.removeCallback(this.A0F);
            String[] strArr = A0O;
            if (strArr[6].length() == strArr[3].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0O;
            strArr2[6] = "1mt3T64XRkFMJTK0AHNCLCnfNjMbTppi";
            strArr2[3] = "rnp4JtgfYQ";
            this.A04 = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0F(Surface surface, boolean z3) {
        ArrayList arrayList = new ArrayList();
        for (InterfaceC2309oo interfaceC2309oo : this.A0M) {
            if (interfaceC2309oo.A9N() == 2) {
                arrayList.add(this.A0E.A0L(interfaceC2309oo).A07(1).A08(surface).A06());
            }
        }
        if (this.A03 != null && this.A03 != surface) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((C07077d) it.next()).A0C();
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
            if (this.A0C) {
                this.A03.release();
            }
        }
        this.A03 = surface;
        this.A0C = z3;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC2405qP
    public final void A0H(int i, long j6) {
        this.A0G.ACe();
        this.A0E.A0H(i, j6);
    }

    public final int A0I() {
        return this.A01;
    }

    public final C2400qI A0J() {
        return this.A07;
    }

    public final C2400qI A0K() {
        return this.A08;
    }

    public final void A0L() {
        this.A0E.A0M();
        A0D();
        if (this.A03 != null) {
            if (this.A0C) {
                this.A03.release();
            }
            this.A03 = null;
        }
        if (this.A0B != null) {
            this.A0B.AIS(this.A0G);
            this.A0B = null;
        }
    }

    public final void A0M(float f3) {
        float A00 = C5C.A00(f3, 0.0f, 1.0f);
        if (this.A00 == A00) {
            return;
        }
        this.A00 = A00;
        for (InterfaceC2309oo interfaceC2309oo : this.A0M) {
            if (interfaceC2309oo.A9N() == 1) {
                this.A0E.A0L(interfaceC2309oo).A07(2).A08(Float.valueOf(A00)).A06();
            }
        }
    }

    public final void A0N(Surface surface) {
        A0D();
        A0F(surface, false);
    }

    public final void A0O(C3U c3u) {
        this.A0E.A0O(c3u);
        this.A0I.add(c3u);
    }

    public final void A0P(InterfaceC2306ol interfaceC2306ol) {
        this.A0L.add(interfaceC2306ol);
    }

    public final void A0Q(InterfaceC0838Cx interfaceC0838Cx) {
        A0R(interfaceC0838Cx, true, true);
    }

    public final void A0R(InterfaceC0838Cx interfaceC0838Cx, boolean z3, boolean z6) {
        if (this.A0B != null) {
            this.A0B.AIS(this.A0G);
        }
        this.A0B = interfaceC0838Cx;
        interfaceC0838Cx.A3z(this.A0D, this.A0G);
        this.A0E.A0P(interfaceC0838Cx, z3, z6);
    }

    public final void A0S(boolean z3) {
        this.A0E.A0Q(z3);
    }

    public final boolean A0T() {
        return this.A0E.A0R();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC06033b
    public final long A77() {
        return this.A0E.A77();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC06033b
    public final long A7T() {
        return this.A0E.A7T();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC06033b
    public final int A7Y() {
        return this.A0E.A7Y();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC06033b
    public final int A7Z() {
        return this.A0E.A7Z();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC06033b
    public final int A7b() {
        return this.A0E.A7b();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC06033b
    public final int A7c() {
        return this.A0E.A7c();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC06033b
    public final long A7e() {
        return this.A0E.A7e();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC06033b
    public final Timeline A7g() {
        return this.A0E.A7g();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC06033b
    public final int A7h() {
        return this.A0E.A7h();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC06033b
    public final long A7s() {
        return this.A0E.A7s();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC06033b
    public final long A9J() {
        return this.A0E.A9J();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC06033b
    public final boolean AAd() {
        return this.A0E.AAd();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC06033b
    public final void AKG(boolean z3) {
        this.A0E.AKG(z3);
        if (this.A0B != null) {
            this.A0B.AIS(this.A0G);
            this.A0B = null;
            if (z3) {
                this.A0B = null;
            }
        }
    }
}
