package t;

import java.util.concurrent.CancellationException;

/* renamed from: t.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0347a {

    /* renamed from: b, reason: collision with root package name */
    public static final C0347a f4342b;

    /* renamed from: c, reason: collision with root package name */
    public static final C0347a f4343c;

    /* renamed from: a, reason: collision with root package name */
    public final CancellationException f4344a;

    static {
        if (g.f4353d) {
            f4343c = null;
            f4342b = null;
        } else {
            f4343c = new C0347a(false, null);
            f4342b = new C0347a(true, null);
        }
    }

    public C0347a(boolean z2, CancellationException cancellationException) {
        this.f4344a = cancellationException;
    }
}
