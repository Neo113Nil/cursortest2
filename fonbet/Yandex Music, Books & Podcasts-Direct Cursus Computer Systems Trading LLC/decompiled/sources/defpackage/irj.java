package defpackage;

import android.widget.ImageView;
import com.yandex.music.design.components.removable.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class irj implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ irj(nbg nbgVar, long j, int i) {
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_CROP;
        this.d = nbgVar;
        this.b = j;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                yci yciVar = (yci) this.d;
                ((Integer) obj2).getClass();
                int R = rvf.R(49);
                g0g.d(this.c, R, this.b, (hq5) obj, yciVar);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int R2 = rvf.R(this.c | 1);
                zwf.i(this.b, (wn5) this.d, (hq5) obj, R2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int R3 = rvf.R(this.c | 1);
                a.b((ja0) this.d, this.b, (hq5) obj, R3);
                break;
            default:
                nbg nbgVar = (nbg) this.d;
                ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_CROP;
                ((Integer) obj2).getClass();
                int R4 = rvf.R(this.c | 1);
                y1g.e(nbgVar, this.b, (hq5) obj, R4);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ irj(long j, wn5 wn5Var, int i) {
        this.b = j;
        this.d = wn5Var;
        this.c = i;
    }

    public /* synthetic */ irj(ja0 ja0Var, long j, int i) {
        this.d = ja0Var;
        this.b = j;
        this.c = i;
    }

    public /* synthetic */ irj(int i, int i2, long j, yci yciVar) {
        this.c = i;
        this.b = j;
        this.d = yciVar;
    }
}
