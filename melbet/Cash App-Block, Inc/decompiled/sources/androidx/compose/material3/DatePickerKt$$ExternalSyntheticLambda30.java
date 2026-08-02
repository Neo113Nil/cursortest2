package androidx.compose.material3;

import androidx.compose.foundation.text.selection.SimpleLayoutKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.cash.marketing.components.CardUpsellKt;
import com.squareup.cash.marketing.components.TooltipState;
import com.squareup.cash.money.views.MoneyTabToolbarKt$$ExternalSyntheticLambda1;
import com.squareup.cash.moneybot.genie.GenieViewKt$GenieView$1$1;
import com.squareup.cash.moneybot.viewmodels.chat.MemoryTooltip;
import com.squareup.cash.moneybot.views.message.MoneybotMessageUiKt$$ExternalSyntheticLambda15;
import com.squareup.cash.offers.views.UtilsKt$$ExternalSyntheticLambda0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class DatePickerKt$$ExternalSyntheticLambda30 implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ boolean f$2;
    public final /* synthetic */ boolean f$3;
    public final /* synthetic */ Function0 f$4;
    public final /* synthetic */ String f$6;
    public final /* synthetic */ Object f$7;

    public /* synthetic */ DatePickerKt$$ExternalSyntheticLambda30(String str, Modifier modifier, boolean z, boolean z2, Function0 function0, String str2, DatePickerColors datePickerColors, int i) {
        this.f$0 = str;
        this.f$1 = modifier;
        this.f$2 = z;
        this.f$3 = z2;
        this.f$4 = function0;
        this.f$6 = str2;
        this.f$7 = datePickerColors;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        String str;
        int i = this.$r8$classId;
        Object obj3 = this.f$7;
        Object obj4 = this.f$1;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                DatePickerKt.Year(this.f$0, (Modifier) obj4, this.f$2, this.f$3, this.f$4, this.f$6, (DatePickerColors) obj3, (Composer) obj, Updater.updateChangedFlags(49));
                break;
            default:
                MemoryTooltip memoryTooltip = (MemoryTooltip) obj4;
                Object obj5 = (Function1) obj3;
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    String str2 = this.f$0;
                    Continuation continuation = null;
                    Object obj6 = Composer.Companion.Empty;
                    if (str2 != null) {
                        gapComposer.startReplaceGroup(1881876093);
                        TooltipState rememberTooltipState = CardUpsellKt.rememberTooltipState(gapComposer);
                        boolean changedInstance = gapComposer.changedInstance(memoryTooltip) | gapComposer.changed(rememberTooltipState);
                        Object rememberedValue = gapComposer.rememberedValue();
                        if (changedInstance || rememberedValue == obj6) {
                            rememberedValue = new GenieViewKt$GenieView$1$1(memoryTooltip, rememberTooltipState, continuation, 22);
                            gapComposer.updateRememberedValue(rememberedValue);
                        }
                        Updater.LaunchedEffect(gapComposer, memoryTooltip, (Function2) rememberedValue);
                        if (memoryTooltip == null || (str = memoryTooltip.text) == null) {
                            str = "";
                        }
                        String str3 = str;
                        boolean changedInstance2 = gapComposer.changedInstance(memoryTooltip) | gapComposer.changed(obj5);
                        Object rememberedValue2 = gapComposer.rememberedValue();
                        if (changedInstance2 || rememberedValue2 == obj6) {
                            rememberedValue2 = new UtilsKt$$ExternalSyntheticLambda0(12, memoryTooltip, obj5);
                            gapComposer.updateRememberedValue(rememberedValue2);
                        }
                        CardUpsellKt.m3598TooltipBoxiHT50w(null, str3, rememberTooltipState, null, RecyclerView.DECELERATION_RATE, (Function0) rememberedValue2, Expect_jvmKt.rememberComposableLambda(577517353, new MoneyTabToolbarKt$$ExternalSyntheticLambda1(str2, 10), gapComposer), gapComposer, 1572864, 25);
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(1882966828);
                        gapComposer.end(false);
                    }
                    String str4 = this.f$6;
                    boolean changed = gapComposer.changed(str4);
                    Object rememberedValue3 = gapComposer.rememberedValue();
                    if (changed || rememberedValue3 == obj6) {
                        rememberedValue3 = Boolean.valueOf(this.f$2);
                        gapComposer.updateRememberedValue(rememberedValue3);
                    }
                    SimpleLayoutKt.SelectionContainer(null, Expect_jvmKt.rememberComposableLambda(-369346477, new MoneybotMessageUiKt$$ExternalSyntheticLambda15(((Boolean) rememberedValue3).booleanValue(), str4, this.f$4, this.f$3), gapComposer), gapComposer, 48, 1);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ DatePickerKt$$ExternalSyntheticLambda30(String str, MemoryTooltip memoryTooltip, Function1 function1, String str2, boolean z, Function0 function0, boolean z2) {
        this.f$0 = str;
        this.f$1 = memoryTooltip;
        this.f$7 = function1;
        this.f$6 = str2;
        this.f$2 = z;
        this.f$4 = function0;
        this.f$3 = z2;
    }
}
