package androidx.activity.result;

import androidx.activity.result.contract.ActivityResultContract;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/activity/result/ActivityResultLauncher;", "I", "", "<init>", "()V", "activity"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class ActivityResultLauncher<I> {
    public abstract ActivityResultContract getContract();

    public abstract void launch(Object obj);

    public abstract void unregister();
}
