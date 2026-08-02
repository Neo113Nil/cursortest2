package defpackage;

import android.content.res.ColorStateList;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import ru.yandex.taxi.design.utils.c;

/* loaded from: classes13.dex */
public final /* synthetic */ class tyr0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ ImageView b;

    public /* synthetic */ tyr0(AppCompatImageView appCompatImageView, int i) {
        this.a = i;
        this.b = appCompatImageView;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        ImageView imageView = this.b;
        switch (i) {
            case 0:
                imageView.setImageTintList(ColorStateList.valueOf(c.c(xng0.textMain, imageView)));
                break;
            default:
                imageView.setImageTintList(ColorStateList.valueOf(c.c(xng0.textMain, imageView)));
                break;
        }
        return zy11Var;
    }
}
