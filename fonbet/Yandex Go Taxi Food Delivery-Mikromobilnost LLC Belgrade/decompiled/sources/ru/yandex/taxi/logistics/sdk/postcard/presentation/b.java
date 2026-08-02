package ru.yandex.taxi.logistics.sdk.postcard.presentation;

import android.content.Context;
import defpackage.dxf0;
import defpackage.jl40;
import defpackage.kgx;
import defpackage.kme0;
import defpackage.qda0;
import defpackage.qoi0;
import defpackage.rle0;
import defpackage.tpg;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.PropertyReference2Impl;

/* loaded from: classes9.dex */
public final class b {
    public static final /* synthetic */ kgx[] d;
    public final Context a;
    public final kme0 b = new kme0("shown_deliveries");
    public final rle0 c = jl40.I("logistics-postcard-data-storage", new dxf0(new qda0(15)), null, null, 12);

    static {
        PropertyReference2Impl propertyReference2Impl = new PropertyReference2Impl(b.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;");
        qoi0.a.getClass();
        d = new kgx[]{propertyReference2Impl};
    }

    public b(Context context) {
        this.a = context;
    }

    public final Object a(String str, Continuation continuation) {
        Object a = androidx.datastore.preferences.core.b.a((tpg) this.c.getValue(this.a, d[0]), new PostcardDataStorage$applyPostcardWasShown$2(this, str, null), continuation);
        return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : zy11.a;
    }
}
