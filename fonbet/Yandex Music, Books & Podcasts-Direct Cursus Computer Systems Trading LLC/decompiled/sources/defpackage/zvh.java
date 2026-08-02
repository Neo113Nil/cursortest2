package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.graphics.Typeface;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Binder;
import android.os.Process;
import android.util.SparseArray;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.media3.ui.PlayerView;
import com.connectsdk.service.command.ServiceCommand;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import com.yandex.messenger.websdk.api.PushToken;
import com.yandex.messenger.websdk.api.PushTokenType;
import com.yandex.pulse.metrics.MetricsState;
import com.yandex.pulse.metrics.o;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Exchanger;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import okhttp3.OkHttpClient;
import org.json.JSONObject;
import ru.yandex.quasar.glagol.impl.ConnectionDiscoveryImpl$smarthomeResultListener$1;
import ru.yandex.video.m3.data.exception.network.NetworkRequestException;
import timber.log.Timber;

/* loaded from: classes.dex */
public final /* synthetic */ class zvh implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ zvh(zp4 zp4Var, byte[] bArr, List list) {
        this.a = 22;
        this.b = zp4Var;
        this.c = bArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:88:0x0243 A[Catch: IllegalArgumentException -> 0x00da, r7k -> 0x00dd, TryCatch #1 {IllegalArgumentException -> 0x00da, blocks: (B:19:0x00ba, B:22:0x00e0, B:24:0x00e4, B:25:0x00e7, B:27:0x00ef, B:29:0x00f7, B:31:0x0123, B:33:0x0146, B:35:0x014e, B:36:0x0159, B:38:0x0154, B:39:0x015e, B:41:0x0162, B:43:0x0166, B:46:0x0179, B:48:0x017f, B:50:0x0191, B:53:0x0194, B:56:0x019c, B:57:0x01a3, B:58:0x01a4, B:60:0x01c4, B:61:0x01c7, B:62:0x01cc, B:63:0x01cd, B:66:0x01db, B:69:0x01e6, B:72:0x01fb, B:73:0x0202, B:74:0x0203, B:76:0x020b, B:78:0x0212, B:80:0x021a, B:81:0x022a, B:86:0x023a, B:88:0x0243, B:91:0x0254, B:92:0x025c, B:95:0x021f, B:96:0x0226, B:97:0x020e, B:98:0x0270, B:100:0x0275, B:104:0x0289, B:106:0x028f, B:109:0x029c, B:111:0x02a4, B:113:0x02bf), top: B:9:0x00a8 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void a() {
        String str;
        qsn f;
        qsn qsnVar;
        boolean z;
        atn atnVar = (atn) this.b;
        yde ydeVar = (yde) this.c;
        rio rioVar = (rio) atnVar.c;
        rioVar.getClass();
        x0 x0Var = rioVar.g;
        SparseArray sparseArray = rioVar.f;
        Pattern pattern = cjo.b;
        String str2 = "";
        if (!pattern.matcher((CharSequence) ydeVar.get(0)).matches()) {
            Matcher matcher = cjo.a.matcher((CharSequence) ydeVar.get(0));
            vq1.v(matcher.matches());
            String group = matcher.group(1);
            group.getClass();
            cjo.a(group);
            String group2 = matcher.group(2);
            group2.getClass();
            Uri.parse(group2);
            int indexOf = ydeVar.indexOf("");
            vq1.v(indexOf > 0);
            List subList = ydeVar.subList(1, indexOf);
            z6n z6nVar = new z6n(4);
            z6nVar.c(subList);
            sio sioVar = new sio(z6nVar);
            new jpc(cjo.h, 2).e(ydeVar.subList(indexOf + 1, ydeVar.size()));
            String b = sioVar.b("CSeq");
            b.getClass();
            int parseInt = Integer.parseInt(b);
            rio rioVar2 = (rio) x0Var.d;
            x0 x0Var2 = new x0(405, new sio(new z6n(rioVar2.c, rioVar2.k, parseInt)), str2, 28);
            sio sioVar2 = (sio) x0Var2.c;
            int i = x0Var2.b;
            vq1.v(sioVar2.b("CSeq") != null);
            tde tdeVar = new tde(4);
            if (i == 200) {
                str = "OK";
            } else if (i == 461) {
                str = "Unsupported Transport";
            } else if (i == 500) {
                str = "Internal Server Error";
            } else if (i == 505) {
                str = "RTSP Version Not Supported";
            } else if (i == 301) {
                str = "Move Permanently";
            } else if (i == 302) {
                str = "Move Temporarily";
            } else if (i == 400) {
                str = "Bad Request";
            } else if (i == 401) {
                str = "Unauthorized";
            } else if (i == 404) {
                str = "Not Found";
            } else {
                if (i != 405) {
                    switch (i) {
                        case NetworkRequestException.BANNED /* 454 */:
                            str = "Session Not Found";
                            break;
                        case 455:
                            str = "Method Not Valid In This State";
                            break;
                        case 456:
                            str = "Header Field Not Valid";
                            break;
                        case 457:
                            str = "Invalid Range";
                            break;
                        default:
                            e7o.e();
                            f = null;
                            break;
                    }
                    rioVar2.i.b(f);
                    x0Var.b = Math.max(x0Var.b, parseInt + 1);
                    return;
                }
                str = "Method Not Allowed";
            }
            int i2 = dvt.a;
            Locale locale = Locale.US;
            tdeVar.a("RTSP/1.0 " + i + StringUtil.SPACE + str);
            zde zdeVar = sioVar2.a;
            xkt it = zdeVar.d.keySet().iterator();
            while (it.hasNext()) {
                String str3 = (String) it.next();
                yde d = zdeVar.d(str3);
                for (int i3 = 0; i3 < d.size(); i3++) {
                    tdeVar.a(String.format(Locale.US, "%s: %s", str3, d.get(i3)));
                }
            }
            tdeVar.a("");
            tdeVar.a((String) x0Var2.d);
            f = tdeVar.f();
            rioVar2.i.b(f);
            x0Var.b = Math.max(x0Var.b, parseInt + 1);
            return;
        }
        Matcher matcher2 = pattern.matcher((CharSequence) ydeVar.get(0));
        vq1.v(matcher2.matches());
        String group3 = matcher2.group(1);
        group3.getClass();
        int parseInt2 = Integer.parseInt(group3);
        int indexOf2 = ydeVar.indexOf("");
        vq1.v(indexOf2 > 0);
        List subList2 = ydeVar.subList(1, indexOf2);
        z6n z6nVar2 = new z6n(4);
        z6nVar2.c(subList2);
        sio sioVar3 = new sio(z6nVar2);
        String e = new jpc(cjo.h, 2).e(ydeVar.subList(indexOf2 + 1, ydeVar.size()));
        String b2 = sioVar3.b("CSeq");
        b2.getClass();
        int parseInt3 = Integer.parseInt(b2);
        m97 m97Var = rioVar.a;
        djo djoVar = (djo) sparseArray.get(parseInt3);
        if (djoVar == null) {
            return;
        }
        sparseArray.remove(parseInt3);
        int i4 = djoVar.b;
        try {
            try {
                if (parseInt2 != 200) {
                    if (parseInt2 == 401) {
                        if (rioVar.j == null || rioVar.q) {
                            rio.a(rioVar, new pg5(cjo.h(i4) + StringUtil.SPACE + parseInt2));
                            return;
                        }
                        yde d2 = sioVar3.a.d(sio.a("WWW-Authenticate"));
                        if (d2.isEmpty()) {
                            throw r7k.b("Missing WWW-Authenticate header in a 401 response.", null);
                        }
                        for (int i5 = 0; i5 < d2.size(); i5++) {
                            anx e2 = cjo.e((String) d2.get(i5));
                            rioVar.n = e2;
                            if (e2.a == 2) {
                                break;
                            }
                        }
                        x0Var.b0();
                        rioVar.q = true;
                        return;
                    }
                    if (parseInt2 == 461) {
                        String str4 = cjo.h(i4) + StringUtil.SPACE + parseInt2;
                        String b3 = djoVar.c.b("Transport");
                        b3.getClass();
                        rio.a(rioVar, (i4 != 10 || b3.contains("TCP")) ? new pg5(str4) : new xio(str4));
                        return;
                    }
                    if (parseInt2 != 301 && parseInt2 != 302) {
                        rio.a(rioVar, new pg5(cjo.h(i4) + StringUtil.SPACE + parseInt2));
                        return;
                    }
                    if (rioVar.o != -1) {
                        rioVar.o = 0;
                    }
                    String b4 = sioVar3.b("Location");
                    if (b4 == null) {
                        m97Var.f(null, "Redirection without new location.");
                        return;
                    }
                    Uri parse = Uri.parse(b4);
                    rioVar.h = cjo.f(parse);
                    rioVar.j = cjo.d(parse);
                    Uri uri = rioVar.h;
                    String str5 = rioVar.k;
                    x0Var.getClass();
                    x0Var.c0(x0Var.F(2, str5, vsn.g(1, new Object[]{"Accept", "application/sdp"}, null), uri));
                    return;
                }
                switch (i4) {
                    case 1:
                    case 3:
                    case 7:
                    case 8:
                    case 9:
                    case 11:
                    case 12:
                        return;
                    case 2:
                        atnVar.M(new jtc(sioVar3, olp.a(e)));
                        return;
                    case 4:
                        yde v = yde.v(cjo.b(sioVar3.b("Public")));
                        if (rioVar.m != null) {
                            return;
                        }
                        if (!v.isEmpty() && !v.contains(2)) {
                            m97Var.f(null, "DESCRIBE not supported.");
                            return;
                        }
                        Uri uri2 = rioVar.h;
                        String str6 = rioVar.k;
                        x0Var.getClass();
                        x0Var.c0(x0Var.F(2, str6, vsn.g(1, new Object[]{"Accept", "application/sdp"}, null), uri2));
                        return;
                    case 5:
                        atnVar.N();
                        return;
                    case 6:
                        String b5 = sioVar3.b("Range");
                        ejo a = b5 == null ? ejo.c : ejo.a(b5);
                        try {
                            String b6 = sioVar3.b("RTP-Info");
                            if (b6 == null) {
                                ude udeVar = yde.b;
                                qsnVar = qsn.e;
                            } else {
                                qsnVar = fjo.a(rioVar.h, b6);
                            }
                        } catch (r7k unused) {
                            ude udeVar2 = yde.b;
                            qsnVar = qsn.e;
                        }
                        yde v2 = yde.v(qsnVar);
                        int i6 = rioVar.o;
                        if (i6 != 1 && i6 != 2) {
                            z = false;
                            vq1.A(z);
                            rioVar.o = 2;
                            if (rioVar.m == null) {
                                long j = rioVar.l / 2;
                                qio qioVar = new qio(rioVar, j);
                                rioVar.m = qioVar;
                                if (!qioVar.c) {
                                    qioVar.c = true;
                                    qioVar.a.postDelayed(qioVar, j);
                                }
                            }
                            rioVar.s = -9223372036854775807L;
                            rioVar.b.e(dvt.Y(a.a), v2);
                            return;
                        }
                        z = true;
                        vq1.A(z);
                        rioVar.o = 2;
                        if (rioVar.m == null) {
                        }
                        rioVar.s = -9223372036854775807L;
                        rioVar.b.e(dvt.Y(a.a), v2);
                        return;
                    case 10:
                        String b7 = sioVar3.b("Session");
                        String b8 = sioVar3.b("Transport");
                        if (b7 == null || b8 == null) {
                            throw r7k.b("Missing mandatory session or transport header", null);
                        }
                        au1 c = cjo.c(b7);
                        vq1.A(rioVar.o != -1);
                        rioVar.o = 1;
                        rioVar.k = (String) c.c;
                        rioVar.l = c.b;
                        rioVar.b();
                        return;
                    default:
                        throw new IllegalStateException();
                }
            } catch (IllegalArgumentException e3) {
                e = e3;
                rio.a(rioVar, new pg5(e));
            }
        } catch (r7k e4) {
            e = e4;
            rio.a(rioVar, new pg5(e));
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object t7oVar;
        int i = 8;
        int i2 = 14;
        int i3 = 2;
        int i4 = 4;
        FileOutputStream fileOutputStream = null;
        int i5 = 1;
        switch (this.a) {
            case 0:
                ((ua6) this.b).accept((bwh) this.c);
                return;
            case 1:
                MetricsState metricsState = (MetricsState) this.b;
                byte[] bArr = (byte[]) this.c;
                lyd lydVar = MetricsState.i;
                File file = metricsState.a;
                bArr.getClass();
                File file2 = new File(file.getPath() + ".tmp");
                try {
                    try {
                        try {
                            FileOutputStream fileOutputStream2 = new FileOutputStream(file2);
                            try {
                                CRC32 crc32 = new CRC32();
                                crc32.update(bArr);
                                ByteBuffer order = ByteBuffer.allocate(8).order(ByteOrder.BIG_ENDIAN);
                                order.putLong(crc32.getValue());
                                fileOutputStream2.write(order.array());
                                fileOutputStream2.write(bArr);
                                try {
                                    fileOutputStream2.close();
                                } catch (IOException unused) {
                                }
                                if (!file2.renameTo(file)) {
                                    throw new IOException();
                                }
                                lydVar.b(0);
                                return;
                            } catch (Throwable th) {
                                th = th;
                                fileOutputStream = fileOutputStream2;
                                if (fileOutputStream != null) {
                                    try {
                                        fileOutputStream.close();
                                    } catch (IOException unused2) {
                                    }
                                }
                                throw th;
                            }
                        } catch (IOException unused3) {
                            file2.delete();
                            lydVar.b(1);
                            return;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } finally {
                    file2.delete();
                }
            case 2:
                j2j j2jVar = (j2j) this.b;
                Context context = (Context) this.c;
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                context.registerReceiver(new l83(i2, j2jVar), intentFilter);
                return;
            case 3:
                l83 l83Var = (l83) this.b;
                Context context2 = (Context) this.c;
                j2j j2jVar2 = (j2j) l83Var.b;
                ConnectivityManager connectivityManager = (ConnectivityManager) context2.getSystemService("connectivity");
                if (connectivityManager != null) {
                    try {
                        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                            int type = activeNetworkInfo.getType();
                            if (type != 0) {
                                if (type != 1) {
                                    if (type != 4 && type != 5) {
                                        if (type != 6) {
                                            if (type == 9) {
                                                i = 7;
                                            }
                                        }
                                        i = 5;
                                    }
                                }
                                i = 2;
                            }
                            switch (activeNetworkInfo.getSubtype()) {
                                case 1:
                                case 2:
                                    i = 3;
                                    break;
                                case 3:
                                case 4:
                                case 5:
                                case 6:
                                case 7:
                                case 8:
                                case 9:
                                case 10:
                                case 11:
                                case 12:
                                case 14:
                                case 15:
                                case 17:
                                    i = 4;
                                    break;
                                case 13:
                                    i = 5;
                                    break;
                                case 16:
                                case 19:
                                default:
                                    i = 6;
                                    break;
                                case 18:
                                    i = 2;
                                    break;
                                case 20:
                                    if (dvt.a >= 29) {
                                        i = 9;
                                        break;
                                    }
                                    break;
                            }
                        } else {
                            i = 1;
                        }
                    } catch (SecurityException unused4) {
                    }
                    if (dvt.a >= 31 || i != 5) {
                        j2jVar2.e(i);
                        return;
                    } else {
                        rf0.g(context2, j2jVar2);
                        return;
                    }
                }
                i = 0;
                if (dvt.a >= 31) {
                }
                j2jVar2.e(i);
                return;
            case 4:
                hfj hfjVar = (hfj) this.b;
                Function1 function1 = (Function1) this.c;
                v4n v4nVar = hfjVar.f;
                g02 g02Var = new g02(i5, hfjVar, function1);
                vae vaeVar = v4nVar.a;
                qdc qdcVar = v4nVar.b;
                PushToken pushToken = v4nVar.f;
                if (pushToken == null) {
                    qdcVar.sendEvent("wm_push_set_token_to_backend_error", tah.b(new Pair("reason", "empty push token")));
                    return;
                }
                String c = v4nVar.c.c();
                if (c == null) {
                    qdcVar.sendEvent("wm_push_set_token_to_backend_error", tah.b(new Pair("reason", "empty auth token")));
                    return;
                }
                String str = vaeVar.c;
                if (str == null || StringsKt.U(str)) {
                    qdcVar.sendEvent("wm_push_set_token_to_backend_error", tah.b(new Pair("reason", "empty deviceId")));
                    return;
                }
                k5r.t(qdcVar, qdcVar, "wm_push_set_token_to_backend");
                b0o a = v4nVar.d.a();
                a.g("https://api.messenger.yandex.net/api/");
                a.a("Authorization", c);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("device_model", ote.b);
                jSONObject.put("platform", ConstantDeviceInfo.APP_PLATFORM);
                JSONObject jSONObject2 = new JSONObject();
                PushTokenType pushTokenType = PushTokenType.a;
                jSONObject2.put("token_type", ConstantDeviceInfo.APP_PLATFORM);
                jSONObject2.put("token", pushToken.a);
                jSONObject2.put("device_id", vaeVar.c);
                jSONObject2.put("package_name", v4nVar.e);
                jSONObject2.put("environment", jSONObject);
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("method", "set_push_token");
                jSONObject3.put("params", jSONObject2);
                a.e(ServiceCommand.TYPE_POST, new dn7(jSONObject3));
                d0o b = a.b();
                mkn mknVar = v4nVar.h;
                if (mknVar != null) {
                    mknVar.cancel();
                }
                OkHttpClient okHttpClient = v4nVar.g;
                okHttpClient.getClass();
                mkn mknVar2 = new mkn(okHttpClient, b, false);
                v4nVar.h = mknVar2;
                mknVar2.z(g02Var);
                return;
            case 5:
                ((hfj) this.b).f.f = (PushToken) this.c;
                return;
            case 6:
                g02 g02Var2 = (g02) this.b;
                xqn xqnVar = (xqn) this.c;
                Function1 function12 = (Function1) g02Var2.b;
                if (function12 != null) {
                    function12.invoke(xqnVar.a);
                    return;
                }
                return;
            case 7:
                hfj hfjVar2 = (hfj) this.b;
                g02 g02Var3 = (g02) this.c;
                qdc qdcVar2 = hfjVar2.d;
                k5r.t(qdcVar2, qdcVar2, "wm_push_set_token_complete");
                hfjVar2.j = true;
                Function1 function13 = (Function1) g02Var3.b;
                if (function13 != null) {
                    function13.invoke(null);
                    return;
                }
                return;
            case 8:
                g02 g02Var4 = (g02) this.b;
                IOException iOException = (IOException) this.c;
                Function1 function14 = (Function1) g02Var4.b;
                if (function14 != null) {
                    function14.invoke(iOException);
                    return;
                }
                return;
            case 9:
                ((acp) this.b).j((vqj) this.c, Unit.a);
                return;
            case 10:
                gc8 gc8Var = (gc8) this.b;
                String str2 = (String) this.c;
                s9f[] s9fVarArr = vvj.e;
                if (str2 == null) {
                    str2 = "";
                }
                wxt N = gc8Var.N("legal_notes", str2);
                if (N != null) {
                    ssg.a(6, null, "problem with legal_notes in div json", N);
                    return;
                }
                return;
            case 11:
                gs4 gs4Var = (gs4) this.b;
                Map map = (Map) this.c;
                try {
                    r7o r7oVar = z7o.b;
                    lxj lxjVar = (lxj) gs4Var.b;
                    List c2 = t75.c(map);
                    c2.getClass();
                    t7oVar = new kxj(lxjVar, c2).invoke();
                } catch (Throwable th3) {
                    r7o r7oVar2 = z7o.b;
                    t7oVar = new t7o(th3);
                }
                if (z7o.a(t7oVar) != null) {
                    ((kc7) gs4Var.c).b(((n4f) gs4Var.a).to(map));
                }
                if ((t7oVar instanceof t7o) || ((AtomicLong) gs4Var.e).addAndGet(1L) % 5 != 0) {
                    return;
                }
                try {
                    y2x.s(new dyg(15, gs4Var), (ExecutorService) gs4Var.d);
                    return;
                } catch (RejectedExecutionException unused5) {
                    return;
                }
            case 12:
                ViewGroup viewGroup = (ViewGroup) this.b;
                Activity activity = (Activity) this.c;
                wn5 wn5Var = new wn5(new ykf(11, new jz3(activity, i3)), -2121452598, true);
                if (viewGroup.findViewWithTag("vpn_header_wrapper") != null) {
                    ssg.a(3, "ViewInjector", "Header already injected, skipping double injection", null);
                    return;
                }
                View childAt = viewGroup.getChildAt(0);
                if (childAt == null) {
                    return;
                }
                viewGroup.removeView(childAt);
                wvs wvsVar = new wvs(28);
                WeakHashMap weakHashMap = wdu.a;
                ndu.n(childAt, wvsVar);
                LinearLayout linearLayout = new LinearLayout(activity);
                linearLayout.setTag("vpn_header_wrapper");
                linearLayout.setOrientation(1);
                linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                ComposeView composeView = new ComposeView(activity, null, 0, 6, null);
                composeView.setViewCompositionStrategy(ehv.i);
                composeView.setContent(new wn5(new lqr(wn5Var, i2), -2058411277, true));
                linearLayout.addView(composeView, new LinearLayout.LayoutParams(-1, -2));
                linearLayout.addView(childAt, new LinearLayout.LayoutParams(-1, 0, 1.0f));
                viewGroup.addView(linearLayout);
                return;
            case 13:
                List list = (List) this.b;
                ivk ivkVar = (ivk) this.c;
                Iterator it = CollectionsKt.H(list, 999).iterator();
                while (it.hasNext()) {
                    List list2 = (List) it.next();
                    bvk v = ivkVar.b.v();
                    v.getClass();
                    list2.getClass();
                    StringBuilder k = dfi.k("DELETE FROM PlayAudioBundle WHERE _id in (");
                    swf.x(list2.size(), k);
                    k.append(")");
                    up6.F(v.a, false, true, new i20(k.toString(), list2, i4));
                }
                return;
            case 14:
                ((Exchanger) this.b).exchange(((Function0) this.c).invoke());
                return;
            case 15:
                PlayerView.a((PlayerView) this.b, (Bitmap) this.c);
                return;
            case 16:
                htm htmVar = (htm) this.b;
                a4w a4wVar = (a4w) this.c;
                synchronized (htmVar.k) {
                    try {
                        Iterator it2 = htmVar.j.iterator();
                        while (it2.hasNext()) {
                            ((rob) it2.next()).a(a4wVar, false);
                        }
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
                return;
            case 17:
                ((uvm) this.b).B((fap) this.c);
                return;
            case 18:
                an4 an4Var = (an4) this.b;
                uiq uiqVar = (uiq) this.c;
                try {
                    Timber.d("radio and picasso purge started", new Object[0]);
                    if (!an4Var.b.deleteDatabase("Radio.db")) {
                        Timber.d("db file wasn't deleted", new Object[0]);
                    }
                    an4Var.c("covers_here");
                    an4Var.c("picasso-cache");
                    Timber.d("radio and picasso purge finished", new Object[0]);
                    uiqVar.x();
                    return;
                } catch (Throwable th5) {
                    Timber.d("radio and picasso purge finished", new Object[0]);
                    uiqVar.x();
                    throw th5;
                }
            case 19:
                ozn oznVar = (ozn) this.b;
                CountDownLatch countDownLatch = (CountDownLatch) this.c;
                try {
                    t9t.a().d.n(((de2) oznVar.h.b).b(lsm.c), 1);
                } catch (Exception unused6) {
                }
                countDownLatch.countDown();
                return;
            case 20:
                ((hag) this.b).u((Typeface) this.c);
                return;
            case 21:
                a();
                return;
            case 22:
                zp4 zp4Var = (zp4) this.b;
                byte[] bArr2 = (byte[]) this.c;
                zp4Var.getClass();
                try {
                    ((OutputStream) zp4Var.b).write(bArr2);
                    return;
                } catch (Exception unused7) {
                    return;
                }
            case 23:
                Runnable runnable = (Runnable) this.b;
                php phpVar = (php) this.c;
                runnable.getClass();
                try {
                    Process.setThreadPriority(10);
                    runnable.run();
                    Binder.flushPendingCommands();
                    return;
                } finally {
                    phpVar.a();
                }
            case 24:
                aqi aqiVar = (aqi) this.b;
                aqi aqiVar2 = (aqi) this.c;
                ((msd) aqiVar.getValue()).a(0);
                ((Function0) aqiVar2.getValue()).invoke();
                return;
            case 25:
                n3m n3mVar = (n3m) this.b;
                ConnectionDiscoveryImpl$smarthomeResultListener$1 connectionDiscoveryImpl$smarthomeResultListener$1 = (ConnectionDiscoveryImpl$smarthomeResultListener$1) this.c;
                try {
                    connectionDiscoveryImpl$smarthomeResultListener$1.onResult(n3mVar.N0());
                    return;
                } catch (Exception e) {
                    connectionDiscoveryImpl$smarthomeResultListener$1.onError(e);
                    return;
                }
            case 26:
                p4r p4rVar = (p4r) this.b;
                yy1 yy1Var = (yy1) this.c;
                if (p4rVar.n && yy1Var != yy1.e) {
                    ktp ktpVar = p4rVar.k;
                    ktpVar.a = ktpVar.c;
                    ktp ktpVar2 = p4rVar.k;
                    float f = p4rVar.f;
                    float f2 = 0.5f;
                    if (f < 0.5f) {
                        f2 = 0.3f;
                    } else if (f <= 0.8f) {
                        f2 = 0.4f;
                    }
                    ktpVar2.b = Math.min((((yy1Var.a + yy1Var.b) + yy1Var.d) / 3.0f) + f2, 1.3f);
                    p4rVar.l = 0L;
                }
                ktp ktpVar3 = p4rVar.h;
                ktpVar3.a = ktpVar3.c;
                p4rVar.h.b = yy1Var.a;
                ktp ktpVar4 = p4rVar.i;
                ktpVar4.a = ktpVar4.c;
                p4rVar.i.b = yy1Var.b;
                ktp ktpVar5 = p4rVar.j;
                ktpVar5.a = ktpVar5.c;
                p4rVar.j.b = yy1Var.d;
                p4rVar.o = 0L;
                return;
            case 27:
                k6r k6rVar = (k6r) this.b;
                SurfaceTexture surfaceTexture = (SurfaceTexture) this.c;
                SurfaceTexture surfaceTexture2 = k6rVar.g;
                Surface surface = k6rVar.h;
                Surface surface2 = new Surface(surfaceTexture);
                k6rVar.g = surfaceTexture;
                k6rVar.h = surface2;
                Iterator it3 = k6rVar.a.iterator();
                if (it3.hasNext()) {
                    throw hrg.j(it3);
                }
                if (surfaceTexture2 != null) {
                    surfaceTexture2.release();
                }
                if (surface != null) {
                    surface.release();
                    return;
                }
                return;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                l6r l6rVar = (l6r) this.b;
                SurfaceTexture surfaceTexture3 = (SurfaceTexture) this.c;
                SurfaceTexture surfaceTexture4 = l6rVar.g;
                Surface surface3 = l6rVar.h;
                Surface surface4 = new Surface(surfaceTexture3);
                l6rVar.g = surfaceTexture3;
                l6rVar.h = surface4;
                Iterator it4 = l6rVar.a.iterator();
                while (it4.hasNext()) {
                    ((urb) it4.next()).a.H1(surface4);
                }
                if (surfaceTexture4 != null) {
                    surfaceTexture4.release();
                }
                if (surface3 != null) {
                    surface3.release();
                    return;
                }
                return;
            default:
                vtm vtmVar = (vtm) this.b;
                d7r d7rVar = (d7r) this.c;
                ((aqd) vtmVar.a).m().bringToFront();
                d7rVar.a(vtmVar);
                return;
        }
    }

    public /* synthetic */ zvh(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
