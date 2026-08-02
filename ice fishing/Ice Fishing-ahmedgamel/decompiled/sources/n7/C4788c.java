package n7;

import F.n;
import a7.l;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;

/* renamed from: n7.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4788c {

    /* renamed from: b, reason: collision with root package name */
    public static final Logger f39673b = Logger.getLogger(C4788c.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final List f39674a;

    public C4788c(List list, n nVar) {
        new l(f39673b);
        List list2 = (List) list.stream().map(new K6.b(27)).collect(Collectors.toList());
        this.f39674a = list2;
        if (list2.size() == 0) {
            throw new IllegalStateException("Callback with no instruments is not allowed");
        }
        list.stream().flatMap(new K6.b(28)).findAny().isPresent();
    }

    public final String toString() {
        return "CallbackRegistration{instrumentDescriptors=" + this.f39674a + "}";
    }
}
