package com.fillr.service;

import android.app.Service;
import android.content.Intent;
import com.fillr.core.apiclientv2.ConsumerAPIClientListener;
import com.fillr.core.apiclientv2.Repository;

/* loaded from: classes4.dex */
public abstract class BaseMappingService extends Service implements ConsumerAPIClientListener {
    public Repository repository;

    @Override // com.fillr.core.apiclientv2.ConsumerAPIClientListener
    public void onConsumerAPIError(int i) {
        stopSelf(i);
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.repository = new Repository(new Repository(this));
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        processMappingRequest(i2, intent);
        return 1;
    }

    public abstract void processMappingRequest(int i, Intent intent);
}
