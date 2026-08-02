package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lso90;", "Lxn11;", "Companion", "ro90", "qo90", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class so90 implements xn11 {
    public static final ro90 Companion = new ro90();
    public static final i3y[] d = {null, a.b(LazyThreadSafetyMode.PUBLICATION, new kz60(28))};
    public static final so90 e = new so90(0);
    public final Boolean b;
    public final List c;

    public /* synthetic */ so90(int i, Boolean bool, List list) {
        this.b = (i & 1) == 0 ? null : bool;
        if ((i & 2) == 0) {
            this.c = EmptyList.a;
        } else {
            this.c = list;
        }
    }

    public so90(int i) {
        this.b = null;
        this.c = EmptyList.a;
    }

    public so90() {
        this(0);
    }
}
