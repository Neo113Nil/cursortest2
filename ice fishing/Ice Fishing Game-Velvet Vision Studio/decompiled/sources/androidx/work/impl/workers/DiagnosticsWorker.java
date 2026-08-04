package androidx.work.impl.workers;

import android.content.Context;
import android.database.Cursor;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import com.gamericefishpro.space.d9.h;
import com.gamericefishpro.space.hj.c;
import com.gamericefishpro.space.i.a;
import com.gamericefishpro.space.l6.e;
import com.gamericefishpro.space.l6.g;
import com.gamericefishpro.space.l6.n;
import com.gamericefishpro.space.l6.r;
import com.gamericefishpro.space.l6.x;
import com.gamericefishpro.space.l6.y;
import com.gamericefishpro.space.m6.o;
import com.gamericefishpro.space.s5.v;
import com.gamericefishpro.space.u6.i;
import com.gamericefishpro.space.u6.l;
import com.gamericefishpro.space.u6.p;
import com.gamericefishpro.space.u6.q;
import com.gamericefishpro.space.u6.s;
import com.gamericefishpro.space.y6.b;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    java.lang.IllegalArgumentException: Provided Metadata instance does not have metadataVersion in it and therefore is malformed and cannot be read.
    	at kotlin.metadata.jvm.internal.JvmReadUtils.checkMetadataVersionForRead(JvmReadUtils.kt:79)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:46)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:68)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:31)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    */
/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
@Metadata
public final class DiagnosticsWorker extends Worker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiagnosticsWorker(Context context, WorkerParameters parameters) {
        super(context, parameters);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
    }

    @Override // androidx.work.Worker
    public final n a() throws Throwable {
        v vVar;
        i iVar;
        l lVar;
        s sVar;
        o oVarA = o.a(getApplicationContext());
        Intrinsics.checkNotNullExpressionValue(oVarA, "getInstance(applicationContext)");
        WorkDatabase workDatabase = oVarA.c;
        Intrinsics.checkNotNullExpressionValue(workDatabase, "workManager.workDatabase");
        q qVarB = workDatabase.B();
        l lVarZ = workDatabase.z();
        s sVarC = workDatabase.C();
        i iVarY = workDatabase.y();
        long jCurrentTimeMillis = System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1L);
        qVarB.getClass();
        v vVarB = v.b(1, "SELECT * FROM workspec WHERE last_enqueue_time >= ? AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC");
        vVarB.a(1, jCurrentTimeMillis);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) qVarB.a;
        workDatabase_Impl.b();
        Cursor cursorL = c.L(workDatabase_Impl, vVarB);
        try {
            int iY = h.y(cursorL, "id");
            int iY2 = h.y(cursorL, "state");
            int iY3 = h.y(cursorL, "worker_class_name");
            int iY4 = h.y(cursorL, "input_merger_class_name");
            int iY5 = h.y(cursorL, "input");
            int iY6 = h.y(cursorL, "output");
            int iY7 = h.y(cursorL, "initial_delay");
            int iY8 = h.y(cursorL, "interval_duration");
            int iY9 = h.y(cursorL, "flex_duration");
            int iY10 = h.y(cursorL, "run_attempt_count");
            int iY11 = h.y(cursorL, "backoff_policy");
            vVar = vVarB;
            try {
                int iY12 = h.y(cursorL, "backoff_delay_duration");
                int iY13 = h.y(cursorL, "last_enqueue_time");
                int iY14 = h.y(cursorL, "minimum_retention_duration");
                int iY15 = h.y(cursorL, "schedule_requested_at");
                int iY16 = h.y(cursorL, "run_in_foreground");
                int iY17 = h.y(cursorL, "out_of_quota_policy");
                int iY18 = h.y(cursorL, "period_count");
                int iY19 = h.y(cursorL, "generation");
                int iY20 = h.y(cursorL, "required_network_type");
                int iY21 = h.y(cursorL, "requires_charging");
                int iY22 = h.y(cursorL, "requires_device_idle");
                int iY23 = h.y(cursorL, "requires_battery_not_low");
                int iY24 = h.y(cursorL, "requires_storage_not_low");
                int iY25 = h.y(cursorL, "trigger_content_update_delay");
                int iY26 = h.y(cursorL, "trigger_max_content_delay");
                int iY27 = h.y(cursorL, "content_uri_triggers");
                int i = iY14;
                ArrayList arrayList = new ArrayList(cursorL.getCount());
                while (cursorL.moveToNext()) {
                    byte[] blob = null;
                    String string = cursorL.isNull(iY) ? null : cursorL.getString(iY);
                    y yVarC = a.C(cursorL.getInt(iY2));
                    String string2 = cursorL.isNull(iY3) ? null : cursorL.getString(iY3);
                    String string3 = cursorL.isNull(iY4) ? null : cursorL.getString(iY4);
                    g gVarA = g.a(cursorL.isNull(iY5) ? null : cursorL.getBlob(iY5));
                    g gVarA2 = g.a(cursorL.isNull(iY6) ? null : cursorL.getBlob(iY6));
                    long j = cursorL.getLong(iY7);
                    long j2 = cursorL.getLong(iY8);
                    long j3 = cursorL.getLong(iY9);
                    int i2 = cursorL.getInt(iY10);
                    com.gamericefishpro.space.l6.a aVarZ = a.z(cursorL.getInt(iY11));
                    long j4 = cursorL.getLong(iY12);
                    long j5 = cursorL.getLong(iY13);
                    int i3 = i;
                    long j6 = cursorL.getLong(i3);
                    int i4 = iY13;
                    int i5 = iY15;
                    long j7 = cursorL.getLong(i5);
                    iY15 = i5;
                    int i6 = iY16;
                    boolean z = cursorL.getInt(i6) != 0;
                    iY16 = i6;
                    int i7 = iY17;
                    x xVarB = a.B(cursorL.getInt(i7));
                    iY17 = i7;
                    int i8 = iY18;
                    int i9 = cursorL.getInt(i8);
                    iY18 = i8;
                    int i10 = iY19;
                    int i11 = cursorL.getInt(i10);
                    iY19 = i10;
                    int i12 = iY20;
                    r rVarA = a.A(cursorL.getInt(i12));
                    iY20 = i12;
                    int i13 = iY21;
                    boolean z2 = cursorL.getInt(i13) != 0;
                    iY21 = i13;
                    int i14 = iY22;
                    boolean z3 = cursorL.getInt(i14) != 0;
                    iY22 = i14;
                    int i15 = iY23;
                    boolean z4 = cursorL.getInt(i15) != 0;
                    iY23 = i15;
                    int i16 = iY24;
                    boolean z5 = cursorL.getInt(i16) != 0;
                    iY24 = i16;
                    int i17 = iY25;
                    long j8 = cursorL.getLong(i17);
                    iY25 = i17;
                    int i18 = iY26;
                    long j9 = cursorL.getLong(i18);
                    iY26 = i18;
                    int i19 = iY27;
                    if (!cursorL.isNull(i19)) {
                        blob = cursorL.getBlob(i19);
                    }
                    iY27 = i19;
                    arrayList.add(new p(string, yVarC, string2, string3, gVarA, gVarA2, j, j2, j3, new e(rVarA, z2, z3, z4, z5, j8, j9, a.m(blob)), i2, aVarZ, j4, j5, j6, j7, z, xVarB, i9, i11));
                    iY13 = i4;
                    i = i3;
                }
                cursorL.close();
                vVar.c();
                ArrayList arrayListI = qVarB.i();
                ArrayList arrayListG = qVarB.g();
                if (arrayList.isEmpty()) {
                    iVar = iVarY;
                    lVar = lVarZ;
                    sVar = sVarC;
                } else {
                    com.gamericefishpro.space.l6.q qVarC = com.gamericefishpro.space.l6.q.c();
                    int i20 = b.a;
                    qVarC.getClass();
                    com.gamericefishpro.space.l6.q qVarC2 = com.gamericefishpro.space.l6.q.c();
                    iVar = iVarY;
                    lVar = lVarZ;
                    sVar = sVarC;
                    b.a(lVar, sVar, iVar, arrayList);
                    qVarC2.getClass();
                }
                if (!arrayListI.isEmpty()) {
                    com.gamericefishpro.space.l6.q qVarC3 = com.gamericefishpro.space.l6.q.c();
                    int i21 = b.a;
                    qVarC3.getClass();
                    com.gamericefishpro.space.l6.q qVarC4 = com.gamericefishpro.space.l6.q.c();
                    b.a(lVar, sVar, iVar, arrayListI);
                    qVarC4.getClass();
                }
                if (!arrayListG.isEmpty()) {
                    com.gamericefishpro.space.l6.q qVarC5 = com.gamericefishpro.space.l6.q.c();
                    int i22 = b.a;
                    qVarC5.getClass();
                    com.gamericefishpro.space.l6.q qVarC6 = com.gamericefishpro.space.l6.q.c();
                    b.a(lVar, sVar, iVar, arrayListG);
                    qVarC6.getClass();
                }
                n nVarA = com.gamericefishpro.space.l6.o.a();
                Intrinsics.checkNotNullExpressionValue(nVarA, "success()");
                return nVarA;
            } catch (Throwable th) {
                th = th;
                cursorL.close();
                vVar.c();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            vVar = vVarB;
        }
    }
}
