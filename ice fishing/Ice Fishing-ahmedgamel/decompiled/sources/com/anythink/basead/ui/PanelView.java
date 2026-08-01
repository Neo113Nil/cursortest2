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
    protected boolean f10162a;

    /* renamed from: b, reason: collision with root package name */
    private View f10163b;

    /* renamed from: c, reason: collision with root package name */
    private ImageView f10164c;

    /* renamed from: d, reason: collision with root package name */
    private ImageView f10165d;

    /* renamed from: e, reason: collision with root package name */
    private TextView f10166e;

    /* renamed from: f, reason: collision with root package name */
    private TextView f10167f;

    /* renamed from: g, reason: collision with root package name */
    private CTAButtonLayout f10168g;

    /* renamed from: h, reason: collision with root package name */
    private BaseShakeView f10169h;
    private a i;

    /* renamed from: j, reason: collision with root package name */
    private int f10170j;

    /* renamed from: k, reason: collision with root package name */
    private y f10171k;

    /* renamed from: l, reason: collision with root package name */
    private x f10172l;

    /* renamed from: m, reason: collision with root package name */
    private w f10173m;

    /* renamed from: n, reason: collision with root package name */
    private int f10174n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f10175o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f10176p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f10177q;

    /* renamed from: r, reason: collision with root package name */
    private List<View> f10178r;

    /* renamed from: s, reason: collision with root package name */
    private d f10179s;

    /* renamed from: t, reason: collision with root package name */
    private View f10180t;

    /* renamed from: u, reason: collision with root package name */
    private final View.OnClickListener f10181u;

    /* renamed from: com.anythink.basead.ui.PanelView$2, reason: invalid class name */
    public class AnonymousClass2 implements com.anythink.basead.ui.d.a {
        public AnonymousClass2() {
        }

        @Override // com.anythink.basead.ui.d.a
        public final void a(int i, int i6) {
            if (PanelView.this.i != null) {
                PanelView.this.i.a(i, i6);
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
        final /* synthetic */ String f10185a;

        public AnonymousClass4(String str) {
            this.f10185a = str;
        }

        @Override // com.anythink.core.common.res.b.a
        public final void onFail(String str, String str2) {
        }

        @Override // com.anythink.core.common.res.b.a
        public final void onSuccess(String str, Bitmap bitmap) {
            if (TextUtils.equals(str, this.f10185a)) {
                PanelView.this.f10164c.setImageBitmap(bitmap);
            }
        }
    }

    /* renamed from: com.anythink.basead.ui.PanelView$5, reason: invalid class name */
    public class AnonymousClass5 implements b.a {
        public AnonymousClass5() {
        }

        @Override // com.anythink.basead.ui.f.b.a
        public final void a(int i, int i6) {
            if (PanelView.this.i != null) {
                PanelView.this.i.a(i, i6);
            }
        }
    }

    public interface a {
        void a(int i, int i6);

        boolean a();
    }

    public PanelView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10174n = 0;
        this.f10175o = false;
        this.f10176p = false;
        this.f10177q = false;
        this.f10162a = false;
        this.f10181u = new View.OnClickListener() { // from class: com.anythink.basead.ui.PanelView.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PanelView.this.f10171k != null) {
                    if (PanelView.this.f10171k.J() == 1) {
                        if (view != PanelView.this.f10168g || PanelView.this.i == null) {
                            return;
                        }
                        PanelView.this.i.a(1, 1);
                        return;
                    }
                    if (PanelView.this.i != null) {
                        if (view == PanelView.this.f10168g) {
                            PanelView.this.i.a(1, 1);
                        } else if (PanelView.this.f10169h == null || view != PanelView.this.f10169h) {
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
        if (this.f10164c != null) {
            if (!this.f10173m.c()) {
                this.f10164c.setOnClickListener(this.f10181u);
            }
            this.f10178r.add(this.f10164c);
        }
        if (this.f10166e != null) {
            if (!this.f10173m.c()) {
                this.f10166e.setOnClickListener(this.f10181u);
            }
            this.f10178r.add(this.f10166e);
        }
        if (this.f10167f != null) {
            if (!this.f10173m.c()) {
                this.f10167f.setOnClickListener(this.f10181u);
            }
            this.f10178r.add(this.f10167f);
        }
        if (this.f10168g != null) {
            if (!this.f10173m.c()) {
                this.f10168g.setOnClickListener(this.f10181u);
            }
            this.f10178r.add(this.f10168g);
        }
        if (this.f10165d != null) {
            if (!this.f10173m.c()) {
                this.f10165d.setOnClickListener(this.f10181u);
            }
            this.f10178r.add(this.f10165d);
        }
        if (this.f10169h != null && this.f10177q && !this.f10173m.c()) {
            this.f10169h.setOnClickListener(this.f10181u);
            this.f10169h.setOnShakeListener(new AnonymousClass3(), this.f10171k);
        }
        View findViewById = this.f10163b.findViewById(q.a(getContext(), "myoffer_panel_view_blank", "id"));
        if (findViewById != null) {
            if (!this.f10173m.c()) {
                findViewById.setOnClickListener(this.f10181u);
            }
            this.f10178r.add(findViewById);
        } else {
            if (!this.f10173m.c()) {
                this.f10163b.setOnClickListener(this.f10181u);
            }
            this.f10178r.add(this.f10163b);
        }
    }

    private boolean g() {
        return h() || this.f10180t != null;
    }

    private boolean h() {
        w wVar = this.f10173m;
        return (wVar == null || TextUtils.isEmpty(wVar.z())) ? false : true;
    }

    public View getCTAButton() {
        return this.f10168g;
    }

    public List<View> getClickViews() {
        return this.f10178r;
    }

    public View getDescView() {
        return this.f10167f;
    }

    public View getIconView() {
        ImageView imageView = this.f10164c;
        View view = this.f10180t;
        return view != null ? view : imageView;
    }

    public View getShakeView() {
        return this.f10169h;
    }

    public View getTitleView() {
        return this.f10166e;
    }

    public void init(w wVar, x xVar, int i, boolean z3, a aVar) {
        this.i = aVar;
        this.f10170j = i;
        this.f10173m = wVar;
        this.f10172l = xVar;
        this.f10171k = xVar.f14168o;
        this.f10177q = z3;
        this.f10175o = wVar.T();
        this.f10176p = this.f10171k.y() == 1;
        this.f10178r = new ArrayList();
        this.f10179s = new d(wVar, this.f10171k);
    }

    public void notifyHalfScreenEndCardShow() {
        this.f10162a = true;
        CTAButtonLayout cTAButtonLayout = this.f10168g;
        if (cTAButtonLayout != null) {
            cTAButtonLayout.initSetting(this.f10173m, this.f10172l, true, new b.a() { // from class: com.anythink.basead.ui.PanelView.6
                @Override // com.anythink.basead.ui.f.b.a
                public final void a(int i, int i6) {
                    if (PanelView.this.i != null) {
                        PanelView.this.i.a(i, i6);
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
        this.f10180t = view;
    }

    public void setLayoutType(int i) {
        ViewGroup viewGroup;
        int indexOfChild;
        BaseShakeView baseShakeView;
        this.f10174n = i;
        switch (i) {
            case 1:
                if (!g()) {
                    this.f10163b = LayoutInflater.from(getContext()).inflate(q.a(getContext(), "myoffer_panel_view_endcard_portrait_without_icon", "layout"), (ViewGroup) this, true);
                    break;
                } else {
                    this.f10163b = LayoutInflater.from(getContext()).inflate(q.a(getContext(), "myoffer_panel_view_endcard_horizontal_portrait", "layout"), (ViewGroup) this, true);
                    break;
                }
            case 2:
            case 6:
                if (!g()) {
                    this.f10163b = LayoutInflater.from(getContext()).inflate(q.a(getContext(), "myoffer_panel_view_endcard_landscape_without_icon", "layout"), (ViewGroup) this, true);
                    break;
                } else {
                    this.f10163b = LayoutInflater.from(getContext()).inflate(q.a(getContext(), "myoffer_panel_view_endcard_landscape", "layout"), (ViewGroup) this, true);
                    break;
                }
            case 3:
                if (this.f10170j != 1) {
                    if (!g()) {
                        this.f10163b = LayoutInflater.from(getContext()).inflate(q.a(getContext(), "myoffer_panel_view_vertical_without_icon", "layout"), (ViewGroup) this, true);
                        break;
                    } else {
                        this.f10163b = LayoutInflater.from(getContext()).inflate(q.a(getContext(), "myoffer_panel_view_vertical", "layout"), (ViewGroup) this, true);
                        break;
                    }
                } else if (!g()) {
                    this.f10163b = LayoutInflater.from(getContext()).inflate(q.a(getContext(), "myoffer_panel_view_horizontal_without_icon", "layout"), (ViewGroup) this, true);
                    break;
                } else {
                    this.f10163b = LayoutInflater.from(getContext()).inflate(q.a(getContext(), "myoffer_panel_view_horizontal", "layout"), (ViewGroup) this, true);
                    break;
                }
            case 4:
                if (!g()) {
                    this.f10163b = LayoutInflater.from(getContext()).inflate(q.a(getContext(), "myoffer_panel_view_horizontal_without_icon", "layout"), (ViewGroup) this, true);
                    break;
                } else {
                    this.f10163b = LayoutInflater.from(getContext()).inflate(q.a(getContext(), "myoffer_panel_view_horizontal", "layout"), (ViewGroup) this, true);
                    break;
                }
            case 5:
                if (!g()) {
                    this.f10163b = LayoutInflater.from(getContext()).inflate(q.a(getContext(), "myoffer_panel_view_endcard_portrait_without_icon", "layout"), (ViewGroup) this, true);
                    break;
                } else {
                    this.f10163b = LayoutInflater.from(getContext()).inflate(q.a(getContext(), "myoffer_panel_view_endcard_vertical_portrait", "layout"), (ViewGroup) this, true);
                    break;
                }
            case 7:
                this.f10163b = LayoutInflater.from(getContext()).inflate(q.a(getContext(), "myoffer_panel_view_empty_info", "layout"), (ViewGroup) this, true);
                break;
            case 8:
                this.f10163b = LayoutInflater.from(getContext()).inflate(q.a(getContext(), "myoffer_panel_view_full_screen_empty_info", "layout"), (ViewGroup) this, true);
                break;
            case 9:
                this.f10163b = LayoutInflater.from(getContext()).inflate(q.a(getContext(), "myoffer_panel_view_letter", "layout"), (ViewGroup) this, true);
                break;
            default:
                if (!g()) {
                    this.f10163b = LayoutInflater.from(getContext()).inflate(q.a(getContext(), "myoffer_panel_view_bottom_banner_without_icon", "layout"), (ViewGroup) this, true);
                    break;
                } else {
                    this.f10163b = LayoutInflater.from(getContext()).inflate(q.a(getContext(), "myoffer_panel_view_bottom_banner", "layout"), (ViewGroup) this, true);
                    break;
                }
        }
        this.f10162a = (i == 1 || i == 2 || i == 5 || i == 6 || i == 9) && !e.e(this.f10173m, this.f10172l);
        this.f10178r.clear();
        this.f10164c = (ImageView) this.f10163b.findViewById(q.a(getContext(), "myoffer_iv_banner_icon", "id"));
        this.f10166e = (TextView) this.f10163b.findViewById(q.a(getContext(), "myoffer_tv_banner_title", "id"));
        this.f10167f = (TextView) this.f10163b.findViewById(q.a(getContext(), "myoffer_tv_banner_desc", "id"));
        this.f10168g = (CTAButtonLayout) this.f10163b.findViewById(q.a(getContext(), "myoffer_panel_cta_layout", "id"));
        this.f10165d = (ImageView) this.f10163b.findViewById(q.a(getContext(), "myoffer_ad_logo", "id"));
        try {
            BaseShakeView baseShakeView2 = (BaseShakeView) this.f10163b.findViewById(q.a(getContext(), "myoffer_shake_hint_text", "id"));
            this.f10169h = baseShakeView2;
            baseShakeView2.setShakeSetting(this.f10172l.f14168o, this.f10173m.K());
            this.f10169h.startShakeIconAnimation();
        } catch (Throwable unused) {
        }
        if (this.f10177q && (baseShakeView = this.f10169h) != null && this.f10174n != 8) {
            baseShakeView.setVisibility(0);
        }
        w wVar = this.f10173m;
        ImageView imageView = this.f10164c;
        if (imageView != null) {
            View view = this.f10180t;
            if (view == null) {
                String z3 = wVar.z();
                if (!TextUtils.isEmpty(z3)) {
                    ViewGroup.LayoutParams layoutParams = this.f10164c.getLayoutParams();
                    com.anythink.core.common.res.b.a(getContext()).a(new com.anythink.core.common.res.e(1, z3), layoutParams.width, layoutParams.height, new AnonymousClass4(z3));
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
                    int i6 = this.f10174n;
                    if (i6 == 2 || i6 == 6) {
                        roundFrameLayout.setRadius(8);
                    } else {
                        roundFrameLayout.setRadius(12);
                    }
                    roundFrameLayout.addView(view);
                    viewGroup.addView(roundFrameLayout, indexOfChild, layoutParams2);
                    roundFrameLayout.setId(imageView.getId());
                    if (view instanceof ImageView) {
                        this.f10164c = (ImageView) view;
                    }
                }
            }
            if (!g()) {
                this.f10164c.setVisibility(8);
            }
        }
        if (this.f10167f != null) {
            if (TextUtils.isEmpty(wVar.y())) {
                this.f10167f.setVisibility(8);
            } else {
                this.f10167f.setText(wVar.y());
            }
        }
        if (this.f10166e != null) {
            if (TextUtils.isEmpty(wVar.x())) {
                this.f10166e.setVisibility(8);
            } else {
                this.f10166e.setText(wVar.x());
            }
        }
        CTAButtonLayout cTAButtonLayout = this.f10168g;
        if (cTAButtonLayout != null) {
            cTAButtonLayout.initSetting(wVar, this.f10172l, this.f10162a, new AnonymousClass5());
            int i9 = this.f10174n;
            if (i9 == 8 || i9 == 7) {
                this.f10168g.changeMinorButtonStyle();
            }
        }
        new com.anythink.basead.ui.f.a(wVar, this.f10172l).b(this);
        if (this.f10164c != null) {
            if (!this.f10173m.c()) {
                this.f10164c.setOnClickListener(this.f10181u);
            }
            this.f10178r.add(this.f10164c);
        }
        if (this.f10166e != null) {
            if (!this.f10173m.c()) {
                this.f10166e.setOnClickListener(this.f10181u);
            }
            this.f10178r.add(this.f10166e);
        }
        if (this.f10167f != null) {
            if (!this.f10173m.c()) {
                this.f10167f.setOnClickListener(this.f10181u);
            }
            this.f10178r.add(this.f10167f);
        }
        if (this.f10168g != null) {
            if (!this.f10173m.c()) {
                this.f10168g.setOnClickListener(this.f10181u);
            }
            this.f10178r.add(this.f10168g);
        }
        if (this.f10165d != null) {
            if (!this.f10173m.c()) {
                this.f10165d.setOnClickListener(this.f10181u);
            }
            this.f10178r.add(this.f10165d);
        }
        if (this.f10169h != null && this.f10177q && !this.f10173m.c()) {
            this.f10169h.setOnClickListener(this.f10181u);
            this.f10169h.setOnShakeListener(new AnonymousClass3(), this.f10171k);
        }
        View findViewById = this.f10163b.findViewById(q.a(getContext(), "myoffer_panel_view_blank", "id"));
        if (findViewById != null) {
            if (!this.f10173m.c()) {
                findViewById.setOnClickListener(this.f10181u);
            }
            this.f10178r.add(findViewById);
        } else {
            if (!this.f10173m.c()) {
                this.f10163b.setOnClickListener(this.f10181u);
            }
            this.f10178r.add(this.f10163b);
        }
        ImageView imageView2 = this.f10164c;
        if (imageView2 instanceof RoundImageView) {
            ((RoundImageView) imageView2).setNeedRadiu(true);
            int i10 = this.f10174n;
            if (i10 == 2 || i10 == 6) {
                ((RoundImageView) this.f10164c).setRadiusInDip(8);
            } else {
                ((RoundImageView) this.f10164c).setRadiusInDip(12);
            }
            this.f10164c.invalidate();
        }
        d dVar = this.f10179s;
        if (dVar != null) {
            dVar.a(this.f10174n).a(new AnonymousClass2()).a(getContext(), this.f10163b);
        }
    }

    private boolean a() {
        return this.f10175o && !this.f10176p;
    }

    private void b() {
        ViewGroup viewGroup;
        int indexOfChild;
        BaseShakeView baseShakeView;
        this.f10178r.clear();
        this.f10164c = (ImageView) this.f10163b.findViewById(q.a(getContext(), "myoffer_iv_banner_icon", "id"));
        this.f10166e = (TextView) this.f10163b.findViewById(q.a(getContext(), "myoffer_tv_banner_title", "id"));
        this.f10167f = (TextView) this.f10163b.findViewById(q.a(getContext(), "myoffer_tv_banner_desc", "id"));
        this.f10168g = (CTAButtonLayout) this.f10163b.findViewById(q.a(getContext(), "myoffer_panel_cta_layout", "id"));
        this.f10165d = (ImageView) this.f10163b.findViewById(q.a(getContext(), "myoffer_ad_logo", "id"));
        try {
            BaseShakeView baseShakeView2 = (BaseShakeView) this.f10163b.findViewById(q.a(getContext(), "myoffer_shake_hint_text", "id"));
            this.f10169h = baseShakeView2;
            baseShakeView2.setShakeSetting(this.f10172l.f14168o, this.f10173m.K());
            this.f10169h.startShakeIconAnimation();
        } catch (Throwable unused) {
        }
        if (this.f10177q && (baseShakeView = this.f10169h) != null && this.f10174n != 8) {
            baseShakeView.setVisibility(0);
        }
        w wVar = this.f10173m;
        ImageView imageView = this.f10164c;
        if (imageView != null) {
            View view = this.f10180t;
            if (view == null) {
                String z3 = wVar.z();
                if (!TextUtils.isEmpty(z3)) {
                    ViewGroup.LayoutParams layoutParams = this.f10164c.getLayoutParams();
                    com.anythink.core.common.res.b.a(getContext()).a(new com.anythink.core.common.res.e(1, z3), layoutParams.width, layoutParams.height, new AnonymousClass4(z3));
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
                    int i = this.f10174n;
                    if (i == 2 || i == 6) {
                        roundFrameLayout.setRadius(8);
                    } else {
                        roundFrameLayout.setRadius(12);
                    }
                    roundFrameLayout.addView(view);
                    viewGroup.addView(roundFrameLayout, indexOfChild, layoutParams2);
                    roundFrameLayout.setId(imageView.getId());
                    if (view instanceof ImageView) {
                        this.f10164c = (ImageView) view;
                    }
                }
            }
            if (!g()) {
                this.f10164c.setVisibility(8);
            }
        }
        if (this.f10167f != null) {
            if (TextUtils.isEmpty(wVar.y())) {
                this.f10167f.setVisibility(8);
            } else {
                this.f10167f.setText(wVar.y());
            }
        }
        if (this.f10166e != null) {
            if (TextUtils.isEmpty(wVar.x())) {
                this.f10166e.setVisibility(8);
            } else {
                this.f10166e.setText(wVar.x());
            }
        }
        CTAButtonLayout cTAButtonLayout = this.f10168g;
        if (cTAButtonLayout != null) {
            cTAButtonLayout.initSetting(wVar, this.f10172l, this.f10162a, new AnonymousClass5());
            int i6 = this.f10174n;
            if (i6 == 8 || i6 == 7) {
                this.f10168g.changeMinorButtonStyle();
            }
        }
        new com.anythink.basead.ui.f.a(wVar, this.f10172l).b(this);
        if (this.f10164c != null) {
            if (!this.f10173m.c()) {
                this.f10164c.setOnClickListener(this.f10181u);
            }
            this.f10178r.add(this.f10164c);
        }
        if (this.f10166e != null) {
            if (!this.f10173m.c()) {
                this.f10166e.setOnClickListener(this.f10181u);
            }
            this.f10178r.add(this.f10166e);
        }
        if (this.f10167f != null) {
            if (!this.f10173m.c()) {
                this.f10167f.setOnClickListener(this.f10181u);
            }
            this.f10178r.add(this.f10167f);
        }
        if (this.f10168g != null) {
            if (!this.f10173m.c()) {
                this.f10168g.setOnClickListener(this.f10181u);
            }
            this.f10178r.add(this.f10168g);
        }
        if (this.f10165d != null) {
            if (!this.f10173m.c()) {
                this.f10165d.setOnClickListener(this.f10181u);
            }
            this.f10178r.add(this.f10165d);
        }
        if (this.f10169h != null && this.f10177q && !this.f10173m.c()) {
            this.f10169h.setOnClickListener(this.f10181u);
            this.f10169h.setOnShakeListener(new AnonymousClass3(), this.f10171k);
        }
        View findViewById = this.f10163b.findViewById(q.a(getContext(), "myoffer_panel_view_blank", "id"));
        if (findViewById != null) {
            if (!this.f10173m.c()) {
                findViewById.setOnClickListener(this.f10181u);
            }
            this.f10178r.add(findViewById);
        } else {
            if (!this.f10173m.c()) {
                this.f10163b.setOnClickListener(this.f10181u);
            }
            this.f10178r.add(this.f10163b);
        }
        ImageView imageView2 = this.f10164c;
        if (imageView2 instanceof RoundImageView) {
            ((RoundImageView) imageView2).setNeedRadiu(true);
            int i9 = this.f10174n;
            if (i9 == 2 || i9 == 6) {
                ((RoundImageView) this.f10164c).setRadiusInDip(8);
            } else {
                ((RoundImageView) this.f10164c).setRadiusInDip(12);
            }
            this.f10164c.invalidate();
        }
        d dVar = this.f10179s;
        if (dVar != null) {
            dVar.a(this.f10174n).a(new AnonymousClass2()).a(getContext(), this.f10163b);
        }
    }

    private void c() {
        ImageView imageView = this.f10164c;
        if (imageView instanceof RoundImageView) {
            ((RoundImageView) imageView).setNeedRadiu(true);
            int i = this.f10174n;
            if (i == 2 || i == 6) {
                ((RoundImageView) this.f10164c).setRadiusInDip(8);
            } else {
                ((RoundImageView) this.f10164c).setRadiusInDip(12);
            }
            this.f10164c.invalidate();
        }
    }

    private void d() {
        BaseShakeView baseShakeView;
        if (!this.f10177q || (baseShakeView = this.f10169h) == null || this.f10174n == 8) {
            return;
        }
        baseShakeView.setVisibility(0);
    }

    private void e() {
        BaseShakeView baseShakeView;
        this.f10178r.clear();
        this.f10164c = (ImageView) this.f10163b.findViewById(q.a(getContext(), "myoffer_iv_banner_icon", "id"));
        this.f10166e = (TextView) this.f10163b.findViewById(q.a(getContext(), "myoffer_tv_banner_title", "id"));
        this.f10167f = (TextView) this.f10163b.findViewById(q.a(getContext(), "myoffer_tv_banner_desc", "id"));
        this.f10168g = (CTAButtonLayout) this.f10163b.findViewById(q.a(getContext(), "myoffer_panel_cta_layout", "id"));
        this.f10165d = (ImageView) this.f10163b.findViewById(q.a(getContext(), "myoffer_ad_logo", "id"));
        try {
            BaseShakeView baseShakeView2 = (BaseShakeView) this.f10163b.findViewById(q.a(getContext(), "myoffer_shake_hint_text", "id"));
            this.f10169h = baseShakeView2;
            baseShakeView2.setShakeSetting(this.f10172l.f14168o, this.f10173m.K());
            this.f10169h.startShakeIconAnimation();
        } catch (Throwable unused) {
        }
        if (!this.f10177q || (baseShakeView = this.f10169h) == null || this.f10174n == 8) {
            return;
        }
        baseShakeView.setVisibility(0);
    }

    private void a(w wVar) {
        ViewGroup viewGroup;
        int indexOfChild;
        ImageView imageView = this.f10164c;
        if (imageView != null) {
            View view = this.f10180t;
            if (view == null) {
                String z3 = wVar.z();
                if (!TextUtils.isEmpty(z3)) {
                    ViewGroup.LayoutParams layoutParams = this.f10164c.getLayoutParams();
                    com.anythink.core.common.res.b.a(getContext()).a(new com.anythink.core.common.res.e(1, z3), layoutParams.width, layoutParams.height, new AnonymousClass4(z3));
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
                    int i = this.f10174n;
                    if (i != 2 && i != 6) {
                        roundFrameLayout.setRadius(12);
                    } else {
                        roundFrameLayout.setRadius(8);
                    }
                    roundFrameLayout.addView(view);
                    viewGroup.addView(roundFrameLayout, indexOfChild, layoutParams2);
                    roundFrameLayout.setId(imageView.getId());
                    if (view instanceof ImageView) {
                        this.f10164c = (ImageView) view;
                    }
                }
            }
            if (!g()) {
                this.f10164c.setVisibility(8);
            }
        }
        if (this.f10167f != null) {
            if (!TextUtils.isEmpty(wVar.y())) {
                this.f10167f.setText(wVar.y());
            } else {
                this.f10167f.setVisibility(8);
            }
        }
        if (this.f10166e != null) {
            if (!TextUtils.isEmpty(wVar.x())) {
                this.f10166e.setText(wVar.x());
            } else {
                this.f10166e.setVisibility(8);
            }
        }
        CTAButtonLayout cTAButtonLayout = this.f10168g;
        if (cTAButtonLayout != null) {
            cTAButtonLayout.initSetting(wVar, this.f10172l, this.f10162a, new AnonymousClass5());
            int i6 = this.f10174n;
            if (i6 == 8 || i6 == 7) {
                this.f10168g.changeMinorButtonStyle();
            }
        }
        new com.anythink.basead.ui.f.a(wVar, this.f10172l).b(this);
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
        int i = this.f10174n;
        if (i != 2 && i != 6) {
            roundFrameLayout.setRadius(12);
        } else {
            roundFrameLayout.setRadius(8);
        }
        roundFrameLayout.addView(view);
        viewGroup.addView(roundFrameLayout, indexOfChild, layoutParams);
        roundFrameLayout.setId(imageView.getId());
        if (view instanceof ImageView) {
            this.f10164c = (ImageView) view;
        }
    }

    private void a(RoundFrameLayout roundFrameLayout) {
        int i = this.f10174n;
        if (i != 2 && i != 6) {
            roundFrameLayout.setRadius(12);
        } else {
            roundFrameLayout.setRadius(8);
        }
    }

    private boolean a(int i) {
        return (i == 1 || i == 2 || i == 5 || i == 6 || i == 9) && !e.e(this.f10173m, this.f10172l);
    }
}
