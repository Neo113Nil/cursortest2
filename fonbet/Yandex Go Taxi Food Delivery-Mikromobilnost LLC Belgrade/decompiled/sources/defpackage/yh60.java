package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.a;

/* loaded from: classes15.dex */
public final class yh60 {
    public final long[] a;
    public final boolean b;
    public final m5g0 c;
    public final String d;
    public final long e;

    public yh60(long[] jArr, boolean z, m5g0 m5g0Var, String str) {
        Long valueOf;
        this.a = jArr;
        this.b = z;
        this.c = m5g0Var;
        this.d = str;
        if (jArr.length == 0) {
            valueOf = null;
        } else {
            long j = jArr[0];
            int i = 1;
            int length = jArr.length - 1;
            if (1 <= length) {
                while (true) {
                    long j2 = jArr[i];
                    j = j < j2 ? j2 : j;
                    if (i == length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
            valueOf = Long.valueOf(j);
        }
        this.e = valueOf != null ? valueOf.longValue() : -1L;
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putLongArray("message_timestamps", this.a);
        bundle.putBoolean("is_inapp", this.b);
        bundle.putString("override_url", this.d);
        m5g0 m5g0Var = this.c;
        if (m5g0Var != null) {
            bundle.putAll(m5g0Var.a());
        }
        return bundle;
    }

    public /* synthetic */ yh60(int i) {
        this(new long[0], false, (m5g0) null, (String) null);
    }

    public yh60() {
        this(0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public yh60(List list, boolean z, m5g0 m5g0Var, String str) {
        this(a.K0(r0), z, m5g0Var, str);
        List list2 = list;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(((ii60) it.next()).b));
        }
    }
}
