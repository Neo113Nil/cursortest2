package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Luvy0;", "Lvn11;", "Companion", "rvy0", "a", "qvy0", "taxi_design"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class uvy0 implements vn11 {
    public static final rvy0 Companion = new rvy0();
    public static final i3y[] g;
    public static final uvy0 h;
    public final boolean b;
    public final List c;
    public final List d;
    public final List e;
    public final List f;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        g = new i3y[]{null, kotlin.a.b(lazyThreadSafetyMode, new gjx0(24)), kotlin.a.b(lazyThreadSafetyMode, new gjx0(25)), kotlin.a.b(lazyThreadSafetyMode, new gjx0(26)), kotlin.a.b(lazyThreadSafetyMode, new gjx0(27))};
        h = new uvy0(0);
    }

    public /* synthetic */ uvy0(int i, boolean z, List list, List list2, List list3, List list4) {
        this.b = (i & 1) == 0 ? false : z;
        int i2 = i & 2;
        EmptyList emptyList = EmptyList.a;
        if (i2 == 0) {
            this.c = emptyList;
        } else {
            this.c = list;
        }
        if ((i & 4) == 0) {
            this.d = emptyList;
        } else {
            this.d = list2;
        }
        if ((i & 8) == 0) {
            this.e = emptyList;
        } else {
            this.e = list3;
        }
        if ((i & 16) == 0) {
            this.f = emptyList;
        } else {
            this.f = list4;
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Luvy0$a;", "", "Companion", "svy0", "tvy0", "taxi_design"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class a {
        public static final tvy0 Companion = new tvy0();
        public static final i3y[] c = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new gjx0(28)), null};
        public final List a;
        public final String b;

        public /* synthetic */ a(int i, List list, String str) {
            this.a = (i & 1) == 0 ? EmptyList.a : list;
            if ((i & 2) == 0) {
                this.b = "";
            } else {
                this.b = str;
            }
        }

        public a() {
            this.a = EmptyList.a;
            this.b = "";
        }
    }

    public uvy0(int i) {
        this.b = false;
        EmptyList emptyList = EmptyList.a;
        this.c = emptyList;
        this.d = emptyList;
        this.e = emptyList;
        this.f = emptyList;
    }

    public uvy0() {
        this(0);
    }
}
