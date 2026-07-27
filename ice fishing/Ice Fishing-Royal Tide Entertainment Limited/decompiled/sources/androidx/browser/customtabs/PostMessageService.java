package androidx.browser.customtabs;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import kotlin.text.CatchingFishAsyncTaskPayPal;
import kotlin.text.CatchingFishMVPSpannable;

/* loaded from: classes.dex */
public class PostMessageService extends Service {
    public final CatchingFishAsyncTaskPayPal CatchingFishReduxKtor;

    public PostMessageService() {
        CatchingFishAsyncTaskPayPal catchingFishAsyncTaskPayPal = new CatchingFishAsyncTaskPayPal();
        catchingFishAsyncTaskPayPal.attachInterface(catchingFishAsyncTaskPayPal, CatchingFishMVPSpannable.CatchingFishViewModelScope);
        this.CatchingFishReduxKtor = catchingFishAsyncTaskPayPal;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.CatchingFishReduxKtor;
    }
}
