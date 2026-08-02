package ru.yandex.taxi.plus.sdk.micro_widget.composite;

import defpackage.ny61;
import defpackage.r2c;
import defpackage.vpr;
import defpackage.xe20;
import defpackage.zy11;
import java.util.Map;
import kotlin.Triple;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.plus.api.dto.state.plaque.e0;

/* loaded from: classes6.dex */
public final class e implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ xe20 b;

    public e(vpr vprVar, xe20 xe20Var) {
        this.a = vprVar;
        this.b = xe20Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0099, code lost:
    
        if (r7.emit(r9, r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x009b, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0082, code lost:
    
        if (r9 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        MicroWidgetBadgeInteractor$special$$inlined$map$2$2$1 microWidgetBadgeInteractor$special$$inlined$map$2$2$1;
        int i;
        vpr vprVar;
        if (continuation instanceof MicroWidgetBadgeInteractor$special$$inlined$map$2$2$1) {
            microWidgetBadgeInteractor$special$$inlined$map$2$2$1 = (MicroWidgetBadgeInteractor$special$$inlined$map$2$2$1) continuation;
            int i2 = microWidgetBadgeInteractor$special$$inlined$map$2$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                microWidgetBadgeInteractor$special$$inlined$map$2$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = microWidgetBadgeInteractor$special$$inlined$map$2$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = microWidgetBadgeInteractor$special$$inlined$map$2$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Triple triple = (Triple) obj;
                    ru.yandex.taxi.plus.repository.mappers.a aVar = this.b.e;
                    e0 e0Var = (e0) triple.g();
                    Map map = (Map) triple.h();
                    r2c r2cVar = (r2c) triple.f();
                    microWidgetBadgeInteractor$special$$inlined$map$2$2$1.L$0 = null;
                    microWidgetBadgeInteractor$special$$inlined$map$2$2$1.L$1 = null;
                    microWidgetBadgeInteractor$special$$inlined$map$2$2$1.L$2 = null;
                    microWidgetBadgeInteractor$special$$inlined$map$2$2$1.L$3 = null;
                    vprVar = this.a;
                    microWidgetBadgeInteractor$special$$inlined$map$2$2$1.L$4 = vprVar;
                    microWidgetBadgeInteractor$special$$inlined$map$2$2$1.L$5 = null;
                    microWidgetBadgeInteractor$special$$inlined$map$2$2$1.L$6 = null;
                    microWidgetBadgeInteractor$special$$inlined$map$2$2$1.label = 1;
                    obj2 = aVar.c(e0Var, map, r2cVar, microWidgetBadgeInteractor$special$$inlined$map$2$2$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj2);
                        return zy11.a;
                    }
                    vprVar = (vpr) microWidgetBadgeInteractor$special$$inlined$map$2$2$1.L$4;
                    kotlin.b.b(obj2);
                }
                microWidgetBadgeInteractor$special$$inlined$map$2$2$1.L$0 = null;
                microWidgetBadgeInteractor$special$$inlined$map$2$2$1.L$1 = null;
                microWidgetBadgeInteractor$special$$inlined$map$2$2$1.L$2 = null;
                microWidgetBadgeInteractor$special$$inlined$map$2$2$1.L$3 = null;
                microWidgetBadgeInteractor$special$$inlined$map$2$2$1.L$4 = null;
                microWidgetBadgeInteractor$special$$inlined$map$2$2$1.L$5 = null;
                microWidgetBadgeInteractor$special$$inlined$map$2$2$1.L$6 = null;
                microWidgetBadgeInteractor$special$$inlined$map$2$2$1.label = 2;
            }
        }
        microWidgetBadgeInteractor$special$$inlined$map$2$2$1 = new MicroWidgetBadgeInteractor$special$$inlined$map$2$2$1(this, continuation);
        Object obj22 = microWidgetBadgeInteractor$special$$inlined$map$2$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = microWidgetBadgeInteractor$special$$inlined$map$2$2$1.label;
        if (i != 0) {
        }
        microWidgetBadgeInteractor$special$$inlined$map$2$2$1.L$0 = null;
        microWidgetBadgeInteractor$special$$inlined$map$2$2$1.L$1 = null;
        microWidgetBadgeInteractor$special$$inlined$map$2$2$1.L$2 = null;
        microWidgetBadgeInteractor$special$$inlined$map$2$2$1.L$3 = null;
        microWidgetBadgeInteractor$special$$inlined$map$2$2$1.L$4 = null;
        microWidgetBadgeInteractor$special$$inlined$map$2$2$1.L$5 = null;
        microWidgetBadgeInteractor$special$$inlined$map$2$2$1.L$6 = null;
        microWidgetBadgeInteractor$special$$inlined$map$2$2$1.label = 2;
    }
}
