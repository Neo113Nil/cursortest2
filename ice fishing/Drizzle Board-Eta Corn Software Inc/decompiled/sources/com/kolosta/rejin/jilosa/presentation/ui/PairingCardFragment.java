package com.kolosta.rejin.jilosa.presentation.ui;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.kolosta.rejin.jilosa.R;
import com.kolosta.rejin.jilosa.presentation.ui.PairingCardFragment;
import defpackage.b2ZJblxo;
import defpackage.bp9dZ9BB;
import defpackage.dy;
import defpackage.ej0;
import defpackage.ey;
import defpackage.fn;
import defpackage.fo;
import defpackage.ig0;
import defpackage.io;
import defpackage.iy;
import defpackage.j0;
import defpackage.kn;
import defpackage.le0;
import defpackage.li;
import defpackage.m20;
import defpackage.n50;
import defpackage.px;
import defpackage.q6;
import defpackage.qx;
import defpackage.rg0;
import defpackage.rx;
import defpackage.s1;
import defpackage.tj;
import defpackage.u6;
import defpackage.vl;
import defpackage.w30;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class PairingCardFragment extends li implements vl {
    public volatile j0 ESscZ9M1;
    public final u6 LvHlPNBd;
    public final s1 Sjrx9cEN;
    public ig0 TrssYQ34;
    public tj pP9Y2m6O;
    public final kn tef3qNMP;
    public boolean g2aRJUAd = false;
    public final Object VGmz0ccI = new Object();
    public boolean LfKQckgD = false;

    public PairingCardFragment() {
        fo eIA6dogk = w30.eIA6dogk(io.MdtA4re8, new px(2, new px(1, this)));
        this.tef3qNMP = new kn(m20.qoPGr6Ce(iy.class), new qx(eIA6dogk, 2), new rx(this, eIA6dogk, 1), new qx(eIA6dogk, 3));
        this.Sjrx9cEN = new s1(s1.VgvYg0wo, 1);
        this.LvHlPNBd = new u6(new b2ZJblxo(4, this));
    }

    @Override // defpackage.li
    public final void DK9slbsy() {
        this.euDDoUNr = true;
        tj tjVar = this.pP9Y2m6O;
        tjVar.getClass();
        tjVar.b2ZJblxo.setAdapter(null);
        tj tjVar2 = this.pP9Y2m6O;
        tjVar2.getClass();
        tjVar2.OxcuoDLp.setAdapter(null);
        this.pP9Y2m6O = null;
    }

    public final iy FXJmAAN1() {
        return (iy) this.tef3qNMP.getValue();
    }

    @Override // defpackage.li
    public final void FySoLYna(Context context) {
        super.FySoLYna(context);
        nSmgoSB5();
        if (this.LfKQckgD) {
            return;
        }
        this.LfKQckgD = true;
        ((ey) NCTxEWno()).getClass();
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
        ((ey) NCTxEWno()).getClass();
    }

    @Override // defpackage.li
    public final LayoutInflater U0LaHZX7(Bundle bundle) {
        LayoutInflater U0LaHZX7 = super.U0LaHZX7(bundle);
        return U0LaHZX7.cloneInContext(new ig0(U0LaHZX7, this));
    }

    @Override // defpackage.li
    public final View WYNAV5pd(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        layoutInflater.getClass();
        View inflate = layoutInflater.inflate(R.layout.fragment_pairing_card, viewGroup, false);
        int i = R.id.back_button;
        ImageView imageView = (ImageView) n50.qoPGr6Ce(inflate, R.id.back_button);
        if (imageView != null) {
            i = R.id.compare_button;
            AppCompatButton appCompatButton = (AppCompatButton) n50.qoPGr6Ce(inflate, R.id.compare_button);
            if (appCompatButton != null) {
                i = R.id.compare_card;
                if (((LinearLayout) n50.qoPGr6Ce(inflate, R.id.compare_card)) != null) {
                    i = R.id.compare_panels_overlay;
                    FrameLayout frameLayout = (FrameLayout) n50.qoPGr6Ce(inflate, R.id.compare_panels_overlay);
                    if (frameLayout != null) {
                        i = R.id.compare_picker_overlay;
                        FrameLayout frameLayout2 = (FrameLayout) n50.qoPGr6Ce(inflate, R.id.compare_picker_overlay);
                        if (frameLayout2 != null) {
                            i = R.id.compare_subtitle;
                            if (((TextView) n50.qoPGr6Ce(inflate, R.id.compare_subtitle)) != null) {
                                i = R.id.compare_title;
                                if (((TextView) n50.qoPGr6Ce(inflate, R.id.compare_title)) != null) {
                                    i = R.id.content_scroll;
                                    if (((NestedScrollView) n50.qoPGr6Ce(inflate, R.id.content_scroll)) != null) {
                                        i = R.id.context_body;
                                        TextView textView = (TextView) n50.qoPGr6Ce(inflate, R.id.context_body);
                                        if (textView != null) {
                                            i = R.id.context_title;
                                            if (((TextView) n50.qoPGr6Ce(inflate, R.id.context_title)) != null) {
                                                i = R.id.description_body;
                                                TextView textView2 = (TextView) n50.qoPGr6Ce(inflate, R.id.description_body);
                                                if (textView2 != null) {
                                                    i = R.id.description_title;
                                                    if (((TextView) n50.qoPGr6Ce(inflate, R.id.description_title)) != null) {
                                                        i = R.id.flow_list;
                                                        RecyclerView recyclerView = (RecyclerView) n50.qoPGr6Ce(inflate, R.id.flow_list);
                                                        if (recyclerView != null) {
                                                            i = R.id.flow_title;
                                                            if (((TextView) n50.qoPGr6Ce(inflate, R.id.flow_title)) != null) {
                                                                i = R.id.header;
                                                                if (((LinearLayout) n50.qoPGr6Ce(inflate, R.id.header)) != null) {
                                                                    i = R.id.header_title;
                                                                    TextView textView3 = (TextView) n50.qoPGr6Ce(inflate, R.id.header_title);
                                                                    if (textView3 != null) {
                                                                        i = R.id.hero;
                                                                        if (((LinearLayout) n50.qoPGr6Ce(inflate, R.id.hero)) != null) {
                                                                            i = R.id.hero_emoji;
                                                                            TextView textView4 = (TextView) n50.qoPGr6Ce(inflate, R.id.hero_emoji);
                                                                            if (textView4 != null) {
                                                                                i = R.id.hero_name;
                                                                                TextView textView5 = (TextView) n50.qoPGr6Ce(inflate, R.id.hero_name);
                                                                                if (textView5 != null) {
                                                                                    i = R.id.hero_subtitle;
                                                                                    TextView textView6 = (TextView) n50.qoPGr6Ce(inflate, R.id.hero_subtitle);
                                                                                    if (textView6 != null) {
                                                                                        i = R.id.panel_left;
                                                                                        View qoPGr6Ce = n50.qoPGr6Ce(inflate, R.id.panel_left);
                                                                                        if (qoPGr6Ce != null) {
                                                                                            bp9dZ9BB NCTxEWno = bp9dZ9BB.NCTxEWno(qoPGr6Ce);
                                                                                            i = R.id.panel_right;
                                                                                            View qoPGr6Ce2 = n50.qoPGr6Ce(inflate, R.id.panel_right);
                                                                                            if (qoPGr6Ce2 != null) {
                                                                                                bp9dZ9BB NCTxEWno2 = bp9dZ9BB.NCTxEWno(qoPGr6Ce2);
                                                                                                i = R.id.panels_close;
                                                                                                ImageView imageView2 = (ImageView) n50.qoPGr6Ce(inflate, R.id.panels_close);
                                                                                                if (imageView2 != null) {
                                                                                                    i = R.id.panels_title;
                                                                                                    if (((TextView) n50.qoPGr6Ce(inflate, R.id.panels_title)) != null) {
                                                                                                        i = R.id.picker_close;
                                                                                                        ImageView imageView3 = (ImageView) n50.qoPGr6Ce(inflate, R.id.picker_close);
                                                                                                        if (imageView3 != null) {
                                                                                                            i = R.id.picker_empty;
                                                                                                            TextView textView7 = (TextView) n50.qoPGr6Ce(inflate, R.id.picker_empty);
                                                                                                            if (textView7 != null) {
                                                                                                                i = R.id.picker_list;
                                                                                                                RecyclerView recyclerView2 = (RecyclerView) n50.qoPGr6Ce(inflate, R.id.picker_list);
                                                                                                                if (recyclerView2 != null) {
                                                                                                                    i = R.id.picker_title;
                                                                                                                    if (((TextView) n50.qoPGr6Ce(inflate, R.id.picker_title)) != null) {
                                                                                                                        i = R.id.prep_row;
                                                                                                                        if (((LinearLayout) n50.qoPGr6Ce(inflate, R.id.prep_row)) != null) {
                                                                                                                            i = R.id.prep_title;
                                                                                                                            if (((TextView) n50.qoPGr6Ce(inflate, R.id.prep_title)) != null) {
                                                                                                                                i = R.id.prep_value;
                                                                                                                                TextView textView8 = (TextView) n50.qoPGr6Ce(inflate, R.id.prep_value);
                                                                                                                                if (textView8 != null) {
                                                                                                                                    i = R.id.share_button;
                                                                                                                                    AppCompatButton appCompatButton2 = (AppCompatButton) n50.qoPGr6Ce(inflate, R.id.share_button);
                                                                                                                                    if (appCompatButton2 != null) {
                                                                                                                                        i = R.id.share_card;
                                                                                                                                        if (((LinearLayout) n50.qoPGr6Ce(inflate, R.id.share_card)) != null) {
                                                                                                                                            i = R.id.share_subtitle;
                                                                                                                                            if (((TextView) n50.qoPGr6Ce(inflate, R.id.share_subtitle)) != null) {
                                                                                                                                                i = R.id.share_title;
                                                                                                                                                if (((TextView) n50.qoPGr6Ce(inflate, R.id.share_title)) != null) {
                                                                                                                                                    ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                                                                                                                                                    this.pP9Y2m6O = new tj(constraintLayout, imageView, appCompatButton, frameLayout, frameLayout2, textView, textView2, recyclerView, textView3, textView4, textView5, textView6, NCTxEWno, NCTxEWno2, imageView2, imageView3, textView7, recyclerView2, textView8, appCompatButton2);
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
        tj tjVar = this.pP9Y2m6O;
        tjVar.getClass();
        tjVar.b2ZJblxo.setItemAnimator(null);
        tj tjVar2 = this.pP9Y2m6O;
        tjVar2.getClass();
        tjVar2.b2ZJblxo.setAdapter(this.Sjrx9cEN);
        tj tjVar3 = this.pP9Y2m6O;
        tjVar3.getClass();
        tjVar3.OxcuoDLp.setItemAnimator(null);
        tj tjVar4 = this.pP9Y2m6O;
        tjVar4.getClass();
        tjVar4.OxcuoDLp.setAdapter(this.LvHlPNBd);
        tj tjVar5 = this.pP9Y2m6O;
        tjVar5.getClass();
        final int i = 0;
        tjVar5.qoPGr6Ce.setOnClickListener(new View.OnClickListener(this) { // from class: cy
            public final /* synthetic */ PairingCardFragment MdtA4re8;

            {
                this.MdtA4re8 = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i2 = i;
                PairingCardFragment pairingCardFragment = this.MdtA4re8;
                switch (i2) {
                    case 0:
                        ej0.sjUBp5pO(pairingCardFragment).wxUZMvaN();
                        break;
                    case 1:
                        x90 x90Var = pairingCardFragment.FXJmAAN1().wxUZMvaN;
                        Boolean bool = Boolean.TRUE;
                        x90Var.getClass();
                        x90Var.eVhOlqcC(null, bool);
                        break;
                    case 2:
                        x90 x90Var2 = pairingCardFragment.FXJmAAN1().wxUZMvaN;
                        Boolean bool2 = Boolean.FALSE;
                        x90Var2.getClass();
                        x90Var2.eVhOlqcC(null, bool2);
                        break;
                    case 3:
                        x90 x90Var3 = pairingCardFragment.FXJmAAN1().wxUZMvaN;
                        Boolean bool3 = Boolean.FALSE;
                        x90Var3.getClass();
                        x90Var3.eVhOlqcC(null, bool3);
                        break;
                    case 4:
                        pairingCardFragment.FXJmAAN1().VgvYg0wo.jb9XjC4I(null);
                        break;
                    case 5:
                        pairingCardFragment.FXJmAAN1().VgvYg0wo.jb9XjC4I(null);
                        break;
                    default:
                        xx xxVar = ((fy) pairingCardFragment.FXJmAAN1().P7K7Inc8.NCTxEWno.Qr9iLBAD()).qoPGr6Ce;
                        if (xxVar != null) {
                            String str = xxVar.NCTxEWno;
                            String ygLcUYwZ = pairingCardFragment.ygLcUYwZ(R.string.share_summary, str, xxVar.P7K7Inc8, xxVar.b2ZJblxo, Integer.valueOf(xxVar.jb9XjC4I), xxVar.eVhOlqcC);
                            ygLcUYwZ.getClass();
                            Object systemService = pairingCardFragment.aZz0PFXp().getSystemService("clipboard");
                            systemService.getClass();
                            ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText(str, ygLcUYwZ));
                            Toast.makeText(pairingCardFragment.aZz0PFXp(), R.string.share_done, 0).show();
                            break;
                        }
                        break;
                }
            }
        });
        tj tjVar6 = this.pP9Y2m6O;
        tjVar6.getClass();
        final int i2 = 1;
        tjVar6.NCTxEWno.setOnClickListener(new View.OnClickListener(this) { // from class: cy
            public final /* synthetic */ PairingCardFragment MdtA4re8;

            {
                this.MdtA4re8 = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i22 = i2;
                PairingCardFragment pairingCardFragment = this.MdtA4re8;
                switch (i22) {
                    case 0:
                        ej0.sjUBp5pO(pairingCardFragment).wxUZMvaN();
                        break;
                    case 1:
                        x90 x90Var = pairingCardFragment.FXJmAAN1().wxUZMvaN;
                        Boolean bool = Boolean.TRUE;
                        x90Var.getClass();
                        x90Var.eVhOlqcC(null, bool);
                        break;
                    case 2:
                        x90 x90Var2 = pairingCardFragment.FXJmAAN1().wxUZMvaN;
                        Boolean bool2 = Boolean.FALSE;
                        x90Var2.getClass();
                        x90Var2.eVhOlqcC(null, bool2);
                        break;
                    case 3:
                        x90 x90Var3 = pairingCardFragment.FXJmAAN1().wxUZMvaN;
                        Boolean bool3 = Boolean.FALSE;
                        x90Var3.getClass();
                        x90Var3.eVhOlqcC(null, bool3);
                        break;
                    case 4:
                        pairingCardFragment.FXJmAAN1().VgvYg0wo.jb9XjC4I(null);
                        break;
                    case 5:
                        pairingCardFragment.FXJmAAN1().VgvYg0wo.jb9XjC4I(null);
                        break;
                    default:
                        xx xxVar = ((fy) pairingCardFragment.FXJmAAN1().P7K7Inc8.NCTxEWno.Qr9iLBAD()).qoPGr6Ce;
                        if (xxVar != null) {
                            String str = xxVar.NCTxEWno;
                            String ygLcUYwZ = pairingCardFragment.ygLcUYwZ(R.string.share_summary, str, xxVar.P7K7Inc8, xxVar.b2ZJblxo, Integer.valueOf(xxVar.jb9XjC4I), xxVar.eVhOlqcC);
                            ygLcUYwZ.getClass();
                            Object systemService = pairingCardFragment.aZz0PFXp().getSystemService("clipboard");
                            systemService.getClass();
                            ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText(str, ygLcUYwZ));
                            Toast.makeText(pairingCardFragment.aZz0PFXp(), R.string.share_done, 0).show();
                            break;
                        }
                        break;
                }
            }
        });
        tj tjVar7 = this.pP9Y2m6O;
        tjVar7.getClass();
        final int i3 = 2;
        tjVar7.lDXGDhIF.setOnClickListener(new View.OnClickListener(this) { // from class: cy
            public final /* synthetic */ PairingCardFragment MdtA4re8;

            {
                this.MdtA4re8 = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i22 = i3;
                PairingCardFragment pairingCardFragment = this.MdtA4re8;
                switch (i22) {
                    case 0:
                        ej0.sjUBp5pO(pairingCardFragment).wxUZMvaN();
                        break;
                    case 1:
                        x90 x90Var = pairingCardFragment.FXJmAAN1().wxUZMvaN;
                        Boolean bool = Boolean.TRUE;
                        x90Var.getClass();
                        x90Var.eVhOlqcC(null, bool);
                        break;
                    case 2:
                        x90 x90Var2 = pairingCardFragment.FXJmAAN1().wxUZMvaN;
                        Boolean bool2 = Boolean.FALSE;
                        x90Var2.getClass();
                        x90Var2.eVhOlqcC(null, bool2);
                        break;
                    case 3:
                        x90 x90Var3 = pairingCardFragment.FXJmAAN1().wxUZMvaN;
                        Boolean bool3 = Boolean.FALSE;
                        x90Var3.getClass();
                        x90Var3.eVhOlqcC(null, bool3);
                        break;
                    case 4:
                        pairingCardFragment.FXJmAAN1().VgvYg0wo.jb9XjC4I(null);
                        break;
                    case 5:
                        pairingCardFragment.FXJmAAN1().VgvYg0wo.jb9XjC4I(null);
                        break;
                    default:
                        xx xxVar = ((fy) pairingCardFragment.FXJmAAN1().P7K7Inc8.NCTxEWno.Qr9iLBAD()).qoPGr6Ce;
                        if (xxVar != null) {
                            String str = xxVar.NCTxEWno;
                            String ygLcUYwZ = pairingCardFragment.ygLcUYwZ(R.string.share_summary, str, xxVar.P7K7Inc8, xxVar.b2ZJblxo, Integer.valueOf(xxVar.jb9XjC4I), xxVar.eVhOlqcC);
                            ygLcUYwZ.getClass();
                            Object systemService = pairingCardFragment.aZz0PFXp().getSystemService("clipboard");
                            systemService.getClass();
                            ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText(str, ygLcUYwZ));
                            Toast.makeText(pairingCardFragment.aZz0PFXp(), R.string.share_done, 0).show();
                            break;
                        }
                        break;
                }
            }
        });
        tj tjVar8 = this.pP9Y2m6O;
        tjVar8.getClass();
        final int i4 = 3;
        tjVar8.wxUZMvaN.setOnClickListener(new View.OnClickListener(this) { // from class: cy
            public final /* synthetic */ PairingCardFragment MdtA4re8;

            {
                this.MdtA4re8 = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i22 = i4;
                PairingCardFragment pairingCardFragment = this.MdtA4re8;
                switch (i22) {
                    case 0:
                        ej0.sjUBp5pO(pairingCardFragment).wxUZMvaN();
                        break;
                    case 1:
                        x90 x90Var = pairingCardFragment.FXJmAAN1().wxUZMvaN;
                        Boolean bool = Boolean.TRUE;
                        x90Var.getClass();
                        x90Var.eVhOlqcC(null, bool);
                        break;
                    case 2:
                        x90 x90Var2 = pairingCardFragment.FXJmAAN1().wxUZMvaN;
                        Boolean bool2 = Boolean.FALSE;
                        x90Var2.getClass();
                        x90Var2.eVhOlqcC(null, bool2);
                        break;
                    case 3:
                        x90 x90Var3 = pairingCardFragment.FXJmAAN1().wxUZMvaN;
                        Boolean bool3 = Boolean.FALSE;
                        x90Var3.getClass();
                        x90Var3.eVhOlqcC(null, bool3);
                        break;
                    case 4:
                        pairingCardFragment.FXJmAAN1().VgvYg0wo.jb9XjC4I(null);
                        break;
                    case 5:
                        pairingCardFragment.FXJmAAN1().VgvYg0wo.jb9XjC4I(null);
                        break;
                    default:
                        xx xxVar = ((fy) pairingCardFragment.FXJmAAN1().P7K7Inc8.NCTxEWno.Qr9iLBAD()).qoPGr6Ce;
                        if (xxVar != null) {
                            String str = xxVar.NCTxEWno;
                            String ygLcUYwZ = pairingCardFragment.ygLcUYwZ(R.string.share_summary, str, xxVar.P7K7Inc8, xxVar.b2ZJblxo, Integer.valueOf(xxVar.jb9XjC4I), xxVar.eVhOlqcC);
                            ygLcUYwZ.getClass();
                            Object systemService = pairingCardFragment.aZz0PFXp().getSystemService("clipboard");
                            systemService.getClass();
                            ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText(str, ygLcUYwZ));
                            Toast.makeText(pairingCardFragment.aZz0PFXp(), R.string.share_done, 0).show();
                            break;
                        }
                        break;
                }
            }
        });
        tj tjVar9 = this.pP9Y2m6O;
        tjVar9.getClass();
        final int i5 = 4;
        tjVar9.ygLcUYwZ.setOnClickListener(new View.OnClickListener(this) { // from class: cy
            public final /* synthetic */ PairingCardFragment MdtA4re8;

            {
                this.MdtA4re8 = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i22 = i5;
                PairingCardFragment pairingCardFragment = this.MdtA4re8;
                switch (i22) {
                    case 0:
                        ej0.sjUBp5pO(pairingCardFragment).wxUZMvaN();
                        break;
                    case 1:
                        x90 x90Var = pairingCardFragment.FXJmAAN1().wxUZMvaN;
                        Boolean bool = Boolean.TRUE;
                        x90Var.getClass();
                        x90Var.eVhOlqcC(null, bool);
                        break;
                    case 2:
                        x90 x90Var2 = pairingCardFragment.FXJmAAN1().wxUZMvaN;
                        Boolean bool2 = Boolean.FALSE;
                        x90Var2.getClass();
                        x90Var2.eVhOlqcC(null, bool2);
                        break;
                    case 3:
                        x90 x90Var3 = pairingCardFragment.FXJmAAN1().wxUZMvaN;
                        Boolean bool3 = Boolean.FALSE;
                        x90Var3.getClass();
                        x90Var3.eVhOlqcC(null, bool3);
                        break;
                    case 4:
                        pairingCardFragment.FXJmAAN1().VgvYg0wo.jb9XjC4I(null);
                        break;
                    case 5:
                        pairingCardFragment.FXJmAAN1().VgvYg0wo.jb9XjC4I(null);
                        break;
                    default:
                        xx xxVar = ((fy) pairingCardFragment.FXJmAAN1().P7K7Inc8.NCTxEWno.Qr9iLBAD()).qoPGr6Ce;
                        if (xxVar != null) {
                            String str = xxVar.NCTxEWno;
                            String ygLcUYwZ = pairingCardFragment.ygLcUYwZ(R.string.share_summary, str, xxVar.P7K7Inc8, xxVar.b2ZJblxo, Integer.valueOf(xxVar.jb9XjC4I), xxVar.eVhOlqcC);
                            ygLcUYwZ.getClass();
                            Object systemService = pairingCardFragment.aZz0PFXp().getSystemService("clipboard");
                            systemService.getClass();
                            ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText(str, ygLcUYwZ));
                            Toast.makeText(pairingCardFragment.aZz0PFXp(), R.string.share_done, 0).show();
                            break;
                        }
                        break;
                }
            }
        });
        tj tjVar10 = this.pP9Y2m6O;
        tjVar10.getClass();
        final int i6 = 5;
        tjVar10.MdtA4re8.setOnClickListener(new View.OnClickListener(this) { // from class: cy
            public final /* synthetic */ PairingCardFragment MdtA4re8;

            {
                this.MdtA4re8 = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i22 = i6;
                PairingCardFragment pairingCardFragment = this.MdtA4re8;
                switch (i22) {
                    case 0:
                        ej0.sjUBp5pO(pairingCardFragment).wxUZMvaN();
                        break;
                    case 1:
                        x90 x90Var = pairingCardFragment.FXJmAAN1().wxUZMvaN;
                        Boolean bool = Boolean.TRUE;
                        x90Var.getClass();
                        x90Var.eVhOlqcC(null, bool);
                        break;
                    case 2:
                        x90 x90Var2 = pairingCardFragment.FXJmAAN1().wxUZMvaN;
                        Boolean bool2 = Boolean.FALSE;
                        x90Var2.getClass();
                        x90Var2.eVhOlqcC(null, bool2);
                        break;
                    case 3:
                        x90 x90Var3 = pairingCardFragment.FXJmAAN1().wxUZMvaN;
                        Boolean bool3 = Boolean.FALSE;
                        x90Var3.getClass();
                        x90Var3.eVhOlqcC(null, bool3);
                        break;
                    case 4:
                        pairingCardFragment.FXJmAAN1().VgvYg0wo.jb9XjC4I(null);
                        break;
                    case 5:
                        pairingCardFragment.FXJmAAN1().VgvYg0wo.jb9XjC4I(null);
                        break;
                    default:
                        xx xxVar = ((fy) pairingCardFragment.FXJmAAN1().P7K7Inc8.NCTxEWno.Qr9iLBAD()).qoPGr6Ce;
                        if (xxVar != null) {
                            String str = xxVar.NCTxEWno;
                            String ygLcUYwZ = pairingCardFragment.ygLcUYwZ(R.string.share_summary, str, xxVar.P7K7Inc8, xxVar.b2ZJblxo, Integer.valueOf(xxVar.jb9XjC4I), xxVar.eVhOlqcC);
                            ygLcUYwZ.getClass();
                            Object systemService = pairingCardFragment.aZz0PFXp().getSystemService("clipboard");
                            systemService.getClass();
                            ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText(str, ygLcUYwZ));
                            Toast.makeText(pairingCardFragment.aZz0PFXp(), R.string.share_done, 0).show();
                            break;
                        }
                        break;
                }
            }
        });
        tj tjVar11 = this.pP9Y2m6O;
        tjVar11.getClass();
        final int i7 = 6;
        tjVar11.KlHjfFWx.setOnClickListener(new View.OnClickListener(this) { // from class: cy
            public final /* synthetic */ PairingCardFragment MdtA4re8;

            {
                this.MdtA4re8 = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i22 = i7;
                PairingCardFragment pairingCardFragment = this.MdtA4re8;
                switch (i22) {
                    case 0:
                        ej0.sjUBp5pO(pairingCardFragment).wxUZMvaN();
                        break;
                    case 1:
                        x90 x90Var = pairingCardFragment.FXJmAAN1().wxUZMvaN;
                        Boolean bool = Boolean.TRUE;
                        x90Var.getClass();
                        x90Var.eVhOlqcC(null, bool);
                        break;
                    case 2:
                        x90 x90Var2 = pairingCardFragment.FXJmAAN1().wxUZMvaN;
                        Boolean bool2 = Boolean.FALSE;
                        x90Var2.getClass();
                        x90Var2.eVhOlqcC(null, bool2);
                        break;
                    case 3:
                        x90 x90Var3 = pairingCardFragment.FXJmAAN1().wxUZMvaN;
                        Boolean bool3 = Boolean.FALSE;
                        x90Var3.getClass();
                        x90Var3.eVhOlqcC(null, bool3);
                        break;
                    case 4:
                        pairingCardFragment.FXJmAAN1().VgvYg0wo.jb9XjC4I(null);
                        break;
                    case 5:
                        pairingCardFragment.FXJmAAN1().VgvYg0wo.jb9XjC4I(null);
                        break;
                    default:
                        xx xxVar = ((fy) pairingCardFragment.FXJmAAN1().P7K7Inc8.NCTxEWno.Qr9iLBAD()).qoPGr6Ce;
                        if (xxVar != null) {
                            String str = xxVar.NCTxEWno;
                            String ygLcUYwZ = pairingCardFragment.ygLcUYwZ(R.string.share_summary, str, xxVar.P7K7Inc8, xxVar.b2ZJblxo, Integer.valueOf(xxVar.jb9XjC4I), xxVar.eVhOlqcC);
                            ygLcUYwZ.getClass();
                            Object systemService = pairingCardFragment.aZz0PFXp().getSystemService("clipboard");
                            systemService.getClass();
                            ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText(str, ygLcUYwZ));
                            Toast.makeText(pairingCardFragment.aZz0PFXp(), R.string.share_done, 0).show();
                            break;
                        }
                        break;
                }
            }
        });
        fn.Ey6iv0m0(ej0.FySoLYna(lDXGDhIF()), null, new dy(this, null, i2), 3);
    }

    public final void zCflySGU(bp9dZ9BB bp9dz9bb, q6 q6Var) {
        ((TextView) bp9dz9bb.MdtA4re8).setText(q6Var.qoPGr6Ce);
        ((TextView) bp9dz9bb.VgvYg0wo).setText(q6Var.NCTxEWno);
        ((TextView) bp9dz9bb.qoPGr6Ce).setText(q6Var.MdtA4re8);
        ((TextView) bp9dz9bb.wxUZMvaN).setText(q6Var.wxUZMvaN);
        ((TextView) bp9dz9bb.P7K7Inc8).setText(ygLcUYwZ(R.string.value_minutes, Integer.valueOf(q6Var.VgvYg0wo)));
        ((TextView) bp9dz9bb.NCTxEWno).setText(q6Var.P7K7Inc8);
    }
}
