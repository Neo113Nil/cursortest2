package defpackage;

@defpackage.no0("activity")
/* loaded from: classes.dex */
public class LoQIcHWpPq extends defpackage.oo0 {
    public final android.app.Activity r1MBDhnF;

    public LoQIcHWpPq(android.content.Context context) {
        java.lang.Object obj;
        context.getClass();
        java.util.Iterator it = defpackage.a81.yIx6ChFVk(context, new defpackage.JX5fKip1C6(1)).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((android.content.Context) obj) instanceof android.app.Activity) {
                    break;
                }
            }
        }
        this.r1MBDhnF = (android.app.Activity) obj;
    }

    @Override // defpackage.oo0
    public final defpackage.gn0 IHQe1A4L2xu() {
        return new defpackage.jjT5JLZla8(this);
    }

    @Override // defpackage.oo0
    public final defpackage.gn0 r1MBDhnF(defpackage.gn0 gn0Var) {
        throw new java.lang.IllegalStateException(("Destination " + ((defpackage.jjT5JLZla8) gn0Var).xiZrDbcSW0.IHQe1A4L2xu + " does not have an Intent set.").toString());
    }

    @Override // defpackage.oo0
    public final boolean xiZrDbcSW0() {
        android.app.Activity activity = this.r1MBDhnF;
        if (activity == null) {
            return false;
        }
        activity.finish();
        return true;
    }
}
