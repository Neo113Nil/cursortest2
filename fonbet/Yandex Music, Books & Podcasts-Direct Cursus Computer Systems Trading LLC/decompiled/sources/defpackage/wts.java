package defpackage;

import android.os.Parcelable;
import com.yandex.music.shared.dto.album.AlbumDto;
import com.yandex.music.shared.dto.album.TrackPositionDto;
import com.yandex.music.shared.dto.track.TrackDto;
import com.yandex.music.shared.dto.track.TrackFadeDto;
import com.yandex.music.shared.dto.track.TrackLoudnessDto;
import com.yandex.music.shared.dto.track.TrackUserInfoDto;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import ru.yandex.music.data.audio.WarningContent;
import ru.yandex.music.data.stores.CoverPath;
import ru.yandex.music.data.stores.WebPath$Storage;

/* loaded from: classes3.dex */
public abstract class wts {
    /* JADX WARN: Removed duplicated region for block: B:102:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01c9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x027d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final mqs a(TrackDto trackDto) {
        dg2 dg2Var;
        TrackPositionDto trackPosition;
        boolean contains;
        oq oqVar;
        oq oqVar2;
        k10 k10Var;
        WarningContent warningContent;
        hqs hqsVar;
        String coverUri;
        CoverPath coverPath;
        String pubDate;
        CoverPath coverPath2;
        Date date;
        Date date2;
        ArrayList arrayList;
        boolean z;
        CoverPath coverPath3;
        CoverPath coverPath4;
        TrackLoudnessDto loudnessDto;
        String str;
        String str2;
        nxs nxsVar;
        Map colorPalette;
        qvs qvsVar;
        qvs qvsVar2;
        LinkedHashMap linkedHashMap;
        qvs qvsVar3;
        qvs qvsVar4;
        nxs nxsVar2;
        Boolean hasAvailableTextLyrics;
        Integer volume;
        Integer index;
        String id = trackDto.getId();
        if (id == null) {
            return null;
        }
        String error = trackDto.getError();
        if (error != null) {
            dg2.a.getClass();
            int hashCode = error.hashCode();
            if (hashCode == -721218717) {
                if (error.equals("no-rights")) {
                    dg2Var = dg2.c;
                }
                xq0.x("Unknown error string: ".concat(error));
                return null;
            }
            if (hashCode == -615392837) {
                if (error.equals("no-metadata")) {
                    dg2Var = dg2.e;
                }
                xq0.x("Unknown error string: ".concat(error));
                return null;
            }
            if (hashCode == 184069128 && error.equals("not-found")) {
                dg2Var = dg2.d;
            }
            xq0.x("Unknown error string: ".concat(error));
            return null;
        }
        ofc ofcVar = dg2.a;
        Boolean available = trackDto.getAvailable();
        ofcVar.getClass();
        dg2Var = (available == null || !available.booleanValue()) ? dg2.c : dg2.b;
        dg2 dg2Var2 = dg2Var;
        List albums = trackDto.getAlbums();
        AlbumDto albumDto = albums != null ? (AlbumDto) CollectionsKt.firstOrNull(albums) : null;
        if (albumDto == null) {
            oqVar = oq.J;
            trackPosition = null;
            oqVar2 = null;
            contains = false;
        } else {
            oq G = ild.G(albumDto);
            if (G == null) {
                G = oq.J;
            }
            Parcelable.Creator<oq> creator = oq.CREATOR;
            G.getClass();
            oq oqVar3 = !cxb.Y(G.a) ? G : null;
            trackPosition = albumDto.getTrackPosition();
            List bests = albumDto.getBests();
            contains = bests != null ? bests.contains(id) : false;
            oqVar = G;
            oqVar2 = oqVar3;
        }
        List E = lxe.E(trackDto.getArtists());
        oqVar.getClass();
        String str3 = oqVar.a;
        String str4 = oqVar.j;
        TrackPositionDto trackPositionDto = trackPosition;
        String str5 = oqVar.b;
        int i = -1;
        int intValue = (trackPositionDto == null || (index = trackPositionDto.getIndex()) == null) ? -1 : index.intValue();
        if (trackPositionDto != null && (volume = trackPositionDto.getVolume()) != null) {
            i = volume.intValue();
        }
        k10 k10Var2 = new k10(str3, str4, id, str5, intValue, i, contains, 128);
        String contentWarning = trackDto.getContentWarning();
        WarningContent a = contentWarning != null ? WarningContent.a(contentWarning) : null;
        String realId = trackDto.getRealId();
        String title = trackDto.getTitle();
        if (title == null) {
            title = "";
        }
        Long durationMs = trackDto.getDurationMs();
        long longValue = durationMs != null ? durationMs.longValue() : 0L;
        List<c01> list = E;
        ArrayList arrayList2 = new ArrayList(v75.o(list, 10));
        for (c01 c01Var : list) {
            Parcelable.Creator<zp2> creator2 = zp2.CREATOR;
            arrayList2.add(vq2.E(c01Var));
        }
        String trackSource = trackDto.getTrackSource();
        TrackUserInfoDto userInfo = trackDto.getUserInfo();
        String login = userInfo != null ? userInfo.getLogin() : null;
        String ugcArtistName = trackDto.getUgcArtistName();
        boolean z2 = a == WarningContent.EXPLICIT;
        Boolean rememberPosition = trackDto.getRememberPosition();
        boolean booleanValue = rememberPosition != null ? rememberPosition.booleanValue() : false;
        if (a == null) {
            a = WarningContent.NONE;
        }
        Boolean lyricsAvailable = trackDto.getLyricsAvailable();
        boolean booleanValue2 = lyricsAvailable != null ? lyricsAvailable.booleanValue() : false;
        TrackDto.LyricsInfoDto lyricsInfo = trackDto.getLyricsInfo();
        if (lyricsInfo != null && (hasAvailableTextLyrics = lyricsInfo.getHasAvailableTextLyrics()) != null) {
            boolean booleanValue3 = hasAvailableTextLyrics.booleanValue();
            Boolean hasAvailableSyncLyrics = lyricsInfo.getHasAvailableSyncLyrics();
            if (hasAvailableSyncLyrics != null) {
                k10Var = k10Var2;
                boolean booleanValue4 = hasAvailableSyncLyrics.booleanValue();
                warningContent = a;
                hqsVar = new hqs(booleanValue3, booleanValue4);
                CoverPath coverPath5 = oqVar.D.a;
                boolean z3 = booleanValue2;
                String type = trackDto.getType();
                hqs hqsVar2 = hqsVar;
                String str6 = title;
                k10 k10Var3 = k10Var;
                String version = trackDto.getVersion();
                ArrayList y0 = CollectionsKt.y0(E);
                coverUri = trackDto.getCoverUri();
                if (coverUri == null) {
                    WebPath$Storage webPath$Storage = WebPath$Storage.AVATARS;
                    webPath$Storage.getClass();
                    coverPath = etn.B(coverUri, webPath$Storage);
                } else {
                    coverPath = null;
                }
                pubDate = trackDto.getPubDate();
                if (pubDate == null) {
                    try {
                        Object obj = hkg.a.get();
                        obj.getClass();
                        coverPath2 = coverPath;
                        try {
                            date = ((SimpleDateFormat) obj).parse(pubDate);
                        } catch (ParseException unused) {
                            date = null;
                            date2 = date;
                            arrayList = y0;
                            z = booleanValue;
                            coverPath3 = coverPath5;
                            coverPath4 = coverPath2;
                            String playerId = trackDto.getPlayerId();
                            String shortDescription = trackDto.getShortDescription();
                            boolean z4 = z2;
                            String str7 = login;
                            WarningContent warningContent2 = warningContent;
                            String episodeType = trackDto.getEpisodeType();
                            Boolean isSuitableForChildren = trackDto.getIsSuitableForChildren();
                            if (isSuitableForChildren != null) {
                            }
                            loudnessDto = trackDto.getLoudnessDto();
                            if (loudnessDto != null) {
                            }
                            List availableForOptions = trackDto.getAvailableForOptions();
                            List O = availableForOptions != null ? CollectionsKt.O(availableForOptions) : c5b.a;
                            Boolean availableForPremiumUsers = trackDto.getAvailableForPremiumUsers();
                            if (availableForPremiumUsers != null) {
                            }
                            Long previewDurationMs = trackDto.getPreviewDurationMs();
                            long longValue2 = previewDurationMs != null ? previewDurationMs.longValue() : -1L;
                            List disclaimer = trackDto.getDisclaimer();
                            if (disclaimer != null) {
                            }
                            TrackFadeDto fade = trackDto.getFade();
                            if (fade != null) {
                            }
                            TrackFadeDto mixFade = trackDto.getMixFade();
                            if (mixFade != null) {
                            }
                            colorPalette = trackDto.getColorPalette();
                            List list2 = r0;
                            if (colorPalette != null) {
                            }
                            Boolean availableFullWithoutPermission = trackDto.getAvailableFullWithoutPermission();
                            if (availableFullWithoutPermission != null) {
                            }
                            String rawJson = trackDto.getRawJson();
                            List specialAudioResources = trackDto.getSpecialAudioResources();
                            List O2 = specialAudioResources != null ? CollectionsKt.O(specialAudioResources) : c5b.a;
                            List videoClipIds = trackDto.getVideoClipIds();
                            return new mqs(str, str2, str6, k10Var3, longValue, arrayList2, trackSource, str7, ugcArtistName, z4, dg2Var2, z, warningContent2, z3, hqsVar2, coverPath3, type, episodeType, version, oqVar2, arrayList, null, coverPath4, date2, playerId, shortDescription, r28, nxsVar, list2, qvsVar, qvsVar2, O, r34, linkedHashMap, O2, videoClipIds != null ? CollectionsKt.O(videoClipIds) : c5b.a, trackDto.getBackgroundVideoUri(), r39, longValue2, rawJson, 2097152, 256);
                        }
                    } catch (ParseException unused2) {
                        coverPath2 = coverPath;
                    }
                    date2 = date;
                    arrayList = y0;
                    z = booleanValue;
                    coverPath3 = coverPath5;
                    coverPath4 = coverPath2;
                } else {
                    arrayList = y0;
                    z = booleanValue;
                    coverPath3 = coverPath5;
                    date2 = null;
                    coverPath4 = coverPath;
                }
                String playerId2 = trackDto.getPlayerId();
                String shortDescription2 = trackDto.getShortDescription();
                boolean z42 = z2;
                String str72 = login;
                WarningContent warningContent22 = warningContent;
                String episodeType2 = trackDto.getEpisodeType();
                Boolean isSuitableForChildren2 = trackDto.getIsSuitableForChildren();
                boolean booleanValue5 = isSuitableForChildren2 != null ? isSuitableForChildren2.booleanValue() : false;
                loudnessDto = trackDto.getLoudnessDto();
                if (loudnessDto != null) {
                    Float i2 = loudnessDto.getI();
                    str = id;
                    if (i2 != null) {
                        float floatValue = i2.floatValue();
                        Float tp = loudnessDto.getTp();
                        str2 = realId;
                        if (tp != null) {
                            nxsVar2 = new nxs(floatValue, tp.floatValue());
                            nxsVar = nxsVar2;
                        }
                    } else {
                        str2 = realId;
                    }
                    nxsVar2 = null;
                    nxsVar = nxsVar2;
                } else {
                    str = id;
                    str2 = realId;
                    nxsVar = null;
                }
                List availableForOptions2 = trackDto.getAvailableForOptions();
                List O3 = availableForOptions2 != null ? CollectionsKt.O(availableForOptions2) : c5b.a;
                Boolean availableForPremiumUsers2 = trackDto.getAvailableForPremiumUsers();
                boolean booleanValue6 = availableForPremiumUsers2 != null ? availableForPremiumUsers2.booleanValue() : false;
                Long previewDurationMs2 = trackDto.getPreviewDurationMs();
                long longValue22 = previewDurationMs2 != null ? previewDurationMs2.longValue() : -1L;
                List disclaimer2 = trackDto.getDisclaimer();
                List O4 = disclaimer2 != null ? CollectionsKt.O(disclaimer2) : c5b.a;
                TrackFadeDto fade2 = trackDto.getFade();
                qvs M = fade2 != null ? ldg.M(fade2) : null;
                TrackFadeDto mixFade2 = trackDto.getMixFade();
                qvs M2 = mixFade2 != null ? ldg.M(mixFade2) : null;
                colorPalette = trackDto.getColorPalette();
                List list22 = O4;
                if (colorPalette != null) {
                    linkedHashMap = new LinkedHashMap();
                    for (Map.Entry entry : colorPalette.entrySet()) {
                        Object key = entry.getKey();
                        Object value = entry.getValue();
                        if (key == null || value == null) {
                            qvsVar3 = M;
                            qvsVar4 = M2;
                        } else {
                            qvsVar3 = M;
                            qvsVar4 = M2;
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                        M = qvsVar3;
                        M2 = qvsVar4;
                    }
                    qvsVar = M;
                    qvsVar2 = M2;
                } else {
                    qvsVar = M;
                    qvsVar2 = M2;
                    linkedHashMap = new LinkedHashMap();
                }
                Boolean availableFullWithoutPermission2 = trackDto.getAvailableFullWithoutPermission();
                boolean booleanValue7 = availableFullWithoutPermission2 != null ? availableFullWithoutPermission2.booleanValue() : false;
                String rawJson2 = trackDto.getRawJson();
                List specialAudioResources2 = trackDto.getSpecialAudioResources();
                List O22 = specialAudioResources2 != null ? CollectionsKt.O(specialAudioResources2) : c5b.a;
                List videoClipIds2 = trackDto.getVideoClipIds();
                return new mqs(str, str2, str6, k10Var3, longValue, arrayList2, trackSource, str72, ugcArtistName, z42, dg2Var2, z, warningContent22, z3, hqsVar2, coverPath3, type, episodeType2, version, oqVar2, arrayList, null, coverPath4, date2, playerId2, shortDescription2, booleanValue5, nxsVar, list22, qvsVar, qvsVar2, O3, booleanValue6, linkedHashMap, O22, videoClipIds2 != null ? CollectionsKt.O(videoClipIds2) : c5b.a, trackDto.getBackgroundVideoUri(), booleanValue7, longValue22, rawJson2, 2097152, 256);
            }
        }
        k10Var = k10Var2;
        warningContent = a;
        hqsVar = null;
        CoverPath coverPath52 = oqVar.D.a;
        boolean z32 = booleanValue2;
        String type2 = trackDto.getType();
        hqs hqsVar22 = hqsVar;
        String str62 = title;
        k10 k10Var32 = k10Var;
        String version2 = trackDto.getVersion();
        ArrayList y02 = CollectionsKt.y0(E);
        coverUri = trackDto.getCoverUri();
        if (coverUri == null) {
        }
        pubDate = trackDto.getPubDate();
        if (pubDate == null) {
        }
        String playerId22 = trackDto.getPlayerId();
        String shortDescription22 = trackDto.getShortDescription();
        boolean z422 = z2;
        String str722 = login;
        WarningContent warningContent222 = warningContent;
        String episodeType22 = trackDto.getEpisodeType();
        Boolean isSuitableForChildren22 = trackDto.getIsSuitableForChildren();
        if (isSuitableForChildren22 != null) {
        }
        loudnessDto = trackDto.getLoudnessDto();
        if (loudnessDto != null) {
        }
        List availableForOptions22 = trackDto.getAvailableForOptions();
        List O32 = availableForOptions22 != null ? CollectionsKt.O(availableForOptions22) : c5b.a;
        Boolean availableForPremiumUsers22 = trackDto.getAvailableForPremiumUsers();
        if (availableForPremiumUsers22 != null) {
        }
        Long previewDurationMs22 = trackDto.getPreviewDurationMs();
        long longValue222 = previewDurationMs22 != null ? previewDurationMs22.longValue() : -1L;
        List disclaimer22 = trackDto.getDisclaimer();
        if (disclaimer22 != null) {
        }
        TrackFadeDto fade22 = trackDto.getFade();
        if (fade22 != null) {
        }
        TrackFadeDto mixFade22 = trackDto.getMixFade();
        if (mixFade22 != null) {
        }
        colorPalette = trackDto.getColorPalette();
        List list222 = O4;
        if (colorPalette != null) {
        }
        Boolean availableFullWithoutPermission22 = trackDto.getAvailableFullWithoutPermission();
        if (availableFullWithoutPermission22 != null) {
        }
        String rawJson22 = trackDto.getRawJson();
        List specialAudioResources22 = trackDto.getSpecialAudioResources();
        List O222 = specialAudioResources22 != null ? CollectionsKt.O(specialAudioResources22) : c5b.a;
        List videoClipIds22 = trackDto.getVideoClipIds();
        return new mqs(str, str2, str62, k10Var32, longValue, arrayList2, trackSource, str722, ugcArtistName, z422, dg2Var2, z, warningContent222, z32, hqsVar22, coverPath3, type2, episodeType22, version2, oqVar2, arrayList, null, coverPath4, date2, playerId22, shortDescription22, booleanValue5, nxsVar, list222, qvsVar, qvsVar2, O32, booleanValue6, linkedHashMap, O222, videoClipIds22 != null ? CollectionsKt.O(videoClipIds22) : c5b.a, trackDto.getBackgroundVideoUri(), booleanValue7, longValue222, rawJson22, 2097152, 256);
    }

    public static final ArrayList b(List list) {
        list.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            TrackDto trackDto = (TrackDto) it.next();
            mqs a = trackDto != null ? a(trackDto) : null;
            if (a != null) {
                arrayList.add(a);
            }
        }
        return arrayList;
    }
}
