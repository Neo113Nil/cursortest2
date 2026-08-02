package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Shader;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Html;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.o;
import androidx.versionedparcelable.ParcelImpl;
import com.yandex.music.core.ui.compose.a;
import com.yandex.music.shared.dto.CoverPathDto;
import com.yandex.music.shared.dto.album.AlbumDto;
import com.yandex.music.shared.dto.artist.ArtistDto;
import com.yandex.music.shared.dto.playlist.PlaylistHeaderDto;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import ru.yandex.music.R;
import ru.yandex.music.data.stores.CoverPath;
import ru.yandex.music.data.stores.WebPath$Storage;
import ru.yandex.music.network.response.eventdata.AlbumsPromoEventDataDto;
import ru.yandex.music.network.response.eventdata.ArtistsPromoEventDataDto;
import ru.yandex.music.network.response.eventdata.EventDataDto;
import ru.yandex.music.network.response.eventdata.PlaylistsPromoEventDataDto;
import ru.yandex.music.network.response.eventdata.PromotionEventDataDto;
import ru.yandex.music.network.response.eventdata.internaldto.AlbumTracksPairDto;
import ru.yandex.music.network.response.eventdata.internaldto.ArtistTracksPairDto;
import ru.yandex.music.network.response.eventdata.internaldto.PlaylistExtDto;
import ru.yandex.video.m3.player.impl.tracking.data.DecoderEventData;

/* loaded from: classes.dex */
public abstract class q6k {
    public static final wn5 a = new wn5(new h3(18), -751810550, false);
    public static final wn5 b;
    public static final wn5 c;
    public static final wn5 d;
    public static final wn5 e;
    public static final s3f f;
    public static final rea g;
    public static final vpl h;
    public static final wul i;
    public static final jwl j;

    static {
        new wn5(new bo5(6), -2062749128, false);
        b = new wn5(new jo5(8), 1982724996, false);
        c = new wn5(new io5(16), 767070106, false);
        d = new wn5(new ro5(11), -1910994716, false);
        e = new wn5(new ap5(28), -989594828, false);
        f = new s3f(3);
        g = new rea(12);
        h = new vpl();
        i = new wul();
        j = new jwl(2);
    }

    public static rr5 A(String str, String str2) {
        String str3;
        String str4;
        str.getClass();
        rr5 t = t(str);
        if (t != null && (str4 = t.a) != null) {
            str = str4;
        }
        if (t != null && (str3 = t.b) != null) {
            str2 = str3;
        }
        return k(str, str2);
    }

    public static final boolean B(View view) {
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup == null) {
            return false;
        }
        Object tag = viewGroup.getTag(R.id.div_penetrating_longtap_tag);
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        return (bool != null ? bool.booleanValue() : false) || B(viewGroup);
    }

    public static final wge C(Context context) {
        context.getClass();
        if (t7g.a == null) {
            t7g.a = new wge(new vw1(context, 13));
        }
        wge wgeVar = t7g.a;
        if (wgeVar != null) {
            return wgeVar;
        }
        Intrinsics.j("primaryLog");
        throw null;
    }

    public static void D(Bundle bundle, z0u z0uVar) {
        if (z0uVar == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("a", new ParcelImpl(z0uVar));
        bundle.putParcelable("android.support.v4.media.session.SESSION_TOKEN2", bundle2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x002b, code lost:
    
        if (r6 == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x002e, code lost:
    
        r0 = java.lang.Integer.toString(r10, kotlin.text.CharsKt.checkRadix(16));
        r0.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0046, code lost:
    
        throw new java.lang.NumberFormatException("Expected a digit or '-' but was 0x".concat(r0));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int E(ikn iknVar) {
        try {
            hi3 hi3Var = iknVar.b;
            iknVar.a0(1L);
            long j2 = 0;
            while (true) {
                long j3 = j2 + 1;
                if (!iknVar.request(j3)) {
                    break;
                }
                byte P = hi3Var.P(j2);
                if ((P < 48 || P > 57) && (j2 != 0 || P != 45)) {
                    break;
                }
                j2 = j3;
            }
            long Y = hi3Var.Y();
            String G = iknVar.G(Long.MAX_VALUE);
            if (Y >= 0 && Y <= 2147483647L && G.length() <= 0) {
                return (int) Y;
            }
            throw new IOException("expected an int but was \"" + Y + G + '\"');
        } catch (NumberFormatException e2) {
            kac.f(e2.getMessage());
            return 0;
        }
    }

    public static final Object F(eu1 eu1Var) {
        eu1Var.getClass();
        Object obj = eu1Var.get();
        if (obj != null) {
            return obj;
        }
        xq0.x("Value was not initialized");
        return null;
    }

    public static final void G(pxm pxmVar, PromotionEventDataDto promotionEventDataDto) {
        promotionEventDataDto.getClass();
        String description = promotionEventDataDto.getDescription();
        pxmVar.a = description == null ? "" : Html.fromHtml(description).toString().trim();
        pxmVar.b = promotionEventDataDto.getPromoId();
    }

    public static final CoverPath H(CoverPathDto coverPathDto, WebPath$Storage webPath$Storage) {
        webPath$Storage.getClass();
        String uri = coverPathDto.getUri();
        if (uri == null) {
            CoverPath none = CoverPath.none();
            none.getClass();
            return none;
        }
        CoverPath B = etn.B(uri, webPath$Storage);
        B.setCopyrightInfo(new el6(coverPathDto.getCopyrightName(), coverPathDto.getCopyrightCline()));
        return B;
    }

    public static final laa I(gaa gaaVar) {
        gaaVar.getClass();
        if (Intrinsics.d(gaaVar, caa.a)) {
            return haa.a;
        }
        if (Intrinsics.d(gaaVar, eaa.a)) {
            return jaa.a;
        }
        if (gaaVar instanceof faa) {
            return new kaa(((faa) gaaVar).a);
        }
        if (gaaVar instanceof daa) {
            return new iaa(true, ((daa) gaaVar).a);
        }
        b6e.s();
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x01e8, code lost:
    
        if (r2 == null) goto L102;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [c5b] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final qxm J(EventDataDto eventDataDto) {
        ?? r6;
        Pair pair;
        vul vulVar;
        ArrayList arrayList;
        ll1 ll1Var;
        ArtistDto artist;
        c01 C;
        String concat;
        k20 k20Var;
        AlbumDto album;
        oq G;
        eventDataDto.getClass();
        if (eventDataDto instanceof AlbumsPromoEventDataDto) {
            f30 f30Var = new f30();
            g30 g30Var = new g30();
            G(g30Var, (PromotionEventDataDto) eventDataDto);
            AlbumsPromoEventDataDto albumsPromoEventDataDto = (AlbumsPromoEventDataDto) eventDataDto;
            List<AlbumTracksPairDto> albums = albumsPromoEventDataDto.getAlbums();
            if (albums != null) {
                ArrayList arrayList2 = new ArrayList();
                for (AlbumTracksPairDto albumTracksPairDto : albums) {
                    if (albumTracksPairDto == null || (album = albumTracksPairDto.getAlbum()) == null || (G = ild.G(album)) == null) {
                        k20Var = null;
                    } else {
                        List tracks = albumTracksPairDto.getTracks();
                        k20Var = new k20(G, tracks != null ? wts.b(tracks) : c5b.a);
                    }
                    if (k20Var != null) {
                        arrayList2.add(k20Var);
                    }
                }
                ArrayList arrayList3 = g30Var.c;
                if (arrayList3 != arrayList2) {
                    arrayList3.clear();
                    arrayList3.addAll(arrayList2);
                }
            }
            f30Var.e = g30Var;
            pair = new Pair(f30Var, albumsPromoEventDataDto.getPromoId());
        } else if (eventDataDto instanceof ArtistsPromoEventDataDto) {
            co1 co1Var = new co1();
            do1 do1Var = new do1();
            do1Var.c = Collections.EMPTY_LIST;
            G(do1Var, (PromotionEventDataDto) eventDataDto);
            ArtistsPromoEventDataDto artistsPromoEventDataDto = (ArtistsPromoEventDataDto) eventDataDto;
            List<ArtistTracksPairDto> artists = artistsPromoEventDataDto.getArtists();
            if (artists != null) {
                arrayList = new ArrayList();
                for (ArtistTracksPairDto artistTracksPairDto : artists) {
                    if (artistTracksPairDto == null || (artist = artistTracksPairDto.getArtist()) == null || (C = lxe.C(artist)) == null) {
                        ll1Var = null;
                    } else {
                        List tracks2 = artistTracksPairDto.getTracks();
                        ll1Var = new ll1(C, tracks2 != null ? wts.b(tracks2) : c5b.a);
                    }
                    if (ll1Var != null) {
                        arrayList.add(ll1Var);
                    }
                }
            } else {
                arrayList = null;
            }
            if (arrayList != null) {
                do1Var.c = Collections.unmodifiableList(arrayList);
            }
            co1Var.e = do1Var;
            pair = new Pair(co1Var, artistsPromoEventDataDto.getPromoId());
        } else {
            if (!(eventDataDto instanceof PlaylistsPromoEventDataDto)) {
                b6e.s();
                return null;
            }
            u4m u4mVar = new u4m();
            v4m v4mVar = new v4m();
            G(v4mVar, (PromotionEventDataDto) eventDataDto);
            PlaylistsPromoEventDataDto playlistsPromoEventDataDto = (PlaylistsPromoEventDataDto) eventDataDto;
            List<PlaylistExtDto> playlists = playlistsPromoEventDataDto.getPlaylists();
            if (playlists != null) {
                r6 = new ArrayList();
                for (PlaylistExtDto playlistExtDto : playlists) {
                    if (playlistExtDto != null) {
                        PlaylistHeaderDto playlist = playlistExtDto.getPlaylist();
                        cvl I = playlist != null ? uwf.I(playlist) : null;
                        List<ArtistDto> artists2 = playlistExtDto.getArtists();
                        if (artists2 != null) {
                            ArrayList arrayList4 = new ArrayList();
                            for (ArtistDto artistDto : artists2) {
                                c01 C2 = artistDto != null ? lxe.C(artistDto) : null;
                                if (C2 != null) {
                                    arrayList4.add(C2);
                                }
                            }
                        }
                        List tracks3 = playlistExtDto.getTracks();
                        if (tracks3 != null) {
                            wts.b(tracks3);
                        }
                        vulVar = new vul();
                        if (I == null) {
                            I = new cvl("-1", "unknown", drt.f, 0, 0, false, 0, 0, 0, 0L, 0L, null, 0L, null, null, null, null, null, 0, null, null, null, false, null, false, null, null, 134217720);
                        }
                        vulVar.a = I;
                    } else {
                        vulVar = null;
                    }
                    if (vulVar != null) {
                        r6.add(vulVar);
                    }
                }
            } else {
                r6 = c5b.a;
            }
            LinkedList linkedList = v4mVar.c;
            if (linkedList != r6) {
                linkedList.clear();
                linkedList.addAll(r6);
            }
            u4mVar.e = v4mVar;
            pair = new Pair(u4mVar, playlistsPromoEventDataDto.getPromoId());
        }
        qxm qxmVar = (qxm) pair.a;
        String str = (String) pair.b;
        String id = eventDataDto.getId();
        if (id != null) {
            concat = eventDataDto.getId().length() != 0 ? id : null;
        }
        concat = str != null ? "event:".concat(str) : eta.e();
        String title = eventDataDto.getTitle();
        String subtitle = eventDataDto.getSubtitle();
        qxmVar.c = concat;
        qxmVar.a = title;
        qxmVar.b = subtitle;
        String typeForFrom = eventDataDto.getTypeForFrom();
        if (typeForFrom == null) {
            typeForFrom = "default";
        }
        qxmVar.d = typeForFrom;
        return qxmVar;
    }

    public static final ki1 K(b81 b81Var) {
        int ordinal = b81Var.ordinal();
        if (ordinal == 0) {
            return ki1.a;
        }
        if (ordinal == 1) {
            return ki1.b;
        }
        b6e.s();
        return null;
    }

    public static Set L(zvd zvdVar) {
        int size = zvdVar.size();
        TreeSet treeSet = null;
        for (int i2 = 0; i2 < size; i2++) {
            if ("Vary".equalsIgnoreCase(zvdVar.g(i2))) {
                String q = zvdVar.q(i2);
                if (treeSet == null) {
                    ekr.a.getClass();
                    Comparator comparator = String.CASE_INSENSITIVE_ORDER;
                    comparator.getClass();
                    treeSet = new TreeSet(comparator);
                }
                Iterator it = StringsKt.e0(q, new char[]{','}, 6).iterator();
                while (it.hasNext()) {
                    treeSet.add(StringsKt.t0((String) it.next()).toString());
                }
            }
        }
        return treeSet == null ? q5b.a : treeSet;
    }

    public static final Object M(CoroutineContext coroutineContext, Object obj, Object obj2, Function2 function2, Continuation continuation) {
        Object invoke;
        Object c2 = nfs.c(coroutineContext, obj2);
        try {
            car carVar = new car(continuation, coroutineContext);
            if (function2 == null) {
                invoke = qxe.c(function2, obj, carVar);
            } else {
                wct.o(2, function2);
                invoke = function2.invoke(obj, carVar);
            }
            nfs.a(coroutineContext, c2);
            if (invoke == nm6.a) {
                continuation.getClass();
            }
            return invoke;
        } catch (Throwable th) {
            nfs.a(coroutineContext, c2);
            throw th;
        }
    }

    public static final void a(l3 l3Var, yci yciVar, hq5 hq5Var, int i2) {
        int i3;
        l3Var.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1157916205);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var.h(l3Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        int i4 = i3 | 48;
        if ((i4 & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
        } else {
            r3 r3Var = (r3) gld.O(l3Var.e, oq5Var).getValue();
            boolean d2 = Intrinsics.d(r3Var, p3.a);
            vci vciVar = vci.a;
            if (d2) {
                oq5Var.Z(-1695394381);
                oq5Var.p(false);
            } else {
                if (!(r3Var instanceof q3)) {
                    throw vz1.i(oq5Var, 360949947, false);
                }
                oq5Var.Z(-1695327824);
                b((q3) r3Var, l3Var, vciVar, oq5Var, (i4 << 3) & 1008);
                oq5Var.p(false);
            }
            yciVar = vciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new z2(l3Var, yciVar, i2, 0);
        }
    }

    public static final void b(q3 q3Var, l3 l3Var, yci yciVar, hq5 hq5Var, int i2) {
        int i3;
        oq5 oq5Var;
        kjn kjnVar;
        int i4;
        int i5;
        oq5 oq5Var2;
        oq5 oq5Var3 = (oq5) hq5Var;
        oq5Var3.b0(662087393);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? oq5Var3.f(q3Var) : oq5Var3.h(q3Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var3.h(l3Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= oq5Var3.f(yciVar) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && oq5Var3.z()) {
            oq5Var3.S();
            oq5Var2 = oq5Var3;
        } else {
            ynn i6 = irv.i(oq5Var3);
            a63 a63Var = q3Var.e;
            boolean h2 = oq5Var3.h(l3Var);
            Object K = oq5Var3.K();
            kjn kjnVar2 = gq5.a;
            if (h2 || K == kjnVar2) {
                K = new u2(1, l3Var);
                oq5Var3.k0(K);
            }
            yci c2 = a.c(yciVar, i6, a63Var, (pyc) K, 14);
            ta5 a2 = sa5.a(qx0.c, b2c.n, oq5Var3, 0);
            int i7 = oq5Var3.P;
            androidx.compose.runtime.internal.a l = oq5Var3.l();
            yci H = vnj.H(oq5Var3, c2);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var3.d0();
            if (oq5Var3.O) {
                oq5Var3.k(grbVar);
            } else {
                oq5Var3.n0();
            }
            g0g.U(oq5Var3, a2, wp5.f);
            g0g.U(oq5Var3, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var3.O || !Intrinsics.d(oq5Var3.K(), Integer.valueOf(i7))) {
                ouj.x(i7, oq5Var3, i7, kb5Var);
            }
            g0g.U(oq5Var3, H, wp5.d);
            String str = q3Var.a;
            if (str != null) {
                oq5Var3.Z(-850099201);
                irf.h(str, null, null, null, null, false, null, false, null, oq5Var3, 0, 510);
                oq5Var = oq5Var3;
            } else {
                oq5Var = oq5Var3;
                oq5Var.Z(-852491657);
            }
            oq5Var.p(false);
            kbj kbjVar = q3Var.b;
            boolean h3 = oq5Var.h(l3Var);
            Object K2 = oq5Var.K();
            if (h3 || K2 == kjnVar2) {
                kjnVar = kjnVar2;
                i4 = 2;
                c3 c3Var = new c3(0, l3Var, l3.class, "onAlbumClick", "onAlbumClick()V", 0, 0);
                oq5Var.k0(c3Var);
                K2 = c3Var;
            } else {
                i4 = 2;
                kjnVar = kjnVar2;
            }
            int i8 = i4;
            kjn kjnVar3 = kjnVar;
            oq5 oq5Var4 = oq5Var;
            p6g.d(kbjVar, (Function0) ((h9f) K2), null, d85.m, null, null, true, ild.C(1669266286, new a3(0, q3Var, l3Var), oq5Var), null, oq5Var4, 14158848, 308);
            String str2 = q3Var.c;
            ges j2 = nu0.j();
            boolean h4 = oq5Var4.h(l3Var);
            Object K3 = oq5Var4.K();
            if (h4 || K3 == kjnVar3) {
                i5 = i8;
                c3 c3Var2 = new c3(0, l3Var, l3.class, "onExpandClick", "onExpandClick()V", 0, 2);
                oq5Var4.k0(c3Var2);
                K3 = c3Var2;
            } else {
                i5 = i8;
            }
            pd.n(str2, 3, j2, (Function0) ((h9f) K3), androidx.compose.foundation.layout.a.o(vci.a, v0k.b, 0.0f, i5), null, oq5Var4, 24624, 96);
            oq5Var2 = oq5Var4;
            oq5Var2.p(true);
        }
        xmn r = oq5Var2.r();
        if (r != null) {
            r.d = new b3(q3Var, l3Var, yciVar, i2, 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(fvf fvfVar, jz4 jz4Var, Function1 function1, wn5 wn5Var, hq5 hq5Var, int i2) {
        fvf fvfVar2;
        int i3;
        Function1 function12;
        oq5 oq5Var;
        long r;
        wn5 wn5Var2;
        Function0 function0;
        boolean z;
        fvfVar.getClass();
        jz4Var.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-1186884282);
        if ((i2 & 6) == 0) {
            fvfVar2 = fvfVar;
            i3 = (oq5Var2.f(fvfVar2) ? 4 : 2) | i2;
        } else {
            fvfVar2 = fvfVar;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var2.h(jz4Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            function12 = function1;
            i3 |= oq5Var2.h(function12) ? 256 : 128;
        } else {
            function12 = function1;
        }
        if ((i2 & 3072) == 0) {
            i3 |= oq5Var2.h(wn5Var) ? 2048 : 1024;
        }
        if (oq5Var2.P(i3 & 1, (i3 & 1171) != 1170)) {
            boolean booleanValue = ((Boolean) oq5Var2.j((agr) spg.d.c)).booleanValue();
            if (booleanValue) {
                oq5Var2.Z(1996443536);
                long j2 = ((ymk) gld.O((vdr) jz4Var.a.B.getValue(), oq5Var2).getValue()).a;
                d85 d85Var = new d85(j2);
                if (j2 == 16) {
                    d85Var = null;
                }
                if (d85Var == null) {
                    oq5Var2.Z(1865520876);
                    r = kg5.r(R.color.mymusic_favorite_vibe, oq5Var2);
                    oq5Var2.p(false);
                } else {
                    oq5Var2.Z(1865516722);
                    oq5Var2.p(false);
                    r = d85Var.a;
                }
                oq5Var2.p(false);
            } else {
                oq5Var2.Z(1996622406);
                r = kg5.r(R.color.mymusic_favorite_vibe, oq5Var2);
                oq5Var2.p(false);
            }
            String M = rvf.M(R.string.my_music_collections, oq5Var2);
            vm C = ghh.C(zs4.g(oq5Var2), ogp.A(oq5Var2));
            yci a2 = androidx.compose.ui.platform.a.a(vci.a, "collection_landing_toolbar");
            if (booleanValue) {
                oq5Var2.Z(1997411387);
                wn5Var2 = ild.C(-998606679, new bu0(r, 3), oq5Var2);
                oq5Var2.p(false);
            } else {
                oq5Var2.Z(1997880448);
                oq5Var2.p(false);
                wn5Var2 = null;
            }
            if (booleanValue) {
                oq5Var2.Z(1997959343);
                boolean h2 = oq5Var2.h(jz4Var) | oq5Var2.e(r);
                Object K = oq5Var2.K();
                if (h2 || K == gq5.a) {
                    z = false;
                    K = new sz4(jz4Var, r, 0 == true ? 1 : 0);
                    oq5Var2.k0(K);
                } else {
                    z = false;
                }
                oq5Var2.p(z);
                function0 = (Function0) K;
            } else {
                oq5Var2.Z(1998040160);
                oq5Var2.p(false);
                function0 = null;
            }
            Function1 function13 = booleanValue ? function12 : null;
            oq5Var = oq5Var2;
            xp3.d(M, fvfVar2, a2, C, null, ild.C(1669796104, new u2(24, jz4Var), oq5Var2), false, false, wn5Var2, function0, function13, wn5Var, oq5Var, ((i3 << 3) & 112) | 12779904, (i3 >> 6) & 112, 80);
        } else {
            oq5Var = oq5Var2;
            oq5Var.S();
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new uu(fvfVar, jz4Var, function12, wn5Var, i2, 21);
        }
    }

    public static final void d(Map map, hq5 hq5Var, int i2) {
        map.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-727567064);
        if ((((oq5Var.h(map) ? 4 : 2) | i2) & 3) == 2 && oq5Var.z()) {
            oq5Var.S();
        } else {
            oq5Var.a0(-2115993395);
            iag iagVar = (iag) oq5Var.j(r8g.a);
            oq5Var.p(false);
            if (!iagVar.n) {
                xmn r = oq5Var.r();
                if (r != null) {
                    r.d = new ah7(map, i2, 0);
                    return;
                }
                return;
            }
            oq5Var.a0(-483455358);
            ta5 a2 = sa5.a(qx0.c, b2c.n, oq5Var, 0);
            oq5Var.a0(-1323940314);
            int i3 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            xp5.T.getClass();
            grb grbVar = wp5.b;
            wn5 A = ghh.A(vci.a);
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a2, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var, i3, kb5Var);
            }
            A.invoke(new lrq(oq5Var), oq5Var, 0);
            oq5Var.a0(2058660585);
            oq5Var.a0(1504830099);
            for (Map.Entry entry : map.entrySet()) {
                h4a.k(((Number) entry.getKey()).intValue(), ((DecoderEventData) entry.getValue()).getName(), ((DecoderEventData) entry.getValue()).getInits(), ((DecoderEventData) entry.getValue()).getReuses(), ((DecoderEventData) entry.getValue()).getReleases(), null, oq5Var, 0);
            }
            k5r.s(oq5Var, false, false, true, false);
            oq5Var.p(false);
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new ah7(map, i2, 1);
        }
    }

    public static final void e(n1b n1bVar, d2b d2bVar, yci yciVar, hq5 hq5Var, int i2) {
        int i3;
        oq5 oq5Var;
        yci yciVar2;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(832907684);
        if ((i2 & 6) == 0) {
            i3 = i2 | (oq5Var2.f(n1bVar) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var2.h(d2bVar) ? 32 : 16;
        }
        int i4 = i3 | 384;
        if (oq5Var2.P(i4 & 1, (i4 & 147) != 146)) {
            ynn i5 = irv.i(oq5Var2);
            ArrayList arrayList = n1bVar.a;
            vci vciVar = vci.a;
            yci a2 = androidx.compose.ui.platform.a.a(vciVar, "editorial_waves_block");
            Object K = oq5Var2.K();
            if (K == gq5.a) {
                K = new uv1(15);
                oq5Var2.k0(K);
            }
            oq5Var = oq5Var2;
            hld.l(arrayList, a2, (Function1) K, 0.0f, 0.0f, 0.0f, 0.0f, null, 0, false, false, false, ild.C(1099360351, new jv(5, d2bVar, i5), oq5Var2), oq5Var, 384, 384, 4088);
            yciVar2 = vciVar;
        } else {
            oq5Var = oq5Var2;
            oq5Var.S();
            yciVar2 = yciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new yja(n1bVar, d2bVar, yciVar2, i2, 5);
        }
    }

    public static final void f(d2b d2bVar, yci yciVar, hq5 hq5Var, int i2) {
        d2bVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-758480170);
        int i3 = (oq5Var.h(d2bVar) ? 4 : 2) | i2 | 48;
        if (oq5Var.P(i3 & 1, (i3 & 19) != 18)) {
            d8t e2 = i8t.e(gld.M(d2bVar.c, oq5Var).getValue(), "editorialWavesCrossfade", oq5Var, 48, 0);
            Object K = oq5Var.K();
            if (K == gq5.a) {
                K = new rua(20);
                oq5Var.k0(K);
            }
            wn5 C = ild.C(1375189562, new tt5(12, d2bVar), oq5Var);
            vci vciVar = vci.a;
            tt0.f(e2, vciVar, null, (Function1) K, C, oq5Var, 27696, 2);
            yciVar = vciVar;
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new t1b(d2bVar, yciVar, i2, 1);
        }
    }

    public static final void g(ArrayList arrayList, Function1 function1, Function0 function0, hq5 hq5Var, int i2) {
        ArrayList arrayList2;
        Function1 function12;
        Function0 function02;
        function0.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1539089774);
        int i3 = (oq5Var.f(arrayList) ? 4 : 2) | i2 | (oq5Var.h(function1) ? 32 : 16) | (oq5Var.h(function0) ? 256 : 128);
        if (oq5Var.P(i3 & 1, (i3 & 147) != 146)) {
            int i4 = (i3 & 14) | 24576;
            int i5 = i3 << 3;
            int i6 = i4 | (i5 & 896) | (i5 & 7168);
            arrayList2 = arrayList;
            function12 = function1;
            function02 = function0;
            hag.f(arrayList2, rvf.M(R.string.header_sort, oq5Var), function12, function02, androidx.compose.ui.platform.a.a(vci.a, "modal_bottom_sheet_filter"), oq5Var, i6, 0);
        } else {
            arrayList2 = arrayList;
            function12 = function1;
            function02 = function0;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new v48(arrayList2, function12, function02, i2);
        }
    }

    public static final void h(View view, szb szbVar, one oneVar, xzb xzbVar) {
        if (((Boolean) szbVar.a(xzbVar)).booleanValue()) {
            bg3.s(view, oneVar);
            view.requestFocus();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void i(View view, List list, xzb xzbVar, Function1 function1) {
        if ((view instanceof a0c) && list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((a0c) view).i(((bd8) it.next()).b.c(xzbVar, function1));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object j(mxo mxoVar, float f2, float f3, tm0 tm0Var, cg6 cg6Var) {
        sk0 sk0Var;
        int i2;
        uqn uqnVar;
        if (cg6Var instanceof sk0) {
            sk0Var = (sk0) cg6Var;
            int i3 = sk0Var.l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                sk0Var.l = i3 - Integer.MIN_VALUE;
                Object obj = sk0Var.k;
                Object obj2 = nm6.a;
                i2 = sk0Var.l;
                if (i2 != 0) {
                    qgg.h0(obj);
                    uqn uqnVar2 = new uqn();
                    Function2 uk0Var = new uk0(f2, f3, tm0Var, uqnVar2, null);
                    sk0Var.j = uqnVar2;
                    sk0Var.l = 1;
                    if (mxoVar.a(hqi.a, uk0Var, sk0Var) == obj2) {
                        return obj2;
                    }
                    uqnVar = uqnVar2;
                } else {
                    if (i2 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uqnVar = sk0Var.j;
                    qgg.h0(obj);
                }
                return new Float(uqnVar.a);
            }
        }
        sk0Var = new sk0(cg6Var);
        Object obj3 = sk0Var.k;
        Object obj22 = nm6.a;
        i2 = sk0Var.l;
        if (i2 != 0) {
        }
        return new Float(uqnVar.a);
    }

    public static rr5 k(String str, String str2) {
        CharSequence charSequence;
        if (str.length() > 0) {
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i3 >= str.length()) {
                    int length = str.length();
                    while (true) {
                        if (i2 >= length) {
                            charSequence = "";
                            break;
                        }
                        if (str.charAt(i2) != '0') {
                            charSequence = str.subSequence(i2, str.length());
                            break;
                        }
                        i2++;
                    }
                    str = charSequence.toString();
                    if (StringsKt.U(str)) {
                        str = CommonUrlParts.Values.FALSE_INTEGER;
                    }
                } else {
                    if (!Character.isDigit(str.charAt(i3))) {
                        break;
                    }
                    i3++;
                }
            }
        }
        String str3 = null;
        if (str2 != null) {
            if (str2.equals(CommonUrlParts.Values.FALSE_INTEGER)) {
                str2 = null;
            }
            if (str2 != null) {
                if (StringsKt.U(str2)) {
                    str2 = null;
                }
                if (str2 != null && !StringsKt.N(str2, ':')) {
                    str3 = str2;
                }
            }
        }
        return new rr5(str, str3);
    }

    public static final noo l(is6 is6Var) {
        noo nooVar;
        is6Var.getClass();
        woo wooVar = (woo) is6Var.a(h);
        if (wooVar == null) {
            xq0.x("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
            return null;
        }
        kfu kfuVar = (kfu) is6Var.a(i);
        if (kfuVar == null) {
            xq0.x("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
            return null;
        }
        Bundle bundle = (Bundle) is6Var.a(j);
        String str = (String) is6Var.a(bnd.d);
        if (str == null) {
            xq0.x("CreationExtras must have a value by `VIEW_MODEL_KEY`");
            return null;
        }
        too b2 = wooVar.getSavedStateRegistry().b();
        Bundle bundle2 = null;
        qoo qooVar = b2 instanceof qoo ? (qoo) b2 : null;
        if (qooVar == null) {
            xq0.q("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
            return null;
        }
        LinkedHashMap linkedHashMap = w(kfuVar).k;
        noo nooVar2 = (noo) linkedHashMap.get(str);
        if (nooVar2 != null) {
            return nooVar2;
        }
        qooVar.b();
        Bundle bundle3 = qooVar.c;
        if (bundle3 != null && bundle3.containsKey(str)) {
            Bundle bundle4 = bundle3.getBundle(str);
            if (bundle4 == null) {
                e5b.a.getClass();
                bundle4 = cxb.K((Pair[]) Arrays.copyOf(new Pair[0], 0));
            }
            bundle3.remove(str);
            if (bundle3.isEmpty()) {
                qooVar.c = null;
            }
            bundle2 = bundle4;
        }
        if (bundle2 != null) {
            bundle = bundle2;
        }
        if (bundle == null) {
            nooVar = new noo();
        } else {
            ClassLoader classLoader = noo.class.getClassLoader();
            classLoader.getClass();
            bundle.setClassLoader(classLoader);
            f9h f9hVar = new f9h(bundle.size());
            for (String str2 : bundle.keySet()) {
                str2.getClass();
                f9hVar.put(str2, bundle.get(str2));
            }
            nooVar = new noo(f9hVar.b());
        }
        linkedHashMap.put(str, nooVar);
        return nooVar;
    }

    public static final za8 m(pjc pjcVar, Function1 function1, Function2 function2) {
        if (pjcVar instanceof za8) {
            za8 za8Var = (za8) pjcVar;
            if (za8Var.b == function1 && za8Var.c == function2) {
                return za8Var;
            }
        }
        return new za8(pjcVar, function1, function2);
    }

    public static final void n(opf opfVar, o6g o6gVar, std stdVar) {
        gh0 gh0Var;
        Paint paint;
        mu3 mu3Var;
        ou3 ou3Var = opfVar.a;
        if (stdVar.c == null) {
            long j2 = stdVar.a;
            if (o6gVar != null) {
                jpa.A0(opfVar, o6gVar, 0L, 0L, 0.0f, null, new d43(j2, 5), 0, 94);
                return;
            } else {
                jpa.B(opfVar, j2, 0L, 0L, 0.0f, null, stdVar.b, 62);
                return;
            }
        }
        Shader b2 = o6gVar != null ? o6gVar.b(ou3Var.e()) : null;
        if (b2 == null) {
            jpa.A0(opfVar, stdVar.c, 0L, 0L, 0.0f, null, null, stdVar.b, 62);
            return;
        }
        lo3 lo3Var = v4k.a;
        gh0 a2 = v4k.a(lo3Var);
        Paint paint2 = a2.a;
        try {
            mu3 s = ou3Var.b.s();
            try {
                s.m(ywf.d(0L, ou3Var.e()), a2);
                try {
                    mu3Var = s;
                    paint = paint2;
                    try {
                        jpa.A0(opfVar, stdVar.c, 0L, 0L, 0.0f, null, null, stdVar.b, 62);
                        gh0 a3 = v4k.a(lo3Var);
                        try {
                            a3.h(b2);
                            a3.d(6);
                            mu3 s2 = ou3Var.b.s();
                            ynn d2 = ywf.d(0L, ou3Var.e());
                            s2.getClass();
                            try {
                                s2.t(d2.a, d2.b, d2.c, d2.d, a3);
                                a3.a.reset();
                                lo3Var.c(a3);
                                try {
                                    mu3Var.k();
                                    paint.reset();
                                    lo3Var.c(a2);
                                } catch (Throwable th) {
                                    th = th;
                                    gh0Var = a2;
                                    paint.reset();
                                    lo3Var.c(gh0Var);
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                a3 = a3;
                                gh0Var = a2;
                                try {
                                    a3.a.reset();
                                    lo3Var.c(a3);
                                    throw th;
                                } catch (Throwable th3) {
                                    th = th3;
                                    try {
                                        mu3Var.k();
                                        throw th;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        paint.reset();
                                        lo3Var.c(gh0Var);
                                        throw th;
                                    }
                                }
                            }
                        } catch (Throwable th5) {
                            th = th5;
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        gh0Var = a2;
                    }
                } catch (Throwable th7) {
                    th = th7;
                    mu3Var = s;
                    gh0Var = a2;
                    paint = paint2;
                    mu3Var.k();
                    throw th;
                }
            } catch (Throwable th8) {
                th = th8;
                mu3Var = s;
            }
        } catch (Throwable th9) {
            th = th9;
            gh0Var = a2;
            paint = paint2;
        }
    }

    public static final void p(woo wooVar) {
        lyf b2 = wooVar.getLifecycle().b();
        if (b2 != lyf.b && b2 != lyf.c) {
            xq0.x("Failed requirement.");
        } else if (wooVar.getSavedStateRegistry().b() == null) {
            qoo qooVar = new qoo(wooVar.getSavedStateRegistry(), (kfu) wooVar);
            wooVar.getSavedStateRegistry().c("androidx.lifecycle.internal.SavedStateHandlesProvider", qooVar);
            wooVar.getLifecycle().a(new xnn(3, qooVar));
        }
    }

    public static final int q(v71 v71Var) {
        v71Var.getClass();
        e81 c2 = v71Var.c();
        if (c2 instanceof c81) {
            return ((c81) c2).c.size();
        }
        if (c2 instanceof d81) {
            return 0;
        }
        b6e.s();
        return 0;
    }

    public static final int r(v71 v71Var) {
        v71Var.getClass();
        e81 c2 = v71Var.c();
        if (c2 instanceof c81) {
            return ((c81) c2).b.size();
        }
        if (c2 instanceof d81) {
            return ((d81) c2).b.size();
        }
        b6e.s();
        return 0;
    }

    public static final long s(float f2, int i2, long j2, boolean z) {
        int i3 = ((z || i2 == 2 || i2 == 4 || i2 == 5) && ga6.e(j2)) ? ga6.i(j2) : Integer.MAX_VALUE;
        if (ga6.k(j2) != i3) {
            i3 = yhn.d(wxf.n(f2), ga6.k(j2), i3);
        }
        return qld.A(0, i3, 0, ga6.h(j2));
    }

    public static rr5 t(String str) {
        rr5 k;
        String str2;
        str.getClass();
        List e0 = StringsKt.e0(str, new char[]{':'}, 6);
        if (e0.size() == 2 && (str2 = (String) CollectionsKt.S(e0, 0)) != null) {
            int i2 = 0;
            while (true) {
                if (i2 >= str2.length()) {
                    String str3 = (String) CollectionsKt.S(e0, 1);
                    if (str3 != null) {
                        for (int i3 = 0; i3 < str3.length(); i3++) {
                            if (Character.isDigit(str3.charAt(i3))) {
                            }
                        }
                        k = k((String) e0.get(0), (String) e0.get(1));
                    }
                } else {
                    if (!Character.isDigit(str2.charAt(i2))) {
                        break;
                    }
                    i2++;
                }
            }
        }
        k = k(str, null);
        if (StringsKt.U(k.a)) {
            k = null;
        }
        if (k == null) {
            su4.s(2, null, "TrackId should not be empty or null", null);
        }
        return k;
    }

    public static final f9f u(mhp mhpVar) {
        mhpVar.getClass();
        if (mhpVar instanceof ze6) {
            return ((ze6) mhpVar).b;
        }
        if (mhpVar instanceof nhp) {
            return u(((nhp) mhpVar).a);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static o v(ru.yandex.music.player.a aVar, jnb jnbVar, boolean z) {
        l18 l18Var = l18.b;
        bdt I = hag.I(z66.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        z66 z66Var = (z66) qdcVar.C(I);
        duc ducVar = (duc) jnbVar;
        if (ducVar.h() || z66Var.g()) {
            return jnbVar;
        }
        hmj hmjVar = hmj.a;
        p6j p6jVar = new p6j();
        p6jVar.setArguments(cxb.K(new Pair("extra_hide_toolbar", Boolean.valueOf(z)), new Pair("extra_mode", 0)));
        p6jVar.D(ducVar.f(), jnbVar.getClass().getName(), jnbVar.getTag(), jnbVar.getArguments());
        return p6jVar;
    }

    public static final roo w(kfu kfuVar) {
        bnd h2 = tjl.h(kfuVar, new mt7(1), 4);
        return (roo) ((bjt) h2.b).j(ern.a(roo.class), "androidx.lifecycle.internal.SavedStateHandlesVM");
    }

    public static z0u x(Bundle bundle) {
        try {
            Bundle bundle2 = (Bundle) bundle.getParcelable("android.support.v4.media.session.SESSION_TOKEN2");
            if (bundle2 == null) {
                return null;
            }
            bundle2.setClassLoader(q6k.class.getClassLoader());
            Parcelable parcelable = bundle2.getParcelable("a");
            if (parcelable instanceof ParcelImpl) {
                return ((ParcelImpl) parcelable).a;
            }
            throw new IllegalArgumentException("Invalid parcel");
        } catch (RuntimeException unused) {
            return null;
        }
    }

    public static final void y(eu1 eu1Var, Object obj) {
        eu1Var.getClass();
        if (eu1Var.compareAndSet(null, obj)) {
            return;
        }
        b6e.l(eu1Var, "Value is already initialized: ");
    }

    public static String z(u7e u7eVar) {
        u7eVar.getClass();
        pn3 pn3Var = pn3.d;
        return ovn.C(u7eVar.i).c("MD5").e();
    }

    public abstract String o();
}
