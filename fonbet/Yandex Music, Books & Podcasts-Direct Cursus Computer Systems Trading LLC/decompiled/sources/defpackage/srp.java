package defpackage;

import androidx.work.impl.WorkDatabase;
import com.connectsdk.device.ConnectableDevice;
import com.yandex.pulse.metrics.o;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;

/* loaded from: classes4.dex */
public final /* synthetic */ class srp implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ srp(String str, int i) {
        this.a = i;
        this.b = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r36v0, types: [t4w] */
    private final Object a(Object obj) {
        String str = this.b;
        xjo xjoVar = (xjo) obj;
        xjoVar.getClass();
        cko D0 = xjoVar.D0("SELECT * FROM workspec WHERE id=?");
        try {
            D0.E(1, str);
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
            Boolean bool = null;
            if (D0.q()) {
                String x0 = D0.x0(v);
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
                int i = (int) D0.getLong(v10);
                bk2 F = ezf.F((int) D0.getLong(v11));
                long j4 = D0.getLong(v12);
                long j5 = D0.getLong(v13);
                long j6 = D0.getLong(v14);
                long j7 = D0.getLong(v15);
                boolean z = ((int) D0.getLong(v16)) != 0;
                nxj H = ezf.H((int) D0.getLong(v17));
                int i2 = (int) D0.getLong(v18);
                int i3 = (int) D0.getLong(v19);
                long j8 = D0.getLong(v20);
                int i4 = (int) D0.getLong(v21);
                int i5 = (int) D0.getLong(v22);
                String x04 = D0.isNull(v23) ? null : D0.x0(v23);
                Integer valueOf = D0.isNull(v24) ? null : Integer.valueOf((int) D0.getLong(v24));
                if (valueOf != null) {
                    bool = Boolean.valueOf(valueOf.intValue() != 0);
                }
                bool = new t4w(x0, I, x02, x03, Q, Q2, j, j2, j3, new fa6(ezf.U(D0.getBlob(v26)), ezf.G((int) D0.getLong(v25)), ((int) D0.getLong(v27)) != 0, ((int) D0.getLong(v28)) != 0, ((int) D0.getLong(v29)) != 0, ((int) D0.getLong(v30)) != 0, D0.getLong(v31), D0.getLong(v32), ezf.u(D0.getBlob(v33))), i, F, j4, j5, j6, j7, z, H, i2, i3, j8, i4, i5, x04, bool);
            }
            D0.close();
            return bool;
        } catch (Throwable th) {
            D0.close();
            throw th;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        cko D0;
        String x0;
        int i;
        int i2;
        String x02;
        int i3;
        int i4;
        int i5;
        int i6;
        Float valueOf;
        int i7;
        int i8;
        Float valueOf2;
        int i9;
        int i10;
        List split$default;
        s9p E;
        switch (this.a) {
            case 0:
                jfp jfpVar = (jfp) obj;
                jfpVar.getClass();
                String str = this.b;
                if (str == null) {
                    wfp.g(jfpVar);
                } else {
                    wfp.q(jfpVar, 0);
                    wfp.k(jfpVar, str);
                }
                return Unit.a;
            case 1:
                jfp jfpVar2 = (jfp) obj;
                jfpVar2.getClass();
                String str2 = this.b;
                if (str2 == null) {
                    wfp.g(jfpVar2);
                } else {
                    wfp.q(jfpVar2, 0);
                    wfp.k(jfpVar2, str2);
                }
                return Unit.a;
            case 2:
                jfp jfpVar3 = (jfp) obj;
                jfpVar3.getClass();
                wfp.q(jfpVar3, 0);
                String str3 = this.b;
                if (str3 != null) {
                    wfp.k(jfpVar3, str3);
                }
                return Unit.a;
            case 3:
                jfp jfpVar4 = (jfp) obj;
                jfpVar4.getClass();
                wfp.k(jfpVar4, this.b);
                return Unit.a;
            case 4:
                jfp jfpVar5 = (jfp) obj;
                jfpVar5.getClass();
                wfp.u(jfpVar5, new mn0(this.b));
                return Unit.a;
            case 5:
                jfp jfpVar6 = (jfp) obj;
                jfpVar6.getClass();
                wfp.u(jfpVar6, new mn0(6, this.b, (ArrayList) null));
                return Unit.a;
            case 6:
                WorkDatabase workDatabase = (WorkDatabase) obj;
                workDatabase.getClass();
                tiu tiuVar = t4w.A;
                x4w A = workDatabase.A();
                A.getClass();
                String str4 = this.b;
                str4.getClass();
                Object apply = tiuVar.apply((List) up6.F(A.a, true, true, new itv(8, str4, A)));
                apply.getClass();
                return (List) apply;
            case 7:
                String str5 = (String) obj;
                str5.getClass();
                boolean U = StringsKt.U(str5);
                String str6 = this.b;
                return U ? str5.length() < str6.length() ? str6 : str5 : str6.concat(str5);
            case 8:
                jfp jfpVar7 = (jfp) obj;
                jfpVar7.getClass();
                wfp.k(jfpVar7, this.b);
                return Unit.a;
            case 9:
                String str7 = this.b;
                xjo xjoVar = (xjo) obj;
                xjoVar.getClass();
                D0 = xjoVar.D0("DELETE FROM SystemIdInfo where work_spec_id=?");
                try {
                    D0.E(1, str7);
                    D0.q();
                    D0.close();
                    return Unit.a;
                } finally {
                }
            case 10:
                jfp jfpVar8 = (jfp) obj;
                jfpVar8.getClass();
                wfp.k(jfpVar8, this.b);
                return Unit.a;
            case 11:
                String str8 = this.b;
                xjo xjoVar2 = (xjo) obj;
                xjoVar2.getClass();
                D0 = xjoVar2.D0("SELECT * FROM track_view WHERE artist_id = ? ORDER BY original_release_year DESC, album_id, vol, position");
                try {
                    D0.E(1, str8);
                    int v = s7g.v(D0, "duration");
                    int v2 = s7g.v(D0, "name");
                    int v3 = s7g.v(D0, "version");
                    int v4 = s7g.v(D0, "original_id");
                    int v5 = s7g.v(D0, "real_id");
                    int v6 = s7g.v(D0, "warning_content");
                    int v7 = s7g.v(D0, "explicit");
                    int v8 = s7g.v(D0, "available");
                    int v9 = s7g.v(D0, "for_premium");
                    int v10 = s7g.v(D0, "for_options");
                    int v11 = s7g.v(D0, "lyrics_available");
                    int v12 = s7g.v(D0, "txt_lyrics_available");
                    int v13 = s7g.v(D0, "sync_lyrics_available");
                    int v14 = s7g.v(D0, "track_type");
                    int v15 = s7g.v(D0, "track_source");
                    int v16 = s7g.v(D0, "track_user");
                    int v17 = s7g.v(D0, "ugc_artist_name");
                    int v18 = s7g.v(D0, "track_save_progress");
                    int v19 = s7g.v(D0, "cover_video_id");
                    int v20 = s7g.v(D0, "cover_url");
                    int v21 = s7g.v(D0, "color_palette");
                    int v22 = s7g.v(D0, "short_description");
                    int v23 = s7g.v(D0, "release_date");
                    int v24 = s7g.v(D0, "track_for_kids");
                    int v25 = s7g.v(D0, "integrated_loudness_db");
                    int v26 = s7g.v(D0, "true_peak_db");
                    int v27 = s7g.v(D0, "track_disclaimer");
                    int v28 = s7g.v(D0, "track_fade");
                    int v29 = s7g.v(D0, "special_audio_resources");
                    int v30 = s7g.v(D0, "track_video_clip_ids");
                    int v31 = s7g.v(D0, "album_id");
                    int v32 = s7g.v(D0, "album_name");
                    int v33 = s7g.v(D0, "vol");
                    int v34 = s7g.v(D0, "position");
                    int v35 = s7g.v(D0, "artist_id");
                    int i11 = v14;
                    int v36 = s7g.v(D0, "artist_name");
                    int i12 = v13;
                    int v37 = s7g.v(D0, "artist_track_various");
                    int i13 = v12;
                    int v38 = s7g.v(D0, "artist_track_cover_uri");
                    int i14 = v11;
                    int v39 = s7g.v(D0, "artist_track_cutout_cover_uri");
                    int i15 = v10;
                    int v40 = s7g.v(D0, "artist_disclaimer");
                    int i16 = v9;
                    int v41 = s7g.v(D0, "original_release_year");
                    int i17 = v8;
                    int v42 = s7g.v(D0, "cover_uri");
                    int v43 = s7g.v(D0, "album_type");
                    int v44 = s7g.v(D0, "sort_order");
                    int i18 = v7;
                    ArrayList arrayList = new ArrayList();
                    while (D0.q()) {
                        String x03 = D0.x0(v35);
                        String x04 = D0.x0(v36);
                        int i19 = v6;
                        ArrayList arrayList2 = arrayList;
                        boolean z = ((int) D0.getLong(v37)) != 0;
                        String x05 = D0.isNull(v38) ? null : D0.x0(v38);
                        String x06 = D0.isNull(v39) ? null : D0.x0(v39);
                        String x07 = D0.isNull(v40) ? null : D0.x0(v40);
                        String x08 = D0.isNull(v41) ? null : D0.x0(v41);
                        String x09 = D0.isNull(v44) ? null : D0.x0(v44);
                        long j = D0.getLong(v);
                        String x010 = D0.x0(v2);
                        String x011 = D0.isNull(v3) ? null : D0.x0(v3);
                        String x012 = D0.x0(v4);
                        String x013 = D0.isNull(v5) ? null : D0.x0(v5);
                        v6 = i19;
                        String x014 = D0.x0(v6);
                        int i20 = v35;
                        int i21 = i18;
                        int i22 = v;
                        boolean z2 = ((int) D0.getLong(i21)) != 0;
                        int i23 = i17;
                        String x015 = D0.x0(i23);
                        int i24 = v36;
                        int i25 = i16;
                        int i26 = v2;
                        boolean z3 = ((int) D0.getLong(i25)) != 0;
                        int i27 = i15;
                        String x016 = D0.isNull(i27) ? null : D0.x0(i27);
                        int i28 = i14;
                        boolean z4 = ((int) D0.getLong(i28)) != 0;
                        int i29 = i13;
                        boolean z5 = ((int) D0.getLong(i29)) != 0;
                        int i30 = i12;
                        boolean z6 = ((int) D0.getLong(i30)) != 0;
                        int i31 = i11;
                        String x017 = D0.x0(i31);
                        int i32 = v15;
                        String x018 = D0.isNull(i32) ? null : D0.x0(i32);
                        i11 = i31;
                        int i33 = v16;
                        String x019 = D0.isNull(i33) ? null : D0.x0(i33);
                        v16 = i33;
                        int i34 = v17;
                        if (D0.isNull(i34)) {
                            x0 = null;
                            v17 = i34;
                            i2 = i30;
                            i = v18;
                        } else {
                            x0 = D0.x0(i34);
                            v17 = i34;
                            i = v18;
                            i2 = i30;
                        }
                        boolean z7 = ((int) D0.getLong(i)) != 0;
                        int i35 = v19;
                        String x020 = D0.isNull(i35) ? null : D0.x0(i35);
                        int i36 = v20;
                        String x021 = D0.isNull(i36) ? null : D0.x0(i36);
                        int i37 = i;
                        int i38 = v21;
                        String x022 = D0.isNull(i38) ? null : D0.x0(i38);
                        v21 = i38;
                        int i39 = v22;
                        String x023 = D0.isNull(i39) ? null : D0.x0(i39);
                        v22 = i39;
                        int i40 = v23;
                        if (D0.isNull(i40)) {
                            x02 = null;
                            v23 = i40;
                            i4 = i35;
                            i3 = v24;
                        } else {
                            x02 = D0.x0(i40);
                            v23 = i40;
                            i3 = v24;
                            i4 = i35;
                        }
                        boolean z8 = ((int) D0.getLong(i3)) != 0;
                        int i41 = v25;
                        if (D0.isNull(i41)) {
                            i5 = i3;
                            i6 = i32;
                            valueOf = null;
                        } else {
                            i5 = i3;
                            i6 = i32;
                            valueOf = Float.valueOf((float) D0.getDouble(i41));
                        }
                        int i42 = v26;
                        if (D0.isNull(i42)) {
                            i7 = i41;
                            i8 = i6;
                            valueOf2 = null;
                        } else {
                            i7 = i41;
                            i8 = i6;
                            valueOf2 = Float.valueOf((float) D0.getDouble(i42));
                        }
                        int i43 = v27;
                        String x024 = D0.isNull(i43) ? null : D0.x0(i43);
                        int i44 = v28;
                        String x025 = D0.isNull(i44) ? null : D0.x0(i44);
                        int i45 = v29;
                        String x026 = D0.isNull(i45) ? null : D0.x0(i45);
                        v29 = i45;
                        int i46 = v30;
                        String x027 = D0.isNull(i46) ? null : D0.x0(i46);
                        v30 = i46;
                        int i47 = v31;
                        String x028 = D0.x0(i47);
                        v31 = i47;
                        int i48 = v32;
                        String x029 = D0.x0(i48);
                        v32 = i48;
                        int i49 = v33;
                        int i50 = (int) D0.getLong(i49);
                        int i51 = v34;
                        int i52 = i7;
                        int i53 = v42;
                        int i54 = v43;
                        v43 = i54;
                        arrayList2.add(new i2t(new ig5(x012, x013, x010, x011, j, x014, z2, x015, z3, x016, z4, z5, z6, x017, x018, x019, x0, z7, x020, x021, x022, x023, x02, valueOf, valueOf2, z8, x024, x025, x026, x027, x029, x028, D0.x0(i54), D0.isNull(i53) ? null : D0.x0(i53), i50, (int) D0.getLong(i51)), x03, x04, z, x05, x06, x07, x08, x09));
                        arrayList = arrayList2;
                        v = i22;
                        i18 = i21;
                        v42 = i53;
                        v36 = i24;
                        v35 = i20;
                        i17 = i23;
                        i14 = i28;
                        i13 = i29;
                        v18 = i37;
                        v19 = i4;
                        v20 = i36;
                        v24 = i5;
                        v25 = i52;
                        v34 = i51;
                        v2 = i26;
                        i16 = i25;
                        i15 = i27;
                        i12 = i2;
                        v15 = i8;
                        v26 = i42;
                        v27 = i43;
                        v28 = i44;
                        v33 = i49;
                    }
                    return arrayList;
                } finally {
                }
            case 12:
                jfp jfpVar9 = (jfp) obj;
                jfpVar9.getClass();
                wfp.k(jfpVar9, this.b);
                wfp.q(jfpVar9, 0);
                return Unit.a;
            case 13:
                int intValue = ((Integer) obj).intValue();
                return (intValue < 0 || intValue >= 3) ? (3 > intValue || intValue >= 7) ? mlr.K(intValue - 3, this.b).concat("TRM") : "TRM" : "";
            case 14:
                String str9 = this.b;
                xjo xjoVar3 = (xjo) obj;
                xjoVar3.getClass();
                D0 = xjoVar3.D0("SELECT * FROM video_clip_artist WHERE video_clip_id = ?");
                try {
                    D0.E(1, str9);
                    int v45 = s7g.v(D0, "video_clip_id");
                    int v46 = s7g.v(D0, "artist_id");
                    ArrayList arrayList3 = new ArrayList();
                    while (D0.q()) {
                        arrayList3.add(new v2u(D0.x0(v45), D0.x0(v46)));
                    }
                    return arrayList3;
                } finally {
                }
            case 15:
                jfp jfpVar10 = (jfp) obj;
                jfpVar10.getClass();
                wfp.k(jfpVar10, this.b);
                return Unit.a;
            case 16:
                String str10 = this.b;
                xjo xjoVar4 = (xjo) obj;
                xjoVar4.getClass();
                D0 = xjoVar4.D0("SELECT * FROM video_clip_track WHERE video_clip_id = ?");
                try {
                    D0.E(1, str10);
                    int v47 = s7g.v(D0, "video_clip_id");
                    int v48 = s7g.v(D0, "track_id");
                    ArrayList arrayList4 = new ArrayList();
                    while (D0.q()) {
                        arrayList4.add(new t9u(D0.x0(v47), D0.x0(v48)));
                    }
                    return arrayList4;
                } finally {
                }
            case 17:
                String str11 = this.b;
                xjo xjoVar5 = (xjo) obj;
                xjoVar5.getClass();
                D0 = xjoVar5.D0("SELECT * FROM wave_feedback WHERE rotor_session_id = ?");
                try {
                    D0.E(1, str11);
                    int v49 = s7g.v(D0, ConnectableDevice.KEY_ID);
                    int v50 = s7g.v(D0, "type");
                    int v51 = s7g.v(D0, "rotor_session_id");
                    int v52 = s7g.v(D0, "seeds");
                    int v53 = s7g.v(D0, "timestamp");
                    int v54 = s7g.v(D0, "track_id");
                    int v55 = s7g.v(D0, "total_played_ms");
                    int v56 = s7g.v(D0, "track_duration_ms");
                    int v57 = s7g.v(D0, "playable_from");
                    int v58 = s7g.v(D0, "batch_id");
                    ArrayList arrayList5 = new ArrayList();
                    while (D0.q()) {
                        long j2 = D0.getLong(v49);
                        String x030 = D0.x0(v50);
                        String x031 = D0.x0(v51);
                        String x032 = D0.x0(v52);
                        x032.getClass();
                        if (StringsKt.U(x032)) {
                            E = new s9p(t75.c(r9p.a));
                            i9 = v49;
                            i10 = v50;
                        } else {
                            i9 = v49;
                            i10 = v50;
                            split$default = StringsKt__StringsKt.split$default(x032, new String[]{StringUtils.COMMA}, false, 0, 6, null);
                            E = o8g.E(split$default);
                        }
                        arrayList5.add(new mou(j2, x030, x031, E, D0.getLong(v53), D0.isNull(v54) ? null : D0.x0(v54), D0.isNull(v55) ? null : Long.valueOf(D0.getLong(v55)), D0.isNull(v56) ? null : Long.valueOf(D0.getLong(v56)), D0.x0(v57), D0.isNull(v58) ? null : D0.x0(v58)));
                        v49 = i9;
                        v50 = i10;
                    }
                    return arrayList5;
                } finally {
                }
            case 18:
                jfp jfpVar11 = (jfp) obj;
                jfpVar11.getClass();
                wfp.k(jfpVar11, this.b);
                return Unit.a;
            case 19:
                jfp jfpVar12 = (jfp) obj;
                jfpVar12.getClass();
                wfp.t(jfpVar12, "clear_settings_button_text");
                jfpVar12.o(ufp.z, t75.c(new mn0(6, this.b, (ArrayList) null)));
                return Unit.a;
            case 20:
                opf opfVar = (opf) obj;
                opfVar.getClass();
                float c = yhn.c(1.0f - (7.0f / this.b.length()), 0.01f, 0.99f);
                opfVar.a();
                Float valueOf3 = Float.valueOf(0.0f);
                long j3 = d85.b;
                jpa.A0(opfVar, y9w.G(new Pair[]{new Pair(valueOf3, new d85(j3)), new Pair(Float.valueOf(c), new d85(j3)), new Pair(Float.valueOf(1.0f), new d85(d85.b(j3, 0.5f, 0.0f, 0.0f, 0.0f, 14)))}, 0.0f, nmq.d(opfVar.a.e()), 10), 0L, 0L, 0.0f, null, null, 6, 62);
                return Unit.a;
            case 21:
                ifp ifpVar = (ifp) obj;
                ifpVar.getClass();
                ngg.G(ifpVar, this.b);
                return Unit.a;
            case 22:
                ifp ifpVar2 = (ifp) obj;
                ifpVar2.getClass();
                String str12 = this.b;
                if (str12 != null) {
                    ngg.G(ifpVar2, str12);
                }
                return Unit.a;
            case 23:
                jfp jfpVar13 = (jfp) obj;
                jfpVar13.getClass();
                wfp.k(jfpVar13, this.b);
                return Unit.a;
            case 24:
                jfp jfpVar14 = (jfp) obj;
                jfpVar14.getClass();
                wfp.n(jfpVar14, 0);
                wfp.k(jfpVar14, this.b);
                return Unit.a;
            case 25:
                jfp jfpVar15 = (jfp) obj;
                jfpVar15.getClass();
                wfp.k(jfpVar15, this.b);
                return Unit.a;
            case 26:
                String str13 = this.b;
                xjo xjoVar6 = (xjo) obj;
                xjoVar6.getClass();
                D0 = xjoVar6.D0("SELECT name FROM workname WHERE work_spec_id=?");
                try {
                    D0.E(1, str13);
                    ArrayList arrayList6 = new ArrayList();
                    while (D0.q()) {
                        arrayList6.add(D0.x0(0));
                    }
                    return arrayList6;
                } finally {
                }
            case 27:
                String str14 = this.b;
                xjo xjoVar7 = (xjo) obj;
                xjoVar7.getClass();
                D0 = xjoVar7.D0("DELETE from WorkProgress where work_spec_id=?");
                try {
                    D0.E(1, str14);
                    D0.q();
                    D0.close();
                    return Unit.a;
                } finally {
                }
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return a(obj);
            default:
                String str15 = this.b;
                xjo xjoVar8 = (xjo) obj;
                xjoVar8.getClass();
                D0 = xjoVar8.D0("SELECT state FROM workspec WHERE id=?");
                try {
                    D0.E(1, str15);
                    c4w c4wVar = null;
                    if (D0.q()) {
                        Integer valueOf4 = D0.isNull(0) ? null : Integer.valueOf((int) D0.getLong(0));
                        if (valueOf4 != null) {
                            c4wVar = ezf.I(valueOf4.intValue());
                        }
                    }
                    return c4wVar;
                } finally {
                }
        }
    }
}
