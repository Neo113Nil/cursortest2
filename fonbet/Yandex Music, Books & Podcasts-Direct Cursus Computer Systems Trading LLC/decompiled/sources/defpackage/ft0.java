package defpackage;

import com.yandex.plus.pay.api.model.AppDistribution;

/* loaded from: classes4.dex */
public enum ft0 {
    GOOGLE_STORE(AppDistribution.GOOGLE_STORE),
    /* JADX INFO: Fake field, exist only in values array */
    SAMSUNG_STORE(AppDistribution.SAMSUNG_STORE),
    /* JADX INFO: Fake field, exist only in values array */
    HUAWEI_STORE(AppDistribution.HUAWEI_STORE),
    /* JADX INFO: Fake field, exist only in values array */
    XIAOMI_STORE(AppDistribution.XIAOMI_STORE),
    /* JADX INFO: Fake field, exist only in values array */
    RUSTORE_STORE("RuStore"),
    /* JADX INFO: Fake field, exist only in values array */
    PALM_STORE("PalmStore"),
    DEV("Dev");

    public static final gos b = new gos(13);
    public final String a;

    ft0(String str) {
        this.a = str;
    }
}
