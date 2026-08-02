package com.squareup.cash.blockers.views;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.activity.result.contract.ActivityResultContract;
import com.squareup.cash.filepicker.FilePickerResult;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/squareup/cash/blockers/views/FilePickerContract;", "Landroidx/activity/result/contract/ActivityResultContract;", "", "Lcom/squareup/cash/filepicker/FilePickerResult;", "views"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class FilePickerContract extends ActivityResultContract<String, FilePickerResult> {
    @Override // androidx.activity.result.contract.ActivityResultContract
    public final Intent createIntent(Context context, Object obj) {
        String str = (String) obj;
        str.getClass();
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType(str);
        return intent;
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    public final Object parseResult(int i, Intent intent) {
        Uri data;
        String uri = (intent == null || (data = intent.getData()) == null) ? null : data.toString();
        return i != -1 ? i != 0 ? new FilePickerResult.Failure(i, uri) : FilePickerResult.Canceled.INSTANCE : uri != null ? new FilePickerResult.Success(uri) : new FilePickerResult.Failure(i, uri);
    }
}
