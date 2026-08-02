package defpackage;

import com.yandex.mapkit.Time;
import com.yandex.messaging.internal.ServerMessageRef;
import java.util.ArrayList;
import kotlin.time.DurationUnit;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes12.dex */
public final /* synthetic */ class vh10 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;

    public /* synthetic */ vh10(long j, int i) {
        this.a = i;
        this.b = j;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Long l = null;
        boolean z = false;
        z = false;
        long j = this.b;
        switch (i) {
            case 0:
                oll0 oll0Var = (oll0) obj;
                ull0 T0 = oll0Var.T0("DELETE FROM members WHERE internal_chat_id = ?");
                try {
                    T0.b(1, j);
                    T0.q();
                    int x = jx81.x(oll0Var);
                    T0.close();
                    return Integer.valueOf(x);
                } finally {
                }
            case 1:
                oll0 oll0Var2 = (oll0) obj;
                ull0 T02 = oll0Var2.T0("\n        DELETE FROM message_translations\n        WHERE chat_internal_id=?\n        ");
                try {
                    T02.b(1, j);
                    T02.q();
                    int x2 = jx81.x(oll0Var2);
                    T02.close();
                    return Integer.valueOf(x2);
                } finally {
                }
            case 2:
                ull0 T03 = ((oll0) obj).T0("SELECT message_history_id FROM messages WHERE chat_internal_id = ? ORDER BY message_history_id ASC LIMIT 1");
                try {
                    T03.b(1, j);
                    if (T03.q() && !T03.isNull(0)) {
                        l = Long.valueOf(T03.getLong(0));
                    }
                    return l;
                } finally {
                }
            case 3:
                oll0 oll0Var3 = (oll0) obj;
                ull0 T04 = oll0Var3.T0("DELETE FROM messages WHERE chat_internal_id = ?");
                try {
                    T04.b(1, j);
                    T04.q();
                    int x3 = jx81.x(oll0Var3);
                    T04.close();
                    return Integer.valueOf(x3);
                } finally {
                }
            case 4:
                ull0 T05 = ((oll0) obj).T0("SELECT message_history_id FROM messages_view WHERE chat_internal_id = ? ORDER BY message_history_id ASC LIMIT 1");
                try {
                    T05.b(1, j);
                    if (T05.q() && !T05.isNull(0)) {
                        l = Long.valueOf(T05.getLong(0));
                    }
                    return l;
                } finally {
                }
            case 5:
                oll0 oll0Var4 = (oll0) obj;
                ull0 T06 = oll0Var4.T0("DELETE FROM messages_view WHERE chat_internal_id = ?");
                try {
                    T06.b(1, j);
                    T06.q();
                    int x4 = jx81.x(oll0Var4);
                    T06.close();
                    return Integer.valueOf(x4);
                } finally {
                }
            case 6:
                ull0 T07 = ((oll0) obj).T0("SELECT message_history_id FROM messages_view WHERE host_message_history_id = ?");
                try {
                    T07.b(1, j);
                    ArrayList arrayList = new ArrayList();
                    while (T07.q()) {
                        arrayList.add(Long.valueOf(T07.getLong(0)));
                    }
                    return arrayList;
                } finally {
                }
            case 7:
                ull0 T08 = ((oll0) obj).T0("SELECT count(*) FROM messages_view WHERE msg_internal_id = ?");
                try {
                    T08.b(1, j);
                    if (T08.q()) {
                        if (((int) T08.getLong(0)) != 0) {
                            z = true;
                        }
                    }
                    T08.close();
                    return Boolean.valueOf(z);
                } finally {
                }
            case 8:
                ull0 T09 = ((oll0) obj).T0("SELECT message_sequence_number FROM messages_view WHERE chat_internal_id = ?\n           AND message_sequence_number > 0 ORDER BY message_history_id DESC LIMIT 1");
                try {
                    T09.b(1, j);
                    if (T09.q() && !T09.isNull(0)) {
                        l = Long.valueOf(T09.getLong(0));
                    }
                    return l;
                } finally {
                }
            case 9:
                ull0 T010 = ((oll0) obj).T0("SELECT IFNULL(host_message_history_id, message_history_id)\n           FROM messages_view\n           WHERE message_history_id < ? AND chat_internal_id = ?\n           ORDER BY message_history_id DESC LIMIT 1");
                try {
                    T010.b(1, ServerMessageRef.OUTGOING_HISTORY_ID_OFFSET);
                    T010.b(2, j);
                    if (T010.q() && !T010.isNull(0)) {
                        l = Long.valueOf(T010.getLong(0));
                    }
                    return l;
                } finally {
                }
            case 10:
                ull0 T011 = ((oll0) obj).T0("SELECT message_history_id FROM messages_view WHERE chat_internal_id = ?\n           AND message_sequence_number > 0 ORDER BY message_history_id DESC LIMIT 1");
                try {
                    T011.b(1, j);
                    if (T011.q() && !T011.isNull(0)) {
                        l = Long.valueOf(T011.getLong(0));
                    }
                    return l;
                } finally {
                }
            case 11:
                ull0 T012 = ((oll0) obj).T0("SELECT message_previous_history_id FROM messages_view WHERE chat_internal_id = ?\n           AND message_sequence_number > 0 ORDER BY message_history_id DESC LIMIT 1");
                try {
                    T012.b(1, j);
                    if (T012.q() && !T012.isNull(0)) {
                        l = Long.valueOf(T012.getLong(0));
                    }
                    return l;
                } finally {
                }
            case 12:
                o430 o430Var = e3n.b;
                return Boolean.valueOf(e3n.e(kp50.V(((Time) obj).getValue(), DurationUnit.SECONDS)) >= j);
            case 13:
                o430 o430Var2 = e3n.b;
                return Long.valueOf(e3n.o(kp50.V(e3n.e(kp50.V(((Time) obj).getValue(), DurationUnit.SECONDS)) - j, DurationUnit.MILLISECONDS), DurationUnit.MINUTES));
            case 14:
                c1y c1yVar = (c1y) obj;
                c1yVar.a();
                qam.t0(c1yVar, this.b, 0L, 0L, 0.0f, null, HProv.PP_DELETE_SAVED_PASSWD);
                return zy11Var;
            case 15:
                qam qamVar = (qam) obj;
                long floatToRawIntBits = (Float.floatToRawIntBits(qamVar.w0(4.0f)) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (Float.floatToRawIntBits(qamVar.w0(4.0f)) << 32);
                qamVar.c();
                qam.t0(qamVar, this.b, floatToRawIntBits, (Float.floatToRawIntBits(Float.intBitsToFloat((int) (qamVar.c() >> 32)) - qamVar.w0(8.0f)) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (qamVar.c() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) - qamVar.w0(8.0f)) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD), 0.0f, null, 120);
                return zy11Var;
            case 16:
                ull0 T013 = ((oll0) obj).T0("SELECT count FROM participants_count WHERE chat_internal_id = ?");
                try {
                    T013.b(1, j);
                    if (T013.q() && !T013.isNull(0)) {
                        l = Long.valueOf(T013.getLong(0));
                    }
                    return l;
                } finally {
                }
            case 17:
                return Boolean.valueOf(((sk90) obj).d < j);
            case 18:
                ull0 T014 = ((oll0) obj).T0("\n        SELECT COUNT(32) FROM personal_mentions\n            LEFT JOIN threads_view ON threads_view.thread_id=personal_mentions.chat_id\n            LEFT JOIN chat_organization_cross_ref ON threads_view.parent_internal_id=chat_organization_cross_ref.chat_internal_id\n        WHERE is_thread=1 AND threads_view.is_member=1 AND coalesce(chat_organization_cross_ref.organization_id, 0)=?");
                try {
                    T014.b(1, j);
                    int i2 = T014.q() ? (int) T014.getLong(0) : 0;
                    T014.close();
                    return Integer.valueOf(i2);
                } finally {
                }
            case 19:
                ull0 T015 = ((oll0) obj).T0("\n        SELECT COUNT(32) FROM personal_mentions\n            LEFT JOIN chats_view ON chats_view.chat_id=personal_mentions.chat_id\n            LEFT JOIN chat_organization_cross_ref ON chats_view.chat_internal_id=chat_organization_cross_ref.chat_internal_id\n        WHERE is_thread=0\n            AND chats_view.is_member=1\n            AND coalesce(chat_organization_cross_ref.organization_id, 0)=?");
                try {
                    T015.b(1, j);
                    int i3 = T015.q() ? (int) T015.getLong(0) : 0;
                    T015.close();
                    return Integer.valueOf(i3);
                } finally {
                }
            case 20:
                ull0 T016 = ((oll0) obj).T0("SELECT timestamp FROM pinned_messages WHERE chat_internal_id = ? UNION SELECT 0 ORDER BY 1 DESC LIMIT 1");
                try {
                    T016.b(1, j);
                    long j2 = T016.q() ? T016.getLong(0) : 0L;
                    T016.close();
                    return Long.valueOf(j2);
                } finally {
                }
            case 21:
                return Boolean.valueOf(j - ((Long) obj).longValue() > 60000);
            case 22:
                oll0 oll0Var5 = (oll0) obj;
                ull0 T017 = oll0Var5.T0("UPDATE revisions SET max_history_version = ?");
                try {
                    T017.b(1, j);
                    T017.q();
                    int x5 = jx81.x(oll0Var5);
                    T017.close();
                    return Integer.valueOf(x5);
                } finally {
                }
            case 23:
                oll0 oll0Var6 = (oll0) obj;
                ull0 T018 = oll0Var6.T0("UPDATE revisions SET last_thread_message_timestamp = ?");
                try {
                    T018.b(1, j);
                    T018.q();
                    int x6 = jx81.x(oll0Var6);
                    T018.close();
                    return Integer.valueOf(x6);
                } finally {
                }
            case 24:
                oll0 oll0Var7 = (oll0) obj;
                ull0 T019 = oll0Var7.T0("UPDATE revisions SET contacts_last_version = ?");
                try {
                    T019.b(1, j);
                    T019.q();
                    int x7 = jx81.x(oll0Var7);
                    T019.close();
                    return Integer.valueOf(x7);
                } finally {
                }
            case 25:
                oll0 oll0Var8 = (oll0) obj;
                ull0 T020 = oll0Var8.T0("UPDATE revisions SET max_role_version = ?");
                try {
                    T020.b(1, j);
                    T020.q();
                    int x8 = jx81.x(oll0Var8);
                    T020.close();
                    return Integer.valueOf(x8);
                } finally {
                }
            case 26:
                oll0 oll0Var9 = (oll0) obj;
                ull0 T021 = oll0Var9.T0("UPDATE revisions SET last_message_timestamp = ?");
                try {
                    T021.b(1, j);
                    T021.q();
                    int x9 = jx81.x(oll0Var9);
                    T021.close();
                    return Integer.valueOf(x9);
                } finally {
                }
            case 27:
                qam qamVar2 = (qam) obj;
                qamVar2.h(this.b, (Float.floatToRawIntBits(Float.intBitsToFloat((int) (qamVar2.P() >> 32))) << 32) | (Float.floatToRawIntBits(0.0f) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD), (Float.floatToRawIntBits(Float.intBitsToFloat((int) (qamVar2.P() >> 32))) << 32) | (_Gost_CryptoPro_PrivateKeyValues.maxDWORD & Float.floatToRawIntBits(Float.intBitsToFloat((int) (qamVar2.c() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)))), qamVar2.w0(r5l0.b), (r21 & 16) != 0 ? 0 : 0, (r21 & 32) != 0 ? null : null);
                return zy11Var;
            case 28:
                qam.z((qam) obj, this.b, 0.0f, 0L, 0.0f, null, 0, HProv.PP_DELETE_SAVED_PASSWD);
                return zy11Var;
            default:
                ull0 T022 = ((oll0) obj).T0("\n        SELECT SUM(threads_view.unseen)\n        FROM threads_view\n        LEFT JOIN chat_organization_cross_ref ON threads_view.parent_internal_id=chat_organization_cross_ref.chat_internal_id\n        WHERE threads_view.is_hidden=0 AND coalesce(chat_organization_cross_ref.organization_id, 0)=?\n        LIMIT 1\n    ");
                try {
                    T022.b(1, j);
                    int i4 = T022.q() ? (int) T022.getLong(0) : 0;
                    T022.close();
                    return Integer.valueOf(i4);
                } finally {
                }
        }
    }
}
