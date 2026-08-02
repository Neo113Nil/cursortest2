package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class sq60 implements xq60 {
    public int a;
    public int b;
    public boolean c;
    public final /* synthetic */ zq60 w;

    public sq60(zq60 zq60Var) {
        this.w = zq60Var;
        zq60Var.b++;
        this.a = zq60Var.a.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        zq60 zq60Var;
        int i = this.b;
        while (true) {
            int i2 = this.a;
            zq60Var = this.w;
            if (i >= i2 || zq60Var.a.get(i) != null) {
                break;
            }
            i++;
        }
        if (i < this.a) {
            return true;
        }
        if (this.c) {
            return false;
        }
        this.c = true;
        zq60.a(zq60Var);
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        zq60 zq60Var = this.w;
        ArrayList arrayList = zq60Var.a;
        while (true) {
            int i = this.b;
            if (i >= this.a || arrayList.get(i) != null) {
                break;
            }
            this.b++;
        }
        int i2 = this.b;
        if (i2 < this.a) {
            this.b = i2 + 1;
            return arrayList.get(i2);
        }
        if (!this.c) {
            this.c = true;
            zq60.a(zq60Var);
        }
        ny61.p();
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.xq60
    public final void rewind() {
        boolean z = this.c;
        zq60 zq60Var = this.w;
        if (!z) {
            this.c = true;
            zq60.a(zq60Var);
        }
        zq60Var.b++;
        this.a = zq60Var.a.size();
        this.c = false;
        this.b = 0;
    }
}
