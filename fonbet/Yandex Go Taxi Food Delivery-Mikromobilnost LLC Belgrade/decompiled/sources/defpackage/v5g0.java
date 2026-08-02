package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lv5g0;", "", "Companion", "t5g0", "u5g0", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class v5g0 {
    public static final u5g0 Companion = new u5g0();
    public static final i3y[] d = {a.b(LazyThreadSafetyMode.PUBLICATION, new pmf0(28)), null, null};
    public final List a;
    public final Integer b;
    public final Integer c;

    public /* synthetic */ v5g0(int i, List list, Integer num, Integer num2) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = list;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num2;
        }
    }

    public v5g0() {
        this.a = null;
        this.b = null;
        this.c = null;
    }
}
