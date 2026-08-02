package defpackage;

import android.os.RemoteException;
import android.util.Log;
import java.util.List;

/* loaded from: classes.dex */
public abstract class zmx {
    public static final msg a = new msg("MediaSessionUtils", null);

    public static List a(uax uaxVar) {
        try {
            return uaxVar.n();
        } catch (RemoteException e) {
            Object[] objArr = {"getNotificationActions", uax.class.getSimpleName()};
            msg msgVar = a;
            Log.e(msgVar.a, msgVar.d("Unable to call %s on %s.", objArr), e);
            return null;
        }
    }

    public static int[] b(uax uaxVar) {
        try {
            return uaxVar.t();
        } catch (RemoteException e) {
            Object[] objArr = {"getCompactViewActionIndices", uax.class.getSimpleName()};
            msg msgVar = a;
            Log.e(msgVar.a, msgVar.d("Unable to call %s on %s.", objArr), e);
            return null;
        }
    }
}
