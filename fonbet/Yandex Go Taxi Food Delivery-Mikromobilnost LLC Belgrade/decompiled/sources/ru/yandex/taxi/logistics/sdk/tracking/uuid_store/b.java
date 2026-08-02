package ru.yandex.taxi.logistics.sdk.tracking.uuid_store;

import android.content.Context;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import defpackage.ceu0;
import defpackage.dxf0;
import defpackage.ha2;
import defpackage.j601;
import defpackage.jl40;
import defpackage.kme0;
import defpackage.rle0;
import defpackage.tpg;
import java.util.Map;
import java.util.UUID;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.o;

/* loaded from: classes9.dex */
public final class b {
    public static final j601 d = new j601();
    public static final rle0 e = jl40.I("local_uuids_cache", new dxf0(new ceu0(11)), null, null, 12);
    public final Context a;
    public final kme0 b = new kme0("cache");
    public final JsonAdapter c = new Moshi.Builder().add(UuidJsonAdapter.INSTANCE).build().adapter(Types.newParameterizedType(Map.class, String.class, UUID.class));

    public b(Context context) {
        this.a = context;
    }

    public final Object a(ContinuationImpl continuationImpl) {
        d.getClass();
        return e.y(new o(new ha2(19, ((tpg) e.getValue(this.a, j601.a[0])).getData(), this), new TrackingLocalUuidPreferences$localUuidsMapFlow$2(3, null)), continuationImpl);
    }
}
