package defpackage;

/* loaded from: classes8.dex */
public final class x8o implements qgz {
    public final /* synthetic */ int a;
    public final qgz b;
    public final Object c;

    public /* synthetic */ x8o(qgz qgzVar, Object obj, int i) {
        this.a = i;
        this.b = qgzVar;
        this.c = obj;
    }

    @Override // defpackage.qgz
    public final void a(String str, String str2, Throwable th) {
        int i = this.a;
        qgz qgzVar = this.b;
        switch (i) {
            case 0:
                ((xa20) this.c).e(new ple(str2, th.toString()));
                qgzVar.a(str, str2, th);
                break;
            default:
                ((x8o) qgzVar).a(d(str), str2, th);
                break;
        }
    }

    @Override // defpackage.qgz
    public final void b(String str, String str2) {
        int i = this.a;
        qgz qgzVar = this.b;
        switch (i) {
            case 0:
                qgzVar.b(str, str2);
                break;
            default:
                ((x8o) qgzVar).b(d(str), str2);
                break;
        }
    }

    @Override // defpackage.qgz
    public final void c(String str, String str2) {
        int i = this.a;
        qgz qgzVar = this.b;
        switch (i) {
            case 0:
                qgzVar.c(str, str2);
                break;
            default:
                ((x8o) qgzVar).c(d(str), str2);
                break;
        }
    }

    public String d(String str) {
        return g8e.p((String) this.c, "-", str);
    }

    @Override // defpackage.qgz
    public final void e(String str, String str2) {
        int i = this.a;
        qgz qgzVar = this.b;
        switch (i) {
            case 0:
                qgzVar.e(str, str2);
                break;
            default:
                ((x8o) qgzVar).e(d(str), str2);
                break;
        }
    }

    @Override // defpackage.qgz
    public final void f(String str, String str2) {
        int i = this.a;
        qgz qgzVar = this.b;
        switch (i) {
            case 0:
                ((xa20) this.c).e(new ple(str2, "null"));
                qgzVar.f(str, str2);
                break;
            default:
                ((x8o) qgzVar).f(d(str), str2);
                break;
        }
    }

    @Override // defpackage.qgz
    public final void info(String str, String str2) {
        int i = this.a;
        qgz qgzVar = this.b;
        switch (i) {
            case 0:
                qgzVar.info(str, str2);
                break;
            default:
                ((x8o) qgzVar).info(d(str), str2);
                break;
        }
    }
}
