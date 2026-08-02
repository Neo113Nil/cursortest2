package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Ls5u0;", "", "Companion", "q5u0", "r5u0", "old"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class s5u0 {
    public static final r5u0 Companion = new r5u0();
    public static final i3y[] b = {a.b(LazyThreadSafetyMode.PUBLICATION, new fet0(19))};
    public final List a;

    public /* synthetic */ s5u0(int i, List list) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = list;
        }
    }

    public static final /* synthetic */ void b(s5u0 s5u0Var, yjd yjdVar, SerialDescriptor serialDescriptor) {
        if (!yjdVar.F() && s5u0Var.a == null) {
            return;
        }
        yjdVar.g(serialDescriptor, 0, (KSerializer) b[0].getValue(), s5u0Var.a);
    }

    public s5u0() {
        this.a = null;
    }
}
