package O;

import android.text.TextUtils;
import android.view.View;

/* renamed from: O.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0046w extends AbstractC0048y {
    public final /* synthetic */ int e;

    public C0046w(int i, Class cls, int i2, int i3, int i4) {
        this.e = i4;
        this.f836a = i;
        this.f839d = cls;
        this.f838c = i2;
        this.f837b = i3;
    }

    @Override // O.AbstractC0048y
    public final Object b(View view) {
        switch (this.e) {
            case 0:
                return Boolean.valueOf(F.c(view));
            case 1:
                return F.a(view);
            default:
                return Boolean.valueOf(F.b(view));
        }
    }

    @Override // O.AbstractC0048y
    public final void c(View view, Object obj) {
        switch (this.e) {
            case 0:
                F.f(view, ((Boolean) obj).booleanValue());
                break;
            case 1:
                F.e(view, (CharSequence) obj);
                break;
            default:
                F.d(view, ((Boolean) obj).booleanValue());
                break;
        }
    }

    @Override // O.AbstractC0048y
    public final boolean e(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj2;
                return !((bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue()));
            case 1:
                return !TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
            default:
                Boolean bool3 = (Boolean) obj;
                Boolean bool4 = (Boolean) obj2;
                return !((bool3 != null && bool3.booleanValue()) == (bool4 != null && bool4.booleanValue()));
        }
    }
}
