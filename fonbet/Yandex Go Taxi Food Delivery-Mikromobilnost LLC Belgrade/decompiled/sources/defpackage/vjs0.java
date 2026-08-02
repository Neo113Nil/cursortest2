package defpackage;

import android.util.Size;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.video.m3.preload_manager.PreloadManagerBuilder;

/* loaded from: classes10.dex */
public abstract class vjs0 {
    public static final Size a = new Size(0, 0);
    public static final Size b = new Size(320, PreloadManagerBuilder.MAXIMUM_TRACK_PRELOAD_TIMEOUT_IN_SEC);
    public static final Size c = new Size(640, 480);
    public static final Size d = new Size(720, 480);
    public static final Size e = new Size(1280, 720);
    public static final Size f = new Size(1920, 1080);
    public static final Size g = new Size(1920, 1440);

    static {
        new Size(HProv.ALG_TYPE_DH, 1440);
        new Size(3840, 2160);
    }

    public static int a(Size size) {
        return size.getHeight() * size.getWidth();
    }
}
