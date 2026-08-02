package defpackage;

import com.yandex.fintechsdk.entities.region.Region;
import kotlin.collections.a;

/* loaded from: classes12.dex */
public final class tpi0 {
    public static Region a(String str) {
        String str2;
        if (str != null && (str2 = (String) a.b0(evu0.Y(str, new char[]{'.'}, 0, 6))) != null) {
            for (Region region : Region.a()) {
                if (str2.equals(region.getKey())) {
                    return region;
                }
            }
            return Region.RU;
        }
        return Region.RU;
    }
}
