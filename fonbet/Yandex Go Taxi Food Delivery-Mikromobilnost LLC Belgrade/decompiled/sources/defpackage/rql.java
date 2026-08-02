package defpackage;

import ru.yandex.taxi.design.utils.DividerType;

/* loaded from: classes14.dex */
public final class rql implements uhx0, e6v {
    public final DividerType a;

    public rql(DividerType dividerType) {
        this.a = dividerType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rql) && this.a == ((rql) obj).a;
    }

    @Override // defpackage.e6v
    public final String getId() {
        return "Divider";
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) - 955995399;
    }

    public final String toString() {
        return "Divider(type=" + this.a + ", id=Divider)";
    }
}
