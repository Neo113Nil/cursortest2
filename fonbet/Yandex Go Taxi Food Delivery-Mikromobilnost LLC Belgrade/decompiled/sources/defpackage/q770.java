package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lq770;", "Lig5;", "Companion", "o770", "p770", "features-bdui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class q770 implements ig5 {
    public static final p770 Companion = new p770();
    public static final i3y[] c;
    public final vm50 a;
    public final vm50 b;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        c = new i3y[]{a.b(lazyThreadSafetyMode, new y570(8)), a.b(lazyThreadSafetyMode, new y570(9))};
    }

    public /* synthetic */ q770(int i, vm50 vm50Var, vm50 vm50Var2) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = vm50Var;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = vm50Var2;
        }
    }

    public q770() {
        this.a = null;
        this.b = null;
    }
}
