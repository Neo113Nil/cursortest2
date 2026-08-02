package androidx.paging;

import android.content.Context;
import android.os.Bundle;
import androidx.camera.video.Recorder;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.text.input.internal.RecordingInputConnection;
import androidx.compose.foundation.text.selection.MouseSelectionObserver;
import androidx.compose.material.DrawerKt;
import androidx.compose.material.DrawerState;
import androidx.compose.material.pullrefresh.PullRefreshState;
import androidx.compose.material3.TooltipStateImpl;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.snapshots.SnapshotMutableState;
import androidx.compose.ui.graphics.ReusableGraphicsLayerScope;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.semantics.ProgressBarRangeInfo;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.input.CommitTextCommand;
import androidx.compose.ui.text.input.DeleteAllCommand;
import androidx.compose.ui.text.input.DeleteSurroundingTextCommand;
import androidx.compose.ui.text.input.DeleteSurroundingTextInCodePointsCommand;
import androidx.compose.ui.text.input.EditCommand;
import androidx.compose.ui.text.input.FinishComposingTextCommand;
import androidx.compose.ui.text.input.SetComposingRegionCommand;
import androidx.compose.ui.text.input.SetComposingTextCommand;
import androidx.compose.ui.text.input.SetSelectionCommand;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.window.AndroidPopup_androidKt$Popup$2$1$invoke$$inlined$onDispose$1;
import androidx.core.view.MenuHostHelper$$ExternalSyntheticLambda1;
import androidx.credentials.exceptions.CreateCredentialException;
import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController;
import androidx.credentials.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController$$ExternalSyntheticLambda6;
import androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController;
import androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController$$ExternalSyntheticLambda10;
import androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController;
import androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController$$ExternalSyntheticLambda6;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavHostController;
import androidx.navigation.fragment.FragmentNavigator;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.RoomConnectionManager;
import androidx.sqlite.db.SupportSQLiteDatabase;
import app.cash.broadway.screen.AskedQuestion;
import app.cash.local.db.LocalBrandCollectionQueries$selectContent$2;
import app.cash.local.db.LocalFulfillmentConfigurationQueries;
import app.cash.local.db.LocalFulfillmentConfigurationQueries$select$2;
import app.cash.local.db.LocalMarketScreenQueries$selectScreen$2;
import app.cash.local.db.LocalTabContentQueries;
import app.cash.local.db.LocalTabContentQueries$selectContent$2;
import app.cash.local.db.Local_brand_collection;
import app.cash.local.db.Local_fulfillment_configuration;
import app.cash.local.db.Local_market_screen;
import app.cash.local.db.Local_tab_content;
import app.cash.local.primitives.DiscountCode;
import app.cash.local.primitives.LocationMenu;
import app.cash.local.primitives.MenuItemToken;
import app.cash.local.screens.app.LocalMenuPickerScreen;
import app.cash.local.viewmodels.FreeDeliveryMeter;
import app.cash.local.viewmodels.LocalBottomModalViewModel;
import app.cash.local.viewmodels.LocalBrandLocationCartViewModel;
import app.cash.local.viewmodels.LocalBrandLocationMenuViewModel;
import app.cash.local.viewmodels.home.LocalHomeGeoViewModel;
import app.cash.local.viewmodels.internal.Amount;
import app.cash.sqldelight.driver.android.AndroidCursor;
import app.cash.sqldelight.driver.android.AndroidStatement;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.nimbusds.jose.JWECryptoParts;
import com.squareup.cash.boost.db.RewardQueries;
import com.squareup.cash.db2.BlockersConfig;
import com.squareup.cash.maps.viewmodels.CashMapViewEvent;
import com.squareup.cash.ui.qrcodes.widget.CashQrWidgetKt;
import com.squareup.protos.cash.local.client.app.v1.MarketTilesScreen;
import com.squareup.protos.cash.local.client.v1.GetBrandCollectionResponse;
import com.squareup.protos.cash.local.client.v1.GetNeighborhoodsTabContentResponse;
import com.squareup.protos.cash.local.client.v1.LocalFulfillment;
import com.squareup.protos.cash.local.client.v1.LocalMoney;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.concurrent.Executor;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.ClosedFloatRange;
import kotlinx.coroutines.flow.SharedFlowImpl;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes3.dex */
public final /* synthetic */ class CachedPageEventFlow$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ CachedPageEventFlow$$ExternalSyntheticLambda0(LocalFulfillmentConfigurationQueries localFulfillmentConfigurationQueries) {
        this.$r8$classId = 18;
        LocalFulfillmentConfigurationQueries$select$2 localFulfillmentConfigurationQueries$select$2 = LocalFulfillmentConfigurationQueries$select$2.INSTANCE;
        this.f$0 = localFulfillmentConfigurationQueries;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v30, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r11v48, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r11v50, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r11v55, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r5v3, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r6v2, types: [byte[], java.io.Serializable] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String concat;
        StringBuilder sb;
        int i;
        int i2 = this.$r8$classId;
        int i3 = 2;
        int i4 = 1;
        int i5 = 0;
        Object obj2 = null;
        Object obj3 = this.f$0;
        switch (i2) {
            case 0:
                ((SharedFlowImpl) ((JWECryptoParts) obj3).encryptedKey).tryEmit(null);
                return Unit.INSTANCE;
            case 1:
                ((RecordingInputConnection) obj3).addEditCommandWithBatch((EditCommand) obj);
                return Unit.INSTANCE;
            case 2:
                PointerInputChange pointerInputChange = (PointerInputChange) obj;
                if (((MouseSelectionObserver) obj3).mo121onExtendDragk4lQ0M(pointerInputChange.position)) {
                    pointerInputChange.consume();
                }
                return Unit.INSTANCE;
            case 3:
                ((Float) obj).getClass();
                Density requireDensity = ((DrawerState) obj3).requireDensity();
                TweenSpec tweenSpec = DrawerKt.AnimationSpec;
                return Float.valueOf(requireDensity.mo236toPx0680j_4(56.0f));
            case 4:
                ReusableGraphicsLayerScope reusableGraphicsLayerScope = (ReusableGraphicsLayerScope) obj;
                reusableGraphicsLayerScope.setTranslationY(((PullRefreshState) obj3)._position$delegate.getFloatValue() - Float.intBitsToFloat((int) (reusableGraphicsLayerScope.size & BodyPartID.bodyIdMax)));
                return Unit.INSTANCE;
            case 5:
                SemanticsPropertiesKt.setContentDescription((SemanticsPropertyReceiver) obj, (String) ((Pair) obj3).first);
                return Unit.INSTANCE;
            case 6:
                return new AndroidPopup_androidKt$Popup$2$1$invoke$$inlined$onDispose$1((TooltipStateImpl) obj3, 10);
            case 7:
                Saver saver = (Saver) obj3;
                MutableState mutableState = (MutableState) obj;
                if (!(mutableState instanceof SnapshotMutableState)) {
                    a$$ExternalSyntheticBUOutline0.m$3("Failed requirement.");
                    return null;
                }
                SnapshotMutableState snapshotMutableState = (SnapshotMutableState) mutableState;
                if (snapshotMutableState.getValue() != null) {
                    Object value = snapshotMutableState.getValue();
                    value.getClass();
                    obj2 = saver.mo380restore(value);
                }
                SnapshotMutationPolicy policy = snapshotMutableState.getPolicy();
                policy.getClass();
                return new ParcelableSnapshotMutableState(obj2, policy);
            case 8:
                EditCommand editCommand = (EditCommand) obj;
                String str = ((EditCommand) obj3) == editCommand ? " > " : "   ";
                if (editCommand instanceof CommitTextCommand) {
                    sb = new StringBuilder("CommitTextCommand(text.length=");
                    CommitTextCommand commitTextCommand = (CommitTextCommand) editCommand;
                    sb.append(commitTextCommand.annotatedString.text.length());
                    sb.append(", newCursorPosition=");
                    i = commitTextCommand.newCursorPosition;
                } else {
                    if (!(editCommand instanceof SetComposingTextCommand)) {
                        if (editCommand instanceof SetComposingRegionCommand) {
                            concat = ((SetComposingRegionCommand) editCommand).toString();
                        } else if (editCommand instanceof DeleteSurroundingTextCommand) {
                            concat = ((DeleteSurroundingTextCommand) editCommand).toString();
                        } else if (editCommand instanceof DeleteSurroundingTextInCodePointsCommand) {
                            concat = ((DeleteSurroundingTextInCodePointsCommand) editCommand).toString();
                        } else if (editCommand instanceof SetSelectionCommand) {
                            concat = ((SetSelectionCommand) editCommand).toString();
                        } else if (editCommand instanceof FinishComposingTextCommand) {
                            concat = "FinishComposingTextCommand()";
                        } else if (editCommand instanceof DeleteAllCommand) {
                            concat = "DeleteAllCommand()";
                        } else {
                            String simpleName = Reflection.factory.getOrCreateKotlinClass(editCommand.getClass()).getSimpleName();
                            if (simpleName == null) {
                                simpleName = "{anonymous EditCommand}";
                            }
                            concat = "Unknown EditCommand: ".concat(simpleName);
                        }
                        return str.concat(concat);
                    }
                    sb = new StringBuilder("SetComposingTextCommand(text.length=");
                    SetComposingTextCommand setComposingTextCommand = (SetComposingTextCommand) editCommand;
                    sb.append(setComposingTextCommand.annotatedString.text.length());
                    sb.append(", newCursorPosition=");
                    i = setComposingTextCommand.newCursorPosition;
                }
                concat = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, i, ')');
                return str.concat(concat);
            case 9:
                CredentialProviderBeginSignInController credentialProviderBeginSignInController = (CredentialProviderBeginSignInController) obj3;
                GetCredentialException getCredentialException = (GetCredentialException) obj;
                getCredentialException.getClass();
                credentialProviderBeginSignInController.getExecutor().execute(new CredentialProviderBeginSignInController$$ExternalSyntheticLambda6(credentialProviderBeginSignInController, getCredentialException, i5));
                return Unit.INSTANCE;
            case 10:
                CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController = (CredentialProviderCreatePublicKeyCredentialController) obj3;
                CreateCredentialException createCredentialException = (CreateCredentialException) obj;
                createCredentialException.getClass();
                Executor executor = credentialProviderCreatePublicKeyCredentialController.executor;
                if (executor != null) {
                    executor.execute(new CredentialProviderCreatePublicKeyCredentialController$$ExternalSyntheticLambda10(credentialProviderCreatePublicKeyCredentialController, createCredentialException, i4));
                    return Unit.INSTANCE;
                }
                Intrinsics.throwUninitializedPropertyAccessException("executor");
                throw null;
            case 11:
                CreatePublicKeyCredentialController createPublicKeyCredentialController = (CreatePublicKeyCredentialController) obj3;
                CreateCredentialException createCredentialException2 = (CreateCredentialException) obj;
                createCredentialException2.getClass();
                Executor executor2 = createPublicKeyCredentialController.executor;
                if (executor2 != null) {
                    executor2.execute(new CreatePublicKeyCredentialController$$ExternalSyntheticLambda6(createPublicKeyCredentialController, createCredentialException2, 1));
                    return Unit.INSTANCE;
                }
                Intrinsics.throwUninitializedPropertyAccessException("executor");
                throw null;
            case 12:
                NavHostController createNavController$NavHostControllerKt__NavHostController_androidKt = CashQrWidgetKt.createNavController$NavHostControllerKt__NavHostController_androidKt((Context) obj3);
                createNavController$NavHostControllerKt__NavHostController_androidKt.restoreState((Bundle) obj);
                return createNavController$NavHostControllerKt__NavHostController_androidKt;
            case 13:
                NavBackStackEntry navBackStackEntry = (NavBackStackEntry) obj;
                navBackStackEntry.getClass();
                return new MenuHostHelper$$ExternalSyntheticLambda1(i3, (FragmentNavigator) obj3, navBackStackEntry);
            case 14:
                ((SimpleProducerScopeImpl) obj3).close(null);
                return Unit.INSTANCE;
            case 15:
                SupportSQLiteDatabase supportSQLiteDatabase = (SupportSQLiteDatabase) obj;
                supportSQLiteDatabase.getClass();
                ((RoomConnectionManager) obj3).supportDatabase = supportSQLiteDatabase;
                return Unit.INSTANCE;
            case 16:
                DiscountCode discountCode = (DiscountCode) obj;
                discountCode.getClass();
                return Boolean.valueOf(Intrinsics.areEqual(discountCode.getCode(), ((DiscountCode) obj3).getCode()));
            case 17:
                int i6 = LocalBrandCollectionQueries$selectContent$2.$r8$clinit;
                LocalTabContentQueries localTabContentQueries = (LocalTabContentQueries) obj3;
                AndroidCursor androidCursor = (AndroidCursor) obj;
                androidCursor.getClass();
                ?? bytes = androidCursor.getBytes(0);
                return new Local_brand_collection(bytes != 0 ? (GetBrandCollectionResponse) ((Local_tab_content.Adapter) localTabContentQueries.local_tab_contentAdapter).responseAdapter.decode(bytes) : null);
            case 18:
                LocalFulfillmentConfigurationQueries$select$2 localFulfillmentConfigurationQueries$select$2 = LocalFulfillmentConfigurationQueries$select$2.INSTANCE;
                AndroidCursor androidCursor2 = (AndroidCursor) obj;
                String m1431m = re$$ExternalSyntheticOutline0.m1431m(androidCursor2, 0);
                Local_fulfillment_configuration.Adapter adapter = ((LocalFulfillmentConfigurationQueries) obj3).local_fulfillment_configurationAdapter;
                Enum m = NavAction$$ExternalSyntheticOutline0.m(androidCursor2, 1, adapter.typeAdapter);
                String string2 = androidCursor2.getString(2);
                Enum m2 = NavAction$$ExternalSyntheticOutline0.m(androidCursor2, 3, adapter.current_scheduling_modeAdapter);
                ?? bytes2 = androidCursor2.getBytes(4);
                LocalFulfillment localFulfillment = bytes2 != 0 ? (LocalFulfillment) adapter.asap_fulfillmentAdapter.decode(bytes2) : null;
                ?? bytes3 = androidCursor2.getBytes(5);
                LocalFulfillment localFulfillment2 = bytes3 != 0 ? (LocalFulfillment) adapter.scheduled_fulfillmentAdapter.decode(bytes3) : null;
                ?? bytes4 = androidCursor2.getBytes(6);
                return localFulfillmentConfigurationQueries$select$2.invoke(m1431m, m, string2, m2, localFulfillment, localFulfillment2, bytes4 != 0 ? (LocalMoney) adapter.delivery_feeAdapter.decode(bytes4) : null);
            case 19:
                AndroidStatement androidStatement = (AndroidStatement) obj;
                androidStatement.getClass();
                androidStatement.bindString(0, (String) ((RewardQueries.ForIdsQuery) obj3).token);
                return Unit.INSTANCE;
            case 20:
                int i7 = LocalMarketScreenQueries$selectScreen$2.$r8$clinit;
                LocalTabContentQueries localTabContentQueries2 = (LocalTabContentQueries) obj3;
                AndroidCursor androidCursor3 = (AndroidCursor) obj;
                androidCursor3.getClass();
                ?? bytes5 = androidCursor3.getBytes(0);
                return new Local_market_screen(bytes5 != 0 ? (MarketTilesScreen) ((BlockersConfig.Adapter) localTabContentQueries2.local_tab_contentAdapter).target_balance_amountAdapter.decode(bytes5) : null, androidCursor3.getLong(1));
            case 21:
                int i8 = LocalTabContentQueries$selectContent$2.$r8$clinit;
                LocalTabContentQueries localTabContentQueries3 = (LocalTabContentQueries) obj3;
                AndroidCursor androidCursor4 = (AndroidCursor) obj;
                androidCursor4.getClass();
                ?? bytes6 = androidCursor4.getBytes(0);
                return new Local_tab_content(bytes6 != 0 ? (GetNeighborhoodsTabContentResponse) ((Local_tab_content.Adapter) localTabContentQueries3.local_tab_contentAdapter).responseAdapter.decode(bytes6) : null);
            case 22:
                AskedQuestion askedQuestion = (AskedQuestion) obj;
                askedQuestion.getClass();
                return new LocalMenuPickerScreen(((LocationMenu) obj3).menus, askedQuestion);
            case 23:
                LocalBrandLocationMenuViewModel.MenuCategory.MenuItem menuItem = (LocalBrandLocationMenuViewModel.MenuCategory.MenuItem) obj;
                menuItem.getClass();
                String str2 = ((LocalBrandLocationMenuViewModel.MenuCategory) obj3).token;
                String str3 = menuItem.counterModel.menuItemToken;
                return Recorder$$ExternalSyntheticOutline2.m$1(str2, str3 == null ? "null" : MenuItemToken.m1264toStringimpl(str3));
            case 24:
                SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver.getClass();
                SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, ((Amount) obj3).text);
                return Unit.INSTANCE;
            case 25:
                SemanticsPropertyReceiver semanticsPropertyReceiver2 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver2.getClass();
                SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver2, ((LocalBrandLocationCartViewModel.Selection) obj3).totalPriceAmount.text);
                return Unit.INSTANCE;
            case 26:
                String str4 = (String) obj;
                str4.getClass();
                ((LocalHomeGeoViewModel) obj3).cashMapUiCallbackModel.onEvent.invoke(new CashMapViewEvent.MarkerClicked(str4));
                return Unit.INSTANCE;
            case 27:
                SemanticsPropertyReceiver semanticsPropertyReceiver3 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver3.getClass();
                SemanticsPropertiesKt.setProgressBarRangeInfo(semanticsPropertyReceiver3, new ProgressBarRangeInfo(((FreeDeliveryMeter) obj3).progress, new ClosedFloatRange(RecyclerView.DECELERATION_RATE, 1.0f), 0));
                return Unit.INSTANCE;
            case 28:
                SemanticsPropertyReceiver semanticsPropertyReceiver4 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver4.getClass();
                SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver4, ((LocalBottomModalViewModel.Payload.ItemInfo) obj3).amountText);
                return Unit.INSTANCE;
            default:
                LayoutCoordinates layoutCoordinates = (LayoutCoordinates) obj;
                layoutCoordinates.getClass();
                ((ParcelableSnapshotMutableIntState) obj3).setIntValue((int) (layoutCoordinates.mo838getSizeYbymL2g() & BodyPartID.bodyIdMax));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ CachedPageEventFlow$$ExternalSyntheticLambda0(EditCommand editCommand, Recorder.AnonymousClass1 anonymousClass1) {
        this.$r8$classId = 8;
        this.f$0 = editCommand;
    }

    public /* synthetic */ CachedPageEventFlow$$ExternalSyntheticLambda0(LocalTabContentQueries localTabContentQueries) {
        this.$r8$classId = 21;
        int i = LocalTabContentQueries$selectContent$2.$r8$clinit;
        this.f$0 = localTabContentQueries;
    }

    public /* synthetic */ CachedPageEventFlow$$ExternalSyntheticLambda0(LocalTabContentQueries localTabContentQueries, byte b) {
        this.$r8$classId = 17;
        int i = LocalBrandCollectionQueries$selectContent$2.$r8$clinit;
        this.f$0 = localTabContentQueries;
    }

    public /* synthetic */ CachedPageEventFlow$$ExternalSyntheticLambda0(LocalTabContentQueries localTabContentQueries, char c) {
        this.$r8$classId = 20;
        int i = LocalMarketScreenQueries$selectScreen$2.$r8$clinit;
        this.f$0 = localTabContentQueries;
    }

    public /* synthetic */ CachedPageEventFlow$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }
}
