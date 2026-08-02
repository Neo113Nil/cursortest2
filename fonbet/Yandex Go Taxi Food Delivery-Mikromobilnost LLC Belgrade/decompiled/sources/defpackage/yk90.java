package defpackage;

import android.text.Editable;
import kotlin.coroutines.Continuation;
import ru.yandex.taxi.design.ListItemInputComponent;
import ru.yandex.taxi.settings.profile.rating.PassengerNameCreatorModalView;

/* loaded from: classes6.dex */
public final class yk90 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ PassengerNameCreatorModalView b;

    public /* synthetic */ yk90(PassengerNameCreatorModalView passengerNameCreatorModalView, int i) {
        this.a = i;
        this.b = passengerNameCreatorModalView;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        dl90 dl90Var;
        ListItemInputComponent listItemInputComponent;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        PassengerNameCreatorModalView passengerNameCreatorModalView = this.b;
        switch (i) {
            case 0:
                dl90Var = passengerNameCreatorModalView.presenter;
                dl90Var.Lg((Editable) obj);
                break;
            default:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                listItemInputComponent = passengerNameCreatorModalView.nameInput;
                listItemInputComponent.setShowUnderLine(booleanValue);
                break;
        }
        return zy11Var;
    }
}
