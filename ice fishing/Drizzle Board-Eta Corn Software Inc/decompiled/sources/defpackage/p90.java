package defpackage;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class p90 extends yzvmSy3z implements wr {
    public mcXgUFR8 P7K7Inc8;
    public boolean Qr9iLBAD;
    public ActionBarContextView VgvYg0wo;
    public WeakReference b2ZJblxo;
    public yr jb9XjC4I;
    public Context wxUZMvaN;

    @Override // defpackage.yzvmSy3z
    public final yr MdtA4re8() {
        return this.jb9XjC4I;
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
        lDXGDhIF(this.wxUZMvaN.getString(i));
    }

    @Override // defpackage.yzvmSy3z
    public final CharSequence P7K7Inc8() {
        return this.VgvYg0wo.getTitle();
    }

    @Override // defpackage.yzvmSy3z
    public final void Qr9iLBAD() {
        this.P7K7Inc8.euDDoUNr(this, this.jb9XjC4I);
    }

    @Override // defpackage.yzvmSy3z
    public final CharSequence VgvYg0wo() {
        return this.VgvYg0wo.getSubtitle();
    }

    @Override // defpackage.wr
    public final boolean b2ZJblxo(yr yrVar, MenuItem menuItem) {
        return ((VZZbw3BB) this.P7K7Inc8.MdtA4re8).k3x7lurq(this, menuItem);
    }

    @Override // defpackage.yzvmSy3z
    public final void eVhOlqcC(View view) {
        this.VgvYg0wo.setCustomView(view);
        this.b2ZJblxo = view != null ? new WeakReference(view) : null;
    }

    @Override // defpackage.yzvmSy3z
    public final boolean jb9XjC4I() {
        return this.VgvYg0wo.Ey6iv0m0;
    }

    @Override // defpackage.yzvmSy3z
    public final void k3x7lurq(int i) {
        ow5vqvCr(this.wxUZMvaN.getString(i));
    }

    @Override // defpackage.yzvmSy3z
    public final void lDXGDhIF(CharSequence charSequence) {
        this.VgvYg0wo.setTitle(charSequence);
    }

    @Override // defpackage.yzvmSy3z
    public final void ow5vqvCr(CharSequence charSequence) {
        this.VgvYg0wo.setSubtitle(charSequence);
    }

    @Override // defpackage.yzvmSy3z
    public final void qoPGr6Ce() {
        if (this.Qr9iLBAD) {
            return;
        }
        this.Qr9iLBAD = true;
        this.P7K7Inc8.Mq3SeTnW(this);
    }

    @Override // defpackage.yzvmSy3z
    public final void sjUBp5pO(boolean z) {
        this.MdtA4re8 = z;
        this.VgvYg0wo.setTitleOptional(z);
    }

    @Override // defpackage.yzvmSy3z
    public final MenuInflater wxUZMvaN() {
        return new ra0(this.VgvYg0wo.getContext());
    }

    @Override // defpackage.wr
    public final void ygLcUYwZ(yr yrVar) {
        Qr9iLBAD();
        CTE3lpUp cTE3lpUp = this.VgvYg0wo.VgvYg0wo;
        if (cTE3lpUp != null) {
            cTE3lpUp.ygLcUYwZ();
        }
    }
}
