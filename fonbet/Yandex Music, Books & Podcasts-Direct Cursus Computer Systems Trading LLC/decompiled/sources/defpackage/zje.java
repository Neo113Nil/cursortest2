package defpackage;

import java.nio.ByteBuffer;
import java.util.zip.Inflater;

/* loaded from: classes3.dex */
public class zje extends jcc {
    public final Inflater f;
    public final om3 g = new om3();

    public zje(Inflater inflater) {
        this.f = inflater;
    }

    @Override // defpackage.jcc, defpackage.u97
    public void Q(aa7 aa7Var, om3 om3Var) {
        Inflater inflater = this.f;
        try {
            ByteBuffer j = om3.j(om3Var.c * 2);
            while (true) {
                int size = om3Var.a.size();
                om3 om3Var2 = this.g;
                if (size <= 0) {
                    j.flip();
                    om3Var2.a(j);
                    v7g.s(this, om3Var2);
                    return;
                }
                ByteBuffer o = om3Var.o();
                if (o.hasRemaining()) {
                    o.remaining();
                    inflater.setInput(o.array(), o.arrayOffset() + o.position(), o.remaining());
                    do {
                        j.position(j.position() + inflater.inflate(j.array(), j.arrayOffset() + j.position(), j.remaining()));
                        if (!j.hasRemaining()) {
                            j.flip();
                            om3Var2.a(j);
                            j = om3.j(j.capacity() * 2);
                        }
                        if (!inflater.needsInput()) {
                        }
                    } while (!inflater.finished());
                }
                om3.m(o);
            }
        } catch (Exception e) {
            b(e);
        }
    }

    @Override // defpackage.jcc
    public final void b(Exception exc) {
        Inflater inflater = this.f;
        inflater.end();
        if (exc != null && inflater.getRemaining() > 0) {
            exc = new my1("data still remaining in inflater", exc);
        }
        super.b(exc);
    }
}
