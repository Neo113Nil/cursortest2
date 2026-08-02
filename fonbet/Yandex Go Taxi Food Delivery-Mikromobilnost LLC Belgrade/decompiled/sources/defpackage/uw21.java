package defpackage;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import yads.lj0;

/* loaded from: classes7.dex */
public final /* synthetic */ class uw21 implements Comparator {
    public final /* synthetic */ int a;

    public /* synthetic */ uw21(int i) {
        this.a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return ((String) obj).compareToIgnoreCase((String) obj2);
            case 1:
                return Integer.compare(((kw41) obj).a.b, ((kw41) obj2).a.b);
            case 2:
                return Long.compare(((jw41) obj).b, ((jw41) obj2).b);
            case 3:
                return ((az61) obj).a - ((az61) obj2).a;
            case 4:
                return Float.compare(((az61) obj).c, ((az61) obj2).c);
            case 5:
                c871 c871Var = (c871) obj;
                c871 c871Var2 = (c871) obj2;
                long j = c871Var.y;
                String str = c871Var.a;
                long j2 = c871Var2.y;
                String str2 = c871Var2.a;
                if (j - j2 == 0) {
                    if (!str.equals(str2)) {
                        return str.compareTo(str2);
                    }
                    long j3 = c871Var.b - c871Var2.b;
                    if (j3 == 0) {
                        return 0;
                    }
                    if (j3 >= 0) {
                        return 1;
                    }
                } else if (j >= j2) {
                    return 1;
                }
                return -1;
            case 6:
                return s671.c((s671) obj, (s671) obj2);
            case 7:
                s671 s671Var = (s671) obj;
                s671 s671Var2 = (s671) obj2;
                boolean z = s671Var.x;
                int i = s671Var.B;
                f371 a = (z && s671Var.A) ? ba71.i : ba71.i.a();
                return u681.g((s671Var.y.P ? ba71.i.a() : ba71.j).compare(Integer.valueOf(i), Integer.valueOf(s671Var2.B))).d(Integer.valueOf(s671Var.C), Integer.valueOf(s671Var2.C), a).d(Integer.valueOf(i), Integer.valueOf(s671Var2.B), a).a();
            case 8:
                return ((lp61) ((List) obj).get(0)).compareTo((lp61) ((List) obj2).get(0));
            case 9:
                List list = (List) obj;
                List list2 = (List) obj2;
                int i2 = 6;
                int i3 = 7;
                return u681.g(s671.c((s671) Collections.max(list, new uw21(i2)), (s671) Collections.max(list2, new uw21(i2)))).b(list.size(), list2.size()).d((s671) Collections.max(list, new uw21(i3)), (s671) Collections.max(list2, new uw21(i3)), new uw21(i3)).a();
            case 10:
                Integer num = (Integer) obj;
                Integer num2 = (Integer) obj2;
                if (num.intValue() == -1) {
                    return num2.intValue() == -1 ? 0 : -1;
                }
                if (num2.intValue() == -1) {
                    return 1;
                }
                return num.intValue() - num2.intValue();
            case 11:
                f371 f371Var = ba71.i;
                return 0;
            case 12:
                return ((ml81) Collections.max((List) obj)).compareTo((ml81) Collections.max((List) obj2));
            case 13:
                return ((qd81) obj2).A - ((qd81) obj).A;
            case 14:
                ik71 ik71Var = (ik71) obj;
                ik71 ik71Var2 = (ik71) obj2;
                int compare = Integer.compare(ik71Var.c, ik71Var2.c);
                return compare != 0 ? compare : ik71Var.b.compareTo(ik71Var2.b);
            case 15:
                return lj0.a((pg71) obj, (pg71) obj2);
            case 16:
                return Integer.compare(((y281) obj).a.b, ((y281) obj2).a.b);
            case 17:
                return Long.compare(((oz71) obj).b, ((oz71) obj2).b);
            default:
                return Integer.compare(((q291) obj2).b, ((q291) obj).b);
        }
    }
}
