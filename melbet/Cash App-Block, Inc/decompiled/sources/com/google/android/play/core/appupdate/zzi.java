package com.google.android.play.core.appupdate;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.os.Build;
import androidx.camera.video.VideoCapture;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.mediacodec.AsynchronousMediaCodecAdapter$Factory$$ExternalSyntheticLambda0;
import androidx.media3.exoplayer.mediacodec.MediaCodecAdapter;
import com.bumptech.glide.GlideBuilder$1;
import com.bumptech.glide.load.model.AssetUriLoader;
import com.bumptech.glide.load.model.DirectResourceLoader$ResourceOpener;
import com.bumptech.glide.load.model.MediaStoreFileLoader;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.load.model.ModelLoaderFactory;
import com.bumptech.glide.load.model.MultiModelLoaderFactory;
import com.fillr.e0;

/* loaded from: classes4.dex */
public final class zzi implements MediaCodecAdapter.Factory, ModelLoaderFactory, DirectResourceLoader$ResourceOpener {
    public final /* synthetic */ int $r8$classId;
    public final Context zza;

    public /* synthetic */ zzi(Context context, int i) {
        this.$r8$classId = i;
        this.zza = context;
    }

    @Override // com.bumptech.glide.load.model.ModelLoaderFactory
    public ModelLoader build(MultiModelLoaderFactory multiModelLoaderFactory) {
        int i = this.$r8$classId;
        Context context = this.zza;
        switch (i) {
            case 3:
                return new AssetUriLoader(context, this);
            default:
                return new MediaStoreFileLoader(context, 1);
        }
    }

    @Override // com.bumptech.glide.load.model.DirectResourceLoader$ResourceOpener
    public void close(Object obj) {
        ((AssetFileDescriptor) obj).close();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter.Factory
    public MediaCodecAdapter createAdapter(e0 e0Var) {
        Context context;
        if (Build.VERSION.SDK_INT < 31 && ((context = this.zza) == null || !context.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen"))) {
            return new GlideBuilder$1().createAdapter(e0Var);
        }
        int trackType = MimeTypes.getTrackType(((Format) e0Var.c).sampleMimeType);
        Log.i("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type ".concat(Util.getTrackTypeString(trackType)));
        VideoCapture.AnonymousClass3 anonymousClass3 = new VideoCapture.AnonymousClass3(new AsynchronousMediaCodecAdapter$Factory$$ExternalSyntheticLambda0(trackType, 0), new AsynchronousMediaCodecAdapter$Factory$$ExternalSyntheticLambda0(trackType, 1));
        anonymousClass3.val$isStreamActive = true;
        return anonymousClass3.createAdapter(e0Var);
    }

    @Override // com.bumptech.glide.load.model.DirectResourceLoader$ResourceOpener
    public Class getDataClass() {
        return AssetFileDescriptor.class;
    }

    @Override // com.bumptech.glide.load.model.DirectResourceLoader$ResourceOpener
    public Object open(Resources resources, int i, Resources.Theme theme) {
        return resources.openRawResourceFd(i);
    }
}
