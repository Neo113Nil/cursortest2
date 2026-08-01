package com.adjust.sdk.scheduler;

import android.os.Handler;
import android.os.Looper;
import com.google.android.datatransport.WinterFlowCacheManagerCloud;
import java.util.concurrent.Executors;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public abstract class AsyncTaskExecutor<Params, Result> {
    public abstract Result doInBackground(Params[] paramsArr);

    @SafeVarargs
    public final AsyncTaskExecutor<Params, Result> execute(Params... paramsArr) {
        onPreExecute();
        Executors.newSingleThreadExecutor().execute(new WinterFlowCacheManagerCloud(this, paramsArr, new Handler(Looper.getMainLooper()), 1));
        return this;
    }

    public void onPreExecute() {
    }

    public void onPostExecute(Result result) {
    }
}
