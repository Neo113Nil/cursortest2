package defpackage;

import java.text.DateFormatSymbols;
import java.util.Locale;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes10.dex */
public final /* synthetic */ class xqg implements o5z, jms {
    @Override // defpackage.o5z
    public final Locale a() {
        wf7 wf7Var = wf7.a;
        Locale locale = Locale.getDefault();
        return !j73.y(DateFormatSymbols.getAvailableLocales(), locale) ? Locale.ENGLISH : locale;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof o5z) && (obj instanceof jms)) {
            return jl40.l(getFunctionDelegate(), ((jms) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // defpackage.jms
    public final cms getFunctionDelegate() {
        return new FunctionReferenceImpl(0, wf7.a, wf7.class, "getCurrentLocaleWithFallback", "getCurrentLocaleWithFallback()Ljava/util/Locale;", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
