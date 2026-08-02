package defpackage;

import java.util.Map;

/* loaded from: classes4.dex */
public final class oao implements rao {
    public final Object a;

    public oao(Map map) {
        this.a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oao) && this.a.equals(((oao) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return dfi.g("Custom(map=", ")", this.a);
    }
}
