package defpackage;

import com.yandex.payment.divkit.select.DivCvvNumber;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.a;

/* loaded from: classes2.dex */
public final class qof {
    public List a = EmptyList.a;
    public int b = -1;

    public final void a() {
        Iterator it = a.v0(new d6w(0, this.a.size() - 2, 1), this.a).iterator();
        while (it.hasNext()) {
            ((DivCvvNumber) it.next()).setState(hmk.c);
        }
    }
}
