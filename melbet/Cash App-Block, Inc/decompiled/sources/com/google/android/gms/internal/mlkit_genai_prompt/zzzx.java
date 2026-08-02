package com.google.android.gms.internal.mlkit_genai_prompt;

import androidx.biometric.DeviceUtils;
import androidx.biometric.KeyguardUtils;
import androidx.camera.camera2.pipe.AeMode;
import androidx.camera.camera2.pipe.CameraGraph$OperatingMode;
import androidx.camera.core.impl.CameraCaptureCallbacks;
import androidx.camera.core.impl.DynamicRanges;
import androidx.camera.core.impl.QuirkSettingsLoader;
import androidx.camera.core.impl.UseCaseAdditionSimulator;
import androidx.camera.core.impl.utils.MatrixExt;
import androidx.camera.core.impl.utils.Threads;
import androidx.camera.core.impl.utils.UseCaseUtil;
import androidx.camera.core.internal.utils.ImageUtil;
import androidx.camera.core.processing.TargetUtils;
import androidx.camera.video.internal.DebugUtils;
import androidx.camera.video.internal.config.AudioConfigUtil;
import androidx.camera.video.internal.utils.StorageUtil;
import androidx.camera.viewfinder.compose.ViewfinderKt;
import androidx.camera.viewfinder.core.ViewfinderDefaults;
import androidx.camera.viewfinder.core.impl.Transformations;
import androidx.cardview.widget.CardViewApi21Impl;
import androidx.collection.internal.RuntimeHelpersKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListKt;
import androidx.compose.foundation.lazy.LazyListLayoutInfoKt;
import androidx.compose.foundation.lazy.grid.LazyGridDslKt;
import androidx.compose.foundation.lazy.grid.LazyGridKt;
import androidx.compose.foundation.pager.LazyLayoutPagerKt;
import androidx.compose.foundation.pager.PagerDefaults;
import androidx.compose.foundation.pager.PagerKt;
import androidx.compose.foundation.pager.PagerLayoutInfoKt;
import androidx.compose.foundation.pager.PagerMeasureKt;
import androidx.compose.foundation.text.input.TextFieldStateKt;
import androidx.compose.material.pullrefresh.PullRefreshKt;
import androidx.compose.runtime.collection.ExtensionsKt;
import androidx.compose.runtime.internal.Utils_androidKt;
import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.ui.autofill.AndroidAutofill_androidKt;
import androidx.compose.ui.draganddrop.DragAndDrop_androidKt;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.draw.RotateKt;
import androidx.compose.ui.draw.ScaleKt;
import androidx.compose.ui.geometry.GeometryUtilsKt;
import androidx.compose.ui.graphics.AndroidShader_androidKt;
import androidx.compose.ui.graphics.AndroidTileMode_androidKt;
import androidx.compose.ui.graphics.BrushKt;
import androidx.compose.ui.graphics.CanvasUtils;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.PathOperation;
import androidx.compose.ui.graphics.PointMode;
import androidx.compose.ui.graphics.ShaderKt;
import androidx.compose.ui.graphics.ShadowKt;
import androidx.compose.ui.graphics.TileMode;
import androidx.compose.ui.graphics.painter.BitmapPainterKt;
import androidx.compose.ui.graphics.shadow.BlurKt;
import androidx.compose.ui.node.BackwardsCompatNodeKt;
import androidx.compose.ui.node.DistanceAndFlags;
import androidx.compose.ui.node.HitTestResultKt;
import androidx.compose.ui.node.MeasureScopeWithLayoutNodeKt;
import androidx.compose.ui.node.PointerInputModifierNodeKt;
import androidx.compose.ui.platform.DerivedSize;
import androidx.compose.ui.platform.JvmActuals_jvmKt;
import androidx.compose.ui.platform.ShapeContainingUtilKt;
import androidx.compose.ui.platform.WindowInfoImpl;
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.compose.ui.res.ImageResources_androidKt;
import androidx.compose.ui.res.PrimitiveResources_androidKt;
import androidx.compose.ui.spatial.ThrottledCallbacksKt;
import androidx.compose.ui.text.android.CanvasCompatO;
import androidx.compose.ui.text.android.CanvasCompatQ;
import androidx.compose.ui.text.android.LayoutCompat_androidKt;
import androidx.compose.ui.text.font.FontWeightKt;
import androidx.compose.ui.text.input.InputState_androidKt;
import androidx.compose.ui.text.input.TextFieldValueKt;
import androidx.compose.ui.text.intl.Locale_jvmAndAndroidKt;
import androidx.compose.ui.text.style.BaselineShiftKt;
import androidx.compose.ui.text.style.TextDrawStyleKt;
import androidx.compose.ui.text.style.TextGeometricTransformKt;
import androidx.compose.ui.text.style.TextIndentKt;
import androidx.compose.ui.unit.IntRectKt;
import androidx.compose.ui.unit.VelocityKt;
import androidx.constraintlayout.motion.widget.Debug;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import androidx.core.app.PendingIntentCompat;
import androidx.core.content.ContextCompat$Api26Impl;
import androidx.core.content.ContextCompat$Api28Impl;
import androidx.core.content.ContextCompat$Api33Impl;
import androidx.core.content.PermissionChecker;
import androidx.core.graphics.PaintCompat;
import androidx.core.graphics.PathParser;
import androidx.core.graphics.TypefaceCompatUtil;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.math.MathUtils;
import androidx.core.net.UriKt;
import androidx.core.os.TraceCompat$Api29Impl;
import androidx.core.provider.FontsContractCompat;
import androidx.core.text.TextUtilsCompat;
import androidx.core.util.TypedValueCompat;
import androidx.core.view.DisplayCutoutCompat;
import androidx.core.view.HapticFeedbackConstantsCompat;
import androidx.core.view.KeyEventDispatcher;
import androidx.core.view.MotionEventCompat;
import androidx.core.view.ViewConfigurationCompat;
import androidx.core.view.ViewGroupKt;
import androidx.core.view.ViewKt;
import androidx.core.view.ViewPropertyAnimatorListenerAdapter;
import androidx.core.widget.EdgeEffectCompat;
import androidx.core.widget.ImageViewCompat;
import androidx.core.widget.PopupWindowCompat;
import androidx.core.widget.TextViewCompat$Api28Impl;
import androidx.customview.widget.FocusStrategy;
import androidx.customview.widget.ViewDragHelper;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.datatransport.Transformer;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.google.firebase.encoders.config.EncoderConfig;
import com.google.mlkit.common.sdkinternal.MlKitThreadPool;
import com.google.mlkit.genai.common.GenAiException;
import com.squareup.cash.advertising.views.FullscreenAdViewKt;
import com.squareup.cash.api.Aliases;
import com.squareup.cash.api.ContextKt;
import com.squareup.cash.arcade.components.list.ListOrderedKt;
import com.squareup.cash.avatar.components.AvatarKt;
import com.squareup.cash.avatar.components.BadgedAvatarKt;
import com.squareup.cash.beacondetection.real.IBeaconParser;
import com.squareup.cash.benefits.utils.ErrorReportingKt;
import com.squareup.cash.bitcoin.views.send.MoveBitcoinViewKt;
import com.squareup.cash.blockers.data.BlockersDataKt;
import com.squareup.cash.blockers.viewmodels.LayoutUpdate;
import com.squareup.cash.borrow.ui.util.ArcadeThemeKt;
import com.squareup.cash.money.booklet.DisclosureSectionKt;
import com.squareup.cash.money.booklet.HeaderSectionKt;
import com.squareup.cash.money.booklet.MoneyTabBookletKt;
import com.squareup.cash.money.loadable.LoadableStateKt;
import com.squareup.cash.money.viewmodels.api.Section;
import com.squareup.cash.moneybot.analytics.AnalyticsMappersKt;
import com.squareup.cash.moneybot.genie.GenieForEachViewKt;
import com.squareup.cash.moneybot.genie.SwitchViewKt;
import com.squareup.cash.moneybot.genie.TextViewKt;
import com.squareup.cash.moneybot.theme.MoneybotTheme;
import com.squareup.cash.moneybot.views.chat.EmptyChatKt;
import com.squareup.cash.mooncake.compose_ui.ComposeUtilsKt;
import com.squareup.cash.mooncake.compose_ui.MooncakeTheme;
import com.squareup.cash.mooncake.resourceindex.ColorCodesKt;
import com.squareup.cash.mooncake.resources.ImageResourcesKt;
import com.squareup.cash.mooncake.theming.RipplesKt;
import com.squareup.cash.offers.presenters.OffersAnalyticsKt;
import com.squareup.cash.overlays.FakeOverlayLayerKt;
import com.squareup.cash.overlays.OverlayKt;
import com.squareup.cash.overlays.OverlaysKt;
import com.squareup.cash.payments.backend.api.OfflineManagerKt;
import com.squareup.cash.payments.presenters.AnalyticsHelperKt;
import com.squareup.cash.payments.presenters.RecipientMapper;
import com.squareup.cash.payments.presenters.UtilsKt;
import com.squareup.cash.pools.applets.presenters.PoolIcon;
import com.squareup.cash.presenters.AccentColorsKt;
import com.squareup.cash.presenters.AliasFormatter;
import com.squareup.cash.presenters.RecipientAvatars;
import com.squareup.cash.profile.components.ProfilePhotoKt;
import com.squareup.cash.scrubbing.CardNumberKt;
import com.squareup.cash.scrubbing.CurrencyConfig;
import com.squareup.cash.scrubbing.DateScrubberKt;
import com.squareup.cash.session.backend.DbSessionManagerKt;
import com.squareup.cash.sheet.BasicShieetKt;
import com.squareup.cash.sheet.ComposeBottomSheetKt;
import com.squareup.cash.sheet.PinnedKt;
import com.squareup.cash.sheet.RealSheetStateKt;
import com.squareup.cash.sheet.SheetStateKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import papa.InputEventTrigger;
import radiography.internal.ComposeLayoutInfoKt;
import radiography.internal.RenderTreeStringKt;
import retrofit2.DefaultMethodSupport;
import squareup.cash.earnings.EarningTool;
import squareup.cash.earnings.EarningsHomeUi;
import squareup.cash.earnings.EarningsTimeFrame;
import squareup.cash.overdraft.OverdraftStatus;
import squareup.cash.savings.ArcadeElement;
import squareup.cash.savings.SavingsElement;
import squareup.cash.savings.action.SavingsAction;
import squareup.cash.wires.WiresAccountInfo;
import string.ReplaceModeKt;
import string.TrimMode;
import utils.AnyUtilsKt;
import utils.StringUtilsKt;
import xyz.block.genie.expressions.EvalHelpersKt;
import xyz.block.genie.state.StateBindingsKt;

/* loaded from: classes4.dex */
public final class zzzx implements zzamp, zzajc, Transformer {
    public static zzzx zza$1;
    public final /* synthetic */ int $r8$classId;
    public static final zzzx zza$2 = new zzzx(2);
    public static final zzzx zza = new zzzx(0);

    public /* synthetic */ zzzx(int i) {
        this.$r8$classId = i;
    }

    public static final zzaml zza(Object obj, Object obj2) {
        zzaml zzamlVar = (zzaml) obj;
        zzaml zzamlVar2 = (zzaml) obj2;
        if (!zzamlVar2.isEmpty()) {
            if (!zzamlVar.zzb) {
                if (zzamlVar.isEmpty()) {
                    zzamlVar = new zzaml();
                } else {
                    zzaml zzamlVar3 = new zzaml(zzamlVar);
                    zzamlVar3.zzb = true;
                    zzamlVar = zzamlVar3;
                }
            }
            zzamlVar.zzg();
            if (!zzamlVar2.isEmpty()) {
                zzamlVar.putAll(zzamlVar2);
            }
        }
        return zzamlVar;
    }

    @Override // com.google.android.datatransport.Transformer
    public Object apply(Object obj) {
        switch (this.$r8$classId) {
        }
        return (byte[]) obj;
    }

    public void configure(EncoderConfig encoderConfig) {
        encoderConfig.registerEncoder(zzacd.class, zzut.zza);
        encoderConfig.registerEncoder(zzahn.class, zzzn.zza);
        encoderConfig.registerEncoder(MoneybotTheme.class, zzuu.zza);
        encoderConfig.registerEncoder(EmptyChatKt.class, zzuw.zza);
        encoderConfig.registerEncoder(ViewfinderKt.class, zzuv.zza);
        encoderConfig.registerEncoder(zzacg.class, zzux.zza);
        encoderConfig.registerEncoder(SavingsElement.Element.class, zzth.zza);
        encoderConfig.registerEncoder(ArcadeElement.Element.class, zztg.zza);
        encoderConfig.registerEncoder(zzabp.class, zzui.zza);
        encoderConfig.registerEncoder(zzafd.class, zzxv.zza);
        encoderConfig.registerEncoder(LoadableStateKt.class, zztf.zza);
        encoderConfig.registerEncoder(OverdraftStatus.State_.class, zzte.zza);
        encoderConfig.registerEncoder(zzadn.class, zzwf.zza);
        encoderConfig.registerEncoder(ProfilePhotoKt.class, zzub.zza);
        encoderConfig.registerEncoder(GenieForEachViewKt.class, zzue.zza);
        encoderConfig.registerEncoder(QuirkSettingsLoader.class, zzua.zza);
        encoderConfig.registerEncoder(zzado.class, zzwg.zza);
        encoderConfig.registerEncoder(PointerInputModifierNodeKt.class, zzxs.zza);
        encoderConfig.registerEncoder(zzafb.class, zzxt.zza);
        encoderConfig.registerEncoder(MeasureScopeWithLayoutNodeKt.class, zzxr.zza);
        encoderConfig.registerEncoder(RuntimeHelpersKt.class, zzvd.zza);
        encoderConfig.registerEncoder(RecipientAvatars.class, zzso.zza);
        encoderConfig.registerEncoder(ListOrderedKt.class, zzve.zza);
        encoderConfig.registerEncoder(AndroidAutofill_androidKt.class, zzwo.zza);
        encoderConfig.registerEncoder(AlphaKt.class, zzwr.zza);
        encoderConfig.registerEncoder(DragAndDrop_androidKt.class, zzwq.zza);
        encoderConfig.registerEncoder(zzadx.class, zzwp.zza);
        encoderConfig.registerEncoder(BrushKt.class, zzxa.zza);
        encoderConfig.registerEncoder(CanvasUtils.class, zzxb.zza);
        encoderConfig.registerEncoder(PathOperation.class, zzxd.zza);
        encoderConfig.registerEncoder(ClipOp.class, zzxc.zza);
        encoderConfig.registerEncoder(CardViewApi21Impl.class, zzvc.zza);
        encoderConfig.registerEncoder(PointMode.class, zzxe.zza);
        encoderConfig.registerEncoder(ShaderKt.class, zzxf.zza);
        encoderConfig.registerEncoder(ShadowKt.class, zzxg.zza);
        encoderConfig.registerEncoder(TileMode.class, zzxh.zza);
        encoderConfig.registerEncoder(zzaet.class, zzxk.zza);
        encoderConfig.registerEncoder(BlurKt.class, zzxl.zza);
        encoderConfig.registerEncoder(AndroidTileMode_androidKt.class, zzww.zza);
        encoderConfig.registerEncoder(DebugUtils.class, zzun.zza);
        encoderConfig.registerEncoder(OffersAnalyticsKt.class, zzwy.zza);
        encoderConfig.registerEncoder(GeometryUtilsKt.class, zzwx.zza);
        encoderConfig.registerEncoder(AndroidShader_androidKt.class, zzwz.zza);
        encoderConfig.registerEncoder(BlockersDataKt.class, zzxu.zza);
        encoderConfig.registerEncoder(Locale_jvmAndAndroidKt.class, zzzt.zza);
        encoderConfig.registerEncoder(zzaad.class, zzst.zza);
        encoderConfig.registerEncoder(KeyguardUtils.class, zzsr.zza);
        encoderConfig.registerEncoder(DeviceUtils.class, zzsq.zza);
        encoderConfig.registerEncoder(InputEventTrigger.Companion.class, zzss.zza);
        encoderConfig.registerEncoder(RenderTreeStringKt.class, zzsv.zza);
        encoderConfig.registerEncoder(ComposeLayoutInfoKt.class, zzsu.zza);
        encoderConfig.registerEncoder(DefaultMethodSupport.class, zzsw.zza);
        encoderConfig.registerEncoder(FullscreenAdViewKt.class, zzsx.zza);
        encoderConfig.registerEncoder(DisclosureSectionKt.class, zzsy.zza);
        encoderConfig.registerEncoder(HeaderSectionKt.class, zzsz.zza);
        encoderConfig.registerEncoder(EarningTool.Tool.class, zzta.zza);
        encoderConfig.registerEncoder(SheetStateKt.class, zzsk.zza);
        encoderConfig.registerEncoder(zzqu.class, zzsm.zza);
        encoderConfig.registerEncoder(zzqt.class, zzsl.zza);
        encoderConfig.registerEncoder(TargetUtils.class, zzul.zza);
        encoderConfig.registerEncoder(Section.Header.class, zzti.zza);
        encoderConfig.registerEncoder(NotificationManagerCompat.Api23Impl.class, zzqw.zza);
        encoderConfig.registerEncoder(NotificationCompat.class, zzqx.zza);
        encoderConfig.registerEncoder(StateBindingsKt.class, zzty.zza);
        encoderConfig.registerEncoder(NotificationManagerCompat.Api28Impl.class, zzqy.zza);
        encoderConfig.registerEncoder(NotificationManagerCompat.Api26Impl.class, zzqz.zza);
        encoderConfig.registerEncoder(UriKt.class, zzrk.zza);
        encoderConfig.registerEncoder(MathUtils.class, zzrl.zza);
        encoderConfig.registerEncoder(ContextCompat$Api26Impl.class, zzra.zza);
        encoderConfig.registerEncoder(PendingIntentCompat.class, zzrb.zza);
        encoderConfig.registerEncoder(HapticFeedbackConstantsCompat.class, zzrq.zza);
        encoderConfig.registerEncoder(DisplayCutoutCompat.Api28Impl.class, zzrr.zza);
        encoderConfig.registerEncoder(ViewGroupKt.class, zzru.zza);
        encoderConfig.registerEncoder(ViewConfigurationCompat.class, zzrv.zza);
        encoderConfig.registerEncoder(ComposeBottomSheetKt.class, zzsg.zza);
        encoderConfig.registerEncoder(BasicShieetKt.class, zzsh.zza);
        encoderConfig.registerEncoder(ViewPropertyAnimatorListenerAdapter.class, zzrw.zza);
        encoderConfig.registerEncoder(ViewKt.class, zzrx.zza);
        encoderConfig.registerEncoder(CurrencyConfig.Companion.class, zzry.zza);
        encoderConfig.registerEncoder(CardNumberKt.class, zzrz.zza);
        encoderConfig.registerEncoder(TextIndentKt.class, zzxy.zza);
        encoderConfig.registerEncoder(zzahu.class, zztj.zza);
        encoderConfig.registerEncoder(BaselineShiftKt.class, zzvb.zza);
        encoderConfig.registerEncoder(zzahx.class, zzva.zza);
        encoderConfig.registerEncoder(zzahv.class, zzuc.zza);
        encoderConfig.registerEncoder(TextGeometricTransformKt.class, zzxx.zza);
        encoderConfig.registerEncoder(TextDrawStyleKt.class, zzxw.zza);
        encoderConfig.registerEncoder(IntRectKt.class, zzxz.zza);
        encoderConfig.registerEncoder(PoolIcon.class, zzuj.zza);
        encoderConfig.registerEncoder(AliasFormatter.class, zzzv.zza);
        encoderConfig.registerEncoder(AccentColorsKt.class, zzzw.zza);
        encoderConfig.registerEncoder(VelocityKt.class, zzzu.zza);
        encoderConfig.registerEncoder(FakeOverlayLayerKt.class, zzyb.zza);
        encoderConfig.registerEncoder(ImageUtil.class, zzuk.zza);
        encoderConfig.registerEncoder(TextViewKt.class, zzuo.zza);
        encoderConfig.registerEncoder(ViewDragHelper.Callback.class, zzsp.zza);
        encoderConfig.registerEncoder(MatrixExt.class, zzuf.zza);
        encoderConfig.registerEncoder(SwitchViewKt.class, zzum.zza);
        encoderConfig.registerEncoder(DynamicRanges.class, zztz.zza);
        encoderConfig.registerEncoder(AnalyticsMappersKt.class, zztl.zza);
        encoderConfig.registerEncoder(SavingsAction.Action.class, zztm.zza);
        encoderConfig.registerEncoder(AeMode.Companion.class, zztk.zza);
        encoderConfig.registerEncoder(CameraGraph$OperatingMode.class, zztn.zza);
        encoderConfig.registerEncoder(ImageResourcesKt.class, zzvy.zza);
        encoderConfig.registerEncoder(RealSheetStateKt.class, zzsj.zza);
        encoderConfig.registerEncoder(PinnedKt.class, zzsi.zza);
        encoderConfig.registerEncoder(Transformations.class, zzuz.zza);
        encoderConfig.registerEncoder(ViewfinderDefaults.class, zzuy.zza);
        encoderConfig.registerEncoder(Debug.class, zzqv.zza);
        encoderConfig.registerEncoder(UtilsKt.class, zzzq.zza);
        encoderConfig.registerEncoder(TextFieldValueKt.class, zzzs.zza);
        encoderConfig.registerEncoder(InputState_androidKt.class, zzzr.zza);
        encoderConfig.registerEncoder(FocusStrategy.class, zzsn.zza);
        encoderConfig.registerEncoder(MoneyTabBookletKt.class, zztd.zza);
        encoderConfig.registerEncoder(EarningsTimeFrame.TimeFrame.class, zztc.zza);
        encoderConfig.registerEncoder(EarningsHomeUi.Section.AbstractC0087Section.class, zztb.zza);
        encoderConfig.registerEncoder(IBeaconParser.class, zzwc.zza);
        encoderConfig.registerEncoder(zzadm.class, zzwe.zza);
        encoderConfig.registerEncoder(zzadl.class, zzwd.zza);
        encoderConfig.registerEncoder(com.squareup.cash.recipients.data.UtilsKt.class, zzri.zza);
        encoderConfig.registerEncoder(DrawableCompat.class, zzrj.zza);
        encoderConfig.registerEncoder(PullRefreshKt.class, zzwh.zza);
        encoderConfig.registerEncoder(ErrorReportingKt.class, zzwk.zza);
        encoderConfig.registerEncoder(zzadq.class, zzwi.zza);
        encoderConfig.registerEncoder(ExtensionsKt.class, zzwj.zza);
        encoderConfig.registerEncoder(FontsContractCompat.class, zzrm.zza);
        encoderConfig.registerEncoder(TraceCompat$Api29Impl.class, zzrn.zza);
        encoderConfig.registerEncoder(CanvasCompatQ.class, zzze.zza);
        encoderConfig.registerEncoder(CanvasCompatO.class, zzzd.zza);
        encoderConfig.registerEncoder(zzaho.class, zzzo.zza);
        encoderConfig.registerEncoder(RecipientMapper.class, zzzp.zza);
        encoderConfig.registerEncoder(androidx.compose.ui.draw.BlurKt.class, zzws.zza);
        encoderConfig.registerEncoder(androidx.compose.ui.draw.ShadowKt.class, zzwv.zza);
        encoderConfig.registerEncoder(RotateKt.class, zzwt.zza);
        encoderConfig.registerEncoder(ScaleKt.class, zzwu.zza);
        encoderConfig.registerEncoder(UseCaseUtil.class, zzuh.zza);
        encoderConfig.registerEncoder(MotionEventCompat.class, zzrs.zza);
        encoderConfig.registerEncoder(KeyEventDispatcher.class, zzrt.zza);
        encoderConfig.registerEncoder(Threads.class, zzug.zza);
        encoderConfig.registerEncoder(UseCaseAdditionSimulator.class, zzud.zza);
        encoderConfig.registerEncoder(zzadt.class, zzwl.zza);
        encoderConfig.registerEncoder(ListSaverKt.class, zzwn.zza);
        encoderConfig.registerEncoder(Utils_androidKt.class, zzwm.zza);
        encoderConfig.registerEncoder(TypedValueCompat.class, zzro.zza);
        encoderConfig.registerEncoder(TextUtilsCompat.class, zzrp.zza);
        encoderConfig.registerEncoder(PagerLayoutInfoKt.class, zzvs.zza);
        encoderConfig.registerEncoder(PagerMeasureKt.class, zzvt.zza);
        encoderConfig.registerEncoder(ComposeUtilsKt.class, zzvu.zza);
        encoderConfig.registerEncoder(PaintCompat.class, zzre.zza);
        encoderConfig.registerEncoder(PermissionChecker.class, zzrf.zza);
        encoderConfig.registerEncoder(LazyLayoutPagerKt.class, zzvp.zza);
        encoderConfig.registerEncoder(PagerDefaults.class, zzvq.zza);
        encoderConfig.registerEncoder(PagerKt.class, zzvr.zza);
        encoderConfig.registerEncoder(ContextCompat$Api33Impl.class, zzrc.zza);
        encoderConfig.registerEncoder(ContextCompat$Api28Impl.class, zzrd.zza);
        encoderConfig.registerEncoder(MooncakeTheme.class, zzvv.zza);
        encoderConfig.registerEncoder(zzade.class, zzvw.zza);
        encoderConfig.registerEncoder(ColorCodesKt.class, zzvx.zza);
        encoderConfig.registerEncoder(TypefaceCompatUtil.class, zzrg.zza);
        encoderConfig.registerEncoder(PathParser.class, zzrh.zza);
        encoderConfig.registerEncoder(ThrottledCallbacksKt.class, zzza.zza);
        encoderConfig.registerEncoder(zzagy.class, zzzb.zza);
        encoderConfig.registerEncoder(AudioConfigUtil.class, zzup.zza);
        encoderConfig.registerEncoder(zzabx.class, zzur.zza);
        encoderConfig.registerEncoder(zzabw.class, zzuq.zza);
        encoderConfig.registerEncoder(StorageUtil.class, zzus.zza);
        encoderConfig.registerEncoder(MoveBitcoinViewKt.class, zzxm.zza);
        encoderConfig.registerEncoder(BackwardsCompatNodeKt.class, zzxn.zza);
        encoderConfig.registerEncoder(PopupWindowCompat.class, zzsc.zza);
        encoderConfig.registerEncoder(ImageViewCompat.class, zzsd.zza);
        encoderConfig.registerEncoder(zzahh.class, zzzj.zza);
        encoderConfig.registerEncoder(BitmapPainterKt.class, zzxi.zza);
        encoderConfig.registerEncoder(zzaer.class, zzxj.zza);
        encoderConfig.registerEncoder(EdgeEffectCompat.class, zzsa.zza);
        encoderConfig.registerEncoder(DateScrubberKt.class, zzsb.zza);
        encoderConfig.registerEncoder(OfflineManagerKt.class, zzzc.zza);
        encoderConfig.registerEncoder(BadgedAvatarKt.class, zzvg.zza);
        encoderConfig.registerEncoder(AvatarKt.class, zzvo.zza);
        encoderConfig.registerEncoder(LazyListLayoutInfoKt.class, zzvl.zza);
        encoderConfig.registerEncoder(LazyListKt.class, zzvk.zza);
        encoderConfig.registerEncoder(LazyGridDslKt.class, zzvm.zza);
        encoderConfig.registerEncoder(LazyGridKt.class, zzvn.zza);
        encoderConfig.registerEncoder(LazyDslKt.class, zzvj.zza);
        encoderConfig.registerEncoder(zzacn.class, zzvf.zza);
        encoderConfig.registerEncoder(zzacp.class, zzvi.zza);
        encoderConfig.registerEncoder(zzaco.class, zzvh.zza);
        encoderConfig.registerEncoder(TextFieldStateKt.class, zzwa.zza);
        encoderConfig.registerEncoder(EvalHelpersKt.class, zztw.zza);
        encoderConfig.registerEncoder(RipplesKt.class, zzvz.zza);
        encoderConfig.registerEncoder(zzadj.class, zzwb.zza);
        encoderConfig.registerEncoder(StringUtilsKt.class, zztt.zza);
        encoderConfig.registerEncoder(CameraCaptureCallbacks.class, zztx.zza);
        encoderConfig.registerEncoder(zzafe.class, zzya.zza);
        encoderConfig.registerEncoder(AnyUtilsKt.class, zztv.zza);
        encoderConfig.registerEncoder(ContextKt.class, zztu.zza);
        encoderConfig.registerEncoder(DistanceAndFlags.class, zzxo.zza);
        encoderConfig.registerEncoder(FontWeightKt.class, zzzm.zza);
        encoderConfig.registerEncoder(zzaey.class, zzxq.zza);
        encoderConfig.registerEncoder(HitTestResultKt.class, zzxp.zza);
        encoderConfig.registerEncoder(zzahi.class, zzzk.zza);
        encoderConfig.registerEncoder(DbSessionManagerKt.class, zzse.zza);
        encoderConfig.registerEncoder(TextViewCompat$Api28Impl.class, zzsf.zza);
        encoderConfig.registerEncoder(zzahj.class, zzzl.zza);
        encoderConfig.registerEncoder(Aliases.class, zzts.zza);
        encoderConfig.registerEncoder(TrimMode.class, zztr.zza);
        encoderConfig.registerEncoder(androidx.camera.camera2.pipe.core.Debug.class, zztq.zza);
        encoderConfig.registerEncoder(ReplaceModeKt.class, zzto.zza);
        encoderConfig.registerEncoder(WiresAccountInfo.WiresProfile.class, zztp.zza);
        encoderConfig.registerEncoder(ImageResources_androidKt.class, zzyx.zza);
        encoderConfig.registerEncoder(PrimitiveResources_androidKt.class, zzyy.zza);
        encoderConfig.registerEncoder(zzagi.class, zzym.zza);
        encoderConfig.registerEncoder(JvmActuals_jvmKt.class, zzyq.zza);
        encoderConfig.registerEncoder(zzagj.class, zzyn.zza);
        encoderConfig.registerEncoder(WindowInfoImpl.Companion.class, zzyu.zza);
        encoderConfig.registerEncoder(zzagn.class, zzyr.zza);
        encoderConfig.registerEncoder(ColorResources_androidKt.class, zzyw.zza);
        encoderConfig.registerEncoder(com.squareup.cash.paychecks.common.presenters.UtilsKt.class, zzyv.zza);
        encoderConfig.registerEncoder(DerivedSize.Companion.class, zzyp.zza);
        encoderConfig.registerEncoder(zzagk.class, zzyo.zza);
        encoderConfig.registerEncoder(ShapeContainingUtilKt.class, zzyt.zza);
        encoderConfig.registerEncoder(ArcadeThemeKt.class, zzys.zza);
        encoderConfig.registerEncoder(LayoutUpdate.class, zzyl.zza);
        encoderConfig.registerEncoder(zzage.class, zzyj.zza$1);
        encoderConfig.registerEncoder(OverlaysKt.class, zzyj.zza);
        encoderConfig.registerEncoder(zzafv.class, zzyg.zza);
        encoderConfig.registerEncoder(zzagc.class, zzyi.zza);
        encoderConfig.registerEncoder(zzafy.class, zzyh.zza);
        encoderConfig.registerEncoder(zzafj.class, zzyc.zza);
        encoderConfig.registerEncoder(zzagx.class, zzyz.zza);
        encoderConfig.registerEncoder(zzafs.class, zzyf.zza);
        encoderConfig.registerEncoder(zzafm.class, zzyd.zza);
        encoderConfig.registerEncoder(OverlayKt.class, zzye.zza);
        encoderConfig.registerEncoder(zzahe.class, zzzg.zza);
        encoderConfig.registerEncoder(zzahg.class, zzzi.zza);
        encoderConfig.registerEncoder(AnalyticsHelperKt.class, zzzh.zza);
        encoderConfig.registerEncoder(LayoutCompat_androidKt.class, zzzf.zza);
    }

    @Override // com.google.android.gms.internal.mlkit_genai_prompt.zzamp
    public zzana zzb(Class cls) {
        switch (this.$r8$classId) {
            case 2:
                if (!zzals.class.isAssignableFrom(cls)) {
                    a$$ExternalSyntheticBUOutline0.m$3("Unsupported message type: ".concat(cls.getName()));
                    return null;
                }
                try {
                    return (zzana) zzals.zzk(cls.asSubclass(zzals.class)).zzb(3);
                } catch (Exception e) {
                    OptionalProvider$$ExternalSyntheticLambda0.m("Unable to get message info for ".concat(cls.getName()), (Throwable) e);
                    return null;
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // com.google.android.gms.internal.mlkit_genai_prompt.zzamp
    public boolean zzc(Class cls) {
        switch (this.$r8$classId) {
            case 2:
                return zzals.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }

    public static synchronized void zza() {
        synchronized (zzzx.class) {
            if (zza$1 == null) {
                zza$1 = new zzzx(1);
            }
        }
    }

    @Override // com.google.android.gms.internal.mlkit_genai_prompt.zzajc
    public void zza(GenAiException genAiException) {
    }

    public static final int zza(zznk zznkVar) {
        zznk zznkVar2 = zznk.zza;
        int ordinal = zznkVar.ordinal();
        if (ordinal == 0) {
            return 636;
        }
        if (ordinal == 1) {
            return 643;
        }
        if (ordinal == 2) {
            return 644;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return 0;
    }

    /* renamed from: zza, reason: collision with other method in class */
    public zzmz m2023zza() {
        zzmz zzmzVar;
        zzmz zzmzVar2 = zzmz.zzb;
        if (zzmzVar2 != null) {
            return zzmzVar2;
        }
        synchronized (this) {
            zzmzVar = zzmz.zzb;
            if (zzmzVar == null) {
                zzmzVar = new zzmz(new MlKitThreadPool());
                zzmz.zzb = zzmzVar;
            }
        }
        return zzmzVar;
    }
}
