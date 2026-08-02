package defpackage;

import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public abstract class de4 implements Iterable, j9f {

    @NotNull
    public static final ce4 d = new ce4(null);
    public final char a;
    public final char b;
    public final int c = 1;

    public de4(char c, char c2) {
        this.a = c;
        this.b = (char) hag.s(c, c2, 1);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new ee4(this.a, this.b, this.c);
    }
}
