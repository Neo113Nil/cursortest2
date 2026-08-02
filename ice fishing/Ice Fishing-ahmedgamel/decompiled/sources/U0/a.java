package U0;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: c, reason: collision with root package name */
    public static final a f3251c;

    /* renamed from: d, reason: collision with root package name */
    public static final a f3252d;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f3253a;

    /* renamed from: b, reason: collision with root package name */
    public final CancellationException f3254b;

    static {
        if (i.f3272w) {
            f3252d = null;
            f3251c = null;
        } else {
            f3252d = new a(false, null);
            f3251c = new a(true, null);
        }
    }

    public a(boolean z6, CancellationException cancellationException) {
        this.f3253a = z6;
        this.f3254b = cancellationException;
    }
}
