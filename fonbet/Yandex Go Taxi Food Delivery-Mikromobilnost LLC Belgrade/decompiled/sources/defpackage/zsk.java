package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.yandex.div.legacy.view.RatioImageView;
import com.yandex.go.feed.global.div.custom.time_slot_histogram.TimeSlotHistogramSlotView;
import com.yandex.images.ImageManager$From;
import java.lang.ref.WeakReference;

/* loaded from: classes15.dex */
public final class zsk extends btk {
    public final /* synthetic */ int a;
    public final Object b;

    public zsk(RatioImageView ratioImageView) {
        this.a = 0;
        this.b = new WeakReference(ratioImageView);
    }

    private final void h() {
    }

    private final void i(Throwable th) {
    }

    private final void j() {
    }

    @Override // defpackage.btk
    public String a() {
        switch (this.a) {
            case 1:
                return ((l9y) this.b).a;
            default:
                return super.a();
        }
    }

    @Override // defpackage.btk
    public void c() {
        switch (this.a) {
            case 1:
                break;
            default:
                super.c();
                break;
        }
    }

    @Override // defpackage.btk
    public void d(Throwable th) {
        int i = this.a;
    }

    @Override // defpackage.btk
    public void e() {
        int i = this.a;
    }

    @Override // defpackage.btk
    public void f(r8 r8Var) {
        Drawable drawable;
        switch (this.a) {
            case 2:
                TimeSlotHistogramSlotView timeSlotHistogramSlotView = (TimeSlotHistogramSlotView) this.b;
                if (!(r8Var instanceof thk)) {
                    if (!(r8Var instanceof uhk)) {
                        w511.b();
                        break;
                    } else {
                        drawable = ((uhk) r8Var).c;
                    }
                } else {
                    drawable = new BitmapDrawable(timeSlotHistogramSlotView.getContext().getResources(), ((thk) r8Var).c);
                }
                timeSlotHistogramSlotView.imageUrlDrawable = drawable;
                timeSlotHistogramSlotView.invalidate();
                break;
        }
    }

    @Override // defpackage.btk
    public void g(bd7 bd7Var) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ImageView imageView = (ImageView) ((WeakReference) obj).get();
                if (imageView != null) {
                    Bitmap bitmap = bd7Var.a;
                    int byteCount = bitmap.getByteCount();
                    if (byteCount >= 52428800) {
                        z83.j("Image size " + byteCount + " bytes is too large.\nMax allowed size 52428800 bytes");
                        break;
                    } else {
                        imageView.setImageBitmap(bitmap);
                        break;
                    }
                } else {
                    z83.j("Unable to set image. ImageView was cleared.");
                    break;
                }
            case 1:
                l9y l9yVar = (l9y) obj;
                int i2 = zxk.b[bd7Var.d.ordinal()];
                l9yVar.e(new ad7(bd7Var.a, bd7Var.c, bd7Var.b, i2 != 1 ? i2 != 2 ? ImageManager$From.NETWORK : ImageManager$From.MEMORY : ImageManager$From.DISK));
                break;
        }
    }

    public /* synthetic */ zsk(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
