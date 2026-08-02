package defpackage;

@gsq0
/* loaded from: classes5.dex */
public final class ryq0 {
    public static final qyq0 Companion = new qyq0();
    public final String a;
    public final String b;

    public /* synthetic */ ryq0(int i, String str, String str2) {
        if (1 != (i & 1)) {
            qje.Z(i, 1, pyq0.a.getDescriptor());
            throw null;
        }
        this.a = str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
    }
}
