package m;

import android.widget.AbsListView;
import java.lang.reflect.Field;

/* renamed from: m.o0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4704o0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Field f39195a;

    static {
        Field field = null;
        try {
            field = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            field.setAccessible(true);
        } catch (NoSuchFieldException e9) {
            e9.printStackTrace();
        }
        f39195a = field;
    }
}
