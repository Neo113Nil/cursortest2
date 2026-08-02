package ru.yandex.taxi.logistics.sdk.dashboard.storage;

import android.content.Context;
import defpackage.cd0;
import defpackage.dxf0;
import defpackage.ha2;
import defpackage.ive;
import defpackage.jl40;
import defpackage.kme0;
import defpackage.qu;
import defpackage.rle0;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;

/* loaded from: classes9.dex */
public final class c {
    public static final ive d = new ive();
    public static final rle0 e = jl40.I("delivery-dashboard-corp", new dxf0(new qu(19)), null, null, 12);
    public final Context a;
    public final ha2 b;
    public final kme0 c = new kme0("corp_client_id");

    public c(Context context) {
        this.a = context;
        this.b = new ha2(1, ive.a(d, context).getData(), this);
    }

    public final Object a(ContinuationImpl continuationImpl) {
        Object a = androidx.datastore.preferences.core.b.a(ive.a(d, this.a), new CorpDataStoreImpl$clear$2(), continuationImpl);
        return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : zy11.a;
    }

    public final Object b(ContinuationImpl continuationImpl) {
        return e.y(new cd0(28, ive.a(d, this.a).getData(), this), continuationImpl);
    }

    public final Object c(String str, ContinuationImpl continuationImpl) {
        Object a = androidx.datastore.preferences.core.b.a(ive.a(d, this.a), new CorpDataStoreImpl$putClientId$2(this, str, null), continuationImpl);
        return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : zy11.a;
    }
}
