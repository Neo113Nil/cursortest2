package defpackage;

import android.content.Context;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.os.RemoteException;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public class okh {
    public final MediaController a;
    public final Object b = new Object();
    public final ArrayList c = new ArrayList();
    public final HashMap d = new HashMap();
    public final msh e;

    public okh(Context context, msh mshVar) {
        this.e = mshVar;
        Object obj = mshVar.b;
        obj.getClass();
        MediaController mediaController = new MediaController(context, (MediaSession.Token) obj);
        this.a = mediaController;
        if (mshVar.d() == null) {
            ss6 ss6Var = new ss6(null);
            ss6Var.b = new WeakReference(this);
            mediaController.sendCommand("android.support.v4.media.session.command.GET_EXTRA_BINDER", null, ss6Var);
        }
    }

    public final void a() {
        d9e d = this.e.d();
        if (d == null) {
            return;
        }
        ArrayList arrayList = this.c;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            zlh zlhVar = (zlh) it.next();
            mkh mkhVar = new mkh(zlhVar);
            this.d.put(zlhVar, mkhVar);
            zlhVar.c = mkhVar;
            try {
                d.G(mkhVar);
                zlhVar.i(13, null, null);
            } catch (RemoteException e) {
                Log.e("MediaControllerCompat", "Dead object in registerCallback.", e);
            }
        }
        arrayList.clear();
    }

    public final void b(zlh zlhVar) {
        MediaController mediaController = this.a;
        lkh lkhVar = zlhVar.a;
        lkhVar.getClass();
        mediaController.unregisterCallback(lkhVar);
        synchronized (this.b) {
            d9e d = this.e.d();
            if (d != null) {
                try {
                    mkh mkhVar = (mkh) this.d.remove(zlhVar);
                    if (mkhVar != null) {
                        zlhVar.c = null;
                        d.x(mkhVar);
                    }
                } catch (RemoteException e) {
                    Log.e("MediaControllerCompat", "Dead object in unregisterCallback.", e);
                }
            } else {
                this.c.remove(zlhVar);
            }
        }
    }
}
