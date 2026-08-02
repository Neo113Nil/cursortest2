package androidx.activity.result.contract;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.activity.result.contract.ActivityResultContract;
import com.squareup.cash.NavigationModule$Companion;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001:\u0001\u0005¨\u0006\u0006"}, d2 = {"androidx/activity/result/contract/ActivityResultContracts$GetMultipleContents", "Landroidx/activity/result/contract/ActivityResultContract;", "", "", "Landroid/net/Uri;", "Companion", "activity"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public class ActivityResultContracts$GetMultipleContents extends ActivityResultContract<String, List<Uri>> {
    @Override // androidx.activity.result.contract.ActivityResultContract
    public final Intent createIntent(Context context, Object obj) {
        String str = (String) obj;
        str.getClass();
        Intent putExtra = new Intent("android.intent.action.GET_CONTENT").addCategory("android.intent.category.OPENABLE").setType(str).putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
        putExtra.getClass();
        return putExtra;
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    public final ActivityResultContract.SynchronousResult getSynchronousResult(Context context, String str) {
        context.getClass();
        str.getClass();
        return null;
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    public final Object parseResult(int i, Intent intent) {
        List clipDataUris$activity;
        if (i != -1) {
            intent = null;
        }
        return (intent == null || (clipDataUris$activity = NavigationModule$Companion.getClipDataUris$activity(intent)) == null) ? EmptyList.INSTANCE : clipDataUris$activity;
    }
}
