package com.anythink.basead.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.anythink.basead.b.e;
import com.anythink.basead.ui.BaseShakeView;
import com.anythink.basead.ui.component.CTAButtonLayout;
import com.anythink.basead.ui.component.RoundFrameLayout;
import com.anythink.basead.ui.f.b;
import com.anythink.basead.ui.f.d;
import com.anythink.core.common.h.w;
import com.anythink.core.common.h.x;
import com.anythink.core.common.h.y;
import com.anythink.core.common.res.b;
import com.anythink.core.common.ui.component.RoundImageView;
import com.anythink.core.common.v.am;
import com.anythink.core.common.v.q;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class PanelView extends RelativeLayout {
    public static final int TYPE_FULL_SCREEN_BANNER = 0;
    public static final int TYPE_FULL_SCREEN_EMPTY_INFO = 8;
    public static final int TYPE_FULL_SCREEN_ENDCARD_HORIZONTAL_LANDSCAPE = 6;
    public static final int TYPE_FULL_SCREEN_ENDCARD_HORIZONTAL_PORTRAIT = 1;
    public static final int TYPE_FULL_SCREEN_ENDCARD_VERTICAL_LANDSCAPE = 2;
    public static final int TYPE_FULL_SCREEN_ENDCARD_VERTICAL_PORTRAIT = 5;
    public static final int TYPE_HALF_SCREEN_EMPTY_INFO = 7;
    public static final int TYPE_HALF_SCREEN_HORIZONTAL = 4;
    public static final int TYPE_HALF_SCREEN_VERTICAL = 3;
    public static final int TYPE_LETTER = 9;

    /* renamed from: a, reason: collision with root package name */
    protected boolean f10319a;

    /* renamed from: b, reason: collision with root package name */
    private View f10320b;

    /* renamed from: c, reason: collision with root package name */
    private ImageView f10321c;

    /* renamed from: d, reason: collision with root package name */
    private ImageView f10322d;

    /* renamed from: e, reason: collision with root package name */
    private TextView f10323e;

    /* renamed from: f, reason: collision with root package name */
    private TextView f10324f;

    /* renamed from: g, reason: collision with root package name */
    private CTAButtonLayout f10325g;

    /* renamed from: h, reason: collision with root package name */
    private BaseShakeView f10326h;
    private a i;

    /* renamed from: j, reason: collision with root package name */
    private int f10327j;

    /* renamed from: k, reason: collision with root package name */
    private y f10328k;

    /* renamed from: l, reason: collision with root package name */
    private x f10329l;

    /* renamed from: m, reason: collision with root package name */
    private w f10330m;

    /* renamed from: n, reason: collision with root package name */
    private int f10331n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f10332o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f10333p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f10334q;

    /* renamed from: r, reason: collision with root package name */
    private List<View> f10335r;

    /* renamed from: s, reason: collision with root package name */
    private d f10336s;

    /* renamed from: t, reason: collision with root package name */
    private View f10337t;

    /* renamed from: u, reason: collision with root package name */
    private final View.OnClickListener f10338u;

    /* renamed from: com.anythink.basead.ui.PanelView$2, reason: invalid class name */
    public class AnonymousClass2 implements com.anythink.basead.ui.d.a {
        public AnonymousClass2() {
        }

        @Override // com.anythink.basead.ui.d.a
        public final void a(int i, int i4) {
            if (PanelView.this.i != null) {
                PanelView.this.i.a(i, i4);
            }
        }
    }

    /* renamed from: com.anythink.basead.ui.PanelView$3, reason: invalid class name */
    public class AnonymousClass3 implements BaseShakeView.a {
        public AnonymousClass3() {
        }

        @Override // com.anythink.basead.ui.BaseShakeView.a
        public final boolean a() {
            if (PanelView.this.i != null) {
                return PanelView.this.i.a();
            }
            return false;
        }
    }

    /* renamed from: com.anythink.basead.ui.PanelView$4, reason: invalid class name */
    public class AnonymousClass4 implements b.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f10342a;

        public AnonymousClass4(String str) {
            this.f10342a = str;
        }

        @Override // com.anythink.core.common.res.b.a
        public final void onFail(String str, String str2) {
        }

        @Override // com.anythink.core.common.res.b.a
        public final void onSuccess(String str, Bitmap bitmap) {
            if (TextUtils.equals(str, this.f10342a)) {
                PanelView.this.f10321c.setImageBitmap(bitmap);
            }
        }
    }

    /* renamed from: com.anythink.basead.ui.PanelView$5, reason: invalid class name */
    public class AnonymousClass5 implements b.a {
        public AnonymousClass5() {
        }

        @Override // com.anythink.basead.ui.f.b.a
        public final void a(int i, int i4) {
            if (PanelView.this.i != null) {
                PanelView.this.i.a(i, i4);
            }
        }
    }

    public interface a {
        void a(int i, int i4);

        boolean a();
    }

    public PanelView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10331n = 0;
        this.f10332o = false;
        this.f10333p = false;
        this.f10334q = false;
        this.f10319a = false;
        this.f10338u = new View.OnClickListener() { // from class: com.anythink.basead.ui.PanelView.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PanelView.this.f10328k != null) {
                    if (PanelView.this.f10328k.J() == 1) {
                        if (view != PanelView.this.f10325g || PanelView.this.i == null) {
                            return;
                        }
                        PanelView.this.i.a(1, 1);
                        return;
                    }
                    if (PanelView.this.i != null) {
                        if (view == PanelView.this.f10325g) {
                            PanelView.this.i.a(1, 1);
                        } else if (PanelView.this.f10326h == null || view != PanelView.this.f10326h) {
                            PanelView.this.i.a(1, 2);
                        } else {
                            PanelView.this.i.a(1, 11);
                        }
                    }
                }
            }
        };
    }

    private void f() {
        if (this.f10321c != null) {
            if (!this.f10330m.c()) {
                this.f10321c.setOnClickListener(this.f10338u);
            }
            this.f10335r.add(this.f10321c);
        }
        if (this.f10323e != null) {
            if (!this.f10330m.c()) {
                this.f10323e.setOnClickListener(this.f10338u);
            }
            this.f10335r.add(this.f10323e);
        }
        if (this.f10324f != null) {
            if (!this.f10330m.c()) {
                this.f10324f.setOnClickListener(this.f10338u);
            }
            this.f10335r.add(this.f10324f);
        }
        if (this.f10325g != null) {
            if (!this.f10330m.c()) {
                this.f10325g.setOnClickListener(this.f10338u);
            }
            this.f10335r.add(this.f10325g);
        }
        if (this.f10322d != null) {
            if (!this.f10330m.c()) {
                this.f10322d.setOnClickListener(this.f10338u);
            }
            this.f10335r.add(this.f10322d);
        }
        if (this.f10326h != null && this.f10334q && !this.f10330m.c()) {
            this.f10326h.setOnClickListener(this.f10338u);
            this.f10326h.setOnShakeListener(new AnonymousClass3(), this.f10328k);
        }
        View findViewById = this.f10320b.findViewById(q.a(getContext(), "myoffer_panel_view_blank", "id"));
        if (findViewById != null) {
            if (!this.f10330m.c()) {
                findViewById.setOnClickListener(this.f10338u);
            }
            this.f10335r.add(findViewById);
        } else {
            if (!this.f10330m.c()) {
                this.f10320b.setOnClickListener(this.f10338u);
            }
            this.f10335r.add(this.f10320b);
        }
    }

    private boolean g() {
        return h() || this.f10337t != null;
    }

    private boolean h() {
        w wVar = this.f10330m;
        return (wVar == null || TextUtils.isEmpty(wVar.z())) ? false : true;
    }

    public View getCTAButton() {
        return this.f10325g;
    }

    public List<View> getClickViews() {
        return this.f10335r;
    }

    public View getDescView() {
        return this.f10324f;
    }

    public View getIconView() {
        ImageView imageView = this.f10321c;
        View view = this.f10337t;
        return view != null ? view : imageView;
    }

    public View getShakeView() {
        return this.f10326h;
    }

    public View getTitleView() {
        return this.f10323e;
    }

    public void init(w wVar, x xVar, int i, boolean z8, a aVar) {
        this.i = aVar;
        this.f10327j = i;
        this.f10330m = wVar;
        this.f10329l = xVar;
        this.f10328k = xVar.f14325o;
        this.f10334q = z8;
        this.f10332o = wVar.T();
        this.f10333p = this.f10328k.y() == 1;
        this.f10335r = new ArrayList();
        this.f10336s = new d(wVar, this.f10328k);
    }

    public void notifyHalfScreenEndCardShow() {
        this.f10319a = true;
        CTAButtonLayout cTAButtonLayout = this.f10325g;
        if (cTAButtonLayout != null) {
            cTAButtonLayout.initSetting(this.f10330m, this.f10329l, true, new b.a() { // from class: com.anythink.basead.ui.PanelView.6
                @Override // com.anythink.basead.ui.f.b.a
                public final void a(int i, int i4) {
                    if (PanelView.this.i != null) {
                        PanelView.this.i.a(i, i4);
                    }
                }
            });
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public void setBaseAdIconView(View view) {
        this.f10337t = view;
    }

    public void setLayoutType(int i) {
        ViewGroup viewGroup;
        int indexOfChild;
        BaseShakeView baseShakeView;
        this.f10331n = i;
        switch (i) {
            case 1:
                if (!g()) {
                    this.f10320b = LayoutInflater.from(getContext()).inflate(q.a(getContext(), "myoffer_panel_view_endcard_portrait_without_icon", "layout"), (ViewGroup) this, true);
                    break;
                } else {
                    this.f10320b = LayoutInflater.from(getContext()).inflate(q.a(getContext(), "myoffer_panel_view_endcard_horizontal_portrait", "layout"), (ViewGroup) this, true);
                    break;
                }
            case 2:
            case 6:
                if (!g()) {
                    this.f10320b = LayoutInflater.from(getContext()).inflate(q.a(getContext(), "myoffer_panel_view_endcard_landscape_without_icon", "layout"), (ViewGroup) this, true);
                    break;
                } else {
                    this.f10320b = LayoutInflater.from(getContext()).inflate(q.a(getContext(), "myoffer_panel_view_endcard_landscape", "layout"), (ViewGroup) this, true);
                    break;
                }
            case 3:
                if (this.f10327j != 1) {
                    if (!g()) {
                        this.f10320b = LayoutInflater.from(getContext()).inflate(q.a(getContext(), "myoffer_panel_view_vertical_without_icon", "layout"), (ViewGroup) this, true);
                        break;
                    } else {
                        this.f10320b = LayoutInflater.from(getContext()).inflate(q.a(getContext(), "myoffer_panel_view_vertical", "layout"), (ViewGroup) this, true);
                        break;
                    }
                } else if (!g()) {
                    this.f10320b = LayoutInflater.from(getContext()).inflate(q.a(getContext(), "myoffer_panel_view_horizontal_without_icon", "layout"), (ViewGroup) this, true);
                    break;
                } else {
                    this.f10320b = LayoutInflater.from(getContext()).inflate(q.a(getContext(), "myoffer_panel_view_horizontal", "layout"), (ViewGroup) this, true);
                    break;
                }
            case 4:
                if (!g()) {
                    this.f10320b = LayoutInflater.from(getContext()).inflate(q.a(getContext(), "myoffer_panel_view_horizontal_without_icon", "layout"), (ViewGroup) this, true);
                    break;
                } else {
                    this.f10320b = LayoutInflater.from(getContext()).inflate(q.a(getContext(), "myoffer_panel_view_horizontal", "layout"), (ViewGroup) this, true);
                    break;
                }
            case 5:
                if (!g()) {
                    this.f10320b = LayoutInflater.from(getContext()).inflate(q.a(getContext(), "myoffer_panel_view_endcard_portrait_without_icon", "layout"), (ViewGroup) this, true);
                    break;
                } else {
                    this.f10320b = LayoutInflater.from(getContext()).inflate(q.a(getContext(), "myoffer_panel_view_endcard_vertical_portrait", "layout"), (ViewGroup) this, true);
                    break;
                }
            case 7:
                this.f10320b = LayoutInflater.from(getContext()).inflate(q.a(getContext(), "myoffer_panel_view_empty_info", "layout"), (ViewGroup) this, true);
                break;
            case 8:
                this.f10320b = LayoutInflater.from(getContext()).inflate(q.a(getContext(), "myoffer_panel_view_full_screen_empty_info", "layout"), (ViewGroup) this, true);
                break;
            case 9:
                this.f10320b = LayoutInflater.from(getContext()).inflate(q.a(getContext(), "myoffer_panel_view_letter", "layout"), (ViewGroup) this, true);
                break;
            default:
                if (!g()) {
                    this.f10320b = LayoutInflater.from(getContext()).inflate(q.a(getContext(), "myoffer_panel_view_bottom_banner_without_icon", "layout"), (ViewGroup) this, true);
                    break;
                } else {
                    this.f10320b = LayoutInflater.from(getContext()).inflate(q.a(getContext(), "myoffer_panel_view_bottom_banner", "layout"), (ViewGroup) this, true);
                    break;
                }
        }
        this.f10319a = (i == 1 || i == 2 || i == 5 || i == 6 || i == 9) && !e.e(this.f10330m, this.f10329l);
        this.f10335r.clear();
        this.f10321c = (ImageView) this.f10320b.findViewById(q.a(getContext(), "myoffer_iv_banner_icon", "id"));
        this.f10323e = (TextView) this.f10320b.findViewById(q.a(getContext(), "myoffer_tv_banner_title", "id"));
        this.f10324f = (TextView) this.f10320b.findViewById(q.a(getContext(), "myoffer_tv_banner_desc", "id"));
        this.f10325g = (CTAButtonLayout) this.f10320b.findViewById(q.a(getContext(), "myoffer_panel_cta_layout", "id"));
        this.f10322d = (ImageView) this.f10320b.findViewById(q.a(getContext(), "myoffer_ad_logo", "id"));
        try {
            BaseShakeView baseShakeView2 = (BaseShakeView) this.f10320b.findViewById(q.a(getContext(), "myoffer_shake_hint_text", "id"));
            this.f10326h = baseShakeView2;
            baseShakeView2.setShakeSetting(this.f10329l.f14325o, this.f10330m.K());
            this.f10326h.startShakeIconAnimation();
        } catch (Throwable unused) {
        }
        if (this.f10334q && (baseShakeView = this.f10326h) != null && this.f10331n != 8) {
            baseShakeView.setVisibility(0);
        }
        w wVar = this.f10330m;
        ImageView imageView = this.f10321c;
        if (imageView != null) {
            View view = this.f10337t;
            if (view == null) {
                String z8 = wVar.z();
                if (!TextUtils.isEmpty(z8)) {
                    ViewGroup.LayoutParams layoutParams = this.f10321c.getLayoutParams();
                    com.anythink.core.common.res.b.a(getContext()).a(new com.anythink.core.common.res.e(1, z8), layoutParams.width, layoutParams.height, new AnonymousClass4(z8));
                }
            } else if (imageView != null && view != null) {
                imageView.setVisibility(0);
                view.setVisibility(0);
                ViewParent parent = imageView.getParent();
                if ((parent instanceof ViewGroup) && (indexOfChild = (viewGroup = (ViewGroup) parent).indexOfChild(imageView)) >= 0) {
                    ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
                    am.a(imageView);
                    am.a(view);
                    RoundFrameLayout roundFrameLayout = new RoundFrameLayout(getContext());
                    int i4 = this.f10331n;
                    if (i4 == 2 || i4 == 6) {
                        roundFrameLayout.setRadius(8);
                    } else {
                        roundFrameLayout.setRadius(12);
                    }
                    roundFrameLayout.addView(view);
                    viewGroup.addView(roundFrameLayout, indexOfChild, layoutParams2);
                    roundFrameLayout.setId(imageView.getId());
                    if (view instanceof ImageView) {
                        this.f10321c = (ImageView) view;
                    }
                }
            }
            if (!g()) {
                this.f10321c.setVisibility(8);
            }
        }
        if (this.f10324f != null) {
            if (TextUtils.isEmpty(wVar.y())) {
                this.f10324f.setVisibility(8);
            } else {
                this.f10324f.setText(wVar.y());
            }
        }
        if (this.f10323e != null) {
            if (TextUtils.isEmpty(wVar.x())) {
                this.f10323e.setVisibility(8);
            } else {
                this.f10323e.setText(wVar.x());
            }
        }
        CTAButtonLayout cTAButtonLayout = this.f10325g;
        if (cTAButtonLayout != null) {
            cTAButtonLayout.initSetting(wVar, this.f10329l, this.f10319a, new AnonymousClass5());
            int i9 = this.f10331n;
            if (i9 == 8 || i9 == 7) {
                this.f10325g.changeMinorButtonStyle();
            }
        }
        new com.anythink.basead.ui.f.a(wVar, this.f10329l).b(this);
        if (this.f10321c != null) {
            if (!this.f10330m.c()) {
                this.f10321c.setOnClickListener(this.f10338u);
            }
            this.f10335r.add(this.f10321c);
        }
        if (this.f10323e != null) {
            if (!this.f10330m.c()) {
                this.f10323e.setOnClickListener(this.f10338u);
            }
            this.f10335r.add(this.f10323e);
        }
        if (this.f10324f != null) {
            if (!this.f10330m.c()) {
                this.f10324f.setOnClickListener(this.f10338u);
            }
            this.f10335r.add(this.f10324f);
        }
        if (this.f10325g != null) {
            if (!this.f10330m.c()) {
                this.f10325g.setOnClickListener(this.f10338u);
            }
            this.f10335r.add(this.f10325g);
        }
        if (this.f10322d != null) {
            if (!this.f10330m.c()) {
                this.f10322d.setOnClickListener(this.f10338u);
            }
            this.f10335r.add(this.f10322d);
        }
        if (this.f10326h != null && this.f10334q && !this.f10330m.c()) {
            this.f10326h.setOnClickListener(this.f10338u);
            this.f10326h.setOnShakeListener(new AnonymousClass3(), this.f10328k);
        }
        View findViewById = this.f10320b.findViewById(q.a(getContext(), "myoffer_panel_view_blank", "id"));
        if (findViewById != null) {
            if (!this.f10330m.c()) {
                findViewById.setOnClickListener(this.f10338u);
            }
            this.f10335r.add(findViewById);
        } else {
            if (!this.f10330m.c()) {
                this.f10320b.setOnClickListener(this.f10338u);
            }
            this.f10335r.add(this.f10320b);
        }
        ImageView imageView2 = this.f10321c;
        if (imageView2 instanceof RoundImageView) {
            ((RoundImageView) imageView2).setNeedRadiu(true);
            int i10 = this.f10331n;
            if (i10 == 2 || i10 == 6) {
                ((RoundImageView) this.f10321c).setRadiusInDip(8);
            } else {
                ((RoundImageView) this.f10321c).setRadiusInDip(12);
            }
            this.f10321c.invalidate();
        }
        d dVar = this.f10336s;
        if (dVar != null) {
            dVar.a(this.f10331n).a(new AnonymousClass2()).a(getContext(), this.f10320b);
        }
    }

    private boolean a() {
        return this.f10332o && !this.f10333p;
    }

    private void b() {
        ViewGroup viewGroup;
        int indexOfChild;
        BaseShakeView baseShakeView;
        this.f10335r.clear();
        this.f10321c = (ImageView) this.f10320b.findViewById(q.a(getContext(), "myoffer_iv_banner_icon", "id"));
        this.f10323e = (TextView) this.f10320b.findViewById(q.a(getContext(), "myoffer_tv_banner_title", "id"));
        this.f10324f = (TextView) this.f10320b.findViewById(q.a(getContext(), "myoffer_tv_banner_desc", "id"));
        this.f10325g = (CTAButtonLayout) this.f10320b.findViewById(q.a(getContext(), "myoffer_panel_cta_layout", "id"));
        this.f10322d = (ImageView) this.f10320b.findViewById(q.a(getContext(), "myoffer_ad_logo", "id"));
        try {
            BaseShakeView baseShakeView2 = (BaseShakeView) this.f10320b.findViewById(q.a(getContext(), "myoffer_shake_hint_text", "id"));
            this.f10326h = baseShakeView2;
            baseShakeView2.setShakeSetting(this.f10329l.f14325o, this.f10330m.K());
            this.f10326h.startShakeIconAnimation();
        } catch (Throwable unused) {
        }
        if (this.f10334q && (baseShakeView = this.f10326h) != null && this.f10331n != 8) {
            baseShakeView.setVisibility(0);
        }
        w wVar = this.f10330m;
        ImageView imageView = this.f10321c;
        if (imageView != null) {
            View view = this.f10337t;
            if (view == null) {
                String z8 = wVar.z();
                if (!TextUtils.isEmpty(z8)) {
                    ViewGroup.LayoutParams layoutParams = this.f10321c.getLayoutParams();
                    com.anythink.core.common.res.b.a(getContext()).a(new com.anythink.core.common.res.e(1, z8), layoutParams.width, layoutParams.height, new AnonymousClass4(z8));
                }
            } else if (imageView != null && view != null) {
                imageView.setVisibility(0);
                view.setVisibility(0);
                ViewParent parent = imageView.getParent();
                if ((parent instanceof ViewGroup) && (indexOfChild = (viewGroup = (ViewGroup) parent).indexOfChild(imageView)) >= 0) {
                    ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
                    am.a(imageView);
                    am.a(view);
                    RoundFrameLayout roundFrameLayout = new RoundFrameLayout(getContext());
                    int i = this.f10331n;
                    if (i == 2 || i == 6) {
                        roundFrameLayout.setRadius(8);
                    } else {
                        roundFrameLayout.setRadius(12);
                    }
                    roundFrameLayout.addView(view);
                    viewGroup.addView(roundFrameLayout, indexOfChild, layoutParams2);
                    roundFrameLayout.setId(imageView.getId());
                    if (view instanceof ImageView) {
                        this.f10321c = (ImageView) view;
                    }
                }
            }
            if (!g()) {
                this.f10321c.setVisibility(8);
            }
        }
        if (this.f10324f != null) {
            if (TextUtils.isEmpty(wVar.y())) {
                this.f10324f.setVisibility(8);
            } else {
                this.f10324f.setText(wVar.y());
            }
        }
        if (this.f10323e != null) {
            if (TextUtils.isEmpty(wVar.x())) {
                this.f10323e.setVisibility(8);
            } else {
                this.f10323e.setText(wVar.x());
            }
        }
        CTAButtonLayout cTAButtonLayout = this.f10325g;
        if (cTAButtonLayout != null) {
            cTAButtonLayout.initSetting(wVar, this.f10329l, this.f10319a, new AnonymousClass5());
            int i4 = this.f10331n;
            if (i4 == 8 || i4 == 7) {
                this.f10325g.changeMinorButtonStyle();
            }
        }
        new com.anythink.basead.ui.f.a(wVar, this.f10329l).b(this);
        if (this.f10321c != null) {
            if (!this.f10330m.c()) {
                this.f10321c.setOnClickListener(this.f10338u);
            }
            this.f10335r.add(this.f10321c);
        }
        if (this.f10323e != null) {
            if (!this.f10330m.c()) {
                this.f10323e.setOnClickListener(this.f10338u);
            }
            this.f10335r.add(this.f10323e);
        }
        if (this.f10324f != null) {
            if (!this.f10330m.c()) {
                this.f10324f.setOnClickListener(this.f10338u);
            }
            this.f10335r.add(this.f10324f);
        }
        if (this.f10325g != null) {
            if (!this.f10330m.c()) {
                this.f10325g.setOnClickListener(this.f10338u);
            }
            this.f10335r.add(this.f10325g);
        }
        if (this.f10322d != null) {
            if (!this.f10330m.c()) {
                this.f10322d.setOnClickListener(this.f10338u);
            }
            this.f10335r.add(this.f10322d);
        }
        if (this.f10326h != null && this.f10334q && !this.f10330m.c()) {
            this.f10326h.setOnClickListener(this.f10338u);
            this.f10326h.setOnShakeListener(new AnonymousClass3(), this.f10328k);
        }
        View findViewById = this.f10320b.findViewById(q.a(getContext(), "myoffer_panel_view_blank", "id"));
        if (findViewById != null) {
            if (!this.f10330m.c()) {
                findViewById.setOnClickListener(this.f10338u);
            }
            this.f10335r.add(findViewById);
        } else {
            if (!this.f10330m.c()) {
                this.f10320b.setOnClickListener(this.f10338u);
            }
            this.f10335r.add(this.f10320b);
        }
        ImageView imageView2 = this.f10321c;
        if (imageView2 instanceof RoundImageView) {
            ((RoundImageView) imageView2).setNeedRadiu(true);
            int i9 = this.f10331n;
            if (i9 == 2 || i9 == 6) {
                ((RoundImageView) this.f10321c).setRadiusInDip(8);
            } else {
                ((RoundImageView) this.f10321c).setRadiusInDip(12);
            }
            this.f10321c.invalidate();
        }
        d dVar = this.f10336s;
        if (dVar != null) {
            dVar.a(this.f10331n).a(new AnonymousClass2()).a(getContext(), this.f10320b);
        }
    }

    private void c() {
        ImageView imageView = this.f10321c;
        if (imageView instanceof RoundImageView) {
            ((RoundImageView) imageView).setNeedRadiu(true);
            int i = this.f10331n;
            if (i == 2 || i == 6) {
                ((RoundImageView) this.f10321c).setRadiusInDip(8);
            } else {
                ((RoundImageView) this.f10321c).setRadiusInDip(12);
            }
            this.f10321c.invalidate();
        }
    }

    private void d() {
        BaseShakeView baseShakeView;
        if (!this.f10334q || (baseShakeView = this.f10326h) == null || this.f10331n == 8) {
            return;
        }
        baseShakeView.setVisibility(0);
    }

    private void e() {
        BaseShakeView baseShakeView;
        this.f10335r.clear();
        this.f10321c = (ImageView) this.f10320b.findViewById(q.a(getContext(), "myoffer_iv_banner_icon", "id"));
        this.f10323e = (TextView) this.f10320b.findViewById(q.a(getContext(), "myoffer_tv_banner_title", "id"));
        this.f10324f = (TextView) this.f10320b.findViewById(q.a(getContext(), "myoffer_tv_banner_desc", "id"));
        this.f10325g = (CTAButtonLayout) this.f10320b.findViewById(q.a(getContext(), "myoffer_panel_cta_layout", "id"));
        this.f10322d = (ImageView) this.f10320b.findViewById(q.a(getContext(), "myoffer_ad_logo", "id"));
        try {
            BaseShakeView baseShakeView2 = (BaseShakeView) this.f10320b.findViewById(q.a(getContext(), "myoffer_shake_hint_text", "id"));
            this.f10326h = baseShakeView2;
            baseShakeView2.setShakeSetting(this.f10329l.f14325o, this.f10330m.K());
            this.f10326h.startShakeIconAnimation();
        } catch (Throwable unused) {
        }
        if (!this.f10334q || (baseShakeView = this.f10326h) == null || this.f10331n == 8) {
            return;
        }
        baseShakeView.setVisibility(0);
    }

    private void a(w wVar) {
        ViewGroup viewGroup;
        int indexOfChild;
        ImageView imageView = this.f10321c;
        if (imageView != null) {
            View view = this.f10337t;
            if (view == null) {
                String z8 = wVar.z();
                if (!TextUtils.isEmpty(z8)) {
                    ViewGroup.LayoutParams layoutParams = this.f10321c.getLayoutParams();
                    com.anythink.core.common.res.b.a(getContext()).a(new com.anythink.core.common.res.e(1, z8), layoutParams.width, layoutParams.height, new AnonymousClass4(z8));
                }
            } else if (imageView != null && view != null) {
                imageView.setVisibility(0);
                view.setVisibility(0);
                ViewParent parent = imageView.getParent();
                if ((parent instanceof ViewGroup) && (indexOfChild = (viewGroup = (ViewGroup) parent).indexOfChild(imageView)) >= 0) {
                    ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
                    am.a(imageView);
                    am.a(view);
                    RoundFrameLayout roundFrameLayout = new RoundFrameLayout(getContext());
                    int i = this.f10331n;
                    if (i != 2 && i != 6) {
                        roundFrameLayout.setRadius(12);
                    } else {
                        roundFrameLayout.setRadius(8);
                    }
                    roundFrameLayout.addView(view);
                    viewGroup.addView(roundFrameLayout, indexOfChild, layoutParams2);
                    roundFrameLayout.setId(imageView.getId());
                    if (view instanceof ImageView) {
                        this.f10321c = (ImageView) view;
                    }
                }
            }
            if (!g()) {
                this.f10321c.setVisibility(8);
            }
        }
        if (this.f10324f != null) {
            if (!TextUtils.isEmpty(wVar.y())) {
                this.f10324f.setText(wVar.y());
            } else {
                this.f10324f.setVisibility(8);
            }
        }
        if (this.f10323e != null) {
            if (!TextUtils.isEmpty(wVar.x())) {
                this.f10323e.setText(wVar.x());
            } else {
                this.f10323e.setVisibility(8);
            }
        }
        CTAButtonLayout cTAButtonLayout = this.f10325g;
        if (cTAButtonLayout != null) {
            cTAButtonLayout.initSetting(wVar, this.f10329l, this.f10319a, new AnonymousClass5());
            int i4 = this.f10331n;
            if (i4 == 8 || i4 == 7) {
                this.f10325g.changeMinorButtonStyle();
            }
        }
        new com.anythink.basead.ui.f.a(wVar, this.f10329l).b(this);
    }

    private void a(ImageView imageView, View view) {
        ViewGroup viewGroup;
        int indexOfChild;
        if (imageView == null || view == null) {
            return;
        }
        imageView.setVisibility(0);
        view.setVisibility(0);
        ViewParent parent = imageView.getParent();
        if (!(parent instanceof ViewGroup) || (indexOfChild = (viewGroup = (ViewGroup) parent).indexOfChild(imageView)) < 0) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        am.a(imageView);
        am.a(view);
        RoundFrameLayout roundFrameLayout = new RoundFrameLayout(getContext());
        int i = this.f10331n;
        if (i != 2 && i != 6) {
            roundFrameLayout.setRadius(12);
        } else {
            roundFrameLayout.setRadius(8);
        }
        roundFrameLayout.addView(view);
        viewGroup.addView(roundFrameLayout, indexOfChild, layoutParams);
        roundFrameLayout.setId(imageView.getId());
        if (view instanceof ImageView) {
            this.f10321c = (ImageView) view;
        }
    }

    private void a(RoundFrameLayout roundFrameLayout) {
        int i = this.f10331n;
        if (i != 2 && i != 6) {
            roundFrameLayout.setRadius(12);
        } else {
            roundFrameLayout.setRadius(8);
        }
    }

    private boolean a(int i) {
        return (i == 1 || i == 2 || i == 5 || i == 6 || i == 9) && !e.e(this.f10330m, this.f10329l);
    }
}
