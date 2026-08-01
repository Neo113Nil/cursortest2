package t0;

import C1.l;
import D1.h;
import D1.i;
import L1.C0011l;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import u.AbstractC0357e;
import u1.o;

/* renamed from: t0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0351c extends AbstractC0352d {

    /* renamed from: a, reason: collision with root package name */
    public final Object f4364a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4365b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4366c;

    /* renamed from: d, reason: collision with root package name */
    public final g f4367d;

    public C0351c(Object obj, String str, C0349a c0349a, int i) {
        Collection collection;
        i.e(obj, "value");
        h.j("verificationMode", i);
        this.f4364a = obj;
        this.f4365b = str;
        this.f4366c = i;
        String b2 = AbstractC0352d.b(obj, str);
        i.e(b2, "message");
        g gVar = new g(b2);
        StackTraceElement[] stackTrace = gVar.getStackTrace();
        i.d(stackTrace, "stackTrace");
        int length = stackTrace.length - 2;
        length = length < 0 ? 0 : length;
        if (length < 0) {
            throw new IllegalArgumentException(("Requested element count " + length + " is less than zero.").toString());
        }
        if (length == 0) {
            collection = o.f4473a;
        } else {
            int length2 = stackTrace.length;
            if (length >= length2) {
                collection = u1.f.H(stackTrace);
            } else if (length == 1) {
                collection = h0.f.s(stackTrace[length2 - 1]);
            } else {
                ArrayList arrayList = new ArrayList(length);
                for (int i2 = length2 - length; i2 < length2; i2++) {
                    arrayList.add(stackTrace[i2]);
                }
                collection = arrayList;
            }
        }
        Object[] array = collection.toArray(new StackTraceElement[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        gVar.setStackTrace((StackTraceElement[]) array);
        this.f4367d = gVar;
    }

    @Override // t0.AbstractC0352d
    public final Object a() {
        int a2 = AbstractC0357e.a(this.f4366c);
        if (a2 == 0) {
            throw this.f4367d;
        }
        if (a2 != 1) {
            if (a2 == 2) {
                return null;
            }
            throw new C0011l();
        }
        String b2 = AbstractC0352d.b(this.f4364a, this.f4365b);
        i.e(b2, "message");
        Log.d("o", b2);
        return null;
    }

    @Override // t0.AbstractC0352d
    public final AbstractC0352d d(String str, l lVar) {
        return this;
    }
}
