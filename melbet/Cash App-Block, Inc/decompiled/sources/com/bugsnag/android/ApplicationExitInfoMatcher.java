package com.bugsnag.android;

import android.app.ApplicationExitInfo;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class ApplicationExitInfoMatcher {
    public final List applicationExitInfo;
    public final ExitInfoPluginStore$PersistentState previousState;

    public ApplicationExitInfoMatcher(List list, ExitInfoPluginStore$PersistentState exitInfoPluginStore$PersistentState) {
        this.applicationExitInfo = list;
        this.previousState = exitInfoPluginStore$PersistentState;
    }

    public static ApplicationExitInfo findExitInfoBySessionId$bugsnag_plugin_android_exitinfo_release(List list, byte[] bArr) {
        Object obj;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            byte[] processStateSummary = ((ApplicationExitInfo) obj).getProcessStateSummary();
            if (processStateSummary != null && Arrays.equals(processStateSummary, bArr)) {
                break;
            }
        }
        return (ApplicationExitInfo) obj;
    }

    public final ApplicationExitInfo findExitInfoByPid$bugsnag_plugin_android_exitinfo_release(List list) {
        Object obj;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            ApplicationExitInfo m = a$$ExternalSyntheticBUOutline0.m(obj);
            ExitInfoPluginStore$PersistentState exitInfoPluginStore$PersistentState = this.previousState;
            if (exitInfoPluginStore$PersistentState != null && m.getPid() == exitInfoPluginStore$PersistentState.pid) {
                break;
            }
        }
        return a$$ExternalSyntheticBUOutline0.m(obj);
    }
}
