package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64;
import com.appsflyer.internal.k;
import com.connectsdk.device.ConnectableDevice;
import com.connectsdk.discovery.DiscoveryProvider;
import com.connectsdk.etc.helper.HttpMessage;
import com.connectsdk.service.NetcastTVService;
import com.connectsdk.service.command.ServiceCommand;
import com.connectsdk.service.webos.lgcast.remotecamera.service.CameraService;
import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.nio.ByteBuffer;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import ru.kinopoisk.sdk.easylogin.internal.C1151n8;
import ru.kinopoisk.sdk.easylogin.internal.L8;

/* loaded from: classes3.dex */
public final class gw0 {
    public static long p;
    public static final SecureRandom q = new SecureRandom();
    public vjp a;
    public final Uri b;
    public boolean e;
    public volatile jc4 f;
    public volatile C1151n8 g;
    public rn5 j;
    public final boolean o;
    public final kkp d = new kkp(27);
    public final ConcurrentHashMap h = new ConcurrentHashMap();
    public final ConcurrentHashMap i = new ConcurrentHashMap();
    public boolean k = false;
    public final z0j l = new z0j(this);
    public final String c = "ru.yandex.idk";
    public boolean m = false;
    public Boolean n = Boolean.FALSE;

    public gw0(vjp vjpVar, Uri uri) {
        this.a = vjpVar;
        this.b = uri;
        this.o = !TextUtils.isEmpty(uri.getScheme());
    }

    public static void a(gw0 gw0Var, Map map, String str) {
        kkp kkpVar = gw0Var.d;
        Map map2 = (Map) map.get("data");
        String str2 = (String) map2.get(ConnectableDevice.KEY_ID);
        ArrayList arrayList = new ArrayList();
        Iterator it = ((List) map2.get("clients")).iterator();
        while (true) {
            boolean z = true;
            if (!it.hasNext()) {
                break;
            }
            un4 a = un4.a((Map) it.next());
            arrayList.add(a);
            if (!gw0Var.e && !a.b) {
                z = false;
            }
            gw0Var.e = z;
        }
        kkpVar.b = null;
        HashMap hashMap = (HashMap) kkpVar.c;
        hashMap.clear();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            un4 un4Var = (un4) it2.next();
            hashMap.put(un4Var.a, un4Var);
        }
        kkpVar.b = str2;
        un4 un4Var2 = (un4) hashMap.get(str2);
        if (un4Var2 != null) {
            kkpVar.e = un4Var2;
        }
        if (gw0Var.m()) {
            z0j z0jVar = gw0Var.l;
            gw0 gw0Var2 = (gw0) z0jVar.e;
            kkp kkpVar2 = gw0Var2.d;
            if (!z0jVar.b) {
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) z0jVar.c;
                if (scheduledExecutorService != null) {
                    scheduledExecutorService.shutdown();
                    z0jVar.c = null;
                }
                z0jVar.b = true;
                gw0Var2.n("msfVersion2", kkpVar2.A().a, "msfVersion2");
                gw0Var2.n("pong", kkpVar2.A().a, "channel.ping");
                new Date().getTime();
                ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
                z0jVar.c = newSingleThreadScheduledExecutor;
                q9 q9Var = (q9) z0jVar.d;
                long j = ScreenMirroringConfig.Test.pcVideoUdpPort;
                newSingleThreadScheduledExecutor.scheduleAtFixedRate(q9Var, j, j, TimeUnit.MILLISECONDS);
            }
        }
        jjo.b(new x8x(gw0Var, gw0Var.f(str), false, 16));
    }

    public static void h(Uri uri) {
        ((u4r) nsh.x().c).getClass();
        if (ss1.t != null) {
            ((u4r) nsh.x().c).getClass();
            ((u4r) nsh.x().c).getClass();
            ((u4r) nsh.x().c).g = null;
        }
    }

    public final void b(v7o v7oVar) {
        String str;
        ew0 ew0Var = new ew0(1, this, v7oVar);
        if (!this.a.g.booleanValue()) {
            tao taoVar = tao.f;
            if (taoVar != null) {
                taoVar.v(this.a, Boolean.FALSE);
            }
            Uri g = g();
            h(g);
            c(g, ew0Var);
            return;
        }
        tao taoVar2 = tao.f;
        if (taoVar2 == null) {
            return;
        }
        vjp vjpVar = this.a;
        ArrayList arrayList = (ArrayList) taoVar2.e;
        int i = 0;
        while (true) {
            if (i >= arrayList.size()) {
                str = null;
                break;
            } else {
                if (vjpVar.a.trim().equals(((hbr) arrayList.get(i)).a.trim())) {
                    str = ((hbr) arrayList.get(i)).c;
                    break;
                }
                i++;
            }
        }
        if (str == null) {
            return;
        }
        Uri uri = this.a.f;
        ew0 ew0Var2 = new ew0(this, ew0Var, false, 3);
        if (vjp.h) {
            return;
        }
        vjp.h = true;
        ByteBuffer allocate = ByteBuffer.allocate(120);
        allocate.put(vjp.a("FF:FF:FF:FF:FF:FF"));
        for (int i2 = 0; i2 < 16; i2++) {
            allocate.put(vjp.a(str));
        }
        allocate.put(vjp.a("00:00:00:00:00:00"));
        allocate.put("SECWOW".getBytes());
        allocate.putInt(0);
        allocate.put((byte) 0);
        jjo.a(new yyo(3, allocate.array()));
        Handler handler = new Handler();
        vjp.e(uri, 30000, new ew0(uri, ew0Var2, false, 5));
        handler.postDelayed(new q(24), DiscoveryProvider.TIMEOUT);
    }

    public final void c(Uri uri, v7o v7oVar) {
        String valueOf = String.valueOf(q.nextInt(Integer.MAX_VALUE));
        if (valueOf != null) {
            this.i.put(valueOf, v7oVar);
        }
        if (m()) {
            i(valueOf, veb.a(r11.a, new zeb("ERROR_ALREADY_CONNECTED").a(), "Already Connected"));
            return;
        }
        nsh x = nsh.x();
        String uri2 = uri.toString();
        le3 le3Var = new le3();
        le3Var.b = this;
        le3Var.a = valueOf;
        x.getClass();
        rr1 rr1Var = new rr1(Uri.parse(uri2.replace("ws://", "http://").replace("wss://", "https://")), ServiceCommand.TYPE_GET);
        UUID randomUUID = UUID.randomUUID();
        byte[] bArr = new byte[16];
        ByteBuffer.wrap(bArr).asLongBuffer().put(new long[]{randomUUID.getMostSignificantBits(), randomUUID.getLeastSignificantBits()});
        String encodeToString = Base64.encodeToString(bArr, 2);
        qzc qzcVar = rr1Var.c;
        qzcVar.H("Sec-WebSocket-Version", "13");
        qzcVar.H("Sec-WebSocket-Key", encodeToString);
        qzcVar.H("Sec-WebSocket-Extensions", "x-webkit-deflate-frame");
        qzcVar.H("Connection", "Upgrade");
        qzcVar.H("Upgrade", "websocket");
        qzcVar.H("Pragma", "no-cache");
        qzcVar.H("Cache-Control", "no-cache");
        if (TextUtils.isEmpty(qzcVar.p(HttpMessage.USER_AGENT))) {
            qzcVar.H(HttpMessage.USER_AGENT, "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_8_2) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/27.0.1453.15 Safari/537.36");
        }
        viq viqVar = new viq();
        osh oshVar = new osh(viqVar, le3Var, rr1Var);
        or1 or1Var = new or1(x);
        x.h(rr1Var, 0, or1Var, oshVar);
        viqVar.l(or1Var);
    }

    public final void d(boolean z) {
        if (z) {
            kkp kkpVar = this.d;
            int size = ((HashMap) kkpVar.c).size();
            un4 A = kkpVar.A();
            if ((size == 2 && kkpVar.u() != null && A != null) || ((size == 1 && A != null) || size == 0)) {
                fw0 fw0Var = new fw0(this, A);
                String uri = this.b.toString();
                boolean z2 = this.o;
                k(z2 ? "ms.webapplication.stop" : "ms.application.stop", k.r(z2 ? "url" : ConnectableDevice.KEY_ID, uri), fw0Var);
                this.m = true;
                return;
            }
        }
        e(null);
    }

    public final void e(L8 l8) {
        String valueOf = String.valueOf(q.nextInt(Integer.MAX_VALUE));
        if (valueOf != null && l8 != null) {
            this.i.put(valueOf, l8);
        }
        String str = !m() ? "Already Disconnected" : null;
        if (this.k) {
            str = "Already Disconnecting";
        }
        if (str != null) {
            i(valueOf, new veb(-1L, "error", str));
            return;
        }
        this.k = true;
        this.j.close();
        this.j = null;
        f(valueOf);
        if (l8 != null) {
            l8.onSuccess(this.d.A());
        }
    }

    public final v7o f(String str) {
        if (str != null) {
            return (v7o) this.i.remove(str);
        }
        return null;
    }

    public final Uri g() {
        return this.a.f.buildUpon().appendPath("channels").appendPath(this.c).build();
    }

    public final void i(String str, veb vebVar) {
        jjo.b(new x8x(15, f(str), vebVar));
    }

    public final void j(String str, Map map, byte[] bArr) {
        un4 un4Var;
        if (((String) map.get(NetcastTVService.UDAP_API_EVENT)) == null) {
            String str2 = (String) map.get(ConnectableDevice.KEY_ID);
            try {
                v7o f = f(str2);
                if (f != null) {
                    jjo.b(new nud((Map) map.get("error"), f, map.get(CameraService.RESULT), false, 1));
                    return;
                }
                return;
            } catch (Exception unused) {
                return;
            }
        }
        String str3 = (String) map.get(NetcastTVService.UDAP_API_EVENT);
        if (str3 != null) {
            if ("ms.error".equalsIgnoreCase(str3)) {
                i(str, veb.a(-1L, "error", (String) ((Map) map.get("data")).get(Constants.KEY_MESSAGE)));
                return;
            }
            if ("ms.channel.clientConnect".equalsIgnoreCase(str3)) {
                un4 a = un4.a((Map) map.get("data"));
                this.e = true;
                ((HashMap) this.d.c).put(a.a, a);
                if (this.g != null) {
                    jjo.b(new gc4(this, a, 1));
                }
            } else if ("ms.channel.clientDisconnect".equalsIgnoreCase(str3)) {
                Map map2 = (Map) map.get("data");
                if (map2 != null) {
                    un4Var = (un4) ((HashMap) this.d.c).get((String) map2.get(ConnectableDevice.KEY_ID));
                } else {
                    un4Var = null;
                }
                kkp kkpVar = this.d;
                Map map3 = (Map) map.get("data");
                if (map3 != null) {
                    un4 un4Var2 = (un4) ((HashMap) kkpVar.c).get((String) map3.get(ConnectableDevice.KEY_ID));
                    if (un4Var2 != null) {
                        if (un4Var2.b) {
                            this.e = false;
                        }
                        ((HashMap) kkpVar.c).remove(un4Var2.a);
                    }
                }
                if (un4Var != null && un4Var.b) {
                    synchronized (this.n) {
                        this.n = Boolean.TRUE;
                    }
                }
                if (!this.m && un4Var != null && un4Var.b) {
                    e(null);
                }
            } else if (!"ms.channel.ready".equalsIgnoreCase(str3)) {
                if ("ms.channel.disconnect".equalsIgnoreCase(str3)) {
                    d(true);
                    return;
                }
                String str4 = (String) map.get(NetcastTVService.UDAP_API_EVENT);
                czh czhVar = new czh(this, str4, map.get("data"), (un4) ((HashMap) this.d.c).get((String) map.get("from")), bArr);
                List list = (List) this.h.get(str4);
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        x8x x8xVar = new x8x(14, (kc4) it.next(), czhVar);
                        if (jjo.a == null) {
                            jjo.a = new Handler(Looper.getMainLooper());
                        }
                        jjo.a.postDelayed(new dsd(29, x8xVar), 5L);
                    }
                }
            }
        }
    }

    public final void k(String str, HashMap hashMap, v7o v7oVar) {
        String valueOf = String.valueOf(q.nextInt(Integer.MAX_VALUE));
        if (valueOf != null) {
            this.i.put(valueOf, v7oVar);
        }
        if (!m()) {
            i(valueOf, new veb(-1L, "error", "Not connected"));
            return;
        }
        HashMap hashMap2 = new HashMap();
        hashMap2.put("method", str);
        hashMap2.put(ConnectableDevice.KEY_ID, valueOf);
        hashMap2.put("params", hashMap);
        this.j.S(lxe.H(hashMap2));
    }

    public final boolean l() {
        return m() && this.e && !this.n.booleanValue();
    }

    public final boolean m() {
        rn5 rn5Var = this.j;
        return rn5Var != null && ((dt1) rn5Var.c).isOpen();
    }

    public final void n(Object obj, Object obj2, String str) {
        if (!m()) {
            i(null, veb.a(r3.a, new zeb("ERROR_WEBSOCKET_DISCONNECTED").a(), "Not Connected"));
            return;
        }
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            hashMap.put(NetcastTVService.UDAP_API_EVENT, str);
        }
        if (obj != null) {
            hashMap.put("data", obj);
        }
        if (obj2 != null) {
            hashMap.put("to", obj2);
        }
        HashMap hashMap2 = new HashMap();
        hashMap2.put("method", "ms.channel.emit");
        hashMap2.put("params", hashMap);
        this.j.S(lxe.H(hashMap2));
    }

    public final String o() {
        return "Channel(service=" + this.a + ", uri=" + this.b + ", id=" + this.c + ", clients=" + this.d + ", connected=" + this.e + ", securityMode=false, onConnectListener=null, onDisconnectListener=" + this.f + ", onClientConnectListener=" + this.g + ", onClientDisconnectListener=null, onReadyListener=null, onErrorListener=null)";
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Application(super=");
        sb.append(o());
        sb.append(", onConnectListener=null, isStopping=");
        sb.append(this.m);
        sb.append(", isHostDisconnected=");
        sb.append(this.n);
        sb.append(", webapp=");
        return ouj.r(sb, this.o, ", startArgs=null)");
    }
}
