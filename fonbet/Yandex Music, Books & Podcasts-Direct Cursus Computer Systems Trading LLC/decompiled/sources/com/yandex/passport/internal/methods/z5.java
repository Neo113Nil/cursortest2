package com.yandex.passport.internal.methods;

import android.os.Bundle;
import android.os.Parcelable;
import defpackage.b6e;
import defpackage.e7o;
import defpackage.wp3;

/* loaded from: classes4.dex */
public abstract class z5 implements f {
    public final /* synthetic */ int a;
    public final Object b;
    public boolean c;

    public z5(String str) {
        this.a = 1;
        this.b = str;
        this.c = false;
    }

    public static com.yandex.passport.legacy.lx.j d(Runnable runnable) {
        return new com.yandex.passport.legacy.lx.e(new com.yandex.passport.legacy.lx.i(new com.yandex.passport.legacy.lx.c(1, runnable))).h(new androidx.core.app.q(21), new androidx.core.app.q(22));
    }

    public boolean a() {
        this.c = true;
        z5 z5Var = (z5) this.b;
        if (z5Var != null) {
            return z5Var.a();
        }
        return true;
    }

    public void b() {
        if (this.c) {
            throw new wp3();
        }
    }

    public abstract Object c();

    public Parcelable e(Bundle bundle) {
        switch (this.a) {
            case 0:
                String str = (String) this.b;
                bundle.getClass();
                if (this.c) {
                    bundle.setClassLoader(com.yandex.passport.internal.util.p.class.getClassLoader());
                }
                if (bundle.containsKey(str)) {
                    Parcelable parcelable = bundle.getParcelable(str);
                    if (parcelable != null) {
                        return parcelable;
                    }
                    e7o.f("can't get required parcelable ".concat(str));
                }
                return null;
            default:
                bundle.getClass();
                if (this.c) {
                    bundle.setClassLoader(com.yandex.passport.internal.util.p.class.getClassLoader());
                }
                String str2 = (String) this.b;
                Parcelable parcelable2 = bundle.getParcelable(str2);
                if (parcelable2 != null) {
                    return parcelable2;
                }
                b6e.l(str2, "can't get required parcelable ");
                return null;
        }
    }

    @Override // com.yandex.passport.internal.methods.f
    public /* bridge */ /* synthetic */ Object f(Bundle bundle) {
        switch (this.a) {
        }
        return e(bundle);
    }

    @Override // com.yandex.passport.internal.methods.f
    public void g(Bundle bundle, Object obj) {
        switch (this.a) {
            case 0:
                Parcelable parcelable = (Parcelable) obj;
                if (parcelable != null) {
                    bundle.putParcelable((String) this.b, parcelable);
                    break;
                }
                break;
            default:
                Parcelable parcelable2 = (Parcelable) obj;
                parcelable2.getClass();
                bundle.putParcelable((String) this.b, parcelable2);
                break;
        }
    }

    @Override // com.yandex.passport.internal.methods.f
    public String getKey() {
        switch (this.a) {
        }
        return (String) this.b;
    }

    public z5(z5 z5Var) {
        this.a = 2;
        this.b = z5Var;
    }

    public /* synthetic */ z5(String str, boolean z, int i) {
        this.a = i;
        this.b = str;
        this.c = z;
    }
}
