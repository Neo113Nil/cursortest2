package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

@gsq0
/* loaded from: classes5.dex */
public final class zjr0 {
    public static final yjr0 Companion = new yjr0();
    public static final i3y[] d = {a.b(LazyThreadSafetyMode.PUBLICATION, new iwq0(29)), null, null};
    public final List a;
    public final String b;
    public final String c;

    public /* synthetic */ zjr0(int i, String str, String str2, List list) {
        if (1 != (i & 1)) {
            qje.Z(i, 1, xjr0.a.getDescriptor());
            throw null;
        }
        this.a = list;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
    }
}
