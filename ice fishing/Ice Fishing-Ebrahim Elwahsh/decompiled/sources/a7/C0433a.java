package a7;

import i6.u;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.function.Consumer;

/* renamed from: a7.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0433a implements Consumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ArrayBlockingQueue f4392a;

    public /* synthetic */ C0433a(ArrayBlockingQueue arrayBlockingQueue) {
        this.f4392a = arrayBlockingQueue;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f4392a.size();
        b6.c.b(d.f4413w, d.f4415y);
        ((u) obj).a();
    }
}
