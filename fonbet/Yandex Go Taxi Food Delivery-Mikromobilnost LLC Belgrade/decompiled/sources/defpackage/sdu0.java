package defpackage;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import androidx.room.util.a;
import java.util.TreeMap;

/* loaded from: classes15.dex */
public final class sdu0 extends rdu0 {
    public final RoomDatabase a;

    public sdu0(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
    }

    public static void j(sdu0 sdu0Var, String[] strArr) {
        super.i(strArr);
    }

    @Override // defpackage.rdu0
    public final void a() {
        a.b(this.a, false, true, new x8t0(17));
    }

    @Override // defpackage.rdu0
    public final void b() {
        a.b(this.a, false, true, new x8t0(18));
    }

    @Override // defpackage.rdu0
    public final Cursor c() {
        TreeMap treeMap = iwk0.B;
        return this.a.O0(udq0.e(0, "SELECT sticker_item_position,\n                  sticker_pack_cover_id,\n                  sticker_item_position_in_panel,\n                  sticker_pack_id,\n                  sticker_pack_title,\n                  sticker_pack_description\n           FROM sticker_panel_pack_view\n           ORDER BY sticker_item_position ASC"));
    }

    @Override // defpackage.rdu0
    public final Cursor d() {
        TreeMap treeMap = iwk0.B;
        return this.a.O0(udq0.e(0, "SELECT sticker_item_position,\n                  sticker_original_pack_id,\n                  sticker_header,\n                  sticker_id,\n                  sticker_text,\n                  sticker_pack_position\n           FROM sticker_panel_sticker_view\n           ORDER BY sticker_item_position ASC"));
    }

    @Override // defpackage.rdu0
    public final int e(String str) {
        return ((Number) a.b(this.a, true, false, new g8r0(str, 14))).intValue();
    }

    @Override // defpackage.rdu0
    public final long f(long j, long j2, String str) {
        return ((Number) a.b(this.a, false, true, new zx10(j2, j, str, 2))).longValue();
    }

    @Override // defpackage.rdu0
    public final long g(long j, long j2, String str) {
        return ((Number) a.b(this.a, false, true, new zx10(j, j2, str, 3))).longValue();
    }

    @Override // defpackage.rdu0
    public final long h(long j, long j2, String str) {
        return ((Number) a.b(this.a, false, true, new zx10(j, j2, str, 4))).longValue();
    }

    @Override // defpackage.rdu0
    public final void i(String[] strArr) {
        a.b(this.a, false, true, new scs0(24, this, strArr));
    }
}
