package defpackage;

import java.util.Set;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

@gsq0
/* loaded from: classes6.dex */
public final class qbr0 {
    public static final pbr0 Companion = new pbr0();
    public static final i3y[] d = {null, null, a.b(LazyThreadSafetyMode.PUBLICATION, new iwq0(17))};
    public final zzs a;
    public final c4g0 b;
    public final Set c;

    public /* synthetic */ qbr0(int i, zzs zzsVar, c4g0 c4g0Var, Set set) {
        if (7 != (i & 7)) {
            qje.Z(i, 7, obr0.a.getDescriptor());
            throw null;
        }
        this.a = zzsVar;
        this.b = c4g0Var;
        this.c = set;
    }

    public qbr0(zzs zzsVar, c4g0 c4g0Var, Set set) {
        this.a = zzsVar;
        this.b = c4g0Var;
        this.c = set;
    }
}
