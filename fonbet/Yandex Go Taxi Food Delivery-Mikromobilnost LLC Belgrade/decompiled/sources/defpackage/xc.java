package defpackage;

import android.graphics.drawable.LayerDrawable;
import com.yandex.go.zone.dto.objects.DefaultOrderPopup;

/* loaded from: classes6.dex */
public final class xc {
    public final LayerDrawable a;
    public final bj70 b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    public xc(LayerDrawable layerDrawable, bj70 bj70Var, DefaultOrderPopup defaultOrderPopup, xdf xdfVar, fef fefVar) {
        this.a = layerDrawable;
        this.b = bj70Var;
        this.c = xdfVar.a(fefVar, defaultOrderPopup.a, false, true);
        this.d = xdfVar.a(fefVar, defaultOrderPopup.c, false, true);
        this.e = xdfVar.a(fefVar, defaultOrderPopup.d, false, true);
        this.f = xdfVar.a(fefVar, defaultOrderPopup.b, false, true);
        this.g = xdfVar.a(fefVar, defaultOrderPopup.e, false, true);
    }
}
