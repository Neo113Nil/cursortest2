package defpackage;

/* loaded from: classes3.dex */
public final class jig extends lig {
    public final /* synthetic */ int e;
    public volatile long f;
    public crn g;
    public crn h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jig(Object obj, int i, crn crnVar, int i2) {
        super(obj, i, crnVar);
        this.e = i2;
    }

    @Override // defpackage.shg, defpackage.crn
    public crn a() {
        switch (this.e) {
            case 0:
                return this.h;
            default:
                return super.a();
        }
    }

    @Override // defpackage.shg, defpackage.crn
    public void c(crn crnVar) {
        switch (this.e) {
            case 1:
                this.h = crnVar;
                break;
            default:
                super.c(crnVar);
                break;
        }
    }

    @Override // defpackage.shg, defpackage.crn
    public void d(crn crnVar) {
        switch (this.e) {
            case 1:
                this.g = crnVar;
                break;
            default:
                super.d(crnVar);
                break;
        }
    }

    @Override // defpackage.shg, defpackage.crn
    public void e(crn crnVar) {
        switch (this.e) {
            case 0:
                this.h = crnVar;
                break;
            default:
                super.e(crnVar);
                break;
        }
    }

    @Override // defpackage.shg, defpackage.crn
    public crn f() {
        switch (this.e) {
            case 1:
                return this.g;
            default:
                return super.f();
        }
    }

    @Override // defpackage.shg, defpackage.crn
    public crn h() {
        switch (this.e) {
            case 0:
                return this.g;
            default:
                return super.h();
        }
    }

    @Override // defpackage.shg, defpackage.crn
    public void i(crn crnVar) {
        switch (this.e) {
            case 0:
                this.g = crnVar;
                break;
            default:
                super.i(crnVar);
                break;
        }
    }

    @Override // defpackage.shg, defpackage.crn
    public crn k() {
        switch (this.e) {
            case 1:
                return this.h;
            default:
                return super.k();
        }
    }

    @Override // defpackage.shg, defpackage.crn
    public long n() {
        switch (this.e) {
            case 1:
                return this.f;
            default:
                return super.n();
        }
    }

    @Override // defpackage.shg, defpackage.crn
    public void o(long j) {
        switch (this.e) {
            case 0:
                this.f = j;
                break;
            default:
                super.o(j);
                break;
        }
    }

    @Override // defpackage.shg, defpackage.crn
    public long p() {
        switch (this.e) {
            case 0:
                return this.f;
            default:
                return super.p();
        }
    }

    @Override // defpackage.shg, defpackage.crn
    public void q(long j) {
        switch (this.e) {
            case 1:
                this.f = j;
                break;
            default:
                super.q(j);
                break;
        }
    }
}
