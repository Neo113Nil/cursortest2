package com.yandex.plus.core.graphql.fragment;

/* loaded from: classes4.dex */
public final class xi {
    public final wi a;

    public xi(wi wiVar) {
        this.a = wiVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xi) && this.a.equals(((xi) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    public final String toString() {
        return "PlaqueSwitchWidget(text=" + this.a + ')';
    }
}
