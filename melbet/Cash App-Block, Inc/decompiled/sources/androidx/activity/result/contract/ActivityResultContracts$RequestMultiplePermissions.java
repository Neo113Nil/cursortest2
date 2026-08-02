package androidx.activity.result.contract;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.contract.ActivityResultContract;
import com.squareup.util.Strings;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\u0010$\n\u0002\u0010\u000b\n\u0000\u0018\u00002 \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u00040\u0001¨\u0006\u0006"}, d2 = {"androidx/activity/result/contract/ActivityResultContracts$RequestMultiplePermissions", "Landroidx/activity/result/contract/ActivityResultContract;", "", "", "", "", "activity"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ActivityResultContracts$RequestMultiplePermissions extends ActivityResultContract<String[], Map<String, Boolean>> {
    @Override // androidx.activity.result.contract.ActivityResultContract
    public final Intent createIntent(Context context, Object obj) {
        String[] strArr = (String[]) obj;
        strArr.getClass();
        Intent putExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr);
        putExtra.getClass();
        return putExtra;
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    public final ActivityResultContract.SynchronousResult getSynchronousResult(Context context, String[] strArr) {
        String[] strArr2 = strArr;
        context.getClass();
        strArr2.getClass();
        if (strArr2.length == 0) {
            EmptyMap emptyMap = EmptyMap.INSTANCE;
            emptyMap.getClass();
            return new ActivityResultContract.SynchronousResult(emptyMap);
        }
        for (String str : strArr2) {
            if (Strings.checkSelfPermission(context, str) != 0) {
                return null;
            }
        }
        int mapCapacity = MapsKt__MapsJVMKt.mapCapacity(strArr2.length);
        if (mapCapacity < 16) {
            mapCapacity = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(mapCapacity);
        for (String str2 : strArr2) {
            linkedHashMap.put(str2, Boolean.TRUE);
        }
        return new ActivityResultContract.SynchronousResult(linkedHashMap);
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    public final Object parseResult(int i, Intent intent) {
        if (i != -1) {
            EmptyMap emptyMap = EmptyMap.INSTANCE;
            emptyMap.getClass();
            return emptyMap;
        }
        if (intent == null) {
            EmptyMap emptyMap2 = EmptyMap.INSTANCE;
            emptyMap2.getClass();
            return emptyMap2;
        }
        String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
        if (intArrayExtra == null || stringArrayExtra == null) {
            EmptyMap emptyMap3 = EmptyMap.INSTANCE;
            emptyMap3.getClass();
            return emptyMap3;
        }
        ArrayList arrayList = new ArrayList(intArrayExtra.length);
        for (int i2 : intArrayExtra) {
            arrayList.add(Boolean.valueOf(i2 == 0));
        }
        return MapsKt__MapsKt.toMap(CollectionsKt.zip(ArraysKt___ArraysKt.filterNotNull(stringArrayExtra), arrayList));
    }
}
