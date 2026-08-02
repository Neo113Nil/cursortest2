package defpackage;

import android.content.Context;
import android.content.res.Resources;
import java.util.concurrent.ConcurrentHashMap;
import timber.log.Timber;

/* loaded from: classes6.dex */
public abstract class g3o {
    static {
        new ConcurrentHashMap();
    }

    public static String a(int i, int i2, Object... objArr) {
        try {
            return ((Context) sk3.I(Context.class)).getResources().getQuantityString(i, i2, objArr);
        } catch (Resources.NotFoundException e) {
            Timber.wtf(e, "Missing resources. Current locale: %s", swf.I());
            return ((Context) sk3.I(Context.class)).getResources().getQuantityString(i, 1, objArr);
        }
    }

    public static String b(int i) {
        return ((Context) sk3.I(Context.class)).getResources().getString(i);
    }

    public static String c(int i, Object... objArr) {
        return ((Context) sk3.I(Context.class)).getResources().getString(i, objArr);
    }
}
