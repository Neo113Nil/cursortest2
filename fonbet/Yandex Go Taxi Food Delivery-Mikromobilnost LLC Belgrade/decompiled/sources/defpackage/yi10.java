package defpackage;

import com.yandex.fintechsdk.core.analytics.impl.internal.a;
import kotlin.collections.builders.MapBuilder;

/* loaded from: classes12.dex */
public final class yi10 {
    public final z22 a;
    public final wi10 b;

    public yi10(z22 z22Var, wi10 wi10Var) {
        this.a = z22Var;
        this.b = wi10Var;
    }

    public final void a(String str, String str2) {
        vi10 a = ((xi10) this.b).a();
        long j = a.c;
        long j2 = a.a;
        boolean z = a.b;
        MapBuilder mapBuilder = new MapBuilder();
        mapBuilder.put("scenario", str2);
        mapBuilder.put("checkpoint", str);
        mapBuilder.put("used_memory_mb", String.valueOf(j));
        mapBuilder.put("available_memory_mb", String.valueOf(j2));
        mapBuilder.put("is_low_memory", String.valueOf(z));
        ((a) this.a).a(new fyt0("stability_memory_snapshot", mapBuilder.j()));
    }
}
