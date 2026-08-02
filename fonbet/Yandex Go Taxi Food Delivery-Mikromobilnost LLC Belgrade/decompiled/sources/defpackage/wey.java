package defpackage;

import android.content.Context;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import java.util.HashMap;

/* loaded from: classes10.dex */
public final class wey {
    public final HashMap a = new HashMap();
    public final m7j0 b;

    public wey(m7j0 m7j0Var) {
        this.b = m7j0Var;
    }

    public final RequestManager a(Context context, Glide glide, Lifecycle lifecycle, FragmentManager fragmentManager, boolean z) {
        pw21.a();
        pw21.a();
        HashMap hashMap = this.a;
        RequestManager requestManager = (RequestManager) hashMap.get(lifecycle);
        if (requestManager != null) {
            return requestManager;
        }
        eey eeyVar = new eey(lifecycle);
        c9v c9vVar = new c9v(this, fragmentManager);
        ((egz) this.b).getClass();
        RequestManager requestManager2 = new RequestManager(glide, eeyVar, c9vVar, context);
        hashMap.put(lifecycle, requestManager2);
        eeyVar.a(new vey(this, lifecycle));
        if (z) {
            requestManager2.onStart();
        }
        return requestManager2;
    }
}
