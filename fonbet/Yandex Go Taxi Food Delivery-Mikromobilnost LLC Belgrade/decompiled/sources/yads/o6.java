package yads;

import defpackage.abb1;
import defpackage.kdx;
import defpackage.qcx;
import defpackage.tls;
import defpackage.vz61;
import defpackage.zy11;
import java.util.Map;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes7.dex */
public final class o6 extends Lambda implements tls {
    public final /* synthetic */ Map.Entry b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o6(Map.Entry entry) {
        super(1);
        this.b = entry;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        kdx kdxVar = (kdx) obj;
        kdxVar.b("usagePercent", qcx.b(Integer.valueOf(((vz61) this.b.getValue()).a)));
        abb1.c(kdxVar, "isDisabled", Boolean.valueOf(((vz61) this.b.getValue()).b));
        return zy11.a;
    }
}
