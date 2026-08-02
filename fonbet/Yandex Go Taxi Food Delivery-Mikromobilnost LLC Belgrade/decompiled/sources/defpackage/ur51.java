package defpackage;

import com.yandex.div.json.ParsingException;
import com.yandex.div.json.ParsingExceptionReason;

/* loaded from: classes3.dex */
public final class ur51 implements eg90 {
    public static final ur51 c = new ur51();

    @Override // defpackage.eg90
    public final void a(Exception exc) {
        String str;
        if (exc instanceof ParsingException) {
            ParsingException parsingException = (ParsingException) exc;
            ParsingExceptionReason reason = parsingException.getReason();
            int[] iArr = tr51.a;
            switch (iArr[reason.ordinal()]) {
                case 1:
                case 2:
                case 3:
                    switch (iArr[parsingException.getReason().ordinal()]) {
                        case 1:
                            str = "MISSING_TEMPLATE";
                            break;
                        case 2:
                            str = "TYPE_MISMATCH";
                            break;
                        case 3:
                            str = "DEPENDENCY_FAILED";
                            break;
                        case 4:
                            str = "MISSING_VARIABLE";
                            break;
                        case 5:
                            str = "INVALID_VALUE";
                            break;
                        case 6:
                            str = "MISSING_VALUE";
                            break;
                        default:
                            w511.b();
                            break;
                    }
                    x4c.g("Error when parsing divkit json", exc, b64.l("reason=", str, " ; summary=", parsingException.getJsonSummary()), null, 8);
                    break;
                case 4:
                case 5:
                case 6:
                    break;
                default:
                    w511.b();
                    break;
            }
        }
    }
}
