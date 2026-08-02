package defpackage;

import com.yandex.plus.core.graphql.type.VerticalAlignment;

/* loaded from: classes2.dex */
public final class xo11 {
    public final VerticalAlignment a;

    public xo11(VerticalAlignment verticalAlignment) {
        this.a = verticalAlignment;
    }

    public final VerticalAlignment a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xo11) && this.a == ((xo11) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnRowCrossWidgetGroupProperties(verticalContentAlignment=" + this.a + ')';
    }
}
