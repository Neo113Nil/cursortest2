package defpackage;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import androidx.room.util.a;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

/* loaded from: classes15.dex */
public final class wxj0 extends uxj0 {
    public final RoomDatabase a;
    public final x7b0 b = new x7b0(5);

    public wxj0(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
    }

    @Override // defpackage.uxj0
    public final void a() {
        a.b(this.a, false, true, new nqi0(12));
    }

    @Override // defpackage.uxj0
    public final List b() {
        return (List) a.b(this.a, true, false, new nqi0(13));
    }

    @Override // defpackage.uxj0
    public final Cursor c() {
        TreeMap treeMap = iwk0.B;
        return this.a.O0(udq0.e(0, "SELECT user_id, blacklisted FROM restrictions"));
    }

    @Override // defpackage.uxj0
    public final void d(ArrayList arrayList) {
        a.b(this.a, false, true, new vxj0(0, this, arrayList));
    }

    @Override // defpackage.uxj0
    public final boolean e(String str) {
        return ((Boolean) a.b(this.a, true, false, new dcc0(str, 16))).booleanValue();
    }
}
