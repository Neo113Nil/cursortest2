package defpackage;

/* loaded from: classes.dex */
public final class n0 extends defpackage.p90 implements defpackage.vz {
    public final /* synthetic */ defpackage.v0 AARZUJiTa;
    public final /* synthetic */ int xiZrDbcSW0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n0(defpackage.v0 v0Var, int i) {
        super(0);
        this.xiZrDbcSW0 = i;
        this.AARZUJiTa = v0Var;
    }

    @Override // defpackage.vz
    public final java.lang.Object IHQe1A4L2xu() {
        int actionMasked;
        int i = this.xiZrDbcSW0;
        defpackage.v0 v0Var = this.AARZUJiTa;
        switch (i) {
            case 0:
                java.lang.Boolean bool = (java.lang.Boolean) v0Var.kNAkVymC.getValue();
                bool.getClass();
                return bool;
            case 1:
                android.os.LocaleList locales = v0Var.getConfiguration().getLocales();
                defpackage.gf0 gf0Var = new defpackage.gf0(new defpackage.hf0(locales));
                if (locales.isEmpty()) {
                    gf0Var = new defpackage.gf0(new defpackage.hf0(android.os.LocaleList.getDefault()));
                }
                android.os.LocaleList localeList = gf0Var.IHQe1A4L2xu.IHQe1A4L2xu;
                int size = localeList.size();
                java.util.ArrayList arrayList = new java.util.ArrayList(size);
                for (int i2 = 0; i2 < size; i2++) {
                    java.util.Locale locale = localeList.get(i2);
                    locale.getClass();
                    arrayList.add(new defpackage.ef0(locale));
                }
                return new defpackage.ff0(arrayList);
            case defpackage.gx0.FLOAT_FIELD_NUMBER /* 2 */:
                android.view.MotionEvent motionEvent = v0Var.Ay906ovssqgN;
                if (motionEvent != null && ((actionMasked = motionEvent.getActionMasked()) == 7 || actionMasked == 9)) {
                    v0Var.FisHbM7NmV = android.os.SystemClock.uptimeMillis();
                    v0Var.post(v0Var.WnQbjbWuMR);
                }
                return defpackage.ok1.IHQe1A4L2xu;
            default:
                v0Var.get_viewTreeOwners();
                return null;
        }
    }
}
