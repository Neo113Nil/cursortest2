package com.squareup.cash.money.views;

import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import app.cash.broadway.screen.AskedQuestion;
import com.google.android.gms.internal.mlkit_genai_prompt.zzabx;
import com.squareup.cash.activity.presenters.ActivityFeedCallbackEvent$RefreshFeed;
import com.squareup.cash.money.privacy.BalancePrivacy$ObfuscationMask$Companion;
import com.squareup.cash.money.privacy.RealBalancePrivacy$$ExternalSyntheticLambda1;
import com.squareup.cash.moneybot.backend.api.model.chat.Message;
import com.squareup.cash.moneybot.presenters.plugins.SavedSelectedInlineContentValue;
import com.squareup.cash.moneybot.screens.MoneybotAmountInputScreen;
import com.squareup.cash.moneybot.screens.MoneybotFeedbackScreen;
import com.squareup.cash.moneybot.screens.MoneybotStaticPickerScreen;
import com.squareup.cash.moneybot.screens.MoneybotTextInputScreen;
import com.squareup.cash.moneybot.viewmodels.plugins.ActionCardViewEvent;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final /* synthetic */ class MoneyTabUIKt$$ExternalSyntheticLambda13 implements Function1 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ MoneyTabUIKt$$ExternalSyntheticLambda13(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                ((SemanticsPropertyReceiver) obj).getClass();
                return Unit.INSTANCE;
            case 1:
                SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver.getClass();
                SemanticsPropertiesKt.heading(semanticsPropertyReceiver);
                return Unit.INSTANCE;
            case 2:
                SemanticsPropertyReceiver semanticsPropertyReceiver2 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver2.getClass();
                SemanticsPropertiesKt.heading(semanticsPropertyReceiver2);
                return Unit.INSTANCE;
            case 3:
                SemanticsPropertyReceiver semanticsPropertyReceiver3 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver3.getClass();
                SemanticsPropertiesKt.heading(semanticsPropertyReceiver3);
                return Unit.INSTANCE;
            case 4:
                ((SemanticsPropertyReceiver) obj).getClass();
                return Unit.INSTANCE;
            case 5:
                List list = (List) obj;
                return Boolean.valueOf(list != null && (list.isEmpty() ^ true));
            case 6:
                return ((Boolean) obj).booleanValue() ? new RealBalancePrivacy$$ExternalSyntheticLambda1(0) : BalancePrivacy$ObfuscationMask$Companion.Empty;
            case 7:
                ((SemanticsPropertyReceiver) obj).getClass();
                return Unit.INSTANCE;
            case 8:
                ((SemanticsPropertyReceiver) obj).getClass();
                return Unit.INSTANCE;
            case 9:
                ((SemanticsPropertyReceiver) obj).getClass();
                return Unit.INSTANCE;
            case 10:
                ((SemanticsPropertyReceiver) obj).getClass();
                return Unit.INSTANCE;
            case 11:
                SemanticsPropertyReceiver semanticsPropertyReceiver4 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver4.getClass();
                SemanticsPropertiesKt.heading(semanticsPropertyReceiver4);
                return Unit.INSTANCE;
            case 12:
                SemanticsPropertyReceiver semanticsPropertyReceiver5 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver5.getClass();
                SemanticsPropertiesKt.setTraversalGroup(semanticsPropertyReceiver5);
                return Unit.INSTANCE;
            case 13:
                SemanticsPropertyReceiver semanticsPropertyReceiver6 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver6.getClass();
                SemanticsPropertiesKt.heading(semanticsPropertyReceiver6);
                return Unit.INSTANCE;
            case 14:
                ((SemanticsPropertyReceiver) obj).getClass();
                return Unit.INSTANCE;
            case 15:
                ((Long) obj).longValue();
                return Unit.INSTANCE;
            case 16:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                return entry.getKey() + " (" + entry.getValue() + " points)";
            case 17:
                ((ActionCardViewEvent) obj).getClass();
                return Unit.INSTANCE;
            case 18:
                ((String) obj).getClass();
                return Unit.INSTANCE;
            case 19:
                ((ActivityFeedCallbackEvent$RefreshFeed) obj).getClass();
                return Unit.INSTANCE;
            case 20:
                Message.TextMessage textMessage = (Message.TextMessage) obj;
                textMessage.getClass();
                return Boolean.valueOf(!textMessage.hiddenByServer && textMessage.role == Message.Role.ROLE_ASSISTANT);
            case 21:
                Message.TextMessage textMessage2 = (Message.TextMessage) obj;
                textMessage2.getClass();
                return zzabx.getEscapedText(textMessage2);
            case 22:
                AskedQuestion askedQuestion = (AskedQuestion) obj;
                askedQuestion.getClass();
                return new MoneybotFeedbackScreen(askedQuestion);
            case 23:
                throw Boxes$$ExternalSyntheticOutline1.m(obj);
            case 24:
                throw Boxes$$ExternalSyntheticOutline1.m(obj);
            case 25:
                throw Boxes$$ExternalSyntheticOutline1.m(obj);
            case 26:
                AskedQuestion askedQuestion2 = (AskedQuestion) obj;
                askedQuestion2.getClass();
                return new MoneybotTextInputScreen(askedQuestion2);
            case 27:
                AskedQuestion askedQuestion3 = (AskedQuestion) obj;
                askedQuestion3.getClass();
                return new MoneybotAmountInputScreen(askedQuestion3);
            case 28:
                AskedQuestion askedQuestion4 = (AskedQuestion) obj;
                askedQuestion4.getClass();
                return new MoneybotStaticPickerScreen(askedQuestion4);
            default:
                ArrayList<SavedSelectedInlineContentValue> arrayList = (ArrayList) obj;
                arrayList.getClass();
                int mapCapacity = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
                if (mapCapacity < 16) {
                    mapCapacity = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(mapCapacity);
                for (SavedSelectedInlineContentValue savedSelectedInlineContentValue : arrayList) {
                    linkedHashMap.put(savedSelectedInlineContentValue.placeholderKey, savedSelectedInlineContentValue.value);
                }
                return linkedHashMap;
        }
    }
}
