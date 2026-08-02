package defpackage;

import java.util.Iterator;

/* loaded from: classes5.dex */
public final class c9h extends e9h implements Iterator, j9f {
    public final /* synthetic */ int e;

    public c9h(f9h f9hVar, int i) {
        this.e = i;
        f9hVar.getClass();
        this.d = f9hVar;
        this.b = -1;
        this.c = f9hVar.h;
        e();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.e) {
            case 0:
                b();
                int i = this.a;
                f9h f9hVar = (f9h) this.d;
                if (i >= f9hVar.f) {
                    wvs.n();
                    break;
                } else {
                    this.a = i + 1;
                    this.b = i;
                    d9h d9hVar = new d9h(f9hVar, i);
                    e();
                    break;
                }
            case 1:
                b();
                int i2 = this.a;
                f9h f9hVar2 = (f9h) this.d;
                if (i2 >= f9hVar2.f) {
                    wvs.n();
                    break;
                } else {
                    this.a = i2 + 1;
                    this.b = i2;
                    Object obj = f9hVar2.a[i2];
                    e();
                    break;
                }
            default:
                b();
                int i3 = this.a;
                f9h f9hVar3 = (f9h) this.d;
                if (i3 >= f9hVar3.f) {
                    wvs.n();
                    break;
                } else {
                    this.a = i3 + 1;
                    this.b = i3;
                    Object[] objArr = f9hVar3.b;
                    objArr.getClass();
                    Object obj2 = objArr[this.b];
                    e();
                    break;
                }
        }
        return null;
    }
}
