package t2;

import android.text.TextUtils;
import com.google.android.gms.internal.ads.AbstractC3569ma;
import com.google.android.gms.internal.ads.CA;
import com.google.android.gms.internal.ads.Y;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Objects;
import q2.r;
import y1.C5220o;
import y3.C5234b;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final Object f40859a;

    public n(Y y7) {
        Objects.requireNonNull(y7);
        this.f40859a = y7;
    }

    public void a(CA ca) {
        Y y7 = (Y) this.f40859a;
        y7.getClass();
        String str = ca.f24060b;
        if (!TextUtils.isEmpty(str)) {
            if (!((Boolean) r.f40207e.f40210c.a(AbstractC3569ma.Vc)).booleanValue()) {
                y7.f28622b = str;
            }
        }
        int i = ca.f24059a;
        switch (i) {
            case 8152:
                y7.d(new HashMap(), "onLMDOverlayOpened");
                break;
            case 8153:
                y7.d(new HashMap(), "onLMDOverlayClicked");
                break;
            case 8155:
                y7.d(new HashMap(), "onLMDOverlayClose");
                break;
            case 8157:
                y7.f28622b = null;
                y7.f28623c = null;
                y7.f28621a = false;
                break;
            case 8160:
            case 8161:
            case 8162:
                HashMap hashMap = new HashMap();
                hashMap.put("error", String.valueOf(i));
                y7.d(hashMap, "onLMDOverlayFailedToOpen");
                break;
        }
    }

    public n(int i) {
        switch (i) {
            case 2:
                this.f40859a = new C5220o(500L, 0);
                break;
            default:
                this.f40859a = new ArrayDeque();
                break;
        }
    }

    public n(C5234b c5234b) {
        this.f40859a = c5234b;
    }
}
