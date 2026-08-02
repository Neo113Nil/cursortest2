package com.google.android.gms.internal.mlkit_vision_common;

import app.cash.zipline.loader.ZiplineFile;
import app.cash.zipline.loader.internal.fetcher.FetcherKt;
import array.SortOrder;
import coil3.Image_androidKt;
import coil3.UriKt;
import coil3.Uri_androidKt;
import coil3.decode.ImageSource;
import coil3.decode.ImageSourceKt;
import coil3.decode.StaticImageDecoderKt;
import coil3.intercept.EngineInterceptorKt;
import coil3.network.CacheNetworkResponse;
import coil3.network.internal.UtilsKt;
import coil3.request.ViewTargetRequestManagerKt;
import coil3.size.ViewSizeResolverKt;
import coil3.svg.internal.Utils_androidKt;
import coil3.transform.TransformationsKt;
import coil3.util.BitmapsKt;
import coil3.util.DrawableUtils;
import coil3.util.FileSystemsKt;
import coil3.util.IntPair;
import com.android.volley.toolbox.HttpHeaderParser;
import com.android.volley.toolbox.NetworkUtility;
import com.bugsnag.android.IOUtils;
import com.bugsnag.android.internal.StringUtils;
import com.bumptech.glide.RegistryFactory;
import com.bumptech.glide.load.ImageHeaderParserUtils;
import com.bumptech.glide.load.data.mediastore.MediaStoreUtil;
import com.bumptech.glide.module.AppGlideModule;
import com.bumptech.glide.module.ManifestParser;
import com.datadog.android.core.internal.metrics.RemovalReason;
import com.datadog.android.core.internal.thread.ThreadExtKt;
import com.datadog.android.core.internal.utils.ByteArrayExtKt;
import com.datadog.android.core.internal.utils.MiscUtilsKt;
import com.datadog.android.core.persistence.SerializerKt;
import com.datadog.android.ndk.internal.NdkCrashLog;
import com.datadog.android.rum.Rum;
import com.datadog.android.rum.internal.monitor.StorageEvent;
import com.datadog.android.rum.internal.utils.RumTagsUtilsKt;
import com.datadog.android.rum.internal.utils.RuntimeUtilsKt;
import com.datadog.android.rum.internal.utils.SdkCoreExtKt;
import com.datadog.android.rum.internal.utils.ViewUtilsKt;
import com.datadog.android.rum.model.ActionEvent;
import com.datadog.android.rum.model.ErrorEvent;
import com.datadog.android.rum.model.LongTaskEvent;
import com.google.android.datatransport.Transformer;
import com.google.firebase.encoders.config.EncoderConfig;
import com.squareup.protos.cash.marketdata.model.News;
import com.squareup.protos.cash.postcard.CardModule;
import com.squareup.protos.cash.supportal.app.ChatMessage;
import com.squareup.protos.cash.ui.ColoredButton;

/* loaded from: classes4.dex */
public final class zzmw implements Transformer {
    public static zzmw zza;
    public static final zzmw zza$1 = new zzmw(1);
    public static final /* synthetic */ zzmw zza$2 = new zzmw(2);
    public static final /* synthetic */ zzmw zza$3 = new zzmw(3);
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ zzmw(int i) {
        this.$r8$classId = i;
    }

    public static synchronized void zza() {
        synchronized (zzmw.class) {
            if (zza == null) {
                zza = new zzmw(0);
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
        encoderConfig.registerEncoder(zziy.class, zzeo.zza);
        encoderConfig.registerEncoder(zzla.class, zzgu.zza);
        encoderConfig.registerEncoder(ActionEvent.Companion.class, zzep.zza);
        encoderConfig.registerEncoder(zzjc.class, zzer.zza);
        encoderConfig.registerEncoder(zzja.class, zzeq.zza);
        encoderConfig.registerEncoder(zzjb.class, zzes.zza);
        encoderConfig.registerEncoder(zzhy.class, zzdr.zza);
        encoderConfig.registerEncoder(zzhx.class, zzdq.zza);
        encoderConfig.registerEncoder(zzim.class, zzeh.zza);
        encoderConfig.registerEncoder(zzku.class, zzgm.zza);
        encoderConfig.registerEncoder(zzhw.class, zzdp.zza);
        encoderConfig.registerEncoder(Rum.class, zzdo.zza);
        encoderConfig.registerEncoder(News.Action.class, zzfd.zza);
        encoderConfig.registerEncoder(zzlu.class, zzeb.zza);
        encoderConfig.registerEncoder(zzij.class, zzee.zza);
        encoderConfig.registerEncoder(SdkCoreExtKt.class, zzea.zza);
        encoderConfig.registerEncoder(zzjm.class, zzfe.zza);
        encoderConfig.registerEncoder(ErrorEvent.Meta.Companion.class, zzgj.zza);
        encoderConfig.registerEncoder(ErrorEvent.Os.Companion.class, zzgk.zza);
        encoderConfig.registerEncoder(zzkq.class, zzgi.zza);
        encoderConfig.registerEncoder(ActionEvent.Dd.Companion.class, zzey.zza);
        encoderConfig.registerEncoder(zzlt.class, zzcy.zza);
        encoderConfig.registerEncoder(zzjh.class, zzez.zza);
        encoderConfig.registerEncoder(zzju.class, zzfm.zza);
        encoderConfig.registerEncoder(zzjx.class, zzfp.zza);
        encoderConfig.registerEncoder(zzjw.class, zzfo.zza);
        encoderConfig.registerEncoder(zzjv.class, zzfn.zza);
        encoderConfig.registerEncoder(zzkg.class, zzfy.zza);
        encoderConfig.registerEncoder(zzkh.class, zzfz.zza);
        encoderConfig.registerEncoder(ErrorEvent.Dd.Companion.class, zzgb.zza);
        encoderConfig.registerEncoder(ErrorEvent.Csp.Companion.class, zzga.zza);
        encoderConfig.registerEncoder(zzjf.class, zzex.zza);
        encoderConfig.registerEncoder(zzkk.class, zzgc.zza);
        encoderConfig.registerEncoder(zzkl.class, zzgd.zza);
        encoderConfig.registerEncoder(zzkm.class, zzge.zza);
        encoderConfig.registerEncoder(CardModule.Type.class, zzgf.zza);
        encoderConfig.registerEncoder(zzkp.class, zzgg.zza);
        encoderConfig.registerEncoder(zzko.class, zzgh.zza);
        encoderConfig.registerEncoder(zzkf.class, zzfu.zza);
        encoderConfig.registerEncoder(zzit.class, zzem.zza);
        encoderConfig.registerEncoder(zzkd.class, zzfw.zza);
        encoderConfig.registerEncoder(ErrorEvent.Companion.class, zzfv.zza);
        encoderConfig.registerEncoder(zzke.class, zzfx.zza);
        encoderConfig.registerEncoder(zzkt.class, zzgl.zza);
        encoderConfig.registerEncoder(zzlg.class, zzha.zza);
        encoderConfig.registerEncoder(zzhk.class, zzdd.zza);
        encoderConfig.registerEncoder(zzhi.class, zzdb.zza);
        encoderConfig.registerEncoder(zzhh.class, zzda.zza);
        encoderConfig.registerEncoder(RemovalReason.class, zzdc.zza);
        encoderConfig.registerEncoder(zzhm.class, zzdf.zza);
        encoderConfig.registerEncoder(ThreadExtKt.class, zzde.zza);
        encoderConfig.registerEncoder(ByteArrayExtKt.class, zzdg.zza);
        encoderConfig.registerEncoder(zzho.class, zzdh.zza);
        encoderConfig.registerEncoder(MiscUtilsKt.class, zzdi.zza);
        encoderConfig.registerEncoder(zzhq.class, zzdj.zza);
        encoderConfig.registerEncoder(SerializerKt.class, zzdk.zza);
        encoderConfig.registerEncoder(ImageHeaderParserUtils.class, zzcu.zza);
        encoderConfig.registerEncoder(zzbs.class, zzcw.zza);
        encoderConfig.registerEncoder(MediaStoreUtil.class, zzcv.zza);
        encoderConfig.registerEncoder(zzir.class, zzek.zza);
        encoderConfig.registerEncoder(zzhz.class, zzds.zza);
        encoderConfig.registerEncoder(SortOrder.class, zzbu.zza);
        encoderConfig.registerEncoder(FetcherKt.class, zzbv.zza);
        encoderConfig.registerEncoder(RumTagsUtilsKt.class, zzdy.zza);
        encoderConfig.registerEncoder(UriKt.class, zzbw.zza);
        encoderConfig.registerEncoder(Image_androidKt.class, zzbx.zza);
        encoderConfig.registerEncoder(CacheNetworkResponse.class, zzcc.zza);
        encoderConfig.registerEncoder(EngineInterceptorKt.class, zzcd.zza);
        encoderConfig.registerEncoder(ImageSource.Metadata.class, zzby.zza);
        encoderConfig.registerEncoder(Uri_androidKt.class, zzbz.zza);
        encoderConfig.registerEncoder(Utils_androidKt.class, zzci.zza);
        encoderConfig.registerEncoder(ViewSizeResolverKt.class, zzcj.zza);
        encoderConfig.registerEncoder(FileSystemsKt.class, zzcm.zza);
        encoderConfig.registerEncoder(DrawableUtils.class, zzcn.zza);
        encoderConfig.registerEncoder(RegistryFactory.class, zzcs.zza);
        encoderConfig.registerEncoder(StringUtils.class, zzct.zza);
        encoderConfig.registerEncoder(HttpHeaderParser.class, zzco.zza);
        encoderConfig.registerEncoder(IntPair.class, zzcp.zza);
        encoderConfig.registerEncoder(IOUtils.class, zzcq.zza);
        encoderConfig.registerEncoder(NetworkUtility.class, zzcr.zza);
        encoderConfig.registerEncoder(zzlo.class, zzgp.zza);
        encoderConfig.registerEncoder(LongTaskEvent.Companion.class, zzdt.zza);
        encoderConfig.registerEncoder(zzll.class, zzew.zza);
        encoderConfig.registerEncoder(zzlk.class, zzev.zza);
        encoderConfig.registerEncoder(zzli.class, zzec.zza);
        encoderConfig.registerEncoder(zzln.class, zzgo.zza);
        encoderConfig.registerEncoder(zzlm.class, zzgn.zza);
        encoderConfig.registerEncoder(zzlp.class, zzgq.zza);
        encoderConfig.registerEncoder(ChatMessage.Body.class, zzei.zza);
        encoderConfig.registerEncoder(ColoredButton.Action.class, zzhc.zza);
        encoderConfig.registerEncoder(zzlr.class, zzhd.zza);
        encoderConfig.registerEncoder(zzlq.class, zzhb.zza);
        encoderConfig.registerEncoder(zzkv.class, zzgr.zza);
        encoderConfig.registerEncoder(zziq.class, zzej.zza);
        encoderConfig.registerEncoder(zziu.class, zzen.zza);
        encoderConfig.registerEncoder(ManifestParser.class, zzcz.zza);
        encoderConfig.registerEncoder(zzik.class, zzef.zza);
        encoderConfig.registerEncoder(zzis.class, zzel.zza);
        encoderConfig.registerEncoder(RuntimeUtilsKt.class, zzdz.zza);
        encoderConfig.registerEncoder(zzib.class, zzdv.zza);
        encoderConfig.registerEncoder(zzic.class, zzdw.zza);
        encoderConfig.registerEncoder(zzia.class, zzdu.zza);
        encoderConfig.registerEncoder(StorageEvent.class, zzdx.zza);
        encoderConfig.registerEncoder(zzje.class, zzeu.zza);
        encoderConfig.registerEncoder(zzjd.class, zzet.zza);
        encoderConfig.registerEncoder(ZiplineFile.Companion.class, zzbt.zza);
        encoderConfig.registerEncoder(zzld.class, zzgx.zza);
        encoderConfig.registerEncoder(zzlf.class, zzgz.zza);
        encoderConfig.registerEncoder(zzle.class, zzgy.zza);
        encoderConfig.registerEncoder(AppGlideModule.class, zzcx.zza);
        encoderConfig.registerEncoder(zzhu.class, zzdn.zza);
        encoderConfig.registerEncoder(NdkCrashLog.Companion.class, zzdm.zza);
        encoderConfig.registerEncoder(zzhs.class, zzdl.zza);
        encoderConfig.registerEncoder(zzji.class, zzfa.zza);
        encoderConfig.registerEncoder(zzjk.class, zzfc.zza);
        encoderConfig.registerEncoder(zzjj.class, zzfb.zza);
        encoderConfig.registerEncoder(StaticImageDecoderKt.class, zzca.zza);
        encoderConfig.registerEncoder(ImageSourceKt.class, zzcb.zza);
        encoderConfig.registerEncoder(zzjn.class, zzff.zza);
        encoderConfig.registerEncoder(zzjq.class, zzfi.zza);
        encoderConfig.registerEncoder(zzjo.class, zzfg.zza);
        encoderConfig.registerEncoder(ActionEvent.Os.Companion.class, zzfh.zza);
        encoderConfig.registerEncoder(coil3.network.internal.Utils_androidKt.class, zzce.zza);
        encoderConfig.registerEncoder(UtilsKt.class, zzcf.zza);
        encoderConfig.registerEncoder(ErrorEvent.Usr.Companion.class, zzgt.zza);
        encoderConfig.registerEncoder(zzkw.class, zzgs.zza);
        encoderConfig.registerEncoder(zzlb.class, zzgv.zza);
        encoderConfig.registerEncoder(zzlc.class, zzgw.zza);
        encoderConfig.registerEncoder(zzjy.class, zzfq.zza);
        encoderConfig.registerEncoder(zzkb.class, zzft.zza);
        encoderConfig.registerEncoder(zzjz.class, zzfr.zza);
        encoderConfig.registerEncoder(zzka.class, zzfs.zza);
        encoderConfig.registerEncoder(BitmapsKt.class, zzck.zza);
        encoderConfig.registerEncoder(TransformationsKt.class, zzcl.zza);
        encoderConfig.registerEncoder(zzil.class, zzeg.zza);
        encoderConfig.registerEncoder(ViewUtilsKt.class, zzed.zza);
        encoderConfig.registerEncoder(zzjr.class, zzfj.zza);
        encoderConfig.registerEncoder(ActionEvent.Usr.Companion.class, zzfl.zza);
        encoderConfig.registerEncoder(zzjs.class, zzfk.zza);
        encoderConfig.registerEncoder(ViewTargetRequestManagerKt.class, zzcg.zza);
        encoderConfig.registerEncoder(zzbc.class, zzch.zza);
    }
}
