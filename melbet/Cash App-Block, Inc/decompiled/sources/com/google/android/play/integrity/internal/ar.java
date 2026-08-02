package com.google.android.play.integrity.internal;

import java.util.Objects;

/* loaded from: classes4.dex */
public final class ar extends ap {
    public static final ar a = new ar(new Object[0]);
    public final transient Object[] b;

    public ar(Object[] objArr) {
        this.b = objArr;
    }

    @Override // com.google.android.play.integrity.internal.ap, com.google.android.play.integrity.internal.am
    public final int a(Object[] objArr) {
        System.arraycopy(this.b, 0, objArr, 0, 0);
        return 0;
    }

    @Override // com.google.android.play.integrity.internal.am
    public final int b() {
        return 0;
    }

    @Override // com.google.android.play.integrity.internal.am
    public final int c() {
        return 0;
    }

    @Override // com.google.android.play.integrity.internal.am
    public final Object[] e() {
        return this.b;
    }

    @Override // java.util.List
    public final Object get(int i) {
        aj.a(i, 0);
        Object obj = this.b[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return 0;
    }
}
