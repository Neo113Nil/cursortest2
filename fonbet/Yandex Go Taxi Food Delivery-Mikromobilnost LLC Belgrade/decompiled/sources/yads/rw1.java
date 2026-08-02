package yads;

import defpackage.ela1;
import defpackage.pg61;
import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: classes7.dex */
public final class rw1 implements pg61, Serializable {
    public final int b;

    public rw1() {
        ela1.a(2, "expectedValuesPerKey");
        this.b = 2;
    }

    @Override // defpackage.pg61
    public final Object get() {
        return new ArrayList(this.b);
    }
}
