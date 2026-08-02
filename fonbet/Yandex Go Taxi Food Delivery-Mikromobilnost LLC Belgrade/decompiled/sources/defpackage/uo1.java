package defpackage;

import com.yandex.go.ai_widget.data.model.AiWidgetEvaluationResponse;
import com.yandex.go.ai_widget.data.model.f;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class uo1 implements vo1 {
    public final AiWidgetEvaluationResponse a;

    static {
        f fVar = AiWidgetEvaluationResponse.Companion;
    }

    public uo1(AiWidgetEvaluationResponse aiWidgetEvaluationResponse) {
        this.a = aiWidgetEvaluationResponse;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uo1) && this.a.equals(((uo1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Success(response=" + this.a + Extension.C_BRAKE;
    }
}
