package com.squareup.cash.moneybot.widgets;

import androidx.camera.video.internal.utils.StorageUtil;
import androidx.cardview.widget.CardViewApi21Impl;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.glance.appwidget.WidgetLayoutKt;
import androidx.media3.common.MediaItem;
import androidx.room.Room;
import app.cash.molecule.PlatformKt;
import coil3.size.SizeKt;
import com.squareup.cash.R;
import com.squareup.cash.account.components.AccountToDoKt;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.bitcoin.views.stablecoin.SendStablecoinViewKt;
import com.squareup.cash.contacts.components.SyncContactsRowKt;
import com.squareup.cash.favorites.components.AddFavoritesViewKt;
import com.squareup.cash.moneybot.views.home.MoneybotHomeViewKt;
import com.squareup.cash.mooncake.compose_ui.components.NavigationIconType;
import com.squareup.cash.payments.views.composer.ErrorKt;
import com.squareup.cash.payments.views.personalization.AlphaKt;
import com.squareup.cash.profile.devicemanager.views.DeviceManagerListViewKt;
import com.squareup.cash.shopping.autofill.views.content.ErrorContentKt;
import com.squareup.cash.support.chat.views.transcript.message.ActionBodyViewKt;
import com.squareup.cash.support.chat.views.transcript.message.compose.MessageFileKt;
import com.squareup.cash.work.views.pay.PayCellViewKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class ComposerKt$$ExternalSyntheticLambda14 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Modifier f$0;
    public final /* synthetic */ Function0 f$1;

    public /* synthetic */ ComposerKt$$ExternalSyntheticLambda14(int i, Modifier modifier, Function0 function0) {
        this.$r8$classId = 15;
        NavigationIconType navigationIconType = NavigationIconType.BACK;
        this.f$1 = function0;
        this.f$0 = modifier;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Function0 function0 = this.f$1;
        Modifier modifier = this.f$0;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                ComposerKt.CancelButton(Updater.updateChangedFlags(1), (Composer) obj, modifier, function0);
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                AccountToDoKt.QrModeToggle(Updater.updateChangedFlags(49), (Composer) obj, modifier, function0);
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                AccountToDoKt.QrCodeError(Updater.updateChangedFlags(1), (Composer) obj, modifier, function0);
                return Unit.INSTANCE;
            case 3:
                ((Integer) obj2).getClass();
                SendStablecoinViewKt.CopyButton(Updater.updateChangedFlags(1), (Composer) obj, modifier, function0);
                return Unit.INSTANCE;
            case 4:
                ((Integer) obj2).getClass();
                SyncContactsRowKt.SyncContactsRow(Updater.updateChangedFlags(1), (Composer) obj, modifier, function0);
                return Unit.INSTANCE;
            case 5:
                ((Integer) obj2).getClass();
                AddFavoritesViewKt.EmptyFavoritesBody(Updater.updateChangedFlags(7), (Composer) obj, modifier, function0);
                return Unit.INSTANCE;
            case 6:
                ((Integer) obj2).getClass();
                CardViewApi21Impl.AutoScrollIcon(Updater.updateChangedFlags(1), (Composer) obj, modifier, function0);
                return Unit.INSTANCE;
            case 7:
                ((Integer) obj2).getClass();
                MoneybotHomeViewKt.HomeErrorNotice(Updater.updateChangedFlags(1), (Composer) obj, modifier, function0);
                return Unit.INSTANCE;
            case 8:
                ((Integer) obj2).getClass();
                ErrorKt.StylePaymentButton(Updater.updateChangedFlags(385), (Composer) obj, modifier, function0);
                return Unit.INSTANCE;
            case 9:
                ((Integer) obj2).getClass();
                AlphaKt.EditStyleButton(Updater.updateChangedFlags(1), (Composer) obj, modifier, function0);
                return Unit.INSTANCE;
            case 10:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    SizeKt.ButtonCta(this.f$1, this.f$0, ButtonProminence.PROMINENT, false, true, null, AlphaKt.f562lambda$1024976170, gapComposer, 1597824, 40);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 11:
                ((Integer) obj2).getClass();
                AlphaKt.ReceiptButton(Updater.updateChangedFlags(1), (Composer) obj, modifier, function0);
                return Unit.INSTANCE;
            case 12:
                ((Integer) obj2).getClass();
                DeviceManagerListViewKt.DeviceMapError(Updater.updateChangedFlags(1), (Composer) obj, modifier, function0);
                return Unit.INSTANCE;
            case 13:
                ((Integer) obj2).getClass();
                ErrorContentKt.MooncakeSuccessContent(Updater.updateChangedFlags(1), (Composer) obj, modifier, function0);
                return Unit.INSTANCE;
            case 14:
                ((Integer) obj2).getClass();
                ErrorContentKt.SuccessContent(Updater.updateChangedFlags(1), (Composer) obj, modifier, function0);
                return Unit.INSTANCE;
            case 15:
                NavigationIconType navigationIconType = NavigationIconType.BACK;
                ((Integer) obj2).getClass();
                WidgetLayoutKt.StablecoinToolbar(Updater.updateChangedFlags(7), (Composer) obj, modifier, function0);
                return Unit.INSTANCE;
            case 16:
                ((Integer) obj2).getClass();
                MediaItem.DrmConfiguration.DiscardAttachmentButton(Updater.updateChangedFlags(1), (Composer) obj, modifier, function0);
                return Unit.INSTANCE;
            case 17:
                ((Integer) obj2).getClass();
                ActionBodyViewKt.UnknownMessageBody(Updater.updateChangedFlags(1), (Composer) obj, modifier, function0);
                return Unit.INSTANCE;
            case 18:
                ((Integer) obj2).getClass();
                MessageFileKt.ActivityFailedToLoadContent(Updater.updateChangedFlags(1), (Composer) obj, modifier, function0);
                return Unit.INSTANCE;
            case 19:
                ((Integer) obj2).getClass();
                MessageFileKt.ImagePlaceholderError(Updater.updateChangedFlags(1), (Composer) obj, modifier, function0);
                return Unit.INSTANCE;
            case 20:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(ClipKt.clip(modifier, RoundedCornerShapeKt.CircleShape), Color.m675copywmQWz5c$default(0.1f, Color.Black, 14), ColorKt.RectangleShape);
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                    int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, m177backgroundbw27NRU);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer2.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer2.startReusableNode();
                    if (gapComposer2.inserting) {
                        gapComposer2.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer2.useNode();
                    }
                    Updater.m576setimpl(gapComposer2, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    StorageUtil.ButtonIcon(Icons.NavigationClose, Room.stringResource(gapComposer2, R.string.close), this.f$1, null, false, null, gapComposer2, 6, 56);
                    gapComposer2.end(true);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 21:
                ((Integer) obj2).getClass();
                PayCellViewKt.PayHistoryListError(Updater.updateChangedFlags(1), (Composer) obj, modifier, function0);
                return Unit.INSTANCE;
            case 22:
                ((Integer) obj2).getClass();
                PayCellViewKt.PayHomeError(Updater.updateChangedFlags(1), (Composer) obj, modifier, function0);
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                PayCellViewKt.TaxFormsListError(Updater.updateChangedFlags(1), (Composer) obj, modifier, function0);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ ComposerKt$$ExternalSyntheticLambda14(Modifier modifier, Function0 function0) {
        this.$r8$classId = 20;
        this.f$0 = modifier;
        this.f$1 = function0;
    }

    public /* synthetic */ ComposerKt$$ExternalSyntheticLambda14(Modifier modifier, Function0 function0, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = modifier;
        this.f$1 = function0;
    }

    public /* synthetic */ ComposerKt$$ExternalSyntheticLambda14(Function0 function0, Modifier modifier) {
        this.$r8$classId = 10;
        this.f$1 = function0;
        this.f$0 = modifier;
    }

    public /* synthetic */ ComposerKt$$ExternalSyntheticLambda14(Function0 function0, Modifier modifier, int i, int i2) {
        this.$r8$classId = i2;
        this.f$1 = function0;
        this.f$0 = modifier;
    }
}
