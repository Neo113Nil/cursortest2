package defpackage;

import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class slm extends kpj {
    public mm6 b;
    public Function2 c;
    public fmq d;
    public boolean e;

    @Override // defpackage.kpj
    public final void handleOnBackCancelled() {
        super.handleOnBackCancelled();
        fmq fmqVar = this.d;
        if (fmqVar != null) {
            fmqVar.v();
        }
        fmq fmqVar2 = this.d;
        if (fmqVar2 != null) {
            fmqVar2.b = false;
        }
        this.e = false;
    }

    @Override // defpackage.kpj
    public final void handleOnBackPressed() {
        fmq fmqVar = this.d;
        if (fmqVar != null && !fmqVar.b) {
            fmqVar.v();
            this.d = null;
        }
        if (this.d == null) {
            this.d = new fmq(this.b, false, this.c, this);
        }
        fmq fmqVar2 = this.d;
        if (fmqVar2 != null) {
            ((zi3) fmqVar2.c).n(null);
        }
        fmq fmqVar3 = this.d;
        if (fmqVar3 != null) {
            fmqVar3.b = false;
        }
        this.e = false;
    }

    @Override // defpackage.kpj
    public final void handleOnBackProgressed(ri2 ri2Var) {
        super.handleOnBackProgressed(ri2Var);
        fmq fmqVar = this.d;
        if (fmqVar != null) {
            ((zi3) fmqVar.c).c(ri2Var);
        }
    }

    @Override // defpackage.kpj
    public final void handleOnBackStarted(ri2 ri2Var) {
        super.handleOnBackStarted(ri2Var);
        fmq fmqVar = this.d;
        if (fmqVar != null) {
            fmqVar.v();
        }
        if (isEnabled()) {
            this.d = new fmq(this.b, true, this.c, this);
        }
        this.e = true;
    }
}
