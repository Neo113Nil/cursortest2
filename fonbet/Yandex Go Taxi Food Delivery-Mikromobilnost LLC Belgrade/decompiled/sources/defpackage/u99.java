package defpackage;

import java.util.Calendar;

@gsq0
/* loaded from: classes6.dex */
public final class u99 {
    public static final t99 Companion = new t99();
    public final String a;
    public final String b;
    public final Calendar c;
    public final String d;

    public /* synthetic */ u99(int i, String str, String str2, String str3, Calendar calendar) {
        if (15 != (i & 15)) {
            qje.Z(i, 15, s99.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = calendar;
        this.d = str3;
    }

    public u99(String str, String str2, Calendar calendar, String str3) {
        this.a = str;
        this.b = str2;
        this.c = calendar;
        this.d = str3;
    }
}
