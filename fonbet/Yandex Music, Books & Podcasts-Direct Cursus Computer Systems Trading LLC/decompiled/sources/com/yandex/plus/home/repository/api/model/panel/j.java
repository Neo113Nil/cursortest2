package com.yandex.plus.home.repository.api.model.panel;

import defpackage.dfi;

/* loaded from: classes5.dex */
public final class j implements n {
    public final String a;

    public j(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && this.a.equals(((j) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return dfi.i(new StringBuilder("DarkSectionNotFound(sectionType="), this.a, ')');
    }
}
