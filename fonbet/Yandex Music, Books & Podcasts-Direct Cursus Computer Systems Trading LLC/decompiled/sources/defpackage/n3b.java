package defpackage;

import java.util.ArrayList;
import kotlin.collections.CollectionsKt;

/* loaded from: classes.dex */
public abstract class n3b implements c3b {
    public int a;
    public final ArrayList b;

    public n3b(int i, int i2) {
        this.a = (i2 & 1) != 0 ? Integer.MAX_VALUE : i;
        this.b = new ArrayList();
    }

    public final String c() {
        return hlr.c(CollectionsKt.X(this.b, ",\n", null, null, null, 62), "  ");
    }
}
