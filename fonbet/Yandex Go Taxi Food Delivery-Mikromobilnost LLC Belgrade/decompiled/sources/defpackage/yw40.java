package defpackage;

import java.util.ArrayList;
import java.util.UUID;
import okio.ByteString;

/* loaded from: classes4.dex */
public final class yw40 {
    public final ByteString a;
    public wg10 b;
    public final ArrayList c;

    public yw40(int i) {
        String uuid = UUID.randomUUID().toString();
        ByteString byteString = new ByteString(uuid.getBytes(uza.a));
        byteString.b = uuid;
        this.a = byteString;
        this.b = ax40.f;
        this.c = new ArrayList();
    }

    public final void a(meu meuVar, m5j0 m5j0Var) {
        if (meuVar.a("Content-Type") != null) {
            ny61.g("Unexpected header: Content-Type");
        } else if (meuVar.a("Content-Length") == null) {
            b(new zw40(meuVar, m5j0Var));
        } else {
            ny61.g("Unexpected header: Content-Length");
        }
    }

    public final void b(zw40 zw40Var) {
        this.c.add(zw40Var);
    }

    public final ax40 c() {
        ArrayList arrayList = this.c;
        if (arrayList.isEmpty()) {
            ny61.r("Multipart body must have at least one part.");
            return null;
        }
        return new ax40(this.a, this.b, bg61.k(arrayList));
    }

    public final void d(wg10 wg10Var) {
        if (wg10Var.b.equals("multipart")) {
            this.b = wg10Var;
        } else {
            vg10.r(wg10Var, "multipart != ");
        }
    }

    public yw40() {
        this(0);
    }
}
