package defpackage;

import androidx.compose.foundation.gestures.c;
import androidx.compose.foundation.gestures.i;
import androidx.compose.foundation.gestures.z;
import androidx.compose.foundation.text.selection.d;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import defpackage.n6y;
import defpackage.s6y;
import defpackage.t6y;
import defpackage.tje;
import defpackage.wu60;
import defpackage.zy11;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes12.dex */
public final class y9m implements PointerInputEventHandler {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ y9m(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(hwd0 hwd0Var, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                final z9m z9mVar = (z9m) obj2;
                t8j t8jVar = new t8j(5, z9mVar, (oz40) obj);
                final int i2 = 0;
                sls slsVar = new sls() { // from class: x9m
                    @Override // defpackage.sls
                    public final Object invoke() {
                        int i3 = i2;
                        zy11 zy11Var2 = zy11.a;
                        z9m z9mVar2 = z9mVar;
                        switch (i3) {
                            case 0:
                                z9m.b(z9mVar2, true);
                                break;
                            default:
                                z9m.b(z9mVar2, false);
                                break;
                        }
                        return zy11Var2;
                    }
                };
                final int i3 = 1;
                return i.g(hwd0Var, t8jVar, slsVar, new sls() { // from class: x9m
                    @Override // defpackage.sls
                    public final Object invoke() {
                        int i32 = i3;
                        zy11 zy11Var2 = zy11.a;
                        z9m z9mVar2 = z9mVar;
                        switch (i32) {
                            case 0:
                                z9m.b(z9mVar2, true);
                                break;
                            default:
                                z9m.b(z9mVar2, false);
                                break;
                        }
                        return zy11Var2;
                    }
                }, new loj(3, z9mVar), continuation);
            case 1:
                Object c = d.c(hwd0Var, (nkq0) obj2, (mkq0) obj, continuation);
                return c == CoroutineSingletons.COROUTINE_SUSPENDED ? c : zy11Var;
            case 2:
                Object o = c.o(hwd0Var, new dhj0(17, hwd0Var, (tx40) obj2, (oz40) obj), continuation);
                return o == CoroutineSingletons.COROUTINE_SUSPENDED ? o : zy11Var;
            default:
                final com.yandex.go.masstransit.sdk.trains.impl.datepicker.ui.c cVar = (com.yandex.go.masstransit.sdk.trains.impl.datepicker.ui.c) obj2;
                final tse tseVar = (tse) obj;
                return z.f(hwd0Var, null, null, new tls() { // from class: com.yandex.go.masstransit.sdk.trains.impl.datepicker.ui.a
                    @Override // defpackage.tls
                    public final Object invoke(Object obj3) {
                        Object obj4;
                        float abs;
                        float abs2;
                        long j = ((wu60) obj3).a;
                        c cVar2 = c.this;
                        s6y j2 = cVar2.c.j();
                        long e = j2.e();
                        long j3 = _Gost_CryptoPro_PrivateKeyValues.maxDWORD;
                        float f = 2.0f;
                        float f2 = ((int) (e & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) / 2.0f;
                        Iterator it = j2.k.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj4 = null;
                                break;
                            }
                            obj4 = it.next();
                            n6y n6yVar = (n6y) obj4;
                            float f3 = ((t6y) n6yVar).o + (((t6y) n6yVar).p / f) + (-j2.l);
                            float f4 = (f3 - f2) / f2;
                            long j4 = j3;
                            float sin = (float) (Math.sin(Math.toRadians(Math.abs(f4) * 90.0d)) * ((float) (((f2 * f) / 1.0f) / 3.141592653589793d)));
                            if (f4 < 0.0f) {
                                abs = f2 - Math.abs(sin);
                                abs2 = Math.abs(f3);
                            } else {
                                abs = Math.abs(sin) + f2;
                                abs2 = Math.abs(f3);
                            }
                            double d = f3 + (abs - abs2);
                            double cos = (Math.cos(Math.toRadians(Math.abs(f4) * 90.0d)) * ((t6y) n6yVar).p) / 2.0d;
                            double d2 = d - cos;
                            double d3 = d + cos;
                            double intBitsToFloat = Float.intBitsToFloat((int) (j & j4));
                            if (d2 <= intBitsToFloat && intBitsToFloat <= d3) {
                                break;
                            }
                            j3 = j4;
                            f = 2.0f;
                        }
                        n6y n6yVar2 = (n6y) obj4;
                        Integer valueOf = n6yVar2 != null ? Integer.valueOf(((t6y) n6yVar2).a) : null;
                        if (valueOf != null) {
                            tje.N(tseVar, null, null, new WheelDatePickerKt$WheelDatePicker$6$2$1$1$1$1(cVar2, valueOf.intValue(), null), 3);
                        }
                        return zy11.a;
                    }
                }, continuation, 7);
        }
    }
}
