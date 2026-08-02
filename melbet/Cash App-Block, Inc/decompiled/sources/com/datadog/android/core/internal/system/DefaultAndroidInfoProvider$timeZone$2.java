package com.datadog.android.core.internal.system;

import java.util.TimeZone;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes4.dex */
public final class DefaultAndroidInfoProvider$timeZone$2 extends Lambda implements Function0 {
    public static final DefaultAndroidInfoProvider$timeZone$2 INSTANCE;
    public static final DefaultAndroidInfoProvider$timeZone$2 INSTANCE$1;
    public static final DefaultAndroidInfoProvider$timeZone$2 INSTANCE$2;
    public final /* synthetic */ int $r8$classId;

    static {
        int i = 0;
        INSTANCE$1 = new DefaultAndroidInfoProvider$timeZone$2(i, 1);
        INSTANCE$2 = new DefaultAndroidInfoProvider$timeZone$2(i, 2);
        INSTANCE = new DefaultAndroidInfoProvider$timeZone$2(i, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DefaultAndroidInfoProvider$timeZone$2(int i, int i2) {
        super(i);
        this.$r8$classId = i2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$r8$classId) {
            case 0:
                return TimeZone.getDefault().getID();
            case 1:
                return "Error handling system info broadcast intent.";
            default:
                String property = System.getProperty("os.arch");
                return property == null ? "unknown" : property;
        }
    }
}
