package l;

import java.util.concurrent.CancellationException;

/* renamed from: l.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0190a {

    /* renamed from: b, reason: collision with root package name */
    public static final C0190a f2666b;

    /* renamed from: c, reason: collision with root package name */
    public static final C0190a f2667c;

    /* renamed from: a, reason: collision with root package name */
    public final CancellationException f2668a;

    static {
        if (AbstractFutureC0196g.f2679d) {
            f2667c = null;
            f2666b = null;
        } else {
            f2667c = new C0190a(false, null);
            f2666b = new C0190a(true, null);
        }
    }

    public C0190a(boolean z2, CancellationException cancellationException) {
        this.f2668a = cancellationException;
    }
}
