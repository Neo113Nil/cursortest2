package flex.parser;

import defpackage.lyg;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00060\u0001j\u0002`\u0002R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lflex/parser/FlexParserException;", "Ljava/lang/IllegalArgumentException;", "Lkotlin/IllegalArgumentException;", "Llyg;", "error", "Llyg;", "getError", "()Llyg;", "flex-parser"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class FlexParserException extends IllegalArgumentException {
    private final lyg error;

    public FlexParserException(lyg lygVar) {
        super(lygVar.b(), lygVar.a());
        this.error = lygVar;
    }
}
