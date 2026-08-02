package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lwvd;", "Lxn11;", "Companion", "vvd", "uvd", "go-client-android.features.requirements:models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class wvd implements xn11 {
    public static final vvd Companion = new vvd();
    public static final i3y[] e = {null, null, a.b(LazyThreadSafetyMode.PUBLICATION, new bgc(18))};
    public final boolean b;
    public final boolean c;
    public final List d;

    public /* synthetic */ wvd(int i, List list, boolean z, boolean z2) {
        this.b = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.c = true;
        } else {
            this.c = z2;
        }
        if ((i & 4) == 0) {
            this.d = EmptyList.a;
        } else {
            this.d = list;
        }
    }

    public wvd(int i) {
        this.b = false;
        this.c = true;
        this.d = EmptyList.a;
    }

    public wvd() {
        this(0);
    }
}
