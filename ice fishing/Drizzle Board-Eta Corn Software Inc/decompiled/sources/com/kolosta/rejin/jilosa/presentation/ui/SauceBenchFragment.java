package com.kolosta.rejin.jilosa.presentation.ui;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.kolosta.rejin.jilosa.R;
import com.kolosta.rejin.jilosa.presentation.ui.SauceBenchFragment;
import defpackage.d50;
import defpackage.ej0;
import defpackage.fb0;
import defpackage.fn;
import defpackage.fo;
import defpackage.g9;
import defpackage.ig0;
import defpackage.io;
import defpackage.j0;
import defpackage.kb0;
import defpackage.kn;
import defpackage.le0;
import defpackage.li;
import defpackage.m20;
import defpackage.mb0;
import defpackage.n50;
import defpackage.px;
import defpackage.qx;
import defpackage.rg0;
import defpackage.rx;
import defpackage.t40;
import defpackage.u6;
import defpackage.v40;
import defpackage.vj;
import defpackage.vl;
import defpackage.w30;
import defpackage.w40;
import defpackage.x40;
import defpackage.x90;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class SauceBenchFragment extends li implements vl {
    public volatile j0 ESscZ9M1;
    public mb0 LvHlPNBd;
    public final kn Sjrx9cEN;
    public ig0 TrssYQ34;
    public final u6 Wi7iiXC4;
    public final u6 hGvurcGl;
    public vj pP9Y2m6O;
    public final kn tef3qNMP;
    public boolean g2aRJUAd = false;
    public final Object VGmz0ccI = new Object();
    public boolean LfKQckgD = false;

    public SauceBenchFragment() {
        fo eIA6dogk = w30.eIA6dogk(io.MdtA4re8, new px(3, new w40(this, 3)));
        this.tef3qNMP = new kn(m20.qoPGr6Ce(d50.class), new qx(eIA6dogk, 4), new rx(this, eIA6dogk, 2), new qx(eIA6dogk, 5));
        this.Sjrx9cEN = new kn(m20.qoPGr6Ce(fb0.class), new w40(this, 0), new w40(this, 2), new w40(this, 1));
        this.hGvurcGl = new u6(new t40(this, 0));
        this.Wi7iiXC4 = new u6(new t40(this, 1), (byte) 0);
    }

    public static void zCflySGU(View view, int i) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.getClass();
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        float f = i;
        if (f < 0.01f) {
            f = 0.01f;
        }
        layoutParams2.weight = f;
        view.setLayoutParams(layoutParams2);
    }

    @Override // defpackage.li
    public final void DK9slbsy() {
        this.euDDoUNr = true;
        mb0 mb0Var = this.LvHlPNBd;
        if (mb0Var != null) {
            mb0Var.dismiss();
        }
        this.LvHlPNBd = null;
        vj vjVar = this.pP9Y2m6O;
        vjVar.getClass();
        vjVar.ygLcUYwZ.setAdapter(null);
        vj vjVar2 = this.pP9Y2m6O;
        vjVar2.getClass();
        vjVar2.Ey6iv0m0.setAdapter(null);
        this.pP9Y2m6O = null;
    }

    public final d50 FXJmAAN1() {
        return (d50) this.tef3qNMP.getValue();
    }

    @Override // defpackage.li
    public final void FySoLYna(Context context) {
        super.FySoLYna(context);
        nSmgoSB5();
        if (this.LfKQckgD) {
            return;
        }
        this.LfKQckgD = true;
        ((x40) NCTxEWno()).getClass();
    }

    public final void N8VPGzVC(kb0 kb0Var) {
        fb0 fb0Var = (fb0) this.Sjrx9cEN.getValue();
        kb0Var.getClass();
        x90 x90Var = fb0Var.NCTxEWno;
        x90Var.getClass();
        x90Var.eVhOlqcC(null, kb0Var);
        x90 x90Var2 = fb0Var.MdtA4re8;
        Boolean bool = Boolean.FALSE;
        x90Var2.getClass();
        x90Var2.eVhOlqcC(null, bool);
        ej0.euDDoUNr(ej0.sjUBp5pO(this));
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
        nSmgoSB5();
        if (this.LfKQckgD) {
            return;
        }
        this.LfKQckgD = true;
        ((x40) NCTxEWno()).getClass();
    }

    @Override // defpackage.li
    public final LayoutInflater U0LaHZX7(Bundle bundle) {
        LayoutInflater U0LaHZX7 = super.U0LaHZX7(bundle);
        return U0LaHZX7.cloneInContext(new ig0(U0LaHZX7, this));
    }

    @Override // defpackage.li
    public final View WYNAV5pd(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        layoutInflater.getClass();
        View inflate = layoutInflater.inflate(R.layout.fragment_sauce_bench, viewGroup, false);
        int i = R.id.content_scroll;
        if (((NestedScrollView) n50.qoPGr6Ce(inflate, R.id.content_scroll)) != null) {
            i = R.id.header;
            if (((LinearLayout) n50.qoPGr6Ce(inflate, R.id.header)) != null) {
                i = R.id.header_tagline;
                if (((TextView) n50.qoPGr6Ce(inflate, R.id.header_tagline)) != null) {
                    i = R.id.header_title;
                    if (((TextView) n50.qoPGr6Ce(inflate, R.id.header_title)) != null) {
                        i = R.id.mood_bold;
                        LinearLayout linearLayout = (LinearLayout) n50.qoPGr6Ce(inflate, R.id.mood_bold);
                        if (linearLayout != null) {
                            i = R.id.mood_calm;
                            LinearLayout linearLayout2 = (LinearLayout) n50.qoPGr6Ce(inflate, R.id.mood_calm);
                            if (linearLayout2 != null) {
                                i = R.id.mood_cozy;
                                LinearLayout linearLayout3 = (LinearLayout) n50.qoPGr6Ce(inflate, R.id.mood_cozy);
                                if (linearLayout3 != null) {
                                    i = R.id.mood_fresh;
                                    LinearLayout linearLayout4 = (LinearLayout) n50.qoPGr6Ce(inflate, R.id.mood_fresh);
                                    if (linearLayout4 != null) {
                                        i = R.id.mood_intense;
                                        LinearLayout linearLayout5 = (LinearLayout) n50.qoPGr6Ce(inflate, R.id.mood_intense);
                                        if (linearLayout5 != null) {
                                            i = R.id.mood_scroll;
                                            if (((HorizontalScrollView) n50.qoPGr6Ce(inflate, R.id.mood_scroll)) != null) {
                                                i = R.id.mood_subtitle;
                                                if (((TextView) n50.qoPGr6Ce(inflate, R.id.mood_subtitle)) != null) {
                                                    i = R.id.mood_title;
                                                    if (((TextView) n50.qoPGr6Ce(inflate, R.id.mood_title)) != null) {
                                                        i = R.id.rating_block;
                                                        LinearLayout linearLayout6 = (LinearLayout) n50.qoPGr6Ce(inflate, R.id.rating_block);
                                                        if (linearLayout6 != null) {
                                                            i = R.id.rating_good;
                                                            LinearLayout linearLayout7 = (LinearLayout) n50.qoPGr6Ce(inflate, R.id.rating_good);
                                                            if (linearLayout7 != null) {
                                                                i = R.id.rating_love;
                                                                LinearLayout linearLayout8 = (LinearLayout) n50.qoPGr6Ce(inflate, R.id.rating_love);
                                                                if (linearLayout8 != null) {
                                                                    i = R.id.rating_meh;
                                                                    LinearLayout linearLayout9 = (LinearLayout) n50.qoPGr6Ce(inflate, R.id.rating_meh);
                                                                    if (linearLayout9 != null) {
                                                                        i = R.id.rating_ok;
                                                                        LinearLayout linearLayout10 = (LinearLayout) n50.qoPGr6Ce(inflate, R.id.rating_ok);
                                                                        if (linearLayout10 != null) {
                                                                            i = R.id.rating_pair_name;
                                                                            TextView textView = (TextView) n50.qoPGr6Ce(inflate, R.id.rating_pair_name);
                                                                            if (textView != null) {
                                                                                i = R.id.rating_skip;
                                                                                AppCompatButton appCompatButton = (AppCompatButton) n50.qoPGr6Ce(inflate, R.id.rating_skip);
                                                                                if (appCompatButton != null) {
                                                                                    i = R.id.rating_subtitle;
                                                                                    if (((TextView) n50.qoPGr6Ce(inflate, R.id.rating_subtitle)) != null) {
                                                                                        i = R.id.rating_title;
                                                                                        if (((TextView) n50.qoPGr6Ce(inflate, R.id.rating_title)) != null) {
                                                                                            i = R.id.related_empty;
                                                                                            TextView textView2 = (TextView) n50.qoPGr6Ce(inflate, R.id.related_empty);
                                                                                            if (textView2 != null) {
                                                                                                i = R.id.related_list;
                                                                                                RecyclerView recyclerView = (RecyclerView) n50.qoPGr6Ce(inflate, R.id.related_list);
                                                                                                if (recyclerView != null) {
                                                                                                    i = R.id.related_subtitle;
                                                                                                    if (((TextView) n50.qoPGr6Ce(inflate, R.id.related_subtitle)) != null) {
                                                                                                        i = R.id.related_title;
                                                                                                        if (((TextView) n50.qoPGr6Ce(inflate, R.id.related_title)) != null) {
                                                                                                            i = R.id.ring_card;
                                                                                                            MaterialCardView materialCardView = (MaterialCardView) n50.qoPGr6Ce(inflate, R.id.ring_card);
                                                                                                            if (materialCardView != null) {
                                                                                                                i = R.id.ring_counter;
                                                                                                                TextView textView3 = (TextView) n50.qoPGr6Ce(inflate, R.id.ring_counter);
                                                                                                                if (textView3 != null) {
                                                                                                                    i = R.id.ring_hint;
                                                                                                                    if (((TextView) n50.qoPGr6Ce(inflate, R.id.ring_hint)) != null) {
                                                                                                                        i = R.id.ring_indicator;
                                                                                                                        CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) n50.qoPGr6Ce(inflate, R.id.ring_indicator);
                                                                                                                        if (circularProgressIndicator != null) {
                                                                                                                            i = R.id.ring_percent;
                                                                                                                            TextView textView4 = (TextView) n50.qoPGr6Ce(inflate, R.id.ring_percent);
                                                                                                                            if (textView4 != null) {
                                                                                                                                i = R.id.ring_title;
                                                                                                                                if (((TextView) n50.qoPGr6Ce(inflate, R.id.ring_title)) != null) {
                                                                                                                                    i = R.id.sprints_empty;
                                                                                                                                    TextView textView5 = (TextView) n50.qoPGr6Ce(inflate, R.id.sprints_empty);
                                                                                                                                    if (textView5 != null) {
                                                                                                                                        i = R.id.sprints_list;
                                                                                                                                        RecyclerView recyclerView2 = (RecyclerView) n50.qoPGr6Ce(inflate, R.id.sprints_list);
                                                                                                                                        if (recyclerView2 != null) {
                                                                                                                                            i = R.id.sprints_subtitle;
                                                                                                                                            if (((TextView) n50.qoPGr6Ce(inflate, R.id.sprints_subtitle)) != null) {
                                                                                                                                                i = R.id.sprints_title;
                                                                                                                                                if (((TextView) n50.qoPGr6Ce(inflate, R.id.sprints_title)) != null) {
                                                                                                                                                    i = R.id.status_bar;
                                                                                                                                                    if (((LinearLayout) n50.qoPGr6Ce(inflate, R.id.status_bar)) != null) {
                                                                                                                                                        i = R.id.status_opened_value;
                                                                                                                                                        TextView textView6 = (TextView) n50.qoPGr6Ce(inflate, R.id.status_opened_value);
                                                                                                                                                        if (textView6 != null) {
                                                                                                                                                            i = R.id.status_rated_value;
                                                                                                                                                            TextView textView7 = (TextView) n50.qoPGr6Ce(inflate, R.id.status_rated_value);
                                                                                                                                                            if (textView7 != null) {
                                                                                                                                                                i = R.id.status_segment_opened;
                                                                                                                                                                View qoPGr6Ce = n50.qoPGr6Ce(inflate, R.id.status_segment_opened);
                                                                                                                                                                if (qoPGr6Ce != null) {
                                                                                                                                                                    i = R.id.status_segment_rated;
                                                                                                                                                                    View qoPGr6Ce2 = n50.qoPGr6Ce(inflate, R.id.status_segment_rated);
                                                                                                                                                                    if (qoPGr6Ce2 != null) {
                                                                                                                                                                        i = R.id.status_segment_untouched;
                                                                                                                                                                        View qoPGr6Ce3 = n50.qoPGr6Ce(inflate, R.id.status_segment_untouched);
                                                                                                                                                                        if (qoPGr6Ce3 != null) {
                                                                                                                                                                            i = R.id.status_title;
                                                                                                                                                                            if (((TextView) n50.qoPGr6Ce(inflate, R.id.status_title)) != null) {
                                                                                                                                                                                i = R.id.status_untouched_value;
                                                                                                                                                                                TextView textView8 = (TextView) n50.qoPGr6Ce(inflate, R.id.status_untouched_value);
                                                                                                                                                                                if (textView8 != null) {
                                                                                                                                                                                    ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                                                                                                                                                                                    this.pP9Y2m6O = new vj(constraintLayout, linearLayout, linearLayout2, linearLayout3, linearLayout4, linearLayout5, linearLayout6, linearLayout7, linearLayout8, linearLayout9, linearLayout10, textView, appCompatButton, textView2, recyclerView, materialCardView, textView3, circularProgressIndicator, textView4, textView5, recyclerView2, textView6, textView7, qoPGr6Ce, qoPGr6Ce2, qoPGr6Ce3, textView8);
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
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }

    @Override // defpackage.li
    public final Context eVhOlqcC() {
        if (super.eVhOlqcC() == null && !this.g2aRJUAd) {
            return null;
        }
        nSmgoSB5();
        return this.TrssYQ34;
    }

    public final void nSmgoSB5() {
        if (this.TrssYQ34 == null) {
            this.TrssYQ34 = new ig0(super.eVhOlqcC(), this);
            this.g2aRJUAd = le0.DK9slbsy(super.eVhOlqcC());
        }
    }

    @Override // defpackage.li, defpackage.gm
    public final rg0 wxUZMvaN() {
        return le0.OxcuoDLp(this, super.wxUZMvaN());
    }

    @Override // defpackage.li
    public final void ytu5o6f4(View view) {
        view.getClass();
        vj vjVar = this.pP9Y2m6O;
        vjVar.getClass();
        g9 g9Var = null;
        vjVar.ygLcUYwZ.setItemAnimator(null);
        vj vjVar2 = this.pP9Y2m6O;
        vjVar2.getClass();
        vjVar2.ygLcUYwZ.setAdapter(this.hGvurcGl);
        vj vjVar3 = this.pP9Y2m6O;
        vjVar3.getClass();
        vjVar3.Ey6iv0m0.setItemAnimator(null);
        vj vjVar4 = this.pP9Y2m6O;
        vjVar4.getClass();
        vjVar4.Ey6iv0m0.setAdapter(this.Wi7iiXC4);
        vj vjVar5 = this.pP9Y2m6O;
        vjVar5.getClass();
        final int i = 0;
        vjVar5.lDXGDhIF.setOnClickListener(new View.OnClickListener(this) { // from class: s40
            public final /* synthetic */ SauceBenchFragment MdtA4re8;

            {
                this.MdtA4re8 = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i2 = i;
                SauceBenchFragment sauceBenchFragment = this.MdtA4re8;
                switch (i2) {
                    case 0:
                        fb0 fb0Var = (fb0) sauceBenchFragment.Sjrx9cEN.getValue();
                        fb0Var.NCTxEWno.jb9XjC4I(null);
                        x90 x90Var = fb0Var.MdtA4re8;
                        Boolean bool = Boolean.TRUE;
                        x90Var.getClass();
                        x90Var.eVhOlqcC(null, bool);
                        ej0.euDDoUNr(ej0.sjUBp5pO(sauceBenchFragment));
                        break;
                    case 1:
                        sauceBenchFragment.FXJmAAN1().VgvYg0wo(4);
                        break;
                    case 2:
                        sauceBenchFragment.FXJmAAN1().VgvYg0wo(3);
                        break;
                    case 3:
                        sauceBenchFragment.FXJmAAN1().VgvYg0wo(2);
                        break;
                    case 4:
                        sauceBenchFragment.FXJmAAN1().VgvYg0wo(1);
                        break;
                    default:
                        d50 FXJmAAN1 = sauceBenchFragment.FXJmAAN1();
                        xx xxVar = ((g2) FXJmAAN1.P7K7Inc8.NCTxEWno.Qr9iLBAD()).VgvYg0wo;
                        if (xxVar != null) {
                            fn.Ey6iv0m0(le0.FySoLYna(FXJmAAN1), null, new a50(FXJmAAN1, xxVar.qoPGr6Ce, null), 3);
                            break;
                        }
                        break;
                }
            }
        });
        vj vjVar6 = this.pP9Y2m6O;
        vjVar6.getClass();
        final int i2 = 1;
        vjVar6.Qr9iLBAD.setOnClickListener(new View.OnClickListener(this) { // from class: s40
            public final /* synthetic */ SauceBenchFragment MdtA4re8;

            {
                this.MdtA4re8 = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i22 = i2;
                SauceBenchFragment sauceBenchFragment = this.MdtA4re8;
                switch (i22) {
                    case 0:
                        fb0 fb0Var = (fb0) sauceBenchFragment.Sjrx9cEN.getValue();
                        fb0Var.NCTxEWno.jb9XjC4I(null);
                        x90 x90Var = fb0Var.MdtA4re8;
                        Boolean bool = Boolean.TRUE;
                        x90Var.getClass();
                        x90Var.eVhOlqcC(null, bool);
                        ej0.euDDoUNr(ej0.sjUBp5pO(sauceBenchFragment));
                        break;
                    case 1:
                        sauceBenchFragment.FXJmAAN1().VgvYg0wo(4);
                        break;
                    case 2:
                        sauceBenchFragment.FXJmAAN1().VgvYg0wo(3);
                        break;
                    case 3:
                        sauceBenchFragment.FXJmAAN1().VgvYg0wo(2);
                        break;
                    case 4:
                        sauceBenchFragment.FXJmAAN1().VgvYg0wo(1);
                        break;
                    default:
                        d50 FXJmAAN1 = sauceBenchFragment.FXJmAAN1();
                        xx xxVar = ((g2) FXJmAAN1.P7K7Inc8.NCTxEWno.Qr9iLBAD()).VgvYg0wo;
                        if (xxVar != null) {
                            fn.Ey6iv0m0(le0.FySoLYna(FXJmAAN1), null, new a50(FXJmAAN1, xxVar.qoPGr6Ce, null), 3);
                            break;
                        }
                        break;
                }
            }
        });
        vj vjVar7 = this.pP9Y2m6O;
        vjVar7.getClass();
        final int i3 = 2;
        vjVar7.b2ZJblxo.setOnClickListener(new View.OnClickListener(this) { // from class: s40
            public final /* synthetic */ SauceBenchFragment MdtA4re8;

            {
                this.MdtA4re8 = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i22 = i3;
                SauceBenchFragment sauceBenchFragment = this.MdtA4re8;
                switch (i22) {
                    case 0:
                        fb0 fb0Var = (fb0) sauceBenchFragment.Sjrx9cEN.getValue();
                        fb0Var.NCTxEWno.jb9XjC4I(null);
                        x90 x90Var = fb0Var.MdtA4re8;
                        Boolean bool = Boolean.TRUE;
                        x90Var.getClass();
                        x90Var.eVhOlqcC(null, bool);
                        ej0.euDDoUNr(ej0.sjUBp5pO(sauceBenchFragment));
                        break;
                    case 1:
                        sauceBenchFragment.FXJmAAN1().VgvYg0wo(4);
                        break;
                    case 2:
                        sauceBenchFragment.FXJmAAN1().VgvYg0wo(3);
                        break;
                    case 3:
                        sauceBenchFragment.FXJmAAN1().VgvYg0wo(2);
                        break;
                    case 4:
                        sauceBenchFragment.FXJmAAN1().VgvYg0wo(1);
                        break;
                    default:
                        d50 FXJmAAN1 = sauceBenchFragment.FXJmAAN1();
                        xx xxVar = ((g2) FXJmAAN1.P7K7Inc8.NCTxEWno.Qr9iLBAD()).VgvYg0wo;
                        if (xxVar != null) {
                            fn.Ey6iv0m0(le0.FySoLYna(FXJmAAN1), null, new a50(FXJmAAN1, xxVar.qoPGr6Ce, null), 3);
                            break;
                        }
                        break;
                }
            }
        });
        vj vjVar8 = this.pP9Y2m6O;
        vjVar8.getClass();
        final int i4 = 3;
        vjVar8.eVhOlqcC.setOnClickListener(new View.OnClickListener(this) { // from class: s40
            public final /* synthetic */ SauceBenchFragment MdtA4re8;

            {
                this.MdtA4re8 = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i22 = i4;
                SauceBenchFragment sauceBenchFragment = this.MdtA4re8;
                switch (i22) {
                    case 0:
                        fb0 fb0Var = (fb0) sauceBenchFragment.Sjrx9cEN.getValue();
                        fb0Var.NCTxEWno.jb9XjC4I(null);
                        x90 x90Var = fb0Var.MdtA4re8;
                        Boolean bool = Boolean.TRUE;
                        x90Var.getClass();
                        x90Var.eVhOlqcC(null, bool);
                        ej0.euDDoUNr(ej0.sjUBp5pO(sauceBenchFragment));
                        break;
                    case 1:
                        sauceBenchFragment.FXJmAAN1().VgvYg0wo(4);
                        break;
                    case 2:
                        sauceBenchFragment.FXJmAAN1().VgvYg0wo(3);
                        break;
                    case 3:
                        sauceBenchFragment.FXJmAAN1().VgvYg0wo(2);
                        break;
                    case 4:
                        sauceBenchFragment.FXJmAAN1().VgvYg0wo(1);
                        break;
                    default:
                        d50 FXJmAAN1 = sauceBenchFragment.FXJmAAN1();
                        xx xxVar = ((g2) FXJmAAN1.P7K7Inc8.NCTxEWno.Qr9iLBAD()).VgvYg0wo;
                        if (xxVar != null) {
                            fn.Ey6iv0m0(le0.FySoLYna(FXJmAAN1), null, new a50(FXJmAAN1, xxVar.qoPGr6Ce, null), 3);
                            break;
                        }
                        break;
                }
            }
        });
        vj vjVar9 = this.pP9Y2m6O;
        vjVar9.getClass();
        final int i5 = 4;
        vjVar9.jb9XjC4I.setOnClickListener(new View.OnClickListener(this) { // from class: s40
            public final /* synthetic */ SauceBenchFragment MdtA4re8;

            {
                this.MdtA4re8 = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i22 = i5;
                SauceBenchFragment sauceBenchFragment = this.MdtA4re8;
                switch (i22) {
                    case 0:
                        fb0 fb0Var = (fb0) sauceBenchFragment.Sjrx9cEN.getValue();
                        fb0Var.NCTxEWno.jb9XjC4I(null);
                        x90 x90Var = fb0Var.MdtA4re8;
                        Boolean bool = Boolean.TRUE;
                        x90Var.getClass();
                        x90Var.eVhOlqcC(null, bool);
                        ej0.euDDoUNr(ej0.sjUBp5pO(sauceBenchFragment));
                        break;
                    case 1:
                        sauceBenchFragment.FXJmAAN1().VgvYg0wo(4);
                        break;
                    case 2:
                        sauceBenchFragment.FXJmAAN1().VgvYg0wo(3);
                        break;
                    case 3:
                        sauceBenchFragment.FXJmAAN1().VgvYg0wo(2);
                        break;
                    case 4:
                        sauceBenchFragment.FXJmAAN1().VgvYg0wo(1);
                        break;
                    default:
                        d50 FXJmAAN1 = sauceBenchFragment.FXJmAAN1();
                        xx xxVar = ((g2) FXJmAAN1.P7K7Inc8.NCTxEWno.Qr9iLBAD()).VgvYg0wo;
                        if (xxVar != null) {
                            fn.Ey6iv0m0(le0.FySoLYna(FXJmAAN1), null, new a50(FXJmAAN1, xxVar.qoPGr6Ce, null), 3);
                            break;
                        }
                        break;
                }
            }
        });
        vj vjVar10 = this.pP9Y2m6O;
        vjVar10.getClass();
        final int i6 = 5;
        vjVar10.ow5vqvCr.setOnClickListener(new View.OnClickListener(this) { // from class: s40
            public final /* synthetic */ SauceBenchFragment MdtA4re8;

            {
                this.MdtA4re8 = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i22 = i6;
                SauceBenchFragment sauceBenchFragment = this.MdtA4re8;
                switch (i22) {
                    case 0:
                        fb0 fb0Var = (fb0) sauceBenchFragment.Sjrx9cEN.getValue();
                        fb0Var.NCTxEWno.jb9XjC4I(null);
                        x90 x90Var = fb0Var.MdtA4re8;
                        Boolean bool = Boolean.TRUE;
                        x90Var.getClass();
                        x90Var.eVhOlqcC(null, bool);
                        ej0.euDDoUNr(ej0.sjUBp5pO(sauceBenchFragment));
                        break;
                    case 1:
                        sauceBenchFragment.FXJmAAN1().VgvYg0wo(4);
                        break;
                    case 2:
                        sauceBenchFragment.FXJmAAN1().VgvYg0wo(3);
                        break;
                    case 3:
                        sauceBenchFragment.FXJmAAN1().VgvYg0wo(2);
                        break;
                    case 4:
                        sauceBenchFragment.FXJmAAN1().VgvYg0wo(1);
                        break;
                    default:
                        d50 FXJmAAN1 = sauceBenchFragment.FXJmAAN1();
                        xx xxVar = ((g2) FXJmAAN1.P7K7Inc8.NCTxEWno.Qr9iLBAD()).VgvYg0wo;
                        if (xxVar != null) {
                            fn.Ey6iv0m0(le0.FySoLYna(FXJmAAN1), null, new a50(FXJmAAN1, xxVar.qoPGr6Ce, null), 3);
                            break;
                        }
                        break;
                }
            }
        });
        fn.Ey6iv0m0(ej0.FySoLYna(lDXGDhIF()), null, new v40(this, g9Var, i4), 3);
        fn.Ey6iv0m0(ej0.FySoLYna(lDXGDhIF()), null, new v40(this, g9Var, i2), 3);
    }
}
