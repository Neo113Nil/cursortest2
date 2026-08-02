package defpackage;

import android.content.Context;
import android.support.v4.media.session.PlaybackStateCompat;
import java.io.File;
import java.io.FileInputStream;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.a;
import yads.lu0;
import yads.zu0;

/* loaded from: classes7.dex */
public final class yz71 {
    public static final byte[] d = {0, 1, 0, 0};
    public static final byte[] e = "OTTO".getBytes(uza.a);
    public final Context a;
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final i3y c = a.a(new lu0(this));

    public yz71(Context context) {
        this.a = context;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002e, code lost:
    
        if (java.util.Arrays.equals(r2, defpackage.yz71.e) != false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean a(File file) {
        boolean z;
        if (file.isFile() && file.length() >= PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID) {
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    byte[] bArr = new byte[4];
                    if (fileInputStream.read(bArr) == 4) {
                        if (!Arrays.equals(bArr, d)) {
                        }
                        z = true;
                        fileInputStream.close();
                        return z;
                    }
                    z = false;
                    fileInputStream.close();
                    return z;
                } finally {
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public final File b(zu0 zu0Var) {
        return new File((File) this.c.getValue(), b64.k("[^a-zA-Z0-9._-]", b64.j(zu0Var.name(), ".ttf"), "_"));
    }

    public final File c(zu0 zu0Var) {
        return new File((File) this.c.getValue(), b64.k("[^a-zA-Z0-9._-]", b64.j(zu0Var.name(), ".ttf.tmp"), "_"));
    }
}
