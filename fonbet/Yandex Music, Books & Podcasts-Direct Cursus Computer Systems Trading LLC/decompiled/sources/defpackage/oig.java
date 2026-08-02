package defpackage;

import java.lang.ref.ReferenceQueue;

/* loaded from: classes3.dex */
public final class oig extends qig {
    public final /* synthetic */ int d;
    public volatile long e;
    public crn f;
    public crn g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oig(ReferenceQueue referenceQueue, Object obj, int i, crn crnVar, int i2) {
        super(referenceQueue, obj, i, crnVar);
        this.d = i2;
    }

    @Override // defpackage.qig, defpackage.crn
    public crn a() {
        switch (this.d) {
            case 0:
                return this.g;
            default:
                return super.a();
        }
    }

    @Override // defpackage.qig, defpackage.crn
    public void c(crn crnVar) {
        switch (this.d) {
            case 1:
                this.g = crnVar;
                break;
            default:
                super.c(crnVar);
                break;
        }
    }

    @Override // defpackage.qig, defpackage.crn
    public void d(crn crnVar) {
        switch (this.d) {
            case 1:
                this.f = crnVar;
                break;
            default:
                super.d(crnVar);
                break;
        }
    }

    @Override // defpackage.qig, defpackage.crn
    public void e(crn crnVar) {
        switch (this.d) {
            case 0:
                this.g = crnVar;
                break;
            default:
                super.e(crnVar);
                break;
        }
    }

    @Override // defpackage.qig, defpackage.crn
    public crn f() {
        switch (this.d) {
            case 1:
                return this.f;
            default:
                return super.f();
        }
    }

    @Override // defpackage.qig, defpackage.crn
    public crn h() {
        switch (this.d) {
            case 0:
                return this.f;
            default:
                return super.h();
        }
    }

    @Override // defpackage.qig, defpackage.crn
    public void i(crn crnVar) {
        switch (this.d) {
            case 0:
                this.f = crnVar;
                break;
            default:
                super.i(crnVar);
                break;
        }
    }

    @Override // defpackage.qig, defpackage.crn
    public crn k() {
        switch (this.d) {
            case 1:
                return this.g;
            default:
                return super.k();
        }
    }

    @Override // defpackage.qig, defpackage.crn
    public long n() {
        switch (this.d) {
            case 1:
                return this.e;
            default:
                return super.n();
        }
    }

    @Override // defpackage.qig, defpackage.crn
    public void o(long j) {
        switch (this.d) {
            case 0:
                this.e = j;
                break;
            default:
                super.o(j);
                break;
        }
    }

    @Override // defpackage.qig, defpackage.crn
    public long p() {
        switch (this.d) {
            case 0:
                return this.e;
            default:
                return super.p();
        }
    }

    @Override // defpackage.qig, defpackage.crn
    public void q(long j) {
        switch (this.d) {
            case 1:
                this.e = j;
                break;
            default:
                super.q(j);
                break;
        }
    }
}
