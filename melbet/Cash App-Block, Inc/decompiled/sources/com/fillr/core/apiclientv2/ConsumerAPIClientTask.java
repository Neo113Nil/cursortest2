package com.fillr.core.apiclientv2;

import android.content.Context;
import android.os.AsyncTask;
import com.fillr.browsersdk.model.FillrMappedFields;
import com.fillr.core.model.ModelBase;
import com.squareup.cash.db.CashAccountDatabaseCallbackKt;
import java.lang.ref.WeakReference;
import java.util.Calendar;
import java.util.HashMap;

/* loaded from: classes4.dex */
public final class ConsumerAPIClientTask extends AsyncTask {
    public static final HashMap cache = new HashMap();
    public final WeakReference mAPIClientListener;
    public WeakReference mContext;
    public final String mProgressMessage;
    public final int mUserTag;

    public ConsumerAPIClientTask(ConsumerAPIClientListener consumerAPIClientListener, String str, int i) {
        this.mAPIClientListener = null;
        this.mProgressMessage = null;
        this.mUserTag = 0;
        this.mAPIClientListener = new WeakReference(consumerAPIClientListener);
        this.mProgressMessage = str;
        this.mUserTag = i;
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        ConsumerAPIClientParams consumerAPIClientParams;
        boolean z;
        ModelBase modelBase;
        ConsumerAPIClientParams[] consumerAPIClientParamsArr = (ConsumerAPIClientParams[]) objArr;
        if (consumerAPIClientParamsArr.length <= 0 || (consumerAPIClientParams = consumerAPIClientParamsArr[0]) == null) {
            return null;
        }
        try {
            APIEndpoint aPIEndpoint = consumerAPIClientParams.mEndpoint;
            Calendar.getInstance().getTimeInMillis();
            HashMap hashMap = cache;
            if (hashMap.containsKey(consumerAPIClientParams.cacheIdentifier)) {
                ModelBase modelBase2 = (ModelBase) hashMap.get(consumerAPIClientParams.cacheIdentifier);
                try {
                    ModelBase modelBase3 = modelBase2;
                    if (aPIEndpoint == APIEndpoint.GET_MAPPED_FIELDS) {
                        boolean z2 = modelBase2 instanceof FillrMappedFields;
                        modelBase3 = modelBase2;
                        if (z2) {
                            FillrMappedFields fillrMappedFields = (FillrMappedFields) modelBase2;
                            fillrMappedFields.updateRequestParamsForCache(consumerAPIClientParams);
                            modelBase3 = fillrMappedFields;
                        }
                    }
                    z = true;
                    modelBase = modelBase3;
                } catch (Exception e) {
                    throw new ConsumerClientException("Error decoding response: " + e.getMessage());
                }
            } else {
                String performAPICall = ConsumerAPIConnectionHelper.performAPICall(consumerAPIClientParams);
                Calendar.getInstance().getTimeInMillis();
                WeakReference weakReference = this.mContext;
                ModelBase modelObjectFromResponse = CashAccountDatabaseCallbackKt.getModelObjectFromResponse(weakReference != null ? (Context) weakReference.get() : null, performAPICall, consumerAPIClientParams);
                Calendar.getInstance().getTimeInMillis();
                if (consumerAPIClientParams.cacheIdentifier != null && aPIEndpoint == APIEndpoint.GET_MAPPED_FIELDS && modelObjectFromResponse.onValidate()) {
                    hashMap.clear();
                    hashMap.put(consumerAPIClientParams.cacheIdentifier, modelObjectFromResponse);
                }
                z = false;
                modelBase = modelObjectFromResponse;
            }
            ConsumerAPIResponse consumerAPIResponse = new ConsumerAPIResponse();
            consumerAPIResponse.mFromCache = false;
            consumerAPIResponse.mError = null;
            consumerAPIResponse.mParams = consumerAPIClientParams;
            consumerAPIResponse.mData = modelBase;
            if (z) {
                consumerAPIResponse.mFromCache = true;
            }
            return consumerAPIResponse;
        } catch (ConsumerClientException e2) {
            ConsumerAPIResponse consumerAPIResponse2 = new ConsumerAPIResponse();
            consumerAPIResponse2.mData = null;
            consumerAPIResponse2.mFromCache = false;
            consumerAPIResponse2.mError = e2;
            consumerAPIResponse2.mParams = consumerAPIClientParams;
            return consumerAPIResponse2;
        }
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        ConsumerAPIClientListener consumerAPIClientListener;
        ConsumerAPIClientListener consumerAPIClientListener2;
        ConsumerClientException consumerClientException;
        ConsumerAPIClientListener consumerAPIClientListener3;
        ConsumerAPIResponse consumerAPIResponse = (ConsumerAPIResponse) obj;
        int i = this.mUserTag;
        WeakReference weakReference = this.mAPIClientListener;
        ConsumerAPIClientParams consumerAPIClientParams = consumerAPIResponse.mParams;
        try {
            consumerClientException = consumerAPIResponse.mError;
        } catch (ConsumerClientException unused) {
            if (weakReference != null && (consumerAPIClientListener = (ConsumerAPIClientListener) weakReference.get()) != null && consumerAPIClientListener.onBeforeAPICallback()) {
                APIEndpoint aPIEndpoint = consumerAPIClientParams.mEndpoint;
                consumerAPIClientListener.onConsumerAPIError(i);
            }
        }
        if (consumerClientException != null) {
            throw consumerClientException;
        }
        ModelBase modelBase = consumerAPIResponse.mData;
        if (modelBase != null) {
            if (consumerAPIResponse.mFromCache) {
                modelBase.mFromCache = true;
            }
            APIEndpoint aPIEndpoint2 = consumerAPIClientParams.mEndpoint;
            if (weakReference != null && (consumerAPIClientListener3 = (ConsumerAPIClientListener) weakReference.get()) != null && consumerAPIClientListener3.onBeforeAPICallback()) {
                consumerAPIClientListener3.onConsumerAPIData(i, modelBase);
            }
        }
        if (this.mProgressMessage == null || weakReference == null || (consumerAPIClientListener2 = (ConsumerAPIClientListener) weakReference.get()) == null) {
            return;
        }
        consumerAPIClientListener2.onBeforeAPICallback();
    }

    @Override // android.os.AsyncTask
    public final void onPreExecute() {
        WeakReference weakReference;
        ConsumerAPIClientListener consumerAPIClientListener;
        String str = this.mProgressMessage;
        if (str == null || (weakReference = this.mAPIClientListener) == null || (consumerAPIClientListener = (ConsumerAPIClientListener) weakReference.get()) == null || !consumerAPIClientListener.onBeforeAPICallback()) {
            return;
        }
        consumerAPIClientListener.onConsumerAPICallProgressStart(str);
    }

    @Override // android.os.AsyncTask
    public final void onProgressUpdate(Object[] objArr) {
        ConsumerAPIClientListener consumerAPIClientListener;
        String str;
        String[] strArr = (String[]) objArr;
        WeakReference weakReference = this.mAPIClientListener;
        if (weakReference == null || (consumerAPIClientListener = (ConsumerAPIClientListener) weakReference.get()) == null || strArr.length <= 0 || (str = strArr[0]) == null || !consumerAPIClientListener.onBeforeAPICallback()) {
            return;
        }
        consumerAPIClientListener.onConsumerAPILog(str);
    }

    public final void performAPICall(ConsumerAPIClientParams consumerAPIClientParams) {
        executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, consumerAPIClientParams);
    }
}
