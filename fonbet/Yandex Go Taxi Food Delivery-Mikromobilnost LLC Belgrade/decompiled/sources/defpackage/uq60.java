package defpackage;

import java.util.ArrayList;

/* loaded from: classes11.dex */
public final class uq60 implements yq60 {
    public int a;
    public int b;
    public boolean c;
    public final /* synthetic */ cr60 w;

    public uq60(cr60 cr60Var) {
        this.w = cr60Var;
        cr60Var.b++;
        this.a = cr60Var.a.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        cr60 cr60Var;
        int i = this.b;
        while (true) {
            int i2 = this.a;
            cr60Var = this.w;
            if (i >= i2 || cr60Var.a.get(i) != null) {
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
        cr60.a(cr60Var);
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        cr60 cr60Var = this.w;
        ArrayList arrayList = cr60Var.a;
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
            cr60.a(cr60Var);
        }
        ny61.p();
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.yq60
    public final void rewind() {
        boolean z = this.c;
        cr60 cr60Var = this.w;
        if (!z) {
            this.c = true;
            cr60.a(cr60Var);
        }
        cr60Var.b++;
        this.a = cr60Var.a.size();
        this.c = false;
        this.b = 0;
    }
}
