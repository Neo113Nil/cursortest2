package com.gamericefishpro.space.e7;

import android.content.Context;
import com.android.installreferrer.api.InstallReferrerClient;
import com.appsflyer.AppsFlyerLib;
import com.gamericefishpro.space.pi.x;
import com.gamericefishpro.space.vh.i;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends i implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Context e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Context context, com.gamericefishpro.space.th.a aVar, int i) {
        super(2, aVar);
        this.d = i;
        this.e = context;
    }

    @Override // com.gamericefishpro.space.vh.a
    public final com.gamericefishpro.space.th.a create(Object obj, com.gamericefishpro.space.th.a aVar) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new a(this.e, aVar, 0);
            default:
                return new a(this.e, aVar, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        x xVar = (x) obj;
        com.gamericefishpro.space.th.a aVar = (com.gamericefishpro.space.th.a) obj2;
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                break;
        }
        return ((a) create(xVar, aVar)).invokeSuspend(Unit.a);
    }

    @Override // com.gamericefishpro.space.vh.a
    public final Object invokeSuspend(Object obj) {
        int i = this.d;
        Context context = this.e;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
                com.gamericefishpro.space.wa.b.P(obj);
                String appsFlyerUID = AppsFlyerLib.getInstance().getAppsFlyerUID(context);
                return appsFlyerUID == null ? "" : appsFlyerUID;
            default:
                com.gamericefishpro.space.uh.a aVar2 = com.gamericefishpro.space.uh.a.d;
                com.gamericefishpro.space.wa.b.P(obj);
                try {
                    String str = com.gamericefishpro.space.o8.b.a(context).c;
                    if (str == null) {
                        str = "00000000-0000-0000-0000-000000000000";
                    }
                    if (!str.equals("00000000-0000-0000-0000-000000000000")) {
                        return str;
                    }
                    UUID uuidRandomUUID = UUID.randomUUID();
                    UUID uuidRandomUUID2 = UUID.randomUUID();
                    StringBuilder sb = new StringBuilder();
                    sb.append(uuidRandomUUID);
                    sb.append(uuidRandomUUID2);
                    return sb.toString();
                } catch (Exception unused) {
                    UUID uuidRandomUUID3 = UUID.randomUUID();
                    UUID uuidRandomUUID4 = UUID.randomUUID();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(uuidRandomUUID3);
                    sb2.append(uuidRandomUUID4);
                    return sb2.toString();
                }
        }
    }
}
