package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.gestures.AnchoredDraggableDefaults;
import androidx.compose.foundation.gestures.AnchoredDraggableKt;
import androidx.compose.foundation.gestures.AnchoredDraggableState;
import androidx.compose.foundation.gestures.DraggableAnchorsConfig;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.TargetedFlingBehavior;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.foundation.selection.SelectableGroupKt;
import androidx.compose.material3.internal.DraggableAnchorsKt;
import androidx.compose.material3.internal.Strings;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.material3.tokens.NavigationRailBaselineItemTokens;
import androidx.compose.material3.tokens.NavigationRailCollapsedTokens;
import androidx.compose.material3.tokens.NavigationRailExpandedTokens;
import androidx.compose.material3.tokens.NavigationRailHorizontalItemTokens;
import androidx.compose.material3.tokens.NavigationRailVerticalItemTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.TransformOriginKt;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.util.MathHelpersKt;
import androidx.core.app.NotificationCompat;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.UByte$$ExternalSyntheticBackport0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: WideNavigationRail.kt */
@Metadata(d1 = {"\u0000º\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\u001a}\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u0015\b\u0002\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000b¢\u0006\u0002\b\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\u0011\u0010\u0013\u001a\r\u0012\u0004\u0012\u00020\u00010\u000b¢\u0006\u0002\b\fH\u0007¢\u0006\u0002\u0010\u0014\u001as\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u0015\b\u0002\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000b¢\u0006\u0002\b\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u0011\u0010\u0013\u001a\r\u0012\u0004\u0012\u00020\u00010\u000b¢\u0006\u0002\b\fH\u0007¢\u0006\u0002\u0010\u0015\u001au\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00072\u0013\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000b¢\u0006\u0002\b\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0011\u0010\u0013\u001a\r\u0012\u0004\u0012\u00020\u00010\u000b¢\u0006\u0002\b\fH\u0003¢\u0006\u0002\u0010\u001a\u001a§\u0001\u0010\u001b\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u001c\u001a\u00020\u00182\b\b\u0002\u0010\u001d\u001a\u00020\u00072\b\b\u0002\u0010\u001e\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u0015\b\u0002\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000b¢\u0006\u0002\b\f2\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010\u0011\u001a\u00020\u00122\u0011\u0010\u0013\u001a\r\u0012\u0004\u0012\u00020\u00010\u000b¢\u0006\u0002\b\fH\u0007¢\u0006\u0004\b#\u0010$\u001a\u009d\u0001\u0010\u001b\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u001c\u001a\u00020\u00182\b\b\u0002\u0010\u001d\u001a\u00020\u00072\b\b\u0002\u0010\u001e\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u0015\b\u0002\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000b¢\u0006\u0002\b\f2\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010!\u001a\u00020\"2\u0011\u0010\u0013\u001a\r\u0012\u0004\u0012\u00020\u00010\u000b¢\u0006\u0002\b\fH\u0007¢\u0006\u0004\b%\u0010&\u001a\u0093\u0001\u0010'\u001a\u00020\u00012\u0006\u0010(\u001a\u00020\u00182\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b2\u0011\u0010*\u001a\r\u0012\u0004\u0012\u00020\u00010\u000b¢\u0006\u0002\b\f2\u0013\u0010+\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000b¢\u0006\u0002\b\f2\u0006\u0010,\u001a\u00020\u00182\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010-\u001a\u00020\u00182\b\b\u0002\u0010.\u001a\u00020/2\b\b\u0002\u0010\b\u001a\u0002002\n\b\u0002\u00101\u001a\u0004\u0018\u0001022\b\b\u0002\u00103\u001a\u00020\u0012H\u0007¢\u0006\u0004\b4\u00105\u001a\u0089\u0001\u0010'\u001a\u00020\u00012\u0006\u0010(\u001a\u00020\u00182\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b2\u0011\u0010*\u001a\r\u0012\u0004\u0012\u00020\u00010\u000b¢\u0006\u0002\b\f2\u0013\u0010+\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000b¢\u0006\u0002\b\f2\u0006\u0010,\u001a\u00020\u00182\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010-\u001a\u00020\u00182\b\b\u0002\u0010.\u001a\u00020/2\b\b\u0002\u0010\b\u001a\u0002002\n\b\u0002\u00101\u001a\u0004\u0018\u000102H\u0007¢\u0006\u0004\b6\u00107\u001a\u008b\u0001\u0010'\u001a\u00020\u00012\u0006\u0010(\u001a\u00020\u00182\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b2\u0011\u0010*\u001a\r\u0012\u0004\u0012\u00020\u00010\u000b¢\u0006\u0002\b\f2\u0013\u0010+\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000b¢\u0006\u0002\b\f2\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010-\u001a\u00020\u00182\b\b\u0002\u0010,\u001a\u00020\u00182\b\b\u0002\u0010.\u001a\u00020/2\b\b\u0002\u0010\b\u001a\u0002002\n\b\u0002\u00101\u001a\u0004\u0018\u000102H\u0007¢\u0006\u0004\b6\u00108\u001aÉ\u0001\u00109\u001a\u00020\u00012\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010:\u001a\u00020\u00182\u0012\u0010;\u001a\u000e\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020>0<2\u0006\u0010?\u001a\u00020@2\u001c\u0010A\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010C\u0012\u0006\u0012\u0004\u0018\u00010D0B2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010E\u001a\u00020F2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010G\u001a\u00020 2\u0013\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000b¢\u0006\u0002\b\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010H\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0011\u0010\u0013\u001a\r\u0012\u0004\u0012\u00020\u00010\u000b¢\u0006\u0002\b\fH\u0003¢\u0006\u0004\bI\u0010J\u001a\u001c\u0010K\u001a\u00020=*\u00020L2\u0006\u0010M\u001a\u00020=2\u0006\u0010N\u001a\u00020\u0018H\u0002\u001a\u0014\u0010O\u001a\u00020=*\u00020L2\u0006\u0010M\u001a\u00020=H\u0002\"\u0016\u0010P\u001a\u00020 X\u0080\u0004¢\u0006\n\n\u0002\u0010S\u001a\u0004\bQ\u0010R\"\u0016\u0010T\u001a\u00020 X\u0080\u0004¢\u0006\n\n\u0002\u0010S\u001a\u0004\bU\u0010R\"\u0010\u0010V\u001a\u00020 X\u0082\u0004¢\u0006\u0004\n\u0002\u0010S\"\u0010\u0010W\u001a\u00020 X\u0082\u0004¢\u0006\u0004\n\u0002\u0010S\"\u0010\u0010X\u001a\u00020 X\u0082\u0004¢\u0006\u0004\n\u0002\u0010S\"\u0010\u0010Y\u001a\u00020 X\u0082\u0004¢\u0006\u0004\n\u0002\u0010S\"\u0010\u0010Z\u001a\u00020 X\u0082\u0004¢\u0006\u0004\n\u0002\u0010S\"\u0010\u0010[\u001a\u00020 X\u0082\u0004¢\u0006\u0004\n\u0002\u0010S\"\u0010\u0010\\\u001a\u00020 X\u0082\u0004¢\u0006\u0004\n\u0002\u0010S\"\u0010\u0010]\u001a\u00020 X\u0082\u0004¢\u0006\u0004\n\u0002\u0010S\"\u0010\u0010^\u001a\u00020 X\u0082\u0004¢\u0006\u0004\n\u0002\u0010S\"\u0010\u0010_\u001a\u00020 X\u0082\u0004¢\u0006\u0004\n\u0002\u0010S\"\u0010\u0010`\u001a\u00020 X\u0082\u0004¢\u0006\u0004\n\u0002\u0010S\"\u000e\u0010a\u001a\u00020=X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010b\u001a\u00020cX\u0082T¢\u0006\u0002\n\u0000\"\"\u0010d\u001a\b\u0012\u0004\u0012\u00020f0e8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bg\u0010h\u001a\u0004\bi\u0010j\"\"\u0010k\u001a\b\u0012\u0004\u0012\u00020l0e8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bm\u0010h\u001a\u0004\bn\u0010j¨\u0006o²\u0006\n\u0010p\u001a\u00020qX\u008a\u008e\u0002²\u0006\n\u0010r\u001a\u00020qX\u008a\u008e\u0002²\u0006\n\u0010s\u001a\u00020 X\u008a\u0084\u0002²\u0006\n\u0010t\u001a\u00020 X\u008a\u0084\u0002²\u0006\n\u0010u\u001a\u00020 X\u008a\u0084\u0002²\u0006\n\u0010v\u001a\u00020 X\u008a\u0084\u0002"}, d2 = {"WideNavigationRail", "", "modifier", "Landroidx/compose/ui/Modifier;", "state", "Landroidx/compose/material3/WideNavigationRailState;", "shape", "Landroidx/compose/ui/graphics/Shape;", "colors", "Landroidx/compose/material3/WideNavigationRailColors;", WideNavigationRailKt.HeaderLayoutIdTag, "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "windowInsets", "Landroidx/compose/foundation/layout/WindowInsets;", "arrangement", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "content", "(Landroidx/compose/ui/Modifier;Landroidx/compose/material3/WideNavigationRailState;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/WideNavigationRailColors;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "(Landroidx/compose/ui/Modifier;Landroidx/compose/material3/WideNavigationRailState;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/WideNavigationRailColors;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/foundation/layout/Arrangement$Vertical;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "WideNavigationRailLayout", "isModal", "", "expanded", "(Landroidx/compose/ui/Modifier;ZZLandroidx/compose/material3/WideNavigationRailColors;Landroidx/compose/ui/graphics/Shape;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "ModalWideNavigationRail", "hideOnCollapse", "collapsedShape", "expandedShape", "expandedHeaderTopPadding", "Landroidx/compose/ui/unit/Dp;", "expandedProperties", "Landroidx/compose/material3/ModalWideNavigationRailProperties;", "ModalWideNavigationRail-xKBSf-U", "(Landroidx/compose/ui/Modifier;Landroidx/compose/material3/WideNavigationRailState;ZLandroidx/compose/ui/graphics/Shape;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/WideNavigationRailColors;Lkotlin/jvm/functions/Function2;FLandroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/material3/ModalWideNavigationRailProperties;Landroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "ModalWideNavigationRail-k3FuEkE", "(Landroidx/compose/ui/Modifier;Landroidx/compose/material3/WideNavigationRailState;ZLandroidx/compose/ui/graphics/Shape;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/WideNavigationRailColors;Lkotlin/jvm/functions/Function2;FLandroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/material3/ModalWideNavigationRailProperties;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "WideNavigationRailItem", "selected", "onClick", "icon", "label", "railExpanded", "enabled", "iconPosition", "Landroidx/compose/material3/NavigationItemIconPosition;", "Landroidx/compose/material3/NavigationItemColors;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "indicatorPadding", "WideNavigationRailItem-U_vOP4k", "(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/Modifier;ZILandroidx/compose/material3/NavigationItemColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;III)V", "WideNavigationRailItem-pli-t6k", "(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/Modifier;ZILandroidx/compose/material3/NavigationItemColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZZILandroidx/compose/material3/NavigationItemColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "ModalWideNavigationRailContent", "isStandaloneModal", "predictiveBackProgress", "Landroidx/compose/animation/core/Animatable;", "", "Landroidx/compose/animation/core/AnimationVector1D;", "predictiveBackState", "Landroidx/compose/material3/RailPredictiveBackState;", "modalAnimateToDismiss", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "railState", "Landroidx/compose/material3/ModalWideNavigationRailState;", "openModalRailMaxWidth", "gesturesEnabled", "ModalWideNavigationRailContent-_zuB-KE", "(ZZLandroidx/compose/animation/core/Animatable;Landroidx/compose/material3/RailPredictiveBackState;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/ModalWideNavigationRailState;Landroidx/compose/material3/WideNavigationRailColors;Landroidx/compose/ui/graphics/Shape;FLkotlin/jvm/functions/Function2;Landroidx/compose/foundation/layout/WindowInsets;ZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "calculatePredictiveBackScaleX", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", NotificationCompat.CATEGORY_PROGRESS, "swipeEdgeMatchesRail", "calculatePredictiveBackScaleY", "WNRItemNoLabelIndicatorPadding", "getWNRItemNoLabelIndicatorPadding", "()F", "F", "WNRItemHorizontalPadding", "getWNRItemHorizontalPadding", "WNRVerticalPadding", "WNRHeaderPadding", "CollapsedRailWidth", "ExpandedRailMinWidth", "ExpandedRailMaxWidth", "TopIconItemMinHeight", "ItemTopIconIndicatorVerticalPadding", "ItemTopIconIndicatorHorizontalPadding", "ItemStartIconIndicatorVerticalPadding", "PredictiveBackMaxScaleXDistance", "PredictiveBackMaxScaleYDistance", "PredictiveBackPivotFractionY", "HeaderLayoutIdTag", "", "LocalWideNavigationRailOverride", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/material3/WideNavigationRailOverride;", "getLocalWideNavigationRailOverride$annotations", "()V", "getLocalWideNavigationRailOverride", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalModalWideNavigationRailOverride", "Landroidx/compose/material3/ModalWideNavigationRailOverride;", "getLocalModalWideNavigationRailOverride$annotations", "getLocalModalWideNavigationRailOverride", "material3", "currentWidth", "", "actualMaxExpandedWidth", "minWidth", "widthFullRange", "itemVerticalSpacedBy", "itemMinHeight"}, k = 2, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes.dex */
public final class WideNavigationRailKt {
    private static final String HeaderLayoutIdTag = "header";
    private static final float ItemStartIconIndicatorVerticalPadding;
    private static final float ItemTopIconIndicatorHorizontalPadding;
    private static final float ItemTopIconIndicatorVerticalPadding;
    private static final float PredictiveBackPivotFractionY = 0.5f;
    private static final float WNRItemNoLabelIndicatorPadding;
    private static final float WNRItemHorizontalPadding = Dp.m9732constructorimpl(20);
    private static final float WNRVerticalPadding = NavigationRailCollapsedTokens.INSTANCE.m5389getTopSpaceD9Ej5fM();
    private static final float WNRHeaderPadding = NavigationRailBaselineItemTokens.INSTANCE.m5383getHeaderSpaceMinimumD9Ej5fM();
    private static final float CollapsedRailWidth = NavigationRailCollapsedTokens.INSTANCE.m5386getContainerWidthD9Ej5fM();
    private static final float ExpandedRailMinWidth = NavigationRailExpandedTokens.INSTANCE.m5392getContainerWidthMinimumD9Ej5fM();
    private static final float ExpandedRailMaxWidth = NavigationRailExpandedTokens.INSTANCE.m5391getContainerWidthMaximumD9Ej5fM();
    private static final float TopIconItemMinHeight = NavigationRailBaselineItemTokens.INSTANCE.m5381getContainerHeightD9Ej5fM();
    private static final float PredictiveBackMaxScaleXDistance = Dp.m9732constructorimpl(24);
    private static final float PredictiveBackMaxScaleYDistance = Dp.m9732constructorimpl(48);
    private static final ProvidableCompositionLocal<WideNavigationRailOverride> LocalWideNavigationRailOverride = CompositionLocalKt.compositionLocalOf$default(null, new Function0() { // from class: androidx.compose.material3.WideNavigationRailKt$$ExternalSyntheticLambda17
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            WideNavigationRailOverride LocalWideNavigationRailOverride$lambda$0;
            LocalWideNavigationRailOverride$lambda$0 = WideNavigationRailKt.LocalWideNavigationRailOverride$lambda$0();
            return LocalWideNavigationRailOverride$lambda$0;
        }
    }, 1, null);
    private static final ProvidableCompositionLocal<ModalWideNavigationRailOverride> LocalModalWideNavigationRailOverride = CompositionLocalKt.compositionLocalOf$default(null, new Function0() { // from class: androidx.compose.material3.WideNavigationRailKt$$ExternalSyntheticLambda18
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            ModalWideNavigationRailOverride LocalModalWideNavigationRailOverride$lambda$0;
            LocalModalWideNavigationRailOverride$lambda$0 = WideNavigationRailKt.LocalModalWideNavigationRailOverride$lambda$0();
            return LocalModalWideNavigationRailOverride$lambda$0;
        }
    }, 1, null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final float ModalWideNavigationRailContent__zuB_KE$lambda$0$0(float f) {
        return f * 0.5f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ModalWideNavigationRailContent__zuB_KE$lambda$6(boolean z, boolean z2, Animatable animatable, RailPredictiveBackState railPredictiveBackState, Function1 function1, Modifier modifier, ModalWideNavigationRailState modalWideNavigationRailState, WideNavigationRailColors wideNavigationRailColors, Shape shape, float f, Function2 function2, WindowInsets windowInsets, boolean z3, Arrangement.Vertical vertical, PaddingValues paddingValues, Function2 function22, int i, int i2, Composer composer, int i3) {
        m4641ModalWideNavigationRailContent_zuBKE(z, z2, animatable, railPredictiveBackState, function1, modifier, modalWideNavigationRailState, wideNavigationRailColors, shape, f, function2, windowInsets, z3, vertical, paddingValues, function22, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ModalWideNavigationRail_k3FuEkE$lambda$0(Modifier modifier, WideNavigationRailState wideNavigationRailState, boolean z, Shape shape, Shape shape2, WideNavigationRailColors wideNavigationRailColors, Function2 function2, float f, WindowInsets windowInsets, Arrangement.Vertical vertical, ModalWideNavigationRailProperties modalWideNavigationRailProperties, Function2 function22, int i, int i2, int i3, Composer composer, int i4) {
        m4639ModalWideNavigationRailk3FuEkE(modifier, wideNavigationRailState, z, shape, shape2, wideNavigationRailColors, function2, f, windowInsets, vertical, modalWideNavigationRailProperties, function22, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ModalWideNavigationRail_xKBSf_U$lambda$1(Modifier modifier, WideNavigationRailState wideNavigationRailState, boolean z, Shape shape, Shape shape2, WideNavigationRailColors wideNavigationRailColors, Function2 function2, float f, WindowInsets windowInsets, Arrangement.Vertical vertical, ModalWideNavigationRailProperties modalWideNavigationRailProperties, PaddingValues paddingValues, Function2 function22, int i, int i2, int i3, Composer composer, int i4) {
        m4640ModalWideNavigationRailxKBSfU(modifier, wideNavigationRailState, z, shape, shape2, wideNavigationRailColors, function2, f, windowInsets, vertical, modalWideNavigationRailProperties, paddingValues, function22, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WideNavigationRail$lambda$1(Modifier modifier, WideNavigationRailState wideNavigationRailState, Shape shape, WideNavigationRailColors wideNavigationRailColors, Function2 function2, WindowInsets windowInsets, Arrangement.Vertical vertical, PaddingValues paddingValues, Function2 function22, int i, int i2, Composer composer, int i3) {
        WideNavigationRail(modifier, wideNavigationRailState, shape, wideNavigationRailColors, function2, windowInsets, vertical, paddingValues, function22, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WideNavigationRail$lambda$2(Modifier modifier, WideNavigationRailState wideNavigationRailState, Shape shape, WideNavigationRailColors wideNavigationRailColors, Function2 function2, WindowInsets windowInsets, Arrangement.Vertical vertical, Function2 function22, int i, int i2, Composer composer, int i3) {
        WideNavigationRail(modifier, wideNavigationRailState, shape, wideNavigationRailColors, function2, windowInsets, vertical, function22, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WideNavigationRailItem_U_vOP4k$lambda$1(boolean z, Function0 function0, Function2 function2, Function2 function22, boolean z2, Modifier modifier, boolean z3, int i, NavigationItemColors navigationItemColors, MutableInteractionSource mutableInteractionSource, PaddingValues paddingValues, int i2, int i3, int i4, Composer composer, int i5) {
        m4642WideNavigationRailItemU_vOP4k(z, function0, function2, function22, z2, modifier, z3, i, navigationItemColors, mutableInteractionSource, paddingValues, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WideNavigationRailItem_pli_t6k$lambda$0(boolean z, Function0 function0, Function2 function2, Function2 function22, boolean z2, Modifier modifier, boolean z3, int i, NavigationItemColors navigationItemColors, MutableInteractionSource mutableInteractionSource, int i2, int i3, Composer composer, int i4) {
        m4644WideNavigationRailItemplit6k(z, function0, function2, function22, z2, modifier, z3, i, navigationItemColors, mutableInteractionSource, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WideNavigationRailItem_pli_t6k$lambda$1(boolean z, Function0 function0, Function2 function2, Function2 function22, Modifier modifier, boolean z2, boolean z3, int i, NavigationItemColors navigationItemColors, MutableInteractionSource mutableInteractionSource, int i2, int i3, Composer composer, int i4) {
        m4643WideNavigationRailItemplit6k(z, function0, function2, function22, modifier, z2, z3, i, navigationItemColors, mutableInteractionSource, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WideNavigationRailLayout$lambda$11(Modifier modifier, boolean z, boolean z2, WideNavigationRailColors wideNavigationRailColors, Shape shape, Function2 function2, WindowInsets windowInsets, Arrangement.Vertical vertical, PaddingValues paddingValues, Function2 function22, int i, Composer composer, int i2) {
        WideNavigationRailLayout(modifier, z, z2, wideNavigationRailColors, shape, function2, windowInsets, vertical, paddingValues, function22, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void getLocalModalWideNavigationRailOverride$annotations() {
    }

    public static /* synthetic */ void getLocalWideNavigationRailOverride$annotations() {
    }

    /* JADX WARN: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x023d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void WideNavigationRail(Modifier modifier, WideNavigationRailState wideNavigationRailState, Shape shape, WideNavigationRailColors wideNavigationRailColors, Function2<? super Composer, ? super Integer, Unit> function2, WindowInsets windowInsets, Arrangement.Vertical vertical, PaddingValues paddingValues, final Function2<? super Composer, ? super Integer, Unit> function22, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        Shape shape2;
        WideNavigationRailColors wideNavigationRailColors2;
        Function2<? super Composer, ? super Integer, Unit> function23;
        WindowInsets windowInsets2;
        Arrangement.Vertical vertical2;
        int i4;
        PaddingValues paddingValues2;
        Composer composer2;
        final Modifier modifier3;
        final Shape shape3;
        final WideNavigationRailColors wideNavigationRailColors3;
        final Function2<? super Composer, ? super Integer, Unit> function24;
        final WindowInsets windowInsets3;
        final Arrangement.Vertical vertical3;
        final PaddingValues paddingValues3;
        final WideNavigationRailState wideNavigationRailState2;
        ScopeUpdateScope endRestartGroup;
        WideNavigationRailState wideNavigationRailState3;
        WideNavigationRailState wideNavigationRailState4;
        PaddingValues contentPadding;
        Modifier modifier4;
        Shape shape4;
        WideNavigationRailColors wideNavigationRailColors4;
        Function2<? super Composer, ? super Integer, Unit> function25;
        WindowInsets windowInsets4;
        Arrangement.Vertical vertical4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        Composer startRestartGroup = composer.startRestartGroup(-477658179);
        ComposerKt.sourceInformation(startRestartGroup, "C(WideNavigationRail)N(modifier,state,shape,colors,header,windowInsets,arrangement,contentPadding,content)173@8701L7,*185@9117L20:WideNavigationRail.kt#uh7d8r");
        int i10 = i2 & 1;
        if (i10 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                if ((i & 64) == 0 ? startRestartGroup.changed(wideNavigationRailState) : startRestartGroup.changedInstance(wideNavigationRailState)) {
                    i9 = 32;
                    i3 |= i9;
                }
            }
            i9 = 16;
            i3 |= i9;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                shape2 = shape;
                if (startRestartGroup.changed(shape2)) {
                    i8 = 256;
                    i3 |= i8;
                }
            } else {
                shape2 = shape;
            }
            i8 = 128;
            i3 |= i8;
        } else {
            shape2 = shape;
        }
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                wideNavigationRailColors2 = wideNavigationRailColors;
                if (startRestartGroup.changed(wideNavigationRailColors2)) {
                    i7 = 2048;
                    i3 |= i7;
                }
            } else {
                wideNavigationRailColors2 = wideNavigationRailColors;
            }
            i7 = 1024;
            i3 |= i7;
        } else {
            wideNavigationRailColors2 = wideNavigationRailColors;
        }
        int i11 = i2 & 16;
        if (i11 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            function23 = function2;
            i3 |= startRestartGroup.changedInstance(function23) ? 16384 : 8192;
            if ((196608 & i) != 0) {
                if ((i2 & 32) == 0) {
                    windowInsets2 = windowInsets;
                    if (startRestartGroup.changed(windowInsets2)) {
                        i6 = 131072;
                        i3 |= i6;
                    }
                } else {
                    windowInsets2 = windowInsets;
                }
                i6 = 65536;
                i3 |= i6;
            } else {
                windowInsets2 = windowInsets;
            }
            if ((1572864 & i) != 0) {
                if ((i2 & 64) == 0) {
                    vertical2 = vertical;
                    if (startRestartGroup.changed(vertical2)) {
                        i5 = 1048576;
                        i3 |= i5;
                    }
                } else {
                    vertical2 = vertical;
                }
                i5 = 524288;
                i3 |= i5;
            } else {
                vertical2 = vertical;
            }
            i4 = i2 & 128;
            if (i4 == 0) {
                i3 |= 12582912;
            } else if ((12582912 & i) == 0) {
                paddingValues2 = paddingValues;
                i3 |= startRestartGroup.changed(paddingValues2) ? 8388608 : 4194304;
                if ((i & 100663296) == 0) {
                    i3 |= startRestartGroup.changedInstance(function22) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
                }
                if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i3 & 1)) {
                    startRestartGroup.startDefaults();
                    ComposerKt.sourceInformation(startRestartGroup, "164@8176L33,165@8257L5,166@8330L8,168@8446L12");
                    if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                        if (i10 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if ((i2 & 2) != 0) {
                            wideNavigationRailState3 = WideNavigationRailStateKt.rememberWideNavigationRailState(null, startRestartGroup, 0, 1);
                            i3 &= -113;
                        } else {
                            wideNavigationRailState3 = wideNavigationRailState;
                        }
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                            shape2 = WideNavigationRailDefaults.INSTANCE.getShape(startRestartGroup, 6);
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            wideNavigationRailColors2 = WideNavigationRailDefaults.INSTANCE.colors(startRestartGroup, 6);
                        }
                        if (i11 != 0) {
                            function23 = null;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            windowInsets2 = WideNavigationRailDefaults.INSTANCE.getWindowInsets(startRestartGroup, 6);
                        }
                        if ((i2 & 64) != 0) {
                            vertical2 = WideNavigationRailDefaults.INSTANCE.getArrangement();
                            i3 &= -3670017;
                        }
                        if (i4 != 0) {
                            contentPadding = WideNavigationRailDefaults.INSTANCE.getContentPadding();
                            wideNavigationRailState4 = wideNavigationRailState3;
                            modifier4 = modifier2;
                            shape4 = shape2;
                            wideNavigationRailColors4 = wideNavigationRailColors2;
                            function25 = function23;
                            windowInsets4 = windowInsets2;
                            vertical4 = vertical2;
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-477658179, i3, -1, "androidx.compose.material3.WideNavigationRail (WideNavigationRail.kt:172)");
                            }
                            ProvidableCompositionLocal<WideNavigationRailOverride> providableCompositionLocal = LocalWideNavigationRailOverride;
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                            Object consume = startRestartGroup.consume(providableCompositionLocal);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ((WideNavigationRailOverride) consume).WideNavigationRail(new WideNavigationRailOverrideScope(modifier4, wideNavigationRailState4, shape4, wideNavigationRailColors4, function25, windowInsets4, vertical4, contentPadding, function22), startRestartGroup, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            composer2 = startRestartGroup;
                            modifier3 = modifier4;
                            wideNavigationRailState2 = wideNavigationRailState4;
                            shape3 = shape4;
                            wideNavigationRailColors3 = wideNavigationRailColors4;
                            function24 = function25;
                            windowInsets3 = windowInsets4;
                            vertical3 = vertical4;
                            paddingValues3 = contentPadding;
                        } else {
                            wideNavigationRailState4 = wideNavigationRailState3;
                        }
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        if ((i2 & 2) != 0) {
                            i3 &= -113;
                        }
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                        }
                        wideNavigationRailState4 = wideNavigationRailState;
                    }
                    modifier4 = modifier2;
                    shape4 = shape2;
                    wideNavigationRailColors4 = wideNavigationRailColors2;
                    function25 = function23;
                    windowInsets4 = windowInsets2;
                    vertical4 = vertical2;
                    contentPadding = paddingValues2;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    ProvidableCompositionLocal<WideNavigationRailOverride> providableCompositionLocal2 = LocalWideNavigationRailOverride;
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                    Object consume2 = startRestartGroup.consume(providableCompositionLocal2);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ((WideNavigationRailOverride) consume2).WideNavigationRail(new WideNavigationRailOverrideScope(modifier4, wideNavigationRailState4, shape4, wideNavigationRailColors4, function25, windowInsets4, vertical4, contentPadding, function22), startRestartGroup, 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    composer2 = startRestartGroup;
                    modifier3 = modifier4;
                    wideNavigationRailState2 = wideNavigationRailState4;
                    shape3 = shape4;
                    wideNavigationRailColors3 = wideNavigationRailColors4;
                    function24 = function25;
                    windowInsets3 = windowInsets4;
                    vertical3 = vertical4;
                    paddingValues3 = contentPadding;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    composer2 = startRestartGroup;
                    modifier3 = modifier2;
                    shape3 = shape2;
                    wideNavigationRailColors3 = wideNavigationRailColors2;
                    function24 = function23;
                    windowInsets3 = windowInsets2;
                    vertical3 = vertical2;
                    paddingValues3 = paddingValues2;
                    wideNavigationRailState2 = wideNavigationRailState;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.WideNavigationRailKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit WideNavigationRail$lambda$1;
                            WideNavigationRail$lambda$1 = WideNavigationRailKt.WideNavigationRail$lambda$1(Modifier.this, wideNavigationRailState2, shape3, wideNavigationRailColors3, function24, windowInsets3, vertical3, paddingValues3, function22, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            return WideNavigationRail$lambda$1;
                        }
                    });
                    return;
                }
                return;
            }
            paddingValues2 = paddingValues;
            if ((i & 100663296) == 0) {
            }
            if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        function23 = function2;
        if ((196608 & i) != 0) {
        }
        if ((1572864 & i) != 0) {
        }
        i4 = i2 & 128;
        if (i4 == 0) {
        }
        paddingValues2 = paddingValues;
        if ((i & 100663296) == 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Deprecated in favor of function with contentPadding parameter")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void WideNavigationRail(Modifier modifier, WideNavigationRailState wideNavigationRailState, Shape shape, WideNavigationRailColors wideNavigationRailColors, Function2 function2, WindowInsets windowInsets, Arrangement.Vertical vertical, final Function2 function22, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        Shape shape2;
        WideNavigationRailColors wideNavigationRailColors2;
        Function2 function23;
        WindowInsets windowInsets2;
        Arrangement.Vertical vertical2;
        Composer composer2;
        final WideNavigationRailState wideNavigationRailState2;
        final Modifier modifier3;
        final Shape shape3;
        final WideNavigationRailColors wideNavigationRailColors3;
        final Function2 function24;
        final WindowInsets windowInsets3;
        final Arrangement.Vertical vertical3;
        ScopeUpdateScope endRestartGroup;
        WideNavigationRailColors wideNavigationRailColors4;
        Function2 function25;
        WindowInsets windowInsets4;
        Arrangement.Vertical vertical4;
        WideNavigationRailState wideNavigationRailState3;
        Modifier modifier4;
        Shape shape4;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        WideNavigationRailState wideNavigationRailState4 = wideNavigationRailState;
        Composer startRestartGroup = composer.startRestartGroup(164193188);
        ComposerKt.sourceInformation(startRestartGroup, "C(WideNavigationRail)N(modifier,state,shape,colors,header,windowInsets,arrangement,content)236@11698L317:WideNavigationRail.kt#uh7d8r");
        int i9 = i2 & 1;
        if (i9 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                if ((i & 64) == 0 ? startRestartGroup.changed(wideNavigationRailState4) : startRestartGroup.changedInstance(wideNavigationRailState4)) {
                    i8 = 32;
                    i3 |= i8;
                }
            }
            i8 = 16;
            i3 |= i8;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                shape2 = shape;
                if (startRestartGroup.changed(shape2)) {
                    i7 = 256;
                    i3 |= i7;
                }
            } else {
                shape2 = shape;
            }
            i7 = 128;
            i3 |= i7;
        } else {
            shape2 = shape;
        }
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                wideNavigationRailColors2 = wideNavigationRailColors;
                if (startRestartGroup.changed(wideNavigationRailColors2)) {
                    i6 = 2048;
                    i3 |= i6;
                }
            } else {
                wideNavigationRailColors2 = wideNavigationRailColors;
            }
            i6 = 1024;
            i3 |= i6;
        } else {
            wideNavigationRailColors2 = wideNavigationRailColors;
        }
        int i10 = i2 & 16;
        if (i10 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            function23 = function2;
            i3 |= startRestartGroup.changedInstance(function23) ? 16384 : 8192;
            if ((196608 & i) != 0) {
                if ((i2 & 32) == 0) {
                    windowInsets2 = windowInsets;
                    if (startRestartGroup.changed(windowInsets2)) {
                        i5 = 131072;
                        i3 |= i5;
                    }
                } else {
                    windowInsets2 = windowInsets;
                }
                i5 = 65536;
                i3 |= i5;
            } else {
                windowInsets2 = windowInsets;
            }
            if ((1572864 & i) != 0) {
                if ((i2 & 64) == 0) {
                    vertical2 = vertical;
                    if (startRestartGroup.changed(vertical2)) {
                        i4 = 1048576;
                        i3 |= i4;
                    }
                } else {
                    vertical2 = vertical;
                }
                i4 = 524288;
                i3 |= i4;
            } else {
                vertical2 = vertical;
            }
            if ((i & 12582912) == 0) {
                i3 |= startRestartGroup.changedInstance(function22) ? 8388608 : 4194304;
            }
            if (!startRestartGroup.shouldExecute((4793491 & i3) == 4793490, i3 & 1)) {
                startRestartGroup.startDefaults();
                ComposerKt.sourceInformation(startRestartGroup, "228@11289L33,229@11370L5,230@11443L8,232@11559L12");
                if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                    startRestartGroup.skipToGroupEnd();
                    if ((i2 & 2) != 0) {
                        i3 &= -113;
                    }
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                    }
                    wideNavigationRailColors4 = wideNavigationRailColors2;
                    function25 = function23;
                    windowInsets4 = windowInsets2;
                    vertical4 = vertical2;
                    wideNavigationRailState3 = wideNavigationRailState4;
                    modifier4 = modifier2;
                } else {
                    Modifier.Companion companion = i9 != 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 2) != 0) {
                        wideNavigationRailState4 = WideNavigationRailStateKt.rememberWideNavigationRailState(null, startRestartGroup, 0, 1);
                        i3 &= -113;
                    }
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                        shape2 = WideNavigationRailDefaults.INSTANCE.getShape(startRestartGroup, 6);
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        wideNavigationRailColors2 = WideNavigationRailDefaults.INSTANCE.colors(startRestartGroup, 6);
                    }
                    if (i10 != 0) {
                        function23 = null;
                    }
                    if ((i2 & 32) != 0) {
                        windowInsets2 = WideNavigationRailDefaults.INSTANCE.getWindowInsets(startRestartGroup, 6);
                        i3 &= -458753;
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        vertical4 = WideNavigationRailDefaults.INSTANCE.getArrangement();
                        shape4 = shape2;
                        wideNavigationRailColors4 = wideNavigationRailColors2;
                        function25 = function23;
                        windowInsets4 = windowInsets2;
                        wideNavigationRailState3 = wideNavigationRailState4;
                        modifier4 = companion;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(164193188, i3, -1, "androidx.compose.material3.WideNavigationRail (WideNavigationRail.kt:235)");
                        }
                        composer2 = startRestartGroup;
                        WideNavigationRail(modifier4, wideNavigationRailState3, shape4, wideNavigationRailColors4, function25, windowInsets4, vertical4, WideNavigationRailDefaults.INSTANCE.getContentPadding(), function22, composer2, (i3 & 14) | 12582912 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (458752 & i3) | (3670016 & i3) | ((i3 << 3) & 234881024), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier4;
                        wideNavigationRailState2 = wideNavigationRailState3;
                        shape3 = shape4;
                        wideNavigationRailColors3 = wideNavigationRailColors4;
                        function24 = function25;
                        windowInsets3 = windowInsets4;
                        vertical3 = vertical4;
                    } else {
                        wideNavigationRailColors4 = wideNavigationRailColors2;
                        function25 = function23;
                        windowInsets4 = windowInsets2;
                        vertical4 = vertical2;
                        wideNavigationRailState3 = wideNavigationRailState4;
                        modifier4 = companion;
                    }
                }
                shape4 = shape2;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                composer2 = startRestartGroup;
                WideNavigationRail(modifier4, wideNavigationRailState3, shape4, wideNavigationRailColors4, function25, windowInsets4, vertical4, WideNavigationRailDefaults.INSTANCE.getContentPadding(), function22, composer2, (i3 & 14) | 12582912 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (458752 & i3) | (3670016 & i3) | ((i3 << 3) & 234881024), 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier4;
                wideNavigationRailState2 = wideNavigationRailState3;
                shape3 = shape4;
                wideNavigationRailColors3 = wideNavigationRailColors4;
                function24 = function25;
                windowInsets3 = windowInsets4;
                vertical3 = vertical4;
            } else {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
                wideNavigationRailState2 = wideNavigationRailState4;
                modifier3 = modifier2;
                shape3 = shape2;
                wideNavigationRailColors3 = wideNavigationRailColors2;
                function24 = function23;
                windowInsets3 = windowInsets2;
                vertical3 = vertical2;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.WideNavigationRailKt$$ExternalSyntheticLambda15
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit WideNavigationRail$lambda$2;
                        WideNavigationRail$lambda$2 = WideNavigationRailKt.WideNavigationRail$lambda$2(Modifier.this, wideNavigationRailState2, shape3, wideNavigationRailColors3, function24, windowInsets3, vertical3, function22, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        return WideNavigationRail$lambda$2;
                    }
                });
                return;
            }
            return;
        }
        function23 = function2;
        if ((196608 & i) != 0) {
        }
        if ((1572864 & i) != 0) {
        }
        if ((i & 12582912) == 0) {
        }
        if (!startRestartGroup.shouldExecute((4793491 & i3) == 4793490, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void WideNavigationRailLayout(final Modifier modifier, final boolean z, final boolean z2, final WideNavigationRailColors wideNavigationRailColors, final Shape shape, final Function2<? super Composer, ? super Integer, Unit> function2, final WindowInsets windowInsets, final Arrangement.Vertical vertical, final PaddingValues paddingValues, final Function2<? super Composer, ? super Integer, Unit> function22, Composer composer, final int i) {
        int i2;
        WideNavigationRailColors wideNavigationRailColors2;
        float m9746unboximpl;
        float m9732constructorimpl;
        Composer startRestartGroup = composer.startRestartGroup(-1072361515);
        ComposerKt.sourceInformation(startRestartGroup, "C(WideNavigationRailLayout)N(modifier,isModal,expanded,colors,shape,header,windowInsets,arrangement,contentPadding,content)286@13181L33,287@13249L33,289@13358L7,296@13624L11,297@13699L11,299@13739L195,304@13969L195,309@14205L170,314@14409L154,324@14809L9112,319@14569L9352:WideNavigationRail.kt#uh7d8r");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(z2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            wideNavigationRailColors2 = wideNavigationRailColors;
            i2 |= startRestartGroup.changed(wideNavigationRailColors2) ? 2048 : 1024;
        } else {
            wideNavigationRailColors2 = wideNavigationRailColors;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changed(shape) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(function2) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= startRestartGroup.changed(windowInsets) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i2 |= startRestartGroup.changed(vertical) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= startRestartGroup.changed(paddingValues) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
        }
        if ((805306368 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(function22) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
        }
        if (!startRestartGroup.shouldExecute((306783379 & i2) != 306783378, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1072361515, i2, -1, "androidx.compose.material3.WideNavigationRailLayout (WideNavigationRail.kt:285)");
            }
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 252746838, "CC(remember):WideNavigationRail.kt#9igjgp");
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = SnapshotIntStateKt.mutableIntStateOf(0);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final MutableIntState mutableIntState = (MutableIntState) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 252749014, "CC(remember):WideNavigationRail.kt#9igjgp");
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = SnapshotIntStateKt.mutableIntStateOf(0);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            final MutableIntState mutableIntState2 = (MutableIntState) rememberedValue2;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ProvidableCompositionLocal<Dp> localMinimumInteractiveComponentSize = InteractiveComponentSizeKt.getLocalMinimumInteractiveComponentSize();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(localMinimumInteractiveComponentSize);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            if (Dp.m9737equalsimpl0(((Dp) consume).m9746unboximpl(), Dp.INSTANCE.m9752getUnspecifiedD9Ej5fM())) {
                startRestartGroup.startReplaceGroup(-754580399);
                startRestartGroup.endReplaceGroup();
                m9746unboximpl = Dp.m9732constructorimpl(0);
            } else {
                startRestartGroup.startReplaceGroup(-754545431);
                ComposerKt.sourceInformation(startRestartGroup, "292@13470L7");
                ProvidableCompositionLocal<Dp> localMinimumInteractiveComponentSize2 = InteractiveComponentSizeKt.getLocalMinimumInteractiveComponentSize();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                Object consume2 = startRestartGroup.consume(localMinimumInteractiveComponentSize2);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                m9746unboximpl = ((Dp) consume2).m9746unboximpl();
                startRestartGroup.endReplaceGroup();
            }
            final float f = m9746unboximpl;
            FiniteAnimationSpec value = MotionSchemeKt.value(MotionSchemeKeyTokens.DefaultSpatial, startRestartGroup, 6);
            FiniteAnimationSpec value2 = MotionSchemeKt.value(MotionSchemeKeyTokens.FastSpatial, startRestartGroup, 6);
            final State<Dp> m227animateDpAsStateAjpBEmI = AnimateAsStateKt.m227animateDpAsStateAjpBEmI(!z2 ? CollapsedRailWidth : ExpandedRailMinWidth, !z ? value : value2, null, null, startRestartGroup, 0, 12);
            float f2 = !z2 ? CollapsedRailWidth : ExpandedRailMaxWidth;
            if (!z) {
                value2 = value;
            }
            final State<Dp> m227animateDpAsStateAjpBEmI2 = AnimateAsStateKt.m227animateDpAsStateAjpBEmI(f2, value2, null, null, startRestartGroup, 0, 12);
            if (!z2) {
                m9732constructorimpl = NavigationRailCollapsedTokens.INSTANCE.m5387getItemVerticalSpaceD9Ej5fM();
            } else {
                m9732constructorimpl = Dp.m9732constructorimpl(0);
            }
            FiniteAnimationSpec finiteAnimationSpec = value;
            final State<Dp> m227animateDpAsStateAjpBEmI3 = AnimateAsStateKt.m227animateDpAsStateAjpBEmI(m9732constructorimpl, finiteAnimationSpec, null, null, startRestartGroup, 0, 12);
            final State<Dp> m227animateDpAsStateAjpBEmI4 = AnimateAsStateKt.m227animateDpAsStateAjpBEmI(!z2 ? TopIconItemMinHeight : f, finiteAnimationSpec, null, null, startRestartGroup, 0, 12);
            int i3 = i2;
            SurfaceKt.m4112SurfaceT9BRK9s(modifier, shape, !z ? wideNavigationRailColors2.getContainerColor() : wideNavigationRailColors2.getModalContainerColor(), !z ? wideNavigationRailColors2.getContentColor() : wideNavigationRailColors2.getModalContentColor(), 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(512862384, true, new Function2() { // from class: androidx.compose.material3.WideNavigationRailKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit WideNavigationRailLayout$lambda$10;
                    WideNavigationRailLayout$lambda$10 = WideNavigationRailKt.WideNavigationRailLayout$lambda$10(WindowInsets.this, paddingValues, function2, z2, f, m227animateDpAsStateAjpBEmI, m227animateDpAsStateAjpBEmI4, m227animateDpAsStateAjpBEmI2, mutableIntState2, mutableIntState, vertical, m227animateDpAsStateAjpBEmI3, function22, (Composer) obj, ((Integer) obj2).intValue());
                    return WideNavigationRailLayout$lambda$10;
                }
            }, startRestartGroup, 54), startRestartGroup, (i3 & 14) | 12582912 | ((i3 >> 9) & 112), 112);
            startRestartGroup = startRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.WideNavigationRailKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit WideNavigationRailLayout$lambda$11;
                    WideNavigationRailLayout$lambda$11 = WideNavigationRailKt.WideNavigationRailLayout$lambda$11(Modifier.this, z, z2, wideNavigationRailColors, shape, function2, windowInsets, vertical, paddingValues, function22, i, (Composer) obj, ((Integer) obj2).intValue());
                    return WideNavigationRailLayout$lambda$11;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int WideNavigationRailLayout$lambda$1(MutableIntState mutableIntState) {
        return mutableIntState.getIntValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int WideNavigationRailLayout$lambda$4(MutableIntState mutableIntState) {
        return mutableIntState.getIntValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WideNavigationRailLayout$lambda$10$0$0(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setTraversalGroup(semanticsPropertyReceiver, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WideNavigationRailLayout$lambda$10(WindowInsets windowInsets, PaddingValues paddingValues, Function2 function2, boolean z, float f, State state, State state2, State state3, MutableIntState mutableIntState, MutableIntState mutableIntState2, Arrangement.Vertical vertical, State state4, Function2 function22, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C332@15118L27,325@14819L9096:WideNavigationRail.kt#uh7d8r");
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(512862384, i, -1, "androidx.compose.material3.WideNavigationRailLayout.<anonymous> (WideNavigationRail.kt:325)");
            }
            Modifier selectableGroup = SelectableGroupKt.selectableGroup(PaddingKt.padding(SizeKt.m1278widthInVpY3zN4$default(WindowInsetsPaddingKt.windowInsetsPadding(SizeKt.fillMaxHeight$default(Modifier.INSTANCE, 0.0f, 1, null), windowInsets), 0.0f, ExpandedRailMaxWidth, 1, null), paddingValues));
            ComposerKt.sourceInformationMarkerStart(composer, -1060478101, "CC(remember):WideNavigationRail.kt#9igjgp");
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function1() { // from class: androidx.compose.material3.WideNavigationRailKt$$ExternalSyntheticLambda14
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit WideNavigationRailLayout$lambda$10$0$0;
                        WideNavigationRailLayout$lambda$10$0$0 = WideNavigationRailKt.WideNavigationRailLayout$lambda$10$0$0((SemanticsPropertyReceiver) obj);
                        return WideNavigationRailLayout$lambda$10$0$0;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            Modifier semantics$default = SemanticsModifierKt.semantics$default(selectableGroup, false, (Function1) rememberedValue, 1, null);
            WideNavigationRailKt$WideNavigationRailLayout$1$2 wideNavigationRailKt$WideNavigationRailLayout$1$2 = new WideNavigationRailKt$WideNavigationRailLayout$1$2(function2, z, f, state, state2, state3, mutableIntState, mutableIntState2, vertical, state4);
            ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
            int m = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, semantics$default);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)410@16187L9:Composables.kt#9igjgp");
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer m5864constructorimpl = Updater.m5864constructorimpl(composer);
            Updater.m5872setimpl(m5864constructorimpl, wideNavigationRailKt$WideNavigationRailLayout$1$2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m5872setimpl(m5864constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m5872setimpl(m5864constructorimpl, Integer.valueOf(m), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m5870reconcileimpl(m5864constructorimpl, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m5872setimpl(m5864constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, 1497277246, "C337@15318L9:WideNavigationRail.kt#uh7d8r");
            if (function2 != null) {
                composer.startReplaceGroup(1497295659);
                ComposerKt.sourceInformation(composer, "335@15229L54");
                Modifier layoutId = LayoutIdKt.layoutId(Modifier.INSTANCE, HeaderLayoutIdTag);
                ComposerKt.sourceInformationMarkerStart(composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
                int m2 = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
                CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer, layoutId);
                Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)410@16187L9:Composables.kt#9igjgp");
                if (!(composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor2);
                } else {
                    composer.useNode();
                }
                Composer m5864constructorimpl2 = Updater.m5864constructorimpl(composer);
                Updater.m5872setimpl(m5864constructorimpl2, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m5872setimpl(m5864constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Updater.m5872setimpl(m5864constructorimpl2, Integer.valueOf(m2), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                Updater.m5870reconcileimpl(m5864constructorimpl2, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                Updater.m5872setimpl(m5864constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composer, 1068739171, "C335@15273L8:WideNavigationRail.kt#uh7d8r");
                function2.invoke(composer, 0);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                composer.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(1497385993);
                composer.endReplaceGroup();
            }
            function22.invoke(composer, 0);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:121:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01b9  */
    /* renamed from: ModalWideNavigationRail-xKBSf-U, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m4640ModalWideNavigationRailxKBSfU(Modifier modifier, WideNavigationRailState wideNavigationRailState, boolean z, Shape shape, Shape shape2, WideNavigationRailColors wideNavigationRailColors, Function2<? super Composer, ? super Integer, Unit> function2, float f, WindowInsets windowInsets, Arrangement.Vertical vertical, ModalWideNavigationRailProperties modalWideNavigationRailProperties, PaddingValues paddingValues, final Function2<? super Composer, ? super Integer, Unit> function22, Composer composer, final int i, final int i2, final int i3) {
        Modifier modifier2;
        int i4;
        Shape shape3;
        Shape shape4;
        WideNavigationRailColors wideNavigationRailColors2;
        int i5;
        Function2<? super Composer, ? super Integer, Unit> function23;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        final WideNavigationRailState wideNavigationRailState2;
        final float f2;
        final WindowInsets windowInsets2;
        Composer composer2;
        final Shape shape5;
        final Shape shape6;
        final WideNavigationRailColors wideNavigationRailColors3;
        Function2<? super Composer, ? super Integer, Unit> function24;
        final boolean z2;
        final Arrangement.Vertical vertical2;
        final ModalWideNavigationRailProperties modalWideNavigationRailProperties2;
        final PaddingValues paddingValues2;
        ScopeUpdateScope endRestartGroup;
        WideNavigationRailState wideNavigationRailState3;
        Shape shape7;
        WideNavigationRailColors wideNavigationRailColors4;
        WindowInsets windowInsets3;
        Arrangement.Vertical vertical3;
        PaddingValues paddingValues3;
        Modifier modifier3;
        boolean z3;
        WideNavigationRailState wideNavigationRailState4;
        Shape shape8;
        WindowInsets windowInsets4;
        Shape shape9;
        WideNavigationRailColors wideNavigationRailColors5;
        float f3;
        Arrangement.Vertical vertical4;
        ModalWideNavigationRailProperties modalWideNavigationRailProperties3;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        Composer startRestartGroup = composer.startRestartGroup(-94259026);
        ComposerKt.sourceInformation(startRestartGroup, "C(ModalWideNavigationRail)N(modifier,state,hideOnCollapse,collapsedShape,expandedShape,colors,header,expandedHeaderTopPadding:c#ui.unit.Dp,windowInsets,arrangement,expandedProperties,contentPadding,content)570@28316L7,*570@28333L25:WideNavigationRail.kt#uh7d8r");
        int i18 = i3 & 1;
        if (i18 != 0) {
            i4 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i4 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i4 = i;
        }
        if ((i & 48) == 0) {
            if ((i3 & 2) == 0) {
                if ((i & 64) == 0 ? startRestartGroup.changed(wideNavigationRailState) : startRestartGroup.changedInstance(wideNavigationRailState)) {
                    i17 = 32;
                    i4 |= i17;
                }
            }
            i17 = 16;
            i4 |= i17;
        }
        int i19 = i3 & 4;
        if (i19 != 0) {
            i4 |= 384;
        } else if ((i & 384) == 0) {
            i4 |= startRestartGroup.changed(z) ? 256 : 128;
            if ((i & 3072) != 0) {
                if ((i3 & 8) == 0) {
                    shape3 = shape;
                    if (startRestartGroup.changed(shape3)) {
                        i16 = 2048;
                        i4 |= i16;
                    }
                } else {
                    shape3 = shape;
                }
                i16 = 1024;
                i4 |= i16;
            } else {
                shape3 = shape;
            }
            if ((i & 24576) != 0) {
                if ((i3 & 16) == 0) {
                    shape4 = shape2;
                    if (startRestartGroup.changed(shape4)) {
                        i15 = 16384;
                        i4 |= i15;
                    }
                } else {
                    shape4 = shape2;
                }
                i15 = 8192;
                i4 |= i15;
            } else {
                shape4 = shape2;
            }
            if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) {
                wideNavigationRailColors2 = wideNavigationRailColors;
                i4 |= ((i3 & 32) == 0 && startRestartGroup.changed(wideNavigationRailColors2)) ? 131072 : 65536;
            } else {
                wideNavigationRailColors2 = wideNavigationRailColors;
            }
            i5 = i3 & 64;
            if (i5 == 0) {
                i4 |= 1572864;
                function23 = function2;
            } else {
                function23 = function2;
                if ((i & 1572864) == 0) {
                    i4 |= startRestartGroup.changedInstance(function23) ? 1048576 : 524288;
                }
            }
            i6 = i3 & 128;
            if (i6 == 0) {
                i4 |= 12582912;
            } else if ((i & 12582912) == 0) {
                i4 |= startRestartGroup.changed(f) ? 8388608 : 4194304;
            }
            if ((i & 100663296) == 0) {
                if ((i3 & 256) == 0 && startRestartGroup.changed(windowInsets)) {
                    i14 = 67108864;
                    i4 |= i14;
                }
                i14 = GroupFlagsKt.HasAuxSlotFlag;
                i4 |= i14;
            }
            if ((i & 805306368) == 0) {
                if ((i3 & 512) == 0 && startRestartGroup.changed(vertical)) {
                    i13 = GroupFlagsKt.HasMovableContentFlag;
                    i4 |= i13;
                }
                i13 = GroupFlagsKt.IsMovableContentFlag;
                i4 |= i13;
            }
            i7 = i3 & 1024;
            if (i7 == 0) {
                i9 = i2 | 6;
                i8 = i7;
            } else if ((i2 & 6) == 0) {
                i8 = i7;
                i9 = i2 | (startRestartGroup.changed(modalWideNavigationRailProperties) ? 4 : 2);
            } else {
                i8 = i7;
                i9 = i2;
            }
            i10 = i3 & 2048;
            if (i10 == 0) {
                i9 |= 48;
            } else if ((i2 & 48) == 0) {
                i11 = i10;
                i9 |= startRestartGroup.changed(paddingValues) ? 32 : 16;
                if ((i2 & 384) == 0) {
                    i9 |= startRestartGroup.changedInstance(function22) ? 256 : 128;
                }
                i12 = i9;
                if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i12 & 147) != 146, i4 & 1)) {
                    startRestartGroup.startDefaults();
                    ComposerKt.sourceInformation(startRestartGroup, "540@26888L33,542@27015L19,543@27090L18,544@27176L8,547@27333L12");
                    if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                        startRestartGroup.skipToGroupEnd();
                        if ((i3 & 2) != 0) {
                            i4 &= -113;
                        }
                        if ((i3 & 8) != 0) {
                            i4 &= -7169;
                        }
                        if ((i3 & 16) != 0) {
                            i4 &= -57345;
                        }
                        if ((i3 & 32) != 0) {
                            i4 &= -458753;
                        }
                        if ((i3 & 256) != 0) {
                            i4 &= -234881025;
                        }
                        if ((i3 & 512) != 0) {
                            i4 &= -1879048193;
                        }
                        wideNavigationRailState4 = wideNavigationRailState;
                        z3 = z;
                        f3 = f;
                        windowInsets4 = windowInsets;
                        vertical4 = vertical;
                        modalWideNavigationRailProperties3 = modalWideNavigationRailProperties;
                        paddingValues3 = paddingValues;
                        shape8 = shape3;
                        modifier3 = modifier2;
                        shape9 = shape4;
                        wideNavigationRailColors5 = wideNavigationRailColors2;
                        function24 = function23;
                    } else {
                        Modifier.Companion companion = i18 != 0 ? Modifier.INSTANCE : modifier2;
                        if ((i3 & 2) != 0) {
                            wideNavigationRailState3 = WideNavigationRailStateKt.rememberWideNavigationRailState(null, startRestartGroup, 0, 1);
                            i4 &= -113;
                        } else {
                            wideNavigationRailState3 = wideNavigationRailState;
                        }
                        boolean z4 = i19 != 0 ? false : z;
                        if ((i3 & 8) != 0) {
                            shape3 = WideNavigationRailDefaults.INSTANCE.getModalCollapsedShape(startRestartGroup, 6);
                            i4 &= -7169;
                        }
                        if ((i3 & 16) != 0) {
                            shape7 = WideNavigationRailDefaults.INSTANCE.getModalExpandedShape(startRestartGroup, 6);
                            i4 &= -57345;
                        } else {
                            shape7 = shape4;
                        }
                        if ((i3 & 32) != 0) {
                            wideNavigationRailColors4 = WideNavigationRailDefaults.INSTANCE.colors(startRestartGroup, 6);
                            i4 &= -458753;
                        } else {
                            wideNavigationRailColors4 = wideNavigationRailColors2;
                        }
                        if (i5 != 0) {
                            function23 = null;
                        }
                        float m9732constructorimpl = i6 != 0 ? Dp.m9732constructorimpl(0) : f;
                        if ((i3 & 256) != 0) {
                            windowInsets3 = WideNavigationRailDefaults.INSTANCE.getWindowInsets(startRestartGroup, 6);
                            i4 &= -234881025;
                        } else {
                            windowInsets3 = windowInsets;
                        }
                        if ((i3 & 512) != 0) {
                            vertical3 = WideNavigationRailDefaults.INSTANCE.getArrangement();
                            i4 &= -1879048193;
                        } else {
                            vertical3 = vertical;
                        }
                        ModalWideNavigationRailProperties modalExpandedProperties = i8 != 0 ? WideNavigationRailDefaults.INSTANCE.getModalExpandedProperties() : modalWideNavigationRailProperties;
                        if (i11 != 0) {
                            modifier3 = companion;
                            z3 = z4;
                            wideNavigationRailState4 = wideNavigationRailState3;
                            shape8 = shape3;
                            windowInsets4 = windowInsets3;
                            shape9 = shape7;
                            wideNavigationRailColors5 = wideNavigationRailColors4;
                            f3 = m9732constructorimpl;
                            function24 = function23;
                            vertical4 = vertical3;
                            modalWideNavigationRailProperties3 = modalExpandedProperties;
                            paddingValues3 = WideNavigationRailDefaults.INSTANCE.getContentPadding();
                        } else {
                            paddingValues3 = paddingValues;
                            modifier3 = companion;
                            z3 = z4;
                            wideNavigationRailState4 = wideNavigationRailState3;
                            shape8 = shape3;
                            windowInsets4 = windowInsets3;
                            shape9 = shape7;
                            wideNavigationRailColors5 = wideNavigationRailColors4;
                            f3 = m9732constructorimpl;
                            function24 = function23;
                            vertical4 = vertical3;
                            modalWideNavigationRailProperties3 = modalExpandedProperties;
                        }
                    }
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-94259026, i4, i12, "androidx.compose.material3.ModalWideNavigationRail (WideNavigationRail.kt:553)");
                    }
                    ModalWideNavigationRailOverrideScope modalWideNavigationRailOverrideScope = new ModalWideNavigationRailOverrideScope(modifier3, wideNavigationRailState4, z3, shape8, shape9, wideNavigationRailColors5, function24, f3, windowInsets4, vertical4, modalWideNavigationRailProperties3, paddingValues3, function22, null);
                    ProvidableCompositionLocal<ModalWideNavigationRailOverride> providableCompositionLocal = LocalModalWideNavigationRailOverride;
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                    Object consume = startRestartGroup.consume(providableCompositionLocal);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ((ModalWideNavigationRailOverride) consume).ModalWideNavigationRail(modalWideNavigationRailOverrideScope, startRestartGroup, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2 = startRestartGroup;
                    modifier2 = modifier3;
                    wideNavigationRailState2 = wideNavigationRailState4;
                    z2 = z3;
                    shape5 = shape8;
                    shape6 = shape9;
                    wideNavigationRailColors3 = wideNavigationRailColors5;
                    f2 = f3;
                    windowInsets2 = windowInsets4;
                    vertical2 = vertical4;
                    modalWideNavigationRailProperties2 = modalWideNavigationRailProperties3;
                    paddingValues2 = paddingValues3;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    wideNavigationRailState2 = wideNavigationRailState;
                    f2 = f;
                    windowInsets2 = windowInsets;
                    composer2 = startRestartGroup;
                    shape5 = shape3;
                    shape6 = shape4;
                    wideNavigationRailColors3 = wideNavigationRailColors2;
                    function24 = function23;
                    z2 = z;
                    vertical2 = vertical;
                    modalWideNavigationRailProperties2 = modalWideNavigationRailProperties;
                    paddingValues2 = paddingValues;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                    final Modifier modifier4 = modifier2;
                    final Function2<? super Composer, ? super Integer, Unit> function25 = function24;
                    endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.WideNavigationRailKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit ModalWideNavigationRail_xKBSf_U$lambda$1;
                            ModalWideNavigationRail_xKBSf_U$lambda$1 = WideNavigationRailKt.ModalWideNavigationRail_xKBSf_U$lambda$1(Modifier.this, wideNavigationRailState2, z2, shape5, shape6, wideNavigationRailColors3, function25, f2, windowInsets2, vertical2, modalWideNavigationRailProperties2, paddingValues2, function22, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                            return ModalWideNavigationRail_xKBSf_U$lambda$1;
                        }
                    });
                    return;
                }
                return;
            }
            i11 = i10;
            if ((i2 & 384) == 0) {
            }
            i12 = i9;
            if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i12 & 147) != 146, i4 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        if ((i & 3072) != 0) {
        }
        if ((i & 24576) != 0) {
        }
        if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) {
        }
        i5 = i3 & 64;
        if (i5 == 0) {
        }
        i6 = i3 & 128;
        if (i6 == 0) {
        }
        if ((i & 100663296) == 0) {
        }
        if ((i & 805306368) == 0) {
        }
        i7 = i3 & 1024;
        if (i7 == 0) {
        }
        i10 = i3 & 2048;
        if (i10 == 0) {
        }
        i11 = i10;
        if ((i2 & 384) == 0) {
        }
        i12 = i9;
        if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i12 & 147) != 146, i4 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0191  */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Deprecated in favor of function with contentPadding parameter")
    /* renamed from: ModalWideNavigationRail-k3FuEkE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void m4639ModalWideNavigationRailk3FuEkE(Modifier modifier, WideNavigationRailState wideNavigationRailState, boolean z, Shape shape, Shape shape2, WideNavigationRailColors wideNavigationRailColors, Function2 function2, float f, WindowInsets windowInsets, Arrangement.Vertical vertical, ModalWideNavigationRailProperties modalWideNavigationRailProperties, final Function2 function22, Composer composer, final int i, final int i2, final int i3) {
        Modifier modifier2;
        int i4;
        boolean z2;
        Shape shape3;
        Shape shape4;
        int i5;
        Function2 function23;
        int i6;
        float f2;
        int i7;
        int i8;
        int i9;
        int i10;
        Composer composer2;
        final WideNavigationRailState wideNavigationRailState2;
        final WindowInsets windowInsets2;
        final Function2 function24;
        final Modifier modifier3;
        final float f3;
        final boolean z3;
        final Shape shape5;
        final Shape shape6;
        final WideNavigationRailColors wideNavigationRailColors2;
        final Arrangement.Vertical vertical2;
        final ModalWideNavigationRailProperties modalWideNavigationRailProperties2;
        ScopeUpdateScope endRestartGroup;
        WideNavigationRailState wideNavigationRailState3;
        Shape shape7;
        Shape shape8;
        WideNavigationRailColors wideNavigationRailColors3;
        WindowInsets windowInsets3;
        Arrangement.Vertical vertical3;
        ModalWideNavigationRailProperties modalWideNavigationRailProperties3;
        Modifier modifier4;
        Function2 function25;
        WideNavigationRailState wideNavigationRailState4;
        float f4;
        Shape shape9;
        WindowInsets windowInsets4;
        Arrangement.Vertical vertical4;
        boolean z4;
        Shape shape10;
        WideNavigationRailColors wideNavigationRailColors4;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        Composer startRestartGroup = composer.startRestartGroup(-38559147);
        ComposerKt.sourceInformation(startRestartGroup, "C(ModalWideNavigationRail)N(modifier,state,hideOnCollapse,collapsedShape,expandedShape,colors,header,expandedHeaderTopPadding:c#ui.unit.Dp,windowInsets,arrangement,expandedProperties,content)628@31609L530:WideNavigationRail.kt#uh7d8r");
        int i16 = i3 & 1;
        if (i16 != 0) {
            i4 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i4 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i4 = i;
        }
        if ((i & 48) == 0) {
            if ((i3 & 2) == 0) {
                if ((i & 64) == 0 ? startRestartGroup.changed(wideNavigationRailState) : startRestartGroup.changedInstance(wideNavigationRailState)) {
                    i15 = 32;
                    i4 |= i15;
                }
            }
            i15 = 16;
            i4 |= i15;
        }
        int i17 = i3 & 4;
        if (i17 != 0) {
            i4 |= 384;
        } else if ((i & 384) == 0) {
            z2 = z;
            i4 |= startRestartGroup.changed(z2) ? 256 : 128;
            if ((i & 3072) != 0) {
                if ((i3 & 8) == 0) {
                    shape3 = shape;
                    if (startRestartGroup.changed(shape3)) {
                        i14 = 2048;
                        i4 |= i14;
                    }
                } else {
                    shape3 = shape;
                }
                i14 = 1024;
                i4 |= i14;
            } else {
                shape3 = shape;
            }
            if ((i & 24576) != 0) {
                if ((i3 & 16) == 0) {
                    shape4 = shape2;
                    if (startRestartGroup.changed(shape4)) {
                        i13 = 16384;
                        i4 |= i13;
                    }
                } else {
                    shape4 = shape2;
                }
                i13 = 8192;
                i4 |= i13;
            } else {
                shape4 = shape2;
            }
            if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                i4 |= ((i3 & 32) == 0 && startRestartGroup.changed(wideNavigationRailColors)) ? 131072 : 65536;
            }
            i5 = i3 & 64;
            if (i5 == 0) {
                i4 |= 1572864;
                function23 = function2;
            } else {
                function23 = function2;
                if ((i & 1572864) == 0) {
                    i4 |= startRestartGroup.changedInstance(function23) ? 1048576 : 524288;
                }
            }
            i6 = i3 & 128;
            if (i6 == 0) {
                i4 |= 12582912;
                f2 = f;
            } else {
                f2 = f;
                if ((i & 12582912) == 0) {
                    i4 |= startRestartGroup.changed(f2) ? 8388608 : 4194304;
                }
            }
            if ((i & 100663296) == 0) {
                if ((i3 & 256) == 0 && startRestartGroup.changed(windowInsets)) {
                    i12 = 67108864;
                    i4 |= i12;
                }
                i12 = GroupFlagsKt.HasAuxSlotFlag;
                i4 |= i12;
            }
            if ((i & 805306368) == 0) {
                if ((i3 & 512) == 0 && startRestartGroup.changed(vertical)) {
                    i11 = GroupFlagsKt.HasMovableContentFlag;
                    i4 |= i11;
                }
                i11 = GroupFlagsKt.IsMovableContentFlag;
                i4 |= i11;
            }
            i7 = i3 & 1024;
            if (i7 == 0) {
                i9 = i2 | 6;
                i8 = i7;
            } else if ((i2 & 6) == 0) {
                i8 = i7;
                i9 = i2 | (startRestartGroup.changed(modalWideNavigationRailProperties) ? 4 : 2);
            } else {
                i8 = i7;
                i9 = i2;
            }
            if ((i2 & 48) == 0) {
                i9 |= startRestartGroup.changedInstance(function22) ? 32 : 16;
            }
            i10 = i9;
            if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i10 & 19) != 18, i4 & 1)) {
                startRestartGroup.startDefaults();
                ComposerKt.sourceInformation(startRestartGroup, "615@30905L33,617@31032L19,618@31107L18,619@31193L8,622@31350L12");
                if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                    startRestartGroup.skipToGroupEnd();
                    if ((i3 & 2) != 0) {
                        i4 &= -113;
                    }
                    if ((i3 & 8) != 0) {
                        i4 &= -7169;
                    }
                    if ((i3 & 16) != 0) {
                        i4 &= -57345;
                    }
                    if ((i3 & 32) != 0) {
                        i4 &= -458753;
                    }
                    if ((i3 & 256) != 0) {
                        i4 &= -234881025;
                    }
                    if ((i3 & 512) != 0) {
                        i4 &= -1879048193;
                    }
                    wideNavigationRailState4 = wideNavigationRailState;
                    wideNavigationRailColors4 = wideNavigationRailColors;
                    windowInsets4 = windowInsets;
                    vertical4 = vertical;
                    modalWideNavigationRailProperties3 = modalWideNavigationRailProperties;
                    function25 = function23;
                    modifier4 = modifier2;
                    f4 = f2;
                    z4 = z2;
                    shape9 = shape3;
                    shape10 = shape4;
                } else {
                    Modifier.Companion companion = i16 != 0 ? Modifier.INSTANCE : modifier2;
                    if ((i3 & 2) != 0) {
                        wideNavigationRailState3 = WideNavigationRailStateKt.rememberWideNavigationRailState(null, startRestartGroup, 0, 1);
                        i4 &= -113;
                    } else {
                        wideNavigationRailState3 = wideNavigationRailState;
                    }
                    if (i17 != 0) {
                        z2 = false;
                    }
                    if ((i3 & 8) != 0) {
                        shape7 = WideNavigationRailDefaults.INSTANCE.getModalCollapsedShape(startRestartGroup, 6);
                        i4 &= -7169;
                    } else {
                        shape7 = shape3;
                    }
                    if ((i3 & 16) != 0) {
                        shape8 = WideNavigationRailDefaults.INSTANCE.getModalExpandedShape(startRestartGroup, 6);
                        i4 &= -57345;
                    } else {
                        shape8 = shape4;
                    }
                    if ((i3 & 32) != 0) {
                        wideNavigationRailColors3 = WideNavigationRailDefaults.INSTANCE.colors(startRestartGroup, 6);
                        i4 &= -458753;
                    } else {
                        wideNavigationRailColors3 = wideNavigationRailColors;
                    }
                    Function2 function26 = i5 == 0 ? function23 : null;
                    float m9732constructorimpl = i6 != 0 ? Dp.m9732constructorimpl(0) : f2;
                    if ((i3 & 256) != 0) {
                        windowInsets3 = WideNavigationRailDefaults.INSTANCE.getWindowInsets(startRestartGroup, 6);
                        i4 &= -234881025;
                    } else {
                        windowInsets3 = windowInsets;
                    }
                    if ((i3 & 512) != 0) {
                        vertical3 = WideNavigationRailDefaults.INSTANCE.getArrangement();
                        i4 &= -1879048193;
                    } else {
                        vertical3 = vertical;
                    }
                    if (i8 != 0) {
                        modifier4 = companion;
                        function25 = function26;
                        wideNavigationRailState4 = wideNavigationRailState3;
                        f4 = m9732constructorimpl;
                        shape9 = shape7;
                        windowInsets4 = windowInsets3;
                        vertical4 = vertical3;
                        modalWideNavigationRailProperties3 = WideNavigationRailDefaults.INSTANCE.getModalExpandedProperties();
                    } else {
                        modalWideNavigationRailProperties3 = modalWideNavigationRailProperties;
                        modifier4 = companion;
                        function25 = function26;
                        wideNavigationRailState4 = wideNavigationRailState3;
                        f4 = m9732constructorimpl;
                        shape9 = shape7;
                        windowInsets4 = windowInsets3;
                        vertical4 = vertical3;
                    }
                    z4 = z2;
                    shape10 = shape8;
                    wideNavigationRailColors4 = wideNavigationRailColors3;
                }
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-38559147, i4, i10, "androidx.compose.material3.ModalWideNavigationRail (WideNavigationRail.kt:627)");
                }
                composer2 = startRestartGroup;
                m4640ModalWideNavigationRailxKBSfU(modifier4, wideNavigationRailState4, z4, shape9, shape10, wideNavigationRailColors4, function25, f4, windowInsets4, vertical4, modalWideNavigationRailProperties3, WideNavigationRailDefaults.INSTANCE.getContentPadding(), function22, composer2, i4 & 2147483646, (i10 & 14) | 48 | ((i10 << 3) & 896), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
                wideNavigationRailState2 = wideNavigationRailState4;
                z3 = z4;
                shape5 = shape9;
                shape6 = shape10;
                wideNavigationRailColors2 = wideNavigationRailColors4;
                function24 = function25;
                f3 = f4;
                windowInsets2 = windowInsets4;
                vertical2 = vertical4;
                modalWideNavigationRailProperties2 = modalWideNavigationRailProperties3;
            } else {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
                wideNavigationRailState2 = wideNavigationRailState;
                windowInsets2 = windowInsets;
                function24 = function23;
                modifier3 = modifier2;
                f3 = f2;
                z3 = z2;
                shape5 = shape3;
                shape6 = shape4;
                wideNavigationRailColors2 = wideNavigationRailColors;
                vertical2 = vertical;
                modalWideNavigationRailProperties2 = modalWideNavigationRailProperties;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.WideNavigationRailKt$$ExternalSyntheticLambda13
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit ModalWideNavigationRail_k3FuEkE$lambda$0;
                        ModalWideNavigationRail_k3FuEkE$lambda$0 = WideNavigationRailKt.ModalWideNavigationRail_k3FuEkE$lambda$0(Modifier.this, wideNavigationRailState2, z3, shape5, shape6, wideNavigationRailColors2, function24, f3, windowInsets2, vertical2, modalWideNavigationRailProperties2, function22, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                        return ModalWideNavigationRail_k3FuEkE$lambda$0;
                    }
                });
                return;
            }
            return;
        }
        z2 = z;
        if ((i & 3072) != 0) {
        }
        if ((i & 24576) != 0) {
        }
        if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
        }
        i5 = i3 & 64;
        if (i5 == 0) {
        }
        i6 = i3 & 128;
        if (i6 == 0) {
        }
        if ((i & 100663296) == 0) {
        }
        if ((i & 805306368) == 0) {
        }
        i7 = i3 & 1024;
        if (i7 == 0) {
        }
        if ((i2 & 48) == 0) {
        }
        i10 = i9;
        if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i10 & 19) != 18, i4 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0146  */
    /* renamed from: WideNavigationRailItem-U_vOP4k, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m4642WideNavigationRailItemU_vOP4k(final boolean z, final Function0<Unit> function0, final Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function22, final boolean z2, Modifier modifier, boolean z3, int i, NavigationItemColors navigationItemColors, MutableInteractionSource mutableInteractionSource, PaddingValues paddingValues, Composer composer, final int i2, final int i3, final int i4) {
        int i5;
        Function0<Unit> function02;
        Function2<? super Composer, ? super Integer, Unit> function23;
        Function2<? super Composer, ? super Integer, Unit> function24;
        Modifier modifier2;
        int i6;
        boolean z4;
        int i7;
        int i8;
        int i9;
        int i10;
        Composer composer2;
        final NavigationItemColors navigationItemColors2;
        final PaddingValues paddingValues2;
        final int i11;
        final Modifier modifier3;
        final boolean z5;
        final MutableInteractionSource mutableInteractionSource2;
        ScopeUpdateScope endRestartGroup;
        int i12;
        NavigationItemColors navigationItemColors3;
        MutableInteractionSource mutableInteractionSource3;
        Composer composer3;
        PaddingValues paddingValues3;
        int i13;
        NavigationItemColors navigationItemColors4;
        Modifier modifier4;
        int i14;
        boolean z6;
        MutableInteractionSource mutableInteractionSource4;
        int i15;
        int i16;
        int i17;
        Composer startRestartGroup = composer.startRestartGroup(1807770593);
        ComposerKt.sourceInformation(startRestartGroup, "C(WideNavigationRailItem)N(selected,onClick,icon,label,railExpanded,modifier,enabled,iconPosition:c#material3.NavigationItemIconPosition,colors,interactionSource,indicatorPadding)863@42356L5,865@42529L5,866@42619L5,859@42176L1005:WideNavigationRail.kt#uh7d8r");
        if ((i2 & 6) == 0) {
            i5 = (startRestartGroup.changed(z) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            function02 = function0;
            i5 |= startRestartGroup.changedInstance(function02) ? 32 : 16;
        } else {
            function02 = function0;
        }
        if ((i2 & 384) == 0) {
            function23 = function2;
            i5 |= startRestartGroup.changedInstance(function23) ? 256 : 128;
        } else {
            function23 = function2;
        }
        if ((i2 & 3072) == 0) {
            function24 = function22;
            i5 |= startRestartGroup.changedInstance(function24) ? 2048 : 1024;
        } else {
            function24 = function22;
        }
        if ((i2 & 24576) == 0) {
            i5 |= startRestartGroup.changed(z2) ? 16384 : 8192;
        }
        int i18 = i4 & 32;
        if (i18 != 0) {
            i5 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((196608 & i2) == 0) {
            modifier2 = modifier;
            i5 |= startRestartGroup.changed(modifier2) ? 131072 : 65536;
            i6 = i4 & 64;
            if (i6 == 0) {
                i5 |= 1572864;
            } else if ((1572864 & i2) == 0) {
                z4 = z3;
                i5 |= startRestartGroup.changed(z4) ? 1048576 : 524288;
                if ((i2 & 12582912) == 0) {
                    if ((i4 & 128) == 0) {
                        i7 = i;
                        if (startRestartGroup.changed(i7)) {
                            i17 = 8388608;
                            i5 |= i17;
                        }
                    } else {
                        i7 = i;
                    }
                    i17 = 4194304;
                    i5 |= i17;
                } else {
                    i7 = i;
                }
                if ((i2 & 100663296) == 0) {
                    if ((i4 & 256) == 0 && startRestartGroup.changed(navigationItemColors)) {
                        i16 = 67108864;
                        i5 |= i16;
                    }
                    i16 = GroupFlagsKt.HasAuxSlotFlag;
                    i5 |= i16;
                }
                i8 = i4 & 512;
                if (i8 != 0) {
                    i5 |= 805306368;
                } else if ((i2 & 805306368) == 0) {
                    i5 |= startRestartGroup.changed(mutableInteractionSource) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                }
                if ((i3 & 6) == 0) {
                    if ((i4 & 1024) == 0 && startRestartGroup.changed(paddingValues)) {
                        i15 = 4;
                        i9 = i3 | i15;
                    }
                    i15 = 2;
                    i9 = i3 | i15;
                } else {
                    i9 = i3;
                }
                i10 = i5;
                if (startRestartGroup.shouldExecute((i5 & 306783379) == 306783378 || (i9 & 3) != 2, i10 & 1)) {
                    startRestartGroup.startDefaults();
                    ComposerKt.sourceInformation(startRestartGroup, "851@41855L8,854@41999L45");
                    if ((i2 & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                        if (i18 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        boolean z7 = i6 == 0 ? z4 : true;
                        if ((i4 & 128) != 0) {
                            i7 = WideNavigationRailItemDefaults.INSTANCE.m4632iconPositionFors8pcRp0(z2);
                            i12 = i10 & (-29360129);
                        } else {
                            i12 = i10;
                        }
                        if ((i4 & 256) != 0) {
                            navigationItemColors3 = WideNavigationRailItemDefaults.INSTANCE.colors(startRestartGroup, 6);
                            i12 &= -234881025;
                        } else {
                            navigationItemColors3 = navigationItemColors;
                        }
                        mutableInteractionSource3 = i8 != 0 ? null : mutableInteractionSource;
                        if ((i4 & 1024) != 0) {
                            composer3 = startRestartGroup;
                            i9 &= -15;
                            paddingValues3 = WideNavigationRailItemDefaults.INSTANCE.indicatorPadding(z2, null, null, startRestartGroup, ((i12 >> 12) & 14) | 3072, 6);
                        } else {
                            composer3 = startRestartGroup;
                            paddingValues3 = paddingValues;
                        }
                        i13 = i7;
                        navigationItemColors4 = navigationItemColors3;
                        modifier4 = modifier2;
                        i14 = i9;
                        z6 = z7;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        i12 = (i4 & 128) != 0 ? i10 & (-29360129) : i10;
                        if ((i4 & 256) != 0) {
                            i12 &= -234881025;
                        }
                        if ((i4 & 1024) != 0) {
                            i9 &= -15;
                        }
                        navigationItemColors4 = navigationItemColors;
                        mutableInteractionSource3 = mutableInteractionSource;
                        paddingValues3 = paddingValues;
                        composer3 = startRestartGroup;
                        i13 = i7;
                        modifier4 = modifier2;
                        z6 = z4;
                        i14 = i9;
                    }
                    composer3.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1807770593, i12, i14, "androidx.compose.material3.WideNavigationRailItem (WideNavigationRail.kt:855)");
                    }
                    if (mutableInteractionSource3 == null) {
                        composer3.startReplaceGroup(699505146);
                        ComposerKt.sourceInformation(composer3, "857@42131L39");
                        ComposerKt.sourceInformationMarkerStart(composer3, 2100774664, "CC(remember):WideNavigationRail.kt#9igjgp");
                        Object rememberedValue = composer3.rememberedValue();
                        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                            rememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composer3.updateRememberedValue(rememberedValue);
                        }
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        composer3.endReplaceGroup();
                        mutableInteractionSource4 = (MutableInteractionSource) rememberedValue;
                    } else {
                        composer3.startReplaceGroup(2100774013);
                        composer3.endReplaceGroup();
                        mutableInteractionSource4 = mutableInteractionSource3;
                    }
                    int i19 = i12 >> 6;
                    composer2 = composer3;
                    NavigationItemKt.m3664AnimatedNavigationItemj37qMnw(z, function02, function23, ShapesKt.getValue(NavigationRailBaselineItemTokens.INSTANCE.getActiveIndicatorShape(), composer3, 6), NavigationRailVerticalItemTokens.INSTANCE.m5401getActiveIndicatorWidthD9Ej5fM(), TypographyKt.getValue(NavigationRailVerticalItemTokens.INSTANCE.getLabelTextFont(), composer3, 6), TypographyKt.getValue(NavigationRailHorizontalItemTokens.INSTANCE.getLabelTextFont(), composer3, 6), paddingValues3, NavigationRailVerticalItemTokens.INSTANCE.m5402getIconLabelSpaceD9Ej5fM(), WNRItemNoLabelIndicatorPadding, NavigationRailHorizontalItemTokens.INSTANCE.m5398getIconLabelSpaceD9Ej5fM(), WNRItemHorizontalPadding, navigationItemColors4, modifier4, z6, function24, i13, mutableInteractionSource4, composer2, (i12 & 14) | 905994240 | (i12 & 112) | (i12 & 896) | ((i14 << 21) & 29360128), ((i12 >> 18) & 896) | 54 | (i19 & 7168) | (i19 & 57344) | ((i12 << 6) & 458752) | ((i12 >> 3) & 3670016));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    mutableInteractionSource2 = mutableInteractionSource3;
                    paddingValues2 = paddingValues3;
                    navigationItemColors2 = navigationItemColors4;
                    modifier3 = modifier4;
                    z5 = z6;
                    i11 = i13;
                } else {
                    composer2 = startRestartGroup;
                    composer2.skipToGroupEnd();
                    navigationItemColors2 = navigationItemColors;
                    paddingValues2 = paddingValues;
                    i11 = i7;
                    modifier3 = modifier2;
                    z5 = z4;
                    mutableInteractionSource2 = mutableInteractionSource;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.WideNavigationRailKt$$ExternalSyntheticLambda11
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit WideNavigationRailItem_U_vOP4k$lambda$1;
                            WideNavigationRailItem_U_vOP4k$lambda$1 = WideNavigationRailKt.WideNavigationRailItem_U_vOP4k$lambda$1(z, function0, function2, function22, z2, modifier3, z5, i11, navigationItemColors2, mutableInteractionSource2, paddingValues2, i2, i3, i4, (Composer) obj, ((Integer) obj2).intValue());
                            return WideNavigationRailItem_U_vOP4k$lambda$1;
                        }
                    });
                    return;
                }
                return;
            }
            z4 = z3;
            if ((i2 & 12582912) == 0) {
            }
            if ((i2 & 100663296) == 0) {
            }
            i8 = i4 & 512;
            if (i8 != 0) {
            }
            if ((i3 & 6) == 0) {
            }
            i10 = i5;
            if (startRestartGroup.shouldExecute((i5 & 306783379) == 306783378 || (i9 & 3) != 2, i10 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i6 = i4 & 64;
        if (i6 == 0) {
        }
        z4 = z3;
        if ((i2 & 12582912) == 0) {
        }
        if ((i2 & 100663296) == 0) {
        }
        i8 = i4 & 512;
        if (i8 != 0) {
        }
        if ((i3 & 6) == 0) {
        }
        i10 = i5;
        if (startRestartGroup.shouldExecute((i5 & 306783379) == 306783378 || (i9 & 3) != 2, i10 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Deprecated in favor of function with indicatorPadding parameter")
    /* renamed from: WideNavigationRailItem-pli-t6k, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void m4644WideNavigationRailItemplit6k(final boolean z, final Function0 function0, final Function2 function2, final Function2 function22, final boolean z2, Modifier modifier, boolean z3, int i, NavigationItemColors navigationItemColors, MutableInteractionSource mutableInteractionSource, Composer composer, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        boolean z4;
        int i6;
        NavigationItemColors navigationItemColors2;
        int i7;
        int i8;
        int i9;
        Composer composer2;
        final MutableInteractionSource mutableInteractionSource2;
        final boolean z5;
        final int i10;
        final NavigationItemColors navigationItemColors3;
        final Modifier modifier3;
        ScopeUpdateScope endRestartGroup;
        int i11;
        int i12;
        MutableInteractionSource mutableInteractionSource3;
        int i13;
        int i14;
        Composer startRestartGroup = composer.startRestartGroup(-1894733304);
        ComposerKt.sourceInformation(startRestartGroup, "C(WideNavigationRailItem)N(selected,onClick,icon,label,railExpanded,modifier,enabled,iconPosition:c#material3.NavigationItemIconPosition,colors,interactionSource)944@46196L45,933@45947L301:WideNavigationRail.kt#uh7d8r");
        if ((i2 & 6) == 0) {
            i4 = (startRestartGroup.changed(z) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= startRestartGroup.changedInstance(function2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= startRestartGroup.changedInstance(function22) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= startRestartGroup.changed(z2) ? 16384 : 8192;
        }
        int i15 = i3 & 32;
        if (i15 != 0) {
            i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((196608 & i2) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 131072 : 65536;
            i5 = i3 & 64;
            if (i5 == 0) {
                i4 |= 1572864;
            } else if ((1572864 & i2) == 0) {
                z4 = z3;
                i4 |= startRestartGroup.changed(z4) ? 1048576 : 524288;
                if ((12582912 & i2) == 0) {
                    if ((i3 & 128) == 0) {
                        i6 = i;
                        if (startRestartGroup.changed(i6)) {
                            i14 = 8388608;
                            i4 |= i14;
                        }
                    } else {
                        i6 = i;
                    }
                    i14 = 4194304;
                    i4 |= i14;
                } else {
                    i6 = i;
                }
                if ((100663296 & i2) == 0) {
                    if ((i3 & 256) == 0) {
                        navigationItemColors2 = navigationItemColors;
                        if (startRestartGroup.changed(navigationItemColors2)) {
                            i13 = 67108864;
                            i4 |= i13;
                        }
                    } else {
                        navigationItemColors2 = navigationItemColors;
                    }
                    i13 = GroupFlagsKt.HasAuxSlotFlag;
                    i4 |= i13;
                } else {
                    navigationItemColors2 = navigationItemColors;
                }
                i7 = i3 & 512;
                if (i7 != 0) {
                    i4 |= 805306368;
                } else if ((i2 & 805306368) == 0) {
                    i8 = i7;
                    i4 |= startRestartGroup.changed(mutableInteractionSource) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                    i9 = i4;
                    if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378, i9 & 1)) {
                        startRestartGroup.startDefaults();
                        ComposerKt.sourceInformation(startRestartGroup, "930@45872L8");
                        if ((i2 & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                            if (i15 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i5 != 0) {
                                z4 = true;
                            }
                            if ((i3 & 128) != 0) {
                                i11 = i9 & (-29360129);
                                i6 = WideNavigationRailItemDefaults.INSTANCE.m4632iconPositionFors8pcRp0(z2);
                            } else {
                                i11 = i9;
                            }
                            if ((i3 & 256) != 0) {
                                navigationItemColors2 = WideNavigationRailItemDefaults.INSTANCE.colors(startRestartGroup, 6);
                                i12 = (-234881025) & i11;
                            } else {
                                i12 = i11;
                            }
                            if (i8 != 0) {
                                mutableInteractionSource3 = null;
                                int i16 = i6;
                                NavigationItemColors navigationItemColors4 = navigationItemColors2;
                                Modifier modifier4 = modifier2;
                                boolean z6 = z4;
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1894733304, i12, -1, "androidx.compose.material3.WideNavigationRailItem (WideNavigationRail.kt:933)");
                                }
                                int i17 = i12;
                                m4642WideNavigationRailItemU_vOP4k(z, function0, function2, function22, z2, modifier4, z6, i16, navigationItemColors4, mutableInteractionSource3, WideNavigationRailItemDefaults.INSTANCE.indicatorPadding(z2, null, null, startRestartGroup, ((i17 >> 12) & 14) | 3072, 6), startRestartGroup, 2147483646 & i17, 0, 0);
                                composer2 = startRestartGroup;
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                mutableInteractionSource2 = mutableInteractionSource3;
                                navigationItemColors3 = navigationItemColors4;
                                i10 = i16;
                                z5 = z6;
                                modifier3 = modifier4;
                            }
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            i12 = (i3 & 128) != 0 ? i9 & (-29360129) : i9;
                            if ((i3 & 256) != 0) {
                                i12 &= -234881025;
                            }
                        }
                        mutableInteractionSource3 = mutableInteractionSource;
                        int i162 = i6;
                        NavigationItemColors navigationItemColors42 = navigationItemColors2;
                        Modifier modifier42 = modifier2;
                        boolean z62 = z4;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        int i172 = i12;
                        m4642WideNavigationRailItemU_vOP4k(z, function0, function2, function22, z2, modifier42, z62, i162, navigationItemColors42, mutableInteractionSource3, WideNavigationRailItemDefaults.INSTANCE.indicatorPadding(z2, null, null, startRestartGroup, ((i172 >> 12) & 14) | 3072, 6), startRestartGroup, 2147483646 & i172, 0, 0);
                        composer2 = startRestartGroup;
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        mutableInteractionSource2 = mutableInteractionSource3;
                        navigationItemColors3 = navigationItemColors42;
                        i10 = i162;
                        z5 = z62;
                        modifier3 = modifier42;
                    } else {
                        composer2 = startRestartGroup;
                        composer2.skipToGroupEnd();
                        mutableInteractionSource2 = mutableInteractionSource;
                        z5 = z4;
                        i10 = i6;
                        navigationItemColors3 = navigationItemColors2;
                        modifier3 = modifier2;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.WideNavigationRailKt$$ExternalSyntheticLambda10
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit WideNavigationRailItem_pli_t6k$lambda$0;
                                WideNavigationRailItem_pli_t6k$lambda$0 = WideNavigationRailKt.WideNavigationRailItem_pli_t6k$lambda$0(z, function0, function2, function22, z2, modifier3, z5, i10, navigationItemColors3, mutableInteractionSource2, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                return WideNavigationRailItem_pli_t6k$lambda$0;
                            }
                        });
                        return;
                    }
                    return;
                }
                i8 = i7;
                i9 = i4;
                if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378, i9 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z4 = z3;
            if ((12582912 & i2) == 0) {
            }
            if ((100663296 & i2) == 0) {
            }
            i7 = i3 & 512;
            if (i7 != 0) {
            }
            i8 = i7;
            i9 = i4;
            if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378, i9 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 64;
        if (i5 == 0) {
        }
        z4 = z3;
        if ((12582912 & i2) == 0) {
        }
        if ((100663296 & i2) == 0) {
        }
        i7 = i3 & 512;
        if (i7 != 0) {
        }
        i8 = i7;
        i9 = i4;
        if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378, i9 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Deprecated in favor of function with indicatorPadding required railExpanded parameters")
    /* renamed from: WideNavigationRailItem-pli-t6k, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void m4643WideNavigationRailItemplit6k(final boolean z, final Function0 function0, final Function2 function2, final Function2 function22, Modifier modifier, boolean z2, boolean z3, int i, NavigationItemColors navigationItemColors, MutableInteractionSource mutableInteractionSource, Composer composer, final int i2, final int i3) {
        int i4;
        Function2 function23;
        Function2 function24;
        Modifier modifier2;
        int i5;
        boolean z4;
        int i6;
        boolean z5;
        int i7;
        int i8;
        int i9;
        int i10;
        Composer composer2;
        final NavigationItemColors navigationItemColors2;
        final Modifier modifier3;
        final boolean z6;
        final boolean z7;
        final int i11;
        final MutableInteractionSource mutableInteractionSource2;
        ScopeUpdateScope endRestartGroup;
        boolean z8;
        int i12;
        NavigationItemColors navigationItemColors3;
        MutableInteractionSource mutableInteractionSource3;
        NavigationItemColors navigationItemColors4;
        int i13;
        Modifier modifier4;
        int i14;
        int i15;
        Composer startRestartGroup = composer.startRestartGroup(1198748736);
        ComposerKt.sourceInformation(startRestartGroup, "C(WideNavigationRailItem)N(selected,onClick,icon,label,modifier,enabled,railExpanded,iconPosition:c#material3.NavigationItemIconPosition,colors,interactionSource)1012@49336L45,1001@49087L301:WideNavigationRail.kt#uh7d8r");
        if ((i2 & 6) == 0) {
            i4 = (startRestartGroup.changed(z) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            function23 = function2;
            i4 |= startRestartGroup.changedInstance(function23) ? 256 : 128;
        } else {
            function23 = function2;
        }
        if ((i2 & 3072) == 0) {
            function24 = function22;
            i4 |= startRestartGroup.changedInstance(function24) ? 2048 : 1024;
        } else {
            function24 = function22;
        }
        int i16 = i3 & 16;
        if (i16 != 0) {
            i4 |= 24576;
        } else if ((i2 & 24576) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 16384 : 8192;
            i5 = i3 & 32;
            if (i5 == 0) {
                i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((196608 & i2) == 0) {
                z4 = z2;
                i4 |= startRestartGroup.changed(z4) ? 131072 : 65536;
                i6 = i3 & 64;
                if (i6 != 0) {
                    i4 |= 1572864;
                } else if ((1572864 & i2) == 0) {
                    z5 = z3;
                    i4 |= startRestartGroup.changed(z5) ? 1048576 : 524288;
                    if ((12582912 & i2) != 0) {
                        if ((i3 & 128) == 0) {
                            i7 = i;
                            if (startRestartGroup.changed(i7)) {
                                i15 = 8388608;
                                i4 |= i15;
                            }
                        } else {
                            i7 = i;
                        }
                        i15 = 4194304;
                        i4 |= i15;
                    } else {
                        i7 = i;
                    }
                    if ((i2 & 100663296) == 0) {
                        if ((i3 & 256) == 0 && startRestartGroup.changed(navigationItemColors)) {
                            i14 = 67108864;
                            i4 |= i14;
                        }
                        i14 = GroupFlagsKt.HasAuxSlotFlag;
                        i4 |= i14;
                    }
                    i8 = i3 & 512;
                    if (i8 == 0) {
                        i4 |= 805306368;
                    } else if ((i2 & 805306368) == 0) {
                        i9 = i8;
                        i4 |= startRestartGroup.changed(mutableInteractionSource) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                        i10 = i4;
                        if (startRestartGroup.shouldExecute((i4 & 306783379) != 306783378, i10 & 1)) {
                            startRestartGroup.startDefaults();
                            ComposerKt.sourceInformation(startRestartGroup, "998@49012L8");
                            if ((i2 & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                                if (i16 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                }
                                z8 = i5 == 0 ? z4 : true;
                                if (i6 != 0) {
                                    z5 = false;
                                }
                                if ((i3 & 128) != 0) {
                                    i12 = i10 & (-29360129);
                                    i7 = WideNavigationRailItemDefaults.INSTANCE.m4632iconPositionFors8pcRp0(z5);
                                } else {
                                    i12 = i10;
                                }
                                if ((i3 & 256) != 0) {
                                    navigationItemColors3 = WideNavigationRailItemDefaults.INSTANCE.colors(startRestartGroup, 6);
                                    i12 = (-234881025) & i12;
                                } else {
                                    navigationItemColors3 = navigationItemColors;
                                }
                                if (i9 != 0) {
                                    navigationItemColors4 = navigationItemColors3;
                                    mutableInteractionSource3 = null;
                                } else {
                                    mutableInteractionSource3 = mutableInteractionSource;
                                    navigationItemColors4 = navigationItemColors3;
                                }
                                i13 = i12;
                                modifier4 = modifier2;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                i13 = (i3 & 128) != 0 ? i10 & (-29360129) : i10;
                                if ((i3 & 256) != 0) {
                                    i13 &= -234881025;
                                }
                                navigationItemColors4 = navigationItemColors;
                                mutableInteractionSource3 = mutableInteractionSource;
                                modifier4 = modifier2;
                                z8 = z4;
                            }
                            boolean z9 = z5;
                            int i17 = i7;
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1198748736, i13, -1, "androidx.compose.material3.WideNavigationRailItem (WideNavigationRail.kt:1001)");
                            }
                            composer2 = startRestartGroup;
                            int i18 = i13 << 3;
                            m4642WideNavigationRailItemU_vOP4k(z, function0, function23, function24, z9, modifier4, z8, i17, navigationItemColors4, mutableInteractionSource3, WideNavigationRailItemDefaults.INSTANCE.indicatorPadding(z9, null, null, startRestartGroup, ((i13 >> 18) & 14) | 3072, 6), composer2, (i13 & 8190) | ((i13 >> 6) & 57344) | (458752 & i18) | (i18 & 3670016) | (29360128 & i13) | (234881024 & i13) | (i13 & 1879048192), 0, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z7 = z9;
                            modifier3 = modifier4;
                            z6 = z8;
                            i11 = i17;
                            navigationItemColors2 = navigationItemColors4;
                            mutableInteractionSource2 = mutableInteractionSource3;
                        } else {
                            composer2 = startRestartGroup;
                            composer2.skipToGroupEnd();
                            navigationItemColors2 = navigationItemColors;
                            modifier3 = modifier2;
                            z6 = z4;
                            z7 = z5;
                            i11 = i7;
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.WideNavigationRailKt$$ExternalSyntheticLambda16
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    Unit WideNavigationRailItem_pli_t6k$lambda$1;
                                    WideNavigationRailItem_pli_t6k$lambda$1 = WideNavigationRailKt.WideNavigationRailItem_pli_t6k$lambda$1(z, function0, function2, function22, modifier3, z6, z7, i11, navigationItemColors2, mutableInteractionSource2, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                    return WideNavigationRailItem_pli_t6k$lambda$1;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i9 = i8;
                    i10 = i4;
                    if (startRestartGroup.shouldExecute((i4 & 306783379) != 306783378, i10 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                z5 = z3;
                if ((12582912 & i2) != 0) {
                }
                if ((i2 & 100663296) == 0) {
                }
                i8 = i3 & 512;
                if (i8 == 0) {
                }
                i9 = i8;
                i10 = i4;
                if (startRestartGroup.shouldExecute((i4 & 306783379) != 306783378, i10 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            z4 = z2;
            i6 = i3 & 64;
            if (i6 != 0) {
            }
            z5 = z3;
            if ((12582912 & i2) != 0) {
            }
            if ((i2 & 100663296) == 0) {
            }
            i8 = i3 & 512;
            if (i8 == 0) {
            }
            i9 = i8;
            i10 = i4;
            if (startRestartGroup.shouldExecute((i4 & 306783379) != 306783378, i10 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 32;
        if (i5 == 0) {
        }
        z4 = z2;
        i6 = i3 & 64;
        if (i6 != 0) {
        }
        z5 = z3;
        if ((12582912 & i2) != 0) {
        }
        if ((i2 & 100663296) == 0) {
        }
        i8 = i3 & 512;
        if (i8 == 0) {
        }
        i9 = i8;
        i10 = i4;
        if (startRestartGroup.shouldExecute((i4 & 306783379) != 306783378, i10 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ModalWideNavigationRailContent-_zuB-KE, reason: not valid java name */
    public static final void m4641ModalWideNavigationRailContent_zuBKE(final boolean z, final boolean z2, final Animatable<Float, AnimationVector1D> animatable, final RailPredictiveBackState railPredictiveBackState, final Function1<? super Continuation<? super Unit>, ? extends Object> function1, final Modifier modifier, final ModalWideNavigationRailState modalWideNavigationRailState, final WideNavigationRailColors wideNavigationRailColors, final Shape shape, final float f, final Function2<? super Composer, ? super Integer, Unit> function2, final WindowInsets windowInsets, final boolean z3, final Arrangement.Vertical vertical, final PaddingValues paddingValues, final Function2<? super Composer, ? super Integer, Unit> function22, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        WideNavigationRailColors wideNavigationRailColors2;
        int i5;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(1307377989);
        ComposerKt.sourceInformation(startRestartGroup, "C(ModalWideNavigationRailContent)N(expanded,isStandaloneModal,predictiveBackProgress,predictiveBackState,modalAnimateToDismiss,modifier,railState,colors,shape,openModalRailMaxWidth:c#ui.unit.Dp,header,windowInsets,gesturesEnabled,arrangement,contentPadding,content)1448@68934L7,1449@68989L55,1453@69223L31,1451@69120L198,1458@69356L579,1481@70220L29,1482@70281L904,1501@71278L627,1523@72189L1356,1473@69941L3604:WideNavigationRail.kt#uh7d8r");
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(z2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= (i & 512) == 0 ? startRestartGroup.changed(animatable) : startRestartGroup.changedInstance(animatable) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changed(railPredictiveBackState) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 16384 : 8192;
        }
        if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= startRestartGroup.changedInstance(modalWideNavigationRailState) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i4 = 196608;
            wideNavigationRailColors2 = wideNavigationRailColors;
            i3 |= startRestartGroup.changed(wideNavigationRailColors2) ? 8388608 : 4194304;
        } else {
            i4 = 196608;
            wideNavigationRailColors2 = wideNavigationRailColors;
        }
        if ((i & 100663296) == 0) {
            i3 |= startRestartGroup.changed(shape) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
        }
        if ((i & 805306368) == 0) {
            i3 |= startRestartGroup.changed(f) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
        }
        if ((i2 & 6) == 0) {
            i5 = i2 | (startRestartGroup.changedInstance(function2) ? 4 : 2);
        } else {
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 |= startRestartGroup.changed(windowInsets) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i5 |= startRestartGroup.changed(z3) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i5 |= startRestartGroup.changed(vertical) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i5 |= startRestartGroup.changed(paddingValues) ? 16384 : 8192;
        }
        if ((i2 & i4) == 0) {
            i5 |= startRestartGroup.changedInstance(function22) ? 131072 : 65536;
        }
        int i6 = i5;
        if (!startRestartGroup.shouldExecute(((i3 & 306783379) == 306783378 && (74899 & i6) == 74898) ? false : true, i3 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1307377989, i3, i6, "androidx.compose.material3.ModalWideNavigationRailContent (WideNavigationRail.kt:1447)");
            }
            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(localLayoutDirection);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final boolean z4 = consume == LayoutDirection.Rtl;
            Strings.Companion companion = Strings.INSTANCE;
            final String m4895getString2EP1pXo = Strings_androidKt.m4895getString2EP1pXo(Strings.m4811constructorimpl(R.string.m3c_wide_navigation_rail_pane_title), startRestartGroup, 0);
            AnchoredDraggableDefaults anchoredDraggableDefaults = AnchoredDraggableDefaults.INSTANCE;
            AnchoredDraggableState<WideNavigationRailValue> anchoredDraggableState$material3 = modalWideNavigationRailState.getAnchoredDraggableState$material3();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2035139804, "CC(remember):WideNavigationRail.kt#9igjgp");
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function1() { // from class: androidx.compose.material3.WideNavigationRailKt$$ExternalSyntheticLambda19
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        float ModalWideNavigationRailContent__zuB_KE$lambda$0$0;
                        ModalWideNavigationRailContent__zuB_KE$lambda$0$0 = WideNavigationRailKt.ModalWideNavigationRailContent__zuB_KE$lambda$0$0(((Float) obj).floatValue());
                        return Float.valueOf(ModalWideNavigationRailContent__zuB_KE$lambda$0$0);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            TargetedFlingBehavior flingBehavior = anchoredDraggableDefaults.flingBehavior(anchoredDraggableState$material3, rememberedValue, modalWideNavigationRailState.getAnimationSpec(), startRestartGroup, (AnchoredDraggableDefaults.$stable << 9) | 48, 0);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2035135000, "CC(remember):WideNavigationRail.kt#9igjgp");
            boolean changed = startRestartGroup.changed(flingBehavior);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changed || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new WideNavigationRailKt$ModalWideNavigationRailContent$railFlingBehavior$1$1(flingBehavior, function1);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            WideNavigationRailKt$ModalWideNavigationRailContent$railFlingBehavior$1$1 wideNavigationRailKt$ModalWideNavigationRailContent$railFlingBehavior$1$1 = (WideNavigationRailKt$ModalWideNavigationRailContent$railFlingBehavior$1$1) rememberedValue2;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            long modalContainerColor = wideNavigationRailColors2.getModalContainerColor();
            long modalContentColor = wideNavigationRailColors2.getModalContentColor();
            Modifier fillMaxHeight$default = SizeKt.fillMaxHeight$default(SizeKt.m1278widthInVpY3zN4$default(modifier, 0.0f, f, 1, null), 0.0f, 1, null);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2035107902, "CC(remember):WideNavigationRail.kt#9igjgp");
            boolean changed2 = startRestartGroup.changed(m4895getString2EP1pXo);
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (changed2 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new Function1() { // from class: androidx.compose.material3.WideNavigationRailKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit ModalWideNavigationRailContent__zuB_KE$lambda$2$0;
                        ModalWideNavigationRailContent__zuB_KE$lambda$2$0 = WideNavigationRailKt.ModalWideNavigationRailContent__zuB_KE$lambda$2$0(m4895getString2EP1pXo, (SemanticsPropertyReceiver) obj);
                        return ModalWideNavigationRailContent__zuB_KE$lambda$2$0;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Modifier semantics$default = SemanticsModifierKt.semantics$default(fillMaxHeight$default, false, (Function1) rememberedValue3, 1, null);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2035105075, "CC(remember):WideNavigationRail.kt#9igjgp");
            boolean changedInstance = ((i3 & 7168) == 2048) | ((i3 & 896) == 256 || ((i3 & 512) != 0 && startRestartGroup.changedInstance(animatable))) | startRestartGroup.changedInstance(modalWideNavigationRailState) | startRestartGroup.changed(z4);
            Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new Function1() { // from class: androidx.compose.material3.WideNavigationRailKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit ModalWideNavigationRailContent__zuB_KE$lambda$3$0;
                        ModalWideNavigationRailContent__zuB_KE$lambda$3$0 = WideNavigationRailKt.ModalWideNavigationRailContent__zuB_KE$lambda$3$0(Animatable.this, modalWideNavigationRailState, railPredictiveBackState, z4, (GraphicsLayerScope) obj);
                        return ModalWideNavigationRailContent__zuB_KE$lambda$3$0;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Modifier graphicsLayer = GraphicsLayerModifierKt.graphicsLayer(semantics$default, (Function1) rememberedValue4);
            AnchoredDraggableState<WideNavigationRailValue> anchoredDraggableState$material32 = modalWideNavigationRailState.getAnchoredDraggableState$material3();
            Orientation orientation = Orientation.Horizontal;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2035073448, "CC(remember):WideNavigationRail.kt#9igjgp");
            boolean changedInstance2 = ((i3 & 112) == 32) | startRestartGroup.changedInstance(modalWideNavigationRailState);
            Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (changedInstance2 || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = new Function2() { // from class: androidx.compose.material3.WideNavigationRailKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Pair ModalWideNavigationRailContent__zuB_KE$lambda$4$0;
                        ModalWideNavigationRailContent__zuB_KE$lambda$4$0 = WideNavigationRailKt.ModalWideNavigationRailContent__zuB_KE$lambda$4$0(z2, modalWideNavigationRailState, (IntSize) obj, (Constraints) obj2);
                        return ModalWideNavigationRailContent__zuB_KE$lambda$4$0;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Modifier anchoredDraggable$default = AnchoredDraggableKt.anchoredDraggable$default(DraggableAnchorsKt.draggableAnchors(graphicsLayer, anchoredDraggableState$material32, orientation, (Function2) rememberedValue5), modalWideNavigationRailState.getAnchoredDraggableState$material3(), Orientation.Horizontal, z3, null, null, wideNavigationRailKt$ModalWideNavigationRailContent$railFlingBehavior$1$1, 24, null);
            composer2 = startRestartGroup;
            final WideNavigationRailColors wideNavigationRailColors3 = wideNavigationRailColors2;
            SurfaceKt.m4112SurfaceT9BRK9s(anchoredDraggable$default, shape, modalContainerColor, modalContentColor, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(131156832, true, new Function2() { // from class: androidx.compose.material3.WideNavigationRailKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit ModalWideNavigationRailContent__zuB_KE$lambda$5;
                    ModalWideNavigationRailContent__zuB_KE$lambda$5 = WideNavigationRailKt.ModalWideNavigationRailContent__zuB_KE$lambda$5(Animatable.this, railPredictiveBackState, z4, z, wideNavigationRailColors3, shape, function2, windowInsets, vertical, paddingValues, function22, (Composer) obj, ((Integer) obj2).intValue());
                    return ModalWideNavigationRailContent__zuB_KE$lambda$5;
                }
            }, composer2, 54), composer2, ((i3 >> 21) & 112) | 12582912, 112);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.WideNavigationRailKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit ModalWideNavigationRailContent__zuB_KE$lambda$6;
                    ModalWideNavigationRailContent__zuB_KE$lambda$6 = WideNavigationRailKt.ModalWideNavigationRailContent__zuB_KE$lambda$6(z, z2, animatable, railPredictiveBackState, function1, modifier, modalWideNavigationRailState, wideNavigationRailColors, shape, f, function2, windowInsets, z3, vertical, paddingValues, function22, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return ModalWideNavigationRailContent__zuB_KE$lambda$6;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ModalWideNavigationRailContent__zuB_KE$lambda$2$0(String str, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setPaneTitle(semanticsPropertyReceiver, str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ModalWideNavigationRailContent__zuB_KE$lambda$3$0(Animatable animatable, ModalWideNavigationRailState modalWideNavigationRailState, RailPredictiveBackState railPredictiveBackState, boolean z, GraphicsLayerScope graphicsLayerScope) {
        float floatValue = ((Number) animatable.getValue()).floatValue();
        if (floatValue <= 0.0f) {
            return Unit.INSTANCE;
        }
        float currentOffset = modalWideNavigationRailState.getCurrentOffset();
        float intBitsToFloat = Float.intBitsToFloat((int) (graphicsLayerScope.getSize() >> 32));
        if (!Float.isNaN(currentOffset) && !Float.isNaN(intBitsToFloat) && intBitsToFloat != 0.0f) {
            graphicsLayerScope.setScaleX(calculatePredictiveBackScaleX(graphicsLayerScope, floatValue, railPredictiveBackState.getSwipeEdgeMatchesRail()));
            graphicsLayerScope.setScaleY(calculatePredictiveBackScaleY(graphicsLayerScope, floatValue));
            graphicsLayerScope.mo6968setTransformOrigin__ExYCQ(TransformOriginKt.TransformOrigin(z ? 1.0f : 0.0f, 0.5f));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pair ModalWideNavigationRailContent__zuB_KE$lambda$4$0(boolean z, ModalWideNavigationRailState modalWideNavigationRailState, IntSize intSize, Constraints constraints) {
        final float f = 0.0f;
        final float f2 = z ? -((int) (intSize.m9911unboximpl() >> 32)) : 0.0f;
        return TuplesKt.to(AnchoredDraggableKt.DraggableAnchors(new Function1() { // from class: androidx.compose.material3.WideNavigationRailKt$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit ModalWideNavigationRailContent__zuB_KE$lambda$4$0$0;
                ModalWideNavigationRailContent__zuB_KE$lambda$4$0$0 = WideNavigationRailKt.ModalWideNavigationRailContent__zuB_KE$lambda$4$0$0(f2, f, (DraggableAnchorsConfig) obj);
                return ModalWideNavigationRailContent__zuB_KE$lambda$4$0$0;
            }
        }), modalWideNavigationRailState.getTargetValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ModalWideNavigationRailContent__zuB_KE$lambda$4$0$0(float f, float f2, DraggableAnchorsConfig draggableAnchorsConfig) {
        draggableAnchorsConfig.at(WideNavigationRailValue.Collapsed, f);
        draggableAnchorsConfig.at(WideNavigationRailValue.Expanded, f2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ModalWideNavigationRailContent__zuB_KE$lambda$5(final Animatable animatable, final RailPredictiveBackState railPredictiveBackState, final boolean z, boolean z2, WideNavigationRailColors wideNavigationRailColors, Shape shape, Function2 function2, WindowInsets windowInsets, Arrangement.Vertical vertical, PaddingValues paddingValues, Function2 function22, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C1526@72287L939,1524@72199L1340:WideNavigationRail.kt#uh7d8r");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(131156832, i, -1, "androidx.compose.material3.ModalWideNavigationRailContent.<anonymous> (WideNavigationRail.kt:1524)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, 1487668043, "CC(remember):WideNavigationRail.kt#9igjgp");
            boolean changedInstance = composer.changedInstance(animatable) | composer.changed(railPredictiveBackState) | composer.changed(z);
            Object rememberedValue = composer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function1() { // from class: androidx.compose.material3.WideNavigationRailKt$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit ModalWideNavigationRailContent__zuB_KE$lambda$5$0$0;
                        ModalWideNavigationRailContent__zuB_KE$lambda$5$0$0 = WideNavigationRailKt.ModalWideNavigationRailContent__zuB_KE$lambda$5$0$0(Animatable.this, railPredictiveBackState, z, (GraphicsLayerScope) obj);
                        return ModalWideNavigationRailContent__zuB_KE$lambda$5$0$0;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            WideNavigationRailLayout(GraphicsLayerModifierKt.graphicsLayer(companion, (Function1) rememberedValue), true, z2, wideNavigationRailColors, shape, function2, windowInsets, vertical, paddingValues, function22, composer, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ModalWideNavigationRailContent__zuB_KE$lambda$5$0$0(Animatable animatable, RailPredictiveBackState railPredictiveBackState, boolean z, GraphicsLayerScope graphicsLayerScope) {
        float floatValue = ((Number) animatable.getValue()).floatValue();
        if (floatValue <= 0.0f) {
            return Unit.INSTANCE;
        }
        float calculatePredictiveBackScaleX = calculatePredictiveBackScaleX(graphicsLayerScope, floatValue, railPredictiveBackState.getSwipeEdgeMatchesRail());
        graphicsLayerScope.setScaleX(calculatePredictiveBackScaleX == 0.0f ? 1.0f : calculatePredictiveBackScaleY(graphicsLayerScope, floatValue) / calculatePredictiveBackScaleX);
        graphicsLayerScope.mo6968setTransformOrigin__ExYCQ(TransformOriginKt.TransformOrigin(z ? 0.0f : 1.0f, 0.5f));
        return Unit.INSTANCE;
    }

    private static final float calculatePredictiveBackScaleX(GraphicsLayerScope graphicsLayerScope, float f, boolean z) {
        float intBitsToFloat = Float.intBitsToFloat((int) (graphicsLayerScope.getSize() >> 32));
        if (Float.isNaN(intBitsToFloat) || intBitsToFloat == 0.0f) {
            return 1.0f;
        }
        return (((z ? 1.0f : -1.0f) * MathHelpersKt.lerp(0.0f, Math.min(graphicsLayerScope.mo528toPx0680j_4(PredictiveBackMaxScaleXDistance), intBitsToFloat), f)) / intBitsToFloat) + 1.0f;
    }

    private static final float calculatePredictiveBackScaleY(GraphicsLayerScope graphicsLayerScope, float f) {
        float intBitsToFloat = Float.intBitsToFloat((int) (graphicsLayerScope.getSize() & 4294967295L));
        if (Float.isNaN(intBitsToFloat) || intBitsToFloat == 0.0f) {
            return 1.0f;
        }
        return 1.0f - (MathHelpersKt.lerp(0.0f, Math.min(graphicsLayerScope.mo528toPx0680j_4(PredictiveBackMaxScaleYDistance), intBitsToFloat), f) / intBitsToFloat);
    }

    public static final float getWNRItemNoLabelIndicatorPadding() {
        return WNRItemNoLabelIndicatorPadding;
    }

    static {
        float f = 2;
        WNRItemNoLabelIndicatorPadding = Dp.m9732constructorimpl(Dp.m9732constructorimpl(NavigationRailVerticalItemTokens.INSTANCE.m5401getActiveIndicatorWidthD9Ej5fM() - NavigationRailBaselineItemTokens.INSTANCE.m5384getIconSizeD9Ej5fM()) / f);
        ItemTopIconIndicatorVerticalPadding = Dp.m9732constructorimpl(Dp.m9732constructorimpl(NavigationRailVerticalItemTokens.INSTANCE.m5400getActiveIndicatorHeightD9Ej5fM() - NavigationRailBaselineItemTokens.INSTANCE.m5384getIconSizeD9Ej5fM()) / f);
        ItemTopIconIndicatorHorizontalPadding = Dp.m9732constructorimpl(Dp.m9732constructorimpl(NavigationRailVerticalItemTokens.INSTANCE.m5401getActiveIndicatorWidthD9Ej5fM() - NavigationRailBaselineItemTokens.INSTANCE.m5384getIconSizeD9Ej5fM()) / f);
        ItemStartIconIndicatorVerticalPadding = Dp.m9732constructorimpl(Dp.m9732constructorimpl(NavigationRailHorizontalItemTokens.INSTANCE.m5395getActiveIndicatorHeightD9Ej5fM() - NavigationRailBaselineItemTokens.INSTANCE.m5384getIconSizeD9Ej5fM()) / f);
    }

    public static final float getWNRItemHorizontalPadding() {
        return WNRItemHorizontalPadding;
    }

    public static final ProvidableCompositionLocal<WideNavigationRailOverride> getLocalWideNavigationRailOverride() {
        return LocalWideNavigationRailOverride;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WideNavigationRailOverride LocalWideNavigationRailOverride$lambda$0() {
        return DefaultWideNavigationRailOverride.INSTANCE;
    }

    public static final ProvidableCompositionLocal<ModalWideNavigationRailOverride> getLocalModalWideNavigationRailOverride() {
        return LocalModalWideNavigationRailOverride;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ModalWideNavigationRailOverride LocalModalWideNavigationRailOverride$lambda$0() {
        return DefaultModalWideNavigationRailOverride.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float WideNavigationRailLayout$lambda$6(State<Dp> state) {
        return state.getValue().m9746unboximpl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float WideNavigationRailLayout$lambda$7(State<Dp> state) {
        return state.getValue().m9746unboximpl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float WideNavigationRailLayout$lambda$8(State<Dp> state) {
        return state.getValue().m9746unboximpl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float WideNavigationRailLayout$lambda$9(State<Dp> state) {
        return state.getValue().m9746unboximpl();
    }
}
