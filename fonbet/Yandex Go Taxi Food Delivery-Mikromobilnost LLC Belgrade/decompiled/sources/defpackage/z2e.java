package defpackage;

/* loaded from: classes5.dex */
public final class z2e {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final String d;

    public /* synthetic */ z2e(int i, boolean z, boolean z2, boolean z3) {
        this((i & 1) != 0 ? true : z, (String) null, (i & 2) != 0 ? true : z2, (i & 4) != 0 ? false : z3);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public z2e() {
        this(15, r0, r0, r0);
        boolean z = false;
    }

    public z2e(boolean z, String str, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = str;
    }
}
