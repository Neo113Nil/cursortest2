package defpackage;

import com.google.gson.JsonIOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes11.dex */
public final class zoi0 {
    public final String a;
    public final Field b;
    public final String c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Method e;
    public final /* synthetic */ nl11 f;
    public final /* synthetic */ nl11 g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ boolean i;

    public zoi0(String str, Field field, boolean z, Method method, nl11 nl11Var, nl11 nl11Var2, boolean z2, boolean z3) {
        this.d = z;
        this.e = method;
        this.f = nl11Var;
        this.g = nl11Var2;
        this.h = z2;
        this.i = z3;
        this.a = str;
        this.b = field;
        this.c = field.getName();
    }

    public final void a(afx afxVar, Object obj) {
        Object obj2;
        boolean z = this.d;
        Field field = this.b;
        Method method = this.e;
        if (z) {
            if (method == null) {
                epi0.a(obj, field);
            } else {
                epi0.a(obj, method);
            }
        }
        if (method != null) {
            try {
                obj2 = method.invoke(obj, null);
            } catch (InvocationTargetException e) {
                throw new JsonIOException(oyr.p("Accessor ", xoi0.d(method, false), " threw exception"), e.getCause());
            }
        } else {
            obj2 = field.get(obj);
        }
        if (obj2 == obj) {
            return;
        }
        afxVar.o(this.a);
        this.f.write(afxVar, obj2);
    }
}
