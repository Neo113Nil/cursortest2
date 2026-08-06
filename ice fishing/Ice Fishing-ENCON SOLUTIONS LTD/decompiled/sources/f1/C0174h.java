package f1;

import F.C0038n;
import a.AbstractC0083a;
import a1.C0093i;
import a1.InterfaceC0086b;
import a1.InterfaceC0090f;
import a1.InterfaceC0094j;
import android.util.Log;
import h1.C0237g;
import i1.AbstractC0253j;
import java.util.List;

/* renamed from: f1.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0174h {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ C0174h f2933a = new C0174h();

    /* renamed from: b, reason: collision with root package name */
    public static final C0237g f2934b = R1.d.y(new C0170d(1));

    public static InterfaceC0094j a() {
        return (InterfaceC0094j) f2934b.a();
    }

    public static void b(InterfaceC0090f binaryMessenger, final InterfaceC0175i interfaceC0175i, String str) {
        kotlin.jvm.internal.i.e(binaryMessenger, "binaryMessenger");
        String concat = str.length() > 0 ? ".".concat(str) : "";
        m0.j e2 = binaryMessenger.e(new C0093i());
        C0038n c0038n = new C0038n(binaryMessenger, C1.a.i("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setBool", concat), a(), e2);
        if (interfaceC0175i != null) {
            final int i2 = 6;
            c0038n.h(new InterfaceC0086b() { // from class: f1.g
                @Override // a1.InterfaceC0086b
                public final void g(Object obj, x0.e eVar) {
                    List B2;
                    List B3;
                    List B4;
                    List B5;
                    List B6;
                    List B7;
                    List B8;
                    List B9;
                    List B10;
                    List B11;
                    List B12;
                    List B13;
                    List B14;
                    List B15;
                    List B16;
                    switch (i2) {
                        case 0:
                            InterfaceC0175i interfaceC0175i2 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            kotlin.jvm.internal.i.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            kotlin.jvm.internal.i.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            kotlin.jvm.internal.i.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0175i2.e(str2, str3, (C0176j) obj4);
                                B2 = AbstractC0083a.m(null);
                            } catch (Throwable th) {
                                B2 = AbstractC0253j.B(th.getClass().getSimpleName(), th.toString(), C1.a.j("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                            }
                            eVar.f(B2);
                            break;
                        case 1:
                            InterfaceC0175i interfaceC0175i3 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.i.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.i.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            kotlin.jvm.internal.i.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0175i3.f(str4, list3, (C0176j) obj7);
                                B3 = AbstractC0083a.m(null);
                            } catch (Throwable th2) {
                                B3 = AbstractC0253j.B(th2.getClass().getSimpleName(), th2.toString(), C1.a.j("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                            }
                            eVar.f(B3);
                            break;
                        case 2:
                            InterfaceC0175i interfaceC0175i4 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            kotlin.jvm.internal.i.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            kotlin.jvm.internal.i.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B4 = AbstractC0083a.m(interfaceC0175i4.n(str5, (C0176j) obj9));
                            } catch (Throwable th3) {
                                B4 = AbstractC0253j.B(th3.getClass().getSimpleName(), th3.toString(), C1.a.j("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                            }
                            eVar.f(B4);
                            break;
                        case 3:
                            InterfaceC0175i interfaceC0175i5 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            kotlin.jvm.internal.i.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            kotlin.jvm.internal.i.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B5 = AbstractC0083a.m(interfaceC0175i5.p(str6, (C0176j) obj11));
                            } catch (Throwable th4) {
                                B5 = AbstractC0253j.B(th4.getClass().getSimpleName(), th4.toString(), C1.a.j("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                            }
                            eVar.f(B5);
                            break;
                        case 4:
                            InterfaceC0175i interfaceC0175i6 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            kotlin.jvm.internal.i.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            kotlin.jvm.internal.i.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B6 = AbstractC0083a.m(interfaceC0175i6.b(str7, (C0176j) obj13));
                            } catch (Throwable th5) {
                                B6 = AbstractC0253j.B(th5.getClass().getSimpleName(), th5.toString(), C1.a.j("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                            }
                            eVar.f(B6);
                            break;
                        case 5:
                            InterfaceC0175i interfaceC0175i7 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            kotlin.jvm.internal.i.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            kotlin.jvm.internal.i.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B7 = AbstractC0083a.m(interfaceC0175i7.c(str8, (C0176j) obj15));
                            } catch (Throwable th6) {
                                B7 = AbstractC0253j.B(th6.getClass().getSimpleName(), th6.toString(), C1.a.j("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                            }
                            eVar.f(B7);
                            break;
                        case 6:
                            InterfaceC0175i interfaceC0175i8 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            kotlin.jvm.internal.i.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            kotlin.jvm.internal.i.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            kotlin.jvm.internal.i.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0175i8.a(str9, booleanValue, (C0176j) obj18);
                                B8 = AbstractC0083a.m(null);
                            } catch (Throwable th7) {
                                B8 = AbstractC0253j.B(th7.getClass().getSimpleName(), th7.toString(), C1.a.j("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                            }
                            eVar.f(B8);
                            break;
                        case 7:
                            InterfaceC0175i interfaceC0175i9 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            kotlin.jvm.internal.i.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            kotlin.jvm.internal.i.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B9 = AbstractC0083a.m(interfaceC0175i9.d(str10, (C0176j) obj20));
                            } catch (Throwable th8) {
                                B9 = AbstractC0253j.B(th8.getClass().getSimpleName(), th8.toString(), C1.a.j("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                            }
                            eVar.f(B9);
                            break;
                        case 8:
                            InterfaceC0175i interfaceC0175i10 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            kotlin.jvm.internal.i.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            kotlin.jvm.internal.i.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B10 = AbstractC0083a.m(interfaceC0175i10.h(str11, (C0176j) obj22));
                            } catch (Throwable th9) {
                                B10 = AbstractC0253j.B(th9.getClass().getSimpleName(), th9.toString(), C1.a.j("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                            }
                            eVar.f(B10);
                            break;
                        case 9:
                            InterfaceC0175i interfaceC0175i11 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            kotlin.jvm.internal.i.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0175i11.k(list12, (C0176j) obj23);
                                B11 = AbstractC0083a.m(null);
                            } catch (Throwable th10) {
                                B11 = AbstractC0253j.B(th10.getClass().getSimpleName(), th10.toString(), C1.a.j("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                            }
                            eVar.f(B11);
                            break;
                        case 10:
                            InterfaceC0175i interfaceC0175i12 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            kotlin.jvm.internal.i.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B12 = AbstractC0083a.m(interfaceC0175i12.m(list14, (C0176j) obj24));
                            } catch (Throwable th11) {
                                B12 = AbstractC0253j.B(th11.getClass().getSimpleName(), th11.toString(), C1.a.j("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                            }
                            eVar.f(B12);
                            break;
                        case 11:
                            InterfaceC0175i interfaceC0175i13 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            kotlin.jvm.internal.i.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B13 = AbstractC0083a.m(interfaceC0175i13.l(list16, (C0176j) obj25));
                            } catch (Throwable th12) {
                                B13 = AbstractC0253j.B(th12.getClass().getSimpleName(), th12.toString(), C1.a.j("Cause: ", th12.getCause(), ", Stacktrace: ", Log.getStackTraceString(th12)));
                            }
                            eVar.f(B13);
                            break;
                        case 12:
                            InterfaceC0175i interfaceC0175i14 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            kotlin.jvm.internal.i.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            kotlin.jvm.internal.i.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            kotlin.jvm.internal.i.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0175i14.j(str12, str13, (C0176j) obj28);
                                B14 = AbstractC0083a.m(null);
                            } catch (Throwable th13) {
                                B14 = AbstractC0253j.B(th13.getClass().getSimpleName(), th13.toString(), C1.a.j("Cause: ", th13.getCause(), ", Stacktrace: ", Log.getStackTraceString(th13)));
                            }
                            eVar.f(B14);
                            break;
                        case 13:
                            InterfaceC0175i interfaceC0175i15 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            kotlin.jvm.internal.i.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            kotlin.jvm.internal.i.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            kotlin.jvm.internal.i.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0175i15.q(str14, longValue, (C0176j) obj31);
                                B15 = AbstractC0083a.m(null);
                            } catch (Throwable th14) {
                                B15 = AbstractC0253j.B(th14.getClass().getSimpleName(), th14.toString(), C1.a.j("Cause: ", th14.getCause(), ", Stacktrace: ", Log.getStackTraceString(th14)));
                            }
                            eVar.f(B15);
                            break;
                        default:
                            InterfaceC0175i interfaceC0175i16 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            kotlin.jvm.internal.i.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            kotlin.jvm.internal.i.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            kotlin.jvm.internal.i.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0175i16.g(str15, doubleValue, (C0176j) obj34);
                                B16 = AbstractC0083a.m(null);
                            } catch (Throwable th15) {
                                B16 = AbstractC0253j.B(th15.getClass().getSimpleName(), th15.toString(), C1.a.j("Cause: ", th15.getCause(), ", Stacktrace: ", Log.getStackTraceString(th15)));
                            }
                            eVar.f(B16);
                            break;
                    }
                }
            });
        } else {
            c0038n.h(null);
        }
        C0038n c0038n2 = new C0038n(binaryMessenger, C1.a.i("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setString", concat), a(), e2);
        if (interfaceC0175i != null) {
            final int i3 = 12;
            c0038n2.h(new InterfaceC0086b() { // from class: f1.g
                @Override // a1.InterfaceC0086b
                public final void g(Object obj, x0.e eVar) {
                    List B2;
                    List B3;
                    List B4;
                    List B5;
                    List B6;
                    List B7;
                    List B8;
                    List B9;
                    List B10;
                    List B11;
                    List B12;
                    List B13;
                    List B14;
                    List B15;
                    List B16;
                    switch (i3) {
                        case 0:
                            InterfaceC0175i interfaceC0175i2 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            kotlin.jvm.internal.i.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            kotlin.jvm.internal.i.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            kotlin.jvm.internal.i.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0175i2.e(str2, str3, (C0176j) obj4);
                                B2 = AbstractC0083a.m(null);
                            } catch (Throwable th) {
                                B2 = AbstractC0253j.B(th.getClass().getSimpleName(), th.toString(), C1.a.j("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                            }
                            eVar.f(B2);
                            break;
                        case 1:
                            InterfaceC0175i interfaceC0175i3 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.i.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.i.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            kotlin.jvm.internal.i.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0175i3.f(str4, list3, (C0176j) obj7);
                                B3 = AbstractC0083a.m(null);
                            } catch (Throwable th2) {
                                B3 = AbstractC0253j.B(th2.getClass().getSimpleName(), th2.toString(), C1.a.j("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                            }
                            eVar.f(B3);
                            break;
                        case 2:
                            InterfaceC0175i interfaceC0175i4 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            kotlin.jvm.internal.i.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            kotlin.jvm.internal.i.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B4 = AbstractC0083a.m(interfaceC0175i4.n(str5, (C0176j) obj9));
                            } catch (Throwable th3) {
                                B4 = AbstractC0253j.B(th3.getClass().getSimpleName(), th3.toString(), C1.a.j("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                            }
                            eVar.f(B4);
                            break;
                        case 3:
                            InterfaceC0175i interfaceC0175i5 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            kotlin.jvm.internal.i.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            kotlin.jvm.internal.i.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B5 = AbstractC0083a.m(interfaceC0175i5.p(str6, (C0176j) obj11));
                            } catch (Throwable th4) {
                                B5 = AbstractC0253j.B(th4.getClass().getSimpleName(), th4.toString(), C1.a.j("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                            }
                            eVar.f(B5);
                            break;
                        case 4:
                            InterfaceC0175i interfaceC0175i6 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            kotlin.jvm.internal.i.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            kotlin.jvm.internal.i.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B6 = AbstractC0083a.m(interfaceC0175i6.b(str7, (C0176j) obj13));
                            } catch (Throwable th5) {
                                B6 = AbstractC0253j.B(th5.getClass().getSimpleName(), th5.toString(), C1.a.j("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                            }
                            eVar.f(B6);
                            break;
                        case 5:
                            InterfaceC0175i interfaceC0175i7 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            kotlin.jvm.internal.i.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            kotlin.jvm.internal.i.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B7 = AbstractC0083a.m(interfaceC0175i7.c(str8, (C0176j) obj15));
                            } catch (Throwable th6) {
                                B7 = AbstractC0253j.B(th6.getClass().getSimpleName(), th6.toString(), C1.a.j("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                            }
                            eVar.f(B7);
                            break;
                        case 6:
                            InterfaceC0175i interfaceC0175i8 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            kotlin.jvm.internal.i.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            kotlin.jvm.internal.i.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            kotlin.jvm.internal.i.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0175i8.a(str9, booleanValue, (C0176j) obj18);
                                B8 = AbstractC0083a.m(null);
                            } catch (Throwable th7) {
                                B8 = AbstractC0253j.B(th7.getClass().getSimpleName(), th7.toString(), C1.a.j("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                            }
                            eVar.f(B8);
                            break;
                        case 7:
                            InterfaceC0175i interfaceC0175i9 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            kotlin.jvm.internal.i.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            kotlin.jvm.internal.i.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B9 = AbstractC0083a.m(interfaceC0175i9.d(str10, (C0176j) obj20));
                            } catch (Throwable th8) {
                                B9 = AbstractC0253j.B(th8.getClass().getSimpleName(), th8.toString(), C1.a.j("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                            }
                            eVar.f(B9);
                            break;
                        case 8:
                            InterfaceC0175i interfaceC0175i10 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            kotlin.jvm.internal.i.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            kotlin.jvm.internal.i.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B10 = AbstractC0083a.m(interfaceC0175i10.h(str11, (C0176j) obj22));
                            } catch (Throwable th9) {
                                B10 = AbstractC0253j.B(th9.getClass().getSimpleName(), th9.toString(), C1.a.j("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                            }
                            eVar.f(B10);
                            break;
                        case 9:
                            InterfaceC0175i interfaceC0175i11 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            kotlin.jvm.internal.i.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0175i11.k(list12, (C0176j) obj23);
                                B11 = AbstractC0083a.m(null);
                            } catch (Throwable th10) {
                                B11 = AbstractC0253j.B(th10.getClass().getSimpleName(), th10.toString(), C1.a.j("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                            }
                            eVar.f(B11);
                            break;
                        case 10:
                            InterfaceC0175i interfaceC0175i12 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            kotlin.jvm.internal.i.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B12 = AbstractC0083a.m(interfaceC0175i12.m(list14, (C0176j) obj24));
                            } catch (Throwable th11) {
                                B12 = AbstractC0253j.B(th11.getClass().getSimpleName(), th11.toString(), C1.a.j("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                            }
                            eVar.f(B12);
                            break;
                        case 11:
                            InterfaceC0175i interfaceC0175i13 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            kotlin.jvm.internal.i.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B13 = AbstractC0083a.m(interfaceC0175i13.l(list16, (C0176j) obj25));
                            } catch (Throwable th12) {
                                B13 = AbstractC0253j.B(th12.getClass().getSimpleName(), th12.toString(), C1.a.j("Cause: ", th12.getCause(), ", Stacktrace: ", Log.getStackTraceString(th12)));
                            }
                            eVar.f(B13);
                            break;
                        case 12:
                            InterfaceC0175i interfaceC0175i14 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            kotlin.jvm.internal.i.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            kotlin.jvm.internal.i.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            kotlin.jvm.internal.i.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0175i14.j(str12, str13, (C0176j) obj28);
                                B14 = AbstractC0083a.m(null);
                            } catch (Throwable th13) {
                                B14 = AbstractC0253j.B(th13.getClass().getSimpleName(), th13.toString(), C1.a.j("Cause: ", th13.getCause(), ", Stacktrace: ", Log.getStackTraceString(th13)));
                            }
                            eVar.f(B14);
                            break;
                        case 13:
                            InterfaceC0175i interfaceC0175i15 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            kotlin.jvm.internal.i.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            kotlin.jvm.internal.i.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            kotlin.jvm.internal.i.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0175i15.q(str14, longValue, (C0176j) obj31);
                                B15 = AbstractC0083a.m(null);
                            } catch (Throwable th14) {
                                B15 = AbstractC0253j.B(th14.getClass().getSimpleName(), th14.toString(), C1.a.j("Cause: ", th14.getCause(), ", Stacktrace: ", Log.getStackTraceString(th14)));
                            }
                            eVar.f(B15);
                            break;
                        default:
                            InterfaceC0175i interfaceC0175i16 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            kotlin.jvm.internal.i.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            kotlin.jvm.internal.i.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            kotlin.jvm.internal.i.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0175i16.g(str15, doubleValue, (C0176j) obj34);
                                B16 = AbstractC0083a.m(null);
                            } catch (Throwable th15) {
                                B16 = AbstractC0253j.B(th15.getClass().getSimpleName(), th15.toString(), C1.a.j("Cause: ", th15.getCause(), ", Stacktrace: ", Log.getStackTraceString(th15)));
                            }
                            eVar.f(B16);
                            break;
                    }
                }
            });
        } else {
            c0038n2.h(null);
        }
        C0038n c0038n3 = new C0038n(binaryMessenger, C1.a.i("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setInt", concat), a(), e2);
        if (interfaceC0175i != null) {
            final int i4 = 13;
            c0038n3.h(new InterfaceC0086b() { // from class: f1.g
                @Override // a1.InterfaceC0086b
                public final void g(Object obj, x0.e eVar) {
                    List B2;
                    List B3;
                    List B4;
                    List B5;
                    List B6;
                    List B7;
                    List B8;
                    List B9;
                    List B10;
                    List B11;
                    List B12;
                    List B13;
                    List B14;
                    List B15;
                    List B16;
                    switch (i4) {
                        case 0:
                            InterfaceC0175i interfaceC0175i2 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            kotlin.jvm.internal.i.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            kotlin.jvm.internal.i.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            kotlin.jvm.internal.i.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0175i2.e(str2, str3, (C0176j) obj4);
                                B2 = AbstractC0083a.m(null);
                            } catch (Throwable th) {
                                B2 = AbstractC0253j.B(th.getClass().getSimpleName(), th.toString(), C1.a.j("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                            }
                            eVar.f(B2);
                            break;
                        case 1:
                            InterfaceC0175i interfaceC0175i3 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.i.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.i.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            kotlin.jvm.internal.i.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0175i3.f(str4, list3, (C0176j) obj7);
                                B3 = AbstractC0083a.m(null);
                            } catch (Throwable th2) {
                                B3 = AbstractC0253j.B(th2.getClass().getSimpleName(), th2.toString(), C1.a.j("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                            }
                            eVar.f(B3);
                            break;
                        case 2:
                            InterfaceC0175i interfaceC0175i4 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            kotlin.jvm.internal.i.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            kotlin.jvm.internal.i.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B4 = AbstractC0083a.m(interfaceC0175i4.n(str5, (C0176j) obj9));
                            } catch (Throwable th3) {
                                B4 = AbstractC0253j.B(th3.getClass().getSimpleName(), th3.toString(), C1.a.j("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                            }
                            eVar.f(B4);
                            break;
                        case 3:
                            InterfaceC0175i interfaceC0175i5 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            kotlin.jvm.internal.i.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            kotlin.jvm.internal.i.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B5 = AbstractC0083a.m(interfaceC0175i5.p(str6, (C0176j) obj11));
                            } catch (Throwable th4) {
                                B5 = AbstractC0253j.B(th4.getClass().getSimpleName(), th4.toString(), C1.a.j("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                            }
                            eVar.f(B5);
                            break;
                        case 4:
                            InterfaceC0175i interfaceC0175i6 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            kotlin.jvm.internal.i.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            kotlin.jvm.internal.i.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B6 = AbstractC0083a.m(interfaceC0175i6.b(str7, (C0176j) obj13));
                            } catch (Throwable th5) {
                                B6 = AbstractC0253j.B(th5.getClass().getSimpleName(), th5.toString(), C1.a.j("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                            }
                            eVar.f(B6);
                            break;
                        case 5:
                            InterfaceC0175i interfaceC0175i7 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            kotlin.jvm.internal.i.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            kotlin.jvm.internal.i.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B7 = AbstractC0083a.m(interfaceC0175i7.c(str8, (C0176j) obj15));
                            } catch (Throwable th6) {
                                B7 = AbstractC0253j.B(th6.getClass().getSimpleName(), th6.toString(), C1.a.j("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                            }
                            eVar.f(B7);
                            break;
                        case 6:
                            InterfaceC0175i interfaceC0175i8 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            kotlin.jvm.internal.i.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            kotlin.jvm.internal.i.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            kotlin.jvm.internal.i.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0175i8.a(str9, booleanValue, (C0176j) obj18);
                                B8 = AbstractC0083a.m(null);
                            } catch (Throwable th7) {
                                B8 = AbstractC0253j.B(th7.getClass().getSimpleName(), th7.toString(), C1.a.j("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                            }
                            eVar.f(B8);
                            break;
                        case 7:
                            InterfaceC0175i interfaceC0175i9 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            kotlin.jvm.internal.i.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            kotlin.jvm.internal.i.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B9 = AbstractC0083a.m(interfaceC0175i9.d(str10, (C0176j) obj20));
                            } catch (Throwable th8) {
                                B9 = AbstractC0253j.B(th8.getClass().getSimpleName(), th8.toString(), C1.a.j("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                            }
                            eVar.f(B9);
                            break;
                        case 8:
                            InterfaceC0175i interfaceC0175i10 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            kotlin.jvm.internal.i.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            kotlin.jvm.internal.i.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B10 = AbstractC0083a.m(interfaceC0175i10.h(str11, (C0176j) obj22));
                            } catch (Throwable th9) {
                                B10 = AbstractC0253j.B(th9.getClass().getSimpleName(), th9.toString(), C1.a.j("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                            }
                            eVar.f(B10);
                            break;
                        case 9:
                            InterfaceC0175i interfaceC0175i11 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            kotlin.jvm.internal.i.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0175i11.k(list12, (C0176j) obj23);
                                B11 = AbstractC0083a.m(null);
                            } catch (Throwable th10) {
                                B11 = AbstractC0253j.B(th10.getClass().getSimpleName(), th10.toString(), C1.a.j("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                            }
                            eVar.f(B11);
                            break;
                        case 10:
                            InterfaceC0175i interfaceC0175i12 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            kotlin.jvm.internal.i.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B12 = AbstractC0083a.m(interfaceC0175i12.m(list14, (C0176j) obj24));
                            } catch (Throwable th11) {
                                B12 = AbstractC0253j.B(th11.getClass().getSimpleName(), th11.toString(), C1.a.j("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                            }
                            eVar.f(B12);
                            break;
                        case 11:
                            InterfaceC0175i interfaceC0175i13 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            kotlin.jvm.internal.i.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B13 = AbstractC0083a.m(interfaceC0175i13.l(list16, (C0176j) obj25));
                            } catch (Throwable th12) {
                                B13 = AbstractC0253j.B(th12.getClass().getSimpleName(), th12.toString(), C1.a.j("Cause: ", th12.getCause(), ", Stacktrace: ", Log.getStackTraceString(th12)));
                            }
                            eVar.f(B13);
                            break;
                        case 12:
                            InterfaceC0175i interfaceC0175i14 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            kotlin.jvm.internal.i.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            kotlin.jvm.internal.i.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            kotlin.jvm.internal.i.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0175i14.j(str12, str13, (C0176j) obj28);
                                B14 = AbstractC0083a.m(null);
                            } catch (Throwable th13) {
                                B14 = AbstractC0253j.B(th13.getClass().getSimpleName(), th13.toString(), C1.a.j("Cause: ", th13.getCause(), ", Stacktrace: ", Log.getStackTraceString(th13)));
                            }
                            eVar.f(B14);
                            break;
                        case 13:
                            InterfaceC0175i interfaceC0175i15 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            kotlin.jvm.internal.i.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            kotlin.jvm.internal.i.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            kotlin.jvm.internal.i.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0175i15.q(str14, longValue, (C0176j) obj31);
                                B15 = AbstractC0083a.m(null);
                            } catch (Throwable th14) {
                                B15 = AbstractC0253j.B(th14.getClass().getSimpleName(), th14.toString(), C1.a.j("Cause: ", th14.getCause(), ", Stacktrace: ", Log.getStackTraceString(th14)));
                            }
                            eVar.f(B15);
                            break;
                        default:
                            InterfaceC0175i interfaceC0175i16 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            kotlin.jvm.internal.i.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            kotlin.jvm.internal.i.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            kotlin.jvm.internal.i.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0175i16.g(str15, doubleValue, (C0176j) obj34);
                                B16 = AbstractC0083a.m(null);
                            } catch (Throwable th15) {
                                B16 = AbstractC0253j.B(th15.getClass().getSimpleName(), th15.toString(), C1.a.j("Cause: ", th15.getCause(), ", Stacktrace: ", Log.getStackTraceString(th15)));
                            }
                            eVar.f(B16);
                            break;
                    }
                }
            });
        } else {
            c0038n3.h(null);
        }
        C0038n c0038n4 = new C0038n(binaryMessenger, C1.a.i("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setDouble", concat), a(), e2);
        if (interfaceC0175i != null) {
            final int i5 = 14;
            c0038n4.h(new InterfaceC0086b() { // from class: f1.g
                @Override // a1.InterfaceC0086b
                public final void g(Object obj, x0.e eVar) {
                    List B2;
                    List B3;
                    List B4;
                    List B5;
                    List B6;
                    List B7;
                    List B8;
                    List B9;
                    List B10;
                    List B11;
                    List B12;
                    List B13;
                    List B14;
                    List B15;
                    List B16;
                    switch (i5) {
                        case 0:
                            InterfaceC0175i interfaceC0175i2 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            kotlin.jvm.internal.i.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            kotlin.jvm.internal.i.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            kotlin.jvm.internal.i.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0175i2.e(str2, str3, (C0176j) obj4);
                                B2 = AbstractC0083a.m(null);
                            } catch (Throwable th) {
                                B2 = AbstractC0253j.B(th.getClass().getSimpleName(), th.toString(), C1.a.j("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                            }
                            eVar.f(B2);
                            break;
                        case 1:
                            InterfaceC0175i interfaceC0175i3 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.i.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.i.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            kotlin.jvm.internal.i.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0175i3.f(str4, list3, (C0176j) obj7);
                                B3 = AbstractC0083a.m(null);
                            } catch (Throwable th2) {
                                B3 = AbstractC0253j.B(th2.getClass().getSimpleName(), th2.toString(), C1.a.j("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                            }
                            eVar.f(B3);
                            break;
                        case 2:
                            InterfaceC0175i interfaceC0175i4 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            kotlin.jvm.internal.i.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            kotlin.jvm.internal.i.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B4 = AbstractC0083a.m(interfaceC0175i4.n(str5, (C0176j) obj9));
                            } catch (Throwable th3) {
                                B4 = AbstractC0253j.B(th3.getClass().getSimpleName(), th3.toString(), C1.a.j("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                            }
                            eVar.f(B4);
                            break;
                        case 3:
                            InterfaceC0175i interfaceC0175i5 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            kotlin.jvm.internal.i.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            kotlin.jvm.internal.i.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B5 = AbstractC0083a.m(interfaceC0175i5.p(str6, (C0176j) obj11));
                            } catch (Throwable th4) {
                                B5 = AbstractC0253j.B(th4.getClass().getSimpleName(), th4.toString(), C1.a.j("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                            }
                            eVar.f(B5);
                            break;
                        case 4:
                            InterfaceC0175i interfaceC0175i6 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            kotlin.jvm.internal.i.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            kotlin.jvm.internal.i.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B6 = AbstractC0083a.m(interfaceC0175i6.b(str7, (C0176j) obj13));
                            } catch (Throwable th5) {
                                B6 = AbstractC0253j.B(th5.getClass().getSimpleName(), th5.toString(), C1.a.j("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                            }
                            eVar.f(B6);
                            break;
                        case 5:
                            InterfaceC0175i interfaceC0175i7 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            kotlin.jvm.internal.i.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            kotlin.jvm.internal.i.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B7 = AbstractC0083a.m(interfaceC0175i7.c(str8, (C0176j) obj15));
                            } catch (Throwable th6) {
                                B7 = AbstractC0253j.B(th6.getClass().getSimpleName(), th6.toString(), C1.a.j("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                            }
                            eVar.f(B7);
                            break;
                        case 6:
                            InterfaceC0175i interfaceC0175i8 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            kotlin.jvm.internal.i.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            kotlin.jvm.internal.i.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            kotlin.jvm.internal.i.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0175i8.a(str9, booleanValue, (C0176j) obj18);
                                B8 = AbstractC0083a.m(null);
                            } catch (Throwable th7) {
                                B8 = AbstractC0253j.B(th7.getClass().getSimpleName(), th7.toString(), C1.a.j("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                            }
                            eVar.f(B8);
                            break;
                        case 7:
                            InterfaceC0175i interfaceC0175i9 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            kotlin.jvm.internal.i.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            kotlin.jvm.internal.i.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B9 = AbstractC0083a.m(interfaceC0175i9.d(str10, (C0176j) obj20));
                            } catch (Throwable th8) {
                                B9 = AbstractC0253j.B(th8.getClass().getSimpleName(), th8.toString(), C1.a.j("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                            }
                            eVar.f(B9);
                            break;
                        case 8:
                            InterfaceC0175i interfaceC0175i10 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            kotlin.jvm.internal.i.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            kotlin.jvm.internal.i.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B10 = AbstractC0083a.m(interfaceC0175i10.h(str11, (C0176j) obj22));
                            } catch (Throwable th9) {
                                B10 = AbstractC0253j.B(th9.getClass().getSimpleName(), th9.toString(), C1.a.j("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                            }
                            eVar.f(B10);
                            break;
                        case 9:
                            InterfaceC0175i interfaceC0175i11 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            kotlin.jvm.internal.i.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0175i11.k(list12, (C0176j) obj23);
                                B11 = AbstractC0083a.m(null);
                            } catch (Throwable th10) {
                                B11 = AbstractC0253j.B(th10.getClass().getSimpleName(), th10.toString(), C1.a.j("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                            }
                            eVar.f(B11);
                            break;
                        case 10:
                            InterfaceC0175i interfaceC0175i12 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            kotlin.jvm.internal.i.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B12 = AbstractC0083a.m(interfaceC0175i12.m(list14, (C0176j) obj24));
                            } catch (Throwable th11) {
                                B12 = AbstractC0253j.B(th11.getClass().getSimpleName(), th11.toString(), C1.a.j("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                            }
                            eVar.f(B12);
                            break;
                        case 11:
                            InterfaceC0175i interfaceC0175i13 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            kotlin.jvm.internal.i.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B13 = AbstractC0083a.m(interfaceC0175i13.l(list16, (C0176j) obj25));
                            } catch (Throwable th12) {
                                B13 = AbstractC0253j.B(th12.getClass().getSimpleName(), th12.toString(), C1.a.j("Cause: ", th12.getCause(), ", Stacktrace: ", Log.getStackTraceString(th12)));
                            }
                            eVar.f(B13);
                            break;
                        case 12:
                            InterfaceC0175i interfaceC0175i14 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            kotlin.jvm.internal.i.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            kotlin.jvm.internal.i.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            kotlin.jvm.internal.i.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0175i14.j(str12, str13, (C0176j) obj28);
                                B14 = AbstractC0083a.m(null);
                            } catch (Throwable th13) {
                                B14 = AbstractC0253j.B(th13.getClass().getSimpleName(), th13.toString(), C1.a.j("Cause: ", th13.getCause(), ", Stacktrace: ", Log.getStackTraceString(th13)));
                            }
                            eVar.f(B14);
                            break;
                        case 13:
                            InterfaceC0175i interfaceC0175i15 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            kotlin.jvm.internal.i.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            kotlin.jvm.internal.i.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            kotlin.jvm.internal.i.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0175i15.q(str14, longValue, (C0176j) obj31);
                                B15 = AbstractC0083a.m(null);
                            } catch (Throwable th14) {
                                B15 = AbstractC0253j.B(th14.getClass().getSimpleName(), th14.toString(), C1.a.j("Cause: ", th14.getCause(), ", Stacktrace: ", Log.getStackTraceString(th14)));
                            }
                            eVar.f(B15);
                            break;
                        default:
                            InterfaceC0175i interfaceC0175i16 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            kotlin.jvm.internal.i.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            kotlin.jvm.internal.i.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            kotlin.jvm.internal.i.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0175i16.g(str15, doubleValue, (C0176j) obj34);
                                B16 = AbstractC0083a.m(null);
                            } catch (Throwable th15) {
                                B16 = AbstractC0253j.B(th15.getClass().getSimpleName(), th15.toString(), C1.a.j("Cause: ", th15.getCause(), ", Stacktrace: ", Log.getStackTraceString(th15)));
                            }
                            eVar.f(B16);
                            break;
                    }
                }
            });
        } else {
            c0038n4.h(null);
        }
        C0038n c0038n5 = new C0038n(binaryMessenger, C1.a.i("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setEncodedStringList", concat), a(), e2);
        if (interfaceC0175i != null) {
            final int i6 = 0;
            c0038n5.h(new InterfaceC0086b() { // from class: f1.g
                @Override // a1.InterfaceC0086b
                public final void g(Object obj, x0.e eVar) {
                    List B2;
                    List B3;
                    List B4;
                    List B5;
                    List B6;
                    List B7;
                    List B8;
                    List B9;
                    List B10;
                    List B11;
                    List B12;
                    List B13;
                    List B14;
                    List B15;
                    List B16;
                    switch (i6) {
                        case 0:
                            InterfaceC0175i interfaceC0175i2 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            kotlin.jvm.internal.i.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            kotlin.jvm.internal.i.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            kotlin.jvm.internal.i.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0175i2.e(str2, str3, (C0176j) obj4);
                                B2 = AbstractC0083a.m(null);
                            } catch (Throwable th) {
                                B2 = AbstractC0253j.B(th.getClass().getSimpleName(), th.toString(), C1.a.j("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                            }
                            eVar.f(B2);
                            break;
                        case 1:
                            InterfaceC0175i interfaceC0175i3 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.i.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.i.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            kotlin.jvm.internal.i.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0175i3.f(str4, list3, (C0176j) obj7);
                                B3 = AbstractC0083a.m(null);
                            } catch (Throwable th2) {
                                B3 = AbstractC0253j.B(th2.getClass().getSimpleName(), th2.toString(), C1.a.j("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                            }
                            eVar.f(B3);
                            break;
                        case 2:
                            InterfaceC0175i interfaceC0175i4 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            kotlin.jvm.internal.i.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            kotlin.jvm.internal.i.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B4 = AbstractC0083a.m(interfaceC0175i4.n(str5, (C0176j) obj9));
                            } catch (Throwable th3) {
                                B4 = AbstractC0253j.B(th3.getClass().getSimpleName(), th3.toString(), C1.a.j("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                            }
                            eVar.f(B4);
                            break;
                        case 3:
                            InterfaceC0175i interfaceC0175i5 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            kotlin.jvm.internal.i.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            kotlin.jvm.internal.i.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B5 = AbstractC0083a.m(interfaceC0175i5.p(str6, (C0176j) obj11));
                            } catch (Throwable th4) {
                                B5 = AbstractC0253j.B(th4.getClass().getSimpleName(), th4.toString(), C1.a.j("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                            }
                            eVar.f(B5);
                            break;
                        case 4:
                            InterfaceC0175i interfaceC0175i6 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            kotlin.jvm.internal.i.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            kotlin.jvm.internal.i.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B6 = AbstractC0083a.m(interfaceC0175i6.b(str7, (C0176j) obj13));
                            } catch (Throwable th5) {
                                B6 = AbstractC0253j.B(th5.getClass().getSimpleName(), th5.toString(), C1.a.j("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                            }
                            eVar.f(B6);
                            break;
                        case 5:
                            InterfaceC0175i interfaceC0175i7 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            kotlin.jvm.internal.i.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            kotlin.jvm.internal.i.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B7 = AbstractC0083a.m(interfaceC0175i7.c(str8, (C0176j) obj15));
                            } catch (Throwable th6) {
                                B7 = AbstractC0253j.B(th6.getClass().getSimpleName(), th6.toString(), C1.a.j("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                            }
                            eVar.f(B7);
                            break;
                        case 6:
                            InterfaceC0175i interfaceC0175i8 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            kotlin.jvm.internal.i.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            kotlin.jvm.internal.i.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            kotlin.jvm.internal.i.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0175i8.a(str9, booleanValue, (C0176j) obj18);
                                B8 = AbstractC0083a.m(null);
                            } catch (Throwable th7) {
                                B8 = AbstractC0253j.B(th7.getClass().getSimpleName(), th7.toString(), C1.a.j("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                            }
                            eVar.f(B8);
                            break;
                        case 7:
                            InterfaceC0175i interfaceC0175i9 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            kotlin.jvm.internal.i.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            kotlin.jvm.internal.i.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B9 = AbstractC0083a.m(interfaceC0175i9.d(str10, (C0176j) obj20));
                            } catch (Throwable th8) {
                                B9 = AbstractC0253j.B(th8.getClass().getSimpleName(), th8.toString(), C1.a.j("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                            }
                            eVar.f(B9);
                            break;
                        case 8:
                            InterfaceC0175i interfaceC0175i10 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            kotlin.jvm.internal.i.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            kotlin.jvm.internal.i.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B10 = AbstractC0083a.m(interfaceC0175i10.h(str11, (C0176j) obj22));
                            } catch (Throwable th9) {
                                B10 = AbstractC0253j.B(th9.getClass().getSimpleName(), th9.toString(), C1.a.j("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                            }
                            eVar.f(B10);
                            break;
                        case 9:
                            InterfaceC0175i interfaceC0175i11 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            kotlin.jvm.internal.i.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0175i11.k(list12, (C0176j) obj23);
                                B11 = AbstractC0083a.m(null);
                            } catch (Throwable th10) {
                                B11 = AbstractC0253j.B(th10.getClass().getSimpleName(), th10.toString(), C1.a.j("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                            }
                            eVar.f(B11);
                            break;
                        case 10:
                            InterfaceC0175i interfaceC0175i12 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            kotlin.jvm.internal.i.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B12 = AbstractC0083a.m(interfaceC0175i12.m(list14, (C0176j) obj24));
                            } catch (Throwable th11) {
                                B12 = AbstractC0253j.B(th11.getClass().getSimpleName(), th11.toString(), C1.a.j("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                            }
                            eVar.f(B12);
                            break;
                        case 11:
                            InterfaceC0175i interfaceC0175i13 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            kotlin.jvm.internal.i.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B13 = AbstractC0083a.m(interfaceC0175i13.l(list16, (C0176j) obj25));
                            } catch (Throwable th12) {
                                B13 = AbstractC0253j.B(th12.getClass().getSimpleName(), th12.toString(), C1.a.j("Cause: ", th12.getCause(), ", Stacktrace: ", Log.getStackTraceString(th12)));
                            }
                            eVar.f(B13);
                            break;
                        case 12:
                            InterfaceC0175i interfaceC0175i14 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            kotlin.jvm.internal.i.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            kotlin.jvm.internal.i.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            kotlin.jvm.internal.i.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0175i14.j(str12, str13, (C0176j) obj28);
                                B14 = AbstractC0083a.m(null);
                            } catch (Throwable th13) {
                                B14 = AbstractC0253j.B(th13.getClass().getSimpleName(), th13.toString(), C1.a.j("Cause: ", th13.getCause(), ", Stacktrace: ", Log.getStackTraceString(th13)));
                            }
                            eVar.f(B14);
                            break;
                        case 13:
                            InterfaceC0175i interfaceC0175i15 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            kotlin.jvm.internal.i.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            kotlin.jvm.internal.i.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            kotlin.jvm.internal.i.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0175i15.q(str14, longValue, (C0176j) obj31);
                                B15 = AbstractC0083a.m(null);
                            } catch (Throwable th14) {
                                B15 = AbstractC0253j.B(th14.getClass().getSimpleName(), th14.toString(), C1.a.j("Cause: ", th14.getCause(), ", Stacktrace: ", Log.getStackTraceString(th14)));
                            }
                            eVar.f(B15);
                            break;
                        default:
                            InterfaceC0175i interfaceC0175i16 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            kotlin.jvm.internal.i.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            kotlin.jvm.internal.i.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            kotlin.jvm.internal.i.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0175i16.g(str15, doubleValue, (C0176j) obj34);
                                B16 = AbstractC0083a.m(null);
                            } catch (Throwable th15) {
                                B16 = AbstractC0253j.B(th15.getClass().getSimpleName(), th15.toString(), C1.a.j("Cause: ", th15.getCause(), ", Stacktrace: ", Log.getStackTraceString(th15)));
                            }
                            eVar.f(B16);
                            break;
                    }
                }
            });
        } else {
            c0038n5.h(null);
        }
        C0038n c0038n6 = new C0038n(binaryMessenger, C1.a.i("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setDeprecatedStringList", concat), a(), e2);
        if (interfaceC0175i != null) {
            final int i7 = 1;
            c0038n6.h(new InterfaceC0086b() { // from class: f1.g
                @Override // a1.InterfaceC0086b
                public final void g(Object obj, x0.e eVar) {
                    List B2;
                    List B3;
                    List B4;
                    List B5;
                    List B6;
                    List B7;
                    List B8;
                    List B9;
                    List B10;
                    List B11;
                    List B12;
                    List B13;
                    List B14;
                    List B15;
                    List B16;
                    switch (i7) {
                        case 0:
                            InterfaceC0175i interfaceC0175i2 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            kotlin.jvm.internal.i.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            kotlin.jvm.internal.i.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            kotlin.jvm.internal.i.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0175i2.e(str2, str3, (C0176j) obj4);
                                B2 = AbstractC0083a.m(null);
                            } catch (Throwable th) {
                                B2 = AbstractC0253j.B(th.getClass().getSimpleName(), th.toString(), C1.a.j("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                            }
                            eVar.f(B2);
                            break;
                        case 1:
                            InterfaceC0175i interfaceC0175i3 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.i.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.i.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            kotlin.jvm.internal.i.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0175i3.f(str4, list3, (C0176j) obj7);
                                B3 = AbstractC0083a.m(null);
                            } catch (Throwable th2) {
                                B3 = AbstractC0253j.B(th2.getClass().getSimpleName(), th2.toString(), C1.a.j("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                            }
                            eVar.f(B3);
                            break;
                        case 2:
                            InterfaceC0175i interfaceC0175i4 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            kotlin.jvm.internal.i.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            kotlin.jvm.internal.i.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B4 = AbstractC0083a.m(interfaceC0175i4.n(str5, (C0176j) obj9));
                            } catch (Throwable th3) {
                                B4 = AbstractC0253j.B(th3.getClass().getSimpleName(), th3.toString(), C1.a.j("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                            }
                            eVar.f(B4);
                            break;
                        case 3:
                            InterfaceC0175i interfaceC0175i5 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            kotlin.jvm.internal.i.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            kotlin.jvm.internal.i.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B5 = AbstractC0083a.m(interfaceC0175i5.p(str6, (C0176j) obj11));
                            } catch (Throwable th4) {
                                B5 = AbstractC0253j.B(th4.getClass().getSimpleName(), th4.toString(), C1.a.j("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                            }
                            eVar.f(B5);
                            break;
                        case 4:
                            InterfaceC0175i interfaceC0175i6 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            kotlin.jvm.internal.i.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            kotlin.jvm.internal.i.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B6 = AbstractC0083a.m(interfaceC0175i6.b(str7, (C0176j) obj13));
                            } catch (Throwable th5) {
                                B6 = AbstractC0253j.B(th5.getClass().getSimpleName(), th5.toString(), C1.a.j("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                            }
                            eVar.f(B6);
                            break;
                        case 5:
                            InterfaceC0175i interfaceC0175i7 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            kotlin.jvm.internal.i.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            kotlin.jvm.internal.i.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B7 = AbstractC0083a.m(interfaceC0175i7.c(str8, (C0176j) obj15));
                            } catch (Throwable th6) {
                                B7 = AbstractC0253j.B(th6.getClass().getSimpleName(), th6.toString(), C1.a.j("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                            }
                            eVar.f(B7);
                            break;
                        case 6:
                            InterfaceC0175i interfaceC0175i8 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            kotlin.jvm.internal.i.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            kotlin.jvm.internal.i.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            kotlin.jvm.internal.i.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0175i8.a(str9, booleanValue, (C0176j) obj18);
                                B8 = AbstractC0083a.m(null);
                            } catch (Throwable th7) {
                                B8 = AbstractC0253j.B(th7.getClass().getSimpleName(), th7.toString(), C1.a.j("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                            }
                            eVar.f(B8);
                            break;
                        case 7:
                            InterfaceC0175i interfaceC0175i9 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            kotlin.jvm.internal.i.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            kotlin.jvm.internal.i.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B9 = AbstractC0083a.m(interfaceC0175i9.d(str10, (C0176j) obj20));
                            } catch (Throwable th8) {
                                B9 = AbstractC0253j.B(th8.getClass().getSimpleName(), th8.toString(), C1.a.j("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                            }
                            eVar.f(B9);
                            break;
                        case 8:
                            InterfaceC0175i interfaceC0175i10 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            kotlin.jvm.internal.i.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            kotlin.jvm.internal.i.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B10 = AbstractC0083a.m(interfaceC0175i10.h(str11, (C0176j) obj22));
                            } catch (Throwable th9) {
                                B10 = AbstractC0253j.B(th9.getClass().getSimpleName(), th9.toString(), C1.a.j("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                            }
                            eVar.f(B10);
                            break;
                        case 9:
                            InterfaceC0175i interfaceC0175i11 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            kotlin.jvm.internal.i.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0175i11.k(list12, (C0176j) obj23);
                                B11 = AbstractC0083a.m(null);
                            } catch (Throwable th10) {
                                B11 = AbstractC0253j.B(th10.getClass().getSimpleName(), th10.toString(), C1.a.j("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                            }
                            eVar.f(B11);
                            break;
                        case 10:
                            InterfaceC0175i interfaceC0175i12 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            kotlin.jvm.internal.i.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B12 = AbstractC0083a.m(interfaceC0175i12.m(list14, (C0176j) obj24));
                            } catch (Throwable th11) {
                                B12 = AbstractC0253j.B(th11.getClass().getSimpleName(), th11.toString(), C1.a.j("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                            }
                            eVar.f(B12);
                            break;
                        case 11:
                            InterfaceC0175i interfaceC0175i13 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            kotlin.jvm.internal.i.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B13 = AbstractC0083a.m(interfaceC0175i13.l(list16, (C0176j) obj25));
                            } catch (Throwable th12) {
                                B13 = AbstractC0253j.B(th12.getClass().getSimpleName(), th12.toString(), C1.a.j("Cause: ", th12.getCause(), ", Stacktrace: ", Log.getStackTraceString(th12)));
                            }
                            eVar.f(B13);
                            break;
                        case 12:
                            InterfaceC0175i interfaceC0175i14 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            kotlin.jvm.internal.i.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            kotlin.jvm.internal.i.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            kotlin.jvm.internal.i.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0175i14.j(str12, str13, (C0176j) obj28);
                                B14 = AbstractC0083a.m(null);
                            } catch (Throwable th13) {
                                B14 = AbstractC0253j.B(th13.getClass().getSimpleName(), th13.toString(), C1.a.j("Cause: ", th13.getCause(), ", Stacktrace: ", Log.getStackTraceString(th13)));
                            }
                            eVar.f(B14);
                            break;
                        case 13:
                            InterfaceC0175i interfaceC0175i15 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            kotlin.jvm.internal.i.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            kotlin.jvm.internal.i.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            kotlin.jvm.internal.i.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0175i15.q(str14, longValue, (C0176j) obj31);
                                B15 = AbstractC0083a.m(null);
                            } catch (Throwable th14) {
                                B15 = AbstractC0253j.B(th14.getClass().getSimpleName(), th14.toString(), C1.a.j("Cause: ", th14.getCause(), ", Stacktrace: ", Log.getStackTraceString(th14)));
                            }
                            eVar.f(B15);
                            break;
                        default:
                            InterfaceC0175i interfaceC0175i16 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            kotlin.jvm.internal.i.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            kotlin.jvm.internal.i.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            kotlin.jvm.internal.i.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0175i16.g(str15, doubleValue, (C0176j) obj34);
                                B16 = AbstractC0083a.m(null);
                            } catch (Throwable th15) {
                                B16 = AbstractC0253j.B(th15.getClass().getSimpleName(), th15.toString(), C1.a.j("Cause: ", th15.getCause(), ", Stacktrace: ", Log.getStackTraceString(th15)));
                            }
                            eVar.f(B16);
                            break;
                    }
                }
            });
        } else {
            c0038n6.h(null);
        }
        C0038n c0038n7 = new C0038n(binaryMessenger, C1.a.i("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getString", concat), a(), e2);
        if (interfaceC0175i != null) {
            final int i8 = 2;
            c0038n7.h(new InterfaceC0086b() { // from class: f1.g
                @Override // a1.InterfaceC0086b
                public final void g(Object obj, x0.e eVar) {
                    List B2;
                    List B3;
                    List B4;
                    List B5;
                    List B6;
                    List B7;
                    List B8;
                    List B9;
                    List B10;
                    List B11;
                    List B12;
                    List B13;
                    List B14;
                    List B15;
                    List B16;
                    switch (i8) {
                        case 0:
                            InterfaceC0175i interfaceC0175i2 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            kotlin.jvm.internal.i.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            kotlin.jvm.internal.i.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            kotlin.jvm.internal.i.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0175i2.e(str2, str3, (C0176j) obj4);
                                B2 = AbstractC0083a.m(null);
                            } catch (Throwable th) {
                                B2 = AbstractC0253j.B(th.getClass().getSimpleName(), th.toString(), C1.a.j("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                            }
                            eVar.f(B2);
                            break;
                        case 1:
                            InterfaceC0175i interfaceC0175i3 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.i.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.i.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            kotlin.jvm.internal.i.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0175i3.f(str4, list3, (C0176j) obj7);
                                B3 = AbstractC0083a.m(null);
                            } catch (Throwable th2) {
                                B3 = AbstractC0253j.B(th2.getClass().getSimpleName(), th2.toString(), C1.a.j("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                            }
                            eVar.f(B3);
                            break;
                        case 2:
                            InterfaceC0175i interfaceC0175i4 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            kotlin.jvm.internal.i.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            kotlin.jvm.internal.i.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B4 = AbstractC0083a.m(interfaceC0175i4.n(str5, (C0176j) obj9));
                            } catch (Throwable th3) {
                                B4 = AbstractC0253j.B(th3.getClass().getSimpleName(), th3.toString(), C1.a.j("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                            }
                            eVar.f(B4);
                            break;
                        case 3:
                            InterfaceC0175i interfaceC0175i5 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            kotlin.jvm.internal.i.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            kotlin.jvm.internal.i.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B5 = AbstractC0083a.m(interfaceC0175i5.p(str6, (C0176j) obj11));
                            } catch (Throwable th4) {
                                B5 = AbstractC0253j.B(th4.getClass().getSimpleName(), th4.toString(), C1.a.j("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                            }
                            eVar.f(B5);
                            break;
                        case 4:
                            InterfaceC0175i interfaceC0175i6 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            kotlin.jvm.internal.i.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            kotlin.jvm.internal.i.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B6 = AbstractC0083a.m(interfaceC0175i6.b(str7, (C0176j) obj13));
                            } catch (Throwable th5) {
                                B6 = AbstractC0253j.B(th5.getClass().getSimpleName(), th5.toString(), C1.a.j("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                            }
                            eVar.f(B6);
                            break;
                        case 5:
                            InterfaceC0175i interfaceC0175i7 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            kotlin.jvm.internal.i.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            kotlin.jvm.internal.i.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B7 = AbstractC0083a.m(interfaceC0175i7.c(str8, (C0176j) obj15));
                            } catch (Throwable th6) {
                                B7 = AbstractC0253j.B(th6.getClass().getSimpleName(), th6.toString(), C1.a.j("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                            }
                            eVar.f(B7);
                            break;
                        case 6:
                            InterfaceC0175i interfaceC0175i8 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            kotlin.jvm.internal.i.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            kotlin.jvm.internal.i.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            kotlin.jvm.internal.i.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0175i8.a(str9, booleanValue, (C0176j) obj18);
                                B8 = AbstractC0083a.m(null);
                            } catch (Throwable th7) {
                                B8 = AbstractC0253j.B(th7.getClass().getSimpleName(), th7.toString(), C1.a.j("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                            }
                            eVar.f(B8);
                            break;
                        case 7:
                            InterfaceC0175i interfaceC0175i9 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            kotlin.jvm.internal.i.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            kotlin.jvm.internal.i.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B9 = AbstractC0083a.m(interfaceC0175i9.d(str10, (C0176j) obj20));
                            } catch (Throwable th8) {
                                B9 = AbstractC0253j.B(th8.getClass().getSimpleName(), th8.toString(), C1.a.j("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                            }
                            eVar.f(B9);
                            break;
                        case 8:
                            InterfaceC0175i interfaceC0175i10 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            kotlin.jvm.internal.i.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            kotlin.jvm.internal.i.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B10 = AbstractC0083a.m(interfaceC0175i10.h(str11, (C0176j) obj22));
                            } catch (Throwable th9) {
                                B10 = AbstractC0253j.B(th9.getClass().getSimpleName(), th9.toString(), C1.a.j("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                            }
                            eVar.f(B10);
                            break;
                        case 9:
                            InterfaceC0175i interfaceC0175i11 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            kotlin.jvm.internal.i.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0175i11.k(list12, (C0176j) obj23);
                                B11 = AbstractC0083a.m(null);
                            } catch (Throwable th10) {
                                B11 = AbstractC0253j.B(th10.getClass().getSimpleName(), th10.toString(), C1.a.j("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                            }
                            eVar.f(B11);
                            break;
                        case 10:
                            InterfaceC0175i interfaceC0175i12 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            kotlin.jvm.internal.i.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B12 = AbstractC0083a.m(interfaceC0175i12.m(list14, (C0176j) obj24));
                            } catch (Throwable th11) {
                                B12 = AbstractC0253j.B(th11.getClass().getSimpleName(), th11.toString(), C1.a.j("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                            }
                            eVar.f(B12);
                            break;
                        case 11:
                            InterfaceC0175i interfaceC0175i13 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            kotlin.jvm.internal.i.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B13 = AbstractC0083a.m(interfaceC0175i13.l(list16, (C0176j) obj25));
                            } catch (Throwable th12) {
                                B13 = AbstractC0253j.B(th12.getClass().getSimpleName(), th12.toString(), C1.a.j("Cause: ", th12.getCause(), ", Stacktrace: ", Log.getStackTraceString(th12)));
                            }
                            eVar.f(B13);
                            break;
                        case 12:
                            InterfaceC0175i interfaceC0175i14 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            kotlin.jvm.internal.i.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            kotlin.jvm.internal.i.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            kotlin.jvm.internal.i.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0175i14.j(str12, str13, (C0176j) obj28);
                                B14 = AbstractC0083a.m(null);
                            } catch (Throwable th13) {
                                B14 = AbstractC0253j.B(th13.getClass().getSimpleName(), th13.toString(), C1.a.j("Cause: ", th13.getCause(), ", Stacktrace: ", Log.getStackTraceString(th13)));
                            }
                            eVar.f(B14);
                            break;
                        case 13:
                            InterfaceC0175i interfaceC0175i15 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            kotlin.jvm.internal.i.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            kotlin.jvm.internal.i.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            kotlin.jvm.internal.i.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0175i15.q(str14, longValue, (C0176j) obj31);
                                B15 = AbstractC0083a.m(null);
                            } catch (Throwable th14) {
                                B15 = AbstractC0253j.B(th14.getClass().getSimpleName(), th14.toString(), C1.a.j("Cause: ", th14.getCause(), ", Stacktrace: ", Log.getStackTraceString(th14)));
                            }
                            eVar.f(B15);
                            break;
                        default:
                            InterfaceC0175i interfaceC0175i16 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            kotlin.jvm.internal.i.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            kotlin.jvm.internal.i.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            kotlin.jvm.internal.i.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0175i16.g(str15, doubleValue, (C0176j) obj34);
                                B16 = AbstractC0083a.m(null);
                            } catch (Throwable th15) {
                                B16 = AbstractC0253j.B(th15.getClass().getSimpleName(), th15.toString(), C1.a.j("Cause: ", th15.getCause(), ", Stacktrace: ", Log.getStackTraceString(th15)));
                            }
                            eVar.f(B16);
                            break;
                    }
                }
            });
        } else {
            c0038n7.h(null);
        }
        C0038n c0038n8 = new C0038n(binaryMessenger, C1.a.i("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getBool", concat), a(), e2);
        if (interfaceC0175i != null) {
            final int i9 = 3;
            c0038n8.h(new InterfaceC0086b() { // from class: f1.g
                @Override // a1.InterfaceC0086b
                public final void g(Object obj, x0.e eVar) {
                    List B2;
                    List B3;
                    List B4;
                    List B5;
                    List B6;
                    List B7;
                    List B8;
                    List B9;
                    List B10;
                    List B11;
                    List B12;
                    List B13;
                    List B14;
                    List B15;
                    List B16;
                    switch (i9) {
                        case 0:
                            InterfaceC0175i interfaceC0175i2 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            kotlin.jvm.internal.i.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            kotlin.jvm.internal.i.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            kotlin.jvm.internal.i.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0175i2.e(str2, str3, (C0176j) obj4);
                                B2 = AbstractC0083a.m(null);
                            } catch (Throwable th) {
                                B2 = AbstractC0253j.B(th.getClass().getSimpleName(), th.toString(), C1.a.j("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                            }
                            eVar.f(B2);
                            break;
                        case 1:
                            InterfaceC0175i interfaceC0175i3 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.i.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.i.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            kotlin.jvm.internal.i.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0175i3.f(str4, list3, (C0176j) obj7);
                                B3 = AbstractC0083a.m(null);
                            } catch (Throwable th2) {
                                B3 = AbstractC0253j.B(th2.getClass().getSimpleName(), th2.toString(), C1.a.j("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                            }
                            eVar.f(B3);
                            break;
                        case 2:
                            InterfaceC0175i interfaceC0175i4 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            kotlin.jvm.internal.i.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            kotlin.jvm.internal.i.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B4 = AbstractC0083a.m(interfaceC0175i4.n(str5, (C0176j) obj9));
                            } catch (Throwable th3) {
                                B4 = AbstractC0253j.B(th3.getClass().getSimpleName(), th3.toString(), C1.a.j("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                            }
                            eVar.f(B4);
                            break;
                        case 3:
                            InterfaceC0175i interfaceC0175i5 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            kotlin.jvm.internal.i.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            kotlin.jvm.internal.i.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B5 = AbstractC0083a.m(interfaceC0175i5.p(str6, (C0176j) obj11));
                            } catch (Throwable th4) {
                                B5 = AbstractC0253j.B(th4.getClass().getSimpleName(), th4.toString(), C1.a.j("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                            }
                            eVar.f(B5);
                            break;
                        case 4:
                            InterfaceC0175i interfaceC0175i6 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            kotlin.jvm.internal.i.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            kotlin.jvm.internal.i.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B6 = AbstractC0083a.m(interfaceC0175i6.b(str7, (C0176j) obj13));
                            } catch (Throwable th5) {
                                B6 = AbstractC0253j.B(th5.getClass().getSimpleName(), th5.toString(), C1.a.j("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                            }
                            eVar.f(B6);
                            break;
                        case 5:
                            InterfaceC0175i interfaceC0175i7 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            kotlin.jvm.internal.i.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            kotlin.jvm.internal.i.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B7 = AbstractC0083a.m(interfaceC0175i7.c(str8, (C0176j) obj15));
                            } catch (Throwable th6) {
                                B7 = AbstractC0253j.B(th6.getClass().getSimpleName(), th6.toString(), C1.a.j("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                            }
                            eVar.f(B7);
                            break;
                        case 6:
                            InterfaceC0175i interfaceC0175i8 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            kotlin.jvm.internal.i.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            kotlin.jvm.internal.i.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            kotlin.jvm.internal.i.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0175i8.a(str9, booleanValue, (C0176j) obj18);
                                B8 = AbstractC0083a.m(null);
                            } catch (Throwable th7) {
                                B8 = AbstractC0253j.B(th7.getClass().getSimpleName(), th7.toString(), C1.a.j("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                            }
                            eVar.f(B8);
                            break;
                        case 7:
                            InterfaceC0175i interfaceC0175i9 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            kotlin.jvm.internal.i.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            kotlin.jvm.internal.i.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B9 = AbstractC0083a.m(interfaceC0175i9.d(str10, (C0176j) obj20));
                            } catch (Throwable th8) {
                                B9 = AbstractC0253j.B(th8.getClass().getSimpleName(), th8.toString(), C1.a.j("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                            }
                            eVar.f(B9);
                            break;
                        case 8:
                            InterfaceC0175i interfaceC0175i10 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            kotlin.jvm.internal.i.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            kotlin.jvm.internal.i.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B10 = AbstractC0083a.m(interfaceC0175i10.h(str11, (C0176j) obj22));
                            } catch (Throwable th9) {
                                B10 = AbstractC0253j.B(th9.getClass().getSimpleName(), th9.toString(), C1.a.j("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                            }
                            eVar.f(B10);
                            break;
                        case 9:
                            InterfaceC0175i interfaceC0175i11 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            kotlin.jvm.internal.i.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0175i11.k(list12, (C0176j) obj23);
                                B11 = AbstractC0083a.m(null);
                            } catch (Throwable th10) {
                                B11 = AbstractC0253j.B(th10.getClass().getSimpleName(), th10.toString(), C1.a.j("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                            }
                            eVar.f(B11);
                            break;
                        case 10:
                            InterfaceC0175i interfaceC0175i12 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            kotlin.jvm.internal.i.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B12 = AbstractC0083a.m(interfaceC0175i12.m(list14, (C0176j) obj24));
                            } catch (Throwable th11) {
                                B12 = AbstractC0253j.B(th11.getClass().getSimpleName(), th11.toString(), C1.a.j("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                            }
                            eVar.f(B12);
                            break;
                        case 11:
                            InterfaceC0175i interfaceC0175i13 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            kotlin.jvm.internal.i.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B13 = AbstractC0083a.m(interfaceC0175i13.l(list16, (C0176j) obj25));
                            } catch (Throwable th12) {
                                B13 = AbstractC0253j.B(th12.getClass().getSimpleName(), th12.toString(), C1.a.j("Cause: ", th12.getCause(), ", Stacktrace: ", Log.getStackTraceString(th12)));
                            }
                            eVar.f(B13);
                            break;
                        case 12:
                            InterfaceC0175i interfaceC0175i14 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            kotlin.jvm.internal.i.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            kotlin.jvm.internal.i.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            kotlin.jvm.internal.i.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0175i14.j(str12, str13, (C0176j) obj28);
                                B14 = AbstractC0083a.m(null);
                            } catch (Throwable th13) {
                                B14 = AbstractC0253j.B(th13.getClass().getSimpleName(), th13.toString(), C1.a.j("Cause: ", th13.getCause(), ", Stacktrace: ", Log.getStackTraceString(th13)));
                            }
                            eVar.f(B14);
                            break;
                        case 13:
                            InterfaceC0175i interfaceC0175i15 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            kotlin.jvm.internal.i.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            kotlin.jvm.internal.i.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            kotlin.jvm.internal.i.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0175i15.q(str14, longValue, (C0176j) obj31);
                                B15 = AbstractC0083a.m(null);
                            } catch (Throwable th14) {
                                B15 = AbstractC0253j.B(th14.getClass().getSimpleName(), th14.toString(), C1.a.j("Cause: ", th14.getCause(), ", Stacktrace: ", Log.getStackTraceString(th14)));
                            }
                            eVar.f(B15);
                            break;
                        default:
                            InterfaceC0175i interfaceC0175i16 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            kotlin.jvm.internal.i.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            kotlin.jvm.internal.i.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            kotlin.jvm.internal.i.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0175i16.g(str15, doubleValue, (C0176j) obj34);
                                B16 = AbstractC0083a.m(null);
                            } catch (Throwable th15) {
                                B16 = AbstractC0253j.B(th15.getClass().getSimpleName(), th15.toString(), C1.a.j("Cause: ", th15.getCause(), ", Stacktrace: ", Log.getStackTraceString(th15)));
                            }
                            eVar.f(B16);
                            break;
                    }
                }
            });
        } else {
            c0038n8.h(null);
        }
        C0038n c0038n9 = new C0038n(binaryMessenger, C1.a.i("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getDouble", concat), a(), e2);
        if (interfaceC0175i != null) {
            final int i10 = 4;
            c0038n9.h(new InterfaceC0086b() { // from class: f1.g
                @Override // a1.InterfaceC0086b
                public final void g(Object obj, x0.e eVar) {
                    List B2;
                    List B3;
                    List B4;
                    List B5;
                    List B6;
                    List B7;
                    List B8;
                    List B9;
                    List B10;
                    List B11;
                    List B12;
                    List B13;
                    List B14;
                    List B15;
                    List B16;
                    switch (i10) {
                        case 0:
                            InterfaceC0175i interfaceC0175i2 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            kotlin.jvm.internal.i.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            kotlin.jvm.internal.i.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            kotlin.jvm.internal.i.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0175i2.e(str2, str3, (C0176j) obj4);
                                B2 = AbstractC0083a.m(null);
                            } catch (Throwable th) {
                                B2 = AbstractC0253j.B(th.getClass().getSimpleName(), th.toString(), C1.a.j("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                            }
                            eVar.f(B2);
                            break;
                        case 1:
                            InterfaceC0175i interfaceC0175i3 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.i.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.i.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            kotlin.jvm.internal.i.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0175i3.f(str4, list3, (C0176j) obj7);
                                B3 = AbstractC0083a.m(null);
                            } catch (Throwable th2) {
                                B3 = AbstractC0253j.B(th2.getClass().getSimpleName(), th2.toString(), C1.a.j("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                            }
                            eVar.f(B3);
                            break;
                        case 2:
                            InterfaceC0175i interfaceC0175i4 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            kotlin.jvm.internal.i.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            kotlin.jvm.internal.i.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B4 = AbstractC0083a.m(interfaceC0175i4.n(str5, (C0176j) obj9));
                            } catch (Throwable th3) {
                                B4 = AbstractC0253j.B(th3.getClass().getSimpleName(), th3.toString(), C1.a.j("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                            }
                            eVar.f(B4);
                            break;
                        case 3:
                            InterfaceC0175i interfaceC0175i5 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            kotlin.jvm.internal.i.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            kotlin.jvm.internal.i.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B5 = AbstractC0083a.m(interfaceC0175i5.p(str6, (C0176j) obj11));
                            } catch (Throwable th4) {
                                B5 = AbstractC0253j.B(th4.getClass().getSimpleName(), th4.toString(), C1.a.j("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                            }
                            eVar.f(B5);
                            break;
                        case 4:
                            InterfaceC0175i interfaceC0175i6 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            kotlin.jvm.internal.i.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            kotlin.jvm.internal.i.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B6 = AbstractC0083a.m(interfaceC0175i6.b(str7, (C0176j) obj13));
                            } catch (Throwable th5) {
                                B6 = AbstractC0253j.B(th5.getClass().getSimpleName(), th5.toString(), C1.a.j("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                            }
                            eVar.f(B6);
                            break;
                        case 5:
                            InterfaceC0175i interfaceC0175i7 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            kotlin.jvm.internal.i.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            kotlin.jvm.internal.i.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B7 = AbstractC0083a.m(interfaceC0175i7.c(str8, (C0176j) obj15));
                            } catch (Throwable th6) {
                                B7 = AbstractC0253j.B(th6.getClass().getSimpleName(), th6.toString(), C1.a.j("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                            }
                            eVar.f(B7);
                            break;
                        case 6:
                            InterfaceC0175i interfaceC0175i8 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            kotlin.jvm.internal.i.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            kotlin.jvm.internal.i.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            kotlin.jvm.internal.i.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0175i8.a(str9, booleanValue, (C0176j) obj18);
                                B8 = AbstractC0083a.m(null);
                            } catch (Throwable th7) {
                                B8 = AbstractC0253j.B(th7.getClass().getSimpleName(), th7.toString(), C1.a.j("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                            }
                            eVar.f(B8);
                            break;
                        case 7:
                            InterfaceC0175i interfaceC0175i9 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            kotlin.jvm.internal.i.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            kotlin.jvm.internal.i.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B9 = AbstractC0083a.m(interfaceC0175i9.d(str10, (C0176j) obj20));
                            } catch (Throwable th8) {
                                B9 = AbstractC0253j.B(th8.getClass().getSimpleName(), th8.toString(), C1.a.j("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                            }
                            eVar.f(B9);
                            break;
                        case 8:
                            InterfaceC0175i interfaceC0175i10 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            kotlin.jvm.internal.i.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            kotlin.jvm.internal.i.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B10 = AbstractC0083a.m(interfaceC0175i10.h(str11, (C0176j) obj22));
                            } catch (Throwable th9) {
                                B10 = AbstractC0253j.B(th9.getClass().getSimpleName(), th9.toString(), C1.a.j("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                            }
                            eVar.f(B10);
                            break;
                        case 9:
                            InterfaceC0175i interfaceC0175i11 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            kotlin.jvm.internal.i.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0175i11.k(list12, (C0176j) obj23);
                                B11 = AbstractC0083a.m(null);
                            } catch (Throwable th10) {
                                B11 = AbstractC0253j.B(th10.getClass().getSimpleName(), th10.toString(), C1.a.j("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                            }
                            eVar.f(B11);
                            break;
                        case 10:
                            InterfaceC0175i interfaceC0175i12 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            kotlin.jvm.internal.i.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B12 = AbstractC0083a.m(interfaceC0175i12.m(list14, (C0176j) obj24));
                            } catch (Throwable th11) {
                                B12 = AbstractC0253j.B(th11.getClass().getSimpleName(), th11.toString(), C1.a.j("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                            }
                            eVar.f(B12);
                            break;
                        case 11:
                            InterfaceC0175i interfaceC0175i13 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            kotlin.jvm.internal.i.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B13 = AbstractC0083a.m(interfaceC0175i13.l(list16, (C0176j) obj25));
                            } catch (Throwable th12) {
                                B13 = AbstractC0253j.B(th12.getClass().getSimpleName(), th12.toString(), C1.a.j("Cause: ", th12.getCause(), ", Stacktrace: ", Log.getStackTraceString(th12)));
                            }
                            eVar.f(B13);
                            break;
                        case 12:
                            InterfaceC0175i interfaceC0175i14 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            kotlin.jvm.internal.i.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            kotlin.jvm.internal.i.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            kotlin.jvm.internal.i.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0175i14.j(str12, str13, (C0176j) obj28);
                                B14 = AbstractC0083a.m(null);
                            } catch (Throwable th13) {
                                B14 = AbstractC0253j.B(th13.getClass().getSimpleName(), th13.toString(), C1.a.j("Cause: ", th13.getCause(), ", Stacktrace: ", Log.getStackTraceString(th13)));
                            }
                            eVar.f(B14);
                            break;
                        case 13:
                            InterfaceC0175i interfaceC0175i15 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            kotlin.jvm.internal.i.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            kotlin.jvm.internal.i.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            kotlin.jvm.internal.i.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0175i15.q(str14, longValue, (C0176j) obj31);
                                B15 = AbstractC0083a.m(null);
                            } catch (Throwable th14) {
                                B15 = AbstractC0253j.B(th14.getClass().getSimpleName(), th14.toString(), C1.a.j("Cause: ", th14.getCause(), ", Stacktrace: ", Log.getStackTraceString(th14)));
                            }
                            eVar.f(B15);
                            break;
                        default:
                            InterfaceC0175i interfaceC0175i16 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            kotlin.jvm.internal.i.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            kotlin.jvm.internal.i.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            kotlin.jvm.internal.i.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0175i16.g(str15, doubleValue, (C0176j) obj34);
                                B16 = AbstractC0083a.m(null);
                            } catch (Throwable th15) {
                                B16 = AbstractC0253j.B(th15.getClass().getSimpleName(), th15.toString(), C1.a.j("Cause: ", th15.getCause(), ", Stacktrace: ", Log.getStackTraceString(th15)));
                            }
                            eVar.f(B16);
                            break;
                    }
                }
            });
        } else {
            c0038n9.h(null);
        }
        C0038n c0038n10 = new C0038n(binaryMessenger, C1.a.i("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getInt", concat), a(), e2);
        if (interfaceC0175i != null) {
            final int i11 = 5;
            c0038n10.h(new InterfaceC0086b() { // from class: f1.g
                @Override // a1.InterfaceC0086b
                public final void g(Object obj, x0.e eVar) {
                    List B2;
                    List B3;
                    List B4;
                    List B5;
                    List B6;
                    List B7;
                    List B8;
                    List B9;
                    List B10;
                    List B11;
                    List B12;
                    List B13;
                    List B14;
                    List B15;
                    List B16;
                    switch (i11) {
                        case 0:
                            InterfaceC0175i interfaceC0175i2 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            kotlin.jvm.internal.i.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            kotlin.jvm.internal.i.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            kotlin.jvm.internal.i.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0175i2.e(str2, str3, (C0176j) obj4);
                                B2 = AbstractC0083a.m(null);
                            } catch (Throwable th) {
                                B2 = AbstractC0253j.B(th.getClass().getSimpleName(), th.toString(), C1.a.j("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                            }
                            eVar.f(B2);
                            break;
                        case 1:
                            InterfaceC0175i interfaceC0175i3 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.i.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.i.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            kotlin.jvm.internal.i.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0175i3.f(str4, list3, (C0176j) obj7);
                                B3 = AbstractC0083a.m(null);
                            } catch (Throwable th2) {
                                B3 = AbstractC0253j.B(th2.getClass().getSimpleName(), th2.toString(), C1.a.j("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                            }
                            eVar.f(B3);
                            break;
                        case 2:
                            InterfaceC0175i interfaceC0175i4 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            kotlin.jvm.internal.i.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            kotlin.jvm.internal.i.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B4 = AbstractC0083a.m(interfaceC0175i4.n(str5, (C0176j) obj9));
                            } catch (Throwable th3) {
                                B4 = AbstractC0253j.B(th3.getClass().getSimpleName(), th3.toString(), C1.a.j("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                            }
                            eVar.f(B4);
                            break;
                        case 3:
                            InterfaceC0175i interfaceC0175i5 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            kotlin.jvm.internal.i.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            kotlin.jvm.internal.i.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B5 = AbstractC0083a.m(interfaceC0175i5.p(str6, (C0176j) obj11));
                            } catch (Throwable th4) {
                                B5 = AbstractC0253j.B(th4.getClass().getSimpleName(), th4.toString(), C1.a.j("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                            }
                            eVar.f(B5);
                            break;
                        case 4:
                            InterfaceC0175i interfaceC0175i6 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            kotlin.jvm.internal.i.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            kotlin.jvm.internal.i.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B6 = AbstractC0083a.m(interfaceC0175i6.b(str7, (C0176j) obj13));
                            } catch (Throwable th5) {
                                B6 = AbstractC0253j.B(th5.getClass().getSimpleName(), th5.toString(), C1.a.j("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                            }
                            eVar.f(B6);
                            break;
                        case 5:
                            InterfaceC0175i interfaceC0175i7 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            kotlin.jvm.internal.i.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            kotlin.jvm.internal.i.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B7 = AbstractC0083a.m(interfaceC0175i7.c(str8, (C0176j) obj15));
                            } catch (Throwable th6) {
                                B7 = AbstractC0253j.B(th6.getClass().getSimpleName(), th6.toString(), C1.a.j("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                            }
                            eVar.f(B7);
                            break;
                        case 6:
                            InterfaceC0175i interfaceC0175i8 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            kotlin.jvm.internal.i.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            kotlin.jvm.internal.i.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            kotlin.jvm.internal.i.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0175i8.a(str9, booleanValue, (C0176j) obj18);
                                B8 = AbstractC0083a.m(null);
                            } catch (Throwable th7) {
                                B8 = AbstractC0253j.B(th7.getClass().getSimpleName(), th7.toString(), C1.a.j("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                            }
                            eVar.f(B8);
                            break;
                        case 7:
                            InterfaceC0175i interfaceC0175i9 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            kotlin.jvm.internal.i.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            kotlin.jvm.internal.i.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B9 = AbstractC0083a.m(interfaceC0175i9.d(str10, (C0176j) obj20));
                            } catch (Throwable th8) {
                                B9 = AbstractC0253j.B(th8.getClass().getSimpleName(), th8.toString(), C1.a.j("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                            }
                            eVar.f(B9);
                            break;
                        case 8:
                            InterfaceC0175i interfaceC0175i10 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            kotlin.jvm.internal.i.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            kotlin.jvm.internal.i.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B10 = AbstractC0083a.m(interfaceC0175i10.h(str11, (C0176j) obj22));
                            } catch (Throwable th9) {
                                B10 = AbstractC0253j.B(th9.getClass().getSimpleName(), th9.toString(), C1.a.j("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                            }
                            eVar.f(B10);
                            break;
                        case 9:
                            InterfaceC0175i interfaceC0175i11 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            kotlin.jvm.internal.i.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0175i11.k(list12, (C0176j) obj23);
                                B11 = AbstractC0083a.m(null);
                            } catch (Throwable th10) {
                                B11 = AbstractC0253j.B(th10.getClass().getSimpleName(), th10.toString(), C1.a.j("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                            }
                            eVar.f(B11);
                            break;
                        case 10:
                            InterfaceC0175i interfaceC0175i12 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            kotlin.jvm.internal.i.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B12 = AbstractC0083a.m(interfaceC0175i12.m(list14, (C0176j) obj24));
                            } catch (Throwable th11) {
                                B12 = AbstractC0253j.B(th11.getClass().getSimpleName(), th11.toString(), C1.a.j("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                            }
                            eVar.f(B12);
                            break;
                        case 11:
                            InterfaceC0175i interfaceC0175i13 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            kotlin.jvm.internal.i.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B13 = AbstractC0083a.m(interfaceC0175i13.l(list16, (C0176j) obj25));
                            } catch (Throwable th12) {
                                B13 = AbstractC0253j.B(th12.getClass().getSimpleName(), th12.toString(), C1.a.j("Cause: ", th12.getCause(), ", Stacktrace: ", Log.getStackTraceString(th12)));
                            }
                            eVar.f(B13);
                            break;
                        case 12:
                            InterfaceC0175i interfaceC0175i14 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            kotlin.jvm.internal.i.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            kotlin.jvm.internal.i.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            kotlin.jvm.internal.i.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0175i14.j(str12, str13, (C0176j) obj28);
                                B14 = AbstractC0083a.m(null);
                            } catch (Throwable th13) {
                                B14 = AbstractC0253j.B(th13.getClass().getSimpleName(), th13.toString(), C1.a.j("Cause: ", th13.getCause(), ", Stacktrace: ", Log.getStackTraceString(th13)));
                            }
                            eVar.f(B14);
                            break;
                        case 13:
                            InterfaceC0175i interfaceC0175i15 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            kotlin.jvm.internal.i.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            kotlin.jvm.internal.i.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            kotlin.jvm.internal.i.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0175i15.q(str14, longValue, (C0176j) obj31);
                                B15 = AbstractC0083a.m(null);
                            } catch (Throwable th14) {
                                B15 = AbstractC0253j.B(th14.getClass().getSimpleName(), th14.toString(), C1.a.j("Cause: ", th14.getCause(), ", Stacktrace: ", Log.getStackTraceString(th14)));
                            }
                            eVar.f(B15);
                            break;
                        default:
                            InterfaceC0175i interfaceC0175i16 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            kotlin.jvm.internal.i.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            kotlin.jvm.internal.i.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            kotlin.jvm.internal.i.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0175i16.g(str15, doubleValue, (C0176j) obj34);
                                B16 = AbstractC0083a.m(null);
                            } catch (Throwable th15) {
                                B16 = AbstractC0253j.B(th15.getClass().getSimpleName(), th15.toString(), C1.a.j("Cause: ", th15.getCause(), ", Stacktrace: ", Log.getStackTraceString(th15)));
                            }
                            eVar.f(B16);
                            break;
                    }
                }
            });
        } else {
            c0038n10.h(null);
        }
        C0038n c0038n11 = new C0038n(binaryMessenger, C1.a.i("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getPlatformEncodedStringList", concat), a(), e2);
        if (interfaceC0175i != null) {
            final int i12 = 7;
            c0038n11.h(new InterfaceC0086b() { // from class: f1.g
                @Override // a1.InterfaceC0086b
                public final void g(Object obj, x0.e eVar) {
                    List B2;
                    List B3;
                    List B4;
                    List B5;
                    List B6;
                    List B7;
                    List B8;
                    List B9;
                    List B10;
                    List B11;
                    List B12;
                    List B13;
                    List B14;
                    List B15;
                    List B16;
                    switch (i12) {
                        case 0:
                            InterfaceC0175i interfaceC0175i2 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            kotlin.jvm.internal.i.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            kotlin.jvm.internal.i.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            kotlin.jvm.internal.i.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0175i2.e(str2, str3, (C0176j) obj4);
                                B2 = AbstractC0083a.m(null);
                            } catch (Throwable th) {
                                B2 = AbstractC0253j.B(th.getClass().getSimpleName(), th.toString(), C1.a.j("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                            }
                            eVar.f(B2);
                            break;
                        case 1:
                            InterfaceC0175i interfaceC0175i3 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.i.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.i.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            kotlin.jvm.internal.i.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0175i3.f(str4, list3, (C0176j) obj7);
                                B3 = AbstractC0083a.m(null);
                            } catch (Throwable th2) {
                                B3 = AbstractC0253j.B(th2.getClass().getSimpleName(), th2.toString(), C1.a.j("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                            }
                            eVar.f(B3);
                            break;
                        case 2:
                            InterfaceC0175i interfaceC0175i4 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            kotlin.jvm.internal.i.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            kotlin.jvm.internal.i.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B4 = AbstractC0083a.m(interfaceC0175i4.n(str5, (C0176j) obj9));
                            } catch (Throwable th3) {
                                B4 = AbstractC0253j.B(th3.getClass().getSimpleName(), th3.toString(), C1.a.j("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                            }
                            eVar.f(B4);
                            break;
                        case 3:
                            InterfaceC0175i interfaceC0175i5 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            kotlin.jvm.internal.i.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            kotlin.jvm.internal.i.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B5 = AbstractC0083a.m(interfaceC0175i5.p(str6, (C0176j) obj11));
                            } catch (Throwable th4) {
                                B5 = AbstractC0253j.B(th4.getClass().getSimpleName(), th4.toString(), C1.a.j("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                            }
                            eVar.f(B5);
                            break;
                        case 4:
                            InterfaceC0175i interfaceC0175i6 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            kotlin.jvm.internal.i.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            kotlin.jvm.internal.i.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B6 = AbstractC0083a.m(interfaceC0175i6.b(str7, (C0176j) obj13));
                            } catch (Throwable th5) {
                                B6 = AbstractC0253j.B(th5.getClass().getSimpleName(), th5.toString(), C1.a.j("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                            }
                            eVar.f(B6);
                            break;
                        case 5:
                            InterfaceC0175i interfaceC0175i7 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            kotlin.jvm.internal.i.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            kotlin.jvm.internal.i.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B7 = AbstractC0083a.m(interfaceC0175i7.c(str8, (C0176j) obj15));
                            } catch (Throwable th6) {
                                B7 = AbstractC0253j.B(th6.getClass().getSimpleName(), th6.toString(), C1.a.j("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                            }
                            eVar.f(B7);
                            break;
                        case 6:
                            InterfaceC0175i interfaceC0175i8 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            kotlin.jvm.internal.i.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            kotlin.jvm.internal.i.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            kotlin.jvm.internal.i.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0175i8.a(str9, booleanValue, (C0176j) obj18);
                                B8 = AbstractC0083a.m(null);
                            } catch (Throwable th7) {
                                B8 = AbstractC0253j.B(th7.getClass().getSimpleName(), th7.toString(), C1.a.j("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                            }
                            eVar.f(B8);
                            break;
                        case 7:
                            InterfaceC0175i interfaceC0175i9 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            kotlin.jvm.internal.i.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            kotlin.jvm.internal.i.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B9 = AbstractC0083a.m(interfaceC0175i9.d(str10, (C0176j) obj20));
                            } catch (Throwable th8) {
                                B9 = AbstractC0253j.B(th8.getClass().getSimpleName(), th8.toString(), C1.a.j("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                            }
                            eVar.f(B9);
                            break;
                        case 8:
                            InterfaceC0175i interfaceC0175i10 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            kotlin.jvm.internal.i.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            kotlin.jvm.internal.i.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B10 = AbstractC0083a.m(interfaceC0175i10.h(str11, (C0176j) obj22));
                            } catch (Throwable th9) {
                                B10 = AbstractC0253j.B(th9.getClass().getSimpleName(), th9.toString(), C1.a.j("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                            }
                            eVar.f(B10);
                            break;
                        case 9:
                            InterfaceC0175i interfaceC0175i11 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            kotlin.jvm.internal.i.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0175i11.k(list12, (C0176j) obj23);
                                B11 = AbstractC0083a.m(null);
                            } catch (Throwable th10) {
                                B11 = AbstractC0253j.B(th10.getClass().getSimpleName(), th10.toString(), C1.a.j("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                            }
                            eVar.f(B11);
                            break;
                        case 10:
                            InterfaceC0175i interfaceC0175i12 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            kotlin.jvm.internal.i.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B12 = AbstractC0083a.m(interfaceC0175i12.m(list14, (C0176j) obj24));
                            } catch (Throwable th11) {
                                B12 = AbstractC0253j.B(th11.getClass().getSimpleName(), th11.toString(), C1.a.j("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                            }
                            eVar.f(B12);
                            break;
                        case 11:
                            InterfaceC0175i interfaceC0175i13 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            kotlin.jvm.internal.i.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B13 = AbstractC0083a.m(interfaceC0175i13.l(list16, (C0176j) obj25));
                            } catch (Throwable th12) {
                                B13 = AbstractC0253j.B(th12.getClass().getSimpleName(), th12.toString(), C1.a.j("Cause: ", th12.getCause(), ", Stacktrace: ", Log.getStackTraceString(th12)));
                            }
                            eVar.f(B13);
                            break;
                        case 12:
                            InterfaceC0175i interfaceC0175i14 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            kotlin.jvm.internal.i.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            kotlin.jvm.internal.i.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            kotlin.jvm.internal.i.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0175i14.j(str12, str13, (C0176j) obj28);
                                B14 = AbstractC0083a.m(null);
                            } catch (Throwable th13) {
                                B14 = AbstractC0253j.B(th13.getClass().getSimpleName(), th13.toString(), C1.a.j("Cause: ", th13.getCause(), ", Stacktrace: ", Log.getStackTraceString(th13)));
                            }
                            eVar.f(B14);
                            break;
                        case 13:
                            InterfaceC0175i interfaceC0175i15 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            kotlin.jvm.internal.i.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            kotlin.jvm.internal.i.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            kotlin.jvm.internal.i.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0175i15.q(str14, longValue, (C0176j) obj31);
                                B15 = AbstractC0083a.m(null);
                            } catch (Throwable th14) {
                                B15 = AbstractC0253j.B(th14.getClass().getSimpleName(), th14.toString(), C1.a.j("Cause: ", th14.getCause(), ", Stacktrace: ", Log.getStackTraceString(th14)));
                            }
                            eVar.f(B15);
                            break;
                        default:
                            InterfaceC0175i interfaceC0175i16 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            kotlin.jvm.internal.i.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            kotlin.jvm.internal.i.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            kotlin.jvm.internal.i.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0175i16.g(str15, doubleValue, (C0176j) obj34);
                                B16 = AbstractC0083a.m(null);
                            } catch (Throwable th15) {
                                B16 = AbstractC0253j.B(th15.getClass().getSimpleName(), th15.toString(), C1.a.j("Cause: ", th15.getCause(), ", Stacktrace: ", Log.getStackTraceString(th15)));
                            }
                            eVar.f(B16);
                            break;
                    }
                }
            });
        } else {
            c0038n11.h(null);
        }
        C0038n c0038n12 = new C0038n(binaryMessenger, C1.a.i("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getStringList", concat), a(), e2);
        if (interfaceC0175i != null) {
            final int i13 = 8;
            c0038n12.h(new InterfaceC0086b() { // from class: f1.g
                @Override // a1.InterfaceC0086b
                public final void g(Object obj, x0.e eVar) {
                    List B2;
                    List B3;
                    List B4;
                    List B5;
                    List B6;
                    List B7;
                    List B8;
                    List B9;
                    List B10;
                    List B11;
                    List B12;
                    List B13;
                    List B14;
                    List B15;
                    List B16;
                    switch (i13) {
                        case 0:
                            InterfaceC0175i interfaceC0175i2 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            kotlin.jvm.internal.i.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            kotlin.jvm.internal.i.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            kotlin.jvm.internal.i.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0175i2.e(str2, str3, (C0176j) obj4);
                                B2 = AbstractC0083a.m(null);
                            } catch (Throwable th) {
                                B2 = AbstractC0253j.B(th.getClass().getSimpleName(), th.toString(), C1.a.j("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                            }
                            eVar.f(B2);
                            break;
                        case 1:
                            InterfaceC0175i interfaceC0175i3 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.i.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.i.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            kotlin.jvm.internal.i.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0175i3.f(str4, list3, (C0176j) obj7);
                                B3 = AbstractC0083a.m(null);
                            } catch (Throwable th2) {
                                B3 = AbstractC0253j.B(th2.getClass().getSimpleName(), th2.toString(), C1.a.j("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                            }
                            eVar.f(B3);
                            break;
                        case 2:
                            InterfaceC0175i interfaceC0175i4 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            kotlin.jvm.internal.i.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            kotlin.jvm.internal.i.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B4 = AbstractC0083a.m(interfaceC0175i4.n(str5, (C0176j) obj9));
                            } catch (Throwable th3) {
                                B4 = AbstractC0253j.B(th3.getClass().getSimpleName(), th3.toString(), C1.a.j("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                            }
                            eVar.f(B4);
                            break;
                        case 3:
                            InterfaceC0175i interfaceC0175i5 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            kotlin.jvm.internal.i.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            kotlin.jvm.internal.i.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B5 = AbstractC0083a.m(interfaceC0175i5.p(str6, (C0176j) obj11));
                            } catch (Throwable th4) {
                                B5 = AbstractC0253j.B(th4.getClass().getSimpleName(), th4.toString(), C1.a.j("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                            }
                            eVar.f(B5);
                            break;
                        case 4:
                            InterfaceC0175i interfaceC0175i6 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            kotlin.jvm.internal.i.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            kotlin.jvm.internal.i.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B6 = AbstractC0083a.m(interfaceC0175i6.b(str7, (C0176j) obj13));
                            } catch (Throwable th5) {
                                B6 = AbstractC0253j.B(th5.getClass().getSimpleName(), th5.toString(), C1.a.j("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                            }
                            eVar.f(B6);
                            break;
                        case 5:
                            InterfaceC0175i interfaceC0175i7 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            kotlin.jvm.internal.i.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            kotlin.jvm.internal.i.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B7 = AbstractC0083a.m(interfaceC0175i7.c(str8, (C0176j) obj15));
                            } catch (Throwable th6) {
                                B7 = AbstractC0253j.B(th6.getClass().getSimpleName(), th6.toString(), C1.a.j("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                            }
                            eVar.f(B7);
                            break;
                        case 6:
                            InterfaceC0175i interfaceC0175i8 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            kotlin.jvm.internal.i.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            kotlin.jvm.internal.i.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            kotlin.jvm.internal.i.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0175i8.a(str9, booleanValue, (C0176j) obj18);
                                B8 = AbstractC0083a.m(null);
                            } catch (Throwable th7) {
                                B8 = AbstractC0253j.B(th7.getClass().getSimpleName(), th7.toString(), C1.a.j("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                            }
                            eVar.f(B8);
                            break;
                        case 7:
                            InterfaceC0175i interfaceC0175i9 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            kotlin.jvm.internal.i.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            kotlin.jvm.internal.i.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B9 = AbstractC0083a.m(interfaceC0175i9.d(str10, (C0176j) obj20));
                            } catch (Throwable th8) {
                                B9 = AbstractC0253j.B(th8.getClass().getSimpleName(), th8.toString(), C1.a.j("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                            }
                            eVar.f(B9);
                            break;
                        case 8:
                            InterfaceC0175i interfaceC0175i10 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            kotlin.jvm.internal.i.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            kotlin.jvm.internal.i.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B10 = AbstractC0083a.m(interfaceC0175i10.h(str11, (C0176j) obj22));
                            } catch (Throwable th9) {
                                B10 = AbstractC0253j.B(th9.getClass().getSimpleName(), th9.toString(), C1.a.j("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                            }
                            eVar.f(B10);
                            break;
                        case 9:
                            InterfaceC0175i interfaceC0175i11 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            kotlin.jvm.internal.i.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0175i11.k(list12, (C0176j) obj23);
                                B11 = AbstractC0083a.m(null);
                            } catch (Throwable th10) {
                                B11 = AbstractC0253j.B(th10.getClass().getSimpleName(), th10.toString(), C1.a.j("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                            }
                            eVar.f(B11);
                            break;
                        case 10:
                            InterfaceC0175i interfaceC0175i12 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            kotlin.jvm.internal.i.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B12 = AbstractC0083a.m(interfaceC0175i12.m(list14, (C0176j) obj24));
                            } catch (Throwable th11) {
                                B12 = AbstractC0253j.B(th11.getClass().getSimpleName(), th11.toString(), C1.a.j("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                            }
                            eVar.f(B12);
                            break;
                        case 11:
                            InterfaceC0175i interfaceC0175i13 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            kotlin.jvm.internal.i.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B13 = AbstractC0083a.m(interfaceC0175i13.l(list16, (C0176j) obj25));
                            } catch (Throwable th12) {
                                B13 = AbstractC0253j.B(th12.getClass().getSimpleName(), th12.toString(), C1.a.j("Cause: ", th12.getCause(), ", Stacktrace: ", Log.getStackTraceString(th12)));
                            }
                            eVar.f(B13);
                            break;
                        case 12:
                            InterfaceC0175i interfaceC0175i14 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            kotlin.jvm.internal.i.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            kotlin.jvm.internal.i.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            kotlin.jvm.internal.i.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0175i14.j(str12, str13, (C0176j) obj28);
                                B14 = AbstractC0083a.m(null);
                            } catch (Throwable th13) {
                                B14 = AbstractC0253j.B(th13.getClass().getSimpleName(), th13.toString(), C1.a.j("Cause: ", th13.getCause(), ", Stacktrace: ", Log.getStackTraceString(th13)));
                            }
                            eVar.f(B14);
                            break;
                        case 13:
                            InterfaceC0175i interfaceC0175i15 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            kotlin.jvm.internal.i.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            kotlin.jvm.internal.i.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            kotlin.jvm.internal.i.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0175i15.q(str14, longValue, (C0176j) obj31);
                                B15 = AbstractC0083a.m(null);
                            } catch (Throwable th14) {
                                B15 = AbstractC0253j.B(th14.getClass().getSimpleName(), th14.toString(), C1.a.j("Cause: ", th14.getCause(), ", Stacktrace: ", Log.getStackTraceString(th14)));
                            }
                            eVar.f(B15);
                            break;
                        default:
                            InterfaceC0175i interfaceC0175i16 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            kotlin.jvm.internal.i.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            kotlin.jvm.internal.i.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            kotlin.jvm.internal.i.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0175i16.g(str15, doubleValue, (C0176j) obj34);
                                B16 = AbstractC0083a.m(null);
                            } catch (Throwable th15) {
                                B16 = AbstractC0253j.B(th15.getClass().getSimpleName(), th15.toString(), C1.a.j("Cause: ", th15.getCause(), ", Stacktrace: ", Log.getStackTraceString(th15)));
                            }
                            eVar.f(B16);
                            break;
                    }
                }
            });
        } else {
            c0038n12.h(null);
        }
        C0038n c0038n13 = new C0038n(binaryMessenger, C1.a.i("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.clear", concat), a(), e2);
        if (interfaceC0175i != null) {
            final int i14 = 9;
            c0038n13.h(new InterfaceC0086b() { // from class: f1.g
                @Override // a1.InterfaceC0086b
                public final void g(Object obj, x0.e eVar) {
                    List B2;
                    List B3;
                    List B4;
                    List B5;
                    List B6;
                    List B7;
                    List B8;
                    List B9;
                    List B10;
                    List B11;
                    List B12;
                    List B13;
                    List B14;
                    List B15;
                    List B16;
                    switch (i14) {
                        case 0:
                            InterfaceC0175i interfaceC0175i2 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            kotlin.jvm.internal.i.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            kotlin.jvm.internal.i.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            kotlin.jvm.internal.i.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0175i2.e(str2, str3, (C0176j) obj4);
                                B2 = AbstractC0083a.m(null);
                            } catch (Throwable th) {
                                B2 = AbstractC0253j.B(th.getClass().getSimpleName(), th.toString(), C1.a.j("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                            }
                            eVar.f(B2);
                            break;
                        case 1:
                            InterfaceC0175i interfaceC0175i3 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.i.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.i.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            kotlin.jvm.internal.i.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0175i3.f(str4, list3, (C0176j) obj7);
                                B3 = AbstractC0083a.m(null);
                            } catch (Throwable th2) {
                                B3 = AbstractC0253j.B(th2.getClass().getSimpleName(), th2.toString(), C1.a.j("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                            }
                            eVar.f(B3);
                            break;
                        case 2:
                            InterfaceC0175i interfaceC0175i4 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            kotlin.jvm.internal.i.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            kotlin.jvm.internal.i.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B4 = AbstractC0083a.m(interfaceC0175i4.n(str5, (C0176j) obj9));
                            } catch (Throwable th3) {
                                B4 = AbstractC0253j.B(th3.getClass().getSimpleName(), th3.toString(), C1.a.j("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                            }
                            eVar.f(B4);
                            break;
                        case 3:
                            InterfaceC0175i interfaceC0175i5 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            kotlin.jvm.internal.i.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            kotlin.jvm.internal.i.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B5 = AbstractC0083a.m(interfaceC0175i5.p(str6, (C0176j) obj11));
                            } catch (Throwable th4) {
                                B5 = AbstractC0253j.B(th4.getClass().getSimpleName(), th4.toString(), C1.a.j("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                            }
                            eVar.f(B5);
                            break;
                        case 4:
                            InterfaceC0175i interfaceC0175i6 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            kotlin.jvm.internal.i.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            kotlin.jvm.internal.i.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B6 = AbstractC0083a.m(interfaceC0175i6.b(str7, (C0176j) obj13));
                            } catch (Throwable th5) {
                                B6 = AbstractC0253j.B(th5.getClass().getSimpleName(), th5.toString(), C1.a.j("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                            }
                            eVar.f(B6);
                            break;
                        case 5:
                            InterfaceC0175i interfaceC0175i7 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            kotlin.jvm.internal.i.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            kotlin.jvm.internal.i.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B7 = AbstractC0083a.m(interfaceC0175i7.c(str8, (C0176j) obj15));
                            } catch (Throwable th6) {
                                B7 = AbstractC0253j.B(th6.getClass().getSimpleName(), th6.toString(), C1.a.j("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                            }
                            eVar.f(B7);
                            break;
                        case 6:
                            InterfaceC0175i interfaceC0175i8 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            kotlin.jvm.internal.i.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            kotlin.jvm.internal.i.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            kotlin.jvm.internal.i.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0175i8.a(str9, booleanValue, (C0176j) obj18);
                                B8 = AbstractC0083a.m(null);
                            } catch (Throwable th7) {
                                B8 = AbstractC0253j.B(th7.getClass().getSimpleName(), th7.toString(), C1.a.j("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                            }
                            eVar.f(B8);
                            break;
                        case 7:
                            InterfaceC0175i interfaceC0175i9 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            kotlin.jvm.internal.i.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            kotlin.jvm.internal.i.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B9 = AbstractC0083a.m(interfaceC0175i9.d(str10, (C0176j) obj20));
                            } catch (Throwable th8) {
                                B9 = AbstractC0253j.B(th8.getClass().getSimpleName(), th8.toString(), C1.a.j("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                            }
                            eVar.f(B9);
                            break;
                        case 8:
                            InterfaceC0175i interfaceC0175i10 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            kotlin.jvm.internal.i.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            kotlin.jvm.internal.i.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B10 = AbstractC0083a.m(interfaceC0175i10.h(str11, (C0176j) obj22));
                            } catch (Throwable th9) {
                                B10 = AbstractC0253j.B(th9.getClass().getSimpleName(), th9.toString(), C1.a.j("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                            }
                            eVar.f(B10);
                            break;
                        case 9:
                            InterfaceC0175i interfaceC0175i11 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            kotlin.jvm.internal.i.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0175i11.k(list12, (C0176j) obj23);
                                B11 = AbstractC0083a.m(null);
                            } catch (Throwable th10) {
                                B11 = AbstractC0253j.B(th10.getClass().getSimpleName(), th10.toString(), C1.a.j("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                            }
                            eVar.f(B11);
                            break;
                        case 10:
                            InterfaceC0175i interfaceC0175i12 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            kotlin.jvm.internal.i.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B12 = AbstractC0083a.m(interfaceC0175i12.m(list14, (C0176j) obj24));
                            } catch (Throwable th11) {
                                B12 = AbstractC0253j.B(th11.getClass().getSimpleName(), th11.toString(), C1.a.j("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                            }
                            eVar.f(B12);
                            break;
                        case 11:
                            InterfaceC0175i interfaceC0175i13 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            kotlin.jvm.internal.i.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B13 = AbstractC0083a.m(interfaceC0175i13.l(list16, (C0176j) obj25));
                            } catch (Throwable th12) {
                                B13 = AbstractC0253j.B(th12.getClass().getSimpleName(), th12.toString(), C1.a.j("Cause: ", th12.getCause(), ", Stacktrace: ", Log.getStackTraceString(th12)));
                            }
                            eVar.f(B13);
                            break;
                        case 12:
                            InterfaceC0175i interfaceC0175i14 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            kotlin.jvm.internal.i.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            kotlin.jvm.internal.i.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            kotlin.jvm.internal.i.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0175i14.j(str12, str13, (C0176j) obj28);
                                B14 = AbstractC0083a.m(null);
                            } catch (Throwable th13) {
                                B14 = AbstractC0253j.B(th13.getClass().getSimpleName(), th13.toString(), C1.a.j("Cause: ", th13.getCause(), ", Stacktrace: ", Log.getStackTraceString(th13)));
                            }
                            eVar.f(B14);
                            break;
                        case 13:
                            InterfaceC0175i interfaceC0175i15 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            kotlin.jvm.internal.i.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            kotlin.jvm.internal.i.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            kotlin.jvm.internal.i.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0175i15.q(str14, longValue, (C0176j) obj31);
                                B15 = AbstractC0083a.m(null);
                            } catch (Throwable th14) {
                                B15 = AbstractC0253j.B(th14.getClass().getSimpleName(), th14.toString(), C1.a.j("Cause: ", th14.getCause(), ", Stacktrace: ", Log.getStackTraceString(th14)));
                            }
                            eVar.f(B15);
                            break;
                        default:
                            InterfaceC0175i interfaceC0175i16 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            kotlin.jvm.internal.i.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            kotlin.jvm.internal.i.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            kotlin.jvm.internal.i.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0175i16.g(str15, doubleValue, (C0176j) obj34);
                                B16 = AbstractC0083a.m(null);
                            } catch (Throwable th15) {
                                B16 = AbstractC0253j.B(th15.getClass().getSimpleName(), th15.toString(), C1.a.j("Cause: ", th15.getCause(), ", Stacktrace: ", Log.getStackTraceString(th15)));
                            }
                            eVar.f(B16);
                            break;
                    }
                }
            });
        } else {
            c0038n13.h(null);
        }
        C0038n c0038n14 = new C0038n(binaryMessenger, C1.a.i("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getAll", concat), a(), e2);
        if (interfaceC0175i != null) {
            final int i15 = 10;
            c0038n14.h(new InterfaceC0086b() { // from class: f1.g
                @Override // a1.InterfaceC0086b
                public final void g(Object obj, x0.e eVar) {
                    List B2;
                    List B3;
                    List B4;
                    List B5;
                    List B6;
                    List B7;
                    List B8;
                    List B9;
                    List B10;
                    List B11;
                    List B12;
                    List B13;
                    List B14;
                    List B15;
                    List B16;
                    switch (i15) {
                        case 0:
                            InterfaceC0175i interfaceC0175i2 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            kotlin.jvm.internal.i.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            kotlin.jvm.internal.i.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            kotlin.jvm.internal.i.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0175i2.e(str2, str3, (C0176j) obj4);
                                B2 = AbstractC0083a.m(null);
                            } catch (Throwable th) {
                                B2 = AbstractC0253j.B(th.getClass().getSimpleName(), th.toString(), C1.a.j("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                            }
                            eVar.f(B2);
                            break;
                        case 1:
                            InterfaceC0175i interfaceC0175i3 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.i.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.i.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            kotlin.jvm.internal.i.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0175i3.f(str4, list3, (C0176j) obj7);
                                B3 = AbstractC0083a.m(null);
                            } catch (Throwable th2) {
                                B3 = AbstractC0253j.B(th2.getClass().getSimpleName(), th2.toString(), C1.a.j("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                            }
                            eVar.f(B3);
                            break;
                        case 2:
                            InterfaceC0175i interfaceC0175i4 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            kotlin.jvm.internal.i.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            kotlin.jvm.internal.i.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B4 = AbstractC0083a.m(interfaceC0175i4.n(str5, (C0176j) obj9));
                            } catch (Throwable th3) {
                                B4 = AbstractC0253j.B(th3.getClass().getSimpleName(), th3.toString(), C1.a.j("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                            }
                            eVar.f(B4);
                            break;
                        case 3:
                            InterfaceC0175i interfaceC0175i5 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            kotlin.jvm.internal.i.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            kotlin.jvm.internal.i.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B5 = AbstractC0083a.m(interfaceC0175i5.p(str6, (C0176j) obj11));
                            } catch (Throwable th4) {
                                B5 = AbstractC0253j.B(th4.getClass().getSimpleName(), th4.toString(), C1.a.j("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                            }
                            eVar.f(B5);
                            break;
                        case 4:
                            InterfaceC0175i interfaceC0175i6 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            kotlin.jvm.internal.i.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            kotlin.jvm.internal.i.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B6 = AbstractC0083a.m(interfaceC0175i6.b(str7, (C0176j) obj13));
                            } catch (Throwable th5) {
                                B6 = AbstractC0253j.B(th5.getClass().getSimpleName(), th5.toString(), C1.a.j("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                            }
                            eVar.f(B6);
                            break;
                        case 5:
                            InterfaceC0175i interfaceC0175i7 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            kotlin.jvm.internal.i.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            kotlin.jvm.internal.i.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B7 = AbstractC0083a.m(interfaceC0175i7.c(str8, (C0176j) obj15));
                            } catch (Throwable th6) {
                                B7 = AbstractC0253j.B(th6.getClass().getSimpleName(), th6.toString(), C1.a.j("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                            }
                            eVar.f(B7);
                            break;
                        case 6:
                            InterfaceC0175i interfaceC0175i8 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            kotlin.jvm.internal.i.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            kotlin.jvm.internal.i.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            kotlin.jvm.internal.i.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0175i8.a(str9, booleanValue, (C0176j) obj18);
                                B8 = AbstractC0083a.m(null);
                            } catch (Throwable th7) {
                                B8 = AbstractC0253j.B(th7.getClass().getSimpleName(), th7.toString(), C1.a.j("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                            }
                            eVar.f(B8);
                            break;
                        case 7:
                            InterfaceC0175i interfaceC0175i9 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            kotlin.jvm.internal.i.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            kotlin.jvm.internal.i.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B9 = AbstractC0083a.m(interfaceC0175i9.d(str10, (C0176j) obj20));
                            } catch (Throwable th8) {
                                B9 = AbstractC0253j.B(th8.getClass().getSimpleName(), th8.toString(), C1.a.j("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                            }
                            eVar.f(B9);
                            break;
                        case 8:
                            InterfaceC0175i interfaceC0175i10 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            kotlin.jvm.internal.i.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            kotlin.jvm.internal.i.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B10 = AbstractC0083a.m(interfaceC0175i10.h(str11, (C0176j) obj22));
                            } catch (Throwable th9) {
                                B10 = AbstractC0253j.B(th9.getClass().getSimpleName(), th9.toString(), C1.a.j("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                            }
                            eVar.f(B10);
                            break;
                        case 9:
                            InterfaceC0175i interfaceC0175i11 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            kotlin.jvm.internal.i.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0175i11.k(list12, (C0176j) obj23);
                                B11 = AbstractC0083a.m(null);
                            } catch (Throwable th10) {
                                B11 = AbstractC0253j.B(th10.getClass().getSimpleName(), th10.toString(), C1.a.j("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                            }
                            eVar.f(B11);
                            break;
                        case 10:
                            InterfaceC0175i interfaceC0175i12 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            kotlin.jvm.internal.i.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B12 = AbstractC0083a.m(interfaceC0175i12.m(list14, (C0176j) obj24));
                            } catch (Throwable th11) {
                                B12 = AbstractC0253j.B(th11.getClass().getSimpleName(), th11.toString(), C1.a.j("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                            }
                            eVar.f(B12);
                            break;
                        case 11:
                            InterfaceC0175i interfaceC0175i13 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            kotlin.jvm.internal.i.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B13 = AbstractC0083a.m(interfaceC0175i13.l(list16, (C0176j) obj25));
                            } catch (Throwable th12) {
                                B13 = AbstractC0253j.B(th12.getClass().getSimpleName(), th12.toString(), C1.a.j("Cause: ", th12.getCause(), ", Stacktrace: ", Log.getStackTraceString(th12)));
                            }
                            eVar.f(B13);
                            break;
                        case 12:
                            InterfaceC0175i interfaceC0175i14 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            kotlin.jvm.internal.i.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            kotlin.jvm.internal.i.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            kotlin.jvm.internal.i.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0175i14.j(str12, str13, (C0176j) obj28);
                                B14 = AbstractC0083a.m(null);
                            } catch (Throwable th13) {
                                B14 = AbstractC0253j.B(th13.getClass().getSimpleName(), th13.toString(), C1.a.j("Cause: ", th13.getCause(), ", Stacktrace: ", Log.getStackTraceString(th13)));
                            }
                            eVar.f(B14);
                            break;
                        case 13:
                            InterfaceC0175i interfaceC0175i15 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            kotlin.jvm.internal.i.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            kotlin.jvm.internal.i.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            kotlin.jvm.internal.i.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0175i15.q(str14, longValue, (C0176j) obj31);
                                B15 = AbstractC0083a.m(null);
                            } catch (Throwable th14) {
                                B15 = AbstractC0253j.B(th14.getClass().getSimpleName(), th14.toString(), C1.a.j("Cause: ", th14.getCause(), ", Stacktrace: ", Log.getStackTraceString(th14)));
                            }
                            eVar.f(B15);
                            break;
                        default:
                            InterfaceC0175i interfaceC0175i16 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            kotlin.jvm.internal.i.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            kotlin.jvm.internal.i.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            kotlin.jvm.internal.i.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0175i16.g(str15, doubleValue, (C0176j) obj34);
                                B16 = AbstractC0083a.m(null);
                            } catch (Throwable th15) {
                                B16 = AbstractC0253j.B(th15.getClass().getSimpleName(), th15.toString(), C1.a.j("Cause: ", th15.getCause(), ", Stacktrace: ", Log.getStackTraceString(th15)));
                            }
                            eVar.f(B16);
                            break;
                    }
                }
            });
        } else {
            c0038n14.h(null);
        }
        C0038n c0038n15 = new C0038n(binaryMessenger, C1.a.i("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getKeys", concat), a(), e2);
        if (interfaceC0175i == null) {
            c0038n15.h(null);
        } else {
            final int i16 = 11;
            c0038n15.h(new InterfaceC0086b() { // from class: f1.g
                @Override // a1.InterfaceC0086b
                public final void g(Object obj, x0.e eVar) {
                    List B2;
                    List B3;
                    List B4;
                    List B5;
                    List B6;
                    List B7;
                    List B8;
                    List B9;
                    List B10;
                    List B11;
                    List B12;
                    List B13;
                    List B14;
                    List B15;
                    List B16;
                    switch (i16) {
                        case 0:
                            InterfaceC0175i interfaceC0175i2 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            kotlin.jvm.internal.i.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            kotlin.jvm.internal.i.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            kotlin.jvm.internal.i.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0175i2.e(str2, str3, (C0176j) obj4);
                                B2 = AbstractC0083a.m(null);
                            } catch (Throwable th) {
                                B2 = AbstractC0253j.B(th.getClass().getSimpleName(), th.toString(), C1.a.j("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                            }
                            eVar.f(B2);
                            break;
                        case 1:
                            InterfaceC0175i interfaceC0175i3 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.i.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.i.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            kotlin.jvm.internal.i.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0175i3.f(str4, list3, (C0176j) obj7);
                                B3 = AbstractC0083a.m(null);
                            } catch (Throwable th2) {
                                B3 = AbstractC0253j.B(th2.getClass().getSimpleName(), th2.toString(), C1.a.j("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                            }
                            eVar.f(B3);
                            break;
                        case 2:
                            InterfaceC0175i interfaceC0175i4 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            kotlin.jvm.internal.i.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            kotlin.jvm.internal.i.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B4 = AbstractC0083a.m(interfaceC0175i4.n(str5, (C0176j) obj9));
                            } catch (Throwable th3) {
                                B4 = AbstractC0253j.B(th3.getClass().getSimpleName(), th3.toString(), C1.a.j("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                            }
                            eVar.f(B4);
                            break;
                        case 3:
                            InterfaceC0175i interfaceC0175i5 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            kotlin.jvm.internal.i.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            kotlin.jvm.internal.i.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B5 = AbstractC0083a.m(interfaceC0175i5.p(str6, (C0176j) obj11));
                            } catch (Throwable th4) {
                                B5 = AbstractC0253j.B(th4.getClass().getSimpleName(), th4.toString(), C1.a.j("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                            }
                            eVar.f(B5);
                            break;
                        case 4:
                            InterfaceC0175i interfaceC0175i6 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            kotlin.jvm.internal.i.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            kotlin.jvm.internal.i.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B6 = AbstractC0083a.m(interfaceC0175i6.b(str7, (C0176j) obj13));
                            } catch (Throwable th5) {
                                B6 = AbstractC0253j.B(th5.getClass().getSimpleName(), th5.toString(), C1.a.j("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                            }
                            eVar.f(B6);
                            break;
                        case 5:
                            InterfaceC0175i interfaceC0175i7 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            kotlin.jvm.internal.i.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            kotlin.jvm.internal.i.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B7 = AbstractC0083a.m(interfaceC0175i7.c(str8, (C0176j) obj15));
                            } catch (Throwable th6) {
                                B7 = AbstractC0253j.B(th6.getClass().getSimpleName(), th6.toString(), C1.a.j("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                            }
                            eVar.f(B7);
                            break;
                        case 6:
                            InterfaceC0175i interfaceC0175i8 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            kotlin.jvm.internal.i.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            kotlin.jvm.internal.i.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            kotlin.jvm.internal.i.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0175i8.a(str9, booleanValue, (C0176j) obj18);
                                B8 = AbstractC0083a.m(null);
                            } catch (Throwable th7) {
                                B8 = AbstractC0253j.B(th7.getClass().getSimpleName(), th7.toString(), C1.a.j("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                            }
                            eVar.f(B8);
                            break;
                        case 7:
                            InterfaceC0175i interfaceC0175i9 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            kotlin.jvm.internal.i.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            kotlin.jvm.internal.i.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B9 = AbstractC0083a.m(interfaceC0175i9.d(str10, (C0176j) obj20));
                            } catch (Throwable th8) {
                                B9 = AbstractC0253j.B(th8.getClass().getSimpleName(), th8.toString(), C1.a.j("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                            }
                            eVar.f(B9);
                            break;
                        case 8:
                            InterfaceC0175i interfaceC0175i10 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            kotlin.jvm.internal.i.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            kotlin.jvm.internal.i.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B10 = AbstractC0083a.m(interfaceC0175i10.h(str11, (C0176j) obj22));
                            } catch (Throwable th9) {
                                B10 = AbstractC0253j.B(th9.getClass().getSimpleName(), th9.toString(), C1.a.j("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                            }
                            eVar.f(B10);
                            break;
                        case 9:
                            InterfaceC0175i interfaceC0175i11 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            kotlin.jvm.internal.i.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0175i11.k(list12, (C0176j) obj23);
                                B11 = AbstractC0083a.m(null);
                            } catch (Throwable th10) {
                                B11 = AbstractC0253j.B(th10.getClass().getSimpleName(), th10.toString(), C1.a.j("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                            }
                            eVar.f(B11);
                            break;
                        case 10:
                            InterfaceC0175i interfaceC0175i12 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            kotlin.jvm.internal.i.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B12 = AbstractC0083a.m(interfaceC0175i12.m(list14, (C0176j) obj24));
                            } catch (Throwable th11) {
                                B12 = AbstractC0253j.B(th11.getClass().getSimpleName(), th11.toString(), C1.a.j("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                            }
                            eVar.f(B12);
                            break;
                        case 11:
                            InterfaceC0175i interfaceC0175i13 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            kotlin.jvm.internal.i.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                B13 = AbstractC0083a.m(interfaceC0175i13.l(list16, (C0176j) obj25));
                            } catch (Throwable th12) {
                                B13 = AbstractC0253j.B(th12.getClass().getSimpleName(), th12.toString(), C1.a.j("Cause: ", th12.getCause(), ", Stacktrace: ", Log.getStackTraceString(th12)));
                            }
                            eVar.f(B13);
                            break;
                        case 12:
                            InterfaceC0175i interfaceC0175i14 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            kotlin.jvm.internal.i.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            kotlin.jvm.internal.i.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            kotlin.jvm.internal.i.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0175i14.j(str12, str13, (C0176j) obj28);
                                B14 = AbstractC0083a.m(null);
                            } catch (Throwable th13) {
                                B14 = AbstractC0253j.B(th13.getClass().getSimpleName(), th13.toString(), C1.a.j("Cause: ", th13.getCause(), ", Stacktrace: ", Log.getStackTraceString(th13)));
                            }
                            eVar.f(B14);
                            break;
                        case 13:
                            InterfaceC0175i interfaceC0175i15 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            kotlin.jvm.internal.i.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            kotlin.jvm.internal.i.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            kotlin.jvm.internal.i.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0175i15.q(str14, longValue, (C0176j) obj31);
                                B15 = AbstractC0083a.m(null);
                            } catch (Throwable th14) {
                                B15 = AbstractC0253j.B(th14.getClass().getSimpleName(), th14.toString(), C1.a.j("Cause: ", th14.getCause(), ", Stacktrace: ", Log.getStackTraceString(th14)));
                            }
                            eVar.f(B15);
                            break;
                        default:
                            InterfaceC0175i interfaceC0175i16 = interfaceC0175i;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            kotlin.jvm.internal.i.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            kotlin.jvm.internal.i.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            kotlin.jvm.internal.i.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0175i16.g(str15, doubleValue, (C0176j) obj34);
                                B16 = AbstractC0083a.m(null);
                            } catch (Throwable th15) {
                                B16 = AbstractC0253j.B(th15.getClass().getSimpleName(), th15.toString(), C1.a.j("Cause: ", th15.getCause(), ", Stacktrace: ", Log.getStackTraceString(th15)));
                            }
                            eVar.f(B16);
                            break;
                    }
                }
            });
        }
    }
}
