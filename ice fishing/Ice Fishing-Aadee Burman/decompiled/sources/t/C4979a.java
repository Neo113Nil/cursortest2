package t;

import java.util.concurrent.CancellationException;

/* renamed from: t.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4979a {

    /* renamed from: c, reason: collision with root package name */
    public static final C4979a f40499c;

    /* renamed from: d, reason: collision with root package name */
    public static final C4979a f40500d;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f40501a;

    /* renamed from: b, reason: collision with root package name */
    public final CancellationException f40502b;

    static {
        if (AbstractC4985g.f40516w) {
            f40500d = null;
            f40499c = null;
        } else {
            f40500d = new C4979a(false, null);
            f40499c = new C4979a(true, null);
        }
    }

    public C4979a(boolean z3, CancellationException cancellationException) {
        this.f40501a = z3;
        this.f40502b = cancellationException;
    }
}
