package a2;

import S0.s;
import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;

/* renamed from: a2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0426e {

    /* renamed from: a, reason: collision with root package name */
    public final s f4372a;

    /* renamed from: b, reason: collision with root package name */
    public final C0425d f4373b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f4374c;

    public C0426e(Context context, C0425d c0425d) {
        s sVar = new s(7, context);
        this.f4374c = new HashMap();
        this.f4372a = sVar;
        this.f4373b = c0425d;
    }

    public final synchronized f a(String str) {
        if (this.f4374c.containsKey(str)) {
            return (f) this.f4374c.get(str);
        }
        CctBackendFactory c4 = this.f4372a.c(str);
        if (c4 == null) {
            return null;
        }
        C0425d c0425d = this.f4373b;
        f create = c4.create(new C0423b(c0425d.f4369a, c0425d.f4370b, c0425d.f4371c, str));
        this.f4374c.put(str, create);
        return create;
    }
}
