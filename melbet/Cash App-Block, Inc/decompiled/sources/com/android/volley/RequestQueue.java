package com.android.volley;

import android.net.Uri;
import android.opengl.Matrix;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.libraries.places.api.model.zzda;
import com.google.android.libraries.places.api.model.zzeq;
import com.google.android.libraries.places.api.model.zzfu;
import com.squareup.cash.graphics.backend.math.Vector3;
import com.withpersona.sdk2.camera.CameraPreview;
import com.withpersona.sdk2.inquiry.featureflag.FeatureFlagManager;
import com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepFragment;
import com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepViewModel_Factory_Impl;
import com.withpersona.sdk2.inquiry.internal.DaggerInquiryComponent$InquiryComponentImpl;
import com.withpersona.sdk2.inquiry.shared.di.BaseDaggerFragment;
import com.withpersona.sdk2.inquiry.shared.files.SdkFilesManager;
import com.withpersona.sdk2.inquiry.shared.systemUiController.SystemUiController;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import dagger.android.AndroidInjector;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import dagger.internal.InstanceFactory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;
import kotlinx.coroutines.flow.StateFlowImpl;

/* loaded from: classes3.dex */
public final class RequestQueue implements AndroidInjector {
    public Object mCache;
    public Object mCacheDispatcher;
    public Object mCacheQueue;
    public Object mCurrentRequests;
    public Object mDelivery;
    public Object mDispatchers;
    public Object mEventListeners;
    public Object mFinishedListeners;
    public Object mNetwork;
    public Object mNetworkQueue;
    public Object mSequenceGenerator;

    public /* synthetic */ RequestQueue(Provider provider, Factory factory, Factory factory2, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Factory factory3, Provider provider6, Provider provider7, Provider provider8) {
        this.mSequenceGenerator = provider;
        this.mCurrentRequests = factory;
        this.mCacheQueue = factory2;
        this.mNetworkQueue = provider2;
        this.mCache = provider3;
        this.mNetwork = provider4;
        this.mDelivery = provider5;
        this.mDispatchers = factory3;
        this.mCacheDispatcher = provider6;
        this.mFinishedListeners = provider7;
        this.mEventListeners = provider8;
    }

    public void add(Request request) {
        request.mRequestQueue = this;
        synchronized (((HashSet) this.mCurrentRequests)) {
            ((HashSet) this.mCurrentRequests).add(request);
        }
        request.mSequence = Integer.valueOf(((AtomicInteger) this.mSequenceGenerator).incrementAndGet());
        request.addMarker("add-to-queue");
        sendRequestEvent();
        if (request.mShouldCache) {
            ((PriorityBlockingQueue) this.mCacheQueue).add(request);
        } else {
            ((PriorityBlockingQueue) this.mNetworkQueue).add(request);
        }
    }

    public float getNear() {
        return ((Number) ((StateFlowImpl) this.mCache).getValue()).floatValue();
    }

    public Vector3 getPosition() {
        return (Vector3) ((StateFlowImpl) this.mSequenceGenerator).getValue();
    }

    public Vector3 getTarget() {
        return (Vector3) ((StateFlowImpl) this.mCurrentRequests).getValue();
    }

    public Vector3 getUp() {
        return (Vector3) ((StateFlowImpl) this.mCacheQueue).getValue();
    }

    @Override // dagger.android.AndroidInjector
    public void inject(BaseDaggerFragment baseDaggerFragment) {
        GovernmentIdStepFragment governmentIdStepFragment = (GovernmentIdStepFragment) baseDaggerFragment;
        DaggerInquiryComponent$InquiryComponentImpl daggerInquiryComponent$InquiryComponentImpl = (DaggerInquiryComponent$InquiryComponentImpl) this.mSequenceGenerator;
        governmentIdStepFragment.androidInjector = daggerInquiryComponent$InquiryComponentImpl.dispatchingAndroidInjector();
        governmentIdStepFragment.viewModelFactory = (GovernmentIdStepViewModel_Factory_Impl) ((InstanceFactory) this.mEventListeners).instance;
        SdkFilesManager sdkFilesManager = (SdkFilesManager) daggerInquiryComponent$InquiryComponentImpl.filesModule.match;
        Preconditions.checkNotNullFromProvides(sdkFilesManager);
        governmentIdStepFragment.cameraPreview = new CameraPreview(sdkFilesManager);
        governmentIdStepFragment.governmentIdFeed = DoubleCheck.lazy(daggerInquiryComponent$InquiryComponentImpl.governmentIdFeedProvider);
        governmentIdStepFragment.trackingEventsLogger = (TrackingEventsLogger) daggerInquiryComponent$InquiryComponentImpl.trackingEventsLoggerProvider.get();
        governmentIdStepFragment.featureFlagManager = (FeatureFlagManager) daggerInquiryComponent$InquiryComponentImpl.featureFlagManagerProvider.get();
        governmentIdStepFragment.systemUiController = (SystemUiController) daggerInquiryComponent$InquiryComponentImpl.systemUiControllerProvider.get();
    }

    public void sendRequestEvent() {
        synchronized (((ArrayList) this.mEventListeners)) {
            try {
                Iterator it = ((ArrayList) this.mEventListeners).iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void setAspectRatio(float f) {
        StateFlowImpl stateFlowImpl = (StateFlowImpl) this.mDispatchers;
        Float valueOf = Float.valueOf(f);
        stateFlowImpl.getClass();
        stateFlowImpl.updateState(null, valueOf);
        updateProjectionMatrix();
    }

    public void setFar(float f) {
        StateFlowImpl stateFlowImpl = (StateFlowImpl) this.mNetwork;
        Float valueOf = Float.valueOf(f);
        stateFlowImpl.getClass();
        stateFlowImpl.updateState(null, valueOf);
        updateProjectionMatrix();
    }

    public void setFov(float f) {
        StateFlowImpl stateFlowImpl = (StateFlowImpl) this.mNetworkQueue;
        Float valueOf = Float.valueOf(f);
        stateFlowImpl.getClass();
        stateFlowImpl.updateState(null, valueOf);
        updateProjectionMatrix();
    }

    public void setFovIsHorizontal(boolean z) {
        StateFlowImpl stateFlowImpl = (StateFlowImpl) this.mDelivery;
        Boolean valueOf = Boolean.valueOf(z);
        stateFlowImpl.getClass();
        stateFlowImpl.updateState(null, valueOf);
        updateProjectionMatrix();
    }

    public void setNear(float f) {
        StateFlowImpl stateFlowImpl = (StateFlowImpl) this.mCache;
        Float valueOf = Float.valueOf(f);
        stateFlowImpl.getClass();
        stateFlowImpl.updateState(null, valueOf);
        updateProjectionMatrix();
    }

    public void setPosition(Vector3 vector3) {
        StateFlowImpl stateFlowImpl = (StateFlowImpl) this.mSequenceGenerator;
        stateFlowImpl.getClass();
        stateFlowImpl.updateState(null, vector3);
        updateViewMatrix();
    }

    public void setTarget(Vector3 vector3) {
        StateFlowImpl stateFlowImpl = (StateFlowImpl) this.mCurrentRequests;
        stateFlowImpl.getClass();
        stateFlowImpl.updateState(null, vector3);
        updateViewMatrix();
    }

    public void setUp(Vector3 vector3) {
        StateFlowImpl stateFlowImpl = (StateFlowImpl) this.mCacheQueue;
        stateFlowImpl.getClass();
        stateFlowImpl.updateState(null, vector3);
        updateViewMatrix();
    }

    public void updateProjectionMatrix() {
        float floatValue = ((Number) ((StateFlowImpl) this.mDispatchers).getValue()).floatValue();
        float floatValue2 = ((Number) ((StateFlowImpl) this.mNetworkQueue).getValue()).floatValue();
        if (((Boolean) ((StateFlowImpl) this.mDelivery).getValue()).booleanValue() && floatValue > RecyclerView.DECELERATION_RATE) {
            floatValue2 = (float) Math.toDegrees(Math.atan(Math.tan(Math.toRadians(floatValue2 / 2.0d)) / floatValue) * 2.0d);
        }
        float f = floatValue2;
        Matrix.setIdentityM((float[]) this.mEventListeners, 0);
        if (floatValue > RecyclerView.DECELERATION_RATE) {
            Matrix.perspectiveM((float[]) this.mEventListeners, 0, f, floatValue, ((Number) ((StateFlowImpl) this.mCache).getValue()).floatValue(), ((Number) ((StateFlowImpl) this.mNetwork).getValue()).floatValue());
        }
    }

    public void updateViewMatrix() {
        Matrix.setLookAtM((float[]) this.mFinishedListeners, 0, getPosition().x, getPosition().y, getPosition().z, getTarget().x, getTarget().y, getTarget().z, getUp().x, getUp().y, getUp().z);
    }

    public zzfu zzd() {
        zzda zzdaVar;
        String str;
        Double d = (Double) this.mNetwork;
        if (d != null && (zzdaVar = (zzda) this.mDelivery) != null && (str = (String) this.mDispatchers) != null) {
            return new zzfu((String) this.mSequenceGenerator, (String) this.mCurrentRequests, (String) this.mCacheQueue, (String) this.mNetworkQueue, (String) this.mCache, d, zzdaVar, str, (String) this.mCacheDispatcher, (Uri) this.mFinishedListeners, (zzeq) this.mEventListeners);
        }
        StringBuilder sb = new StringBuilder();
        if (((Double) this.mNetwork) == null) {
            sb.append(" rating");
        }
        if (((zzda) this.mDelivery) == null) {
            sb.append(" authorAttribution");
        }
        if (((String) this.mDispatchers) == null) {
            sb.append(" attribution");
        }
        a$$ExternalSyntheticBUOutline0.m$1("Missing required properties:".concat(sb.toString()));
        return null;
    }
}
