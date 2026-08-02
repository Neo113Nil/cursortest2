package defpackage;

import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lrmo;", "", "Companion", "pmo", "qmo", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class rmo {
    public static final qmo Companion = new qmo();
    public final pud0 a;
    public final String b;
    public final String c;

    public /* synthetic */ rmo(int i, pud0 pud0Var, String str, String str2) {
        this.a = (i & 1) == 0 ? new pud0(0) : pud0Var;
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
    }

    public rmo() {
        this.a = new pud0(0);
        this.b = "";
        this.c = "";
    }
}
