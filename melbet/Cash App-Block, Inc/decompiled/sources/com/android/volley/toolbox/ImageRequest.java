package com.android.volley.toolbox;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;
import androidx.tracing.Trace;
import com.android.volley.DefaultRetryPolicy;
import com.android.volley.NetworkResponse;
import com.android.volley.ParseError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyLog;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.libraries.places.internal.zzkr;
import com.google.android.libraries.places.internal.zzks;
import com.google.android.libraries.places.internal.zzli;
import com.google.android.libraries.places.internal.zznv;
import com.google.zxing.Result;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;

/* loaded from: classes3.dex */
public abstract class ImageRequest extends Request {
    public static final Object sDecodeLock = new Object();
    public final Bitmap.Config mDecodeConfig;
    public Result mListener;
    public final Object mLock;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageRequest(String str, Result result, zzli zzliVar) {
        super(str, zzliVar);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        this.mLock = new Object();
        this.mRetryPolicy = new DefaultRetryPolicy(2.0f, IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_INFO, 2);
        this.mListener = result;
        this.mDecodeConfig = config;
    }

    @Override // com.android.volley.Request
    public final void deliverResponse(Object obj) {
        Result result;
        Bitmap bitmap = (Bitmap) obj;
        synchronized (this.mLock) {
            result = this.mListener;
        }
        if (result != null) {
            zzkr zzkrVar = (zzkr) result.resultMetadata;
            TaskCompletionSource taskCompletionSource = (TaskCompletionSource) result.text;
            try {
                zzkrVar.zza = bitmap;
                Trace.checkState("Photo must be set to non-null value.", bitmap != null);
                taskCompletionSource.trySetResult(new zzks(zzkrVar.zza));
            } catch (Error | RuntimeException e) {
                zznv.zzb(e);
                throw e;
            }
        }
    }

    public final Response doParse(NetworkResponse networkResponse) {
        byte[] bArr = (byte[]) networkResponse.data;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPreferredConfig = this.mDecodeConfig;
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        return decodeByteArray == null ? new Response(new ParseError(networkResponse)) : new Response(decodeByteArray, HttpHeaderParser.parseCacheHeaders(networkResponse));
    }

    @Override // com.android.volley.Request
    public final int getPriority() {
        return 1;
    }

    @Override // com.android.volley.Request
    public final Response parseNetworkResponse(NetworkResponse networkResponse) {
        Response doParse;
        synchronized (sDecodeLock) {
            try {
                try {
                    doParse = doParse(networkResponse);
                } catch (OutOfMemoryError e) {
                    VolleyLog.e("Caught OOM for %d byte image, url=%s", Integer.valueOf(((byte[]) networkResponse.data).length), this.mUrl);
                    return new Response(new ParseError(e));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return doParse;
    }
}
