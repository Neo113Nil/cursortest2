package defpackage;

import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes11.dex */
public final class xxq {
    public static final xxq c = new xxq(0);
    public final axs0 a = new axs0(16);
    public boolean b;

    public xxq(int i) {
        g();
        g();
    }

    public static void h(xxq xxqVar) {
        axs0 axs0Var = xxqVar.a;
        if (axs0Var.b.size() > 0) {
            Map.Entry c2 = axs0Var.c(0);
            if (c2.getKey() != null) {
                ny61.u();
                return;
            } else {
                c2.getValue();
                throw null;
            }
        }
        Iterator it = axs0Var.d().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (entry.getKey() != null) {
                ny61.u();
            } else {
                entry.getValue();
                throw null;
            }
        }
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final xxq clone() {
        xxq xxqVar = new xxq();
        axs0 axs0Var = this.a;
        if (axs0Var.b.size() > 0) {
            Map.Entry c2 = axs0Var.c(0);
            if (c2.getKey() != null) {
                ny61.u();
                return null;
            }
            c2.getValue();
            throw null;
        }
        Iterator it = axs0Var.d().iterator();
        if (!it.hasNext()) {
            return xxqVar;
        }
        Map.Entry entry = (Map.Entry) it.next();
        if (entry.getKey() != null) {
            ny61.u();
            return null;
        }
        entry.getValue();
        throw null;
    }

    public final Iterator b() {
        axs0 axs0Var = this.a;
        if (axs0Var.z == null) {
            axs0Var.z = new exs0(axs0Var);
        }
        return axs0Var.z.iterator();
    }

    public final void c() {
        axs0 axs0Var = this.a;
        if (axs0Var.b.size() > 0) {
            Map.Entry c2 = axs0Var.c(0);
            if (c2.getKey() != null) {
                ny61.u();
                return;
            } else {
                c2.getValue();
                throw null;
            }
        }
        Iterator it = axs0Var.d().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (entry.getKey() != null) {
                ny61.u();
            } else {
                entry.getValue();
                throw null;
            }
        }
    }

    public final boolean d() {
        return this.a.isEmpty();
    }

    public final void e() {
        axs0 axs0Var = this.a;
        if (axs0Var.b.size() > 0) {
            axs0Var.c(0).getKey().getClass();
            ny61.u();
        } else {
            Iterator it = axs0Var.d().iterator();
            if (it.hasNext()) {
                throw g8e.j((Map.Entry) it.next());
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof xxq) {
            return this.a.equals(((xxq) obj).a);
        }
        return false;
    }

    public final Iterator f() {
        return ((nxs0) this.a.entrySet()).iterator();
    }

    public final void g() {
        axs0 axs0Var;
        if (this.b) {
            return;
        }
        int i = 0;
        while (true) {
            axs0Var = this.a;
            if (i >= axs0Var.b.size()) {
                break;
            }
            Map.Entry c2 = axs0Var.c(i);
            if (c2.getValue() instanceof GeneratedMessageLite) {
                GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) c2.getValue();
                generatedMessageLite.getClass();
                cvf0 cvf0Var = cvf0.c;
                cvf0Var.getClass();
                cvf0Var.a(generatedMessageLite.getClass()).c(generatedMessageLite);
                generatedMessageLite.o();
            }
            i++;
        }
        if (!axs0Var.w) {
            if (axs0Var.b.size() > 0) {
                axs0Var.c(0).getKey().getClass();
                ny61.u();
                return;
            } else {
                Iterator it = axs0Var.d().iterator();
                if (it.hasNext()) {
                    throw g8e.j((Map.Entry) it.next());
                }
            }
        }
        if (!axs0Var.w) {
            axs0Var.c = axs0Var.c.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(axs0Var.c);
            axs0Var.y = axs0Var.y.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(axs0Var.y);
            axs0Var.w = true;
        }
        this.b = true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public xxq() {
    }
}
