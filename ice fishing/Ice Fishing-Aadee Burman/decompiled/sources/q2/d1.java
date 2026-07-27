package q2;

import java.util.Comparator;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class d1 implements Comparator {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ d1 f40124n = new d1();

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        List list = k2.r.f38606d;
        return list.indexOf((String) obj) - list.indexOf((String) obj2);
    }
}
