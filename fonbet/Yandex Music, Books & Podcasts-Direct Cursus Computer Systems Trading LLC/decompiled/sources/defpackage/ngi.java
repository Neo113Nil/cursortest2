package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ru.yandex.music.R;

/* loaded from: classes.dex */
public final class ngi extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ int s;
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ngi(Object obj, int i, int i2, int i3) {
        super(1);
        this.r = i3;
        this.u = obj;
        this.s = i;
        this.t = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.r;
        int i2 = this.s;
        Object obj2 = this.u;
        int i3 = this.t;
        switch (i) {
            case 0:
                t5k t5kVar = (t5k) obj;
                nh0 nh0Var = (nh0) obj2;
                ih0 ih0Var = t5kVar.a;
                int d = t5kVar.d(i2);
                int d2 = t5kVar.d(i3);
                CharSequence charSequence = (CharSequence) ih0Var.e;
                if (d < 0 || d > d2 || d2 > charSequence.length()) {
                    StringBuilder l = dfi.l("start(", d, d2, ") or end(", ") is out of range [0..");
                    l.append(charSequence.length());
                    l.append("], or start > end!");
                    tme.a(l.toString());
                }
                Path path = new Path();
                ads adsVar = (ads) ih0Var.d;
                adsVar.f.getSelectionPath(d, d2, path);
                int i4 = adsVar.h;
                if (i4 != 0 && !path.isEmpty()) {
                    path.offset(0.0f, i4);
                }
                float f = t5kVar.f;
                long floatToRawIntBits = (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f) & 4294967295L);
                Matrix matrix = new Matrix();
                matrix.setTranslate(Float.intBitsToFloat((int) (floatToRawIntBits >> 32)), Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L)));
                path.transform(matrix);
                int i5 = (int) 0;
                nh0Var.a.addPath(path, Float.intBitsToFloat(i5), Float.intBitsToFloat(i5));
                break;
            default:
                bqo bqoVar = (bqo) obj;
                xpo xpoVar = (xpo) obj2;
                if (bqoVar instanceof ypo) {
                    ((thk) xpoVar.x()).a.setText(R.string.paymentsdk_challenger_sms_description);
                    ((thk) xpoVar.x()).a.setTextColor(i2);
                } else if (bqoVar instanceof aqo) {
                    ((thk) xpoVar.x()).a.setText(R.string.paymentsdk_challenger_sms_description);
                    ((thk) xpoVar.x()).a.setTextColor(i3);
                } else if (bqoVar instanceof zpo) {
                    ((thk) xpoVar.x()).a.setTextColor(i3);
                    ((thk) xpoVar.x()).a.setText(R.string.paymentsdk_challenger_sms_description_error);
                }
                break;
        }
        return Unit.a;
    }
}
