package com.squareup.cash.arcade.treehouse;

import androidx.compose.foundation.layout.AndroidWindowInsets;
import androidx.compose.foundation.layout.Arrangement$End$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsHolder;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.text.TextStyle;
import androidx.room.Room;
import app.cash.arcade.values.ImageResource;
import app.cash.molecule.PlatformKt;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.avatar.components.BadgedAvatarKt$$ExternalSyntheticLambda4;
import com.squareup.cash.banking.views.BankingDialogKt$$ExternalSyntheticLambda2;
import com.squareup.cash.banking.views.TransfersViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.mooncake.resources.ImageResourcesKt;
import com.squareup.cash.mooncake.resources.ResourcesKt;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes5.dex */
public final /* synthetic */ class ToastBinding$ToastView$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ToastBinding f$0;

    public /* synthetic */ ToastBinding$ToastView$$ExternalSyntheticLambda0(ToastBinding toastBinding, int i) {
        this.$r8$classId = i;
        this.f$0 = toastBinding;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ComposableLambdaImpl composableLambdaImpl;
        ComposableLambdaImpl composableLambdaImpl2;
        int i = this.$r8$classId;
        ToastBinding toastBinding = this.f$0;
        int i2 = 1;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    WeakHashMap weakHashMap = WindowInsetsHolder.viewMap;
                    AndroidWindowInsets androidWindowInsets = Arrangement$End$1.current(gapComposer).systemBars;
                    Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                    Modifier fillMaxSize = SizeKt.fillMaxSize(OffsetKt.windowInsetsPadding(companion, androidWindowInsets), 1.0f);
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                    int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, fillMaxSize);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    ComposableLambdaImpl composableLambdaImpl3 = null;
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
                    Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    Modifier align = BoxScopeInstance.INSTANCE.align(SizeKt.fillMaxWidth(companion, 1.0f), Alignment.Companion.BottomCenter);
                    ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(1204251760, new ToastBinding$ToastView$$ExternalSyntheticLambda0(toastBinding, i2), gapComposer);
                    ImageResource imageResource = (ImageResource) toastBinding.icon$delegate.getValue();
                    Integer drawableResId = imageResource != null ? ImageResourcesKt.toDrawableResId(imageResource, ResourcesKt.mooncakeResourceIndex) : null;
                    if (drawableResId == null) {
                        gapComposer.startReplaceGroup(1778658929);
                        gapComposer.end(false);
                        composableLambdaImpl = null;
                    } else {
                        gapComposer.startReplaceGroup(1778658930);
                        ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(-1468214805, new BadgedAvatarKt$$ExternalSyntheticLambda4(drawableResId.intValue(), toastBinding, 3), gapComposer);
                        gapComposer.end(false);
                        composableLambdaImpl = rememberComposableLambda2;
                    }
                    String str = (String) toastBinding.body$delegate.getValue();
                    if (str == null) {
                        gapComposer.startReplaceGroup(1778803575);
                        gapComposer.end(false);
                        composableLambdaImpl2 = null;
                    } else {
                        gapComposer.startReplaceGroup(1778803576);
                        ComposableLambdaImpl rememberComposableLambda3 = Expect_jvmKt.rememberComposableLambda(2067891673, new TransfersViewKt$$ExternalSyntheticLambda5(str, 21), gapComposer);
                        gapComposer.end(false);
                        composableLambdaImpl2 = rememberComposableLambda3;
                    }
                    String str2 = (String) toastBinding.actionText$delegate.getValue();
                    if (str2 == null) {
                        gapComposer.startReplaceGroup(1778859499);
                    } else {
                        gapComposer.startReplaceGroup(1778859500);
                        composableLambdaImpl3 = Expect_jvmKt.rememberComposableLambda(2037537716, new BankingDialogKt$$ExternalSyntheticLambda2(5, str2, toastBinding), gapComposer);
                    }
                    gapComposer.end(false);
                    ModalKt.m3380ToastBAHpl2s(align, null, rememberComposableLambda, composableLambdaImpl, composableLambdaImpl2, composableLambdaImpl3, null, null, gapComposer, MLKEMEngine.KyberPolyBytes, EnumC0170g.SDK_ASSET_ICON_EXTERNAL_VALUE);
                    gapComposer.end(true);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer2, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, (String) toastBinding.headline$delegate.getValue(), (Map) null, (Function1) null, false);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }
}
