package bo.app;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import com.braze.support.BrazeLogger;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.util.regex.Pattern;
import kotlin.jvm.functions.Function0;
import okio.Utf8;

/* loaded from: classes3.dex */
public final class k0 {
    public final l5 a;

    public k0(File file) {
        Pattern pattern = l5.o;
        File file2 = new File(file, "journal.bkp");
        if (file2.exists()) {
            File file3 = new File(file, "journal");
            if (file3.exists()) {
                file2.delete();
            } else if (!file2.renameTo(file3)) {
                throw new IOException();
            }
        }
        l5 l5Var = new l5(file);
        if (l5Var.b.exists()) {
            try {
                l5Var.c();
                l5Var.b();
            } catch (IOException e) {
                BrazeLogger.w(l5.p, "DiskLruCache " + file + " is corrupt: " + e.getMessage() + ", removing");
                l5Var.a();
                bh.a(l5Var.a);
            }
            this.a = l5Var;
        }
        file.mkdirs();
        l5Var = new l5(file);
        l5Var.d();
        this.a = l5Var;
    }

    public static final String c(String str, String str2) {
        return CameraSelector$$ExternalSyntheticOutline0.m("Failed to load image from disk cache: ", str, "/", str2);
    }

    public static final String d(String str, String str2) {
        return CameraSelector$$ExternalSyntheticOutline0.m("Error while producing output stream or compressing bitmap for key ", str, " diskKey ", str2);
    }

    public final void a(String str, Bitmap bitmap) {
        str.getClass();
        bitmap.getClass();
        String valueOf = String.valueOf(str.hashCode());
        try {
            j5 a = this.a.a(valueOf);
            OutputStream a2 = a.a();
            try {
                bitmap.compress(Bitmap.CompressFormat.PNG, 100, a2);
                a2.flush();
                a2.close();
                boolean z = a.c;
                l5 l5Var = a.d;
                if (!z) {
                    l5Var.a(a, true);
                } else {
                    l5Var.a(a, false);
                    a.d.d(a.a.a);
                }
            } finally {
            }
        } catch (Throwable th) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, th, false, (Function0) new j1$$ExternalSyntheticLambda7(str, valueOf, 8), 4, (Object) null);
        }
    }

    public final Bitmap b(String str) {
        str.getClass();
        String valueOf = String.valueOf(str.hashCode());
        try {
            k5 b = this.a.b(valueOf);
            try {
                Bitmap decodeStream = BitmapFactory.decodeStream(b.a[0]);
                b.close();
                return decodeStream;
            } finally {
            }
        } catch (Throwable th) {
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.E, th, false, (Function0) new j1$$ExternalSyntheticLambda7(str, valueOf, 10), 4, (Object) null);
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new j1$$ExternalSyntheticLambda7(str, valueOf, 11), 7, (Object) null);
            return null;
        }
    }

    public static final String b(String str, String str2) {
        return CameraSelector$$ExternalSyntheticOutline0.m("Failed to get bitmap from disk cache for key ", str, " diskKey ", str2);
    }

    public static final String b() {
        return "Failed to shutdown disk cache";
    }

    public static final String a(String str, String str2) {
        return CameraSelector$$ExternalSyntheticOutline0.m("Error while retrieving disk for key ", str, " diskKey ", str2);
    }

    public final void a() {
        try {
            this.a.a();
        } catch (Throwable th) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, th, false, (Function0) new hf$$ExternalSyntheticLambda0(20), 4, (Object) null);
        }
    }

    public final boolean a(String str) {
        str.getClass();
        String valueOf = String.valueOf(str.hashCode());
        try {
            k5 b = this.a.b(valueOf);
            boolean z = b != null;
            Utf8.closeFinally(b, null);
            return z;
        } catch (Throwable th) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, th, false, (Function0) new j1$$ExternalSyntheticLambda7(str, valueOf, 9), 4, (Object) null);
            return false;
        }
    }
}
