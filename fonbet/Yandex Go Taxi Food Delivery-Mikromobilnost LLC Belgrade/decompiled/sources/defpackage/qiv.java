package defpackage;

import java.util.List;

/* loaded from: classes10.dex */
public final class qiv extends k8 {
    public final b9 a;
    public final int b;
    public final int c;

    public qiv(b9 b9Var, int i, int i2) {
        this.a = b9Var;
        this.b = i;
        sb2.h(i, i2, b9Var.size());
        this.c = i2 - i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        sb2.f(i, this.c);
        return this.a.get(this.b + i);
    }

    @Override // defpackage.z6
    public final int getSize() {
        return this.c;
    }

    @Override // defpackage.k8, java.util.List
    public final List subList(int i, int i2) {
        sb2.h(i, i2, this.c);
        int i3 = this.b;
        return new qiv(this.a, i + i3, i3 + i2);
    }
}
