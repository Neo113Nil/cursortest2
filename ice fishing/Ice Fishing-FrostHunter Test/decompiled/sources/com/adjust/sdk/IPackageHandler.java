package com.adjust.sdk;

import android.content.Context;
import com.adjust.sdk.network.IActivityPackageSender;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public interface IPackageHandler {
    void addPackage(ActivityPackage activityPackage);

    void flush();

    void init(IActivityHandler iActivityHandler, Context context, boolean z, IActivityPackageSender iActivityPackageSender);

    void pauseSending();

    void resumeSending();

    void sendFirstPackage();

    void teardown();
}
