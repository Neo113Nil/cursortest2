package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.UserInfo;
import io.appmetrica.analytics.coreapi.internal.event.CounterReportApi;
import io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences;
import io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerContext;
import io.appmetrica.analytics.modulesapi.internal.service.event.ModuleServiceEventHandler;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.ao, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0125ao implements ModuleServiceEventHandler {
    public final C0445lr a = new C0445lr();
    public final C0416kr b = new C0416kr();
    public final C0358ir c = new C0358ir();

    /* JADX WARN: Can't wrap try/catch for region: R(19:0|1|(1:40)|5|(12:33|34|(1:36)|37|8|(2:22|(2:27|(1:32)(1:31))(6:26|14|15|16|17|18))(1:12)|13|14|15|16|17|18)|7|8|(1:10)|22|(1:24)|27|(1:29)|32|13|14|15|16|17|18) */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00e8, code lost:
    
        r8 = null;
     */
    @Override // io.appmetrica.analytics.modulesapi.internal.service.event.ModuleServiceEventHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean handle(@NotNull ModuleEventServiceHandlerContext moduleEventServiceHandlerContext, @NotNull CounterReportApi counterReportApi) {
        UserInfo userInfo;
        String jSONObject;
        int i;
        this.b.getClass();
        UserInfo a = C0416kr.a(moduleEventServiceHandlerContext);
        byte[] bArr = counterReportApi.getExtras().get("ai");
        if (bArr == null || (userInfo = this.a.toModel(bArr)) == null) {
            userInfo = new UserInfo();
        }
        this.b.getClass();
        ModulePreferences legacyModulePreferences = moduleEventServiceHandlerContext.getLegacyModulePreferences();
        if (!TextUtils.isEmpty(userInfo.getUserId())) {
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("UserInfo.UserId", userInfo.getUserId());
                jSONObject2.put("UserInfo.Type", userInfo.getType());
                if (!AbstractC0734vr.a((Map) userInfo.getOptions())) {
                    jSONObject2.put("UserInfo.Options", new JSONObject(userInfo.getOptions()));
                }
                jSONObject = jSONObject2.toString();
            } catch (Throwable unused) {
            }
            legacyModulePreferences.putString("USER_INFO", jSONObject);
            if (TextUtils.isEmpty(userInfo.getUserId()) && TextUtils.isEmpty(a.getUserId())) {
                i = 1;
            } else {
                if (!TextUtils.isEmpty(userInfo.getUserId()) && !TextUtils.isEmpty(a.getUserId())) {
                    i = 2;
                    counterReportApi.getExtras().put("ai", MessageNano.toByteArray(this.c.a.a.fromModel(a)));
                    counterReportApi.setCustomType(12);
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put(Constants.KEY_ACTION, AbstractC0387jr.a(i));
                    String str = jSONObject3.toString();
                    counterReportApi.setValue(str);
                    return false;
                }
                i = (!TextUtils.isEmpty(userInfo.getUserId()) || Intrinsics.d(userInfo.getUserId(), a.getUserId())) ? 4 : 3;
            }
            a = userInfo;
            counterReportApi.getExtras().put("ai", MessageNano.toByteArray(this.c.a.a.fromModel(a)));
            counterReportApi.setCustomType(12);
            JSONObject jSONObject32 = new JSONObject();
            jSONObject32.put(Constants.KEY_ACTION, AbstractC0387jr.a(i));
            String str2 = jSONObject32.toString();
            counterReportApi.setValue(str2);
            return false;
        }
        jSONObject = "";
        legacyModulePreferences.putString("USER_INFO", jSONObject);
        if (TextUtils.isEmpty(userInfo.getUserId())) {
        }
        if (!TextUtils.isEmpty(userInfo.getUserId())) {
        }
        if (TextUtils.isEmpty(userInfo.getUserId())) {
        }
        a = userInfo;
        counterReportApi.getExtras().put("ai", MessageNano.toByteArray(this.c.a.a.fromModel(a)));
        counterReportApi.setCustomType(12);
        JSONObject jSONObject322 = new JSONObject();
        jSONObject322.put(Constants.KEY_ACTION, AbstractC0387jr.a(i));
        String str22 = jSONObject322.toString();
        counterReportApi.setValue(str22);
        return false;
    }
}
