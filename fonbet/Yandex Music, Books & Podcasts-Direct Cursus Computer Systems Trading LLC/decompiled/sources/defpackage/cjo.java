package defpackage;

import android.net.Uri;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Arrays;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public abstract class cjo {
    public static final Pattern a = Pattern.compile("([A-Z_]+) (.*) RTSP/1\\.0");
    public static final Pattern b = Pattern.compile("RTSP/1\\.0 (\\d+) (.+)");
    public static final Pattern c = Pattern.compile("Content-Length:\\s?(\\d+)", 2);
    public static final Pattern d = Pattern.compile("([\\w$\\-_.+]+)(?:;\\s?timeout=(\\d+))?");
    public static final Pattern e = Pattern.compile("Digest realm=\"([^\"\\x00-\\x08\\x0A-\\x1f\\x7f]+)\",\\s?(?:domain=\"(.+)\",\\s?)?nonce=\"([^\"\\x00-\\x08\\x0A-\\x1f\\x7f]+)\"(?:,\\s?opaque=\"([^\"\\x00-\\x08\\x0A-\\x1f\\x7f]+)\")?");
    public static final Pattern f = Pattern.compile("Basic realm=\"([^\"\\x00-\\x08\\x0A-\\x1f\\x7f]+)\"");
    public static final String g = new String(new byte[]{10});
    public static final String h = new String(new byte[]{13, 10});

    public static int a(String str) {
        str.getClass();
        switch (str) {
            case "RECORD":
                return 8;
            case "TEARDOWN":
                return 12;
            case "GET_PARAMETER":
                return 3;
            case "OPTIONS":
                return 4;
            case "PLAY_NOTIFY":
                return 7;
            case "PLAY":
                return 6;
            case "REDIRECT":
                return 9;
            case "SET_PARAMETER":
                return 11;
            case "PAUSE":
                return 5;
            case "SETUP":
                return 10;
            case "ANNOUNCE":
                return 1;
            case "DESCRIBE":
                return 2;
            default:
                return 0;
        }
    }

    public static qsn b(String str) {
        if (str == null) {
            ude udeVar = yde.b;
            return qsn.e;
        }
        hld.w(4, "initialCapacity");
        Object[] objArr = new Object[4];
        int i = dvt.a;
        int i2 = 0;
        for (String str2 : str.split(",\\s?", -1)) {
            int a2 = a(str2);
            if (a2 != 0) {
                Integer valueOf = Integer.valueOf(a2);
                int i3 = i2 + 1;
                int e2 = pde.e(objArr.length, i3);
                if (e2 > objArr.length) {
                    objArr = Arrays.copyOf(objArr, e2);
                }
                objArr[i2] = valueOf;
                i2 = i3;
            }
        }
        return yde.t(i2, objArr);
    }

    public static au1 c(String str) {
        long parseInt;
        Matcher matcher = d.matcher(str);
        if (!matcher.matches()) {
            throw r7k.b(str, null);
        }
        String group = matcher.group(1);
        group.getClass();
        if (matcher.group(2) != null) {
            try {
                parseInt = Integer.parseInt(r0) * 1000;
            } catch (NumberFormatException e2) {
                throw r7k.b(str, e2);
            }
        } else {
            parseInt = 60000;
        }
        return new au1(group, parseInt, 11);
    }

    public static qz7 d(Uri uri) {
        String userInfo = uri.getUserInfo();
        if (userInfo == null || !userInfo.contains(StringUtils.PROCESS_POSTFIX_DELIMITER)) {
            return null;
        }
        int i = dvt.a;
        String[] split = userInfo.split(StringUtils.PROCESS_POSTFIX_DELIMITER, 2);
        return new qz7(split[0], split[1]);
    }

    public static anx e(String str) {
        String str2;
        Matcher matcher = e.matcher(str);
        str2 = "";
        int i = 1;
        if (matcher.find()) {
            String group = matcher.group(1);
            group.getClass();
            String group2 = matcher.group(3);
            group2.getClass();
            String group3 = matcher.group(4);
            return new anx(2, group, group2, group3 != null ? group3 : "");
        }
        Matcher matcher2 = f.matcher(str);
        if (matcher2.matches()) {
            String group4 = matcher2.group(1);
            group4.getClass();
            return new anx(i, group4, str2, str2);
        }
        throw r7k.b("Invalid WWW-Authenticate header " + str, null);
    }

    public static Uri f(Uri uri) {
        if (uri.getUserInfo() == null) {
            return uri;
        }
        String encodedAuthority = uri.getEncodedAuthority();
        encodedAuthority.getClass();
        vq1.v(encodedAuthority.contains("@"));
        int i = dvt.a;
        return uri.buildUpon().encodedAuthority(encodedAuthority.split("@", -1)[1]).build();
    }

    public static qsn g(djo djoVar) {
        vq1.v(djoVar.c.b("CSeq") != null);
        tde tdeVar = new tde(4);
        Object[] objArr = {h(djoVar.b), djoVar.a, "RTSP/1.0"};
        int i = dvt.a;
        tdeVar.a(String.format(Locale.US, "%s %s %s", objArr));
        zde zdeVar = djoVar.c.a;
        xkt it = zdeVar.d.keySet().iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            yde d2 = zdeVar.d(str);
            for (int i2 = 0; i2 < d2.size(); i2++) {
                tdeVar.a(String.format(Locale.US, "%s: %s", str, d2.get(i2)));
            }
        }
        tdeVar.a("");
        tdeVar.a(djoVar.d);
        return tdeVar.f();
    }

    public static String h(int i) {
        switch (i) {
            case 1:
                return "ANNOUNCE";
            case 2:
                return "DESCRIBE";
            case 3:
                return "GET_PARAMETER";
            case 4:
                return "OPTIONS";
            case 5:
                return "PAUSE";
            case 6:
                return "PLAY";
            case 7:
                return "PLAY_NOTIFY";
            case 8:
                return "RECORD";
            case 9:
                return "REDIRECT";
            case 10:
                return "SETUP";
            case 11:
                return "SET_PARAMETER";
            case 12:
                return "TEARDOWN";
            default:
                e7o.n();
                return null;
        }
    }
}
