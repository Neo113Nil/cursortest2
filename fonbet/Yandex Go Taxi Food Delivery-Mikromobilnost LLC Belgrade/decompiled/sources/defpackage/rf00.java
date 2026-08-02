package defpackage;

import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lrf00;", "", "Companion", "pf00", "qf00", "go-client-android.features:common_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class rf00 {
    public static final qf00 Companion = new qf00();
    public final n7v a;
    public final String b;
    public final String c;
    public final oj4 d;

    public /* synthetic */ rf00(int i, n7v n7vVar, String str, String str2, oj4 oj4Var) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = n7vVar;
        }
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = "";
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = oj4Var;
        }
    }

    public rf00(int i) {
        this.a = null;
        this.b = "";
        this.c = "";
        this.d = null;
    }

    public rf00() {
        this(0);
    }
}
