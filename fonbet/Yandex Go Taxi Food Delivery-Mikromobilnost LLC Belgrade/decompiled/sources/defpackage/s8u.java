package defpackage;

import android.graphics.drawable.Drawable;
import com.yandex.go.tariffcard.ui.HeaderType;

/* loaded from: classes14.dex */
public final class s8u extends w8u {
    public final Drawable c;
    public final String d;

    public s8u(z9u z9uVar, Drawable drawable) {
        super(z9uVar, HeaderType.STANDARD);
        this.c = drawable;
        this.d = "TariffCardStandardHeader";
    }

    @Override // defpackage.e6v
    public final String getId() {
        return this.d;
    }
}
