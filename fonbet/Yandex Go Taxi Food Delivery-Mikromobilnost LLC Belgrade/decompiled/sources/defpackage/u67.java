package defpackage;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes10.dex */
public class u67 implements wyn {
    @Override // defpackage.wyn
    public final boolean e(Object obj, File file, mg70 mg70Var) {
        try {
            g77.d((ByteBuffer) obj, file);
            return true;
        } catch (IOException unused) {
            Log.isLoggable("ByteBufferEncoder", 3);
            return false;
        }
    }
}
