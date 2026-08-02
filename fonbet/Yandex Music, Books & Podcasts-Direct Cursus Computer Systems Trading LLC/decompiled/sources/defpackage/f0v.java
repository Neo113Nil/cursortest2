package defpackage;

import com.yandex.music.shared.wave.shader.api.component.WaveGlShaderView;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class f0v implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ l0v b;

    public /* synthetic */ f0v(l0v l0vVar, int i) {
        this.a = i;
        this.b = l0vVar;
    }

    @Override // defpackage.rjc
    public final Object emit(Object obj, Continuation continuation) {
        WaveGlShaderView waveGlShaderView;
        switch (this.a) {
            case 0:
                Boolean bool = (Boolean) obj;
                boolean booleanValue = bool.booleanValue();
                l0v l0vVar = this.b;
                if (booleanValue) {
                    l0vVar.g = false;
                    WaveGlShaderView waveGlShaderView2 = l0vVar.e;
                    if (waveGlShaderView2 != null) {
                        waveGlShaderView2.onResume();
                    }
                    WaveGlShaderView waveGlShaderView3 = l0vVar.e;
                    if (waveGlShaderView3 != null) {
                        waveGlShaderView3.h(0L, true);
                    }
                } else if (!l0vVar.g && (waveGlShaderView = l0vVar.e) != null) {
                    waveGlShaderView.a();
                }
                xdr xdrVar = l0vVar.m;
                xdrVar.getClass();
                xdrVar.m(null, bool);
                break;
            default:
                this.b.c((r3v) obj);
                break;
        }
        return Unit.a;
    }
}
