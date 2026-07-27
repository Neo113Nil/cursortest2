package com.onesignal.notifications.internal.restoration.impl;

import J0.n;
import J0.q;
import J0.t;
import J0.y;
import K0.k;
import K0.p;
import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.bumptech.glide.f;
import com.onesignal.debug.internal.logging.b;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.h;
import l4.g;
import p5.e;
import p5.i;
import v7.InterfaceC5133d;
import w7.EnumC5179a;
import x7.AbstractC5219c;
import z5.InterfaceC5280b;
import z5.InterfaceC5281c;

/* loaded from: classes2.dex */
public final class NotificationRestoreWorkManager implements InterfaceC5281c {
    public static final a Companion = new a(null);
    private static final String NOTIFICATION_RESTORE_WORKER_IDENTIFIER = NotificationRestoreWorker.class.getCanonicalName();
    private final Object lock = new Object();
    private boolean restored;

    public static final class NotificationRestoreWorker extends CoroutineWorker {

        public static final class a extends AbstractC5219c {
            Object L$0;
            int label;
            /* synthetic */ Object result;

            public a(InterfaceC5133d interfaceC5133d) {
                super(interfaceC5133d);
            }

            @Override // x7.AbstractC5217a
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
        public Object doWork(InterfaceC5133d interfaceC5133d) {
            a aVar;
            Object obj;
            int i;
            Context applicationContext;
            if (interfaceC5133d instanceof a) {
                aVar = (a) interfaceC5133d;
                int i4 = aVar.label;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    aVar.label = i4 - Integer.MIN_VALUE;
                    obj = aVar.result;
                    EnumC5179a enumC5179a = EnumC5179a.f41704n;
                    i = aVar.label;
                    if (i != 0) {
                        f.r(obj);
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
                            f.r(obj);
                            return q.a();
                        }
                        applicationContext = (Context) aVar.L$0;
                        f.r(obj);
                    }
                    if (((Boolean) obj).booleanValue()) {
                        b.warn$default("NotificationRestoreWorker skipped due to failed OneSignal init", null, 2, null);
                        return q.a();
                    }
                    if (!e.areNotificationsEnabled$default(e.INSTANCE, applicationContext, null, 2, null)) {
                        b.debug$default("NotificationRestoreWorker failed: Notifications disabled", null, 2, null);
                        return new n();
                    }
                    InterfaceC5280b interfaceC5280b = (InterfaceC5280b) g.a().getService(InterfaceC5280b.class);
                    aVar.L$0 = null;
                    aVar.label = 2;
                }
            }
            aVar = new a(interfaceC5133d);
            obj = aVar.result;
            EnumC5179a enumC5179a2 = EnumC5179a.f41704n;
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

    @Override // z5.InterfaceC5281c
    public void beginEnqueueingWork(Context context, boolean z8) {
        h.e(context, "context");
        synchronized (this.lock) {
            if (this.restored) {
                return;
            }
            this.restored = true;
            int i = z8 ? 15 : 0;
            Y2.e eVar = new Y2.e(NotificationRestoreWorker.class);
            long j9 = i;
            TimeUnit timeUnit = TimeUnit.SECONDS;
            eVar.L(j9);
            t n9 = eVar.n();
            y iVar = i.INSTANCE.getInstance(context);
            String str = NOTIFICATION_RESTORE_WORKER_IDENTIFIER;
            iVar.getClass();
            new k((p) iVar, str, Collections.singletonList(n9)).r();
        }
    }
}
