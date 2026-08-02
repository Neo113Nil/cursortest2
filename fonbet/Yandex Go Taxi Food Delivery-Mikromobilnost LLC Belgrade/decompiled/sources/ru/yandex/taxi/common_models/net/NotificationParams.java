package ru.yandex.taxi.common_models.net;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.jsq0;
import defpackage.k4o;
import defpackage.ksq0;
import defpackage.oi60;
import defpackage.oyr;
import defpackage.ui60;
import java.util.Calendar;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/common_models/net/NotificationParams;", "", "Companion", "BehaviorOption", "ui60", "ti60", "go-client-android.features:common_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class NotificationParams {
    public static final ui60 Companion = new ui60();
    public static final i3y[] e = {null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new oi60(1))};
    public static final NotificationParams f = new NotificationParams(8);
    public final int a;
    public final int b;
    public final Calendar c;
    public final jsq0 d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/common_models/net/NotificationParams$BehaviorOption;", "", "Companion", "ru/yandex/taxi/common_models/net/c0", "DONT_HIDE_SUMMARY", "UNKNOWN", "go-client-android.features:common_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes6.dex */
    public static final class BehaviorOption {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ BehaviorOption[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final c0 Companion;
        public static final BehaviorOption DONT_HIDE_SUMMARY;
        public static final BehaviorOption UNKNOWN;

        static {
            BehaviorOption behaviorOption = new BehaviorOption("DONT_HIDE_SUMMARY", 0);
            DONT_HIDE_SUMMARY = behaviorOption;
            BehaviorOption behaviorOption2 = new BehaviorOption("UNKNOWN", 1);
            UNKNOWN = behaviorOption2;
            BehaviorOption[] behaviorOptionArr = {behaviorOption, behaviorOption2};
            $VALUES = behaviorOptionArr;
            $ENTRIES = kotlin.enums.a.a(behaviorOptionArr);
            Companion = new c0();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new oi60(2));
        }

        public static BehaviorOption valueOf(String str) {
            return (BehaviorOption) Enum.valueOf(BehaviorOption.class, str);
        }

        public static BehaviorOption[] values() {
            return (BehaviorOption[]) $VALUES.clone();
        }
    }

    public /* synthetic */ NotificationParams(int i, int i2, int i3, Calendar calendar, jsq0 jsq0Var) {
        if ((i & 1) == 0) {
            this.a = 0;
        } else {
            this.a = i2;
        }
        if ((i & 2) == 0) {
            this.b = 0;
        } else {
            this.b = i3;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = calendar;
        }
        if ((i & 8) == 0) {
            this.d = ksq0.a;
        } else {
            this.d = jsq0Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!NotificationParams.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        NotificationParams notificationParams = (NotificationParams) obj;
        return this.a == notificationParams.a && this.b == notificationParams.b && jl40.l(this.c, notificationParams.c);
    }

    public final int hashCode() {
        int i = ((this.a * 31) + this.b) * 31;
        Calendar calendar = this.c;
        return i + (calendar != null ? calendar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NotificationParams(due=");
        sb.append(this.c);
        sb.append(", maxAlertsPerUser=");
        sb.append(this.b);
        sb.append(", maxAlertsPerSession=");
        return oyr.m(this.a, Extension.C_BRAKE, sb);
    }

    public NotificationParams() {
        this(15);
    }

    public NotificationParams(int i) {
        int i2 = (i & 1) != 0 ? 0 : 1;
        int i3 = (i & 2) != 0 ? 0 : 1;
        jsq0 jsq0Var = ksq0.a;
        this.a = i2;
        this.b = i3;
        this.c = null;
        this.d = jsq0Var;
    }
}
