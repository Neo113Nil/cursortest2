package defpackage;

import com.yandex.plus.core.benchmark.a0;
import java.io.File;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class w8a implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ w8a(String str) {
        this.a = 1;
        bjk bjkVar = bjk.a;
        this.b = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return hrg.q("DoubleClickConsumer(", this.b, ")");
            case 1:
                return new ey2(this.b, bjk.a);
            case 2:
                String str = this.b;
                str.getClass();
                return new y6b(str);
            case 3:
                e5b e5bVar = e5b.a;
                e5bVar.getClass();
                return new fbv(this.b, e5bVar);
            case 4:
                return new a0(this.b);
            default:
                return new File(this.b, "prefetch");
        }
    }

    public /* synthetic */ w8a(String str, int i) {
        this.a = i;
        this.b = str;
    }
}
