package a1;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.os.LocaleList;
import l1.AbstractC4672g;

/* renamed from: a1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0428a extends Paint {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4224a;

    @Override // android.graphics.Paint
    public void setAlpha(int i) {
        switch (this.f4224a) {
            case 0:
                if (Build.VERSION.SDK_INT >= 30) {
                    super.setAlpha(AbstractC4672g.c(i));
                    break;
                } else {
                    setColor((AbstractC4672g.c(i) << 24) | (getColor() & 16777215));
                    break;
                }
            default:
                super.setAlpha(i);
                break;
        }
    }

    @Override // android.graphics.Paint
    public void setTextLocales(LocaleList localeList) {
        switch (this.f4224a) {
            case 0:
                break;
            default:
                super.setTextLocales(localeList);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0428a(int i, int i4) {
        super(i);
        this.f4224a = i4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0428a(PorterDuff.Mode mode) {
        super(1);
        this.f4224a = 0;
        setXfermode(new PorterDuffXfermode(mode));
    }

    private final void a(LocaleList localeList) {
    }
}
