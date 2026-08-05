package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.kolosta.rejin.jilosa.R;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class s1 extends jp {
    public final /* synthetic */ int MdtA4re8;
    public static final r1 wxUZMvaN = new r1(0);
    public static final r1 VgvYg0wo = new r1(3);
    public static final r1 P7K7Inc8 = new r1(8);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s1(ra raVar, int i) {
        super(raVar);
        this.MdtA4re8 = i;
    }

    @Override // defpackage.m10
    public final g20 MdtA4re8(ViewGroup viewGroup) {
        switch (this.MdtA4re8) {
            case 0:
                View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_badge, viewGroup, false);
                int i = R.id.badge_emoji;
                TextView textView = (TextView) n50.qoPGr6Ce(inflate, R.id.badge_emoji);
                if (textView != null) {
                    i = R.id.badge_lock;
                    ImageView imageView = (ImageView) n50.qoPGr6Ce(inflate, R.id.badge_lock);
                    if (imageView != null) {
                        i = R.id.badge_name;
                        TextView textView2 = (TextView) n50.qoPGr6Ce(inflate, R.id.badge_name);
                        if (textView2 != null) {
                            LinearLayout linearLayout = (LinearLayout) inflate;
                            return new q1(new kn(linearLayout, textView, imageView, textView2, linearLayout));
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
            case 1:
                View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_flow_step, viewGroup, false);
                int i2 = R.id.flow_detail;
                TextView textView3 = (TextView) n50.qoPGr6Ce(inflate2, R.id.flow_detail);
                if (textView3 != null) {
                    i2 = R.id.flow_line;
                    View qoPGr6Ce = n50.qoPGr6Ce(inflate2, R.id.flow_line);
                    if (qoPGr6Ce != null) {
                        i2 = R.id.flow_stage;
                        TextView textView4 = (TextView) n50.qoPGr6Ce(inflate2, R.id.flow_stage);
                        if (textView4 != null) {
                            return new lh(new VZZbw3BB((LinearLayout) inflate2, textView3, qoPGr6Ce, textView4));
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(inflate2.getResources().getResourceName(i2)));
            default:
                View inflate3 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_recap_row, viewGroup, false);
                int i3 = R.id.recap_correct_place;
                TextView textView5 = (TextView) n50.qoPGr6Ce(inflate3, R.id.recap_correct_place);
                if (textView5 != null) {
                    i3 = R.id.recap_emoji;
                    TextView textView6 = (TextView) n50.qoPGr6Ce(inflate3, R.id.recap_emoji);
                    if (textView6 != null) {
                        i3 = R.id.recap_name;
                        TextView textView7 = (TextView) n50.qoPGr6Ce(inflate3, R.id.recap_name);
                        if (textView7 != null) {
                            LinearLayout linearLayout2 = (LinearLayout) inflate3;
                            i3 = R.id.recap_trait_value;
                            TextView textView8 = (TextView) n50.qoPGr6Ce(inflate3, R.id.recap_trait_value);
                            if (textView8 != null) {
                                i3 = R.id.recap_your_place;
                                TextView textView9 = (TextView) n50.qoPGr6Ce(inflate3, R.id.recap_your_place);
                                if (textView9 != null) {
                                    return new f10(new hd0(linearLayout2, textView5, textView6, textView7, linearLayout2, textView8, textView9));
                                }
                            }
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(inflate3.getResources().getResourceName(i3)));
        }
    }

    @Override // defpackage.m10
    public final void NCTxEWno(g20 g20Var, int i) {
        switch (this.MdtA4re8) {
            case 0:
                Object wxUZMvaN2 = wxUZMvaN(i);
                wxUZMvaN2.getClass();
                u1 u1Var = (u1) wxUZMvaN2;
                kn knVar = ((q1) g20Var).Ey6iv0m0;
                Context context = ((LinearLayout) knVar.NCTxEWno).getContext();
                TextView textView = (TextView) knVar.wxUZMvaN;
                textView.setText(u1Var.NCTxEWno);
                TextView textView2 = (TextView) knVar.VgvYg0wo;
                textView2.setText(u1Var.qoPGr6Ce);
                ImageView imageView = (ImageView) knVar.P7K7Inc8;
                boolean z = u1Var.MdtA4re8;
                imageView.setVisibility(z ? 8 : 0);
                ((LinearLayout) knVar.MdtA4re8).setBackgroundResource(z ? R.drawable.bg_badge_unlocked : R.drawable.bg_badge_locked);
                textView.setAlpha(z ? 1.0f : 0.4f);
                textView2.setTextColor(context.getColor(z ? R.color.badge_unlocked : R.color.text_hint));
                break;
            case 1:
                Object wxUZMvaN3 = wxUZMvaN(i);
                wxUZMvaN3.getClass();
                ah ahVar = (ah) wxUZMvaN3;
                VZZbw3BB vZZbw3BB = ((lh) g20Var).Ey6iv0m0;
                ((TextView) vZZbw3BB.wxUZMvaN).setText(ahVar.qoPGr6Ce);
                ((TextView) vZZbw3BB.MdtA4re8).setText(ahVar.NCTxEWno);
                ((View) vZZbw3BB.NCTxEWno).setVisibility(ahVar.MdtA4re8 ? 4 : 0);
                break;
            default:
                Object wxUZMvaN4 = wxUZMvaN(i);
                wxUZMvaN4.getClass();
                g10 g10Var = (g10) wxUZMvaN4;
                hd0 hd0Var = ((f10) g20Var).Ey6iv0m0;
                Context context2 = ((LinearLayout) hd0Var.NCTxEWno).getContext();
                ((TextView) hd0Var.MdtA4re8).setText(g10Var.NCTxEWno);
                ((TextView) hd0Var.wxUZMvaN).setText(g10Var.qoPGr6Ce);
                ((TextView) hd0Var.P7K7Inc8).setText(g10Var.MdtA4re8);
                TextView textView3 = (TextView) hd0Var.b2ZJblxo;
                int i2 = g10Var.wxUZMvaN;
                textView3.setText(context2.getString(R.string.value_your_place, Integer.valueOf(i2)));
                TextView textView4 = hd0Var.qoPGr6Ce;
                int i3 = g10Var.VgvYg0wo;
                textView4.setText(context2.getString(R.string.value_correct_place, Integer.valueOf(i3)));
                ((LinearLayout) hd0Var.VgvYg0wo).setBackgroundResource(i2 == i3 ? R.drawable.bg_recap_correct : R.drawable.bg_recap_wrong);
                textView4.setTextColor(context2.getColor(i2 == i3 ? R.color.correct : R.color.wrong));
                break;
        }
    }
}
