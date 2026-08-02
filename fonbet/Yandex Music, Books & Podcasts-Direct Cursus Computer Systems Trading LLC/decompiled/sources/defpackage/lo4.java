package defpackage;

import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;

/* loaded from: classes5.dex */
public enum lo4 {
    android(ConstantDeviceInfo.APP_PLATFORM),
    /* JADX INFO: Fake field, exist only in values array */
    ios("ios");

    public final String a;

    lo4(String str) {
        this.a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }
}
