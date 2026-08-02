package defpackage;

import android.content.Context;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class zfi0 {
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public List e;

    public zfi0(Context context) {
        int i = wwg0.msg_ic_stickers_recent;
        String string = context.getString(oyh0.recents_sticker_title);
        this.a = i;
        this.b = "local/recent";
        this.c = "recent";
        this.d = string;
        this.e = EmptyList.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zfi0)) {
            return false;
        }
        zfi0 zfi0Var = (zfi0) obj;
        return this.a == zfi0Var.a && jl40.l(this.b, zfi0Var.b) && jl40.l(this.c, zfi0Var.c) && jl40.l(this.d, zfi0Var.d) && jl40.l(this.e, zfi0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + unr0.b(unr0.b(unr0.b(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        List list = this.e;
        StringBuilder v = unr0.v(this.a, "RecentPackData(coverResId=", ", coverId=", this.b, ", packId=");
        g8e.D(v, this.c, ", title=", this.d, ", stickers=");
        return ly3.s(v, list, Extension.C_BRAKE);
    }
}
