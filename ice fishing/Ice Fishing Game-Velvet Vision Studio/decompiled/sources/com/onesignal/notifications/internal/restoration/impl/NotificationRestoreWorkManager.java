package com.onesignal.notifications.internal.restoration.impl;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.gamericefishpro.space.gg.c;
import com.gamericefishpro.space.l6.l;
import com.gamericefishpro.space.l6.n;
import com.gamericefishpro.space.l6.o;
import com.gamericefishpro.space.l6.s;
import com.gamericefishpro.space.l6.z;
import com.gamericefishpro.space.m6.k;
import com.gamericefishpro.space.mf.e;
import com.gamericefishpro.space.mf.h;
import com.gamericefishpro.space.wa.b;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    java.lang.IllegalArgumentException: Provided Metadata instance does not have metadataVersion in it and therefore is malformed and cannot be read.
    	at kotlin.metadata.jvm.internal.JvmReadUtils.checkMetadataVersionForRead(JvmReadUtils.kt:79)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:46)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:68)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:31)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:31)
    */
/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class NotificationRestoreWorkManager implements c {
    public static final a Companion = new a(null);
    private static final String NOTIFICATION_RESTORE_WORKER_IDENTIFIER = NotificationRestoreWorker.class.getCanonicalName();
    private boolean restored;

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    @Metadata
    public static final class NotificationRestoreWorker extends CoroutineWorker {

        /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
        public static final class a extends com.gamericefishpro.space.vh.c {
            int label;
            /* synthetic */ Object result;

            public a(com.gamericefishpro.space.th.a aVar) {
                super(aVar);
            }

            @Override // com.gamericefishpro.space.vh.a
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return NotificationRestoreWorker.this.doWork(this);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NotificationRestoreWorker(Context context, WorkerParameters workerParams) {
            super(context, workerParams);
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(workerParams, "workerParams");
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // androidx.work.CoroutineWorker
        public Object doWork(com.gamericefishpro.space.th.a aVar) {
            a aVar2;
            if (aVar instanceof a) {
                aVar2 = (a) aVar;
                int i = aVar2.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    aVar2.label = i - Integer.MIN_VALUE;
                } else {
                    aVar2 = new a(aVar);
                }
            } else {
                aVar2 = new a(aVar);
            }
            Object obj = aVar2.result;
            com.gamericefishpro.space.uh.a aVar3 = com.gamericefishpro.space.uh.a.d;
            int i2 = aVar2.label;
            if (i2 == 0) {
                b.P(obj);
                Context applicationContext = getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                if (!com.gamericefishpro.space.xb.c.b(applicationContext)) {
                    n nVarA = o.a();
                    Intrinsics.checkNotNullExpressionValue(nVarA, "success(...)");
                    return nVarA;
                }
                if (!e.areNotificationsEnabled$default(e.INSTANCE, applicationContext, null, 2, null)) {
                    l lVar = new l();
                    Intrinsics.checkNotNullExpressionValue(lVar, "failure(...)");
                    return lVar;
                }
                com.gamericefishpro.space.gg.b bVar = (com.gamericefishpro.space.gg.b) com.gamericefishpro.space.xb.c.a().getService(com.gamericefishpro.space.gg.b.class);
                aVar2.label = 1;
                if (bVar.process(aVar2) == aVar3) {
                    return aVar3;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b.P(obj);
            }
            n nVarA2 = o.a();
            Intrinsics.checkNotNullExpressionValue(nVarA2, "success(...)");
            return nVarA2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Override // com.gamericefishpro.space.gg.c
    public void beginEnqueueingWork(Context context, boolean z) {
        Intrinsics.checkNotNullParameter(context, "context");
        synchronized (Boolean.valueOf(this.restored)) {
            if (this.restored) {
                return;
            }
            this.restored = true;
            Unit unit = Unit.a;
            int i = z ? 15 : 0;
            com.gamericefishpro.space.a8.c cVar = new com.gamericefishpro.space.a8.c(NotificationRestoreWorker.class);
            long j = i;
            TimeUnit timeUnit = TimeUnit.SECONDS;
            cVar.F(j);
            s sVarF = cVar.f();
            z hVar = h.INSTANCE.getInstance(context);
            String str = NOTIFICATION_RESTORE_WORKER_IDENTIFIER;
            hVar.getClass();
            new k((com.gamericefishpro.space.m6.o) hVar, str, Collections.singletonList(sVarF)).d0();
        }
    }
}
