package com.yandex.plus.bdui.flex.ui;

import defpackage.rar;

/* loaded from: classes4.dex */
public final class h implements i {
    public final rar a;

    public h(rar rarVar) {
        this.a = rarVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && this.a.equals(((h) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Updating(updateJob=" + this.a + ')';
    }
}
