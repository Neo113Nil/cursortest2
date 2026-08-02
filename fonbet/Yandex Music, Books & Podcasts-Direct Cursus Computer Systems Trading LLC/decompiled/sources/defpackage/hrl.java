package defpackage;

import android.widget.ImageView;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class hrl {
    public final uif a;
    public final int b;
    public boolean c;
    public boolean d = false;
    public ImageView.ScaleType e = ImageView.ScaleType.FIT_CENTER;

    /* JADX WARN: Multi-variable type inference failed */
    public hrl(int i, Function0 function0, boolean z) {
        this.a = (uif) function0;
        this.b = i;
        this.c = z;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlayerViewSurface(type=");
        sb.append(this.b);
        sb.append(", isReadyForDisplay=");
        sb.append(this.d);
        sb.append(", isActive=");
        return dfi.j(sb, this.c, ')');
    }
}
