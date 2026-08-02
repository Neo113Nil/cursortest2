package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lvwz0;", "Lig5;", "Companion", "twz0", "uwz0", "features-bdui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class vwz0 implements ig5 {
    public static final uwz0 Companion = new uwz0();
    public static final i3y[] d = {null, null, a.b(LazyThreadSafetyMode.PUBLICATION, new nhz0(9))};
    public final Double a;
    public final String b;
    public final vm50 c;

    public /* synthetic */ vwz0(int i, Double d2, String str, vm50 vm50Var) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = d2;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = vm50Var;
        }
    }

    public vwz0() {
        this.a = null;
        this.b = null;
        this.c = null;
    }
}
