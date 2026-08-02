package defpackage;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Looper;
import android.os.Trace;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import androidx.compose.foundation.layout.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.media3.exoplayer.ExoPlayer;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import com.yandex.media.ynison.service.f;
import com.yandex.media.ynison.service.i0;
import com.yandex.media.ynison.service.p;
import com.yandex.media.ynison.service.r;
import com.yandex.media.ynison.service.t;
import com.yandex.media.ynison.service.x;
import com.yandex.music.shared.dto.album.AlbumDto;
import com.yandex.music.shared.dto.playlist.PlaylistHeaderDto;
import com.yandex.music.shared.dto.track.TrackDto;
import com.yandex.music.shared.myshelf.data.remote.MyShelfAlbumEntityDto;
import com.yandex.music.shared.myshelf.data.remote.MyShelfBlockDto;
import com.yandex.music.shared.myshelf.data.remote.MyShelfCatalogDto;
import com.yandex.music.shared.myshelf.data.remote.MyShelfEntitiesBlockDto;
import com.yandex.music.shared.myshelf.data.remote.MyShelfEntityDto;
import com.yandex.music.shared.myshelf.data.remote.MyShelfPlaylistEntityDto;
import com.yandex.music.shared.myshelf.data.remote.MyShelfPromotionBlockDto;
import com.yandex.music.shared.myshelf.data.remote.MyShelfTrackEntityDto;
import com.yandex.music.shared.utils.system.a;
import com.yandex.pulse.metrics.o;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
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
import ru.yandex.video.m3.list_player_manager.model.Stream;
import ru.yandex.video.m3.list_player_manager.model.StreamType;

/* loaded from: classes3.dex */
public abstract class y7g {
    public static long a = 0;
    public static Method b = null;
    public static Method c = null;
    public static Method d = null;
    public static String e = "production";

    public static boolean A() {
        return ((i7h) i7h.e.getValue()).h();
    }

    public static final List B(n7q n7qVar) {
        n7qVar.getClass();
        return (List) wdg.A(n7qVar, ovn.h);
    }

    public static final i0 C(x xVar) {
        if (xVar.G()) {
            return xVar.D();
        }
        return null;
    }

    public static p1c D() {
        return new p1c(q1c.t, r1c.a, null, "unavailable", "GooglePay is unavailable");
    }

    public static void E(String str, Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            b6e.q(cause);
            return;
        }
        Log.v("Trace", "Unable to call " + str + " via reflection", exc);
    }

    public static bfk F(String str) {
        return new bfk(zek.a, afk.a, null, null, hrg.q("Internal error, can be used ONLY inside SDK. Reason: \"", str, "\""), null);
    }

    public static final boolean G(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    public static boolean H() {
        if (Build.VERSION.SDK_INT >= 29) {
            return aqs.c();
        }
        try {
            if (b == null) {
                a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) b.invoke(null, Long.valueOf(a))).booleanValue();
        } catch (Exception e2) {
            E("isTagEnabled", e2);
            return false;
        }
    }

    public static final thj I(int i, int i2, String str) {
        str.getClass();
        return new thj(pkb.Link, str, i + 1, i2 + 1, "");
    }

    public static final nyn J(nyn nynVar, o4q o4qVar) {
        nynVar.getClass();
        o4qVar.getClass();
        int ordinal = nynVar.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return nyn.a;
            }
            if (ordinal == 2) {
                return nyn.b;
            }
            b6e.s();
            return null;
        }
        int ordinal2 = o4qVar.ordinal();
        if (ordinal2 == 0) {
            return nyn.b;
        }
        if (ordinal2 == 1) {
            return nyn.c;
        }
        b6e.s();
        return null;
    }

    public static final void K(NotificationManager notificationManager, int i, Notification notification) {
        notification.getClass();
        try {
            a.a("notify", notificationManager, i, notification);
            notificationManager.notify(i, notification);
        } catch (Throwable th) {
            if (!c9g.J(th)) {
                throw th;
            }
            ssg.a(6, null, "Dead system raise", th);
        }
    }

    public static bfk L(String str) {
        str.getClass();
        return new bfk(zek.w, afk.a, null, null, "Failed to show payment method. Couldn't find preferred method ".concat(str), null);
    }

    public static ktm M(mm6 mm6Var, int i, Function2 function2, int i2) {
        g gVar = g.a;
        if ((i2 & 2) != 0) {
            i = 0;
        }
        oi3 oi3Var = oi3.a;
        pm6 pm6Var = pm6.a;
        ktm ktmVar = new ktm(bm6.b(mm6Var, gVar), men.g(i, 4, oi3Var), true, true);
        ktmVar.o0(pm6Var, ktmVar, function2);
        return ktmVar;
    }

    public static Intent N(String str) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.setType("text/plain");
        jyr jyrVar = loi.a;
        str.getClass();
        return Intent.createChooser(intent.putExtra("android.intent.extra.TEXT", loi.a().a() + "/post/" + str), null);
    }

    public static void O(Context context, Intent intent) {
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            context.getClass();
            hag.x(context, R.string.error_unknown, 0);
        }
    }

    public static final String P(imh imhVar) {
        Object obj;
        Object obj2;
        imhVar.getClass();
        List list = imhVar.a;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((Stream) obj).getStreamType() == StreamType.DASH) {
                break;
            }
        }
        Stream stream = (Stream) obj;
        if (stream == null) {
            Iterator it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it2.next();
                if (StringsKt.M(((Stream) obj2).getStream(), ".mpd", false)) {
                    break;
                }
            }
            stream = (Stream) obj2;
            if (stream == null) {
                stream = (Stream) CollectionsKt.firstOrNull(list);
            }
        }
        if (stream != null) {
            return stream.getStream();
        }
        return null;
    }

    public static final void Q(RuntimeException runtimeException, qdc qdcVar, String str, String str2, String str3) {
        str.getClass();
        ngl.r(qdcVar, str, str2, str3, null, new Object[0], 8);
    }

    public static final long R(long j) {
        bqf bqfVar = bqf.a;
        return ia6.a(ga6.k(j), ga6.i(j), ga6.j(j), ga6.h(j));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [c5b] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v1, types: [c5b] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v0, types: [c5b] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.util.ArrayList] */
    public static final jsi S(MyShelfCatalogDto myShelfCatalogDto) {
        ?? r2;
        ?? r8;
        ?? r7;
        myShelfCatalogDto.getClass();
        String title = myShelfCatalogDto.getTitle();
        if (title == null) {
            title = "";
        }
        List<MyShelfBlockDto> blocks = myShelfCatalogDto.getBlocks();
        if (blocks != null) {
            r2 = new ArrayList();
            for (MyShelfBlockDto myShelfBlockDto : blocks) {
                zqi zqiVar = null;
                if (myShelfBlockDto != null) {
                    if (myShelfBlockDto instanceof MyShelfEntitiesBlockDto) {
                        String id = myShelfBlockDto.getId();
                        if (id != null) {
                            String title2 = myShelfBlockDto.getTitle();
                            if (title2 == null) {
                                title2 = "";
                            }
                            List<MyShelfEntityDto> entities = ((MyShelfEntitiesBlockDto) myShelfBlockDto).getEntities();
                            if (entities != null) {
                                r7 = new ArrayList();
                                for (MyShelfEntityDto myShelfEntityDto : entities) {
                                    xsi T = myShelfEntityDto != null ? T(myShelfEntityDto) : null;
                                    if (T != null) {
                                        r7.add(T);
                                    }
                                }
                            } else {
                                r7 = c5b.a;
                            }
                            zqiVar = new qsi(id, title2, r7);
                        }
                    } else {
                        if (!(myShelfBlockDto instanceof MyShelfPromotionBlockDto)) {
                            b6e.s();
                            return null;
                        }
                        String id2 = myShelfBlockDto.getId();
                        if (id2 != null) {
                            String title3 = myShelfBlockDto.getTitle();
                            if (title3 == null) {
                                title3 = "";
                            }
                            MyShelfPromotionBlockDto myShelfPromotionBlockDto = (MyShelfPromotionBlockDto) myShelfBlockDto;
                            String description = myShelfPromotionBlockDto.getDescription();
                            List<MyShelfEntityDto> entities2 = myShelfPromotionBlockDto.getEntities();
                            if (entities2 != null) {
                                r8 = new ArrayList();
                                for (MyShelfEntityDto myShelfEntityDto2 : entities2) {
                                    xsi T2 = myShelfEntityDto2 != null ? T(myShelfEntityDto2) : null;
                                    if (T2 != null) {
                                        r8.add(T2);
                                    }
                                }
                            } else {
                                r8 = c5b.a;
                            }
                            zqiVar = new lui(id2, title3, description, r8);
                        }
                    }
                }
                if (zqiVar != null) {
                    r2.add(zqiVar);
                }
            }
        } else {
            r2 = c5b.a;
        }
        return new jsi(title, r2);
    }

    public static final xsi T(MyShelfEntityDto myShelfEntityDto) {
        mqs a2;
        mqs a3;
        oq G;
        if (myShelfEntityDto instanceof MyShelfAlbumEntityDto) {
            MyShelfAlbumEntityDto myShelfAlbumEntityDto = (MyShelfAlbumEntityDto) myShelfEntityDto;
            AlbumDto album = myShelfAlbumEntityDto.getAlbum();
            if (album != null && (G = ild.G(album)) != null) {
                TrackDto track = myShelfAlbumEntityDto.getTrack();
                return new usi(G, track != null ? wts.a(track) : null);
            }
        } else if (myShelfEntityDto instanceof MyShelfPlaylistEntityDto) {
            MyShelfPlaylistEntityDto myShelfPlaylistEntityDto = (MyShelfPlaylistEntityDto) myShelfEntityDto;
            PlaylistHeaderDto playlist = myShelfPlaylistEntityDto.getPlaylist();
            if (playlist != null) {
                rrl L = zdg.L(playlist);
                TrackDto track2 = myShelfPlaylistEntityDto.getTrack();
                if (track2 != null && (a3 = wts.a(track2)) != null) {
                    return new wsi(L, a3);
                }
            }
        } else {
            if (!(myShelfEntityDto instanceof MyShelfTrackEntityDto)) {
                b6e.s();
                return null;
            }
            TrackDto track3 = ((MyShelfTrackEntityDto) myShelfEntityDto).getTrack();
            if (track3 != null && (a2 = wts.a(track3)) != null) {
                return new vsi(a2);
            }
        }
        return null;
    }

    public static final asw U(List list, asw aswVar) {
        list.getClass();
        aswVar.getClass();
        HashMap hashMap = new HashMap(aswVar.a);
        HashMap hashMap2 = new HashMap((Map) aswVar.e.getValue());
        List list2 = list;
        Iterator it = list2.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            hzs hzsVar = hzs.a;
            if (!hasNext) {
                int size = hashMap.size();
                HashMap hashMap3 = new HashMap(aswVar.b);
                HashMap hashMap4 = new HashMap(aswVar.a());
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    izs izsVar = ((jzs) ((mwk) it2.next())).g;
                    if (izsVar instanceof e6v) {
                        e6v e6vVar = (e6v) izsVar;
                        if (e6vVar instanceof d6v) {
                            continue;
                        } else {
                            if (!(e6vVar instanceof b6v)) {
                                b6e.s();
                                return null;
                            }
                            Integer num = (Integer) hashMap4.get(e6vVar);
                            int intValue = num != null ? num.intValue() : hashMap3.size() + size;
                            hashMap3.put(Integer.valueOf(intValue), e6vVar);
                            hashMap4.put(e6vVar, Integer.valueOf(intValue));
                        }
                    } else {
                        if (!Intrinsics.d(izsVar, hzsVar)) {
                            b6e.s();
                            return null;
                        }
                        su4.s(2, null, "This should not happen. Track source should be always filled in wave queue", null);
                    }
                }
                return new asw(hashMap, hashMap3);
            }
            izs izsVar2 = ((jzs) ((mwk) it.next())).g;
            if (izsVar2 instanceof e6v) {
                e6v e6vVar2 = (e6v) izsVar2;
                if (e6vVar2 instanceof d6v) {
                    c6v c6vVar = ((d6v) e6vVar2).b;
                    Integer num2 = (Integer) hashMap2.get(c6vVar);
                    int intValue2 = num2 != null ? num2.intValue() : hashMap.size();
                    hashMap.put(Integer.valueOf(intValue2), e6vVar2);
                    hashMap2.put(c6vVar, Integer.valueOf(intValue2));
                } else if (!(e6vVar2 instanceof b6v)) {
                    b6e.s();
                    return null;
                }
            } else {
                if (!Intrinsics.d(izsVar2, hzsVar)) {
                    b6e.s();
                    return null;
                }
                su4.s(2, null, "This should not happen. Wave track source should be always filled in wave queue", null);
            }
        }
    }

    public static final r V(b6v b6vVar, int i) {
        b6vVar.getClass();
        r3q r3qVar = b6vVar.a;
        if (r3qVar instanceof j3q) {
            return t7g.y(i, bfg.O(o2g.r0(r3qVar)), ((j3q) r3qVar).a.a);
        }
        if (r3qVar instanceof l3q) {
            return t7g.z(i, bfg.O(o2g.r0(r3qVar)), ((l3q) r3qVar).a.a);
        }
        if (r3qVar instanceof p3q) {
            bd5 bd5Var = ((p3q) r3qVar).a;
            return t7g.A(i, bfg.O(o2g.r0(r3qVar)), bd5Var.getId(), pcg.E(bd5Var));
        }
        if (!(r3qVar instanceof m3q)) {
            b6e.s();
            return null;
        }
        int O = bfg.O(o2g.r0(r3qVar));
        lhl s = p.s();
        s.h(O);
        p pVar = (p) s.b();
        nhl n = r.n();
        n.d();
        r.f((r) n.b, i);
        n.d();
        r.g((r) n.b, pVar);
        return (r) n.b();
    }

    public static final r W(d6v d6vVar, int i) {
        d6vVar.getClass();
        int ordinal = d6vVar.b.ordinal();
        int i2 = 1;
        if (ordinal != 0) {
            if (ordinal != 1) {
                b6e.s();
                return null;
            }
            i2 = 2;
        }
        nhl n = r.n();
        n.d();
        r.f((r) n.b, i);
        phl i3 = t.i();
        i3.d();
        t.f((t) i3.b, i2);
        n.d();
        r.h((r) n.b, (t) i3.b());
        return (r) n.b();
    }

    public static String X(String str) {
        return str.length() <= 127 ? str : str.substring(0, 127);
    }

    public static final void Y(boolean z, ngl nglVar) {
        nglVar.getClass();
        if (Intrinsics.d(Looper.myLooper(), Looper.getMainLooper())) {
            return;
        }
        RuntimeException runtimeException = new RuntimeException("You have to call ListPlayerManager api from main thread. But it is " + Thread.currentThread().getName());
        ngl.r(nglVar, "THREAD_PROBLEMS", null, null, runtimeException, new Object[0], 6);
        if (z) {
            throw runtimeException;
        }
    }

    public static final void a(qcj qcjVar, yci yciVar, hq5 hq5Var, int i) {
        yci yciVar2;
        long j = qcjVar.b;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(484691416);
        if (((((i & 6) == 0 ? ((i & 8) == 0 ? oq5Var.f(qcjVar) : oq5Var.h(qcjVar) ? 4 : 2) | i : i) | 48) & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
            yciVar2 = yciVar;
        } else {
            vci vciVar = vci.a;
            yci k = androidx.compose.foundation.a.k(vciVar, true, null);
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (K == kjnVar) {
                K = new m2j(21);
                oq5Var.k0(K);
            }
            yci b2 = nfp.b(k, true, (Function1) K);
            ta5 a2 = sa5.a(qx0.c, b2c.n, oq5Var, 0);
            int i2 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, b2);
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
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i2))) {
                ouj.x(i2, oq5Var, i2, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            bg3.a(null, null, false, ild.C(-1665067612, new tt5(26, qcjVar), oq5Var), oq5Var, 3072, 7);
            u1g.l(oq5Var, d.m(vciVar, 4));
            String N = xee.N(j, oq5Var);
            StringBuilder sb = new StringBuilder(16);
            new ArrayList();
            ArrayList arrayList = new ArrayList();
            new ArrayList();
            sb.append(lxe.K(j));
            String sb2 = sb.toString();
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                arrayList2.add(((jn0) arrayList.get(i3)).a(sb.length()));
            }
            mn0 mn0Var = new mn0(sb2, arrayList2);
            ges i4 = nu0.i();
            long j2 = ((dq0) oq5Var.j(eq0.a)).b.b;
            yci o = androidx.compose.foundation.layout.a.o(d.d(vciVar, 1.0f), 16, 0.0f, 2);
            boolean f = oq5Var.f(N);
            Object K2 = oq5Var.K();
            if (f || K2 == kjnVar) {
                K2 = new q1h(N, 8);
                oq5Var.k0(K2);
            }
            yciVar2 = vciVar;
            xv7.i(mn0Var, nfp.b(o, false, (Function1) K2), j2, 0L, 0L, 0, 0L, 2, false, 1, 0, null, null, i4, null, null, oq5Var, 0, 3120, 907256);
            oq5Var = oq5Var;
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new gva(qcjVar, yciVar2, i, 24);
        }
    }

    public static final void b(final qcj qcjVar, Function0 function0, hq5 hq5Var, int i) {
        int i2;
        Function0 function02;
        Album$AlbumType album$AlbumType = qcjVar.e;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1482371624);
        int i3 = (oq5Var.f(qcjVar) ? 4 : 2) | i | (oq5Var.h(function0) ? 32 : 16);
        final int i4 = 1;
        if ((i3 & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
            function02 = function0;
        } else {
            final int i5 = 0;
            ta5 a2 = sa5.a(qx0.c, b2c.n, oq5Var, 0);
            int i6 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
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
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i6))) {
                ouj.x(i6, oq5Var, i6, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            a(qcjVar, null, oq5Var, i3 & 14);
            u1g.l(oq5Var, d.m(vciVar, 8));
            if (u2x.L(album$AlbumType)) {
                i2 = R.string.dialog_action_move_to_podcast;
            } else {
                album$AlbumType.getClass();
                i2 = u2x.M(album$AlbumType.a) ? R.string.dialog_action_move_to_book : R.string.dialog_action_move_to_album;
            }
            function02 = function0;
            sk3.i(ild.C(-452876148, new Function2() { // from class: xcj
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    switch (i5) {
                        case 0:
                            hq5 hq5Var2 = (hq5) obj;
                            if ((((Integer) obj2).intValue() & 3) == 2) {
                                oq5 oq5Var2 = (oq5) hq5Var2;
                                if (oq5Var2.z()) {
                                    oq5Var2.S();
                                    break;
                                }
                            }
                            irf.y(qcjVar.c, qo6.b, d.m(vci.a, 36), false, false, null, null, o5g.F(hq5Var2), hq5Var2, 432, 120);
                        default:
                            hq5 hq5Var3 = (hq5) obj;
                            if ((((Integer) obj2).intValue() & 3) == 2) {
                                oq5 oq5Var3 = (oq5) hq5Var3;
                                if (oq5Var3.z()) {
                                    oq5Var3.S();
                                    break;
                                }
                            }
                            StringBuilder sb = new StringBuilder(16);
                            new ArrayList();
                            ArrayList arrayList = new ArrayList();
                            new ArrayList();
                            sb.append(qcjVar.d);
                            String sb2 = sb.toString();
                            ArrayList arrayList2 = new ArrayList(arrayList.size());
                            int size = arrayList.size();
                            for (int i7 = 0; i7 < size; i7++) {
                                arrayList2.add(((jn0) arrayList.get(i7)).a(sb.length()));
                            }
                            xv7.i(new mn0(sb2, arrayList2), d.d(vci.a, 1.0f), ((dq0) ((oq5) hq5Var3).j(eq0.a)).b.a, 0L, 0L, 0, 0L, 2, false, 2, 0, null, null, nu0.j(), null, null, hq5Var3, 48, 3120, 907256);
                    }
                    return Unit.a;
                }
            }, oq5Var), ild.C(-623715605, new Function2() { // from class: xcj
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    switch (i4) {
                        case 0:
                            hq5 hq5Var2 = (hq5) obj;
                            if ((((Integer) obj2).intValue() & 3) == 2) {
                                oq5 oq5Var2 = (oq5) hq5Var2;
                                if (oq5Var2.z()) {
                                    oq5Var2.S();
                                    break;
                                }
                            }
                            irf.y(qcjVar.c, qo6.b, d.m(vci.a, 36), false, false, null, null, o5g.F(hq5Var2), hq5Var2, 432, 120);
                        default:
                            hq5 hq5Var3 = (hq5) obj;
                            if ((((Integer) obj2).intValue() & 3) == 2) {
                                oq5 oq5Var3 = (oq5) hq5Var3;
                                if (oq5Var3.z()) {
                                    oq5Var3.S();
                                    break;
                                }
                            }
                            StringBuilder sb = new StringBuilder(16);
                            new ArrayList();
                            ArrayList arrayList = new ArrayList();
                            new ArrayList();
                            sb.append(qcjVar.d);
                            String sb2 = sb.toString();
                            ArrayList arrayList2 = new ArrayList(arrayList.size());
                            int size = arrayList.size();
                            for (int i7 = 0; i7 < size; i7++) {
                                arrayList2.add(((jn0) arrayList.get(i7)).a(sb.length()));
                            }
                            xv7.i(new mn0(sb2, arrayList2), d.d(vci.a, 1.0f), ((dq0) ((oq5) hq5Var3).j(eq0.a)).b.a, 0L, 0L, 0, 0L, 2, false, 2, 0, null, null, nu0.j(), null, null, hq5Var3, 48, 3120, 907256);
                    }
                    return Unit.a;
                }
            }, oq5Var), null, null, function02, rvf.M(i2, oq5Var), oq5Var, ((i3 << 9) & 57344) | 438, 8);
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new wcj(qcjVar, function02, i, i4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(String str, Function0 function0, yci yciVar, ges gesVar, o0k o0kVar, float f, hq5 hq5Var, int i, int i2) {
        int i3;
        yci yciVar2;
        ges gesVar2;
        int i4;
        o0k o0kVar2;
        int i5;
        float f2;
        yci yciVar3;
        ges gesVar3;
        o0k o0kVar3;
        float f3;
        xmn r;
        ges gesVar4;
        int i6;
        yci yciVar4;
        float f4;
        o0k o0kVar4;
        int i7;
        str.getClass();
        function0.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-916714250);
        if ((i & 6) == 0) {
            i3 = (oq5Var.f(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= oq5Var.h(function0) ? 32 : 16;
        }
        int i8 = i2 & 4;
        if (i8 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            yciVar2 = yciVar;
            i3 |= oq5Var.f(yciVar2) ? 256 : 128;
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    gesVar2 = gesVar;
                    if (oq5Var.f(gesVar2)) {
                        i7 = 2048;
                        i3 |= i7;
                    }
                } else {
                    gesVar2 = gesVar;
                }
                i7 = 1024;
                i3 |= i7;
            } else {
                gesVar2 = gesVar;
            }
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                o0kVar2 = o0kVar;
                i3 |= oq5Var.f(o0kVar2) ? 16384 : RemoteCameraConfig.Notification.ID;
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= 196608;
                } else if ((196608 & i) == 0) {
                    f2 = f;
                    i3 |= oq5Var.c(f2) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
                    if (oq5Var.P(i3 & 1, (74899 & i3) == 74898)) {
                        oq5Var.S();
                        yciVar3 = yciVar2;
                        gesVar3 = gesVar2;
                        o0kVar3 = o0kVar2;
                        f3 = f2;
                    } else {
                        oq5Var.U();
                        if ((i & 1) == 0 || oq5Var.y()) {
                            yci yciVar5 = i8 != 0 ? vci.a : yciVar2;
                            if ((i2 & 8) != 0) {
                                gesVar4 = nu0.j();
                                i3 &= -7169;
                            } else {
                                gesVar4 = gesVar2;
                            }
                            if (i4 != 0) {
                                o0kVar2 = androidx.compose.foundation.layout.a.a(32, 0.0f, 2);
                            }
                            if (i5 != 0) {
                                f4 = 48;
                                yciVar4 = yciVar5;
                                i6 = i3;
                                o0kVar4 = o0kVar2;
                                oq5Var.q();
                                int i9 = i6 >> 3;
                                d(function0, yciVar4, false, f4, ild.C(-454807021, new d7m(o0kVar4, str, gesVar4, 1), oq5Var), oq5Var, (i9 & 112) | (i9 & 14) | 24576 | ((i6 >> 6) & 7168), 4);
                                gesVar3 = gesVar4;
                                yciVar3 = yciVar4;
                                f3 = f4;
                                o0kVar3 = o0kVar4;
                            } else {
                                i6 = i3;
                                yciVar4 = yciVar5;
                            }
                        } else {
                            oq5Var.S();
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                            }
                            i6 = i3;
                            yciVar4 = yciVar2;
                            gesVar4 = gesVar2;
                        }
                        o0kVar4 = o0kVar2;
                        f4 = f2;
                        oq5Var.q();
                        int i92 = i6 >> 3;
                        d(function0, yciVar4, false, f4, ild.C(-454807021, new d7m(o0kVar4, str, gesVar4, 1), oq5Var), oq5Var, (i92 & 112) | (i92 & 14) | 24576 | ((i6 >> 6) & 7168), 4);
                        gesVar3 = gesVar4;
                        yciVar3 = yciVar4;
                        f3 = f4;
                        o0kVar3 = o0kVar4;
                    }
                    r = oq5Var.r();
                    if (r == null) {
                        r.d = new f7m(str, function0, yciVar3, gesVar3, o0kVar3, f3, i, i2);
                        return;
                    }
                    return;
                }
                f2 = f;
                if (oq5Var.P(i3 & 1, (74899 & i3) == 74898)) {
                }
                r = oq5Var.r();
                if (r == null) {
                }
            }
            o0kVar2 = o0kVar;
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            f2 = f;
            if (oq5Var.P(i3 & 1, (74899 & i3) == 74898)) {
            }
            r = oq5Var.r();
            if (r == null) {
            }
        }
        yciVar2 = yciVar;
        if ((i & 3072) != 0) {
        }
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        o0kVar2 = o0kVar;
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        f2 = f;
        if (oq5Var.P(i3 & 1, (74899 & i3) == 74898)) {
        }
        r = oq5Var.r();
        if (r == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void d(Function0 function0, yci yciVar, boolean z, float f, wn5 wn5Var, hq5 hq5Var, int i, int i2) {
        Function0 function02;
        int i3;
        boolean z2;
        int i4;
        float f2;
        boolean z3;
        float f3;
        xmn r;
        function0.getClass();
        yciVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1963979641);
        if ((i & 6) == 0) {
            function02 = function0;
            i3 = (oq5Var.h(function02) ? 4 : 2) | i;
        } else {
            function02 = function0;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= oq5Var.f(yciVar) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            z2 = z;
            i3 |= oq5Var.g(z2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                f2 = f;
                i3 |= oq5Var.c(f2) ? 2048 : 1024;
                if ((i & 24576) == 0) {
                    i3 |= oq5Var.h(wn5Var) ? 16384 : RemoteCameraConfig.Notification.ID;
                }
                if (oq5Var.P(i3 & 1, (i3 & 9363) != 9362)) {
                    boolean z4 = i5 != 0 ? true : z2;
                    f3 = i4 != 0 ? 48 : f2;
                    agr agrVar = eq0.a;
                    pd.o((i3 & 14) | ScreenMirroringConfig.Video.BITRATE_1_5MB | ((i3 >> 3) & 112), 32, ((dq0) oq5Var.j(agrVar)).b.a, ((dq0) oq5Var.j(agrVar)).c.c, ild.C(1396546200, new j26(wn5Var, 14), oq5Var), oq5Var, androidx.compose.foundation.a.a(xp3.u(d.g(yciVar, f3, 0.0f, 2), ugo.a), j66.m0()), function02, z4, false);
                    z3 = z4;
                } else {
                    oq5Var.S();
                    z3 = z2;
                    f3 = f2;
                }
                r = oq5Var.r();
                if (r != null) {
                    r.d = new e7m(function0, yciVar, z3, f3, wn5Var, i, i2);
                    return;
                }
                return;
            }
            f2 = f;
            if ((i & 24576) == 0) {
            }
            if (oq5Var.P(i3 & 1, (i3 & 9363) != 9362)) {
            }
            r = oq5Var.r();
            if (r != null) {
            }
        }
        z2 = z;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        f2 = f;
        if ((i & 24576) == 0) {
        }
        if (oq5Var.P(i3 & 1, (i3 & 9363) != 9362)) {
        }
        r = oq5Var.r();
        if (r != null) {
        }
    }

    public static final void e(qqq qqqVar, List list, fvf fvfVar, vm vmVar, q0k q0kVar, hq5 hq5Var, int i) {
        oq5 oq5Var;
        list.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(447620270);
        int i2 = i | (oq5Var2.h(qqqVar) ? 4 : 2) | (oq5Var2.f(list) ? 32 : 16) | (oq5Var2.f(fvfVar) ? 256 : 128) | (oq5Var2.f(vmVar) ? 2048 : 1024) | (oq5Var2.f(q0kVar) ? 16384 : RemoteCameraConfig.Notification.ID);
        if (oq5Var2.P(i2 & 1, (i2 & 9363) != 9362)) {
            boolean booleanValue = ((Boolean) szf.Q(qqqVar.g, oq5Var2).getValue()).booleanValue();
            boolean h = oq5Var2.h(qqqVar);
            Object K = oq5Var2.K();
            if (h || K == gq5.a) {
                qbp qbpVar = new qbp(0, qqqVar, qqq.class, "onRefresh", "onRefresh()V", 0, 29);
                oq5Var2.k0(qbpVar);
                K = qbpVar;
            }
            oq5Var = oq5Var2;
            bfg.f(booleanValue, (Function0) ((h9f) K), vmVar, null, false, ild.C(-349317074, new oqq(list, fvfVar, vmVar, q0kVar, qqqVar, 0), oq5Var2), oq5Var, ((i2 >> 3) & 896) | 196608, 24);
        } else {
            oq5Var = oq5Var2;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new oqq(qqqVar, list, fvfVar, vmVar, q0kVar, i);
        }
    }

    public static final void f(ExoPlayer exoPlayer, yci yciVar, g40 g40Var, jd6 jd6Var, hq5 hq5Var, int i, int i2) {
        int i3;
        jd6 jd6Var2;
        exoPlayer.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-449754959);
        if ((i & 6) == 0) {
            i3 = (oq5Var.h(exoPlayer) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= oq5Var.f(yciVar) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= oq5Var.f(g40Var) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= oq5Var.f(jd6Var) ? 2048 : 1024;
        }
        if ((i3 & 1171) == 1170 && oq5Var.z()) {
            oq5Var.S();
            jd6Var2 = jd6Var;
        } else {
            if (i4 != 0) {
                g40Var = b2c.f;
            }
            jd6 jd6Var3 = i5 != 0 ? hd6.a : jd6Var;
            boolean h = ((i3 & 896) == 256) | ((i3 & 7168) == 2048) | oq5Var.h(exoPlayer);
            Object K = oq5Var.K();
            if (h || K == gq5.a) {
                K = new zzq(g40Var, jd6Var3, exoPlayer);
                oq5Var.k0(K);
            }
            androidx.compose.ui.viewinterop.a.a(i3 & 112, 4, oq5Var, yciVar, (Function1) K, null);
            jd6Var2 = jd6Var3;
        }
        g40 g40Var2 = g40Var;
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new hq((Object) exoPlayer, yciVar, (Object) g40Var2, (Object) jd6Var2, i, i2, 24);
        }
    }

    public static final void g(rpu rpuVar, Function0 function0, hq5 hq5Var, int i) {
        int i2;
        rpuVar.getClass();
        function0.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1973171044);
        if ((i & 6) == 0) {
            i2 = (oq5Var.h(rpuVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.h(function0) ? 32 : 16;
        }
        int i3 = i & 384;
        vci vciVar = vci.a;
        if (i3 == 0) {
            i2 |= oq5Var.f(vciVar) ? 256 : 128;
        }
        int i4 = i2;
        if ((i4 & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
        } else {
            aqi O = gld.O(rpuVar.getState(), oq5Var);
            int i5 = i4 >> 3;
            aqi o0 = szf.o0(function0, oq5Var);
            boolean h = oq5Var.h(rpuVar) | oq5Var.f(o0);
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (h || K == kjnVar) {
                K = new npt(rpuVar, o0, (Continuation) null, 13);
                oq5Var.k0(K);
            }
            gld.w(oq5Var, rpuVar, (Function2) K);
            cqu cquVar = (cqu) O.getValue();
            if (cquVar instanceof upu) {
                oq5Var.Z(-2136779251);
                v7g.j((i4 >> 6) & 14, oq5Var);
                oq5Var.p(false);
            } else if (cquVar instanceof tpu) {
                oq5Var.Z(-2136775722);
                boolean h2 = oq5Var.h(rpuVar);
                Object K2 = oq5Var.K();
                if (h2 || K2 == kjnVar) {
                    j6u j6uVar = new j6u(0, rpuVar, rpu.class, "onRetryClick", "onRetryClick()V", 0, 12);
                    oq5Var.k0(j6uVar);
                    K2 = j6uVar;
                }
                t7g.k((Function0) ((h9f) K2), vciVar, oq5Var, i5 & 112, 0);
                oq5Var.p(false);
            } else if (cquVar instanceof xpu) {
                oq5Var.Z(-2136769469);
                xpu xpuVar = (xpu) cquVar;
                boolean h3 = oq5Var.h(rpuVar);
                Object K3 = oq5Var.K();
                if (h3 || K3 == kjnVar) {
                    j6u j6uVar2 = new j6u(0, rpuVar, rpu.class, "onJoinClick", "onJoinClick()V", 0, 13);
                    oq5Var.k0(j6uVar2);
                    K3 = j6uVar2;
                }
                ppu.a(xpuVar, (Function0) ((h9f) K3), oq5Var, i4 & 896);
                oq5Var.p(false);
            } else if (cquVar instanceof zpu) {
                oq5Var.Z(-1815103103);
                boolean h4 = oq5Var.h(rpuVar);
                Object K4 = oq5Var.K();
                if (h4 || K4 == kjnVar) {
                    j6u j6uVar3 = new j6u(0, rpuVar, rpu.class, "navigateToCollectionClick", "navigateToCollectionClick()V", 0, 14);
                    oq5Var.k0(j6uVar3);
                    K4 = j6uVar3;
                }
                o8g.g((Function0) ((h9f) K4), oq5Var, i5 & 112);
                oq5Var.p(false);
            } else if (cquVar instanceof ypu) {
                oq5Var.Z(-2136753544);
                boolean h5 = oq5Var.h(rpuVar);
                Object K5 = oq5Var.K();
                if (h5 || K5 == kjnVar) {
                    j6u j6uVar4 = new j6u(0, rpuVar, rpu.class, "navigateToCollectionClick", "navigateToCollectionClick()V", 0, 15);
                    oq5Var.k0(j6uVar4);
                    K5 = j6uVar4;
                }
                c9g.m((Function0) ((h9f) K5), oq5Var, i5 & 112);
                oq5Var.p(false);
            } else if (cquVar instanceof wpu) {
                oq5Var.Z(-2136746279);
                wpu wpuVar = (wpu) cquVar;
                boolean h6 = oq5Var.h(rpuVar);
                Object K6 = oq5Var.K();
                if (h6 || K6 == kjnVar) {
                    j6u j6uVar5 = new j6u(0, rpuVar, rpu.class, "onCreateInvitationClick", "onCreateInvitationClick()V", 0, 16);
                    oq5Var.k0(j6uVar5);
                    K6 = j6uVar5;
                }
                f8g.e(wpuVar, (Function0) ((h9f) K6), oq5Var, i4 & 896);
                oq5Var.p(false);
            } else if (cquVar instanceof aqu) {
                oq5Var.Z(-2136737952);
                boolean h7 = oq5Var.h(rpuVar) | oq5Var.h(cquVar);
                Object K7 = oq5Var.K();
                if (h7 || K7 == kjnVar) {
                    K7 = new xes(18, rpuVar, (aqu) cquVar);
                    oq5Var.k0(K7);
                }
                dag.n((Function0) K7, oq5Var, i5 & 112);
                oq5Var.p(false);
            } else {
                if (!(cquVar instanceof vpu)) {
                    throw vz1.i(oq5Var, -2136780228, false);
                }
                oq5Var.Z(-2136727193);
                boolean h8 = oq5Var.h(rpuVar) | oq5Var.h(cquVar);
                Object K8 = oq5Var.K();
                if (h8 || K8 == kjnVar) {
                    K8 = new xes(19, rpuVar, (vpu) cquVar);
                    oq5Var.k0(K8);
                }
                gut.k((Function0) K8, oq5Var, i5 & 112);
                oq5Var.p(false);
            }
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new x8l(rpuVar, function0, i);
        }
    }

    public static final void h(int i, hq5 hq5Var) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-732296060);
        if (i == 0 && oq5Var.z()) {
            oq5Var.S();
        } else {
            lx0 lx0Var = qx0.g;
            gz2 gz2Var = b2c.o;
            vci vciVar = vci.a;
            float f = 16;
            yci p = androidx.compose.foundation.layout.a.p(d.c(vciVar, 1.0f), f, 40, f, 8);
            ta5 a2 = sa5.a(lx0Var, gz2Var, oq5Var, 54);
            int i2 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, p);
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
            g0g.U(oq5Var, l, kb5Var2);
            kb5 kb5Var3 = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i2))) {
                ouj.x(i2, oq5Var, i2, kb5Var3);
            }
            kb5 kb5Var4 = wp5.d;
            g0g.U(oq5Var, H, kb5Var4);
            ta5 a3 = sa5.a(qx0.g(4), gz2Var, oq5Var, 54);
            int i3 = oq5Var.P;
            androidx.compose.runtime.internal.a l2 = oq5Var.l();
            yci H2 = vnj.H(oq5Var, vciVar);
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a3, kb5Var);
            g0g.U(oq5Var, l2, kb5Var2);
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var, i3, kb5Var3);
            }
            g0g.U(oq5Var, H2, kb5Var4);
            pm0.d(d.r(vciVar, 322), nu0.g(), oq5Var, 6);
            pm0.d(d.r(vciVar, 204), nu0.g(), oq5Var, 6);
            pm0.d(d.r(vciVar, 258), nu0.g(), oq5Var, 6);
            pm0.d(d.r(vciVar, 130), nu0.g(), oq5Var, 6);
            oq5Var.p(true);
            float f2 = 24;
            u1g.l(oq5Var, d.e(vciVar, f2));
            ivf.k(6, 0, oq5Var, xp3.u(d.e(d.r(vciVar, 190), 36), ugo.a(52)), true);
            u1g.l(oq5Var, d.e(vciVar, 48));
            pm0.d(d.r(vciVar, 188), nu0.j(), oq5Var, 6);
            u1g.l(oq5Var, d.e(vciVar, f));
            nho a4 = lho.a(qx0.h(f2, gz2Var), b2c.k, oq5Var, 6);
            int i4 = oq5Var.P;
            androidx.compose.runtime.internal.a l3 = oq5Var.l();
            yci H3 = vnj.H(oq5Var, vciVar);
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a4, kb5Var);
            g0g.U(oq5Var, l3, kb5Var2);
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var, i4, kb5Var3);
            }
            g0g.U(oq5Var, H3, kb5Var4);
            float f3 = 56;
            yci m = d.m(vciVar, f3);
            tgo tgoVar = ugo.a;
            ivf.k(6, 0, oq5Var, xp3.u(m, tgoVar), true);
            ivf.k(6, 0, oq5Var, xp3.u(d.m(vciVar, f3), tgoVar), true);
            oq5Var.p(true);
            u1g.l(oq5Var, d.e(vciVar, f2));
            xcs.b(rvf.M(R.string.wave_words_feedback_disclaimer_description, oq5Var), null, ((dq0) oq5Var.j(eq0.a)).b.c, 0L, null, 0L, null, new o9s(3), 0L, 0, false, 0, 0, null, nu0.h(), oq5Var, 0, 0, 65018);
            oq5Var = oq5Var;
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new j1p(i, 28);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void i(ssv ssvVar, Function0 function0, yci yciVar, hq5 hq5Var, int i, int i2) {
        int i3;
        yci yciVar2;
        boolean z;
        yci yciVar3;
        boolean z2;
        Object K;
        rsv rsvVar;
        boolean c2;
        Object K2;
        boolean f;
        Object K3;
        int i4;
        boolean h;
        Object K4;
        xmn r;
        ssvVar.getClass();
        function0.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-194269300);
        if ((i & 6) == 0) {
            i3 = (oq5Var.f(ssvVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= oq5Var.h(function0) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            yciVar2 = yciVar;
            i3 |= oq5Var.f(yciVar2) ? 256 : 128;
            if ((i3 & 147) == 146 || !oq5Var.z()) {
                vci vciVar = vci.a;
                if (i5 != 0) {
                    yciVar2 = vciVar;
                }
                View view = (View) oq5Var.j(AndroidCompositionLocals_androidKt.f);
                z = ssvVar instanceof rsv;
                yciVar3 = yciVar2;
                sdr b2 = pk0.b(!z ? 1.0f : 0.0f, weo.S(450, 0, lya.c, 2), "Switch mode animation progress", null, oq5Var, 3072, 20);
                z2 = (i3 & 14) != 4;
                K = oq5Var.K();
                kjn kjnVar = gq5.a;
                if (!z2 || K == kjnVar) {
                    rsvVar = !z ? (rsv) ssvVar : null;
                    K = "";
                    if (rsvVar != null) {
                        osv osvVar = rsvVar.c;
                        if (osvVar instanceof nsv) {
                            K = ((nsv) osvVar).b;
                        }
                    }
                    oq5Var.k0(K);
                }
                String str = (String) K;
                yci d2 = d.d(yciVar3, 1.0f);
                float floatValue = ((Number) b2.getValue()).floatValue();
                d2.getClass();
                float f2 = (floatValue * (-0.25f)) + 0.75f;
                yci c3 = d.c(d2, 1.0f);
                c2 = oq5Var.c(f2);
                K2 = oq5Var.K();
                if (!c2 || K2 == kjnVar) {
                    K2 = new vp(7, f2);
                    oq5Var.k0(K2);
                }
                yci c4 = androidx.compose.ui.draw.a.c(c3, (Function1) K2);
                float f3 = 8;
                float f4 = (16 * 0.45454544f) - f3;
                yci n = androidx.compose.foundation.layout.a.n(c4, (((Number) b2.getValue()).floatValue() * f4) + f3, su4.e(24 * 0.45454544f, f3, ((Number) b2.getValue()).floatValue(), f3));
                f = oq5Var.f(str);
                K3 = oq5Var.K();
                if (!f || K3 == kjnVar) {
                    K3 = new srp(str, 24);
                    oq5Var.k0(K3);
                }
                yci a2 = nfp.a(n, (Function1) K3);
                ta5 a3 = sa5.a(qx0.d, b2c.o, oq5Var, 54);
                i4 = oq5Var.P;
                androidx.compose.runtime.internal.a l = oq5Var.l();
                yci H = vnj.H(oq5Var, a2);
                xp5.T.getClass();
                grb grbVar = wp5.b;
                oq5Var.d0();
                int i6 = i3;
                if (oq5Var.O) {
                    oq5Var.n0();
                } else {
                    oq5Var.k(grbVar);
                }
                g0g.U(oq5Var, a3, wp5.f);
                g0g.U(oq5Var, l, wp5.e);
                kb5 kb5Var = wp5.g;
                if (!oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                    ouj.x(i4, oq5Var, i4, kb5Var);
                }
                g0g.U(oq5Var, H, wp5.d);
                rsv rsvVar2 = !z ? (rsv) ssvVar : null;
                j(rsvVar2 == null ? rsvVar2.c : null, oq5Var, 0);
                String a4 = ssvVar.a();
                yci q = androidx.compose.foundation.layout.a.q(vciVar, 0.0f, 0.0f, 0.0f, hrg.f((Number) b2.getValue(), f4, f3), 7);
                ges gesVar = neg.t(oq5Var).h.a;
                float c5 = kes.c(neg.t(oq5Var).h.a.b.c);
                long D = v7g.D(su4.e(10.90909f, c5, ((Number) b2.getValue()).floatValue(), c5), 4294967296L);
                float c6 = kes.c(neg.t(oq5Var).h.a.b.c);
                m(a4, q, ges.f(gesVar, 0L, D, null, 0L, null, new otp(c3x.f(1711276032), swf.i(0.0f, 1.0f), 1.0f), 0, v7g.D(su4.e(12.727272f, c6, ((Number) b2.getValue()).floatValue(), c6), 4294967296L), 16637949), oq5Var, 0);
                boolean c7 = ssvVar.c();
                h = oq5Var.h(view) | ((i6 & 112) != 32);
                K4 = oq5Var.K();
                if (!h || K4 == kjnVar) {
                    K4 = new wvi(function0, view);
                    oq5Var.k0(K4);
                }
                Function0 function02 = (Function0) K4;
                float f5 = 40;
                yci m = d.m(vciVar, (((64 * 0.45454544f) - f5) * ((Number) b2.getValue()).floatValue()) + f5);
                float floatValue2 = (((Number) b2.getValue()).floatValue() * (-0.3333333f)) + 1.0f;
                l(c7, function02, m, gdg.L(vciVar, floatValue2, floatValue2), oq5Var, 0);
                oq5Var.p(true);
            } else {
                oq5Var.S();
                yciVar3 = yciVar2;
            }
            r = oq5Var.r();
            if (r == null) {
                r.d = new o4p(ssvVar, function0, yciVar3, i, i2, 16);
                return;
            }
            return;
        }
        yciVar2 = yciVar;
        if ((i3 & 147) == 146) {
        }
        vci vciVar2 = vci.a;
        if (i5 != 0) {
        }
        View view2 = (View) oq5Var.j(AndroidCompositionLocals_androidKt.f);
        z = ssvVar instanceof rsv;
        yciVar3 = yciVar2;
        sdr b22 = pk0.b(!z ? 1.0f : 0.0f, weo.S(450, 0, lya.c, 2), "Switch mode animation progress", null, oq5Var, 3072, 20);
        if ((i3 & 14) != 4) {
        }
        K = oq5Var.K();
        kjn kjnVar2 = gq5.a;
        if (!z2) {
        }
        if (!z) {
        }
        K = "";
        if (rsvVar != null) {
        }
        oq5Var.k0(K);
        String str2 = (String) K;
        yci d22 = d.d(yciVar3, 1.0f);
        float floatValue3 = ((Number) b22.getValue()).floatValue();
        d22.getClass();
        float f22 = (floatValue3 * (-0.25f)) + 0.75f;
        yci c32 = d.c(d22, 1.0f);
        c2 = oq5Var.c(f22);
        K2 = oq5Var.K();
        if (!c2) {
        }
        K2 = new vp(7, f22);
        oq5Var.k0(K2);
        yci c42 = androidx.compose.ui.draw.a.c(c32, (Function1) K2);
        float f32 = 8;
        float f42 = (16 * 0.45454544f) - f32;
        yci n2 = androidx.compose.foundation.layout.a.n(c42, (((Number) b22.getValue()).floatValue() * f42) + f32, su4.e(24 * 0.45454544f, f32, ((Number) b22.getValue()).floatValue(), f32));
        f = oq5Var.f(str2);
        K3 = oq5Var.K();
        if (!f) {
        }
        K3 = new srp(str2, 24);
        oq5Var.k0(K3);
        yci a22 = nfp.a(n2, (Function1) K3);
        ta5 a32 = sa5.a(qx0.d, b2c.o, oq5Var, 54);
        i4 = oq5Var.P;
        androidx.compose.runtime.internal.a l2 = oq5Var.l();
        yci H2 = vnj.H(oq5Var, a22);
        xp5.T.getClass();
        grb grbVar2 = wp5.b;
        oq5Var.d0();
        int i62 = i3;
        if (oq5Var.O) {
        }
        g0g.U(oq5Var, a32, wp5.f);
        g0g.U(oq5Var, l2, wp5.e);
        kb5 kb5Var2 = wp5.g;
        if (!oq5Var.O) {
        }
        ouj.x(i4, oq5Var, i4, kb5Var2);
        g0g.U(oq5Var, H2, wp5.d);
        if (!z) {
        }
        j(rsvVar2 == null ? rsvVar2.c : null, oq5Var, 0);
        String a42 = ssvVar.a();
        yci q2 = androidx.compose.foundation.layout.a.q(vciVar2, 0.0f, 0.0f, 0.0f, hrg.f((Number) b22.getValue(), f42, f32), 7);
        ges gesVar2 = neg.t(oq5Var).h.a;
        float c52 = kes.c(neg.t(oq5Var).h.a.b.c);
        long D2 = v7g.D(su4.e(10.90909f, c52, ((Number) b22.getValue()).floatValue(), c52), 4294967296L);
        float c62 = kes.c(neg.t(oq5Var).h.a.b.c);
        m(a42, q2, ges.f(gesVar2, 0L, D2, null, 0L, null, new otp(c3x.f(1711276032), swf.i(0.0f, 1.0f), 1.0f), 0, v7g.D(su4.e(12.727272f, c62, ((Number) b22.getValue()).floatValue(), c62), 4294967296L), 16637949), oq5Var, 0);
        boolean c72 = ssvVar.c();
        h = oq5Var.h(view2) | ((i62 & 112) != 32);
        K4 = oq5Var.K();
        if (!h) {
        }
        K4 = new wvi(function0, view2);
        oq5Var.k0(K4);
        Function0 function022 = (Function0) K4;
        float f52 = 40;
        yci m2 = d.m(vciVar2, (((64 * 0.45454544f) - f52) * ((Number) b22.getValue()).floatValue()) + f52);
        float floatValue22 = (((Number) b22.getValue()).floatValue() * (-0.3333333f)) + 1.0f;
        l(c72, function022, m2, gdg.L(vciVar2, floatValue22, floatValue22), oq5Var, 0);
        oq5Var.p(true);
        r = oq5Var.r();
        if (r == null) {
        }
    }

    public static final void j(osv osvVar, hq5 hq5Var, int i) {
        osv osvVar2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-770249782);
        int i2 = (oq5Var.f(osvVar) ? 4 : 2) | i;
        if ((i2 & 3) == 2 && oq5Var.z()) {
            oq5Var.S();
            osvVar2 = osvVar;
        } else {
            Object K = oq5Var.K();
            if (K == gq5.a) {
                K = new ulv(10);
                oq5Var.k0(K);
            }
            osvVar2 = osvVar;
            ot0.l(osvVar2, (Function1) K, null, weo.S(300, 0, lya.c, 2), null, false, qwp.d, oq5Var, (i2 & 14) | 1572912, 52);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new ksv(osvVar2, i, 0);
        }
    }

    public static final void k(String str, jzb jzbVar, hq5 hq5Var, int i) {
        String str2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1876462383);
        int i2 = (oq5Var.f(str) ? 4 : 2) | i | (oq5Var.d(jzbVar == null ? -1 : jzbVar.ordinal()) ? 32 : 16);
        if ((i2 & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
            str2 = str;
        } else {
            yci m = androidx.compose.foundation.layout.a.m(vci.a, 4 * 0.45454544f);
            nho a2 = lho.a(qx0.a, b2c.l, oq5Var, 48);
            int i3 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, m);
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
            n(0, oq5Var);
            Object K = oq5Var.K();
            if (K == gq5.a) {
                K = new ulv(11);
                oq5Var.k0(K);
            }
            str2 = str;
            androidx.compose.animation.a.b(str2, null, (Function1) K, null, "artist card info track playing animation", null, ild.C(1553096963, new t31(25, jzbVar), oq5Var), oq5Var, (i2 & 14) | 1597824, 42);
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new dwg(str2, jzbVar, i, 1);
        }
    }

    public static final void l(boolean z, Function0 function0, yci yciVar, yci yciVar2, hq5 hq5Var, int i) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-610513361);
        int i2 = i | (oq5Var.g(z) ? 4 : 2) | (oq5Var.h(function0) ? 32 : 16) | (oq5Var.f(yciVar) ? 256 : 128) | (oq5Var.f(yciVar2) ? 2048 : 1024);
        if ((i2 & 1171) == 1170 && oq5Var.z()) {
            oq5Var.S();
        } else {
            d85 d85Var = neg.n(oq5Var).b.c;
            yci u = xp3.u(yciVar, ugo.a);
            oq5Var.Z(1383514919);
            oq5Var.p(false);
            yci f = u.f(androidx.compose.foundation.a.b(vci.a, d85Var.a, vnj.i));
            boolean z2 = (i2 & 112) == 32;
            Object K = oq5Var.K();
            if (z2 || K == gq5.a) {
                K = new gct(18, function0);
                oq5Var.k0(K);
            }
            yci e2 = androidx.compose.foundation.a.e(f, false, null, null, (Function0) K, 7);
            neg.s(oq5Var);
            int i3 = i2 & 14;
            yci D = ksw.D(e2, rvf.M(R.string.menu_element_like, oq5Var), rvf.M(u2x.r(z, oq5Var), oq5Var));
            kfh d2 = ug3.d(b2c.f, false);
            int i4 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, D);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, d2, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var, i4, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            long j = neg.n(oq5Var).b.b;
            long j2 = ((dq0) oq5Var.j(eq0.a)).a.a;
            neg.o(oq5Var);
            neg.o(oq5Var);
            a0g.e(z, yciVar2, null, j, j2, new b0g(R.drawable.ic_medium_like_active_20, R.drawable.ic_medium_like_unactive_20), oq5Var, ((i2 >> 6) & 112) | i3, 4);
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new duu(z, function0, yciVar, yciVar2, i);
        }
    }

    public static final void m(String str, yci yciVar, ges gesVar, hq5 hq5Var, int i) {
        oq5 oq5Var;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(1958285229);
        int i2 = i | (oq5Var2.f(str) ? 4 : 2) | (oq5Var2.f(yciVar) ? 32 : 16) | (oq5Var2.f(gesVar) ? 256 : 128);
        if ((i2 & 147) == 146 && oq5Var2.z()) {
            oq5Var2.S();
            oq5Var = oq5Var2;
        } else {
            oq5Var = oq5Var2;
            xcs.b(str, yciVar, ((dq0) oq5Var2.j(eq0.a)).b.a, 0L, null, 0L, null, new o9s(3), 0L, 2, false, 2, 0, null, gesVar, oq5Var, i2 & 126, ((i2 << 12) & 3670016) | 3120, 54776);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new kws(i, 16, yciVar, str, gesVar);
        }
    }

    public static final void n(int i, hq5 hq5Var) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1657328015);
        if (i == 0 && oq5Var.z()) {
            oq5Var.S();
        } else {
            jyg Q = y1g.Q(new myg(R.raw.music_play_lottie), oq5Var);
            boolean booleanValue = ((Boolean) Q.e.getValue()).booleanValue();
            vci vciVar = vci.a;
            kjn kjnVar = gq5.a;
            if (booleanValue) {
                oq5Var.Z(1485350195);
                int i2 = 1;
                qxg B = quj.B(Q.getValue(), true, Integer.MAX_VALUE, oq5Var);
                ayg value = Q.getValue();
                boolean f = oq5Var.f(B);
                Object K = oq5Var.K();
                if (f || K == kjnVar) {
                    K = new m5r(B, i2);
                    oq5Var.k0(K);
                }
                Function0 function0 = (Function0) K;
                yci m = d.m(vciVar, 16 * 0.45454544f);
                Object K2 = oq5Var.K();
                if (K2 == kjnVar) {
                    K2 = new ulv(7);
                    oq5Var.k0(K2);
                }
                u1g.d(value, function0, androidx.compose.foundation.layout.a.i(m, (Function1) K2), false, null, null, b2c.c, hd6.d, false, oq5Var, 0, 54, 127992);
                oq5Var.p(false);
            } else {
                oq5Var.Z(1485881752);
                Object K3 = oq5Var.K();
                if (K3 == kjnVar) {
                    K3 = new ulv(8);
                    oq5Var.k0(K3);
                }
                ug3.a(d.m(androidx.compose.foundation.layout.a.i(vciVar, (Function1) K3), 16 * 0.45454544f), oq5Var, 0);
                oq5Var.p(false);
            }
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new jiv(i, 2);
        }
    }

    public static final void o(jzb jzbVar, yci yciVar, hq5 hq5Var, int i) {
        int i2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1943633433);
        int i3 = (oq5Var.d(jzbVar.ordinal()) ? 4 : 2) | i | (oq5Var.f(yciVar) ? 32 : 16);
        if ((i3 & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
        } else {
            int ordinal = jzbVar.ordinal();
            if (ordinal == 0) {
                oq5Var.Z(479050837);
                oq5Var.p(false);
                i2 = R.drawable.ic_explicit_16;
            } else if (ordinal == 1) {
                oq5Var.Z(1965720716);
                neg.o(oq5Var);
                oq5Var.p(false);
                i2 = R.drawable.ic_explicit_age_16;
            } else {
                if (ordinal != 2) {
                    throw vz1.i(oq5Var, 479048768, false);
                }
                oq5Var.Z(479056574);
                oq5Var.p(false);
                i2 = R.drawable.ic_universal_marking_16;
            }
            w4k E = a0g.E(i2, 0, oq5Var);
            long j = ((dq0) oq5Var.j(eq0.a)).a.a;
            neg.s(oq5Var);
            String M = rvf.M(R.string.explicit_element_content_description, oq5Var);
            boolean h = oq5Var.h(E) | oq5Var.e(j);
            Object K = oq5Var.K();
            if (h || K == gq5.a) {
                K = new j8a(E, j, 5);
                oq5Var.k0(K);
            }
            ksw.k(yciVar, M, (Function1) K, oq5Var, (i3 >> 3) & 14);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new u0v(jzbVar, yciVar, i, 9);
        }
    }

    public static final Object p(Object obj, Method method, Object... objArr) {
        try {
            return method.invoke(obj, Arrays.copyOf(objArr, objArr.length));
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause == null) {
                throw e2;
            }
            throw cause;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object q(ltm ltmVar, Function0 function0, Continuation continuation) {
        itm itmVar;
        int i;
        try {
            if (continuation instanceof itm) {
                itmVar = (itm) continuation;
                int i2 = itmVar.l;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    itmVar.l = i2 - Integer.MIN_VALUE;
                    Object obj = itmVar.k;
                    nm6 nm6Var = nm6.a;
                    i = itmVar.l;
                    if (i != 0) {
                        qgg.h0(obj);
                        if (itmVar.getContext().get(o6c.l) != ltmVar) {
                            xq0.q("awaitClose() can only be invoked from the producer context");
                            return null;
                        }
                        itmVar.j = function0;
                        itmVar.l = 1;
                        zt3 zt3Var = new zt3(1, qxe.b(itmVar));
                        zt3Var.s();
                        ((oc4) ltmVar).q0(new oec(zt3Var, 3));
                        if (zt3Var.q() == nm6Var) {
                            return nm6Var;
                        }
                    } else {
                        if (i != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        function0 = itmVar.j;
                        qgg.h0(obj);
                    }
                    function0.invoke();
                    return Unit.a;
                }
            }
            if (i != 0) {
            }
            function0.invoke();
            return Unit.a;
        } catch (Throwable th) {
            function0.invoke();
            throw th;
        }
        itmVar = new itm(continuation);
        Object obj2 = itmVar.k;
        nm6 nm6Var2 = nm6.a;
        i = itmVar.l;
    }

    public static long r(long j, bqf bqfVar) {
        bqf bqfVar2 = bqf.a;
        return ia6.a(bqfVar == bqfVar2 ? ga6.k(j) : ga6.j(j), bqfVar == bqfVar2 ? ga6.i(j) : ga6.h(j), bqfVar == bqfVar2 ? ga6.j(j) : ga6.k(j), bqfVar == bqfVar2 ? ga6.h(j) : ga6.i(j));
    }

    public static long s(int i, long j) {
        return ia6.a(0, ga6.i(j), (i & 4) != 0 ? ga6.j(j) : 0, ga6.h(j));
    }

    public static final nyn t(nyn nynVar, o4q o4qVar) {
        nynVar.getClass();
        o4qVar.getClass();
        int ordinal = o4qVar.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return nynVar;
            }
            b6e.s();
            return null;
        }
        int ordinal2 = nynVar.ordinal();
        if (ordinal2 == 0 || ordinal2 == 1) {
            return nynVar;
        }
        if (ordinal2 == 2) {
            ssg.a(5, "RepeatModeType", "RepeatModeType.All is not supported in WithFixedRecommendations mode. Overriding to RepeatModeType.None", null);
            return nyn.a;
        }
        b6e.s();
        return null;
    }

    public static StaticLayout u(CharSequence charSequence, TextPaint textPaint, int i, int i2, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i3, TextUtils.TruncateAt truncateAt, int i4, int i5, boolean z, int i6, int i7, int i8, int i9) {
        if (i2 < 0) {
            tme.a("invalid start value");
        }
        int length = charSequence.length();
        if (i2 < 0 || i2 > length) {
            tme.a("invalid end value");
        }
        if (i3 < 0) {
            tme.a("invalid maxLines value");
        }
        if (i < 0) {
            tme.a("invalid width value");
        }
        if (i4 < 0) {
            tme.a("invalid ellipsizedWidth value");
        }
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, i2, textPaint, i);
        obtain.setTextDirection(textDirectionHeuristic);
        obtain.setAlignment(alignment);
        obtain.setMaxLines(i3);
        obtain.setEllipsize(truncateAt);
        obtain.setEllipsizedWidth(i4);
        obtain.setLineSpacing(0.0f, 1.0f);
        obtain.setIncludePad(z);
        obtain.setBreakStrategy(i6);
        obtain.setHyphenationFrequency(i9);
        obtain.setIndents(null, null);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            gvt.V(obtain, i5);
        }
        if (i10 >= 28) {
            jo0.N(obtain);
        }
        if (i10 >= 33) {
            rb.M(obtain, i7, i8);
        }
        if (i10 >= 35) {
            k1b.a(obtain);
        }
        return obtain.build();
    }

    public static final String v(rue rueVar) {
        if (rueVar == null) {
            return "unknownLP";
        }
        StringBuilder sb = new StringBuilder();
        acg acgVar = (acg) rueVar;
        sb.append((Object) acgVar.b.subSequence(0, 3));
        sb.append('[');
        return vz1.r(sb, acgVar.c, ']');
    }

    public static final e6v w(f fVar, asw aswVar) {
        fVar.getClass();
        aswVar.getClass();
        int j = fVar.x().j();
        String t = fVar.t();
        t.getClass();
        b6v b6vVar = (b6v) aswVar.b.get(Integer.valueOf(j));
        if (b6vVar != null) {
            return b6vVar;
        }
        d6v d6vVar = (d6v) aswVar.a.get(Integer.valueOf(j));
        if (d6vVar != null) {
            return d6vVar;
        }
        if (j == 0) {
            ssg.a(5, "YnisonSourcesContainer", "Source is not found for default key 0, playableId=".concat(t), null);
        } else {
            ssg.a(7, "YnisonSourcesContainer", hrg.p("Source is not found for ", j, ", playableId=", t), null);
        }
        return new b6v(new m3q(new cd5(t75.c(t)), ryt.a));
    }

    public static bfk x(r7w r7wVar) {
        zek zekVar;
        afk afkVar;
        yek yekVar;
        r7wVar.getClass();
        dn9 a2 = r7wVar instanceof p1c ? ((p1c) r7wVar).a() : new dn9(q1c.a, r1c.a, (Integer) null, (String) null, r7wVar.getMessage());
        q1c q1cVar = (q1c) a2.b;
        switch (q1cVar.ordinal()) {
            case 0:
                zekVar = zek.a;
                break;
            case 1:
                zekVar = zek.b;
                break;
            case 2:
                zekVar = zek.c;
                break;
            case 3:
                zekVar = zek.c;
                break;
            case 4:
                zekVar = zek.d;
                break;
            case 5:
                zekVar = zek.h;
                break;
            case 6:
                zekVar = zek.i;
                break;
            case 7:
                zekVar = zek.j;
                break;
            case 8:
                zekVar = zek.k;
                break;
            case 9:
                zekVar = zek.l;
                break;
            case 10:
                zekVar = zek.m;
                break;
            case 11:
                zekVar = zek.n;
                break;
            case 12:
                zekVar = zek.o;
                break;
            case 13:
                zekVar = zek.p;
                break;
            case 14:
                zekVar = zek.q;
                break;
            case 15:
                zekVar = zek.r;
                break;
            case 16:
                zekVar = zek.s;
                break;
            case 17:
                zekVar = zek.t;
                break;
            case 18:
                zekVar = zek.e;
                break;
            case 19:
                zekVar = zek.a;
                break;
            case 20:
                zekVar = zek.g;
                break;
            case 21:
                zekVar = zek.f;
                break;
            case 22:
                zekVar = zek.u;
                break;
            case 23:
                zekVar = zek.y;
                break;
            case 24:
                zekVar = zek.a;
                break;
            case 25:
                zekVar = zek.a;
                break;
            case 26:
                zekVar = zek.a;
                break;
            case 27:
                zekVar = zek.a;
                break;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                zekVar = zek.a;
                break;
            case 29:
                zekVar = zek.a;
                break;
            case 30:
                zekVar = zek.a;
                break;
            default:
                b6e.s();
                return null;
        }
        int ordinal = ((r1c) a2.c).ordinal();
        if (ordinal == 0) {
            afkVar = afk.a;
        } else if (ordinal == 1) {
            afkVar = afk.b;
        } else if (ordinal == 2) {
            afkVar = afk.c;
        } else if (ordinal == 3) {
            afkVar = afk.d;
        } else {
            if (ordinal != 4) {
                b6e.s();
                return null;
            }
            afkVar = afk.f;
        }
        Integer num = (Integer) a2.d;
        String str = (String) a2.e;
        String str2 = (String) a2.f;
        switch (q1cVar.ordinal()) {
            case 24:
                yekVar = yek.b;
                break;
            case 25:
                yekVar = yek.a;
                break;
            case 26:
                yekVar = yek.c;
                break;
            case 27:
                yekVar = yek.d;
                break;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
            default:
                yekVar = null;
                break;
            case 29:
                yekVar = yek.e;
                break;
            case 30:
                yekVar = yek.f;
                break;
        }
        return new bfk(zekVar, afkVar, num, str, str2, yekVar);
    }

    public static xwr y(float f, float f2) {
        float f3;
        boolean z = Float.compare(f, d2h.a) < 0;
        boolean z2 = Float.compare(f2, d2h.b) < 0;
        float f4 = z ? 16 : 68;
        float f5 = 2;
        float f6 = f - (f4 * f5);
        float f7 = z2 ? 24 : 104;
        float f8 = z2 ? 12 : 24;
        float f9 = (k8a.c / f5) + (f7 - (k8a.d / f5)) + y2h.a;
        float f10 = 0;
        if (f9 < f10) {
            f9 = f10;
        }
        if (z) {
            f3 = 1.0f;
        } else {
            f3 = f / f6;
            if (1.33f <= f3) {
                f3 = 1.33f;
            }
        }
        return new xwr(f7, f4, f8, f9, z2 ? b2c.f : b2c.c, f3, z);
    }

    public static ArrayList z(o34 o34Var) {
        o34Var.getClass();
        f24.a.getClass();
        List list = f24.b;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            switch (((f24) obj).ordinal()) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    arrayList.add(obj);
                case 7:
                    l18 l18Var = l18.b;
                    bdt I = hag.I(byb.class);
                    qdc qdcVar = l18Var.a;
                    qdcVar.getClass();
                    if (!((iqu) ((byb) qdcVar.C(I)).b(iqu.class)).h()) {
                        bdt I2 = hag.I(byb.class);
                        qdc qdcVar2 = l18Var.a;
                        qdcVar2.getClass();
                        if (((zqu) ((byb) qdcVar2.C(I2)).b(zqu.class)).h()) {
                        }
                    }
                    arrayList.add(obj);
                default:
                    b6e.s();
                    return null;
            }
        }
        return arrayList;
    }
}
