package ru.yandex.logistics.sdk.cargo_form.core.api;

import defpackage.ny61;
import defpackage.scc;
import defpackage.t3s;
import defpackage.tcc;
import defpackage.vpr;
import defpackage.zy11;
import java.util.ArrayList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class b implements vpr {
    public final /* synthetic */ vpr a;

    public b(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        FormCoreModelRepositoryKt$getSections$$inlined$map$1$2$1 formCoreModelRepositoryKt$getSections$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof FormCoreModelRepositoryKt$getSections$$inlined$map$1$2$1) {
            formCoreModelRepositoryKt$getSections$$inlined$map$1$2$1 = (FormCoreModelRepositoryKt$getSections$$inlined$map$1$2$1) continuation;
            int i2 = formCoreModelRepositoryKt$getSections$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                formCoreModelRepositoryKt$getSections$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = formCoreModelRepositoryKt$getSections$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = formCoreModelRepositoryKt$getSections$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    t3s t3sVar = (t3s) obj;
                    ArrayList o = tcc.o(scc.g(t3sVar.a, t3sVar.b, t3sVar.c));
                    formCoreModelRepositoryKt$getSections$$inlined$map$1$2$1.L$0 = null;
                    formCoreModelRepositoryKt$getSections$$inlined$map$1$2$1.L$1 = null;
                    formCoreModelRepositoryKt$getSections$$inlined$map$1$2$1.L$2 = null;
                    formCoreModelRepositoryKt$getSections$$inlined$map$1$2$1.L$3 = null;
                    formCoreModelRepositoryKt$getSections$$inlined$map$1$2$1.I$0 = 0;
                    formCoreModelRepositoryKt$getSections$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(o, formCoreModelRepositoryKt$getSections$$inlined$map$1$2$1) == coroutineSingletons) {
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
        formCoreModelRepositoryKt$getSections$$inlined$map$1$2$1 = new FormCoreModelRepositoryKt$getSections$$inlined$map$1$2$1(this, continuation);
        Object obj22 = formCoreModelRepositoryKt$getSections$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = formCoreModelRepositoryKt$getSections$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
