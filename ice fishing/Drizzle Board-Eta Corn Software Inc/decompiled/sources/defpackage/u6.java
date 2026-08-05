package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.kolosta.rejin.jilosa.R;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class u6 extends jp {
    public final /* synthetic */ int MdtA4re8 = 0;
    public final zk wxUZMvaN;
    public static final r1 VgvYg0wo = new r1(1);
    public static final r1 P7K7Inc8 = new r1(2);
    public static final r1 b2ZJblxo = new r1(4);
    public static final r1 Qr9iLBAD = new r1(5);
    public static final r1 jb9XjC4I = new r1(7);
    public static final r1 eVhOlqcC = new r1(9);
    public static final r1 k3x7lurq = new r1(10);
    public static final r1 ow5vqvCr = new r1(11);
    public static final r1 OnDfzHZD = new r1(12);

    public u6(t40 t40Var, byte b) {
        super(OnDfzHZD);
        this.wxUZMvaN = t40Var;
    }

    @Override // defpackage.m10
    public final g20 MdtA4re8(ViewGroup viewGroup) {
        switch (this.MdtA4re8) {
            case 0:
                View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_compare_pick, viewGroup, false);
                int i = R.id.pick_emoji;
                TextView textView = (TextView) n50.qoPGr6Ce(inflate, R.id.pick_emoji);
                if (textView != null) {
                    i = R.id.pick_meta;
                    TextView textView2 = (TextView) n50.qoPGr6Ce(inflate, R.id.pick_meta);
                    if (textView2 != null) {
                        i = R.id.pick_name;
                        TextView textView3 = (TextView) n50.qoPGr6Ce(inflate, R.id.pick_name);
                        if (textView3 != null) {
                            return new t6(this, new ln((LinearLayout) inflate, textView, textView2, textView3));
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
            case 1:
                View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_compared_pair, viewGroup, false);
                int i2 = R.id.compared_left_emoji;
                TextView textView4 = (TextView) n50.qoPGr6Ce(inflate2, R.id.compared_left_emoji);
                if (textView4 != null) {
                    i2 = R.id.compared_left_name;
                    TextView textView5 = (TextView) n50.qoPGr6Ce(inflate2, R.id.compared_left_name);
                    if (textView5 != null) {
                        i2 = R.id.compared_right_emoji;
                        TextView textView6 = (TextView) n50.qoPGr6Ce(inflate2, R.id.compared_right_emoji);
                        if (textView6 != null) {
                            i2 = R.id.compared_right_name;
                            TextView textView7 = (TextView) n50.qoPGr6Ce(inflate2, R.id.compared_right_name);
                            if (textView7 != null) {
                                return new v6(this, new mn((LinearLayout) inflate2, textView4, textView5, textView6, textView7));
                            }
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(inflate2.getResources().getResourceName(i2)));
            case 2:
                View inflate3 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_letter_index, viewGroup, false);
                if (inflate3 == null) {
                    throw new NullPointerException("rootView");
                }
                TextView textView8 = (TextView) inflate3;
                return new lo(this, new nn(textView8, textView8));
            case 3:
                View inflate4 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_my_rating, viewGroup, false);
                int i3 = R.id.rating_face;
                TextView textView9 = (TextView) n50.qoPGr6Ce(inflate4, R.id.rating_face);
                if (textView9 != null) {
                    i3 = R.id.rating_label;
                    TextView textView10 = (TextView) n50.qoPGr6Ce(inflate4, R.id.rating_label);
                    if (textView10 != null) {
                        i3 = R.id.rating_pair_emoji;
                        TextView textView11 = (TextView) n50.qoPGr6Ce(inflate4, R.id.rating_pair_emoji);
                        if (textView11 != null) {
                            i3 = R.id.rating_pair_name;
                            TextView textView12 = (TextView) n50.qoPGr6Ce(inflate4, R.id.rating_pair_name);
                            if (textView12 != null) {
                                return new rt(this, new mn((LinearLayout) inflate4, textView9, textView10, textView11, textView12));
                            }
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(inflate4.getResources().getResourceName(i3)));
            case 4:
                View inflate5 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_quick_tag, viewGroup, false);
                if (inflate5 == null) {
                    throw new NullPointerException("rootView");
                }
                TextView textView13 = (TextView) inflate5;
                return new o00(this, new nn(textView13, textView13));
            case 5:
                View inflate6 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_related_pick, viewGroup, false);
                int i4 = R.id.related_base;
                TextView textView14 = (TextView) n50.qoPGr6Ce(inflate6, R.id.related_base);
                if (textView14 != null) {
                    i4 = R.id.related_emoji;
                    TextView textView15 = (TextView) n50.qoPGr6Ce(inflate6, R.id.related_emoji);
                    if (textView15 != null) {
                        i4 = R.id.related_name;
                        TextView textView16 = (TextView) n50.qoPGr6Ce(inflate6, R.id.related_name);
                        if (textView16 != null) {
                            i4 = R.id.related_scope;
                            TextView textView17 = (TextView) n50.qoPGr6Ce(inflate6, R.id.related_scope);
                            if (textView17 != null) {
                                return new q20(this, new mn((LinearLayout) inflate6, textView14, textView15, textView16, textView17));
                            }
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(inflate6.getResources().getResourceName(i4)));
            case 6:
                View inflate7 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_sort_card, viewGroup, false);
                int i5 = R.id.sort_emoji;
                TextView textView18 = (TextView) n50.qoPGr6Ce(inflate7, R.id.sort_emoji);
                if (textView18 != null) {
                    i5 = R.id.sort_meta;
                    TextView textView19 = (TextView) n50.qoPGr6Ce(inflate7, R.id.sort_meta);
                    if (textView19 != null) {
                        i5 = R.id.sort_name;
                        TextView textView20 = (TextView) n50.qoPGr6Ce(inflate7, R.id.sort_name);
                        if (textView20 != null) {
                            i5 = R.id.sort_position;
                            TextView textView21 = (TextView) n50.qoPGr6Ce(inflate7, R.id.sort_position);
                            if (textView21 != null) {
                                LinearLayout linearLayout = (LinearLayout) inflate7;
                                return new s70(this, new bp9dZ9BB(linearLayout, textView18, textView19, textView20, textView21, linearLayout));
                            }
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(inflate7.getResources().getResourceName(i5)));
            case 7:
                View inflate8 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_sprint_average, viewGroup, false);
                int i6 = R.id.average_name;
                TextView textView22 = (TextView) n50.qoPGr6Ce(inflate8, R.id.average_name);
                if (textView22 != null) {
                    i6 = R.id.average_sessions;
                    TextView textView23 = (TextView) n50.qoPGr6Ce(inflate8, R.id.average_sessions);
                    if (textView23 != null) {
                        i6 = R.id.average_value;
                        TextView textView24 = (TextView) n50.qoPGr6Ce(inflate8, R.id.average_value);
                        if (textView24 != null) {
                            return new i80(this, new ln((LinearLayout) inflate8, textView22, textView23, textView24));
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(inflate8.getResources().getResourceName(i6)));
            default:
                View inflate9 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_sprint_history, viewGroup, false);
                int i7 = R.id.history_accuracy;
                TextView textView25 = (TextView) n50.qoPGr6Ce(inflate9, R.id.history_accuracy);
                if (textView25 != null) {
                    i7 = R.id.history_meta;
                    TextView textView26 = (TextView) n50.qoPGr6Ce(inflate9, R.id.history_meta);
                    if (textView26 != null) {
                        i7 = R.id.history_trait;
                        TextView textView27 = (TextView) n50.qoPGr6Ce(inflate9, R.id.history_trait);
                        if (textView27 != null) {
                            return new j80(this, new ln((LinearLayout) inflate9, textView25, textView26, textView27));
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(inflate9.getResources().getResourceName(i7)));
        }
    }

    @Override // defpackage.m10
    public final void NCTxEWno(g20 g20Var, int i) {
        int i2 = 2;
        switch (this.MdtA4re8) {
            case 0:
                t6 t6Var = (t6) g20Var;
                Object wxUZMvaN = wxUZMvaN(i);
                wxUZMvaN.getClass();
                py pyVar = (py) wxUZMvaN;
                ln lnVar = t6Var.Ey6iv0m0;
                lnVar.NCTxEWno.setText(pyVar.MdtA4re8);
                lnVar.wxUZMvaN.setText(pyVar.NCTxEWno);
                TextView textView = lnVar.MdtA4re8;
                LinearLayout linearLayout = lnVar.qoPGr6Ce;
                textView.setText(linearLayout.getContext().getString(R.string.value_sort_meta, pyVar.wxUZMvaN, pyVar.b2ZJblxo));
                linearLayout.setOnClickListener(new s6(t6Var.I5GHvsYW, 0, pyVar));
                break;
            case 1:
                v6 v6Var = (v6) g20Var;
                Object wxUZMvaN2 = wxUZMvaN(i);
                wxUZMvaN2.getClass();
                w6 w6Var = (w6) wxUZMvaN2;
                mn mnVar = v6Var.Ey6iv0m0;
                TextView textView2 = mnVar.NCTxEWno;
                q6 q6Var = w6Var.NCTxEWno;
                textView2.setText(q6Var.qoPGr6Ce);
                TextView textView3 = mnVar.wxUZMvaN;
                q6 q6Var2 = w6Var.MdtA4re8;
                textView3.setText(q6Var2.qoPGr6Ce);
                mnVar.MdtA4re8.setText(q6Var.NCTxEWno);
                mnVar.VgvYg0wo.setText(q6Var2.NCTxEWno);
                mnVar.qoPGr6Ce.setOnClickListener(new s6(v6Var.I5GHvsYW, 1, w6Var));
                break;
            case 2:
                lo loVar = (lo) g20Var;
                Object wxUZMvaN3 = wxUZMvaN(i);
                wxUZMvaN3.getClass();
                String str = (String) wxUZMvaN3;
                nn nnVar = loVar.Ey6iv0m0;
                nnVar.NCTxEWno.setText(str);
                nnVar.qoPGr6Ce.setOnClickListener(new s6(loVar.I5GHvsYW, i2, str));
                break;
            case 3:
                rt rtVar = (rt) g20Var;
                Object wxUZMvaN4 = wxUZMvaN(i);
                wxUZMvaN4.getClass();
                c10 c10Var = (c10) wxUZMvaN4;
                mn mnVar2 = rtVar.Ey6iv0m0;
                mnVar2.wxUZMvaN.setText(c10Var.MdtA4re8);
                mnVar2.VgvYg0wo.setText(c10Var.NCTxEWno);
                TextView textView4 = mnVar2.MdtA4re8;
                int i3 = c10Var.wxUZMvaN;
                int i4 = 3;
                textView4.setText(i3 != 2 ? i3 != 3 ? i3 != 4 ? R.string.rating_meh : R.string.rating_love : R.string.rating_good : R.string.rating_ok);
                mnVar2.NCTxEWno.setText(i3 != 2 ? i3 != 3 ? i3 != 4 ? R.string.emoji_rating_meh : R.string.emoji_rating_love : R.string.emoji_rating_good : R.string.emoji_rating_ok);
                mnVar2.qoPGr6Ce.setOnClickListener(new s6(rtVar.I5GHvsYW, i4, c10Var));
                break;
            case 4:
                o00 o00Var = (o00) g20Var;
                Object wxUZMvaN5 = wxUZMvaN(i);
                wxUZMvaN5.getClass();
                String str2 = (String) wxUZMvaN5;
                nn nnVar2 = o00Var.Ey6iv0m0;
                nnVar2.NCTxEWno.setText(str2);
                nnVar2.qoPGr6Ce.setOnClickListener(new s6(o00Var.I5GHvsYW, 6, str2));
                break;
            case 5:
                q20 q20Var = (q20) g20Var;
                Object wxUZMvaN6 = wxUZMvaN(i);
                wxUZMvaN6.getClass();
                py pyVar2 = (py) wxUZMvaN6;
                mn mnVar3 = q20Var.Ey6iv0m0;
                mnVar3.MdtA4re8.setText(pyVar2.MdtA4re8);
                mnVar3.wxUZMvaN.setText(pyVar2.NCTxEWno);
                TextView textView5 = mnVar3.NCTxEWno;
                LinearLayout linearLayout2 = mnVar3.qoPGr6Ce;
                textView5.setText(linearLayout2.getContext().getString(R.string.value_base, pyVar2.wxUZMvaN));
                mnVar3.VgvYg0wo.setText(pyVar2.Qr9iLBAD);
                linearLayout2.setOnClickListener(new s6(q20Var.I5GHvsYW, 7, pyVar2));
                break;
            case 6:
                s70 s70Var = (s70) g20Var;
                Object wxUZMvaN7 = wxUZMvaN(i);
                wxUZMvaN7.getClass();
                t70 t70Var = (t70) wxUZMvaN7;
                bp9dZ9BB bp9dz9bb = s70Var.Ey6iv0m0;
                Context context = ((LinearLayout) bp9dz9bb.qoPGr6Ce).getContext();
                ((TextView) bp9dz9bb.VgvYg0wo).setText(context.getString(R.string.value_position, Integer.valueOf(t70Var.P7K7Inc8)));
                ((TextView) bp9dz9bb.NCTxEWno).setText(t70Var.MdtA4re8);
                ((TextView) bp9dz9bb.wxUZMvaN).setText(t70Var.NCTxEWno);
                ((TextView) bp9dz9bb.MdtA4re8).setText(context.getString(R.string.value_sort_meta, t70Var.wxUZMvaN, t70Var.VgvYg0wo));
                LinearLayout linearLayout3 = (LinearLayout) bp9dz9bb.P7K7Inc8;
                linearLayout3.setBackgroundResource(t70Var.b2ZJblxo ? R.drawable.bg_sort_slot_selected : R.drawable.bg_sort_slot);
                linearLayout3.setOnClickListener(new s6(s70Var.I5GHvsYW, 8, t70Var));
                break;
            case 7:
                i80 i80Var = (i80) g20Var;
                Object wxUZMvaN8 = wxUZMvaN(i);
                wxUZMvaN8.getClass();
                k1 k1Var = (k1) wxUZMvaN8;
                ln lnVar2 = i80Var.Ey6iv0m0;
                LinearLayout linearLayout4 = lnVar2.qoPGr6Ce;
                Context context2 = linearLayout4.getContext();
                lnVar2.NCTxEWno.setText(k1Var.qoPGr6Ce);
                lnVar2.MdtA4re8.setText(context2.getString(R.string.value_sessions, Integer.valueOf(k1Var.NCTxEWno)));
                lnVar2.wxUZMvaN.setText(context2.getString(R.string.value_percent, Integer.valueOf(k1Var.MdtA4re8)));
                linearLayout4.setOnClickListener(new s6(i80Var.I5GHvsYW, 9, k1Var));
                break;
            default:
                j80 j80Var = (j80) g20Var;
                Object wxUZMvaN9 = wxUZMvaN(i);
                wxUZMvaN9.getClass();
                k80 k80Var = (k80) wxUZMvaN9;
                ln lnVar3 = j80Var.Ey6iv0m0;
                LinearLayout linearLayout5 = lnVar3.qoPGr6Ce;
                Context context3 = linearLayout5.getContext();
                TextView textView6 = lnVar3.NCTxEWno;
                int i5 = k80Var.MdtA4re8;
                textView6.setText(context3.getString(R.string.value_percent, Integer.valueOf(i5)));
                lnVar3.wxUZMvaN.setText(context3.getString(k80Var.NCTxEWno));
                lnVar3.MdtA4re8.setText(context3.getString(R.string.value_round_meta, g50.VgvYg0wo(context3, k80Var.wxUZMvaN), Integer.valueOf(i5)));
                linearLayout5.setOnClickListener(new s6(j80Var.I5GHvsYW, 10, k80Var));
                break;
        }
    }

    public u6(ix ixVar, char c) {
        super(jb9XjC4I);
        this.wxUZMvaN = ixVar;
    }

    public u6(ix ixVar) {
        super(P7K7Inc8);
        this.wxUZMvaN = ixVar;
    }

    public u6(b2ZJblxo b2zjblxo) {
        super(VgvYg0wo);
        this.wxUZMvaN = b2zjblxo;
    }

    public u6(b2ZJblxo b2zjblxo, byte b) {
        super(k3x7lurq);
        this.wxUZMvaN = b2zjblxo;
    }

    public u6(t40 t40Var) {
        super(eVhOlqcC);
        this.wxUZMvaN = t40Var;
    }

    public u6(sb0 sb0Var) {
        super(ow5vqvCr);
        this.wxUZMvaN = sb0Var;
    }

    public u6(ix ixVar, byte b) {
        super(b2ZJblxo);
        this.wxUZMvaN = ixVar;
    }

    public u6(sb0 sb0Var, byte b) {
        super(Qr9iLBAD);
        this.wxUZMvaN = sb0Var;
    }
}
