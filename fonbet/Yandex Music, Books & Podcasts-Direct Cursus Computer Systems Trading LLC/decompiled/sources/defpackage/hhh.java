package defpackage;

import android.os.Bundle;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import java.util.List;

/* loaded from: classes.dex */
public final class hhh extends uhh {
    public final /* synthetic */ khh e;
    public final /* synthetic */ String f;
    public final /* synthetic */ Bundle g;
    public final /* synthetic */ bih h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hhh(bih bihVar, String str, khh khhVar, String str2, Bundle bundle) {
        super(str);
        this.h = bihVar;
        this.e = khhVar;
        this.f = str2;
        this.g = bundle;
    }

    @Override // defpackage.uhh
    public final void c(Object obj) {
        List list = (List) obj;
        xy0 xy0Var = this.h.d;
        khh khhVar = this.e;
        h4b h4bVar = khhVar.d;
        String str = khhVar.a;
        Object obj2 = xy0Var.get(((Messenger) h4bVar.a).getBinder());
        String str2 = this.f;
        if (obj2 != khhVar) {
            if (bih.g) {
                Log.d("MBServiceCompat", "Not sending onLoadChildren result for connection that has been disconnected. pkg=" + str + " id=" + str2);
                return;
            }
            return;
        }
        int i = this.d & 1;
        Bundle bundle = this.g;
        if (i != 0) {
            list = bih.a(list, bundle);
        }
        try {
            h4bVar.T(str2, list, bundle);
        } catch (RemoteException unused) {
            Log.w("MBServiceCompat", "Calling onLoadChildren() failed for id=" + str2 + " package=" + str);
        }
    }
}
