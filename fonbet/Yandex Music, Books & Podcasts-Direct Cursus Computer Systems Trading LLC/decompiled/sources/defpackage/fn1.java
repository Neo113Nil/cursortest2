package defpackage;

import androidx.compose.foundation.a;
import com.connectsdk.device.ConnectableDevice;
import com.yandex.passport.internal.database.diary.f;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final /* synthetic */ class fn1 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;

    public /* synthetic */ fn1(long j, int i) {
        this.a = i;
        this.b = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        cko D0;
        int i;
        int i2;
        Integer valueOf;
        Boolean bool;
        int i3 = this.a;
        long j = this.b;
        switch (i3) {
            case 0:
                jpa jpaVar = (jpa) obj;
                jpaVar.getClass();
                long j2 = this.b;
                long b = d85.b(j2, 0.0f, 0.0f, 0.0f, 0.0f, 14);
                long b2 = d85.b(j2, 1.0f, 0.0f, 0.0f, 0.0f, 14);
                jpa.A0(jpaVar, y9w.U(new Pair[]{new Pair(Float.valueOf(0.0f), new d85(b)), new Pair(Float.valueOf(0.4f), new d85(b)), new Pair(Float.valueOf(0.74f), new d85(b2)), new Pair(Float.valueOf(1.0f), new d85(b2))}, 14), 0L, 0L, 0.0f, null, null, 0, 126);
                return Unit.a;
            case 1:
                yci yciVar = (yci) obj;
                yciVar.getClass();
                return a.b(yciVar, j, vnj.i);
            case 2:
                np3 np3Var = (np3) obj;
                np3Var.getClass();
                return np3Var.b(new fn1(j, 3));
            case 3:
                opf opfVar = (opf) obj;
                opfVar.getClass();
                opfVar.a();
                jpa.B(opfVar, this.b, 0L, 0L, 0.0f, null, 0, 126);
                return Unit.a;
            case 4:
                opf opfVar2 = (opf) obj;
                opfVar2.getClass();
                jpa.B(opfVar2, this.b, 0L, 0L, 0.0f, null, 0, 126);
                opfVar2.a();
                return Unit.a;
            case 5:
                return Long.valueOf(j);
            case 6:
                np3 np3Var2 = (np3) obj;
                np3Var2.getClass();
                Float valueOf2 = Float.valueOf(0.0f);
                long j3 = d85.m;
                Pair pair = new Pair(valueOf2, new d85(j3));
                Pair pair2 = new Pair(Float.valueOf(0.37f), new d85(j3));
                Float valueOf3 = Float.valueOf(0.7f);
                long j4 = this.b;
                return np3Var2.b(new g83(y9w.U(new Pair[]{pair, pair2, new Pair(valueOf3, new d85(d85.b(j4, 0.33f, 0.0f, 0.0f, 0.0f, 14))), new Pair(Float.valueOf(1.0f), new d85(d85.b(j4, 0.67f, 0.0f, 0.0f, 0.0f, 14)))}, 14), 9));
            case 7:
                jpa jpaVar2 = (jpa) obj;
                jpaVar2.getClass();
                long j5 = this.b;
                float f = 4;
                jpa.q(jpaVar2, new afn(u75.h(new d85(d85.b(j5, 0.4f, 0.0f, 0.0f, 0.0f, 14)), new d85(d85.b(j5, 0.0f, 0.0f, 0.0f, 0.0f, 14))), null, enj.a(0.0f, Float.intBitsToFloat((int) (jpaVar2.e() & 4294967295L)) / f, 1, jpaVar2.y0()), nmq.c(jpaVar2.e())), nmq.c(jpaVar2.e()), enj.a(0.0f, Float.intBitsToFloat((int) (jpaVar2.e() & 4294967295L)) / f, 1, jpaVar2.y0()), 0.0f, null, 120);
                return Unit.a;
            case 8:
                xjo xjoVar = (xjo) obj;
                xjoVar.getClass();
                D0 = xjoVar.D0("DELETE FROM playlist_track WHERE _id = ?");
                try {
                    D0.bindLong(1, j);
                    D0.q();
                    D0.close();
                    return Unit.a;
                } finally {
                }
            case 9:
                xjo xjoVar2 = (xjo) obj;
                xjoVar2.getClass();
                D0 = xjoVar2.D0("SELECT * FROM playlist_track WHERE _id = ? ");
                try {
                    D0.bindLong(1, j);
                    return D0.q() ? new j2m(D0.getLong(s7g.v(D0, "_id")), D0.getLong(s7g.v(D0, "playlist_id")), D0.x0(s7g.v(D0, "track_id")), D0.x0(s7g.v(D0, "album_id")), D0.x0(s7g.v(D0, "timestamp")), (int) D0.getLong(s7g.v(D0, "position"))) : null;
                } finally {
                }
            case 10:
                xjo xjoVar3 = (xjo) obj;
                xjoVar3.getClass();
                D0 = xjoVar3.D0("SELECT COALESCE(MAX(position), 0) FROM playlist_track WHERE playlist_id = ?");
                try {
                    D0.bindLong(1, j);
                    int i4 = D0.q() ? (int) D0.getLong(0) : 0;
                    D0.close();
                    return Integer.valueOf(i4);
                } finally {
                }
            case 11:
                xjo xjoVar4 = (xjo) obj;
                xjoVar4.getClass();
                D0 = xjoVar4.D0("DELETE FROM playlist_track WHERE playlist_id = ?");
                try {
                    D0.bindLong(1, j);
                    D0.q();
                    D0.close();
                    return Unit.a;
                } finally {
                }
            case 12:
                xjo xjoVar5 = (xjo) obj;
                xjoVar5.getClass();
                D0 = xjoVar5.D0("SELECT * FROM playlist_track WHERE playlist_id = ? ORDER BY timestamp DESC, position");
                try {
                    D0.bindLong(1, j);
                    int v = s7g.v(D0, "_id");
                    int v2 = s7g.v(D0, "playlist_id");
                    int v3 = s7g.v(D0, "track_id");
                    int v4 = s7g.v(D0, "album_id");
                    int v5 = s7g.v(D0, "timestamp");
                    int v6 = s7g.v(D0, "position");
                    ArrayList arrayList = new ArrayList();
                    while (D0.q()) {
                        arrayList.add(new j2m(D0.getLong(v), D0.getLong(v2), D0.x0(v3), D0.x0(v4), D0.x0(v5), (int) D0.getLong(v6)));
                    }
                    return arrayList;
                } finally {
                }
            case 13:
                xjo xjoVar6 = (xjo) obj;
                xjoVar6.getClass();
                D0 = xjoVar6.D0("SELECT * FROM playlist_track WHERE playlist_id = ? ");
                try {
                    D0.bindLong(1, j);
                    int v7 = s7g.v(D0, "_id");
                    int v8 = s7g.v(D0, "playlist_id");
                    int v9 = s7g.v(D0, "track_id");
                    int v10 = s7g.v(D0, "album_id");
                    int v11 = s7g.v(D0, "timestamp");
                    int v12 = s7g.v(D0, "position");
                    ArrayList arrayList2 = new ArrayList();
                    while (D0.q()) {
                        arrayList2.add(new j2m(D0.getLong(v7), D0.getLong(v8), D0.x0(v9), D0.x0(v10), D0.x0(v11), (int) D0.getLong(v12)));
                    }
                    return arrayList2;
                } finally {
                }
            case 14:
                xjo xjoVar7 = (xjo) obj;
                xjoVar7.getClass();
                D0 = xjoVar7.D0("DELETE FROM playlist WHERE _id=?");
                try {
                    D0.bindLong(1, j);
                    D0.q();
                    D0.close();
                    return Unit.a;
                } finally {
                }
            case 15:
                xjo xjoVar8 = (xjo) obj;
                xjoVar8.getClass();
                D0 = xjoVar8.D0("DELETE FROM track_operation WHERE playlist_id = ?");
                try {
                    D0.bindLong(1, j);
                    D0.q();
                    D0.close();
                    return Unit.a;
                } finally {
                }
            case 16:
                opf opfVar3 = (opf) obj;
                opfVar3.getClass();
                jpa.u(opfVar3, this.b, 0L, 0L, 254);
                opfVar3.a();
                return Unit.a;
            case 17:
                xjo xjoVar9 = (xjo) obj;
                xjoVar9.getClass();
                D0 = xjoVar9.D0("SELECT * FROM workspec WHERE last_enqueue_time >= ? AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC");
                try {
                    D0.bindLong(1, j);
                    int v13 = s7g.v(D0, ConnectableDevice.KEY_ID);
                    int v14 = s7g.v(D0, "state");
                    int v15 = s7g.v(D0, "worker_class_name");
                    int v16 = s7g.v(D0, "input_merger_class_name");
                    int v17 = s7g.v(D0, "input");
                    int v18 = s7g.v(D0, "output");
                    int v19 = s7g.v(D0, "initial_delay");
                    int v20 = s7g.v(D0, "interval_duration");
                    int v21 = s7g.v(D0, "flex_duration");
                    int v22 = s7g.v(D0, "run_attempt_count");
                    int v23 = s7g.v(D0, "backoff_policy");
                    int v24 = s7g.v(D0, "backoff_delay_duration");
                    int v25 = s7g.v(D0, "last_enqueue_time");
                    int v26 = s7g.v(D0, "minimum_retention_duration");
                    int v27 = s7g.v(D0, "schedule_requested_at");
                    int v28 = s7g.v(D0, "run_in_foreground");
                    int v29 = s7g.v(D0, "out_of_quota_policy");
                    int v30 = s7g.v(D0, "period_count");
                    int v31 = s7g.v(D0, "generation");
                    int v32 = s7g.v(D0, "next_schedule_time_override");
                    int v33 = s7g.v(D0, "next_schedule_time_override_generation");
                    int v34 = s7g.v(D0, "stop_reason");
                    int v35 = s7g.v(D0, "trace_tag");
                    int v36 = s7g.v(D0, "backoff_on_system_interruptions");
                    int v37 = s7g.v(D0, "required_network_type");
                    int v38 = s7g.v(D0, "required_network_request");
                    int v39 = s7g.v(D0, "requires_charging");
                    int v40 = s7g.v(D0, "requires_device_idle");
                    int v41 = s7g.v(D0, "requires_battery_not_low");
                    int v42 = s7g.v(D0, "requires_storage_not_low");
                    int v43 = s7g.v(D0, "trigger_content_update_delay");
                    int v44 = s7g.v(D0, "trigger_max_content_delay");
                    int v45 = s7g.v(D0, "content_uri_triggers");
                    ArrayList arrayList3 = new ArrayList();
                    while (D0.q()) {
                        String x0 = D0.x0(v13);
                        int i5 = v13;
                        ArrayList arrayList4 = arrayList3;
                        c4w I = ezf.I((int) D0.getLong(v14));
                        String x02 = D0.x0(v15);
                        String x03 = D0.x0(v16);
                        byte[] blob = D0.getBlob(v17);
                        q97 q97Var = q97.b;
                        q97 Q = cxb.Q(blob);
                        q97 Q2 = cxb.Q(D0.getBlob(v18));
                        long j6 = D0.getLong(v19);
                        long j7 = D0.getLong(v20);
                        long j8 = D0.getLong(v21);
                        int i6 = (int) D0.getLong(v22);
                        bk2 F = ezf.F((int) D0.getLong(v23));
                        long j9 = D0.getLong(v24);
                        long j10 = D0.getLong(v25);
                        long j11 = D0.getLong(v26);
                        int i7 = v27;
                        long j12 = D0.getLong(i7);
                        int i8 = v14;
                        int i9 = v28;
                        int i10 = v15;
                        boolean z = ((int) D0.getLong(i9)) != 0;
                        int i11 = v29;
                        nxj H = ezf.H((int) D0.getLong(i11));
                        int i12 = v30;
                        int i13 = (int) D0.getLong(i12);
                        int i14 = v31;
                        int i15 = (int) D0.getLong(i14);
                        int i16 = v32;
                        long j13 = D0.getLong(i16);
                        int i17 = v33;
                        int i18 = (int) D0.getLong(i17);
                        int i19 = v34;
                        int i20 = (int) D0.getLong(i19);
                        int i21 = v35;
                        String x04 = D0.isNull(i21) ? null : D0.x0(i21);
                        int i22 = v36;
                        if (D0.isNull(i22)) {
                            i = i21;
                            i2 = i19;
                            valueOf = null;
                        } else {
                            i = i21;
                            i2 = i19;
                            valueOf = Integer.valueOf((int) D0.getLong(i22));
                        }
                        if (valueOf != null) {
                            bool = Boolean.valueOf(valueOf.intValue() != 0);
                        } else {
                            bool = null;
                        }
                        int i23 = v37;
                        g2j G = ezf.G((int) D0.getLong(i23));
                        int i24 = v38;
                        f1j U = ezf.U(D0.getBlob(i24));
                        int i25 = v39;
                        boolean z2 = ((int) D0.getLong(i25)) != 0;
                        int i26 = v40;
                        boolean z3 = ((int) D0.getLong(i26)) != 0;
                        int i27 = v41;
                        boolean z4 = ((int) D0.getLong(i27)) != 0;
                        int i28 = v42;
                        int i29 = v43;
                        int i30 = v44;
                        v43 = i29;
                        int i31 = v45;
                        t4w t4wVar = new t4w(x0, I, x02, x03, Q, Q2, j6, j7, j8, new fa6(U, G, z2, z3, z4, ((int) D0.getLong(i28)) != 0, D0.getLong(i29), D0.getLong(i30), ezf.u(D0.getBlob(i31))), i6, F, j9, j10, j11, j12, z, H, i13, i15, j13, i18, i20, x04, bool);
                        v45 = i31;
                        v44 = i30;
                        arrayList3 = arrayList4;
                        arrayList3.add(t4wVar);
                        v14 = i8;
                        v27 = i7;
                        v37 = i23;
                        v39 = i25;
                        v41 = i27;
                        v42 = i28;
                        v40 = i26;
                        v15 = i10;
                        v28 = i9;
                        v29 = i11;
                        v30 = i12;
                        v31 = i14;
                        v32 = i16;
                        v33 = i17;
                        v34 = i2;
                        v35 = i;
                        v36 = i22;
                        v38 = i24;
                        v13 = i5;
                    }
                    return arrayList3;
                } catch (Throwable th) {
                    throw th;
                }
            case 18:
                D0 = ((xjo) obj).D0("SELECT * from diary_upload WHERE id = ?");
                try {
                    D0.bindLong(1, j);
                    return D0.q() ? new f(D0.getLong(s7g.v(D0, ConnectableDevice.KEY_ID)), D0.getLong(s7g.v(D0, "uploadedAt"))) : null;
                } finally {
                }
            case 19:
                D0 = ((xjo) obj).D0("DELETE FROM diary_method WHERE uploadId is not null AND issuedAt <= ?");
                try {
                    D0.bindLong(1, j);
                    D0.q();
                    return null;
                } finally {
                }
            case 20:
                D0 = ((xjo) obj).D0("DELETE FROM diary_parameter WHERE uploadId is not null AND issuedAt <= ?");
                try {
                    D0.bindLong(1, j);
                    D0.q();
                    return null;
                } finally {
                }
            case 21:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                return Boolean.valueOf(((Number) entry.getValue()).longValue() < j);
            default:
                Map.Entry entry2 = (Map.Entry) obj;
                entry2.getClass();
                return Boolean.valueOf(((com.yandex.plus.pay.graphql.analytics.a) entry2.getValue()).c < j);
        }
    }
}
