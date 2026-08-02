package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

@gsq0
/* loaded from: classes5.dex */
public final class t0o {
    public static final s0o Companion = new s0o();
    public static final i3y[] d;
    public final String a;
    public final List b;
    public final List c;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        d = new i3y[]{null, a.b(lazyThreadSafetyMode, new fgn(22)), a.b(lazyThreadSafetyMode, new fgn(23))};
    }

    public /* synthetic */ t0o(int i, String str, List list, List list2) {
        if (7 != (i & 7)) {
            qje.Z(i, 7, r0o.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = list;
        this.c = list2;
    }

    public t0o(String str, ArrayList arrayList, ArrayList arrayList2) {
        this.a = str;
        this.b = arrayList;
        this.c = arrayList2;
    }
}
