package ru.yandex.logistics.sdk.cargo_form.impl.ai_widgets.data;

import defpackage.aq1;
import defpackage.bq1;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.TypedConfigsDto;

/* loaded from: classes5.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ bq1 b;

    public a(vpr vprVar, bq1 bq1Var) {
        this.a = vprVar;
        this.b = bq1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        AiWidgetsConfigInteractor$configFlow$$inlined$map$1$2$1 aiWidgetsConfigInteractor$configFlow$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof AiWidgetsConfigInteractor$configFlow$$inlined$map$1$2$1) {
            aiWidgetsConfigInteractor$configFlow$$inlined$map$1$2$1 = (AiWidgetsConfigInteractor$configFlow$$inlined$map$1$2$1) continuation;
            int i2 = aiWidgetsConfigInteractor$configFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aiWidgetsConfigInteractor$configFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = aiWidgetsConfigInteractor$configFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = aiWidgetsConfigInteractor$configFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    b.b(obj2);
                    aq1 a = this.b.a((TypedConfigsDto.ItemsDto) obj);
                    aiWidgetsConfigInteractor$configFlow$$inlined$map$1$2$1.L$0 = null;
                    aiWidgetsConfigInteractor$configFlow$$inlined$map$1$2$1.L$1 = null;
                    aiWidgetsConfigInteractor$configFlow$$inlined$map$1$2$1.L$2 = null;
                    aiWidgetsConfigInteractor$configFlow$$inlined$map$1$2$1.L$3 = null;
                    aiWidgetsConfigInteractor$configFlow$$inlined$map$1$2$1.I$0 = 0;
                    aiWidgetsConfigInteractor$configFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(a, aiWidgetsConfigInteractor$configFlow$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj2);
                }
                return zy11.a;
            }
        }
        aiWidgetsConfigInteractor$configFlow$$inlined$map$1$2$1 = new AiWidgetsConfigInteractor$configFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = aiWidgetsConfigInteractor$configFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = aiWidgetsConfigInteractor$configFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
