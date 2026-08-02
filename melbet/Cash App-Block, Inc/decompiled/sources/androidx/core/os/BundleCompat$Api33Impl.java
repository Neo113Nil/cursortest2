package androidx.core.os;

import android.os.Bundle;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class BundleCompat$Api33Impl {
    public static Object getParcelable(Bundle bundle, String str, Class cls) {
        return bundle.getParcelable(str, cls);
    }

    public static ArrayList getParcelableArrayList(Bundle bundle, String str, Class cls) {
        return bundle.getParcelableArrayList(str, cls);
    }
}
