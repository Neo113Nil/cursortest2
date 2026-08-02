package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final class fa8 implements ky9 {
    public final /* synthetic */ int b;
    public final Context c;

    public /* synthetic */ fa8(Context context, int i) {
        this.b = i;
        this.c = context;
    }

    @Override // defpackage.ky9
    public final Typeface a() {
        int i = this.b;
        Context context = this.c;
        switch (i) {
            case 0:
                return e3o.a(context, R.font.ya_display_bold);
            case 1:
                return e3o.a(context, R.font.ya_bold);
            default:
                Typeface a = e3o.a(context, R.font.ym_headline_bold_font);
                if (a == null) {
                    a = Typeface.DEFAULT;
                }
                a.getClass();
                return a;
        }
    }

    @Override // defpackage.ky9
    public final Typeface b() {
        int i = this.b;
        Context context = this.c;
        switch (i) {
            case 0:
                return e3o.a(context, R.font.ya_display_light);
            case 1:
                return e3o.a(context, R.font.ya_light);
            default:
                Typeface a = e3o.a(context, R.font.ya_light);
                if (a == null) {
                    a = Typeface.DEFAULT;
                }
                a.getClass();
                return a;
        }
    }

    @Override // defpackage.ky9
    public final Typeface c() {
        int i = this.b;
        Context context = this.c;
        switch (i) {
            case 0:
                return e3o.a(context, R.font.ya_display_regular);
            case 1:
                return e3o.a(context, R.font.ya_regular);
            default:
                Typeface a = e3o.a(context, R.font.ya_regular);
                if (a == null) {
                    a = Typeface.DEFAULT;
                }
                a.getClass();
                return a;
        }
    }

    @Override // defpackage.ky9
    public final Typeface d() {
        int i = this.b;
        Context context = this.c;
        switch (i) {
            case 0:
                return e3o.a(context, R.font.ya_display_medium);
            case 1:
                return e3o.a(context, R.font.ya_medium);
            default:
                Typeface a = e3o.a(context, R.font.ya_medium);
                if (a == null) {
                    a = Typeface.DEFAULT;
                }
                a.getClass();
                return a;
        }
    }
}
