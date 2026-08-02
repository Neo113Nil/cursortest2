package com.braze.ui;

import android.content.ClipData;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.AnnotatedString;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.sqldelight.driver.android.AndroidStatement;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.braze.BrazeUser;
import com.braze.ui.actions.brazeactions.steps.AddToCustomAttributeArrayStep;
import com.squareup.cash.arcade.components.CopyCodeState;
import com.squareup.cash.mooncake.components.MooncakeEmptyView;
import com.squareup.cash.overlays.OverlayKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final /* synthetic */ class UserJavascriptInterfaceBase$$ExternalSyntheticLambda5 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ String f$1;

    public /* synthetic */ UserJavascriptInterfaceBase$$ExternalSyntheticLambda5(String str, String str2, int i) {
        this.$r8$classId = i;
        this.f$0 = str;
        this.f$1 = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit addAlias$lambda$0;
        Unit removeFromCustomAttributeArray$lambda$0;
        Unit addToCustomAttributeArray$lambda$0;
        Unit run$lambda$0;
        int i = this.$r8$classId;
        String str = this.f$1;
        String str2 = this.f$0;
        switch (i) {
            case 0:
                addAlias$lambda$0 = UserJavascriptInterfaceBase.addAlias$lambda$0(str2, str, (BrazeUser) obj);
                break;
            case 1:
                SemanticsPropertiesKt.setContentDescription((SemanticsPropertyReceiver) obj, str2 + ", " + str);
                break;
            case 2:
                SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver.getClass();
                SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, CollectionsKt.joinToString$default(ArraysKt___ArraysKt.filterNotNull(new String[]{str2, str}), ". ", null, null, 0, null, null, 62));
                break;
            case 3:
                SemanticsPropertyReceiver semanticsPropertyReceiver2 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver2.getClass();
                SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver2, CollectionsKt.joinToString$default(ArraysKt___ArraysKt.filterNotNull(new String[]{str2, str}), ". ", null, null, 0, null, null, 62));
                break;
            case 4:
                removeFromCustomAttributeArray$lambda$0 = UserJavascriptInterfaceBase.removeFromCustomAttributeArray$lambda$0(str2, str, (BrazeUser) obj);
                break;
            case 5:
                addToCustomAttributeArray$lambda$0 = UserJavascriptInterfaceBase.addToCustomAttributeArray$lambda$0(str2, str, (BrazeUser) obj);
                break;
            case 6:
                run$lambda$0 = AddToCustomAttributeArrayStep.run$lambda$0(str2, str, (BrazeUser) obj);
                break;
            case 7:
                CopyCodeState copyCodeState = (CopyCodeState) obj;
                copyCodeState.getClass();
                if (str2 != null) {
                    str = str2;
                }
                str.getClass();
                copyCodeState.clipboardManager.getClipboardManager().setPrimaryClip(ClipData.newPlainText("plain text", OverlayKt.convertToCharSequence(new AnnotatedString(str))));
                break;
            case 8:
                SemanticsPropertyReceiver semanticsPropertyReceiver3 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver3.getClass();
                SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver3, str2);
                SemanticsPropertiesKt.setText(semanticsPropertyReceiver3, new AnnotatedString(str));
                SemanticsPropertiesKt.setTraversalIndex(semanticsPropertyReceiver3, RecyclerView.DECELERATION_RATE);
                break;
            case 9:
                SemanticsPropertyReceiver semanticsPropertyReceiver4 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver4.getClass();
                SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver4, str2 + ", " + str);
                SemanticsPropertiesKt.m950setRolekuIjeqM(semanticsPropertyReceiver4, 0);
                break;
            case 10:
                Request$Priority$EnumUnboxingLocalUtility.m((AndroidStatement) obj, 0, str2, 1, str);
                break;
            case 11:
                Request$Priority$EnumUnboxingLocalUtility.m((AndroidStatement) obj, 0, str2, 1, str);
                break;
            case 12:
                Request$Priority$EnumUnboxingLocalUtility.m((AndroidStatement) obj, 0, str2, 1, str);
                break;
            case 13:
                Request$Priority$EnumUnboxingLocalUtility.m((AndroidStatement) obj, 0, str2, 1, str);
                break;
            case 14:
                Request$Priority$EnumUnboxingLocalUtility.m((AndroidStatement) obj, 0, str2, 1, str);
                break;
            case 15:
                Request$Priority$EnumUnboxingLocalUtility.m((AndroidStatement) obj, 0, str2, 1, str);
                break;
            case 16:
                Request$Priority$EnumUnboxingLocalUtility.m((AndroidStatement) obj, 0, str2, 1, str);
                break;
            case 17:
                Request$Priority$EnumUnboxingLocalUtility.m((AndroidStatement) obj, 0, str2, 1, str);
                break;
            case 18:
                Request$Priority$EnumUnboxingLocalUtility.m((AndroidStatement) obj, 0, str2, 1, str);
                break;
            case 19:
                MooncakeEmptyView mooncakeEmptyView = (MooncakeEmptyView) obj;
                mooncakeEmptyView.getClass();
                mooncakeEmptyView.setTitle(str2);
                mooncakeEmptyView.setMessage(str);
                break;
            case 20:
                SemanticsPropertyReceiver semanticsPropertyReceiver5 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver5.getClass();
                SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver5, str2 + ": " + str);
                break;
            case 21:
                Request$Priority$EnumUnboxingLocalUtility.m((AndroidStatement) obj, 0, str2, 1, str);
                break;
            case 22:
                Request$Priority$EnumUnboxingLocalUtility.m((AndroidStatement) obj, 0, str2, 1, str);
                break;
            case 23:
                Request$Priority$EnumUnboxingLocalUtility.m((AndroidStatement) obj, 0, str2, 1, str);
                break;
            case 24:
                SemanticsPropertyReceiver semanticsPropertyReceiver6 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver6.getClass();
                SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver6, str2);
                if (str != null) {
                    SemanticsPropertiesKt.setStateDescription(semanticsPropertyReceiver6, str);
                }
                break;
            case 25:
                SemanticsPropertyReceiver semanticsPropertyReceiver7 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver7.getClass();
                SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver7, str2 + ", " + str);
                SemanticsPropertiesKt.m950setRolekuIjeqM(semanticsPropertyReceiver7, 0);
                break;
            case 26:
                AndroidStatement androidStatement = (AndroidStatement) obj;
                Request$Priority$EnumUnboxingLocalUtility.m(androidStatement, 0, str2, 1, str);
                androidStatement.bindString(2, str2);
                androidStatement.bindString(3, str2);
                androidStatement.bindString(4, str2);
                break;
            case 27:
                AndroidStatement androidStatement2 = (AndroidStatement) obj;
                Request$Priority$EnumUnboxingLocalUtility.m(androidStatement2, 0, str2, 1, str);
                androidStatement2.bindBoolean(2, Boolean.TRUE);
                androidStatement2.bindBoolean(3, Boolean.FALSE);
                androidStatement2.bindString(4, str2);
                androidStatement2.bindString(5, str2);
                androidStatement2.bindString(6, str2);
                break;
            default:
                AndroidStatement androidStatement3 = (AndroidStatement) obj;
                Request$Priority$EnumUnboxingLocalUtility.m(androidStatement3, 0, str2, 1, str);
                androidStatement3.bindString(2, str2);
                androidStatement3.bindString(3, str2);
                androidStatement3.bindString(4, str2);
                break;
        }
        return Unit.INSTANCE;
    }
}
