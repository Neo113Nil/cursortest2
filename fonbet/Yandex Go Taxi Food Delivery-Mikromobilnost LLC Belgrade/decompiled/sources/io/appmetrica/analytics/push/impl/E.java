package io.appmetrica.analytics.push.impl;

import io.appmetrica.analytics.push.coreutils.internal.commands.Commands;
import java.util.HashMap;

/* loaded from: classes9.dex */
public final class E {
    public final HashMap a;

    public E() {
        HashMap hashMap = new HashMap();
        this.a = hashMap;
        hashMap.put(Commands.InitPushService.COMMAND_ACTION, new P0());
        hashMap.put(Commands.SendPushToken.INIT_PUSH_TOKEN_COMMAND_ACTION, new C1042i2(new A0(), new C1093z0(), new Q0()));
        hashMap.put(Commands.SendPushToken.UPDATE_PUSH_TOKEN_COMMAND_ACTION, new H(new C1042i2(new A0(), new C1093z0(), new F2()), new C1046j2()));
        hashMap.put(Commands.ProcessPush.COMMAND_ACTION, new H(new N1(), new O1()));
        hashMap.put(Commands.SendPushToken.SEND_PUSH_TOKEN_ON_REFRESH_COMMAND_ACTION, new H(new C1042i2(new A0(), new C1093z0(), new F2()), new C1046j2()));
        hashMap.put(Commands.SendPushToken.SEND_PUSH_TOKEN_MANUALLY_COMMAND_ACTION, new C1042i2(new A0(), new C1093z0(), new F2()));
        hashMap.put(Commands.UpdateSystemInfo.COMMAND_ACTION, new E2(new C1090y0(), new C1087x0()));
    }
}
