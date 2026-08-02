package com.squareup.cash.profile.views;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import androidx.camera.core.ImageAnalysis;
import androidx.camera.core.impl.utils.Threads;
import androidx.camera.core.impl.utils.futures.ChainingListenableFuture;
import androidx.camera.lifecycle.ProcessCameraProvider;
import androidx.camera.view.PreviewView;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.grid.LazyGridIntervalContent;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.AndroidImageBitmap;
import androidx.compose.ui.graphics.ReusableGraphicsLayerScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.LayoutNodeDrawScope;
import androidx.compose.ui.semantics.CustomAccessibilityAction;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Density;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.api.ApiResult;
import app.cash.local.presenters.LocalEditorialPresenter;
import app.cash.sqldelight.EnumColumnAdapter;
import app.cash.sqldelight.TransactionWrapper;
import app.cash.sqldelight.driver.android.AndroidStatement;
import coil3.ComponentRegistry;
import coil3.size.DimensionKt;
import com.mikepenz.markdown.compose.elements.MarkdownCheckBoxKt$MarkdownCheckBox$1;
import com.squareup.cash.R;
import com.squareup.cash.api.Aliases;
import com.squareup.cash.boost.db.RewardSlotQueries;
import com.squareup.cash.borrow.views.BorrowHomeKt$BorrowHome$lambda$1$0$$inlined$itemsIndexed$default$2;
import com.squareup.cash.borrow.views.BorrowHomeKt$BorrowHome$lambda$1$0$$inlined$itemsIndexed$default$3;
import com.squareup.cash.checks.VerifyCheckDepositPresenter$models$3$2;
import com.squareup.cash.db.WireAdapter;
import com.squareup.cash.db.contacts.AliasSyncState;
import com.squareup.cash.db2.BlockersConfig;
import com.squareup.cash.db2.InstrumentQueries;
import com.squareup.cash.db2.contacts.ContactQueries$$ExternalSyntheticLambda1;
import com.squareup.cash.directory_ui.views.SectionKt$sectionItemsIndexed$$inlined$itemsIndexed$default$4;
import com.squareup.cash.gps.db.GpsConfigQueries;
import com.squareup.cash.graphics.backend.gl.core.EglCore;
import com.squareup.cash.money.applets.common.viewmodels.PromotedAppletTileViewEvent$Click;
import com.squareup.cash.moneybot.genie.SwitchViewKt;
import com.squareup.cash.mooncake.screens.AlertDialogResult;
import com.squareup.cash.music.views.MusicViewKt$LoadedMusicContent$lambda$1$0$0$0$$inlined$items$default$3;
import com.squareup.cash.paychecks.viewmodels.MultipleAllocationViewModel;
import com.squareup.cash.paychecks.views.MultipleAllocationViewKt$$ExternalSyntheticLambda15;
import com.squareup.cash.payments.viewmodels.DialogViewModel;
import com.squareup.cash.payments.viewmodels.Element;
import com.squareup.cash.payments.viewmodels.NearbyPeopleOverflowSheetViewModel;
import com.squareup.cash.payments.viewmodels.PaymentConfigurationTitleViewModel;
import com.squareup.cash.payments.viewmodels.PaymentConfigurationViewModel;
import com.squareup.cash.payments.viewmodels.PersonalizePaymentRecipientViewEvent;
import com.squareup.cash.payments.viewmodels.PersonalizePaymentViewEvent;
import com.squareup.cash.payments.viewmodels.PersonalizePaymentViewEvent$DialogEvent$SendBasicPayment;
import com.squareup.cash.payments.viewmodels.PersonalizePaymentViewModel;
import com.squareup.cash.payments.viewmodels.Size;
import com.squareup.cash.payments.viewmodels.Text;
import com.squareup.cash.payments.viewmodels.TitleTapped;
import com.squareup.cash.payments.views.ItemCoordinates;
import com.squareup.cash.payments.views.MainPaymentViewKt$$ExternalSyntheticLambda25;
import com.squareup.cash.payments.views.ToViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.payments.views.composer.PaymentConfigurationTitleKt$$ExternalSyntheticLambda7;
import com.squareup.cash.payments.views.composer.Subject;
import com.squareup.cash.payments.views.coreflowsheet.AnimatedCornerShape;
import com.squareup.cash.pools.viewmodels.PoolMemberListViewModel;
import com.squareup.cash.pools.viewmodels.StartPoolViewEvent;
import com.squareup.cash.pools.viewmodels.StartPoolViewModel;
import com.squareup.cash.pools.views.PoolDetailsViewKt$$ExternalSyntheticLambda3;
import com.squareup.cash.pools.views.PoolListSectionKt$$ExternalSyntheticLambda2;
import com.squareup.cash.pools.views.PoolMemberListViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.prepurchasecashcard.viewmodels.PrepurchaseCashCardPlanningViewEvent;
import com.squareup.cash.prepurchasecashcard.viewmodels.PrepurchaseCashCardPlanningViewModel;
import com.squareup.cash.profile.devicemanager.viewmodels.DeviceManagerListViewModel;
import com.squareup.cash.profile.devicemanager.viewmodels.DeviceViewModel;
import com.squareup.cash.profile.devicemanager.views.DeviceManagerListViewKt;
import com.squareup.cash.profile.viewmodels.ContactMethodDetailsViewModel;
import com.squareup.cash.profile.viewmodels.ProfileNotificationsViewModel;
import com.squareup.cash.profile.views.notifications.ChannelListViewKt;
import com.squareup.cash.qrcodes.views.CameraXPreviewManager;
import com.squareup.cash.qrcodes.views.CameraXPreviewState;
import com.squareup.cash.recipients.data.RealCustomerStore;
import com.squareup.cash.recurring.db.RecurringPreferenceId;
import com.squareup.cash.recurring.db.RecurringPreferenceQueries;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.savings.applets.viewmodels.SavingsAppletTileViewModel;
import com.squareup.cash.savings.applets.views.SavingsAppletTile;
import com.squareup.cash.savings.backend.api.ActiveGoalProvider;
import com.squareup.cash.savings.backend.api.model.SavingsFolder;
import com.squareup.cash.savings.backend.real.PersistentActiveGoalStore;
import com.squareup.cash.savings.db.SavingsGoalLocalStatus;
import com.squareup.cash.savings.viewmodels.TransferringViewModel;
import com.squareup.cash.savings.views.CelebrationKt$$ExternalSyntheticLambda1;
import com.squareup.cash.sharesheet.ShareSheetViewKt$$ExternalSyntheticLambda1;
import com.squareup.cash.wallet.views.CardTransitionKt$$ExternalSyntheticLambda4;
import com.squareup.cash.work.views.shift.ShiftListContentKt$ShiftListContent$lambda$4$0$$inlined$items$3;
import com.squareup.protos.cash.piggybank.appapi.Get1099IntStatementsResponse;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.document.Document;
import com.squareup.protos.franklin.api.Region;
import com.squareup.protos.franklin.ui.BlockState;
import com.squareup.protos.franklin.ui.InvestmentEntityData;
import com.squareup.protos.franklin.ui.MerchantData;
import com.squareup.protos.franklin.ui.UiCustomer;
import com.squareup.scannerview.ScannerView;
import com.squareup.util.cash.ColorsKt;
import com.squareup.util.cash.ProtoDefaults;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.collections.immutable.ImmutableList;
import nl.dionsegijn.konfetti.core.Party;
import nl.dionsegijn.konfetti.core.Position;
import nl.dionsegijn.konfetti.core.models.Shape;
import nl.dionsegijn.konfetti.xml.image.DrawableImage;
import org.bouncycastle.asn1.cmc.BodyPartID;
import sqip.internal.CardEntryActivityController$$ExternalSyntheticLambda1;

/* loaded from: classes6.dex */
public final /* synthetic */ class OpenSourceKt$$ExternalSyntheticLambda11 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ OpenSourceKt$$ExternalSyntheticLambda11(Context context, CameraXPreviewManager cameraXPreviewManager) {
        this.$r8$classId = 18;
        this.f$1 = context;
        this.f$0 = cameraXPreviewManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0223  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        String str;
        int i;
        CurrencyCode currencyCode;
        final Image image;
        final Color color;
        String str2;
        String str3;
        String str4;
        int i2 = this.$r8$classId;
        int i3 = 27;
        int i4 = 29;
        int i5 = 6;
        int i6 = 28;
        int i7 = 8;
        int i8 = 4;
        int i9 = 15;
        int i10 = 3;
        int i11 = 1;
        Object obj2 = this.f$1;
        Object obj3 = this.f$0;
        switch (i2) {
            case 0:
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) obj3;
                LayoutCoordinates layoutCoordinates = (LayoutCoordinates) obj;
                layoutCoordinates.getClass();
                long mo838getSizeYbymL2g = layoutCoordinates.mo838getSizeYbymL2g();
                int i12 = (int) (mo838getSizeYbymL2g >> 32);
                int i13 = (int) (mo838getSizeYbymL2g & BodyPartID.bodyIdMax);
                Party party = (Party) ref$ObjectRef.element;
                Position.Absolute absolute = new Position.Absolute(Float.intBitsToFloat((int) (layoutCoordinates.mo841localToRootMKHz9U(0L) >> 32)) + ((i12 / 2) - 20), Float.intBitsToFloat((int) (layoutCoordinates.mo841localToRootMKHz9U(0L) & BodyPartID.bodyIdMax)) + (i13 / 2));
                Drawable drawable = DimensionKt.getDrawable((Context) obj2, R.drawable.open_source_heartfetti);
                drawable.getClass();
                ref$ObjectRef.element = Party.copy$default(party, CollectionsKt__CollectionsJVMKt.listOf(new Shape.DrawableShape(new DrawableImage(drawable, i12, i13), true, true)), absolute, 15231);
                break;
            case 1:
                MultipleAllocationViewModel.Active.AllocationRow allocationRow = (MultipleAllocationViewModel.Active.AllocationRow) obj3;
                SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver.getClass();
                SemanticsPropertiesKt.m950setRolekuIjeqM(semanticsPropertyReceiver, 0);
                SemanticsPropertiesKt.onClick(semanticsPropertyReceiver, allocationRow.action.getAccessibilityDescriptor(), new MultipleAllocationViewKt$$ExternalSyntheticLambda15((Function1) obj2, allocationRow, 1));
                break;
            case 2:
                AndroidImageBitmap androidImageBitmap = (AndroidImageBitmap) obj3;
                State state = (State) obj2;
                LayoutNodeDrawScope layoutNodeDrawScope = (LayoutNodeDrawScope) obj;
                layoutNodeDrawScope.getClass();
                layoutNodeDrawScope.drawContent();
                float mo236toPx0680j_4 = layoutNodeDrawScope.mo236toPx0680j_4(240.0f);
                double d = mo236toPx0680j_4;
                float cos = (float) (Math.cos(((Number) state.getValue()).floatValue()) * d);
                float sin = (float) (Math.sin(((Number) state.getValue()).floatValue()) * d);
                float intBitsToFloat = (mo236toPx0680j_4 * 2.0f) + Float.intBitsToFloat((int) (layoutNodeDrawScope.canvasDrawScope.mo753getSizeNHjbRc() >> 32));
                float f = intBitsToFloat / 2.0f;
                long intBitsToFloat2 = (((int) (((Float.intBitsToFloat((int) (r5.mo753getSizeNHjbRc() >> 32)) / 2.0f) - f) + cos)) << 32) | (((int) (((Float.intBitsToFloat((int) (r5.mo753getSizeNHjbRc() & BodyPartID.bodyIdMax)) / 2.0f) - f) + sin)) & BodyPartID.bodyIdMax);
                long j = (int) intBitsToFloat;
                DrawScope.m739drawImageAZ2fEMs$default(layoutNodeDrawScope, androidImageBitmap, 0L, intBitsToFloat2, (j << 32) | (j & BodyPartID.bodyIdMax), RecyclerView.DECELERATION_RATE, null, 9, 0, 742);
                break;
            case 3:
                PaymentConfigurationTitleViewModel.TitleViewModel titleViewModel = (PaymentConfigurationTitleViewModel.TitleViewModel) obj3;
                Function1 function1 = (Function1) obj2;
                SemanticsPropertyReceiver semanticsPropertyReceiver2 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver2.getClass();
                SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver2, titleViewModel.accessibilityLabel);
                TitleTapped titleTapped = titleViewModel.action;
                if (titleTapped != null && (str = titleViewModel.accessibilityActionLabel) != null) {
                    ListBuilder createListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
                    createListBuilder.add(new CustomAccessibilityAction(str, new PaymentConfigurationTitleKt$$ExternalSyntheticLambda7(function1, titleTapped, 1)));
                    SemanticsPropertiesKt.setCustomActions(semanticsPropertyReceiver2, CollectionsKt__CollectionsJVMKt.build(createListBuilder));
                }
                break;
            case 4:
                Function0 function0 = (Function0) obj2;
                SemanticsPropertyReceiver semanticsPropertyReceiver3 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver3.getClass();
                String str5 = ((Subject) obj3).accessibilityActionLabel;
                if (str5 != null) {
                    ListBuilder createListBuilder2 = CollectionsKt__CollectionsJVMKt.createListBuilder();
                    createListBuilder2.add(new CustomAccessibilityAction(str5, new ToViewKt$$ExternalSyntheticLambda2(15, function0)));
                    SemanticsPropertiesKt.setCustomActions(semanticsPropertyReceiver3, CollectionsKt__CollectionsJVMKt.build(createListBuilder2));
                }
                break;
            case 5:
                LazyListScope lazyListScope = (LazyListScope) obj;
                lazyListScope.getClass();
                ArrayList arrayList = ((PaymentConfigurationViewModel.SelectStablecoinWithdrawalOption) obj3).rows;
                lazyListScope.items(arrayList.size(), new VerifyCheckDepositPresenter$models$3$2(i3, new MainPaymentViewKt$$ExternalSyntheticLambda25(i4), arrayList), new BorrowHomeKt$BorrowHome$lambda$1$0$$inlined$itemsIndexed$default$2(15, arrayList), new ComposableLambdaImpl(new BorrowHomeKt$BorrowHome$lambda$1$0$$inlined$itemsIndexed$default$3(arrayList, (Function1) obj2, i8), true, 802480018));
                break;
            case 6:
                ReusableGraphicsLayerScope reusableGraphicsLayerScope = (ReusableGraphicsLayerScope) obj;
                reusableGraphicsLayerScope.getClass();
                reusableGraphicsLayerScope.setAlpha(((AnimatedCornerShape) obj3).calculateDistanceFractionFromStatusBar((Density) obj2));
                break;
            case 7:
                LazyListScope lazyListScope2 = (LazyListScope) obj;
                lazyListScope2.getClass();
                List list = ((NearbyPeopleOverflowSheetViewModel) obj3).people;
                lazyListScope2.items(list.size(), new VerifyCheckDepositPresenter$models$3$2(i6, new PoolDetailsViewKt$$ExternalSyntheticLambda3(i7), list), new MusicViewKt$LoadedMusicContent$lambda$1$0$0$0$$inlined$items$default$3(list, 7), new ComposableLambdaImpl(new ShiftListContentKt$ShiftListContent$lambda$4$0$$inlined$items$3(17, (Function1) obj2, list), true, 802480018));
                break;
            case 8:
                Function1 function12 = (Function1) obj2;
                AlertDialogResult alertDialogResult = (AlertDialogResult) obj;
                alertDialogResult.getClass();
                if (((DialogViewModel) obj3) instanceof PersonalizePaymentViewModel.LoadedPersonalizePaymentMenu.ConfirmOfflinePaymentDialog) {
                    function12.invoke(alertDialogResult == AlertDialogResult.POSITIVE ? PersonalizePaymentViewEvent$DialogEvent$SendBasicPayment.INSTANCE : new PersonalizePaymentViewEvent.Send(EmptyList.INSTANCE));
                }
                break;
            case 9:
                ((Function1) obj3).invoke(new PersonalizePaymentViewEvent.RequestFocus((Text) obj2, false));
                break;
            case 10:
                Function1 function13 = (Function1) obj3;
                Element element = (Element) obj2;
                ItemCoordinates itemCoordinates = (ItemCoordinates) obj;
                itemCoordinates.getClass();
                long j2 = itemCoordinates.size;
                int i14 = (int) (j2 & BodyPartID.bodyIdMax);
                if (i14 > 0 && (i = (int) (j2 >> 32)) > 0) {
                    function13.invoke(new PersonalizePaymentRecipientViewEvent.TextMeasured((Text) element, new Size(i, i14)));
                }
                break;
            case 11:
                MutableState mutableState = (MutableState) obj2;
                LayoutNodeDrawScope layoutNodeDrawScope2 = (LayoutNodeDrawScope) obj;
                layoutNodeDrawScope2.getClass();
                layoutNodeDrawScope2.drawContent();
                DrawScope.m740drawImagegbVJVH8$default(layoutNodeDrawScope2, new AndroidImageBitmap((Bitmap) obj3), (Float.floatToRawIntBits(Float.intBitsToFloat((int) (((Offset) mutableState.getValue()).packedValue & BodyPartID.bodyIdMax)) - (r0.getHeight() / 2)) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (((Offset) mutableState.getValue()).packedValue >> 32))) << 32), RecyclerView.DECELERATION_RATE, null, 0, 60);
                break;
            case 12:
                PoolMemberListViewModel poolMemberListViewModel = (PoolMemberListViewModel) obj3;
                Function1 function14 = (Function1) obj2;
                LazyListScope lazyListScope3 = (LazyListScope) obj;
                lazyListScope3.getClass();
                LazyListScope.item$default(lazyListScope3, null, null, new ComposableLambdaImpl(new PoolMemberListViewKt$$ExternalSyntheticLambda5(i11, poolMemberListViewModel, function14), true, 388122175), 3);
                ImmutableList immutableList = poolMemberListViewModel.people;
                lazyListScope3.items(immutableList.size(), null, new MusicViewKt$LoadedMusicContent$lambda$1$0$0$0$$inlined$items$default$3(immutableList, 10), new ComposableLambdaImpl(new SectionKt$sectionItemsIndexed$$inlined$itemsIndexed$default$4(immutableList, function14, poolMemberListViewModel, 14), true, 802480018));
                break;
            case 13:
                Function1 function15 = (Function1) obj3;
                Long l = (Long) obj;
                l.getClass();
                Money money = ((StartPoolViewModel.Amount) obj2).amount;
                if (money == null || (currencyCode = money.currency_code) == null) {
                    currencyCode = CurrencyCode.USD;
                }
                function15.invoke(new StartPoolViewEvent.AmountChanged(new Money(l, currencyCode, 4)));
                break;
            case 14:
                ((Boolean) obj).getClass();
                ((Function1) obj3).invoke(new PrepurchaseCashCardPlanningViewEvent.SelectOption(((PrepurchaseCashCardPlanningViewModel.PrepurchaseCardPaymentPlanOptionsSheet.Option) obj2).identifier));
                break;
            case 15:
                DeviceManagerListViewModel deviceManagerListViewModel = (DeviceManagerListViewModel) obj3;
                Function1 function16 = (Function1) obj2;
                LazyListScope lazyListScope4 = (LazyListScope) obj;
                lazyListScope4.getClass();
                LazyListScope.item$default(lazyListScope4, null, null, new ComposableLambdaImpl(new PoolListSectionKt$$ExternalSyntheticLambda2(deviceManagerListViewModel, 25), true, -597847414), 3);
                boolean z = deviceManagerListViewModel.sections.size() == 1;
                for (DeviceManagerListViewModel.DeviceListSection deviceListSection : deviceManagerListViewModel.sections) {
                    if (!deviceListSection.devices.isEmpty()) {
                        LazyListScope.item$default(lazyListScope4, null, null, new ComposableLambdaImpl(new PoolListSectionKt$$ExternalSyntheticLambda2(deviceListSection, 23), true, 1488476076), 3);
                        Iterator it = deviceListSection.devices.iterator();
                        while (it.hasNext()) {
                            DeviceViewModel deviceViewModel = (DeviceViewModel) it.next();
                            LazyListScope.item$default(lazyListScope4, null, null, new ComposableLambdaImpl(new ProfileKt$$ExternalSyntheticLambda1(26, (Object) deviceViewModel, (Object) function16), true, 1887476302), 3);
                            if (deviceViewModel.isThisDevice) {
                                LazyListScope.item$default(lazyListScope4, null, null, DeviceManagerListViewKt.lambda$1782415465, 3);
                            }
                        }
                        DeviceManagerListViewModel.DeviceAction deviceAction = deviceListSection.action;
                        if (deviceAction != null) {
                            LazyListScope.item$default(lazyListScope4, null, null, new ComposableLambdaImpl(new ProfileKt$$ExternalSyntheticLambda1(i3, (Object) deviceAction, function16), true, -2042332057), 3);
                        }
                    }
                }
                if (!z) {
                    LazyListScope.item$default(lazyListScope4, null, null, DeviceManagerListViewKt.f583lambda$848800731, 3);
                }
                LazyListScope.item$default(lazyListScope4, null, null, DeviceManagerListViewKt.lambda$2012278529, 3);
                break;
            case 16:
                ContactMethodDetailsViewModel contactMethodDetailsViewModel = (ContactMethodDetailsViewModel) obj3;
                Function1 function17 = (Function1) obj2;
                LazyListScope lazyListScope5 = (LazyListScope) obj;
                lazyListScope5.getClass();
                LazyListScope.item$default(lazyListScope5, null, null, new ComposableLambdaImpl(new PoolListSectionKt$$ExternalSyntheticLambda2(contactMethodDetailsViewModel, i4), true, 999872327), 3);
                if (!contactMethodDetailsViewModel.aliases.isEmpty()) {
                    List list2 = contactMethodDetailsViewModel.aliases;
                    lazyListScope5.items(list2.size(), null, new MusicViewKt$LoadedMusicContent$lambda$1$0$0$0$$inlined$items$default$3(list2, 12), new ComposableLambdaImpl(new SectionKt$sectionItemsIndexed$$inlined$itemsIndexed$default$4(list2, contactMethodDetailsViewModel, function17, i9), true, 802480018));
                    LazyListScope.item$default(lazyListScope5, null, null, ChannelListViewKt.f604lambda$1453615924, 3);
                }
                break;
            case 17:
                ProfileNotificationsViewModel profileNotificationsViewModel = (ProfileNotificationsViewModel) obj3;
                Function1 function18 = (Function1) obj2;
                LazyListScope lazyListScope6 = (LazyListScope) obj;
                lazyListScope6.getClass();
                LazyListScope.item$default(lazyListScope6, null, null, ChannelListViewKt.f603lambda$1347529426, 3);
                ProfileNotificationsViewModel.Loaded loaded = (ProfileNotificationsViewModel.Loaded) profileNotificationsViewModel;
                ProfileNotificationsViewModel.Loaded.NotificationMessage notificationMessage = loaded.notificationMessage;
                if (notificationMessage != null) {
                    LazyListScope.item$default(lazyListScope6, null, null, new ComposableLambdaImpl(new ShareSheetViewKt$$ExternalSyntheticLambda1(5, (Object) notificationMessage, (Object) function18), true, 939317143), 3);
                }
                List list3 = loaded.sections;
                lazyListScope6.items(list3.size(), null, new MusicViewKt$LoadedMusicContent$lambda$1$0$0$0$$inlined$items$default$3(list3, 13), new ComposableLambdaImpl(new MarkdownCheckBoxKt$MarkdownCheckBox$1(i10, list3, profileNotificationsViewModel), true, 2039820996));
                LazyListScope.item$default(lazyListScope6, null, null, ChannelListViewKt.lambda$1280348759, 3);
                break;
            case 18:
                CameraXPreviewManager cameraXPreviewManager = (CameraXPreviewManager) obj3;
                ((Context) obj).getClass();
                PreviewView previewView = new PreviewView((Context) obj2);
                Threads.checkMainThread();
                PreviewView.AnonymousClass1 anonymousClass1 = previewView.mSurfaceProvider;
                anonymousClass1.getClass();
                cameraXPreviewManager.getClass();
                cameraXPreviewManager.preview.setSurfaceProvider(anonymousClass1);
                break;
            case 19:
                CameraXPreviewManager cameraXPreviewManager2 = (CameraXPreviewManager) obj3;
                ((DisposableEffectScope) obj).getClass();
                ProcessCameraProvider processCameraProvider = ProcessCameraProvider.sAppInstance;
                Context context = cameraXPreviewManager2.context;
                ChainingListenableFuture switchViewKt = SwitchViewKt.getInstance(context);
                switchViewKt.addListener(new CardEntryActivityController$$ExternalSyntheticLambda1(i9, switchViewKt, cameraXPreviewManager2, (CameraXPreviewState) obj2), context.getMainExecutor());
                cameraXPreviewManager2.orientationEventListener.this$0 = new ScannerView.AnonymousClass3(1, cameraXPreviewManager2.imageAnalysis, ImageAnalysis.class, "setTargetRotation", "setTargetRotation(I)V", 0, 3);
                cameraXPreviewManager2.cameraLifecycleOwner.lifecycle.setCurrentState(Lifecycle.State.RESUMED);
                break;
            case 20:
                ArrayList arrayList2 = (ArrayList) obj3;
                LazyGridIntervalContent lazyGridIntervalContent = (LazyGridIntervalContent) obj;
                lazyGridIntervalContent.getClass();
                lazyGridIntervalContent.items(arrayList2.size(), null, null, new BorrowHomeKt$BorrowHome$lambda$1$0$$inlined$itemsIndexed$default$2(19, arrayList2), new ComposableLambdaImpl(new BorrowHomeKt$BorrowHome$lambda$1$0$$inlined$itemsIndexed$default$3(arrayList2, (Function1) obj2, i5), true, -1117249557));
                break;
            case 21:
                RealCustomerStore realCustomerStore = (RealCustomerStore) obj3;
                UiCustomer uiCustomer = (UiCustomer) obj2;
                ((TransactionWrapper) obj).getClass();
                final RewardSlotQueries rewardSlotQueries = realCustomerStore.customerQueries;
                InstrumentQueries instrumentQueries = realCustomerStore.aliasQueries;
                final String str6 = uiCustomer.id;
                str6.getClass();
                Image image2 = uiCustomer.photo;
                if (image2 == null) {
                    String str7 = uiCustomer.photo_url;
                    image = str7 != null ? new Image(str7, str7, 4) : null;
                } else {
                    image = image2;
                }
                final String str8 = uiCustomer.cashtag;
                final String str9 = uiCustomer.full_name;
                Boolean bool = uiCustomer.can_accept_payments;
                final boolean booleanValue = bool != null ? bool.booleanValue() : false;
                Boolean bool2 = uiCustomer.is_square;
                final boolean booleanValue2 = bool2 != null ? bool2.booleanValue() : false;
                Boolean bool3 = uiCustomer.is_cash_customer;
                final boolean booleanValue3 = bool3 != null ? bool3.booleanValue() : false;
                Boolean bool4 = uiCustomer.is_business;
                final boolean booleanValue4 = bool4 != null ? bool4.booleanValue() : false;
                Boolean bool5 = uiCustomer.is_verified_account;
                final boolean booleanValue5 = bool5 != null ? bool5.booleanValue() : false;
                final Long l2 = uiCustomer.credit_card_fee_bps;
                final String str10 = uiCustomer.render_data;
                BlockState blockState = uiCustomer.block_state;
                if (blockState == null) {
                    blockState = ProtoDefaults.UI_CUSTOMER_BLOCK_STATE;
                }
                final BlockState blockState2 = blockState;
                final String str11 = uiCustomer.threaded_customer_id;
                final MerchantData merchantData = uiCustomer.merchant_data;
                Color color2 = uiCustomer.themed_accent_color;
                if (color2 == null) {
                    String str12 = uiCustomer.accent_color;
                    if (str12 == null) {
                        color = null;
                        MerchantData merchantData2 = uiCustomer.merchant_data;
                        final String str13 = merchantData2 == null ? merchantData2.category : null;
                        InvestmentEntityData investmentEntityData = uiCustomer.investment_entity_data;
                        final String str14 = investmentEntityData == null ? investmentEntityData.investment_entity_token : null;
                        final Region region = uiCustomer.region;
                        final Long l3 = uiCustomer.customer_joined_on;
                        Boolean bool6 = uiCustomer.is_special_customer;
                        final boolean booleanValue6 = bool6 != null ? bool6.booleanValue() : false;
                        rewardSlotQueries.getClass();
                        blockState2.getClass();
                        rewardSlotQueries.driver.execute(1720082404, "INSERT OR REPLACE INTO customer\n  (customer_id, photo, cashtag, customer_display_name, can_accept_payments, is_square,\n  is_cash_customer, is_business, is_verified, credit_card_fee, render_data, blocked,\n  threaded_customer_id, merchant_data, themed_accent_color, category,\n  investment_entity_token, region, joined_on, is_special_customer)\nVALUES\n  (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?, ?)", new Function1() { // from class: com.squareup.cash.db2.contacts.CustomerQueries$$ExternalSyntheticLambda9
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                AndroidStatement androidStatement = (AndroidStatement) obj4;
                                androidStatement.getClass();
                                androidStatement.bindString(0, str6);
                                Image image3 = image;
                                RewardSlotQueries rewardSlotQueries2 = rewardSlotQueries;
                                androidStatement.bindBytes(1, image3 != null ? (byte[]) ((WireAdapter) ((ComponentRegistry.Builder) rewardSlotQueries2.rewardSlotAdapter).lazyFetcherFactories).encode(image3) : null);
                                androidStatement.bindString(2, str8);
                                androidStatement.bindString(3, str9);
                                androidStatement.bindBoolean(4, Boolean.valueOf(booleanValue));
                                androidStatement.bindBoolean(5, Boolean.valueOf(booleanValue2));
                                androidStatement.bindBoolean(6, Boolean.valueOf(booleanValue3));
                                androidStatement.bindBoolean(7, Boolean.valueOf(booleanValue4));
                                androidStatement.bindBoolean(8, Boolean.valueOf(booleanValue5));
                                androidStatement.bindLong(9, l2);
                                androidStatement.bindString(10, str10);
                                ComponentRegistry.Builder builder = (ComponentRegistry.Builder) rewardSlotQueries2.rewardSlotAdapter;
                                androidStatement.bindString(11, (String) ((EnumColumnAdapter) builder.interceptors).encode(blockState2));
                                androidStatement.bindString(12, str11);
                                MerchantData merchantData3 = merchantData;
                                androidStatement.bindBytes(13, merchantData3 != null ? (byte[]) ((WireAdapter) builder.mappers).encode(merchantData3) : null);
                                Color color3 = color;
                                androidStatement.bindBytes(14, color3 != null ? (byte[]) ((WireAdapter) builder.lazyDecoderFactories).encode(color3) : null);
                                androidStatement.bindString(15, str13);
                                androidStatement.bindString(16, str14);
                                Region region2 = region;
                                androidStatement.bindString(17, region2 != null ? (String) ((EnumColumnAdapter) builder.keyers).encode(region2) : null);
                                androidStatement.bindLong(18, l3);
                                androidStatement.bindBoolean(19, Boolean.valueOf(booleanValue6));
                                return Unit.INSTANCE;
                            }
                        });
                        rewardSlotQueries.notifyQueries(1720082404, new ContactQueries$$ExternalSyntheticLambda1(8));
                        str2 = uiCustomer.email_address;
                        if (str2 == null) {
                            String hash = Aliases.hash(str2);
                            String str15 = uiCustomer.id;
                            AliasSyncState aliasSyncState = AliasSyncState.SYNCED;
                            str3 = null;
                            instrumentQueries.insertOrReplaceAlias(hash, str2, null, str15);
                        } else {
                            str3 = null;
                        }
                        str4 = uiCustomer.sms_number;
                        if (str4 != null) {
                            String hash2 = Aliases.hash(str4);
                            String str16 = uiCustomer.id;
                            AliasSyncState aliasSyncState2 = AliasSyncState.SYNCED;
                            instrumentQueries.insertOrReplaceAlias(hash2, str3, str4, str16);
                        }
                        break;
                    } else {
                        color2 = ColorsKt.toColor(str12);
                    }
                }
                color = color2;
                MerchantData merchantData22 = uiCustomer.merchant_data;
                if (merchantData22 == null) {
                }
                InvestmentEntityData investmentEntityData2 = uiCustomer.investment_entity_data;
                if (investmentEntityData2 == null) {
                }
                final Region region2 = uiCustomer.region;
                final Long l32 = uiCustomer.customer_joined_on;
                Boolean bool62 = uiCustomer.is_special_customer;
                final boolean booleanValue62 = bool62 != null ? bool62.booleanValue() : false;
                rewardSlotQueries.getClass();
                blockState2.getClass();
                rewardSlotQueries.driver.execute(1720082404, "INSERT OR REPLACE INTO customer\n  (customer_id, photo, cashtag, customer_display_name, can_accept_payments, is_square,\n  is_cash_customer, is_business, is_verified, credit_card_fee, render_data, blocked,\n  threaded_customer_id, merchant_data, themed_accent_color, category,\n  investment_entity_token, region, joined_on, is_special_customer)\nVALUES\n  (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?, ?)", new Function1() { // from class: com.squareup.cash.db2.contacts.CustomerQueries$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj4) {
                        AndroidStatement androidStatement = (AndroidStatement) obj4;
                        androidStatement.getClass();
                        androidStatement.bindString(0, str6);
                        Image image3 = image;
                        RewardSlotQueries rewardSlotQueries2 = rewardSlotQueries;
                        androidStatement.bindBytes(1, image3 != null ? (byte[]) ((WireAdapter) ((ComponentRegistry.Builder) rewardSlotQueries2.rewardSlotAdapter).lazyFetcherFactories).encode(image3) : null);
                        androidStatement.bindString(2, str8);
                        androidStatement.bindString(3, str9);
                        androidStatement.bindBoolean(4, Boolean.valueOf(booleanValue));
                        androidStatement.bindBoolean(5, Boolean.valueOf(booleanValue2));
                        androidStatement.bindBoolean(6, Boolean.valueOf(booleanValue3));
                        androidStatement.bindBoolean(7, Boolean.valueOf(booleanValue4));
                        androidStatement.bindBoolean(8, Boolean.valueOf(booleanValue5));
                        androidStatement.bindLong(9, l2);
                        androidStatement.bindString(10, str10);
                        ComponentRegistry.Builder builder = (ComponentRegistry.Builder) rewardSlotQueries2.rewardSlotAdapter;
                        androidStatement.bindString(11, (String) ((EnumColumnAdapter) builder.interceptors).encode(blockState2));
                        androidStatement.bindString(12, str11);
                        MerchantData merchantData3 = merchantData;
                        androidStatement.bindBytes(13, merchantData3 != null ? (byte[]) ((WireAdapter) builder.mappers).encode(merchantData3) : null);
                        Color color3 = color;
                        androidStatement.bindBytes(14, color3 != null ? (byte[]) ((WireAdapter) builder.lazyDecoderFactories).encode(color3) : null);
                        androidStatement.bindString(15, str13);
                        androidStatement.bindString(16, str14);
                        Region region22 = region2;
                        androidStatement.bindString(17, region22 != null ? (String) ((EnumColumnAdapter) builder.keyers).encode(region22) : null);
                        androidStatement.bindLong(18, l32);
                        androidStatement.bindBoolean(19, Boolean.valueOf(booleanValue62));
                        return Unit.INSTANCE;
                    }
                });
                rewardSlotQueries.notifyQueries(1720082404, new ContactQueries$$ExternalSyntheticLambda1(8));
                str2 = uiCustomer.email_address;
                if (str2 == null) {
                }
                str4 = uiCustomer.sms_number;
                if (str4 != null) {
                }
            case 22:
                AndroidStatement androidStatement = (AndroidStatement) obj;
                androidStatement.getClass();
                ((RecurringPreferenceQueries) obj3).recurring_preferenceAdapter.getClass();
                String str17 = new RecurringPreferenceId((String) obj2).entityId;
                str17.getClass();
                androidStatement.bindString(0, str17);
                break;
            case 23:
                AndroidStatement androidStatement2 = (AndroidStatement) obj;
                androidStatement2.getClass();
                ((RecurringPreferenceQueries) obj3).recurring_preferenceAdapter.getClass();
                String str18 = ((RecurringPreferenceQueries.SelectForIdQuery) obj2).entity_id;
                str18.getClass();
                androidStatement2.bindString(0, str18);
                break;
            case 24:
                AndroidStatement androidStatement3 = (AndroidStatement) obj;
                androidStatement3.getClass();
                androidStatement3.bindString(0, (String) ((RecurringPreferenceQueries) obj3).recurring_preferenceAdapter.typeAdapter.encode(((RecurringPreferenceQueries.SelectForTypeQuery) obj2).f1194type));
                break;
            case 25:
                SavingsAppletTile savingsAppletTile = (SavingsAppletTile) obj3;
                SavingsAppletTileViewModel.Uninstalled uninstalled = (SavingsAppletTileViewModel.Uninstalled) obj2;
                PromotedAppletTileViewEvent$Click promotedAppletTileViewEvent$Click = (PromotedAppletTileViewEvent$Click) obj;
                promotedAppletTileViewEvent$Click.getClass();
                if (promotedAppletTileViewEvent$Click.equals(PromotedAppletTileViewEvent$Click.INSTANCE)) {
                    savingsAppletTile.onClickTile.invoke(uninstalled.clientRoute);
                    break;
                } else {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    break;
                }
            case 26:
                PersistentActiveGoalStore persistentActiveGoalStore = (PersistentActiveGoalStore) obj3;
                final SavingsFolder.GoalFolder goalFolder = (SavingsFolder.GoalFolder) obj2;
                final SavingsGoalLocalStatus savingsGoalLocalStatus = (SavingsGoalLocalStatus) obj;
                String str19 = goalFolder.token;
                if (savingsGoalLocalStatus == null) {
                    savingsGoalLocalStatus = new SavingsGoalLocalStatus(str19, false, false, null, null, null, null);
                }
                final ActiveGoalProvider.Default r15 = new ActiveGoalProvider.Default(goalFolder, savingsGoalLocalStatus.last_seen_balance, savingsGoalLocalStatus.last_seen_remaining_balance, savingsGoalLocalStatus.last_seen_progress_bps != null ? Float.valueOf(r5.longValue() / 10000.0f) : null, new CardTransitionKt$$ExternalSyntheticLambda4(i5, savingsGoalLocalStatus, goalFolder, persistentActiveGoalStore));
                break;
            case 27:
                GpsConfigQueries gpsConfigQueries = (GpsConfigQueries) ((EglCore) obj3).eglConfig;
                gpsConfigQueries.driver.execute(-1930262298, "DELETE FROM savingsTaxDocument", null);
                gpsConfigQueries.notifyQueries(-1930262298, new CelebrationKt$$ExternalSyntheticLambda1(22));
                for (Document document : ((Get1099IntStatementsResponse) ((ApiResult.Success) obj2).response).documents) {
                    gpsConfigQueries.getClass();
                    document.getClass();
                    gpsConfigQueries.driver.execute(-685017143, "INSERT OR IGNORE INTO savingsTaxDocument\nVALUES(?)", new OpenSourceKt$$ExternalSyntheticLambda11(i6, gpsConfigQueries, document));
                    gpsConfigQueries.notifyQueries(-685017143, new CelebrationKt$$ExternalSyntheticLambda1(21));
                }
                break;
            case 28:
                AndroidStatement androidStatement4 = (AndroidStatement) obj;
                androidStatement4.getClass();
                androidStatement4.bindBytes(0, (byte[]) ((BlockersConfig.Adapter) ((GpsConfigQueries) obj3).gpsConfigAdapter).target_balance_amountAdapter.encode((Document) obj2));
                break;
            default:
                ((MutableState) obj2).setValue(new TransferringViewModel.Error((String) obj, ((AndroidStringManager) ((LocalEditorialPresenter) obj3).stringManager).get(R.string.close)));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ OpenSourceKt$$ExternalSyntheticLambda11(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }
}
