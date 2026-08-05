package com.kolosta.rejin.jilosa.presentation.ui;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.kolosta.rejin.jilosa.R;
import defpackage.bp9dZ9BB;
import defpackage.ej0;
import defpackage.fn;
import defpackage.fo;
import defpackage.ig0;
import defpackage.io;
import defpackage.j0;
import defpackage.kn;
import defpackage.lb0;
import defpackage.le0;
import defpackage.li;
import defpackage.m20;
import defpackage.n50;
import defpackage.px;
import defpackage.qx;
import defpackage.rg0;
import defpackage.rx;
import defpackage.u70;
import defpackage.v70;
import defpackage.vl;
import defpackage.w30;
import defpackage.x70;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class SortSprintFragment extends li implements vl {
    public volatile j0 ESscZ9M1;
    public ig0 TrssYQ34;
    public bp9dZ9BB pP9Y2m6O;
    public final kn tef3qNMP;
    public boolean g2aRJUAd = false;
    public final Object VGmz0ccI = new Object();
    public boolean LfKQckgD = false;

    public SortSprintFragment() {
        fo eIA6dogk = w30.eIA6dogk(io.MdtA4re8, new px(5, new px(4, this)));
        this.tef3qNMP = new kn(m20.qoPGr6Ce(x70.class), new qx(eIA6dogk, 6), new rx(this, eIA6dogk, 3), new qx(eIA6dogk, 7));
    }

    @Override // defpackage.li
    public final void DK9slbsy() {
        this.euDDoUNr = true;
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
        ((v70) NCTxEWno()).getClass();
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
        ((v70) NCTxEWno()).getClass();
    }

    @Override // defpackage.li
    public final LayoutInflater U0LaHZX7(Bundle bundle) {
        LayoutInflater U0LaHZX7 = super.U0LaHZX7(bundle);
        return U0LaHZX7.cloneInContext(new ig0(U0LaHZX7, this));
    }

    @Override // defpackage.li
    public final View WYNAV5pd(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        layoutInflater.getClass();
        View inflate = layoutInflater.inflate(R.layout.fragment_sort_sprint, viewGroup, false);
        int i = R.id.best_accuracy;
        TextView textView = (TextView) n50.qoPGr6Ce(inflate, R.id.best_accuracy);
        if (textView != null) {
            i = R.id.best_card;
            if (((LinearLayout) n50.qoPGr6Ce(inflate, R.id.best_card)) != null) {
                i = R.id.best_empty;
                TextView textView2 = (TextView) n50.qoPGr6Ce(inflate, R.id.best_empty);
                if (textView2 != null) {
                    i = R.id.best_time;
                    TextView textView3 = (TextView) n50.qoPGr6Ce(inflate, R.id.best_time);
                    if (textView3 != null) {
                        i = R.id.best_title;
                        if (((TextView) n50.qoPGr6Ce(inflate, R.id.best_title)) != null) {
                            i = R.id.best_values;
                            LinearLayout linearLayout = (LinearLayout) n50.qoPGr6Ce(inflate, R.id.best_values);
                            if (linearLayout != null) {
                                i = R.id.header;
                                if (((LinearLayout) n50.qoPGr6Ce(inflate, R.id.header)) != null) {
                                    i = R.id.header_tagline;
                                    if (((TextView) n50.qoPGr6Ce(inflate, R.id.header_tagline)) != null) {
                                        i = R.id.header_title;
                                        if (((TextView) n50.qoPGr6Ce(inflate, R.id.header_title)) != null) {
                                            i = R.id.how_body;
                                            if (((TextView) n50.qoPGr6Ce(inflate, R.id.how_body)) != null) {
                                                i = R.id.how_card;
                                                if (((LinearLayout) n50.qoPGr6Ce(inflate, R.id.how_card)) != null) {
                                                    i = R.id.how_title;
                                                    if (((TextView) n50.qoPGr6Ce(inflate, R.id.how_title)) != null) {
                                                        i = R.id.intro_emoji;
                                                        if (((TextView) n50.qoPGr6Ce(inflate, R.id.intro_emoji)) != null) {
                                                            i = R.id.start_button;
                                                            AppCompatButton appCompatButton = (AppCompatButton) n50.qoPGr6Ce(inflate, R.id.start_button);
                                                            if (appCompatButton != null) {
                                                                i = R.id.trait_card;
                                                                if (((LinearLayout) n50.qoPGr6Ce(inflate, R.id.trait_card)) != null) {
                                                                    i = R.id.trait_title;
                                                                    if (((TextView) n50.qoPGr6Ce(inflate, R.id.trait_title)) != null) {
                                                                        i = R.id.trait_value;
                                                                        TextView textView4 = (TextView) n50.qoPGr6Ce(inflate, R.id.trait_value);
                                                                        if (textView4 != null) {
                                                                            ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                                                                            this.pP9Y2m6O = new bp9dZ9BB(constraintLayout, textView, textView2, textView3, linearLayout, appCompatButton, textView4);
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
        bp9dZ9BB bp9dz9bb = this.pP9Y2m6O;
        bp9dz9bb.getClass();
        ((AppCompatButton) bp9dz9bb.VgvYg0wo).setOnClickListener(new lb0(this, 2));
        fn.Ey6iv0m0(ej0.FySoLYna(lDXGDhIF()), null, new u70(this, null, 1), 3);
    }

    public final void zCflySGU() {
        if (this.TrssYQ34 == null) {
            this.TrssYQ34 = new ig0(super.eVhOlqcC(), this);
            this.g2aRJUAd = le0.DK9slbsy(super.eVhOlqcC());
        }
    }
}
