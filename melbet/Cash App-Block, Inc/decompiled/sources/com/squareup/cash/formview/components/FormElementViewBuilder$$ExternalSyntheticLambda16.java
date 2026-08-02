package com.squareup.cash.formview.components;

import androidx.camera.viewfinder.compose.ViewfinderKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.text.TextStyle;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.molecule.PlatformKt;
import com.squareup.cash.family.familyhub.views.FamilyMemberRowKt$$ExternalSyntheticLambda5;
import com.squareup.cash.formview.components.arcade.ArcadeFormHeroKt;
import com.squareup.protos.cash.ui.Animation;
import com.squareup.protos.franklin.api.FormBlocker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* loaded from: classes6.dex */
public final /* synthetic */ class FormElementViewBuilder$$ExternalSyntheticLambda16 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ FormBlocker.Element.HeroElement f$0;

    public /* synthetic */ FormElementViewBuilder$$ExternalSyntheticLambda16(FormBlocker.Element.HeroElement heroElement, int i) {
        this.$r8$classId = i;
        this.f$0 = heroElement;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        String str = null;
        FormBlocker.Element.HeroElement heroElement = this.f$0;
        Composer composer = (Composer) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    ArcadeFormHeroKt.ArcadeFormHero(heroElement, null, gapComposer, 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                GapComposer gapComposer2 = (GapComposer) composer;
                if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.CenterHorizontally, gapComposer2, 48);
                    int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, fillMaxWidth);
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
                    Updater.m576setimpl(gapComposer2, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    Animation animation = heroElement.animation;
                    String str2 = heroElement.title;
                    if (str2 == null || StringsKt.isBlank(str2)) {
                        str2 = null;
                    }
                    String str3 = heroElement.subtitle;
                    if (str3 != null && !StringsKt.isBlank(str3)) {
                        str = str3;
                    }
                    if (animation != null) {
                        gapComposer2.startReplaceGroup(-1658989752);
                        Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(companion, RecyclerView.DECELERATION_RATE, 24.0f, 1);
                        Float f = heroElement.animation_width_percentage;
                        ArcadeFormHeroKt.LottieAnimation(animation, SizeKt.fillMaxWidth(m300paddingVpY3zN4$default, f != null ? f.floatValue() : 1.0f), gapComposer2, 0);
                        gapComposer2.end(false);
                    } else {
                        gapComposer2.startReplaceGroup(-1658784811);
                        gapComposer2.end(false);
                    }
                    ViewfinderKt.HeroHeader(Expect_jvmKt.rememberComposableLambda(1060928417, new FamilyMemberRowKt$$ExternalSyntheticLambda5(str2, 17), gapComposer2), SizeKt.fillMaxWidth(companion, 1.0f), Expect_jvmKt.rememberComposableLambda(1092565539, new FamilyMemberRowKt$$ExternalSyntheticLambda5(str, 18), gapComposer2), (TextStyle) null, gapComposer2, 438, 8);
                    gapComposer2.end(true);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }
}
