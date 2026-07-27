package com.google.android.gms.internal.ads;

import android.os.AsyncTask;
import java.util.ArrayDeque;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: com.google.android.gms.internal.ads.yw, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractAsyncTaskC4251yw extends AsyncTask {

    /* renamed from: a, reason: collision with root package name */
    public C4017ue f35425a;

    /* renamed from: b, reason: collision with root package name */
    public final C2593Hm f35426b;

    public AbstractAsyncTaskC4251yw(C2593Hm c2593Hm) {
        this.f35426b = c2593Hm;
    }

    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        C4017ue c4017ue = this.f35425a;
        if (c4017ue != null) {
            c4017ue.f34632w = null;
            AbstractAsyncTaskC4251yw abstractAsyncTaskC4251yw = (AbstractAsyncTaskC4251yw) ((ArrayDeque) c4017ue.f34631v).poll();
            c4017ue.f34632w = abstractAsyncTaskC4251yw;
            if (abstractAsyncTaskC4251yw != null) {
                abstractAsyncTaskC4251yw.executeOnExecutor((ThreadPoolExecutor) c4017ue.f34630u, new Object[0]);
            }
        }
    }
}
