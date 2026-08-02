package defpackage;

import java.util.ArrayList;

/* loaded from: classes11.dex */
public final class wq60 implements yq60 {
    public int a;
    public boolean b;
    public final /* synthetic */ cr60 c;

    public wq60(cr60 cr60Var) {
        this.c = cr60Var;
        cr60Var.b++;
        this.a = cr60Var.a.size() - 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        cr60 cr60Var;
        int i = this.a;
        while (true) {
            cr60Var = this.c;
            if (i < 0 || cr60Var.a.get(i) != null) {
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
        cr60.a(cr60Var);
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        cr60 cr60Var = this.c;
        ArrayList arrayList = cr60Var.a;
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
        boolean z = this.b;
        cr60 cr60Var = this.c;
        if (!z) {
            this.b = true;
            cr60.a(cr60Var);
        }
        cr60Var.b++;
        this.b = false;
        this.a = cr60Var.a.size() - 1;
    }
}
