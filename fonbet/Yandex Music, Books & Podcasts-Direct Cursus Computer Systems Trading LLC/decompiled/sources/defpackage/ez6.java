package defpackage;

import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.ranges.IntRange;

/* loaded from: classes4.dex */
public final class ez6 {
    public final /* synthetic */ int a = 0;
    public int b;
    public Object c;

    public ez6(int i, Object obj) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    public void a() {
        Iterator it = CollectionsKt.m0(this.c, new IntRange(0, this.c.size() - 2, 1)).iterator();
        while (it.hasNext()) {
            ((pv8) it.next()).setState(lv8.c);
        }
    }

    public String toString() {
        switch (this.a) {
            case 1:
                StringBuffer stringBuffer = new StringBuffer();
                switch (this.b) {
                    case -1:
                        stringBuffer.append("END OF FILE");
                        break;
                    case 0:
                        stringBuffer.append("VALUE(");
                        stringBuffer.append(this.c);
                        stringBuffer.append(")");
                        break;
                    case 1:
                        stringBuffer.append("LEFT BRACE({)");
                        break;
                    case 2:
                        stringBuffer.append("RIGHT BRACE(})");
                        break;
                    case 3:
                        stringBuffer.append("LEFT SQUARE([)");
                        break;
                    case 4:
                        stringBuffer.append("RIGHT SQUARE(])");
                        break;
                    case 5:
                        stringBuffer.append("COMMA(,)");
                        break;
                    case 6:
                        stringBuffer.append("COLON(:)");
                        break;
                }
                return stringBuffer.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ ez6() {
    }
}
