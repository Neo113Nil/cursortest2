package defpackage;

import ru.yandex.taxi.settings.profile.rating.PassengerNameEditorModalView;

/* loaded from: classes6.dex */
public final /* synthetic */ class zk90 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ PassengerNameEditorModalView b;

    public /* synthetic */ zk90(PassengerNameEditorModalView passengerNameEditorModalView, int i) {
        this.a = i;
        this.b = passengerNameEditorModalView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        PassengerNameEditorModalView passengerNameEditorModalView = this.b;
        switch (i) {
            case 0:
                PassengerNameEditorModalView.onAttachedToWindow$lambda$2(passengerNameEditorModalView);
                break;
            case 1:
                PassengerNameEditorModalView._init_$lambda$1(passengerNameEditorModalView);
                break;
            default:
                PassengerNameEditorModalView._init_$lambda$2(passengerNameEditorModalView);
                break;
        }
    }
}
