package defpackage;

import android.graphics.Paint;
import android.net.Uri;
import com.yandex.div.core.util.binding.a;
import com.yandex.div.core.view2.Div2View;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.core.utils.text.b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes8.dex */
public abstract /* synthetic */ class unr0 {
    public static void A(String str, String str2, String str3, StringBuilder sb, boolean z) {
        sb.append(z);
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
    }

    public static void B(String str, String str2, ArrayList arrayList) {
        arrayList.add(str + str2);
    }

    public static void C(Object[] objArr, int i, String str, hst hstVar) {
        String.format(str, Arrays.copyOf(objArr, i));
        hstVar.getClass();
    }

    public static void D(Object[] objArr, int i, String str, hst hstVar, IllegalStateException illegalStateException) {
        hstVar.k(illegalStateException, String.format(str, Arrays.copyOf(objArr, i)));
    }

    public static int a(int i, int i2, double d) {
        return (Double.hashCode(d) + i) * i2;
    }

    public static int b(int i, int i2, String str) {
        return (str.hashCode() + i) * i2;
    }

    public static int c(int i, int i2, List list) {
        return (list.hashCode() + i) * i2;
    }

    public static int d(int i, int i2, Map map) {
        return (map.hashCode() + i) * i2;
    }

    public static int e(int i, int i2, boolean z) {
        return (Boolean.hashCode(z) + i) * i2;
    }

    public static Paint f(boolean z) {
        Paint paint = new Paint();
        paint.setAntiAlias(z);
        return paint;
    }

    public static a g(Div2View div2View, ngd0 ngd0Var) {
        a f = div2View.getViewComponent().f();
        ngd0Var.p();
        return f;
    }

    public static Text.Resource h(b bVar, int i) {
        bVar.getClass();
        return new Text.Resource(i);
    }

    public static ClassCastException i(Iterator it) {
        it.next().getClass();
        return new ClassCastException();
    }

    public static Object j(int i) {
        return j73.G(i, new Throwable().getStackTrace());
    }

    public static Object k(int i, ArrayList arrayList) {
        return arrayList.get(arrayList.size() - i);
    }

    public static String l(char c, String str, String str2) {
        return str + str2 + c;
    }

    public static String m(int i, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(i);
        return sb.toString();
    }

    public static String n(Uri uri, String str) {
        return str + uri;
    }

    public static String o(String str, String str2, String str3, String str4) {
        return str + str2 + str3 + str4;
    }

    public static String p(String str, String str2, String str3, String str4, String str5) {
        return str + str2 + str3 + str4 + str5;
    }

    public static String q(StringBuilder sb, double d, char c) {
        sb.append(d);
        sb.append(c);
        return sb.toString();
    }

    public static String r(StringBuilder sb, String str, String str2, String str3) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        return sb.toString();
    }

    public static String s(StringBuilder sb, Throwable th, char c) {
        sb.append(th);
        sb.append(c);
        return sb.toString();
    }

    public static String t(StringBuilder sb, List list, char c) {
        sb.append(list);
        sb.append(c);
        return sb.toString();
    }

    public static String u(StringBuilder sb, boolean z, char c) {
        sb.append(z);
        sb.append(c);
        return sb.toString();
    }

    public static StringBuilder v(int i, String str, String str2, String str3, String str4) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        return sb;
    }

    public static StringBuilder w(long j, String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(j);
        sb.append(str2);
        return sb;
    }

    public static StringBuilder x(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        return sb;
    }

    public static NoWhenBranchMatchedException y(int i, bts btsVar, boolean z) {
        btsVar.e0(i);
        btsVar.t(z);
        return new NoWhenBranchMatchedException();
    }

    public static void z(hst hstVar, String str) {
        hstVar.x(new IllegalStateException(), str);
    }
}
