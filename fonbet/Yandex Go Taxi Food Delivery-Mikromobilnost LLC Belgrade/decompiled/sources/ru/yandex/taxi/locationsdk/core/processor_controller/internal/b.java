package ru.yandex.taxi.locationsdk.core.processor_controller.internal;

import defpackage.k7z;
import defpackage.ny61;
import defpackage.ubz;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes9.dex */
public final class b implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ d b;
    public final /* synthetic */ Object c;

    public b(vpr vprVar, d dVar, Object obj) {
        this.a = vprVar;
        this.b = dVar;
        this.c = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ProcessorControllerImpl$createOutputLocationFlowWithDiagnosticLogging$$inlined$map$1$2$1 processorControllerImpl$createOutputLocationFlowWithDiagnosticLogging$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof ProcessorControllerImpl$createOutputLocationFlowWithDiagnosticLogging$$inlined$map$1$2$1) {
            processorControllerImpl$createOutputLocationFlowWithDiagnosticLogging$$inlined$map$1$2$1 = (ProcessorControllerImpl$createOutputLocationFlowWithDiagnosticLogging$$inlined$map$1$2$1) continuation;
            int i2 = processorControllerImpl$createOutputLocationFlowWithDiagnosticLogging$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                processorControllerImpl$createOutputLocationFlowWithDiagnosticLogging$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = processorControllerImpl$createOutputLocationFlowWithDiagnosticLogging$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = processorControllerImpl$createOutputLocationFlowWithDiagnosticLogging$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    k7z f = this.b.c.f(((ubz) obj).a, this.c);
                    processorControllerImpl$createOutputLocationFlowWithDiagnosticLogging$$inlined$map$1$2$1.L$0 = null;
                    processorControllerImpl$createOutputLocationFlowWithDiagnosticLogging$$inlined$map$1$2$1.L$1 = null;
                    processorControllerImpl$createOutputLocationFlowWithDiagnosticLogging$$inlined$map$1$2$1.L$2 = null;
                    processorControllerImpl$createOutputLocationFlowWithDiagnosticLogging$$inlined$map$1$2$1.L$3 = null;
                    processorControllerImpl$createOutputLocationFlowWithDiagnosticLogging$$inlined$map$1$2$1.I$0 = 0;
                    processorControllerImpl$createOutputLocationFlowWithDiagnosticLogging$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(f, processorControllerImpl$createOutputLocationFlowWithDiagnosticLogging$$inlined$map$1$2$1) == coroutineSingletons) {
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
        processorControllerImpl$createOutputLocationFlowWithDiagnosticLogging$$inlined$map$1$2$1 = new ProcessorControllerImpl$createOutputLocationFlowWithDiagnosticLogging$$inlined$map$1$2$1(this, continuation);
        Object obj22 = processorControllerImpl$createOutputLocationFlowWithDiagnosticLogging$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = processorControllerImpl$createOutputLocationFlowWithDiagnosticLogging$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
