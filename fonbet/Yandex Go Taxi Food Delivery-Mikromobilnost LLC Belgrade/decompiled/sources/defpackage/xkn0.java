package defpackage;

import ru.yandex.taxi.scooters.presentation.feedback.ScootersFeedbackCard;

/* loaded from: classes6.dex */
public final /* synthetic */ class xkn0 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ ScootersFeedbackCard b;

    public /* synthetic */ xkn0(ScootersFeedbackCard scootersFeedbackCard, int i) {
        this.a = i;
        this.b = scootersFeedbackCard;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        zy11 zy11Var;
        zy11 initComment$lambda$0$0;
        int i = this.a;
        ScootersFeedbackCard scootersFeedbackCard = this.b;
        switch (i) {
            case 0:
                zy11Var = ScootersFeedbackCard.setupListeners$lambda$2(scootersFeedbackCard);
                return zy11Var;
            default:
                initComment$lambda$0$0 = ScootersFeedbackCard.initComment$lambda$0$0(scootersFeedbackCard);
                return initComment$lambda$0$0;
        }
    }
}
