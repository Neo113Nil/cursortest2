package defpackage;

import android.graphics.Paint;
import android.widget.TextView;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.video.m3.data.PlaybackParameters;

/* loaded from: classes.dex */
public final class qas extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object t;
    public final /* synthetic */ Object u;
    public final /* synthetic */ Object v;
    public final /* synthetic */ Object w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qas(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        super(1);
        this.r = i;
        this.s = obj;
        this.t = obj2;
        this.u = obj3;
        this.v = obj4;
        this.w = obj5;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.r;
        Object obj2 = this.w;
        Object obj3 = this.v;
        Object obj4 = this.u;
        Object obj5 = this.t;
        Object obj6 = this.s;
        switch (i) {
            case 0:
                opf opfVar = (opf) obj;
                opfVar.a();
                ou3 ou3Var = opfVar.a;
                float e = ((kw6) obj6).c.e();
                if (e != 0.0f) {
                    long j = ((ybs) obj4).b;
                    int i2 = rds.c;
                    int d = ((mnj) obj5).d((int) (j >> 32));
                    dds d2 = ((axf) obj3).d();
                    ynn b = d2 != null ? d2.a.b.b(d) : new ynn(0.0f, 0.0f, 0.0f, 0.0f);
                    float floor = (float) Math.floor(opfVar.n0(ras.a));
                    if (floor < 1.0f) {
                        floor = 1.0f;
                    }
                    float f = floor / 2;
                    float f2 = b.a + f;
                    float intBitsToFloat = Float.intBitsToFloat((int) (ou3Var.e() >> 32)) - f;
                    if (f2 > intBitsToFloat) {
                        f2 = intBitsToFloat;
                    }
                    if (f2 >= f) {
                        f = f2;
                    }
                    float floor2 = ((int) floor) % 2 == 1 ? ((float) Math.floor(f)) + 0.5f : (float) Math.rint(f);
                    long floatToRawIntBits = (Float.floatToRawIntBits(floor2) << 32) | (Float.floatToRawIntBits(b.b) & 4294967295L);
                    long floatToRawIntBits2 = (Float.floatToRawIntBits(floor2) << 32) | (Float.floatToRawIntBits(b.d) & 4294967295L);
                    f3r f3rVar = (f3r) obj2;
                    mu3 mu3Var = ou3Var.a.c;
                    gh0 gh0Var = ou3Var.d;
                    if (gh0Var == null) {
                        gh0Var = hld.p();
                        gh0Var.l(1);
                        ou3Var.d = gh0Var;
                    }
                    Paint paint = gh0Var.a;
                    f3rVar.a(e, ou3Var.e(), gh0Var);
                    if (!Intrinsics.d(gh0Var.d, null)) {
                        gh0Var.f(null);
                    }
                    if (gh0Var.b != 3) {
                        gh0Var.d(3);
                    }
                    if (paint.getStrokeWidth() != floor) {
                        gh0Var.k(floor);
                    }
                    if (paint.getStrokeMiter() != 4.0f) {
                        paint.setStrokeMiter(4.0f);
                    }
                    if (gh0Var.a() != 0) {
                        gh0Var.i(0);
                    }
                    if (gh0Var.b() != 0) {
                        gh0Var.j(0);
                    }
                    if (!paint.isFilterBitmap()) {
                        gh0Var.g(1);
                    }
                    mu3Var.g(floatToRawIntBits, floatToRawIntBits2, gh0Var);
                }
                break;
            case 1:
                woe.a((TextView) obj6, (szb) obj5, (szb) obj4, (szb) obj3, (xzb) obj2);
                break;
            case 2:
                xqn xqnVar = (xqn) obj6;
                if (!Intrinsics.d(xqnVar.a, obj)) {
                    xqnVar.a = obj;
                    hyf.K((gc8) obj5, (String) obj4, ((p9) obj3).E(obj), ((e23) obj2).b);
                }
                break;
            default:
                jom jomVar = (jom) obj;
                jomVar.getClass();
                jomVar.e = (String) obj6;
                jomVar.f = (String) obj5;
                jomVar.g = null;
                jomVar.h = (Long) obj4;
                Map o = ((cbw) obj3).h.o();
                jomVar.j = o != null ? uah.o(o) : null;
                PlaybackParameters playbackParameters = (PlaybackParameters) obj2;
                jomVar.k = Boolean.valueOf(playbackParameters.getPrepareWithoutInitCodecs());
                jomVar.l = Boolean.valueOf(playbackParameters.getPreferredH264());
                jomVar.m = Boolean.valueOf(playbackParameters.getIsOffline());
                jomVar.n = playbackParameters.getManifestDataSourceParameters();
                jomVar.o = playbackParameters.getChunkDataSourceParameters();
                break;
        }
        return Unit.a;
    }
}
