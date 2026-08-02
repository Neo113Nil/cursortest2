package com.yandex.plus.acquisition.sdk.button.section.ui.api;

import defpackage.k5r;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b implements h {
    public final String a;
    public final String b;
    public final NoSuchElementException c;

    public b(String str, String str2, NoSuchElementException noSuchElementException) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = noSuchElementException;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.a, bVar.a) && Intrinsics.d(this.b, bVar.b) && this.c.equals(bVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + k5r.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "Error(page=" + this.a + ", place=" + this.b + ", cause=" + this.c + ')';
    }
}
