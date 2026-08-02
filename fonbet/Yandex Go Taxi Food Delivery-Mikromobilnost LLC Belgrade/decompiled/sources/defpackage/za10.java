package defpackage;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;

/* loaded from: classes10.dex */
public final class za10 {
    public final Messenger a;
    public final Bundle b;

    public za10(IBinder iBinder, Bundle bundle) {
        this.a = new Messenger(iBinder);
        this.b = bundle;
    }

    public final void a(String str, IBinder iBinder, Bundle bundle, Messenger messenger) {
        Bundle bundle2 = new Bundle();
        bundle2.putString("data_media_item_id", str);
        bundle2.putBinder("data_callback_token", iBinder);
        bundle2.putBundle("data_options", bundle);
        c(3, bundle2, messenger);
    }

    public final void b(String str, Binder binder, Messenger messenger) {
        Bundle bundle = new Bundle();
        bundle.putString("data_media_item_id", str);
        bundle.putBinder("data_callback_token", binder);
        c(4, bundle, messenger);
    }

    public final void c(int i, Bundle bundle, Messenger messenger) {
        Message obtain = Message.obtain();
        obtain.what = i;
        obtain.arg1 = 1;
        obtain.setData(bundle);
        obtain.replyTo = messenger;
        this.a.send(obtain);
    }
}
