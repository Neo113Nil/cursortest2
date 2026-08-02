package defpackage;

import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

@gsq0
/* loaded from: classes9.dex */
public final class qwi0 extends bds0 {
    public static final pwi0 Companion = new pwi0();
    public static final i3y[] g = {null, null, null, null, null, a.b(LazyThreadSafetyMode.PUBLICATION, new vci0(9))};
    public final Boolean a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final Map f;

    public /* synthetic */ qwi0(int i, Boolean bool, String str, String str2, String str3, String str4, Map map) {
        if (62 != (i & 62)) {
            qje.Z(i, 62, owi0.a.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = bool;
        }
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = map;
    }

    @Override // defpackage.bds0
    /* renamed from: a */
    public final Boolean getA() {
        return this.a;
    }
}
