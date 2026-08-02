package defpackage;

import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.collections.EmptyList;
import kotlin.collections.b;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lusr0;", "Ln96;", "Lc6z;", "Companion", "tsr0", "ssr0", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class usr0 extends n96 implements c6z {
    public static final tsr0 Companion = new tsr0();
    public static final i3y[] h;
    public static final usr0 i;
    public final boolean b;
    public final Map c;
    public final Integer d;
    public final String e;
    public final String f;
    public final List g;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        h = new i3y[]{null, a.b(lazyThreadSafetyMode, new mkr0(23)), null, null, null, a.b(lazyThreadSafetyMode, new mkr0(24))};
        i = new usr0(0);
    }

    public /* synthetic */ usr0(int i2, boolean z, Map map, Integer num, String str, String str2, List list) {
        this.b = (i2 & 1) == 0 ? false : z;
        if ((i2 & 2) == 0) {
            this.c = b.f();
        } else {
            this.c = map;
        }
        if ((i2 & 4) == 0) {
            this.d = null;
        } else {
            this.d = num;
        }
        if ((i2 & 8) == 0) {
            this.e = "";
        } else {
            this.e = str;
        }
        if ((i2 & 16) == 0) {
            this.f = "";
        } else {
            this.f = str2;
        }
        if ((i2 & 32) == 0) {
            this.g = EmptyList.a;
        } else {
            this.g = list;
        }
    }

    @Override // defpackage.n96
    /* renamed from: a, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    @Override // defpackage.c6z
    /* renamed from: f, reason: from getter */
    public final Map getD() {
        return this.c;
    }

    public usr0() {
        this(0);
    }

    public usr0(int i2) {
        Map f = b.f();
        this.b = false;
        this.c = f;
        this.d = null;
        this.e = "";
        this.f = "";
        this.g = EmptyList.a;
    }
}
