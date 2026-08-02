package com.squareup.cash.arcade.components;

import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.AnnotatedString;
import app.cash.sqldelight.driver.android.AndroidStatement;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.presenters.VerifyAliasPresenter;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final /* synthetic */ class BadgeKt$$ExternalSyntheticLambda3 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String f$0;

    public /* synthetic */ BadgeKt$$ExternalSyntheticLambda3(String str, int i) {
        this.$r8$classId = i;
        this.f$0 = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        String str = this.f$0;
        switch (i) {
            case 0:
                SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver.getClass();
                SemanticsPropertiesKt.setText(semanticsPropertyReceiver, new AnnotatedString(str));
                break;
            case 1:
                AndroidStatement androidStatement = (AndroidStatement) obj;
                androidStatement.getClass();
                androidStatement.bindString(0, str);
                break;
            case 2:
                AndroidStatement androidStatement2 = (AndroidStatement) obj;
                androidStatement2.getClass();
                androidStatement2.bindString(0, str);
                break;
            case 3:
                SemanticsPropertyReceiver semanticsPropertyReceiver2 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver2.getClass();
                SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver2, str);
                SemanticsPropertiesKt.m950setRolekuIjeqM(semanticsPropertyReceiver2, 0);
                break;
            case 4:
                SemanticsPropertyReceiver semanticsPropertyReceiver3 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver3.getClass();
                SemanticsPropertiesKt.setText(semanticsPropertyReceiver3, new AnnotatedString(str));
                break;
            case 5:
                SemanticsPropertyReceiver semanticsPropertyReceiver4 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver4.getClass();
                SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver4, str != null ? str : "");
                break;
            case 6:
                SemanticsPropertyReceiver semanticsPropertyReceiver5 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver5.getClass();
                SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver5, str != null ? str : "");
                break;
            case 7:
                SemanticsPropertyReceiver semanticsPropertyReceiver6 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver6.getClass();
                SemanticsPropertiesKt.setTestTag(semanticsPropertyReceiver6, "amountTextTag");
                SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver6, str);
                break;
            case 8:
                SemanticsPropertyReceiver semanticsPropertyReceiver7 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver7.getClass();
                SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver7, str);
                break;
            case 9:
                SemanticsPropertyReceiver semanticsPropertyReceiver8 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver8.getClass();
                SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver8, str);
                break;
            case 10:
                SemanticsPropertyReceiver semanticsPropertyReceiver9 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver9.getClass();
                SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver9, str);
                break;
            case 11:
                SemanticsPropertyReceiver semanticsPropertyReceiver10 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver10.getClass();
                SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver10, str);
                break;
            case 12:
                AndroidStatement androidStatement3 = (AndroidStatement) obj;
                androidStatement3.getClass();
                androidStatement3.bindString(0, str);
                break;
            case 13:
                VerifyAliasPresenter.State state = (VerifyAliasPresenter.State) obj;
                state.getClass();
                break;
            case 14:
                SemanticsPropertyReceiver semanticsPropertyReceiver11 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver11.getClass();
                SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver11, str);
                SemanticsPropertiesKt.m950setRolekuIjeqM(semanticsPropertyReceiver11, 0);
                break;
            case 15:
                SemanticsPropertyReceiver semanticsPropertyReceiver12 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver12.getClass();
                SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver12, str);
                break;
            case 16:
                AndroidStatement androidStatement4 = (AndroidStatement) obj;
                androidStatement4.getClass();
                androidStatement4.bindString(0, str);
                break;
            case 17:
                AndroidStatement androidStatement5 = (AndroidStatement) obj;
                androidStatement5.getClass();
                androidStatement5.bindString(0, str);
                break;
            case 18:
                AndroidStatement androidStatement6 = (AndroidStatement) obj;
                androidStatement6.getClass();
                androidStatement6.bindString(0, str);
                break;
            case 19:
                AndroidStatement androidStatement7 = (AndroidStatement) obj;
                androidStatement7.getClass();
                androidStatement7.bindString(0, str);
                break;
            case 20:
                SemanticsPropertyReceiver semanticsPropertyReceiver13 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver13.getClass();
                SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver13, str);
                break;
            case 21:
                AndroidStatement androidStatement8 = (AndroidStatement) obj;
                androidStatement8.getClass();
                androidStatement8.bindString(0, str);
                androidStatement8.bindLong(1, 9L);
                break;
            case 22:
                AndroidStatement androidStatement9 = (AndroidStatement) obj;
                androidStatement9.getClass();
                androidStatement9.bindString(0, str);
                break;
            case 23:
                SemanticsPropertyReceiver semanticsPropertyReceiver14 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver14.getClass();
                if (str != null) {
                    SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver14, str);
                }
                break;
            case 24:
                SemanticsPropertyReceiver semanticsPropertyReceiver15 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver15.getClass();
                SemanticsPropertiesKt.m949setLiveRegionhR3wRGc(semanticsPropertyReceiver15, 0);
                SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver15, str);
                break;
            case 25:
                SemanticsPropertyReceiver semanticsPropertyReceiver16 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver16.getClass();
                SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver16, str);
                SemanticsPropertiesKt.m950setRolekuIjeqM(semanticsPropertyReceiver16, 5);
                break;
            case 26:
                BlockersData blockersData = (BlockersData) obj;
                blockersData.getClass();
                break;
            case 27:
                BlockersData blockersData2 = (BlockersData) obj;
                blockersData2.getClass();
                break;
            case 28:
                AndroidStatement androidStatement10 = (AndroidStatement) obj;
                androidStatement10.getClass();
                androidStatement10.bindString(0, str);
                break;
            default:
                AndroidStatement androidStatement11 = (AndroidStatement) obj;
                androidStatement11.getClass();
                androidStatement11.bindString(0, str);
                break;
        }
        return Unit.INSTANCE;
    }
}
