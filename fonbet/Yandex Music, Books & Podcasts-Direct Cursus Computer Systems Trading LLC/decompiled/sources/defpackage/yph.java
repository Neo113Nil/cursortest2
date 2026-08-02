package defpackage;

import android.widget.SeekBar;

/* loaded from: classes.dex */
public final class yph implements SeekBar.OnSeekBarChangeListener {
    public final dsd a = new dsd(15, this);
    public final /* synthetic */ aqh b;

    public yph(aqh aqhVar) {
        this.b = aqhVar;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (z) {
            irh irhVar = (irh) seekBar.getTag();
            int i2 = aqh.V0;
            irhVar.j(i);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        aqh aqhVar = this.b;
        if (aqhVar.X != null) {
            aqhVar.K.removeCallbacks(this.a);
        }
        aqhVar.X = (irh) seekBar.getTag();
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        this.b.K.postDelayed(this.a, 500L);
    }
}
