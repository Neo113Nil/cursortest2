package com.braze.ui;

import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import app.cash.broadway.screen.AskedQuestion;
import app.cash.sqldelight.driver.android.AndroidStatement;
import com.braze.BrazeUser;
import com.braze.ui.actions.brazeactions.steps.AddToSubscriptionGroupStep;
import com.braze.ui.actions.brazeactions.steps.RemoveFromSubscriptionGroupStep;
import com.squareup.cash.arcade.components.cell.RealCellActivityAccessoryButtonScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final /* synthetic */ class UserJavascriptInterfaceBase$$ExternalSyntheticLambda4 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String f$0;

    public /* synthetic */ UserJavascriptInterfaceBase$$ExternalSyntheticLambda4(String str, int i) {
        this.$r8$classId = i;
        this.f$0 = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit email$lambda$0;
        Unit language$lambda$0;
        Unit addToSubscriptionGroup$lambda$0;
        Unit removeFromSubscriptionGroup$lambda$0;
        Unit country$lambda$0;
        Unit firstName$lambda$0;
        Unit homeCity$lambda$0;
        Unit phoneNumber$lambda$0;
        Unit lineId$lambda$0;
        Unit lastName$lambda$0;
        Unit run$lambda$0;
        Unit run$lambda$02;
        int i = this.$r8$classId;
        String str = this.f$0;
        switch (i) {
            case 0:
                email$lambda$0 = UserJavascriptInterfaceBase.setEmail$lambda$0(str, (BrazeUser) obj);
                break;
            case 1:
                language$lambda$0 = UserJavascriptInterfaceBase.setLanguage$lambda$0(str, (BrazeUser) obj);
                break;
            case 2:
                addToSubscriptionGroup$lambda$0 = UserJavascriptInterfaceBase.addToSubscriptionGroup$lambda$0(str, (BrazeUser) obj);
                break;
            case 3:
                removeFromSubscriptionGroup$lambda$0 = UserJavascriptInterfaceBase.removeFromSubscriptionGroup$lambda$0(str, (BrazeUser) obj);
                break;
            case 4:
                country$lambda$0 = UserJavascriptInterfaceBase.setCountry$lambda$0(str, (BrazeUser) obj);
                break;
            case 5:
                firstName$lambda$0 = UserJavascriptInterfaceBase.setFirstName$lambda$0(str, (BrazeUser) obj);
                break;
            case 6:
                homeCity$lambda$0 = UserJavascriptInterfaceBase.setHomeCity$lambda$0(str, (BrazeUser) obj);
                break;
            case 7:
                phoneNumber$lambda$0 = UserJavascriptInterfaceBase.setPhoneNumber$lambda$0(str, (BrazeUser) obj);
                break;
            case 8:
                lineId$lambda$0 = UserJavascriptInterfaceBase.setLineId$lambda$0(str, (BrazeUser) obj);
                break;
            case 9:
                lastName$lambda$0 = UserJavascriptInterfaceBase.setLastName$lambda$0(str, (BrazeUser) obj);
                break;
            case 10:
                run$lambda$0 = AddToSubscriptionGroupStep.run$lambda$0(str, (BrazeUser) obj);
                break;
            case 11:
                run$lambda$02 = RemoveFromSubscriptionGroupStep.run$lambda$0(str, (BrazeUser) obj);
                break;
            case 12:
                ((RealCellActivityAccessoryButtonScope) obj).getClass();
                break;
            case 13:
                SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver.getClass();
                SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
                break;
            case 14:
                AndroidStatement androidStatement = (AndroidStatement) obj;
                androidStatement.getClass();
                androidStatement.bindString(0, str);
                break;
            case 15:
                AndroidStatement androidStatement2 = (AndroidStatement) obj;
                androidStatement2.getClass();
                androidStatement2.bindString(0, str);
                break;
            case 16:
                AskedQuestion askedQuestion = (AskedQuestion) obj;
                askedQuestion.getClass();
                break;
            case 17:
                SemanticsPropertyReceiver semanticsPropertyReceiver2 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver2.getClass();
                SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver2, str);
                break;
            case 18:
                AndroidStatement androidStatement3 = (AndroidStatement) obj;
                androidStatement3.getClass();
                androidStatement3.bindString(0, str);
                break;
            case 19:
                AndroidStatement androidStatement4 = (AndroidStatement) obj;
                androidStatement4.getClass();
                androidStatement4.bindString(0, str);
                break;
            case 20:
                AndroidStatement androidStatement5 = (AndroidStatement) obj;
                androidStatement5.getClass();
                androidStatement5.bindString(0, str);
                break;
            case 21:
                AndroidStatement androidStatement6 = (AndroidStatement) obj;
                androidStatement6.getClass();
                androidStatement6.bindString(0, str);
                break;
            case 22:
                AndroidStatement androidStatement7 = (AndroidStatement) obj;
                androidStatement7.getClass();
                androidStatement7.bindString(0, str);
                break;
            case 23:
                AndroidStatement androidStatement8 = (AndroidStatement) obj;
                androidStatement8.getClass();
                androidStatement8.bindString(0, str);
                break;
            case 24:
                AndroidStatement androidStatement9 = (AndroidStatement) obj;
                androidStatement9.getClass();
                androidStatement9.bindString(0, str);
                break;
            case 25:
                AndroidStatement androidStatement10 = (AndroidStatement) obj;
                androidStatement10.getClass();
                androidStatement10.bindString(0, str);
                break;
            case 26:
                AndroidStatement androidStatement11 = (AndroidStatement) obj;
                androidStatement11.getClass();
                androidStatement11.bindString(0, str);
                break;
            case 27:
                AndroidStatement androidStatement12 = (AndroidStatement) obj;
                androidStatement12.getClass();
                androidStatement12.bindString(0, str);
                break;
            case 28:
                AndroidStatement androidStatement13 = (AndroidStatement) obj;
                androidStatement13.getClass();
                androidStatement13.bindString(0, str);
                break;
            default:
                AndroidStatement androidStatement14 = (AndroidStatement) obj;
                androidStatement14.getClass();
                androidStatement14.bindString(0, str);
                break;
        }
        return Unit.INSTANCE;
    }
}
