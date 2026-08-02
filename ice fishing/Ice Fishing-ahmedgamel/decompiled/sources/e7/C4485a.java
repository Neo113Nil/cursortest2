package e7;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.function.Consumer;
import m6.u;

/* renamed from: e7.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C4485a implements Consumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ArrayBlockingQueue f37287a;

    public /* synthetic */ C4485a(ArrayBlockingQueue arrayBlockingQueue) {
        this.f37287a = arrayBlockingQueue;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f37287a.size();
        f6.c.a(c.f37304w, c.f37306y);
        ((u) obj).a();
    }
}
