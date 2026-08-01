package O;

import android.text.TextUtils;
import android.view.View;

/* loaded from: classes.dex */
public final class G extends I {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f2040x;

    public G(int i, Class cls, int i6, int i9, int i10) {
        this.f2040x = i10;
        this.f2042n = i;
        this.f2045w = cls;
        this.f2044v = i6;
        this.f2043u = i9;
    }

    @Override // O.I
    public final Object c(View view) {
        switch (this.f2040x) {
            case 0:
                return Boolean.valueOf(P.d(view));
            case 1:
                return P.b(view);
            default:
                return Boolean.valueOf(P.c(view));
        }
    }

    @Override // O.I
    public final void d(View view, Object obj) {
        switch (this.f2040x) {
            case 0:
                P.j(view, ((Boolean) obj).booleanValue());
                break;
            case 1:
                P.h(view, (CharSequence) obj);
                break;
            default:
                P.g(view, ((Boolean) obj).booleanValue());
                break;
        }
    }

    @Override // O.I
    public final boolean g(Object obj, Object obj2) {
        switch (this.f2040x) {
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
