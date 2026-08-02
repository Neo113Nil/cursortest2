package defpackage;

import androidx.compose.animation.a;
import androidx.compose.animation.c;
import com.connectsdk.device.ConnectableDevice;
import com.yandex.music.shared.wizard3.network.WizardApi;
import com.yandex.pulse.metrics.o;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ru.yandex.music.YMApplication;

/* loaded from: classes4.dex */
public final /* synthetic */ class jwv implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ jwv(int i) {
        this.a = i;
    }

    private final Object a(Object obj) {
        xjo xjoVar = (xjo) obj;
        xjoVar.getClass();
        cko D0 = xjoVar.D0("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1");
        try {
            boolean z = false;
            if (D0.q()) {
                if (((int) D0.getLong(0)) != 0) {
                    z = true;
                }
            }
            D0.close();
            return Boolean.valueOf(z);
        } catch (Throwable th) {
            D0.close();
            throw th;
        }
    }

    private final Object d(Object obj) {
        int i;
        Integer valueOf;
        xjo xjoVar = (xjo) obj;
        xjoVar.getClass();
        cko D0 = xjoVar.D0("SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?");
        try {
            D0.bindLong(1, 200);
            int v = s7g.v(D0, ConnectableDevice.KEY_ID);
            int v2 = s7g.v(D0, "state");
            int v3 = s7g.v(D0, "worker_class_name");
            int v4 = s7g.v(D0, "input_merger_class_name");
            int v5 = s7g.v(D0, "input");
            int v6 = s7g.v(D0, "output");
            int v7 = s7g.v(D0, "initial_delay");
            int v8 = s7g.v(D0, "interval_duration");
            int v9 = s7g.v(D0, "flex_duration");
            int v10 = s7g.v(D0, "run_attempt_count");
            int v11 = s7g.v(D0, "backoff_policy");
            int v12 = s7g.v(D0, "backoff_delay_duration");
            int v13 = s7g.v(D0, "last_enqueue_time");
            int v14 = s7g.v(D0, "minimum_retention_duration");
            int v15 = s7g.v(D0, "schedule_requested_at");
            int v16 = s7g.v(D0, "run_in_foreground");
            int v17 = s7g.v(D0, "out_of_quota_policy");
            int v18 = s7g.v(D0, "period_count");
            int v19 = s7g.v(D0, "generation");
            int v20 = s7g.v(D0, "next_schedule_time_override");
            int v21 = s7g.v(D0, "next_schedule_time_override_generation");
            int v22 = s7g.v(D0, "stop_reason");
            int v23 = s7g.v(D0, "trace_tag");
            int v24 = s7g.v(D0, "backoff_on_system_interruptions");
            int v25 = s7g.v(D0, "required_network_type");
            int v26 = s7g.v(D0, "required_network_request");
            int v27 = s7g.v(D0, "requires_charging");
            int v28 = s7g.v(D0, "requires_device_idle");
            int v29 = s7g.v(D0, "requires_battery_not_low");
            int v30 = s7g.v(D0, "requires_storage_not_low");
            int v31 = s7g.v(D0, "trigger_content_update_delay");
            int v32 = s7g.v(D0, "trigger_max_content_delay");
            int v33 = s7g.v(D0, "content_uri_triggers");
            ArrayList arrayList = new ArrayList();
            while (D0.q()) {
                String x0 = D0.x0(v);
                int i2 = v13;
                int i3 = v14;
                c4w I = ezf.I((int) D0.getLong(v2));
                String x02 = D0.x0(v3);
                String x03 = D0.x0(v4);
                byte[] blob = D0.getBlob(v5);
                q97 q97Var = q97.b;
                q97 Q = cxb.Q(blob);
                q97 Q2 = cxb.Q(D0.getBlob(v6));
                long j = D0.getLong(v7);
                long j2 = D0.getLong(v8);
                long j3 = D0.getLong(v9);
                int i4 = (int) D0.getLong(v10);
                int i5 = v;
                int i6 = v2;
                bk2 F = ezf.F((int) D0.getLong(v11));
                long j4 = D0.getLong(v12);
                long j5 = D0.getLong(i2);
                long j6 = D0.getLong(i3);
                int i7 = v15;
                long j7 = D0.getLong(i7);
                v15 = i7;
                int i8 = v16;
                int i9 = v3;
                boolean z = ((int) D0.getLong(i8)) != 0;
                int i10 = v17;
                int i11 = v4;
                nxj H = ezf.H((int) D0.getLong(i10));
                int i12 = v18;
                int i13 = (int) D0.getLong(i12);
                int i14 = v19;
                int i15 = (int) D0.getLong(i14);
                int i16 = v20;
                long j8 = D0.getLong(i16);
                int i17 = v21;
                int i18 = (int) D0.getLong(i17);
                v21 = i17;
                int i19 = v22;
                int i20 = (int) D0.getLong(i19);
                int i21 = v23;
                Boolean bool = null;
                String x04 = D0.isNull(i21) ? null : D0.x0(i21);
                int i22 = v24;
                if (D0.isNull(i22)) {
                    i = i21;
                    v22 = i19;
                    valueOf = null;
                } else {
                    i = i21;
                    v22 = i19;
                    valueOf = Integer.valueOf((int) D0.getLong(i22));
                }
                if (valueOf != null) {
                    bool = Boolean.valueOf(valueOf.intValue() != 0);
                }
                Boolean bool2 = bool;
                int i23 = v25;
                g2j G = ezf.G((int) D0.getLong(i23));
                int i24 = v26;
                f1j U = ezf.U(D0.getBlob(i24));
                int i25 = v27;
                boolean z2 = ((int) D0.getLong(i25)) != 0;
                int i26 = v28;
                boolean z3 = ((int) D0.getLong(i26)) != 0;
                int i27 = v29;
                boolean z4 = ((int) D0.getLong(i27)) != 0;
                v29 = i27;
                int i28 = v30;
                int i29 = v31;
                int i30 = v32;
                v31 = i29;
                int i31 = v33;
                arrayList.add(new t4w(x0, I, x02, x03, Q, Q2, j, j2, j3, new fa6(U, G, z2, z3, z4, ((int) D0.getLong(i28)) != 0, D0.getLong(i29), D0.getLong(i30), ezf.u(D0.getBlob(i31))), i4, F, j4, j5, j6, j7, z, H, i13, i15, j8, i18, i20, x04, bool2));
                v28 = i26;
                v4 = i11;
                v17 = i10;
                v18 = i12;
                v19 = i14;
                v20 = i16;
                v23 = i;
                v24 = i22;
                v25 = i23;
                v26 = i24;
                v27 = i25;
                v33 = i31;
                v32 = i30;
                v30 = i28;
                v = i5;
                v3 = i9;
                v13 = i2;
                v14 = i3;
                v2 = i6;
                v16 = i8;
            }
            D0.close();
            return arrayList;
        } catch (Throwable th) {
            D0.close();
            throw th;
        }
    }

    private final Object g(Object obj) {
        xjo xjoVar = (xjo) obj;
        xjoVar.getClass();
        cko D0 = xjoVar.D0("UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)");
        try {
            D0.q();
            int L = gut.L(xjoVar);
            D0.close();
            return Integer.valueOf(L);
        } catch (Throwable th) {
            D0.close();
            throw th;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        cko D0;
        Integer valueOf;
        Boolean bool;
        Integer valueOf2;
        Boolean bool2;
        Integer valueOf3;
        Boolean bool3;
        switch (this.a) {
            case 0:
                rwv rwvVar = (rwv) obj;
                rwvVar.getClass();
                return Boolean.valueOf(rwvVar == rwv.b);
            case 1:
                return Integer.valueOf(((Integer) obj).intValue() / 2);
            case 2:
                l13 l13Var = (l13) obj;
                l13Var.getClass();
                return new n0w((WizardApi) l13Var.a.D(hag.I(WizardApi.class), l13Var, l13Var.b));
            case 3:
                l13 l13Var2 = (l13) obj;
                l13Var2.getClass();
                return new oxv(l13Var2);
            case 4:
                jfp jfpVar = (jfp) obj;
                jfpVar.getClass();
                wfp.w(jfpVar);
                wfp.x(jfpVar, 1.0f);
                return Unit.a;
            case 5:
                jfp jfpVar2 = (jfp) obj;
                jfpVar2.getClass();
                wfp.w(jfpVar2);
                wfp.x(jfpVar2, 0.0f);
                return Unit.a;
            case 6:
                jfp jfpVar3 = (jfp) obj;
                jfpVar3.getClass();
                wfp.w(jfpVar3);
                wfp.x(jfpVar3, 2.0f);
                return Unit.a;
            case 7:
                ((geh) obj).getClass();
                return 1;
            case 8:
                ((jfp) obj).getClass();
                return Unit.a;
            case 9:
                ((hl0) obj).getClass();
                ov6 ov6Var = lya.c;
                e9b e = c.e(weo.S(300, 0, ov6Var, 2), 2);
                vpb f = c.f(weo.S(300, 0, ov6Var, 2), 2);
                int i = a.b;
                return new zd6(e, f);
            case 10:
                o18 o18Var = (o18) obj;
                vz1.e(o18Var, n9q.class).E(new jwv(11));
                o18Var.b(hag.I(mxv.class)).E(new jwv(12));
                o18Var.b(hag.I(v2w.class)).E(new jwv(13));
                return Unit.a;
            case 11:
                ((l13) obj).getClass();
                return new n9q(new dx5(2));
            case 12:
                return (mxv) ((n9q) vz1.l((l13) obj, n9q.class)).a.c(hag.I(mxv.class));
            case 13:
                l13 l13Var3 = (l13) obj;
                l13Var3.getClass();
                pzl pzlVar = ((n9q) l13Var3.a.D(hag.I(n9q.class), l13Var3, l13Var3.b)).a;
                bdt I = hag.I(oxv.class);
                qdc qdcVar = pzlVar.a;
                qdcVar.getClass();
                oxv oxvVar = (oxv) qdcVar.C(I);
                dq7 dq7Var = ca8.a;
                tf6 e2 = gld.e(mn7.d);
                l13 l13Var4 = oxvVar.a;
                return new v2w((n0w) l13Var4.a.D(hag.I(n0w.class), l13Var4, l13Var4.b), e2);
            case 14:
                o18 o18Var2 = (o18) obj;
                vz1.e(o18Var2, x2w.class).E(new jwv(15));
                o18Var2.b(hag.I(w0w.class)).D(new jwv(16));
                return Unit.a;
            case 15:
                ((l13) obj).getClass();
                return new x2w();
            case 16:
                ((l13) obj).getClass();
                return new w0w();
            case 17:
                s2w s2wVar = (s2w) obj;
                s2wVar.getClass();
                return s2wVar.b;
            case 18:
                return obj;
            case 19:
                q86 q86Var = (q86) obj;
                q86Var.getClass();
                return q86Var.getClass().getSimpleName();
            case 20:
                xjo xjoVar = (xjo) obj;
                xjoVar.getClass();
                D0 = xjoVar.D0("DELETE FROM WorkProgress");
                try {
                    D0.q();
                    D0.close();
                    return Unit.a;
                } finally {
                }
            case 21:
                xjo xjoVar2 = (xjo) obj;
                xjoVar2.getClass();
                D0 = xjoVar2.D0("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1");
                try {
                    int v = s7g.v(D0, ConnectableDevice.KEY_ID);
                    int v2 = s7g.v(D0, "state");
                    int v3 = s7g.v(D0, "worker_class_name");
                    int v4 = s7g.v(D0, "input_merger_class_name");
                    int v5 = s7g.v(D0, "input");
                    int v6 = s7g.v(D0, "output");
                    int v7 = s7g.v(D0, "initial_delay");
                    int v8 = s7g.v(D0, "interval_duration");
                    int v9 = s7g.v(D0, "flex_duration");
                    int v10 = s7g.v(D0, "run_attempt_count");
                    int v11 = s7g.v(D0, "backoff_policy");
                    int v12 = s7g.v(D0, "backoff_delay_duration");
                    int v13 = s7g.v(D0, "last_enqueue_time");
                    int v14 = s7g.v(D0, "minimum_retention_duration");
                    int v15 = s7g.v(D0, "schedule_requested_at");
                    int v16 = s7g.v(D0, "run_in_foreground");
                    int v17 = s7g.v(D0, "out_of_quota_policy");
                    int v18 = s7g.v(D0, "period_count");
                    int v19 = s7g.v(D0, "generation");
                    int v20 = s7g.v(D0, "next_schedule_time_override");
                    int v21 = s7g.v(D0, "next_schedule_time_override_generation");
                    int v22 = s7g.v(D0, "stop_reason");
                    int v23 = s7g.v(D0, "trace_tag");
                    int v24 = s7g.v(D0, "backoff_on_system_interruptions");
                    int v25 = s7g.v(D0, "required_network_type");
                    int v26 = s7g.v(D0, "required_network_request");
                    int v27 = s7g.v(D0, "requires_charging");
                    int v28 = s7g.v(D0, "requires_device_idle");
                    int v29 = s7g.v(D0, "requires_battery_not_low");
                    int v30 = s7g.v(D0, "requires_storage_not_low");
                    int v31 = s7g.v(D0, "trigger_content_update_delay");
                    int v32 = s7g.v(D0, "trigger_max_content_delay");
                    int v33 = s7g.v(D0, "content_uri_triggers");
                    ArrayList arrayList = new ArrayList();
                    while (D0.q()) {
                        String x0 = D0.x0(v);
                        int i2 = v14;
                        int i3 = v13;
                        c4w I2 = ezf.I((int) D0.getLong(v2));
                        String x02 = D0.x0(v3);
                        String x03 = D0.x0(v4);
                        byte[] blob = D0.getBlob(v5);
                        q97 q97Var = q97.b;
                        q97 Q = cxb.Q(blob);
                        q97 Q2 = cxb.Q(D0.getBlob(v6));
                        long j = D0.getLong(v7);
                        long j2 = D0.getLong(v8);
                        long j3 = D0.getLong(v9);
                        int i4 = (int) D0.getLong(v10);
                        int i5 = v5;
                        int i6 = v4;
                        bk2 F = ezf.F((int) D0.getLong(v11));
                        long j4 = D0.getLong(v12);
                        long j5 = D0.getLong(i3);
                        long j6 = D0.getLong(i2);
                        int i7 = v15;
                        long j7 = D0.getLong(i7);
                        v15 = i7;
                        int i8 = v16;
                        int i9 = v3;
                        boolean z = ((int) D0.getLong(i8)) != 0;
                        int i10 = v17;
                        int i11 = v2;
                        nxj H = ezf.H((int) D0.getLong(i10));
                        int i12 = v18;
                        int i13 = (int) D0.getLong(i12);
                        int i14 = v19;
                        int i15 = (int) D0.getLong(i14);
                        int i16 = v20;
                        long j8 = D0.getLong(i16);
                        int i17 = v21;
                        int i18 = (int) D0.getLong(i17);
                        v21 = i17;
                        int i19 = v22;
                        int i20 = (int) D0.getLong(i19);
                        int i21 = v23;
                        String x04 = D0.isNull(i21) ? null : D0.x0(i21);
                        int i22 = v24;
                        if (D0.isNull(i22)) {
                            v23 = i21;
                            v22 = i19;
                            valueOf = null;
                        } else {
                            v23 = i21;
                            v22 = i19;
                            valueOf = Integer.valueOf((int) D0.getLong(i22));
                        }
                        if (valueOf != null) {
                            bool = Boolean.valueOf(valueOf.intValue() != 0);
                        } else {
                            bool = null;
                        }
                        int i23 = v25;
                        g2j G = ezf.G((int) D0.getLong(i23));
                        int i24 = v26;
                        f1j U = ezf.U(D0.getBlob(i24));
                        int i25 = v27;
                        boolean z2 = ((int) D0.getLong(i25)) != 0;
                        int i26 = v28;
                        boolean z3 = ((int) D0.getLong(i26)) != 0;
                        int i27 = v29;
                        boolean z4 = ((int) D0.getLong(i27)) != 0;
                        v29 = i27;
                        int i28 = v30;
                        int i29 = v31;
                        int i30 = v32;
                        v31 = i29;
                        int i31 = v33;
                        arrayList.add(new t4w(x0, I2, x02, x03, Q, Q2, j, j2, j3, new fa6(U, G, z2, z3, z4, ((int) D0.getLong(i28)) != 0, D0.getLong(i29), D0.getLong(i30), ezf.u(D0.getBlob(i31))), i4, F, j4, j5, j6, j7, z, H, i13, i15, j8, i18, i20, x04, bool));
                        v28 = i26;
                        v2 = i11;
                        v17 = i10;
                        v18 = i12;
                        v19 = i14;
                        v20 = i16;
                        v24 = i22;
                        v25 = i23;
                        v26 = i24;
                        v27 = i25;
                        v33 = i31;
                        v32 = i30;
                        v30 = i28;
                        v4 = i6;
                        v3 = i9;
                        v13 = i3;
                        v14 = i2;
                        v5 = i5;
                        v16 = i8;
                    }
                    return arrayList;
                } finally {
                }
            case 22:
                xjo xjoVar3 = (xjo) obj;
                xjoVar3.getClass();
                D0 = xjoVar3.D0("SELECT * FROM workspec WHERE state=1");
                try {
                    int v34 = s7g.v(D0, ConnectableDevice.KEY_ID);
                    int v35 = s7g.v(D0, "state");
                    int v36 = s7g.v(D0, "worker_class_name");
                    int v37 = s7g.v(D0, "input_merger_class_name");
                    int v38 = s7g.v(D0, "input");
                    int v39 = s7g.v(D0, "output");
                    int v40 = s7g.v(D0, "initial_delay");
                    int v41 = s7g.v(D0, "interval_duration");
                    int v42 = s7g.v(D0, "flex_duration");
                    int v43 = s7g.v(D0, "run_attempt_count");
                    int v44 = s7g.v(D0, "backoff_policy");
                    int v45 = s7g.v(D0, "backoff_delay_duration");
                    int v46 = s7g.v(D0, "last_enqueue_time");
                    int v47 = s7g.v(D0, "minimum_retention_duration");
                    int v48 = s7g.v(D0, "schedule_requested_at");
                    int v49 = s7g.v(D0, "run_in_foreground");
                    int v50 = s7g.v(D0, "out_of_quota_policy");
                    int v51 = s7g.v(D0, "period_count");
                    int v52 = s7g.v(D0, "generation");
                    int v53 = s7g.v(D0, "next_schedule_time_override");
                    int v54 = s7g.v(D0, "next_schedule_time_override_generation");
                    int v55 = s7g.v(D0, "stop_reason");
                    int v56 = s7g.v(D0, "trace_tag");
                    int v57 = s7g.v(D0, "backoff_on_system_interruptions");
                    int v58 = s7g.v(D0, "required_network_type");
                    int v59 = s7g.v(D0, "required_network_request");
                    int v60 = s7g.v(D0, "requires_charging");
                    int v61 = s7g.v(D0, "requires_device_idle");
                    int v62 = s7g.v(D0, "requires_battery_not_low");
                    int v63 = s7g.v(D0, "requires_storage_not_low");
                    int v64 = s7g.v(D0, "trigger_content_update_delay");
                    int v65 = s7g.v(D0, "trigger_max_content_delay");
                    int v66 = s7g.v(D0, "content_uri_triggers");
                    ArrayList arrayList2 = new ArrayList();
                    while (D0.q()) {
                        String x05 = D0.x0(v34);
                        int i32 = v47;
                        int i33 = v46;
                        c4w I3 = ezf.I((int) D0.getLong(v35));
                        String x06 = D0.x0(v36);
                        String x07 = D0.x0(v37);
                        byte[] blob2 = D0.getBlob(v38);
                        q97 q97Var2 = q97.b;
                        q97 Q3 = cxb.Q(blob2);
                        q97 Q4 = cxb.Q(D0.getBlob(v39));
                        long j9 = D0.getLong(v40);
                        long j10 = D0.getLong(v41);
                        long j11 = D0.getLong(v42);
                        int i34 = (int) D0.getLong(v43);
                        int i35 = v38;
                        int i36 = v37;
                        bk2 F2 = ezf.F((int) D0.getLong(v44));
                        long j12 = D0.getLong(v45);
                        long j13 = D0.getLong(i33);
                        long j14 = D0.getLong(i32);
                        int i37 = v48;
                        long j15 = D0.getLong(i37);
                        int i38 = v36;
                        int i39 = v49;
                        boolean z5 = ((int) D0.getLong(i39)) != 0;
                        int i40 = v50;
                        int i41 = v35;
                        nxj H2 = ezf.H((int) D0.getLong(i40));
                        v49 = i39;
                        int i42 = v51;
                        int i43 = (int) D0.getLong(i42);
                        v51 = i42;
                        int i44 = v52;
                        int i45 = (int) D0.getLong(i44);
                        int i46 = v53;
                        long j16 = D0.getLong(i46);
                        int i47 = v54;
                        int i48 = (int) D0.getLong(i47);
                        v54 = i47;
                        int i49 = v55;
                        int i50 = (int) D0.getLong(i49);
                        int i51 = v56;
                        String x08 = D0.isNull(i51) ? null : D0.x0(i51);
                        int i52 = v57;
                        if (D0.isNull(i52)) {
                            v56 = i51;
                            v55 = i49;
                            valueOf2 = null;
                        } else {
                            v56 = i51;
                            v55 = i49;
                            valueOf2 = Integer.valueOf((int) D0.getLong(i52));
                        }
                        if (valueOf2 != null) {
                            bool2 = Boolean.valueOf(valueOf2.intValue() != 0);
                        } else {
                            bool2 = null;
                        }
                        int i53 = v58;
                        g2j G2 = ezf.G((int) D0.getLong(i53));
                        int i54 = v59;
                        f1j U2 = ezf.U(D0.getBlob(i54));
                        int i55 = v60;
                        boolean z6 = ((int) D0.getLong(i55)) != 0;
                        int i56 = v61;
                        boolean z7 = ((int) D0.getLong(i56)) != 0;
                        int i57 = v62;
                        boolean z8 = ((int) D0.getLong(i57)) != 0;
                        v62 = i57;
                        int i58 = v63;
                        int i59 = v64;
                        int i60 = v65;
                        v64 = i59;
                        int i61 = v66;
                        arrayList2.add(new t4w(x05, I3, x06, x07, Q3, Q4, j9, j10, j11, new fa6(U2, G2, z6, z7, z8, ((int) D0.getLong(i58)) != 0, D0.getLong(i59), D0.getLong(i60), ezf.u(D0.getBlob(i61))), i34, F2, j12, j13, j14, j15, z5, H2, i43, i45, j16, i48, i50, x08, bool2));
                        v61 = i56;
                        v35 = i41;
                        v50 = i40;
                        v52 = i44;
                        v53 = i46;
                        v57 = i52;
                        v58 = i53;
                        v59 = i54;
                        v60 = i55;
                        v66 = i61;
                        v65 = i60;
                        v63 = i58;
                        v47 = i32;
                        v37 = i36;
                        v38 = i35;
                        v36 = i38;
                        v48 = i37;
                        v46 = i33;
                    }
                    return arrayList2;
                } finally {
                }
            case 23:
                xjo xjoVar4 = (xjo) obj;
                xjoVar4.getClass();
                D0 = xjoVar4.D0("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 AND LENGTH(content_uri_triggers)<>0 ORDER BY last_enqueue_time");
                try {
                    int v67 = s7g.v(D0, ConnectableDevice.KEY_ID);
                    int v68 = s7g.v(D0, "state");
                    int v69 = s7g.v(D0, "worker_class_name");
                    int v70 = s7g.v(D0, "input_merger_class_name");
                    int v71 = s7g.v(D0, "input");
                    int v72 = s7g.v(D0, "output");
                    int v73 = s7g.v(D0, "initial_delay");
                    int v74 = s7g.v(D0, "interval_duration");
                    int v75 = s7g.v(D0, "flex_duration");
                    int v76 = s7g.v(D0, "run_attempt_count");
                    int v77 = s7g.v(D0, "backoff_policy");
                    int v78 = s7g.v(D0, "backoff_delay_duration");
                    int v79 = s7g.v(D0, "last_enqueue_time");
                    int v80 = s7g.v(D0, "minimum_retention_duration");
                    int v81 = s7g.v(D0, "schedule_requested_at");
                    int v82 = s7g.v(D0, "run_in_foreground");
                    int v83 = s7g.v(D0, "out_of_quota_policy");
                    int v84 = s7g.v(D0, "period_count");
                    int v85 = s7g.v(D0, "generation");
                    int v86 = s7g.v(D0, "next_schedule_time_override");
                    int v87 = s7g.v(D0, "next_schedule_time_override_generation");
                    int v88 = s7g.v(D0, "stop_reason");
                    int v89 = s7g.v(D0, "trace_tag");
                    int v90 = s7g.v(D0, "backoff_on_system_interruptions");
                    int v91 = s7g.v(D0, "required_network_type");
                    int v92 = s7g.v(D0, "required_network_request");
                    int v93 = s7g.v(D0, "requires_charging");
                    int v94 = s7g.v(D0, "requires_device_idle");
                    int v95 = s7g.v(D0, "requires_battery_not_low");
                    int v96 = s7g.v(D0, "requires_storage_not_low");
                    int v97 = s7g.v(D0, "trigger_content_update_delay");
                    int v98 = s7g.v(D0, "trigger_max_content_delay");
                    int v99 = s7g.v(D0, "content_uri_triggers");
                    ArrayList arrayList3 = new ArrayList();
                    while (D0.q()) {
                        String x09 = D0.x0(v67);
                        int i62 = v80;
                        int i63 = v79;
                        c4w I4 = ezf.I((int) D0.getLong(v68));
                        String x010 = D0.x0(v69);
                        String x011 = D0.x0(v70);
                        byte[] blob3 = D0.getBlob(v71);
                        q97 q97Var3 = q97.b;
                        q97 Q5 = cxb.Q(blob3);
                        q97 Q6 = cxb.Q(D0.getBlob(v72));
                        long j17 = D0.getLong(v73);
                        long j18 = D0.getLong(v74);
                        long j19 = D0.getLong(v75);
                        int i64 = (int) D0.getLong(v76);
                        int i65 = v71;
                        int i66 = v70;
                        bk2 F3 = ezf.F((int) D0.getLong(v77));
                        long j20 = D0.getLong(v78);
                        long j21 = D0.getLong(i63);
                        long j22 = D0.getLong(i62);
                        int i67 = v81;
                        long j23 = D0.getLong(i67);
                        int i68 = v69;
                        int i69 = v82;
                        boolean z9 = ((int) D0.getLong(i69)) != 0;
                        int i70 = v83;
                        int i71 = v68;
                        nxj H3 = ezf.H((int) D0.getLong(i70));
                        v82 = i69;
                        int i72 = v84;
                        int i73 = (int) D0.getLong(i72);
                        v84 = i72;
                        int i74 = v85;
                        int i75 = (int) D0.getLong(i74);
                        int i76 = v86;
                        long j24 = D0.getLong(i76);
                        int i77 = v87;
                        int i78 = (int) D0.getLong(i77);
                        v87 = i77;
                        int i79 = v88;
                        int i80 = (int) D0.getLong(i79);
                        int i81 = v89;
                        String x012 = D0.isNull(i81) ? null : D0.x0(i81);
                        int i82 = v90;
                        if (D0.isNull(i82)) {
                            v89 = i81;
                            v88 = i79;
                            valueOf3 = null;
                        } else {
                            v89 = i81;
                            v88 = i79;
                            valueOf3 = Integer.valueOf((int) D0.getLong(i82));
                        }
                        if (valueOf3 != null) {
                            bool3 = Boolean.valueOf(valueOf3.intValue() != 0);
                        } else {
                            bool3 = null;
                        }
                        int i83 = v91;
                        g2j G3 = ezf.G((int) D0.getLong(i83));
                        int i84 = v92;
                        f1j U3 = ezf.U(D0.getBlob(i84));
                        int i85 = v93;
                        boolean z10 = ((int) D0.getLong(i85)) != 0;
                        int i86 = v94;
                        boolean z11 = ((int) D0.getLong(i86)) != 0;
                        int i87 = v95;
                        boolean z12 = ((int) D0.getLong(i87)) != 0;
                        v95 = i87;
                        int i88 = v96;
                        int i89 = v97;
                        int i90 = v98;
                        v97 = i89;
                        int i91 = v99;
                        arrayList3.add(new t4w(x09, I4, x010, x011, Q5, Q6, j17, j18, j19, new fa6(U3, G3, z10, z11, z12, ((int) D0.getLong(i88)) != 0, D0.getLong(i89), D0.getLong(i90), ezf.u(D0.getBlob(i91))), i64, F3, j20, j21, j22, j23, z9, H3, i73, i75, j24, i78, i80, x012, bool3));
                        v94 = i86;
                        v68 = i71;
                        v83 = i70;
                        v85 = i74;
                        v86 = i76;
                        v90 = i82;
                        v91 = i83;
                        v92 = i84;
                        v93 = i85;
                        v99 = i91;
                        v98 = i90;
                        v96 = i88;
                        v80 = i62;
                        v70 = i66;
                        v71 = i65;
                        v69 = i68;
                        v81 = i67;
                        v79 = i63;
                    }
                    return arrayList3;
                } finally {
                }
            case 24:
                xjo xjoVar5 = (xjo) obj;
                xjoVar5.getClass();
                D0 = xjoVar5.D0("Select COUNT(*) FROM workspec WHERE LENGTH(content_uri_triggers)<>0 AND state NOT IN (2, 3, 5)");
                try {
                    int i92 = D0.q() ? (int) D0.getLong(0) : 0;
                    D0.close();
                    return Integer.valueOf(i92);
                } finally {
                }
            case 25:
                return a(obj);
            case 26:
                return d(obj);
            case 27:
                return g(obj);
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                e5w e5wVar = (e5w) obj;
                e5wVar.getClass();
                return rzf.z(e5wVar);
            default:
                List list = (List) obj;
                ju0 ju0Var = YMApplication.d;
                list.getClass();
                jyr jyrVar = dzq.f;
                if (quk.f()) {
                    l18 l18Var = l18.b;
                    bdt I5 = hag.I(wyq.class);
                    qdc qdcVar2 = l18Var.a;
                    qdcVar2.getClass();
                    list.add(new uyq(((wyq) qdcVar2.C(I5)).a));
                }
                return Unit.a;
        }
    }
}
