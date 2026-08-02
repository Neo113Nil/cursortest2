package defpackage;

import androidx.compose.foundation.gestures.i;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import defpackage.oz40;
import defpackage.s9m;
import defpackage.sls;
import defpackage.tje;
import defpackage.tse;
import defpackage.zx40;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.logistics.sdk.ui.component.drag_drop_column.utils.a;

/* loaded from: classes5.dex */
public final class ww21 implements PointerInputEventHandler {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ wls b;
    public final /* synthetic */ tls c;
    public final /* synthetic */ oz40 d;
    public final /* synthetic */ tse e;
    public final /* synthetic */ zx40 f;
    public final /* synthetic */ oz40 g;
    public final /* synthetic */ sls h;

    public ww21(boolean z, wls wlsVar, tls tlsVar, oz40 oz40Var, tse tseVar, zx40 zx40Var, oz40 oz40Var2, sls slsVar) {
        this.a = z;
        this.b = wlsVar;
        this.c = tlsVar;
        this.d = oz40Var;
        this.e = tseVar;
        this.f = zx40Var;
        this.g = oz40Var2;
        this.h = slsVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(hwd0 hwd0Var, Continuation continuation) {
        if (this.a) {
            tls tlsVar = this.c;
            final oz40 oz40Var = this.d;
            final tse tseVar = this.e;
            final zx40 zx40Var = this.f;
            final oz40 oz40Var2 = this.g;
            a aVar = new a(tlsVar, oz40Var, tseVar, zx40Var, oz40Var2);
            final int i = 0;
            final sls slsVar = this.h;
            sls slsVar2 = new sls() { // from class: ru.yandex.taxi.logistics.sdk.ui.component.drag_drop_column.utils.h
                @Override // defpackage.sls
                public final Object invoke() {
                    int i2 = i;
                    zy11 zy11Var = zy11.a;
                    oz40 oz40Var3 = oz40Var;
                    zx40 zx40Var2 = zx40Var;
                    tse tseVar2 = tseVar;
                    oz40 oz40Var4 = oz40Var2;
                    sls slsVar3 = slsVar;
                    switch (i2) {
                        case 0:
                            s9m s9mVar = (s9m) oz40Var4.getValue();
                            if (s9mVar != null) {
                                tje.N(tseVar2, null, null, new UtilKt$draggable$3$2$1$2$1$1(zx40Var2, s9mVar, null), 3);
                            }
                            if (((Boolean) oz40Var3.getValue()).booleanValue()) {
                                slsVar3.invoke();
                            }
                            oz40Var3.setValue(Boolean.FALSE);
                            break;
                        default:
                            s9m s9mVar2 = (s9m) oz40Var4.getValue();
                            if (s9mVar2 != null) {
                                tje.N(tseVar2, null, null, new UtilKt$draggable$3$2$1$3$1$1(zx40Var2, s9mVar2, null), 3);
                            }
                            if (((Boolean) oz40Var3.getValue()).booleanValue()) {
                                slsVar3.invoke();
                            }
                            oz40Var3.setValue(Boolean.FALSE);
                            break;
                    }
                    return zy11Var;
                }
            };
            final int i2 = 1;
            Object g = i.g(hwd0Var, aVar, slsVar2, new sls() { // from class: ru.yandex.taxi.logistics.sdk.ui.component.drag_drop_column.utils.h
                @Override // defpackage.sls
                public final Object invoke() {
                    int i22 = i2;
                    zy11 zy11Var = zy11.a;
                    oz40 oz40Var3 = oz40Var;
                    zx40 zx40Var2 = zx40Var;
                    tse tseVar2 = tseVar;
                    oz40 oz40Var4 = oz40Var2;
                    sls slsVar3 = slsVar;
                    switch (i22) {
                        case 0:
                            s9m s9mVar = (s9m) oz40Var4.getValue();
                            if (s9mVar != null) {
                                tje.N(tseVar2, null, null, new UtilKt$draggable$3$2$1$2$1$1(zx40Var2, s9mVar, null), 3);
                            }
                            if (((Boolean) oz40Var3.getValue()).booleanValue()) {
                                slsVar3.invoke();
                            }
                            oz40Var3.setValue(Boolean.FALSE);
                            break;
                        default:
                            s9m s9mVar2 = (s9m) oz40Var4.getValue();
                            if (s9mVar2 != null) {
                                tje.N(tseVar2, null, null, new UtilKt$draggable$3$2$1$3$1$1(zx40Var2, s9mVar2, null), 3);
                            }
                            if (((Boolean) oz40Var3.getValue()).booleanValue()) {
                                slsVar3.invoke();
                            }
                            oz40Var3.setValue(Boolean.FALSE);
                            break;
                    }
                    return zy11Var;
                }
            }, this.b, continuation);
            if (g == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return g;
            }
        }
        return zy11.a;
    }
}
