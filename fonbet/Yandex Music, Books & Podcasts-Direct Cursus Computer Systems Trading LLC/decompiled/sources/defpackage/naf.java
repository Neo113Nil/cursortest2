package defpackage;

/* loaded from: classes3.dex */
public enum naf implements gse {
    UNKNOWN_KEYMATERIAL(0),
    SYMMETRIC(1),
    ASYMMETRIC_PRIVATE(2),
    ASYMMETRIC_PUBLIC(3),
    REMOTE(4),
    UNRECOGNIZED(-1);

    public final int a;

    naf(int i) {
        this.a = i;
    }
}
