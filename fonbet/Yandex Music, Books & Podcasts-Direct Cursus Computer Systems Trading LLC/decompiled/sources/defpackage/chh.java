package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.os.Messenger;
import android.os.Process;

/* loaded from: classes.dex */
public class chh {
    public final Context a;
    public final MediaBrowser b;
    public final Bundle c;
    public final ahh d = new ahh(this);
    public final xy0 e = new xy0(0);
    public pv9 f;
    public Messenger g;
    public msh h;

    public chh(Context context, ComponentName componentName, ime imeVar, Bundle bundle) {
        this.a = context;
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        this.c = bundle2;
        bundle2.putInt("extra_client_version", 1);
        bundle2.putInt("extra_calling_pid", Process.myPid());
        imeVar.c = this;
        bhh bhhVar = (bhh) imeVar.b;
        bhhVar.getClass();
        this.b = new MediaBrowser(context, componentName, bhhVar, bundle2);
    }
}
