package defpackage;

import androidx.appcompat.widget.ActionBarContextView;
import com.connectsdk.service.airplay.PListParser;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.g;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e0 implements ygu {
    public static final d0[] e = new d0[0];
    public final /* synthetic */ int a;
    public boolean b;
    public int c;
    public Object d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e0(int i, byte b) {
        this(10);
        this.a = i;
        switch (i) {
            case 5:
                this.c = -1;
                this.d = new eqi(new duf[16]);
                break;
            default:
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(e0 e0Var, kh7 kh7Var, kq2 kq2Var) {
        k7f k7fVar;
        int i;
        LinkedHashMap linkedHashMap;
        kh7 kh7Var2;
        byte b;
        y6 y6Var;
        e0 e0Var2;
        y6 y6Var2 = (y6) e0Var.d;
        if (kq2Var instanceof k7f) {
            k7fVar = (k7f) kq2Var;
            int i2 = k7fVar.q;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                k7fVar.q = i2 - Integer.MIN_VALUE;
                Object obj = k7fVar.o;
                nm6 nm6Var = nm6.a;
                i = k7fVar.q;
                int i3 = 0;
                if (i != 0) {
                    qgg.h0(obj);
                    byte g = y6Var2.g((byte) 6);
                    if (y6Var2.x() == 4) {
                        y6.q(y6Var2, "Unexpected leading comma", 0, null, 6);
                        throw null;
                    }
                    linkedHashMap = new LinkedHashMap();
                    kh7Var2 = kh7Var;
                    b = g;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i4 = k7fVar.n;
                    String str = k7fVar.m;
                    linkedHashMap = k7fVar.l;
                    e0Var2 = k7fVar.k;
                    kh7Var2 = k7fVar.j;
                    qgg.h0(obj);
                    linkedHashMap.put(str, (w4f) obj);
                    b = ((y6) e0Var2.d).f();
                    if (b != 4) {
                        if (b != 7) {
                            y6.q((y6) e0Var2.d, "Expected end of the object or comma", 0, null, 6);
                            throw null;
                        }
                        y6 y6Var3 = (y6) e0Var2.d;
                        if (b != 6) {
                            y6Var3.g((byte) 7);
                        } else if (b == 4) {
                            ghh.y(y6Var3, "object");
                            throw null;
                        }
                        return new q5f(linkedHashMap);
                    }
                    i3 = i4;
                    e0Var = e0Var2;
                }
                y6Var = (y6) e0Var.d;
                if (y6Var.c()) {
                    e0Var2 = e0Var;
                    y6 y6Var32 = (y6) e0Var2.d;
                    if (b != 6) {
                    }
                    return new q5f(linkedHashMap);
                }
                String l = e0Var.b ? y6Var.l() : y6Var.j();
                y6Var.g((byte) 5);
                Unit unit = Unit.a;
                k7fVar.j = kh7Var2;
                k7fVar.k = e0Var;
                k7fVar.l = linkedHashMap;
                k7fVar.m = l;
                k7fVar.n = i3;
                k7fVar.q = 1;
                lh7 lh7Var = (lh7) kh7Var2;
                lh7Var.getClass();
                lh7Var.c = k7fVar;
                lh7Var.b = unit;
                return nm6Var;
            }
        }
        k7fVar = new k7f(e0Var, kq2Var);
        Object obj2 = k7fVar.o;
        nm6 nm6Var2 = nm6.a;
        i = k7fVar.q;
        int i32 = 0;
        if (i != 0) {
        }
        y6Var = (y6) e0Var.d;
        if (y6Var.c()) {
        }
    }

    public static d0[] f(d0[] d0VarArr) {
        return d0VarArr.length < 1 ? e : (d0[]) d0VarArr.clone();
    }

    @Override // defpackage.ygu
    public void a() {
        this.b = true;
    }

    @Override // defpackage.ygu
    public void b() {
        super/*android.view.View*/.setVisibility(0);
        this.b = false;
    }

    @Override // defpackage.ygu
    public void c() {
        if (this.b) {
            return;
        }
        ActionBarContextView actionBarContextView = (ActionBarContextView) this.d;
        actionBarContextView.f = null;
        super/*android.view.View*/.setVisibility(this.c);
    }

    public void e(d0 d0Var) {
        if (d0Var == null) {
            jj4.j("'element' cannot be null");
            return;
        }
        d0[] d0VarArr = (d0[]) this.d;
        int length = d0VarArr.length;
        int i = this.c + 1;
        if (this.b | (i > length)) {
            d0[] d0VarArr2 = new d0[Math.max(d0VarArr.length, (i >> 1) + i)];
            System.arraycopy((d0[]) this.d, 0, d0VarArr2, 0, this.c);
            this.d = d0VarArr2;
            this.b = false;
        }
        ((d0[]) this.d)[this.c] = d0Var;
        this.c = i;
    }

    public d0 g(int i) {
        if (i < this.c) {
            return ((d0[]) this.d)[i];
        }
        throw new ArrayIndexOutOfBoundsException(i + " >= " + this.c);
    }

    public w4f h() {
        w4f q5fVar;
        Object obj;
        Object invoke;
        y6 y6Var = (y6) this.d;
        byte x = y6Var.x();
        if (x == 1) {
            return j(true);
        }
        if (x == 0) {
            return j(false);
        }
        if (x != 6) {
            if (x == 8) {
                return i();
            }
            y6.q(y6Var, "Cannot read Json element because of unexpected ".concat(wct.M(x)), 0, null, 6);
            throw null;
        }
        int i = this.c + 1;
        this.c = i;
        if (i == 200) {
            j7f j7fVar = new j7f(this, null);
            Unit unit = Unit.a;
            nm6 nm6Var = jh7.a;
            lh7 lh7Var = new lh7(null);
            lh7Var.a = j7fVar;
            lh7Var.b = unit;
            lh7Var.c = lh7Var;
            nm6 nm6Var2 = jh7.a;
            lh7Var.d = nm6Var2;
            while (true) {
                obj = lh7Var.d;
                Continuation continuation = lh7Var.c;
                if (continuation == null) {
                    break;
                }
                r7o r7oVar = z7o.b;
                if (Intrinsics.d(nm6Var2, obj)) {
                    try {
                        j7f j7fVar2 = lh7Var.a;
                        Unit unit2 = lh7Var.b;
                        if (j7fVar2 == null) {
                            j7fVar2.getClass();
                            CoroutineContext context = continuation.getContext();
                            Object oxeVar = context == g.a ? new oxe(continuation) : new pxe(continuation, context);
                            wct.o(3, j7fVar2);
                            invoke = j7fVar2.invoke(lh7Var, unit2, oxeVar);
                        } else {
                            wct.o(3, j7fVar2);
                            invoke = j7fVar2.invoke(lh7Var, unit2, continuation);
                        }
                        if (invoke != nm6.a) {
                            continuation.resumeWith(invoke);
                        }
                    } catch (Throwable th) {
                        r7o r7oVar2 = z7o.b;
                        continuation.resumeWith(new t7o(th));
                    }
                } else {
                    lh7Var.d = nm6Var2;
                    continuation.resumeWith(obj);
                }
            }
            qgg.h0(obj);
            q5fVar = (w4f) obj;
        } else {
            byte g = y6Var.g((byte) 6);
            if (y6Var.x() == 4) {
                y6.q(y6Var, "Unexpected leading comma", 0, null, 6);
                throw null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (true) {
                if (!y6Var.c()) {
                    break;
                }
                String l = this.b ? y6Var.l() : y6Var.j();
                y6Var.g((byte) 5);
                linkedHashMap.put(l, h());
                g = y6Var.f();
                if (g != 4) {
                    if (g != 7) {
                        y6.q(y6Var, "Expected end of the object or comma", 0, null, 6);
                        throw null;
                    }
                }
            }
            if (g == 6) {
                y6Var.g((byte) 7);
            } else if (g == 4) {
                ghh.y(y6Var, "object");
                throw null;
            }
            q5fVar = new q5f(linkedHashMap);
        }
        this.c--;
        return q5fVar;
    }

    public c4f i() {
        y6 y6Var = (y6) this.d;
        byte f = y6Var.f();
        if (y6Var.x() == 4) {
            y6.q(y6Var, "Unexpected leading comma", 0, null, 6);
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        while (y6Var.c()) {
            arrayList.add(h());
            f = y6Var.f();
            if (f != 4) {
                boolean z = f == 9;
                int i = y6Var.b;
                if (!z) {
                    y6.q(y6Var, "Expected end of the array or comma", i, null, 4);
                    throw null;
                }
            }
        }
        if (f == 8) {
            y6Var.g((byte) 9);
        } else if (f == 4) {
            ghh.y(y6Var, PListParser.TAG_ARRAY);
            throw null;
        }
        return new c4f(arrayList);
    }

    public v6f j(boolean z) {
        y6 y6Var = (y6) this.d;
        String l = (this.b || !z) ? y6Var.l() : y6Var.j();
        return (z || !Intrinsics.d(l, "null")) ? new j5f(l, z, null) : m5f.INSTANCE;
    }

    public d0[] k() {
        int i = this.c;
        if (i == 0) {
            return e;
        }
        d0[] d0VarArr = (d0[]) this.d;
        if (d0VarArr.length == i) {
            this.b = true;
            return d0VarArr;
        }
        d0[] d0VarArr2 = new d0[i];
        System.arraycopy(d0VarArr, 0, d0VarArr2, 0, i);
        return d0VarArr2;
    }

    public String toString() {
        switch (this.a) {
            case 4:
                z0j Y = ezf.Y(this);
                Y.q((ks3) this.d, "callOptions");
                Y.m(this.c, "previousAttempts");
                Y.t("isTransparentRetry", this.b);
                return Y.toString();
            default:
                return super.toString();
        }
    }

    public e0(j4f j4fVar, y6 y6Var) {
        this.a = 8;
        this.d = y6Var;
        this.b = j4fVar.c;
    }

    public /* synthetic */ e0(char c, int i) {
        this.a = i;
    }

    public e0(FloatingActionButton floatingActionButton) {
        this.a = 7;
        this.b = false;
        this.c = 0;
        this.d = floatingActionButton;
    }

    public e0(int i) {
        this.a = 0;
        if (i >= 0) {
            this.d = i == 0 ? e : new d0[i];
            this.c = 0;
            this.b = false;
            return;
        }
        xq0.x("'initialCapacity' must not be negative");
        throw null;
    }

    public e0(ks3 ks3Var, int i, boolean z) {
        this.a = 4;
        o2g.O(ks3Var, "callOptions");
        this.d = ks3Var;
        this.c = i;
        this.b = z;
    }

    public e0(ActionBarContextView actionBarContextView) {
        this.a = 1;
        this.d = actionBarContextView;
        this.b = false;
    }
}
