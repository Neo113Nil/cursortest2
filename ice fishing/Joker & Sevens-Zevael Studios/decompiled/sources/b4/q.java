package b4;

import androidx.work.impl.WorkDatabase;
import b0.p0;
import bc.a0;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    public final WorkDatabase f1012a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f1013b;

    /* renamed from: c, reason: collision with root package name */
    public final ac.m f1014c;

    public q(WorkDatabase workDatabase) {
        pc.j.e(workDatabase, "database");
        this.f1012a = workDatabase;
        this.f1013b = new AtomicBoolean(false);
        this.f1014c = a0.y(new p0(1, this));
    }

    public final i4.i a() {
        this.f1012a.a();
        return this.f1013b.compareAndSet(false, true) ? (i4.i) this.f1014c.getValue() : b();
    }

    public final i4.i b() {
        String c3 = c();
        WorkDatabase workDatabase = this.f1012a;
        workDatabase.getClass();
        workDatabase.a();
        workDatabase.b();
        return workDatabase.h().t().d(c3);
    }

    public abstract String c();

    public final void d(i4.i iVar) {
        pc.j.e(iVar, "statement");
        if (iVar == ((i4.i) this.f1014c.getValue())) {
            this.f1013b.set(false);
        }
    }
}
