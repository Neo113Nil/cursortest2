package com.adjust.sdk.scheduler;

import android.os.Handler;
import android.os.Looper;
import androidx.versionedparcelable.BlueKernelPrefixBinaryTreeIVQWRCfiOQZwtAjv3s49170332979871;
import java.util.concurrent.Executors;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public abstract class AsyncTaskExecutor<Params, Result> {
    public abstract Result doInBackground(Params[] paramsArr);

    @SafeVarargs
    public final AsyncTaskExecutor<Params, Result> execute(Params... paramsArr) {
        onPreExecute();
        Executors.newSingleThreadExecutor().execute(new BlueKernelPrefixBinaryTreeIVQWRCfiOQZwtAjv3s49170332979871(this, paramsArr, new Handler(Looper.getMainLooper()), 1));
        return this;
    }

    public void onPreExecute() {
    }

    public void onPostExecute(Result result) {
    }
}
