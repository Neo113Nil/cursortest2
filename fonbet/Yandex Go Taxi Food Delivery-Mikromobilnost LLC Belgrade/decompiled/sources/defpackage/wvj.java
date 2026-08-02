package defpackage;

import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lwvj;", "Lrl2;", "Companion", "uvj", "vvj", "go-client-android.features.persuggest:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class wvj extends rl2 {
    public static final vvj Companion = new vvj();
    public final String a;
    public final String b;
    public final uc4 c;

    public /* synthetic */ wvj(int i, uc4 uc4Var, String str, String str2) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = uc4Var;
        }
    }

    public wvj() {
        this.a = "";
        this.b = "";
        this.c = null;
    }
}
