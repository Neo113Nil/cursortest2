package yads;

import android.content.Context;
import android.graphics.Typeface;
import defpackage.a081;
import defpackage.gg81;
import defpackage.le71;
import defpackage.rs81;
import defpackage.sls;
import defpackage.wuj0;
import defpackage.z771;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes7.dex */
public final class wi0 extends Lambda implements sls {
    public final /* synthetic */ rs81 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wi0(rs81 rs81Var) {
        super(0);
        this.b = rs81Var;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        Typeface typeface;
        Typeface typeface2;
        Typeface typeface3;
        Typeface typeface4;
        a081 a081Var;
        Context context = this.b.b;
        a081 a081Var2 = a081.g;
        if (a081Var2 == null) {
            synchronized (a081.f) {
                a081Var = a081.g;
                if (a081Var == null) {
                    a081Var = new a081();
                    a081.g = a081Var;
                }
            }
            a081Var2 = a081Var;
        }
        gg81 a = a081Var2.a(context);
        String str = a != null ? a.Y : null;
        if (str == null) {
            return null;
        }
        try {
            gv0 valueOf = gv0.valueOf(str);
            if (le71.a[valueOf.ordinal()] != 1) {
                throw new NoWhenBranchMatchedException();
            }
            try {
                typeface = wuj0.b(valueOf.b, context);
            } catch (Throwable unused) {
                typeface = null;
            }
            try {
                typeface2 = wuj0.b(valueOf.c, context);
            } catch (Throwable unused2) {
                typeface2 = null;
            }
            try {
                typeface3 = wuj0.b(valueOf.d, context);
            } catch (Throwable unused3) {
                typeface3 = null;
            }
            try {
                typeface4 = wuj0.b(valueOf.e, context);
            } catch (Throwable unused4) {
                typeface4 = null;
            }
            return new z771(typeface, typeface2, typeface3, typeface4);
        } catch (Throwable unused5) {
            return null;
        }
    }
}
