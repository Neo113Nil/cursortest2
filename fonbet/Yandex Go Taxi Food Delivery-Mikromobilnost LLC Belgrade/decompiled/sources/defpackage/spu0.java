package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import java.util.Iterator;
import ru.yandex.taxi.communications.api.dto.Story;
import ru.yandex.taxi.stories.domain.a;

/* loaded from: classes6.dex */
public final class spu0 {
    public final gnu0 a;
    public final a b;
    public final Context c;
    public final gou0 d;

    public spu0(gnu0 gnu0Var, a aVar, Context context, gou0 gou0Var) {
        this.a = gnu0Var;
        this.b = aVar;
        this.c = context;
        this.d = gou0Var;
    }

    public final Bitmap a() {
        Context context = this.c;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(mrg0.story_card_width);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(mrg0.story_card_height);
        int color = context.getResources().getColor(lqg0.taxi_communications_story_placeholder);
        Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        paint.setColor(color);
        canvas.drawRect(0.0f, 0.0f, dimensionPixelSize, dimensionPixelSize2, paint);
        return createBitmap;
    }

    public final View b() {
        Story d = this.b.d();
        String str = d != null ? d.b : null;
        if (str == null) {
            str = (String) this.d.c.get(0);
        }
        Iterator it = this.a.c.iterator();
        while (it.hasNext()) {
            View c = ((fnu0) it.next()).c(str);
            if (c != null) {
                return c;
            }
        }
        return null;
    }
}
