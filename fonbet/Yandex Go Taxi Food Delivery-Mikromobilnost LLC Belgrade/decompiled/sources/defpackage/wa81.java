package defpackage;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import com.yandex.plus.home.feature.webviews.internal.container.ModalContentViewContainer;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes7.dex */
public final class wa81 extends zt71 {
    public static final Pattern o = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");
    public static final Pattern p = Pattern.compile("\\{\\\\.*?\\}");
    public final StringBuilder m = new StringBuilder();
    public final ArrayList n = new ArrayList();

    public static long f(Matcher matcher, int i) {
        String group = matcher.group(i + 1);
        long parseLong = group != null ? Long.parseLong(group) * 3600000 : 0L;
        String group2 = matcher.group(i + 2);
        group2.getClass();
        long parseLong2 = (Long.parseLong(group2) * 60000) + parseLong;
        String group3 = matcher.group(i + 3);
        group3.getClass();
        long parseLong3 = (Long.parseLong(group3) * 1000) + parseLong2;
        String group4 = matcher.group(i + 4);
        if (group4 != null) {
            parseLong3 += Long.parseLong(group4);
        }
        return parseLong3 * 1000;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x014b, code lost:
    
        if (r8.equals("{\\an1}") != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01f6, code lost:
    
        return new defpackage.cf71(r1.toArray(new defpackage.r871[0]), (java.lang.Object) java.util.Arrays.copyOf(r2.b, r2.a), false, 22);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0118, code lost:
    
        if (r8.equals("{\\an9}") != false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0140, code lost:
    
        r7 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x015c, code lost:
    
        if (r8.equals("{\\an9}") != false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x016c, code lost:
    
        r15 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0163, code lost:
    
        if (r8.equals("{\\an8}") != false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x016a, code lost:
    
        if (r8.equals("{\\an7}") != false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0181, code lost:
    
        if (r8.equals("{\\an3}") != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0191, code lost:
    
        r15 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0188, code lost:
    
        if (r8.equals("{\\an2}") != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x018f, code lost:
    
        if (r8.equals("{\\an1}") != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0124, code lost:
    
        if (r8.equals("{\\an7}") != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x014d, code lost:
    
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x012b, code lost:
    
        if (r8.equals("{\\an6}") != false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0137, code lost:
    
        if (r8.equals("{\\an4}") != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x013e, code lost:
    
        if (r8.equals("{\\an3}") != false) goto L56;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    @Override // defpackage.zt71
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final fh81 c(int i, byte[] bArr, boolean z) {
        String f;
        String str;
        int i2;
        int i3;
        int i4;
        float f2;
        float f3;
        r871 r871Var;
        wa81 wa81Var = this;
        ArrayList arrayList = new ArrayList();
        ed71 ed71Var = new ed71();
        dl81 dl81Var = new dl81(bArr, i);
        while (true) {
            String f4 = dl81Var.f();
            if (f4 != null) {
                if (f4.length() != 0) {
                    try {
                        Integer.parseInt(f4);
                        f = dl81Var.f();
                    } catch (NumberFormatException unused) {
                        nba1.e();
                    }
                    if (f == null) {
                        nba1.e();
                    } else {
                        Matcher matcher = o.matcher(f);
                        if (matcher.matches()) {
                            ed71Var.b(f(matcher, 1));
                            ed71Var.b(f(matcher, 6));
                            StringBuilder sb = wa81Var.m;
                            sb.setLength(0);
                            ArrayList arrayList2 = wa81Var.n;
                            arrayList2.clear();
                            for (String f5 = dl81Var.f(); !TextUtils.isEmpty(f5); f5 = dl81Var.f()) {
                                if (sb.length() > 0) {
                                    sb.append("<br>");
                                }
                                String trim = f5.trim();
                                StringBuilder sb2 = new StringBuilder(trim);
                                Matcher matcher2 = p.matcher(trim);
                                int i5 = 0;
                                while (matcher2.find()) {
                                    String group = matcher2.group();
                                    arrayList2.add(group);
                                    int start = matcher2.start() - i5;
                                    int length = group.length();
                                    sb2.replace(start, start + length, "");
                                    i5 += length;
                                }
                                sb.append(sb2.toString());
                            }
                            Spanned fromHtml = Html.fromHtml(sb.toString());
                            int i6 = 0;
                            while (true) {
                                if (i6 < arrayList2.size()) {
                                    str = (String) arrayList2.get(i6);
                                    if (!str.matches("\\{\\\\an[1-9]\\}")) {
                                        i6++;
                                    }
                                } else {
                                    str = null;
                                }
                            }
                            if (str == null) {
                                r871Var = new r871(fromHtml, null, null, null, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, ModalContentViewContainer.BASE_SHADOW_COLOR, Integer.MIN_VALUE, 0.0f);
                            } else {
                                switch (str.hashCode()) {
                                    case -685620710:
                                        break;
                                    case -685620679:
                                        str.equals("{\\an2}");
                                        i2 = 1;
                                        break;
                                    case -685620648:
                                        break;
                                    case -685620617:
                                        break;
                                    case -685620586:
                                        str.equals("{\\an5}");
                                        i2 = 1;
                                        break;
                                    case -685620555:
                                        break;
                                    case -685620524:
                                        break;
                                    case -685620493:
                                        str.equals("{\\an8}");
                                        i2 = 1;
                                        break;
                                    case -685620462:
                                        break;
                                    default:
                                        i2 = 1;
                                        break;
                                }
                                switch (str.hashCode()) {
                                    case -685620710:
                                        break;
                                    case -685620679:
                                        break;
                                    case -685620648:
                                        break;
                                    case -685620617:
                                        str.equals("{\\an4}");
                                        i3 = 1;
                                        break;
                                    case -685620586:
                                        str.equals("{\\an5}");
                                        i3 = 1;
                                        break;
                                    case -685620555:
                                        str.equals("{\\an6}");
                                        i3 = 1;
                                        break;
                                    case -685620524:
                                        break;
                                    case -685620493:
                                        break;
                                    case -685620462:
                                        break;
                                    default:
                                        i3 = 1;
                                        break;
                                }
                                if (i2 != 0) {
                                    i4 = 1;
                                    if (i2 == 1) {
                                        f2 = 0.5f;
                                    } else {
                                        if (i2 != 2) {
                                            w511.q();
                                            return null;
                                        }
                                        f2 = 0.92f;
                                    }
                                } else {
                                    i4 = 1;
                                    f2 = 0.08f;
                                }
                                if (i3 == 0) {
                                    f3 = 0.08f;
                                } else if (i3 == i4) {
                                    f3 = 0.5f;
                                } else {
                                    if (i3 != 2) {
                                        w511.q();
                                        return null;
                                    }
                                    f3 = 0.92f;
                                }
                                r871Var = new r871(fromHtml, null, null, null, f3, 0, i3, f2, i2, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, ModalContentViewContainer.BASE_SHADOW_COLOR, Integer.MIN_VALUE, 0.0f);
                            }
                            arrayList.add(r871Var);
                            arrayList.add(r871.K);
                        } else {
                            nba1.e();
                        }
                        wa81Var = this;
                    }
                }
            }
        }
    }
}
