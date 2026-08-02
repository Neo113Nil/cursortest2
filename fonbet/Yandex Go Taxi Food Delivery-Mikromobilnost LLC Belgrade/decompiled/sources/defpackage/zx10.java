package defpackage;

/* loaded from: classes15.dex */
public final /* synthetic */ class zx10 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long w;

    public /* synthetic */ zx10(long j, long j2, String str, int i) {
        this.a = i;
        this.c = j;
        this.w = j2;
        this.b = str;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        ull0 T0;
        int i = this.a;
        String str = this.b;
        long j = this.w;
        long j2 = this.c;
        switch (i) {
            case 0:
                T0 = ((oll0) obj).T0("SELECT msg_internal_id, flags FROM messages WHERE message_id = ? AND chat_internal_id = ? AND message_history_id >= ?");
                try {
                    T0.g1(1, str);
                    T0.b(2, j2);
                    T0.b(3, j);
                    return T0.q() ? new ey10(T0.getLong(0), T0.getLong(1)) : null;
                } finally {
                }
            case 1:
                oll0 oll0Var = (oll0) obj;
                T0 = oll0Var.T0("UPDATE messages SET data = ? WHERE chat_internal_id = ? AND message_history_id = ?");
                try {
                    T0.g1(1, str);
                    T0.b(2, j2);
                    T0.b(3, j);
                    T0.q();
                    int x = jx81.x(oll0Var);
                    T0.close();
                    return Integer.valueOf(x);
                } finally {
                }
            case 2:
                oll0 oll0Var2 = (oll0) obj;
                T0 = oll0Var2.T0("INSERT INTO sticker_panel_pack_view\n              SELECT ?, sticker_pack_cover_id, sticker_pack_title, sticker_pack_id, sticker_pack_description, ?\n              FROM sticker_pack_list\n              WHERE sticker_pack_id=?");
                try {
                    T0.b(1, j2);
                    T0.b(2, j);
                    T0.g1(3, str);
                    T0.q();
                    long t = jx81.t(oll0Var2);
                    T0.close();
                    return Long.valueOf(t);
                } finally {
                }
            case 3:
                oll0 oll0Var3 = (oll0) obj;
                T0 = oll0Var3.T0("INSERT INTO sticker_panel_sticker_view\n           SELECT ?, sticker_pack_id, sticker_pack_id, ?, sticker_pack_title, NULL, NULL\n           FROM sticker_pack_list\n           WHERE sticker_pack_id=?");
                try {
                    T0.b(1, j2);
                    T0.b(2, j);
                    T0.g1(3, str);
                    T0.q();
                    long t2 = jx81.t(oll0Var3);
                    T0.close();
                    return Long.valueOf(t2);
                } finally {
                }
            default:
                oll0 oll0Var4 = (oll0) obj;
                T0 = oll0Var4.T0("INSERT INTO sticker_panel_sticker_view\n           SELECT sticker_position+?, sticker_pack_id, sticker_original_pack_id, ?, NULL, sticker_text, sticker_id\n           FROM sticker_list\n           WHERE sticker_pack_id=?");
                try {
                    T0.b(1, j2);
                    T0.b(2, j);
                    T0.g1(3, str);
                    T0.q();
                    long t3 = jx81.t(oll0Var4);
                    T0.close();
                    return Long.valueOf(t3);
                } finally {
                }
        }
    }

    public /* synthetic */ zx10(String str, long j, long j2, int i) {
        this.a = i;
        this.b = str;
        this.c = j;
        this.w = j2;
    }
}
