package defpackage;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

/* loaded from: classes7.dex */
public abstract class x771 implements pk81 {
    public final ArrayDeque a = new ArrayDeque();
    public final ArrayDeque b;
    public final PriorityQueue c;
    public q171 d;
    public long e;
    public long f;

    public x771() {
        for (int i = 0; i < 10; i++) {
            this.a.add(new q171());
        }
        this.b = new ArrayDeque();
        for (int i2 = 0; i2 < 2; i2++) {
            this.b.add(new v471(new gp51(9, this)));
        }
        this.c = new PriorityQueue();
    }

    @Override // defpackage.c581
    public final void b(du81 du81Var) {
        if (du81Var != this.d) {
            w511.q();
            return;
        }
        q171 q171Var = (q171) du81Var;
        if (q171Var.c(Integer.MIN_VALUE)) {
            q171Var.e();
            this.a.add(q171Var);
        } else {
            long j = this.f;
            this.f = 1 + j;
            q171Var.B = j;
            this.c.add(q171Var);
        }
        this.d = null;
    }

    public abstract void c(q171 q171Var);

    public abstract shu d();

    @Override // defpackage.c581
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public rw81 a() {
        ArrayDeque arrayDeque = this.b;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        while (true) {
            PriorityQueue priorityQueue = this.c;
            if (priorityQueue.isEmpty()) {
                return null;
            }
            q171 q171Var = (q171) priorityQueue.peek();
            int i = rf71.a;
            if (q171Var.x > this.e) {
                return null;
            }
            q171 q171Var2 = (q171) priorityQueue.poll();
            boolean c = q171Var2.c(4);
            ArrayDeque arrayDeque2 = this.a;
            if (c) {
                rw81 rw81Var = (rw81) arrayDeque.pollFirst();
                rw81Var.a |= 4;
                q171Var2.e();
                arrayDeque2.add(q171Var2);
                return rw81Var;
            }
            c(q171Var2);
            if (f()) {
                shu d = d();
                rw81 rw81Var2 = (rw81) arrayDeque.pollFirst();
                long j = q171Var2.x;
                rw81Var2.b = j;
                rw81Var2.c = d;
                rw81Var2.w = j;
                q171Var2.e();
                arrayDeque2.add(q171Var2);
                return rw81Var2;
            }
            q171Var2.e();
            arrayDeque2.add(q171Var2);
        }
    }

    public abstract boolean f();

    @Override // defpackage.c581
    public void flush() {
        ArrayDeque arrayDeque;
        this.f = 0L;
        this.e = 0L;
        while (true) {
            PriorityQueue priorityQueue = this.c;
            boolean isEmpty = priorityQueue.isEmpty();
            arrayDeque = this.a;
            if (isEmpty) {
                break;
            }
            q171 q171Var = (q171) priorityQueue.poll();
            int i = rf71.a;
            q171Var.e();
            arrayDeque.add(q171Var);
        }
        q171 q171Var2 = this.d;
        if (q171Var2 != null) {
            q171Var2.e();
            arrayDeque.add(q171Var2);
            this.d = null;
        }
    }

    @Override // defpackage.c581
    public void release() {
    }

    @Override // defpackage.pk81
    public final void a(long j) {
        this.e = j;
    }

    @Override // defpackage.c581
    public final Object b() {
        if (this.d == null) {
            ArrayDeque arrayDeque = this.a;
            if (arrayDeque.isEmpty()) {
                return null;
            }
            q171 q171Var = (q171) arrayDeque.pollFirst();
            this.d = q171Var;
            return q171Var;
        }
        ny61.k();
        return null;
    }
}
