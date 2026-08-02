package defpackage;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.util.Log;
import androidx.media3.session.i;
import com.yandex.passport.internal.provider.communication.r;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class ahh extends Handler {
    public final /* synthetic */ int a = 1;
    public Object b;
    public Object c;

    public ahh(chh chhVar) {
        this.b = new WeakReference(chhVar);
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        switch (this.a) {
            case 0:
                WeakReference weakReference = (WeakReference) this.c;
                if (weakReference == null) {
                    return;
                }
                Messenger messenger = (Messenger) weakReference.get();
                chh chhVar = (chh) ((WeakReference) this.b).get();
                if (messenger == null || chhVar == null) {
                    return;
                }
                Bundle data = message.getData();
                nsh.g(data);
                try {
                    int i = message.what;
                    if (i == 1) {
                        nsh.g(data.getBundle("data_root_hints"));
                        data.getString("data_media_item_id");
                        return;
                    }
                    if (i != 2) {
                        if (i != 3) {
                            Log.w("MediaBrowserCompat", "Unhandled message: " + message + "\n  Client version: 1\n  Service version: " + message.arg1);
                            return;
                        }
                        nsh.g(data.getBundle("data_options"));
                        nsh.g(data.getBundle("data_notify_children_changed_options"));
                        String string = data.getString("data_media_item_id");
                        ArrayList parcelableArrayList = data.getParcelableArrayList("data_media_item_list");
                        Parcelable.Creator<ehh> creator = ehh.CREATOR;
                        if (parcelableArrayList != null) {
                            ArrayList arrayList = new ArrayList();
                            for (int i2 = 0; i2 < parcelableArrayList.size(); i2++) {
                                arrayList.add(uwf.j((Parcelable) parcelableArrayList.get(i2), creator));
                            }
                        }
                        if (chhVar.g != messenger) {
                            return;
                        }
                        if (string != null && chhVar.e.get(string) != null) {
                            throw new ClassCastException();
                        }
                        if (fhh.b) {
                            Log.d("MediaBrowserCompat", "onLoadChildren for id that isn't subscribed id=" + string);
                            return;
                        }
                        return;
                    }
                    return;
                } catch (BadParcelableException unused) {
                    Log.e("MediaBrowserCompat", "Could not unparcel the data.");
                    return;
                }
            case 1:
            default:
                super.handleMessage(message);
                return;
            case 2:
                message.getClass();
                zt3 zt3Var = (zt3) this.b;
                r7o r7oVar = z7o.b;
                zt3Var.resumeWith(((r) ((j5) this.c).a).a(message));
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahh(i iVar, Looper looper) {
        super(looper);
        this.c = iVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahh(zt3 zt3Var, j5 j5Var, Looper looper) {
        super(looper);
        this.b = zt3Var;
        this.c = j5Var;
    }
}
