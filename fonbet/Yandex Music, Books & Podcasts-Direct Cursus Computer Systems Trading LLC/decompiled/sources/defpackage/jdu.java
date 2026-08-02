package defpackage;

import android.text.TextUtils;
import android.view.View;

/* loaded from: classes.dex */
public final class jdu extends e9h {
    public final /* synthetic */ int e;

    public jdu(int i, Class cls, int i2, int i3, int i4) {
        this.e = i4;
        this.a = i;
        this.d = cls;
        this.c = i2;
        this.b = i3;
    }

    @Override // defpackage.e9h
    public final Object c(View view) {
        switch (this.e) {
            case 0:
                return Boolean.valueOf(rdu.c(view));
            case 1:
                return rdu.a(view);
            case 2:
                return tdu.b(view);
            default:
                return Boolean.valueOf(rdu.b(view));
        }
    }

    @Override // defpackage.e9h
    public final void d(View view, Object obj) {
        switch (this.e) {
            case 0:
                rdu.f(view, ((Boolean) obj).booleanValue());
                break;
            case 1:
                rdu.e(view, (CharSequence) obj);
                break;
            case 2:
                tdu.d(view, (CharSequence) obj);
                break;
            default:
                rdu.d(view, ((Boolean) obj).booleanValue());
                break;
        }
    }

    @Override // defpackage.e9h
    public final boolean h(Object obj, Object obj2) {
        boolean equals;
        switch (this.e) {
            case 0:
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj2;
                return !((bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue()));
            case 1:
                equals = TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
                break;
            case 2:
                equals = TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
                break;
            default:
                Boolean bool3 = (Boolean) obj;
                Boolean bool4 = (Boolean) obj2;
                return !((bool3 != null && bool3.booleanValue()) == (bool4 != null && bool4.booleanValue()));
        }
        return !equals;
    }
}
