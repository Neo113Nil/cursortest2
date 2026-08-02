package defpackage;

import com.yandex.plus.core.graphql.type.HorizontalAlignment;
import com.yandex.plus.core.graphql.type.VerticalAlignment;

/* loaded from: classes2.dex */
public final class vo11 {
    public final HorizontalAlignment a;
    public final VerticalAlignment b;

    public vo11(HorizontalAlignment horizontalAlignment, VerticalAlignment verticalAlignment) {
        this.a = horizontalAlignment;
        this.b = verticalAlignment;
    }

    public final HorizontalAlignment a() {
        return this.a;
    }

    public final VerticalAlignment b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vo11)) {
            return false;
        }
        vo11 vo11Var = (vo11) obj;
        return this.a == vo11Var.a && this.b == vo11Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OnBoxCrossWidgetGroupProperties(horizontalContentAlignment=" + this.a + ", verticalContentAlignment=" + this.b + ')';
    }
}
