package defpackage;

import com.yandex.go.payments.shared.wizard.welcome.CreateAccountView;
import com.yandex.go.payments.shared.wizard.welcome.a;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListItemInputComponent;

/* loaded from: classes13.dex */
public final class t3f implements p3f {
    public final /* synthetic */ CreateAccountView a;

    public t3f(CreateAccountView createAccountView) {
        this.a = createAccountView;
    }

    @Override // defpackage.p3f
    public final void l2(s3f s3fVar) {
        ListItemInputComponent listItemInputComponent;
        ListItemInputComponent listItemInputComponent2;
        ListItemInputComponent listItemInputComponent3;
        ButtonComponent buttonComponent;
        ButtonComponent buttonComponent2;
        a aVar;
        ButtonComponent buttonComponent3;
        ListItemInputComponent listItemInputComponent4;
        boolean z = s3fVar.d;
        CreateAccountView createAccountView = this.a;
        if (z) {
            listItemInputComponent4 = createAccountView.nameInput;
            listItemInputComponent4.setVisibility(0);
        } else {
            listItemInputComponent = createAccountView.nameInput;
            listItemInputComponent.setVisibility(8);
            createAccountView.finishInput();
        }
        listItemInputComponent2 = createAccountView.nameInput;
        listItemInputComponent2.setTextWithoutNotifying(s3fVar.a);
        listItemInputComponent3 = createAccountView.nameInput;
        listItemInputComponent3.setAlertText(s3fVar.c);
        boolean z2 = s3fVar.b;
        buttonComponent = createAccountView.createButton;
        buttonComponent.setProgressing(z2);
        if (z2) {
            buttonComponent3 = createAccountView.createButton;
            buttonComponent3.setDebounceClickListener(null);
            createAccountView.finishInput();
        } else {
            buttonComponent2 = createAccountView.createButton;
            aVar = createAccountView.presenter;
            buttonComponent2.setDebounceClickListener(new r3f(aVar, 1));
        }
    }
}
