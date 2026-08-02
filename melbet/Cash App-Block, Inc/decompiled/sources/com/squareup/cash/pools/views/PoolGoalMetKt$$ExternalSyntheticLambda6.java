package com.squareup.cash.pools.views;

import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.PaintDrawable;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0;
import androidx.compose.animation.core.Animatable;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScopeImpl;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.KeyMappingKt;
import androidx.compose.foundation.text.TextFieldScrollerPosition;
import androidx.compose.foundation.text.TextLayoutResultProxy;
import androidx.compose.foundation.text.VerticalScrollLayoutModifier;
import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.foundation.text.input.internal.MathUtilsKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Latch$await$2$2;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.ReusableGraphicsLayerScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.ValueInsets;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.PointerInputModifierNodeKt;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.spatial.RelativeLayoutBounds;
import androidx.compose.ui.text.Savers_androidKt$$ExternalSyntheticLambda0;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.TransformedText;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.sqlite.db.framework.FrameworkSQLiteDatabase;
import app.cash.api.ApiResult;
import app.cash.broadway.ui.Ui;
import app.cash.directoryui.viewmodels.DirectoryListItem;
import app.cash.directoryui.viewmodels.DirectoryViewEvent;
import app.cash.local.db.LocalTabContentQueries;
import app.cash.local.viewmodels.LocalBrandLocationMenuViewModel;
import app.cash.local.viewmodels.LocalMenuComboDetailsViewModel;
import app.cash.local.views.brand.menu.ComboSlotTokenAndIndex;
import app.cash.molecule.PlatformKt;
import app.cash.sqldelight.db.SqlDriver;
import app.cash.sqldelight.driver.android.AndroidStatement;
import app.cash.zipline.CallResult;
import coil3.size.SizeKt;
import com.google.mlkit.common.internal.zze;
import com.squareup.cash.advertising.views.FullscreenAdView;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.treehouse.RadioSelectionGroupBinding;
import com.squareup.cash.blockers.analytics.BlockerResponse;
import com.squareup.cash.cdf.blockerflow.BlockerFlowInteractViewBlockerResponse;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.db.CashAccountDatabaseCallback;
import com.squareup.cash.db2.InstrumentQueries;
import com.squareup.cash.directory_ui.views.CardItemView;
import com.squareup.cash.directory_ui.views.MooncakeAvatarView;
import com.squareup.cash.directory_ui.views.MooncakeFlatRowItemView;
import com.squareup.cash.directory_ui.views.SectionKt$sectionItemsIndexed$$inlined$itemsIndexed$default$3;
import com.squareup.cash.investing.components.categories.InvestingCategoryDetailKt;
import com.squareup.cash.investing.viewmodels.categories.InvestingCategoryDetailViewModel;
import com.squareup.cash.investing.viewmodels.search.InvestingFilterResultViewModel;
import com.squareup.cash.investing.viewmodels.search.InvestingSearchRow;
import com.squareup.cash.mooncake.components.MooncakeOptionRow;
import com.squareup.cash.pools.views.animation.AvatarLayoutAnimationStateHolder;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.score.views.ScoreHomeKt$$ExternalSyntheticLambda8;
import com.squareup.cash.sheet.BottomSheet;
import com.squareup.cash.sheet.BottomSheetDragHandle;
import com.squareup.cash.tabs.views.TabToolbarsKt$$ExternalSyntheticLambda21;
import com.squareup.cash.ui.widget.AmountSelector$$ExternalSyntheticLambda0;
import com.squareup.cash.work.views.shift.ShiftListContentKt$ShiftListContent$lambda$4$0$$inlined$items$3;
import com.squareup.contour.ContourLayout;
import com.squareup.contour.YInt;
import com.squareup.protos.franklin.api.FormBlocker;
import com.squareup.util.Strings;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.time.LocalDate;
import java.time.Month;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.math.MathKt__MathJVMKt;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.reflect.jvm.internal.DescriptorKCallable$$Lambda$6;
import okio.Path;
import okio.Utf8;
import okio.internal.ResourceFileSystem;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.brotli.dec.HuffmanTreeGroup;

/* loaded from: classes6.dex */
public final /* synthetic */ class PoolGoalMetKt$$ExternalSyntheticLambda6 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ int f$2;

    public /* synthetic */ PoolGoalMetKt$$ExternalSyntheticLambda6(int i, Object obj, Object obj2, int i2) {
        this.$r8$classId = i2;
        this.f$2 = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        float f = RecyclerView.DECELERATION_RATE;
        float f2 = 1.0f;
        final int i2 = 2;
        r6 = false;
        boolean z = false;
        final int i3 = 1;
        final int i4 = this.f$2;
        Object obj2 = this.f$1;
        Object obj3 = this.f$0;
        switch (i) {
            case 0:
                AvatarLayoutAnimationStateHolder avatarLayoutAnimationStateHolder = (AvatarLayoutAnimationStateHolder) obj3;
                ReusableGraphicsLayerScope reusableGraphicsLayerScope = (ReusableGraphicsLayerScope) obj;
                reusableGraphicsLayerScope.getClass();
                float floatValue = ((((Number) avatarLayoutAnimationStateHolder.offsetMultiplierAnimatable.getValue()).floatValue() * ((Placement) obj2).offset) * i4) / 2.0f;
                double radians = Math.toRadians(r9.angle);
                reusableGraphicsLayerScope.setTranslationX(((float) Math.cos(radians)) * floatValue);
                reusableGraphicsLayerScope.setTranslationY(floatValue * ((float) Math.sin(radians)));
                Animatable animatable = avatarLayoutAnimationStateHolder.scaleMultiplierAnimatable;
                reusableGraphicsLayerScope.setScaleX(((Number) animatable.getValue()).floatValue());
                reusableGraphicsLayerScope.setScaleY(((Number) animatable.getValue()).floatValue());
                return Unit.INSTANCE;
            case 1:
                VerticalScrollLayoutModifier verticalScrollLayoutModifier = (VerticalScrollLayoutModifier) obj3;
                Placeable placeable = (Placeable) obj2;
                Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
                int i5 = verticalScrollLayoutModifier.cursorOffset;
                TextFieldScrollerPosition textFieldScrollerPosition = verticalScrollLayoutModifier.scrollerPosition;
                TransformedText transformedText = verticalScrollLayoutModifier.transformedText;
                TextLayoutResultProxy textLayoutResultProxy = (TextLayoutResultProxy) verticalScrollLayoutModifier.textLayoutResultProvider.invoke();
                textFieldScrollerPosition.update(Orientation.Vertical, KeyMappingKt.access$getCursorRectInScroller(placementScope, i5, transformedText, textLayoutResultProxy != null ? textLayoutResultProxy.value : null, false, placeable.width), i4, placeable.height);
                placementScope.placeRelative(placeable, 0, Math.round(-textFieldScrollerPosition.offset$delegate.getFloatValue()), RecyclerView.DECELERATION_RATE);
                return Unit.INSTANCE;
            case 2:
                String str = (String) obj3;
                List list = (List) obj2;
                TextFieldBuffer textFieldBuffer = (TextFieldBuffer) obj;
                TextRange textRange = textFieldBuffer.composition;
                if (textRange != null) {
                    long j = textRange.packedValue;
                    int i6 = (int) (j >> 32);
                    MathUtilsKt.imeReplace(textFieldBuffer, i6, (int) (j & BodyPartID.bodyIdMax), str);
                    if (str.length() > 0) {
                        textFieldBuffer.setComposition$foundation(i6, str.length() + i6, list);
                    }
                } else {
                    int m990getMinimpl = TextRange.m990getMinimpl(textFieldBuffer.selectionInChars);
                    MathUtilsKt.imeReplace(textFieldBuffer, m990getMinimpl, TextRange.m989getMaximpl(textFieldBuffer.selectionInChars), str);
                    if (str.length() > 0) {
                        textFieldBuffer.setComposition$foundation(m990getMinimpl, str.length() + m990getMinimpl, list);
                    }
                }
                int m990getMinimpl2 = TextRange.m990getMinimpl(textFieldBuffer.selectionInChars);
                int coerceIn = RangesKt___RangesKt.coerceIn(i4 > 0 ? (m990getMinimpl2 + i4) - 1 : (m990getMinimpl2 + i4) - str.length(), 0, textFieldBuffer.buffer.length());
                textFieldBuffer.m379setSelection5zctL8(SizeKt.TextRange(coerceIn, coerceIn));
                return Unit.INSTANCE;
            case 3:
                final List list2 = (List) obj3;
                final Function1 function1 = (Function1) obj2;
                LazyListScope lazyListScope = (LazyListScope) obj;
                lazyListScope.getClass();
                lazyListScope.items(list2.size(), new Latch$await$2$2(6, new Savers_androidKt$$ExternalSyntheticLambda0(r6 ? (byte) 1 : (byte) 0, 21), list2), new SectionKt$sectionItemsIndexed$$inlined$itemsIndexed$default$3(list2, 1), new ComposableLambdaImpl(new Function4() { // from class: app.cash.local.views.brand.menu.LocalBrandLocationMenuViewKt$CategoryChipsHeader$lambda$3$0$$inlined$itemsIndexed$default$3
                    @Override // kotlin.jvm.functions.Function4
                    public final Object invoke(Object obj4, Object obj5, Object obj6, Object obj7) {
                        int i7;
                        long j2;
                        long j3;
                        LazyItemScopeImpl lazyItemScopeImpl = (LazyItemScopeImpl) obj4;
                        int intValue = ((Number) obj5).intValue();
                        Composer composer = (Composer) obj6;
                        int intValue2 = ((Number) obj7).intValue();
                        if ((intValue2 & 6) == 0) {
                            i7 = (((GapComposer) composer).changed(lazyItemScopeImpl) ? 4 : 2) | intValue2;
                        } else {
                            i7 = intValue2;
                        }
                        if ((intValue2 & 48) == 0) {
                            i7 |= ((GapComposer) composer).changed(intValue) ? 32 : 16;
                        }
                        GapComposer gapComposer = (GapComposer) composer;
                        if (gapComposer.shouldExecute(i7 & 1, (i7 & 147) != 146)) {
                            LocalBrandLocationMenuViewModel.MenuCategory menuCategory = (LocalBrandLocationMenuViewModel.MenuCategory) list2.get(intValue);
                            gapComposer.startReplaceGroup(29535124);
                            boolean z2 = i4 == intValue;
                            Strings.getSizes(gapComposer).getClass();
                            Object obj8 = DefaultSizes.border.entries;
                            RoundedCornerShape m340RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(9999.0f);
                            Arrangement$SpacedAligned arrangement$SpacedAligned = new Arrangement$SpacedAligned(4.0f, true, new OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0(Alignment.Companion.CenterHorizontally, 1));
                            BiasAlignment.Vertical vertical = Alignment.Companion.CenterVertically;
                            Modifier m275defaultMinSizeVpY3zN4 = androidx.compose.foundation.layout.SizeKt.m275defaultMinSizeVpY3zN4(Modifier.Companion.$$INSTANCE, 48.0f, 32.0f);
                            if (z2) {
                                gapComposer.startReplaceGroup(29930838);
                                j2 = Strings.getColors(gapComposer).semantic.background.inverse;
                                gapComposer.end(false);
                            } else {
                                gapComposer.startReplaceGroup(30016119);
                                j2 = Strings.getColors(gapComposer).semantic.background.subtle;
                                gapComposer.end(false);
                            }
                            Modifier clip = ClipKt.clip(ImageKt.m177backgroundbw27NRU(m275defaultMinSizeVpY3zN4, j2, m340RoundedCornerShape0680j_4), m340RoundedCornerShape0680j_4);
                            Role role = new Role(0);
                            Function1 function12 = function1;
                            boolean changed = ((((i7 & 112) ^ 48) > 32 && gapComposer.changed(intValue)) || (i7 & 48) == 32) | gapComposer.changed(function12);
                            Object rememberedValue = gapComposer.rememberedValue();
                            if (changed || rememberedValue == Composer.Companion.Empty) {
                                rememberedValue = new DescriptorKCallable$$Lambda$6(function12, intValue, 1);
                                gapComposer.updateRememberedValue(rememberedValue);
                            }
                            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(ImageKt.m183clickableoSLSa3U$default(clip, true, null, role, (Function0) rememberedValue, 10), 16.0f, RecyclerView.DECELERATION_RATE, 2);
                            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement$SpacedAligned, vertical, gapComposer, 54);
                            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m300paddingVpY3zN4$default);
                            ComposeUiNode.Companion.getClass();
                            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                            if (gapComposer.applier == null) {
                                Updater.invalidApplier();
                                throw null;
                            }
                            gapComposer.startReusableNode();
                            if (gapComposer.inserting) {
                                gapComposer.createNode(layoutNode$Companion$Constructor$1);
                            } else {
                                gapComposer.useNode();
                            }
                            Updater.m576setimpl(gapComposer, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
                            String str2 = menuCategory.label;
                            if (z2) {
                                gapComposer.startReplaceGroup(670167554);
                                j3 = Strings.getColors(gapComposer).semantic.background.f1047app;
                                gapComposer.end(false);
                            } else {
                                gapComposer.startReplaceGroup(670244899);
                                j3 = Strings.getColors(gapComposer).semantic.text.standard;
                                gapComposer.end(false);
                            }
                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4086, j3, (Composer) gapComposer, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                            gapComposer.end(true);
                            gapComposer.end(false);
                        } else {
                            gapComposer.skipToGroupEnd();
                        }
                        return Unit.INSTANCE;
                    }
                }, true, 2039820996));
                return Unit.INSTANCE;
            case 4:
                LayoutCoordinates layoutCoordinates = (LayoutCoordinates) obj;
                layoutCoordinates.getClass();
                ((SnapshotStateMap) obj2).put(new ComboSlotTokenAndIndex(((LocalMenuComboDetailsViewModel.ComboSlot) obj3).token, i4), new Offset(ValueInsets.positionInParent(layoutCoordinates)));
                return Unit.INSTANCE;
            case 5:
                ContourLayout contourLayout = (ContourLayout) obj3;
                ((ContourLayout.LayoutSpec) obj).getClass();
                return new YInt(contourLayout.m3819topdBGyhoQ((View) ((FullscreenAdView) obj2).actionButtons.get(i4 + 1)) - contourLayout.getDip(16));
            case 6:
                RadioSelectionGroupBinding radioSelectionGroupBinding = (RadioSelectionGroupBinding) obj3;
                FormBlocker.Element.OptionPickerElement.Option option = (FormBlocker.Element.OptionPickerElement.Option) obj2;
                MooncakeOptionRow mooncakeOptionRow = (MooncakeOptionRow) obj;
                int i7 = RadioSelectionGroupBinding.$r8$clinit;
                mooncakeOptionRow.getClass();
                mooncakeOptionRow.setSelected(((Number) radioSelectionGroupBinding.selectedIndex$delegate.getValue()).intValue() == i4);
                if (!(option.selectability instanceof FormBlocker.Element.OptionPickerElement.Option.Selectability.Unselectable)) {
                    mooncakeOptionRow.setOnClickListener(new AmountSelector$$ExternalSyntheticLambda0(radioSelectionGroupBinding, i4, i2));
                }
                return Unit.INSTANCE;
            case 7:
                AndroidStatement androidStatement = (AndroidStatement) obj;
                androidStatement.getClass();
                androidStatement.bindString(0, (String) obj3);
                ((zze) ((LocalTabContentQueries) obj2).local_tab_contentAdapter).getClass();
                androidStatement.bindLong(1, Long.valueOf(i4));
                return Unit.INSTANCE;
            case 8:
                Function1 function12 = (Function1) obj3;
                AndroidStringManager androidStringManager = (AndroidStringManager) obj2;
                ApiResult apiResult = (ApiResult) obj;
                apiResult.getClass();
                if (apiResult instanceof ApiResult.Success) {
                    BlockerResponse.Error error = (BlockerResponse.Error) function12.invoke(apiResult);
                    return error != null ? error : BlockerResponse.Success.INSTANCE;
                }
                if (!(apiResult instanceof ApiResult.Failure)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                Pair defaultErrorProvider = PointerInputModifierNodeKt.defaultErrorProvider(apiResult, androidStringManager, i4);
                BlockerResponse.Error blockerResponse = PointerInputModifierNodeKt.toBlockerResponse((ApiResult.Failure) apiResult, androidStringManager, i4);
                String str2 = (String) defaultErrorProvider.second;
                BlockerFlowInteractViewBlockerResponse.Status status = blockerResponse.status;
                status.getClass();
                return new BlockerResponse.Error((String) null, str2, status);
            case 9:
                Month month = (Month) obj2;
                LocalDate localDate = (LocalDate) obj;
                localDate.getClass();
                if (localDate.isBefore((LocalDate) obj3) || (localDate.getMonth() == month && localDate.getYear() == i4)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 10:
                CashAccountDatabaseCallback cashAccountDatabaseCallback = (CashAccountDatabaseCallback) obj3;
                FrameworkSQLiteDatabase frameworkSQLiteDatabase = (FrameworkSQLiteDatabase) obj2;
                ((SqlDriver) obj).getClass();
                if (i4 < 447) {
                    CashAccountDatabaseCallback.migrateUnhandledEntities(frameworkSQLiteDatabase);
                } else {
                    Cursor query = frameworkSQLiteDatabase.query(new CallResult("SELECT count(*) > 1000 FROM unhandled_sync_entity;"));
                    try {
                        query.moveToNext();
                        if (query.getInt(0) == 1) {
                            cashAccountDatabaseCallback.clearDataAndRestart();
                        } else {
                            CashAccountDatabaseCallback.migrateUnhandledEntities(frameworkSQLiteDatabase);
                        }
                        query.close();
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            Utf8.closeFinally(query, th);
                            throw th2;
                        }
                    }
                }
                return Unit.INSTANCE;
            case 11:
                AndroidStatement androidStatement2 = (AndroidStatement) obj;
                androidStatement2.getClass();
                androidStatement2.bindBytes(0, (byte[]) obj3);
                ((Path.Companion) ((InstrumentQueries) obj2).instrumentAdapter).getClass();
                androidStatement2.bindLong(1, Long.valueOf(i4));
                return Unit.INSTANCE;
            case 12:
                AndroidStatement androidStatement3 = (AndroidStatement) obj;
                androidStatement3.getClass();
                androidStatement3.bindString(0, (String) obj3);
                ((ResourceFileSystem.Companion) ((InstrumentQueries) obj2).instrumentAdapter).getClass();
                androidStatement3.bindLong(1, Long.valueOf(i4));
                return Unit.INSTANCE;
            case 13:
                final DirectoryListItem.ItemViewModel itemViewModel = (DirectoryListItem.ItemViewModel) obj3;
                final ScoreHomeKt$$ExternalSyntheticLambda8 scoreHomeKt$$ExternalSyntheticLambda8 = (ScoreHomeKt$$ExternalSyntheticLambda8) obj2;
                CardItemView cardItemView = (CardItemView) obj;
                cardItemView.getClass();
                final int i8 = r6 ? 1 : 0;
                cardItemView.setModel(i4, itemViewModel, new Ui.EventReceiver() { // from class: com.squareup.cash.directory_ui.views.CardSectionViewKt$$ExternalSyntheticLambda3
                    @Override // app.cash.broadway.ui.Ui.EventReceiver
                    public final void sendEvent(Object obj4) {
                        int i9 = i8;
                        DirectoryListItem.ItemViewModel itemViewModel2 = itemViewModel;
                        ScoreHomeKt$$ExternalSyntheticLambda8 scoreHomeKt$$ExternalSyntheticLambda82 = (ScoreHomeKt$$ExternalSyntheticLambda8) scoreHomeKt$$ExternalSyntheticLambda8;
                        switch (i9) {
                            case 0:
                                DirectoryViewEvent.DirectoryItemViewEvent directoryItemViewEvent = (DirectoryViewEvent.DirectoryItemViewEvent) obj4;
                                directoryItemViewEvent.getClass();
                                scoreHomeKt$$ExternalSyntheticLambda82.invoke(directoryItemViewEvent, itemViewModel2);
                                break;
                            case 1:
                                DirectoryViewEvent.DirectoryItemViewEvent directoryItemViewEvent2 = (DirectoryViewEvent.DirectoryItemViewEvent) obj4;
                                directoryItemViewEvent2.getClass();
                                scoreHomeKt$$ExternalSyntheticLambda82.invoke(directoryItemViewEvent2, itemViewModel2);
                                break;
                            default:
                                DirectoryViewEvent directoryViewEvent = (DirectoryViewEvent) obj4;
                                directoryViewEvent.getClass();
                                if (directoryViewEvent instanceof DirectoryViewEvent.DirectoryItemViewEvent) {
                                    scoreHomeKt$$ExternalSyntheticLambda82.invoke(directoryViewEvent, itemViewModel2);
                                    break;
                                }
                                break;
                        }
                    }
                });
                return Unit.INSTANCE;
            case 14:
                final DirectoryListItem.ItemViewModel itemViewModel2 = (DirectoryListItem.ItemViewModel) obj3;
                final ScoreHomeKt$$ExternalSyntheticLambda8 scoreHomeKt$$ExternalSyntheticLambda82 = (ScoreHomeKt$$ExternalSyntheticLambda8) obj2;
                MooncakeAvatarView mooncakeAvatarView = (MooncakeAvatarView) obj;
                mooncakeAvatarView.getClass();
                mooncakeAvatarView.setModel(i4, itemViewModel2, new Ui.EventReceiver() { // from class: com.squareup.cash.directory_ui.views.CardSectionViewKt$$ExternalSyntheticLambda3
                    @Override // app.cash.broadway.ui.Ui.EventReceiver
                    public final void sendEvent(Object obj4) {
                        int i9 = i3;
                        DirectoryListItem.ItemViewModel itemViewModel22 = itemViewModel2;
                        ScoreHomeKt$$ExternalSyntheticLambda8 scoreHomeKt$$ExternalSyntheticLambda822 = (ScoreHomeKt$$ExternalSyntheticLambda8) scoreHomeKt$$ExternalSyntheticLambda82;
                        switch (i9) {
                            case 0:
                                DirectoryViewEvent.DirectoryItemViewEvent directoryItemViewEvent = (DirectoryViewEvent.DirectoryItemViewEvent) obj4;
                                directoryItemViewEvent.getClass();
                                scoreHomeKt$$ExternalSyntheticLambda822.invoke(directoryItemViewEvent, itemViewModel22);
                                break;
                            case 1:
                                DirectoryViewEvent.DirectoryItemViewEvent directoryItemViewEvent2 = (DirectoryViewEvent.DirectoryItemViewEvent) obj4;
                                directoryItemViewEvent2.getClass();
                                scoreHomeKt$$ExternalSyntheticLambda822.invoke(directoryItemViewEvent2, itemViewModel22);
                                break;
                            default:
                                DirectoryViewEvent directoryViewEvent = (DirectoryViewEvent) obj4;
                                directoryViewEvent.getClass();
                                if (directoryViewEvent instanceof DirectoryViewEvent.DirectoryItemViewEvent) {
                                    scoreHomeKt$$ExternalSyntheticLambda822.invoke(directoryViewEvent, itemViewModel22);
                                    break;
                                }
                                break;
                        }
                    }
                });
                return Unit.INSTANCE;
            case 15:
                final DirectoryListItem.ItemViewModel itemViewModel3 = (DirectoryListItem.ItemViewModel) obj3;
                final ScoreHomeKt$$ExternalSyntheticLambda8 scoreHomeKt$$ExternalSyntheticLambda83 = (ScoreHomeKt$$ExternalSyntheticLambda8) obj2;
                MooncakeFlatRowItemView mooncakeFlatRowItemView = (MooncakeFlatRowItemView) obj;
                mooncakeFlatRowItemView.getClass();
                MooncakeFlatRowItemView.setModel$default(mooncakeFlatRowItemView, this.f$2, itemViewModel3, false, new Ui.EventReceiver() { // from class: com.squareup.cash.directory_ui.views.CardSectionViewKt$$ExternalSyntheticLambda3
                    @Override // app.cash.broadway.ui.Ui.EventReceiver
                    public final void sendEvent(Object obj4) {
                        int i9 = i2;
                        DirectoryListItem.ItemViewModel itemViewModel22 = itemViewModel3;
                        ScoreHomeKt$$ExternalSyntheticLambda8 scoreHomeKt$$ExternalSyntheticLambda822 = (ScoreHomeKt$$ExternalSyntheticLambda8) scoreHomeKt$$ExternalSyntheticLambda83;
                        switch (i9) {
                            case 0:
                                DirectoryViewEvent.DirectoryItemViewEvent directoryItemViewEvent = (DirectoryViewEvent.DirectoryItemViewEvent) obj4;
                                directoryItemViewEvent.getClass();
                                scoreHomeKt$$ExternalSyntheticLambda822.invoke(directoryItemViewEvent, itemViewModel22);
                                break;
                            case 1:
                                DirectoryViewEvent.DirectoryItemViewEvent directoryItemViewEvent2 = (DirectoryViewEvent.DirectoryItemViewEvent) obj4;
                                directoryItemViewEvent2.getClass();
                                scoreHomeKt$$ExternalSyntheticLambda822.invoke(directoryItemViewEvent2, itemViewModel22);
                                break;
                            default:
                                DirectoryViewEvent directoryViewEvent = (DirectoryViewEvent) obj4;
                                directoryViewEvent.getClass();
                                if (directoryViewEvent instanceof DirectoryViewEvent.DirectoryItemViewEvent) {
                                    scoreHomeKt$$ExternalSyntheticLambda822.invoke(directoryViewEvent, itemViewModel22);
                                    break;
                                }
                                break;
                        }
                    }
                }, 4, null);
                return Unit.INSTANCE;
            case 16:
                ReusableGraphicsLayerScope reusableGraphicsLayerScope2 = (ReusableGraphicsLayerScope) obj;
                reusableGraphicsLayerScope2.getClass();
                reusableGraphicsLayerScope2.setTranslationY((1.0f - ((Number) ((State) obj2).getValue()).floatValue()) * (((ParcelableSnapshotMutableIntState) obj3).getIntValue() + i4));
                return Unit.INSTANCE;
            case 17:
                Function1 function13 = (Function1) obj2;
                LazyListScope lazyListScope2 = (LazyListScope) obj;
                lazyListScope2.getClass();
                LazyListScope.item$default(lazyListScope2, null, null, InvestingCategoryDetailKt.lambda$847654628, 3);
                InvestingCategoryDetailViewModel.Content content = (InvestingCategoryDetailViewModel.Content) ((InvestingCategoryDetailViewModel) obj3);
                List list3 = content.searchResult;
                if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                    Iterator it = list3.iterator();
                    while (it.hasNext()) {
                        if (((InvestingSearchRow) it.next()) instanceof InvestingFilterResultViewModel) {
                            List list4 = content.searchResult;
                            lazyListScope2.items(list4.size(), null, new SectionKt$sectionItemsIndexed$$inlined$itemsIndexed$default$3(list4, 22), new ComposableLambdaImpl(new ShiftListContentKt$ShiftListContent$lambda$4$0$$inlined$items$3(11, function13, list4), true, 802480018));
                            return Unit.INSTANCE;
                        }
                    }
                }
                LazyListScope.item$default(lazyListScope2, null, null, new ComposableLambdaImpl(new TabToolbarsKt$$ExternalSyntheticLambda21(i4, 9), true, 1043104831), 3);
                List list42 = content.searchResult;
                lazyListScope2.items(list42.size(), null, new SectionKt$sectionItemsIndexed$$inlined$itemsIndexed$default$3(list42, 22), new ComposableLambdaImpl(new ShiftListContentKt$ShiftListContent$lambda$4$0$$inlined$items$3(11, function13, list42), true, 802480018));
                return Unit.INSTANCE;
            case 18:
                Function1 function14 = (Function1) obj2;
                RelativeLayoutBounds relativeLayoutBounds = (RelativeLayoutBounds) obj;
                relativeLayoutBounds.getClass();
                Integer valueOf = Integer.valueOf(i4);
                long j2 = relativeLayoutBounds.topLeft;
                long j3 = relativeLayoutBounds.bottomRight;
                ((Map) obj3).put(valueOf, Integer.valueOf(((int) j3) - ((int) j2)));
                if (i4 == 0) {
                    function14.invoke(Integer.valueOf(((int) j3) - ((int) j2)));
                }
                return Unit.INSTANCE;
            case 19:
                HuffmanTreeGroup huffmanTreeGroup = (HuffmanTreeGroup) obj3;
                BottomSheet bottomSheet = (BottomSheet) obj2;
                float floatValue2 = ((Float) obj).floatValue();
                BottomSheetDragHandle bottomSheetDragHandle = (BottomSheetDragHandle) huffmanTreeGroup.trees;
                PaintDrawable paintDrawable = (PaintDrawable) huffmanTreeGroup.codes;
                float f3 = bottomSheetDragHandle.paddedHeight;
                int i9 = huffmanTreeGroup.alphabetSize + i4;
                Integer num = bottomSheet.peekHeight;
                ViewGroup viewGroup = bottomSheet.sheet;
                if (num != null && viewGroup.getLayoutParams().height == -1) {
                    int sheetY$overlays = bottomSheet.getSheetY$overlays();
                    Integer peekY$overlays = bottomSheet.getPeekY$overlays();
                    peekY$overlays.getClass();
                    if (sheetY$overlays < peekY$overlays.intValue()) {
                        Integer peekY$overlays2 = bottomSheet.getPeekY$overlays();
                        peekY$overlays2.getClass();
                        float intValue = peekY$overlays2.intValue() - bottomSheet.getSheetY$overlays();
                        bottomSheet.getPeekY$overlays().getClass();
                        f = intValue / (r2.intValue() - bottomSheet.getSheetTopBound$overlays());
                    }
                    f2 = 1.0f - f;
                    f3 = Math.max(f3, i9 * f);
                } else if (viewGroup.getHeight() >= bottomSheet.getSheetBottomBound$overlays() - bottomSheet.getPaddingTop()) {
                    f3 = Math.max(f3, i9 * (1.0f - floatValue2));
                }
                int width = (bottomSheet.getWidth() / 2) - (viewGroup.getWidth() / 2);
                paintDrawable.setBounds(width, bottomSheet.getSheetY$overlays() - ((int) f3), bottomSheet.getWidth() - width, bottomSheet.getBottom());
                Rect bounds = paintDrawable.getBounds();
                bounds.getClass();
                bottomSheetDragHandle.getClass();
                bottomSheetDragHandle.getPaint().setAlpha(MathKt__MathJVMKt.roundToInt(f2 * 255.0f));
                int centerX = bounds.centerX();
                Size size = bottomSheetDragHandle.size;
                int width2 = centerX - (size.getWidth() / 2);
                int i10 = bounds.top;
                int i11 = bottomSheetDragHandle.topPadding;
                bottomSheetDragHandle.setBounds(width2, i10 + i11, (size.getWidth() / 2) + bounds.centerX(), size.getHeight() + bounds.top + i11);
                return Unit.INSTANCE;
            default:
                ReusableGraphicsLayerScope reusableGraphicsLayerScope3 = (ReusableGraphicsLayerScope) obj;
                reusableGraphicsLayerScope3.getClass();
                reusableGraphicsLayerScope3.setTranslationY((((Number) ((State) obj2).getValue()).floatValue() + ((Number) ((State) obj3).getValue()).floatValue()) * i4);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ PoolGoalMetKt$$ExternalSyntheticLambda6(Object obj, int i, Object obj2, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$2 = i;
        this.f$1 = obj2;
    }

    public /* synthetic */ PoolGoalMetKt$$ExternalSyntheticLambda6(Object obj, Object obj2, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = i;
    }
}
