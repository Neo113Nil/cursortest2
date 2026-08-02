package com.yandex.music.shared.bdu.trigger.cache.dto;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.google.gson.annotations.SerializedName;
import defpackage.e88;
import defpackage.rdb;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"com/yandex/music/shared/bdu/trigger/cache/dto/CommunicationTriggerDto$UiType", "", "Lcom/yandex/music/shared/bdu/trigger/cache/dto/CommunicationTriggerDto$UiType;", "", Constants.KEY_VALUE, "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "e88", "FULLSCREEN", "BOTTOMSHEET", "BANNER", "DEEPLINK", "DYNAMIC_OVERLAY_SHEET", "TOAST", "shared-bdu-trigger"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes3.dex */
public final class CommunicationTriggerDto$UiType {

    @SerializedName("banner")
    public static final CommunicationTriggerDto$UiType BANNER;

    @SerializedName("bottomsheet")
    public static final CommunicationTriggerDto$UiType BOTTOMSHEET;

    @SerializedName("deeplink")
    public static final CommunicationTriggerDto$UiType DEEPLINK;

    @SerializedName("dynamic_overlay_sheet")
    public static final CommunicationTriggerDto$UiType DYNAMIC_OVERLAY_SHEET;

    @SerializedName("fullscreen")
    public static final CommunicationTriggerDto$UiType FULLSCREEN;

    @SerializedName("toast")
    public static final CommunicationTriggerDto$UiType TOAST;
    public static final e88 b;
    public static final /* synthetic */ CommunicationTriggerDto$UiType[] c;
    public static final /* synthetic */ rdb d;
    public final String a;

    static {
        CommunicationTriggerDto$UiType communicationTriggerDto$UiType = new CommunicationTriggerDto$UiType("FULLSCREEN", 0, "fullscreen");
        FULLSCREEN = communicationTriggerDto$UiType;
        CommunicationTriggerDto$UiType communicationTriggerDto$UiType2 = new CommunicationTriggerDto$UiType("BOTTOMSHEET", 1, "bottomsheet");
        BOTTOMSHEET = communicationTriggerDto$UiType2;
        CommunicationTriggerDto$UiType communicationTriggerDto$UiType3 = new CommunicationTriggerDto$UiType("BANNER", 2, "banner");
        BANNER = communicationTriggerDto$UiType3;
        CommunicationTriggerDto$UiType communicationTriggerDto$UiType4 = new CommunicationTriggerDto$UiType("DEEPLINK", 3, "deeplink");
        DEEPLINK = communicationTriggerDto$UiType4;
        CommunicationTriggerDto$UiType communicationTriggerDto$UiType5 = new CommunicationTriggerDto$UiType("DYNAMIC_OVERLAY_SHEET", 4, "dynamic_overlay_sheet");
        DYNAMIC_OVERLAY_SHEET = communicationTriggerDto$UiType5;
        CommunicationTriggerDto$UiType communicationTriggerDto$UiType6 = new CommunicationTriggerDto$UiType("TOAST", 5, "toast");
        TOAST = communicationTriggerDto$UiType6;
        CommunicationTriggerDto$UiType[] communicationTriggerDto$UiTypeArr = {communicationTriggerDto$UiType, communicationTriggerDto$UiType2, communicationTriggerDto$UiType3, communicationTriggerDto$UiType4, communicationTriggerDto$UiType5, communicationTriggerDto$UiType6};
        c = communicationTriggerDto$UiTypeArr;
        d = new rdb(communicationTriggerDto$UiTypeArr);
        b = new e88(17);
    }

    private CommunicationTriggerDto$UiType(String str, int i, String str2) {
        this.a = str2;
    }

    public static CommunicationTriggerDto$UiType valueOf(String str) {
        return (CommunicationTriggerDto$UiType) Enum.valueOf(CommunicationTriggerDto$UiType.class, str);
    }

    public static CommunicationTriggerDto$UiType[] values() {
        return (CommunicationTriggerDto$UiType[]) c.clone();
    }
}
