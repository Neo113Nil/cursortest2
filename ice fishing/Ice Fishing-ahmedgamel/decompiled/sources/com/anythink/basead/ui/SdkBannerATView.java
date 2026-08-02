package com.anythink.basead.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.IceFishing.LiveIceFishing.k;
import com.anythink.basead.d.j;
import com.anythink.basead.ui.component.a;
import com.anythink.core.common.h.ay;
import com.anythink.core.common.h.bj;
import com.anythink.core.common.h.w;
import com.anythink.core.common.h.x;
import com.anythink.core.common.h.y;
import com.anythink.core.common.res.b;
import com.anythink.core.common.res.e;
import com.anythink.core.common.res.image.RecycleImageView;
import com.anythink.core.common.ui.component.RoundImageView;
import com.anythink.core.common.v.h;
import com.anythink.core.common.v.q;

/* loaded from: classes.dex */
public class SdkBannerATView extends BaseBannerATView {

    /* renamed from: D, reason: collision with root package name */
    private static final int f11030D = 1;

    /* renamed from: E, reason: collision with root package name */
    private static final int f11031E = 2;

    /* renamed from: A, reason: collision with root package name */
    String f11032A;

    /* renamed from: B, reason: collision with root package name */
    SimplePlayerBannerMediaView f11033B;

    /* renamed from: C, reason: collision with root package name */
    private int f11034C;

    /* renamed from: F, reason: collision with root package name */
    private final View.OnClickListener f11035F;

    /* renamed from: G, reason: collision with root package name */
    private final View.OnClickListener f11036G;

    /* renamed from: com.anythink.basead.ui.SdkBannerATView$3, reason: invalid class name */
    public class AnonymousClass3 implements b.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ RoundImageView f11039a;

        public AnonymousClass3(RoundImageView roundImageView) {
            this.f11039a = roundImageView;
        }

        @Override // com.anythink.core.common.res.b.a
        public final void onFail(String str, String str2) {
        }

        @Override // com.anythink.core.common.res.b.a
        public final void onSuccess(String str, Bitmap bitmap) {
            if (TextUtils.equals(SdkBannerATView.this.f10522g.z(), str)) {
                this.f11039a.setImageBitmap(bitmap);
            }
        }
    }

    public SdkBannerATView(Context context) {
        super(context);
        this.f11035F = new View.OnClickListener() { // from class: com.anythink.basead.ui.SdkBannerATView.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SdkBannerATView.this.a(1, 3);
            }
        };
        this.f11036G = new View.OnClickListener() { // from class: com.anythink.basead.ui.SdkBannerATView.2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SdkBannerATView sdkBannerATView = SdkBannerATView.this;
                View view2 = sdkBannerATView.f10531q;
                if (view2 == null || view2 != view) {
                    sdkBannerATView.a(1, 2);
                } else {
                    sdkBannerATView.a(1, 1);
                }
            }
        };
    }

    private void w() {
        RoundImageView roundImageView = (RoundImageView) k.g(this, "myoffer_banner_icon", "id");
        TextView textView = (TextView) k.g(this, "myoffer_banner_ad_title", "id");
        TextView textView2 = (TextView) k.g(this, "myoffer_banner_desc", "id");
        Button button = (Button) k.g(this, "myoffer_banner_ad_install_btn", "id");
        this.f10531q = button;
        this.f10601b = (CloseImageView) k.g(this, "myoffer_banner_close", "id");
        if (this.f10521f.f14954o.E() == 0) {
            this.f10601b.setVisibility(0);
            a((b) this.f10601b, false);
        } else {
            com.anythink.basead.ui.f.b.a((View) this.f10601b, true);
        }
        if (roundImageView != null) {
            if (TextUtils.isEmpty(this.f10522g.z())) {
                roundImageView.setVisibility(0);
                com.anythink.basead.ui.f.b.a((View) roundImageView, false);
            } else {
                ViewGroup.LayoutParams layoutParams = roundImageView.getLayoutParams();
                roundImageView.setVisibility(0);
                roundImageView.setRadiusInDip(6);
                roundImageView.setNeedRadiu(true);
                this.f10528n.add(roundImageView);
                com.anythink.core.common.res.b.a(getContext()).a(new e(1, this.f10522g.z()), layoutParams.width, layoutParams.height, new AnonymousClass3(roundImageView));
            }
        }
        if (TextUtils.isEmpty(this.f10522g.D())) {
            button.setVisibility(8);
        } else {
            button.setText(this.f10522g.D());
            button.setVisibility(0);
            this.f10528n.add(button);
            this.f10529o = button;
        }
        if (TextUtils.isEmpty(this.f10522g.x())) {
            textView.setVisibility(8);
        } else {
            textView.setText(this.f10522g.x());
            textView.setVisibility(0);
            this.f10528n.add(textView);
        }
        if (textView2 != null) {
            if (TextUtils.isEmpty(this.f10522g.y())) {
                textView2.setVisibility(8);
            } else {
                textView2.setText(this.f10522g.y());
                textView2.setVisibility(0);
                this.f10528n.add(textView2);
            }
        }
        a((ViewGroup) k.g(this, "myoffer_main_resouce_container", "id"), (String) null);
    }

    @Override // com.anythink.basead.ui.BaseATView
    public void destroy() {
        super.destroy();
        SimplePlayerBannerMediaView simplePlayerBannerMediaView = this.f11033B;
        if (simplePlayerBannerMediaView != null) {
            simplePlayerBannerMediaView.destroyPlayerView(4);
        }
    }

    private int a(String str) {
        w wVar = this.f10522g;
        int i = 1;
        if (!(wVar instanceof bj) ? !(wVar instanceof ay) || TextUtils.equals(str, wVar.B()) : ((bj) wVar).aJ() != 1) {
            i = 2;
        }
        this.f11034C = i;
        return i;
    }

    private void b(String str) {
        RelativeLayout relativeLayout = (RelativeLayout) k.g(this, "myoffer_banner_root", "id");
        this.f10601b = (CloseImageView) k.g(this, "myoffer_banner_close", "id");
        if (this.f10521f.f14954o.E() == 0) {
            this.f10601b.setVisibility(0);
            if (TextUtils.equals(y.f14966d, this.f11032A)) {
                ViewGroup.LayoutParams layoutParams = this.f10601b.getLayoutParams();
                layoutParams.width = q.a(getContext(), 23.0f);
                layoutParams.height = q.a(getContext(), 23.0f);
                this.f10601b.setLayoutParams(layoutParams);
            }
            a((b) this.f10601b, false);
        } else {
            com.anythink.basead.ui.f.b.a((View) this.f10601b, true);
        }
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) relativeLayout.getLayoutParams();
        layoutParams2.width = -1;
        layoutParams2.height = -1;
        relativeLayout.setLayoutParams(layoutParams2);
        a(this, str);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private void d() {
        char c9;
        String str;
        int a9;
        int a10;
        String D8 = this.f10521f.f14954o.D();
        String d9 = this.f10522g.d((w) this.f10521f.f14954o);
        switch (D8.hashCode()) {
            case -559799608:
                if (D8.equals(y.f14965c)) {
                    c9 = 1;
                    break;
                }
                c9 = 65535;
                break;
            case 1507809730:
                if (D8.equals(y.f14963a)) {
                    c9 = 3;
                    break;
                }
                c9 = 65535;
                break;
            case 1507809854:
                if (D8.equals(y.f14964b)) {
                    c9 = 0;
                    break;
                }
                c9 = 65535;
                break;
            case 1622564786:
                if (D8.equals(y.f14966d)) {
                    c9 = 2;
                    break;
                }
                c9 = 65535;
                break;
            default:
                c9 = 65535;
                break;
        }
        if (c9 == 0) {
            this.f11032A = y.f14964b;
            str = (this.f10522g.L() || !TextUtils.isEmpty(d9)) ? "myoffer_banner_ad_layout_320x90" : "myoffer_banner_ad_layout_no_main_res_320x90";
        } else if (c9 == 1) {
            this.f11032A = y.f14965c;
            str = "myoffer_banner_ad_layout_300x250";
        } else if (c9 != 2) {
            this.f11032A = y.f14963a;
            str = "myoffer_banner_ad_layout_320x50";
        } else {
            this.f11032A = y.f14966d;
            str = "myoffer_banner_ad_layout_728x90";
        }
        w wVar = this.f10522g;
        int i = (!(wVar instanceof bj) ? !(!(wVar instanceof ay) || TextUtils.equals(d9, wVar.B())) : ((bj) wVar).aJ() == 1) ? 2 : 1;
        this.f11034C = i;
        if (1 != i) {
            LayoutInflater.from(getContext()).inflate(q.a(getContext(), str, "layout"), this);
            RoundImageView roundImageView = (RoundImageView) findViewById(q.a(getContext(), "myoffer_banner_icon", "id"));
            TextView textView = (TextView) k.g(this, "myoffer_banner_ad_title", "id");
            TextView textView2 = (TextView) k.g(this, "myoffer_banner_desc", "id");
            Button button = (Button) k.g(this, "myoffer_banner_ad_install_btn", "id");
            this.f10531q = button;
            this.f10601b = (CloseImageView) k.g(this, "myoffer_banner_close", "id");
            if (this.f10521f.f14954o.E() == 0) {
                this.f10601b.setVisibility(0);
                a((b) this.f10601b, false);
            } else {
                com.anythink.basead.ui.f.b.a((View) this.f10601b, true);
            }
            if (roundImageView != null) {
                if (TextUtils.isEmpty(this.f10522g.z())) {
                    roundImageView.setVisibility(0);
                    com.anythink.basead.ui.f.b.a((View) roundImageView, false);
                } else {
                    ViewGroup.LayoutParams layoutParams = roundImageView.getLayoutParams();
                    roundImageView.setVisibility(0);
                    roundImageView.setRadiusInDip(6);
                    roundImageView.setNeedRadiu(true);
                    this.f10528n.add(roundImageView);
                    com.anythink.core.common.res.b.a(getContext()).a(new e(1, this.f10522g.z()), layoutParams.width, layoutParams.height, new AnonymousClass3(roundImageView));
                }
            }
            if (TextUtils.isEmpty(this.f10522g.D())) {
                button.setVisibility(8);
            } else {
                button.setText(this.f10522g.D());
                button.setVisibility(0);
                this.f10528n.add(button);
                this.f10529o = button;
            }
            if (TextUtils.isEmpty(this.f10522g.x())) {
                textView.setVisibility(8);
            } else {
                textView.setText(this.f10522g.x());
                textView.setVisibility(0);
                this.f10528n.add(textView);
            }
            if (textView2 != null) {
                if (TextUtils.isEmpty(this.f10522g.y())) {
                    textView2.setVisibility(8);
                } else {
                    textView2.setText(this.f10522g.y());
                    textView2.setVisibility(0);
                    this.f10528n.add(textView2);
                }
            }
            a((ViewGroup) k.g(this, "myoffer_main_resouce_container", "id"), (String) null);
            return;
        }
        LayoutInflater.from(getContext()).inflate(q.a(getContext(), "myoffer_banner_ad_layout_pure_picture", "layout"), this);
        a9 = q.a(getContext(), 320.0f);
        a10 = q.a(getContext(), 50.0f);
        switch (D8) {
            case "300x250":
                a9 = q.a(getContext(), 300.0f);
                a10 = q.a(getContext(), 250.0f);
                break;
            case "320x50":
                a9 = q.a(getContext(), 320.0f);
                a10 = q.a(getContext(), 50.0f);
                break;
            case "320x90":
                a9 = q.a(getContext(), 320.0f);
                a10 = q.a(getContext(), 90.0f);
                break;
            case "728x90":
                a9 = q.a(getContext(), 720.0f);
                a10 = q.a(getContext(), 90.0f);
                break;
        }
        if (this.f10521f.f14954o.k() > 0) {
            a9 = this.f10521f.f14954o.k();
        }
        if (this.f10521f.f14954o.l() > 0) {
            a10 = this.f10521f.f14954o.l();
        }
        setLayoutParams(new ViewGroup.LayoutParams(Math.min(a9, getResources().getDisplayMetrics().widthPixels), a10));
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(q.a(getContext(), "myoffer_banner_root", "id"));
        this.f10601b = (CloseImageView) k.g(this, "myoffer_banner_close", "id");
        if (this.f10521f.f14954o.E() == 0) {
            this.f10601b.setVisibility(0);
            if (TextUtils.equals(y.f14966d, this.f11032A)) {
                ViewGroup.LayoutParams layoutParams2 = this.f10601b.getLayoutParams();
                layoutParams2.width = q.a(getContext(), 23.0f);
                layoutParams2.height = q.a(getContext(), 23.0f);
                this.f10601b.setLayoutParams(layoutParams2);
            }
            a((b) this.f10601b, false);
        } else {
            com.anythink.basead.ui.f.b.a((View) this.f10601b, true);
        }
        RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) relativeLayout.getLayoutParams();
        layoutParams3.width = -1;
        layoutParams3.height = -1;
        relativeLayout.setLayoutParams(layoutParams3);
        a(this, d9);
    }

    @Override // com.anythink.basead.ui.BaseBannerATView
    public final void c() {
        super.c();
        if (this.f11034C == 1) {
            setOnClickListener(this.f11035F);
            return;
        }
        if (this.f10521f.f14954o.J() == 1) {
            View view = this.f10531q;
            if (view != null) {
                view.setOnClickListener(this.f11036G);
            }
        } else {
            int size = this.f10528n.size();
            for (int i = 0; i < size; i++) {
                View view2 = this.f10528n.get(i);
                if (view2 != null) {
                    view2.setOnClickListener(this.f11036G);
                }
            }
        }
        if (this.f10521f.f14954o.J() == 0) {
            setOnClickListener(this.f11035F);
        }
    }

    public SdkBannerATView(Context context, x xVar, w wVar, com.anythink.basead.g.a aVar) {
        super(context, xVar, wVar, aVar);
        this.f11035F = new View.OnClickListener() { // from class: com.anythink.basead.ui.SdkBannerATView.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SdkBannerATView.this.a(1, 3);
            }
        };
        this.f11036G = new View.OnClickListener() { // from class: com.anythink.basead.ui.SdkBannerATView.2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SdkBannerATView sdkBannerATView = SdkBannerATView.this;
                View view2 = sdkBannerATView.f10531q;
                if (view2 == null || view2 != view) {
                    sdkBannerATView.a(1, 2);
                } else {
                    sdkBannerATView.a(1, 1);
                }
            }
        };
        b();
        c();
    }

    private void a(ViewGroup viewGroup, final String str) {
        if (viewGroup != null) {
            if (com.anythink.basead.b.e.a(this.f10522g, this.f10521f)) {
                SimplePlayerBannerMediaView simplePlayerBannerMediaView = new SimplePlayerBannerMediaView(getContext());
                this.f11033B = simplePlayerBannerMediaView;
                simplePlayerBannerMediaView.setmIsPureMode(this.f11034C == 1);
                viewGroup.addView(this.f11033B, 0, new RelativeLayout.LayoutParams(-1, -1));
                this.f11033B.setATImproveClickViewController(this.f10533s);
                this.f11033B.setIsMuted(true);
                this.f11033B.initPlayerView(this.f10522g, this.f10521f, new a.InterfaceC0056a() { // from class: com.anythink.basead.ui.SdkBannerATView.4
                    @Override // com.anythink.basead.ui.component.a.InterfaceC0056a
                    public final j a() {
                        return SdkBannerATView.this.l();
                    }

                    @Override // com.anythink.basead.ui.component.a.InterfaceC0056a
                    public final com.anythink.basead.d.a b() {
                        return SdkBannerATView.this.m();
                    }
                }, this.f10540z);
                this.f11033B.setPlayerOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.SdkBannerATView.5
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        SdkBannerATView.this.f11036G.onClick(view);
                    }
                });
            } else {
                if (TextUtils.isEmpty(str)) {
                    str = this.f10522g.d((w) this.f10521f.f14954o);
                }
                if (TextUtils.isEmpty(str)) {
                    str = this.f10522g.z();
                }
                if (!TextUtils.isEmpty(str)) {
                    final RecycleImageView recycleImageView = new RecycleImageView(getContext());
                    recycleImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                    final RecycleImageView recycleImageView2 = new RecycleImageView(getContext());
                    recycleImageView2.setScaleType(ImageView.ScaleType.CENTER_CROP);
                    viewGroup.addView(recycleImageView2, 0, new RelativeLayout.LayoutParams(-1, -1));
                    com.anythink.core.common.res.b.a(getContext()).a(new e(1, str), new b.a() { // from class: com.anythink.basead.ui.SdkBannerATView.6
                        @Override // com.anythink.core.common.res.b.a
                        public final void onFail(String str2, String str3) {
                        }

                        @Override // com.anythink.core.common.res.b.a
                        public final void onSuccess(String str2, Bitmap bitmap) {
                            if (TextUtils.equals(str, str2)) {
                                recycleImageView.setImageBitmap(bitmap);
                                h.a(SdkBannerATView.this.getContext(), bitmap, new h.a() { // from class: com.anythink.basead.ui.SdkBannerATView.6.1
                                    @Override // com.anythink.core.common.v.h.a
                                    public final void a() {
                                    }

                                    @Override // com.anythink.core.common.v.h.a
                                    public final void a(Bitmap bitmap2) {
                                        recycleImageView2.setImageBitmap(bitmap2);
                                    }
                                });
                            }
                        }
                    });
                    viewGroup.addView(recycleImageView, 1, new RelativeLayout.LayoutParams(-1, -1));
                    this.f10528n.add(recycleImageView);
                } else {
                    viewGroup.setVisibility(8);
                    return;
                }
            }
            viewGroup.setVisibility(0);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.anythink.basead.ui.BaseATView
    public final void a() {
        char c9;
        String str;
        int a9;
        int a10;
        String D8 = this.f10521f.f14954o.D();
        String d9 = this.f10522g.d((w) this.f10521f.f14954o);
        switch (D8.hashCode()) {
            case -559799608:
                if (D8.equals(y.f14965c)) {
                    c9 = 1;
                    break;
                }
                c9 = 65535;
                break;
            case 1507809730:
                if (D8.equals(y.f14963a)) {
                    c9 = 3;
                    break;
                }
                c9 = 65535;
                break;
            case 1507809854:
                if (D8.equals(y.f14964b)) {
                    c9 = 0;
                    break;
                }
                c9 = 65535;
                break;
            case 1622564786:
                if (D8.equals(y.f14966d)) {
                    c9 = 2;
                    break;
                }
                c9 = 65535;
                break;
            default:
                c9 = 65535;
                break;
        }
        if (c9 == 0) {
            this.f11032A = y.f14964b;
            if (!this.f10522g.L() && TextUtils.isEmpty(d9)) {
                str = "myoffer_banner_ad_layout_no_main_res_320x90";
            } else {
                str = "myoffer_banner_ad_layout_320x90";
            }
        } else if (c9 == 1) {
            this.f11032A = y.f14965c;
            str = "myoffer_banner_ad_layout_300x250";
        } else if (c9 != 2) {
            this.f11032A = y.f14963a;
            str = "myoffer_banner_ad_layout_320x50";
        } else {
            this.f11032A = y.f14966d;
            str = "myoffer_banner_ad_layout_728x90";
        }
        w wVar = this.f10522g;
        int i = (!(wVar instanceof bj) ? !(!(wVar instanceof ay) || TextUtils.equals(d9, wVar.B())) : ((bj) wVar).aJ() == 1) ? 2 : 1;
        this.f11034C = i;
        if (1 == i) {
            LayoutInflater.from(getContext()).inflate(q.a(getContext(), "myoffer_banner_ad_layout_pure_picture", "layout"), this);
            a9 = q.a(getContext(), 320.0f);
            a10 = q.a(getContext(), 50.0f);
            switch (D8) {
                case "300x250":
                    a9 = q.a(getContext(), 300.0f);
                    a10 = q.a(getContext(), 250.0f);
                    break;
                case "320x50":
                    a9 = q.a(getContext(), 320.0f);
                    a10 = q.a(getContext(), 50.0f);
                    break;
                case "320x90":
                    a9 = q.a(getContext(), 320.0f);
                    a10 = q.a(getContext(), 90.0f);
                    break;
                case "728x90":
                    a9 = q.a(getContext(), 720.0f);
                    a10 = q.a(getContext(), 90.0f);
                    break;
            }
            if (this.f10521f.f14954o.k() > 0) {
                a9 = this.f10521f.f14954o.k();
            }
            if (this.f10521f.f14954o.l() > 0) {
                a10 = this.f10521f.f14954o.l();
            }
            setLayoutParams(new ViewGroup.LayoutParams(Math.min(a9, getResources().getDisplayMetrics().widthPixels), a10));
            RelativeLayout relativeLayout = (RelativeLayout) findViewById(q.a(getContext(), "myoffer_banner_root", "id"));
            this.f10601b = (CloseImageView) k.g(this, "myoffer_banner_close", "id");
            if (this.f10521f.f14954o.E() == 0) {
                this.f10601b.setVisibility(0);
                if (TextUtils.equals(y.f14966d, this.f11032A)) {
                    ViewGroup.LayoutParams layoutParams = this.f10601b.getLayoutParams();
                    layoutParams.width = q.a(getContext(), 23.0f);
                    layoutParams.height = q.a(getContext(), 23.0f);
                    this.f10601b.setLayoutParams(layoutParams);
                }
                a((b) this.f10601b, false);
            } else {
                com.anythink.basead.ui.f.b.a((View) this.f10601b, true);
            }
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) relativeLayout.getLayoutParams();
            layoutParams2.width = -1;
            layoutParams2.height = -1;
            relativeLayout.setLayoutParams(layoutParams2);
            a(this, d9);
        } else {
            LayoutInflater.from(getContext()).inflate(q.a(getContext(), str, "layout"), this);
            RoundImageView roundImageView = (RoundImageView) findViewById(q.a(getContext(), "myoffer_banner_icon", "id"));
            TextView textView = (TextView) k.g(this, "myoffer_banner_ad_title", "id");
            TextView textView2 = (TextView) k.g(this, "myoffer_banner_desc", "id");
            Button button = (Button) k.g(this, "myoffer_banner_ad_install_btn", "id");
            this.f10531q = button;
            this.f10601b = (CloseImageView) k.g(this, "myoffer_banner_close", "id");
            if (this.f10521f.f14954o.E() == 0) {
                this.f10601b.setVisibility(0);
                a((b) this.f10601b, false);
            } else {
                com.anythink.basead.ui.f.b.a((View) this.f10601b, true);
            }
            if (roundImageView != null) {
                if (!TextUtils.isEmpty(this.f10522g.z())) {
                    ViewGroup.LayoutParams layoutParams3 = roundImageView.getLayoutParams();
                    roundImageView.setVisibility(0);
                    roundImageView.setRadiusInDip(6);
                    roundImageView.setNeedRadiu(true);
                    this.f10528n.add(roundImageView);
                    com.anythink.core.common.res.b.a(getContext()).a(new e(1, this.f10522g.z()), layoutParams3.width, layoutParams3.height, new AnonymousClass3(roundImageView));
                } else {
                    roundImageView.setVisibility(0);
                    com.anythink.basead.ui.f.b.a((View) roundImageView, false);
                }
            }
            if (!TextUtils.isEmpty(this.f10522g.D())) {
                button.setText(this.f10522g.D());
                button.setVisibility(0);
                this.f10528n.add(button);
                this.f10529o = button;
            } else {
                button.setVisibility(8);
            }
            if (!TextUtils.isEmpty(this.f10522g.x())) {
                textView.setText(this.f10522g.x());
                textView.setVisibility(0);
                this.f10528n.add(textView);
            } else {
                textView.setVisibility(8);
            }
            if (textView2 != null) {
                if (!TextUtils.isEmpty(this.f10522g.y())) {
                    textView2.setText(this.f10522g.y());
                    textView2.setVisibility(0);
                    this.f10528n.add(textView2);
                } else {
                    textView2.setVisibility(8);
                }
            }
            a((ViewGroup) k.g(this, "myoffer_main_resouce_container", "id"), (String) null);
        }
        com.anythink.basead.ui.f.a aVar = new com.anythink.basead.ui.f.a(this.f10522g, this.f10521f);
        this.f10603d = aVar;
        aVar.b(this);
    }
}
