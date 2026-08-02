package com.yandex.plus.bdui.plus.query;

import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r1;
import defpackage.e5b;
import defpackage.tah;
import java.util.Map;
import kotlin.Pair;

/* loaded from: classes4.dex */
public final class a {
    public static Map a(Map map, Map map2) {
        if (map2 == null) {
            map2 = e5b.a;
            map2.getClass();
        }
        if (map == null) {
            map = e5b.a;
            map.getClass();
        }
        return r1.w(map, tah.b(new Pair("payload", map2)), true);
    }
}
