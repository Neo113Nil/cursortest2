package ru.yandex.music.common.media.mediabrowser;

import android.app.UiModeManager;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Process;
import defpackage.a4g;
import defpackage.arf;
import defpackage.at3;
import defpackage.bdt;
import defpackage.bih;
import defpackage.btf;
import defpackage.bwf;
import defpackage.c5b;
import defpackage.c62;
import defpackage.ckg;
import defpackage.cxb;
import defpackage.dm6;
import defpackage.dmg;
import defpackage.dth;
import defpackage.duh;
import defpackage.eps;
import defpackage.euh;
import defpackage.f1d;
import defpackage.frt;
import defpackage.fuh;
import defpackage.gld;
import defpackage.guh;
import defpackage.hag;
import defpackage.hrg;
import defpackage.hu0;
import defpackage.im6;
import defpackage.jyr;
import defpackage.kbn;
import defpackage.kef;
import defpackage.l18;
import defpackage.l2q;
import defpackage.mn7;
import defpackage.nnd;
import defpackage.o2q;
import defpackage.otd;
import defpackage.ovh;
import defpackage.ox6;
import defpackage.p6o;
import defpackage.pjc;
import defpackage.psh;
import defpackage.q72;
import defpackage.r2f;
import defpackage.s72;
import defpackage.ssg;
import defpackage.tf6;
import defpackage.tlm;
import defpackage.u5i;
import defpackage.uhh;
import defpackage.v75;
import defpackage.vb0;
import defpackage.x97;
import defpackage.xb0;
import defpackage.xz0;
import defpackage.y1c;
import defpackage.y60;
import defpackage.z66;
import defpackage.zgh;
import defpackage.zig;
import defpackage.zsd;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class MusicBrowserService extends bih {
    public static boolean n;
    public final tf6 h = gld.e(dm6.c.plus(a4g.n()).plus(new im6("MusicBrowserService")));
    public final jyr i;
    public final jyr j;
    public final jyr k;
    public final jyr l;
    public final jyr m;

    public MusicBrowserService() {
        bdt I = hag.I(psh.class);
        l18 l18Var = l18.b;
        this.i = l18Var.b(I, true);
        this.j = l18Var.b(hag.I(kbn.class), true);
        this.k = l18Var.b(hag.I(ovh.class), true);
        this.l = btf.b(new u5i(4));
        this.m = btf.b(new dmg(21, this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0029, code lost:
    
        if (r2 != null) goto L76;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0221 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0196  */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v5, types: [c5b] */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.util.ArrayList] */
    @Override // defpackage.bih
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final nnd b(int i, String str) {
        PackageInfo packageInfo;
        ApplicationInfo applicationInfo;
        String str2;
        duh duhVar;
        ?? r9;
        boolean z;
        f();
        o2q g = g();
        g.getClass();
        guh guhVar = (guh) g.j.getValue();
        PackageManager packageManager = guhVar.a;
        LinkedHashMap linkedHashMap = guhVar.d;
        at3 at3Var = (at3) linkedHashMap.get(str);
        if (at3Var != null) {
            if (at3Var.a != i) {
                at3Var = null;
            }
        }
        try {
            packageInfo = packageManager.getPackageInfo(str, 4160);
        } catch (PackageManager.NameNotFoundException unused) {
            packageInfo = null;
        }
        if (packageInfo != null && (applicationInfo = packageInfo.applicationInfo) != null) {
            String obj = applicationInfo.loadLabel(packageManager).toString();
            int i2 = applicationInfo.uid;
            Signature[] signatureArr = packageInfo.signatures;
            if (signatureArr == null || signatureArr.length != 1) {
                str2 = null;
            } else {
                byte[] byteArray = signatureArr[0].toByteArray();
                byteArray.getClass();
                try {
                    MessageDigest messageDigest = MessageDigest.getInstance("SHA256");
                    messageDigest.getClass();
                    messageDigest.update(byteArray);
                    byte[] digest = messageDigest.digest();
                    digest.getClass();
                    str2 = xz0.I(digest, StringUtils.PROCESS_POSTFIX_DELIMITER, new dth(26));
                } catch (NoSuchAlgorithmException unused2) {
                    str2 = "Fail to find algorithm SHA256";
                }
            }
            int[] iArr = packageInfo.requestedPermissionsFlags;
            if (iArr != null) {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                String[] strArr = packageInfo.requestedPermissions;
                if (strArr != null) {
                    int length = strArr.length;
                    int i3 = 0;
                    int i4 = 0;
                    while (i3 < length) {
                        String str3 = strArr[i3];
                        int i5 = i4 + 1;
                        if ((iArr[i4] & 2) != 0) {
                            linkedHashSet.add(str3);
                        }
                        i3++;
                        i4 = i5;
                    }
                }
                duhVar = new duh(obj, str, i2, str2, CollectionsKt.A0(linkedHashSet));
                if (duhVar == null && duhVar.c == i) {
                    String str4 = duhVar.d;
                    Set set = duhVar.e;
                    euh euhVar = (euh) guhVar.b.get(str);
                    if (euhVar != null) {
                        Set set2 = euhVar.c;
                        r9 = new ArrayList(v75.o(set2, 10));
                        Iterator it = set2.iterator();
                        while (it.hasNext()) {
                            r9.add(((fuh) it.next()).a);
                        }
                    } else {
                        r9 = 0;
                    }
                    if (r9 == 0) {
                        r9 = c5b.a;
                    }
                    boolean equals = str.equals("com.google.android.googlequicksearchbox");
                    at3Var = i == Process.myUid() ? new at3("own app", true, equals, i) : i == 1000 ? new at3("system", true, equals, i) : CollectionsKt.I((Iterable) r9, str4) ? new at3("caller in allow list", true, equals, i) : Intrinsics.d(str4, guhVar.c) ? new at3("app was signed by platform", true, equals, i) : set.contains("android.permission.MEDIA_CONTENT_CONTROL") ? new at3("media content control permission", true, equals, i) : set.contains("android.permission.BIND_NOTIFICATION_LISTENER_SERVICE") ? new at3("bind notification service permission", true, equals, i) : new at3("unknown caller", false, equals, i);
                    linkedHashMap.put(str, at3Var);
                } else {
                    ssg.a(7, null, "This should never happen... according to Google", null);
                    at3Var = new at3("caller uid mismatch", false, false, i);
                }
                z = at3Var.b;
                String str5 = at3Var.c;
                boolean z2 = at3Var.d;
                StringBuilder l = f1d.l(i, "onGetRoot(package=", str, ", uid=", ", verified=");
                l.append(z);
                l.append(", reason=");
                l.append(str5);
                l.append(")");
                ssg.a(4, "MusicBrowserService", l.toString(), null);
                if (!z) {
                    zgh zghVar = zgh.b;
                    zghVar.getClass();
                    y60 e = zghVar.e();
                    String str6 = n ? "AndroidAuto" : "OtherMedia";
                    bwf bwfVar = bwf.c;
                    arf g2 = tlm.g(bwfVar);
                    Map map = (Map) g2.getValue();
                    arf g3 = tlm.g(bwfVar);
                    ((Map) g3.getValue()).put("unknown_caller", str);
                    map.put("MediaSession", g3.isInitialized() ? (Map) g3.getValue() : null);
                    tlm.o(e, str6, g2.isInitialized() ? (Map) g2.getValue() : null);
                }
                if (z) {
                    return null;
                }
                o2q g4 = g();
                g4.getClass();
                String str7 = z2 ? "media_suggested_browser_root_id" : "media_browser_root_id";
                g4.a().getClass();
                return new nnd(8, str7, cxb.K(new Pair("android.media.browse.CONTENT_STYLE_BROWSABLE_HINT", 1), new Pair("android.media.browse.CONTENT_STYLE_PLAYABLE_HINT", 1)));
            }
        }
        duhVar = null;
        if (duhVar == null) {
        }
        ssg.a(7, null, "This should never happen... according to Google", null);
        at3Var = new at3("caller uid mismatch", false, false, i);
        z = at3Var.b;
        String str52 = at3Var.c;
        boolean z22 = at3Var.d;
        StringBuilder l2 = f1d.l(i, "onGetRoot(package=", str, ", uid=", ", verified=");
        l2.append(z);
        l2.append(", reason=");
        l2.append(str52);
        l2.append(")");
        ssg.a(4, "MusicBrowserService", l2.toString(), null);
        if (!z) {
        }
        if (z) {
        }
    }

    @Override // defpackage.bih
    public final void c(String str, uhh uhhVar) {
        Continuation continuation = null;
        ssg.a(4, "MusicBrowserService", hrg.A(str, "onLoadChildren(parentId=", str, ")"), null);
        uhhVar.a();
        zgh zghVar = zgh.b;
        zghVar.getClass();
        if (!Intrinsics.d(zgh.c, str)) {
            y60 e = zghVar.e();
            String str2 = n ? "AndroidAuto" : "OtherMedia";
            bwf bwfVar = bwf.c;
            arf g = tlm.g(bwfVar);
            Map map = (Map) g.getValue();
            arf g2 = tlm.g(bwfVar);
            ((Map) g2.getValue()).put("open", str);
            map.put("MediaBrowser", g2.isInitialized() ? (Map) g2.getValue() : null);
            tlm.o(e, str2, g.isInitialized() ? (Map) g.getValue() : null);
            zgh.c = str;
        }
        o2q g3 = g();
        kef kefVar = new kef(1, uhhVar, uhh.class, "sendResult", "sendResult(Ljava/lang/Object;)V", 0, 14);
        g3.getClass();
        tf6 tf6Var = g3.e;
        if (tf6Var != null) {
            x97.y(tf6Var, null, null, new ckg((Object) g3, str, (Serializable) kefVar, continuation, 29), 3);
        }
    }

    @Override // defpackage.bih
    public final void d(String str, uhh uhhVar) {
        ssg.a(3, "MusicBrowserService", hrg.q("onLoadItem(itemId=", str, ")"), null);
        g().getClass();
        uhhVar.d = 2;
        uhhVar.d(null);
    }

    public final boolean f() {
        boolean z = ((UiModeManager) this.m.getValue()).getCurrentModeType() == 3;
        n = z;
        return z;
    }

    public final o2q g() {
        return (o2q) this.l.getValue();
    }

    @Override // defpackage.bih, android.app.Service
    public final void onCreate() {
        super.onCreate();
        ssg.a(4, "MusicBrowserService", "onCreate", null);
        f();
        zig zigVar = new zig(this, (Continuation) null, 24);
        tf6 tf6Var = this.h;
        x97.y(tf6Var, null, null, zigVar, 3);
        ox6.B(g().l, tf6Var, new otd(29, this));
        o2q g = g();
        tf6 tf6Var2 = g.e;
        jyr jyrVar = g.h;
        if (tf6Var2 != null) {
            return;
        }
        mn7 mn7Var = dm6.b;
        tf6 e = gld.e(mn7Var);
        g.e = e;
        s72 a = g.a();
        a.getClass();
        ox6.B(a.b.b, e, new q72(a, 1));
        xb0 xb0Var = (xb0) g.a().i.getValue();
        if (xb0Var.d == null) {
            tf6 e2 = gld.e(mn7Var);
            xb0Var.d = e2;
            ox6.B(xb0Var.e, e2, new vb0(xb0Var, 0));
            ox6.B(xb0Var.h, e2, new vb0(xb0Var, 1));
        }
        ((hu0) g.d.getValue()).getClass();
        s72 a2 = g.a();
        a2.getClass();
        ox6.B(zsd.d0((pjc) a2.h.getValue(), 1), e, new q72(a2, 0));
        ox6.B(((frt) ((arf) g.i.getValue()).getValue()).g(), e, new l2q(g, 0));
        ox6.B(g.a().n, e, new l2q(g, 1));
        ox6.B(zsd.d0(zsd.b0(new p6o(((z66) ((arf) jyrVar.getValue()).getValue()).c(), 12)), 1), e, new l2q(g, 3));
        ox6.B(zsd.d0(zsd.b0(new p6o(((z66) ((arf) jyrVar.getValue()).getValue()).c(), 11)), 1), e, new l2q(g, 2));
    }

    @Override // defpackage.bih, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        ssg.a(4, "MusicBrowserService", "onDestroy", null);
        if (n != f()) {
            eps epsVar = ((ovh) this.k.getValue()).c;
            ssg.a(3, "ExternalMediaSignalsCenter", "revokePlayOnFocus", null);
            y1c y1cVar = (y1c) epsVar.f;
            if (y1cVar != null) {
                y1cVar.f = false;
            }
        }
        o2q g = g();
        tf6 tf6Var = g.e;
        if (tf6Var != null) {
            gld.L(tf6Var, null);
            g.e = null;
            ((hu0) g.d.getValue()).getClass();
            s72 a = g.a();
            xb0 xb0Var = (xb0) a.i.getValue();
            ConcurrentHashMap concurrentHashMap = xb0Var.k;
            Collection<r2f> values = concurrentHashMap.values();
            values.getClass();
            for (r2f r2fVar : values) {
                r2fVar.getClass();
                r2fVar.g(null);
            }
            concurrentHashMap.clear();
            tf6 tf6Var2 = xb0Var.d;
            if (tf6Var2 != null) {
                gld.L(tf6Var2, null);
            }
            xb0Var.d = null;
            c62 c62Var = a.c;
            c62Var.a.clear();
            c62Var.b.clear();
            c62Var.c.clear();
            c62Var.d.clear();
            c62Var.e.clear();
            c62Var.f.clear();
        }
        gld.L(this.h, null);
    }
}
