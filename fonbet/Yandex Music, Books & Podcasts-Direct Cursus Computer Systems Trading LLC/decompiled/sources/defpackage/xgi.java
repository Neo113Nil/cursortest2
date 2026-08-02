package defpackage;

import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class xgi implements yqr, Serializable {
    public final int a;

    public xgi() {
        hld.w(2, "expectedValuesPerKey");
        this.a = 2;
    }

    @Override // defpackage.yqr
    public final Object get() {
        return new ArrayList(this.a);
    }
}
