package L1;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: L1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0004e extends C0009j {

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f559c = AtomicIntegerFieldUpdater.newUpdater(C0004e.class, "_resumed");
    private volatile int _resumed;

    public C0004e(C0003d c0003d, Throwable th, boolean z2) {
        super(th, z2);
        this._resumed = 0;
    }
}
