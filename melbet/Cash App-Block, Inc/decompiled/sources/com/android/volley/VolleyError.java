package com.android.volley;

/* loaded from: classes3.dex */
public class VolleyError extends Exception {
    public final NetworkResponse networkResponse;

    public VolleyError() {
        this.networkResponse = null;
    }

    public VolleyError(NetworkResponse networkResponse) {
        this.networkResponse = networkResponse;
    }

    public VolleyError(Throwable th) {
        super(th);
        this.networkResponse = null;
    }
}
