package defpackage;

import android.os.LocaleList;
import android.os.SystemClock;
import android.view.MotionEvent;
import java.util.ArrayList;
import java.util.Locale;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class LTGLyn7xQ extends h50 implements wu {
    public final /* synthetic */ c AvO7iQsrTN;
    public final /* synthetic */ int EljAMC1QTz;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LTGLyn7xQ(c cVar, int i) {
        super(0);
        this.EljAMC1QTz = i;
        this.AvO7iQsrTN = cVar;
    }

    @Override // defpackage.wu
    public final Object GWasM1elztuh() {
        int actionMasked;
        int i = this.EljAMC1QTz;
        c cVar = this.AvO7iQsrTN;
        switch (i) {
            case 0:
                Boolean bool = (Boolean) cVar.Y6hRI1cF8.getValue();
                bool.getClass();
                return bool;
            case 1:
                LocaleList locales = cVar.getConfiguration().getLocales();
                hb0 hb0Var = new hb0(new ib0(locales));
                if (locales.isEmpty()) {
                    hb0Var = new hb0(new ib0(LocaleList.getDefault()));
                }
                LocaleList localeList = hb0Var.GWasM1elztuh.GWasM1elztuh;
                int size = localeList.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i2 = 0; i2 < size; i2++) {
                    Locale locale = localeList.get(i2);
                    locale.getClass();
                    arrayList.add(new fb0(locale));
                }
                return new gb0(arrayList);
            case 2:
                MotionEvent motionEvent = cVar.cTIXpaxc;
                if (motionEvent != null && ((actionMasked = motionEvent.getActionMasked()) == 7 || actionMasked == 9)) {
                    cVar.bCsSzSHkbaQ = SystemClock.uptimeMillis();
                    cVar.post(cVar.j6IIN2O8eOU);
                }
                return kc1.GWasM1elztuh;
            default:
                cVar.get_viewTreeOwners();
                return null;
        }
    }
}
