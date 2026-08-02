package androidx.privacysandbox.ads.adservices.java.measurement;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import android.view.InputEvent;
import androidx.compose.animation.BoundsAnimation$animate$1;
import androidx.compose.material3.SliderState$drag$2;
import androidx.lifecycle.BlockRunner$cancel$1;
import androidx.paging.PageFetcher$flow$1;
import androidx.privacysandbox.ads.adservices.internal.AdServicesInfo$Extensions30ExtImpl;
import androidx.privacysandbox.ads.adservices.internal.AdServicesInfo$Extensions30Impl;
import androidx.privacysandbox.ads.adservices.measurement.DeletionRequest;
import androidx.privacysandbox.ads.adservices.measurement.MeasurementManagerApi31Ext9Impl;
import androidx.privacysandbox.ads.adservices.measurement.SourceRegistrationRequest;
import androidx.privacysandbox.ads.adservices.measurement.WebSourceRegistrationRequest;
import androidx.privacysandbox.ads.adservices.measurement.WebTriggerRegistrationRequest;
import com.google.common.util.concurrent.ListenableFuture;
import com.squareup.cash.ui.widget.StackedAvatarViewKt;
import com.squareup.cash.ui.widget.amount.AmountChangedSource;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt;

/* loaded from: classes3.dex */
public final class MeasurementManagerFutures$Api33Ext5JavaImpl {
    public final AmountChangedSource mMeasurementManager;

    public MeasurementManagerFutures$Api33Ext5JavaImpl(AmountChangedSource amountChangedSource) {
        this.mMeasurementManager = amountChangedSource;
    }

    public static final MeasurementManagerFutures$Api33Ext5JavaImpl from(Context context) {
        AmountChangedSource amountChangedSource;
        Object obj;
        context.getClass();
        StringBuilder sb = new StringBuilder("AdServicesInfo.version=");
        int i = Build.VERSION.SDK_INT;
        AdServicesInfo$Extensions30Impl adServicesInfo$Extensions30Impl = AdServicesInfo$Extensions30Impl.INSTANCE;
        sb.append(i >= 33 ? adServicesInfo$Extensions30Impl.getAdServicesVersion() : 0);
        Log.d("MeasurementManager", sb.toString());
        if ((i >= 33 ? adServicesInfo$Extensions30Impl.getAdServicesVersion() : 0) >= 5) {
            amountChangedSource = new MeasurementManagerApi31Ext9Impl(context, 1);
        } else {
            AdServicesInfo$Extensions30ExtImpl adServicesInfo$Extensions30ExtImpl = AdServicesInfo$Extensions30ExtImpl.INSTANCE;
            if (((i == 31 || i == 32) ? adServicesInfo$Extensions30ExtImpl.getAdExtServicesVersionS() : 0) >= 9) {
                try {
                    obj = new BoundsAnimation$animate$1(context, 24).invoke(context);
                } catch (NoClassDefFoundError unused) {
                    StringBuilder sb2 = new StringBuilder("Unable to find adservices code, check manifest for uses-library tag, versionS=");
                    int i2 = Build.VERSION.SDK_INT;
                    sb2.append((i2 == 31 || i2 == 32) ? adServicesInfo$Extensions30ExtImpl.getAdExtServicesVersionS() : 0);
                    Log.d("MeasurementManager", sb2.toString());
                    obj = null;
                }
                amountChangedSource = (AmountChangedSource) obj;
            } else {
                amountChangedSource = null;
            }
        }
        if (amountChangedSource != null) {
            return new MeasurementManagerFutures$Api33Ext5JavaImpl(amountChangedSource);
        }
        return null;
    }

    public ListenableFuture deleteRegistrationsAsync(DeletionRequest deletionRequest) {
        throw null;
    }

    public ListenableFuture getMeasurementApiStatusAsync() {
        return StackedAvatarViewKt.asListenableFuture$default(JobKt.async$default(JobKt.CoroutineScope(Dispatchers.Default), null, null, new BlockRunner$cancel$1(this, (Continuation) null, 2), 3));
    }

    public ListenableFuture registerSourceAsync(Uri uri, InputEvent inputEvent) {
        uri.getClass();
        return StackedAvatarViewKt.asListenableFuture$default(JobKt.async$default(JobKt.CoroutineScope(Dispatchers.Default), null, null, new SliderState$drag$2(this, uri, inputEvent, null, 14), 3));
    }

    public ListenableFuture registerTriggerAsync(Uri uri) {
        uri.getClass();
        return StackedAvatarViewKt.asListenableFuture$default(JobKt.async$default(JobKt.CoroutineScope(Dispatchers.Default), null, null, new PageFetcher$flow$1(this, uri, null, 29), 3));
    }

    public ListenableFuture registerWebSourceAsync(WebSourceRegistrationRequest webSourceRegistrationRequest) {
        throw null;
    }

    public ListenableFuture registerWebTriggerAsync(WebTriggerRegistrationRequest webTriggerRegistrationRequest) {
        throw null;
    }

    public ListenableFuture registerSourceAsync(SourceRegistrationRequest sourceRegistrationRequest) {
        throw null;
    }
}
