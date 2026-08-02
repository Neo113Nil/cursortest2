package defpackage;

import android.widget.AbsListView;
import java.lang.reflect.Field;

/* loaded from: classes10.dex */
public abstract class vmm {
    public static final Field a;

    static {
        Field field = null;
        try {
            field = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            field.setAccessible(true);
        } catch (NoSuchFieldException unused) {
        }
        a = field;
    }
}
