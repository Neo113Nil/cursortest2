package bo.app;

import android.content.Context;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import java.io.File;

/* loaded from: classes3.dex */
public final class n4 {
    public static File a(Context context, String str) {
        context.getClass();
        str.getClass();
        return new File(Recorder$$ExternalSyntheticOutline2.m(context.getCacheDir().getPath(), File.separator, str));
    }
}
