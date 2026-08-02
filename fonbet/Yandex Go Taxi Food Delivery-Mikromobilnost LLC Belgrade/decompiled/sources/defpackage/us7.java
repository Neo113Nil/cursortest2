package defpackage;

import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.InitializationException;
import androidx.camera.core.impl.CameraUpdateException;
import androidx.concurrent.futures.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;

/* loaded from: classes10.dex */
public class us7 implements zqw {
    public final Object a = new Object();
    public final LinkedHashMap b = new LinkedHashMap();
    public final HashSet c = new HashSet();
    public gl7 d;
    public b e;
    public lm7 f;

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
                hashMap.put(str, this.f.c(str));
            }
            synchronized (this.a) {
                try {
                    HashSet hashSet2 = new HashSet(this.b.keySet());
                    hashSet2.removeAll(list);
                    ArrayList arrayList = new ArrayList();
                    Iterator it2 = hashSet2.iterator();
                    while (it2.hasNext()) {
                        arrayList.add((br7) this.b.get((String) it2.next()));
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    Iterator it3 = ((ArrayList) list).iterator();
                    while (it3.hasNext()) {
                        String str2 = (String) it3.next();
                        if (this.b.containsKey(str2)) {
                            linkedHashMap.put(str2, (br7) this.b.get(str2));
                        } else {
                            linkedHashMap.put(str2, (br7) hashMap.get(str2));
                        }
                    }
                    this.b.clear();
                    this.b.putAll(linkedHashMap);
                    Iterator it4 = arrayList.iterator();
                    while (it4.hasNext()) {
                        br7 br7Var = (br7) it4.next();
                        if (br7Var != null) {
                            br7Var.i();
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (CameraUnavailableException e) {
            throw new CameraUpdateException("Failed to create CameraInternal", e);
        }
    }

    public final br7 b(String str) {
        br7 br7Var;
        synchronized (this.a) {
            try {
                br7Var = (br7) this.b.get(str);
                if (br7Var == null) {
                    throw new IllegalArgumentException("Invalid camera: " + str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return br7Var;
    }

    public final LinkedHashSet c() {
        LinkedHashSet linkedHashSet;
        synchronized (this.a) {
            linkedHashSet = new LinkedHashSet(this.b.values());
        }
        return linkedHashSet;
    }

    public final void d(lm7 lm7Var) {
        this.f = lm7Var;
        synchronized (this.a) {
            try {
                for (String str : lm7Var.a()) {
                    sgb1.g(3, "CameraRepository");
                    br7 br7Var = (br7) this.b.put(str, lm7Var.c(str));
                    if (br7Var != null) {
                        br7Var.release();
                    }
                }
            } catch (CameraUnavailableException e) {
                throw new InitializationException(e);
            }
        }
    }
}
