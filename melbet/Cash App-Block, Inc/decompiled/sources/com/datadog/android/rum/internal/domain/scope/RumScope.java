package com.datadog.android.rum.internal.domain.scope;

import com.datadog.android.api.context.DatadogContext;
import com.datadog.android.api.storage.DataWriter;
import com.datadog.android.rum.internal.domain.RumContext;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public interface RumScope {
    Map getCustomAttributes();

    RumScope getParentScope();

    RumContext getRumContext();

    RumScope handleEvent(RumRawEvent rumRawEvent, DatadogContext datadogContext, Function1 function1, DataWriter dataWriter);
}
