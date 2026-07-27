package O7;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: O7.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0383h extends C0391p {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f2605c = AtomicIntegerFieldUpdater.newUpdater(C0383h.class, "_resumed$volatile");
    private volatile /* synthetic */ int _resumed$volatile;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0383h(C0382g c0382g, Throwable th, boolean z8) {
        super(th, z8);
        if (th == null) {
            th = new CancellationException("Continuation " + c0382g + " was cancelled normally");
        }
        this._resumed$volatile = 0;
    }
}
