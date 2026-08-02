package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes6.dex */
public interface roj0 {
    pex0 a();

    String b();

    String c();

    tpr d();

    tpr e();

    default List getRequirements() {
        List f;
        pex0 a = a();
        return (a == null || (f = a.f()) == null) ? EmptyList.a : f;
    }
}
