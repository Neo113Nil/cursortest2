package defpackage;

import java.util.Collections;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;

/* loaded from: classes9.dex */
public final class u6e implements je60 {
    public final String a;

    public u6e(String str) {
        this.a = str;
    }

    @Override // defpackage.s7s
    public final m9s a() {
        return new vwd();
    }

    @Override // defpackage.s7s
    public final wf90 b() {
        List j;
        String str;
        String str2 = this.a;
        int length = str2.length();
        EmptyList emptyList = EmptyList.a;
        if (length == 0) {
            j = emptyList;
        } else {
            ListBuilder a = rcc.a();
            String str3 = "";
            if (d6z.K(str2.charAt(0))) {
                int length2 = str2.length();
                int i = 0;
                while (true) {
                    if (i >= length2) {
                        str = str2;
                        break;
                    }
                    if (!d6z.K(str2.charAt(i))) {
                        str = str2.substring(0, i);
                        break;
                    }
                    i++;
                }
                a.add(new gn60(Collections.singletonList(new v6e(str))));
                int length3 = str2.length();
                int i2 = 0;
                while (true) {
                    if (i2 >= length3) {
                        str2 = "";
                        break;
                    }
                    if (!d6z.K(str2.charAt(i2))) {
                        str2 = str2.substring(i2);
                        break;
                    }
                    i2++;
                }
            }
            if (str2.length() > 0) {
                if (d6z.K(str2.charAt(str2.length() - 1))) {
                    int C = evu0.C(str2);
                    while (true) {
                        if (-1 >= C) {
                            break;
                        }
                        if (!d6z.K(str2.charAt(C))) {
                            str3 = str2.substring(0, C + 1);
                            break;
                        }
                        C--;
                    }
                    a.add(new hhc0(str3));
                    int C2 = evu0.C(str2);
                    while (true) {
                        if (-1 >= C2) {
                            break;
                        }
                        if (!d6z.K(str2.charAt(C2))) {
                            str2 = str2.substring(C2 + 1);
                            break;
                        }
                        C2--;
                    }
                    a.add(new gn60(Collections.singletonList(new v6e(str2))));
                } else {
                    a.add(new hhc0(str2));
                }
            }
            j = a.j();
        }
        return new wf90(j, emptyList);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof u6e) {
            return jl40.l(this.a, ((u6e) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return b64.p(new StringBuilder("ConstantFormatStructure("), this.a, ')');
    }
}
