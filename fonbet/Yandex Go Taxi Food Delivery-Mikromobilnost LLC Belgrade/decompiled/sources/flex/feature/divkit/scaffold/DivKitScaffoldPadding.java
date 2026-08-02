package flex.feature.divkit.scaffold;

import defpackage.ayk;
import defpackage.byk;
import defpackage.c690;
import defpackage.gsq0;
import defpackage.h690;
import defpackage.i3y;
import defpackage.qje;
import defpackage.xyi;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lflex/feature/divkit/scaffold/DivKitScaffoldPadding;", "", "Companion", "ayk", "byk", "flex-divkit-scaffold-feature_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class DivKitScaffoldPadding {
    public static final byk Companion = new byk();
    public static final i3y[] b = {a.b(LazyThreadSafetyMode.PUBLICATION, new xyi(18))};
    public final h690 a;

    public /* synthetic */ DivKitScaffoldPadding(int i, h690 h690Var) {
        if (1 == (i & 1)) {
            this.a = h690Var;
        } else {
            qje.Z(i, 1, ayk.a.getDescriptor());
            throw null;
        }
    }

    public DivKitScaffoldPadding(c690 c690Var) {
        this.a = c690Var;
    }
}
