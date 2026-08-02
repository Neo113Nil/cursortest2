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
public final class AA extends AbstractC2425qP implements InterfaceC2333os {
    public static byte[] A0N;
    public static String[] A0O = {"ryR4HSm2zR8tip5OkgYwdb0JWy9e3v2W", "Fm5MoQAoRuRRmRXPK4I4CJ8bYaju2JW1", "syIAGKVT8Ewa7Rni6nktnCNdH4Ja85Gc", "ScHbfbbxkU", "HZJXjhizoNO31MnMnm7FxQnRU8I8lePN", "YCsl9os6nHqs6yB8LR1hlQvfR5oCt3rk", "Ml6mHBX1GsWDWNWH2EtCrt2HpilhtHKz", "59SI8zfcXXU2xe69nRlPKARsr0343GFe"};
    public float A00;
    public int A01;
    public int A02;
    public Surface A03;
    public SurfaceHolder A04;
    public TextureView A05;
    public C2426qQ A06;
    public C2420qI A07;
    public C2420qI A08;
    public C6I A09;
    public C6I A0A;
    public InterfaceC0858Cx A0B;
    public boolean A0C;
    public final Handler A0D;
    public final AC A0E;
    public final SurfaceHolderCallbackC2327om A0F;
    public final InterfaceC2324oj A0G;
    public final CopyOnWriteArraySet<InterfaceC07648p> A0H;
    public final CopyOnWriteArraySet<C3U> A0I;
    public final CopyOnWriteArraySet<InterfaceC0817Bf> A0J;
    public final CopyOnWriteArraySet<GQ> A0K;
    public final CopyOnWriteArraySet<InterfaceC2326ol> A0L;
    public final InterfaceC2329oo[] A0M;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public AA(Context context, InterfaceC07437t interfaceC07437t, AbstractC0909Ew abstractC0909Ew, AnonymousClass74 anonymousClass74, F6 f62, A6 a62, InterfaceC2071kO<AnonymousClass45, InterfaceC2324oj> interfaceC2071kO, AnonymousClass45 anonymousClass45) {
        this.A0F = new SurfaceHolderCallbackC2327om(this);
        this.A0L = new CopyOnWriteArraySet<>();
        this.A0J = new CopyOnWriteArraySet<>();
        this.A0K = new CopyOnWriteArraySet<>();
        this.A0H = new CopyOnWriteArraySet<>();
        Looper myLooper = Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper();
        this.A0D = new Handler(myLooper);
        this.A0M = interfaceC07437t.A5Y(this.A0D, this.A0F, this.A0F, this.A0F, this.A0F, a62);
        this.A00 = 1.0f;
        this.A01 = 0;
        this.A06 = C2426qQ.A07;
        this.A02 = 1;
        this.A0E = A06(this.A0M, abstractC0909Ew, anonymousClass74, f62, anonymousClass45);
        this.A0G = interfaceC2071kO.A4B(anonymousClass45);
        this.A0G.AJf(this.A0E, myLooper);
        this.A0I = new CopyOnWriteArraySet<>();
    }

    public static String A07(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A0N, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            copyOfRange[i9] = (byte) ((copyOfRange[i9] - i6) - 61);
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
    public AA(Context context, InterfaceC07437t interfaceC07437t, AbstractC0909Ew abstractC0909Ew, AnonymousClass74 anonymousClass74, F6 f62, A6 a62, InterfaceC2071kO<AnonymousClass45, InterfaceC2324oj> interfaceC2071kO) {
        this(context, interfaceC07437t, abstractC0909Ew, anonymousClass74, f62, a62, interfaceC2071kO, AnonymousClass45.A00);
    }

    @Deprecated
    public AA(InterfaceC07437t interfaceC07437t, AbstractC0909Ew abstractC0909Ew, AnonymousClass74 anonymousClass74, F6 f62, A6 a62) {
        this(null, interfaceC07437t, abstractC0909Ew, anonymousClass74, f62, a62, new InterfaceC2071kO() { // from class: com.facebook.ads.redexgen.X.or
            @Override // com.instagram.common.viewpoint.core.InterfaceC2071kO
            public final Object A4B(Object obj) {
                return new A8((AnonymousClass45) obj);
            }
        });
    }

    private final AC A06(InterfaceC2329oo[] interfaceC2329ooArr, AbstractC0909Ew abstractC0909Ew, AnonymousClass74 anonymousClass74, F6 f62, AnonymousClass45 anonymousClass45) {
        return new AC(interfaceC2329ooArr, abstractC0909Ew, anonymousClass74, f62, anonymousClass45);
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
    public void A0F(Surface surface, boolean z6) {
        ArrayList arrayList = new ArrayList();
        for (InterfaceC2329oo interfaceC2329oo : this.A0M) {
            if (interfaceC2329oo.A9N() == 2) {
                arrayList.add(this.A0E.A0L(interfaceC2329oo).A07(1).A08(surface).A06());
            }
        }
        if (this.A03 != null && this.A03 != surface) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((C07277d) it.next()).A0C();
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
            if (this.A0C) {
                this.A03.release();
            }
        }
        this.A03 = surface;
        this.A0C = z6;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC2425qP
    public final void A0H(int i, long j6) {
        this.A0G.ACe();
        this.A0E.A0H(i, j6);
    }

    public final int A0I() {
        return this.A01;
    }

    public final C2420qI A0J() {
        return this.A07;
    }

    public final C2420qI A0K() {
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

    public final void A0M(float f2) {
        float A00 = C5C.A00(f2, 0.0f, 1.0f);
        if (this.A00 == A00) {
            return;
        }
        this.A00 = A00;
        for (InterfaceC2329oo interfaceC2329oo : this.A0M) {
            if (interfaceC2329oo.A9N() == 1) {
                this.A0E.A0L(interfaceC2329oo).A07(2).A08(Float.valueOf(A00)).A06();
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

    public final void A0P(InterfaceC2326ol interfaceC2326ol) {
        this.A0L.add(interfaceC2326ol);
    }

    public final void A0Q(InterfaceC0858Cx interfaceC0858Cx) {
        A0R(interfaceC0858Cx, true, true);
    }

    public final void A0R(InterfaceC0858Cx interfaceC0858Cx, boolean z6, boolean z9) {
        if (this.A0B != null) {
            this.A0B.AIS(this.A0G);
        }
        this.A0B = interfaceC0858Cx;
        interfaceC0858Cx.A3z(this.A0D, this.A0G);
        this.A0E.A0P(interfaceC0858Cx, z6, z9);
    }

    public final void A0S(boolean z6) {
        this.A0E.A0Q(z6);
    }

    public final boolean A0T() {
        return this.A0E.A0R();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC06233b
    public final long A77() {
        return this.A0E.A77();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC06233b
    public final long A7T() {
        return this.A0E.A7T();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC06233b
    public final int A7Y() {
        return this.A0E.A7Y();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC06233b
    public final int A7Z() {
        return this.A0E.A7Z();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC06233b
    public final int A7b() {
        return this.A0E.A7b();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC06233b
    public final int A7c() {
        return this.A0E.A7c();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC06233b
    public final long A7e() {
        return this.A0E.A7e();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC06233b
    public final Timeline A7g() {
        return this.A0E.A7g();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC06233b
    public final int A7h() {
        return this.A0E.A7h();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC06233b
    public final long A7s() {
        return this.A0E.A7s();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC06233b
    public final long A9J() {
        return this.A0E.A9J();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC06233b
    public final boolean AAd() {
        return this.A0E.AAd();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC06233b
    public final void AKG(boolean z6) {
        this.A0E.AKG(z6);
        if (this.A0B != null) {
            this.A0B.AIS(this.A0G);
            this.A0B = null;
            if (z6) {
                this.A0B = null;
            }
        }
    }
}
