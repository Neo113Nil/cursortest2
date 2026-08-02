package com.squareup.cash.profile.views.personal;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.input.TextFieldValue;
import com.squareup.cash.account.settings.viewmodels.PersonalInfoSectionViewEvent;
import com.squareup.cash.account.settings.viewmodels.PersonalScreenViewEvent;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpayAppletHomeContentViewModel;
import com.squareup.cash.afterpayapplet.viewmodels.viewevents.AfterpayAppletHomeViewEvent;
import com.squareup.cash.moneybot.viewmodels.chat.MoneybotChatViewEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final /* synthetic */ class PersonalInfoViewKt$$ExternalSyntheticLambda9 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ PersonalInfoViewKt$$ExternalSyntheticLambda9(Function1 function1, Function1 function12, int i) {
        this.$r8$classId = i;
        this.f$0 = function1;
        this.f$1 = function12;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        Function1 function1 = this.f$1;
        Function1 function12 = this.f$0;
        switch (i) {
            case 0:
                PersonalInfoSectionViewEvent personalInfoSectionViewEvent = (PersonalInfoSectionViewEvent) obj;
                personalInfoSectionViewEvent.getClass();
                if (personalInfoSectionViewEvent instanceof PersonalInfoSectionViewEvent.AddressClick) {
                    function12.invoke(PersonalScreenViewEvent.ReplaceAddress.INSTANCE);
                } else {
                    function1.invoke(personalInfoSectionViewEvent);
                }
                break;
            case 1:
                AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.HeroBalanceSection.PaymentCalendar.CalendarDate calendarDate = (AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.HeroBalanceSection.PaymentCalendar.CalendarDate) obj;
                calendarDate.getClass();
                function12.invoke(calendarDate);
                function1.invoke(new AfterpayAppletHomeViewEvent.AfterpayAppletBalanceHeroSectionEvent.DateTapped(calendarDate));
                break;
            default:
                TextFieldValue textFieldValue = (TextFieldValue) obj;
                textFieldValue.getClass();
                AnnotatedString annotatedString = textFieldValue.annotatedString;
                function12.invoke(annotatedString.text);
                function1.invoke(new MoneybotChatViewEvent.ComposerTextChanged(annotatedString.text));
                break;
        }
        return Unit.INSTANCE;
    }
}
