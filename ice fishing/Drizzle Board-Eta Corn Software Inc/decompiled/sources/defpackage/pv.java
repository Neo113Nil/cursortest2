package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.kolosta.rejin.jilosa.R;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class pv extends FrameLayout implements lv {
    public boolean MdtA4re8;
    public final TextView NCTxEWno;
    public ColorStateList P7K7Inc8;
    public cs VgvYg0wo;
    public boolean wxUZMvaN;

    public pv(Context context) {
        super(context);
        LayoutInflater.from(context).inflate(R.layout.m3_navigation_menu_subheader, (ViewGroup) this, true);
        this.NCTxEWno = (TextView) findViewById(R.id.navigation_menu_subheader_label);
    }

    public final void NCTxEWno() {
        cs csVar = this.VgvYg0wo;
        if (csVar != null) {
            setVisibility((!csVar.isVisible() || (!this.MdtA4re8 && this.wxUZMvaN)) ? 8 : 0);
        }
    }

    @Override // defpackage.qs
    public cs getItemData() {
        return this.VgvYg0wo;
    }

    @Override // defpackage.qs
    public final void qoPGr6Ce(cs csVar) {
        this.VgvYg0wo = csVar;
        csVar.setCheckable(false);
        this.NCTxEWno.setText(csVar.VgvYg0wo);
        NCTxEWno();
    }

    @Override // defpackage.lv
    public void setExpanded(boolean z) {
        this.MdtA4re8 = z;
        NCTxEWno();
    }

    @Override // defpackage.lv
    public void setOnlyShowWhenExpanded(boolean z) {
        this.wxUZMvaN = z;
        NCTxEWno();
    }

    public void setTextAppearance(int i) {
        TextView textView = this.NCTxEWno;
        textView.setTextAppearance(i);
        ColorStateList colorStateList = this.P7K7Inc8;
        if (colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.P7K7Inc8 = colorStateList;
        if (colorStateList != null) {
            this.NCTxEWno.setTextColor(colorStateList);
        }
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
    }

    public void setIcon(Drawable drawable) {
    }

    public void setTitle(CharSequence charSequence) {
    }
}
