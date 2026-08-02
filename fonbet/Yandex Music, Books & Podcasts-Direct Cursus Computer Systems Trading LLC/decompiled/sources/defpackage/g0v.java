package defpackage;

import com.yandex.music.shared.wave.shader.api.component.WaveGlShaderView;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class g0v implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ WaveGlShaderView b;

    public /* synthetic */ g0v(WaveGlShaderView waveGlShaderView, int i) {
        this.a = i;
        this.b = waveGlShaderView;
    }

    @Override // defpackage.rjc
    public final Object emit(Object obj, Continuation continuation) {
        switch (this.a) {
            case 0:
                this.b.b((yy1) obj);
                break;
            default:
                if (((j1g) obj) == j1g.a) {
                    this.b.f();
                }
                break;
        }
        return Unit.a;
    }
}
