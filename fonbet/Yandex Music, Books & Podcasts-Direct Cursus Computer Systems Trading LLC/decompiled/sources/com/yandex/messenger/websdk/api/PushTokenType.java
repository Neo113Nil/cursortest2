package com.yandex.messenger.websdk.api;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/messenger/websdk/api/PushTokenType;", "", "websdk_release"}, k = 1, mv = {2, 1, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes3.dex */
public final class PushTokenType {
    public static final PushTokenType a;
    public static final /* synthetic */ PushTokenType[] b;

    static {
        PushTokenType pushTokenType = new PushTokenType("FCM", 0);
        a = pushTokenType;
        b = new PushTokenType[]{pushTokenType, new PushTokenType("HMS", 1), new PushTokenType("RUSTORE", 2)};
    }

    public static PushTokenType valueOf(String str) {
        return (PushTokenType) Enum.valueOf(PushTokenType.class, str);
    }

    public static PushTokenType[] values() {
        return (PushTokenType[]) b.clone();
    }
}
