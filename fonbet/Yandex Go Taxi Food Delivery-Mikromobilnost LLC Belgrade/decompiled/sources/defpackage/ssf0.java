package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lssf0;", "", "Companion", "qsf0", "rsf0", "core"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ssf0 {
    public static final rsf0 Companion = new rsf0();
    public static final i3y[] n;
    public final String a;
    public final String b;
    public final int c;
    public final List d;
    public final List e;
    public final jsq0 f;
    public final List g;
    public final String h;
    public final String i;
    public final iuc j;
    public final Integer k;
    public final String l;
    public final List m;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        n = new i3y[]{null, null, null, a.b(lazyThreadSafetyMode, new pmf0(7)), a.b(lazyThreadSafetyMode, new pmf0(8)), a.b(lazyThreadSafetyMode, new pmf0(9)), a.b(lazyThreadSafetyMode, new pmf0(10)), null, null, null, null, null, a.b(lazyThreadSafetyMode, new pmf0(11))};
    }

    public /* synthetic */ ssf0(int i, String str, String str2, int i2, List list, List list2, jsq0 jsq0Var, List list3, String str3, String str4, iuc iucVar, Integer num, String str5, List list4) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = 0;
        } else {
            this.c = i2;
        }
        if ((i & 8) == 0) {
            this.d = scc.g("fullscreen_banners", kju0.b, "notifications", "missed_seen");
        } else {
            this.d = list;
        }
        int i3 = i & 16;
        EmptyList emptyList = EmptyList.a;
        if (i3 == 0) {
            this.e = emptyList;
        } else {
            this.e = list2;
        }
        if ((i & 32) == 0) {
            this.f = ksq0.a;
        } else {
            this.f = jsq0Var;
        }
        if ((i & 64) == 0) {
            this.g = emptyList;
        } else {
            this.g = list3;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = str3;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = str4;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = iucVar;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = num;
        }
        if ((i & 2048) == 0) {
            this.l = null;
        } else {
            this.l = str5;
        }
        if ((i & 4096) == 0) {
            this.m = null;
        } else {
            this.m = list4;
        }
    }

    public ssf0() {
        this(null, null, 0, null, null, null, null, null, null, null, null, null, 8191);
    }

    public ssf0(String str, String str2, int i, List list, jsq0 jsq0Var, List list2, String str3, String str4, iuc iucVar, Integer num, String str5, List list3, int i2) {
        str = (i2 & 1) != 0 ? null : str;
        String str6 = (i2 & 2) != 0 ? null : str2;
        int i3 = (i2 & 4) != 0 ? 0 : i;
        List g = scc.g("fullscreen_banners", kju0.b, "notifications", "missed_seen");
        int i4 = i2 & 16;
        List list4 = EmptyList.a;
        List list5 = i4 != 0 ? list4 : list;
        jsq0 jsq0Var2 = (i2 & 32) != 0 ? ksq0.a : jsq0Var;
        list4 = (i2 & 64) == 0 ? list2 : list4;
        String str7 = (i2 & 128) != 0 ? null : str3;
        String str8 = (i2 & 256) != 0 ? null : str4;
        iuc iucVar2 = (i2 & 512) != 0 ? null : iucVar;
        Integer num2 = (i2 & 1024) != 0 ? null : num;
        String str9 = (i2 & 2048) != 0 ? null : str5;
        List list6 = (i2 & 4096) == 0 ? list3 : null;
        this.a = str;
        this.b = str6;
        this.c = i3;
        this.d = g;
        this.e = list5;
        this.f = jsq0Var2;
        this.g = list4;
        this.h = str7;
        this.i = str8;
        this.j = iucVar2;
        this.k = num2;
        this.l = str9;
        this.m = list6;
    }
}
