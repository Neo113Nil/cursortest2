package skeletor.parser.exception;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lskeletor/parser/exception/TokenCreationException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "parser"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class TokenCreationException extends RuntimeException {
    public TokenCreationException(String str) {
        super("Tried to create an unsupported token: ".concat(str));
    }
}
