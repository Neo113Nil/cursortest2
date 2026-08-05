package com.kolosta.rejin.jilosa.presentation.ui;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.kolosta.rejin.jilosa.R;
import defpackage.ej0;
import defpackage.fn;
import defpackage.fo;
import defpackage.hd0;
import defpackage.ig0;
import defpackage.io;
import defpackage.j0;
import defpackage.kn;
import defpackage.le0;
import defpackage.li;
import defpackage.m20;
import defpackage.n50;
import defpackage.px;
import defpackage.qx;
import defpackage.rg0;
import defpackage.rx;
import defpackage.s1;
import defpackage.sb0;
import defpackage.tb0;
import defpackage.u6;
import defpackage.ub0;
import defpackage.vl;
import defpackage.w30;
import defpackage.yb0;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class TasteLedgerFragment extends li implements vl {
    public volatile j0 ESscZ9M1;
    public final u6 LvHlPNBd;
    public final s1 Sjrx9cEN;
    public ig0 TrssYQ34;
    public final u6 hGvurcGl;
    public hd0 pP9Y2m6O;
    public final kn tef3qNMP;
    public boolean g2aRJUAd = false;
    public final Object VGmz0ccI = new Object();
    public boolean LfKQckgD = false;

    public TasteLedgerFragment() {
        fo eIA6dogk = w30.eIA6dogk(io.MdtA4re8, new px(11, new px(10, this)));
        this.tef3qNMP = new kn(m20.qoPGr6Ce(yb0.class), new qx(eIA6dogk, 12), new rx(this, eIA6dogk, 6), new qx(eIA6dogk, 13));
        this.Sjrx9cEN = new s1(s1.wxUZMvaN, 0);
        this.LvHlPNBd = new u6(new sb0(this, 0));
        this.hGvurcGl = new u6(new sb0(this, 1), (byte) 0);
    }

    @Override // defpackage.li
    public final void DK9slbsy() {
        this.euDDoUNr = true;
        hd0 hd0Var = this.pP9Y2m6O;
        hd0Var.getClass();
        ((RecyclerView) hd0Var.MdtA4re8).setAdapter(null);
        hd0 hd0Var2 = this.pP9Y2m6O;
        hd0Var2.getClass();
        ((RecyclerView) hd0Var2.NCTxEWno).setAdapter(null);
        hd0 hd0Var3 = this.pP9Y2m6O;
        hd0Var3.getClass();
        ((RecyclerView) hd0Var3.b2ZJblxo).setAdapter(null);
        this.pP9Y2m6O = null;
    }

    @Override // defpackage.li
    public final void FySoLYna(Context context) {
        super.FySoLYna(context);
        zCflySGU();
        if (this.LfKQckgD) {
            return;
        }
        this.LfKQckgD = true;
        ((ub0) NCTxEWno()).getClass();
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
        zCflySGU();
        if (this.LfKQckgD) {
            return;
        }
        this.LfKQckgD = true;
        ((ub0) NCTxEWno()).getClass();
    }

    @Override // defpackage.li
    public final LayoutInflater U0LaHZX7(Bundle bundle) {
        LayoutInflater U0LaHZX7 = super.U0LaHZX7(bundle);
        return U0LaHZX7.cloneInContext(new ig0(U0LaHZX7, this));
    }

    @Override // defpackage.li
    public final View WYNAV5pd(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        layoutInflater.getClass();
        View inflate = layoutInflater.inflate(R.layout.fragment_taste_ledger, viewGroup, false);
        int i = R.id.averages_empty;
        TextView textView = (TextView) n50.qoPGr6Ce(inflate, R.id.averages_empty);
        if (textView != null) {
            i = R.id.averages_list;
            RecyclerView recyclerView = (RecyclerView) n50.qoPGr6Ce(inflate, R.id.averages_list);
            if (recyclerView != null) {
                i = R.id.averages_title;
                if (((TextView) n50.qoPGr6Ce(inflate, R.id.averages_title)) != null) {
                    i = R.id.badges_list;
                    RecyclerView recyclerView2 = (RecyclerView) n50.qoPGr6Ce(inflate, R.id.badges_list);
                    if (recyclerView2 != null) {
                        i = R.id.badges_subtitle;
                        if (((TextView) n50.qoPGr6Ce(inflate, R.id.badges_subtitle)) != null) {
                            i = R.id.badges_title;
                            if (((TextView) n50.qoPGr6Ce(inflate, R.id.badges_title)) != null) {
                                i = R.id.coverage_bases_value;
                                TextView textView2 = (TextView) n50.qoPGr6Ce(inflate, R.id.coverage_bases_value);
                                if (textView2 != null) {
                                    i = R.id.coverage_cuisines_value;
                                    TextView textView3 = (TextView) n50.qoPGr6Ce(inflate, R.id.coverage_cuisines_value);
                                    if (textView3 != null) {
                                        i = R.id.coverage_row;
                                        if (((LinearLayout) n50.qoPGr6Ce(inflate, R.id.coverage_row)) != null) {
                                            i = R.id.coverage_subtitle;
                                            if (((TextView) n50.qoPGr6Ce(inflate, R.id.coverage_subtitle)) != null) {
                                                i = R.id.coverage_title;
                                                if (((TextView) n50.qoPGr6Ce(inflate, R.id.coverage_title)) != null) {
                                                    i = R.id.header;
                                                    if (((LinearLayout) n50.qoPGr6Ce(inflate, R.id.header)) != null) {
                                                        i = R.id.header_tagline;
                                                        if (((TextView) n50.qoPGr6Ce(inflate, R.id.header_tagline)) != null) {
                                                            i = R.id.header_title;
                                                            if (((TextView) n50.qoPGr6Ce(inflate, R.id.header_title)) != null) {
                                                                i = R.id.ratings_empty;
                                                                TextView textView4 = (TextView) n50.qoPGr6Ce(inflate, R.id.ratings_empty);
                                                                if (textView4 != null) {
                                                                    i = R.id.ratings_list;
                                                                    RecyclerView recyclerView3 = (RecyclerView) n50.qoPGr6Ce(inflate, R.id.ratings_list);
                                                                    if (recyclerView3 != null) {
                                                                        i = R.id.ratings_title;
                                                                        if (((TextView) n50.qoPGr6Ce(inflate, R.id.ratings_title)) != null) {
                                                                            ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                                                                            this.pP9Y2m6O = new hd0(constraintLayout, textView, recyclerView, recyclerView2, textView2, textView3, textView4, recyclerView3);
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
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }

    @Override // defpackage.li
    public final Context eVhOlqcC() {
        if (super.eVhOlqcC() == null && !this.g2aRJUAd) {
            return null;
        }
        zCflySGU();
        return this.TrssYQ34;
    }

    @Override // defpackage.li, defpackage.gm
    public final rg0 wxUZMvaN() {
        return le0.OxcuoDLp(this, super.wxUZMvaN());
    }

    @Override // defpackage.li
    public final void ytu5o6f4(View view) {
        view.getClass();
        hd0 hd0Var = this.pP9Y2m6O;
        hd0Var.getClass();
        ((RecyclerView) hd0Var.MdtA4re8).setItemAnimator(null);
        hd0 hd0Var2 = this.pP9Y2m6O;
        hd0Var2.getClass();
        ((RecyclerView) hd0Var2.MdtA4re8).setAdapter(this.Sjrx9cEN);
        hd0 hd0Var3 = this.pP9Y2m6O;
        hd0Var3.getClass();
        ((RecyclerView) hd0Var3.NCTxEWno).setItemAnimator(null);
        hd0 hd0Var4 = this.pP9Y2m6O;
        hd0Var4.getClass();
        ((RecyclerView) hd0Var4.NCTxEWno).setAdapter(this.LvHlPNBd);
        hd0 hd0Var5 = this.pP9Y2m6O;
        hd0Var5.getClass();
        ((RecyclerView) hd0Var5.b2ZJblxo).setItemAnimator(null);
        hd0 hd0Var6 = this.pP9Y2m6O;
        hd0Var6.getClass();
        ((RecyclerView) hd0Var6.b2ZJblxo).setAdapter(this.hGvurcGl);
        fn.Ey6iv0m0(ej0.FySoLYna(lDXGDhIF()), null, new tb0(this, null, 1), 3);
    }

    public final void zCflySGU() {
        if (this.TrssYQ34 == null) {
            this.TrssYQ34 = new ig0(super.eVhOlqcC(), this);
            this.g2aRJUAd = le0.DK9slbsy(super.eVhOlqcC());
        }
    }
}
