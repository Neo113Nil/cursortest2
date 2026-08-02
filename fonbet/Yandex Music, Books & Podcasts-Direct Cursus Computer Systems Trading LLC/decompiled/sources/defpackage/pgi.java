package defpackage;

import java.util.ArrayList;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class pgi extends uif implements Function0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ dn9 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pgi(dn9 dn9Var, int i) {
        super(0);
        this.r = i;
        this.s = dn9Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object obj;
        Object obj2;
        switch (this.r) {
            case 0:
                ArrayList arrayList = (ArrayList) this.s.f;
                if (arrayList.isEmpty()) {
                    obj = null;
                } else {
                    Object obj3 = arrayList.get(0);
                    float c = ((u5k) obj3).a.i.c();
                    int i = 1;
                    int size = arrayList.size() - 1;
                    if (1 <= size) {
                        while (true) {
                            Object obj4 = arrayList.get(i);
                            float c2 = ((u5k) obj4).a.i.c();
                            if (Float.compare(c, c2) < 0) {
                                obj3 = obj4;
                                c = c2;
                            }
                            if (i != size) {
                                i++;
                            }
                        }
                    }
                    obj = obj3;
                }
                u5k u5kVar = (u5k) obj;
                return Float.valueOf(u5kVar != null ? u5kVar.a.i.c() : 0.0f);
            default:
                ArrayList arrayList2 = (ArrayList) this.s.f;
                if (arrayList2.isEmpty()) {
                    obj2 = null;
                } else {
                    Object obj5 = arrayList2.get(0);
                    float c3 = ((u5k) obj5).a.c();
                    int i2 = 1;
                    int size2 = arrayList2.size() - 1;
                    if (1 <= size2) {
                        while (true) {
                            Object obj6 = arrayList2.get(i2);
                            float c4 = ((u5k) obj6).a.c();
                            if (Float.compare(c3, c4) < 0) {
                                obj5 = obj6;
                                c3 = c4;
                            }
                            if (i2 != size2) {
                                i2++;
                            }
                        }
                    }
                    obj2 = obj5;
                }
                u5k u5kVar2 = (u5k) obj2;
                return Float.valueOf(u5kVar2 != null ? u5kVar2.a.c() : 0.0f);
        }
    }
}
