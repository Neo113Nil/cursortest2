package R;

import L0.C0058p;
import android.util.Log;
import java.util.ArrayList;
import u0.l;

/* loaded from: classes.dex */
public final class f extends g {

    /* renamed from: a, reason: collision with root package name */
    public final Object f932a;

    /* renamed from: b, reason: collision with root package name */
    public final String f933b;

    /* renamed from: c, reason: collision with root package name */
    public final int f934c;

    /* renamed from: d, reason: collision with root package name */
    public final j f935d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [u0.l] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.ArrayList] */
    public f(Object obj, String str, a aVar, int i2) {
        E0.i.e(obj, "value");
        E0.h.i("verificationMode", i2);
        this.f932a = obj;
        this.f933b = str;
        this.f934c = i2;
        String b2 = g.b(obj, str);
        E0.i.e(b2, "message");
        j jVar = new j(b2);
        StackTraceElement[] stackTrace = jVar.getStackTrace();
        E0.i.d(stackTrace, "stackTrace");
        int length = stackTrace.length - 2;
        length = length < 0 ? 0 : length;
        if (length < 0) {
            throw new IllegalArgumentException(("Requested element count " + length + " is less than zero.").toString());
        }
        ?? r02 = l.f3006e;
        if (length != 0) {
            int length2 = stackTrace.length;
            if (length >= length2) {
                int length3 = stackTrace.length;
                if (length3 != 0) {
                    r02 = length3 != 1 ? new ArrayList(new u0.a(stackTrace, false)) : o.g.s(stackTrace[0]);
                }
            } else if (length == 1) {
                r02 = o.g.s(stackTrace[length2 - 1]);
            } else {
                r02 = new ArrayList(length);
                for (int i3 = length2 - length; i3 < length2; i3++) {
                    r02.add(stackTrace[i3]);
                }
            }
        }
        jVar.setStackTrace((StackTraceElement[]) r02.toArray(new StackTraceElement[0]));
        this.f935d = jVar;
    }

    @Override // R.g
    public final Object a() {
        int b2 = F.j.b(this.f934c);
        if (b2 == 0) {
            throw this.f935d;
        }
        if (b2 != 1) {
            if (b2 == 2) {
                return null;
            }
            throw new C0058p();
        }
        String b3 = g.b(this.f932a, this.f933b);
        E0.i.e(b3, "message");
        Log.d("f", b3);
        return null;
    }

    @Override // R.g
    public final g d(String str, D0.l lVar) {
        return this;
    }
}
