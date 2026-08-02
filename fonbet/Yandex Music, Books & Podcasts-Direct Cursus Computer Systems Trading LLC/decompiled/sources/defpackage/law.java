package defpackage;

import javax.net.ssl.X509TrustManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final /* synthetic */ class law implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ law(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                osw oswVar = osw.b;
                nmb nmbVar = w64.a;
                return new ndw(oswVar);
            case 1:
                X509TrustManager b = yat.b(null);
                if (b != null) {
                    return b;
                }
                xq0.x("Failed to create default TrustManager");
                return null;
            case 2:
                jyr jyrVar = few.e;
                l18 l18Var = l18.b;
                bdt I = hag.I(byb.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                String b2 = ((few) ((byb) qdcVar.C(I)).b(few.class)).b();
                return Intrinsics.d(b2, "on") ? dm6.c : Intrinsics.d(b2, "global") ? dm6.a() : Intrinsics.d(b2, "single_thread") ? hdg.c0("Ynison") : dm6.b();
            case 3:
                return new prw();
            case 4:
                return (jmg) l18.b.c(hag.I(jmg.class));
            case 5:
                jyr jyrVar2 = riw.e;
                l18 l18Var2 = l18.b;
                bdt I2 = hag.I(byb.class);
                qdc qdcVar2 = l18Var2.a;
                qdcVar2.getClass();
                return Boolean.valueOf(((riw) ((byb) qdcVar2.C(I2)).c(ern.a(riw.class))).h());
            case 6:
                jyr jyrVar3 = siw.e;
                l18 l18Var3 = l18.b;
                bdt I3 = hag.I(byb.class);
                qdc qdcVar3 = l18Var3.a;
                qdcVar3.getClass();
                return Boolean.valueOf(((siw) ((byb) qdcVar3.C(I3)).c(ern.a(siw.class))).h());
            case 7:
                return Unit.a;
            case 8:
                return Unit.a;
            case 9:
                return Unit.a;
            case 10:
                return Unit.a;
            case 11:
                return Unit.a;
            case 12:
                return Unit.a;
            default:
                l18 l18Var4 = l18.b;
                bdt I4 = hag.I(byb.class);
                qdc qdcVar4 = l18Var4.a;
                qdcVar4.getClass();
                Boolean bool = (Boolean) ((qgw) ((byb) qdcVar4.C(I4)).c(ern.a(qgw.class))).e.getValue();
                bool.getClass();
                return bool;
        }
    }
}
