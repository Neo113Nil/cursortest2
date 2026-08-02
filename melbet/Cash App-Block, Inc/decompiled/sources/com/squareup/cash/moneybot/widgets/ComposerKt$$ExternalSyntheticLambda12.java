package com.squareup.cash.moneybot.widgets;

import androidx.compose.foundation.text.selection.SimpleLayoutKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import androidx.media3.common.PlayerExtensionsKt;
import com.stripe.android.financialconnections.features.success.SuccessContentKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class ComposerKt$$ExternalSyntheticLambda12 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Modifier f$0;
    public final /* synthetic */ boolean f$1;
    public final /* synthetic */ Function0 f$2;
    public final /* synthetic */ int f$3;

    public /* synthetic */ ComposerKt$$ExternalSyntheticLambda12(Modifier modifier, Function0 function0, boolean z, int i) {
        this.$r8$classId = 1;
        this.f$0 = modifier;
        this.f$2 = function0;
        this.f$1 = z;
        this.f$3 = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                ComposerKt.SendButton(Updater.updateChangedFlags(this.f$3 | 1), composer, this.f$0, this.f$2, this.f$1);
                break;
            case 1:
                SimpleLayoutKt.SelectionHandleIcon(Updater.updateChangedFlags(this.f$3 | 1), composer, this.f$0, this.f$2, this.f$1);
                break;
            case 2:
                UtilsKt.SendButton(Updater.updateChangedFlags(this.f$3 | 1), composer, this.f$0, this.f$2, this.f$1);
                break;
            case 3:
                PlayerExtensionsKt.AddAttachmentButton(Updater.updateChangedFlags(this.f$3 | 1), composer, this.f$0, this.f$2, this.f$1);
                break;
            case 4:
                PlayerExtensionsKt.SendButton(Updater.updateChangedFlags(this.f$3 | 1), composer, this.f$0, this.f$2, this.f$1);
                break;
            default:
                SuccessContentKt.SpinnerToCheckmark(Updater.updateChangedFlags(this.f$3 | 1), composer, this.f$0, this.f$2, this.f$1);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ ComposerKt$$ExternalSyntheticLambda12(Modifier modifier, boolean z, Function0 function0, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = modifier;
        this.f$1 = z;
        this.f$2 = function0;
        this.f$3 = i;
    }

    public /* synthetic */ ComposerKt$$ExternalSyntheticLambda12(Function0 function0, boolean z, Modifier modifier, int i) {
        this.$r8$classId = 3;
        this.f$2 = function0;
        this.f$1 = z;
        this.f$0 = modifier;
        this.f$3 = i;
    }

    public /* synthetic */ ComposerKt$$ExternalSyntheticLambda12(boolean z, Function0 function0, Modifier modifier, int i, int i2) {
        this.$r8$classId = i2;
        this.f$1 = z;
        this.f$2 = function0;
        this.f$0 = modifier;
        this.f$3 = i;
    }
}
