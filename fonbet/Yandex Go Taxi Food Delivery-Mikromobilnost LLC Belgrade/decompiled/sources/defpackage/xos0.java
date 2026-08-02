package defpackage;

import androidx.compose.animation.core.a;
import androidx.compose.foundation.gestures.i;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import defpackage.tje;
import defpackage.tse;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class xos0 implements PointerInputEventHandler {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ tse b;
    public final /* synthetic */ a c;
    public final /* synthetic */ float d;
    public final /* synthetic */ sls e;
    public final /* synthetic */ m3u0 f;
    public final /* synthetic */ tx40 g;
    public final /* synthetic */ a h;

    public xos0(boolean z, tse tseVar, a aVar, float f, sls slsVar, m3u0 m3u0Var, tx40 tx40Var, a aVar2) {
        this.a = z;
        this.b = tseVar;
        this.c = aVar;
        this.d = f;
        this.e = slsVar;
        this.f = m3u0Var;
        this.g = tx40Var;
        this.h = aVar2;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(hwd0 hwd0Var, Continuation continuation) {
        if (this.a) {
            final tse tseVar = this.b;
            final a aVar = this.c;
            tls tlsVar = new tls() { // from class: ru.yandex.taxi.logistics.sdk.ui.component.control.b
                @Override // defpackage.tls
                public final Object invoke(Object obj) {
                    tje.N(tse.this, null, null, new SliderButtonKt$SliderHandler$2$1$1$1(aVar, null), 3);
                    return zy11.a;
                }
            };
            final float f = this.d;
            final sls slsVar = this.e;
            final m3u0 m3u0Var = this.f;
            final tx40 tx40Var = this.g;
            final a aVar2 = this.h;
            Object i = i.i(hwd0Var, tlsVar, new sls() { // from class: ru.yandex.taxi.logistics.sdk.ui.component.control.c
                @Override // defpackage.sls
                public final Object invoke() {
                    tje.N(tse.this, null, null, new SliderButtonKt$SliderHandler$2$1$2$1(aVar, f, slsVar, m3u0Var, tx40Var, aVar2, null), 3);
                    return zy11.a;
                }
            }, new sls() { // from class: ru.yandex.taxi.logistics.sdk.ui.component.control.d
                @Override // defpackage.sls
                public final Object invoke() {
                    tje.N(tse.this, null, null, new SliderButtonKt$SliderHandler$2$1$3$1(aVar, tx40Var, null), 3);
                    return zy11.a;
                }
            }, new xq1(f, tx40Var, 2), continuation);
            if (i == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return i;
            }
        }
        return zy11.a;
    }
}
