package defpackage;

import android.R;
import android.net.Uri;
import android.os.Build;
import android.view.Menu;
import androidx.media3.exoplayer.ExoPlayer;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import com.yandex.messenger.websdk.api.ChatRequest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class eps implements adu, ika {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;

    public eps(b7q b7qVar, maa maaVar, zvs zvsVar, vzg vzgVar, gy1 gy1Var, be6 be6Var) {
        b7qVar.getClass();
        zvsVar.getClass();
        be6Var.getClass();
        gy1 gy1Var2 = gy1Var == null ? gy1.c : gy1Var;
        msa msaVar = nsa.b;
        ssa ssaVar = ssa.MILLISECONDS;
        onh c = onh.c(v3g.X(zvsVar, gy1Var2, yd5.M(0, ssaVar), yd5.M(0, ssaVar), false, vzgVar, null, be6Var).i);
        this.a = b7qVar;
        this.b = maaVar;
        this.c = c;
        if (maaVar == maa.a) {
            xq0.x("Downloader should not be used for play");
            throw null;
        }
        this.d = b7qVar.b(hag.I(fys.class), true);
        this.e = b7qVar.b(hag.I(vts.class), true);
    }

    public static void a(Menu menu, sxh sxhVar) {
        int i;
        int i2 = sxhVar.a;
        int i3 = sxhVar.b;
        int ordinal = sxhVar.ordinal();
        if (ordinal == 0) {
            i = R.string.copy;
        } else if (ordinal == 1) {
            i = R.string.paste;
        } else if (ordinal == 2) {
            i = R.string.cut;
        } else if (ordinal == 3) {
            i = R.string.selectAll;
        } else {
            if (ordinal != 4) {
                b6e.s();
                return;
            }
            i = Build.VERSION.SDK_INT <= 26 ? ru.yandex.music.R.string.autofill : R.string.autofill;
        }
        menu.add(0, i2, i3, i).setShowAsAction(1);
    }

    public static void b(Menu menu, sxh sxhVar, Function0 function0) {
        int i = sxhVar.a;
        if (function0 != null && menu.findItem(i) == null) {
            a(menu, sxhVar);
        } else {
            if (function0 != null || menu.findItem(i) == null) {
                return;
            }
            menu.removeItem(i);
        }
    }

    public static lve e(lve lveVar) {
        o4c o4cVar = lveVar.a;
        o4cVar.getClass();
        return new lve(o4cVar, null);
    }

    public static void i(String str, String str2, Function0 function0) {
        Object invoke = function0.invoke();
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(StringUtil.SPACE);
        sb.append(invoke);
        sb.append(", args(");
        sb.append(str2);
        v3w.m(sb, ") ", 3, "InternalPlayerManager", null);
    }

    public static boolean n(o4c o4cVar, Long l) {
        long max = Math.max(l != null ? l.longValue() : 0L, 0L);
        long max2 = Math.max(o4cVar.a.J0(), 0L);
        if ((max != 0 || max2 == max) && Math.abs(max2 - max) <= 25) {
            return false;
        }
        StringBuilder l2 = tlm.l(max, "seekIfNeeded Seeking to ", ", playerCurrentPosition=");
        l2.append(max2);
        ssg.a(3, "InternalPlayerManager", l2.toString(), null);
        o4cVar.a.s(max);
        return true;
    }

    public void c() {
        ssg.a(3, "InternalPlayerManager", "clearIdlePlayer " + ((Object) ("stop and clear player, " + ((lve) this.d))) + ", args() ", null);
        lve lveVar = (lve) this.d;
        if (lveVar == null) {
            return;
        }
        o4c o4cVar = lveVar.a;
        this.d = e(lveVar);
        o4cVar.a.stop();
        o4cVar.a.y();
        n4c n4cVar = o4cVar.b;
        n4cVar.j = 1.0f;
        n4cVar.i = l4c.a;
    }

    @Override // defpackage.ika
    public void cancel() {
        if (m() == null) {
            return;
        }
        pv9 pv9Var = (pv9) this.f;
        if (pv9Var != null) {
            pv9Var.cancel();
        } else {
            Intrinsics.j("delegate");
            throw null;
        }
    }

    public void d() {
        mal.a();
        ssg.a(3, "InternalPlayerManager", "clearOverlapAndPreheat just clear idle player, args() ", null);
        c();
    }

    public o4c f() {
        o4c o4cVar = (o4c) ((cte) this.a).invoke();
        ExoPlayer exoPlayer = o4cVar.a;
        exoPlayer.N0(h().a.a.g1());
        exoPlayer.u(h().a.a.m().a);
        return o4cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ChatRequest g(String str) {
        ChatRequest chatRequest;
        Iterator it = ((LinkedHashMap) this.a).entrySet().iterator();
        do {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            chatRequest = Intrinsics.d(entry.getValue(), str) ? key : null;
        } while (chatRequest == null);
        return chatRequest;
    }

    public lve h() {
        lve lveVar = (lve) this.c;
        if (lveVar != null) {
            return lveVar;
        }
        lve lveVar2 = new lve((o4c) ((jyr) this.g).getValue(), null);
        this.c = lveVar2;
        return lveVar2;
    }

    public void j(lve lveVar, lve lveVar2) {
        o4c o4cVar;
        o4c o4cVar2;
        o4c o4cVar3 = lveVar2.a;
        i("moveListeners", "", new zya(19, lveVar, lveVar2));
        Iterator it = ((ArrayList) this.e).iterator();
        while (it.hasNext()) {
            f8l f8lVar = (f8l) it.next();
            if (lveVar != null && (o4cVar2 = lveVar.a) != null) {
                o4cVar2.a.x0(f8lVar);
            }
            o4cVar3.a.j0(f8lVar);
        }
        Iterator it2 = ((ArrayList) this.f).iterator();
        while (it2.hasNext()) {
            d80 d80Var = (d80) it2.next();
            if (lveVar != null && (o4cVar = lveVar.a) != null) {
                o4cVar.a.b1(d80Var);
            }
            uj7 f1 = o4cVar3.a.f1();
            f1.getClass();
            d80Var.getClass();
            f1.f.a(d80Var);
        }
    }

    public void k(ExoPlayer exoPlayer) {
        mal.a();
        ssg.a(3, "InternalPlayerManager", hrg.q("releasePlayer , args(", String.valueOf(exoPlayer), ") "), null);
        exoPlayer.stop();
        exoPlayer.y();
        exoPlayer.a();
        ((kzp) this.b).invoke(exoPlayer);
    }

    public void l() {
        Uri uri;
        Object dx6Var;
        gnh gnhVar;
        gnh gnhVar2;
        maa maaVar = (maa) this.b;
        b7q b7qVar = (b7q) this.a;
        gnh gnhVar3 = ((onh) this.c).b;
        if (gnhVar3 == null || (uri = gnhVar3.a) == null) {
            xq0.x("Uri must be provided for YandexMusicTrackDownloader");
            return;
        }
        fts ftsVar = (fts) a4g.N(new y6v(v3g.W(uri), this, (Continuation) null, 20));
        p9 p9Var = ftsVar.d;
        if (p9Var instanceof dts) {
            b7qVar.getClass();
            maaVar.getClass();
            xmh xmhVar = new xmh();
            bnh bnhVar = new bnh();
            List list = Collections.EMPTY_LIST;
            qsn qsnVar = qsn.e;
            dnh dnhVar = new dnh();
            jnh jnhVar = jnh.d;
            Uri fromParts = Uri.fromParts("expecting", "fully", "cached");
            String str = ((dts) p9Var).b;
            vq1.A(((Uri) bnhVar.e) == null || ((UUID) bnhVar.d) != null);
            if (fromParts != null) {
                gnhVar2 = new gnh(fromParts, null, ((UUID) bnhVar.d) != null ? new cnh(bnhVar) : null, null, list, str, qsnVar, -9223372036854775807L);
            } else {
                gnhVar2 = null;
            }
            onh onhVar = new onh("", new anh(xmhVar), gnhVar2, new fnh(dnhVar), hoh.K, jnhVar);
            ip3 ip3Var = (ip3) kg5.G(b7qVar, ftsVar, maaVar).b;
            if (ip3Var == null) {
                throw new aue(null);
            }
            dx6Var = new ovm(onhVar, ip3Var);
        } else if (p9Var instanceof cts) {
            dx6Var = dqb.a(b7qVar, maaVar, ftsVar, (cts) p9Var);
        } else {
            if (!(p9Var instanceof bts)) {
                b6e.s();
                return;
            }
            b7qVar.getClass();
            maaVar.getClass();
            xmh xmhVar2 = new xmh();
            bnh bnhVar2 = new bnh();
            List list2 = Collections.EMPTY_LIST;
            qsn qsnVar2 = qsn.e;
            dnh dnhVar2 = new dnh();
            jnh jnhVar2 = jnh.d;
            Uri uri2 = ((bts) p9Var).b;
            vq1.A(((Uri) bnhVar2.e) == null || ((UUID) bnhVar2.d) != null);
            if (uri2 != null) {
                gnhVar = new gnh(uri2, null, ((UUID) bnhVar2.d) != null ? new cnh(bnhVar2) : null, null, list2, null, qsnVar2, -9223372036854775807L);
            } else {
                gnhVar = null;
            }
            dx6Var = new dx6(new onh("", new anh(xmhVar2), gnhVar, new fnh(dnhVar2), hoh.K, jnhVar2), kg5.s(b7qVar, ftsVar, maaVar, null));
        }
        this.f = new pv9(11, new qec(19, dx6Var));
        this.g = new ess(ftsVar.a, ftsVar.b, ftsVar.c);
    }

    public Unit m() {
        boolean z = ((pv9) this.f) != null;
        if (z) {
            return Unit.a;
        }
        if (!z) {
            return null;
        }
        b6e.s();
        return null;
    }

    public void p(String str) {
        str.getClass();
        rbv rbvVar = (rbv) ((LinkedHashMap) this.g).remove(str);
        if (rbvVar != null) {
            eps epsVar = rbvVar.c;
            qdc qdcVar = (qdc) epsVar.f;
            String str2 = rbvVar.a;
            qdcVar.getClass();
            dwt.b(new zya(18, qdcVar, "wm_web_unobserve " + str2));
            rbvVar.b.cancel();
            jtc jtcVar = (jtc) epsVar.d;
            t3f t3fVar = (t3f) epsVar.c;
            t3fVar.getClass();
            str2.getClass();
            nnd nndVar = t3fVar.a;
            String C = hld.C();
            nndVar.getClass();
            C.getClass();
            jtc.v(jtcVar, t3f.b(nnd.J(nndVar, b0i.Unobserve, new JSONObject().put("objectName", "chatsLastMessageChanged").put("observerId", str2), C)));
        }
    }

    @Override // defpackage.ika
    public void remove() {
        if (m() == null) {
            l();
        }
        pv9 pv9Var = (pv9) this.f;
        if (pv9Var != null) {
            pv9Var.remove();
        } else {
            Intrinsics.j("delegate");
            throw null;
        }
    }

    @Override // defpackage.ika
    public void t(hka hkaVar) {
        boolean z;
        if (m() == null) {
            l();
        }
        fys fysVar = (fys) ((jyr) this.d).getValue();
        ess essVar = (ess) this.g;
        if (essVar == null) {
            Intrinsics.j("downloadRowId");
            throw null;
        }
        zvs zvsVar = essVar.a;
        qdc qdcVar = fysVar.b;
        qdcVar.getClass();
        zvsVar.getClass();
        boolean z2 = true;
        Pair n = qdcVar.n(zvsVar, true);
        wjn wjnVar = (wjn) n.a;
        if (((Boolean) n.b).booleanValue()) {
            z = true;
        } else {
            xdr xdrVar = wjnVar.b;
            ReentrantLock reentrantLock = wjnVar.a;
            reentrantLock.lock();
            try {
                int intValue = ((Number) xdrVar.getValue()).intValue();
                if (intValue > 0) {
                    xdrVar.m(null, Integer.valueOf(((Number) xdrVar.getValue()).intValue() + 1));
                } else if (intValue == 0) {
                    xdrVar.m(null, Integer.valueOf(((Number) xdrVar.getValue()).intValue() + 1));
                } else {
                    z = false;
                }
                z = true;
            } finally {
                reentrantLock.unlock();
            }
        }
        if (!z) {
            qdcVar.K(zvsVar);
            z2 = false;
        }
        if (!z2) {
            x97.D(g.a, new xg(fysVar, zvsVar, (Continuation) null, this, hkaVar));
            return;
        }
        try {
            pv9 pv9Var = (pv9) this.f;
            if (pv9Var == null) {
                Intrinsics.j("delegate");
                throw null;
            }
            pv9Var.t(hkaVar);
            qdcVar.O(zvsVar);
        } catch (Throwable th) {
            qdcVar.O(zvsVar);
            throw th;
        }
    }

    public /* synthetic */ eps(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
        this.e = obj5;
        this.f = obj6;
        this.g = obj7;
    }
}
