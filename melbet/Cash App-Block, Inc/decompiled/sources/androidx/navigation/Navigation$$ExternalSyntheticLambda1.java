package androidx.navigation;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.view.ViewParent;
import androidx.compose.animation.AnimatedContentTransitionScopeImpl;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.material3.internal.ParentSemanticsNode;
import androidx.compose.ui.node.DepthSortedSetKt;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.text.EmojiSupportMatch;
import androidx.compose.ui.text.ParagraphInfo;
import androidx.compose.ui.text.PlatformParagraphStyle;
import androidx.compose.ui.text.TextPainterKt;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.DensityWithConverter;
import androidx.graphics.shapes.Cubic;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavDestination;
import androidx.navigation.compose.BackStackEntryIdViewModel;
import androidx.navigation.compose.ComposeNavigator;
import androidx.navigation.fragment.FragmentNavigator;
import androidx.navigation.internal.NavBackStackEntryImpl;
import androidx.work.impl.WorkLauncherImpl;
import com.bugsnag.android.TraceParser;
import com.squareup.cash.R;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class Navigation$$ExternalSyntheticLambda1 implements Function1 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ Navigation$$ExternalSyntheticLambda1(DensityWithConverter densityWithConverter) {
        this.$r8$classId = 11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        EmojiSupportMatch emojiSupportMatch = null;
        emojiSupportMatch = null;
        switch (this.$r8$classId) {
            case 0:
                View view = (View) obj;
                view.getClass();
                ViewParent parent = view.getParent();
                if (parent instanceof View) {
                    return (View) parent;
                }
                return null;
            case 1:
                return Unit.INSTANCE;
            case 2:
                return Unit.INSTANCE;
            case 3:
                return Unit.INSTANCE;
            case 4:
                TraversableNode traversableNode = (TraversableNode) obj;
                traversableNode.getClass();
                ParentSemanticsNode parentSemanticsNode = (ParentSemanticsNode) traversableNode;
                parentSemanticsNode.semanticsConsumed = false;
                DepthSortedSetKt.requireLayoutNode(parentSemanticsNode).invalidateSemantics$ui();
                return Boolean.FALSE;
            case 5:
                ParagraphInfo paragraphInfo = (ParagraphInfo) obj;
                StringBuilder sb = new StringBuilder("[");
                sb.append(paragraphInfo.startIndex);
                sb.append(", ");
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, paragraphInfo.endIndex, ')');
            case 6:
                obj.getClass();
                List list = (List) obj;
                Object obj2 = list.get(0);
                Boolean bool = obj2 != null ? (Boolean) obj2 : null;
                bool.getClass();
                boolean booleanValue = bool.booleanValue();
                Object obj3 = list.get(1);
                WorkLauncherImpl workLauncherImpl = TextPainterKt.emojiSupportMatchSaver;
                if (!Intrinsics.areEqual(obj3, Boolean.FALSE) && obj3 != null) {
                    emojiSupportMatch = (EmojiSupportMatch) ((Function1) workLauncherImpl.workTaskExecutor).invoke(obj3);
                }
                emojiSupportMatch.getClass();
                return new PlatformParagraphStyle(emojiSupportMatch.value, booleanValue);
            case 7:
                obj.getClass();
                return new EmojiSupportMatch(((Integer) obj).intValue());
            case 8:
                obj.getClass();
                return new LineBreak(((Integer) obj).intValue());
            case 9:
                obj.getClass();
                List list2 = (List) obj;
                Object obj4 = list2.get(0);
                TextMotion.Linearity linearity = (Intrinsics.areEqual(obj4, Boolean.FALSE) || obj4 == null) ? null : (TextMotion.Linearity) ((Function1) TextPainterKt.TextMotionLinearitySaver.workTaskExecutor).invoke(obj4);
                linearity.getClass();
                int i = linearity.value;
                Object obj5 = list2.get(1);
                Boolean bool2 = obj5 != null ? (Boolean) obj5 : null;
                bool2.getClass();
                return new TextMotion(i, bool2.booleanValue());
            case 10:
                obj.getClass();
                return new TextMotion.Linearity(((Integer) obj).intValue());
            case 11:
                throw Boxes$$ExternalSyntheticOutline1.m(obj);
            case 12:
                Cubic cubic = (Cubic) obj;
                cubic.getClass();
                return "[" + cubic + ']';
            case 13:
                ((View) obj).getClass();
                return Unit.INSTANCE;
            case 14:
                ((View) obj).getClass();
                return Unit.INSTANCE;
            case 15:
                Context context = (Context) obj;
                context.getClass();
                if (context instanceof ContextWrapper) {
                    return ((ContextWrapper) context).getBaseContext();
                }
                return null;
            case 16:
                Context context2 = (Context) obj;
                context2.getClass();
                if (context2 instanceof ContextWrapper) {
                    return ((ContextWrapper) context2).getBaseContext();
                }
                return null;
            case 17:
                ((CreationExtras) obj).getClass();
                return new NavControllerViewModel();
            case 18:
                NavDestination navDestination = (NavDestination) obj;
                navDestination.getClass();
                return navDestination.parent;
            case 19:
                NavDestination navDestination2 = (NavDestination) obj;
                navDestination2.getClass();
                if (!(navDestination2 instanceof NavGraph)) {
                    return null;
                }
                TraceParser traceParser = ((NavGraph) navDestination2).impl;
                return traceParser.findNode$navigation_common_release(traceParser.state);
            case 20:
                View view2 = (View) obj;
                view2.getClass();
                Object tag = view2.getTag(R.id.nav_controller_view_tag);
                if (tag instanceof WeakReference) {
                    return (NavHostController) ((WeakReference) tag).get();
                }
                if (tag instanceof NavHostController) {
                    return (NavHostController) tag;
                }
                return null;
            case 21:
                return new BackStackEntryIdViewModel(SavedStateHandleSupport.createSavedStateHandle((CreationExtras) obj));
            case 22:
                return EnterExitTransitionKt.fadeIn$default(AnimatableKt.tween$default(700, 0, null, 6), 2);
            case 23:
                NavDestination navDestination3 = ((NavBackStackEntry) ((AnimatedContentTransitionScopeImpl) obj).getTargetState()).destination;
                navDestination3.getClass();
                int i2 = NavDestination.$r8$clinit;
                for (NavDestination navDestination4 : NavDestination.Companion.getHierarchy((ComposeNavigator.Destination) navDestination3)) {
                }
                return null;
            case 24:
                return EnterExitTransitionKt.fadeOut$default(AnimatableKt.tween$default(700, 0, null, 6), 2);
            case 25:
                return ((NavBackStackEntry) obj).id;
            case 26:
                Pair pair = (Pair) obj;
                pair.getClass();
                return (String) pair.first;
            case 27:
                ((CreationExtras) obj).getClass();
                return new FragmentNavigator.ClearEntryStateViewModel();
            case 28:
                CreationExtras creationExtras = (CreationExtras) obj;
                creationExtras.getClass();
                return new NavBackStackEntryImpl.SavedStateViewModel(SavedStateHandleSupport.createSavedStateHandle(creationExtras));
            default:
                NavDestination navDestination5 = (NavDestination) obj;
                navDestination5.getClass();
                NavGraph navGraph = navDestination5.parent;
                if (navGraph == null || navGraph.impl.state != navDestination5.impl.id) {
                    return null;
                }
                return navGraph;
        }
    }

    public /* synthetic */ Navigation$$ExternalSyntheticLambda1(int i) {
        this.$r8$classId = i;
    }
}
