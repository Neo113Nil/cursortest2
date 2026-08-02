package com.yandex.music.shared.bdu.trigger.data;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.google.gson.annotations.SerializedName;
import defpackage.e88;
import defpackage.rdb;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"com/yandex/music/shared/bdu/trigger/data/InternalCommunicationTrigger$UiType", "", "Lcom/yandex/music/shared/bdu/trigger/data/InternalCommunicationTrigger$UiType;", "", Constants.KEY_VALUE, "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "e88", "FULLSCREEN", "BOTTOMSHEET", "BANNER", "DEEPLINK", "DYNAMIC_OVERLAY_SHEET", "TOAST", "shared-bdu-trigger"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes3.dex */
public final class InternalCommunicationTrigger$UiType {

    @SerializedName("banner")
    public static final InternalCommunicationTrigger$UiType BANNER;

    @SerializedName("bottomsheet")
    public static final InternalCommunicationTrigger$UiType BOTTOMSHEET;

    @SerializedName("deeplink")
    public static final InternalCommunicationTrigger$UiType DEEPLINK;

    @SerializedName("dynamic_overlay_sheet")
    public static final InternalCommunicationTrigger$UiType DYNAMIC_OVERLAY_SHEET;

    @SerializedName("fullscreen")
    public static final InternalCommunicationTrigger$UiType FULLSCREEN;

    @SerializedName("toast")
    public static final InternalCommunicationTrigger$UiType TOAST;
    public static final e88 b;
    public static final /* synthetic */ InternalCommunicationTrigger$UiType[] c;
    public static final /* synthetic */ rdb d;
    public final String a;

    static {
        InternalCommunicationTrigger$UiType internalCommunicationTrigger$UiType = new InternalCommunicationTrigger$UiType("FULLSCREEN", 0, "fullscreen");
        FULLSCREEN = internalCommunicationTrigger$UiType;
        InternalCommunicationTrigger$UiType internalCommunicationTrigger$UiType2 = new InternalCommunicationTrigger$UiType("BOTTOMSHEET", 1, "bottomsheet");
        BOTTOMSHEET = internalCommunicationTrigger$UiType2;
        InternalCommunicationTrigger$UiType internalCommunicationTrigger$UiType3 = new InternalCommunicationTrigger$UiType("BANNER", 2, "banner");
        BANNER = internalCommunicationTrigger$UiType3;
        InternalCommunicationTrigger$UiType internalCommunicationTrigger$UiType4 = new InternalCommunicationTrigger$UiType("DEEPLINK", 3, "deeplink");
        DEEPLINK = internalCommunicationTrigger$UiType4;
        InternalCommunicationTrigger$UiType internalCommunicationTrigger$UiType5 = new InternalCommunicationTrigger$UiType("DYNAMIC_OVERLAY_SHEET", 4, "dynamic_overlay_sheet");
        DYNAMIC_OVERLAY_SHEET = internalCommunicationTrigger$UiType5;
        InternalCommunicationTrigger$UiType internalCommunicationTrigger$UiType6 = new InternalCommunicationTrigger$UiType("TOAST", 5, "toast");
        TOAST = internalCommunicationTrigger$UiType6;
        InternalCommunicationTrigger$UiType[] internalCommunicationTrigger$UiTypeArr = {internalCommunicationTrigger$UiType, internalCommunicationTrigger$UiType2, internalCommunicationTrigger$UiType3, internalCommunicationTrigger$UiType4, internalCommunicationTrigger$UiType5, internalCommunicationTrigger$UiType6};
        c = internalCommunicationTrigger$UiTypeArr;
        d = new rdb(internalCommunicationTrigger$UiTypeArr);
        b = new e88(25);
    }

    private InternalCommunicationTrigger$UiType(String str, int i, String str2) {
        this.a = str2;
    }

    public static InternalCommunicationTrigger$UiType valueOf(String str) {
        return (InternalCommunicationTrigger$UiType) Enum.valueOf(InternalCommunicationTrigger$UiType.class, str);
    }

    public static InternalCommunicationTrigger$UiType[] values() {
        return (InternalCommunicationTrigger$UiType[]) c.clone();
    }
}
