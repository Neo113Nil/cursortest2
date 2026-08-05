package com.kolosta.rejin.jilosa.presentation.ui;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.kolosta.rejin.jilosa.R;
import com.kolosta.rejin.jilosa.presentation.ui.SprintRecapFragment;
import defpackage.bp9dZ9BB;
import defpackage.ej0;
import defpackage.fn;
import defpackage.fo;
import defpackage.ig0;
import defpackage.io;
import defpackage.j0;
import defpackage.kn;
import defpackage.le0;
import defpackage.li;
import defpackage.m20;
import defpackage.m80;
import defpackage.n50;
import defpackage.n80;
import defpackage.p80;
import defpackage.px;
import defpackage.qx;
import defpackage.rg0;
import defpackage.rx;
import defpackage.s1;
import defpackage.vl;
import defpackage.w30;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class SprintRecapFragment extends li implements vl {
    public volatile j0 ESscZ9M1;
    public final s1 Sjrx9cEN;
    public ig0 TrssYQ34;
    public bp9dZ9BB pP9Y2m6O;
    public final kn tef3qNMP;
    public boolean g2aRJUAd = false;
    public final Object VGmz0ccI = new Object();
    public boolean LfKQckgD = false;

    public SprintRecapFragment() {
        fo eIA6dogk = w30.eIA6dogk(io.MdtA4re8, new px(7, new px(6, this)));
        this.tef3qNMP = new kn(m20.qoPGr6Ce(p80.class), new qx(eIA6dogk, 8), new rx(this, eIA6dogk, 4), new qx(eIA6dogk, 9));
        this.Sjrx9cEN = new s1(s1.P7K7Inc8, 2);
    }

    @Override // defpackage.li
    public final void DK9slbsy() {
        this.euDDoUNr = true;
        bp9dZ9BB bp9dz9bb = this.pP9Y2m6O;
        bp9dz9bb.getClass();
        ((RecyclerView) bp9dz9bb.wxUZMvaN).setAdapter(null);
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
        ((n80) NCTxEWno()).getClass();
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
        ((n80) NCTxEWno()).getClass();
    }

    @Override // defpackage.li
    public final LayoutInflater U0LaHZX7(Bundle bundle) {
        LayoutInflater U0LaHZX7 = super.U0LaHZX7(bundle);
        return U0LaHZX7.cloneInContext(new ig0(U0LaHZX7, this));
    }

    @Override // defpackage.li
    public final View WYNAV5pd(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        layoutInflater.getClass();
        View inflate = layoutInflater.inflate(R.layout.fragment_sprint_recap, viewGroup, false);
        int i = R.id.actions_row;
        if (((LinearLayout) n50.qoPGr6Ce(inflate, R.id.actions_row)) != null) {
            i = R.id.back_button;
            ImageView imageView = (ImageView) n50.qoPGr6Ce(inflate, R.id.back_button);
            if (imageView != null) {
                i = R.id.header;
                if (((LinearLayout) n50.qoPGr6Ce(inflate, R.id.header)) != null) {
                    i = R.id.header_title;
                    if (((TextView) n50.qoPGr6Ce(inflate, R.id.header_title)) != null) {
                        i = R.id.recap_accuracy;
                        TextView textView = (TextView) n50.qoPGr6Ce(inflate, R.id.recap_accuracy);
                        if (textView != null) {
                            i = R.id.recap_back;
                            AppCompatButton appCompatButton = (AppCompatButton) n50.qoPGr6Ce(inflate, R.id.recap_back);
                            if (appCompatButton != null) {
                                i = R.id.recap_list;
                                RecyclerView recyclerView = (RecyclerView) n50.qoPGr6Ce(inflate, R.id.recap_list);
                                if (recyclerView != null) {
                                    i = R.id.recap_order_title;
                                    if (((TextView) n50.qoPGr6Ce(inflate, R.id.recap_order_title)) != null) {
                                        i = R.id.recap_retry;
                                        AppCompatButton appCompatButton2 = (AppCompatButton) n50.qoPGr6Ce(inflate, R.id.recap_retry);
                                        if (appCompatButton2 != null) {
                                            i = R.id.recap_time;
                                            TextView textView2 = (TextView) n50.qoPGr6Ce(inflate, R.id.recap_time);
                                            if (textView2 != null) {
                                                i = R.id.result_row;
                                                if (((LinearLayout) n50.qoPGr6Ce(inflate, R.id.result_row)) != null) {
                                                    ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                                                    this.pP9Y2m6O = new bp9dZ9BB(constraintLayout, imageView, textView, appCompatButton, recyclerView, appCompatButton2, textView2);
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
        ((RecyclerView) bp9dz9bb.wxUZMvaN).setItemAnimator(null);
        bp9dZ9BB bp9dz9bb2 = this.pP9Y2m6O;
        bp9dz9bb2.getClass();
        ((RecyclerView) bp9dz9bb2.wxUZMvaN).setAdapter(this.Sjrx9cEN);
        bp9dZ9BB bp9dz9bb3 = this.pP9Y2m6O;
        bp9dz9bb3.getClass();
        final int i = 0;
        ((ImageView) bp9dz9bb3.qoPGr6Ce).setOnClickListener(new View.OnClickListener(this) { // from class: l80
            public final /* synthetic */ SprintRecapFragment MdtA4re8;

            {
                this.MdtA4re8 = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i2 = i;
                SprintRecapFragment sprintRecapFragment = this.MdtA4re8;
                switch (i2) {
                    case 0:
                        ej0.sjUBp5pO(sprintRecapFragment).wxUZMvaN();
                        break;
                    case 1:
                        ej0.sjUBp5pO(sprintRecapFragment).wxUZMvaN();
                        break;
                    default:
                        i90 i90Var = ((o80) ((p80) sprintRecapFragment.tef3qNMP.getValue()).b2ZJblxo.NCTxEWno.Qr9iLBAD()).MdtA4re8;
                        uu sjUBp5pO = ej0.sjUBp5pO(sprintRecapFragment);
                        String str = i90Var.NCTxEWno;
                        sjUBp5pO.getClass();
                        Bundle bundle = new Bundle();
                        bundle.putString("traitKey", str);
                        sjUBp5pO.MdtA4re8(R.id.action_sprint_recap_to_sprint_round, bundle, null);
                        break;
                }
            }
        });
        bp9dZ9BB bp9dz9bb4 = this.pP9Y2m6O;
        bp9dz9bb4.getClass();
        final int i2 = 1;
        ((AppCompatButton) bp9dz9bb4.MdtA4re8).setOnClickListener(new View.OnClickListener(this) { // from class: l80
            public final /* synthetic */ SprintRecapFragment MdtA4re8;

            {
                this.MdtA4re8 = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i22 = i2;
                SprintRecapFragment sprintRecapFragment = this.MdtA4re8;
                switch (i22) {
                    case 0:
                        ej0.sjUBp5pO(sprintRecapFragment).wxUZMvaN();
                        break;
                    case 1:
                        ej0.sjUBp5pO(sprintRecapFragment).wxUZMvaN();
                        break;
                    default:
                        i90 i90Var = ((o80) ((p80) sprintRecapFragment.tef3qNMP.getValue()).b2ZJblxo.NCTxEWno.Qr9iLBAD()).MdtA4re8;
                        uu sjUBp5pO = ej0.sjUBp5pO(sprintRecapFragment);
                        String str = i90Var.NCTxEWno;
                        sjUBp5pO.getClass();
                        Bundle bundle = new Bundle();
                        bundle.putString("traitKey", str);
                        sjUBp5pO.MdtA4re8(R.id.action_sprint_recap_to_sprint_round, bundle, null);
                        break;
                }
            }
        });
        bp9dZ9BB bp9dz9bb5 = this.pP9Y2m6O;
        bp9dz9bb5.getClass();
        final int i3 = 2;
        ((AppCompatButton) bp9dz9bb5.VgvYg0wo).setOnClickListener(new View.OnClickListener(this) { // from class: l80
            public final /* synthetic */ SprintRecapFragment MdtA4re8;

            {
                this.MdtA4re8 = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i22 = i3;
                SprintRecapFragment sprintRecapFragment = this.MdtA4re8;
                switch (i22) {
                    case 0:
                        ej0.sjUBp5pO(sprintRecapFragment).wxUZMvaN();
                        break;
                    case 1:
                        ej0.sjUBp5pO(sprintRecapFragment).wxUZMvaN();
                        break;
                    default:
                        i90 i90Var = ((o80) ((p80) sprintRecapFragment.tef3qNMP.getValue()).b2ZJblxo.NCTxEWno.Qr9iLBAD()).MdtA4re8;
                        uu sjUBp5pO = ej0.sjUBp5pO(sprintRecapFragment);
                        String str = i90Var.NCTxEWno;
                        sjUBp5pO.getClass();
                        Bundle bundle = new Bundle();
                        bundle.putString("traitKey", str);
                        sjUBp5pO.MdtA4re8(R.id.action_sprint_recap_to_sprint_round, bundle, null);
                        break;
                }
            }
        });
        fn.Ey6iv0m0(ej0.FySoLYna(lDXGDhIF()), null, new m80(this, null, i2), 3);
    }

    public final void zCflySGU() {
        if (this.TrssYQ34 == null) {
            this.TrssYQ34 = new ig0(super.eVhOlqcC(), this);
            this.g2aRJUAd = le0.DK9slbsy(super.eVhOlqcC());
        }
    }
}
