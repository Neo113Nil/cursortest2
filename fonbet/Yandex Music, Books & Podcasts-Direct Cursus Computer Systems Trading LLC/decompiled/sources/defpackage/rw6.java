package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class rw6 extends uif implements Function0 {
    public final /* synthetic */ long r;
    public final /* synthetic */ int s;
    public final /* synthetic */ Canvas t;
    public final /* synthetic */ Paint u;
    public final /* synthetic */ int v;
    public final /* synthetic */ float w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rw6(sw6 sw6Var, long j, int i, Canvas canvas, Paint paint, int i2, float f) {
        super(0);
        this.r = j;
        this.s = i;
        this.t = canvas;
        this.u = paint;
        this.v = i2;
        this.w = f;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.s;
        xof xofVar = xof.a;
        long j = this.r;
        float c = nmq.c(j) / 2.0f;
        long floatToRawIntBits = (Float.floatToRawIntBits(c) << 32) | (Float.floatToRawIntBits(c) & 4294967295L);
        jgo l = cb0.l(ywf.d(0L, j), floatToRawIntBits, floatToRawIntBits, floatToRawIntBits, floatToRawIntBits);
        new byj(l);
        float f = this.v;
        Canvas canvas = this.t;
        Paint paint = this.u;
        float f2 = this.w;
        if (cb0.B(l)) {
            float intBitsToFloat = Float.intBitsToFloat((int) (l.e >> 32));
            canvas.drawRoundRect(f, f2 - (l.a() / 2.0f), (l.b() * i) + f, (l.a() / 2.0f) + f2, intBitsToFloat, intBitsToFloat, paint);
        } else {
            nh0 a = ph0.a();
            eak.a(a, l);
            canvas.save();
            canvas.translate(f, f2 - (l.a() / 2.0f));
            canvas.drawPath(a.a, paint);
            canvas.restore();
        }
        return Unit.a;
    }
}
