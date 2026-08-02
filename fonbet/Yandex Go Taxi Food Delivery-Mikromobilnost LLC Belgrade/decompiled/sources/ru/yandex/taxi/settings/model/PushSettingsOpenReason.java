package ru.yandex.taxi.settings.model;

import com.adjust.sdk.Constants;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lru/yandex/taxi/settings/model/PushSettingsOpenReason;", "", "", "analyticsName", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "MENU", "PUSH", "ORDER", "DEEPLINK", "settings"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PushSettingsOpenReason {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PushSettingsOpenReason[] $VALUES;
    public static final PushSettingsOpenReason DEEPLINK;
    public static final PushSettingsOpenReason MENU;
    public static final PushSettingsOpenReason ORDER;
    public static final PushSettingsOpenReason PUSH;
    private final String analyticsName;

    static {
        PushSettingsOpenReason pushSettingsOpenReason = new PushSettingsOpenReason("MENU", 0, "menu");
        MENU = pushSettingsOpenReason;
        PushSettingsOpenReason pushSettingsOpenReason2 = new PushSettingsOpenReason("PUSH", 1, Constants.PUSH);
        PUSH = pushSettingsOpenReason2;
        PushSettingsOpenReason pushSettingsOpenReason3 = new PushSettingsOpenReason("ORDER", 2, "content_card");
        ORDER = pushSettingsOpenReason3;
        PushSettingsOpenReason pushSettingsOpenReason4 = new PushSettingsOpenReason("DEEPLINK", 3, Constants.DEEPLINK);
        DEEPLINK = pushSettingsOpenReason4;
        PushSettingsOpenReason[] pushSettingsOpenReasonArr = {pushSettingsOpenReason, pushSettingsOpenReason2, pushSettingsOpenReason3, pushSettingsOpenReason4};
        $VALUES = pushSettingsOpenReasonArr;
        $ENTRIES = a.a(pushSettingsOpenReasonArr);
    }

    public PushSettingsOpenReason(String str, int i, String str2) {
        this.analyticsName = str2;
    }

    public static PushSettingsOpenReason valueOf(String str) {
        return (PushSettingsOpenReason) Enum.valueOf(PushSettingsOpenReason.class, str);
    }

    public static PushSettingsOpenReason[] values() {
        return (PushSettingsOpenReason[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getAnalyticsName() {
        return this.analyticsName;
    }
}
