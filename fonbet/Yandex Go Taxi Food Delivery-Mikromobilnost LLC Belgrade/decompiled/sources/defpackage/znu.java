package defpackage;

import java.util.Collections;
import java.util.List;

/* loaded from: classes10.dex */
public abstract class znu implements o5r {
    public final String a;
    public final List b;
    public final boolean c;

    public znu(String str, List list, boolean z) {
        this.a = str;
        this.b = Collections.unmodifiableList(list);
        this.c = z;
    }
}
