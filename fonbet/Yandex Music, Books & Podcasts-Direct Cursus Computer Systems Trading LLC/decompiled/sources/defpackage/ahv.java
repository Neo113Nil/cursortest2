package defpackage;

import android.text.TextUtils;
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class ahv implements r2c {
    public static final Pattern i = Pattern.compile("LOCAL:([^,]+)");
    public static final Pattern j = Pattern.compile("MPEGTS:(-?\\d+)");
    public final String a;
    public final ojs b;
    public final spr d;
    public final boolean e;
    public t2c f;
    public int h;
    public final d7k c = new d7k();
    public byte[] g = new byte[1024];

    public ahv(String str, ojs ojsVar, spr sprVar, boolean z) {
        this.a = str;
        this.b = ojsVar;
        this.d = sprVar;
        this.e = z;
    }

    @Override // defpackage.r2c
    public final void b(long j2, long j3) {
        throw new IllegalStateException();
    }

    public final azs c(long j2) {
        azs M = this.f.M(0, 3);
        bsc bscVar = new bsc();
        bscVar.m = l5i.p("text/vtt");
        bscVar.d = this.a;
        bscVar.r = j2;
        eta.o(bscVar, M);
        this.f.K();
        return M;
    }

    @Override // defpackage.r2c
    public final boolean d(s2c s2cVar) {
        gm7 gm7Var = (gm7) s2cVar;
        gm7Var.l(this.g, 0, 6, false);
        byte[] bArr = this.g;
        d7k d7kVar = this.c;
        d7kVar.F(6, bArr);
        if (bhv.a(d7kVar)) {
            return true;
        }
        gm7Var.l(this.g, 6, 3, false);
        d7kVar.F(9, this.g);
        return bhv.a(d7kVar);
    }

    @Override // defpackage.r2c
    public final int h(s2c s2cVar, ci0 ci0Var) {
        String i2;
        this.f.getClass();
        int length = (int) s2cVar.getLength();
        int i3 = this.h;
        byte[] bArr = this.g;
        if (i3 == bArr.length) {
            this.g = Arrays.copyOf(bArr, ((length != -1 ? length : bArr.length) * 3) / 2);
        }
        byte[] bArr2 = this.g;
        int i4 = this.h;
        int read = s2cVar.read(bArr2, i4, bArr2.length - i4);
        if (read != -1) {
            int i5 = this.h + read;
            this.h = i5;
            if (length == -1 || i5 != length) {
                return 0;
            }
        }
        d7k d7kVar = new d7k(this.g);
        bhv.d(d7kVar);
        String i6 = d7kVar.i(StandardCharsets.UTF_8);
        long j2 = 0;
        long j3 = 0;
        while (true) {
            Matcher matcher = null;
            if (TextUtils.isEmpty(i6)) {
                while (true) {
                    String i7 = d7kVar.i(StandardCharsets.UTF_8);
                    if (i7 == null) {
                        break;
                    }
                    if (bhv.a.matcher(i7).matches()) {
                        do {
                            i2 = d7kVar.i(StandardCharsets.UTF_8);
                            if (i2 != null) {
                            }
                        } while (!i2.isEmpty());
                    } else {
                        Matcher matcher2 = zgv.a.matcher(i7);
                        if (matcher2.matches()) {
                            matcher = matcher2;
                            break;
                        }
                    }
                }
                if (matcher == null) {
                    c(0L);
                    return -1;
                }
                String group = matcher.group(1);
                group.getClass();
                long c = bhv.c(group);
                int i8 = dvt.a;
                long b = this.b.b(dvt.g0((j2 + c) - j3, 90000L, 1000000L, RoundingMode.DOWN) % 8589934592L);
                azs c2 = c(b - c);
                byte[] bArr3 = this.g;
                int i9 = this.h;
                d7k d7kVar2 = this.c;
                d7kVar2.F(i9, bArr3);
                c2.b(d7kVar2, this.h, 0);
                c2.a(b, 1, this.h, 0, null);
                return -1;
            }
            if (i6.startsWith("X-TIMESTAMP-MAP")) {
                Matcher matcher3 = i.matcher(i6);
                if (!matcher3.find()) {
                    throw r7k.a(null, "X-TIMESTAMP-MAP doesn't contain local timestamp: ".concat(i6));
                }
                Matcher matcher4 = j.matcher(i6);
                if (!matcher4.find()) {
                    throw r7k.a(null, "X-TIMESTAMP-MAP doesn't contain media timestamp: ".concat(i6));
                }
                String group2 = matcher3.group(1);
                group2.getClass();
                j3 = bhv.c(group2);
                String group3 = matcher4.group(1);
                group3.getClass();
                long parseLong = Long.parseLong(group3);
                int i10 = dvt.a;
                j2 = dvt.g0(parseLong, 1000000L, 90000L, RoundingMode.DOWN);
            }
            i6 = d7kVar.i(StandardCharsets.UTF_8);
        }
    }

    @Override // defpackage.r2c
    public final void l(t2c t2cVar) {
        if (this.e) {
            t2cVar = new z0j(t2cVar, this.d);
        }
        this.f = t2cVar;
        t2cVar.E(new zg2(-9223372036854775807L));
    }

    @Override // defpackage.r2c
    public final void a() {
    }
}
