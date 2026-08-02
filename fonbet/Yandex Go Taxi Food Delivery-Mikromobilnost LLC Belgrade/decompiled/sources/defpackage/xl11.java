package defpackage;

import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.JsonToken;
import java.math.BigInteger;

/* loaded from: classes11.dex */
public class xl11 extends nl11 {
    @Override // defpackage.nl11
    public final Object read(wdx wdxVar) {
        if (wdxVar.R() == JsonToken.NULL) {
            wdxVar.B0();
            return null;
        }
        String nextString = wdxVar.nextString();
        try {
            vtb1.c(nextString);
            return new BigInteger(nextString);
        } catch (NumberFormatException e) {
            StringBuilder x = unr0.x("Failed parsing '", nextString, "' as BigInteger; at path ");
            x.append(wdxVar.w());
            throw new JsonSyntaxException(x.toString(), e);
        }
    }

    @Override // defpackage.nl11
    public final void write(afx afxVar, Object obj) {
        afxVar.U((BigInteger) obj);
    }
}
