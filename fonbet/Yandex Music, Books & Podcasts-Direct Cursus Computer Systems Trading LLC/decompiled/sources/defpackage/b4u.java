package defpackage;

import com.yandex.music.databases.main.MainDatabase;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.data.stores.CoverPath;
import ru.yandex.music.data.stores.WebPath$Storage;

/* loaded from: classes4.dex */
public final class b4u implements p3u {
    public final i5h a;
    public final p51 b;

    public b4u(i5h i5hVar, p51 p51Var) {
        this.a = i5hVar;
        this.b = p51Var;
    }

    public static final x1u a(b4u b4uVar, c4u c4uVar, List list, ArrayList arrayList) {
        b4uVar.getClass();
        List<String> B = q7g.B(c4uVar.h);
        B.getClass();
        ArrayList arrayList2 = new ArrayList();
        for (String str : B) {
            str.getClass();
            hs5 g0 = wdp.g0(str);
            if (g0 != null) {
                arrayList2.add(g0);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList2.iterator();
        while (true) {
            h94 h94Var = null;
            if (!it.hasNext()) {
                String str2 = c4uVar.a;
                String str3 = c4uVar.b;
                String str4 = c4uVar.d;
                CoverPath x = men.x(c4uVar.e, WebPath$Storage.VIDEO_CLIP);
                String str5 = c4uVar.f;
                long j = c4uVar.g;
                jzb.b.getClass();
                boolean z = h1b.K(arrayList3, arrayList2) != null;
                Integer num = c4uVar.i;
                j1g k = num != null ? k(num.intValue()) : null;
                tfs tfsVar = wc7.a;
                return new x1u(str2, str3, str4, x, str5, j, list, arrayList, z, arrayList3, arrayList2, k, wc7.a.b(c4uVar.j));
            }
            switch (((hs5) it.next()).a.ordinal()) {
                case 0:
                case 3:
                    break;
                case 1:
                    h94Var = h94.g;
                    break;
                case 2:
                    h94Var = h94.f;
                    break;
                case 4:
                    h94Var = h94.c;
                    break;
                case 5:
                    h94Var = h94.e;
                    break;
                case 6:
                    h94Var = h94.d;
                    break;
                default:
                    b6e.s();
                    return null;
            }
            if (h94Var != null) {
                arrayList3.add(h94Var);
            }
        }
    }

    public static int j(j1g j1gVar) {
        int ordinal = j1gVar.ordinal();
        if (ordinal == 0) {
            return 1;
        }
        if (ordinal == 1) {
            return 0;
        }
        if (ordinal == 2) {
            return -1;
        }
        b6e.s();
        return 0;
    }

    public static j1g k(int i) {
        if (i == -1) {
            return j1g.c;
        }
        if (i == 0) {
            return j1g.b;
        }
        if (i == 1) {
            return j1g.a;
        }
        dfi.r(k5r.i(i, "Invalid LikeState value "), "VideoClipDataSourceImpl");
        return j1g.b;
    }

    public static r4u l(c4u c4uVar) {
        String str = c4uVar.a;
        Integer num = c4uVar.i;
        j1g k = num != null ? k(num.intValue()) : null;
        tfs tfsVar = wc7.a;
        return new r4u(str, k, wc7.a.b(c4uVar.j));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, Collection collection, cg6 cg6Var) {
        q3u q3uVar;
        int i;
        ArrayList arrayList;
        Object obj;
        if (cg6Var instanceof q3u) {
            q3uVar = (q3u) cg6Var;
            int i2 = q3uVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                q3uVar.n = i2 - Integer.MIN_VALUE;
                Object obj2 = q3uVar.l;
                Object obj3 = nm6.a;
                i = q3uVar.n;
                if (i != 0) {
                    ArrayList q = su4.q(obj2);
                    Collection collection2 = collection;
                    ArrayList arrayList2 = new ArrayList(v75.o(collection2, 10));
                    Iterator it = collection2.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(((x1u) it.next()).a);
                    }
                    q3uVar.j = collection;
                    q3uVar.k = q;
                    q3uVar.n = 1;
                    Object f = f(str, arrayList2, q3uVar);
                    if (f == obj3) {
                        return obj3;
                    }
                    obj2 = f;
                    arrayList = q;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    arrayList = q3uVar.k;
                    collection = q3uVar.j;
                    qgg.h0(obj2);
                }
                List list = (List) obj2;
                for (x1u x1uVar : collection) {
                    Iterator it2 = list.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it2.next();
                        if (Intrinsics.d(((r4u) obj).a, x1uVar.a)) {
                            break;
                        }
                    }
                    r4u r4uVar = (r4u) obj;
                    if (r4uVar != null) {
                        j1g j1gVar = x1uVar.l;
                        if (j1gVar == null) {
                            j1gVar = r4uVar.b;
                        }
                        Date date = x1uVar.m;
                        if (date == null) {
                            date = r4uVar.c;
                        }
                        x1uVar = x1u.a(x1uVar, j1gVar, date);
                    }
                    arrayList.add(x1uVar);
                }
                return arrayList;
            }
        }
        q3uVar = new q3u(this, cg6Var);
        Object obj22 = q3uVar.l;
        Object obj32 = nm6.a;
        i = q3uVar.n;
        if (i != 0) {
        }
        List list2 = (List) obj22;
        while (r9.hasNext()) {
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0075, code lost:
    
        if (defpackage.tyf.N(r5, r4, r0) != r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0077, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005d, code lost:
    
        if (r13 == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, Collection collection, cg6 cg6Var) {
        r3u r3uVar;
        int i;
        if (cg6Var instanceof r3u) {
            r3uVar = (r3u) cg6Var;
            int i2 = r3uVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                r3uVar.n = i2 - Integer.MIN_VALUE;
                Object obj = r3uVar.l;
                nm6 nm6Var = nm6.a;
                i = r3uVar.n;
                if (i != 0) {
                    qgg.h0(obj);
                    if (collection.isEmpty()) {
                        return Unit.a;
                    }
                    r3uVar.j = str;
                    r3uVar.k = collection;
                    r3uVar.n = 1;
                    obj = this.a.b(str, r3uVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        Collection collection2 = r3uVar.k;
                        qgg.h0(obj);
                        return Unit.a;
                    }
                    collection = r3uVar.k;
                    str = r3uVar.j;
                    qgg.h0(obj);
                }
                ueo ueoVar = (ueo) obj;
                s3u s3uVar = new s3u(ueoVar, this, str, collection, null);
                r3uVar.j = null;
                r3uVar.k = null;
                r3uVar.n = 2;
            }
        }
        r3uVar = new r3u(this, cg6Var);
        Object obj2 = r3uVar.l;
        nm6 nm6Var2 = nm6.a;
        i = r3uVar.n;
        if (i != 0) {
        }
        ueo ueoVar2 = (ueo) obj2;
        s3u s3uVar2 = new s3u(ueoVar2, this, str, collection, null);
        r3uVar.j = null;
        r3uVar.k = null;
        r3uVar.n = 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0060, code lost:
    
        if (r7.c(r6, (java.util.Collection) r8, r0) != r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(String str, Collection collection, cg6 cg6Var) {
        t3u t3uVar;
        int i;
        b4u b4uVar;
        if (cg6Var instanceof t3u) {
            t3uVar = (t3u) cg6Var;
            int i2 = t3uVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                t3uVar.n = i2 - Integer.MIN_VALUE;
                Object obj = t3uVar.l;
                nm6 nm6Var = nm6.a;
                i = t3uVar.n;
                if (i != 0) {
                    qgg.h0(obj);
                    if (collection.isEmpty()) {
                        return Unit.a;
                    }
                    t3uVar.j = this;
                    t3uVar.k = str;
                    t3uVar.n = 1;
                    obj = b(str, collection, t3uVar);
                    if (obj != nm6Var) {
                        b4uVar = this;
                    }
                    return nm6Var;
                }
                if (i != 1) {
                    if (i == 2) {
                        qgg.h0(obj);
                        return Unit.a;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str = t3uVar.k;
                b4uVar = t3uVar.j;
                qgg.h0(obj);
                t3uVar.j = null;
                t3uVar.k = null;
                t3uVar.n = 2;
            }
        }
        t3uVar = new t3u(this, cg6Var);
        Object obj2 = t3uVar.l;
        nm6 nm6Var2 = nm6.a;
        i = t3uVar.n;
        if (i != 0) {
        }
        t3uVar.j = null;
        t3uVar.k = null;
        t3uVar.n = 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0058, code lost:
    
        if (r7 != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x005a, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0040, code lost:
    
        if (r7 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(String str, cg6 cg6Var) {
        u3u u3uVar;
        int i;
        if (cg6Var instanceof u3u) {
            u3uVar = (u3u) cg6Var;
            int i2 = u3uVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                u3uVar.l = i2 - Integer.MIN_VALUE;
                Object obj = u3uVar.j;
                nm6 nm6Var = nm6.a;
                i = u3uVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    u3uVar.l = 1;
                    obj = this.a.b(str, u3uVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        Iterable iterable = (Iterable) obj;
                        ArrayList arrayList = new ArrayList(v75.o(iterable, 10));
                        Iterator it = iterable.iterator();
                        while (it.hasNext()) {
                            arrayList.add(l((c4u) it.next()));
                        }
                        ArrayList arrayList2 = new ArrayList();
                        ArrayList arrayList3 = new ArrayList();
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            Object next = it2.next();
                            if (((r4u) next).b == j1g.a) {
                                arrayList2.add(next);
                            } else {
                                arrayList3.add(next);
                            }
                        }
                        return new s4u(arrayList2, arrayList3);
                    }
                    qgg.h0(obj);
                }
                n3u V = ((MainDatabase) obj).V();
                u3uVar.l = 2;
                obj = up6.G(V.a, true, true, new grt(27), u3uVar);
            }
        }
        u3uVar = new u3u(this, cg6Var);
        Object obj2 = u3uVar.j;
        nm6 nm6Var2 = nm6.a;
        i = u3uVar.l;
        if (i != 0) {
        }
        n3u V2 = ((MainDatabase) obj2).V();
        u3uVar.l = 2;
        obj2 = up6.G(V2.a, true, true, new grt(27), u3uVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00d6, code lost:
    
        if (r1 != r7) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(String str, Collection collection, cg6 cg6Var) {
        v3u v3uVar;
        int i;
        Collection collection2;
        String str2;
        Collection collection3;
        if (cg6Var instanceof v3u) {
            v3uVar = (v3u) cg6Var;
            int i2 = v3uVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                v3uVar.n = i2 - Integer.MIN_VALUE;
                v3u v3uVar2 = v3uVar;
                Object obj = v3uVar2.l;
                nm6 nm6Var = nm6.a;
                i = v3uVar2.n;
                if (i != 0) {
                    qgg.h0(obj);
                    int size = collection.size();
                    i5h i5hVar = this.a;
                    if (size > 950) {
                        v3uVar2.j = str;
                        v3uVar2.k = collection;
                        v3uVar2.n = 1;
                        obj = i5hVar.b(str, v3uVar2);
                        if (obj != nm6Var) {
                            str2 = str;
                            collection3 = collection;
                            ueo ueoVar = (ueo) obj;
                            m51 m51Var = new m51(ueoVar, this, str2, collection3, (Continuation) null);
                            v3uVar2.j = null;
                            v3uVar2.k = null;
                            v3uVar2.n = 2;
                            Object N = tyf.N(ueoVar, m51Var, v3uVar2);
                            if (N != nm6Var) {
                            }
                        }
                    } else {
                        v3uVar2.j = null;
                        v3uVar2.k = collection;
                        v3uVar2.n = 3;
                        obj = i5hVar.b(str, v3uVar2);
                        if (obj != nm6Var) {
                            collection2 = collection;
                            n3u V = ((MainDatabase) obj).V();
                            v3uVar2.j = null;
                            v3uVar2.k = null;
                            v3uVar2.n = 4;
                            V.getClass();
                            StringBuilder sb = new StringBuilder();
                            sb.append("SELECT * FROM video_clip WHERE video_clip_id IN (");
                            swf.x(collection2.size(), sb);
                            sb.append(")");
                            obj = up6.G(V.a, true, true, new h20(sb.toString(), collection2, 1), v3uVar2);
                        }
                    }
                }
                if (i == 1) {
                    Collection collection4 = v3uVar2.k;
                    str2 = v3uVar2.j;
                    qgg.h0(obj);
                    collection3 = collection4;
                    ueo ueoVar2 = (ueo) obj;
                    m51 m51Var2 = new m51(ueoVar2, this, str2, collection3, (Continuation) null);
                    v3uVar2.j = null;
                    v3uVar2.k = null;
                    v3uVar2.n = 2;
                    Object N2 = tyf.N(ueoVar2, m51Var2, v3uVar2);
                    return N2 != nm6Var ? nm6Var : N2;
                }
                if (i == 2) {
                    Collection collection5 = v3uVar2.k;
                    qgg.h0(obj);
                    return obj;
                }
                if (i != 3) {
                    if (i != 4) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Collection collection6 = v3uVar2.k;
                    qgg.h0(obj);
                    Iterable iterable = (Iterable) obj;
                    ArrayList arrayList = new ArrayList(v75.o(iterable, 10));
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        arrayList.add(l((c4u) it.next()));
                    }
                    return arrayList;
                }
                collection2 = v3uVar2.k;
                qgg.h0(obj);
                n3u V2 = ((MainDatabase) obj).V();
                v3uVar2.j = null;
                v3uVar2.k = null;
                v3uVar2.n = 4;
                V2.getClass();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("SELECT * FROM video_clip WHERE video_clip_id IN (");
                swf.x(collection2.size(), sb2);
                sb2.append(")");
                obj = up6.G(V2.a, true, true, new h20(sb2.toString(), collection2, 1), v3uVar2);
            }
        }
        v3uVar = new v3u(this, cg6Var);
        v3u v3uVar22 = v3uVar;
        Object obj2 = v3uVar22.l;
        nm6 nm6Var2 = nm6.a;
        i = v3uVar22.n;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0054, code lost:
    
        if (r14 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(String str, Collection collection, Integer num, cg6 cg6Var) {
        w3u w3uVar;
        int i;
        if (cg6Var instanceof w3u) {
            w3uVar = (w3u) cg6Var;
            int i2 = w3uVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                w3uVar.n = i2 - Integer.MIN_VALUE;
                Object obj = w3uVar.l;
                nm6 nm6Var = nm6.a;
                i = w3uVar.n;
                if (i != 0) {
                    qgg.h0(obj);
                    w3uVar.j = collection;
                    w3uVar.k = num;
                    w3uVar.n = 1;
                    obj = this.a.b(str, w3uVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        Collection collection2 = w3uVar.j;
                        qgg.h0(obj);
                        return obj;
                    }
                    num = w3uVar.k;
                    collection = w3uVar.j;
                    qgg.h0(obj);
                }
                ueo ueoVar = (ueo) obj;
                x3u x3uVar = new x3u(ueoVar, (Continuation) null, collection, num, this);
                w3uVar.j = null;
                w3uVar.k = null;
                w3uVar.n = 2;
                Object N = tyf.N(ueoVar, x3uVar, w3uVar);
                return N != nm6Var ? nm6Var : N;
            }
        }
        w3uVar = new w3u(this, cg6Var);
        Object obj2 = w3uVar.l;
        nm6 nm6Var2 = nm6.a;
        i = w3uVar.n;
        if (i != 0) {
        }
        ueo ueoVar2 = (ueo) obj2;
        x3u x3uVar2 = new x3u(ueoVar2, (Continuation) null, collection, num, this);
        w3uVar.j = null;
        w3uVar.k = null;
        w3uVar.n = 2;
        Object N2 = tyf.N(ueoVar2, x3uVar2, w3uVar);
        if (N2 != nm6Var2) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(String str, Collection collection, cg6 cg6Var) {
        y3u y3uVar;
        int i;
        if (cg6Var instanceof y3u) {
            y3uVar = (y3u) cg6Var;
            int i2 = y3uVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                y3uVar.n = i2 - Integer.MIN_VALUE;
                Object obj = y3uVar.l;
                nm6 nm6Var = nm6.a;
                i = y3uVar.n;
                if (i != 0) {
                    qgg.h0(obj);
                    y3uVar.j = str;
                    y3uVar.k = collection;
                    y3uVar.n = 1;
                    obj = this.a.b(str, y3uVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    collection = y3uVar.k;
                    str = y3uVar.j;
                    qgg.h0(obj);
                }
                return ((MainDatabase) obj).G(new String[]{"video_clip"}, new jbb(this, str, collection, (Object) null, (Continuation) null, 12));
            }
        }
        y3uVar = new y3u(this, cg6Var);
        Object obj2 = y3uVar.l;
        nm6 nm6Var2 = nm6.a;
        i = y3uVar.n;
        if (i != 0) {
        }
        return ((MainDatabase) obj2).G(new String[]{"video_clip"}, new jbb(this, str, collection, (Object) null, (Continuation) null, 12));
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0054, code lost:
    
        if (r14 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(String str, String str2, Collection collection, cg6 cg6Var) {
        z3u z3uVar;
        int i;
        if (cg6Var instanceof z3u) {
            z3uVar = (z3u) cg6Var;
            int i2 = z3uVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                z3uVar.n = i2 - Integer.MIN_VALUE;
                Object obj = z3uVar.l;
                nm6 nm6Var = nm6.a;
                i = z3uVar.n;
                if (i != 0) {
                    qgg.h0(obj);
                    z3uVar.j = str2;
                    z3uVar.k = collection;
                    z3uVar.n = 1;
                    obj = this.a.b(str, z3uVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        Collection collection2 = z3uVar.k;
                        qgg.h0(obj);
                        return obj;
                    }
                    collection = z3uVar.k;
                    str2 = z3uVar.j;
                    qgg.h0(obj);
                }
                ueo ueoVar = (ueo) obj;
                x3u x3uVar = new x3u(ueoVar, this, str2, collection, (Continuation) null);
                z3uVar.j = null;
                z3uVar.k = null;
                z3uVar.n = 2;
                Object N = tyf.N(ueoVar, x3uVar, z3uVar);
                return N != nm6Var ? nm6Var : N;
            }
        }
        z3uVar = new z3u(this, cg6Var);
        Object obj2 = z3uVar.l;
        nm6 nm6Var2 = nm6.a;
        i = z3uVar.n;
        if (i != 0) {
        }
        ueo ueoVar2 = (ueo) obj2;
        x3u x3uVar2 = new x3u(ueoVar2, this, str2, collection, (Continuation) null);
        z3uVar.j = null;
        z3uVar.k = null;
        z3uVar.n = 2;
        Object N2 = tyf.N(ueoVar2, x3uVar2, z3uVar);
        if (N2 != nm6Var2) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0061, code lost:
    
        if (defpackage.tyf.N(r8, r6, r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0063, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004e, code lost:
    
        if (r8 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m(String str, Collection collection, cg6 cg6Var) {
        a4u a4uVar;
        int i;
        if (cg6Var instanceof a4u) {
            a4uVar = (a4u) cg6Var;
            int i2 = a4uVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                a4uVar.m = i2 - Integer.MIN_VALUE;
                Object obj = a4uVar.k;
                nm6 nm6Var = nm6.a;
                i = a4uVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    a4uVar.j = collection;
                    a4uVar.m = 1;
                    obj = this.a.b(str, a4uVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        Collection collection2 = a4uVar.j;
                        qgg.h0(obj);
                        return Unit.a;
                    }
                    collection = a4uVar.j;
                    qgg.h0(obj);
                }
                ueo ueoVar = (ueo) obj;
                ct ctVar = new ct(ueoVar, (Continuation) null, collection, this);
                a4uVar.j = null;
                a4uVar.m = 2;
            }
        }
        a4uVar = new a4u(this, cg6Var);
        Object obj2 = a4uVar.k;
        nm6 nm6Var2 = nm6.a;
        i = a4uVar.m;
        if (i != 0) {
        }
        ueo ueoVar2 = (ueo) obj2;
        ct ctVar2 = new ct(ueoVar2, (Continuation) null, collection, this);
        a4uVar.j = null;
        a4uVar.m = 2;
    }
}
