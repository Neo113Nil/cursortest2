package defpackage;

import com.yandex.messaging.ChatRequest;

/* loaded from: classes15.dex */
public final class y4t extends vds0 {
    public final p4t b;

    public y4t(kse kseVar, p4t p4tVar) {
        super(kseVar.b);
        this.b = p4tVar;
    }

    @Override // defpackage.vds0
    public final tpr b(Object obj) {
        return new syc(this.b.a((ChatRequest) obj), 21);
    }
}
