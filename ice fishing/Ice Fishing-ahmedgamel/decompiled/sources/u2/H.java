package u2;

import android.app.Activity;
import android.graphics.Rect;
import android.media.AudioManager;
import android.text.TextUtils;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import com.google.android.gms.internal.ads.AbstractC3569ma;
import com.google.android.gms.internal.ads.C3038cg;
import java.util.List;
import java.util.Locale;
import p2.C4835j;

/* loaded from: classes.dex */
public class H extends E {
    @Override // a4.e
    public final void v(final Activity activity) {
        int i;
        if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.f32081N1)).booleanValue() && C4835j.f39733C.f39743h.g().q() == null && !activity.isInMultiWindowMode()) {
            Window window = activity.getWindow();
            WindowManager.LayoutParams attributes = window.getAttributes();
            i = attributes.layoutInDisplayCutoutMode;
            if (1 != i) {
                attributes.layoutInDisplayCutoutMode = 1;
                window.setAttributes(attributes);
            }
            activity.getWindow().getDecorView().setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: u2.F
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    int i6;
                    DisplayCutout displayCutout;
                    List<Rect> boundingRects;
                    C4835j c4835j = C4835j.f39733C;
                    if (c4835j.f39743h.g().q() == null) {
                        displayCutout = windowInsets.getDisplayCutout();
                        C3038cg c3038cg = c4835j.f39743h;
                        String str = "";
                        if (displayCutout != null) {
                            C5069B g4 = c3038cg.g();
                            boundingRects = displayCutout.getBoundingRects();
                            for (Rect rect : boundingRects) {
                                Locale locale = Locale.US;
                                int i9 = rect.left;
                                int i10 = rect.top;
                                int i11 = rect.right;
                                int i12 = rect.bottom;
                                StringBuilder sb = new StringBuilder();
                                sb.append(i9);
                                sb.append(",");
                                sb.append(i10);
                                sb.append(",");
                                sb.append(i11);
                                String m4 = D.y.m(i12, ",", sb);
                                if (!TextUtils.isEmpty(str)) {
                                    str = str.concat(com.anythink.expressad.foundation.g.a.bU);
                                }
                                str = str.concat(m4);
                            }
                            g4.r(str);
                        } else {
                            c3038cg.g().r("");
                        }
                    }
                    Window window2 = activity.getWindow();
                    WindowManager.LayoutParams attributes2 = window2.getAttributes();
                    i6 = attributes2.layoutInDisplayCutoutMode;
                    if (2 != i6) {
                        attributes2.layoutInDisplayCutoutMode = 2;
                        window2.setAttributes(attributes2);
                    }
                    return view.onApplyWindowInsets(windowInsets);
                }
            });
        }
    }

    @Override // a4.e
    public final int w(AudioManager audioManager) {
        int streamMinVolume;
        streamMinVolume = audioManager.getStreamMinVolume(3);
        return streamMinVolume;
    }
}
