package defpackage;

/* loaded from: classes5.dex */
public final class sdo extends x6 {
    public int c;
    public int d;
    public final /* synthetic */ tdo e;

    public sdo(tdo tdoVar) {
        this.e = tdoVar;
        this.c = tdoVar.e;
        this.d = tdoVar.d;
    }

    @Override // defpackage.x6
    public final void a() {
        int i = this.c;
        if (i == 0) {
            this.a = 2;
            return;
        }
        tdo tdoVar = this.e;
        Object[] objArr = tdoVar.b;
        int i2 = this.d;
        this.b = objArr[i2];
        this.a = 1;
        this.d = (i2 + 1) % tdoVar.c;
        this.c = i - 1;
    }
}
