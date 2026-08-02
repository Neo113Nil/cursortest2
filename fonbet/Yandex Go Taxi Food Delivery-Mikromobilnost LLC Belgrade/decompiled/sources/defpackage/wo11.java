package defpackage;

import com.yandex.plus.core.graphql.type.HorizontalAlignment;

/* loaded from: classes2.dex */
public final class wo11 {
    public final HorizontalAlignment a;

    public wo11(HorizontalAlignment horizontalAlignment) {
        this.a = horizontalAlignment;
    }

    public final HorizontalAlignment a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wo11) && this.a == ((wo11) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnColumnCrossWidgetGroupProperties(horizontalContentAlignment=" + this.a + ')';
    }
}
