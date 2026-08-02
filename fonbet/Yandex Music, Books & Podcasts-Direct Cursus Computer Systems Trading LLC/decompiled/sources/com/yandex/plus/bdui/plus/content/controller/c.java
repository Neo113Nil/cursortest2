package com.yandex.plus.bdui.plus.content.controller;

import defpackage.dfi;

/* loaded from: classes4.dex */
public final class c {
    public final String a;

    public c(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && this.a.equals(((c) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return dfi.i(new StringBuilder("Error(errorMessage="), this.a, ')');
    }
}
