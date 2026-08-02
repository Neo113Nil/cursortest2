package defpackage;

import android.graphics.pdf.PdfRenderer;
import java.util.UUID;

/* loaded from: classes4.dex */
public final class s790 extends o4j0 {
    public final void b(String str) {
        ((r690) a(str)).b.close();
        this.a.remove(str);
    }

    public final r690 c(String str, PdfRenderer.Page page) {
        String uuid = UUID.randomUUID().toString();
        r690 r690Var = new r690(uuid, page);
        this.a.put(uuid, r690Var);
        return r690Var;
    }
}
