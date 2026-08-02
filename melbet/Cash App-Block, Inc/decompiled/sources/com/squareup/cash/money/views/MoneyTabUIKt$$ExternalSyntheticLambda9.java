package com.squareup.cash.money.views;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.TextUnit;
import androidx.room.Room;
import app.cash.broadway.presenter.SwipeContext;
import coil3.compose.AsyncImagePainter;
import com.google.maps.android.clustering.ClusterManager;
import com.google.maps.android.clustering.view.DefaultClusterRenderer;
import com.squareup.cash.investing.viewmodels.TransferStockViewModel;
import com.squareup.cash.invitations.InviteContactsViewModel;
import com.squareup.cash.money.viewmodels.MoneyTabEvent;
import com.squareup.cash.moneybot.viewmodels.MoneybotHomeViewEvent;
import com.squareup.cash.moneybot.viewmodels.chat.ChatCardViewModel;
import com.squareup.cash.moneybot.views.card.FocusedHeader;
import com.squareup.cash.onboarding.views.MediaLoadState;
import com.squareup.cash.paychecks.viewmodels.MultipleAllocationViewModel;
import com.squareup.cash.paymentpad.viewmodels.HomeViewEvent;
import com.squareup.cash.tabs.viewmodels.TabToolbarInternalViewEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final /* synthetic */ class MoneyTabUIKt$$ExternalSyntheticLambda9 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MutableState f$0;

    public /* synthetic */ MoneyTabUIKt$$ExternalSyntheticLambda9(int i, MutableState mutableState) {
        this.$r8$classId = i;
        this.f$0 = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        MutableState mutableState = this.f$0;
        switch (i) {
            case 0:
                ((Density) obj).getClass();
                break;
            case 1:
                mutableState.setValue((TransferStockViewModel.Content.FullScreenContent.DialogContent) obj);
                break;
            case 2:
                InviteContactsViewModel.Contact contact = (InviteContactsViewModel.Contact) obj;
                contact.getClass();
                ((Function1) mutableState.getValue()).invoke(contact);
                break;
            case 3:
                ClusterManager clusterManager = (ClusterManager) obj;
                clusterManager.getClass();
                DefaultClusterRenderer defaultClusterRenderer = clusterManager.mRenderer;
                if (defaultClusterRenderer == null) {
                    defaultClusterRenderer = null;
                }
                if (defaultClusterRenderer != null) {
                    defaultClusterRenderer.mMinClusterSize = 2;
                }
                mutableState.setValue(clusterManager);
                break;
            case 4:
                mutableState.setValue(new IntSize(((IntSize) obj).packedValue));
                break;
            case 5:
                SwipeContext swipeContext = (SwipeContext) obj;
                swipeContext.getClass();
                mutableState.setValue(Boolean.valueOf(swipeContext.usedSwipeGesture));
                break;
            case 6:
                TabToolbarInternalViewEvent tabToolbarInternalViewEvent = (TabToolbarInternalViewEvent) obj;
                tabToolbarInternalViewEvent.getClass();
                ((Function1) mutableState.getValue()).invoke(new MoneyTabEvent.TabToolbarEvent(tabToolbarInternalViewEvent));
                break;
            case 7:
                mutableState.setValue((FocusedHeader) obj);
                break;
            case 8:
                mutableState.setValue((ChatCardViewModel.InsightCard.Chart.Legend) obj);
                break;
            case 9:
                mutableState.setValue((FocusedHeader) obj);
                break;
            case 10:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                mutableState.setValue(bool);
                break;
            case 11:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                mutableState.setValue(bool2);
                break;
            case 12:
                String str = (String) obj;
                str.getClass();
                mutableState.setValue(Boolean.valueOf(str.length() > 0));
                break;
            case 13:
                String str2 = (String) obj;
                str2.getClass();
                mutableState.setValue(Boolean.valueOf(str2.length() > 0));
                break;
            case 14:
                TabToolbarInternalViewEvent tabToolbarInternalViewEvent2 = (TabToolbarInternalViewEvent) obj;
                tabToolbarInternalViewEvent2.getClass();
                ((Function1) mutableState.getValue()).invoke(new MoneybotHomeViewEvent.TabToolbarEvent(tabToolbarInternalViewEvent2));
                break;
            case 15:
                mutableState.setValue(new IntSize(((IntSize) obj).packedValue));
                break;
            case 16:
                String str3 = (String) obj;
                str3.getClass();
                mutableState.setValue(str3);
                break;
            case 17:
                mutableState.setValue(Integer.valueOf((int) (((IntSize) obj).packedValue >> 32)));
                break;
            case 18:
                TextLayoutResult textLayoutResult = (TextLayoutResult) obj;
                textLayoutResult.getClass();
                mutableState.setValue(Boolean.valueOf(textLayoutResult.multiParagraph.lineCount > 2));
                break;
            case 19:
                TextFieldValue textFieldValue = (TextFieldValue) obj;
                textFieldValue.getClass();
                mutableState.setValue(textFieldValue);
                break;
            case 20:
                TextFieldValue textFieldValue2 = (TextFieldValue) obj;
                textFieldValue2.getClass();
                mutableState.setValue(textFieldValue2);
                break;
            case 21:
                TextFieldValue textFieldValue3 = (TextFieldValue) obj;
                textFieldValue3.getClass();
                mutableState.setValue(textFieldValue3);
                break;
            case 22:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                mutableState.setValue(bool3);
                break;
            case 23:
                ((AsyncImagePainter.State.Success) obj).getClass();
                mutableState.setValue(MediaLoadState.Loaded);
                break;
            case 24:
                ((AsyncImagePainter.State.Error) obj).getClass();
                mutableState.setValue(MediaLoadState.Failed);
                break;
            case 25:
                Boolean bool4 = (Boolean) obj;
                bool4.booleanValue();
                mutableState.setValue(bool4);
                break;
            case 26:
                MultipleAllocationViewModel.Active active = (MultipleAllocationViewModel.Active) obj;
                active.getClass();
                mutableState.setValue(active);
                break;
            case 27:
                SwipeContext swipeContext2 = (SwipeContext) obj;
                swipeContext2.getClass();
                mutableState.setValue(Boolean.valueOf(swipeContext2.usedSwipeGesture));
                break;
            case 28:
                TabToolbarInternalViewEvent tabToolbarInternalViewEvent3 = (TabToolbarInternalViewEvent) obj;
                tabToolbarInternalViewEvent3.getClass();
                ((Function1) mutableState.getValue()).invoke(new HomeViewEvent.TabToolbarEvent(tabToolbarInternalViewEvent3));
                break;
            default:
                TextLayoutResult textLayoutResult2 = (TextLayoutResult) obj;
                textLayoutResult2.getClass();
                if (textLayoutResult2.getHasVisualOverflow()) {
                    mutableState.setValue(new TextUnit(Room.pack(4294967296L, TextUnit.m1059getValueimpl(((TextUnit) mutableState.getValue()).packedValue) - 1.0f)));
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
