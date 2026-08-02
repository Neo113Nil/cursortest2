package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.net.wifi.WifiManager;
import android.os.AsyncTask;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.t;
import androidx.fragment.app.y;
import androidx.recyclerview.widget.RecyclerView;
import com.connectsdk.etc.helper.HttpMessage;
import com.connectsdk.service.command.ServiceCommand;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.google.android.material.textfield.TextInputLayout;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.yandex.messenger.websdk.api.WebMessengerNavigationInterceptor;
import com.yandex.passport.sloth.ui.dependencies.m;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.g;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.a;
import okhttp3.OkHttpClient;
import ru.yandex.music.R;
import ru.yandex.music.catalog.artist.screen.ArtistScreenActivity;
import ru.yandex.music.catalog.playlist.screen.PlaylistScreenActivity;
import ru.yandex.quasar.glagol.backend.model.DeviceScope;
import ru.yandex.quasar.glagol.backend.model.SmartDevice;
import ru.yandex.quasar.glagol.backend.model.SmarthomeResult;

/* loaded from: classes6.dex */
public final class n3m implements u0f, p7q, ib7, kqo, l0p, tjp, x0r, ver {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    public n3m(tao taoVar, Context context, pwe pweVar) {
        this.a = 10;
        this.f = taoVar;
        taoVar.c = pweVar;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        this.d = connectivityManager;
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        this.c = activeNetworkInfo;
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            this.b = "";
        } else {
            this.b = ((WifiManager) context.getApplicationContext().getSystemService("wifi")).getConnectionInfo().getBSSID();
        }
        new Thread(new e8h(21, this, context)).run();
    }

    public static n3m G0(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        n3m n3mVar = new n3m(sharedPreferences, scheduledThreadPoolExecutor);
        synchronized (((ArrayDeque) n3mVar.e)) {
            try {
                ((ArrayDeque) n3mVar.e).clear();
                String string = ((SharedPreferences) n3mVar.b).getString((String) n3mVar.c, "");
                if (!TextUtils.isEmpty(string) && string.contains((String) n3mVar.d)) {
                    String[] split = string.split((String) n3mVar.d, -1);
                    if (split.length == 0) {
                        Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                    }
                    for (String str : split) {
                        if (!TextUtils.isEmpty(str)) {
                            ((ArrayDeque) n3mVar.e).add(str);
                        }
                    }
                    return n3mVar;
                }
                return n3mVar;
            } finally {
            }
        }
    }

    public static boolean I0(aab aabVar) {
        if (aabVar instanceof lt) {
            gd6 gd6Var = ((lt) aabVar).f;
            if (gd6Var != null) {
                return gd6Var.c;
            }
        } else {
            if (!(aabVar instanceof u51)) {
                if (aabVar instanceof eul) {
                    return true;
                }
                b6e.s();
                return false;
            }
            gd6 gd6Var2 = ((u51) aabVar).e;
            if (gd6Var2 != null) {
                return gd6Var2.c;
            }
        }
        return true;
    }

    @Override // defpackage.l0p
    public void C0(aab aabVar, e4p e4pVar, int i) {
        Intent h;
        wjb wjbVar;
        aabVar.getClass();
        e4pVar.getClass();
        int ordinal = e4pVar.ordinal();
        if (ordinal == 0 || ordinal == 1 || ordinal == 2) {
            nnd nndVar = (nnd) this.e;
            pxm H = cb0.H(aabVar);
            boolean z = e4pVar == e4p.c;
            nndVar.getClass();
            nndVar.N(H, t0p.b, z);
        } else if (ordinal != 3 && ordinal != 4) {
            b6e.s();
            return;
        }
        jtc jtcVar = (jtc) ((xdh) this.f).c;
        String str = (String) jtcVar.b;
        if (str != null) {
            sfm sfmVar = (sfm) jtcVar.a;
            if (aabVar instanceof lt) {
                switch (mzo.a[((lt) aabVar).b.ordinal()]) {
                    case 1:
                    case 3:
                    case 5:
                    case 6:
                    case 7:
                        wjbVar = wjb.AlbumScreen;
                        break;
                    case 2:
                        wjbVar = wjb.CompilationsScreen;
                        break;
                    case 4:
                        wjbVar = wjb.PodcastScreen;
                        break;
                    case 8:
                    case 9:
                        wjbVar = wjb.AudiobookScreen;
                        break;
                    default:
                        b6e.s();
                        return;
                }
            } else if (aabVar instanceof u51) {
                wjbVar = wjb.ArtistScreen;
            } else {
                if (!(aabVar instanceof eul)) {
                    b6e.s();
                    return;
                }
                wjbVar = wjb.PlaylistScreen;
            }
            wjb wjbVar2 = wjbVar;
            nmb nmbVar = (nmb) sfmVar.b;
            String id = aabVar.getId();
            pkb R = ezf.R(aabVar);
            int i2 = i + 1;
            String G = ((fnb) sfmVar.a).G();
            wjb wjbVar3 = wjb.SearchScreen;
            qkb qkbVar = qkb.Carousel;
            String concat = "search_request:".concat(str);
            String str2 = (String) ((LinkedHashMap) sfmVar.c).get(aabVar.getId());
            if (str2 == null) {
                str2 = "";
            }
            nmbVar.n(wjbVar3, wjbVar2, G, wjbVar3, (r60 & 16) != 0 ? ilb.Fullscreen : null, (r60 & 32) != 0 ? glb.Fullscreen : null, (r60 & 64) != 0 ? "" : null, (r60 & 128) != 0 ? pkb.NonApplicable : null, (r60 & 256) != 0 ? "" : null, R, id, (r60 & 2048) != 0 ? 0 : 1, (r60 & 4096) != 0 ? 0 : i2, (r60 & RemoteCameraConfig.Notification.ID) != 0 ? "" : "top", (r60 & 16384) != 0 ? 0 : 1, (32768 & r60) != 0 ? false : true, "search_best_results", "SEARCH_BEST_RESULTS", 1, (524288 & r60) != 0 ? 1 : 0, (1048576 & r60) != 0 ? 0 : 1, (2097152 & r60) != 0 ? "" : concat, (4194304 & r60) != 0 ? "" : null, (8388608 & r60) != 0 ? "" : null, (16777216 & r60) != 0 ? 0 : 0, str2, "", "", (r60 & 268435456) != 0 ? "" : "");
        }
        t l = ((b6p) ((atn) this.d).c).l();
        if (l != null) {
            if (aabVar instanceof lt) {
                h = quj.V(l, (lt) aabVar, null);
            } else if (aabVar instanceof u51) {
                int i3 = ArtistScreenActivity.w0;
                h = l48.p(l, (u51) aabVar, null, null, 24);
            } else if (!(aabVar instanceof eul)) {
                b6e.s();
                return;
            } else {
                int i4 = PlaylistScreenActivity.B0;
                h = dxl.h(l, (eul) aabVar, null);
            }
            l.startActivity(h);
        }
    }

    public String D0(String str, mwk mwkVar, i3q i3qVar) {
        k10 k10Var;
        Resources resources = (Resources) this.b;
        str.getClass();
        mwkVar.getClass();
        i3qVar.getClass();
        int ordinal = i3qVar.ordinal();
        if (ordinal == 0) {
            ((jkl) this.c).getClass();
            mqs a = mwkVar.a();
            String string = resources.getString((a == null || (k10Var = a.d) == null) ? false : u2x.K(k10Var) ? R.string.header_now_playing_podcast : R.string.header_now_playing_album, str);
            string.getClass();
            return string;
        }
        if (ordinal != 1) {
            b6e.s();
            return null;
        }
        String string2 = resources.getString(R.string.header_now_playing_history_entity, str);
        string2.getClass();
        return string2;
    }

    @Override // defpackage.bjr
    public void E(rym rymVar) {
        if (((rym) this.f) == null) {
            this.f = rymVar;
            return;
        }
        synchronized (((uhe) this.b)) {
            uhe uheVar = (uhe) this.b;
            sgr i = sgr.n.i("too many messages");
            uheVar.b(i, i, false);
        }
    }

    public String E0(String str, k3q k3qVar) {
        Resources resources = (Resources) this.b;
        str.getClass();
        k3qVar.getClass();
        int ordinal = k3qVar.ordinal();
        if (ordinal == 0) {
            String string = resources.getString(R.string.header_now_playing_artist, str);
            string.getClass();
            return string;
        }
        if (ordinal == 1) {
            String string2 = resources.getString(R.string.header_now_playing_artist_familiar_collection, str);
            string2.getClass();
            return string2;
        }
        if (ordinal == 2) {
            String string3 = resources.getString(R.string.header_now_playing_artist_familiar_wave, str);
            string3.getClass();
            return string3;
        }
        if (ordinal != 3) {
            b6e.s();
            return null;
        }
        String string4 = resources.getString(R.string.header_now_playing_history_entity, str);
        string4.getClass();
        return string4;
    }

    public List F0(String str, mqs mqsVar) {
        izs a;
        kxi kxiVar = (kxi) this.d;
        e6v e6vVar = (e6v) this.e;
        if (e6vVar instanceof b6v) {
            r3q r3qVar = ((b6v) e6vVar).a;
            r3qVar.getClass();
            a = new b6v(r3qVar);
        } else {
            if (!(e6vVar instanceof d6v)) {
                b6e.s();
                return null;
            }
            a = d6v.a((d6v) e6vVar);
        }
        return t75.c(new jzs(mqsVar, new v80((String) ((zhs) this.f).invoke(), new gxc(kxiVar.a.G(), str), kxiVar.b), null, null, null, null, a, false));
    }

    @Override // defpackage.kqo
    public /* bridge */ /* synthetic */ ImageView G() {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0075 A[Catch: all -> 0x008f, TRY_LEAVE, TryCatch #1 {all -> 0x008f, blocks: (B:28:0x006f, B:30:0x0075), top: B:27:0x006f }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object H0(String str, f7u f7uVar, c0t c0tVar, cg6 cg6Var) {
        a7u a7uVar;
        int i;
        int i2;
        f7u f7uVar2;
        oqi oqiVar;
        c0t c0tVar2;
        Throwable th;
        oqi oqiVar2;
        rar rarVar;
        String str2;
        c0t c0tVar3;
        String str3;
        c0t c0tVar4;
        try {
            if (cg6Var instanceof a7u) {
                a7uVar = (a7u) cg6Var;
                int i3 = a7uVar.q;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    a7uVar.q = i3 - Integer.MIN_VALUE;
                    Object obj = a7uVar.o;
                    nm6 nm6Var = nm6.a;
                    i = a7uVar.q;
                    if (i != 0) {
                        qgg.h0(obj);
                        qqi qqiVar = (qqi) this.e;
                        a7uVar.j = str;
                        a7uVar.k = f7uVar;
                        a7uVar.l = c0tVar;
                        a7uVar.m = qqiVar;
                        i2 = 0;
                        a7uVar.n = 0;
                        a7uVar.q = 1;
                        if (qqiVar.a(a7uVar) != nm6Var) {
                            f7uVar2 = f7uVar;
                            oqiVar = qqiVar;
                            c0tVar2 = c0tVar;
                        }
                        return nm6Var;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        oqiVar2 = a7uVar.m;
                        c0tVar4 = a7uVar.l;
                        f7uVar2 = a7uVar.k;
                        str3 = a7uVar.j;
                        try {
                            qgg.h0(obj);
                            c0tVar3 = c0tVar4;
                            str2 = str3;
                            this.f = x97.y((tf6) this.d, null, null, new ga3(this, str2, f7uVar2, c0tVar3, (Continuation) null), 3);
                            oqiVar2.b(null);
                            return Unit.a;
                        } catch (Throwable th2) {
                            th = th2;
                            oqiVar2.b(null);
                            throw th;
                        }
                    }
                    int i4 = a7uVar.n;
                    oqiVar = a7uVar.m;
                    c0t c0tVar5 = a7uVar.l;
                    f7u f7uVar3 = a7uVar.k;
                    String str4 = a7uVar.j;
                    qgg.h0(obj);
                    c0tVar2 = c0tVar5;
                    f7uVar2 = f7uVar3;
                    i2 = i4;
                    str = str4;
                    rarVar = (rar) this.f;
                    if (rarVar != null) {
                        str2 = str;
                        oqiVar2 = oqiVar;
                        c0tVar3 = c0tVar2;
                        this.f = x97.y((tf6) this.d, null, null, new ga3(this, str2, f7uVar2, c0tVar3, (Continuation) null), 3);
                        oqiVar2.b(null);
                        return Unit.a;
                    }
                    a7uVar.j = str;
                    a7uVar.k = f7uVar2;
                    a7uVar.l = c0tVar2;
                    a7uVar.m = oqiVar;
                    a7uVar.n = i2;
                    a7uVar.q = 2;
                    if (saf.C(rarVar, a7uVar) != nm6Var) {
                        str3 = str;
                        oqiVar2 = oqiVar;
                        c0tVar4 = c0tVar2;
                        c0tVar3 = c0tVar4;
                        str2 = str3;
                        this.f = x97.y((tf6) this.d, null, null, new ga3(this, str2, f7uVar2, c0tVar3, (Continuation) null), 3);
                        oqiVar2.b(null);
                        return Unit.a;
                    }
                    return nm6Var;
                }
            }
            rarVar = (rar) this.f;
            if (rarVar != null) {
            }
        } catch (Throwable th3) {
            oqi oqiVar3 = oqiVar;
            th = th3;
            oqiVar2 = oqiVar3;
            oqiVar2.b(null);
            throw th;
        }
        a7uVar = new a7u(this, cg6Var);
        Object obj2 = a7uVar.o;
        nm6 nm6Var2 = nm6.a;
        i = a7uVar.q;
        if (i != 0) {
        }
    }

    @Override // defpackage.l0p
    public void I(aab aabVar, e4p e4pVar, int i) {
        String str;
        kxi kxiVar = (kxi) this.c;
        xdh xdhVar = (xdh) this.f;
        aabVar.getClass();
        e4pVar.getClass();
        if (!I0(aabVar)) {
            dfi.r("Launch queue for restricted item, " + aabVar, "SearchDomainItemPresenterImpl");
            return;
        }
        String t = weo.t();
        a6l a = kxiVar.a(t);
        int ordinal = e4pVar.ordinal();
        if (ordinal == 0 || ordinal == 1 || ordinal == 2) {
            nnd nndVar = (nnd) this.e;
            pxm H = cb0.H(aabVar);
            boolean z = e4pVar == e4p.c;
            nndVar.getClass();
            nndVar.N(H, t0p.a, z);
        } else if (ordinal != 3 && ordinal != 4) {
            b6e.s();
            return;
        }
        bbb bbbVar = (bbb) this.b;
        cvo cvoVar = (cvo) xdhVar.a;
        jtc jtcVar = (jtc) xdhVar.c;
        jab jabVar = new jab(qkb.SearchBestResults, 1, 1, 0);
        String id = aabVar.getId();
        pkb R = ezf.R(aabVar);
        id.getClass();
        qls d = bbbVar.d(aabVar, new w5l(cvoVar, jabVar, new thj(R, id, 1, i + 1, ""), null), a, kxiVar);
        int i2 = d == null ? -1 : m0p.a[d.ordinal()];
        if (i2 == 1) {
            String str2 = (String) jtcVar.b;
            if (str2 == null) {
                return;
            }
            ((sfm) jtcVar.a).C(str2, aabVar.getId(), ezf.R(aabVar), i, true);
            return;
        }
        if (i2 != 2) {
            if (i2 == 3 && (str = (String) jtcVar.b) != null) {
                ((sfm) jtcVar.a).K(str, aabVar.getId(), ezf.R(aabVar), i, t, "");
                return;
            }
            return;
        }
        String str3 = (String) jtcVar.b;
        if (str3 == null) {
            return;
        }
        ((sfm) jtcVar.a).C(str3, aabVar.getId(), ezf.R(aabVar), i, false);
    }

    public pjc J0(String str, String str2, String str3, o3q o3qVar) {
        String str4;
        Resources resources = (Resources) this.b;
        str.getClass();
        o3qVar.getClass();
        int i = 15;
        Continuation continuation = null;
        if ("3".equals(str)) {
            str4 = resources.getString(R.string.favorite_playlist_title);
            str4.getClass();
        } else {
            str4 = (str2 == null || StringsKt.U(str2)) ? null : str2;
            if (str4 == null) {
                return new fs(i, continuation);
            }
        }
        int ordinal = o3qVar.ordinal();
        if (ordinal == 0) {
            return new fs(i, resources.getString(R.string.header_now_playing_history_entity, str2));
        }
        if (ordinal != 1) {
            b6e.s();
            return null;
        }
        if (str3 == null || StringsKt.U(str3) || str3.equals("all")) {
            String string = resources.getString(R.string.header_now_playing_playlist, str4);
            string.getClass();
            return new fs(i, string);
        }
        bdc bdcVar = (bdc) ((jyr) this.f).getValue();
        bdcVar.getClass();
        return new u21(17, new eno(new j57(bdcVar, str3, continuation, 26)), this, str4);
    }

    public Pair K0(String str) {
        uz7 uz7Var = (uz7) this.d;
        if (uz7Var instanceof sz7) {
            return new Pair(null, str);
        }
        if (uz7Var instanceof tz7) {
            return new Pair(str, ((Resources) this.b).getString(R.string.header_now_playing_cast, ((tz7) uz7Var).c));
        }
        b6e.s();
        return null;
    }

    @Override // defpackage.kqo
    public TextView L() {
        return (TextView) this.e;
    }

    public pjc L0(izs izsVar, mwk mwkVar) {
        pjc fsVar;
        Pair M0;
        int i = 15;
        String str = null;
        if (!(izsVar instanceof e6v)) {
            if (Intrinsics.d(izsVar, hzs.a)) {
                ssg.a(7, null, "This should not happen. Track source should be always filled in wave queue", null);
                return new fs(i, K0(null));
            }
            b6e.s();
            return null;
        }
        e6v e6vVar = (e6v) izsVar;
        if (e6vVar instanceof d6v) {
            z4q z4qVar = ((d6v) e6vVar).a;
            if (z4qVar instanceof u4q) {
                u4q u4qVar = (u4q) z4qVar;
                s4v s4vVar = u4qVar.c;
                M0 = M0(s4vVar.a, s4vVar.b, o8g.R(u4qVar.a.a));
            } else if (z4qVar instanceof s4q) {
                s4q s4qVar = (s4q) z4qVar;
                s4v s4vVar2 = s4qVar.c;
                M0 = M0(s4vVar2.a, s4vVar2.b, o8g.R(s4qVar.a.a));
            } else {
                if (!(z4qVar instanceof w4q)) {
                    b6e.s();
                    return null;
                }
                w4q w4qVar = (w4q) z4qVar;
                s4v s4vVar3 = w4qVar.c;
                M0 = M0(s4vVar3.a, s4vVar3.b, o8g.R(w4qVar.a.a));
            }
            return new fs(i, M0);
        }
        if (!(e6vVar instanceof b6v)) {
            b6e.s();
            return null;
        }
        r3q r3qVar = ((b6v) e6vVar).a;
        if (r3qVar instanceof j3q) {
            j3q j3qVar = (j3q) r3qVar;
            fsVar = new fs(i, D0(j3qVar.b.a, mwkVar, j3qVar.c));
        } else if (r3qVar instanceof l3q) {
            l3q l3qVar = (l3q) r3qVar;
            fsVar = new fs(i, E0(l3qVar.b.a, l3qVar.c));
        } else if (r3qVar instanceof p3q) {
            p3q p3qVar = (p3q) r3qVar;
            bd5 bd5Var = p3qVar.a;
            fsVar = J0(bd5Var.a(), p3qVar.c.a, pcg.E(bd5Var), p3qVar.b);
        } else {
            if (!(r3qVar instanceof m3q)) {
                b6e.s();
                return null;
            }
            tyt tytVar = ((m3q) r3qVar).b;
            Resources resources = (Resources) this.b;
            if (Intrinsics.d(tytVar, cyt.a)) {
                str = resources.getString(R.string.header_now_playing_my_music_collections);
            } else if (tytVar instanceof qyt) {
                String str2 = ((qyt) tytVar).a;
                str = str2.length() == 0 ? resources.getString(R.string.header_now_playing_tracks_search_just) : resources.getString(R.string.header_now_playing_search, str2);
            } else if (Intrinsics.d(tytVar, syt.a)) {
                str = resources.getString(R.string.header_now_playing_my_music_collections);
            } else if (!Intrinsics.d(tytVar, ryt.a)) {
                if (!Intrinsics.d(tytVar, dyt.a) && !Intrinsics.d(tytVar, eyt.a)) {
                    b6e.s();
                    return null;
                }
                str = resources.getString(R.string.header_now_playing_history_various);
            }
            fsVar = new fs(i, str);
        }
        return new xcn(fsVar, this, 0);
    }

    public Pair M0(String str, String str2, List list) {
        Resources resources = (Resources) this.b;
        uz7 uz7Var = (uz7) this.d;
        str.getClass();
        list.getClass();
        boolean z = list.size() == 1 && Intrinsics.d(CollectionsKt.Q(list), "user:onyourwave");
        if (uz7Var instanceof sz7) {
            if (z) {
                str2 = null;
            } else if (str2 == null) {
                str2 = q7g.J(list, (skr) ((wt5) this.e).a.getValue());
            }
            return new Pair(str2, str);
        }
        if (!(uz7Var instanceof tz7)) {
            b6e.s();
            return null;
        }
        if (!z) {
            if (str2 == null) {
                str = resources.getString(R.string.header_now_playing_radio_my_vibe, str);
                str.getClass();
            } else {
                str = str2;
            }
        }
        String string = resources.getString(R.string.header_now_playing_cast, ((tz7) uz7Var).c);
        string.getClass();
        return new Pair(str, string);
    }

    public SmarthomeResult N0() {
        Map unmodifiableMap;
        ij2 ij2Var = (ij2) this.e;
        String str = (String) this.b;
        ij2Var.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        pv9 pv9Var = new pv9(9);
        Locale locale = Locale.ENGLISH;
        pv9Var.e("Authorization", "OAuth " + str);
        pv9Var.e(HttpMessage.CONTENT_TYPE_HEADER, "application/json");
        s7e s7eVar = new s7e();
        s7eVar.n("https");
        s7eVar.g("iot.quasar.yandex.ru");
        s7eVar.c("glagol/user/info", false);
        Iterator it = ((EnumSet) this.c).iterator();
        while (it.hasNext()) {
            s7eVar.d("scope", ((DeviceScope) it.next()).getParamName());
        }
        u7e e = s7eVar.e();
        zvd r = pv9Var.r();
        byte[] bArr = cvt.a;
        if (linkedHashMap.isEmpty()) {
            unmodifiableMap = e5b.a;
            unmodifiableMap.getClass();
        } else {
            unmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(linkedHashMap));
            unmodifiableMap.getClass();
        }
        d0o d0oVar = new d0o(e, ServiceCommand.TYPE_GET, r, null, unmodifiableMap);
        long currentTimeMillis = System.currentTimeMillis();
        try {
            OkHttpClient okHttpClient = ij2Var.a;
            okHttpClient.getClass();
            l3o execute = new mkn(okHttpClient, d0oVar, false).execute();
            int i = execute.d;
            long currentTimeMillis2 = System.currentTimeMillis();
            if (i < 200 || i >= 300) {
                try {
                    ((a4i) this.d).e("BackendDeviceListFailure", "iot", currentTimeMillis, currentTimeMillis2, execute);
                    throw new IOException("failed to get " + e + " status code: " + i);
                } catch (Exception e2) {
                    e = e2;
                    currentTimeMillis = currentTimeMillis;
                }
            } else {
                o3o o3oVar = execute.g;
                if (o3oVar == null) {
                    throw new IOException("no response got from " + e);
                }
                Gson gson = (Gson) this.f;
                Reader b = o3oVar.b();
                gson.getClass();
                SmarthomeResult smarthomeResult = (SmarthomeResult) gson.c(b, TypeToken.get(SmarthomeResult.class));
                List<SmartDevice> list = smarthomeResult.devices;
                list.getClass();
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (((SmartDevice) obj).isQuasarDevice()) {
                        arrayList.add(obj);
                    }
                }
                smarthomeResult.devices = arrayList;
                try {
                    ((a4i) this.d).h(currentTimeMillis, currentTimeMillis2, smarthomeResult);
                    return smarthomeResult;
                } catch (Exception e3) {
                    e = e3;
                    currentTimeMillis = currentTimeMillis;
                }
            }
        } catch (Exception e4) {
            e = e4;
        }
        a4i a4iVar = (a4i) this.d;
        a4iVar.getClass();
        a4iVar.a.S("BackendDeviceListError", e);
        if (0 == 0) {
            ((a4i) this.d).d("BackendDeviceListError", "iot", currentTimeMillis, System.currentTimeMillis(), d0oVar, e);
        }
        if (e instanceof IOException) {
            throw e;
        }
        throw new IOException("failed to get registered devices", e);
    }

    @Override // defpackage.tjp
    public qgr O() {
        return ((oxj) this.c).c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0064, code lost:
    
        if (defpackage.saf.C(r4, r0) == r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0066, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0051, code lost:
    
        if (r8.a(r0) == r1) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005a A[Catch: all -> 0x0067, TRY_LEAVE, TryCatch #0 {all -> 0x0067, blocks: (B:25:0x0054, B:27:0x005a), top: B:24:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r4v4, types: [oqi] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object O0(cg6 cg6Var) {
        b7u b7uVar;
        int i;
        qqi qqiVar;
        int i2;
        oqi oqiVar;
        Throwable th;
        rar rarVar;
        try {
            if (cg6Var instanceof b7u) {
                b7uVar = (b7u) cg6Var;
                int i3 = b7uVar.n;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    b7uVar.n = i3 - Integer.MIN_VALUE;
                    Object obj = b7uVar.l;
                    nm6 nm6Var = nm6.a;
                    i = b7uVar.n;
                    if (i != 0) {
                        qgg.h0(obj);
                        qqiVar = (qqi) this.e;
                        b7uVar.j = qqiVar;
                        i2 = 0;
                        b7uVar.k = 0;
                        b7uVar.n = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            oqiVar = b7uVar.j;
                            try {
                                qgg.h0(obj);
                                this.f = null;
                                oqiVar.b(null);
                                return Unit.a;
                            } catch (Throwable th2) {
                                th = th2;
                                oqiVar.b(null);
                                throw th;
                            }
                        }
                        i2 = b7uVar.k;
                        ?? r4 = b7uVar.j;
                        qgg.h0(obj);
                        qqiVar = r4;
                    }
                    rarVar = (rar) this.f;
                    if (rarVar != null) {
                        b7uVar.j = qqiVar;
                        b7uVar.k = i2;
                        b7uVar.n = 2;
                    }
                    oqiVar = qqiVar;
                    this.f = null;
                    oqiVar.b(null);
                    return Unit.a;
                }
            }
            rarVar = (rar) this.f;
            if (rarVar != null) {
            }
            oqiVar = qqiVar;
            this.f = null;
            oqiVar.b(null);
            return Unit.a;
        } catch (Throwable th3) {
            oqiVar = qqiVar;
            th = th3;
            oqiVar.b(null);
            throw th;
        }
        b7uVar = new b7u(this, cg6Var);
        Object obj2 = b7uVar.l;
        nm6 nm6Var2 = nm6.a;
        i = b7uVar.n;
        if (i != 0) {
        }
    }

    public void P0(bd2 bd2Var, u9t u9tVar) {
        t9t t9tVar = (t9t) this.f;
        de2 de2Var = (de2) this.b;
        String str = (String) this.c;
        m7t m7tVar = (m7t) this.e;
        if (m7tVar == null) {
            jj4.j("Null transformer");
            return;
        }
        p6b p6bVar = (p6b) this.d;
        eq7 eq7Var = t9tVar.c;
        de2 b = de2Var.b(bd2Var.c);
        m mVar = new m();
        mVar.g = new HashMap();
        mVar.e = Long.valueOf(t9tVar.a.a());
        mVar.f = Long.valueOf(t9tVar.b.a());
        mVar.b = str;
        mVar.d = new i6b(p6bVar, (byte[]) m7tVar.apply(bd2Var.b));
        mVar.c = bd2Var.a;
        td2 td2Var = bd2Var.d;
        if (td2Var != null) {
            mVar.h = td2Var.a;
        }
        eq7Var.b.execute(new r8(eq7Var, b, u9tVar, mVar.c(), 3));
    }

    @Override // defpackage.tjp
    public void Q(sgr sgrVar, s2i s2iVar) {
        try {
            synchronized (((oxj) this.c)) {
                oxj oxjVar = (oxj) this.c;
                s2i s2iVar2 = (s2i) this.e;
                rym rymVar = (rym) this.f;
                if (oxjVar.m == null) {
                    if (s2iVar2 != null) {
                        oxjVar.l = s2iVar2;
                    }
                    oxjVar.e = true;
                    if (rymVar != null) {
                        oxjVar.e = true;
                        ConcurrentLinkedQueue concurrentLinkedQueue = oxjVar.g;
                        if (concurrentLinkedQueue != null) {
                            concurrentLinkedQueue.add(rymVar);
                        } else if (oxjVar.f == null) {
                            oxjVar.f = rymVar;
                        } else {
                            ConcurrentLinkedQueue concurrentLinkedQueue2 = new ConcurrentLinkedQueue();
                            oxjVar.g = concurrentLinkedQueue2;
                            concurrentLinkedQueue2.add(rymVar);
                        }
                    }
                    o2g.V(oxjVar.n == null);
                    oxjVar.m = sgrVar;
                    oxjVar.n = s2iVar;
                    oxjVar.h = true;
                    oxjVar.c();
                }
            }
            synchronized (((uhe) this.b)) {
                uhe uheVar = (uhe) this.b;
                vhe vheVar = uheVar.n;
                vhe vheVar2 = vhe.f;
                if (vheVar != vheVar2) {
                    uheVar.g(vheVar2);
                    uheVar.e.g(sgrVar);
                    ((ujp) uheVar.f).s(sgr.e);
                }
            }
        } catch (tgr e) {
            synchronized (((uhe) this.b)) {
                uhe uheVar2 = (uhe) this.b;
                sgr sgrVar2 = e.a;
                uheVar2.b(sgrVar2, sgrVar2, false);
            }
        }
    }

    public void Q0(boolean z) {
        View view = (View) this.b;
        if (!z) {
            jyr jyrVar = sht.a;
            if (view != null) {
                view.setVisibility(8);
                return;
            }
            return;
        }
        View[] viewArr = {(ImageView) this.c, (TextView) this.d, (Button) this.e};
        jyr jyrVar2 = sht.a;
        for (int i = 0; i < 3; i++) {
            View view2 = viewArr[i];
            if (view2 != null) {
                view2.setVisibility(8);
            }
        }
        if (view != null) {
            view.setVisibility(0);
        }
    }

    public void R0(Uri uri) {
        int i;
        Context context = (Context) this.b;
        if (uri == null) {
            S0();
            return;
        }
        if (uri.equals((Uri) this.d)) {
            return;
        }
        S0();
        this.d = uri;
        sbe sbeVar = (sbe) this.c;
        int i2 = sbeVar.b;
        if (i2 == 0 || (i = sbeVar.c) == 0) {
            this.e = new p8x(context, 0, 0, this);
        } else {
            this.e = new p8x(context, i2, i, this);
        }
        p8x p8xVar = (p8x) this.e;
        y1g.G(p8xVar);
        Uri uri2 = (Uri) this.d;
        y1g.G(uri2);
        p8xVar.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, uri2);
    }

    public void S0() {
        p8x p8xVar = (p8x) this.e;
        if (p8xVar != null) {
            p8xVar.cancel(true);
            this.e = null;
        }
        this.d = null;
    }

    @Override // defpackage.ver
    public void U(qlr qlrVar) {
        ((yjj) this.d).a(qlrVar);
    }

    @Override // defpackage.ver
    public void V(qlr qlrVar) {
        qlrVar.getClass();
        ((yjj) this.d).e(qlrVar);
    }

    @Override // defpackage.bjr
    public void a() {
        synchronized (((uhe) this.b)) {
            uhe uheVar = (uhe) this.b;
            uheVar.p++;
            uheVar.c();
        }
    }

    @Override // defpackage.wa6
    public void accept(Object obj) {
        AtomicReference atomicReference = (AtomicReference) this.c;
        Object obj2 = atomicReference.get();
        while (!atomicReference.compareAndSet(obj2, obj)) {
            if (atomicReference.get() != obj2) {
                return;
            }
        }
        if (((AtomicBoolean) this.e).compareAndSet(false, true)) {
            ((Handler) this.b).post((bhp) this.f);
        }
    }

    @Override // defpackage.ib7
    public va7 b(t6t t6tVar) {
        ib7 yk7Var;
        br3 br3Var = (br3) this.f;
        if (br3Var != null) {
            return br3Var.b(t6tVar);
        }
        cnm cnmVar = (cnm) ((anm) this.b);
        Object obj = cnmVar.b;
        if (obj == null) {
            obj = cnmVar.c;
        }
        if (obj == null) {
            cnmVar.a();
        }
        liq liqVar = cnmVar.b;
        OkHttpClient okHttpClient = (OkHttpClient) this.c;
        if (liqVar != null) {
            yk7Var = new br3(liqVar, okHttpClient, (t8w) this.d, (uq3) this.e);
            this.f = yk7Var;
        } else {
            yk7Var = new yk7(okHttpClient);
        }
        return yk7Var.b(t6tVar);
    }

    @Override // defpackage.tjp
    public String b0() {
        xu1 xu1Var = (xu1) this.d;
        return (String) xu1Var.a.get(y13.p);
    }

    @Override // defpackage.l0p
    public pjc c(aab aabVar) {
        aabVar.getClass();
        return ((bbb) this.b).c(aabVar);
    }

    @Override // defpackage.tjp
    public void d0(s2i s2iVar) {
        this.e = s2iVar;
    }

    @Override // defpackage.u0f
    public List e0() {
        boolean contains;
        Continuation continuation = null;
        if (!rvf.G((cvl) this.b)) {
            rj6 rj6Var = (rj6) x97.D(g.a, new g2l(this, continuation, 12));
            if (rj6Var instanceof qj6) {
                List list = ((rrl) ((qj6) rj6Var).a).c;
                if (list != null) {
                    return list;
                }
                xq0.x("Required value was null.");
                return null;
            }
            if (rj6Var instanceof nj6) {
                return c5b.a;
            }
            if (rj6Var instanceof pj6) {
                throw ((pj6) rj6Var).a();
            }
            b6e.s();
            return null;
        }
        cvl cvlVar = (cvl) this.b;
        if (cvlVar.k < 0) {
            cvl g = ((btl) this.d).g(cvlVar);
            if (g == null) {
                xq0.x("Required value was null.");
                return null;
            }
            this.b = g;
        }
        cus cusVar = (cus) this.c;
        cvl cvlVar2 = (cvl) this.b;
        cusVar.getClass();
        ArrayList a = cus.a(cvlVar2);
        if (!((z66) this.f).h()) {
            return a;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = a.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            mqs mqsVar = (mqs) next;
            if (mqsVar == null) {
                su4.s(2, null, "PermanentCachedTrackPredicate: track is null", null);
                contains = false;
            } else {
                l18 l18Var = l18.b;
                bdt I = hag.I(uaa.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                contains = ((lja) ((e6q) ((uaa) qdcVar.C(I))).e.getValue()).a.contains(mqsVar.a);
            }
            if (contains) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    @Override // defpackage.tjp
    public void f(sgr sgrVar) {
        synchronized (((uhe) this.b)) {
            ((uhe) this.b).b(sgr.f, sgrVar, false);
        }
    }

    @Override // defpackage.l0p
    public void g0(aab aabVar, e4p e4pVar, int i) {
        l5t l5tVar;
        aabVar.getClass();
        e4pVar.getClass();
        if (!I0(aabVar)) {
            dfi.r("Open trailer of restricted item, " + aabVar, "SearchDomainItemPresenterImpl");
            return;
        }
        jtc jtcVar = (jtc) ((xdh) this.f).c;
        String str = (String) jtcVar.b;
        if (str != null) {
            sfm sfmVar = (sfm) jtcVar.a;
            nmb nmbVar = (nmb) sfmVar.b;
            wjb wjbVar = wjb.TrailerScreen;
            String id = aabVar.getId();
            pkb R = ezf.R(aabVar);
            int i2 = i + 1;
            String G = ((fnb) sfmVar.a).G();
            wjb wjbVar2 = wjb.SearchScreen;
            qkb qkbVar = qkb.Carousel;
            String concat = "search_request:".concat(str);
            String str2 = (String) ((LinkedHashMap) sfmVar.c).get(aabVar.getId());
            if (str2 == null) {
                str2 = "";
            }
            nmbVar.n(wjbVar2, wjbVar, G, wjbVar2, (r60 & 16) != 0 ? ilb.Fullscreen : null, (r60 & 32) != 0 ? glb.Fullscreen : null, (r60 & 64) != 0 ? "" : null, (r60 & 128) != 0 ? pkb.NonApplicable : null, (r60 & 256) != 0 ? "" : null, R, id, (r60 & 2048) != 0 ? 0 : 1, (r60 & 4096) != 0 ? 0 : i2, (r60 & RemoteCameraConfig.Notification.ID) != 0 ? "" : "top", (r60 & 16384) != 0 ? 0 : 1, (32768 & r60) != 0 ? false : true, "search_best_results", "SEARCH_BEST_RESULTS", 1, (524288 & r60) != 0 ? 1 : 0, (1048576 & r60) != 0 ? 0 : 1, (2097152 & r60) != 0 ? "" : concat, (4194304 & r60) != 0 ? "" : null, (8388608 & r60) != 0 ? "" : null, (16777216 & r60) != 0 ? 0 : 0, str2, "", "", (r60 & 268435456) != 0 ? "" : "");
        }
        atn atnVar = (atn) this.d;
        t tVar = (t) atnVar.b;
        c3x.C(tVar);
        y supportFragmentManager = tVar.getSupportFragmentManager();
        supportFragmentManager.getClass();
        l5t.a.getClass();
        if (aabVar instanceof lt) {
            l5tVar = i5l.b(((lt) aabVar).b);
        } else if (aabVar instanceof u51) {
            l5tVar = l5t.e;
        } else {
            if (!(aabVar instanceof eul)) {
                b6e.s();
                return;
            }
            l5tVar = l5t.d;
        }
        mvn.T(supportFragmentManager, l5tVar, aabVar.getId(), false, ((b6p) atnVar.c).d(), null);
    }

    @Override // defpackage.tjp
    public xu1 getAttributes() {
        return (xu1) this.d;
    }

    @Override // defpackage.adu
    public View getRoot() {
        return (LinearLayout) ((dn9) this.b).b;
    }

    @Override // defpackage.p7q
    public Object m(ioc iocVar) {
        iocVar.getClass();
        throw null;
    }

    @Override // defpackage.p7q
    public Object n(szu szuVar) {
        szuVar.getClass();
        jzs jzsVar = szuVar.l;
        return L0(jzsVar.g, jzsVar);
    }

    @Override // defpackage.kqo, defpackage.wqo
    public TextView o() {
        return (TextView) this.f;
    }

    @Override // defpackage.bjr
    public boolean p() {
        return ((oxj) this.c).a.i();
    }

    @Override // defpackage.p7q
    public Object q(y4d y4dVar) {
        y4dVar.getClass();
        String str = y4dVar.a.b;
        str.getClass();
        String string = ((Resources) this.b).getString(R.string.header_now_playing_station, str);
        string.getClass();
        return new fs(15, K0(string));
    }

    @Override // defpackage.p7q
    public Object q0(maq maqVar) {
        maqVar.getClass();
        int i = 15;
        if (maqVar instanceof vaq) {
            return new fs(i, K0(null));
        }
        if (maqVar instanceof eaq) {
            String str = ((eaq) maqVar).b.d;
            str.getClass();
            String string = ((Resources) this.b).getString(R.string.header_now_playing_station, str);
            string.getClass();
            return new fs(i, K0(string));
        }
        if (maqVar instanceof raq) {
            return new fs(i, K0(null));
        }
        if (maqVar instanceof jbq) {
            jbq jbqVar = (jbq) maqVar;
            return L0(q7g.I(jbqVar.b().e()), jbqVar.b());
        }
        b6e.s();
        return null;
    }

    @Override // defpackage.p7q
    public Object t(t1q t1qVar) {
        t1qVar.getClass();
        z3q z3qVar = t1qVar.a;
        int i = 15;
        if (z3qVar instanceof c1q) {
            return new fs(i, K0(D0(((c1q) z3qVar).d, t1qVar.c, i3q.a)));
        }
        if (z3qVar instanceof e1q) {
            return new fs(i, K0(E0(((e1q) z3qVar).d, k3q.a)));
        }
        if (z3qVar instanceof r1q) {
            r1q r1qVar = (r1q) z3qVar;
            return new xcn(J0(r1qVar.c.a.b, r1qVar.d, null, o3q.b), this, 1);
        }
        if (z3qVar instanceof a2q) {
            return new fs(i, K0(null));
        }
        if (z3qVar instanceof h1q) {
            String str = ((h1q) z3qVar).c;
            str.getClass();
            String string = ((Resources) this.b).getString(R.string.header_now_playing_station, str);
            string.getClass();
            return new fs(i, K0(string));
        }
        if (z3qVar instanceof k1q) {
            return new fs(i, K0(null));
        }
        if (!(z3qVar instanceof u1q)) {
            b6e.s();
            return null;
        }
        u1q u1qVar = (u1q) z3qVar;
        String str2 = u1qVar.d;
        List list = u1qVar.a.b;
        list.getClass();
        return new fs(i, M0(str2, null, list));
    }

    @Override // defpackage.kqo
    public TextInputLayout t0() {
        return (TextInputLayout) this.d;
    }

    public String toString() {
        switch (this.a) {
            case 8:
                return "SingleMessageServerStream[" + ((uhe) this.b) + "/" + ((oxj) this.c) + "]";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.p7q
    public Object u(u7u u7uVar) {
        u7uVar.getClass();
        return new fs(15, K0(null));
    }

    @Override // defpackage.kqo
    public RecyclerView x0() {
        return (RecyclerView) this.c;
    }

    @Override // defpackage.tjp
    public void z0(ujp ujpVar) {
        synchronized (((uhe) this.b)) {
            uhe uheVar = (uhe) this.b;
            oxj oxjVar = (oxj) this.c;
            uheVar.d = oxjVar;
            uheVar.e = oxjVar.c;
            uheVar.f = ujpVar;
            if (uheVar.n != vhe.f) {
                uheVar.g(vhe.b);
            }
        }
    }

    @Override // defpackage.bjr
    public void X() {
    }

    @Override // defpackage.bjr
    public void flush() {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public n3m(Context context) {
        this(context, new sbe(-1, 0, 0));
        this.a = 18;
    }

    public n3m(Context context, sbe sbeVar) {
        this.a = 18;
        this.b = context;
        this.c = sbeVar;
        S0();
    }

    public n3m(int i) {
        this.a = i;
        switch (i) {
            case 15:
                this.b = new ReentrantLock();
                this.c = new pv9(15);
                this.d = new HashMap();
                this.e = new HashMap();
                this.f = new HashMap();
                break;
        }
    }

    public n3m(ngv ngvVar, v3f v3fVar, WebMessengerNavigationInterceptor webMessengerNavigationInterceptor) {
        this.a = 17;
        v3fVar.getClass();
        this.b = ngvVar;
        this.c = v3fVar;
        this.f = new mh4(new q0v(5, this));
    }

    public n3m(anm anmVar, OkHttpClient okHttpClient, t8w t8wVar, uq3 uq3Var) {
        this.a = 3;
        okHttpClient.getClass();
        this.b = anmVar;
        this.c = okHttpClient;
        this.d = t8wVar;
        this.e = uq3Var;
    }

    public n3m(bjt bjtVar, yks yksVar, a aVar) {
        this.a = 16;
        aVar.getClass();
        this.b = bjtVar;
        this.c = yksVar;
        this.d = gld.e(aVar);
        this.e = rqi.a();
    }

    @Override // defpackage.bjr
    public void r(nq4 nq4Var) {
    }

    public n3m(cvl cvlVar) {
        this.a = 0;
        cvlVar.getClass();
        this.b = cvlVar;
        this.c = new cus();
        this.d = new btl();
        bdt I = hag.I(cut.class);
        l18 l18Var = l18.b;
        this.e = (cut) l18Var.c(I);
        this.f = (z66) l18Var.c(hag.I(z66.class));
    }

    public n3m(Handler handler) {
        this.a = 11;
        this.b = handler;
        this.c = new AtomicReference(null);
        this.d = new yjj();
        this.e = new AtomicBoolean(false);
        this.f = new bhp(7, this);
    }

    public n3m(String str, EnumSet enumSet, a4i a4iVar) {
        this.a = 9;
        str.getClass();
        a4iVar.getClass();
        this.b = str;
        this.c = enumSet;
        this.d = a4iVar;
        this.e = new ij2("iot.quasar.yandex.ru");
        this.f = new Gson();
    }

    public n3m(f7l f7lVar, k1l k1lVar, kxi kxiVar, e6v e6vVar, zhs zhsVar) {
        this.a = 13;
        f7lVar.getClass();
        k1lVar.getClass();
        kxiVar.getClass();
        e6vVar.getClass();
        this.b = f7lVar;
        this.c = k1lVar;
        this.d = kxiVar;
        this.e = e6vVar;
        this.f = zhsVar;
    }

    public n3m(Activity activity, y yVar, a6n a6nVar, x5n x5nVar) {
        this.a = 1;
        activity.getClass();
        yVar.getClass();
        this.b = a6nVar;
        this.c = x5nVar;
        this.d = btf.b(new p1n(3, this));
        this.e = new jp0(new ebm(0, x5nVar, w5n.class, "onClose", "onClose()V", 0, 25));
        this.f = new sai(false);
    }

    public n3m(dn9 dn9Var) {
        this.a = 4;
        this.b = dn9Var;
        this.c = (RecyclerView) dn9Var.c;
        this.d = (TextInputLayout) dn9Var.f;
        this.e = (TextView) dn9Var.e;
        this.f = (TextView) dn9Var.d;
    }

    public n3m(bbb bbbVar, kxi kxiVar, atn atnVar, nnd nndVar, xdh xdhVar) {
        this.a = 5;
        nndVar.getClass();
        xdhVar.getClass();
        this.b = bbbVar;
        this.c = kxiVar;
        this.d = atnVar;
        this.e = nndVar;
        this.f = xdhVar;
    }

    public n3m(de2 de2Var, String str, p6b p6bVar, m7t m7tVar, t9t t9tVar) {
        this.a = 14;
        this.b = de2Var;
        this.c = str;
        this.d = p6bVar;
        this.e = m7tVar;
        this.f = t9tVar;
    }

    public n3m(uhe uheVar, oxj oxjVar, xu1 xu1Var) {
        this.a = 8;
        this.b = uheVar;
        this.c = oxjVar;
        this.d = xu1Var;
    }

    public n3m(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.a = 7;
        this.e = new ArrayDeque();
        this.b = sharedPreferences;
        this.c = "topic_operation_queue";
        this.d = StringUtils.COMMA;
        this.f = scheduledThreadPoolExecutor;
    }

    public n3m(String str, String str2, String str3, String str4, String str5) {
        this.a = 12;
        dfi.s(str, str2, str3);
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
    }

    public n3m(Resources resources, jkl jklVar, uz7 uz7Var, wt5 wt5Var) {
        this.a = 2;
        resources.getClass();
        jklVar.getClass();
        uz7Var.getClass();
        this.b = resources;
        this.c = jklVar;
        this.d = uz7Var;
        this.e = wt5Var;
        this.f = btf.b(new p1n(9));
    }
}
