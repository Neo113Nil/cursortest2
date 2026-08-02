package defpackage;

import com.yandex.go.chargers.passes.payment_settings.c;
import com.yandex.go.chargers.qr.api.ChargersQrOpenReason;
import com.yandex.messaging.core.net.entities.OutOrganizationUser;
import com.yandex.messaging.ui.chatinfo.editchat.ChatSettingsSwitch;
import java.util.ArrayList;

/* loaded from: classes15.dex */
public final /* synthetic */ class rfa implements tls {
    public final /* synthetic */ int a;

    public /* synthetic */ rfa(int i) {
        this.a = i;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        ull0 T0;
        zy11 onCheckedChangeListener$lambda$1;
        long j;
        int i = this.a;
        int i2 = 9;
        int i3 = 7;
        int i4 = 5;
        int i5 = 2;
        Long l = null;
        int i6 = 1;
        int i7 = 0;
        zy11 zy11Var = zy11.a;
        switch (i) {
            case 0:
                return Boolean.valueOf(jl40.l((kia) obj, hia.a));
            case 1:
                ((c) obj).n1();
                return zy11Var;
            case 2:
                ((gka) obj).a.r(new qu(i2));
                return zy11Var;
            case 3:
                ((wga) obj).a.r(new rfa(i5));
                return zy11Var;
            case 4:
                return Boolean.valueOf(jl40.l((fma) obj, cma.a));
            case 5:
                ((bsa) obj).n1(ChargersQrOpenReason.STATION_CARD, null);
                return zy11Var;
            case 6:
                ((ava) obj).a.r(new rfa(i3));
                return zy11Var;
            case 7:
                ((fua) obj).U();
                return zy11Var;
            case 8:
                ((gsa) obj).a.r(new rfa(i4));
                return zy11Var;
            case 9:
                T0 = ((oll0) obj).T0("SELECT\n                chats.chat_id AS chatId,\n                chats.seen_marker AS ownerSeenMarker,\n                chats.owner_last_seen_sequence_number AS ownerLastSeenSequenceNumber,\n                chats.other_seen_marker AS otherSeenMarker,\n                chats.last_timestamp AS lastMessageTimestamp,\n                chats.flags AS flags,\n                chats.min_message_timestamp AS minMessageTimestamp,\n                cache_chat_edit_history_timestamps.edit_history_server_max_timestamp AS lastEditTimestamp,\n                participants_count.count AS participantCount,\n                chat_preferences.approved_by_me AS approvedByMe,\n                pinned_messages.timestamp AS pinMessageTs,\n                user_roles.version AS myRoleVersion\n           FROM chats\n           LEFT JOIN cache_chat_edit_history_timestamps ON chats.chat_internal_id=cache_chat_edit_history_timestamps.chat_internal_id\n           LEFT JOIN participants_count ON chats.chat_internal_id=participants_count.chat_internal_id\n           LEFT JOIN chat_preferences ON chats.chat_id=chat_preferences.chat_id\n           LEFT JOIN pinned_messages ON chats.chat_internal_id=pinned_messages.chat_internal_id\n           LEFT JOIN user_roles ON chats.chat_internal_id=user_roles.chat_internal_id\n           ");
                try {
                    ArrayList arrayList = new ArrayList();
                    while (T0.q()) {
                        arrayList.add(new a3b(T0.Y1(i7), T0.getLong(i6), T0.getLong(2), T0.getLong(3), T0.isNull(4) ? null : Long.valueOf(T0.getLong(4)), T0.getLong(5), T0.isNull(6) ? null : Long.valueOf(T0.getLong(6)), T0.getLong(7), T0.isNull(8) ? null : Long.valueOf(T0.getLong(8)), ((int) T0.getLong(9)) != 0, T0.isNull(10) ? null : Long.valueOf(T0.getLong(10)), T0.isNull(11) ? null : Long.valueOf(T0.getLong(11))));
                        i6 = 1;
                        i7 = 0;
                    }
                    return arrayList;
                } finally {
                }
            case 10:
                return ((OutOrganizationUser) obj).getDisplayName();
            case 11:
                oll0 oll0Var = (oll0) obj;
                T0 = oll0Var.T0("DELETE FROM chat_miniapp");
                try {
                    T0.q();
                    int x = jx81.x(oll0Var);
                    T0.close();
                    return Integer.valueOf(x);
                } finally {
                }
            case 12:
                T0 = ((oll0) obj).T0("SELECT * FROM chat_miniapp");
                try {
                    int r = eja1.r(T0, "chat_id");
                    int r2 = eja1.r(T0, "miniapp_url");
                    int r3 = eja1.r(T0, "trusted");
                    ArrayList arrayList2 = new ArrayList();
                    while (T0.q()) {
                        arrayList2.add(new r5b(T0.Y1(r), T0.isNull(r2) ? null : T0.Y1(r2), ((int) T0.getLong(r3)) != 0));
                    }
                    return arrayList2;
                } finally {
                }
            case 13:
                T0 = ((oll0) obj).T0("SELECT MIN(version) FROM chat_muting");
                try {
                    if (T0.q() && !T0.isNull(0)) {
                        l = Long.valueOf(T0.getLong(0));
                    }
                    return l;
                } finally {
                }
            case 14:
                onCheckedChangeListener$lambda$1 = ChatSettingsSwitch.onCheckedChangeListener$lambda$1(((Boolean) obj).booleanValue());
                return onCheckedChangeListener$lambda$1;
            case 15:
                return Integer.valueOf(((yab) obj).a.getCount());
            case 16:
                return Boolean.valueOf(((yab) obj).a.moveToNext());
            case 17:
                return Boolean.valueOf(((yab) obj).a.moveToFirst());
            case 18:
                yab yabVar = (yab) obj;
                return Boolean.valueOf(yabVar.moveToPosition(yabVar.getCount() - 1));
            case 19:
                return Boolean.valueOf(((yab) obj).a.moveToPrevious());
            case 20:
                ((mcb) obj).b = true;
                return zy11Var;
            case 21:
                ((mcb) obj).d = true;
                return zy11Var;
            case 22:
                ((mcb) obj).c = true;
                return zy11Var;
            case 23:
                T0 = ((oll0) obj).T0("SELECT chat_internal_id FROM saved_messages_view");
                try {
                    if (T0.q() && !T0.isNull(0)) {
                        l = Long.valueOf(T0.getLong(0));
                    }
                    return l;
                } finally {
                }
            case 24:
                T0 = ((oll0) obj).T0("SELECT COUNT(1) FROM chats");
                try {
                    j = T0.q() ? T0.getLong(0) : 0L;
                    T0.close();
                    return Long.valueOf(j);
                } finally {
                }
            case 25:
                oll0 oll0Var2 = (oll0) obj;
                T0 = oll0Var2.T0("DELETE FROM chats WHERE parent_internal_id IS NOT NULL");
                try {
                    T0.q();
                    int x2 = jx81.x(oll0Var2);
                    T0.close();
                    return Integer.valueOf(x2);
                } finally {
                }
            case 26:
                T0 = ((oll0) obj).T0("SELECT chat_internal_id FROM chats WHERE parent_internal_id IS NOT NULL");
                try {
                    ArrayList arrayList3 = new ArrayList();
                    while (T0.q()) {
                        arrayList3.add(Long.valueOf(T0.getLong(0)));
                    }
                    return arrayList3;
                } finally {
                }
            case 27:
                T0 = ((oll0) obj).T0("SELECT chat_internal_id, chat_id FROM chats");
                try {
                    ArrayList arrayList4 = new ArrayList();
                    while (T0.q()) {
                        arrayList4.add(new n2b(T0.getLong(0), T0.Y1(1)));
                    }
                    return arrayList4;
                } finally {
                }
            case 28:
                T0 = ((oll0) obj).T0("SELECT COUNT(1) FROM chats WHERE parent_internal_id IS NOT NULL");
                try {
                    j = T0.q() ? T0.getLong(0) : 0L;
                    T0.close();
                    return Long.valueOf(j);
                } finally {
                }
            default:
                T0 = ((oll0) obj).T0("SELECT chat_id FROM chats_view WHERE is_hidden = 0 ORDER BY sort_time DESC LIMIT ?");
                try {
                    T0.b(1, 20L);
                    ArrayList arrayList5 = new ArrayList();
                    while (T0.q()) {
                        arrayList5.add(T0.Y1(0));
                    }
                    return arrayList5;
                } finally {
                }
        }
    }
}
