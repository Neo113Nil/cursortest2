package defpackage;

import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.yandex.div.core.images.BitmapSource;

/* loaded from: classes2.dex */
public final class tht implements i7j0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ btk b;
    public final /* synthetic */ wls c;

    public /* synthetic */ tht(btk btkVar, wls wlsVar, int i) {
        this.a = i;
        this.b = btkVar;
        this.c = wlsVar;
    }

    @Override // defpackage.i7j0
    public final boolean a(Object obj, DataSource dataSource) {
        BitmapSource bitmapSource;
        BitmapSource bitmapSource2;
        int i = this.a;
        wls wlsVar = this.c;
        btk btkVar = this.b;
        switch (i) {
            case 0:
                int i2 = sht.a[dataSource.ordinal()];
                if (i2 == 1) {
                    bitmapSource = BitmapSource.NETWORK;
                } else if (i2 == 2) {
                    bitmapSource = BitmapSource.MEMORY;
                } else if (i2 != 3 && i2 != 4 && i2 != 5) {
                    w511.b();
                    break;
                } else {
                    bitmapSource = BitmapSource.DISK;
                }
                btkVar.g((bd7) wlsVar.invoke(obj, bitmapSource));
                break;
            default:
                int i3 = ccq0.a[dataSource.ordinal()];
                if (i3 == 1) {
                    bitmapSource2 = BitmapSource.NETWORK;
                } else if (i3 == 2) {
                    bitmapSource2 = BitmapSource.MEMORY;
                } else if (i3 != 3 && i3 != 4 && i3 != 5) {
                    w511.b();
                    break;
                } else {
                    bitmapSource2 = BitmapSource.DISK;
                }
                btkVar.g((bd7) wlsVar.invoke(obj, bitmapSource2));
                break;
        }
        return true;
    }

    @Override // defpackage.i7j0
    public final boolean b(GlideException glideException) {
        switch (this.a) {
            case 0:
                this.b.c();
                break;
            default:
                this.b.c();
                break;
        }
        return true;
    }
}
