package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lz6j0;", "", "Companion", "x6j0", "y6j0", "eatskit"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class z6j0 {
    public static final y6j0 Companion = new y6j0();
    public static final i3y[] c = {a.b(LazyThreadSafetyMode.PUBLICATION, new lqi0(24)), null};
    public final List a;
    public final Boolean b;

    public /* synthetic */ z6j0(int i, Boolean bool, List list) {
        this.a = (i & 1) == 0 ? null : list;
        if ((i & 2) == 0) {
            this.b = Boolean.TRUE;
        } else {
            this.b = bool;
        }
    }

    public z6j0() {
        Boolean bool = Boolean.TRUE;
        this.a = null;
        this.b = bool;
    }
}
