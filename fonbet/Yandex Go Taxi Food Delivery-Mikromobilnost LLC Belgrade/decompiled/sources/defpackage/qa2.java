package defpackage;

import android.os.Environment;
import android.util.Log;
import java.io.File;

/* loaded from: classes.dex */
public class qa2 {
    public volatile boolean a;
    public volatile boolean b;

    public final boolean a() {
        boolean z;
        if (!this.b) {
            try {
            } catch (Exception e) {
                try {
                    Log.e("Ya:Log", "Error occurred when trying to open enable logging file", e);
                } catch (RuntimeException unused) {
                }
            }
            if ("mounted".equals(Environment.getExternalStorageState())) {
                if (new File(Environment.getExternalStorageDirectory(), "enable_logging").exists()) {
                    z = true;
                    this.a = z;
                    this.b = true;
                }
            }
            z = false;
            this.a = z;
            this.b = true;
        }
        return this.a;
    }
}
