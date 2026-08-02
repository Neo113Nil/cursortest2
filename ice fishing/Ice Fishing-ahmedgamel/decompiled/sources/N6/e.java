package N6;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class e extends o {

    /* renamed from: v, reason: collision with root package name */
    public static final JsonFactory f2055v = new JsonFactory();

    /* renamed from: u, reason: collision with root package name */
    public final JsonGenerator f2056u;

    public e(OutputStream outputStream) {
        this.f2056u = f2055v.createGenerator(outputStream);
    }

    @Override // N6.o
    public final void B() {
        this.f2056u.writeEndArray();
    }

    @Override // N6.o
    public final void C() {
        this.f2056u.writeEndObject();
    }

    @Override // N6.o
    public final void D(b bVar, a aVar) {
        this.f2056u.writeNumberField(bVar.f2044d, aVar.f2039a);
    }

    @Override // N6.o
    public final void E(b bVar, int i) {
        this.f2056u.writeNumberField(bVar.f2044d, i);
    }

    @Override // N6.o
    public final void F(b bVar, long j6) {
        this.f2056u.writeStringField(bVar.f2044d, Long.toString(j6));
    }

    @Override // N6.o
    public final void G(b bVar, long j6) {
        this.f2056u.writeStringField(bVar.f2044d, Long.toString(j6));
    }

    @Override // N6.o
    public final void H(String str, byte[] bArr) {
        this.f2056u.writeRaw(str);
    }

    @Override // N6.o
    public final void I(b bVar, String str) {
        this.f2056u.writeStringField(bVar.f2044d, str);
    }

    @Override // N6.o
    public final void K(b bVar, int i) {
        this.f2056u.writeObjectFieldStart(bVar.f2044d);
    }

    @Override // N6.o
    public final void V(b bVar) {
        this.f2056u.writeArrayFieldStart(bVar.f2044d);
    }

    @Override // N6.o
    public final void W(b bVar, int i) {
        this.f2056u.writeStartObject();
    }

    @Override // N6.o
    public final void X(b bVar, String str, int i, j jVar) {
        this.f2056u.writeFieldName(bVar.f2044d);
        this.f2056u.writeString(str);
    }

    @Override // N6.o
    public final void Y(b bVar, byte[] bArr) {
        this.f2056u.writeFieldName(bVar.f2044d);
        this.f2056u.writeString(new String(bArr, StandardCharsets.UTF_8));
    }

    @Override // N6.o
    public final void Z(b bVar, String str) {
        this.f2056u.writeStringField(bVar.f2044d, str);
    }

    @Override // N6.o
    public final void b0(b bVar, int i) {
        this.f2056u.writeNumberField(bVar.f2044d, i);
    }

    public final void c0(f fVar) {
        this.f2056u.writeStartObject();
        fVar.c(this);
        this.f2056u.writeEndObject();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f2056u.close();
    }

    @Override // N6.o
    public final void j(b bVar, List list) {
        this.f2056u.writeArrayFieldStart(bVar.f2044d);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            c0((f) it.next());
        }
        this.f2056u.writeEndArray();
    }

    @Override // N6.o
    public final void k(b bVar, f[] fVarArr) {
        this.f2056u.writeArrayFieldStart(bVar.f2044d);
        for (f fVar : fVarArr) {
            c0(fVar);
        }
        this.f2056u.writeEndArray();
    }

    @Override // N6.o
    public final void l(b bVar, List list, q qVar, j jVar) {
        this.f2056u.writeArrayFieldStart(bVar.f2044d);
        for (int i = 0; i < list.size(); i++) {
            Object obj = list.get(i);
            this.f2056u.writeStartObject();
            qVar.c(this, obj, jVar);
            this.f2056u.writeEndObject();
        }
        this.f2056u.writeEndArray();
    }

    @Override // N6.o
    public final void q(b bVar, boolean z6) {
        this.f2056u.writeBooleanField(bVar.f2044d, z6);
    }

    @Override // N6.o
    public final void w(b bVar, byte[] bArr) {
        this.f2056u.writeBinaryField(bVar.f2044d, bArr);
    }

    @Override // N6.o
    public final void x(b bVar, double d9) {
        this.f2056u.writeNumberField(bVar.f2044d, d9);
    }

    @Override // N6.o
    public final void z() {
        this.f2056u.writeEndObject();
    }
}
