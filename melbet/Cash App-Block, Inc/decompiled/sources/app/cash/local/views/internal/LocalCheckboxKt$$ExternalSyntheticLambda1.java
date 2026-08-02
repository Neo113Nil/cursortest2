package app.cash.local.views.internal;

import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import com.squareup.cash.arcade.components.CheckboxKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class LocalCheckboxKt$$ExternalSyntheticLambda1 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ boolean f$0;
    public final /* synthetic */ Function1 f$1;
    public final /* synthetic */ Modifier f$2;
    public final /* synthetic */ MutableInteractionSourceImpl f$3;
    public final /* synthetic */ boolean f$4;
    public final /* synthetic */ int f$5;
    public final /* synthetic */ int f$6;

    public /* synthetic */ LocalCheckboxKt$$ExternalSyntheticLambda1(boolean z, Function1 function1, Modifier modifier, MutableInteractionSourceImpl mutableInteractionSourceImpl, boolean z2, int i, int i2, int i3) {
        this.$r8$classId = i3;
        this.f$0 = z;
        this.f$1 = function1;
        this.f$2 = modifier;
        this.f$3 = mutableInteractionSourceImpl;
        this.f$4 = z2;
        this.f$5 = i;
        this.f$6 = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                ((Integer) obj2).getClass();
                LocalMapKt.UnlabeledLocalCheckbox(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, (Composer) obj, Updater.updateChangedFlags(this.f$5 | 1), this.f$6);
                break;
            default:
                ((Integer) obj2).getClass();
                CheckboxKt.UnlabeledCheckbox(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, (Composer) obj, Updater.updateChangedFlags(this.f$5 | 1), this.f$6);
                break;
        }
        return Unit.INSTANCE;
    }
}
