package defpackage;

import com.google.gson.stream.JsonToken;

/* loaded from: classes11.dex */
public class tl11 extends nl11 {
    @Override // defpackage.nl11
    public final Object read(wdx wdxVar) {
        if (wdxVar.R() != JsonToken.NULL) {
            return Long.valueOf(wdxVar.nextLong());
        }
        wdxVar.B0();
        return null;
    }

    @Override // defpackage.nl11
    public final void write(afx afxVar, Object obj) {
        Number number = (Number) obj;
        if (number == null) {
            afxVar.w();
        } else {
            afxVar.W(number.toString());
        }
    }
}
