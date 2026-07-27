package U0;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: c, reason: collision with root package name */
    public static final a f3213c;

    /* renamed from: d, reason: collision with root package name */
    public static final a f3214d;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f3215a;

    /* renamed from: b, reason: collision with root package name */
    public final CancellationException f3216b;

    static {
        if (i.f3233w) {
            f3214d = null;
            f3213c = null;
        } else {
            f3214d = new a(false, null);
            f3213c = new a(true, null);
        }
    }

    public a(boolean z8, CancellationException cancellationException) {
        this.f3215a = z8;
        this.f3216b = cancellationException;
    }
}
