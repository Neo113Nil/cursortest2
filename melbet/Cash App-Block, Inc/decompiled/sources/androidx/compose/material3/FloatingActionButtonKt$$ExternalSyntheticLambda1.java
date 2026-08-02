package androidx.compose.material3;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.core.Animatable;
import androidx.compose.foundation.layout.Arrangement$Center$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.draw.ScaleKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.TestTagKt;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.molecule.PlatformKt;
import com.squareup.cash.common.composeui.VisibleKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.mooncake.compose_ui.MooncakeTheme;
import com.squareup.cash.mooncake.compose_ui.components.KeypadKt;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class FloatingActionButtonKt$$ExternalSyntheticLambda1 implements Function2 {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Modifier f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ long f$3;
    public final /* synthetic */ long f$4;
    public final /* synthetic */ Object f$5;
    public final /* synthetic */ Object f$7;
    public final /* synthetic */ int f$8;

    public /* synthetic */ FloatingActionButtonKt$$ExternalSyntheticLambda1(Modifier modifier, String str, Animatable animatable, long j, Animatable animatable2, int i, long j2, Animatable animatable3) {
        this.f$1 = modifier;
        this.f$0 = str;
        this.f$2 = animatable;
        this.f$3 = j;
        this.f$5 = animatable2;
        this.f$8 = i;
        this.f$4 = j2;
        this.f$7 = animatable3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Object obj3 = this.f$7;
        Object obj4 = this.f$5;
        Object obj5 = this.f$2;
        Object obj6 = this.f$0;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                FloatingActionButtonKt.m531FloatingActionButtonXz6DiA((Function0) obj6, this.f$1, (Shape) obj5, this.f$3, this.f$4, (FloatingActionButtonElevation) obj4, (ComposableLambdaImpl) obj3, (Composer) obj, Updater.updateChangedFlags(this.f$8 | 1));
                return Unit.INSTANCE;
            default:
                String str = (String) obj6;
                Animatable animatable = (Animatable) obj5;
                Animatable animatable2 = (Animatable) obj4;
                Animatable animatable3 = (Animatable) obj3;
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                boolean shouldExecute = gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2);
                Applier applier = gapComposer.applier;
                if (shouldExecute) {
                    Arrangement$Center$1 arrangement$Center$1 = SpacerKt.Center;
                    BiasAlignment.Horizontal horizontal = Alignment.Companion.CenterHorizontally;
                    Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(this.f$1, 24.0f);
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Center$1, horizontal, gapComposer, 54);
                    int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m298padding3ABfNKs);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer.startReusableNode();
                    if (gapComposer.inserting) {
                        gapComposer.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer.useNode();
                    }
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
                    Updater.m576setimpl(gapComposer, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                    Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
                    Integer valueOf = Integer.valueOf(hashCode);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
                    Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$13);
                    OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                    Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
                    Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$14);
                    HorizontalAlignElement horizontalAlignElement = new HorizontalAlignElement(horizontal);
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                    int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, horizontalAlignElement);
                    gapComposer.startReusableNode();
                    if (gapComposer.inserting) {
                        gapComposer.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer.useNode();
                    }
                    Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                    Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                    BiasAlignment biasAlignment = Alignment.Companion.Center;
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                    Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(boxScopeInstance.align(companion, biasAlignment), 60.0f);
                    float floatValue = ((Number) animatable.getValue()).floatValue();
                    VisibleKt.m3484BackgroundCircleRPmYEkk(0, this.f$3, gapComposer, AlphaKt.alpha(ScaleKt.scale(m285size3ABfNKs, floatValue, floatValue), ((Number) animatable.getValue()).floatValue()));
                    Modifier m285size3ABfNKs2 = SizeKt.m285size3ABfNKs(boxScopeInstance.align(TestTagKt.testTag(companion, "IconAnimationView_Icon"), biasAlignment), 42.0f);
                    float floatValue2 = ((Number) animatable2.getValue()).floatValue();
                    VisibleKt.m3490IconXOJAsU(this.f$8, 0, this.f$4, gapComposer, AlphaKt.alpha(ScaleKt.scale(m285size3ABfNKs2, floatValue2, floatValue2), ((Number) animatable2.getValue()).floatValue()));
                    gapComposer.end(true);
                    if (str == null) {
                        gapComposer.startReplaceGroup(-1477821653);
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(-1477821652);
                        KeypadKt.m3651TextPdH14aY(0, 0, 3, 0, 0, 0, 3824, MooncakeTheme.getColors(gapComposer).tertiaryLabel, (Composer) gapComposer, OffsetKt.m273offsetVpY3zN4$default(AlphaKt.alpha(SpacerKt.m302paddingqDBjuR0$default(new HorizontalAlignElement(horizontal), RecyclerView.DECELERATION_RATE, 16.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13), ((Number) animatable2.getValue()).floatValue()), RecyclerView.DECELERATION_RATE, ((Number) animatable3.getValue()).floatValue(), 1), MooncakeTheme.getTypography(gapComposer).smallBody, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                        gapComposer = gapComposer;
                        gapComposer.end(false);
                    }
                    gapComposer.end(true);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ FloatingActionButtonKt$$ExternalSyntheticLambda1(Function0 function0, Modifier modifier, Shape shape, long j, long j2, FloatingActionButtonElevation floatingActionButtonElevation, ComposableLambdaImpl composableLambdaImpl, int i) {
        this.f$0 = function0;
        this.f$1 = modifier;
        this.f$2 = shape;
        this.f$3 = j;
        this.f$4 = j2;
        this.f$5 = floatingActionButtonElevation;
        this.f$7 = composableLambdaImpl;
        this.f$8 = i;
    }
}
