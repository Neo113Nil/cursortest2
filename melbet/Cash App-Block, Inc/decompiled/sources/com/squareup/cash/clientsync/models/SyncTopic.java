package com.squareup.cash.clientsync.models;

import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes.dex */
public final class SyncTopic {
    public static final SyncTopic CARD_UI_CONFIG;
    public static final SyncTopic CASH_APP_TAG;
    public static final SyncTopic CASH_LITE_CARD_UI_CONFIG;
    public static final SyncTopic CLIENTSYNC_PRIMARY;
    public static final SyncTopic CLIENT_SYNC_CONFIG;
    public static final List KNOWN_SYNC_TOPICS;
    public static final SyncTopic PAYCHECKS;
    public static final SyncTopic UNKNOWN = new SyncTopic(-1);
    public final int value;

    static {
        SyncTopic syncTopic = new SyncTopic(0);
        SyncTopic syncTopic2 = new SyncTopic(1);
        CLIENTSYNC_PRIMARY = syncTopic2;
        SyncTopic syncTopic3 = new SyncTopic(2);
        SyncTopic syncTopic4 = new SyncTopic(3);
        SyncTopic syncTopic5 = new SyncTopic(4);
        SyncTopic syncTopic6 = new SyncTopic(5);
        SyncTopic syncTopic7 = new SyncTopic(6);
        SyncTopic syncTopic8 = new SyncTopic(8);
        SyncTopic syncTopic9 = new SyncTopic(9);
        SyncTopic syncTopic10 = new SyncTopic(10);
        SyncTopic syncTopic11 = new SyncTopic(11);
        SyncTopic syncTopic12 = new SyncTopic(12);
        SyncTopic syncTopic13 = new SyncTopic(13);
        SyncTopic syncTopic14 = new SyncTopic(14);
        SyncTopic syncTopic15 = new SyncTopic(15);
        SyncTopic syncTopic16 = new SyncTopic(16);
        SyncTopic syncTopic17 = new SyncTopic(17);
        SyncTopic syncTopic18 = new SyncTopic(18);
        SyncTopic syncTopic19 = new SyncTopic(19);
        SyncTopic syncTopic20 = new SyncTopic(20);
        SyncTopic syncTopic21 = new SyncTopic(22);
        SyncTopic syncTopic22 = new SyncTopic(23);
        SyncTopic syncTopic23 = new SyncTopic(24);
        SyncTopic syncTopic24 = new SyncTopic(25);
        SyncTopic syncTopic25 = new SyncTopic(26);
        SyncTopic syncTopic26 = new SyncTopic(27);
        SyncTopic syncTopic27 = new SyncTopic(28);
        SyncTopic syncTopic28 = new SyncTopic(29);
        SyncTopic syncTopic29 = new SyncTopic(31);
        SyncTopic syncTopic30 = new SyncTopic(32);
        SyncTopic syncTopic31 = new SyncTopic(33);
        SyncTopic syncTopic32 = new SyncTopic(34);
        PAYCHECKS = syncTopic32;
        SyncTopic syncTopic33 = new SyncTopic(35);
        SyncTopic syncTopic34 = new SyncTopic(36);
        SyncTopic syncTopic35 = new SyncTopic(37);
        SyncTopic syncTopic36 = new SyncTopic(38);
        CLIENT_SYNC_CONFIG = syncTopic36;
        SyncTopic syncTopic37 = new SyncTopic(39);
        SyncTopic syncTopic38 = new SyncTopic(40);
        SyncTopic syncTopic39 = new SyncTopic(41);
        SyncTopic syncTopic40 = new SyncTopic(42);
        CARD_UI_CONFIG = syncTopic40;
        SyncTopic syncTopic41 = new SyncTopic(43);
        SyncTopic syncTopic42 = new SyncTopic(44);
        SyncTopic syncTopic43 = new SyncTopic(45);
        SyncTopic syncTopic44 = new SyncTopic(46);
        CASH_APP_TAG = syncTopic44;
        SyncTopic syncTopic45 = new SyncTopic(47);
        SyncTopic syncTopic46 = new SyncTopic(48);
        SyncTopic syncTopic47 = new SyncTopic(49);
        SyncTopic syncTopic48 = new SyncTopic(50);
        CASH_LITE_CARD_UI_CONFIG = syncTopic48;
        KNOWN_SYNC_TOPICS = CollectionsKt__CollectionsKt.listOf((Object[]) new SyncTopic[]{syncTopic, syncTopic2, syncTopic3, syncTopic4, syncTopic5, syncTopic6, syncTopic7, syncTopic8, syncTopic9, syncTopic10, syncTopic11, syncTopic12, syncTopic13, syncTopic14, syncTopic15, syncTopic16, syncTopic17, syncTopic18, syncTopic19, syncTopic20, syncTopic21, syncTopic22, syncTopic23, syncTopic24, syncTopic25, syncTopic26, syncTopic27, syncTopic28, syncTopic29, syncTopic30, syncTopic31, syncTopic32, syncTopic33, syncTopic34, syncTopic35, syncTopic36, syncTopic37, syncTopic38, syncTopic39, syncTopic40, syncTopic41, syncTopic42, syncTopic43, syncTopic44, syncTopic45, syncTopic46, syncTopic47, syncTopic48});
    }

    public SyncTopic(int i) {
        this.value = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SyncTopic) && this.value == ((SyncTopic) obj).value;
    }

    public final int hashCode() {
        return Integer.hashCode(this.value);
    }

    public final String toString() {
        return String.valueOf(this.value);
    }
}
