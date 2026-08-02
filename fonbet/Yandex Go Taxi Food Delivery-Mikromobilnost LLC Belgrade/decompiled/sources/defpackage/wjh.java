package defpackage;

import android.app.Activity;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes13.dex */
public final class wjh implements dcp0 {
    public static final Set b = Collections.newSetFromMap(new WeakHashMap());
    public final Activity a;

    public wjh(Activity activity) {
        this.a = activity;
    }

    public final void a(Object obj) {
        Set set = b;
        set.remove(obj);
        if (set.isEmpty()) {
            this.a.getWindow().setFlags(0, 8192);
        }
    }
}
