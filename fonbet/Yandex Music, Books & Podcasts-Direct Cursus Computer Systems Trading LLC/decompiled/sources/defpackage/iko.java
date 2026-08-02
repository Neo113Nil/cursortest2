package defpackage;

/* loaded from: classes.dex */
public final class iko extends olo {
    public static final iko b = new iko(-16777216);
    public static final iko c = new iko(0);
    public final int a;

    public iko(int i) {
        this.a = i;
    }

    public final String toString() {
        return String.format("#%08x", Integer.valueOf(this.a));
    }
}
