package defpackage;

import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lqmj0;", "", "Companion", "pmj0", "omj0", "go-client-android.features.requirements:models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class qmj0 {
    public static final pmj0 Companion = new pmj0();
    public static final qmj0 c = new qmj0(0);
    public final String a;
    public final zmj0 b;

    public qmj0(int i, String str, zmj0 zmj0Var) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) != 0) {
            this.b = zmj0Var;
        } else {
            zmj0.Companion.getClass();
            this.b = zmj0.b;
        }
    }

    public qmj0() {
        this(0);
    }

    public qmj0(int i) {
        zmj0.Companion.getClass();
        this.a = "";
        this.b = zmj0.b;
    }
}
