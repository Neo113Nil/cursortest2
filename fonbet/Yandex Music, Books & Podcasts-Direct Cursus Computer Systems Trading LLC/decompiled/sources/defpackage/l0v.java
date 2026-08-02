package defpackage;

import com.yandex.music.shared.wave.shader.api.component.WaveGlShaderView;

/* loaded from: classes3.dex */
public final class l0v {
    public final qyf a;
    public final bjt b;
    public final oq7 c;
    public final xy1 d;
    public WaveGlShaderView e;
    public boolean f;
    public boolean g;
    public r3v h;
    public rar i;
    public rar j;
    public rar k;
    public rar l;
    public final xdr m = ydr.a(Boolean.FALSE);
    public final xdr n = ydr.a(null);

    public l0v(qyf qyfVar, bjt bjtVar, oq7 oq7Var, xy1 xy1Var) {
        this.a = qyfVar;
        this.b = bjtVar;
        this.c = oq7Var;
        this.d = xy1Var;
    }

    public static n3v b(k2v k2vVar) {
        j2v j2vVar = k2vVar.k;
        int i = j2vVar == null ? -1 : e0v.b[j2vVar.ordinal()];
        n3v n3vVar = null;
        if (i != -1) {
            if (i == 1) {
                n3vVar = new n3v(-14602684, c3x.U(d85.b));
            } else {
                if (i != 2) {
                    b6e.s();
                    return null;
                }
                Integer num = k2vVar.c;
                if (num != null) {
                    int intValue = num.intValue();
                    n3vVar = new n3v(intValue, intValue);
                }
            }
        }
        if (n3vVar != null) {
            return n3vVar;
        }
        long j = oa5.a;
        return new n3v(c3x.U(j), c3x.U(j));
    }

    public final void a() {
        WaveGlShaderView waveGlShaderView = this.e;
        if (waveGlShaderView != null) {
            waveGlShaderView.setFpsInfoCallback(null);
        }
        WaveGlShaderView waveGlShaderView2 = this.e;
        if (waveGlShaderView2 != null) {
            waveGlShaderView2.destroy();
        }
        this.e = null;
        rar rarVar = this.i;
        if (rarVar != null) {
            rarVar.g(null);
        }
        rar rarVar2 = this.j;
        if (rarVar2 != null) {
            rarVar2.g(null);
        }
        rar rarVar3 = this.k;
        if (rarVar3 != null) {
            rarVar3.g(null);
        }
        rar rarVar4 = this.l;
        if (rarVar4 != null) {
            rarVar4.g(null);
        }
    }

    public final void c(r3v r3vVar) {
        WaveGlShaderView waveGlShaderView;
        WaveGlShaderView waveGlShaderView2 = this.e;
        msu viewState = waveGlShaderView2 != null ? waveGlShaderView2.getViewState() : null;
        int i = viewState == null ? -1 : e0v.a[viewState.ordinal()];
        if (i != -1) {
            if (i == 1) {
                WaveGlShaderView waveGlShaderView3 = this.e;
                if (waveGlShaderView3 != null) {
                    waveGlShaderView3.setWaveScreenBackground(r3vVar);
                }
                this.h = r3vVar;
            }
            if (i != 2) {
                b6e.s();
                return;
            }
        }
        if (this.f) {
            WaveGlShaderView waveGlShaderView4 = this.e;
            if (waveGlShaderView4 != null) {
                waveGlShaderView4.setWaveScreenBackground(r3vVar);
            }
        } else if (this.h == null && (waveGlShaderView = this.e) != null) {
            waveGlShaderView.d(true);
        }
        this.h = r3vVar;
    }
}
