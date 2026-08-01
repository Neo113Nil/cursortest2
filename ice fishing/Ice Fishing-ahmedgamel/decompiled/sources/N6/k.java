package N6;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.charset.StandardCharsets;

/* loaded from: classes2.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final int f1988a = d.b(16) + 16;

    /* renamed from: b, reason: collision with root package name */
    public static final int f1989b = d.b(8) + 8;

    /* renamed from: c, reason: collision with root package name */
    public static final boolean f1990c;

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f1991d;

    static {
        boolean z3;
        try {
            Class.forName("com.fasterxml.jackson.core.JsonFactory");
            z3 = true;
        } catch (ClassNotFoundException unused) {
            z3 = false;
        }
        f1990c = z3;
        f1991d = new byte[0];
    }

    public static String a(l lVar) {
        if (!f1990c) {
            return "";
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            e eVar = new e(byteArrayOutputStream);
            try {
                eVar.c0(lVar);
                eVar.close();
                return new String(byteArrayOutputStream.toByteArray(), 1, r4.length - 2, StandardCharsets.UTF_8);
            } finally {
            }
        } catch (IOException e9) {
            throw new UncheckedIOException("Serialization error, this is likely a bug in OpenTelemetry.", e9);
        }
    }

    public static int b(b bVar, byte[] bArr) {
        if (bArr.length == 0) {
            return 0;
        }
        int i = bVar.f1955c;
        int length = bArr.length;
        return d.b(length) + length + i;
    }

    public static int c(b bVar, long j6) {
        if (j6 == 0) {
            return 0;
        }
        int i = bVar.f1955c;
        int i6 = d.f1961e;
        return i + 8;
    }

    public static int d(b bVar, f fVar) {
        int a9 = fVar.a();
        return d.b(a9) + bVar.f1955c + a9;
    }

    public static int e(b bVar, f[] fVarArr) {
        int i = bVar.f1955c;
        int i6 = 0;
        for (f fVar : fVarArr) {
            int a9 = fVar.a();
            i6 += d.b(a9) + i + a9;
        }
        return i6;
    }

    public static byte[] f(String str) {
        return (str == null || str.isEmpty()) ? f1991d : str.getBytes(StandardCharsets.UTF_8);
    }
}
