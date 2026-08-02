package app.cash.redwood;

import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.View;
import androidx.camera.camera2.interop.CaptureRequestOptions$Builder$Companion$$ExternalSyntheticLambda0;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.lazy.LazyItemScopeImpl;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.grid.LazyGridIntervalContent;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.material.AnchoredDraggableState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Latch$await$2$2;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidImageBitmap;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.ReusableGraphicsLayerScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.view.ViewCompat;
import androidx.datastore.preferences.core.MutablePreferences;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.arcade.protocol.host.arcade.AccessibilityActionImpl;
import app.cash.arcade.protocol.host.arcade.AccessibilityEnabledImpl;
import app.cash.arcade.protocol.host.arcade.AccessibilityLabelImpl;
import app.cash.arcade.protocol.host.arcade.AccessibilityRoleImpl;
import app.cash.arcade.protocol.host.arcade.BackgroundColorImpl;
import app.cash.arcade.protocol.host.arcade.CornerRadiusImpl;
import app.cash.arcade.protocol.host.arcade.LoadingScreenImpl;
import app.cash.arcade.protocol.host.arcade.ReuseImpl;
import app.cash.local.viewmodels.LocalBrandProfileViewEvent;
import app.cash.local.viewmodels.MoreOptionsMenuEvent;
import app.cash.local.viewmodels.wallet.BrandCollectionModel;
import app.cash.local.viewmodels.wallet.BrandSheetViewEvent;
import app.cash.local.views.LocalViewFactory$$ExternalSyntheticLambda6;
import app.cash.local.views.cart.CartBannerViewKt$$ExternalSyntheticLambda2;
import app.cash.local.views.map.BrandSheetViewKt$$ExternalSyntheticLambda1;
import app.cash.local.views.map.BrandSheetViewKt$$ExternalSyntheticLambda6;
import app.cash.local.views.wallet.TabContentViewKt$$ExternalSyntheticLambda6;
import app.cash.molecule.GatedFrameClock;
import app.cash.redwood.Modifier;
import app.cash.redwood.protocol.host.ProtocolNode;
import coil3.network.NetworkFetcher$doFetch$2;
import com.braze.BrazeUser;
import com.braze.ui.UserJavascriptInterfaceBase;
import com.braze.ui.actions.brazeactions.steps.SetCustomUserAttributeStep;
import com.braze.ui.actions.brazeactions.steps.StepData;
import com.caverock.androidsvg.SVG;
import com.google.android.material.timepicker.ClockFaceView;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.google.firebase.heartbeatinfo.HeartBeatInfoStorage;
import com.knotapi.knot.utilities.BreadcrumbHelper;
import com.squareup.cardcustomizations.signature.Point;
import com.squareup.cardcustomizations.signature.Signature;
import com.squareup.cardcustomizations.signature.SignatureState;
import com.squareup.cardcustomizations.signature.SignatureStateListener;
import com.squareup.cardcustomizations.stampview.InitialStampsData;
import com.squareup.cardcustomizations.stampview.PatternStampState;
import com.squareup.cardcustomizations.stampview.Stamp;
import com.squareup.cardcustomizations.stampview.StampMovingListener;
import com.squareup.cardcustomizations.stampview.StampState;
import com.squareup.cardcustomizations.stampview.TransformedStamp;
import com.squareup.cash.R;
import com.squareup.cash.activity.backend.contacts.ActivityContact;
import com.squareup.cash.activity.presenters.RealActivityEmbeddedPresenter;
import com.squareup.cash.activity.viewmodels.ActivityCustomerModel;
import com.squareup.cash.activity.viewmodels.ActivityEmbeddedViewEvent;
import com.squareup.cash.activity.viewmodels.ActivityEmbeddedViewModel;
import com.squareup.cash.activity.viewmodels.ActivityFeedEntry;
import com.squareup.cash.activity.viewmodels.ActivityTabViewModel;
import com.squareup.cash.activity.viewmodels.AppMessageEvent;
import com.squareup.cash.activity.viewmodels.ReceiptViewEvent;
import com.squareup.cash.activity.views.AvatarsKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticLambda9;
import com.squareup.cash.advertising.viewmodels.FullscreenAdViewModel;
import com.squareup.cash.advertising.views.FullscreenAdView;
import com.squareup.cash.advertising.views.FullscreenAdViewKt$sam$app_cash_broadway_ui_Ui_EventReceiver$0;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpayAppletHomeContentViewModel;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpaySearchViewModel;
import com.squareup.cash.afterpayapplet.viewmodels.TappableIcon;
import com.squareup.cash.afterpayapplet.viewmodels.viewevents.AfterpaySearchViewEvent;
import com.squareup.cash.agents.applets.viewmodels.AgentsHomeContentState;
import com.squareup.cash.agents.applets.viewmodels.AgentsHomeViewModel;
import com.squareup.cash.agents.applets.views.AgentsHomeViewKt;
import com.squareup.cash.agents.applets.views.AgentsHomeViewKt$AgentsHome$lambda$1$0$$inlined$items$3;
import com.squareup.cash.amountslider.AmountPickerCondensedView;
import com.squareup.cash.appmessages.AppMessageViewEvent;
import com.squareup.cash.appmessages.db.CardMessageQueries$$ExternalSyntheticLambda1;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.LazyScaffoldContentScope;
import com.squareup.cash.arcade.components.SearchBarKeyboardState;
import com.squareup.cash.arcade.components.avatar.AvatarCarouselEntry;
import com.squareup.cash.borrow.views.BorrowHomeKt$BorrowHome$lambda$1$0$$inlined$itemsIndexed$default$2;
import com.squareup.cash.borrow.views.BorrowHomeKt$BorrowHome$lambda$1$0$$inlined$itemsIndexed$default$3;
import com.squareup.cash.card.onboarding.DisclosurePresenter;
import com.squareup.cash.common.viewmodels.AvatarBadgeViewModel;
import com.squareup.cash.common.viewmodels.AvatarViewModel;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.mooncake.resources.ColorsKt;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.multiplatform.accentcolors.AccentColorsKt;
import com.squareup.cash.nearby.views.DotGridKt$DotGrid$2$1$$ExternalSyntheticLambda0;
import com.squareup.cash.profile.views.OpenSourceKt$$ExternalSyntheticLambda6;
import com.squareup.cash.recipients.data.Recipient;
import com.squareup.cash.score.views.ScoreUiFactory$$ExternalSyntheticLambda0;
import com.squareup.cash.sheet.RealSheetState;
import com.squareup.cash.treehouse.android.platform.CashTreehouseLayout;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.ui.MerchantData;
import com.squareup.protos.franklin.ui.ReceiptSection;
import com.squareup.protos.franklin.ui.Timeline;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.StandaloneCoroutine;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.channels.ChannelResult;
import net.idrnd.face.iad.capture.internal.o0;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes3.dex */
public final /* synthetic */ class CombinedModifier$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ CombinedModifier$$ExternalSyntheticLambda0(Set set, List list, DisclosurePresenter disclosurePresenter) {
        this.$r8$classId = 19;
        this.f$0 = set;
        this.f$1 = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:168:0x04cf  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x04da  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x051c  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x052a  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x04e2  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x04d2  */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v12, types: [com.squareup.cash.common.viewmodels.AvatarBadgeViewModel$IconToken, java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v14 */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        Unit incrementCustomUserAttribute$lambda$1;
        Unit customUserAttributeArray$lambda$1;
        Unit run$lambda$0;
        Object obj2;
        Object obj3;
        boolean z;
        Color color;
        AvatarViewModel avatarViewModel;
        AvatarViewModel copy$default;
        Boolean bool;
        Boolean bool2;
        String str;
        int i = this.$r8$classId;
        int i2 = 23;
        int i3 = 21;
        float f = RecyclerView.DECELERATION_RATE;
        int i4 = 13;
        final int i5 = 0;
        final int i6 = 1;
        ?? r14 = 0;
        Object obj4 = null;
        Object obj5 = this.f$1;
        Object obj6 = this.f$0;
        switch (i) {
            case 0:
                Ref$BooleanRef ref$BooleanRef = (Ref$BooleanRef) obj6;
                StringBuilder sb = (StringBuilder) obj5;
                Modifier.Element element = (Modifier.Element) obj;
                element.getClass();
                if (!ref$BooleanRef.element) {
                    sb.append(", ");
                }
                ref$BooleanRef.element = false;
                sb.append(element);
                return Unit.INSTANCE;
            case 1:
                Function1 function1 = (Function1) obj6;
                BrandCollectionModel.Location location = (BrandCollectionModel.Location) obj5;
                LocalBrandProfileViewEvent localBrandProfileViewEvent = (LocalBrandProfileViewEvent) obj;
                localBrandProfileViewEvent.getClass();
                if (localBrandProfileViewEvent instanceof MoreOptionsMenuEvent.AddBrandClicked) {
                    function1.invoke(new BrandSheetViewEvent.AddBrandClicked(location.brandSpot));
                }
                return Unit.INSTANCE;
            case 2:
                RealSheetState realSheetState = (RealSheetState) obj6;
                ReusableGraphicsLayerScope reusableGraphicsLayerScope = (ReusableGraphicsLayerScope) obj;
                reusableGraphicsLayerScope.getClass();
                if (!((Boolean) ((MutableState) obj5).getValue()).booleanValue()) {
                    f = 1.0f - realSheetState.getExpandProgress();
                }
                reusableGraphicsLayerScope.setAlpha(f);
                return Unit.INSTANCE;
            case 3:
                ((GatedFrameClock) obj6).isRunning = false;
                ChannelResult.m4192getOrThrowimpl(((BufferedChannel) obj5).mo1159trySendJP2dKIU(obj));
                return Unit.INSTANCE;
            case 4:
                SVG svg = (SVG) obj6;
                Modifier.UnscopedElement unscopedElement = (Modifier.UnscopedElement) obj;
                unscopedElement.getClass();
                Object value = ((ProtocolNode) obj5).getWidget().getValue();
                svg.getClass();
                value.getClass();
                AnchoredDraggableState anchoredDraggableState = (AnchoredDraggableState) svg.rootElement;
                if (unscopedElement instanceof ReuseImpl) {
                } else if (unscopedElement instanceof BackgroundColorImpl) {
                    View view = (View) value;
                    view.setBackgroundColor(ColorsKt.toColorInt$default(((BackgroundColorImpl) unscopedElement).color, ThemeHelpersKt.themeInfo(view)));
                } else if (unscopedElement instanceof CornerRadiusImpl) {
                } else if (unscopedElement instanceof LoadingScreenImpl) {
                    CashTreehouseLayout.setLoading$default((CashTreehouseLayout) ((o0) anchoredDraggableState.velocityThreshold).a, ((LoadingScreenImpl) unscopedElement).isLoading, 1);
                } else if (unscopedElement instanceof AccessibilityRoleImpl) {
                    ViewCompat.setAccessibilityDelegate((View) value, new ClockFaceView.AnonymousClass2((AccessibilityRoleImpl) unscopedElement, 8));
                } else if (unscopedElement instanceof AccessibilityLabelImpl) {
                    ((View) value).setContentDescription(((AccessibilityLabelImpl) unscopedElement).label);
                } else if (unscopedElement instanceof AccessibilityEnabledImpl) {
                    ((View) value).setImportantForAccessibility(((AccessibilityEnabledImpl) unscopedElement).isEnabled ? 1 : 2);
                } else if (unscopedElement instanceof AccessibilityActionImpl) {
                    AccessibilityActionImpl accessibilityActionImpl = (AccessibilityActionImpl) unscopedElement;
                    ViewCompat.addAccessibilityAction((View) value, accessibilityActionImpl.label, new CaptureRequestOptions$Builder$Companion$$ExternalSyntheticLambda0(29, anchoredDraggableState, accessibilityActionImpl));
                }
                return Unit.INSTANCE;
            case 5:
                incrementCustomUserAttribute$lambda$1 = UserJavascriptInterfaceBase.incrementCustomUserAttribute$lambda$1((String) obj6, (Integer) obj5, (BrazeUser) obj);
                return incrementCustomUserAttribute$lambda$1;
            case 6:
                customUserAttributeArray$lambda$1 = UserJavascriptInterfaceBase.setCustomUserAttributeArray$lambda$1((String) obj6, (String[]) obj5, (BrazeUser) obj);
                return customUserAttributeArray$lambda$1;
            case 7:
                run$lambda$0 = SetCustomUserAttributeStep.run$lambda$0((StepData) obj6, obj5, (BrazeUser) obj);
                return run$lambda$0;
            case 8:
                String str2 = (String) obj5;
                MutablePreferences mutablePreferences = (MutablePreferences) obj;
                mutablePreferences.set(HeartBeatInfoStorage.LAST_STORED_DATE, str2);
                ((HeartBeatInfoStorage) obj6).removeStoredDate(mutablePreferences, str2);
                return null;
            case 9:
                ((CartBannerViewKt$$ExternalSyntheticLambda2) obj6).invoke((String) obj5, (Size) obj);
                return Unit.INSTANCE;
            case 10:
                SignatureState signatureState = (SignatureState) obj6;
                MutableState mutableState = (MutableState) obj5;
                Offset offset = (Offset) obj;
                Signature signature$customizations = signatureState.getSignature$customizations();
                if (signature$customizations != null) {
                    long m625minusMKHz9U = Offset.m625minusMKHz9U(offset.packedValue, ((Offset) mutableState.getValue()).packedValue);
                    Point.Timestamped timestamped = (Point.Timestamped) CollectionsKt.last(((Signature.Glyph) CollectionsKt.last(signature$customizations.userDrawnGlyphs())).painter.points());
                    Signature signature$customizations2 = signatureState.getSignature$customizations();
                    if (signature$customizations2 != null) {
                        signature$customizations2.extendGlyph(Float.intBitsToFloat((int) (m625minusMKHz9U >> 32)) + timestamped.x, Float.intBitsToFloat((int) (m625minusMKHz9U & BodyPartID.bodyIdMax)) + timestamped.y, SystemClock.uptimeMillis());
                    }
                    if (!Intrinsics.areEqual((Point.Timestamped) CollectionsKt.last(((Signature.Glyph) CollectionsKt.last(signature$customizations.userDrawnGlyphs())).painter.points()), timestamped)) {
                        mutableState.setValue(new Offset(offset.packedValue));
                    }
                }
                signatureState.setInvalidate$customizations(signatureState.getInvalidate$customizations() + 1);
                return Unit.INSTANCE;
            case 11:
                SignatureStateListener signatureStateListener = (SignatureStateListener) obj6;
                SignatureState signatureState2 = (SignatureState) obj5;
                Offset offset2 = (Offset) obj;
                if (signatureStateListener != null) {
                    signatureStateListener.onStartedSigning();
                }
                Signature signature$customizations3 = signatureState2.getSignature$customizations();
                if (signature$customizations3 != null) {
                    signature$customizations3.startGlyph();
                }
                Signature signature$customizations4 = signatureState2.getSignature$customizations();
                if (signature$customizations4 != null) {
                    signature$customizations4.extendGlyph(Float.intBitsToFloat((int) (signatureState2.m2966getSignatureOffsetF1C5BW0$customizations() >> 32)) + Float.intBitsToFloat((int) (offset2.packedValue >> 32)), Float.intBitsToFloat((int) (signatureState2.m2966getSignatureOffsetF1C5BW0$customizations() & BodyPartID.bodyIdMax)) + Float.intBitsToFloat((int) (offset2.packedValue & BodyPartID.bodyIdMax)), SystemClock.uptimeMillis());
                }
                signatureState2.setInvalidate$customizations(signatureState2.getInvalidate$customizations() + 1);
                return Unit.INSTANCE;
            case 12:
                PatternStampState patternStampState = (PatternStampState) obj6;
                LayoutCoordinates layoutCoordinates = (LayoutCoordinates) obj;
                layoutCoordinates.getClass();
                patternStampState.canvasSize$delegate.setValue(new IntSize(layoutCoordinates.mo838getSizeYbymL2g()));
                patternStampState.stampSaveArea$delegate.setValue(new RectF(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, (int) (layoutCoordinates.mo838getSizeYbymL2g() >> 32), (int) (layoutCoordinates.mo838getSizeYbymL2g() & BodyPartID.bodyIdMax)));
                AndroidPath androidPath = (AndroidPath) patternStampState.clipPath$delegate.getValue();
                androidPath.reset();
                RoundedCornerShape roundedCornerShape = (RoundedCornerShape) patternStampState.clip$delegate.getValue();
                LayoutDirection layoutDirection = LayoutDirection.Ltr;
                float mo838getSizeYbymL2g = (int) (layoutCoordinates.mo838getSizeYbymL2g() >> 32);
                ParcelableSnapshotMutableState parcelableSnapshotMutableState = patternStampState.margin$delegate;
                ColorKt.addOutline(androidPath, roundedCornerShape.mo175createOutlinePq9zytI((Float.floatToRawIntBits(mo838getSizeYbymL2g - (((Number) parcelableSnapshotMutableState.getValue()).floatValue() * 2.0f)) << 32) | (Float.floatToRawIntBits(((int) (layoutCoordinates.mo838getSizeYbymL2g() & BodyPartID.bodyIdMax)) - (((Number) parcelableSnapshotMutableState.getValue()).floatValue() * 2.0f)) & BodyPartID.bodyIdMax), layoutDirection, (Density) obj5));
                androidPath.m667translatek4lQ0M((Float.floatToRawIntBits(((Number) parcelableSnapshotMutableState.getValue()).floatValue()) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(((Number) parcelableSnapshotMutableState.getValue()).floatValue()) << 32));
                return Unit.INSTANCE;
            case 13:
                PatternStampState patternStampState2 = (PatternStampState) obj6;
                StampMovingListener stampMovingListener = (StampMovingListener) obj5;
                long j = ((Offset) obj).packedValue;
                patternStampState2.trashBinDirectionResolved = false;
                if (!Offset.m622equalsimpl0(j, 9205357640488583168L)) {
                    PointF pointF = new PointF(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & BodyPartID.bodyIdMax)));
                    List stamps$customizations = patternStampState2.getStamps$customizations();
                    ListIterator listIterator = stamps$customizations.listIterator(stamps$customizations.size());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            Object previous = listIterator.previous();
                            if (((TransformedStamp) previous).bounds().contains(pointF.x, pointF.y)) {
                                obj2 = previous;
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    if (((TransformedStamp) obj2) != null) {
                        List<TransformedStamp> stamps$customizations2 = patternStampState2.getStamps$customizations();
                        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(stamps$customizations2, 10));
                        for (TransformedStamp transformedStamp : stamps$customizations2) {
                            arrayList.add(TransformedStamp.copy$default(transformedStamp, new Matrix(transformedStamp.transform), new Matrix(transformedStamp.transform)));
                        }
                        patternStampState2.movingStamps$delegate.setValue(arrayList);
                        patternStampState2.setStamps$customizations(EmptyList.INSTANCE);
                    }
                }
                if (stampMovingListener != null) {
                    stampMovingListener.onStampStartMoving();
                }
                return Unit.INSTANCE;
            case 14:
                StampState stampState = (StampState) obj6;
                ParcelableSnapshotMutableState parcelableSnapshotMutableState2 = stampState.margin$delegate;
                Density density = (Density) obj5;
                LayoutCoordinates layoutCoordinates2 = (LayoutCoordinates) obj;
                layoutCoordinates2.getClass();
                ParcelableSnapshotMutableState parcelableSnapshotMutableState3 = stampState.canvasSize$delegate;
                if (!IntSize.m1055equalsimpl0(((IntSize) parcelableSnapshotMutableState3.getValue()).packedValue, layoutCoordinates2.mo838getSizeYbymL2g())) {
                    parcelableSnapshotMutableState3.setValue(new IntSize(layoutCoordinates2.mo838getSizeYbymL2g()));
                    stampState.stampSaveArea$delegate.setValue(new RectF(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, (int) (layoutCoordinates2.mo838getSizeYbymL2g() >> 32), (int) (layoutCoordinates2.mo838getSizeYbymL2g() & BodyPartID.bodyIdMax)));
                    AndroidPath androidPath2 = (AndroidPath) stampState.clipPath$delegate.getValue();
                    androidPath2.reset();
                    ColorKt.addOutline(androidPath2, ((RoundedCornerShape) stampState.clip$delegate.getValue()).mo175createOutlinePq9zytI((Float.floatToRawIntBits(((int) (layoutCoordinates2.mo838getSizeYbymL2g() & BodyPartID.bodyIdMax)) - (((Number) parcelableSnapshotMutableState2.getValue()).floatValue() * 2.0f)) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(((int) (layoutCoordinates2.mo838getSizeYbymL2g() >> 32)) - (((Number) parcelableSnapshotMutableState2.getValue()).floatValue() * 2.0f)) << 32), LayoutDirection.Ltr, density));
                    androidPath2.m667translatek4lQ0M((Float.floatToRawIntBits(((Number) parcelableSnapshotMutableState2.getValue()).floatValue()) << 32) | (Float.floatToRawIntBits(((Number) parcelableSnapshotMutableState2.getValue()).floatValue()) & BodyPartID.bodyIdMax));
                    Iterable iterable = stampState.initialState;
                    if (iterable == null) {
                        iterable = EmptyList.INSTANCE;
                    }
                    Iterable<InitialStampsData> iterable2 = iterable;
                    ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable2, 10));
                    for (InitialStampsData initialStampsData : iterable2) {
                        float mo838getSizeYbymL2g2 = (int) (layoutCoordinates2.mo838getSizeYbymL2g() >> 32);
                        float f2 = initialStampsData.customizationWidth;
                        Stamp stamp = initialStampsData.stamp;
                        float min = Math.min(mo838getSizeYbymL2g2 / f2, ((int) (layoutCoordinates2.mo838getSizeYbymL2g() & BodyPartID.bodyIdMax)) / initialStampsData.customizationHeight);
                        Matrix matrix = new Matrix();
                        matrix.preScale(min, min);
                        Matrix matrix2 = new Matrix();
                        PointF pointF2 = initialStampsData.stampCenter;
                        matrix2.setTranslate(pointF2.x - stamp.getCanvasBounds().centerX(), pointF2.y - stamp.getCanvasBounds().centerY());
                        matrix2.postScale(initialStampsData.stampWidth / stamp.getCanvasBounds().width(), initialStampsData.stampHeight / stamp.getCanvasBounds().height(), pointF2.x, pointF2.y);
                        matrix2.postRotate((float) Math.toDegrees(initialStampsData.stampRotation), pointF2.x, pointF2.y);
                        matrix2.postConcat(matrix);
                        arrayList2.add(new TransformedStamp(stamp, matrix2, initialStampsData.stampMinSize / 100.0f));
                    }
                    stampState.stamps$delegate.setValue(arrayList2);
                    stampState.customizationDeque.push(arrayList2);
                }
                return Unit.INSTANCE;
            case 15:
                StampState stampState2 = (StampState) obj6;
                StampMovingListener stampMovingListener2 = (StampMovingListener) obj5;
                long j2 = ((Offset) obj).packedValue;
                stampState2.trashBinDirectionResolved = false;
                if (!Offset.m622equalsimpl0(j2, 9205357640488583168L)) {
                    PointF pointF3 = new PointF(Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & BodyPartID.bodyIdMax)));
                    List stamps$customizations3 = stampState2.getStamps$customizations();
                    ListIterator listIterator2 = stamps$customizations3.listIterator(stamps$customizations3.size());
                    while (true) {
                        if (listIterator2.hasPrevious()) {
                            Object previous2 = listIterator2.previous();
                            if (((TransformedStamp) previous2).bounds().contains(pointF3.x, pointF3.y)) {
                                obj3 = previous2;
                            }
                        } else {
                            obj3 = null;
                        }
                    }
                    TransformedStamp transformedStamp2 = (TransformedStamp) obj3;
                    if (transformedStamp2 != null) {
                        Matrix matrix3 = transformedStamp2.transform;
                        stampState2.movingStamp$delegate.setValue(TransformedStamp.copy$default(transformedStamp2, new Matrix(matrix3), new Matrix(matrix3)));
                        stampState2.stamps$delegate.setValue(CollectionsKt.minus(stampState2.getStamps$customizations(), transformedStamp2));
                    }
                }
                if (stampMovingListener2 != null) {
                    stampMovingListener2.onStampStartMoving();
                }
                return Unit.INSTANCE;
            case 16:
                SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver.getClass();
                SemanticsPropertiesKt.onClick(semanticsPropertyReceiver, ((Resources) obj6).getString(R.string.account_header_add_a_profile_pic_description), new TabContentViewKt$$ExternalSyntheticLambda6(13, (Function1) obj5));
                return Unit.INSTANCE;
            case 17:
                AndroidImageBitmap androidImageBitmap = (AndroidImageBitmap) obj6;
                DrawScope drawScope = (DrawScope) obj;
                drawScope.getClass();
                long ceil = (((int) Math.ceil(Float.intBitsToFloat((int) (drawScope.mo753getSizeNHjbRc() >> 32)))) << 32) | (((int) Math.ceil((Float.intBitsToFloat((int) (drawScope.mo753getSizeNHjbRc() >> 32)) / androidImageBitmap.bitmap.getWidth()) * androidImageBitmap.bitmap.getHeight())) & BodyPartID.bodyIdMax);
                DrawScope.m739drawImageAZ2fEMs$default(drawScope, androidImageBitmap, 0L, 0L, ceil, RecyclerView.DECELERATION_RATE, null, 0, 0, IptcConstants.IMAGE_RESOURCE_BLOCK_ALPHA_CHANNELS_NAMES);
                DrawScope.m739drawImageAZ2fEMs$default(drawScope, (AndroidImageBitmap) obj5, 0L, 0L, ceil, RecyclerView.DECELERATION_RATE, null, 0, 0, IptcConstants.IMAGE_RESOURCE_BLOCK_ALPHA_CHANNELS_NAMES);
                return Unit.INSTANCE;
            case 18:
                CoroutineScope coroutineScope = (CoroutineScope) obj6;
                RealActivityEmbeddedPresenter realActivityEmbeddedPresenter = (RealActivityEmbeddedPresenter) obj5;
                ActivityEmbeddedViewEvent activityEmbeddedViewEvent = (ActivityEmbeddedViewEvent) obj;
                activityEmbeddedViewEvent.getClass();
                if (activityEmbeddedViewEvent instanceof ActivityEmbeddedViewEvent.Refresh) {
                    JobKt.launch$default(coroutineScope, null, null, new NetworkFetcher$doFetch$2(realActivityEmbeddedPresenter, activityEmbeddedViewEvent, null, i2), 3);
                } else if (activityEmbeddedViewEvent.equals(ActivityEmbeddedViewEvent.LoadMore.INSTANCE)) {
                    StandaloneCoroutine standaloneCoroutine = realActivityEmbeddedPresenter.loadMoreJob;
                    if (standaloneCoroutine == null || !standaloneCoroutine.isActive()) {
                        realActivityEmbeddedPresenter.loadMoreJob = JobKt.launch$default(coroutineScope, null, null, new AmountPickerCondensedView.AnonymousClass14(realActivityEmbeddedPresenter, null, r12), 3);
                    }
                } else {
                    if (!activityEmbeddedViewEvent.equals(ActivityEmbeddedViewEvent.ShowMoreClicked.INSTANCE)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    Function0 function0 = realActivityEmbeddedPresenter.configuration.showMoreCallback;
                    if (function0 != null) {
                        function0.invoke();
                    }
                }
                return Unit.INSTANCE;
            case 19:
                Set set = (Set) obj6;
                List list = (List) obj5;
                List list2 = (List) obj;
                list2.getClass();
                List<ActivityContact> sortedWith = CollectionsKt.sortedWith(list2, ComparisonsKt__ComparisonsKt.compareBy(new DotGridKt$DotGrid$2$1$$ExternalSyntheticLambda0(1, set), new OpenSourceKt$$ExternalSyntheticLambda6(list, r12)));
                ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(sortedWith, 10));
                for (ActivityContact activityContact : sortedWith) {
                    List list3 = list;
                    if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                        Iterator it = list3.iterator();
                        while (it.hasNext()) {
                            if (Intrinsics.areEqual(((Recipient) it.next()).customerId, activityContact.customerId)) {
                                z = i6;
                                String str3 = activityContact.customerId;
                                MerchantData merchantData = activityContact.merchantData;
                                boolean contains = set.contains(str3);
                                Image image = activityContact.photo;
                                color = activityContact.themedAccentColor;
                                if (color != null || (r7 = com.squareup.util.cash.ColorsKt.validate(color)) == null) {
                                    Color uiColor = com.squareup.util.cash.ColorsKt.toUiColor(AccentColorsKt.getAccentColor$default(29, null, activityContact.customerId, null, null, null));
                                }
                                ColorModel.Accented accented = new ColorModel.Accented(uiColor);
                                String str4 = activityContact.displayName;
                                boolean booleanValue = (merchantData != null || (bool2 = merchantData.should_colorize_avatar) == null) ? i5 : bool2.booleanValue();
                                boolean booleanValue2 = (merchantData != null || (bool = merchantData.should_fill_background) == null) ? i5 : bool.booleanValue();
                                String str5 = activityContact.lookupKey;
                                String str6 = activityContact.email;
                                String str7 = activityContact.sms;
                                Icons icons = !contains ? Icons.SecurityCheckFill16 : z != 0 ? Icons.FavoriteFill16 : r14;
                                AvatarViewModel avatarViewModel2 = new AvatarViewModel(image, accented, str4, (String) null, booleanValue, booleanValue2, str5, str6, str7, icons == null ? new AvatarBadgeViewModel.IconToken(icons) : r14, (String) null, z, contains, 18449);
                                if (activityContact.isBusiness && !activityContact.isLoyaltyOnly && merchantData == null) {
                                    String str8 = activityContact.displayName;
                                    copy$default = AvatarViewModel.copy$default(avatarViewModel2, StringsKt.substringBefore(str8, " ", str8), r14, 32695);
                                } else if (activityContact.hasLoyaltyData) {
                                    avatarViewModel = avatarViewModel2;
                                    arrayList3.add(new ActivityCustomerModel(activityContact.photo, activityContact.themedAccentColor, activityContact.customerId, activityContact.isBusiness, activityContact.displayName, activityContact.merchantData, activityContact.lookupKey, activityContact.email, activityContact.sms, activityContact.blocked, activityContact.displayDate, activityContact.isLoyaltyOnly, activityContact.canAcceptPayments, activityContact.hasLoyaltyData, activityContact.isRegular, avatarViewModel));
                                    set = set;
                                    i5 = 0;
                                    i6 = 1;
                                    r14 = 0;
                                } else {
                                    copy$default = AvatarViewModel.copy$default(avatarViewModel2, r14, new AvatarBadgeViewModel.IconToken(Icons.FavoriteFill16), 31743);
                                }
                                avatarViewModel = copy$default;
                                arrayList3.add(new ActivityCustomerModel(activityContact.photo, activityContact.themedAccentColor, activityContact.customerId, activityContact.isBusiness, activityContact.displayName, activityContact.merchantData, activityContact.lookupKey, activityContact.email, activityContact.sms, activityContact.blocked, activityContact.displayDate, activityContact.isLoyaltyOnly, activityContact.canAcceptPayments, activityContact.hasLoyaltyData, activityContact.isRegular, avatarViewModel));
                                set = set;
                                i5 = 0;
                                i6 = 1;
                                r14 = 0;
                            }
                        }
                    }
                    z = i5;
                    String str32 = activityContact.customerId;
                    MerchantData merchantData2 = activityContact.merchantData;
                    boolean contains2 = set.contains(str32);
                    Image image2 = activityContact.photo;
                    color = activityContact.themedAccentColor;
                    if (color != null) {
                    }
                    Color uiColor2 = com.squareup.util.cash.ColorsKt.toUiColor(AccentColorsKt.getAccentColor$default(29, null, activityContact.customerId, null, null, null));
                    ColorModel.Accented accented2 = new ColorModel.Accented(uiColor2);
                    String str42 = activityContact.displayName;
                    if (merchantData2 != null) {
                    }
                    if (merchantData2 != null) {
                    }
                    String str52 = activityContact.lookupKey;
                    String str62 = activityContact.email;
                    String str72 = activityContact.sms;
                    if (!contains2) {
                    }
                    AvatarViewModel avatarViewModel22 = new AvatarViewModel(image2, accented2, str42, (String) null, booleanValue, booleanValue2, str52, str62, str72, icons == null ? new AvatarBadgeViewModel.IconToken(icons) : r14, (String) null, z, contains2, 18449);
                    if (activityContact.isBusiness) {
                    }
                    if (activityContact.hasLoyaltyData) {
                    }
                }
                return arrayList3;
            case 20:
                LazyListScope lazyListScope = (LazyListScope) obj;
                lazyListScope.getClass();
                AvatarsKt.activityEmbeddedItems(lazyListScope, (ActivityEmbeddedViewModel) obj6, (Function1) obj5, null, null, null);
                return Unit.INSTANCE;
            case 21:
                ActivityTabViewModel activityTabViewModel = (ActivityTabViewModel) obj6;
                Function1 function12 = (Function1) obj5;
                LazyListScope lazyListScope2 = (LazyListScope) obj;
                lazyListScope2.getClass();
                for (ActivityFeedEntry activityFeedEntry : activityTabViewModel.feedEntries) {
                    int i7 = 5;
                    if (activityFeedEntry instanceof ActivityFeedEntry.Header) {
                        ActivityFeedEntry.Header header = (ActivityFeedEntry.Header) activityFeedEntry;
                        String str9 = header.key;
                        LazyListScope.item$default(lazyListScope2, Recorder$$ExternalSyntheticOutline2.m$1(str9, " top spacer"), null, AvatarsKt.f122lambda$565801818, 2);
                        lazyListScope2.stickyHeader(str9, Reflection.factory.getOrCreateKotlinClass(activityFeedEntry.getClass()), new ComposableLambdaImpl(new ScoreUiFactory$$ExternalSyntheticLambda0(header, i7), true, 1437388314));
                        LazyListScope.item$default(lazyListScope2, str9 + " bottom spacer", null, AvatarsKt.lambda$1290246991, 2);
                    } else if (activityFeedEntry instanceof ActivityFeedEntry.Item) {
                        ActivityFeedEntry.Item item = (ActivityFeedEntry.Item) activityFeedEntry;
                        lazyListScope2.item(item.key, Reflection.factory.getOrCreateKotlinClass(activityFeedEntry.getClass()), new ComposableLambdaImpl(new BalanceFeedKt$$ExternalSyntheticLambda9(item, i7), true, 861389277));
                    } else if (activityFeedEntry instanceof ActivityFeedEntry.ErrorItem) {
                        lazyListScope2.item(((ActivityFeedEntry.ErrorItem) activityFeedEntry).key, Reflection.factory.getOrCreateKotlinClass(activityFeedEntry.getClass()), AvatarsKt.f123lambda$885628514);
                    } else if (activityFeedEntry instanceof ActivityFeedEntry.QuickAccessBar) {
                        lazyListScope2.item("quick access bar", Reflection.factory.getOrCreateKotlinClass(activityFeedEntry.getClass()), new ComposableLambdaImpl(new BrandSheetViewKt$$ExternalSyntheticLambda1(i4, activityFeedEntry, (Object) function12), true, 1662320991));
                    } else if (activityFeedEntry instanceof ActivityFeedEntry.EmptyItem) {
                        LazyListScope.item$default(lazyListScope2, "empty", null, new ComposableLambdaImpl(new BalanceFeedKt$$ExternalSyntheticLambda9((ActivityFeedEntry.EmptyItem) activityFeedEntry, 6), true, -84696800), 2);
                    } else if (activityFeedEntry instanceof ActivityFeedEntry.NewUserExperience) {
                        lazyListScope2.item("nux", Reflection.factory.getOrCreateKotlinClass(activityFeedEntry.getClass()), new ComposableLambdaImpl(new BrandSheetViewKt$$ExternalSyntheticLambda1(14, activityFeedEntry, (Object) function12), true, -1831714591));
                    } else if (activityFeedEntry instanceof ActivityFeedEntry.InviteFriendsItem) {
                        LazyListScope.item$default(lazyListScope2, "invite friends", null, new ComposableLambdaImpl(new BrandSheetViewKt$$ExternalSyntheticLambda1(15, activityFeedEntry, function12), true, 716234914), 2);
                    } else if (activityFeedEntry instanceof ActivityFeedEntry.InlineAppMessage) {
                        ActivityFeedEntry.InlineAppMessage inlineAppMessage = (ActivityFeedEntry.InlineAppMessage) activityFeedEntry;
                        lazyListScope2.item(inlineAppMessage.key, Reflection.factory.getOrCreateKotlinClass(activityFeedEntry.getClass()), new ComposableLambdaImpl(new BrandSheetViewKt$$ExternalSyntheticLambda1(16, (Object) inlineAppMessage, (Object) function12), true, -1030782877));
                    } else if (activityFeedEntry instanceof ActivityFeedEntry.InlineAppMessageV2) {
                        ActivityFeedEntry.InlineAppMessageV2 inlineAppMessageV2 = (ActivityFeedEntry.InlineAppMessageV2) activityFeedEntry;
                        lazyListScope2.item(inlineAppMessageV2.key, Reflection.factory.getOrCreateKotlinClass(activityFeedEntry.getClass()), new ComposableLambdaImpl(new LocalViewFactory$$ExternalSyntheticLambda6(18, activityTabViewModel, inlineAppMessageV2, function12), true, 1517166628));
                    } else {
                        if (!(activityFeedEntry instanceof ActivityFeedEntry.CardAppMessage)) {
                            OptionalProvider$$ExternalSyntheticLambda0.m();
                            return null;
                        }
                        ActivityFeedEntry.CardAppMessage cardAppMessage = (ActivityFeedEntry.CardAppMessage) activityFeedEntry;
                        lazyListScope2.item(cardAppMessage.key, Reflection.factory.getOrCreateKotlinClass(activityFeedEntry.getClass()), new ComposableLambdaImpl(new BrandSheetViewKt$$ExternalSyntheticLambda1(17, (Object) cardAppMessage, (Object) function12), true, -229851163));
                    }
                }
                if (activityTabViewModel.hasLoadingError) {
                    LazyListScope.item$default(lazyListScope2, BreadcrumbHelper.Category.ERROR, null, new ComposableLambdaImpl(new BrandSheetViewKt$$ExternalSyntheticLambda6(i4, function12), true, 1884256113), 2);
                } else if (activityTabViewModel.hasMore) {
                    LazyListScope.item$default(lazyListScope2, "has more", null, new ComposableLambdaImpl(new BrandSheetViewKt$$ExternalSyntheticLambda6(12, function12), true, -483495640), 2);
                }
                return Unit.INSTANCE;
            case 22:
                ((AppMessageViewEvent) obj).getClass();
                ((Function1) obj6).invoke(new AppMessageEvent(new AppMessageViewEvent.AppMessageTemporarilyDismiss(null, ((ActivityFeedEntry.CardAppMessage) obj5).appMessage, 1)));
                return Unit.INSTANCE;
            case 23:
                Function1 function13 = (Function1) obj6;
                ReceiptSection.TimelineEntry timelineEntry = (ReceiptSection.TimelineEntry) obj5;
                Timeline.Event event = (Timeline.Event) obj;
                event.getClass();
                String str10 = event.tap_action_url;
                if (str10 != null) {
                    function13.invoke(new ReceiptViewEvent.OpenUrl(str10));
                } else if (event.id != null) {
                    List<ReceiptSection.TimelineEntry.EventDetailsOverlay> list4 = timelineEntry.event_details_overlays;
                    if (!(list4 instanceof Collection) || !list4.isEmpty()) {
                        Iterator<T> it2 = list4.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                if (Intrinsics.areEqual(((ReceiptSection.TimelineEntry.EventDetailsOverlay) it2.next()).event_id, event.id)) {
                                    Iterator<T> it3 = timelineEntry.event_details_overlays.iterator();
                                    while (true) {
                                        if (it3.hasNext()) {
                                            Object next = it3.next();
                                            if (Intrinsics.areEqual(((ReceiptSection.TimelineEntry.EventDetailsOverlay) next).event_id, event.id)) {
                                                obj4 = next;
                                            }
                                        }
                                    }
                                    function13.invoke(new ReceiptViewEvent.OpenTimelineDetailsOverlay((ReceiptSection.TimelineEntry.EventDetailsOverlay) obj4));
                                }
                            }
                        }
                    }
                }
                return Unit.INSTANCE;
            case 24:
                FullscreenAdView fullscreenAdView = (FullscreenAdView) obj;
                fullscreenAdView.getClass();
                fullscreenAdView.setModel((FullscreenAdViewModel) obj6);
                fullscreenAdView.setEventReceiver(new FullscreenAdViewKt$sam$app_cash_broadway_ui_Ui_EventReceiver$0(0, (Function1) obj5));
                return Unit.INSTANCE;
            case 25:
                AvatarCarouselEntry avatarCarouselEntry = (AvatarCarouselEntry) obj;
                avatarCarouselEntry.getClass();
                ((SearchBarKeyboardState) obj6).setOpen(false);
                ((Function1) obj5).invoke(new AfterpaySearchViewEvent.RecentlyViewedItemClicked(avatarCarouselEntry.key));
                return Unit.INSTANCE;
            case 26:
                AfterpayAppletHomeContentViewModel.HomeSection.MoneyBarSectionHeader moneyBarSectionHeader = (AfterpayAppletHomeContentViewModel.HomeSection.MoneyBarSectionHeader) obj6;
                String str11 = (String) obj5;
                SemanticsPropertyReceiver semanticsPropertyReceiver2 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver2.getClass();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(moneyBarSectionHeader.titleText);
                sb2.append(", ");
                TappableIcon tappableIcon = moneyBarSectionHeader.infoIcon;
                if (tappableIcon != null && (str = tappableIcon.accessibilityText) != null) {
                    sb2.append(str.concat(", "));
                }
                sb2.append(str11);
                SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver2, sb2.toString());
                return Unit.INSTANCE;
            case 27:
                MutableState mutableState2 = (MutableState) obj6;
                ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = (ParcelableSnapshotMutableIntState) obj5;
                LayoutCoordinates layoutCoordinates3 = (LayoutCoordinates) obj;
                layoutCoordinates3.getClass();
                if (!((Boolean) mutableState2.getValue()).booleanValue()) {
                    parcelableSnapshotMutableIntState.setIntValue((int) (layoutCoordinates3.mo838getSizeYbymL2g() & BodyPartID.bodyIdMax));
                    mutableState2.setValue(Boolean.TRUE);
                }
                return Unit.INSTANCE;
            case 28:
                LazyGridIntervalContent lazyGridIntervalContent = (LazyGridIntervalContent) obj;
                lazyGridIntervalContent.getClass();
                ArrayList arrayList4 = ((AfterpaySearchViewModel.CategoryTilesSectionViewModel) obj6).tiles;
                lazyGridIntervalContent.items(arrayList4.size(), new Latch$await$2$2(i3, new CardMessageQueries$$ExternalSyntheticLambda1(19), arrayList4), null, new BorrowHomeKt$BorrowHome$lambda$1$0$$inlined$itemsIndexed$default$2(4, arrayList4), new ComposableLambdaImpl(new BorrowHomeKt$BorrowHome$lambda$1$0$$inlined$itemsIndexed$default$3(arrayList4, (Function1) obj5, r12), true, -1117249557));
                return Unit.INSTANCE;
            default:
                AgentsHomeViewModel agentsHomeViewModel = (AgentsHomeViewModel) obj6;
                LazyScaffoldContentScope lazyScaffoldContentScope = (LazyScaffoldContentScope) obj;
                lazyScaffoldContentScope.getClass();
                LazyListScope.item$default(lazyScaffoldContentScope, null, "agents_home_header", new ComposableLambdaImpl(new LocalViewFactory$$ExternalSyntheticLambda6(agentsHomeViewModel, (Function1) obj5, lazyScaffoldContentScope, 26), true, 1033612952), 1);
                final AgentsHomeContentState agentsHomeContentState = agentsHomeViewModel.contentState;
                if (agentsHomeContentState.equals(AgentsHomeContentState.Loading.INSTANCE)) {
                    LazyListScope.item$default(lazyScaffoldContentScope, null, "agents_home_loading", AgentsHomeViewKt.f139lambda$811725408, 1);
                } else if (agentsHomeContentState instanceof AgentsHomeContentState.Empty) {
                    LazyListScope.item$default(lazyScaffoldContentScope, null, "agents_home_empty", new ComposableLambdaImpl(new Function3() { // from class: com.squareup.cash.agents.applets.views.AgentsHomeViewKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj7, Object obj8, Object obj9) {
                            int i8 = i5;
                            AgentsHomeContentState agentsHomeContentState2 = agentsHomeContentState;
                            LazyItemScopeImpl lazyItemScopeImpl = (LazyItemScopeImpl) obj7;
                            Composer composer = (Composer) obj8;
                            int intValue = ((Integer) obj9).intValue();
                            switch (i8) {
                                case 0:
                                    lazyItemScopeImpl.getClass();
                                    GapComposer gapComposer = (GapComposer) composer;
                                    if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                                        AgentsHomeContentState.Empty empty = (AgentsHomeContentState.Empty) agentsHomeContentState2;
                                        AgentsHomeViewKt.EmptyOrFailureContent(empty.title, empty.body, gapComposer, 0);
                                    } else {
                                        gapComposer.skipToGroupEnd();
                                    }
                                    break;
                                default:
                                    lazyItemScopeImpl.getClass();
                                    GapComposer gapComposer2 = (GapComposer) composer;
                                    if (gapComposer2.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                                        AgentsHomeViewKt.EmptyOrFailureContent(((AgentsHomeContentState.Failure) agentsHomeContentState2).title, null, gapComposer2, 48);
                                    } else {
                                        gapComposer2.skipToGroupEnd();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, true, 1759093591), 1);
                } else if (agentsHomeContentState instanceof AgentsHomeContentState.Failure) {
                    LazyListScope.item$default(lazyScaffoldContentScope, null, "agents_home_failure", new ComposableLambdaImpl(new Function3() { // from class: com.squareup.cash.agents.applets.views.AgentsHomeViewKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj7, Object obj8, Object obj9) {
                            int i8 = i6;
                            AgentsHomeContentState agentsHomeContentState2 = agentsHomeContentState;
                            LazyItemScopeImpl lazyItemScopeImpl = (LazyItemScopeImpl) obj7;
                            Composer composer = (Composer) obj8;
                            int intValue = ((Integer) obj9).intValue();
                            switch (i8) {
                                case 0:
                                    lazyItemScopeImpl.getClass();
                                    GapComposer gapComposer = (GapComposer) composer;
                                    if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                                        AgentsHomeContentState.Empty empty = (AgentsHomeContentState.Empty) agentsHomeContentState2;
                                        AgentsHomeViewKt.EmptyOrFailureContent(empty.title, empty.body, gapComposer, 0);
                                    } else {
                                        gapComposer.skipToGroupEnd();
                                    }
                                    break;
                                default:
                                    lazyItemScopeImpl.getClass();
                                    GapComposer gapComposer2 = (GapComposer) composer;
                                    if (gapComposer2.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                                        AgentsHomeViewKt.EmptyOrFailureContent(((AgentsHomeContentState.Failure) agentsHomeContentState2).title, null, gapComposer2, 48);
                                    } else {
                                        gapComposer2.skipToGroupEnd();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, true, -246397288), 1);
                } else {
                    if (!(agentsHomeContentState instanceof AgentsHomeContentState.Content)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    ArrayList arrayList5 = ((AgentsHomeContentState.Content) agentsHomeContentState).agents;
                    int i8 = 22;
                    lazyScaffoldContentScope.$$delegate_0.items(arrayList5.size(), new Latch$await$2$2(i8, new CardMessageQueries$$ExternalSyntheticLambda1(i8), arrayList5), new Latch$await$2$2(i2, new CardMessageQueries$$ExternalSyntheticLambda1(i3), arrayList5), new ComposableLambdaImpl(new AgentsHomeViewKt$AgentsHome$lambda$1$0$$inlined$items$3(arrayList5, i5), true, 802480018));
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ CombinedModifier$$ExternalSyntheticLambda0(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }
}
