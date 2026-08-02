package defpackage;

import com.google.gson.internal.LazilyParsedNumber;
import com.google.gson.stream.JsonToken;

/* loaded from: classes11.dex */
public class yl11 extends nl11 {
    @Override // defpackage.nl11
    public final Object read(wdx wdxVar) {
        if (wdxVar.R() != JsonToken.NULL) {
            return new LazilyParsedNumber(wdxVar.nextString());
        }
        wdxVar.B0();
        return null;
    }

    @Override // defpackage.nl11
    public final void write(afx afxVar, Object obj) {
        afxVar.U((LazilyParsedNumber) obj);
    }
}
