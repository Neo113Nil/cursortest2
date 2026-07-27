package l;

import java.util.concurrent.CancellationException;

/* renamed from: l.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0190a {

    /* renamed from: b, reason: collision with root package name */
    public static final C0190a f2674b;

    /* renamed from: c, reason: collision with root package name */
    public static final C0190a f2675c;

    /* renamed from: a, reason: collision with root package name */
    public final CancellationException f2676a;

    static {
        if (AbstractFutureC0196g.f2687d) {
            f2675c = null;
            f2674b = null;
        } else {
            f2675c = new C0190a(false, null);
            f2674b = new C0190a(true, null);
        }
    }

    public C0190a(boolean z2, CancellationException cancellationException) {
        this.f2676a = cancellationException;
    }
}
