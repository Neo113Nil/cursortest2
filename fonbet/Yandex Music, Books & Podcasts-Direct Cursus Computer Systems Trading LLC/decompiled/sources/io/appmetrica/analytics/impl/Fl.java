package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.RtmClientEvent;
import io.appmetrica.analytics.RtmConfig;
import io.appmetrica.analytics.RtmErrorEvent;
import io.appmetrica.analytics.rtm.internal.Constants;
import io.appmetrica.analytics.rtmwrapper.internal.IRtmClientWrapper;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class Fl implements Dl {
    public final IRtmClientWrapper a;
    public final Cl b;
    public final C0814yl c;
    public final Al d;

    public Fl(@NotNull IRtmClientWrapper iRtmClientWrapper, @NotNull Cl cl, @NotNull C0814yl c0814yl, @NotNull Al al) {
        this.a = iRtmClientWrapper;
        this.b = cl;
        this.c = c0814yl;
        this.d = al;
    }

    @Override // io.appmetrica.analytics.impl.Dl
    public final void reportRtmError(@NotNull RtmErrorEvent rtmErrorEvent) {
        IRtmClientWrapper iRtmClientWrapper = this.a;
        JSONObject a = this.d.a.a(rtmErrorEvent);
        a.put(Constants.KEY_MESSAGE, rtmErrorEvent.message).put("stacktrace", rtmErrorEvent.stacktrace).put("silent", rtmErrorEvent.silent).put("url", rtmErrorEvent.url);
        if (!AbstractC0734vr.a((Map) rtmErrorEvent.genericVariables)) {
            a.put("genericVariables", Fc.b(rtmErrorEvent.genericVariables));
        }
        RtmErrorEvent.ErrorLevel errorLevel = rtmErrorEvent.level;
        if (errorLevel != null) {
            a.put("level", errorLevel.tag);
        }
        iRtmClientWrapper.reportError(a);
    }

    @Override // io.appmetrica.analytics.impl.Dl
    public final void reportRtmEvent(@NotNull RtmClientEvent rtmClientEvent) {
        IRtmClientWrapper iRtmClientWrapper = this.a;
        JSONObject a = this.c.a.a(rtmClientEvent);
        a.put("eventName", rtmClientEvent.name).put("eventValue", rtmClientEvent.value).put("eventValueType", rtmClientEvent.valueType).put("loggedIn", rtmClientEvent.loggedIn);
        iRtmClientWrapper.reportEvent(a);
    }

    @Override // io.appmetrica.analytics.impl.Dl
    public final void reportRtmException(@NotNull String str, @NotNull Throwable th) {
        this.a.reportException(str, th);
    }

    @Override // io.appmetrica.analytics.impl.Dl
    public final void updateRtmConfig(@NotNull RtmConfig rtmConfig) {
        IRtmClientWrapper iRtmClientWrapper = this.a;
        Cl cl = this.b;
        cl.getClass();
        JSONObject json = rtmConfig.toJson();
        try {
            json.put("version", new JSONObject().put(Constants.KEY_VALUE, cl.a));
            json.put("platform", new JSONObject().put(Constants.KEY_VALUE, cl.b));
        } catch (Throwable unused) {
        }
        iRtmClientWrapper.updateRtmConfig(json.toString());
    }

    @Override // io.appmetrica.analytics.impl.Dl
    public final void reportRtmException(@NotNull String str, @NotNull String str2) {
        this.a.reportException(str, str2);
    }
}
