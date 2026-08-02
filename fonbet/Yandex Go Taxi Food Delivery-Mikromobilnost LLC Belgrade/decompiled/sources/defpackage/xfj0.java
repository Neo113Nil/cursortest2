package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lxfj0;", "", "Companion", "vfj0", "wfj0", "go-client-android.features.requirements:models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class xfj0 {
    public static final wfj0 Companion = new wfj0();
    public static final i3y[] e = {null, null, a.b(LazyThreadSafetyMode.PUBLICATION, new lqi0(29)), null};
    public final String a;
    public final String b;
    public final List c;
    public final mfj0 d;

    public xfj0(int i, String str, String str2, List list, mfj0 mfj0Var) {
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
            this.c = EmptyList.a;
        } else {
            this.c = list;
        }
        if ((i & 8) != 0) {
            this.d = mfj0Var;
        } else {
            mfj0.Companion.getClass();
            this.d = mfj0.b;
        }
    }

    public xfj0() {
        mfj0.Companion.getClass();
        this.a = "";
        this.b = "";
        this.c = EmptyList.a;
        this.d = mfj0.b;
    }
}
