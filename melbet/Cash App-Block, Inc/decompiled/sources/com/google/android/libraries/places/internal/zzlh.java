package com.google.android.libraries.places.internal;

import com.android.volley.NetworkResponse;
import com.android.volley.ParseError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.toolbox.HttpHeaderParser;
import com.google.android.gms.auth.api.zbc;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class zzlh extends Request {
    public com.google.android.gms.maps.zzah mListener;
    public final Object mLock;
    public final /* synthetic */ HashMap zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzlh(zbc zbcVar, String str, com.google.android.gms.maps.zzah zzahVar, zzli zzliVar, HashMap hashMap) {
        super(str, zzliVar);
        this.zza = hashMap;
        this.mLock = new Object();
        this.mListener = zzahVar;
    }

    @Override // com.android.volley.Request
    public final void deliverResponse(Object obj) {
        com.google.android.gms.maps.zzah zzahVar;
        synchronized (this.mLock) {
            zzahVar = this.mListener;
        }
        if (zzahVar != null) {
            zbc zbcVar = (zbc) zzahVar.f68zza;
            Class cls = (Class) zzahVar.zzb;
            TaskCompletionSource taskCompletionSource = (TaskCompletionSource) zzahVar.zzc;
            try {
                try {
                    taskCompletionSource.trySetResult((zzlu) ((zzlw) zbcVar.zbb).zza(cls, ((JSONObject) obj).toString()));
                } catch (zzlv e) {
                    taskCompletionSource.trySetException(new ApiException(new Status(8, e.getMessage(), null, null)));
                }
            } catch (Error | RuntimeException e2) {
                zznv.zzb(e2);
                throw e2;
            }
        }
    }

    @Override // com.android.volley.Request
    public final Map getHeaders() {
        return this.zza;
    }

    @Override // com.android.volley.Request
    public final Response parseNetworkResponse(NetworkResponse networkResponse) {
        try {
            return new Response(new JSONObject(new String((byte[]) networkResponse.data, HttpHeaderParser.parseCharset((Map) networkResponse.headers))), HttpHeaderParser.parseCacheHeaders(networkResponse));
        } catch (UnsupportedEncodingException e) {
            return new Response(new ParseError(e));
        } catch (JSONException e2) {
            return new Response(new ParseError(e2));
        }
    }
}
