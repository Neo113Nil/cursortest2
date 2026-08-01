package N0;

import android.content.Context;
import android.view.SubMenu;
import l.MenuC0229m;
import l.o;

/* loaded from: classes.dex */
public final class e extends MenuC0229m {

    /* renamed from: A, reason: collision with root package name */
    public final int f668A;

    /* renamed from: z, reason: collision with root package name */
    public final Class f669z;

    public e(Context context, Class cls, int i) {
        super(context);
        this.f669z = cls;
        this.f668A = i;
    }

    @Override // l.MenuC0229m
    public final o a(int i, int i2, int i3, CharSequence charSequence) {
        int size = this.f3713f.size() + 1;
        int i4 = this.f668A;
        if (size <= i4) {
            w();
            o a2 = super.a(i, i2, i3, charSequence);
            a2.g(true);
            v();
            return a2;
        }
        String simpleName = this.f669z.getSimpleName();
        StringBuilder sb = new StringBuilder("Maximum number of items supported by ");
        sb.append(simpleName);
        sb.append(" is ");
        sb.append(i4);
        sb.append(". Limit can be checked with ");
        throw new IllegalArgumentException(D1.h.h(sb, simpleName, "#getMaxItemCount()"));
    }

    @Override // l.MenuC0229m, android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        throw new UnsupportedOperationException(this.f669z.getSimpleName().concat(" does not support submenus"));
    }
}
