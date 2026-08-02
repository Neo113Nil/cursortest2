package com.google.android.gms.internal.mlkit_genai_prompt;

import androidx.compose.foundation.gestures.Draggable2DKt;
import androidx.compose.foundation.shape.GenericShape;
import androidx.compose.foundation.text.selection.SelectionGesturesKt$updateSelectionTouchMode$1$1;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.input.pointer.PointerInputScope;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.banking.sections.MoreWaysToAddMoneySectionItemKt$$ExternalSyntheticLambda0;
import com.squareup.cash.banking.views.BankingDialogKt$$ExternalSyntheticLambda5;
import com.squareup.cash.card.onboarding.CardStudioViewV2Kt$$ExternalSyntheticLambda7;
import com.squareup.util.Strings;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public abstract class zzade {
    public static final void AddMoneyOptionRow(Icons icons, String str, BankingDialogKt$$ExternalSyntheticLambda5 bankingDialogKt$$ExternalSyntheticLambda5, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1923509730);
        int i2 = (gapComposer.changed(icons == null ? -1 : icons.ordinal()) ? 4 : 2) | i | (gapComposer.changed(str) ? 32 : 16) | (gapComposer.changedInstance(bankingDialogKt$$ExternalSyntheticLambda5) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            ArcadeThemeKt.ArcadeTheme(Colors.copy$default(Strings.getColors(gapComposer), Colors.Component.copy$default(Strings.getColors(gapComposer).component, null, null, Colors.Component.Cell.copy$default(Strings.getColors(gapComposer).component.cell, new Colors.Component.Cell.Background(Color.Unspecified, Strings.getColors(gapComposer).component.cell.background.pressed)), null, null, null, null, 134217695), null, 55), null, null, Expect_jvmKt.rememberComposableLambda(-1182007053, new MoreWaysToAddMoneySectionItemKt$$ExternalSyntheticLambda0(bankingDialogKt$$ExternalSyntheticLambda5, icons, str), gapComposer), gapComposer, 3072, 6);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MoreWaysToAddMoneySectionItemKt$$ExternalSyntheticLambda0(icons, str, bankingDialogKt$$ExternalSyntheticLambda5, i);
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x003d -> B:10:0x0040). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object access$awaitFirstRightClickDown(androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine r7, kotlin.coroutines.jvm.internal.BaseContinuationImpl r8) {
        /*
            boolean r0 = r8 instanceof androidx.compose.foundation.text.contextmenu.gestures.RightClickGesturesKt$awaitFirstRightClickDown$1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.foundation.text.contextmenu.gestures.RightClickGesturesKt$awaitFirstRightClickDown$1 r0 = (androidx.compose.foundation.text.contextmenu.gestures.RightClickGesturesKt$awaitFirstRightClickDown$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.text.contextmenu.gestures.RightClickGesturesKt$awaitFirstRightClickDown$1 r0 = new androidx.compose.foundation.text.contextmenu.gestures.RightClickGesturesKt$awaitFirstRightClickDown$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L29
            androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine r7 = r0.L$0
            papa.SafeTrace.throwOnFailure(r8)
            goto L40
        L29:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            bo.app.a$$ExternalSyntheticBUOutline0.m$1(r7)
            r7 = 0
            return r7
        L30:
            papa.SafeTrace.throwOnFailure(r8)
        L33:
            r0.L$0 = r7
            r0.label = r3
            androidx.compose.ui.input.pointer.PointerEventPass r8 = androidx.compose.ui.input.pointer.PointerEventPass.Main
            java.lang.Object r8 = r7.awaitPointerEvent(r8, r0)
            if (r8 != r1) goto L40
            return r1
        L40:
            androidx.compose.ui.input.pointer.PointerEvent r8 = (androidx.compose.ui.input.pointer.PointerEvent) r8
            int r2 = r8.buttons
            java.util.List r8 = r8.changes
            r2 = r2 & 66
            if (r2 == 0) goto L33
            r2 = r8
            java.util.Collection r2 = (java.util.Collection) r2
            int r2 = r2.size()
            r4 = 0
            r5 = r4
        L53:
            if (r5 >= r2) goto L65
            java.lang.Object r6 = r8.get(r5)
            androidx.compose.ui.input.pointer.PointerInputChange r6 = (androidx.compose.ui.input.pointer.PointerInputChange) r6
            boolean r6 = androidx.compose.ui.input.pointer.PointerEventKt.changedToDown(r6)
            if (r6 != 0) goto L62
            goto L33
        L62:
            int r5 = r5 + 1
            goto L53
        L65:
            java.lang.Object r7 = r8.get(r4)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_genai_prompt.zzade.access$awaitFirstRightClickDown(androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine, kotlin.coroutines.jvm.internal.BaseContinuationImpl):java.lang.Object");
    }

    public static final Modifier circularReveal(Modifier modifier, Function1 function1, float f) {
        modifier.getClass();
        function1.getClass();
        return ClipKt.clip(modifier, new GenericShape(new CardStudioViewV2Kt$$ExternalSyntheticLambda7(function1, f, 2)));
    }

    public static final Object onRightClickDown(PointerInputScope pointerInputScope, Function1 function1, Continuation continuation) {
        Object awaitEachGesture = Draggable2DKt.awaitEachGesture(pointerInputScope, new SelectionGesturesKt$updateSelectionTouchMode$1$1(function1, null, 1), continuation);
        return awaitEachGesture == CoroutineSingletons.COROUTINE_SUSPENDED ? awaitEachGesture : Unit.INSTANCE;
    }
}
