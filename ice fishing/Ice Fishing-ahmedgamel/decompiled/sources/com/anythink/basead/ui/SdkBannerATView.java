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
import com.anythink.basead.d.j;
import com.anythink.basead.exoplayer.f.f;
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
    private static final int f10244D = 1;

    /* renamed from: E, reason: collision with root package name */
    private static final int f10245E = 2;

    /* renamed from: A, reason: collision with root package name */
    String f10246A;

    /* renamed from: B, reason: collision with root package name */
    SimplePlayerBannerMediaView f10247B;

    /* renamed from: C, reason: collision with root package name */
    private int f10248C;

    /* renamed from: F, reason: collision with root package name */
    private final View.OnClickListener f10249F;

    /* renamed from: G, reason: collision with root package name */
    private final View.OnClickListener f10250G;

    /* renamed from: com.anythink.basead.ui.SdkBannerATView$3, reason: invalid class name */
    public class AnonymousClass3 implements b.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ RoundImageView f10253a;

        public AnonymousClass3(RoundImageView roundImageView) {
            this.f10253a = roundImageView;
        }

        @Override // com.anythink.core.common.res.b.a
        public final void onFail(String str, String str2) {
        }

        @Override // com.anythink.core.common.res.b.a
        public final void onSuccess(String str, Bitmap bitmap) {
            if (TextUtils.equals(SdkBannerATView.this.f9736g.z(), str)) {
                this.f10253a.setImageBitmap(bitmap);
            }
        }
    }

    public SdkBannerATView(Context context) {
        super(context);
        this.f10249F = new View.OnClickListener() { // from class: com.anythink.basead.ui.SdkBannerATView.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SdkBannerATView.this.a(1, 3);
            }
        };
        this.f10250G = new View.OnClickListener() { // from class: com.anythink.basead.ui.SdkBannerATView.2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SdkBannerATView sdkBannerATView = SdkBannerATView.this;
                View view2 = sdkBannerATView.f9745q;
                if (view2 == null || view2 != view) {
                    sdkBannerATView.a(1, 2);
                } else {
                    sdkBannerATView.a(1, 1);
                }
            }
        };
    }

    private void w() {
        RoundImageView roundImageView = (RoundImageView) f.i(this, "myoffer_banner_icon", "id");
        TextView textView = (TextView) f.i(this, "myoffer_banner_ad_title", "id");
        TextView textView2 = (TextView) f.i(this, "myoffer_banner_desc", "id");
        Button button = (Button) f.i(this, "myoffer_banner_ad_install_btn", "id");
        this.f9745q = button;
        this.f9815b = (CloseImageView) f.i(this, "myoffer_banner_close", "id");
        if (this.f9735f.f14168o.E() == 0) {
            this.f9815b.setVisibility(0);
            a((b) this.f9815b, false);
        } else {
            com.anythink.basead.ui.f.b.a((View) this.f9815b, true);
        }
        if (roundImageView != null) {
            if (TextUtils.isEmpty(this.f9736g.z())) {
                roundImageView.setVisibility(0);
                com.anythink.basead.ui.f.b.a((View) roundImageView, false);
            } else {
                ViewGroup.LayoutParams layoutParams = roundImageView.getLayoutParams();
                roundImageView.setVisibility(0);
                roundImageView.setRadiusInDip(6);
                roundImageView.setNeedRadiu(true);
                this.f9742n.add(roundImageView);
                com.anythink.core.common.res.b.a(getContext()).a(new e(1, this.f9736g.z()), layoutParams.width, layoutParams.height, new AnonymousClass3(roundImageView));
            }
        }
        if (TextUtils.isEmpty(this.f9736g.D())) {
            button.setVisibility(8);
        } else {
            button.setText(this.f9736g.D());
            button.setVisibility(0);
            this.f9742n.add(button);
            this.f9743o = button;
        }
        if (TextUtils.isEmpty(this.f9736g.x())) {
            textView.setVisibility(8);
        } else {
            textView.setText(this.f9736g.x());
            textView.setVisibility(0);
            this.f9742n.add(textView);
        }
        if (textView2 != null) {
            if (TextUtils.isEmpty(this.f9736g.y())) {
                textView2.setVisibility(8);
            } else {
                textView2.setText(this.f9736g.y());
                textView2.setVisibility(0);
                this.f9742n.add(textView2);
            }
        }
        a((ViewGroup) f.i(this, "myoffer_main_resouce_container", "id"), (String) null);
    }

    @Override // com.anythink.basead.ui.BaseATView
    public void destroy() {
        super.destroy();
        SimplePlayerBannerMediaView simplePlayerBannerMediaView = this.f10247B;
        if (simplePlayerBannerMediaView != null) {
            simplePlayerBannerMediaView.destroyPlayerView(4);
        }
    }

    private int a(String str) {
        w wVar = this.f9736g;
        int i = 1;
        if (!(wVar instanceof bj) ? !(wVar instanceof ay) || TextUtils.equals(str, wVar.B()) : ((bj) wVar).aJ() != 1) {
            i = 2;
        }
        this.f10248C = i;
        return i;
    }

    private void b(String str) {
        RelativeLayout relativeLayout = (RelativeLayout) f.i(this, "myoffer_banner_root", "id");
        this.f9815b = (CloseImageView) f.i(this, "myoffer_banner_close", "id");
        if (this.f9735f.f14168o.E() == 0) {
            this.f9815b.setVisibility(0);
            if (TextUtils.equals(y.f14180d, this.f10246A)) {
                ViewGroup.LayoutParams layoutParams = this.f9815b.getLayoutParams();
                layoutParams.width = q.a(getContext(), 23.0f);
                layoutParams.height = q.a(getContext(), 23.0f);
                this.f9815b.setLayoutParams(layoutParams);
            }
            a((b) this.f9815b, false);
        } else {
            com.anythink.basead.ui.f.b.a((View) this.f9815b, true);
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
        String D8 = this.f9735f.f14168o.D();
        String d2 = this.f9736g.d((w) this.f9735f.f14168o);
        switch (D8.hashCode()) {
            case -559799608:
                if (D8.equals(y.f14179c)) {
                    c9 = 1;
                    break;
                }
                c9 = 65535;
                break;
            case 1507809730:
                if (D8.equals(y.f14177a)) {
                    c9 = 3;
                    break;
                }
                c9 = 65535;
                break;
            case 1507809854:
                if (D8.equals(y.f14178b)) {
                    c9 = 0;
                    break;
                }
                c9 = 65535;
                break;
            case 1622564786:
                if (D8.equals(y.f14180d)) {
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
            this.f10246A = y.f14178b;
            str = (this.f9736g.L() || !TextUtils.isEmpty(d2)) ? "myoffer_banner_ad_layout_320x90" : "myoffer_banner_ad_layout_no_main_res_320x90";
        } else if (c9 == 1) {
            this.f10246A = y.f14179c;
            str = "myoffer_banner_ad_layout_300x250";
        } else if (c9 != 2) {
            this.f10246A = y.f14177a;
            str = "myoffer_banner_ad_layout_320x50";
        } else {
            this.f10246A = y.f14180d;
            str = "myoffer_banner_ad_layout_728x90";
        }
        w wVar = this.f9736g;
        int i = (!(wVar instanceof bj) ? !(!(wVar instanceof ay) || TextUtils.equals(d2, wVar.B())) : ((bj) wVar).aJ() == 1) ? 2 : 1;
        this.f10248C = i;
        if (1 != i) {
            LayoutInflater.from(getContext()).inflate(q.a(getContext(), str, "layout"), this);
            RoundImageView roundImageView = (RoundImageView) findViewById(q.a(getContext(), "myoffer_banner_icon", "id"));
            TextView textView = (TextView) f.i(this, "myoffer_banner_ad_title", "id");
            TextView textView2 = (TextView) f.i(this, "myoffer_banner_desc", "id");
            Button button = (Button) f.i(this, "myoffer_banner_ad_install_btn", "id");
            this.f9745q = button;
            this.f9815b = (CloseImageView) f.i(this, "myoffer_banner_close", "id");
            if (this.f9735f.f14168o.E() == 0) {
                this.f9815b.setVisibility(0);
                a((b) this.f9815b, false);
            } else {
                com.anythink.basead.ui.f.b.a((View) this.f9815b, true);
            }
            if (roundImageView != null) {
                if (TextUtils.isEmpty(this.f9736g.z())) {
                    roundImageView.setVisibility(0);
                    com.anythink.basead.ui.f.b.a((View) roundImageView, false);
                } else {
                    ViewGroup.LayoutParams layoutParams = roundImageView.getLayoutParams();
                    roundImageView.setVisibility(0);
                    roundImageView.setRadiusInDip(6);
                    roundImageView.setNeedRadiu(true);
                    this.f9742n.add(roundImageView);
                    com.anythink.core.common.res.b.a(getContext()).a(new e(1, this.f9736g.z()), layoutParams.width, layoutParams.height, new AnonymousClass3(roundImageView));
                }
            }
            if (TextUtils.isEmpty(this.f9736g.D())) {
                button.setVisibility(8);
            } else {
                button.setText(this.f9736g.D());
                button.setVisibility(0);
                this.f9742n.add(button);
                this.f9743o = button;
            }
            if (TextUtils.isEmpty(this.f9736g.x())) {
                textView.setVisibility(8);
            } else {
                textView.setText(this.f9736g.x());
                textView.setVisibility(0);
                this.f9742n.add(textView);
            }
            if (textView2 != null) {
                if (TextUtils.isEmpty(this.f9736g.y())) {
                    textView2.setVisibility(8);
                } else {
                    textView2.setText(this.f9736g.y());
                    textView2.setVisibility(0);
                    this.f9742n.add(textView2);
                }
            }
            a((ViewGroup) f.i(this, "myoffer_main_resouce_container", "id"), (String) null);
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
        if (this.f9735f.f14168o.k() > 0) {
            a9 = this.f9735f.f14168o.k();
        }
        if (this.f9735f.f14168o.l() > 0) {
            a10 = this.f9735f.f14168o.l();
        }
        setLayoutParams(new ViewGroup.LayoutParams(Math.min(a9, getResources().getDisplayMetrics().widthPixels), a10));
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(q.a(getContext(), "myoffer_banner_root", "id"));
        this.f9815b = (CloseImageView) f.i(this, "myoffer_banner_close", "id");
        if (this.f9735f.f14168o.E() == 0) {
            this.f9815b.setVisibility(0);
            if (TextUtils.equals(y.f14180d, this.f10246A)) {
                ViewGroup.LayoutParams layoutParams2 = this.f9815b.getLayoutParams();
                layoutParams2.width = q.a(getContext(), 23.0f);
                layoutParams2.height = q.a(getContext(), 23.0f);
                this.f9815b.setLayoutParams(layoutParams2);
            }
            a((b) this.f9815b, false);
        } else {
            com.anythink.basead.ui.f.b.a((View) this.f9815b, true);
        }
        RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) relativeLayout.getLayoutParams();
        layoutParams3.width = -1;
        layoutParams3.height = -1;
        relativeLayout.setLayoutParams(layoutParams3);
        a(this, d2);
    }

    @Override // com.anythink.basead.ui.BaseBannerATView
    public final void c() {
        super.c();
        if (this.f10248C == 1) {
            setOnClickListener(this.f10249F);
            return;
        }
        if (this.f9735f.f14168o.J() == 1) {
            View view = this.f9745q;
            if (view != null) {
                view.setOnClickListener(this.f10250G);
            }
        } else {
            int size = this.f9742n.size();
            for (int i = 0; i < size; i++) {
                View view2 = this.f9742n.get(i);
                if (view2 != null) {
                    view2.setOnClickListener(this.f10250G);
                }
            }
        }
        if (this.f9735f.f14168o.J() == 0) {
            setOnClickListener(this.f10249F);
        }
    }

    public SdkBannerATView(Context context, x xVar, w wVar, com.anythink.basead.g.a aVar) {
        super(context, xVar, wVar, aVar);
        this.f10249F = new View.OnClickListener() { // from class: com.anythink.basead.ui.SdkBannerATView.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SdkBannerATView.this.a(1, 3);
            }
        };
        this.f10250G = new View.OnClickListener() { // from class: com.anythink.basead.ui.SdkBannerATView.2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SdkBannerATView sdkBannerATView = SdkBannerATView.this;
                View view2 = sdkBannerATView.f9745q;
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
            if (com.anythink.basead.b.e.a(this.f9736g, this.f9735f)) {
                SimplePlayerBannerMediaView simplePlayerBannerMediaView = new SimplePlayerBannerMediaView(getContext());
                this.f10247B = simplePlayerBannerMediaView;
                simplePlayerBannerMediaView.setmIsPureMode(this.f10248C == 1);
                viewGroup.addView(this.f10247B, 0, new RelativeLayout.LayoutParams(-1, -1));
                this.f10247B.setATImproveClickViewController(this.f9747s);
                this.f10247B.setIsMuted(true);
                this.f10247B.initPlayerView(this.f9736g, this.f9735f, new a.InterfaceC0056a() { // from class: com.anythink.basead.ui.SdkBannerATView.4
                    @Override // com.anythink.basead.ui.component.a.InterfaceC0056a
                    public final j a() {
                        return SdkBannerATView.this.l();
                    }

                    @Override // com.anythink.basead.ui.component.a.InterfaceC0056a
                    public final com.anythink.basead.d.a b() {
                        return SdkBannerATView.this.m();
                    }
                }, this.f9754z);
                this.f10247B.setPlayerOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.SdkBannerATView.5
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        SdkBannerATView.this.f10250G.onClick(view);
                    }
                });
            } else {
                if (TextUtils.isEmpty(str)) {
                    str = this.f9736g.d((w) this.f9735f.f14168o);
                }
                if (TextUtils.isEmpty(str)) {
                    str = this.f9736g.z();
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
                    this.f9742n.add(recycleImageView);
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
        String D8 = this.f9735f.f14168o.D();
        String d2 = this.f9736g.d((w) this.f9735f.f14168o);
        switch (D8.hashCode()) {
            case -559799608:
                if (D8.equals(y.f14179c)) {
                    c9 = 1;
                    break;
                }
                c9 = 65535;
                break;
            case 1507809730:
                if (D8.equals(y.f14177a)) {
                    c9 = 3;
                    break;
                }
                c9 = 65535;
                break;
            case 1507809854:
                if (D8.equals(y.f14178b)) {
                    c9 = 0;
                    break;
                }
                c9 = 65535;
                break;
            case 1622564786:
                if (D8.equals(y.f14180d)) {
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
            this.f10246A = y.f14178b;
            if (!this.f9736g.L() && TextUtils.isEmpty(d2)) {
                str = "myoffer_banner_ad_layout_no_main_res_320x90";
            } else {
                str = "myoffer_banner_ad_layout_320x90";
            }
        } else if (c9 == 1) {
            this.f10246A = y.f14179c;
            str = "myoffer_banner_ad_layout_300x250";
        } else if (c9 != 2) {
            this.f10246A = y.f14177a;
            str = "myoffer_banner_ad_layout_320x50";
        } else {
            this.f10246A = y.f14180d;
            str = "myoffer_banner_ad_layout_728x90";
        }
        w wVar = this.f9736g;
        int i = (!(wVar instanceof bj) ? !(!(wVar instanceof ay) || TextUtils.equals(d2, wVar.B())) : ((bj) wVar).aJ() == 1) ? 2 : 1;
        this.f10248C = i;
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
            if (this.f9735f.f14168o.k() > 0) {
                a9 = this.f9735f.f14168o.k();
            }
            if (this.f9735f.f14168o.l() > 0) {
                a10 = this.f9735f.f14168o.l();
            }
            setLayoutParams(new ViewGroup.LayoutParams(Math.min(a9, getResources().getDisplayMetrics().widthPixels), a10));
            RelativeLayout relativeLayout = (RelativeLayout) findViewById(q.a(getContext(), "myoffer_banner_root", "id"));
            this.f9815b = (CloseImageView) f.i(this, "myoffer_banner_close", "id");
            if (this.f9735f.f14168o.E() == 0) {
                this.f9815b.setVisibility(0);
                if (TextUtils.equals(y.f14180d, this.f10246A)) {
                    ViewGroup.LayoutParams layoutParams = this.f9815b.getLayoutParams();
                    layoutParams.width = q.a(getContext(), 23.0f);
                    layoutParams.height = q.a(getContext(), 23.0f);
                    this.f9815b.setLayoutParams(layoutParams);
                }
                a((b) this.f9815b, false);
            } else {
                com.anythink.basead.ui.f.b.a((View) this.f9815b, true);
            }
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) relativeLayout.getLayoutParams();
            layoutParams2.width = -1;
            layoutParams2.height = -1;
            relativeLayout.setLayoutParams(layoutParams2);
            a(this, d2);
        } else {
            LayoutInflater.from(getContext()).inflate(q.a(getContext(), str, "layout"), this);
            RoundImageView roundImageView = (RoundImageView) findViewById(q.a(getContext(), "myoffer_banner_icon", "id"));
            TextView textView = (TextView) f.i(this, "myoffer_banner_ad_title", "id");
            TextView textView2 = (TextView) f.i(this, "myoffer_banner_desc", "id");
            Button button = (Button) f.i(this, "myoffer_banner_ad_install_btn", "id");
            this.f9745q = button;
            this.f9815b = (CloseImageView) f.i(this, "myoffer_banner_close", "id");
            if (this.f9735f.f14168o.E() == 0) {
                this.f9815b.setVisibility(0);
                a((b) this.f9815b, false);
            } else {
                com.anythink.basead.ui.f.b.a((View) this.f9815b, true);
            }
            if (roundImageView != null) {
                if (!TextUtils.isEmpty(this.f9736g.z())) {
                    ViewGroup.LayoutParams layoutParams3 = roundImageView.getLayoutParams();
                    roundImageView.setVisibility(0);
                    roundImageView.setRadiusInDip(6);
                    roundImageView.setNeedRadiu(true);
                    this.f9742n.add(roundImageView);
                    com.anythink.core.common.res.b.a(getContext()).a(new e(1, this.f9736g.z()), layoutParams3.width, layoutParams3.height, new AnonymousClass3(roundImageView));
                } else {
                    roundImageView.setVisibility(0);
                    com.anythink.basead.ui.f.b.a((View) roundImageView, false);
                }
            }
            if (!TextUtils.isEmpty(this.f9736g.D())) {
                button.setText(this.f9736g.D());
                button.setVisibility(0);
                this.f9742n.add(button);
                this.f9743o = button;
            } else {
                button.setVisibility(8);
            }
            if (!TextUtils.isEmpty(this.f9736g.x())) {
                textView.setText(this.f9736g.x());
                textView.setVisibility(0);
                this.f9742n.add(textView);
            } else {
                textView.setVisibility(8);
            }
            if (textView2 != null) {
                if (!TextUtils.isEmpty(this.f9736g.y())) {
                    textView2.setText(this.f9736g.y());
                    textView2.setVisibility(0);
                    this.f9742n.add(textView2);
                } else {
                    textView2.setVisibility(8);
                }
            }
            a((ViewGroup) f.i(this, "myoffer_main_resouce_container", "id"), (String) null);
        }
        com.anythink.basead.ui.f.a aVar = new com.anythink.basead.ui.f.a(this.f9736g, this.f9735f);
        this.f9817d = aVar;
        aVar.b(this);
    }
}
