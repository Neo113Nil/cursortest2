package defpackage;

import android.content.Context;
import android.os.Build;
import androidx.camera.camera2.internal.y;
import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.impl.CameraUpdateException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* loaded from: classes10.dex */
public final class qn7 implements zqw {
    public final Object a;
    public final HashMap b;
    public final gly0 c;
    public final kr7 d;
    public final Context e;

    public qn7(Context context, Object obj, LinkedHashSet linkedHashSet) {
        gly0 gly0Var = new gly0();
        this.a = new Object();
        this.b = new HashMap();
        this.c = gly0Var;
        this.e = context;
        if (obj instanceof kr7) {
            this.d = (kr7) obj;
        } else {
            id00.f();
            this.d = new kr7(Build.VERSION.SDK_INT >= 30 ? new lr7(context) : new sr4(context));
        }
        try {
            a(new ArrayList(linkedHashSet));
        } catch (CameraUpdateException e) {
            if (!(e.getCause() instanceof CameraUnavailableException)) {
                throw new CameraUnavailableException(3, e);
            }
            throw ((CameraUnavailableException) e.getCause());
        }
    }

    @Override // defpackage.zqw
    public final void a(List list) {
        HashSet hashSet;
        HashMap hashMap = new HashMap();
        synchronized (this.a) {
            hashSet = new HashSet(list);
            hashSet.removeAll(this.b.keySet());
        }
        try {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                hashMap.put(str, b(str));
            }
            synchronized (this.a) {
                try {
                    HashMap hashMap2 = new HashMap();
                    Iterator it2 = ((ArrayList) list).iterator();
                    while (it2.hasNext()) {
                        String str2 = (String) it2.next();
                        if (this.b.containsKey(str2)) {
                            hashMap2.put(str2, (y) this.b.get(str2));
                        } else {
                            hashMap2.put(str2, (y) hashMap.get(str2));
                        }
                    }
                    this.b.clear();
                    this.b.putAll(hashMap2);
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (CameraUnavailableException | RuntimeException e) {
            throw new CameraUpdateException("Failed to create SupportedSurfaceCombination", e);
        }
    }

    public final y b(String str) {
        return new y(this.e, str, this.d, this.c, Build.VERSION.SDK_INT >= 35 ? new lkp(this.e, str, this.d) : ikp.g2);
    }
}
