package defpackage;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.yandex.alicekit.core.slideup.SlidingBehavior;
import io.requery.android.database.sqlite.SQLiteDatabase;

/* loaded from: classes3.dex */
public final class x0a {
    public float a = 0.0f;
    public float b = 0.0f;
    public int c = 0;

    public final void a(int i, float f, int i2) {
        this.a = 0.0f;
        this.b = 0.0f;
        this.c = 0;
        switch (i) {
            case 1:
            case 16:
                this.a = f / 2;
                break;
            case 3:
            case UibcKeyCode.TV_KEYCODE_0 /* 48 */:
                break;
            case 5:
            case SlidingBehavior.WIDE_EXPANDED_PERCENTAGE /* 80 */:
                this.a = f;
                break;
            case 16777216:
            case 268435456:
                int i3 = y0a.b;
                float f2 = f / (i2 * 2);
                this.a = f2;
                float f3 = 2;
                this.b = f2 * f3;
                this.c = (int) (f2 / f3);
                break;
            case 33554432:
            case SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING /* 536870912 */:
                int i4 = y0a.b;
                this.b = i2 != 1 ? f / (i2 - 1) : 0.0f;
                break;
            case 67108864:
            case 1073741824:
                int i5 = y0a.b;
                float f4 = f / (i2 + 1);
                this.a = f4;
                this.b = f4;
                this.c = (int) (f4 / 2);
                break;
            default:
                xq0.q(k5r.i(i, "Invalid gravity is set: "));
                break;
        }
    }
}
