package O2;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.ads.WH;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: O2.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0361k {

    /* renamed from: a, reason: collision with root package name */
    public final Map f2255a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f2256b;

    public /* synthetic */ C0361k(Map map, Map map2) {
        this.f2255a = map;
        this.f2256b = map2;
    }

    public void a(boolean z3, Status status) {
        HashMap hashMap;
        HashMap hashMap2;
        synchronized (this.f2255a) {
            hashMap = new HashMap(this.f2255a);
        }
        synchronized (this.f2256b) {
            hashMap2 = new HashMap(this.f2256b);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (z3 || ((Boolean) entry.getValue()).booleanValue()) {
                entry.getKey().getClass();
                throw new ClassCastException();
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (z3 || ((Boolean) entry2.getValue()).booleanValue()) {
                ((j3.h) entry2.getKey()).c(new N2.f(status));
            }
        }
    }

    public Enum b(Object obj) {
        Enum r02 = (Enum) this.f2256b.get(obj);
        if (r02 != null) {
            return r02;
        }
        throw new GeneralSecurityException("Unable to convert object enum: ".concat(String.valueOf(obj)));
    }

    public Object c(WH wh) {
        Object obj = this.f2255a.get(wh);
        if (obj != null) {
            return obj;
        }
        throw new GeneralSecurityException("Unable to convert proto enum: ".concat(String.valueOf(wh)));
    }

    public C0361k() {
        this.f2255a = Collections.synchronizedMap(new WeakHashMap());
        this.f2256b = Collections.synchronizedMap(new WeakHashMap());
    }
}
