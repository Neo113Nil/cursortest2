package com.squareup.cash.moneybot.genie;

import android.content.Context;
import android.os.Build;
import androidx.appcompat.widget.Toolbar;
import androidx.biometric.BiometricPrompt;
import androidx.camera.camera2.adapter.ZslControlImpl$$ExternalSyntheticLambda1;
import androidx.camera.core.CameraX;
import androidx.camera.core.impl.utils.ContextUtil;
import androidx.camera.core.impl.utils.futures.ChainingListenableFuture;
import androidx.camera.core.impl.utils.futures.FutureChain;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.core.streamsharing.StreamSharing$$ExternalSyntheticLambda1;
import androidx.camera.lifecycle.LifecycleCameraRepositories;
import androidx.camera.lifecycle.LifecycleCameraRepository;
import androidx.camera.lifecycle.ProcessCameraProvider;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.collection.ObjectList$$ExternalSyntheticLambda0;
import androidx.compose.foundation.BorderKt$$ExternalSyntheticLambda1;
import androidx.compose.material.MenuKt$$ExternalSyntheticLambda0;
import androidx.compose.material3.ContentColorKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DynamicProvidableCompositionLocal;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.text.TextStyle;
import com.google.android.gms.internal.mlkit_genai_prompt.zzabp;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.squareup.cash.activity.views.SectionHeaderScope$$ExternalSyntheticLambda1;
import com.squareup.cash.arcade.bindings.header.PageHeaderProtoBindingKt$$ExternalSyntheticLambda0;
import com.squareup.cash.arcade.bindings.header.PageHeaderProtoBindingKt$WhenMappings;
import com.squareup.cash.booklet.ui.BookletGridKt$$ExternalSyntheticLambda2;
import com.squareup.cash.money.views.MoneyUiFactory$$ExternalSyntheticLambda1;
import com.squareup.cash.moneybot.genie.protos.ComposePlatform;
import com.squareup.cash.music.views.MusicViewKt$$ExternalSyntheticLambda8;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.franklin.ui.UiAvatar;
import com.squareup.util.cash.Countries;
import com.stripe.hcaptcha.HCaptcha;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function2;
import okio.internal.ZipFilesKt$$ExternalSyntheticLambda4;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import squareup.cash.ui.arcade.elements.HorizontalAlignment;
import squareup.cash.ui.arcade.elements.PageHeader;
import xyz.block.genie.expressions.EvalHelpersKt;
import xyz.block.genie.expressions.ExpressionEvaluator;
import xyz.block.genie.state.GenieCompositionLocalsKt;
import xyz.block.genie.state.GenieStateBinding;
import xyz.block.genie.state.GenieViewState;
import xyz.block.protos.genie.Binding;
import xyz.block.protos.genie.KeyPath;

/* loaded from: classes5.dex */
public abstract class SwitchViewKt {
    /* JADX WARN: Removed duplicated region for block: B:32:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PageHeaderProtoBinding(PageHeader pageHeader, Function2 function2, Modifier modifier, TextStyle textStyle, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        TextStyle textStyle2;
        int i4;
        UiAvatar uiAvatar;
        ComposableLambdaImpl composableLambdaImpl;
        String str;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(218871016);
        int i5 = i | (gapComposer.changedInstance(pageHeader) ? 4 : 2) | (gapComposer.changedInstance(function2) ? 32 : 16);
        int i6 = i5 | MLKEMEngine.KyberPolyBytes;
        int i7 = i2 & 8;
        if (i7 != 0) {
            i3 = i5 | 3456;
        } else {
            i3 = i6 | (gapComposer.changed(textStyle) ? 2048 : 1024);
        }
        int i8 = 0;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 1171) != 1170)) {
            ComposableLambdaImpl composableLambdaImpl2 = null;
            TextStyle textStyle3 = i7 != 0 ? null : textStyle;
            HorizontalAlignment horizontalAlignment = pageHeader.horizontal_alignment;
            int i9 = horizontalAlignment == null ? -1 : PageHeaderProtoBindingKt$WhenMappings.$EnumSwitchMapping$0[horizontalAlignment.ordinal()];
            if (i9 != -1) {
                i4 = 3;
                if (i9 != 1) {
                    if (i9 != 2) {
                        if (i9 != 3) {
                            OptionalProvider$$ExternalSyntheticLambda0.m$1("Header alignment ", pageHeader.horizontal_alignment, " is not supported.");
                            return;
                        }
                        i4 = 6;
                    }
                }
                uiAvatar = pageHeader.avatar;
                if (uiAvatar != null) {
                    gapComposer.startReplaceGroup(626741296);
                    gapComposer.end(false);
                    composableLambdaImpl = null;
                } else {
                    gapComposer.startReplaceGroup(626741297);
                    ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(2034544772, new PageHeaderProtoBindingKt$$ExternalSyntheticLambda0(uiAvatar, i8), gapComposer);
                    gapComposer.end(false);
                    composableLambdaImpl = rememberComposableLambda;
                }
                LocalizedString localizedString = pageHeader.body;
                str = localizedString == null ? localizedString.translated_value : null;
                if (str != null) {
                    gapComposer.startReplaceGroup(627109235);
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(627109236);
                    composableLambdaImpl2 = Expect_jvmKt.rememberComposableLambda(345569384, new SectionHeaderScope$$ExternalSyntheticLambda1(str, function2, i4, 27), gapComposer);
                    gapComposer.end(false);
                }
                ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(753620209, new SectionHeaderScope$$ExternalSyntheticLambda1(pageHeader, textStyle3, i4, 28), gapComposer);
                ComposableLambdaImpl composableLambdaImpl3 = composableLambdaImpl2;
                Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                Countries.PageHeader(rememberComposableLambda2, companion, composableLambdaImpl, composableLambdaImpl3, gapComposer, 54, 0);
                modifier2 = companion;
                textStyle2 = textStyle3;
            }
            i4 = 5;
            uiAvatar = pageHeader.avatar;
            if (uiAvatar != null) {
            }
            LocalizedString localizedString2 = pageHeader.body;
            if (localizedString2 == null) {
            }
            if (str != null) {
            }
            ComposableLambdaImpl rememberComposableLambda22 = Expect_jvmKt.rememberComposableLambda(753620209, new SectionHeaderScope$$ExternalSyntheticLambda1(pageHeader, textStyle3, i4, 28), gapComposer);
            ComposableLambdaImpl composableLambdaImpl32 = composableLambdaImpl2;
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            Countries.PageHeader(rememberComposableLambda22, companion2, composableLambdaImpl, composableLambdaImpl32, gapComposer, 54, 0);
            modifier2 = companion2;
            textStyle2 = textStyle3;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
            textStyle2 = textStyle;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BookletGridKt$$ExternalSyntheticLambda2(pageHeader, function2, modifier2, textStyle2, i, i2);
        }
    }

    public static final void SwitchView(ComposePlatform.Switch r13, ResolvedStyle resolvedStyle, Modifier modifier, Composer composer, int i) {
        int i2;
        List list;
        long j;
        KeyPath keyPath;
        r13.getClass();
        modifier.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1253494177);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(r13) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(resolvedStyle) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(modifier) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            ExpressionEvaluator expressionEvaluator = (ExpressionEvaluator) gapComposer.consume(GenieCompositionLocalsKt.LocalGenieExpressionEvaluator);
            ProvidableCompositionLocal providableCompositionLocal = GenieCompositionLocalsKt.LocalGenieViewState;
            String evalString = EvalHelpersKt.evalString(expressionEvaluator, r13.label, (GenieViewState) gapComposer.consume(providableCompositionLocal), "");
            Binding binding = r13.binding;
            GenieViewState genieViewState = (GenieViewState) gapComposer.consume(providableCompositionLocal);
            if (binding == null || (keyPath = binding.key_path) == null || (list = keyPath.segments) == null) {
                list = EmptyList.INSTANCE;
            }
            boolean changed = gapComposer.changed(genieViewState) | gapComposer.changed(list);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new GenieStateBinding(genieViewState, list, new ZipFilesKt$$ExternalSyntheticLambda4(7), new ZipFilesKt$$ExternalSyntheticLambda4(8));
                gapComposer.updateRememberedValue(rememberedValue);
            }
            GenieStateBinding genieStateBinding = (GenieStateBinding) rememberedValue;
            DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal = ContentColorKt.LocalContentColor;
            Color color = resolvedStyle.contentColor;
            if (color == null) {
                gapComposer.startReplaceGroup(2017074216);
                j = ((Color) gapComposer.consume(dynamicProvidableCompositionLocal)).value;
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(2017072976);
                gapComposer.end(false);
                j = color.value;
            }
            Updater.CompositionLocalProvider(Recorder$$ExternalSyntheticOutline2.m(j, dynamicProvidableCompositionLocal), Expect_jvmKt.rememberComposableLambda(-1813429663, new MoneyUiFactory$$ExternalSyntheticLambda1(modifier, evalString, resolvedStyle, genieStateBinding, 25), gapComposer), gapComposer, 56);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MusicViewKt$$ExternalSyntheticLambda8(r13, resolvedStyle, modifier, i, 8);
        }
    }

    public static ChainingListenableFuture getInstance(Context context) {
        LifecycleCameraRepository lifecycleCameraRepository;
        ListenableFuture listenableFuture;
        context.getClass();
        HCaptcha hCaptcha = ProcessCameraProvider.sAppInstance.lifecycleCameraProvider;
        synchronized (hCaptcha.result) {
            Object obj = ContextUtil.CACHE_LOCK;
            int deviceId = Build.VERSION.SDK_INT >= 34 ? context.getDeviceId() : 0;
            LinkedHashMap linkedHashMap = LifecycleCameraRepositories.repositoryMap;
            synchronized (linkedHashMap) {
                try {
                    Integer valueOf = Integer.valueOf(deviceId);
                    Object obj2 = linkedHashMap.get(valueOf);
                    if (obj2 == null) {
                        obj2 = new LifecycleCameraRepository();
                        linkedHashMap.put(valueOf, obj2);
                    }
                    lifecycleCameraRepository = (LifecycleCameraRepository) obj2;
                } finally {
                }
            }
            hCaptcha.onOpenListeners = lifecycleCameraRepository;
            listenableFuture = (FutureChain) hCaptcha.exception;
            int i = 11;
            if (listenableFuture == null) {
                CameraX cameraX = new CameraX(context, null);
                ChainingListenableFuture transformAsync = Futures.transformAsync(Futures.transformAsync(FutureChain.from((ListenableFuture) hCaptcha.onSuccessListeners), new StreamSharing$$ExternalSyntheticLambda1(new ObjectList$$ExternalSyntheticLambda0(cameraX, 10), i), zzabp.directExecutor()), new Toolbar.AnonymousClass1(new StreamSharing$$ExternalSyntheticLambda1(new MenuKt$$ExternalSyntheticLambda0(2, hCaptcha, cameraX, context), 12)), zzabp.directExecutor());
                hCaptcha.exception = transformAsync;
                Futures.addCallback(transformAsync, new BiometricPrompt(hCaptcha, 13), zzabp.directExecutor());
                listenableFuture = Futures.nonCancellationPropagating(transformAsync);
            }
        }
        return Futures.transformAsync(listenableFuture, new Toolbar.AnonymousClass1(new ZslControlImpl$$ExternalSyntheticLambda1(new BorderKt$$ExternalSyntheticLambda1(11), 22)), zzabp.directExecutor());
    }
}
