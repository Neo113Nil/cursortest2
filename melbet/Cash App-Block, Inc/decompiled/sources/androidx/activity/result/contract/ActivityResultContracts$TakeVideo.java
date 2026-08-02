package androidx.activity.result.contract;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import androidx.activity.result.contract.ActivityResultContract;
import kotlin.Deprecated;
import kotlin.Metadata;

@Deprecated
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001¨\u0006\u0004"}, d2 = {"androidx/activity/result/contract/ActivityResultContracts$TakeVideo", "Landroidx/activity/result/contract/ActivityResultContract;", "Landroid/net/Uri;", "Landroid/graphics/Bitmap;", "activity"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public class ActivityResultContracts$TakeVideo extends ActivityResultContract<Uri, Bitmap> {
    @Override // androidx.activity.result.contract.ActivityResultContract
    public final Intent createIntent(Context context, Object obj) {
        Uri uri = (Uri) obj;
        uri.getClass();
        Intent addFlags = new Intent("android.media.action.VIDEO_CAPTURE").putExtra("output", uri).addFlags(1).addFlags(2);
        addFlags.getClass();
        return addFlags;
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    public final ActivityResultContract.SynchronousResult getSynchronousResult(Context context, Uri uri) {
        context.getClass();
        uri.getClass();
        return null;
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    public final Object parseResult(int i, Intent intent) {
        if (i != -1) {
            intent = null;
        }
        if (intent != null) {
            return (Bitmap) intent.getParcelableExtra("data");
        }
        return null;
    }
}
