package androidx.navigation;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.CancellationSignal;
import android.os.Parcel;
import androidx.collection.ArrayMap;
import androidx.collection.MutableLongObjectMap;
import androidx.collection.MutableScatterMap;
import androidx.collection.MutableScatterSet;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.ExcludeInsets;
import androidx.compose.foundation.layout.FixedDpInsets;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.text.BasicTextKt;
import androidx.compose.foundation.text.LinkStateInteractionSourceObserver;
import androidx.compose.foundation.text.TextAnnotatorScope;
import androidx.compose.foundation.text.TextContextMenuItems;
import androidx.compose.foundation.text.TextLinkScope;
import androidx.compose.foundation.text.contextmenu.builder.TextContextMenuBuilderScope;
import androidx.compose.foundation.text.selection.MultiSelectionLayout;
import androidx.compose.foundation.text.selection.MultiWidgetSelectionDelegate;
import androidx.compose.foundation.text.selection.SelectableInfo;
import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.foundation.text.selection.SelectionManager;
import androidx.compose.foundation.text.selection.SelectionManager$$ExternalSyntheticLambda0;
import androidx.compose.foundation.text.selection.SelectionManager_androidKt$$ExternalSyntheticLambda10;
import androidx.compose.foundation.text.selection.SelectionRegistrarImpl;
import androidx.compose.material.AnchoredDraggableState;
import androidx.compose.material.MenuKt$$ExternalSyntheticLambda0;
import androidx.compose.material.ModalBottomSheetKt$$ExternalSyntheticLambda2;
import androidx.compose.material.ModalBottomSheetState;
import androidx.compose.material.ModalBottomSheetValue;
import androidx.compose.material.MutableWindowInsets;
import androidx.compose.material3.DatePickerDefaults$AllDates$1;
import androidx.compose.material3.DatePickerStateImpl;
import androidx.compose.material3.SliderKt$SliderImpl$2$1;
import androidx.compose.material3.TextFieldDefaults$sam$androidx_compose_ui_graphics_ColorProducer$0;
import androidx.compose.material3.TooltipStateImpl;
import androidx.compose.runtime.MultiSubscriptionSnapshotFlowManager;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.State;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.draw.CacheDrawScope$onDrawBehind$1;
import androidx.compose.ui.focus.FocusStateImpl;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Outline$Generic;
import androidx.compose.ui.graphics.ReusableGraphicsLayerScope;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.platform.AndroidClipboard;
import androidx.compose.ui.semantics.AccessibilityAction;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.LinkAnnotation;
import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextLinkStyles;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.controllers.CredentialProviderController;
import androidx.credentials.playservices.controllers.identityauth.HiddenActivity;
import androidx.credentials.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController;
import androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController;
import androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController$$ExternalSyntheticLambda1;
import androidx.credentials.playservices.controllers.identitycredentials.IdentityCredentialApiHiddenActivity;
import androidx.credentials.playservices.controllers.identitycredentials.getdigitalcredential.CredentialProviderGetDigitalCredentialController;
import androidx.lifecycle.LifecycleOwner;
import androidx.navigation.NavDestination;
import androidx.navigation.NavOptions;
import androidx.navigation.compose.ComposeNavigator;
import androidx.navigation.compose.NavHostKt$NavHost$lambda$48$lambda$47$$inlined$onDispose$1;
import androidx.navigation.internal.NavBackStackEntryImpl;
import androidx.navigation.internal.NavControllerImpl;
import androidx.paging.PageFetcher$flow$1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.TransactorKt;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import androidx.work.BackoffPolicy;
import androidx.work.Constraints;
import androidx.work.Data;
import androidx.work.WorkInfo;
import androidx.work.impl.model.Dependency;
import androidx.work.impl.model.DependencyDao_Impl;
import androidx.work.impl.model.WorkProgress;
import androidx.work.impl.model.WorkProgressDao_Impl;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecDao_Impl;
import com.appsflyer.internal.AFd1lSDK$$ExternalSyntheticLambda0;
import com.google.android.gms.auth.api.identity.BeginSignInResult;
import com.google.android.gms.identitycredentials.PendingGetCredentialHandle;
import com.squareup.cash.checks.CaptureCheckFaceKt$MiSnap$lambda$2$0$$inlined$onDispose$1;
import com.squareup.util.Strings;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executor;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.ranges.IntRange;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.SendChannel;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final /* synthetic */ class Navigator$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ Navigator$$ExternalSyntheticLambda0(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0685  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x068e  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x068b  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        NavDestination navigate;
        TextLinkStyles styles;
        TextLinkStyles styles2;
        TextLinkStyles styles3;
        TextLayoutResult textLayoutResult;
        final AndroidPath androidPath;
        Shape shape;
        int i;
        int i2;
        int i3 = this.$r8$classId;
        int i4 = 19;
        int i5 = 17;
        int i6 = 6;
        int i7 = 5;
        int i8 = 4;
        int i9 = 3;
        int i10 = 2;
        Continuation continuation = null;
        int i11 = 1;
        int i12 = 0;
        Object obj2 = this.f$1;
        Object obj3 = this.f$0;
        switch (i3) {
            case 0:
                Navigator navigator = (Navigator) obj3;
                NavOptions navOptions = (NavOptions) obj2;
                NavBackStackEntry navBackStackEntry = (NavBackStackEntry) obj;
                navBackStackEntry.getClass();
                NavDestination navDestination = navBackStackEntry.destination;
                NavBackStackEntryImpl navBackStackEntryImpl = navBackStackEntry.impl;
                if (navDestination == null) {
                    navDestination = null;
                }
                if (navDestination == null || (navigate = navigator.navigate(navDestination, navBackStackEntryImpl.getArguments$navigation_common_release(), navOptions)) == null) {
                    return null;
                }
                return navigate.equals(navDestination) ? navBackStackEntry : navigator.getState().createBackStackEntry(navigate, navigate.addInDefaultArgs(navBackStackEntryImpl.getArguments$navigation_common_release()));
            case 1:
                Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
                ArrayList access$measureWithTextRangeMeasureConstraints = BasicTextKt.access$measureWithTextRangeMeasureConstraints((List) obj3, (Function0) ((SliderKt$SliderImpl$2$1) obj2).$state);
                if (access$measureWithTextRangeMeasureConstraints != null) {
                    int size = access$measureWithTextRangeMeasureConstraints.size();
                    while (i12 < size) {
                        Pair pair = (Pair) access$measureWithTextRangeMeasureConstraints.get(i12);
                        Placeable placeable = (Placeable) pair.first;
                        Function0 function0 = (Function0) pair.second;
                        Placeable.PlacementScope.m854place70tqf50$default(placementScope, placeable, function0 != null ? ((IntOffset) function0.invoke()).packedValue : 0L);
                        i12++;
                    }
                }
                return Unit.INSTANCE;
            case 2:
                return new CaptureCheckFaceKt$MiSnap$lambda$2$0$$inlined$onDispose$1(i7, (MutableState) obj3, (MutableInteractionSourceImpl) obj2);
            case 3:
                AnnotatedString.Range range = (AnnotatedString.Range) obj3;
                ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = ((LinkStateInteractionSourceObserver) obj2).interactionState;
                TextAnnotatorScope textAnnotatorScope = (TextAnnotatorScope) obj;
                LinkAnnotation linkAnnotation = (LinkAnnotation) range.item;
                TextLinkStyles styles4 = linkAnnotation.getStyles();
                SpanStyle spanStyle = styles4 != null ? styles4.style : null;
                SpanStyle spanStyle2 = ((parcelableSnapshotMutableIntState.getIntValue() & 1) == 0 || (styles3 = linkAnnotation.getStyles()) == null) ? null : styles3.focusedStyle;
                if (spanStyle != null) {
                    spanStyle2 = spanStyle.merge(spanStyle2);
                }
                SpanStyle spanStyle3 = ((parcelableSnapshotMutableIntState.getIntValue() & 2) == 0 || (styles2 = linkAnnotation.getStyles()) == null) ? null : styles2.hoveredStyle;
                if (spanStyle2 != null) {
                    spanStyle3 = spanStyle2.merge(spanStyle3);
                }
                SpanStyle spanStyle4 = ((parcelableSnapshotMutableIntState.getIntValue() & 4) == 0 || (styles = linkAnnotation.getStyles()) == null) ? null : styles.pressedStyle;
                if (spanStyle3 != null) {
                    spanStyle4 = spanStyle3.merge(spanStyle4);
                }
                Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
                AnnotatedString annotatedString = textAnnotatorScope.initialText;
                MenuKt$$ExternalSyntheticLambda0 menuKt$$ExternalSyntheticLambda0 = new MenuKt$$ExternalSyntheticLambda0(8, ref$BooleanRef, range, spanStyle4);
                annotatedString.getClass();
                AnnotatedString.Builder builder = new AnnotatedString.Builder(annotatedString);
                ArrayList arrayList = builder.annotations;
                int size2 = arrayList.size();
                while (i12 < size2) {
                    AnnotatedString.Range range2 = (AnnotatedString.Range) menuKt$$ExternalSyntheticLambda0.invoke(((AnnotatedString.Builder.MutableRange) arrayList.get(i12)).toRange(PKIFailureInfo.systemUnavail));
                    arrayList.set(i12, new AnnotatedString.Builder.MutableRange(range2.item, range2.start, range2.end, range2.tag));
                    i12++;
                }
                textAnnotatorScope.styledText = builder.toAnnotatedString();
                return Unit.INSTANCE;
            case 4:
                TextLinkScope textLinkScope = (TextLinkScope) obj3;
                AnnotatedString.Range range3 = (AnnotatedString.Range) obj2;
                ReusableGraphicsLayerScope reusableGraphicsLayerScope = (ReusableGraphicsLayerScope) obj;
                AnnotatedString annotatedString2 = textLinkScope.text;
                ParcelableSnapshotMutableState parcelableSnapshotMutableState = textLinkScope.textLayoutResult$delegate;
                TextLayoutResult textLayoutResult2 = (TextLayoutResult) parcelableSnapshotMutableState.getValue();
                if (Intrinsics.areEqual(annotatedString2, textLayoutResult2 != null ? textLayoutResult2.layoutInput.text : null) && (textLayoutResult = (TextLayoutResult) parcelableSnapshotMutableState.getValue()) != null) {
                    MultiParagraph multiParagraph = textLayoutResult.multiParagraph;
                    AnnotatedString.Range calculateVisibleLinkRange = TextLinkScope.calculateVisibleLinkRange(range3, textLayoutResult);
                    if (calculateVisibleLinkRange != null) {
                        int i13 = calculateVisibleLinkRange.end;
                        int i14 = calculateVisibleLinkRange.start;
                        AndroidPath pathForRange = textLayoutResult.getPathForRange(i14, i13);
                        Rect boundingBox = textLayoutResult.getBoundingBox(i14);
                        pathForRange.m667translatek4lQ0M(((Float.floatToRawIntBits(multiParagraph.getLineForOffset(i14) == multiParagraph.getLineForOffset(i13 - 1) ? Math.min(textLayoutResult.getBoundingBox(r4).left, boundingBox.left) : RecyclerView.DECELERATION_RATE) << 32) | (Float.floatToRawIntBits(boundingBox.top) & BodyPartID.bodyIdMax)) ^ (-9223372034707292160L));
                        androidPath = pathForRange;
                        shape = androidPath == null ? new Shape() { // from class: androidx.compose.foundation.text.TextLinkScope$shapeForRange$1$1
                            @Override // androidx.compose.ui.graphics.Shape
                            /* renamed from: createOutline-Pq9zytI */
                            public final ColorKt mo175createOutlinePq9zytI(long j, LayoutDirection layoutDirection, Density density) {
                                return new Outline$Generic(AndroidPath.this);
                            }
                        } : null;
                        if (shape != null) {
                            reusableGraphicsLayerScope.setShape(shape);
                            reusableGraphicsLayerScope.setClip(true);
                        }
                        return Unit.INSTANCE;
                    }
                }
                androidPath = null;
                if (androidPath == null) {
                }
                if (shape != null) {
                }
                return Unit.INSTANCE;
            case 5:
                List list = (List) obj3;
                List list2 = (List) obj2;
                Placeable.PlacementScope placementScope2 = (Placeable.PlacementScope) obj;
                if (list != null) {
                    int size3 = list.size();
                    for (int i15 = 0; i15 < size3; i15++) {
                        Pair pair2 = (Pair) list.get(i15);
                        Placeable.PlacementScope.m854place70tqf50$default(placementScope2, (Placeable) pair2.first, ((IntOffset) pair2.second).packedValue);
                    }
                }
                if (list2 != null) {
                    int size4 = list2.size();
                    while (i12 < size4) {
                        Pair pair3 = (Pair) list2.get(i12);
                        Placeable placeable2 = (Placeable) pair3.first;
                        Function0 function02 = (Function0) pair3.second;
                        Placeable.PlacementScope.m854place70tqf50$default(placementScope2, placeable2, function02 != null ? ((IntOffset) function02.invoke()).packedValue : 0L);
                        i12++;
                    }
                }
                return Unit.INSTANCE;
            case 6:
                SelectableInfo selectableInfo = (SelectableInfo) obj;
                MultiSelectionLayout.createAndPutSubSelection((MutableLongObjectMap) obj3, (Selection) obj2, selectableInfo, 0, selectableInfo.textLayoutResult.layoutInput.text.text.length());
                return Unit.INSTANCE;
            case 7:
                JobKt.launch$default((CoroutineScope) obj3, null, CoroutineStart.UNDISPATCHED, new PageFetcher$flow$1((AndroidClipboard) obj2, (AnnotatedString) obj, null, 2), 1);
                return Unit.INSTANCE;
            case 8:
                Selection selection = (Selection) obj;
                ((SelectionManager) obj3).setSelection(selection);
                ((Function1) obj2).invoke(selection);
                return Unit.INSTANCE;
            case 9:
                SelectionManager selectionManager = (SelectionManager) obj3;
                Context context = (Context) obj2;
                TextContextMenuBuilderScope textContextMenuBuilderScope = (TextContextMenuBuilderScope) obj;
                textContextMenuBuilderScope.separator();
                BasicTextKt.textItem(textContextMenuBuilderScope, context.getResources(), TextContextMenuItems.Copy, selectionManager.isNonEmptySelection$foundation(), new SelectionManager_androidKt$$ExternalSyntheticLambda10(new SelectionManager$$ExternalSyntheticLambda0(selectionManager, i7), null, 0));
                TextContextMenuItems textContextMenuItems = TextContextMenuItems.SelectAll;
                SelectionRegistrarImpl selectionRegistrarImpl = selectionManager.selectionRegistrar;
                ArrayList sort = selectionRegistrarImpl.sort(selectionManager.requireContainerCoordinates$foundation());
                if (!sort.isEmpty()) {
                    int size5 = sort.size();
                    int i16 = 0;
                    while (i16 < size5) {
                        MultiWidgetSelectionDelegate multiWidgetSelectionDelegate = (MultiWidgetSelectionDelegate) sort.get(i16);
                        AnnotatedString text = multiWidgetSelectionDelegate.getText();
                        if (text.text.length() == 0) {
                            i = i11;
                        } else {
                            i = i11;
                            Selection selection2 = (Selection) selectionRegistrarImpl.getSubselections().get(multiWidgetSelectionDelegate.selectableId);
                            if (selection2 == null || Math.abs(selection2.start.offset - selection2.end.offset) != text.text.length()) {
                                i2 = 0;
                                BasicTextKt.textItem(textContextMenuBuilderScope, context.getResources(), textContextMenuItems, i2 ^ i, new SelectionManager_androidKt$$ExternalSyntheticLambda10(new SelectionManager$$ExternalSyntheticLambda0(selectionManager, 7), new SelectionManager$$ExternalSyntheticLambda0(selectionManager, 6), 0));
                                textContextMenuBuilderScope.separator();
                                return Unit.INSTANCE;
                            }
                        }
                        i16++;
                        i11 = i;
                    }
                }
                i = i11;
                i2 = i;
                BasicTextKt.textItem(textContextMenuBuilderScope, context.getResources(), textContextMenuItems, i2 ^ i, new SelectionManager_androidKt$$ExternalSyntheticLambda10(new SelectionManager$$ExternalSyntheticLambda0(selectionManager, 7), new SelectionManager$$ExternalSyntheticLambda0(selectionManager, 6), 0));
                textContextMenuBuilderScope.separator();
                return Unit.INSTANCE;
            case 10:
                ModalBottomSheetState modalBottomSheetState = (ModalBottomSheetState) obj3;
                AnchoredDraggableState anchoredDraggableState = modalBottomSheetState.anchoredDraggableState;
                CoroutineScope coroutineScope = (CoroutineScope) obj2;
                SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
                if (modalBottomSheetState.isVisible()) {
                    semanticsPropertyReceiver.set(SemanticsActions.Dismiss, new AccessibilityAction(null, new ModalBottomSheetKt$$ExternalSyntheticLambda2(modalBottomSheetState, coroutineScope, i11)));
                    Object value = ((ParcelableSnapshotMutableState) anchoredDraggableState.currentValue$delegate).getValue();
                    ModalBottomSheetValue modalBottomSheetValue = ModalBottomSheetValue.HalfExpanded;
                    if (value == modalBottomSheetValue) {
                        semanticsPropertyReceiver.set(SemanticsActions.Expand, new AccessibilityAction(null, new ModalBottomSheetKt$$ExternalSyntheticLambda2(modalBottomSheetState, coroutineScope, 2)));
                    } else if (anchoredDraggableState.getAnchors().anchors.containsKey(modalBottomSheetValue)) {
                        semanticsPropertyReceiver.set(SemanticsActions.Collapse, new AccessibilityAction(null, new ModalBottomSheetKt$$ExternalSyntheticLambda2(modalBottomSheetState, coroutineScope, 3)));
                    }
                }
                return Unit.INSTANCE;
            case 11:
                ((MutableWindowInsets) obj3).insets$delegate.setValue(new ExcludeInsets((FixedDpInsets) obj2, (WindowInsets) obj));
                return Unit.INSTANCE;
            case 12:
                List list3 = (List) obj;
                Long l = (Long) list3.get(0);
                Long l2 = (Long) list3.get(1);
                Object obj4 = list3.get(2);
                obj4.getClass();
                int intValue = ((Integer) obj4).intValue();
                Object obj5 = list3.get(3);
                obj5.getClass();
                IntRange intRange = new IntRange(intValue, ((Integer) obj5).intValue(), 1);
                Object obj6 = list3.get(4);
                obj6.getClass();
                return new DatePickerStateImpl(l, l2, intRange, ((Integer) obj6).intValue(), (DatePickerDefaults$AllDates$1) obj3, (Locale) obj2);
            case 13:
                ((androidx.compose.material3.internal.MutableWindowInsets) obj3).insets$delegate.setValue(new ExcludeInsets((WindowInsets) obj2, (WindowInsets) obj));
                return Unit.INSTANCE;
            case 14:
                JobKt.launch$default((CoroutineScope) obj3, null, null, new PageFetcher$flow$1((FocusStateImpl) obj, (TooltipStateImpl) obj2, continuation, 7), 3);
                return Unit.INSTANCE;
            case 15:
                MutableState mutableState = (MutableState) obj2;
                Size size6 = (Size) obj;
                float floatValue = ((Number) ((State) obj3).getValue()).floatValue();
                float intBitsToFloat = Float.intBitsToFloat((int) (size6.packedValue >> 32)) * floatValue;
                float intBitsToFloat2 = Float.intBitsToFloat((int) (size6.packedValue & BodyPartID.bodyIdMax)) * floatValue;
                if (Float.intBitsToFloat((int) (((Size) mutableState.getValue()).packedValue >> 32)) != intBitsToFloat || Float.intBitsToFloat((int) (((Size) mutableState.getValue()).packedValue & BodyPartID.bodyIdMax)) != intBitsToFloat2) {
                    mutableState.setValue(new Size((Float.floatToRawIntBits(intBitsToFloat2) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(intBitsToFloat) << 32)));
                }
                return Unit.INSTANCE;
            case 16:
                CacheDrawScope cacheDrawScope = (CacheDrawScope) obj;
                return cacheDrawScope.onDrawWithContent(new CacheDrawScope$onDrawBehind$1(0, new Navigator$$ExternalSyntheticLambda0(i5, ((Shape) obj3).mo175createOutlinePq9zytI(cacheDrawScope.cacheParams.mo587getSizeNHjbRc(), cacheDrawScope.cacheParams.getLayoutDirection(), cacheDrawScope), (TextFieldDefaults$sam$androidx_compose_ui_graphics_ColorProducer$0) obj2)));
            case 17:
                ColorKt.m685drawOutlinewDX37Ww$default((DrawScope) obj, (ColorKt) obj3, ((TextFieldDefaults$sam$androidx_compose_ui_graphics_ColorProducer$0) obj2).mo501invoke0d7_KjU());
                return Unit.INSTANCE;
            case 18:
                ((MultiSubscriptionSnapshotFlowManager) obj3).watch$runtime(obj, (SendChannel) obj2);
                return Unit.INSTANCE;
            case 19:
                MultiSubscriptionSnapshotFlowManager multiSubscriptionSnapshotFlowManager = (MultiSubscriptionSnapshotFlowManager) obj2;
                if (((Set) obj3).contains(obj)) {
                    MutableScatterMap mutableScatterMap = multiSubscriptionSnapshotFlowManager.subscriptions;
                    MutableScatterSet mutableScatterSet = multiSubscriptionSnapshotFlowManager.toNotify;
                    Object obj7 = mutableScatterMap.get(obj);
                    if (obj7 != null) {
                        if (obj7 instanceof MutableScatterSet) {
                            MutableScatterSet mutableScatterSet2 = (MutableScatterSet) obj7;
                            Object[] objArr = mutableScatterSet2.elements;
                            long[] jArr = mutableScatterSet2.metadata;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i17 = 0;
                                while (true) {
                                    long j = jArr[i17];
                                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i18 = 8 - ((~(i17 - length)) >>> 31);
                                        for (int i19 = 0; i19 < i18; i19++) {
                                            if ((255 & j) < 128) {
                                                mutableScatterSet.add((SendChannel) objArr[(i17 << 3) + i19]);
                                            }
                                            j >>= 8;
                                        }
                                        if (i18 != 8) {
                                        }
                                    }
                                    if (i17 != length) {
                                        i17++;
                                    }
                                }
                            }
                        } else {
                            mutableScatterSet.add((SendChannel) obj7);
                        }
                    }
                }
                return Unit.INSTANCE;
            case 20:
                ((Integer) obj).intValue();
                return ((Parcel) obj3).readValue((ClassLoader) obj2);
            case 21:
                CancellationSignal cancellationSignal = (CancellationSignal) obj3;
                CredentialProviderBeginSignInController credentialProviderBeginSignInController = (CredentialProviderBeginSignInController) obj2;
                Context context2 = credentialProviderBeginSignInController.context;
                BeginSignInResult beginSignInResult = (BeginSignInResult) obj;
                CredentialProviderPlayServicesImpl.INSTANCE.getClass();
                if (CredentialProviderPlayServicesImpl.Companion.cancellationReviewer$credentials_play_services_auth(cancellationSignal)) {
                    return Unit.INSTANCE;
                }
                Intent intent = new Intent(context2, (Class<?>) HiddenActivity.class);
                CredentialProviderController.generateHiddenActivityIntent(credentialProviderBeginSignInController.resultReceiver, intent, "BEGIN_SIGN_IN");
                intent.putExtra("EXTRA_FLOW_PENDING_INTENT", beginSignInResult.zba);
                try {
                    context2.startActivity(intent);
                } catch (Exception unused) {
                    CredentialProviderPlayServicesImpl.INSTANCE.getClass();
                    if (!CredentialProviderPlayServicesImpl.Companion.cancellationReviewer$credentials_play_services_auth(cancellationSignal)) {
                        credentialProviderBeginSignInController.getExecutor().execute(new AFd1lSDK$$ExternalSyntheticLambda0(credentialProviderBeginSignInController, 2));
                    }
                }
                return Unit.INSTANCE;
            case 22:
                CancellationSignal cancellationSignal2 = (CancellationSignal) obj3;
                CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController = (CredentialProviderCreatePublicKeyCredentialController) obj2;
                Context context3 = credentialProviderCreatePublicKeyCredentialController.context;
                PendingIntent pendingIntent = (PendingIntent) obj;
                pendingIntent.getClass();
                CredentialProviderPlayServicesImpl.INSTANCE.getClass();
                if (CredentialProviderPlayServicesImpl.Companion.cancellationReviewer$credentials_play_services_auth(cancellationSignal2)) {
                    return Unit.INSTANCE;
                }
                Intent intent2 = new Intent(context3, (Class<?>) HiddenActivity.class);
                CredentialProviderController.generateHiddenActivityIntent(credentialProviderCreatePublicKeyCredentialController.resultReceiver, intent2, "CREATE_PUBLIC_KEY_CREDENTIAL");
                intent2.putExtra("EXTRA_FLOW_PENDING_INTENT", pendingIntent);
                try {
                    context3.startActivity(intent2);
                } catch (Exception unused2) {
                    CredentialProviderPlayServicesImpl.INSTANCE.getClass();
                    if (!CredentialProviderPlayServicesImpl.Companion.cancellationReviewer$credentials_play_services_auth(cancellationSignal2)) {
                        Executor executor = credentialProviderCreatePublicKeyCredentialController.executor;
                        if (executor == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("executor");
                            throw null;
                        }
                        executor.execute(new CredentialProviderCreatePublicKeyCredentialController$$ExternalSyntheticLambda1(credentialProviderCreatePublicKeyCredentialController, i11));
                    }
                }
                return Unit.INSTANCE;
            case 23:
                CredentialProviderGetDigitalCredentialController credentialProviderGetDigitalCredentialController = (CredentialProviderGetDigitalCredentialController) obj2;
                Context context4 = credentialProviderGetDigitalCredentialController.context;
                PendingGetCredentialHandle pendingGetCredentialHandle = (PendingGetCredentialHandle) obj;
                CredentialProviderPlayServicesImpl.INSTANCE.getClass();
                if (CredentialProviderPlayServicesImpl.Companion.cancellationReviewer$credentials_play_services_auth((CancellationSignal) obj3)) {
                    return Unit.INSTANCE;
                }
                Intent intent3 = new Intent(context4, (Class<?>) IdentityCredentialApiHiddenActivity.class);
                intent3.setFlags(65536);
                intent3.putExtra("RESULT_RECEIVER", CredentialProviderController.toIpcFriendlyResultReceiver(credentialProviderGetDigitalCredentialController.resultReceiver));
                intent3.putExtra("EXTRA_FLOW_PENDING_INTENT", pendingGetCredentialHandle.pendingIntent);
                intent3.putExtra("EXTRA_ERROR_NAME", "GET_UNKNOWN");
                context4.startActivity(intent3);
                return Unit.INSTANCE;
            case 24:
                NavDestination navDestination2 = (NavDestination) obj3;
                NavControllerImpl navControllerImpl = ((NavHostController) obj2).impl;
                NavOptionsBuilder navOptionsBuilder = (NavOptionsBuilder) obj;
                navOptionsBuilder.getClass();
                NavOptions.Builder builder2 = navOptionsBuilder.builder;
                builder2.enterAnim = 0;
                builder2.exitAnim = 0;
                if (navDestination2 instanceof NavGraph) {
                    int i20 = NavDestination.$r8$clinit;
                    Iterator it = NavDestination.Companion.getHierarchy(navDestination2).iterator();
                    while (true) {
                        if (it.hasNext()) {
                            NavDestination navDestination3 = (NavDestination) it.next();
                            NavDestination currentDestination$navigation_runtime_release = navControllerImpl.getCurrentDestination$navigation_runtime_release();
                            if (Intrinsics.areEqual(navDestination3, currentDestination$navigation_runtime_release != null ? currentDestination$navigation_runtime_release.parent : null)) {
                            }
                        } else {
                            int i21 = NavGraph.$r8$clinit;
                            navOptionsBuilder.setPopUpToId$navigation_common_release(((NavDestination) SequencesKt___SequencesKt.last(SequencesKt__SequencesKt.generateSequence(new Navigation$$ExternalSyntheticLambda1(i4), navControllerImpl.getGraph$navigation_runtime_release()))).impl.id);
                            navOptionsBuilder.inclusive = false;
                            navOptionsBuilder.saveState = true;
                        }
                    }
                }
                return Unit.INSTANCE;
            case 25:
                return new CaptureCheckFaceKt$MiSnap$lambda$2$0$$inlined$onDispose$1(9, (State) obj3, (ComposeNavigator) obj2);
            case 26:
                ((NavHostController) obj3).setLifecycleOwner((LifecycleOwner) obj2);
                return new NavHostKt$NavHost$lambda$48$lambda$47$$inlined$onDispose$1();
            case 27:
                SQLiteConnection sQLiteConnection = (SQLiteConnection) obj;
                sQLiteConnection.getClass();
                ((DependencyDao_Impl) obj3).__insertAdapterOfDependency.insert(sQLiteConnection, (Dependency) obj2);
                return Unit.INSTANCE;
            case 28:
                SQLiteConnection sQLiteConnection2 = (SQLiteConnection) obj;
                sQLiteConnection2.getClass();
                ((WorkProgressDao_Impl) obj3).__insertAdapterOfWorkProgress.insert(sQLiteConnection2, (WorkProgress) obj2);
                return Unit.INSTANCE;
            default:
                String str = (String) obj3;
                WorkSpecDao_Impl workSpecDao_Impl = (WorkSpecDao_Impl) obj2;
                SQLiteConnection sQLiteConnection3 = (SQLiteConnection) obj;
                sQLiteConnection3.getClass();
                SQLiteStatement prepare = sQLiteConnection3.prepare("SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)");
                try {
                    prepare.bindText(1, str);
                    ArrayMap arrayMap = new ArrayMap(0);
                    ArrayMap arrayMap2 = new ArrayMap(0);
                    while (prepare.step()) {
                        String text2 = prepare.getText(0);
                        if (!arrayMap.containsKey(text2)) {
                            arrayMap.put(text2, new ArrayList());
                        }
                        String text3 = prepare.getText(0);
                        if (!arrayMap2.containsKey(text3)) {
                            arrayMap2.put(text3, new ArrayList());
                        }
                    }
                    prepare.reset();
                    workSpecDao_Impl.__fetchRelationshipWorkTagAsjavaLangString(sQLiteConnection3, arrayMap);
                    workSpecDao_Impl.__fetchRelationshipWorkProgressAsandroidxWorkData(sQLiteConnection3, arrayMap2);
                    ArrayList arrayList2 = new ArrayList();
                    while (prepare.step()) {
                        String text4 = prepare.getText(0);
                        WorkInfo.State intToState = TransactorKt.intToState((int) prepare.getLong(1));
                        byte[] blob = prepare.getBlob(i10);
                        Data data = Data.EMPTY;
                        Data fromByteArray = Strings.fromByteArray(blob);
                        int i22 = (int) prepare.getLong(i9);
                        int i23 = (int) prepare.getLong(i8);
                        long j2 = prepare.getLong(14);
                        long j3 = prepare.getLong(15);
                        long j4 = prepare.getLong(16);
                        BackoffPolicy intToBackoffPolicy = TransactorKt.intToBackoffPolicy((int) prepare.getLong(17));
                        long j5 = prepare.getLong(18);
                        long j6 = prepare.getLong(19);
                        int i24 = (int) prepare.getLong(20);
                        long j7 = prepare.getLong(21);
                        int i25 = (int) prepare.getLong(22);
                        Constraints constraints = new Constraints(TransactorKt.toNetworkRequest$work_runtime_release(prepare.getBlob(i6)), TransactorKt.intToNetworkType((int) prepare.getLong(5)), ((int) prepare.getLong(7)) != 0, ((int) prepare.getLong(8)) != 0, ((int) prepare.getLong(9)) != 0, ((int) prepare.getLong(10)) != 0, prepare.getLong(11), prepare.getLong(12), TransactorKt.byteArrayToSetOfTriggers(prepare.getBlob(13)));
                        Object value2 = MapsKt__MapsKt.getValue(arrayMap, prepare.getText(0));
                        value2.getClass();
                        List list4 = (List) value2;
                        Object value3 = MapsKt__MapsKt.getValue(arrayMap2, prepare.getText(0));
                        value3.getClass();
                        arrayList2.add(new WorkSpec.WorkInfoPojo(text4, intToState, fromByteArray, j2, j3, j4, constraints, i22, intToBackoffPolicy, j5, j6, i24, i23, j7, i25, list4, (List) value3));
                        i8 = 4;
                        i9 = 3;
                        i10 = 2;
                        i6 = 6;
                    }
                    prepare.close();
                    return arrayList2;
                } catch (Throwable th) {
                    prepare.close();
                    throw th;
                }
        }
    }

    public /* synthetic */ Navigator$$ExternalSyntheticLambda0(int i, Object obj, Object obj2, Object obj3) {
        this.$r8$classId = i;
        this.f$0 = obj2;
        this.f$1 = obj3;
    }
}
