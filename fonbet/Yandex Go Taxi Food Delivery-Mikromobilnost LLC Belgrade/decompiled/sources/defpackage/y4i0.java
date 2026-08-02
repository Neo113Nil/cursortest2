package defpackage;

import com.yandex.browser.rtm.Environment;
import com.yandex.browser.rtm.Platform;
import com.yandex.div.state.db.StateEntry;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.text.Regex;
import ru.CryptoPro.JCP.tools.HexString;

/* loaded from: classes.dex */
public abstract class y4i0 {
    public final k5i0 a;
    public final String b;
    public String c;
    public String d;
    public final Platform e;
    public final Environment i;
    public final i5i0 o;
    public String f = null;
    public String g = null;
    public String h = null;
    public String j = null;
    public String k = null;
    public String l = null;
    public String m = null;
    public String n = null;
    public final String p = a();

    public y4i0(k5i0 k5i0Var, String str, String str2, String str3, Platform platform, Environment environment, i5i0 i5i0Var) {
        this.a = k5i0Var;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = platform;
        this.i = environment;
        this.o = i5i0Var;
    }

    public abstract String a();

    public abstract LinkedHashMap b();

    public abstract LinkedHashMap c();

    public abstract Map d();

    public final void e() {
        String P;
        i5i0 i5i0Var = this.o;
        int i = i5i0Var.c;
        String str = this.b;
        if (str.length() <= 0) {
            ny61.r("Can't create Click Daemon error event w/o project set.");
            return;
        }
        if (this.c.length() <= 0) {
            ny61.r("Can't create Click Daemon error event w/o version set.");
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(StateEntry.COLUMN_PATH, this.p);
        String str2 = this.h;
        if (str2 != null && str2.length() > 0) {
            linkedHashMap.put("slots", str2);
        }
        linkedHashMap.putAll(b());
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put("-project", str);
        String str3 = this.c;
        String str4 = this.d;
        if (str4 != null) {
            str3 = oyr.f(HexString.CHAR_SPACE, str3, str4);
        }
        linkedHashMap2.put("-version", str3);
        linkedHashMap2.putAll(d());
        Platform platform = this.e;
        if (platform != null) {
            linkedHashMap2.put("-platform", platform.getTag());
        }
        String str5 = this.j;
        if (str5 != null && str5.length() > 0) {
            linkedHashMap2.put("-service", str5);
        }
        String str6 = this.k;
        if (str6 != null && str6.length() > 0) {
            linkedHashMap2.put("-source", str6);
        }
        String str7 = this.f;
        if (jl40.A(str7)) {
            P = null;
        } else {
            yq11 K0 = cma1.K0(10, str7);
            P = K0 != null ? y5e.P(10, K0.a) : Long.toUnsignedString(-1L);
        }
        if (P != null) {
            linkedHashMap2.put("-yandexuid", P);
        }
        String str8 = this.l;
        if (str8 != null && str8.length() > 0) {
            linkedHashMap2.put("-referrer", str8);
        }
        String str9 = this.m;
        if (str9 != null) {
            String str10 = (i == -1 || str9.length() <= i) ? str9 : null;
            if (str10 != null) {
                linkedHashMap2.put("-additional", str10);
            }
        }
        String str11 = this.n;
        if (str11 != null) {
            linkedHashMap2.put("-page", str11);
        }
        String str12 = this.g;
        if (str12 != null && str12.length() > 0) {
            linkedHashMap2.put("-experiments", str12);
        }
        Environment environment = this.i;
        if (environment != null) {
            linkedHashMap2.put("-env", environment.getTag());
        }
        linkedHashMap2.putAll(c());
        linkedHashMap2.put("-language", "java");
        int i2 = i5i0Var.a;
        int i3 = i5i0Var.b;
        z4i0 a5i0Var = (i2 == -1 && i3 == -1) ? new a5i0() : new hif(linkedHashMap, i2, i3);
        for (Map.Entry entry : linkedHashMap2.entrySet()) {
            a5i0Var.a((String) entry.getKey(), (String) entry.getValue());
        }
        linkedHashMap.put("vars", a5i0Var.toString());
        Regex regex = h5i0.a;
        StringBuilder sb = new StringBuilder();
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            String str13 = (String) entry2.getKey();
            String str14 = (String) entry2.getValue();
            Regex regex2 = h5i0.a;
            regex2.h(str13);
            regex2.h(str14);
            sb.append("/");
            x4e.C(sb, str13, "=", str14);
        }
        sb.append("/*");
        this.a.schedule(sb.toString());
    }
}
