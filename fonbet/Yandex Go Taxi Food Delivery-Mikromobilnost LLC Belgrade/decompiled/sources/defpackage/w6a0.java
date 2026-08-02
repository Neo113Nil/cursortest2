package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lw6a0;", "", "Companion", "u6a0", "v6a0", "eatskit"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class w6a0 {
    public static final v6a0 Companion = new v6a0();
    public static final i3y[] e = {null, null, null, a.b(LazyThreadSafetyMode.PUBLICATION, new nk90(29))};
    public final double a;
    public final double b;
    public final q65 c;
    public final List d;

    public /* synthetic */ w6a0(int i, double d, double d2, q65 q65Var, List list) {
        if ((i & 1) == 0) {
            this.a = 0.0d;
        } else {
            this.a = d;
        }
        if ((i & 2) == 0) {
            this.b = 0.0d;
        } else {
            this.b = d2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = q65Var;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = list;
        }
    }

    public w6a0() {
        this.a = 0.0d;
        this.b = 0.0d;
        this.c = null;
        this.d = null;
    }
}
