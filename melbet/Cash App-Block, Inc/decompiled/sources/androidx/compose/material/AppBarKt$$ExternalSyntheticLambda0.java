package androidx.compose.material;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.layout.Arrangement$End$1;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DynamicProvidableCompositionLocal;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.util.DBUtil;
import app.cash.molecule.PlatformKt;
import com.squareup.cash.arcade.components.ScreenScaffoldKt;
import com.squareup.cash.arcade.components.ScrollingScaffoldContentScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class AppBarKt$$ExternalSyntheticLambda0 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function2 f$0;
    public final /* synthetic */ ComposableLambdaImpl f$1;
    public final /* synthetic */ ComposableLambdaImpl f$2;

    public /* synthetic */ AppBarKt$$ExternalSyntheticLambda0(Function2 function2, ComposableLambdaImpl composableLambdaImpl, ComposableLambdaImpl composableLambdaImpl2, int i) {
        this.$r8$classId = i;
        this.f$0 = function2;
        this.f$1 = composableLambdaImpl;
        this.f$2 = composableLambdaImpl2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        double d;
        boolean z;
        Arrangement$Top$1 arrangement$Top$1;
        Modifier.Companion companion;
        Integer num;
        boolean z2;
        int i = this.$r8$classId;
        ComposableLambdaImpl composableLambdaImpl = this.f$2;
        ComposableLambdaImpl composableLambdaImpl2 = this.f$1;
        Function2 function2 = this.f$0;
        switch (i) {
            case 0:
                int i2 = 3;
                RowScope rowScope = (RowScope) obj;
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                Arrangement$End$1 arrangement$End$1 = SpacerKt.Start;
                BiasAlignment.Vertical vertical = Alignment.Companion.CenterVertically;
                if ((intValue & 6) == 0) {
                    intValue |= ((GapComposer) composer).changed(rowScope) ? 4 : 2;
                }
                GapComposer gapComposer = (GapComposer) composer;
                boolean shouldExecute = gapComposer.shouldExecute(intValue & 1, (intValue & 19) != 18);
                Applier applier = gapComposer.applier;
                if (shouldExecute) {
                    if (function2 == null) {
                        gapComposer.startReplaceGroup(-1394361313);
                        SpacerKt.Spacer(gapComposer, AppBarKt.TitleInsetWithoutIcon);
                        gapComposer.end(false);
                        d = 0.5d;
                        z = true;
                    } else {
                        gapComposer.startReplaceGroup(-1394295686);
                        Modifier modifier = AppBarKt.TitleIconModifier;
                        RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement$End$1, vertical, gapComposer, 48);
                        int currentCompositeKeyHash = Updater.getCurrentCompositeKeyHash(gapComposer);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                        Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, modifier);
                        ComposeUiNode.Companion.getClass();
                        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                        if (applier == null) {
                            Updater.invalidApplier();
                            throw null;
                        }
                        gapComposer.startReusableNode();
                        d = 0.5d;
                        if (gapComposer.inserting) {
                            gapComposer.createNode(layoutNode$Companion$Constructor$1);
                        } else {
                            gapComposer.useNode();
                        }
                        Updater.m576setimpl(gapComposer, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                        Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetCompositeKeyHash;
                        if (gapComposer.inserting || !Intrinsics.areEqual(gapComposer.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            Recorder$$ExternalSyntheticOutline1.m(currentCompositeKeyHash, gapComposer, currentCompositeKeyHash, composeUiNode$Companion$SetModifier$1);
                        }
                        Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
                        DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal = ContentAlphaKt.LocalContentAlpha;
                        long j = ((Color) gapComposer.consume(ContentColorKt.LocalContentColor)).value;
                        Updater.CompositionLocalProvider(dynamicProvidableCompositionLocal.defaultProvidedValue$runtime(Float.valueOf((!((Colors) gapComposer.consume(ColorsKt.LocalColors)).isLight() ? ((double) ColorKt.m690luminance8_81llA(j)) < 0.5d : ((double) ColorKt.m690luminance8_81llA(j)) > 0.5d) ? 0.87f : 1.0f)), function2, gapComposer, 8);
                        z = true;
                        gapComposer.end(true);
                        gapComposer.end(false);
                    }
                    Modifier weight = rowScope.weight(1.0f, SizeKt.fillMaxHeight(Modifier.Companion.$$INSTANCE, 1.0f), z);
                    RowMeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement$End$1, vertical, gapComposer, 48);
                    int currentCompositeKeyHash2 = Updater.getCurrentCompositeKeyHash(gapComposer);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, weight);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                    if (applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer.startReusableNode();
                    if (gapComposer.inserting) {
                        gapComposer.createNode(layoutNode$Companion$Constructor$12);
                    } else {
                        gapComposer.useNode();
                    }
                    Updater.m576setimpl(gapComposer, rowMeasurePolicy2, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetCompositeKeyHash;
                    if (gapComposer.inserting || !Intrinsics.areEqual(gapComposer.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        Recorder$$ExternalSyntheticOutline1.m(currentCompositeKeyHash2, gapComposer, currentCompositeKeyHash2, composeUiNode$Companion$SetModifier$12);
                    }
                    Updater.m576setimpl(gapComposer, materializeModifier2, ComposeUiNode.Companion.SetModifier);
                    TextKt.ProvideTextStyle(((Typography) gapComposer.consume(TypographyKt.LocalTypography)).h6, Expect_jvmKt.rememberComposableLambda(1206983395, new AppBarKt$$ExternalSyntheticLambda4(composableLambdaImpl2, 0), gapComposer), gapComposer, 48);
                    gapComposer.end(true);
                    DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal2 = ContentAlphaKt.LocalContentAlpha;
                    long j2 = ((Color) gapComposer.consume(ContentColorKt.LocalContentColor)).value;
                    Updater.CompositionLocalProvider(dynamicProvidableCompositionLocal2.defaultProvidedValue$runtime(Float.valueOf((!((Colors) gapComposer.consume(ColorsKt.LocalColors)).isLight() ? ((double) ColorKt.m690luminance8_81llA(j2)) < d : ((double) ColorKt.m690luminance8_81llA(j2)) > d) ? 0.6f : 0.74f)), Expect_jvmKt.rememberComposableLambda(-1033635954, new AppBarKt$$ExternalSyntheticLambda4(composableLambdaImpl, i2), gapComposer), gapComposer, 56);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                ScrollingScaffoldContentScope scrollingScaffoldContentScope = (ScrollingScaffoldContentScope) obj;
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
                scrollingScaffoldContentScope.getClass();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((GapComposer) composer2).changed(scrollingScaffoldContentScope) ? 4 : 2;
                }
                GapComposer gapComposer2 = (GapComposer) composer2;
                boolean shouldExecute2 = gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 19) != 18);
                Applier applier2 = gapComposer2.applier;
                if (shouldExecute2) {
                    BiasAlignment.Horizontal horizontal2 = Alignment.Companion.CenterHorizontally;
                    Arrangement$Top$1 arrangement$Top$12 = SpacerKt.Top;
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$12, horizontal2, gapComposer2, 48);
                    int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer2.currentCompositionLocalScope();
                    Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
                    Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer2, companion2);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$13 = ComposeUiNode.Companion.Constructor;
                    if (applier2 == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer2.startReusableNode();
                    if (gapComposer2.inserting) {
                        gapComposer2.createNode(layoutNode$Companion$Constructor$13);
                    } else {
                        gapComposer2.useNode();
                    }
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetMeasurePolicy;
                    Updater.m576setimpl(gapComposer2, columnMeasurePolicy, composeUiNode$Companion$SetModifier$13);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                    Updater.m576setimpl(gapComposer2, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$14);
                    Integer valueOf = Integer.valueOf(hashCode);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$15 = ComposeUiNode.Companion.SetCompositeKeyHash;
                    Updater.m576setimpl(gapComposer2, valueOf, composeUiNode$Companion$SetModifier$15);
                    OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                    Updater.m575reconcileimpl(gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    int i3 = intValue2;
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$16 = ComposeUiNode.Companion.SetModifier;
                    Updater.m576setimpl(gapComposer2, materializeModifier3, composeUiNode$Companion$SetModifier$16);
                    DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer2, null);
                    if (function2 != null) {
                        gapComposer2.startReplaceGroup(413700263);
                        Modifier markAsScaffoldTitle = ScreenScaffoldKt.markAsScaffoldTitle(companion2, scrollingScaffoldContentScope, gapComposer2, ((i3 << 3) & 112) | 6);
                        arrangement$Top$1 = arrangement$Top$12;
                        ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer2, 0);
                        companion = companion2;
                        num = 6;
                        int hashCode2 = Long.hashCode(gapComposer2.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope4 = gapComposer2.currentCompositionLocalScope();
                        Modifier materializeModifier4 = PlatformKt.materializeModifier(gapComposer2, markAsScaffoldTitle);
                        gapComposer2.startReusableNode();
                        if (gapComposer2.inserting) {
                            gapComposer2.createNode(layoutNode$Companion$Constructor$13);
                        } else {
                            gapComposer2.useNode();
                        }
                        Updater.m576setimpl(gapComposer2, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$13);
                        Updater.m576setimpl(gapComposer2, currentCompositionLocalScope4, composeUiNode$Companion$SetModifier$14);
                        Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer2, composeUiNode$Companion$SetModifier$15, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
                        Updater.m576setimpl(gapComposer2, materializeModifier4, composeUiNode$Companion$SetModifier$16);
                        function2.invoke(gapComposer2, 0);
                        z2 = false;
                        DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer2, null);
                        gapComposer2.end(true);
                        gapComposer2.end(false);
                    } else {
                        arrangement$Top$1 = arrangement$Top$12;
                        companion = companion2;
                        num = 6;
                        z2 = false;
                        gapComposer2.startReplaceGroup(413858828);
                        gapComposer2.end(false);
                    }
                    Modifier.Companion companion3 = companion;
                    Modifier aspectRatio = OffsetKt.aspectRatio(1.0f, SizeKt.m291widthInVpY3zN4(SpacerKt.m302paddingqDBjuR0$default(companion3, 24.0f, RecyclerView.DECELERATION_RATE, 24.0f, RecyclerView.DECELERATION_RATE, 10), 200.0f, 300.0f), z2);
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, z2);
                    Arrangement$Top$1 arrangement$Top$13 = arrangement$Top$1;
                    int hashCode3 = Long.hashCode(gapComposer2.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope5 = gapComposer2.currentCompositionLocalScope();
                    Modifier materializeModifier5 = PlatformKt.materializeModifier(gapComposer2, aspectRatio);
                    gapComposer2.startReusableNode();
                    if (gapComposer2.inserting) {
                        gapComposer2.createNode(layoutNode$Companion$Constructor$13);
                    } else {
                        gapComposer2.useNode();
                    }
                    Updater.m576setimpl(gapComposer2, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$13);
                    Updater.m576setimpl(gapComposer2, currentCompositionLocalScope5, composeUiNode$Companion$SetModifier$14);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer2, composeUiNode$Companion$SetModifier$15, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    Updater.m576setimpl(gapComposer2, materializeModifier5, composeUiNode$Companion$SetModifier$16);
                    Integer num2 = num;
                    composableLambdaImpl2.invoke(BoxScopeInstance.INSTANCE, gapComposer2, num2);
                    gapComposer2.end(true);
                    Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(companion3, RecyclerView.DECELERATION_RATE, 32.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13);
                    ColumnMeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(arrangement$Top$13, horizontal, gapComposer2, 0);
                    int hashCode4 = Long.hashCode(gapComposer2.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope6 = gapComposer2.currentCompositionLocalScope();
                    Modifier materializeModifier6 = PlatformKt.materializeModifier(gapComposer2, m302paddingqDBjuR0$default);
                    gapComposer2.startReusableNode();
                    if (gapComposer2.inserting) {
                        gapComposer2.createNode(layoutNode$Companion$Constructor$13);
                    } else {
                        gapComposer2.useNode();
                    }
                    Updater.m576setimpl(gapComposer2, columnMeasurePolicy3, composeUiNode$Companion$SetModifier$13);
                    Updater.m576setimpl(gapComposer2, currentCompositionLocalScope6, composeUiNode$Companion$SetModifier$14);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode4, gapComposer2, composeUiNode$Companion$SetModifier$15, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    Updater.m576setimpl(gapComposer2, materializeModifier6, composeUiNode$Companion$SetModifier$16);
                    composableLambdaImpl.invoke(ColumnScopeInstance.INSTANCE, gapComposer2, num2);
                    gapComposer2.end(true);
                    gapComposer2.end(true);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }
}
