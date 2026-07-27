package com.anythink.basead.exoplayer.j.a;

import com.anythink.basead.exoplayer.k.C0544a;
import com.anythink.basead.exoplayer.k.af;
import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
final class n extends e {

    /* renamed from: g, reason: collision with root package name */
    private static final String f8264g = ".v3.exo";

    /* renamed from: h, reason: collision with root package name */
    private static final Pattern f8265h = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v1\\.exo$", 32);
    private static final Pattern i = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v2\\.exo$", 32);

    /* renamed from: j, reason: collision with root package name */
    private static final Pattern f8266j = Pattern.compile("^(\\d+)\\.(\\d+)\\.(\\d+)\\.v3\\.exo$", 32);

    private n(String str, long j9, long j10, long j11, File file) {
        super(str, j9, j10, j11, file);
    }

    public static File a(File file, int i4, long j9, long j10) {
        return new File(file, i4 + com.anythink.core.common.d.j.f12535z + j9 + com.anythink.core.common.d.j.f12535z + j10 + f8264g);
    }

    public static n b(String str, long j9) {
        return new n(str, j9, -1L, com.anythink.basead.exoplayer.b.f6539b, null);
    }

    public static n a(String str, long j9) {
        return new n(str, j9, -1L, com.anythink.basead.exoplayer.b.f6539b, null);
    }

    private static File b(File file, h hVar) {
        String group;
        String name = file.getName();
        Matcher matcher = i.matcher(name);
        if (matcher.matches()) {
            group = af.h(matcher.group(1));
            if (group == null) {
                return null;
            }
        } else {
            matcher = f8265h.matcher(name);
            if (!matcher.matches()) {
                return null;
            }
            group = matcher.group(1);
        }
        File a9 = a(file.getParentFile(), hVar.c(group), Long.parseLong(matcher.group(2)), Long.parseLong(matcher.group(3)));
        if (file.renameTo(a9)) {
            return a9;
        }
        return null;
    }

    public static n a(String str, long j9, long j10) {
        return new n(str, j9, j10, com.anythink.basead.exoplayer.b.f6539b, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0061, code lost:
    
        if (r16.renameTo(r1) == false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x002a, code lost:
    
        if (r1 == null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static n a(File file, h hVar) {
        File file2;
        String group;
        File a9;
        String name = file.getName();
        if (name.endsWith(f8264g)) {
            file2 = file;
        } else {
            String name2 = file.getName();
            Matcher matcher = i.matcher(name2);
            if (matcher.matches()) {
                group = af.h(matcher.group(1));
            } else {
                matcher = f8265h.matcher(name2);
                if (matcher.matches()) {
                    group = matcher.group(1);
                    a9 = a(file.getParentFile(), hVar.c(group), Long.parseLong(matcher.group(2)), Long.parseLong(matcher.group(3)));
                }
                a9 = null;
                if (a9 == null) {
                    return null;
                }
                file2 = a9;
                name = a9.getName();
            }
        }
        Matcher matcher2 = f8266j.matcher(name);
        if (!matcher2.matches()) {
            return null;
        }
        long length = file2.length();
        String a10 = hVar.a(Integer.parseInt(matcher2.group(1)));
        if (a10 == null) {
            return null;
        }
        return new n(a10, Long.parseLong(matcher2.group(2)), length, Long.parseLong(matcher2.group(3)), file2);
    }

    public final n a(int i4) {
        C0544a.b(this.f8220d);
        long currentTimeMillis = System.currentTimeMillis();
        return new n(this.f8217a, this.f8218b, this.f8219c, currentTimeMillis, a(this.f8221e.getParentFile(), i4, this.f8218b, currentTimeMillis));
    }
}
