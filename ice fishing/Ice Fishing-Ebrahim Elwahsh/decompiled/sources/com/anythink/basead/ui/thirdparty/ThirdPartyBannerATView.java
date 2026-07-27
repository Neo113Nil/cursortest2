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
import com.anythink.basead.b.c.i;
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
    private ViewGroup f11467A;

    /* renamed from: B, reason: collision with root package name */
    private com.anythink.core.common.l.g.d f11468B;

    /* renamed from: C, reason: collision with root package name */
    private FrameLayout f11469C;

    /* renamed from: D, reason: collision with root package name */
    private FrameLayout f11470D;

    /* renamed from: E, reason: collision with root package name */
    private LinearLayout f11471E;

    /* renamed from: F, reason: collision with root package name */
    private TextView f11472F;

    /* renamed from: G, reason: collision with root package name */
    private TextView f11473G;

    /* renamed from: H, reason: collision with root package name */
    private ScanningAnimButton f11474H;

    /* renamed from: I, reason: collision with root package name */
    private RoundImageView f11475I;
    private View J;

    /* renamed from: K, reason: collision with root package name */
    private View f11476K;

    /* renamed from: L, reason: collision with root package name */
    private List<Integer> f11477L;

    /* renamed from: M, reason: collision with root package name */
    private boolean f11478M;

    /* renamed from: N, reason: collision with root package name */
    private TextView f11479N;

    /* renamed from: O, reason: collision with root package name */
    private String f11480O;

    /* renamed from: P, reason: collision with root package name */
    private com.anythink.basead.mixad.f.b f11481P;

    /* renamed from: Q, reason: collision with root package name */
    private Context f11482Q;

    /* renamed from: com.anythink.basead.ui.thirdparty.ThirdPartyBannerATView$1, reason: invalid class name */
    public class AnonymousClass1 implements b.a {
        public AnonymousClass1() {
        }

        @Override // com.anythink.core.common.res.b.a
        public final void onFail(String str, String str2) {
        }

        @Override // com.anythink.core.common.res.b.a
        public final void onSuccess(String str, Bitmap bitmap) {
            if (TextUtils.equals(((BaseATView) ThirdPartyBannerATView.this).f9893g.z(), str)) {
                ThirdPartyBannerATView.this.f11475I.setImageBitmap(bitmap);
            }
        }
    }

    /* renamed from: com.anythink.basead.ui.thirdparty.ThirdPartyBannerATView$2, reason: invalid class name */
    public class AnonymousClass2 implements b.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f11484a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ RoundImageView f11485b;

        public AnonymousClass2(String str, RoundImageView roundImageView) {
            this.f11484a = str;
            this.f11485b = roundImageView;
        }

        @Override // com.anythink.core.common.res.b.a
        public final void onFail(String str, String str2) {
        }

        @Override // com.anythink.core.common.res.b.a
        public final void onSuccess(String str, Bitmap bitmap) {
            if (TextUtils.equals(this.f11484a, str)) {
                this.f11485b.setImageBitmap(bitmap);
            }
        }
    }

    public ThirdPartyBannerATView(Context context) {
        super(context);
        this.f11478M = false;
        this.f11480O = "";
        this.f11482Q = context;
    }

    private void A() {
        this.f11469C = (FrameLayout) i.j(this, "myoffer_main_resouce_container", "id");
        this.f11470D = (FrameLayout) i.j(this, "myoffer_banner_icon_container", "id");
        this.f11471E = (LinearLayout) i.j(this, "ll_title_desc", "id");
        this.f11475I = (RoundImageView) i.j(this, "myoffer_banner_icon", "id");
        this.f11472F = (TextView) i.j(this, "myoffer_banner_ad_title", "id");
        this.f11473G = (TextView) i.j(this, "myoffer_banner_desc", "id");
        this.f11474H = (ScanningAnimButton) i.j(this, "myoffer_banner_ad_install_btn", "id");
        this.f11479N = (TextView) i.j(this, "myoffer_banner_ad_from", "id");
        CloseImageView closeImageView = (CloseImageView) i.j(this, "myoffer_banner_close", "id");
        this.f9972b = closeImageView;
        ScanningAnimButton scanningAnimButton = this.f11474H;
        if (scanningAnimButton != null) {
            scanningAnimButton.startAnimation(1);
        }
        a(this.f11479N, this.f11468B.getAdFrom());
        if (closeImageView != null) {
            if (this.f11478M) {
                closeImageView.setVisibility(0);
            } else {
                closeImageView.setVisibility(8);
            }
        }
        View adIconView = this.f11468B.getAdIconView();
        this.J = adIconView;
        if (adIconView != null) {
            if (adIconView.getParent() != null && (this.J.getParent() instanceof ViewGroup)) {
                ((ViewGroup) this.J.getParent()).removeView(this.J);
            }
            this.f11470D.removeAllViews();
            this.f11470D.addView(this.J, new FrameLayout.LayoutParams(-1, -1));
        } else if (TextUtils.isEmpty(this.f9893g.z()) || this.f11475I == null) {
            FrameLayout frameLayout = this.f11470D;
            if (frameLayout != null) {
                frameLayout.setVisibility(8);
            }
        } else {
            this.f11470D.setVisibility(0);
            ViewGroup.LayoutParams layoutParams = this.f11470D.getLayoutParams();
            this.f11475I.setRadiusInDip(6);
            this.f11475I.setNeedRadiu(true);
            com.anythink.core.common.res.b.a(getContext()).a(new e(1, this.f9893g.z()), layoutParams.width, layoutParams.height, new AnonymousClass1());
        }
        a(this.f11472F, this.f9893g.x());
        String D8 = this.f9893g.D();
        a(this.f11474H, D8);
        if (TextUtils.isEmpty(D8)) {
            ScanningAnimButton scanningAnimButton2 = this.f11474H;
            if (scanningAnimButton2 != null) {
                scanningAnimButton2.setVisibility(8);
            }
        } else {
            ScanningAnimButton scanningAnimButton3 = this.f11474H;
            if (scanningAnimButton3 != null) {
                scanningAnimButton3.setVisibility(0);
            }
        }
        a(this.f11473G, this.f9893g.y());
        if (this.f11469C != null) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
            layoutParams2.gravity = 17;
            this.f11476K = this.f11468B.getAdMediaView(this.f11469C);
            String mainImageUrl = this.f11468B.getMainImageUrl();
            if (this.f11476K != null) {
                this.f11469C.setVisibility(0);
                if (this.f11476K.getParent() != null) {
                    ((ViewGroup) this.f11476K.getParent()).removeView(this.f11476K);
                }
                this.f11469C.addView(this.f11476K, layoutParams2);
            } else if (TextUtils.isEmpty(mainImageUrl)) {
                this.f11469C.setVisibility(8);
            } else {
                this.f11469C.setVisibility(0);
                RoundImageView roundImageView = new RoundImageView(getContext());
                this.f11469C.addView(roundImageView, layoutParams2);
                com.anythink.core.common.res.b.a(getContext()).a(new e(1, mainImageUrl), new AnonymousClass2(mainImageUrl, roundImageView));
            }
        }
        View adLogoView = this.f11468B.getAdLogoView();
        com.anythink.basead.ui.f.a aVar = new com.anythink.basead.ui.f.a(this.f9893g, this.f9892f);
        this.f9974d = aVar;
        aVar.a(adLogoView);
        this.f9974d.b(this);
    }

    private void B() {
        ArrayList arrayList = new ArrayList();
        if (this.f11470D != null) {
            arrayList.add(this.f11469C);
        }
        FrameLayout frameLayout = this.f11470D;
        if (frameLayout != null) {
            arrayList.add(frameLayout);
        }
        this.f11481P = new b.a().a(arrayList).a(this.f11472F).b(this.f11473G).c(this.f11474H).a();
    }

    private boolean C() {
        return this.f11468B.isNativeExpress();
    }

    private void c(View view) {
        if (view != null) {
            this.f9899n.add(view);
        }
    }

    private void d() {
        this.f11478M = this.f11468B.p();
        this.f11477L = new ArrayList();
        if (!this.f11468B.isNativeExpress()) {
            for (int i : this.f11468B.h()) {
                this.f11477L.add(Integer.valueOf(i));
            }
        }
        this.f11480O = this.f11468B.n();
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
        float f6;
        char c4;
        String str;
        boolean z8;
        char c9;
        char c10;
        ?? r72;
        ViewGroup.LayoutParams layoutParams;
        char c11;
        float f9 = 300.0f;
        if (this.f11468B.isNativeExpress()) {
            this.f11467A = (ViewGroup) LayoutInflater.from(this.f11482Q).inflate(q.a(getContext(), "myoffer_banner_ad_layout_template", "layout"), (ViewGroup) this, false);
            int a9 = q.a(getContext(), 320.0f);
            int a10 = q.a(getContext(), 50.0f);
            String str2 = this.f11480O;
            str2.getClass();
            switch (str2.hashCode()) {
                case -559799608:
                    if (str2.equals(y.f14336c)) {
                        c11 = 0;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 1507809730:
                    if (str2.equals(y.f14334a)) {
                        c11 = 1;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 1507809854:
                    if (str2.equals(y.f14335b)) {
                        c11 = 2;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 1622564786:
                    if (str2.equals(y.f14337d)) {
                        c11 = 3;
                        break;
                    }
                    c11 = 65535;
                    break;
                default:
                    c11 = 65535;
                    break;
            }
            switch (c11) {
                case 0:
                    a9 = q.a(getContext(), 300.0f);
                    f6 = 250.0f;
                    a10 = q.a(getContext(), 250.0f);
                    break;
                case 1:
                    a9 = q.a(getContext(), 320.0f);
                    a10 = q.a(getContext(), 50.0f);
                    f6 = 250.0f;
                    break;
                case 2:
                    a9 = q.a(getContext(), 320.0f);
                    a10 = q.a(getContext(), 90.0f);
                    f6 = 250.0f;
                    break;
                case 3:
                    a9 = q.a(getContext(), 720.0f);
                    a10 = q.a(getContext(), 90.0f);
                    f6 = 250.0f;
                    break;
                default:
                    f6 = 250.0f;
                    break;
            }
            this.f11467A.setLayoutParams(new ViewGroup.LayoutParams(Math.min(a9, getResources().getDisplayMetrics().widthPixels), a10));
            addView(this.f11467A);
            FrameLayout frameLayout = (FrameLayout) findViewById(q.a(getContext(), "myoffer_banner_template_view", "id"));
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
            layoutParams2.gravity = 17;
            View adMediaView = this.f11468B.getAdMediaView(frameLayout);
            this.f11476K = adMediaView;
            if (adMediaView != null) {
                if (adMediaView.getParent() != null) {
                    ((ViewGroup) this.f11476K.getParent()).removeView(this.f11476K);
                }
                frameLayout.addView(this.f11476K, layoutParams2);
            }
            CloseImageView closeImageView = (CloseImageView) i.j(this, "myoffer_banner_close", "id");
            this.f9972b = closeImageView;
            if (closeImageView != null) {
                if (this.f11478M) {
                    closeImageView.setVisibility(0);
                } else {
                    closeImageView.setVisibility(8);
                }
            }
            z8 = true;
            c10 = 65535;
        } else {
            f6 = 250.0f;
            this.f11467A = new FrameLayout(this.f11482Q);
            String str3 = this.f11480O;
            str3.getClass();
            switch (str3.hashCode()) {
                case -559799608:
                    if (str3.equals(y.f14336c)) {
                        c4 = 0;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 1507809854:
                    if (str3.equals(y.f14335b)) {
                        c4 = 1;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 1622564786:
                    if (str3.equals(y.f14337d)) {
                        c4 = 2;
                        break;
                    }
                    c4 = 65535;
                    break;
                default:
                    c4 = 65535;
                    break;
            }
            switch (c4) {
                case 0:
                    str = "myoffer_banner_native_ad_layout_300x250";
                    break;
                case 1:
                    com.anythink.core.common.l.g.d dVar = this.f11468B;
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
            this.f11467A.addView((ViewGroup) LayoutInflater.from(this.f11482Q).inflate(q.a(getContext(), str, "layout"), (ViewGroup) this, false));
            addView(this.f11467A);
            this.f11469C = (FrameLayout) findViewById(q.a(getContext(), "myoffer_main_resouce_container", "id"));
            this.f11470D = (FrameLayout) i.j(this, "myoffer_banner_icon_container", "id");
            this.f11471E = (LinearLayout) i.j(this, "ll_title_desc", "id");
            this.f11475I = (RoundImageView) i.j(this, "myoffer_banner_icon", "id");
            this.f11472F = (TextView) i.j(this, "myoffer_banner_ad_title", "id");
            this.f11473G = (TextView) i.j(this, "myoffer_banner_desc", "id");
            this.f11474H = (ScanningAnimButton) i.j(this, "myoffer_banner_ad_install_btn", "id");
            this.f11479N = (TextView) i.j(this, "myoffer_banner_ad_from", "id");
            CloseImageView closeImageView2 = (CloseImageView) i.j(this, "myoffer_banner_close", "id");
            this.f9972b = closeImageView2;
            ScanningAnimButton scanningAnimButton = this.f11474H;
            if (scanningAnimButton != null) {
                scanningAnimButton.startAnimation(1);
            }
            a(this.f11479N, this.f11468B.getAdFrom());
            if (closeImageView2 != null) {
                if (this.f11478M) {
                    closeImageView2.setVisibility(0);
                } else {
                    closeImageView2.setVisibility(8);
                }
            }
            View adIconView = this.f11468B.getAdIconView();
            this.J = adIconView;
            if (adIconView != null) {
                if (adIconView.getParent() != null && (this.J.getParent() instanceof ViewGroup)) {
                    ((ViewGroup) this.J.getParent()).removeView(this.J);
                }
                this.f11470D.removeAllViews();
                this.f11470D.addView(this.J, new FrameLayout.LayoutParams(-1, -1));
            } else if (TextUtils.isEmpty(this.f9893g.z()) || this.f11475I == null) {
                FrameLayout frameLayout2 = this.f11470D;
                if (frameLayout2 != null) {
                    frameLayout2.setVisibility(8);
                }
            } else {
                this.f11470D.setVisibility(0);
                ViewGroup.LayoutParams layoutParams3 = this.f11470D.getLayoutParams();
                this.f11475I.setRadiusInDip(6);
                this.f11475I.setNeedRadiu(true);
                com.anythink.core.common.res.b.a(getContext()).a(new e(1, this.f9893g.z()), layoutParams3.width, layoutParams3.height, new AnonymousClass1());
            }
            a(this.f11472F, this.f9893g.x());
            String D8 = this.f9893g.D();
            a(this.f11474H, D8);
            if (TextUtils.isEmpty(D8)) {
                ScanningAnimButton scanningAnimButton2 = this.f11474H;
                if (scanningAnimButton2 != null) {
                    scanningAnimButton2.setVisibility(8);
                }
            } else {
                ScanningAnimButton scanningAnimButton3 = this.f11474H;
                if (scanningAnimButton3 != null) {
                    scanningAnimButton3.setVisibility(0);
                }
            }
            a(this.f11473G, this.f9893g.y());
            if (this.f11469C != null) {
                c9 = 65535;
                c9 = 65535;
                c9 = 65535;
                FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-1, -2);
                layoutParams4.gravity = 17;
                this.f11476K = this.f11468B.getAdMediaView(this.f11469C);
                String mainImageUrl = this.f11468B.getMainImageUrl();
                if (this.f11476K != null) {
                    this.f11469C.setVisibility(0);
                    if (this.f11476K.getParent() != null) {
                        ((ViewGroup) this.f11476K.getParent()).removeView(this.f11476K);
                    }
                    this.f11469C.addView(this.f11476K, layoutParams4);
                    z8 = true;
                } else if (TextUtils.isEmpty(mainImageUrl)) {
                    z8 = true;
                    this.f11469C.setVisibility(8);
                } else {
                    this.f11469C.setVisibility(0);
                    RoundImageView roundImageView = new RoundImageView(getContext());
                    this.f11469C.addView(roundImageView, layoutParams4);
                    z8 = true;
                    com.anythink.core.common.res.b.a(getContext()).a(new e(1, mainImageUrl), new AnonymousClass2(mainImageUrl, roundImageView));
                }
            } else {
                z8 = true;
                c9 = 65535;
            }
            View adLogoView = this.f11468B.getAdLogoView();
            com.anythink.basead.ui.f.a aVar = new com.anythink.basead.ui.f.a(this.f9893g, this.f9892f);
            this.f9974d = aVar;
            aVar.a(adLogoView);
            this.f9974d.b((View) this);
            c10 = c9;
        }
        c();
        com.anythink.core.common.l.g.d dVar2 = this.f11468B;
        if (this.f11467A != null) {
            Context context = getContext();
            String str4 = this.f11480O;
            str4.getClass();
            switch (str4.hashCode()) {
                case -559799608:
                    if (str4.equals(y.f14336c)) {
                        r72 = 0;
                        break;
                    }
                    r72 = c10;
                    break;
                case 1507809730:
                    if (str4.equals(y.f14334a)) {
                        r72 = z8;
                        break;
                    }
                    r72 = c10;
                    break;
                case 1507809854:
                    if (str4.equals(y.f14335b)) {
                        r72 = 2;
                        break;
                    }
                    r72 = c10;
                    break;
                case 1622564786:
                    if (str4.equals(y.f14337d)) {
                        r72 = 3;
                        break;
                    }
                    r72 = c10;
                    break;
                default:
                    r72 = c10;
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
            String str5 = this.f11480O;
            str5.getClass();
            ?? r13 = c10;
            switch (str5.hashCode()) {
                case -559799608:
                    r13 = c10;
                    if (str5.equals(y.f14336c)) {
                        r13 = 0;
                        break;
                    }
                    break;
                case 1507809730:
                    r13 = c10;
                    if (str5.equals(y.f14334a)) {
                        r13 = z8;
                        break;
                    }
                    break;
                case 1507809854:
                    r13 = c10;
                    if (str5.equals(y.f14335b)) {
                        r13 = 2;
                        break;
                    }
                    break;
                case 1622564786:
                    r13 = c10;
                    if (str5.equals(y.f14337d)) {
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
                    f6 = 50.0f;
                    break;
                case 2:
                case 3:
                    f6 = 90.0f;
                    break;
            }
            int a12 = q.a(context, f6);
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
                this.f11467A.setLayoutParams(layoutParams);
                am.a(customAdContainer);
                customAdContainer.addView(this.f11467A);
                if (customAdContainer.getParent() != null) {
                    ((ViewGroup) customAdContainer.getParent()).removeView(customAdContainer);
                }
                addView(customAdContainer);
            }
            b(this.f11467A);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0067, code lost:
    
        if (r5.equals(com.anythink.core.common.h.y.f14336c) == false) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void x() {
        char c4 = 0;
        this.f11467A = (ViewGroup) LayoutInflater.from(this.f11482Q).inflate(q.a(getContext(), "myoffer_banner_ad_layout_template", "layout"), (ViewGroup) this, false);
        int a9 = q.a(getContext(), 320.0f);
        int a10 = q.a(getContext(), 50.0f);
        String str = this.f11480O;
        str.getClass();
        switch (str.hashCode()) {
            case -559799608:
                break;
            case 1507809730:
                if (str.equals(y.f14334a)) {
                    c4 = 1;
                    break;
                }
                c4 = 65535;
                break;
            case 1507809854:
                if (str.equals(y.f14335b)) {
                    c4 = 2;
                    break;
                }
                c4 = 65535;
                break;
            case 1622564786:
                if (str.equals(y.f14337d)) {
                    c4 = 3;
                    break;
                }
                c4 = 65535;
                break;
            default:
                c4 = 65535;
                break;
        }
        switch (c4) {
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
        this.f11467A.setLayoutParams(new ViewGroup.LayoutParams(Math.min(a9, getResources().getDisplayMetrics().widthPixels), a10));
        addView(this.f11467A);
    }

    private void y() {
        String str;
        this.f11467A = new FrameLayout(this.f11482Q);
        String str2 = this.f11480O;
        str2.getClass();
        switch (str2) {
            case "300x250":
                str = "myoffer_banner_native_ad_layout_300x250";
                break;
            case "320x90":
                com.anythink.core.common.l.g.d dVar = this.f11468B;
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
        this.f11467A.addView((ViewGroup) LayoutInflater.from(this.f11482Q).inflate(q.a(getContext(), str, "layout"), (ViewGroup) this, false));
        addView(this.f11467A);
    }

    private void z() {
        FrameLayout frameLayout = (FrameLayout) i.j(this, "myoffer_banner_template_view", "id");
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 17;
        View adMediaView = this.f11468B.getAdMediaView(frameLayout);
        this.f11476K = adMediaView;
        if (adMediaView != null) {
            if (adMediaView.getParent() != null) {
                ((ViewGroup) this.f11476K.getParent()).removeView(this.f11476K);
            }
            frameLayout.addView(this.f11476K, layoutParams);
        }
        CloseImageView closeImageView = (CloseImageView) i.j(this, "myoffer_banner_close", "id");
        this.f9972b = closeImageView;
        if (closeImageView != null) {
            if (this.f11478M) {
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
        com.anythink.core.common.l.g.d dVar = this.f11468B;
        if (dVar != null) {
            dVar.clear(this.f11467A);
            this.f11468B.destroy();
        }
    }

    @Override // com.anythink.basead.ui.BaseATView, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        com.anythink.basead.mixad.f.b bVar = this.f11481P;
        if (bVar != null) {
            bVar.a(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public int getClickedArea() {
        com.anythink.basead.mixad.f.b bVar = this.f11481P;
        return bVar != null ? bVar.a() : com.anythink.basead.mixad.f.b.f9720a;
    }

    @Override // com.anythink.basead.ui.BaseBannerATView, com.anythink.basead.ui.BaseATView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return super.onInterceptTouchEvent(motionEvent);
    }

    private void b(View view) {
        RoundImageView roundImageView;
        int i = this.f9892f.f14317f;
        FrameLayout.LayoutParams a9 = com.anythink.basead.mixad.f.a.a(i, a(32.0f), a(8.0f));
        com.anythink.core.basead.b.b bVar = new com.anythink.core.basead.b.b();
        int[] h9 = this.f11468B.h();
        if (h9 == null) {
            c(this);
        } else {
            for (int i4 : h9) {
                if (i4 == 1) {
                    View view2 = this.J;
                    if (view2 != null) {
                        c(view2);
                        bVar.b(this.J);
                    } else if (!TextUtils.isEmpty(this.f11468B.getIconImageUrl()) && (roundImageView = this.f11475I) != null) {
                        c(roundImageView);
                        bVar.b(this.f11475I);
                    }
                    c(this.f11476K);
                    View view3 = this.f11476K;
                    if (view3 != null) {
                        bVar.c(view3);
                    }
                } else if (i4 == 2) {
                    c(this.f11472F);
                    bVar.a(this.f11472F);
                } else if (i4 == 3) {
                    c(this.f11473G);
                    bVar.d(this.f11473G);
                } else if (i4 == 4) {
                    c(this.f11474H);
                    bVar.e(this.f11474H);
                } else if (i4 == 5) {
                    c(this);
                }
            }
        }
        CloseImageView closeImageView = this.f9972b;
        if (closeImageView != null) {
            bVar.i(closeImageView);
        }
        if (this.f9974d != null && i == 34) {
            bVar.f(this.f11479N);
            this.f9974d.a(this.f11468B, bVar, false);
        }
        com.anythink.core.common.l.g.d dVar = this.f11468B;
        if (dVar != null) {
            dVar.registerListener(view, this.f9899n, a9, bVar);
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
        float f6;
        char c4;
        String str;
        char c9;
        char c10;
        char c11;
        float f9;
        ViewGroup.LayoutParams layoutParams;
        char c12;
        this.f11478M = false;
        this.f11480O = "";
        if (baseAd instanceof com.anythink.core.common.l.g.d) {
            this.f11468B = (com.anythink.core.common.l.g.d) baseAd;
        }
        com.anythink.core.common.l.g.d dVar = this.f11468B;
        if (dVar == null || wVar == null || xVar == null) {
            return;
        }
        this.f11482Q = context;
        this.f11478M = dVar.p();
        this.f11477L = new ArrayList();
        if (!this.f11468B.isNativeExpress()) {
            for (int i : this.f11468B.h()) {
                this.f11477L.add(Integer.valueOf(i));
            }
        }
        this.f11480O = this.f11468B.n();
        float f10 = 300.0f;
        if (this.f11468B.isNativeExpress()) {
            this.f11467A = (ViewGroup) LayoutInflater.from(this.f11482Q).inflate(q.a(getContext(), "myoffer_banner_ad_layout_template", "layout"), (ViewGroup) this, false);
            int a9 = q.a(getContext(), 320.0f);
            int a10 = q.a(getContext(), 50.0f);
            String str2 = this.f11480O;
            str2.getClass();
            switch (str2.hashCode()) {
                case -559799608:
                    if (str2.equals(y.f14336c)) {
                        c12 = 0;
                        break;
                    }
                    c12 = 65535;
                    break;
                case 1507809730:
                    if (str2.equals(y.f14334a)) {
                        c12 = 1;
                        break;
                    }
                    c12 = 65535;
                    break;
                case 1507809854:
                    if (str2.equals(y.f14335b)) {
                        c12 = 2;
                        break;
                    }
                    c12 = 65535;
                    break;
                case 1622564786:
                    if (str2.equals(y.f14337d)) {
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
                    f6 = 250.0f;
                    a10 = q.a(getContext(), 250.0f);
                    break;
                case 1:
                    a9 = q.a(getContext(), 320.0f);
                    a10 = q.a(getContext(), 50.0f);
                    f6 = 250.0f;
                    break;
                case 2:
                    a9 = q.a(getContext(), 320.0f);
                    a10 = q.a(getContext(), 90.0f);
                    f6 = 250.0f;
                    break;
                case 3:
                    a9 = q.a(getContext(), 720.0f);
                    a10 = q.a(getContext(), 90.0f);
                    f6 = 250.0f;
                    break;
                default:
                    f6 = 250.0f;
                    break;
            }
            this.f11467A.setLayoutParams(new ViewGroup.LayoutParams(Math.min(a9, getResources().getDisplayMetrics().widthPixels), a10));
            addView(this.f11467A);
            FrameLayout frameLayout = (FrameLayout) findViewById(q.a(getContext(), "myoffer_banner_template_view", "id"));
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
            layoutParams2.gravity = 17;
            View adMediaView = this.f11468B.getAdMediaView(frameLayout);
            this.f11476K = adMediaView;
            if (adMediaView != null) {
                if (adMediaView.getParent() != null) {
                    ((ViewGroup) this.f11476K.getParent()).removeView(this.f11476K);
                }
                frameLayout.addView(this.f11476K, layoutParams2);
            }
            CloseImageView closeImageView = (CloseImageView) i.j(this, "myoffer_banner_close", "id");
            this.f9972b = closeImageView;
            if (closeImageView != null) {
                if (this.f11478M) {
                    closeImageView.setVisibility(0);
                } else {
                    closeImageView.setVisibility(8);
                }
            }
            c9 = 65535;
        } else {
            f6 = 250.0f;
            this.f11467A = new FrameLayout(this.f11482Q);
            String str3 = this.f11480O;
            str3.getClass();
            switch (str3.hashCode()) {
                case -559799608:
                    if (str3.equals(y.f14336c)) {
                        c4 = 0;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 1507809854:
                    if (str3.equals(y.f14335b)) {
                        c4 = 1;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 1622564786:
                    if (str3.equals(y.f14337d)) {
                        c4 = 2;
                        break;
                    }
                    c4 = 65535;
                    break;
                default:
                    c4 = 65535;
                    break;
            }
            switch (c4) {
                case 0:
                    str = "myoffer_banner_native_ad_layout_300x250";
                    break;
                case 1:
                    com.anythink.core.common.l.g.d dVar2 = this.f11468B;
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
            this.f11467A.addView((ViewGroup) LayoutInflater.from(this.f11482Q).inflate(q.a(getContext(), str, "layout"), (ViewGroup) this, false));
            addView(this.f11467A);
            this.f11469C = (FrameLayout) findViewById(q.a(getContext(), "myoffer_main_resouce_container", "id"));
            this.f11470D = (FrameLayout) i.j(this, "myoffer_banner_icon_container", "id");
            this.f11471E = (LinearLayout) i.j(this, "ll_title_desc", "id");
            this.f11475I = (RoundImageView) i.j(this, "myoffer_banner_icon", "id");
            this.f11472F = (TextView) i.j(this, "myoffer_banner_ad_title", "id");
            this.f11473G = (TextView) i.j(this, "myoffer_banner_desc", "id");
            this.f11474H = (ScanningAnimButton) i.j(this, "myoffer_banner_ad_install_btn", "id");
            this.f11479N = (TextView) i.j(this, "myoffer_banner_ad_from", "id");
            CloseImageView closeImageView2 = (CloseImageView) i.j(this, "myoffer_banner_close", "id");
            this.f9972b = closeImageView2;
            ScanningAnimButton scanningAnimButton = this.f11474H;
            if (scanningAnimButton != null) {
                scanningAnimButton.startAnimation(1);
            }
            a(this.f11479N, this.f11468B.getAdFrom());
            if (closeImageView2 != null) {
                if (this.f11478M) {
                    closeImageView2.setVisibility(0);
                } else {
                    closeImageView2.setVisibility(8);
                }
            }
            View adIconView = this.f11468B.getAdIconView();
            this.J = adIconView;
            if (adIconView != null) {
                if (adIconView.getParent() != null && (this.J.getParent() instanceof ViewGroup)) {
                    ((ViewGroup) this.J.getParent()).removeView(this.J);
                }
                this.f11470D.removeAllViews();
                this.f11470D.addView(this.J, new FrameLayout.LayoutParams(-1, -1));
            } else if (!TextUtils.isEmpty(this.f9893g.z()) && this.f11475I != null) {
                this.f11470D.setVisibility(0);
                ViewGroup.LayoutParams layoutParams3 = this.f11470D.getLayoutParams();
                this.f11475I.setRadiusInDip(6);
                this.f11475I.setNeedRadiu(true);
                com.anythink.core.common.res.b.a(getContext()).a(new e(1, this.f9893g.z()), layoutParams3.width, layoutParams3.height, new AnonymousClass1());
            } else {
                FrameLayout frameLayout2 = this.f11470D;
                if (frameLayout2 != null) {
                    frameLayout2.setVisibility(8);
                }
            }
            a(this.f11472F, this.f9893g.x());
            String D8 = this.f9893g.D();
            a(this.f11474H, D8);
            if (TextUtils.isEmpty(D8)) {
                ScanningAnimButton scanningAnimButton2 = this.f11474H;
                if (scanningAnimButton2 != null) {
                    scanningAnimButton2.setVisibility(8);
                }
            } else {
                ScanningAnimButton scanningAnimButton3 = this.f11474H;
                if (scanningAnimButton3 != null) {
                    scanningAnimButton3.setVisibility(0);
                }
            }
            a(this.f11473G, this.f9893g.y());
            if (this.f11469C != null) {
                c9 = 65535;
                FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-1, -2);
                layoutParams4.gravity = 17;
                this.f11476K = this.f11468B.getAdMediaView(this.f11469C);
                String mainImageUrl = this.f11468B.getMainImageUrl();
                if (this.f11476K != null) {
                    this.f11469C.setVisibility(0);
                    if (this.f11476K.getParent() != null) {
                        ((ViewGroup) this.f11476K.getParent()).removeView(this.f11476K);
                    }
                    this.f11469C.addView(this.f11476K, layoutParams4);
                } else if (!TextUtils.isEmpty(mainImageUrl)) {
                    this.f11469C.setVisibility(0);
                    RoundImageView roundImageView = new RoundImageView(getContext());
                    this.f11469C.addView(roundImageView, layoutParams4);
                    com.anythink.core.common.res.b.a(getContext()).a(new e(1, mainImageUrl), new AnonymousClass2(mainImageUrl, roundImageView));
                } else {
                    this.f11469C.setVisibility(8);
                }
            } else {
                c9 = 65535;
            }
            View adLogoView = this.f11468B.getAdLogoView();
            com.anythink.basead.ui.f.a aVar2 = new com.anythink.basead.ui.f.a(this.f9893g, this.f9892f);
            this.f9974d = aVar2;
            aVar2.a(adLogoView);
            this.f9974d.b(this);
        }
        c();
        com.anythink.core.common.l.g.d dVar3 = this.f11468B;
        if (this.f11467A != null) {
            Context context2 = getContext();
            String str4 = this.f11480O;
            str4.getClass();
            switch (str4.hashCode()) {
                case -559799608:
                    if (str4.equals(y.f14336c)) {
                        c10 = 0;
                        break;
                    }
                    c10 = c9;
                    break;
                case 1507809730:
                    if (str4.equals(y.f14334a)) {
                        c10 = 1;
                        break;
                    }
                    c10 = c9;
                    break;
                case 1507809854:
                    if (str4.equals(y.f14335b)) {
                        c10 = 2;
                        break;
                    }
                    c10 = c9;
                    break;
                case 1622564786:
                    if (str4.equals(y.f14337d)) {
                        c10 = 3;
                        break;
                    }
                    c10 = c9;
                    break;
                default:
                    c10 = c9;
                    break;
            }
            switch (c10) {
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
            String str5 = this.f11480O;
            str5.getClass();
            switch (str5.hashCode()) {
                case -559799608:
                    if (str5.equals(y.f14336c)) {
                        c11 = 0;
                        break;
                    }
                    c11 = c9;
                    break;
                case 1507809730:
                    if (str5.equals(y.f14334a)) {
                        c11 = 1;
                        break;
                    }
                    c11 = c9;
                    break;
                case 1507809854:
                    if (str5.equals(y.f14335b)) {
                        c11 = 2;
                        break;
                    }
                    c11 = c9;
                    break;
                case 1622564786:
                    if (str5.equals(y.f14337d)) {
                        c11 = 3;
                        break;
                    }
                    c11 = c9;
                    break;
                default:
                    c11 = c9;
                    break;
            }
            switch (c11) {
                case 0:
                    f9 = f6;
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
            int i4 = getResources().getDisplayMetrics().widthPixels;
            a11 = a11 > i4 ? i4 : a11;
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
                this.f11467A.setLayoutParams(layoutParams);
                am.a(customAdContainer);
                customAdContainer.addView(this.f11467A);
                if (customAdContainer.getParent() != null) {
                    ((ViewGroup) customAdContainer.getParent()).removeView(customAdContainer);
                }
                addView(customAdContainer);
            }
            b(this.f11467A);
        }
        if (this.f11468B.isNativeExpress()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (this.f11470D != null) {
            arrayList.add(this.f11469C);
        }
        FrameLayout frameLayout3 = this.f11470D;
        if (frameLayout3 != null) {
            arrayList.add(frameLayout3);
        }
        this.f11481P = new b.a().a(arrayList).a(this.f11472F).b(this.f11473G).c(this.f11474H).a();
    }

    private int a(float f6) {
        return q.a(getContext(), f6);
    }

    private static boolean a(float f6, float f9, View view) {
        if (view == null) {
            return false;
        }
        float x3 = view.getX();
        float y6 = view.getY();
        return f6 >= x3 && f6 <= ((float) view.getWidth()) + x3 && f9 >= y6 && f9 <= ((float) view.getHeight()) + y6;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x006a, code lost:
    
        if (r11.equals(com.anythink.core.common.h.y.f14337d) == false) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void a(BaseAd baseAd) {
        boolean z8;
        ViewGroup.LayoutParams layoutParams;
        char c4 = 3;
        if (this.f11467A == null) {
            return;
        }
        Context context = getContext();
        String str = this.f11480O;
        str.getClass();
        float f6 = 320.0f;
        switch (str.hashCode()) {
            case -559799608:
                if (str.equals(y.f14336c)) {
                    z8 = false;
                    break;
                }
                z8 = -1;
                break;
            case 1507809730:
                if (str.equals(y.f14334a)) {
                    z8 = true;
                    break;
                }
                z8 = -1;
                break;
            case 1507809854:
                if (str.equals(y.f14335b)) {
                    z8 = 2;
                    break;
                }
                z8 = -1;
                break;
            case 1622564786:
                if (str.equals(y.f14337d)) {
                    z8 = 3;
                    break;
                }
                z8 = -1;
                break;
            default:
                z8 = -1;
                break;
        }
        switch (z8) {
            case false:
                f6 = 300.0f;
                break;
            case true:
                f6 = 728.0f;
                break;
        }
        int a9 = q.a(context, f6);
        String str2 = this.f11480O;
        str2.getClass();
        float f9 = 50.0f;
        switch (str2.hashCode()) {
            case -559799608:
                if (str2.equals(y.f14336c)) {
                    c4 = 0;
                    break;
                }
                c4 = 65535;
                break;
            case 1507809730:
                if (str2.equals(y.f14334a)) {
                    c4 = 1;
                    break;
                }
                c4 = 65535;
                break;
            case 1507809854:
                if (str2.equals(y.f14335b)) {
                    c4 = 2;
                    break;
                }
                c4 = 65535;
                break;
            case 1622564786:
                break;
            default:
                c4 = 65535;
                break;
        }
        switch (c4) {
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
            this.f11467A.setLayoutParams(layoutParams);
            am.a(customAdContainer);
            customAdContainer.addView(this.f11467A);
            if (customAdContainer.getParent() != null) {
                ((ViewGroup) customAdContainer.getParent()).removeView(customAdContainer);
            }
            addView(customAdContainer);
        }
        b(this.f11467A);
    }

    private int b(Context context) {
        float f6;
        String str = this.f11480O;
        str.getClass();
        f6 = 50.0f;
        switch (str) {
            case "300x250":
                f6 = 250.0f;
                break;
            case "320x90":
            case "728x90":
                f6 = 90.0f;
                break;
        }
        return q.a(context, f6);
    }

    private int a(Context context) {
        float f6;
        String str = this.f11480O;
        str.getClass();
        f6 = 320.0f;
        switch (str) {
            case "300x250":
                f6 = 300.0f;
                break;
            case "728x90":
                f6 = 728.0f;
                break;
        }
        return q.a(context, f6);
    }
}
