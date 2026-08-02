package androidx.activity.result.contract;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import androidx.activity.result.PickVisualMediaRequest;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.core.view.WindowCompat$Api30Impl;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.NavigationModule$Companion;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001:\u0005\u0004\u0005\u0006\u0007\b¨\u0006\t"}, d2 = {"androidx/activity/result/contract/ActivityResultContracts$PickVisualMedia", "Landroidx/activity/result/contract/ActivityResultContract;", "Landroidx/activity/result/PickVisualMediaRequest;", "Landroid/net/Uri;", "Api30Impl", "VisualMediaType", "ImageOnly", "ImageAndVideo", "PhotosTab", "activity"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public class ActivityResultContracts$PickVisualMedia extends ActivityResultContract<PickVisualMediaRequest, Uri> {

    /* loaded from: classes3.dex */
    public final class ImageAndVideo implements VisualMediaType {
        public static final ImageAndVideo INSTANCE = new ImageAndVideo();
    }

    /* loaded from: classes3.dex */
    public final class ImageOnly implements VisualMediaType {
        public static final ImageOnly INSTANCE = new ImageOnly();
    }

    /* loaded from: classes3.dex */
    public interface VisualMediaType {
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    public final Intent createIntent(Context context, Object obj) {
        ResolveInfo resolveActivity;
        ResolveInfo resolveActivity2;
        PickVisualMediaRequest pickVisualMediaRequest = (PickVisualMediaRequest) obj;
        pickVisualMediaRequest.getClass();
        if (WindowCompat$Api30Impl.isSystemPickerAvailable$activity()) {
            Intent intent = new Intent("android.provider.action.PICK_IMAGES");
            intent.setType(WindowCompat$Api30Impl.getVisualMimeType$activity(pickVisualMediaRequest.getMediaType()));
            intent.putExtra("android.provider.extra.PICK_IMAGES_LAUNCH_TAB", 1);
            return intent;
        }
        resolveActivity = context.getPackageManager().resolveActivity(new Intent("androidx.activity.result.contract.action.PICK_IMAGES"), 1114112);
        if (resolveActivity == null) {
            Intent intent2 = new Intent("android.intent.action.OPEN_DOCUMENT");
            intent2.setType(WindowCompat$Api30Impl.getVisualMimeType$activity(pickVisualMediaRequest.getMediaType()));
            if (intent2.getType() == null) {
                intent2.setType("*/*");
                intent2.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*"});
            }
            return intent2;
        }
        resolveActivity2 = context.getPackageManager().resolveActivity(new Intent("androidx.activity.result.contract.action.PICK_IMAGES"), 1114112);
        if (resolveActivity2 == null) {
            a$$ExternalSyntheticBUOutline0.m$1("Required value was null.");
            return null;
        }
        ActivityInfo activityInfo = resolveActivity2.activityInfo;
        Intent intent3 = new Intent("androidx.activity.result.contract.action.PICK_IMAGES");
        intent3.setClassName(activityInfo.applicationInfo.packageName, activityInfo.name);
        intent3.setType(WindowCompat$Api30Impl.getVisualMimeType$activity(pickVisualMediaRequest.getMediaType()));
        intent3.putExtra("androidx.activity.result.contract.extra.PICK_IMAGES_LAUNCH_TAB", 1);
        return intent3;
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    public final ActivityResultContract.SynchronousResult getSynchronousResult(Context context, PickVisualMediaRequest pickVisualMediaRequest) {
        context.getClass();
        pickVisualMediaRequest.getClass();
        return null;
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    public final Object parseResult(int i, Intent intent) {
        if (i != -1) {
            intent = null;
        }
        if (intent == null) {
            return null;
        }
        Uri data = intent.getData();
        return data == null ? (Uri) CollectionsKt.firstOrNull(NavigationModule$Companion.getClipDataUris$activity(intent)) : data;
    }
}
