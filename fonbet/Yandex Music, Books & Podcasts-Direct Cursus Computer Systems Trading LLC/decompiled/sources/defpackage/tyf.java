package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import android.view.View;
import androidx.compose.runtime.internal.a;
import com.connectsdk.service.airplay.PListParser;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.yandex.music.shared.dto.domainitem.AlbumDomainItemDto;
import com.yandex.music.shared.dto.domainitem.ArtistDomainItemDto;
import com.yandex.music.shared.dto.domainitem.BlockActionDto;
import com.yandex.music.shared.dto.domainitem.EntityCoverDto;
import com.yandex.music.shared.dto.domainitem.PlaylistDomainItemDto;
import com.yandex.music.shared.dto.mix.MixEntityDataDto;
import com.yandex.music.shared.dto.playlist.chart.ChartPositionInfoDto;
import com.yandex.music.shared.dto.trailer.TrailerDto;
import com.yandex.music.shared.dto.universalentities.AlbumEntityDto;
import com.yandex.music.shared.dto.universalentities.AlbumWithArtistsEntityDataDto;
import com.yandex.music.shared.dto.universalentities.ArtistEntityDataDto;
import com.yandex.music.shared.dto.universalentities.ArtistEntityDto;
import com.yandex.music.shared.dto.universalentities.ChartAlbumEntityDataDto;
import com.yandex.music.shared.dto.universalentities.ChartAlbumEntityDto;
import com.yandex.music.shared.dto.universalentities.LikedAlbumEntityDataDto;
import com.yandex.music.shared.dto.universalentities.LikedAlbumEntityDto;
import com.yandex.music.shared.dto.universalentities.LikedPlaylistEntityDataDto;
import com.yandex.music.shared.dto.universalentities.LikedPlaylistEntityDto;
import com.yandex.music.shared.dto.universalentities.MixEntityDto;
import com.yandex.music.shared.dto.universalentities.NonMusicEntityDataDto;
import com.yandex.music.shared.dto.universalentities.NonMusicEntityDto;
import com.yandex.music.shared.dto.universalentities.PersonalPlaylistEntityDataDto;
import com.yandex.music.shared.dto.universalentities.PersonalPlaylistEntityDto;
import com.yandex.music.shared.dto.universalentities.PlaylistEntityDataDto;
import com.yandex.music.shared.dto.universalentities.PlaylistEntityDto;
import com.yandex.music.shared.dto.universalentities.UniversalEntityDto;
import com.yandex.music.shared.dto.universalentities.WaveAgentDto;
import com.yandex.music.shared.dto.videoclip.VideoClipDto;
import com.yandex.music.shared.dto.wave.AgentDto;
import com.yandex.music.shared.dto.wave.NewWaveModelDto;
import com.yandex.music.shared.dto.wave.NewWaveModelWithAgentDto;
import com.yandex.music.shared.radio.data.network.rotor.dto.VideoClipSequenceItemDto$VideoClip;
import com.yandex.music.shared.utils.assertions.Assertions;
import com.yandex.music.shared.utils.assertions.FailedAssertionException;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.RejectedExecutionException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.yandex.music.R;

/* loaded from: classes.dex */
public abstract class tyf {
    public static final boolean A(int i) {
        return View.MeasureSpec.getMode(i) == 1073741824;
    }

    public static final boolean B(float[] fArr) {
        return fArr.length >= 16 && fArr[0] == 1.0f && fArr[1] == 0.0f && fArr[2] == 0.0f && fArr[3] == 0.0f && fArr[4] == 0.0f && fArr[5] == 1.0f && fArr[6] == 0.0f && fArr[7] == 0.0f && fArr[8] == 0.0f && fArr[9] == 0.0f && fArr[10] == 1.0f && fArr[11] == 0.0f && fArr[12] == 0.0f && fArr[13] == 0.0f && fArr[14] == 0.0f && fArr[15] == 1.0f;
    }

    public static final void C(Context context) {
        context.getClass();
        File databasePath = context.getDatabasePath("androidx.work.workdb");
        databasePath.getClass();
        if (databasePath.exists()) {
            jsg.j().e(u3w.a, "Migrating WorkDatabase to the no-backup directory");
            File databasePath2 = context.getDatabasePath("androidx.work.workdb");
            databasePath2.getClass();
            File noBackupFilesDir = context.getNoBackupFilesDir();
            noBackupFilesDir.getClass();
            String[] strArr = u3w.b;
            int a = tah.a(strArr.length);
            if (a < 16) {
                a = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(a);
            for (String str : strArr) {
                linkedHashMap.put(new File(databasePath2.getPath() + str), new File(noBackupFilesDir.getPath() + str));
            }
            for (Map.Entry entry : uah.j(linkedHashMap, new Pair(databasePath2, noBackupFilesDir)).entrySet()) {
                File file = (File) entry.getKey();
                File file2 = (File) entry.getValue();
                if (file.exists()) {
                    if (file2.exists()) {
                        jsg.j().o(u3w.a, "Over-writing contents of " + file2);
                    }
                    jsg.j().e(u3w.a, file.renameTo(file2) ? "Migrated " + file + "to " + file2 : "Renaming " + file + " to " + file2 + " failed");
                }
            }
        }
    }

    public static final long D(float f, long j) {
        return (Float.isNaN(f) || f >= 1.0f) ? j : d85.b(j, d85.d(j) * f, 0.0f, 0.0f, 0.0f, 14);
    }

    public static final List E(String str, List list) {
        str.getClass();
        if (list != null) {
            ArrayList O = CollectionsKt.O(list);
            if (O.size() != list.size()) {
                O = null;
            }
            if (O != null) {
                ArrayList t = t(O);
                int indexOf = list.indexOf(str);
                if (indexOf == -1) {
                    Assertions.throwOrSkip$default(new FailedAssertionException("Station id " + str + " not found in seeds " + list), null, 2, null);
                    pz0 pz0Var = new pz0(2);
                    pz0Var.b(str);
                    pz0Var.c(t.toArray(new String[0]));
                    ArrayList arrayList = pz0Var.a;
                    return u75.h(arrayList.toArray(new String[arrayList.size()]));
                }
                if (indexOf == 0) {
                    return t;
                }
                pz0 pz0Var2 = new pz0(2);
                pz0Var2.b(str);
                ArrayList arrayList2 = new ArrayList();
                Iterator it = t.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (!Intrinsics.d((String) next, str)) {
                        arrayList2.add(next);
                    }
                }
                pz0Var2.c(arrayList2.toArray(new String[0]));
                ArrayList arrayList3 = pz0Var2.a;
                return u75.h(arrayList3.toArray(new String[arrayList3.size()]));
            }
        }
        return null;
    }

    public static final Object F(yis yisVar, Function2 function2) {
        saf.W(yisVar, true, new xa8(0, y2x.v(yisVar.d.getContext()).S(yisVar.e, yisVar, yisVar.c)));
        return swf.l0(yisVar, false, yisVar, function2);
    }

    public static final v7u G(n9u n9uVar) {
        x1u p0;
        if (n9uVar instanceof VideoClipSequenceItemDto$VideoClip) {
            VideoClipDto videoClipDto = ((VideoClipSequenceItemDto$VideoClip) n9uVar).getVideoClipDto();
            if (videoClipDto == null || (p0 = o2g.p0(videoClipDto)) == null) {
                return null;
            }
            return new v7u(new y1u(new tfn(p0.a), p0, wmn.b), n9uVar.a);
        }
        if (n9uVar instanceof m9u) {
            su4.s(2, null, "Unsupported item type ".concat(n9uVar.a), null);
            return null;
        }
        b6e.s();
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final yit H(UniversalEntityDto universalEntityDto) {
        NewWaveModelDto wave;
        dou a;
        AgentDto agentDto;
        np E;
        String id;
        String title;
        BlockActionDto action;
        String deeplink;
        AlbumDomainItemDto album;
        lt J;
        AlbumDomainItemDto album2;
        lt J2;
        int intValue;
        Boolean available;
        AlbumDomainItemDto album3;
        lt J3;
        ChartPositionInfoDto chart;
        lf4 K;
        Integer likesCount;
        Boolean available2;
        PlaylistDomainItemDto playlist;
        eul H;
        String playlistType;
        Boolean available3;
        PlaylistDomainItemDto playlist2;
        eul H2;
        Boolean available4;
        PlaylistDomainItemDto playlist3;
        eul H3;
        Boolean available5;
        ArtistDomainItemDto artist;
        u51 K2;
        Boolean available6;
        AlbumDomainItemDto album4;
        lt J4;
        List<ArtistDomainItemDto> artists;
        Boolean available7;
        boolean z = false;
        u9b u9bVar = null;
        c5b c5bVar = null;
        u9bVar = null;
        if (universalEntityDto instanceof AlbumEntityDto) {
            AlbumWithArtistsEntityDataDto data = ((AlbumEntityDto) universalEntityDto).getData();
            if (data != null && (album4 = data.getAlbum()) != null && (J4 = xee.J(album4)) != null && (artists = data.getArtists()) != null) {
                ArrayList arrayList = new ArrayList();
                for (ArtistDomainItemDto artistDomainItemDto : artists) {
                    u51 K3 = artistDomainItemDto != null ? ltg.K(artistDomainItemDto) : null;
                    if (K3 != null) {
                        arrayList.add(K3);
                    }
                }
                TrailerDto trailer = data.getTrailer();
                if (trailer != null && (available7 = trailer.getAvailable()) != null) {
                    z = available7.booleanValue();
                }
                return new o20(J4, arrayList, z);
            }
        } else if (universalEntityDto instanceof ArtistEntityDto) {
            ArtistEntityDataDto data2 = ((ArtistEntityDto) universalEntityDto).getData();
            if (data2 != null && (artist = data2.getArtist()) != null && (K2 = ltg.K(artist)) != null) {
                TrailerDto trailer2 = data2.getTrailer();
                if (trailer2 != null && (available6 = trailer2.getAvailable()) != null) {
                    z = available6.booleanValue();
                }
                return new hm1(K2, z);
            }
        } else if (universalEntityDto instanceof PlaylistEntityDto) {
            PlaylistEntityDataDto data3 = ((PlaylistEntityDto) universalEntityDto).getData();
            if (data3 != null && (playlist3 = data3.getPlaylist()) != null && (H3 = neg.H(playlist3)) != null) {
                TrailerDto trailer3 = data3.getTrailer();
                if (trailer3 != null && (available5 = trailer3.getAvailable()) != null) {
                    z = available5.booleanValue();
                }
                return new s3m(H3, z);
            }
        } else if (universalEntityDto instanceof LikedPlaylistEntityDto) {
            LikedPlaylistEntityDataDto data4 = ((LikedPlaylistEntityDto) universalEntityDto).getData();
            if (data4 != null && (playlist2 = data4.getPlaylist()) != null && (H2 = neg.H(playlist2)) != null) {
                Integer likesCount2 = data4.getLikesCount();
                intValue = likesCount2 != null ? likesCount2.intValue() : -1;
                TrailerDto trailer4 = data4.getTrailer();
                if (trailer4 != null && (available4 = trailer4.getAvailable()) != null) {
                    z = available4.booleanValue();
                }
                return new a2g(H2, intValue, z);
            }
        } else if (universalEntityDto instanceof PersonalPlaylistEntityDto) {
            PersonalPlaylistEntityDataDto data5 = ((PersonalPlaylistEntityDto) universalEntityDto).getData();
            if (data5 != null && (playlist = data5.getPlaylist()) != null && (H = neg.H(playlist)) != null && (playlistType = data5.getPlaylistType()) != null) {
                String description = data5.getDescription();
                Boolean notify = data5.getNotify();
                boolean booleanValue = notify != null ? notify.booleanValue() : false;
                String idForFrom = data5.getIdForFrom();
                TrailerDto trailer5 = data5.getTrailer();
                if (trailer5 != null && (available3 = trailer5.getAvailable()) != null) {
                    z = available3.booleanValue();
                }
                return new umk(H, playlistType, description, booleanValue, idForFrom, z);
            }
        } else if (universalEntityDto instanceof ChartAlbumEntityDto) {
            ChartAlbumEntityDataDto data6 = ((ChartAlbumEntityDto) universalEntityDto).getData();
            if (data6 != null && (album3 = data6.getAlbum()) != null && (J3 = xee.J(album3)) != null && (chart = data6.getChart()) != null && (K = wct.K(chart)) != null && (likesCount = data6.getLikesCount()) != null) {
                int intValue2 = likesCount.intValue();
                TrailerDto trailer6 = data6.getTrailer();
                if (trailer6 != null && (available2 = trailer6.getAvailable()) != null) {
                    z = available2.booleanValue();
                }
                return new te4(J3, intValue2, K, z);
            }
        } else if (universalEntityDto instanceof LikedAlbumEntityDto) {
            LikedAlbumEntityDataDto data7 = ((LikedAlbumEntityDto) universalEntityDto).getData();
            if (data7 != null && (album2 = data7.getAlbum()) != null && (J2 = xee.J(album2)) != null) {
                Integer likesCount3 = data7.getLikesCount();
                intValue = likesCount3 != null ? likesCount3.intValue() : -1;
                TrailerDto trailer7 = data7.getTrailer();
                if (trailer7 != null && (available = trailer7.getAvailable()) != null) {
                    z = available.booleanValue();
                }
                return new r1g(J2, intValue, z);
            }
        } else if (universalEntityDto instanceof NonMusicEntityDto) {
            NonMusicEntityDataDto data8 = ((NonMusicEntityDto) universalEntityDto).getData();
            if (data8 != null && (album = data8.getAlbum()) != null && (J = xee.J(album)) != null) {
                List<ArtistDomainItemDto> artists2 = data8.getArtists();
                if (artists2 != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (ArtistDomainItemDto artistDomainItemDto2 : artists2) {
                        u51 K4 = artistDomainItemDto2 != null ? ltg.K(artistDomainItemDto2) : null;
                        if (K4 != null) {
                            arrayList2.add(K4);
                        }
                    }
                    c5bVar = arrayList2;
                }
                if (c5bVar == null) {
                    c5bVar = c5b.a;
                }
                Integer likesCount4 = data8.getLikesCount();
                return new fej(J, c5bVar, likesCount4 != null ? likesCount4.intValue() : -1, data8.getYandexBooksOptionRequired());
            }
        } else if (universalEntityDto instanceof MixEntityDto) {
            MixEntityDataDto data9 = ((MixEntityDto) universalEntityDto).getData();
            if (data9 != null && (id = data9.getId()) != null && (title = data9.getTitle()) != null && (action = data9.getAction()) != null && (deeplink = action.getDeeplink()) != null) {
                List covers = data9.getCovers();
                if (covers != null) {
                    Iterator it = covers.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        EntityCoverDto entityCoverDto = (EntityCoverDto) it.next();
                        u9b V = entityCoverDto != null ? c3x.V(entityCoverDto) : null;
                        if (V != null) {
                            u9bVar = V;
                            break;
                        }
                    }
                }
                return new e6i(id, title, deeplink, u9bVar);
            }
        } else {
            if (!(universalEntityDto instanceof WaveAgentDto)) {
                b6e.s();
                return null;
            }
            NewWaveModelWithAgentDto data10 = ((WaveAgentDto) universalEntityDto).getData();
            if (data10 != null && (wave = data10.getWave()) != null && (a = wave.a()) != null && (agentDto = data10.getAgentDto()) != null && (E = w1g.E(agentDto)) != null) {
                return new llu(a, E);
            }
        }
        return null;
    }

    public static dqj I(rrf rrfVar, Function1 function1, s8i s8iVar, int i) {
        if ((i & 1) != 0) {
            function1 = new hpj(1);
        }
        Function1 function12 = function1;
        Function1 function13 = s8iVar;
        if ((i & 2) != 0) {
            function13 = new hpj(2);
        }
        return new dqj(rrfVar, function12, function13, new s9j(9), new s9j(10));
    }

    public static final Object J(long j, Function2 function2, cg6 cg6Var) {
        if (j <= 0) {
            throw new wis("Timed out immediately", null);
        }
        Object F = F(new yis(j, cg6Var), function2);
        nm6 nm6Var = nm6.a;
        return F;
    }

    public static final Object K(long j, Function2 function2, cg6 cg6Var) {
        return J(y2x.c0(j), function2, cg6Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005c A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object L(long j, Function2 function2, Continuation continuation) {
        zis zisVar;
        int i;
        xqn xqnVar;
        if (continuation instanceof zis) {
            zisVar = (zis) continuation;
            int i2 = zisVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zisVar.l = i2 - Integer.MIN_VALUE;
                Object obj = zisVar.k;
                nm6 nm6Var = nm6.a;
                i = zisVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    if (j <= 0) {
                        return null;
                    }
                    xqn xqnVar2 = new xqn();
                    try {
                        zisVar.j = xqnVar2;
                        zisVar.l = 1;
                        yis yisVar = new yis(j, zisVar);
                        xqnVar2.a = yisVar;
                        Object F = F(yisVar, function2);
                        return F == nm6Var ? nm6Var : F;
                    } catch (wis e) {
                        e = e;
                        xqnVar = xqnVar2;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    xqnVar = zisVar.j;
                    try {
                        qgg.h0(obj);
                        return obj;
                    } catch (wis e2) {
                        e = e2;
                    }
                }
                if (e.a != xqnVar.a) {
                    return null;
                }
                throw e;
            }
        }
        zisVar = new zis(continuation);
        Object obj2 = zisVar.k;
        nm6 nm6Var2 = nm6.a;
        i = zisVar.l;
        if (i != 0) {
        }
        if (e.a != xqnVar.a) {
        }
    }

    public static final Object M(long j, Function2 function2, cg6 cg6Var) {
        return L(y2x.c0(j), function2, cg6Var);
    }

    public static final Object N(ueo ueoVar, Function1 function1, Continuation continuation) {
        return O(ueoVar, new w90(ueoVar, function1, (Continuation) null), continuation);
    }

    public static final Object O(ueo ueoVar, Function1 function1, Continuation continuation) {
        qhp qhpVar;
        veo veoVar = new veo(function1, null, 0);
        m6t m6tVar = (m6t) continuation.getContext().get(m6t.b);
        d dVar = m6tVar != null ? m6tVar.a : null;
        if (dVar != null) {
            return x97.V(dVar, veoVar, continuation);
        }
        zt3 zt3Var = new zt3(1, qxe.b(continuation));
        zt3Var.s();
        try {
            qhpVar = ueoVar.e;
        } catch (RejectedExecutionException e) {
            zt3Var.h(new IllegalStateException("Unable to acquire a thread to perform the database transaction.", e));
        }
        if (qhpVar == null) {
            Intrinsics.j("internalTransactionExecutor");
            throw null;
        }
        qhpVar.execute(new nud(zt3Var, ueoVar, veoVar, false, 17));
        Object q = zt3Var.q();
        nm6 nm6Var = nm6.a;
        return q;
    }

    public static void P(int i, int i2) {
        String f0;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                f0 = wyf.f0("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    xq0.x(k5r.i(i2, "negative size: "));
                    return;
                }
                f0 = wyf.f0("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(f0);
        }
    }

    public static void Q(int i, int i2) {
        if (i < 0 || i > i2) {
            e7o.o(S(i, i2, "index"));
        }
    }

    public static void R(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            throw new IndexOutOfBoundsException((i < 0 || i > i3) ? S(i, i3, "start index") : (i2 < 0 || i2 > i3) ? S(i2, i3, "end index") : wyf.f0("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i)));
        }
    }

    public static String S(int i, int i2, String str) {
        if (i < 0) {
            return wyf.f0("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return wyf.f0("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        xq0.x(k5r.i(i2, "negative size: "));
        return null;
    }

    public static final void a(g1r g1rVar, yci yciVar, hq5 hq5Var, int i) {
        boolean z;
        wn5 wn5Var = vo5.a;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(2036134589);
        int i2 = (i & 6) == 0 ? ((i & 8) == 0 ? oq5Var.f(g1rVar) : oq5Var.h(g1rVar) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= oq5Var.f(yciVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.h(wn5Var) ? 256 : 128;
        }
        boolean z2 = true;
        if (oq5Var.P(i2 & 1, (i2 & 147) != 146)) {
            Object K = oq5Var.K();
            Object obj = K;
            if (K == gq5.a) {
                c4c c4cVar = new c4c();
                c4cVar.a = new Object();
                c4cVar.b = new ArrayList();
                oq5Var.k0(c4cVar);
                obj = c4cVar;
            }
            c4c c4cVar2 = (c4c) obj;
            String I = hyf.I(7, oq5Var);
            Object obj2 = c4cVar2.a;
            ArrayList arrayList = c4cVar2.b;
            if (Intrinsics.d(g1rVar, obj2)) {
                z = true;
                oq5Var.Z(1524617353);
                oq5Var.p(false);
            } else {
                oq5Var.Z(1522020731);
                c4cVar2.a = g1rVar;
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    arrayList2.add((g1r) ((b4c) arrayList.get(i3)).a);
                }
                ArrayList arrayList3 = new ArrayList(arrayList2);
                if (!arrayList3.contains(g1rVar)) {
                    arrayList3.add(g1rVar);
                }
                arrayList.clear();
                ArrayList a = lag.a(arrayList3);
                int size2 = a.size();
                int i4 = 0;
                while (i4 < size2) {
                    g1r g1rVar2 = (g1r) a.get(i4);
                    arrayList.add(new b4c(g1rVar2, ild.C(1471040642, new e1r(g1rVar2, g1rVar, arrayList3, c4cVar2, I), oq5Var)));
                    i4++;
                    z2 = z2;
                }
                z = z2;
                oq5Var.p(false);
            }
            kfh d = ug3.d(b2c.b, false);
            int i5 = oq5Var.P;
            a l = oq5Var.l();
            yci H = vnj.H(oq5Var, yciVar);
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
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i5))) {
                ouj.x(i5, oq5Var, i5, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            xmn x = oq5Var.x();
            if (x == null) {
                xq0.q("no recompose scope found");
                return;
            }
            x.a |= 1;
            c4cVar2.c = x;
            oq5Var.Z(1801449988);
            int size3 = arrayList.size();
            for (int i6 = 0; i6 < size3; i6++) {
                b4c b4cVar = (b4c) arrayList.get(i6);
                g1r g1rVar3 = (g1r) b4cVar.a;
                wn5 wn5Var2 = b4cVar.b;
                oq5Var.W(2123994112, g1rVar3);
                wn5Var2.invoke(ild.C(2041982076, new f1r(g1rVar3, 0), oq5Var), oq5Var, 6);
                oq5Var.p(false);
            }
            oq5Var.p(false);
            oq5Var.p(z);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new kg0(g1rVar, yciVar, i);
        }
    }

    public static final void b(kyf kyfVar, dzf dzfVar, Function0 function0, hq5 hq5Var, int i) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-709389590);
        if (((i | 16 | (oq5Var.h(function0) ? 256 : 128)) & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
        } else {
            oq5Var.U();
            if ((i & 1) == 0 || oq5Var.y()) {
                dzfVar = (dzf) oq5Var.j(ykg.a);
            } else {
                oq5Var.S();
            }
            oq5Var.q();
            if (kyfVar == kyf.ON_DESTROY) {
                xq0.x("LifecycleEventEffect cannot be used to listen for Lifecycle.Event.ON_DESTROY, since Compose disposes of the composition before ON_DESTROY observers are invoked.");
                return;
            }
            aqi o0 = szf.o0(function0, oq5Var);
            boolean f = oq5Var.f(o0) | oq5Var.h(dzfVar);
            Object K = oq5Var.K();
            if (f || K == gq5.a) {
                K = new p3e(4, dzfVar, kyfVar, o0);
                oq5Var.k0(K);
            }
            gld.k(dzfVar, (Function1) K, oq5Var);
        }
        dzf dzfVar2 = dzfVar;
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new v48(kyfVar, dzfVar2, function0, i, 26);
        }
    }

    public static final void c(yci yciVar, hq5 hq5Var, int i) {
        int i2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(93738390);
        if ((i & 6) == 0) {
            i2 = (oq5Var.f(yciVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (oq5Var.P(i2 & 1, (i2 & 3) != 2)) {
            pd.g(0, 0, oq5Var, androidx.compose.foundation.layout.d.x(androidx.compose.foundation.layout.d.d(androidx.compose.foundation.layout.a.m(yciVar, 16), 1.0f), b2c.f, 2));
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new jm0(yciVar, i, 8);
        }
    }

    public static final void d(int i, hq5 hq5Var, yci yciVar, boolean z) {
        int i2;
        boolean z2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1861534467);
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
            z2 = z;
        } else {
            int i3 = i2 & 14;
            yci q = androidx.compose.foundation.layout.a.q(yciVar, 0.0f, 0.0f, 0.0f, 4, 7);
            ta5 a = sa5.a(qx0.c, b2c.n, oq5Var, 0);
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
            g0g.U(oq5Var, a, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var, i4, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            men.i(i3, oq5Var, null, z);
            z2 = z;
            wyf.i(z2, null, null, false, oq5Var, i3, 14);
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new yt(z2, yciVar, i, 13);
        }
    }

    public static final void e(cki ckiVar, Function1 function1, yci yciVar, hq5 hq5Var, int i) {
        int i2;
        ckiVar.getClass();
        function1.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(214974734);
        if ((i & 6) == 0) {
            i2 = (oq5Var.f(ckiVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = 16;
        if ((i & 48) == 0) {
            i2 |= oq5Var.h(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.f(yciVar) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
        } else {
            yci q = androidx.compose.foundation.layout.a.q(yciVar, 0.0f, 0.0f, 0.0f, 4, 7);
            ta5 a = sa5.a(qx0.c, b2c.n, oq5Var, 0);
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
            g0g.U(oq5Var, a, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var, i4, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            men.h(R.string.listening_history_context_playlist, 0, 2, oq5Var, null);
            lwl lwlVar = ckiVar.a;
            boolean z = ((i2 & 112) == 32) | ((i2 & 14) == 4);
            Object K = oq5Var.K();
            if (z || K == gq5.a) {
                K = new iik(i3, function1, ckiVar);
                oq5Var.k0(K);
            }
            wyf.h(lwlVar, (Function0) K, null, 0L, null, null, null, null, oq5Var, 0, 252);
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new erj(ckiVar, function1, yciVar, i, 3);
        }
    }

    public static final void f(final po6 po6Var, final boolean z, final rba rbaVar, final lzs lzsVar, frs frsVar, final boolean z2, final boolean z3, final Function0 function0, final Function0 function02, final Function0 function03, final Function0 function04, final yci yciVar, c0g c0gVar, hq5 hq5Var, final int i, final int i2) {
        int i3;
        boolean z4;
        Function0 function05;
        Function0 function06;
        Function0 function07;
        Function0 function08;
        int i4;
        final frs frsVar2;
        oq5 oq5Var;
        final c0g c0gVar2;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-329175490);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? oq5Var2.f(po6Var) : oq5Var2.h(po6Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= oq5Var2.g(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= oq5Var2.d(rbaVar.ordinal()) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= oq5Var2.d(lzsVar.ordinal()) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= oq5Var2.d(frsVar.ordinal()) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((196608 & i) == 0) {
            z4 = z2;
            i3 |= oq5Var2.g(z4) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        } else {
            z4 = z2;
        }
        if ((1572864 & i) == 0) {
            i3 |= oq5Var2.g(z3) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            function05 = function0;
            i3 |= oq5Var2.h(function05) ? 8388608 : RemoteCameraConfig.Camera.BITRATE;
        } else {
            function05 = function0;
        }
        if ((100663296 & i) == 0) {
            function06 = function02;
            i3 |= oq5Var2.h(function06) ? 67108864 : 33554432;
        } else {
            function06 = function02;
        }
        if ((805306368 & i) == 0) {
            function07 = function03;
            i3 |= oq5Var2.h(function07) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
        } else {
            function07 = function03;
        }
        if ((i2 & 6) == 0) {
            function08 = function04;
            i4 = i2 | (oq5Var2.h(function08) ? 4 : 2);
        } else {
            function08 = function04;
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= oq5Var2.f(yciVar) ? 32 : 16;
        }
        int i5 = i4 | 3456;
        if (oq5Var2.P(i3 & 1, ((306783379 & i3) == 306783378 && (i5 & 1171) == 1170) ? false : true)) {
            c0g c0gVar3 = c0g.a;
            boolean a = frsVar.a();
            zyj b = frsVar.b();
            nxq nxqVar = nxq.b;
            q5t q5tVar = z ? q5t.b : q5t.a;
            agr agrVar = eq0.a;
            int i6 = i3;
            frsVar2 = frsVar;
            int i7 = i6 >> 3;
            int i8 = i6 >> 6;
            oq5Var = oq5Var2;
            qgg.l(b, rbaVar, lzsVar, z4, a, function05, function06, function07, ild.C(-1440629768, new lo6(po6Var, frsVar2, lzsVar), oq5Var2), ild.C(-727431849, new pul(z3, po6Var, a), oq5Var2), yciVar, nxqVar, c0gVar3, q5tVar, null, function08, ((dq0) oq5Var2.j(agrVar)).a.a, ((dq0) oq5Var2.j(agrVar)).a.a, null, null, a, oq5Var, (i8 & 7168) | (i7 & 896) | (i7 & 112) | 905969664 | (i8 & 458752) | (i8 & 3670016) | (i8 & 29360128), ((i5 >> 3) & 14) | 48 | (i5 & 896) | ((i5 << 3) & 57344) | (458752 & (i5 << 15)), 0, 786432);
            c0gVar2 = c0gVar3;
        } else {
            frsVar2 = frsVar;
            oq5Var = oq5Var2;
            oq5Var.S();
            c0gVar2 = c0gVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new Function2() { // from class: lzo
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int R = rvf.R(i | 1);
                    int R2 = rvf.R(i2);
                    tyf.f(po6.this, z, rbaVar, lzsVar, frsVar2, z2, z3, function0, function02, function03, function04, yciVar, c0gVar2, (hq5) obj, R, R2);
                    return Unit.a;
                }
            };
        }
    }

    public static final void g(pzo pzoVar, ozo ozoVar, boolean z, yci yciVar, hq5 hq5Var, int i) {
        Function0 function0;
        ozoVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(67742650);
        int i2 = i | (oq5Var.f(pzoVar) ? 4 : 2) | (oq5Var.f(ozoVar) ? 32 : 16) | (oq5Var.g(z) ? 256 : 128) | (oq5Var.f(yciVar) ? 2048 : 1024);
        if (oq5Var.P(i2 & 1, (i2 & 1171) != 1170)) {
            bg5 bg5Var = ozoVar.a;
            aqi M = gld.M(bg5Var.l(), oq5Var);
            aqi M2 = gld.M(bg5Var.c(), oq5Var);
            aqi M3 = gld.M(bg5Var.h(), oq5Var);
            boolean z2 = ((frs) M3.getValue()) == frs.d;
            po6 po6Var = pzoVar.a;
            boolean z3 = pzoVar.b && z2;
            rba rbaVar = (rba) M.getValue();
            lzs lzsVar = (lzs) M2.getValue();
            frs frsVar = (frs) M3.getValue();
            boolean j = bg5Var.j();
            boolean h = oq5Var.h(bg5Var);
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (h || K == kjnVar) {
                K = new r9n(0, bg5Var, bg5.class, "onClick", "onClick()V", 0, 17);
                oq5Var.k0(K);
            }
            Function0 function02 = (Function0) ((h9f) K);
            boolean h2 = oq5Var.h(bg5Var);
            Object K2 = oq5Var.K();
            if (h2 || K2 == kjnVar) {
                K2 = new r9n(0, bg5Var, bg5.class, "onLongClick", "onLongClick()V", 0, 18);
                oq5Var.k0(K2);
            }
            Function0 function03 = (Function0) ((h9f) K2);
            boolean h3 = oq5Var.h(bg5Var);
            Object K3 = oq5Var.K();
            if (h3 || K3 == kjnVar) {
                K3 = new r9n(0, bg5Var, bg5.class, "onOverflowClick", "onOverflowClick()V", 0, 19);
                oq5Var.k0(K3);
            }
            Function0 function04 = (Function0) ((h9f) K3);
            if (z2) {
                oq5Var.Z(-512298857);
                boolean z4 = (i2 & 112) == 32;
                Object K4 = oq5Var.K();
                if (z4 || K4 == kjnVar) {
                    r9n r9nVar = new r9n(0, ozoVar, ozo.class, "onTrailerClick", "onTrailerClick()V", 0, 20);
                    oq5Var.k0(r9nVar);
                    K4 = r9nVar;
                }
                oq5Var.p(false);
                function0 = (Function0) ((h9f) K4);
            } else {
                oq5Var.Z(-512245010);
                Object K5 = oq5Var.K();
                if (K5 == kjnVar) {
                    K5 = new e5o(12);
                    oq5Var.k0(K5);
                }
                function0 = (Function0) K5;
                oq5Var.p(false);
            }
            f(po6Var, z3, rbaVar, lzsVar, frsVar, j, z, function02, function03, function04, function0, yciVar, null, oq5Var, (i2 << 12) & 3670016, (i2 >> 6) & 112);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new s43((Object) pzoVar, (Object) ozoVar, z, yciVar, i, 21);
        }
    }

    public static final void h(yci yciVar, wn5 wn5Var, hq5 hq5Var, int i) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-2105228848);
        int i2 = (oq5Var.f(yciVar) ? 4 : 2) | i;
        if (oq5Var.P(i2 & 1, (i2 & 19) != 18)) {
            r30 r30Var = r30.k;
            int i3 = oq5Var.P;
            a l = oq5Var.l();
            yci H = vnj.H(oq5Var, yciVar);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, r30Var, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var, i3, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            eta.l(6, wn5Var, oq5Var, true);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new bep(yciVar, wn5Var, i, 1);
        }
    }

    public static final void i(i1r i1rVar, yci yciVar, pyc pycVar, hq5 hq5Var, int i, int i2) {
        int i3;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(431012348);
        if ((i & 6) == 0) {
            i3 = (oq5Var.f(i1rVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= oq5Var.f(yciVar) ? 32 : 16;
        }
        int i5 = i3 | 384;
        if (oq5Var.P(i5 & 1, (i5 & 147) != 146)) {
            if (i4 != 0) {
                yciVar = vci.a;
            }
            pycVar = vo5.a;
            g1r g1rVar = (g1r) i1rVar.b.getValue();
            pb pbVar = (pb) oq5Var.j(es5.a);
            boolean h = oq5Var.h(g1rVar) | oq5Var.h(pbVar);
            Object K = oq5Var.K();
            if (h || K == gq5.a) {
                K = new v0r(g1rVar, pbVar, null, 2);
                oq5Var.k0(K);
            }
            gld.w(oq5Var, g1rVar, (Function2) K);
            a((g1r) i1rVar.b.getValue(), yciVar, oq5Var, i5 & 1008);
        } else {
            oq5Var.S();
        }
        yci yciVar2 = yciVar;
        pyc pycVar2 = pycVar;
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new rj0((Object) i1rVar, yciVar2, (syc) pycVar2, i, i2, 4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void j(boolean z, boolean z2, Function0 function0, yci yciVar, Function0 function02, boolean z3, wn5 wn5Var, hq5 hq5Var, int i, int i2) {
        int i3;
        boolean z4;
        wn5 wn5Var2;
        long j;
        oq5 oq5Var;
        xmn r;
        function0.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-1612899022);
        if ((i & 6) == 0) {
            i3 = (oq5Var2.g(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= oq5Var2.g(z2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= oq5Var2.h(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= oq5Var2.f(yciVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= oq5Var2.h(function02) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        int i4 = i2 & 32;
        if (i4 != 0) {
            i3 |= 196608;
        } else if ((196608 & i) == 0) {
            z4 = z3;
            i3 |= oq5Var2.g(z4) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
            if ((1572864 & i) != 0) {
                wn5Var2 = wn5Var;
                i3 |= oq5Var2.h(wn5Var2) ? 1048576 : 524288;
            } else {
                wn5Var2 = wn5Var;
            }
            if ((599187 & i3) == 599186 || !oq5Var2.z()) {
                boolean z5 = i4 == 0 ? true : z4;
                if (!z || z2) {
                    oq5Var2.Z(487244061);
                    j = ((dq0) oq5Var2.j(eq0.a)).c.c;
                    oq5Var2.p(false);
                } else {
                    oq5Var2.Z(487245149);
                    oq5Var2.p(false);
                    j = d85.m;
                }
                int i5 = i3 << 3;
                oq5Var = oq5Var2;
                sk3.c(z5, ((dq0) oq5Var2.j(eq0.a)).c.c, j, function0, yciVar, wn5Var2, function02, oq5Var, (i5 & 7168) | ((i3 >> 15) & 14) | (57344 & i5) | (458752 & (i3 >> 3)) | ((i3 << 6) & 3670016));
                z4 = z5;
            } else {
                oq5Var2.S();
                oq5Var = oq5Var2;
            }
            r = oq5Var.r();
            if (r == null) {
                r.d = new b9g(z, z2, function0, yciVar, function02, z4, wn5Var, i, i2);
                return;
            }
            return;
        }
        z4 = z3;
        if ((1572864 & i) != 0) {
        }
        if ((599187 & i3) == 599186) {
        }
        if (i4 == 0) {
        }
        if (z) {
        }
        oq5Var2.Z(487244061);
        j = ((dq0) oq5Var2.j(eq0.a)).c.c;
        oq5Var2.p(false);
        int i52 = i3 << 3;
        oq5Var = oq5Var2;
        sk3.c(z5, ((dq0) oq5Var2.j(eq0.a)).c.c, j, function0, yciVar, wn5Var2, function02, oq5Var, (i52 & 7168) | ((i3 >> 15) & 14) | (57344 & i52) | (458752 & (i3 >> 3)) | ((i3 << 6) & 3670016));
        z4 = z5;
        r = oq5Var.r();
        if (r == null) {
        }
    }

    public static final void k(tfv tfvVar, xfv xfvVar, boolean z, hq5 hq5Var, int i) {
        tfvVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1589786312);
        int i2 = (oq5Var.h(tfvVar) ? 4 : 2) | i | (oq5Var.f(xfvVar) ? 32 : 16) | (oq5Var.g(z) ? 256 : 128);
        if ((i2 & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
        } else {
            Object K = oq5Var.K();
            if (K == gq5.a) {
                K = new mfv(tfvVar);
                oq5Var.k0(K);
            }
            hyf.p((mfv) K, xfvVar, z, oq5Var, i2 & 1008);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new oc1(tfvVar, xfvVar, z, i, 24);
        }
    }

    public static final void l(View view) {
        view.getClass();
        xgp a = dhp.a(new pg0(view, null, 1));
        while (a.hasNext()) {
            ArrayList arrayList = w((View) a.next()).a;
            for (int g = u75.g(arrayList); -1 < g; g--) {
                ((ydu) arrayList.get(g)).a.m();
            }
        }
    }

    public static final void m(kxt kxtVar, Object obj) {
        Object obj2;
        boolean z = kxtVar instanceof zwt;
        String str = PListParser.TAG_DICT;
        if (z) {
            zwt zwtVar = (zwt) kxtVar;
            String str2 = zwtVar.b;
            boolean z2 = obj instanceof JSONArray;
            JSONArray jSONArray = (JSONArray) (!z2 ? null : obj);
            if (jSONArray != null) {
                zwtVar.j(jSONArray);
                return;
            }
            if (obj instanceof Double) {
                str = "number";
            } else if (z2) {
                str = PListParser.TAG_ARRAY;
            } else if (!(obj instanceof JSONObject)) {
                str = obj.getClass().getSimpleName().toLowerCase(Locale.ROOT);
                str.getClass();
            }
            wvs.e(2, null, hrg.r("Trying to set value with invalid type (", str, ") to variable ", str2));
            return;
        }
        if (kxtVar instanceof axt) {
            axt axtVar = (axt) kxtVar;
            String str3 = axtVar.b;
            Boolean bool = (Boolean) (!(obj instanceof Boolean) ? null : obj);
            if (bool != null) {
                axtVar.j(bool.booleanValue());
                return;
            }
            if (obj instanceof Double) {
                str = "number";
            } else if (obj instanceof JSONArray) {
                str = PListParser.TAG_ARRAY;
            } else if (!(obj instanceof JSONObject)) {
                str = obj.getClass().getSimpleName().toLowerCase(Locale.ROOT);
                str.getClass();
            }
            wvs.e(2, null, hrg.r("Trying to set value with invalid type (", str, ") to variable ", str3));
            return;
        }
        if (kxtVar instanceof bxt) {
            bxt bxtVar = (bxt) kxtVar;
            String str4 = bxtVar.b;
            Integer num = (Integer) (!(obj instanceof Integer) ? null : obj);
            if (num != null) {
                int intValue = num.intValue();
                new c85(intValue);
                bxtVar.j(intValue);
                return;
            }
            if (obj instanceof Double) {
                str = "number";
            } else if (obj instanceof JSONArray) {
                str = PListParser.TAG_ARRAY;
            } else if (!(obj instanceof JSONObject)) {
                str = obj.getClass().getSimpleName().toLowerCase(Locale.ROOT);
                str.getClass();
            }
            wvs.e(2, null, hrg.r("Trying to set value with invalid type (", str, ") to variable ", str4));
            return;
        }
        if (kxtVar instanceof cxt) {
            cxt cxtVar = (cxt) kxtVar;
            String str5 = cxtVar.b;
            boolean z3 = obj instanceof JSONObject;
            JSONObject jSONObject = (JSONObject) (!z3 ? null : obj);
            if (jSONObject != null) {
                cxtVar.j(jSONObject);
                return;
            }
            if (obj instanceof Double) {
                str = "number";
            } else if (obj instanceof JSONArray) {
                str = PListParser.TAG_ARRAY;
            } else if (!z3) {
                str = obj.getClass().getSimpleName().toLowerCase(Locale.ROOT);
                str.getClass();
            }
            wvs.e(2, null, hrg.r("Trying to set value with invalid type (", str, ") to variable ", str5));
            return;
        }
        if (kxtVar instanceof dxt) {
            dxt dxtVar = (dxt) kxtVar;
            String str6 = dxtVar.b;
            boolean z4 = obj instanceof Double;
            Double d = (Double) (!z4 ? null : obj);
            if (d != null) {
                dxtVar.j(d.doubleValue());
                return;
            }
            if (z4) {
                str = "number";
            } else if (obj instanceof JSONArray) {
                str = PListParser.TAG_ARRAY;
            } else if (!(obj instanceof JSONObject)) {
                str = obj.getClass().getSimpleName().toLowerCase(Locale.ROOT);
                str.getClass();
            }
            wvs.e(2, null, hrg.r("Trying to set value with invalid type (", str, ") to variable ", str6));
            return;
        }
        if (kxtVar instanceof ext) {
            ext extVar = (ext) kxtVar;
            String str7 = extVar.b;
            Long l = (Long) (!(obj instanceof Long) ? null : obj);
            if (l != null) {
                extVar.j(l.longValue());
                return;
            }
            if (obj instanceof Double) {
                str = "number";
            } else if (obj instanceof JSONArray) {
                str = PListParser.TAG_ARRAY;
            } else if (!(obj instanceof JSONObject)) {
                str = obj.getClass().getSimpleName().toLowerCase(Locale.ROOT);
                str.getClass();
            }
            wvs.e(2, null, hrg.r("Trying to set value with invalid type (", str, ") to variable ", str7));
            return;
        }
        if (kxtVar instanceof hxt) {
            String str8 = ((hxt) kxtVar).b;
            String str9 = (String) (!(obj instanceof String) ? null : obj);
            if (str9 != null) {
                kxtVar.g(str9);
                return;
            }
            if (obj instanceof Double) {
                str = "number";
            } else if (obj instanceof JSONArray) {
                str = PListParser.TAG_ARRAY;
            } else if (!(obj instanceof JSONObject)) {
                str = obj.getClass().getSimpleName().toLowerCase(Locale.ROOT);
                str.getClass();
            }
            wvs.e(2, null, hrg.r("Trying to set value with invalid type (", str, ") to variable ", str8));
            return;
        }
        if (kxtVar instanceof ixt) {
            ixt ixtVar = (ixt) kxtVar;
            String str10 = ixtVar.b;
            Uri uri = (Uri) (!(obj instanceof Uri) ? null : obj);
            if (uri != null) {
                ixtVar.j(uri);
                return;
            }
            if (obj instanceof Double) {
                str = "number";
            } else if (obj instanceof JSONArray) {
                str = PListParser.TAG_ARRAY;
            } else if (!(obj instanceof JSONObject)) {
                str = obj.getClass().getSimpleName().toLowerCase(Locale.ROOT);
                str.getClass();
            }
            wvs.e(2, null, hrg.r("Trying to set value with invalid type (", str, ") to variable ", str10));
            return;
        }
        if (kxtVar instanceof gxt) {
            gxt gxtVar = (gxt) kxtVar;
            nx8 nx8Var = gxtVar.c;
            String str11 = gxtVar.b;
            switch (nx8Var.ordinal()) {
                case 0:
                    obj2 = (String) (!(obj instanceof String) ? null : obj);
                    if (obj2 == null) {
                        if (obj instanceof Double) {
                            str = "number";
                        } else if (obj instanceof JSONArray) {
                            str = PListParser.TAG_ARRAY;
                        } else if (!(obj instanceof JSONObject)) {
                            str = obj.getClass().getSimpleName().toLowerCase(Locale.ROOT);
                            str.getClass();
                        }
                        wvs.e(2, null, hrg.r("Trying to set value with invalid type (", str, ") to variable ", str11));
                        return;
                    }
                    break;
                case 1:
                    obj2 = (Long) (!(obj instanceof Long) ? null : obj);
                    if (obj2 == null) {
                        if (obj instanceof Double) {
                            str = "number";
                        } else if (obj instanceof JSONArray) {
                            str = PListParser.TAG_ARRAY;
                        } else if (!(obj instanceof JSONObject)) {
                            str = obj.getClass().getSimpleName().toLowerCase(Locale.ROOT);
                            str.getClass();
                        }
                        wvs.e(2, null, hrg.r("Trying to set value with invalid type (", str, ") to variable ", str11));
                        return;
                    }
                    break;
                case 2:
                    boolean z5 = obj instanceof Double;
                    obj2 = (Double) (!z5 ? null : obj);
                    if (obj2 == null) {
                        if (z5) {
                            str = "number";
                        } else if (obj instanceof JSONArray) {
                            str = PListParser.TAG_ARRAY;
                        } else if (!(obj instanceof JSONObject)) {
                            str = obj.getClass().getSimpleName().toLowerCase(Locale.ROOT);
                            str.getClass();
                        }
                        wvs.e(2, null, hrg.r("Trying to set value with invalid type (", str, ") to variable ", str11));
                        return;
                    }
                    break;
                case 3:
                    obj2 = (Boolean) (!(obj instanceof Boolean) ? null : obj);
                    if (obj2 == null) {
                        if (obj instanceof Double) {
                            str = "number";
                        } else if (obj instanceof JSONArray) {
                            str = PListParser.TAG_ARRAY;
                        } else if (!(obj instanceof JSONObject)) {
                            str = obj.getClass().getSimpleName().toLowerCase(Locale.ROOT);
                            str.getClass();
                        }
                        wvs.e(2, null, hrg.r("Trying to set value with invalid type (", str, ") to variable ", str11));
                        return;
                    }
                    break;
                case 4:
                    obj2 = (vc7) (!(obj instanceof vc7) ? null : obj);
                    if (obj2 == null) {
                        if (obj instanceof Double) {
                            str = "number";
                        } else if (obj instanceof JSONArray) {
                            str = PListParser.TAG_ARRAY;
                        } else if (!(obj instanceof JSONObject)) {
                            str = obj.getClass().getSimpleName().toLowerCase(Locale.ROOT);
                            str.getClass();
                        }
                        wvs.e(2, null, hrg.r("Trying to set value with invalid type (", str, ") to variable ", str11));
                        return;
                    }
                    break;
                case 5:
                    obj2 = (c85) (!(obj instanceof c85) ? null : obj);
                    if (obj2 == null) {
                        if (obj instanceof Double) {
                            str = "number";
                        } else if (obj instanceof JSONArray) {
                            str = PListParser.TAG_ARRAY;
                        } else if (!(obj instanceof JSONObject)) {
                            str = obj.getClass().getSimpleName().toLowerCase(Locale.ROOT);
                            str.getClass();
                        }
                        wvs.e(2, null, hrg.r("Trying to set value with invalid type (", str, ") to variable ", str11));
                        return;
                    }
                    break;
                case 6:
                    obj2 = (lpt) (!(obj instanceof lpt) ? null : obj);
                    if (obj2 == null) {
                        if (obj instanceof Double) {
                            str = "number";
                        } else if (obj instanceof JSONArray) {
                            str = PListParser.TAG_ARRAY;
                        } else if (!(obj instanceof JSONObject)) {
                            str = obj.getClass().getSimpleName().toLowerCase(Locale.ROOT);
                            str.getClass();
                        }
                        wvs.e(2, null, hrg.r("Trying to set value with invalid type (", str, ") to variable ", str11));
                        return;
                    }
                    break;
                case 7:
                    boolean z6 = obj instanceof JSONObject;
                    obj2 = (JSONObject) (!z6 ? null : obj);
                    if (obj2 == null) {
                        if (obj instanceof Double) {
                            str = "number";
                        } else if (obj instanceof JSONArray) {
                            str = PListParser.TAG_ARRAY;
                        } else if (!z6) {
                            str = obj.getClass().getSimpleName().toLowerCase(Locale.ROOT);
                            str.getClass();
                        }
                        wvs.e(2, null, hrg.r("Trying to set value with invalid type (", str, ") to variable ", str11));
                        return;
                    }
                    break;
                case 8:
                    boolean z7 = obj instanceof JSONArray;
                    obj2 = (JSONArray) (!z7 ? null : obj);
                    if (obj2 == null) {
                        if (obj instanceof Double) {
                            str = "number";
                        } else if (z7) {
                            str = PListParser.TAG_ARRAY;
                        } else if (!(obj instanceof JSONObject)) {
                            str = obj.getClass().getSimpleName().toLowerCase(Locale.ROOT);
                            str.getClass();
                        }
                        wvs.e(2, null, hrg.r("Trying to set value with invalid type (", str, ") to variable ", str11));
                        return;
                    }
                    break;
                default:
                    b6e.s();
                    return;
            }
            gxtVar.j(obj2);
        }
    }

    public static final Object n(ueo ueoVar, Function1 function1, Continuation continuation) {
        return (ueoVar.o() && ueoVar.r() && ueoVar.p()) ? function1.invoke(continuation) : continuation.getContext().get(xeo.a) == null ? function1.invoke(continuation) : O(ueoVar, function1, continuation);
    }

    public static nsn p(com.bumptech.glide.a aVar, ArrayList arrayList) {
        Class cls;
        o2o km3Var;
        o2o y23Var;
        r33 r33Var;
        int i;
        String str;
        Class cls2;
        r33 r33Var2 = aVar.a;
        z98 z98Var = aVar.d;
        jld jldVar = aVar.c;
        Context applicationContext = jldVar.getApplicationContext();
        qzc qzcVar = jldVar.h;
        nsn nsnVar = new nsn();
        Class<InputStream> cls3 = InputStream.class;
        jn7 jn7Var = new jn7();
        ik0 ik0Var = nsnVar.g;
        synchronized (ik0Var) {
            ik0Var.a.add(jn7Var);
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 27) {
            fpb fpbVar = new fpb();
            ik0 ik0Var2 = nsnVar.g;
            synchronized (ik0Var2) {
                cls = AssetFileDescriptor.class;
                ik0Var2.a.add(fpbVar);
            }
        } else {
            cls = AssetFileDescriptor.class;
        }
        Resources resources = applicationContext.getResources();
        ArrayList e = nsnVar.e();
        nm3 nm3Var = new nm3(applicationContext, e, r33Var2, z98Var);
        oau oauVar = new oau(r33Var2, new wfl());
        zla zlaVar = new zla(nsnVar.e(), resources.getDisplayMetrics(), r33Var2, z98Var);
        if (i2 < 28 || !((Map) qzcVar.b).containsKey(gld.class)) {
            km3Var = new km3(0, zlaVar);
            y23Var = new y23(2, zlaVar, z98Var);
        } else {
            y23Var = new lm3(1);
            km3Var = new lm3(0);
        }
        if (i2 >= 28) {
            i = i2;
            r33Var = r33Var2;
            nsnVar.d("Animation", InputStream.class, Drawable.class, new kl0(new ll0(e, z98Var), 1));
            nsnVar.d("Animation", ByteBuffer.class, Drawable.class, new kl0(new ll0(e, z98Var), 0));
        } else {
            r33Var = r33Var2;
            i = i2;
        }
        q2o q2oVar = new q2o(applicationContext);
        a33 a33Var = new a33(z98Var);
        j4x j4xVar = new j4x(2);
        bs4 bs4Var = new bs4(24);
        ContentResolver contentResolver = applicationContext.getContentResolver();
        nsnVar.a(ByteBuffer.class, new o6c(16));
        nsnVar.a(InputStream.class, new gao(z98Var));
        nsnVar.d("Bitmap", ByteBuffer.class, Bitmap.class, km3Var);
        nsnVar.d("Bitmap", InputStream.class, Bitmap.class, y23Var);
        String str2 = Build.FINGERPRINT;
        if ("robolectric".equals(str2)) {
            str = str2;
            cls2 = ParcelFileDescriptor.class;
        } else {
            str = str2;
            km3 km3Var2 = new km3(1, zlaVar);
            cls2 = ParcelFileDescriptor.class;
            nsnVar.d("Bitmap", cls2, Bitmap.class, km3Var2);
        }
        nsnVar.d("Bitmap", cls2, Bitmap.class, oauVar);
        r33 r33Var3 = r33Var;
        nsnVar.d("Bitmap", cls, Bitmap.class, new oau(r33Var3, new z7l(7)));
        fs7 fs7Var = fs7.j;
        nsnVar.c(Bitmap.class, Bitmap.class, fs7Var);
        nsnVar.d("Bitmap", Bitmap.class, Bitmap.class, new o9c(1));
        nsnVar.b(Bitmap.class, a33Var);
        nsnVar.d("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new y23(resources, km3Var));
        nsnVar.d("BitmapDrawable", InputStream.class, BitmapDrawable.class, new y23(resources, y23Var));
        nsnVar.d("BitmapDrawable", cls2, BitmapDrawable.class, new y23(resources, oauVar));
        nsnVar.b(BitmapDrawable.class, new le3(r33Var3, a33Var));
        nsnVar.d("Animation", InputStream.class, pcd.class, new jjr(e, nm3Var, z98Var));
        nsnVar.d("Animation", ByteBuffer.class, pcd.class, nm3Var);
        nsnVar.b(pcd.class, new hs4(24));
        nsnVar.c(abr.class, abr.class, fs7Var);
        nsnVar.d("Bitmap", abr.class, Bitmap.class, new km3(2, r33Var3));
        nsnVar.d("legacy_append", Uri.class, Drawable.class, q2oVar);
        nsnVar.d("legacy_append", Uri.class, Bitmap.class, new y23(1, q2oVar, r33Var3));
        nsnVar.h(new qm3(0));
        nsnVar.c(File.class, ByteBuffer.class, new ofc(16));
        int i3 = 23;
        nsnVar.c(File.class, InputStream.class, new bac(new x2i(i3)));
        nsnVar.d("legacy_append", File.class, File.class, new o9c(0));
        nsnVar.c(File.class, cls2, new bac(new rre(i3)));
        nsnVar.c(File.class, File.class, fs7Var);
        nsnVar.h(new wne(z98Var));
        if (!"robolectric".equals(str)) {
            nsnVar.h(new qm3(2));
        }
        me1 me1Var = new me1(applicationContext, 1);
        tc1 tc1Var = new tc1(applicationContext, (byte) 0);
        wnd wndVar = new wnd(applicationContext, 3, false);
        Class cls4 = Integer.TYPE;
        nsnVar.c(cls4, InputStream.class, me1Var);
        nsnVar.c(Integer.class, InputStream.class, me1Var);
        Class cls5 = cls;
        nsnVar.c(cls4, cls5, tc1Var);
        nsnVar.c(Integer.class, cls5, tc1Var);
        nsnVar.c(cls4, Drawable.class, wndVar);
        nsnVar.c(Integer.class, Drawable.class, wndVar);
        nsnVar.c(Uri.class, InputStream.class, new me1(applicationContext, 5));
        nsnVar.c(Uri.class, cls5, new wnd(applicationContext, 7, false));
        sml smlVar = new sml(resources);
        knn knnVar = new knn(2, resources);
        cib cibVar = new cib(27, resources);
        nsnVar.c(Integer.class, Uri.class, smlVar);
        nsnVar.c(cls4, Uri.class, smlVar);
        nsnVar.c(Integer.class, cls5, knnVar);
        nsnVar.c(cls4, cls5, knnVar);
        nsnVar.c(Integer.class, InputStream.class, cibVar);
        nsnVar.c(cls4, InputStream.class, cibVar);
        nsnVar.c(String.class, InputStream.class, new bnd(21));
        nsnVar.c(Uri.class, InputStream.class, new bnd(21));
        nsnVar.c(String.class, InputStream.class, new dml());
        nsnVar.c(String.class, cls2, new jkl());
        nsnVar.c(String.class, cls5, new ujl());
        nsnVar.c(Uri.class, InputStream.class, new qxp(applicationContext.getAssets()));
        nsnVar.c(Uri.class, cls5, new xzi(applicationContext.getAssets()));
        nsnVar.c(Uri.class, InputStream.class, new sg1(applicationContext, 4));
        nsnVar.c(Uri.class, InputStream.class, new pd5(applicationContext, false));
        if (i >= 29) {
            int i4 = 12;
            nsnVar.c(Uri.class, InputStream.class, new e5n(i4, applicationContext, cls3));
            nsnVar.c(Uri.class, cls2, new e5n(i4, applicationContext, cls2));
        }
        nsnVar.c(Uri.class, InputStream.class, new gao(contentResolver));
        nsnVar.c(Uri.class, cls2, new vtm(contentResolver));
        nsnVar.c(Uri.class, cls5, new c5p(10, contentResolver));
        nsnVar.c(Uri.class, InputStream.class, new itk());
        nsnVar.c(URL.class, InputStream.class, new mhm());
        nsnVar.c(Uri.class, File.class, new me1(applicationContext, 3));
        nsnVar.c(old.class, InputStream.class, new qzc(3, (byte) 0));
        nsnVar.c(byte[].class, ByteBuffer.class, new bs4(16));
        nsnVar.c(byte[].class, InputStream.class, new b2c());
        nsnVar.c(Uri.class, Uri.class, fs7Var);
        nsnVar.c(Drawable.class, Drawable.class, fs7Var);
        nsnVar.d("legacy_append", Drawable.class, Drawable.class, new o9c(2));
        nsnVar.i(Bitmap.class, BitmapDrawable.class, new z23(resources, 0));
        nsnVar.i(Bitmap.class, byte[].class, j4xVar);
        nsnVar.i(Drawable.class, byte[].class, new vx6(12, r33Var3, j4xVar, bs4Var));
        nsnVar.i(pcd.class, byte[].class, bs4Var);
        oau oauVar2 = new oau(r33Var3, new ybl());
        nsnVar.d("legacy_append", ByteBuffer.class, Bitmap.class, oauVar2);
        nsnVar.d("legacy_append", ByteBuffer.class, BitmapDrawable.class, new y23(resources, oauVar2));
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            throw hrg.j(it);
        }
        return nsnVar;
    }

    public static void q(String str, String str2, Object obj) {
        String z = z(str);
        if (Log.isLoggable(z, 3)) {
            Log.d(z, String.format(str2, obj));
        }
    }

    public static q13 r(Integer num) {
        return new q13(num, null);
    }

    public static void s(String str, String str2, Exception exc) {
        String z = z(str);
        if (Log.isLoggable(z, 6)) {
            Log.e(z, str2, exc);
        }
    }

    public static final ArrayList t(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            String str = (String) obj;
            int hashCode = str.hashCode();
            if (hashCode != 540830010) {
                if (hashCode != 544875126) {
                    if (hashCode == 2092373168 && str.equals("settingDiversity:default")) {
                    }
                    arrayList2.add(obj);
                } else if (!str.equals("settingMoodEnergy:all")) {
                    arrayList2.add(obj);
                }
            } else if (!str.equals("settingLanguage:any")) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    public static boolean v() {
        return ((Boolean) o5j.e.getValue()).booleanValue();
    }

    public static final bhm w(View view) {
        bhm bhmVar = (bhm) view.getTag(R.id.pooling_container_listener_holder_tag);
        if (bhmVar != null) {
            return bhmVar;
        }
        bhm bhmVar2 = new bhm();
        view.setTag(R.id.pooling_container_listener_holder_tag, bhmVar2);
        return bhmVar2;
    }

    public static SharedPreferences x(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return context.getSharedPreferences("com.google.firebase.messaging", 0);
    }

    public static final s9p y(lwu lwuVar) {
        lwuVar.getClass();
        if (lwuVar.equals(hwu.a)) {
            return null;
        }
        if (lwuVar instanceof jwu) {
            return ((jwu) lwuVar).a().a;
        }
        b6e.s();
        return null;
    }

    public static String z(String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            return "TRuntime.".concat(str);
        }
        String concat = "TRuntime.".concat(str);
        return concat.length() > 23 ? concat.substring(0, 23) : concat;
    }

    public abstract boolean o(pzm pzmVar);

    public abstract Object u(pzm pzmVar);
}
