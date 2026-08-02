package B8;

import android.content.res.Resources;
import com.anythink.expressad.foundation.h.k;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import pl.droidsonroids.gif.GifImageView;

/* loaded from: classes2.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final List f301a = Arrays.asList("raw", k.f20419c, "mipmap");

    public static boolean a(GifImageView gifImageView, boolean z6, int i) {
        Resources resources = gifImageView.getResources();
        if (resources == null) {
            return false;
        }
        try {
            if (!f301a.contains(resources.getResourceTypeName(i))) {
                return false;
            }
            pl.droidsonroids.gif.c cVar = new pl.droidsonroids.gif.c(resources, i);
            if (z6) {
                gifImageView.setImageDrawable(cVar);
                return true;
            }
            gifImageView.setBackground(cVar);
            return true;
        } catch (Resources.NotFoundException | IOException unused) {
            return false;
        }
    }
}
