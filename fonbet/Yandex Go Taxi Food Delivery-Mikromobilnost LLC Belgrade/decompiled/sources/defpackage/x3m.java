package defpackage;

import defpackage.ol5;
import defpackage.pih;
import defpackage.wog;
import kotlin.a;

/* loaded from: classes8.dex */
public final class x3m {
    public final i3y a;
    public final i3y b;
    public final i3y c;

    public x3m(cop0 cop0Var, final wog wogVar, final ol5 ol5Var, final ike ikeVar) {
        new sls(ol5Var, ikeVar) { // from class: com.yandex.plus.home.internal.di.e
            public final /* synthetic */ ol5 b;

            @Override // defpackage.sls
            public final Object invoke() {
                wog wogVar2 = wog.this;
                ol5 ol5Var2 = this.b;
                return new pih(new DomainModule$redAlertsInteractor$2$1(ol5Var2), new DomainModule$redAlertsInteractor$2$2(ol5Var2));
            }
        };
        this.a = a.a(new in2(5, wogVar, cop0Var, ikeVar));
        this.b = a.a(new w3m(cop0Var, 0));
        this.c = a.a(new w3m(cop0Var, 1));
    }

    public x3m(b5d0 b5d0Var, n4u0 n4u0Var, n8s n8sVar, pgz pgzVar) {
        this.a = a.a(new j8s(11));
        this.b = a.a(new j8s(12));
        this.c = a.a(new j8s(13));
    }
}
