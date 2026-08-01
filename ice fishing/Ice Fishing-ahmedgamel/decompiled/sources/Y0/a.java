package Y0;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.os.LocaleList;
import j1.AbstractC4603g;

/* loaded from: classes.dex */
public final class a extends Paint {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3871a;

    @Override // android.graphics.Paint
    public void setAlpha(int i) {
        switch (this.f3871a) {
            case 0:
                if (Build.VERSION.SDK_INT >= 30) {
                    super.setAlpha(AbstractC4603g.c(i));
                    break;
                } else {
                    setColor((AbstractC4603g.c(i) << 24) | (getColor() & 16777215));
                    break;
                }
            default:
                super.setAlpha(i);
                break;
        }
    }

    @Override // android.graphics.Paint
    public void setTextLocales(LocaleList localeList) {
        switch (this.f3871a) {
            case 0:
                break;
            default:
                super.setTextLocales(localeList);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i, int i6) {
        super(i);
        this.f3871a = i6;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(PorterDuff.Mode mode) {
        super(1);
        this.f3871a = 0;
        setXfermode(new PorterDuffXfermode(mode));
    }

    private final void a(LocaleList localeList) {
    }
}
