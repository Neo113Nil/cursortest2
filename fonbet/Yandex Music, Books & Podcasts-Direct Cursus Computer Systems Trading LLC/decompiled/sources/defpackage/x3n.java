package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.SparseArray;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import androidx.fragment.app.t;
import androidx.fragment.app.y;
import com.yandex.pulse.metrics.o;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import ru.yandex.music.R;
import ru.yandex.music.common.media.context.Page;
import ru.yandex.music.common.media.context.PlaybackScope;
import ru.yandex.music.common.media.context.a;
import ru.yandex.music.common.media.context.e;
import ru.yandex.music.common.media.context.g;
import ru.yandex.music.common.media.context.h;
import timber.log.Timber;

/* loaded from: classes3.dex */
public final class x3n implements p7q, hkq, d5p, pwq, rs1, hg {
    public static x3n e;
    public Object a;
    public Object b;
    public Object c;
    public Object d;

    public x3n(int i) {
        switch (i) {
            case 8:
                this.a = new ReentrantLock();
                this.b = new HashMap();
                this.c = new HashMap();
                this.d = new HashMap();
                break;
            case 19:
                this.a = new Object();
                this.b = new Handler(Looper.getMainLooper(), new ucd(1, this));
                break;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                this.a = new xy0(0);
                this.b = new SparseArray();
                this.c = new ovg((Object) null);
                this.d = new xy0(0);
                break;
            default:
                wfl wflVar = new wfl();
                wvo wvoVar = new wvo(13);
                this.a = new HashSet();
                this.b = wflVar;
                this.c = wvoVar;
                break;
        }
    }

    public static final Message M(x3n x3nVar, ArrayList arrayList, int i) {
        Object obj;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (((Message) obj2).what == i) {
                arrayList2.add(obj2);
            }
        }
        Iterator it = arrayList2.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                long when = ((Message) next).getWhen();
                do {
                    Object next2 = it.next();
                    long when2 = ((Message) next2).getWhen();
                    if (when < when2) {
                        next = next2;
                        when = when2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        return (Message) obj;
    }

    public static String R(List list) {
        return CollectionsKt.X(list, StringUtils.COMMA, null, null, null, 62);
    }

    public static x3n h0() {
        if (e == null) {
            e = new x3n(19);
        }
        return e;
    }

    @Override // defpackage.hg
    public boolean B(ig igVar, Menu menu) {
        ActionMode.Callback callback = (ActionMode.Callback) this.a;
        krr a0 = a0(igVar);
        ciq ciqVar = (ciq) this.d;
        Menu menu2 = (Menu) ciqVar.get(menu);
        if (menu2 == null) {
            menu2 = new oyh((Context) this.b, (hxh) menu);
            ciqVar.put(menu, menu2);
        }
        return callback.onCreateActionMode(a0, menu2);
    }

    public void B0(rr5 rr5Var) {
        t tVar = (t) this.a;
        c3x.C(tVar);
        y supportFragmentManager = tVar.getSupportFragmentManager();
        supportFragmentManager.getClass();
        mvn.T(supportFragmentManager, l5t.f, rr5Var.e(), false, (kxi) this.c, null);
    }

    public void C0(gu2 gu2Var) {
        synchronized (this.a) {
            try {
                if (o0(gu2Var)) {
                    m1r m1rVar = (m1r) this.c;
                    if (!m1rVar.c) {
                        m1rVar.c = true;
                        ((Handler) this.b).removeCallbacksAndMessages(m1rVar);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public qls D0(se5 se5Var, mqs mqsVar) {
        l18 l18Var = l18.b;
        bdt I = hag.I(z5l.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        z5l z5lVar = (z5l) qdcVar.C(I);
        if (z5lVar.c(se5Var.a, mqsVar, false)) {
            return z5lVar.i(false) ? qls.b : qls.c;
        }
        t tVar = (t) this.a;
        tVar.getClass();
        asq.t(z5lVar.d(se5Var, true, uyk.a), tVar, new p1n(8));
        return qls.a;
    }

    @Override // defpackage.d5p
    public pjc E(String str) {
        str.getClass();
        lkm lkmVar = (lkm) this.a;
        lkmVar.getClass();
        return new u21(15, lkmVar.a().b().b, lkmVar, str);
    }

    public pjc E0(String str, String str2, String str3, o3q o3qVar) {
        String str4;
        g8c g8cVar = (g8c) this.c;
        skr skrVar = (skr) g8cVar.a;
        str.getClass();
        o3qVar.getClass();
        int i = 15;
        Continuation continuation = null;
        if ("3".equals(str)) {
            str4 = skrVar.c(R.string.favorite_playlist_title);
        } else {
            if (str2 == null || StringsKt.U(str2)) {
                str2 = null;
            }
            if (str2 == null) {
                return new fs(i, continuation);
            }
            str4 = str2;
        }
        int ordinal = o3qVar.ordinal();
        if (ordinal == 0) {
            return new fs(i, skrVar.d(R.string.header_now_playing_history_entity, str4));
        }
        if (ordinal != 1) {
            b6e.s();
            return null;
        }
        if (str3 == null || StringsKt.U(str3) || str3.equals("all")) {
            return new fs(i, ((skr) g8cVar.a).d(R.string.header_now_playing_playlist, str4));
        }
        bdc bdcVar = (bdc) this.b;
        bdcVar.getClass();
        return new u21(16, new eno(new j57(bdcVar, str3, continuation, 26)), this, str4);
    }

    @Override // defpackage.d5p
    public void F(kjm kjmVar, int i) {
        kjmVar.getClass();
        rar rarVar = (rar) this.d;
        Continuation continuation = null;
        if (rarVar != null) {
            rarVar.g(null);
        }
        this.d = x97.y((mm6) this.b, null, null, new rs(this, kjmVar, i, continuation, 7), 3);
    }

    public void F0(Message message) {
        LinkedBlockingDeque linkedBlockingDeque = (LinkedBlockingDeque) this.c;
        if (!linkedBlockingDeque.offer(message)) {
            Log.d("SessionLifecycleClient", "Failed to enqueue message " + message.what + ". Dropping.");
            return;
        }
        Log.d("SessionLifecycleClient", "Queued message " + message.what + ". Queue size " + linkedBlockingDeque.size());
    }

    @Override // defpackage.hg
    public boolean G(ig igVar, Menu menu) {
        ActionMode.Callback callback = (ActionMode.Callback) this.a;
        krr a0 = a0(igVar);
        ciq ciqVar = (ciq) this.d;
        Menu menu2 = (Menu) ciqVar.get(menu);
        if (menu2 == null) {
            menu2 = new oyh((Context) this.b, (hxh) menu);
            ciqVar.put(menu, menu2);
        }
        return callback.onPrepareActionMode(a0, menu2);
    }

    public Pair G0(String str) {
        g08 g08Var = (g08) this.a;
        if (g08Var instanceof f08) {
            return new Pair(null, str);
        }
        if (!(g08Var instanceof e08)) {
            b6e.s();
            return null;
        }
        g8c g8cVar = (g8c) this.c;
        String name = ((e08) g08Var).a.getName();
        name.getClass();
        return new Pair(str, ((skr) g8cVar.a).d(R.string.header_now_playing_cast, name));
    }

    public pjc H0(izs izsVar, mwk mwkVar) {
        pjc fsVar;
        Pair I0;
        int i = 15;
        String str = null;
        if (!(izsVar instanceof e6v)) {
            if (Intrinsics.d(izsVar, hzs.a)) {
                ssg.a(7, "PlayerScreen:getQueueInfoUiData", "This should not happen. Track source should be always filled in wave queue", null);
                return new fs(i, G0(null));
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
                I0 = I0(s4vVar.a, u4qVar.a.a, s4vVar.b);
            } else if (z4qVar instanceof s4q) {
                s4q s4qVar = (s4q) z4qVar;
                s4v s4vVar2 = s4qVar.c;
                I0 = I0(s4vVar2.a, s4qVar.a.a, s4vVar2.b);
            } else {
                if (!(z4qVar instanceof w4q)) {
                    b6e.s();
                    return null;
                }
                w4q w4qVar = (w4q) z4qVar;
                s4v s4vVar3 = w4qVar.c;
                I0 = I0(s4vVar3.a, w4qVar.a.a, s4vVar3.b);
            }
            return new fs(i, I0);
        }
        if (!(e6vVar instanceof b6v)) {
            b6e.s();
            return null;
        }
        r3q r3qVar = ((b6v) e6vVar).a;
        r3qVar.getClass();
        mwkVar.getClass();
        if (r3qVar instanceof j3q) {
            j3q j3qVar = (j3q) r3qVar;
            fsVar = new fs(i, O(j3qVar.b.a, mwkVar, j3qVar.c));
        } else if (r3qVar instanceof l3q) {
            l3q l3qVar = (l3q) r3qVar;
            fsVar = new fs(i, Q(l3qVar.b.a, l3qVar.c));
        } else if (r3qVar instanceof p3q) {
            p3q p3qVar = (p3q) r3qVar;
            bd5 bd5Var = p3qVar.a;
            fsVar = E0(bd5Var.a(), p3qVar.c.a, pcg.E(bd5Var), p3qVar.b);
        } else {
            if (!(r3qVar instanceof m3q)) {
                b6e.s();
                return null;
            }
            tyt tytVar = ((m3q) r3qVar).b;
            skr skrVar = (skr) ((g8c) this.c).a;
            if (tytVar instanceof qyt) {
                String str2 = ((qyt) tytVar).a;
                str = str2.length() == 0 ? skrVar.c(R.string.header_now_playing_tracks_search_just) : skrVar.d(R.string.header_now_playing_search, str2);
            } else if (Intrinsics.d(tytVar, cyt.a) || Intrinsics.d(tytVar, syt.a)) {
                str = skrVar.c(R.string.header_now_playing_my_music_collections);
            } else if (!Intrinsics.d(tytVar, ryt.a)) {
                if (!Intrinsics.d(tytVar, dyt.a) && !Intrinsics.d(tytVar, eyt.a)) {
                    b6e.s();
                    return null;
                }
                str = skrVar.c(R.string.header_now_playing_history_various);
            }
            fsVar = new fs(i, str);
        }
        return new wcn(fsVar, this, 0);
    }

    @Override // defpackage.rs1
    public void I(Exception exc, ss1 ss1Var) {
        m56 m56Var = (m56) this.c;
        String str = (String) this.a;
        u4r u4rVar = (u4r) this.d;
        ((pr1) this.b).b.getClass();
        if (exc == null) {
            u4rVar.getClass();
        }
        u4r.l(u4rVar, str, m56Var, exc, ss1Var);
        eta.q(u4rVar.i.remove(str));
    }

    public Pair I0(String str, s9p s9pVar, String str2) {
        skr skrVar = (skr) ((g8c) this.c).a;
        str.getClass();
        s9pVar.getClass();
        boolean equals = s9pVar.a().equals(r9p.a);
        g08 g08Var = (g08) this.a;
        if (g08Var instanceof f08) {
            if (equals) {
                str2 = null;
            } else if (str2 == null) {
                jcl jclVar = (jcl) this.d;
                jclVar.getClass();
                str2 = q7g.J(o8g.R(s9pVar), (skr) jclVar.a.getValue());
            }
            return new Pair(str2, str);
        }
        if (!(g08Var instanceof e08)) {
            b6e.s();
            return null;
        }
        if (!equals) {
            str = str2 == null ? skrVar.d(R.string.header_now_playing_radio_my_vibe, str) : str2;
        }
        String name = ((e08) g08Var).a.getName();
        name.getClass();
        return new Pair(str, skrVar.d(R.string.header_now_playing_cast, name));
    }

    public void J0(gu2 gu2Var) {
        synchronized (this.a) {
            try {
                if (o0(gu2Var)) {
                    m1r m1rVar = (m1r) this.c;
                    if (m1rVar.c) {
                        m1rVar.c = false;
                        K0(m1rVar);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.pwq
    public xdr K() {
        return (xdr) this.b;
    }

    public void K0(m1r m1rVar) {
        Handler handler = (Handler) this.b;
        int i = m1rVar.b;
        if (i == -2) {
            return;
        }
        if (i <= 0) {
            i = i == -1 ? 1500 : 2750;
        }
        handler.removeCallbacksAndMessages(m1rVar);
        handler.sendMessageDelayed(Message.obtain(handler, 0, m1rVar), i);
    }

    @Override // defpackage.pwq
    public ccg L() {
        return (nnd) this.a;
    }

    public void L0(int i) {
        ArrayList arrayList = new ArrayList();
        ((LinkedBlockingDeque) this.c).drainTo(arrayList);
        Message obtain = Message.obtain(null, i, 0, 0);
        obtain.getClass();
        arrayList.add(obtain);
        x97.y(gld.e((CoroutineContext) this.a), null, null, new v5p(this, arrayList, null, 5), 3);
    }

    public void M0(w5n w5nVar) {
        a6n a6nVar = (a6n) this.c;
        hn5 hn5Var = (hn5) this.a;
        hn5Var.getClass();
        x5n x5nVar = new x5n(w5nVar, this, new qzc(25, hn5Var));
        y yVar = (y) this.b;
        n3m n3mVar = new n3m(hn5Var, yVar, a6nVar, x5nVar);
        this.d = n3mVar;
        if (!((Boolean) ((jyr) n3mVar.d).getValue()).booleanValue()) {
            nt0.M(hn5Var, (jp0) n3mVar.e, new wn5(new ucm(9, n3mVar), -553463680, true));
            return;
        }
        cvo cvoVar = cvo.i;
        fxf.Q(yVar, o6m.b(wjb.SettingsQualityScreen, null, 6), (sai) n3mVar.f, null, pd.t(new qzm[0]), null, new wn5(new t31(19, n3mVar), -1811415181, true), 20);
    }

    public void N0() {
        m1r m1rVar = (m1r) this.d;
        if (m1rVar != null) {
            this.c = m1rVar;
            this.d = null;
            gu2 gu2Var = (gu2) m1rVar.a.get();
            if (gu2Var == null) {
                this.c = null;
            } else {
                Handler handler = ju2.x;
                handler.sendMessage(handler.obtainMessage(0, gu2Var.a));
            }
        }
    }

    public String O(String str, mwk mwkVar, i3q i3qVar) {
        skr skrVar = (skr) ((g8c) this.c).a;
        str.getClass();
        mwkVar.getClass();
        i3qVar.getClass();
        int ordinal = i3qVar.ordinal();
        if (ordinal == 0) {
            mqs a = mwkVar.a();
            return (a == null || !a4g.D(gys.NonMusicHolder, a)) ? skrVar.d(R.string.header_now_playing_album, str) : skrVar.d(R.string.header_now_playing_podcast, str);
        }
        if (ordinal == 1) {
            return skrVar.d(R.string.header_now_playing_album, str);
        }
        b6e.s();
        return null;
    }

    public void O0(ucr ucrVar) {
        ucrVar.getClass();
        xlr xlrVar = new xlr(2, this, ucrVar);
        synchronized (this.c) {
        }
        ((Handler) ((znk) this.a).b).postDelayed(xlrVar, 5400000L);
    }

    public String Q(String str, k3q k3qVar) {
        skr skrVar = (skr) ((g8c) this.c).a;
        str.getClass();
        k3qVar.getClass();
        int ordinal = k3qVar.ordinal();
        if (ordinal == 0) {
            return skrVar.d(R.string.header_now_playing_artist, str);
        }
        if (ordinal == 1) {
            return skrVar.d(R.string.header_now_playing_artist_familiar_collection, str);
        }
        if (ordinal == 2) {
            return skrVar.d(R.string.header_now_playing_artist_familiar_wave, str);
        }
        if (ordinal == 3) {
            return skrVar.d(R.string.header_now_playing_history_entity, str);
        }
        b6e.s();
        return null;
    }

    public void U(hjp hjpVar, String str) {
        HashMap hashMap = (HashMap) this.a;
        Object obj = hashMap.get(str);
        qon qonVar = (qon) hjpVar.b;
        if (obj != null && obj != qonVar) {
            Timber.w(hrg.q("Multiple sources for space type ", str, ". Will use only one of them. Make sure they are compatible."), new Object[0]);
        }
        hashMap.put(str, qonVar);
        ((Set) this.b).add(qonVar);
    }

    public void V(ucr ucrVar) {
        Runnable runnable;
        ucrVar.getClass();
        synchronized (this.c) {
            runnable = (Runnable) ((LinkedHashMap) this.d).remove(ucrVar);
        }
        if (runnable != null) {
            ((Handler) ((znk) this.a).b).removeCallbacks(runnable);
        }
    }

    public boolean X(m1r m1rVar, int i) {
        gu2 gu2Var = (gu2) m1rVar.a.get();
        if (gu2Var == null) {
            return false;
        }
        ((Handler) this.b).removeCallbacksAndMessages(m1rVar);
        Handler handler = ju2.x;
        handler.sendMessage(handler.obtainMessage(1, i, 0, gu2Var.a));
        return true;
    }

    public String Z(String str) {
        str.getClass();
        return ((skr) ((g8c) this.c).a).d(R.string.header_now_playing_station, str);
    }

    @Override // defpackage.pwq
    public void a(int i) {
        Object value;
        List list;
        xdr xdrVar = (xdr) this.d;
        do {
            value = xdrVar.getValue();
            List list2 = (List) value;
            list = list2;
            if (i >= 0) {
                List list3 = list2;
                list = list2;
                if (i < list3.size()) {
                    ArrayList y0 = CollectionsKt.y0(list3);
                    w1u w1uVar = (w1u) y0.get(i);
                    w1uVar.getClass();
                    y0.set(i, w1u.a(w1uVar, null, 7));
                    list = y0;
                }
            }
        } while (!xdrVar.k(value, list));
    }

    public krr a0(ig igVar) {
        ArrayList arrayList = (ArrayList) this.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            krr krrVar = (krr) arrayList.get(i);
            if (krrVar != null && krrVar.b == igVar) {
                return krrVar;
            }
        }
        krr krrVar2 = new krr((Context) this.b, igVar);
        arrayList.add(krrVar2);
        return krrVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0064 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0028 A[SYNTHETIC] */
    @Override // defpackage.pwq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b(ArrayList arrayList) {
        imh imhVar;
        ak2 ak2Var;
        boolean isEmpty = arrayList.isEmpty();
        List list = arrayList;
        if (isEmpty) {
            list = null;
        }
        if (list == null) {
            list = u75.h(0, 1);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            w1u w1uVar = (w1u) CollectionsKt.S((List) ((xdr) this.d).getValue(), ((Number) it.next()).intValue());
            if (w1uVar != null && (ak2Var = w1uVar.c) != null) {
                yj2 yj2Var = ak2Var instanceof yj2 ? (yj2) ak2Var : null;
                if (yj2Var != null) {
                    imhVar = (imh) yj2Var.k.getValue();
                    if (imhVar == null) {
                        arrayList2.add(imhVar);
                    }
                }
            }
            imhVar = null;
            if (imhVar == null) {
            }
        }
        if (Intrinsics.d((ArrayList) this.c, arrayList2) || arrayList2.isEmpty()) {
            return;
        }
        this.c = arrayList2;
        bcg O = ((nnd) this.a).O();
        if (O != null) {
            ((ecg) O).h(arrayList2);
        }
    }

    public ArrayList b0() {
        ReentrantLock reentrantLock = (ReentrantLock) this.a;
        reentrantLock.lock();
        try {
            return new ArrayList(((HashMap) this.b).values());
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // defpackage.pwq
    public xdr c() {
        return (xdr) this.d;
    }

    public nmb d0() {
        return (nmb) ((jyr) this.b).getValue();
    }

    public qe5 e0(String str, String str2, List list) {
        l18 l18Var = l18.b;
        bdt I = hag.I(e.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        return l3l.h(new g(Page.SEARCH, str).h(), list, ((kxi) this.c).a(str2));
    }

    @Override // defpackage.hg
    public boolean f(ig igVar, MenuItem menuItem) {
        return ((ActionMode.Callback) this.a).onActionItemClicked(a0(igVar), new wxh((Context) this.b, (nsr) menuItem));
    }

    public qor g0() {
        return (qor) ((jyr) this.b).getValue();
    }

    @Override // defpackage.pwq
    public void l(int i) {
        Object value;
        List list;
        Object value2;
        List list2;
        Object value3;
        List list3;
        xdr xdrVar = (xdr) this.d;
        w1u w1uVar = (w1u) CollectionsKt.S((List) xdrVar.getValue(), i);
        if (w1uVar == null) {
            return;
        }
        xdr xdrVar2 = (xdr) this.b;
        Integer valueOf = Integer.valueOf(i);
        xdrVar2.getClass();
        xdrVar2.m(null, valueOf);
        ak2 ak2Var = w1uVar.c;
        if (!(ak2Var instanceof yj2)) {
            if (!(ak2Var instanceof xj2) && !Intrinsics.d(ak2Var, zj2.a)) {
                b6e.s();
                return;
            }
            do {
                value = xdrVar.getValue();
                List list4 = (List) value;
                list = list4;
                if (i >= 0) {
                    List list5 = list4;
                    list = list4;
                    if (i < list5.size()) {
                        ArrayList y0 = CollectionsKt.y0(list5);
                        w1u w1uVar2 = (w1u) y0.get(i);
                        w1uVar2.getClass();
                        y0.set(i, w1u.a(w1uVar2, qbu.b, 13));
                        list = y0;
                    }
                }
            } while (!xdrVar.k(value, list));
            return;
        }
        if (w1uVar.d) {
            yj2 yj2Var = (yj2) ak2Var;
            if (!yj2Var.e && !yj2Var.h) {
                do {
                    value3 = xdrVar.getValue();
                    List list6 = (List) value3;
                    list3 = list6;
                    if (i >= 0) {
                        List list7 = list6;
                        list3 = list6;
                        if (i < list7.size()) {
                            ArrayList y02 = CollectionsKt.y0(list7);
                            w1u w1uVar3 = (w1u) y02.get(i);
                            w1uVar3.getClass();
                            y02.set(i, w1u.a(w1uVar3, qbu.c, 13));
                            list3 = y02;
                        }
                    }
                } while (!xdrVar.k(value3, list3));
                return;
            }
        }
        do {
            value2 = xdrVar.getValue();
            List list8 = (List) value2;
            list2 = list8;
            if (i >= 0) {
                List list9 = list8;
                list2 = list8;
                if (i < list9.size()) {
                    ArrayList y03 = CollectionsKt.y0(list9);
                    w1u w1uVar4 = (w1u) y03.get(i);
                    w1uVar4.getClass();
                    y03.set(i, w1u.a(w1uVar4, qbu.a, 13));
                    list2 = y03;
                }
            }
        } while (!xdrVar.k(value2, list2));
    }

    public String l0(int i) {
        for (an6 an6Var : (List) ((lum) this.d).b) {
            if (i < an6Var.a()) {
                return an6Var.b;
            }
            i -= an6Var.a();
        }
        xq0.q(k5r.i(i, "Could not calculate space type for position: "));
        return null;
    }

    @Override // defpackage.p7q
    public Object m(ioc iocVar) {
        iocVar.getClass();
        throw null;
    }

    public File m0(Context context) {
        ((wfl) this.b).getClass();
        return new File(context.getDir("lib", 0), System.mapLibraryName(SQLiteDatabase.LIBRARY_NAME));
    }

    @Override // defpackage.p7q
    public Object n(szu szuVar) {
        szuVar.getClass();
        jzs jzsVar = szuVar.l;
        return H0(jzsVar.g, jzsVar);
    }

    @Override // defpackage.hkq
    public void o(Canvas canvas, float f, float f2, weo weoVar, int i, float f3, int i2) {
        Paint paint = (Paint) this.c;
        weoVar.getClass();
        mje mjeVar = (mje) weoVar;
        float f4 = mjeVar.k;
        Paint paint2 = (Paint) this.b;
        paint2.setColor(i);
        RectF rectF = (RectF) this.d;
        float f5 = mjeVar.i / 2.0f;
        float f6 = f - f5;
        rectF.left = f6;
        float f7 = mjeVar.j / 2.0f;
        float f8 = f2 - f7;
        rectF.top = f8;
        float f9 = f5 + f;
        rectF.right = f9;
        float f10 = f7 + f2;
        rectF.bottom = f10;
        if (f3 > 0.0f) {
            float f11 = f3 / 2.0f;
            rectF.left = f6 + f11;
            rectF.top = f8 + f11;
            rectF.right = f9 - f11;
            rectF.bottom = f10 - f11;
        }
        canvas.drawRoundRect(rectF, f4, f4, paint2);
        if (i2 == 0 || f3 == 0.0f) {
            return;
        }
        paint.setColor(i2);
        paint.setStrokeWidth(f3);
        canvas.drawRoundRect(rectF, f4, f4, paint);
    }

    public boolean o0(gu2 gu2Var) {
        m1r m1rVar = (m1r) this.c;
        return (m1rVar == null || gu2Var == null || m1rVar.a.get() != gu2Var) ? false : true;
    }

    @Override // defpackage.pwq
    public void p(int i) {
        Object value;
        List list;
        xdr xdrVar = (xdr) this.d;
        do {
            value = xdrVar.getValue();
            List list2 = (List) value;
            list = list2;
            if (i >= 0) {
                List list3 = list2;
                list = list2;
                if (i < list3.size()) {
                    ArrayList y0 = CollectionsKt.y0(list3);
                    w1u w1uVar = (w1u) y0.get(i);
                    w1uVar.getClass();
                    y0.set(i, w1u.a(w1uVar, qbu.b, 13));
                    list = y0;
                }
            }
        } while (!xdrVar.k(value, list));
    }

    public void p0(String str) {
        if (((l1j) this.d) != null) {
            ssg.a(3, "ReLinker", str, null);
            if (StringsKt.M(str, "re-link", false)) {
                ssg.a(7, "ReLinker", str, null);
            }
        }
    }

    @Override // defpackage.p7q
    public Object q(y4d y4dVar) {
        y4dVar.getClass();
        return new fs(15, G0(Z(y4dVar.a.b)));
    }

    @Override // defpackage.p7q
    public Object q0(maq maqVar) {
        maqVar.getClass();
        if (maqVar instanceof vaq) {
            return new fs(15, G0(null));
        }
        if (maqVar instanceof eaq) {
            return new fs(15, G0(Z(((eaq) maqVar).b.d)));
        }
        if (maqVar instanceof raq) {
            return new fs(15, G0(null));
        }
        if (!(maqVar instanceof jbq)) {
            b6e.s();
            return null;
        }
        jbq jbqVar = (jbq) maqVar;
        naq naqVar = (naq) CollectionsKt.S(jbqVar.n(), jbqVar.l);
        if (naqVar != null) {
            return H0(q7g.I(naqVar.d), naqVar);
        }
        return new fs(15, G0(null));
    }

    @Override // defpackage.hg
    public void r(ig igVar) {
        ((ActionMode.Callback) this.a).onDestroyActionMode(a0(igVar));
    }

    public void r0(String str, Object... objArr) {
        p0(String.format(Locale.US, str, objArr));
    }

    @Override // defpackage.p7q
    public Object t(t1q t1qVar) {
        t1qVar.getClass();
        z3q z3qVar = t1qVar.a;
        if (z3qVar instanceof c1q) {
            return new fs(15, G0(O(((c1q) z3qVar).d, t1qVar.c, i3q.a)));
        }
        if (z3qVar instanceof e1q) {
            return new fs(15, G0(Q(((e1q) z3qVar).d, k3q.a)));
        }
        if (z3qVar instanceof r1q) {
            r1q r1qVar = (r1q) z3qVar;
            return new wcn(E0(r1qVar.c.a.b, r1qVar.d, null, o3q.b), this, 1);
        }
        if (z3qVar instanceof a2q) {
            return new fs(15, G0(null));
        }
        if (z3qVar instanceof h1q) {
            return new fs(15, G0(Z(((h1q) z3qVar).c)));
        }
        if (z3qVar instanceof k1q) {
            return new fs(15, G0(null));
        }
        if (!(z3qVar instanceof u1q)) {
            b6e.s();
            return null;
        }
        u1q u1qVar = (u1q) z3qVar;
        String str = u1qVar.d;
        List list = u1qVar.a.b;
        list.getClass();
        return new fs(15, I0(str, o8g.E(list), null));
    }

    public void t0(oq oqVar) {
        oqVar.getClass();
        t tVar = (t) this.a;
        tVar.startActivity(quj.T(tVar, oqVar, null));
    }

    @Override // defpackage.p7q
    public Object u(u7u u7uVar) {
        u7uVar.getClass();
        return new fs(15, G0(null));
    }

    public void v0(x1u x1uVar) {
        x1uVar.getClass();
        y yVar = (y) this.b;
        t tVar = (t) this.a;
        a aVar = PlaybackScope.a;
        aVar.getClass();
        rre.b0(x1uVar, yVar, tVar, aVar, (kxi) this.c, ru0.NONE);
    }

    @Override // defpackage.hkq
    public void w(Canvas canvas, RectF rectF) {
        Paint paint = (Paint) this.c;
        wdp wdpVar = ((pje) this.a).b;
        oje ojeVar = (oje) wdpVar;
        float f = ojeVar.m;
        mje mjeVar = ojeVar.l;
        Paint paint2 = (Paint) this.b;
        paint2.setColor(wdpVar.h0());
        float f2 = mjeVar.k;
        canvas.drawRoundRect(rectF, f2, f2, paint2);
        int i = ojeVar.n;
        if (i == 0 || f == 0.0f) {
            return;
        }
        paint.setColor(i);
        paint.setStrokeWidth(f);
        canvas.drawRoundRect(rectF, f2, f2, paint);
    }

    public void x0(List list, Function1 function1) {
        list.getClass();
        xum xumVar = new xum(11, function1, this);
        ao1.a.getClass();
        pd.U(list, xumVar, ao1.b, (y) this.b, pd.t(new qzm[0]));
    }

    public qls y0(String str, mqs mqsVar, String str2) {
        str.getClass();
        mqsVar.getClass();
        str2.getClass();
        c3x.C((t) this.a);
        qe5 e0 = e0(str, str2, t75.c(mqsVar));
        e0.g = mqsVar;
        e0.e = 0;
        return D0(e0.b(), mqsVar);
    }

    public void z0(String str, mqs mqsVar) {
        str.getClass();
        mqsVar.getClass();
        c3x.C((t) this.a);
        rre.Z(mqsVar, new zus(0), y5g.B0(mqsVar, new qyt(str, null)), new ve(muo.SEARCH, zqt.c), (t) this.a, (y) this.b, (kxi) this.c, new h(Page.SEARCH), null, null, null, 1792);
    }

    public x3n(hn5 hn5Var, y yVar, a6n a6nVar) {
        hn5Var.getClass();
        yVar.getClass();
        this.a = hn5Var;
        this.b = yVar;
        this.c = a6nVar;
    }

    public /* synthetic */ x3n(Object obj, Object obj2, Object obj3, Object obj4) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
    }

    public x3n(t tVar, y yVar, kxi kxiVar, t3g t3gVar) {
        tVar.getClass();
        yVar.getClass();
        this.a = tVar;
        this.b = yVar;
        this.c = kxiVar;
        this.d = t3gVar;
    }
}
