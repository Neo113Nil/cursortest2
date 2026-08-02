package bo.app;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class o5 {
    public static final m5 e = new m5();
    public final n5 a;
    public final List b;
    public final ye c;
    public final d9 d;

    public o5(n5 n5Var, List list, ye yeVar, i2 i2Var, int i) {
        list = (i & 2) != 0 ? EmptyList.INSTANCE : list;
        yeVar = (i & 4) != 0 ? null : yeVar;
        i2Var = (i & 8) != 0 ? null : i2Var;
        n5Var.getClass();
        list.getClass();
        this.a = n5Var;
        this.b = list;
        this.c = yeVar;
        this.d = i2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o5)) {
            return false;
        }
        o5 o5Var = (o5) obj;
        return this.a == o5Var.a && Intrinsics.areEqual(this.b, o5Var.b) && Intrinsics.areEqual(this.c, o5Var.c) && Intrinsics.areEqual(this.d, o5Var.d);
    }

    public final int hashCode() {
        int m = Recorder$$ExternalSyntheticOutline2.m(this.a.hashCode() * 31, 31, this.b);
        ye yeVar = this.c;
        int hashCode = (m + (yeVar == null ? 0 : yeVar.a.hashCode())) * 31;
        d9 d9Var = this.d;
        return hashCode + (d9Var != null ? d9Var.hashCode() : 0);
    }

    public final String toString() {
        return "DispatchCommandEvent(commandType=" + this.a + ", brazeEvents=" + this.b + ", sessionId=" + this.c + ", brazeRequest=" + this.d + ")";
    }
}
