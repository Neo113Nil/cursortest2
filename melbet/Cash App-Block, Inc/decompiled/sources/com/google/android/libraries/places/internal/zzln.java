package com.google.android.libraries.places.internal;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.android.volley.toolbox.ImageRequest;
import com.google.zxing.Result;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public final class zzln extends ImageRequest {
    public final /* synthetic */ HashMap zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzln(zzfv zzfvVar, String str, Result result, zzli zzliVar, HashMap hashMap) {
        super(str, result, zzliVar);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        this.zza = hashMap;
    }

    @Override // com.android.volley.Request
    public final Map getHeaders() {
        return this.zza;
    }
}
