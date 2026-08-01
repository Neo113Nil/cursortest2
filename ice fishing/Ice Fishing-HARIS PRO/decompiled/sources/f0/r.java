package f0;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class r extends D1.j implements C1.l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2962b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Bundle f2963c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(int i, Bundle bundle) {
        super(1);
        this.f2962b = i;
        this.f2963c = bundle;
    }

    @Override // C1.l
    public final Object g(Object obj) {
        switch (this.f2962b) {
            case 0:
                D1.i.e((String) obj, "argName");
                return Boolean.valueOf(!this.f2963c.containsKey(r2));
            default:
                D1.i.e((String) obj, "key");
                return Boolean.valueOf(!this.f2963c.containsKey(r2));
        }
    }
}
