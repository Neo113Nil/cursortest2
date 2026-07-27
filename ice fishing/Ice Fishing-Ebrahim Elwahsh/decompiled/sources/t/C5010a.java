package t;

import java.util.concurrent.CancellationException;

/* renamed from: t.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5010a {

    /* renamed from: c, reason: collision with root package name */
    public static final C5010a f40528c;

    /* renamed from: d, reason: collision with root package name */
    public static final C5010a f40529d;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f40530a;

    /* renamed from: b, reason: collision with root package name */
    public final CancellationException f40531b;

    static {
        if (AbstractC5016g.f40544w) {
            f40529d = null;
            f40528c = null;
        } else {
            f40529d = new C5010a(false, null);
            f40528c = new C5010a(true, null);
        }
    }

    public C5010a(boolean z8, CancellationException cancellationException) {
        this.f40530a = z8;
        this.f40531b = cancellationException;
    }
}
