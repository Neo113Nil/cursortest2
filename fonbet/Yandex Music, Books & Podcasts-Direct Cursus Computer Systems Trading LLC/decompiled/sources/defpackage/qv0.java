package defpackage;

import java.util.List;
import kotlin.Pair;

/* loaded from: classes4.dex */
public abstract class qv0 {
    public static final jyr a = btf.b(new zb0(12));
    public static final jyr b = btf.b(new zb0(13));
    public static final jyr c = btf.b(new zb0(14));
    public static final List d = xz0.w(new String[]{"OnePlus", "HUAWEI", "HONOR"});
    public static final Object e;

    static {
        Float valueOf = Float.valueOf(0.9f);
        e = uah.e(new Pair("HUAWEI", valueOf), new Pair("HONOR", valueOf));
    }

    public static boolean a() {
        return ((Boolean) a.getValue()).booleanValue();
    }
}
