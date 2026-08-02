package defpackage;

import com.yandex.messaging.core.net.entities.Bucket;
import com.yandex.messaging.core.net.entities.RestrictionsBucket;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

/* loaded from: classes15.dex */
public final class sxj0 {
    public final to3 a;
    public final k020 b;
    public final LinkedList c = new LinkedList();
    public x08 d = wfz.z;

    public sxj0(to3 to3Var, k020 k020Var) {
        this.b = k020Var;
        this.a = to3Var;
    }

    public final void a(int i, String str) {
        this.c.addFirst(new rxj0(i, str));
        this.d = wfz.z;
        vfc0 vfc0Var = new vfc0(15, this);
        Bucket.GetParams getParams = new Bucket.GetParams(new RestrictionsBucket());
        to3 to3Var = this.a;
        to3Var.getClass();
        this.d = to3Var.a(RestrictionsBucket.class, new eo1(14, vfc0Var), getParams);
    }

    public final void b(RestrictionsBucket restrictionsBucket) {
        this.d = wfz.z;
        l020 C = this.b.C();
        try {
            C.H0(restrictionsBucket);
            C.s();
            C.close();
            c();
        } catch (Throwable th) {
            if (C != null) {
                try {
                    C.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public final void c() {
        if (this.d == wfz.z) {
            LinkedList linkedList = this.c;
            if (linkedList.isEmpty()) {
                return;
            }
            rxj0 rxj0Var = (rxj0) linkedList.poll();
            int i = rxj0Var.a;
            String str = rxj0Var.b;
            to3 to3Var = this.a;
            k020 k020Var = this.b;
            if (i == 0) {
                k020Var.getClass();
                HashSet hashSet = new HashSet(k020Var.b.C().b());
                if (hashSet.contains(str)) {
                    return;
                }
                hashSet.add(str);
                this.d = to3Var.d(RestrictionsBucket.class, new o8g0(this, str, false), RestrictionsBucket.b(k020Var.j("restrictions"), (String[]) new ArrayList(hashSet).toArray(new String[0])));
                return;
            }
            if (i != 1) {
                if (i != 2) {
                    ny61.r("Unknown operation");
                    return;
                } else {
                    this.d = to3Var.d(RestrictionsBucket.class, new aye0(17, this), RestrictionsBucket.b(k020Var.j("restrictions"), new String[0]));
                    return;
                }
            }
            k020Var.getClass();
            HashSet hashSet2 = new HashSet(k020Var.b.C().b());
            if (hashSet2.contains(str)) {
                hashSet2.remove(str);
                this.d = to3Var.d(RestrictionsBucket.class, new yxf0(this, str, false), RestrictionsBucket.b(k020Var.j("restrictions"), (String[]) new ArrayList(hashSet2).toArray(new String[0])));
            }
        }
    }
}
