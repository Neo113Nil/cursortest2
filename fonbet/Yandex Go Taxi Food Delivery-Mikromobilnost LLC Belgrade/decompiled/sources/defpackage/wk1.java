package defpackage;

import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lwk1;", "", "Companion", "uk1", "vk1", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class wk1 {
    public static final vk1 Companion = new vk1();
    public final String a;
    public final boolean b;

    public /* synthetic */ wk1(int i, String str, boolean z) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = true;
        } else {
            this.b = z;
        }
    }

    public wk1(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public wk1() {
        this("", true);
    }
}
