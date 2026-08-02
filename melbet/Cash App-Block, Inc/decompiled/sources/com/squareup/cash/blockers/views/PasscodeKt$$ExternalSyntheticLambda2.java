package com.squareup.cash.blockers.views;

import androidx.camera.core.LegacySessionConfig;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpayAppletHomeContentViewModel;
import com.squareup.cash.afterpayapplet.views.homesection.LegalSectionKt;
import com.squareup.cash.card.onboarding.GlitterCardEffectKt;
import com.squareup.cash.money.applets.common.views.InstalledServiceAppletTileLayoutConfig;
import com.squareup.cash.money.applets.common.views.SharedUIKt;
import com.squareup.cash.money.viewmodels.InstalledServiceAppletTileContentModel;
import com.squareup.cash.paychecks.views.PaycheckCircles;
import com.squareup.cash.profile.views.BadgeNameKt;
import com.squareup.cash.profile.views.security.WebSectionKt;
import com.squareup.cash.support.chat.views.survey.ChatSurveyKt;
import com.squareup.cash.work.views.clockin.DisclaimerTextKt;
import com.stripe.android.financialconnections.features.common.ListItemKt;
import com.stripe.android.uicore.elements.DropdownFieldUIKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes7.dex */
public final /* synthetic */ class PasscodeKt$$ExternalSyntheticLambda2 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ int f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ boolean f$3;
    public final /* synthetic */ int f$4;

    public /* synthetic */ PasscodeKt$$ExternalSyntheticLambda2(int i, int i2, String str, Function1 function1, boolean z) {
        this.$r8$classId = 7;
        this.f$1 = i;
        this.f$0 = str;
        this.f$3 = z;
        this.f$2 = function1;
        this.f$4 = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        int i2 = this.f$4;
        int i3 = this.f$1;
        Object obj3 = this.f$2;
        Object obj4 = this.f$0;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int updateChangedFlags = Updater.updateChangedFlags(i2 | 1);
                int i4 = this.f$1;
                SsnViewKt.PasscodeInput((TextFieldState) obj4, i4, (Modifier) obj3, this.f$3, (Composer) obj, updateChangedFlags);
                break;
            case 1:
                ((Integer) obj2).getClass();
                LegalSectionKt.TextLinesSection((Modifier) obj3, (AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.TextLines) obj4, this.f$3, (Composer) obj, Updater.updateChangedFlags(i3 | 1), this.f$4);
                break;
            case 2:
                ((Integer) obj2).getClass();
                GlitterCardEffectKt.GlitterCardEffect((Modifier) obj3, (CoroutineContext) obj4, this.f$3, (Composer) obj, Updater.updateChangedFlags(i3 | 1), this.f$4);
                break;
            case 3:
                ((Integer) obj2).getClass();
                SharedUIKt.InstalledServiceAppletTileItem((InstalledServiceAppletTileContentModel) obj4, (InstalledServiceAppletTileLayoutConfig.VisualPosition) obj3, this.f$3, (Composer) obj, Updater.updateChangedFlags(i3 | 1), this.f$4);
                break;
            case 4:
                PaycheckCircles paycheckCircles = (PaycheckCircles) obj4;
                Modifier modifier = (Modifier) obj3;
                ((Integer) obj2).getClass();
                paycheckCircles.UnknownCircle(Updater.updateChangedFlags(i3 | 1), this.f$4, (Composer) obj, modifier, this.f$3);
                break;
            case 5:
                ((Integer) obj2).getClass();
                BadgeNameKt.SheetEntry((String) obj4, (Function0) obj3, this.f$3, (Composer) obj, Updater.updateChangedFlags(i3 | 1), this.f$4);
                break;
            case 6:
                ((Integer) obj2).getClass();
                int updateChangedFlags2 = Updater.updateChangedFlags(i3 | 1);
                WebSectionKt.SyncContactsSection(this.f$3, (Function1) obj4, (Modifier) obj3, (Composer) obj, updateChangedFlags2, this.f$4);
                break;
            case 7:
                ((Integer) obj2).getClass();
                int updateChangedFlags3 = Updater.updateChangedFlags(i2 | 1);
                ChatSurveyKt.SatisfactionCell(this.f$1, (String) obj4, this.f$3, (Function1) obj3, (Composer) obj, updateChangedFlags3);
                break;
            case 8:
                ((Integer) obj2).getClass();
                DisclaimerTextKt.ClockOutConfirmationContent((Function0) obj4, (Function0) obj3, this.f$3, (Composer) obj, Updater.updateChangedFlags(i3 | 1), this.f$4);
                break;
            case 9:
                Composer composer = (Composer) obj;
                ((Integer) obj2).getClass();
                int updateChangedFlags4 = Updater.updateChangedFlags(i3 | 1);
                int i5 = this.f$4;
                ListItemKt.InstitutionIcon(updateChangedFlags4, i5, composer, (Modifier) obj3, (String) obj4, this.f$3);
                break;
            default:
                ((Integer) obj2).getClass();
                DropdownFieldUIKt.DropDown((LegacySessionConfig) obj4, (Modifier) obj3, this.f$3, (Composer) obj, Updater.updateChangedFlags(i3 | 1), this.f$4);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ PasscodeKt$$ExternalSyntheticLambda2(TextFieldState textFieldState, int i, Modifier modifier, boolean z, int i2) {
        this.$r8$classId = 0;
        this.f$0 = textFieldState;
        this.f$1 = i;
        this.f$2 = modifier;
        this.f$3 = z;
        this.f$4 = i2;
    }

    public /* synthetic */ PasscodeKt$$ExternalSyntheticLambda2(Modifier modifier, Object obj, boolean z, int i, int i2, int i3) {
        this.$r8$classId = i3;
        this.f$2 = modifier;
        this.f$0 = obj;
        this.f$3 = z;
        this.f$1 = i;
        this.f$4 = i2;
    }

    public /* synthetic */ PasscodeKt$$ExternalSyntheticLambda2(Object obj, Object obj2, boolean z, int i, int i2, int i3) {
        this.$r8$classId = i3;
        this.f$0 = obj;
        this.f$2 = obj2;
        this.f$3 = z;
        this.f$1 = i;
        this.f$4 = i2;
    }

    public /* synthetic */ PasscodeKt$$ExternalSyntheticLambda2(boolean z, Function1 function1, Modifier modifier, int i, int i2) {
        this.$r8$classId = 6;
        this.f$3 = z;
        this.f$0 = function1;
        this.f$2 = modifier;
        this.f$1 = i;
        this.f$4 = i2;
    }
}
