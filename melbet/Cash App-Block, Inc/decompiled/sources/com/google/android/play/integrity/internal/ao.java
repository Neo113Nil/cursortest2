package com.google.android.play.integrity.internal;

/* loaded from: classes4.dex */
public final class ao extends ap {
    public final transient int a;
    public final transient int b;
    public final /* synthetic */ ap c;

    public ao(ap apVar, int i, int i2) {
        this.c = apVar;
        this.a = i;
        this.b = i2;
    }

    @Override // com.google.android.play.integrity.internal.am
    public final int b() {
        return this.c.c() + this.a + this.b;
    }

    @Override // com.google.android.play.integrity.internal.am
    public final int c() {
        return this.c.c() + this.a;
    }

    @Override // com.google.android.play.integrity.internal.am
    public final Object[] e() {
        return this.c.e();
    }

    @Override // com.google.android.play.integrity.internal.ap, java.util.List
    /* renamed from: f */
    public final ap subList(int i, int i2) {
        aj.c(i, i2, this.b);
        int i3 = this.a;
        return this.c.subList(i + i3, i2 + i3);
    }

    @Override // java.util.List
    public final Object get(int i) {
        aj.a(i, this.b);
        return this.c.get(i + this.a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.b;
    }
}
