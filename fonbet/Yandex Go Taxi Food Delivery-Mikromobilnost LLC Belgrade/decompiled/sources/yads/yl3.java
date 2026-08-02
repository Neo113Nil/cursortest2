package yads;

import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.gw00;
import defpackage.k4o;
import defpackage.tcc;
import defpackage.ws81;
import java.util.LinkedHashMap;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class yl3 {
    public static final ws81 c;
    public static final LinkedHashMap d;
    public static final yl3 e;
    public static final /* synthetic */ yl3[] f;
    public final String b;

    static {
        yl3 yl3Var = new yl3(0, "DEFAULT", "default");
        e = yl3Var;
        yl3[] yl3VarArr = {yl3Var, new yl3(1, "CACHE_ELSE_NETWORK", "cache_else_network"), new yl3(2, "CACHE_ONLY", "cache_only"), new yl3(3, "DISABLED", BackendConfig.Restrictions.DISABLED)};
        f = yl3VarArr;
        k4o a = a.a(yl3VarArr);
        c = new ws81();
        int d2 = gw00.d(tcc.n(a, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(d2 < 16 ? 16 : d2);
        for (Object obj : a) {
            linkedHashMap.put(((yl3) obj).b, obj);
        }
        d = linkedHashMap;
    }

    public yl3(int i, String str, String str2) {
        this.b = str2;
    }

    public static yl3 valueOf(String str) {
        return (yl3) Enum.valueOf(yl3.class, str);
    }

    public static yl3[] values() {
        return (yl3[]) f.clone();
    }
}
