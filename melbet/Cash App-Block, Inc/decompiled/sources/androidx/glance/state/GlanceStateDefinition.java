package androidx.glance.state;

import android.content.Context;
import java.io.File;

/* loaded from: classes3.dex */
public interface GlanceStateDefinition {
    Object getDataStore(Context context, String str);

    File getLocation(Context context, String str);
}
