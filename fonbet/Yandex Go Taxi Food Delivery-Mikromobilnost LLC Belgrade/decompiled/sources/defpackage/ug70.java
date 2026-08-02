package defpackage;

import android.util.ArrayMap;
import androidx.camera.core.impl.Config$OptionPriority;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* loaded from: classes10.dex */
public class ug70 implements szd {
    public static final y60 b;
    public static final ug70 c;
    public final TreeMap a;

    static {
        y60 y60Var = new y60(22);
        b = y60Var;
        c = new ug70(new TreeMap(y60Var));
    }

    public ug70(TreeMap treeMap) {
        this.a = treeMap;
    }

    public static ug70 a(szd szdVar) {
        if (ug70.class.equals(szdVar.getClass())) {
            return (ug70) szdVar;
        }
        TreeMap treeMap = new TreeMap(b);
        for (x34 x34Var : szdVar.h()) {
            Set<Config$OptionPriority> i = szdVar.i(x34Var);
            ArrayMap arrayMap = new ArrayMap();
            for (Config$OptionPriority config$OptionPriority : i) {
                arrayMap.put(config$OptionPriority, szdVar.c(x34Var, config$OptionPriority));
            }
            treeMap.put(x34Var, arrayMap);
        }
        return new ug70(treeMap);
    }

    @Override // defpackage.szd
    public final Object c(x34 x34Var, Config$OptionPriority config$OptionPriority) {
        Map map = (Map) this.a.get(x34Var);
        if (map == null) {
            kbs.f(x34Var, "Option does not exist: ");
            return null;
        }
        if (map.containsKey(config$OptionPriority)) {
            return map.get(config$OptionPriority);
        }
        w511.l("Option does not exist: ", x34Var, " with priority=", config$OptionPriority);
        return null;
    }

    @Override // defpackage.szd
    public final boolean d(x34 x34Var) {
        return this.a.containsKey(x34Var);
    }

    @Override // defpackage.szd
    public final Config$OptionPriority e(x34 x34Var) {
        Map map = (Map) this.a.get(x34Var);
        if (map != null) {
            return (Config$OptionPriority) Collections.min(map.keySet());
        }
        kbs.f(x34Var, "Option does not exist: ");
        return null;
    }

    @Override // defpackage.szd
    public final Object f(x34 x34Var) {
        Map map = (Map) this.a.get(x34Var);
        if (map != null) {
            return map.get((Config$OptionPriority) Collections.min(map.keySet()));
        }
        kbs.f(x34Var, "Option does not exist: ");
        return null;
    }

    @Override // defpackage.szd
    public final Object g(x34 x34Var, Object obj) {
        Map map = (Map) this.a.get(x34Var);
        return map == null ? obj : map.get((Config$OptionPriority) Collections.min(map.keySet()));
    }

    @Override // defpackage.szd
    public final Set h() {
        return Collections.unmodifiableSet(this.a.keySet());
    }

    @Override // defpackage.szd
    public final Set i(x34 x34Var) {
        Map map = (Map) this.a.get(x34Var);
        return map == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(map.keySet());
    }

    @Override // defpackage.szd
    public final void j(lzd lzdVar) {
        for (Map.Entry entry : this.a.tailMap(new x34("camera2.captureRequest.option.", Void.class, null)).entrySet()) {
            if (!((x34) entry.getKey()).a.startsWith("camera2.captureRequest.option.")) {
                return;
            } else {
                lzdVar.a((x34) entry.getKey());
            }
        }
    }
}
