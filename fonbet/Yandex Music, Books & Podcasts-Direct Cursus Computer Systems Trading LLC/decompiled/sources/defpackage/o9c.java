package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import java.io.File;

/* loaded from: classes.dex */
public final class o9c implements o2o {
    public final /* synthetic */ int a;

    public /* synthetic */ o9c(int i) {
        this.a = i;
    }

    @Override // defpackage.o2o
    public final /* bridge */ /* synthetic */ boolean a(Object obj, pwj pwjVar) {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            default:
                break;
        }
        return true;
    }

    @Override // defpackage.o2o
    public final k2o b(Object obj, int i, int i2, pwj pwjVar) {
        switch (this.a) {
            case 0:
                return new sn3((File) obj);
            case 1:
                return new sn3((Bitmap) obj);
            default:
                Drawable drawable = (Drawable) obj;
                if (drawable != null) {
                    return new qcd(drawable, 1);
                }
                return null;
        }
    }
}
