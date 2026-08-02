package com.squareup.cash.overlays;

import android.content.Context;
import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.platform.AccessibilityIterators$WordTextSegmentIterator;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import app.cash.broadway.ui.ScreenLifecycleOwnerContextWrapper;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.tasks.zzr;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda39;
import com.squareup.protos.franklin.common.RequestContext;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import kotlin.Unit;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes6.dex */
public abstract class FakeOverlayLayerKt {
    public static final void FullWidthPopup(ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1088491713);
        if (gapComposer.shouldExecute(i & 1, (i & 3) != 2)) {
            View view = (View) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalView);
            GapComposer.CompositionContextImpl buildContext = gapComposer.buildContext();
            Unit unit = Unit.INSTANCE;
            boolean changedInstance = gapComposer.changedInstance(view) | gapComposer.changedInstance(buildContext);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new MoneyTabUIKt$$ExternalSyntheticLambda39(18, view, buildContext, composableLambdaImpl);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Updater.DisposableEffect(unit, (Function1) rememberedValue, gapComposer);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new OverlaysKt$$ExternalSyntheticLambda1(i, 27, composableLambdaImpl);
        }
    }

    public static final void WithFakeOverlayLayer(ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(885170297);
        int i2 = 0;
        if (gapComposer.shouldExecute(i & 1, (i & 3) != 2)) {
            View view = (View) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalView);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = Updater.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, gapComposer);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            CoroutineScope coroutineScope = (CoroutineScope) rememberedValue;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new FakeOverlayLayer(coroutineScope);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            FakeOverlayLayer fakeOverlayLayer = (FakeOverlayLayer) rememberedValue2;
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (rememberedValue3 == neverEqualPolicy) {
                zzr zzrVar = new zzr(coroutineScope, coroutineScope);
                ArrayList arrayList = (ArrayList) zzrVar.zza;
                if (zzrVar.zzc) {
                    a$$ExternalSyntheticBUOutline0.m$3("Failed requirement.");
                    return;
                }
                zzrVar.zzc = true;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((Function0) it.next()).invoke();
                }
                arrayList.clear();
                Context context = view.getContext();
                context.getClass();
                rememberedValue3 = new ScreenLifecycleOwnerContextWrapper(new OverlayContextWrapper(context, fakeOverlayLayer), zzrVar);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            Updater.CompositionLocalProvider(AndroidCompositionLocals_androidKt.LocalContext.defaultProvidedValue$runtime((Context) rememberedValue3), Expect_jvmKt.rememberComposableLambda(2113213753, new FakeOverlayLayerKt$$ExternalSyntheticLambda0(i2, composableLambdaImpl, fakeOverlayLayer), gapComposer), gapComposer, 56);
            FullWidthPopup(Expect_jvmKt.rememberComposableLambda(1178917627, new FakeOverlayLayer$$ExternalSyntheticLambda0(fakeOverlayLayer), gapComposer), gapComposer, 6);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new OverlaysKt$$ExternalSyntheticLambda1(i, 26, composableLambdaImpl);
        }
    }

    public static AccessibilityIterators$WordTextSegmentIterator getInstance(Locale locale) {
        if (AccessibilityIterators$WordTextSegmentIterator.instance == null) {
            AccessibilityIterators$WordTextSegmentIterator accessibilityIterators$WordTextSegmentIterator = new AccessibilityIterators$WordTextSegmentIterator(0);
            accessibilityIterators$WordTextSegmentIterator.impl = BreakIterator.getWordInstance(locale);
            AccessibilityIterators$WordTextSegmentIterator.instance = accessibilityIterators$WordTextSegmentIterator;
        }
        AccessibilityIterators$WordTextSegmentIterator accessibilityIterators$WordTextSegmentIterator2 = AccessibilityIterators$WordTextSegmentIterator.instance;
        accessibilityIterators$WordTextSegmentIterator2.getClass();
        return accessibilityIterators$WordTextSegmentIterator2;
    }

    public abstract RequestContext getRequestContext();
}
