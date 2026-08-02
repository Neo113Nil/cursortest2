package androidx.compose.material3;

import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import com.squareup.cash.work.views.clockin.DisclaimerTextKt;
import com.stripe.android.financialconnections.features.common.ListItemKt;
import com.stripe.android.financialconnections.features.partnerauth.SharedPartnerAuthState;
import com.stripe.android.financialconnections.model.OauthPrepane;
import com.stripe.android.financialconnections.presentation.Async;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class SwitchKt$$ExternalSyntheticLambda1 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ boolean f$1;
    public final /* synthetic */ boolean f$2;
    public final /* synthetic */ Object f$3;
    public final /* synthetic */ Function f$4;
    public final /* synthetic */ Object f$5;
    public final /* synthetic */ Object f$6;
    public final /* synthetic */ int f$7;

    public /* synthetic */ SwitchKt$$ExternalSyntheticLambda1(Modifier modifier, boolean z, boolean z2, SwitchColors switchColors, Function2 function2, MutableInteractionSourceImpl mutableInteractionSourceImpl, Shape shape, int i) {
        this.$r8$classId = 0;
        this.f$0 = modifier;
        this.f$1 = z;
        this.f$2 = z2;
        this.f$3 = switchColors;
        this.f$4 = function2;
        this.f$5 = mutableInteractionSourceImpl;
        this.f$6 = shape;
        this.f$7 = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        int i2 = this.f$7;
        Object obj3 = this.f$6;
        Object obj4 = this.f$5;
        Function function = this.f$4;
        Object obj5 = this.f$3;
        Object obj6 = this.f$0;
        switch (i) {
            case 0:
                ((Integer) obj2).intValue();
                int updateChangedFlags = Updater.updateChangedFlags(i2 | 1);
                SwitchKt.SwitchImpl((Modifier) obj6, this.f$1, this.f$2, (SwitchColors) obj5, (Function2) function, (MutableInteractionSourceImpl) obj4, (Shape) obj3, (Composer) obj, updateChangedFlags);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int updateChangedFlags2 = Updater.updateChangedFlags(i2 | 1);
                DisclaimerTextKt.ClockedOutFooter(this.f$1, this.f$2, (String) obj6, (String) obj5, (Function0) function, (Function0) obj4, (Function0) obj3, (Composer) obj, updateChangedFlags2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int updateChangedFlags3 = Updater.updateChangedFlags(i2 | 1);
                ListItemKt.LoadedContent(this.f$1, this.f$2, (Async) obj6, (SharedPartnerAuthState.Payload) obj5, (Function0) function, (Function0) obj4, (Function1) obj3, (Composer) obj, updateChangedFlags3);
                break;
            default:
                ((Integer) obj2).getClass();
                int updateChangedFlags4 = Updater.updateChangedFlags(i2 | 1);
                ListItemKt.PrePaneContent(this.f$1, this.f$2, (OauthPrepane) obj6, (Async) obj5, (Function0) function, (Function0) obj4, (Function1) obj3, (Composer) obj, updateChangedFlags4);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ SwitchKt$$ExternalSyntheticLambda1(boolean z, boolean z2, Object obj, Object obj2, Function0 function0, Function0 function02, Function function, int i, int i2) {
        this.$r8$classId = i2;
        this.f$1 = z;
        this.f$2 = z2;
        this.f$0 = obj;
        this.f$3 = obj2;
        this.f$4 = function0;
        this.f$5 = function02;
        this.f$6 = function;
        this.f$7 = i;
    }
}
