package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lwnn0;", "Lw96;", "Companion", "a", "tnn0", "snn0", "ontheway"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class wnn0 extends w96 {
    public static final tnn0 Companion = new tnn0();
    public static final i3y[] d = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new jrl0(16))};
    public static final wnn0 e = new wnn0(0);
    public final boolean b;
    public final List c;

    public /* synthetic */ wnn0(int i, boolean z, List list) {
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

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lwnn0$a;", "", "Companion", "unn0", "vnn0", "ontheway"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class a {
        public static final vnn0 Companion = new vnn0();
        public static final i3y[] c = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new jrl0(17))};
        public final String a;
        public final List b;

        public /* synthetic */ a(int i, String str, List list) {
            this.a = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.b = EmptyList.a;
            } else {
                this.b = list;
            }
        }

        public a() {
            this.a = "";
            this.b = EmptyList.a;
        }
    }

    public wnn0(int i) {
        this.b = false;
        this.c = EmptyList.a;
    }

    public wnn0() {
        this(0);
    }
}
