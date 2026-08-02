package defpackage;

import android.content.Context;

/* loaded from: classes.dex */
public final class yib implements p3c {
    public final /* synthetic */ int a;
    public final szm b;

    public /* synthetic */ yib(szm szmVar, int i) {
        this.a = i;
        this.b = szmVar;
    }

    @Override // defpackage.szm
    public final Object get() {
        switch (this.a) {
            case 0:
                String packageName = ((Context) this.b.get()).getPackageName();
                if (packageName != null) {
                    return packageName;
                }
                jj4.j("Cannot return null from a non-@Nullable @Provides method");
                return null;
            default:
                return new zto((Context) this.b.get(), "com.google.android.datatransport.events", Integer.valueOf(zto.d).intValue());
        }
    }
}
