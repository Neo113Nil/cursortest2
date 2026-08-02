package defpackage;

import android.os.Parcel;
import com.yandex.go.address.search.perf.b;
import com.yandex.go.payments.common.a;
import com.yandex.go.payments.paymentlist.ui.IconType;
import com.yandex.go.places.models.data.entities.network.ImageDto;
import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import com.ybsdk.core.utils.text.Text;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicReference;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class xvz {
    public static void A(LinkedHashMap linkedHashMap, String str, ArrayList arrayList, boolean z, String str2) {
        linkedHashMap.put(str, arrayList);
        linkedHashMap.put(str2, String.valueOf(z));
    }

    public static /* synthetic */ void B(AtomicReference atomicReference, b bVar) {
        while (!atomicReference.compareAndSet(bVar, null) && atomicReference.get() == bVar) {
        }
    }

    public static boolean C(int i, ImageDto imageDto) {
        return jl40.l(imageDto, new ImageDto(i));
    }

    public static /* synthetic */ boolean D(Optional optional) {
        return !optional.isPresent();
    }

    public static int a(float f, float f2, float f3) {
        return Math.round((f / f2) * f3);
    }

    public static int b(Parcel parcel, LinkedHashMap linkedHashMap, String str, int i, int i2) {
        linkedHashMap.put(str, parcel.readString());
        return i + i2;
    }

    public static int c(ThemedImageUrlEntity themedImageUrlEntity, int i, int i2) {
        return (themedImageUrlEntity.hashCode() + i) * i2;
    }

    public static int d(Text.Constant constant, int i, int i2) {
        return (constant.hashCode() + i) * i2;
    }

    public static u2 e(String str) {
        return new u2(str).B();
    }

    public static iho f(int i, String str, String str2, String str3) {
        wj00 wj00Var = new wj00(i);
        wj00Var.k(str, str2);
        return y891.c(str3, wj00Var);
    }

    public static q0a0 g(IconType iconType, a aVar) {
        return aVar.f(new uyz(iconType, 2));
    }

    public static String h(int i, String str, String str2, String str3, StringBuilder sb) {
        sb.append(i);
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        return sb.toString();
    }

    public static String i(String str, String str2, String str3, String str4, List list) {
        return str + list + str2 + str3 + str4;
    }

    public static String j(String str, String str2, String str3, String str4, Map map) {
        return str + str2 + str3 + map + str4;
    }

    public static String k(String str, String str2, String str3, boolean z, String str4) {
        return str + str2 + str3 + z + str4;
    }

    public static String l(String str, List list, String str2, List list2, String str3) {
        return str + list + str2 + list2 + str3;
    }

    public static String m(String str, boolean z, String str2, String str3, String str4) {
        return str + z + str2 + str3 + str4;
    }

    public static String n(StringBuilder sb, CharSequence charSequence, String str) {
        sb.append((Object) charSequence);
        sb.append(str);
        return sb.toString();
    }

    public static String o(List list, String str, String str2, String str3, boolean z) {
        return str + list + str2 + z + str3;
    }

    public static StringBuilder p(String str, int i, String str2, String str3, boolean z) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(z);
        sb.append(str2);
        sb.append(i);
        sb.append(str3);
        return sb;
    }

    public static StringBuilder q(String str, String str2, String str3, String str4, FormattedText formattedText) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(formattedText);
        sb.append(str4);
        return sb;
    }

    public static StringBuilder r(String str, String str2, String str3, List list, String str4) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(list);
        sb.append(str4);
        return sb;
    }

    public static StringBuilder s(String str, List list, String str2, String str3, String str4) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(list);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        return sb;
    }

    public static LinkedHashMap t(eu90 eu90Var, String str, String str2, String str3, String str4) {
        eu90Var.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(str, str2);
        linkedHashMap.put(str3, str4);
        return linkedHashMap;
    }

    public static void u(int i, wls wlsVar, bts btsVar, boolean z) {
        wlsVar.invoke(btsVar, Integer.valueOf(i));
        btsVar.t(z);
    }

    public static void v(int i, String str) {
        lk91.j(str + i);
    }

    public static void w(long j, String str, StringBuilder sb) {
        sb.append((Object) ldc.i(j));
        sb.append(str);
    }

    public static void x(PayUIEvgenAnalytics$PaymentOption payUIEvgenAnalytics$PaymentOption, LinkedHashMap linkedHashMap, String str, String str2, String str3) {
        linkedHashMap.put(str, payUIEvgenAnalytics$PaymentOption.getEventValue());
        linkedHashMap.put(str2, str3);
    }

    public static void y(fxy0 fxy0Var, String str, StringBuilder sb, char c) {
        sb.append(g8e.p(str, ":", "l:" + fxy0Var.b + ":d:" + fxy0Var.a));
        sb.append(c);
    }

    public static void z(Parcel parcel, int i, Long l) {
        parcel.writeInt(i);
        parcel.writeLong(l.longValue());
    }
}
