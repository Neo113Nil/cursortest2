package defpackage;

import android.graphics.Rect;
import android.net.Uri;
import android.os.Messenger;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.pulse.metrics.o;
import io.grpc.internal.a;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Level;

/* loaded from: classes4.dex */
public final /* synthetic */ class dsd implements Runnable {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ dsd(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public synchronized void a() {
        long time = new Date().getTime();
        for (String str : ((m4h) this.b).i.keySet()) {
            if (((Long) ((m4h) this.b).i.get(str)).longValue() < time) {
                vjp b = ((m4h) this.b).b(str);
                ((m4h) this.b).i.remove(str);
                if (b != null) {
                    m4h m4hVar = (m4h) this.b;
                    synchronized (m4hVar.b) {
                        m4hVar.b.remove(b);
                    }
                    pwe pweVar = m4hVar.c;
                    if (pweVar != null) {
                        pweVar.onLost(b);
                    }
                } else {
                    continue;
                }
            }
        }
    }

    public synchronized void b(long j, String str) {
        ((m4h) this.b).i.put(str, Long.valueOf(new Date().getTime() + j));
    }

    /* JADX WARN: Removed duplicated region for block: B:217:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0400  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i;
        int i2;
        opn opnVar;
        Object obj;
        String str;
        Map map;
        String str2;
        int i3 = 0;
        CopyOnWriteArraySet copyOnWriteArraySet = null;
        switch (this.a) {
            case 0:
                ((zya) this.b).invoke();
                return;
            case 1:
                see seeVar = (see) this.b;
                Set set = bp6.a;
                if (set.contains(this)) {
                    return;
                }
                try {
                    if (!set.contains(see.class)) {
                        try {
                            copyOnWriteArraySet = seeVar.a;
                        } catch (Throwable th) {
                            bp6.a(see.class, th);
                        }
                    }
                    ArrayList arrayList = new ArrayList(copyOnWriteArraySet);
                    q qVar = q.j;
                    if (set.contains(see.class)) {
                        return;
                    }
                    try {
                        seeVar.d(arrayList, qVar);
                        return;
                    } catch (Throwable th2) {
                        bp6.a(see.class, th2);
                        return;
                    }
                } catch (Throwable th3) {
                    bp6.a(this, th3);
                    return;
                }
            case 2:
                owe oweVar = (owe) ((pv7) this.b).b;
                s8h s8hVar = oweVar.q;
                oweVar.p = null;
                oweVar.q = null;
                s8hVar.b(sgr.o.i("InternalSubchannel closed transport due to address change"));
                return;
            case 3:
                s0f s0fVar = (s0f) this.b;
                if (s0fVar.c != null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    long j = s0fVar.B;
                    long j2 = j == Long.MIN_VALUE ? 0L : currentTimeMillis - j;
                    yon layoutManager = s0fVar.r.getLayoutManager();
                    if (s0fVar.A == null) {
                        s0fVar.A = new Rect();
                    }
                    layoutManager.w(s0fVar.A, s0fVar.c.a);
                    if (layoutManager.x()) {
                        int i4 = (int) (s0fVar.j + s0fVar.h);
                        int paddingLeft = (i4 - s0fVar.A.left) - s0fVar.r.getPaddingLeft();
                        float f = s0fVar.h;
                        if ((f < 0.0f && paddingLeft < 0) || (f > 0.0f && (paddingLeft = ((s0fVar.c.a.getWidth() + i4) + s0fVar.A.right) - (s0fVar.r.getWidth() - s0fVar.r.getPaddingRight())) > 0)) {
                            i = paddingLeft;
                            if (layoutManager.y()) {
                                int i5 = (int) (s0fVar.k + s0fVar.i);
                                int paddingTop = (i5 - s0fVar.A.top) - s0fVar.r.getPaddingTop();
                                float f2 = s0fVar.i;
                                if ((f2 < 0.0f && paddingTop < 0) || (f2 > 0.0f && (paddingTop = ((s0fVar.c.a.getHeight() + i5) + s0fVar.A.bottom) - (s0fVar.r.getHeight() - s0fVar.r.getPaddingBottom())) > 0)) {
                                    i3 = paddingTop;
                                }
                            }
                            if (i != 0) {
                                n8n n8nVar = s0fVar.m;
                                RecyclerView recyclerView = s0fVar.r;
                                int width = s0fVar.c.a.getWidth();
                                s0fVar.r.getWidth();
                                i = n8nVar.l(recyclerView, width, i, j2);
                            }
                            i2 = i;
                            if (i3 == 0) {
                                n8n n8nVar2 = s0fVar.m;
                                RecyclerView recyclerView2 = s0fVar.r;
                                int height = s0fVar.c.a.getHeight();
                                s0fVar.r.getHeight();
                                i3 = n8nVar2.l(recyclerView2, height, i3, j2);
                            }
                            if (i2 != 0 && i3 == 0) {
                                s0fVar.B = Long.MIN_VALUE;
                                return;
                            }
                            if (s0fVar.B == Long.MIN_VALUE) {
                                s0fVar.B = currentTimeMillis;
                            }
                            s0fVar.r.scrollBy(i2, i3);
                            opnVar = s0fVar.c;
                            if (opnVar != null) {
                                s0fVar.p(opnVar);
                            }
                            s0fVar.r.removeCallbacks(s0fVar.s);
                            RecyclerView recyclerView3 = s0fVar.r;
                            WeakHashMap weakHashMap = wdu.a;
                            recyclerView3.postOnAnimation(this);
                            return;
                        }
                    }
                    i = 0;
                    if (layoutManager.y()) {
                    }
                    if (i != 0) {
                    }
                    i2 = i;
                    if (i3 == 0) {
                    }
                    if (i2 != 0) {
                    }
                    if (s0fVar.B == Long.MIN_VALUE) {
                    }
                    s0fVar.r.scrollBy(i2, i3);
                    opnVar = s0fVar.c;
                    if (opnVar != null) {
                    }
                    s0fVar.r.removeCallbacks(s0fVar.s);
                    RecyclerView recyclerView32 = s0fVar.r;
                    WeakHashMap weakHashMap2 = wdu.a;
                    recyclerView32.postOnAnimation(this);
                    return;
                }
                return;
            case 4:
                synchronized (((qdg) this.b).a) {
                    obj = ((qdg) this.b).f;
                    ((qdg) this.b).f = qdg.k;
                }
                ((qdg) this.b).l(obj);
                return;
            case 5:
                ((kgg) this.b).j();
                return;
            case 6:
                ((ew0) ((nud) this.b).c).onError(new veb(-1L, "error", "Not Found"));
                return;
            case 7:
                try {
                    DatagramPacket datagramPacket = new DatagramPacket(new byte[1024], 1024);
                    while (((m4h) this.b).h) {
                        try {
                            try {
                                a();
                                ((m4h) this.b).f.receive(datagramPacket);
                                if (datagramPacket.getLength() <= 0) {
                                    continue;
                                } else {
                                    try {
                                        Map O = u2x.O(new String(datagramPacket.getData(), 0, datagramPacket.getLength(), "UTF-8"));
                                        if (O != null && !O.isEmpty()) {
                                            String str3 = (String) O.get("type");
                                            if (!"discover".equals(str3) && (str = (String) O.get("sid")) != null) {
                                                vjp b = ((m4h) this.b).b(str);
                                                if (!"alive".equals(str3) && !"up".equals(str3)) {
                                                    if (b != null && "down".equals(str3)) {
                                                        ((m4h) this.b).i.remove(str);
                                                        m4h m4hVar = (m4h) this.b;
                                                        synchronized (m4hVar.b) {
                                                            m4hVar.b.remove(b);
                                                        }
                                                        pwe pweVar = m4hVar.c;
                                                        if (pweVar != null) {
                                                            pweVar.onLost(b);
                                                        }
                                                    }
                                                }
                                                long longValue = ((Long) O.get("ttl")).longValue();
                                                if (b != null || ((m4h) this.b).i.containsKey(str)) {
                                                    b(longValue, str);
                                                } else {
                                                    b(longValue, str);
                                                    Map map2 = (Map) O.get("data");
                                                    if (map2 != null && (map = (Map) map2.get("v2")) != null && (str2 = (String) map.get("uri")) != null) {
                                                        vjp.e(Uri.parse(str2), 2000, new j4h(this, str, longValue));
                                                    }
                                                }
                                            }
                                        }
                                    } catch (Exception e) {
                                        Log.e("MSFDSearchProvider", Log.getStackTraceString(e));
                                    }
                                }
                            } catch (SocketTimeoutException unused) {
                            } catch (IOException e2) {
                                Log.e("MSFDSearchProvider", Log.getStackTraceString(e2));
                            }
                        } catch (SocketException unused2) {
                        } catch (Exception e3) {
                            Log.e("MSFDSearchProvider", "receiveHandler exception: " + e3.getMessage());
                        }
                    }
                    if (((m4h) this.b).f != null) {
                        ((m4h) this.b).f.close();
                        return;
                    }
                    return;
                } catch (Throwable th4) {
                    if (((m4h) this.b).f != null) {
                        ((m4h) this.b).f.close();
                    }
                    throw th4;
                }
            case 8:
                ((ew0) ((pv7) this.b).b).onError(new veb(-1L, "error", "Not Found"));
                return;
            case 9:
                ((j8h) ((u76) this.b).a).s();
                return;
            case 10:
                j8h j8hVar = ((a8h) this.b).b;
                j8hVar.m.e();
                if (j8hVar.v) {
                    j8hVar.u.B();
                    return;
                }
                return;
            case 11:
                owe oweVar2 = ((i8h) this.b).g;
                oweVar2.j.execute(new hwe(oweVar2, j8h.g0, i3));
                return;
            case 12:
                jhh jhhVar = (jhh) this.b;
                xy0 xy0Var = jhhVar.g.e;
                mka mkaVar = jhhVar.e;
                mkaVar.getClass();
                xy0Var.remove(((Messenger) mkaVar.a).getBinder());
                return;
            case 13:
                khh khhVar = (khh) this.b;
                khhVar.g.d.remove(((Messenger) khhVar.d.a).getBinder());
                return;
            case 14:
                aqh aqhVar = (aqh) this.b;
                aqhVar.h(true);
                aqhVar.E.requestLayout();
                aqhVar.E.getViewTreeObserver().addOnGlobalLayoutListener(new vr0(3, aqhVar));
                return;
            case 15:
                aqh aqhVar2 = ((yph) this.b).b;
                if (aqhVar2.X != null) {
                    aqhVar2.X = null;
                    if (aqhVar2.I0) {
                        aqhVar2.o(aqhVar2.J0);
                        return;
                    }
                    return;
                }
                return;
            case 16:
                ((View) this.b).setNestedScrollingEnabled(true);
                return;
            case 17:
                ((rei) this.b).Z0.a();
                return;
            case 18:
                au1 au1Var = (au1) this.b;
                long j3 = au1Var.b;
                long max = Math.max(2 * j3, j3);
                bu1 bu1Var = (bu1) au1Var.c;
                if (bu1Var.b.compareAndSet(j3, max)) {
                    bu1.c.log(Level.WARNING, "Increased {0} to {1}", new Object[]{bu1Var.a, Long.valueOf(max)});
                    return;
                }
                return;
            case 19:
                noj nojVar = (noj) this.b;
                nojVar.o.execute(nojVar.t);
                synchronized (((noj) this.b).k) {
                    noj nojVar2 = (noj) this.b;
                    nojVar2.C = Integer.MAX_VALUE;
                    nojVar2.s();
                }
                return;
            case 20:
                ((a) ((xrk) this.b).c).x();
                return;
            case 21:
                ((zdg) ((xrk) this.b).c).D();
                return;
            case 22:
                ((lpm) this.b).r.l(cpm.a);
                return;
            case 23:
                ((eqm) this.b).L();
                return;
            case 24:
                ((d18) this.b).g();
                return;
            case 25:
                b1o b1oVar = (b1o) this.b;
                b1oVar.c.b(b1oVar);
                return;
            case 26:
                x7h x7hVar = (x7h) this.b;
                if (x7hVar.z) {
                    return;
                }
                x7hVar.u.onReady();
                return;
            case 27:
                jao jaoVar = (jao) this.b;
                x7h x7hVar2 = (x7h) jaoVar.c.b;
                lao laoVar = jaoVar.b;
                l2i l2iVar = x7h.E;
                x7hVar2.g(laoVar);
                return;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                ((xco) this.b).B();
                return;
            default:
                jjo.b((x8x) this.b);
                return;
        }
    }
}
