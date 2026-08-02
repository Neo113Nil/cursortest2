package defpackage;

import android.content.Context;
import com.google.firebase.datastorage.a;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class xeu {
    public static final kme0 b = new kme0("fire-global");
    public static final kme0 c = new kme0("fire-count");
    public static final kme0 d = new kme0("last-used-date");
    public final a a;

    public xeu(Context context, String str) {
        this.a = new a(context, "FirebaseHeartBeat".concat(str));
    }

    public final synchronized ArrayList a() {
        try {
            ArrayList arrayList = new ArrayList();
            String b2 = b(System.currentTimeMillis());
            for (Map.Entry entry : this.a.b().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    HashSet hashSet = new HashSet((Set) entry.getValue());
                    hashSet.remove(b2);
                    if (!hashSet.isEmpty()) {
                        arrayList.add(yeu.a(((kme0) entry.getKey()).a, new ArrayList(hashSet)));
                    }
                }
            }
            long currentTimeMillis = System.currentTimeMillis();
            synchronized (this) {
                this.a.a(new zk6(currentTimeMillis, 4));
            }
            return arrayList;
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    public final synchronized String b(long j) {
        return new Date(j).toInstant().atOffset(ZoneOffset.UTC).toLocalDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE);
    }

    public final synchronized kme0 c(ez40 ez40Var, String str) {
        for (Map.Entry entry : ez40Var.a().entrySet()) {
            if (entry.getValue() instanceof Set) {
                Iterator it = ((Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (str.equals((String) it.next())) {
                        return new kme0(((kme0) entry.getKey()).a);
                    }
                }
            }
        }
        return null;
    }

    public final synchronized void d(ez40 ez40Var, String str) {
        try {
            kme0 c2 = c(ez40Var, str);
            if (c2 == null) {
                return;
            }
            Object hashSet = new HashSet();
            Object c3 = ez40Var.c(c2);
            if (c3 != null) {
                hashSet = c3;
            }
            HashSet hashSet2 = new HashSet((Collection) hashSet);
            hashSet2.remove(str);
            if (hashSet2.isEmpty()) {
                ez40Var.f(c2);
            } else {
                ez40Var.g(c2, hashSet2);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean e(long j) {
        long longValue;
        longValue = ((Long) this.a.c()).longValue();
        synchronized (this) {
        }
        if (b(longValue).equals(b(j))) {
            return false;
        }
        this.a.d(Long.valueOf(j));
        return true;
    }
}
