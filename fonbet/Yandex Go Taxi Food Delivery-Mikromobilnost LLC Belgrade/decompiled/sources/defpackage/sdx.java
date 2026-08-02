package defpackage;

import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.b;

/* loaded from: classes9.dex */
public final class sdx extends c8 {
    public final b f;

    public sdx(sbx sbxVar, b bVar, String str) {
        super(sbxVar, str);
        this.f = bVar;
        this.a.add("primitive");
    }

    @Override // defpackage.c8
    public final b Y(String str) {
        if (str == "primitive") {
            return this.f;
        }
        ny61.g("This input can only handle primitives with 'primitive' tag");
        return null;
    }

    @Override // defpackage.c8
    public final b a0() {
        return this.f;
    }

    @Override // defpackage.sjd
    public final int v(SerialDescriptor serialDescriptor) {
        return 0;
    }
}
