package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class u3t implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ List d;

    public /* synthetic */ u3t(int i, String str, String str2, List list) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = list;
    }

    /* JADX WARN: Finally extract failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                String str = this.c;
                List list = this.d;
                xjo xjoVar = (xjo) obj;
                xjoVar.getClass();
                cko D0 = xjoVar.D0(this.b);
                try {
                    D0.E(1, str);
                    Iterator it = list.iterator();
                    int i = 2;
                    while (it.hasNext()) {
                        D0.E(i, (String) it.next());
                        i++;
                    }
                    D0.q();
                    D0.close();
                    return Unit.a;
                } catch (Throwable th) {
                    D0.close();
                    throw th;
                }
            default:
                String str2 = this.c;
                List list2 = this.d;
                xjo xjoVar2 = (xjo) obj;
                xjoVar2.getClass();
                cko D02 = xjoVar2.D0(this.b);
                try {
                    D02.E(1, str2);
                    Iterator it2 = list2.iterator();
                    int i2 = 2;
                    while (it2.hasNext()) {
                        D02.bindLong(i2, ((Number) it2.next()).longValue());
                        i2++;
                    }
                    D02.q();
                    D02.close();
                    return Unit.a;
                } catch (Throwable th2) {
                    D02.close();
                    throw th2;
                }
        }
    }
}
