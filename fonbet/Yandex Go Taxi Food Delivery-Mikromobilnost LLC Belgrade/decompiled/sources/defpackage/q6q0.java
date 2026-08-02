package defpackage;

import java.util.Map;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.c;

/* loaded from: classes9.dex */
public final class q6q0 extends fnr0 {
    public final String a;
    public final String b;

    public q6q0() {
        super(0);
        this.a = "sections";
        this.b = "SectionsSharedDataParser";
    }

    @Override // defpackage.fnr0
    public final String getJsonKey() {
        return this.a;
    }

    @Override // defpackage.fnr0
    public final String getSharedDataParserType() {
        return this.b;
    }

    @Override // defpackage.fnr0
    public final bnr0 tryParse(sbx sbxVar, b bVar) {
        sbxVar.getClass();
        return new p6q0((Map) sbxVar.a(new k8u(auu0.a, c.Companion.serializer(), 1), bVar));
    }
}
