package defpackage;

import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class mp3 extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ Function1 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mp3(int i, Function1 function1) {
        super(1);
        this.r = i;
        this.s = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        long j;
        switch (this.r) {
            case 0:
                opf opfVar = (opf) obj;
                this.s.invoke(opfVar);
                opfVar.a();
                return Unit.a;
            case 1:
                return new wpe((((Number) this.s.invoke(Integer.valueOf((int) (((hqe) obj).a >> 32)))).intValue() << 32) | (0 & 4294967295L));
            case 2:
                return new wpe((0 << 32) | (4294967295L & ((Number) this.s.invoke(Integer.valueOf((int) (((hqe) obj).a & 4294967295L)))).intValue()));
            case 3:
                return new wpe((0 << 32) | (4294967295L & ((Number) this.s.invoke(Integer.valueOf((int) (((hqe) obj).a & 4294967295L)))).intValue()));
            case 4:
                f2r f2rVar = (f2r) obj;
                synchronized (g2r.b) {
                    j = g2r.d;
                    g2r.d = 1 + j;
                }
                return new ekn(j, f2rVar, this.s);
            case 5:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                this.s.invoke(bool);
                return Unit.a;
            case 6:
                List list = (List) obj;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (list.size() % 2 != 0) {
                    xq0.q("non-zero remainder");
                    return null;
                }
                for (int i = 0; i < list.size(); i += 2) {
                    Object obj2 = list.get(i);
                    obj2.getClass();
                    linkedHashMap.put((String) obj2, list.get(i + 1));
                }
                return this.s.invoke(linkedHashMap);
            case 7:
                return this.s.invoke(Long.valueOf(((Number) obj).longValue() / 1000000));
            default:
                throw ouj.g(obj);
        }
    }
}
