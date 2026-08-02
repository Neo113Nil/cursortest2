package defpackage;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

@gsq0
/* loaded from: classes6.dex */
public final class x99 {
    public static final w99 Companion = new w99();
    public static final i3y[] e = {null, null, null, a.b(LazyThreadSafetyMode.PUBLICATION, new we8(19))};
    public final String a;
    public final String b;
    public final Calendar c;
    public final List d;

    public /* synthetic */ x99(int i, String str, String str2, Calendar calendar, List list) {
        if (15 != (i & 15)) {
            qje.Z(i, 15, v99.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = calendar;
        this.d = list;
    }

    public x99(String str, String str2, ArrayList arrayList, Calendar calendar) {
        this.a = str;
        this.b = str2;
        this.c = calendar;
        this.d = arrayList;
    }
}
