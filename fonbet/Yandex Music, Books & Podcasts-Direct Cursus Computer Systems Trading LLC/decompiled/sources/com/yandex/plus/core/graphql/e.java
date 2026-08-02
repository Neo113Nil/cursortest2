package com.yandex.plus.core.graphql;

import defpackage.q6n;

/* loaded from: classes4.dex */
public final class e implements q6n {
    public final d a;

    public e(d dVar) {
        this.a = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && this.a.equals(((e) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Data(collectUserContacts=" + this.a + ')';
    }
}
