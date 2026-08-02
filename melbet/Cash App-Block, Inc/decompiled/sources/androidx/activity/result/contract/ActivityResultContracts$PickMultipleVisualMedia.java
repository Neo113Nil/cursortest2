package androidx.activity.result.contract;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.provider.MediaStore;
import androidx.activity.result.PickVisualMediaRequest;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.compose.ui.window.Api33Impl;
import androidx.core.view.WindowCompat$Api30Impl;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001:\u0001\u0005¨\u0006\u0006"}, d2 = {"androidx/activity/result/contract/ActivityResultContracts$PickMultipleVisualMedia", "Landroidx/activity/result/contract/ActivityResultContract;", "Landroidx/activity/result/PickVisualMediaRequest;", "", "Landroid/net/Uri;", "androidx/compose/ui/window/Api33Impl", "activity"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public class ActivityResultContracts$PickMultipleVisualMedia extends ActivityResultContract<PickVisualMediaRequest, List<Uri>> {
    public final int maxItems;

    public ActivityResultContracts$PickMultipleVisualMedia() {
        int maxItems$activity = Api33Impl.getMaxItems$activity();
        this.maxItems = maxItems$activity;
        if (maxItems$activity > 1) {
            return;
        }
        a$$ExternalSyntheticBUOutline0.m$3("Max items must be higher than 1");
        throw null;
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    public final Intent createIntent(Context context, Object obj) {
        ResolveInfo resolveActivity;
        ResolveInfo resolveActivity2;
        PickVisualMediaRequest pickVisualMediaRequest = (PickVisualMediaRequest) obj;
        pickVisualMediaRequest.getClass();
        boolean isSystemPickerAvailable$activity = WindowCompat$Api30Impl.isSystemPickerAvailable$activity();
        int i = this.maxItems;
        if (isSystemPickerAvailable$activity) {
            Intent intent = new Intent("android.provider.action.PICK_IMAGES");
            intent.setType(WindowCompat$Api30Impl.getVisualMimeType$activity(pickVisualMediaRequest.mediaType));
            int min = Math.min(i, pickVisualMediaRequest.maxItems);
            if (min <= 1 || min > MediaStore.getPickImagesMaxLimit()) {
                a$$ExternalSyntheticBUOutline0.m$3("Max items must be greater than 1 and lesser than or equal to MediaStore.getPickImagesMaxLimit()");
                return null;
            }
            intent.putExtra("android.provider.extra.PICK_IMAGES_MAX", min);
            intent.putExtra("android.provider.extra.PICK_IMAGES_LAUNCH_TAB", 1);
            intent.putExtra("android.provider.extra.PICK_IMAGES_IN_ORDER", false);
            return intent;
        }
        resolveActivity = context.getPackageManager().resolveActivity(new Intent("androidx.activity.result.contract.action.PICK_IMAGES"), 1114112);
        if (resolveActivity == null) {
            Intent intent2 = new Intent("android.intent.action.OPEN_DOCUMENT");
            intent2.setType(WindowCompat$Api30Impl.getVisualMimeType$activity(pickVisualMediaRequest.mediaType));
            intent2.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
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
        intent3.setType(WindowCompat$Api30Impl.getVisualMimeType$activity(pickVisualMediaRequest.mediaType));
        int min2 = Math.min(i, pickVisualMediaRequest.maxItems);
        if (min2 <= 1) {
            a$$ExternalSyntheticBUOutline0.m$3("Max items must be greater than 1");
            return null;
        }
        intent3.putExtra("androidx.activity.result.contract.extra.PICK_IMAGES_MAX", min2);
        intent3.putExtra("androidx.activity.result.contract.extra.PICK_IMAGES_LAUNCH_TAB", 1);
        intent3.putExtra("androidx.activity.result.contract.extra.PICK_IMAGES_IN_ORDER", false);
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
        Object arrayList;
        if (i != -1) {
            intent = null;
        }
        if (intent != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Uri data = intent.getData();
            if (data != null) {
                linkedHashSet.add(data);
            }
            ClipData clipData = intent.getClipData();
            if (clipData == null && linkedHashSet.isEmpty()) {
                arrayList = EmptyList.INSTANCE;
            } else {
                if (clipData != null) {
                    int itemCount = clipData.getItemCount();
                    for (int i2 = 0; i2 < itemCount; i2++) {
                        Uri uri = clipData.getItemAt(i2).getUri();
                        if (uri != null) {
                            linkedHashSet.add(uri);
                        }
                    }
                }
                arrayList = new ArrayList(linkedHashSet);
            }
            if (arrayList != null) {
                return arrayList;
            }
        }
        return EmptyList.INSTANCE;
    }
}
