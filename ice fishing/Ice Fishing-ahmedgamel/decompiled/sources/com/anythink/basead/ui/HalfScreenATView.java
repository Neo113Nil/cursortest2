package com.anythink.basead.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import com.anythink.basead.b.e;
import com.anythink.basead.ui.animplayerview.BasePlayerView;
import com.anythink.basead.ui.f.d;
import com.anythink.core.common.h.w;
import com.anythink.core.common.h.x;
import com.anythink.core.common.v.q;

/* loaded from: classes.dex */
public class HalfScreenATView extends BaseScreenATView {
    public static final String TAG = "HalfScreenATView";
    protected View ah;
    protected d ai;
    protected final int aj;
    protected final int ak;
    protected final int al;
    protected int am;

    public HalfScreenATView(Context context) {
        super(context);
        this.aj = 1;
        this.ak = 2;
        this.al = 3;
    }

    private boolean ah() {
        return this.f10522g.n() || this.ad <= this.ae;
    }

    private boolean ai() {
        return !e.a(this.f10522g);
    }

    @Override // com.anythink.basead.ui.BaseScreenATView
    public void G() {
        super.G();
        if (this.f10522g.J() != 1 || this.f10522g.V() <= 0 || this.f10522g.W() <= 0) {
            return;
        }
        this.ad = this.f10522g.V();
        this.ae = this.f10522g.W();
    }

    @Override // com.anythink.basead.ui.BaseScreenATView
    public final void I() {
        super.I();
        this.f10630E = af();
        if (aa() != null) {
            aa().setLayoutType(this.f10630E);
            if (b(this.f10630E)) {
                Q();
            } else {
                aa().setVisibility(8);
            }
        }
    }

    @Override // com.anythink.basead.ui.BaseScreenATView
    public void M() {
        N();
        super.c(1);
    }

    @Override // com.anythink.basead.ui.BaseScreenATView
    public final void R() {
    }

    @Override // com.anythink.basead.ui.BaseScreenATView
    public void U() {
        BaseEndCardView baseEndCardView;
        PanelView panelView = this.f10638N;
        if (panelView != null) {
            panelView.notifyHalfScreenEndCardShow();
        }
        BasePlayerView l9 = this.f10532r.l();
        if (this.f10637M == null || (baseEndCardView = this.f10639O) == null || baseEndCardView.getParent() != null || l9 == null) {
            return;
        }
        this.f10637M.addView(this.f10639O, 1, l9.getLayoutParams());
    }

    @Override // com.anythink.basead.ui.BaseATView
    public void a() {
        int i = this.am;
        if (i == 1) {
            this.ah = LayoutInflater.from(getContext()).inflate(q.a(getContext(), "myoffer_half_screen_empty_info", "layout"), this, isAttachRoot());
        } else if (i != 2) {
            this.ah = LayoutInflater.from(getContext()).inflate(q.a(getContext(), "myoffer_half_screen_horizontal", "layout"), this, isAttachRoot());
        } else {
            this.ah = LayoutInflater.from(getContext()).inflate(q.a(getContext(), "myoffer_half_screen_vertical", "layout"), this, isAttachRoot());
        }
    }

    public int af() {
        int i = this.am;
        if (i != 1) {
            return i != 2 ? 4 : 3;
        }
        return 7;
    }

    public void ag() {
        int i;
        int i4;
        int i6;
        int i9;
        int i10;
        int a9;
        View findViewById;
        View findViewById2;
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f10638N.getLayoutParams();
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f10637M.getLayoutParams();
        int i11 = layoutParams2.leftMargin;
        int i12 = layoutParams2.rightMargin;
        int i13 = layoutParams2.topMargin;
        int i14 = layoutParams2.bottomMargin;
        BasePlayerView l9 = this.f10532r.l();
        RelativeLayout.LayoutParams layoutParams3 = l9 != null ? (RelativeLayout.LayoutParams) l9.getLayoutParams() : null;
        int b9 = q.b(getContext());
        if (b9 <= 0) {
            b9 = q.a(getContext(), 32.0f);
        }
        int i15 = this.am;
        if (i15 == 1) {
            if (this.f10649b == 2) {
                i4 = (this.f10651d - i13) - i14;
                i6 = (int) (i4 * 1.75f);
                i9 = q.a(getContext(), 120.0f);
                if (i13 < b9) {
                    layoutParams2.topMargin = (int) (b9 * 1.1f);
                }
                layoutParams2.width = i6;
                this.f10637M.setLayoutParams(layoutParams2);
            } else if (ah()) {
                i6 = (this.f10650c - i11) - i12;
                i4 = (int) (i6 / 0.5714286f);
                int i16 = this.f10651d;
                int i17 = b9 * 4;
                if (i16 - i4 < i17) {
                    i4 = i16 - i17;
                }
                i9 = q.a(getContext(), 240.0f);
            } else {
                i6 = (this.f10650c - i11) - i12;
                i4 = (int) (i6 / 1.032258f);
                i9 = q.a(getContext(), 120.0f);
            }
            this.f10626A = i6;
            this.f10627B = i4;
        } else {
            if (i15 != 2) {
                View findViewById3 = this.f10638N.findViewById(q.a(getContext(), "myoffer_panel_view_blank", "id"));
                i = findViewById3 != null ? ((RelativeLayout.LayoutParams) findViewById3.getLayoutParams()).topMargin : 0;
                if (this.f10649b == 1) {
                    i6 = (this.f10650c - i11) - i12;
                    i4 = (int) (i6 / 1.032258f);
                    this.f10626A = i6;
                    int i18 = (int) (i6 / 2.0f);
                    this.f10627B = i18;
                    i9 = (i4 - i18) + i;
                } else {
                    if (i13 < b9) {
                        i13 = (int) (b9 * 1.1f);
                        layoutParams2.topMargin = i13;
                    }
                    i4 = (this.f10651d - i13) - i14;
                    i6 = (int) (i4 * 1.032258f);
                    this.f10626A = i6;
                    int i19 = (int) (i6 / 2.0f);
                    this.f10627B = i19;
                    i9 = (i4 - i19) + i;
                    layoutParams2.width = i6;
                    this.f10637M.setLayoutParams(layoutParams2);
                }
            } else {
                if (this.f10649b != 1) {
                    if (i13 < b9) {
                        i13 = (int) (b9 * 1.1f);
                        layoutParams2.topMargin = i13;
                    }
                    i4 = (this.f10651d - i13) - i14;
                    i6 = (int) (i4 * 1.6f);
                    if (this.ai != null && (a9 = this.f10650c - (q.a(getContext(), 116.0f) * 2)) < i6) {
                        i4 = (int) (a9 / 1.6f);
                        i6 = a9;
                    }
                    this.f10627B = i4;
                    int i20 = (int) (i4 * 0.56f);
                    this.f10626A = i20;
                    i10 = i6 - i20;
                    layoutParams2.width = i6;
                    this.f10637M.setLayoutParams(layoutParams2);
                    i9 = i4;
                    layoutParams2.width = i6;
                    layoutParams2.height = i4;
                    this.f10637M.setLayoutParams(layoutParams2);
                    if (layoutParams3 != null && l9 != null) {
                        layoutParams3.width = this.f10626A;
                        layoutParams3.height = this.f10627B;
                        l9.setLayoutParams(layoutParams3);
                    }
                    layoutParams.width = i10;
                    layoutParams.height = i9;
                    this.f10638N.setLayoutParams(layoutParams);
                    if (this.am == 2 || this.f10649b != 2) {
                        findViewById = findViewById(q.a(getContext(), "myoffer_guide2click_container", "id"));
                        if (findViewById != null && layoutParams3 != null) {
                            findViewById.setLayoutParams(layoutParams3);
                        }
                        findViewById2 = findViewById(q.a(getContext(), "myoffer_guide2click_mask", "id"));
                        if (findViewById2 != null || layoutParams3 == null) {
                        }
                        findViewById2.setLayoutParams(layoutParams3);
                        return;
                    }
                    return;
                }
                View findViewById4 = this.f10638N.findViewById(q.a(getContext(), "myoffer_panel_view_blank", "id"));
                i = findViewById4 != null ? ((RelativeLayout.LayoutParams) findViewById4.getLayoutParams()).topMargin : 0;
                i6 = (this.f10650c - i11) - i12;
                float f2 = i6;
                int i21 = (int) (f2 / 0.5714286f);
                int i22 = this.f10651d;
                int i23 = b9 * 4;
                if (i22 - i21 < i23) {
                    i21 = i22 - i23;
                }
                i9 = (int) (f2 / 1.8181819f);
                this.f10626A = i6;
                this.f10627B = (i21 - i9) + i;
                i4 = i21;
            }
        }
        i10 = i6;
        layoutParams2.width = i6;
        layoutParams2.height = i4;
        this.f10637M.setLayoutParams(layoutParams2);
        if (layoutParams3 != null) {
            layoutParams3.width = this.f10626A;
            layoutParams3.height = this.f10627B;
            l9.setLayoutParams(layoutParams3);
        }
        layoutParams.width = i10;
        layoutParams.height = i9;
        this.f10638N.setLayoutParams(layoutParams);
        if (this.am == 2) {
        }
        findViewById = findViewById(q.a(getContext(), "myoffer_guide2click_container", "id"));
        if (findViewById != null) {
            findViewById.setLayoutParams(layoutParams3);
        }
        findViewById2 = findViewById(q.a(getContext(), "myoffer_guide2click_mask", "id"));
        if (findViewById2 != null) {
        }
    }

    @Override // com.anythink.basead.ui.BaseScreenATView
    public void b() {
        super.b();
        try {
            ag();
        } catch (Throwable th) {
            th.printStackTrace();
        }
        d dVar = this.ai;
        if (dVar != null) {
            dVar.a(this.f10630E).a(new com.anythink.basead.ui.d.a() { // from class: com.anythink.basead.ui.HalfScreenATView.1
                @Override // com.anythink.basead.ui.d.a
                public final void a(int i, int i4) {
                    HalfScreenATView.this.a(i, i4);
                }
            }).a(getContext(), this.ah);
        }
    }

    @Override // com.anythink.basead.ui.BaseScreenATView, com.anythink.basead.ui.BaseATView
    public final void e() {
        super.e();
        if (!e.a(this.f10522g) || this.f10522g.n()) {
            this.am = 1;
        } else if (ah()) {
            this.am = 2;
        } else {
            this.am = 3;
        }
    }

    public boolean isAttachRoot() {
        return true;
    }

    @Override // com.anythink.basead.ui.BaseScreenATView, com.anythink.basead.ui.BaseATView
    public RelativeLayout.LayoutParams q() {
        RelativeLayout relativeLayout = this.f10637M;
        if (relativeLayout == null || this.f10638N == null) {
            return super.q();
        }
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) relativeLayout.getLayoutParams();
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f10638N.getLayoutParams();
        int i = (layoutParams.height * 2) / 3;
        BasePlayerView l9 = this.f10532r.l();
        if (l9 != null) {
            i = (((RelativeLayout.LayoutParams) l9.getLayoutParams()).height * 2) / 3;
        } else {
            BaseEndCardView baseEndCardView = this.f10639O;
            if (baseEndCardView != null) {
                i = (((RelativeLayout.LayoutParams) baseEndCardView.getLayoutParams()).height * 2) / 3;
            }
        }
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.addRule(11);
        layoutParams3.setMargins(0, i, (this.am == 2 && this.f10649b == 2) ? layoutParams2.width : 0, 0);
        return layoutParams3;
    }

    @Override // com.anythink.basead.ui.BaseATView
    public final int r() {
        return 2;
    }

    @Override // com.anythink.basead.ui.BaseScreenATView
    public final int y() {
        return this.f10630E;
    }

    public HalfScreenATView(Context context, x xVar, w wVar, String str, int i, int i4) {
        super(context, xVar, wVar, str, i, i4);
        this.aj = 1;
        this.ak = 2;
        this.al = 3;
        setId(q.a(getContext(), "myoffer_half_screen_view_id", "id"));
        if (xVar != null) {
            this.ai = new d(wVar, xVar.f14954o);
        }
    }

    @Override // com.anythink.basead.ui.BaseScreenATView
    public boolean b(int i) {
        if (this.f10522g.n()) {
            return false;
        }
        return (i == 7 && this.f10521f.f14954o.J() == 0) ? false : true;
    }
}
