package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.os.Build;
import android.os.Bundle;
import android.text.ParcelableSpan;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.SizeF;
import android.widget.RemoteViews;
import androidx.compose.animation.c;
import androidx.compose.foundation.e;
import androidx.compose.foundation.layout.b;
import androidx.compose.foundation.layout.d;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.yandex.music.shared.lyrics.data.dto.LyricsDownloadInfoDto;
import com.yandex.music.shared.lyrics.data.dto.MajorDto;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import ru.yandex.music.R;

/* loaded from: classes.dex */
public abstract class v5g {
    public static void A(jpa jpaVar, cds cdsVar, long j, long j2, int i) {
        ogi ogiVar = cdsVar.b;
        bds bdsVar = cdsVar.a;
        long j3 = (i & 4) != 0 ? 0L : j2;
        c4r c4rVar = bdsVar.b.a;
        otp otpVar = c4rVar.n;
        aas aasVar = c4rVar.m;
        kpa kpaVar = c4rVar.p;
        nsh q0 = jpaVar.q0();
        long B = q0.B();
        q0.s().r();
        try {
            xzi xziVar = (xzi) q0.b;
            xziVar.m0(Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)));
            v(xziVar, cdsVar);
            ges gesVar = bdsVar.b;
            ai3 c = gesVar.a.a.c();
            if (c == null || j != 16) {
                ogiVar.k(jpaVar.q0().s(), tyf.D(Float.NaN, j != 16 ? j : gesVar.c()), otpVar, aasVar, kpaVar, 3);
            } else {
                ogiVar.m(jpaVar.q0().s(), c, Float.isNaN(Float.NaN) ? gesVar.a.a.b() : Float.NaN, otpVar, aasVar, kpaVar);
            }
            vz1.A(q0, B);
        } catch (Throwable th) {
            vz1.A(q0, B);
            throw th;
        }
    }

    public static final String B(x1u x1uVar) {
        x1uVar.getClass();
        String N = xp3.N(x1uVar.h);
        return N.length() > 0 ? StringsKt.t0(N).toString() : "";
    }

    public static SharedPreferences C(Context context) {
        return context.getSharedPreferences(context.getPackageName() + "_preferences", 0);
    }

    public static final float D(CoroutineContext coroutineContext) {
        hei heiVar = (hei) coroutineContext.get(e88.f);
        float I = heiVar != null ? heiVar.I() : 1.0f;
        if (I >= 0.0f) {
            return I;
        }
        mlm.b("negative scale factor");
        return I;
    }

    public static String E(vkw vkwVar) {
        vkwVar.getClass();
        if (vkwVar instanceof rkw) {
            return "Active";
        }
        if (vkwVar instanceof skw) {
            return "ActiveRestricted";
        }
        if (vkwVar instanceof tkw) {
            return "Passive";
        }
        if (vkwVar.equals(ukw.b)) {
            return "Transition";
        }
        b6e.s();
        return null;
    }

    public static int F(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 4) {
            return 2;
        }
        if (i == 8) {
            return 3;
        }
        if (i == 16) {
            return 4;
        }
        if (i == 32) {
            return 5;
        }
        if (i == 64) {
            return 6;
        }
        if (i == 128) {
            return 7;
        }
        if (i == 256) {
            return 8;
        }
        if (i == 512) {
            return 9;
        }
        xq0.x(k5r.i(i, "type needs to be >= FIRST and <= LAST, type="));
        return 0;
    }

    public static boolean G(byte b) {
        return b > -65;
    }

    public static final boolean H(e4p e4pVar) {
        e4pVar.getClass();
        return e4pVar == e4p.c;
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x017d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void I(Intent intent) {
        long parseLong;
        f0i f0iVar;
        if (N(intent)) {
            J(intent.getExtras(), "_nr");
        }
        int i = 0;
        if ((intent == null || FirebaseMessagingService.ACTION_DIRECT_BOOT_REMOTE_INTENT.equals(intent.getAction())) ? false : y()) {
            o9t o9tVar = (o9t) FirebaseMessaging.k.get();
            if (o9tVar == null) {
                Log.e("FirebaseMessaging", "TransportFactory is null. Skip exporting message delivery metrics to Big Query");
                return;
            }
            if (intent == null) {
                f0iVar = null;
            } else {
                Bundle extras = intent.getExtras();
                if (extras == null) {
                    extras = Bundle.EMPTY;
                }
                Object obj = extras.get("google.ttl");
                if (obj instanceof Integer) {
                    i = ((Integer) obj).intValue();
                } else if (obj instanceof String) {
                    try {
                        i = Integer.parseInt((String) obj);
                    } catch (NumberFormatException unused) {
                        Log.w("FirebaseMessaging", "Invalid TTL: " + obj);
                    }
                }
                int i2 = i;
                String string = extras.getString("google.to");
                if (TextUtils.isEmpty(string)) {
                    try {
                        aec d = aec.d();
                        try {
                            Object obj2 = hec.m;
                            string = (String) ywf.n(((hec) d.b(iec.class)).c());
                        } catch (InterruptedException e) {
                            e = e;
                            b6e.q(e);
                            return;
                        }
                    } catch (InterruptedException | ExecutionException e2) {
                        e = e2;
                    }
                }
                String str = string;
                aec d2 = aec.d();
                d2.a();
                String packageName = d2.a.getPackageName();
                d0i d0iVar = h4b.I(extras) ? d0i.DISPLAY_NOTIFICATION : d0i.DATA_MESSAGE;
                String string2 = extras.getString("google.message_id");
                if (string2 == null) {
                    string2 = extras.getString("message_id");
                }
                String str2 = string2 != null ? string2 : "";
                String string3 = extras.getString("from");
                if (string3 == null || !string3.startsWith("/topics/")) {
                    string3 = null;
                }
                String str3 = string3 != null ? string3 : "";
                String string4 = extras.getString("collapse_key");
                String str4 = string4 != null ? string4 : "";
                String string5 = extras.getString("google.c.a.m_l");
                String str5 = string5 != null ? string5 : "";
                String string6 = extras.getString("google.c.a.c_l");
                String str6 = string6 != null ? string6 : "";
                if (extras.containsKey("google.c.sender.id")) {
                    try {
                        parseLong = Long.parseLong(extras.getString("google.c.sender.id"));
                    } catch (NumberFormatException e3) {
                        Log.w("FirebaseMessaging", "error parsing project number", e3);
                    }
                    f0iVar = new f0i(parseLong > 0 ? parseLong : 0L, str2, str, d0iVar, packageName, str4, i2, str3, str5, str6);
                }
                aec d3 = aec.d();
                nec necVar = d3.c;
                d3.a();
                String str7 = necVar.e;
                if (str7 != null) {
                    try {
                        parseLong = Long.parseLong(str7);
                    } catch (NumberFormatException e4) {
                        Log.w("FirebaseMessaging", "error parsing sender ID", e4);
                    }
                    f0iVar = new f0i(parseLong > 0 ? parseLong : 0L, str2, str, d0iVar, packageName, str4, i2, str3, str5, str6);
                }
                d3.a();
                String str8 = necVar.b;
                if (str8.startsWith("1:")) {
                    String[] split = str8.split(StringUtils.PROCESS_POSTFIX_DELIMITER);
                    if (split.length >= 2) {
                        String str9 = split[1];
                        if (!str9.isEmpty()) {
                            try {
                                parseLong = Long.parseLong(str9);
                            } catch (NumberFormatException e5) {
                                Log.w("FirebaseMessaging", "error parsing app ID", e5);
                            }
                        }
                    }
                    parseLong = 0;
                } else {
                    try {
                        parseLong = Long.parseLong(str8);
                    } catch (NumberFormatException e6) {
                        Log.w("FirebaseMessaging", "error parsing app ID", e6);
                    }
                }
                f0iVar = new f0i(parseLong > 0 ? parseLong : 0L, str2, str, d0iVar, packageName, str4, i2, str3, str5, str6);
            }
            if (f0iVar == null) {
                return;
            }
            try {
                ((p9t) o9tVar).a("FCM_CLIENT_EVENT_LOGGING", new p6b("proto"), new tuh(12)).P0(new bd2(null, new g0i(f0iVar), lsm.a, new td2(Integer.valueOf(intent.getIntExtra("google.product_id", 111881503)))), new wvs(9));
            } catch (RuntimeException e7) {
                Log.w("FirebaseMessaging", "Failed to send big query analytics payload.", e7);
            }
        }
    }

    public static void J(Bundle bundle, String str) {
        try {
            aec.d();
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = new Bundle();
            String string = bundle.getString("google.c.a.c_id");
            if (string != null) {
                bundle2.putString("_nmid", string);
            }
            String string2 = bundle.getString("google.c.a.c_l");
            if (string2 != null) {
                bundle2.putString("_nmn", string2);
            }
            String string3 = bundle.getString("google.c.a.m_l");
            if (!TextUtils.isEmpty(string3)) {
                bundle2.putString("label", string3);
            }
            String string4 = bundle.getString("google.c.a.m_c");
            if (!TextUtils.isEmpty(string4)) {
                bundle2.putString("message_channel", string4);
            }
            String string5 = bundle.getString("from");
            if (string5 == null || !string5.startsWith("/topics/")) {
                string5 = null;
            }
            if (string5 != null) {
                bundle2.putString("_nt", string5);
            }
            String string6 = bundle.getString("google.c.a.ts");
            if (string6 != null) {
                try {
                    bundle2.putInt("_nmt", Integer.parseInt(string6));
                } catch (NumberFormatException e) {
                    Log.w("FirebaseMessaging", "Error while parsing timestamp in GCM event", e);
                }
            }
            String string7 = bundle.containsKey("google.c.a.udt") ? bundle.getString("google.c.a.udt") : null;
            if (string7 != null) {
                try {
                    bundle2.putInt("_ndt", Integer.parseInt(string7));
                } catch (NumberFormatException e2) {
                    Log.w("FirebaseMessaging", "Error while parsing use_device_time in GCM event", e2);
                }
            }
            String str2 = h4b.I(bundle) ? "display" : "data";
            if ("_nr".equals(str) || "_nf".equals(str)) {
                bundle2.putString("_nmc", str2);
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Logging to scion event=" + str + " scionPayload=" + bundle2);
            }
            if (aec.d().b(p70.class) == null) {
                Log.w("FirebaseMessaging", "Unable to log event: analytics library is missing");
            } else {
                l1j.f();
            }
        } catch (IllegalStateException unused) {
            Log.e("FirebaseMessaging", "Default FirebaseApp has not been initialized. Skip logging event to GA.");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, nuj] */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object] */
    public static final kp0 K(nuj nujVar, a7f a7fVar, fx6 fx6Var) {
        ?? r10;
        Map map;
        jtj jtjVar;
        List list;
        jtj jtjVar2;
        nujVar.getClass();
        fx6Var.getClass();
        fah fahVar = new fah();
        fahVar.j();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Map map2 = fx6Var.b;
        linkedHashMap.putAll(map2);
        r0o r0oVar = fx6Var.a;
        nsh c = r0oVar.c();
        c.d = Boolean.TRUE;
        nujVar.d(fahVar, new fx6(linkedHashMap, c.d()));
        fahVar.p();
        Object b = fahVar.b();
        b.getClass();
        xzi xziVar = new xzi((Map) b);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.putAll(map2);
        nsh c2 = r0oVar.c();
        c2.b = xziVar;
        fx6 fx6Var2 = new fx6(linkedHashMap2, c2.d());
        kp0 kp0Var = null;
        try {
            a7fVar.j();
            map = null;
            jtjVar = null;
            list = null;
            while (a7fVar.hasNext()) {
                String L = a7fVar.L();
                int hashCode = L.hashCode();
                if (hashCode != -1809421292) {
                    if (hashCode != -1294635157) {
                        if (hashCode == 3076010 && L.equals("data")) {
                            qhj a = nujVar.a();
                            tj tjVar = uj.a;
                            if (a7fVar.peek() == 10) {
                                a7fVar.w();
                                jtjVar2 = null;
                            } else {
                                jtjVar2 = a.b(a7fVar, fx6Var2);
                            }
                            jtjVar = jtjVar2;
                        }
                        a7fVar.w();
                    } else if (L.equals("errors")) {
                        list = ldg.C(a7fVar);
                    } else {
                        a7fVar.w();
                    }
                } else if (L.equals("extensions")) {
                    Object d0 = saf.d0(a7fVar);
                    map = d0 instanceof Map ? (Map) d0 : null;
                } else {
                    a7fVar.w();
                }
            }
            a7fVar.p();
        } catch (Throwable th) {
            Throwable th2 = th;
            try {
                a7fVar.close();
                r10 = th2;
            } catch (Throwable th3) {
                fob.a(th2, th3);
                r10 = th2;
            }
        }
        if (a7fVar.peek() != 11) {
            throw new lp0("Expected END_DOCUMENT but was " + f1d.v(a7fVar.peek()), null);
        }
        UUID randomUUID = UUID.randomUUID();
        randomUUID.getClass();
        x4b x4bVar = x4b.a;
        if (map == null) {
            map = e5b.a;
            map.getClass();
        }
        kp0 kp0Var2 = new kp0(randomUUID, nujVar, jtjVar, list, map, x4bVar, false);
        try {
            a7fVar.close();
        } catch (Throwable th4) {
            kp0Var = th4;
        }
        r10 = kp0Var;
        kp0Var = kp0Var2;
        if (r10 == 0) {
            return kp0Var;
        }
        throw r10;
    }

    public static final void M(RemoteViews remoteViews, e9t e9tVar, xne xneVar, List list) {
        int i = 0;
        for (Object obj : CollectionsKt.q0(list, 10)) {
            int i2 = i + 1;
            if (i < 0) {
                u75.n();
                throw null;
            }
            U(remoteViews, e9tVar.b(xneVar, i), (c3b) obj);
            i = i2;
        }
    }

    public static boolean N(Intent intent) {
        Bundle extras;
        if (intent == null || FirebaseMessagingService.ACTION_DIRECT_BOOT_REMOTE_INTENT.equals(intent.getAction()) || (extras = intent.getExtras()) == null) {
            return false;
        }
        return "1".equals(extras.getString("google.c.a.e"));
    }

    public static void O(Context context, xxq xxqVar, int i) {
        Context applicationContext = ((Context) sk3.I(Context.class)).getApplicationContext();
        if (applicationContext.getSharedPreferences("tutorials", 0).getBoolean("enabled_" + xxqVar.a + StringUtils.PROCESS_POSTFIX_DELIMITER + i, true)) {
            applicationContext.getSharedPreferences("tutorials", 0).edit().putBoolean("enabled_" + xxqVar.a + StringUtils.PROCESS_POSTFIX_DELIMITER + i, false).apply();
            hag.x(context, i, 0);
        }
    }

    public static final int P(f40 f40Var) {
        int i = f40Var.a;
        int i2 = 8388611;
        if (i != 0) {
            if (i == 2) {
                i2 = 8388613;
            } else if (i == 1) {
                i2 = 1;
            } else {
                Log.w("GlanceAppWidget", "Unknown horizontal alignment: " + ((Object) d40.b(i)));
            }
        }
        int i3 = f40Var.b;
        int i4 = 48;
        if (i3 != 0) {
            if (i3 == 2) {
                i4 = 80;
            } else if (i3 == 1) {
                i4 = 16;
            } else {
                Log.w("GlanceAppWidget", "Unknown vertical alignment: " + ((Object) e40.b(i3)));
            }
        }
        return i2 | i4;
    }

    public static final int Q(lxs lxsVar) {
        int ordinal = lxsVar.ordinal();
        if (ordinal == 0) {
            return 0;
        }
        if (ordinal == 1) {
            return 1;
        }
        if (ordinal == 2) {
            return 2;
        }
        b6e.s();
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final q2h R(LyricsDownloadInfoDto lyricsDownloadInfoDto) {
        String url;
        r7h r7hVar;
        lyricsDownloadInfoDto.getClass();
        Integer lyricId = lyricsDownloadInfoDto.getLyricId();
        if (lyricId != null) {
            int intValue = lyricId.intValue();
            String externalLyricId = lyricsDownloadInfoDto.getExternalLyricId();
            if (externalLyricId != null && (url = lyricsDownloadInfoDto.getUrl()) != null) {
                List writers = lyricsDownloadInfoDto.getWriters();
                ArrayList O = writers != null ? CollectionsKt.O(writers) : null;
                MajorDto major = lyricsDownloadInfoDto.getMajor();
                if (major != null) {
                    Integer id = major.getId();
                    if (id != null) {
                        int intValue2 = id.intValue();
                        String name = major.getName();
                        String techName = major.getTechName();
                        if (techName != null) {
                            r7hVar = new r7h(intValue2, name, techName);
                            if (r7hVar != null) {
                                return new q2h(intValue, externalLyricId, url, O, r7hVar);
                            }
                        }
                    }
                    r7hVar = null;
                    if (r7hVar != null) {
                    }
                }
            }
        }
        return null;
    }

    public static final nrf S(inq inqVar) {
        String type;
        inqVar.getClass();
        String id = inqVar.getId();
        if (id == null || (type = inqVar.getType()) == null) {
            return null;
        }
        return new nrf(id, type);
    }

    public static String T(int i) {
        return dfi.c(i, "PhonotekaOnlyId(hash=", ")");
    }

    /* JADX WARN: Code restructure failed: missing block: B:150:0x0371, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r0 != null ? r0.a : null, r2) != false) goto L159;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void U(RemoteViews remoteViews, e9t e9tVar, c3b c3bVar) {
        vqf vqfVar;
        RemoteViews remoteViews2;
        Context context = e9tVar.a;
        hhm hhmVar = hhm.y;
        if (c3bVar instanceof e3b) {
            e3b e3bVar = (e3b) c3bVar;
            ArrayList arrayList = e3bVar.b;
            int size = arrayList.size();
            ukd ukdVar = e3bVar.c;
            f40 f40Var = e3bVar.d;
            xne b = rqf.b(remoteViews, e9tVar, vqf.c, size, ukdVar, new d40(f40Var.a), new e40(f40Var.b));
            vq1.p(e9tVar, remoteViews, e3bVar.c, b);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                c3b c3bVar2 = (c3b) it.next();
                c3bVar2.a(c3bVar2.b().d(new o40(e3bVar.d)));
            }
            M(remoteViews, e9tVar, b, arrayList);
            return;
        }
        if (c3bVar instanceof j3b) {
            j3b j3bVar = (j3b) c3bVar;
            vqf vqfVar2 = (Build.VERSION.SDK_INT < 31 || !j3bVar.c.c(hhmVar)) ? vqf.a : vqf.B;
            ArrayList arrayList2 = j3bVar.b;
            xne b2 = rqf.b(remoteViews, e9tVar, vqfVar2, arrayList2.size(), j3bVar.c, null, new e40(j3bVar.e));
            remoteViews.setInt(b2.a, "setGravity", P(new f40(j3bVar.d, j3bVar.e)));
            vq1.p(e9t.a(e9tVar, 0, null, null, null, 0L, null, 28671), remoteViews, j3bVar.c, b2);
            M(remoteViews, e9tVar, b2, arrayList2);
            if (j3bVar.c.c(hhmVar)) {
                u(arrayList2);
                return;
            }
            return;
        }
        if (c3bVar instanceof g3b) {
            g3b g3bVar = (g3b) c3bVar;
            vqf vqfVar3 = (Build.VERSION.SDK_INT < 31 || !g3bVar.c.c(hhmVar)) ? vqf.b : vqf.C;
            ArrayList arrayList3 = g3bVar.b;
            xne b3 = rqf.b(remoteViews, e9tVar, vqfVar3, arrayList3.size(), g3bVar.c, new d40(g3bVar.e), null);
            remoteViews.setInt(b3.a, "setGravity", P(new f40(g3bVar.e, g3bVar.d)));
            vq1.p(e9t.a(e9tVar, 0, null, null, null, 0L, null, 28671), remoteViews, g3bVar.c, b3);
            M(remoteViews, e9tVar, b3, arrayList3);
            if (g3bVar.c.c(hhmVar)) {
                u(arrayList3);
                return;
            }
            return;
        }
        boolean z = false;
        if (c3bVar instanceof m3b) {
            m3b m3bVar = (m3b) c3bVar;
            xne c = rqf.c(remoteViews, e9tVar, vqf.d, m3bVar.d);
            int i = c.a;
            CharSequence charSequence = m3bVar.a;
            fes fesVar = m3bVar.b;
            int i2 = m3bVar.c;
            if (i2 != Integer.MAX_VALUE) {
                remoteViews.setInt(i, "setMaxLines", i2);
            }
            if (fesVar == null) {
                remoteViews.setTextViewText(i, charSequence);
            } else {
                SpannableString spannableString = new SpannableString(charSequence);
                int length = spannableString.length();
                kes kesVar = fesVar.b;
                if (kesVar != null) {
                    long j = kesVar.a;
                    if ((j & 1095216660480L) != 4294967296L) {
                        xq0.x("Only Sp is currently supported for font sizes");
                        return;
                    }
                    remoteViews.setTextViewTextSize(i, 2, kes.c(j));
                }
                ArrayList arrayList4 = new ArrayList();
                if (fesVar.c != null) {
                    arrayList4.add(new TextAppearanceSpan(context, R.style.Glance_AppWidget_TextAppearance_Medium));
                }
                Iterator it2 = arrayList4.iterator();
                while (it2.hasNext()) {
                    spannableString.setSpan((ParcelableSpan) it2.next(), 0, length, 17);
                }
                remoteViews.setTextViewText(i, spannableString);
                b95 b95Var = fesVar.a;
                if (b95Var instanceof sfc) {
                    remoteViews.setTextColor(i, c3x.U(((sfc) b95Var).a));
                } else if (!(b95Var instanceof n2o)) {
                    Log.w("GlanceAppWidget", "Unexpected text color: " + b95Var);
                } else if (Build.VERSION.SDK_INT >= 31) {
                    vvn.g(remoteViews, i, "setTextColor", ((n2o) b95Var).a);
                } else {
                    remoteViews.setTextColor(i, c3x.U(((n2o) b95Var).a(context)));
                }
            }
            vq1.p(e9tVar, remoteViews, m3bVar.d, c);
            return;
        }
        boolean z2 = c3bVar instanceof d3b;
        vqf vqfVar4 = vqf.i;
        if (z2) {
            d3b d3bVar = (d3b) c3bVar;
            ArrayList arrayList5 = d3bVar.b;
            boolean isEmpty = arrayList5.isEmpty();
            awn awnVar = awn.a;
            if (isEmpty) {
                remoteViews2 = d3bVar.e;
                if (remoteViews2 == null) {
                    Intrinsics.j("remoteViews");
                    throw null;
                }
            } else {
                if (d3bVar.d == -1) {
                    xq0.q("To add children to an `AndroidRemoteViews`, its `containerViewId` must be set.");
                    return;
                }
                RemoteViews remoteViews3 = d3bVar.e;
                if (remoteViews3 == null) {
                    Intrinsics.j("remoteViews");
                    throw null;
                }
                RemoteViews a = Build.VERSION.SDK_INT >= 28 ? zvn.a.a(remoteViews3) : remoteViews3.clone();
                a.removeAllViews(d3bVar.d);
                Iterator it3 = arrayList5.iterator();
                int i3 = 0;
                while (it3.hasNext()) {
                    Object next = it3.next();
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        u75.n();
                        throw null;
                    }
                    c3b c3bVar3 = (c3b) next;
                    xvn a2 = rqf.a(e9tVar, c3bVar3.b(), i3);
                    RemoteViews remoteViews4 = a2.a;
                    U(remoteViews4, e9tVar.c(a2), c3bVar3);
                    int i5 = d3bVar.d;
                    if (Build.VERSION.SDK_INT >= 31) {
                        awnVar.a(a, i5, remoteViews4, i3);
                    } else {
                        a.addView(i5, remoteViews4);
                    }
                    i3 = i4;
                }
                remoteViews2 = a;
            }
            xne c2 = rqf.c(remoteViews, e9tVar, vqfVar4, d3bVar.c);
            int i6 = c2.a;
            vq1.p(e9tVar, remoteViews, d3bVar.c, c2);
            remoteViews.removeAllViews(i6);
            if (Build.VERSION.SDK_INT >= 31) {
                awnVar.a(remoteViews, i6, remoteViews2, 0);
                return;
            } else {
                remoteViews.addView(i6, remoteViews2);
                return;
            }
        }
        if (c3bVar instanceof l3b) {
            l3b l3bVar = (l3b) c3bVar;
            vq1.p(e9tVar, remoteViews, l3bVar.a, rqf.c(remoteViews, e9tVar, vqfVar4, l3bVar.a));
            return;
        }
        if (!(c3bVar instanceof i3b)) {
            if (c3bVar instanceof f3b) {
                f3b f3bVar = (f3b) c3bVar;
                xne c3 = rqf.c(remoteViews, e9tVar, vqf.k, f3bVar.a);
                int i7 = c3.a;
                remoteViews.setProgressBar(i7, 0, 0, true);
                if (Build.VERSION.SDK_INT >= 31) {
                    b95 b95Var2 = f3bVar.b;
                    if (b95Var2 instanceof sfc) {
                        vvn.h(remoteViews, i7, "setIndeterminateTintList", ColorStateList.valueOf(c3x.U(((sfc) b95Var2).a)));
                    } else if (b95Var2 instanceof n2o) {
                        vvn.g(remoteViews, i7, "setIndeterminateTintList", ((n2o) b95Var2).a);
                    } else {
                        Log.w("GlanceAppWidget", "Unexpected progress indicator color: " + b95Var2);
                    }
                }
                vq1.p(e9tVar, remoteViews, f3bVar.a, c3);
                return;
            }
            if (!(c3bVar instanceof k3b)) {
                kac.l(c3bVar.getClass().getCanonicalName(), "Unknown element type ");
                return;
            }
            ArrayList arrayList6 = ((k3b) c3bVar).b;
            if (arrayList6.size() <= 1) {
                c3b c3bVar4 = (c3b) CollectionsKt.firstOrNull(arrayList6);
                if (c3bVar4 != null) {
                    U(remoteViews, e9tVar, c3bVar4);
                    return;
                }
                return;
            }
            throw new IllegalArgumentException(("Size boxes can only have at most one child " + arrayList6.size() + ". The normalization of the composition tree failed.").toString());
        }
        i3b i3bVar = (i3b) c3bVar;
        boolean Y = saf.Y(i3bVar);
        int i8 = i3bVar.d;
        if (i8 == 0) {
            vqfVar = Y ? vqf.w : vqf.t;
        } else {
            vqf vqfVar5 = vqf.u;
            if (i8 == 1) {
                if (Y) {
                    vqfVar = vqf.x;
                }
                vqfVar = vqfVar5;
            } else if (i8 == 2) {
                vqfVar = Y ? vqf.y : vqf.v;
            } else {
                Log.w("GlanceAppWidget", "Unsupported ContentScale user: " + ((Object) id6.a(i3bVar.d)));
                vqfVar = vqfVar5;
            }
        }
        xne c4 = rqf.c(remoteViews, e9tVar, vqfVar, i3bVar.a);
        int i9 = c4.a;
        hce hceVar = i3bVar.b;
        if (hceVar instanceof gi0) {
            remoteViews.setImageViewResource(i9, ((gi0) hceVar).a);
        } else {
            if (!(hceVar instanceof n33)) {
                xq0.x("An unsupported ImageProvider type was used.");
                return;
            }
            remoteViews.setImageViewBitmap(i9, ((n33) hceVar).a);
        }
        rjs rjsVar = i3bVar.c;
        if (rjsVar != null) {
            if (!(rjsVar instanceof rjs)) {
                xq0.x("An unsupported ColorFilter was used.");
                return;
            }
            b95 b95Var3 = rjsVar.a;
            if (Build.VERSION.SDK_INT >= 31) {
                wce.a.a(e9tVar, remoteViews, b95Var3, i9);
            } else {
                remoteViews.setInt(i9, "setColorFilter", c3x.U(b95Var3.a(context)));
            }
        }
        vq1.p(e9tVar, remoteViews, i3bVar.a, c4);
        if (i3bVar.d == 1) {
            yov yovVar = (yov) i3bVar.a.a(null, xce.s);
            u38 u38Var = yovVar != null ? yovVar.a : null;
            s38 s38Var = s38.a;
            if (!Intrinsics.d(u38Var, s38Var)) {
                bxd bxdVar = (bxd) i3bVar.a.a(null, xce.t);
            }
            z = true;
        }
        remoteViews.setBoolean(i9, "setAdjustViewBounds", z);
    }

    public static final RemoteViews V(Context context, int i, yvn yvnVar, vof vofVar, int i2, ComponentName componentName) {
        e9t e9tVar = new e9t(context, i, context.getResources().getConfiguration().getLayoutDirection() == 1, vofVar, -1, false, new AtomicInteger(1), new xne(null, 0, 0, 7), new AtomicBoolean(false), 9205357640488583168L, -1, false, null, componentName);
        ArrayList<c3b> arrayList = yvnVar.b;
        if (arrayList == null || !arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (!(((c3b) it.next()) instanceof k3b)) {
                    c3b c3bVar = (c3b) CollectionsKt.k0(arrayList);
                    xvn a = rqf.a(e9tVar, c3bVar.b(), i2);
                    RemoteViews remoteViews = a.a;
                    U(remoteViews, e9tVar.c(a), c3bVar);
                    return remoteViews;
                }
            }
        }
        Object Q = CollectionsKt.Q(arrayList);
        Q.getClass();
        ymq ymqVar = ((k3b) Q).d;
        ArrayList arrayList2 = new ArrayList(v75.o(arrayList, 10));
        for (c3b c3bVar2 : arrayList) {
            c3bVar2.getClass();
            long j = ((k3b) c3bVar2).c;
            xvn a2 = rqf.a(e9tVar, c3bVar2.b(), i2);
            RemoteViews remoteViews2 = a2.a;
            U(remoteViews2, e9t.a(e9tVar.b(a2.b, 0), 0, new AtomicInteger(1), null, new AtomicBoolean(false), j, null, 31935), c3bVar2);
            arrayList2.add(new Pair(new SizeF(fma.c(j), fma.b(j)), remoteViews2));
        }
        if (ymqVar instanceof xmq) {
            return (RemoteViews) ((Pair) CollectionsKt.k0(arrayList2)).b;
        }
        if (!Intrinsics.d(ymqVar, wmq.a)) {
            b6e.s();
            return null;
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return ko0.a.a(uah.n(arrayList2));
        }
        if (arrayList2.size() != 1 && arrayList2.size() != 2) {
            xq0.x("unsupported views size");
            return null;
        }
        ArrayList arrayList3 = new ArrayList(v75.o(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add((RemoteViews) ((Pair) it2.next()).b);
        }
        int size = arrayList3.size();
        if (size == 1) {
            return (RemoteViews) arrayList3.get(0);
        }
        if (size == 2) {
            return new RemoteViews((RemoteViews) arrayList3.get(0), (RemoteViews) arrayList3.get(1));
        }
        xq0.x("There must be between 1 and 2 views.");
        return null;
    }

    public static final void W(sm0 sm0Var, vm0 vm0Var) {
        vm0Var.b.setValue(sm0Var.e.getValue());
        cn0 cn0Var = vm0Var.c;
        cn0 cn0Var2 = sm0Var.f;
        int b = cn0Var.b();
        for (int i = 0; i < b; i++) {
            cn0Var.e(i, cn0Var2.a(i));
        }
        vm0Var.e = sm0Var.h;
        vm0Var.d = sm0Var.g;
        vm0Var.f = ((Boolean) sm0Var.i.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7 */
    public static final void a(String str, String str2, um0 um0Var, long j, yci yciVar, hq5 hq5Var, int i) {
        int i2;
        int i3;
        vci vciVar;
        kjn kjnVar;
        boolean z;
        yci yciVar2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1801365502);
        if ((i & 6) == 0) {
            i2 = (oq5Var.f(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.f(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.d(um0Var.ordinal()) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var.e(j) ? 2048 : 1024;
        }
        int i4 = i2 | 24576;
        if ((i4 & 9363) == 9362 && oq5Var.z()) {
            oq5Var.S();
            yciVar2 = yciVar;
        } else {
            ta5 a = sa5.a(qx0.c, b2c.o, oq5Var, 48);
            int i5 = oq5Var.P;
            a l = oq5Var.l();
            vci vciVar2 = vci.a;
            yci H = vnj.H(oq5Var, vciVar2);
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
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i5))) {
                ouj.x(i5, oq5Var, i5, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            kjn kjnVar2 = gq5.a;
            if (str != null) {
                oq5Var.Z(-363424491);
                vm0 b = fn0.b(0, 0.0f, um0Var, oq5Var, (i4 & 896) | 6, 2);
                ges j2 = nu0.j();
                yci q = androidx.compose.foundation.layout.a.q(vciVar2, 0.0f, 0.0f, 0.0f, 40, 7);
                boolean f = oq5Var.f(b);
                Object K = oq5Var.K();
                if (f || K == kjnVar2) {
                    K = new xtb(b, 11);
                    oq5Var.k0(K);
                }
                vciVar = vciVar2;
                kjnVar = kjnVar2;
                i3 = i4;
                xv7.j(str, wyf.s(q, (Function0) K), j, 0L, 0L, 3, 0L, 2, false, 3, 0, null, j2, oq5Var, (i4 & 14) | ((i4 >> 3) & 896), 3120, 55032);
                oq5Var = oq5Var;
                z = false;
            } else {
                i3 = i4;
                vciVar = vciVar2;
                kjnVar = kjnVar2;
                z = false;
                oq5Var.Z(-367283526);
            }
            oq5Var.p(z);
            int i6 = i3;
            vm0 b2 = fn0.b(str == null ? z : 1, 0.0f, um0Var, oq5Var, i6 & 896, 2);
            htq htqVar = new htq(etq.a);
            vci vciVar3 = vciVar;
            yci d = androidx.compose.foundation.layout.a.d(d.d(vciVar3, 1.0f), 1.59f);
            boolean f2 = oq5Var.f(b2);
            Object K2 = oq5Var.K();
            if (f2 || K2 == kjnVar) {
                K2 = new xtb(b2, 12);
                oq5Var.k0(K2);
            }
            oq5 oq5Var2 = oq5Var;
            ocg.e(str2, htqVar, wyf.s(d, (Function0) K2), null, oq5Var2, (i6 >> 3) & 14, 8);
            oq5Var = oq5Var2;
            oq5Var.p(true);
            yciVar2 = vciVar3;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new pb1(str, str2, um0Var, j, yciVar2, i);
        }
    }

    public static final void b(Function0 function0, yci yciVar, hq5 hq5Var, int i) {
        function0.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(143880631);
        int i2 = (oq5Var.h(function0) ? 4 : 2) | i | (oq5Var.f(yciVar) ? 32 : 16);
        if ((i2 & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
        } else {
            ta5 a = sa5.a(qx0.e, b2c.o, oq5Var, 54);
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
            g0g.U(oq5Var, a, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var, i3, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            String M = rvf.M(R.string.listening_history_empty, oq5Var);
            ges j = nu0.j();
            long j2 = ((dq0) oq5Var.j(eq0.a)).b.a;
            vci vciVar = vci.a;
            xv7.j(M, androidx.compose.ui.platform.a.a(vciVar, "music_history_empty_text_message"), j2, 0L, 0L, 3, 0L, 0, false, 0, 0, null, j, oq5Var, 48, 0, 65272);
            hdg.t(vz1.o(vciVar, 24, oq5Var, R.string.link_to_main_tab, oq5Var), function0, androidx.compose.ui.platform.a.a(vciVar, "music_history_empty_button"), null, oq5Var, ((i2 << 3) & 112) | 384, 8);
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new kx(function0, yciVar, i, 10);
        }
    }

    public static final void c(String str, ebj ebjVar, tmb tmbVar, qnq qnqVar, nnq nnqVar, hq5 hq5Var, int i) {
        str.getClass();
        nnqVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-105548007);
        int i2 = i | (oq5Var.f(str) ? 4 : 2) | (oq5Var.h(ebjVar) ? 32 : 16) | (oq5Var.h(tmbVar) ? 256 : 128) | (oq5Var.h(qnqVar) ? 2048 : 1024) | (oq5Var.f(nnqVar) ? 16384 : RemoteCameraConfig.Notification.ID);
        if (oq5Var.P(i2 & 1, (i2 & 9363) != 9362)) {
            aqi O = gld.O(ebjVar.g, oq5Var);
            fvf a = hvf.a(0, 0, oq5Var, 0, 3);
            aqi O2 = gld.O(ebjVar.h, oq5Var);
            aqi P = ldg.P(O2, a, oq5Var);
            u7g.a(((ma5) oq5Var.j(pa5.a)).g(), oq5Var, 0);
            cpq cpqVar = (cpq) gld.M(ebjVar.f, oq5Var).getValue();
            ogp.g.e(cpqVar instanceof zoq, cpqVar instanceof apq, null, oq5Var, 4096, 4);
            q7g.r(3126, 4, ild.C(64909683, new pr(str, O2, a, ebjVar, O, P, 12), oq5Var), ild.C(1938376941, new kt4(cpqVar, ebjVar, tmbVar, nnqVar, qnqVar, a, 3), oq5Var), oq5Var, androidx.compose.ui.platform.a.a(vci.a, "non_music_landing_screen_content"), false);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new pli(i, 3, str, ebjVar, tmbVar, qnqVar, nnqVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0108 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void d(wbk wbkVar, um0 um0Var, d85 d85Var, yci yciVar, hvq hvqVar, zsq zsqVar, hq5 hq5Var, int i, int i2) {
        int i3;
        hvq hvqVar2;
        int i4;
        long j;
        boolean h;
        Object K;
        int i5;
        String str;
        vci vciVar;
        yci yciVar2;
        xmn r;
        zsq zsqVar2 = zsqVar;
        um0Var.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-203869739);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? oq5Var.f(wbkVar) : oq5Var.h(wbkVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= oq5Var.d(um0Var.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= oq5Var.f(d85Var) ? 256 : 128;
        }
        int i6 = i3 | 3072;
        int i7 = i2 & 16;
        if (i7 != 0) {
            i6 = i3 | 27648;
        } else if ((i & 24576) == 0) {
            hvqVar2 = hvqVar;
            i6 |= oq5Var.h(hvqVar2) ? 16384 : RemoteCameraConfig.Notification.ID;
            i4 = i2 & 32;
            int i8 = 196608;
            if (i4 == 0) {
                if ((196608 & i) == 0) {
                    i8 = (i & SQLiteDatabase.OPEN_PRIVATECACHE) == 0 ? oq5Var.f(zsqVar2) : oq5Var.h(zsqVar2) ? 131072 : SQLiteDatabase.OPEN_FULLMUTEX;
                }
                if ((74899 & i6) == 74898 || !oq5Var.z()) {
                    if (i7 != 0) {
                        hvqVar2 = null;
                    }
                    if (i4 != 0) {
                        zsqVar2 = null;
                    }
                    if (d85Var == null) {
                        oq5Var.Z(1649685916);
                        j = ((dq0) oq5Var.j(eq0.a)).b.a;
                        oq5Var.p(false);
                    } else {
                        oq5Var.Z(1649684800);
                        oq5Var.p(false);
                        j = d85Var.a;
                    }
                    float f = 16;
                    vci vciVar2 = vci.a;
                    yci c = d.c(androidx.compose.foundation.layout.a.o(vciVar2, f, 0.0f, 2), 1.0f);
                    long j2 = j;
                    h = oq5Var.h(hvqVar2) | ((458752 & i6) != 131072 || ((i6 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 && oq5Var.h(zsqVar2)));
                    K = oq5Var.K();
                    Object obj = gq5.a;
                    if (!h || K == obj) {
                        K = new ko1(hvqVar2, zsqVar2, 7);
                        oq5Var.k0(K);
                    }
                    yci b = com.yandex.music.core.ui.compose.a.b(c, null, 0L, 0.0f, null, (Function2) K, 15);
                    ta5 a = sa5.a(qx0.e, b2c.o, oq5Var, 54);
                    i5 = oq5Var.P;
                    a l = oq5Var.l();
                    yci H = vnj.H(oq5Var, b);
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
                    if (!oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i5))) {
                        ouj.x(i5, oq5Var, i5, kb5Var);
                    }
                    g0g.U(oq5Var, H, wp5.d);
                    int i9 = (i6 << 3) & 896;
                    a(wbkVar.c, wbkVar.a, um0Var, j2, null, oq5Var, i9);
                    oq5Var = oq5Var;
                    str = wbkVar.b;
                    if (str == null) {
                        oq5Var.Z(-1876964131);
                        oq5Var.p(false);
                        vciVar = vciVar2;
                    } else {
                        oq5Var.Z(-1876964130);
                        vm0 b2 = fn0.b(wbkVar.c == null ? 1 : 2, 0.0f, um0Var, oq5Var, i9, 2);
                        ges e = nu0.e();
                        yci q = androidx.compose.foundation.layout.a.q(vciVar2, 0.0f, f, 0.0f, 0.0f, 13);
                        vciVar = vciVar2;
                        boolean f2 = oq5Var.f(b2);
                        Object K2 = oq5Var.K();
                        if (f2 || K2 == obj) {
                            K2 = new xtb(b2, 10);
                            oq5Var.k0(K2);
                        }
                        xv7.j(str, wyf.s(q, (Function0) K2), j2, 0L, 0L, 3, 0L, 2, false, 2, 0, null, e, oq5Var, 0, 3120, 55032);
                        oq5Var = oq5Var;
                        oq5Var.p(false);
                    }
                    oq5Var.p(true);
                    yciVar2 = vciVar;
                } else {
                    oq5Var.S();
                    yciVar2 = yciVar;
                }
                zsq zsqVar3 = zsqVar2;
                hvq hvqVar3 = hvqVar2;
                r = oq5Var.r();
                if (r != null) {
                    r.d = new fd1(wbkVar, um0Var, d85Var, yciVar2, hvqVar3, zsqVar3, i, i2, 12);
                    return;
                }
                return;
            }
            i6 |= i8;
            if ((74899 & i6) == 74898) {
            }
            if (i7 != 0) {
            }
            if (i4 != 0) {
            }
            if (d85Var == null) {
            }
            float f3 = 16;
            vci vciVar22 = vci.a;
            yci c2 = d.c(androidx.compose.foundation.layout.a.o(vciVar22, f3, 0.0f, 2), 1.0f);
            long j22 = j;
            h = oq5Var.h(hvqVar2) | ((458752 & i6) != 131072 || ((i6 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 && oq5Var.h(zsqVar2)));
            K = oq5Var.K();
            Object obj2 = gq5.a;
            if (!h) {
            }
            K = new ko1(hvqVar2, zsqVar2, 7);
            oq5Var.k0(K);
            yci b3 = com.yandex.music.core.ui.compose.a.b(c2, null, 0L, 0.0f, null, (Function2) K, 15);
            ta5 a2 = sa5.a(qx0.e, b2c.o, oq5Var, 54);
            i5 = oq5Var.P;
            a l2 = oq5Var.l();
            yci H2 = vnj.H(oq5Var, b3);
            xp5.T.getClass();
            grb grbVar2 = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
            }
            g0g.U(oq5Var, a2, wp5.f);
            g0g.U(oq5Var, l2, wp5.e);
            kb5 kb5Var2 = wp5.g;
            if (!oq5Var.O) {
            }
            ouj.x(i5, oq5Var, i5, kb5Var2);
            g0g.U(oq5Var, H2, wp5.d);
            int i92 = (i6 << 3) & 896;
            a(wbkVar.c, wbkVar.a, um0Var, j22, null, oq5Var, i92);
            oq5Var = oq5Var;
            str = wbkVar.b;
            if (str == null) {
            }
            oq5Var.p(true);
            yciVar2 = vciVar;
            zsq zsqVar32 = zsqVar2;
            hvq hvqVar32 = hvqVar2;
            r = oq5Var.r();
            if (r != null) {
            }
        }
        hvqVar2 = hvqVar;
        i4 = i2 & 32;
        int i82 = 196608;
        if (i4 == 0) {
        }
        i6 |= i82;
        if ((74899 & i6) == 74898) {
        }
        if (i7 != 0) {
        }
        if (i4 != 0) {
        }
        if (d85Var == null) {
        }
        float f32 = 16;
        vci vciVar222 = vci.a;
        yci c22 = d.c(androidx.compose.foundation.layout.a.o(vciVar222, f32, 0.0f, 2), 1.0f);
        long j222 = j;
        h = oq5Var.h(hvqVar2) | ((458752 & i6) != 131072 || ((i6 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 && oq5Var.h(zsqVar2)));
        K = oq5Var.K();
        Object obj22 = gq5.a;
        if (!h) {
        }
        K = new ko1(hvqVar2, zsqVar2, 7);
        oq5Var.k0(K);
        yci b32 = com.yandex.music.core.ui.compose.a.b(c22, null, 0L, 0.0f, null, (Function2) K, 15);
        ta5 a22 = sa5.a(qx0.e, b2c.o, oq5Var, 54);
        i5 = oq5Var.P;
        a l22 = oq5Var.l();
        yci H22 = vnj.H(oq5Var, b32);
        xp5.T.getClass();
        grb grbVar22 = wp5.b;
        oq5Var.d0();
        if (oq5Var.O) {
        }
        g0g.U(oq5Var, a22, wp5.f);
        g0g.U(oq5Var, l22, wp5.e);
        kb5 kb5Var22 = wp5.g;
        if (!oq5Var.O) {
        }
        ouj.x(i5, oq5Var, i5, kb5Var22);
        g0g.U(oq5Var, H22, wp5.d);
        int i922 = (i6 << 3) & 896;
        a(wbkVar.c, wbkVar.a, um0Var, j222, null, oq5Var, i922);
        oq5Var = oq5Var;
        str = wbkVar.b;
        if (str == null) {
        }
        oq5Var.p(true);
        yciVar2 = vciVar;
        zsq zsqVar322 = zsqVar2;
        hvq hvqVar322 = hvqVar2;
        r = oq5Var.r();
        if (r != null) {
        }
    }

    public static final void e(xan xanVar, hq5 hq5Var, int i) {
        xanVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(2106947172);
        int i2 = (oq5Var.f(xanVar) ? 4 : 2) | i;
        if (oq5Var.P(i2 & 1, (i2 & 3) != 2)) {
            Object M = gld.M(xanVar.c, oq5Var);
            Object K = oq5Var.K();
            Object obj = gq5.a;
            if (K == obj) {
                K = szf.g0(Boolean.FALSE);
                oq5Var.k0(K);
            }
            aqi aqiVar = (aqi) K;
            Context context = (Context) oq5Var.j(AndroidCompositionLocals_androidKt.b);
            Object K2 = oq5Var.K();
            if (K2 == obj) {
                K2 = new p8n(xanVar, context);
                oq5Var.k0(K2);
            }
            p8n p8nVar = (p8n) K2;
            yci a = androidx.compose.ui.platform.a.a(xp3.v(d.c(vci.a, 1.0f)), "playback_queue");
            boolean h = oq5Var.h(p8nVar);
            Object K3 = oq5Var.K();
            if (h || K3 == obj) {
                K3 = new m3l(p8nVar, 0);
                oq5Var.k0(K3);
            }
            Function1 function1 = (Function1) K3;
            boolean h2 = oq5Var.h(p8nVar) | oq5Var.f(M);
            Object K4 = oq5Var.K();
            if (h2 || K4 == obj) {
                K4 = new p3e(14, p8nVar, M, aqiVar);
                oq5Var.k0(K4);
            }
            androidx.compose.ui.viewinterop.a.a(48, 0, oq5Var, a, function1, (Function1) K4);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new ykf(xanVar, i, 20);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0276  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void f(zwp zwpVar, tvp tvpVar, Function2 function2, boolean z, wwp wwpVar, Function1 function1, yci yciVar, hq5 hq5Var, int i) {
        boolean z2;
        boolean z3;
        int i2;
        int i3;
        String n;
        int i4;
        int i5;
        boolean z4;
        Object K;
        boolean h;
        Object K2;
        int i6;
        int i7;
        function2.getClass();
        wwpVar.getClass();
        function1.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1483244205);
        int i8 = i | (oq5Var.h(zwpVar) ? 4 : 2) | (oq5Var.f(tvpVar) ? 32 : 16) | (oq5Var.h(function2) ? 256 : 128) | (oq5Var.g(z) ? 2048 : 1024) | (oq5Var.h(wwpVar) ? 16384 : RemoteCameraConfig.Notification.ID) | (oq5Var.h(function1) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX);
        if ((599187 & i8) == 599186 && oq5Var.z()) {
            oq5Var.S();
        } else {
            Context context = (Context) oq5Var.j(AndroidCompositionLocals_androidKt.b);
            Object K3 = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (K3 == kjnVar) {
                K3 = szf.g0(Boolean.FALSE);
                oq5Var.k0(K3);
            }
            aqi aqiVar = (aqi) K3;
            Boolean valueOf = Boolean.valueOf(z);
            int i9 = 1;
            boolean z5 = (i8 & 7168) == 2048;
            Object K4 = oq5Var.K();
            if (z5 || K4 == kjnVar) {
                K4 = new nxm(z, aqiVar, null, i9);
                oq5Var.k0(K4);
            }
            gld.w(oq5Var, valueOf, (Function2) K4);
            gz2 gz2Var = b2c.o;
            float f = 24;
            yci q = androidx.compose.foundation.layout.a.q(yciVar, 0.0f, f, 0.0f, 20, 5);
            ta5 a = sa5.a(qx0.c, gz2Var, oq5Var, 48);
            int i10 = oq5Var.P;
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
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i10))) {
                ouj.x(i10, oq5Var, i10, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            jxp jxpVar = zwpVar.a;
            if (jxpVar instanceof hxp) {
                oq5Var.Z(1253742455);
                int ordinal = ((hxp) jxpVar).c.ordinal();
                if (ordinal == 1) {
                    z2 = false;
                    i6 = -2037761928;
                    i7 = R.string.share_episode_dialog_title;
                } else if (ordinal != 10) {
                    i6 = -2037759402;
                    i7 = R.string.share_track_dialog_title;
                    z2 = false;
                } else {
                    z2 = false;
                    i6 = -2037765064;
                    i7 = R.string.share_chapter_dialog_title;
                }
                n = vz1.n(oq5Var, i6, i7, oq5Var, z2);
                oq5Var.p(z2);
            } else {
                z2 = false;
                if (jxpVar instanceof gxp) {
                    n = vz1.n(oq5Var, -2037756039, R.string.share_playlist_dialog_title, oq5Var, false);
                } else {
                    if (jxpVar instanceof dxp) {
                        oq5Var.Z(1254175029);
                        int i11 = xvp.a[((dxp) jxpVar).b.ordinal()];
                        if (i11 == 1) {
                            z3 = false;
                            i4 = -2037751110;
                            i5 = R.string.share_audiobook_dialog_title;
                        } else if (i11 != 2) {
                            i4 = -2037745386;
                            i5 = R.string.share_album_dialog_title;
                            z3 = false;
                        } else {
                            z3 = false;
                            i4 = -2037747912;
                            i5 = R.string.share_podcast_dialog_title;
                        }
                        n = vz1.n(oq5Var, i4, i5, oq5Var, z3);
                        oq5Var.p(z3);
                    } else {
                        z3 = false;
                        if (jxpVar instanceof exp) {
                            i2 = -2037742089;
                            i3 = R.string.share_artist_dialog_title;
                        } else {
                            i2 = -2037739696;
                            i3 = R.string.menu_element_share;
                        }
                        n = vz1.n(oq5Var, i2, i3, oq5Var, false);
                    }
                    ges c = nu0.c();
                    long j = ((dq0) oq5Var.j(eq0.a)).b.a;
                    vci vciVar = vci.a;
                    xv7.j(n, androidx.compose.foundation.layout.a.o(d.d(vciVar, 1.0f), f, 0.0f, 2), j, 0L, 0L, 3, 0L, 0, false, 0, 0, null, c, oq5Var, 48, 0, 65272);
                    float f2 = 28;
                    u1g.l(oq5Var, d.e(vciVar, f2));
                    etn.h(((Boolean) aqiVar.getValue()).booleanValue(), null, c.d(13), null, null, ild.C(453036065, new f6p(6, wwpVar, function1), oq5Var), oq5Var, 1575942, 26);
                    u1g.l(oq5Var, d.e(vciVar, f2));
                    yci o = androidx.compose.foundation.layout.a.o(vciVar, 16, 0.0f, 2);
                    int i12 = i8 & 112;
                    z4 = i12 != 32;
                    K = oq5Var.K();
                    if (!z4 || K == kjnVar) {
                        K = new mjm(26, tvpVar);
                        oq5Var.k0(K);
                    }
                    yci b = nfp.b(o, false, (Function1) K);
                    h = (i12 != 32) | ((i8 & 896) == 256) | oq5Var.h(context);
                    K2 = oq5Var.K();
                    if (!h || K2 == kjnVar) {
                        K2 = new p3e(22, tvpVar, function2, context);
                        oq5Var.k0(K2);
                    }
                    weo.h(b, null, null, null, null, null, false, (Function1) K2, oq5Var, 0, 254);
                    oq5Var = oq5Var;
                    oq5Var.p(true);
                }
            }
            z3 = z2;
            ges c2 = nu0.c();
            long j2 = ((dq0) oq5Var.j(eq0.a)).b.a;
            vci vciVar2 = vci.a;
            xv7.j(n, androidx.compose.foundation.layout.a.o(d.d(vciVar2, 1.0f), f, 0.0f, 2), j2, 0L, 0L, 3, 0L, 0, false, 0, 0, null, c2, oq5Var, 48, 0, 65272);
            float f22 = 28;
            u1g.l(oq5Var, d.e(vciVar2, f22));
            etn.h(((Boolean) aqiVar.getValue()).booleanValue(), null, c.d(13), null, null, ild.C(453036065, new f6p(6, wwpVar, function1), oq5Var), oq5Var, 1575942, 26);
            u1g.l(oq5Var, d.e(vciVar2, f22));
            yci o2 = androidx.compose.foundation.layout.a.o(vciVar2, 16, 0.0f, 2);
            int i122 = i8 & 112;
            if (i122 != 32) {
            }
            K = oq5Var.K();
            if (!z4) {
            }
            K = new mjm(26, tvpVar);
            oq5Var.k0(K);
            yci b2 = nfp.b(o2, false, (Function1) K);
            h = (i122 != 32) | ((i8 & 896) == 256) | oq5Var.h(context);
            K2 = oq5Var.K();
            if (!h) {
            }
            K2 = new p3e(22, tvpVar, function2, context);
            oq5Var.k0(K2);
            weo.h(b2, null, null, null, null, null, false, (Function1) K2, oq5Var, 0, 254);
            oq5Var = oq5Var;
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new k26(zwpVar, tvpVar, function2, z, wwpVar, function1, yciVar, i);
        }
    }

    public static final long g(float f, float f2) {
        long floatToRawIntBits = (Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
        int i = a7t.c;
        return floatToRawIntBits;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void h(int i, Function0 function0, yci yciVar, Function0 function02, boolean z, boolean z2, hq5 hq5Var, int i2, int i3) {
        int i4;
        Function0 function03;
        int i5;
        boolean z3;
        int i6;
        boolean z4;
        kjn kjnVar;
        Function0 function04;
        boolean z5;
        Object K;
        yie yieVar;
        int i7;
        boolean z6;
        boolean z7;
        xmn r;
        function0.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1664743528);
        if ((i2 & 6) == 0) {
            i4 = (oq5Var.d(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= oq5Var.h(function0) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= oq5Var.f(yciVar) ? 256 : 128;
        }
        int i8 = i3 & 8;
        if (i8 != 0) {
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            function03 = function02;
            i4 |= oq5Var.h(function03) ? 2048 : 1024;
            i5 = i3 & 16;
            if (i5 == 0) {
                i4 |= 24576;
            } else if ((i2 & 24576) == 0) {
                z3 = z;
                i4 |= oq5Var.g(z3) ? 16384 : RemoteCameraConfig.Notification.ID;
                i6 = i3 & 32;
                if (i6 != 0) {
                    i4 |= 196608;
                } else if ((196608 & i2) == 0) {
                    z4 = z2;
                    i4 |= oq5Var.g(z4) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
                    if ((74899 & i4) == 74898 || !oq5Var.z()) {
                        kjnVar = gq5.a;
                        if (i8 == 0) {
                            Object K2 = oq5Var.K();
                            if (K2 == kjnVar) {
                                K2 = new s2(28);
                                oq5Var.k0(K2);
                            }
                            function04 = (Function0) K2;
                        } else {
                            function04 = function03;
                        }
                        z5 = i5 == 0 ? true : z3;
                        boolean z8 = i6 == 0 ? true : z4;
                        Function0 function05 = (Function0) oq5Var.j(zlu.d);
                        w4k E = a0g.E(i, i4 & 14, oq5Var);
                        K = oq5Var.K();
                        if (K == kjnVar) {
                            K = vz1.h(oq5Var);
                        }
                        uoi uoiVar = (uoi) K;
                        if (z5) {
                            oq5Var.Z(-1236885462);
                            oq5Var.p(false);
                            yieVar = null;
                        } else {
                            oq5Var.Z(-2118109926);
                            yieVar = (yie) oq5Var.j(e.a);
                            oq5Var.p(false);
                        }
                        yci d = androidx.compose.foundation.a.d(androidx.compose.ui.draw.a.c(xp3.u(d.m(yciVar, 56), ugo.a), new kw1(5, function05, function04)), uoiVar, yieVar, false, null, new meo(0), function0, 12);
                        kfh d2 = ug3.d(b2c.b, false);
                        i7 = oq5Var.P;
                        a l = oq5Var.l();
                        yci H = vnj.H(oq5Var, d);
                        xp5.T.getClass();
                        grb grbVar = wp5.b;
                        oq5Var.d0();
                        if (oq5Var.O) {
                            oq5Var.n0();
                        } else {
                            oq5Var.k(grbVar);
                        }
                        g0g.U(oq5Var, d2, wp5.f);
                        g0g.U(oq5Var, l, wp5.e);
                        kb5 kb5Var = wp5.g;
                        if (!oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i7))) {
                            ouj.x(i7, oq5Var, i7, kb5Var);
                        }
                        g0g.U(oq5Var, H, wp5.d);
                        ksw.j(0, oq5Var, b.a.a(d.m(vci.a, 24), b2c.f), new kw1(6, E, function05));
                        oq5Var.p(true);
                        z6 = z5;
                        z7 = z8;
                    } else {
                        oq5Var.S();
                        function04 = function03;
                        z6 = z3;
                        z7 = z4;
                    }
                    r = oq5Var.r();
                    if (r == null) {
                        r.d = new jxq(i, function0, yciVar, function04, z6, z7, i2, i3);
                        return;
                    }
                    return;
                }
                z4 = z2;
                if ((74899 & i4) == 74898) {
                }
                kjnVar = gq5.a;
                if (i8 == 0) {
                }
                if (i5 == 0) {
                }
                if (i6 == 0) {
                }
                Function0 function052 = (Function0) oq5Var.j(zlu.d);
                w4k E2 = a0g.E(i, i4 & 14, oq5Var);
                K = oq5Var.K();
                if (K == kjnVar) {
                }
                uoi uoiVar2 = (uoi) K;
                if (z5) {
                }
                yci d3 = androidx.compose.foundation.a.d(androidx.compose.ui.draw.a.c(xp3.u(d.m(yciVar, 56), ugo.a), new kw1(5, function052, function04)), uoiVar2, yieVar, false, null, new meo(0), function0, 12);
                kfh d22 = ug3.d(b2c.b, false);
                i7 = oq5Var.P;
                a l2 = oq5Var.l();
                yci H2 = vnj.H(oq5Var, d3);
                xp5.T.getClass();
                grb grbVar2 = wp5.b;
                oq5Var.d0();
                if (oq5Var.O) {
                }
                g0g.U(oq5Var, d22, wp5.f);
                g0g.U(oq5Var, l2, wp5.e);
                kb5 kb5Var2 = wp5.g;
                if (!oq5Var.O) {
                }
                ouj.x(i7, oq5Var, i7, kb5Var2);
                g0g.U(oq5Var, H2, wp5.d);
                ksw.j(0, oq5Var, b.a.a(d.m(vci.a, 24), b2c.f), new kw1(6, E2, function052));
                oq5Var.p(true);
                z6 = z5;
                z7 = z8;
                r = oq5Var.r();
                if (r == null) {
                }
            }
            z3 = z;
            i6 = i3 & 32;
            if (i6 != 0) {
            }
            z4 = z2;
            if ((74899 & i4) == 74898) {
            }
            kjnVar = gq5.a;
            if (i8 == 0) {
            }
            if (i5 == 0) {
            }
            if (i6 == 0) {
            }
            Function0 function0522 = (Function0) oq5Var.j(zlu.d);
            w4k E22 = a0g.E(i, i4 & 14, oq5Var);
            K = oq5Var.K();
            if (K == kjnVar) {
            }
            uoi uoiVar22 = (uoi) K;
            if (z5) {
            }
            yci d32 = androidx.compose.foundation.a.d(androidx.compose.ui.draw.a.c(xp3.u(d.m(yciVar, 56), ugo.a), new kw1(5, function0522, function04)), uoiVar22, yieVar, false, null, new meo(0), function0, 12);
            kfh d222 = ug3.d(b2c.b, false);
            i7 = oq5Var.P;
            a l22 = oq5Var.l();
            yci H22 = vnj.H(oq5Var, d32);
            xp5.T.getClass();
            grb grbVar22 = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
            }
            g0g.U(oq5Var, d222, wp5.f);
            g0g.U(oq5Var, l22, wp5.e);
            kb5 kb5Var22 = wp5.g;
            if (!oq5Var.O) {
            }
            ouj.x(i7, oq5Var, i7, kb5Var22);
            g0g.U(oq5Var, H22, wp5.d);
            ksw.j(0, oq5Var, b.a.a(d.m(vci.a, 24), b2c.f), new kw1(6, E22, function0522));
            oq5Var.p(true);
            z6 = z5;
            z7 = z8;
            r = oq5Var.r();
            if (r == null) {
            }
        }
        function03 = function02;
        i5 = i3 & 16;
        if (i5 == 0) {
        }
        z3 = z;
        i6 = i3 & 32;
        if (i6 != 0) {
        }
        z4 = z2;
        if ((74899 & i4) == 74898) {
        }
        kjnVar = gq5.a;
        if (i8 == 0) {
        }
        if (i5 == 0) {
        }
        if (i6 == 0) {
        }
        Function0 function05222 = (Function0) oq5Var.j(zlu.d);
        w4k E222 = a0g.E(i, i4 & 14, oq5Var);
        K = oq5Var.K();
        if (K == kjnVar) {
        }
        uoi uoiVar222 = (uoi) K;
        if (z5) {
        }
        yci d322 = androidx.compose.foundation.a.d(androidx.compose.ui.draw.a.c(xp3.u(d.m(yciVar, 56), ugo.a), new kw1(5, function05222, function04)), uoiVar222, yieVar, false, null, new meo(0), function0, 12);
        kfh d2222 = ug3.d(b2c.b, false);
        i7 = oq5Var.P;
        a l222 = oq5Var.l();
        yci H222 = vnj.H(oq5Var, d322);
        xp5.T.getClass();
        grb grbVar222 = wp5.b;
        oq5Var.d0();
        if (oq5Var.O) {
        }
        g0g.U(oq5Var, d2222, wp5.f);
        g0g.U(oq5Var, l222, wp5.e);
        kb5 kb5Var222 = wp5.g;
        if (!oq5Var.O) {
        }
        ouj.x(i7, oq5Var, i7, kb5Var222);
        g0g.U(oq5Var, H222, wp5.d);
        ksw.j(0, oq5Var, b.a.a(d.m(vci.a, 24), b2c.f), new kw1(6, E222, function05222));
        oq5Var.p(true);
        z6 = z5;
        z7 = z8;
        r = oq5Var.r();
        if (r == null) {
        }
    }

    public static void i(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) {
        if (!G(b2)) {
            if ((((b2 + 112) + (b << 28)) >> 30) == 0 && !G(b3) && !G(b4)) {
                int i2 = ((b & 7) << 18) | ((b2 & 63) << 12) | ((b3 & 63) << 6) | (b4 & 63);
                cArr[i] = (char) ((i2 >>> 10) + 55232);
                cArr[i + 1] = (char) ((i2 & 1023) + 56320);
                return;
            }
        }
        throw aye.a();
    }

    public static void j(byte b, byte b2, char[] cArr, int i) {
        if (b < -62 || G(b2)) {
            throw aye.a();
        }
        cArr[i] = (char) (((b & 31) << 6) | (b2 & 63));
    }

    public static void k(byte b, byte b2, byte b3, char[] cArr, int i) {
        if (G(b2) || ((b == -32 && b2 < -96) || ((b == -19 && b2 >= -96) || G(b3)))) {
            throw aye.a();
        }
        cArr[i] = (char) (((b & 15) << 12) | ((b2 & 63) << 6) | (b3 & 63));
    }

    public static final int l(int i, int i2) {
        return i | (i2 << 8) | SQLiteDatabase.OPEN_FULLMUTEX;
    }

    public static final Object m(float f, float f2, float f3, tm0 tm0Var, Function2 function2, Continuation continuation) {
        Object o = o(azt.a, new Float(f), new Float(f2), new Float(f3), tm0Var, function2, continuation);
        return o == nm6.a ? o : Unit.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0100 A[Catch: CancellationException -> 0x003b, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x003b, blocks: (B:16:0x0036, B:18:0x00eb, B:20:0x0100, B:25:0x0123, B:27:0x0136, B:33:0x013b), top: B:15:0x0036 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0156 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object n(vm0 vm0Var, cm0 cm0Var, long j, Function1 function1, Continuation continuation) {
        vtr vtrVar;
        nm6 nm6Var;
        int i;
        xqn xqnVar;
        vm0 vm0Var2;
        vm0 vm0Var3;
        xqn xqnVar2;
        Object P;
        Function1 function12;
        sm0 sm0Var;
        sm0 sm0Var2;
        Object obj;
        Object P2;
        cm0 cm0Var2 = cm0Var;
        if (continuation instanceof vtr) {
            vtrVar = (vtr) continuation;
            int i2 = vtrVar.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                vtrVar.o = i2 - Integer.MIN_VALUE;
                vtr vtrVar2 = vtrVar;
                Object obj2 = vtrVar2.n;
                nm6Var = nm6.a;
                i = vtrVar2.o;
                if (i != 0) {
                    qgg.h0(obj2);
                    Object f = cm0Var2.f(0L);
                    cn0 b = cm0Var2.b(0L);
                    xqnVar = new xqn();
                    if (j == Long.MIN_VALUE) {
                        try {
                            vm0Var2 = vm0Var;
                        } catch (CancellationException e) {
                            e = e;
                            vm0Var2 = vm0Var;
                        }
                        try {
                            xtr xtrVar = new xtr(xqnVar, f, cm0Var2, b, vm0Var2, D(vtrVar2.getContext()), function1);
                            xqnVar2 = xqnVar;
                            try {
                                vtrVar2.j = vm0Var2;
                                vtrVar2.k = cm0Var2;
                                vtrVar2.l = function1;
                                vtrVar2.m = xqnVar2;
                                vtrVar2.o = 1;
                                if (cm0Var2.a()) {
                                    P = bkp.w0(xtrVar, vtrVar2);
                                } else {
                                    P = bzf.D(vtrVar2.getContext()).P(new kif(7, xtrVar), vtrVar2);
                                }
                                if (P != nm6Var) {
                                    function12 = function1;
                                    vm0Var3 = vm0Var2;
                                }
                                return nm6Var;
                            } catch (CancellationException e2) {
                                e = e2;
                                vm0Var3 = vm0Var2;
                                xqnVar = xqnVar2;
                                sm0Var = (sm0) xqnVar.a;
                                if (sm0Var != null) {
                                }
                                sm0Var2 = (sm0) xqnVar.a;
                                if (sm0Var2 != null) {
                                }
                                throw e;
                            }
                        } catch (CancellationException e3) {
                            e = e3;
                            vm0Var3 = vm0Var2;
                            sm0Var = (sm0) xqnVar.a;
                            if (sm0Var != null) {
                            }
                            sm0Var2 = (sm0) xqnVar.a;
                            if (sm0Var2 != null) {
                            }
                            throw e;
                        }
                    }
                    xqnVar2 = xqnVar;
                    try {
                        sm0 sm0Var3 = new sm0(f, cm0Var2.e(), b, j, cm0Var2.g(), j, new wtr(1, vm0Var));
                        z(sm0Var3, j, D(vtrVar2.getContext()), cm0Var2, vm0Var, function1);
                        xqnVar2.a = sm0Var3;
                        vm0Var3 = vm0Var;
                        cm0Var2 = cm0Var;
                        function12 = function1;
                    } catch (CancellationException e4) {
                        e = e4;
                        vm0Var3 = vm0Var;
                        xqnVar = xqnVar2;
                        sm0Var = (sm0) xqnVar.a;
                        if (sm0Var != null) {
                        }
                        sm0Var2 = (sm0) xqnVar.a;
                        if (sm0Var2 != null) {
                        }
                        throw e;
                    }
                    xqnVar = xqnVar2;
                } else {
                    if (i != 1 && i != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    xqnVar = vtrVar2.m;
                    function12 = vtrVar2.l;
                    cm0Var2 = vtrVar2.k;
                    vm0Var3 = vtrVar2.j;
                    try {
                        qgg.h0(obj2);
                    } catch (CancellationException e5) {
                        e = e5;
                        sm0Var = (sm0) xqnVar.a;
                        if (sm0Var != null) {
                        }
                        sm0Var2 = (sm0) xqnVar.a;
                        if (sm0Var2 != null) {
                            vm0Var3.f = false;
                        }
                        throw e;
                    }
                }
                do {
                    obj = xqnVar.a;
                    obj.getClass();
                    if (((Boolean) ((sm0) obj).i.getValue()).booleanValue()) {
                        return Unit.a;
                    }
                    xqn xqnVar3 = xqnVar;
                    Function1 function13 = function12;
                    cm0 cm0Var3 = cm0Var2;
                    vm0 vm0Var4 = vm0Var3;
                    try {
                        ytr ytrVar = new ytr(xqnVar3, D(vtrVar2.getContext()), cm0Var3, vm0Var4, function13);
                        xqnVar = xqnVar3;
                        cm0Var2 = cm0Var3;
                        vm0Var3 = vm0Var4;
                        function12 = function13;
                        vtrVar2.j = vm0Var3;
                        vtrVar2.k = cm0Var2;
                        vtrVar2.l = function12;
                        vtrVar2.m = xqnVar;
                        vtrVar2.o = 2;
                        if (cm0Var2.a()) {
                            P2 = bkp.w0(ytrVar, vtrVar2);
                        } else {
                            P2 = bzf.D(vtrVar2.getContext()).P(new kif(7, ytrVar), vtrVar2);
                        }
                    } catch (CancellationException e6) {
                        e = e6;
                        xqnVar = xqnVar3;
                        vm0Var3 = vm0Var4;
                        sm0Var = (sm0) xqnVar.a;
                        if (sm0Var != null) {
                            sm0Var.i.setValue(Boolean.FALSE);
                        }
                        sm0Var2 = (sm0) xqnVar.a;
                        if (sm0Var2 != null && sm0Var2.g == vm0Var3.d) {
                            vm0Var3.f = false;
                        }
                        throw e;
                    }
                } while (P2 != nm6Var);
                return nm6Var;
            }
        }
        vtrVar = new vtr(continuation);
        vtr vtrVar22 = vtrVar;
        Object obj22 = vtrVar22.n;
        nm6Var = nm6.a;
        i = vtrVar22.o;
        if (i != 0) {
        }
        do {
            obj = xqnVar.a;
            obj.getClass();
            if (((Boolean) ((sm0) obj).i.getValue()).booleanValue()) {
            }
        } while (P2 != nm6Var);
        return nm6Var;
    }

    public static final Object o(oct octVar, Object obj, Object obj2, Float f, tm0 tm0Var, Function2 function2, Continuation continuation) {
        cn0 c;
        Function1 function1 = octVar.a;
        if (f == null || (c = (cn0) function1.invoke(f)) == null) {
            c = ((cn0) function1.invoke(obj)).c();
        }
        cn0 cn0Var = c;
        Object n = n(new vm0(octVar, obj, cn0Var, 56), new l6s(tm0Var, octVar, obj, obj2, cn0Var), Long.MIN_VALUE, new gcp(10, function2, octVar), continuation);
        return n == nm6.a ? n : Unit.a;
    }

    public static /* synthetic */ Object p(float f, float f2, tm0 tm0Var, Function2 function2, Continuation continuation, int i) {
        if ((i & 8) != 0) {
            tm0Var = weo.Q(0.0f, 0.0f, null, 7);
        }
        return m(f, f2, 0.0f, tm0Var, function2, continuation);
    }

    public static final Object q(vm0 vm0Var, uf7 uf7Var, boolean z, Function1 function1, cg6 cg6Var) {
        Object n = n(vm0Var, new tf7(uf7Var, vm0Var.a, vm0Var.b.getValue(), vm0Var.c), z ? vm0Var.d : Long.MIN_VALUE, function1, cg6Var);
        return n == nm6.a ? n : Unit.a;
    }

    public static final Object r(vm0 vm0Var, Float f, tm0 tm0Var, boolean z, Function1 function1, cg6 cg6Var) {
        Object n = n(vm0Var, new l6s(tm0Var, vm0Var.a, vm0Var.b.getValue(), f, vm0Var.c), z ? vm0Var.d : Long.MIN_VALUE, function1, cg6Var);
        return n == nm6.a ? n : Unit.a;
    }

    public static /* synthetic */ Object s(vm0 vm0Var, Float f, tm0 tm0Var, boolean z, Function1 function1, cg6 cg6Var, int i) {
        if ((i & 2) != 0) {
            tm0Var = weo.Q(0.0f, 0.0f, null, 7);
        }
        tm0 tm0Var2 = tm0Var;
        if ((i & 4) != 0) {
            z = false;
        }
        boolean z2 = z;
        if ((i & 8) != 0) {
            function1 = dpo.B0;
        }
        return r(vm0Var, f, tm0Var2, z2, function1, cg6Var);
    }

    public static fij t(pjc pjcVar) {
        return new fij(new suh(17, g.a, pjcVar));
    }

    public static final void u(List list) {
        List<c3b> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return;
        }
        for (c3b c3bVar : list2) {
        }
    }

    public static final void v(xzi xziVar, cds cdsVar) {
        if (!cdsVar.c() || cdsVar.a.f == 3) {
            return;
        }
        long j = cdsVar.c;
        xziVar.W(0.0f, 0.0f, (int) (j >> 32), (int) (j & 4294967295L), 1);
    }

    public static final g1h x(g3h g3hVar, q2h q2hVar, r2h r2hVar, String str) {
        q2hVar.getClass();
        r2hVar.getClass();
        str.getClass();
        return new g1h(g3hVar, q2hVar.a, q2hVar.b, q2hVar.e, q2hVar.d, r2hVar, str, jhp.k(jhp.e(new o7t(new wz0(7, str), new lhd(21, new Regex("\\[(\\d{2,}):(\\d\\d)\\.(\\d\\d)](.*)"))))));
    }

    public static boolean y() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            aec.d();
            aec d = aec.d();
            d.a();
            Context context = d.a;
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("export_to_big_query")) {
                return sharedPreferences.getBoolean("export_to_big_query", false);
            }
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("delivery_metrics_exported_to_big_query_enabled")) {
                    return applicationInfo.metaData.getBoolean("delivery_metrics_exported_to_big_query_enabled", false);
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            return false;
        } catch (IllegalStateException unused2) {
            Log.i("FirebaseMessaging", "FirebaseApp has not being initialized. Device might be in direct boot mode. Skip exporting delivery metrics to Big Query");
            return false;
        }
    }

    public static final void z(sm0 sm0Var, long j, float f, cm0 cm0Var, vm0 vm0Var, Function1 function1) {
        long d = f == 0.0f ? cm0Var.d() : (long) ((j - sm0Var.c) / f);
        sm0Var.g = j;
        sm0Var.e.setValue(cm0Var.f(d));
        sm0Var.f = cm0Var.b(d);
        if (cm0Var.c(d)) {
            sm0Var.h = sm0Var.g;
            sm0Var.i.setValue(Boolean.FALSE);
        }
        W(sm0Var, vm0Var);
        function1.invoke(sm0Var);
    }

    public abstract v5g L(String str, Function1 function1);

    public abstract Object w();
}
