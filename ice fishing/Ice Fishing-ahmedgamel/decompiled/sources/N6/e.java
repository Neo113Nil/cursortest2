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
    public static final JsonFactory f1967v = new JsonFactory();

    /* renamed from: u, reason: collision with root package name */
    public final JsonGenerator f1968u;

    public e(OutputStream outputStream) {
        this.f1968u = f1967v.createGenerator(outputStream);
    }

    @Override // N6.o
    public final void B() {
        this.f1968u.writeEndArray();
    }

    @Override // N6.o
    public final void C() {
        this.f1968u.writeEndObject();
    }

    @Override // N6.o
    public final void D(b bVar, a aVar) {
        this.f1968u.writeNumberField(bVar.f1956d, aVar.f1951a);
    }

    @Override // N6.o
    public final void E(b bVar, int i) {
        this.f1968u.writeNumberField(bVar.f1956d, i);
    }

    @Override // N6.o
    public final void F(b bVar, long j6) {
        this.f1968u.writeStringField(bVar.f1956d, Long.toString(j6));
    }

    @Override // N6.o
    public final void G(b bVar, long j6) {
        this.f1968u.writeStringField(bVar.f1956d, Long.toString(j6));
    }

    @Override // N6.o
    public final void H(String str, byte[] bArr) {
        this.f1968u.writeRaw(str);
    }

    @Override // N6.o
    public final void I(b bVar, String str) {
        this.f1968u.writeStringField(bVar.f1956d, str);
    }

    @Override // N6.o
    public final void K(b bVar, int i) {
        this.f1968u.writeObjectFieldStart(bVar.f1956d);
    }

    @Override // N6.o
    public final void V(b bVar) {
        this.f1968u.writeArrayFieldStart(bVar.f1956d);
    }

    @Override // N6.o
    public final void W(b bVar, int i) {
        this.f1968u.writeStartObject();
    }

    @Override // N6.o
    public final void X(b bVar, String str, int i, j jVar) {
        this.f1968u.writeFieldName(bVar.f1956d);
        this.f1968u.writeString(str);
    }

    @Override // N6.o
    public final void Y(b bVar, byte[] bArr) {
        this.f1968u.writeFieldName(bVar.f1956d);
        this.f1968u.writeString(new String(bArr, StandardCharsets.UTF_8));
    }

    @Override // N6.o
    public final void Z(b bVar, String str) {
        this.f1968u.writeStringField(bVar.f1956d, str);
    }

    @Override // N6.o
    public final void b0(b bVar, int i) {
        this.f1968u.writeNumberField(bVar.f1956d, i);
    }

    public final void c0(f fVar) {
        this.f1968u.writeStartObject();
        fVar.c(this);
        this.f1968u.writeEndObject();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f1968u.close();
    }

    @Override // N6.o
    public final void j(b bVar, List list) {
        this.f1968u.writeArrayFieldStart(bVar.f1956d);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            c0((f) it.next());
        }
        this.f1968u.writeEndArray();
    }

    @Override // N6.o
    public final void k(b bVar, f[] fVarArr) {
        this.f1968u.writeArrayFieldStart(bVar.f1956d);
        for (f fVar : fVarArr) {
            c0(fVar);
        }
        this.f1968u.writeEndArray();
    }

    @Override // N6.o
    public final void l(b bVar, List list, q qVar, j jVar) {
        this.f1968u.writeArrayFieldStart(bVar.f1956d);
        for (int i = 0; i < list.size(); i++) {
            Object obj = list.get(i);
            this.f1968u.writeStartObject();
            qVar.c(this, obj, jVar);
            this.f1968u.writeEndObject();
        }
        this.f1968u.writeEndArray();
    }

    @Override // N6.o
    public final void q(b bVar, boolean z3) {
        this.f1968u.writeBooleanField(bVar.f1956d, z3);
    }

    @Override // N6.o
    public final void w(b bVar, byte[] bArr) {
        this.f1968u.writeBinaryField(bVar.f1956d, bArr);
    }

    @Override // N6.o
    public final void x(b bVar, double d2) {
        this.f1968u.writeNumberField(bVar.f1956d, d2);
    }

    @Override // N6.o
    public final void z() {
        this.f1968u.writeEndObject();
    }
}
