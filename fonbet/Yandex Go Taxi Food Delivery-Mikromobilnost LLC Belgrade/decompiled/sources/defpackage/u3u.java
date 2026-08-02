package defpackage;

import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.Strictness;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.MalformedJsonException;
import java.io.EOFException;
import java.io.IOException;
import java.io.StringReader;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes11.dex */
public final class u3u {
    public final ThreadLocal a;
    public final ConcurrentHashMap b;
    public final tis0 c;
    public final ubx d;
    public final List e;
    public final boolean f;
    public final n9s g;
    public final Strictness h;

    public static class a extends qsq0 {
        public nl11 a = null;

        @Override // defpackage.qsq0
        public final nl11 a() {
            nl11 nl11Var = this.a;
            if (nl11Var != null) {
                return nl11Var;
            }
            ny61.r("Adapter for type with cyclic dependency has been used before dependency has been resolved");
            return null;
        }

        @Override // defpackage.nl11
        public final Object read(wdx wdxVar) {
            nl11 nl11Var = this.a;
            if (nl11Var != null) {
                return nl11Var.read(wdxVar);
            }
            ny61.r("Adapter for type with cyclic dependency has been used before dependency has been resolved");
            return null;
        }

        @Override // defpackage.nl11
        public final void write(afx afxVar, Object obj) {
            nl11 nl11Var = this.a;
            if (nl11Var != null) {
                nl11Var.write(afxVar, obj);
            } else {
                ny61.r("Adapter for type with cyclic dependency has been used before dependency has been resolved");
            }
        }
    }

    public u3u(v3u v3uVar) {
        this.a = new ThreadLocal();
        this.b = new ConcurrentHashMap();
        dko dkoVar = v3uVar.a;
        HashMap hashMap = new HashMap(v3uVar.d);
        this.f = v3uVar.i;
        this.g = v3uVar.j;
        this.h = v3uVar.k;
        boolean z = v3uVar.l;
        v3u.b(v3uVar.e);
        v3u.b(v3uVar.f);
        List b = v3u.b(v3uVar.o);
        if (v3uVar == v3u.v) {
            this.c = v3u.t;
            this.d = v3u.u;
            this.e = v3u.w;
        } else {
            tis0 tis0Var = new tis0(hashMap, z, b, 8);
            this.c = tis0Var;
            ubx ubxVar = new ubx(tis0Var);
            this.d = ubxVar;
            this.e = v3uVar.a(tis0Var, ubxVar);
        }
    }

    public final Object a(pcx pcxVar, Class cls) {
        TypeToken typeToken = TypeToken.get(cls);
        if (pcxVar == null) {
            return null;
        }
        return b(new rex(pcxVar), typeToken);
    }

    public final Object b(wdx wdxVar, TypeToken typeToken) {
        boolean z;
        Strictness strictness = wdxVar.b;
        Strictness strictness2 = this.h;
        if (strictness2 != null) {
            wdxVar.b = strictness2;
        } else if (strictness == Strictness.LEGACY_STRICT) {
            wdxVar.W(Strictness.LENIENT);
        }
        try {
            try {
                try {
                    try {
                        try {
                            wdxVar.R();
                            z = false;
                        } finally {
                            wdxVar.W(strictness);
                        }
                    } catch (EOFException e) {
                        e = e;
                        z = true;
                    }
                    try {
                        nl11 e2 = e(typeToken);
                        Object read = e2.read(wdxVar);
                        Class f = c5a1.f(typeToken.getRawType());
                        if (read != null && !f.isInstance(read)) {
                            throw new ClassCastException("Type adapter '" + e2 + "' returned wrong type; requested " + typeToken.getRawType() + " but got instance of " + read.getClass() + "\nVerify that the adapter was registered for the correct type.");
                        }
                        return read;
                    } catch (EOFException e3) {
                        e = e3;
                        if (!z) {
                            throw new JsonSyntaxException(e);
                        }
                        wdxVar.W(strictness);
                        return null;
                    }
                } catch (IOException e4) {
                    throw new JsonSyntaxException(e4);
                }
            } catch (IllegalStateException e5) {
                throw new JsonSyntaxException(e5);
            }
        } catch (AssertionError e6) {
            throw new AssertionError("AssertionError (GSON 2.14.0): " + e6.getMessage(), e6);
        }
    }

    public final Object c(Class cls, String str) {
        return d(str, TypeToken.get(cls));
    }

    public final Object d(String str, TypeToken typeToken) {
        if (str == null) {
            return null;
        }
        wdx wdxVar = new wdx(new StringReader(str));
        Strictness strictness = this.h;
        if (strictness == null) {
            strictness = Strictness.LEGACY_STRICT;
        }
        wdxVar.W(strictness);
        Object b = b(wdxVar, typeToken);
        if (b != null) {
            try {
                if (wdxVar.R() != JsonToken.END_DOCUMENT) {
                    throw new JsonSyntaxException("JSON document was not fully consumed.");
                }
            } catch (MalformedJsonException e) {
                throw new JsonSyntaxException(e);
            } catch (IOException e2) {
                throw new JsonIOException(e2);
            }
        }
        return b;
    }

    public final nl11 e(TypeToken typeToken) {
        boolean z;
        Objects.requireNonNull(typeToken, "type must not be null");
        ConcurrentHashMap concurrentHashMap = this.b;
        nl11 nl11Var = (nl11) concurrentHashMap.get(typeToken);
        if (nl11Var != null) {
            return nl11Var;
        }
        ThreadLocal threadLocal = this.a;
        Map map = (Map) threadLocal.get();
        if (map == null) {
            map = new HashMap();
            threadLocal.set(map);
            z = true;
        } else {
            nl11 nl11Var2 = (nl11) map.get(typeToken);
            if (nl11Var2 != null) {
                return nl11Var2;
            }
            z = false;
        }
        try {
            a aVar = new a();
            map.put(typeToken, aVar);
            Iterator it = this.e.iterator();
            nl11 nl11Var3 = null;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                nl11Var3 = ((ol11) it.next()).create(this, typeToken);
                if (nl11Var3 != null) {
                    if (aVar.a != null) {
                        throw new AssertionError("Delegate is already set");
                    }
                    aVar.a = nl11Var3;
                    map.put(typeToken, nl11Var3);
                }
            }
            if (z) {
                threadLocal.remove();
            }
            if (nl11Var3 == null) {
                kbs.f(typeToken, "GSON (2.14.0) cannot handle ");
                return null;
            }
            if (z) {
                concurrentHashMap.putAll(map);
            }
            return nl11Var3;
        } catch (Throwable th) {
            if (z) {
                threadLocal.remove();
            }
            throw th;
        }
    }

    public final nl11 f(Class cls) {
        return e(TypeToken.get(cls));
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x004d, code lost:
    
        if (r4 == r7) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0019, code lost:
    
        if (r4 == r7) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final nl11 g(ol11 ol11Var, TypeToken typeToken) {
        boolean z;
        ubx ubxVar = this.d;
        ubxVar.getClass();
        ConcurrentHashMap concurrentHashMap = ubxVar.b;
        if (ol11Var != ubx.c) {
            Class rawType = typeToken.getRawType();
            ol11 ol11Var2 = (ol11) concurrentHashMap.get(rawType);
            if (ol11Var2 == null) {
                JsonAdapter jsonAdapter = (JsonAdapter) rawType.getAnnotation(JsonAdapter.class);
                if (jsonAdapter != null) {
                    Class value = jsonAdapter.value();
                    if (ol11.class.isAssignableFrom(value)) {
                        ol11 ol11Var3 = (ol11) ubxVar.a.J(TypeToken.get(value), true).i();
                        ol11 ol11Var4 = (ol11) concurrentHashMap.putIfAbsent(rawType, ol11Var3);
                        if (ol11Var4 != null) {
                            ol11Var3 = ol11Var4;
                        }
                    }
                }
            }
            z = false;
            for (ol11 ol11Var5 : this.e) {
                if (z) {
                    nl11 create = ol11Var5.create(this, typeToken);
                    if (create != null) {
                        return create;
                    }
                } else if (ol11Var5 == ol11Var) {
                    z = true;
                }
            }
            if (z) {
                return e(typeToken);
            }
            kbs.f(typeToken, "GSON cannot serialize or deserialize ");
            return null;
        }
        ol11Var = ubxVar;
        z = false;
        while (r0.hasNext()) {
        }
        if (z) {
        }
    }

    public final String h(Object obj) {
        Strictness strictness = this.h;
        boolean z = this.f;
        n9s n9sVar = this.g;
        if (obj == null) {
            fdx fdxVar = fdx.a;
            StringBuilder sb = new StringBuilder();
            try {
                afx afxVar = new afx(chb1.h(sb));
                afxVar.D(n9sVar);
                afxVar.B = z;
                if (strictness == null) {
                    strictness = Strictness.LEGACY_STRICT;
                }
                afxVar.G(strictness);
                afxVar.D = false;
                i(fdxVar, afxVar);
                return sb.toString();
            } catch (IOException e) {
                throw new JsonIOException(e);
            }
        }
        Class<?> cls = obj.getClass();
        StringBuilder sb2 = new StringBuilder();
        try {
            afx afxVar2 = new afx(chb1.h(sb2));
            afxVar2.D(n9sVar);
            afxVar2.B = z;
            if (strictness == null) {
                strictness = Strictness.LEGACY_STRICT;
            }
            afxVar2.G(strictness);
            afxVar2.D = false;
            j(obj, cls, afxVar2);
            return sb2.toString();
        } catch (IOException e2) {
            throw new JsonIOException(e2);
        }
    }

    public final void i(pcx pcxVar, afx afxVar) {
        Strictness strictness = afxVar.A;
        boolean z = afxVar.B;
        boolean z2 = afxVar.D;
        afxVar.B = this.f;
        afxVar.D = false;
        Strictness strictness2 = this.h;
        if (strictness2 != null) {
            afxVar.A = strictness2;
        } else if (strictness == Strictness.LEGACY_STRICT) {
            afxVar.G(Strictness.LENIENT);
        }
        try {
            try {
                ucx.a.getClass();
                ucx.c(pcxVar, afxVar);
                afxVar.G(strictness);
                afxVar.B = z;
                afxVar.D = z2;
            } catch (IOException e) {
                throw new JsonIOException(e);
            } catch (AssertionError e2) {
                throw new AssertionError("AssertionError (GSON 2.14.0): " + e2.getMessage(), e2);
            }
        } catch (Throwable th) {
            afxVar.G(strictness);
            afxVar.B = z;
            afxVar.D = z2;
            throw th;
        }
    }

    public final void j(Object obj, Class cls, afx afxVar) {
        nl11 e = e(TypeToken.get((Type) cls));
        Strictness strictness = afxVar.A;
        Strictness strictness2 = this.h;
        if (strictness2 != null) {
            afxVar.A = strictness2;
        } else if (strictness == Strictness.LEGACY_STRICT) {
            afxVar.G(Strictness.LENIENT);
        }
        boolean z = afxVar.B;
        boolean z2 = afxVar.D;
        afxVar.B = this.f;
        afxVar.D = false;
        try {
            try {
                try {
                    e.write(afxVar, obj);
                } catch (IOException e2) {
                    throw new JsonIOException(e2);
                }
            } catch (AssertionError e3) {
                throw new AssertionError("AssertionError (GSON 2.14.0): " + e3.getMessage(), e3);
            }
        } finally {
            afxVar.G(strictness);
            afxVar.B = z;
            afxVar.D = z2;
        }
    }

    public final pcx k(Object obj) {
        if (obj == null) {
            return fdx.a;
        }
        Class cls = obj.getClass();
        tex texVar = new tex();
        j(obj, cls, texVar);
        return texVar.b0();
    }

    public final String toString() {
        return "{serializeNulls:false,factories:" + this.e + ",instanceCreators:" + this.c + "}";
    }

    public u3u() {
        this(v3u.v);
    }
}
