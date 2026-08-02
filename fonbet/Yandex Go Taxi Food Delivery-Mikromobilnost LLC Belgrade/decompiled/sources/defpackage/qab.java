package defpackage;

/* loaded from: classes15.dex */
public final /* synthetic */ class qab implements r3z {
    public final /* synthetic */ int a;
    public final /* synthetic */ my40 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ qab(my40 my40Var, boolean z, int i) {
        this.a = i;
        this.b = my40Var;
        this.c = z;
    }

    @Override // defpackage.r3z
    public final Object b(s3z s3zVar) {
        int i = this.a;
        boolean z = this.c;
        my40 my40Var = this.b;
        switch (i) {
            case 0:
                return s3zVar.j(my40Var, z);
            default:
                return s3zVar.o(my40Var, z);
        }
    }
}
