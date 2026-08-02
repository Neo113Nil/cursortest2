package defpackage;

import com.yandex.messaging.ChatRequest;
import java.util.ArrayList;
import java.util.HashSet;

/* loaded from: classes15.dex */
public final class uv10 {
    public final ChatRequest a;
    public final swh b = new swh();
    public final zq60 c = new zq60();

    public uv10(ChatRequest chatRequest) {
        this.a = chatRequest;
    }

    public final HashSet a() {
        swh swhVar = this.b;
        swhVar.getClass();
        ArrayList arrayList = swhVar.a;
        HashSet hashSet = new HashSet(arrayList.size());
        for (int i = 0; i < arrayList.size(); i++) {
            Long l = ((sv10) arrayList.get(i)).b;
            if (l != null) {
                hashSet.add(new abz0(l.longValue()));
            }
        }
        return hashSet;
    }

    public final boolean b() {
        return this.b.a.size() > 0;
    }

    public final void c() {
        boolean z;
        zq60 zq60Var = this.c;
        zq60Var.getClass();
        zq60Var.b++;
        ArrayList arrayList = zq60Var.a;
        int size = arrayList.size();
        int i = 0;
        boolean z2 = false;
        while (true) {
            int i2 = i;
            while (i2 < size && arrayList.get(i2) == null) {
                i2++;
            }
            if (i2 < size) {
                z = true;
            } else {
                if (!z2) {
                    zq60.a(zq60Var);
                    z2 = true;
                }
                z = false;
            }
            if (!z) {
                return;
            }
            while (i < size && arrayList.get(i) == null) {
                i++;
            }
            if (i >= size) {
                if (!z2) {
                    zq60.a(zq60Var);
                }
                ny61.p();
                return;
            } else {
                ((tv10) arrayList.get(i)).onSelectionChanged();
                i++;
            }
        }
    }

    public final void d(sv10 sv10Var) {
        boolean z;
        boolean z2;
        boolean b = b();
        zq60 zq60Var = this.c;
        if (!b) {
            zq60Var.getClass();
            ArrayList arrayList = zq60Var.a;
            zq60Var.b++;
            int size = arrayList.size();
            int i = 0;
            boolean z3 = false;
            while (true) {
                int i2 = i;
                while (i2 < size && arrayList.get(i2) == null) {
                    i2++;
                }
                if (i2 < size) {
                    z2 = true;
                } else {
                    if (!z3) {
                        zq60.a(zq60Var);
                        z3 = true;
                    }
                    z2 = false;
                }
                if (!z2) {
                    break;
                }
                while (i < size && arrayList.get(i) == null) {
                    i++;
                }
                if (i >= size) {
                    if (!z3) {
                        zq60.a(zq60Var);
                    }
                    ny61.p();
                    return;
                } else {
                    ((tv10) arrayList.get(i)).onEnterSelectionMode();
                    i++;
                }
            }
        }
        ArrayList arrayList2 = this.b.a;
        if (arrayList2.contains(sv10Var)) {
            return;
        }
        arrayList2.add(sv10Var);
        zq60Var.getClass();
        ArrayList arrayList3 = zq60Var.a;
        zq60Var.b++;
        int size2 = arrayList3.size();
        int i3 = 0;
        boolean z4 = false;
        while (true) {
            int i4 = i3;
            while (i4 < size2 && arrayList3.get(i4) == null) {
                i4++;
            }
            if (i4 < size2) {
                z = true;
            } else {
                if (!z4) {
                    zq60.a(zq60Var);
                    z4 = true;
                }
                z = false;
            }
            if (!z) {
                c();
                return;
            }
            while (i3 < size2 && arrayList3.get(i3) == null) {
                i3++;
            }
            if (i3 >= size2) {
                if (!z4) {
                    zq60.a(zq60Var);
                }
                ny61.p();
                return;
            } else {
                ((tv10) arrayList3.get(i3)).onMessageSelected(sv10Var.a, sv10Var.d);
                i3++;
            }
        }
    }

    public final void e() {
        boolean z;
        ArrayList arrayList = this.b.a;
        if (arrayList.size() == 0) {
            return;
        }
        arrayList.clear();
        c();
        if (b()) {
            return;
        }
        zq60 zq60Var = this.c;
        zq60Var.getClass();
        zq60Var.b++;
        ArrayList arrayList2 = zq60Var.a;
        int size = arrayList2.size();
        int i = 0;
        boolean z2 = false;
        while (true) {
            int i2 = i;
            while (i2 < size && arrayList2.get(i2) == null) {
                i2++;
            }
            if (i2 < size) {
                z = true;
            } else {
                if (!z2) {
                    zq60.a(zq60Var);
                    z2 = true;
                }
                z = false;
            }
            if (!z) {
                return;
            }
            while (i < size && arrayList2.get(i) == null) {
                i++;
            }
            if (i >= size) {
                if (!z2) {
                    zq60.a(zq60Var);
                }
                ny61.p();
                return;
            } else {
                ((tv10) arrayList2.get(i)).onExitSelectionMode();
                i++;
            }
        }
    }
}
