package r0;

import D.C0013n;
import L.Q;
import android.util.Log;
import java.util.List;
import m0.C0211i;
import m0.InterfaceC0204b;
import m0.InterfaceC0208f;
import m0.InterfaceC0212j;

/* renamed from: r0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0244e {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ C0244e f2880a = new C0244e();

    /* renamed from: b, reason: collision with root package name */
    public static final t0.e f2881b = new t0.e(new C0243d(0));

    public static InterfaceC0212j a() {
        return (InterfaceC0212j) f2881b.a();
    }

    public static void b(InterfaceC0208f interfaceC0208f, final C0240a c0240a) {
        E0.i.e(interfaceC0208f, "binaryMessenger");
        E.a d2 = interfaceC0208f.d(new C0211i());
        C0013n c0013n = new C0013n(interfaceC0208f, E0.h.f("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.remove", ""), a(), d2);
        if (c0240a != null) {
            final int i2 = 1;
            c0013n.j(new InterfaceC0204b() { // from class: r0.c
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
                    switch (i2) {
                        case 0:
                            C0240a c0240a2 = c0240a;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            E0.i.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            try {
                                D2 = o.g.v(c0240a2.b((String) obj2, (List) list.get(1)));
                            } catch (Throwable th) {
                                D2 = u0.e.D(th.getClass().getSimpleName(), th.toString(), E0.h.g("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                            }
                            q2.e(D2);
                            break;
                        case 1:
                            C0240a c0240a3 = c0240a;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj).get(0);
                            E0.i.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            try {
                                D3 = o.g.v(Boolean.valueOf(c0240a3.f2874f.edit().remove((String) obj3).commit()));
                            } catch (Throwable th2) {
                                D3 = u0.e.D(th2.getClass().getSimpleName(), th2.toString(), E0.h.g("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                            }
                            q2.e(D3);
                            break;
                        case F.k.FLOAT_FIELD_NUMBER /* 2 */:
                            C0240a c0240a4 = c0240a;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            E0.i.c(obj4, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj4;
                            Object obj5 = list2.get(1);
                            E0.i.c(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            try {
                                D4 = o.g.v(Boolean.valueOf(c0240a4.f2874f.edit().putBoolean(str, ((Boolean) obj5).booleanValue()).commit()));
                            } catch (Throwable th3) {
                                D4 = u0.e.D(th3.getClass().getSimpleName(), th3.toString(), E0.h.g("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                            }
                            q2.e(D4);
                            break;
                        case F.k.INTEGER_FIELD_NUMBER /* 3 */:
                            C0240a c0240a5 = c0240a;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            E0.i.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj6;
                            Object obj7 = list3.get(1);
                            E0.i.c(obj7, "null cannot be cast to non-null type kotlin.String");
                            try {
                                D5 = o.g.v(Boolean.valueOf(c0240a5.d(str2, (String) obj7)));
                            } catch (Throwable th4) {
                                D5 = u0.e.D(th4.getClass().getSimpleName(), th4.toString(), E0.h.g("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                            }
                            q2.e(D5);
                            break;
                        case F.k.LONG_FIELD_NUMBER /* 4 */:
                            C0240a c0240a6 = c0240a;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            E0.i.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj8;
                            Object obj9 = list4.get(1);
                            E0.i.c(obj9, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                D6 = o.g.v(Boolean.valueOf(c0240a6.f2874f.edit().putLong(str3, ((Long) obj9).longValue()).commit()));
                            } catch (Throwable th5) {
                                D6 = u0.e.D(th5.getClass().getSimpleName(), th5.toString(), E0.h.g("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                            }
                            q2.e(D6);
                            break;
                        case F.k.STRING_FIELD_NUMBER /* 5 */:
                            C0240a c0240a7 = c0240a;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            E0.i.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj10;
                            Object obj11 = list5.get(1);
                            E0.i.c(obj11, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj11).doubleValue();
                            try {
                                c0240a7.getClass();
                                String d3 = Double.toString(doubleValue);
                                D7 = o.g.v(Boolean.valueOf(c0240a7.f2874f.edit().putString(str4, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d3).commit()));
                            } catch (Throwable th6) {
                                D7 = u0.e.D(th6.getClass().getSimpleName(), th6.toString(), E0.h.g("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                            }
                            q2.e(D7);
                            break;
                        case F.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0240a c0240a8 = c0240a;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            E0.i.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj12;
                            Object obj13 = list6.get(1);
                            E0.i.c(obj13, "null cannot be cast to non-null type kotlin.String");
                            try {
                                D8 = o.g.v(Boolean.valueOf(c0240a8.f2874f.edit().putString(str5, (String) obj13).commit()));
                            } catch (Throwable th7) {
                                D8 = u0.e.D(th7.getClass().getSimpleName(), th7.toString(), E0.h.g("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                            }
                            q2.e(D8);
                            break;
                        case F.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0240a c0240a9 = c0240a;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            E0.i.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj14;
                            Object obj15 = list7.get(1);
                            E0.i.c(obj15, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list8 = (List) obj15;
                            try {
                                D9 = o.g.v(Boolean.valueOf(c0240a9.f2874f.edit().putString(str6, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0240a9.f2875g.d(list8)).commit()));
                            } catch (Throwable th8) {
                                D9 = u0.e.D(th8.getClass().getSimpleName(), th8.toString(), E0.h.g("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                            }
                            q2.e(D9);
                            break;
                        default:
                            C0240a c0240a10 = c0240a;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj16 = list9.get(0);
                            E0.i.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            try {
                                D10 = o.g.v(Boolean.valueOf(c0240a10.a((String) obj16, (List) list9.get(1))));
                            } catch (Throwable th9) {
                                D10 = u0.e.D(th9.getClass().getSimpleName(), th9.toString(), E0.h.g("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                            }
                            q2.e(D10);
                            break;
                    }
                }
            });
        } else {
            c0013n.j(null);
        }
        C0013n c0013n2 = new C0013n(interfaceC0208f, E0.h.f("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setBool", ""), a(), d2);
        if (c0240a != null) {
            final int i3 = 2;
            c0013n2.j(new InterfaceC0204b() { // from class: r0.c
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
                    switch (i3) {
                        case 0:
                            C0240a c0240a2 = c0240a;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            E0.i.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            try {
                                D2 = o.g.v(c0240a2.b((String) obj2, (List) list.get(1)));
                            } catch (Throwable th) {
                                D2 = u0.e.D(th.getClass().getSimpleName(), th.toString(), E0.h.g("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                            }
                            q2.e(D2);
                            break;
                        case 1:
                            C0240a c0240a3 = c0240a;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj).get(0);
                            E0.i.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            try {
                                D3 = o.g.v(Boolean.valueOf(c0240a3.f2874f.edit().remove((String) obj3).commit()));
                            } catch (Throwable th2) {
                                D3 = u0.e.D(th2.getClass().getSimpleName(), th2.toString(), E0.h.g("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                            }
                            q2.e(D3);
                            break;
                        case F.k.FLOAT_FIELD_NUMBER /* 2 */:
                            C0240a c0240a4 = c0240a;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            E0.i.c(obj4, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj4;
                            Object obj5 = list2.get(1);
                            E0.i.c(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            try {
                                D4 = o.g.v(Boolean.valueOf(c0240a4.f2874f.edit().putBoolean(str, ((Boolean) obj5).booleanValue()).commit()));
                            } catch (Throwable th3) {
                                D4 = u0.e.D(th3.getClass().getSimpleName(), th3.toString(), E0.h.g("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                            }
                            q2.e(D4);
                            break;
                        case F.k.INTEGER_FIELD_NUMBER /* 3 */:
                            C0240a c0240a5 = c0240a;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            E0.i.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj6;
                            Object obj7 = list3.get(1);
                            E0.i.c(obj7, "null cannot be cast to non-null type kotlin.String");
                            try {
                                D5 = o.g.v(Boolean.valueOf(c0240a5.d(str2, (String) obj7)));
                            } catch (Throwable th4) {
                                D5 = u0.e.D(th4.getClass().getSimpleName(), th4.toString(), E0.h.g("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                            }
                            q2.e(D5);
                            break;
                        case F.k.LONG_FIELD_NUMBER /* 4 */:
                            C0240a c0240a6 = c0240a;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            E0.i.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj8;
                            Object obj9 = list4.get(1);
                            E0.i.c(obj9, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                D6 = o.g.v(Boolean.valueOf(c0240a6.f2874f.edit().putLong(str3, ((Long) obj9).longValue()).commit()));
                            } catch (Throwable th5) {
                                D6 = u0.e.D(th5.getClass().getSimpleName(), th5.toString(), E0.h.g("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                            }
                            q2.e(D6);
                            break;
                        case F.k.STRING_FIELD_NUMBER /* 5 */:
                            C0240a c0240a7 = c0240a;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            E0.i.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj10;
                            Object obj11 = list5.get(1);
                            E0.i.c(obj11, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj11).doubleValue();
                            try {
                                c0240a7.getClass();
                                String d3 = Double.toString(doubleValue);
                                D7 = o.g.v(Boolean.valueOf(c0240a7.f2874f.edit().putString(str4, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d3).commit()));
                            } catch (Throwable th6) {
                                D7 = u0.e.D(th6.getClass().getSimpleName(), th6.toString(), E0.h.g("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                            }
                            q2.e(D7);
                            break;
                        case F.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0240a c0240a8 = c0240a;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            E0.i.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj12;
                            Object obj13 = list6.get(1);
                            E0.i.c(obj13, "null cannot be cast to non-null type kotlin.String");
                            try {
                                D8 = o.g.v(Boolean.valueOf(c0240a8.f2874f.edit().putString(str5, (String) obj13).commit()));
                            } catch (Throwable th7) {
                                D8 = u0.e.D(th7.getClass().getSimpleName(), th7.toString(), E0.h.g("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                            }
                            q2.e(D8);
                            break;
                        case F.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0240a c0240a9 = c0240a;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            E0.i.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj14;
                            Object obj15 = list7.get(1);
                            E0.i.c(obj15, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list8 = (List) obj15;
                            try {
                                D9 = o.g.v(Boolean.valueOf(c0240a9.f2874f.edit().putString(str6, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0240a9.f2875g.d(list8)).commit()));
                            } catch (Throwable th8) {
                                D9 = u0.e.D(th8.getClass().getSimpleName(), th8.toString(), E0.h.g("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                            }
                            q2.e(D9);
                            break;
                        default:
                            C0240a c0240a10 = c0240a;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj16 = list9.get(0);
                            E0.i.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            try {
                                D10 = o.g.v(Boolean.valueOf(c0240a10.a((String) obj16, (List) list9.get(1))));
                            } catch (Throwable th9) {
                                D10 = u0.e.D(th9.getClass().getSimpleName(), th9.toString(), E0.h.g("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                            }
                            q2.e(D10);
                            break;
                    }
                }
            });
        } else {
            c0013n2.j(null);
        }
        C0013n c0013n3 = new C0013n(interfaceC0208f, E0.h.f("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setString", ""), a(), d2);
        if (c0240a != null) {
            final int i4 = 3;
            c0013n3.j(new InterfaceC0204b() { // from class: r0.c
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
                    switch (i4) {
                        case 0:
                            C0240a c0240a2 = c0240a;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            E0.i.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            try {
                                D2 = o.g.v(c0240a2.b((String) obj2, (List) list.get(1)));
                            } catch (Throwable th) {
                                D2 = u0.e.D(th.getClass().getSimpleName(), th.toString(), E0.h.g("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                            }
                            q2.e(D2);
                            break;
                        case 1:
                            C0240a c0240a3 = c0240a;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj).get(0);
                            E0.i.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            try {
                                D3 = o.g.v(Boolean.valueOf(c0240a3.f2874f.edit().remove((String) obj3).commit()));
                            } catch (Throwable th2) {
                                D3 = u0.e.D(th2.getClass().getSimpleName(), th2.toString(), E0.h.g("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                            }
                            q2.e(D3);
                            break;
                        case F.k.FLOAT_FIELD_NUMBER /* 2 */:
                            C0240a c0240a4 = c0240a;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            E0.i.c(obj4, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj4;
                            Object obj5 = list2.get(1);
                            E0.i.c(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            try {
                                D4 = o.g.v(Boolean.valueOf(c0240a4.f2874f.edit().putBoolean(str, ((Boolean) obj5).booleanValue()).commit()));
                            } catch (Throwable th3) {
                                D4 = u0.e.D(th3.getClass().getSimpleName(), th3.toString(), E0.h.g("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                            }
                            q2.e(D4);
                            break;
                        case F.k.INTEGER_FIELD_NUMBER /* 3 */:
                            C0240a c0240a5 = c0240a;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            E0.i.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj6;
                            Object obj7 = list3.get(1);
                            E0.i.c(obj7, "null cannot be cast to non-null type kotlin.String");
                            try {
                                D5 = o.g.v(Boolean.valueOf(c0240a5.d(str2, (String) obj7)));
                            } catch (Throwable th4) {
                                D5 = u0.e.D(th4.getClass().getSimpleName(), th4.toString(), E0.h.g("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                            }
                            q2.e(D5);
                            break;
                        case F.k.LONG_FIELD_NUMBER /* 4 */:
                            C0240a c0240a6 = c0240a;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            E0.i.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj8;
                            Object obj9 = list4.get(1);
                            E0.i.c(obj9, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                D6 = o.g.v(Boolean.valueOf(c0240a6.f2874f.edit().putLong(str3, ((Long) obj9).longValue()).commit()));
                            } catch (Throwable th5) {
                                D6 = u0.e.D(th5.getClass().getSimpleName(), th5.toString(), E0.h.g("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                            }
                            q2.e(D6);
                            break;
                        case F.k.STRING_FIELD_NUMBER /* 5 */:
                            C0240a c0240a7 = c0240a;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            E0.i.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj10;
                            Object obj11 = list5.get(1);
                            E0.i.c(obj11, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj11).doubleValue();
                            try {
                                c0240a7.getClass();
                                String d3 = Double.toString(doubleValue);
                                D7 = o.g.v(Boolean.valueOf(c0240a7.f2874f.edit().putString(str4, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d3).commit()));
                            } catch (Throwable th6) {
                                D7 = u0.e.D(th6.getClass().getSimpleName(), th6.toString(), E0.h.g("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                            }
                            q2.e(D7);
                            break;
                        case F.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0240a c0240a8 = c0240a;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            E0.i.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj12;
                            Object obj13 = list6.get(1);
                            E0.i.c(obj13, "null cannot be cast to non-null type kotlin.String");
                            try {
                                D8 = o.g.v(Boolean.valueOf(c0240a8.f2874f.edit().putString(str5, (String) obj13).commit()));
                            } catch (Throwable th7) {
                                D8 = u0.e.D(th7.getClass().getSimpleName(), th7.toString(), E0.h.g("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                            }
                            q2.e(D8);
                            break;
                        case F.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0240a c0240a9 = c0240a;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            E0.i.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj14;
                            Object obj15 = list7.get(1);
                            E0.i.c(obj15, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list8 = (List) obj15;
                            try {
                                D9 = o.g.v(Boolean.valueOf(c0240a9.f2874f.edit().putString(str6, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0240a9.f2875g.d(list8)).commit()));
                            } catch (Throwable th8) {
                                D9 = u0.e.D(th8.getClass().getSimpleName(), th8.toString(), E0.h.g("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                            }
                            q2.e(D9);
                            break;
                        default:
                            C0240a c0240a10 = c0240a;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj16 = list9.get(0);
                            E0.i.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            try {
                                D10 = o.g.v(Boolean.valueOf(c0240a10.a((String) obj16, (List) list9.get(1))));
                            } catch (Throwable th9) {
                                D10 = u0.e.D(th9.getClass().getSimpleName(), th9.toString(), E0.h.g("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                            }
                            q2.e(D10);
                            break;
                    }
                }
            });
        } else {
            c0013n3.j(null);
        }
        C0013n c0013n4 = new C0013n(interfaceC0208f, E0.h.f("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setInt", ""), a(), d2);
        if (c0240a != null) {
            final int i5 = 4;
            c0013n4.j(new InterfaceC0204b() { // from class: r0.c
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
                    switch (i5) {
                        case 0:
                            C0240a c0240a2 = c0240a;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            E0.i.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            try {
                                D2 = o.g.v(c0240a2.b((String) obj2, (List) list.get(1)));
                            } catch (Throwable th) {
                                D2 = u0.e.D(th.getClass().getSimpleName(), th.toString(), E0.h.g("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                            }
                            q2.e(D2);
                            break;
                        case 1:
                            C0240a c0240a3 = c0240a;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj).get(0);
                            E0.i.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            try {
                                D3 = o.g.v(Boolean.valueOf(c0240a3.f2874f.edit().remove((String) obj3).commit()));
                            } catch (Throwable th2) {
                                D3 = u0.e.D(th2.getClass().getSimpleName(), th2.toString(), E0.h.g("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                            }
                            q2.e(D3);
                            break;
                        case F.k.FLOAT_FIELD_NUMBER /* 2 */:
                            C0240a c0240a4 = c0240a;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            E0.i.c(obj4, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj4;
                            Object obj5 = list2.get(1);
                            E0.i.c(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            try {
                                D4 = o.g.v(Boolean.valueOf(c0240a4.f2874f.edit().putBoolean(str, ((Boolean) obj5).booleanValue()).commit()));
                            } catch (Throwable th3) {
                                D4 = u0.e.D(th3.getClass().getSimpleName(), th3.toString(), E0.h.g("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                            }
                            q2.e(D4);
                            break;
                        case F.k.INTEGER_FIELD_NUMBER /* 3 */:
                            C0240a c0240a5 = c0240a;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            E0.i.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj6;
                            Object obj7 = list3.get(1);
                            E0.i.c(obj7, "null cannot be cast to non-null type kotlin.String");
                            try {
                                D5 = o.g.v(Boolean.valueOf(c0240a5.d(str2, (String) obj7)));
                            } catch (Throwable th4) {
                                D5 = u0.e.D(th4.getClass().getSimpleName(), th4.toString(), E0.h.g("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                            }
                            q2.e(D5);
                            break;
                        case F.k.LONG_FIELD_NUMBER /* 4 */:
                            C0240a c0240a6 = c0240a;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            E0.i.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj8;
                            Object obj9 = list4.get(1);
                            E0.i.c(obj9, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                D6 = o.g.v(Boolean.valueOf(c0240a6.f2874f.edit().putLong(str3, ((Long) obj9).longValue()).commit()));
                            } catch (Throwable th5) {
                                D6 = u0.e.D(th5.getClass().getSimpleName(), th5.toString(), E0.h.g("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                            }
                            q2.e(D6);
                            break;
                        case F.k.STRING_FIELD_NUMBER /* 5 */:
                            C0240a c0240a7 = c0240a;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            E0.i.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj10;
                            Object obj11 = list5.get(1);
                            E0.i.c(obj11, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj11).doubleValue();
                            try {
                                c0240a7.getClass();
                                String d3 = Double.toString(doubleValue);
                                D7 = o.g.v(Boolean.valueOf(c0240a7.f2874f.edit().putString(str4, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d3).commit()));
                            } catch (Throwable th6) {
                                D7 = u0.e.D(th6.getClass().getSimpleName(), th6.toString(), E0.h.g("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                            }
                            q2.e(D7);
                            break;
                        case F.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0240a c0240a8 = c0240a;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            E0.i.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj12;
                            Object obj13 = list6.get(1);
                            E0.i.c(obj13, "null cannot be cast to non-null type kotlin.String");
                            try {
                                D8 = o.g.v(Boolean.valueOf(c0240a8.f2874f.edit().putString(str5, (String) obj13).commit()));
                            } catch (Throwable th7) {
                                D8 = u0.e.D(th7.getClass().getSimpleName(), th7.toString(), E0.h.g("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                            }
                            q2.e(D8);
                            break;
                        case F.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0240a c0240a9 = c0240a;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            E0.i.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj14;
                            Object obj15 = list7.get(1);
                            E0.i.c(obj15, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list8 = (List) obj15;
                            try {
                                D9 = o.g.v(Boolean.valueOf(c0240a9.f2874f.edit().putString(str6, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0240a9.f2875g.d(list8)).commit()));
                            } catch (Throwable th8) {
                                D9 = u0.e.D(th8.getClass().getSimpleName(), th8.toString(), E0.h.g("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                            }
                            q2.e(D9);
                            break;
                        default:
                            C0240a c0240a10 = c0240a;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj16 = list9.get(0);
                            E0.i.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            try {
                                D10 = o.g.v(Boolean.valueOf(c0240a10.a((String) obj16, (List) list9.get(1))));
                            } catch (Throwable th9) {
                                D10 = u0.e.D(th9.getClass().getSimpleName(), th9.toString(), E0.h.g("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                            }
                            q2.e(D10);
                            break;
                    }
                }
            });
        } else {
            c0013n4.j(null);
        }
        C0013n c0013n5 = new C0013n(interfaceC0208f, E0.h.f("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setDouble", ""), a(), d2);
        if (c0240a != null) {
            final int i6 = 5;
            c0013n5.j(new InterfaceC0204b() { // from class: r0.c
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
                    switch (i6) {
                        case 0:
                            C0240a c0240a2 = c0240a;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            E0.i.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            try {
                                D2 = o.g.v(c0240a2.b((String) obj2, (List) list.get(1)));
                            } catch (Throwable th) {
                                D2 = u0.e.D(th.getClass().getSimpleName(), th.toString(), E0.h.g("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                            }
                            q2.e(D2);
                            break;
                        case 1:
                            C0240a c0240a3 = c0240a;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj).get(0);
                            E0.i.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            try {
                                D3 = o.g.v(Boolean.valueOf(c0240a3.f2874f.edit().remove((String) obj3).commit()));
                            } catch (Throwable th2) {
                                D3 = u0.e.D(th2.getClass().getSimpleName(), th2.toString(), E0.h.g("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                            }
                            q2.e(D3);
                            break;
                        case F.k.FLOAT_FIELD_NUMBER /* 2 */:
                            C0240a c0240a4 = c0240a;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            E0.i.c(obj4, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj4;
                            Object obj5 = list2.get(1);
                            E0.i.c(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            try {
                                D4 = o.g.v(Boolean.valueOf(c0240a4.f2874f.edit().putBoolean(str, ((Boolean) obj5).booleanValue()).commit()));
                            } catch (Throwable th3) {
                                D4 = u0.e.D(th3.getClass().getSimpleName(), th3.toString(), E0.h.g("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                            }
                            q2.e(D4);
                            break;
                        case F.k.INTEGER_FIELD_NUMBER /* 3 */:
                            C0240a c0240a5 = c0240a;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            E0.i.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj6;
                            Object obj7 = list3.get(1);
                            E0.i.c(obj7, "null cannot be cast to non-null type kotlin.String");
                            try {
                                D5 = o.g.v(Boolean.valueOf(c0240a5.d(str2, (String) obj7)));
                            } catch (Throwable th4) {
                                D5 = u0.e.D(th4.getClass().getSimpleName(), th4.toString(), E0.h.g("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                            }
                            q2.e(D5);
                            break;
                        case F.k.LONG_FIELD_NUMBER /* 4 */:
                            C0240a c0240a6 = c0240a;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            E0.i.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj8;
                            Object obj9 = list4.get(1);
                            E0.i.c(obj9, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                D6 = o.g.v(Boolean.valueOf(c0240a6.f2874f.edit().putLong(str3, ((Long) obj9).longValue()).commit()));
                            } catch (Throwable th5) {
                                D6 = u0.e.D(th5.getClass().getSimpleName(), th5.toString(), E0.h.g("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                            }
                            q2.e(D6);
                            break;
                        case F.k.STRING_FIELD_NUMBER /* 5 */:
                            C0240a c0240a7 = c0240a;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            E0.i.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj10;
                            Object obj11 = list5.get(1);
                            E0.i.c(obj11, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj11).doubleValue();
                            try {
                                c0240a7.getClass();
                                String d3 = Double.toString(doubleValue);
                                D7 = o.g.v(Boolean.valueOf(c0240a7.f2874f.edit().putString(str4, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d3).commit()));
                            } catch (Throwable th6) {
                                D7 = u0.e.D(th6.getClass().getSimpleName(), th6.toString(), E0.h.g("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                            }
                            q2.e(D7);
                            break;
                        case F.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0240a c0240a8 = c0240a;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            E0.i.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj12;
                            Object obj13 = list6.get(1);
                            E0.i.c(obj13, "null cannot be cast to non-null type kotlin.String");
                            try {
                                D8 = o.g.v(Boolean.valueOf(c0240a8.f2874f.edit().putString(str5, (String) obj13).commit()));
                            } catch (Throwable th7) {
                                D8 = u0.e.D(th7.getClass().getSimpleName(), th7.toString(), E0.h.g("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                            }
                            q2.e(D8);
                            break;
                        case F.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0240a c0240a9 = c0240a;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            E0.i.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj14;
                            Object obj15 = list7.get(1);
                            E0.i.c(obj15, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list8 = (List) obj15;
                            try {
                                D9 = o.g.v(Boolean.valueOf(c0240a9.f2874f.edit().putString(str6, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0240a9.f2875g.d(list8)).commit()));
                            } catch (Throwable th8) {
                                D9 = u0.e.D(th8.getClass().getSimpleName(), th8.toString(), E0.h.g("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                            }
                            q2.e(D9);
                            break;
                        default:
                            C0240a c0240a10 = c0240a;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj16 = list9.get(0);
                            E0.i.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            try {
                                D10 = o.g.v(Boolean.valueOf(c0240a10.a((String) obj16, (List) list9.get(1))));
                            } catch (Throwable th9) {
                                D10 = u0.e.D(th9.getClass().getSimpleName(), th9.toString(), E0.h.g("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                            }
                            q2.e(D10);
                            break;
                    }
                }
            });
        } else {
            c0013n5.j(null);
        }
        C0013n c0013n6 = new C0013n(interfaceC0208f, E0.h.f("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setEncodedStringList", ""), a(), d2);
        if (c0240a != null) {
            final int i7 = 6;
            c0013n6.j(new InterfaceC0204b() { // from class: r0.c
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
                    switch (i7) {
                        case 0:
                            C0240a c0240a2 = c0240a;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            E0.i.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            try {
                                D2 = o.g.v(c0240a2.b((String) obj2, (List) list.get(1)));
                            } catch (Throwable th) {
                                D2 = u0.e.D(th.getClass().getSimpleName(), th.toString(), E0.h.g("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                            }
                            q2.e(D2);
                            break;
                        case 1:
                            C0240a c0240a3 = c0240a;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj).get(0);
                            E0.i.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            try {
                                D3 = o.g.v(Boolean.valueOf(c0240a3.f2874f.edit().remove((String) obj3).commit()));
                            } catch (Throwable th2) {
                                D3 = u0.e.D(th2.getClass().getSimpleName(), th2.toString(), E0.h.g("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                            }
                            q2.e(D3);
                            break;
                        case F.k.FLOAT_FIELD_NUMBER /* 2 */:
                            C0240a c0240a4 = c0240a;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            E0.i.c(obj4, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj4;
                            Object obj5 = list2.get(1);
                            E0.i.c(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            try {
                                D4 = o.g.v(Boolean.valueOf(c0240a4.f2874f.edit().putBoolean(str, ((Boolean) obj5).booleanValue()).commit()));
                            } catch (Throwable th3) {
                                D4 = u0.e.D(th3.getClass().getSimpleName(), th3.toString(), E0.h.g("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                            }
                            q2.e(D4);
                            break;
                        case F.k.INTEGER_FIELD_NUMBER /* 3 */:
                            C0240a c0240a5 = c0240a;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            E0.i.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj6;
                            Object obj7 = list3.get(1);
                            E0.i.c(obj7, "null cannot be cast to non-null type kotlin.String");
                            try {
                                D5 = o.g.v(Boolean.valueOf(c0240a5.d(str2, (String) obj7)));
                            } catch (Throwable th4) {
                                D5 = u0.e.D(th4.getClass().getSimpleName(), th4.toString(), E0.h.g("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                            }
                            q2.e(D5);
                            break;
                        case F.k.LONG_FIELD_NUMBER /* 4 */:
                            C0240a c0240a6 = c0240a;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            E0.i.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj8;
                            Object obj9 = list4.get(1);
                            E0.i.c(obj9, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                D6 = o.g.v(Boolean.valueOf(c0240a6.f2874f.edit().putLong(str3, ((Long) obj9).longValue()).commit()));
                            } catch (Throwable th5) {
                                D6 = u0.e.D(th5.getClass().getSimpleName(), th5.toString(), E0.h.g("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                            }
                            q2.e(D6);
                            break;
                        case F.k.STRING_FIELD_NUMBER /* 5 */:
                            C0240a c0240a7 = c0240a;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            E0.i.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj10;
                            Object obj11 = list5.get(1);
                            E0.i.c(obj11, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj11).doubleValue();
                            try {
                                c0240a7.getClass();
                                String d3 = Double.toString(doubleValue);
                                D7 = o.g.v(Boolean.valueOf(c0240a7.f2874f.edit().putString(str4, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d3).commit()));
                            } catch (Throwable th6) {
                                D7 = u0.e.D(th6.getClass().getSimpleName(), th6.toString(), E0.h.g("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                            }
                            q2.e(D7);
                            break;
                        case F.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0240a c0240a8 = c0240a;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            E0.i.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj12;
                            Object obj13 = list6.get(1);
                            E0.i.c(obj13, "null cannot be cast to non-null type kotlin.String");
                            try {
                                D8 = o.g.v(Boolean.valueOf(c0240a8.f2874f.edit().putString(str5, (String) obj13).commit()));
                            } catch (Throwable th7) {
                                D8 = u0.e.D(th7.getClass().getSimpleName(), th7.toString(), E0.h.g("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                            }
                            q2.e(D8);
                            break;
                        case F.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0240a c0240a9 = c0240a;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            E0.i.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj14;
                            Object obj15 = list7.get(1);
                            E0.i.c(obj15, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list8 = (List) obj15;
                            try {
                                D9 = o.g.v(Boolean.valueOf(c0240a9.f2874f.edit().putString(str6, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0240a9.f2875g.d(list8)).commit()));
                            } catch (Throwable th8) {
                                D9 = u0.e.D(th8.getClass().getSimpleName(), th8.toString(), E0.h.g("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                            }
                            q2.e(D9);
                            break;
                        default:
                            C0240a c0240a10 = c0240a;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj16 = list9.get(0);
                            E0.i.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            try {
                                D10 = o.g.v(Boolean.valueOf(c0240a10.a((String) obj16, (List) list9.get(1))));
                            } catch (Throwable th9) {
                                D10 = u0.e.D(th9.getClass().getSimpleName(), th9.toString(), E0.h.g("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                            }
                            q2.e(D10);
                            break;
                    }
                }
            });
        } else {
            c0013n6.j(null);
        }
        C0013n c0013n7 = new C0013n(interfaceC0208f, E0.h.f("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setDeprecatedStringList", ""), a(), d2);
        if (c0240a != null) {
            final int i8 = 7;
            c0013n7.j(new InterfaceC0204b() { // from class: r0.c
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
                    switch (i8) {
                        case 0:
                            C0240a c0240a2 = c0240a;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            E0.i.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            try {
                                D2 = o.g.v(c0240a2.b((String) obj2, (List) list.get(1)));
                            } catch (Throwable th) {
                                D2 = u0.e.D(th.getClass().getSimpleName(), th.toString(), E0.h.g("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                            }
                            q2.e(D2);
                            break;
                        case 1:
                            C0240a c0240a3 = c0240a;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj).get(0);
                            E0.i.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            try {
                                D3 = o.g.v(Boolean.valueOf(c0240a3.f2874f.edit().remove((String) obj3).commit()));
                            } catch (Throwable th2) {
                                D3 = u0.e.D(th2.getClass().getSimpleName(), th2.toString(), E0.h.g("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                            }
                            q2.e(D3);
                            break;
                        case F.k.FLOAT_FIELD_NUMBER /* 2 */:
                            C0240a c0240a4 = c0240a;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            E0.i.c(obj4, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj4;
                            Object obj5 = list2.get(1);
                            E0.i.c(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            try {
                                D4 = o.g.v(Boolean.valueOf(c0240a4.f2874f.edit().putBoolean(str, ((Boolean) obj5).booleanValue()).commit()));
                            } catch (Throwable th3) {
                                D4 = u0.e.D(th3.getClass().getSimpleName(), th3.toString(), E0.h.g("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                            }
                            q2.e(D4);
                            break;
                        case F.k.INTEGER_FIELD_NUMBER /* 3 */:
                            C0240a c0240a5 = c0240a;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            E0.i.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj6;
                            Object obj7 = list3.get(1);
                            E0.i.c(obj7, "null cannot be cast to non-null type kotlin.String");
                            try {
                                D5 = o.g.v(Boolean.valueOf(c0240a5.d(str2, (String) obj7)));
                            } catch (Throwable th4) {
                                D5 = u0.e.D(th4.getClass().getSimpleName(), th4.toString(), E0.h.g("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                            }
                            q2.e(D5);
                            break;
                        case F.k.LONG_FIELD_NUMBER /* 4 */:
                            C0240a c0240a6 = c0240a;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            E0.i.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj8;
                            Object obj9 = list4.get(1);
                            E0.i.c(obj9, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                D6 = o.g.v(Boolean.valueOf(c0240a6.f2874f.edit().putLong(str3, ((Long) obj9).longValue()).commit()));
                            } catch (Throwable th5) {
                                D6 = u0.e.D(th5.getClass().getSimpleName(), th5.toString(), E0.h.g("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                            }
                            q2.e(D6);
                            break;
                        case F.k.STRING_FIELD_NUMBER /* 5 */:
                            C0240a c0240a7 = c0240a;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            E0.i.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj10;
                            Object obj11 = list5.get(1);
                            E0.i.c(obj11, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj11).doubleValue();
                            try {
                                c0240a7.getClass();
                                String d3 = Double.toString(doubleValue);
                                D7 = o.g.v(Boolean.valueOf(c0240a7.f2874f.edit().putString(str4, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d3).commit()));
                            } catch (Throwable th6) {
                                D7 = u0.e.D(th6.getClass().getSimpleName(), th6.toString(), E0.h.g("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                            }
                            q2.e(D7);
                            break;
                        case F.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0240a c0240a8 = c0240a;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            E0.i.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj12;
                            Object obj13 = list6.get(1);
                            E0.i.c(obj13, "null cannot be cast to non-null type kotlin.String");
                            try {
                                D8 = o.g.v(Boolean.valueOf(c0240a8.f2874f.edit().putString(str5, (String) obj13).commit()));
                            } catch (Throwable th7) {
                                D8 = u0.e.D(th7.getClass().getSimpleName(), th7.toString(), E0.h.g("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                            }
                            q2.e(D8);
                            break;
                        case F.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0240a c0240a9 = c0240a;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            E0.i.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj14;
                            Object obj15 = list7.get(1);
                            E0.i.c(obj15, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list8 = (List) obj15;
                            try {
                                D9 = o.g.v(Boolean.valueOf(c0240a9.f2874f.edit().putString(str6, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0240a9.f2875g.d(list8)).commit()));
                            } catch (Throwable th8) {
                                D9 = u0.e.D(th8.getClass().getSimpleName(), th8.toString(), E0.h.g("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                            }
                            q2.e(D9);
                            break;
                        default:
                            C0240a c0240a10 = c0240a;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj16 = list9.get(0);
                            E0.i.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            try {
                                D10 = o.g.v(Boolean.valueOf(c0240a10.a((String) obj16, (List) list9.get(1))));
                            } catch (Throwable th9) {
                                D10 = u0.e.D(th9.getClass().getSimpleName(), th9.toString(), E0.h.g("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                            }
                            q2.e(D10);
                            break;
                    }
                }
            });
        } else {
            c0013n7.j(null);
        }
        C0013n c0013n8 = new C0013n(interfaceC0208f, E0.h.f("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.clear", ""), a(), d2);
        if (c0240a != null) {
            final int i9 = 8;
            c0013n8.j(new InterfaceC0204b() { // from class: r0.c
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
                    switch (i9) {
                        case 0:
                            C0240a c0240a2 = c0240a;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            E0.i.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            try {
                                D2 = o.g.v(c0240a2.b((String) obj2, (List) list.get(1)));
                            } catch (Throwable th) {
                                D2 = u0.e.D(th.getClass().getSimpleName(), th.toString(), E0.h.g("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                            }
                            q2.e(D2);
                            break;
                        case 1:
                            C0240a c0240a3 = c0240a;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj).get(0);
                            E0.i.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            try {
                                D3 = o.g.v(Boolean.valueOf(c0240a3.f2874f.edit().remove((String) obj3).commit()));
                            } catch (Throwable th2) {
                                D3 = u0.e.D(th2.getClass().getSimpleName(), th2.toString(), E0.h.g("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                            }
                            q2.e(D3);
                            break;
                        case F.k.FLOAT_FIELD_NUMBER /* 2 */:
                            C0240a c0240a4 = c0240a;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            E0.i.c(obj4, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj4;
                            Object obj5 = list2.get(1);
                            E0.i.c(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            try {
                                D4 = o.g.v(Boolean.valueOf(c0240a4.f2874f.edit().putBoolean(str, ((Boolean) obj5).booleanValue()).commit()));
                            } catch (Throwable th3) {
                                D4 = u0.e.D(th3.getClass().getSimpleName(), th3.toString(), E0.h.g("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                            }
                            q2.e(D4);
                            break;
                        case F.k.INTEGER_FIELD_NUMBER /* 3 */:
                            C0240a c0240a5 = c0240a;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            E0.i.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj6;
                            Object obj7 = list3.get(1);
                            E0.i.c(obj7, "null cannot be cast to non-null type kotlin.String");
                            try {
                                D5 = o.g.v(Boolean.valueOf(c0240a5.d(str2, (String) obj7)));
                            } catch (Throwable th4) {
                                D5 = u0.e.D(th4.getClass().getSimpleName(), th4.toString(), E0.h.g("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                            }
                            q2.e(D5);
                            break;
                        case F.k.LONG_FIELD_NUMBER /* 4 */:
                            C0240a c0240a6 = c0240a;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            E0.i.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj8;
                            Object obj9 = list4.get(1);
                            E0.i.c(obj9, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                D6 = o.g.v(Boolean.valueOf(c0240a6.f2874f.edit().putLong(str3, ((Long) obj9).longValue()).commit()));
                            } catch (Throwable th5) {
                                D6 = u0.e.D(th5.getClass().getSimpleName(), th5.toString(), E0.h.g("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                            }
                            q2.e(D6);
                            break;
                        case F.k.STRING_FIELD_NUMBER /* 5 */:
                            C0240a c0240a7 = c0240a;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            E0.i.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj10;
                            Object obj11 = list5.get(1);
                            E0.i.c(obj11, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj11).doubleValue();
                            try {
                                c0240a7.getClass();
                                String d3 = Double.toString(doubleValue);
                                D7 = o.g.v(Boolean.valueOf(c0240a7.f2874f.edit().putString(str4, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d3).commit()));
                            } catch (Throwable th6) {
                                D7 = u0.e.D(th6.getClass().getSimpleName(), th6.toString(), E0.h.g("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                            }
                            q2.e(D7);
                            break;
                        case F.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0240a c0240a8 = c0240a;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            E0.i.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj12;
                            Object obj13 = list6.get(1);
                            E0.i.c(obj13, "null cannot be cast to non-null type kotlin.String");
                            try {
                                D8 = o.g.v(Boolean.valueOf(c0240a8.f2874f.edit().putString(str5, (String) obj13).commit()));
                            } catch (Throwable th7) {
                                D8 = u0.e.D(th7.getClass().getSimpleName(), th7.toString(), E0.h.g("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                            }
                            q2.e(D8);
                            break;
                        case F.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0240a c0240a9 = c0240a;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            E0.i.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj14;
                            Object obj15 = list7.get(1);
                            E0.i.c(obj15, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list8 = (List) obj15;
                            try {
                                D9 = o.g.v(Boolean.valueOf(c0240a9.f2874f.edit().putString(str6, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0240a9.f2875g.d(list8)).commit()));
                            } catch (Throwable th8) {
                                D9 = u0.e.D(th8.getClass().getSimpleName(), th8.toString(), E0.h.g("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                            }
                            q2.e(D9);
                            break;
                        default:
                            C0240a c0240a10 = c0240a;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj16 = list9.get(0);
                            E0.i.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            try {
                                D10 = o.g.v(Boolean.valueOf(c0240a10.a((String) obj16, (List) list9.get(1))));
                            } catch (Throwable th9) {
                                D10 = u0.e.D(th9.getClass().getSimpleName(), th9.toString(), E0.h.g("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                            }
                            q2.e(D10);
                            break;
                    }
                }
            });
        } else {
            c0013n8.j(null);
        }
        C0013n c0013n9 = new C0013n(interfaceC0208f, E0.h.f("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.getAll", ""), a(), d2);
        if (c0240a == null) {
            c0013n9.j(null);
        } else {
            final int i10 = 0;
            c0013n9.j(new InterfaceC0204b() { // from class: r0.c
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
                    switch (i10) {
                        case 0:
                            C0240a c0240a2 = c0240a;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            E0.i.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            try {
                                D2 = o.g.v(c0240a2.b((String) obj2, (List) list.get(1)));
                            } catch (Throwable th) {
                                D2 = u0.e.D(th.getClass().getSimpleName(), th.toString(), E0.h.g("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                            }
                            q2.e(D2);
                            break;
                        case 1:
                            C0240a c0240a3 = c0240a;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj).get(0);
                            E0.i.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            try {
                                D3 = o.g.v(Boolean.valueOf(c0240a3.f2874f.edit().remove((String) obj3).commit()));
                            } catch (Throwable th2) {
                                D3 = u0.e.D(th2.getClass().getSimpleName(), th2.toString(), E0.h.g("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                            }
                            q2.e(D3);
                            break;
                        case F.k.FLOAT_FIELD_NUMBER /* 2 */:
                            C0240a c0240a4 = c0240a;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            E0.i.c(obj4, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj4;
                            Object obj5 = list2.get(1);
                            E0.i.c(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            try {
                                D4 = o.g.v(Boolean.valueOf(c0240a4.f2874f.edit().putBoolean(str, ((Boolean) obj5).booleanValue()).commit()));
                            } catch (Throwable th3) {
                                D4 = u0.e.D(th3.getClass().getSimpleName(), th3.toString(), E0.h.g("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                            }
                            q2.e(D4);
                            break;
                        case F.k.INTEGER_FIELD_NUMBER /* 3 */:
                            C0240a c0240a5 = c0240a;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            E0.i.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj6;
                            Object obj7 = list3.get(1);
                            E0.i.c(obj7, "null cannot be cast to non-null type kotlin.String");
                            try {
                                D5 = o.g.v(Boolean.valueOf(c0240a5.d(str2, (String) obj7)));
                            } catch (Throwable th4) {
                                D5 = u0.e.D(th4.getClass().getSimpleName(), th4.toString(), E0.h.g("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                            }
                            q2.e(D5);
                            break;
                        case F.k.LONG_FIELD_NUMBER /* 4 */:
                            C0240a c0240a6 = c0240a;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            E0.i.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj8;
                            Object obj9 = list4.get(1);
                            E0.i.c(obj9, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                D6 = o.g.v(Boolean.valueOf(c0240a6.f2874f.edit().putLong(str3, ((Long) obj9).longValue()).commit()));
                            } catch (Throwable th5) {
                                D6 = u0.e.D(th5.getClass().getSimpleName(), th5.toString(), E0.h.g("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                            }
                            q2.e(D6);
                            break;
                        case F.k.STRING_FIELD_NUMBER /* 5 */:
                            C0240a c0240a7 = c0240a;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            E0.i.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj10;
                            Object obj11 = list5.get(1);
                            E0.i.c(obj11, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj11).doubleValue();
                            try {
                                c0240a7.getClass();
                                String d3 = Double.toString(doubleValue);
                                D7 = o.g.v(Boolean.valueOf(c0240a7.f2874f.edit().putString(str4, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d3).commit()));
                            } catch (Throwable th6) {
                                D7 = u0.e.D(th6.getClass().getSimpleName(), th6.toString(), E0.h.g("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                            }
                            q2.e(D7);
                            break;
                        case F.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0240a c0240a8 = c0240a;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            E0.i.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj12;
                            Object obj13 = list6.get(1);
                            E0.i.c(obj13, "null cannot be cast to non-null type kotlin.String");
                            try {
                                D8 = o.g.v(Boolean.valueOf(c0240a8.f2874f.edit().putString(str5, (String) obj13).commit()));
                            } catch (Throwable th7) {
                                D8 = u0.e.D(th7.getClass().getSimpleName(), th7.toString(), E0.h.g("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                            }
                            q2.e(D8);
                            break;
                        case F.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0240a c0240a9 = c0240a;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            E0.i.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj14;
                            Object obj15 = list7.get(1);
                            E0.i.c(obj15, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list8 = (List) obj15;
                            try {
                                D9 = o.g.v(Boolean.valueOf(c0240a9.f2874f.edit().putString(str6, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0240a9.f2875g.d(list8)).commit()));
                            } catch (Throwable th8) {
                                D9 = u0.e.D(th8.getClass().getSimpleName(), th8.toString(), E0.h.g("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                            }
                            q2.e(D9);
                            break;
                        default:
                            C0240a c0240a10 = c0240a;
                            E0.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj16 = list9.get(0);
                            E0.i.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            try {
                                D10 = o.g.v(Boolean.valueOf(c0240a10.a((String) obj16, (List) list9.get(1))));
                            } catch (Throwable th9) {
                                D10 = u0.e.D(th9.getClass().getSimpleName(), th9.toString(), E0.h.g("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                            }
                            q2.e(D10);
                            break;
                    }
                }
            });
        }
    }
}
