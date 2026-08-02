package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.collections.EmptyList;

@jxi
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Luk00;", "Lw96;", "Companion", "tk00", "sk00", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class uk00 extends w96 {
    public static final tk00 Companion = new tk00();
    public static final i3y[] d = {null, a.b(LazyThreadSafetyMode.PUBLICATION, new t5z(14))};
    public static final uk00 e = new uk00(0);
    public final boolean b;
    public final List c;

    public /* synthetic */ uk00(int i, boolean z, List list) {
        this.b = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.c = EmptyList.a;
        } else {
            this.c = list;
        }
    }

    @Override // defpackage.w96
    /* renamed from: g, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    public uk00(int i) {
        this.b = false;
        this.c = EmptyList.a;
    }

    public uk00() {
        this(0);
    }
}
