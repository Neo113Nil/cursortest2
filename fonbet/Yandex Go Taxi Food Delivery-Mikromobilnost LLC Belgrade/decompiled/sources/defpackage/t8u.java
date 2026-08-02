package defpackage;

import android.graphics.drawable.Drawable;
import com.yandex.go.tariffcard.ui.HeaderType;

/* loaded from: classes14.dex */
public final class t8u extends w8u {
    public final Drawable c;
    public final odu d;
    public final String e;

    public t8u(z9u z9uVar, Drawable drawable, odu oduVar) {
        super(z9uVar, HeaderType.ULTIMA);
        this.c = drawable;
        this.d = oduVar;
        this.e = "TariffCardUltimaHeader";
    }

    @Override // defpackage.e6v
    public final String getId() {
        return this.e;
    }
}
