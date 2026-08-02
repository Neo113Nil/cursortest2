package com.instagram.common.viewpoint.core;

import android.R;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.WindowMetrics;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.inputmethod.InputMethodManager;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.anythink.basead.exoplayer.f;
import com.anythink.expressad.video.module.a.a;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.5F, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public final class C5F extends AbstractC0999Ij {
    public static byte[] A0o;
    public static String[] A0p = {"uilIZmuHzpP0N9Y8quer6Kb2u", "9UUD4l8CpJqeXgkdEQyriIYmJbPiqOP7", "EZE4mnuFogdbCIqsVVCLHtYnmK0aZj", "syebs7ncPc1rj4O1rMWtVdBIydy8e5", "8mpGklwdfsm8yo", "l0wQPHeYLTHnG4", "V5rJxyMt8frjvUGIYtzHbFROecFIJypl", "I99F1f62ejGluaFUQtWt4OKUQ"};
    public static final int A0q;
    public static final int A0r;
    public static final int A0s;
    public static final int A0t;
    public static final int A0u;
    public static final int A0v;
    public static final int A0w;
    public static final int A0x;
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public Handler A08;
    public InputMethodManager A09;
    public LinearLayout A0A;
    public LinearLayout A0B;
    public TextView A0C;
    public C1118Na A0D;
    public M6 A0E;
    public C1489ah A0F;
    public M3 A0G;
    public C1609cd A0H;
    public EnumC1747et A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public final int A0U;
    public final AbstractC1112Mt A0V;
    public final C1860gi A0W;
    public final VI A0X;
    public final AbstractC1395Yb A0Y;
    public final InterfaceC1680dm A0Z;
    public final C0907Eu A0a;
    public final C0897Ek A0b;
    public final C4L A0c;
    public final EA A0d;
    public final E8 A0e;
    public final E4 A0f;
    public final E2 A0g;
    public final E0 A0h;
    public final AbstractC0886Dz A0i;
    public final C0866Df A0j;
    public final DZ A0k;
    public final Runnable A0l;
    public final boolean A0m;
    public final boolean A0n;

    public static String A0L(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A0o, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            copyOfRange[i9] = (byte) ((copyOfRange[i9] - i6) - 55);
        }
        return new String(copyOfRange);
    }

    public static void A0X() {
        byte[] bArr = {-15, -6, -9, -15, -7, -19, 1, -3, 3, 0, -15, -13, -68, -63, -61, -56, -57, -78, -64, -72, -57, -69, -62, -73, -26, -28, -42, -29, -44, -35, -38, -44, -36, -48, -41, -38, -35, -27, -42, -29, -42, -43, -40, -54, -49, -59, -48, -40, 47};
        String[] strArr = A0p;
        if (strArr[4].length() != strArr[5].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0p;
        strArr2[4] = "nVqp18ph7ekHb6";
        strArr2[5] = "wg1nH4uIQgdKmM";
        A0o = bArr;
    }

    static {
        A0X();
        A0q = (int) (XX.A02 * 4.0f);
        A0r = (int) (XX.A02 * 8.0f);
        A0s = P3.A02(-1, 77);
        A0w = (int) (XX.A02 * 26.0f);
        A0x = (int) (XX.A02 * 12.0f);
        A0u = (int) (XX.A02 * 12.0f);
        A0v = (int) (XX.A02 * 44.0f);
        A0t = XV.A0v;
    }

    public C5F(C1860gi c1860gi, VA va, AbstractC1395Yb abstractC1395Yb, AbstractC2025jd abstractC2025jd, C1266Sx c1266Sx, ZU zu, int i, InterfaceC1401Yh interfaceC1401Yh, VI vi, int i4, boolean z6, boolean z9, InterfaceC1680dm interfaceC1680dm, int i6, int i9) {
        super(c1860gi, zu, va, abstractC2025jd, i, z6, z9, interfaceC1401Yh, i9);
        C1118Na A00;
        this.A03 = 0;
        this.A0J = false;
        this.A0Q = false;
        this.A0N = false;
        this.A0P = false;
        this.A0O = false;
        this.A0M = false;
        this.A07 = 0;
        this.A02 = 0;
        this.A0R = true;
        this.A0l = new RunnableC1665dX(this);
        this.A0L = false;
        this.A0T = false;
        this.A01 = 0.0f;
        this.A0h = new E0() { // from class: com.facebook.ads.redexgen.X.5R
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.instagram.common.viewpoint.core.UN
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(E1 e12) {
                C5F.this.A0T = true;
            }
        };
        this.A0g = new E2() { // from class: com.facebook.ads.redexgen.X.5P
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.instagram.common.viewpoint.core.UN
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(E3 e32) {
                if (!((AbstractC0999Ij) C5F.this).A0A.A07()) {
                    C5F.this.A1F();
                }
            }
        };
        this.A0f = new E4() { // from class: com.facebook.ads.redexgen.X.5M
            @Override // com.instagram.common.viewpoint.core.UN
            public final /* bridge */ /* synthetic */ void A03(C4B c4b) {
            }
        };
        this.A0i = new AbstractC0886Dz() { // from class: com.facebook.ads.redexgen.X.5K
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.instagram.common.viewpoint.core.UN
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C4A c4a) {
                float f2;
                C0897Ek c0897Ek;
                InterfaceC1680dm interfaceC1680dm2;
                C5F.this.A0f(c4a);
                f2 = C5F.this.A01;
                c0897Ek = C5F.this.A0b;
                float duration = (f2 * c0897Ek.getDuration()) + c4a.A00();
                interfaceC1680dm2 = C5F.this.A0Z;
                interfaceC1680dm2.ADw(duration);
            }
        };
        this.A0d = new EA() { // from class: com.facebook.ads.redexgen.X.5J
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.instagram.common.viewpoint.core.UN
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C4K c4k) {
                InterfaceC1680dm interfaceC1680dm2;
                C0897Ek c0897Ek;
                C0897Ek c0897Ek2;
                interfaceC1680dm2 = C5F.this.A0Z;
                c0897Ek = C5F.this.A0b;
                interfaceC1680dm2.ADc(c0897Ek.getDuration());
                C5F.A03(C5F.this, 1.0f);
                c0897Ek2 = C5F.this.A0b;
                c0897Ek2.A0e(EnumC1747et.A02, 28);
            }
        };
        this.A0e = new C5G(this);
        this.A0Y = abstractC1395Yb;
        this.A0U = i6;
        this.A08 = new Handler(Looper.getMainLooper());
        this.A09 = (InputMethodManager) c1860gi.getSystemService(A0L(12, 12, 28));
        this.A0V = C1113Mu.A01(c1860gi, va, abstractC2025jd.A2E(), XB.A00(abstractC2025jd.A29().A0J().A05()), new HashMap(), false, true, abstractC2025jd.A2A());
        this.A0W = c1860gi;
        this.A0X = vi;
        this.A0j = new C0866Df(this.A0W, this.A0X);
        this.A0k = new DZ(this.A0W, -1);
        this.A0Z = interfaceC1680dm;
        if (i4 == 1) {
            A00 = super.A06.A28().A01();
        } else {
            A00 = super.A06.A28().A00();
        }
        this.A0D = A00;
        this.A0b = new C0897Ek(this.A0W);
        this.A0b.getEventBus().A03(this.A0h, this.A0g, this.A0f, this.A0i, this.A0d, this.A0e);
        this.A0c = new C4L(c1860gi, va, this.A0b, abstractC2025jd.A2E());
        A0U();
        String videoUrl = super.A06.A29().A0H().A09();
        this.A0b.setVideoURI(c1266Sx.A0T(videoUrl));
        A0R();
        A0O();
        A0N();
        C1860gi c1860gi2 = this.A0W;
        String videoUrl2 = abstractC2025jd.A29().A0H().A08();
        AbstractC1561br.A00(c1860gi2, this, videoUrl2);
        setupLayoutConfiguration(false);
        A0T();
        A0S();
        postDelayed(new C0982Hs(this), 1000L);
        if (C1310Up.A1z(this.A0W)) {
            VM A0B = this.A0W.A0B();
            C0897Ek c0897Ek = this.A0b;
            String videoUrl3 = super.A06.A2E();
            A0B.AKn(c0897Ek, videoUrl3, true);
        }
        if (C1310Up.A20(this.A0W)) {
            this.A0a = new C0907Eu(this.A0W, va, this.A0b, super.A06.A2E(), false, this.A0c, null);
        } else {
            this.A0a = null;
        }
        A0Y(abstractC2025jd.A29());
        this.A0m = super.A06.A1m();
        this.A0n = super.A06.A1z();
        c1860gi.A0F().ACI(this.A0m, this.A0n, true);
    }

    public static /* synthetic */ float A03(C5F c5f, float f2) {
        float f9 = c5f.A01 + f2;
        c5f.A01 = f9;
        return f9;
    }

    public static /* synthetic */ int A05(C5F c5f) {
        int i = c5f.A02;
        c5f.A02 = i + 1;
        return i;
    }

    public static /* synthetic */ int A07(C5F c5f) {
        int i = c5f.A07;
        c5f.A07 = i + 1;
        return i;
    }

    private void A0M() {
        YB.A0J(this.A0B);
        this.A0B = new LinearLayout(this.A0W);
        YB.A0U(this.A0B, this.A0W);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, this.A0J ? this.A04 / 4 : this.A04 / 5);
        layoutParams.addRule(12);
        this.A0B.setLayoutParams(layoutParams);
        addView(this.A0B, 2);
    }

    private void A0N() {
        this.A0k.A08(-1, A0s, false);
        this.A0k.setPadding(A0x, A0x, A0x, A0x);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, A0w);
        layoutParams.addRule(12);
        addView(this.A0k, layoutParams);
    }

    private void A0O() {
        this.A0j.setPadding(A0u, A0u, A0u, A0u);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(A0v, A0v);
        layoutParams.setMargins(0, AbstractC1395Yb.A00, A0t, 0);
        layoutParams.addRule(11);
        layoutParams.addRule(10);
        ViewGroup.LayoutParams videoViewParams = new RelativeLayout.LayoutParams(-1, -1);
        addView(this.A0b, videoViewParams);
        addView(this.A0j, layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0P() {
        if (super.A06.A1e() && this.A0L) {
            this.A0L = false;
            A0h(A0L(24, 18, 58));
        }
    }

    private void A0Q() {
        if (super.A06.A1e() && this.A0L) {
            this.A0L = false;
            Map<String, String> A05 = new C1517b9().A03(null).A02(null).A05();
            A05.put(A0L(0, 12, 87), A0L(24, 18, 58));
            super.A08.AB6(super.A06.A2E(), A05);
        }
    }

    private void A0R() {
        postDelayed(new C0985Hv(this), C1310Up.A0P(this.A0W));
    }

    private void A0S() {
        YB.A0J(this.A0A);
        this.A0A = new LinearLayout(this.A0W);
        this.A0A.setOrientation(1);
        YB.A0K(this.A0A);
        A0V();
        this.A0A.setBackgroundColor(-1);
        addView(this.A0A);
    }

    private void A0T() {
        View view = this.A0b;
        if (super.A06.A1e()) {
            view.setOnClickListener(new ViewOnClickListenerC1667dZ(this));
        }
        YB.A0J(view);
        YB.A0K(view);
        RelativeLayout.LayoutParams mediaLayoutParams = new RelativeLayout.LayoutParams(-1, -2);
        mediaLayoutParams.addRule(15);
        addView(view, 1, mediaLayoutParams);
        this.A0C = new TextView(this.A0W);
        View mMediaView = this.A0C;
        YB.A0K(mMediaView);
        this.A0C.setGravity(17);
        this.A0C.setTextColor(getColors().A06(true));
        this.A0C.setEllipsize(TextUtils.TruncateAt.END);
        this.A0C.setMaxLines(2);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(12);
        layoutParams.setMargins(A0r, A0r / 2, A0r, A0w);
        View mMediaView2 = this.A0C;
        addView(mMediaView2, layoutParams);
        View mMediaView3 = this.A0C;
        YB.A0K(mMediaView3);
        this.A0H = new C1609cd(this.A0W, null, super.A06, super.A08, super.A0B, super.A0D, super.A0A, getColors(), new I4(this));
        View mMediaView4 = this.A0H;
        YB.A0G(1001, mMediaView4);
        View mMediaView5 = this.A0H;
        addView(mMediaView5);
        A0W();
        A0M();
        if (C1310Up.A17(this.A0W)) {
            this.A0B.setOnClickListener(new ViewOnClickListenerC1659dR(this));
            View mMediaView6 = this.A0Y;
            if (mMediaView6 != null) {
                this.A0Y.setCTAClickListener(new ViewOnClickListenerC1660dS(this));
            }
        }
    }

    private void A0U() {
        this.A0b.A0f(this.A0k);
        this.A0b.A0f(this.A0j);
        if (!TextUtils.isEmpty(super.A06.A29().A0H().A08())) {
            C3S c3s = new C3S(this.A0W);
            this.A0b.A0f(c3s);
            c3s.setImage(super.A06.A29().A0H().A08());
        }
        this.A0b.A0f(new C3B(this.A0W));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0V() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, this.A05);
        if (this.A0K) {
            layoutParams.setMargins(0, this.A05 / 5, 0, 0);
            layoutParams.addRule(12);
            this.A0A.setLayoutParams(layoutParams);
        } else {
            layoutParams.setMargins(0, this.A05 + 1, 0, 0);
        }
        LinearLayout linearLayout = this.A0A;
        String[] strArr = A0p;
        if (strArr[4].length() != strArr[5].length()) {
            throw new RuntimeException();
        }
        A0p[1] = "4k5LHuHIhnjzZvLx7p7MkTP5YYpiYy7M";
        linearLayout.setTranslationY(0.0f);
        this.A0A.setLayoutParams(layoutParams);
    }

    private void A0W() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, this.A0J ? this.A04 / 4 : this.A04 / 5);
        layoutParams.addRule(14);
        layoutParams.addRule(2, this.A0C.getId());
        layoutParams.setMargins(0, 0, 0, 0);
        this.A0H.setLayoutParams(layoutParams);
    }

    private void A0Y(NR nr) {
        double A00 = AbstractC1564bu.A00(nr);
        String A0F = nr.A0I().A0F();
        if (A0F == null || A0F.trim().length() == 0) {
            YB.A0O(this.A0B, 8);
            if (C1310Up.A17(this.A0W)) {
                this.A0B.setClickable(false);
            }
        } else {
            this.A0C.setText(A0F);
            if (C1310Up.A17(this.A0W)) {
                this.A0B.setClickable(true);
            }
        }
        if (A00 > 0.0d) {
            this.A03 = (int) (this.A06 / A00);
        }
        this.A03 = this.A0J ? this.A04 : this.A03;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0f(C4A c4a) {
        if (this.A0b.getState() == EnumC1802fm.A02 && C1310Up.A1e(this.A0W)) {
            postDelayed(new C0983Ht(this, c4a), f.f7973a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0g(String str) {
        M3 m32;
        YB.A0J(this.A0G);
        I1 i12 = new I1(this);
        if (this.A0W.A0E() == null) {
            this.A0W.A0F().A9v();
        }
        boolean A02 = AbstractC1311Uq.A02(this.A0W);
        if (A0p[6].charAt(12) != 'v') {
            throw new RuntimeException();
        }
        String[] strArr = A0p;
        strArr[4] = "Q7cFr2gPd7sCHl";
        strArr[5] = "KP59UR8sut1qsy";
        if (A02 || this.A0W.A0E() == null) {
            m32 = new M3(this.A0W, i12);
        } else {
            m32 = new M3(this.A0W, this.A0W.A0E(), i12);
        }
        this.A0G = m32;
        this.A0G.setOnTouchListener(new ViewOnTouchListenerC1661dT(this));
        setUpBrowserControls(this.A0G);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        layoutParams.weight = 0.9f;
        this.A0A.addView(this.A0G, layoutParams);
        this.A0G.loadUrl(str);
    }

    private void A0h(String str) {
        Map<String, String> A05 = new C1517b9().A03(null).A02(null).A05();
        A05.put(A0L(0, 12, 87), str);
        this.A0X.A04(VH.A0J, A05);
        super.A0B.A4j(super.A06.A0w());
        super.A08.ABM(super.A06.A2E(), A05);
        if (C1310Up.A2U(this.A0W)) {
            HashMap hashMap = new HashMap();
            hashMap.put(AbstractC2064kH.A04, Boolean.TRUE.toString());
            hashMap.put(AbstractC2064kH.A05, Boolean.TRUE.toString());
            hashMap.put(AbstractC2064kH.A06, Boolean.TRUE.toString());
            super.A08.ABn(super.A06.A2E(), hashMap);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0i(String str) {
        if (super.A06.A25() > 0) {
            if (super.A06.A2O()) {
                boolean z6 = this.A0M;
                if (A0p[1].charAt(27) != 'i') {
                    throw new RuntimeException();
                }
                String[] strArr = A0p;
                strArr[4] = "wgFga5xemtqUSQ";
                strArr[5] = "c72BHAWejdxIIo";
                if (z6) {
                    return;
                }
            }
            this.A0M = true;
            A0h(str);
            return;
        }
        boolean A1d = super.A06.A1d();
        if (A0p[1].charAt(27) == 'i') {
            String[] strArr2 = A0p;
            strArr2[4] = "tZ3pnOdiXKjC0M";
            strArr2[5] = "WpWfv8IGy682Ke";
            if (!A1d) {
                return;
            }
        } else if (!A1d) {
            return;
        }
        A0P();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0j(boolean z6) {
        if (!z6 && this.A0m && !this.A0R) {
            return;
        }
        this.A0K = z6;
        ObjectAnimator objectAnimator = null;
        if (!z6) {
            this.A08.removeCallbacksAndMessages(null);
        } else {
            this.A02 = 0;
            this.A07 = 0;
            this.A0N = false;
            this.A0O = false;
            this.A0P = false;
            this.A0M = false;
        }
        String A0L = A0L(48, 1, a.f22515R);
        if (z6) {
            objectAnimator = ObjectAnimator.ofFloat(this.A0H, A0L, this.A0H.getY(), this.A05 / 5);
        }
        LinearLayout linearLayout = this.A0A;
        float y7 = this.A0A.getY();
        int i = this.A05;
        if (z6) {
            i /= 5;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(linearLayout, A0L, y7, i);
        ofFloat.setDuration(500L);
        ObjectAnimator browserTransAnim = ObjectAnimator.ofFloat(this.A0b, A0L, this.A0b.getY(), 0.0f);
        browserTransAnim.setDuration(500L);
        int height = this.A0b.getHeight();
        int i4 = this.A05;
        if (z6) {
            i4 /= 5;
        }
        ValueAnimator duration = ValueAnimator.ofInt(height, i4).setDuration(500L);
        duration.addUpdateListener(new C1663dV(this));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        animatorSet.playTogether(ofFloat, browserTransAnim, duration);
        if (objectAnimator != null) {
            objectAnimator.setDuration(500L);
            animatorSet.playTogether(objectAnimator);
        }
        animatorSet.addListener(new C1664dW(this, z6));
        if (this.A0n) {
            this.A0b.A0c(animatorSet, z6);
        }
        animatorSet.start();
    }

    private void A0k(boolean z6) {
        RelativeLayout.LayoutParams layoutParams;
        setupLayoutConfiguration(z6);
        YB.A0J(this.A0b);
        if (this.A0K) {
            layoutParams = new RelativeLayout.LayoutParams(-1, this.A05 / 5);
            layoutParams.addRule(14);
            layoutParams.addRule(10);
        } else {
            layoutParams = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams.addRule(13);
            A0S();
        }
        this.A0b.setTranslationY(0.0f);
        addView(this.A0b, 1, layoutParams);
        A0M();
        A0W();
    }

    private void A0l(boolean z6, int i) {
        this.A0W.A0F().ACG(!z6, i);
        if (this.A0E == null) {
            return;
        }
        this.A0E.setCloseButtonVisibility(z6 ? 0 : 4);
    }

    private final boolean A0m() {
        return this.A0K;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0999Ij
    public final EnumC1109Mq A1D(String str) {
        if (!A0m()) {
            EnumC1109Mq A02 = this.A0H.A02(str);
            String[] strArr = A0p;
            if (strArr[2].length() != strArr[3].length()) {
                throw new RuntimeException();
            }
            A0p[1] = "gDqV8VnRL5n4dziTmRcIoSoDocYisV3G";
            return A02;
        }
        return EnumC1109Mq.A09;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0999Ij
    public final void A1E() {
        A0Q();
        if (C1310Up.A1z(this.A0W)) {
            this.A0W.A0B().AKU(this.A0b);
        }
        if (this.A0a != null) {
            C0907Eu c0907Eu = this.A0a;
            if (A0p[6].charAt(12) != 'v') {
                throw new RuntimeException();
            }
            A0p[6] = "qZF2LURQ0N2avpQsVigAjVMCIAfnIk4T";
            c0907Eu.A07();
        }
        if (this.A0b != null) {
            this.A0b.getEventBus().A04(this.A0h, this.A0g, this.A0f, this.A0i, this.A0d, this.A0e);
            YB.A0H(this.A0b);
            this.A0b.A0W();
        }
        this.A0c.A0p();
        YB.A0d(this.A0b, this.A0k, this.A0j);
        super.A0D.A0V();
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0999Ij
    public final void A1G() {
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0999Ij
    public final void A1H() {
        C0897Ek c0897Ek = this.A0b;
        int secondsForNextCta = super.A06.A29().A0H().A0A() ? 0 : 1065353216;
        c0897Ek.setVolume(secondsForNextCta);
        this.A0b.A0e(EnumC1747et.A02, 20);
        int A02 = super.A06.A29().A0H().A02();
        if (A02 != 0) {
            int secondsForNextCta2 = this.A0U;
            if (A02 < secondsForNextCta2) {
                if (A02 <= 0) {
                    return;
                }
                this.A0Y.setProgressSpinnerInvisible(true);
                new XO(A02, new C0987Hx(this)).A07();
                return;
            }
        }
        this.A0Y.setToolbarActionMode(8);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0999Ij
    public final void A1I(boolean z6) {
        this.A0R = z6;
        A0l(z6, 4);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0999Ij
    public final void A1J(boolean z6) {
        if (this.A0b.A0n()) {
            return;
        }
        this.A0I = this.A0b.getVideoStartReason();
        this.A0S = z6;
        this.A0b.A0i(false, 13);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0999Ij
    public final void A1K(boolean z6) {
        if (this.A0b.getState() != EnumC1802fm.A06) {
            EnumC1747et enumC1747et = this.A0I;
            String[] strArr = A0p;
            if (strArr[4].length() != strArr[5].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0p;
            strArr2[4] = "XPxqC5lbhdZAQT";
            strArr2[5] = "OGUEg1S7IFb9ga";
            if (enumC1747et != null) {
                if (!this.A0S || z6) {
                    this.A0b.A0e(this.A0I, 19);
                }
            }
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0999Ij
    public final boolean A1L() {
        return false;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0999Ij
    public final boolean A1M() {
        return false;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0999Ij
    public final boolean A1N() {
        return true;
    }

    public final boolean A1O() {
        return !A0m();
    }

    public C1118Na getColors() {
        return this.A0D;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0999Ij
    public C1678dk getFullScreenAdStyle() {
        return new C1678dk(true, C1678dk.A06, super.A06.A28().A01(), ViewOnClickListenerC1058Kr.A05(super.A06), super.A06.A28().A01().A08(true), super.A06.A29().A0H().A08());
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0999Ij
    public Y2 getTouchDataRecorder() {
        return super.A0A;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0999Ij, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        A0k(A0m());
        setupLayoutConfiguration(A0m());
        A0V();
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z6) {
        super.onWindowFocusChanged(z6);
        if (z6) {
            A1K(false);
        } else {
            A1J(false);
        }
    }

    private void setUpBrowserControls(M3 m32) {
        YB.A0J(this.A0E);
        this.A0E = new M6(this.A0W, m32, true, this.A0n);
        if (this.A0m) {
            A0l(this.A0R, 1);
        }
        m32.setBrowserNavigationListener(this.A0E.getBrowserNavigationListener());
        YB.A0K(this.A0E);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.weight = 0.1f;
        this.A0E.setListener(new C0988Hy(this));
        this.A0E.setOnTouchListener(new ViewOnTouchListenerC1662dU(this));
        this.A0A.addView(this.A0E, layoutParams);
        YB.A0J(this.A0F);
        this.A0F = new C1489ah(this.A0W, null, R.attr.progressBarStyleHorizontal);
        this.A0A.addView(this.A0F, new LinearLayout.LayoutParams(-1, A0q));
    }

    private void setupLayoutConfiguration(boolean z6) {
        this.A0J = getResources().getConfiguration().orientation == 2;
        this.A0K = z6;
        this.A04 = Resources.getSystem().getDisplayMetrics().heightPixels;
        this.A06 = Resources.getSystem().getDisplayMetrics().widthPixels;
        Point point = new Point();
        WindowManager windowManager = (WindowManager) this.A0W.getSystemService(A0L(42, 6, 42));
        if (windowManager != null) {
            if (Build.VERSION.SDK_INT >= 30) {
                WindowMetrics windowMetrics = windowManager.getCurrentWindowMetrics();
                point.y = windowMetrics.getBounds().bottom - windowMetrics.getBounds().top;
            } else {
                windowManager.getDefaultDisplay().getRealSize(point);
            }
        }
        this.A05 = point.y > 0 ? point.y : this.A04;
        this.A03 = this.A04;
    }
}
