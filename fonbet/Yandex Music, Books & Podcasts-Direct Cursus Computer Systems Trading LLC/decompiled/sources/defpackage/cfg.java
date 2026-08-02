package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class cfg {
    public static final AtomicLong f = new AtomicLong();
    public final nb7 a;
    public final Uri b;
    public final Map c;
    public final long d;
    public final long e;

    public cfg(nb7 nb7Var) {
        this(nb7Var, nb7Var.a, Collections.EMPTY_MAP, 0L, 0L);
    }

    public cfg(nb7 nb7Var, Uri uri, Map map, long j, long j2) {
        this.a = nb7Var;
        this.b = uri;
        this.c = map;
        this.d = j;
        this.e = j2;
    }
}
