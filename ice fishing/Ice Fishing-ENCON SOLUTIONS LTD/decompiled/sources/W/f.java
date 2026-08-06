package W;

import A1.C0015p;
import a.AbstractC0083a;
import android.util.Log;
import i1.AbstractC0251h;
import i1.r;
import java.util.ArrayList;
import java.util.Collection;
import t1.l;

/* loaded from: classes.dex */
public final class f extends g {

    /* renamed from: a, reason: collision with root package name */
    public final Object f1842a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1843b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1844c;

    /* renamed from: d, reason: collision with root package name */
    public final j f1845d;

    public f(Object value, String str, a aVar, int i2) {
        Collection collection;
        kotlin.jvm.internal.i.e(value, "value");
        C1.a.m(i2, "verificationMode");
        this.f1842a = value;
        this.f1843b = str;
        this.f1844c = i2;
        String message = g.b(value, str);
        kotlin.jvm.internal.i.e(message, "message");
        j jVar = new j(message);
        StackTraceElement[] stackTrace = jVar.getStackTrace();
        kotlin.jvm.internal.i.d(stackTrace, "stackTrace");
        int length = stackTrace.length - 2;
        length = length < 0 ? 0 : length;
        if (length < 0) {
            throw new IllegalArgumentException(C1.a.g(length, "Requested element count ", " is less than zero.").toString());
        }
        if (length == 0) {
            collection = r.f3416a;
        } else {
            int length2 = stackTrace.length;
            if (length >= length2) {
                collection = AbstractC0251h.U(stackTrace);
            } else if (length == 1) {
                collection = AbstractC0083a.m(stackTrace[length2 - 1]);
            } else {
                ArrayList arrayList = new ArrayList(length);
                for (int i3 = length2 - length; i3 < length2; i3++) {
                    arrayList.add(stackTrace[i3]);
                }
                collection = arrayList;
            }
        }
        jVar.setStackTrace((StackTraceElement[]) collection.toArray(new StackTraceElement[0]));
        this.f1845d = jVar;
    }

    @Override // W.g
    public final Object a() {
        int b2 = H.j.b(this.f1844c);
        if (b2 == 0) {
            throw this.f1845d;
        }
        if (b2 != 1) {
            if (b2 == 2) {
                return null;
            }
            throw new C0015p();
        }
        String message = g.b(this.f1842a, this.f1843b);
        kotlin.jvm.internal.i.e(message, "message");
        Log.d("f", message);
        return null;
    }

    @Override // W.g
    public final g d(String str, l lVar) {
        return this;
    }
}
