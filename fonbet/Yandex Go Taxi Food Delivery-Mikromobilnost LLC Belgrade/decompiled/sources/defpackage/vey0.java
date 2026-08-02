package defpackage;

import com.yandex.div.json.ParsingException;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\"\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/yandex/div/json/ParsingException;", "", "b", "(Lcom/yandex/div/json/ParsingException;)Ljava/lang/String;", "templateName", "div-storage_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class vey0 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String b(ParsingException parsingException) {
        String message = parsingException.getMessage();
        if (message == null) {
            return null;
        }
        return cvu0.v(cvu0.v(message, "Template '", "", false), "' is missing!", "", false);
    }
}
