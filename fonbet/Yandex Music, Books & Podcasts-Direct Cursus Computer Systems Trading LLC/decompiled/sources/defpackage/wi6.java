package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class wi6 implements PointerInputEventHandler {
    public final /* synthetic */ Function1 a;
    public final /* synthetic */ aqi b;
    public final /* synthetic */ aqi c;
    public final /* synthetic */ uoi d;
    public final /* synthetic */ aqi e;

    public wi6(Function1 function1, aqi aqiVar, aqi aqiVar2, uoi uoiVar, aqi aqiVar3) {
        this.a = function1;
        this.b = aqiVar;
        this.c = aqiVar2;
        this.d = uoiVar;
        this.e = aqiVar3;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(pfm pfmVar, Continuation continuation) {
        Function1 function1 = this.a;
        aqi aqiVar = this.b;
        aqi aqiVar2 = this.c;
        Object e = g6s.e(pfmVar, new ti6(function1, aqiVar, aqiVar2, 0), new vi6(this.d, function1, aqiVar, aqiVar2, null, 0), new ui6(aqiVar, this.e, 0), continuation, 1);
        return e == nm6.a ? e : Unit.a;
    }
}
