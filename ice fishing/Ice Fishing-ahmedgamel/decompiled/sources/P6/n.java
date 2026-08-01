package P6;

import N6.o;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UncheckedIOException;
import p7.C4853a;

/* loaded from: classes2.dex */
public final class n extends N6.l {

    /* renamed from: d, reason: collision with root package name */
    public static final q6.f f2599d = new q6.f();

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f2600b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2601c;

    public n(byte[] bArr, String str) {
        super(bArr.length);
        this.f2600b = bArr;
        this.f2601c = str;
    }

    public static n d(C4853a c4853a) {
        q6.f fVar = f2599d;
        n nVar = (n) fVar.a(c4853a);
        if (nVar != null) {
            return nVar;
        }
        c cVar = new c(m.d(c4853a.f39802b));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(cVar.f1992a);
        try {
            cVar.b(byteArrayOutputStream);
            n nVar2 = new n(byteArrayOutputStream.toByteArray(), N6.k.a(cVar));
            fVar.d(c4853a, nVar2);
            return nVar2;
        } catch (IOException e9) {
            throw new UncheckedIOException("Serialization error, this is likely a bug in OpenTelemetry.", e9);
        }
    }

    @Override // N6.f
    public final void c(o oVar) {
        oVar.H(this.f2601c, this.f2600b);
    }
}
