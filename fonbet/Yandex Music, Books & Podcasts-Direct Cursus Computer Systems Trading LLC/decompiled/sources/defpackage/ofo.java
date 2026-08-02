package defpackage;

import com.yandex.music.shared.backend_utils.MusicBackendInvocationError;
import com.yandex.music.shared.backend_utils.MusicBackendResponse;
import com.yandex.music.shared.dto.wave.recommendation.IconDto;
import com.yandex.music.shared.dto.wave.recommendation.RadioRestrictionValueDto;
import com.yandex.music.shared.dto.wave.recommendation.RestrictionDto;
import com.yandex.music.shared.dto.wave.recommendation.SessionInfoResponseDto;
import com.yandex.music.shared.dto.wave.recommendation.StationIdDto;
import com.yandex.music.shared.dto.wave.recommendation.StationMetaDto;
import com.yandex.music.shared.dto.wave.recommendation.StationWithSettingsDto;
import com.yandex.music.shared.dto.wave.recommendation.WaveDto;
import com.yandex.music.shared.dto.wave.recommendation.WaveLastDto;
import com.yandex.music.shared.dto.wave.recommendation.WaveLastPromoDto;
import com.yandex.music.shared.radio.recommendation.RotorApi;
import com.yandex.music.shared.radio.recommendation.data.dto.StationContextDto;
import com.yandex.music.shared.radio.recommendation.data.dto.WaveSettingsBlockDto;
import com.yandex.music.shared.radio.recommendation.data.dto.WaveSettingsResponseDto;
import com.yandex.music.shared.radio.recommendation.data.response.StationIdDtoRequest;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Call;
import ru.yandex.music.data.stores.WebPath$Storage;
import ru.yandex.music.data.wave.recommendations.Icon;
import ru.yandex.music.data.wave.recommendations.StationId;

/* loaded from: classes4.dex */
public final class ofo {
    public final RotorApi a;

    public ofo(RotorApi rotorApi) {
        this.a = rotorApi;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(StationId stationId, cg6 cg6Var) {
        kfo kfoVar;
        int i;
        bii biiVar;
        egr egrVar;
        StationIdDto id;
        Map map;
        Map map2;
        if (cg6Var instanceof kfo) {
            kfoVar = (kfo) cg6Var;
            int i2 = kfoVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kfoVar.l = i2 - Integer.MIN_VALUE;
                Object obj = kfoVar.j;
                nm6 nm6Var = nm6.a;
                i = kfoVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    stationId.getClass();
                    String p = stationId.p();
                    p.getClass();
                    String n = stationId.n();
                    n.getClass();
                    Call<MusicBackendResponse<List<StationWithSettingsDto>>> d = this.a.d(new StationIdDtoRequest(p, n));
                    kfoVar.l = 1;
                    obj = swf.N(d, kfoVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                biiVar = (bii) obj;
                if (biiVar instanceof aii) {
                    if (biiVar instanceof xhi) {
                        xhi xhiVar = (xhi) biiVar;
                        MusicBackendInvocationError musicBackendInvocationError = xhiVar.c;
                        int i3 = xhiVar.b;
                        String name = musicBackendInvocationError.getName();
                        String str = name == null ? "" : name;
                        String message = musicBackendInvocationError.getMessage();
                        return new kj6(i3, musicBackendInvocationError.getDetails(), str, message == null ? "" : message, xhiVar.a);
                    }
                    if (biiVar instanceof yhi) {
                        yhi yhiVar = (yhi) biiVar;
                        return new lj6(yhiVar.b, yhiVar.c, yhiVar.a);
                    }
                    if (biiVar instanceof zhi) {
                        return uwf.J((zhi) biiVar);
                    }
                    b6e.s();
                    return null;
                }
                List list = (List) ((aii) biiVar).a;
                if (!list.isEmpty()) {
                    StationWithSettingsDto stationWithSettingsDto = (StationWithSettingsDto) list.get(0);
                    stationWithSettingsDto.getClass();
                    StationMetaDto stationMeta = stationWithSettingsDto.getStationMeta();
                    if (stationMeta != null && (id = stationMeta.getId()) != null) {
                        StationId T = asq.T(id);
                        String name2 = stationWithSettingsDto.getStationMeta().getName();
                        String str2 = name2 == null ? "" : name2;
                        IconDto icon = stationWithSettingsDto.getStationMeta().getIcon();
                        Icon a0 = icon != null ? vwb.a0(icon) : Icon.a;
                        a0.getClass();
                        String idForFrom = stationWithSettingsDto.getStationMeta().getIdForFrom();
                        String str3 = idForFrom == null ? "" : idForFrom;
                        String customName = stationWithSettingsDto.getCustomName();
                        Map stationRestrictions = stationWithSettingsDto.getStationMeta().getStationRestrictions();
                        if (stationRestrictions == null || (map = rzf.B(stationRestrictions)) == null) {
                            map = e5b.a;
                            map.getClass();
                        }
                        Map map3 = map;
                        Map settings = stationWithSettingsDto.getSettings();
                        if (settings != null) {
                            map2 = new LinkedHashMap();
                            for (Map.Entry entry : settings.entrySet()) {
                                Object key = entry.getKey();
                                Object value = entry.getValue();
                                if (key != null && value != null) {
                                    map2.put(entry.getKey(), entry.getValue());
                                }
                            }
                        } else {
                            map2 = e5b.a;
                            map2.getClass();
                        }
                        egrVar = new egr(T, str2, a0, str3, customName, map3, map2);
                        return egrVar != null ? new nj6(null) : new qj6(egrVar);
                    }
                }
                egrVar = null;
                if (egrVar != null) {
                }
            }
        }
        kfoVar = new kfo(this, cg6Var);
        Object obj2 = kfoVar.j;
        nm6 nm6Var2 = nm6.a;
        i = kfoVar.l;
        if (i != 0) {
        }
        biiVar = (bii) obj2;
        if (biiVar instanceof aii) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(cg6 cg6Var) {
        lfo lfoVar;
        int i;
        bii biiVar;
        cuu cuuVar;
        xxu xxuVar;
        String notificationStationId;
        String notificationHash;
        if (cg6Var instanceof lfo) {
            lfoVar = (lfo) cg6Var;
            int i2 = lfoVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lfoVar.l = i2 - Integer.MIN_VALUE;
                Object obj = lfoVar.j;
                nm6 nm6Var = nm6.a;
                i = lfoVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    Call<MusicBackendResponse<WaveLastDto>> a = this.a.a();
                    lfoVar.l = 1;
                    obj = swf.N(a, lfoVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                biiVar = (bii) obj;
                if (biiVar instanceof aii) {
                    if (!(biiVar instanceof xhi)) {
                        if (biiVar instanceof yhi) {
                            yhi yhiVar = (yhi) biiVar;
                            return new lj6(yhiVar.b, yhiVar.c, yhiVar.a);
                        }
                        if (biiVar instanceof zhi) {
                            return uwf.J((zhi) biiVar);
                        }
                        b6e.s();
                        return null;
                    }
                    xhi xhiVar = (xhi) biiVar;
                    MusicBackendInvocationError musicBackendInvocationError = xhiVar.c;
                    int i3 = xhiVar.b;
                    String name = musicBackendInvocationError.getName();
                    if (name == null) {
                        name = "";
                    }
                    String message = musicBackendInvocationError.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    return new kj6(i3, musicBackendInvocationError.getDetails(), name, message, xhiVar.a);
                }
                WaveLastDto waveLastDto = (WaveLastDto) ((aii) biiVar).a;
                waveLastDto.getClass();
                yku L = w1g.L(new WaveDto(waveLastDto));
                if (L == null) {
                    cuuVar = null;
                } else {
                    WaveLastPromoDto promo = waveLastDto.getPromo();
                    if (promo != null && (notificationStationId = promo.getNotificationStationId()) != null) {
                        StationId f = StationId.f(notificationStationId);
                        if (Intrinsics.d(f, StationId.a)) {
                            f = null;
                        }
                        if (f != null && (notificationHash = promo.getNotificationHash()) != null) {
                            xxuVar = new xxu(f, notificationHash);
                            cuuVar = new cuu(L, xxuVar);
                        }
                    }
                    xxuVar = null;
                    cuuVar = new cuu(L, xxuVar);
                }
                return cuuVar == null ? new nj6(null) : new qj6(cuuVar);
            }
        }
        lfoVar = new lfo(this, cg6Var);
        Object obj2 = lfoVar.j;
        nm6 nm6Var2 = nm6.a;
        i = lfoVar.l;
        if (i != 0) {
        }
        biiVar = (bii) obj2;
        if (biiVar instanceof aii) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, cg6 cg6Var) {
        mfo mfoVar;
        int i;
        bii biiVar;
        WaveDto wave;
        yku L;
        if (cg6Var instanceof mfo) {
            mfoVar = (mfo) cg6Var;
            int i2 = mfoVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mfoVar.l = i2 - Integer.MIN_VALUE;
                Object obj = mfoVar.j;
                nm6 nm6Var = nm6.a;
                i = mfoVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    Call<MusicBackendResponse<SessionInfoResponseDto>> b = this.a.b(str);
                    mfoVar.l = 1;
                    obj = swf.N(b, mfoVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                biiVar = (bii) obj;
                if (!(biiVar instanceof aii)) {
                    SessionInfoResponseDto sessionInfoResponseDto = (SessionInfoResponseDto) ((aii) biiVar).a;
                    sessionInfoResponseDto.getClass();
                    String sessionId = sessionInfoResponseDto.getSessionId();
                    emp empVar = (sessionId == null || (wave = sessionInfoResponseDto.getWave()) == null || (L = w1g.L(wave)) == null) ? null : new emp(sessionId, L);
                    yku ykuVar = empVar != null ? empVar.b : null;
                    return ykuVar == null ? new nj6(null) : new qj6(ykuVar);
                }
                if (!(biiVar instanceof xhi)) {
                    if (biiVar instanceof yhi) {
                        yhi yhiVar = (yhi) biiVar;
                        return new lj6(yhiVar.b, yhiVar.c, yhiVar.a);
                    }
                    if (biiVar instanceof zhi) {
                        return uwf.J((zhi) biiVar);
                    }
                    b6e.s();
                    return null;
                }
                xhi xhiVar = (xhi) biiVar;
                MusicBackendInvocationError musicBackendInvocationError = xhiVar.c;
                int i3 = xhiVar.b;
                String name = musicBackendInvocationError.getName();
                if (name == null) {
                    name = "";
                }
                String message = musicBackendInvocationError.getMessage();
                if (message == null) {
                    message = "";
                }
                return new kj6(i3, musicBackendInvocationError.getDetails(), name, message, xhiVar.a);
            }
        }
        mfoVar = new mfo(this, cg6Var);
        Object obj2 = mfoVar.j;
        nm6 nm6Var2 = nm6.a;
        i = mfoVar.l;
        if (i != 0) {
        }
        biiVar = (bii) obj2;
        if (!(biiVar instanceof aii)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0062 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(Collection collection, cg6 cg6Var) {
        nfo nfoVar;
        int i;
        String str;
        bii biiVar;
        ArrayList arrayList;
        zgn zgnVar;
        h5v h5vVar;
        cgr cgrVar;
        Map map;
        String specialContextImage;
        if (cg6Var instanceof nfo) {
            nfoVar = (nfo) cg6Var;
            int i2 = nfoVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nfoVar.l = i2 - Integer.MIN_VALUE;
                Object obj = nfoVar.j;
                nm6 nm6Var = nm6.a;
                i = nfoVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    if (collection != null) {
                        Collection collection2 = !collection.isEmpty() ? collection : null;
                        if (collection2 != null) {
                            str = CollectionsKt.X(collection2, StringUtils.COMMA, null, null, null, 62);
                            Call<MusicBackendResponse<WaveSettingsResponseDto>> e = this.a.e(str);
                            nfoVar.l = 1;
                            obj = swf.N(e, nfoVar);
                            if (obj == nm6Var) {
                                return nm6Var;
                            }
                        }
                    }
                    str = null;
                    Call<MusicBackendResponse<WaveSettingsResponseDto>> e2 = this.a.e(str);
                    nfoVar.l = 1;
                    obj = swf.N(e2, nfoVar);
                    if (obj == nm6Var) {
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                biiVar = (bii) obj;
                if (biiVar instanceof aii) {
                    if (biiVar instanceof xhi) {
                        xhi xhiVar = (xhi) biiVar;
                        MusicBackendInvocationError musicBackendInvocationError = xhiVar.c;
                        int i3 = xhiVar.b;
                        String name = musicBackendInvocationError.getName();
                        String str2 = name == null ? "" : name;
                        String message = musicBackendInvocationError.getMessage();
                        return new kj6(i3, musicBackendInvocationError.getDetails(), str2, message == null ? "" : message, xhiVar.a);
                    }
                    if (biiVar instanceof yhi) {
                        yhi yhiVar = (yhi) biiVar;
                        return new lj6(yhiVar.b, yhiVar.c, yhiVar.a);
                    }
                    if (biiVar instanceof zhi) {
                        return uwf.J((zhi) biiVar);
                    }
                    b6e.s();
                    return null;
                }
                WaveSettingsResponseDto waveSettingsResponseDto = (WaveSettingsResponseDto) ((aii) biiVar).a;
                waveSettingsResponseDto.getClass();
                List<WaveSettingsBlockDto> blocks = waveSettingsResponseDto.getBlocks();
                if (blocks == null) {
                    blocks = c5b.a;
                }
                ArrayList arrayList2 = new ArrayList();
                for (WaveSettingsBlockDto waveSettingsBlockDto : blocks) {
                    if ((waveSettingsBlockDto != null ? waveSettingsBlockDto.getType() : null) == null || waveSettingsBlockDto.getItems() == null) {
                        h5vVar = null;
                    } else {
                        String type = waveSettingsBlockDto.getType();
                        List<StationContextDto> items = waveSettingsBlockDto.getItems();
                        ArrayList arrayList3 = new ArrayList();
                        for (StationContextDto stationContextDto : items) {
                            if (stationContextDto != null) {
                                StationIdDto id = stationContextDto.getId();
                                StationId T = id != null ? asq.T(id) : StationId.a;
                                T.getClass();
                                String name2 = stationContextDto.getName();
                                String str3 = name2 == null ? "" : name2;
                                String idForFrom = stationContextDto.getIdForFrom();
                                String str4 = idForFrom == null ? "" : idForFrom;
                                jcv jcvVar = (!Intrinsics.d(stationContextDto.getSpecialContext(), Boolean.TRUE) || (specialContextImage = stationContextDto.getSpecialContextImage()) == null) ? null : new jcv(specialContextImage, WebPath$Storage.AVATARS_NO_CROP);
                                Map stationRestrictions = stationContextDto.getStationRestrictions();
                                if (stationRestrictions == null || (map = rzf.B(stationRestrictions)) == null) {
                                    map = e5b.a;
                                    map.getClass();
                                }
                                cgrVar = new cgr(T, str3, str4, jcvVar, map, false);
                            } else {
                                cgrVar = null;
                            }
                            if (cgrVar != null) {
                                arrayList3.add(cgrVar);
                            }
                        }
                        h5vVar = new h5v(type, arrayList3);
                    }
                    if (h5vVar != null) {
                        arrayList2.add(h5vVar);
                    }
                }
                Map settingRestrictions = waveSettingsResponseDto.getSettingRestrictions();
                if (settingRestrictions == null) {
                    settingRestrictions = e5b.a;
                    settingRestrictions.getClass();
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : settingRestrictions.entrySet()) {
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    if (key != null && value != null) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                    String str5 = (String) entry2.getKey();
                    RestrictionDto restrictionDto = (RestrictionDto) entry2.getValue();
                    List<RadioRestrictionValueDto> possibleValues = restrictionDto.getPossibleValues();
                    if (possibleValues != null) {
                        arrayList = new ArrayList();
                        for (RadioRestrictionValueDto radioRestrictionValueDto : possibleValues) {
                            if ((radioRestrictionValueDto != null ? radioRestrictionValueDto.getName() : null) == null || radioRestrictionValueDto.getValue() == null || radioRestrictionValueDto.getSerializedSeed() == null) {
                                zgnVar = null;
                            } else if (Intrinsics.d(radioRestrictionValueDto.getIsUnspecified(), Boolean.TRUE)) {
                                String name3 = radioRestrictionValueDto.getName();
                                name3.getClass();
                                String value2 = radioRestrictionValueDto.getValue();
                                value2.getClass();
                                String serializedSeed = radioRestrictionValueDto.getSerializedSeed();
                                serializedSeed.getClass();
                                zgnVar = new ygn(name3, value2, serializedSeed);
                            } else {
                                String name4 = radioRestrictionValueDto.getName();
                                name4.getClass();
                                String value3 = radioRestrictionValueDto.getValue();
                                value3.getClass();
                                String serializedSeed2 = radioRestrictionValueDto.getSerializedSeed();
                                serializedSeed2.getClass();
                                zgnVar = new xgn(name4, value3, serializedSeed2, radioRestrictionValueDto.getImageUrl());
                            }
                            if (zgnVar != null) {
                                arrayList.add(zgnVar);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                    if (restrictionDto.getName() != null && arrayList != null) {
                        String name5 = restrictionDto.getName();
                        name5.getClass();
                        linkedHashMap2.put(str5, new wgn(name5, arrayList));
                    }
                }
                return new qj6(new g5v(arrayList2, linkedHashMap2));
            }
        }
        nfoVar = new nfo(this, cg6Var);
        Object obj2 = nfoVar.j;
        nm6 nm6Var2 = nm6.a;
        i = nfoVar.l;
        if (i != 0) {
        }
        biiVar = (bii) obj2;
        if (biiVar instanceof aii) {
        }
    }
}
