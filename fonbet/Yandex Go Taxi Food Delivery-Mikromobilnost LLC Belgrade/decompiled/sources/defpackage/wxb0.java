package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lwxb0;", "Lxxb0;", "Companion", "uxb0", "vxb0", "models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class wxb0 extends xxb0 {
    public static final vxb0 Companion = new vxb0();
    public static final i3y[] d = {a.b(LazyThreadSafetyMode.PUBLICATION, new l1b0(11)), null, null};
    public final List a;
    public final zdt0 b;
    public final jzi c;

    public wxb0(int i, List list, zdt0 zdt0Var, jzi jziVar) {
        this.a = (i & 1) == 0 ? EmptyList.a : list;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = zdt0Var;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = jziVar;
        }
    }

    public wxb0() {
        this.a = EmptyList.a;
        this.b = null;
        this.c = null;
    }
}
