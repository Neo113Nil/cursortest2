package x8;

import android.content.res.Resources;
import com.anythink.expressad.foundation.h.k;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import pl.droidsonroids.gif.GifImageView;

/* loaded from: classes2.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final List f41810a = Arrays.asList("raw", k.f19790c, "mipmap");

    public static boolean a(GifImageView gifImageView, boolean z8, int i) {
        Resources resources = gifImageView.getResources();
        if (resources == null) {
            return false;
        }
        try {
            if (!f41810a.contains(resources.getResourceTypeName(i))) {
                return false;
            }
            pl.droidsonroids.gif.c cVar = new pl.droidsonroids.gif.c(resources, i);
            if (z8) {
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
