package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.plugins.PluginErrorDetails;
import io.appmetrica.analytics.plugins.StackTraceItem;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class Je {

    /* renamed from: a, reason: collision with root package name */
    public final M9 f4592a;

    public Je(M9 m9) {
        this.f4592a = m9;
    }

    public final Qn a(PluginErrorDetails pluginErrorDetails) {
        ArrayList arrayList;
        String exceptionClass = pluginErrorDetails.getExceptionClass();
        String message = pluginErrorDetails.getMessage();
        List<StackTraceItem> stacktrace = pluginErrorDetails.getStacktrace();
        String platform = pluginErrorDetails.getPlatform();
        String virtualMachineVersion = pluginErrorDetails.getVirtualMachineVersion();
        Map<String, String> pluginEnvironment = pluginErrorDetails.getPluginEnvironment();
        String str = (String) this.f4592a.f4745b.a();
        Boolean bool = (Boolean) this.f4592a.f4746c.a();
        if (stacktrace != null) {
            arrayList = new ArrayList(i1.k.E(stacktrace));
            for (StackTraceItem stackTraceItem : stacktrace) {
                arrayList.add(new Dl(stackTraceItem.getClassName(), stackTraceItem.getFileName(), stackTraceItem.getLine(), stackTraceItem.getColumn(), stackTraceItem.getMethodName(), null));
            }
        } else {
            arrayList = null;
        }
        return new Qn(new Gn(exceptionClass, message, arrayList, null, null), null, null, platform, virtualMachineVersion, pluginEnvironment, str, bool);
    }
}
