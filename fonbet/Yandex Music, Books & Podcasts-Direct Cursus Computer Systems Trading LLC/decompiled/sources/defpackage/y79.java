package defpackage;

import android.util.DisplayMetrics;
import android.view.View;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final class y79 {
    public final efb a;
    public final gc8 b;
    public final LinkedHashMap c = new LinkedHashMap();
    public final LinkedHashMap d = new LinkedHashMap();
    public final LinkedHashMap e = new LinkedHashMap();
    public gzj f;

    public y79(efb efbVar, gc8 gc8Var) {
        this.a = efbVar;
        this.b = gc8Var;
    }

    public final void a(View view, w79 w79Var) {
        if (w79Var == null) {
            return;
        }
        Set set = (Set) this.e.get(this.b.getDivData());
        if (set != null) {
            set.remove(w79Var);
        }
        Object tag = view.getTag(R.id.div_layout_provider_listener_id);
        view.removeOnLayoutChangeListener(tag instanceof View.OnLayoutChangeListener ? (View.OnLayoutChangeListener) tag : null);
    }

    public final void b(DisplayMetrics displayMetrics, String str, c89 c89Var, int i, int i2, int i3, int i4, xzb xzbVar, dfb dfbVar) {
        int i5;
        if (str == null || str.length() == 0 || (i5 = i2 - i) == i4 - i3) {
            return;
        }
        if (c89Var.u.contains(str)) {
            dfbVar.d(new Throwable(hrg.q("Size subscriber for variable '", str, "' affects original view size. Relayout was prevented.")));
            return;
        }
        LinkedHashMap linkedHashMap = this.c;
        Object obj = linkedHashMap.get(xzbVar);
        if (obj == null) {
            obj = new LinkedHashMap();
            linkedHashMap.put(xzbVar, obj);
        }
        ((Map) obj).put(str, Integer.valueOf(eeh.b(sb.w(Integer.valueOf(i5), displayMetrics))));
    }
}
