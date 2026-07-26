package com.adjust.sdk.network;

import com.adjust.sdk.ActivityPackage;
import com.adjust.sdk.ResponseData;
import java.util.Map;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public interface IActivityPackageSender {

    /* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
    public interface ResponseDataCallbackSubscriber {
        void onResponseDataCallback(ResponseData responseData);
    }

    void sendActivityPackage(ActivityPackage activityPackage, Map<String, String> map, ResponseDataCallbackSubscriber responseDataCallbackSubscriber);

    ResponseData sendActivityPackageSync(ActivityPackage activityPackage, Map<String, String> map);
}
