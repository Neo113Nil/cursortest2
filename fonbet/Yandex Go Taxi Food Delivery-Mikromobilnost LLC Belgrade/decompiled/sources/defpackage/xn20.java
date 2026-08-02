package defpackage;

import android.content.Context;
import androidx.datastore.core.f;
import androidx.datastore.core.h;
import com.yandex.mob.api.model.MobEnvironment;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.PropertyReference1Impl;

/* loaded from: classes8.dex */
public abstract class xn20 {
    public static final /* synthetic */ kgx[] a = {new PropertyReference1Impl("testingDataStoreDelegate", 1, "getTestingDataStoreDelegate(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", xn20.class), b64.x(qoi0.a, xn20.class, "prodDataStoreDelegate", "getProdDataStoreDelegate(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 1)};
    public static final AtomicReference b;
    public static final rle0 c;
    public static final rle0 d;

    static {
        AtomicReference atomicReference = new AtomicReference(null);
        b = atomicReference;
        jse jseVar = (jse) atomicReference.get();
        if (jseVar == null) {
            sjh sjhVar = uyj.a;
            jseVar = mdh.b;
        }
        c = jl40.I("mob_storage_TESTING", new dxf0(new qz10(2)), null, qv10.e(jseVar), 4);
        jse jseVar2 = (jse) atomicReference.get();
        if (jseVar2 == null) {
            sjh sjhVar2 = uyj.a;
            jseVar2 = mdh.b;
        }
        d = jl40.I("mob_storage_PROD", new dxf0(new qz10(3)), null, qv10.e(jseVar2), 4);
    }

    public static final f a(Context context, MobEnvironment mobEnvironment, List list, tse tseVar) {
        return h.b(yr20.a, new dxf0(new qz10(1)), list, tseVar, new vn20(context, oyr.p("mob_typed_storage_", mobEnvironment.name(), ".json"), 0));
    }
}
