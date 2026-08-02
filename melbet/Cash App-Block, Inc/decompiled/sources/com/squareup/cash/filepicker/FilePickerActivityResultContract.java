package com.squareup.cash.filepicker;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.activity.result.contract.ActivityResultContract;
import com.squareup.cash.filepicker.FilePickerResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/squareup/cash/filepicker/FilePickerActivityResultContract;", "Landroidx/activity/result/contract/ActivityResultContract;", "Lcom/squareup/cash/filepicker/MimeType;", "Lcom/squareup/cash/filepicker/FilePickerResult;", "file-picker"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
final class FilePickerActivityResultContract extends ActivityResultContract<MimeType, FilePickerResult> {
    @Override // androidx.activity.result.contract.ActivityResultContract
    public final Intent createIntent(Context context, Object obj) {
        String str = ((MimeType) obj).value;
        str.getClass();
        Intent intent = new Intent();
        intent.setAction("android.intent.action.GET_CONTENT");
        intent.addCategory("android.intent.category.OPENABLE");
        if (!StringsKt.contains((CharSequence) str, ',', false)) {
            intent.setType(str);
            return intent;
        }
        List split$default = StringsKt.split$default(str, new char[]{','}, 6);
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(split$default, 10));
        Iterator it = split$default.iterator();
        while (it.hasNext()) {
            arrayList.add(StringsKt.trim((String) it.next()).toString());
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        intent.setType("*/*");
        intent.putExtra("android.intent.extra.MIME_TYPES", strArr);
        return intent;
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    public final Object parseResult(int i, Intent intent) {
        Uri data;
        String uri = (intent == null || (data = intent.getData()) == null) ? null : data.toString();
        return i != -1 ? i != 0 ? new FilePickerResult.Failure(i, uri) : FilePickerResult.Canceled.INSTANCE : uri != null ? new FilePickerResult.Success(uri) : new FilePickerResult.Failure(i, uri);
    }
}
