package defpackage;

import android.view.View;
import android.widget.ImageView;
import com.yandex.go.image.domain.requests.e;
import com.yandex.go.image.domain.requests.f;

/* loaded from: classes.dex */
public final class ynq implements pav {
    public final pav a;
    public final vit b;

    public ynq(pav pavVar, vit vitVar) {
        this.a = pavVar;
        this.b = vitVar;
    }

    @Override // defpackage.pav
    public final lbm a(ImageView imageView) {
        return this.a.a(imageView);
    }

    @Override // defpackage.pav
    public final g16 b() {
        return new xnq(this.a.b(), this.b);
    }

    @Override // defpackage.pav
    public final void c(ImageView imageView) {
        this.a.c(imageView);
    }

    @Override // defpackage.pav
    public final am2 d() {
        return this.a.d();
    }

    @Override // defpackage.pav
    public final cpe0 e() {
        return this.a.e();
    }

    @Override // defpackage.pav
    public final lbm f(wls wlsVar, View view) {
        return this.a.f(wlsVar, view);
    }

    @Override // defpackage.pav
    public final f g() {
        return this.a.g();
    }

    @Override // defpackage.pav
    public final e h() {
        return this.a.h();
    }
}
