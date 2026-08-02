package com.datadog.android.rum.internal.utils;

import com.datadog.android.api.context.DatadogContext;
import com.datadog.android.api.storage.DataWriter;
import com.datadog.android.core.InternalSdkCore;
import com.datadog.android.rum.GlobalRumMonitor;
import com.datadog.android.rum.RumMonitor;
import com.datadog.android.rum.internal.monitor.AdvancedRumMonitor;
import com.squareup.cash.clientroutes.ClientRoute;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public abstract class SdkCoreExtKt {
    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.ViewNeighborhoodsTableQrCodeScanner.deepLinkSpecs;
    }

    public static final WriteOperation newRumEventWriteOperation(InternalSdkCore internalSdkCore, DatadogContext datadogContext, Function1 function1, DataWriter dataWriter, int i, Function0 function0) {
        internalSdkCore.getClass();
        datadogContext.getClass();
        function1.getClass();
        dataWriter.getClass();
        if (i == 0) {
            throw null;
        }
        internalSdkCore.getClass();
        datadogContext.getClass();
        function1.getClass();
        dataWriter.getClass();
        if (i == 0) {
            throw null;
        }
        WriteOperation writeOperation = new WriteOperation();
        writeOperation.sdkCore = internalSdkCore;
        writeOperation.writeScope = function1;
        writeOperation.rumDataWriter = dataWriter;
        writeOperation.eventType = i;
        writeOperation.eventSource = function0;
        RumMonitor rumMonitor = GlobalRumMonitor.get(internalSdkCore);
        writeOperation.advancedRumMonitor = rumMonitor instanceof AdvancedRumMonitor ? (AdvancedRumMonitor) rumMonitor : null;
        WriteOperation$Companion$NO_OP_EVENT_OUTCOME_ACTION$1 writeOperation$Companion$NO_OP_EVENT_OUTCOME_ACTION$1 = WriteOperation$Companion$NO_OP_EVENT_OUTCOME_ACTION$1.INSTANCE;
        writeOperation.onError = writeOperation$Companion$NO_OP_EVENT_OUTCOME_ACTION$1;
        writeOperation.onSuccess = writeOperation$Companion$NO_OP_EVENT_OUTCOME_ACTION$1;
        return writeOperation;
    }
}
