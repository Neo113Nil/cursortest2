package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lxtd0;", "Litd0;", "Companion", "wtd0", "vtd0", "go-client-android.features:common_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class xtd0 extends itd0 {
    public static final wtd0 Companion = new wtd0();
    public static final i3y[] f;
    public final dud0 a;
    public final List b;
    public final List c;
    public final List d;
    public final String e;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f = new i3y[]{null, a.b(lazyThreadSafetyMode, new bbd0(24)), a.b(lazyThreadSafetyMode, new bbd0(25)), a.b(lazyThreadSafetyMode, new bbd0(26)), null};
    }

    public xtd0(int i, dud0 dud0Var, List list, List list2, List list3, String str) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = dud0Var;
        }
        int i2 = i & 2;
        EmptyList emptyList = EmptyList.a;
        if (i2 == 0) {
            this.b = emptyList;
        } else {
            this.b = list;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = list2;
        }
        if ((i & 8) == 0) {
            this.d = emptyList;
        } else {
            this.d = list3;
        }
        if ((i & 16) == 0) {
            this.e = "";
        } else {
            this.e = str;
        }
    }

    /* renamed from: a, reason: from getter */
    public final List getD() {
        return this.d;
    }

    public xtd0() {
        this.a = null;
        EmptyList emptyList = EmptyList.a;
        this.b = emptyList;
        this.c = null;
        this.d = emptyList;
        this.e = "";
    }
}
