package androidx.work;

import android.content.Context;
import b4.g;
import dd.i;
import h7.a;
import o4.l;
import o4.n;
import z4.j;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class Worker extends n {

    /* renamed from: g, reason: collision with root package name */
    public j f743g;

    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public abstract l a();

    @Override // o4.n
    public final a getForegroundInfoAsync() {
        j jVar = new j();
        getBackgroundExecutor().execute(new i(15, this, jVar));
        return jVar;
    }

    @Override // o4.n
    public final a startWork() {
        this.f743g = new j();
        getBackgroundExecutor().execute(new g(7, this));
        return this.f743g;
    }
}
