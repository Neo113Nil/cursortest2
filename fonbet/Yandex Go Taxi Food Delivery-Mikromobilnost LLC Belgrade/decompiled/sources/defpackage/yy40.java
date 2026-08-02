package defpackage;

import android.util.ArrayMap;
import androidx.camera.core.impl.Config$OptionPriority;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

/* loaded from: classes10.dex */
public final class yy40 extends ug70 {
    public static final Config$OptionPriority w = Config$OptionPriority.OPTIONAL;

    public static yy40 b() {
        return new yy40(new TreeMap(ug70.b));
    }

    public static yy40 p(szd szdVar) {
        TreeMap treeMap = new TreeMap(ug70.b);
        for (x34 x34Var : szdVar.h()) {
            Set<Config$OptionPriority> i = szdVar.i(x34Var);
            ArrayMap arrayMap = new ArrayMap();
            for (Config$OptionPriority config$OptionPriority : i) {
                arrayMap.put(config$OptionPriority, szdVar.c(x34Var, config$OptionPriority));
            }
            treeMap.put(x34Var, arrayMap);
        }
        return new yy40(treeMap);
    }

    public final void t(x34 x34Var, Config$OptionPriority config$OptionPriority, Object obj) {
        Config$OptionPriority config$OptionPriority2;
        TreeMap treeMap = this.a;
        Map map = (Map) treeMap.get(x34Var);
        if (map == null) {
            ArrayMap arrayMap = new ArrayMap();
            treeMap.put(x34Var, arrayMap);
            arrayMap.put(config$OptionPriority, obj);
            return;
        }
        Config$OptionPriority config$OptionPriority3 = (Config$OptionPriority) Collections.min(map.keySet());
        if (Objects.equals(map.get(config$OptionPriority3), obj) || config$OptionPriority3 != (config$OptionPriority2 = Config$OptionPriority.REQUIRED) || config$OptionPriority != config$OptionPriority2) {
            map.put(config$OptionPriority, obj);
            return;
        }
        StringBuilder sb = new StringBuilder("Option values conflicts: ");
        sb.append(x34Var.a);
        sb.append(", existing value (");
        sb.append(config$OptionPriority3);
        Object obj2 = map.get(config$OptionPriority3);
        sb.append(")=");
        sb.append(obj2);
        sb.append(", conflicting (");
        sb.append(config$OptionPriority);
        sb.append(")=");
        sb.append(obj);
        throw new IllegalArgumentException(sb.toString());
    }

    public final void w(x34 x34Var, Object obj) {
        t(x34Var, w, obj);
    }

    public final void z(x34 x34Var) {
        this.a.remove(x34Var);
    }
}
