package defpackage;

import java.util.Map;
import java.util.Set;
import ru.yandex.taxi.scooters.presentation.feedback.ScootersFeedbackCard;
import ru.yandex.taxi.scooters.presentation.feedback.ScootersFeedbackItemsSelectionComponent;

/* loaded from: classes13.dex */
public final /* synthetic */ class vkn0 implements tls {
    public final /* synthetic */ int a;

    public /* synthetic */ vkn0(int i) {
        this.a = i;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        zy11 onRatingChangeListener$lambda$0;
        zy11 onCommentFocusedListener$lambda$0;
        boolean selectedItems$lambda$0;
        Set selectedItems$lambda$1;
        fln0 selectedItems$lambda$2;
        CharSequence bindFeedbackItemTreeNodeList$lambda$0;
        int i = this.a;
        int i2 = 19;
        int i3 = 20;
        zy11 zy11Var = zy11.a;
        switch (i) {
            case 0:
                break;
            case 1:
                onRatingChangeListener$lambda$0 = ScootersFeedbackCard.onRatingChangeListener$lambda$0(((Integer) obj).intValue());
                break;
            case 2:
                onCommentFocusedListener$lambda$0 = ScootersFeedbackCard.onCommentFocusedListener$lambda$0((String) obj);
                break;
            case 3:
                selectedItems$lambda$0 = ScootersFeedbackItemsSelectionComponent.selectedItems$lambda$0((Map.Entry) obj);
                break;
            case 4:
                selectedItems$lambda$1 = ScootersFeedbackItemsSelectionComponent.selectedItems$lambda$1((Map.Entry) obj);
                break;
            case 5:
                selectedItems$lambda$2 = ScootersFeedbackItemsSelectionComponent.selectedItems$lambda$2((iln0) obj);
                break;
            case 6:
                bindFeedbackItemTreeNodeList$lambda$0 = ScootersFeedbackItemsSelectionComponent.bindFeedbackItemTreeNodeList$lambda$0((iln0) obj);
                break;
            case 7:
                ((ian0) obj).a.r(new v1n0(12));
                break;
            case 8:
                ian0 ian0Var = (ian0) obj;
                ian0Var.b.invoke(ian0Var.c);
                break;
            case 9:
                ((kpn0) obj).a.invoke();
                break;
            case 10:
                break;
            case 11:
                ((lpn0) obj).a.invoke();
                break;
            case 12:
                ((lpn0) obj).a.invoke();
                break;
            case 13:
                break;
            case 14:
                ((w3j0) obj).c(osn0.a, "timer_interval_ms");
                break;
            case 15:
                break;
            case 16:
                ((ntn0) obj).q0();
                break;
            case 17:
                ((ntn0) obj).o0();
                break;
            case 18:
                ((ntn0) obj).a();
                break;
            case 19:
                ((z6n0) obj).a.invoke();
                break;
            case 20:
                ((z6n0) obj).a.invoke();
                break;
            case 21:
                ((dun0) obj).a.r(new vkn0(i2));
                break;
            case 22:
                ((dun0) obj).a.r(new vkn0(i2));
                break;
            case 23:
                ((eun0) obj).a.r(new vkn0(i3));
                break;
            case 24:
                ((eun0) obj).a.r(new vkn0(i3));
                break;
            case 25:
                ((cgn0) obj).a.invoke();
                break;
            case 26:
                ((cgn0) obj).a.invoke();
                break;
            case 27:
                ((kzn0) obj).v0();
                break;
            case 28:
                ((kzn0) obj).onCancel();
                break;
            default:
                ((kzn0) obj).onCancel();
                break;
        }
        return zy11Var;
    }
}
