package defpackage;

import android.graphics.Bitmap;
import coil.memory.MemoryCache$Key;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.a;

/* loaded from: classes10.dex */
public final class udi0 implements w941 {
    public final LinkedHashMap a = new LinkedHashMap();
    public int b;

    @Override // defpackage.w941
    public final synchronized void a(int i) {
        if (i >= 10 && i != 20) {
            d();
        }
    }

    @Override // defpackage.w941
    public final synchronized ki10 b(MemoryCache$Key memoryCache$Key) {
        try {
            ArrayList arrayList = (ArrayList) this.a.get(memoryCache$Key);
            ki10 ki10Var = null;
            if (arrayList == null) {
                return null;
            }
            int size = arrayList.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                sdi0 sdi0Var = (sdi0) arrayList.get(i);
                Bitmap bitmap = (Bitmap) sdi0Var.b.get();
                ki10 ki10Var2 = bitmap != null ? new ki10(bitmap, sdi0Var.c) : null;
                if (ki10Var2 != null) {
                    ki10Var = ki10Var2;
                    break;
                }
                i++;
            }
            int i2 = this.b;
            this.b = i2 + 1;
            if (i2 >= 10) {
                d();
            }
            return ki10Var;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.w941
    public final synchronized void c(MemoryCache$Key memoryCache$Key, Bitmap bitmap, Map map, int i) {
        try {
            LinkedHashMap linkedHashMap = this.a;
            Object obj = linkedHashMap.get(memoryCache$Key);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(memoryCache$Key, obj);
            }
            ArrayList arrayList = (ArrayList) obj;
            int identityHashCode = System.identityHashCode(bitmap);
            sdi0 sdi0Var = new sdi0(identityHashCode, new WeakReference(bitmap), map, i);
            int size = arrayList.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    arrayList.add(sdi0Var);
                    break;
                }
                sdi0 sdi0Var2 = (sdi0) arrayList.get(i2);
                if (i < sdi0Var2.d) {
                    i2++;
                } else if (sdi0Var2.a == identityHashCode && sdi0Var2.b.get() == bitmap) {
                    arrayList.set(i2, sdi0Var);
                } else {
                    arrayList.add(i2, sdi0Var);
                }
            }
            int i3 = this.b;
            this.b = i3 + 1;
            if (i3 >= 10) {
                d();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void d() {
        this.b = 0;
        Iterator it = this.a.values().iterator();
        while (it.hasNext()) {
            ArrayList arrayList = (ArrayList) it.next();
            if (arrayList.size() <= 1) {
                sdi0 sdi0Var = (sdi0) a.R(arrayList);
                if ((sdi0Var != null ? (Bitmap) sdi0Var.b.get() : null) == null) {
                    it.remove();
                }
            } else {
                int size = arrayList.size();
                int i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    int i3 = i2 - i;
                    if (((sdi0) arrayList.get(i3)).b.get() == null) {
                        arrayList.remove(i3);
                        i++;
                    }
                }
                if (arrayList.isEmpty()) {
                    it.remove();
                }
            }
        }
    }
}
