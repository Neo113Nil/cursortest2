package t;

import java.util.concurrent.CancellationException;

/* renamed from: t.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4979a {

    /* renamed from: c, reason: collision with root package name */
    public static final C4979a f40502c;

    /* renamed from: d, reason: collision with root package name */
    public static final C4979a f40503d;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f40504a;

    /* renamed from: b, reason: collision with root package name */
    public final CancellationException f40505b;

    static {
        if (AbstractC4985g.f40519w) {
            f40503d = null;
            f40502c = null;
        } else {
            f40503d = new C4979a(false, null);
            f40502c = new C4979a(true, null);
        }
    }

    public C4979a(boolean z3, CancellationException cancellationException) {
        this.f40504a = z3;
        this.f40505b = cancellationException;
    }
}
