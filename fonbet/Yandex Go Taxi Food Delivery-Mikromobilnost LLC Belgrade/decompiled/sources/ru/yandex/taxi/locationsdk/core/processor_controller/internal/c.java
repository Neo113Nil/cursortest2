package ru.yandex.taxi.locationsdk.core.processor_controller.internal;

import defpackage.at20;
import defpackage.c7z;
import defpackage.kjz;
import defpackage.ny61;
import defpackage.qeq0;
import defpackage.vpr;
import defpackage.vqu0;
import defpackage.w511;
import defpackage.wqu0;
import defpackage.xqu0;
import defpackage.zy11;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.locationsdk.core.time.TimestampSelector;

/* loaded from: classes9.dex */
public final class c implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ d b;

    public c(vpr vprVar, d dVar) {
        this.a = vprVar;
        this.b = dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ProcessorControllerImpl$createStrategyAndProcessorFlow$$inlined$map$1$2$1 processorControllerImpl$createStrategyAndProcessorFlow$$inlined$map$1$2$1;
        int i;
        Pair pair;
        Object a;
        if (continuation instanceof ProcessorControllerImpl$createStrategyAndProcessorFlow$$inlined$map$1$2$1) {
            processorControllerImpl$createStrategyAndProcessorFlow$$inlined$map$1$2$1 = (ProcessorControllerImpl$createStrategyAndProcessorFlow$$inlined$map$1$2$1) continuation;
            int i2 = processorControllerImpl$createStrategyAndProcessorFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                processorControllerImpl$createStrategyAndProcessorFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = processorControllerImpl$createStrategyAndProcessorFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = processorControllerImpl$createStrategyAndProcessorFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    if (obj != null) {
                        d dVar = this.b;
                        kjz kjzVar = dVar.b;
                        ru.yandex.taxi.locationsdk.core.input_controller.internal.b bVar = dVar.e;
                        xqu0 xqu0Var = (xqu0) obj;
                        TimestampSelector timestampSelector = (TimestampSelector) kjzVar.c;
                        if (xqu0Var instanceof wqu0) {
                            a = new qeq0(bVar, ((wqu0) xqu0Var).a, timestampSelector);
                        } else {
                            if (!(xqu0Var instanceof vqu0)) {
                                w511.b();
                                return null;
                            }
                            a = new at20((c7z) kjzVar.b, timestampSelector).a(bVar, ((vqu0) xqu0Var).a());
                        }
                        pair = new Pair(obj, a);
                    } else {
                        pair = null;
                    }
                    processorControllerImpl$createStrategyAndProcessorFlow$$inlined$map$1$2$1.L$0 = null;
                    processorControllerImpl$createStrategyAndProcessorFlow$$inlined$map$1$2$1.L$1 = null;
                    processorControllerImpl$createStrategyAndProcessorFlow$$inlined$map$1$2$1.L$2 = null;
                    processorControllerImpl$createStrategyAndProcessorFlow$$inlined$map$1$2$1.L$3 = null;
                    processorControllerImpl$createStrategyAndProcessorFlow$$inlined$map$1$2$1.I$0 = 0;
                    processorControllerImpl$createStrategyAndProcessorFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(pair, processorControllerImpl$createStrategyAndProcessorFlow$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        processorControllerImpl$createStrategyAndProcessorFlow$$inlined$map$1$2$1 = new ProcessorControllerImpl$createStrategyAndProcessorFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = processorControllerImpl$createStrategyAndProcessorFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = processorControllerImpl$createStrategyAndProcessorFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
