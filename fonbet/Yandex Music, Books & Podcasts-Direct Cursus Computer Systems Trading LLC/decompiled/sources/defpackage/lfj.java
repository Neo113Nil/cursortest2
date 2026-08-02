package defpackage;

import com.google.android.gms.cast.framework.media.internal.ResourceProvider;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/* loaded from: classes.dex */
public final class lfj {
    public bnd b;
    public final vcx a = mfj.I;
    public final int[] c = mfj.J;
    public final int d = b("smallIconDrawableResId");
    public final int e = b("stopLiveStreamDrawableResId");
    public final int f = b("pauseDrawableResId");
    public final int g = b("playDrawableResId");
    public final int h = b("skipNextDrawableResId");
    public final int i = b("skipPrevDrawableResId");
    public final int j = b("forwardDrawableResId");
    public final int k = b("forward10DrawableResId");
    public final int l = b("forward30DrawableResId");
    public final int m = b("rewindDrawableResId");
    public final int n = b("rewind10DrawableResId");
    public final int o = b("rewind30DrawableResId");
    public final int p = b("disconnectDrawableResId");
    public final long q = 10000;

    public static int b(String str) {
        try {
            Map map = ResourceProvider.a;
            Integer num = (Integer) ResourceProvider.class.getMethod("findResourceByName", String.class).invoke(null, str);
            if (num == null) {
                return 0;
            }
            return num.intValue();
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return 0;
        }
    }

    public final mfj a() {
        bnd bndVar = this.b;
        return new mfj(this.a, this.c, this.q, null, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, b("notificationImageSizeDimenResId"), b("castingToDeviceStringResId"), b("stopLiveStreamStringResId"), b("pauseStringResId"), b("playStringResId"), b("skipNextStringResId"), b("skipPrevStringResId"), b("forwardStringResId"), b("forward10StringResId"), b("forward30StringResId"), b("rewindStringResId"), b("rewind10StringResId"), b("rewind30StringResId"), b("disconnectStringResId"), bndVar == null ? null : (lmx) bndVar.b, false, false);
    }
}
