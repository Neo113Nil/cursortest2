package defpackage;

import android.graphics.Rect;
import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.b;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes8.dex */
public final class u4s0 implements t4s0 {
    public final LinkedHashMap a = new LinkedHashMap();
    public final LinkedHashMap b = new LinkedHashMap();
    public Map c = b.f();
    public final Rect d = new Rect();
    public final n0 e = ffx.b(0, 1, BufferOverflow.DROP_OLDEST);

    public final ArrayList a() {
        Collection<hx31> values = this.c.values();
        ArrayList arrayList = new ArrayList();
        for (hx31 hx31Var : values) {
            hq31 b = b((View) this.a.get(hx31Var.c()), hx31Var);
            if (!b.v()) {
                b = null;
            }
            Map a = b != null ? b.a() : null;
            if (a != null) {
                arrayList.add(a);
            }
        }
        return arrayList;
    }

    public final hq31 b(View view, hx31 hx31Var) {
        float f;
        float f2;
        Rect rect = new Rect();
        if (view != null && view.isShown() && view.getGlobalVisibleRect(rect) && rect.intersect(this.d)) {
            f = rect.height() / view.getHeight();
            f2 = rect.width() / view.getWidth();
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        if (hx31Var instanceof yyr0) {
            return new unl0(((yyr0) hx31Var).e(), f, f2);
        }
        if (!(hx31Var instanceof eeu)) {
            return omy0.s();
        }
        eeu eeuVar = (eeu) hx31Var;
        return new i9u(eeuVar.n(), eeuVar.m(), f, f2);
    }

    public final void c(String str) {
        LinkedHashMap linkedHashMap = this.b;
        int intValue = ((Number) linkedHashMap.getOrDefault(str, 0)).intValue();
        if (intValue > 1) {
            linkedHashMap.put(str, Integer.valueOf(intValue - 1));
        } else {
            linkedHashMap.remove(str);
            this.a.remove(str);
        }
    }

    public final void d(View view, String str) {
        this.a.put(str, view);
        LinkedHashMap linkedHashMap = this.b;
        linkedHashMap.put(str, Integer.valueOf(((Number) linkedHashMap.getOrDefault(str, 0)).intValue() + 1));
        hx31 hx31Var = (hx31) this.c.get(str);
        if (hx31Var != null) {
            this.e.g(hx31Var);
        }
    }
}
