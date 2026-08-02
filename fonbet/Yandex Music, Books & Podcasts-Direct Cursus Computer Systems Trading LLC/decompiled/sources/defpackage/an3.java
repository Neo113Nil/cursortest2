package defpackage;

import java.util.Iterator;

/* loaded from: classes3.dex */
public final class an3 implements Iterator {
    public final /* synthetic */ int a = 5;
    public int b = 0;
    public final int c;
    public final /* synthetic */ Object d;

    public an3(gbx gbxVar) {
        this.d = gbxVar;
        this.c = gbxVar.n();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                if (this.b < this.c) {
                }
                break;
            case 1:
                if (this.b < this.c) {
                }
                break;
            case 2:
                if (this.b < this.c) {
                }
                break;
            case 3:
                if (this.b < this.c) {
                }
                break;
            case 4:
                if (this.b < this.c) {
                }
                break;
            default:
                if (this.b < this.c) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.a) {
            case 0:
                int i = this.b;
                if (i >= this.c) {
                    wvs.n();
                    break;
                } else {
                    this.b = i + 1;
                    break;
                }
            case 1:
                int i2 = this.b;
                if (i2 >= this.c) {
                    wvs.n();
                    break;
                } else {
                    this.b = i2 + 1;
                    break;
                }
            case 2:
                int i3 = this.b;
                if (i3 >= this.c) {
                    wvs.n();
                    break;
                } else {
                    this.b = i3 + 1;
                    break;
                }
            case 3:
                int i4 = this.b;
                if (i4 >= this.c) {
                    wvs.n();
                    break;
                } else {
                    this.b = i4 + 1;
                    break;
                }
            case 4:
                int i5 = this.b;
                if (i5 >= this.c) {
                    wvs.n();
                    break;
                } else {
                    this.b = i5 + 1;
                    break;
                }
            default:
                int i6 = this.b;
                if (i6 >= this.c) {
                    wvs.n();
                    break;
                } else {
                    this.b = i6 + 1;
                    break;
                }
        }
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            case 2:
                throw new UnsupportedOperationException();
            case 3:
                throw new UnsupportedOperationException();
            case 4:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public an3(obx obxVar) {
        this.d = obxVar;
        this.c = obxVar.o();
    }

    public an3(cmx cmxVar) {
        this.d = cmxVar;
        this.c = cmxVar.n();
    }

    public an3(hn3 hn3Var) {
        this.d = hn3Var;
        this.c = hn3Var.size();
    }

    public an3(in3 in3Var) {
        this.d = in3Var;
        this.c = in3Var.size();
    }

    public an3(mn3 mn3Var) {
        this.d = mn3Var;
        this.c = mn3Var.size();
    }
}
