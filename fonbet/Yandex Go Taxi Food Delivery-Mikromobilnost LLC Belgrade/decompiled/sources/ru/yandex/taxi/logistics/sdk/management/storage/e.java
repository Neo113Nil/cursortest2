package ru.yandex.taxi.logistics.sdk.management.storage;

import android.content.Context;
import defpackage.d1j;
import defpackage.dsg;
import defpackage.dxf0;
import defpackage.jl40;
import defpackage.kme0;
import defpackage.rle0;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes9.dex */
public final class e {
    public static final d1j b = new d1j();
    public static final rle0 c = jl40.I("details_card_to_expand", new dxf0(new dsg(13)), null, null, 12);
    public final Context a;

    public e(Context context) {
        this.a = context;
    }

    public final Object a(ContinuationImpl continuationImpl) {
        Object a = androidx.datastore.preferences.core.b.a(d1j.a(b, this.a), new DetailCardsToExpandDataStoreImpl$clearStore$2(), continuationImpl);
        return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : zy11.a;
    }

    public final Object b(String str, ContinuationImpl continuationImpl) {
        Object a = androidx.datastore.preferences.core.b.a(d1j.a(b, this.a), new DetailCardsToExpandDataStoreImpl$putOfferOrDeliveryIdInfo$2(new kme0(str), null), continuationImpl);
        return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : zy11.a;
    }
}
