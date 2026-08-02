package defpackage;

import com.yandex.go.payments.shared.wizard.welcome.CreateAccountView;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.yandex.taxi.scooters.presentation.feedback.ScootersFeedbackCard;

/* loaded from: classes13.dex */
public final /* synthetic */ class uw0 implements yjx, jms {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ uw0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if ((obj instanceof yjx) && (obj instanceof jms)) {
                    break;
                }
                break;
            case 1:
                if ((obj instanceof yjx) && (obj instanceof jms)) {
                    break;
                }
                break;
            default:
                if ((obj instanceof yjx) && (obj instanceof jms)) {
                    break;
                }
                break;
        }
        return jl40.l(getFunctionDelegate(), ((jms) obj).getFunctionDelegate());
    }

    @Override // defpackage.jms
    public final cms getFunctionDelegate() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return (sls) obj;
            case 1:
                return new FunctionReferenceImpl(0, (CreateAccountView) obj, CreateAccountView.class, "finishInput", "finishInput()V", 0);
            default:
                return new FunctionReferenceImpl(0, (ScootersFeedbackCard) obj, ScootersFeedbackCard.class, "closeCommentKeyboard", "closeCommentKeyboard()V", 0);
        }
    }

    public final int hashCode() {
        switch (this.a) {
        }
        return getFunctionDelegate().hashCode();
    }

    @Override // defpackage.yjx
    public final void onClose() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((sls) obj).invoke();
                break;
            case 1:
                ((CreateAccountView) obj).finishInput();
                break;
            default:
                ((ScootersFeedbackCard) obj).closeCommentKeyboard();
                break;
        }
    }
}
