package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.util.Log;
import android.view.View;
import android.widget.RemoteViews;
import androidx.compose.foundation.layout.a;
import androidx.compose.foundation.layout.c;
import androidx.compose.foundation.layout.d;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.yandex.music.core.ui.compose.b;
import com.yandex.music.shared.dto.ActionButtonDto;
import com.yandex.music.shared.dto.VibeButtonDto;
import com.yandex.music.shared.dto.album.AlbumDto;
import com.yandex.music.shared.dto.album.AlbumLabelDto;
import com.yandex.music.shared.dto.artist.ArtistDto;
import com.yandex.music.shared.dto.track.TrackDto;
import com.yandex.music.shared.dto.trailer.TrailerDto;
import com.yandex.music.shared.slides.ui.music.logic.impl.network.model.LikeButtonStateDataDto;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.lang.reflect.InvocationTargetException;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import ru.yandex.music.R;
import ru.yandex.music.data.audio.Album$AlbumType;
import ru.yandex.music.data.audio.WarningContent;
import ru.yandex.music.data.stores.CoverPath;
import ru.yandex.music.data.stores.WebPath$Storage;

/* loaded from: classes.dex */
public abstract class ild {
    public static final Object a = new Object();
    public static final wn5 b = new wn5(new go5(27), -848214432, false);
    public static final wn5 c = new wn5(new rz3(14), -1947315136, false);
    public static final wn5 d = new wn5(new dp5(7), -1892604303, false);
    public static final wn5 e = new wn5(new ap5(12), -860111163, false);
    public static final wn5 f = new wn5(new dp5(8), 1367190208, false);
    public static final wn5 g = new wn5(new dp5(9), -567016191, false);
    public static final wn5 h = new wn5(new dp5(10), 1793744706, false);
    public static final wn5 i = new wn5(new dp5(11), -1476802439, false);
    public static final x2i j = new x2i(22);
    public static final t9f[] k = new t9f[0];
    public static final i6c[] l = {new i6c("wallet", 1), new i6c("wallet_biometric_auth_keys", 1)};

    public static zyw A(Context context) {
        y1g.G(context);
        return new zyw(context, new rzw());
    }

    public static final Object B(Object obj, Continuation continuation) {
        if (!(obj instanceof sm5)) {
            r7o r7oVar = z7o.b;
            return obj;
        }
        r7o r7oVar2 = z7o.b;
        Throwable th = ((sm5) obj).a;
        if (ve7.b() && (continuation instanceof om6)) {
            th = dar.a(th, (om6) continuation);
        }
        return qgg.J(th);
    }

    public static final wn5 C(int i2, syc sycVar, hq5 hq5Var) {
        oq5 oq5Var = (oq5) hq5Var;
        Object K = oq5Var.K();
        if (K == gq5.a) {
            K = new wn5(sycVar, i2, true);
            oq5Var.k0(K);
        }
        wn5 wn5Var = (wn5) K;
        wn5Var.n(sycVar);
        return wn5Var;
    }

    public static final boolean D(xmn xmnVar, xmn xmnVar2) {
        if (xmnVar == null) {
            return true;
        }
        if (xmnVar instanceof xmn) {
            return !xmnVar.a() || xmnVar.equals(xmnVar2) || Intrinsics.d(xmnVar.c, xmnVar2.c);
        }
        return false;
    }

    public static void E(List list, olm olmVar, int i2, int i3) {
        for (int size = list.size() - 1; size > i3; size--) {
            if (olmVar.apply(list.get(size))) {
                list.remove(size);
            }
        }
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            list.remove(i4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object F(int i2, Object obj, t2o t2oVar, tqc tqcVar, int i3) {
        Object[] objArr;
        Object[] objArr2;
        if (!(obj instanceof Typeface)) {
            return obj;
        }
        boolean z = false;
        int i4 = 0;
        z = false;
        if ((i2 & 1) != 0 && !Intrinsics.d(t2oVar.b, tqcVar)) {
            tqc tqcVar2 = tqc.g;
            if (tqcVar.compareTo(tqcVar2) >= 0 && Intrinsics.e(t2oVar.b.a, tqcVar2.a) < 0) {
                objArr = true;
                objArr2 = (i2 & 2) == 0 && i3 != t2oVar.c;
                if (objArr2 == true && objArr != true) {
                    return obj;
                }
                if (Build.VERSION.SDK_INT < 28) {
                    int i5 = objArr != false ? tqcVar.a : t2oVar.b.a;
                    if (objArr2 == false ? t2oVar.c == 1 : i3 == 1) {
                        z = true;
                    }
                    return jo0.d((Typeface) obj, i5, z);
                }
                Object[] objArr3 = objArr2 == true && i3 == 1;
                if (objArr3 == true && objArr == true) {
                    i4 = 3;
                } else if (objArr == true) {
                    i4 = 1;
                } else if (objArr3 != false) {
                    i4 = 2;
                }
                return Typeface.create((Typeface) obj, i4);
            }
        }
        objArr = false;
        if ((i2 & 2) == 0) {
        }
        if (objArr2 == true) {
        }
        if (Build.VERSION.SDK_INT < 28) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0185 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final oq G(AlbumDto albumDto) {
        WarningContent warningContent;
        ArrayList arrayList;
        c5b c5bVar;
        Boolean available;
        Iterator it;
        ArrayList arrayList2;
        zt ztVar;
        String id;
        albumDto.getClass();
        String id2 = albumDto.getId();
        oq oqVar = null;
        String str = (id2 == null || StringsKt.U(id2)) ? null : id2;
        if (str == null) {
            return null;
        }
        List E = lxe.E(albumDto.getArtists());
        String error = albumDto.getError();
        boolean booleanValue = (error == null || error.length() <= 0) ? albumDto.getAvailable() != null ? albumDto.getAvailable().booleanValue() : true : false;
        String sortOrder = albumDto.getSortOrder();
        String title = albumDto.getTitle();
        if (title == null) {
            title = "";
        }
        String str2 = title;
        String year = albumDto.getYear();
        if (year == null) {
            year = albumDto.getOriginalReleaseYear();
        }
        String str3 = year;
        String genre = albumDto.getGenre();
        String metaType = albumDto.getMetaType();
        List<c01> list = E;
        ArrayList arrayList3 = new ArrayList(v75.o(list, 10));
        for (c01 c01Var : list) {
            Parcelable.Creator<zp2> creator = zp2.CREATOR;
            arrayList3.add(vq2.E(c01Var));
        }
        String shortDescription = albumDto.getShortDescription();
        String description = albumDto.getDescription();
        String type = albumDto.getType();
        if (type == null) {
            type = Album$AlbumType.COMMON.a;
        }
        String str4 = type;
        String contentWarning = albumDto.getContentWarning();
        if (contentWarning == null || (warningContent = WarningContent.a(contentWarning)) == null) {
            warningContent = WarningContent.NONE;
        }
        WarningContent warningContent2 = warningContent;
        String coverUri = albumDto.getCoverUri();
        WebPath$Storage webPath$Storage = WebPath$Storage.AVATARS;
        webPath$Storage.getClass();
        CoverPath B = etn.B(coverUri, webPath$Storage);
        Integer trackCount = albumDto.getTrackCount();
        int intValue = trackCount != null ? trackCount.intValue() : -1;
        List<AlbumDto> duplicates = albumDto.getDuplicates();
        if (duplicates == null) {
            duplicates = c5b.a;
        }
        ArrayList arrayList4 = new ArrayList();
        for (AlbumDto albumDto2 : duplicates) {
            if (albumDto2 != null) {
                oqVar = G(albumDto2);
            }
            if (oqVar != null) {
                arrayList4.add(oqVar);
            }
            oqVar = null;
        }
        qc7 releaseDate = albumDto.getReleaseDate();
        Date date = releaseDate != null ? releaseDate.b : null;
        Integer likesCount = albumDto.getLikesCount();
        int intValue2 = likesCount != null ? likesCount.intValue() : -1;
        Boolean childContent = albumDto.getChildContent();
        boolean booleanValue2 = childContent != null ? childContent.booleanValue() : false;
        String backgroundImageUrl = albumDto.getBackgroundImageUrl();
        WebPath$Storage webPath$Storage2 = WebPath$Storage.ENTITY_BACKGROUND_IMG;
        webPath$Storage2.getClass();
        CoverPath B2 = etn.B(backgroundImageUrl, webPath$Storage2);
        String backgroundVideoUrl = albumDto.getBackgroundVideoUrl();
        List disclaimer = albumDto.getDisclaimer();
        List O = disclaimer != null ? CollectionsKt.O(disclaimer) : c5b.a;
        List labels = albumDto.getLabels();
        if (labels != null) {
            ArrayList arrayList5 = new ArrayList();
            Iterator it2 = labels.iterator();
            while (it2.hasNext()) {
                AlbumLabelDto albumLabelDto = (AlbumLabelDto) it2.next();
                if (albumLabelDto == null || (id = albumLabelDto.getId()) == null) {
                    it = it2;
                } else {
                    it = it2;
                    String name = albumLabelDto.getName();
                    if (name != null) {
                        arrayList2 = arrayList3;
                        ztVar = new zt(id, name);
                        if (ztVar == null) {
                            arrayList5.add(ztVar);
                        }
                        arrayList3 = arrayList2;
                        it2 = it;
                    }
                }
                arrayList2 = arrayList3;
                ztVar = null;
                if (ztVar == null) {
                }
                arrayList3 = arrayList2;
                it2 = it;
            }
            arrayList = arrayList3;
            c5bVar = arrayList5;
        } else {
            arrayList = arrayList3;
            c5bVar = c5b.a;
        }
        Integer durationSec = albumDto.getDurationSec();
        Integer durationLeft = albumDto.getDurationLeft();
        List availableForOptions = albumDto.getAvailableForOptions();
        List O2 = availableForOptions != null ? CollectionsKt.O(availableForOptions) : c5b.a;
        Boolean availableForPremiumUsers = albumDto.getAvailableForPremiumUsers();
        boolean booleanValue3 = availableForPremiumUsers != null ? availableForPremiumUsers.booleanValue() : false;
        Boolean availablePartially = albumDto.getAvailablePartially();
        boolean booleanValue4 = availablePartially != null ? availablePartially.booleanValue() : false;
        TrailerDto trailer = albumDto.getTrailer();
        oq oqVar2 = new oq(str, str2, sortOrder, booleanValue, shortDescription, description, warningContent2, arrayList4, str3, str4, metaType, intValue, genre, arrayList, B, date, intValue2, booleanValue2, B2, backgroundVideoUrl, O, c5bVar, durationSec, durationLeft, O2, booleanValue3, booleanValue4, (trailer == null || (available = trailer.getAvailable()) == null) ? false : available.booleanValue(), albumDto.getVersion());
        if (albumDto.getVolumes() != null) {
            ArrayList p = v75.p(CollectionsKt.O(albumDto.getVolumes()));
            ArrayList arrayList6 = new ArrayList();
            Iterator it3 = p.iterator();
            while (it3.hasNext()) {
                TrackDto trackDto = (TrackDto) it3.next();
                mqs a2 = trackDto != null ? wts.a(trackDto) : null;
                if (a2 != null) {
                    arrayList6.add(a2);
                }
            }
            oqVar2.k(arrayList6);
        }
        return oqVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [c5b] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.ArrayList] */
    public static final mt H(AlbumDto albumDto) {
        ?? r3;
        albumDto.getClass();
        oq G = G(albumDto);
        if (G == null) {
            return null;
        }
        List<ArtistDto> artists = albumDto.getArtists();
        if (artists != null) {
            r3 = new ArrayList();
            for (ArtistDto artistDto : artists) {
                c01 C = artistDto != null ? lxe.C(artistDto) : null;
                if (C != null) {
                    r3.add(C);
                }
            }
        } else {
            r3 = c5b.a;
        }
        ActionButtonDto actionButton = albumDto.getActionButton();
        ff I0 = actionButton != null ? zsd.I0(actionButton) : null;
        VibeButtonDto vibeButton = albumDto.getVibeButton();
        return new mt(G, r3, I0, vibeButton != null ? u1g.S(vibeButton) : null);
    }

    public static final ArrayList I(List list) {
        list.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AlbumDto albumDto = (AlbumDto) it.next();
            oq G = albumDto != null ? G(albumDto) : null;
            if (G != null) {
                arrayList.add(G);
            }
        }
        return arrayList;
    }

    public static final j58 J(oq oqVar) {
        oqVar.getClass();
        if (((i4j) ((byb) l18.b.c(hag.I(byb.class))).b(i4j.class)).h()) {
            hs5 o = lxe.o(oqVar.h());
            if (o == null) {
                return null;
            }
            return new k58(o, oqVar.a, oqVar.d);
        }
        List g2 = oqVar.g();
        h94 h94Var = h94.c;
        if (g2.contains(h94Var)) {
            return new l58(h94Var, oqVar.a, oqVar.d);
        }
        return null;
    }

    public static final n58 K(mqs mqsVar) {
        mqsVar.getClass();
        if (((i4j) ((byb) l18.b.c(hag.I(byb.class))).b(i4j.class)).h()) {
            hs5 o = lxe.o(mqsVar.h());
            if (o == null) {
                return null;
            }
            return new o58(o, mqsVar.a, mqsVar.k);
        }
        List g2 = mqsVar.g();
        h94 h94Var = h94.c;
        if (g2.contains(h94Var)) {
            return new p58(h94Var, mqsVar.a, mqsVar.k);
        }
        return null;
    }

    public static final ud3 L(LikeButtonStateDataDto likeButtonStateDataDto) {
        String buttonColor;
        d85 T;
        d85 T2;
        String title = likeButtonStateDataDto.getTitle();
        if (title == null || (buttonColor = likeButtonStateDataDto.getButtonColor()) == null || (T = pd.T(buttonColor)) == null) {
            return null;
        }
        long j2 = T.a;
        String textColor = likeButtonStateDataDto.getTextColor();
        if (textColor == null || (T2 = pd.T(textColor)) == null) {
            return null;
        }
        long j3 = T2.a;
        Boolean enabled = likeButtonStateDataDto.getEnabled();
        return new ud3(title, j2, j3, enabled != null ? enabled.booleanValue() : true);
    }

    public static final void a(RemoteViews remoteViews, ukd ukdVar, hq5 hq5Var, int i2) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-647353345);
        int i3 = (oq5Var.f(remoteViews) ? 4 : 2) | i2 | (oq5Var.f(ukdVar) ? 32 : 16);
        if ((i3 & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
        } else {
            wn5 wn5Var = zn5.a;
            b(remoteViews, ukdVar, oq5Var, ((i3 << 3) & 896) | (i3 & 14) | 3120);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new s30(remoteViews, ukdVar, i2, 6);
        }
    }

    public static final void b(RemoteViews remoteViews, ukd ukdVar, hq5 hq5Var, int i2) {
        int i3;
        wn5 wn5Var = zn5.a;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1388408952);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var.f(remoteViews) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var.d(-1) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= oq5Var.f(ukdVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= oq5Var.f(wn5Var) ? 2048 : 1024;
        }
        if ((i3 & 1171) == 1170 && oq5Var.z()) {
            oq5Var.S();
        } else {
            Function0 function0 = ei0.a;
            oq5Var.a0(578571862);
            int i4 = (i3 >> 3) & 896;
            oq5Var.a0(-548224868);
            if (!(oq5Var.a instanceof mw0)) {
                lxe.v();
                throw null;
            }
            oq5Var.X();
            if (oq5Var.O) {
                oq5Var.k(function0);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, remoteViews, af0.t);
            Function2 function2 = af0.u;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), -1)) {
                oq5Var.k0(-1);
                oq5Var.b(-1, function2);
            }
            g0g.U(oq5Var, ukdVar, af0.v);
            wn5Var.invoke(oq5Var, Integer.valueOf((i4 >> 6) & 14));
            oq5Var.p(true);
            oq5Var.p(false);
            oq5Var.p(false);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new kg0(remoteViews, ukdVar, i2);
        }
    }

    public static final void c(t41 t41Var, d41 d41Var, o0k o0kVar, yci yciVar, hq5 hq5Var, int i2) {
        t41 t41Var2;
        d41 d41Var2;
        oq5 oq5Var;
        yci yciVar2;
        vci vciVar;
        vm vmVar;
        vci vciVar2;
        t41Var.getClass();
        d41Var.getClass();
        o0kVar.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(2068767322);
        int i3 = (i2 & 6) == 0 ? (oq5Var2.f(t41Var) ? 4 : 2) | i2 : i2;
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? oq5Var2.f(d41Var) : oq5Var2.h(d41Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= oq5Var2.f(o0kVar) ? 256 : 128;
        }
        int i4 = i3 | 3072;
        boolean z = true;
        if (oq5Var2.P(i4 & 1, (i4 & 1171) != 1170)) {
            fvf a2 = hvf.a(0, 0, oq5Var2, 0, 3);
            vm C = ghh.C(ghh.C(o0kVar, zs4.g(oq5Var2)), ogp.A(oq5Var2));
            boolean equals = t41Var.equals(s41.a);
            vci vciVar3 = vci.a;
            if (equals) {
                oq5Var2.Z(-2133017079);
                yci l2 = a.l(vciVar3, C);
                ta5 a3 = sa5.a(qx0.c, b2c.n, oq5Var2, 0);
                int i5 = oq5Var2.P;
                androidx.compose.runtime.internal.a l3 = oq5Var2.l();
                yci H = vnj.H(oq5Var2, l2);
                xp5.T.getClass();
                grb grbVar = wp5.b;
                oq5Var2.d0();
                if (oq5Var2.O) {
                    oq5Var2.k(grbVar);
                } else {
                    oq5Var2.n0();
                }
                g0g.U(oq5Var2, a3, wp5.f);
                g0g.U(oq5Var2, l3, wp5.e);
                kb5 kb5Var = wp5.g;
                if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i5))) {
                    ouj.x(i5, oq5Var2, i5, kb5Var);
                }
                g0g.U(oq5Var2, H, wp5.d);
                oq5Var2.Z(468190282);
                for (int i6 = 0; i6 < 3; i6++) {
                    u2x.g(d.d(vciVar3, 1.0f), oq5Var2, 54);
                }
                f1d.u(oq5Var2, false, true, false);
                d41Var2 = d41Var;
                vciVar = vciVar3;
                oq5Var = oq5Var2;
                t41Var2 = t41Var;
            } else if (t41Var instanceof r41) {
                oq5Var2.Z(-2132571082);
                boolean z2 = ((r41) t41Var).c;
                if ((i4 & 112) != 32 && ((i4 & 64) == 0 || !oq5Var2.h(d41Var))) {
                    z = false;
                }
                Object K = oq5Var2.K();
                if (z || K == gq5.a) {
                    vmVar = C;
                    vciVar2 = vciVar3;
                    K = new zy(0, d41Var, d41.class, "onRefresh", "onRefresh()V", 0, 23);
                    oq5Var2.k0(K);
                } else {
                    vmVar = C;
                    vciVar2 = vciVar3;
                }
                wl wlVar = new wl(a2, vmVar, t41Var, d41Var, 10);
                t41Var2 = t41Var;
                d41Var2 = d41Var;
                bfg.f(z2, (Function0) ((h9f) K), o0kVar, null, false, C(1131593753, wlVar, oq5Var2), oq5Var2, (i4 & 896) | 196608, 24);
                oq5Var = oq5Var2;
                oq5Var.p(false);
                vciVar = vciVar2;
            } else {
                d41Var2 = d41Var;
                oq5Var = oq5Var2;
                t41Var2 = t41Var;
                if (!t41Var2.equals(q41.a)) {
                    throw vz1.i(oq5Var, -484449087, false);
                }
                oq5Var.Z(-2131427616);
                vciVar = vciVar3;
                ivf.g(d41Var2.e(oq5Var), d.x(bfg.Q(d.c(a.l(vciVar, C), 1.0f), bfg.C(oq5Var), false, 14), b2c.f, 2), false, null, oq5Var, 0, 12);
                oq5Var.p(false);
            }
            yciVar2 = vciVar;
        } else {
            t41Var2 = t41Var;
            d41Var2 = d41Var;
            oq5Var = oq5Var2;
            oq5Var.S();
            yciVar2 = yciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new uu(t41Var2, d41Var2, false, o0kVar, yciVar2, i2, 5);
        }
    }

    public static final void d(List list, Function1 function1, yci yciVar, hq5 hq5Var, int i2) {
        Function1 function12 = function1;
        hz2 hz2Var = b2c.l;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-219973657);
        int i3 = 32;
        int i4 = (oq5Var.f(list) ? 4 : 2) | i2 | (oq5Var.h(function12) ? 32 : 16) | (oq5Var.f(yciVar) ? 256 : 128);
        if ((i4 & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
        } else {
            boolean z = false;
            float f2 = 8;
            yci a2 = androidx.compose.ui.platform.a.a(a.n(bfg.x(yciVar, bfg.C(oq5Var), false, 14), 16, f2), "bottom_sheet_artists_row");
            nho a3 = lho.a(qx0.a, hz2Var, oq5Var, 48);
            int i5 = oq5Var.P;
            androidx.compose.runtime.internal.a l2 = oq5Var.l();
            yci H = vnj.H(oq5Var, a2);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a3, wp5.f);
            g0g.U(oq5Var, l2, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i5))) {
                ouj.x(i5, oq5Var, i5, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            oq5Var.Z(-1084576166);
            int i6 = 0;
            for (Object obj : list) {
                int i7 = i6 + 1;
                if (i6 < 0) {
                    u75.n();
                    throw null;
                }
                r91 r91Var = (r91) obj;
                vci vciVar = vci.a;
                float f3 = f2;
                yci q = a.q(vciVar, 0.0f, 0.0f, f3, 0.0f, 11);
                tgo tgoVar = ugo.a;
                yci u = xp3.u(q, tgoVar);
                boolean f4 = ((i4 & 112) == i3 ? true : z) | oq5Var.f(r91Var);
                Object K = oq5Var.K();
                if (f4 || K == gq5.a) {
                    K = new hb(29, function12, r91Var);
                    oq5Var.k0(K);
                }
                yci q2 = a.q(androidx.compose.foundation.a.e(u, false, null, null, (Function0) K, 7), 0.0f, 0.0f, f3, 0.0f, 11);
                nho a4 = lho.a(qx0.a, hz2Var, oq5Var, 54);
                int i8 = oq5Var.P;
                androidx.compose.runtime.internal.a l3 = oq5Var.l();
                yci H2 = vnj.H(oq5Var, q2);
                xp5.T.getClass();
                grb grbVar2 = wp5.b;
                oq5Var.d0();
                hz2 hz2Var2 = hz2Var;
                if (oq5Var.O) {
                    oq5Var.k(grbVar2);
                } else {
                    oq5Var.n0();
                }
                g0g.U(oq5Var, a4, wp5.f);
                g0g.U(oq5Var, l3, wp5.e);
                kb5 kb5Var2 = wp5.g;
                if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i8))) {
                    ouj.x(i8, oq5Var, i8, kb5Var2);
                }
                g0g.U(oq5Var, H2, wp5.d);
                ltg.e(qo6.d, r91Var.a.b, xp3.u(d.m(vciVar, 36), tgoVar), null, null, null, null, null, oq5Var, 6, 248);
                u1g.l(oq5Var, d.r(vciVar, f3));
                oq5 oq5Var2 = oq5Var;
                xv7.j(r91Var.a.a, b.b(neg.k(), i6), ((dq0) oq5Var.j(eq0.a)).b.a, 0L, 0L, 0, 0L, 2, false, 1, 0, null, nu0.j(), oq5Var2, 0, 3120, 55288);
                oq5Var = oq5Var2;
                oq5Var.p(true);
                function12 = function1;
                i4 = i4;
                f2 = f3;
                i6 = i7;
                hz2Var = hz2Var2;
                i3 = 32;
                z = false;
            }
            oq5Var.p(z);
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new ho1(list, function1, yciVar, i2);
        }
    }

    public static void e(n9b n9bVar, List list, Function1 function1) {
        n9bVar.getClass();
        list.getClass();
        n9bVar.a.a(new wn5(new ho1(list, function1, vci.a), -579109918, true));
    }

    public static final void f(float f2, float f3, yci yciVar, hq5 hq5Var, int i2) {
        int i3;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-2055906773);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var.c(f2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var.c(f3) ? 32 : 16;
        }
        int i4 = i3 | (oq5Var.f(yciVar) ? 256 : 128);
        if (oq5Var.P(i4 & 1, (i4 & 147) != 146)) {
            ug3.a(androidx.compose.foundation.a.b(d.o(yciVar, f2, f3), ((d85) oq5Var.j(sb6.a)).a, vnj.i), oq5Var, 0);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new iu4(f2, f3, i2, 0, yciVar);
        }
    }

    public static final void g(yci yciVar, hq5 hq5Var, int i2) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1025469488);
        int i3 = (oq5Var.f(yciVar) ? 4 : 2) | i2;
        if (oq5Var.P(i3 & 1, (i3 & 3) != 2)) {
            etn.l(sb6.a.a(new d85(d85.b(((ma5) oq5Var.j(pa5.a)).g() ? d85.b : d85.f, ((Number) fgq.s(fgq.D(null, oq5Var, 1), 0.05f, 0.1f, weo.C(weo.S(800, 0, null, 6), jyn.b, 0L, 4), null, oq5Var, 4104, 8).d.getValue()).floatValue(), 0.0f, 0.0f, 0.0f, 14))), C(1580422928, new u71(yciVar, 12), oq5Var), oq5Var, 56);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new u71(yciVar, i2, 13);
        }
    }

    public static final void h(int i2, int i3, int i4, hq5 hq5Var, yci yciVar) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-2104833867);
        if ((((oq5Var.d(i2) ? 4 : 2) | i4 | (oq5Var.d(i3) ? 32 : 16) | (oq5Var.f(yciVar) ? 256 : 128)) & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
        } else {
            agr agrVar = es5.h;
            etn.l(agrVar.a(new kx7(((jx7) oq5Var.j(agrVar)).getDensity(), 1.0f)), C(984980853, new rl4(yciVar, i2, i3, 4), oq5Var), oq5Var, 56);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new rl4(i2, i3, yciVar, i4);
        }
    }

    public static final void i(Function0 function0, yci yciVar, hq5 hq5Var, int i2) {
        int i3;
        Function0 function02;
        yci yciVar2;
        function0.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1522743166);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var.h(function0) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var.f(yciVar) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
            function02 = function0;
            yciVar2 = yciVar;
        } else {
            function02 = function0;
            yciVar2 = yciVar;
            hdg.u(function02, yciVar2, a.a(16, 0.0f, 2), b, oq5Var, (i3 & 14) | 3456 | (i3 & 112), 0);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new ni6(function02, yciVar2, i2, 1);
        }
    }

    public static final void j(nls nlsVar, sxa sxaVar, hq5 hq5Var, int i2) {
        int i3;
        Object j57Var;
        yoc yocVar;
        nlsVar.getClass();
        sxaVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1512049361);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var.f(nlsVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? oq5Var.f(sxaVar) : oq5Var.h(sxaVar) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
        } else {
            aqi O = gld.O(sxaVar.e, oq5Var);
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (K == kjnVar) {
                K = new yoc();
                oq5Var.k0(K);
            }
            yoc yocVar2 = (yoc) K;
            Unit unit = Unit.a;
            int i4 = i3 & 112;
            boolean z = ((i3 & 14) == 4) | (i4 == 32 || ((i3 & 64) != 0 && oq5Var.h(sxaVar)));
            Object K2 = oq5Var.K();
            Continuation continuation = null;
            if (z || K2 == kjnVar) {
                yocVar = yocVar2;
                j57Var = new j57(yocVar, sxaVar, nlsVar, continuation, 20);
                oq5Var.k0(j57Var);
            } else {
                j57Var = K2;
                yocVar = yocVar2;
            }
            gld.w(oq5Var, unit, (Function2) j57Var);
            uxa uxaVar = (uxa) O.getValue();
            if (uxaVar == null) {
                throw vz1.i(oq5Var, -1380474369, false);
            }
            oq5Var.Z(155035568);
            qld.k(uxaVar, sxaVar, androidx.compose.foundation.a.k(androidx.compose.ui.focus.a.a(vci.a, yocVar), true, null), oq5Var, 64 | i4);
            oq5Var.p(false);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new gva(nlsVar, sxaVar, i2, 1);
        }
    }

    public static final void k(final List list, final yci yciVar, final o0k o0kVar, final float f2, int i2, boolean z, final wn5 wn5Var, hq5 hq5Var, int i3) {
        int i4;
        oq5 oq5Var;
        int i5;
        boolean z2;
        final int i6;
        float f3 = vt0.b;
        float f4 = vt0.a;
        list.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-1744795890);
        if ((i3 & 6) == 0) {
            i4 = ((i3 & 8) == 0 ? oq5Var2.f(list) : oq5Var2.h(list) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= oq5Var2.f(yciVar) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= oq5Var2.f(o0kVar) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= oq5Var2.c(f3) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i4 |= oq5Var2.c(f2) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((196608 & i3) == 0) {
            i4 |= oq5Var2.c(f4) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        }
        int i7 = 14155776 | i4;
        if ((100663296 & i3) == 0) {
            i7 |= oq5Var2.h(wn5Var) ? 67108864 : 33554432;
        }
        final boolean z3 = true;
        if (oq5Var2.P(i7 & 1, (38347923 & i7) != 38347922)) {
            oq5Var2.U();
            if ((i3 & 1) == 0 || oq5Var2.y()) {
                i6 = 1;
            } else {
                oq5Var2.S();
                i6 = i2;
                z3 = z;
            }
            oq5Var2.q();
            final float f5 = a.f(o0kVar, (xof) oq5Var2.j(es5.n));
            final fvf a2 = hvf.a(0, 0, oq5Var2, 0, 3);
            oq5Var = oq5Var2;
            bg3.a(d.d(vci.a, 1.0f), null, false, C(-196076808, new pyc() { // from class: r6c
                {
                    float f6 = vt0.a;
                    float f7 = vt0.a;
                }

                @Override // defpackage.pyc
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    float f6 = vt0.a;
                    float f7 = vt0.b;
                    c cVar = (c) obj;
                    hq5 hq5Var2 = (hq5) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    cVar.getClass();
                    if ((intValue & 6) == 0) {
                        intValue |= ((oq5) hq5Var2).f(cVar) ? 4 : 2;
                    }
                    oq5 oq5Var3 = (oq5) hq5Var2;
                    if (oq5Var3.P(intValue & 1, (intValue & 19) != 18)) {
                        float e2 = cVar.e();
                        float f8 = vt0.e;
                        List list2 = list;
                        float s = o5g.s(e2, f5, f6, f8, i6, list2.size(), f2, f7, oq5Var3, 0);
                        nx0 g2 = qx0.g(f6);
                        fvf fvfVar = a2;
                        boolean f9 = oq5Var3.f(fvfVar);
                        Object K = oq5Var3.K();
                        Object obj4 = gq5.a;
                        if (f9 || K == obj4) {
                            K = new s6c(fvfVar);
                            oq5Var3.k0(K);
                        }
                        s6c s6cVar = (s6c) K;
                        float f10 = w1r.a;
                        Object obj5 = (jx7) oq5Var3.j(es5.h);
                        uf7 a3 = m8r.a(oq5Var3);
                        boolean f11 = oq5Var3.f(obj5) | oq5Var3.f(s6cVar) | oq5Var3.f(a3);
                        Object K2 = oq5Var3.K();
                        if (f11 || K2 == obj4) {
                            K2 = new s1r(s6cVar, a3, weo.Q(0.0f, 400.0f, null, 5));
                            oq5Var3.k0(K2);
                        }
                        s1r s1rVar = (s1r) K2;
                        yci d2 = d.d(yciVar, 1.0f);
                        boolean h2 = oq5Var3.h(list2) | oq5Var3.c(s);
                        wn5 wn5Var2 = wn5Var;
                        boolean f12 = h2 | oq5Var3.f(wn5Var2);
                        Object K3 = oq5Var3.K();
                        if (f12 || K3 == obj4) {
                            K3 = new m6c(list2, s, wn5Var2, 1);
                            oq5Var3.k0(K3);
                        }
                        weo.i(d2, fvfVar, o0kVar, false, g2, null, s1rVar, z3, null, (Function1) K3, oq5Var3, 0, 296);
                    } else {
                        oq5Var3.S();
                    }
                    return Unit.a;
                }
            }, oq5Var2), oq5Var, 3078, 6);
            z2 = z3;
            i5 = i6;
        } else {
            oq5Var = oq5Var2;
            oq5Var.S();
            i5 = i2;
            z2 = z;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new mo6(list, yciVar, o0kVar, f2, i5, z2, wn5Var, i3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void l(int i2, xsq xsqVar, hvq hvqVar, zsq zsqVar, ml4 ml4Var, Boolean bool, hq5 hq5Var, int i3, int i4) {
        int i5;
        Boolean bool2;
        Boolean bool3;
        Object K;
        kjn kjnVar;
        pwq k2;
        ruq w;
        mm6 mm6Var;
        boolean booleanValue;
        Boolean valueOf;
        int i6;
        boolean g2;
        Object tnfVar;
        ruq ruqVar;
        Boolean bool4;
        kjn kjnVar2;
        int i7;
        int i8;
        boolean z;
        pwq pwqVar;
        boolean z2;
        mm6 mm6Var2;
        boolean g3;
        Object K2;
        pwq pwqVar2;
        int i9;
        boolean h2;
        Object K3;
        Boolean bool5;
        xmn r;
        zsq zsqVar2 = zsqVar;
        ml4 ml4Var2 = ml4Var;
        xsqVar.getClass();
        hvqVar.getClass();
        zsqVar2.getClass();
        ml4Var2.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-508493208);
        if ((i3 & 6) == 0) {
            i5 = (oq5Var.d(i2) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= oq5Var.f(xsqVar) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i5 |= oq5Var.h(hvqVar) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i5 |= (i3 & 4096) == 0 ? oq5Var.f(zsqVar2) : oq5Var.h(zsqVar2) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i5 |= oq5Var.f(ml4Var2) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        int i10 = i4 & 32;
        if (i10 != 0) {
            i5 |= 196608;
        } else if ((196608 & i3) == 0) {
            bool2 = bool;
            i5 |= oq5Var.f(bool2) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
            if ((74899 & i5) == 74898 || !oq5Var.z()) {
                bool3 = i10 == 0 ? null : bool2;
                K = oq5Var.K();
                kjnVar = gq5.a;
                if (K == kjnVar) {
                    K = tlm.f(gld.R(g.a, oq5Var), oq5Var);
                }
                mm6 mm6Var3 = ((fs5) K).a;
                k2 = hvqVar.k();
                hwq t = hvqVar.t();
                ewq b2 = hvqVar.b();
                w = hvqVar.w();
                nyf lifecycle = ((dzf) oq5Var.j(ykg.a)).getLifecycle();
                if (bool3 != null) {
                    oq5Var.Z(964323565);
                    mm6Var = mm6Var3;
                    boolean z3 = ((i5 & 14) == 4) | ((i5 & 57344) == 16384);
                    Object K4 = oq5Var.K();
                    if (z3 || K4 == kjnVar) {
                        K4 = szf.U(new as7(ml4Var2, i2, 2));
                        oq5Var.k0(K4);
                    }
                    booleanValue = ((Boolean) ((sdr) K4).getValue()).booleanValue();
                    oq5Var.p(false);
                } else {
                    mm6Var = mm6Var3;
                    oq5Var.Z(964319752);
                    oq5Var.p(false);
                    booleanValue = bool3.booleanValue();
                }
                valueOf = Boolean.valueOf(booleanValue);
                i6 = i5 & 7168;
                g2 = oq5Var.g(booleanValue) | oq5Var.h(b2) | (i6 != 2048 || ((i5 & 4096) != 0 && oq5Var.h(zsqVar2))) | oq5Var.h(t);
                Object K5 = oq5Var.K();
                if (!g2 || K5 == kjnVar) {
                    ruqVar = w;
                    bool4 = valueOf;
                    kjnVar2 = kjnVar;
                    i7 = i6;
                    i8 = 2048;
                    z = false;
                    pwqVar = k2;
                    z2 = booleanValue;
                    mm6Var2 = mm6Var;
                    tnfVar = new tnf(0, b2, zsqVar, t, null, z2);
                    zsqVar2 = zsqVar;
                    oq5Var.k0(tnfVar);
                } else {
                    ruqVar = w;
                    i7 = i6;
                    bool4 = valueOf;
                    kjnVar2 = kjnVar;
                    pwqVar = k2;
                    i8 = 2048;
                    z = false;
                    z2 = booleanValue;
                    tnfVar = K5;
                    mm6Var2 = mm6Var;
                }
                gld.y(bool4, zsqVar2, (Function2) tnfVar, oq5Var);
                Boolean valueOf2 = Boolean.valueOf(z2);
                g3 = oq5Var.g(z2) | oq5Var.h(ruqVar) | ((i5 & 14) != 4 ? true : z) | ((i5 & 112) != 32 ? true : z) | oq5Var.h(mm6Var2) | oq5Var.h(t) | ((i7 != i8 || ((i5 & 4096) != 0 && oq5Var.h(zsqVar2))) ? true : z) | oq5Var.h(pwqVar) | oq5Var.h(lifecycle);
                K2 = oq5Var.K();
                kjn kjnVar3 = kjnVar2;
                if (!g3 || K2 == kjnVar3) {
                    mm6 mm6Var4 = mm6Var2;
                    boolean z4 = z2;
                    pwqVar2 = pwqVar;
                    ruq ruqVar2 = ruqVar;
                    i9 = i5;
                    x4a x4aVar = new x4a(z4, ruqVar2, i2, xsqVar, mm6Var4, t, zsqVar2, pwqVar2, lifecycle, null);
                    oq5Var.k0(x4aVar);
                    K2 = x4aVar;
                } else {
                    i9 = i5;
                    pwqVar2 = pwqVar;
                }
                gld.w(oq5Var, valueOf2, (Function2) K2);
                ArrayList b3 = ml4Var.b();
                h2 = oq5Var.h(pwqVar2) | ((i9 & 57344) != 16384 ? z : true);
                K3 = oq5Var.K();
                if (!h2 || K3 == kjnVar3) {
                    ml4Var2 = ml4Var;
                    K3 = new nz5(pwqVar2, ml4Var2, (Continuation) null, 25);
                    oq5Var.k0(K3);
                } else {
                    ml4Var2 = ml4Var;
                }
                gld.w(oq5Var, b3, (Function2) K3);
                bool5 = bool3;
            } else {
                oq5Var.S();
                bool5 = bool2;
            }
            r = oq5Var.r();
            if (r == null) {
                r.d = new ctb(i2, xsqVar, hvqVar, zsqVar, ml4Var2, bool5, i3, i4);
                return;
            }
            return;
        }
        bool2 = bool;
        if ((74899 & i5) == 74898) {
        }
        if (i10 == 0) {
        }
        K = oq5Var.K();
        kjnVar = gq5.a;
        if (K == kjnVar) {
        }
        mm6 mm6Var32 = ((fs5) K).a;
        k2 = hvqVar.k();
        hwq t2 = hvqVar.t();
        ewq b22 = hvqVar.b();
        w = hvqVar.w();
        nyf lifecycle2 = ((dzf) oq5Var.j(ykg.a)).getLifecycle();
        if (bool3 != null) {
        }
        valueOf = Boolean.valueOf(booleanValue);
        i6 = i5 & 7168;
        g2 = oq5Var.g(booleanValue) | oq5Var.h(b22) | (i6 != 2048 || ((i5 & 4096) != 0 && oq5Var.h(zsqVar2))) | oq5Var.h(t2);
        Object K52 = oq5Var.K();
        if (g2) {
        }
        ruqVar = w;
        bool4 = valueOf;
        kjnVar2 = kjnVar;
        i7 = i6;
        i8 = 2048;
        z = false;
        pwqVar = k2;
        z2 = booleanValue;
        mm6Var2 = mm6Var;
        tnfVar = new tnf(0, b22, zsqVar, t2, null, z2);
        zsqVar2 = zsqVar;
        oq5Var.k0(tnfVar);
        gld.y(bool4, zsqVar2, (Function2) tnfVar, oq5Var);
        Boolean valueOf22 = Boolean.valueOf(z2);
        g3 = oq5Var.g(z2) | oq5Var.h(ruqVar) | ((i5 & 14) != 4 ? true : z) | ((i5 & 112) != 32 ? true : z) | oq5Var.h(mm6Var2) | oq5Var.h(t2) | ((i7 != i8 || ((i5 & 4096) != 0 && oq5Var.h(zsqVar2))) ? true : z) | oq5Var.h(pwqVar) | oq5Var.h(lifecycle2);
        K2 = oq5Var.K();
        kjn kjnVar32 = kjnVar2;
        if (g3) {
        }
        mm6 mm6Var42 = mm6Var2;
        boolean z42 = z2;
        pwqVar2 = pwqVar;
        ruq ruqVar22 = ruqVar;
        i9 = i5;
        x4a x4aVar2 = new x4a(z42, ruqVar22, i2, xsqVar, mm6Var42, t2, zsqVar2, pwqVar2, lifecycle2, null);
        oq5Var.k0(x4aVar2);
        K2 = x4aVar2;
        gld.w(oq5Var, valueOf22, (Function2) K2);
        ArrayList b32 = ml4Var.b();
        h2 = oq5Var.h(pwqVar2) | ((i9 & 57344) != 16384 ? z : true);
        K3 = oq5Var.K();
        if (h2) {
        }
        ml4Var2 = ml4Var;
        K3 = new nz5(pwqVar2, ml4Var2, (Continuation) null, 25);
        oq5Var.k0(K3);
        gld.w(oq5Var, b32, (Function2) K3);
        bool5 = bool3;
        r = oq5Var.r();
        if (r == null) {
        }
    }

    public static final void m(int i2, hq5 hq5Var) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1600179824);
        if (oq5Var.P(i2 & 1, i2 != 0)) {
            float f2 = 8;
            vci vciVar = vci.a;
            u1g.l(oq5Var, d.e(vciVar, f2));
            nho a2 = lho.a(qx0.a, b2c.l, oq5Var, 48);
            int i3 = oq5Var.P;
            androidx.compose.runtime.internal.a l2 = oq5Var.l();
            yci H = vnj.H(oq5Var, vciVar);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            kb5 kb5Var = wp5.f;
            g0g.U(oq5Var, a2, kb5Var);
            kb5 kb5Var2 = wp5.e;
            g0g.U(oq5Var, l2, kb5Var2);
            kb5 kb5Var3 = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var, i3, kb5Var3);
            }
            kb5 kb5Var4 = wp5.d;
            g0g.U(oq5Var, H, kb5Var4);
            float s = lsq.s(e9g.a);
            f(s, s, xp3.u(vciVar, o5g.E(oq5Var)), oq5Var, 0);
            yci q = a.q(vciVar, 12, 0.0f, 0.0f, 0.0f, 14);
            if (1.0f <= 0.0d) {
                qme.a("invalid weight; must be greater than zero");
            }
            yci g2 = vz1.g(1.0f, q, true);
            ta5 a3 = sa5.a(qx0.c, b2c.n, oq5Var, 0);
            int i4 = oq5Var.P;
            androidx.compose.runtime.internal.a l3 = oq5Var.l();
            yci H2 = vnj.H(oq5Var, g2);
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a3, kb5Var);
            g0g.U(oq5Var, l3, kb5Var2);
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var, i4, kb5Var3);
            }
            g0g.U(oq5Var, H2, kb5Var4);
            float f3 = 20;
            n(120, f3, oq5Var, 54);
            u1g.l(oq5Var, d.e(vciVar, 2));
            n(80, f3, oq5Var, 54);
            oq5Var.p(true);
            gae.b(a0g.E(R.drawable.ic_arrow_mid_right_edge_24, 0, oq5Var), null, wyf.R(vciVar), ((dq0) oq5Var.j(eq0.a)).a.c, oq5Var, 48, 0);
            vz1.B(vciVar, f2, oq5Var, true);
            u1g.l(oq5Var, d.e(vciVar, f2));
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new t83(i2, 7);
        }
    }

    public static final void n(float f2, float f3, hq5 hq5Var, int i2) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-361765416);
        if (oq5Var.P(i2 & 1, (i2 & 19) != 18)) {
            f(f2, f3, xp3.u(vci.a, ugo.a), oq5Var, 54);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new hu4(f2, f3, i2, 0);
        }
    }

    public static final Bitmap o(Bitmap bitmap, g39 g39Var, View view) {
        float max;
        float F = bg3.F(view);
        float E = bg3.E(view);
        int ordinal = g39Var.ordinal();
        if (ordinal == 0) {
            max = Math.max(F / bitmap.getWidth(), E / bitmap.getHeight());
        } else {
            if (ordinal == 1) {
                return bitmap;
            }
            if (ordinal == 2) {
                max = Math.min(F / bitmap.getWidth(), E / bitmap.getHeight());
            } else {
                if (ordinal != 3) {
                    b6e.s();
                    return null;
                }
                max = F / bitmap.getWidth();
            }
        }
        return Bitmap.createScaledBitmap(bitmap, (int) (max * bitmap.getWidth()), (int) ((b33.a[g39Var.ordinal()] == 4 ? E / bitmap.getHeight() : max) * bitmap.getHeight()), false);
    }

    public static final Bitmap p(Bitmap bitmap, gc8 gc8Var, List list, View view) {
        float f2;
        wzg q = gc8Var.getDiv2Component$div_release().q();
        Iterator it = list.iterator();
        Bitmap bitmap2 = bitmap;
        while (it.hasNext()) {
            m33 m33Var = (m33) it.next();
            if (m33Var instanceof k33) {
                float x = bg3.x(Integer.valueOf(((k33) m33Var).a), view.getResources().getDisplayMetrics());
                q.getClass();
                if (!bitmap2.isRecycled() && bitmap2.getWidth() > 0 && bitmap2.getHeight() > 0 && x > 0.0f) {
                    RenderScript renderScript = q.b;
                    if (renderScript == null) {
                        Context context = q.a;
                        renderScript = RenderScript.createMultiContext(context, RenderScript.ContextType.NORMAL, 0, context.getApplicationInfo().targetSdkVersion);
                        q.b = renderScript;
                    }
                    if (x > 25.0f) {
                        f2 = (x * 1.0f) / 25.0f;
                        x = 25.0f;
                    } else {
                        f2 = 1.0f;
                    }
                    if (f2 == 1.0f) {
                        Bitmap.Config config = bitmap2.getConfig();
                        if (config == null) {
                            config = Bitmap.Config.ARGB_8888;
                        }
                        bitmap2 = bitmap2.copy(config, false);
                    } else {
                        bitmap2 = Bitmap.createScaledBitmap(bitmap2, (int) (bitmap2.getWidth() / f2), (int) (bitmap2.getHeight() / f2), false);
                    }
                    Allocation createFromBitmap = Allocation.createFromBitmap(renderScript, bitmap2);
                    Allocation createTyped = Allocation.createTyped(renderScript, createFromBitmap.getType());
                    ScriptIntrinsicBlur create = ScriptIntrinsicBlur.create(renderScript, Element.U8_4(renderScript));
                    create.setRadius(x);
                    create.setInput(createFromBitmap);
                    create.forEach(createTyped);
                    createTyped.copyTo(bitmap2);
                    createFromBitmap.destroy();
                    createTyped.destroy();
                    create.destroy();
                }
            } else if ((m33Var instanceof l33) && wyf.N(view)) {
                q.getClass();
                Matrix matrix = new Matrix();
                matrix.preScale(-1.0f, 1.0f);
                bitmap2 = Bitmap.createBitmap(bitmap2, 0, 0, bitmap2.getWidth(), bitmap2.getHeight(), matrix, false);
            }
        }
        return bitmap2;
    }

    public static final void q(gc8 gc8Var, g39 g39Var, Bitmap bitmap, View view, List list, Function1 function1) {
        bitmap.setDensity(160);
        if (g39Var != g39.NO_SCALE) {
            i39 i39Var = view instanceof i39 ? (i39) view : null;
            if (i39Var == null || !bg3.r0(i39Var)) {
                if (!wyf.K(view) || view.isLayoutRequested()) {
                    view.addOnLayoutChangeListener(new c33(gc8Var, g39Var, bitmap, view, list, function1));
                    return;
                } else {
                    function1.invoke(p(o(bitmap, g39Var, view), gc8Var, list, view));
                    return;
                }
            }
        }
        float f2 = view.getResources().getDisplayMetrics().density;
        function1.invoke(p(Bitmap.createScaledBitmap(bitmap, eeh.b(bitmap.getWidth() * f2), eeh.b(bitmap.getHeight() * f2), false), gc8Var, list, view));
    }

    public static final int r(int i2, int i3) {
        return i2 << (((i3 % 10) * 3) + 1);
    }

    public static final wn5 s(hq5 hq5Var, int i2, uif uifVar) {
        wn5 wn5Var;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.W(Integer.rotateLeft(i2, 1), a);
        Object K = oq5Var.K();
        if (K == gq5.a) {
            wn5Var = new wn5(uifVar, i2, true);
            oq5Var.k0(wn5Var);
        } else {
            K.getClass();
            wn5Var = (wn5) K;
            wn5Var.n(uifVar);
        }
        oq5Var.p(false);
        return wn5Var;
    }

    public static Handler t(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return jo0.f(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException e2) {
            e = e2;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InstantiationException e3) {
            e = e3;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (NoSuchMethodException e4) {
            e = e4;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InvocationTargetException e5) {
            Throwable cause = e5.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            b6e.q(cause);
            return null;
        }
    }

    public static final boolean u(q58 q58Var) {
        q58Var.getClass();
        if (q58Var instanceof j58) {
            return ((j58) q58Var).r();
        }
        if (q58Var instanceof m58) {
            return ((m58) q58Var).c;
        }
        if (q58Var instanceof n58) {
            return ((n58) q58Var).S() == dg2.b;
        }
        b6e.s();
        return false;
    }

    public static final float v(hq5 hq5Var) {
        return irv.g(hq5Var) ? 48 : 56;
    }

    public static Object w(AbstractCollection abstractCollection, String str) {
        Iterator it = abstractCollection.iterator();
        return it.hasNext() ? it.next() : str;
    }

    public static Object x(Iterable iterable) {
        Object next;
        if (!(iterable instanceof List)) {
            Iterator it = iterable.iterator();
            do {
                next = it.next();
            } while (it.hasNext());
            return next;
        }
        List list = (List) iterable;
        if (!list.isEmpty()) {
            return list.get(list.size() - 1);
        }
        wvs.n();
        return null;
    }

    public static final String y(Uri uri) {
        uri.getClass();
        String path = uri.getPath();
        if (path != null) {
            int T = StringsKt.T(path, "lid=", 0, false, 6);
            Integer valueOf = Integer.valueOf(T);
            if (T < 0) {
                valueOf = null;
            }
            if (valueOf != null) {
                int intValue = valueOf.intValue() + 4;
                int T2 = StringsKt.T(path, StringUtils.COMMA, intValue, false, 4);
                Integer valueOf2 = T2 >= 0 ? Integer.valueOf(T2) : null;
                return StringsKt.j0(path, yhn.m(intValue, valueOf2 != null ? valueOf2.intValue() : path.length()));
            }
        }
        return null;
    }

    public static zyw z(Activity activity) {
        y1g.G(activity);
        return new zyw(activity, new rzw());
    }
}
