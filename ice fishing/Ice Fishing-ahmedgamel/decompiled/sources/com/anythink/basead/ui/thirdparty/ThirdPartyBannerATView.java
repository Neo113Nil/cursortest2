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
import com.IceFishing.LiveIceFishing.k;
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
    private ViewGroup f12096A;

    /* renamed from: B, reason: collision with root package name */
    private com.anythink.core.common.l.g.d f12097B;

    /* renamed from: C, reason: collision with root package name */
    private FrameLayout f12098C;

    /* renamed from: D, reason: collision with root package name */
    private FrameLayout f12099D;

    /* renamed from: E, reason: collision with root package name */
    private LinearLayout f12100E;

    /* renamed from: F, reason: collision with root package name */
    private TextView f12101F;

    /* renamed from: G, reason: collision with root package name */
    private TextView f12102G;

    /* renamed from: H, reason: collision with root package name */
    private ScanningAnimButton f12103H;

    /* renamed from: I, reason: collision with root package name */
    private RoundImageView f12104I;
    private View J;

    /* renamed from: K, reason: collision with root package name */
    private View f12105K;

    /* renamed from: L, reason: collision with root package name */
    private List<Integer> f12106L;

    /* renamed from: M, reason: collision with root package name */
    private boolean f12107M;

    /* renamed from: N, reason: collision with root package name */
    private TextView f12108N;

    /* renamed from: O, reason: collision with root package name */
    private String f12109O;

    /* renamed from: P, reason: collision with root package name */
    private com.anythink.basead.mixad.f.b f12110P;

    /* renamed from: Q, reason: collision with root package name */
    private Context f12111Q;

    /* renamed from: com.anythink.basead.ui.thirdparty.ThirdPartyBannerATView$1, reason: invalid class name */
    public class AnonymousClass1 implements b.a {
        public AnonymousClass1() {
        }

        @Override // com.anythink.core.common.res.b.a
        public final void onFail(String str, String str2) {
        }

        @Override // com.anythink.core.common.res.b.a
        public final void onSuccess(String str, Bitmap bitmap) {
            if (TextUtils.equals(((BaseATView) ThirdPartyBannerATView.this).f10522g.z(), str)) {
                ThirdPartyBannerATView.this.f12104I.setImageBitmap(bitmap);
            }
        }
    }

    /* renamed from: com.anythink.basead.ui.thirdparty.ThirdPartyBannerATView$2, reason: invalid class name */
    public class AnonymousClass2 implements b.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f12113a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ RoundImageView f12114b;

        public AnonymousClass2(String str, RoundImageView roundImageView) {
            this.f12113a = str;
            this.f12114b = roundImageView;
        }

        @Override // com.anythink.core.common.res.b.a
        public final void onFail(String str, String str2) {
        }

        @Override // com.anythink.core.common.res.b.a
        public final void onSuccess(String str, Bitmap bitmap) {
            if (TextUtils.equals(this.f12113a, str)) {
                this.f12114b.setImageBitmap(bitmap);
            }
        }
    }

    public ThirdPartyBannerATView(Context context) {
        super(context);
        this.f12107M = false;
        this.f12109O = "";
        this.f12111Q = context;
    }

    private void A() {
        this.f12098C = (FrameLayout) k.i(this, "myoffer_main_resouce_container", "id");
        this.f12099D = (FrameLayout) k.i(this, "myoffer_banner_icon_container", "id");
        this.f12100E = (LinearLayout) k.i(this, "ll_title_desc", "id");
        this.f12104I = (RoundImageView) k.i(this, "myoffer_banner_icon", "id");
        this.f12101F = (TextView) k.i(this, "myoffer_banner_ad_title", "id");
        this.f12102G = (TextView) k.i(this, "myoffer_banner_desc", "id");
        this.f12103H = (ScanningAnimButton) k.i(this, "myoffer_banner_ad_install_btn", "id");
        this.f12108N = (TextView) k.i(this, "myoffer_banner_ad_from", "id");
        CloseImageView closeImageView = (CloseImageView) k.i(this, "myoffer_banner_close", "id");
        this.f10601b = closeImageView;
        ScanningAnimButton scanningAnimButton = this.f12103H;
        if (scanningAnimButton != null) {
            scanningAnimButton.startAnimation(1);
        }
        a(this.f12108N, this.f12097B.getAdFrom());
        if (closeImageView != null) {
            if (this.f12107M) {
                closeImageView.setVisibility(0);
            } else {
                closeImageView.setVisibility(8);
            }
        }
        View adIconView = this.f12097B.getAdIconView();
        this.J = adIconView;
        if (adIconView != null) {
            if (adIconView.getParent() != null && (this.J.getParent() instanceof ViewGroup)) {
                ((ViewGroup) this.J.getParent()).removeView(this.J);
            }
            this.f12099D.removeAllViews();
            this.f12099D.addView(this.J, new FrameLayout.LayoutParams(-1, -1));
        } else if (TextUtils.isEmpty(this.f10522g.z()) || this.f12104I == null) {
            FrameLayout frameLayout = this.f12099D;
            if (frameLayout != null) {
                frameLayout.setVisibility(8);
            }
        } else {
            this.f12099D.setVisibility(0);
            ViewGroup.LayoutParams layoutParams = this.f12099D.getLayoutParams();
            this.f12104I.setRadiusInDip(6);
            this.f12104I.setNeedRadiu(true);
            com.anythink.core.common.res.b.a(getContext()).a(new e(1, this.f10522g.z()), layoutParams.width, layoutParams.height, new AnonymousClass1());
        }
        a(this.f12101F, this.f10522g.x());
        String D8 = this.f10522g.D();
        a(this.f12103H, D8);
        if (TextUtils.isEmpty(D8)) {
            ScanningAnimButton scanningAnimButton2 = this.f12103H;
            if (scanningAnimButton2 != null) {
                scanningAnimButton2.setVisibility(8);
            }
        } else {
            ScanningAnimButton scanningAnimButton3 = this.f12103H;
            if (scanningAnimButton3 != null) {
                scanningAnimButton3.setVisibility(0);
            }
        }
        a(this.f12102G, this.f10522g.y());
        if (this.f12098C != null) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
            layoutParams2.gravity = 17;
            this.f12105K = this.f12097B.getAdMediaView(this.f12098C);
            String mainImageUrl = this.f12097B.getMainImageUrl();
            if (this.f12105K != null) {
                this.f12098C.setVisibility(0);
                if (this.f12105K.getParent() != null) {
                    ((ViewGroup) this.f12105K.getParent()).removeView(this.f12105K);
                }
                this.f12098C.addView(this.f12105K, layoutParams2);
            } else if (TextUtils.isEmpty(mainImageUrl)) {
                this.f12098C.setVisibility(8);
            } else {
                this.f12098C.setVisibility(0);
                RoundImageView roundImageView = new RoundImageView(getContext());
                this.f12098C.addView(roundImageView, layoutParams2);
                com.anythink.core.common.res.b.a(getContext()).a(new e(1, mainImageUrl), new AnonymousClass2(mainImageUrl, roundImageView));
            }
        }
        View adLogoView = this.f12097B.getAdLogoView();
        com.anythink.basead.ui.f.a aVar = new com.anythink.basead.ui.f.a(this.f10522g, this.f10521f);
        this.f10603d = aVar;
        aVar.a(adLogoView);
        this.f10603d.b(this);
    }

    private void B() {
        ArrayList arrayList = new ArrayList();
        if (this.f12099D != null) {
            arrayList.add(this.f12098C);
        }
        FrameLayout frameLayout = this.f12099D;
        if (frameLayout != null) {
            arrayList.add(frameLayout);
        }
        this.f12110P = new b.a().a(arrayList).a(this.f12101F).b(this.f12102G).c(this.f12103H).a();
    }

    private boolean C() {
        return this.f12097B.isNativeExpress();
    }

    private void c(View view) {
        if (view != null) {
            this.f10528n.add(view);
        }
    }

    private void d() {
        this.f12107M = this.f12097B.p();
        this.f12106L = new ArrayList();
        if (!this.f12097B.isNativeExpress()) {
            for (int i : this.f12097B.h()) {
                this.f12106L.add(Integer.valueOf(i));
            }
        }
        this.f12109O = this.f12097B.n();
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
        float f2;
        char c9;
        String str;
        boolean z6;
        char c10;
        char c11;
        ?? r72;
        ViewGroup.LayoutParams layoutParams;
        char c12;
        float f9 = 300.0f;
        if (this.f12097B.isNativeExpress()) {
            this.f12096A = (ViewGroup) LayoutInflater.from(this.f12111Q).inflate(q.a(getContext(), "myoffer_banner_ad_layout_template", "layout"), (ViewGroup) this, false);
            int a9 = q.a(getContext(), 320.0f);
            int a10 = q.a(getContext(), 50.0f);
            String str2 = this.f12109O;
            str2.getClass();
            switch (str2.hashCode()) {
                case -559799608:
                    if (str2.equals(y.f14965c)) {
                        c12 = 0;
                        break;
                    }
                    c12 = 65535;
                    break;
                case 1507809730:
                    if (str2.equals(y.f14963a)) {
                        c12 = 1;
                        break;
                    }
                    c12 = 65535;
                    break;
                case 1507809854:
                    if (str2.equals(y.f14964b)) {
                        c12 = 2;
                        break;
                    }
                    c12 = 65535;
                    break;
                case 1622564786:
                    if (str2.equals(y.f14966d)) {
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
                    f2 = 250.0f;
                    a10 = q.a(getContext(), 250.0f);
                    break;
                case 1:
                    a9 = q.a(getContext(), 320.0f);
                    a10 = q.a(getContext(), 50.0f);
                    f2 = 250.0f;
                    break;
                case 2:
                    a9 = q.a(getContext(), 320.0f);
                    a10 = q.a(getContext(), 90.0f);
                    f2 = 250.0f;
                    break;
                case 3:
                    a9 = q.a(getContext(), 720.0f);
                    a10 = q.a(getContext(), 90.0f);
                    f2 = 250.0f;
                    break;
                default:
                    f2 = 250.0f;
                    break;
            }
            this.f12096A.setLayoutParams(new ViewGroup.LayoutParams(Math.min(a9, getResources().getDisplayMetrics().widthPixels), a10));
            addView(this.f12096A);
            FrameLayout frameLayout = (FrameLayout) findViewById(q.a(getContext(), "myoffer_banner_template_view", "id"));
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
            layoutParams2.gravity = 17;
            View adMediaView = this.f12097B.getAdMediaView(frameLayout);
            this.f12105K = adMediaView;
            if (adMediaView != null) {
                if (adMediaView.getParent() != null) {
                    ((ViewGroup) this.f12105K.getParent()).removeView(this.f12105K);
                }
                frameLayout.addView(this.f12105K, layoutParams2);
            }
            CloseImageView closeImageView = (CloseImageView) k.i(this, "myoffer_banner_close", "id");
            this.f10601b = closeImageView;
            if (closeImageView != null) {
                if (this.f12107M) {
                    closeImageView.setVisibility(0);
                } else {
                    closeImageView.setVisibility(8);
                }
            }
            z6 = true;
            c11 = 65535;
        } else {
            f2 = 250.0f;
            this.f12096A = new FrameLayout(this.f12111Q);
            String str3 = this.f12109O;
            str3.getClass();
            switch (str3.hashCode()) {
                case -559799608:
                    if (str3.equals(y.f14965c)) {
                        c9 = 0;
                        break;
                    }
                    c9 = 65535;
                    break;
                case 1507809854:
                    if (str3.equals(y.f14964b)) {
                        c9 = 1;
                        break;
                    }
                    c9 = 65535;
                    break;
                case 1622564786:
                    if (str3.equals(y.f14966d)) {
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
                    com.anythink.core.common.l.g.d dVar = this.f12097B;
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
            this.f12096A.addView((ViewGroup) LayoutInflater.from(this.f12111Q).inflate(q.a(getContext(), str, "layout"), (ViewGroup) this, false));
            addView(this.f12096A);
            this.f12098C = (FrameLayout) findViewById(q.a(getContext(), "myoffer_main_resouce_container", "id"));
            this.f12099D = (FrameLayout) k.i(this, "myoffer_banner_icon_container", "id");
            this.f12100E = (LinearLayout) k.i(this, "ll_title_desc", "id");
            this.f12104I = (RoundImageView) k.i(this, "myoffer_banner_icon", "id");
            this.f12101F = (TextView) k.i(this, "myoffer_banner_ad_title", "id");
            this.f12102G = (TextView) k.i(this, "myoffer_banner_desc", "id");
            this.f12103H = (ScanningAnimButton) k.i(this, "myoffer_banner_ad_install_btn", "id");
            this.f12108N = (TextView) k.i(this, "myoffer_banner_ad_from", "id");
            CloseImageView closeImageView2 = (CloseImageView) k.i(this, "myoffer_banner_close", "id");
            this.f10601b = closeImageView2;
            ScanningAnimButton scanningAnimButton = this.f12103H;
            if (scanningAnimButton != null) {
                scanningAnimButton.startAnimation(1);
            }
            a(this.f12108N, this.f12097B.getAdFrom());
            if (closeImageView2 != null) {
                if (this.f12107M) {
                    closeImageView2.setVisibility(0);
                } else {
                    closeImageView2.setVisibility(8);
                }
            }
            View adIconView = this.f12097B.getAdIconView();
            this.J = adIconView;
            if (adIconView != null) {
                if (adIconView.getParent() != null && (this.J.getParent() instanceof ViewGroup)) {
                    ((ViewGroup) this.J.getParent()).removeView(this.J);
                }
                this.f12099D.removeAllViews();
                this.f12099D.addView(this.J, new FrameLayout.LayoutParams(-1, -1));
            } else if (TextUtils.isEmpty(this.f10522g.z()) || this.f12104I == null) {
                FrameLayout frameLayout2 = this.f12099D;
                if (frameLayout2 != null) {
                    frameLayout2.setVisibility(8);
                }
            } else {
                this.f12099D.setVisibility(0);
                ViewGroup.LayoutParams layoutParams3 = this.f12099D.getLayoutParams();
                this.f12104I.setRadiusInDip(6);
                this.f12104I.setNeedRadiu(true);
                com.anythink.core.common.res.b.a(getContext()).a(new e(1, this.f10522g.z()), layoutParams3.width, layoutParams3.height, new AnonymousClass1());
            }
            a(this.f12101F, this.f10522g.x());
            String D8 = this.f10522g.D();
            a(this.f12103H, D8);
            if (TextUtils.isEmpty(D8)) {
                ScanningAnimButton scanningAnimButton2 = this.f12103H;
                if (scanningAnimButton2 != null) {
                    scanningAnimButton2.setVisibility(8);
                }
            } else {
                ScanningAnimButton scanningAnimButton3 = this.f12103H;
                if (scanningAnimButton3 != null) {
                    scanningAnimButton3.setVisibility(0);
                }
            }
            a(this.f12102G, this.f10522g.y());
            if (this.f12098C != null) {
                c10 = 65535;
                c10 = 65535;
                c10 = 65535;
                FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-1, -2);
                layoutParams4.gravity = 17;
                this.f12105K = this.f12097B.getAdMediaView(this.f12098C);
                String mainImageUrl = this.f12097B.getMainImageUrl();
                if (this.f12105K != null) {
                    this.f12098C.setVisibility(0);
                    if (this.f12105K.getParent() != null) {
                        ((ViewGroup) this.f12105K.getParent()).removeView(this.f12105K);
                    }
                    this.f12098C.addView(this.f12105K, layoutParams4);
                    z6 = true;
                } else if (TextUtils.isEmpty(mainImageUrl)) {
                    z6 = true;
                    this.f12098C.setVisibility(8);
                } else {
                    this.f12098C.setVisibility(0);
                    RoundImageView roundImageView = new RoundImageView(getContext());
                    this.f12098C.addView(roundImageView, layoutParams4);
                    z6 = true;
                    com.anythink.core.common.res.b.a(getContext()).a(new e(1, mainImageUrl), new AnonymousClass2(mainImageUrl, roundImageView));
                }
            } else {
                z6 = true;
                c10 = 65535;
            }
            View adLogoView = this.f12097B.getAdLogoView();
            com.anythink.basead.ui.f.a aVar = new com.anythink.basead.ui.f.a(this.f10522g, this.f10521f);
            this.f10603d = aVar;
            aVar.a(adLogoView);
            this.f10603d.b((View) this);
            c11 = c10;
        }
        c();
        com.anythink.core.common.l.g.d dVar2 = this.f12097B;
        if (this.f12096A != null) {
            Context context = getContext();
            String str4 = this.f12109O;
            str4.getClass();
            switch (str4.hashCode()) {
                case -559799608:
                    if (str4.equals(y.f14965c)) {
                        r72 = 0;
                        break;
                    }
                    r72 = c11;
                    break;
                case 1507809730:
                    if (str4.equals(y.f14963a)) {
                        r72 = z6;
                        break;
                    }
                    r72 = c11;
                    break;
                case 1507809854:
                    if (str4.equals(y.f14964b)) {
                        r72 = 2;
                        break;
                    }
                    r72 = c11;
                    break;
                case 1622564786:
                    if (str4.equals(y.f14966d)) {
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
            String str5 = this.f12109O;
            str5.getClass();
            ?? r13 = c11;
            switch (str5.hashCode()) {
                case -559799608:
                    r13 = c11;
                    if (str5.equals(y.f14965c)) {
                        r13 = 0;
                        break;
                    }
                    break;
                case 1507809730:
                    r13 = c11;
                    if (str5.equals(y.f14963a)) {
                        r13 = z6;
                        break;
                    }
                    break;
                case 1507809854:
                    r13 = c11;
                    if (str5.equals(y.f14964b)) {
                        r13 = 2;
                        break;
                    }
                    break;
                case 1622564786:
                    r13 = c11;
                    if (str5.equals(y.f14966d)) {
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
                    f2 = 50.0f;
                    break;
                case 2:
                case 3:
                    f2 = 90.0f;
                    break;
            }
            int a12 = q.a(context, f2);
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
                this.f12096A.setLayoutParams(layoutParams);
                am.a(customAdContainer);
                customAdContainer.addView(this.f12096A);
                if (customAdContainer.getParent() != null) {
                    ((ViewGroup) customAdContainer.getParent()).removeView(customAdContainer);
                }
                addView(customAdContainer);
            }
            b(this.f12096A);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0067, code lost:
    
        if (r5.equals(com.anythink.core.common.h.y.f14965c) == false) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void x() {
        char c9 = 0;
        this.f12096A = (ViewGroup) LayoutInflater.from(this.f12111Q).inflate(q.a(getContext(), "myoffer_banner_ad_layout_template", "layout"), (ViewGroup) this, false);
        int a9 = q.a(getContext(), 320.0f);
        int a10 = q.a(getContext(), 50.0f);
        String str = this.f12109O;
        str.getClass();
        switch (str.hashCode()) {
            case -559799608:
                break;
            case 1507809730:
                if (str.equals(y.f14963a)) {
                    c9 = 1;
                    break;
                }
                c9 = 65535;
                break;
            case 1507809854:
                if (str.equals(y.f14964b)) {
                    c9 = 2;
                    break;
                }
                c9 = 65535;
                break;
            case 1622564786:
                if (str.equals(y.f14966d)) {
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
        this.f12096A.setLayoutParams(new ViewGroup.LayoutParams(Math.min(a9, getResources().getDisplayMetrics().widthPixels), a10));
        addView(this.f12096A);
    }

    private void y() {
        String str;
        this.f12096A = new FrameLayout(this.f12111Q);
        String str2 = this.f12109O;
        str2.getClass();
        switch (str2) {
            case "300x250":
                str = "myoffer_banner_native_ad_layout_300x250";
                break;
            case "320x90":
                com.anythink.core.common.l.g.d dVar = this.f12097B;
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
        this.f12096A.addView((ViewGroup) LayoutInflater.from(this.f12111Q).inflate(q.a(getContext(), str, "layout"), (ViewGroup) this, false));
        addView(this.f12096A);
    }

    private void z() {
        FrameLayout frameLayout = (FrameLayout) k.i(this, "myoffer_banner_template_view", "id");
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 17;
        View adMediaView = this.f12097B.getAdMediaView(frameLayout);
        this.f12105K = adMediaView;
        if (adMediaView != null) {
            if (adMediaView.getParent() != null) {
                ((ViewGroup) this.f12105K.getParent()).removeView(this.f12105K);
            }
            frameLayout.addView(this.f12105K, layoutParams);
        }
        CloseImageView closeImageView = (CloseImageView) k.i(this, "myoffer_banner_close", "id");
        this.f10601b = closeImageView;
        if (closeImageView != null) {
            if (this.f12107M) {
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
        com.anythink.core.common.l.g.d dVar = this.f12097B;
        if (dVar != null) {
            dVar.clear(this.f12096A);
            this.f12097B.destroy();
        }
    }

    @Override // com.anythink.basead.ui.BaseATView, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        com.anythink.basead.mixad.f.b bVar = this.f12110P;
        if (bVar != null) {
            bVar.a(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public int getClickedArea() {
        com.anythink.basead.mixad.f.b bVar = this.f12110P;
        return bVar != null ? bVar.a() : com.anythink.basead.mixad.f.b.f10349a;
    }

    @Override // com.anythink.basead.ui.BaseBannerATView, com.anythink.basead.ui.BaseATView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return super.onInterceptTouchEvent(motionEvent);
    }

    private void b(View view) {
        RoundImageView roundImageView;
        int i = this.f10521f.f14946f;
        FrameLayout.LayoutParams a9 = com.anythink.basead.mixad.f.a.a(i, a(32.0f), a(8.0f));
        com.anythink.core.basead.b.b bVar = new com.anythink.core.basead.b.b();
        int[] h3 = this.f12097B.h();
        if (h3 == null) {
            c(this);
        } else {
            for (int i4 : h3) {
                if (i4 == 1) {
                    View view2 = this.J;
                    if (view2 != null) {
                        c(view2);
                        bVar.b(this.J);
                    } else if (!TextUtils.isEmpty(this.f12097B.getIconImageUrl()) && (roundImageView = this.f12104I) != null) {
                        c(roundImageView);
                        bVar.b(this.f12104I);
                    }
                    c(this.f12105K);
                    View view3 = this.f12105K;
                    if (view3 != null) {
                        bVar.c(view3);
                    }
                } else if (i4 == 2) {
                    c(this.f12101F);
                    bVar.a(this.f12101F);
                } else if (i4 == 3) {
                    c(this.f12102G);
                    bVar.d(this.f12102G);
                } else if (i4 == 4) {
                    c(this.f12103H);
                    bVar.e(this.f12103H);
                } else if (i4 == 5) {
                    c(this);
                }
            }
        }
        CloseImageView closeImageView = this.f10601b;
        if (closeImageView != null) {
            bVar.i(closeImageView);
        }
        if (this.f10603d != null && i == 34) {
            bVar.f(this.f12108N);
            this.f10603d.a(this.f12097B, bVar, false);
        }
        com.anythink.core.common.l.g.d dVar = this.f12097B;
        if (dVar != null) {
            dVar.registerListener(view, this.f10528n, a9, bVar);
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
        float f2;
        char c9;
        String str;
        char c10;
        char c11;
        char c12;
        float f9;
        ViewGroup.LayoutParams layoutParams;
        char c13;
        this.f12107M = false;
        this.f12109O = "";
        if (baseAd instanceof com.anythink.core.common.l.g.d) {
            this.f12097B = (com.anythink.core.common.l.g.d) baseAd;
        }
        com.anythink.core.common.l.g.d dVar = this.f12097B;
        if (dVar == null || wVar == null || xVar == null) {
            return;
        }
        this.f12111Q = context;
        this.f12107M = dVar.p();
        this.f12106L = new ArrayList();
        if (!this.f12097B.isNativeExpress()) {
            for (int i : this.f12097B.h()) {
                this.f12106L.add(Integer.valueOf(i));
            }
        }
        this.f12109O = this.f12097B.n();
        float f10 = 300.0f;
        if (this.f12097B.isNativeExpress()) {
            this.f12096A = (ViewGroup) LayoutInflater.from(this.f12111Q).inflate(q.a(getContext(), "myoffer_banner_ad_layout_template", "layout"), (ViewGroup) this, false);
            int a9 = q.a(getContext(), 320.0f);
            int a10 = q.a(getContext(), 50.0f);
            String str2 = this.f12109O;
            str2.getClass();
            switch (str2.hashCode()) {
                case -559799608:
                    if (str2.equals(y.f14965c)) {
                        c13 = 0;
                        break;
                    }
                    c13 = 65535;
                    break;
                case 1507809730:
                    if (str2.equals(y.f14963a)) {
                        c13 = 1;
                        break;
                    }
                    c13 = 65535;
                    break;
                case 1507809854:
                    if (str2.equals(y.f14964b)) {
                        c13 = 2;
                        break;
                    }
                    c13 = 65535;
                    break;
                case 1622564786:
                    if (str2.equals(y.f14966d)) {
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
                    f2 = 250.0f;
                    a10 = q.a(getContext(), 250.0f);
                    break;
                case 1:
                    a9 = q.a(getContext(), 320.0f);
                    a10 = q.a(getContext(), 50.0f);
                    f2 = 250.0f;
                    break;
                case 2:
                    a9 = q.a(getContext(), 320.0f);
                    a10 = q.a(getContext(), 90.0f);
                    f2 = 250.0f;
                    break;
                case 3:
                    a9 = q.a(getContext(), 720.0f);
                    a10 = q.a(getContext(), 90.0f);
                    f2 = 250.0f;
                    break;
                default:
                    f2 = 250.0f;
                    break;
            }
            this.f12096A.setLayoutParams(new ViewGroup.LayoutParams(Math.min(a9, getResources().getDisplayMetrics().widthPixels), a10));
            addView(this.f12096A);
            FrameLayout frameLayout = (FrameLayout) findViewById(q.a(getContext(), "myoffer_banner_template_view", "id"));
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
            layoutParams2.gravity = 17;
            View adMediaView = this.f12097B.getAdMediaView(frameLayout);
            this.f12105K = adMediaView;
            if (adMediaView != null) {
                if (adMediaView.getParent() != null) {
                    ((ViewGroup) this.f12105K.getParent()).removeView(this.f12105K);
                }
                frameLayout.addView(this.f12105K, layoutParams2);
            }
            CloseImageView closeImageView = (CloseImageView) k.i(this, "myoffer_banner_close", "id");
            this.f10601b = closeImageView;
            if (closeImageView != null) {
                if (this.f12107M) {
                    closeImageView.setVisibility(0);
                } else {
                    closeImageView.setVisibility(8);
                }
            }
            c10 = 65535;
        } else {
            f2 = 250.0f;
            this.f12096A = new FrameLayout(this.f12111Q);
            String str3 = this.f12109O;
            str3.getClass();
            switch (str3.hashCode()) {
                case -559799608:
                    if (str3.equals(y.f14965c)) {
                        c9 = 0;
                        break;
                    }
                    c9 = 65535;
                    break;
                case 1507809854:
                    if (str3.equals(y.f14964b)) {
                        c9 = 1;
                        break;
                    }
                    c9 = 65535;
                    break;
                case 1622564786:
                    if (str3.equals(y.f14966d)) {
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
                    com.anythink.core.common.l.g.d dVar2 = this.f12097B;
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
            this.f12096A.addView((ViewGroup) LayoutInflater.from(this.f12111Q).inflate(q.a(getContext(), str, "layout"), (ViewGroup) this, false));
            addView(this.f12096A);
            this.f12098C = (FrameLayout) findViewById(q.a(getContext(), "myoffer_main_resouce_container", "id"));
            this.f12099D = (FrameLayout) k.i(this, "myoffer_banner_icon_container", "id");
            this.f12100E = (LinearLayout) k.i(this, "ll_title_desc", "id");
            this.f12104I = (RoundImageView) k.i(this, "myoffer_banner_icon", "id");
            this.f12101F = (TextView) k.i(this, "myoffer_banner_ad_title", "id");
            this.f12102G = (TextView) k.i(this, "myoffer_banner_desc", "id");
            this.f12103H = (ScanningAnimButton) k.i(this, "myoffer_banner_ad_install_btn", "id");
            this.f12108N = (TextView) k.i(this, "myoffer_banner_ad_from", "id");
            CloseImageView closeImageView2 = (CloseImageView) k.i(this, "myoffer_banner_close", "id");
            this.f10601b = closeImageView2;
            ScanningAnimButton scanningAnimButton = this.f12103H;
            if (scanningAnimButton != null) {
                scanningAnimButton.startAnimation(1);
            }
            a(this.f12108N, this.f12097B.getAdFrom());
            if (closeImageView2 != null) {
                if (this.f12107M) {
                    closeImageView2.setVisibility(0);
                } else {
                    closeImageView2.setVisibility(8);
                }
            }
            View adIconView = this.f12097B.getAdIconView();
            this.J = adIconView;
            if (adIconView != null) {
                if (adIconView.getParent() != null && (this.J.getParent() instanceof ViewGroup)) {
                    ((ViewGroup) this.J.getParent()).removeView(this.J);
                }
                this.f12099D.removeAllViews();
                this.f12099D.addView(this.J, new FrameLayout.LayoutParams(-1, -1));
            } else if (!TextUtils.isEmpty(this.f10522g.z()) && this.f12104I != null) {
                this.f12099D.setVisibility(0);
                ViewGroup.LayoutParams layoutParams3 = this.f12099D.getLayoutParams();
                this.f12104I.setRadiusInDip(6);
                this.f12104I.setNeedRadiu(true);
                com.anythink.core.common.res.b.a(getContext()).a(new e(1, this.f10522g.z()), layoutParams3.width, layoutParams3.height, new AnonymousClass1());
            } else {
                FrameLayout frameLayout2 = this.f12099D;
                if (frameLayout2 != null) {
                    frameLayout2.setVisibility(8);
                }
            }
            a(this.f12101F, this.f10522g.x());
            String D8 = this.f10522g.D();
            a(this.f12103H, D8);
            if (TextUtils.isEmpty(D8)) {
                ScanningAnimButton scanningAnimButton2 = this.f12103H;
                if (scanningAnimButton2 != null) {
                    scanningAnimButton2.setVisibility(8);
                }
            } else {
                ScanningAnimButton scanningAnimButton3 = this.f12103H;
                if (scanningAnimButton3 != null) {
                    scanningAnimButton3.setVisibility(0);
                }
            }
            a(this.f12102G, this.f10522g.y());
            if (this.f12098C != null) {
                c10 = 65535;
                FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-1, -2);
                layoutParams4.gravity = 17;
                this.f12105K = this.f12097B.getAdMediaView(this.f12098C);
                String mainImageUrl = this.f12097B.getMainImageUrl();
                if (this.f12105K != null) {
                    this.f12098C.setVisibility(0);
                    if (this.f12105K.getParent() != null) {
                        ((ViewGroup) this.f12105K.getParent()).removeView(this.f12105K);
                    }
                    this.f12098C.addView(this.f12105K, layoutParams4);
                } else if (!TextUtils.isEmpty(mainImageUrl)) {
                    this.f12098C.setVisibility(0);
                    RoundImageView roundImageView = new RoundImageView(getContext());
                    this.f12098C.addView(roundImageView, layoutParams4);
                    com.anythink.core.common.res.b.a(getContext()).a(new e(1, mainImageUrl), new AnonymousClass2(mainImageUrl, roundImageView));
                } else {
                    this.f12098C.setVisibility(8);
                }
            } else {
                c10 = 65535;
            }
            View adLogoView = this.f12097B.getAdLogoView();
            com.anythink.basead.ui.f.a aVar2 = new com.anythink.basead.ui.f.a(this.f10522g, this.f10521f);
            this.f10603d = aVar2;
            aVar2.a(adLogoView);
            this.f10603d.b(this);
        }
        c();
        com.anythink.core.common.l.g.d dVar3 = this.f12097B;
        if (this.f12096A != null) {
            Context context2 = getContext();
            String str4 = this.f12109O;
            str4.getClass();
            switch (str4.hashCode()) {
                case -559799608:
                    if (str4.equals(y.f14965c)) {
                        c11 = 0;
                        break;
                    }
                    c11 = c10;
                    break;
                case 1507809730:
                    if (str4.equals(y.f14963a)) {
                        c11 = 1;
                        break;
                    }
                    c11 = c10;
                    break;
                case 1507809854:
                    if (str4.equals(y.f14964b)) {
                        c11 = 2;
                        break;
                    }
                    c11 = c10;
                    break;
                case 1622564786:
                    if (str4.equals(y.f14966d)) {
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
            String str5 = this.f12109O;
            str5.getClass();
            switch (str5.hashCode()) {
                case -559799608:
                    if (str5.equals(y.f14965c)) {
                        c12 = 0;
                        break;
                    }
                    c12 = c10;
                    break;
                case 1507809730:
                    if (str5.equals(y.f14963a)) {
                        c12 = 1;
                        break;
                    }
                    c12 = c10;
                    break;
                case 1507809854:
                    if (str5.equals(y.f14964b)) {
                        c12 = 2;
                        break;
                    }
                    c12 = c10;
                    break;
                case 1622564786:
                    if (str5.equals(y.f14966d)) {
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
                    f9 = f2;
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
                this.f12096A.setLayoutParams(layoutParams);
                am.a(customAdContainer);
                customAdContainer.addView(this.f12096A);
                if (customAdContainer.getParent() != null) {
                    ((ViewGroup) customAdContainer.getParent()).removeView(customAdContainer);
                }
                addView(customAdContainer);
            }
            b(this.f12096A);
        }
        if (this.f12097B.isNativeExpress()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (this.f12099D != null) {
            arrayList.add(this.f12098C);
        }
        FrameLayout frameLayout3 = this.f12099D;
        if (frameLayout3 != null) {
            arrayList.add(frameLayout3);
        }
        this.f12110P = new b.a().a(arrayList).a(this.f12101F).b(this.f12102G).c(this.f12103H).a();
    }

    private int a(float f2) {
        return q.a(getContext(), f2);
    }

    private static boolean a(float f2, float f9, View view) {
        if (view == null) {
            return false;
        }
        float x9 = view.getX();
        float y7 = view.getY();
        return f2 >= x9 && f2 <= ((float) view.getWidth()) + x9 && f9 >= y7 && f9 <= ((float) view.getHeight()) + y7;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x006a, code lost:
    
        if (r11.equals(com.anythink.core.common.h.y.f14966d) == false) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void a(BaseAd baseAd) {
        boolean z6;
        ViewGroup.LayoutParams layoutParams;
        char c9 = 3;
        if (this.f12096A == null) {
            return;
        }
        Context context = getContext();
        String str = this.f12109O;
        str.getClass();
        float f2 = 320.0f;
        switch (str.hashCode()) {
            case -559799608:
                if (str.equals(y.f14965c)) {
                    z6 = false;
                    break;
                }
                z6 = -1;
                break;
            case 1507809730:
                if (str.equals(y.f14963a)) {
                    z6 = true;
                    break;
                }
                z6 = -1;
                break;
            case 1507809854:
                if (str.equals(y.f14964b)) {
                    z6 = 2;
                    break;
                }
                z6 = -1;
                break;
            case 1622564786:
                if (str.equals(y.f14966d)) {
                    z6 = 3;
                    break;
                }
                z6 = -1;
                break;
            default:
                z6 = -1;
                break;
        }
        switch (z6) {
            case false:
                f2 = 300.0f;
                break;
            case true:
                f2 = 728.0f;
                break;
        }
        int a9 = q.a(context, f2);
        String str2 = this.f12109O;
        str2.getClass();
        float f9 = 50.0f;
        switch (str2.hashCode()) {
            case -559799608:
                if (str2.equals(y.f14965c)) {
                    c9 = 0;
                    break;
                }
                c9 = 65535;
                break;
            case 1507809730:
                if (str2.equals(y.f14963a)) {
                    c9 = 1;
                    break;
                }
                c9 = 65535;
                break;
            case 1507809854:
                if (str2.equals(y.f14964b)) {
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
            this.f12096A.setLayoutParams(layoutParams);
            am.a(customAdContainer);
            customAdContainer.addView(this.f12096A);
            if (customAdContainer.getParent() != null) {
                ((ViewGroup) customAdContainer.getParent()).removeView(customAdContainer);
            }
            addView(customAdContainer);
        }
        b(this.f12096A);
    }

    private int b(Context context) {
        float f2;
        String str = this.f12109O;
        str.getClass();
        f2 = 50.0f;
        switch (str) {
            case "300x250":
                f2 = 250.0f;
                break;
            case "320x90":
            case "728x90":
                f2 = 90.0f;
                break;
        }
        return q.a(context, f2);
    }

    private int a(Context context) {
        float f2;
        String str = this.f12109O;
        str.getClass();
        f2 = 320.0f;
        switch (str) {
            case "300x250":
                f2 = 300.0f;
                break;
            case "728x90":
                f2 = 728.0f;
                break;
        }
        return q.a(context, f2);
    }
}
