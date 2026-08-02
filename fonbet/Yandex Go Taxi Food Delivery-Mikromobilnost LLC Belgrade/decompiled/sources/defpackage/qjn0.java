package defpackage;

import com.yandex.go.scooters.misc.error_dialog.ScootersErrorDialogAnalytics$TappedButton;
import java.util.Iterator;

/* loaded from: classes13.dex */
public final class qjn0 {
    public static ScootersErrorDialogAnalytics$TappedButton a(String str) {
        Object obj;
        Iterator<E> it = ScootersErrorDialogAnalytics$TappedButton.c().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (jl40.l(((ScootersErrorDialogAnalytics$TappedButton) obj).getMetricaName(), str)) {
                break;
            }
        }
        ScootersErrorDialogAnalytics$TappedButton scootersErrorDialogAnalytics$TappedButton = (ScootersErrorDialogAnalytics$TappedButton) obj;
        return scootersErrorDialogAnalytics$TappedButton == null ? ScootersErrorDialogAnalytics$TappedButton.CANCEL : scootersErrorDialogAnalytics$TappedButton;
    }
}
