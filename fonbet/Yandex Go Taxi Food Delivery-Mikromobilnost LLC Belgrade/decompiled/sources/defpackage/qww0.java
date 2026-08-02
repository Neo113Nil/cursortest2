package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lqww0;", "", "Companion", "oww0", "pww0", "common"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class qww0 {
    public static final pww0 Companion = new pww0();
    public static final i3y[] e = {null, null, null, a.b(LazyThreadSafetyMode.PUBLICATION, new dvw0(2))};
    public final String a;
    public final String b;
    public final String c;
    public final List d;

    public /* synthetic */ qww0(String str, int i, String str2, String str3, List list) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = EmptyList.a;
        } else {
            this.d = list;
        }
    }

    public qww0() {
        this.a = "";
        this.b = null;
        this.c = null;
        this.d = EmptyList.a;
    }
}
