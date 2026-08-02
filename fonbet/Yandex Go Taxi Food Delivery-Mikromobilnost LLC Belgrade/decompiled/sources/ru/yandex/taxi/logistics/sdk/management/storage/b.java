package ru.yandex.taxi.logistics.sdk.management.storage;

import android.content.Context;
import defpackage.dxf0;
import defpackage.jl40;
import defpackage.kme0;
import defpackage.qu;
import defpackage.rle0;
import defpackage.xr3;
import defpackage.zy11;
import java.util.ArrayList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes9.dex */
public final class b {
    public static final xr3 c = new xr3();
    public static final rle0 d = jl40.I("delivery-auto-open-edit-order-details", new dxf0(new qu(6)), null, null, 12);
    public final Context a;
    public final kme0 b = new kme0("AutoOpenedEditOrderDetailsDataStore.shown_edit_order_details_card");

    public b(Context context) {
        this.a = context;
    }

    public final Object a(ArrayList arrayList, Continuation continuation) {
        Object a = androidx.datastore.preferences.core.b.a(xr3.a(c, this.a), new AutoOpenedEditOrderDetailsDataStoreImpl$deleteNonActualDeliveryIds$2(this, arrayList, null), continuation);
        return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : zy11.a;
    }

    public final Object b(String str, Continuation continuation) {
        Object a = androidx.datastore.preferences.core.b.a(xr3.a(c, this.a), new AutoOpenedEditOrderDetailsDataStoreImpl$onEditOrderDetailsShown$2(this, str, null), continuation);
        return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : zy11.a;
    }
}
