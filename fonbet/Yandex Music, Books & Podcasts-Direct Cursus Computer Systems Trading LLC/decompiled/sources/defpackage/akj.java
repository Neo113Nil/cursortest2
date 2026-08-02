package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class akj implements Iterator {
    public final /* synthetic */ int a = 0;
    public final int b;
    public int c;
    public boolean d;
    public final /* synthetic */ Iterable e;

    public akj(ckj ckjVar) {
        this.e = ckjVar;
        ckjVar.b++;
        this.b = ckjVar.a.size();
    }

    public void a() {
        if (this.d) {
            return;
        }
        this.d = true;
        ckj ckjVar = (ckj) this.e;
        int i = ckjVar.b - 1;
        ckjVar.b = i;
        if (i <= 0 && ckjVar.d) {
            ckjVar.d = false;
            ArrayList arrayList = ckjVar.a;
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
        switch (this.a) {
            case 0:
                int i2 = this.c;
                while (true) {
                    i = this.b;
                    if (i2 < i && ((ckj) this.e).a.get(i2) == null) {
                        i2++;
                    }
                }
                if (i2 < i) {
                    return true;
                }
                a();
                return false;
            default:
                dkj dkjVar = (dkj) this.e;
                int i3 = this.c;
                while (i3 < this.b && dkjVar.a.get(i3) == null) {
                    i3++;
                }
                if (i3 < this.b) {
                    return true;
                }
                if (!this.d) {
                    this.d = true;
                    dkj.a(dkjVar);
                }
                return false;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i;
        switch (this.a) {
            case 0:
                ArrayList arrayList = ((ckj) this.e).a;
                while (true) {
                    int i2 = this.c;
                    i = this.b;
                    if (i2 < i && arrayList.get(i2) == null) {
                        this.c++;
                    }
                }
                int i3 = this.c;
                if (i3 >= i) {
                    a();
                    wvs.n();
                    break;
                } else {
                    this.c = i3 + 1;
                    break;
                }
                break;
            default:
                dkj dkjVar = (dkj) this.e;
                ArrayList arrayList2 = dkjVar.a;
                while (true) {
                    int i4 = this.c;
                    if (i4 < this.b && arrayList2.get(i4) == null) {
                        this.c++;
                    }
                }
                int i5 = this.c;
                if (i5 >= this.b) {
                    if (!this.d) {
                        this.d = true;
                        dkj.a(dkjVar);
                    }
                    wvs.n();
                    break;
                } else {
                    this.c = i5 + 1;
                    break;
                }
                break;
        }
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public akj(dkj dkjVar) {
        this.e = dkjVar;
        dkjVar.b++;
        this.b = dkjVar.a.size();
    }
}
