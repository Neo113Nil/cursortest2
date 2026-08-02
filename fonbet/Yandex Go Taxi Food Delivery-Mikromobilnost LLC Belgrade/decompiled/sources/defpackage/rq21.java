package defpackage;

import android.content.Context;
import android.net.Uri;
import androidx.core.content.FileProvider;
import java.io.File;

/* loaded from: classes.dex */
public final class rq21 {
    public final Context a;

    public rq21(Context context) {
        this.a = context;
    }

    public final File a() {
        File file = new File(this.a.getCacheDir(), "user_photo");
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(file, "user_photo.jpg");
        if (!file2.exists()) {
            file2.createNewFile();
        }
        return file2;
    }

    public final Uri b() {
        Context context = this.a;
        return FileProvider.getUriForFile(context, g8e.o("ru.yandex.taxi.utils.fileprovider.", context.getPackageName()), a());
    }
}
