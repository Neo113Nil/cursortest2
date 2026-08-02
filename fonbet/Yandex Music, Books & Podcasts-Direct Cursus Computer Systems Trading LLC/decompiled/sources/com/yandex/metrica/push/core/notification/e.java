package com.yandex.metrica.push.core.notification;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.content.Context;
import androidx.core.app.u0;
import com.yandex.metrica.push.common.utils.PublicLogger;
import com.yandex.metrica.push.core.notification.d;
import com.yandex.metrica.push.impl.C0079p;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes3.dex */
public class e {
    private final NotificationManager a;
    private final u0 b;
    private final d c;
    private final C0079p d;

    public class b extends a {
        public b(e eVar) {
            super();
        }

        @Override // com.yandex.metrica.push.core.notification.e.a
        public boolean a(NotificationChannelGroup notificationChannelGroup) {
            return !notificationChannelGroup.isBlocked();
        }
    }

    public interface d {
        com.yandex.metrica.push.core.notification.d a();
    }

    public e(NotificationManager notificationManager, u0 u0Var, C0079p c0079p) {
        this.a = notificationManager;
        this.b = u0Var;
        this.d = c0079p;
        if (com.yandex.metrica.push.utils.f.a(28)) {
            this.c = new b(this);
        } else if (com.yandex.metrica.push.utils.f.a(26)) {
            this.c = new a();
        } else {
            this.c = new c();
        }
    }

    public com.yandex.metrica.push.core.notification.d a() {
        return this.c.a();
    }

    public class c implements d {
        public c() {
        }

        public boolean a(boolean z) {
            Boolean a = e.this.d.a("app_notification_status");
            e.this.d.a().edit().putBoolean("app_notification_status", z).apply();
            return (a == null || a.booleanValue() == z) ? false : true;
        }

        @Override // com.yandex.metrica.push.core.notification.e.d
        public com.yandex.metrica.push.core.notification.d a() {
            boolean areNotificationsEnabled = e.this.b.b.areNotificationsEnabled();
            boolean a = a(areNotificationsEnabled);
            Set set = Collections.EMPTY_SET;
            return new com.yandex.metrica.push.core.notification.d(set, set, areNotificationsEnabled, a);
        }
    }

    public e(Context context) {
        this((NotificationManager) context.getSystemService("notification"), new u0(context), new C0079p(context, ".NOTIFICATION_STATUS"));
    }

    public class a extends c {
        public a() {
            super();
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0054  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00dd A[EDGE_INSN: B:31:0x00dd->B:32:0x00dd BREAK  A[LOOP:0: B:8:0x004d->B:25:0x004d], SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00ec  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x0028 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // com.yandex.metrica.push.core.notification.e.c, com.yandex.metrica.push.core.notification.e.d
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public com.yandex.metrica.push.core.notification.d a() {
            List<NotificationChannel> notificationChannels;
            List<NotificationChannelGroup> notificationChannelGroups;
            Iterator<NotificationChannel> it;
            if (e.this.a != null) {
                try {
                    notificationChannels = e.this.a.getNotificationChannels();
                } catch (Exception e) {
                    PublicLogger.e(e, e.getMessage(), new Object[0]);
                }
                if (e.this.a != null) {
                    try {
                        notificationChannelGroups = e.this.a.getNotificationChannelGroups();
                    } catch (Exception e2) {
                        PublicLogger.e(e2, e2.getMessage(), new Object[0]);
                    }
                    HashMap hashMap = new HashMap();
                    HashSet hashSet = new HashSet();
                    it = notificationChannels.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        NotificationChannel next = it.next();
                        boolean z = next.getImportance() != 0;
                        String id = next.getId();
                        C0079p c0079p = e.this.d;
                        c0079p.getClass();
                        Boolean a = c0079p.a("notification_channel_" + id);
                        C0079p c0079p2 = e.this.d;
                        c0079p2.getClass();
                        c0079p2.a("notification_channel_" + id, z);
                        boolean z2 = (a == null || a.booleanValue() == z) ? false : true;
                        if (next.getGroup() == null) {
                            hashSet.add(new d.a(next.getId(), z, z2));
                        } else {
                            Set set = (Set) hashMap.get(next.getGroup());
                            if (set == null) {
                                set = new HashSet();
                                hashMap.put(next.getGroup(), set);
                            }
                            set.add(new d.a(next.getId(), z, z2));
                        }
                    }
                    HashSet hashSet2 = new HashSet();
                    for (NotificationChannelGroup notificationChannelGroup : notificationChannelGroups) {
                        boolean a2 = a(notificationChannelGroup);
                        String id2 = notificationChannelGroup.getId();
                        C0079p c0079p3 = e.this.d;
                        c0079p3.getClass();
                        Boolean a3 = c0079p3.a("notification_group_" + id2);
                        C0079p c0079p4 = e.this.d;
                        c0079p4.getClass();
                        c0079p4.a("notification_group_" + id2, a2);
                        hashSet2.add(new d.b(notificationChannelGroup.getId(), (Set) hashMap.get(notificationChannelGroup.getId()), a2, (a3 == null || a3.booleanValue() == a2) ? false : true));
                    }
                    boolean areNotificationsEnabled = e.this.b.b.areNotificationsEnabled();
                    return new com.yandex.metrica.push.core.notification.d(hashSet2, hashSet, areNotificationsEnabled, a(areNotificationsEnabled));
                }
                notificationChannelGroups = Collections.EMPTY_LIST;
                HashMap hashMap2 = new HashMap();
                HashSet hashSet3 = new HashSet();
                it = notificationChannels.iterator();
                while (true) {
                    if (!it.hasNext()) {
                    }
                }
                HashSet hashSet22 = new HashSet();
                while (r2.hasNext()) {
                }
                boolean areNotificationsEnabled2 = e.this.b.b.areNotificationsEnabled();
                return new com.yandex.metrica.push.core.notification.d(hashSet22, hashSet3, areNotificationsEnabled2, a(areNotificationsEnabled2));
            }
            notificationChannels = Collections.EMPTY_LIST;
            if (e.this.a != null) {
            }
            notificationChannelGroups = Collections.EMPTY_LIST;
            HashMap hashMap22 = new HashMap();
            HashSet hashSet32 = new HashSet();
            it = notificationChannels.iterator();
            while (true) {
                if (!it.hasNext()) {
                }
            }
            HashSet hashSet222 = new HashSet();
            while (r2.hasNext()) {
            }
            boolean areNotificationsEnabled22 = e.this.b.b.areNotificationsEnabled();
            return new com.yandex.metrica.push.core.notification.d(hashSet222, hashSet32, areNotificationsEnabled22, a(areNotificationsEnabled22));
        }

        public boolean a(NotificationChannelGroup notificationChannelGroup) {
            return true;
        }
    }
}
