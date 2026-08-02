package defpackage;

import java.util.Calendar;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

@gsq0
/* loaded from: classes6.dex */
public final class ua9 {
    public static final ta9 Companion = new ta9();
    public static final i3y[] e = {null, null, null, a.b(LazyThreadSafetyMode.PUBLICATION, new we8(22))};
    public final String a;
    public final String b;
    public final Calendar c;
    public final List d;

    public /* synthetic */ ua9(int i, String str, String str2, Calendar calendar, List list) {
        if (15 != (i & 15)) {
            qje.Z(i, 15, sa9.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = calendar;
        this.d = list;
    }

    public ua9(String str, String str2, Calendar calendar, List list) {
        this.a = str;
        this.b = str2;
        this.c = calendar;
        this.d = list;
    }
}
