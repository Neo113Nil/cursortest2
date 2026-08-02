package defpackage;

import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class wlk implements Iterator, j9f {
    public final bat[] a;
    public int b;
    public boolean c = true;

    public wlk(aat aatVar, bat[] batVarArr) {
        this.a = batVarArr;
        batVarArr[0].a(Integer.bitCount(aatVar.a) * 2, 0, aatVar.d);
        this.b = 0;
        a();
    }

    public final void a() {
        int i = this.b;
        bat[] batVarArr = this.a;
        bat batVar = batVarArr[i];
        if (batVar.c < batVar.b) {
            return;
        }
        while (-1 < i) {
            int b = b(i);
            if (b == -1) {
                bat batVar2 = batVarArr[i];
                int i2 = batVar2.c;
                Object[] objArr = batVar2.a;
                if (i2 < objArr.length) {
                    int length = objArr.length;
                    batVar2.c = i2 + 1;
                    b = b(i);
                }
            }
            if (b != -1) {
                this.b = b;
                return;
            }
            if (i > 0) {
                bat batVar3 = batVarArr[i - 1];
                int i3 = batVar3.c;
                int length2 = batVar3.a.length;
                batVar3.c = i3 + 1;
            }
            batVarArr[i].a(0, 0, aat.e.d);
            i--;
        }
        this.c = false;
    }

    public final int b(int i) {
        bat[] batVarArr = this.a;
        bat batVar = batVarArr[i];
        int i2 = batVar.c;
        if (i2 < batVar.b) {
            return i;
        }
        Object[] objArr = batVar.a;
        if (i2 >= objArr.length) {
            return -1;
        }
        int length = objArr.length;
        Object obj = objArr[i2];
        obj.getClass();
        aat aatVar = (aat) obj;
        if (i == 6) {
            bat batVar2 = batVarArr[i + 1];
            Object[] objArr2 = aatVar.d;
            batVar2.a(objArr2.length, 0, objArr2);
        } else {
            batVarArr[i + 1].a(Integer.bitCount(aatVar.a) * 2, 0, aatVar.d);
        }
        return b(i + 1);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (!this.c) {
            wvs.n();
            return null;
        }
        Object next = this.a[this.b].next();
        a();
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
