package m;

import android.widget.AbsListView;
import java.lang.reflect.Field;

/* renamed from: m.q0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0275q0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Field f4001a;

    static {
        Field field = null;
        try {
            field = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            field.setAccessible(true);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
        f4001a = field;
    }
}
