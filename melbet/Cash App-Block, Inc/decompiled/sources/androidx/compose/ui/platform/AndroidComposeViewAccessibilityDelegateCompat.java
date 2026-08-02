package androidx.compose.ui.platform;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.ClipDescription;
import android.content.res.Resources;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.text.SpannableString;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.collection.ArraySet;
import androidx.collection.IntIntMapKt;
import androidx.collection.IntListKt;
import androidx.collection.IntObjectMapKt;
import androidx.collection.IntSetKt;
import androidx.collection.MutableIntIntMap;
import androidx.collection.MutableIntList;
import androidx.collection.MutableIntObjectMap;
import androidx.collection.MutableIntSet;
import androidx.collection.MutableObjectIntMap;
import androidx.collection.MutableScatterMap;
import androidx.collection.MutableScatterSet;
import androidx.collection.ObjectIntMapKt;
import androidx.collection.ScatterSetKt;
import androidx.collection.SieveCacheKt;
import androidx.collection.SparseArrayCompat;
import androidx.collection.internal.ContainerHelpersKt;
import androidx.collection.internal.RuntimeHelpersKt;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRect;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Outline$Generic;
import androidx.compose.ui.graphics.Outline$Rectangle;
import androidx.compose.ui.graphics.Outline$Rounded;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.ValueInsets;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.DepthSortedSetKt;
import androidx.compose.ui.node.InnerNodeCoordinator;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.semantics.AccessibilityAction;
import androidx.compose.ui.semantics.CustomAccessibilityAction;
import androidx.compose.ui.semantics.LiveRegionMode;
import androidx.compose.ui.semantics.ProgressBarRangeInfo;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.ScrollAxisRange;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.semantics.SemanticsNodeWithAdjustedBounds;
import androidx.compose.ui.semantics.SemanticsOwnerKt;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertiesAndroid;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.state.ToggleableState;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.font.FontFamilyResolverImpl;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntRectKt;
import androidx.compose.ui.util.ListUtilsKt;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.lifecycle.Lifecycle;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.util.DBUtil;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.Extras;
import com.appsflyer.AFLogger$$ExternalSyntheticLambda0;
import com.google.android.gms.internal.mlkit_genai_prompt.zzafb;
import com.google.android.gms.internal.mlkit_genai_prompt.zzafd;
import com.google.android.gms.internal.mlkit_genai_prompt.zzafe;
import com.google.android.gms.internal.mlkit_genai_prompt.zzage;
import com.google.android.gms.internal.mlkit_genai_prompt.zzahu;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.google.mlkit.vision.text.Text;
import com.squareup.cash.R;
import com.squareup.cash.blockers.data.BlockersDataKt;
import com.squareup.cash.blockers.viewmodels.LayoutUpdate;
import com.squareup.cash.borrow.ui.util.ArcadeThemeKt;
import com.squareup.cash.overlays.FakeOverlayLayerKt;
import com.squareup.cash.overlays.OverlaysKt;
import com.squareup.cash.paychecks.common.presenters.UtilsKt;
import com.squareup.cash.scrubbing.CurrencyConfig;
import com.squareup.cash.scrubbing.DateScrubberKt;
import com.squareup.util.cash.Countries;
import com.squareup.wire.GrpcMethod;
import com.squareup.workflow1.ui.ViewRegistryKt$buildView$1$2$1$1;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Function;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt__MathJVMKt;
import kotlin.ranges.ClosedFloatRange;
import kotlinx.collections.immutable.implementations.immutableList.ObjectRef;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.PapaEvent;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class AndroidComposeViewAccessibilityDelegateCompat extends AccessibilityDelegateCompat implements View.OnAttachStateChangeListener, AccessibilityManager.AccessibilityStateChangeListener, AccessibilityManager.TouchExplorationStateChangeListener {
    public static final MutableIntList AccessibilityActionsResourceIds;
    public final String ExtraDataTestTraversalAfterVal;
    public final String ExtraDataTestTraversalBeforeVal;
    public long SendRecurringAccessibilityEventsIntervalMillis;
    public List _enabledServices;
    public int accessibilityCursorPosition;
    public int accessibilityFocusedVirtualViewId;
    public final AccessibilityManager accessibilityManager;
    public final SparseArrayCompat actionIdToLabel;
    public final BufferedChannel boundsUpdateChannel;
    public boolean checkingForSemanticsChanges;
    public MutableIntObjectMap currentSemanticsNodes;
    public boolean currentSemanticsNodesInvalidated;
    public AccessibilityNodeInfoCompat currentlyAccessibilityFocusedANI;
    public AccessibilityNodeInfoCompat currentlyFocusedANI;
    public final MutableIntIntMap drawingOrder;
    public int focusedVirtualViewId;
    public final MutableIntIntMap idToAfterMap;
    public final MutableIntIntMap idToBeforeMap;
    public final SparseArrayCompat labelToActionId;
    public final ComposeAccessibilityNodeProvider nodeProvider;
    public final MutableIntSet paneDisplayed;
    public final MutableIntObjectMap pendingHorizontalScrollEvents;
    public PendingTextTraversedEvent pendingTextTraversedEvent;
    public final MutableIntObjectMap pendingVerticalScrollEvents;
    public final MutableIntObjectMap previousSemanticsNodes;
    public SemanticsNodeCopy previousSemanticsRoot;
    public Integer previousTraversedNode;
    public final AndroidComposeViewAccessibilityDelegateCompat$onSendAccessibilityEvent$1 scheduleScrollEventIfNeededLambda;
    public final ArrayList scrollObservationScopes;
    public final AFLogger$$ExternalSyntheticLambda0 semanticsChangeChecker;
    public boolean sendingFocusAffectingEvent;
    public final ArraySet subtreeChangedLayoutNodes;
    public final GrpcMethod urlSpanCache;
    public final AndroidComposeView view;
    public int hoveredVirtualViewId = PKIFailureInfo.systemUnavail;
    public final AndroidComposeViewAccessibilityDelegateCompat$onSendAccessibilityEvent$1 onSendAccessibilityEvent = new AndroidComposeViewAccessibilityDelegateCompat$onSendAccessibilityEvent$1(this, 0);

    public final class ComposeAccessibilityNodeProvider extends Extras.Key {
        public ComposeAccessibilityNodeProvider() {
            super(14);
        }

        @Override // coil3.Extras.Key
        public final void addExtraDataToAccessibilityNodeInfo(int i, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, String str, Bundle bundle) {
            AndroidComposeViewAccessibilityDelegateCompat.this.addExtraDataToAccessibilityNodeInfoHelper(i, accessibilityNodeInfoCompat, str, bundle);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:175:0x036c  */
        /* JADX WARN: Removed duplicated region for block: B:178:0x037f  */
        /* JADX WARN: Removed duplicated region for block: B:181:0x038d  */
        /* JADX WARN: Removed duplicated region for block: B:184:0x0392  */
        /* JADX WARN: Removed duplicated region for block: B:192:0x03b3  */
        /* JADX WARN: Removed duplicated region for block: B:195:0x03b8  */
        /* JADX WARN: Removed duplicated region for block: B:219:0x040a  */
        /* JADX WARN: Removed duplicated region for block: B:222:0x040f  */
        /* JADX WARN: Removed duplicated region for block: B:227:0x042d  */
        /* JADX WARN: Removed duplicated region for block: B:230:0x0432  */
        /* JADX WARN: Removed duplicated region for block: B:233:0x0444  */
        /* JADX WARN: Removed duplicated region for block: B:270:0x04e7  */
        /* JADX WARN: Removed duplicated region for block: B:273:0x04ee  */
        /* JADX WARN: Removed duplicated region for block: B:276:0x0511  */
        /* JADX WARN: Removed duplicated region for block: B:286:0x04f1  */
        /* JADX WARN: Removed duplicated region for block: B:296:0x0561  */
        /* JADX WARN: Removed duplicated region for block: B:299:0x056e  */
        /* JADX WARN: Removed duplicated region for block: B:302:0x058d  */
        /* JADX WARN: Removed duplicated region for block: B:305:0x0592  */
        /* JADX WARN: Removed duplicated region for block: B:330:0x0659  */
        /* JADX WARN: Removed duplicated region for block: B:333:0x0664  */
        /* JADX WARN: Removed duplicated region for block: B:339:0x0672  */
        /* JADX WARN: Removed duplicated region for block: B:342:0x0687  */
        /* JADX WARN: Removed duplicated region for block: B:345:0x0691  */
        /* JADX WARN: Removed duplicated region for block: B:361:0x06cb  */
        /* JADX WARN: Removed duplicated region for block: B:367:0x06d8  */
        /* JADX WARN: Removed duplicated region for block: B:370:0x06ed  */
        /* JADX WARN: Removed duplicated region for block: B:373:0x06f7  */
        /* JADX WARN: Removed duplicated region for block: B:381:0x0722  */
        /* JADX WARN: Removed duplicated region for block: B:384:0x072e  */
        /* JADX WARN: Removed duplicated region for block: B:447:0x08f3  */
        /* JADX WARN: Removed duplicated region for block: B:453:0x0915  */
        /* JADX WARN: Removed duplicated region for block: B:458:0x0931  */
        /* JADX WARN: Removed duplicated region for block: B:461:0x0938  */
        /* JADX WARN: Removed duplicated region for block: B:463:0x0933  */
        /* JADX WARN: Removed duplicated region for block: B:465:0x090b  */
        /* JADX WARN: Removed duplicated region for block: B:473:0x0384  */
        /* JADX WARN: Removed duplicated region for block: B:474:0x0374  */
        /* JADX WARN: Type inference failed for: r7v20 */
        /* JADX WARN: Type inference failed for: r7v21, types: [boolean, int] */
        /* JADX WARN: Type inference failed for: r7v94 */
        @Override // coil3.Extras.Key
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final AccessibilityNodeInfoCompat createAccessibilityNodeInfo(int i) {
            AnnotatedString infoText;
            String infoStateDescriptionOrNull;
            boolean infoIsCheckable;
            int i2;
            int i3;
            boolean z;
            SemanticsNode semanticsNode;
            ?? r7;
            Object obj;
            LiveRegionMode liveRegionMode;
            Object obj2;
            AccessibilityAction accessibilityAction;
            Object obj3;
            AccessibilityAction accessibilityAction2;
            Object obj4;
            AccessibilityAction accessibilityAction3;
            String iterableTextForAccessibility;
            ArrayList arrayList;
            CharSequence text;
            Object obj5;
            ProgressBarRangeInfo progressBarRangeInfo;
            Object obj6;
            ScrollAxisRange scrollAxisRange;
            Object obj7;
            Object obj8;
            ScrollAxisRange scrollAxisRange2;
            Object obj9;
            MutableScatterMap mutableScatterMap;
            int orDefault;
            Bundle bundle;
            int orDefault2;
            String str;
            AccessibilityNodeInfoCompat accessibilityNodeInfoCompat;
            AndroidViewHolder semanticsIdToView;
            MutableObjectIntMap mutableObjectIntMap;
            MutableScatterMap mutableScatterMap2;
            Object obj10;
            Object obj11;
            List list;
            boolean z2;
            boolean z3;
            SemanticsNode semanticsNode2;
            AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = AndroidComposeViewAccessibilityDelegateCompat.this;
            AccessibilityManager accessibilityManager = androidComposeViewAccessibilityDelegateCompat.accessibilityManager;
            AndroidComposeView androidComposeView = androidComposeViewAccessibilityDelegateCompat.view;
            if (androidComposeView.get_composeViewContext().lifecycleOwner.getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
                if (!accessibilityManager.isEnabled()) {
                    accessibilityNodeInfoCompat = AccessibilityNodeInfoCompat.obtain();
                }
                accessibilityNodeInfoCompat = null;
            } else {
                SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = (SemanticsNodeWithAdjustedBounds) androidComposeViewAccessibilityDelegateCompat.getCurrentSemanticsNodes().get(i);
                if (semanticsNodeWithAdjustedBounds == null) {
                    if (!accessibilityManager.isEnabled()) {
                        accessibilityNodeInfoCompat = AccessibilityNodeInfoCompat.obtain();
                    }
                    accessibilityNodeInfoCompat = null;
                } else {
                    SemanticsNode semanticsNode3 = semanticsNodeWithAdjustedBounds.getSemanticsNode();
                    Object obj12 = semanticsNode3.getConfig().props.get(SemanticsProperties.IsSensitiveData);
                    if (obj12 == null) {
                        obj12 = null;
                    }
                    boolean areEqual = Intrinsics.areEqual(obj12, Boolean.TRUE);
                    if (!areEqual || DateScrubberKt.isRequestFromAccessibilityTool(accessibilityManager)) {
                        AccessibilityNodeInfoCompat obtain = AccessibilityNodeInfoCompat.obtain();
                        obtain.setAccessibilityDataSensitive(areEqual);
                        if (i == -1) {
                            Object parentForAccessibility = androidComposeView.getParentForAccessibility();
                            obtain.setParent(parentForAccessibility instanceof View ? (View) parentForAccessibility : null);
                        } else {
                            SemanticsNode parent = semanticsNode3.getParent();
                            Integer valueOf = parent != null ? Integer.valueOf(parent.id) : null;
                            if (valueOf == null) {
                                InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("semanticsNode " + i + " has null parent");
                                OptionalProvider$$ExternalSyntheticLambda0.m$1();
                                return null;
                            }
                            int intValue = valueOf.intValue();
                            if (intValue == androidComposeView.semanticsOwner.getUnmergedRootSemanticsNode().id) {
                                intValue = -1;
                            }
                            obtain.setParent(androidComposeView, intValue);
                        }
                        obtain.setSource(androidComposeView, i);
                        obtain.setBoundsInScreen(androidComposeViewAccessibilityDelegateCompat.boundsInScreen(semanticsNodeWithAdjustedBounds));
                        MutableIntList mutableIntList = AndroidComposeViewAccessibilityDelegateCompat.AccessibilityActionsResourceIds;
                        MutableIntIntMap mutableIntIntMap = androidComposeViewAccessibilityDelegateCompat.drawingOrder;
                        SparseArrayCompat sparseArrayCompat = androidComposeViewAccessibilityDelegateCompat.labelToActionId;
                        Resources resources = androidComposeView.getContext().getResources();
                        obtain.setClassName("android.view.View");
                        SemanticsConfiguration semanticsConfiguration = semanticsNode3.unmergedConfig;
                        MutableScatterMap mutableScatterMap3 = semanticsConfiguration.props;
                        if (mutableScatterMap3.containsKey(SemanticsProperties.EditableText)) {
                            obtain.setClassName("android.widget.EditText");
                        }
                        if (mutableScatterMap3.containsKey(SemanticsProperties.Text)) {
                            obtain.setClassName("android.widget.TextView");
                        }
                        Object obj13 = mutableScatterMap3.get(SemanticsProperties.Role);
                        if (obj13 == null) {
                            obj13 = null;
                        }
                        Role role = (Role) obj13;
                        if (role != null) {
                            int i4 = role.value;
                            if (semanticsNode3.isFake$ui() || SemanticsNode.getChildren$ui$default(semanticsNode3, false, 4).isEmpty()) {
                                if (i4 == 4) {
                                    obtain.setRoleDescription(resources.getString(R.string.tab));
                                } else if (i4 == 2) {
                                    obtain.setRoleDescription(resources.getString(R.string.switch_role));
                                } else {
                                    String m3425toLegacyClassNameV4PA4sw = ArcadeThemeKt.m3425toLegacyClassNameV4PA4sw(i4);
                                    if (i4 != 5 || semanticsNode3.isUnmergedLeafNode$ui() || semanticsConfiguration.isMergingSemanticsOfDescendants) {
                                        obtain.setClassName(m3425toLegacyClassNameV4PA4sw);
                                    }
                                }
                            }
                        }
                        obtain.setPackageName(androidComposeView.getContext().getPackageName());
                        obtain.setImportantForAccessibility(SemanticsOwnerKt.isImportantForAccessibility(semanticsNode3));
                        boolean isRequestFromAccessibilityTool = DateScrubberKt.isRequestFromAccessibilityTool(accessibilityManager);
                        List children$ui$default = SemanticsNode.getChildren$ui$default(semanticsNode3, false, 4);
                        int size = children$ui$default.size();
                        int i5 = 0;
                        int i6 = 0;
                        while (i6 < size) {
                            int i7 = size;
                            SemanticsNode semanticsNode4 = (SemanticsNode) children$ui$default.get(i6);
                            int i8 = i6;
                            MutableIntObjectMap currentSemanticsNodes = androidComposeViewAccessibilityDelegateCompat.getCurrentSemanticsNodes();
                            List list2 = children$ui$default;
                            int i9 = semanticsNode4.id;
                            if (currentSemanticsNodes.containsKey(i9)) {
                                AndroidViewHolder androidViewHolder = (AndroidViewHolder) androidComposeView.getAndroidViewsHandler$ui().layoutNodeToHolder.get(semanticsNode4.layoutNode);
                                if (i9 != -1) {
                                    if (androidViewHolder != null) {
                                        obtain.addChild(androidViewHolder);
                                    } else {
                                        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds2 = (SemanticsNodeWithAdjustedBounds) androidComposeViewAccessibilityDelegateCompat.getCurrentSemanticsNodes().get(i9);
                                        if (semanticsNodeWithAdjustedBounds2 == null || (semanticsNode2 = semanticsNodeWithAdjustedBounds2.getSemanticsNode()) == null) {
                                            z3 = false;
                                        } else {
                                            Object obj14 = semanticsNode2.getConfig().props.get(SemanticsProperties.IsSensitiveData);
                                            if (obj14 == null) {
                                                obj14 = null;
                                            }
                                            z3 = Intrinsics.areEqual(obj14, Boolean.TRUE);
                                        }
                                        if (isRequestFromAccessibilityTool || !z3) {
                                            obtain.addChild(androidComposeView, i9);
                                        }
                                    }
                                    mutableIntIntMap.set(i9, i5);
                                    i5++;
                                }
                            }
                            i6 = i8 + 1;
                            size = i7;
                            children$ui$default = list2;
                        }
                        if (i == androidComposeViewAccessibilityDelegateCompat.accessibilityFocusedVirtualViewId) {
                            obtain.setAccessibilityFocused(true);
                            obtain.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_CLEAR_ACCESSIBILITY_FOCUS);
                        } else {
                            obtain.setAccessibilityFocused(false);
                            obtain.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_ACCESSIBILITY_FOCUS);
                        }
                        infoText = LayoutUpdate.getInfoText(semanticsNode3);
                        obtain.setText(infoText != null ? (SpannableString) AndroidComposeViewAccessibilityDelegateCompat.trimToSize(zzahu.toAccessibilitySpannableString(infoText, androidComposeView.getDensity(), (FontFamilyResolverImpl) androidComposeView.fontFamilyResolver$delegate.getValue(), androidComposeViewAccessibilityDelegateCompat.urlSpanCache)) : null);
                        SemanticsPropertyKey semanticsPropertyKey = SemanticsProperties.Error;
                        if (mutableScatterMap3.containsKey(semanticsPropertyKey)) {
                            obtain.setContentInvalid();
                            Object obj15 = mutableScatterMap3.get(semanticsPropertyKey);
                            if (obj15 == null) {
                                obj15 = null;
                            }
                            obtain.setError((CharSequence) obj15);
                        }
                        infoStateDescriptionOrNull = LayoutUpdate.getInfoStateDescriptionOrNull(semanticsNode3, resources);
                        obtain.setStateDescription(infoStateDescriptionOrNull);
                        infoIsCheckable = LayoutUpdate.getInfoIsCheckable(semanticsNode3);
                        obtain.setCheckable(infoIsCheckable);
                        Object obj16 = mutableScatterMap3.get(SemanticsProperties.ToggleableState);
                        if (obj16 == null) {
                            obj16 = null;
                        }
                        ToggleableState toggleableState = (ToggleableState) obj16;
                        if (toggleableState != null) {
                            if (toggleableState == ToggleableState.On) {
                                obtain.setChecked(true);
                            } else if (toggleableState == ToggleableState.Off) {
                                obtain.setChecked(false);
                            }
                        }
                        Object obj17 = mutableScatterMap3.get(SemanticsProperties.Selected);
                        if (obj17 == null) {
                            obj17 = null;
                        }
                        Boolean bool = (Boolean) obj17;
                        if (bool != null) {
                            boolean booleanValue = bool.booleanValue();
                            if (role == null) {
                                i2 = 4;
                            } else {
                                i2 = 4;
                                if (role.value == 4) {
                                    obtain.setSelected(booleanValue);
                                }
                            }
                            obtain.setChecked(booleanValue);
                        } else {
                            i2 = 4;
                        }
                        if (!semanticsConfiguration.isMergingSemanticsOfDescendants || SemanticsNode.getChildren$ui$default(semanticsNode3, false, i2).isEmpty()) {
                            Object obj18 = mutableScatterMap3.get(SemanticsProperties.ContentDescription);
                            if (obj18 == null) {
                                obj18 = null;
                            }
                            List list3 = (List) obj18;
                            obtain.setContentDescription(list3 != null ? (String) CollectionsKt.firstOrNull(list3) : null);
                        }
                        Object obj19 = mutableScatterMap3.get(SemanticsProperties.TestTag);
                        if (obj19 == null) {
                            obj19 = null;
                        }
                        String str2 = (String) obj19;
                        if (str2 != null) {
                            SemanticsNode semanticsNode5 = semanticsNode3;
                            while (true) {
                                if (semanticsNode5 == null) {
                                    z2 = false;
                                    break;
                                }
                                SemanticsConfiguration semanticsConfiguration2 = semanticsNode5.unmergedConfig;
                                SemanticsPropertyKey semanticsPropertyKey2 = SemanticsPropertiesAndroid.TestTagsAsResourceId;
                                SemanticsNode semanticsNode6 = semanticsNode5;
                                if (semanticsConfiguration2.props.containsKey(semanticsPropertyKey2)) {
                                    z2 = ((Boolean) semanticsConfiguration2.get(semanticsPropertyKey2)).booleanValue();
                                    break;
                                }
                                semanticsNode5 = semanticsNode6.getParent();
                            }
                            if (z2) {
                                obtain.setViewIdResourceName(str2);
                            }
                        }
                        Object obj20 = mutableScatterMap3.get(SemanticsProperties.Heading);
                        if (obj20 == null) {
                            obj20 = null;
                        }
                        if (((Unit) obj20) != null) {
                            obtain.setHeading(true);
                        }
                        Object obj21 = mutableScatterMap3.get(SemanticsProperties.TextEntryKey);
                        if (obj21 == null) {
                            obj21 = null;
                        }
                        if (((Unit) obj21) != null) {
                            obtain.setTextEntryKey();
                        }
                        if (i != -1) {
                            int orDefault3 = mutableIntIntMap.getOrDefault(semanticsNode3.id);
                            if (orDefault3 != -1) {
                                obtain.setDrawingOrder(orDefault3);
                            } else {
                                Log.w("AccessibilityDelegate", "Drawing order is not available, was AccessibilityNodeInfo requested for a child node before its parent?");
                            }
                        }
                        obtain.setPassword(mutableScatterMap3.containsKey(SemanticsProperties.Password));
                        Object obj22 = mutableScatterMap3.get(SemanticsProperties.IsEditable);
                        if (obj22 == null) {
                            obj22 = null;
                        }
                        Boolean bool2 = Boolean.TRUE;
                        obtain.setEditable(Intrinsics.areEqual(obj22, bool2));
                        Object obj23 = mutableScatterMap3.get(SemanticsProperties.MaxTextLength);
                        if (obj23 == null) {
                            obj23 = null;
                        }
                        Integer num = (Integer) obj23;
                        obtain.setMaxTextLength(num != null ? num.intValue() : -1);
                        obtain.setEnabled(LayoutUpdate.access$enabled(semanticsNode3));
                        SemanticsPropertyKey semanticsPropertyKey3 = SemanticsProperties.Focused;
                        obtain.setFocusable(mutableScatterMap3.containsKey(semanticsPropertyKey3));
                        if (obtain.isFocusable()) {
                            obtain.setFocused(((Boolean) semanticsConfiguration.get(semanticsPropertyKey3)).booleanValue());
                            if (obtain.isFocused()) {
                                i3 = 2;
                                obtain.addAction(2);
                                androidComposeViewAccessibilityDelegateCompat.focusedVirtualViewId = i;
                            } else {
                                i3 = 2;
                                z = true;
                                obtain.addAction(1);
                                obtain.setVisibleToUser(SemanticsOwnerKt.isHidden(semanticsNode3) ^ z);
                                if (semanticsNode3.isFake$ui()) {
                                    semanticsNode = semanticsNode3;
                                } else {
                                    semanticsNode = semanticsNode3.getParent();
                                    semanticsNode.getClass();
                                }
                                if (semanticsNode.getTouchBoundsInRoot().isEmpty()) {
                                    r7 = 0;
                                } else {
                                    r7 = 0;
                                    obtain.setVisibleToUser(false);
                                }
                                obj = mutableScatterMap3.get(SemanticsProperties.LiveRegion);
                                if (obj == null) {
                                    obj = null;
                                }
                                liveRegionMode = (LiveRegionMode) obj;
                                if (liveRegionMode != null) {
                                    int m945unboximpl = liveRegionMode.m945unboximpl();
                                    if (LiveRegionMode.m944equalsimpl0(m945unboximpl, r7) || !LiveRegionMode.m944equalsimpl0(m945unboximpl, 1)) {
                                        i3 = 1;
                                    }
                                    obtain.setLiveRegion(i3);
                                }
                                obtain.setClickable(r7);
                                obj2 = mutableScatterMap3.get(SemanticsActions.OnClick);
                                if (obj2 == null) {
                                    obj2 = null;
                                }
                                accessibilityAction = (AccessibilityAction) obj2;
                                if (accessibilityAction != null) {
                                    Object obj24 = mutableScatterMap3.get(SemanticsProperties.Selected);
                                    if (obj24 == null) {
                                        obj24 = null;
                                    }
                                    boolean areEqual2 = Intrinsics.areEqual(obj24, bool2);
                                    boolean z4 = (role != null && role.value == 4) || (role != null && role.value == 3);
                                    obtain.setClickable(!z4 || (z4 && !areEqual2));
                                    if (LayoutUpdate.access$enabled(semanticsNode3) && obtain.isClickable()) {
                                        obtain.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(16, accessibilityAction.label));
                                    }
                                }
                                int i10 = 0;
                                obtain.setLongClickable(false);
                                obj3 = mutableScatterMap3.get(SemanticsActions.OnLongClick);
                                if (obj3 == null) {
                                    obj3 = null;
                                }
                                accessibilityAction2 = (AccessibilityAction) obj3;
                                if (accessibilityAction2 != null) {
                                    obtain.setLongClickable(true);
                                    if (LayoutUpdate.access$enabled(semanticsNode3)) {
                                        obtain.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(32, accessibilityAction2.label));
                                    }
                                }
                                obj4 = mutableScatterMap3.get(SemanticsActions.CopyText);
                                if (obj4 == null) {
                                    obj4 = null;
                                }
                                accessibilityAction3 = (AccessibilityAction) obj4;
                                if (accessibilityAction3 != null) {
                                    obtain.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(16384, accessibilityAction3.label));
                                }
                                if (LayoutUpdate.access$enabled(semanticsNode3)) {
                                    Object obj25 = mutableScatterMap3.get(SemanticsActions.SetText);
                                    if (obj25 == null) {
                                        obj25 = null;
                                    }
                                    AccessibilityAction accessibilityAction4 = (AccessibilityAction) obj25;
                                    if (accessibilityAction4 != null) {
                                        obtain.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(PKIFailureInfo.badSenderNonce, accessibilityAction4.label));
                                    }
                                    Object obj26 = mutableScatterMap3.get(SemanticsActions.OnImeAction);
                                    if (obj26 == null) {
                                        obj26 = null;
                                    }
                                    AccessibilityAction accessibilityAction5 = (AccessibilityAction) obj26;
                                    if (accessibilityAction5 != null) {
                                        obtain.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(android.R.id.accessibilityActionImeEnter, accessibilityAction5.label));
                                    }
                                    Object obj27 = mutableScatterMap3.get(SemanticsActions.CutText);
                                    if (obj27 == null) {
                                        obj27 = null;
                                    }
                                    AccessibilityAction accessibilityAction6 = (AccessibilityAction) obj27;
                                    if (accessibilityAction6 != null) {
                                        obtain.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(65536, accessibilityAction6.label));
                                    }
                                    Object obj28 = mutableScatterMap3.get(SemanticsActions.PasteText);
                                    if (obj28 == null) {
                                        obj28 = null;
                                    }
                                    AccessibilityAction accessibilityAction7 = (AccessibilityAction) obj28;
                                    if (accessibilityAction7 != null && obtain.isFocused()) {
                                        ClipDescription primaryClipDescription = androidComposeView.clipboardManager.getClipboardManager().getPrimaryClipDescription();
                                        if (primaryClipDescription != null ? primaryClipDescription.hasMimeType("text/*") : false) {
                                            obtain.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(32768, accessibilityAction7.label));
                                        }
                                    }
                                }
                                iterableTextForAccessibility = AndroidComposeViewAccessibilityDelegateCompat.getIterableTextForAccessibility(semanticsNode3);
                                if (iterableTextForAccessibility != null && iterableTextForAccessibility.length() != 0) {
                                    obtain.setTextSelection(androidComposeViewAccessibilityDelegateCompat.getAccessibilitySelectionStart(semanticsNode3), androidComposeViewAccessibilityDelegateCompat.getAccessibilitySelectionEnd(semanticsNode3));
                                    obj10 = mutableScatterMap3.get(SemanticsActions.SetSelection);
                                    if (obj10 == null) {
                                        obj10 = null;
                                    }
                                    AccessibilityAction accessibilityAction8 = (AccessibilityAction) obj10;
                                    obtain.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(PKIFailureInfo.unsupportedVersion, accessibilityAction8 == null ? accessibilityAction8.label : null));
                                    obtain.addAction(256);
                                    obtain.addAction(512);
                                    obtain.setMovementGranularities(11);
                                    obj11 = mutableScatterMap3.get(SemanticsProperties.ContentDescription);
                                    if (obj11 == null) {
                                        obj11 = null;
                                    }
                                    list = (List) obj11;
                                    if ((list != null || list.isEmpty()) && mutableScatterMap3.containsKey(SemanticsActions.GetTextLayoutResult) && !LayoutUpdate.access$excludeLineAndPageGranularities(semanticsNode3)) {
                                        obtain.setMovementGranularities(obtain.getMovementGranularities() | 20);
                                    }
                                }
                                arrayList = new ArrayList();
                                arrayList.add("androidx.compose.ui.semantics.id");
                                text = obtain.getText();
                                if (text != null && text.length() != 0 && mutableScatterMap3.containsKey(SemanticsActions.GetTextLayoutResult)) {
                                    arrayList.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
                                }
                                if (mutableScatterMap3.containsKey(SemanticsProperties.TestTag)) {
                                    arrayList.add("androidx.compose.ui.semantics.testTag");
                                }
                                if (mutableScatterMap3.containsKey(SemanticsProperties.Shape)) {
                                    arrayList.add("androidx.compose.ui.semantics.shapeType");
                                    arrayList.add("androidx.compose.ui.semantics.shapeRect");
                                    arrayList.add("androidx.compose.ui.semantics.shapeCorners");
                                    arrayList.add("androidx.compose.ui.semantics.shapeRegion");
                                }
                                obtain.setAvailableExtraData(arrayList);
                                obj5 = mutableScatterMap3.get(SemanticsProperties.ProgressBarRangeInfo);
                                if (obj5 == null) {
                                    obj5 = null;
                                }
                                progressBarRangeInfo = (ProgressBarRangeInfo) obj5;
                                if (progressBarRangeInfo != null) {
                                    SemanticsPropertyKey semanticsPropertyKey4 = SemanticsActions.SetProgress;
                                    if (mutableScatterMap3.containsKey(semanticsPropertyKey4)) {
                                        obtain.setClassName("android.widget.SeekBar");
                                    } else {
                                        obtain.setClassName("android.widget.ProgressBar");
                                    }
                                    ProgressBarRangeInfo progressBarRangeInfo2 = ProgressBarRangeInfo.Indeterminate;
                                    if (progressBarRangeInfo != SemanticsOwnerKt.getIndeterminate()) {
                                        obtain.setRangeInfo(ObjectRef.obtain(((Number) ((ClosedFloatRange) progressBarRangeInfo.getRange()).getStart()).floatValue(), ((Number) ((ClosedFloatRange) progressBarRangeInfo.getRange()).getEndInclusive()).floatValue(), progressBarRangeInfo.getCurrent()));
                                    }
                                    if (mutableScatterMap3.containsKey(semanticsPropertyKey4) && LayoutUpdate.access$enabled(semanticsNode3)) {
                                        float current = progressBarRangeInfo.getCurrent();
                                        float floatValue = ((Number) ((ClosedFloatRange) progressBarRangeInfo.getRange()).getEndInclusive()).floatValue();
                                        float floatValue2 = ((Number) ((ClosedFloatRange) progressBarRangeInfo.getRange()).getStart()).floatValue();
                                        if (floatValue < floatValue2) {
                                            floatValue = floatValue2;
                                        }
                                        if (current < floatValue) {
                                            obtain.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_FORWARD);
                                        }
                                        float current2 = progressBarRangeInfo.getCurrent();
                                        float floatValue3 = ((Number) ((ClosedFloatRange) progressBarRangeInfo.getRange()).getStart()).floatValue();
                                        float floatValue4 = ((Number) ((ClosedFloatRange) progressBarRangeInfo.getRange()).getEndInclusive()).floatValue();
                                        if (floatValue3 > floatValue4) {
                                            floatValue3 = floatValue4;
                                        }
                                        if (current2 > floatValue3) {
                                            obtain.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_BACKWARD);
                                        }
                                    }
                                }
                                OverlaysKt.addSetProgressAction(semanticsNode3, obtain);
                                UtilsKt.setCollectionInfo(semanticsNode3, obtain);
                                UtilsKt.setCollectionItemInfo(semanticsNode3, obtain);
                                obj6 = mutableScatterMap3.get(SemanticsProperties.HorizontalScrollAxisRange);
                                if (obj6 == null) {
                                    obj6 = null;
                                }
                                scrollAxisRange = (ScrollAxisRange) obj6;
                                obj7 = mutableScatterMap3.get(SemanticsActions.ScrollBy);
                                if (obj7 == null) {
                                    obj7 = null;
                                }
                                AccessibilityAction accessibilityAction9 = (AccessibilityAction) obj7;
                                if (scrollAxisRange != null && accessibilityAction9 != null) {
                                    if (!UtilsKt.hasCollectionInfo(semanticsNode3)) {
                                        obtain.setClassName("android.widget.HorizontalScrollView");
                                    }
                                    if (((Number) scrollAxisRange.maxValue.invoke()).floatValue() > RecyclerView.DECELERATION_RATE) {
                                        obtain.setScrollable(true);
                                    }
                                    if (LayoutUpdate.access$enabled(semanticsNode3)) {
                                        if (AndroidComposeViewAccessibilityDelegateCompat.populateAccessibilityNodeInfoProperties$canScrollForward(scrollAxisRange)) {
                                            obtain.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_FORWARD);
                                            obtain.addAction(!LayoutUpdate.access$isRtl(semanticsNode3) ? AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_RIGHT : AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_LEFT);
                                        }
                                        if (AndroidComposeViewAccessibilityDelegateCompat.populateAccessibilityNodeInfoProperties$canScrollBackward(scrollAxisRange)) {
                                            obtain.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_BACKWARD);
                                            obtain.addAction(!LayoutUpdate.access$isRtl(semanticsNode3) ? AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_LEFT : AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_RIGHT);
                                        }
                                    }
                                }
                                obj8 = mutableScatterMap3.get(SemanticsProperties.VerticalScrollAxisRange);
                                if (obj8 == null) {
                                    obj8 = null;
                                }
                                scrollAxisRange2 = (ScrollAxisRange) obj8;
                                if (scrollAxisRange2 != null && accessibilityAction9 != null) {
                                    if (!UtilsKt.hasCollectionInfo(semanticsNode3)) {
                                        obtain.setClassName("android.widget.ScrollView");
                                    }
                                    if (((Number) scrollAxisRange2.maxValue.invoke()).floatValue() > RecyclerView.DECELERATION_RATE) {
                                        obtain.setScrollable(true);
                                    }
                                    if (LayoutUpdate.access$enabled(semanticsNode3)) {
                                        if (AndroidComposeViewAccessibilityDelegateCompat.populateAccessibilityNodeInfoProperties$canScrollForward(scrollAxisRange2)) {
                                            obtain.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_FORWARD);
                                            obtain.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_DOWN);
                                        }
                                        if (AndroidComposeViewAccessibilityDelegateCompat.populateAccessibilityNodeInfoProperties$canScrollBackward(scrollAxisRange2)) {
                                            obtain.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_BACKWARD);
                                            obtain.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_UP);
                                        }
                                    }
                                }
                                zzage.addPageActions(semanticsNode3, obtain);
                                obj9 = mutableScatterMap3.get(SemanticsProperties.PaneTitle);
                                if (obj9 == null) {
                                    obj9 = null;
                                }
                                obtain.setPaneTitle((CharSequence) obj9);
                                if (LayoutUpdate.access$enabled(semanticsNode3)) {
                                    Object obj29 = mutableScatterMap3.get(SemanticsActions.Expand);
                                    if (obj29 == null) {
                                        obj29 = null;
                                    }
                                    AccessibilityAction accessibilityAction10 = (AccessibilityAction) obj29;
                                    if (accessibilityAction10 != null) {
                                        obtain.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(PKIFailureInfo.transactionIdInUse, accessibilityAction10.label));
                                    }
                                    Object obj30 = mutableScatterMap3.get(SemanticsActions.Collapse);
                                    if (obj30 == null) {
                                        obj30 = null;
                                    }
                                    AccessibilityAction accessibilityAction11 = (AccessibilityAction) obj30;
                                    if (accessibilityAction11 != null) {
                                        obtain.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(PKIFailureInfo.signerNotTrusted, accessibilityAction11.label));
                                    }
                                    Object obj31 = mutableScatterMap3.get(SemanticsActions.Dismiss);
                                    if (obj31 == null) {
                                        obj31 = null;
                                    }
                                    AccessibilityAction accessibilityAction12 = (AccessibilityAction) obj31;
                                    if (accessibilityAction12 != null) {
                                        obtain.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(PKIFailureInfo.badCertTemplate, accessibilityAction12.label));
                                    }
                                    SemanticsPropertyKey semanticsPropertyKey5 = SemanticsActions.CustomActions;
                                    if (mutableScatterMap3.containsKey(semanticsPropertyKey5)) {
                                        List list4 = (List) semanticsConfiguration.get(semanticsPropertyKey5);
                                        if (list4.size() >= mutableIntList._size) {
                                            a$$ExternalSyntheticBUOutline0.m$1(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(mutableIntList._size, " custom actions for one widget", new StringBuilder("Can't have more than ")));
                                            return null;
                                        }
                                        SparseArrayCompat sparseArrayCompat2 = new SparseArrayCompat((Object) null);
                                        MutableObjectIntMap mutableObjectIntMap2 = ObjectIntMapKt.EmptyObjectIntMap;
                                        MutableObjectIntMap mutableObjectIntMap3 = new MutableObjectIntMap();
                                        if (sparseArrayCompat.garbage) {
                                            SieveCacheKt.access$gc(sparseArrayCompat);
                                        }
                                        if (ContainerHelpersKt.binarySearch(sparseArrayCompat.size, i, sparseArrayCompat.keys) >= 0) {
                                            MutableObjectIntMap mutableObjectIntMap4 = (MutableObjectIntMap) SieveCacheKt.commonGet(sparseArrayCompat, i);
                                            MutableIntList mutableIntList2 = new MutableIntList();
                                            int[] iArr = mutableIntList.content;
                                            int i11 = mutableIntList._size;
                                            while (i10 < i11) {
                                                int i12 = i10;
                                                mutableIntList2.add(iArr[i12]);
                                                i10 = i12 + 1;
                                            }
                                            ArrayList arrayList2 = new ArrayList();
                                            int size2 = list4.size();
                                            int i13 = 0;
                                            while (i13 < size2) {
                                                int i14 = size2;
                                                CustomAccessibilityAction customAccessibilityAction = (CustomAccessibilityAction) list4.get(i13);
                                                mutableObjectIntMap4.getClass();
                                                int i15 = i13;
                                                if (mutableObjectIntMap4.findKeyIndex(customAccessibilityAction.getLabel()) >= 0) {
                                                    String label = customAccessibilityAction.getLabel();
                                                    int findKeyIndex = mutableObjectIntMap4.findKeyIndex(label);
                                                    if (findKeyIndex < 0) {
                                                        RuntimeHelpersKt.throwNoSuchElementException("There is no key " + ((Object) label) + " in the map");
                                                        throw null;
                                                    }
                                                    int i16 = mutableObjectIntMap4.values[findKeyIndex];
                                                    mutableObjectIntMap = mutableObjectIntMap4;
                                                    sparseArrayCompat2.put(i16, customAccessibilityAction.getLabel());
                                                    mutableObjectIntMap3.set(i16, customAccessibilityAction.getLabel());
                                                    int[] iArr2 = mutableIntList2.content;
                                                    int i17 = mutableIntList2._size;
                                                    mutableScatterMap2 = mutableScatterMap3;
                                                    int i18 = 0;
                                                    while (true) {
                                                        if (i18 >= i17) {
                                                            i18 = -1;
                                                            break;
                                                        }
                                                        int i19 = i17;
                                                        if (i16 == iArr2[i18]) {
                                                            break;
                                                        }
                                                        i18++;
                                                        i17 = i19;
                                                    }
                                                    if (i18 >= 0) {
                                                        mutableIntList2.removeAt(i18);
                                                    }
                                                    obtain.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(i16, customAccessibilityAction.getLabel()));
                                                } else {
                                                    mutableObjectIntMap = mutableObjectIntMap4;
                                                    mutableScatterMap2 = mutableScatterMap3;
                                                    arrayList2.add(customAccessibilityAction);
                                                }
                                                i13 = i15 + 1;
                                                size2 = i14;
                                                mutableObjectIntMap4 = mutableObjectIntMap;
                                                mutableScatterMap3 = mutableScatterMap2;
                                            }
                                            mutableScatterMap = mutableScatterMap3;
                                            int size3 = arrayList2.size();
                                            for (int i20 = 0; i20 < size3; i20++) {
                                                CustomAccessibilityAction customAccessibilityAction2 = (CustomAccessibilityAction) arrayList2.get(i20);
                                                int i21 = mutableIntList2.get(i20);
                                                sparseArrayCompat2.put(i21, customAccessibilityAction2.getLabel());
                                                mutableObjectIntMap3.set(i21, customAccessibilityAction2.getLabel());
                                                obtain.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(i21, customAccessibilityAction2.getLabel()));
                                            }
                                        } else {
                                            mutableScatterMap = mutableScatterMap3;
                                            int size4 = list4.size();
                                            for (int i22 = 0; i22 < size4; i22++) {
                                                CustomAccessibilityAction customAccessibilityAction3 = (CustomAccessibilityAction) list4.get(i22);
                                                int i23 = mutableIntList.get(i22);
                                                sparseArrayCompat2.put(i23, customAccessibilityAction3.getLabel());
                                                mutableObjectIntMap3.set(i23, customAccessibilityAction3.getLabel());
                                                obtain.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(i23, customAccessibilityAction3.getLabel()));
                                            }
                                        }
                                        androidComposeViewAccessibilityDelegateCompat.actionIdToLabel.put(i, sparseArrayCompat2);
                                        sparseArrayCompat.put(i, mutableObjectIntMap3);
                                        obtain.setScreenReaderFocusable(LayoutUpdate.access$isScreenReaderFocusable(semanticsNode3, resources));
                                        orDefault = androidComposeViewAccessibilityDelegateCompat.idToBeforeMap.getOrDefault(i);
                                        if (orDefault != -1) {
                                            AndroidViewHolder semanticsIdToView2 = ArcadeThemeKt.semanticsIdToView(androidComposeView.getAndroidViewsHandler$ui(), orDefault);
                                            if (semanticsIdToView2 != null) {
                                                obtain.setTraversalBefore(semanticsIdToView2);
                                            } else {
                                                obtain.setTraversalBefore(androidComposeView, orDefault);
                                            }
                                            bundle = null;
                                            androidComposeViewAccessibilityDelegateCompat.addExtraDataToAccessibilityNodeInfoHelper(i, obtain, androidComposeViewAccessibilityDelegateCompat.ExtraDataTestTraversalBeforeVal, null);
                                        } else {
                                            bundle = null;
                                        }
                                        orDefault2 = androidComposeViewAccessibilityDelegateCompat.idToAfterMap.getOrDefault(i);
                                        if (orDefault2 != -1 && (semanticsIdToView = ArcadeThemeKt.semanticsIdToView(androidComposeView.getAndroidViewsHandler$ui(), orDefault2)) != null) {
                                            obtain.setTraversalAfter(semanticsIdToView);
                                            androidComposeViewAccessibilityDelegateCompat.addExtraDataToAccessibilityNodeInfoHelper(i, obtain, androidComposeViewAccessibilityDelegateCompat.ExtraDataTestTraversalAfterVal, bundle);
                                        }
                                        Object obj32 = mutableScatterMap.get(SemanticsPropertiesAndroid.AccessibilityClassName);
                                        str = (String) (obj32 == null ? null : obj32);
                                        if (str != null) {
                                            obtain.setClassName(str);
                                        }
                                        accessibilityNodeInfoCompat = obtain;
                                    }
                                }
                                mutableScatterMap = mutableScatterMap3;
                                obtain.setScreenReaderFocusable(LayoutUpdate.access$isScreenReaderFocusable(semanticsNode3, resources));
                                orDefault = androidComposeViewAccessibilityDelegateCompat.idToBeforeMap.getOrDefault(i);
                                if (orDefault != -1) {
                                }
                                orDefault2 = androidComposeViewAccessibilityDelegateCompat.idToAfterMap.getOrDefault(i);
                                if (orDefault2 != -1) {
                                    obtain.setTraversalAfter(semanticsIdToView);
                                    androidComposeViewAccessibilityDelegateCompat.addExtraDataToAccessibilityNodeInfoHelper(i, obtain, androidComposeViewAccessibilityDelegateCompat.ExtraDataTestTraversalAfterVal, bundle);
                                }
                                Object obj322 = mutableScatterMap.get(SemanticsPropertiesAndroid.AccessibilityClassName);
                                str = (String) (obj322 == null ? null : obj322);
                                if (str != null) {
                                }
                                accessibilityNodeInfoCompat = obtain;
                            }
                        } else {
                            i3 = 2;
                        }
                        z = true;
                        obtain.setVisibleToUser(SemanticsOwnerKt.isHidden(semanticsNode3) ^ z);
                        if (semanticsNode3.isFake$ui()) {
                        }
                        if (semanticsNode.getTouchBoundsInRoot().isEmpty()) {
                        }
                        obj = mutableScatterMap3.get(SemanticsProperties.LiveRegion);
                        if (obj == null) {
                        }
                        liveRegionMode = (LiveRegionMode) obj;
                        if (liveRegionMode != null) {
                        }
                        obtain.setClickable(r7);
                        obj2 = mutableScatterMap3.get(SemanticsActions.OnClick);
                        if (obj2 == null) {
                        }
                        accessibilityAction = (AccessibilityAction) obj2;
                        if (accessibilityAction != null) {
                        }
                        int i102 = 0;
                        obtain.setLongClickable(false);
                        obj3 = mutableScatterMap3.get(SemanticsActions.OnLongClick);
                        if (obj3 == null) {
                        }
                        accessibilityAction2 = (AccessibilityAction) obj3;
                        if (accessibilityAction2 != null) {
                        }
                        obj4 = mutableScatterMap3.get(SemanticsActions.CopyText);
                        if (obj4 == null) {
                        }
                        accessibilityAction3 = (AccessibilityAction) obj4;
                        if (accessibilityAction3 != null) {
                        }
                        if (LayoutUpdate.access$enabled(semanticsNode3)) {
                        }
                        iterableTextForAccessibility = AndroidComposeViewAccessibilityDelegateCompat.getIterableTextForAccessibility(semanticsNode3);
                        if (iterableTextForAccessibility != null) {
                            obtain.setTextSelection(androidComposeViewAccessibilityDelegateCompat.getAccessibilitySelectionStart(semanticsNode3), androidComposeViewAccessibilityDelegateCompat.getAccessibilitySelectionEnd(semanticsNode3));
                            obj10 = mutableScatterMap3.get(SemanticsActions.SetSelection);
                            if (obj10 == null) {
                            }
                            AccessibilityAction accessibilityAction82 = (AccessibilityAction) obj10;
                            obtain.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(PKIFailureInfo.unsupportedVersion, accessibilityAction82 == null ? accessibilityAction82.label : null));
                            obtain.addAction(256);
                            obtain.addAction(512);
                            obtain.setMovementGranularities(11);
                            obj11 = mutableScatterMap3.get(SemanticsProperties.ContentDescription);
                            if (obj11 == null) {
                            }
                            list = (List) obj11;
                            if (list != null) {
                            }
                            obtain.setMovementGranularities(obtain.getMovementGranularities() | 20);
                        }
                        arrayList = new ArrayList();
                        arrayList.add("androidx.compose.ui.semantics.id");
                        text = obtain.getText();
                        if (text != null) {
                            arrayList.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
                        }
                        if (mutableScatterMap3.containsKey(SemanticsProperties.TestTag)) {
                        }
                        if (mutableScatterMap3.containsKey(SemanticsProperties.Shape)) {
                        }
                        obtain.setAvailableExtraData(arrayList);
                        obj5 = mutableScatterMap3.get(SemanticsProperties.ProgressBarRangeInfo);
                        if (obj5 == null) {
                        }
                        progressBarRangeInfo = (ProgressBarRangeInfo) obj5;
                        if (progressBarRangeInfo != null) {
                        }
                        OverlaysKt.addSetProgressAction(semanticsNode3, obtain);
                        UtilsKt.setCollectionInfo(semanticsNode3, obtain);
                        UtilsKt.setCollectionItemInfo(semanticsNode3, obtain);
                        obj6 = mutableScatterMap3.get(SemanticsProperties.HorizontalScrollAxisRange);
                        if (obj6 == null) {
                        }
                        scrollAxisRange = (ScrollAxisRange) obj6;
                        obj7 = mutableScatterMap3.get(SemanticsActions.ScrollBy);
                        if (obj7 == null) {
                        }
                        AccessibilityAction accessibilityAction92 = (AccessibilityAction) obj7;
                        if (scrollAxisRange != null) {
                            if (!UtilsKt.hasCollectionInfo(semanticsNode3)) {
                            }
                            if (((Number) scrollAxisRange.maxValue.invoke()).floatValue() > RecyclerView.DECELERATION_RATE) {
                            }
                            if (LayoutUpdate.access$enabled(semanticsNode3)) {
                            }
                        }
                        obj8 = mutableScatterMap3.get(SemanticsProperties.VerticalScrollAxisRange);
                        if (obj8 == null) {
                        }
                        scrollAxisRange2 = (ScrollAxisRange) obj8;
                        if (scrollAxisRange2 != null) {
                            if (!UtilsKt.hasCollectionInfo(semanticsNode3)) {
                            }
                            if (((Number) scrollAxisRange2.maxValue.invoke()).floatValue() > RecyclerView.DECELERATION_RATE) {
                            }
                            if (LayoutUpdate.access$enabled(semanticsNode3)) {
                            }
                        }
                        zzage.addPageActions(semanticsNode3, obtain);
                        obj9 = mutableScatterMap3.get(SemanticsProperties.PaneTitle);
                        if (obj9 == null) {
                        }
                        obtain.setPaneTitle((CharSequence) obj9);
                        if (LayoutUpdate.access$enabled(semanticsNode3)) {
                        }
                        mutableScatterMap = mutableScatterMap3;
                        obtain.setScreenReaderFocusable(LayoutUpdate.access$isScreenReaderFocusable(semanticsNode3, resources));
                        orDefault = androidComposeViewAccessibilityDelegateCompat.idToBeforeMap.getOrDefault(i);
                        if (orDefault != -1) {
                        }
                        orDefault2 = androidComposeViewAccessibilityDelegateCompat.idToAfterMap.getOrDefault(i);
                        if (orDefault2 != -1) {
                        }
                        Object obj3222 = mutableScatterMap.get(SemanticsPropertiesAndroid.AccessibilityClassName);
                        str = (String) (obj3222 == null ? null : obj3222);
                        if (str != null) {
                        }
                        accessibilityNodeInfoCompat = obtain;
                    }
                    accessibilityNodeInfoCompat = null;
                }
            }
            if (androidComposeViewAccessibilityDelegateCompat.sendingFocusAffectingEvent) {
                if (i == androidComposeViewAccessibilityDelegateCompat.accessibilityFocusedVirtualViewId) {
                    androidComposeViewAccessibilityDelegateCompat.currentlyAccessibilityFocusedANI = accessibilityNodeInfoCompat;
                }
                if (i == androidComposeViewAccessibilityDelegateCompat.focusedVirtualViewId) {
                    androidComposeViewAccessibilityDelegateCompat.currentlyFocusedANI = accessibilityNodeInfoCompat;
                }
            }
            return accessibilityNodeInfoCompat;
        }

        @Override // coil3.Extras.Key
        public final AccessibilityNodeInfoCompat findFocus(int i) {
            AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = AndroidComposeViewAccessibilityDelegateCompat.this;
            if (i != 1) {
                if (i == 2) {
                    return createAccessibilityNodeInfo(androidComposeViewAccessibilityDelegateCompat.accessibilityFocusedVirtualViewId);
                }
                a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "Unknown focus type: "));
                return null;
            }
            int i2 = androidComposeViewAccessibilityDelegateCompat.focusedVirtualViewId;
            if (i2 == Integer.MIN_VALUE) {
                return null;
            }
            return createAccessibilityNodeInfo(i2);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:357:0x01be, code lost:
        
            r1 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:511:0x076c, code lost:
        
            if (r0 != 16) goto L518;
         */
        /* JADX WARN: Removed duplicated region for block: B:312:0x0278  */
        /* JADX WARN: Removed duplicated region for block: B:315:0x029a  */
        /* JADX WARN: Removed duplicated region for block: B:320:0x02c1  */
        /* JADX WARN: Removed duplicated region for block: B:325:0x02e6  */
        /* JADX WARN: Removed duplicated region for block: B:337:0x02e8  */
        /* JADX WARN: Removed duplicated region for block: B:347:0x02d0  */
        /* JADX WARN: Removed duplicated region for block: B:348:0x02a9  */
        /* JADX WARN: Removed duplicated region for block: B:349:0x027b  */
        /* JADX WARN: Removed duplicated region for block: B:514:0x07cd  */
        /* JADX WARN: Removed duplicated region for block: B:90:0x014a  */
        @Override // coil3.Extras.Key
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean performAction(int i, int i2, Bundle bundle) {
            SemanticsNode semanticsNode;
            int i3;
            Text.TextBase textBase;
            int i4;
            int i5;
            TextLayoutResult textLayoutResult;
            Function0 function0;
            Function0 function02;
            Function0 function03;
            Function0 function04;
            Function0 function05;
            Function0 function06;
            Function0 function07;
            Function0 function08;
            Function0 function09;
            Function1 function1;
            AccessibilityAction accessibilityAction;
            long j;
            float f;
            float f2;
            float f3;
            float f4;
            long floatToRawIntBits;
            long floatToRawIntBits2;
            Function1 function12;
            Function0 function010;
            float f5;
            float f6;
            Float f7;
            boolean z;
            AccessibilityAction accessibilityAction2;
            Function0 function011;
            float intBitsToFloat;
            AccessibilityAction accessibilityAction3;
            Function0 function012;
            Function0 function013;
            Function0 function014;
            Function0 function015;
            Function0 function016;
            CharSequence charSequence;
            AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = AndroidComposeViewAccessibilityDelegateCompat.this;
            AccessibilityManager accessibilityManager = androidComposeViewAccessibilityDelegateCompat.accessibilityManager;
            Float valueOf = Float.valueOf(RecyclerView.DECELERATION_RATE);
            AndroidComposeView androidComposeView = androidComposeViewAccessibilityDelegateCompat.view;
            SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = (SemanticsNodeWithAdjustedBounds) androidComposeViewAccessibilityDelegateCompat.getCurrentSemanticsNodes().get(i);
            if (semanticsNodeWithAdjustedBounds != null && (semanticsNode = semanticsNodeWithAdjustedBounds.getSemanticsNode()) != null) {
                int i6 = semanticsNode.id;
                SemanticsConfiguration semanticsConfiguration = semanticsNode.unmergedConfig;
                MutableScatterMap mutableScatterMap = semanticsConfiguration.props;
                Object obj = mutableScatterMap.get(SemanticsProperties.IsSensitiveData);
                if (obj == null) {
                    obj = null;
                }
                Boolean bool = Boolean.TRUE;
                if (!Intrinsics.areEqual(obj, bool) || DateScrubberKt.isRequestFromAccessibilityTool(accessibilityManager)) {
                    if (i2 == 64) {
                        if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled() || (i3 = androidComposeViewAccessibilityDelegateCompat.accessibilityFocusedVirtualViewId) == i) {
                            return false;
                        }
                        if (i3 != Integer.MIN_VALUE) {
                            AndroidComposeViewAccessibilityDelegateCompat.sendEventForVirtualView$default(androidComposeViewAccessibilityDelegateCompat, i3, 65536, null, 12);
                        }
                        androidComposeViewAccessibilityDelegateCompat.accessibilityFocusedVirtualViewId = i;
                        androidComposeView.invalidate();
                        AndroidComposeViewAccessibilityDelegateCompat.sendEventForVirtualView$default(androidComposeViewAccessibilityDelegateCompat, i, 32768, null, 12);
                        return true;
                    }
                    if (i2 == 128) {
                        if (androidComposeViewAccessibilityDelegateCompat.accessibilityFocusedVirtualViewId != i) {
                            return false;
                        }
                        androidComposeViewAccessibilityDelegateCompat.accessibilityFocusedVirtualViewId = PKIFailureInfo.systemUnavail;
                        androidComposeViewAccessibilityDelegateCompat.currentlyAccessibilityFocusedANI = null;
                        androidComposeView.invalidate();
                        AndroidComposeViewAccessibilityDelegateCompat.sendEventForVirtualView$default(androidComposeViewAccessibilityDelegateCompat, i, 65536, null, 12);
                        return true;
                    }
                    if (i2 == 256 || i2 == 512) {
                        if (bundle != null) {
                            int i7 = bundle.getInt("ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT");
                            boolean z2 = bundle.getBoolean("ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN");
                            boolean z3 = i2 == 256;
                            Integer num = androidComposeViewAccessibilityDelegateCompat.previousTraversedNode;
                            if (num == null || i6 != num.intValue()) {
                                androidComposeViewAccessibilityDelegateCompat.accessibilityCursorPosition = -1;
                                androidComposeViewAccessibilityDelegateCompat.previousTraversedNode = Integer.valueOf(i6);
                            }
                            String iterableTextForAccessibility = AndroidComposeViewAccessibilityDelegateCompat.getIterableTextForAccessibility(semanticsNode);
                            if (iterableTextForAccessibility != null && iterableTextForAccessibility.length() != 0) {
                                String iterableTextForAccessibility2 = AndroidComposeViewAccessibilityDelegateCompat.getIterableTextForAccessibility(semanticsNode);
                                if (iterableTextForAccessibility2 != null && iterableTextForAccessibility2.length() != 0) {
                                    if (i7 == 1) {
                                        AccessibilityIterators$WordTextSegmentIterator zzafbVar = zzafb.getInstance(androidComposeView.getContext().getResources().getConfiguration().locale);
                                        zzafbVar.initialize(iterableTextForAccessibility2);
                                        textBase = zzafbVar;
                                    } else if (i7 != 2) {
                                        if (i7 != 4) {
                                            if (i7 == 8) {
                                                AccessibilityIterators$ParagraphTextSegmentIterator zzafeVar = zzafe.getInstance();
                                                zzafeVar.initialize(iterableTextForAccessibility2);
                                                textBase = zzafeVar;
                                            }
                                        }
                                        if (mutableScatterMap.containsKey(SemanticsActions.GetTextLayoutResult) && (textLayoutResult = ArcadeThemeKt.getTextLayoutResult(semanticsConfiguration)) != null) {
                                            if (i7 == 4) {
                                                AccessibilityIterators$LineTextSegmentIterator accessibilityIterators$LineTextSegmentIterator = AccessibilityIterators$LineTextSegmentIterator.lineInstance;
                                                AccessibilityIterators$LineTextSegmentIterator blockersDataKt = BlockersDataKt.getInstance();
                                                blockersDataKt.initialize(iterableTextForAccessibility2, textLayoutResult);
                                                textBase = blockersDataKt;
                                            } else {
                                                AccessibilityIterators$PageTextSegmentIterator accessibilityIterators$PageTextSegmentIterator = AccessibilityIterators$PageTextSegmentIterator.pageInstance;
                                                AccessibilityIterators$PageTextSegmentIterator zzafdVar = zzafd.getInstance();
                                                zzafdVar.initialize(iterableTextForAccessibility2, textLayoutResult, semanticsNode);
                                                textBase = zzafdVar;
                                            }
                                        }
                                    } else {
                                        AccessibilityIterators$WordTextSegmentIterator fakeOverlayLayerKt = FakeOverlayLayerKt.getInstance(androidComposeView.getContext().getResources().getConfiguration().locale);
                                        fakeOverlayLayerKt.initialize(iterableTextForAccessibility2);
                                        textBase = fakeOverlayLayerKt;
                                    }
                                    if (textBase != null) {
                                        int accessibilitySelectionEnd = androidComposeViewAccessibilityDelegateCompat.getAccessibilitySelectionEnd(semanticsNode);
                                        if (accessibilitySelectionEnd == -1) {
                                            accessibilitySelectionEnd = z3 ? 0 : iterableTextForAccessibility.length();
                                        }
                                        int[] following = z3 ? textBase.following(accessibilitySelectionEnd) : textBase.preceding(accessibilitySelectionEnd);
                                        if (following != null) {
                                            int i8 = following[0];
                                            int i9 = following[1];
                                            if (z2 && !mutableScatterMap.containsKey(SemanticsProperties.ContentDescription) && mutableScatterMap.containsKey(SemanticsProperties.EditableText)) {
                                                i4 = androidComposeViewAccessibilityDelegateCompat.getAccessibilitySelectionStart(semanticsNode);
                                                if (i4 == -1) {
                                                    i4 = z3 ? i8 : i9;
                                                }
                                                i5 = z3 ? i9 : i8;
                                            } else {
                                                i4 = z3 ? i9 : i8;
                                                i5 = i4;
                                            }
                                            androidComposeViewAccessibilityDelegateCompat.pendingTextTraversedEvent = new PendingTextTraversedEvent(semanticsNode, z3 ? 256 : 512, i7, i8, i9, SystemClock.uptimeMillis());
                                            androidComposeViewAccessibilityDelegateCompat.setAccessibilitySelection(semanticsNode, i4, i5, true);
                                            return true;
                                        }
                                    }
                                }
                                textBase = null;
                                if (textBase != null) {
                                }
                            }
                        }
                    } else if (i2 == 16384) {
                        Object obj2 = mutableScatterMap.get(SemanticsActions.CopyText);
                        AccessibilityAction accessibilityAction4 = (AccessibilityAction) (obj2 == null ? null : obj2);
                        if (accessibilityAction4 != null && (function0 = (Function0) accessibilityAction4.action) != null) {
                            return ((Boolean) function0.invoke()).booleanValue();
                        }
                    } else {
                        if (i2 == 131072) {
                            boolean accessibilitySelection = androidComposeViewAccessibilityDelegateCompat.setAccessibilitySelection(semanticsNode, bundle != null ? bundle.getInt("ACTION_ARGUMENT_SELECTION_START_INT", -1) : -1, bundle != null ? bundle.getInt("ACTION_ARGUMENT_SELECTION_END_INT", -1) : -1, false);
                            if (accessibilitySelection) {
                                AndroidComposeViewAccessibilityDelegateCompat.sendEventForVirtualView$default(androidComposeViewAccessibilityDelegateCompat, androidComposeViewAccessibilityDelegateCompat.semanticsNodeIdToAccessibilityVirtualNodeId(i6), 0, null, 12);
                            }
                            return accessibilitySelection;
                        }
                        if (LayoutUpdate.access$enabled(semanticsNode)) {
                            if (i2 == 1) {
                                if (androidComposeView.isInTouchMode()) {
                                    androidComposeView.requestFocusFromTouch();
                                }
                                Object obj3 = mutableScatterMap.get(SemanticsActions.RequestFocus);
                                AccessibilityAction accessibilityAction5 = (AccessibilityAction) (obj3 == null ? null : obj3);
                                if (accessibilityAction5 != null && (function02 = (Function0) accessibilityAction5.action) != null) {
                                    return ((Boolean) function02.invoke()).booleanValue();
                                }
                            } else if (i2 != 2) {
                                switch (i2) {
                                    case 16:
                                        Object obj4 = mutableScatterMap.get(SemanticsActions.OnClick);
                                        if (obj4 == null) {
                                            obj4 = null;
                                        }
                                        AccessibilityAction accessibilityAction6 = (AccessibilityAction) obj4;
                                        Boolean bool2 = (accessibilityAction6 == null || (function03 = (Function0) accessibilityAction6.action) == null) ? null : (Boolean) function03.invoke();
                                        AndroidComposeViewAccessibilityDelegateCompat.sendEventForVirtualView$default(androidComposeViewAccessibilityDelegateCompat, i, 1, null, 12);
                                        if (bool2 != null) {
                                            return bool2.booleanValue();
                                        }
                                        break;
                                    case 32:
                                        Object obj5 = mutableScatterMap.get(SemanticsActions.OnLongClick);
                                        AccessibilityAction accessibilityAction7 = (AccessibilityAction) (obj5 == null ? null : obj5);
                                        if (accessibilityAction7 != null && (function04 = (Function0) accessibilityAction7.action) != null) {
                                            return ((Boolean) function04.invoke()).booleanValue();
                                        }
                                        break;
                                    case 4096:
                                    case PKIFailureInfo.certRevoked /* 8192 */:
                                        boolean z4 = i2 == 4096;
                                        boolean z5 = i2 == 8192;
                                        boolean z6 = i2 == 16908345;
                                        boolean z7 = i2 == 16908347;
                                        boolean z8 = i2 == 16908344;
                                        boolean z9 = i2 == 16908346;
                                        boolean z10 = z6 || z7 || z4 || z5;
                                        boolean z11 = z8 || z9 || z4 || z5;
                                        if (z4 || z5) {
                                            Object obj6 = mutableScatterMap.get(SemanticsProperties.ProgressBarRangeInfo);
                                            if (obj6 == null) {
                                                obj6 = null;
                                            }
                                            ProgressBarRangeInfo progressBarRangeInfo = (ProgressBarRangeInfo) obj6;
                                            Object obj7 = mutableScatterMap.get(SemanticsActions.SetProgress);
                                            if (obj7 == null) {
                                                obj7 = null;
                                            }
                                            AccessibilityAction accessibilityAction8 = (AccessibilityAction) obj7;
                                            if (progressBarRangeInfo != null && accessibilityAction8 != null) {
                                                float floatValue = ((Number) ((ClosedFloatRange) progressBarRangeInfo.getRange()).getEndInclusive()).floatValue();
                                                float floatValue2 = ((Number) ((ClosedFloatRange) progressBarRangeInfo.getRange()).getStart()).floatValue();
                                                if (floatValue < floatValue2) {
                                                    floatValue = floatValue2;
                                                }
                                                float floatValue3 = ((Number) ((ClosedFloatRange) progressBarRangeInfo.getRange()).getStart()).floatValue();
                                                float floatValue4 = ((Number) ((ClosedFloatRange) progressBarRangeInfo.getRange()).getEndInclusive()).floatValue();
                                                if (floatValue3 > floatValue4) {
                                                    floatValue3 = floatValue4;
                                                }
                                                if (progressBarRangeInfo.getSteps() > 0) {
                                                    f5 = floatValue - floatValue3;
                                                    f6 = progressBarRangeInfo.getSteps() + 1;
                                                } else {
                                                    f5 = floatValue - floatValue3;
                                                    f6 = 20.0f;
                                                }
                                                float f8 = f5 / f6;
                                                if (z5) {
                                                    f8 = -f8;
                                                }
                                                Function1 function13 = (Function1) accessibilityAction8.action;
                                                if (function13 != null) {
                                                    return ((Boolean) function13.invoke(Float.valueOf(progressBarRangeInfo.getCurrent() + f8))).booleanValue();
                                                }
                                            }
                                        }
                                        long m634getSizeNHjbRc = ValueInsets.boundsInParent((InnerNodeCoordinator) semanticsNode.layoutNode.nodes.innerCoordinator).m634getSizeNHjbRc();
                                        Float scrollViewportLength = ArcadeThemeKt.getScrollViewportLength(semanticsConfiguration);
                                        Object obj8 = mutableScatterMap.get(SemanticsActions.ScrollBy);
                                        if (obj8 == null) {
                                            obj8 = null;
                                        }
                                        AccessibilityAction accessibilityAction9 = (AccessibilityAction) obj8;
                                        if (accessibilityAction9 != null) {
                                            Function function = accessibilityAction9.action;
                                            Object obj9 = mutableScatterMap.get(SemanticsProperties.HorizontalScrollAxisRange);
                                            if (obj9 == null) {
                                                obj9 = null;
                                            }
                                            ScrollAxisRange scrollAxisRange = (ScrollAxisRange) obj9;
                                            if (scrollAxisRange == null || !z10) {
                                                f7 = scrollViewportLength;
                                                z = z11;
                                            } else {
                                                if (scrollViewportLength != null) {
                                                    intBitsToFloat = scrollViewportLength.floatValue();
                                                    f7 = scrollViewportLength;
                                                    z = z11;
                                                } else {
                                                    f7 = scrollViewportLength;
                                                    z = z11;
                                                    intBitsToFloat = Float.intBitsToFloat((int) (m634getSizeNHjbRc >> 32));
                                                }
                                                if (z6 || z5) {
                                                    intBitsToFloat = -intBitsToFloat;
                                                }
                                                if (LayoutUpdate.access$isRtl(semanticsNode) && (z6 || z7)) {
                                                    intBitsToFloat = -intBitsToFloat;
                                                }
                                                if (AndroidComposeViewAccessibilityDelegateCompat.performActionHelper$canScroll(scrollAxisRange, intBitsToFloat)) {
                                                    SemanticsPropertyKey semanticsPropertyKey = SemanticsActions.PageLeft;
                                                    if (mutableScatterMap.containsKey(semanticsPropertyKey) || mutableScatterMap.containsKey(SemanticsActions.PageRight)) {
                                                        if (intBitsToFloat > RecyclerView.DECELERATION_RATE) {
                                                            Object obj10 = mutableScatterMap.get(SemanticsActions.PageRight);
                                                            accessibilityAction3 = (AccessibilityAction) (obj10 == null ? null : obj10);
                                                        } else {
                                                            Object obj11 = mutableScatterMap.get(semanticsPropertyKey);
                                                            accessibilityAction3 = (AccessibilityAction) (obj11 == null ? null : obj11);
                                                        }
                                                        if (accessibilityAction3 != null && (function012 = (Function0) accessibilityAction3.action) != null) {
                                                            return ((Boolean) function012.invoke()).booleanValue();
                                                        }
                                                    } else {
                                                        Function2 function2 = (Function2) function;
                                                        if (function2 != null) {
                                                            return ((Boolean) function2.invoke(Float.valueOf(intBitsToFloat), valueOf)).booleanValue();
                                                        }
                                                    }
                                                }
                                            }
                                            Object obj12 = mutableScatterMap.get(SemanticsProperties.VerticalScrollAxisRange);
                                            if (obj12 == null) {
                                                obj12 = null;
                                            }
                                            ScrollAxisRange scrollAxisRange2 = (ScrollAxisRange) obj12;
                                            if (scrollAxisRange2 != null && z) {
                                                float floatValue5 = f7 != null ? f7.floatValue() : Float.intBitsToFloat((int) (m634getSizeNHjbRc & BodyPartID.bodyIdMax));
                                                if (z8 || z5) {
                                                    floatValue5 = -floatValue5;
                                                }
                                                if (AndroidComposeViewAccessibilityDelegateCompat.performActionHelper$canScroll(scrollAxisRange2, floatValue5)) {
                                                    SemanticsPropertyKey semanticsPropertyKey2 = SemanticsActions.PageUp;
                                                    if (mutableScatterMap.containsKey(semanticsPropertyKey2) || mutableScatterMap.containsKey(SemanticsActions.PageDown)) {
                                                        if (floatValue5 > RecyclerView.DECELERATION_RATE) {
                                                            Object obj13 = mutableScatterMap.get(SemanticsActions.PageDown);
                                                            accessibilityAction2 = (AccessibilityAction) (obj13 == null ? null : obj13);
                                                        } else {
                                                            Object obj14 = mutableScatterMap.get(semanticsPropertyKey2);
                                                            accessibilityAction2 = (AccessibilityAction) (obj14 == null ? null : obj14);
                                                        }
                                                        if (accessibilityAction2 != null && (function011 = (Function0) accessibilityAction2.action) != null) {
                                                            return ((Boolean) function011.invoke()).booleanValue();
                                                        }
                                                    } else {
                                                        Function2 function22 = (Function2) function;
                                                        if (function22 != null) {
                                                            return ((Boolean) function22.invoke(valueOf, Float.valueOf(floatValue5))).booleanValue();
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        break;
                                    case 32768:
                                        Object obj15 = mutableScatterMap.get(SemanticsActions.PasteText);
                                        AccessibilityAction accessibilityAction10 = (AccessibilityAction) (obj15 == null ? null : obj15);
                                        if (accessibilityAction10 != null && (function05 = (Function0) accessibilityAction10.action) != null) {
                                            return ((Boolean) function05.invoke()).booleanValue();
                                        }
                                        break;
                                    case 65536:
                                        Object obj16 = mutableScatterMap.get(SemanticsActions.CutText);
                                        AccessibilityAction accessibilityAction11 = (AccessibilityAction) (obj16 == null ? null : obj16);
                                        if (accessibilityAction11 != null && (function06 = (Function0) accessibilityAction11.action) != null) {
                                            return ((Boolean) function06.invoke()).booleanValue();
                                        }
                                        break;
                                    case PKIFailureInfo.transactionIdInUse /* 262144 */:
                                        Object obj17 = mutableScatterMap.get(SemanticsActions.Expand);
                                        AccessibilityAction accessibilityAction12 = (AccessibilityAction) (obj17 == null ? null : obj17);
                                        if (accessibilityAction12 != null && (function07 = (Function0) accessibilityAction12.action) != null) {
                                            return ((Boolean) function07.invoke()).booleanValue();
                                        }
                                        break;
                                    case PKIFailureInfo.signerNotTrusted /* 524288 */:
                                        Object obj18 = mutableScatterMap.get(SemanticsActions.Collapse);
                                        AccessibilityAction accessibilityAction13 = (AccessibilityAction) (obj18 == null ? null : obj18);
                                        if (accessibilityAction13 != null && (function08 = (Function0) accessibilityAction13.action) != null) {
                                            return ((Boolean) function08.invoke()).booleanValue();
                                        }
                                        break;
                                    case PKIFailureInfo.badCertTemplate /* 1048576 */:
                                        Object obj19 = mutableScatterMap.get(SemanticsActions.Dismiss);
                                        AccessibilityAction accessibilityAction14 = (AccessibilityAction) (obj19 == null ? null : obj19);
                                        if (accessibilityAction14 != null && (function09 = (Function0) accessibilityAction14.action) != null) {
                                            return ((Boolean) function09.invoke()).booleanValue();
                                        }
                                        break;
                                    case PKIFailureInfo.badSenderNonce /* 2097152 */:
                                        String string2 = bundle != null ? bundle.getString("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE") : null;
                                        Object obj20 = mutableScatterMap.get(SemanticsActions.SetText);
                                        AccessibilityAction accessibilityAction15 = (AccessibilityAction) (obj20 == null ? null : obj20);
                                        if (accessibilityAction15 != null && (function1 = (Function1) accessibilityAction15.action) != null) {
                                            if (string2 == null) {
                                                string2 = "";
                                            }
                                            return ((Boolean) function1.invoke(new AnnotatedString(string2))).booleanValue();
                                        }
                                        break;
                                    case android.R.id.accessibilityActionShowOnScreen:
                                        SemanticsNode parent = semanticsNode.getParent();
                                        if (parent != null) {
                                            Object obj21 = parent.unmergedConfig.props.get(SemanticsActions.ScrollBy);
                                            if (obj21 == null) {
                                                obj21 = null;
                                            }
                                            accessibilityAction = (AccessibilityAction) obj21;
                                            while (accessibilityAction == null && parent != null) {
                                                parent = parent.getParent();
                                                if (parent != null) {
                                                    Object obj22 = parent.unmergedConfig.props.get(SemanticsActions.ScrollBy);
                                                    if (obj22 == null) {
                                                        obj22 = null;
                                                    }
                                                    accessibilityAction = (AccessibilityAction) obj22;
                                                }
                                            }
                                            if (parent == null) {
                                                Rect boundsInRoot = semanticsNode.getBoundsInRoot();
                                                return androidComposeView.requestRectangleOnScreen(new android.graphics.Rect((int) Math.floor(boundsInRoot.left), (int) Math.floor(boundsInRoot.top), MathKt__MathJVMKt.roundToInt((float) Math.ceil(boundsInRoot.right)), MathKt__MathJVMKt.roundToInt((float) Math.ceil(boundsInRoot.bottom))));
                                            }
                                            long j2 = 0;
                                            boolean z12 = false;
                                            while (parent != null) {
                                                LayoutNode layoutNode = parent.layoutNode;
                                                MutableScatterMap mutableScatterMap2 = parent.unmergedConfig.props;
                                                Object obj23 = mutableScatterMap2.get(SemanticsActions.ScrollBy);
                                                if (obj23 == null) {
                                                    obj23 = null;
                                                }
                                                AccessibilityAction accessibilityAction16 = (AccessibilityAction) obj23;
                                                if (accessibilityAction16 != null) {
                                                    Rect boundsInParent = ValueInsets.boundsInParent((InnerNodeCoordinator) layoutNode.nodes.innerCoordinator);
                                                    LayoutCoordinates parentLayoutCoordinates = ((InnerNodeCoordinator) layoutNode.nodes.innerCoordinator).getParentLayoutCoordinates();
                                                    Rect m637translatek4lQ0M = boundsInParent.m637translatek4lQ0M(parentLayoutCoordinates != null ? ((NodeCoordinator) parentLayoutCoordinates).mo841localToRootMKHz9U(0L) : 0L);
                                                    NodeCoordinator findCoordinatorToGetBounds$ui = semanticsNode.findCoordinatorToGetBounds$ui();
                                                    if (findCoordinatorToGetBounds$ui != null) {
                                                        if (!findCoordinatorToGetBounds$ui.isAttached()) {
                                                            findCoordinatorToGetBounds$ui = null;
                                                        }
                                                        if (findCoordinatorToGetBounds$ui != null) {
                                                            j = findCoordinatorToGetBounds$ui.mo841localToRootMKHz9U(0L);
                                                            long m626plusMKHz9U = Offset.m626plusMKHz9U(j, j2);
                                                            NodeCoordinator findCoordinatorToGetBounds$ui2 = semanticsNode.findCoordinatorToGetBounds$ui();
                                                            long j3 = j2;
                                                            Rect m1180Recttz77jQw = DBUtil.m1180Recttz77jQw(m626plusMKHz9U, Countries.m3991toSizeozmzZPI(findCoordinatorToGetBounds$ui2 == null ? findCoordinatorToGetBounds$ui2.measuredSize : 0L));
                                                            f = m1180Recttz77jQw.left - m637translatek4lQ0M.left;
                                                            f2 = m1180Recttz77jQw.right - m637translatek4lQ0M.right;
                                                            if (Math.signum(f) == Math.signum(f2)) {
                                                                f = 0.0f;
                                                            } else if (Math.abs(f) >= Math.abs(f2)) {
                                                                f = f2;
                                                            }
                                                            f3 = m1180Recttz77jQw.top - m637translatek4lQ0M.top;
                                                            f4 = m1180Recttz77jQw.bottom - m637translatek4lQ0M.bottom;
                                                            if (Math.signum(f3) == Math.signum(f4)) {
                                                                f3 = 0.0f;
                                                            } else if (Math.abs(f3) >= Math.abs(f4)) {
                                                                f3 = f4;
                                                            }
                                                            floatToRawIntBits = (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f3) & BodyPartID.bodyIdMax);
                                                            if (Offset.m622equalsimpl0(floatToRawIntBits, 0L)) {
                                                                float intBitsToFloat2 = Float.intBitsToFloat((int) (floatToRawIntBits >> 32));
                                                                float intBitsToFloat3 = Float.intBitsToFloat((int) (floatToRawIntBits & BodyPartID.bodyIdMax));
                                                                Object obj24 = mutableScatterMap2.get(SemanticsProperties.HorizontalScrollAxisRange);
                                                                if (obj24 == null) {
                                                                    obj24 = null;
                                                                }
                                                                if (LayoutUpdate.access$isRtl(semanticsNode)) {
                                                                    intBitsToFloat2 = -intBitsToFloat2;
                                                                }
                                                                Object obj25 = mutableScatterMap2.get(SemanticsProperties.VerticalScrollAxisRange);
                                                                if (obj25 == null) {
                                                                    obj25 = null;
                                                                }
                                                                floatToRawIntBits2 = (Float.floatToRawIntBits(intBitsToFloat3) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(intBitsToFloat2) << 32);
                                                            } else {
                                                                floatToRawIntBits2 = floatToRawIntBits;
                                                            }
                                                            Function2 function23 = (Function2) accessibilityAction16.action;
                                                            z12 = (function23 == null && ((Boolean) function23.invoke(Float.valueOf(Float.intBitsToFloat((int) (floatToRawIntBits2 >> 32))), Float.valueOf(Float.intBitsToFloat((int) (floatToRawIntBits2 & BodyPartID.bodyIdMax))))).booleanValue()) || z12;
                                                            j2 = Offset.m625minusMKHz9U(j3, floatToRawIntBits);
                                                        }
                                                    }
                                                    j = 0;
                                                    long m626plusMKHz9U2 = Offset.m626plusMKHz9U(j, j2);
                                                    NodeCoordinator findCoordinatorToGetBounds$ui22 = semanticsNode.findCoordinatorToGetBounds$ui();
                                                    long j32 = j2;
                                                    Rect m1180Recttz77jQw2 = DBUtil.m1180Recttz77jQw(m626plusMKHz9U2, Countries.m3991toSizeozmzZPI(findCoordinatorToGetBounds$ui22 == null ? findCoordinatorToGetBounds$ui22.measuredSize : 0L));
                                                    f = m1180Recttz77jQw2.left - m637translatek4lQ0M.left;
                                                    f2 = m1180Recttz77jQw2.right - m637translatek4lQ0M.right;
                                                    if (Math.signum(f) == Math.signum(f2)) {
                                                    }
                                                    f3 = m1180Recttz77jQw2.top - m637translatek4lQ0M.top;
                                                    f4 = m1180Recttz77jQw2.bottom - m637translatek4lQ0M.bottom;
                                                    if (Math.signum(f3) == Math.signum(f4)) {
                                                    }
                                                    floatToRawIntBits = (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f3) & BodyPartID.bodyIdMax);
                                                    if (Offset.m622equalsimpl0(floatToRawIntBits, 0L)) {
                                                    }
                                                    Function2 function232 = (Function2) accessibilityAction16.action;
                                                    if (function232 == null) {
                                                    }
                                                    j2 = Offset.m625minusMKHz9U(j32, floatToRawIntBits);
                                                } else {
                                                    j2 = j2;
                                                }
                                                parent = parent.getParent();
                                            }
                                            return z12;
                                        }
                                        accessibilityAction = null;
                                        break;
                                    case android.R.id.accessibilityActionSetProgress:
                                        if (bundle != null && bundle.containsKey("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE")) {
                                            Object obj26 = mutableScatterMap.get(SemanticsActions.SetProgress);
                                            AccessibilityAction accessibilityAction17 = (AccessibilityAction) (obj26 == null ? null : obj26);
                                            if (accessibilityAction17 != null && (function12 = (Function1) accessibilityAction17.action) != null) {
                                                return ((Boolean) function12.invoke(Float.valueOf(bundle.getFloat("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE")))).booleanValue();
                                            }
                                        }
                                        break;
                                    case android.R.id.accessibilityActionImeEnter:
                                        Object obj27 = mutableScatterMap.get(SemanticsActions.OnImeAction);
                                        AccessibilityAction accessibilityAction18 = (AccessibilityAction) (obj27 == null ? null : obj27);
                                        if (accessibilityAction18 != null && (function010 = (Function0) accessibilityAction18.action) != null) {
                                            return ((Boolean) function010.invoke()).booleanValue();
                                        }
                                        break;
                                    default:
                                        switch (i2) {
                                            case android.R.id.accessibilityActionScrollUp:
                                            case android.R.id.accessibilityActionScrollLeft:
                                            case android.R.id.accessibilityActionScrollDown:
                                            case android.R.id.accessibilityActionScrollRight:
                                                break;
                                            default:
                                                switch (i2) {
                                                    case android.R.id.accessibilityActionPageUp:
                                                        Object obj28 = mutableScatterMap.get(SemanticsActions.PageUp);
                                                        AccessibilityAction accessibilityAction19 = (AccessibilityAction) (obj28 == null ? null : obj28);
                                                        if (accessibilityAction19 != null && (function013 = (Function0) accessibilityAction19.action) != null) {
                                                            return ((Boolean) function013.invoke()).booleanValue();
                                                        }
                                                        break;
                                                    case android.R.id.accessibilityActionPageDown:
                                                        Object obj29 = mutableScatterMap.get(SemanticsActions.PageDown);
                                                        AccessibilityAction accessibilityAction20 = (AccessibilityAction) (obj29 == null ? null : obj29);
                                                        if (accessibilityAction20 != null && (function014 = (Function0) accessibilityAction20.action) != null) {
                                                            return ((Boolean) function014.invoke()).booleanValue();
                                                        }
                                                        break;
                                                    case android.R.id.accessibilityActionPageLeft:
                                                        Object obj30 = mutableScatterMap.get(SemanticsActions.PageLeft);
                                                        AccessibilityAction accessibilityAction21 = (AccessibilityAction) (obj30 == null ? null : obj30);
                                                        if (accessibilityAction21 != null && (function015 = (Function0) accessibilityAction21.action) != null) {
                                                            return ((Boolean) function015.invoke()).booleanValue();
                                                        }
                                                        break;
                                                    case android.R.id.accessibilityActionPageRight:
                                                        Object obj31 = mutableScatterMap.get(SemanticsActions.PageRight);
                                                        AccessibilityAction accessibilityAction22 = (AccessibilityAction) (obj31 == null ? null : obj31);
                                                        if (accessibilityAction22 != null && (function016 = (Function0) accessibilityAction22.action) != null) {
                                                            return ((Boolean) function016.invoke()).booleanValue();
                                                        }
                                                        break;
                                                    default:
                                                        SparseArrayCompat sparseArrayCompat = androidComposeViewAccessibilityDelegateCompat.actionIdToLabel;
                                                        sparseArrayCompat.getClass();
                                                        SparseArrayCompat sparseArrayCompat2 = (SparseArrayCompat) SieveCacheKt.commonGet(sparseArrayCompat, i);
                                                        if (sparseArrayCompat2 != null && (charSequence = (CharSequence) SieveCacheKt.commonGet(sparseArrayCompat2, i2)) != null) {
                                                            Object obj32 = mutableScatterMap.get(SemanticsActions.CustomActions);
                                                            List list = (List) (obj32 == null ? null : obj32);
                                                            if (list != null) {
                                                                int size = list.size();
                                                                for (int i10 = 0; i10 < size; i10++) {
                                                                    CustomAccessibilityAction customAccessibilityAction = (CustomAccessibilityAction) list.get(i10);
                                                                    if (Intrinsics.areEqual(customAccessibilityAction.getLabel(), charSequence)) {
                                                                        return ((Boolean) customAccessibilityAction.getAction().invoke()).booleanValue();
                                                                    }
                                                                }
                                                                break;
                                                            }
                                                        }
                                                        break;
                                                }
                                        }
                                }
                            } else {
                                Object obj33 = mutableScatterMap.get(SemanticsProperties.Focused);
                                if (Intrinsics.areEqual(obj33 == null ? null : obj33, bool)) {
                                    androidComposeView.focusOwner.m594clearFocusI7lrPNg(8, false, true);
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
    }

    /* loaded from: classes3.dex */
    public final class PendingTextTraversedEvent {
        public final int action;
        public final int fromIndex;
        public final int granularity;
        public final SemanticsNode node;
        public final int toIndex;
        public final long traverseTime;

        public PendingTextTraversedEvent(SemanticsNode semanticsNode, int i, int i2, int i3, int i4, long j) {
            this.node = semanticsNode;
            this.action = i;
            this.granularity = i2;
            this.fromIndex = i3;
            this.toIndex = i4;
            this.traverseTime = j;
        }

        public final int getAction() {
            return this.action;
        }

        public final int getFromIndex() {
            return this.fromIndex;
        }

        public final int getGranularity() {
            return this.granularity;
        }

        public final SemanticsNode getNode() {
            return this.node;
        }

        public final int getToIndex() {
            return this.toIndex;
        }

        public final long getTraverseTime() {
            return this.traverseTime;
        }
    }

    static {
        int[] iArr = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
        MutableIntList mutableIntList = IntListKt.EmptyIntList;
        MutableIntList mutableIntList2 = new MutableIntList(32);
        int i = mutableIntList2._size;
        if (i < 0) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("");
            throw null;
        }
        int i2 = i + 32;
        mutableIntList2.ensureCapacity(i2);
        int[] iArr2 = mutableIntList2.content;
        int i3 = mutableIntList2._size;
        if (i != i3) {
            ArraysKt___ArraysJvmKt.copyInto(i2, iArr2, i, i3, iArr2);
        }
        ArraysKt___ArraysJvmKt.copyInto$default(i, iArr, 0, 12, iArr2);
        mutableIntList2._size += 32;
        AccessibilityActionsResourceIds = mutableIntList2;
    }

    public AndroidComposeViewAccessibilityDelegateCompat(AndroidComposeView androidComposeView) {
        this.view = androidComposeView;
        Object systemService = androidComposeView.getContext().getSystemService("accessibility");
        systemService.getClass();
        this.accessibilityManager = (AccessibilityManager) systemService;
        this.SendRecurringAccessibilityEventsIntervalMillis = 100L;
        new Handler(Looper.getMainLooper());
        this.nodeProvider = new ComposeAccessibilityNodeProvider();
        this.accessibilityFocusedVirtualViewId = PKIFailureInfo.systemUnavail;
        this.focusedVirtualViewId = PKIFailureInfo.systemUnavail;
        this.pendingHorizontalScrollEvents = new MutableIntObjectMap();
        this.pendingVerticalScrollEvents = new MutableIntObjectMap();
        Object obj = null;
        this.actionIdToLabel = new SparseArrayCompat(obj);
        this.labelToActionId = new SparseArrayCompat(obj);
        this.accessibilityCursorPosition = -1;
        this.subtreeChangedLayoutNodes = new ArraySet(0);
        this.boundsUpdateChannel = PapaEvent.Channel$default(1, null, null, 6);
        this.currentSemanticsNodesInvalidated = true;
        MutableIntObjectMap mutableIntObjectMap = IntObjectMapKt.EmptyIntObjectMap;
        mutableIntObjectMap.getClass();
        this.currentSemanticsNodes = mutableIntObjectMap;
        this.paneDisplayed = new MutableIntSet();
        this.idToBeforeMap = new MutableIntIntMap();
        this.idToAfterMap = new MutableIntIntMap();
        this.ExtraDataTestTraversalBeforeVal = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.ExtraDataTestTraversalAfterVal = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.urlSpanCache = new GrpcMethod(13, false);
        this.previousSemanticsNodes = new MutableIntObjectMap();
        this.previousSemanticsRoot = new SemanticsNodeCopy(androidComposeView.semanticsOwner.getUnmergedRootSemanticsNode(), mutableIntObjectMap);
        int i = IntIntMapKt.$r8$clinit;
        this.drawingOrder = new MutableIntIntMap();
        androidComposeView.addOnAttachStateChangeListener(this);
        this.semanticsChangeChecker = new AFLogger$$ExternalSyntheticLambda0(this, 5);
        this.scrollObservationScopes = new ArrayList();
        this.scheduleScrollEventIfNeededLambda = new AndroidComposeViewAccessibilityDelegateCompat$onSendAccessibilityEvent$1(this, 1);
    }

    public static String getIterableTextForAccessibility(SemanticsNode semanticsNode) {
        AnnotatedString annotatedString;
        if (semanticsNode != null) {
            SemanticsConfiguration semanticsConfiguration = semanticsNode.unmergedConfig;
            MutableScatterMap mutableScatterMap = semanticsConfiguration.props;
            SemanticsPropertyKey semanticsPropertyKey = SemanticsProperties.ContentDescription;
            if (mutableScatterMap.containsKey(semanticsPropertyKey)) {
                return ListUtilsKt.fastJoinToString$default(62, ",", (List) semanticsConfiguration.get(semanticsPropertyKey), null);
            }
            SemanticsPropertyKey semanticsPropertyKey2 = SemanticsProperties.EditableText;
            if (mutableScatterMap.containsKey(semanticsPropertyKey2)) {
                Object obj = mutableScatterMap.get(semanticsPropertyKey2);
                if (obj == null) {
                    obj = null;
                }
                AnnotatedString annotatedString2 = (AnnotatedString) obj;
                if (annotatedString2 != null) {
                    return annotatedString2.text;
                }
            } else {
                Object obj2 = mutableScatterMap.get(SemanticsProperties.Text);
                if (obj2 == null) {
                    obj2 = null;
                }
                List list = (List) obj2;
                if (list != null && (annotatedString = (AnnotatedString) CollectionsKt.firstOrNull(list)) != null) {
                    return annotatedString.text;
                }
            }
        }
        return null;
    }

    public static final boolean performActionHelper$canScroll(ScrollAxisRange scrollAxisRange, float f) {
        Function0 function0 = scrollAxisRange.value;
        if (f >= RecyclerView.DECELERATION_RATE || ((Number) function0.invoke()).floatValue() <= RecyclerView.DECELERATION_RATE) {
            return f > RecyclerView.DECELERATION_RATE && ((Number) function0.invoke()).floatValue() < ((Number) scrollAxisRange.maxValue.invoke()).floatValue();
        }
        return true;
    }

    public static final boolean populateAccessibilityNodeInfoProperties$canScrollBackward(ScrollAxisRange scrollAxisRange) {
        Function0 function0 = scrollAxisRange.value;
        if (((Number) function0.invoke()).floatValue() > RecyclerView.DECELERATION_RATE) {
            return true;
        }
        ((Number) function0.invoke()).floatValue();
        ((Number) scrollAxisRange.maxValue.invoke()).floatValue();
        return false;
    }

    public static final boolean populateAccessibilityNodeInfoProperties$canScrollForward(ScrollAxisRange scrollAxisRange) {
        Function0 function0 = scrollAxisRange.value;
        if (((Number) function0.invoke()).floatValue() < ((Number) scrollAxisRange.maxValue.invoke()).floatValue()) {
            return true;
        }
        ((Number) function0.invoke()).floatValue();
        return false;
    }

    public static /* synthetic */ void sendEventForVirtualView$default(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, int i, int i2, Integer num, int i3) {
        if ((i3 & 4) != 0) {
            num = null;
        }
        androidComposeViewAccessibilityDelegateCompat.sendEventForVirtualView(i, i2, num, null);
    }

    public static android.graphics.Rect toAndroidRect(ColorKt colorKt, float f, float f2) {
        if (!(colorKt instanceof Outline$Rectangle) && !(colorKt instanceof Outline$Rounded)) {
            return null;
        }
        Rect bounds = colorKt.getBounds();
        return new android.graphics.Rect((int) (bounds.left + f), (int) (bounds.top + f2), (int) (bounds.right + f), (int) (bounds.bottom + f2));
    }

    public static float[] toCornerArray(ColorKt colorKt) {
        if (!(colorKt instanceof Outline$Rounded)) {
            return null;
        }
        RoundRect roundRect = ((Outline$Rounded) colorKt).roundRect;
        long j = roundRect.bottomLeftCornerRadius;
        long j2 = roundRect.bottomRightCornerRadius;
        long j3 = roundRect.topRightCornerRadius;
        long j4 = roundRect.topLeftCornerRadius;
        return new float[]{Float.intBitsToFloat((int) (j4 >> 32)), Float.intBitsToFloat((int) (j4 & BodyPartID.bodyIdMax)), Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & BodyPartID.bodyIdMax)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & BodyPartID.bodyIdMax)), Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & BodyPartID.bodyIdMax))};
    }

    public static Region toRegion(ColorKt colorKt, float f, float f2) {
        if (colorKt instanceof Outline$Generic) {
            Outline$Generic outline$Generic = (Outline$Generic) colorKt;
            Rect translate = outline$Generic.getBounds().translate(f, f2);
            Region region = new Region(new android.graphics.Rect((int) (translate.left + RecyclerView.DECELERATION_RATE), (int) (translate.top + RecyclerView.DECELERATION_RATE), (int) (translate.right + RecyclerView.DECELERATION_RATE), (int) (translate.bottom + RecyclerView.DECELERATION_RATE)));
            Region region2 = new Region();
            AndroidPath androidPath = outline$Generic.path;
            if (androidPath instanceof AndroidPath) {
                Path path = androidPath.internalPath;
                path.offset(f, f2);
                region2.setPath(path, region);
                return region2;
            }
            a$$ExternalSyntheticBUOutline0.m("Unable to obtain android.graphics.Path");
        }
        return null;
    }

    public static CharSequence trimToSize(CharSequence charSequence) {
        if (charSequence.length() != 0) {
            int i = 100000;
            if (charSequence.length() > 100000) {
                if (Character.isHighSurrogate(charSequence.charAt(99999)) && Character.isLowSurrogate(charSequence.charAt(100000))) {
                    i = 99999;
                }
                CharSequence subSequence = charSequence.subSequence(0, i);
                subSequence.getClass();
                return subSequence;
            }
        }
        return charSequence;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void addExtraDataToAccessibilityNodeInfoHelper(int i, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, String str, Bundle bundle) {
        SemanticsNode semanticsNode;
        int i2;
        int i3;
        AndroidComposeView androidComposeView;
        RectF rectF;
        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = (SemanticsNodeWithAdjustedBounds) getCurrentSemanticsNodes().get(i);
        if (semanticsNodeWithAdjustedBounds == null || (semanticsNode = semanticsNodeWithAdjustedBounds.getSemanticsNode()) == null) {
            return;
        }
        LayoutNode layoutNode = semanticsNode.layoutNode;
        SemanticsConfiguration semanticsConfiguration = semanticsNode.unmergedConfig;
        MutableScatterMap mutableScatterMap = semanticsConfiguration.props;
        String iterableTextForAccessibility = getIterableTextForAccessibility(semanticsNode);
        if (Intrinsics.areEqual(str, this.ExtraDataTestTraversalBeforeVal)) {
            int orDefault = this.idToBeforeMap.getOrDefault(i);
            if (orDefault != -1) {
                accessibilityNodeInfoCompat.getExtras().putInt(str, orDefault);
                return;
            }
            return;
        }
        if (Intrinsics.areEqual(str, this.ExtraDataTestTraversalAfterVal)) {
            int orDefault2 = this.idToAfterMap.getOrDefault(i);
            if (orDefault2 != -1) {
                accessibilityNodeInfoCompat.getExtras().putInt(str, orDefault2);
                return;
            }
            return;
        }
        boolean containsKey = mutableScatterMap.containsKey(SemanticsActions.GetTextLayoutResult);
        AndroidComposeView androidComposeView2 = this.view;
        NodeCoordinator nodeCoordinator = null;
        if (containsKey && bundle != null && Intrinsics.areEqual(str, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
            int i4 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
            int i5 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
            if (i5 > 0 && i4 >= 0) {
                if (i4 < (iterableTextForAccessibility != null ? iterableTextForAccessibility.length() : Integer.MAX_VALUE)) {
                    TextLayoutResult textLayoutResult = ArcadeThemeKt.getTextLayoutResult(semanticsConfiguration);
                    if (textLayoutResult == null) {
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    int i6 = 0;
                    while (i6 < i5) {
                        int i7 = i4 + i6;
                        if (i7 >= textLayoutResult.layoutInput.text.text.length()) {
                            arrayList.add(nodeCoordinator);
                            i2 = i4;
                            i3 = i5;
                            androidComposeView = androidComposeView2;
                        } else {
                            Rect boundingBox = textLayoutResult.getBoundingBox(i7);
                            NodeCoordinator findCoordinatorToGetBounds$ui = semanticsNode.findCoordinatorToGetBounds$ui();
                            long j = 0;
                            if (findCoordinatorToGetBounds$ui != null) {
                                if (!findCoordinatorToGetBounds$ui.isAttached()) {
                                    findCoordinatorToGetBounds$ui = nodeCoordinator;
                                }
                                if (findCoordinatorToGetBounds$ui != null) {
                                    j = findCoordinatorToGetBounds$ui.mo841localToRootMKHz9U(0L);
                                }
                            }
                            Rect m637translatek4lQ0M = boundingBox.m637translatek4lQ0M(j);
                            Rect boundsInRoot = semanticsNode.getBoundsInRoot();
                            if ((m637translatek4lQ0M.overlaps(boundsInRoot) ? m637translatek4lQ0M.intersect(boundsInRoot) : nodeCoordinator) != 0) {
                                long m916localToScreenMKHz9U = androidComposeView2.m916localToScreenMKHz9U((Float.floatToRawIntBits(r8.top) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(r8.left) << 32));
                                long m916localToScreenMKHz9U2 = androidComposeView2.m916localToScreenMKHz9U((Float.floatToRawIntBits(r8.bottom) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(r8.right) << 32));
                                int i8 = (int) (m916localToScreenMKHz9U >> 32);
                                i2 = i4;
                                i3 = i5;
                                int i9 = (int) (m916localToScreenMKHz9U2 >> 32);
                                float min = Math.min(Float.intBitsToFloat(i8), Float.intBitsToFloat(i9));
                                androidComposeView = androidComposeView2;
                                int i10 = (int) (m916localToScreenMKHz9U & BodyPartID.bodyIdMax);
                                float intBitsToFloat = Float.intBitsToFloat(i10);
                                int i11 = (int) (m916localToScreenMKHz9U2 & BodyPartID.bodyIdMax);
                                rectF = new RectF(min, Math.min(intBitsToFloat, Float.intBitsToFloat(i11)), Math.max(Float.intBitsToFloat(i8), Float.intBitsToFloat(i9)), Math.max(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11)));
                            } else {
                                i2 = i4;
                                i3 = i5;
                                androidComposeView = androidComposeView2;
                                rectF = null;
                            }
                            arrayList.add(rectF);
                        }
                        i6++;
                        i5 = i3;
                        androidComposeView2 = androidComposeView;
                        i4 = i2;
                        nodeCoordinator = null;
                    }
                    accessibilityNodeInfoCompat.getExtras().putParcelableArray(str, (Parcelable[]) arrayList.toArray(new RectF[0]));
                    return;
                }
            }
            Log.e("AccessibilityDelegate", "Invalid arguments for accessibility character locations");
            return;
        }
        SemanticsPropertyKey semanticsPropertyKey = SemanticsProperties.TestTag;
        if (mutableScatterMap.containsKey(semanticsPropertyKey) && bundle != null && Intrinsics.areEqual(str, "androidx.compose.ui.semantics.testTag")) {
            Object obj = mutableScatterMap.get(semanticsPropertyKey);
            String str2 = (String) (obj == null ? null : obj);
            if (str2 != null) {
                accessibilityNodeInfoCompat.getExtras().putCharSequence(str, str2);
                return;
            }
            return;
        }
        if (Intrinsics.areEqual(str, "androidx.compose.ui.semantics.id")) {
            accessibilityNodeInfoCompat.getExtras().putInt(str, semanticsNode.id);
            return;
        }
        if (Intrinsics.areEqual(str, "androidx.compose.ui.semantics.shapeType")) {
            Object obj2 = mutableScatterMap.get(SemanticsProperties.Shape);
            Shape shape = (Shape) (obj2 == null ? null : obj2);
            if (shape != null) {
                android.graphics.Rect rect = new android.graphics.Rect();
                accessibilityNodeInfoCompat.getBoundsInScreen(rect);
                Rect shapeBounds = getShapeBounds(semanticsNode, rect, shape);
                float f = shapeBounds.top;
                float f2 = shapeBounds.left;
                ColorKt mo175createOutlinePq9zytI = shape.mo175createOutlinePq9zytI(shapeBounds.m634getSizeNHjbRc(), layoutNode.layoutDirection, androidComposeView2.getDensity());
                if (mo175createOutlinePq9zytI instanceof Outline$Rectangle) {
                    accessibilityNodeInfoCompat.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 0);
                    accessibilityNodeInfoCompat.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", toAndroidRect(mo175createOutlinePq9zytI, f2, f));
                    return;
                } else if (mo175createOutlinePq9zytI instanceof Outline$Rounded) {
                    accessibilityNodeInfoCompat.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 1);
                    accessibilityNodeInfoCompat.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", toAndroidRect(mo175createOutlinePq9zytI, f2, f));
                    accessibilityNodeInfoCompat.getExtras().putFloatArray("androidx.compose.ui.semantics.shapeCorners", toCornerArray(mo175createOutlinePq9zytI));
                    return;
                } else if (!(mo175createOutlinePq9zytI instanceof Outline$Generic)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                } else {
                    accessibilityNodeInfoCompat.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 2);
                    accessibilityNodeInfoCompat.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRegion", toRegion(mo175createOutlinePq9zytI, f2, f));
                    return;
                }
            }
            return;
        }
        if (Intrinsics.areEqual(str, "androidx.compose.ui.semantics.shapeRect")) {
            Object obj3 = mutableScatterMap.get(SemanticsProperties.Shape);
            Shape shape2 = (Shape) (obj3 == null ? null : obj3);
            if (shape2 != null) {
                android.graphics.Rect rect2 = new android.graphics.Rect();
                accessibilityNodeInfoCompat.getBoundsInScreen(rect2);
                Rect shapeBounds2 = getShapeBounds(semanticsNode, rect2, shape2);
                android.graphics.Rect androidRect = toAndroidRect(shape2.mo175createOutlinePq9zytI(shapeBounds2.m634getSizeNHjbRc(), layoutNode.layoutDirection, androidComposeView2.getDensity()), shapeBounds2.left, shapeBounds2.top);
                if (androidRect != null) {
                    accessibilityNodeInfoCompat.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", androidRect);
                    return;
                }
                return;
            }
            return;
        }
        if (Intrinsics.areEqual(str, "androidx.compose.ui.semantics.shapeCorners")) {
            Object obj4 = mutableScatterMap.get(SemanticsProperties.Shape);
            Shape shape3 = (Shape) (obj4 == null ? null : obj4);
            if (shape3 != null) {
                android.graphics.Rect rect3 = new android.graphics.Rect();
                accessibilityNodeInfoCompat.getBoundsInScreen(rect3);
                float[] cornerArray = toCornerArray(shape3.mo175createOutlinePq9zytI(getShapeBounds(semanticsNode, rect3, shape3).m634getSizeNHjbRc(), layoutNode.layoutDirection, androidComposeView2.getDensity()));
                if (cornerArray != null) {
                    accessibilityNodeInfoCompat.getExtras().putFloatArray("androidx.compose.ui.semantics.shapeCorners", cornerArray);
                    return;
                }
                return;
            }
            return;
        }
        if (Intrinsics.areEqual(str, "androidx.compose.ui.semantics.shapeRegion")) {
            Object obj5 = mutableScatterMap.get(SemanticsProperties.Shape);
            Shape shape4 = (Shape) (obj5 == null ? null : obj5);
            if (shape4 != null) {
                android.graphics.Rect rect4 = new android.graphics.Rect();
                accessibilityNodeInfoCompat.getBoundsInScreen(rect4);
                Rect shapeBounds3 = getShapeBounds(semanticsNode, rect4, shape4);
                Region region = toRegion(shape4.mo175createOutlinePq9zytI(shapeBounds3.m634getSizeNHjbRc(), layoutNode.layoutDirection, androidComposeView2.getDensity()), shapeBounds3.left, shapeBounds3.top);
                if (region != null) {
                    accessibilityNodeInfoCompat.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRegion", region);
                }
            }
        }
    }

    public final android.graphics.Rect boundsInScreen(SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds) {
        IntRect adjustedBounds = semanticsNodeWithAdjustedBounds.getAdjustedBounds();
        return toBoundsInScreen(adjustedBounds.getLeft(), adjustedBounds.getTop(), adjustedBounds.getRight(), adjustedBounds.getBottom());
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00bb, code lost:
    
        if (kotlinx.coroutines.JobKt.delay(r7, r0) == r1) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006f A[Catch: all -> 0x0032, TryCatch #0 {all -> 0x0032, blocks: (B:12:0x002c, B:14:0x0056, B:20:0x0067, B:22:0x006f, B:24:0x0078, B:26:0x007d, B:28:0x008c, B:31:0x009b, B:32:0x00a2, B:40:0x0040, B:42:0x0047), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00bb -> B:13:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object boundsUpdatesEventLoop$ui(ContinuationImpl continuationImpl) {
        AndroidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1 androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1;
        int i;
        ArraySet arraySet;
        MutableIntSet mutableIntSet;
        BufferedChannel.BufferedChannelIterator bufferedChannelIterator;
        MutableIntSet mutableIntSet2;
        BufferedChannel.BufferedChannelIterator bufferedChannelIterator2;
        Object hasNext;
        try {
            if (continuationImpl instanceof AndroidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1) {
                androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1 = (AndroidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1) continuationImpl;
                int i2 = androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.label;
                if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                    androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.label = i2 - PKIFailureInfo.systemUnavail;
                    Object obj = androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.label;
                    arraySet = this.subtreeChangedLayoutNodes;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj);
                        mutableIntSet = new MutableIntSet();
                        BufferedChannel bufferedChannel = this.boundsUpdateChannel;
                        bufferedChannel.getClass();
                        bufferedChannelIterator = bufferedChannel.new BufferedChannelIterator();
                        androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.L$0 = mutableIntSet;
                        androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.L$1 = bufferedChannelIterator;
                        androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.label = 1;
                        hasNext = bufferedChannelIterator.hasNext(androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1);
                        if (hasNext != coroutineSingletons) {
                        }
                    } else if (i == 1) {
                        bufferedChannelIterator2 = androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.L$1;
                        mutableIntSet2 = androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                        if (((Boolean) obj).booleanValue()) {
                        }
                    } else {
                        if (i != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        bufferedChannelIterator2 = androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.L$1;
                        mutableIntSet2 = androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                        mutableIntSet = mutableIntSet2;
                        bufferedChannelIterator = bufferedChannelIterator2;
                        androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.L$0 = mutableIntSet;
                        androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.L$1 = bufferedChannelIterator;
                        androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.label = 1;
                        hasNext = bufferedChannelIterator.hasNext(androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1);
                        if (hasNext != coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        BufferedChannel.BufferedChannelIterator bufferedChannelIterator3 = bufferedChannelIterator;
                        mutableIntSet2 = mutableIntSet;
                        obj = hasNext;
                        bufferedChannelIterator2 = bufferedChannelIterator3;
                        if (((Boolean) obj).booleanValue()) {
                            arraySet.clear();
                            return Unit.INSTANCE;
                        }
                        bufferedChannelIterator2.next();
                        if (isEnabled$ui()) {
                            int i3 = arraySet._size;
                            for (int i4 = 0; i4 < i3; i4++) {
                                LayoutNode layoutNode = (LayoutNode) arraySet.f847array[i4];
                                sendSubtreeChangeAccessibilityEvents(layoutNode, mutableIntSet2);
                                sendTypeViewScrolledAccessibilityEvent(layoutNode);
                            }
                            mutableIntSet2.clear();
                            Handler handler = this.view.getHandler();
                            if (!this.checkingForSemanticsChanges && handler != null) {
                                this.checkingForSemanticsChanges = true;
                                handler.post(this.semanticsChangeChecker);
                            }
                        }
                        arraySet.clear();
                        this.pendingHorizontalScrollEvents.clear();
                        this.pendingVerticalScrollEvents.clear();
                        long j = this.SendRecurringAccessibilityEventsIntervalMillis;
                        androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.L$0 = mutableIntSet2;
                        androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.L$1 = bufferedChannelIterator2;
                        androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.label = 2;
                    }
                }
            }
            if (i != 0) {
            }
        } catch (Throwable th) {
            arraySet.clear();
            throw th;
        }
        androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1 = new AndroidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1(this, continuationImpl);
        Object obj2 = androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.label;
        arraySet = this.subtreeChangedLayoutNodes;
    }

    /* renamed from: canScroll-0AR0LA0$ui, reason: not valid java name */
    public final boolean m923canScroll0AR0LA0$ui(long j, int i, boolean z) {
        SemanticsPropertyKey semanticsPropertyKey;
        if (Intrinsics.areEqual(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            MutableIntObjectMap currentSemanticsNodes = getCurrentSemanticsNodes();
            if (!Offset.m622equalsimpl0(j, 9205357640488583168L) && (((9223372034707292159L & j) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                if (z) {
                    semanticsPropertyKey = SemanticsProperties.VerticalScrollAxisRange;
                } else {
                    if (z) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return false;
                    }
                    semanticsPropertyKey = SemanticsProperties.HorizontalScrollAxisRange;
                }
                Object[] objArr = currentSemanticsNodes.values;
                long[] jArr = currentSemanticsNodes.metadata;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i2 = 0;
                    boolean z2 = false;
                    while (true) {
                        long j2 = jArr[i2];
                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i3 = 8 - ((~(i2 - length)) >>> 31);
                            for (int i4 = 0; i4 < i3; i4++) {
                                if ((255 & j2) < 128) {
                                    SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = (SemanticsNodeWithAdjustedBounds) objArr[(i2 << 3) + i4];
                                    if (IntRectKt.toRect(semanticsNodeWithAdjustedBounds.getAdjustedBounds()).m629containsk4lQ0M(j)) {
                                        Object obj = semanticsNodeWithAdjustedBounds.getSemanticsNode().unmergedConfig.props.get(semanticsPropertyKey);
                                        if (obj == null) {
                                            obj = null;
                                        }
                                        ScrollAxisRange scrollAxisRange = (ScrollAxisRange) obj;
                                        if (scrollAxisRange != null) {
                                            Function0 function0 = scrollAxisRange.value;
                                            if (i < 0) {
                                                if (((Number) function0.invoke()).floatValue() <= RecyclerView.DECELERATION_RATE) {
                                                }
                                                z2 = true;
                                            } else {
                                                if (((Number) function0.invoke()).floatValue() >= ((Number) scrollAxisRange.maxValue.invoke()).floatValue()) {
                                                }
                                                z2 = true;
                                            }
                                        }
                                    }
                                }
                                j2 >>= 8;
                            }
                            if (i3 != 8) {
                                return z2;
                            }
                        }
                        if (i2 == length) {
                            return z2;
                        }
                        i2++;
                    }
                }
            }
        }
        return false;
    }

    public final void checkForSemanticsChanges() {
        Trace.beginSection("sendAccessibilitySemanticsStructureChangeEvents");
        try {
            if (isEnabled$ui()) {
                sendAccessibilitySemanticsStructureChangeEvents(this.view.semanticsOwner.getUnmergedRootSemanticsNode(), this.previousSemanticsRoot);
            }
            Trace.endSection();
            Trace.beginSection("sendSemanticsPropertyChangeEvents");
            try {
                sendSemanticsPropertyChangeEvents(getCurrentSemanticsNodes());
                Trace.endSection();
                Trace.beginSection("updateSemanticsNodesCopyAndPanes");
                try {
                    updateSemanticsNodesCopyAndPanes();
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }

    public final AccessibilityEvent createEvent(int i, int i2) {
        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds;
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i2);
        obtain.setEnabled(true);
        obtain.setClassName("android.view.View");
        AndroidComposeView androidComposeView = this.view;
        obtain.setPackageName(androidComposeView.getContext().getPackageName());
        obtain.setSource(androidComposeView, i);
        if (isEnabled$ui() && (semanticsNodeWithAdjustedBounds = (SemanticsNodeWithAdjustedBounds) getCurrentSemanticsNodes().get(i)) != null) {
            obtain.setPassword(semanticsNodeWithAdjustedBounds.getSemanticsNode().unmergedConfig.props.containsKey(SemanticsProperties.Password));
            Object obj = semanticsNodeWithAdjustedBounds.getSemanticsNode().unmergedConfig.props.get(SemanticsProperties.IsSensitiveData);
            if (obj == null) {
                obj = null;
            }
            CurrencyConfig.Companion.setAccessibilityDataSensitive(obtain, Intrinsics.areEqual(obj, Boolean.TRUE));
        }
        return obtain;
    }

    public final AccessibilityEvent createTextSelectionChangedEvent(int i, Integer num, Integer num2, Integer num3, CharSequence charSequence) {
        AccessibilityEvent createEvent = createEvent(i, PKIFailureInfo.certRevoked);
        if (num != null) {
            createEvent.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            createEvent.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            createEvent.setItemCount(num3.intValue());
        }
        if (charSequence != null) {
            createEvent.getText().add(charSequence);
        }
        return createEvent;
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final Extras.Key getAccessibilityNodeProvider(View view) {
        return this.nodeProvider;
    }

    public final int getAccessibilitySelectionEnd(SemanticsNode semanticsNode) {
        SemanticsConfiguration semanticsConfiguration = semanticsNode.unmergedConfig;
        if (!semanticsConfiguration.props.containsKey(SemanticsProperties.ContentDescription)) {
            SemanticsPropertyKey semanticsPropertyKey = SemanticsProperties.TextSelectionRange;
            if (semanticsConfiguration.props.containsKey(semanticsPropertyKey)) {
                return (int) (((TextRange) semanticsConfiguration.get(semanticsPropertyKey)).packedValue & BodyPartID.bodyIdMax);
            }
        }
        return this.accessibilityCursorPosition;
    }

    public final int getAccessibilitySelectionStart(SemanticsNode semanticsNode) {
        SemanticsConfiguration semanticsConfiguration = semanticsNode.unmergedConfig;
        if (!semanticsConfiguration.props.containsKey(SemanticsProperties.ContentDescription)) {
            SemanticsPropertyKey semanticsPropertyKey = SemanticsProperties.TextSelectionRange;
            if (semanticsConfiguration.props.containsKey(semanticsPropertyKey)) {
                return (int) (((TextRange) semanticsConfiguration.get(semanticsPropertyKey)).packedValue >> 32);
            }
        }
        return this.accessibilityCursorPosition;
    }

    public final MutableIntObjectMap getCurrentSemanticsNodes() {
        if (this.currentSemanticsNodesInvalidated) {
            this.currentSemanticsNodesInvalidated = false;
            AndroidComposeView androidComposeView = this.view;
            this.currentSemanticsNodes = SemanticsOwnerKt.getAllUncoveredSemanticsNodesToIntObjectMap(androidComposeView.semanticsOwner, AndroidComposeViewAccessibilityDelegateCompat$currentSemanticsNodes$1.INSTANCE);
            if (isEnabled$ui()) {
                LayoutUpdate.access$setTraversalValues(this.currentSemanticsNodes, this.idToBeforeMap, this.idToAfterMap, androidComposeView.getContext().getResources());
            }
        }
        return this.currentSemanticsNodes;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$getShapeBounds$shapeNodeMatcher$1, androidx.compose.ui.semantics.SemanticsPropertyReceiver] */
    public final Rect getShapeBounds(SemanticsNode semanticsNode, android.graphics.Rect rect, final Shape shape) {
        Modifier.Node node;
        ?? r0 = new SemanticsPropertyReceiver() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$getShapeBounds$shapeNodeMatcher$1
            public boolean hasMatchedShape;

            public final boolean getHasMatchedShape() {
                return this.hasMatchedShape;
            }

            @Override // androidx.compose.ui.semantics.SemanticsPropertyReceiver
            public final void set(SemanticsPropertyKey semanticsPropertyKey, Object obj) {
                if (obj == Shape.this) {
                    this.hasMatchedShape = true;
                }
            }
        };
        LayoutNode layoutNode = semanticsNode.layoutNode;
        NodeChain nodeChain = layoutNode.nodes;
        DelegatableNode delegatableNode = null;
        if ((((Modifier.Node) nodeChain.head).getAggregateChildKindSet$ui() & 8) != 0) {
            Modifier.Node node2 = (Modifier.Node) nodeChain.head;
            loop0: while (true) {
                if (node2 == null) {
                    break;
                }
                if ((node2.getKindSet$ui() & 8) != 0) {
                    Modifier.Node node3 = node2;
                    MutableVector mutableVector = null;
                    while (node3 != null) {
                        if (node3 instanceof SemanticsModifierNode) {
                            ((SemanticsModifierNode) node3).applySemantics(r0);
                            if (r0.getHasMatchedShape()) {
                                delegatableNode = node3;
                                break loop0;
                            }
                        } else if ((node3.getKindSet$ui() & 8) != 0 && (node3 instanceof DelegatingNode)) {
                            int i = 0;
                            for (Modifier.Node node4 = ((DelegatingNode) node3).delegate; node4 != null; node4 = node4.getChild$ui()) {
                                if ((node4.getKindSet$ui() & 8) != 0) {
                                    i++;
                                    if (i == 1) {
                                        node3 = node4;
                                    } else {
                                        if (mutableVector == null) {
                                            mutableVector = new MutableVector(0, new Modifier.Node[16]);
                                        }
                                        if (node3 != null) {
                                            mutableVector.add(node3);
                                            node3 = null;
                                        }
                                        mutableVector.add(node4);
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                        node3 = DepthSortedSetKt.access$pop(mutableVector);
                    }
                }
                if ((node2.getAggregateChildKindSet$ui() & 8) == 0) {
                    break;
                }
                node2 = node2.getChild$ui();
            }
        }
        DelegatableNode delegatableNode2 = (SemanticsModifierNode) delegatableNode;
        if (delegatableNode2 == null || (node = ((Modifier.Node) delegatableNode2).getNode()) == null || !node.isAttached()) {
            return ValueInsets.boundsInWindow((NodeCoordinator) layoutNode.nodes.outerCoordinator, false);
        }
        NodeCoordinator requireLayoutCoordinates = DepthSortedSetKt.requireLayoutCoordinates(delegatableNode2);
        Rect localBoundingBoxOf = ValueInsets.findRootCoordinates(requireLayoutCoordinates).localBoundingBoxOf(requireLayoutCoordinates, false);
        android.graphics.Rect boundsInScreen = toBoundsInScreen(localBoundingBoxOf.left, localBoundingBoxOf.top, localBoundingBoxOf.right, localBoundingBoxOf.bottom);
        float f = boundsInScreen.left - rect.left;
        float f2 = boundsInScreen.top - rect.top;
        return new Rect(f, f2, boundsInScreen.width() + f, boundsInScreen.height() + f2);
    }

    public final boolean isEnabled$ui() {
        AccessibilityManager accessibilityManager = this.accessibilityManager;
        if (!accessibilityManager.isEnabled()) {
            return false;
        }
        List<AccessibilityServiceInfo> list = this._enabledServices;
        if (list == null) {
            list = accessibilityManager.getEnabledAccessibilityServiceList(-1);
            this._enabledServices = list;
        }
        return !list.isEmpty();
    }

    public final void notifySubtreeAccessibilityStateChangedIfNeeded(LayoutNode layoutNode) {
        if (this.subtreeChangedLayoutNodes.add(layoutNode)) {
            this.boundsUpdateChannel.mo1159trySendJP2dKIU(Unit.INSTANCE);
        }
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z) {
        this._enabledServices = null;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
        this._enabledServices = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        AccessibilityManager accessibilityManager = this.accessibilityManager;
        if (accessibilityManager.isEnabled()) {
            this._enabledServices = null;
        }
        accessibilityManager.addAccessibilityStateChangeListener(this);
        accessibilityManager.addTouchExplorationStateChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Handler handler = this.view.getHandler();
        handler.getClass();
        handler.removeCallbacks(this.semanticsChangeChecker);
        AccessibilityManager accessibilityManager = this.accessibilityManager;
        accessibilityManager.removeAccessibilityStateChangeListener(this);
        accessibilityManager.removeTouchExplorationStateChangeListener(this);
    }

    public final int semanticsNodeIdToAccessibilityVirtualNodeId(int i) {
        if (i == this.view.semanticsOwner.getUnmergedRootSemanticsNode().id) {
            return -1;
        }
        return i;
    }

    public final void sendAccessibilitySemanticsStructureChangeEvents(SemanticsNode semanticsNode, SemanticsNodeCopy semanticsNodeCopy) {
        int[] iArr = IntSetKt.EmptyIntArray;
        MutableIntSet mutableIntSet = new MutableIntSet();
        List children$ui$default = SemanticsNode.getChildren$ui$default(semanticsNode, false, 4);
        LayoutNode layoutNode = semanticsNode.layoutNode;
        int size = children$ui$default.size();
        for (int i = 0; i < size; i++) {
            SemanticsNode semanticsNode2 = (SemanticsNode) children$ui$default.get(i);
            MutableIntObjectMap currentSemanticsNodes = getCurrentSemanticsNodes();
            int i2 = semanticsNode2.id;
            if (currentSemanticsNodes.containsKey(i2)) {
                if (!semanticsNodeCopy.children.contains(i2)) {
                    notifySubtreeAccessibilityStateChangedIfNeeded(layoutNode);
                    return;
                }
                mutableIntSet.add(i2);
            }
        }
        MutableIntSet mutableIntSet2 = semanticsNodeCopy.children;
        int[] iArr2 = mutableIntSet2.elements;
        long[] jArr = mutableIntSet2.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j) < 128 && !mutableIntSet.contains(iArr2[(i3 << 3) + i5])) {
                            notifySubtreeAccessibilityStateChangedIfNeeded(layoutNode);
                            return;
                        }
                        j >>= 8;
                    }
                    if (i4 != 8) {
                        break;
                    }
                }
                if (i3 == length) {
                    break;
                } else {
                    i3++;
                }
            }
        }
        List children$ui$default2 = SemanticsNode.getChildren$ui$default(semanticsNode, false, 4);
        int size2 = children$ui$default2.size();
        for (int i6 = 0; i6 < size2; i6++) {
            SemanticsNode semanticsNode3 = (SemanticsNode) children$ui$default2.get(i6);
            SemanticsNodeCopy semanticsNodeCopy2 = (SemanticsNodeCopy) this.previousSemanticsNodes.get(semanticsNode3.id);
            if (semanticsNodeCopy2 != null && getCurrentSemanticsNodes().containsKey(semanticsNode3.id)) {
                sendAccessibilitySemanticsStructureChangeEvents(semanticsNode3, semanticsNodeCopy2);
            }
        }
    }

    public final boolean sendEvent(AccessibilityEvent accessibilityEvent) {
        if (!isEnabled$ui()) {
            return false;
        }
        if (accessibilityEvent.getEventType() == 2048 || accessibilityEvent.getEventType() == 32768) {
            this.sendingFocusAffectingEvent = true;
        }
        try {
            return ((Boolean) this.onSendAccessibilityEvent.invoke(accessibilityEvent)).booleanValue();
        } finally {
            this.sendingFocusAffectingEvent = false;
        }
    }

    public final boolean sendEventForVirtualView(int i, int i2, Integer num, List list) {
        if (i == Integer.MIN_VALUE || !isEnabled$ui()) {
            return false;
        }
        AccessibilityEvent createEvent = createEvent(i, i2);
        if (num != null) {
            createEvent.setContentChangeTypes(num.intValue());
        }
        if (list != null) {
            createEvent.setContentDescription(ListUtilsKt.fastJoinToString$default(62, ",", list, null));
        }
        return sendEvent(createEvent);
    }

    public final void sendPaneChangeEvents(int i, int i2, String str) {
        AccessibilityEvent createEvent = createEvent(semanticsNodeIdToAccessibilityVirtualNodeId(i), 32);
        createEvent.setContentChangeTypes(i2);
        if (str != null) {
            createEvent.getText().add(str);
        }
        sendEvent(createEvent);
    }

    public final void sendPendingTextTraversedAtGranularityEvent(int i) {
        PendingTextTraversedEvent pendingTextTraversedEvent = this.pendingTextTraversedEvent;
        if (pendingTextTraversedEvent != null) {
            if (i != pendingTextTraversedEvent.getNode().id) {
                return;
            }
            if (SystemClock.uptimeMillis() - pendingTextTraversedEvent.getTraverseTime() <= 1000) {
                AccessibilityEvent createEvent = createEvent(semanticsNodeIdToAccessibilityVirtualNodeId(pendingTextTraversedEvent.getNode().id), PKIFailureInfo.unsupportedVersion);
                createEvent.setFromIndex(pendingTextTraversedEvent.getFromIndex());
                createEvent.setToIndex(pendingTextTraversedEvent.getToIndex());
                createEvent.setAction(pendingTextTraversedEvent.getAction());
                createEvent.setMovementGranularity(pendingTextTraversedEvent.getGranularity());
                createEvent.getText().add(getIterableTextForAccessibility(pendingTextTraversedEvent.getNode()));
                sendEvent(createEvent);
            }
        }
        this.pendingTextTraversedEvent = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:198:0x04f8, code lost:
    
        if (r1.isEmpty() == false) goto L208;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x010c, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r1, r13) != false) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void sendSemanticsPropertyChangeEvents(MutableIntObjectMap mutableIntObjectMap) {
        Integer num;
        ArrayList arrayList;
        int[] iArr;
        long[] jArr;
        Integer num2;
        int i;
        int i2;
        Integer num3;
        ArrayList arrayList2;
        int[] iArr2;
        long[] jArr2;
        int i3;
        int i4;
        int i5;
        Integer num4;
        SemanticsConfiguration semanticsConfiguration;
        SemanticsNode semanticsNode;
        int i6;
        boolean z;
        int i7;
        LayoutNode layoutNode;
        MutableScatterMap mutableScatterMap;
        SemanticsConfiguration semanticsConfiguration2;
        Integer num5;
        ArrayList arrayList3;
        long j;
        LayoutNode layoutNode2;
        Integer num6;
        int i8;
        MutableScatterMap mutableScatterMap2;
        int i9;
        int i10;
        boolean z2;
        boolean z3;
        int i11;
        String str;
        Integer num7;
        int i12;
        int i13;
        int i14;
        MutableScatterMap mutableScatterMap3;
        SemanticsConfiguration semanticsConfiguration3;
        Integer num8;
        AccessibilityEvent createTextSelectionChangedEvent;
        LayoutNode layoutNode3;
        AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = this;
        MutableIntObjectMap mutableIntObjectMap2 = mutableIntObjectMap;
        Integer num9 = 64;
        ArrayList arrayList4 = androidComposeViewAccessibilityDelegateCompat.scrollObservationScopes;
        ArrayList arrayList5 = new ArrayList(arrayList4);
        arrayList4.clear();
        int[] iArr3 = mutableIntObjectMap2.keys;
        long[] jArr3 = mutableIntObjectMap2.metadata;
        int i15 = 2;
        int length = jArr3.length - 2;
        int i16 = 0;
        Integer num10 = 0;
        if (length < 0) {
            return;
        }
        int i17 = 0;
        while (true) {
            long j2 = jArr3[i17];
            int i18 = i15;
            int i19 = length;
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i20 = 8;
                int i21 = 8 - ((~(i17 - i19)) >>> 31);
                long j3 = j2;
                int i22 = i16;
                while (i22 < i21) {
                    if ((j3 & 255) < 128) {
                        int i23 = iArr3[(i17 << 3) + i22];
                        SemanticsNodeCopy semanticsNodeCopy = (SemanticsNodeCopy) androidComposeViewAccessibilityDelegateCompat.previousSemanticsNodes.get(i23);
                        if (semanticsNodeCopy != null) {
                            SemanticsConfiguration semanticsConfiguration4 = semanticsNodeCopy.unmergedConfig;
                            MutableScatterMap mutableScatterMap4 = semanticsConfiguration4.props;
                            SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = (SemanticsNodeWithAdjustedBounds) mutableIntObjectMap2.get(i23);
                            SemanticsNode semanticsNode2 = semanticsNodeWithAdjustedBounds != null ? semanticsNodeWithAdjustedBounds.getSemanticsNode() : null;
                            if (semanticsNode2 == null) {
                                throw Boxes$$ExternalSyntheticOutline1.m1150m("no value for specified key");
                            }
                            int i24 = i20;
                            LayoutNode layoutNode4 = semanticsNode2.layoutNode;
                            SemanticsConfiguration semanticsConfiguration5 = semanticsNode2.unmergedConfig;
                            iArr2 = iArr3;
                            int i25 = semanticsNode2.id;
                            jArr2 = jArr3;
                            MutableScatterMap mutableScatterMap5 = semanticsConfiguration5.props;
                            i5 = i17;
                            Object[] objArr = mutableScatterMap5.keys;
                            Object[] objArr2 = mutableScatterMap5.values;
                            long[] jArr4 = mutableScatterMap5.metadata;
                            i2 = i22;
                            int length2 = jArr4.length - 2;
                            if (length2 >= 0) {
                                LayoutNode layoutNode5 = layoutNode4;
                                i4 = i21;
                                int i26 = 0;
                                z = false;
                                while (true) {
                                    long j4 = jArr4[i26];
                                    semanticsNode = semanticsNode2;
                                    int i27 = i26;
                                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i28 = 8 - ((~(i27 - length2)) >>> 31);
                                        int i29 = 0;
                                        while (i29 < i28) {
                                            if ((j4 & 255) < 128) {
                                                int i30 = (i27 << 3) + i29;
                                                Object obj = objArr[i30];
                                                int i31 = length2;
                                                Object obj2 = objArr2[i30];
                                                semanticsConfiguration2 = semanticsConfiguration4;
                                                SemanticsPropertyKey semanticsPropertyKey = (SemanticsPropertyKey) obj;
                                                j = j4;
                                                SemanticsPropertyKey semanticsPropertyKey2 = SemanticsProperties.HorizontalScrollAxisRange;
                                                if (Intrinsics.areEqual(semanticsPropertyKey, semanticsPropertyKey2) || Intrinsics.areEqual(semanticsPropertyKey, SemanticsProperties.VerticalScrollAxisRange)) {
                                                    ScrollObservationScope findById = ArcadeThemeKt.findById(i23, arrayList5);
                                                    if (findById != null) {
                                                        z2 = false;
                                                    } else {
                                                        findById = new ScrollObservationScope(i23, arrayList4);
                                                        z2 = true;
                                                    }
                                                    arrayList4.add(findById);
                                                } else {
                                                    z2 = false;
                                                }
                                                if (!z2) {
                                                    Object obj3 = mutableScatterMap4.get(semanticsPropertyKey);
                                                    if (obj3 == null) {
                                                        obj3 = null;
                                                    }
                                                }
                                                SemanticsPropertyKey semanticsPropertyKey3 = SemanticsProperties.PaneTitle;
                                                if (Intrinsics.areEqual(semanticsPropertyKey, semanticsPropertyKey3)) {
                                                    obj2.getClass();
                                                    String str2 = (String) obj2;
                                                    boolean containsKey = mutableScatterMap4.containsKey(semanticsPropertyKey3);
                                                    int i32 = i24;
                                                    if (containsKey) {
                                                        androidComposeViewAccessibilityDelegateCompat.sendPaneChangeEvents(i23, i32, str2);
                                                    }
                                                } else if (Intrinsics.areEqual(semanticsPropertyKey, SemanticsProperties.StateDescription)) {
                                                    sendEventForVirtualView$default(androidComposeViewAccessibilityDelegateCompat, androidComposeViewAccessibilityDelegateCompat.semanticsNodeIdToAccessibilityVirtualNodeId(i23), 2048, num9, 8);
                                                    sendEventForVirtualView$default(androidComposeViewAccessibilityDelegateCompat, androidComposeViewAccessibilityDelegateCompat.semanticsNodeIdToAccessibilityVirtualNodeId(i23), 2048, num10, 8);
                                                } else {
                                                    arrayList3 = arrayList5;
                                                    if (Intrinsics.areEqual(semanticsPropertyKey, SemanticsProperties.ToggleableState)) {
                                                        sendEventForVirtualView$default(androidComposeViewAccessibilityDelegateCompat, androidComposeViewAccessibilityDelegateCompat.semanticsNodeIdToAccessibilityVirtualNodeId(i23), 2048, Integer.valueOf(PKIFailureInfo.certRevoked), 8);
                                                        sendEventForVirtualView$default(androidComposeViewAccessibilityDelegateCompat, androidComposeViewAccessibilityDelegateCompat.semanticsNodeIdToAccessibilityVirtualNodeId(i23), 2048, num10, 8);
                                                    } else if (Intrinsics.areEqual(semanticsPropertyKey, SemanticsProperties.Error)) {
                                                        sendEventForVirtualView$default(androidComposeViewAccessibilityDelegateCompat, androidComposeViewAccessibilityDelegateCompat.semanticsNodeIdToAccessibilityVirtualNodeId(i23), 2048, 3072, 8);
                                                    } else if (Intrinsics.areEqual(semanticsPropertyKey, SemanticsProperties.ProgressBarRangeInfo)) {
                                                        sendEventForVirtualView$default(androidComposeViewAccessibilityDelegateCompat, androidComposeViewAccessibilityDelegateCompat.semanticsNodeIdToAccessibilityVirtualNodeId(i23), 2048, num9, 8);
                                                        sendEventForVirtualView$default(androidComposeViewAccessibilityDelegateCompat, androidComposeViewAccessibilityDelegateCompat.semanticsNodeIdToAccessibilityVirtualNodeId(i23), 2048, num10, 8);
                                                    } else {
                                                        SemanticsPropertyKey semanticsPropertyKey4 = SemanticsProperties.Selected;
                                                        if (Intrinsics.areEqual(semanticsPropertyKey, semanticsPropertyKey4)) {
                                                            Object obj4 = mutableScatterMap5.get(SemanticsProperties.Role);
                                                            if (obj4 == null) {
                                                                obj4 = null;
                                                            }
                                                            Role role = (Role) obj4;
                                                            if (role != null && role.value == 4) {
                                                                Object obj5 = mutableScatterMap5.get(semanticsPropertyKey4);
                                                                if (obj5 == null) {
                                                                    obj5 = null;
                                                                }
                                                                if (Intrinsics.areEqual(obj5, Boolean.TRUE)) {
                                                                    AccessibilityEvent createEvent = androidComposeViewAccessibilityDelegateCompat.createEvent(androidComposeViewAccessibilityDelegateCompat.semanticsNodeIdToAccessibilityVirtualNodeId(i23), 4);
                                                                    SemanticsNode semanticsNode3 = semanticsNode;
                                                                    LayoutNode layoutNode6 = layoutNode5;
                                                                    i9 = i29;
                                                                    SemanticsNode semanticsNode4 = new SemanticsNode(semanticsNode3.outerSemanticsNode, true, layoutNode6, semanticsConfiguration5);
                                                                    Object obj6 = semanticsNode4.getConfig().props.get(SemanticsProperties.ContentDescription);
                                                                    if (obj6 == null) {
                                                                        obj6 = null;
                                                                    }
                                                                    List list = (List) obj6;
                                                                    layoutNode3 = layoutNode6;
                                                                    String fastJoinToString$default = list != null ? ListUtilsKt.fastJoinToString$default(62, ",", list, null) : null;
                                                                    Object obj7 = semanticsNode4.getConfig().props.get(SemanticsProperties.Text);
                                                                    if (obj7 == null) {
                                                                        obj7 = null;
                                                                    }
                                                                    List list2 = (List) obj7;
                                                                    semanticsNode = semanticsNode3;
                                                                    String fastJoinToString$default2 = list2 != null ? ListUtilsKt.fastJoinToString$default(62, ",", list2, null) : null;
                                                                    if (fastJoinToString$default != null) {
                                                                        createEvent.setContentDescription(fastJoinToString$default);
                                                                    }
                                                                    if (fastJoinToString$default2 != null) {
                                                                        createEvent.getText().add(fastJoinToString$default2);
                                                                    }
                                                                    androidComposeViewAccessibilityDelegateCompat.sendEvent(createEvent);
                                                                } else {
                                                                    layoutNode3 = layoutNode5;
                                                                    i9 = i29;
                                                                    sendEventForVirtualView$default(androidComposeViewAccessibilityDelegateCompat, androidComposeViewAccessibilityDelegateCompat.semanticsNodeIdToAccessibilityVirtualNodeId(i23), 2048, num10, 8);
                                                                }
                                                            } else {
                                                                layoutNode3 = layoutNode5;
                                                                i9 = i29;
                                                                sendEventForVirtualView$default(androidComposeViewAccessibilityDelegateCompat, androidComposeViewAccessibilityDelegateCompat.semanticsNodeIdToAccessibilityVirtualNodeId(i23), 2048, num9, 8);
                                                                sendEventForVirtualView$default(androidComposeViewAccessibilityDelegateCompat, androidComposeViewAccessibilityDelegateCompat.semanticsNodeIdToAccessibilityVirtualNodeId(i23), 2048, num10, 8);
                                                            }
                                                            num6 = num10;
                                                            mutableScatterMap2 = mutableScatterMap4;
                                                            num5 = num9;
                                                            layoutNode2 = layoutNode3;
                                                        } else {
                                                            layoutNode2 = layoutNode5;
                                                            i9 = i29;
                                                            if (Intrinsics.areEqual(semanticsPropertyKey, SemanticsProperties.ContentDescription)) {
                                                                int semanticsNodeIdToAccessibilityVirtualNodeId = androidComposeViewAccessibilityDelegateCompat.semanticsNodeIdToAccessibilityVirtualNodeId(i23);
                                                                obj2.getClass();
                                                                androidComposeViewAccessibilityDelegateCompat.sendEventForVirtualView(semanticsNodeIdToAccessibilityVirtualNodeId, 2048, 4, (List) obj2);
                                                                num6 = num10;
                                                                mutableScatterMap2 = mutableScatterMap4;
                                                                num5 = num9;
                                                            } else {
                                                                SemanticsPropertyKey semanticsPropertyKey5 = SemanticsProperties.EditableText;
                                                                String str3 = "";
                                                                if (Intrinsics.areEqual(semanticsPropertyKey, semanticsPropertyKey5)) {
                                                                    if (mutableScatterMap5.containsKey(SemanticsActions.SetText)) {
                                                                        Object obj8 = mutableScatterMap4.get(semanticsPropertyKey5);
                                                                        if (obj8 == null) {
                                                                            obj8 = null;
                                                                        }
                                                                        AnnotatedString annotatedString = (AnnotatedString) obj8;
                                                                        if (annotatedString == null) {
                                                                            annotatedString = "";
                                                                        }
                                                                        Object obj9 = mutableScatterMap5.get(semanticsPropertyKey5);
                                                                        if (obj9 == null) {
                                                                            obj9 = null;
                                                                        }
                                                                        CharSequence charSequence = (AnnotatedString) obj9;
                                                                        if (charSequence == null) {
                                                                            charSequence = "";
                                                                        }
                                                                        CharSequence trimToSize = trimToSize(charSequence);
                                                                        int length3 = annotatedString.length();
                                                                        int length4 = charSequence.length();
                                                                        Integer num11 = num10;
                                                                        int i33 = length3 > length4 ? length4 : length3;
                                                                        num5 = num9;
                                                                        int i34 = 0;
                                                                        while (true) {
                                                                            i12 = i33;
                                                                            if (i34 >= i33) {
                                                                                i13 = length3;
                                                                                break;
                                                                            }
                                                                            i13 = length3;
                                                                            if (annotatedString.charAt(i34) != charSequence.charAt(i34)) {
                                                                                break;
                                                                            }
                                                                            i34++;
                                                                            i33 = i12;
                                                                            length3 = i13;
                                                                        }
                                                                        int i35 = 0;
                                                                        while (true) {
                                                                            if (i35 >= i12 - i34) {
                                                                                i14 = i35;
                                                                                break;
                                                                            }
                                                                            i14 = i35;
                                                                            if (annotatedString.charAt((i13 - 1) - i35) != charSequence.charAt((length4 - 1) - i14)) {
                                                                                break;
                                                                            } else {
                                                                                i35 = i14 + 1;
                                                                            }
                                                                        }
                                                                        int i36 = (i13 - i14) - i34;
                                                                        int i37 = (length4 - i14) - i34;
                                                                        SemanticsPropertyKey semanticsPropertyKey6 = SemanticsProperties.Password;
                                                                        boolean containsKey2 = mutableScatterMap4.containsKey(semanticsPropertyKey6);
                                                                        boolean containsKey3 = mutableScatterMap5.containsKey(semanticsPropertyKey6);
                                                                        boolean containsKey4 = mutableScatterMap4.containsKey(SemanticsProperties.EditableText);
                                                                        boolean z4 = containsKey4 && !containsKey2 && containsKey3;
                                                                        boolean z5 = containsKey4 && containsKey2 && !containsKey3;
                                                                        if (z4 || z5) {
                                                                            int semanticsNodeIdToAccessibilityVirtualNodeId2 = androidComposeViewAccessibilityDelegateCompat.semanticsNodeIdToAccessibilityVirtualNodeId(i23);
                                                                            Integer valueOf = Integer.valueOf(length4);
                                                                            mutableScatterMap3 = mutableScatterMap4;
                                                                            i8 = i23;
                                                                            semanticsConfiguration3 = semanticsConfiguration2;
                                                                            num8 = num11;
                                                                            createTextSelectionChangedEvent = androidComposeViewAccessibilityDelegateCompat.createTextSelectionChangedEvent(semanticsNodeIdToAccessibilityVirtualNodeId2, num8, num11, valueOf, trimToSize);
                                                                        } else {
                                                                            createTextSelectionChangedEvent = androidComposeViewAccessibilityDelegateCompat.createEvent(androidComposeViewAccessibilityDelegateCompat.semanticsNodeIdToAccessibilityVirtualNodeId(i23), 16);
                                                                            createTextSelectionChangedEvent.setFromIndex(i34);
                                                                            createTextSelectionChangedEvent.setRemovedCount(i36);
                                                                            createTextSelectionChangedEvent.setAddedCount(i37);
                                                                            createTextSelectionChangedEvent.setBeforeText(annotatedString);
                                                                            createTextSelectionChangedEvent.getText().add(trimToSize);
                                                                            i8 = i23;
                                                                            mutableScatterMap3 = mutableScatterMap4;
                                                                            semanticsConfiguration3 = semanticsConfiguration2;
                                                                            num8 = num11;
                                                                        }
                                                                        createTextSelectionChangedEvent.setClassName("android.widget.EditText");
                                                                        androidComposeViewAccessibilityDelegateCompat.sendEvent(createTextSelectionChangedEvent);
                                                                        if (z4 || z5) {
                                                                            num7 = num8;
                                                                            long j5 = ((TextRange) semanticsConfiguration5.get(SemanticsProperties.TextSelectionRange)).packedValue;
                                                                            createTextSelectionChangedEvent.setFromIndex((int) (j5 >> 32));
                                                                            createTextSelectionChangedEvent.setToIndex((int) (j5 & BodyPartID.bodyIdMax));
                                                                            androidComposeViewAccessibilityDelegateCompat.sendEvent(createTextSelectionChangedEvent);
                                                                        } else {
                                                                            num7 = num8;
                                                                        }
                                                                        mutableScatterMap2 = mutableScatterMap3;
                                                                        semanticsConfiguration2 = semanticsConfiguration3;
                                                                    } else {
                                                                        num7 = num10;
                                                                        num5 = num9;
                                                                        i8 = i23;
                                                                        sendEventForVirtualView$default(androidComposeViewAccessibilityDelegateCompat, androidComposeViewAccessibilityDelegateCompat.semanticsNodeIdToAccessibilityVirtualNodeId(i8), 2048, Integer.valueOf(i18), 8);
                                                                        mutableScatterMap2 = mutableScatterMap4;
                                                                    }
                                                                    i10 = i31;
                                                                    num6 = num7;
                                                                } else {
                                                                    Integer num12 = num10;
                                                                    mutableScatterMap2 = mutableScatterMap4;
                                                                    num5 = num9;
                                                                    i8 = i23;
                                                                    SemanticsPropertyKey semanticsPropertyKey7 = SemanticsProperties.TextSelectionRange;
                                                                    if (Intrinsics.areEqual(semanticsPropertyKey, semanticsPropertyKey7)) {
                                                                        Object obj10 = mutableScatterMap5.get(semanticsPropertyKey5);
                                                                        if (obj10 == null) {
                                                                            obj10 = null;
                                                                        }
                                                                        AnnotatedString annotatedString2 = (AnnotatedString) obj10;
                                                                        if (annotatedString2 != null && (str = annotatedString2.text) != null) {
                                                                            str3 = str;
                                                                        }
                                                                        long j6 = ((TextRange) semanticsConfiguration5.get(semanticsPropertyKey7)).packedValue;
                                                                        semanticsConfiguration2 = semanticsConfiguration2;
                                                                        i10 = i31;
                                                                        num6 = num12;
                                                                        androidComposeViewAccessibilityDelegateCompat = this;
                                                                        androidComposeViewAccessibilityDelegateCompat.sendEvent(androidComposeViewAccessibilityDelegateCompat.createTextSelectionChangedEvent(androidComposeViewAccessibilityDelegateCompat.semanticsNodeIdToAccessibilityVirtualNodeId(i8), Integer.valueOf((int) (j6 >> 32)), Integer.valueOf((int) (j6 & BodyPartID.bodyIdMax)), Integer.valueOf(str3.length()), trimToSize(str3)));
                                                                        androidComposeViewAccessibilityDelegateCompat.sendPendingTextTraversedAtGranularityEvent(i25);
                                                                        mutableScatterMap2 = mutableScatterMap2;
                                                                    } else {
                                                                        semanticsConfiguration2 = semanticsConfiguration2;
                                                                        i10 = i31;
                                                                        num6 = num12;
                                                                        if (Intrinsics.areEqual(semanticsPropertyKey, semanticsPropertyKey2) || Intrinsics.areEqual(semanticsPropertyKey, SemanticsProperties.VerticalScrollAxisRange)) {
                                                                            androidComposeViewAccessibilityDelegateCompat.notifySubtreeAccessibilityStateChangedIfNeeded(layoutNode2);
                                                                            ScrollObservationScope findById2 = ArcadeThemeKt.findById(i8, arrayList4);
                                                                            findById2.getClass();
                                                                            Object obj11 = mutableScatterMap5.get(semanticsPropertyKey2);
                                                                            if (obj11 == null) {
                                                                                obj11 = null;
                                                                            }
                                                                            findById2.setHorizontalScrollAxisRange((ScrollAxisRange) obj11);
                                                                            Object obj12 = mutableScatterMap5.get(SemanticsProperties.VerticalScrollAxisRange);
                                                                            if (obj12 == null) {
                                                                                obj12 = null;
                                                                            }
                                                                            findById2.setVerticalScrollAxisRange((ScrollAxisRange) obj12);
                                                                            if (findById2.isValidOwnerScope()) {
                                                                                ((SnapshotStateObserver) androidComposeViewAccessibilityDelegateCompat.view.snapshotObserver.application).observeReads(findById2, androidComposeViewAccessibilityDelegateCompat.scheduleScrollEventIfNeededLambda, new ViewRegistryKt$buildView$1$2$1$1(5, findById2, androidComposeViewAccessibilityDelegateCompat));
                                                                            }
                                                                        } else if (Intrinsics.areEqual(semanticsPropertyKey, SemanticsProperties.Focused)) {
                                                                            obj2.getClass();
                                                                            if (((Boolean) obj2).booleanValue()) {
                                                                                i11 = 8;
                                                                                androidComposeViewAccessibilityDelegateCompat.sendEvent(androidComposeViewAccessibilityDelegateCompat.createEvent(androidComposeViewAccessibilityDelegateCompat.semanticsNodeIdToAccessibilityVirtualNodeId(i25), 8));
                                                                            } else {
                                                                                i11 = 8;
                                                                            }
                                                                            sendEventForVirtualView$default(androidComposeViewAccessibilityDelegateCompat, androidComposeViewAccessibilityDelegateCompat.semanticsNodeIdToAccessibilityVirtualNodeId(i25), 2048, num6, i11);
                                                                        } else {
                                                                            SemanticsPropertyKey semanticsPropertyKey8 = SemanticsActions.CustomActions;
                                                                            if (Intrinsics.areEqual(semanticsPropertyKey, semanticsPropertyKey8)) {
                                                                                List list3 = (List) semanticsConfiguration5.get(semanticsPropertyKey8);
                                                                                Object obj13 = mutableScatterMap2.get(semanticsPropertyKey8);
                                                                                if (obj13 == null) {
                                                                                    obj13 = null;
                                                                                }
                                                                                List list4 = (List) obj13;
                                                                                if (list4 != null) {
                                                                                    MutableScatterSet mutableScatterSet = ScatterSetKt.EmptyScatterSet;
                                                                                    MutableScatterSet mutableScatterSet2 = new MutableScatterSet();
                                                                                    int size = list3.size();
                                                                                    int i38 = 0;
                                                                                    while (i38 < size) {
                                                                                        mutableScatterSet2.add(((CustomAccessibilityAction) list3.get(i38)).getLabel());
                                                                                        i38++;
                                                                                        list3 = list3;
                                                                                    }
                                                                                    MutableScatterSet mutableScatterSet3 = new MutableScatterSet();
                                                                                    int size2 = list4.size();
                                                                                    int i39 = 0;
                                                                                    while (i39 < size2) {
                                                                                        mutableScatterSet3.add(((CustomAccessibilityAction) list4.get(i39)).getLabel());
                                                                                        i39++;
                                                                                        list4 = list4;
                                                                                    }
                                                                                    z = !mutableScatterSet2.equals(mutableScatterSet3);
                                                                                } else {
                                                                                    z3 = true;
                                                                                }
                                                                            } else {
                                                                                z3 = true;
                                                                                if (obj2 instanceof AccessibilityAction) {
                                                                                    AccessibilityAction accessibilityAction = (AccessibilityAction) obj2;
                                                                                    Object obj14 = mutableScatterMap2.get(semanticsPropertyKey);
                                                                                    if (obj14 == null) {
                                                                                        obj14 = null;
                                                                                    }
                                                                                    if (LayoutUpdate.access$accessibilityEquals(accessibilityAction, obj14)) {
                                                                                        z = false;
                                                                                    }
                                                                                }
                                                                                z = z3;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        i10 = i31;
                                                        i8 = i23;
                                                    }
                                                    num6 = num10;
                                                    mutableScatterMap2 = mutableScatterMap4;
                                                    num5 = num9;
                                                    layoutNode2 = layoutNode5;
                                                    i8 = i23;
                                                    i9 = i29;
                                                    i10 = i31;
                                                }
                                                num5 = num9;
                                                arrayList3 = arrayList5;
                                                layoutNode2 = layoutNode5;
                                                num6 = num10;
                                                i8 = i23;
                                                mutableScatterMap2 = mutableScatterMap4;
                                                i9 = i29;
                                                i10 = i31;
                                            } else {
                                                semanticsConfiguration2 = semanticsConfiguration4;
                                                num5 = num9;
                                                arrayList3 = arrayList5;
                                                j = j4;
                                                layoutNode2 = layoutNode5;
                                                num6 = num10;
                                                i8 = i23;
                                                mutableScatterMap2 = mutableScatterMap4;
                                                i9 = i29;
                                                i10 = length2;
                                            }
                                            int i40 = i10;
                                            i29 = i9 + 1;
                                            length2 = i40;
                                            mutableScatterMap4 = mutableScatterMap2;
                                            i24 = 8;
                                            i23 = i8;
                                            num10 = num6;
                                            layoutNode5 = layoutNode2;
                                            semanticsConfiguration4 = semanticsConfiguration2;
                                            j4 = j >> 8;
                                            arrayList5 = arrayList3;
                                            num9 = num5;
                                        }
                                        i7 = length2;
                                        semanticsConfiguration = semanticsConfiguration4;
                                        num3 = num9;
                                        arrayList2 = arrayList5;
                                        layoutNode = layoutNode5;
                                        num4 = num10;
                                        i6 = i23;
                                        mutableScatterMap = mutableScatterMap4;
                                        if (i28 != i24) {
                                            break;
                                        }
                                    } else {
                                        i7 = length2;
                                        semanticsConfiguration = semanticsConfiguration4;
                                        num3 = num9;
                                        arrayList2 = arrayList5;
                                        layoutNode = layoutNode5;
                                        num4 = num10;
                                        i6 = i23;
                                        mutableScatterMap = mutableScatterMap4;
                                    }
                                    if (i27 == i7) {
                                        break;
                                    }
                                    int i41 = i7;
                                    i26 = i27 + 1;
                                    length2 = i41;
                                    mutableScatterMap4 = mutableScatterMap;
                                    i23 = i6;
                                    num10 = num4;
                                    layoutNode5 = layoutNode;
                                    semanticsNode2 = semanticsNode;
                                    semanticsConfiguration4 = semanticsConfiguration;
                                    arrayList5 = arrayList2;
                                    num9 = num3;
                                    i24 = 8;
                                }
                            } else {
                                semanticsConfiguration = semanticsConfiguration4;
                                num3 = num9;
                                arrayList2 = arrayList5;
                                i4 = i21;
                                semanticsNode = semanticsNode2;
                                num4 = num10;
                                i6 = i23;
                                z = false;
                            }
                            if (!z) {
                                z = LayoutUpdate.access$propertiesDeleted(semanticsNode, semanticsConfiguration);
                            }
                            if (z) {
                                i3 = 8;
                                sendEventForVirtualView$default(androidComposeViewAccessibilityDelegateCompat, androidComposeViewAccessibilityDelegateCompat.semanticsNodeIdToAccessibilityVirtualNodeId(i6), 2048, num4, 8);
                            } else {
                                i3 = 8;
                            }
                            j3 >>= i3;
                            i22 = i2 + 1;
                            mutableIntObjectMap2 = mutableIntObjectMap;
                            i20 = i3;
                            num10 = num4;
                            iArr3 = iArr2;
                            jArr3 = jArr2;
                            i17 = i5;
                            i21 = i4;
                            arrayList5 = arrayList2;
                            num9 = num3;
                        }
                    }
                    i2 = i22;
                    num3 = num9;
                    arrayList2 = arrayList5;
                    iArr2 = iArr3;
                    jArr2 = jArr3;
                    i3 = i20;
                    i4 = i21;
                    i5 = i17;
                    num4 = num10;
                    j3 >>= i3;
                    i22 = i2 + 1;
                    mutableIntObjectMap2 = mutableIntObjectMap;
                    i20 = i3;
                    num10 = num4;
                    iArr3 = iArr2;
                    jArr3 = jArr2;
                    i17 = i5;
                    i21 = i4;
                    arrayList5 = arrayList2;
                    num9 = num3;
                }
                num = num9;
                arrayList = arrayList5;
                iArr = iArr3;
                jArr = jArr3;
                int i42 = i17;
                num2 = num10;
                if (i21 != i20) {
                    return;
                } else {
                    i = i42;
                }
            } else {
                num = num9;
                arrayList = arrayList5;
                iArr = iArr3;
                jArr = jArr3;
                num2 = num10;
                i = i17;
            }
            if (i == i19) {
                return;
            }
            i17 = i + 1;
            mutableIntObjectMap2 = mutableIntObjectMap;
            length = i19;
            num10 = num2;
            i15 = i18;
            iArr3 = iArr;
            jArr3 = jArr;
            arrayList5 = arrayList;
            num9 = num;
            i16 = 0;
        }
    }

    public final void sendSubtreeChangeAccessibilityEvents(LayoutNode layoutNode, MutableIntSet mutableIntSet) {
        SemanticsConfiguration semanticsConfiguration;
        LayoutNode access$findClosestParentNode;
        if (layoutNode.isAttached() && !this.view.getAndroidViewsHandler$ui().layoutNodeToHolder.containsKey(layoutNode)) {
            if (!layoutNode.nodes.m889hasH91voCI$ui(8)) {
                layoutNode = LayoutUpdate.access$findClosestParentNode(layoutNode, AndroidComposeViewAccessibilityDelegateCompat$currentSemanticsNodes$1.INSTANCE$2);
            }
            if (layoutNode == null || (semanticsConfiguration = layoutNode.getSemanticsConfiguration()) == null) {
                return;
            }
            if (!semanticsConfiguration.isMergingSemanticsOfDescendants && (access$findClosestParentNode = LayoutUpdate.access$findClosestParentNode(layoutNode, AndroidComposeViewAccessibilityDelegateCompat$currentSemanticsNodes$1.INSTANCE$1)) != null) {
                layoutNode = access$findClosestParentNode;
            }
            int i = layoutNode.semanticsId;
            if (mutableIntSet.add(i)) {
                sendEventForVirtualView$default(this, semanticsNodeIdToAccessibilityVirtualNodeId(i), 2048, 1, 8);
            }
        }
    }

    public final void sendTypeViewScrolledAccessibilityEvent(LayoutNode layoutNode) {
        if (layoutNode.isAttached() && !this.view.getAndroidViewsHandler$ui().layoutNodeToHolder.containsKey(layoutNode)) {
            int i = layoutNode.semanticsId;
            ScrollAxisRange scrollAxisRange = (ScrollAxisRange) this.pendingHorizontalScrollEvents.get(i);
            ScrollAxisRange scrollAxisRange2 = (ScrollAxisRange) this.pendingVerticalScrollEvents.get(i);
            if (scrollAxisRange == null && scrollAxisRange2 == null) {
                return;
            }
            AccessibilityEvent createEvent = createEvent(i, 4096);
            if (scrollAxisRange != null) {
                createEvent.setScrollX((int) ((Number) scrollAxisRange.value.invoke()).floatValue());
                createEvent.setMaxScrollX((int) ((Number) scrollAxisRange.maxValue.invoke()).floatValue());
            }
            if (scrollAxisRange2 != null) {
                createEvent.setScrollY((int) ((Number) scrollAxisRange2.value.invoke()).floatValue());
                createEvent.setMaxScrollY((int) ((Number) scrollAxisRange2.maxValue.invoke()).floatValue());
            }
            sendEvent(createEvent);
        }
    }

    public final boolean setAccessibilitySelection(SemanticsNode semanticsNode, int i, int i2, boolean z) {
        String iterableTextForAccessibility;
        SemanticsConfiguration semanticsConfiguration = semanticsNode.unmergedConfig;
        int i3 = semanticsNode.id;
        SemanticsPropertyKey semanticsPropertyKey = SemanticsActions.SetSelection;
        if (semanticsConfiguration.props.containsKey(semanticsPropertyKey) && LayoutUpdate.access$enabled(semanticsNode)) {
            Function3 function3 = (Function3) ((AccessibilityAction) semanticsConfiguration.get(semanticsPropertyKey)).action;
            if (function3 != null) {
                return ((Boolean) function3.invoke(Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
            }
        } else if ((i != i2 || i2 != this.accessibilityCursorPosition) && (iterableTextForAccessibility = getIterableTextForAccessibility(semanticsNode)) != null) {
            if (i < 0 || i != i2 || i2 > iterableTextForAccessibility.length()) {
                i = -1;
            }
            this.accessibilityCursorPosition = i;
            boolean z2 = iterableTextForAccessibility.length() > 0;
            sendEvent(createTextSelectionChangedEvent(semanticsNodeIdToAccessibilityVirtualNodeId(i3), z2 ? Integer.valueOf(this.accessibilityCursorPosition) : null, z2 ? Integer.valueOf(this.accessibilityCursorPosition) : null, z2 ? Integer.valueOf(iterableTextForAccessibility.length()) : null, iterableTextForAccessibility));
            sendPendingTextTraversedAtGranularityEvent(i3);
            return true;
        }
        return false;
    }

    public final android.graphics.Rect toBoundsInScreen(float f, float f2, float f3, float f4) {
        long floatToRawIntBits = Float.floatToRawIntBits(f);
        long floatToRawIntBits2 = Float.floatToRawIntBits(f2) & BodyPartID.bodyIdMax;
        AndroidComposeView androidComposeView = this.view;
        long m916localToScreenMKHz9U = androidComposeView.m916localToScreenMKHz9U(floatToRawIntBits2 | (floatToRawIntBits << 32));
        long m916localToScreenMKHz9U2 = androidComposeView.m916localToScreenMKHz9U((Float.floatToRawIntBits(f4) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(f3) << 32));
        int i = (int) (m916localToScreenMKHz9U >> 32);
        int i2 = (int) (m916localToScreenMKHz9U2 >> 32);
        int floor = (int) Math.floor(Math.min(Float.intBitsToFloat(i), Float.intBitsToFloat(i2)));
        float intBitsToFloat = Float.intBitsToFloat((int) (m916localToScreenMKHz9U & BodyPartID.bodyIdMax));
        int i3 = (int) (m916localToScreenMKHz9U2 & BodyPartID.bodyIdMax);
        return new android.graphics.Rect(floor, (int) Math.floor(Math.min(intBitsToFloat, Float.intBitsToFloat(i3))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i), Float.intBitsToFloat(i2))), (int) Math.ceil(Math.max(Float.intBitsToFloat(r8), Float.intBitsToFloat(i3))));
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0141, code lost:
    
        r28 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x014b, code lost:
    
        if (((r7 & ((~r7) << 6)) & r20) == 0) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x014d, code lost:
    
        r25 = -1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void updateSemanticsNodesCopyAndPanes() {
        long j;
        long j2;
        long j3;
        char c;
        long[] jArr;
        long[] jArr2;
        long j4;
        int i;
        int i2;
        int i3;
        char c2;
        MutableIntSet mutableIntSet = new MutableIntSet();
        MutableIntSet mutableIntSet2 = this.paneDisplayed;
        int[] iArr = mutableIntSet2.elements;
        long[] jArr3 = mutableIntSet2.metadata;
        int length = jArr3.length - 2;
        MutableIntObjectMap mutableIntObjectMap = this.previousSemanticsNodes;
        int i4 = 8;
        if (length >= 0) {
            int i5 = 0;
            j = 128;
            j2 = 255;
            while (true) {
                long j5 = jArr3[i5];
                char c3 = 7;
                j3 = -9187201950435737472L;
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i6 = 8 - ((~(i5 - length)) >>> 31);
                    int i7 = 0;
                    while (i7 < i6) {
                        if ((j5 & 255) < 128) {
                            int i8 = iArr[(i5 << 3) + i7];
                            c2 = c3;
                            SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = (SemanticsNodeWithAdjustedBounds) getCurrentSemanticsNodes().get(i8);
                            SemanticsNode semanticsNode = semanticsNodeWithAdjustedBounds != null ? semanticsNodeWithAdjustedBounds.getSemanticsNode() : null;
                            if (semanticsNode != null) {
                                if (semanticsNode.unmergedConfig.props.containsKey(SemanticsProperties.PaneTitle)) {
                                }
                            }
                            mutableIntSet.add(i8);
                            SemanticsNodeCopy semanticsNodeCopy = (SemanticsNodeCopy) mutableIntObjectMap.get(i8);
                            if (semanticsNodeCopy != null) {
                                Object obj = semanticsNodeCopy.unmergedConfig.props.get(SemanticsProperties.PaneTitle);
                                r23 = obj != 0 ? obj : null;
                            }
                            sendPaneChangeEvents(i8, 32, r23);
                        } else {
                            c2 = c3;
                        }
                        j5 >>= 8;
                        i7++;
                        c3 = c2;
                    }
                    c = c3;
                    if (i6 != 8) {
                        break;
                    }
                } else {
                    c = 7;
                }
                if (i5 == length) {
                    break;
                } else {
                    i5++;
                }
            }
        } else {
            j = 128;
            j2 = 255;
            j3 = -9187201950435737472L;
            c = 7;
        }
        int[] iArr2 = mutableIntSet.elements;
        long[] jArr4 = mutableIntSet.metadata;
        int length2 = jArr4.length - 2;
        if (length2 >= 0) {
            int i9 = 0;
            while (true) {
                long j6 = jArr4[i9];
                if ((((~j6) << c) & j6 & j3) != j3) {
                    int i10 = 8 - ((~(i9 - length2)) >>> 31);
                    int i11 = 0;
                    while (i11 < i10) {
                        if ((j6 & j2) < j) {
                            int i12 = iArr2[(i9 << 3) + i11];
                            int hashCode = Integer.hashCode(i12) * (-862048943);
                            int i13 = hashCode ^ (hashCode << 16);
                            int i14 = i13 & 127;
                            int i15 = mutableIntSet2._capacity;
                            int i16 = (i13 >>> 7) & i15;
                            i = i4;
                            int i17 = 0;
                            while (true) {
                                long[] jArr5 = mutableIntSet2.metadata;
                                int i18 = i16 >> 3;
                                jArr2 = jArr4;
                                int i19 = (i16 & 7) << 3;
                                j4 = j6;
                                long j7 = (jArr5[i18] >>> i19) | ((jArr5[i18 + 1] << (64 - i19)) & ((-i19) >> 63));
                                int i20 = i15;
                                long j8 = (i14 * 72340172838076673L) ^ j7;
                                long j9 = (j8 - 72340172838076673L) & (~j8) & j3;
                                while (true) {
                                    if (j9 == 0) {
                                        break;
                                    }
                                    i3 = (i16 + (Long.numberOfTrailingZeros(j9) >> 3)) & i20;
                                    int i21 = i20;
                                    if (mutableIntSet2.elements[i3] == i12) {
                                        break;
                                    }
                                    j9 &= j9 - 1;
                                    i20 = i21;
                                }
                                i17 += 8;
                                i16 = (i16 + i17) & i2;
                                jArr4 = jArr2;
                                i15 = i2;
                                j6 = j4;
                            }
                            int i22 = i3;
                            if (i22 >= 0) {
                                mutableIntSet2.removeElementAt(i22);
                            }
                        } else {
                            jArr2 = jArr4;
                            j4 = j6;
                            i = i4;
                        }
                        j6 = j4 >> i;
                        i11++;
                        i4 = i;
                        jArr4 = jArr2;
                    }
                    jArr = jArr4;
                    if (i10 != i4) {
                        break;
                    }
                } else {
                    jArr = jArr4;
                }
                if (i9 == length2) {
                    break;
                }
                i9++;
                jArr4 = jArr;
                i4 = 8;
            }
        }
        mutableIntObjectMap.clear();
        MutableIntObjectMap currentSemanticsNodes = getCurrentSemanticsNodes();
        int[] iArr3 = currentSemanticsNodes.keys;
        Object[] objArr = currentSemanticsNodes.values;
        long[] jArr6 = currentSemanticsNodes.metadata;
        int length3 = jArr6.length - 2;
        if (length3 >= 0) {
            int i23 = 0;
            while (true) {
                long j10 = jArr6[i23];
                if ((((~j10) << c) & j10 & j3) != j3) {
                    int i24 = 8 - ((~(i23 - length3)) >>> 31);
                    for (int i25 = 0; i25 < i24; i25++) {
                        if ((j10 & j2) < j) {
                            int i26 = (i23 << 3) + i25;
                            int i27 = iArr3[i26];
                            SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds2 = (SemanticsNodeWithAdjustedBounds) objArr[i26];
                            SemanticsConfiguration semanticsConfiguration = semanticsNodeWithAdjustedBounds2.getSemanticsNode().unmergedConfig;
                            SemanticsPropertyKey semanticsPropertyKey = SemanticsProperties.PaneTitle;
                            if (semanticsConfiguration.props.containsKey(semanticsPropertyKey) && mutableIntSet2.add(i27)) {
                                sendPaneChangeEvents(i27, 16, (String) semanticsNodeWithAdjustedBounds2.getSemanticsNode().unmergedConfig.get(semanticsPropertyKey));
                            }
                            mutableIntObjectMap.set(i27, new SemanticsNodeCopy(semanticsNodeWithAdjustedBounds2.getSemanticsNode(), getCurrentSemanticsNodes()));
                        }
                        j10 >>= 8;
                    }
                    if (i24 != 8) {
                        break;
                    }
                }
                if (i23 == length3) {
                    break;
                } else {
                    i23++;
                }
            }
        }
        this.previousSemanticsRoot = new SemanticsNodeCopy(this.view.semanticsOwner.getUnmergedRootSemanticsNode(), getCurrentSemanticsNodes());
    }
}
