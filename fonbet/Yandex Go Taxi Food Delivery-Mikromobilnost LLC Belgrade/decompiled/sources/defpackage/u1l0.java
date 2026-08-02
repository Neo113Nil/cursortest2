package defpackage;

import com.yandex.go.address.models.PlainAddress;
import com.yandex.go.preorder.deeplinks.route.RouteData$Continuation;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptyList;

/* loaded from: classes13.dex */
public final class u1l0 {
    public final dd61 a;
    public final pv0 b;
    public final List c;
    public final List d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final boolean l;
    public final boolean m;
    public final RouteData$Continuation n;
    public final lsw o;
    public final String p;
    public final qq80 q;
    public final Set r;
    public final boolean s;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public u1l0(dd61 dd61Var, PlainAddress plainAddress) {
        this(dd61Var, r3, r4, r4, null, null, null, null, null, null, null, false, false, null, null, null, qq80.b, null, false);
        pv0 pv0Var = plainAddress != null ? new pv0(plainAddress, null, null, null, null, null, null, null, 1022) : null;
        EmptyList emptyList = EmptyList.a;
    }

    public u1l0(dd61 dd61Var, pv0 pv0Var, List list, List list2, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, boolean z2, RouteData$Continuation routeData$Continuation, lsw lswVar, String str8, qq80 qq80Var, Set set, boolean z3) {
        this.a = dd61Var;
        this.b = pv0Var;
        this.c = list;
        this.d = list2;
        this.e = str;
        this.f = str2;
        this.g = str3;
        this.h = str4;
        this.i = str5;
        this.j = str6;
        this.k = str7;
        this.l = z;
        this.m = z2;
        this.n = routeData$Continuation;
        this.o = lswVar;
        this.p = str8;
        this.q = qq80Var;
        this.r = set;
        this.s = z3;
    }
}
