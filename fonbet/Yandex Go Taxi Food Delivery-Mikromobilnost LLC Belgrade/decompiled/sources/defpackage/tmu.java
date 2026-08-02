package defpackage;

import android.os.SystemClock;
import android.util.SparseArray;

/* loaded from: classes15.dex */
public final class tmu implements zs2 {
    public final /* synthetic */ umu a;
    public final /* synthetic */ vmu b;

    public tmu(umu umuVar, vmu vmuVar) {
        this.a = umuVar;
        this.b = vmuVar;
    }

    @Override // defpackage.zs2
    public final void a() {
        this.b.getClass();
        SystemClock.elapsedRealtime();
    }

    @Override // defpackage.zs2
    public final void b(SparseArray sparseArray) {
        umu umuVar = this.a;
        long j = umuVar.f;
        this.b.getClass();
        umuVar.f = (SystemClock.elapsedRealtime() - umuVar.e) + j;
        umuVar.d++;
    }

    @Override // defpackage.zs2
    public final void c() {
        this.b.getClass();
        this.a.e = SystemClock.elapsedRealtime();
    }
}
