package defpackage;

import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.JsonToken;

/* loaded from: classes11.dex */
public class ul11 extends nl11 {
    @Override // defpackage.nl11
    public final Object read(wdx wdxVar) {
        if (wdxVar.R() == JsonToken.NULL) {
            wdxVar.B0();
            return null;
        }
        String nextString = wdxVar.nextString();
        if (nextString.length() == 1) {
            return Character.valueOf(nextString.charAt(0));
        }
        StringBuilder x = unr0.x("Expecting character, got: ", nextString, "; at ");
        x.append(wdxVar.w());
        throw new JsonSyntaxException(x.toString());
    }

    @Override // defpackage.nl11
    public final void write(afx afxVar, Object obj) {
        Character ch = (Character) obj;
        afxVar.W(ch == null ? null : String.valueOf(ch));
    }
}
