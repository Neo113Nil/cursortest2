package com.anythink.basead.exoplayer.i;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final int f7977a;

    /* renamed from: b, reason: collision with root package name */
    private final f[] f7978b;

    /* renamed from: c, reason: collision with root package name */
    private int f7979c;

    public g(f... fVarArr) {
        this.f7978b = fVarArr;
        this.f7977a = fVarArr.length;
    }

    public final f a(int i) {
        return this.f7978b[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f7978b, ((g) obj).f7978b);
    }

    public final int hashCode() {
        if (this.f7979c == 0) {
            this.f7979c = Arrays.hashCode(this.f7978b) + 527;
        }
        return this.f7979c;
    }

    public final f[] a() {
        return (f[]) this.f7978b.clone();
    }
}
