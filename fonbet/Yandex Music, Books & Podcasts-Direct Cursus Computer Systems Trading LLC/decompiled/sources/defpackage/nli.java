package defpackage;

import com.yandex.music.shared.backend_utils.MusicBackendInvocationError;
import com.yandex.music.shared.backend_utils.MusicBackendResponse;
import com.yandex.music.shared.dto.domainitem.ArtistDomainItemDto;
import com.yandex.music.shared.dto.track.TrackDto;
import com.yandex.music.shared.dto.wave.NewWaveModelWithAgentDto;
import com.yandex.music.shared.dto.wave.QueryToVibeWaveItemDto;
import com.yandex.music.shared.history.data.MusicHistoryApi;
import com.yandex.music.shared.history.data.network.dto.AlbumDataDto;
import com.yandex.music.shared.history.data.network.dto.AlbumFullModelDto;
import com.yandex.music.shared.history.data.network.dto.AlbumItemIdDto;
import com.yandex.music.shared.history.data.network.dto.ArtistDataDto;
import com.yandex.music.shared.history.data.network.dto.ArtistFullModelDto;
import com.yandex.music.shared.history.data.network.dto.ArtistItemIdDto;
import com.yandex.music.shared.history.data.network.dto.MultiwaveDataDto;
import com.yandex.music.shared.history.data.network.dto.MusicHistoryItemDto;
import com.yandex.music.shared.history.data.network.dto.MusicHistoryModelDto$Context;
import com.yandex.music.shared.history.data.network.dto.MusicHistoryModelDto$Track;
import com.yandex.music.shared.history.data.network.dto.MusicHistoryModelsItemsDto;
import com.yandex.music.shared.history.data.network.dto.MusicHistoryTabDto;
import com.yandex.music.shared.history.data.network.dto.MusicHistoryTabsDto;
import com.yandex.music.shared.history.data.network.dto.PlaylistDataDto;
import com.yandex.music.shared.history.data.network.dto.PlaylistFullModelDto;
import com.yandex.music.shared.history.data.network.dto.PlaylistItemIdDto;
import com.yandex.music.shared.history.data.network.dto.QueryToVibeDataDto;
import com.yandex.music.shared.history.data.network.dto.QueryToVibeFullModelDto;
import com.yandex.music.shared.history.data.network.dto.QueryToVibeItemIdDto;
import com.yandex.music.shared.history.data.network.dto.TrackDataDto;
import com.yandex.music.shared.history.data.network.dto.TrackItemIdDto;
import com.yandex.music.shared.history.data.network.dto.WaveDataDto;
import com.yandex.music.shared.history.data.network.dto.WaveFullModelDto;
import com.yandex.music.shared.history.data.network.dto.WaveItemIdDto;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Call;

/* loaded from: classes3.dex */
public final class nli {
    public final jyr a;

    public nli(i0j i0jVar) {
        this.a = btf.b(new jt5(i0jVar, 7));
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x0111, code lost:
    
        if (r6 != null) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0209, code lost:
    
        if (r6 != null) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0278, code lost:
    
        if (r9 != null) goto L194;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x02da A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:207:0x006a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02c1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0095 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(int i, cg6 cg6Var) {
        lli lliVar;
        int i2;
        bii biiVar;
        ArrayList arrayList;
        imi imiVar;
        sc7 date;
        Date date2;
        List<MusicHistoryItemDto> items;
        kji kjiVar;
        MusicHistoryModelDto$Context context;
        hji hjiVar;
        QueryToVibeItemIdDto itemId;
        QueryToVibeFullModelDto fullModel;
        n7n I;
        WaveItemIdDto itemId2;
        List seeds;
        NewWaveModelWithAgentDto fullModel2;
        WaveItemIdDto itemId3;
        WaveFullModelDto fullModel3;
        PlaylistItemIdDto itemId4;
        Long uid;
        PlaylistFullModelDto fullModel4;
        ArtistItemIdDto itemId5;
        String id;
        ArtistFullModelDto fullModel5;
        u51 K;
        Boolean available;
        List<MusicHistoryModelDto$Track> tracks;
        ArrayList arrayList2;
        Object obj;
        TrackDataDto data;
        TrackItemIdDto itemId6;
        TrackDataDto data2;
        TrackDto fullModel6;
        AlbumItemIdDto itemId7;
        String id2;
        AlbumFullModelDto fullModel7;
        if (cg6Var instanceof lli) {
            lliVar = (lli) cg6Var;
            int i3 = lliVar.l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                lliVar.l = i3 - Integer.MIN_VALUE;
                Object obj2 = lliVar.j;
                nm6 nm6Var = nm6.a;
                i2 = lliVar.l;
                if (i2 != 0) {
                    qgg.h0(obj2);
                    Object value = this.a.getValue();
                    value.getClass();
                    Call<MusicBackendResponse<MusicHistoryTabsDto>> a = ((MusicHistoryApi) value).a(i);
                    lliVar.l = 1;
                    obj2 = swf.N(a, lliVar);
                    if (obj2 == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i2 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj2);
                }
                biiVar = (bii) obj2;
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
                    int i4 = xhiVar.b;
                    String name = musicBackendInvocationError.getName();
                    if (name == null) {
                        name = "";
                    }
                    String message = musicBackendInvocationError.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    return new kj6(i4, musicBackendInvocationError.getDetails(), name, message, xhiVar.a);
                }
                MusicHistoryTabsDto musicHistoryTabsDto = (MusicHistoryTabsDto) ((aii) biiVar).a;
                musicHistoryTabsDto.getClass();
                List<MusicHistoryTabDto> historyTabs = musicHistoryTabsDto.getHistoryTabs();
                if (historyTabs != null) {
                    arrayList = new ArrayList();
                    for (MusicHistoryTabDto musicHistoryTabDto : historyTabs) {
                        if (musicHistoryTabDto != null && (date = musicHistoryTabDto.getDate()) != null && (date2 = date.b) != null && (items = musicHistoryTabDto.getItems()) != null) {
                            ArrayList arrayList3 = new ArrayList();
                            for (MusicHistoryItemDto musicHistoryItemDto : items) {
                                if (musicHistoryItemDto != null && (context = musicHistoryItemDto.getContext()) != null) {
                                    if (context instanceof MusicHistoryModelDto$Context.AlbumDto) {
                                        MusicHistoryModelDto$Context.AlbumDto albumDto = (MusicHistoryModelDto$Context.AlbumDto) context;
                                        AlbumDataDto data3 = albumDto.getData();
                                        if (data3 == null || (fullModel7 = data3.getFullModel()) == null || (hjiVar = xj6.a(fullModel7)) == null) {
                                            AlbumDataDto data4 = albumDto.getData();
                                            if (data4 != null && (itemId7 = data4.getItemId()) != null && (id2 = itemId7.getId()) != null) {
                                                hjiVar = new aji(id2);
                                            }
                                            hjiVar = null;
                                        }
                                        if (hjiVar != null && (tracks = musicHistoryItemDto.getTracks()) != null) {
                                            arrayList2 = new ArrayList();
                                            for (MusicHistoryModelDto$Track musicHistoryModelDto$Track : tracks) {
                                                if (musicHistoryModelDto$Track != null && (data2 = musicHistoryModelDto$Track.getData()) != null && (fullModel6 = data2.getFullModel()) != null) {
                                                    mqs a2 = wts.a(fullModel6);
                                                    obj = a2 == null ? null : new jmi(a2);
                                                }
                                                if (musicHistoryModelDto$Track == null || (data = musicHistoryModelDto$Track.getData()) == null || (itemId6 = data.getItemId()) == null) {
                                                    obj = null;
                                                } else {
                                                    String trackId = itemId6.getTrackId();
                                                    obj = trackId == null ? null : new kmi(q6k.A(trackId, itemId6.getAlbumId()));
                                                }
                                                if (obj != null) {
                                                    arrayList2.add(obj);
                                                }
                                            }
                                            if (arrayList2.isEmpty()) {
                                                arrayList2 = null;
                                            }
                                            kjiVar = arrayList2 != null ? new kji(hjiVar, arrayList2) : null;
                                        }
                                    } else if (context instanceof MusicHistoryModelDto$Context.ArtistDto) {
                                        MusicHistoryModelDto$Context.ArtistDto artistDto = (MusicHistoryModelDto$Context.ArtistDto) context;
                                        ArtistDataDto data5 = artistDto.getData();
                                        if (data5 != null && (fullModel5 = data5.getFullModel()) != null) {
                                            ArtistDomainItemDto artist = fullModel5.getArtist();
                                            hjiVar = (artist == null || (K = ltg.K(artist)) == null || (available = fullModel5.getAvailable()) == null) ? null : new rii(K, available.booleanValue());
                                        }
                                        ArtistDataDto data6 = artistDto.getData();
                                        if (data6 != null && (itemId5 = data6.getItemId()) != null && (id = itemId5.getId()) != null) {
                                            hjiVar = new bji(id);
                                            if (hjiVar != null) {
                                                arrayList2 = new ArrayList();
                                                while (r4.hasNext()) {
                                                }
                                                if (arrayList2.isEmpty()) {
                                                }
                                                if (arrayList2 != null) {
                                                }
                                            }
                                        }
                                        hjiVar = null;
                                        if (hjiVar != null) {
                                        }
                                    } else if (context instanceof MusicHistoryModelDto$Context.PlaylistDto) {
                                        MusicHistoryModelDto$Context.PlaylistDto playlistDto = (MusicHistoryModelDto$Context.PlaylistDto) context;
                                        PlaylistDataDto data7 = playlistDto.getData();
                                        if (data7 == null || (fullModel4 = data7.getFullModel()) == null || (hjiVar = xj6.c(fullModel4)) == null) {
                                            PlaylistDataDto data8 = playlistDto.getData();
                                            if (data8 != null && (itemId4 = data8.getItemId()) != null && (uid = itemId4.getUid()) != null) {
                                                long longValue = uid.longValue();
                                                Long kind = itemId4.getKind();
                                                if (kind != null) {
                                                    hjiVar = new dji(longValue, kind.longValue());
                                                }
                                            }
                                            hjiVar = null;
                                        }
                                        if (hjiVar != null) {
                                        }
                                    } else if (context instanceof MusicHistoryModelDto$Context.WaveDto) {
                                        MusicHistoryModelDto$Context.WaveDto waveDto = (MusicHistoryModelDto$Context.WaveDto) context;
                                        WaveDataDto data9 = waveDto.getData();
                                        if (data9 == null || (fullModel3 = data9.getFullModel()) == null || (hjiVar = xj6.e(fullModel3)) == null) {
                                            WaveDataDto data10 = waveDto.getData();
                                            if (data10 != null && (itemId3 = data10.getItemId()) != null) {
                                                hjiVar = xj6.f(itemId3);
                                            }
                                            hjiVar = null;
                                        }
                                        if (hjiVar != null) {
                                        }
                                    } else if (context instanceof MusicHistoryModelDto$Context.MultiwaveDto) {
                                        MusicHistoryModelDto$Context.MultiwaveDto multiwaveDto = (MusicHistoryModelDto$Context.MultiwaveDto) context;
                                        MultiwaveDataDto data11 = multiwaveDto.getData();
                                        if (data11 == null || (fullModel2 = data11.getFullModel()) == null || (hjiVar = xj6.b(fullModel2)) == null) {
                                            MultiwaveDataDto data12 = multiwaveDto.getData();
                                            if (data12 != null && (itemId2 = data12.getItemId()) != null && (seeds = itemId2.getSeeds()) != null) {
                                                ArrayList O = CollectionsKt.O(seeds);
                                                if (O.isEmpty()) {
                                                    O = null;
                                                }
                                                if (O != null) {
                                                    hjiVar = new cji(o8g.E(O));
                                                }
                                            }
                                            hjiVar = null;
                                        }
                                        if (hjiVar != null) {
                                        }
                                    } else if (context instanceof MusicHistoryModelDto$Context.QueryToVibeDto) {
                                        MusicHistoryModelDto$Context.QueryToVibeDto queryToVibeDto = (MusicHistoryModelDto$Context.QueryToVibeDto) context;
                                        QueryToVibeDataDto data13 = queryToVibeDto.getData();
                                        if (data13 != null && (fullModel = data13.getFullModel()) != null) {
                                            QueryToVibeWaveItemDto wave = fullModel.getWave();
                                            hjiVar = (wave == null || (I = p6g.I(wave)) == null) ? null : new uii(I);
                                        }
                                        QueryToVibeDataDto data14 = queryToVibeDto.getData();
                                        if (data14 != null && (itemId = data14.getItemId()) != null) {
                                            hjiVar = xj6.d(itemId);
                                            if (hjiVar != null) {
                                            }
                                        }
                                        hjiVar = null;
                                        if (hjiVar != null) {
                                        }
                                    } else {
                                        if (!(context instanceof MusicHistoryModelDto$Context.Various)) {
                                            b6e.s();
                                            return null;
                                        }
                                        String type = ((MusicHistoryModelDto$Context.Various) context).getType();
                                        if (Intrinsics.d(type, "other")) {
                                            hjiVar = vii.a;
                                        } else {
                                            if (Intrinsics.d(type, "search")) {
                                                hjiVar = wii.a;
                                            }
                                            hjiVar = null;
                                        }
                                        if (hjiVar != null) {
                                        }
                                    }
                                    if (kjiVar == null) {
                                        arrayList3.add(kjiVar);
                                    }
                                }
                                if (kjiVar == null) {
                                }
                            }
                            if (arrayList3.isEmpty()) {
                                arrayList3 = null;
                            }
                            if (arrayList3 != null) {
                                imiVar = new imi(date2, arrayList3);
                                if (imiVar == null) {
                                    arrayList.add(imiVar);
                                }
                            }
                        }
                        imiVar = null;
                        if (imiVar == null) {
                        }
                    }
                } else {
                    arrayList = null;
                }
                return arrayList == null ? new nj6(null) : new qj6(arrayList);
            }
        }
        lliVar = new lli(this, cg6Var);
        Object obj22 = lliVar.j;
        nm6 nm6Var2 = nm6.a;
        i2 = lliVar.l;
        if (i2 != 0) {
        }
        biiVar = (bii) obj22;
        if (biiVar instanceof aii) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0341, code lost:
    
        r6 = new defpackage.uii(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0347, code lost:
    
        if ((r6 instanceof com.yandex.music.shared.history.data.network.dto.MusicHistoryModelDto$Track) == false) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0349, code lost:
    
        r5 = ((com.yandex.music.shared.history.data.network.dto.MusicHistoryModelDto$Track) r6).getData();
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x034f, code lost:
    
        if (r5 == null) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0351, code lost:
    
        r5 = r5.getFullModel();
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0355, code lost:
    
        if (r5 == null) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0357, code lost:
    
        r5 = defpackage.wts.a(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x035d, code lost:
    
        if (r5 != null) goto L194;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0361, code lost:
    
        r6 = new defpackage.jmi(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0368, code lost:
    
        if ((r6 instanceof com.yandex.music.shared.history.data.network.dto.MusicHistoryModelDto$Context.Various) == false) goto L229;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0372, code lost:
    
        defpackage.b6e.s();
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0376, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x017d, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x028b, code lost:
    
        r6 = (defpackage.ili) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x028d, code lost:
    
        if (r6 == null) goto L233;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0291, code lost:
    
        if ((r6 instanceof com.yandex.music.shared.history.data.network.dto.MusicHistoryModelDto$Context.AlbumDto) == false) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0293, code lost:
    
        r5 = ((com.yandex.music.shared.history.data.network.dto.MusicHistoryModelDto$Context.AlbumDto) r6).getData();
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0299, code lost:
    
        if (r5 == null) goto L197;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x029b, code lost:
    
        r5 = r5.getFullModel();
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x029f, code lost:
    
        if (r5 == null) goto L197;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x02a1, code lost:
    
        r5 = defpackage.xj6.a(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x036b, code lost:
    
        if (r5 == null) goto L234;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x036d, code lost:
    
        r3.put(r4, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x036a, code lost:
    
        r5 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x02a9, code lost:
    
        if ((r6 instanceof com.yandex.music.shared.history.data.network.dto.MusicHistoryModelDto$Context.ArtistDto) == false) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x02ab, code lost:
    
        r5 = ((com.yandex.music.shared.history.data.network.dto.MusicHistoryModelDto$Context.ArtistDto) r6).getData();
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x02b1, code lost:
    
        if (r5 == null) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x02b3, code lost:
    
        r5 = r5.getFullModel();
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x02b7, code lost:
    
        if (r5 == null) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x02b9, code lost:
    
        r7 = r5.getArtist();
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x02bf, code lost:
    
        if (r7 == null) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x02c1, code lost:
    
        r7 = defpackage.ltg.K(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x02c5, code lost:
    
        if (r7 != null) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x02c8, code lost:
    
        r5 = r5.getAvailable();
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x02cc, code lost:
    
        if (r5 == null) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x02ce, code lost:
    
        r6 = new defpackage.rii(r7, r5.booleanValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x02d7, code lost:
    
        r5 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x02d6, code lost:
    
        r6 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x02dc, code lost:
    
        if ((r6 instanceof com.yandex.music.shared.history.data.network.dto.MusicHistoryModelDto$Context.PlaylistDto) == false) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x02de, code lost:
    
        r5 = ((com.yandex.music.shared.history.data.network.dto.MusicHistoryModelDto$Context.PlaylistDto) r6).getData();
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x02e4, code lost:
    
        if (r5 == null) goto L197;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x02e6, code lost:
    
        r5 = r5.getFullModel();
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x02ea, code lost:
    
        if (r5 == null) goto L197;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x02ec, code lost:
    
        r5 = defpackage.xj6.c(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x02f4, code lost:
    
        if ((r6 instanceof com.yandex.music.shared.history.data.network.dto.MusicHistoryModelDto$Context.WaveDto) == false) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x02f6, code lost:
    
        r5 = ((com.yandex.music.shared.history.data.network.dto.MusicHistoryModelDto$Context.WaveDto) r6).getData();
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x02fc, code lost:
    
        if (r5 == null) goto L197;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x02fe, code lost:
    
        r5 = r5.getFullModel();
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0302, code lost:
    
        if (r5 == null) goto L197;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0304, code lost:
    
        r5 = defpackage.xj6.e(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x030b, code lost:
    
        if ((r6 instanceof com.yandex.music.shared.history.data.network.dto.MusicHistoryModelDto$Context.MultiwaveDto) == false) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x030d, code lost:
    
        r5 = ((com.yandex.music.shared.history.data.network.dto.MusicHistoryModelDto$Context.MultiwaveDto) r6).getData();
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0313, code lost:
    
        if (r5 == null) goto L197;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0315, code lost:
    
        r5 = r5.getFullModel();
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0319, code lost:
    
        if (r5 == null) goto L197;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x031b, code lost:
    
        r5 = defpackage.xj6.b(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0322, code lost:
    
        if ((r6 instanceof com.yandex.music.shared.history.data.network.dto.MusicHistoryModelDto$Context.QueryToVibeDto) == false) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0324, code lost:
    
        r5 = ((com.yandex.music.shared.history.data.network.dto.MusicHistoryModelDto$Context.QueryToVibeDto) r6).getData();
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x032a, code lost:
    
        if (r5 == null) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x032c, code lost:
    
        r5 = r5.getFullModel();
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0330, code lost:
    
        if (r5 == null) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0332, code lost:
    
        r5 = r5.getWave();
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0338, code lost:
    
        if (r5 == null) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x033a, code lost:
    
        r5 = defpackage.p6g.I(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x033e, code lost:
    
        if (r5 != null) goto L184;
     */
    /* JADX WARN: Removed duplicated region for block: B:117:? A[LOOP:1: B:19:0x0195->B:117:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x028b A[EDGE_INSN: B:36:0x028b->B:37:0x028b BREAK  A[LOOP:1: B:19:0x0195->B:117:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [com.yandex.music.shared.dto.track.TrackDto, com.yandex.music.shared.history.data.network.dto.AlbumFullModelDto, com.yandex.music.shared.history.data.network.dto.ArtistFullModelDto, kotlin.jvm.internal.DefaultConstructorMarker] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ArrayList arrayList, cg6 cg6Var) {
        mli mliVar;
        int i;
        iji ijiVar;
        List<hmi> list;
        Object obj;
        ili queryToVibeDto;
        bii biiVar;
        Object obj2;
        Object obj3;
        iji ijiVar2;
        hze itemId;
        Object d;
        if (cg6Var instanceof mli) {
            mliVar = (mli) cg6Var;
            int i2 = mliVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mliVar.m = i2 - Integer.MIN_VALUE;
                Object obj4 = mliVar.k;
                nm6 nm6Var = nm6.a;
                i = mliVar.m;
                ?? r6 = 0;
                if (i != 0) {
                    qgg.h0(obj4);
                    List K = CollectionsKt.K(arrayList);
                    Object value = this.a.getValue();
                    value.getClass();
                    MusicHistoryApi musicHistoryApi = (MusicHistoryApi) value;
                    K.getClass();
                    List<hmi> list2 = K;
                    ArrayList arrayList2 = new ArrayList(v75.o(list2, 10));
                    for (hmi hmiVar : list2) {
                        if (hmiVar instanceof kmi) {
                            rr5 rr5Var = ((kmi) hmiVar).a;
                            queryToVibeDto = new MusicHistoryModelDto$Track(new TrackDataDto(new TrackItemIdDto(rr5Var.a, rr5Var.b), r6));
                        } else if (hmiVar instanceof aji) {
                            queryToVibeDto = new MusicHistoryModelDto$Context.AlbumDto(new AlbumDataDto(new AlbumItemIdDto(((aji) hmiVar).a), r6, 2, r6));
                        } else if (hmiVar instanceof bji) {
                            queryToVibeDto = new MusicHistoryModelDto$Context.ArtistDto(new ArtistDataDto(new ArtistItemIdDto(((bji) hmiVar).a), r6, 2, r6));
                        } else {
                            if (hmiVar instanceof dji) {
                                dji djiVar = (dji) hmiVar;
                                queryToVibeDto = new MusicHistoryModelDto$Context.PlaylistDto(new PlaylistDataDto(new PlaylistItemIdDto(Long.valueOf(djiVar.a), Long.valueOf(djiVar.b)), null, 2, null));
                            } else if (hmiVar instanceof fji) {
                                queryToVibeDto = new MusicHistoryModelDto$Context.WaveDto(new WaveDataDto(new WaveItemIdDto(o8g.R(((fji) hmiVar).a)), null, 2, null));
                            } else {
                                if (hmiVar instanceof cji) {
                                    obj = null;
                                    queryToVibeDto = new MusicHistoryModelDto$Context.MultiwaveDto(new MultiwaveDataDto(new WaveItemIdDto(o8g.R(((cji) hmiVar).a)), null, 2, null));
                                } else {
                                    obj = null;
                                    if (!(hmiVar instanceof eji)) {
                                        b6e.s();
                                        return null;
                                    }
                                    queryToVibeDto = new MusicHistoryModelDto$Context.QueryToVibeDto(new QueryToVibeDataDto(new QueryToVibeItemIdDto(((eji) hmiVar).a), null, 2, null));
                                }
                                arrayList2.add(queryToVibeDto);
                                r6 = obj;
                            }
                            obj = null;
                            arrayList2.add(queryToVibeDto);
                            r6 = obj;
                        }
                        obj = r6;
                        arrayList2.add(queryToVibeDto);
                        r6 = obj;
                    }
                    ijiVar = r6;
                    Call<MusicBackendResponse<MusicHistoryModelsItemsDto>> b = musicHistoryApi.b(new MusicHistoryModelsItemsDto(arrayList2));
                    mliVar.j = K;
                    mliVar.m = 1;
                    Object N = swf.N(b, mliVar);
                    if (N == nm6Var) {
                        return nm6Var;
                    }
                    list = K;
                    obj4 = N;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    list = mliVar.j;
                    qgg.h0(obj4);
                    ijiVar = null;
                }
                biiVar = (bii) obj4;
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
                MusicHistoryModelsItemsDto musicHistoryModelsItemsDto = (MusicHistoryModelsItemsDto) ((aii) biiVar).a;
                musicHistoryModelsItemsDto.getClass();
                list.getClass();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (hmi hmiVar2 : list) {
                    List items = musicHistoryModelsItemsDto.getItems();
                    if (items != null) {
                        Iterator it = items.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj2 = ijiVar;
                                break;
                            }
                            obj2 = it.next();
                            ili iliVar = (ili) obj2;
                            if (iliVar != null) {
                                if (iliVar instanceof MusicHistoryModelDto$Context.AlbumDto) {
                                    ijiVar2 = ((MusicHistoryModelDto$Context.AlbumDto) iliVar).getData();
                                } else if (iliVar instanceof MusicHistoryModelDto$Context.ArtistDto) {
                                    ijiVar2 = ((MusicHistoryModelDto$Context.ArtistDto) iliVar).getData();
                                } else if (iliVar instanceof MusicHistoryModelDto$Context.PlaylistDto) {
                                    ijiVar2 = ((MusicHistoryModelDto$Context.PlaylistDto) iliVar).getData();
                                } else if (iliVar instanceof MusicHistoryModelDto$Context.WaveDto) {
                                    ijiVar2 = ((MusicHistoryModelDto$Context.WaveDto) iliVar).getData();
                                } else if (iliVar instanceof MusicHistoryModelDto$Context.MultiwaveDto) {
                                    ijiVar2 = ((MusicHistoryModelDto$Context.MultiwaveDto) iliVar).getData();
                                } else if (iliVar instanceof MusicHistoryModelDto$Context.QueryToVibeDto) {
                                    ijiVar2 = ((MusicHistoryModelDto$Context.QueryToVibeDto) iliVar).getData();
                                } else if (iliVar instanceof MusicHistoryModelDto$Track) {
                                    ijiVar2 = ((MusicHistoryModelDto$Track) iliVar).getData();
                                } else {
                                    if (!(iliVar instanceof MusicHistoryModelDto$Context.Various)) {
                                        b6e.s();
                                        return null;
                                    }
                                    ijiVar2 = ijiVar;
                                }
                                if (ijiVar2 != null && (itemId = ijiVar2.getItemId()) != null) {
                                    if (itemId instanceof AlbumItemIdDto) {
                                        String id = ((AlbumItemIdDto) itemId).getId();
                                        if (id != null) {
                                            obj3 = new aji(id);
                                            if (Intrinsics.d(obj3, hmiVar2)) {
                                                break;
                                            }
                                        }
                                    } else if (itemId instanceof ArtistItemIdDto) {
                                        String id2 = ((ArtistItemIdDto) itemId).getId();
                                        if (id2 != null) {
                                            obj3 = new bji(id2);
                                            if (Intrinsics.d(obj3, hmiVar2)) {
                                            }
                                        }
                                    } else if (itemId instanceof PlaylistItemIdDto) {
                                        PlaylistItemIdDto playlistItemIdDto = (PlaylistItemIdDto) itemId;
                                        Long uid = playlistItemIdDto.getUid();
                                        if (uid != null) {
                                            long longValue = uid.longValue();
                                            Long kind = playlistItemIdDto.getKind();
                                            if (kind != null) {
                                                obj3 = new dji(longValue, kind.longValue());
                                                if (Intrinsics.d(obj3, hmiVar2)) {
                                                }
                                            }
                                        }
                                    } else {
                                        if (itemId instanceof TrackItemIdDto) {
                                            TrackItemIdDto trackItemIdDto = (TrackItemIdDto) itemId;
                                            String trackId = trackItemIdDto.getTrackId();
                                            if (trackId != null) {
                                                obj3 = new kmi(q6k.A(trackId, trackItemIdDto.getAlbumId()));
                                            }
                                        } else {
                                            if (itemId instanceof WaveItemIdDto) {
                                                d = xj6.f((WaveItemIdDto) itemId);
                                            } else {
                                                if (!(itemId instanceof QueryToVibeItemIdDto)) {
                                                    b6e.s();
                                                    return null;
                                                }
                                                d = xj6.d((QueryToVibeItemIdDto) itemId);
                                            }
                                            obj3 = d;
                                        }
                                        if (Intrinsics.d(obj3, hmiVar2)) {
                                        }
                                    }
                                }
                            }
                            obj3 = ijiVar;
                            if (Intrinsics.d(obj3, hmiVar2)) {
                            }
                        }
                    }
                }
                return new qj6(linkedHashMap);
            }
        }
        mliVar = new mli(this, cg6Var);
        Object obj42 = mliVar.k;
        nm6 nm6Var2 = nm6.a;
        i = mliVar.m;
        ?? r62 = 0;
        if (i != 0) {
        }
        biiVar = (bii) obj42;
        if (biiVar instanceof aii) {
        }
    }
}
