package defpackage;

import java.util.ArrayList;

/* loaded from: classes7.dex */
public final class vq60 implements xq60 {
    public int a;
    public boolean b;
    public final /* synthetic */ zq60 c;

    public vq60(zq60 zq60Var) {
        this.c = zq60Var;
        zq60Var.b++;
        this.a = zq60Var.a.size() - 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        zq60 zq60Var;
        int i = this.a;
        while (true) {
            zq60Var = this.c;
            if (i < 0 || zq60Var.a.get(i) != null) {
                break;
            }
            i--;
        }
        if (i >= 0) {
            return true;
        }
        if (this.b) {
            return false;
        }
        this.b = true;
        zq60.a(zq60Var);
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        zq60 zq60Var = this.c;
        ArrayList arrayList = zq60Var.a;
        while (true) {
            int i = this.a;
            if (i < 0 || arrayList.get(i) != null) {
                break;
            }
            this.a--;
        }
        int i2 = this.a;
        if (i2 >= 0) {
            this.a = i2 - 1;
            return arrayList.get(i2);
        }
        if (!this.b) {
            this.b = true;
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
        boolean z = this.b;
        zq60 zq60Var = this.c;
        if (!z) {
            this.b = true;
            zq60.a(zq60Var);
        }
        zq60Var.b++;
        this.b = false;
        this.a = zq60Var.a.size() - 1;
    }
}
