package defpackage;

import java.util.List;

/* loaded from: classes6.dex */
public final class uxk0 {
    public final List a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final String e;

    public uxk0(int i, boolean z, List list) {
        boolean z2 = (i & 8) == 0;
        String str = (i & 32) != 0 ? null : "RequiredAltChoiceSection";
        this.a = list;
        this.b = z;
        this.c = true;
        this.d = z2;
        this.e = str;
    }
}
