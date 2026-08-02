package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import defpackage.jl40;
import io.appmetrica.analytics.UserInfo;
import io.appmetrica.analytics.coreapi.internal.event.CounterReportApi;
import io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences;
import io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerContext;
import io.appmetrica.analytics.modulesapi.internal.service.event.ModuleServiceEventHandler;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.util.Map;
import kotlin.Pair;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.vo, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0805vo implements ModuleServiceEventHandler {
    public final Er a = new Er();
    public final Dr b = new Dr();
    public final Br c = new Br();

    /* JADX WARN: Can't wrap try/catch for region: R(8:12|(2:24|(2:29|(1:34)(1:33))(6:28|17|18|19|20|21))|16|17|18|19|20|21) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0108, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0083 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0084  */
    @Override // io.appmetrica.analytics.modulesapi.internal.service.event.ModuleServiceEventHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean handle(ModuleEventServiceHandlerContext moduleEventServiceHandlerContext, CounterReportApi counterReportApi) {
        UserInfo userInfo;
        String jSONObject;
        this.b.getClass();
        UserInfo a = Dr.a(moduleEventServiceHandlerContext);
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
                if (!Or.a((Map) userInfo.getOptions())) {
                    jSONObject2.put("UserInfo.Options", new JSONObject(userInfo.getOptions()));
                }
                jSONObject = jSONObject2.toString();
            } catch (Throwable unused) {
            }
            legacyModulePreferences.putString("USER_INFO", jSONObject);
            int i = 1;
            if (!"20799a27-fa80-4b36-b2db-0f8141f24180".equals(moduleEventServiceHandlerContext.getEventReporter().getApiKey())) {
                return true;
            }
            if (TextUtils.isEmpty(userInfo.getUserId()) || !TextUtils.isEmpty(a.getUserId())) {
                if (TextUtils.isEmpty(userInfo.getUserId()) && !TextUtils.isEmpty(a.getUserId())) {
                    i = 2;
                    Pair pair = new Pair("ai", MessageNano.toByteArray(this.c.a.a.fromModel(a)));
                    counterReportApi.getExtras().put(pair.c(), pair.f());
                    Gc[] gcArr = Gc.a;
                    counterReportApi.setCustomType(12);
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("action", Cr.a(i));
                    String str = jSONObject3.toString();
                    counterReportApi.setValue(str);
                    return false;
                }
                i = (TextUtils.isEmpty(userInfo.getUserId()) || jl40.l(userInfo.getUserId(), a.getUserId())) ? 4 : 3;
            }
            a = userInfo;
            Pair pair2 = new Pair("ai", MessageNano.toByteArray(this.c.a.a.fromModel(a)));
            counterReportApi.getExtras().put(pair2.c(), pair2.f());
            Gc[] gcArr2 = Gc.a;
            counterReportApi.setCustomType(12);
            JSONObject jSONObject32 = new JSONObject();
            jSONObject32.put("action", Cr.a(i));
            String str2 = jSONObject32.toString();
            counterReportApi.setValue(str2);
            return false;
        }
        jSONObject = "";
        legacyModulePreferences.putString("USER_INFO", jSONObject);
        int i2 = 1;
        if (!"20799a27-fa80-4b36-b2db-0f8141f24180".equals(moduleEventServiceHandlerContext.getEventReporter().getApiKey())) {
        }
    }
}
