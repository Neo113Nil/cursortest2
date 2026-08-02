package yads;

import defpackage.nl61;
import defpackage.tls;
import defpackage.wls;
import defpackage.zy11;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes7.dex */
public final class ke0 extends Lambda implements tls {
    public final /* synthetic */ wls[] b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ke0(wls[] wlsVarArr) {
        super(1);
        this.b = wlsVarArr;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        nl61 nl61Var = (nl61) obj;
        wls wlsVar = this.b[0];
        if (wlsVar != null) {
            wlsVar.invoke(nl61Var, yw0.f);
        }
        return zy11.a;
    }
}
