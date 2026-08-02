package com.yandex.passport.internal.sloth.performers.usermenu;

import com.connectsdk.service.NetcastTVService;
import com.yandex.passport.sloth.command.u;
import defpackage.gm5;
import defpackage.uah;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final /* synthetic */ class c implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ gm5 b;

    public /* synthetic */ c(gm5 gm5Var, int i) {
        this.a = i;
        this.b = gm5Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                String str = (String) obj;
                gm5 gm5Var = this.b;
                if (str == null || StringsKt.U(str)) {
                    gm5Var.U(new com.yandex.passport.sloth.command.b(new JSONObject()));
                } else {
                    gm5Var.U(new u(uah.p(new Pair[]{new Pair(NetcastTVService.UDAP_API_COMMAND, str)})));
                }
                break;
            case 1:
                Map map = (Map) obj;
                map.getClass();
                this.b.U(new u(map));
                break;
            default:
                String str2 = (String) obj;
                gm5 gm5Var2 = this.b;
                if (str2 == null || StringsKt.U(str2)) {
                    gm5Var2.U(new com.yandex.passport.sloth.command.b(new JSONObject()));
                } else {
                    gm5Var2.U(new u(uah.p(new Pair[]{new Pair("phoneNumber", str2)})));
                }
                break;
        }
        return Unit.a;
    }
}
