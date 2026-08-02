package defpackage;

import java.util.Map;
import kotlinx.serialization.json.b;

/* loaded from: classes9.dex */
public final class u1q0 extends fnr0 {
    public final String a;
    public final String b;

    public u1q0() {
        super(0);
        this.a = "sectionLabels";
        this.b = "SectionLabelsSharedDataParser";
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
        auu0 auu0Var = auu0.a;
        return wwg.k((Map) sbxVar.a(new k8u(auu0Var, new p53(auu0Var, 0), 1), bVar));
    }
}
