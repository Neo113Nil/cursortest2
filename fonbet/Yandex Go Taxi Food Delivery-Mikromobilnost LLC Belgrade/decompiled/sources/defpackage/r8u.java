package defpackage;

import android.graphics.drawable.Drawable;
import com.yandex.go.tariffcard.ui.HeaderType;

/* loaded from: classes14.dex */
public final class r8u extends w8u {
    public final lt00 c;
    public final Drawable d;
    public final Drawable e;
    public final String f;

    public r8u(z9u z9uVar, lt00 lt00Var, Drawable drawable, Drawable drawable2) {
        super(z9uVar, HeaderType.MULTICLASS);
        this.c = lt00Var;
        this.d = drawable;
        this.e = drawable2;
        this.f = "TariffCardMulticlassHeader";
    }

    @Override // defpackage.e6v
    public final String getId() {
        return this.f;
    }
}
