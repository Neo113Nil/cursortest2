package com.squareup.cash.cameralauncher;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.activity.result.contract.ActivityResultContract;
import com.squareup.cash.cameralauncher.CameraResult;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/squareup/cash/cameralauncher/CameraCapturerActivityResultContract;", "Landroidx/activity/result/contract/ActivityResultContract;", "Landroid/net/Uri;", "Lcom/squareup/cash/cameralauncher/CameraResult;", "camera-launcher"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
final class CameraCapturerActivityResultContract extends ActivityResultContract<Uri, CameraResult> {
    @Override // androidx.activity.result.contract.ActivityResultContract
    public final Intent createIntent(Context context, Object obj) {
        Uri uri = (Uri) obj;
        uri.getClass();
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        intent.putExtra("output", uri);
        intent.addFlags(1);
        intent.addFlags(2);
        return intent;
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    public final Object parseResult(int i, Intent intent) {
        return i == -1 ? CameraResult.Success.INSTANCE : CameraResult.Canceled.INSTANCE;
    }
}
