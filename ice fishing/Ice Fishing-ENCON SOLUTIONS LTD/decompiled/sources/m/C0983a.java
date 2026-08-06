package m;

import java.util.concurrent.CancellationException;

/* renamed from: m.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0983a {

    /* renamed from: b, reason: collision with root package name */
    public static final C0983a f8139b;

    /* renamed from: c, reason: collision with root package name */
    public static final C0983a f8140c;

    /* renamed from: a, reason: collision with root package name */
    public final CancellationException f8141a;

    static {
        if (g.f8152d) {
            f8140c = null;
            f8139b = null;
        } else {
            f8140c = new C0983a(false, null);
            f8139b = new C0983a(true, null);
        }
    }

    public C0983a(boolean z2, CancellationException cancellationException) {
        this.f8141a = cancellationException;
    }
}
