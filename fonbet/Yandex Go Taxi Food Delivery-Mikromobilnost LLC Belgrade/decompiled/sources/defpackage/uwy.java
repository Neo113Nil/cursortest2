package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes10.dex */
public final class uwy {
    public static final AtomicLong f = new AtomicLong();
    public final npg a;
    public final Uri b;
    public final Map c;
    public final long d;
    public final long e;

    public uwy(npg npgVar) {
        this(npgVar, npgVar.a, Collections.EMPTY_MAP, 0L, 0L);
    }

    public uwy(npg npgVar, Uri uri, Map map, long j, long j2) {
        this.a = npgVar;
        this.b = uri;
        this.c = map;
        this.d = j;
        this.e = j2;
    }
}
