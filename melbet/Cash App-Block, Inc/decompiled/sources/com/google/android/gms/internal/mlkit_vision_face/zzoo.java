package com.google.android.gms.internal.mlkit_vision_face;

import com.datadog.android.rum.model.ResourceEvent;
import com.datadog.android.rum.model.ViewEvent;
import com.datadog.android.trace.DatadogTracing;
import com.datadog.android.trace.Trace;
import com.datadog.android.trace.model.SpanEvent;
import com.datadog.opentelemetry.trace.OtelConventions;
import com.datadog.trace.core.util.GlobPattern;
import com.google.android.datatransport.Transformer;
import com.google.firebase.encoders.config.EncoderConfig;
import com.squareup.cash.clientroutes.DeepLinkSpec;
import com.squareup.cash.clientroutes.UriValidator;
import com.squareup.cash.clientrouting.RoutesKt;
import com.squareup.cash.clientrouting.data.FeatureContextKt;
import com.squareup.cash.clientsync.EntitySyncerKt;
import com.squareup.cash.clientsync.UtilsKt;
import com.squareup.cash.common.moneyformatter.MoneyKt;
import com.squareup.protos.franklin.app.GetFlowRequest;
import com.squareup.protos.franklin.common.CardModule;
import com.squareup.protos.franklin.common.SyncValue;
import com.squareup.protos.franklin.ui.UiControl;
import com.squareup.protos.lending.sync_values.Tile;
import com.squareup.stafftasks.resources.Task;
import com.squareup.util.MathsKt;
import com.squareup.util.android.ColorsKt;
import com.squareup.util.android.Emails;
import com.squareup.util.android.Intents;
import com.squareup.util.android.Keyboards;
import com.squareup.util.android.SecurePixelCopy;
import com.squareup.util.android.ShareModule$Companion;
import com.squareup.util.android.StrictModes;
import com.squareup.util.android.Uris;
import com.squareup.util.android.ViewGroups;
import com.squareup.util.android.coroutines.ViewKt;
import com.squareup.util.android.drawable.DrawablesKt;
import com.squareup.util.android.layout.LayoutHelpersKt;
import com.squareup.util.cash.ImagesKt;
import com.squareup.util.cash.Regions;
import com.squareup.util.cash.StringsKt;
import com.squareup.util.compose.ListsKt;
import com.squareup.util.compose.ModifierKt;
import com.squareup.util.compose.MotionKt;
import com.squareup.util.compose.ProgressBarKt;
import com.squareup.util.compose.ResourcesKt;
import com.squareup.util.compose.ScaledSizeKt;
import com.squareup.util.compose.SharedViewEventsKt;
import com.squareup.util.compose.TransitionsKt;
import com.squareup.util.coroutines.FirstOrNullOnTimeoutKt;
import com.squareup.util.coroutines.TakeUntilKt;
import com.squareup.util.coroutines.TickerKt;
import com.squareup.util.emojis.EmojiEmbeddedImageResolverKt;
import com.squareup.wire.GrpcStatus;
import com.squareup.wire.MoshiJsonIntegration;
import com.squareup.wire.internal.GrpcDecoderKt;
import com.squareup.wire.internal.ReflectionKt;
import com.squareup.workflow1.Snapshots;
import com.squareup.workflow1.Worker;
import com.squareup.workflow1.WorkflowIdentifier;
import com.squareup.workflow1.WorkflowInterceptorKt;
import com.squareup.workflow1.Workflows;
import com.squareup.workflow1.ui.BackPressHandlerKt;
import com.squareup.workflow1.ui.CompatibleKt;
import com.squareup.workflow1.ui.SnapshotParcelsKt;
import com.squareup.workflow1.ui.TextControllerKt;
import com.squareup.workflow1.ui.ViewRegistryKt;
import com.squareup.workflow1.ui.ViewShowRenderingKt;
import com.squareup.workflow1.ui.WorkflowViewStateKt;
import com.squareup.workflow1.ui.backstack.ViewStateCacheKt;
import com.stripe.android.core.model.StripeJsonUtils;
import com.stripe.android.core.utils.CreationExtrasKtxKt;

/* loaded from: classes4.dex */
public final class zzoo implements Transformer {
    public static zzoo zza;
    public static final zzoo zza$1 = new zzoo(1);
    public static final /* synthetic */ zzoo zza$2 = new zzoo(2);
    public static final /* synthetic */ zzoo zza$3 = new zzoo(3);
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ zzoo(int i) {
        this.$r8$classId = i;
    }

    public static synchronized void zza() {
        synchronized (zzoo.class) {
            if (zza == null) {
                zza = new zzoo(0);
            }
        }
    }

    @Override // com.google.android.datatransport.Transformer
    public Object apply(Object obj) {
        switch (this.$r8$classId) {
        }
        return (byte[]) obj;
    }

    public void configure(EncoderConfig encoderConfig) {
        encoderConfig.registerEncoder(zzkw.class, zzgq.zza);
        encoderConfig.registerEncoder(zzmv.class, zzip.zza);
        encoderConfig.registerEncoder(UtilsKt.class, zzgr.zza);
        encoderConfig.registerEncoder(ColorsKt.class, zzgt.zza);
        encoderConfig.registerEncoder(Task.Metadata.class, zzgs.zza);
        encoderConfig.registerEncoder(MathsKt.class, zzgu.zza);
        encoderConfig.registerEncoder(zzjr.class, zzfz.zza);
        encoderConfig.registerEncoder(UriValidator.class, zzfy.zza);
        encoderConfig.registerEncoder(zzkl.class, zzgj.zza);
        encoderConfig.registerEncoder(Snapshots.class, zzih.zza);
        encoderConfig.registerEncoder(DeepLinkSpec.Companion.class, zzfx.zza);
        encoderConfig.registerEncoder(zzjo.class, zzfw.zza);
        encoderConfig.registerEncoder(zzll.class, zzhf.zza);
        encoderConfig.registerEncoder(GlobPattern.class, zzgf.zza);
        encoderConfig.registerEncoder(zzkh.class, zzgh.zza);
        encoderConfig.registerEncoder(zzkd.class, zzge.zza);
        encoderConfig.registerEncoder(zzlo.class, zzhg.zza);
        encoderConfig.registerEncoder(GrpcDecoderKt.class, zzie.zza);
        encoderConfig.registerEncoder(zzmn.class, zzif.zza);
        encoderConfig.registerEncoder(MoshiJsonIntegration.class, zzid.zza);
        encoderConfig.registerEncoder(SecurePixelCopy.class, zzha.zza);
        encoderConfig.registerEncoder(CreationExtrasKtxKt.class, zzfg.zza);
        encoderConfig.registerEncoder(ShareModule$Companion.class, zzhb.zza);
        encoderConfig.registerEncoder(ViewGroups.class, zzhh.zza);
        encoderConfig.registerEncoder(LayoutHelpersKt.class, zzhk.zza);
        encoderConfig.registerEncoder(DrawablesKt.class, zzhj.zza);
        encoderConfig.registerEncoder(ViewKt.class, zzhi.zza);
        encoderConfig.registerEncoder(ListsKt.class, zzhp.zza);
        encoderConfig.registerEncoder(ModifierKt.class, zzhq.zza);
        encoderConfig.registerEncoder(ProgressBarKt.class, zzhs.zza);
        encoderConfig.registerEncoder(MotionKt.class, zzhr.zza);
        encoderConfig.registerEncoder(Keyboards.class, zzgz.zza);
        encoderConfig.registerEncoder(ResourcesKt.class, zzht.zza);
        encoderConfig.registerEncoder(ScaledSizeKt.class, zzhu.zza);
        encoderConfig.registerEncoder(SharedViewEventsKt.class, zzhv.zza);
        encoderConfig.registerEncoder(TransitionsKt.class, zzhw.zza);
        encoderConfig.registerEncoder(GrpcStatus.Companion.class, zzib.zza);
        encoderConfig.registerEncoder(MoneyKt.class, zzic.zza);
        encoderConfig.registerEncoder(com.squareup.util.coil.UtilsKt.class, zzhl.zza);
        encoderConfig.registerEncoder(zzkp.class, zzgo.zza);
        encoderConfig.registerEncoder(Regions.class, zzhn.zza);
        encoderConfig.registerEncoder(ImagesKt.class, zzhm.zza);
        encoderConfig.registerEncoder(StringsKt.class, zzho.zza);
        encoderConfig.registerEncoder(ReflectionKt.class, zzig.zza);
        encoderConfig.registerEncoder(SnapshotParcelsKt.class, zzit.zza);
        encoderConfig.registerEncoder(zzjd.class, zzfl.zza);
        encoderConfig.registerEncoder(zzjb.class, zzfj.zza);
        encoderConfig.registerEncoder(zzja.class, zzfi.zza);
        encoderConfig.registerEncoder(zzjc.class, zzfk.zza);
        encoderConfig.registerEncoder(zzjf.class, zzfn.zza);
        encoderConfig.registerEncoder(zzje.class, zzfm.zza);
        encoderConfig.registerEncoder(zzjg.class, zzfo.zza);
        encoderConfig.registerEncoder(zzjh.class, zzfp.zza);
        encoderConfig.registerEncoder(zzji.class, zzfq.zza);
        encoderConfig.registerEncoder(zzjj.class, zzfr.zza);
        encoderConfig.registerEncoder(zzjk.class, zzfs.zza);
        encoderConfig.registerEncoder(zzec.class, zzfc.zza);
        encoderConfig.registerEncoder(zzee.class, zzfe.zza);
        encoderConfig.registerEncoder(zzed.class, zzfd.zza);
        encoderConfig.registerEncoder(zzkn.class, zzgm.zza);
        encoderConfig.registerEncoder(RoutesKt.class, zzga.zza);
        encoderConfig.registerEncoder(GetFlowRequest.Input.class, zzeg.zza);
        encoderConfig.registerEncoder(zzdc.class, zzeh.zza);
        encoderConfig.registerEncoder(zzjv.class, zzgc.zza);
        encoderConfig.registerEncoder(zzdf.class, zzei.zza);
        encoderConfig.registerEncoder(zzde.class, zzej.zza);
        encoderConfig.registerEncoder(zzdp.class, zzeo.zza);
        encoderConfig.registerEncoder(zzdn.class, zzep.zza);
        encoderConfig.registerEncoder(zzdh.class, zzek.zza);
        encoderConfig.registerEncoder(zzdg.class, zzel.zza);
        encoderConfig.registerEncoder(CardModule.Type.class, zzeq.zza);
        encoderConfig.registerEncoder(ResourceEvent.Companion.class, zzer.zza);
        encoderConfig.registerEncoder(zzdt.class, zzes.zza);
        encoderConfig.registerEncoder(zzds.class, zzet.zza);
        encoderConfig.registerEncoder(zzeb.class, zzfa.zza);
        encoderConfig.registerEncoder(zzea.class, zzfb.zza);
        encoderConfig.registerEncoder(zzdv.class, zzeu.zza);
        encoderConfig.registerEncoder(zzdu.class, zzev.zza);
        encoderConfig.registerEncoder(zzdx.class, zzew.zza);
        encoderConfig.registerEncoder(zzdw.class, zzex.zza);
        encoderConfig.registerEncoder(DatadogTracing.class, zzik.zza);
        encoderConfig.registerEncoder(zzna.class, zzgb.zza);
        encoderConfig.registerEncoder(WorkflowViewStateKt.class, zzgy.zza);
        encoderConfig.registerEncoder(ViewShowRenderingKt.class, zzgx.zza);
        encoderConfig.registerEncoder(TextControllerKt.class, zzgg.zza);
        encoderConfig.registerEncoder(ViewStateCacheKt.class, zzij.zza);
        encoderConfig.registerEncoder(zznf.class, zzii.zza);
        encoderConfig.registerEncoder(Trace.class, zzil.zza);
        encoderConfig.registerEncoder(ViewRegistryKt.class, zzgk.zza);
        encoderConfig.registerEncoder(OtelConventions.class, zziv.zza);
        encoderConfig.registerEncoder(StripeJsonUtils.class, zziw.zza);
        encoderConfig.registerEncoder(SpanEvent.Account.class, zziu.zza);
        encoderConfig.registerEncoder(Worker.DefaultImpls.class, zzim.zza);
        encoderConfig.registerEncoder(FeatureContextKt.class, zzgl.zza);
        encoderConfig.registerEncoder(EntitySyncerKt.class, zzgp.zza);
        encoderConfig.registerEncoder(zziz.class, zzfh.zza);
        encoderConfig.registerEncoder(ViewEvent.Companion.class, zzgi.zza);
        encoderConfig.registerEncoder(zzko.class, zzgn.zza);
        encoderConfig.registerEncoder(com.squareup.cash.clientrouting.UtilsKt.class, zzgd.zza);
        encoderConfig.registerEncoder(Intents.class, zzgw.zza);
        encoderConfig.registerEncoder(Emails.class, zzgv.zza);
        encoderConfig.registerEncoder(zzdb.class, zzef.zza);
        encoderConfig.registerEncoder(Workflows.class, zziq.zza);
        encoderConfig.registerEncoder(CompatibleKt.class, zzis.zza);
        encoderConfig.registerEncoder(BackPressHandlerKt.class, zzir.zza);
        encoderConfig.registerEncoder(UiControl.Button.class, zzff.zza);
        encoderConfig.registerEncoder(Tile.AbstractC0074Tile.class, zzfv.zza);
        encoderConfig.registerEncoder(zzjm.class, zzfu.zza);
        encoderConfig.registerEncoder(zzjl.class, zzft.zza);
        encoderConfig.registerEncoder(StrictModes.class, zzhc.zza);
        encoderConfig.registerEncoder(Uris.class, zzhe.zza);
        encoderConfig.registerEncoder(com.squareup.util.android.StringsKt.class, zzhd.zza);
        encoderConfig.registerEncoder(zzdj.class, zzem.zza);
        encoderConfig.registerEncoder(zzdi.class, zzen.zza);
        encoderConfig.registerEncoder(FirstOrNullOnTimeoutKt.class, zzhx.zza);
        encoderConfig.registerEncoder(EmojiEmbeddedImageResolverKt.class, zzia.zza);
        encoderConfig.registerEncoder(TakeUntilKt.class, zzhy.zza);
        encoderConfig.registerEncoder(TickerKt.class, zzhz.zza);
        encoderConfig.registerEncoder(SyncValue.Value.class, zzey.zza);
        encoderConfig.registerEncoder(zzdy.class, zzez.zza);
        encoderConfig.registerEncoder(WorkflowInterceptorKt.class, zzio.zza);
        encoderConfig.registerEncoder(WorkflowIdentifier.Companion.class, zzin.zza);
    }
}
