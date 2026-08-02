package ru.yandex.taxi.logistics.sdk.tracking.impl.edit_order_details.domain;

import defpackage.l7;
import defpackage.ny61;
import defpackage.xr3;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;
import ru.yandex.taxi.logistics.sdk.management.storage.b;

/* loaded from: classes5.dex */
public final class a {
    public final b a;

    public a(b bVar) {
        this.a = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl, boolean z) {
        EditOrderDetailsForceShowInteractor$shouldForceShowEditOrderDetailsView$1 editOrderDetailsForceShowInteractor$shouldForceShowEditOrderDetailsView$1;
        int i;
        if (continuationImpl instanceof EditOrderDetailsForceShowInteractor$shouldForceShowEditOrderDetailsView$1) {
            editOrderDetailsForceShowInteractor$shouldForceShowEditOrderDetailsView$1 = (EditOrderDetailsForceShowInteractor$shouldForceShowEditOrderDetailsView$1) continuationImpl;
            int i2 = editOrderDetailsForceShowInteractor$shouldForceShowEditOrderDetailsView$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                editOrderDetailsForceShowInteractor$shouldForceShowEditOrderDetailsView$1.label = i2 - Integer.MIN_VALUE;
                Object obj = editOrderDetailsForceShowInteractor$shouldForceShowEditOrderDetailsView$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = editOrderDetailsForceShowInteractor$shouldForceShowEditOrderDetailsView$1.label;
                int i3 = 1;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (!z) {
                        return Boolean.FALSE;
                    }
                    editOrderDetailsForceShowInteractor$shouldForceShowEditOrderDetailsView$1.L$0 = null;
                    editOrderDetailsForceShowInteractor$shouldForceShowEditOrderDetailsView$1.Z$0 = z;
                    editOrderDetailsForceShowInteractor$shouldForceShowEditOrderDetailsView$1.label = 1;
                    b bVar = this.a;
                    obj = e.y(new l7(i3, xr3.a(b.c, bVar.a).getData(), bVar, str), editOrderDetailsForceShowInteractor$shouldForceShowEditOrderDetailsView$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return Boolean.valueOf(!((Boolean) obj).booleanValue());
            }
        }
        editOrderDetailsForceShowInteractor$shouldForceShowEditOrderDetailsView$1 = new EditOrderDetailsForceShowInteractor$shouldForceShowEditOrderDetailsView$1(this, continuationImpl);
        Object obj2 = editOrderDetailsForceShowInteractor$shouldForceShowEditOrderDetailsView$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = editOrderDetailsForceShowInteractor$shouldForceShowEditOrderDetailsView$1.label;
        int i32 = 1;
        if (i != 0) {
        }
        return Boolean.valueOf(!((Boolean) obj2).booleanValue());
    }
}
