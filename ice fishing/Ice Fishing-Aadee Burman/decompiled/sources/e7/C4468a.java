package e7;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.function.Consumer;
import m6.u;

/* renamed from: e7.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C4468a implements Consumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ArrayBlockingQueue f37211a;

    public /* synthetic */ C4468a(ArrayBlockingQueue arrayBlockingQueue) {
        this.f37211a = arrayBlockingQueue;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f37211a.size();
        f6.c.a(c.f37228w, c.f37230y);
        ((u) obj).a();
    }
}
