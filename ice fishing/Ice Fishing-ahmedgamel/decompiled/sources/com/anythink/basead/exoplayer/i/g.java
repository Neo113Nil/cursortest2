package com.anythink.basead.exoplayer.i;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final int f8763a;

    /* renamed from: b, reason: collision with root package name */
    private final f[] f8764b;

    /* renamed from: c, reason: collision with root package name */
    private int f8765c;

    public g(f... fVarArr) {
        this.f8764b = fVarArr;
        this.f8763a = fVarArr.length;
    }

    public final f a(int i) {
        return this.f8764b[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f8764b, ((g) obj).f8764b);
    }

    public final int hashCode() {
        if (this.f8765c == 0) {
            this.f8765c = Arrays.hashCode(this.f8764b) + 527;
        }
        return this.f8765c;
    }

    public final f[] a() {
        return (f[]) this.f8764b.clone();
    }
}
