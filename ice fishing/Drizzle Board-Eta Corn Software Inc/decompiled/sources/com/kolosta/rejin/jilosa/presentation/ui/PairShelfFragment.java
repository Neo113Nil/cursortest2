package com.kolosta.rejin.jilosa.presentation.ui;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.chip.Chip;
import com.kolosta.rejin.jilosa.R;
import com.kolosta.rejin.jilosa.presentation.ui.PairShelfFragment;
import defpackage.ay;
import defpackage.bp9dZ9BB;
import defpackage.ej0;
import defpackage.fb0;
import defpackage.fn;
import defpackage.fo;
import defpackage.g9;
import defpackage.hx;
import defpackage.ig0;
import defpackage.io;
import defpackage.ix;
import defpackage.j0;
import defpackage.kb0;
import defpackage.kn;
import defpackage.kx;
import defpackage.le0;
import defpackage.li;
import defpackage.m20;
import defpackage.mx;
import defpackage.n50;
import defpackage.nx;
import defpackage.ox;
import defpackage.px;
import defpackage.q6;
import defpackage.q90;
import defpackage.qx;
import defpackage.rg0;
import defpackage.rx;
import defpackage.s6;
import defpackage.sj;
import defpackage.sx;
import defpackage.u6;
import defpackage.vl;
import defpackage.w30;
import defpackage.wm;
import defpackage.wx;
import defpackage.x90;
import defpackage.y5;
import defpackage.zf;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class PairShelfFragment extends li implements vl {
    public static final List f7oeun2L = y5.N8VPGzVC("creamy", "herby", "spicy", "citrus", "smoky", "sweet", "calm", "bold", "fresh", "cozy", "intense");
    public volatile j0 ESscZ9M1;
    public PopupWindow LvHlPNBd;
    public final u6 QT4Tf9Dt;
    public final kn Sjrx9cEN;
    public ig0 TrssYQ34;
    public final ay Wi7iiXC4;
    public final u6 dHozS53r;
    public q90 hGvurcGl;
    public final u6 orhfF2Ya;
    public sj pP9Y2m6O;
    public final kn tef3qNMP;
    public boolean g2aRJUAd = false;
    public final Object VGmz0ccI = new Object();
    public boolean LfKQckgD = false;

    public PairShelfFragment() {
        int i = 0;
        fo eIA6dogk = w30.eIA6dogk(io.MdtA4re8, new px(0, new ox(this, 3)));
        this.tef3qNMP = new kn(m20.qoPGr6Ce(wx.class), new qx(eIA6dogk, 0), new rx(this, eIA6dogk, i), new qx(eIA6dogk, 1));
        this.Sjrx9cEN = new kn(m20.qoPGr6Ce(fb0.class), new ox(this, 0), new ox(this, 2), new ox(this, 1));
        this.Wi7iiXC4 = new ay(new ix(this, i), new kx(i, this));
        this.QT4Tf9Dt = new u6(new ix(this, 1), (char) 0);
        this.orhfF2Ya = new u6(new ix(this, 2), (byte) 0);
        this.dHozS53r = new u6(new ix(this, 3));
    }

    @Override // defpackage.li
    public final void DK9slbsy() {
        this.euDDoUNr = true;
        q90 q90Var = this.hGvurcGl;
        if (q90Var != null) {
            q90Var.b2ZJblxo(null);
        }
        PopupWindow popupWindow = this.LvHlPNBd;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
        this.LvHlPNBd = null;
        sj sjVar = this.pP9Y2m6O;
        sjVar.getClass();
        sjVar.sjUBp5pO.setAdapter(null);
        sj sjVar2 = this.pP9Y2m6O;
        sjVar2.getClass();
        sjVar2.i7xS8jrb.setAdapter(null);
        sj sjVar3 = this.pP9Y2m6O;
        sjVar3.getClass();
        sjVar3.Qr9iLBAD.setAdapter(null);
        sj sjVar4 = this.pP9Y2m6O;
        sjVar4.getClass();
        sjVar4.OnDfzHZD.setAdapter(null);
        this.pP9Y2m6O = null;
    }

    public final void FXJmAAN1(bp9dZ9BB bp9dz9bb, q6 q6Var) {
        ((TextView) bp9dz9bb.MdtA4re8).setText(q6Var.qoPGr6Ce);
        ((TextView) bp9dz9bb.VgvYg0wo).setText(q6Var.NCTxEWno);
        ((TextView) bp9dz9bb.qoPGr6Ce).setText(q6Var.MdtA4re8);
        ((TextView) bp9dz9bb.wxUZMvaN).setText(q6Var.wxUZMvaN);
        ((TextView) bp9dz9bb.P7K7Inc8).setText(ygLcUYwZ(R.string.value_minutes, Integer.valueOf(q6Var.VgvYg0wo)));
        ((TextView) bp9dz9bb.NCTxEWno).setText(q6Var.P7K7Inc8);
    }

    @Override // defpackage.li
    public final void FySoLYna(Context context) {
        super.FySoLYna(context);
        N8VPGzVC();
        if (this.LfKQckgD) {
            return;
        }
        this.LfKQckgD = true;
        ((sx) NCTxEWno()).getClass();
    }

    public final List HdOGZAzC() {
        sj sjVar = this.pP9Y2m6O;
        sjVar.getClass();
        hx hxVar = new hx(sjVar.VgvYg0wo, OnDfzHZD(R.string.scope_wide));
        sj sjVar2 = this.pP9Y2m6O;
        sjVar2.getClass();
        hx hxVar2 = new hx(sjVar2.qoPGr6Ce, OnDfzHZD(R.string.scope_focused));
        sj sjVar3 = this.pP9Y2m6O;
        sjVar3.getClass();
        hx hxVar3 = new hx(sjVar3.MdtA4re8, OnDfzHZD(R.string.scope_specialized));
        sj sjVar4 = this.pP9Y2m6O;
        sjVar4.getClass();
        hx hxVar4 = new hx(sjVar4.wxUZMvaN, OnDfzHZD(R.string.scope_universal));
        sj sjVar5 = this.pP9Y2m6O;
        sjVar5.getClass();
        return y5.N8VPGzVC(hxVar, hxVar2, hxVar3, hxVar4, new hx(sjVar5.NCTxEWno, OnDfzHZD(R.string.scope_narrow)));
    }

    public final void N8VPGzVC() {
        if (this.TrssYQ34 == null) {
            this.TrssYQ34 = new ig0(super.eVhOlqcC(), this);
            this.g2aRJUAd = le0.DK9slbsy(super.eVhOlqcC());
        }
    }

    @Override // defpackage.ul
    public final Object NCTxEWno() {
        if (this.ESscZ9M1 == null) {
            synchronized (this.VGmz0ccI) {
                try {
                    if (this.ESscZ9M1 == null) {
                        this.ESscZ9M1 = new j0(this);
                    }
                } finally {
                }
            }
        }
        return this.ESscZ9M1.NCTxEWno();
    }

    @Override // defpackage.li
    public final void RXQxj5Oe(Activity activity) {
        this.euDDoUNr = true;
        ig0 ig0Var = this.TrssYQ34;
        ej0.P7K7Inc8(ig0Var == null || j0.MdtA4re8(ig0Var) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        N8VPGzVC();
        if (this.LfKQckgD) {
            return;
        }
        this.LfKQckgD = true;
        ((sx) NCTxEWno()).getClass();
    }

    @Override // defpackage.li
    public final LayoutInflater U0LaHZX7(Bundle bundle) {
        LayoutInflater U0LaHZX7 = super.U0LaHZX7(bundle);
        return U0LaHZX7.cloneInContext(new ig0(U0LaHZX7, this));
    }

    @Override // defpackage.li
    public final View WYNAV5pd(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        layoutInflater.getClass();
        View inflate = layoutInflater.inflate(R.layout.fragment_pair_shelf, viewGroup, false);
        int i = R.id.chip_scope_focused;
        Chip chip = (Chip) n50.qoPGr6Ce(inflate, R.id.chip_scope_focused);
        if (chip != null) {
            i = R.id.chip_scope_narrow;
            Chip chip2 = (Chip) n50.qoPGr6Ce(inflate, R.id.chip_scope_narrow);
            if (chip2 != null) {
                i = R.id.chip_scope_specialized;
                Chip chip3 = (Chip) n50.qoPGr6Ce(inflate, R.id.chip_scope_specialized);
                if (chip3 != null) {
                    i = R.id.chip_scope_universal;
                    Chip chip4 = (Chip) n50.qoPGr6Ce(inflate, R.id.chip_scope_universal);
                    if (chip4 != null) {
                        i = R.id.chip_scope_wide;
                        Chip chip5 = (Chip) n50.qoPGr6Ce(inflate, R.id.chip_scope_wide);
                        if (chip5 != null) {
                            i = R.id.compare_panels_overlay;
                            FrameLayout frameLayout = (FrameLayout) n50.qoPGr6Ce(inflate, R.id.compare_panels_overlay);
                            if (frameLayout != null) {
                                i = R.id.compared_empty;
                                TextView textView = (TextView) n50.qoPGr6Ce(inflate, R.id.compared_empty);
                                if (textView != null) {
                                    i = R.id.compared_list;
                                    RecyclerView recyclerView = (RecyclerView) n50.qoPGr6Ce(inflate, R.id.compared_list);
                                    if (recyclerView != null) {
                                        i = R.id.compared_title;
                                        if (((TextView) n50.qoPGr6Ce(inflate, R.id.compared_title)) != null) {
                                            i = R.id.content_scroll;
                                            NestedScrollView nestedScrollView = (NestedScrollView) n50.qoPGr6Ce(inflate, R.id.content_scroll);
                                            if (nestedScrollView != null) {
                                                i = R.id.density_compact;
                                                TextView textView2 = (TextView) n50.qoPGr6Ce(inflate, R.id.density_compact);
                                                if (textView2 != null) {
                                                    i = R.id.density_large;
                                                    TextView textView3 = (TextView) n50.qoPGr6Ce(inflate, R.id.density_large);
                                                    if (textView3 != null) {
                                                        i = R.id.density_standard;
                                                        TextView textView4 = (TextView) n50.qoPGr6Ce(inflate, R.id.density_standard);
                                                        if (textView4 != null) {
                                                            i = R.id.density_title;
                                                            if (((TextView) n50.qoPGr6Ce(inflate, R.id.density_title)) != null) {
                                                                i = R.id.header;
                                                                if (((LinearLayout) n50.qoPGr6Ce(inflate, R.id.header)) != null) {
                                                                    i = R.id.header_tagline;
                                                                    if (((TextView) n50.qoPGr6Ce(inflate, R.id.header_tagline)) != null) {
                                                                        i = R.id.header_title;
                                                                        if (((TextView) n50.qoPGr6Ce(inflate, R.id.header_title)) != null) {
                                                                            i = R.id.letter_index;
                                                                            RecyclerView recyclerView2 = (RecyclerView) n50.qoPGr6Ce(inflate, R.id.letter_index);
                                                                            if (recyclerView2 != null) {
                                                                                i = R.id.long_press_hint;
                                                                                TextView textView5 = (TextView) n50.qoPGr6Ce(inflate, R.id.long_press_hint);
                                                                                if (textView5 != null) {
                                                                                    i = R.id.pairs_empty;
                                                                                    LinearLayout linearLayout = (LinearLayout) n50.qoPGr6Ce(inflate, R.id.pairs_empty);
                                                                                    if (linearLayout != null) {
                                                                                        i = R.id.pairs_list;
                                                                                        RecyclerView recyclerView3 = (RecyclerView) n50.qoPGr6Ce(inflate, R.id.pairs_list);
                                                                                        if (recyclerView3 != null) {
                                                                                            i = R.id.panel_left;
                                                                                            View qoPGr6Ce = n50.qoPGr6Ce(inflate, R.id.panel_left);
                                                                                            if (qoPGr6Ce != null) {
                                                                                                bp9dZ9BB NCTxEWno = bp9dZ9BB.NCTxEWno(qoPGr6Ce);
                                                                                                i = R.id.panel_right;
                                                                                                View qoPGr6Ce2 = n50.qoPGr6Ce(inflate, R.id.panel_right);
                                                                                                if (qoPGr6Ce2 != null) {
                                                                                                    bp9dZ9BB NCTxEWno2 = bp9dZ9BB.NCTxEWno(qoPGr6Ce2);
                                                                                                    i = R.id.panels_close;
                                                                                                    ImageView imageView = (ImageView) n50.qoPGr6Ce(inflate, R.id.panels_close);
                                                                                                    if (imageView != null) {
                                                                                                        i = R.id.panels_title;
                                                                                                        if (((TextView) n50.qoPGr6Ce(inflate, R.id.panels_title)) != null) {
                                                                                                            i = R.id.prefilter_clear;
                                                                                                            AppCompatButton appCompatButton = (AppCompatButton) n50.qoPGr6Ce(inflate, R.id.prefilter_clear);
                                                                                                            if (appCompatButton != null) {
                                                                                                                i = R.id.prefilter_label;
                                                                                                                TextView textView6 = (TextView) n50.qoPGr6Ce(inflate, R.id.prefilter_label);
                                                                                                                if (textView6 != null) {
                                                                                                                    i = R.id.prefilter_row;
                                                                                                                    LinearLayout linearLayout2 = (LinearLayout) n50.qoPGr6Ce(inflate, R.id.prefilter_row);
                                                                                                                    if (linearLayout2 != null) {
                                                                                                                        i = R.id.results_count;
                                                                                                                        TextView textView7 = (TextView) n50.qoPGr6Ce(inflate, R.id.results_count);
                                                                                                                        if (textView7 != null) {
                                                                                                                            i = R.id.scope_scroll;
                                                                                                                            if (((HorizontalScrollView) n50.qoPGr6Ce(inflate, R.id.scope_scroll)) != null) {
                                                                                                                                i = R.id.scope_title;
                                                                                                                                if (((TextView) n50.qoPGr6Ce(inflate, R.id.scope_title)) != null) {
                                                                                                                                    i = R.id.search_clear;
                                                                                                                                    ImageView imageView2 = (ImageView) n50.qoPGr6Ce(inflate, R.id.search_clear);
                                                                                                                                    if (imageView2 != null) {
                                                                                                                                        i = R.id.search_container;
                                                                                                                                        if (((LinearLayout) n50.qoPGr6Ce(inflate, R.id.search_container)) != null) {
                                                                                                                                            i = R.id.search_icon;
                                                                                                                                            if (((ImageView) n50.qoPGr6Ce(inflate, R.id.search_icon)) != null) {
                                                                                                                                                i = R.id.search_input;
                                                                                                                                                EditText editText = (EditText) n50.qoPGr6Ce(inflate, R.id.search_input);
                                                                                                                                                if (editText != null) {
                                                                                                                                                    i = R.id.sort_name;
                                                                                                                                                    TextView textView8 = (TextView) n50.qoPGr6Ce(inflate, R.id.sort_name);
                                                                                                                                                    if (textView8 != null) {
                                                                                                                                                        i = R.id.sort_novelty;
                                                                                                                                                        TextView textView9 = (TextView) n50.qoPGr6Ce(inflate, R.id.sort_novelty);
                                                                                                                                                        if (textView9 != null) {
                                                                                                                                                            i = R.id.sort_popularity;
                                                                                                                                                            TextView textView10 = (TextView) n50.qoPGr6Ce(inflate, R.id.sort_popularity);
                                                                                                                                                            if (textView10 != null) {
                                                                                                                                                                i = R.id.sort_title;
                                                                                                                                                                if (((TextView) n50.qoPGr6Ce(inflate, R.id.sort_title)) != null) {
                                                                                                                                                                    i = R.id.tags_list;
                                                                                                                                                                    RecyclerView recyclerView4 = (RecyclerView) n50.qoPGr6Ce(inflate, R.id.tags_list);
                                                                                                                                                                    if (recyclerView4 != null) {
                                                                                                                                                                        i = R.id.tags_title;
                                                                                                                                                                        if (((TextView) n50.qoPGr6Ce(inflate, R.id.tags_title)) != null) {
                                                                                                                                                                            ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                                                                                                                                                                            this.pP9Y2m6O = new sj(constraintLayout, chip, chip2, chip3, chip4, chip5, frameLayout, textView, recyclerView, nestedScrollView, textView2, textView3, textView4, recyclerView2, textView5, linearLayout, recyclerView3, NCTxEWno, NCTxEWno2, imageView, appCompatButton, textView6, linearLayout2, textView7, imageView2, editText, textView8, textView9, textView10, recyclerView4);
                                                                                                                                                                            constraintLayout.getClass();
                                                                                                                                                                            return constraintLayout;
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }

    @Override // defpackage.li
    public final Context eVhOlqcC() {
        if (super.eVhOlqcC() == null && !this.g2aRJUAd) {
            return null;
        }
        N8VPGzVC();
        return this.TrssYQ34;
    }

    public final wx nSmgoSB5() {
        return (wx) this.tef3qNMP.getValue();
    }

    @Override // defpackage.li, defpackage.gm
    public final rg0 wxUZMvaN() {
        return le0.OxcuoDLp(this, super.wxUZMvaN());
    }

    @Override // defpackage.li
    public final void ytu5o6f4(View view) {
        final int i;
        view.getClass();
        sj sjVar = this.pP9Y2m6O;
        sjVar.getClass();
        g9 g9Var = null;
        sjVar.sjUBp5pO.setItemAnimator(null);
        sj sjVar2 = this.pP9Y2m6O;
        sjVar2.getClass();
        sjVar2.sjUBp5pO.setAdapter(this.Wi7iiXC4);
        sj sjVar3 = this.pP9Y2m6O;
        sjVar3.getClass();
        sjVar3.i7xS8jrb.setItemAnimator(null);
        sj sjVar4 = this.pP9Y2m6O;
        sjVar4.getClass();
        RecyclerView recyclerView = sjVar4.i7xS8jrb;
        u6 u6Var = this.QT4Tf9Dt;
        recyclerView.setAdapter(u6Var);
        sj sjVar5 = this.pP9Y2m6O;
        sjVar5.getClass();
        sjVar5.Qr9iLBAD.setItemAnimator(null);
        sj sjVar6 = this.pP9Y2m6O;
        sjVar6.getClass();
        sjVar6.Qr9iLBAD.setAdapter(this.dHozS53r);
        sj sjVar7 = this.pP9Y2m6O;
        sjVar7.getClass();
        sjVar7.OnDfzHZD.setItemAnimator(null);
        sj sjVar8 = this.pP9Y2m6O;
        sjVar8.getClass();
        sjVar8.OnDfzHZD.setAdapter(this.orhfF2Ya);
        u6Var.VgvYg0wo(f7oeun2L);
        sj sjVar9 = this.pP9Y2m6O;
        sjVar9.getClass();
        sjVar9.WYNAV5pd.addTextChangedListener(new nx(this));
        sj sjVar10 = this.pP9Y2m6O;
        sjVar10.getClass();
        final int i2 = 5;
        sjVar10.gjV1z5T1.setOnClickListener(new View.OnClickListener(this) { // from class: jx
            public final /* synthetic */ PairShelfFragment MdtA4re8;

            {
                this.MdtA4re8 = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i3 = i2;
                PairShelfFragment pairShelfFragment = this.MdtA4re8;
                switch (i3) {
                    case 0:
                        List list = PairShelfFragment.f7oeun2L;
                        x90 x90Var = pairShelfFragment.nSmgoSB5().VgvYg0wo;
                        x90Var.getClass();
                        x90Var.eVhOlqcC(null, q3.NCTxEWno);
                        break;
                    case 1:
                        List list2 = PairShelfFragment.f7oeun2L;
                        x90 x90Var2 = pairShelfFragment.nSmgoSB5().VgvYg0wo;
                        x90Var2.getClass();
                        x90Var2.eVhOlqcC(null, q3.MdtA4re8);
                        break;
                    case 2:
                        List list3 = PairShelfFragment.f7oeun2L;
                        x90 x90Var3 = pairShelfFragment.nSmgoSB5().VgvYg0wo;
                        x90Var3.getClass();
                        x90Var3.eVhOlqcC(null, q3.wxUZMvaN);
                        break;
                    case 3:
                        sj sjVar11 = pairShelfFragment.pP9Y2m6O;
                        sjVar11.getClass();
                        sjVar11.P7K7Inc8.setVisibility(8);
                        break;
                    case 4:
                        sj sjVar12 = pairShelfFragment.pP9Y2m6O;
                        sjVar12.getClass();
                        sjVar12.P7K7Inc8.setVisibility(8);
                        break;
                    case 5:
                        sj sjVar13 = pairShelfFragment.pP9Y2m6O;
                        sjVar13.getClass();
                        sjVar13.WYNAV5pd.setText((CharSequence) null);
                        wx nSmgoSB5 = pairShelfFragment.nSmgoSB5();
                        nSmgoSB5.P7K7Inc8.jb9XjC4I(null);
                        x90 x90Var4 = nSmgoSB5.NCTxEWno;
                        x90Var4.getClass();
                        x90Var4.eVhOlqcC(null, "");
                        break;
                    case 6:
                        sj sjVar14 = pairShelfFragment.pP9Y2m6O;
                        sjVar14.getClass();
                        sjVar14.WYNAV5pd.setText((CharSequence) null);
                        wx nSmgoSB52 = pairShelfFragment.nSmgoSB5();
                        nSmgoSB52.P7K7Inc8.jb9XjC4I(null);
                        x90 x90Var5 = nSmgoSB52.NCTxEWno;
                        x90Var5.getClass();
                        x90Var5.eVhOlqcC(null, "");
                        break;
                    case 7:
                        List list4 = PairShelfFragment.f7oeun2L;
                        x90 x90Var6 = pairShelfFragment.nSmgoSB5().wxUZMvaN;
                        x90Var6.getClass();
                        x90Var6.eVhOlqcC(null, a4.NCTxEWno);
                        break;
                    case 8:
                        List list5 = PairShelfFragment.f7oeun2L;
                        x90 x90Var7 = pairShelfFragment.nSmgoSB5().wxUZMvaN;
                        x90Var7.getClass();
                        x90Var7.eVhOlqcC(null, a4.MdtA4re8);
                        break;
                    default:
                        List list6 = PairShelfFragment.f7oeun2L;
                        x90 x90Var8 = pairShelfFragment.nSmgoSB5().wxUZMvaN;
                        x90Var8.getClass();
                        x90Var8.eVhOlqcC(null, a4.wxUZMvaN);
                        break;
                }
            }
        });
        Iterator it = HdOGZAzC().iterator();
        while (true) {
            i = 4;
            if (!it.hasNext()) {
                break;
            }
            hx hxVar = (hx) it.next();
            ((Chip) hxVar.NCTxEWno).setOnClickListener(new s6(this, i, (String) hxVar.MdtA4re8));
        }
        sj sjVar11 = this.pP9Y2m6O;
        sjVar11.getClass();
        final int i3 = 6;
        sjVar11.Ey6iv0m0.setOnClickListener(new View.OnClickListener(this) { // from class: jx
            public final /* synthetic */ PairShelfFragment MdtA4re8;

            {
                this.MdtA4re8 = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i32 = i3;
                PairShelfFragment pairShelfFragment = this.MdtA4re8;
                switch (i32) {
                    case 0:
                        List list = PairShelfFragment.f7oeun2L;
                        x90 x90Var = pairShelfFragment.nSmgoSB5().VgvYg0wo;
                        x90Var.getClass();
                        x90Var.eVhOlqcC(null, q3.NCTxEWno);
                        break;
                    case 1:
                        List list2 = PairShelfFragment.f7oeun2L;
                        x90 x90Var2 = pairShelfFragment.nSmgoSB5().VgvYg0wo;
                        x90Var2.getClass();
                        x90Var2.eVhOlqcC(null, q3.MdtA4re8);
                        break;
                    case 2:
                        List list3 = PairShelfFragment.f7oeun2L;
                        x90 x90Var3 = pairShelfFragment.nSmgoSB5().VgvYg0wo;
                        x90Var3.getClass();
                        x90Var3.eVhOlqcC(null, q3.wxUZMvaN);
                        break;
                    case 3:
                        sj sjVar112 = pairShelfFragment.pP9Y2m6O;
                        sjVar112.getClass();
                        sjVar112.P7K7Inc8.setVisibility(8);
                        break;
                    case 4:
                        sj sjVar12 = pairShelfFragment.pP9Y2m6O;
                        sjVar12.getClass();
                        sjVar12.P7K7Inc8.setVisibility(8);
                        break;
                    case 5:
                        sj sjVar13 = pairShelfFragment.pP9Y2m6O;
                        sjVar13.getClass();
                        sjVar13.WYNAV5pd.setText((CharSequence) null);
                        wx nSmgoSB5 = pairShelfFragment.nSmgoSB5();
                        nSmgoSB5.P7K7Inc8.jb9XjC4I(null);
                        x90 x90Var4 = nSmgoSB5.NCTxEWno;
                        x90Var4.getClass();
                        x90Var4.eVhOlqcC(null, "");
                        break;
                    case 6:
                        sj sjVar14 = pairShelfFragment.pP9Y2m6O;
                        sjVar14.getClass();
                        sjVar14.WYNAV5pd.setText((CharSequence) null);
                        wx nSmgoSB52 = pairShelfFragment.nSmgoSB5();
                        nSmgoSB52.P7K7Inc8.jb9XjC4I(null);
                        x90 x90Var5 = nSmgoSB52.NCTxEWno;
                        x90Var5.getClass();
                        x90Var5.eVhOlqcC(null, "");
                        break;
                    case 7:
                        List list4 = PairShelfFragment.f7oeun2L;
                        x90 x90Var6 = pairShelfFragment.nSmgoSB5().wxUZMvaN;
                        x90Var6.getClass();
                        x90Var6.eVhOlqcC(null, a4.NCTxEWno);
                        break;
                    case 8:
                        List list5 = PairShelfFragment.f7oeun2L;
                        x90 x90Var7 = pairShelfFragment.nSmgoSB5().wxUZMvaN;
                        x90Var7.getClass();
                        x90Var7.eVhOlqcC(null, a4.MdtA4re8);
                        break;
                    default:
                        List list6 = PairShelfFragment.f7oeun2L;
                        x90 x90Var8 = pairShelfFragment.nSmgoSB5().wxUZMvaN;
                        x90Var8.getClass();
                        x90Var8.eVhOlqcC(null, a4.wxUZMvaN);
                        break;
                }
            }
        });
        sj sjVar12 = this.pP9Y2m6O;
        sjVar12.getClass();
        final int i4 = 7;
        sjVar12.DK9slbsy.setOnClickListener(new View.OnClickListener(this) { // from class: jx
            public final /* synthetic */ PairShelfFragment MdtA4re8;

            {
                this.MdtA4re8 = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i32 = i4;
                PairShelfFragment pairShelfFragment = this.MdtA4re8;
                switch (i32) {
                    case 0:
                        List list = PairShelfFragment.f7oeun2L;
                        x90 x90Var = pairShelfFragment.nSmgoSB5().VgvYg0wo;
                        x90Var.getClass();
                        x90Var.eVhOlqcC(null, q3.NCTxEWno);
                        break;
                    case 1:
                        List list2 = PairShelfFragment.f7oeun2L;
                        x90 x90Var2 = pairShelfFragment.nSmgoSB5().VgvYg0wo;
                        x90Var2.getClass();
                        x90Var2.eVhOlqcC(null, q3.MdtA4re8);
                        break;
                    case 2:
                        List list3 = PairShelfFragment.f7oeun2L;
                        x90 x90Var3 = pairShelfFragment.nSmgoSB5().VgvYg0wo;
                        x90Var3.getClass();
                        x90Var3.eVhOlqcC(null, q3.wxUZMvaN);
                        break;
                    case 3:
                        sj sjVar112 = pairShelfFragment.pP9Y2m6O;
                        sjVar112.getClass();
                        sjVar112.P7K7Inc8.setVisibility(8);
                        break;
                    case 4:
                        sj sjVar122 = pairShelfFragment.pP9Y2m6O;
                        sjVar122.getClass();
                        sjVar122.P7K7Inc8.setVisibility(8);
                        break;
                    case 5:
                        sj sjVar13 = pairShelfFragment.pP9Y2m6O;
                        sjVar13.getClass();
                        sjVar13.WYNAV5pd.setText((CharSequence) null);
                        wx nSmgoSB5 = pairShelfFragment.nSmgoSB5();
                        nSmgoSB5.P7K7Inc8.jb9XjC4I(null);
                        x90 x90Var4 = nSmgoSB5.NCTxEWno;
                        x90Var4.getClass();
                        x90Var4.eVhOlqcC(null, "");
                        break;
                    case 6:
                        sj sjVar14 = pairShelfFragment.pP9Y2m6O;
                        sjVar14.getClass();
                        sjVar14.WYNAV5pd.setText((CharSequence) null);
                        wx nSmgoSB52 = pairShelfFragment.nSmgoSB5();
                        nSmgoSB52.P7K7Inc8.jb9XjC4I(null);
                        x90 x90Var5 = nSmgoSB52.NCTxEWno;
                        x90Var5.getClass();
                        x90Var5.eVhOlqcC(null, "");
                        break;
                    case 7:
                        List list4 = PairShelfFragment.f7oeun2L;
                        x90 x90Var6 = pairShelfFragment.nSmgoSB5().wxUZMvaN;
                        x90Var6.getClass();
                        x90Var6.eVhOlqcC(null, a4.NCTxEWno);
                        break;
                    case 8:
                        List list5 = PairShelfFragment.f7oeun2L;
                        x90 x90Var7 = pairShelfFragment.nSmgoSB5().wxUZMvaN;
                        x90Var7.getClass();
                        x90Var7.eVhOlqcC(null, a4.MdtA4re8);
                        break;
                    default:
                        List list6 = PairShelfFragment.f7oeun2L;
                        x90 x90Var8 = pairShelfFragment.nSmgoSB5().wxUZMvaN;
                        x90Var8.getClass();
                        x90Var8.eVhOlqcC(null, a4.wxUZMvaN);
                        break;
                }
            }
        });
        sj sjVar13 = this.pP9Y2m6O;
        sjVar13.getClass();
        final int i5 = 8;
        sjVar13.lwWCatUu.setOnClickListener(new View.OnClickListener(this) { // from class: jx
            public final /* synthetic */ PairShelfFragment MdtA4re8;

            {
                this.MdtA4re8 = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i32 = i5;
                PairShelfFragment pairShelfFragment = this.MdtA4re8;
                switch (i32) {
                    case 0:
                        List list = PairShelfFragment.f7oeun2L;
                        x90 x90Var = pairShelfFragment.nSmgoSB5().VgvYg0wo;
                        x90Var.getClass();
                        x90Var.eVhOlqcC(null, q3.NCTxEWno);
                        break;
                    case 1:
                        List list2 = PairShelfFragment.f7oeun2L;
                        x90 x90Var2 = pairShelfFragment.nSmgoSB5().VgvYg0wo;
                        x90Var2.getClass();
                        x90Var2.eVhOlqcC(null, q3.MdtA4re8);
                        break;
                    case 2:
                        List list3 = PairShelfFragment.f7oeun2L;
                        x90 x90Var3 = pairShelfFragment.nSmgoSB5().VgvYg0wo;
                        x90Var3.getClass();
                        x90Var3.eVhOlqcC(null, q3.wxUZMvaN);
                        break;
                    case 3:
                        sj sjVar112 = pairShelfFragment.pP9Y2m6O;
                        sjVar112.getClass();
                        sjVar112.P7K7Inc8.setVisibility(8);
                        break;
                    case 4:
                        sj sjVar122 = pairShelfFragment.pP9Y2m6O;
                        sjVar122.getClass();
                        sjVar122.P7K7Inc8.setVisibility(8);
                        break;
                    case 5:
                        sj sjVar132 = pairShelfFragment.pP9Y2m6O;
                        sjVar132.getClass();
                        sjVar132.WYNAV5pd.setText((CharSequence) null);
                        wx nSmgoSB5 = pairShelfFragment.nSmgoSB5();
                        nSmgoSB5.P7K7Inc8.jb9XjC4I(null);
                        x90 x90Var4 = nSmgoSB5.NCTxEWno;
                        x90Var4.getClass();
                        x90Var4.eVhOlqcC(null, "");
                        break;
                    case 6:
                        sj sjVar14 = pairShelfFragment.pP9Y2m6O;
                        sjVar14.getClass();
                        sjVar14.WYNAV5pd.setText((CharSequence) null);
                        wx nSmgoSB52 = pairShelfFragment.nSmgoSB5();
                        nSmgoSB52.P7K7Inc8.jb9XjC4I(null);
                        x90 x90Var5 = nSmgoSB52.NCTxEWno;
                        x90Var5.getClass();
                        x90Var5.eVhOlqcC(null, "");
                        break;
                    case 7:
                        List list4 = PairShelfFragment.f7oeun2L;
                        x90 x90Var6 = pairShelfFragment.nSmgoSB5().wxUZMvaN;
                        x90Var6.getClass();
                        x90Var6.eVhOlqcC(null, a4.NCTxEWno);
                        break;
                    case 8:
                        List list5 = PairShelfFragment.f7oeun2L;
                        x90 x90Var7 = pairShelfFragment.nSmgoSB5().wxUZMvaN;
                        x90Var7.getClass();
                        x90Var7.eVhOlqcC(null, a4.MdtA4re8);
                        break;
                    default:
                        List list6 = PairShelfFragment.f7oeun2L;
                        x90 x90Var8 = pairShelfFragment.nSmgoSB5().wxUZMvaN;
                        x90Var8.getClass();
                        x90Var8.eVhOlqcC(null, a4.wxUZMvaN);
                        break;
                }
            }
        });
        sj sjVar14 = this.pP9Y2m6O;
        sjVar14.getClass();
        final int i6 = 9;
        sjVar14.U0LaHZX7.setOnClickListener(new View.OnClickListener(this) { // from class: jx
            public final /* synthetic */ PairShelfFragment MdtA4re8;

            {
                this.MdtA4re8 = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i32 = i6;
                PairShelfFragment pairShelfFragment = this.MdtA4re8;
                switch (i32) {
                    case 0:
                        List list = PairShelfFragment.f7oeun2L;
                        x90 x90Var = pairShelfFragment.nSmgoSB5().VgvYg0wo;
                        x90Var.getClass();
                        x90Var.eVhOlqcC(null, q3.NCTxEWno);
                        break;
                    case 1:
                        List list2 = PairShelfFragment.f7oeun2L;
                        x90 x90Var2 = pairShelfFragment.nSmgoSB5().VgvYg0wo;
                        x90Var2.getClass();
                        x90Var2.eVhOlqcC(null, q3.MdtA4re8);
                        break;
                    case 2:
                        List list3 = PairShelfFragment.f7oeun2L;
                        x90 x90Var3 = pairShelfFragment.nSmgoSB5().VgvYg0wo;
                        x90Var3.getClass();
                        x90Var3.eVhOlqcC(null, q3.wxUZMvaN);
                        break;
                    case 3:
                        sj sjVar112 = pairShelfFragment.pP9Y2m6O;
                        sjVar112.getClass();
                        sjVar112.P7K7Inc8.setVisibility(8);
                        break;
                    case 4:
                        sj sjVar122 = pairShelfFragment.pP9Y2m6O;
                        sjVar122.getClass();
                        sjVar122.P7K7Inc8.setVisibility(8);
                        break;
                    case 5:
                        sj sjVar132 = pairShelfFragment.pP9Y2m6O;
                        sjVar132.getClass();
                        sjVar132.WYNAV5pd.setText((CharSequence) null);
                        wx nSmgoSB5 = pairShelfFragment.nSmgoSB5();
                        nSmgoSB5.P7K7Inc8.jb9XjC4I(null);
                        x90 x90Var4 = nSmgoSB5.NCTxEWno;
                        x90Var4.getClass();
                        x90Var4.eVhOlqcC(null, "");
                        break;
                    case 6:
                        sj sjVar142 = pairShelfFragment.pP9Y2m6O;
                        sjVar142.getClass();
                        sjVar142.WYNAV5pd.setText((CharSequence) null);
                        wx nSmgoSB52 = pairShelfFragment.nSmgoSB5();
                        nSmgoSB52.P7K7Inc8.jb9XjC4I(null);
                        x90 x90Var5 = nSmgoSB52.NCTxEWno;
                        x90Var5.getClass();
                        x90Var5.eVhOlqcC(null, "");
                        break;
                    case 7:
                        List list4 = PairShelfFragment.f7oeun2L;
                        x90 x90Var6 = pairShelfFragment.nSmgoSB5().wxUZMvaN;
                        x90Var6.getClass();
                        x90Var6.eVhOlqcC(null, a4.NCTxEWno);
                        break;
                    case 8:
                        List list5 = PairShelfFragment.f7oeun2L;
                        x90 x90Var7 = pairShelfFragment.nSmgoSB5().wxUZMvaN;
                        x90Var7.getClass();
                        x90Var7.eVhOlqcC(null, a4.MdtA4re8);
                        break;
                    default:
                        List list6 = PairShelfFragment.f7oeun2L;
                        x90 x90Var8 = pairShelfFragment.nSmgoSB5().wxUZMvaN;
                        x90Var8.getClass();
                        x90Var8.eVhOlqcC(null, a4.wxUZMvaN);
                        break;
                }
            }
        });
        sj sjVar15 = this.pP9Y2m6O;
        sjVar15.getClass();
        final int i7 = 0;
        sjVar15.eVhOlqcC.setOnClickListener(new View.OnClickListener(this) { // from class: jx
            public final /* synthetic */ PairShelfFragment MdtA4re8;

            {
                this.MdtA4re8 = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i32 = i7;
                PairShelfFragment pairShelfFragment = this.MdtA4re8;
                switch (i32) {
                    case 0:
                        List list = PairShelfFragment.f7oeun2L;
                        x90 x90Var = pairShelfFragment.nSmgoSB5().VgvYg0wo;
                        x90Var.getClass();
                        x90Var.eVhOlqcC(null, q3.NCTxEWno);
                        break;
                    case 1:
                        List list2 = PairShelfFragment.f7oeun2L;
                        x90 x90Var2 = pairShelfFragment.nSmgoSB5().VgvYg0wo;
                        x90Var2.getClass();
                        x90Var2.eVhOlqcC(null, q3.MdtA4re8);
                        break;
                    case 2:
                        List list3 = PairShelfFragment.f7oeun2L;
                        x90 x90Var3 = pairShelfFragment.nSmgoSB5().VgvYg0wo;
                        x90Var3.getClass();
                        x90Var3.eVhOlqcC(null, q3.wxUZMvaN);
                        break;
                    case 3:
                        sj sjVar112 = pairShelfFragment.pP9Y2m6O;
                        sjVar112.getClass();
                        sjVar112.P7K7Inc8.setVisibility(8);
                        break;
                    case 4:
                        sj sjVar122 = pairShelfFragment.pP9Y2m6O;
                        sjVar122.getClass();
                        sjVar122.P7K7Inc8.setVisibility(8);
                        break;
                    case 5:
                        sj sjVar132 = pairShelfFragment.pP9Y2m6O;
                        sjVar132.getClass();
                        sjVar132.WYNAV5pd.setText((CharSequence) null);
                        wx nSmgoSB5 = pairShelfFragment.nSmgoSB5();
                        nSmgoSB5.P7K7Inc8.jb9XjC4I(null);
                        x90 x90Var4 = nSmgoSB5.NCTxEWno;
                        x90Var4.getClass();
                        x90Var4.eVhOlqcC(null, "");
                        break;
                    case 6:
                        sj sjVar142 = pairShelfFragment.pP9Y2m6O;
                        sjVar142.getClass();
                        sjVar142.WYNAV5pd.setText((CharSequence) null);
                        wx nSmgoSB52 = pairShelfFragment.nSmgoSB5();
                        nSmgoSB52.P7K7Inc8.jb9XjC4I(null);
                        x90 x90Var5 = nSmgoSB52.NCTxEWno;
                        x90Var5.getClass();
                        x90Var5.eVhOlqcC(null, "");
                        break;
                    case 7:
                        List list4 = PairShelfFragment.f7oeun2L;
                        x90 x90Var6 = pairShelfFragment.nSmgoSB5().wxUZMvaN;
                        x90Var6.getClass();
                        x90Var6.eVhOlqcC(null, a4.NCTxEWno);
                        break;
                    case 8:
                        List list5 = PairShelfFragment.f7oeun2L;
                        x90 x90Var7 = pairShelfFragment.nSmgoSB5().wxUZMvaN;
                        x90Var7.getClass();
                        x90Var7.eVhOlqcC(null, a4.MdtA4re8);
                        break;
                    default:
                        List list6 = PairShelfFragment.f7oeun2L;
                        x90 x90Var8 = pairShelfFragment.nSmgoSB5().wxUZMvaN;
                        x90Var8.getClass();
                        x90Var8.eVhOlqcC(null, a4.wxUZMvaN);
                        break;
                }
            }
        });
        sj sjVar16 = this.pP9Y2m6O;
        sjVar16.getClass();
        final int i8 = 1;
        sjVar16.ow5vqvCr.setOnClickListener(new View.OnClickListener(this) { // from class: jx
            public final /* synthetic */ PairShelfFragment MdtA4re8;

            {
                this.MdtA4re8 = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i32 = i8;
                PairShelfFragment pairShelfFragment = this.MdtA4re8;
                switch (i32) {
                    case 0:
                        List list = PairShelfFragment.f7oeun2L;
                        x90 x90Var = pairShelfFragment.nSmgoSB5().VgvYg0wo;
                        x90Var.getClass();
                        x90Var.eVhOlqcC(null, q3.NCTxEWno);
                        break;
                    case 1:
                        List list2 = PairShelfFragment.f7oeun2L;
                        x90 x90Var2 = pairShelfFragment.nSmgoSB5().VgvYg0wo;
                        x90Var2.getClass();
                        x90Var2.eVhOlqcC(null, q3.MdtA4re8);
                        break;
                    case 2:
                        List list3 = PairShelfFragment.f7oeun2L;
                        x90 x90Var3 = pairShelfFragment.nSmgoSB5().VgvYg0wo;
                        x90Var3.getClass();
                        x90Var3.eVhOlqcC(null, q3.wxUZMvaN);
                        break;
                    case 3:
                        sj sjVar112 = pairShelfFragment.pP9Y2m6O;
                        sjVar112.getClass();
                        sjVar112.P7K7Inc8.setVisibility(8);
                        break;
                    case 4:
                        sj sjVar122 = pairShelfFragment.pP9Y2m6O;
                        sjVar122.getClass();
                        sjVar122.P7K7Inc8.setVisibility(8);
                        break;
                    case 5:
                        sj sjVar132 = pairShelfFragment.pP9Y2m6O;
                        sjVar132.getClass();
                        sjVar132.WYNAV5pd.setText((CharSequence) null);
                        wx nSmgoSB5 = pairShelfFragment.nSmgoSB5();
                        nSmgoSB5.P7K7Inc8.jb9XjC4I(null);
                        x90 x90Var4 = nSmgoSB5.NCTxEWno;
                        x90Var4.getClass();
                        x90Var4.eVhOlqcC(null, "");
                        break;
                    case 6:
                        sj sjVar142 = pairShelfFragment.pP9Y2m6O;
                        sjVar142.getClass();
                        sjVar142.WYNAV5pd.setText((CharSequence) null);
                        wx nSmgoSB52 = pairShelfFragment.nSmgoSB5();
                        nSmgoSB52.P7K7Inc8.jb9XjC4I(null);
                        x90 x90Var5 = nSmgoSB52.NCTxEWno;
                        x90Var5.getClass();
                        x90Var5.eVhOlqcC(null, "");
                        break;
                    case 7:
                        List list4 = PairShelfFragment.f7oeun2L;
                        x90 x90Var6 = pairShelfFragment.nSmgoSB5().wxUZMvaN;
                        x90Var6.getClass();
                        x90Var6.eVhOlqcC(null, a4.NCTxEWno);
                        break;
                    case 8:
                        List list5 = PairShelfFragment.f7oeun2L;
                        x90 x90Var7 = pairShelfFragment.nSmgoSB5().wxUZMvaN;
                        x90Var7.getClass();
                        x90Var7.eVhOlqcC(null, a4.MdtA4re8);
                        break;
                    default:
                        List list6 = PairShelfFragment.f7oeun2L;
                        x90 x90Var8 = pairShelfFragment.nSmgoSB5().wxUZMvaN;
                        x90Var8.getClass();
                        x90Var8.eVhOlqcC(null, a4.wxUZMvaN);
                        break;
                }
            }
        });
        sj sjVar17 = this.pP9Y2m6O;
        sjVar17.getClass();
        final int i9 = 2;
        sjVar17.k3x7lurq.setOnClickListener(new View.OnClickListener(this) { // from class: jx
            public final /* synthetic */ PairShelfFragment MdtA4re8;

            {
                this.MdtA4re8 = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i32 = i9;
                PairShelfFragment pairShelfFragment = this.MdtA4re8;
                switch (i32) {
                    case 0:
                        List list = PairShelfFragment.f7oeun2L;
                        x90 x90Var = pairShelfFragment.nSmgoSB5().VgvYg0wo;
                        x90Var.getClass();
                        x90Var.eVhOlqcC(null, q3.NCTxEWno);
                        break;
                    case 1:
                        List list2 = PairShelfFragment.f7oeun2L;
                        x90 x90Var2 = pairShelfFragment.nSmgoSB5().VgvYg0wo;
                        x90Var2.getClass();
                        x90Var2.eVhOlqcC(null, q3.MdtA4re8);
                        break;
                    case 2:
                        List list3 = PairShelfFragment.f7oeun2L;
                        x90 x90Var3 = pairShelfFragment.nSmgoSB5().VgvYg0wo;
                        x90Var3.getClass();
                        x90Var3.eVhOlqcC(null, q3.wxUZMvaN);
                        break;
                    case 3:
                        sj sjVar112 = pairShelfFragment.pP9Y2m6O;
                        sjVar112.getClass();
                        sjVar112.P7K7Inc8.setVisibility(8);
                        break;
                    case 4:
                        sj sjVar122 = pairShelfFragment.pP9Y2m6O;
                        sjVar122.getClass();
                        sjVar122.P7K7Inc8.setVisibility(8);
                        break;
                    case 5:
                        sj sjVar132 = pairShelfFragment.pP9Y2m6O;
                        sjVar132.getClass();
                        sjVar132.WYNAV5pd.setText((CharSequence) null);
                        wx nSmgoSB5 = pairShelfFragment.nSmgoSB5();
                        nSmgoSB5.P7K7Inc8.jb9XjC4I(null);
                        x90 x90Var4 = nSmgoSB5.NCTxEWno;
                        x90Var4.getClass();
                        x90Var4.eVhOlqcC(null, "");
                        break;
                    case 6:
                        sj sjVar142 = pairShelfFragment.pP9Y2m6O;
                        sjVar142.getClass();
                        sjVar142.WYNAV5pd.setText((CharSequence) null);
                        wx nSmgoSB52 = pairShelfFragment.nSmgoSB5();
                        nSmgoSB52.P7K7Inc8.jb9XjC4I(null);
                        x90 x90Var5 = nSmgoSB52.NCTxEWno;
                        x90Var5.getClass();
                        x90Var5.eVhOlqcC(null, "");
                        break;
                    case 7:
                        List list4 = PairShelfFragment.f7oeun2L;
                        x90 x90Var6 = pairShelfFragment.nSmgoSB5().wxUZMvaN;
                        x90Var6.getClass();
                        x90Var6.eVhOlqcC(null, a4.NCTxEWno);
                        break;
                    case 8:
                        List list5 = PairShelfFragment.f7oeun2L;
                        x90 x90Var7 = pairShelfFragment.nSmgoSB5().wxUZMvaN;
                        x90Var7.getClass();
                        x90Var7.eVhOlqcC(null, a4.MdtA4re8);
                        break;
                    default:
                        List list6 = PairShelfFragment.f7oeun2L;
                        x90 x90Var8 = pairShelfFragment.nSmgoSB5().wxUZMvaN;
                        x90Var8.getClass();
                        x90Var8.eVhOlqcC(null, a4.wxUZMvaN);
                        break;
                }
            }
        });
        sj sjVar18 = this.pP9Y2m6O;
        sjVar18.getClass();
        sjVar18.jb9XjC4I.setOnScrollChangeListener(new wm(this));
        sj sjVar19 = this.pP9Y2m6O;
        sjVar19.getClass();
        final int i10 = 3;
        sjVar19.KlHjfFWx.setOnClickListener(new View.OnClickListener(this) { // from class: jx
            public final /* synthetic */ PairShelfFragment MdtA4re8;

            {
                this.MdtA4re8 = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i32 = i10;
                PairShelfFragment pairShelfFragment = this.MdtA4re8;
                switch (i32) {
                    case 0:
                        List list = PairShelfFragment.f7oeun2L;
                        x90 x90Var = pairShelfFragment.nSmgoSB5().VgvYg0wo;
                        x90Var.getClass();
                        x90Var.eVhOlqcC(null, q3.NCTxEWno);
                        break;
                    case 1:
                        List list2 = PairShelfFragment.f7oeun2L;
                        x90 x90Var2 = pairShelfFragment.nSmgoSB5().VgvYg0wo;
                        x90Var2.getClass();
                        x90Var2.eVhOlqcC(null, q3.MdtA4re8);
                        break;
                    case 2:
                        List list3 = PairShelfFragment.f7oeun2L;
                        x90 x90Var3 = pairShelfFragment.nSmgoSB5().VgvYg0wo;
                        x90Var3.getClass();
                        x90Var3.eVhOlqcC(null, q3.wxUZMvaN);
                        break;
                    case 3:
                        sj sjVar112 = pairShelfFragment.pP9Y2m6O;
                        sjVar112.getClass();
                        sjVar112.P7K7Inc8.setVisibility(8);
                        break;
                    case 4:
                        sj sjVar122 = pairShelfFragment.pP9Y2m6O;
                        sjVar122.getClass();
                        sjVar122.P7K7Inc8.setVisibility(8);
                        break;
                    case 5:
                        sj sjVar132 = pairShelfFragment.pP9Y2m6O;
                        sjVar132.getClass();
                        sjVar132.WYNAV5pd.setText((CharSequence) null);
                        wx nSmgoSB5 = pairShelfFragment.nSmgoSB5();
                        nSmgoSB5.P7K7Inc8.jb9XjC4I(null);
                        x90 x90Var4 = nSmgoSB5.NCTxEWno;
                        x90Var4.getClass();
                        x90Var4.eVhOlqcC(null, "");
                        break;
                    case 6:
                        sj sjVar142 = pairShelfFragment.pP9Y2m6O;
                        sjVar142.getClass();
                        sjVar142.WYNAV5pd.setText((CharSequence) null);
                        wx nSmgoSB52 = pairShelfFragment.nSmgoSB5();
                        nSmgoSB52.P7K7Inc8.jb9XjC4I(null);
                        x90 x90Var5 = nSmgoSB52.NCTxEWno;
                        x90Var5.getClass();
                        x90Var5.eVhOlqcC(null, "");
                        break;
                    case 7:
                        List list4 = PairShelfFragment.f7oeun2L;
                        x90 x90Var6 = pairShelfFragment.nSmgoSB5().wxUZMvaN;
                        x90Var6.getClass();
                        x90Var6.eVhOlqcC(null, a4.NCTxEWno);
                        break;
                    case 8:
                        List list5 = PairShelfFragment.f7oeun2L;
                        x90 x90Var7 = pairShelfFragment.nSmgoSB5().wxUZMvaN;
                        x90Var7.getClass();
                        x90Var7.eVhOlqcC(null, a4.MdtA4re8);
                        break;
                    default:
                        List list6 = PairShelfFragment.f7oeun2L;
                        x90 x90Var8 = pairShelfFragment.nSmgoSB5().wxUZMvaN;
                        x90Var8.getClass();
                        x90Var8.eVhOlqcC(null, a4.wxUZMvaN);
                        break;
                }
            }
        });
        sj sjVar20 = this.pP9Y2m6O;
        sjVar20.getClass();
        sjVar20.P7K7Inc8.setOnClickListener(new View.OnClickListener(this) { // from class: jx
            public final /* synthetic */ PairShelfFragment MdtA4re8;

            {
                this.MdtA4re8 = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i32 = i;
                PairShelfFragment pairShelfFragment = this.MdtA4re8;
                switch (i32) {
                    case 0:
                        List list = PairShelfFragment.f7oeun2L;
                        x90 x90Var = pairShelfFragment.nSmgoSB5().VgvYg0wo;
                        x90Var.getClass();
                        x90Var.eVhOlqcC(null, q3.NCTxEWno);
                        break;
                    case 1:
                        List list2 = PairShelfFragment.f7oeun2L;
                        x90 x90Var2 = pairShelfFragment.nSmgoSB5().VgvYg0wo;
                        x90Var2.getClass();
                        x90Var2.eVhOlqcC(null, q3.MdtA4re8);
                        break;
                    case 2:
                        List list3 = PairShelfFragment.f7oeun2L;
                        x90 x90Var3 = pairShelfFragment.nSmgoSB5().VgvYg0wo;
                        x90Var3.getClass();
                        x90Var3.eVhOlqcC(null, q3.wxUZMvaN);
                        break;
                    case 3:
                        sj sjVar112 = pairShelfFragment.pP9Y2m6O;
                        sjVar112.getClass();
                        sjVar112.P7K7Inc8.setVisibility(8);
                        break;
                    case 4:
                        sj sjVar122 = pairShelfFragment.pP9Y2m6O;
                        sjVar122.getClass();
                        sjVar122.P7K7Inc8.setVisibility(8);
                        break;
                    case 5:
                        sj sjVar132 = pairShelfFragment.pP9Y2m6O;
                        sjVar132.getClass();
                        sjVar132.WYNAV5pd.setText((CharSequence) null);
                        wx nSmgoSB5 = pairShelfFragment.nSmgoSB5();
                        nSmgoSB5.P7K7Inc8.jb9XjC4I(null);
                        x90 x90Var4 = nSmgoSB5.NCTxEWno;
                        x90Var4.getClass();
                        x90Var4.eVhOlqcC(null, "");
                        break;
                    case 6:
                        sj sjVar142 = pairShelfFragment.pP9Y2m6O;
                        sjVar142.getClass();
                        sjVar142.WYNAV5pd.setText((CharSequence) null);
                        wx nSmgoSB52 = pairShelfFragment.nSmgoSB5();
                        nSmgoSB52.P7K7Inc8.jb9XjC4I(null);
                        x90 x90Var5 = nSmgoSB52.NCTxEWno;
                        x90Var5.getClass();
                        x90Var5.eVhOlqcC(null, "");
                        break;
                    case 7:
                        List list4 = PairShelfFragment.f7oeun2L;
                        x90 x90Var6 = pairShelfFragment.nSmgoSB5().wxUZMvaN;
                        x90Var6.getClass();
                        x90Var6.eVhOlqcC(null, a4.NCTxEWno);
                        break;
                    case 8:
                        List list5 = PairShelfFragment.f7oeun2L;
                        x90 x90Var7 = pairShelfFragment.nSmgoSB5().wxUZMvaN;
                        x90Var7.getClass();
                        x90Var7.eVhOlqcC(null, a4.MdtA4re8);
                        break;
                    default:
                        List list6 = PairShelfFragment.f7oeun2L;
                        x90 x90Var8 = pairShelfFragment.nSmgoSB5().wxUZMvaN;
                        x90Var8.getClass();
                        x90Var8.eVhOlqcC(null, a4.wxUZMvaN);
                        break;
                }
            }
        });
        kn knVar = this.Sjrx9cEN;
        x90 x90Var = ((fb0) knVar.getValue()).NCTxEWno;
        kb0 kb0Var = (kb0) x90Var.Qr9iLBAD();
        x90Var.jb9XjC4I(null);
        if (kb0Var != null) {
            wx nSmgoSB5 = nSmgoSB5();
            x90 x90Var2 = nSmgoSB5.P7K7Inc8;
            x90Var2.getClass();
            x90Var2.eVhOlqcC(null, kb0Var);
            x90 x90Var3 = nSmgoSB5.NCTxEWno;
            String str = kb0Var.NCTxEWno;
            x90Var3.getClass();
            x90Var3.eVhOlqcC(null, str);
        }
        x90 x90Var4 = ((fb0) knVar.getValue()).MdtA4re8;
        Boolean bool = (Boolean) x90Var4.Qr9iLBAD();
        bool.getClass();
        x90Var4.eVhOlqcC(null, Boolean.FALSE);
        if (bool.booleanValue()) {
            wx nSmgoSB52 = nSmgoSB5();
            nSmgoSB52.P7K7Inc8.jb9XjC4I(null);
            x90 x90Var5 = nSmgoSB52.NCTxEWno;
            x90Var5.getClass();
            x90Var5.eVhOlqcC(null, "");
            x90 x90Var6 = nSmgoSB52.MdtA4re8;
            x90Var6.getClass();
            x90Var6.eVhOlqcC(null, zf.NCTxEWno);
        }
        fn.Ey6iv0m0(ej0.FySoLYna(lDXGDhIF()), null, new mx(this, g9Var, i8), 3);
    }

    public final void zCflySGU(TextView textView, boolean z) {
        textView.setBackgroundResource(z ? R.drawable.bg_pill_accent : R.drawable.bg_pill_soft);
        textView.setTextColor(aZz0PFXp().getColor(z ? R.color.text_on_accent : R.color.text_secondary));
    }
}
