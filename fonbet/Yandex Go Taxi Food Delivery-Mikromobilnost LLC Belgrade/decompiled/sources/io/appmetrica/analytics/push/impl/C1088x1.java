package io.appmetrica.analytics.push.impl;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import io.appmetrica.analytics.push.logger.internal.PublicLogger;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptySet;

/* renamed from: io.appmetrica.analytics.push.impl.x1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C1088x1 extends C1094z1 {
    public final /* synthetic */ A1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1088x1(A1 a1) {
        super(a1);
        this.b = a1;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0084 A[EDGE_INSN: B:23:0x0084->B:24:0x0084 BREAK  A[LOOP:0: B:8:0x003c->B:21:0x003c], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0020 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // io.appmetrica.analytics.push.impl.C1094z1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C1076t1 a() {
        List<NotificationChannel> notificationChannels;
        NotificationManager notificationManager;
        List<NotificationChannelGroup> notificationChannelGroups;
        Iterator<NotificationChannel> it;
        Boolean a;
        NotificationManager notificationManager2 = this.b.a;
        boolean z = false;
        if (notificationManager2 != null) {
            try {
                notificationChannels = notificationManager2.getNotificationChannels();
            } catch (Exception e) {
                PublicLogger.INSTANCE.error(e, e.getMessage(), new Object[0]);
            }
            notificationManager = this.b.a;
            if (notificationManager != null) {
                try {
                    notificationChannelGroups = notificationManager.getNotificationChannelGroups();
                } catch (Exception e2) {
                    PublicLogger.INSTANCE.error(e2, e2.getMessage(), new Object[0]);
                }
                HashMap hashMap = new HashMap();
                it = notificationChannels.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    NotificationChannel next = it.next();
                    if (next.getGroup() != null) {
                        boolean z2 = next.getImportance() != 0;
                        boolean a2 = a(next.getId(), z2);
                        Set set = (Set) hashMap.get(next.getGroup());
                        if (set == null) {
                            set = new HashSet();
                            hashMap.put(next.getGroup(), set);
                        }
                        set.add(new C1079u1(next.getId(), z2, a2));
                    }
                }
                HashSet hashSet = new HashSet();
                for (NotificationChannel notificationChannel : notificationChannels) {
                    if (notificationChannel.getGroup() == null) {
                        boolean z3 = notificationChannel.getImportance() != 0;
                        hashSet.add(new C1079u1(notificationChannel.getId(), z3, a(notificationChannel.getId(), z3)));
                    }
                }
                HashSet hashSet2 = new HashSet();
                for (NotificationChannelGroup notificationChannelGroup : notificationChannelGroups) {
                    boolean a3 = a(notificationChannelGroup);
                    String id = notificationChannelGroup.getId();
                    M1 m1 = this.b.d;
                    m1.getClass();
                    Boolean a4 = m1.a("notification_group_" + id);
                    M1 m12 = this.b.d;
                    m12.getClass();
                    m12.a("notification_group_" + id, a3);
                    boolean z4 = (a4 == null || a4.booleanValue() == a3) ? false : true;
                    Set set2 = (Set) hashMap.get(notificationChannelGroup.getId());
                    if (set2 == null) {
                        hashSet2.add(new C1085w1(notificationChannelGroup.getId(), a3, z4, EmptySet.a));
                    } else {
                        hashSet2.add(new C1085w1(notificationChannelGroup.getId(), a3, z4, set2));
                    }
                }
                boolean areNotificationsEnabled = this.a.b.b.areNotificationsEnabled();
                a = this.a.d.a("app_notification_status");
                this.a.d.a("app_notification_status", areNotificationsEnabled);
                if (a != null && a.booleanValue() != areNotificationsEnabled) {
                    z = true;
                }
                return new C1076t1(areNotificationsEnabled, z, hashSet2, hashSet);
            }
            notificationChannelGroups = Collections.EMPTY_LIST;
            HashMap hashMap2 = new HashMap();
            it = notificationChannels.iterator();
            while (true) {
                if (!it.hasNext()) {
                }
            }
            HashSet hashSet3 = new HashSet();
            while (r0.hasNext()) {
            }
            HashSet hashSet22 = new HashSet();
            while (r2.hasNext()) {
            }
            boolean areNotificationsEnabled2 = this.a.b.b.areNotificationsEnabled();
            a = this.a.d.a("app_notification_status");
            this.a.d.a("app_notification_status", areNotificationsEnabled2);
            if (a != null) {
                z = true;
            }
            return new C1076t1(areNotificationsEnabled2, z, hashSet22, hashSet3);
        }
        notificationChannels = Collections.EMPTY_LIST;
        notificationManager = this.b.a;
        if (notificationManager != null) {
        }
        notificationChannelGroups = Collections.EMPTY_LIST;
        HashMap hashMap22 = new HashMap();
        it = notificationChannels.iterator();
        while (true) {
            if (!it.hasNext()) {
            }
        }
        HashSet hashSet32 = new HashSet();
        while (r0.hasNext()) {
        }
        HashSet hashSet222 = new HashSet();
        while (r2.hasNext()) {
        }
        boolean areNotificationsEnabled22 = this.a.b.b.areNotificationsEnabled();
        a = this.a.d.a("app_notification_status");
        this.a.d.a("app_notification_status", areNotificationsEnabled22);
        if (a != null) {
        }
        return new C1076t1(areNotificationsEnabled22, z, hashSet222, hashSet32);
    }

    public boolean a(NotificationChannelGroup notificationChannelGroup) {
        return true;
    }

    public final boolean a(String str, boolean z) {
        M1 m1 = this.b.d;
        m1.getClass();
        Boolean a = m1.a("notification_channel_" + str);
        M1 m12 = this.b.d;
        m12.getClass();
        m12.a("notification_channel_" + str, z);
        return (a == null || a.booleanValue() == z) ? false : true;
    }
}
