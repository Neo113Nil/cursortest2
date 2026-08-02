package defpackage;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Set;

/* loaded from: classes7.dex */
public abstract class tm71 extends AbstractMap {
    public transient sl71 a;
    public transient cw00 b;

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        sl71 sl71Var = this.a;
        if (sl71Var != null) {
            return sl71Var;
        }
        sl71 sl71Var2 = new sl71((kr71) this);
        this.a = sl71Var2;
        return sl71Var2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        cw00 cw00Var = this.b;
        if (cw00Var != null) {
            return cw00Var;
        }
        cw00 cw00Var2 = new cw00(this, 2);
        this.b = cw00Var2;
        return cw00Var2;
    }
}
