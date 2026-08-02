package defpackage;

import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes6.dex */
public final /* synthetic */ class tij0 implements jms {
    public final /* synthetic */ int a;
    public final /* synthetic */ boj0 b;

    public /* synthetic */ tij0(boj0 boj0Var, int i) {
        this.a = i;
        this.b = boj0Var;
    }

    public final void a(kij0 kij0Var) {
        int i = this.a;
        boj0 boj0Var = this.b;
        switch (i) {
            case 0:
                boj0Var.l(kij0Var);
                break;
            default:
                boj0Var.l(kij0Var);
                break;
        }
    }

    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if ((obj instanceof tij0) && (obj instanceof jms)) {
                    break;
                }
                break;
            default:
                if ((obj instanceof tij0) && (obj instanceof jms)) {
                    break;
                }
                break;
        }
        return jl40.l(getFunctionDelegate(), ((jms) obj).getFunctionDelegate());
    }

    @Override // defpackage.jms
    public final cms getFunctionDelegate() {
        switch (this.a) {
        }
        return new FunctionReferenceImpl(1, this.b, boj0.class, "onRequirementTrailClicked", "onRequirementTrailClicked(Lru/yandex/taxi/summary/requirements/list/recycler/RequirementItem;)V", 0);
    }

    public final int hashCode() {
        switch (this.a) {
        }
        return getFunctionDelegate().hashCode();
    }
}
