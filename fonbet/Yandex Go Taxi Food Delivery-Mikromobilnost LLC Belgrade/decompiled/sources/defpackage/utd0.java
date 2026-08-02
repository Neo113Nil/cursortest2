package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lutd0;", "", "Companion", "ttd0", "std0", "go-client-android.features:common_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class utd0 {
    public static final ttd0 Companion = new ttd0();
    public static final i3y[] c = {null, a.b(LazyThreadSafetyMode.PUBLICATION, new mlc0(18))};
    public static final utd0 d = new utd0(0);
    public final int a;
    public final List b;

    public /* synthetic */ utd0(int i, int i2, List list) {
        this.a = (i & 1) == 0 ? 0 : i2;
        if ((i & 2) == 0) {
            this.b = EmptyList.a;
        } else {
            this.b = list;
        }
    }

    public utd0(int i) {
        this.a = 0;
        this.b = EmptyList.a;
    }

    public utd0() {
        this(0);
    }
}
