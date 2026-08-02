package defpackage;

import android.content.Context;
import java.util.concurrent.ConcurrentHashMap;
import yads.pf1;
import yads.qf1;

/* loaded from: classes7.dex */
public abstract class s881 {
    public static final ConcurrentHashMap a = new ConcurrentHashMap();

    public static final pf1 a(Context context, String str) {
        return (pf1) a.computeIfAbsent(str, new em21(1, new qf1(context, str)));
    }
}
