package defpackage;

import java.util.PriorityQueue;

/* loaded from: classes3.dex */
public final class us1 extends Thread {
    public final /* synthetic */ fmq a;
    public final /* synthetic */ PriorityQueue b;
    public final /* synthetic */ ys1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public us1(ys1 ys1Var, String str, fmq fmqVar, PriorityQueue priorityQueue) {
        super(str);
        this.c = ys1Var;
        this.a = fmqVar;
        this.b = priorityQueue;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        ys1.g(this.c, this.a, this.b);
    }
}
