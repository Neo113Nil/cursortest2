package defpackage;

import android.content.Context;
import android.os.StatFs;
import com.yandex.music.shared.utils.assertions.Assertions;
import com.yandex.music.shared.utils.assertions.FailedAssertionException;

/* loaded from: classes3.dex */
public final class h88 implements b8l {
    public final Context a;

    public h88(Context context) {
        this.a = context.getApplicationContext();
    }

    public f88 a() {
        try {
            StatFs statFs = new StatFs(this.a.getFilesDir().getPath());
            return new f88(statFs.getTotalBytes(), statFs.getAvailableBytes());
        } catch (IllegalArgumentException e) {
            Assertions.throwOrSkip("DiskSpaceManager", new FailedAssertionException("Cannot get available internal storage bytes", e));
            return null;
        }
    }

    @Override // defpackage.b8l
    public void b(Throwable th) {
        new lum(this.a).Q(th);
    }

    public /* synthetic */ h88(Context context, boolean z) {
        this.a = context;
    }
}
