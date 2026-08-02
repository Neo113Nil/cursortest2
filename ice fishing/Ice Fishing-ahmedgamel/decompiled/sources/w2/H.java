package w2;

import android.app.Activity;
import android.graphics.Rect;
import android.media.AudioManager;
import android.text.TextUtils;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import com.google.android.gms.internal.ads.AbstractC3592ma;
import com.google.android.gms.internal.ads.C3061cg;
import java.util.List;
import java.util.Locale;
import r2.C4906k;

/* loaded from: classes.dex */
public class H extends E {
    @Override // O2.i
    public final void y(final Activity activity) {
        int i;
        if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f32860N1)).booleanValue() && C4906k.f40186C.f40196h.g().q() == null && !activity.isInMultiWindowMode()) {
            Window window = activity.getWindow();
            WindowManager.LayoutParams attributes = window.getAttributes();
            i = attributes.layoutInDisplayCutoutMode;
            if (1 != i) {
                attributes.layoutInDisplayCutoutMode = 1;
                window.setAttributes(attributes);
            }
            activity.getWindow().getDecorView().setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: w2.F
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    int i4;
                    DisplayCutout displayCutout;
                    List<Rect> boundingRects;
                    C4906k c4906k = C4906k.f40186C;
                    if (c4906k.f40196h.g().q() == null) {
                        displayCutout = windowInsets.getDisplayCutout();
                        C3061cg c3061cg = c4906k.f40196h;
                        String str = "";
                        if (displayCutout != null) {
                            C5140B g9 = c3061cg.g();
                            boundingRects = displayCutout.getBoundingRects();
                            for (Rect rect : boundingRects) {
                                Locale locale = Locale.US;
                                int i6 = rect.left;
                                int i9 = rect.top;
                                int i10 = rect.right;
                                int i11 = rect.bottom;
                                StringBuilder sb = new StringBuilder();
                                sb.append(i6);
                                sb.append(",");
                                sb.append(i9);
                                sb.append(",");
                                sb.append(i10);
                                String k9 = D.x.k(i11, ",", sb);
                                if (!TextUtils.isEmpty(str)) {
                                    str = str.concat(com.anythink.expressad.foundation.g.a.bU);
                                }
                                str = str.concat(k9);
                            }
                            g9.r(str);
                        } else {
                            c3061cg.g().r("");
                        }
                    }
                    Window window2 = activity.getWindow();
                    WindowManager.LayoutParams attributes2 = window2.getAttributes();
                    i4 = attributes2.layoutInDisplayCutoutMode;
                    if (2 != i4) {
                        attributes2.layoutInDisplayCutoutMode = 2;
                        window2.setAttributes(attributes2);
                    }
                    return view.onApplyWindowInsets(windowInsets);
                }
            });
        }
    }

    @Override // O2.i
    public final int z(AudioManager audioManager) {
        int streamMinVolume;
        streamMinVolume = audioManager.getStreamMinVolume(3);
        return streamMinVolume;
    }
}
