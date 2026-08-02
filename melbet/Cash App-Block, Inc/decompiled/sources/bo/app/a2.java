package bo.app;

import android.content.Context;
import com.braze.configuration.BrazeConfigurationProvider;
import java.util.EnumSet;

/* loaded from: classes3.dex */
public final class a2 {
    public a2(Context context, EnumSet enumSet, BrazeConfigurationProvider brazeConfigurationProvider) {
        context.getClass();
        enumSet.getClass();
        brazeConfigurationProvider.getClass();
        try {
            Class.forName("com.braze.location.BrazeInternalLocationApi").getDeclaredConstructor(null).newInstance(null).getClass();
            throw new ClassCastException();
        } catch (Exception unused) {
        }
    }
}
