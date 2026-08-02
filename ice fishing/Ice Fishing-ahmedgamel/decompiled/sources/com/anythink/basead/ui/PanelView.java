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
    protected boolean f10948a;

    /* renamed from: b, reason: collision with root package name */
    private View f10949b;

    /* renamed from: c, reason: collision with root package name */
    private ImageView f10950c;

    /* renamed from: d, reason: collision with root package name */
    private ImageView f10951d;

    /* renamed from: e, reason: collision with root package name */
    private TextView f10952e;

    /* renamed from: f, reason: collision with root package name */
    private TextView f10953f;

    /* renamed from: g, reason: collision with root package name */
    private CTAButtonLayout f10954g;

    /* renamed from: h, reason: collision with root package name */
    private BaseShakeView f10955h;
    private a i;

    /* renamed from: j, reason: collision with root package name */
    private int f10956j;

    /* renamed from: k, reason: collision with root package name */
    private y f10957k;

    /* renamed from: l, reason: collision with root package name */
    private x f10958l;

    /* renamed from: m, reason: collision with root package name */
    private w f10959m;

    /* renamed from: n, reason: collision with root package name */
    private int f10960n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f10961o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f10962p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f10963q;

    /* renamed from: r, reason: collision with root package name */
    private List<View> f10964r;

    /* renamed from: s, reason: collision with root package name */
    private d f10965s;

    /* renamed from: t, reason: collision with root package name */
    private View f10966t;

    /* renamed from: u, reason: collision with root package name */
    private final View.OnClickListener f10967u;

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
        final /* synthetic */ String f10971a;

        public AnonymousClass4(String str) {
            this.f10971a = str;
        }

        @Override // com.anythink.core.common.res.b.a
        public final void onFail(String str, String str2) {
        }

        @Override // com.anythink.core.common.res.b.a
        public final void onSuccess(String str, Bitmap bitmap) {
            if (TextUtils.equals(str, this.f10971a)) {
                PanelView.this.f10950c.setImageBitmap(bitmap);
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
        this.f10960n = 0;
        this.f10961o = false;
        this.f10962p = false;
        this.f10963q = false;
        this.f10948a = false;
        this.f10967u = new View.OnClickListener() { // from class: com.anythink.basead.ui.PanelView.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PanelView.this.f10957k != null) {
                    if (PanelView.this.f10957k.J() == 1) {
                        if (view != PanelView.this.f10954g || PanelView.this.i == null) {
                            return;
                        }
                        PanelView.this.i.a(1, 1);
                        return;
                    }
                    if (PanelView.this.i != null) {
                        if (view == PanelView.this.f10954g) {
                            PanelView.this.i.a(1, 1);
                        } else if (PanelView.this.f10955h == null || view != PanelView.this.f10955h) {
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
        if (this.f10950c != null) {
            if (!this.f10959m.c()) {
                this.f10950c.setOnClickListener(this.f10967u);
            }
            this.f10964r.add(this.f10950c);
        }
        if (this.f10952e != null) {
            if (!this.f10959m.c()) {
                this.f10952e.setOnClickListener(this.f10967u);
            }
            this.f10964r.add(this.f10952e);
        }
        if (this.f10953f != null) {
            if (!this.f10959m.c()) {
                this.f10953f.setOnClickListener(this.f10967u);
            }
            this.f10964r.add(this.f10953f);
        }
        if (this.f10954g != null) {
            if (!this.f10959m.c()) {
                this.f10954g.setOnClickListener(this.f10967u);
            }
            this.f10964r.add(this.f10954g);
        }
        if (this.f10951d != null) {
            if (!this.f10959m.c()) {
                this.f10951d.setOnClickListener(this.f10967u);
            }
            this.f10964r.add(this.f10951d);
        }
        if (this.f10955h != null && this.f10963q && !this.f10959m.c()) {
            this.f10955h.setOnClickListener(this.f10967u);
            this.f10955h.setOnShakeListener(new AnonymousClass3(), this.f10957k);
        }
        View findViewById = this.f10949b.findViewById(q.a(getContext(), "myoffer_panel_view_blank", "id"));
        if (findViewById != null) {
            if (!this.f10959m.c()) {
                findViewById.setOnClickListener(this.f10967u);
            }
            this.f10964r.add(findViewById);
        } else {
            if (!this.f10959m.c()) {
                this.f10949b.setOnClickListener(this.f10967u);
            }
            this.f10964r.add(this.f10949b);
        }
    }

    private boolean g() {
        return h() || this.f10966t != null;
    }

    private boolean h() {
        w wVar = this.f10959m;
        return (wVar == null || TextUtils.isEmpty(wVar.z())) ? false : true;
    }

    public View getCTAButton() {
        return this.f10954g;
    }

    public List<View> getClickViews() {
        return this.f10964r;
    }

    public View getDescView() {
        return this.f10953f;
    }

    public View getIconView() {
        ImageView imageView = this.f10950c;
        View view = this.f10966t;
        return view != null ? view : imageView;
    }

    public View getShakeView() {
        return this.f10955h;
    }

    public View getTitleView() {
        return this.f10952e;
    }

    public void init(w wVar, x xVar, int i, boolean z6, a aVar) {
        this.i = aVar;
        this.f10956j = i;
        this.f10959m = wVar;
        this.f10958l = xVar;
        this.f10957k = xVar.f14954o;
        this.f10963q = z6;
        this.f10961o = wVar.T();
        this.f10962p = this.f10957k.y() == 1;
        this.f10964r = new ArrayList();
        this.f10965s = new d(wVar, this.f10957k);
    }

    public void notifyHalfScreenEndCardShow() {
        this.f10948a = true;
        CTAButtonLayout cTAButtonLayout = this.f10954g;
        if (cTAButtonLayout != null) {
            cTAButtonLayout.initSetting(this.f10959m, this.f10958l, true, new b.a() { // from class: com.anythink.basead.ui.PanelView.6
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
        this.f10966t = view;
    }

    public void setLayoutType(int i) {
        ViewGroup viewGroup;
        int indexOfChild;
        BaseShakeView baseShakeView;
        this.f10960n = i;
        switch (i) {
            case 1:
                if (!g()) {
                    this.f10949b = LayoutInflater.from(getContext()).inflate(q.a(getContext(), "myoffer_panel_view_endcard_portrait_without_icon", "layout"), (ViewGroup) this, true);
                    break;
                } else {
                    this.f10949b = LayoutInflater.from(getContext()).inflate(q.a(getContext(), "myoffer_panel_view_endcard_horizontal_portrait", "layout"), (ViewGroup) this, true);
                    break;
                }
            case 2:
            case 6:
                if (!g()) {
                    this.f10949b = LayoutInflater.from(getContext()).inflate(q.a(getContext(), "myoffer_panel_view_endcard_landscape_without_icon", "layout"), (ViewGroup) this, true);
                    break;
                } else {
                    this.f10949b = LayoutInflater.from(getContext()).inflate(q.a(getContext(), "myoffer_panel_view_endcard_landscape", "layout"), (ViewGroup) this, true);
                    break;
                }
            case 3:
                if (this.f10956j != 1) {
                    if (!g()) {
                        this.f10949b = LayoutInflater.from(getContext()).inflate(q.a(getContext(), "myoffer_panel_view_vertical_without_icon", "layout"), (ViewGroup) this, true);
                        break;
                    } else {
                        this.f10949b = LayoutInflater.from(getContext()).inflate(q.a(getContext(), "myoffer_panel_view_vertical", "layout"), (ViewGroup) this, true);
                        break;
                    }
                } else if (!g()) {
                    this.f10949b = LayoutInflater.from(getContext()).inflate(q.a(getContext(), "myoffer_panel_view_horizontal_without_icon", "layout"), (ViewGroup) this, true);
                    break;
                } else {
                    this.f10949b = LayoutInflater.from(getContext()).inflate(q.a(getContext(), "myoffer_panel_view_horizontal", "layout"), (ViewGroup) this, true);
                    break;
                }
            case 4:
                if (!g()) {
                    this.f10949b = LayoutInflater.from(getContext()).inflate(q.a(getContext(), "myoffer_panel_view_horizontal_without_icon", "layout"), (ViewGroup) this, true);
                    break;
                } else {
                    this.f10949b = LayoutInflater.from(getContext()).inflate(q.a(getContext(), "myoffer_panel_view_horizontal", "layout"), (ViewGroup) this, true);
                    break;
                }
            case 5:
                if (!g()) {
                    this.f10949b = LayoutInflater.from(getContext()).inflate(q.a(getContext(), "myoffer_panel_view_endcard_portrait_without_icon", "layout"), (ViewGroup) this, true);
                    break;
                } else {
                    this.f10949b = LayoutInflater.from(getContext()).inflate(q.a(getContext(), "myoffer_panel_view_endcard_vertical_portrait", "layout"), (ViewGroup) this, true);
                    break;
                }
            case 7:
                this.f10949b = LayoutInflater.from(getContext()).inflate(q.a(getContext(), "myoffer_panel_view_empty_info", "layout"), (ViewGroup) this, true);
                break;
            case 8:
                this.f10949b = LayoutInflater.from(getContext()).inflate(q.a(getContext(), "myoffer_panel_view_full_screen_empty_info", "layout"), (ViewGroup) this, true);
                break;
            case 9:
                this.f10949b = LayoutInflater.from(getContext()).inflate(q.a(getContext(), "myoffer_panel_view_letter", "layout"), (ViewGroup) this, true);
                break;
            default:
                if (!g()) {
                    this.f10949b = LayoutInflater.from(getContext()).inflate(q.a(getContext(), "myoffer_panel_view_bottom_banner_without_icon", "layout"), (ViewGroup) this, true);
                    break;
                } else {
                    this.f10949b = LayoutInflater.from(getContext()).inflate(q.a(getContext(), "myoffer_panel_view_bottom_banner", "layout"), (ViewGroup) this, true);
                    break;
                }
        }
        this.f10948a = (i == 1 || i == 2 || i == 5 || i == 6 || i == 9) && !e.e(this.f10959m, this.f10958l);
        this.f10964r.clear();
        this.f10950c = (ImageView) this.f10949b.findViewById(q.a(getContext(), "myoffer_iv_banner_icon", "id"));
        this.f10952e = (TextView) this.f10949b.findViewById(q.a(getContext(), "myoffer_tv_banner_title", "id"));
        this.f10953f = (TextView) this.f10949b.findViewById(q.a(getContext(), "myoffer_tv_banner_desc", "id"));
        this.f10954g = (CTAButtonLayout) this.f10949b.findViewById(q.a(getContext(), "myoffer_panel_cta_layout", "id"));
        this.f10951d = (ImageView) this.f10949b.findViewById(q.a(getContext(), "myoffer_ad_logo", "id"));
        try {
            BaseShakeView baseShakeView2 = (BaseShakeView) this.f10949b.findViewById(q.a(getContext(), "myoffer_shake_hint_text", "id"));
            this.f10955h = baseShakeView2;
            baseShakeView2.setShakeSetting(this.f10958l.f14954o, this.f10959m.K());
            this.f10955h.startShakeIconAnimation();
        } catch (Throwable unused) {
        }
        if (this.f10963q && (baseShakeView = this.f10955h) != null && this.f10960n != 8) {
            baseShakeView.setVisibility(0);
        }
        w wVar = this.f10959m;
        ImageView imageView = this.f10950c;
        if (imageView != null) {
            View view = this.f10966t;
            if (view == null) {
                String z6 = wVar.z();
                if (!TextUtils.isEmpty(z6)) {
                    ViewGroup.LayoutParams layoutParams = this.f10950c.getLayoutParams();
                    com.anythink.core.common.res.b.a(getContext()).a(new com.anythink.core.common.res.e(1, z6), layoutParams.width, layoutParams.height, new AnonymousClass4(z6));
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
                    int i4 = this.f10960n;
                    if (i4 == 2 || i4 == 6) {
                        roundFrameLayout.setRadius(8);
                    } else {
                        roundFrameLayout.setRadius(12);
                    }
                    roundFrameLayout.addView(view);
                    viewGroup.addView(roundFrameLayout, indexOfChild, layoutParams2);
                    roundFrameLayout.setId(imageView.getId());
                    if (view instanceof ImageView) {
                        this.f10950c = (ImageView) view;
                    }
                }
            }
            if (!g()) {
                this.f10950c.setVisibility(8);
            }
        }
        if (this.f10953f != null) {
            if (TextUtils.isEmpty(wVar.y())) {
                this.f10953f.setVisibility(8);
            } else {
                this.f10953f.setText(wVar.y());
            }
        }
        if (this.f10952e != null) {
            if (TextUtils.isEmpty(wVar.x())) {
                this.f10952e.setVisibility(8);
            } else {
                this.f10952e.setText(wVar.x());
            }
        }
        CTAButtonLayout cTAButtonLayout = this.f10954g;
        if (cTAButtonLayout != null) {
            cTAButtonLayout.initSetting(wVar, this.f10958l, this.f10948a, new AnonymousClass5());
            int i6 = this.f10960n;
            if (i6 == 8 || i6 == 7) {
                this.f10954g.changeMinorButtonStyle();
            }
        }
        new com.anythink.basead.ui.f.a(wVar, this.f10958l).b(this);
        if (this.f10950c != null) {
            if (!this.f10959m.c()) {
                this.f10950c.setOnClickListener(this.f10967u);
            }
            this.f10964r.add(this.f10950c);
        }
        if (this.f10952e != null) {
            if (!this.f10959m.c()) {
                this.f10952e.setOnClickListener(this.f10967u);
            }
            this.f10964r.add(this.f10952e);
        }
        if (this.f10953f != null) {
            if (!this.f10959m.c()) {
                this.f10953f.setOnClickListener(this.f10967u);
            }
            this.f10964r.add(this.f10953f);
        }
        if (this.f10954g != null) {
            if (!this.f10959m.c()) {
                this.f10954g.setOnClickListener(this.f10967u);
            }
            this.f10964r.add(this.f10954g);
        }
        if (this.f10951d != null) {
            if (!this.f10959m.c()) {
                this.f10951d.setOnClickListener(this.f10967u);
            }
            this.f10964r.add(this.f10951d);
        }
        if (this.f10955h != null && this.f10963q && !this.f10959m.c()) {
            this.f10955h.setOnClickListener(this.f10967u);
            this.f10955h.setOnShakeListener(new AnonymousClass3(), this.f10957k);
        }
        View findViewById = this.f10949b.findViewById(q.a(getContext(), "myoffer_panel_view_blank", "id"));
        if (findViewById != null) {
            if (!this.f10959m.c()) {
                findViewById.setOnClickListener(this.f10967u);
            }
            this.f10964r.add(findViewById);
        } else {
            if (!this.f10959m.c()) {
                this.f10949b.setOnClickListener(this.f10967u);
            }
            this.f10964r.add(this.f10949b);
        }
        ImageView imageView2 = this.f10950c;
        if (imageView2 instanceof RoundImageView) {
            ((RoundImageView) imageView2).setNeedRadiu(true);
            int i9 = this.f10960n;
            if (i9 == 2 || i9 == 6) {
                ((RoundImageView) this.f10950c).setRadiusInDip(8);
            } else {
                ((RoundImageView) this.f10950c).setRadiusInDip(12);
            }
            this.f10950c.invalidate();
        }
        d dVar = this.f10965s;
        if (dVar != null) {
            dVar.a(this.f10960n).a(new AnonymousClass2()).a(getContext(), this.f10949b);
        }
    }

    private boolean a() {
        return this.f10961o && !this.f10962p;
    }

    private void b() {
        ViewGroup viewGroup;
        int indexOfChild;
        BaseShakeView baseShakeView;
        this.f10964r.clear();
        this.f10950c = (ImageView) this.f10949b.findViewById(q.a(getContext(), "myoffer_iv_banner_icon", "id"));
        this.f10952e = (TextView) this.f10949b.findViewById(q.a(getContext(), "myoffer_tv_banner_title", "id"));
        this.f10953f = (TextView) this.f10949b.findViewById(q.a(getContext(), "myoffer_tv_banner_desc", "id"));
        this.f10954g = (CTAButtonLayout) this.f10949b.findViewById(q.a(getContext(), "myoffer_panel_cta_layout", "id"));
        this.f10951d = (ImageView) this.f10949b.findViewById(q.a(getContext(), "myoffer_ad_logo", "id"));
        try {
            BaseShakeView baseShakeView2 = (BaseShakeView) this.f10949b.findViewById(q.a(getContext(), "myoffer_shake_hint_text", "id"));
            this.f10955h = baseShakeView2;
            baseShakeView2.setShakeSetting(this.f10958l.f14954o, this.f10959m.K());
            this.f10955h.startShakeIconAnimation();
        } catch (Throwable unused) {
        }
        if (this.f10963q && (baseShakeView = this.f10955h) != null && this.f10960n != 8) {
            baseShakeView.setVisibility(0);
        }
        w wVar = this.f10959m;
        ImageView imageView = this.f10950c;
        if (imageView != null) {
            View view = this.f10966t;
            if (view == null) {
                String z6 = wVar.z();
                if (!TextUtils.isEmpty(z6)) {
                    ViewGroup.LayoutParams layoutParams = this.f10950c.getLayoutParams();
                    com.anythink.core.common.res.b.a(getContext()).a(new com.anythink.core.common.res.e(1, z6), layoutParams.width, layoutParams.height, new AnonymousClass4(z6));
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
                    int i = this.f10960n;
                    if (i == 2 || i == 6) {
                        roundFrameLayout.setRadius(8);
                    } else {
                        roundFrameLayout.setRadius(12);
                    }
                    roundFrameLayout.addView(view);
                    viewGroup.addView(roundFrameLayout, indexOfChild, layoutParams2);
                    roundFrameLayout.setId(imageView.getId());
                    if (view instanceof ImageView) {
                        this.f10950c = (ImageView) view;
                    }
                }
            }
            if (!g()) {
                this.f10950c.setVisibility(8);
            }
        }
        if (this.f10953f != null) {
            if (TextUtils.isEmpty(wVar.y())) {
                this.f10953f.setVisibility(8);
            } else {
                this.f10953f.setText(wVar.y());
            }
        }
        if (this.f10952e != null) {
            if (TextUtils.isEmpty(wVar.x())) {
                this.f10952e.setVisibility(8);
            } else {
                this.f10952e.setText(wVar.x());
            }
        }
        CTAButtonLayout cTAButtonLayout = this.f10954g;
        if (cTAButtonLayout != null) {
            cTAButtonLayout.initSetting(wVar, this.f10958l, this.f10948a, new AnonymousClass5());
            int i4 = this.f10960n;
            if (i4 == 8 || i4 == 7) {
                this.f10954g.changeMinorButtonStyle();
            }
        }
        new com.anythink.basead.ui.f.a(wVar, this.f10958l).b(this);
        if (this.f10950c != null) {
            if (!this.f10959m.c()) {
                this.f10950c.setOnClickListener(this.f10967u);
            }
            this.f10964r.add(this.f10950c);
        }
        if (this.f10952e != null) {
            if (!this.f10959m.c()) {
                this.f10952e.setOnClickListener(this.f10967u);
            }
            this.f10964r.add(this.f10952e);
        }
        if (this.f10953f != null) {
            if (!this.f10959m.c()) {
                this.f10953f.setOnClickListener(this.f10967u);
            }
            this.f10964r.add(this.f10953f);
        }
        if (this.f10954g != null) {
            if (!this.f10959m.c()) {
                this.f10954g.setOnClickListener(this.f10967u);
            }
            this.f10964r.add(this.f10954g);
        }
        if (this.f10951d != null) {
            if (!this.f10959m.c()) {
                this.f10951d.setOnClickListener(this.f10967u);
            }
            this.f10964r.add(this.f10951d);
        }
        if (this.f10955h != null && this.f10963q && !this.f10959m.c()) {
            this.f10955h.setOnClickListener(this.f10967u);
            this.f10955h.setOnShakeListener(new AnonymousClass3(), this.f10957k);
        }
        View findViewById = this.f10949b.findViewById(q.a(getContext(), "myoffer_panel_view_blank", "id"));
        if (findViewById != null) {
            if (!this.f10959m.c()) {
                findViewById.setOnClickListener(this.f10967u);
            }
            this.f10964r.add(findViewById);
        } else {
            if (!this.f10959m.c()) {
                this.f10949b.setOnClickListener(this.f10967u);
            }
            this.f10964r.add(this.f10949b);
        }
        ImageView imageView2 = this.f10950c;
        if (imageView2 instanceof RoundImageView) {
            ((RoundImageView) imageView2).setNeedRadiu(true);
            int i6 = this.f10960n;
            if (i6 == 2 || i6 == 6) {
                ((RoundImageView) this.f10950c).setRadiusInDip(8);
            } else {
                ((RoundImageView) this.f10950c).setRadiusInDip(12);
            }
            this.f10950c.invalidate();
        }
        d dVar = this.f10965s;
        if (dVar != null) {
            dVar.a(this.f10960n).a(new AnonymousClass2()).a(getContext(), this.f10949b);
        }
    }

    private void c() {
        ImageView imageView = this.f10950c;
        if (imageView instanceof RoundImageView) {
            ((RoundImageView) imageView).setNeedRadiu(true);
            int i = this.f10960n;
            if (i == 2 || i == 6) {
                ((RoundImageView) this.f10950c).setRadiusInDip(8);
            } else {
                ((RoundImageView) this.f10950c).setRadiusInDip(12);
            }
            this.f10950c.invalidate();
        }
    }

    private void d() {
        BaseShakeView baseShakeView;
        if (!this.f10963q || (baseShakeView = this.f10955h) == null || this.f10960n == 8) {
            return;
        }
        baseShakeView.setVisibility(0);
    }

    private void e() {
        BaseShakeView baseShakeView;
        this.f10964r.clear();
        this.f10950c = (ImageView) this.f10949b.findViewById(q.a(getContext(), "myoffer_iv_banner_icon", "id"));
        this.f10952e = (TextView) this.f10949b.findViewById(q.a(getContext(), "myoffer_tv_banner_title", "id"));
        this.f10953f = (TextView) this.f10949b.findViewById(q.a(getContext(), "myoffer_tv_banner_desc", "id"));
        this.f10954g = (CTAButtonLayout) this.f10949b.findViewById(q.a(getContext(), "myoffer_panel_cta_layout", "id"));
        this.f10951d = (ImageView) this.f10949b.findViewById(q.a(getContext(), "myoffer_ad_logo", "id"));
        try {
            BaseShakeView baseShakeView2 = (BaseShakeView) this.f10949b.findViewById(q.a(getContext(), "myoffer_shake_hint_text", "id"));
            this.f10955h = baseShakeView2;
            baseShakeView2.setShakeSetting(this.f10958l.f14954o, this.f10959m.K());
            this.f10955h.startShakeIconAnimation();
        } catch (Throwable unused) {
        }
        if (!this.f10963q || (baseShakeView = this.f10955h) == null || this.f10960n == 8) {
            return;
        }
        baseShakeView.setVisibility(0);
    }

    private void a(w wVar) {
        ViewGroup viewGroup;
        int indexOfChild;
        ImageView imageView = this.f10950c;
        if (imageView != null) {
            View view = this.f10966t;
            if (view == null) {
                String z6 = wVar.z();
                if (!TextUtils.isEmpty(z6)) {
                    ViewGroup.LayoutParams layoutParams = this.f10950c.getLayoutParams();
                    com.anythink.core.common.res.b.a(getContext()).a(new com.anythink.core.common.res.e(1, z6), layoutParams.width, layoutParams.height, new AnonymousClass4(z6));
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
                    int i = this.f10960n;
                    if (i != 2 && i != 6) {
                        roundFrameLayout.setRadius(12);
                    } else {
                        roundFrameLayout.setRadius(8);
                    }
                    roundFrameLayout.addView(view);
                    viewGroup.addView(roundFrameLayout, indexOfChild, layoutParams2);
                    roundFrameLayout.setId(imageView.getId());
                    if (view instanceof ImageView) {
                        this.f10950c = (ImageView) view;
                    }
                }
            }
            if (!g()) {
                this.f10950c.setVisibility(8);
            }
        }
        if (this.f10953f != null) {
            if (!TextUtils.isEmpty(wVar.y())) {
                this.f10953f.setText(wVar.y());
            } else {
                this.f10953f.setVisibility(8);
            }
        }
        if (this.f10952e != null) {
            if (!TextUtils.isEmpty(wVar.x())) {
                this.f10952e.setText(wVar.x());
            } else {
                this.f10952e.setVisibility(8);
            }
        }
        CTAButtonLayout cTAButtonLayout = this.f10954g;
        if (cTAButtonLayout != null) {
            cTAButtonLayout.initSetting(wVar, this.f10958l, this.f10948a, new AnonymousClass5());
            int i4 = this.f10960n;
            if (i4 == 8 || i4 == 7) {
                this.f10954g.changeMinorButtonStyle();
            }
        }
        new com.anythink.basead.ui.f.a(wVar, this.f10958l).b(this);
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
        int i = this.f10960n;
        if (i != 2 && i != 6) {
            roundFrameLayout.setRadius(12);
        } else {
            roundFrameLayout.setRadius(8);
        }
        roundFrameLayout.addView(view);
        viewGroup.addView(roundFrameLayout, indexOfChild, layoutParams);
        roundFrameLayout.setId(imageView.getId());
        if (view instanceof ImageView) {
            this.f10950c = (ImageView) view;
        }
    }

    private void a(RoundFrameLayout roundFrameLayout) {
        int i = this.f10960n;
        if (i != 2 && i != 6) {
            roundFrameLayout.setRadius(12);
        } else {
            roundFrameLayout.setRadius(8);
        }
    }

    private boolean a(int i) {
        return (i == 1 || i == 2 || i == 5 || i == 6 || i == 9) && !e.e(this.f10959m, this.f10958l);
    }
}
