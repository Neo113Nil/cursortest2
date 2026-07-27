package r0;

import D.C0013n;
import L.Q;
import android.util.Log;
import java.util.List;
import m0.C0211i;
import m0.InterfaceC0204b;
import m0.InterfaceC0208f;
import m0.InterfaceC0212j;

/* renamed from: r0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0247h {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ C0247h f2885a = new C0247h();

    /* renamed from: b, reason: collision with root package name */
    public static final t0.e f2886b = new t0.e(new C0243d(1));

    public static InterfaceC0212j a() {
        return (InterfaceC0212j) f2886b.a();
    }

    public static void b(InterfaceC0208f interfaceC0208f, final InterfaceC0248i interfaceC0248i, String str) {
        E0.i.e(interfaceC0208f, "binaryMessenger");
        String concat = str.length() > 0 ? ".".concat(str) : "";
        E.a d2 = interfaceC0208f.d(new C0211i());
        C0013n c0013n = new C0013n(interfaceC0208f, E0.h.f("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setBool", concat), a(), d2);
        if (interfaceC0248i != null) {
            final int i2 = 6;
            c0013n.j(new InterfaceC0204b() { // from class: r0.g
                @Override // m0.InterfaceC0204b
                public final void j(Object obj, Q q2) {
                    List D2;
                    List D3;
                    List D4;
                    List D5;
                    List D6;
                    List D7;
                    List D8;
                    List D9;
                    List D10;
                    List D11;
                    List D12;
                    List D13;
                    List D14;
                    List D15;
                    List D16;
                    switch (i2) {
                        case 0:
                            InterfaceC0248i interfaceC0248i2 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            E0.i.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            E0.i.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            E0.i.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0248i2.i(str2, str3, (C0249j) obj4);
                                D2 = o.g.v(null);
                            } catch (Throwable th) {
                                D2 = u0.e.D(th.getClass().getSimpleName(), th.toString(), E0.h.g("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                            }
                            q2.e(D2);
                            break;
                        case 1:
                            InterfaceC0248i interfaceC0248i3 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            E0.i.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            E0.i.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            E0.i.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0248i3.j(str4, list3, (C0249j) obj7);
                                D3 = o.g.v(null);
                            } catch (Throwable th2) {
                                D3 = u0.e.D(th2.getClass().getSimpleName(), th2.toString(), E0.h.g("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                            }
                            q2.e(D3);
                            break;
                        case F.k.FLOAT_FIELD_NUMBER /* 2 */:
                            InterfaceC0248i interfaceC0248i4 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            E0.i.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            E0.i.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                D4 = o.g.v(interfaceC0248i4.l(str5, (C0249j) obj9));
                            } catch (Throwable th3) {
                                D4 = u0.e.D(th3.getClass().getSimpleName(), th3.toString(), E0.h.g("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                            }
                            q2.e(D4);
                            break;
                        case F.k.INTEGER_FIELD_NUMBER /* 3 */:
                            InterfaceC0248i interfaceC0248i5 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            E0.i.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            E0.i.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                D5 = o.g.v(interfaceC0248i5.m(str6, (C0249j) obj11));
                            } catch (Throwable th4) {
                                D5 = u0.e.D(th4.getClass().getSimpleName(), th4.toString(), E0.h.g("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                            }
                            q2.e(D5);
                            break;
                        case F.k.LONG_FIELD_NUMBER /* 4 */:
                            InterfaceC0248i interfaceC0248i6 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            E0.i.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            E0.i.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                D6 = o.g.v(interfaceC0248i6.a(str7, (C0249j) obj13));
                            } catch (Throwable th5) {
                                D6 = u0.e.D(th5.getClass().getSimpleName(), th5.toString(), E0.h.g("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                            }
                            q2.e(D6);
                            break;
                        case F.k.STRING_FIELD_NUMBER /* 5 */:
                            InterfaceC0248i interfaceC0248i7 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            E0.i.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            E0.i.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                D7 = o.g.v(interfaceC0248i7.f(str8, (C0249j) obj15));
                            } catch (Throwable th6) {
                                D7 = u0.e.D(th6.getClass().getSimpleName(), th6.toString(), E0.h.g("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                            }
                            q2.e(D7);
                            break;
                        case F.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            InterfaceC0248i interfaceC0248i8 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            E0.i.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            E0.i.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            E0.i.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0248i8.b(str9, booleanValue, (C0249j) obj18);
                                D8 = o.g.v(null);
                            } catch (Throwable th7) {
                                D8 = u0.e.D(th7.getClass().getSimpleName(), th7.toString(), E0.h.g("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                            }
                            q2.e(D8);
                            break;
                        case F.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC0248i interfaceC0248i9 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            E0.i.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            E0.i.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                D9 = o.g.v(interfaceC0248i9.q(str10, (C0249j) obj20));
                            } catch (Throwable th8) {
                                D9 = u0.e.D(th8.getClass().getSimpleName(), th8.toString(), E0.h.g("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                            }
                            q2.e(D9);
                            break;
                        case F.k.BYTES_FIELD_NUMBER /* 8 */:
                            InterfaceC0248i interfaceC0248i10 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            E0.i.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            E0.i.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                D10 = o.g.v(interfaceC0248i10.d(str11, (C0249j) obj22));
                            } catch (Throwable th9) {
                                D10 = u0.e.D(th9.getClass().getSimpleName(), th9.toString(), E0.h.g("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                            }
                            q2.e(D10);
                            break;
                        case 9:
                            InterfaceC0248i interfaceC0248i11 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            E0.i.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0248i11.o(list12, (C0249j) obj23);
                                D11 = o.g.v(null);
                            } catch (Throwable th10) {
                                D11 = u0.e.D(th10.getClass().getSimpleName(), th10.toString(), E0.h.g("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                            }
                            q2.e(D11);
                            break;
                        case 10:
                            InterfaceC0248i interfaceC0248i12 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            E0.i.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                D12 = o.g.v(interfaceC0248i12.p(list14, (C0249j) obj24));
                            } catch (Throwable th11) {
                                D12 = u0.e.D(th11.getClass().getSimpleName(), th11.toString(), E0.h.g("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                            }
                            q2.e(D12);
                            break;
                        case 11:
                            InterfaceC0248i interfaceC0248i13 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            E0.i.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                D13 = o.g.v(interfaceC0248i13.g(list16, (C0249j) obj25));
                            } catch (Throwable th12) {
                                D13 = u0.e.D(th12.getClass().getSimpleName(), th12.toString(), E0.h.g("Cause: ", th12.getCause(), ", Stacktrace: ", Log.getStackTraceString(th12)));
                            }
                            q2.e(D13);
                            break;
                        case 12:
                            InterfaceC0248i interfaceC0248i14 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            E0.i.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            E0.i.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            E0.i.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0248i14.e(str12, str13, (C0249j) obj28);
                                D14 = o.g.v(null);
                            } catch (Throwable th13) {
                                D14 = u0.e.D(th13.getClass().getSimpleName(), th13.toString(), E0.h.g("Cause: ", th13.getCause(), ", Stacktrace: ", Log.getStackTraceString(th13)));
                            }
                            q2.e(D14);
                            break;
                        case 13:
                            InterfaceC0248i interfaceC0248i15 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            E0.i.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            E0.i.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            E0.i.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0248i15.h(str14, longValue, (C0249j) obj31);
                                D15 = o.g.v(null);
                            } catch (Throwable th14) {
                                D15 = u0.e.D(th14.getClass().getSimpleName(), th14.toString(), E0.h.g("Cause: ", th14.getCause(), ", Stacktrace: ", Log.getStackTraceString(th14)));
                            }
                            q2.e(D15);
                            break;
                        default:
                            InterfaceC0248i interfaceC0248i16 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            E0.i.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            E0.i.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            E0.i.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0248i16.k(str15, doubleValue, (C0249j) obj34);
                                D16 = o.g.v(null);
                            } catch (Throwable th15) {
                                D16 = u0.e.D(th15.getClass().getSimpleName(), th15.toString(), E0.h.g("Cause: ", th15.getCause(), ", Stacktrace: ", Log.getStackTraceString(th15)));
                            }
                            q2.e(D16);
                            break;
                    }
                }
            });
        } else {
            c0013n.j(null);
        }
        C0013n c0013n2 = new C0013n(interfaceC0208f, E0.h.f("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setString", concat), a(), d2);
        if (interfaceC0248i != null) {
            final int i3 = 12;
            c0013n2.j(new InterfaceC0204b() { // from class: r0.g
                @Override // m0.InterfaceC0204b
                public final void j(Object obj, Q q2) {
                    List D2;
                    List D3;
                    List D4;
                    List D5;
                    List D6;
                    List D7;
                    List D8;
                    List D9;
                    List D10;
                    List D11;
                    List D12;
                    List D13;
                    List D14;
                    List D15;
                    List D16;
                    switch (i3) {
                        case 0:
                            InterfaceC0248i interfaceC0248i2 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            E0.i.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            E0.i.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            E0.i.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0248i2.i(str2, str3, (C0249j) obj4);
                                D2 = o.g.v(null);
                            } catch (Throwable th) {
                                D2 = u0.e.D(th.getClass().getSimpleName(), th.toString(), E0.h.g("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                            }
                            q2.e(D2);
                            break;
                        case 1:
                            InterfaceC0248i interfaceC0248i3 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            E0.i.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            E0.i.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            E0.i.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0248i3.j(str4, list3, (C0249j) obj7);
                                D3 = o.g.v(null);
                            } catch (Throwable th2) {
                                D3 = u0.e.D(th2.getClass().getSimpleName(), th2.toString(), E0.h.g("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                            }
                            q2.e(D3);
                            break;
                        case F.k.FLOAT_FIELD_NUMBER /* 2 */:
                            InterfaceC0248i interfaceC0248i4 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            E0.i.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            E0.i.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                D4 = o.g.v(interfaceC0248i4.l(str5, (C0249j) obj9));
                            } catch (Throwable th3) {
                                D4 = u0.e.D(th3.getClass().getSimpleName(), th3.toString(), E0.h.g("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                            }
                            q2.e(D4);
                            break;
                        case F.k.INTEGER_FIELD_NUMBER /* 3 */:
                            InterfaceC0248i interfaceC0248i5 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            E0.i.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            E0.i.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                D5 = o.g.v(interfaceC0248i5.m(str6, (C0249j) obj11));
                            } catch (Throwable th4) {
                                D5 = u0.e.D(th4.getClass().getSimpleName(), th4.toString(), E0.h.g("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                            }
                            q2.e(D5);
                            break;
                        case F.k.LONG_FIELD_NUMBER /* 4 */:
                            InterfaceC0248i interfaceC0248i6 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            E0.i.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            E0.i.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                D6 = o.g.v(interfaceC0248i6.a(str7, (C0249j) obj13));
                            } catch (Throwable th5) {
                                D6 = u0.e.D(th5.getClass().getSimpleName(), th5.toString(), E0.h.g("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                            }
                            q2.e(D6);
                            break;
                        case F.k.STRING_FIELD_NUMBER /* 5 */:
                            InterfaceC0248i interfaceC0248i7 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            E0.i.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            E0.i.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                D7 = o.g.v(interfaceC0248i7.f(str8, (C0249j) obj15));
                            } catch (Throwable th6) {
                                D7 = u0.e.D(th6.getClass().getSimpleName(), th6.toString(), E0.h.g("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                            }
                            q2.e(D7);
                            break;
                        case F.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            InterfaceC0248i interfaceC0248i8 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            E0.i.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            E0.i.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            E0.i.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0248i8.b(str9, booleanValue, (C0249j) obj18);
                                D8 = o.g.v(null);
                            } catch (Throwable th7) {
                                D8 = u0.e.D(th7.getClass().getSimpleName(), th7.toString(), E0.h.g("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                            }
                            q2.e(D8);
                            break;
                        case F.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC0248i interfaceC0248i9 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            E0.i.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            E0.i.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                D9 = o.g.v(interfaceC0248i9.q(str10, (C0249j) obj20));
                            } catch (Throwable th8) {
                                D9 = u0.e.D(th8.getClass().getSimpleName(), th8.toString(), E0.h.g("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                            }
                            q2.e(D9);
                            break;
                        case F.k.BYTES_FIELD_NUMBER /* 8 */:
                            InterfaceC0248i interfaceC0248i10 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            E0.i.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            E0.i.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                D10 = o.g.v(interfaceC0248i10.d(str11, (C0249j) obj22));
                            } catch (Throwable th9) {
                                D10 = u0.e.D(th9.getClass().getSimpleName(), th9.toString(), E0.h.g("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                            }
                            q2.e(D10);
                            break;
                        case 9:
                            InterfaceC0248i interfaceC0248i11 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            E0.i.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0248i11.o(list12, (C0249j) obj23);
                                D11 = o.g.v(null);
                            } catch (Throwable th10) {
                                D11 = u0.e.D(th10.getClass().getSimpleName(), th10.toString(), E0.h.g("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                            }
                            q2.e(D11);
                            break;
                        case 10:
                            InterfaceC0248i interfaceC0248i12 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            E0.i.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                D12 = o.g.v(interfaceC0248i12.p(list14, (C0249j) obj24));
                            } catch (Throwable th11) {
                                D12 = u0.e.D(th11.getClass().getSimpleName(), th11.toString(), E0.h.g("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                            }
                            q2.e(D12);
                            break;
                        case 11:
                            InterfaceC0248i interfaceC0248i13 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            E0.i.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                D13 = o.g.v(interfaceC0248i13.g(list16, (C0249j) obj25));
                            } catch (Throwable th12) {
                                D13 = u0.e.D(th12.getClass().getSimpleName(), th12.toString(), E0.h.g("Cause: ", th12.getCause(), ", Stacktrace: ", Log.getStackTraceString(th12)));
                            }
                            q2.e(D13);
                            break;
                        case 12:
                            InterfaceC0248i interfaceC0248i14 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            E0.i.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            E0.i.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            E0.i.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0248i14.e(str12, str13, (C0249j) obj28);
                                D14 = o.g.v(null);
                            } catch (Throwable th13) {
                                D14 = u0.e.D(th13.getClass().getSimpleName(), th13.toString(), E0.h.g("Cause: ", th13.getCause(), ", Stacktrace: ", Log.getStackTraceString(th13)));
                            }
                            q2.e(D14);
                            break;
                        case 13:
                            InterfaceC0248i interfaceC0248i15 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            E0.i.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            E0.i.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            E0.i.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0248i15.h(str14, longValue, (C0249j) obj31);
                                D15 = o.g.v(null);
                            } catch (Throwable th14) {
                                D15 = u0.e.D(th14.getClass().getSimpleName(), th14.toString(), E0.h.g("Cause: ", th14.getCause(), ", Stacktrace: ", Log.getStackTraceString(th14)));
                            }
                            q2.e(D15);
                            break;
                        default:
                            InterfaceC0248i interfaceC0248i16 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            E0.i.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            E0.i.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            E0.i.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0248i16.k(str15, doubleValue, (C0249j) obj34);
                                D16 = o.g.v(null);
                            } catch (Throwable th15) {
                                D16 = u0.e.D(th15.getClass().getSimpleName(), th15.toString(), E0.h.g("Cause: ", th15.getCause(), ", Stacktrace: ", Log.getStackTraceString(th15)));
                            }
                            q2.e(D16);
                            break;
                    }
                }
            });
        } else {
            c0013n2.j(null);
        }
        C0013n c0013n3 = new C0013n(interfaceC0208f, E0.h.f("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setInt", concat), a(), d2);
        if (interfaceC0248i != null) {
            final int i4 = 13;
            c0013n3.j(new InterfaceC0204b() { // from class: r0.g
                @Override // m0.InterfaceC0204b
                public final void j(Object obj, Q q2) {
                    List D2;
                    List D3;
                    List D4;
                    List D5;
                    List D6;
                    List D7;
                    List D8;
                    List D9;
                    List D10;
                    List D11;
                    List D12;
                    List D13;
                    List D14;
                    List D15;
                    List D16;
                    switch (i4) {
                        case 0:
                            InterfaceC0248i interfaceC0248i2 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            E0.i.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            E0.i.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            E0.i.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0248i2.i(str2, str3, (C0249j) obj4);
                                D2 = o.g.v(null);
                            } catch (Throwable th) {
                                D2 = u0.e.D(th.getClass().getSimpleName(), th.toString(), E0.h.g("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                            }
                            q2.e(D2);
                            break;
                        case 1:
                            InterfaceC0248i interfaceC0248i3 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            E0.i.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            E0.i.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            E0.i.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0248i3.j(str4, list3, (C0249j) obj7);
                                D3 = o.g.v(null);
                            } catch (Throwable th2) {
                                D3 = u0.e.D(th2.getClass().getSimpleName(), th2.toString(), E0.h.g("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                            }
                            q2.e(D3);
                            break;
                        case F.k.FLOAT_FIELD_NUMBER /* 2 */:
                            InterfaceC0248i interfaceC0248i4 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            E0.i.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            E0.i.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                D4 = o.g.v(interfaceC0248i4.l(str5, (C0249j) obj9));
                            } catch (Throwable th3) {
                                D4 = u0.e.D(th3.getClass().getSimpleName(), th3.toString(), E0.h.g("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                            }
                            q2.e(D4);
                            break;
                        case F.k.INTEGER_FIELD_NUMBER /* 3 */:
                            InterfaceC0248i interfaceC0248i5 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            E0.i.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            E0.i.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                D5 = o.g.v(interfaceC0248i5.m(str6, (C0249j) obj11));
                            } catch (Throwable th4) {
                                D5 = u0.e.D(th4.getClass().getSimpleName(), th4.toString(), E0.h.g("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                            }
                            q2.e(D5);
                            break;
                        case F.k.LONG_FIELD_NUMBER /* 4 */:
                            InterfaceC0248i interfaceC0248i6 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            E0.i.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            E0.i.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                D6 = o.g.v(interfaceC0248i6.a(str7, (C0249j) obj13));
                            } catch (Throwable th5) {
                                D6 = u0.e.D(th5.getClass().getSimpleName(), th5.toString(), E0.h.g("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                            }
                            q2.e(D6);
                            break;
                        case F.k.STRING_FIELD_NUMBER /* 5 */:
                            InterfaceC0248i interfaceC0248i7 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            E0.i.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            E0.i.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                D7 = o.g.v(interfaceC0248i7.f(str8, (C0249j) obj15));
                            } catch (Throwable th6) {
                                D7 = u0.e.D(th6.getClass().getSimpleName(), th6.toString(), E0.h.g("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                            }
                            q2.e(D7);
                            break;
                        case F.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            InterfaceC0248i interfaceC0248i8 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            E0.i.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            E0.i.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            E0.i.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0248i8.b(str9, booleanValue, (C0249j) obj18);
                                D8 = o.g.v(null);
                            } catch (Throwable th7) {
                                D8 = u0.e.D(th7.getClass().getSimpleName(), th7.toString(), E0.h.g("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                            }
                            q2.e(D8);
                            break;
                        case F.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC0248i interfaceC0248i9 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            E0.i.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            E0.i.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                D9 = o.g.v(interfaceC0248i9.q(str10, (C0249j) obj20));
                            } catch (Throwable th8) {
                                D9 = u0.e.D(th8.getClass().getSimpleName(), th8.toString(), E0.h.g("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                            }
                            q2.e(D9);
                            break;
                        case F.k.BYTES_FIELD_NUMBER /* 8 */:
                            InterfaceC0248i interfaceC0248i10 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            E0.i.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            E0.i.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                D10 = o.g.v(interfaceC0248i10.d(str11, (C0249j) obj22));
                            } catch (Throwable th9) {
                                D10 = u0.e.D(th9.getClass().getSimpleName(), th9.toString(), E0.h.g("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                            }
                            q2.e(D10);
                            break;
                        case 9:
                            InterfaceC0248i interfaceC0248i11 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            E0.i.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0248i11.o(list12, (C0249j) obj23);
                                D11 = o.g.v(null);
                            } catch (Throwable th10) {
                                D11 = u0.e.D(th10.getClass().getSimpleName(), th10.toString(), E0.h.g("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                            }
                            q2.e(D11);
                            break;
                        case 10:
                            InterfaceC0248i interfaceC0248i12 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            E0.i.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                D12 = o.g.v(interfaceC0248i12.p(list14, (C0249j) obj24));
                            } catch (Throwable th11) {
                                D12 = u0.e.D(th11.getClass().getSimpleName(), th11.toString(), E0.h.g("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                            }
                            q2.e(D12);
                            break;
                        case 11:
                            InterfaceC0248i interfaceC0248i13 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            E0.i.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                D13 = o.g.v(interfaceC0248i13.g(list16, (C0249j) obj25));
                            } catch (Throwable th12) {
                                D13 = u0.e.D(th12.getClass().getSimpleName(), th12.toString(), E0.h.g("Cause: ", th12.getCause(), ", Stacktrace: ", Log.getStackTraceString(th12)));
                            }
                            q2.e(D13);
                            break;
                        case 12:
                            InterfaceC0248i interfaceC0248i14 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            E0.i.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            E0.i.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            E0.i.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0248i14.e(str12, str13, (C0249j) obj28);
                                D14 = o.g.v(null);
                            } catch (Throwable th13) {
                                D14 = u0.e.D(th13.getClass().getSimpleName(), th13.toString(), E0.h.g("Cause: ", th13.getCause(), ", Stacktrace: ", Log.getStackTraceString(th13)));
                            }
                            q2.e(D14);
                            break;
                        case 13:
                            InterfaceC0248i interfaceC0248i15 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            E0.i.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            E0.i.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            E0.i.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0248i15.h(str14, longValue, (C0249j) obj31);
                                D15 = o.g.v(null);
                            } catch (Throwable th14) {
                                D15 = u0.e.D(th14.getClass().getSimpleName(), th14.toString(), E0.h.g("Cause: ", th14.getCause(), ", Stacktrace: ", Log.getStackTraceString(th14)));
                            }
                            q2.e(D15);
                            break;
                        default:
                            InterfaceC0248i interfaceC0248i16 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            E0.i.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            E0.i.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            E0.i.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0248i16.k(str15, doubleValue, (C0249j) obj34);
                                D16 = o.g.v(null);
                            } catch (Throwable th15) {
                                D16 = u0.e.D(th15.getClass().getSimpleName(), th15.toString(), E0.h.g("Cause: ", th15.getCause(), ", Stacktrace: ", Log.getStackTraceString(th15)));
                            }
                            q2.e(D16);
                            break;
                    }
                }
            });
        } else {
            c0013n3.j(null);
        }
        C0013n c0013n4 = new C0013n(interfaceC0208f, E0.h.f("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setDouble", concat), a(), d2);
        if (interfaceC0248i != null) {
            final int i5 = 14;
            c0013n4.j(new InterfaceC0204b() { // from class: r0.g
                @Override // m0.InterfaceC0204b
                public final void j(Object obj, Q q2) {
                    List D2;
                    List D3;
                    List D4;
                    List D5;
                    List D6;
                    List D7;
                    List D8;
                    List D9;
                    List D10;
                    List D11;
                    List D12;
                    List D13;
                    List D14;
                    List D15;
                    List D16;
                    switch (i5) {
                        case 0:
                            InterfaceC0248i interfaceC0248i2 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            E0.i.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            E0.i.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            E0.i.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0248i2.i(str2, str3, (C0249j) obj4);
                                D2 = o.g.v(null);
                            } catch (Throwable th) {
                                D2 = u0.e.D(th.getClass().getSimpleName(), th.toString(), E0.h.g("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                            }
                            q2.e(D2);
                            break;
                        case 1:
                            InterfaceC0248i interfaceC0248i3 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            E0.i.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            E0.i.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            E0.i.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0248i3.j(str4, list3, (C0249j) obj7);
                                D3 = o.g.v(null);
                            } catch (Throwable th2) {
                                D3 = u0.e.D(th2.getClass().getSimpleName(), th2.toString(), E0.h.g("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                            }
                            q2.e(D3);
                            break;
                        case F.k.FLOAT_FIELD_NUMBER /* 2 */:
                            InterfaceC0248i interfaceC0248i4 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            E0.i.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            E0.i.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                D4 = o.g.v(interfaceC0248i4.l(str5, (C0249j) obj9));
                            } catch (Throwable th3) {
                                D4 = u0.e.D(th3.getClass().getSimpleName(), th3.toString(), E0.h.g("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                            }
                            q2.e(D4);
                            break;
                        case F.k.INTEGER_FIELD_NUMBER /* 3 */:
                            InterfaceC0248i interfaceC0248i5 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            E0.i.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            E0.i.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                D5 = o.g.v(interfaceC0248i5.m(str6, (C0249j) obj11));
                            } catch (Throwable th4) {
                                D5 = u0.e.D(th4.getClass().getSimpleName(), th4.toString(), E0.h.g("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                            }
                            q2.e(D5);
                            break;
                        case F.k.LONG_FIELD_NUMBER /* 4 */:
                            InterfaceC0248i interfaceC0248i6 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            E0.i.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            E0.i.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                D6 = o.g.v(interfaceC0248i6.a(str7, (C0249j) obj13));
                            } catch (Throwable th5) {
                                D6 = u0.e.D(th5.getClass().getSimpleName(), th5.toString(), E0.h.g("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                            }
                            q2.e(D6);
                            break;
                        case F.k.STRING_FIELD_NUMBER /* 5 */:
                            InterfaceC0248i interfaceC0248i7 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            E0.i.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            E0.i.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                D7 = o.g.v(interfaceC0248i7.f(str8, (C0249j) obj15));
                            } catch (Throwable th6) {
                                D7 = u0.e.D(th6.getClass().getSimpleName(), th6.toString(), E0.h.g("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                            }
                            q2.e(D7);
                            break;
                        case F.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            InterfaceC0248i interfaceC0248i8 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            E0.i.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            E0.i.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            E0.i.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0248i8.b(str9, booleanValue, (C0249j) obj18);
                                D8 = o.g.v(null);
                            } catch (Throwable th7) {
                                D8 = u0.e.D(th7.getClass().getSimpleName(), th7.toString(), E0.h.g("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                            }
                            q2.e(D8);
                            break;
                        case F.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC0248i interfaceC0248i9 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            E0.i.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            E0.i.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                D9 = o.g.v(interfaceC0248i9.q(str10, (C0249j) obj20));
                            } catch (Throwable th8) {
                                D9 = u0.e.D(th8.getClass().getSimpleName(), th8.toString(), E0.h.g("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                            }
                            q2.e(D9);
                            break;
                        case F.k.BYTES_FIELD_NUMBER /* 8 */:
                            InterfaceC0248i interfaceC0248i10 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            E0.i.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            E0.i.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                D10 = o.g.v(interfaceC0248i10.d(str11, (C0249j) obj22));
                            } catch (Throwable th9) {
                                D10 = u0.e.D(th9.getClass().getSimpleName(), th9.toString(), E0.h.g("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                            }
                            q2.e(D10);
                            break;
                        case 9:
                            InterfaceC0248i interfaceC0248i11 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            E0.i.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0248i11.o(list12, (C0249j) obj23);
                                D11 = o.g.v(null);
                            } catch (Throwable th10) {
                                D11 = u0.e.D(th10.getClass().getSimpleName(), th10.toString(), E0.h.g("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                            }
                            q2.e(D11);
                            break;
                        case 10:
                            InterfaceC0248i interfaceC0248i12 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            E0.i.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                D12 = o.g.v(interfaceC0248i12.p(list14, (C0249j) obj24));
                            } catch (Throwable th11) {
                                D12 = u0.e.D(th11.getClass().getSimpleName(), th11.toString(), E0.h.g("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                            }
                            q2.e(D12);
                            break;
                        case 11:
                            InterfaceC0248i interfaceC0248i13 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            E0.i.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                D13 = o.g.v(interfaceC0248i13.g(list16, (C0249j) obj25));
                            } catch (Throwable th12) {
                                D13 = u0.e.D(th12.getClass().getSimpleName(), th12.toString(), E0.h.g("Cause: ", th12.getCause(), ", Stacktrace: ", Log.getStackTraceString(th12)));
                            }
                            q2.e(D13);
                            break;
                        case 12:
                            InterfaceC0248i interfaceC0248i14 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            E0.i.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            E0.i.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            E0.i.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0248i14.e(str12, str13, (C0249j) obj28);
                                D14 = o.g.v(null);
                            } catch (Throwable th13) {
                                D14 = u0.e.D(th13.getClass().getSimpleName(), th13.toString(), E0.h.g("Cause: ", th13.getCause(), ", Stacktrace: ", Log.getStackTraceString(th13)));
                            }
                            q2.e(D14);
                            break;
                        case 13:
                            InterfaceC0248i interfaceC0248i15 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            E0.i.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            E0.i.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            E0.i.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0248i15.h(str14, longValue, (C0249j) obj31);
                                D15 = o.g.v(null);
                            } catch (Throwable th14) {
                                D15 = u0.e.D(th14.getClass().getSimpleName(), th14.toString(), E0.h.g("Cause: ", th14.getCause(), ", Stacktrace: ", Log.getStackTraceString(th14)));
                            }
                            q2.e(D15);
                            break;
                        default:
                            InterfaceC0248i interfaceC0248i16 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            E0.i.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            E0.i.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            E0.i.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0248i16.k(str15, doubleValue, (C0249j) obj34);
                                D16 = o.g.v(null);
                            } catch (Throwable th15) {
                                D16 = u0.e.D(th15.getClass().getSimpleName(), th15.toString(), E0.h.g("Cause: ", th15.getCause(), ", Stacktrace: ", Log.getStackTraceString(th15)));
                            }
                            q2.e(D16);
                            break;
                    }
                }
            });
        } else {
            c0013n4.j(null);
        }
        C0013n c0013n5 = new C0013n(interfaceC0208f, E0.h.f("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setEncodedStringList", concat), a(), d2);
        if (interfaceC0248i != null) {
            final int i6 = 0;
            c0013n5.j(new InterfaceC0204b() { // from class: r0.g
                @Override // m0.InterfaceC0204b
                public final void j(Object obj, Q q2) {
                    List D2;
                    List D3;
                    List D4;
                    List D5;
                    List D6;
                    List D7;
                    List D8;
                    List D9;
                    List D10;
                    List D11;
                    List D12;
                    List D13;
                    List D14;
                    List D15;
                    List D16;
                    switch (i6) {
                        case 0:
                            InterfaceC0248i interfaceC0248i2 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            E0.i.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            E0.i.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            E0.i.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0248i2.i(str2, str3, (C0249j) obj4);
                                D2 = o.g.v(null);
                            } catch (Throwable th) {
                                D2 = u0.e.D(th.getClass().getSimpleName(), th.toString(), E0.h.g("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                            }
                            q2.e(D2);
                            break;
                        case 1:
                            InterfaceC0248i interfaceC0248i3 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            E0.i.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            E0.i.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            E0.i.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0248i3.j(str4, list3, (C0249j) obj7);
                                D3 = o.g.v(null);
                            } catch (Throwable th2) {
                                D3 = u0.e.D(th2.getClass().getSimpleName(), th2.toString(), E0.h.g("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                            }
                            q2.e(D3);
                            break;
                        case F.k.FLOAT_FIELD_NUMBER /* 2 */:
                            InterfaceC0248i interfaceC0248i4 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            E0.i.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            E0.i.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                D4 = o.g.v(interfaceC0248i4.l(str5, (C0249j) obj9));
                            } catch (Throwable th3) {
                                D4 = u0.e.D(th3.getClass().getSimpleName(), th3.toString(), E0.h.g("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                            }
                            q2.e(D4);
                            break;
                        case F.k.INTEGER_FIELD_NUMBER /* 3 */:
                            InterfaceC0248i interfaceC0248i5 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            E0.i.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            E0.i.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                D5 = o.g.v(interfaceC0248i5.m(str6, (C0249j) obj11));
                            } catch (Throwable th4) {
                                D5 = u0.e.D(th4.getClass().getSimpleName(), th4.toString(), E0.h.g("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                            }
                            q2.e(D5);
                            break;
                        case F.k.LONG_FIELD_NUMBER /* 4 */:
                            InterfaceC0248i interfaceC0248i6 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            E0.i.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            E0.i.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                D6 = o.g.v(interfaceC0248i6.a(str7, (C0249j) obj13));
                            } catch (Throwable th5) {
                                D6 = u0.e.D(th5.getClass().getSimpleName(), th5.toString(), E0.h.g("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                            }
                            q2.e(D6);
                            break;
                        case F.k.STRING_FIELD_NUMBER /* 5 */:
                            InterfaceC0248i interfaceC0248i7 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            E0.i.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            E0.i.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                D7 = o.g.v(interfaceC0248i7.f(str8, (C0249j) obj15));
                            } catch (Throwable th6) {
                                D7 = u0.e.D(th6.getClass().getSimpleName(), th6.toString(), E0.h.g("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                            }
                            q2.e(D7);
                            break;
                        case F.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            InterfaceC0248i interfaceC0248i8 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            E0.i.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            E0.i.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            E0.i.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0248i8.b(str9, booleanValue, (C0249j) obj18);
                                D8 = o.g.v(null);
                            } catch (Throwable th7) {
                                D8 = u0.e.D(th7.getClass().getSimpleName(), th7.toString(), E0.h.g("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                            }
                            q2.e(D8);
                            break;
                        case F.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC0248i interfaceC0248i9 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            E0.i.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            E0.i.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                D9 = o.g.v(interfaceC0248i9.q(str10, (C0249j) obj20));
                            } catch (Throwable th8) {
                                D9 = u0.e.D(th8.getClass().getSimpleName(), th8.toString(), E0.h.g("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                            }
                            q2.e(D9);
                            break;
                        case F.k.BYTES_FIELD_NUMBER /* 8 */:
                            InterfaceC0248i interfaceC0248i10 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            E0.i.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            E0.i.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                D10 = o.g.v(interfaceC0248i10.d(str11, (C0249j) obj22));
                            } catch (Throwable th9) {
                                D10 = u0.e.D(th9.getClass().getSimpleName(), th9.toString(), E0.h.g("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                            }
                            q2.e(D10);
                            break;
                        case 9:
                            InterfaceC0248i interfaceC0248i11 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            E0.i.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0248i11.o(list12, (C0249j) obj23);
                                D11 = o.g.v(null);
                            } catch (Throwable th10) {
                                D11 = u0.e.D(th10.getClass().getSimpleName(), th10.toString(), E0.h.g("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                            }
                            q2.e(D11);
                            break;
                        case 10:
                            InterfaceC0248i interfaceC0248i12 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            E0.i.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                D12 = o.g.v(interfaceC0248i12.p(list14, (C0249j) obj24));
                            } catch (Throwable th11) {
                                D12 = u0.e.D(th11.getClass().getSimpleName(), th11.toString(), E0.h.g("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                            }
                            q2.e(D12);
                            break;
                        case 11:
                            InterfaceC0248i interfaceC0248i13 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            E0.i.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                D13 = o.g.v(interfaceC0248i13.g(list16, (C0249j) obj25));
                            } catch (Throwable th12) {
                                D13 = u0.e.D(th12.getClass().getSimpleName(), th12.toString(), E0.h.g("Cause: ", th12.getCause(), ", Stacktrace: ", Log.getStackTraceString(th12)));
                            }
                            q2.e(D13);
                            break;
                        case 12:
                            InterfaceC0248i interfaceC0248i14 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            E0.i.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            E0.i.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            E0.i.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0248i14.e(str12, str13, (C0249j) obj28);
                                D14 = o.g.v(null);
                            } catch (Throwable th13) {
                                D14 = u0.e.D(th13.getClass().getSimpleName(), th13.toString(), E0.h.g("Cause: ", th13.getCause(), ", Stacktrace: ", Log.getStackTraceString(th13)));
                            }
                            q2.e(D14);
                            break;
                        case 13:
                            InterfaceC0248i interfaceC0248i15 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            E0.i.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            E0.i.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            E0.i.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0248i15.h(str14, longValue, (C0249j) obj31);
                                D15 = o.g.v(null);
                            } catch (Throwable th14) {
                                D15 = u0.e.D(th14.getClass().getSimpleName(), th14.toString(), E0.h.g("Cause: ", th14.getCause(), ", Stacktrace: ", Log.getStackTraceString(th14)));
                            }
                            q2.e(D15);
                            break;
                        default:
                            InterfaceC0248i interfaceC0248i16 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            E0.i.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            E0.i.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            E0.i.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0248i16.k(str15, doubleValue, (C0249j) obj34);
                                D16 = o.g.v(null);
                            } catch (Throwable th15) {
                                D16 = u0.e.D(th15.getClass().getSimpleName(), th15.toString(), E0.h.g("Cause: ", th15.getCause(), ", Stacktrace: ", Log.getStackTraceString(th15)));
                            }
                            q2.e(D16);
                            break;
                    }
                }
            });
        } else {
            c0013n5.j(null);
        }
        C0013n c0013n6 = new C0013n(interfaceC0208f, E0.h.f("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setDeprecatedStringList", concat), a(), d2);
        if (interfaceC0248i != null) {
            final int i7 = 1;
            c0013n6.j(new InterfaceC0204b() { // from class: r0.g
                @Override // m0.InterfaceC0204b
                public final void j(Object obj, Q q2) {
                    List D2;
                    List D3;
                    List D4;
                    List D5;
                    List D6;
                    List D7;
                    List D8;
                    List D9;
                    List D10;
                    List D11;
                    List D12;
                    List D13;
                    List D14;
                    List D15;
                    List D16;
                    switch (i7) {
                        case 0:
                            InterfaceC0248i interfaceC0248i2 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            E0.i.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            E0.i.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            E0.i.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0248i2.i(str2, str3, (C0249j) obj4);
                                D2 = o.g.v(null);
                            } catch (Throwable th) {
                                D2 = u0.e.D(th.getClass().getSimpleName(), th.toString(), E0.h.g("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                            }
                            q2.e(D2);
                            break;
                        case 1:
                            InterfaceC0248i interfaceC0248i3 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            E0.i.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            E0.i.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            E0.i.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0248i3.j(str4, list3, (C0249j) obj7);
                                D3 = o.g.v(null);
                            } catch (Throwable th2) {
                                D3 = u0.e.D(th2.getClass().getSimpleName(), th2.toString(), E0.h.g("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                            }
                            q2.e(D3);
                            break;
                        case F.k.FLOAT_FIELD_NUMBER /* 2 */:
                            InterfaceC0248i interfaceC0248i4 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            E0.i.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            E0.i.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                D4 = o.g.v(interfaceC0248i4.l(str5, (C0249j) obj9));
                            } catch (Throwable th3) {
                                D4 = u0.e.D(th3.getClass().getSimpleName(), th3.toString(), E0.h.g("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                            }
                            q2.e(D4);
                            break;
                        case F.k.INTEGER_FIELD_NUMBER /* 3 */:
                            InterfaceC0248i interfaceC0248i5 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            E0.i.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            E0.i.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                D5 = o.g.v(interfaceC0248i5.m(str6, (C0249j) obj11));
                            } catch (Throwable th4) {
                                D5 = u0.e.D(th4.getClass().getSimpleName(), th4.toString(), E0.h.g("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                            }
                            q2.e(D5);
                            break;
                        case F.k.LONG_FIELD_NUMBER /* 4 */:
                            InterfaceC0248i interfaceC0248i6 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            E0.i.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            E0.i.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                D6 = o.g.v(interfaceC0248i6.a(str7, (C0249j) obj13));
                            } catch (Throwable th5) {
                                D6 = u0.e.D(th5.getClass().getSimpleName(), th5.toString(), E0.h.g("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                            }
                            q2.e(D6);
                            break;
                        case F.k.STRING_FIELD_NUMBER /* 5 */:
                            InterfaceC0248i interfaceC0248i7 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            E0.i.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            E0.i.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                D7 = o.g.v(interfaceC0248i7.f(str8, (C0249j) obj15));
                            } catch (Throwable th6) {
                                D7 = u0.e.D(th6.getClass().getSimpleName(), th6.toString(), E0.h.g("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                            }
                            q2.e(D7);
                            break;
                        case F.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            InterfaceC0248i interfaceC0248i8 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            E0.i.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            E0.i.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            E0.i.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0248i8.b(str9, booleanValue, (C0249j) obj18);
                                D8 = o.g.v(null);
                            } catch (Throwable th7) {
                                D8 = u0.e.D(th7.getClass().getSimpleName(), th7.toString(), E0.h.g("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                            }
                            q2.e(D8);
                            break;
                        case F.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC0248i interfaceC0248i9 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            E0.i.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            E0.i.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                D9 = o.g.v(interfaceC0248i9.q(str10, (C0249j) obj20));
                            } catch (Throwable th8) {
                                D9 = u0.e.D(th8.getClass().getSimpleName(), th8.toString(), E0.h.g("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                            }
                            q2.e(D9);
                            break;
                        case F.k.BYTES_FIELD_NUMBER /* 8 */:
                            InterfaceC0248i interfaceC0248i10 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            E0.i.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            E0.i.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                D10 = o.g.v(interfaceC0248i10.d(str11, (C0249j) obj22));
                            } catch (Throwable th9) {
                                D10 = u0.e.D(th9.getClass().getSimpleName(), th9.toString(), E0.h.g("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                            }
                            q2.e(D10);
                            break;
                        case 9:
                            InterfaceC0248i interfaceC0248i11 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            E0.i.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0248i11.o(list12, (C0249j) obj23);
                                D11 = o.g.v(null);
                            } catch (Throwable th10) {
                                D11 = u0.e.D(th10.getClass().getSimpleName(), th10.toString(), E0.h.g("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                            }
                            q2.e(D11);
                            break;
                        case 10:
                            InterfaceC0248i interfaceC0248i12 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            E0.i.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                D12 = o.g.v(interfaceC0248i12.p(list14, (C0249j) obj24));
                            } catch (Throwable th11) {
                                D12 = u0.e.D(th11.getClass().getSimpleName(), th11.toString(), E0.h.g("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                            }
                            q2.e(D12);
                            break;
                        case 11:
                            InterfaceC0248i interfaceC0248i13 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            E0.i.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                D13 = o.g.v(interfaceC0248i13.g(list16, (C0249j) obj25));
                            } catch (Throwable th12) {
                                D13 = u0.e.D(th12.getClass().getSimpleName(), th12.toString(), E0.h.g("Cause: ", th12.getCause(), ", Stacktrace: ", Log.getStackTraceString(th12)));
                            }
                            q2.e(D13);
                            break;
                        case 12:
                            InterfaceC0248i interfaceC0248i14 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            E0.i.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            E0.i.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            E0.i.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0248i14.e(str12, str13, (C0249j) obj28);
                                D14 = o.g.v(null);
                            } catch (Throwable th13) {
                                D14 = u0.e.D(th13.getClass().getSimpleName(), th13.toString(), E0.h.g("Cause: ", th13.getCause(), ", Stacktrace: ", Log.getStackTraceString(th13)));
                            }
                            q2.e(D14);
                            break;
                        case 13:
                            InterfaceC0248i interfaceC0248i15 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            E0.i.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            E0.i.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            E0.i.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0248i15.h(str14, longValue, (C0249j) obj31);
                                D15 = o.g.v(null);
                            } catch (Throwable th14) {
                                D15 = u0.e.D(th14.getClass().getSimpleName(), th14.toString(), E0.h.g("Cause: ", th14.getCause(), ", Stacktrace: ", Log.getStackTraceString(th14)));
                            }
                            q2.e(D15);
                            break;
                        default:
                            InterfaceC0248i interfaceC0248i16 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            E0.i.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            E0.i.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            E0.i.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0248i16.k(str15, doubleValue, (C0249j) obj34);
                                D16 = o.g.v(null);
                            } catch (Throwable th15) {
                                D16 = u0.e.D(th15.getClass().getSimpleName(), th15.toString(), E0.h.g("Cause: ", th15.getCause(), ", Stacktrace: ", Log.getStackTraceString(th15)));
                            }
                            q2.e(D16);
                            break;
                    }
                }
            });
        } else {
            c0013n6.j(null);
        }
        C0013n c0013n7 = new C0013n(interfaceC0208f, E0.h.f("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getString", concat), a(), d2);
        if (interfaceC0248i != null) {
            final int i8 = 2;
            c0013n7.j(new InterfaceC0204b() { // from class: r0.g
                @Override // m0.InterfaceC0204b
                public final void j(Object obj, Q q2) {
                    List D2;
                    List D3;
                    List D4;
                    List D5;
                    List D6;
                    List D7;
                    List D8;
                    List D9;
                    List D10;
                    List D11;
                    List D12;
                    List D13;
                    List D14;
                    List D15;
                    List D16;
                    switch (i8) {
                        case 0:
                            InterfaceC0248i interfaceC0248i2 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            E0.i.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            E0.i.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            E0.i.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0248i2.i(str2, str3, (C0249j) obj4);
                                D2 = o.g.v(null);
                            } catch (Throwable th) {
                                D2 = u0.e.D(th.getClass().getSimpleName(), th.toString(), E0.h.g("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                            }
                            q2.e(D2);
                            break;
                        case 1:
                            InterfaceC0248i interfaceC0248i3 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            E0.i.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            E0.i.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            E0.i.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0248i3.j(str4, list3, (C0249j) obj7);
                                D3 = o.g.v(null);
                            } catch (Throwable th2) {
                                D3 = u0.e.D(th2.getClass().getSimpleName(), th2.toString(), E0.h.g("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                            }
                            q2.e(D3);
                            break;
                        case F.k.FLOAT_FIELD_NUMBER /* 2 */:
                            InterfaceC0248i interfaceC0248i4 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            E0.i.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            E0.i.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                D4 = o.g.v(interfaceC0248i4.l(str5, (C0249j) obj9));
                            } catch (Throwable th3) {
                                D4 = u0.e.D(th3.getClass().getSimpleName(), th3.toString(), E0.h.g("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                            }
                            q2.e(D4);
                            break;
                        case F.k.INTEGER_FIELD_NUMBER /* 3 */:
                            InterfaceC0248i interfaceC0248i5 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            E0.i.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            E0.i.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                D5 = o.g.v(interfaceC0248i5.m(str6, (C0249j) obj11));
                            } catch (Throwable th4) {
                                D5 = u0.e.D(th4.getClass().getSimpleName(), th4.toString(), E0.h.g("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                            }
                            q2.e(D5);
                            break;
                        case F.k.LONG_FIELD_NUMBER /* 4 */:
                            InterfaceC0248i interfaceC0248i6 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            E0.i.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            E0.i.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                D6 = o.g.v(interfaceC0248i6.a(str7, (C0249j) obj13));
                            } catch (Throwable th5) {
                                D6 = u0.e.D(th5.getClass().getSimpleName(), th5.toString(), E0.h.g("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                            }
                            q2.e(D6);
                            break;
                        case F.k.STRING_FIELD_NUMBER /* 5 */:
                            InterfaceC0248i interfaceC0248i7 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            E0.i.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            E0.i.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                D7 = o.g.v(interfaceC0248i7.f(str8, (C0249j) obj15));
                            } catch (Throwable th6) {
                                D7 = u0.e.D(th6.getClass().getSimpleName(), th6.toString(), E0.h.g("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                            }
                            q2.e(D7);
                            break;
                        case F.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            InterfaceC0248i interfaceC0248i8 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            E0.i.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            E0.i.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            E0.i.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0248i8.b(str9, booleanValue, (C0249j) obj18);
                                D8 = o.g.v(null);
                            } catch (Throwable th7) {
                                D8 = u0.e.D(th7.getClass().getSimpleName(), th7.toString(), E0.h.g("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                            }
                            q2.e(D8);
                            break;
                        case F.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC0248i interfaceC0248i9 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            E0.i.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            E0.i.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                D9 = o.g.v(interfaceC0248i9.q(str10, (C0249j) obj20));
                            } catch (Throwable th8) {
                                D9 = u0.e.D(th8.getClass().getSimpleName(), th8.toString(), E0.h.g("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                            }
                            q2.e(D9);
                            break;
                        case F.k.BYTES_FIELD_NUMBER /* 8 */:
                            InterfaceC0248i interfaceC0248i10 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            E0.i.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            E0.i.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                D10 = o.g.v(interfaceC0248i10.d(str11, (C0249j) obj22));
                            } catch (Throwable th9) {
                                D10 = u0.e.D(th9.getClass().getSimpleName(), th9.toString(), E0.h.g("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                            }
                            q2.e(D10);
                            break;
                        case 9:
                            InterfaceC0248i interfaceC0248i11 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            E0.i.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0248i11.o(list12, (C0249j) obj23);
                                D11 = o.g.v(null);
                            } catch (Throwable th10) {
                                D11 = u0.e.D(th10.getClass().getSimpleName(), th10.toString(), E0.h.g("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                            }
                            q2.e(D11);
                            break;
                        case 10:
                            InterfaceC0248i interfaceC0248i12 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            E0.i.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                D12 = o.g.v(interfaceC0248i12.p(list14, (C0249j) obj24));
                            } catch (Throwable th11) {
                                D12 = u0.e.D(th11.getClass().getSimpleName(), th11.toString(), E0.h.g("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                            }
                            q2.e(D12);
                            break;
                        case 11:
                            InterfaceC0248i interfaceC0248i13 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            E0.i.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                D13 = o.g.v(interfaceC0248i13.g(list16, (C0249j) obj25));
                            } catch (Throwable th12) {
                                D13 = u0.e.D(th12.getClass().getSimpleName(), th12.toString(), E0.h.g("Cause: ", th12.getCause(), ", Stacktrace: ", Log.getStackTraceString(th12)));
                            }
                            q2.e(D13);
                            break;
                        case 12:
                            InterfaceC0248i interfaceC0248i14 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            E0.i.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            E0.i.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            E0.i.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0248i14.e(str12, str13, (C0249j) obj28);
                                D14 = o.g.v(null);
                            } catch (Throwable th13) {
                                D14 = u0.e.D(th13.getClass().getSimpleName(), th13.toString(), E0.h.g("Cause: ", th13.getCause(), ", Stacktrace: ", Log.getStackTraceString(th13)));
                            }
                            q2.e(D14);
                            break;
                        case 13:
                            InterfaceC0248i interfaceC0248i15 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            E0.i.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            E0.i.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            E0.i.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0248i15.h(str14, longValue, (C0249j) obj31);
                                D15 = o.g.v(null);
                            } catch (Throwable th14) {
                                D15 = u0.e.D(th14.getClass().getSimpleName(), th14.toString(), E0.h.g("Cause: ", th14.getCause(), ", Stacktrace: ", Log.getStackTraceString(th14)));
                            }
                            q2.e(D15);
                            break;
                        default:
                            InterfaceC0248i interfaceC0248i16 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            E0.i.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            E0.i.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            E0.i.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0248i16.k(str15, doubleValue, (C0249j) obj34);
                                D16 = o.g.v(null);
                            } catch (Throwable th15) {
                                D16 = u0.e.D(th15.getClass().getSimpleName(), th15.toString(), E0.h.g("Cause: ", th15.getCause(), ", Stacktrace: ", Log.getStackTraceString(th15)));
                            }
                            q2.e(D16);
                            break;
                    }
                }
            });
        } else {
            c0013n7.j(null);
        }
        C0013n c0013n8 = new C0013n(interfaceC0208f, E0.h.f("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getBool", concat), a(), d2);
        if (interfaceC0248i != null) {
            final int i9 = 3;
            c0013n8.j(new InterfaceC0204b() { // from class: r0.g
                @Override // m0.InterfaceC0204b
                public final void j(Object obj, Q q2) {
                    List D2;
                    List D3;
                    List D4;
                    List D5;
                    List D6;
                    List D7;
                    List D8;
                    List D9;
                    List D10;
                    List D11;
                    List D12;
                    List D13;
                    List D14;
                    List D15;
                    List D16;
                    switch (i9) {
                        case 0:
                            InterfaceC0248i interfaceC0248i2 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            E0.i.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            E0.i.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            E0.i.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0248i2.i(str2, str3, (C0249j) obj4);
                                D2 = o.g.v(null);
                            } catch (Throwable th) {
                                D2 = u0.e.D(th.getClass().getSimpleName(), th.toString(), E0.h.g("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                            }
                            q2.e(D2);
                            break;
                        case 1:
                            InterfaceC0248i interfaceC0248i3 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            E0.i.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            E0.i.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            E0.i.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0248i3.j(str4, list3, (C0249j) obj7);
                                D3 = o.g.v(null);
                            } catch (Throwable th2) {
                                D3 = u0.e.D(th2.getClass().getSimpleName(), th2.toString(), E0.h.g("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                            }
                            q2.e(D3);
                            break;
                        case F.k.FLOAT_FIELD_NUMBER /* 2 */:
                            InterfaceC0248i interfaceC0248i4 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            E0.i.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            E0.i.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                D4 = o.g.v(interfaceC0248i4.l(str5, (C0249j) obj9));
                            } catch (Throwable th3) {
                                D4 = u0.e.D(th3.getClass().getSimpleName(), th3.toString(), E0.h.g("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                            }
                            q2.e(D4);
                            break;
                        case F.k.INTEGER_FIELD_NUMBER /* 3 */:
                            InterfaceC0248i interfaceC0248i5 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            E0.i.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            E0.i.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                D5 = o.g.v(interfaceC0248i5.m(str6, (C0249j) obj11));
                            } catch (Throwable th4) {
                                D5 = u0.e.D(th4.getClass().getSimpleName(), th4.toString(), E0.h.g("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                            }
                            q2.e(D5);
                            break;
                        case F.k.LONG_FIELD_NUMBER /* 4 */:
                            InterfaceC0248i interfaceC0248i6 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            E0.i.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            E0.i.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                D6 = o.g.v(interfaceC0248i6.a(str7, (C0249j) obj13));
                            } catch (Throwable th5) {
                                D6 = u0.e.D(th5.getClass().getSimpleName(), th5.toString(), E0.h.g("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                            }
                            q2.e(D6);
                            break;
                        case F.k.STRING_FIELD_NUMBER /* 5 */:
                            InterfaceC0248i interfaceC0248i7 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            E0.i.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            E0.i.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                D7 = o.g.v(interfaceC0248i7.f(str8, (C0249j) obj15));
                            } catch (Throwable th6) {
                                D7 = u0.e.D(th6.getClass().getSimpleName(), th6.toString(), E0.h.g("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                            }
                            q2.e(D7);
                            break;
                        case F.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            InterfaceC0248i interfaceC0248i8 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            E0.i.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            E0.i.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            E0.i.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0248i8.b(str9, booleanValue, (C0249j) obj18);
                                D8 = o.g.v(null);
                            } catch (Throwable th7) {
                                D8 = u0.e.D(th7.getClass().getSimpleName(), th7.toString(), E0.h.g("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                            }
                            q2.e(D8);
                            break;
                        case F.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC0248i interfaceC0248i9 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            E0.i.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            E0.i.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                D9 = o.g.v(interfaceC0248i9.q(str10, (C0249j) obj20));
                            } catch (Throwable th8) {
                                D9 = u0.e.D(th8.getClass().getSimpleName(), th8.toString(), E0.h.g("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                            }
                            q2.e(D9);
                            break;
                        case F.k.BYTES_FIELD_NUMBER /* 8 */:
                            InterfaceC0248i interfaceC0248i10 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            E0.i.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            E0.i.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                D10 = o.g.v(interfaceC0248i10.d(str11, (C0249j) obj22));
                            } catch (Throwable th9) {
                                D10 = u0.e.D(th9.getClass().getSimpleName(), th9.toString(), E0.h.g("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                            }
                            q2.e(D10);
                            break;
                        case 9:
                            InterfaceC0248i interfaceC0248i11 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            E0.i.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0248i11.o(list12, (C0249j) obj23);
                                D11 = o.g.v(null);
                            } catch (Throwable th10) {
                                D11 = u0.e.D(th10.getClass().getSimpleName(), th10.toString(), E0.h.g("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                            }
                            q2.e(D11);
                            break;
                        case 10:
                            InterfaceC0248i interfaceC0248i12 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            E0.i.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                D12 = o.g.v(interfaceC0248i12.p(list14, (C0249j) obj24));
                            } catch (Throwable th11) {
                                D12 = u0.e.D(th11.getClass().getSimpleName(), th11.toString(), E0.h.g("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                            }
                            q2.e(D12);
                            break;
                        case 11:
                            InterfaceC0248i interfaceC0248i13 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            E0.i.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                D13 = o.g.v(interfaceC0248i13.g(list16, (C0249j) obj25));
                            } catch (Throwable th12) {
                                D13 = u0.e.D(th12.getClass().getSimpleName(), th12.toString(), E0.h.g("Cause: ", th12.getCause(), ", Stacktrace: ", Log.getStackTraceString(th12)));
                            }
                            q2.e(D13);
                            break;
                        case 12:
                            InterfaceC0248i interfaceC0248i14 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            E0.i.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            E0.i.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            E0.i.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0248i14.e(str12, str13, (C0249j) obj28);
                                D14 = o.g.v(null);
                            } catch (Throwable th13) {
                                D14 = u0.e.D(th13.getClass().getSimpleName(), th13.toString(), E0.h.g("Cause: ", th13.getCause(), ", Stacktrace: ", Log.getStackTraceString(th13)));
                            }
                            q2.e(D14);
                            break;
                        case 13:
                            InterfaceC0248i interfaceC0248i15 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            E0.i.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            E0.i.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            E0.i.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0248i15.h(str14, longValue, (C0249j) obj31);
                                D15 = o.g.v(null);
                            } catch (Throwable th14) {
                                D15 = u0.e.D(th14.getClass().getSimpleName(), th14.toString(), E0.h.g("Cause: ", th14.getCause(), ", Stacktrace: ", Log.getStackTraceString(th14)));
                            }
                            q2.e(D15);
                            break;
                        default:
                            InterfaceC0248i interfaceC0248i16 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            E0.i.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            E0.i.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            E0.i.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0248i16.k(str15, doubleValue, (C0249j) obj34);
                                D16 = o.g.v(null);
                            } catch (Throwable th15) {
                                D16 = u0.e.D(th15.getClass().getSimpleName(), th15.toString(), E0.h.g("Cause: ", th15.getCause(), ", Stacktrace: ", Log.getStackTraceString(th15)));
                            }
                            q2.e(D16);
                            break;
                    }
                }
            });
        } else {
            c0013n8.j(null);
        }
        C0013n c0013n9 = new C0013n(interfaceC0208f, E0.h.f("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getDouble", concat), a(), d2);
        if (interfaceC0248i != null) {
            final int i10 = 4;
            c0013n9.j(new InterfaceC0204b() { // from class: r0.g
                @Override // m0.InterfaceC0204b
                public final void j(Object obj, Q q2) {
                    List D2;
                    List D3;
                    List D4;
                    List D5;
                    List D6;
                    List D7;
                    List D8;
                    List D9;
                    List D10;
                    List D11;
                    List D12;
                    List D13;
                    List D14;
                    List D15;
                    List D16;
                    switch (i10) {
                        case 0:
                            InterfaceC0248i interfaceC0248i2 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            E0.i.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            E0.i.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            E0.i.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0248i2.i(str2, str3, (C0249j) obj4);
                                D2 = o.g.v(null);
                            } catch (Throwable th) {
                                D2 = u0.e.D(th.getClass().getSimpleName(), th.toString(), E0.h.g("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                            }
                            q2.e(D2);
                            break;
                        case 1:
                            InterfaceC0248i interfaceC0248i3 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            E0.i.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            E0.i.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            E0.i.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0248i3.j(str4, list3, (C0249j) obj7);
                                D3 = o.g.v(null);
                            } catch (Throwable th2) {
                                D3 = u0.e.D(th2.getClass().getSimpleName(), th2.toString(), E0.h.g("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                            }
                            q2.e(D3);
                            break;
                        case F.k.FLOAT_FIELD_NUMBER /* 2 */:
                            InterfaceC0248i interfaceC0248i4 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            E0.i.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            E0.i.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                D4 = o.g.v(interfaceC0248i4.l(str5, (C0249j) obj9));
                            } catch (Throwable th3) {
                                D4 = u0.e.D(th3.getClass().getSimpleName(), th3.toString(), E0.h.g("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                            }
                            q2.e(D4);
                            break;
                        case F.k.INTEGER_FIELD_NUMBER /* 3 */:
                            InterfaceC0248i interfaceC0248i5 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            E0.i.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            E0.i.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                D5 = o.g.v(interfaceC0248i5.m(str6, (C0249j) obj11));
                            } catch (Throwable th4) {
                                D5 = u0.e.D(th4.getClass().getSimpleName(), th4.toString(), E0.h.g("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                            }
                            q2.e(D5);
                            break;
                        case F.k.LONG_FIELD_NUMBER /* 4 */:
                            InterfaceC0248i interfaceC0248i6 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            E0.i.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            E0.i.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                D6 = o.g.v(interfaceC0248i6.a(str7, (C0249j) obj13));
                            } catch (Throwable th5) {
                                D6 = u0.e.D(th5.getClass().getSimpleName(), th5.toString(), E0.h.g("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                            }
                            q2.e(D6);
                            break;
                        case F.k.STRING_FIELD_NUMBER /* 5 */:
                            InterfaceC0248i interfaceC0248i7 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            E0.i.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            E0.i.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                D7 = o.g.v(interfaceC0248i7.f(str8, (C0249j) obj15));
                            } catch (Throwable th6) {
                                D7 = u0.e.D(th6.getClass().getSimpleName(), th6.toString(), E0.h.g("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                            }
                            q2.e(D7);
                            break;
                        case F.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            InterfaceC0248i interfaceC0248i8 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            E0.i.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            E0.i.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            E0.i.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0248i8.b(str9, booleanValue, (C0249j) obj18);
                                D8 = o.g.v(null);
                            } catch (Throwable th7) {
                                D8 = u0.e.D(th7.getClass().getSimpleName(), th7.toString(), E0.h.g("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                            }
                            q2.e(D8);
                            break;
                        case F.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC0248i interfaceC0248i9 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            E0.i.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            E0.i.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                D9 = o.g.v(interfaceC0248i9.q(str10, (C0249j) obj20));
                            } catch (Throwable th8) {
                                D9 = u0.e.D(th8.getClass().getSimpleName(), th8.toString(), E0.h.g("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                            }
                            q2.e(D9);
                            break;
                        case F.k.BYTES_FIELD_NUMBER /* 8 */:
                            InterfaceC0248i interfaceC0248i10 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            E0.i.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            E0.i.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                D10 = o.g.v(interfaceC0248i10.d(str11, (C0249j) obj22));
                            } catch (Throwable th9) {
                                D10 = u0.e.D(th9.getClass().getSimpleName(), th9.toString(), E0.h.g("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                            }
                            q2.e(D10);
                            break;
                        case 9:
                            InterfaceC0248i interfaceC0248i11 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            E0.i.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0248i11.o(list12, (C0249j) obj23);
                                D11 = o.g.v(null);
                            } catch (Throwable th10) {
                                D11 = u0.e.D(th10.getClass().getSimpleName(), th10.toString(), E0.h.g("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                            }
                            q2.e(D11);
                            break;
                        case 10:
                            InterfaceC0248i interfaceC0248i12 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            E0.i.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                D12 = o.g.v(interfaceC0248i12.p(list14, (C0249j) obj24));
                            } catch (Throwable th11) {
                                D12 = u0.e.D(th11.getClass().getSimpleName(), th11.toString(), E0.h.g("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                            }
                            q2.e(D12);
                            break;
                        case 11:
                            InterfaceC0248i interfaceC0248i13 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            E0.i.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                D13 = o.g.v(interfaceC0248i13.g(list16, (C0249j) obj25));
                            } catch (Throwable th12) {
                                D13 = u0.e.D(th12.getClass().getSimpleName(), th12.toString(), E0.h.g("Cause: ", th12.getCause(), ", Stacktrace: ", Log.getStackTraceString(th12)));
                            }
                            q2.e(D13);
                            break;
                        case 12:
                            InterfaceC0248i interfaceC0248i14 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            E0.i.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            E0.i.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            E0.i.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0248i14.e(str12, str13, (C0249j) obj28);
                                D14 = o.g.v(null);
                            } catch (Throwable th13) {
                                D14 = u0.e.D(th13.getClass().getSimpleName(), th13.toString(), E0.h.g("Cause: ", th13.getCause(), ", Stacktrace: ", Log.getStackTraceString(th13)));
                            }
                            q2.e(D14);
                            break;
                        case 13:
                            InterfaceC0248i interfaceC0248i15 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            E0.i.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            E0.i.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            E0.i.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0248i15.h(str14, longValue, (C0249j) obj31);
                                D15 = o.g.v(null);
                            } catch (Throwable th14) {
                                D15 = u0.e.D(th14.getClass().getSimpleName(), th14.toString(), E0.h.g("Cause: ", th14.getCause(), ", Stacktrace: ", Log.getStackTraceString(th14)));
                            }
                            q2.e(D15);
                            break;
                        default:
                            InterfaceC0248i interfaceC0248i16 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            E0.i.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            E0.i.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            E0.i.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0248i16.k(str15, doubleValue, (C0249j) obj34);
                                D16 = o.g.v(null);
                            } catch (Throwable th15) {
                                D16 = u0.e.D(th15.getClass().getSimpleName(), th15.toString(), E0.h.g("Cause: ", th15.getCause(), ", Stacktrace: ", Log.getStackTraceString(th15)));
                            }
                            q2.e(D16);
                            break;
                    }
                }
            });
        } else {
            c0013n9.j(null);
        }
        C0013n c0013n10 = new C0013n(interfaceC0208f, E0.h.f("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getInt", concat), a(), d2);
        if (interfaceC0248i != null) {
            final int i11 = 5;
            c0013n10.j(new InterfaceC0204b() { // from class: r0.g
                @Override // m0.InterfaceC0204b
                public final void j(Object obj, Q q2) {
                    List D2;
                    List D3;
                    List D4;
                    List D5;
                    List D6;
                    List D7;
                    List D8;
                    List D9;
                    List D10;
                    List D11;
                    List D12;
                    List D13;
                    List D14;
                    List D15;
                    List D16;
                    switch (i11) {
                        case 0:
                            InterfaceC0248i interfaceC0248i2 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            E0.i.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            E0.i.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            E0.i.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0248i2.i(str2, str3, (C0249j) obj4);
                                D2 = o.g.v(null);
                            } catch (Throwable th) {
                                D2 = u0.e.D(th.getClass().getSimpleName(), th.toString(), E0.h.g("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                            }
                            q2.e(D2);
                            break;
                        case 1:
                            InterfaceC0248i interfaceC0248i3 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            E0.i.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            E0.i.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            E0.i.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0248i3.j(str4, list3, (C0249j) obj7);
                                D3 = o.g.v(null);
                            } catch (Throwable th2) {
                                D3 = u0.e.D(th2.getClass().getSimpleName(), th2.toString(), E0.h.g("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                            }
                            q2.e(D3);
                            break;
                        case F.k.FLOAT_FIELD_NUMBER /* 2 */:
                            InterfaceC0248i interfaceC0248i4 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            E0.i.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            E0.i.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                D4 = o.g.v(interfaceC0248i4.l(str5, (C0249j) obj9));
                            } catch (Throwable th3) {
                                D4 = u0.e.D(th3.getClass().getSimpleName(), th3.toString(), E0.h.g("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                            }
                            q2.e(D4);
                            break;
                        case F.k.INTEGER_FIELD_NUMBER /* 3 */:
                            InterfaceC0248i interfaceC0248i5 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            E0.i.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            E0.i.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                D5 = o.g.v(interfaceC0248i5.m(str6, (C0249j) obj11));
                            } catch (Throwable th4) {
                                D5 = u0.e.D(th4.getClass().getSimpleName(), th4.toString(), E0.h.g("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                            }
                            q2.e(D5);
                            break;
                        case F.k.LONG_FIELD_NUMBER /* 4 */:
                            InterfaceC0248i interfaceC0248i6 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            E0.i.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            E0.i.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                D6 = o.g.v(interfaceC0248i6.a(str7, (C0249j) obj13));
                            } catch (Throwable th5) {
                                D6 = u0.e.D(th5.getClass().getSimpleName(), th5.toString(), E0.h.g("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                            }
                            q2.e(D6);
                            break;
                        case F.k.STRING_FIELD_NUMBER /* 5 */:
                            InterfaceC0248i interfaceC0248i7 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            E0.i.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            E0.i.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                D7 = o.g.v(interfaceC0248i7.f(str8, (C0249j) obj15));
                            } catch (Throwable th6) {
                                D7 = u0.e.D(th6.getClass().getSimpleName(), th6.toString(), E0.h.g("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                            }
                            q2.e(D7);
                            break;
                        case F.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            InterfaceC0248i interfaceC0248i8 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            E0.i.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            E0.i.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            E0.i.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0248i8.b(str9, booleanValue, (C0249j) obj18);
                                D8 = o.g.v(null);
                            } catch (Throwable th7) {
                                D8 = u0.e.D(th7.getClass().getSimpleName(), th7.toString(), E0.h.g("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                            }
                            q2.e(D8);
                            break;
                        case F.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC0248i interfaceC0248i9 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            E0.i.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            E0.i.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                D9 = o.g.v(interfaceC0248i9.q(str10, (C0249j) obj20));
                            } catch (Throwable th8) {
                                D9 = u0.e.D(th8.getClass().getSimpleName(), th8.toString(), E0.h.g("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                            }
                            q2.e(D9);
                            break;
                        case F.k.BYTES_FIELD_NUMBER /* 8 */:
                            InterfaceC0248i interfaceC0248i10 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            E0.i.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            E0.i.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                D10 = o.g.v(interfaceC0248i10.d(str11, (C0249j) obj22));
                            } catch (Throwable th9) {
                                D10 = u0.e.D(th9.getClass().getSimpleName(), th9.toString(), E0.h.g("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                            }
                            q2.e(D10);
                            break;
                        case 9:
                            InterfaceC0248i interfaceC0248i11 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            E0.i.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0248i11.o(list12, (C0249j) obj23);
                                D11 = o.g.v(null);
                            } catch (Throwable th10) {
                                D11 = u0.e.D(th10.getClass().getSimpleName(), th10.toString(), E0.h.g("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                            }
                            q2.e(D11);
                            break;
                        case 10:
                            InterfaceC0248i interfaceC0248i12 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            E0.i.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                D12 = o.g.v(interfaceC0248i12.p(list14, (C0249j) obj24));
                            } catch (Throwable th11) {
                                D12 = u0.e.D(th11.getClass().getSimpleName(), th11.toString(), E0.h.g("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                            }
                            q2.e(D12);
                            break;
                        case 11:
                            InterfaceC0248i interfaceC0248i13 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            E0.i.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                D13 = o.g.v(interfaceC0248i13.g(list16, (C0249j) obj25));
                            } catch (Throwable th12) {
                                D13 = u0.e.D(th12.getClass().getSimpleName(), th12.toString(), E0.h.g("Cause: ", th12.getCause(), ", Stacktrace: ", Log.getStackTraceString(th12)));
                            }
                            q2.e(D13);
                            break;
                        case 12:
                            InterfaceC0248i interfaceC0248i14 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            E0.i.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            E0.i.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            E0.i.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0248i14.e(str12, str13, (C0249j) obj28);
                                D14 = o.g.v(null);
                            } catch (Throwable th13) {
                                D14 = u0.e.D(th13.getClass().getSimpleName(), th13.toString(), E0.h.g("Cause: ", th13.getCause(), ", Stacktrace: ", Log.getStackTraceString(th13)));
                            }
                            q2.e(D14);
                            break;
                        case 13:
                            InterfaceC0248i interfaceC0248i15 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            E0.i.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            E0.i.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            E0.i.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0248i15.h(str14, longValue, (C0249j) obj31);
                                D15 = o.g.v(null);
                            } catch (Throwable th14) {
                                D15 = u0.e.D(th14.getClass().getSimpleName(), th14.toString(), E0.h.g("Cause: ", th14.getCause(), ", Stacktrace: ", Log.getStackTraceString(th14)));
                            }
                            q2.e(D15);
                            break;
                        default:
                            InterfaceC0248i interfaceC0248i16 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            E0.i.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            E0.i.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            E0.i.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0248i16.k(str15, doubleValue, (C0249j) obj34);
                                D16 = o.g.v(null);
                            } catch (Throwable th15) {
                                D16 = u0.e.D(th15.getClass().getSimpleName(), th15.toString(), E0.h.g("Cause: ", th15.getCause(), ", Stacktrace: ", Log.getStackTraceString(th15)));
                            }
                            q2.e(D16);
                            break;
                    }
                }
            });
        } else {
            c0013n10.j(null);
        }
        C0013n c0013n11 = new C0013n(interfaceC0208f, E0.h.f("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getPlatformEncodedStringList", concat), a(), d2);
        if (interfaceC0248i != null) {
            final int i12 = 7;
            c0013n11.j(new InterfaceC0204b() { // from class: r0.g
                @Override // m0.InterfaceC0204b
                public final void j(Object obj, Q q2) {
                    List D2;
                    List D3;
                    List D4;
                    List D5;
                    List D6;
                    List D7;
                    List D8;
                    List D9;
                    List D10;
                    List D11;
                    List D12;
                    List D13;
                    List D14;
                    List D15;
                    List D16;
                    switch (i12) {
                        case 0:
                            InterfaceC0248i interfaceC0248i2 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            E0.i.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            E0.i.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            E0.i.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0248i2.i(str2, str3, (C0249j) obj4);
                                D2 = o.g.v(null);
                            } catch (Throwable th) {
                                D2 = u0.e.D(th.getClass().getSimpleName(), th.toString(), E0.h.g("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                            }
                            q2.e(D2);
                            break;
                        case 1:
                            InterfaceC0248i interfaceC0248i3 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            E0.i.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            E0.i.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            E0.i.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0248i3.j(str4, list3, (C0249j) obj7);
                                D3 = o.g.v(null);
                            } catch (Throwable th2) {
                                D3 = u0.e.D(th2.getClass().getSimpleName(), th2.toString(), E0.h.g("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                            }
                            q2.e(D3);
                            break;
                        case F.k.FLOAT_FIELD_NUMBER /* 2 */:
                            InterfaceC0248i interfaceC0248i4 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            E0.i.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            E0.i.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                D4 = o.g.v(interfaceC0248i4.l(str5, (C0249j) obj9));
                            } catch (Throwable th3) {
                                D4 = u0.e.D(th3.getClass().getSimpleName(), th3.toString(), E0.h.g("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                            }
                            q2.e(D4);
                            break;
                        case F.k.INTEGER_FIELD_NUMBER /* 3 */:
                            InterfaceC0248i interfaceC0248i5 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            E0.i.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            E0.i.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                D5 = o.g.v(interfaceC0248i5.m(str6, (C0249j) obj11));
                            } catch (Throwable th4) {
                                D5 = u0.e.D(th4.getClass().getSimpleName(), th4.toString(), E0.h.g("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                            }
                            q2.e(D5);
                            break;
                        case F.k.LONG_FIELD_NUMBER /* 4 */:
                            InterfaceC0248i interfaceC0248i6 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            E0.i.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            E0.i.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                D6 = o.g.v(interfaceC0248i6.a(str7, (C0249j) obj13));
                            } catch (Throwable th5) {
                                D6 = u0.e.D(th5.getClass().getSimpleName(), th5.toString(), E0.h.g("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                            }
                            q2.e(D6);
                            break;
                        case F.k.STRING_FIELD_NUMBER /* 5 */:
                            InterfaceC0248i interfaceC0248i7 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            E0.i.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            E0.i.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                D7 = o.g.v(interfaceC0248i7.f(str8, (C0249j) obj15));
                            } catch (Throwable th6) {
                                D7 = u0.e.D(th6.getClass().getSimpleName(), th6.toString(), E0.h.g("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                            }
                            q2.e(D7);
                            break;
                        case F.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            InterfaceC0248i interfaceC0248i8 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            E0.i.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            E0.i.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            E0.i.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0248i8.b(str9, booleanValue, (C0249j) obj18);
                                D8 = o.g.v(null);
                            } catch (Throwable th7) {
                                D8 = u0.e.D(th7.getClass().getSimpleName(), th7.toString(), E0.h.g("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                            }
                            q2.e(D8);
                            break;
                        case F.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC0248i interfaceC0248i9 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            E0.i.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            E0.i.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                D9 = o.g.v(interfaceC0248i9.q(str10, (C0249j) obj20));
                            } catch (Throwable th8) {
                                D9 = u0.e.D(th8.getClass().getSimpleName(), th8.toString(), E0.h.g("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                            }
                            q2.e(D9);
                            break;
                        case F.k.BYTES_FIELD_NUMBER /* 8 */:
                            InterfaceC0248i interfaceC0248i10 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            E0.i.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            E0.i.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                D10 = o.g.v(interfaceC0248i10.d(str11, (C0249j) obj22));
                            } catch (Throwable th9) {
                                D10 = u0.e.D(th9.getClass().getSimpleName(), th9.toString(), E0.h.g("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                            }
                            q2.e(D10);
                            break;
                        case 9:
                            InterfaceC0248i interfaceC0248i11 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            E0.i.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0248i11.o(list12, (C0249j) obj23);
                                D11 = o.g.v(null);
                            } catch (Throwable th10) {
                                D11 = u0.e.D(th10.getClass().getSimpleName(), th10.toString(), E0.h.g("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                            }
                            q2.e(D11);
                            break;
                        case 10:
                            InterfaceC0248i interfaceC0248i12 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            E0.i.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                D12 = o.g.v(interfaceC0248i12.p(list14, (C0249j) obj24));
                            } catch (Throwable th11) {
                                D12 = u0.e.D(th11.getClass().getSimpleName(), th11.toString(), E0.h.g("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                            }
                            q2.e(D12);
                            break;
                        case 11:
                            InterfaceC0248i interfaceC0248i13 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            E0.i.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                D13 = o.g.v(interfaceC0248i13.g(list16, (C0249j) obj25));
                            } catch (Throwable th12) {
                                D13 = u0.e.D(th12.getClass().getSimpleName(), th12.toString(), E0.h.g("Cause: ", th12.getCause(), ", Stacktrace: ", Log.getStackTraceString(th12)));
                            }
                            q2.e(D13);
                            break;
                        case 12:
                            InterfaceC0248i interfaceC0248i14 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            E0.i.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            E0.i.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            E0.i.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0248i14.e(str12, str13, (C0249j) obj28);
                                D14 = o.g.v(null);
                            } catch (Throwable th13) {
                                D14 = u0.e.D(th13.getClass().getSimpleName(), th13.toString(), E0.h.g("Cause: ", th13.getCause(), ", Stacktrace: ", Log.getStackTraceString(th13)));
                            }
                            q2.e(D14);
                            break;
                        case 13:
                            InterfaceC0248i interfaceC0248i15 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            E0.i.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            E0.i.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            E0.i.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0248i15.h(str14, longValue, (C0249j) obj31);
                                D15 = o.g.v(null);
                            } catch (Throwable th14) {
                                D15 = u0.e.D(th14.getClass().getSimpleName(), th14.toString(), E0.h.g("Cause: ", th14.getCause(), ", Stacktrace: ", Log.getStackTraceString(th14)));
                            }
                            q2.e(D15);
                            break;
                        default:
                            InterfaceC0248i interfaceC0248i16 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            E0.i.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            E0.i.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            E0.i.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0248i16.k(str15, doubleValue, (C0249j) obj34);
                                D16 = o.g.v(null);
                            } catch (Throwable th15) {
                                D16 = u0.e.D(th15.getClass().getSimpleName(), th15.toString(), E0.h.g("Cause: ", th15.getCause(), ", Stacktrace: ", Log.getStackTraceString(th15)));
                            }
                            q2.e(D16);
                            break;
                    }
                }
            });
        } else {
            c0013n11.j(null);
        }
        C0013n c0013n12 = new C0013n(interfaceC0208f, E0.h.f("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getStringList", concat), a(), d2);
        if (interfaceC0248i != null) {
            final int i13 = 8;
            c0013n12.j(new InterfaceC0204b() { // from class: r0.g
                @Override // m0.InterfaceC0204b
                public final void j(Object obj, Q q2) {
                    List D2;
                    List D3;
                    List D4;
                    List D5;
                    List D6;
                    List D7;
                    List D8;
                    List D9;
                    List D10;
                    List D11;
                    List D12;
                    List D13;
                    List D14;
                    List D15;
                    List D16;
                    switch (i13) {
                        case 0:
                            InterfaceC0248i interfaceC0248i2 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            E0.i.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            E0.i.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            E0.i.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0248i2.i(str2, str3, (C0249j) obj4);
                                D2 = o.g.v(null);
                            } catch (Throwable th) {
                                D2 = u0.e.D(th.getClass().getSimpleName(), th.toString(), E0.h.g("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                            }
                            q2.e(D2);
                            break;
                        case 1:
                            InterfaceC0248i interfaceC0248i3 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            E0.i.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            E0.i.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            E0.i.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0248i3.j(str4, list3, (C0249j) obj7);
                                D3 = o.g.v(null);
                            } catch (Throwable th2) {
                                D3 = u0.e.D(th2.getClass().getSimpleName(), th2.toString(), E0.h.g("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                            }
                            q2.e(D3);
                            break;
                        case F.k.FLOAT_FIELD_NUMBER /* 2 */:
                            InterfaceC0248i interfaceC0248i4 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            E0.i.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            E0.i.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                D4 = o.g.v(interfaceC0248i4.l(str5, (C0249j) obj9));
                            } catch (Throwable th3) {
                                D4 = u0.e.D(th3.getClass().getSimpleName(), th3.toString(), E0.h.g("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                            }
                            q2.e(D4);
                            break;
                        case F.k.INTEGER_FIELD_NUMBER /* 3 */:
                            InterfaceC0248i interfaceC0248i5 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            E0.i.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            E0.i.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                D5 = o.g.v(interfaceC0248i5.m(str6, (C0249j) obj11));
                            } catch (Throwable th4) {
                                D5 = u0.e.D(th4.getClass().getSimpleName(), th4.toString(), E0.h.g("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                            }
                            q2.e(D5);
                            break;
                        case F.k.LONG_FIELD_NUMBER /* 4 */:
                            InterfaceC0248i interfaceC0248i6 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            E0.i.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            E0.i.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                D6 = o.g.v(interfaceC0248i6.a(str7, (C0249j) obj13));
                            } catch (Throwable th5) {
                                D6 = u0.e.D(th5.getClass().getSimpleName(), th5.toString(), E0.h.g("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                            }
                            q2.e(D6);
                            break;
                        case F.k.STRING_FIELD_NUMBER /* 5 */:
                            InterfaceC0248i interfaceC0248i7 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            E0.i.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            E0.i.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                D7 = o.g.v(interfaceC0248i7.f(str8, (C0249j) obj15));
                            } catch (Throwable th6) {
                                D7 = u0.e.D(th6.getClass().getSimpleName(), th6.toString(), E0.h.g("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                            }
                            q2.e(D7);
                            break;
                        case F.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            InterfaceC0248i interfaceC0248i8 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            E0.i.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            E0.i.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            E0.i.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0248i8.b(str9, booleanValue, (C0249j) obj18);
                                D8 = o.g.v(null);
                            } catch (Throwable th7) {
                                D8 = u0.e.D(th7.getClass().getSimpleName(), th7.toString(), E0.h.g("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                            }
                            q2.e(D8);
                            break;
                        case F.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC0248i interfaceC0248i9 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            E0.i.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            E0.i.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                D9 = o.g.v(interfaceC0248i9.q(str10, (C0249j) obj20));
                            } catch (Throwable th8) {
                                D9 = u0.e.D(th8.getClass().getSimpleName(), th8.toString(), E0.h.g("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                            }
                            q2.e(D9);
                            break;
                        case F.k.BYTES_FIELD_NUMBER /* 8 */:
                            InterfaceC0248i interfaceC0248i10 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            E0.i.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            E0.i.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                D10 = o.g.v(interfaceC0248i10.d(str11, (C0249j) obj22));
                            } catch (Throwable th9) {
                                D10 = u0.e.D(th9.getClass().getSimpleName(), th9.toString(), E0.h.g("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                            }
                            q2.e(D10);
                            break;
                        case 9:
                            InterfaceC0248i interfaceC0248i11 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            E0.i.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0248i11.o(list12, (C0249j) obj23);
                                D11 = o.g.v(null);
                            } catch (Throwable th10) {
                                D11 = u0.e.D(th10.getClass().getSimpleName(), th10.toString(), E0.h.g("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                            }
                            q2.e(D11);
                            break;
                        case 10:
                            InterfaceC0248i interfaceC0248i12 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            E0.i.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                D12 = o.g.v(interfaceC0248i12.p(list14, (C0249j) obj24));
                            } catch (Throwable th11) {
                                D12 = u0.e.D(th11.getClass().getSimpleName(), th11.toString(), E0.h.g("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                            }
                            q2.e(D12);
                            break;
                        case 11:
                            InterfaceC0248i interfaceC0248i13 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            E0.i.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                D13 = o.g.v(interfaceC0248i13.g(list16, (C0249j) obj25));
                            } catch (Throwable th12) {
                                D13 = u0.e.D(th12.getClass().getSimpleName(), th12.toString(), E0.h.g("Cause: ", th12.getCause(), ", Stacktrace: ", Log.getStackTraceString(th12)));
                            }
                            q2.e(D13);
                            break;
                        case 12:
                            InterfaceC0248i interfaceC0248i14 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            E0.i.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            E0.i.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            E0.i.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0248i14.e(str12, str13, (C0249j) obj28);
                                D14 = o.g.v(null);
                            } catch (Throwable th13) {
                                D14 = u0.e.D(th13.getClass().getSimpleName(), th13.toString(), E0.h.g("Cause: ", th13.getCause(), ", Stacktrace: ", Log.getStackTraceString(th13)));
                            }
                            q2.e(D14);
                            break;
                        case 13:
                            InterfaceC0248i interfaceC0248i15 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            E0.i.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            E0.i.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            E0.i.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0248i15.h(str14, longValue, (C0249j) obj31);
                                D15 = o.g.v(null);
                            } catch (Throwable th14) {
                                D15 = u0.e.D(th14.getClass().getSimpleName(), th14.toString(), E0.h.g("Cause: ", th14.getCause(), ", Stacktrace: ", Log.getStackTraceString(th14)));
                            }
                            q2.e(D15);
                            break;
                        default:
                            InterfaceC0248i interfaceC0248i16 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            E0.i.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            E0.i.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            E0.i.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0248i16.k(str15, doubleValue, (C0249j) obj34);
                                D16 = o.g.v(null);
                            } catch (Throwable th15) {
                                D16 = u0.e.D(th15.getClass().getSimpleName(), th15.toString(), E0.h.g("Cause: ", th15.getCause(), ", Stacktrace: ", Log.getStackTraceString(th15)));
                            }
                            q2.e(D16);
                            break;
                    }
                }
            });
        } else {
            c0013n12.j(null);
        }
        C0013n c0013n13 = new C0013n(interfaceC0208f, E0.h.f("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.clear", concat), a(), d2);
        if (interfaceC0248i != null) {
            final int i14 = 9;
            c0013n13.j(new InterfaceC0204b() { // from class: r0.g
                @Override // m0.InterfaceC0204b
                public final void j(Object obj, Q q2) {
                    List D2;
                    List D3;
                    List D4;
                    List D5;
                    List D6;
                    List D7;
                    List D8;
                    List D9;
                    List D10;
                    List D11;
                    List D12;
                    List D13;
                    List D14;
                    List D15;
                    List D16;
                    switch (i14) {
                        case 0:
                            InterfaceC0248i interfaceC0248i2 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            E0.i.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            E0.i.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            E0.i.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0248i2.i(str2, str3, (C0249j) obj4);
                                D2 = o.g.v(null);
                            } catch (Throwable th) {
                                D2 = u0.e.D(th.getClass().getSimpleName(), th.toString(), E0.h.g("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                            }
                            q2.e(D2);
                            break;
                        case 1:
                            InterfaceC0248i interfaceC0248i3 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            E0.i.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            E0.i.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            E0.i.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0248i3.j(str4, list3, (C0249j) obj7);
                                D3 = o.g.v(null);
                            } catch (Throwable th2) {
                                D3 = u0.e.D(th2.getClass().getSimpleName(), th2.toString(), E0.h.g("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                            }
                            q2.e(D3);
                            break;
                        case F.k.FLOAT_FIELD_NUMBER /* 2 */:
                            InterfaceC0248i interfaceC0248i4 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            E0.i.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            E0.i.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                D4 = o.g.v(interfaceC0248i4.l(str5, (C0249j) obj9));
                            } catch (Throwable th3) {
                                D4 = u0.e.D(th3.getClass().getSimpleName(), th3.toString(), E0.h.g("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                            }
                            q2.e(D4);
                            break;
                        case F.k.INTEGER_FIELD_NUMBER /* 3 */:
                            InterfaceC0248i interfaceC0248i5 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            E0.i.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            E0.i.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                D5 = o.g.v(interfaceC0248i5.m(str6, (C0249j) obj11));
                            } catch (Throwable th4) {
                                D5 = u0.e.D(th4.getClass().getSimpleName(), th4.toString(), E0.h.g("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                            }
                            q2.e(D5);
                            break;
                        case F.k.LONG_FIELD_NUMBER /* 4 */:
                            InterfaceC0248i interfaceC0248i6 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            E0.i.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            E0.i.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                D6 = o.g.v(interfaceC0248i6.a(str7, (C0249j) obj13));
                            } catch (Throwable th5) {
                                D6 = u0.e.D(th5.getClass().getSimpleName(), th5.toString(), E0.h.g("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                            }
                            q2.e(D6);
                            break;
                        case F.k.STRING_FIELD_NUMBER /* 5 */:
                            InterfaceC0248i interfaceC0248i7 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            E0.i.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            E0.i.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                D7 = o.g.v(interfaceC0248i7.f(str8, (C0249j) obj15));
                            } catch (Throwable th6) {
                                D7 = u0.e.D(th6.getClass().getSimpleName(), th6.toString(), E0.h.g("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                            }
                            q2.e(D7);
                            break;
                        case F.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            InterfaceC0248i interfaceC0248i8 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            E0.i.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            E0.i.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            E0.i.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0248i8.b(str9, booleanValue, (C0249j) obj18);
                                D8 = o.g.v(null);
                            } catch (Throwable th7) {
                                D8 = u0.e.D(th7.getClass().getSimpleName(), th7.toString(), E0.h.g("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                            }
                            q2.e(D8);
                            break;
                        case F.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC0248i interfaceC0248i9 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            E0.i.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            E0.i.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                D9 = o.g.v(interfaceC0248i9.q(str10, (C0249j) obj20));
                            } catch (Throwable th8) {
                                D9 = u0.e.D(th8.getClass().getSimpleName(), th8.toString(), E0.h.g("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                            }
                            q2.e(D9);
                            break;
                        case F.k.BYTES_FIELD_NUMBER /* 8 */:
                            InterfaceC0248i interfaceC0248i10 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            E0.i.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            E0.i.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                D10 = o.g.v(interfaceC0248i10.d(str11, (C0249j) obj22));
                            } catch (Throwable th9) {
                                D10 = u0.e.D(th9.getClass().getSimpleName(), th9.toString(), E0.h.g("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                            }
                            q2.e(D10);
                            break;
                        case 9:
                            InterfaceC0248i interfaceC0248i11 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            E0.i.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0248i11.o(list12, (C0249j) obj23);
                                D11 = o.g.v(null);
                            } catch (Throwable th10) {
                                D11 = u0.e.D(th10.getClass().getSimpleName(), th10.toString(), E0.h.g("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                            }
                            q2.e(D11);
                            break;
                        case 10:
                            InterfaceC0248i interfaceC0248i12 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            E0.i.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                D12 = o.g.v(interfaceC0248i12.p(list14, (C0249j) obj24));
                            } catch (Throwable th11) {
                                D12 = u0.e.D(th11.getClass().getSimpleName(), th11.toString(), E0.h.g("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                            }
                            q2.e(D12);
                            break;
                        case 11:
                            InterfaceC0248i interfaceC0248i13 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            E0.i.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                D13 = o.g.v(interfaceC0248i13.g(list16, (C0249j) obj25));
                            } catch (Throwable th12) {
                                D13 = u0.e.D(th12.getClass().getSimpleName(), th12.toString(), E0.h.g("Cause: ", th12.getCause(), ", Stacktrace: ", Log.getStackTraceString(th12)));
                            }
                            q2.e(D13);
                            break;
                        case 12:
                            InterfaceC0248i interfaceC0248i14 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            E0.i.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            E0.i.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            E0.i.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0248i14.e(str12, str13, (C0249j) obj28);
                                D14 = o.g.v(null);
                            } catch (Throwable th13) {
                                D14 = u0.e.D(th13.getClass().getSimpleName(), th13.toString(), E0.h.g("Cause: ", th13.getCause(), ", Stacktrace: ", Log.getStackTraceString(th13)));
                            }
                            q2.e(D14);
                            break;
                        case 13:
                            InterfaceC0248i interfaceC0248i15 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            E0.i.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            E0.i.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            E0.i.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0248i15.h(str14, longValue, (C0249j) obj31);
                                D15 = o.g.v(null);
                            } catch (Throwable th14) {
                                D15 = u0.e.D(th14.getClass().getSimpleName(), th14.toString(), E0.h.g("Cause: ", th14.getCause(), ", Stacktrace: ", Log.getStackTraceString(th14)));
                            }
                            q2.e(D15);
                            break;
                        default:
                            InterfaceC0248i interfaceC0248i16 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            E0.i.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            E0.i.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            E0.i.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0248i16.k(str15, doubleValue, (C0249j) obj34);
                                D16 = o.g.v(null);
                            } catch (Throwable th15) {
                                D16 = u0.e.D(th15.getClass().getSimpleName(), th15.toString(), E0.h.g("Cause: ", th15.getCause(), ", Stacktrace: ", Log.getStackTraceString(th15)));
                            }
                            q2.e(D16);
                            break;
                    }
                }
            });
        } else {
            c0013n13.j(null);
        }
        C0013n c0013n14 = new C0013n(interfaceC0208f, E0.h.f("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getAll", concat), a(), d2);
        if (interfaceC0248i != null) {
            final int i15 = 10;
            c0013n14.j(new InterfaceC0204b() { // from class: r0.g
                @Override // m0.InterfaceC0204b
                public final void j(Object obj, Q q2) {
                    List D2;
                    List D3;
                    List D4;
                    List D5;
                    List D6;
                    List D7;
                    List D8;
                    List D9;
                    List D10;
                    List D11;
                    List D12;
                    List D13;
                    List D14;
                    List D15;
                    List D16;
                    switch (i15) {
                        case 0:
                            InterfaceC0248i interfaceC0248i2 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            E0.i.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            E0.i.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            E0.i.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0248i2.i(str2, str3, (C0249j) obj4);
                                D2 = o.g.v(null);
                            } catch (Throwable th) {
                                D2 = u0.e.D(th.getClass().getSimpleName(), th.toString(), E0.h.g("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                            }
                            q2.e(D2);
                            break;
                        case 1:
                            InterfaceC0248i interfaceC0248i3 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            E0.i.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            E0.i.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            E0.i.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0248i3.j(str4, list3, (C0249j) obj7);
                                D3 = o.g.v(null);
                            } catch (Throwable th2) {
                                D3 = u0.e.D(th2.getClass().getSimpleName(), th2.toString(), E0.h.g("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                            }
                            q2.e(D3);
                            break;
                        case F.k.FLOAT_FIELD_NUMBER /* 2 */:
                            InterfaceC0248i interfaceC0248i4 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            E0.i.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            E0.i.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                D4 = o.g.v(interfaceC0248i4.l(str5, (C0249j) obj9));
                            } catch (Throwable th3) {
                                D4 = u0.e.D(th3.getClass().getSimpleName(), th3.toString(), E0.h.g("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                            }
                            q2.e(D4);
                            break;
                        case F.k.INTEGER_FIELD_NUMBER /* 3 */:
                            InterfaceC0248i interfaceC0248i5 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            E0.i.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            E0.i.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                D5 = o.g.v(interfaceC0248i5.m(str6, (C0249j) obj11));
                            } catch (Throwable th4) {
                                D5 = u0.e.D(th4.getClass().getSimpleName(), th4.toString(), E0.h.g("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                            }
                            q2.e(D5);
                            break;
                        case F.k.LONG_FIELD_NUMBER /* 4 */:
                            InterfaceC0248i interfaceC0248i6 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            E0.i.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            E0.i.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                D6 = o.g.v(interfaceC0248i6.a(str7, (C0249j) obj13));
                            } catch (Throwable th5) {
                                D6 = u0.e.D(th5.getClass().getSimpleName(), th5.toString(), E0.h.g("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                            }
                            q2.e(D6);
                            break;
                        case F.k.STRING_FIELD_NUMBER /* 5 */:
                            InterfaceC0248i interfaceC0248i7 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            E0.i.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            E0.i.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                D7 = o.g.v(interfaceC0248i7.f(str8, (C0249j) obj15));
                            } catch (Throwable th6) {
                                D7 = u0.e.D(th6.getClass().getSimpleName(), th6.toString(), E0.h.g("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                            }
                            q2.e(D7);
                            break;
                        case F.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            InterfaceC0248i interfaceC0248i8 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            E0.i.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            E0.i.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            E0.i.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0248i8.b(str9, booleanValue, (C0249j) obj18);
                                D8 = o.g.v(null);
                            } catch (Throwable th7) {
                                D8 = u0.e.D(th7.getClass().getSimpleName(), th7.toString(), E0.h.g("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                            }
                            q2.e(D8);
                            break;
                        case F.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC0248i interfaceC0248i9 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            E0.i.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            E0.i.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                D9 = o.g.v(interfaceC0248i9.q(str10, (C0249j) obj20));
                            } catch (Throwable th8) {
                                D9 = u0.e.D(th8.getClass().getSimpleName(), th8.toString(), E0.h.g("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                            }
                            q2.e(D9);
                            break;
                        case F.k.BYTES_FIELD_NUMBER /* 8 */:
                            InterfaceC0248i interfaceC0248i10 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            E0.i.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            E0.i.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                D10 = o.g.v(interfaceC0248i10.d(str11, (C0249j) obj22));
                            } catch (Throwable th9) {
                                D10 = u0.e.D(th9.getClass().getSimpleName(), th9.toString(), E0.h.g("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                            }
                            q2.e(D10);
                            break;
                        case 9:
                            InterfaceC0248i interfaceC0248i11 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            E0.i.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0248i11.o(list12, (C0249j) obj23);
                                D11 = o.g.v(null);
                            } catch (Throwable th10) {
                                D11 = u0.e.D(th10.getClass().getSimpleName(), th10.toString(), E0.h.g("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                            }
                            q2.e(D11);
                            break;
                        case 10:
                            InterfaceC0248i interfaceC0248i12 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            E0.i.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                D12 = o.g.v(interfaceC0248i12.p(list14, (C0249j) obj24));
                            } catch (Throwable th11) {
                                D12 = u0.e.D(th11.getClass().getSimpleName(), th11.toString(), E0.h.g("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                            }
                            q2.e(D12);
                            break;
                        case 11:
                            InterfaceC0248i interfaceC0248i13 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            E0.i.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                D13 = o.g.v(interfaceC0248i13.g(list16, (C0249j) obj25));
                            } catch (Throwable th12) {
                                D13 = u0.e.D(th12.getClass().getSimpleName(), th12.toString(), E0.h.g("Cause: ", th12.getCause(), ", Stacktrace: ", Log.getStackTraceString(th12)));
                            }
                            q2.e(D13);
                            break;
                        case 12:
                            InterfaceC0248i interfaceC0248i14 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            E0.i.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            E0.i.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            E0.i.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0248i14.e(str12, str13, (C0249j) obj28);
                                D14 = o.g.v(null);
                            } catch (Throwable th13) {
                                D14 = u0.e.D(th13.getClass().getSimpleName(), th13.toString(), E0.h.g("Cause: ", th13.getCause(), ", Stacktrace: ", Log.getStackTraceString(th13)));
                            }
                            q2.e(D14);
                            break;
                        case 13:
                            InterfaceC0248i interfaceC0248i15 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            E0.i.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            E0.i.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            E0.i.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0248i15.h(str14, longValue, (C0249j) obj31);
                                D15 = o.g.v(null);
                            } catch (Throwable th14) {
                                D15 = u0.e.D(th14.getClass().getSimpleName(), th14.toString(), E0.h.g("Cause: ", th14.getCause(), ", Stacktrace: ", Log.getStackTraceString(th14)));
                            }
                            q2.e(D15);
                            break;
                        default:
                            InterfaceC0248i interfaceC0248i16 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            E0.i.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            E0.i.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            E0.i.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0248i16.k(str15, doubleValue, (C0249j) obj34);
                                D16 = o.g.v(null);
                            } catch (Throwable th15) {
                                D16 = u0.e.D(th15.getClass().getSimpleName(), th15.toString(), E0.h.g("Cause: ", th15.getCause(), ", Stacktrace: ", Log.getStackTraceString(th15)));
                            }
                            q2.e(D16);
                            break;
                    }
                }
            });
        } else {
            c0013n14.j(null);
        }
        C0013n c0013n15 = new C0013n(interfaceC0208f, E0.h.f("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getKeys", concat), a(), d2);
        if (interfaceC0248i == null) {
            c0013n15.j(null);
        } else {
            final int i16 = 11;
            c0013n15.j(new InterfaceC0204b() { // from class: r0.g
                @Override // m0.InterfaceC0204b
                public final void j(Object obj, Q q2) {
                    List D2;
                    List D3;
                    List D4;
                    List D5;
                    List D6;
                    List D7;
                    List D8;
                    List D9;
                    List D10;
                    List D11;
                    List D12;
                    List D13;
                    List D14;
                    List D15;
                    List D16;
                    switch (i16) {
                        case 0:
                            InterfaceC0248i interfaceC0248i2 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            E0.i.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            E0.i.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            E0.i.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0248i2.i(str2, str3, (C0249j) obj4);
                                D2 = o.g.v(null);
                            } catch (Throwable th) {
                                D2 = u0.e.D(th.getClass().getSimpleName(), th.toString(), E0.h.g("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                            }
                            q2.e(D2);
                            break;
                        case 1:
                            InterfaceC0248i interfaceC0248i3 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            E0.i.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            E0.i.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            E0.i.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0248i3.j(str4, list3, (C0249j) obj7);
                                D3 = o.g.v(null);
                            } catch (Throwable th2) {
                                D3 = u0.e.D(th2.getClass().getSimpleName(), th2.toString(), E0.h.g("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                            }
                            q2.e(D3);
                            break;
                        case F.k.FLOAT_FIELD_NUMBER /* 2 */:
                            InterfaceC0248i interfaceC0248i4 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            E0.i.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            E0.i.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                D4 = o.g.v(interfaceC0248i4.l(str5, (C0249j) obj9));
                            } catch (Throwable th3) {
                                D4 = u0.e.D(th3.getClass().getSimpleName(), th3.toString(), E0.h.g("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                            }
                            q2.e(D4);
                            break;
                        case F.k.INTEGER_FIELD_NUMBER /* 3 */:
                            InterfaceC0248i interfaceC0248i5 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            E0.i.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            E0.i.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                D5 = o.g.v(interfaceC0248i5.m(str6, (C0249j) obj11));
                            } catch (Throwable th4) {
                                D5 = u0.e.D(th4.getClass().getSimpleName(), th4.toString(), E0.h.g("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                            }
                            q2.e(D5);
                            break;
                        case F.k.LONG_FIELD_NUMBER /* 4 */:
                            InterfaceC0248i interfaceC0248i6 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            E0.i.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            E0.i.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                D6 = o.g.v(interfaceC0248i6.a(str7, (C0249j) obj13));
                            } catch (Throwable th5) {
                                D6 = u0.e.D(th5.getClass().getSimpleName(), th5.toString(), E0.h.g("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                            }
                            q2.e(D6);
                            break;
                        case F.k.STRING_FIELD_NUMBER /* 5 */:
                            InterfaceC0248i interfaceC0248i7 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            E0.i.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            E0.i.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                D7 = o.g.v(interfaceC0248i7.f(str8, (C0249j) obj15));
                            } catch (Throwable th6) {
                                D7 = u0.e.D(th6.getClass().getSimpleName(), th6.toString(), E0.h.g("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                            }
                            q2.e(D7);
                            break;
                        case F.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            InterfaceC0248i interfaceC0248i8 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            E0.i.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            E0.i.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            E0.i.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0248i8.b(str9, booleanValue, (C0249j) obj18);
                                D8 = o.g.v(null);
                            } catch (Throwable th7) {
                                D8 = u0.e.D(th7.getClass().getSimpleName(), th7.toString(), E0.h.g("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                            }
                            q2.e(D8);
                            break;
                        case F.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC0248i interfaceC0248i9 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            E0.i.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            E0.i.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                D9 = o.g.v(interfaceC0248i9.q(str10, (C0249j) obj20));
                            } catch (Throwable th8) {
                                D9 = u0.e.D(th8.getClass().getSimpleName(), th8.toString(), E0.h.g("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                            }
                            q2.e(D9);
                            break;
                        case F.k.BYTES_FIELD_NUMBER /* 8 */:
                            InterfaceC0248i interfaceC0248i10 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            E0.i.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            E0.i.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                D10 = o.g.v(interfaceC0248i10.d(str11, (C0249j) obj22));
                            } catch (Throwable th9) {
                                D10 = u0.e.D(th9.getClass().getSimpleName(), th9.toString(), E0.h.g("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                            }
                            q2.e(D10);
                            break;
                        case 9:
                            InterfaceC0248i interfaceC0248i11 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            E0.i.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0248i11.o(list12, (C0249j) obj23);
                                D11 = o.g.v(null);
                            } catch (Throwable th10) {
                                D11 = u0.e.D(th10.getClass().getSimpleName(), th10.toString(), E0.h.g("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                            }
                            q2.e(D11);
                            break;
                        case 10:
                            InterfaceC0248i interfaceC0248i12 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            E0.i.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                D12 = o.g.v(interfaceC0248i12.p(list14, (C0249j) obj24));
                            } catch (Throwable th11) {
                                D12 = u0.e.D(th11.getClass().getSimpleName(), th11.toString(), E0.h.g("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                            }
                            q2.e(D12);
                            break;
                        case 11:
                            InterfaceC0248i interfaceC0248i13 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            E0.i.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                D13 = o.g.v(interfaceC0248i13.g(list16, (C0249j) obj25));
                            } catch (Throwable th12) {
                                D13 = u0.e.D(th12.getClass().getSimpleName(), th12.toString(), E0.h.g("Cause: ", th12.getCause(), ", Stacktrace: ", Log.getStackTraceString(th12)));
                            }
                            q2.e(D13);
                            break;
                        case 12:
                            InterfaceC0248i interfaceC0248i14 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            E0.i.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            E0.i.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            E0.i.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0248i14.e(str12, str13, (C0249j) obj28);
                                D14 = o.g.v(null);
                            } catch (Throwable th13) {
                                D14 = u0.e.D(th13.getClass().getSimpleName(), th13.toString(), E0.h.g("Cause: ", th13.getCause(), ", Stacktrace: ", Log.getStackTraceString(th13)));
                            }
                            q2.e(D14);
                            break;
                        case 13:
                            InterfaceC0248i interfaceC0248i15 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            E0.i.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            E0.i.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            E0.i.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0248i15.h(str14, longValue, (C0249j) obj31);
                                D15 = o.g.v(null);
                            } catch (Throwable th14) {
                                D15 = u0.e.D(th14.getClass().getSimpleName(), th14.toString(), E0.h.g("Cause: ", th14.getCause(), ", Stacktrace: ", Log.getStackTraceString(th14)));
                            }
                            q2.e(D15);
                            break;
                        default:
                            InterfaceC0248i interfaceC0248i16 = interfaceC0248i;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            E0.i.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            E0.i.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            E0.i.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0248i16.k(str15, doubleValue, (C0249j) obj34);
                                D16 = o.g.v(null);
                            } catch (Throwable th15) {
                                D16 = u0.e.D(th15.getClass().getSimpleName(), th15.toString(), E0.h.g("Cause: ", th15.getCause(), ", Stacktrace: ", Log.getStackTraceString(th15)));
                            }
                            q2.e(D16);
                            break;
                    }
                }
            });
        }
    }
}
