package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.RtmClientEvent;
import io.appmetrica.analytics.RtmConfig;
import io.appmetrica.analytics.RtmErrorEvent;
import io.appmetrica.analytics.rtm.internal.Constants;
import io.appmetrica.analytics.rtmwrapper.internal.IRtmClientWrapper;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class Ql implements Ol {
    public final IRtmClientWrapper a;
    public final Nl b;
    public final Jl c;
    public final Ll d;

    public Ql(IRtmClientWrapper iRtmClientWrapper, Nl nl, Jl jl, Ll ll) {
        this.a = iRtmClientWrapper;
        this.b = nl;
        this.c = jl;
        this.d = ll;
    }

    @Override // io.appmetrica.analytics.impl.Ol
    public final void reportRtmError(RtmErrorEvent rtmErrorEvent) {
        IRtmClientWrapper iRtmClientWrapper = this.a;
        JSONObject a = this.d.a.a(rtmErrorEvent);
        a.put(Constants.KEY_MESSAGE, rtmErrorEvent.message).put("stacktrace", rtmErrorEvent.stacktrace).put("silent", rtmErrorEvent.silent).put("url", rtmErrorEvent.url).put("table", rtmErrorEvent.table);
        if (!Or.a((Map) rtmErrorEvent.genericVariables)) {
            a.put("genericVariables", Vc.b(rtmErrorEvent.genericVariables));
        }
        RtmErrorEvent.ErrorLevel errorLevel = rtmErrorEvent.level;
        if (errorLevel != null) {
            a.put("level", errorLevel.tag);
        }
        iRtmClientWrapper.reportError(a);
    }

    @Override // io.appmetrica.analytics.impl.Ol
    public final void reportRtmEvent(RtmClientEvent rtmClientEvent) {
        IRtmClientWrapper iRtmClientWrapper = this.a;
        JSONObject a = this.c.a.a(rtmClientEvent);
        a.put("eventName", rtmClientEvent.name).put("eventValue", rtmClientEvent.value).put("eventValueType", rtmClientEvent.valueType).put("loggedIn", rtmClientEvent.loggedIn);
        if (!Or.a((Map) rtmClientEvent.customVars)) {
            a.put("customVars", Vc.b(rtmClientEvent.customVars));
        }
        iRtmClientWrapper.reportEvent(a);
    }

    @Override // io.appmetrica.analytics.impl.Ol
    public final void reportRtmException(String str, Throwable th) {
        this.a.reportException(str, th);
    }

    @Override // io.appmetrica.analytics.impl.Ol
    public final void updateRtmConfig(RtmConfig rtmConfig) {
        IRtmClientWrapper iRtmClientWrapper = this.a;
        Nl nl = this.b;
        nl.getClass();
        JSONObject json2 = rtmConfig.toJson();
        try {
            json2.put("version", new JSONObject().put("value", nl.a));
            json2.put("platform", new JSONObject().put("value", nl.b));
        } catch (Throwable unused) {
        }
        iRtmClientWrapper.updateRtmConfig(json2.toString());
    }

    @Override // io.appmetrica.analytics.impl.Ol
    public final void reportRtmException(String str, String str2) {
        this.a.reportException(str, str2);
    }
}
