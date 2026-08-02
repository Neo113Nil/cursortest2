package defpackage;

import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.collections.b;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Ltgj0;", "", "Companion", "rgj0", "sgj0", "go-client-android.features.requirements:models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class tgj0 {
    public static final sgj0 Companion = new sgj0();
    public static final i3y[] c;
    public final Map a;
    public final Map b;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        c = new i3y[]{a.b(lazyThreadSafetyMode, new vci0(20)), a.b(lazyThreadSafetyMode, new vci0(21))};
    }

    public /* synthetic */ tgj0(int i, Map map, Map map2) {
        this.a = (i & 1) == 0 ? b.f() : map;
        if ((i & 2) == 0) {
            this.b = b.f();
        } else {
            this.b = map2;
        }
    }

    public tgj0() {
        this(0);
    }

    public tgj0(int i) {
        Map f = b.f();
        Map f2 = b.f();
        this.a = f;
        this.b = f2;
    }
}
