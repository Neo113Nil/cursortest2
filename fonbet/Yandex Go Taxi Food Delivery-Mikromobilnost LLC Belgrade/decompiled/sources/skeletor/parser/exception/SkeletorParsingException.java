package skeletor.parser.exception;

import defpackage.qoi0;
import defpackage.rms0;
import defpackage.scc;
import defpackage.vf90;
import defpackage.x43;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lskeletor/parser/exception/SkeletorParsingException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "", "cause", "Ljava/lang/Throwable;", "getCause", "()Ljava/lang/Throwable;", "Lvf90;", ClidProvider.STATE, "Lvf90;", "parser"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class SkeletorParsingException extends RuntimeException {
    private final Throwable cause;
    private final vf90 state;

    public SkeletorParsingException(RuntimeException runtimeException, vf90 vf90Var) {
        this.cause = runtimeException;
        this.state = vf90Var;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.cause;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        StringBuilder sb = new StringBuilder("Failed to parse expression\n");
        sb.append(this.state.c);
        sb.append('\n');
        int i = this.state.d - 1;
        for (int i2 = 0; i2 < i; i2++) {
            sb.append('.');
        }
        sb.append("^");
        int length = this.state.c.length() - this.state.d;
        for (int i3 = 0; i3 < length; i3++) {
            sb.append('.');
        }
        sb.append('\n');
        StringBuilder sb2 = new StringBuilder("Token stack: ");
        x43 x43Var = this.state.a;
        StringBuilder sb3 = new StringBuilder("[");
        int size = x43Var.size() - 1;
        for (int i4 = 0; i4 < size; i4++) {
            sb3.append(qoi0.a(((rms0) x43Var.get(i4)).getClass()).d());
            sb3.append(Extension.FIX_SPACE);
        }
        sb3.append(qoi0.a(((rms0) x43Var.get(scc.f(x43Var))).getClass()).d());
        sb3.append(']');
        sb2.append(sb3.toString());
        sb2.append('\n');
        sb.append(sb2.toString());
        sb.append("String builder: " + ((Object) this.state.b));
        return sb.toString();
    }
}
