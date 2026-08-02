package defpackage;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class ag3 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ String c;

    public /* synthetic */ ag3(String str, boolean z, int i) {
        this.a = i;
        this.c = str;
        this.b = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String x0;
        int i;
        String x02;
        int i2;
        int i3;
        int i4;
        int i5;
        Float valueOf;
        int i6;
        int i7;
        Float valueOf2;
        switch (this.a) {
            case 0:
                jfp jfpVar = (jfp) obj;
                jfpVar.getClass();
                wfp.s(jfpVar, this.b ? this.c : "");
                return Unit.a;
            case 1:
                jfp jfpVar2 = (jfp) obj;
                jfpVar2.getClass();
                if (this.b) {
                    wfp.s(jfpVar2, this.c);
                }
                return Unit.a;
            case 2:
                jfp jfpVar3 = (jfp) obj;
                jfpVar3.getClass();
                wfp.k(jfpVar3, this.c);
                wfp.q(jfpVar3, 0);
                if (!this.b) {
                    wfp.c(jfpVar3);
                }
                return Unit.a;
            case 3:
                jfp jfpVar4 = (jfp) obj;
                jfpVar4.getClass();
                wfp.s(jfpVar4, this.b ? this.c : "");
                return Unit.a;
            default:
                String str = this.c;
                boolean z = this.b;
                xjo xjoVar = (xjo) obj;
                xjoVar.getClass();
                cko D0 = xjoVar.D0("SELECT * FROM track_view\n        WHERE album_id = ?\n        ORDER BY\n          CASE WHEN ? THEN -vol ELSE vol END,\n          CASE WHEN ? THEN -position ELSE position END");
                try {
                    D0.E(1, str);
                    long j = z ? 1L : 0L;
                    D0.bindLong(2, j);
                    D0.bindLong(3, j);
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
                    int i8 = v14;
                    int v36 = s7g.v(D0, "artist_name");
                    int i9 = v13;
                    int v37 = s7g.v(D0, "artist_track_various");
                    int i10 = v12;
                    int v38 = s7g.v(D0, "artist_track_cover_uri");
                    int i11 = v11;
                    int v39 = s7g.v(D0, "artist_track_cutout_cover_uri");
                    int i12 = v10;
                    int v40 = s7g.v(D0, "artist_disclaimer");
                    int i13 = v9;
                    int v41 = s7g.v(D0, "original_release_year");
                    int i14 = v8;
                    int v42 = s7g.v(D0, "cover_uri");
                    int v43 = s7g.v(D0, "album_type");
                    int v44 = s7g.v(D0, "sort_order");
                    int i15 = v7;
                    ArrayList arrayList = new ArrayList();
                    while (D0.q()) {
                        String x03 = D0.x0(v35);
                        String x04 = D0.x0(v36);
                        int i16 = v6;
                        ArrayList arrayList2 = arrayList;
                        boolean z2 = ((int) D0.getLong(v37)) != 0;
                        String x05 = D0.isNull(v38) ? null : D0.x0(v38);
                        String x06 = D0.isNull(v39) ? null : D0.x0(v39);
                        String x07 = D0.isNull(v40) ? null : D0.x0(v40);
                        String x08 = D0.isNull(v41) ? null : D0.x0(v41);
                        String x09 = D0.isNull(v44) ? null : D0.x0(v44);
                        long j2 = D0.getLong(v);
                        String x010 = D0.x0(v2);
                        String x011 = D0.isNull(v3) ? null : D0.x0(v3);
                        String x012 = D0.x0(v4);
                        String x013 = D0.isNull(v5) ? null : D0.x0(v5);
                        v6 = i16;
                        String x014 = D0.x0(v6);
                        int i17 = v35;
                        int i18 = i15;
                        int i19 = v;
                        boolean z3 = ((int) D0.getLong(i18)) != 0;
                        int i20 = i14;
                        String x015 = D0.x0(i20);
                        int i21 = v36;
                        int i22 = i13;
                        int i23 = v3;
                        boolean z4 = ((int) D0.getLong(i22)) != 0;
                        int i24 = i12;
                        String x016 = D0.isNull(i24) ? null : D0.x0(i24);
                        int i25 = i11;
                        boolean z5 = ((int) D0.getLong(i25)) != 0;
                        int i26 = i10;
                        int i27 = v2;
                        boolean z6 = ((int) D0.getLong(i26)) != 0;
                        int i28 = i9;
                        boolean z7 = ((int) D0.getLong(i28)) != 0;
                        int i29 = i8;
                        String x017 = D0.x0(i29);
                        int i30 = v15;
                        String x018 = D0.isNull(i30) ? null : D0.x0(i30);
                        int i31 = v16;
                        String x019 = D0.isNull(i31) ? null : D0.x0(i31);
                        v16 = i31;
                        int i32 = v17;
                        if (D0.isNull(i32)) {
                            x0 = null;
                            v17 = i32;
                            i = i24;
                        } else {
                            x0 = D0.x0(i32);
                            i = i24;
                            v17 = i32;
                        }
                        int i33 = v18;
                        boolean z8 = ((int) D0.getLong(i33)) != 0;
                        int i34 = v19;
                        String x020 = D0.isNull(i34) ? null : D0.x0(i34);
                        int i35 = v20;
                        String x021 = D0.isNull(i35) ? null : D0.x0(i35);
                        int i36 = v21;
                        String x022 = D0.isNull(i36) ? null : D0.x0(i36);
                        v21 = i36;
                        int i37 = v22;
                        String x023 = D0.isNull(i37) ? null : D0.x0(i37);
                        v22 = i37;
                        int i38 = v23;
                        if (D0.isNull(i38)) {
                            x02 = null;
                            v23 = i38;
                            i3 = i34;
                            i2 = v24;
                        } else {
                            x02 = D0.x0(i38);
                            v23 = i38;
                            i2 = v24;
                            i3 = i34;
                        }
                        boolean z9 = ((int) D0.getLong(i2)) != 0;
                        int i39 = v25;
                        if (D0.isNull(i39)) {
                            i4 = i29;
                            i5 = i30;
                            valueOf = null;
                        } else {
                            i4 = i29;
                            i5 = i30;
                            valueOf = Float.valueOf((float) D0.getDouble(i39));
                        }
                        int i40 = v26;
                        if (D0.isNull(i40)) {
                            i6 = i2;
                            i7 = i39;
                            valueOf2 = null;
                        } else {
                            i6 = i2;
                            i7 = i39;
                            valueOf2 = Float.valueOf((float) D0.getDouble(i40));
                        }
                        int i41 = v27;
                        String x024 = D0.isNull(i41) ? null : D0.x0(i41);
                        int i42 = v28;
                        String x025 = D0.isNull(i42) ? null : D0.x0(i42);
                        v27 = i41;
                        int i43 = v29;
                        String x026 = D0.isNull(i43) ? null : D0.x0(i43);
                        v29 = i43;
                        int i44 = v30;
                        String x027 = D0.isNull(i44) ? null : D0.x0(i44);
                        v30 = i44;
                        int i45 = v31;
                        String x028 = D0.x0(i45);
                        v31 = i45;
                        int i46 = v32;
                        String x029 = D0.x0(i46);
                        v32 = i46;
                        int i47 = i4;
                        int i48 = v33;
                        int i49 = (int) D0.getLong(i48);
                        int i50 = v34;
                        int i51 = v42;
                        int i52 = v43;
                        v43 = i52;
                        v42 = i51;
                        arrayList2.add(new i2t(new ig5(x012, x013, x010, x011, j2, x014, z3, x015, z4, x016, z5, z6, z7, x017, x018, x019, x0, z8, x020, x021, x022, x023, x02, valueOf, valueOf2, z9, x024, x025, x026, x027, x029, x028, D0.x0(i52), D0.isNull(i51) ? null : D0.x0(i51), i49, (int) D0.getLong(i50)), x03, x04, z2, x05, x06, x07, x08, x09));
                        v34 = i50;
                        v2 = i27;
                        i10 = i26;
                        v15 = i5;
                        v25 = i7;
                        v26 = i40;
                        v36 = i21;
                        i14 = i20;
                        i11 = i25;
                        i9 = i28;
                        v18 = i33;
                        v19 = i3;
                        v20 = i35;
                        v24 = i6;
                        v3 = i23;
                        i13 = i22;
                        i12 = i;
                        i8 = i47;
                        v28 = i42;
                        v33 = i48;
                        v = i19;
                        i15 = i18;
                        arrayList = arrayList2;
                        v35 = i17;
                    }
                    return arrayList;
                } finally {
                    D0.close();
                }
        }
    }

    public /* synthetic */ ag3(boolean z, String str, int i) {
        this.a = i;
        this.b = z;
        this.c = str;
    }
}
