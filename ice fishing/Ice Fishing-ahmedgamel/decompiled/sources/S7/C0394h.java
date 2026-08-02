package S7;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: S7.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0394h extends C0402p {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f3052c = AtomicIntegerFieldUpdater.newUpdater(C0394h.class, "_resumed$volatile");
    private volatile /* synthetic */ int _resumed$volatile;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0394h(C0393g c0393g, Throwable th, boolean z6) {
        super(th, z6);
        if (th == null) {
            th = new CancellationException("Continuation " + c0393g + " was cancelled normally");
        }
        this._resumed$volatile = 0;
    }
}
