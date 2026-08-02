package com.google.android.gms.internal.ads;

import android.os.AsyncTask;
import java.util.ArrayDeque;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: com.google.android.gms.internal.ads.ww, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractAsyncTaskC4153ww extends AsyncTask {

    /* renamed from: a, reason: collision with root package name */
    public C4297ze f35685a;

    /* renamed from: b, reason: collision with root package name */
    public final S0.c f35686b;

    public AbstractAsyncTaskC4153ww(S0.c cVar) {
        this.f35686b = cVar;
    }

    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        C4297ze c4297ze = this.f35685a;
        if (c4297ze != null) {
            c4297ze.f36135w = null;
            AbstractAsyncTaskC4153ww abstractAsyncTaskC4153ww = (AbstractAsyncTaskC4153ww) ((ArrayDeque) c4297ze.f36134v).poll();
            c4297ze.f36135w = abstractAsyncTaskC4153ww;
            if (abstractAsyncTaskC4153ww != null) {
                abstractAsyncTaskC4153ww.executeOnExecutor((ThreadPoolExecutor) c4297ze.f36133u, new Object[0]);
            }
        }
    }
}
