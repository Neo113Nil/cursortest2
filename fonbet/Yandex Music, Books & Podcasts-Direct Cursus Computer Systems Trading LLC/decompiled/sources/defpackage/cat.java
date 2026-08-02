package defpackage;

/* loaded from: classes.dex */
public final class cat extends bat {
    public final /* synthetic */ int d;

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.d) {
            case 0:
                int i = this.c;
                this.c = i + 2;
                Object[] objArr = this.a;
                return new k9h(0, objArr[i], objArr[i + 1]);
            case 1:
                int i2 = this.c;
                this.c = i2 + 2;
                return this.a[i2];
            default:
                int i3 = this.c;
                this.c = i3 + 2;
                return this.a[i3 + 1];
        }
    }
}
