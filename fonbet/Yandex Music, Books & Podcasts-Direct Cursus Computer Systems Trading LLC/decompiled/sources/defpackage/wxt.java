package defpackage;

/* loaded from: classes3.dex */
public final class wxt extends RuntimeException {
    public wxt(int i, Exception exc, String str) {
        super((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : exc);
    }
}
