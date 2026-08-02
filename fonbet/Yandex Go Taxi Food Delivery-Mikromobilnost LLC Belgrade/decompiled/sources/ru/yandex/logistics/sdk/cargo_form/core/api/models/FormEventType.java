package ru.yandex.logistics.sdk.cargo_form.core.api.models;

import defpackage.k4o;
import defpackage.p4s;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lru/yandex/logistics/sdk/cargo_form/core/api/models/FormEventType;", "", "", "key", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Companion", "p4s", "APP_ENTERED_BACKGROUND", "CLOSED", "core"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FormEventType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ FormEventType[] $VALUES;
    public static final FormEventType APP_ENTERED_BACKGROUND;
    public static final FormEventType CLOSED;
    public static final p4s Companion;
    private final String key;

    static {
        FormEventType formEventType = new FormEventType("APP_ENTERED_BACKGROUND", 0, "app-entered-background");
        APP_ENTERED_BACKGROUND = formEventType;
        FormEventType formEventType2 = new FormEventType("CLOSED", 1, "closed");
        CLOSED = formEventType2;
        FormEventType[] formEventTypeArr = {formEventType, formEventType2};
        $VALUES = formEventTypeArr;
        $ENTRIES = a.a(formEventTypeArr);
        Companion = new p4s();
    }

    public FormEventType(String str, int i, String str2) {
        this.key = str2;
    }

    public static k4o a() {
        return $ENTRIES;
    }

    public static FormEventType valueOf(String str) {
        return (FormEventType) Enum.valueOf(FormEventType.class, str);
    }

    public static FormEventType[] values() {
        return (FormEventType[]) $VALUES.clone();
    }

    /* renamed from: b, reason: from getter */
    public final String getKey() {
        return this.key;
    }
}
