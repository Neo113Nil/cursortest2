package androidx.activity.result.contract;

import android.content.Context;
import android.content.Intent;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003:\u0001\fB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\n\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Landroidx/activity/result/contract/ActivityResultContract;", "I", "O", "", "<init>", "()V", "Landroid/content/Context;", "context", "input", "Landroidx/activity/result/contract/ActivityResultContract$SynchronousResult;", "getSynchronousResult", "(Landroid/content/Context;Ljava/lang/Object;)Landroidx/activity/result/contract/ActivityResultContract$SynchronousResult;", "SynchronousResult", "activity"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class ActivityResultContract<I, O> {

    /* loaded from: classes3.dex */
    public final class SynchronousResult {
        public final Object value;

        public SynchronousResult(Object obj) {
            this.value = obj;
        }
    }

    public abstract Intent createIntent(Context context, Object obj);

    public SynchronousResult getSynchronousResult(Context context, I input) {
        context.getClass();
        return null;
    }

    public abstract Object parseResult(int i, Intent intent);
}
