package defpackage;

@gsq0
/* loaded from: classes6.dex */
public final class r86 {
    public static final q86 Companion = new q86();
    public final String a;
    public final String b;

    public /* synthetic */ r86(int i, String str, String str2) {
        if (1 != (i & 1)) {
            qje.Z(i, 1, p86.a.getDescriptor());
            throw null;
        }
        this.a = str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
    }

    public r86(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}
