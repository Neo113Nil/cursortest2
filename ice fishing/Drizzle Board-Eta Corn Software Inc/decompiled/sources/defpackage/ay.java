package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.material.card.MaterialCardView;
import com.kolosta.rejin.jilosa.R;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class ay extends jp {
    public static final r1 P7K7Inc8 = new r1(6);
    public final ix MdtA4re8;
    public q3 VgvYg0wo;
    public final kx wxUZMvaN;

    public ay(ix ixVar, kx kxVar) {
        super(P7K7Inc8);
        this.MdtA4re8 = ixVar;
        this.wxUZMvaN = kxVar;
        this.VgvYg0wo = q3.MdtA4re8;
    }

    @Override // defpackage.m10
    public final g20 MdtA4re8(ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_pair_card, viewGroup, false);
        int i = R.id.pair_emoji;
        TextView textView = (TextView) n50.qoPGr6Ce(inflate, R.id.pair_emoji);
        if (textView != null) {
            i = R.id.pair_meta_base;
            TextView textView2 = (TextView) n50.qoPGr6Ce(inflate, R.id.pair_meta_base);
            if (textView2 != null) {
                i = R.id.pair_meta_prep;
                TextView textView3 = (TextView) n50.qoPGr6Ce(inflate, R.id.pair_meta_prep);
                if (textView3 != null) {
                    i = R.id.pair_name;
                    TextView textView4 = (TextView) n50.qoPGr6Ce(inflate, R.id.pair_name);
                    if (textView4 != null) {
                        MaterialCardView materialCardView = (MaterialCardView) inflate;
                        i = R.id.pair_scope;
                        TextView textView5 = (TextView) n50.qoPGr6Ce(inflate, R.id.pair_scope);
                        if (textView5 != null) {
                            return new zx(this, new hd0(materialCardView, textView, textView2, textView3, textView4, materialCardView, textView5));
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }

    @Override // defpackage.m10
    public final void NCTxEWno(g20 g20Var, int i) {
        final zx zxVar = (zx) g20Var;
        Object wxUZMvaN = wxUZMvaN(i);
        wxUZMvaN.getClass();
        final py pyVar = (py) wxUZMvaN;
        q3 q3Var = this.VgvYg0wo;
        final ay ayVar = zxVar.I5GHvsYW;
        q3Var.getClass();
        hd0 hd0Var = zxVar.Ey6iv0m0;
        MaterialCardView materialCardView = (MaterialCardView) hd0Var.NCTxEWno;
        MaterialCardView materialCardView2 = (MaterialCardView) hd0Var.P7K7Inc8;
        Context context = materialCardView.getContext();
        TextView textView = hd0Var.qoPGr6Ce;
        textView.setText(pyVar.MdtA4re8);
        ((TextView) hd0Var.VgvYg0wo).setText(pyVar.NCTxEWno);
        ((TextView) hd0Var.MdtA4re8).setText(context.getString(R.string.value_base, pyVar.wxUZMvaN));
        TextView textView2 = (TextView) hd0Var.wxUZMvaN;
        textView2.setText(context.getString(R.string.value_prep_meta, pyVar.VgvYg0wo, Integer.valueOf(pyVar.P7K7Inc8)));
        TextView textView3 = (TextView) hd0Var.b2ZJblxo;
        textView3.setText(pyVar.Qr9iLBAD);
        int ordinal = q3Var.ordinal();
        if (ordinal == 0) {
            textView2.setVisibility(8);
            textView3.setVisibility(8);
            textView.setTextSize(20.0f);
        } else if (ordinal == 1) {
            textView2.setVisibility(0);
            textView3.setVisibility(8);
            textView.setTextSize(26.0f);
        } else {
            if (ordinal != 2) {
                throw new d7();
            }
            textView2.setVisibility(0);
            textView3.setVisibility(0);
            textView.setTextSize(32.0f);
        }
        materialCardView2.setOnClickListener(new s6(ayVar, 5, pyVar));
        materialCardView2.setOnLongClickListener(new View.OnLongClickListener() { // from class: yx
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                kx kxVar = ay.this.wxUZMvaN;
                MaterialCardView materialCardView3 = (MaterialCardView) zxVar.Ey6iv0m0.P7K7Inc8;
                materialCardView3.getClass();
                kxVar.Qr9iLBAD(pyVar, materialCardView3);
                return true;
            }
        });
    }
}
