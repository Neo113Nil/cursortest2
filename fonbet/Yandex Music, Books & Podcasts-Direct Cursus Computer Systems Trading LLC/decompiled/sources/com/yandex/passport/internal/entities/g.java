package com.yandex.passport.internal.entities;

/* loaded from: classes4.dex */
public enum g {
    /* JADX INFO: Fake field, exist only in values array */
    BY_CALL("by_call"),
    /* JADX INFO: Fake field, exist only in values array */
    BY_FLASH_CALL("by_flash_call"),
    BY_SMS("by_sms");

    public final String a;

    g(String str) {
        this.a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }
}
