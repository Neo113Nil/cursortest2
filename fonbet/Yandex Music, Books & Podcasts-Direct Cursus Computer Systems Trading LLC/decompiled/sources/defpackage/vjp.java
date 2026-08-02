package defpackage;

import android.content.Context;
import android.net.Uri;
import android.net.wifi.WifiManager;
import android.util.Log;
import com.connectsdk.device.ConnectableDevice;
import com.connectsdk.service.command.ServiceCommand;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import javax.jmdns.impl.a;
import org.json.JSONObject;
import ru.kinopoisk.sdk.easylogin.internal.C1179p8;

/* loaded from: classes3.dex */
public final class vjp {
    public static boolean h = false;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final Map e;
    public final Uri f;
    public final Boolean g;

    public vjp(String str, String str2, String str3, String str4, Map map, Uri uri, Boolean bool) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = map;
        this.f = uri;
        this.g = bool;
    }

    public static byte[] a(String str) {
        String[] split = str.split(StringUtils.PROCESS_POSTFIX_DELIMITER);
        byte[] bArr = new byte[6];
        for (int i = 0; i < 6; i++) {
            bArr[i] = Integer.valueOf(Integer.parseInt(split[i], 16)).byteValue();
        }
        return bArr;
    }

    public static vjp b(a aVar) {
        return new vjp(aVar.r(ConnectableDevice.KEY_ID), aVar.r("ve"), aVar.r("fn"), aVar.r("md"), u2x.O(aVar.r("isSupport")), Uri.parse(aVar.r("se")), Boolean.FALSE);
    }

    public static vjp c(JSONObject jSONObject) {
        Exception exc;
        String str;
        String str2;
        HashMap hashMap = new HashMap();
        Uri uri = null;
        try {
            str = jSONObject.getString(ConnectableDevice.KEY_ID);
            try {
                str2 = jSONObject.getString("name");
            } catch (Exception e) {
                exc = e;
                str2 = null;
            }
        } catch (Exception e2) {
            exc = e2;
            str = null;
            str2 = null;
        }
        try {
            str2 = str2.concat("(standby)");
            uri = Uri.parse(jSONObject.getString("uri"));
        } catch (Exception e3) {
            exc = e3;
            Log.e("Service", "create(): Error: " + exc.getMessage());
            return new vjp(str, "Unknown", str2, "Samsung SmartTV", hashMap, uri, Boolean.TRUE);
        }
        return new vjp(str, "Unknown", str2, "Samsung SmartTV", hashMap, uri, Boolean.TRUE);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void d(Context context, String str, C1179p8 c1179p8) {
        l4h l4hVar;
        l4h l4hVar2;
        MulticastSocket multicastSocket;
        ScheduledExecutorService newSingleThreadScheduledExecutor;
        TimeUnit timeUnit;
        ArrayList arrayList = new ArrayList();
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        boolean z = false;
        ew0 ew0Var = new ew0(copyOnWriteArrayList, arrayList, z, 4);
        h4h h4hVar = new h4h(new nud(context, ew0Var, str, false, 10));
        h4hVar.a = false;
        h4hVar.start();
        arrayList.add(h4hVar);
        String str2 = m4h.m;
        MulticastSocket multicastSocket2 = null;
        try {
            WifiManager.MulticastLock v = rvf.v(context, "MSFDSearchProvider");
            InetAddress byName = InetAddress.getByName("224.0.0.7");
            InetSocketAddress inetSocketAddress = new InetSocketAddress("224.0.0.7", 8001);
            String str3 = m4h.m;
            DatagramPacket datagramPacket = new DatagramPacket(str3.getBytes(), str3.length(), inetSocketAddress);
            MulticastSocket multicastSocket3 = new MulticastSocket(8001);
            try {
                multicastSocket3.joinGroup(byName);
                newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
                multicastSocket = multicastSocket3;
                try {
                    try {
                        k4h k4hVar = new k4h(multicastSocket, str, ew0Var, byName, v, newSingleThreadScheduledExecutor);
                        ew0Var = ew0Var;
                        l4h l4hVar3 = new l4h(k4hVar);
                        try {
                            l4hVar3.start();
                            pv7 pv7Var = new pv7(multicastSocket, ew0Var, z, 26);
                            timeUnit = TimeUnit.MILLISECONDS;
                            newSingleThreadScheduledExecutor.schedule(pv7Var, 15000L, timeUnit);
                            l4hVar = l4hVar3;
                        } catch (Exception e) {
                            e = e;
                            l4hVar = l4hVar3;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        ew0Var = ew0Var;
                        l4hVar = null;
                        multicastSocket2 = multicastSocket;
                        Log.e("MSFDSearchProvider", Log.getStackTraceString(e));
                        if (multicastSocket2 != null && !multicastSocket2.isClosed()) {
                            multicastSocket2.close();
                        }
                        jjo.b(new pv7(ew0Var, e, z, 27));
                        l4hVar2 = l4hVar;
                        if (l4hVar2 != null) {
                        }
                        jjo.a(new nud(arrayList, copyOnWriteArrayList, c1179p8, false, 18));
                    }
                } catch (Exception e3) {
                    e = e3;
                }
            } catch (Exception e4) {
                e = e4;
                multicastSocket = multicastSocket3;
            }
            try {
                e4e e4eVar = new e4e(multicastSocket, datagramPacket);
                e4eVar.c = newSingleThreadScheduledExecutor.scheduleAtFixedRate(e4eVar, 100L, 1000L, timeUnit);
            } catch (Exception e5) {
                e = e5;
                multicastSocket2 = multicastSocket;
                Log.e("MSFDSearchProvider", Log.getStackTraceString(e));
                if (multicastSocket2 != null) {
                    multicastSocket2.close();
                }
                jjo.b(new pv7(ew0Var, e, z, 27));
                l4hVar2 = l4hVar;
                if (l4hVar2 != null) {
                }
                jjo.a(new nud(arrayList, copyOnWriteArrayList, c1179p8, false, 18));
            }
        } catch (Exception e6) {
            e = e6;
            l4hVar = null;
        }
        l4hVar2 = l4hVar;
        if (l4hVar2 != null) {
            arrayList.add(l4hVar2);
        }
        jjo.a(new nud(arrayList, copyOnWriteArrayList, c1179p8, false, 18));
    }

    public static void e(Uri uri, int i, v7o v7oVar) {
        bg3.A(uri, ServiceCommand.TYPE_GET, i, new qdc(4, v7oVar, new t7l(3)));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof vjp)) {
            return false;
        }
        String str = ((vjp) obj).a;
        String str2 = this.a;
        return str2 != null ? str2.equals(str) : str == null;
    }

    public final Boolean f(vjp vjpVar) {
        return hashCode() != vjpVar.hashCode() ? Boolean.FALSE : !this.c.equals(vjpVar.c) ? Boolean.FALSE : this.g != vjpVar.g ? Boolean.FALSE : !this.a.equals(vjpVar.a) ? Boolean.FALSE : !this.f.equals(vjpVar.f) ? Boolean.FALSE : !this.d.equals(vjpVar.d) ? Boolean.FALSE : !this.b.equals(vjpVar.b) ? Boolean.FALSE : !this.e.equals(vjpVar.e) ? Boolean.FALSE : Boolean.TRUE;
    }

    public final int hashCode() {
        String str = this.a;
        return 59 + (str == null ? 43 : str.hashCode());
    }

    public final String toString() {
        StringBuilder u = ouj.u("Service(isSecureModeSupported=", "Unknown", ", id=");
        u.append(this.a);
        u.append(", version=");
        u.append(this.b);
        u.append(", name=");
        u.append(this.c);
        u.append(", type=");
        u.append(this.d);
        u.append(", isSupport=");
        u.append(this.e);
        u.append(", uri=");
        u.append(this.f);
        u.append(", isStandbyService=");
        u.append(this.g);
        u.append(")");
        return u.toString();
    }
}
