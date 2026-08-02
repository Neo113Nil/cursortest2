package com.bugsnag.android;

import android.app.ApplicationExitInfo;
import coil3.ComponentRegistry;
import java.util.List;
import kotlin.text.Charsets;

/* loaded from: classes.dex */
public final class ExitInfoCallback implements OnSendCallback {
    public final TraceEventEnhancer anrEventEnhancer;
    public final List applicationExitInfo;
    public final ApplicationExitInfoMatcher applicationExitInfoMatcher;
    public final ComponentRegistry.Builder exitInfoPluginStore;
    public final TraceEventEnhancer nativeEnhancer;

    public ExitInfoCallback(List list, TraceEventEnhancer traceEventEnhancer, TraceEventEnhancer traceEventEnhancer2, ComponentRegistry.Builder builder, ApplicationExitInfoMatcher applicationExitInfoMatcher) {
        this.applicationExitInfo = list;
        this.nativeEnhancer = traceEventEnhancer;
        this.anrEventEnhancer = traceEventEnhancer2;
        this.exitInfoPluginStore = builder;
        this.applicationExitInfoMatcher = applicationExitInfoMatcher;
    }

    public final void onSend(Event event) {
        String str;
        Session session = event.impl.session;
        if (session == null || (str = session.id) == null) {
            return;
        }
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        bytes.getClass();
        List list = this.applicationExitInfo;
        ApplicationExitInfo findExitInfoBySessionId$bugsnag_plugin_android_exitinfo_release = ApplicationExitInfoMatcher.findExitInfoBySessionId$bugsnag_plugin_android_exitinfo_release(list, bytes);
        if (findExitInfoBySessionId$bugsnag_plugin_android_exitinfo_release == null && (findExitInfoBySessionId$bugsnag_plugin_android_exitinfo_release = this.applicationExitInfoMatcher.findExitInfoByPid$bugsnag_plugin_android_exitinfo_release(list)) == null) {
            return;
        }
        ExitInfoKey exitInfoKey = new ExitInfoKey(findExitInfoBySessionId$bugsnag_plugin_android_exitinfo_release.getPid(), findExitInfoBySessionId$bugsnag_plugin_android_exitinfo_release.getTimestamp());
        ComponentRegistry.Builder builder = this.exitInfoPluginStore;
        builder.addExitInfoKey(exitInfoKey);
        try {
            event.addMetadata("app", "exitReason", CodeDescriptionsKt.exitReasonOf(findExitInfoBySessionId$bugsnag_plugin_android_exitinfo_release));
            event.addMetadata("app", "processImportance", CodeDescriptionsKt.importanceDescriptionOf(findExitInfoBySessionId$bugsnag_plugin_android_exitinfo_release));
            if (findExitInfoBySessionId$bugsnag_plugin_android_exitinfo_release.getReason() != 5 && findExitInfoBySessionId$bugsnag_plugin_android_exitinfo_release.getReason() != 2) {
                if (findExitInfoBySessionId$bugsnag_plugin_android_exitinfo_release.getReason() == 6) {
                    this.anrEventEnhancer.invoke(event, findExitInfoBySessionId$bugsnag_plugin_android_exitinfo_release);
                    builder.addExitInfoKey(new ExitInfoKey(findExitInfoBySessionId$bugsnag_plugin_android_exitinfo_release));
                    return;
                }
                return;
            }
            this.nativeEnhancer.invoke(event, findExitInfoBySessionId$bugsnag_plugin_android_exitinfo_release);
            builder.addExitInfoKey(new ExitInfoKey(findExitInfoBySessionId$bugsnag_plugin_android_exitinfo_release));
        } catch (Throwable unused) {
        }
    }
}
