package defpackage;

/* loaded from: classes3.dex */
public final class oir extends RuntimeException {
    public oir(String str, IllegalArgumentException illegalArgumentException, int i) {
        super((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : illegalArgumentException);
    }
}
