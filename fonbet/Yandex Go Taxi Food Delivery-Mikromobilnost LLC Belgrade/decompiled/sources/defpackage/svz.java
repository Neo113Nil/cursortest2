package defpackage;

import com.yandex.go.payments.cards.ui.LoyaltyProgramView;

/* loaded from: classes13.dex */
public final /* synthetic */ class svz implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ LoyaltyProgramView b;
    public final /* synthetic */ kvz c;

    public /* synthetic */ svz(kvz kvzVar, LoyaltyProgramView loyaltyProgramView) {
        this.a = 0;
        this.c = kvzVar;
        this.b = loyaltyProgramView;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        zy11 bindDeletableState$lambda$0;
        zy11 zy11Var;
        zy11 zy11Var2;
        int i = this.a;
        kvz kvzVar = this.c;
        LoyaltyProgramView loyaltyProgramView = this.b;
        switch (i) {
            case 0:
                bindDeletableState$lambda$0 = LoyaltyProgramView.bindDeletableState$lambda$0(kvzVar, loyaltyProgramView);
                return bindDeletableState$lambda$0;
            case 1:
                zy11Var = LoyaltyProgramView.setupToggleSection$lambda$0(loyaltyProgramView, kvzVar);
                return zy11Var;
            default:
                zy11Var2 = LoyaltyProgramView.setupProgramSection$lambda$0(loyaltyProgramView, kvzVar);
                return zy11Var2;
        }
    }

    public /* synthetic */ svz(LoyaltyProgramView loyaltyProgramView, kvz kvzVar, int i) {
        this.a = i;
        this.b = loyaltyProgramView;
        this.c = kvzVar;
    }
}
