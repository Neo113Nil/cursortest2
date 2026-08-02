package com.onesignal.notifications.internal.restoration.impl;

import D5.c;
import J0.m;
import J0.p;
import J0.s;
import J0.x;
import K0.k;
import Q3.b;
import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.h;
import p4.g;
import t5.e;
import t5.i;
import z7.InterfaceC5240d;

/* loaded from: classes2.dex */
public final class NotificationRestoreWorkManager implements c {
    public static final a Companion = new a(null);
    private static final String NOTIFICATION_RESTORE_WORKER_IDENTIFIER = NotificationRestoreWorker.class.getCanonicalName();
    private final Object lock = new Object();
    private boolean restored;

    public static final class NotificationRestoreWorker extends CoroutineWorker {

        public static final class a extends B7.c {
            Object L$0;
            int label;
            /* synthetic */ Object result;

            public a(InterfaceC5240d interfaceC5240d) {
                super(interfaceC5240d);
            }

            @Override // B7.a
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return NotificationRestoreWorker.this.doWork(this);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NotificationRestoreWorker(Context context, WorkerParameters workerParams) {
            super(context, workerParams);
            h.e(context, "context");
            h.e(workerParams, "workerParams");
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x008b, code lost:
        
            if (r6.process(r0) == r1) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x008d, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x004e, code lost:
        
            if (r6 == r1) goto L29;
         */
        /* JADX WARN: Removed duplicated region for block: B:19:0x005a  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0064  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x003a  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
        @Override // androidx.work.CoroutineWorker
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object doWork(InterfaceC5240d interfaceC5240d) {
            a aVar;
            Object obj;
            int i;
            Context applicationContext;
            if (interfaceC5240d instanceof a) {
                aVar = (a) interfaceC5240d;
                int i4 = aVar.label;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    aVar.label = i4 - Integer.MIN_VALUE;
                    obj = aVar.result;
                    A7.a aVar2 = A7.a.f215n;
                    i = aVar.label;
                    if (i != 0) {
                        b.s(obj);
                        applicationContext = getApplicationContext();
                        h.d(applicationContext, "getApplicationContext(...)");
                        aVar.L$0 = applicationContext;
                        aVar.label = 1;
                        obj = g.b(applicationContext, aVar);
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            b.s(obj);
                            return p.a();
                        }
                        applicationContext = (Context) aVar.L$0;
                        b.s(obj);
                    }
                    if (((Boolean) obj).booleanValue()) {
                        com.onesignal.debug.internal.logging.b.warn$default("NotificationRestoreWorker skipped due to failed OneSignal init", null, 2, null);
                        return p.a();
                    }
                    if (!e.areNotificationsEnabled$default(e.INSTANCE, applicationContext, null, 2, null)) {
                        com.onesignal.debug.internal.logging.b.debug$default("NotificationRestoreWorker failed: Notifications disabled", null, 2, null);
                        return new m();
                    }
                    D5.b bVar = (D5.b) g.a().getService(D5.b.class);
                    aVar.L$0 = null;
                    aVar.label = 2;
                }
            }
            aVar = new a(interfaceC5240d);
            obj = aVar.result;
            A7.a aVar22 = A7.a.f215n;
            i = aVar.label;
            if (i != 0) {
            }
            if (((Boolean) obj).booleanValue()) {
            }
        }
    }

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.e eVar) {
            this();
        }

        private a() {
        }
    }

    @Override // D5.c
    public void beginEnqueueingWork(Context context, boolean z6) {
        h.e(context, "context");
        synchronized (this.lock) {
            if (this.restored) {
                return;
            }
            this.restored = true;
            int i = z6 ? 15 : 0;
            b3.e eVar = new b3.e(NotificationRestoreWorker.class);
            long j6 = i;
            TimeUnit timeUnit = TimeUnit.SECONDS;
            eVar.I(j6);
            s m9 = eVar.m();
            x iVar = i.INSTANCE.getInstance(context);
            String str = NOTIFICATION_RESTORE_WORKER_IDENTIFIER;
            iVar.getClass();
            new k((K0.p) iVar, str, Collections.singletonList(m9)).s();
        }
    }
}
