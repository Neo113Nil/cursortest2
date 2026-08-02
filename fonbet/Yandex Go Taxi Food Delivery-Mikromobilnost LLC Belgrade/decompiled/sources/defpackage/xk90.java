package defpackage;

import ru.yandex.taxi.settings.profile.rating.PassengerNameCreatorModalView;

/* loaded from: classes6.dex */
public final /* synthetic */ class xk90 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ PassengerNameCreatorModalView b;

    public /* synthetic */ xk90(PassengerNameCreatorModalView passengerNameCreatorModalView, int i) {
        this.a = i;
        this.b = passengerNameCreatorModalView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        PassengerNameCreatorModalView passengerNameCreatorModalView = this.b;
        switch (i) {
            case 0:
                PassengerNameCreatorModalView.onSuccessfulUpdate$lambda$0(passengerNameCreatorModalView);
                break;
            case 1:
                PassengerNameCreatorModalView.onAttachedToWindow$lambda$2(passengerNameCreatorModalView);
                break;
            default:
                PassengerNameCreatorModalView._init_$lambda$1(passengerNameCreatorModalView);
                break;
        }
    }
}
