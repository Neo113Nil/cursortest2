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
        return this.f9893g.n() || this.ad <= this.ae;
    }

    private boolean ai() {
        return !e.a(this.f9893g);
    }

    @Override // com.anythink.basead.ui.BaseScreenATView
    public void G() {
        super.G();
        if (this.f9893g.J() != 1 || this.f9893g.V() <= 0 || this.f9893g.W() <= 0) {
            return;
        }
        this.ad = this.f9893g.V();
        this.ae = this.f9893g.W();
    }

    @Override // com.anythink.basead.ui.BaseScreenATView
    public final void I() {
        super.I();
        this.f10001E = af();
        if (aa() != null) {
            aa().setLayoutType(this.f10001E);
            if (b(this.f10001E)) {
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
        PanelView panelView = this.f10009N;
        if (panelView != null) {
            panelView.notifyHalfScreenEndCardShow();
        }
        BasePlayerView l9 = this.f9903r.l();
        if (this.f10008M == null || (baseEndCardView = this.f10010O) == null || baseEndCardView.getParent() != null || l9 == null) {
            return;
        }
        this.f10008M.addView(this.f10010O, 1, l9.getLayoutParams());
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
        int i9;
        int i10;
        int i11;
        int a9;
        View findViewById;
        View findViewById2;
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f10009N.getLayoutParams();
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f10008M.getLayoutParams();
        int i12 = layoutParams2.leftMargin;
        int i13 = layoutParams2.rightMargin;
        int i14 = layoutParams2.topMargin;
        int i15 = layoutParams2.bottomMargin;
        BasePlayerView l9 = this.f9903r.l();
        RelativeLayout.LayoutParams layoutParams3 = l9 != null ? (RelativeLayout.LayoutParams) l9.getLayoutParams() : null;
        int b9 = q.b(getContext());
        if (b9 <= 0) {
            b9 = q.a(getContext(), 32.0f);
        }
        int i16 = this.am;
        if (i16 == 1) {
            if (this.f10020b == 2) {
                i4 = (this.f10022d - i14) - i15;
                i9 = (int) (i4 * 1.75f);
                i10 = q.a(getContext(), 120.0f);
                if (i14 < b9) {
                    layoutParams2.topMargin = (int) (b9 * 1.1f);
                }
                layoutParams2.width = i9;
                this.f10008M.setLayoutParams(layoutParams2);
            } else if (ah()) {
                i9 = (this.f10021c - i12) - i13;
                i4 = (int) (i9 / 0.5714286f);
                int i17 = this.f10022d;
                int i18 = b9 * 4;
                if (i17 - i4 < i18) {
                    i4 = i17 - i18;
                }
                i10 = q.a(getContext(), 240.0f);
            } else {
                i9 = (this.f10021c - i12) - i13;
                i4 = (int) (i9 / 1.032258f);
                i10 = q.a(getContext(), 120.0f);
            }
            this.f9997A = i9;
            this.f9998B = i4;
        } else {
            if (i16 != 2) {
                View findViewById3 = this.f10009N.findViewById(q.a(getContext(), "myoffer_panel_view_blank", "id"));
                i = findViewById3 != null ? ((RelativeLayout.LayoutParams) findViewById3.getLayoutParams()).topMargin : 0;
                if (this.f10020b == 1) {
                    i9 = (this.f10021c - i12) - i13;
                    i4 = (int) (i9 / 1.032258f);
                    this.f9997A = i9;
                    int i19 = (int) (i9 / 2.0f);
                    this.f9998B = i19;
                    i10 = (i4 - i19) + i;
                } else {
                    if (i14 < b9) {
                        i14 = (int) (b9 * 1.1f);
                        layoutParams2.topMargin = i14;
                    }
                    i4 = (this.f10022d - i14) - i15;
                    i9 = (int) (i4 * 1.032258f);
                    this.f9997A = i9;
                    int i20 = (int) (i9 / 2.0f);
                    this.f9998B = i20;
                    i10 = (i4 - i20) + i;
                    layoutParams2.width = i9;
                    this.f10008M.setLayoutParams(layoutParams2);
                }
            } else {
                if (this.f10020b != 1) {
                    if (i14 < b9) {
                        i14 = (int) (b9 * 1.1f);
                        layoutParams2.topMargin = i14;
                    }
                    i4 = (this.f10022d - i14) - i15;
                    i9 = (int) (i4 * 1.6f);
                    if (this.ai != null && (a9 = this.f10021c - (q.a(getContext(), 116.0f) * 2)) < i9) {
                        i4 = (int) (a9 / 1.6f);
                        i9 = a9;
                    }
                    this.f9998B = i4;
                    int i21 = (int) (i4 * 0.56f);
                    this.f9997A = i21;
                    i11 = i9 - i21;
                    layoutParams2.width = i9;
                    this.f10008M.setLayoutParams(layoutParams2);
                    i10 = i4;
                    layoutParams2.width = i9;
                    layoutParams2.height = i4;
                    this.f10008M.setLayoutParams(layoutParams2);
                    if (layoutParams3 != null && l9 != null) {
                        layoutParams3.width = this.f9997A;
                        layoutParams3.height = this.f9998B;
                        l9.setLayoutParams(layoutParams3);
                    }
                    layoutParams.width = i11;
                    layoutParams.height = i10;
                    this.f10009N.setLayoutParams(layoutParams);
                    if (this.am == 2 || this.f10020b != 2) {
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
                View findViewById4 = this.f10009N.findViewById(q.a(getContext(), "myoffer_panel_view_blank", "id"));
                i = findViewById4 != null ? ((RelativeLayout.LayoutParams) findViewById4.getLayoutParams()).topMargin : 0;
                i9 = (this.f10021c - i12) - i13;
                float f6 = i9;
                int i22 = (int) (f6 / 0.5714286f);
                int i23 = this.f10022d;
                int i24 = b9 * 4;
                if (i23 - i22 < i24) {
                    i22 = i23 - i24;
                }
                i10 = (int) (f6 / 1.8181819f);
                this.f9997A = i9;
                this.f9998B = (i22 - i10) + i;
                i4 = i22;
            }
        }
        i11 = i9;
        layoutParams2.width = i9;
        layoutParams2.height = i4;
        this.f10008M.setLayoutParams(layoutParams2);
        if (layoutParams3 != null) {
            layoutParams3.width = this.f9997A;
            layoutParams3.height = this.f9998B;
            l9.setLayoutParams(layoutParams3);
        }
        layoutParams.width = i11;
        layoutParams.height = i10;
        this.f10009N.setLayoutParams(layoutParams);
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
            dVar.a(this.f10001E).a(new com.anythink.basead.ui.d.a() { // from class: com.anythink.basead.ui.HalfScreenATView.1
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
        if (!e.a(this.f9893g) || this.f9893g.n()) {
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
        RelativeLayout relativeLayout = this.f10008M;
        if (relativeLayout == null || this.f10009N == null) {
            return super.q();
        }
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) relativeLayout.getLayoutParams();
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f10009N.getLayoutParams();
        int i = (layoutParams.height * 2) / 3;
        BasePlayerView l9 = this.f9903r.l();
        if (l9 != null) {
            i = (((RelativeLayout.LayoutParams) l9.getLayoutParams()).height * 2) / 3;
        } else {
            BaseEndCardView baseEndCardView = this.f10010O;
            if (baseEndCardView != null) {
                i = (((RelativeLayout.LayoutParams) baseEndCardView.getLayoutParams()).height * 2) / 3;
            }
        }
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.addRule(11);
        layoutParams3.setMargins(0, i, (this.am == 2 && this.f10020b == 2) ? layoutParams2.width : 0, 0);
        return layoutParams3;
    }

    @Override // com.anythink.basead.ui.BaseATView
    public final int r() {
        return 2;
    }

    @Override // com.anythink.basead.ui.BaseScreenATView
    public final int y() {
        return this.f10001E;
    }

    public HalfScreenATView(Context context, x xVar, w wVar, String str, int i, int i4) {
        super(context, xVar, wVar, str, i, i4);
        this.aj = 1;
        this.ak = 2;
        this.al = 3;
        setId(q.a(getContext(), "myoffer_half_screen_view_id", "id"));
        if (xVar != null) {
            this.ai = new d(wVar, xVar.f14325o);
        }
    }

    @Override // com.anythink.basead.ui.BaseScreenATView
    public boolean b(int i) {
        if (this.f9893g.n()) {
            return false;
        }
        return (i == 7 && this.f9892f.f14325o.J() == 0) ? false : true;
    }
}
