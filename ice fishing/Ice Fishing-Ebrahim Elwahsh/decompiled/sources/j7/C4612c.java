package j7;

import W6.l;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;

/* renamed from: j7.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4612c {

    /* renamed from: b, reason: collision with root package name */
    public static final Logger f38583b = Logger.getLogger(C4612c.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final List f38584a;

    public C4612c(List list, D5.b bVar) {
        new l(f38583b);
        List list2 = (List) list.stream().map(new G6.b(27)).collect(Collectors.toList());
        this.f38584a = list2;
        if (list2.size() == 0) {
            throw new IllegalStateException("Callback with no instruments is not allowed");
        }
        list.stream().flatMap(new G6.b(28)).findAny().isPresent();
    }

    public final String toString() {
        return "CallbackRegistration{instrumentDescriptors=" + this.f38584a + "}";
    }
}
