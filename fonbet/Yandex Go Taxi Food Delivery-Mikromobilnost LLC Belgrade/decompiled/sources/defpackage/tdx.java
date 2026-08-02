package defpackage;

import kotlinx.serialization.json.b;

/* loaded from: classes4.dex */
public final class tdx extends f8 {
    public b g;

    public tdx(sbx sbxVar, tls tlsVar) {
        super(sbxVar, tlsVar);
        this.a.add("primitive");
    }

    @Override // defpackage.f8
    public final b Y() {
        b bVar = this.g;
        if (bVar != null) {
            return bVar;
        }
        ny61.g("Primitive element has not been recorded. Is call to .encodeXxx is missing in serializer?");
        return null;
    }

    @Override // defpackage.f8
    public final void Z(String str, b bVar) {
        if (str != "primitive") {
            ny61.g("This output can only consume primitives with 'primitive' tag");
        } else if (this.g != null) {
            ny61.g("Primitive element was already recorded. Does call to .encodeXxx happen more than once?");
        } else {
            this.g = bVar;
            this.c.invoke(bVar);
        }
    }
}
