package ru.yandex.taxi.logistics.sdk.tracking.impl.edit_order_details.data;

import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import java.util.Set;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class b implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ String b;

    public b(vpr vprVar, String str) {
        this.a = vprVar;
        this.b = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        EditOrderScreenStateRepositoryImpl$screenStateFlow$$inlined$map$1$2$1 editOrderScreenStateRepositoryImpl$screenStateFlow$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof EditOrderScreenStateRepositoryImpl$screenStateFlow$$inlined$map$1$2$1) {
            editOrderScreenStateRepositoryImpl$screenStateFlow$$inlined$map$1$2$1 = (EditOrderScreenStateRepositoryImpl$screenStateFlow$$inlined$map$1$2$1) continuation;
            int i2 = editOrderScreenStateRepositoryImpl$screenStateFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                editOrderScreenStateRepositoryImpl$screenStateFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = editOrderScreenStateRepositoryImpl$screenStateFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = editOrderScreenStateRepositoryImpl$screenStateFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Boolean valueOf = Boolean.valueOf(((Set) obj).contains(this.b));
                    editOrderScreenStateRepositoryImpl$screenStateFlow$$inlined$map$1$2$1.L$0 = null;
                    editOrderScreenStateRepositoryImpl$screenStateFlow$$inlined$map$1$2$1.L$1 = null;
                    editOrderScreenStateRepositoryImpl$screenStateFlow$$inlined$map$1$2$1.L$2 = null;
                    editOrderScreenStateRepositoryImpl$screenStateFlow$$inlined$map$1$2$1.L$3 = null;
                    editOrderScreenStateRepositoryImpl$screenStateFlow$$inlined$map$1$2$1.I$0 = 0;
                    editOrderScreenStateRepositoryImpl$screenStateFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(valueOf, editOrderScreenStateRepositoryImpl$screenStateFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        editOrderScreenStateRepositoryImpl$screenStateFlow$$inlined$map$1$2$1 = new EditOrderScreenStateRepositoryImpl$screenStateFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = editOrderScreenStateRepositoryImpl$screenStateFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = editOrderScreenStateRepositoryImpl$screenStateFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
