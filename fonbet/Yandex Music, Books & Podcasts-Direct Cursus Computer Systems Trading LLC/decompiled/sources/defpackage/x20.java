package defpackage;

import com.connectsdk.device.DefaultConnectableDeviceStore;
import com.connectsdk.service.DeviceService;
import com.yandex.auth.LegacyAccountType;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class x20 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ int c;

    public /* synthetic */ x20(int i, String str, int i2) {
        this.a = i2;
        this.c = i;
        this.b = str;
    }

    private final Object a(Object obj) {
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
        String str = this.b;
        int i9 = this.c;
        xjo xjoVar = (xjo) obj;
        xjoVar.getClass();
        cko D0 = xjoVar.D0("SELECT * FROM playlist WHERE uid=? AND original_id!=3 AND sync NOT IN (4) ORDER BY position LIMIT ?");
        try {
            D0.E(1, str);
            D0.bindLong(2, i9);
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
            ArrayList arrayList = new ArrayList();
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
                    i = v3;
                    i2 = v4;
                    valueOf = null;
                } else {
                    i = v3;
                    i2 = v4;
                    valueOf = Integer.valueOf((int) D0.getLong(v10));
                }
                Integer valueOf4 = D0.isNull(v11) ? null : Integer.valueOf((int) D0.getLong(v11));
                String x010 = D0.x0(v12);
                String x011 = D0.x0(v13);
                int i10 = (int) D0.getLong(v14);
                int i11 = v15;
                String x012 = D0.isNull(i11) ? null : D0.x0(i11);
                int i12 = v;
                int i13 = v16;
                Long valueOf5 = D0.isNull(i13) ? null : Long.valueOf(D0.getLong(i13));
                v16 = i13;
                int i14 = v17;
                if (D0.isNull(i14)) {
                    i3 = v14;
                    i4 = i10;
                    valueOf2 = null;
                } else {
                    i3 = v14;
                    i4 = i10;
                    valueOf2 = Integer.valueOf((int) D0.getLong(i14));
                }
                int i15 = v18;
                boolean z = ((int) D0.getLong(i15)) != 0;
                int i16 = v19;
                String x013 = D0.isNull(i16) ? null : D0.x0(i16);
                int i17 = v20;
                if (D0.isNull(i17)) {
                    i5 = i15;
                    i6 = i16;
                    valueOf3 = null;
                } else {
                    i5 = i15;
                    i6 = i16;
                    valueOf3 = Integer.valueOf((int) D0.getLong(i17));
                }
                int i18 = v21;
                String x014 = D0.isNull(i18) ? null : D0.x0(i18);
                int i19 = v22;
                String x015 = D0.isNull(i19) ? null : D0.x0(i19);
                int i20 = v23;
                String x016 = D0.isNull(i20) ? null : D0.x0(i20);
                v23 = i20;
                int i21 = v24;
                String x017 = D0.isNull(i21) ? null : D0.x0(i21);
                v24 = i21;
                int i22 = v25;
                if (D0.isNull(i22)) {
                    x0 = null;
                    v25 = i22;
                    i8 = i18;
                    i7 = v26;
                } else {
                    x0 = D0.x0(i22);
                    v25 = i22;
                    i7 = v26;
                    i8 = i18;
                }
                int i23 = v27;
                int i24 = v28;
                int i25 = i7;
                arrayList.add(new ytl(i4, j, valueOf, valueOf4, valueOf2, valueOf3, valueOf5, x02, x03, x04, x05, x06, x07, x08, x09, x010, x011, x012, x013, x014, x015, x016, x017, x0, D0.isNull(i23) ? null : D0.x0(i23), D0.isNull(i24) ? null : D0.x0(i24), z, ((int) D0.getLong(i7)) != 0));
                v27 = i23;
                v28 = i24;
                v = i12;
                v14 = i3;
                v15 = i11;
                v18 = i5;
                v17 = i14;
                v21 = i8;
                v22 = i19;
                v3 = i;
                v20 = i17;
                v26 = i25;
                v4 = i2;
                v19 = i6;
            }
            return arrayList;
        } finally {
            D0.close();
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        cko D0;
        int i;
        int i2;
        Integer valueOf;
        Boolean bool;
        int i3;
        Integer valueOf2;
        Boolean bool2;
        int i4;
        Boolean bool3;
        Integer valueOf3;
        Boolean bool4;
        int i5;
        Boolean bool5;
        Float valueOf4;
        int i6;
        int i7;
        Integer valueOf5;
        Boolean bool6;
        Float f;
        int i8;
        Integer valueOf6;
        Boolean bool7;
        int i9;
        int i10;
        Integer valueOf7;
        Boolean bool8;
        int i11;
        Float f2;
        Integer valueOf8;
        Boolean bool9;
        int i12;
        int i13;
        Float valueOf9;
        int i14;
        Float valueOf10;
        int i15;
        int i16;
        Float valueOf11;
        int i17;
        int i18;
        Integer valueOf12;
        Boolean bool10;
        int i19;
        int i20;
        Integer valueOf13;
        Boolean bool11;
        int i21;
        Float valueOf14;
        int i22;
        int i23;
        Integer valueOf15;
        switch (this.a) {
            case 0:
                int i24 = this.c;
                String str = this.b;
                xjo xjoVar = (xjo) obj;
                xjoVar.getClass();
                D0 = xjoVar.D0("UPDATE album SET likes_count=? WHERE original_id=?");
                try {
                    D0.bindLong(1, i24);
                    D0.E(2, str);
                    D0.q();
                    D0.close();
                    return Unit.a;
                } finally {
                }
            case 1:
                String str2 = this.b;
                int i25 = this.c;
                xjo xjoVar2 = (xjo) obj;
                xjoVar2.getClass();
                D0 = xjoVar2.D0("DELETE FROM playlist_operation WHERE playlist_id = ? AND operation = ?");
                try {
                    D0.E(1, str2);
                    D0.bindLong(2, i25);
                    D0.q();
                    D0.close();
                    return Unit.a;
                } finally {
                }
            case 2:
                String str3 = this.b;
                int i26 = this.c;
                xjo xjoVar3 = (xjo) obj;
                xjoVar3.getClass();
                D0 = xjoVar3.D0("DELETE FROM video_clip_operation WHERE video_clip_id = ? AND operation = ?");
                try {
                    D0.E(1, str3);
                    D0.bindLong(2, i26);
                    D0.q();
                    D0.close();
                    return Unit.a;
                } finally {
                }
            case 3:
                String str4 = this.b;
                int i27 = this.c;
                xjo xjoVar4 = (xjo) obj;
                xjoVar4.getClass();
                D0 = xjoVar4.D0("DELETE FROM album_operation WHERE album_id = ? AND operation = ?");
                try {
                    D0.E(1, str4);
                    D0.bindLong(2, i27);
                    D0.q();
                    D0.close();
                    return Unit.a;
                } finally {
                }
            case 4:
                String str5 = this.b;
                int i28 = this.c;
                xjo xjoVar5 = (xjo) obj;
                xjoVar5.getClass();
                D0 = xjoVar5.D0("DELETE FROM artist_operation WHERE artist_id = ? AND operation = ?");
                try {
                    D0.E(1, str5);
                    D0.bindLong(2, i28);
                    D0.q();
                    D0.close();
                    return Unit.a;
                } finally {
                }
            case 5:
                String str6 = this.b;
                int i29 = this.c;
                xjo xjoVar6 = (xjo) obj;
                xjoVar6.getClass();
                D0 = xjoVar6.D0("SELECT * FROM PlayAudioBundle WHERE mUserID = ? LIMIT ?");
                try {
                    D0.E(1, str6);
                    D0.bindLong(2, i29);
                    int v = s7g.v(D0, "_id");
                    int v2 = s7g.v(D0, "mAddTracksToPlayerTime");
                    int v3 = s7g.v(D0, "mAlbumID");
                    int v4 = s7g.v(D0, "mAliceSessionId");
                    int v5 = s7g.v(D0, "mAudioAuto");
                    int v6 = s7g.v(D0, "mAudioOutputName");
                    int v7 = s7g.v(D0, "mAudioOutputType");
                    int v8 = s7g.v(D0, "mBlockId");
                    int v9 = s7g.v(D0, "batchId");
                    int v10 = s7g.v(D0, "pumpkin");
                    int v11 = s7g.v(D0, "autoflow");
                    int v12 = s7g.v(D0, "offlineWave");
                    int v13 = s7g.v(D0, "mContext");
                    int v14 = s7g.v(D0, "mContextItem");
                    int v15 = s7g.v(D0, "mEndPosition");
                    int v16 = s7g.v(D0, "seeked");
                    int v17 = s7g.v(D0, "paused");
                    int v18 = s7g.v(D0, "mEntityId");
                    int v19 = s7g.v(D0, "mEventId");
                    int v20 = s7g.v(D0, "mFrom");
                    int v21 = s7g.v(D0, "repeated");
                    int v22 = s7g.v(D0, "mGenerativeStreamId");
                    int v23 = s7g.v(D0, "mIsFromCache");
                    int v24 = s7g.v(D0, "mListenActivity");
                    int v25 = s7g.v(D0, "mMeta");
                    int v26 = s7g.v(D0, "startTimestamp");
                    int v27 = s7g.v(D0, "mPlayedTime");
                    int v28 = s7g.v(D0, "mPlaylistId");
                    int v29 = s7g.v(D0, "mRadioSessionId");
                    int v30 = s7g.v(D0, "mStartPosition");
                    int v31 = s7g.v(D0, "mTotalPlayedTime");
                    int v32 = s7g.v(D0, "mTrackID");
                    int v33 = s7g.v(D0, "mTrackLength");
                    int v34 = s7g.v(D0, "mUniquePlayId");
                    int v35 = s7g.v(D0, "mUserID");
                    int v36 = s7g.v(D0, "maxPlayerStage");
                    int v37 = s7g.v(D0, "isSmartPreview");
                    int v38 = s7g.v(D0, "navigationId");
                    int v39 = s7g.v(D0, "utmCampaign");
                    int v40 = s7g.v(D0, "utmMedium");
                    int v41 = s7g.v(D0, "utmSource");
                    int v42 = s7g.v(D0, "utmTerm");
                    int v43 = s7g.v(D0, "yclid");
                    int v44 = s7g.v(D0, "playbackActionId");
                    int v45 = s7g.v(D0, "changeReason");
                    int v46 = s7g.v(D0, "continued");
                    int v47 = s7g.v(D0, "expectedTrackLength");
                    int v48 = s7g.v(D0, "fadeMode");
                    int v49 = s7g.v(D0, "isLivePlayableIndex");
                    ArrayList arrayList = new ArrayList();
                    while (D0.q()) {
                        long j = D0.getLong(v);
                        Boolean bool12 = null;
                        String x0 = D0.isNull(v2) ? null : D0.x0(v2);
                        String x02 = D0.isNull(v3) ? null : D0.x0(v3);
                        String x03 = D0.isNull(v4) ? null : D0.x0(v4);
                        String x04 = D0.isNull(v5) ? null : D0.x0(v5);
                        String x05 = D0.isNull(v6) ? null : D0.x0(v6);
                        String x06 = D0.isNull(v7) ? null : D0.x0(v7);
                        String x07 = D0.isNull(v8) ? null : D0.x0(v8);
                        String x08 = D0.isNull(v9) ? null : D0.x0(v9);
                        if (D0.isNull(v10)) {
                            i = v3;
                            i2 = v4;
                            valueOf = null;
                        } else {
                            i = v3;
                            i2 = v4;
                            valueOf = Integer.valueOf((int) D0.getLong(v10));
                        }
                        if (valueOf != null) {
                            bool = Boolean.valueOf(valueOf.intValue() != 0);
                        } else {
                            bool = null;
                        }
                        if (D0.isNull(v11)) {
                            i3 = v5;
                            valueOf2 = null;
                        } else {
                            i3 = v5;
                            valueOf2 = Integer.valueOf((int) D0.getLong(v11));
                        }
                        if (valueOf2 != null) {
                            bool2 = Boolean.valueOf(valueOf2.intValue() != 0);
                        } else {
                            bool2 = null;
                        }
                        if (D0.isNull(v12)) {
                            i4 = i3;
                            bool3 = bool2;
                            valueOf3 = null;
                        } else {
                            i4 = i3;
                            bool3 = bool2;
                            valueOf3 = Integer.valueOf((int) D0.getLong(v12));
                        }
                        if (valueOf3 != null) {
                            bool4 = Boolean.valueOf(valueOf3.intValue() != 0);
                        } else {
                            bool4 = null;
                        }
                        String x09 = D0.isNull(v13) ? null : D0.x0(v13);
                        String x010 = D0.isNull(v14) ? null : D0.x0(v14);
                        int i30 = v15;
                        if (D0.isNull(i30)) {
                            i5 = v14;
                            bool5 = bool4;
                            valueOf4 = null;
                        } else {
                            i5 = v14;
                            bool5 = bool4;
                            valueOf4 = Float.valueOf((float) D0.getDouble(i30));
                        }
                        int i31 = v16;
                        if (D0.isNull(i31)) {
                            i6 = i30;
                            i7 = i4;
                            valueOf5 = null;
                        } else {
                            i6 = i30;
                            i7 = i4;
                            valueOf5 = Integer.valueOf((int) D0.getLong(i31));
                        }
                        if (valueOf5 != null) {
                            bool6 = Boolean.valueOf(valueOf5.intValue() != 0);
                        } else {
                            bool6 = null;
                        }
                        int i32 = v17;
                        if (D0.isNull(i32)) {
                            f = valueOf4;
                            i8 = i31;
                            valueOf6 = null;
                        } else {
                            f = valueOf4;
                            i8 = i31;
                            valueOf6 = Integer.valueOf((int) D0.getLong(i32));
                        }
                        if (valueOf6 != null) {
                            bool7 = Boolean.valueOf(valueOf6.intValue() != 0);
                        } else {
                            bool7 = null;
                        }
                        int i33 = v18;
                        String x011 = D0.isNull(i33) ? null : D0.x0(i33);
                        int i34 = v19;
                        String x012 = D0.isNull(i34) ? null : D0.x0(i34);
                        int i35 = v;
                        int i36 = v20;
                        String x013 = D0.isNull(i36) ? null : D0.x0(i36);
                        v20 = i36;
                        int i37 = v21;
                        if (D0.isNull(i37)) {
                            i9 = i33;
                            i10 = i34;
                            valueOf7 = null;
                        } else {
                            i9 = i33;
                            i10 = i34;
                            valueOf7 = Integer.valueOf((int) D0.getLong(i37));
                        }
                        if (valueOf7 != null) {
                            bool8 = Boolean.valueOf(valueOf7.intValue() != 0);
                        } else {
                            bool8 = null;
                        }
                        int i38 = v22;
                        String x014 = D0.isNull(i38) ? null : D0.x0(i38);
                        int i39 = v23;
                        if (D0.isNull(i39)) {
                            i11 = i32;
                            f2 = f;
                            valueOf8 = null;
                        } else {
                            i11 = i32;
                            f2 = f;
                            valueOf8 = Integer.valueOf((int) D0.getLong(i39));
                        }
                        if (valueOf8 != null) {
                            bool9 = Boolean.valueOf(valueOf8.intValue() != 0);
                        } else {
                            bool9 = null;
                        }
                        int i40 = v24;
                        String x015 = D0.isNull(i40) ? null : D0.x0(i40);
                        int i41 = v25;
                        String x016 = D0.isNull(i41) ? null : D0.x0(i41);
                        int i42 = v26;
                        String x017 = D0.isNull(i42) ? null : D0.x0(i42);
                        v26 = i42;
                        int i43 = v27;
                        String x018 = D0.isNull(i43) ? null : D0.x0(i43);
                        v27 = i43;
                        int i44 = v28;
                        String x019 = D0.isNull(i44) ? null : D0.x0(i44);
                        v28 = i44;
                        int i45 = v29;
                        String x020 = D0.isNull(i45) ? null : D0.x0(i45);
                        v29 = i45;
                        int i46 = v30;
                        if (D0.isNull(i46)) {
                            i12 = i38;
                            i13 = i39;
                            valueOf9 = null;
                        } else {
                            i12 = i38;
                            i13 = i39;
                            valueOf9 = Float.valueOf((float) D0.getDouble(i46));
                        }
                        int i47 = v31;
                        if (D0.isNull(i47)) {
                            i14 = i40;
                            valueOf10 = null;
                        } else {
                            i14 = i40;
                            valueOf10 = Float.valueOf((float) D0.getDouble(i47));
                        }
                        int i48 = v32;
                        String x021 = D0.isNull(i48) ? null : D0.x0(i48);
                        int i49 = v33;
                        if (D0.isNull(i49)) {
                            i15 = i47;
                            i16 = i48;
                            valueOf11 = null;
                        } else {
                            i15 = i47;
                            i16 = i48;
                            valueOf11 = Float.valueOf((float) D0.getDouble(i49));
                        }
                        int i50 = v34;
                        String x022 = D0.isNull(i50) ? null : D0.x0(i50);
                        int i51 = v35;
                        String x023 = D0.isNull(i51) ? null : D0.x0(i51);
                        int i52 = v36;
                        String x024 = D0.isNull(i52) ? null : D0.x0(i52);
                        v36 = i52;
                        int i53 = v37;
                        if (D0.isNull(i53)) {
                            i17 = i50;
                            i18 = i51;
                            valueOf12 = null;
                        } else {
                            i17 = i50;
                            i18 = i51;
                            valueOf12 = Integer.valueOf((int) D0.getLong(i53));
                        }
                        if (valueOf12 != null) {
                            bool10 = Boolean.valueOf(valueOf12.intValue() != 0);
                        } else {
                            bool10 = null;
                        }
                        int i54 = v38;
                        String x025 = D0.isNull(i54) ? null : D0.x0(i54);
                        int i55 = v39;
                        String x026 = D0.isNull(i55) ? null : D0.x0(i55);
                        int i56 = v40;
                        String x027 = D0.isNull(i56) ? null : D0.x0(i56);
                        v40 = i56;
                        int i57 = v41;
                        String x028 = D0.isNull(i57) ? null : D0.x0(i57);
                        v41 = i57;
                        int i58 = v42;
                        String x029 = D0.isNull(i58) ? null : D0.x0(i58);
                        v42 = i58;
                        int i59 = v43;
                        String x030 = D0.isNull(i59) ? null : D0.x0(i59);
                        v43 = i59;
                        int i60 = v44;
                        String x031 = D0.isNull(i60) ? null : D0.x0(i60);
                        v44 = i60;
                        int i61 = v45;
                        String x032 = D0.isNull(i61) ? null : D0.x0(i61);
                        v45 = i61;
                        int i62 = v46;
                        if (D0.isNull(i62)) {
                            i19 = i54;
                            i20 = i55;
                            valueOf13 = null;
                        } else {
                            i19 = i54;
                            i20 = i55;
                            valueOf13 = Integer.valueOf((int) D0.getLong(i62));
                        }
                        if (valueOf13 != null) {
                            bool11 = Boolean.valueOf(valueOf13.intValue() != 0);
                        } else {
                            bool11 = null;
                        }
                        int i63 = v47;
                        if (D0.isNull(i63)) {
                            i21 = i49;
                            valueOf14 = null;
                        } else {
                            i21 = i49;
                            valueOf14 = Float.valueOf((float) D0.getDouble(i63));
                        }
                        int i64 = v48;
                        String x033 = D0.isNull(i64) ? null : D0.x0(i64);
                        int i65 = v49;
                        if (D0.isNull(i65)) {
                            i22 = i63;
                            i23 = i64;
                            valueOf15 = null;
                        } else {
                            i22 = i63;
                            i23 = i64;
                            valueOf15 = Integer.valueOf((int) D0.getLong(i65));
                        }
                        if (valueOf15 != null) {
                            bool12 = Boolean.valueOf(valueOf15.intValue() != 0);
                        }
                        arrayList.add(new fvk(j, x0, x02, x03, x04, x05, x06, x07, x08, bool, bool3, bool5, x09, x010, f2, bool6, bool7, x011, x012, x013, bool8, x014, bool9, x015, x016, x017, x018, x019, x020, valueOf9, valueOf10, x021, valueOf11, x022, x023, x024, bool10, x025, x026, x027, x028, x029, x030, x031, x032, bool11, valueOf14, x033, bool12));
                        int i66 = i12;
                        v25 = i41;
                        v5 = i7;
                        v16 = i8;
                        v17 = i11;
                        v22 = i66;
                        v14 = i5;
                        v23 = i13;
                        v30 = i46;
                        v34 = i17;
                        v35 = i18;
                        v37 = i53;
                        v38 = i19;
                        v39 = i20;
                        v3 = i;
                        v15 = i6;
                        v46 = i62;
                        v = i35;
                        v18 = i9;
                        v19 = i10;
                        v21 = i37;
                        v24 = i14;
                        v31 = i15;
                        v32 = i16;
                        v33 = i21;
                        v47 = i22;
                        v48 = i23;
                        v49 = i65;
                        v4 = i2;
                    }
                    return arrayList;
                } catch (Throwable th) {
                    throw th;
                }
            case 6:
                return a(obj);
            case 7:
                String str7 = this.b;
                int i67 = this.c;
                xjo xjoVar7 = (xjo) obj;
                xjoVar7.getClass();
                D0 = xjoVar7.D0("SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?");
                try {
                    D0.E(1, str7);
                    D0.bindLong(2, i67);
                    return D0.q() ? new izr(D0.x0(s7g.v(D0, "work_spec_id")), (int) D0.getLong(s7g.v(D0, "generation")), (int) D0.getLong(s7g.v(D0, "system_id"))) : null;
                } finally {
                }
            case 8:
                String str8 = this.b;
                int i68 = this.c;
                xjo xjoVar8 = (xjo) obj;
                xjoVar8.getClass();
                D0 = xjoVar8.D0("UPDATE workspec SET next_schedule_time_override=9223372036854775807 WHERE (id=? AND next_schedule_time_override_generation=?)");
                try {
                    D0.E(1, str8);
                    D0.bindLong(2, i68);
                    D0.q();
                    D0.close();
                    return Unit.a;
                } finally {
                }
            default:
                int i69 = this.c;
                String str9 = this.b;
                xjo xjoVar9 = (xjo) obj;
                xjoVar9.getClass();
                D0 = xjoVar9.D0("UPDATE workspec SET stop_reason=? WHERE id=?");
                try {
                    D0.bindLong(1, i69);
                    D0.E(2, str9);
                    D0.q();
                    D0.close();
                    return Unit.a;
                } finally {
                }
        }
    }

    public /* synthetic */ x20(String str, int i, int i2) {
        this.a = i2;
        this.b = str;
        this.c = i;
    }
}
