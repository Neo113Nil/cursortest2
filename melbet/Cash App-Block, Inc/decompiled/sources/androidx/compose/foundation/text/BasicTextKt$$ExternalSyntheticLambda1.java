package androidx.compose.foundation.text;

import androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.layout.LayoutCoordinates;
import app.cash.broadway.ui.compose.DialogListenerEvent;
import com.squareup.cash.blockers.viewmodels.RegisterAliasViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class BasicTextKt$$ExternalSyntheticLambda1 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MutableState f$0;

    public /* synthetic */ BasicTextKt$$ExternalSyntheticLambda1(int i, MutableState mutableState) {
        this.$r8$classId = i;
        this.f$0 = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        MutableState mutableState = this.f$0;
        switch (i) {
            case 0:
                TextAnnotatedStringNode.TextSubstitutionValue textSubstitutionValue = (TextAnnotatedStringNode.TextSubstitutionValue) obj;
                mutableState.setValue(textSubstitutionValue.isShowingSubstitution() ? textSubstitutionValue.getSubstitution() : textSubstitutionValue.getOriginal());
                break;
            case 1:
                mutableState.setValue((LayoutCoordinates) obj);
                break;
            case 2:
                DialogListenerEvent dialogListenerEvent = (DialogListenerEvent) obj;
                dialogListenerEvent.getClass();
                ((Function1) mutableState.getValue()).invoke(dialogListenerEvent);
                break;
            default:
                Function1 function1 = (Function1) obj;
                function1.getClass();
                mutableState.setValue((RegisterAliasViewModel) function1.invoke((RegisterAliasViewModel) mutableState.getValue()));
                break;
        }
        return Unit.INSTANCE;
    }
}
