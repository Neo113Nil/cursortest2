package defpackage;

import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Rect;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final class rp8 {
    public final float a;
    public float b;
    public int c;
    public float d;
    public final Paint e;
    public final Rect f;
    public NinePatch g;
    public float h;
    public float i;
    public final /* synthetic */ tp8 j;

    public rp8(tp8 tp8Var) {
        this.j = tp8Var;
        float dimension = tp8Var.b.getContext().getResources().getDimension(R.dimen.div_shadow_elevation);
        this.a = dimension;
        this.b = dimension;
        this.c = -16777216;
        this.d = 0.14f;
        this.e = new Paint();
        this.f = new Rect();
        this.i = 0.5f;
    }
}
