package defpackage;

import com.yandex.pulse.metrics.o;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final /* synthetic */ class g1j implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function0 b;

    public /* synthetic */ g1j(int i, Function0 function0) {
        this.a = i;
        this.b = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                this.b.invoke();
                return Unit.a;
            case 1:
                this.b.invoke();
                return Boolean.TRUE;
            case 2:
                this.b.invoke();
                return Boolean.TRUE;
            case 3:
                this.b.invoke();
                return Boolean.TRUE;
            case 4:
                this.b.invoke();
                return Unit.a;
            case 5:
                this.b.invoke();
                return Unit.a;
            case 6:
                Boolean bool = (Boolean) this.b.invoke();
                bool.booleanValue();
                return bool;
            case 7:
                return Boolean.valueOf(((Number) this.b.invoke()).floatValue() > 0.0f);
            case 8:
                this.b.invoke();
                return Unit.a;
            case 9:
                return Boolean.valueOf(((Number) this.b.invoke()).floatValue() > 0.0f);
            case 10:
                return Boolean.valueOf(((Number) this.b.invoke()).floatValue() > 0.0f);
            case 11:
                this.b.invoke();
                return Unit.a;
            case 12:
                return Float.valueOf(((Number) this.b.invoke()).floatValue());
            case 13:
                this.b.invoke();
                return Unit.a;
            case 14:
                this.b.invoke();
                return Unit.a;
            case 15:
                this.b.invoke();
                return Unit.a;
            case 16:
                this.b.invoke();
                return Unit.a;
            case 17:
                this.b.invoke();
                return Unit.a;
            case 18:
                this.b.invoke();
                return Unit.a;
            case 19:
                this.b.invoke();
                return Unit.a;
            case 20:
                Iterable iterable = (Iterable) this.b.invoke();
                ArrayList arrayList = new ArrayList(v75.o(iterable, 10));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((mqs) it.next()).a);
                }
                return arrayList;
            case 21:
                this.b.invoke();
                return Unit.a;
            case 22:
                this.b.invoke();
                return Boolean.TRUE;
            case 23:
                this.b.invoke();
                return Boolean.TRUE;
            case 24:
                this.b.invoke();
                return Boolean.TRUE;
            case 25:
                this.b.invoke();
                return Boolean.TRUE;
            case 26:
                return Float.valueOf(((Number) this.b.invoke()).floatValue());
            case 27:
                return Float.valueOf(((Number) this.b.invoke()).floatValue());
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                this.b.invoke();
                return Unit.a;
            default:
                return Float.valueOf(kct.e.b(((Number) this.b.invoke()).floatValue()));
        }
    }
}
