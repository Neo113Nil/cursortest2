package S7;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: S7.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0390h extends C0398p {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f2969c = AtomicIntegerFieldUpdater.newUpdater(C0390h.class, "_resumed$volatile");
    private volatile /* synthetic */ int _resumed$volatile;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0390h(C0389g c0389g, Throwable th, boolean z3) {
        super(th, z3);
        if (th == null) {
            th = new CancellationException("Continuation " + c0389g + " was cancelled normally");
        }
        this._resumed$volatile = 0;
    }
}
