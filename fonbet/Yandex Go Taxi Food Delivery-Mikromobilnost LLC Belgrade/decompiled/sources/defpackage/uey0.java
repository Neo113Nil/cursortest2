package defpackage;

import com.yandex.div.json.ParsingException;
import com.yandex.div.json.ParsingExceptionReason;
import com.yandex.div.storage.templates.TemplatesContainer;
import com.yandex.div.storage.util.CardErrorTransformer;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0010\u0018\u0000 \u00102\u00020\u0001:\u0001\u000bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Luey0;", "Lcom/yandex/div/storage/util/CardErrorTransformer;", "Lcom/yandex/div/storage/templates/TemplatesContainer;", "templateContainer", "Leg90;", "internalLogger", "<init>", "(Lcom/yandex/div/storage/templates/TemplatesContainer;Leg90;)V", "Lcom/yandex/div/storage/util/CardErrorTransformer$CardDetailedErrorException;", "cardError", "", "a", "(Lcom/yandex/div/storage/util/CardErrorTransformer$CardDetailedErrorException;)Z", "Lcom/yandex/div/storage/templates/TemplatesContainer;", "b", "Leg90;", "c", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes11.dex */
public class uey0 implements CardErrorTransformer {

    /* renamed from: c, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* renamed from: a, reason: from kotlin metadata */
    private final TemplatesContainer templateContainer;

    /* renamed from: b, reason: from kotlin metadata */
    private final eg90 internalLogger;

    public uey0(TemplatesContainer templatesContainer, eg90 eg90Var) {
        this.templateContainer = templatesContainer;
        this.internalLogger = eg90Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x000a, code lost:
    
        r0 = defpackage.vey0.b(r0);
     */
    @Override // com.yandex.div.storage.util.CardErrorTransformer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(CardErrorTransformer.CardDetailedErrorException cardError) {
        String b;
        ParsingException a = INSTANCE.a(cardError);
        if (a == null || b == null) {
            return false;
        }
        String cardId = cardError.getCardId();
        j7o f = this.templateContainer.f(cardId, cardError.getGroupId(), b);
        Map<String, String> a2 = f.a();
        StringBuilder x = unr0.x("missing template = ", b, ", reason = ");
        x.append(f.getShortReason());
        this.internalLogger.a(new CardErrorTransformer.CardDetailedErrorException(cardId, x.toString(), cardError, cardId, a2, cardError.getGroupId(), cardError.getMetadata()));
        return true;
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Luey0$a;", "", "<init>", "()V", "", "cardError", "Lcom/yandex/div/json/ParsingException;", "a", "(Ljava/lang/Throwable;)Lcom/yandex/div/json/ParsingException;", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: uey0$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final ParsingException a(Throwable cardError) {
            if (!(cardError instanceof ParsingException)) {
                Throwable cause = cardError.getCause();
                if (cause == null) {
                    return null;
                }
                return a(cause);
            }
            ParsingException parsingException = (ParsingException) cardError;
            if (parsingException.getReason() == ParsingExceptionReason.MISSING_TEMPLATE) {
                return parsingException;
            }
            Throwable cause2 = cardError.getCause();
            if (cause2 == null) {
                return null;
            }
            return a(cause2);
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }
}
