package defpackage;

import android.graphics.Bitmap;
import com.yandex.plus.ui.core.theme.PlusTheme;
import java.util.function.Supplier;

/* loaded from: classes9.dex */
public final /* synthetic */ class uyi implements Supplier {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ uyi(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return (Bitmap) obj;
            case 1:
                return new ley((iey) obj);
            case 2:
                return ((c2d0) obj).f.c();
            case 3:
                return Boolean.valueOf(((x2d0) obj).g.getValue() == PlusTheme.DARK);
            default:
                return (a6d0) obj;
        }
    }
}
