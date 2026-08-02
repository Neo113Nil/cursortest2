package defpackage;

import com.google.gson.stream.JsonToken;

/* loaded from: classes11.dex */
public class vl11 extends nl11 {
    @Override // defpackage.nl11
    public final Object read(wdx wdxVar) {
        JsonToken R = wdxVar.R();
        if (R != JsonToken.NULL) {
            return R == JsonToken.BOOLEAN ? Boolean.toString(wdxVar.nextBoolean()) : wdxVar.nextString();
        }
        wdxVar.B0();
        return null;
    }

    @Override // defpackage.nl11
    public final void write(afx afxVar, Object obj) {
        afxVar.W((String) obj);
    }
}
