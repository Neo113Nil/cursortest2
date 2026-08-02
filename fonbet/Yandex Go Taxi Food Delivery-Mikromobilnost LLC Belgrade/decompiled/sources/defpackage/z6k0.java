package defpackage;

import android.graphics.Rect;
import com.yandex.go.taxi.summary.rida_summary.repository.MarginSource;
import com.yandex.go.taxi.summary.rida_summary.repository.k;
import com.yandex.go.taxi.summary.rida_summary.repository.m;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.b;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes14.dex */
public final class z6k0 {
    public final r0 a;
    public final m b;

    public z6k0() {
        r0 c = bvf0.c(b.f());
        this.a = c;
        this.b = new m(new k(c));
    }

    public static void a(z6k0 z6k0Var, MarginSource marginSource, Integer num, Integer num2, int i) {
        Object value;
        LinkedHashMap linkedHashMap;
        if ((i & 2) != 0) {
            num = null;
        }
        if ((i & 4) != 0) {
            num2 = null;
        }
        r0 r0Var = z6k0Var.a;
        do {
            value = r0Var.getValue();
            Map map = (Map) value;
            Rect rect = (Rect) map.get(marginSource);
            if (rect == null) {
                rect = new Rect();
            }
            linkedHashMap = new LinkedHashMap(map);
            linkedHashMap.put(marginSource, new Rect(rect.left, num != null ? num.intValue() : rect.top, rect.right, num2 != null ? num2.intValue() : rect.bottom));
        } while (!r0Var.k(value, linkedHashMap));
    }
}
