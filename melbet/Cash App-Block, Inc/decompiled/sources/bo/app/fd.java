package bo.app;

import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class fd implements dd {
    public final /* synthetic */ hd a;
    public final /* synthetic */ id b;
    public final /* synthetic */ c7 c;

    public fd(hd hdVar, id idVar, c7 c7Var) {
        this.a = hdVar;
        this.b = idVar;
        this.c = c7Var;
    }

    @Override // bo.app.dd
    public final void a(j jVar) {
        hd hdVar;
        jVar.getClass();
        hd hdVar2 = this.a;
        ReentrantLock reentrantLock = hdVar2.g;
        id idVar = this.b;
        c7 c7Var = this.c;
        reentrantLock.lock();
        try {
            long nowInMillisecondsSystemClock = DateTimeUtils.nowInMillisecondsSystemClock();
            nb nbVar = jVar instanceof nb ? (nb) jVar : null;
            t9 t9Var = nbVar != null ? nbVar.d : null;
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeLogger.brazelog$default(brazeLogger, hd.n, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new q$$ExternalSyntheticLambda1(idVar, nowInMillisecondsSystemClock, t9Var, 2), 14, (Object) null);
            idVar.a(nowInMillisecondsSystemClock, jd.PENDING_RETRY);
            c7Var.a(nowInMillisecondsSystemClock, idVar, jVar);
            if (t9Var instanceof pd) {
                hdVar2.i = nowInMillisecondsSystemClock;
                hdVar2.h = ((i2) ((pd) t9Var).a).k;
                hdVar = hdVar2;
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new q$$ExternalSyntheticLambda1(hdVar2, idVar, nowInMillisecondsSystemClock, 3), 7, (Object) null);
                hdVar.j = nowInMillisecondsSystemClock + hd.o;
            } else {
                hdVar = hdVar2;
            }
            if (t9Var instanceof sa) {
                hdVar.k.incrementAndGet();
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new h$$ExternalSyntheticLambda0(hdVar, 4), 7, (Object) null);
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public static final String a(hd hdVar) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(hdVar.k.get(), "Incremented invalidApiKeyErrorCounter to ");
    }

    @Override // bo.app.dd
    public final void a(nb nbVar) {
        nbVar.getClass();
        ReentrantLock reentrantLock = this.a.g;
        id idVar = this.b;
        c7 c7Var = this.c;
        reentrantLock.lock();
        try {
            long nowInMillisecondsSystemClock = DateTimeUtils.nowInMillisecondsSystemClock();
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, hd.n, (BrazeLogger.Priority) null, (Throwable) null, true, (Function0) new c7$$ExternalSyntheticLambda5(idVar, nowInMillisecondsSystemClock, 1), 6, (Object) null);
            idVar.a(nowInMillisecondsSystemClock, jd.COMPLETE);
            c7Var.a(nowInMillisecondsSystemClock, idVar, nbVar);
        } finally {
            reentrantLock.unlock();
        }
    }

    public static final String a(id idVar, long j) {
        return Recorder$$ExternalSyntheticOutline2.m("Request success received for ", idVar.a(j));
    }

    public static final String a(hd hdVar, id idVar, long j) {
        return CameraSelector$$ExternalSyntheticOutline0.m("Got failed token ", hdVar.h, " for\n ", idVar.a(j));
    }

    public static final String a(id idVar, long j, t9 t9Var) {
        return "Request failure received " + idVar.a(j) + " \n" + t9Var;
    }
}
