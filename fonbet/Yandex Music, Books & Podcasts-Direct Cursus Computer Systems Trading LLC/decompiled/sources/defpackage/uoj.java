package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class uoj {
    public static final Pattern f;
    public final hi3 a;
    public final twh b;
    public final String c;
    public final boolean d;
    public final boolean e;

    static {
        Pattern compile = Pattern.compile("req-id\": ?\"([^\"]{0,64})\"", 0);
        compile.getClass();
        f = compile;
    }

    public uoj(hi3 hi3Var, twh twhVar, String str, boolean z, boolean z2) {
        this.a = hi3Var;
        this.b = twhVar;
        this.c = str;
        this.d = z;
        this.e = z2;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(cib cibVar) {
        Throwable th;
        GZIPInputStream gZIPInputStream;
        cibVar.C("-- BODY --");
        String str = this.c;
        boolean z = str == null || "identity".equalsIgnoreCase(str);
        boolean equalsIgnoreCase = "gzip".equalsIgnoreCase(str);
        hi3 hi3Var = this.a;
        if (z) {
            b(cibVar, hi3Var.clone());
            return;
        }
        if (!equalsIgnoreCase) {
            x2i.T(cibVar, "Body with unknown encoding '" + str + "'.");
            return;
        }
        hi3 clone = hi3Var.clone();
        if (clone.b >= 2) {
            hi3 hi3Var2 = new hi3();
            clone.I(hi3Var2, 0L, 2L);
            byte[] X = hi3Var2.X(hi3Var2.b);
            if (X[0] == 31 && X[1] == -117) {
                hi3 hi3Var3 = new hi3();
                GZIPInputStream gZIPInputStream2 = null;
                try {
                    gZIPInputStream = new GZIPInputStream(new fi3(clone, 0));
                    try {
                        try {
                            hi3Var3.j0(gZIPInputStream);
                            b(cibVar, hi3Var3);
                            j66.O(gZIPInputStream);
                            return;
                        } catch (IOException e) {
                            e = e;
                            ssg.a(6, null, "Failed to decode gzipped body buffer.", e);
                            x2i.T(cibVar, "Failed to decode gzipped body buffer.");
                            if (gZIPInputStream != null) {
                                j66.O(gZIPInputStream);
                                return;
                            }
                            return;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        gZIPInputStream2 = gZIPInputStream;
                        if (gZIPInputStream2 != null) {
                            throw th;
                        }
                        j66.O(gZIPInputStream2);
                        throw th;
                    }
                } catch (IOException e2) {
                    e = e2;
                    gZIPInputStream = null;
                } catch (Throwable th3) {
                    th = th3;
                    if (gZIPInputStream2 != null) {
                    }
                }
            }
        }
        x2i.T(cibVar, "Content-encoding is GZIP, but the GZIP magic header is missing.");
    }

    public final void b(cib cibVar, hi3 hi3Var) {
        Charset charset;
        hi3 hi3Var2;
        hi3 hi3Var3;
        int i;
        String g;
        try {
            twh twhVar = this.b;
            if (twhVar != null) {
                Pattern pattern = twh.e;
                charset = twhVar.a(null);
            } else {
                charset = null;
            }
            if (charset == null) {
                charset = xoj.c;
                charset.getClass();
            }
            if (Intrinsics.d(xoj.c, charset)) {
                try {
                    hi3Var2 = new hi3();
                    long j = hi3Var.b;
                    hi3Var3 = hi3Var;
                    hi3Var3.I(hi3Var2, 0L, j < 64 ? j : 64L);
                } catch (EOFException unused) {
                }
                for (i = 0; i < 16; i++) {
                    if (hi3Var2.N()) {
                        break;
                    }
                    int H0 = hi3Var2.H0();
                    if (Character.isISOControl(H0) && !Character.isWhitespace(H0)) {
                        x2i.T(cibVar, "Buffer did not contain UTF-8 plaintext, but should have had.");
                        return;
                    }
                }
            } else {
                hi3Var3 = hi3Var;
            }
            if (this.d) {
                long j2 = hi3Var3.b;
                if (this.e) {
                    g = hi3Var3.F0(Math.min(5242880L, j2), charset);
                    if (j2 > 5242880) {
                        g = g.concat("... (truncated)");
                    }
                } else {
                    g = hi3Var3.F0(j2, charset);
                }
            } else {
                Matcher matcher = f.matcher(hi3Var3.F0(hi3Var3.b, charset));
                g = f1d.g("req-id: ", matcher.find() ? matcher.group(1) : null);
            }
            cibVar.C(g);
        } catch (UnsupportedCharsetException unused2) {
            x2i.T(cibVar, "Charset is likely malformed.");
        }
    }
}
