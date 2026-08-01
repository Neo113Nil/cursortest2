package a7;

import D.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.StringJoiner;
import java.util.function.Function;
import java.util.stream.Collectors;

/* loaded from: classes2.dex */
public final class h implements Function {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f4365a;

    public h(ArrayList arrayList) {
        this.f4365a = arrayList;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        Iterator it = this.f4365a.iterator();
        if (it.hasNext()) {
            throw y.j(it);
        }
        return null;
    }

    public final String toString() {
        StringJoiner stringJoiner = new StringJoiner(", ", "ScopeConfiguratorImpl{", "}");
        stringJoiner.add("conditions=" + ((String) this.f4365a.stream().map(new K6.b(17)).collect(Collectors.joining(",", "[", "]"))));
        return stringJoiner.toString();
    }
}
