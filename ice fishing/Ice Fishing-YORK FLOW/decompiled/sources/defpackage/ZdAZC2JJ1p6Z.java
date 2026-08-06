package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
@defpackage.xq0("activity")
/* loaded from: classes.dex */
public class ZdAZC2JJ1p6Z extends defpackage.yq0 {
    public final android.app.Activity fWTAfUmVKrZq;

    public ZdAZC2JJ1p6Z(android.content.Context context) {
        java.lang.Object obj;
        context.getClass();
        java.util.Iterator it = defpackage.fc1.GcLuU6pT9wO9(context, new defpackage.awuGf4qH8HFd(0)).iterator();
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
        this.fWTAfUmVKrZq = (android.app.Activity) obj;
    }

    @Override // defpackage.yq0
    public final defpackage.np0 ZpBGe2uQfcn8() {
        return new defpackage.Wx2ec0FCRg9J(this);
    }

    @Override // defpackage.yq0
    public final defpackage.np0 fWTAfUmVKrZq(defpackage.np0 np0Var) {
        throw new java.lang.IllegalStateException(("Destination " + ((defpackage.Wx2ec0FCRg9J) np0Var).oh71FJcDz6S2.ZpBGe2uQfcn8 + " does not have an Intent set.").toString());
    }

    @Override // defpackage.yq0
    public final boolean oh71FJcDz6S2() {
        android.app.Activity activity = this.fWTAfUmVKrZq;
        if (activity == null) {
            return false;
        }
        activity.finish();
        return true;
    }
}
