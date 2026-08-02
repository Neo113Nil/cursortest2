package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Luk50;", "", "Companion", "sk50", "tk50", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class uk50 {
    public static final tk50 Companion = new tk50();
    public static final i3y[] f;
    public final List a;
    public final List b;
    public final List c;
    public final mcp0 d;
    public final mcp0 e;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f = new i3y[]{a.b(lazyThreadSafetyMode, new ah40(29)), a.b(lazyThreadSafetyMode, new rk50(0)), a.b(lazyThreadSafetyMode, new rk50(1)), null, null};
    }

    public /* synthetic */ uk50(int i, List list, List list2, List list3, mcp0 mcp0Var, mcp0 mcp0Var2) {
        int i2 = i & 1;
        EmptyList emptyList = EmptyList.a;
        if (i2 == 0) {
            this.a = emptyList;
        } else {
            this.a = list;
        }
        if ((i & 2) == 0) {
            this.b = emptyList;
        } else {
            this.b = list2;
        }
        if ((i & 4) == 0) {
            this.c = emptyList;
        } else {
            this.c = list3;
        }
        if ((i & 8) == 0) {
            this.d = new mcp0(0);
        } else {
            this.d = mcp0Var;
        }
        if ((i & 16) == 0) {
            this.e = new mcp0(0);
        } else {
            this.e = mcp0Var2;
        }
    }

    public uk50() {
        mcp0 mcp0Var = new mcp0(0);
        mcp0 mcp0Var2 = new mcp0(0);
        EmptyList emptyList = EmptyList.a;
        this.a = emptyList;
        this.b = emptyList;
        this.c = emptyList;
        this.d = mcp0Var;
        this.e = mcp0Var2;
    }
}
