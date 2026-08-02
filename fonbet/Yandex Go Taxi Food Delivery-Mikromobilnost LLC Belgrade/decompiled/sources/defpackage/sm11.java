package defpackage;

import com.google.gson.stream.JsonToken;

/* loaded from: classes11.dex */
public final class sm11 extends nl11 {
    public final /* synthetic */ int a;
    public final boolean b;

    public /* synthetic */ sm11(boolean z, int i) {
        this.a = i;
        this.b = z;
    }

    @Override // defpackage.nl11
    public final Object read(wdx wdxVar) {
        switch (this.a) {
            case 0:
                if (wdxVar.R() != JsonToken.NULL) {
                    return Double.valueOf(wdxVar.nextDouble());
                }
                wdxVar.B0();
                return null;
            default:
                if (wdxVar.R() != JsonToken.NULL) {
                    return Float.valueOf((float) wdxVar.nextDouble());
                }
                wdxVar.B0();
                return null;
        }
    }

    @Override // defpackage.nl11
    public final void write(afx afxVar, Object obj) {
        int i = this.a;
        boolean z = this.b;
        switch (i) {
            case 0:
                Number number = (Number) obj;
                if (number != null) {
                    double doubleValue = number.doubleValue();
                    if (z) {
                        um11.a(doubleValue);
                    }
                    afxVar.P(doubleValue);
                    break;
                } else {
                    afxVar.w();
                    break;
                }
            default:
                Number number2 = (Number) obj;
                if (number2 != null) {
                    float floatValue = number2.floatValue();
                    if (z) {
                        um11.a(floatValue);
                    }
                    if (!(number2 instanceof Float)) {
                        number2 = Float.valueOf(floatValue);
                    }
                    afxVar.U(number2);
                    break;
                } else {
                    afxVar.w();
                    break;
                }
        }
    }
}
