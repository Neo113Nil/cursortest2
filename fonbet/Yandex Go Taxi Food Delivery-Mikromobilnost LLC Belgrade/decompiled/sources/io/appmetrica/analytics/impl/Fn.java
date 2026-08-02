package io.appmetrica.analytics.impl;

import android.util.SparseArray;
import io.appmetrica.analytics.BuildConfig;
import org.json.JSONObject;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes9.dex */
public final class Fn extends Ee {
    public final Zr a;

    public Fn() {
        this(Jb.k().D().b());
    }

    @Override // io.appmetrica.analytics.impl.Ee
    public final void a(int i) {
        Zr zr = this.a;
        synchronized (zr) {
            JSONObject a = zr.a.a();
            if (a.optInt("last_migration_api_level", -1) != i) {
                zr.a.a(a.put("last_migration_api_level", i));
            }
            bs bsVar = zr.a;
            bs.a(bsVar.a);
            bs.a(bsVar.b);
        }
    }

    @Override // io.appmetrica.analytics.impl.Ee
    public final int b() {
        int optInt;
        Zr zr = this.a;
        synchronized (zr) {
            optInt = zr.a.a().optInt("last_migration_api_level", -1);
        }
        return optInt;
    }

    @Override // io.appmetrica.analytics.impl.Ee
    public final SparseArray<De> c() {
        SparseArray<De> sparseArray = new SparseArray<>(1);
        sparseArray.put(112, new Gn(this.a));
        sparseArray.put(HProv.PP_CACHE_SIZE, new Hn());
        sparseArray.put(BuildConfig.API_LEVEL, new Kn());
        return sparseArray;
    }

    public Fn(Zr zr) {
        this.a = zr;
    }
}
