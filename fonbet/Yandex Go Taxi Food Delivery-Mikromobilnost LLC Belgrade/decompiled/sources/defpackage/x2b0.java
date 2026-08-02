package defpackage;

import androidx.room.RoomDatabase;
import androidx.room.util.a;
import java.util.List;

/* loaded from: classes15.dex */
public final class x2b0 extends v2b0 {
    public final RoomDatabase a;

    public x2b0(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
    }

    public static void h(x2b0 x2b0Var, String str, String str2, byte[] bArr) {
        super.f(str, str2, bArr);
    }

    @Override // defpackage.v2b0
    public final int a(String str, String str2) {
        return ((Number) a.b(this.a, false, true, new r(str, str2, 22))).intValue();
    }

    @Override // defpackage.v2b0
    public final boolean b(String str, String str2) {
        return ((Boolean) a.b(this.a, true, false, new r(str, str2, 20))).booleanValue();
    }

    @Override // defpackage.v2b0
    public final byte[] c(String str, String str2) {
        return (byte[]) a.b(this.a, true, false, new r(str, str2, 21));
    }

    @Override // defpackage.v2b0
    public final List d(String str) {
        return (List) a.b(this.a, true, false, new my30(str, 23));
    }

    @Override // defpackage.v2b0
    public final long e(String str, String str2, byte[] bArr) {
        return ((Number) a.b(this.a, false, true, new w2b0(str, str2, bArr))).longValue();
    }

    @Override // defpackage.v2b0
    public final void f(String str, String str2, byte[] bArr) {
        a.b(this.a, false, true, new vqy(this, str, str2, bArr, 13));
    }

    @Override // defpackage.v2b0
    public final int g(String str, String str2, byte[] bArr) {
        return ((Number) a.b(this.a, false, true, new w2b0(bArr, str, str2))).intValue();
    }
}
