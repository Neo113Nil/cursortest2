package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Looper;
import android.widget.Toast;
import androidx.fragment.app.t;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.yandex.music.shared.utils.assertions.Assertions;
import com.yandex.music.shared.utils.assertions.FailedAssertionException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.c;
import ru.yandex.music.R;
import ru.yandex.music.webview.WebViewScreenActivity;
import ru.yandex.music.ynison.data.a;

/* loaded from: classes4.dex */
public final class j2n {
    public static final /* synthetic */ s9f[] D;
    public static final List E;
    public final r2e A;
    public Toast B;
    public final sml C;
    public final Context a;
    public final fnb b;
    public final r1n c;
    public final n2n d;
    public final boolean e;
    public final rjq f;
    public final um6 g;
    public final jyr h;
    public final jyr i;
    public final jyr j;
    public final jyr k;
    public final jyr l;
    public final jyr m;
    public final jyr n;
    public final jyr o;
    public final l1n p;
    public final l1n q;
    public final jyr r;
    public final jyr s;
    public final jyr t;
    public rar u;
    public final xdr v;
    public final yc4 w;
    public final yc4 x;
    public final clc y;
    public final ub7 z;

    static {
        opi opiVar = new opi(j2n.class, "picker", "getPicker()Lru/yandex/music/cast/picker/api/CastPicker;", 0);
        ern.a.getClass();
        D = new s9f[]{opiVar};
        E = u75.h(fow.c, fow.e, fow.g, fow.l);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0305 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public j2n(Context context, fnb fnbVar, r1n r1nVar, n2n n2nVar, boolean z) {
        JsonArray c;
        Object obj;
        String str;
        String str2;
        char c2;
        String str3;
        l1n l1nVar;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        JsonObject jsonObject;
        String str11;
        jxb a;
        String b;
        l1n l1nVar2;
        JsonArray c3;
        Iterator it;
        JsonObject jsonObject2;
        Object obj2;
        JsonObject m;
        String str12;
        String str13;
        String str14;
        String str15;
        Iterator it2;
        String str16;
        context.getClass();
        fnbVar.getClass();
        this.a = context;
        this.b = fnbVar;
        this.c = r1nVar;
        this.d = n2nVar;
        this.e = z;
        rjq rjqVar = new rjq(false);
        this.f = rjqVar;
        this.g = hld.s(rjqVar, dm6.b());
        l18 l18Var = l18.b;
        this.h = l18Var.b(hag.I(g64.class), true);
        this.i = l18Var.b(hag.I(odd.class), true);
        this.j = l18Var.b(hag.I(dk4.class), true);
        this.k = l18Var.b(hag.I(afw.class), true);
        this.l = l18Var.b(hag.I(c2c.class), true);
        this.m = l18Var.b(hag.I(c74.class), true);
        this.n = l18Var.b(hag.I(oq7.class), true);
        this.o = l18Var.b(hag.I(k1l.class), true);
        bdt I = hag.I(byb.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        k2n k2nVar = (k2n) ((byb) qdcVar.C(I)).c(ern.a(k2n.class));
        jxb a2 = k2nVar.a();
        String b2 = k2nVar.b();
        if (c.v(b2, "on", true) && (c = a2.c("content")) != null) {
            Boolean a3 = a2.a("viewBro");
            boolean booleanValue = a3 != null ? a3.booleanValue() : true;
            String str17 = swf.H().a;
            String language = swf.G().c.getLanguage();
            Iterator it3 = c.a.iterator();
            JsonObject jsonObject3 = null;
            JsonObject jsonObject4 = null;
            JsonObject jsonObject5 = null;
            while (true) {
                if (!it3.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it3.next();
                Iterator it4 = it3;
                JsonObject m2 = ((JsonElement) obj).m();
                JsonElement v = m2.v("lang");
                if (v != null) {
                    String q = v.q();
                    jsonObject = m2;
                    str11 = q;
                } else {
                    jsonObject = m2;
                    str11 = null;
                }
                if (Intrinsics.d(str11, language)) {
                    jsonObject3 = jsonObject;
                } else if (Intrinsics.d(str11, "ru")) {
                    jsonObject4 = jsonObject;
                } else if (Intrinsics.d(str11, "en")) {
                    jsonObject5 = jsonObject;
                }
                if (Intrinsics.d(str11, str17)) {
                    break;
                } else {
                    it3 = it4;
                }
            }
            JsonElement jsonElement = (JsonElement) obj;
            JsonObject m3 = jsonElement != null ? jsonElement.m() : null;
            m3 = m3 == null ? jsonObject3 == null ? jsonObject4 == null ? jsonObject5 : jsonObject4 : jsonObject3 : m3;
            if (m3 != null) {
                JsonElement v2 = m3.v("title");
                String q2 = v2 != null ? v2.q() : null;
                q2 = (q2 == null || q2.length() == 0) ? null : q2;
                if (q2 == null) {
                    su4.s(2, null, "no correct value for key title", null);
                    q2 = null;
                }
                if (q2 != null) {
                    JsonElement v3 = m3.v("subtitle");
                    String q3 = v3 != null ? v3.q() : null;
                    q3 = (q3 == null || q3.length() == 0) ? null : q3;
                    String str18 = q2;
                    if (q3 == null) {
                        su4.s(2, null, "no correct value for key subtitle", null);
                        str = null;
                    } else {
                        str = q3;
                    }
                    if (str != null) {
                        JsonElement v4 = m3.v("button");
                        String q4 = v4 != null ? v4.q() : null;
                        q4 = (q4 == null || q4.length() == 0) ? null : q4;
                        String str19 = str;
                        if (q4 == null) {
                            su4.s(2, null, "no correct value for key button", null);
                            str2 = null;
                        } else {
                            str2 = q4;
                        }
                        if (str2 != null) {
                            JsonElement v5 = m3.v("buttonUrl");
                            String q5 = v5 != null ? v5.q() : null;
                            q5 = (q5 == null || q5.length() == 0) ? null : q5;
                            if (q5 == null) {
                                c2 = 2;
                                su4.s(2, null, "no correct value for key buttonUrl", null);
                                str3 = null;
                            } else {
                                String str20 = q5;
                                c2 = 2;
                                str3 = str20;
                            }
                            if (str3 != null) {
                                str4 = "title";
                                boolean z2 = booleanValue;
                                str5 = "buttonUrl";
                                str6 = "button";
                                str7 = "no correct value for key subtitle";
                                str8 = "no correct value for key buttonUrl";
                                str9 = "subtitle";
                                str10 = "no correct value for key title";
                                l1nVar = new l1n(b2, str18, str19, str2, str3, z2);
                                this.p = l1nVar;
                                bdt I2 = hag.I(byb.class);
                                qdc qdcVar2 = l18Var.a;
                                qdcVar2.getClass();
                                m1n m1nVar = (m1n) ((byb) qdcVar2.C(I2)).c(ern.a(m1n.class));
                                a = m1nVar.a();
                                b = m1nVar.b();
                                if (c.v(b, "on", true)) {
                                    Boolean a4 = a.a("viewBro");
                                    if (a4 == null) {
                                    }
                                    String str21 = swf.H().a;
                                    String language2 = swf.G().c.getLanguage();
                                    it = c3.a.iterator();
                                    jsonObject2 = null;
                                    JsonObject jsonObject6 = null;
                                    JsonObject jsonObject7 = null;
                                    while (true) {
                                        if (it.hasNext()) {
                                        }
                                        it = it2;
                                    }
                                    JsonElement jsonElement2 = (JsonElement) obj2;
                                    if (jsonElement2 == null) {
                                    }
                                    if (m == null) {
                                    }
                                    if (jsonObject2 != null) {
                                    }
                                }
                                l1nVar2 = null;
                                this.q = l1nVar2;
                                this.r = l18Var.b(hag.I(zza.class), true);
                                this.s = l18Var.b(hag.I(mza.class), true);
                                this.t = btf.b(new o1n(this, 1));
                                Continuation continuation = null;
                                xdr a5 = ydr.a(null);
                                this.v = a5;
                                yc4 M0 = zsd.M0(new bca(a5, 18), new e2n(continuation, this, 0));
                                this.w = M0;
                                this.x = zsd.M0(((g64) this.h.getValue()).h, new e2n(continuation, this, 1));
                                this.y = new clc(new xo2(M0, 4), new jud(2, 17, continuation));
                                this.z = zsd.Q(zsd.s0(i().d(), new s1n(this, continuation, 0)), new d2n(h().n, this, 1), new d2n(g().c().g, this, 2), new b60(4, this, j2n.class, "composeSelectableMenu", "composeSelectableMenu(Lru/yandex/music/cast/ui/PultPicker$CastSourceDevices;Lru/yandex/music/cast/ui/PultPicker$CastSourceDevices;Lru/yandex/music/cast/ui/PultPicker$CastSourceDevices;)Ljava/util/List;", 4, 4));
                                this.A = new r2e(2, this);
                                this.C = new sml(this);
                            }
                            str6 = "button";
                            str7 = "no correct value for key subtitle";
                            str9 = "subtitle";
                            str8 = "no correct value for key buttonUrl";
                            str5 = "buttonUrl";
                            str10 = "no correct value for key title";
                            str4 = "title";
                            l1nVar = null;
                            this.p = l1nVar;
                            bdt I22 = hag.I(byb.class);
                            qdc qdcVar22 = l18Var.a;
                            qdcVar22.getClass();
                            m1n m1nVar2 = (m1n) ((byb) qdcVar22.C(I22)).c(ern.a(m1n.class));
                            a = m1nVar2.a();
                            b = m1nVar2.b();
                            if (c.v(b, "on", true) && (c3 = a.c("content")) != null) {
                                Boolean a42 = a.a("viewBro");
                                boolean booleanValue2 = a42 == null ? a42.booleanValue() : true;
                                String str212 = swf.H().a;
                                String language22 = swf.G().c.getLanguage();
                                it = c3.a.iterator();
                                jsonObject2 = null;
                                JsonObject jsonObject62 = null;
                                JsonObject jsonObject72 = null;
                                while (true) {
                                    if (it.hasNext()) {
                                        obj2 = null;
                                        break;
                                    }
                                    obj2 = it.next();
                                    JsonObject m4 = ((JsonElement) obj2).m();
                                    JsonElement v6 = m4.v("lang");
                                    if (v6 != null) {
                                        it2 = it;
                                        str16 = v6.q();
                                    } else {
                                        it2 = it;
                                        str16 = null;
                                    }
                                    if (Intrinsics.d(str16, language22)) {
                                        jsonObject2 = m4;
                                    } else if (Intrinsics.d(str16, "ru")) {
                                        jsonObject62 = m4;
                                    } else if (Intrinsics.d(str16, "en")) {
                                        jsonObject72 = m4;
                                    }
                                    if (Intrinsics.d(str16, str212)) {
                                        break;
                                    } else {
                                        it = it2;
                                    }
                                }
                                JsonElement jsonElement22 = (JsonElement) obj2;
                                m = jsonElement22 == null ? jsonElement22.m() : null;
                                if (m == null) {
                                    jsonObject2 = m;
                                } else if (jsonObject2 == null) {
                                    jsonObject2 = jsonObject62 == null ? jsonObject72 : jsonObject62;
                                }
                                if (jsonObject2 != null) {
                                    JsonElement v7 = jsonObject2.v(str4);
                                    String q6 = v7 != null ? v7.q() : null;
                                    q6 = (q6 == null || q6.length() == 0) ? null : q6;
                                    if (q6 == null) {
                                        su4.s(2, null, str10, null);
                                        str12 = null;
                                    } else {
                                        str12 = q6;
                                    }
                                    if (str12 != null) {
                                        JsonElement v8 = jsonObject2.v(str9);
                                        String q7 = v8 != null ? v8.q() : null;
                                        q7 = (q7 == null || q7.length() == 0) ? null : q7;
                                        if (q7 == null) {
                                            su4.s(2, null, str7, null);
                                            str13 = null;
                                        } else {
                                            str13 = q7;
                                        }
                                        if (str13 != null) {
                                            JsonElement v9 = jsonObject2.v(str6);
                                            String q8 = v9 != null ? v9.q() : null;
                                            q8 = (q8 == null || q8.length() == 0) ? null : q8;
                                            if (q8 == null) {
                                                su4.s(2, null, "no correct value for key button", null);
                                                str14 = null;
                                            } else {
                                                str14 = q8;
                                            }
                                            if (str14 != null) {
                                                JsonElement v10 = jsonObject2.v(str5);
                                                String q9 = v10 != null ? v10.q() : null;
                                                q9 = (q9 == null || q9.length() == 0) ? null : q9;
                                                if (q9 == null) {
                                                    su4.s(2, null, str8, null);
                                                    str15 = null;
                                                } else {
                                                    str15 = q9;
                                                }
                                                if (str15 != null) {
                                                    l1nVar2 = new l1n(b, str12, str13, str14, str15, booleanValue2);
                                                    this.q = l1nVar2;
                                                    this.r = l18Var.b(hag.I(zza.class), true);
                                                    this.s = l18Var.b(hag.I(mza.class), true);
                                                    this.t = btf.b(new o1n(this, 1));
                                                    Continuation continuation2 = null;
                                                    xdr a52 = ydr.a(null);
                                                    this.v = a52;
                                                    yc4 M02 = zsd.M0(new bca(a52, 18), new e2n(continuation2, this, 0));
                                                    this.w = M02;
                                                    this.x = zsd.M0(((g64) this.h.getValue()).h, new e2n(continuation2, this, 1));
                                                    this.y = new clc(new xo2(M02, 4), new jud(2, 17, continuation2));
                                                    this.z = zsd.Q(zsd.s0(i().d(), new s1n(this, continuation2, 0)), new d2n(h().n, this, 1), new d2n(g().c().g, this, 2), new b60(4, this, j2n.class, "composeSelectableMenu", "composeSelectableMenu(Lru/yandex/music/cast/ui/PultPicker$CastSourceDevices;Lru/yandex/music/cast/ui/PultPicker$CastSourceDevices;Lru/yandex/music/cast/ui/PultPicker$CastSourceDevices;)Ljava/util/List;", 4, 4));
                                                    this.A = new r2e(2, this);
                                                    this.C = new sml(this);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            l1nVar2 = null;
                            this.q = l1nVar2;
                            this.r = l18Var.b(hag.I(zza.class), true);
                            this.s = l18Var.b(hag.I(mza.class), true);
                            this.t = btf.b(new o1n(this, 1));
                            Continuation continuation22 = null;
                            xdr a522 = ydr.a(null);
                            this.v = a522;
                            yc4 M022 = zsd.M0(new bca(a522, 18), new e2n(continuation22, this, 0));
                            this.w = M022;
                            this.x = zsd.M0(((g64) this.h.getValue()).h, new e2n(continuation22, this, 1));
                            this.y = new clc(new xo2(M022, 4), new jud(2, 17, continuation22));
                            this.z = zsd.Q(zsd.s0(i().d(), new s1n(this, continuation22, 0)), new d2n(h().n, this, 1), new d2n(g().c().g, this, 2), new b60(4, this, j2n.class, "composeSelectableMenu", "composeSelectableMenu(Lru/yandex/music/cast/ui/PultPicker$CastSourceDevices;Lru/yandex/music/cast/ui/PultPicker$CastSourceDevices;Lru/yandex/music/cast/ui/PultPicker$CastSourceDevices;)Ljava/util/List;", 4, 4));
                            this.A = new r2e(2, this);
                            this.C = new sml(this);
                        }
                    }
                }
            }
        }
        str6 = "button";
        str7 = "no correct value for key subtitle";
        str9 = "subtitle";
        str4 = "title";
        str8 = "no correct value for key buttonUrl";
        str5 = "buttonUrl";
        str10 = "no correct value for key title";
        l1nVar = null;
        this.p = l1nVar;
        bdt I222 = hag.I(byb.class);
        qdc qdcVar222 = l18Var.a;
        qdcVar222.getClass();
        m1n m1nVar22 = (m1n) ((byb) qdcVar222.C(I222)).c(ern.a(m1n.class));
        a = m1nVar22.a();
        b = m1nVar22.b();
        if (c.v(b, "on", true)) {
        }
        l1nVar2 = null;
        this.q = l1nVar2;
        this.r = l18Var.b(hag.I(zza.class), true);
        this.s = l18Var.b(hag.I(mza.class), true);
        this.t = btf.b(new o1n(this, 1));
        Continuation continuation222 = null;
        xdr a5222 = ydr.a(null);
        this.v = a5222;
        yc4 M0222 = zsd.M0(new bca(a5222, 18), new e2n(continuation222, this, 0));
        this.w = M0222;
        this.x = zsd.M0(((g64) this.h.getValue()).h, new e2n(continuation222, this, 1));
        this.y = new clc(new xo2(M0222, 4), new jud(2, 17, continuation222));
        this.z = zsd.Q(zsd.s0(i().d(), new s1n(this, continuation222, 0)), new d2n(h().n, this, 1), new d2n(g().c().g, this, 2), new b60(4, this, j2n.class, "composeSelectableMenu", "composeSelectableMenu(Lru/yandex/music/cast/ui/PultPicker$CastSourceDevices;Lru/yandex/music/cast/ui/PultPicker$CastSourceDevices;Lru/yandex/music/cast/ui/PultPicker$CastSourceDevices;)Ljava/util/List;", 4, 4));
        this.A = new r2e(2, this);
        this.C = new sml(this);
    }

    public static final void a(j2n j2nVar, l1n l1nVar, v54 v54Var) {
        String str;
        Context context = j2nVar.a;
        nmb nmbVar = w54.a;
        String str2 = l1nVar.a;
        u54 u54Var = u54.a;
        v54Var.getClass();
        u54Var.getClass();
        nmb nmbVar2 = w54.a;
        kkb kkbVar = v54Var.a;
        lkb[] lkbVarArr = lkb.a;
        nmbVar2.e(kkbVar, str2);
        Uri parse = Uri.parse(l1nVar.e);
        if (!l1nVar.f) {
            String uri = parse.toString();
            uri.getClass();
            int i = WebViewScreenActivity.A;
            context.startActivity(euk.G(context, uri, false, null));
            return;
        }
        context.getClass();
        try {
            context.startActivity(new Intent("android.intent.action.VIEW", parse));
        } catch (ActivityNotFoundException e) {
            hag.x(context, R.string.error_unknown, 0);
            if (parse == null || (str = parse.toString()) == null) {
                str = "";
            }
            Assertions.throwOrSkip("UrlUtils", new FailedAssertionException("Failed to open url: ".concat(str), e));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(j2n j2nVar, how howVar, cg6 cg6Var) {
        i2n i2nVar;
        int i;
        c5b c5bVar;
        if (cg6Var instanceof i2n) {
            i2nVar = (i2n) cg6Var;
            int i2 = i2nVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                i2nVar.n = i2 - Integer.MIN_VALUE;
                Object obj = i2nVar.l;
                nm6 nm6Var = nm6.a;
                i = i2nVar.n;
                if (i != 0) {
                    qgg.h0(obj);
                    l18 l18Var = l18.b;
                    bdt I = hag.I(byb.class);
                    qdc qdcVar = l18Var.a;
                    qdcVar.getClass();
                    if (!((Boolean) ((qgw) ((byb) qdcVar.C(I)).c(ern.a(qgw.class))).e.getValue()).booleanValue()) {
                        return q1n.c;
                    }
                    if (howVar != null) {
                        return new q1n(l(howVar.a, true), l(howVar.b, false));
                    }
                    c5bVar = c5b.a;
                    afw i3 = j2nVar.i();
                    i2nVar.j = c5bVar;
                    i2nVar.k = j2nVar;
                    i2nVar.n = 1;
                    prw prwVar = (prw) i3.e.getValue();
                    prwVar.getClass();
                    obj = x97.V(dm6.b, new a(prwVar, null), i2nVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j2nVar = i2nVar.k;
                    c5bVar = i2nVar.j;
                    qgg.h0(obj);
                }
                j2nVar.getClass();
                return new q1n(c5bVar, l((List) obj, false));
            }
        }
        i2nVar = new i2n(j2nVar, cg6Var);
        Object obj2 = i2nVar.l;
        nm6 nm6Var2 = nm6.a;
        i = i2nVar.n;
        if (i != 0) {
        }
        j2nVar.getClass();
        return new q1n(c5bVar, l((List) obj2, false));
    }

    public static final void c(j2n j2nVar, int i) {
        Context context = j2nVar.a;
        n1n n1nVar = new n1n(j2nVar, 0);
        context.getClass();
        e02 e02Var = new e02(context, i, n1nVar, 10);
        if (Looper.getMainLooper() == Looper.myLooper()) {
            e02Var.run();
        } else {
            n7w.O().post(e02Var);
        }
    }

    public static ArrayList k(List list, boolean z) {
        List<ggd> o0 = CollectionsKt.o0(list, new ehf(29));
        ArrayList arrayList = new ArrayList(v75.o(o0, 10));
        for (ggd ggdVar : o0) {
            ggdVar.getClass();
            egd egdVar = ggdVar instanceof egd ? (egd) ggdVar : null;
            t84 t84Var = egdVar != null ? (egdVar.h && ((egd) ggdVar).b.isAccessible()) ? t84.AVAILABLE : t84.UNAVAILABLE : t84.UNAVAILABLE;
            String a = ggdVar.a();
            String b = ggdVar.b();
            mvn mvnVar = uhd.b;
            String c = ggdVar.c();
            mvnVar.getClass();
            arrayList.add(new t74(a, b, t84Var, mvn.O(c)));
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((t74) next).e.a == z) {
                arrayList2.add(next);
            }
        }
        return arrayList2;
    }

    public static ArrayList l(List list, boolean z) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            gow gowVar = (gow) obj;
            if (z) {
                if (gowVar.k && gowVar.h && !gowVar.j) {
                    arrayList.add(obj);
                }
            } else if (!gowVar.k && gowVar.h && !E.contains(gowVar.b)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (!((gow) next).a.equals(null)) {
                arrayList2.add(next);
            }
        }
        List o0 = CollectionsKt.o0(arrayList2, new t1n(0));
        ArrayList arrayList3 = new ArrayList(v75.o(o0, 10));
        Iterator it2 = o0.iterator();
        while (it2.hasNext()) {
            arrayList3.add(rzf.P((gow) it2.next()));
        }
        return arrayList3;
    }

    public final void d() {
        this.u = x97.y(this.g, null, null, new g2l(this, null, 23), 3);
    }

    public final void e(r74 r74Var) {
        Object obj;
        if (n(h74.b)) {
            dk4 g = g();
            String str = r74Var.c;
            g.getClass();
            str.getClass();
            jk4 c = g.c();
            c.getClass();
            Iterator it = ((Iterable) c.f.getValue()).iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (Intrinsics.d(((irh) obj).c, str)) {
                        break;
                    }
                }
            }
            irh irhVar = (irh) obj;
            if (irhVar != null) {
                irh irhVar2 = irhVar.g ? irhVar : null;
                if (irhVar2 != null) {
                    irhVar2.l();
                }
            }
            l18 l18Var = l18.b;
            bdt I = hag.I(byb.class);
            qdc qdcVar = l18Var.a;
            qdcVar.getClass();
            if (((Boolean) ((qgw) ((byb) qdcVar.C(I)).c(ern.a(qgw.class))).e.getValue()).booleanValue()) {
                i().g(new zsw(p6g.C((e6l) ((oq7) this.n.getValue()).a.c.getValue())));
            }
        }
    }

    public final void f(boolean z) {
        if (this.f.d.a()) {
            this.f.V();
            if (!z) {
                n74 n74Var = (n74) this.A.getValue(this, D[0]);
                z64 z64Var = n74Var != null ? (z64) n74Var.e.getValue(n74Var, n74.f[2]) : null;
                if (z64Var instanceof z64) {
                    nmb nmbVar = w54.a;
                    String str = z64Var.d;
                    v54 v54Var = v54.PULT;
                    v54Var.getClass();
                    w54.a.d(v54Var.a, str);
                } else if (z64Var != null) {
                    b6e.s();
                    return;
                }
            }
            this.u = null;
            r2e r2eVar = this.A;
            s9f[] s9fVarArr = D;
            n74 n74Var2 = (n74) r2eVar.getValue(this, s9fVarArr[0]);
            if (n74Var2 != null) {
                n74Var2.a();
            }
            this.A.setValue(this, s9fVarArr[0], null);
        }
    }

    public final dk4 g() {
        return (dk4) this.j.getValue();
    }

    public final odd h() {
        return (odd) this.i.getValue();
    }

    public final afw i() {
        return (afw) this.k.getValue();
    }

    public final boolean j(x74 x74Var) {
        gow gowVar;
        int ordinal = this.c.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return false;
            }
            b6e.s();
            return false;
        }
        int ordinal2 = ((h74) ((g64) this.h.getValue()).h.getValue()).ordinal();
        r2 = null;
        String str = null;
        if (ordinal2 == 0) {
            t74 t74Var = x74Var instanceof t74 ? (t74) x74Var : null;
            if (t74Var == null) {
                return false;
            }
            return Intrinsics.d(t74Var.c, h().d().b);
        }
        if (ordinal2 == 1) {
            return false;
        }
        if (ordinal2 != 2) {
            if (ordinal2 == 3) {
                return false;
            }
            b6e.s();
            return false;
        }
        w74 w74Var = x74Var instanceof w74 ? (w74) x74Var : null;
        if (w74Var == null) {
            return false;
        }
        String str2 = w74Var.c;
        how b = i().b();
        if (b != null && (gowVar = b.c) != null) {
            str = gowVar.a;
        }
        return Intrinsics.d(str2, str);
    }

    public final void m() {
        rjq rjqVar = this.f;
        um6 um6Var = this.g;
        t tVar = (t) vq2.R(this.a);
        if (tVar == null) {
            return;
        }
        rjqVar.g();
        Continuation continuation = null;
        x97.y(um6Var, null, null, new s1n(this, continuation, 2), 3);
        h().b(true);
        int i = 0;
        rjqVar.d.D(new o1n(this, i));
        n74 n74Var = new n74(tVar);
        ox6.B(new d2n(this.z, this, i), um6Var, new a2n(n74Var, this));
        ox6.B(zsd.X(new u21(10, this.y, this.x, new t81(3, 22, continuation)), 50L), um6Var, new a2n(n74Var));
        this.A.setValue(this, D[0], n74Var);
        ox6.B(ox6.R(this.w, new Pair(s74.c, Boolean.FALSE)), um6Var, new gfl(19, this));
    }

    public final boolean n(h74 h74Var) {
        n7q n7qVar;
        n2n n2nVar = this.d;
        if (n2nVar instanceof m2n) {
            return true;
        }
        if (!(n2nVar instanceof l2n)) {
            b6e.s();
            return false;
        }
        d6l x = p6g.x((e6l) ((oq7) this.n.getValue()).a.c.getValue());
        xee Y = v3g.Y((x == null || (n7qVar = x.a) == null) ? null : n7qVar.b(), h74Var);
        if (Y instanceof f94) {
            return true;
        }
        if (Y instanceof e94) {
            new lum(this.a).Q(((e94) Y).j);
            return false;
        }
        b6e.s();
        return false;
    }
}
