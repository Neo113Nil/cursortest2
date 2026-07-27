package U0;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: c, reason: collision with root package name */
    public static final a f3134c;

    /* renamed from: d, reason: collision with root package name */
    public static final a f3135d;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f3136a;

    /* renamed from: b, reason: collision with root package name */
    public final CancellationException f3137b;

    static {
        if (i.f3155w) {
            f3135d = null;
            f3134c = null;
        } else {
            f3135d = new a(false, null);
            f3134c = new a(true, null);
        }
    }

    public a(boolean z3, CancellationException cancellationException) {
        this.f3136a = z3;
        this.f3137b = cancellationException;
    }
}
