package ru.yandex.taxi.eatskit.dto;

import defpackage.cao;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.n1p;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/eatskit/dto/ExternalServiceData;", "", "Companion", "NotificationType", "ru/yandex/taxi/eatskit/dto/a", "n1p", "eatskit"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ExternalServiceData {
    public static final n1p Companion = new n1p();
    public static final i3y[] c;
    public final NotificationType a;
    public final Map b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/eatskit/dto/ExternalServiceData$NotificationType;", "", "Companion", "ru/yandex/taxi/eatskit/dto/b", "STATUS", "RATE", "eatskit"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes2.dex */
    public static final class NotificationType {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ NotificationType[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final b Companion;
        public static final NotificationType RATE;
        public static final NotificationType STATUS;

        static {
            NotificationType notificationType = new NotificationType("STATUS", 0);
            STATUS = notificationType;
            NotificationType notificationType2 = new NotificationType("RATE", 1);
            RATE = notificationType2;
            NotificationType[] notificationTypeArr = {notificationType, notificationType2};
            $VALUES = notificationTypeArr;
            $ENTRIES = kotlin.enums.a.a(notificationTypeArr);
            Companion = new b();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new cao(26));
        }

        public static NotificationType valueOf(String str) {
            return (NotificationType) Enum.valueOf(NotificationType.class, str);
        }

        public static NotificationType[] values() {
            return (NotificationType[]) $VALUES.clone();
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        c = new i3y[]{kotlin.a.b(lazyThreadSafetyMode, new cao(24)), kotlin.a.b(lazyThreadSafetyMode, new cao(25))};
    }

    public /* synthetic */ ExternalServiceData(int i, NotificationType notificationType, Map map) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = notificationType;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = map;
        }
    }

    public ExternalServiceData() {
        this.a = null;
        this.b = null;
    }
}
