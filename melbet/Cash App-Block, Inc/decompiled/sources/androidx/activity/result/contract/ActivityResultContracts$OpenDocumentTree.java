package androidx.activity.result.contract;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.activity.result.contract.ActivityResultContract;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001¨\u0006\u0003"}, d2 = {"androidx/activity/result/contract/ActivityResultContracts$OpenDocumentTree", "Landroidx/activity/result/contract/ActivityResultContract;", "Landroid/net/Uri;", "activity"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public class ActivityResultContracts$OpenDocumentTree extends ActivityResultContract<Uri, Uri> {
    @Override // androidx.activity.result.contract.ActivityResultContract
    public final Intent createIntent(Context context, Object obj) {
        Uri uri = (Uri) obj;
        Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT_TREE");
        if (uri != null) {
            intent.putExtra("android.provider.extra.INITIAL_URI", uri);
        }
        return intent;
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    public final ActivityResultContract.SynchronousResult getSynchronousResult(Context context, Uri uri) {
        context.getClass();
        return null;
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    public final Object parseResult(int i, Intent intent) {
        if (i != -1) {
            intent = null;
        }
        if (intent != null) {
            return intent.getData();
        }
        return null;
    }
}
