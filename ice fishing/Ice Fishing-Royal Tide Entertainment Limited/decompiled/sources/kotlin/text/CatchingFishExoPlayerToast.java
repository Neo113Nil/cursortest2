package kotlin.text;

import android.widget.AbsListView;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public abstract class CatchingFishExoPlayerToast {
    public static final Field CatchingFishParcelableFAB;

    static {
        Field field = null;
        try {
            field = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            field.setAccessible(true);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
        CatchingFishParcelableFAB = field;
    }
}
