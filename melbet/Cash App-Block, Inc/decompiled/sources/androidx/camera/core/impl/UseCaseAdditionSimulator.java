package androidx.camera.core.impl;

import android.util.Range;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.camera.camera2.adapter.CameraCoordinatorAdapter;
import androidx.camera.core.LegacySessionConfig;
import androidx.camera.core.UseCaseGroup;
import androidx.camera.core.featuregroup.impl.ResolvedFeatureGroup;
import androidx.camera.core.internal.CalculatedUseCaseInfo;
import androidx.camera.core.internal.CameraUseCaseAdapter;
import androidx.camera.video.Recorder;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.material.SwipeToDismissKt$$ExternalSyntheticLambda3;
import androidx.compose.material3.ContentColorKt;
import androidx.compose.material3.Typography;
import androidx.compose.material3.TypographyKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DynamicProvidableCompositionLocal;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.text.TextStyle;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.RealImageLoader;
import coil3.request.ImageRequest;
import coil3.request.ImageRequestsKt;
import coil3.transform.CircleCropTransformation;
import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.LottieCompositionFactory;
import com.fillr.n;
import com.google.mlkit.vision.text.internal.zzr;
import com.knotapi.knot.utilities.LoaderView$$ExternalSyntheticLambda1;
import com.squareup.cash.appmessages.AppMessageImage;
import com.squareup.cash.appmessages.AppMessageImage$Animated$Asset$Url;
import com.squareup.cash.appmessages.views.RealAppMessageImageLoader;
import com.squareup.cash.badging.db.BadgeQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.moneybot.genie.ResolvedStyle;
import com.squareup.cash.moneybot.genie.protos.ComposePlatform;
import com.squareup.cash.mooncake.components.MooncakeProgress$$ExternalSyntheticLambda0;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.mooncake.themes.ThemeInfo;
import com.squareup.cash.mooncake.theming.ThemablesKt;
import com.squareup.cash.music.views.MusicViewKt$$ExternalSyntheticLambda8;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import utils.StringUtilsKt;
import xyz.block.genie.expressions.EvalHelpersKt;
import xyz.block.genie.expressions.ExpressionEvaluator;
import xyz.block.genie.state.GenieCompositionLocalsKt;
import xyz.block.genie.state.GenieStateBinding;
import xyz.block.genie.state.GenieViewState;
import xyz.block.genie.state.StateBindingsKt;
import xyz.block.protos.genie.Binding;

/* loaded from: classes3.dex */
public abstract class UseCaseAdditionSimulator {
    public static n cameraUseCaseAdapterProvider;

    public static final void DropdownMenuView(ComposePlatform.DropdownMenu dropdownMenu, ResolvedStyle resolvedStyle, Modifier modifier, Composer composer, int i) {
        int i2;
        Modifier modifier2;
        long j;
        dropdownMenu.getClass();
        modifier.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-263558331);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(dropdownMenu) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(resolvedStyle) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            modifier2 = modifier;
            i2 |= gapComposer.changed(modifier2) ? 256 : 128;
        } else {
            modifier2 = modifier;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            String evalString = EvalHelpersKt.evalString((ExpressionEvaluator) gapComposer.consume(GenieCompositionLocalsKt.LocalGenieExpressionEvaluator), dropdownMenu.label, (GenieViewState) gapComposer.consume(GenieCompositionLocalsKt.LocalGenieViewState), "");
            List list = dropdownMenu.options;
            Binding binding = dropdownMenu.binding;
            String str = (String) CollectionsKt.firstOrNull(list);
            GenieStateBinding rememberStringBinding = StateBindingsKt.rememberStringBinding(binding, str != null ? str : "", gapComposer, 0);
            Object rememberedValue = gapComposer.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = Updater.mutableStateOf$default(Boolean.FALSE);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState = (MutableState) rememberedValue;
            TextStyle textStyle = resolvedStyle.textStyle;
            if (textStyle == null) {
                gapComposer.startReplaceGroup(123530447);
                textStyle = ((Typography) gapComposer.consume(TypographyKt.LocalTypography)).labelLarge;
            } else {
                gapComposer.startReplaceGroup(123529083);
            }
            gapComposer.end(false);
            TextStyle textStyle2 = textStyle;
            DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal = ContentColorKt.LocalContentColor;
            Color color = resolvedStyle.contentColor;
            if (color == null) {
                gapComposer.startReplaceGroup(123533868);
                j = ((Color) gapComposer.consume(dynamicProvidableCompositionLocal)).value;
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(123532628);
                gapComposer.end(false);
                j = color.value;
            }
            Updater.CompositionLocalProvider(Recorder$$ExternalSyntheticOutline2.m(j, dynamicProvidableCompositionLocal), Expect_jvmKt.rememberComposableLambda(-2062471163, new SwipeToDismissKt$$ExternalSyntheticLambda3(modifier2, mutableState, evalString, rememberStringBinding, textStyle2, list), gapComposer), gapComposer, 56);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MusicViewKt$$ExternalSyntheticLambda8(dropdownMenu, resolvedStyle, modifier, i, 4);
        }
    }

    public static final void render(AppCompatImageView appCompatImageView, RealAppMessageImageLoader realAppMessageImageLoader, AppMessageImage.Static r5, Function1 function1) {
        appCompatImageView.getClass();
        realAppMessageImageLoader.getClass();
        r5.getClass();
        ThemeInfo themeInfo = ThemeHelpersKt.themeInfo(appCompatImageView);
        BadgeQueries$$ExternalSyntheticLambda0 badgeQueries$$ExternalSyntheticLambda0 = new BadgeQueries$$ExternalSyntheticLambda0(3, function1, appCompatImageView);
        RealImageLoader realImageLoader = realAppMessageImageLoader.imageLoader;
        ImageRequest.Builder builder = new ImageRequest.Builder(realAppMessageImageLoader.context);
        builder.data = ThemablesKt.urlForTheme(r5.getImage(), themeInfo);
        ImageRequestsKt.transformations(builder, r5.getRound() ? CollectionsKt__CollectionsJVMKt.listOf(new CircleCropTransformation()) : EmptyList.INSTANCE);
        builder.listener = new zzr(badgeQueries$$ExternalSyntheticLambda0, 15);
        realImageLoader.enqueue(builder.build());
    }

    public static final void simulateAddUseCases(CameraInfoInternal cameraInfoInternal, LegacySessionConfig legacySessionConfig, ResolvedFeatureGroup resolvedFeatureGroup) {
        CalculatedUseCaseInfo calculateAndValidateUseCases;
        n nVar = cameraUseCaseAdapterProvider;
        if (nVar == null) {
            a$$ExternalSyntheticBUOutline0.m$1("mCameraUseCaseAdapterProvider must be initialized first!");
            return;
        }
        String cameraId = cameraInfoInternal.getCameraId();
        cameraId.getClass();
        CameraInternal camera = ((CameraRepository) nVar.a).getCamera(cameraId);
        AdapterCameraInfo adapterCameraInfo = new AdapterCameraInfo(camera.getCameraInfoInternal(), CameraConfigs.DEFAULT_CAMERA_CONFIG);
        UseCaseGroup useCaseGroup = UseCaseGroup.DEFAULT;
        CameraUseCaseAdapter cameraUseCaseAdapter = new CameraUseCaseAdapter(camera, null, adapterCameraInfo, null, useCaseGroup, useCaseGroup, (CameraCoordinatorAdapter) nVar.b, (Recorder.AnonymousClass1) nVar.d, (UseCaseConfigFactory) nVar.c);
        synchronized (cameraUseCaseAdapter.mLock) {
        }
        List list = (List) legacySessionConfig.effects;
        synchronized (cameraUseCaseAdapter.mLock) {
            cameraUseCaseAdapter.mEffects = list;
        }
        synchronized (cameraUseCaseAdapter.mLock) {
        }
        Range range = (Range) legacySessionConfig.frameRateRange;
        synchronized (cameraUseCaseAdapter.mLock) {
            cameraUseCaseAdapter.mFrameRate = range;
        }
        List list2 = (List) legacySessionConfig.useCases;
        StringUtilsKt.d("CameraUseCaseAdapter", "simulateAddUseCases: appUseCasesToAdd = " + list2 + ", featureGroup = " + resolvedFeatureGroup);
        synchronized (cameraUseCaseAdapter.mLock) {
            AdapterCameraInternal adapterCameraInternal = cameraUseCaseAdapter.mCameraInternal;
            CameraConfig cameraConfig = cameraUseCaseAdapter.mCameraConfig;
            adapterCameraInternal.setExtendedConfig(cameraConfig);
            AdapterCameraInternal adapterCameraInternal2 = cameraUseCaseAdapter.mSecondaryCameraInternal;
            if (adapterCameraInternal2 != null) {
                adapterCameraInternal2.setExtendedConfig(cameraConfig);
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet(cameraUseCaseAdapter.mAppUseCases);
            linkedHashSet.addAll(list2);
            HashMap applyFeatureGroup = CameraUseCaseAdapter.applyFeatureGroup(linkedHashSet, resolvedFeatureGroup);
            try {
                try {
                    calculateAndValidateUseCases = cameraUseCaseAdapter.calculateAndValidateUseCases(linkedHashSet, cameraUseCaseAdapter.mSecondaryCameraInternal != null);
                    CameraUseCaseAdapter.restoreFeatureGroup(applyFeatureGroup);
                } catch (IllegalArgumentException e) {
                    throw new CameraUseCaseAdapter.CameraException(e);
                }
            } catch (Throwable th) {
                CameraUseCaseAdapter.restoreFeatureGroup(applyFeatureGroup);
                throw th;
            }
        }
        calculateAndValidateUseCases.getClass();
    }

    public static final void render(LottieAnimationView lottieAnimationView, AppMessageImage.Animated animated, Function1 function1) {
        lottieAnimationView.getClass();
        animated.getClass();
        AppMessageImage$Animated$Asset$Url image = animated.getImage();
        if (image instanceof AppMessageImage$Animated$Asset$Url) {
            int i = 1;
            LottieCompositionFactory.fromUrl(lottieAnimationView.getContext(), ThemablesKt.urlForTheme(image.asset, ThemeHelpersKt.themeInfo(lottieAnimationView)), null).addListener(new MooncakeProgress$$ExternalSyntheticLambda0(lottieAnimationView, function1, i)).addFailureListener(new LoaderView$$ExternalSyntheticLambda1(function1, i));
            return;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
    }
}
