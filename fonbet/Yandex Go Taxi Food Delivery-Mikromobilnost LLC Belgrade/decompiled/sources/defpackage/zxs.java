package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes10.dex */
public final class zxs {
    public final Class a;
    public final int b;
    public final tls c;
    public final List d;
    public final tls e;
    public final wls f;

    public zxs(Class cls, int i, tls tlsVar, List list, tls tlsVar2, wls wlsVar) {
        this.a = cls;
        this.b = i;
        this.c = tlsVar;
        this.d = list;
        this.e = tlsVar2;
        this.f = wlsVar;
    }

    public zxs(g0c g0cVar, int i, List list, tls tlsVar) {
        this(g0cVar.a(), i, null, list, tlsVar, null);
    }

    public zxs(Class cls, int i, List list, tls tlsVar) {
        this(cls, i, null, list, tlsVar, null);
    }

    public zxs(Class cls, int i, tls tlsVar) {
        this(cls, i, null, EmptyList.a, tlsVar, null);
    }

    public zxs(Class cls, tls tlsVar, tls tlsVar2) {
        this(cls, 0, tlsVar, EmptyList.a, tlsVar2, null);
    }
}
