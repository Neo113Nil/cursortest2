package defpackage;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class yh0 extends yzvmSy3z implements wr {
    public mcXgUFR8 P7K7Inc8;
    public final /* synthetic */ zh0 Qr9iLBAD;
    public final yr VgvYg0wo;
    public WeakReference b2ZJblxo;
    public final Context wxUZMvaN;

    public yh0(zh0 zh0Var, Context context, mcXgUFR8 mcxgufr8) {
        this.Qr9iLBAD = zh0Var;
        this.wxUZMvaN = context;
        this.P7K7Inc8 = mcxgufr8;
        yr yrVar = new yr(context);
        yrVar.ow5vqvCr = 1;
        this.VgvYg0wo = yrVar;
        yrVar.VgvYg0wo = this;
    }

    @Override // defpackage.yzvmSy3z
    public final yr MdtA4re8() {
        return this.VgvYg0wo;
    }

    @Override // defpackage.yzvmSy3z
    public final View NCTxEWno() {
        WeakReference weakReference = this.b2ZJblxo;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // defpackage.yzvmSy3z
    public final void OnDfzHZD(int i) {
        lDXGDhIF(this.Qr9iLBAD.qoPGr6Ce.getResources().getString(i));
    }

    @Override // defpackage.yzvmSy3z
    public final CharSequence P7K7Inc8() {
        return this.Qr9iLBAD.P7K7Inc8.getTitle();
    }

    @Override // defpackage.yzvmSy3z
    public final void Qr9iLBAD() {
        if (this.Qr9iLBAD.jb9XjC4I != this) {
            return;
        }
        yr yrVar = this.VgvYg0wo;
        yrVar.FySoLYna();
        try {
            this.P7K7Inc8.euDDoUNr(this, yrVar);
        } finally {
            yrVar.RXQxj5Oe();
        }
    }

    @Override // defpackage.yzvmSy3z
    public final CharSequence VgvYg0wo() {
        return this.Qr9iLBAD.P7K7Inc8.getSubtitle();
    }

    @Override // defpackage.wr
    public final boolean b2ZJblxo(yr yrVar, MenuItem menuItem) {
        mcXgUFR8 mcxgufr8 = this.P7K7Inc8;
        if (mcxgufr8 != null) {
            return ((VZZbw3BB) mcxgufr8.MdtA4re8).k3x7lurq(this, menuItem);
        }
        return false;
    }

    @Override // defpackage.yzvmSy3z
    public final void eVhOlqcC(View view) {
        this.Qr9iLBAD.P7K7Inc8.setCustomView(view);
        this.b2ZJblxo = new WeakReference(view);
    }

    @Override // defpackage.yzvmSy3z
    public final boolean jb9XjC4I() {
        return this.Qr9iLBAD.P7K7Inc8.Ey6iv0m0;
    }

    @Override // defpackage.yzvmSy3z
    public final void k3x7lurq(int i) {
        ow5vqvCr(this.Qr9iLBAD.qoPGr6Ce.getResources().getString(i));
    }

    @Override // defpackage.yzvmSy3z
    public final void lDXGDhIF(CharSequence charSequence) {
        this.Qr9iLBAD.P7K7Inc8.setTitle(charSequence);
    }

    @Override // defpackage.yzvmSy3z
    public final void ow5vqvCr(CharSequence charSequence) {
        this.Qr9iLBAD.P7K7Inc8.setSubtitle(charSequence);
    }

    @Override // defpackage.yzvmSy3z
    public final void qoPGr6Ce() {
        zh0 zh0Var = this.Qr9iLBAD;
        if (zh0Var.jb9XjC4I != this) {
            return;
        }
        if (zh0Var.sjUBp5pO) {
            zh0Var.eVhOlqcC = this;
            zh0Var.k3x7lurq = this.P7K7Inc8;
        } else {
            this.P7K7Inc8.Mq3SeTnW(this);
        }
        this.P7K7Inc8 = null;
        zh0Var.qoPGr6Ce(false);
        ActionBarContextView actionBarContextView = zh0Var.P7K7Inc8;
        if (actionBarContextView.ow5vqvCr == null) {
            actionBarContextView.VgvYg0wo();
        }
        zh0Var.MdtA4re8.setHideOnContentScrollEnabled(zh0Var.I5GHvsYW);
        zh0Var.jb9XjC4I = null;
    }

    @Override // defpackage.yzvmSy3z
    public final void sjUBp5pO(boolean z) {
        this.MdtA4re8 = z;
        this.Qr9iLBAD.P7K7Inc8.setTitleOptional(z);
    }

    @Override // defpackage.yzvmSy3z
    public final MenuInflater wxUZMvaN() {
        return new ra0(this.wxUZMvaN);
    }

    @Override // defpackage.wr
    public final void ygLcUYwZ(yr yrVar) {
        if (this.P7K7Inc8 == null) {
            return;
        }
        Qr9iLBAD();
        CTE3lpUp cTE3lpUp = this.Qr9iLBAD.P7K7Inc8.VgvYg0wo;
        if (cTE3lpUp != null) {
            cTE3lpUp.ygLcUYwZ();
        }
    }
}
