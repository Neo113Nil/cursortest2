package defpackage;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.os.Parcelable;
import android.view.View;
import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.b;
import androidx.compose.foundation.layout.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import com.yandex.music.shared.dto.domainitem.AlbumDomainItemDto;
import com.yandex.music.shared.dto.domainitem.ArtistDomainItemDto;
import com.yandex.music.shared.dto.domainitem.BlockActionDto;
import com.yandex.music.shared.dto.domainitem.ContentRestrictionsDto;
import com.yandex.music.shared.dto.domainitem.EntityCoverDto;
import com.yandex.music.shared.dto.domainitem.WaveDomainItemDto;
import com.yandex.music.shared.dto.track.TrackDto;
import com.yandex.music.shared.dto.videoclip.ClipDomainItemDto;
import com.yandex.music.shared.dto.wave.AgentDto;
import com.yandex.music.shared.dto.wave.QueryToVibeWaveDto;
import com.yandex.music.shared.dto.wave.QueryToVibeWaveItemDto;
import com.yandex.music.shared.dto.wave.recommendation.WaveDto;
import com.yandex.music.skeleton.blocks.itemlist.data.ItemListEntitiesDto;
import com.yandex.music.skeleton.blocks.itemlist.data.dto.AlbumItemDataDto;
import com.yandex.music.skeleton.blocks.itemlist.data.dto.ArtistItemDataDto;
import com.yandex.music.skeleton.blocks.itemlist.data.dto.ClipItemDataDto;
import com.yandex.music.skeleton.blocks.itemlist.data.dto.ItemListEntityDto;
import com.yandex.music.skeleton.blocks.itemlist.data.dto.MenuItemDataDto;
import com.yandex.music.skeleton.blocks.itemlist.data.dto.NonMusicAlbumItemDataDto;
import com.yandex.music.skeleton.blocks.itemlist.data.dto.TrackItemDataDto;
import com.yandex.music.skeleton.blocks.itemlist.data.dto.WaveAgentDataDto;
import com.yandex.music.skeleton.blocks.itemlist.data.dto.WaveItemDataDto;
import com.yandex.music.skeleton.blocks.itemlist.data.dto.a;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.e;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import ru.yandex.music.R;
import ru.yandex.music.data.stores.CoverPath;
import ru.yandex.music.data.stores.WebPath$Storage;
import ru.yandex.video.m3.ui.debug.PreloadState;

/* loaded from: classes6.dex */
public abstract class xv7 {
    public static final byte[] a = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
    public static final byte[] b = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};
    public static final byte[] c = {45, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122};
    public static final wn5 d = new wn5(new go5(21), 83890122, false);
    public static final wn5 e = new wn5(new go5(22), 142687311, false);
    public static final wn5 f = new wn5(new go5(23), -537372872, false);
    public static final wn5 g = new wn5(new po5(7), -1901404548, false);
    public static final wn5 h = new wn5(new bp5(28), -704327178, false);
    public static final wn5 i = new wn5(new bp5(29), 786241527, false);
    public static final wn5 j = new wn5(new ap5(10), 690745773, false);
    public static final kx7 k = new kx7(1.0f, 1.0f);
    public static final os2 l = new os2(17);
    public static final Object m = new Object();
    public static volatile my1 n;
    public static Typeface o;

    public static final void A(BroadcastReceiver broadcastReceiver, CoroutineContext coroutineContext, Function2 function2) {
        tf6 e2 = gld.e(e.c(a4g.n(), coroutineContext));
        x97.y(e2, null, null, new v3(function2, e2, broadcastReceiver.goAsync(), (Continuation) null), 3);
    }

    public static final boolean B(hq5 hq5Var) {
        return (((Configuration) ((oq5) hq5Var).j(AndroidCompositionLocals_androidKt.a)).uiMode & 48) == 32;
    }

    public static final boolean C(String str) {
        str.getClass();
        String obj = StringsKt.t0(str).toString();
        return (StringsKt.U(obj) || Intrinsics.d(obj, CommonUrlParts.Values.FALSE_INTEGER)) ? false : true;
    }

    public static final Object D(xj5 xj5Var, zh5 zh5Var, Activity activity, String str, cg6 cg6Var) {
        jyr jyrVar = k3j.e;
        Object L = tyf.L(ixf.y(), new v3((Object) xj5Var, (Parcelable) zh5Var, (Object) activity, str, (Continuation) null, 22), cg6Var);
        return L == nm6.a ? L : Unit.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x04f5  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0501  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v19, types: [c5b] */
    /* JADX WARN: Type inference failed for: r11v20, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v29 */
    /* JADX WARN: Type inference failed for: r12v9, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.ArrayList] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:254:0x04eb -> B:11:0x04f3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x04dd -> B:10:0x04e1). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object E(ItemListEntitiesDto itemListEntitiesDto, cg6 cg6Var) {
        jze jzeVar;
        int i2;
        Iterator it;
        Collection collection;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        Object obj;
        QueryToVibeWaveItemDto wave;
        n7n I;
        Object b0fVar;
        WaveDto wave2;
        yku L;
        AgentDto agent;
        np E;
        TrackDto track;
        mqs a2;
        AlbumDomainItemDto album;
        lt J;
        c5b c5bVar;
        WaveDomainItemDto wave3;
        List seeds;
        List E2;
        String header;
        dou douVar;
        Integer d2;
        ClipDomainItemDto clip;
        String title;
        zo4 zo4Var;
        Long r0;
        String str;
        String str2;
        String str3;
        List list;
        List list2;
        Iterator it2;
        u51 u51Var;
        AlbumDomainItemDto album2;
        lt J2;
        ArtistDomainItemDto artist;
        u51 K;
        Object wzeVar;
        String e2;
        String title2;
        BlockActionDto viewAllAction;
        o43 b0;
        if (cg6Var instanceof jze) {
            jzeVar = (jze) cg6Var;
            int i9 = jzeVar.q;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                jzeVar.q = i9 - Integer.MIN_VALUE;
                Object obj2 = jzeVar.p;
                nm6 nm6Var = nm6.a;
                i2 = jzeVar.q;
                int i10 = 1;
                if (i2 != 0) {
                    qgg.h0(obj2);
                    List items = itemListEntitiesDto.getItems();
                    if (items != null) {
                        ArrayList arrayList = new ArrayList();
                        it = items.iterator();
                        collection = arrayList;
                        i3 = 0;
                        i4 = 0;
                        i5 = 0;
                        i6 = 0;
                        if (it.hasNext()) {
                        }
                    }
                    return c5b.a;
                }
                if (i2 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i11 = jzeVar.o;
                i3 = jzeVar.n;
                i4 = jzeVar.m;
                i5 = jzeVar.l;
                it = jzeVar.k;
                collection = jzeVar.j;
                qgg.h0(obj2);
                f0f f0fVar = (f0f) obj2;
                i6 = i11;
                if (f0fVar != null) {
                    collection.add(f0fVar);
                }
                i10 = 1;
                if (it.hasNext()) {
                    Object next = it.next();
                    int i12 = i6 + 1;
                    f0fVar = null;
                    c5b c5bVar2 = null;
                    Iterable iterable = 0;
                    if (i6 < 0) {
                        u75.n();
                        throw null;
                    }
                    ItemListEntityDto itemListEntityDto = (ItemListEntityDto) next;
                    if (itemListEntityDto != null) {
                        jzeVar.getClass();
                        jzeVar.j = collection;
                        jzeVar.k = it;
                        jzeVar.l = i5;
                        jzeVar.m = i4;
                        jzeVar.n = i3;
                        jzeVar.o = i12;
                        jzeVar.q = i10;
                        if (itemListEntityDto instanceof ItemListEntityDto.Menu) {
                            MenuItemDataDto data = ((ItemListEntityDto.Menu) itemListEntityDto).getData();
                            if (data != null && (title2 = data.getTitle()) != null && (viewAllAction = data.getViewAllAction()) != null && (b0 = jf0.b0(viewAllAction)) != null) {
                                wzeVar = new yze(title2, b0);
                                i7 = i12;
                                i8 = i3;
                                obj2 = wzeVar;
                            }
                            i7 = i12;
                            i8 = i3;
                            obj2 = null;
                        } else {
                            String str4 = "";
                            if (itemListEntityDto instanceof ItemListEntityDto.Artist) {
                                ArtistItemDataDto data2 = ((ItemListEntityDto.Artist) itemListEntityDto).getData();
                                if (data2 != null && (artist = data2.getArtist()) != null && (K = ltg.K(artist)) != null) {
                                    u9b u9bVar = K.c;
                                    if (u9bVar != null && (e2 = u9bVar.e(wct.s(), WebPath$Storage.AVATARS)) != null) {
                                        str4 = e2;
                                    }
                                    wzeVar = new wze(K, new jd1(str4, K.b, false, null));
                                    i7 = i12;
                                    i8 = i3;
                                    obj2 = wzeVar;
                                }
                            } else if (itemListEntityDto instanceof ItemListEntityDto.Album) {
                                AlbumItemDataDto data3 = ((ItemListEntityDto.Album) itemListEntityDto).getData();
                                if (data3 != null && (album2 = data3.getAlbum()) != null && (J2 = xee.J(album2)) != null) {
                                    List<ArtistDomainItemDto> artists = data3.getArtists();
                                    if (artists != null) {
                                        ?? arrayList2 = new ArrayList();
                                        for (ArtistDomainItemDto artistDomainItemDto : artists) {
                                            u51 K2 = artistDomainItemDto != null ? ltg.K(artistDomainItemDto) : null;
                                            if (K2 != null) {
                                                arrayList2.add(K2);
                                            }
                                        }
                                        c5bVar2 = arrayList2;
                                    }
                                    if (c5bVar2 == null) {
                                        c5bVar2 = c5b.a;
                                    }
                                    obj2 = new vze(J2, vnj.t(J2, c5bVar2));
                                    i7 = i12;
                                    i8 = i3;
                                }
                            } else {
                                if (itemListEntityDto instanceof ItemListEntityDto.Clip) {
                                    ClipItemDataDto data4 = ((ItemListEntityDto.Clip) itemListEntityDto).getData();
                                    if (data4 != null && (clip = data4.getClip()) != null) {
                                        String id = clip.getId();
                                        if (id == null || (title = clip.getTitle()) == null) {
                                            zo4Var = null;
                                        } else {
                                            EntityCoverDto cover = clip.getCover();
                                            u9b V = cover != null ? c3x.V(cover) : null;
                                            String duration = clip.getDuration();
                                            Long valueOf = (duration == null || (r0 = StringsKt.r0(10, duration)) == null) ? null : Long.valueOf(r0.longValue() * 1000);
                                            Boolean explicit = clip.getExplicit();
                                            ContentRestrictionsDto contentRestrictions = clip.getContentRestrictions();
                                            zo4Var = new zo4(id, title, V, valueOf, explicit, contentRestrictions != null ? lxe.F(contentRestrictions) : null);
                                        }
                                        if (zo4Var != null) {
                                            String str5 = zo4Var.b;
                                            String str6 = zo4Var.a;
                                            Boolean bool = zo4Var.e;
                                            u9b u9bVar2 = zo4Var.c;
                                            List artists2 = data4.getArtists();
                                            if (artists2 != null) {
                                                str = null;
                                                iterable = new ArrayList();
                                                Iterator it3 = artists2.iterator();
                                                while (it3.hasNext()) {
                                                    ArtistDomainItemDto artistDomainItemDto2 = (ArtistDomainItemDto) it3.next();
                                                    if (artistDomainItemDto2 != null) {
                                                        u51 K3 = ltg.K(artistDomainItemDto2);
                                                        it2 = it3;
                                                        u51Var = K3;
                                                    } else {
                                                        it2 = it3;
                                                        u51Var = null;
                                                    }
                                                    if (u51Var != null) {
                                                        iterable.add(u51Var);
                                                    }
                                                    it3 = it2;
                                                }
                                            } else {
                                                str = null;
                                            }
                                            if (iterable == 0) {
                                                iterable = c5b.a;
                                            }
                                            iterable.getClass();
                                            Iterable iterable2 = iterable;
                                            i7 = i12;
                                            String X = CollectionsKt.X(iterable2, ", ", null, null, new d4u(18), 30);
                                            if (u9bVar2 != null) {
                                                str2 = X;
                                                str3 = u9bVar2.e(720, WebPath$Storage.AVATARS);
                                            } else {
                                                str2 = X;
                                                str3 = str;
                                            }
                                            i8 = i3;
                                            z9u z9uVar = new z9u(i6, str6, null, str3 != null ? str3 : "", str5, str2, "", zo4Var.g, bool != null ? bool.booleanValue() : false, null);
                                            Long l2 = zo4Var.d;
                                            long longValue = l2 != null ? l2.longValue() : 0L;
                                            boolean booleanValue = bool != null ? bool.booleanValue() : false;
                                            c5b c5bVar3 = c5b.a;
                                            CoverPath M = kg5.M(u9bVar2, WebPath$Storage.AVATARS);
                                            ArrayList arrayList3 = new ArrayList(v75.o(iterable2, 10));
                                            for (Iterator it4 = iterable2.iterator(); it4.hasNext(); it4 = it4) {
                                                u51 u51Var2 = (u51) it4.next();
                                                arrayList3.add(new c01(u51Var2.a, u51Var2.b, false, false, null, 0, null, kg5.M(u51Var2.c, WebPath$Storage.AVATARS), null, null, null, false, 64508));
                                            }
                                            gd6 gd6Var = zo4Var.f;
                                            if (gd6Var == null || (list = gd6Var.a) == null) {
                                                list = c5b.a;
                                            }
                                            List list3 = list;
                                            if (gd6Var == null || (list2 = gd6Var.b) == null) {
                                                list2 = c5b.a;
                                            }
                                            obj2 = new xze(zo4Var, z9uVar, new x1u(str6, str5, "", M, null, longValue, c5bVar3, arrayList3, booleanValue, list2, list3, null, null));
                                        }
                                    }
                                    i7 = i12;
                                    i8 = i3;
                                    obj = null;
                                    obj2 = obj;
                                } else {
                                    i7 = i12;
                                    i8 = i3;
                                    obj = null;
                                    if (itemListEntityDto instanceof ItemListEntityDto.Wave) {
                                        WaveItemDataDto data5 = ((ItemListEntityDto.Wave) itemListEntityDto).getData();
                                        if (data5 != null && (wave3 = data5.getWave()) != null) {
                                            String stationId = wave3.getStationId();
                                            if (stationId != null && (seeds = wave3.getSeeds()) != null && (E2 = tyf.E(wave3.getStationId(), seeds)) != null) {
                                                s9p E3 = o8g.E(E2);
                                                String title3 = wave3.getTitle();
                                                if (title3 != null && (header = wave3.getHeader()) != null) {
                                                    douVar = new dou(stationId, E3, title3, header);
                                                    if (douVar != null) {
                                                        EntityCoverDto cover2 = data5.getCover();
                                                        u9b V2 = cover2 != null ? c3x.V(cover2) : null;
                                                        b0fVar = new d0f(douVar, new euu(douVar.c, douVar.d, V2 != null ? V2.e(wct.s(), WebPath$Storage.AVATARS) : null, (V2 == null || (d2 = V2.d()) == null) ? d85.m : c3x.f(d2.intValue())));
                                                        obj2 = b0fVar;
                                                    }
                                                }
                                            }
                                            douVar = null;
                                            if (douVar != null) {
                                            }
                                        }
                                        obj2 = obj;
                                    } else if (itemListEntityDto instanceof ItemListEntityDto.NonMusicAlbum) {
                                        NonMusicAlbumItemDataDto data6 = ((ItemListEntityDto.NonMusicAlbum) itemListEntityDto).getData();
                                        if (data6 != null && (album = data6.getAlbum()) != null && (J = xee.J(album)) != null) {
                                            List<ArtistDomainItemDto> artists3 = data6.getArtists();
                                            if (artists3 != null) {
                                                ?? arrayList4 = new ArrayList();
                                                for (ArtistDomainItemDto artistDomainItemDto3 : artists3) {
                                                    u51 K4 = artistDomainItemDto3 != null ? ltg.K(artistDomainItemDto3) : null;
                                                    if (K4 != null) {
                                                        arrayList4.add(K4);
                                                    }
                                                }
                                                c5bVar = arrayList4;
                                            } else {
                                                c5bVar = null;
                                            }
                                            if (c5bVar == null) {
                                                c5bVar = c5b.a;
                                            }
                                            obj2 = new zze(J, jbj.c(J, c5bVar, data6.getLikesCount(), data6.getYandexBooksOptionRequired()));
                                        }
                                        obj2 = obj;
                                    } else if (itemListEntityDto instanceof ItemListEntityDto.Playlist) {
                                        obj2 = a.a(((ItemListEntityDto.Playlist) itemListEntityDto).getData(), jzeVar);
                                        if (obj2 != nm6.a) {
                                            obj2 = (f0f) obj2;
                                        }
                                    } else if (itemListEntityDto instanceof ItemListEntityDto.Track) {
                                        TrackItemDataDto data7 = ((ItemListEntityDto.Track) itemListEntityDto).getData();
                                        if (data7 != null && (track = data7.getTrack()) != null && (a2 = wts.a(track)) != null) {
                                            b0fVar = new c0f(oo6.a.a(a2), a2);
                                            obj2 = b0fVar;
                                        }
                                        obj2 = obj;
                                    } else {
                                        if (itemListEntityDto instanceof ItemListEntityDto.WaveAgent) {
                                            WaveAgentDataDto data8 = ((ItemListEntityDto.WaveAgent) itemListEntityDto).getData();
                                            if (data8 != null && (wave2 = data8.getWave()) != null && (L = w1g.L(wave2)) != null && (agent = data8.getAgent()) != null && (E = w1g.E(agent)) != null) {
                                                op opVar = E.b;
                                                String str7 = L.c;
                                                String str8 = L.d;
                                                String pathForSize = new jcv(opVar.a, WebPath$Storage.AVATARS).getPathForSize(wct.s());
                                                String str9 = E.a;
                                                Integer b02 = y2x.b0(opVar.b);
                                                obj2 = new e0f(L, E, new klu(str7, str8, pathForSize, str9, b02 != null ? b02.intValue() : c3x.U(d85.n), E.c));
                                            }
                                        } else {
                                            if (!(itemListEntityDto instanceof ItemListEntityDto.QueryToVibeWave)) {
                                                b6e.s();
                                                return null;
                                            }
                                            QueryToVibeWaveDto data9 = ((ItemListEntityDto.QueryToVibeWave) itemListEntityDto).getData();
                                            if (data9 != null && (wave = data9.getWave()) != null && (I = p6g.I(wave)) != null) {
                                                b0fVar = new b0f(I, q7g.x(I));
                                                obj2 = b0fVar;
                                            }
                                        }
                                        obj2 = obj;
                                    }
                                }
                                if (it.hasNext()) {
                                    List list4 = (List) collection;
                                    if (list4 != null) {
                                        return list4;
                                    }
                                    return c5b.a;
                                }
                            }
                            i7 = i12;
                            i8 = i3;
                            obj2 = null;
                        }
                        if (obj2 == nm6Var) {
                            return nm6Var;
                        }
                        i11 = i7;
                        i3 = i8;
                        f0f f0fVar2 = (f0f) obj2;
                        i6 = i11;
                        if (f0fVar2 != null) {
                        }
                        i10 = 1;
                        if (it.hasNext()) {
                        }
                    } else {
                        i6 = i12;
                        if (f0fVar2 != null) {
                        }
                        i10 = 1;
                        if (it.hasNext()) {
                        }
                    }
                }
            }
        }
        jzeVar = new jze(cg6Var);
        Object obj22 = jzeVar.p;
        nm6 nm6Var2 = nm6.a;
        i2 = jzeVar.q;
        int i102 = 1;
        if (i2 != 0) {
        }
    }

    public static boolean F(z96 z96Var, z96 z96Var2, z96 z96Var3, z96 z96Var4) {
        z96 z96Var5 = z96.d;
        z96 z96Var6 = z96.b;
        z96 z96Var7 = z96.a;
        return (z96Var3 == z96Var7 || z96Var3 == z96Var6 || (z96Var3 == z96Var5 && z96Var != z96Var6)) || (z96Var4 == z96Var7 || z96Var4 == z96Var6 || (z96Var4 == z96Var5 && z96Var2 != z96Var6));
    }

    public static final int G(float f2, float[] fArr, int i2) {
        float f3 = f2 >= 0.0f ? f2 : 0.0f;
        if (f3 > 1.0f) {
            f3 = 1.0f;
        }
        if (Math.abs(f3 - f2) > 1.05E-6f) {
            f3 = Float.NaN;
        }
        fArr[i2] = f3;
        return !Float.isNaN(f3) ? 1 : 0;
    }

    public static final void a(i01 i01Var, yci yciVar, hq5 hq5Var, int i2) {
        i01Var.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-7465043);
        if ((((oq5Var.h(i01Var) ? 4 : 2) | i2 | 48) & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
        } else {
            boolean I = asq.I((Configuration) oq5Var.j(AndroidCompositionLocals_androidKt.a));
            vci vciVar = vci.a;
            yci q = I ? d.q(vciVar, 0.0f, 0.0f, 428, r11.screenHeightDp - (16 * 2), 3) : androidx.compose.foundation.layout.a.d(d.d(vciVar, 1.0f), 1.0f);
            t01 t01Var = (t01) gld.O(i01Var.a.i, oq5Var).getValue();
            Object K = oq5Var.K();
            if (K == gq5.a) {
                K = new zs0(7);
                oq5Var.k0(K);
            }
            ot0.l(t01Var, (Function1) K, vciVar, null, null, false, ild.C(-1424177397, new ar(1, q, i01Var), oq5Var), oq5Var, 1573296, 56);
            yciVar = vciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new a3(i01Var, yciVar, i2, 4);
        }
    }

    public static final void b(s01 s01Var, i01 i01Var, Function0 function0, yci yciVar, hq5 hq5Var, int i2) {
        int i3;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1695793409);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var.f(s01Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var.h(i01Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= oq5Var.h(function0) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= oq5Var.f(yciVar) ? 2048 : 1024;
        }
        if ((i3 & 1171) == 1170 && oq5Var.z()) {
            oq5Var.S();
        } else {
            jf0.a(new qzm[0], null, true, ild.C(1288985975, new bj(yciVar, i01Var, s01Var, function0, s01Var.c), oq5Var), oq5Var, 3072, 2);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new uu(s01Var, i01Var, false, function0, yciVar, i2, 3);
        }
    }

    public static final void c(r01 r01Var, Function0 function0, yci yciVar, hq5 hq5Var, int i2) {
        int i3;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1944733314);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var.f(r01Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var.h(function0) ? 32 : 16;
        }
        if (((i3 | 384) & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
        } else {
            jf0.a(new qzm[0], null, true, ild.C(-1980199174, new a3(function0, r01Var), oq5Var), oq5Var, 3072, 2);
            yciVar = vci.a;
        }
        yci yciVar2 = yciVar;
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new b3(r01Var, function0, yciVar2, i2, 4);
        }
    }

    public static final void d(CharSequence charSequence, int i2, wn5 wn5Var, hq5 hq5Var, int i3) {
        int i4;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1415697927);
        if ((i3 & 6) == 0) {
            i4 = (oq5Var.h(charSequence) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= oq5Var.d(i2) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= oq5Var.h(wn5Var) ? 256 : 128;
        }
        if ((i4 & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
        } else if (((Context) oq5Var.j(AndroidCompositionLocals_androidKt.b)).getResources().getConfiguration().getLayoutDirection() == 1) {
            oq5Var.Z(1522095541);
            jyr jyrVar = oas.a;
            charSequence.getClass();
            ((kz2) oas.a.getValue()).getClass();
            boolean x = gas.c.x(charSequence.length(), charSequence);
            etn.l(es5.n.a(x ? xof.b : xof.a), ild.C(1180603284, new o48(wn5Var, i2, x), oq5Var), oq5Var, 56);
            oq5Var.p(false);
        } else {
            oq5Var.Z(1522368310);
            wn5Var.invoke(new o9s(i2), oq5Var, Integer.valueOf((i4 >> 3) & 126));
            oq5Var.p(false);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new uf4(charSequence, i2, wn5Var, i3);
        }
    }

    public static final void e(dk3 dk3Var, yci yciVar, hq5 hq5Var, int i2) {
        long h2;
        oq5 oq5Var;
        gz2 gz2Var;
        boolean z;
        yci yciVar2;
        dk3 dk3Var2;
        dk3Var.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(1266543656);
        int i3 = 4;
        if ((((oq5Var2.h(dk3Var) ? 4 : 2) | i2 | 48) & 19) == 18 && oq5Var2.z()) {
            oq5Var2.S();
            yciVar2 = yciVar;
            dk3Var2 = dk3Var;
            oq5Var = oq5Var2;
        } else {
            kk3 kk3Var = (kk3) gld.M(dk3Var.c, oq5Var2).getValue();
            if (((ma5) oq5Var2.j(pa5.a)).g()) {
                oq5Var2.Z(1672714772);
                h2 = kg5.r(R.color.bg_primary_day, oq5Var2);
                oq5Var2.p(false);
            } else {
                oq5Var2.Z(1672716345);
                oq5Var2.p(false);
                h2 = c3x.h(4280229663L);
            }
            boolean h3 = oq5Var2.h(dk3Var);
            Object K = oq5Var2.K();
            kjn kjnVar = gq5.a;
            if (h3 || K == kjnVar) {
                K = new r93(i3, dk3Var);
                oq5Var2.k0(K);
            }
            com.yandex.music.core.ui.compose.a.a((Function0) K, oq5Var2, 0);
            jzk jzkVar = vnj.i;
            vci vciVar = vci.a;
            yci c2 = d.c(gut.a0(gut.p1(androidx.compose.foundation.a.b(vciVar, h2, jzkVar))), 1.0f);
            kx0 kx0Var = qx0.c;
            ta5 a2 = sa5.a(kx0Var, b2c.n, oq5Var2, 0);
            int i4 = oq5Var2.P;
            androidx.compose.runtime.internal.a l2 = oq5Var2.l();
            yci H = vnj.H(oq5Var2, c2);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var2.d0();
            if (oq5Var2.O) {
                oq5Var2.k(grbVar);
            } else {
                oq5Var2.n0();
            }
            kb5 kb5Var = wp5.f;
            g0g.U(oq5Var2, a2, kb5Var);
            kb5 kb5Var2 = wp5.e;
            g0g.U(oq5Var2, l2, kb5Var2);
            kb5 kb5Var3 = wp5.g;
            if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var2, i4, kb5Var3);
            }
            kb5 kb5Var4 = wp5.d;
            g0g.U(oq5Var2, H, kb5Var4);
            f(null, oq5Var2, 6);
            if (290.0f <= 0.0d) {
                qme.a("invalid weight; must be greater than zero");
            }
            yci o2 = androidx.compose.foundation.layout.a.o(d.d(new LayoutWeightElement(true, 290.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 290.0f), 1.0f), 16, 0.0f, 2);
            gz2 gz2Var2 = b2c.o;
            ta5 a3 = sa5.a(kx0Var, gz2Var2, oq5Var2, 48);
            int i5 = oq5Var2.P;
            androidx.compose.runtime.internal.a l3 = oq5Var2.l();
            yci H2 = vnj.H(oq5Var2, o2);
            oq5Var2.d0();
            if (oq5Var2.O) {
                oq5Var2.k(grbVar);
            } else {
                oq5Var2.n0();
            }
            g0g.U(oq5Var2, a3, kb5Var);
            g0g.U(oq5Var2, l3, kb5Var2);
            if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i5))) {
                ouj.x(i5, oq5Var2, i5, kb5Var3);
            }
            g0g.U(oq5Var2, H2, kb5Var4);
            String M = rvf.M(R.string.kubr_dlg_title, oq5Var2);
            ges j2 = nu0.j();
            agr agrVar = eq0.a;
            xcs.b(M, null, ((dq0) oq5Var2.j(agrVar)).b.a, 0L, null, 0L, null, new o9s(3), 0L, 0, false, 0, 0, null, j2, oq5Var2, 0, 0, 65018);
            xcs.b(rvf.M(R.string.kubr_dlg, oq5Var2), androidx.compose.foundation.layout.a.m(vciVar, 10), ((dq0) oq5Var2.j(agrVar)).b.a, 0L, null, 0L, null, new o9s(3), 0L, 0, false, 0, 0, null, nu0.i(), oq5Var2, 48, 0, 65016);
            oq5Var = oq5Var2;
            oq5Var.p(true);
            String str = kk3Var.a;
            boolean h4 = oq5Var.h(dk3Var);
            Object K2 = oq5Var.K();
            if (h4 || K2 == kjnVar) {
                gz2Var = gz2Var2;
                z = true;
                yciVar2 = vciVar;
                t93 t93Var = new t93(0, dk3Var, dk3.class, "loginClick", "loginClick()V", 0, 14);
                dk3Var2 = dk3Var;
                oq5Var.k0(t93Var);
                K2 = t93Var;
            } else {
                dk3Var2 = dk3Var;
                gz2Var = gz2Var2;
                z = true;
                yciVar2 = vciVar;
            }
            hdg.o(str, (Function0) ((h9f) K2), androidx.compose.foundation.layout.a.q(new HorizontalAlignElement(gz2Var), 0.0f, 0.0f, 0.0f, 8, 7), 0.0f, oq5Var, 0, 8);
            oq5Var.p(z);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new m32(dk3Var2, yciVar2, i2, 11);
        }
    }

    public static final void f(yci yciVar, hq5 hq5Var, int i2) {
        yci yciVar2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1131281227);
        if (((i2 | 48) & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
            yciVar2 = yciVar;
        } else {
            if (768.0f <= 0.0d) {
                qme.a("invalid weight; must be greater than zero");
            }
            yci d2 = d.d(new LayoutWeightElement(true, 768.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 768.0f), 1.0f);
            iz2 iz2Var = b2c.b;
            kfh d3 = ug3.d(iz2Var, false);
            int i3 = oq5Var.P;
            androidx.compose.runtime.internal.a l2 = oq5Var.l();
            yci H = vnj.H(oq5Var, d2);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            kb5 kb5Var = wp5.f;
            g0g.U(oq5Var, d3, kb5Var);
            kb5 kb5Var2 = wp5.e;
            g0g.U(oq5Var, l2, kb5Var2);
            kb5 kb5Var3 = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var, i3, kb5Var3);
            }
            kb5 kb5Var4 = wp5.d;
            g0g.U(oq5Var, H, kb5Var4);
            yciVar2 = vci.a;
            yci c2 = d.c(yciVar2, 1.0f);
            kfh d4 = ug3.d(b2c.f, false);
            int i4 = oq5Var.P;
            androidx.compose.runtime.internal.a l3 = oq5Var.l();
            yci H2 = vnj.H(oq5Var, c2);
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, d4, kb5Var);
            g0g.U(oq5Var, l3, kb5Var2);
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var, i4, kb5Var3);
            }
            g0g.U(oq5Var, H2, kb5Var4);
            w4k E = a0g.E(2131231908, 0, oq5Var);
            b bVar = b.a;
            irf.r(E, null, androidx.compose.foundation.layout.a.q(bVar.a(yciVar2, iz2Var), 0.0f, 140, 0.0f, 0.0f, 13), null, null, 0.0f, null, oq5Var, 48, 120);
            irf.r(a0g.E(2131231909, 0, oq5Var), null, androidx.compose.foundation.layout.a.q(bVar.a(yciVar2, b2c.d), 0.0f, 110, 0.0f, 0.0f, 13), null, hd6.b, 0.0f, null, oq5Var, 24624, 104);
            irf.r(a0g.E(2131231907, 0, oq5Var), null, androidx.compose.foundation.layout.a.q(yciVar2, 0.0f, 40, 0.0f, 0.0f, 13), null, null, 0.0f, null, oq5Var, 432, 120);
            oq5Var.p(true);
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new u71(yciVar2, i2, 7);
        }
    }

    public static final void g(aqi aqiVar, ab0 ab0Var, aqi aqiVar2, st4 st4Var, pj2 pj2Var, pcu pcuVar, f83 f83Var, yci yciVar, hq5 hq5Var, int i2) {
        Object rc4Var;
        aqi aqiVar3;
        fk0 fk0Var;
        int i3;
        boolean z;
        boolean z2;
        ab0Var.getClass();
        st4Var.getClass();
        f83Var.getClass();
        yciVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-618936045);
        int i4 = (oq5Var.f(aqiVar) ? 4 : 2) | i2;
        if ((i2 & 48) == 0) {
            i4 |= oq5Var.h(ab0Var) ? 32 : 16;
        }
        int i5 = i4 | (oq5Var.f(aqiVar2) ? 256 : 128);
        if ((i2 & 3072) == 0) {
            i5 |= oq5Var.h(st4Var) ? 2048 : 1024;
        }
        int i6 = i5 | (oq5Var.f(pj2Var) ? 16384 : RemoteCameraConfig.Notification.ID) | (oq5Var.f(pcuVar) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX) | (oq5Var.h(f83Var) ? 1048576 : 524288) | (oq5Var.f(yciVar) ? 8388608 : RemoteCameraConfig.Camera.BITRATE);
        if ((4793491 & i6) == 4793490 && oq5Var.z()) {
            oq5Var.S();
        } else {
            int i7 = i6 & 14;
            boolean z3 = i7 == 4;
            Object K = oq5Var.K();
            Object obj = gq5.a;
            if (z3 || K == obj) {
                K = vq2.a(((Boolean) aqiVar.getValue()).booleanValue() ? 1.0f : 0.0f);
                oq5Var.k0(K);
            }
            fk0 fk0Var2 = (fk0) K;
            boolean z4 = i7 == 4;
            Object K2 = oq5Var.K();
            if (z4 || K2 == obj) {
                K2 = szf.g0(aqiVar.getValue());
                oq5Var.k0(K2);
            }
            aqi aqiVar4 = (aqi) K2;
            boolean f2 = (i7 == 4) | oq5Var.f(aqiVar4) | oq5Var.h(fk0Var2);
            Object K3 = oq5Var.K();
            if (f2 || K3 == obj) {
                aqiVar3 = aqiVar4;
                fk0Var = fk0Var2;
                i3 = i6;
                z = false;
                rc4Var = new rc4(aqiVar, aqiVar3, fk0Var, null, 10);
                oq5Var.k0(rc4Var);
            } else {
                i3 = i6;
                rc4Var = K3;
                fk0Var = fk0Var2;
                aqiVar3 = aqiVar4;
                z = false;
            }
            gld.y(fk0Var, aqiVar, (Function2) rc4Var, oq5Var);
            WeakHashMap weakHashMap = rqv.w;
            int K4 = ff7.K(p6g.n(z7l.h(oq5Var).l, oq5Var).a(), oq5Var);
            yj0 yj0Var = z7l.h(oq5Var).i;
            boolean z5 = yj0Var.e().d > 0 ? true : z;
            boolean e2 = pcuVar.e();
            boolean z6 = (458752 & i3) == 131072;
            Object K5 = oq5Var.K();
            if (z6 || K5 == obj) {
                K5 = new at4(pcuVar, 0);
                oq5Var.k0(K5);
            }
            Function0 function0 = (Function0) K5;
            Object K6 = oq5Var.K();
            if (K6 == obj) {
                K6 = new s2(28);
                oq5Var.k0(K6);
            }
            yci d2 = d.d(tt0.A(yciVar, pj2Var, function0, (Function0) K6, e2, false, f83Var), 1.0f);
            boolean d3 = oq5Var.d(K4) | oq5Var.h(fk0Var) | oq5Var.g(z5);
            Object K7 = oq5Var.K();
            if (d3 || K7 == obj) {
                K7 = new et4(K4, fk0Var, z5);
                oq5Var.k0(K7);
            }
            kfh kfhVar = (kfh) K7;
            int i8 = oq5Var.P;
            androidx.compose.runtime.internal.a l2 = oq5Var.l();
            yci H = vnj.H(oq5Var, d2);
            xp5.T.getClass();
            Function0 function02 = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(function02);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, kfhVar, wp5.f);
            g0g.U(oq5Var, l2, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i8))) {
                ouj.x(i8, oq5Var, i8, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            if (((Boolean) aqiVar3.getValue()).booleanValue()) {
                oq5Var.Z(-146853009);
                long j2 = d85.f;
                int i9 = i3 >> 3;
                qt4.a(ab0Var, aqiVar2, new zt4(d85.b(j2, 0.16f, 0.0f, 0.0f, 0.0f, 14), d85.b(j2, 0.16f, 0.0f, 0.0f, 0.0f, 14)), st4Var, vci.a, oq5Var, (i9 & 112) | (i9 & 14) | 24576 | (i3 & 7168), 0);
                z2 = false;
            } else {
                z2 = false;
                oq5Var.Z(-150065818);
            }
            oq5Var.p(z2);
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new bt4(aqiVar, ab0Var, aqiVar2, st4Var, pj2Var, pcuVar, f83Var, yciVar, i2);
        }
    }

    public static final void h(Function0 function0, z18 z18Var, wn5 wn5Var, hq5 hq5Var, int i2) {
        int i3;
        z18 z18Var2;
        kjn kjnVar;
        boolean z;
        boolean z2;
        xof xofVar;
        int i4;
        Object obj;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-2032877254);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var.h(function0) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            z18Var2 = z18Var;
            i3 |= oq5Var.f(z18Var2) ? 32 : 16;
        } else {
            z18Var2 = z18Var;
        }
        if ((i2 & 384) == 0) {
            i3 |= oq5Var.h(wn5Var) ? 256 : 128;
        }
        if (oq5Var.P(i3 & 1, (i3 & 147) != 146)) {
            View view = (View) oq5Var.j(AndroidCompositionLocals_androidKt.f);
            jx7 jx7Var = (jx7) oq5Var.j(es5.h);
            xof xofVar2 = (xof) oq5Var.j(es5.n);
            mq5 z3 = lxe.z(oq5Var);
            aqi o0 = szf.o0(wn5Var, oq5Var);
            int i5 = i3;
            UUID uuid = (UUID) o2g.g0(new Object[0], null, e1.D, oq5Var, 3072, 6);
            boolean f2 = oq5Var.f(view) | oq5Var.f(jx7Var);
            Object K = oq5Var.K();
            kjn kjnVar2 = gq5.a;
            if (f2 || K == kjnVar2) {
                kjnVar = kjnVar2;
                z = true;
                z18 z18Var3 = z18Var2;
                z2 = false;
                xofVar = xofVar2;
                i4 = 32;
                d28 d28Var = new d28(function0, z18Var3, view, xofVar, jx7Var, uuid);
                wn5 wn5Var2 = new wn5(new jg0(o0, 0), 488261145, true);
                x18 x18Var = d28Var.g;
                x18Var.setParentCompositionContext(z3);
                x18Var.j.setValue(wn5Var2);
                x18Var.n = true;
                x18Var.l();
                oq5Var.k0(d28Var);
                obj = d28Var;
            } else {
                kjnVar = kjnVar2;
                z2 = false;
                xofVar = xofVar2;
                i4 = 32;
                obj = K;
                z = true;
            }
            d28 d28Var2 = (d28) obj;
            boolean h2 = oq5Var.h(d28Var2);
            Object K2 = oq5Var.K();
            if (h2 || K2 == kjnVar) {
                K2 = new hg0(d28Var2, 0);
                oq5Var.k0(K2);
            }
            gld.k(d28Var2, (Function1) K2, oq5Var);
            boolean h3 = oq5Var.h(d28Var2) | ((i5 & 14) == 4 ? z : z2);
            if ((i5 & 112) == i4) {
                z2 = z;
            }
            boolean f3 = h3 | z2 | oq5Var.f(xofVar);
            Object K3 = oq5Var.K();
            if (f3 || K3 == kjnVar) {
                zg zgVar = new zg(d28Var2, function0, z18Var, xofVar, 1);
                oq5Var.k0(zgVar);
                K3 = zgVar;
            }
            gld.D((Function0) K3, oq5Var);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new ig0(function0, z18Var, wn5Var, i2, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0459  */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x03ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void i(final mn0 mn0Var, yci yciVar, final long j2, long j3, long j4, int i2, long j5, int i3, boolean z, int i4, int i5, Map map, Function2 function2, ges gesVar, pn0 pn0Var, on0 on0Var, hq5 hq5Var, final int i6, final int i7, final int i8) {
        yci yciVar2;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        long j6;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        boolean z2;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        long j7;
        long j8;
        int i33;
        long j9;
        int i34;
        int i35;
        Map map2;
        int i36;
        int i37;
        Function2 function22;
        ges gesVar2;
        int i38;
        on0 on0Var2;
        final Function2 function23;
        pn0 pn0Var2;
        int i39;
        ges gesVar3;
        int i40;
        final int i41;
        on0 on0Var3;
        boolean z3;
        rn0 A;
        int i42;
        ges gesVar4;
        oq5 oq5Var;
        final ges gesVar5;
        final int i43;
        final Function2 function24;
        final Map map3;
        final on0 on0Var4;
        final int i44;
        final pn0 pn0Var3;
        final int i45;
        final boolean z4;
        final int i46;
        final yci yciVar3;
        final long j10;
        final long j11;
        final long j12;
        int i47;
        ges gesVar6;
        boolean z5;
        mn0 mn0Var2;
        int i48;
        xmn r;
        mn0Var.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(1695296829);
        int i49 = i6 | (oq5Var2.f(mn0Var) ? 4 : 2);
        int i50 = i8 & 2;
        if (i50 != 0) {
            i49 |= 48;
        } else if ((i6 & 48) == 0) {
            yciVar2 = yciVar;
            i49 |= oq5Var2.f(yciVar2) ? 32 : 16;
            int i51 = i49 | (!oq5Var2.e(j2) ? 256 : 128);
            i9 = i8 & 8;
            if (i9 == 0) {
                i10 = i51 | 3072;
            } else {
                i10 = i51 | (oq5Var2.e(j3) ? 2048 : 1024);
            }
            if ((i8 & 16) == 0) {
                i11 = i10 | 24576;
            } else {
                i11 = i10 | (oq5Var2.f(null) ? 16384 : RemoteCameraConfig.Notification.ID);
            }
            int i52 = i11 | ((i8 & 32) == 0 ? 196608 : oq5Var2.f(null) ? 131072 : 65536);
            if ((i8 & 64) == 0) {
                i12 = i52 | ScreenMirroringConfig.Video.BITRATE_1_5MB;
            } else {
                i12 = i52 | (oq5Var2.f(null) ? 1048576 : 524288);
            }
            i13 = i8 & 128;
            int i53 = RemoteCameraConfig.Camera.BITRATE;
            if (i13 == 0) {
                i14 = i12 | 12582912;
                j6 = j4;
            } else {
                j6 = j4;
                i14 = i12 | (oq5Var2.e(j6) ? 8388608 : 4194304);
            }
            if ((i8 & 256) != 0) {
                i15 = i2;
                if (oq5Var2.d(i15)) {
                    i16 = 67108864;
                    int i54 = i14 | i16;
                    if ((i8 & RemoteCameraConfig.Mic.BUFFER_SIZE) != 0) {
                        i17 = i54 | 805306368;
                    } else {
                        i17 = i54 | (oq5Var2.f(null) ? 536870912 : 268435456);
                    }
                    i18 = i8 & 1024;
                    if (i18 != 0) {
                        i20 = i7 | 6;
                        i19 = i17;
                    } else {
                        i19 = i17;
                        i20 = i7 | (oq5Var2.e(j5) ? 4 : 2);
                    }
                    i21 = i8 & 2048;
                    if (i21 != 0) {
                        i20 |= 48;
                        i22 = i21;
                    } else if ((i7 & 48) == 0) {
                        i22 = i21;
                        i20 |= oq5Var2.d(i3) ? 32 : 16;
                    } else {
                        i22 = i21;
                    }
                    int i55 = i20;
                    i23 = i8 & 4096;
                    if (i23 != 0) {
                        i55 |= 384;
                    } else if ((i7 & 384) == 0) {
                        z2 = z;
                        i55 |= oq5Var2.g(z2) ? 256 : 128;
                        i24 = i8 & RemoteCameraConfig.Notification.ID;
                        if (i24 == 0) {
                            i25 = i55 | 3072;
                        } else {
                            int i56 = i55;
                            if ((i7 & 3072) == 0) {
                                i25 = i56 | (oq5Var2.d(i4) ? 2048 : 1024);
                            } else {
                                i25 = i56;
                            }
                        }
                        int i57 = i25 | 24576;
                        i26 = i8 & SQLiteDatabase.OPEN_NOMUTEX;
                        if (i26 == 0) {
                            i27 = i25 | 221184;
                        } else {
                            i27 = i57 | (oq5Var2.f(map) ? 131072 : 65536);
                        }
                        i28 = i8 & SQLiteDatabase.OPEN_FULLMUTEX;
                        if (i28 == 0) {
                            i27 |= ScreenMirroringConfig.Video.BITRATE_1_5MB;
                        } else if ((i7 & ScreenMirroringConfig.Video.BITRATE_1_5MB) == 0) {
                            i27 |= oq5Var2.h(function2) ? 1048576 : 524288;
                        }
                        if ((i8 & SQLiteDatabase.OPEN_SHAREDCACHE) == 0 && oq5Var2.f(gesVar)) {
                            i53 = 8388608;
                        }
                        int i58 = i27 | i53;
                        i29 = i8 & SQLiteDatabase.OPEN_PRIVATECACHE;
                        if (i29 == 0) {
                            i30 = i58 | 100663296;
                        } else {
                            i30 = i58 | (oq5Var2.h(pn0Var) ? 67108864 : 33554432);
                        }
                        i31 = i8 & 524288;
                        if (i31 == 0) {
                            i32 = i30 | 805306368;
                        } else {
                            i32 = i30 | (oq5Var2.f(on0Var) ? 536870912 : 268435456);
                        }
                        int i59 = i32;
                        if ((i19 & 306783379) != 306783378 && (i59 & 306783379) == 306783378 && oq5Var2.z()) {
                            oq5Var2.S();
                            i43 = i3;
                            map3 = map;
                            function24 = function2;
                            gesVar5 = gesVar;
                            pn0Var3 = pn0Var;
                            on0Var4 = on0Var;
                            oq5Var = oq5Var2;
                            z4 = z2;
                            i45 = i15;
                            yciVar3 = yciVar2;
                            j11 = j6;
                            j12 = j3;
                            j10 = j5;
                            i46 = i4;
                            i44 = i5;
                        } else {
                            oq5Var2.U();
                            if ((i6 & 1) != 0 || oq5Var2.y()) {
                                if (i50 != 0) {
                                    yciVar2 = vci.a;
                                }
                                j7 = i9 == 0 ? kes.c : j3;
                                j8 = i13 == 0 ? kes.c : j6;
                                if ((i8 & 256) == 0) {
                                    i33 = i19 & (-234881025);
                                    i15 = Integer.MIN_VALUE;
                                } else {
                                    i33 = i19;
                                }
                                j9 = i18 == 0 ? kes.c : j5;
                                i34 = i22 == 0 ? 1 : i3;
                                if (i23 != 0) {
                                    z2 = true;
                                }
                                i35 = i24 == 0 ? Integer.MAX_VALUE : i4;
                                if (i26 == 0) {
                                    map2 = e5b.a;
                                    map2.getClass();
                                } else {
                                    map2 = map;
                                }
                                if (i28 == 0) {
                                    i37 = -29360129;
                                    Object K = oq5Var2.K();
                                    i36 = i33;
                                    if (K == gq5.a) {
                                        K = new fp5(22);
                                        oq5Var2.k0(K);
                                    }
                                    function22 = (Function2) K;
                                } else {
                                    i36 = i33;
                                    i37 = -29360129;
                                    function22 = function2;
                                }
                                if ((i8 & SQLiteDatabase.OPEN_SHAREDCACHE) == 0) {
                                    gesVar2 = (ges) oq5Var2.j(xcs.a);
                                    i38 = i59 & i37;
                                } else {
                                    gesVar2 = gesVar;
                                    i38 = i59;
                                }
                                pn0 pn0Var4 = i29 == 0 ? null : pn0Var;
                                if (i31 == 0) {
                                    i40 = i36;
                                    function23 = function22;
                                    pn0Var2 = pn0Var4;
                                    i41 = 1;
                                    i39 = i38;
                                    gesVar3 = gesVar2;
                                    on0Var2 = null;
                                } else {
                                    ges gesVar7 = gesVar2;
                                    on0Var2 = on0Var;
                                    function23 = function22;
                                    pn0Var2 = pn0Var4;
                                    i39 = i38;
                                    gesVar3 = gesVar7;
                                    i40 = i36;
                                    i41 = 1;
                                }
                            } else {
                                oq5Var2.S();
                                int i60 = (i8 & 256) != 0 ? i19 & (-234881025) : i19;
                                if ((i8 & SQLiteDatabase.OPEN_SHAREDCACHE) != 0) {
                                    j7 = j3;
                                    j9 = j5;
                                    i34 = i3;
                                    gesVar3 = gesVar;
                                    pn0Var2 = pn0Var;
                                    i39 = i59 & (-29360129);
                                    i40 = i60;
                                    j8 = j6;
                                    i35 = i4;
                                    i41 = i5;
                                    map2 = map;
                                    on0Var2 = on0Var;
                                } else {
                                    j7 = j3;
                                    j9 = j5;
                                    i34 = i3;
                                    gesVar3 = gesVar;
                                    pn0Var2 = pn0Var;
                                    on0Var2 = on0Var;
                                    i39 = i59;
                                    i40 = i60;
                                    j8 = j6;
                                    i35 = i4;
                                    i41 = i5;
                                    map2 = map;
                                }
                                function23 = function2;
                            }
                            oq5Var2.q();
                            if (pn0Var2 != null) {
                                oq5Var2.Z(68371051);
                                if (on0Var2 != null) {
                                    i47 = i35;
                                    oq5Var2.Z(68512318);
                                    z3 = z2;
                                    on0Var3 = on0Var2;
                                    gesVar6 = gesVar3;
                                    ogi ogiVar = new ogi(mn0Var, gesVar6, ia6.a(0, (int) ff7.Q(on0Var2.a, oq5Var2), 0, (int) ff7.Q(on0Var2.b, oq5Var2)), (jx7) oq5Var2.j(es5.h), (ppc) oq5Var2.j(es5.k), i47, true);
                                    mn0Var2 = mn0Var;
                                    i48 = q5g.F(ogiVar, mn0Var2.b);
                                    z5 = false;
                                    oq5Var2.p(false);
                                } else {
                                    on0Var3 = on0Var2;
                                    i47 = i35;
                                    z3 = z2;
                                    gesVar6 = gesVar3;
                                    z5 = false;
                                    mn0Var2 = mn0Var;
                                    oq5Var2.Z(69233502);
                                    oq5Var2.p(false);
                                    i48 = i47;
                                }
                                A = new rn0(mn0Var2, z5, i48);
                                oq5Var2.p(z5);
                                i42 = i47;
                                oq5Var = oq5Var2;
                                gesVar4 = gesVar6;
                            } else {
                                on0Var3 = on0Var2;
                                int i61 = i35;
                                z3 = z2;
                                ges gesVar8 = gesVar3;
                                oq5Var2.Z(69317822);
                                int i62 = i39 >> 6;
                                A = leu.A(mn0Var, i61, pn0Var2.a, pn0Var2.b, pn0Var2.c, gesVar8, false, on0Var3 != null, pn0Var2.d, oq5Var2, (i40 & 14) | (i62 & 112) | (i62 & 458752), 0, 192);
                                i42 = i61;
                                gesVar4 = gesVar8;
                                oq5Var = oq5Var2;
                                oq5Var.p(false);
                            }
                            final boolean z6 = z3;
                            final rn0 rn0Var = A;
                            final ges gesVar9 = gesVar4;
                            final long j13 = j9;
                            final int i63 = i34;
                            final yci yciVar4 = yciVar2;
                            final long j14 = j8;
                            final Map map4 = map2;
                            final long j15 = j7;
                            d(A.a, i15, ild.C(-783331240, new pyc() { // from class: p48
                                @Override // defpackage.pyc
                                public final Object invoke(Object obj, Object obj2, Object obj3) {
                                    o9s o9sVar = (o9s) obj;
                                    hq5 hq5Var2 = (hq5) obj2;
                                    int intValue = ((Integer) obj3).intValue();
                                    if ((intValue & 6) == 0) {
                                        intValue |= ((oq5) hq5Var2).d(o9sVar.a) ? 4 : 2;
                                    }
                                    if ((intValue & 19) == 18) {
                                        oq5 oq5Var3 = (oq5) hq5Var2;
                                        if (oq5Var3.z()) {
                                            oq5Var3.S();
                                            return Unit.a;
                                        }
                                    }
                                    rn0 rn0Var2 = rn0.this;
                                    mn0 mn0Var3 = rn0Var2.a;
                                    int i64 = rn0Var2.b ? 3 : i63;
                                    int i65 = rn0Var2.c;
                                    oq5 oq5Var4 = (oq5) hq5Var2;
                                    Function2 function25 = function23;
                                    boolean f2 = oq5Var4.f(function25) | oq5Var4.f(rn0Var2);
                                    Object K2 = oq5Var4.K();
                                    if (f2 || K2 == gq5.a) {
                                        K2 = new ny2(11, function25, rn0Var2);
                                        oq5Var4.k0(K2);
                                    }
                                    xcs.c(mn0Var3, yciVar4, j2, j15, null, j14, o9sVar, j13, i64, z6, i65, i41, map4, (Function1) K2, gesVar9, oq5Var4, (intValue << 27) & 1879048192, 0, 0);
                                    return Unit.a;
                                }
                            }, oq5Var), oq5Var, ((i40 >> 21) & 112) | 384);
                            gesVar5 = gesVar4;
                            i43 = i34;
                            function24 = function23;
                            map3 = map2;
                            on0Var4 = on0Var3;
                            i44 = i41;
                            pn0Var3 = pn0Var2;
                            i45 = i15;
                            long j16 = j8;
                            z4 = z6;
                            i46 = i42;
                            yciVar3 = yciVar2;
                            j10 = j9;
                            j11 = j16;
                            j12 = j7;
                        }
                        r = oq5Var.r();
                        if (r == null) {
                            r.d = new Function2() { // from class: q48
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    int R = rvf.R(i6 | 1);
                                    int R2 = rvf.R(i7);
                                    xv7.i(mn0.this, yciVar3, j2, j12, j11, i45, j10, i43, z4, i46, i44, map3, function24, gesVar5, pn0Var3, on0Var4, (hq5) obj, R, R2, i8);
                                    return Unit.a;
                                }
                            };
                            return;
                        }
                        return;
                    }
                    z2 = z;
                    i24 = i8 & RemoteCameraConfig.Notification.ID;
                    if (i24 == 0) {
                    }
                    int i572 = i25 | 24576;
                    i26 = i8 & SQLiteDatabase.OPEN_NOMUTEX;
                    if (i26 == 0) {
                    }
                    i28 = i8 & SQLiteDatabase.OPEN_FULLMUTEX;
                    if (i28 == 0) {
                    }
                    if ((i8 & SQLiteDatabase.OPEN_SHAREDCACHE) == 0) {
                        i53 = 8388608;
                    }
                    int i582 = i27 | i53;
                    i29 = i8 & SQLiteDatabase.OPEN_PRIVATECACHE;
                    if (i29 == 0) {
                    }
                    i31 = i8 & 524288;
                    if (i31 == 0) {
                    }
                    int i592 = i32;
                    if ((i19 & 306783379) != 306783378) {
                    }
                    oq5Var2.U();
                    if ((i6 & 1) != 0) {
                    }
                    if (i50 != 0) {
                    }
                    if (i9 == 0) {
                    }
                    if (i13 == 0) {
                    }
                    if ((i8 & 256) == 0) {
                    }
                    if (i18 == 0) {
                    }
                    if (i22 == 0) {
                    }
                    if (i23 != 0) {
                    }
                    if (i24 == 0) {
                    }
                    if (i26 == 0) {
                    }
                    if (i28 == 0) {
                    }
                    if ((i8 & SQLiteDatabase.OPEN_SHAREDCACHE) == 0) {
                    }
                    if (i29 == 0) {
                    }
                    if (i31 == 0) {
                    }
                    oq5Var2.q();
                    if (pn0Var2 != null) {
                    }
                    final boolean z62 = z3;
                    final rn0 rn0Var2 = A;
                    final ges gesVar92 = gesVar4;
                    final long j132 = j9;
                    final int i632 = i34;
                    final yci yciVar42 = yciVar2;
                    final long j142 = j8;
                    final Map map42 = map2;
                    final long j152 = j7;
                    d(A.a, i15, ild.C(-783331240, new pyc() { // from class: p48
                        @Override // defpackage.pyc
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            o9s o9sVar = (o9s) obj;
                            hq5 hq5Var2 = (hq5) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            if ((intValue & 6) == 0) {
                                intValue |= ((oq5) hq5Var2).d(o9sVar.a) ? 4 : 2;
                            }
                            if ((intValue & 19) == 18) {
                                oq5 oq5Var3 = (oq5) hq5Var2;
                                if (oq5Var3.z()) {
                                    oq5Var3.S();
                                    return Unit.a;
                                }
                            }
                            rn0 rn0Var22 = rn0.this;
                            mn0 mn0Var3 = rn0Var22.a;
                            int i64 = rn0Var22.b ? 3 : i632;
                            int i65 = rn0Var22.c;
                            oq5 oq5Var4 = (oq5) hq5Var2;
                            Function2 function25 = function23;
                            boolean f2 = oq5Var4.f(function25) | oq5Var4.f(rn0Var22);
                            Object K2 = oq5Var4.K();
                            if (f2 || K2 == gq5.a) {
                                K2 = new ny2(11, function25, rn0Var22);
                                oq5Var4.k0(K2);
                            }
                            xcs.c(mn0Var3, yciVar42, j2, j152, null, j142, o9sVar, j132, i64, z62, i65, i41, map42, (Function1) K2, gesVar92, oq5Var4, (intValue << 27) & 1879048192, 0, 0);
                            return Unit.a;
                        }
                    }, oq5Var), oq5Var, ((i40 >> 21) & 112) | 384);
                    gesVar5 = gesVar4;
                    i43 = i34;
                    function24 = function23;
                    map3 = map2;
                    on0Var4 = on0Var3;
                    i44 = i41;
                    pn0Var3 = pn0Var2;
                    i45 = i15;
                    long j162 = j8;
                    z4 = z62;
                    i46 = i42;
                    yciVar3 = yciVar2;
                    j10 = j9;
                    j11 = j162;
                    j12 = j7;
                    r = oq5Var.r();
                    if (r == null) {
                    }
                }
            } else {
                i15 = i2;
            }
            i16 = 33554432;
            int i542 = i14 | i16;
            if ((i8 & RemoteCameraConfig.Mic.BUFFER_SIZE) != 0) {
            }
            i18 = i8 & 1024;
            if (i18 != 0) {
            }
            i21 = i8 & 2048;
            if (i21 != 0) {
            }
            int i552 = i20;
            i23 = i8 & 4096;
            if (i23 != 0) {
            }
            z2 = z;
            i24 = i8 & RemoteCameraConfig.Notification.ID;
            if (i24 == 0) {
            }
            int i5722 = i25 | 24576;
            i26 = i8 & SQLiteDatabase.OPEN_NOMUTEX;
            if (i26 == 0) {
            }
            i28 = i8 & SQLiteDatabase.OPEN_FULLMUTEX;
            if (i28 == 0) {
            }
            if ((i8 & SQLiteDatabase.OPEN_SHAREDCACHE) == 0) {
            }
            int i5822 = i27 | i53;
            i29 = i8 & SQLiteDatabase.OPEN_PRIVATECACHE;
            if (i29 == 0) {
            }
            i31 = i8 & 524288;
            if (i31 == 0) {
            }
            int i5922 = i32;
            if ((i19 & 306783379) != 306783378) {
            }
            oq5Var2.U();
            if ((i6 & 1) != 0) {
            }
            if (i50 != 0) {
            }
            if (i9 == 0) {
            }
            if (i13 == 0) {
            }
            if ((i8 & 256) == 0) {
            }
            if (i18 == 0) {
            }
            if (i22 == 0) {
            }
            if (i23 != 0) {
            }
            if (i24 == 0) {
            }
            if (i26 == 0) {
            }
            if (i28 == 0) {
            }
            if ((i8 & SQLiteDatabase.OPEN_SHAREDCACHE) == 0) {
            }
            if (i29 == 0) {
            }
            if (i31 == 0) {
            }
            oq5Var2.q();
            if (pn0Var2 != null) {
            }
            final boolean z622 = z3;
            final rn0 rn0Var22 = A;
            final ges gesVar922 = gesVar4;
            final long j1322 = j9;
            final int i6322 = i34;
            final yci yciVar422 = yciVar2;
            final long j1422 = j8;
            final Map map422 = map2;
            final long j1522 = j7;
            d(A.a, i15, ild.C(-783331240, new pyc() { // from class: p48
                @Override // defpackage.pyc
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    o9s o9sVar = (o9s) obj;
                    hq5 hq5Var2 = (hq5) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    if ((intValue & 6) == 0) {
                        intValue |= ((oq5) hq5Var2).d(o9sVar.a) ? 4 : 2;
                    }
                    if ((intValue & 19) == 18) {
                        oq5 oq5Var3 = (oq5) hq5Var2;
                        if (oq5Var3.z()) {
                            oq5Var3.S();
                            return Unit.a;
                        }
                    }
                    rn0 rn0Var222 = rn0.this;
                    mn0 mn0Var3 = rn0Var222.a;
                    int i64 = rn0Var222.b ? 3 : i6322;
                    int i65 = rn0Var222.c;
                    oq5 oq5Var4 = (oq5) hq5Var2;
                    Function2 function25 = function23;
                    boolean f2 = oq5Var4.f(function25) | oq5Var4.f(rn0Var222);
                    Object K2 = oq5Var4.K();
                    if (f2 || K2 == gq5.a) {
                        K2 = new ny2(11, function25, rn0Var222);
                        oq5Var4.k0(K2);
                    }
                    xcs.c(mn0Var3, yciVar422, j2, j1522, null, j1422, o9sVar, j1322, i64, z622, i65, i41, map422, (Function1) K2, gesVar922, oq5Var4, (intValue << 27) & 1879048192, 0, 0);
                    return Unit.a;
                }
            }, oq5Var), oq5Var, ((i40 >> 21) & 112) | 384);
            gesVar5 = gesVar4;
            i43 = i34;
            function24 = function23;
            map3 = map2;
            on0Var4 = on0Var3;
            i44 = i41;
            pn0Var3 = pn0Var2;
            i45 = i15;
            long j1622 = j8;
            z4 = z622;
            i46 = i42;
            yciVar3 = yciVar2;
            j10 = j9;
            j11 = j1622;
            j12 = j7;
            r = oq5Var.r();
            if (r == null) {
            }
        }
        yciVar2 = yciVar;
        int i512 = i49 | (!oq5Var2.e(j2) ? 256 : 128);
        i9 = i8 & 8;
        if (i9 == 0) {
        }
        if ((i8 & 16) == 0) {
        }
        int i522 = i11 | ((i8 & 32) == 0 ? 196608 : oq5Var2.f(null) ? 131072 : 65536);
        if ((i8 & 64) == 0) {
        }
        i13 = i8 & 128;
        int i532 = RemoteCameraConfig.Camera.BITRATE;
        if (i13 == 0) {
        }
        if ((i8 & 256) != 0) {
        }
        i16 = 33554432;
        int i5422 = i14 | i16;
        if ((i8 & RemoteCameraConfig.Mic.BUFFER_SIZE) != 0) {
        }
        i18 = i8 & 1024;
        if (i18 != 0) {
        }
        i21 = i8 & 2048;
        if (i21 != 0) {
        }
        int i5522 = i20;
        i23 = i8 & 4096;
        if (i23 != 0) {
        }
        z2 = z;
        i24 = i8 & RemoteCameraConfig.Notification.ID;
        if (i24 == 0) {
        }
        int i57222 = i25 | 24576;
        i26 = i8 & SQLiteDatabase.OPEN_NOMUTEX;
        if (i26 == 0) {
        }
        i28 = i8 & SQLiteDatabase.OPEN_FULLMUTEX;
        if (i28 == 0) {
        }
        if ((i8 & SQLiteDatabase.OPEN_SHAREDCACHE) == 0) {
        }
        int i58222 = i27 | i532;
        i29 = i8 & SQLiteDatabase.OPEN_PRIVATECACHE;
        if (i29 == 0) {
        }
        i31 = i8 & 524288;
        if (i31 == 0) {
        }
        int i59222 = i32;
        if ((i19 & 306783379) != 306783378) {
        }
        oq5Var2.U();
        if ((i6 & 1) != 0) {
        }
        if (i50 != 0) {
        }
        if (i9 == 0) {
        }
        if (i13 == 0) {
        }
        if ((i8 & 256) == 0) {
        }
        if (i18 == 0) {
        }
        if (i22 == 0) {
        }
        if (i23 != 0) {
        }
        if (i24 == 0) {
        }
        if (i26 == 0) {
        }
        if (i28 == 0) {
        }
        if ((i8 & SQLiteDatabase.OPEN_SHAREDCACHE) == 0) {
        }
        if (i29 == 0) {
        }
        if (i31 == 0) {
        }
        oq5Var2.q();
        if (pn0Var2 != null) {
        }
        final boolean z6222 = z3;
        final rn0 rn0Var222 = A;
        final ges gesVar9222 = gesVar4;
        final long j13222 = j9;
        final int i63222 = i34;
        final yci yciVar4222 = yciVar2;
        final long j14222 = j8;
        final Map map4222 = map2;
        final long j15222 = j7;
        d(A.a, i15, ild.C(-783331240, new pyc() { // from class: p48
            @Override // defpackage.pyc
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                o9s o9sVar = (o9s) obj;
                hq5 hq5Var2 = (hq5) obj2;
                int intValue = ((Integer) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= ((oq5) hq5Var2).d(o9sVar.a) ? 4 : 2;
                }
                if ((intValue & 19) == 18) {
                    oq5 oq5Var3 = (oq5) hq5Var2;
                    if (oq5Var3.z()) {
                        oq5Var3.S();
                        return Unit.a;
                    }
                }
                rn0 rn0Var2222 = rn0.this;
                mn0 mn0Var3 = rn0Var2222.a;
                int i64 = rn0Var2222.b ? 3 : i63222;
                int i65 = rn0Var2222.c;
                oq5 oq5Var4 = (oq5) hq5Var2;
                Function2 function25 = function23;
                boolean f2 = oq5Var4.f(function25) | oq5Var4.f(rn0Var2222);
                Object K2 = oq5Var4.K();
                if (f2 || K2 == gq5.a) {
                    K2 = new ny2(11, function25, rn0Var2222);
                    oq5Var4.k0(K2);
                }
                xcs.c(mn0Var3, yciVar4222, j2, j15222, null, j14222, o9sVar, j13222, i64, z6222, i65, i41, map4222, (Function1) K2, gesVar9222, oq5Var4, (intValue << 27) & 1879048192, 0, 0);
                return Unit.a;
            }
        }, oq5Var), oq5Var, ((i40 >> 21) & 112) | 384);
        gesVar5 = gesVar4;
        i43 = i34;
        function24 = function23;
        map3 = map2;
        on0Var4 = on0Var3;
        i44 = i41;
        pn0Var3 = pn0Var2;
        i45 = i15;
        long j16222 = j8;
        z4 = z6222;
        i46 = i42;
        yciVar3 = yciVar2;
        j10 = j9;
        j11 = j16222;
        j12 = j7;
        r = oq5Var.r();
        if (r == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x027f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void j(final String str, yci yciVar, long j2, long j3, long j4, int i2, long j5, int i3, boolean z, int i4, int i5, Function1 function1, ges gesVar, hq5 hq5Var, final int i6, final int i7, final int i8) {
        int i9;
        int i10;
        long j6;
        int i11;
        long j7;
        int i12;
        int i13;
        int i14;
        long j8;
        final int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        long j9;
        int i27;
        boolean z2;
        int i28;
        int i29;
        Function1 function12;
        ges gesVar2;
        int i30;
        int i31;
        int i32;
        long j10;
        Function1 function13;
        yci yciVar2;
        final String str2;
        final yci yciVar3;
        oq5 oq5Var;
        final long j11;
        final int i33;
        final long j12;
        final long j13;
        final boolean z3;
        final int i34;
        final Function1 function14;
        final ges gesVar3;
        final int i35;
        final long j14;
        xmn r;
        int i36;
        str.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-1738676174);
        if ((i6 & 6) == 0) {
            i9 = (oq5Var2.f(str) ? 4 : 2) | i6;
        } else {
            i9 = i6;
        }
        int i37 = i8 & 2;
        if (i37 != 0) {
            i9 |= 48;
        } else if ((i6 & 48) == 0) {
            i9 |= oq5Var2.f(yciVar) ? 32 : 16;
            i10 = i8 & 4;
            if (i10 == 0) {
                i9 |= 384;
                j6 = j2;
            } else {
                j6 = j2;
                if ((i6 & 384) == 0) {
                    i9 |= oq5Var2.e(j6) ? 256 : 128;
                }
            }
            i11 = i8 & 8;
            if (i11 == 0) {
                i9 |= 3072;
                j7 = j3;
            } else {
                j7 = j3;
                if ((i6 & 3072) == 0) {
                    i9 |= oq5Var2.e(j7) ? 2048 : 1024;
                }
            }
            i12 = i8 & 16;
            int i38 = RemoteCameraConfig.Notification.ID;
            if (i12 == 0) {
                i9 |= 24576;
            } else if ((i6 & 24576) == 0) {
                i9 |= oq5Var2.f(null) ? 16384 : 8192;
            }
            i13 = i8 & 32;
            int i39 = SQLiteDatabase.OPEN_SHAREDCACHE;
            if (i13 == 0) {
                i9 |= 196608;
            } else if ((i6 & 196608) == 0) {
                i9 |= oq5Var2.f(null) ? 131072 : 65536;
            }
            int i40 = 524288;
            if ((i8 & 64) == 0) {
                i9 |= ScreenMirroringConfig.Video.BITRATE_1_5MB;
            } else if ((i6 & ScreenMirroringConfig.Video.BITRATE_1_5MB) == 0) {
                i9 |= oq5Var2.f(null) ? 1048576 : 524288;
            }
            i14 = i8 & 128;
            if (i14 == 0) {
                i9 |= 12582912;
                j8 = j4;
            } else {
                j8 = j4;
                if ((i6 & 12582912) == 0) {
                    i9 |= oq5Var2.e(j8) ? 8388608 : RemoteCameraConfig.Camera.BITRATE;
                }
            }
            if ((i6 & 100663296) != 0) {
                if ((i8 & 256) == 0) {
                    i15 = i2;
                    if (oq5Var2.d(i15)) {
                        i36 = 67108864;
                        i9 |= i36;
                    }
                } else {
                    i15 = i2;
                }
                i36 = 33554432;
                i9 |= i36;
            } else {
                i15 = i2;
            }
            if ((i8 & RemoteCameraConfig.Mic.BUFFER_SIZE) == 0) {
                i9 |= 805306368;
            } else if ((i6 & 805306368) == 0) {
                i9 |= oq5Var2.f(null) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
            }
            i16 = i8 & 1024;
            if (i16 == 0) {
                i18 = i7 | 6;
                i17 = i16;
            } else if ((i7 & 6) == 0) {
                i17 = i16;
                i18 = i7 | (oq5Var2.e(j5) ? 4 : 2);
            } else {
                i17 = i16;
                i18 = i7;
            }
            i19 = i8 & 2048;
            if (i19 == 0) {
                i18 |= 48;
            } else if ((i7 & 48) == 0) {
                i18 |= oq5Var2.d(i3) ? 32 : 16;
                int i41 = i18;
                i20 = i8 & 4096;
                if (i20 != 0) {
                    i21 = i41 | 384;
                } else if ((i7 & 384) == 0) {
                    i21 = i41 | (oq5Var2.g(z) ? 256 : 128);
                } else {
                    i21 = i41;
                }
                i22 = i8 & RemoteCameraConfig.Notification.ID;
                if (i22 != 0) {
                    i23 = i21 | 3072;
                } else {
                    int i42 = i21;
                    if ((i7 & 3072) == 0) {
                        i23 = i42 | (oq5Var2.d(i4) ? 2048 : 1024);
                    } else {
                        i23 = i42;
                    }
                }
                i24 = i8 & 16384;
                if (i24 != 0) {
                    i25 = i23 | 24576;
                } else {
                    i25 = i23;
                    if ((i7 & 24576) == 0) {
                        if (oq5Var2.d(i5)) {
                            i38 = 16384;
                        }
                        i25 |= i38;
                        i26 = i8 & SQLiteDatabase.OPEN_NOMUTEX;
                        if (i26 == 0) {
                            i25 |= 196608;
                        } else if ((i7 & 196608) == 0) {
                            if (!oq5Var2.h(function1)) {
                                i39 = 65536;
                            }
                            i25 |= i39;
                        }
                        if ((i7 & ScreenMirroringConfig.Video.BITRATE_1_5MB) == 0) {
                            if ((i8 & SQLiteDatabase.OPEN_FULLMUTEX) == 0 && oq5Var2.f(gesVar)) {
                                i40 = 1048576;
                            }
                            i25 |= i40;
                        }
                        if ((i9 & 306783379) != 306783378 && (i25 & 599187) == 599186 && oq5Var2.z()) {
                            oq5Var2.S();
                            str2 = str;
                            yciVar3 = yciVar;
                            i33 = i3;
                            z3 = z;
                            function14 = function1;
                            gesVar3 = gesVar;
                            oq5Var = oq5Var2;
                            j11 = j6;
                            j12 = j7;
                            j14 = j8;
                            j13 = j5;
                            i34 = i4;
                            i35 = i5;
                        } else {
                            oq5Var2.U();
                            if ((i6 & 1) != 0 || oq5Var2.y()) {
                                yci yciVar4 = i37 == 0 ? vci.a : yciVar;
                                if (i10 != 0) {
                                    j6 = d85.n;
                                }
                                if (i11 != 0) {
                                    j7 = kes.c;
                                }
                                j9 = i14 == 0 ? kes.c : j8;
                                if ((i8 & 256) == 0) {
                                    i9 &= -234881025;
                                    i27 = Integer.MIN_VALUE;
                                } else {
                                    i27 = i15;
                                }
                                long j15 = i17 == 0 ? kes.c : j5;
                                int i43 = i19 == 0 ? 1 : i3;
                                z2 = i20 == 0 ? true : z;
                                i28 = i22 == 0 ? Integer.MAX_VALUE : i4;
                                int i44 = i24 == 0 ? i5 : 1;
                                yci yciVar5 = yciVar4;
                                if (i26 == 0) {
                                    Object K = oq5Var2.K();
                                    i29 = i27;
                                    if (K == gq5.a) {
                                        K = new wh7(25);
                                        oq5Var2.k0(K);
                                    }
                                    function12 = (Function1) K;
                                } else {
                                    i29 = i27;
                                    function12 = function1;
                                }
                                gesVar2 = (i8 & SQLiteDatabase.OPEN_FULLMUTEX) == 0 ? (ges) oq5Var2.j(xcs.a) : gesVar;
                                i30 = i9;
                                i31 = i44;
                                i32 = i43;
                                j10 = j15;
                                i15 = i29;
                                function13 = function12;
                                yciVar2 = yciVar5;
                            } else {
                                oq5Var2.S();
                                if ((i8 & 256) != 0) {
                                    i9 &= -234881025;
                                }
                                yciVar2 = yciVar;
                                i32 = i3;
                                z2 = z;
                                i28 = i4;
                                function13 = function1;
                                gesVar2 = gesVar;
                                i30 = i9;
                                j9 = j8;
                                j10 = j5;
                                i31 = i5;
                            }
                            oq5Var2.q();
                            final yci yciVar6 = yciVar2;
                            final int i45 = i32;
                            final int i46 = i31;
                            final long j16 = j6;
                            final Function1 function15 = function13;
                            final long j17 = j7;
                            final long j18 = j9;
                            final long j19 = j10;
                            final boolean z4 = z2;
                            final int i47 = i28;
                            final ges gesVar4 = gesVar2;
                            str2 = str;
                            d(str2, i15, ild.C(428961293, new pyc() { // from class: m48
                                @Override // defpackage.pyc
                                public final Object invoke(Object obj, Object obj2, Object obj3) {
                                    o9s o9sVar = (o9s) obj;
                                    hq5 hq5Var2 = (hq5) obj2;
                                    int intValue = ((Integer) obj3).intValue();
                                    if ((intValue & 6) == 0) {
                                        intValue |= ((oq5) hq5Var2).d(o9sVar.a) ? 4 : 2;
                                    }
                                    if ((intValue & 19) == 18) {
                                        oq5 oq5Var3 = (oq5) hq5Var2;
                                        if (oq5Var3.z()) {
                                            oq5Var3.S();
                                            return Unit.a;
                                        }
                                    }
                                    xcs.b(str, yciVar6, j16, j17, null, j18, null, o9sVar, j19, i45, z4, i47, i46, function15, gesVar4, hq5Var2, (intValue << 27) & 1879048192, 0, 0);
                                    return Unit.a;
                                }
                            }, oq5Var2), oq5Var2, (i30 & 14) | 384 | ((i30 >> 21) & 112));
                            yciVar3 = yciVar6;
                            oq5Var = oq5Var2;
                            j11 = j6;
                            long j20 = j9;
                            i33 = i45;
                            j12 = j7;
                            j13 = j10;
                            z3 = z2;
                            i34 = i28;
                            function14 = function15;
                            gesVar3 = gesVar4;
                            i35 = i46;
                            j14 = j20;
                        }
                        r = oq5Var.r();
                        if (r == null) {
                            r.d = new Function2() { // from class: n48
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    int R = rvf.R(i6 | 1);
                                    int R2 = rvf.R(i7);
                                    xv7.j(str2, yciVar3, j11, j12, j14, i15, j13, i33, z3, i34, i35, function14, gesVar3, (hq5) obj, R, R2, i8);
                                    return Unit.a;
                                }
                            };
                            return;
                        }
                        return;
                    }
                }
                i26 = i8 & SQLiteDatabase.OPEN_NOMUTEX;
                if (i26 == 0) {
                }
                if ((i7 & ScreenMirroringConfig.Video.BITRATE_1_5MB) == 0) {
                }
                if ((i9 & 306783379) != 306783378) {
                }
                oq5Var2.U();
                if ((i6 & 1) != 0) {
                }
                if (i37 == 0) {
                }
                if (i10 != 0) {
                }
                if (i11 != 0) {
                }
                if (i14 == 0) {
                }
                if ((i8 & 256) == 0) {
                }
                if (i17 == 0) {
                }
                if (i19 == 0) {
                }
                if (i20 == 0) {
                }
                if (i22 == 0) {
                }
                if (i24 == 0) {
                }
                yci yciVar52 = yciVar4;
                if (i26 == 0) {
                }
                if ((i8 & SQLiteDatabase.OPEN_FULLMUTEX) == 0) {
                }
                i30 = i9;
                i31 = i44;
                i32 = i43;
                j10 = j15;
                i15 = i29;
                function13 = function12;
                yciVar2 = yciVar52;
                oq5Var2.q();
                final yci yciVar62 = yciVar2;
                final int i452 = i32;
                final int i462 = i31;
                final long j162 = j6;
                final Function1 function152 = function13;
                final long j172 = j7;
                final long j182 = j9;
                final long j192 = j10;
                final boolean z42 = z2;
                final int i472 = i28;
                final ges gesVar42 = gesVar2;
                str2 = str;
                d(str2, i15, ild.C(428961293, new pyc() { // from class: m48
                    @Override // defpackage.pyc
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        o9s o9sVar = (o9s) obj;
                        hq5 hq5Var2 = (hq5) obj2;
                        int intValue = ((Integer) obj3).intValue();
                        if ((intValue & 6) == 0) {
                            intValue |= ((oq5) hq5Var2).d(o9sVar.a) ? 4 : 2;
                        }
                        if ((intValue & 19) == 18) {
                            oq5 oq5Var3 = (oq5) hq5Var2;
                            if (oq5Var3.z()) {
                                oq5Var3.S();
                                return Unit.a;
                            }
                        }
                        xcs.b(str, yciVar62, j162, j172, null, j182, null, o9sVar, j192, i452, z42, i472, i462, function152, gesVar42, hq5Var2, (intValue << 27) & 1879048192, 0, 0);
                        return Unit.a;
                    }
                }, oq5Var2), oq5Var2, (i30 & 14) | 384 | ((i30 >> 21) & 112));
                yciVar3 = yciVar62;
                oq5Var = oq5Var2;
                j11 = j6;
                long j202 = j9;
                i33 = i452;
                j12 = j7;
                j13 = j10;
                z3 = z2;
                i34 = i28;
                function14 = function152;
                gesVar3 = gesVar42;
                i35 = i462;
                j14 = j202;
                r = oq5Var.r();
                if (r == null) {
                }
            }
            int i412 = i18;
            i20 = i8 & 4096;
            if (i20 != 0) {
            }
            i22 = i8 & RemoteCameraConfig.Notification.ID;
            if (i22 != 0) {
            }
            i24 = i8 & 16384;
            if (i24 != 0) {
            }
            i26 = i8 & SQLiteDatabase.OPEN_NOMUTEX;
            if (i26 == 0) {
            }
            if ((i7 & ScreenMirroringConfig.Video.BITRATE_1_5MB) == 0) {
            }
            if ((i9 & 306783379) != 306783378) {
            }
            oq5Var2.U();
            if ((i6 & 1) != 0) {
            }
            if (i37 == 0) {
            }
            if (i10 != 0) {
            }
            if (i11 != 0) {
            }
            if (i14 == 0) {
            }
            if ((i8 & 256) == 0) {
            }
            if (i17 == 0) {
            }
            if (i19 == 0) {
            }
            if (i20 == 0) {
            }
            if (i22 == 0) {
            }
            if (i24 == 0) {
            }
            yci yciVar522 = yciVar4;
            if (i26 == 0) {
            }
            if ((i8 & SQLiteDatabase.OPEN_FULLMUTEX) == 0) {
            }
            i30 = i9;
            i31 = i44;
            i32 = i43;
            j10 = j15;
            i15 = i29;
            function13 = function12;
            yciVar2 = yciVar522;
            oq5Var2.q();
            final yci yciVar622 = yciVar2;
            final int i4522 = i32;
            final int i4622 = i31;
            final long j1622 = j6;
            final Function1 function1522 = function13;
            final long j1722 = j7;
            final long j1822 = j9;
            final long j1922 = j10;
            final boolean z422 = z2;
            final int i4722 = i28;
            final ges gesVar422 = gesVar2;
            str2 = str;
            d(str2, i15, ild.C(428961293, new pyc() { // from class: m48
                @Override // defpackage.pyc
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    o9s o9sVar = (o9s) obj;
                    hq5 hq5Var2 = (hq5) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    if ((intValue & 6) == 0) {
                        intValue |= ((oq5) hq5Var2).d(o9sVar.a) ? 4 : 2;
                    }
                    if ((intValue & 19) == 18) {
                        oq5 oq5Var3 = (oq5) hq5Var2;
                        if (oq5Var3.z()) {
                            oq5Var3.S();
                            return Unit.a;
                        }
                    }
                    xcs.b(str, yciVar622, j1622, j1722, null, j1822, null, o9sVar, j1922, i4522, z422, i4722, i4622, function1522, gesVar422, hq5Var2, (intValue << 27) & 1879048192, 0, 0);
                    return Unit.a;
                }
            }, oq5Var2), oq5Var2, (i30 & 14) | 384 | ((i30 >> 21) & 112));
            yciVar3 = yciVar622;
            oq5Var = oq5Var2;
            j11 = j6;
            long j2022 = j9;
            i33 = i4522;
            j12 = j7;
            j13 = j10;
            z3 = z2;
            i34 = i28;
            function14 = function1522;
            gesVar3 = gesVar422;
            i35 = i4622;
            j14 = j2022;
            r = oq5Var.r();
            if (r == null) {
            }
        }
        i10 = i8 & 4;
        if (i10 == 0) {
        }
        i11 = i8 & 8;
        if (i11 == 0) {
        }
        i12 = i8 & 16;
        int i382 = RemoteCameraConfig.Notification.ID;
        if (i12 == 0) {
        }
        i13 = i8 & 32;
        int i392 = SQLiteDatabase.OPEN_SHAREDCACHE;
        if (i13 == 0) {
        }
        int i402 = 524288;
        if ((i8 & 64) == 0) {
        }
        i14 = i8 & 128;
        if (i14 == 0) {
        }
        if ((i6 & 100663296) != 0) {
        }
        if ((i8 & RemoteCameraConfig.Mic.BUFFER_SIZE) == 0) {
        }
        i16 = i8 & 1024;
        if (i16 == 0) {
        }
        i19 = i8 & 2048;
        if (i19 == 0) {
        }
        int i4122 = i18;
        i20 = i8 & 4096;
        if (i20 != 0) {
        }
        i22 = i8 & RemoteCameraConfig.Notification.ID;
        if (i22 != 0) {
        }
        i24 = i8 & 16384;
        if (i24 != 0) {
        }
        i26 = i8 & SQLiteDatabase.OPEN_NOMUTEX;
        if (i26 == 0) {
        }
        if ((i7 & ScreenMirroringConfig.Video.BITRATE_1_5MB) == 0) {
        }
        if ((i9 & 306783379) != 306783378) {
        }
        oq5Var2.U();
        if ((i6 & 1) != 0) {
        }
        if (i37 == 0) {
        }
        if (i10 != 0) {
        }
        if (i11 != 0) {
        }
        if (i14 == 0) {
        }
        if ((i8 & 256) == 0) {
        }
        if (i17 == 0) {
        }
        if (i19 == 0) {
        }
        if (i20 == 0) {
        }
        if (i22 == 0) {
        }
        if (i24 == 0) {
        }
        yci yciVar5222 = yciVar4;
        if (i26 == 0) {
        }
        if ((i8 & SQLiteDatabase.OPEN_FULLMUTEX) == 0) {
        }
        i30 = i9;
        i31 = i44;
        i32 = i43;
        j10 = j15;
        i15 = i29;
        function13 = function12;
        yciVar2 = yciVar5222;
        oq5Var2.q();
        final yci yciVar6222 = yciVar2;
        final int i45222 = i32;
        final int i46222 = i31;
        final long j16222 = j6;
        final Function1 function15222 = function13;
        final long j17222 = j7;
        final long j18222 = j9;
        final long j19222 = j10;
        final boolean z4222 = z2;
        final int i47222 = i28;
        final ges gesVar4222 = gesVar2;
        str2 = str;
        d(str2, i15, ild.C(428961293, new pyc() { // from class: m48
            @Override // defpackage.pyc
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                o9s o9sVar = (o9s) obj;
                hq5 hq5Var2 = (hq5) obj2;
                int intValue = ((Integer) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= ((oq5) hq5Var2).d(o9sVar.a) ? 4 : 2;
                }
                if ((intValue & 19) == 18) {
                    oq5 oq5Var3 = (oq5) hq5Var2;
                    if (oq5Var3.z()) {
                        oq5Var3.S();
                        return Unit.a;
                    }
                }
                xcs.b(str, yciVar6222, j16222, j17222, null, j18222, null, o9sVar, j19222, i45222, z4222, i47222, i46222, function15222, gesVar4222, hq5Var2, (intValue << 27) & 1879048192, 0, 0);
                return Unit.a;
            }
        }, oq5Var2), oq5Var2, (i30 & 14) | 384 | ((i30 >> 21) & 112));
        yciVar3 = yciVar6222;
        oq5Var = oq5Var2;
        j11 = j6;
        long j20222 = j9;
        i33 = i45222;
        j12 = j7;
        j13 = j10;
        z3 = z2;
        i34 = i28;
        function14 = function15222;
        gesVar3 = gesVar4222;
        i35 = i46222;
        j14 = j20222;
        r = oq5Var.r();
        if (r == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void k(yci yciVar, long j2, float f2, float f3, hq5 hq5Var, int i2, int i3) {
        yci yciVar2;
        int i4;
        long j3;
        float f4;
        int i5;
        yci yciVar3;
        long j4;
        float f5;
        xmn r;
        long b2;
        float f6;
        float f7;
        int i6;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1249392198);
        int i7 = i3 & 1;
        if (i7 != 0) {
            i4 = i2 | 6;
            yciVar2 = yciVar;
        } else if ((i2 & 6) == 0) {
            yciVar2 = yciVar;
            i4 = (oq5Var.f(yciVar2) ? 4 : 2) | i2;
        } else {
            yciVar2 = yciVar;
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            if ((i3 & 2) == 0) {
                j3 = j2;
                if (oq5Var.e(j3)) {
                    i6 = 32;
                    i4 |= i6;
                }
            } else {
                j3 = j2;
            }
            i6 = 16;
            i4 |= i6;
        } else {
            j3 = j2;
        }
        int i8 = i3 & 4;
        if (i8 != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            f4 = f2;
            i4 |= oq5Var.c(f4) ? 256 : 128;
            i5 = i4 | 3072;
            if (oq5Var.P(i5 & 1, (i5 & 1171) == 1170)) {
                oq5Var.S();
                yciVar3 = yciVar2;
                j4 = j3;
                f5 = f3;
            } else {
                oq5Var.U();
                int i9 = i2 & 1;
                yci yciVar4 = vci.a;
                if (i9 == 0 || oq5Var.y()) {
                    if (i7 != 0) {
                        yciVar2 = yciVar4;
                    }
                    b2 = (i3 & 2) != 0 ? d85.b(((ma5) oq5Var.j(pa5.a)).c(), 0.12f, 0.0f, 0.0f, 0.0f, 14) : j3;
                    if (i8 != 0) {
                        f4 = 1;
                    }
                    f6 = 0;
                } else {
                    oq5Var.S();
                    f6 = f3;
                    b2 = j3;
                }
                oq5Var.q();
                if (f6 != 0.0f) {
                    yciVar4 = androidx.compose.foundation.layout.a.q(yciVar4, f6, 0.0f, 0.0f, 0.0f, 14);
                }
                if (cma.a(f4, 0.0f)) {
                    oq5Var.Z(-129273423);
                    f7 = 1.0f / ((jx7) oq5Var.j(es5.h)).getDensity();
                    oq5Var.p(false);
                } else {
                    oq5Var.Z(-129206866);
                    oq5Var.p(false);
                    f7 = f4;
                }
                ug3.a(androidx.compose.foundation.a.b(d.e(d.d(yciVar2.f(yciVar4), 1.0f), f7), b2, vnj.i), oq5Var, 0);
                f5 = f6;
                yciVar3 = yciVar2;
                j4 = b2;
            }
            float f8 = f4;
            r = oq5Var.r();
            if (r == null) {
                r.d = new e2a(yciVar3, j4, f8, f5, i2, i3);
                return;
            }
            return;
        }
        f4 = f2;
        i5 = i4 | 3072;
        if (oq5Var.P(i5 & 1, (i5 & 1171) == 1170)) {
        }
        float f82 = f4;
        r = oq5Var.r();
        if (r == null) {
        }
    }

    public static final void l(iwa iwaVar, yci yciVar, hq5 hq5Var, int i2) {
        int i3;
        ges gesVar;
        long j2;
        yci yciVar2;
        oq5 oq5Var;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(1945256889);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var2.f(iwaVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        int i4 = i3 | 48;
        if ((i4 & 19) == 18 && oq5Var2.z()) {
            oq5Var2.S();
            yciVar2 = yciVar;
            oq5Var = oq5Var2;
        } else {
            String str = iwaVar.c;
            int i5 = iwaVar.b ? 3 : 5;
            if (iwaVar.e) {
                oq5Var2.Z(1081105323);
                gesVar = gdg.F(oq5Var2).b;
            } else {
                oq5Var2.Z(1081106440);
                gesVar = gdg.F(oq5Var2).a;
            }
            oq5Var2.p(false);
            ges gesVar2 = gesVar;
            d85 T = pd.T(iwaVar.d);
            if (T == null) {
                oq5Var2.Z(1081109792);
                j2 = ((dq0) oq5Var2.j(eq0.a)).b.a;
                oq5Var2.p(false);
            } else {
                oq5Var2.Z(1081107560);
                oq5Var2.p(false);
                j2 = T.a;
            }
            o9s o9sVar = new o9s(i5);
            int i6 = i4 & 112;
            yciVar2 = vci.a;
            oq5Var = oq5Var2;
            xcs.b(str, yciVar2, j2, 0L, null, 0L, null, o9sVar, 0L, 0, false, 0, 0, null, gesVar2, oq5Var, i6, 0, 65016);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new oua(iwaVar, yciVar2, i2, 1);
        }
    }

    public static final void m(jag jagVar, yci yciVar, hq5 hq5Var, int i2) {
        yci yciVar2;
        jagVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-713146495);
        if (((((i2 & 6) == 0 ? (oq5Var.f(jagVar) ? 4 : 2) | i2 : i2) | 48) & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
            yciVar2 = yciVar;
        } else {
            oq5Var.a0(-2115993395);
            iag iagVar = (iag) oq5Var.j(r8g.a);
            oq5Var.p(false);
            if (!iagVar.a) {
                xmn r = oq5Var.r();
                if (r != null) {
                    r.d = new tg3(jagVar, i2);
                    return;
                }
                return;
            }
            Map map = jagVar.k;
            Map map2 = jagVar.j;
            Map map3 = jagVar.b;
            Map map4 = jagVar.d;
            Map map5 = jagVar.c;
            List list = jagVar.a;
            oq5Var.a0(-676996018);
            float f2 = 0;
            List list2 = list;
            Iterator it = list2.iterator();
            float f3 = f2;
            float f4 = f3;
            float f5 = f4;
            float f6 = f5;
            float f7 = f6;
            while (it.hasNext()) {
                List list3 = list2;
                imh imhVar = (imh) it.next();
                Iterator it2 = it;
                cma cmaVar = new cma(f2);
                cma cmaVar2 = new cma(s(R.string.epsilonUuid, oq5Var, imhVar.d));
                if (cmaVar.compareTo(cmaVar2) < 0) {
                    cmaVar = cmaVar2;
                }
                cma cmaVar3 = new cma(f3);
                cma cmaVar4 = new cma(s(R.string.epsilonPlayerIndex, oq5Var, map5.get(imhVar)));
                if (cmaVar3.compareTo(cmaVar4) < 0) {
                    cmaVar3 = cmaVar4;
                }
                cma cmaVar5 = new cma(f4);
                u7b u7bVar = (u7b) map4.get(imhVar);
                cma cmaVar6 = new cma(s(R.string.epsilonEngineIndex, oq5Var, u7bVar != null ? Integer.valueOf(u7bVar.a.l()) : null));
                if (cmaVar5.compareTo(cmaVar6) < 0) {
                    cmaVar5 = cmaVar6;
                }
                cma cmaVar7 = new cma(f5);
                cma cmaVar8 = new cma(s(R.string.epsilonPreloadState, oq5Var, map3.get(imhVar)));
                if (cmaVar7.compareTo(cmaVar8) < 0) {
                    cmaVar7 = cmaVar8;
                }
                cma cmaVar9 = new cma(f6);
                vcu vcuVar = (vcu) map2.get(imhVar);
                cma cmaVar10 = new cma(s(R.string.epsilonCurrentQuality, oq5Var, vcuVar != null ? vcuVar.c : null));
                if (cmaVar9.compareTo(cmaVar10) < 0) {
                    cmaVar9 = cmaVar10;
                }
                cma cmaVar11 = new cma(f7);
                cma cmaVar12 = new cma(s(R.string.epsilonCurrentBufferSize, oq5Var, map.get(imhVar)));
                if (cmaVar11.compareTo(cmaVar12) < 0) {
                    cmaVar11 = cmaVar12;
                }
                float f8 = cmaVar.a;
                float f9 = cmaVar3.a;
                float f10 = cmaVar5.a;
                float f11 = cmaVar7.a;
                f6 = cmaVar9.a;
                f7 = cmaVar11.a;
                f3 = f9;
                f4 = f10;
                f5 = f11;
                it = it2;
                f2 = f8;
                list2 = list3;
            }
            List list4 = list2;
            List h2 = u75.h(new cma(f2), new cma(f3), new cma(f4), new cma(f5), new cma(f6), new cma(f7));
            oq5Var.p(false);
            oq5Var.a0(-483455358);
            ta5 a2 = sa5.a(qx0.c, b2c.n, oq5Var, 0);
            oq5Var.a0(-1323940314);
            int i3 = oq5Var.P;
            androidx.compose.runtime.internal.a l2 = oq5Var.l();
            xp5.T.getClass();
            grb grbVar = wp5.b;
            yciVar2 = vci.a;
            wn5 A = ghh.A(yciVar2);
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a2, wp5.f);
            g0g.U(oq5Var, l2, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var, i3, kb5Var);
            }
            A.invoke(new lrq(oq5Var), oq5Var, 0);
            oq5Var.a0(2058660585);
            oq5Var.a0(-68184317);
            for (Iterator it3 = list4.iterator(); it3.hasNext(); it3 = it3) {
                imh imhVar2 = (imh) it3.next();
                String str = imhVar2.d;
                Integer num = (Integer) map5.get(imhVar2);
                u7b u7bVar2 = (u7b) map4.get(imhVar2);
                Integer valueOf = u7bVar2 != null ? Integer.valueOf(u7bVar2.a.l()) : null;
                PreloadState preloadState = (PreloadState) map3.get(imhVar2);
                vcu vcuVar2 = (vcu) map2.get(imhVar2);
                vwb.n(str, num, valueOf, preloadState, vcuVar2 != null ? vcuVar2.c : null, (pi3) map.get(imhVar2), Intrinsics.d(jagVar.n, imhVar2), h2, null, oq5Var, 0);
                map4 = map4;
                map5 = map5;
                map3 = map3;
            }
            k5r.s(oq5Var, false, false, true, false);
            oq5Var.p(false);
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new kg0(i2, 9, yciVar2, jagVar);
        }
    }

    public static final void n(int i2, hq5 hq5Var, yci yciVar, Function0 function0, Function0 function02, boolean z, boolean z2) {
        yci yciVar2;
        function0.getClass();
        function02.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-408896529);
        int i3 = (oq5Var.g(z) ? 4 : 2) | i2 | (oq5Var.g(z2) ? 32 : 16) | (oq5Var.h(function0) ? 256 : 128) | (oq5Var.h(function02) ? 2048 : 1024) | 24576;
        if ((i3 & 9363) == 9362 && oq5Var.z()) {
            oq5Var.S();
            yciVar2 = yciVar;
        } else {
            nho a2 = lho.a(qx0.a, b2c.k, oq5Var, 0);
            int i4 = oq5Var.P;
            androidx.compose.runtime.internal.a l2 = oq5Var.l();
            vci vciVar = vci.a;
            yci H = vnj.H(oq5Var, vciVar);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a2, wp5.f);
            g0g.U(oq5Var, l2, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var, i4, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            if (z) {
                oq5Var.Z(834644149);
                aae.a(function0, null, false, wct.b, oq5Var, ((i3 >> 6) & 14) | 24576, 14);
            } else {
                oq5Var.Z(833921167);
            }
            oq5Var.p(false);
            if (z2) {
                oq5Var.Z(835052264);
                aae.a(function02, null, false, wct.c, oq5Var, ((i3 >> 9) & 14) | 24576, 14);
            } else {
                oq5Var.Z(833921167);
            }
            oq5Var.p(false);
            oq5Var.p(true);
            yciVar2 = vciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new cae(z, z2, function0, function02, yciVar2, i2);
        }
    }

    public static final void o(String str, k2s k2sVar, boolean z, fvf fvfVar, Function0 function0, Function1 function1, Function0 function02, yci yciVar, Function2 function2, hq5 hq5Var, int i2, int i3) {
        int i4;
        Function2 function22;
        int i5;
        oq5 oq5Var;
        yci yciVar2;
        Function2 function23;
        str.getClass();
        k2sVar.getClass();
        fvfVar.getClass();
        function0.getClass();
        function1.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(643855711);
        if ((i2 & 6) == 0) {
            i4 = (oq5Var2.f(str) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i6 = i4 | (oq5Var2.f(k2sVar) ? 32 : 16);
        if ((i2 & 384) == 0) {
            i6 |= oq5Var2.g(z) ? 256 : 128;
        }
        int i7 = i6 | (oq5Var2.f(fvfVar) ? 2048 : 1024);
        if ((i2 & 24576) == 0) {
            i7 |= oq5Var2.h(function0) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((196608 & i2) == 0) {
            i7 |= oq5Var2.h(function1) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        }
        if ((1572864 & i2) == 0) {
            i7 |= oq5Var2.h(function02) ? 1048576 : 524288;
        }
        int i8 = 12582912 | i7;
        int i9 = i3 & 256;
        if (i9 != 0) {
            i5 = i7 | 113246208;
            function22 = function2;
        } else {
            function22 = function2;
            i5 = i8 | (oq5Var2.h(function22) ? 67108864 : 33554432);
        }
        if (oq5Var2.P(i5 & 1, (38347923 & i5) != 38347922)) {
            if (i9 != 0) {
                function22 = null;
            }
            Function2 function24 = function22;
            Object K = oq5Var2.K();
            if (K == gq5.a) {
                K = gld.R(g.a, oq5Var2);
                oq5Var2.k0(K);
            }
            mm6 mm6Var = (mm6) K;
            boolean z2 = k2sVar.b.d;
            wn5 C = ild.C(-1500467562, new gjf(z, z2, function24, k2sVar, function02, z && !z2, function1, mm6Var, fvfVar, str, function0, 0), oq5Var2);
            oq5Var = oq5Var2;
            pd.b(new qzm[0], false, C, oq5Var, 0, 2);
            yciVar2 = vci.a;
            function23 = function24;
        } else {
            oq5Var = oq5Var2;
            oq5Var.S();
            yciVar2 = yciVar;
            function23 = function22;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new bq(str, k2sVar, z, fvfVar, function0, function1, function02, yciVar2, function23, i2, i3);
        }
    }

    public static final void p(k2s k2sVar, Function2 function2, hq5 hq5Var, int i2) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1383548061);
        int i3 = (oq5Var.f(k2sVar) ? 4 : 2) | i2 | (oq5Var.h(function2) ? 32 : 16);
        if (oq5Var.P(i3 & 1, (i3 & 19) != 18)) {
            hag.h(k2sVar.b.a, ild.C(-902456921, new fb1(8, (List) gld.M(k2sVar.b.c, oq5Var).getValue(), rvf.M(R.string.has_notification, oq5Var), function2), oq5Var), d.d(d.e(vci.a, 40), 1.0f), false, false, oq5Var, 432);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new t1b(k2sVar, function2, i2, 22);
        }
    }

    public static final void q(yci yciVar, Function2 function2, hq5 hq5Var, int i2) {
        int i3;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1177876616);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var.f(yciVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var.h(function2) ? 32 : 16;
        }
        if (oq5Var.P(i3 & 1, (i3 & 19) != 18)) {
            r30 r30Var = r30.c;
            int i4 = oq5Var.P;
            androidx.compose.runtime.internal.a l2 = oq5Var.l();
            yci H = vnj.H(oq5Var, yciVar);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            int i5 = (((((i3 << 3) & 112) | (((i3 >> 3) & 14) | 384)) << 6) & 896) | 6;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, r30Var, wp5.f);
            g0g.U(oq5Var, l2, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var, i4, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            function2.invoke(oq5Var, Integer.valueOf((i5 >> 6) & 14));
            oq5Var.p(true);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new kg0(yciVar, function2, i2, 0);
        }
    }

    public static final ExecutorService r(boolean z) {
        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new s46(z));
        newFixedThreadPool.getClass();
        return newFixedThreadPool;
    }

    public static final float s(int i2, hq5 hq5Var, Object obj) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.a0(2018395674);
        int length = rvf.M(i2, oq5Var).length() + h4a.u(Integer.valueOf(i2), obj, oq5Var).length();
        oq5Var.a0(-862651793);
        agr agrVar = bfs.c;
        u3r u3rVar = (u3r) oq5Var.j(agrVar);
        oq5Var.p(false);
        float f2 = length + u3rVar.c;
        oq5Var.a0(-862651793);
        u3r u3rVar2 = (u3r) oq5Var.j(agrVar);
        oq5Var.p(false);
        float f3 = (int) (f2 * u3rVar2.d);
        oq5Var.p(false);
        return f3;
    }

    public static void t(float f2, float[] fArr) {
        if (f2 <= 0.5f) {
            fArr[0] = 1.0f - (f2 * 2.0f);
            fArr[1] = 0.0f;
        } else {
            fArr[0] = 0.0f;
            fArr[1] = (f2 * 2.0f) - 1.0f;
        }
    }

    public static byte[] u(byte[] bArr) {
        if (bArr.length != 16) {
            xq0.x("value must be a block.");
            return null;
        }
        byte[] bArr2 = new byte[16];
        for (int i2 = 0; i2 < 16; i2++) {
            byte b2 = (byte) ((bArr[i2] << 1) & 254);
            bArr2[i2] = b2;
            if (i2 < 15) {
                bArr2[i2] = (byte) (((byte) ((bArr[i2 + 1] >> 7) & 1)) | b2);
            }
        }
        bArr2[15] = (byte) (((byte) ((bArr[0] >> 7) & 135)) ^ bArr2[15]);
        return bArr2;
    }

    public static void v(byte[] bArr, int i2, int i3, byte[] bArr2, int i4, int i5) {
        byte[] bArr3 = (i5 & 16) == 16 ? b : (i5 & 32) == 32 ? c : a;
        int i6 = (i3 > 1 ? (bArr[i2 + 1] << 24) >>> 16 : 0) | (i3 > 0 ? (bArr[i2] << 24) >>> 8 : 0) | (i3 > 2 ? (bArr[i2 + 2] << 24) >>> 24 : 0);
        if (i3 == 1) {
            bArr2[i4] = bArr3[i6 >>> 18];
            bArr2[i4 + 1] = bArr3[(i6 >>> 12) & 63];
            bArr2[i4 + 2] = 61;
            bArr2[i4 + 3] = 61;
            return;
        }
        if (i3 == 2) {
            bArr2[i4] = bArr3[i6 >>> 18];
            bArr2[i4 + 1] = bArr3[(i6 >>> 12) & 63];
            bArr2[i4 + 2] = bArr3[(i6 >>> 6) & 63];
            bArr2[i4 + 3] = 61;
            return;
        }
        if (i3 != 3) {
            return;
        }
        bArr2[i4] = bArr3[i6 >>> 18];
        bArr2[i4 + 1] = bArr3[(i6 >>> 12) & 63];
        bArr2[i4 + 2] = bArr3[(i6 >>> 6) & 63];
        bArr2[i4 + 3] = bArr3[i6 & 63];
    }

    public static String w(int i2, byte[] bArr) {
        if (bArr == null) {
            xq0.x("Cannot serialize a null array.");
            return null;
        }
        if (i2 < 0) {
            xq0.x(k5r.i(i2, "Cannot have length offset: "));
            return null;
        }
        if (i2 > bArr.length) {
            b6e.p("Cannot have offset of %d and length of %d with array of length %d", new Object[]{0, Integer.valueOf(i2), Integer.valueOf(bArr.length)});
            return null;
        }
        int i3 = ((i2 / 3) * 4) + (i2 % 3 <= 0 ? 0 : 4);
        byte[] bArr2 = new byte[i3];
        int i4 = i2 - 2;
        int i5 = 0;
        int i6 = 0;
        while (i5 < i4) {
            v(bArr, i5, 3, bArr2, i6, 0);
            i5 += 3;
            i6 += 4;
        }
        if (i5 < i2) {
            v(bArr, i5, i2 - i5, bArr2, i6, 0);
            i6 += 4;
        }
        if (i6 <= i3 - 1) {
            byte[] bArr3 = new byte[i6];
            System.arraycopy(bArr2, 0, bArr3, 0, i6);
            bArr2 = bArr3;
        }
        try {
            return new String(bArr2, "US-ASCII");
        } catch (UnsupportedEncodingException unused) {
            return new String(bArr2);
        }
    }

    public static mmv x(aa6 aa6Var, int i2, ArrayList arrayList, mmv mmvVar) {
        int i3;
        int i4 = i2 == 0 ? aa6Var.s0 : aa6Var.t0;
        if (i4 != -1 && (mmvVar == null || i4 != mmvVar.b)) {
            int i5 = 0;
            while (true) {
                if (i5 >= arrayList.size()) {
                    break;
                }
                mmv mmvVar2 = (mmv) arrayList.get(i5);
                if (mmvVar2.b == i4) {
                    if (mmvVar != null) {
                        mmvVar.c(i2, mmvVar2);
                        arrayList.remove(mmvVar);
                    }
                    mmvVar = mmvVar2;
                } else {
                    i5++;
                }
            }
        } else if (i4 != -1) {
            return mmvVar;
        }
        if (mmvVar == null) {
            if (aa6Var instanceof fxd) {
                fxd fxdVar = (fxd) aa6Var;
                int i6 = 0;
                while (true) {
                    if (i6 >= fxdVar.v0) {
                        i3 = -1;
                        break;
                    }
                    aa6 aa6Var2 = fxdVar.u0[i6];
                    if ((i2 == 0 && (i3 = aa6Var2.s0) != -1) || (i2 == 1 && (i3 = aa6Var2.t0) != -1)) {
                        break;
                    }
                    i6++;
                }
                if (i3 != -1) {
                    int i7 = 0;
                    while (true) {
                        if (i7 >= arrayList.size()) {
                            break;
                        }
                        mmv mmvVar3 = (mmv) arrayList.get(i7);
                        if (mmvVar3.b == i3) {
                            mmvVar = mmvVar3;
                            break;
                        }
                        i7++;
                    }
                }
            }
            if (mmvVar == null) {
                mmvVar = new mmv();
                mmvVar.a = new ArrayList();
                mmvVar.d = null;
                mmvVar.e = -1;
                int i8 = mmv.f;
                mmv.f = i8 + 1;
                mmvVar.b = i8;
                mmvVar.c = i2;
            }
            arrayList.add(mmvVar);
        }
        ArrayList arrayList2 = mmvVar.a;
        if (arrayList2.contains(aa6Var)) {
            return mmvVar;
        }
        arrayList2.add(aa6Var);
        if (aa6Var instanceof grd) {
            grd grdVar = (grd) aa6Var;
            grdVar.x0.c(grdVar.y0 == 0 ? 1 : 0, mmvVar, arrayList);
        }
        int i9 = mmvVar.b;
        if (i2 == 0) {
            aa6Var.s0 = i9;
            aa6Var.J.c(i2, mmvVar, arrayList);
            aa6Var.L.c(i2, mmvVar, arrayList);
        } else {
            aa6Var.t0 = i9;
            aa6Var.K.c(i2, mmvVar, arrayList);
            aa6Var.N.c(i2, mmvVar, arrayList);
            aa6Var.M.c(i2, mmvVar, arrayList);
        }
        aa6Var.Q.c(i2, mmvVar, arrayList);
        return mmvVar;
    }

    public static final okb y(v74 v74Var) {
        v74Var.getClass();
        switch (v74Var.ordinal()) {
            case 0:
                return okb.Phone;
            case 1:
                return okb.WebTv;
            case 2:
                return okb.AppleTv;
            case 3:
                return okb.AndroidTv;
            case 4:
                return okb.AndroidWear;
            case 5:
                return okb.WebDesktop;
            case 6:
                return okb.Web;
            case 7:
                return okb.Station;
            default:
                b6e.s();
                return null;
        }
    }

    public static final okb z(fow fowVar) {
        fowVar.getClass();
        switch (fowVar.ordinal()) {
            case 0:
                return okb.Phone;
            case 1:
                return okb.AppleTv;
            case 2:
                return okb.Phone;
            case 3:
                return okb.AndroidTv;
            case 4:
                return okb.Web;
            case 5:
                return okb.WebTv;
            case 6:
                return okb.WebDesktop;
            case 7:
                return okb.Station;
            case 8:
                return okb.AndroidWear;
            case 9:
                return okb.Unknown;
            default:
                b6e.s();
                return null;
        }
    }
}
