package com.squareup.cash.common.composeui;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScopeImpl;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.room.util.DBUtil;
import coil3.size.SizeKt;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.ModalButtonScope;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.blockers.views.SetPinViewKt$$ExternalSyntheticLambda7;
import com.squareup.cash.composeUi.foundation.layout.AdaptiveStackScope;
import com.squareup.cash.money.views.MoneyTabToolbarKt$$ExternalSyntheticLambda1;
import com.squareup.cash.shopping.views.ShopErrorKt$$ExternalSyntheticLambda0;
import com.stripe.android.financialconnections.features.institutionpicker.InstitutionPickerScreenKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;

/* loaded from: classes6.dex */
public final /* synthetic */ class ArcadeInfoBlockerKt$$ExternalSyntheticLambda0 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function0 f$0;
    public final /* synthetic */ String f$1;

    public /* synthetic */ ArcadeInfoBlockerKt$$ExternalSyntheticLambda0(String str, Function0 function0, int i) {
        this.$r8$classId = i;
        this.f$1 = str;
        this.f$0 = function0;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        int i2 = 2;
        String str = this.f$1;
        int i3 = 1;
        switch (i) {
            case 0:
                AdaptiveStackScope adaptiveStackScope = (AdaptiveStackScope) obj;
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                adaptiveStackScope.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((GapComposer) composer).changed(adaptiveStackScope) ? 4 : 2;
                }
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
                    SizeKt.ButtonCta(this.f$0, adaptiveStackScope.horizontalWeight(companion, 1.0f), ButtonProminence.PROMINENT, false, false, null, Expect_jvmKt.rememberComposableLambda(2018817918, new SetPinViewKt$$ExternalSyntheticLambda7(str, 24), gapComposer), gapComposer, 1573248, 56);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            case 1:
                ModalButtonScope modalButtonScope = (ModalButtonScope) obj;
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                modalButtonScope.getClass();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((GapComposer) composer2).changed(modalButtonScope) ? 4 : 2;
                }
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 19) != 18)) {
                    modalButtonScope.PrimaryModalButton(this.f$0, null, false, Expect_jvmKt.rememberComposableLambda(-321447126, new MoneyTabToolbarKt$$ExternalSyntheticLambda1(str, 5), gapComposer2), gapComposer2, ((intValue2 << 12) & 57344) | 3072, 6);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
            case 2:
                ModalButtonScope modalButtonScope2 = (ModalButtonScope) obj;
                Composer composer3 = (Composer) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                modalButtonScope2.getClass();
                if ((intValue3 & 6) == 0) {
                    intValue3 |= ((GapComposer) composer3).changed(modalButtonScope2) ? 4 : 2;
                }
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 19) != 18)) {
                    modalButtonScope2.PrimaryModalButton(this.f$0, null, false, Expect_jvmKt.rememberComposableLambda(-441372139, new ShopErrorKt$$ExternalSyntheticLambda0(str, i3), gapComposer3), gapComposer3, ((intValue3 << 12) & 57344) | 3072, 6);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                break;
            case 3:
                ModalButtonScope modalButtonScope3 = (ModalButtonScope) obj;
                Composer composer4 = (Composer) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                modalButtonScope3.getClass();
                if ((intValue4 & 6) == 0) {
                    intValue4 |= ((GapComposer) composer4).changed(modalButtonScope3) ? 4 : 2;
                }
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 19) != 18)) {
                    modalButtonScope3.PrimaryModalButton(this.f$0, null, false, Expect_jvmKt.rememberComposableLambda(-1352601285, new ShopErrorKt$$ExternalSyntheticLambda0(str, i2), gapComposer4), gapComposer4, ((intValue4 << 12) & 57344) | 3072, 6);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                break;
            case 4:
                Composer composer5 = (Composer) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                GapComposer gapComposer5 = (GapComposer) composer5;
                if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 17) != 16)) {
                    DBUtil.TitleBarSub(this.f$1, NavigationType.BACK, (Modifier) null, (DynamicColorConfiguration) null, this.f$0, (Modifier) null, (Function3) null, gapComposer5, 48, 108);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                break;
            default:
                Composer composer6 = (Composer) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer6 = (GapComposer) composer6;
                if (gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 17) != 16)) {
                    InstitutionPickerScreenKt.ManualEntryRow(6, gapComposer6, SpacerKt.m298padding3ABfNKs(companion, 8.0f), this.f$0, str == null);
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ ArcadeInfoBlockerKt$$ExternalSyntheticLambda0(Function0 function0, String str, int i) {
        this.$r8$classId = i;
        this.f$0 = function0;
        this.f$1 = str;
    }
}
