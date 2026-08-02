package ru.yandex.taxi.layers.presentation.mapnotification;

import defpackage.bvf0;
import defpackage.k4o;
import kotlin.Metadata;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes9.dex */
public final class MapNotificationsMuteRepository {
    public final r0 a = bvf0.c(NotificationVisibility.UNMUTE);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lru/yandex/taxi/layers/presentation/mapnotification/MapNotificationsMuteRepository$NotificationVisibility;", "", "MUTE", "UNMUTE", "old"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class NotificationVisibility {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ NotificationVisibility[] $VALUES;
        public static final NotificationVisibility MUTE;
        public static final NotificationVisibility UNMUTE;

        static {
            NotificationVisibility notificationVisibility = new NotificationVisibility("MUTE", 0);
            MUTE = notificationVisibility;
            NotificationVisibility notificationVisibility2 = new NotificationVisibility("UNMUTE", 1);
            UNMUTE = notificationVisibility2;
            NotificationVisibility[] notificationVisibilityArr = {notificationVisibility, notificationVisibility2};
            $VALUES = notificationVisibilityArr;
            $ENTRIES = kotlin.enums.a.a(notificationVisibilityArr);
        }

        public static NotificationVisibility valueOf(String str) {
            return (NotificationVisibility) Enum.valueOf(NotificationVisibility.class, str);
        }

        public static NotificationVisibility[] values() {
            return (NotificationVisibility[]) $VALUES.clone();
        }
    }

    public final void a() {
        this.a.l(NotificationVisibility.MUTE);
    }

    public final void b() {
        this.a.l(NotificationVisibility.UNMUTE);
    }
}
