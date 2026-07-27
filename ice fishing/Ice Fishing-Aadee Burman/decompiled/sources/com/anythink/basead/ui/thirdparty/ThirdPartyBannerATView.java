package com.anythink.basead.ui.thirdparty;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.anythink.basead.exoplayer.f.f;
import com.anythink.basead.mixad.f.b;
import com.anythink.basead.ui.BaseATView;
import com.anythink.basead.ui.BaseBannerATView;
import com.anythink.basead.ui.CloseImageView;
import com.anythink.basead.ui.ScanningAnimButton;
import com.anythink.core.api.BaseAd;
import com.anythink.core.common.h.w;
import com.anythink.core.common.h.x;
import com.anythink.core.common.h.y;
import com.anythink.core.common.l.e.a.d;
import com.anythink.core.common.res.b;
import com.anythink.core.common.res.e;
import com.anythink.core.common.ui.component.RoundImageView;
import com.anythink.core.common.v.am;
import com.anythink.core.common.v.q;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class ThirdPartyBannerATView extends BaseBannerATView implements d {

    /* renamed from: A, reason: collision with root package name */
    private ViewGroup f11310A;

    /* renamed from: B, reason: collision with root package name */
    private com.anythink.core.common.l.g.d f11311B;

    /* renamed from: C, reason: collision with root package name */
    private FrameLayout f11312C;

    /* renamed from: D, reason: collision with root package name */
    private FrameLayout f11313D;

    /* renamed from: E, reason: collision with root package name */
    private LinearLayout f11314E;

    /* renamed from: F, reason: collision with root package name */
    private TextView f11315F;

    /* renamed from: G, reason: collision with root package name */
    private TextView f11316G;

    /* renamed from: H, reason: collision with root package name */
    private ScanningAnimButton f11317H;

    /* renamed from: I, reason: collision with root package name */
    private RoundImageView f11318I;
    private View J;

    /* renamed from: K, reason: collision with root package name */
    private View f11319K;

    /* renamed from: L, reason: collision with root package name */
    private List<Integer> f11320L;

    /* renamed from: M, reason: collision with root package name */
    private boolean f11321M;

    /* renamed from: N, reason: collision with root package name */
    private TextView f11322N;

    /* renamed from: O, reason: collision with root package name */
    private String f11323O;

    /* renamed from: P, reason: collision with root package name */
    private com.anythink.basead.mixad.f.b f11324P;

    /* renamed from: Q, reason: collision with root package name */
    private Context f11325Q;

    /* renamed from: com.anythink.basead.ui.thirdparty.ThirdPartyBannerATView$1, reason: invalid class name */
    public class AnonymousClass1 implements b.a {
        public AnonymousClass1() {
        }

        @Override // com.anythink.core.common.res.b.a
        public final void onFail(String str, String str2) {
        }

        @Override // com.anythink.core.common.res.b.a
        public final void onSuccess(String str, Bitmap bitmap) {
            if (TextUtils.equals(((BaseATView) ThirdPartyBannerATView.this).f9736g.z(), str)) {
                ThirdPartyBannerATView.this.f11318I.setImageBitmap(bitmap);
            }
        }
    }

    /* renamed from: com.anythink.basead.ui.thirdparty.ThirdPartyBannerATView$2, reason: invalid class name */
    public class AnonymousClass2 implements b.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f11327a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ RoundImageView f11328b;

        public AnonymousClass2(String str, RoundImageView roundImageView) {
            this.f11327a = str;
            this.f11328b = roundImageView;
        }

        @Override // com.anythink.core.common.res.b.a
        public final void onFail(String str, String str2) {
        }

        @Override // com.anythink.core.common.res.b.a
        public final void onSuccess(String str, Bitmap bitmap) {
            if (TextUtils.equals(this.f11327a, str)) {
                this.f11328b.setImageBitmap(bitmap);
            }
        }
    }

    public ThirdPartyBannerATView(Context context) {
        super(context);
        this.f11321M = false;
        this.f11323O = "";
        this.f11325Q = context;
    }

    private void A() {
        this.f11312C = (FrameLayout) f.k(this, "myoffer_main_resouce_container", "id");
        this.f11313D = (FrameLayout) f.k(this, "myoffer_banner_icon_container", "id");
        this.f11314E = (LinearLayout) f.k(this, "ll_title_desc", "id");
        this.f11318I = (RoundImageView) f.k(this, "myoffer_banner_icon", "id");
        this.f11315F = (TextView) f.k(this, "myoffer_banner_ad_title", "id");
        this.f11316G = (TextView) f.k(this, "myoffer_banner_desc", "id");
        this.f11317H = (ScanningAnimButton) f.k(this, "myoffer_banner_ad_install_btn", "id");
        this.f11322N = (TextView) f.k(this, "myoffer_banner_ad_from", "id");
        CloseImageView closeImageView = (CloseImageView) f.k(this, "myoffer_banner_close", "id");
        this.f9815b = closeImageView;
        ScanningAnimButton scanningAnimButton = this.f11317H;
        if (scanningAnimButton != null) {
            scanningAnimButton.startAnimation(1);
        }
        a(this.f11322N, this.f11311B.getAdFrom());
        if (closeImageView != null) {
            if (this.f11321M) {
                closeImageView.setVisibility(0);
            } else {
                closeImageView.setVisibility(8);
            }
        }
        View adIconView = this.f11311B.getAdIconView();
        this.J = adIconView;
        if (adIconView != null) {
            if (adIconView.getParent() != null && (this.J.getParent() instanceof ViewGroup)) {
                ((ViewGroup) this.J.getParent()).removeView(this.J);
            }
            this.f11313D.removeAllViews();
            this.f11313D.addView(this.J, new FrameLayout.LayoutParams(-1, -1));
        } else if (TextUtils.isEmpty(this.f9736g.z()) || this.f11318I == null) {
            FrameLayout frameLayout = this.f11313D;
            if (frameLayout != null) {
                frameLayout.setVisibility(8);
            }
        } else {
            this.f11313D.setVisibility(0);
            ViewGroup.LayoutParams layoutParams = this.f11313D.getLayoutParams();
            this.f11318I.setRadiusInDip(6);
            this.f11318I.setNeedRadiu(true);
            com.anythink.core.common.res.b.a(getContext()).a(new e(1, this.f9736g.z()), layoutParams.width, layoutParams.height, new AnonymousClass1());
        }
        a(this.f11315F, this.f9736g.x());
        String D8 = this.f9736g.D();
        a(this.f11317H, D8);
        if (TextUtils.isEmpty(D8)) {
            ScanningAnimButton scanningAnimButton2 = this.f11317H;
            if (scanningAnimButton2 != null) {
                scanningAnimButton2.setVisibility(8);
            }
        } else {
            ScanningAnimButton scanningAnimButton3 = this.f11317H;
            if (scanningAnimButton3 != null) {
                scanningAnimButton3.setVisibility(0);
            }
        }
        a(this.f11316G, this.f9736g.y());
        if (this.f11312C != null) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
            layoutParams2.gravity = 17;
            this.f11319K = this.f11311B.getAdMediaView(this.f11312C);
            String mainImageUrl = this.f11311B.getMainImageUrl();
            if (this.f11319K != null) {
                this.f11312C.setVisibility(0);
                if (this.f11319K.getParent() != null) {
                    ((ViewGroup) this.f11319K.getParent()).removeView(this.f11319K);
                }
                this.f11312C.addView(this.f11319K, layoutParams2);
            } else if (TextUtils.isEmpty(mainImageUrl)) {
                this.f11312C.setVisibility(8);
            } else {
                this.f11312C.setVisibility(0);
                RoundImageView roundImageView = new RoundImageView(getContext());
                this.f11312C.addView(roundImageView, layoutParams2);
                com.anythink.core.common.res.b.a(getContext()).a(new e(1, mainImageUrl), new AnonymousClass2(mainImageUrl, roundImageView));
            }
        }
        View adLogoView = this.f11311B.getAdLogoView();
        com.anythink.basead.ui.f.a aVar = new com.anythink.basead.ui.f.a(this.f9736g, this.f9735f);
        this.f9817d = aVar;
        aVar.a(adLogoView);
        this.f9817d.b(this);
    }

    private void B() {
        ArrayList arrayList = new ArrayList();
        if (this.f11313D != null) {
            arrayList.add(this.f11312C);
        }
        FrameLayout frameLayout = this.f11313D;
        if (frameLayout != null) {
            arrayList.add(frameLayout);
        }
        this.f11324P = new b.a().a(arrayList).a(this.f11315F).b(this.f11316G).c(this.f11317H).a();
    }

    private boolean C() {
        return this.f11311B.isNativeExpress();
    }

    private void c(View view) {
        if (view != null) {
            this.f9742n.add(view);
        }
    }

    private void d() {
        this.f11321M = this.f11311B.p();
        this.f11320L = new ArrayList();
        if (!this.f11311B.isNativeExpress()) {
            for (int i : this.f11311B.h()) {
                this.f11320L.add(Integer.valueOf(i));
            }
        }
        this.f11323O = this.f11311B.n();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v23 */
    /* JADX WARN: Type inference failed for: r13v24 */
    /* JADX WARN: Type inference failed for: r13v25 */
    /* JADX WARN: Type inference failed for: r13v26 */
    /* JADX WARN: Type inference failed for: r13v27 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r16v0, types: [android.view.View, android.view.ViewGroup, com.anythink.basead.ui.BaseATView, com.anythink.basead.ui.BaseBannerATView, com.anythink.basead.ui.thirdparty.ThirdPartyBannerATView, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v9 */
    private void w() {
        float f3;
        char c9;
        String str;
        boolean z3;
        char c10;
        char c11;
        ?? r72;
        ViewGroup.LayoutParams layoutParams;
        char c12;
        float f9 = 300.0f;
        if (this.f11311B.isNativeExpress()) {
            this.f11310A = (ViewGroup) LayoutInflater.from(this.f11325Q).inflate(q.a(getContext(), "myoffer_banner_ad_layout_template", "layout"), (ViewGroup) this, false);
            int a9 = q.a(getContext(), 320.0f);
            int a10 = q.a(getContext(), 50.0f);
            String str2 = this.f11323O;
            str2.getClass();
            switch (str2.hashCode()) {
                case -559799608:
                    if (str2.equals(y.f14179c)) {
                        c12 = 0;
                        break;
                    }
                    c12 = 65535;
                    break;
                case 1507809730:
                    if (str2.equals(y.f14177a)) {
                        c12 = 1;
                        break;
                    }
                    c12 = 65535;
                    break;
                case 1507809854:
                    if (str2.equals(y.f14178b)) {
                        c12 = 2;
                        break;
                    }
                    c12 = 65535;
                    break;
                case 1622564786:
                    if (str2.equals(y.f14180d)) {
                        c12 = 3;
                        break;
                    }
                    c12 = 65535;
                    break;
                default:
                    c12 = 65535;
                    break;
            }
            switch (c12) {
                case 0:
                    a9 = q.a(getContext(), 300.0f);
                    f3 = 250.0f;
                    a10 = q.a(getContext(), 250.0f);
                    break;
                case 1:
                    a9 = q.a(getContext(), 320.0f);
                    a10 = q.a(getContext(), 50.0f);
                    f3 = 250.0f;
                    break;
                case 2:
                    a9 = q.a(getContext(), 320.0f);
                    a10 = q.a(getContext(), 90.0f);
                    f3 = 250.0f;
                    break;
                case 3:
                    a9 = q.a(getContext(), 720.0f);
                    a10 = q.a(getContext(), 90.0f);
                    f3 = 250.0f;
                    break;
                default:
                    f3 = 250.0f;
                    break;
            }
            this.f11310A.setLayoutParams(new ViewGroup.LayoutParams(Math.min(a9, getResources().getDisplayMetrics().widthPixels), a10));
            addView(this.f11310A);
            FrameLayout frameLayout = (FrameLayout) findViewById(q.a(getContext(), "myoffer_banner_template_view", "id"));
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
            layoutParams2.gravity = 17;
            View adMediaView = this.f11311B.getAdMediaView(frameLayout);
            this.f11319K = adMediaView;
            if (adMediaView != null) {
                if (adMediaView.getParent() != null) {
                    ((ViewGroup) this.f11319K.getParent()).removeView(this.f11319K);
                }
                frameLayout.addView(this.f11319K, layoutParams2);
            }
            CloseImageView closeImageView = (CloseImageView) f.k(this, "myoffer_banner_close", "id");
            this.f9815b = closeImageView;
            if (closeImageView != null) {
                if (this.f11321M) {
                    closeImageView.setVisibility(0);
                } else {
                    closeImageView.setVisibility(8);
                }
            }
            z3 = true;
            c11 = 65535;
        } else {
            f3 = 250.0f;
            this.f11310A = new FrameLayout(this.f11325Q);
            String str3 = this.f11323O;
            str3.getClass();
            switch (str3.hashCode()) {
                case -559799608:
                    if (str3.equals(y.f14179c)) {
                        c9 = 0;
                        break;
                    }
                    c9 = 65535;
                    break;
                case 1507809854:
                    if (str3.equals(y.f14178b)) {
                        c9 = 1;
                        break;
                    }
                    c9 = 65535;
                    break;
                case 1622564786:
                    if (str3.equals(y.f14180d)) {
                        c9 = 2;
                        break;
                    }
                    c9 = 65535;
                    break;
                default:
                    c9 = 65535;
                    break;
            }
            switch (c9) {
                case 0:
                    str = "myoffer_banner_native_ad_layout_300x250";
                    break;
                case 1:
                    com.anythink.core.common.l.g.d dVar = this.f11311B;
                    if (dVar.getAdMediaView(this) != null || !TextUtils.isEmpty(dVar.getMainImageUrl())) {
                        str = "myoffer_banner_native_ad_layout_320x90";
                        break;
                    } else {
                        str = "myoffer_banner_native_ad_layout_no_main_res_320x90";
                        break;
                    }
                case 2:
                    str = "myoffer_banner_native_ad_layout_728x90";
                    break;
                default:
                    str = "myoffer_banner_native_ad_layout_320x50";
                    break;
            }
            this.f11310A.addView((ViewGroup) LayoutInflater.from(this.f11325Q).inflate(q.a(getContext(), str, "layout"), (ViewGroup) this, false));
            addView(this.f11310A);
            this.f11312C = (FrameLayout) findViewById(q.a(getContext(), "myoffer_main_resouce_container", "id"));
            this.f11313D = (FrameLayout) f.k(this, "myoffer_banner_icon_container", "id");
            this.f11314E = (LinearLayout) f.k(this, "ll_title_desc", "id");
            this.f11318I = (RoundImageView) f.k(this, "myoffer_banner_icon", "id");
            this.f11315F = (TextView) f.k(this, "myoffer_banner_ad_title", "id");
            this.f11316G = (TextView) f.k(this, "myoffer_banner_desc", "id");
            this.f11317H = (ScanningAnimButton) f.k(this, "myoffer_banner_ad_install_btn", "id");
            this.f11322N = (TextView) f.k(this, "myoffer_banner_ad_from", "id");
            CloseImageView closeImageView2 = (CloseImageView) f.k(this, "myoffer_banner_close", "id");
            this.f9815b = closeImageView2;
            ScanningAnimButton scanningAnimButton = this.f11317H;
            if (scanningAnimButton != null) {
                scanningAnimButton.startAnimation(1);
            }
            a(this.f11322N, this.f11311B.getAdFrom());
            if (closeImageView2 != null) {
                if (this.f11321M) {
                    closeImageView2.setVisibility(0);
                } else {
                    closeImageView2.setVisibility(8);
                }
            }
            View adIconView = this.f11311B.getAdIconView();
            this.J = adIconView;
            if (adIconView != null) {
                if (adIconView.getParent() != null && (this.J.getParent() instanceof ViewGroup)) {
                    ((ViewGroup) this.J.getParent()).removeView(this.J);
                }
                this.f11313D.removeAllViews();
                this.f11313D.addView(this.J, new FrameLayout.LayoutParams(-1, -1));
            } else if (TextUtils.isEmpty(this.f9736g.z()) || this.f11318I == null) {
                FrameLayout frameLayout2 = this.f11313D;
                if (frameLayout2 != null) {
                    frameLayout2.setVisibility(8);
                }
            } else {
                this.f11313D.setVisibility(0);
                ViewGroup.LayoutParams layoutParams3 = this.f11313D.getLayoutParams();
                this.f11318I.setRadiusInDip(6);
                this.f11318I.setNeedRadiu(true);
                com.anythink.core.common.res.b.a(getContext()).a(new e(1, this.f9736g.z()), layoutParams3.width, layoutParams3.height, new AnonymousClass1());
            }
            a(this.f11315F, this.f9736g.x());
            String D8 = this.f9736g.D();
            a(this.f11317H, D8);
            if (TextUtils.isEmpty(D8)) {
                ScanningAnimButton scanningAnimButton2 = this.f11317H;
                if (scanningAnimButton2 != null) {
                    scanningAnimButton2.setVisibility(8);
                }
            } else {
                ScanningAnimButton scanningAnimButton3 = this.f11317H;
                if (scanningAnimButton3 != null) {
                    scanningAnimButton3.setVisibility(0);
                }
            }
            a(this.f11316G, this.f9736g.y());
            if (this.f11312C != null) {
                c10 = 65535;
                c10 = 65535;
                c10 = 65535;
                FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-1, -2);
                layoutParams4.gravity = 17;
                this.f11319K = this.f11311B.getAdMediaView(this.f11312C);
                String mainImageUrl = this.f11311B.getMainImageUrl();
                if (this.f11319K != null) {
                    this.f11312C.setVisibility(0);
                    if (this.f11319K.getParent() != null) {
                        ((ViewGroup) this.f11319K.getParent()).removeView(this.f11319K);
                    }
                    this.f11312C.addView(this.f11319K, layoutParams4);
                    z3 = true;
                } else if (TextUtils.isEmpty(mainImageUrl)) {
                    z3 = true;
                    this.f11312C.setVisibility(8);
                } else {
                    this.f11312C.setVisibility(0);
                    RoundImageView roundImageView = new RoundImageView(getContext());
                    this.f11312C.addView(roundImageView, layoutParams4);
                    z3 = true;
                    com.anythink.core.common.res.b.a(getContext()).a(new e(1, mainImageUrl), new AnonymousClass2(mainImageUrl, roundImageView));
                }
            } else {
                z3 = true;
                c10 = 65535;
            }
            View adLogoView = this.f11311B.getAdLogoView();
            com.anythink.basead.ui.f.a aVar = new com.anythink.basead.ui.f.a(this.f9736g, this.f9735f);
            this.f9817d = aVar;
            aVar.a(adLogoView);
            this.f9817d.b((View) this);
            c11 = c10;
        }
        c();
        com.anythink.core.common.l.g.d dVar2 = this.f11311B;
        if (this.f11310A != null) {
            Context context = getContext();
            String str4 = this.f11323O;
            str4.getClass();
            switch (str4.hashCode()) {
                case -559799608:
                    if (str4.equals(y.f14179c)) {
                        r72 = 0;
                        break;
                    }
                    r72 = c11;
                    break;
                case 1507809730:
                    if (str4.equals(y.f14177a)) {
                        r72 = z3;
                        break;
                    }
                    r72 = c11;
                    break;
                case 1507809854:
                    if (str4.equals(y.f14178b)) {
                        r72 = 2;
                        break;
                    }
                    r72 = c11;
                    break;
                case 1622564786:
                    if (str4.equals(y.f14180d)) {
                        r72 = 3;
                        break;
                    }
                    r72 = c11;
                    break;
                default:
                    r72 = c11;
                    break;
            }
            switch (r72) {
                case 0:
                    break;
                case 1:
                case 2:
                default:
                    f9 = 320.0f;
                    break;
                case 3:
                    f9 = 728.0f;
                    break;
            }
            int a11 = q.a(context, f9);
            String str5 = this.f11323O;
            str5.getClass();
            ?? r13 = c11;
            switch (str5.hashCode()) {
                case -559799608:
                    r13 = c11;
                    if (str5.equals(y.f14179c)) {
                        r13 = 0;
                        break;
                    }
                    break;
                case 1507809730:
                    r13 = c11;
                    if (str5.equals(y.f14177a)) {
                        r13 = z3;
                        break;
                    }
                    break;
                case 1507809854:
                    r13 = c11;
                    if (str5.equals(y.f14178b)) {
                        r13 = 2;
                        break;
                    }
                    break;
                case 1622564786:
                    r13 = c11;
                    if (str5.equals(y.f14180d)) {
                        r13 = 3;
                        break;
                    }
                    break;
            }
            switch (r13) {
                case 0:
                    break;
                case 1:
                default:
                    f3 = 50.0f;
                    break;
                case 2:
                case 3:
                    f3 = 90.0f;
                    break;
            }
            int a12 = q.a(context, f3);
            int i = getResources().getDisplayMetrics().widthPixels;
            if (a11 > i) {
                a11 = i;
            }
            ViewGroup customAdContainer = dVar2 != null ? dVar2.getCustomAdContainer() : null;
            if (customAdContainer != null) {
                ViewGroup.LayoutParams layoutParams5 = customAdContainer.getLayoutParams();
                if (layoutParams5 == null) {
                    layoutParams5 = new ViewGroup.LayoutParams(a11, a12);
                } else {
                    layoutParams5.width = a11;
                    layoutParams5.height = a12;
                }
                customAdContainer.setLayoutParams(layoutParams5);
                removeAllViews();
                if (customAdContainer instanceof FrameLayout) {
                    FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(a11, a12);
                    layoutParams6.gravity = 17;
                    layoutParams = layoutParams6;
                } else {
                    layoutParams = new ViewGroup.LayoutParams(a11, a12);
                }
                this.f11310A.setLayoutParams(layoutParams);
                am.a(customAdContainer);
                customAdContainer.addView(this.f11310A);
                if (customAdContainer.getParent() != null) {
                    ((ViewGroup) customAdContainer.getParent()).removeView(customAdContainer);
                }
                addView(customAdContainer);
            }
            b(this.f11310A);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0067, code lost:
    
        if (r5.equals(com.anythink.core.common.h.y.f14179c) == false) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void x() {
        char c9 = 0;
        this.f11310A = (ViewGroup) LayoutInflater.from(this.f11325Q).inflate(q.a(getContext(), "myoffer_banner_ad_layout_template", "layout"), (ViewGroup) this, false);
        int a9 = q.a(getContext(), 320.0f);
        int a10 = q.a(getContext(), 50.0f);
        String str = this.f11323O;
        str.getClass();
        switch (str.hashCode()) {
            case -559799608:
                break;
            case 1507809730:
                if (str.equals(y.f14177a)) {
                    c9 = 1;
                    break;
                }
                c9 = 65535;
                break;
            case 1507809854:
                if (str.equals(y.f14178b)) {
                    c9 = 2;
                    break;
                }
                c9 = 65535;
                break;
            case 1622564786:
                if (str.equals(y.f14180d)) {
                    c9 = 3;
                    break;
                }
                c9 = 65535;
                break;
            default:
                c9 = 65535;
                break;
        }
        switch (c9) {
            case 0:
                a9 = q.a(getContext(), 300.0f);
                a10 = q.a(getContext(), 250.0f);
                break;
            case 1:
                a9 = q.a(getContext(), 320.0f);
                a10 = q.a(getContext(), 50.0f);
                break;
            case 2:
                a9 = q.a(getContext(), 320.0f);
                a10 = q.a(getContext(), 90.0f);
                break;
            case 3:
                a9 = q.a(getContext(), 720.0f);
                a10 = q.a(getContext(), 90.0f);
                break;
        }
        this.f11310A.setLayoutParams(new ViewGroup.LayoutParams(Math.min(a9, getResources().getDisplayMetrics().widthPixels), a10));
        addView(this.f11310A);
    }

    private void y() {
        String str;
        this.f11310A = new FrameLayout(this.f11325Q);
        String str2 = this.f11323O;
        str2.getClass();
        switch (str2) {
            case "300x250":
                str = "myoffer_banner_native_ad_layout_300x250";
                break;
            case "320x90":
                com.anythink.core.common.l.g.d dVar = this.f11311B;
                if (dVar.getAdMediaView(this) != null || !TextUtils.isEmpty(dVar.getMainImageUrl())) {
                    str = "myoffer_banner_native_ad_layout_320x90";
                    break;
                } else {
                    str = "myoffer_banner_native_ad_layout_no_main_res_320x90";
                    break;
                }
            case "728x90":
                str = "myoffer_banner_native_ad_layout_728x90";
                break;
            default:
                str = "myoffer_banner_native_ad_layout_320x50";
                break;
        }
        this.f11310A.addView((ViewGroup) LayoutInflater.from(this.f11325Q).inflate(q.a(getContext(), str, "layout"), (ViewGroup) this, false));
        addView(this.f11310A);
    }

    private void z() {
        FrameLayout frameLayout = (FrameLayout) f.k(this, "myoffer_banner_template_view", "id");
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 17;
        View adMediaView = this.f11311B.getAdMediaView(frameLayout);
        this.f11319K = adMediaView;
        if (adMediaView != null) {
            if (adMediaView.getParent() != null) {
                ((ViewGroup) this.f11319K.getParent()).removeView(this.f11319K);
            }
            frameLayout.addView(this.f11319K, layoutParams);
        }
        CloseImageView closeImageView = (CloseImageView) f.k(this, "myoffer_banner_close", "id");
        this.f9815b = closeImageView;
        if (closeImageView != null) {
            if (this.f11321M) {
                closeImageView.setVisibility(0);
            } else {
                closeImageView.setVisibility(8);
            }
        }
    }

    @Override // com.anythink.basead.ui.BaseATView
    public final void a() {
    }

    @Override // com.anythink.core.common.l.e.a.d
    public void destroyNativeAd() {
        com.anythink.core.common.l.g.d dVar = this.f11311B;
        if (dVar != null) {
            dVar.clear(this.f11310A);
            this.f11311B.destroy();
        }
    }

    @Override // com.anythink.basead.ui.BaseATView, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        com.anythink.basead.mixad.f.b bVar = this.f11324P;
        if (bVar != null) {
            bVar.a(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public int getClickedArea() {
        com.anythink.basead.mixad.f.b bVar = this.f11324P;
        return bVar != null ? bVar.a() : com.anythink.basead.mixad.f.b.f9563a;
    }

    @Override // com.anythink.basead.ui.BaseBannerATView, com.anythink.basead.ui.BaseATView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return super.onInterceptTouchEvent(motionEvent);
    }

    private void b(View view) {
        RoundImageView roundImageView;
        int i = this.f9735f.f14160f;
        FrameLayout.LayoutParams a9 = com.anythink.basead.mixad.f.a.a(i, a(32.0f), a(8.0f));
        com.anythink.core.basead.b.b bVar = new com.anythink.core.basead.b.b();
        int[] h9 = this.f11311B.h();
        if (h9 == null) {
            c(this);
        } else {
            for (int i6 : h9) {
                if (i6 == 1) {
                    View view2 = this.J;
                    if (view2 != null) {
                        c(view2);
                        bVar.b(this.J);
                    } else if (!TextUtils.isEmpty(this.f11311B.getIconImageUrl()) && (roundImageView = this.f11318I) != null) {
                        c(roundImageView);
                        bVar.b(this.f11318I);
                    }
                    c(this.f11319K);
                    View view3 = this.f11319K;
                    if (view3 != null) {
                        bVar.c(view3);
                    }
                } else if (i6 == 2) {
                    c(this.f11315F);
                    bVar.a(this.f11315F);
                } else if (i6 == 3) {
                    c(this.f11316G);
                    bVar.d(this.f11316G);
                } else if (i6 == 4) {
                    c(this.f11317H);
                    bVar.e(this.f11317H);
                } else if (i6 == 5) {
                    c(this);
                }
            }
        }
        CloseImageView closeImageView = this.f9815b;
        if (closeImageView != null) {
            bVar.i(closeImageView);
        }
        if (this.f9817d != null && i == 34) {
            bVar.f(this.f11322N);
            this.f9817d.a(this.f11311B, bVar, false);
        }
        com.anythink.core.common.l.g.d dVar = this.f11311B;
        if (dVar != null) {
            dVar.registerListener(view, this.f9742n, a9, bVar);
        }
    }

    @Override // com.anythink.basead.ui.BaseATView
    public final void a(int i, Runnable runnable) {
    }

    private static void a(TextView textView, String str) {
        if (textView == null) {
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            textView.setVisibility(0);
            textView.setText(str);
        } else {
            textView.setVisibility(8);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public ThirdPartyBannerATView(Context context, BaseAd baseAd, x xVar, w<?> wVar, com.anythink.basead.g.a aVar) {
        super(context, xVar, wVar, aVar);
        float f3;
        char c9;
        String str;
        char c10;
        char c11;
        char c12;
        float f9;
        ViewGroup.LayoutParams layoutParams;
        char c13;
        this.f11321M = false;
        this.f11323O = "";
        if (baseAd instanceof com.anythink.core.common.l.g.d) {
            this.f11311B = (com.anythink.core.common.l.g.d) baseAd;
        }
        com.anythink.core.common.l.g.d dVar = this.f11311B;
        if (dVar == null || wVar == null || xVar == null) {
            return;
        }
        this.f11325Q = context;
        this.f11321M = dVar.p();
        this.f11320L = new ArrayList();
        if (!this.f11311B.isNativeExpress()) {
            for (int i : this.f11311B.h()) {
                this.f11320L.add(Integer.valueOf(i));
            }
        }
        this.f11323O = this.f11311B.n();
        float f10 = 300.0f;
        if (this.f11311B.isNativeExpress()) {
            this.f11310A = (ViewGroup) LayoutInflater.from(this.f11325Q).inflate(q.a(getContext(), "myoffer_banner_ad_layout_template", "layout"), (ViewGroup) this, false);
            int a9 = q.a(getContext(), 320.0f);
            int a10 = q.a(getContext(), 50.0f);
            String str2 = this.f11323O;
            str2.getClass();
            switch (str2.hashCode()) {
                case -559799608:
                    if (str2.equals(y.f14179c)) {
                        c13 = 0;
                        break;
                    }
                    c13 = 65535;
                    break;
                case 1507809730:
                    if (str2.equals(y.f14177a)) {
                        c13 = 1;
                        break;
                    }
                    c13 = 65535;
                    break;
                case 1507809854:
                    if (str2.equals(y.f14178b)) {
                        c13 = 2;
                        break;
                    }
                    c13 = 65535;
                    break;
                case 1622564786:
                    if (str2.equals(y.f14180d)) {
                        c13 = 3;
                        break;
                    }
                    c13 = 65535;
                    break;
                default:
                    c13 = 65535;
                    break;
            }
            switch (c13) {
                case 0:
                    a9 = q.a(getContext(), 300.0f);
                    f3 = 250.0f;
                    a10 = q.a(getContext(), 250.0f);
                    break;
                case 1:
                    a9 = q.a(getContext(), 320.0f);
                    a10 = q.a(getContext(), 50.0f);
                    f3 = 250.0f;
                    break;
                case 2:
                    a9 = q.a(getContext(), 320.0f);
                    a10 = q.a(getContext(), 90.0f);
                    f3 = 250.0f;
                    break;
                case 3:
                    a9 = q.a(getContext(), 720.0f);
                    a10 = q.a(getContext(), 90.0f);
                    f3 = 250.0f;
                    break;
                default:
                    f3 = 250.0f;
                    break;
            }
            this.f11310A.setLayoutParams(new ViewGroup.LayoutParams(Math.min(a9, getResources().getDisplayMetrics().widthPixels), a10));
            addView(this.f11310A);
            FrameLayout frameLayout = (FrameLayout) findViewById(q.a(getContext(), "myoffer_banner_template_view", "id"));
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
            layoutParams2.gravity = 17;
            View adMediaView = this.f11311B.getAdMediaView(frameLayout);
            this.f11319K = adMediaView;
            if (adMediaView != null) {
                if (adMediaView.getParent() != null) {
                    ((ViewGroup) this.f11319K.getParent()).removeView(this.f11319K);
                }
                frameLayout.addView(this.f11319K, layoutParams2);
            }
            CloseImageView closeImageView = (CloseImageView) f.k(this, "myoffer_banner_close", "id");
            this.f9815b = closeImageView;
            if (closeImageView != null) {
                if (this.f11321M) {
                    closeImageView.setVisibility(0);
                } else {
                    closeImageView.setVisibility(8);
                }
            }
            c10 = 65535;
        } else {
            f3 = 250.0f;
            this.f11310A = new FrameLayout(this.f11325Q);
            String str3 = this.f11323O;
            str3.getClass();
            switch (str3.hashCode()) {
                case -559799608:
                    if (str3.equals(y.f14179c)) {
                        c9 = 0;
                        break;
                    }
                    c9 = 65535;
                    break;
                case 1507809854:
                    if (str3.equals(y.f14178b)) {
                        c9 = 1;
                        break;
                    }
                    c9 = 65535;
                    break;
                case 1622564786:
                    if (str3.equals(y.f14180d)) {
                        c9 = 2;
                        break;
                    }
                    c9 = 65535;
                    break;
                default:
                    c9 = 65535;
                    break;
            }
            switch (c9) {
                case 0:
                    str = "myoffer_banner_native_ad_layout_300x250";
                    break;
                case 1:
                    com.anythink.core.common.l.g.d dVar2 = this.f11311B;
                    if (dVar2.getAdMediaView(this) == null && TextUtils.isEmpty(dVar2.getMainImageUrl())) {
                        str = "myoffer_banner_native_ad_layout_no_main_res_320x90";
                        break;
                    } else {
                        str = "myoffer_banner_native_ad_layout_320x90";
                        break;
                    }
                    break;
                case 2:
                    str = "myoffer_banner_native_ad_layout_728x90";
                    break;
                default:
                    str = "myoffer_banner_native_ad_layout_320x50";
                    break;
            }
            this.f11310A.addView((ViewGroup) LayoutInflater.from(this.f11325Q).inflate(q.a(getContext(), str, "layout"), (ViewGroup) this, false));
            addView(this.f11310A);
            this.f11312C = (FrameLayout) findViewById(q.a(getContext(), "myoffer_main_resouce_container", "id"));
            this.f11313D = (FrameLayout) f.k(this, "myoffer_banner_icon_container", "id");
            this.f11314E = (LinearLayout) f.k(this, "ll_title_desc", "id");
            this.f11318I = (RoundImageView) f.k(this, "myoffer_banner_icon", "id");
            this.f11315F = (TextView) f.k(this, "myoffer_banner_ad_title", "id");
            this.f11316G = (TextView) f.k(this, "myoffer_banner_desc", "id");
            this.f11317H = (ScanningAnimButton) f.k(this, "myoffer_banner_ad_install_btn", "id");
            this.f11322N = (TextView) f.k(this, "myoffer_banner_ad_from", "id");
            CloseImageView closeImageView2 = (CloseImageView) f.k(this, "myoffer_banner_close", "id");
            this.f9815b = closeImageView2;
            ScanningAnimButton scanningAnimButton = this.f11317H;
            if (scanningAnimButton != null) {
                scanningAnimButton.startAnimation(1);
            }
            a(this.f11322N, this.f11311B.getAdFrom());
            if (closeImageView2 != null) {
                if (this.f11321M) {
                    closeImageView2.setVisibility(0);
                } else {
                    closeImageView2.setVisibility(8);
                }
            }
            View adIconView = this.f11311B.getAdIconView();
            this.J = adIconView;
            if (adIconView != null) {
                if (adIconView.getParent() != null && (this.J.getParent() instanceof ViewGroup)) {
                    ((ViewGroup) this.J.getParent()).removeView(this.J);
                }
                this.f11313D.removeAllViews();
                this.f11313D.addView(this.J, new FrameLayout.LayoutParams(-1, -1));
            } else if (!TextUtils.isEmpty(this.f9736g.z()) && this.f11318I != null) {
                this.f11313D.setVisibility(0);
                ViewGroup.LayoutParams layoutParams3 = this.f11313D.getLayoutParams();
                this.f11318I.setRadiusInDip(6);
                this.f11318I.setNeedRadiu(true);
                com.anythink.core.common.res.b.a(getContext()).a(new e(1, this.f9736g.z()), layoutParams3.width, layoutParams3.height, new AnonymousClass1());
            } else {
                FrameLayout frameLayout2 = this.f11313D;
                if (frameLayout2 != null) {
                    frameLayout2.setVisibility(8);
                }
            }
            a(this.f11315F, this.f9736g.x());
            String D8 = this.f9736g.D();
            a(this.f11317H, D8);
            if (TextUtils.isEmpty(D8)) {
                ScanningAnimButton scanningAnimButton2 = this.f11317H;
                if (scanningAnimButton2 != null) {
                    scanningAnimButton2.setVisibility(8);
                }
            } else {
                ScanningAnimButton scanningAnimButton3 = this.f11317H;
                if (scanningAnimButton3 != null) {
                    scanningAnimButton3.setVisibility(0);
                }
            }
            a(this.f11316G, this.f9736g.y());
            if (this.f11312C != null) {
                c10 = 65535;
                FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-1, -2);
                layoutParams4.gravity = 17;
                this.f11319K = this.f11311B.getAdMediaView(this.f11312C);
                String mainImageUrl = this.f11311B.getMainImageUrl();
                if (this.f11319K != null) {
                    this.f11312C.setVisibility(0);
                    if (this.f11319K.getParent() != null) {
                        ((ViewGroup) this.f11319K.getParent()).removeView(this.f11319K);
                    }
                    this.f11312C.addView(this.f11319K, layoutParams4);
                } else if (!TextUtils.isEmpty(mainImageUrl)) {
                    this.f11312C.setVisibility(0);
                    RoundImageView roundImageView = new RoundImageView(getContext());
                    this.f11312C.addView(roundImageView, layoutParams4);
                    com.anythink.core.common.res.b.a(getContext()).a(new e(1, mainImageUrl), new AnonymousClass2(mainImageUrl, roundImageView));
                } else {
                    this.f11312C.setVisibility(8);
                }
            } else {
                c10 = 65535;
            }
            View adLogoView = this.f11311B.getAdLogoView();
            com.anythink.basead.ui.f.a aVar2 = new com.anythink.basead.ui.f.a(this.f9736g, this.f9735f);
            this.f9817d = aVar2;
            aVar2.a(adLogoView);
            this.f9817d.b(this);
        }
        c();
        com.anythink.core.common.l.g.d dVar3 = this.f11311B;
        if (this.f11310A != null) {
            Context context2 = getContext();
            String str4 = this.f11323O;
            str4.getClass();
            switch (str4.hashCode()) {
                case -559799608:
                    if (str4.equals(y.f14179c)) {
                        c11 = 0;
                        break;
                    }
                    c11 = c10;
                    break;
                case 1507809730:
                    if (str4.equals(y.f14177a)) {
                        c11 = 1;
                        break;
                    }
                    c11 = c10;
                    break;
                case 1507809854:
                    if (str4.equals(y.f14178b)) {
                        c11 = 2;
                        break;
                    }
                    c11 = c10;
                    break;
                case 1622564786:
                    if (str4.equals(y.f14180d)) {
                        c11 = 3;
                        break;
                    }
                    c11 = c10;
                    break;
                default:
                    c11 = c10;
                    break;
            }
            switch (c11) {
                case 0:
                    break;
                case 1:
                case 2:
                default:
                    f10 = 320.0f;
                    break;
                case 3:
                    f10 = 728.0f;
                    break;
            }
            int a11 = q.a(context2, f10);
            String str5 = this.f11323O;
            str5.getClass();
            switch (str5.hashCode()) {
                case -559799608:
                    if (str5.equals(y.f14179c)) {
                        c12 = 0;
                        break;
                    }
                    c12 = c10;
                    break;
                case 1507809730:
                    if (str5.equals(y.f14177a)) {
                        c12 = 1;
                        break;
                    }
                    c12 = c10;
                    break;
                case 1507809854:
                    if (str5.equals(y.f14178b)) {
                        c12 = 2;
                        break;
                    }
                    c12 = c10;
                    break;
                case 1622564786:
                    if (str5.equals(y.f14180d)) {
                        c12 = 3;
                        break;
                    }
                    c12 = c10;
                    break;
                default:
                    c12 = c10;
                    break;
            }
            switch (c12) {
                case 0:
                    f9 = f3;
                    break;
                case 1:
                default:
                    f9 = 50.0f;
                    break;
                case 2:
                case 3:
                    f9 = 90.0f;
                    break;
            }
            int a12 = q.a(context2, f9);
            int i6 = getResources().getDisplayMetrics().widthPixels;
            a11 = a11 > i6 ? i6 : a11;
            ViewGroup customAdContainer = dVar3 != null ? dVar3.getCustomAdContainer() : null;
            if (customAdContainer != null) {
                ViewGroup.LayoutParams layoutParams5 = customAdContainer.getLayoutParams();
                if (layoutParams5 == null) {
                    layoutParams5 = new ViewGroup.LayoutParams(a11, a12);
                } else {
                    layoutParams5.width = a11;
                    layoutParams5.height = a12;
                }
                customAdContainer.setLayoutParams(layoutParams5);
                removeAllViews();
                if (customAdContainer instanceof FrameLayout) {
                    FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(a11, a12);
                    layoutParams6.gravity = 17;
                    layoutParams = layoutParams6;
                } else {
                    layoutParams = new ViewGroup.LayoutParams(a11, a12);
                }
                this.f11310A.setLayoutParams(layoutParams);
                am.a(customAdContainer);
                customAdContainer.addView(this.f11310A);
                if (customAdContainer.getParent() != null) {
                    ((ViewGroup) customAdContainer.getParent()).removeView(customAdContainer);
                }
                addView(customAdContainer);
            }
            b(this.f11310A);
        }
        if (this.f11311B.isNativeExpress()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (this.f11313D != null) {
            arrayList.add(this.f11312C);
        }
        FrameLayout frameLayout3 = this.f11313D;
        if (frameLayout3 != null) {
            arrayList.add(frameLayout3);
        }
        this.f11324P = new b.a().a(arrayList).a(this.f11315F).b(this.f11316G).c(this.f11317H).a();
    }

    private int a(float f3) {
        return q.a(getContext(), f3);
    }

    private static boolean a(float f3, float f9, View view) {
        if (view == null) {
            return false;
        }
        float x9 = view.getX();
        float y7 = view.getY();
        return f3 >= x9 && f3 <= ((float) view.getWidth()) + x9 && f9 >= y7 && f9 <= ((float) view.getHeight()) + y7;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x006a, code lost:
    
        if (r11.equals(com.anythink.core.common.h.y.f14180d) == false) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void a(BaseAd baseAd) {
        boolean z3;
        ViewGroup.LayoutParams layoutParams;
        char c9 = 3;
        if (this.f11310A == null) {
            return;
        }
        Context context = getContext();
        String str = this.f11323O;
        str.getClass();
        float f3 = 320.0f;
        switch (str.hashCode()) {
            case -559799608:
                if (str.equals(y.f14179c)) {
                    z3 = false;
                    break;
                }
                z3 = -1;
                break;
            case 1507809730:
                if (str.equals(y.f14177a)) {
                    z3 = true;
                    break;
                }
                z3 = -1;
                break;
            case 1507809854:
                if (str.equals(y.f14178b)) {
                    z3 = 2;
                    break;
                }
                z3 = -1;
                break;
            case 1622564786:
                if (str.equals(y.f14180d)) {
                    z3 = 3;
                    break;
                }
                z3 = -1;
                break;
            default:
                z3 = -1;
                break;
        }
        switch (z3) {
            case false:
                f3 = 300.0f;
                break;
            case true:
                f3 = 728.0f;
                break;
        }
        int a9 = q.a(context, f3);
        String str2 = this.f11323O;
        str2.getClass();
        float f9 = 50.0f;
        switch (str2.hashCode()) {
            case -559799608:
                if (str2.equals(y.f14179c)) {
                    c9 = 0;
                    break;
                }
                c9 = 65535;
                break;
            case 1507809730:
                if (str2.equals(y.f14177a)) {
                    c9 = 1;
                    break;
                }
                c9 = 65535;
                break;
            case 1507809854:
                if (str2.equals(y.f14178b)) {
                    c9 = 2;
                    break;
                }
                c9 = 65535;
                break;
            case 1622564786:
                break;
            default:
                c9 = 65535;
                break;
        }
        switch (c9) {
            case 0:
                f9 = 250.0f;
                break;
            case 2:
            case 3:
                f9 = 90.0f;
                break;
        }
        int a10 = q.a(context, f9);
        int i = getResources().getDisplayMetrics().widthPixels;
        if (a9 > i) {
            a9 = i;
        }
        ViewGroup customAdContainer = baseAd != null ? baseAd.getCustomAdContainer() : null;
        if (customAdContainer != null) {
            ViewGroup.LayoutParams layoutParams2 = customAdContainer.getLayoutParams();
            if (layoutParams2 == null) {
                layoutParams2 = new ViewGroup.LayoutParams(a9, a10);
            } else {
                layoutParams2.width = a9;
                layoutParams2.height = a10;
            }
            customAdContainer.setLayoutParams(layoutParams2);
            removeAllViews();
            if (customAdContainer instanceof FrameLayout) {
                FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(a9, a10);
                layoutParams3.gravity = 17;
                layoutParams = layoutParams3;
            } else {
                layoutParams = new ViewGroup.LayoutParams(a9, a10);
            }
            this.f11310A.setLayoutParams(layoutParams);
            am.a(customAdContainer);
            customAdContainer.addView(this.f11310A);
            if (customAdContainer.getParent() != null) {
                ((ViewGroup) customAdContainer.getParent()).removeView(customAdContainer);
            }
            addView(customAdContainer);
        }
        b(this.f11310A);
    }

    private int b(Context context) {
        float f3;
        String str = this.f11323O;
        str.getClass();
        f3 = 50.0f;
        switch (str) {
            case "300x250":
                f3 = 250.0f;
                break;
            case "320x90":
            case "728x90":
                f3 = 90.0f;
                break;
        }
        return q.a(context, f3);
    }

    private int a(Context context) {
        float f3;
        String str = this.f11323O;
        str.getClass();
        f3 = 320.0f;
        switch (str) {
            case "300x250":
                f3 = 300.0f;
                break;
            case "728x90":
                f3 = 728.0f;
                break;
        }
        return q.a(context, f3);
    }
}
