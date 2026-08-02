package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class tq60 implements Iterator {
    public final int a;
    public int b;
    public boolean c;
    public final /* synthetic */ br60 w;

    public tq60(br60 br60Var) {
        this.w = br60Var;
        br60Var.b++;
        this.a = br60Var.a.size();
    }

    public final void a() {
        if (this.c) {
            return;
        }
        this.c = true;
        br60 br60Var = this.w;
        int i = br60Var.b - 1;
        br60Var.b = i;
        if (i <= 0 && br60Var.w) {
            br60Var.w = false;
            ArrayList arrayList = br60Var.a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (arrayList.get(size) == null) {
                    arrayList.remove(size);
                }
            }
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        int i2 = this.b;
        while (true) {
            i = this.a;
            if (i2 >= i || this.w.a.get(i2) != null) {
                break;
            }
            i2++;
        }
        if (i2 < i) {
            return true;
        }
        a();
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i;
        ArrayList arrayList = this.w.a;
        while (true) {
            int i2 = this.b;
            i = this.a;
            if (i2 >= i || arrayList.get(i2) != null) {
                break;
            }
            this.b++;
        }
        int i3 = this.b;
        if (i3 < i) {
            this.b = i3 + 1;
            return arrayList.get(i3);
        }
        a();
        ny61.p();
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
