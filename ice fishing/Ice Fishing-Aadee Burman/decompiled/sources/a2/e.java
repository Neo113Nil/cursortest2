package a2;

import android.content.Context;
import b2.InterfaceC0515b;

/* loaded from: classes.dex */
public final class e implements InterfaceC0515b {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f4323n;

    /* renamed from: u, reason: collision with root package name */
    public final G3.e f4324u;

    public /* synthetic */ e(G3.e eVar, int i) {
        this.f4323n = i;
        this.f4324u = eVar;
    }

    @Override // t7.InterfaceC5044a
    public final Object get() {
        switch (this.f4323n) {
            case 0:
                return new d((Context) this.f4324u.f1072n, new E3.e(), new a4.e());
            default:
                String packageName = ((Context) this.f4324u.f1072n).getPackageName();
                if (packageName != null) {
                    return packageName;
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }
}
