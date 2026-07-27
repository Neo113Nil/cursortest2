package com.google.android.gms.internal.ads;

import android.os.AsyncTask;
import java.util.ArrayDeque;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: com.google.android.gms.internal.ads.ww, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractAsyncTaskC4130ww extends AsyncTask {

    /* renamed from: a, reason: collision with root package name */
    public C4274ze f34904a;

    /* renamed from: b, reason: collision with root package name */
    public final S0.c f34905b;

    public AbstractAsyncTaskC4130ww(S0.c cVar) {
        this.f34905b = cVar;
    }

    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        C4274ze c4274ze = this.f34904a;
        if (c4274ze != null) {
            c4274ze.f35362w = null;
            AbstractAsyncTaskC4130ww abstractAsyncTaskC4130ww = (AbstractAsyncTaskC4130ww) ((ArrayDeque) c4274ze.f35361v).poll();
            c4274ze.f35362w = abstractAsyncTaskC4130ww;
            if (abstractAsyncTaskC4130ww != null) {
                abstractAsyncTaskC4130ww.executeOnExecutor((ThreadPoolExecutor) c4274ze.f35360u, new Object[0]);
            }
        }
    }
}
