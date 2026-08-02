package ru.yandex.logistics.sdk.cargo_form.impl.popup;

import defpackage.ny61;
import defpackage.t3s;
import defpackage.vpr;
import defpackage.zy11;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;

    public a(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        PopupProvider$special$$inlined$map$1$2$1 popupProvider$special$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof PopupProvider$special$$inlined$map$1$2$1) {
            popupProvider$special$$inlined$map$1$2$1 = (PopupProvider$special$$inlined$map$1$2$1) continuation;
            int i2 = popupProvider$special$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                popupProvider$special$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = popupProvider$special$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = popupProvider$special$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    t3s t3sVar = (t3s) obj;
                    List list = t3sVar != null ? t3sVar.e : null;
                    if (list == null) {
                        list = EmptyList.a;
                    }
                    popupProvider$special$$inlined$map$1$2$1.L$0 = null;
                    popupProvider$special$$inlined$map$1$2$1.L$1 = null;
                    popupProvider$special$$inlined$map$1$2$1.L$2 = null;
                    popupProvider$special$$inlined$map$1$2$1.L$3 = null;
                    popupProvider$special$$inlined$map$1$2$1.I$0 = 0;
                    popupProvider$special$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(list, popupProvider$special$$inlined$map$1$2$1) == coroutineSingletons) {
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
        popupProvider$special$$inlined$map$1$2$1 = new PopupProvider$special$$inlined$map$1$2$1(this, continuation);
        Object obj22 = popupProvider$special$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = popupProvider$special$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
