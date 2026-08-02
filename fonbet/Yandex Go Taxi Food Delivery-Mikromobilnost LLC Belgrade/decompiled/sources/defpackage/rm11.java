package defpackage;

import com.google.gson.JsonSyntaxException;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes11.dex */
public class rm11 extends nl11 {
    @Override // defpackage.nl11
    public final Object read(wdx wdxVar) {
        try {
            return new AtomicInteger(wdxVar.nextInt());
        } catch (NumberFormatException e) {
            throw new JsonSyntaxException(e);
        }
    }

    @Override // defpackage.nl11
    public final void write(afx afxVar, Object obj) {
        afxVar.R(((AtomicInteger) obj).get());
    }
}
