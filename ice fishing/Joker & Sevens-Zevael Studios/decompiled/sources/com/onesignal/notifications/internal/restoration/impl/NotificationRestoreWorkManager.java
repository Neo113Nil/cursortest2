package com.onesignal.notifications.internal.restoration.impl;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import fc.d;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import na.e;
import na.h;
import o4.m;
import o4.p;
import o4.u;
import p4.n;
import pc.f;
import pc.j;
import xa.b;
import xa.c;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class NotificationRestoreWorkManager implements c {
    public static final a Companion = new a(null);
    private static final String NOTIFICATION_RESTORE_WORKER_IDENTIFIER = NotificationRestoreWorker.class.getCanonicalName();
    private boolean restored;

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class NotificationRestoreWorker extends CoroutineWorker {

        /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
        public static final class a extends hc.c {
            int label;
            /* synthetic */ Object result;

            public a(d dVar) {
                super(dVar);
            }

            @Override // hc.a
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return NotificationRestoreWorker.this.doWork(this);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NotificationRestoreWorker(Context context, WorkerParameters workerParameters) {
            super(context, workerParameters);
            j.e(context, "context");
            j.e(workerParameters, "workerParams");
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x002d  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
        @Override // androidx.work.CoroutineWorker
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object doWork(d dVar) {
            a aVar;
            int i10;
            if (dVar instanceof a) {
                aVar = (a) dVar;
                int i11 = aVar.label;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    aVar.label = i11 - Integer.MIN_VALUE;
                    Object obj = aVar.result;
                    i10 = aVar.label;
                    if (i10 != 0) {
                        v6.a.W(obj);
                        Context applicationContext = getApplicationContext();
                        j.d(applicationContext, "applicationContext");
                        if (!h8.d.b(applicationContext)) {
                            return m.a();
                        }
                        if (!e.areNotificationsEnabled$default(e.INSTANCE, applicationContext, null, 2, null)) {
                            return new o4.j();
                        }
                        b bVar = (b) h8.d.a().getService(b.class);
                        aVar.label = 1;
                        Object process = bVar.process(aVar);
                        gc.a aVar2 = gc.a.f2559g;
                        if (process == aVar2) {
                            return aVar2;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        v6.a.W(obj);
                    }
                    return m.a();
                }
            }
            aVar = new a(dVar);
            Object obj2 = aVar.result;
            i10 = aVar.label;
            if (i10 != 0) {
            }
            return m.a();
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class a {
        public /* synthetic */ a(f fVar) {
            this();
        }

        private a() {
        }
    }

    @Override // xa.c
    public void beginEnqueueingWork(Context context, boolean z10) {
        j.e(context, "context");
        synchronized (Boolean.valueOf(this.restored)) {
            if (this.restored) {
                return;
            }
            this.restored = true;
            int i10 = z10 ? 15 : 0;
            a5.c cVar = new a5.c(NotificationRestoreWorker.class);
            long j3 = i10;
            TimeUnit timeUnit = TimeUnit.SECONDS;
            cVar.O(j3);
            p m10 = cVar.m();
            u hVar = h.INSTANCE.getInstance(context);
            String str = NOTIFICATION_RESTORE_WORKER_IDENTIFIER;
            hVar.getClass();
            new p4.j((n) hVar, str, Collections.singletonList(m10)).N();
        }
    }
}
