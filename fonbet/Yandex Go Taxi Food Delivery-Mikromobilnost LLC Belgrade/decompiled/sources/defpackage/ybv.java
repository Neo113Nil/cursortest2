package defpackage;

import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes11.dex */
public final /* synthetic */ class ybv implements hbv, jms {
    public final /* synthetic */ int a;
    public final /* synthetic */ g1k b;

    public /* synthetic */ ybv(g1k g1kVar, int i) {
        this.a = i;
        this.b = g1kVar;
    }

    @Override // defpackage.hbv
    public final void dispose() {
        switch (this.a) {
            case 0:
                this.b.dispose();
                break;
            default:
                this.b.dispose();
                break;
        }
    }

    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if ((obj instanceof hbv) && (obj instanceof jms)) {
                    break;
                }
                break;
            default:
                if ((obj instanceof hbv) && (obj instanceof jms)) {
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
        return new FunctionReferenceImpl(0, this.b, g1k.class, "dispose", "dispose()V", 0);
    }

    public final int hashCode() {
        switch (this.a) {
        }
        return getFunctionDelegate().hashCode();
    }
}
