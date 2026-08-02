package kotlinx.serialization.json.internal;

import defpackage.adx;
import defpackage.b8;
import defpackage.ccx;
import defpackage.gyc;
import defpackage.gzg;
import defpackage.hzg;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.qje;
import defpackage.tje;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.d;

/* loaded from: classes9.dex */
public final class b {
    public final b8 a;
    public final boolean b;
    public final boolean c;
    public int d;

    public b(ccx ccxVar, b8 b8Var) {
        this.a = b8Var;
        this.b = ccxVar.c;
        this.c = ccxVar.l;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x0099 -> B:10:0x009d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(b bVar, hzg hzgVar, BaseContinuationImpl baseContinuationImpl) {
        JsonTreeReader$readObject$2 jsonTreeReader$readObject$2;
        int i;
        LinkedHashMap linkedHashMap;
        JsonTreeReader$readObject$2 jsonTreeReader$readObject$22;
        int i2;
        byte b;
        hzg hzgVar2;
        b8 b8Var;
        b bVar2 = bVar;
        b8 b8Var2 = bVar2.a;
        if (baseContinuationImpl instanceof JsonTreeReader$readObject$2) {
            jsonTreeReader$readObject$2 = (JsonTreeReader$readObject$2) baseContinuationImpl;
            int i3 = jsonTreeReader$readObject$2.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                jsonTreeReader$readObject$2.label = i3 - Integer.MIN_VALUE;
                Object obj = jsonTreeReader$readObject$2.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = jsonTreeReader$readObject$2.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    byte g = b8Var2.g((byte) 6);
                    if (b8Var2.v() == 4) {
                        b8.q(bVar2.a, "Unexpected leading comma", 0, null, 6);
                        throw null;
                    }
                    linkedHashMap = new LinkedHashMap();
                    jsonTreeReader$readObject$22 = jsonTreeReader$readObject$2;
                    i2 = 0;
                    b = g;
                    hzgVar2 = hzgVar;
                    b8Var = bVar2.a;
                    if (b8Var.c()) {
                    }
                    b8 b8Var3 = bVar2.a;
                    if (b == 6) {
                    }
                    return new kotlinx.serialization.json.c(linkedHashMap);
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i4 = jsonTreeReader$readObject$2.I$0;
                String str = (String) jsonTreeReader$readObject$2.L$3;
                LinkedHashMap linkedHashMap2 = (LinkedHashMap) jsonTreeReader$readObject$2.L$2;
                b bVar3 = (b) jsonTreeReader$readObject$2.L$1;
                hzg hzgVar3 = (hzg) jsonTreeReader$readObject$2.L$0;
                kotlin.b.b(obj);
                JsonTreeReader$readObject$2 jsonTreeReader$readObject$23 = jsonTreeReader$readObject$2;
                int i5 = i4;
                bVar2 = bVar3;
                linkedHashMap = linkedHashMap2;
                jsonTreeReader$readObject$22 = jsonTreeReader$readObject$23;
                linkedHashMap.put(str, (kotlinx.serialization.json.b) obj);
                byte f = bVar2.a.f();
                if (f == 4) {
                    if (f != 7) {
                        b8.q(bVar2.a, "Expected end of the object or comma", 0, null, 6);
                        throw null;
                    }
                    b = f;
                    b8 b8Var32 = bVar2.a;
                    if (b == 6) {
                        b8Var32.g((byte) 7);
                    } else if (b == 4) {
                        if (!bVar2.c) {
                            qje.A(b8Var32);
                            throw null;
                        }
                        b8Var32.g((byte) 7);
                    }
                    return new kotlinx.serialization.json.c(linkedHashMap);
                }
                i2 = i5;
                b = f;
                hzgVar2 = hzgVar3;
                b8Var = bVar2.a;
                if (b8Var.c()) {
                    String l = bVar2.b ? b8Var.l() : b8Var.j();
                    b8Var.g((byte) 5);
                    jsonTreeReader$readObject$22.L$0 = hzgVar2;
                    jsonTreeReader$readObject$22.L$1 = bVar2;
                    jsonTreeReader$readObject$22.L$2 = linkedHashMap;
                    jsonTreeReader$readObject$22.L$3 = l;
                    jsonTreeReader$readObject$22.I$0 = i2;
                    jsonTreeReader$readObject$22.B$0 = b;
                    jsonTreeReader$readObject$22.I$1 = 0;
                    jsonTreeReader$readObject$22.label = 1;
                    CoroutineSingletons a = hzgVar2.a(jsonTreeReader$readObject$22);
                    if (a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    hzgVar3 = hzgVar2;
                    obj = a;
                    i5 = i2;
                    str = l;
                    linkedHashMap.put(str, (kotlinx.serialization.json.b) obj);
                    byte f2 = bVar2.a.f();
                    if (f2 == 4) {
                    }
                }
                b8 b8Var322 = bVar2.a;
                if (b == 6) {
                }
                return new kotlinx.serialization.json.c(linkedHashMap);
            }
        }
        jsonTreeReader$readObject$2 = new JsonTreeReader$readObject$2(bVar2, baseContinuationImpl);
        Object obj2 = jsonTreeReader$readObject$2.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = jsonTreeReader$readObject$2.label;
        if (i != 0) {
        }
    }

    public final kotlinx.serialization.json.b b() {
        kotlinx.serialization.json.b cVar;
        b8 b8Var = this.a;
        byte v = b8Var.v();
        if (v == 1) {
            return d(true);
        }
        if (v == 0) {
            return d(false);
        }
        if (v != 6) {
            if (v == 8) {
                return c();
            }
            b8.q(b8Var, "Cannot read Json element because of unexpected ".concat(tje.i0(v)), 0, null, 6);
            throw null;
        }
        int i = this.d + 1;
        this.d = i;
        if (i == 200) {
            cVar = (kotlinx.serialization.json.b) gzg.a(new gyc(new JsonTreeReader$readDeepRecursive$1(this, null)));
        } else {
            byte g = b8Var.g((byte) 6);
            if (b8Var.v() == 4) {
                b8.q(b8Var, "Unexpected leading comma", 0, null, 6);
                throw null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (true) {
                if (!b8Var.c()) {
                    break;
                }
                String l = this.b ? b8Var.l() : b8Var.j();
                b8Var.g((byte) 5);
                linkedHashMap.put(l, b());
                g = b8Var.f();
                if (g != 4) {
                    if (g != 7) {
                        b8.q(b8Var, "Expected end of the object or comma", 0, null, 6);
                        throw null;
                    }
                }
            }
            if (g == 6) {
                b8Var.g((byte) 7);
            } else if (g == 4) {
                if (!this.c) {
                    qje.A(b8Var);
                    throw null;
                }
                b8Var.g((byte) 7);
            }
            cVar = new kotlinx.serialization.json.c(linkedHashMap);
        }
        this.d--;
        return cVar;
    }

    public final kotlinx.serialization.json.a c() {
        b8 b8Var = this.a;
        byte f = b8Var.f();
        if (b8Var.v() == 4) {
            b8.q(b8Var, "Unexpected leading comma", 0, null, 6);
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        while (b8Var.c()) {
            arrayList.add(b());
            f = b8Var.f();
            if (f != 4) {
                boolean z = f == 9;
                int i = b8Var.b;
                if (!z) {
                    b8.q(b8Var, "Expected end of the array or comma", i, null, 4);
                    throw null;
                }
            }
        }
        if (f == 8) {
            b8Var.g((byte) 9);
        } else if (f == 4) {
            if (!this.c) {
                qje.z(b8Var, "array");
                throw null;
            }
            b8Var.g((byte) 9);
        }
        return new kotlinx.serialization.json.a(arrayList);
    }

    public final d d(boolean z) {
        boolean z2 = this.b;
        b8 b8Var = this.a;
        String l = (z2 || !z) ? b8Var.l() : b8Var.j();
        return (z || !jl40.l(l, "null")) ? new adx(l, z, null) : JsonNull.INSTANCE;
    }
}
