package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.a4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0268a4 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f5545a;

    /* renamed from: b, reason: collision with root package name */
    public final C0347d5 f5546b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f5547c;

    /* renamed from: d, reason: collision with root package name */
    public final C0662pa f5548d;

    /* renamed from: e, reason: collision with root package name */
    public final Context f5549e;

    /* renamed from: f, reason: collision with root package name */
    public final C0475i4 f5550f;

    public C0268a4(Context context, C0347d5 c0347d5) {
        this(context, c0347d5, new C0475i4());
    }

    public final InterfaceC0397f4 a(P3 p3, C0656p4 c0656p4) {
        InterfaceC0397f4 interfaceC0397f4;
        synchronized (this.f5545a) {
            try {
                interfaceC0397f4 = (InterfaceC0397f4) this.f5547c.get(p3);
                if (interfaceC0397f4 == null) {
                    this.f5550f.getClass();
                    interfaceC0397f4 = C0475i4.a(p3).a(this.f5549e, this.f5546b, p3, c0656p4);
                    this.f5547c.put(p3, interfaceC0397f4);
                    this.f5548d.a(new Z3(p3.f4900b, p3.f4901c, p3.f4902d), p3);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC0397f4;
    }

    public C0268a4(Context context, C0347d5 c0347d5, C0475i4 c0475i4) {
        this.f5545a = new Object();
        this.f5547c = new HashMap();
        this.f5548d = new C0662pa();
        this.f5549e = context.getApplicationContext();
        this.f5546b = c0347d5;
        this.f5550f = c0475i4;
    }

    public final void a(String str, Integer num, String str2) {
        synchronized (this.f5545a) {
            try {
                C0662pa c0662pa = this.f5548d;
                Collection collection = (Collection) c0662pa.f6733a.remove(new Z3(str, num, str2));
                if (!AbstractC0572lo.a(collection)) {
                    collection.size();
                    ArrayList arrayList = new ArrayList(collection.size());
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        arrayList.add((InterfaceC0397f4) this.f5547c.remove((P3) it.next()));
                    }
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        ((InterfaceC0397f4) it2.next()).a();
                    }
                }
            } finally {
            }
        }
    }
}
