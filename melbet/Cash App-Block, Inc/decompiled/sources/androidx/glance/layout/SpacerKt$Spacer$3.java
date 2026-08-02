package androidx.glance.layout;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.ComposedModifier;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.contentcapture.AndroidContentCaptureManager;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5$1$1;
import androidx.compose.ui.window.DialogLayout;
import androidx.compose.ui.window.PopupLayout;
import androidx.glance.GlanceModifier;
import app.cash.molecule.PlatformKt;
import com.squareup.cash.graphics.swampgl.GLThread$launch$1;
import com.squareup.cash.presenters.AliasFormatter;
import com.squareup.workflow1.InterceptedRenderContext;
import com.squareup.workflow1.ui.LayoutRunner;
import com.squareup.workflow1.ui.ViewEnvironment;
import com.squareup.workflow1.ui.WorkflowViewStub;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.TypeIntrinsics;
import org.intellij.markdown.flavours.gfm.GFMMarkerProcessor;
import org.intellij.markdown.parser.LookaheadText$Position;
import org.intellij.markdown.parser.constraints.CommonMarkdownConstraints;
import org.intellij.markdown.parser.markerblocks.MarkerBlockProvider;

/* loaded from: classes3.dex */
public final class SpacerKt$Spacer$3 extends Lambda implements Function2 {
    public final /* synthetic */ Object $modifier;
    public final /* synthetic */ int $r8$classId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SpacerKt$Spacer$3(Object obj, int i) {
        super(2);
        this.$r8$classId = i;
        this.$modifier = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        Unit unit = null;
        boolean z = false;
        Object obj3 = this.$modifier;
        switch (i) {
            case 0:
                ((Number) obj2).intValue();
                SpacerKt.Spacer((GlanceModifier) obj3, (Composer) obj, 1);
                return Unit.INSTANCE;
            case 1:
                Modifier modifier = (Modifier) obj;
                Modifier modifier2 = (Modifier.Element) obj2;
                Composer composer = (Composer) obj3;
                if (modifier2 instanceof ComposedModifier) {
                    Function3 function3 = ((ComposedModifier) modifier2).factory;
                    TypeIntrinsics.beforeCheckcastToFunctionOfArity(3, function3);
                    modifier2 = PlatformKt.materializeImpl(composer, (Modifier) function3.invoke(companion, composer, 0));
                }
                return modifier.then(modifier2);
            case 2:
                ((AndroidContentCaptureManager) obj3).updateBuffersOnAppeared(((Number) obj).intValue(), (SemanticsNode) obj2);
                return Unit.INSTANCE;
            case 3:
                Composer composer2 = (Composer) obj;
                int intValue = ((Number) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer2;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    List list = (List) obj3;
                    int size = list.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        Function2 function2 = (Function2) list.get(i2);
                        int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                        ComposeUiNode.Companion.getClass();
                        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.VirtualConstructor;
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
                        Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                        function2.invoke(gapComposer, 0);
                        gapComposer.end(true);
                    }
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 4:
                Composer composer3 = (Composer) obj;
                int intValue2 = ((Number) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer3;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    Object rememberedValue = gapComposer2.rememberedValue();
                    if (rememberedValue == Composer.Companion.Empty) {
                        rememberedValue = AndroidPopup_androidKt$Popup$5$1$1.INSTANCE$1;
                        gapComposer2.updateRememberedValue(rememberedValue);
                    }
                    AliasFormatter.access$DialogLayout(SemanticsModifierKt.semantics(companion, false, (Function1) rememberedValue), (Function2) ((MutableState) obj3).getValue(), gapComposer2, 0);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 5:
                ((Number) obj2).intValue();
                ((DialogLayout) obj3).Content((Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 6:
                ((Number) obj2).intValue();
                ((PopupLayout) obj3).Content((Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 7:
                String str = (String) obj;
                Function1 function1 = (Function1) obj2;
                str.getClass();
                function1.getClass();
                ((InterceptedRenderContext) obj3).baseRenderContext.runningSideEffect(str, new GLThread$launch$1(function1, null == true ? 1 : 0, 6));
                return Unit.INSTANCE;
            case 8:
                ViewEnvironment viewEnvironment = (ViewEnvironment) obj2;
                obj.getClass();
                viewEnvironment.getClass();
                return new Pair(((Function1) obj3).invoke(obj), viewEnvironment);
            case 9:
                ViewEnvironment viewEnvironment2 = (ViewEnvironment) obj2;
                obj.getClass();
                viewEnvironment2.getClass();
                ((LayoutRunner) obj3).showRendering(obj, viewEnvironment2);
                return Unit.INSTANCE;
            case 10:
                ViewGroup viewGroup = (ViewGroup) obj;
                View view = (View) obj2;
                viewGroup.getClass();
                view.getClass();
                WorkflowViewStub workflowViewStub = (WorkflowViewStub) obj3;
                int indexOfChild = viewGroup.indexOfChild(workflowViewStub.actual);
                viewGroup.removeView(workflowViewStub.actual);
                ViewGroup.LayoutParams layoutParams = workflowViewStub.actual.getLayoutParams();
                if (layoutParams != null) {
                    viewGroup.addView(view, indexOfChild, layoutParams);
                    unit = Unit.INSTANCE;
                }
                if (unit == null) {
                    viewGroup.addView(view, indexOfChild);
                }
                return Unit.INSTANCE;
            default:
                LookaheadText$Position lookaheadText$Position = (LookaheadText$Position) obj;
                CommonMarkdownConstraints commonMarkdownConstraints = (CommonMarkdownConstraints) obj2;
                lookaheadText$Position.getClass();
                commonMarkdownConstraints.getClass();
                Iterator it = ((GFMMarkerProcessor) obj3).markerBlockProviders.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((MarkerBlockProvider) it.next()).interruptsParagraph(lookaheadText$Position, commonMarkdownConstraints)) {
                            z = true;
                        }
                    }
                }
                return Boolean.valueOf(z);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SpacerKt$Spacer$3(Object obj, int i, int i2) {
        super(2);
        this.$r8$classId = i2;
        this.$modifier = obj;
    }
}
