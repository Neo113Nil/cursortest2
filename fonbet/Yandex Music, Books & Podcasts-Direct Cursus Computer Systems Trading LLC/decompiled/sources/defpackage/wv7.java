package defpackage;

import androidx.media3.exoplayer.dash.DashMediaSource$Factory;

/* loaded from: classes6.dex */
public final class wv7 implements tvh {
    public final osh a;
    public final DashMediaSource$Factory b;
    public final tyi c;

    public wv7(osh oshVar, DashMediaSource$Factory dashMediaSource$Factory, tyi tyiVar) {
        this.a = oshVar;
        this.b = dashMediaSource$Factory;
        this.c = tyiVar;
    }

    @Override // defpackage.tvh
    public final wvh d(onh onhVar) {
        onhVar.getClass();
        return new uv7(this.a, this.b.d(onhVar), this.c);
    }

    @Override // defpackage.tvh
    public final tvh e(hra hraVar) {
        hraVar.getClass();
        DashMediaSource$Factory dashMediaSource$Factory = this.b;
        dashMediaSource$Factory.c = hraVar;
        return dashMediaSource$Factory;
    }
}
