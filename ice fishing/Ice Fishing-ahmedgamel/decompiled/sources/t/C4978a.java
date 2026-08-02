package t;

import java.util.concurrent.CancellationException;

/* renamed from: t.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4978a {

    /* renamed from: c, reason: collision with root package name */
    public static final C4978a f40556c;

    /* renamed from: d, reason: collision with root package name */
    public static final C4978a f40557d;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f40558a;

    /* renamed from: b, reason: collision with root package name */
    public final CancellationException f40559b;

    static {
        if (AbstractC4984g.f40572w) {
            f40557d = null;
            f40556c = null;
        } else {
            f40557d = new C4978a(false, null);
            f40556c = new C4978a(true, null);
        }
    }

    public C4978a(boolean z6, CancellationException cancellationException) {
        this.f40558a = z6;
        this.f40559b = cancellationException;
    }
}
