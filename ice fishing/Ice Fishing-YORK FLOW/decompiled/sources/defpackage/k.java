package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class k extends defpackage.lc0 implements defpackage.n10 {
    public final /* synthetic */ defpackage.u QiMR8OkAhezm;
    public final /* synthetic */ int oh71FJcDz6S2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(defpackage.u uVar, int i) {
        super(0);
        this.oh71FJcDz6S2 = i;
        this.QiMR8OkAhezm = uVar;
    }

    @Override // defpackage.n10
    public final java.lang.Object ZpBGe2uQfcn8() {
        int actionMasked;
        int i = this.oh71FJcDz6S2;
        defpackage.u uVar = this.QiMR8OkAhezm;
        switch (i) {
            case 0:
                java.lang.Boolean bool = (java.lang.Boolean) uVar.w7APNrr0aGRc.getValue();
                bool.getClass();
                return bool;
            case 1:
                android.os.LocaleList locales = uVar.getConfiguration().getLocales();
                defpackage.pi0 pi0Var = new defpackage.pi0(new defpackage.qi0(locales));
                if (locales.isEmpty()) {
                    pi0Var = new defpackage.pi0(new defpackage.qi0(android.os.LocaleList.getDefault()));
                }
                android.os.LocaleList localeList = pi0Var.ZpBGe2uQfcn8.ZpBGe2uQfcn8;
                int size = localeList.size();
                java.util.ArrayList arrayList = new java.util.ArrayList(size);
                for (int i2 = 0; i2 < size; i2++) {
                    java.util.Locale locale = localeList.get(i2);
                    locale.getClass();
                    arrayList.add(new defpackage.ni0(locale));
                }
                return new defpackage.oi0(arrayList);
            case 2:
                android.view.MotionEvent motionEvent = uVar.TlJvUa0ZXCBu;
                if (motionEvent != null && ((actionMasked = motionEvent.getActionMasked()) == 7 || actionMasked == 9)) {
                    uVar.ZEXjjCYihNTt = android.os.SystemClock.uptimeMillis();
                    uVar.post(uVar.Ux2tdpxXtKdg);
                }
                return defpackage.gs1.ZpBGe2uQfcn8;
            default:
                uVar.get_viewTreeOwners();
                return null;
        }
    }
}
