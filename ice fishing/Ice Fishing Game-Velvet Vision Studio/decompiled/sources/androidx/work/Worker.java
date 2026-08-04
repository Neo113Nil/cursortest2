package androidx.work;

import android.content.Context;
import com.gamericefishpro.space.l6.n;
import com.gamericefishpro.space.l6.p;
import com.gamericefishpro.space.va.a;
import com.gamericefishpro.space.va.b;
import com.gamericefishpro.space.w6.j;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class Worker extends p {
    public j d;

    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public abstract n a();

    @Override // com.gamericefishpro.space.l6.p
    public final b getForegroundInfoAsync() {
        j jVar = new j();
        getBackgroundExecutor().execute(new a(3, this, jVar, false));
        return jVar;
    }

    @Override // com.gamericefishpro.space.l6.p
    public final b startWork() {
        this.d = new j();
        getBackgroundExecutor().execute(new com.gamericefishpro.space.h4.b(3, this));
        return this.d;
    }
}
