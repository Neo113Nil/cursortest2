package defpackage;

import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lzan0;", "Llwj0;", "Companion", "xan0", "yan0", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class zan0 extends lwj0 {
    public static final yan0 Companion = new yan0();
    public final xa7 a;

    public /* synthetic */ zan0(int i, xa7 xa7Var) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = xa7Var;
        }
    }

    @Override // defpackage.lwj0
    /* renamed from: e */
    public final zn11 getY() {
        xa7 xa7Var = this.a;
        if (xa7Var != null) {
            return xa7Var.c;
        }
        return null;
    }

    public zan0() {
        this.a = null;
    }
}
