package defpackage;

import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.collections.EmptyList;
import kotlin.collections.b;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lufv0;", "Ln96;", "Lc6z;", "Companion", "tfv0", "sfv0", "mainscreen"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ufv0 extends n96 implements c6z {
    public static final tfv0 Companion = new tfv0();
    public static final i3y[] i;
    public static final ufv0 j;
    public final boolean b;
    public final Map c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final List h;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        i = new i3y[]{null, a.b(lazyThreadSafetyMode, new c3u0(25)), null, null, null, null, a.b(lazyThreadSafetyMode, new c3u0(26))};
        j = new ufv0(0);
    }

    public /* synthetic */ ufv0(int i2, String str, String str2, String str3, String str4, List list, Map map, boolean z) {
        this.b = (i2 & 1) == 0 ? false : z;
        this.c = (i2 & 2) == 0 ? b.f() : map;
        if ((i2 & 4) == 0) {
            this.d = "";
        } else {
            this.d = str;
        }
        if ((i2 & 8) == 0) {
            this.e = "";
        } else {
            this.e = str2;
        }
        if ((i2 & 16) == 0) {
            this.f = "";
        } else {
            this.f = str3;
        }
        if ((i2 & 32) == 0) {
            this.g = "";
        } else {
            this.g = str4;
        }
        if ((i2 & 64) == 0) {
            this.h = EmptyList.a;
        } else {
            this.h = list;
        }
    }

    @Override // defpackage.n96
    /* renamed from: a, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    @Override // defpackage.c6z
    /* renamed from: f, reason: from getter */
    public final Map getC() {
        return this.c;
    }

    public ufv0() {
        this(0);
    }

    public ufv0(int i2) {
        Map f = b.f();
        this.b = false;
        this.c = f;
        this.d = "";
        this.e = "";
        this.f = "";
        this.g = "";
        this.h = EmptyList.a;
    }
}
