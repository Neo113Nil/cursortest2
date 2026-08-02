package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lygx;", "Lvn11;", "Companion", "a", "vgx", "ugx", "order"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ygx implements vn11 {
    public static final vgx Companion = new vgx();
    public static final i3y[] f;
    public static final ygx g;
    public final List b;
    public final List c;
    public final List d;
    public final String e;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f = new i3y[]{kotlin.a.b(lazyThreadSafetyMode, new aww(9)), kotlin.a.b(lazyThreadSafetyMode, new aww(10)), kotlin.a.b(lazyThreadSafetyMode, new aww(11)), null};
        g = new ygx(0);
    }

    public /* synthetic */ ygx(int i, String str, List list, List list2, List list3) {
        int i2 = i & 1;
        EmptyList emptyList = EmptyList.a;
        if (i2 == 0) {
            this.b = emptyList;
        } else {
            this.b = list;
        }
        if ((i & 2) == 0) {
            this.c = emptyList;
        } else {
            this.c = list2;
        }
        if ((i & 4) == 0) {
            this.d = emptyList;
        } else {
            this.d = list3;
        }
        if ((i & 8) == 0) {
            this.e = "";
        } else {
            this.e = str;
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lygx$a;", "", "Companion", "wgx", "xgx", "order"}, k = 1, mv = {2, 4, 0}, xi = 48)
    /* loaded from: classes12.dex */
    public static final class a {
        public static final xgx Companion = new xgx();
        public static final i3y[] d = {null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new ojw(28))};
        public final int a;
        public final int b;
        public final List c;

        public /* synthetic */ a(int i, int i2, int i3, List list) {
            if ((i & 1) == 0) {
                this.a = 0;
            } else {
                this.a = i2;
            }
            if ((i & 2) == 0) {
                this.b = 0;
            } else {
                this.b = i3;
            }
            if ((i & 4) == 0) {
                this.c = EmptyList.a;
            } else {
                this.c = list;
            }
        }

        public static final /* synthetic */ void c(a aVar, yjd yjdVar, SerialDescriptor serialDescriptor) {
            if (yjdVar.F() || aVar.a != 0) {
                yjdVar.A(0, aVar.a, serialDescriptor);
            }
            if (yjdVar.F() || aVar.b != 0) {
                yjdVar.A(1, aVar.b, serialDescriptor);
            }
            if (!yjdVar.F() && jl40.l(aVar.c, EmptyList.a)) {
                return;
            }
            yjdVar.e(serialDescriptor, 2, (KSerializer) d[2].getValue(), aVar.c);
        }

        public final boolean b(int i, String str) {
            List list = this.c;
            return i <= this.b && this.a <= i && (list.isEmpty() || list.contains(str));
        }

        public a() {
            this.a = 0;
            this.b = 0;
            this.c = EmptyList.a;
        }
    }

    public ygx(int i) {
        EmptyList emptyList = EmptyList.a;
        this.b = emptyList;
        this.c = emptyList;
        this.d = emptyList;
        this.e = "";
    }

    public ygx() {
        this(0);
    }
}
