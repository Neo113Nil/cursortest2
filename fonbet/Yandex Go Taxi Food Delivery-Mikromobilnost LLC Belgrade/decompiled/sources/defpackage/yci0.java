package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.util.Base64;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.components.DependencyException;
import com.yandex.div.internal.widget.tabs.TabView;
import io.appmetrica.analytics.impl.InterfaceC0269d7;
import io.appmetrica.analytics.impl.S2;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.SerializationException;
import ru.yandex.taxi.search.address.view.PointType;

/* loaded from: classes.dex */
public final /* synthetic */ class yci0 implements moh, r5m, InterfaceC0269d7, sll0, b0t0, sty, r131, lrt0, r55, f5x0, a911 {
    public static /* synthetic */ void g(float f, String str) {
        throw new IllegalArgumentException(str + f);
    }

    public static /* synthetic */ void h(int i, Object obj, Object obj2, String str) {
        throw new IllegalStateException(str + i + obj + obj2);
    }

    public static /* synthetic */ void i(int i, String str) {
        throw new IllegalStateException((str + i).toString());
    }

    public static /* synthetic */ void j(Object obj, Object obj2, Object obj3, Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(obj2);
        sb.append(obj3);
        throw new IllegalStateException(sb.toString(), th);
    }

    public static /* synthetic */ void k(Object obj, String str) {
        throw new IllegalStateException(str + obj);
    }

    public static /* synthetic */ void m(String str) {
        throw new SerializationException(str);
    }

    public static /* synthetic */ void n(String str, Object obj, Object obj2) {
        throw new IllegalStateException((str + obj + obj2).toString());
    }

    public static /* synthetic */ void o(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalStateException(str + obj + obj2 + obj3);
    }

    public static /* synthetic */ void p(String str, Throwable th) {
        throw new IllegalArgumentException(str, th);
    }

    public static /* synthetic */ void q(StringBuilder sb, Object obj, Object obj2, Object obj3) {
        sb.append(obj);
        sb.append(obj2);
        sb.append(obj3);
        throw new IllegalArgumentException(sb.toString());
    }

    public static /* synthetic */ void r(Throwable th) {
        throw new IllegalArgumentException(th);
    }

    public static /* synthetic */ void s(int i, String str) {
        throw new IOException(str + i);
    }

    public static /* synthetic */ void t(Object obj, String str) {
        throw new IllegalStateException(str + obj);
    }

    public static /* synthetic */ void u(String str, Object obj, Object obj2) {
        throw new GeneralSecurityException(str + obj + obj2);
    }

    public static /* synthetic */ void v(Object obj, String str) {
        throw new SerializationException(str + obj);
    }

    public static /* synthetic */ void w(String str, Object obj, Object obj2) {
        throw new DependencyException(str + obj + obj2);
    }

    public static /* synthetic */ void x(String str, Object obj, Object obj2) {
        throw new IllegalArgumentException((str + obj + obj2).toString());
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0269d7
    public boolean a(Throwable th) {
        return S2.a(th);
    }

    @Override // defpackage.sll0
    public Object apply(Object obj) {
        Cursor cursor = (Cursor) obj;
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            a94 a = v111.a();
            String string = cursor.getString(1);
            byte[] bArr = null;
            if (string == null) {
                ny61.t("Null backendName");
                return null;
            }
            a.a = string;
            a.c = i3f0.b(cursor.getInt(2));
            String string2 = cursor.getString(3);
            if (string2 != null) {
                bArr = Base64.decode(string2, 0);
            }
            a.b = bArr;
            arrayList.add(a.a());
        }
        return arrayList;
    }

    @Override // defpackage.sty
    public boolean b(List list) {
        return true;
    }

    @Override // defpackage.a911
    public void c(Exception exc) {
    }

    @Override // defpackage.r55
    public void d(pv0 pv0Var, PointType pointType) {
    }

    @Override // defpackage.lrt0
    public boolean e() {
        return false;
    }

    @Override // defpackage.moh
    public void f(zvf0 zvf0Var) {
        b64.D(zvf0Var.get());
        throw null;
    }

    @Override // defpackage.b0t0
    public RecyclerView.j get(Context context) {
        return new y6e(context);
    }

    @Override // defpackage.f5x0
    public int getMaxWidth() {
        int lambda$new$0;
        lambda$new$0 = TabView.lambda$new$0();
        return lambda$new$0;
    }

    @Override // defpackage.r131
    public boolean l(Object obj) {
        return ((Double) obj).doubleValue() > 0.0d;
    }

    @Override // defpackage.r5m
    public double a(double d) {
        return d;
    }
}
