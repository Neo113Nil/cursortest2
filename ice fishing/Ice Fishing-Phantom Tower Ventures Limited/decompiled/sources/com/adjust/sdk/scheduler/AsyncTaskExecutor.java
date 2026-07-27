package com.adjust.sdk.scheduler;

import android.content.Context.FrostHunterTabLayoutPixelMax9400;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executors;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public abstract class AsyncTaskExecutor<Params, Result> {
    public abstract Result doInBackground(Params[] paramsArr);

    @SafeVarargs
    public final AsyncTaskExecutor<Params, Result> execute(Params... paramsArr) {
        onPreExecute();
        Executors.newSingleThreadExecutor().execute(new FrostHunterTabLayoutPixelMax9400(this, paramsArr, new Handler(Looper.getMainLooper()), 1));
        return this;
    }

    public void onPreExecute() {
    }

    public void onPostExecute(Result result) {
    }
}
