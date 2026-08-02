package defpackage;

import com.yandex.messaging.internal.ServerMessageRef;

/* loaded from: classes15.dex */
public final /* synthetic */ class yx10 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long w;
    public final /* synthetic */ long x;
    public final /* synthetic */ String y;

    public /* synthetic */ yx10(long j, long j2, long j3, long j4, String str, int i) {
        this.a = i;
        this.b = j;
        this.c = j2;
        this.w = j3;
        this.x = j4;
        this.y = str;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        ull0 T0;
        int x;
        int i = this.a;
        String str = this.y;
        long j = this.x;
        long j2 = this.w;
        long j3 = this.c;
        long j4 = this.b;
        oll0 oll0Var = (oll0) obj;
        switch (i) {
            case 0:
                T0 = oll0Var.T0("UPDATE OR IGNORE messages\n            SET message_history_id = ?,\n                message_prev_history_id = ?,\n                message_sequence_number = ?\n            WHERE chat_internal_id = ? AND message_id = ?\n            AND message_history_id >= ?");
                try {
                    T0.b(1, j4);
                    T0.b(2, j3);
                    T0.b(3, j2);
                    T0.b(4, j);
                    T0.g1(5, str);
                    T0.b(6, ServerMessageRef.OUTGOING_HISTORY_ID_OFFSET);
                    T0.q();
                    x = jx81.x(oll0Var);
                    T0.close();
                    break;
                } finally {
                }
            default:
                T0 = oll0Var.T0("UPDATE OR IGNORE messages_view SET\n           message_history_id = ?,\n           message_previous_history_id = ?,\n           message_sequence_number = ?\n           WHERE chat_internal_id = ? AND message_id = ?\n           AND message_history_id >= ?");
                try {
                    T0.b(1, j4);
                    T0.b(2, j3);
                    T0.b(3, j2);
                    T0.b(4, j);
                    T0.g1(5, str);
                    T0.b(6, ServerMessageRef.OUTGOING_HISTORY_ID_OFFSET);
                    T0.q();
                    x = jx81.x(oll0Var);
                    break;
                } finally {
                }
        }
        return Integer.valueOf(x);
    }
}
