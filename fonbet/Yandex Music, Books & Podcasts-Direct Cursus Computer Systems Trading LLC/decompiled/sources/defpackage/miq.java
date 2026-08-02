package defpackage;

import android.util.SparseArray;
import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class miq extends jq3 {
    public static final Pattern g = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v1\\.exo$", 32);
    public static final Pattern h = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v2\\.exo$", 32);
    public static final Pattern i = Pattern.compile("^(\\d+)\\.(\\d+)\\.(\\d+)\\.v3\\.exo$", 32);

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00d1, code lost:
    
        if (r16.renameTo(r1) == false) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static miq b(File file, long j, long j2, rdk rdkVar) {
        File file2;
        long j3;
        String group;
        File c;
        String name = file.getName();
        if (!name.endsWith(".v3.exo")) {
            String name2 = file.getName();
            Matcher matcher = h.matcher(name2);
            if (!matcher.matches()) {
                matcher = g.matcher(name2);
                if (matcher.matches()) {
                    group = matcher.group(1);
                    group.getClass();
                    if (group != null) {
                    }
                    c = null;
                    if (c != null) {
                    }
                    return null;
                }
                group = null;
                if (group != null) {
                }
                c = null;
                if (c != null) {
                }
                return null;
            }
            group = matcher.group(1);
            group.getClass();
            int i2 = dvt.a;
            int length = group.length();
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < length; i5++) {
                if (group.charAt(i5) == '%') {
                    i4++;
                }
            }
            if (i4 != 0) {
                int i6 = length - (i4 * 2);
                StringBuilder sb = new StringBuilder(i6);
                Matcher matcher2 = dvt.g.matcher(group);
                while (i4 > 0 && matcher2.find()) {
                    String group2 = matcher2.group(1);
                    group2.getClass();
                    char parseInt = (char) Integer.parseInt(group2, 16);
                    sb.append((CharSequence) group, i3, matcher2.start());
                    sb.append(parseInt);
                    i3 = matcher2.end();
                    i4--;
                }
                if (i3 < length) {
                    sb.append((CharSequence) group, i3, length);
                }
                if (sb.length() == i6) {
                    group = sb.toString();
                }
                group = null;
            }
            if (group != null) {
                File parentFile = file.getParentFile();
                vq1.B(parentFile);
                int i7 = rdkVar.E(group).a;
                String group3 = matcher.group(2);
                group3.getClass();
                long parseLong = Long.parseLong(group3);
                String group4 = matcher.group(3);
                group4.getClass();
                c = c(parentFile, i7, parseLong, Long.parseLong(group4));
            }
            c = null;
            if (c != null) {
                file2 = c;
                name = c.getName();
            }
            return null;
        }
        file2 = file;
        Matcher matcher3 = i.matcher(name);
        if (matcher3.matches()) {
            String group5 = matcher3.group(1);
            group5.getClass();
            String str = (String) ((SparseArray) rdkVar.c).get(Integer.parseInt(group5));
            if (str != null) {
                long length2 = j == -1 ? file2.length() : j;
                if (length2 != 0) {
                    String group6 = matcher3.group(2);
                    group6.getClass();
                    long parseLong2 = Long.parseLong(group6);
                    if (j2 == -9223372036854775807L) {
                        String group7 = matcher3.group(3);
                        group7.getClass();
                        j3 = Long.parseLong(group7);
                    } else {
                        j3 = j2;
                    }
                    return new miq(str, parseLong2, length2, j3, file2);
                }
            }
        }
        return null;
    }

    public static File c(File file, int i2, long j, long j2) {
        StringBuilder sb = new StringBuilder();
        sb.append(i2);
        sb.append(".");
        sb.append(j);
        sb.append(".");
        return new File(file, hrg.m(j2, ".v3.exo", sb));
    }
}
