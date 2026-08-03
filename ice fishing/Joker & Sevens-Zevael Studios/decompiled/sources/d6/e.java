package d6;

import android.content.Context;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class e implements y5.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1694a;

    /* renamed from: b, reason: collision with root package name */
    public final zb.a f1695b;

    public /* synthetic */ e(zb.a aVar, int i10) {
        this.f1694a = i10;
        this.f1695b = aVar;
    }

    @Override // zb.a
    public final Object get() {
        switch (this.f1694a) {
            case 0:
                String packageName = ((Context) this.f1695b.get()).getPackageName();
                if (packageName != null) {
                    return packageName;
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
            default:
                return new m(Integer.valueOf(m.f1712j).intValue(), (Context) this.f1695b.get(), "com.google.android.datatransport.events");
        }
    }
}
