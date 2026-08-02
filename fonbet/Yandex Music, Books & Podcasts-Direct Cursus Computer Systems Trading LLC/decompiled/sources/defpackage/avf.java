package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.TypedValue;
import androidx.compose.foundation.layout.d;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.yandex.music.core.ui.compose.b;
import com.yandex.music.shared.dto.playlist.CoverInfoDto;
import com.yandex.music.shared.dto.playlist.PersonalPlaylistHeaderDto;
import com.yandex.music.shared.dto.playlist.PlaylistHeaderDto;
import com.yandex.music.shared.dto.playlist.WrappedTrackDto;
import com.yandex.music.shared.dto.playlist.personal.PersonalPlaylistHeaderMetaDto;
import com.yandex.music.shared.dto.track.TrackDto;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.SortedSet;
import java.util.UUID;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import ru.yandex.music.R;
import ru.yandex.music.novelties.podcasts.catalog.data.dto.PersonalPlaylistPodcastsEntityDto;
import ru.yandex.music.novelties.podcasts.catalog.data.dto.PlaylistPodcastsEntityDto;

/* loaded from: classes.dex */
public abstract class avf {
    public static ma5 a;
    public static ma5 b;

    public static List A(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return c5b.a;
        }
        int i = 0;
        int i2 = ((mqs) list.get(0)).d.f;
        List list2 = list;
        Integer num = null;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                if (((mqs) it.next()).d.f != i2) {
                    n8g b2 = t75.b();
                    Iterator it2 = list.iterator();
                    int i3 = 1;
                    while (it2.hasNext()) {
                        mqs mqsVar = (mqs) it2.next();
                        int i4 = mqsVar.d.f;
                        if (num == null || i4 != num.intValue()) {
                            b2.add(new gzs(i4));
                            num = Integer.valueOf(i4);
                            i3 = 1;
                        }
                        b2.add(new fzs(mqsVar, i3));
                        i3++;
                    }
                    return t75.a(b2);
                }
            }
        }
        ArrayList arrayList = new ArrayList(v75.o(list2, 10));
        for (Object obj : list2) {
            int i5 = i + 1;
            if (i < 0) {
                u75.n();
                throw null;
            }
            arrayList.add(new fzs((mqs) obj, i5));
            i = i5;
        }
        return arrayList;
    }

    public static rab B(cvl cvlVar) {
        String c;
        l18 l18Var = l18.b;
        cvlVar.getClass();
        if (cvlVar.g > 0) {
            bdt I = hag.I(skr.class);
            qdc qdcVar = l18Var.a;
            qdcVar.getClass();
            skr skrVar = (skr) qdcVar.C(I);
            int i = cvlVar.g;
            c = skrVar.b(R.plurals.plural_n_tracks_rtl_support, i, Integer.valueOf(i));
        } else {
            bdt I2 = hag.I(skr.class);
            qdc qdcVar2 = l18Var.a;
            qdcVar2.getClass();
            c = ((skr) qdcVar2.C(I2)).c(R.string.play_list_empty_text);
        }
        return new rab(cvlVar.b, c, null, vz1.w(op7.c(cvlVar).a), null, false, cvlVar.x);
    }

    public static ma5 C(boolean z, hq5 hq5Var) {
        if (!z) {
            oq5 oq5Var = (oq5) hq5Var;
            oq5Var.Z(-1101254786);
            long D = c3x.D(kg5.r(R.color.icon_primary_day, oq5Var), kg5.r(R.color.bg_primary_day, oq5Var));
            ma5 c = pa5.c(D, D, kg5.r(R.color.bg_primary_day, oq5Var), kg5.r(R.color.icon_with_text_day, oq5Var), kg5.r(R.color.icon_primary_day, oq5Var), 2518);
            oq5Var.p(false);
            return c;
        }
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.Z(-1101763713);
        long D2 = c3x.D(kg5.r(R.color.icon_primary_night, oq5Var2), kg5.r(R.color.bg_primary_night, oq5Var2));
        long r = kg5.r(R.color.bg_primary_night, oq5Var2);
        long r2 = kg5.r(R.color.icon_primary_night, oq5Var2);
        long r3 = kg5.r(R.color.icon_with_text_night, oq5Var2);
        agr agrVar = pa5.a;
        long h = c3x.h(4281794739L);
        long h2 = c3x.h(4278442694L);
        long h3 = c3x.h(4279374354L);
        long h4 = c3x.h(4291782265L);
        long j = d85.b;
        ma5 ma5Var = new ma5(D2, h, h2, D2, h3, r, h4, j, j, r3, r2, j, false);
        oq5Var2.p(false);
        return ma5Var;
    }

    public static final float D(Context context, float f) {
        context.getClass();
        return TypedValue.applyDimension(1, f, context.getResources().getDisplayMetrics());
    }

    public static String E(String str) {
        str.getClass();
        StringBuilder sb = new StringBuilder(str.length());
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt <= 127) {
                sb.append(charAt);
            } else {
                Locale locale = Locale.US;
                String format = String.format(locale, "\\U%04X", Arrays.copyOf(new Object[]{Integer.valueOf(charAt)}, 1));
                locale.getClass();
                String lowerCase = format.toLowerCase(locale);
                lowerCase.getClass();
                sb.append(lowerCase);
            }
        }
        return sb.toString();
    }

    public static s1r F(o3k o3kVar, l48 l48Var, hq5 hq5Var, int i, int i2) {
        Object obj = l48Var;
        if ((i2 & 2) != 0) {
            obj = new f3k();
        }
        uf7 a2 = m8r.a(hq5Var);
        Object obj2 = riu.a;
        boolean z = true;
        b9r Q = weo.Q(0.0f, 400.0f, Float.valueOf(1), 1);
        oq5 oq5Var = (oq5) hq5Var;
        jx7 jx7Var = (jx7) oq5Var.j(es5.h);
        xof xofVar = (xof) oq5Var.j(es5.n);
        boolean f = ((((i & 14) ^ 6) > 4 && oq5Var.f(o3kVar)) || (i & 6) == 4) | oq5Var.f(a2) | oq5Var.f(Q);
        if ((((i & 112) ^ 48) <= 32 || !oq5Var.f(obj)) && (i & 48) != 32) {
            z = false;
        }
        boolean f2 = f | z | oq5Var.f(jx7Var) | oq5Var.f(xofVar);
        Object K = oq5Var.K();
        if (f2 || K == gq5.a) {
            ime imeVar = new ime(20, o3kVar, new yl0(7, o3kVar, xofVar), obj);
            float f3 = w1r.a;
            s1r s1rVar = new s1r(imeVar, a2, Q);
            oq5Var.k0(s1rVar);
            K = s1rVar;
        }
        return (s1r) K;
    }

    public static final String G(String str) {
        return "android_" + str + "_" + UUID.randomUUID();
    }

    public static final String H() {
        gfo gfoVar = gfo.Tab;
        return G("unknown");
    }

    public static final Drawable I(Context context, int i) {
        context.getClass();
        Drawable w = y2x.w(context, i);
        if (w != null) {
            return w;
        }
        xq0.x("Required value was null.");
        return null;
    }

    public static final o4q J(bbq bbqVar) {
        bbqVar.getClass();
        if (bbqVar instanceof abq) {
            return ((abq) bbqVar).b;
        }
        if (bbqVar instanceof xaq) {
            return o4q.b;
        }
        b6e.s();
        return null;
    }

    public static String K() {
        String I;
        l18 l18Var = l18.b;
        bdt I2 = hag.I(byb.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        e7s e7sVar = (e7s) ((byb) qdcVar.C(I2)).c(ern.a(e7s.class));
        String str = swf.H().a;
        String str2 = swf.G().a;
        JsonObject d = e7sVar.a().d("div_localized");
        if (d != null) {
            JsonElement v = d.v(str);
            if (v == null || (I = cxb.I(v)) == null) {
                JsonElement v2 = d.v(str2);
                I = v2 != null ? cxb.I(v2) : null;
            }
            if (I != null) {
                return I;
            }
        }
        return e7sVar.a().f("div");
    }

    public static vb7 L(Context context, String str) {
        WeakHashMap weakHashMap = vgu.c;
        Object obj = weakHashMap.get(str);
        if (obj == null) {
            String format = String.format("divkit_optimized_viewpool_profile_%s.json", Arrays.copyOf(new Object[]{str}, 1));
            ugu uguVar = ugu.b;
            dq7 dq7Var = ca8.a;
            vb7 vb7Var = new vb7(context, format, gld.e(mn7.d.plus(a4g.n())), uguVar);
            weakHashMap.put(str, vb7Var);
            obj = vb7Var;
        }
        return (vb7) obj;
    }

    public static final String M(String str, String str2) {
        return (str == null || str.length() == 0) ? str2 == null ? "" : str2 : (str2 == null || str2.length() == 0) ? str : ouj.o(str, " • ", str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static List N(oxq oxqVar, int i, oxq oxqVar2, boolean z, boolean z2, boolean z3) {
        c5b c5bVar;
        boolean z4;
        w80 R;
        int i2;
        int i3;
        int s = oxqVar.s(i);
        int i4 = i + s;
        int f = oxqVar.f(oxqVar.b, oxqVar.q(i));
        int f2 = oxqVar.f(oxqVar.b, oxqVar.q(i4));
        int i5 = f2 - f;
        boolean z5 = i >= 0 && (oxqVar.b[(oxqVar.q(i) * 5) + 1] & 201326592) != 0;
        oxqVar2.u(s);
        oxqVar2.v(i5, oxqVar2.t);
        if (oxqVar.g < i4) {
            oxqVar.z(i4);
        }
        if (oxqVar.k < f2) {
            oxqVar.A(f2, i4);
        }
        int[] iArr = oxqVar2.b;
        int i6 = oxqVar2.t;
        int i7 = i6 * 5;
        uz0.e(i7, i * 5, i4 * 5, oxqVar.b, iArr);
        Object[] objArr = oxqVar2.c;
        int i8 = oxqVar2.i;
        System.arraycopy(oxqVar.c, f, objArr, i8, i5);
        int i9 = oxqVar2.v;
        iArr[i7 + 2] = i9;
        int i10 = i6 - i;
        int i11 = i6 + s;
        int f3 = i8 - oxqVar2.f(iArr, i6);
        int i12 = oxqVar2.m;
        int i13 = oxqVar2.l;
        int length = objArr.length;
        boolean z6 = z5;
        int i14 = i12;
        int i15 = i6;
        while (i15 < i11) {
            if (i15 != i6) {
                int i16 = (i15 * 5) + 2;
                iArr[i16] = iArr[i16] + i10;
            }
            int[] iArr2 = iArr;
            int f4 = oxqVar2.f(iArr, i15) + f3;
            if (i14 < i15) {
                i2 = i6;
                i3 = 0;
            } else {
                i2 = i6;
                i3 = oxqVar2.k;
            }
            iArr2[(i15 * 5) + 4] = oxq.h(f4, i3, i13, length);
            if (i15 == i14) {
                i14++;
            }
            i15++;
            i6 = i2;
            iArr = iArr2;
        }
        int[] iArr3 = iArr;
        oxqVar2.m = i14;
        int a2 = hxq.a(oxqVar.d, i, oxqVar.n());
        int a3 = hxq.a(oxqVar.d, i4, oxqVar.n());
        if (a2 < a3) {
            ArrayList arrayList = oxqVar.d;
            ArrayList arrayList2 = new ArrayList(a3 - a2);
            for (int i17 = a2; i17 < a3; i17++) {
                w80 w80Var = (w80) arrayList.get(i17);
                w80Var.a += i10;
                arrayList2.add(w80Var);
            }
            oxqVar2.d.addAll(hxq.a(oxqVar2.d, oxqVar2.t, oxqVar2.n()), arrayList2);
            arrayList.subList(a2, a3).clear();
            c5bVar = arrayList2;
        } else {
            c5bVar = c5b.a;
        }
        c5b c5bVar2 = c5bVar;
        if (!c5bVar2.isEmpty()) {
            HashMap hashMap = oxqVar.e;
            HashMap hashMap2 = oxqVar2.e;
            if (hashMap != null && hashMap2 != null) {
                int size = c5bVar2.size();
                for (int i18 = 0; i18 < size; i18++) {
                }
            }
        }
        int i19 = oxqVar2.v;
        HashMap hashMap3 = oxqVar2.e;
        if (hashMap3 != null && (R = oxqVar2.R(i9)) != null) {
        }
        int E = oxqVar.E(oxqVar.b, i);
        if (!z3) {
            z4 = false;
        } else if (z) {
            boolean z7 = E >= 0;
            if (z7) {
                oxqVar.P();
                oxqVar.a(E - oxqVar.t);
                oxqVar.P();
            }
            oxqVar.a(i - oxqVar.t);
            boolean H = oxqVar.H();
            if (z7) {
                oxqVar.L();
                oxqVar.i();
                oxqVar.L();
                oxqVar.i();
            }
            z4 = H;
        } else {
            boolean I = oxqVar.I(i, s);
            oxqVar.J(f, i5, i - 1);
            z4 = I;
        }
        if (z4) {
            pq5.c("Unexpectedly removed anchors");
        }
        int i20 = oxqVar2.o;
        int i21 = iArr3[i7 + 1];
        oxqVar2.o = i20 + ((1073741824 & i21) != 0 ? 1 : i21 & 67108863);
        if (z2) {
            oxqVar2.t = i11;
            oxqVar2.i = i8 + i5;
        }
        if (z6) {
            oxqVar2.U(i9);
        }
        return c5bVar;
    }

    public static dp7 O(o3k o3kVar, bxj bxjVar, hq5 hq5Var, int i) {
        boolean z = (((i & 14) ^ 6) > 4 && ((oq5) hq5Var).f(o3kVar)) || (i & 6) == 4;
        oq5 oq5Var = (oq5) hq5Var;
        Object K = oq5Var.K();
        if (z || K == gq5.a) {
            K = new dp7(o3kVar, bxjVar);
            oq5Var.k0(K);
        }
        return (dp7) K;
    }

    public static void P(Context context, String str, boolean z) {
        Object t7oVar;
        str.getClass();
        if (!z) {
            quj.c0(context, str).delete();
            return;
        }
        try {
            r7o r7oVar = z7o.b;
            t7oVar = Boolean.valueOf(quj.c0(context, str).createNewFile());
        } catch (Throwable th) {
            r7o r7oVar2 = z7o.b;
            t7oVar = new t7o(th);
        }
        Throwable a2 = z7o.a(t7oVar);
        if (a2 != null) {
            ssg.a(7, "VpnGateOfflineModeDataSource", "Can't save isOfflineMode=" + z + ", puid=" + str, a2);
        }
    }

    public static final CharSequence Q(CharSequence charSequence) {
        charSequence.getClass();
        if (StringsKt.U(charSequence)) {
            return null;
        }
        return charSequence;
    }

    public static final CharSequence R(CharSequence charSequence) {
        charSequence.getClass();
        if (charSequence.length() > 0) {
            return charSequence;
        }
        return null;
    }

    public static final s4m S(t4m t4mVar, int i) {
        qmk qmkVar;
        PersonalPlaylistHeaderDto playlistHeader;
        PersonalPlaylistPodcastsEntityDto personalPlaylistPodcastsEntityDto;
        TrackDto track;
        t2m t2mVar;
        String id;
        t4mVar.getClass();
        if (t4mVar instanceof PlaylistPodcastsEntityDto) {
            PlaylistPodcastsEntityDto playlistPodcastsEntityDto = (PlaylistPodcastsEntityDto) t4mVar;
            PlaylistHeaderDto playlist = playlistPodcastsEntityDto.getPlaylist();
            if (playlist != null) {
                rrl L = zdg.L(playlist);
                b2c b2cVar = i94.b;
                String type = playlistPodcastsEntityDto.getType();
                b2cVar.getClass();
                i94 A = b2c.A(type);
                if (A != null) {
                    return new axl(L, i, A);
                }
            }
        } else {
            if (!(t4mVar instanceof PersonalPlaylistPodcastsEntityDto)) {
                b6e.s();
                return null;
            }
            PersonalPlaylistPodcastsEntityDto personalPlaylistPodcastsEntityDto2 = (PersonalPlaylistPodcastsEntityDto) t4mVar;
            PersonalPlaylistHeaderMetaDto personalPlaylist = personalPlaylistPodcastsEntityDto2.getPersonalPlaylist();
            if (personalPlaylist != null) {
                String type2 = personalPlaylist.getType();
                if (type2 == null || (playlistHeader = personalPlaylist.getPlaylistHeader()) == null) {
                    personalPlaylistPodcastsEntityDto = personalPlaylistPodcastsEntityDto2;
                    qmkVar = null;
                } else {
                    cvl I = uwf.I(playlistHeader);
                    List tracks = playlistHeader.getTracks();
                    if (tracks == null) {
                        tracks = c5b.a;
                    }
                    List<WrappedTrackDto> list = tracks;
                    ArrayList arrayList = new ArrayList();
                    for (WrappedTrackDto wrappedTrackDto : list) {
                        if (wrappedTrackDto == null || (id = wrappedTrackDto.getId()) == null) {
                            t2mVar = null;
                        } else {
                            String albumId = wrappedTrackDto.getAlbumId();
                            qc7 timestamp = wrappedTrackDto.getTimestamp();
                            t2mVar = new t2m(id, albumId, timestamp != null ? timestamp.b : null);
                        }
                        if (t2mVar != null) {
                            arrayList.add(t2mVar);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (WrappedTrackDto wrappedTrackDto2 : list) {
                        mqs a2 = (wrappedTrackDto2 == null || (track = wrappedTrackDto2.getTrack()) == null) ? null : wts.a(track);
                        if (a2 != null) {
                            arrayList2.add(a2);
                        }
                    }
                    rrl rrlVar = new rrl(I, arrayList, arrayList2);
                    Boolean ready = personalPlaylist.getReady();
                    boolean booleanValue = ready != null ? ready.booleanValue() : false;
                    Boolean notify = personalPlaylist.getNotify();
                    boolean booleanValue2 = notify != null ? notify.booleanValue() : false;
                    CoverInfoDto dummyCover = personalPlaylist.getPlaylistHeader().getDummyCover();
                    tn6 L2 = dummyCover != null ? ltg.L(dummyCover) : null;
                    CoverInfoDto dummyRolloverCover = personalPlaylist.getPlaylistHeader().getDummyRolloverCover();
                    tn6 L3 = dummyRolloverCover != null ? ltg.L(dummyRolloverCover) : null;
                    CoverInfoDto coverWithoutText = personalPlaylist.getPlaylistHeader().getCoverWithoutText();
                    personalPlaylistPodcastsEntityDto = personalPlaylistPodcastsEntityDto2;
                    qmkVar = new qmk(new smk(type2, I, booleanValue, booleanValue2, L2, L3, coverWithoutText != null ? ltg.L(coverWithoutText) : null, personalPlaylist.getPreviewDescription(), personalPlaylist.getPlaylistHeader().getDummyDescription(), personalPlaylist.getPlaylistHeader().getIdForFrom(), new ece(L3, qo6.m, null), new ece(L2, qo6.e, null)), rrlVar);
                }
                if (qmkVar != null) {
                    b2c b2cVar2 = i94.b;
                    String type3 = personalPlaylistPodcastsEntityDto.getType();
                    b2cVar2.getClass();
                    i94 A2 = b2c.A(type3);
                    if (A2 != null) {
                        return new tmk(qmkVar, i, A2);
                    }
                }
            }
        }
        return null;
    }

    public static final int T(sow sowVar) {
        switch (sowVar.ordinal()) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            default:
                b6e.s();
                break;
        }
        return 0;
    }

    public static final int U(bvf bvfVar) {
        List list = bvfVar.k;
        int size = list.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += ((cvf) list.get(i2)).q;
        }
        return (i / list.size()) + bvfVar.r;
    }

    public static final knn V() {
        knn knnVar = new knn(18);
        knnVar.b = null;
        return knnVar;
    }

    public static boolean W(Comparator comparator, Collection collection) {
        Object obj;
        comparator.getClass();
        collection.getClass();
        if (collection instanceof SortedSet) {
            obj = ((SortedSet) collection).comparator();
            if (obj == null) {
                obj = l6x.b;
            }
        } else {
            if (!(collection instanceof c6x)) {
                return false;
            }
            obj = ((c6x) collection).f;
        }
        return comparator.equals(obj);
    }

    public static final void a(List list, hq5 hq5Var, int i) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1185226975);
        int i2 = (oq5Var.f(list) ? 4 : 2) | i;
        if (oq5Var.P(i2 & 1, (i2 & 3) != 2)) {
            vci vciVar = vci.a;
            yci o = d.o(vciVar, 76, 60);
            kfh d = ug3.d(b2c.d, false);
            int i3 = oq5Var.P;
            a l = oq5Var.l();
            yci H = vnj.H(oq5Var, o);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, d, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var, i3, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            List j0 = CollectionsKt.j0(list);
            oq5Var.Z(-692086055);
            IntRange intRange = new IntRange(0, 2, 1);
            ArrayList arrayList = new ArrayList(v75.o(intRange, 10));
            ype it = intRange.iterator();
            while (it.c) {
                int nextInt = it.nextInt();
                ArrayList arrayList2 = arrayList;
                irf.y((String) ((nextInt < 0 || nextInt >= j0.size()) ? "" : j0.get(nextInt)), qo6.m, androidx.compose.foundation.layout.a.j(d.m(vciVar, 44), -(nextInt * 16), nextInt * 8), false, true, null, null, null, oq5Var, 24624, 232);
                arrayList2.add(Unit.a);
                arrayList = arrayList2;
                it = it;
                j0 = j0;
            }
            oq5Var.p(false);
            oq5Var.p(true);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new t44(i, 2, list);
        }
    }

    public static final void b(ugs ugsVar, hq5 hq5Var, int i) {
        int i2;
        ugsVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(790746447);
        if ((i & 6) == 0) {
            i2 = (oq5Var.f(ugsVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (oq5Var.P(i2 & 1, (i2 & 3) != 2)) {
            irf.y(ugsVar.getUrl(), ugsVar.getType(), d.c(b.c(vci.a, "cover", ugsVar.getUrl()), 1.0f), false, true, null, null, null, oq5Var, 24576, 232);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new z44(ugsVar, i, 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(ugs ugsVar, hq5 hq5Var, int i) {
        int i2;
        vg2 vg2Var;
        jzk jzkVar = vnj.i;
        ugsVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1012447608);
        if ((i & 6) == 0) {
            i2 = (oq5Var.f(ugsVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (oq5Var.P(i2 & 1, (i2 & 3) != 2)) {
            boolean z = ugsVar instanceof tgs;
            vci vciVar = vci.a;
            if (z) {
                oq5Var.Z(-1728426146);
                yci c = d.c(vciVar, 1.0f);
                tgs tgsVar = (tgs) ugsVar;
                ug3.a(androidx.compose.foundation.a.b(xv.z(xp3.u(b.c(c, "cover_pad", tgsVar.a), ugo.a(4)), 0.5f), tgsVar.c, jzkVar), oq5Var, 0);
                oq5Var.p(false);
            } else {
                if (!(ugsVar instanceof sgs)) {
                    throw vz1.i(oq5Var, -1995420778, false);
                }
                oq5Var.Z(-1727913065);
                if (Build.VERSION.SDK_INT < 31) {
                    oq5Var.Z(-1727873075);
                    boolean booleanValue = ((Boolean) oq5Var.j(koe.a)).booleanValue();
                    kjn kjnVar = gq5.a;
                    if (booleanValue) {
                        oq5Var.Z(-1727728584);
                        oq5Var.p(false);
                        long j = d85.j;
                        mgr mgrVar = new mgr();
                        mgrVar.a = j;
                        mgrVar.b = j;
                        vg2Var = mgrVar;
                    } else {
                        oq5Var.Z(-1727641133);
                        long j2 = d85.d;
                        String str = ((sgs) ugsVar).a;
                        Context context = (Context) oq5Var.j(AndroidCompositionLocals_androidKt.b);
                        Object K = oq5Var.K();
                        if (K == kjnVar) {
                            K = new d85(j2);
                            oq5Var.k0(K);
                        }
                        long j3 = ((d85) K).a;
                        Object K2 = oq5Var.K();
                        if (K2 == kjnVar) {
                            K2 = gld.R(dm6.b(), oq5Var);
                            oq5Var.k0(K2);
                        }
                        mm6 mm6Var = (mm6) K2;
                        boolean f = oq5Var.f(str) | oq5Var.f(context) | oq5Var.f(mm6Var);
                        Object K3 = oq5Var.K();
                        if (f || K3 == kjnVar) {
                            K3 = new vg2(j3, mm6Var, str, context);
                            oq5Var.k0(K3);
                        }
                        vg2 vg2Var2 = (vg2) K3;
                        ngg.g(vg2Var2, oq5Var, 0);
                        oq5Var.p(false);
                        vg2Var = vg2Var2;
                    }
                    yci z2 = xv.z(xp3.u(b.c(d.c(vciVar, 1.0f), "cover_pad", ((sgs) ugsVar).a), ugo.a(4)), 0.5f);
                    boolean h = oq5Var.h(vg2Var);
                    Object K4 = oq5Var.K();
                    if (h || K4 == kjnVar) {
                        K4 = new xpp(19, vg2Var);
                        oq5Var.k0(K4);
                    }
                    ug3.a(wyf.t(z2, (Function0) K4), oq5Var, 0);
                    oq5Var.p(false);
                } else {
                    oq5Var.Z(-1727171483);
                    yci c2 = d.c(vciVar, 1.0f);
                    String str2 = ((sgs) ugsVar).a;
                    yci z3 = xv.z(men.s(xp3.u(b.c(c2, "cover_pad", str2), ugo.a(4)), 60, jzkVar), 0.5f);
                    kfh d = ug3.d(b2c.b, false);
                    int i3 = oq5Var.P;
                    a l = oq5Var.l();
                    yci H = vnj.H(oq5Var, z3);
                    xp5.T.getClass();
                    grb grbVar = wp5.b;
                    oq5Var.d0();
                    if (oq5Var.O) {
                        oq5Var.k(grbVar);
                    } else {
                        oq5Var.n0();
                    }
                    g0g.U(oq5Var, d, wp5.f);
                    g0g.U(oq5Var, l, wp5.e);
                    kb5 kb5Var = wp5.g;
                    if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                        ouj.x(i3, oq5Var, i3, kb5Var);
                    }
                    g0g.U(oq5Var, H, wp5.d);
                    irf.y(str2, qo6.k, d.c(vciVar, 1.0f), false, true, null, null, null, oq5Var, 25008, 232);
                    oq5Var.p(true);
                    oq5Var.p(false);
                }
                oq5Var.p(false);
            }
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new z44(ugsVar, i, 2);
        }
    }

    public static final void d(c8i c8iVar, spd spdVar, ynn ynnVar, Function2 function2, ryc rycVar, hq5 hq5Var, int i) {
        c8i c8iVar2 = c8iVar;
        ynnVar.getClass();
        function2.getClass();
        rycVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1380719530);
        int i2 = i | (oq5Var.f(c8iVar2) ? 4 : 2) | (oq5Var.h(spdVar) ? 32 : 16) | (oq5Var.f(ynnVar) ? 256 : 128) | (oq5Var.h(function2) ? 2048 : 1024) | (oq5Var.h(rycVar) ? 16384 : RemoteCameraConfig.Notification.ID);
        if (oq5Var.P(i2 & 1, (i2 & 9363) != 9362)) {
            tgo F = o5g.F(oq5Var);
            vci vciVar = vci.a;
            yci u = xp3.u(vciVar, F);
            int i3 = i2 & 14;
            boolean h = ((i2 & 7168) == 2048) | (i3 == 4) | oq5Var.h(spdVar);
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (h || K == kjnVar) {
                K = new y7i(function2, c8iVar2, spdVar, 1);
                oq5Var.k0(K);
            }
            yci e = androidx.compose.foundation.a.e(u, false, null, null, (Function0) K, 7);
            agr agrVar = eq0.a;
            float f = 12;
            yci p = androidx.compose.foundation.layout.a.p(androidx.compose.foundation.a.b(e, ((dq0) oq5Var.j(agrVar)).d.c, vnj.i), f, 8, f, f);
            boolean h2 = ((i2 & 57344) == 16384) | (i3 == 4) | oq5Var.h(spdVar);
            Object K2 = oq5Var.K();
            if (h2 || K2 == kjnVar) {
                c8iVar2 = c8iVar;
                K2 = new z7i(rycVar, c8iVar2, spdVar, 1);
                oq5Var.k0(K2);
            } else {
                c8iVar2 = c8iVar;
            }
            yci f2 = androidx.compose.ui.platform.a.a(com.yandex.music.core.ui.compose.a.b(p, ynnVar, 0L, 0.0f, null, (Function2) K2, 14), "mixes_block_item").f(irv.h(oq5Var) ? d.r(vciVar, 120) : d.t(vciVar, 76, 0.0f, 2));
            ta5 a2 = sa5.a(qx0.c, b2c.n, oq5Var, 0);
            int i4 = oq5Var.P;
            a l = oq5Var.l();
            yci H = vnj.H(oq5Var, f2);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a2, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var, i4, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            xcs.b(c8iVar2.b, androidx.compose.ui.platform.a.a(vciVar, "mixes_block_item_title"), ((dq0) oq5Var.j(agrVar)).b.a, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, nu0.i(), oq5Var, 48, 3120, 55288);
            u1g.l(oq5Var, d.e(vciVar, 6));
            a(c8iVar2.e, oq5Var, 0);
            oq5Var.p(true);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new bj(i, 28, c8iVar2, spdVar, ynnVar, function2, rycVar);
        }
    }

    public static final void e(boolean z, hq5 hq5Var, int i) {
        boolean z2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-334945008);
        int i2 = (oq5Var.g(z) ? 4 : 2) | i;
        if (oq5Var.P(i2 & 1, (i2 & 3) != 2)) {
            float f = irv.h(oq5Var) ? 120 : 76;
            tgo F = o5g.F(oq5Var);
            vci vciVar = vci.a;
            float f2 = 12;
            yci r = d.r(androidx.compose.foundation.layout.a.p(androidx.compose.foundation.a.b(xp3.u(vciVar, F), ((dq0) oq5Var.j(eq0.a)).d.c, vnj.i), f2, 8, f2, f2), f);
            ta5 a2 = sa5.a(qx0.c, b2c.n, oq5Var, 0);
            int i3 = oq5Var.P;
            a l = oq5Var.l();
            yci H = vnj.H(oq5Var, r);
            xp5.T.getClass();
            grb grbVar = wp5.b;
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
            g0g.U(oq5Var, H, wp5.d);
            int i4 = i2 & 14;
            z2 = z;
            ivf.l(z2, d.r(xp3.u(vciVar, o5g.C(oq5Var)), f), nu0.i(), oq5Var, i4, 0);
            u1g.l(oq5Var, d.e(vciVar, 6));
            ivf.k(i4, 0, oq5Var, xp3.u(d.r(d.e(vciVar, 60), f), o5g.E(oq5Var)), z2);
            oq5Var.p(true);
        } else {
            z2 = z;
            oq5Var.S();
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new sm(i, 25, z2);
        }
    }

    public static final void f(wn5 wn5Var, wn5 wn5Var2, hq5 hq5Var, int i) {
        wn5 wn5Var3;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1068229376);
        if ((i & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
            wn5Var3 = wn5Var2;
        } else {
            iz2 iz2Var = b2c.b;
            kfh d = ug3.d(iz2Var, false);
            int i2 = oq5Var.P;
            a l = oq5Var.l();
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
            kb5 kb5Var = wp5.f;
            g0g.U(oq5Var, d, kb5Var);
            kb5 kb5Var2 = wp5.e;
            g0g.U(oq5Var, l, kb5Var2);
            kb5 kb5Var3 = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i2))) {
                ouj.x(i2, oq5Var, i2, kb5Var3);
            }
            kb5 kb5Var4 = wp5.d;
            g0g.U(oq5Var, H, kb5Var4);
            long f = c3x.f(1291893972);
            jzk jzkVar = vnj.i;
            float f2 = 1;
            yci y = c3x.y(f2, c3x.h(4278238420L), androidx.compose.foundation.a.b(vciVar, f, jzkVar), jzkVar);
            kfh d2 = ug3.d(iz2Var, false);
            int i3 = oq5Var.P;
            a l2 = oq5Var.l();
            yci H2 = vnj.H(oq5Var, y);
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, d2, kb5Var);
            g0g.U(oq5Var, l2, kb5Var2);
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var, i3, kb5Var3);
            }
            g0g.U(oq5Var, H2, kb5Var4);
            wn5Var.invoke(xv.z(vciVar, 0.5f), oq5Var, 54);
            oq5Var.p(true);
            yci y2 = c3x.y(f2, c3x.h(4293467747L), androidx.compose.foundation.a.b(vciVar, c3x.f(1307123299), jzkVar), jzkVar);
            kfh d3 = ug3.d(iz2Var, false);
            int i4 = oq5Var.P;
            a l3 = oq5Var.l();
            yci H3 = vnj.H(oq5Var, y2);
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, d3, kb5Var);
            g0g.U(oq5Var, l3, kb5Var2);
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var, i4, kb5Var3);
            }
            g0g.U(oq5Var, H3, kb5Var4);
            wn5Var3 = wn5Var2;
            wn5Var3.invoke(xv.z(vciVar, 0.5f), oq5Var, 54);
            oq5Var.p(true);
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new rsk(wn5Var, wn5Var3, i);
        }
    }

    public static final gsm g(String str, csm csmVar) {
        if (StringsKt.U(str)) {
            xq0.x("Blank serial names are prohibited");
            return null;
        }
        Object it = ((h9h) ksm.a.values()).iterator();
        while (((e9h) it).hasNext()) {
            t9f t9fVar = (t9f) ((c9h) it).next();
            if (str.equals(t9fVar.getDescriptor().i())) {
                StringBuilder u = ouj.u("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name ", str, " there already exists ");
                u.append(ern.a(t9fVar.getClass()).h());
                u.append(".\n                Please refer to SerialDescriptor documentation for additional information.\n            ");
                xq0.x(hlr.d(u.toString()));
                return null;
            }
        }
        return new gsm(str, csmVar);
    }

    public static final void h(umn umnVar, yci yciVar, wln wlnVar, Function1 function1, hq5 hq5Var, int i) {
        oq5 oq5Var;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-439401809);
        int i2 = (oq5Var2.f(umnVar) ? 4 : 2) | i | (oq5Var2.f(wlnVar) ? 256 : 128) | (oq5Var2.h(function1) ? 2048 : 1024);
        if ((i2 & 1171) == 1170 && oq5Var2.z()) {
            oq5Var2.S();
            oq5Var = oq5Var2;
        } else {
            d8t e = i8t.e(umnVar, "recognition", oq5Var2, (i2 & 14) | 48, 0);
            act S = weo.S(300, 0, null, 6);
            Object K = oq5Var2.K();
            if (K == gq5.a) {
                K = new kin(3);
                oq5Var2.k0(K);
            }
            oq5Var = oq5Var2;
            tt0.f(e, null, S, (Function1) K, ild.C(681855587, new mdn(umnVar, function1, yciVar, wlnVar, 3), oq5Var2), oq5Var, 28032, 1);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new gvl(i, 19, umnVar, yciVar, wlnVar, function1);
        }
    }

    public static final void i(wln wlnVar, lmn lmnVar, Function1 function1, yci yciVar, hq5 hq5Var, int i) {
        wlnVar.getClass();
        function1.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1035186767);
        int i2 = i | (oq5Var.f(wlnVar) ? 4 : 2) | (oq5Var.f(lmnVar) ? 32 : 16) | (oq5Var.h(function1) ? 256 : 128) | (oq5Var.f(yciVar) ? 2048 : 1024);
        if ((i2 & 1171) == 1170 && oq5Var.z()) {
            oq5Var.S();
        } else {
            aqi Q = szf.Q(wlnVar.b, oq5Var);
            aqi o0 = szf.o0(function1, oq5Var);
            Unit unit = Unit.a;
            boolean z = (i2 & 14) == 4;
            Object K = oq5Var.K();
            if (z || K == gq5.a) {
                K = new d7i(wlnVar, null, 16);
                oq5Var.k0(K);
            }
            gld.w(oq5Var, unit, (Function2) K);
            jft.a(lmnVar, ild.C(-1313021269, new gvl(yciVar, wlnVar, Q, o0, 17), oq5Var), oq5Var, ((i2 >> 3) & 14) | 48);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new gvl(i, 18, wlnVar, lmnVar, function1, yciVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x0268, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r2.K(), java.lang.Integer.valueOf(r7)) == false) goto L151;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x040a  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x036d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void j(ahs ahsVar, yci yciVar, int i, bhs bhsVar, pyc pycVar, pyc pycVar2, Function2 function2, Function1 function1, Function1 function12, hq5 hq5Var, final int i2, final int i3) {
        yci yciVar2;
        int i4;
        int i5;
        bhs bhsVar2;
        int i6;
        int i7;
        pyc pycVar3;
        int i8;
        int i9;
        Function1 function13;
        int i10;
        int i11;
        int i12;
        final pyc pycVar4;
        final Function1 function14;
        Function1 function15;
        final bhs bhsVar3;
        final pyc pycVar5;
        final Function2 function22;
        xmn r;
        bhs bhsVar4;
        pyc pycVar6;
        pyc pycVar7;
        final Function1 function16;
        int i13;
        final Function1 function17;
        Function2 function23;
        int i14;
        pyc pycVar8;
        Function0 S;
        int i15;
        boolean z;
        Object K;
        pyc pycVar9;
        kb5 kb5Var;
        kb5 kb5Var2;
        kb5 kb5Var3;
        float f;
        kb5 kb5Var4;
        int i16;
        bhs bhsVar5;
        pyc pycVar10;
        int i17;
        int i18;
        boolean z2;
        Function2 function24;
        final ahs ahsVar2 = ahsVar;
        gz2 gz2Var = b2c.n;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1668649745);
        int i19 = (oq5Var.f(ahsVar2) ? 4 : 2) | i2;
        int i20 = i3 & 2;
        if (i20 != 0) {
            i4 = i19 | 48;
            yciVar2 = yciVar;
        } else {
            yciVar2 = yciVar;
            i4 = i19 | (oq5Var.f(yciVar2) ? 32 : 16);
        }
        int i21 = i3 & 4;
        if (i21 != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            i5 = i;
            i4 |= oq5Var.d(i5) ? 256 : 128;
            if ((i3 & 8) != 0) {
                bhsVar2 = bhsVar;
                if (oq5Var.f(bhsVar2)) {
                    i6 = 2048;
                    int i22 = i4 | i6;
                    i7 = i3 & 16;
                    if (i7 != 0) {
                        i22 |= 24576;
                    } else if ((i2 & 24576) == 0) {
                        pycVar3 = pycVar;
                        i22 |= oq5Var.h(pycVar3) ? 16384 : RemoteCameraConfig.Notification.ID;
                        int i23 = i22 | 196608;
                        i8 = i3 & 64;
                        if (i8 == 0) {
                            i23 = i22 | 1769472;
                        } else if ((1572864 & i2) == 0) {
                            i23 |= oq5Var.h(function2) ? 1048576 : 524288;
                            i9 = i3 & 128;
                            if (i9 != 0) {
                                i10 = i23 | 12582912;
                                function13 = function1;
                            } else {
                                function13 = function1;
                                i10 = i23 | (oq5Var.h(function13) ? 8388608 : RemoteCameraConfig.Camera.BITRATE);
                            }
                            i11 = i3 & 256;
                            if (i11 != 0) {
                                i10 |= 100663296;
                            } else if ((i2 & 100663296) == 0) {
                                i10 |= oq5Var.h(function12) ? 67108864 : 33554432;
                            }
                            i12 = i10;
                            if (oq5Var.P(i12 & 1, (i12 & 38347923) != 38347922)) {
                                oq5Var.U();
                                int i24 = i2 & 1;
                                vci vciVar = vci.a;
                                Object obj = gq5.a;
                                if (i24 == 0 || oq5Var.y()) {
                                    if (i20 != 0) {
                                        yciVar2 = vciVar;
                                    }
                                    if (i21 != 0) {
                                        i5 = 1;
                                    }
                                    if ((i3 & 8) != 0) {
                                        bhsVar4 = ywf.s(oq5Var);
                                        i12 &= -7169;
                                    } else {
                                        bhsVar4 = bhsVar2;
                                    }
                                    pycVar6 = i7 != 0 ? nt0.n : pycVar3;
                                    pycVar7 = nt0.o;
                                    Function2 function25 = i8 != 0 ? nt0.p : function2;
                                    if (i9 != 0) {
                                        Object K2 = oq5Var.K();
                                        if (K2 == obj) {
                                            K2 = new d5s(28);
                                            oq5Var.k0(K2);
                                        }
                                        function16 = (Function1) K2;
                                    } else {
                                        function16 = function13;
                                    }
                                    i13 = i12;
                                    function24 = function25;
                                    if (i11 != 0) {
                                        function17 = null;
                                        function23 = function25;
                                        oq5Var.q();
                                        i14 = i13;
                                        float f2 = 60;
                                        float f3 = 52;
                                        hz2 hz2Var = b2c.l;
                                        yci d = d.d(yciVar2, 1.0f);
                                        float f4 = 8;
                                        yci yciVar3 = yciVar2;
                                        if (function17 != null) {
                                            oq5Var.Z(-792256043);
                                            oq5Var.p(false);
                                            pycVar8 = pycVar6;
                                            S = null;
                                        } else {
                                            oq5Var.Z(-792256042);
                                            pycVar8 = pycVar6;
                                            boolean z3 = ((i14 & 234881024) == 67108864) | ((i14 & 14) == 4);
                                            Object K3 = oq5Var.K();
                                            if (z3 || K3 == obj) {
                                                final int i25 = 0;
                                                K3 = new Function0() { // from class: vgs
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final Object invoke() {
                                                        switch (i25) {
                                                            case 0:
                                                                function17.invoke(ahsVar2);
                                                                break;
                                                            default:
                                                                function17.invoke(ahsVar2);
                                                                break;
                                                        }
                                                        return Unit.a;
                                                    }
                                                };
                                                oq5Var.k0(K3);
                                            }
                                            S = irf.S((Function0) K3, oq5Var, 0);
                                            oq5Var.p(false);
                                        }
                                        Function1 function18 = function17;
                                        i15 = i14 & 14;
                                        z = ((i14 & 29360128) != 8388608) | (i15 != 4);
                                        K = oq5Var.K();
                                        if (!z || K == obj) {
                                            final int i26 = 1;
                                            K = new Function0() { // from class: vgs
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    switch (i26) {
                                                        case 0:
                                                            function16.invoke(ahsVar2);
                                                            break;
                                                        default:
                                                            function16.invoke(ahsVar2);
                                                            break;
                                                    }
                                                    return Unit.a;
                                                }
                                            };
                                            oq5Var.k0(K);
                                        }
                                        Function0 function0 = (Function0) K;
                                        function15 = function16;
                                        float f5 = 0;
                                        d.getClass();
                                        function0.getClass();
                                        pycVar9 = pycVar7;
                                        float f6 = 12;
                                        yci e = d.e(androidx.compose.foundation.layout.a.n(androidx.compose.foundation.a.j(xp3.u(androidx.compose.ui.layout.a.b(d, new mbh(f4, f5, 1)), ugo.a(4)), null, S, function0, 64), f4, f5), bhsVar4.a + f6);
                                        nho a2 = lho.a(qx0.a, hz2Var, oq5Var, 48);
                                        int i27 = oq5Var.P;
                                        a l = oq5Var.l();
                                        yci H = vnj.H(oq5Var, e);
                                        xp5.T.getClass();
                                        Function0 function02 = wp5.b;
                                        oq5Var.d0();
                                        if (oq5Var.O) {
                                            oq5Var.n0();
                                        } else {
                                            oq5Var.k(function02);
                                        }
                                        kb5Var = wp5.f;
                                        g0g.U(oq5Var, a2, kb5Var);
                                        kb5Var2 = wp5.e;
                                        g0g.U(oq5Var, l, kb5Var2);
                                        kb5Var3 = wp5.g;
                                        if (oq5Var.O) {
                                            f = f6;
                                        } else {
                                            f = f6;
                                        }
                                        ouj.x(i27, oq5Var, i27, kb5Var3);
                                        kb5Var4 = wp5.d;
                                        g0g.U(oq5Var, H, kb5Var4);
                                        if (bhsVar4.c || bhsVar4.b) {
                                            oq5Var.Z(270558850);
                                            iz2 iz2Var = b2c.b;
                                            kfh d2 = ug3.d(iz2Var, false);
                                            i16 = oq5Var.P;
                                            a l2 = oq5Var.l();
                                            bhsVar5 = bhsVar4;
                                            yci H2 = vnj.H(oq5Var, vciVar);
                                            oq5Var.d0();
                                            int i28 = i5;
                                            if (oq5Var.O) {
                                                oq5Var.n0();
                                            } else {
                                                oq5Var.k(function02);
                                            }
                                            g0g.U(oq5Var, d2, kb5Var);
                                            g0g.U(oq5Var, l2, kb5Var2);
                                            if (!oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i16))) {
                                                ouj.x(i16, oq5Var, i16, kb5Var3);
                                            }
                                            g0g.U(oq5Var, H2, kb5Var4);
                                            int i29 = i14 >> 3;
                                            qgg.n(ahsVar, f2, f3, pycVar8, pycVar9, oq5Var, i15 | 432 | (i29 & 7168) | 24576);
                                            ahsVar2 = ahsVar;
                                            pycVar10 = pycVar9;
                                            float P = ff7.P(v7g.z(-8), oq5Var);
                                            yci j = androidx.compose.foundation.layout.a.j(androidx.compose.foundation.layout.a.k(vciVar, f2, 0.0f, 2), P, P);
                                            kfh d3 = ug3.d(iz2Var, false);
                                            i17 = oq5Var.P;
                                            a l3 = oq5Var.l();
                                            yci H3 = vnj.H(oq5Var, j);
                                            oq5Var.d0();
                                            if (oq5Var.O) {
                                                oq5Var.n0();
                                            } else {
                                                oq5Var.k(function02);
                                            }
                                            g0g.U(oq5Var, d3, kb5Var);
                                            g0g.U(oq5Var, l3, kb5Var2);
                                            if (!oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i17))) {
                                                ouj.x(i17, oq5Var, i17, kb5Var3);
                                            }
                                            g0g.U(oq5Var, H3, kb5Var4);
                                            function23.invoke(oq5Var, Integer.valueOf((i14 >> 18) & 14));
                                            oq5Var.p(true);
                                            oq5Var.p(true);
                                            u1g.l(oq5Var, d.r(vciVar, f));
                                            ta5 a3 = sa5.a(qx0.e, gz2Var, oq5Var, 6);
                                            i18 = oq5Var.P;
                                            a l4 = oq5Var.l();
                                            yci H4 = vnj.H(oq5Var, vciVar);
                                            oq5Var.d0();
                                            if (oq5Var.O) {
                                                oq5Var.n0();
                                            } else {
                                                oq5Var.k(function02);
                                            }
                                            g0g.U(oq5Var, a3, kb5Var);
                                            g0g.U(oq5Var, l4, kb5Var2);
                                            if (!oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i18))) {
                                                ouj.x(i18, oq5Var, i18, kb5Var3);
                                            }
                                            g0g.U(oq5Var, H4, kb5Var4);
                                            i5 = i28;
                                            l(ahsVar2, i5, oq5Var, i15 | (i29 & 112));
                                            z2 = true;
                                            oq5Var.p(true);
                                            oq5Var.p(false);
                                        } else {
                                            oq5Var.Z(271540186);
                                            yci b2 = d.b(vciVar, 1.0f);
                                            ta5 a4 = sa5.a(qx0.c, gz2Var, oq5Var, 6);
                                            int i30 = oq5Var.P;
                                            a l5 = oq5Var.l();
                                            yci H5 = vnj.H(oq5Var, b2);
                                            oq5Var.d0();
                                            if (oq5Var.O) {
                                                oq5Var.k(function02);
                                            } else {
                                                oq5Var.n0();
                                            }
                                            g0g.U(oq5Var, a4, kb5Var);
                                            g0g.U(oq5Var, l5, kb5Var2);
                                            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i30))) {
                                                ouj.x(i30, oq5Var, i30, kb5Var3);
                                            }
                                            g0g.U(oq5Var, H5, kb5Var4);
                                            l(ahsVar2, i5, oq5Var, ((i14 >> 3) & 112) | i15);
                                            oq5Var.p(true);
                                            oq5Var.p(false);
                                            bhsVar5 = bhsVar4;
                                            z2 = true;
                                            pycVar10 = pycVar9;
                                        }
                                        oq5Var.p(z2);
                                        pycVar5 = pycVar8;
                                        pycVar4 = pycVar10;
                                        function22 = function23;
                                        yciVar2 = yciVar3;
                                        bhsVar3 = bhsVar5;
                                        function14 = function18;
                                    }
                                } else {
                                    oq5Var.S();
                                    if ((i3 & 8) != 0) {
                                        i12 &= -7169;
                                    }
                                    pycVar7 = pycVar2;
                                    function16 = function13;
                                    bhsVar4 = bhsVar2;
                                    pycVar6 = pycVar3;
                                    function24 = function2;
                                    i13 = i12;
                                }
                                function17 = function12;
                                function23 = function24;
                                oq5Var.q();
                                i14 = i13;
                                float f22 = 60;
                                float f32 = 52;
                                hz2 hz2Var2 = b2c.l;
                                yci d4 = d.d(yciVar2, 1.0f);
                                float f42 = 8;
                                yci yciVar32 = yciVar2;
                                if (function17 != null) {
                                }
                                Function1 function182 = function17;
                                i15 = i14 & 14;
                                z = ((i14 & 29360128) != 8388608) | (i15 != 4);
                                K = oq5Var.K();
                                if (!z) {
                                }
                                final int i262 = 1;
                                K = new Function0() { // from class: vgs
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        switch (i262) {
                                            case 0:
                                                function16.invoke(ahsVar2);
                                                break;
                                            default:
                                                function16.invoke(ahsVar2);
                                                break;
                                        }
                                        return Unit.a;
                                    }
                                };
                                oq5Var.k0(K);
                                Function0 function03 = (Function0) K;
                                function15 = function16;
                                float f52 = 0;
                                d4.getClass();
                                function03.getClass();
                                pycVar9 = pycVar7;
                                float f62 = 12;
                                yci e2 = d.e(androidx.compose.foundation.layout.a.n(androidx.compose.foundation.a.j(xp3.u(androidx.compose.ui.layout.a.b(d4, new mbh(f42, f52, 1)), ugo.a(4)), null, S, function03, 64), f42, f52), bhsVar4.a + f62);
                                nho a22 = lho.a(qx0.a, hz2Var2, oq5Var, 48);
                                int i272 = oq5Var.P;
                                a l6 = oq5Var.l();
                                yci H6 = vnj.H(oq5Var, e2);
                                xp5.T.getClass();
                                Function0 function022 = wp5.b;
                                oq5Var.d0();
                                if (oq5Var.O) {
                                }
                                kb5Var = wp5.f;
                                g0g.U(oq5Var, a22, kb5Var);
                                kb5Var2 = wp5.e;
                                g0g.U(oq5Var, l6, kb5Var2);
                                kb5Var3 = wp5.g;
                                if (oq5Var.O) {
                                }
                                ouj.x(i272, oq5Var, i272, kb5Var3);
                                kb5Var4 = wp5.d;
                                g0g.U(oq5Var, H6, kb5Var4);
                                if (bhsVar4.c) {
                                }
                                oq5Var.Z(270558850);
                                iz2 iz2Var2 = b2c.b;
                                kfh d22 = ug3.d(iz2Var2, false);
                                i16 = oq5Var.P;
                                a l22 = oq5Var.l();
                                bhsVar5 = bhsVar4;
                                yci H22 = vnj.H(oq5Var, vciVar);
                                oq5Var.d0();
                                int i282 = i5;
                                if (oq5Var.O) {
                                }
                                g0g.U(oq5Var, d22, kb5Var);
                                g0g.U(oq5Var, l22, kb5Var2);
                                if (!oq5Var.O) {
                                }
                                ouj.x(i16, oq5Var, i16, kb5Var3);
                                g0g.U(oq5Var, H22, kb5Var4);
                                int i292 = i14 >> 3;
                                qgg.n(ahsVar, f22, f32, pycVar8, pycVar9, oq5Var, i15 | 432 | (i292 & 7168) | 24576);
                                ahsVar2 = ahsVar;
                                pycVar10 = pycVar9;
                                float P2 = ff7.P(v7g.z(-8), oq5Var);
                                yci j2 = androidx.compose.foundation.layout.a.j(androidx.compose.foundation.layout.a.k(vciVar, f22, 0.0f, 2), P2, P2);
                                kfh d32 = ug3.d(iz2Var2, false);
                                i17 = oq5Var.P;
                                a l32 = oq5Var.l();
                                yci H32 = vnj.H(oq5Var, j2);
                                oq5Var.d0();
                                if (oq5Var.O) {
                                }
                                g0g.U(oq5Var, d32, kb5Var);
                                g0g.U(oq5Var, l32, kb5Var2);
                                if (!oq5Var.O) {
                                }
                                ouj.x(i17, oq5Var, i17, kb5Var3);
                                g0g.U(oq5Var, H32, kb5Var4);
                                function23.invoke(oq5Var, Integer.valueOf((i14 >> 18) & 14));
                                oq5Var.p(true);
                                oq5Var.p(true);
                                u1g.l(oq5Var, d.r(vciVar, f));
                                ta5 a32 = sa5.a(qx0.e, gz2Var, oq5Var, 6);
                                i18 = oq5Var.P;
                                a l42 = oq5Var.l();
                                yci H42 = vnj.H(oq5Var, vciVar);
                                oq5Var.d0();
                                if (oq5Var.O) {
                                }
                                g0g.U(oq5Var, a32, kb5Var);
                                g0g.U(oq5Var, l42, kb5Var2);
                                if (!oq5Var.O) {
                                }
                                ouj.x(i18, oq5Var, i18, kb5Var3);
                                g0g.U(oq5Var, H42, kb5Var4);
                                i5 = i282;
                                l(ahsVar2, i5, oq5Var, i15 | (i292 & 112));
                                z2 = true;
                                oq5Var.p(true);
                                oq5Var.p(false);
                                oq5Var.p(z2);
                                pycVar5 = pycVar8;
                                pycVar4 = pycVar10;
                                function22 = function23;
                                yciVar2 = yciVar32;
                                bhsVar3 = bhsVar5;
                                function14 = function182;
                            } else {
                                oq5Var.S();
                                pycVar4 = pycVar2;
                                function14 = function12;
                                function15 = function13;
                                bhsVar3 = bhsVar2;
                                pycVar5 = pycVar3;
                                function22 = function2;
                            }
                            final int i31 = i5;
                            r = oq5Var.r();
                            if (r != null) {
                                final yci yciVar4 = yciVar2;
                                final Function1 function19 = function15;
                                r.d = new Function2() { // from class: wgs
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj2, Object obj3) {
                                        ((Integer) obj3).getClass();
                                        avf.j(ahs.this, yciVar4, i31, bhsVar3, pycVar5, pycVar4, function22, function19, function14, (hq5) obj2, rvf.R(i2 | 1), i3);
                                        return Unit.a;
                                    }
                                };
                                return;
                            }
                            return;
                        }
                        i9 = i3 & 128;
                        if (i9 != 0) {
                        }
                        i11 = i3 & 256;
                        if (i11 != 0) {
                        }
                        i12 = i10;
                        if (oq5Var.P(i12 & 1, (i12 & 38347923) != 38347922)) {
                        }
                        final int i312 = i5;
                        r = oq5Var.r();
                        if (r != null) {
                        }
                    }
                    pycVar3 = pycVar;
                    int i232 = i22 | 196608;
                    i8 = i3 & 64;
                    if (i8 == 0) {
                    }
                    i9 = i3 & 128;
                    if (i9 != 0) {
                    }
                    i11 = i3 & 256;
                    if (i11 != 0) {
                    }
                    i12 = i10;
                    if (oq5Var.P(i12 & 1, (i12 & 38347923) != 38347922)) {
                    }
                    final int i3122 = i5;
                    r = oq5Var.r();
                    if (r != null) {
                    }
                }
            } else {
                bhsVar2 = bhsVar;
            }
            i6 = 1024;
            int i222 = i4 | i6;
            i7 = i3 & 16;
            if (i7 != 0) {
            }
            pycVar3 = pycVar;
            int i2322 = i222 | 196608;
            i8 = i3 & 64;
            if (i8 == 0) {
            }
            i9 = i3 & 128;
            if (i9 != 0) {
            }
            i11 = i3 & 256;
            if (i11 != 0) {
            }
            i12 = i10;
            if (oq5Var.P(i12 & 1, (i12 & 38347923) != 38347922)) {
            }
            final int i31222 = i5;
            r = oq5Var.r();
            if (r != null) {
            }
        }
        i5 = i;
        if ((i3 & 8) != 0) {
        }
        i6 = 1024;
        int i2222 = i4 | i6;
        i7 = i3 & 16;
        if (i7 != 0) {
        }
        pycVar3 = pycVar;
        int i23222 = i2222 | 196608;
        i8 = i3 & 64;
        if (i8 == 0) {
        }
        i9 = i3 & 128;
        if (i9 != 0) {
        }
        i11 = i3 & 256;
        if (i11 != 0) {
        }
        i12 = i10;
        if (oq5Var.P(i12 & 1, (i12 & 38347923) != 38347922)) {
        }
        final int i312222 = i5;
        r = oq5Var.r();
        if (r != null) {
        }
    }

    public static final void k(ahs ahsVar, int i, hq5 hq5Var, int i2) {
        int i3;
        boolean z;
        int i4 = i;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1310337858);
        if ((i2 & 6) == 0) {
            i3 = i2 | (oq5Var.f(ahsVar) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var.d(i4) ? 32 : 16;
        }
        if (!oq5Var.P(i3 & 1, (i3 & 19) != 18)) {
            oq5Var.S();
        } else if (ahsVar instanceof ygs) {
            oq5Var.Z(-809259865);
            swf.p(true, oq5Var, 6);
            oq5Var.p(false);
        } else {
            if (!(ahsVar instanceof zgs)) {
                throw vz1.i(oq5Var, -809260226, false);
            }
            oq5Var.Z(682867933);
            zgs zgsVar = (zgs) ahsVar;
            int i5 = i3;
            String str = zgsVar.e;
            vci vciVar = vci.a;
            if (str == null) {
                oq5Var.Z(682904451);
                if (zgsVar.c.isEmpty()) {
                    z = false;
                    oq5Var.Z(676669700);
                } else {
                    oq5Var.Z(682978169);
                    z = false;
                    m3f.a(zgsVar.c, androidx.compose.ui.platform.a.a(vciVar, "subtitle"), ((dq0) oq5Var.j(eq0.a)).b.b, 0L, 0L, 0, 0L, i4, null, nu0.i(), oq5Var, 48, i5 & 112, 6136);
                }
                oq5Var.p(z);
                oq5Var.p(z);
                i4 = i;
            } else {
                z = false;
                oq5Var.Z(683406620);
                if (StringsKt.U(str)) {
                    i4 = i;
                    oq5Var.Z(676669700);
                } else {
                    oq5Var.Z(683473611);
                    xv7.j(str, androidx.compose.ui.platform.a.a(vciVar, "subtitle"), ((dq0) oq5Var.j(eq0.a)).b.b, 0L, 0L, 0, 0L, 0, false, i, 0, null, nu0.i(), oq5Var, 48, (i5 << 6) & 7168, 57336);
                    i4 = i;
                    oq5Var = oq5Var;
                }
                oq5Var.p(false);
                oq5Var.p(false);
            }
            oq5Var.p(z);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new xgs(ahsVar, i4, i2, 1);
        }
    }

    public static final void l(ahs ahsVar, int i, hq5 hq5Var, int i2) {
        int i3;
        ahs ahsVar2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(40129176);
        if ((i2 & 6) == 0) {
            i3 = i2 | (oq5Var.f(ahsVar) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var.d(i) ? 32 : 16;
        }
        int i4 = i3;
        if (oq5Var.P(i4 & 1, (i4 & 19) != 18)) {
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (K == kjnVar) {
                K = k5r.h(0, oq5Var);
            }
            u6k u6kVar = (u6k) K;
            String title = ahsVar.getTitle();
            ges b2 = ges.b(nu0.j(), 0L, 0L, null, null, 0L, 0, 0L, null, null, 0, i > 1 ? 2 : 1, 12582911);
            long j = ((dq0) oq5Var.j(eq0.a)).b.a;
            vci vciVar = vci.a;
            yci a2 = androidx.compose.ui.platform.a.a(vciVar, "title");
            Object K2 = oq5Var.K();
            if (K2 == kjnVar) {
                K2 = new aq(u6kVar, 5);
                oq5Var.k0(K2);
            }
            xv7.j(title, a2, j, 0L, 0L, 0, 0L, 2, false, i, 0, (Function1) K2, b2, oq5Var, 48, ((i4 << 6) & 7168) | 196656, 22520);
            oq5Var = oq5Var;
            u1g.l(oq5Var, d.e(vciVar, 4));
            int i5 = u6kVar.h() == 1 ? 2 : 1;
            ahsVar2 = ahsVar;
            k(ahsVar2, i5, oq5Var, i4 & 14);
        } else {
            ahsVar2 = ahsVar;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new xgs(ahsVar2, i, i2, 0);
        }
    }

    public static final void m(int i, hq5 hq5Var, yci yciVar, boolean z) {
        int i2;
        yci yciVar2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-804816971);
        if ((i & 6) == 0) {
            i2 = (oq5Var.g(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.f(yciVar) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
            yciVar2 = yciVar;
        } else {
            int i3 = i2 & 14;
            yciVar2 = yciVar;
            yci q = androidx.compose.foundation.layout.a.q(yciVar2, 0.0f, 0.0f, 0.0f, 4, 7);
            ta5 a2 = sa5.a(qx0.c, b2c.n, oq5Var, 0);
            int i4 = oq5Var.P;
            a l = oq5Var.l();
            yci H = vnj.H(oq5Var, q);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a2, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var, i4, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            men.i(i3, oq5Var, null, z);
            fxf.q(z, null, null, oq5Var, i3);
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new yt(z, yciVar2, i, 18);
        }
    }

    public static final void n(eki ekiVar, owu owuVar, boolean z, yci yciVar, hq5 hq5Var, int i) {
        int i2;
        boolean z2;
        ekiVar.getClass();
        owuVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1864452935);
        if ((i & 6) == 0) {
            i2 = (oq5Var.f(ekiVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.h(owuVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.g(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var.f(yciVar) ? 2048 : 1024;
        }
        if ((i2 & 1171) == 1170 && oq5Var.z()) {
            oq5Var.S();
        } else {
            yci q = androidx.compose.foundation.layout.a.q(yciVar, 0.0f, 0.0f, 0.0f, 4, 7);
            ta5 a2 = sa5.a(qx0.c, b2c.n, oq5Var, 0);
            int i3 = oq5Var.P;
            a l = oq5Var.l();
            yci H = vnj.H(oq5Var, q);
            xp5.T.getClass();
            grb grbVar = wp5.b;
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
            g0g.U(oq5Var, H, wp5.d);
            men.h(R.string.listening_history_context_wave, 0, 2, oq5Var, null);
            boolean z3 = (i2 & 14) == 4;
            Object K = oq5Var.K();
            if (z3 || K == gq5.a) {
                K = ekiVar.b;
                oq5Var.k0(K);
            }
            klu kluVar = (klu) K;
            if (!z || kluVar == null) {
                oq5Var.Z(1104107745);
                int i4 = i2 & 112;
                z2 = true;
                fxf.p(ekiVar.a, owuVar, null, null, false, null, oq5Var, i4, 60);
                oq5Var = oq5Var;
                oq5Var.p(false);
            } else {
                oq5Var.Z(1103916909);
                vwb.E(kluVar, owuVar, null, e9g.a, oq5Var, (i2 & 112) | 3072, 4);
                oq5Var.p(false);
                z2 = true;
            }
            oq5Var.p(z2);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new pp((Object) ekiVar, (Object) owuVar, z, (Object) yciVar, i, 17);
        }
    }

    public static final void o(Function0 function0, hq5 hq5Var, int i) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(2075116886);
        int i2 = (oq5Var.h(function0) ? 4 : 2) | i;
        if ((i2 & 3) == 2 && oq5Var.z()) {
            oq5Var.S();
        } else {
            yci c = d.c(vci.a, 1.0f);
            kfh d = ug3.d(b2c.f, false);
            int i3 = oq5Var.P;
            a l = oq5Var.l();
            yci H = vnj.H(oq5Var, c);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, d, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var, i3, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            neg.u(oq5Var).c.invoke(function0, oq5Var, Integer.valueOf(i2 & 14));
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new xtp(function0, i, 13);
        }
    }

    public static final void p(j1w j1wVar, rxv rxvVar, d8t d8tVar, yci yciVar, hq5 hq5Var, int i) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(706481498);
        int i2 = i | (oq5Var.f(j1wVar) ? 4 : 2) | (oq5Var.f(rxvVar) ? 32 : 16) | (oq5Var.f(d8tVar) ? 256 : 128) | (oq5Var.f(yciVar) ? 2048 : 1024);
        if ((i2 & 1171) == 1170 && oq5Var.z()) {
            oq5Var.S();
        } else {
            q5g.k(yciVar, null, 0L, 0L, null, 0.0f, ild.C(42373526, new kws(22, j1wVar, rxvVar, d8tVar), oq5Var), oq5Var, ((i2 >> 9) & 14) | ScreenMirroringConfig.Video.BITRATE_1_5MB, 62);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new mqr(i, 14, j1wVar, rxvVar, d8tVar, yciVar);
        }
    }

    public static final void q(j1w j1wVar, rxv rxvVar, yci yciVar, hq5 hq5Var, int i) {
        yci yciVar2;
        j1w j1wVar2 = j1wVar;
        j1wVar2.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1855938471);
        if (((i | (oq5Var.f(j1wVar2) ? 4 : 2) | (oq5Var.f(rxvVar) ? 32 : 16) | 384) & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
            yciVar2 = yciVar;
        } else {
            aqi O = gld.O(j1wVar2.b, oq5Var);
            d8t e = i8t.e((h1w) O.getValue(), "wizard screen transition", oq5Var, 48, 0);
            oct octVar = azt.a;
            h1w h1wVar = (h1w) e.c();
            oq5Var.Z(960639847);
            d1w d1wVar = d1w.a;
            float f = Intrinsics.d(h1wVar, d1wVar) ? 1.0f : 0.0f;
            oq5Var.p(false);
            Float valueOf = Float.valueOf(f);
            h1w h1wVar2 = (h1w) e.d.getValue();
            oq5Var.Z(960639847);
            float f2 = Intrinsics.d(h1wVar2, d1wVar) ? 1.0f : 0.0f;
            oq5Var.p(false);
            Float valueOf2 = Float.valueOf(f2);
            x7t f3 = e.f();
            f3.getClass();
            oq5Var.Z(-835376956);
            wdc S = Intrinsics.d(f3.b(), e1w.a) ? weo.S(2000, 0, null, 6) : weo.Q(0.0f, 200.0f, null, 5);
            oq5Var.p(false);
            z7t c = i8t.c(e, valueOf, valueOf2, S, octVar, oq5Var, 196608);
            vci vciVar = vci.a;
            yci a2 = androidx.compose.ui.platform.a.a(vciVar, "wizard_screen");
            pli pliVar = new pli(c, O, j1wVar2, rxvVar, e, 29);
            j1wVar2 = j1wVar2;
            List h = u75.h(ild.C(-1127841752, pliVar, oq5Var), ild.C(-479614295, new kws(19, c, j1wVar2, e), oq5Var));
            boolean f4 = oq5Var.f(c) | oq5Var.f(e);
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (f4 || K == kjnVar) {
                K = new fzv(c, e);
                oq5Var.k0(K);
            }
            ggi ggiVar = (ggi) K;
            wn5 o = ghh.o(h);
            boolean f5 = oq5Var.f(ggiVar);
            Object K2 = oq5Var.K();
            if (f5 || K2 == kjnVar) {
                K2 = new hgi(ggiVar);
                oq5Var.k0(K2);
            }
            kfh kfhVar = (kfh) K2;
            int i2 = oq5Var.P;
            a l = oq5Var.l();
            yci H = vnj.H(oq5Var, a2);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, kfhVar, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i2))) {
                ouj.x(i2, oq5Var, i2, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            o.invoke(oq5Var, 0);
            oq5Var.p(true);
            yciVar2 = vciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new kws(j1wVar2, rxvVar, yciVar2, i, 20);
        }
    }

    public static final void r(j1w j1wVar, d8t d8tVar, yci yciVar, hq5 hq5Var, int i) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(402517600);
        int i2 = i | (oq5Var.f(j1wVar) ? 4 : 2) | (oq5Var.f(d8tVar) ? 32 : 16) | (oq5Var.f(yciVar) ? 256 : 128);
        if ((i2 & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
        } else {
            boolean z = d8tVar.g.h() != Long.MIN_VALUE;
            x6k x6kVar = d8tVar.d;
            boolean g = oq5Var.g(z);
            Object K = oq5Var.K();
            if (g || K == gq5.a) {
                K = szf.g0(Intrinsics.d(x6kVar.getValue(), d1w.a) ? (h1w) d8tVar.c() : (h1w) x6kVar.getValue());
                oq5Var.k0(K);
            }
            q5g.k(yciVar, null, 0L, 0L, null, 0.0f, ild.C(-644094820, new u0v(15, j1wVar, (aqi) K), oq5Var), oq5Var, ((i2 >> 6) & 14) | ScreenMirroringConfig.Video.BITRATE_1_5MB, 62);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new kws(j1wVar, d8tVar, yciVar, i, 21);
        }
    }

    public static final qne s(rfk rfkVar, boolean z) {
        rfkVar.getClass();
        if (rfkVar instanceof ffk) {
            return gut.j1(yfk.EXISTING_CARD, z);
        }
        if (rfkVar instanceof mfk) {
            return gut.j1(yfk.SBP_TOKEN, z);
        }
        if (rfkVar instanceof pfk) {
            return gut.j1(yfk.YANDEX_BANK, z);
        }
        if (rfkVar.equals(gfk.a)) {
            return gut.j1(yfk.CASH, z);
        }
        if (rfkVar.equals(ifk.a)) {
            return gut.j1(yfk.GOOGLE_PAY, z);
        }
        if (rfkVar.equals(jfk.a)) {
            return gut.j1(yfk.NEW_CARD, z);
        }
        if (rfkVar.equals(lfk.a)) {
            return gut.j1(yfk.SBP, z);
        }
        if (rfkVar.equals(kfk.a)) {
            return gut.j1(yfk.NEW_SBP_TOKEN, z);
        }
        if (rfkVar.equals(ofk.a)) {
            xq0.q("TinkoffCredit not supported");
            return null;
        }
        if (rfkVar.equals(nfk.a)) {
            xq0.q("split not supported");
            return null;
        }
        if (rfkVar.equals(hfk.a)) {
            xq0.q("ChallengePollingMethod not supported");
            return null;
        }
        b6e.s();
        return null;
    }

    public static final tdk t(sdk sdkVar) {
        sdkVar.getClass();
        tdk tdkVar = sdkVar instanceof tdk ? (tdk) sdkVar : null;
        if (tdkVar != null) {
            return tdkVar;
        }
        wvs.p("Incorrect PaymentApi provided");
        return null;
    }

    public static final Object u(Object obj) {
        if (obj instanceof z7o) {
            return ((z7o) obj).a;
        }
        r7o r7oVar = z7o.b;
        return obj;
    }

    public static final ohp v(String str, mhp[] mhpVarArr, Function1 function1) {
        if (StringsKt.U(str)) {
            xq0.x("Blank serial names are prohibited");
            return null;
        }
        mm4 mm4Var = new mm4(str);
        function1.invoke(mm4Var);
        return new ohp(str, emr.b, mm4Var.c.size(), xz0.X(mhpVarArr), mm4Var);
    }

    public static ohp w(String str, mhp[] mhpVarArr) {
        if (StringsKt.U(str)) {
            xq0.x("Blank serial names are prohibited");
            return null;
        }
        mm4 mm4Var = new mm4(str);
        return new ohp(str, emr.b, mm4Var.c.size(), xz0.X(mhpVarArr), mm4Var);
    }

    public static final ohp x(String str, ivf ivfVar, mhp[] mhpVarArr, Function1 function1) {
        if (StringsKt.U(str)) {
            xq0.x("Blank serial names are prohibited");
            return null;
        }
        if (ivfVar.equals(emr.b)) {
            xq0.x("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
            return null;
        }
        mm4 mm4Var = new mm4(str);
        function1.invoke(mm4Var);
        return new ohp(str, ivfVar, mm4Var.c.size(), xz0.X(mhpVarArr), mm4Var);
    }

    public static ohp y(String str, ivf ivfVar, mhp[] mhpVarArr) {
        if (StringsKt.U(str)) {
            xq0.x("Blank serial names are prohibited");
            return null;
        }
        if (ivfVar.equals(emr.b)) {
            xq0.x("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
            return null;
        }
        mm4 mm4Var = new mm4(str);
        return new ohp(str, ivfVar, mm4Var.c.size(), xz0.X(mhpVarArr), mm4Var);
    }

    public static final String z(String str) {
        String valueOf;
        if (str == null || str.length() == 0) {
            xq0.x("Cannot capitalize empty string.");
            return null;
        }
        if (str.length() <= 0) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        char charAt = str.charAt(0);
        if (Character.isLowerCase(charAt)) {
            Locale locale = Locale.US;
            locale.getClass();
            valueOf = CharsKt.e(charAt, locale);
        } else {
            valueOf = String.valueOf(charAt);
        }
        sb.append((Object) valueOf);
        sb.append(str.substring(1));
        return sb.toString();
    }
}
