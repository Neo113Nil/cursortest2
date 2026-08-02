package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class p3i {
    public final int a;
    public final LinkedHashMap b = new LinkedHashMap();
    public int c;

    public p3i(int i) {
        this.a = i;
    }

    public final LinkedHashMap a() {
        String obj;
        int i = this.c;
        int i2 = this.a;
        LinkedHashMap linkedHashMap = this.b;
        if (i <= i2) {
            return linkedHashMap;
        }
        LinkedHashMap q = uah.q(linkedHashMap);
        for (Map.Entry entry : CollectionsKt.j0(linkedHashMap.entrySet())) {
            String str = (String) entry.getKey();
            t3i t3iVar = (t3i) entry.getValue();
            if (i <= i2) {
                break;
            }
            int length = str.length();
            Object value = t3iVar.getValue();
            i -= (length + ((value == null || (obj = value.toString()) == null) ? 4 : obj.length())) + 4;
            q.remove(str);
        }
        return q;
    }

    public final void b(rjp rjpVar, String str) {
        String str2 = (String) rjpVar.a;
        int i = this.a;
        if (i == Integer.MAX_VALUE) {
            d(str, str2);
            return;
        }
        int length = str.length() + 6;
        int length2 = str2.length() + length;
        int i2 = this.c;
        int i3 = length2 + i2;
        LinkedHashMap linkedHashMap = this.b;
        if (i3 <= i) {
            this.c = i3;
            linkedHashMap.put(str, new s3i(str2));
            return;
        }
        int i4 = (i - i2) - length;
        if (i4 < 0) {
            i4 = 0;
        }
        String str3 = (String) ((Function1) rjpVar.b).invoke(Integer.valueOf(i4));
        this.c = str3.length() + length + this.c;
        linkedHashMap.put(str, new s3i(str3));
    }

    public final void c(Number number, String str) {
        int i = this.c;
        int length = str.length();
        String obj = number.toString();
        this.c = length + (obj != null ? obj.length() : 4) + 4 + i;
        this.b.put(str, new r3i(number));
    }

    public final void d(String str, String str2) {
        str2.getClass();
        this.c = str2.length() + str.length() + 6 + this.c;
        this.b.put(str, new s3i(str2));
    }

    public final void e(String str, boolean z) {
        this.c = str.length() + 9 + this.c;
        this.b.put(str, new q3i(z));
    }
}
