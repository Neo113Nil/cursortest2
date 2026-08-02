package P6;

import N6.o;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UncheckedIOException;

/* loaded from: classes2.dex */
public final class k extends N6.l {

    /* renamed from: d, reason: collision with root package name */
    public static final q6.f f2426d = new q6.f();

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f2427b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2428c;

    public k(byte[] bArr, String str) {
        super(bArr.length);
        this.f2427b = bArr;
        this.f2428c = str;
    }

    public static k d(Y6.a aVar) {
        q6.f fVar = f2426d;
        k kVar = (k) fVar.a(aVar);
        if (kVar != null) {
            return kVar;
        }
        j jVar = new j(N6.k.f(aVar.f3910a), N6.k.f(aVar.f3911b), m.d(aVar.f3913d));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(jVar.f2080a);
        try {
            jVar.b(byteArrayOutputStream);
            k kVar2 = new k(byteArrayOutputStream.toByteArray(), N6.k.a(jVar));
            fVar.d(aVar, kVar2);
            return kVar2;
        } catch (IOException e9) {
            throw new UncheckedIOException("Serialization error, this is likely a bug in OpenTelemetry.", e9);
        }
    }

    @Override // N6.f
    public final void c(o oVar) {
        oVar.H(this.f2428c, this.f2427b);
    }
}
