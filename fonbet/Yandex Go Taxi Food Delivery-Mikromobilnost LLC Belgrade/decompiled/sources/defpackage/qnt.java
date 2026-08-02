package defpackage;

import kotlin.Pair;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final /* synthetic */ class qnt implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Throwable b;
    public final /* synthetic */ u1m c;

    public /* synthetic */ qnt(Throwable th, u1m u1mVar, int i) {
        this.a = i;
        this.b = th;
        this.c = u1mVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        u1m u1mVar = this.c;
        Throwable th = this.b;
        switch (i) {
            case 0:
                return new Pair(th, "Document loading failed (query = " + u1mVar + Extension.C_BRAKE);
            case 1:
                return new Pair(th, "Document rendering failed (query = " + u1mVar + Extension.C_BRAKE);
            default:
                return new Pair(th, "Document retry request failed on query: " + u1mVar);
        }
    }
}
