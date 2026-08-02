package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class bkj implements Iterator {
    public int a;
    public boolean b;
    public final /* synthetic */ dkj c;

    public bkj(dkj dkjVar) {
        this.c = dkjVar;
        dkjVar.b++;
        this.a = dkjVar.a.size() - 1;
    }

    public final void a() {
        boolean z = this.b;
        dkj dkjVar = this.c;
        if (!z) {
            this.b = true;
            dkj.a(dkjVar);
        }
        dkjVar.b++;
        this.b = false;
        this.a = dkjVar.a.size() - 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        dkj dkjVar;
        int i = this.a;
        while (true) {
            dkjVar = this.c;
            if (i < 0 || dkjVar.a.get(i) != null) {
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
        dkj.a(dkjVar);
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        dkj dkjVar = this.c;
        ArrayList arrayList = dkjVar.a;
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
            dkj.a(dkjVar);
        }
        wvs.n();
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
