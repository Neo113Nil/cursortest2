package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes9.dex */
public final class tc4 implements KSerializer {
    public static final tc4 a = new tc4();
    public static final s43 b = new s43(e6m.b, 1);

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        s43 s43Var = b;
        sjd b2 = decoder.b(s43Var);
        double d = Double.NaN;
        double d2 = Double.NaN;
        double d3 = Double.NaN;
        double d4 = Double.NaN;
        while (true) {
            int v = b2.v(s43Var);
            if (v == -1) {
                if (Double.isNaN(d3) || Double.isNaN(d2) || Double.isNaN(d) || Double.isNaN(d4)) {
                    ny61.g("Failed requirement.");
                    return null;
                }
                uc4 uc4Var = new uc4(new zzs(d2, d3, 0, null, null, 28), new zzs(d4, d, 0, null, null, 28));
                b2.c(s43Var);
                return uc4Var;
            }
            if (v == 0) {
                d3 = b2.E(s43Var, v);
            } else if (v == 1) {
                d2 = b2.E(s43Var, v);
            } else if (v == 2) {
                d = b2.E(s43Var, v);
            } else {
                if (v != 3) {
                    yci0.m("Receive to much elements for BBox decoding");
                    return null;
                }
                d4 = b2.E(s43Var, v);
            }
        }
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        uc4 uc4Var = (uc4) obj;
        s43 s43Var = b;
        yjd r = encoder.r(s43Var);
        r.E(s43Var, 0, uc4Var.a.b);
        r.E(s43Var, 1, uc4Var.a.a);
        zzs zzsVar = uc4Var.b;
        r.E(s43Var, 2, zzsVar.b);
        r.E(s43Var, 3, zzsVar.a);
        r.c(s43Var);
    }
}
