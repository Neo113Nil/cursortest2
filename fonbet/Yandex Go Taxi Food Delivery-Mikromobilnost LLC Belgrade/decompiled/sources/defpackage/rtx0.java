package defpackage;

import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lrtx0;", "", "Companion", "qtx0", "ptx0", "go-client-android.features.persuggest:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class rtx0 {
    public static final qtx0 Companion = new qtx0();
    public static final rtx0 d = new rtx0(0);
    public final Boolean a;
    public final String b;
    public final kw11 c;

    public /* synthetic */ rtx0(int i, Boolean bool, String str, kw11 kw11Var) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = bool;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = kw11Var;
        }
    }

    public rtx0(int i) {
        this.a = null;
        this.b = null;
        this.c = null;
    }

    public rtx0() {
        this(0);
    }
}
