package com.google.android.gms.time;

import android.content.Context;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.BaseRenderer;
import androidx.room.Room;
import com.bumptech.glide.load.model.MediaStoreFileLoader;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.load.model.ModelLoaderFactory;
import com.bumptech.glide.load.model.MultiModelLoaderFactory;
import com.google.android.gms.internal.time.zzax;
import com.google.android.gms.internal.time.zzbm;
import com.google.android.gms.internal.time.zzbt;
import com.google.android.gms.internal.time.zzbw;
import com.google.android.gms.internal.time.zzby;
import com.google.android.gms.internal.time.zzcb;
import com.google.android.gms.internal.time.zzcw;
import com.google.android.gms.internal.time.zzs;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* loaded from: classes4.dex */
public final /* synthetic */ class zzc implements ModelLoaderFactory, Continuation {
    public final Context zza;

    public zzc(Context context) {
        context.getClass();
        this.zza = context;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0073, code lost:
    
        if (android.os.Build.VERSION.SDK_INT >= 34) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int supportsFormat(Format format2) {
        String str = format2.sampleMimeType;
        if (str == null || !MimeTypes.isImage(str)) {
            return BaseRenderer.create(0, 0, 0, 0);
        }
        String str2 = format2.sampleMimeType;
        String str3 = Util.DEVICE_DEBUG_INFO;
        str2.getClass();
        switch (str2) {
            case "image/heic":
            case "image/heif":
            case "image/jpeg":
            case "image/webp":
            case "image/bmp":
            case "image/png":
                return BaseRenderer.create(4, 0, 0, 0);
        }
        return BaseRenderer.create(1, 0, 0, 0);
    }

    @Override // com.bumptech.glide.load.model.ModelLoaderFactory
    public ModelLoader build(MultiModelLoaderFactory multiModelLoaderFactory) {
        return new MediaStoreFileLoader(this.zza, 0);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        if (!task.isSuccessful()) {
            return zzcw.zza(task);
        }
        zzby zzbyVar = new zzby((zzax) task.getResult());
        Context context = this.zza;
        return Room.forResult(new zzbm(new zzbt(zzbyVar, new zzs(context.getMainExecutor(), new zzcb("TrustedTimeClientAdapter"), 0)), new zzbw(context, 0)));
    }

    public /* synthetic */ zzc(Context context, boolean z) {
        this.zza = context;
    }
}
