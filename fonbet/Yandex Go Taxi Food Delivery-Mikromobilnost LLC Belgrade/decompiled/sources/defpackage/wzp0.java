package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

@gsq0
/* loaded from: classes9.dex */
public final class wzp0 {
    public static final vzp0 Companion = new vzp0();
    public static final i3y[] d = {null, null, a.b(LazyThreadSafetyMode.PUBLICATION, new wpp0(29))};
    public final Float a;
    public final Float b;
    public final List c;

    public /* synthetic */ wzp0(int i, Float f, Float f2, List list) {
        if (7 != (i & 7)) {
            qje.Z(i, 7, uzp0.a.getDescriptor());
            throw null;
        }
        this.a = f;
        this.b = f2;
        this.c = list;
    }

    public wzp0(Float f, Float f2, List list) {
        this.a = f;
        this.b = f2;
        this.c = list;
    }
}
