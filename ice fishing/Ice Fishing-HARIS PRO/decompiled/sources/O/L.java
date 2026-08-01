package O;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class L extends D1.j implements C1.l {

    /* renamed from: b, reason: collision with root package name */
    public static final L f752b = new L(1);

    @Override // C1.l
    public final Object g(Object obj) {
        View view = (View) obj;
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup != null) {
            return new D1.a(1, viewGroup);
        }
        return null;
    }
}
