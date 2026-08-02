package defpackage;

import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.JsonToken;

/* loaded from: classes11.dex */
public class qm11 extends nl11 {
    @Override // defpackage.nl11
    public final Object read(wdx wdxVar) {
        if (wdxVar.R() == JsonToken.NULL) {
            wdxVar.B0();
            return null;
        }
        try {
            return Integer.valueOf(wdxVar.nextInt());
        } catch (NumberFormatException e) {
            throw new JsonSyntaxException(e);
        }
    }

    @Override // defpackage.nl11
    public final void write(afx afxVar, Object obj) {
        if (((Number) obj) == null) {
            afxVar.w();
        } else {
            afxVar.R(r4.intValue());
        }
    }
}
