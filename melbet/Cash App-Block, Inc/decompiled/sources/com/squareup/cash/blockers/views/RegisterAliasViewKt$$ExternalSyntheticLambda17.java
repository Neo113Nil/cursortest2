package com.squareup.cash.blockers.views;

import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.ui.platform.DelegatingSoftwareKeyboardController;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.blockers.viewmodels.RegisterAliasViewEvent;
import com.squareup.cash.core.navigationcontainer.navigator.EventListener;
import com.squareup.cash.securitysignals.ui.TouchRecorder;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class RegisterAliasViewKt$$ExternalSyntheticLambda17 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ Object f$3;

    public /* synthetic */ RegisterAliasViewKt$$ExternalSyntheticLambda17(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = obj4;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        Object obj = this.f$3;
        Object obj2 = this.f$2;
        Object obj3 = this.f$1;
        Object obj4 = this.f$0;
        switch (i) {
            case 0:
                DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController = (DelegatingSoftwareKeyboardController) obj4;
                Function1 function1 = (Function1) obj3;
                TextFieldState textFieldState = (TextFieldState) obj2;
                TouchRecorder touchRecorder = (TouchRecorder) obj;
                if (delegatingSoftwareKeyboardController != null) {
                    delegatingSoftwareKeyboardController.hide();
                }
                function1.invoke(new RegisterAliasViewEvent.Submit(textFieldState.getValue$foundation().text.toString(), touchRecorder.getSignalsContext()));
                break;
            default:
                Screen screen = (Screen) obj;
                ((AtomicReference) obj4).set(obj3);
                Iterator it = ((List) obj2).iterator();
                while (it.hasNext()) {
                    ((EventListener) it.next()).getClass();
                    screen.getClass();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
