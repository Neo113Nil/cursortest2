package defpackage;

import com.yandex.go.mainscreen.superapp.impl.currentaddress.a;

/* loaded from: classes12.dex */
public final /* synthetic */ class uef implements ax4, jms {
    public final /* synthetic */ a a;

    public uef(a aVar) {
        this.a = aVar;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof ax4) && (obj instanceof jms)) {
            return jl40.l(getFunctionDelegate(), ((jms) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // defpackage.jms
    public final cms getFunctionDelegate() {
        return this.a;
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // defpackage.ax4
    public final /* synthetic */ void t(pv0 pv0Var) {
        this.a.invoke(pv0Var);
    }
}
