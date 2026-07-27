package com.bumptech.glide;

import D0.x;
import H6.b;
import H6.j;
import J0.s;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.ViewGroup;
import com.bumptech.glide.g;
import com.icefishing.icefishinglive2.AbstractC4404f;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;
import m.I0;
import u7.C5089g;
import v7.t;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f23387a = true;

    public static f6.g a(H6.b bVar) {
        String str = bVar.f1229v;
        if (str != null) {
            return new f6.f(2, str);
        }
        Long l9 = bVar.f1231x;
        if (l9 != null) {
            return new f6.k(l9.longValue());
        }
        Double d2 = bVar.f1232y;
        if (d2 != null) {
            return new f6.j(d2.doubleValue());
        }
        Boolean bool = bVar.f1230w;
        if (bool != null) {
            return new f6.h(bool.booleanValue());
        }
        y8.h hVar = bVar.f1228B;
        if (hVar != null) {
            byte[] k9 = hVar.k();
            return new f6.i(Arrays.copyOf(k9, k9.length));
        }
        H6.l lVar = bVar.f1227A;
        if (lVar == null) {
            H6.d dVar = bVar.f1233z;
            if (dVar == null) {
                throw new IllegalArgumentException("Unrecognized AnyValue type");
            }
            final int i = 1;
            return new f6.f(1, Collections.unmodifiableList((List) dVar.f1235v.stream().map(new Function() { // from class: x6.a
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    switch (i) {
                        case 0:
                            return g.a(((j) obj).f1248w);
                        default:
                            return g.a((b) obj);
                    }
                }
            }).collect(Collectors.toList())));
        }
        final int i6 = 0;
        Map map = (Map) lVar.f1250v.stream().collect(Collectors.toMap(new K6.b(29), new Function() { // from class: x6.a
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                switch (i6) {
                    case 0:
                        return g.a(((j) obj).f1248w);
                    default:
                        return g.a((b) obj);
                }
            }
        }));
        Objects.requireNonNull(map, "value must not be null");
        f6.d[] dVarArr = (f6.d[]) map.entrySet().stream().map(new K6.b(19)).toArray(new f6.e());
        Objects.requireNonNull(dVarArr, "value must not be null");
        ArrayList arrayList = new ArrayList(dVarArr.length);
        arrayList.addAll(Arrays.asList(dVarArr));
        return new f6.f(0, Collections.unmodifiableList(arrayList));
    }

    public static void b(int i, int i6, int i9) {
        if (i < 0 || i6 > i9) {
            StringBuilder h9 = AbstractC4404f.h(i, i6, "startIndex: ", ", endIndex: ", ", size: ");
            h9.append(i9);
            throw new IndexOutOfBoundsException(h9.toString());
        }
        if (i > i6) {
            throw new IllegalArgumentException(u1.h.c(i, i6, "startIndex: ", " > endIndex: "));
        }
    }

    public static void c(int i, int i6, int i9) {
        if (i < 0 || i6 > i9) {
            StringBuilder h9 = AbstractC4404f.h(i, i6, "fromIndex: ", ", toIndex: ", ", size: ");
            h9.append(i9);
            throw new IndexOutOfBoundsException(h9.toString());
        }
        if (i > i6) {
            throw new IllegalArgumentException(u1.h.c(i, i6, "fromIndex: ", " > toIndex: "));
        }
    }

    public static final void d(c6.i iVar, String str) {
        c6.d dVar = c6.d.f5578u;
        c6.n nVar = c6.n.f5618u;
        new c6.e(iVar, iVar.f5604b, iVar.f5606d);
    }

    public static Drawable e(Context context, int i) {
        return I0.b().c(context, i);
    }

    public static t.k f(t.i iVar) {
        t.h hVar = new t.h();
        hVar.f40525c = new t.l();
        t.k kVar = new t.k(hVar);
        hVar.f40524b = kVar;
        hVar.f40523a = iVar.getClass();
        try {
            Object e9 = iVar.e(hVar);
            if (e9 != null) {
                hVar.f40523a = e9;
                return kVar;
            }
        } catch (Exception e10) {
            kVar.f40529u.k(e10);
        }
        return kVar;
    }

    public static boolean g(String str) {
        return ("Connection".equalsIgnoreCase(str) || com.anythink.expressad.foundation.g.f.g.b.f19340c.equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v8, types: [java.util.Map] */
    public static final void h(Context context) {
        LinkedHashMap linkedHashMap;
        kotlin.jvm.internal.h.e(context, "context");
        File databasePath = context.getDatabasePath("androidx.work.workdb");
        kotlin.jvm.internal.h.d(databasePath, "context.getDatabasePath(WORK_DATABASE_NAME)");
        if (databasePath.exists()) {
            s.d().a(K0.n.f1527a, "Migrating WorkDatabase to the no-backup directory");
            File databasePath2 = context.getDatabasePath("androidx.work.workdb");
            kotlin.jvm.internal.h.d(databasePath2, "context.getDatabasePath(WORK_DATABASE_NAME)");
            File file = new File(K0.a.f1486a.a(context), "androidx.work.workdb");
            String[] strArr = K0.n.f1528b;
            int P8 = t.P(strArr.length);
            if (P8 < 16) {
                P8 = 16;
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(P8);
            for (String str : strArr) {
                linkedHashMap2.put(new File(databasePath2.getPath() + str), new File(file.getPath() + str));
            }
            C5089g c5089g = new C5089g(databasePath2, file);
            if (linkedHashMap2.isEmpty()) {
                linkedHashMap = t.Q(c5089g);
            } else {
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(linkedHashMap2);
                linkedHashMap3.put(databasePath2, file);
                linkedHashMap = linkedHashMap3;
            }
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                File file2 = (File) entry.getKey();
                File file3 = (File) entry.getValue();
                if (file2.exists()) {
                    if (file3.exists()) {
                        s.d().g(K0.n.f1527a, "Over-writing contents of " + file3);
                    }
                    s.d().a(K0.n.f1527a, file2.renameTo(file3) ? "Migrated " + file2 + "to " + file3 : "Renaming " + file2 + " to " + file3 + " failed");
                }
            }
        }
    }

    public static void i(ViewGroup viewGroup, boolean z3) {
        if (Build.VERSION.SDK_INT >= 29) {
            x.b(viewGroup, z3);
        } else if (f23387a) {
            try {
                x.b(viewGroup, z3);
            } catch (NoSuchMethodError unused) {
                f23387a = false;
            }
        }
    }

    public abstract void j();
}
