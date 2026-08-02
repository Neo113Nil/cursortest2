package defpackage;

import android.net.Uri;
import com.yandex.metrica.push.common.CoreConstants;
import io.appmetrica.analytics.BuildConfig;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public abstract class olp {
    public static final Pattern a = Pattern.compile("([a-z])=\\s?(.+)");
    public static final Pattern b = Pattern.compile("^([a-z])=$");
    public static final Pattern c = Pattern.compile("([\\x21\\x23-\\x27\\x2a\\x2b\\x2d\\x2e\\x30-\\x39\\x41-\\x5a\\x5e-\\x7e]+)(?::(.*))?");
    public static final Pattern d = Pattern.compile("(\\S+)\\s(\\S+)\\s(\\S+)\\s(\\S+)");

    /* JADX WARN: Code restructure failed: missing block: B:157:0x0226, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0067, code lost:
    
        throw defpackage.r7k.b("Malformed SDP line: " + r10, null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static nlp a(String str) {
        String str2;
        mlp mlpVar = new mlp();
        String str3 = cjo.h;
        if (!str.contains(str3)) {
            str3 = cjo.g;
        }
        int i = dvt.a;
        String[] split = str.split(str3, -1);
        int length = split.length;
        jmh jmhVar = null;
        int i2 = 0;
        boolean z = false;
        while (true) {
            tde tdeVar = mlpVar.b;
            if (i2 >= length) {
                if (jmhVar != null) {
                    try {
                        tdeVar.a(jmhVar.a());
                    } catch (IllegalArgumentException | IllegalStateException e) {
                        throw r7k.b(null, e);
                    }
                }
                try {
                    return new nlp(mlpVar);
                } catch (IllegalArgumentException | IllegalStateException e2) {
                    throw r7k.b(null, e2);
                }
            }
            String str4 = split[i2];
            if (!"".equals(str4)) {
                Matcher matcher = a.matcher(str4);
                if (matcher.matches()) {
                    String group = matcher.group(1);
                    group.getClass();
                    String group2 = matcher.group(2);
                    group2.getClass();
                    switch (group.hashCode()) {
                        case 97:
                            if (!group.equals("a")) {
                                continue;
                            } else if (z) {
                                continue;
                            } else {
                                Matcher matcher2 = c.matcher(group2);
                                if (!matcher2.matches()) {
                                    throw r7k.b("Malformed Attribute line: " + str4, null);
                                }
                                String group3 = matcher2.group(1);
                                group3.getClass();
                                String group4 = matcher2.group(2);
                                String str5 = group4 != null ? group4 : "";
                                if (jmhVar != null) {
                                    jmhVar.e.put(group3, str5);
                                    break;
                                } else {
                                    mlpVar.a.put(group3, str5);
                                    break;
                                }
                            }
                        case 98:
                            if (!group.equals("b")) {
                                continue;
                            } else if (!z) {
                                String[] split2 = group2.split(":\\s?", -1);
                                vq1.v(split2.length == 2);
                                int parseInt = Integer.parseInt(split2[1]);
                                if (jmhVar != null) {
                                    jmhVar.f = parseInt * 1000;
                                    break;
                                } else {
                                    mlpVar.c = parseInt * 1000;
                                    break;
                                }
                            } else {
                                break;
                            }
                        case 99:
                            if (!group.equals("c")) {
                                continue;
                            } else if (!z) {
                                if (jmhVar != null) {
                                    jmhVar.h = group2;
                                    break;
                                } else {
                                    mlpVar.h = group2;
                                    break;
                                }
                            } else {
                                break;
                            }
                        case 101:
                            if (group.equals("e")) {
                                mlpVar.k = group2;
                                break;
                            } else {
                                continue;
                            }
                        case 105:
                            if (!group.equals(CoreConstants.PushMessage.SERVICE_TYPE)) {
                                continue;
                            } else if (!z) {
                                if (jmhVar != null) {
                                    jmhVar.g = group2;
                                    break;
                                } else {
                                    mlpVar.j = group2;
                                    break;
                                }
                            } else {
                                break;
                            }
                        case 107:
                            if (!group.equals("k")) {
                                continue;
                            } else if (!z) {
                                if (jmhVar != null) {
                                    jmhVar.i = group2;
                                    break;
                                } else {
                                    mlpVar.i = group2;
                                    break;
                                }
                            } else {
                                break;
                            }
                        case 109:
                            if (group.equals("m")) {
                                if (jmhVar != null) {
                                    try {
                                        tdeVar.a(jmhVar.a());
                                    } catch (IllegalArgumentException | IllegalStateException e3) {
                                        throw r7k.b(null, e3);
                                    }
                                }
                                Matcher matcher3 = d.matcher(group2);
                                if (!matcher3.matches()) {
                                    throw r7k.b("Malformed SDP media description line: ".concat(group2), null);
                                }
                                String group5 = matcher3.group(1);
                                group5.getClass();
                                String group6 = matcher3.group(2);
                                group6.getClass();
                                String group7 = matcher3.group(3);
                                group7.getClass();
                                String group8 = matcher3.group(4);
                                group8.getClass();
                                try {
                                    jmhVar = new jmh(Integer.parseInt(group6), Integer.parseInt(group8), group5, group7);
                                } catch (NumberFormatException e4) {
                                    vq1.o0("SDPParser", "Malformed SDP media description line: ".concat(group2), e4);
                                    jmhVar = null;
                                }
                                if (jmhVar != null) {
                                    z = false;
                                    break;
                                } else {
                                    z = true;
                                    break;
                                }
                            } else {
                                continue;
                            }
                        case 111:
                            if (group.equals("o")) {
                                mlpVar.e = group2;
                                break;
                            } else {
                                continue;
                            }
                        case 112:
                            if (group.equals("p")) {
                                mlpVar.l = group2;
                                break;
                            } else {
                                continue;
                            }
                        case 114:
                            str2 = "r";
                            break;
                        case 115:
                            if (group.equals("s")) {
                                mlpVar.d = group2;
                                break;
                            } else {
                                continue;
                            }
                        case BuildConfig.API_LEVEL /* 116 */:
                            if (group.equals("t")) {
                                mlpVar.f = group2;
                                break;
                            } else {
                                continue;
                            }
                        case 117:
                            if (group.equals("u")) {
                                mlpVar.g = Uri.parse(group2);
                                break;
                            } else {
                                continue;
                            }
                        case 118:
                            if (!group.equals("v")) {
                                continue;
                            } else {
                                if (!CommonUrlParts.Values.FALSE_INTEGER.equals(group2)) {
                                    throw r7k.b("SDP version " + group2 + " is not supported.", null);
                                }
                                break;
                            }
                        case 122:
                            str2 = "z";
                            break;
                    }
                    group.equals(str2);
                } else {
                    Matcher matcher4 = b.matcher(str4);
                    if (!matcher4.matches() || !Objects.equals(matcher4.group(1), CoreConstants.PushMessage.SERVICE_TYPE)) {
                    }
                }
            }
            i2++;
        }
    }
}
