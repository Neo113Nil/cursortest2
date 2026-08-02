package defpackage;

import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lyxq0;", "", "Companion", "wxq0", "xxq0", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class yxq0 {
    public static final xxq0 Companion = new xxq0();
    public final a1r0 a;
    public final ief b;

    public /* synthetic */ yxq0(int i, a1r0 a1r0Var, ief iefVar) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = a1r0Var;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = iefVar;
        }
    }

    public static final /* synthetic */ void c(yxq0 yxq0Var, yjd yjdVar, SerialDescriptor serialDescriptor) {
        if (yjdVar.F() || yxq0Var.a != null) {
            yjdVar.g(serialDescriptor, 0, y0r0.a, yxq0Var.a);
        }
        if (!yjdVar.F() && yxq0Var.b == null) {
            return;
        }
        yjdVar.g(serialDescriptor, 1, gef.a, yxq0Var.b);
    }

    /* renamed from: a, reason: from getter */
    public final ief getB() {
        return this.b;
    }

    /* renamed from: b, reason: from getter */
    public final a1r0 getA() {
        return this.a;
    }

    public yxq0() {
        this.a = null;
        this.b = null;
    }
}
