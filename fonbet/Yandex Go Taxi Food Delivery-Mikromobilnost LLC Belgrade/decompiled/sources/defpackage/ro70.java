package defpackage;

import java.util.Collections;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

@gsq0
/* loaded from: classes6.dex */
public final class ro70 {
    public static final qo70 Companion = new qo70();
    public static final i3y[] d = {null, null, a.b(LazyThreadSafetyMode.PUBLICATION, new jl70(13))};
    public final String a;
    public final String b;
    public final List c;

    public ro70(int i, String str, String str2, List list) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, po70.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        if ((i & 4) == 0) {
            this.c = Collections.singletonList("code_dispatch");
        } else {
            this.c = list;
        }
    }

    public ro70(String str, String str2) {
        List singletonList = Collections.singletonList("code_dispatch");
        this.a = str;
        this.b = str2;
        this.c = singletonList;
    }
}
