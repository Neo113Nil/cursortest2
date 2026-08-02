package defpackage;

import com.connectsdk.device.DefaultConnectableDeviceStore;
import com.connectsdk.service.DeviceService;
import com.yandex.auth.LegacyAccountType;
import com.yandex.pulse.metrics.o;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class q1h implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ q1h(pxm pxmVar, String str, int i) {
        this.a = i;
        this.b = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v5, types: [alm] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        cko D0;
        boolean z;
        int i;
        int i2;
        Integer valueOf;
        int i3;
        int i4;
        Integer valueOf2;
        int i5;
        int i6;
        Integer valueOf3;
        String x0;
        int i7;
        int i8;
        switch (this.a) {
            case 0:
                jfp jfpVar = (jfp) obj;
                jfpVar.getClass();
                wfp.k(jfpVar, this.b);
                return Unit.a;
            case 1:
                jfp jfpVar2 = (jfp) obj;
                jfpVar2.getClass();
                wfp.k(jfpVar2, this.b);
                return Unit.a;
            case 2:
                jfp jfpVar3 = (jfp) obj;
                jfpVar3.getClass();
                wfp.k(jfpVar3, this.b);
                return Unit.a;
            case 3:
                jfp jfpVar4 = (jfp) obj;
                jfpVar4.getClass();
                wfp.k(jfpVar4, this.b);
                return Unit.a;
            case 4:
                jfp jfpVar5 = (jfp) obj;
                jfpVar5.getClass();
                wfp.k(jfpVar5, this.b);
                return Unit.a;
            case 5:
                jfp jfpVar6 = (jfp) obj;
                jfpVar6.getClass();
                wfp.k(jfpVar6, this.b);
                return Unit.a;
            case 6:
                jfp jfpVar7 = (jfp) obj;
                jfpVar7.getClass();
                wfp.k(jfpVar7, this.b);
                return Unit.a;
            case 7:
                jfp jfpVar8 = (jfp) obj;
                jfpVar8.getClass();
                wfp.u(jfpVar8, new mn0(this.b));
                return Unit.a;
            case 8:
                jfp jfpVar9 = (jfp) obj;
                jfpVar9.getClass();
                wfp.k(jfpVar9, this.b);
                return Unit.a;
            case 9:
                jfp jfpVar10 = (jfp) obj;
                jfpVar10.getClass();
                wfp.k(jfpVar10, this.b);
                return Unit.a;
            case 10:
                jfp jfpVar11 = (jfp) obj;
                jfpVar11.getClass();
                wfp.k(jfpVar11, this.b);
                return Unit.a;
            case 11:
                String str = this.b;
                xjo xjoVar = (xjo) obj;
                xjoVar.getClass();
                D0 = xjoVar.D0("SELECT * FROM playbackSpeed WHERE albumId = ?");
                try {
                    D0.E(1, str);
                    return D0.q() ? new l5l(D0.x0(s7g.v(D0, "albumId")), (int) D0.getLong(s7g.v(D0, "playbackSpeed"))) : null;
                } finally {
                }
            case 12:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                Object key = entry.getKey();
                key.getClass();
                Object value = entry.getValue();
                value.getClass();
                gm5 gm5Var = (gm5) value;
                if (Intrinsics.d((String) key, this.b)) {
                    z = false;
                } else {
                    gm5Var.U(fwk.OTHER);
                    z = true;
                }
                return Boolean.valueOf(z);
            case 13:
                jfp jfpVar12 = (jfp) obj;
                jfpVar12.getClass();
                wfp.k(jfpVar12, this.b);
                return Unit.a;
            case 14:
                String str2 = this.b;
                xjo xjoVar2 = (xjo) obj;
                xjoVar2.getClass();
                D0 = xjoVar2.D0("SELECT playlist_id FROM playlist_track WHERE track_id=? ORDER BY position");
                try {
                    D0.E(1, str2);
                    ArrayList arrayList = new ArrayList();
                    while (D0.q()) {
                        arrayList.add(Long.valueOf(D0.getLong(0)));
                    }
                    return arrayList;
                } finally {
                }
            case 15:
                String str3 = this.b;
                xjo xjoVar3 = (xjo) obj;
                xjoVar3.getClass();
                D0 = xjoVar3.D0("SELECT _id FROM playlist_track WHERE track_id = ?");
                try {
                    D0.E(1, str3);
                    ArrayList arrayList2 = new ArrayList();
                    while (D0.q()) {
                        arrayList2.add(Long.valueOf(D0.getLong(0)));
                    }
                    return arrayList2;
                } finally {
                }
            case 16:
                String str4 = this.b;
                xjo xjoVar4 = (xjo) obj;
                xjoVar4.getClass();
                D0 = xjoVar4.D0("SELECT uid, original_id FROM playlist WHERE liked=1 AND uid!=? AND sync NOT IN (2, 4)");
                try {
                    D0.E(1, str4);
                    ArrayList arrayList3 = new ArrayList();
                    while (D0.q()) {
                        arrayList3.add(new ovl(D0.x0(0), D0.x0(1)));
                    }
                    return arrayList3;
                } finally {
                }
            case 17:
                String str5 = this.b;
                xjo xjoVar5 = (xjo) obj;
                xjoVar5.getClass();
                D0 = xjoVar5.D0("SELECT * FROM playlist WHERE liked=1 AND uid!=? AND sync NOT IN (2, 4)");
                try {
                    D0.E(1, str5);
                    int v = s7g.v(D0, "_id");
                    int v2 = s7g.v(D0, "uuid");
                    int v3 = s7g.v(D0, "original_id");
                    int v4 = s7g.v(D0, "uid");
                    int v5 = s7g.v(D0, LegacyAccountType.STRING_LOGIN);
                    int v6 = s7g.v(D0, "user_full_name");
                    int v7 = s7g.v(D0, "name");
                    int v8 = s7g.v(D0, "name_surrogate");
                    int v9 = s7g.v(D0, DeviceService.KEY_DESC);
                    int v10 = s7g.v(D0, "revision");
                    int v11 = s7g.v(D0, "snapshot");
                    int v12 = s7g.v(D0, DefaultConnectableDeviceStore.KEY_CREATED);
                    int v13 = s7g.v(D0, "visibility");
                    int v14 = s7g.v(D0, "sync");
                    int v15 = s7g.v(D0, "cover_info");
                    int v16 = s7g.v(D0, "position");
                    int v17 = s7g.v(D0, "tracks");
                    int v18 = s7g.v(D0, "liked");
                    int v19 = s7g.v(D0, "liked_timestamp");
                    int v20 = s7g.v(D0, "likes_count");
                    int v21 = s7g.v(D0, "auto_generated_type");
                    int v22 = s7g.v(D0, "modified");
                    int v23 = s7g.v(D0, "made_for_genitive");
                    int v24 = s7g.v(D0, "target_uid");
                    int v25 = s7g.v(D0, "target_login");
                    int v26 = s7g.v(D0, "playlist_for_kids");
                    int v27 = s7g.v(D0, "bg_image_url");
                    int v28 = s7g.v(D0, "bg_video_url");
                    ArrayList arrayList4 = new ArrayList();
                    while (D0.q()) {
                        long j = D0.getLong(v);
                        String x02 = D0.isNull(v2) ? null : D0.x0(v2);
                        String x03 = D0.x0(v3);
                        String x04 = D0.x0(v4);
                        String x05 = D0.x0(v5);
                        String x06 = D0.isNull(v6) ? null : D0.x0(v6);
                        String x07 = D0.x0(v7);
                        String x08 = D0.x0(v8);
                        String x09 = D0.isNull(v9) ? null : D0.x0(v9);
                        if (D0.isNull(v10)) {
                            i = v2;
                            i2 = v3;
                            valueOf = null;
                        } else {
                            i = v2;
                            i2 = v3;
                            valueOf = Integer.valueOf((int) D0.getLong(v10));
                        }
                        Integer valueOf4 = D0.isNull(v11) ? null : Integer.valueOf((int) D0.getLong(v11));
                        String x010 = D0.x0(v12);
                        String x011 = D0.x0(v13);
                        int i9 = (int) D0.getLong(v14);
                        int i10 = v15;
                        String x012 = D0.isNull(i10) ? null : D0.x0(i10);
                        int i11 = v;
                        int i12 = v16;
                        Long valueOf5 = D0.isNull(i12) ? null : Long.valueOf(D0.getLong(i12));
                        v16 = i12;
                        int i13 = v17;
                        if (D0.isNull(i13)) {
                            i3 = v14;
                            i4 = i9;
                            valueOf2 = null;
                        } else {
                            i3 = v14;
                            i4 = i9;
                            valueOf2 = Integer.valueOf((int) D0.getLong(i13));
                        }
                        int i14 = v18;
                        boolean z2 = ((int) D0.getLong(i14)) != 0;
                        int i15 = v19;
                        String x013 = D0.isNull(i15) ? null : D0.x0(i15);
                        int i16 = v20;
                        if (D0.isNull(i16)) {
                            i5 = i14;
                            i6 = i15;
                            valueOf3 = null;
                        } else {
                            i5 = i14;
                            i6 = i15;
                            valueOf3 = Integer.valueOf((int) D0.getLong(i16));
                        }
                        int i17 = v21;
                        String x014 = D0.isNull(i17) ? null : D0.x0(i17);
                        int i18 = v22;
                        String x015 = D0.isNull(i18) ? null : D0.x0(i18);
                        int i19 = v23;
                        String x016 = D0.isNull(i19) ? null : D0.x0(i19);
                        v23 = i19;
                        int i20 = v24;
                        String x017 = D0.isNull(i20) ? null : D0.x0(i20);
                        v24 = i20;
                        int i21 = v25;
                        if (D0.isNull(i21)) {
                            x0 = null;
                            v25 = i21;
                            i8 = i17;
                            i7 = v26;
                        } else {
                            x0 = D0.x0(i21);
                            v25 = i21;
                            i7 = v26;
                            i8 = i17;
                        }
                        int i22 = v27;
                        int i23 = v28;
                        int i24 = i7;
                        arrayList4.add(new ytl(i4, j, valueOf, valueOf4, valueOf2, valueOf3, valueOf5, x02, x03, x04, x05, x06, x07, x08, x09, x010, x011, x012, x013, x014, x015, x016, x017, x0, D0.isNull(i22) ? null : D0.x0(i22), D0.isNull(i23) ? null : D0.x0(i23), z2, ((int) D0.getLong(i7)) != 0));
                        v27 = i22;
                        v28 = i23;
                        v = i11;
                        v14 = i3;
                        v15 = i10;
                        v18 = i5;
                        v17 = i13;
                        v21 = i8;
                        v22 = i18;
                        v2 = i;
                        v20 = i16;
                        v26 = i24;
                        v3 = i2;
                        v19 = i6;
                    }
                    return arrayList4;
                } finally {
                }
            case 18:
                String str6 = this.b;
                xjo xjoVar6 = (xjo) obj;
                xjoVar6.getClass();
                D0 = xjoVar6.D0("SELECT _id FROM playlist WHERE uid=? AND original_id=-14");
                try {
                    D0.E(1, str6);
                    long j2 = D0.q() ? D0.getLong(0) : 0L;
                    D0.close();
                    return Long.valueOf(j2);
                } finally {
                }
            case 19:
                String str7 = this.b;
                xjo xjoVar7 = (xjo) obj;
                xjoVar7.getClass();
                D0 = xjoVar7.D0("SELECT _id FROM playlist WHERE uid=? AND original_id=3");
                try {
                    D0.E(1, str7);
                    long j3 = D0.q() ? D0.getLong(0) : 0L;
                    D0.close();
                    return Long.valueOf(j3);
                } finally {
                }
            case 20:
                jfp jfpVar13 = (jfp) obj;
                jfpVar13.getClass();
                wfp.k(jfpVar13, this.b);
                return Unit.a;
            case 21:
                String str8 = this.b;
                xjo xjoVar8 = (xjo) obj;
                xjoVar8.getClass();
                D0 = xjoVar8.D0("SELECT * FROM pre_saves WHERE original_id = ?");
                try {
                    D0.E(1, str8);
                    int v29 = s7g.v(D0, "original_id");
                    int v30 = s7g.v(D0, "artists");
                    int v31 = s7g.v(D0, "release_date");
                    int v32 = s7g.v(D0, "pre_save_date");
                    int v33 = s7g.v(D0, "milliseconds_until_release");
                    int v34 = s7g.v(D0, "cover_uri");
                    int v35 = s7g.v(D0, "title");
                    int v36 = s7g.v(D0, "type_raw");
                    int v37 = s7g.v(D0, "warning_content");
                    int v38 = s7g.v(D0, "is_pre_saved");
                    int v39 = s7g.v(D0, "available");
                    int v40 = s7g.v(D0, "disclaimers");
                    if (D0.q()) {
                        r16 = new alm(D0.x0(v29), D0.x0(v30), D0.x0(v31), D0.x0(v32), D0.getLong(v33), D0.x0(v34), D0.isNull(v35) ? null : D0.x0(v35), D0.isNull(v36) ? null : D0.x0(v36), D0.x0(v37), ((int) D0.getLong(v38)) != 0, ((int) D0.getLong(v39)) != 0, D0.isNull(v40) ? null : D0.x0(v40));
                    }
                    return r16;
                } finally {
                }
            case 22:
                String str9 = this.b;
                xjo xjoVar9 = (xjo) obj;
                xjoVar9.getClass();
                D0 = xjoVar9.D0("DELETE FROM pre_saves WHERE original_id = ?");
                try {
                    D0.E(1, str9);
                    D0.q();
                    D0.close();
                    return Unit.a;
                } finally {
                }
            case 23:
                String str10 = this.b;
                xjo xjoVar10 = (xjo) obj;
                xjoVar10.getClass();
                D0 = xjoVar10.D0("DELETE FROM pre_save_operation WHERE pre_save_id = ?");
                try {
                    D0.E(1, str10);
                    D0.q();
                    D0.close();
                    return Unit.a;
                } finally {
                }
            case 24:
                String str11 = this.b;
                xjo xjoVar11 = (xjo) obj;
                xjoVar11.getClass();
                D0 = xjoVar11.D0("SELECT long_value FROM Preference where `key`=?");
                try {
                    D0.E(1, str11);
                    Long l = null;
                    if (D0.q() && !D0.isNull(0)) {
                        l = Long.valueOf(D0.getLong(0));
                    }
                    return l;
                } finally {
                }
            case 25:
                jfp jfpVar14 = (jfp) obj;
                jfpVar14.getClass();
                String str12 = this.b;
                if (str12 != null && str12.length() != 0) {
                    wfp.k(jfpVar14, str12);
                }
                return Unit.a;
            case 26:
                return pxm.c(((Integer) obj).intValue(), this.b);
            case 27:
                return pxm.c(((Integer) obj).intValue(), this.b);
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return pxm.c(((Integer) obj).intValue(), this.b);
            default:
                return pxm.c(((Integer) obj).intValue(), this.b);
        }
    }

    public /* synthetic */ q1h(String str, int i) {
        this.a = i;
        this.b = str;
    }
}
