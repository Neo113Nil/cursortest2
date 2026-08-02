package defpackage;

/* loaded from: classes.dex */
public final class wsb extends RuntimeException {
    public final int a;

    public wsb(int i) {
        super(i != 1 ? i != 2 ? i != 3 ? "Undefined timeout." : "Detaching surface timed out." : "Setting foreground mode timed out." : "Player release timed out.");
        this.a = i;
    }
}
