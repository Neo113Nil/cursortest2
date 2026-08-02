package defpackage;

import android.widget.SeekBar;

/* loaded from: classes.dex */
public final class vqh implements SeekBar.OnSeekBarChangeListener {
    public final /* synthetic */ wqh a;

    public vqh(wqh wqhVar) {
        this.a = wqhVar;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (z) {
            irh irhVar = (irh) seekBar.getTag();
            oqh oqhVar = (oqh) this.a.v.get(irhVar.c);
            if (oqhVar != null) {
                oqhVar.u(i == 0);
            }
            irhVar.j(i);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        wqh wqhVar = this.a;
        if (wqhVar.w != null) {
            wqhVar.r.removeMessages(2);
        }
        wqhVar.w = (irh) seekBar.getTag();
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        this.a.r.sendEmptyMessageDelayed(2, 500L);
    }
}
