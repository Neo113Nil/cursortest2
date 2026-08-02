package defpackage;

import androidx.compose.foundation.layout.d;
import androidx.compose.foundation.lazy.a;
import com.connectsdk.device.ConnectableDevice;
import defpackage.hmm;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class cv0 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ cv0(int i, int i2) {
        this.a = i2;
        this.b = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        cko D0;
        int i;
        int i2;
        Integer valueOf;
        Boolean bool;
        int i3 = this.a;
        final int i4 = this.b;
        switch (i3) {
            case 0:
                return Boolean.valueOf(((yxc) obj).b == i4);
            case 1:
                ((Integer) obj).intValue();
                throw new IndexOutOfBoundsException(hrg.o("Collection doesn't contain element at index ", i4, '.'));
            case 2:
                lpi lpiVar = (lpi) obj;
                lpiVar.getClass();
                lpiVar.h(new hmm.a("like_count"), Integer.valueOf(i4));
                return Unit.a;
            case 3:
                jfp jfpVar = (jfp) obj;
                jfpVar.getClass();
                wfp.j(jfpVar, new my4(i4, 1, 1, 1));
                return Unit.a;
            case 4:
                vuf vufVar = (vuf) obj;
                vufVar.getClass();
                vufVar.Z(Integer.MAX_VALUE, null, vsf.v, new wn5(new ryc() { // from class: grj
                    @Override // defpackage.ryc
                    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                        ((Integer) obj3).getClass();
                        hq5 hq5Var = (hq5) obj4;
                        int intValue = ((Integer) obj5).intValue();
                        ((a) obj2).getClass();
                        oq5 oq5Var = (oq5) hq5Var;
                        if (oq5Var.P(intValue & 1, (intValue & 129) != 128)) {
                            irf.r(a0g.E(i4, 0, oq5Var), null, d.d(d.e(vci.a, 164), 1.0f), null, hd6.c, 0.0f, null, oq5Var, 25008, 104);
                        } else {
                            oq5Var.S();
                        }
                        return Unit.a;
                    }
                }, 747450749, true));
                return Unit.a;
            case 5:
                xjo xjoVar = (xjo) obj;
                xjoVar.getClass();
                D0 = xjoVar.D0("SELECT * FROM phonotekaSyncSavedTrack WHERE track_list_type = ?");
                try {
                    D0.bindLong(1, i4);
                    int v = s7g.v(D0, "_id");
                    int v2 = s7g.v(D0, "track_id");
                    int v3 = s7g.v(D0, "album_id");
                    int v4 = s7g.v(D0, "timestamp");
                    int v5 = s7g.v(D0, "track_list_type");
                    ArrayList arrayList = new ArrayList();
                    while (D0.q()) {
                        arrayList.add(new drk((int) D0.getLong(v5), D0.getLong(v), D0.x0(v2), D0.isNull(v3) ? null : D0.x0(v3), D0.isNull(v4) ? null : D0.x0(v4)));
                    }
                    return arrayList;
                } finally {
                }
            case 6:
                xjo xjoVar2 = (xjo) obj;
                xjoVar2.getClass();
                D0 = xjoVar2.D0("SELECT * FROM pre_saves WHERE is_pre_saved = 1 ORDER BY pre_save_date DESC LIMIT ?");
                try {
                    D0.bindLong(1, i4);
                    int v6 = s7g.v(D0, "original_id");
                    int v7 = s7g.v(D0, "artists");
                    int v8 = s7g.v(D0, "release_date");
                    int v9 = s7g.v(D0, "pre_save_date");
                    int v10 = s7g.v(D0, "milliseconds_until_release");
                    int v11 = s7g.v(D0, "cover_uri");
                    int v12 = s7g.v(D0, "title");
                    int v13 = s7g.v(D0, "type_raw");
                    int v14 = s7g.v(D0, "warning_content");
                    int v15 = s7g.v(D0, "is_pre_saved");
                    int v16 = s7g.v(D0, "available");
                    int v17 = s7g.v(D0, "disclaimers");
                    ArrayList arrayList2 = new ArrayList();
                    while (D0.q()) {
                        int i5 = v6;
                        int i6 = v7;
                        arrayList2.add(new alm(D0.x0(v6), D0.x0(v7), D0.x0(v8), D0.x0(v9), D0.getLong(v10), D0.x0(v11), D0.isNull(v12) ? null : D0.x0(v12), D0.isNull(v13) ? null : D0.x0(v13), D0.x0(v14), ((int) D0.getLong(v15)) != 0, ((int) D0.getLong(v16)) != 0, D0.isNull(v17) ? null : D0.x0(v17)));
                        v6 = i5;
                        v7 = i6;
                    }
                    return arrayList2;
                } finally {
                }
            case 7:
                ((ksk) obj).getClass();
                return Integer.valueOf(i4);
            case 8:
                ((jx7) obj).getClass();
                return new wpe(xv.t(i4, 0));
            default:
                xjo xjoVar3 = (xjo) obj;
                xjoVar3.getClass();
                D0 = xjoVar3.D0("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND LENGTH(content_uri_triggers)=0 AND state NOT IN (2, 3, 5))");
                try {
                    D0.bindLong(1, i4);
                    int v18 = s7g.v(D0, ConnectableDevice.KEY_ID);
                    int v19 = s7g.v(D0, "state");
                    int v20 = s7g.v(D0, "worker_class_name");
                    int v21 = s7g.v(D0, "input_merger_class_name");
                    int v22 = s7g.v(D0, "input");
                    int v23 = s7g.v(D0, "output");
                    int v24 = s7g.v(D0, "initial_delay");
                    int v25 = s7g.v(D0, "interval_duration");
                    int v26 = s7g.v(D0, "flex_duration");
                    int v27 = s7g.v(D0, "run_attempt_count");
                    int v28 = s7g.v(D0, "backoff_policy");
                    int v29 = s7g.v(D0, "backoff_delay_duration");
                    int v30 = s7g.v(D0, "last_enqueue_time");
                    int v31 = s7g.v(D0, "minimum_retention_duration");
                    int v32 = s7g.v(D0, "schedule_requested_at");
                    int v33 = s7g.v(D0, "run_in_foreground");
                    int v34 = s7g.v(D0, "out_of_quota_policy");
                    int v35 = s7g.v(D0, "period_count");
                    int v36 = s7g.v(D0, "generation");
                    int v37 = s7g.v(D0, "next_schedule_time_override");
                    int v38 = s7g.v(D0, "next_schedule_time_override_generation");
                    int v39 = s7g.v(D0, "stop_reason");
                    int v40 = s7g.v(D0, "trace_tag");
                    int v41 = s7g.v(D0, "backoff_on_system_interruptions");
                    int v42 = s7g.v(D0, "required_network_type");
                    int v43 = s7g.v(D0, "required_network_request");
                    int v44 = s7g.v(D0, "requires_charging");
                    int v45 = s7g.v(D0, "requires_device_idle");
                    int v46 = s7g.v(D0, "requires_battery_not_low");
                    int v47 = s7g.v(D0, "requires_storage_not_low");
                    int v48 = s7g.v(D0, "trigger_content_update_delay");
                    int v49 = s7g.v(D0, "trigger_max_content_delay");
                    int v50 = s7g.v(D0, "content_uri_triggers");
                    ArrayList arrayList3 = new ArrayList();
                    while (D0.q()) {
                        String x0 = D0.x0(v18);
                        int i7 = v18;
                        ArrayList arrayList4 = arrayList3;
                        c4w I = ezf.I((int) D0.getLong(v19));
                        String x02 = D0.x0(v20);
                        String x03 = D0.x0(v21);
                        byte[] blob = D0.getBlob(v22);
                        q97 q97Var = q97.b;
                        q97 Q = cxb.Q(blob);
                        q97 Q2 = cxb.Q(D0.getBlob(v23));
                        long j = D0.getLong(v24);
                        long j2 = D0.getLong(v25);
                        long j3 = D0.getLong(v26);
                        int i8 = (int) D0.getLong(v27);
                        bk2 F = ezf.F((int) D0.getLong(v28));
                        long j4 = D0.getLong(v29);
                        long j5 = D0.getLong(v30);
                        long j6 = D0.getLong(v31);
                        int i9 = v32;
                        long j7 = D0.getLong(i9);
                        int i10 = v29;
                        int i11 = v33;
                        int i12 = v31;
                        boolean z = ((int) D0.getLong(i11)) != 0;
                        int i13 = v34;
                        nxj H = ezf.H((int) D0.getLong(i13));
                        int i14 = v35;
                        int i15 = (int) D0.getLong(i14);
                        int i16 = v36;
                        int i17 = (int) D0.getLong(i16);
                        int i18 = v37;
                        long j8 = D0.getLong(i18);
                        int i19 = v38;
                        int i20 = (int) D0.getLong(i19);
                        int i21 = v39;
                        int i22 = (int) D0.getLong(i21);
                        int i23 = v40;
                        String x04 = D0.isNull(i23) ? null : D0.x0(i23);
                        int i24 = v41;
                        if (D0.isNull(i24)) {
                            i = i23;
                            i2 = i21;
                            valueOf = null;
                        } else {
                            i = i23;
                            i2 = i21;
                            valueOf = Integer.valueOf((int) D0.getLong(i24));
                        }
                        if (valueOf != null) {
                            bool = Boolean.valueOf(valueOf.intValue() != 0);
                        } else {
                            bool = null;
                        }
                        int i25 = v42;
                        g2j G = ezf.G((int) D0.getLong(i25));
                        int i26 = v43;
                        f1j U = ezf.U(D0.getBlob(i26));
                        int i27 = v44;
                        boolean z2 = ((int) D0.getLong(i27)) != 0;
                        int i28 = v45;
                        boolean z3 = ((int) D0.getLong(i28)) != 0;
                        int i29 = v46;
                        boolean z4 = ((int) D0.getLong(i29)) != 0;
                        int i30 = v47;
                        int i31 = v48;
                        int i32 = v49;
                        v48 = i31;
                        int i33 = v50;
                        t4w t4wVar = new t4w(x0, I, x02, x03, Q, Q2, j, j2, j3, new fa6(U, G, z2, z3, z4, ((int) D0.getLong(i30)) != 0, D0.getLong(i31), D0.getLong(i32), ezf.u(D0.getBlob(i33))), i8, F, j4, j5, j6, j7, z, H, i15, i17, j8, i20, i22, x04, bool);
                        v50 = i33;
                        v49 = i32;
                        arrayList3 = arrayList4;
                        arrayList3.add(t4wVar);
                        v29 = i10;
                        v32 = i9;
                        v42 = i25;
                        v44 = i27;
                        v46 = i29;
                        v47 = i30;
                        v45 = i28;
                        v31 = i12;
                        v33 = i11;
                        v34 = i13;
                        v35 = i14;
                        v36 = i16;
                        v37 = i18;
                        v38 = i19;
                        v39 = i2;
                        v40 = i;
                        v41 = i24;
                        v43 = i26;
                        v18 = i7;
                    }
                    return arrayList3;
                } catch (Throwable th) {
                    throw th;
                }
        }
    }
}
