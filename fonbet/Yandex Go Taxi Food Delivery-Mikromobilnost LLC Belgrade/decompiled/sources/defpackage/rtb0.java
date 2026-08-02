package defpackage;

import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.collections.b;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lrtb0;", "Lw96;", "Lc6z;", "Companion", "qtb0", "ptb0", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class rtb0 extends w96 implements c6z {
    public static final qtb0 Companion = new qtb0();
    public static final i3y[] l = {null, a.b(LazyThreadSafetyMode.PUBLICATION, new l1b0(8)), null, null, null, null, null, null, null, null};
    public static final rtb0 m = new rtb0(0);
    public final boolean b;
    public final Map c;
    public final String d;
    public final Integer e;
    public final String f;
    public final int g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;

    public /* synthetic */ rtb0(int i, boolean z, Map map, String str, Integer num, String str2, int i2, boolean z2, boolean z3, boolean z4, boolean z5) {
        if ((i & 1) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
        if ((i & 2) == 0) {
            this.c = b.f();
        } else {
            this.c = map;
        }
        if ((i & 4) == 0) {
            this.d = "";
        } else {
            this.d = str;
        }
        if ((i & 8) == 0) {
            this.e = null;
        } else {
            this.e = num;
        }
        if ((i & 16) == 0) {
            this.f = "";
        } else {
            this.f = str2;
        }
        if ((i & 32) == 0) {
            this.g = 0;
        } else {
            this.g = i2;
        }
        if ((i & 64) == 0) {
            this.h = false;
        } else {
            this.h = z2;
        }
        if ((i & 128) == 0) {
            this.i = false;
        } else {
            this.i = z3;
        }
        if ((i & 256) == 0) {
            this.j = true;
        } else {
            this.j = z4;
        }
        if ((i & 512) == 0) {
            this.k = false;
        } else {
            this.k = z5;
        }
    }

    @Override // defpackage.c6z
    /* renamed from: f, reason: from getter */
    public final Map getC() {
        return this.c;
    }

    @Override // defpackage.w96
    /* renamed from: g, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    public rtb0() {
        this(0);
    }

    public rtb0(int i) {
        Map f = b.f();
        this.b = false;
        this.c = f;
        this.d = "";
        this.e = null;
        this.f = "";
        this.g = 0;
        this.h = false;
        this.i = false;
        this.j = true;
        this.k = false;
    }
}
