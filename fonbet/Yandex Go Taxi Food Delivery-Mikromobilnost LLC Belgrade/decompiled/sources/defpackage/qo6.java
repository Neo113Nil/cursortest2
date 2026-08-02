package defpackage;

import com.yandex.messaging.internal.ServerMessageRef;
import java.util.ArrayList;

/* loaded from: classes15.dex */
public final /* synthetic */ class qo6 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ String c;

    public /* synthetic */ qo6(long j, String str, int i) {
        this.a = i;
        this.b = j;
        this.c = str;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        ull0 T0;
        Boolean bool;
        dy10 dy10Var;
        boolean z;
        boolean z2;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        String str = this.c;
        long j = this.b;
        switch (i) {
            case 0:
                oll0 oll0Var = (oll0) obj;
                T0 = oll0Var.T0("INSERT OR REPLACE INTO bucket_version(bucket_name, version) VALUES(?, ?)");
                try {
                    T0.g1(1, str);
                    T0.b(2, j);
                    T0.q();
                    long t = jx81.t(oll0Var);
                    T0.close();
                    return Long.valueOf(t);
                } finally {
                }
            case 1:
                T0 = ((oll0) obj).T0("INSERT OR REPLACE INTO saved_messages_view VALUES (?, ?, 0)");
                try {
                    T0.b(1, j);
                    T0.g1(2, str);
                    T0.q();
                    return zy11Var;
                } finally {
                }
            case 2:
                T0 = ((oll0) obj).T0("DELETE FROM folder_filter_cross_ref WHERE folder_id = ? AND organization_id = ?");
                try {
                    T0.g1(1, str);
                    T0.b(2, j);
                    T0.q();
                    return zy11Var;
                } finally {
                }
            case 3:
                T0 = ((oll0) obj).T0("DELETE FROM folders WHERE folder_id = ? AND organization_id = ?");
                try {
                    T0.g1(1, str);
                    T0.b(2, j);
                    T0.q();
                    return zy11Var;
                } finally {
                }
            case 4:
                oll0 oll0Var2 = (oll0) obj;
                T0 = oll0Var2.T0("UPDATE local_contacts SET locals_last_time_contacted=? WHERE locals_upload_id=?");
                try {
                    T0.b(1, j);
                    T0.g1(2, str);
                    T0.q();
                    int x = jx81.x(oll0Var2);
                    T0.close();
                    return Integer.valueOf(x);
                } finally {
                }
            case 5:
                oll0 oll0Var3 = (oll0) obj;
                T0 = oll0Var3.T0("DELETE FROM members WHERE internal_chat_id = ? AND user_id = ?");
                try {
                    T0.b(1, j);
                    T0.g1(2, str);
                    T0.q();
                    int x2 = jx81.x(oll0Var3);
                    T0.close();
                    return Integer.valueOf(x2);
                } finally {
                }
            case 6:
                T0 = ((oll0) obj).T0("SELECT choice FROM message_moderation_user_choice WHERE chat_id = ? AND message_timestamp = ?");
                try {
                    T0.g1(1, str);
                    T0.b(2, j);
                    if (T0.q()) {
                        Integer valueOf = T0.isNull(0) ? null : Integer.valueOf((int) T0.getLong(0));
                        if (valueOf != null) {
                            bool = Boolean.valueOf(valueOf.intValue() != 0);
                            return bool;
                        }
                    }
                    bool = null;
                    return bool;
                } finally {
                }
            case 7:
                T0 = ((oll0) obj).T0("SELECT edit_time FROM messages WHERE message_id = ? AND chat_internal_id = ? AND message_history_id >= ?");
                try {
                    T0.g1(1, str);
                    T0.b(2, j);
                    T0.b(3, ServerMessageRef.OUTGOING_HISTORY_ID_OFFSET);
                    return (!T0.q() || T0.isNull(0)) ? null : Long.valueOf(T0.getLong(0));
                } finally {
                }
            case 8:
                T0 = ((oll0) obj).T0("SELECT data FROM messages WHERE chat_internal_id = ? AND message_id = ?");
                try {
                    T0.b(1, j);
                    T0.g1(2, str);
                    return (!T0.q() || T0.isNull(0)) ? null : T0.Y1(0);
                } finally {
                }
            case 9:
                oll0 oll0Var4 = (oll0) obj;
                T0 = oll0Var4.T0("UPDATE messages SET data = ? WHERE msg_internal_id = ?");
                try {
                    T0.g1(1, str);
                    T0.b(2, j);
                    T0.q();
                    int x3 = jx81.x(oll0Var4);
                    T0.close();
                    return Integer.valueOf(x3);
                } finally {
                }
            case 10:
                oll0 oll0Var5 = (oll0) obj;
                T0 = oll0Var5.T0("DELETE FROM messages WHERE chat_internal_id = ? AND message_id = ?");
                try {
                    T0.b(1, j);
                    T0.g1(2, str);
                    T0.q();
                    int x4 = jx81.x(oll0Var5);
                    T0.close();
                    return Integer.valueOf(x4);
                } finally {
                }
            case 11:
                T0 = ((oll0) obj).T0("SELECT count(*) FROM messages WHERE chat_internal_id = ? AND message_id = ?");
                try {
                    T0.b(1, j);
                    T0.g1(2, str);
                    int i2 = T0.q() ? (int) T0.getLong(0) : 0;
                    T0.close();
                    return Integer.valueOf(i2);
                } finally {
                }
            case 12:
                T0 = ((oll0) obj).T0(" SELECT\n            msg_internal_id, message_id, message_sequence_number, message_prev_history_id, message_history_id, time\n            FROM messages WHERE chat_internal_id = ? AND message_id = ?\n        ");
                try {
                    T0.b(1, j);
                    T0.g1(2, str);
                    if (T0.q()) {
                        dy10Var = new dy10(T0.getLong(0), T0.isNull(1) ? null : T0.Y1(1), T0.getLong(2), T0.getLong(3), T0.getLong(4), T0.getDouble(5));
                    } else {
                        dy10Var = null;
                    }
                    return dy10Var;
                } finally {
                }
            case 13:
                T0 = ((oll0) obj).T0("SELECT EXISTS (SELECT 1 FROM messages WHERE chat_internal_id = ? AND message_id = ?)");
                try {
                    T0.b(1, j);
                    T0.g1(2, str);
                    if (T0.q()) {
                        if (((int) T0.getLong(0)) != 0) {
                            z = true;
                            T0.close();
                            return Boolean.valueOf(z);
                        }
                    }
                    z = false;
                    T0.close();
                    return Boolean.valueOf(z);
                } finally {
                }
            case 14:
                T0 = ((oll0) obj).T0("SELECT message_history_id FROM messages  WHERE chat_internal_id = ? AND message_id = ?  AND message_history_id >= ?");
                try {
                    T0.b(1, j);
                    T0.g1(2, str);
                    T0.b(3, ServerMessageRef.OUTGOING_HISTORY_ID_OFFSET);
                    return (!T0.q() || T0.isNull(0)) ? null : Long.valueOf(T0.getLong(0));
                } finally {
                }
            case 15:
                T0 = ((oll0) obj).T0("SELECT message_history_id FROM messages  WHERE chat_internal_id = ? AND message_id = ?  AND message_history_id < ?");
                try {
                    T0.b(1, j);
                    T0.g1(2, str);
                    T0.b(3, ServerMessageRef.OUTGOING_HISTORY_ID_OFFSET);
                    return (!T0.q() || T0.isNull(0)) ? null : Long.valueOf(T0.getLong(0));
                } finally {
                }
            case 16:
                T0 = ((oll0) obj).T0("SELECT message_version from messages_view WHERE chat_internal_id = ? AND message_id = ?");
                try {
                    T0.b(1, j);
                    T0.g1(2, str);
                    return (!T0.q() || T0.isNull(0)) ? null : Long.valueOf(T0.getLong(0));
                } finally {
                }
            case 17:
                T0 = ((oll0) obj).T0("SELECT data FROM messages_view\n        WHERE original_message_chat_id = ?\n        AND original_message_history_id = ?\n    ");
                try {
                    T0.g1(1, str);
                    T0.b(2, j);
                    return (!T0.q() || T0.isNull(0)) ? null : T0.Y1(0);
                } finally {
                }
            case 18:
                T0 = ((oll0) obj).T0("SELECT author FROM messages_view WHERE chat_internal_id = ? AND message_id = ?");
                try {
                    T0.b(1, j);
                    T0.g1(2, str);
                    return (!T0.q() || T0.isNull(0)) ? null : T0.Y1(0);
                } finally {
                }
            case 19:
                oll0 oll0Var6 = (oll0) obj;
                T0 = oll0Var6.T0("DELETE FROM pending_poll_votes WHERE message_timestamp = ? AND chat_id = ?");
                try {
                    T0.b(1, j);
                    T0.g1(2, str);
                    T0.q();
                    int x5 = jx81.x(oll0Var6);
                    T0.close();
                    return Integer.valueOf(x5);
                } finally {
                }
            case 20:
                oll0 oll0Var7 = (oll0) obj;
                T0 = oll0Var7.T0("DELETE FROM personal_mentions WHERE chat_id = ? AND message_timestamp <= ?");
                try {
                    T0.g1(1, str);
                    T0.b(2, j);
                    T0.q();
                    int x6 = jx81.x(oll0Var7);
                    T0.close();
                    return Integer.valueOf(x6);
                } finally {
                }
            case 21:
                oll0 oll0Var8 = (oll0) obj;
                T0 = oll0Var8.T0("DELETE FROM personal_mentions WHERE chat_id = ? AND message_timestamp = ?");
                try {
                    T0.g1(1, str);
                    T0.b(2, j);
                    T0.q();
                    int x7 = jx81.x(oll0Var8);
                    T0.close();
                    return Integer.valueOf(x7);
                } finally {
                }
            case 22:
                T0 = ((oll0) obj).T0("SELECT count(*) FROM objects_to_share WHERE user_id = ? AND org_id = ? LIMIT 1");
                try {
                    T0.g1(1, str);
                    T0.b(2, j);
                    if (T0.q()) {
                        if (((int) T0.getLong(0)) != 0) {
                            z2 = true;
                            T0.close();
                            return Boolean.valueOf(z2);
                        }
                    }
                    z2 = false;
                    T0.close();
                    return Boolean.valueOf(z2);
                } finally {
                }
            case 23:
                T0 = ((oll0) obj).T0("INSERT INTO stable_chat_internal_id  VALUES(?, ?)");
                try {
                    T0.g1(1, str);
                    T0.b(2, j);
                    T0.q();
                    return zy11Var;
                } finally {
                }
            case 24:
                T0 = ((oll0) obj).T0("SELECT * FROM user_contact_table WHERE user_id=? AND organization_id=?");
                try {
                    T0.g1(1, str);
                    T0.b(2, j);
                    int r = eja1.r(T0, "row_id");
                    int r2 = eja1.r(T0, "user_id");
                    int r3 = eja1.r(T0, "organization_id");
                    int r4 = eja1.r(T0, "type");
                    int r5 = eja1.r(T0, "value");
                    int r6 = eja1.r(T0, "is_legal");
                    ArrayList arrayList = new ArrayList();
                    while (T0.q()) {
                        arrayList.add(new il21(T0.isNull(r) ? null : Long.valueOf(T0.getLong(r)), T0.Y1(r2), T0.getLong(r3), T0.Y1(r4), T0.Y1(r5), ((int) T0.getLong(r6)) != 0));
                    }
                    return arrayList;
                } finally {
                }
            case 25:
                T0 = ((oll0) obj).T0("SELECT * FROM user_employee WHERE user_id=? AND organization_id=?");
                try {
                    T0.g1(1, str);
                    T0.b(2, j);
                    int r7 = eja1.r(T0, "user_id");
                    int r8 = eja1.r(T0, "organization_id");
                    int r9 = eja1.r(T0, "organization_name");
                    int r10 = eja1.r(T0, "department_name");
                    int r11 = eja1.r(T0, "position");
                    int r12 = eja1.r(T0, "is_guest");
                    int r13 = eja1.r(T0, "deleted");
                    int r14 = eja1.r(T0, "guest_organization_name");
                    int r15 = eja1.r(T0, "display_name");
                    ArrayList arrayList2 = new ArrayList();
                    while (T0.q()) {
                        arrayList2.add(new xl21(T0.Y1(r7), T0.getLong(r8), T0.isNull(r9) ? null : T0.Y1(r9), T0.isNull(r10) ? null : T0.Y1(r10), T0.isNull(r11) ? null : T0.Y1(r11), ((int) T0.getLong(r12)) != 0, ((int) T0.getLong(r13)) != 0, T0.isNull(r14) ? null : T0.Y1(r14), T0.isNull(r15) ? null : T0.Y1(r15)));
                    }
                    return arrayList2;
                } finally {
                }
            default:
                T0 = ((oll0) obj).T0("UPDATE workspec SET last_enqueue_time=? WHERE id=?");
                try {
                    T0.b(1, j);
                    T0.g1(2, str);
                    T0.q();
                    return zy11Var;
                } finally {
                }
        }
    }

    public /* synthetic */ qo6(String str, long j, int i) {
        this.a = i;
        this.c = str;
        this.b = j;
    }
}
