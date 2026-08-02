package defpackage;

import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lw210;", "", "Companion", "u210", "v210", "old"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class w210 {
    public static final v210 Companion = new v210();
    public final gl50 a;

    public /* synthetic */ w210(int i, gl50 gl50Var) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = gl50Var;
        }
    }

    public static final /* synthetic */ void a(w210 w210Var, yjd yjdVar, SerialDescriptor serialDescriptor) {
        if (!yjdVar.F() && w210Var.a == null) {
            return;
        }
        yjdVar.g(serialDescriptor, 0, el50.a, w210Var.a);
    }

    public w210() {
        this.a = null;
    }
}
