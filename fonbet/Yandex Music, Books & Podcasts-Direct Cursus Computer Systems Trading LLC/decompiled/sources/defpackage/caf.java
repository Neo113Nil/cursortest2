package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import java.util.HashMap;
import java.util.HashSet;

/* loaded from: classes.dex */
public abstract class caf {
    public int a = -1;
    public int b = -1;
    public String c = null;
    public HashMap d;

    public abstract void a(HashMap hashMap);

    public abstract caf b();

    public caf c(caf cafVar) {
        this.a = cafVar.a;
        this.b = cafVar.b;
        this.c = cafVar.c;
        this.d = cafVar.d;
        return this;
    }

    public abstract void d(HashSet hashSet);

    public abstract void e(Context context, AttributeSet attributeSet);

    public void f(HashMap hashMap) {
    }
}
