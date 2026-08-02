package defpackage;

import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: classes9.dex */
public final /* synthetic */ class rsp0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ ssp0 b;

    public /* synthetic */ rsp0(ssp0 ssp0Var, int i) {
        this.a = i;
        this.b = ssp0Var;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        ssp0 ssp0Var = this.b;
        h0c h0cVar = (h0c) obj;
        switch (i) {
            case 0:
                h0cVar.a("type", auu0.b, (r3 & 8) == 0);
                h0cVar.a("value", d6z.h("kotlinx.serialization.Sealed<" + ssp0Var.a.d() + '>', esq0.g, new SerialDescriptor[0], new rsp0(ssp0Var, 1)), (r3 & 8) == 0);
                h0cVar.b = ssp0Var.b;
                break;
            default:
                for (Map.Entry entry : ssp0Var.e.entrySet()) {
                    h0cVar.a((String) entry.getKey(), ((KSerializer) entry.getValue()).getDescriptor(), (r3 & 8) == 0);
                }
                break;
        }
        return zy11Var;
    }
}
