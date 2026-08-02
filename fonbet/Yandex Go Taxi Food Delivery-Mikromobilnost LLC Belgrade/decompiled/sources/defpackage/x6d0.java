package defpackage;

import android.view.View;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.shape.b;
import kotlin.jvm.internal.PropertyReference1Impl;

/* loaded from: classes2.dex */
public final class x6d0 {
    public static final /* synthetic */ kgx[] f;
    public final sls a;
    public final sls b;
    public final b5d0 c;
    public final wv5 d;
    public final b e = a().getShapeAppearanceModel();

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl("avatarImage", 0, "getAvatarImage()Lcom/google/android/material/imageview/ShapeableImageView;", x6d0.class);
        qoi0.a.getClass();
        f = new kgx[]{propertyReference1Impl};
    }

    public x6d0(View view, sls slsVar, sls slsVar2, b5d0 b5d0Var) {
        this.a = slsVar;
        this.b = slsVar2;
        this.c = b5d0Var;
        this.d = new wv5(new a450(view, u9h0.family_avatar_view_image, 20));
    }

    public final ShapeableImageView a() {
        return (ShapeableImageView) this.d.a(f[0]);
    }

    public final void b(String str, boolean z) {
        sls slsVar = this.b;
        if (z) {
            a().setShapeAppearanceModel(this.e);
            a().setBackgroundColor(((Boolean) slsVar.invoke()).booleanValue() ? bb1.n(tpg0.plus_sdk_family_avatar_color_dark, a()) : bb1.n(tpg0.plus_sdk_family_avatar_color_light, a()));
            ((com.yandex.plus.glide.b) this.c).b(str).b(a());
        } else {
            ShapeableImageView a = a();
            b.a m = new b().m();
            m.c(0.0f);
            a.setShapeAppearanceModel(m.a());
            a().setImageResource(((Boolean) slsVar.invoke()).booleanValue() ? jxg0.plus_sdk_ic_family_not_accepted_dark : jxg0.plus_sdk_ic_family_not_accepted_light);
        }
    }
}
