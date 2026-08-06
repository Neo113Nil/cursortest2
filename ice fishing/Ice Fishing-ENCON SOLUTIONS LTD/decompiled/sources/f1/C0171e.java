package f1;

import F.C0038n;
import a.AbstractC0083a;
import a1.C0093i;
import a1.InterfaceC0086b;
import a1.InterfaceC0090f;
import a1.InterfaceC0094j;
import android.content.SharedPreferences;
import android.util.Log;
import h1.C0237g;
import i1.AbstractC0253j;
import java.util.List;

/* renamed from: f1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0171e {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ C0171e f2928a = new C0171e();

    /* renamed from: b, reason: collision with root package name */
    public static final C0237g f2929b = R1.d.y(new C0170d(0));

    public static InterfaceC0094j a() {
        return (InterfaceC0094j) f2929b.a();
    }

    public static void b(C0171e c0171e, InterfaceC0090f binaryMessenger, final C0167a c0167a) {
        c0171e.getClass();
        kotlin.jvm.internal.i.e(binaryMessenger, "binaryMessenger");
        String concat = "".length() > 0 ? ".".concat("") : "";
        m0.j e2 = binaryMessenger.e(new C0093i());
        C0038n c0038n = new C0038n(binaryMessenger, C1.a.i("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.remove", concat), a(), e2);
        if (c0167a != null) {
            final int i2 = 1;
            c0038n.h(new InterfaceC0086b() { // from class: f1.c
                @Override // a1.InterfaceC0086b
                public final void g(Object obj, x0.e eVar) {
                    List B2;
                    List B3;
                    SharedPreferences sharedPreferences;
                    List B4;
                    SharedPreferences sharedPreferences2;
                    List B5;
                    List B6;
                    SharedPreferences sharedPreferences3;
                    List B7;
                    String valueOf;
                    SharedPreferences sharedPreferences4;
                    List B8;
                    SharedPreferences sharedPreferences5;
                    List B9;
                    SharedPreferences sharedPreferences6;
                    List B10;
                    switch (i2) {
                        case 0:
                            C0167a c0167a2 = c0167a;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            kotlin.jvm.internal.i.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            try {
                                B2 = AbstractC0083a.m(c0167a2.b((String) obj2, (List) list.get(1)));
                            } catch (Throwable th) {
                                B2 = AbstractC0253j.B(th.getClass().getSimpleName(), th.toString(), C1.a.j("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                            }
                            eVar.f(B2);
                            return;
                        case 1:
                            C0167a c0167a3 = c0167a;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj).get(0);
                            kotlin.jvm.internal.i.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj3;
                            try {
                                c0167a3.getClass();
                                sharedPreferences = c0167a3.f2923b;
                            } catch (Throwable th2) {
                                B3 = AbstractC0253j.B(th2.getClass().getSimpleName(), th2.toString(), C1.a.j("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                            }
                            if (sharedPreferences == null) {
                                kotlin.jvm.internal.i.i("preferences");
                                throw null;
                            }
                            B3 = AbstractC0083a.m(Boolean.valueOf(sharedPreferences.edit().remove(str).commit()));
                            eVar.f(B3);
                            return;
                        case 2:
                            C0167a c0167a4 = c0167a;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            kotlin.jvm.internal.i.c(obj4, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj4;
                            Object obj5 = list2.get(1);
                            kotlin.jvm.internal.i.c(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj5).booleanValue();
                            try {
                                c0167a4.getClass();
                                sharedPreferences2 = c0167a4.f2923b;
                            } catch (Throwable th3) {
                                B4 = AbstractC0253j.B(th3.getClass().getSimpleName(), th3.toString(), C1.a.j("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                            }
                            if (sharedPreferences2 == null) {
                                kotlin.jvm.internal.i.i("preferences");
                                throw null;
                            }
                            B4 = AbstractC0083a.m(Boolean.valueOf(sharedPreferences2.edit().putBoolean(str2, booleanValue).commit()));
                            eVar.f(B4);
                            return;
                        case 3:
                            C0167a c0167a5 = c0167a;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            kotlin.jvm.internal.i.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj6;
                            Object obj7 = list3.get(1);
                            kotlin.jvm.internal.i.c(obj7, "null cannot be cast to non-null type kotlin.String");
                            try {
                                B5 = AbstractC0083a.m(Boolean.valueOf(c0167a5.c(str3, (String) obj7)));
                            } catch (Throwable th4) {
                                B5 = AbstractC0253j.B(th4.getClass().getSimpleName(), th4.toString(), C1.a.j("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                            }
                            eVar.f(B5);
                            return;
                        case 4:
                            C0167a c0167a6 = c0167a;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            kotlin.jvm.internal.i.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj8;
                            Object obj9 = list4.get(1);
                            kotlin.jvm.internal.i.c(obj9, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj9).longValue();
                            try {
                                c0167a6.getClass();
                                sharedPreferences3 = c0167a6.f2923b;
                            } catch (Throwable th5) {
                                B6 = AbstractC0253j.B(th5.getClass().getSimpleName(), th5.toString(), C1.a.j("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                            }
                            if (sharedPreferences3 == null) {
                                kotlin.jvm.internal.i.i("preferences");
                                throw null;
                            }
                            B6 = AbstractC0083a.m(Boolean.valueOf(sharedPreferences3.edit().putLong(str4, longValue).commit()));
                            eVar.f(B6);
                            return;
                        case 5:
                            C0167a c0167a7 = c0167a;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            kotlin.jvm.internal.i.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj10;
                            Object obj11 = list5.get(1);
                            kotlin.jvm.internal.i.c(obj11, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj11).doubleValue();
                            try {
                                c0167a7.getClass();
                                valueOf = String.valueOf(doubleValue);
                                sharedPreferences4 = c0167a7.f2923b;
                            } catch (Throwable th6) {
                                B7 = AbstractC0253j.B(th6.getClass().getSimpleName(), th6.toString(), C1.a.j("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                            }
                            if (sharedPreferences4 == null) {
                                kotlin.jvm.internal.i.i("preferences");
                                throw null;
                            }
                            B7 = AbstractC0083a.m(Boolean.valueOf(sharedPreferences4.edit().putString(str5, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + valueOf).commit()));
                            eVar.f(B7);
                            return;
                        case 6:
                            C0167a c0167a8 = c0167a;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            kotlin.jvm.internal.i.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj12;
                            Object obj13 = list6.get(1);
                            kotlin.jvm.internal.i.c(obj13, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj13;
                            try {
                                c0167a8.getClass();
                                sharedPreferences5 = c0167a8.f2923b;
                            } catch (Throwable th7) {
                                B8 = AbstractC0253j.B(th7.getClass().getSimpleName(), th7.toString(), C1.a.j("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                            }
                            if (sharedPreferences5 == null) {
                                kotlin.jvm.internal.i.i("preferences");
                                throw null;
                            }
                            B8 = AbstractC0083a.m(Boolean.valueOf(sharedPreferences5.edit().putString(str6, str7).commit()));
                            eVar.f(B8);
                            return;
                        case 7:
                            C0167a c0167a9 = c0167a;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            kotlin.jvm.internal.i.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            kotlin.jvm.internal.i.c(obj15, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list8 = (List) obj15;
                            try {
                                sharedPreferences6 = c0167a9.f2923b;
                            } catch (Throwable th8) {
                                B9 = AbstractC0253j.B(th8.getClass().getSimpleName(), th8.toString(), C1.a.j("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                            }
                            if (sharedPreferences6 == null) {
                                kotlin.jvm.internal.i.i("preferences");
                                throw null;
                            }
                            B9 = AbstractC0083a.m(Boolean.valueOf(sharedPreferences6.edit().putString(str8, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu".concat(c0167a9.f2922a.h(list8))).commit()));
                            eVar.f(B9);
                            return;
                        default:
                            C0167a c0167a10 = c0167a;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj16 = list9.get(0);
                            kotlin.jvm.internal.i.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            try {
                                B10 = AbstractC0083a.m(Boolean.valueOf(c0167a10.a((String) obj16, (List) list9.get(1))));
                            } catch (Throwable th9) {
                                B10 = AbstractC0253j.B(th9.getClass().getSimpleName(), th9.toString(), C1.a.j("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                            }
                            eVar.f(B10);
                            return;
                    }
                }
            });
        } else {
            c0038n.h(null);
        }
        C0038n c0038n2 = new C0038n(binaryMessenger, C1.a.i("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setBool", concat), a(), e2);
        if (c0167a != null) {
            final int i3 = 2;
            c0038n2.h(new InterfaceC0086b() { // from class: f1.c
                @Override // a1.InterfaceC0086b
                public final void g(Object obj, x0.e eVar) {
                    List B2;
                    List B3;
                    SharedPreferences sharedPreferences;
                    List B4;
                    SharedPreferences sharedPreferences2;
                    List B5;
                    List B6;
                    SharedPreferences sharedPreferences3;
                    List B7;
                    String valueOf;
                    SharedPreferences sharedPreferences4;
                    List B8;
                    SharedPreferences sharedPreferences5;
                    List B9;
                    SharedPreferences sharedPreferences6;
                    List B10;
                    switch (i3) {
                        case 0:
                            C0167a c0167a2 = c0167a;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            kotlin.jvm.internal.i.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            try {
                                B2 = AbstractC0083a.m(c0167a2.b((String) obj2, (List) list.get(1)));
                            } catch (Throwable th) {
                                B2 = AbstractC0253j.B(th.getClass().getSimpleName(), th.toString(), C1.a.j("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                            }
                            eVar.f(B2);
                            return;
                        case 1:
                            C0167a c0167a3 = c0167a;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj).get(0);
                            kotlin.jvm.internal.i.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj3;
                            try {
                                c0167a3.getClass();
                                sharedPreferences = c0167a3.f2923b;
                            } catch (Throwable th2) {
                                B3 = AbstractC0253j.B(th2.getClass().getSimpleName(), th2.toString(), C1.a.j("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                            }
                            if (sharedPreferences == null) {
                                kotlin.jvm.internal.i.i("preferences");
                                throw null;
                            }
                            B3 = AbstractC0083a.m(Boolean.valueOf(sharedPreferences.edit().remove(str).commit()));
                            eVar.f(B3);
                            return;
                        case 2:
                            C0167a c0167a4 = c0167a;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            kotlin.jvm.internal.i.c(obj4, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj4;
                            Object obj5 = list2.get(1);
                            kotlin.jvm.internal.i.c(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj5).booleanValue();
                            try {
                                c0167a4.getClass();
                                sharedPreferences2 = c0167a4.f2923b;
                            } catch (Throwable th3) {
                                B4 = AbstractC0253j.B(th3.getClass().getSimpleName(), th3.toString(), C1.a.j("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                            }
                            if (sharedPreferences2 == null) {
                                kotlin.jvm.internal.i.i("preferences");
                                throw null;
                            }
                            B4 = AbstractC0083a.m(Boolean.valueOf(sharedPreferences2.edit().putBoolean(str2, booleanValue).commit()));
                            eVar.f(B4);
                            return;
                        case 3:
                            C0167a c0167a5 = c0167a;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            kotlin.jvm.internal.i.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj6;
                            Object obj7 = list3.get(1);
                            kotlin.jvm.internal.i.c(obj7, "null cannot be cast to non-null type kotlin.String");
                            try {
                                B5 = AbstractC0083a.m(Boolean.valueOf(c0167a5.c(str3, (String) obj7)));
                            } catch (Throwable th4) {
                                B5 = AbstractC0253j.B(th4.getClass().getSimpleName(), th4.toString(), C1.a.j("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                            }
                            eVar.f(B5);
                            return;
                        case 4:
                            C0167a c0167a6 = c0167a;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            kotlin.jvm.internal.i.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj8;
                            Object obj9 = list4.get(1);
                            kotlin.jvm.internal.i.c(obj9, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj9).longValue();
                            try {
                                c0167a6.getClass();
                                sharedPreferences3 = c0167a6.f2923b;
                            } catch (Throwable th5) {
                                B6 = AbstractC0253j.B(th5.getClass().getSimpleName(), th5.toString(), C1.a.j("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                            }
                            if (sharedPreferences3 == null) {
                                kotlin.jvm.internal.i.i("preferences");
                                throw null;
                            }
                            B6 = AbstractC0083a.m(Boolean.valueOf(sharedPreferences3.edit().putLong(str4, longValue).commit()));
                            eVar.f(B6);
                            return;
                        case 5:
                            C0167a c0167a7 = c0167a;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            kotlin.jvm.internal.i.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj10;
                            Object obj11 = list5.get(1);
                            kotlin.jvm.internal.i.c(obj11, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj11).doubleValue();
                            try {
                                c0167a7.getClass();
                                valueOf = String.valueOf(doubleValue);
                                sharedPreferences4 = c0167a7.f2923b;
                            } catch (Throwable th6) {
                                B7 = AbstractC0253j.B(th6.getClass().getSimpleName(), th6.toString(), C1.a.j("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                            }
                            if (sharedPreferences4 == null) {
                                kotlin.jvm.internal.i.i("preferences");
                                throw null;
                            }
                            B7 = AbstractC0083a.m(Boolean.valueOf(sharedPreferences4.edit().putString(str5, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + valueOf).commit()));
                            eVar.f(B7);
                            return;
                        case 6:
                            C0167a c0167a8 = c0167a;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            kotlin.jvm.internal.i.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj12;
                            Object obj13 = list6.get(1);
                            kotlin.jvm.internal.i.c(obj13, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj13;
                            try {
                                c0167a8.getClass();
                                sharedPreferences5 = c0167a8.f2923b;
                            } catch (Throwable th7) {
                                B8 = AbstractC0253j.B(th7.getClass().getSimpleName(), th7.toString(), C1.a.j("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                            }
                            if (sharedPreferences5 == null) {
                                kotlin.jvm.internal.i.i("preferences");
                                throw null;
                            }
                            B8 = AbstractC0083a.m(Boolean.valueOf(sharedPreferences5.edit().putString(str6, str7).commit()));
                            eVar.f(B8);
                            return;
                        case 7:
                            C0167a c0167a9 = c0167a;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            kotlin.jvm.internal.i.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            kotlin.jvm.internal.i.c(obj15, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list8 = (List) obj15;
                            try {
                                sharedPreferences6 = c0167a9.f2923b;
                            } catch (Throwable th8) {
                                B9 = AbstractC0253j.B(th8.getClass().getSimpleName(), th8.toString(), C1.a.j("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                            }
                            if (sharedPreferences6 == null) {
                                kotlin.jvm.internal.i.i("preferences");
                                throw null;
                            }
                            B9 = AbstractC0083a.m(Boolean.valueOf(sharedPreferences6.edit().putString(str8, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu".concat(c0167a9.f2922a.h(list8))).commit()));
                            eVar.f(B9);
                            return;
                        default:
                            C0167a c0167a10 = c0167a;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj16 = list9.get(0);
                            kotlin.jvm.internal.i.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            try {
                                B10 = AbstractC0083a.m(Boolean.valueOf(c0167a10.a((String) obj16, (List) list9.get(1))));
                            } catch (Throwable th9) {
                                B10 = AbstractC0253j.B(th9.getClass().getSimpleName(), th9.toString(), C1.a.j("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                            }
                            eVar.f(B10);
                            return;
                    }
                }
            });
        } else {
            c0038n2.h(null);
        }
        C0038n c0038n3 = new C0038n(binaryMessenger, C1.a.i("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setString", concat), a(), e2);
        if (c0167a != null) {
            final int i4 = 3;
            c0038n3.h(new InterfaceC0086b() { // from class: f1.c
                @Override // a1.InterfaceC0086b
                public final void g(Object obj, x0.e eVar) {
                    List B2;
                    List B3;
                    SharedPreferences sharedPreferences;
                    List B4;
                    SharedPreferences sharedPreferences2;
                    List B5;
                    List B6;
                    SharedPreferences sharedPreferences3;
                    List B7;
                    String valueOf;
                    SharedPreferences sharedPreferences4;
                    List B8;
                    SharedPreferences sharedPreferences5;
                    List B9;
                    SharedPreferences sharedPreferences6;
                    List B10;
                    switch (i4) {
                        case 0:
                            C0167a c0167a2 = c0167a;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            kotlin.jvm.internal.i.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            try {
                                B2 = AbstractC0083a.m(c0167a2.b((String) obj2, (List) list.get(1)));
                            } catch (Throwable th) {
                                B2 = AbstractC0253j.B(th.getClass().getSimpleName(), th.toString(), C1.a.j("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                            }
                            eVar.f(B2);
                            return;
                        case 1:
                            C0167a c0167a3 = c0167a;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj).get(0);
                            kotlin.jvm.internal.i.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj3;
                            try {
                                c0167a3.getClass();
                                sharedPreferences = c0167a3.f2923b;
                            } catch (Throwable th2) {
                                B3 = AbstractC0253j.B(th2.getClass().getSimpleName(), th2.toString(), C1.a.j("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                            }
                            if (sharedPreferences == null) {
                                kotlin.jvm.internal.i.i("preferences");
                                throw null;
                            }
                            B3 = AbstractC0083a.m(Boolean.valueOf(sharedPreferences.edit().remove(str).commit()));
                            eVar.f(B3);
                            return;
                        case 2:
                            C0167a c0167a4 = c0167a;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            kotlin.jvm.internal.i.c(obj4, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj4;
                            Object obj5 = list2.get(1);
                            kotlin.jvm.internal.i.c(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj5).booleanValue();
                            try {
                                c0167a4.getClass();
                                sharedPreferences2 = c0167a4.f2923b;
                            } catch (Throwable th3) {
                                B4 = AbstractC0253j.B(th3.getClass().getSimpleName(), th3.toString(), C1.a.j("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                            }
                            if (sharedPreferences2 == null) {
                                kotlin.jvm.internal.i.i("preferences");
                                throw null;
                            }
                            B4 = AbstractC0083a.m(Boolean.valueOf(sharedPreferences2.edit().putBoolean(str2, booleanValue).commit()));
                            eVar.f(B4);
                            return;
                        case 3:
                            C0167a c0167a5 = c0167a;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            kotlin.jvm.internal.i.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj6;
                            Object obj7 = list3.get(1);
                            kotlin.jvm.internal.i.c(obj7, "null cannot be cast to non-null type kotlin.String");
                            try {
                                B5 = AbstractC0083a.m(Boolean.valueOf(c0167a5.c(str3, (String) obj7)));
                            } catch (Throwable th4) {
                                B5 = AbstractC0253j.B(th4.getClass().getSimpleName(), th4.toString(), C1.a.j("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                            }
                            eVar.f(B5);
                            return;
                        case 4:
                            C0167a c0167a6 = c0167a;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            kotlin.jvm.internal.i.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj8;
                            Object obj9 = list4.get(1);
                            kotlin.jvm.internal.i.c(obj9, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj9).longValue();
                            try {
                                c0167a6.getClass();
                                sharedPreferences3 = c0167a6.f2923b;
                            } catch (Throwable th5) {
                                B6 = AbstractC0253j.B(th5.getClass().getSimpleName(), th5.toString(), C1.a.j("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                            }
                            if (sharedPreferences3 == null) {
                                kotlin.jvm.internal.i.i("preferences");
                                throw null;
                            }
                            B6 = AbstractC0083a.m(Boolean.valueOf(sharedPreferences3.edit().putLong(str4, longValue).commit()));
                            eVar.f(B6);
                            return;
                        case 5:
                            C0167a c0167a7 = c0167a;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            kotlin.jvm.internal.i.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj10;
                            Object obj11 = list5.get(1);
                            kotlin.jvm.internal.i.c(obj11, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj11).doubleValue();
                            try {
                                c0167a7.getClass();
                                valueOf = String.valueOf(doubleValue);
                                sharedPreferences4 = c0167a7.f2923b;
                            } catch (Throwable th6) {
                                B7 = AbstractC0253j.B(th6.getClass().getSimpleName(), th6.toString(), C1.a.j("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                            }
                            if (sharedPreferences4 == null) {
                                kotlin.jvm.internal.i.i("preferences");
                                throw null;
                            }
                            B7 = AbstractC0083a.m(Boolean.valueOf(sharedPreferences4.edit().putString(str5, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + valueOf).commit()));
                            eVar.f(B7);
                            return;
                        case 6:
                            C0167a c0167a8 = c0167a;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            kotlin.jvm.internal.i.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj12;
                            Object obj13 = list6.get(1);
                            kotlin.jvm.internal.i.c(obj13, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj13;
                            try {
                                c0167a8.getClass();
                                sharedPreferences5 = c0167a8.f2923b;
                            } catch (Throwable th7) {
                                B8 = AbstractC0253j.B(th7.getClass().getSimpleName(), th7.toString(), C1.a.j("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                            }
                            if (sharedPreferences5 == null) {
                                kotlin.jvm.internal.i.i("preferences");
                                throw null;
                            }
                            B8 = AbstractC0083a.m(Boolean.valueOf(sharedPreferences5.edit().putString(str6, str7).commit()));
                            eVar.f(B8);
                            return;
                        case 7:
                            C0167a c0167a9 = c0167a;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            kotlin.jvm.internal.i.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            kotlin.jvm.internal.i.c(obj15, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list8 = (List) obj15;
                            try {
                                sharedPreferences6 = c0167a9.f2923b;
                            } catch (Throwable th8) {
                                B9 = AbstractC0253j.B(th8.getClass().getSimpleName(), th8.toString(), C1.a.j("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                            }
                            if (sharedPreferences6 == null) {
                                kotlin.jvm.internal.i.i("preferences");
                                throw null;
                            }
                            B9 = AbstractC0083a.m(Boolean.valueOf(sharedPreferences6.edit().putString(str8, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu".concat(c0167a9.f2922a.h(list8))).commit()));
                            eVar.f(B9);
                            return;
                        default:
                            C0167a c0167a10 = c0167a;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj16 = list9.get(0);
                            kotlin.jvm.internal.i.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            try {
                                B10 = AbstractC0083a.m(Boolean.valueOf(c0167a10.a((String) obj16, (List) list9.get(1))));
                            } catch (Throwable th9) {
                                B10 = AbstractC0253j.B(th9.getClass().getSimpleName(), th9.toString(), C1.a.j("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                            }
                            eVar.f(B10);
                            return;
                    }
                }
            });
        } else {
            c0038n3.h(null);
        }
        C0038n c0038n4 = new C0038n(binaryMessenger, C1.a.i("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setInt", concat), a(), e2);
        if (c0167a != null) {
            final int i5 = 4;
            c0038n4.h(new InterfaceC0086b() { // from class: f1.c
                @Override // a1.InterfaceC0086b
                public final void g(Object obj, x0.e eVar) {
                    List B2;
                    List B3;
                    SharedPreferences sharedPreferences;
                    List B4;
                    SharedPreferences sharedPreferences2;
                    List B5;
                    List B6;
                    SharedPreferences sharedPreferences3;
                    List B7;
                    String valueOf;
                    SharedPreferences sharedPreferences4;
                    List B8;
                    SharedPreferences sharedPreferences5;
                    List B9;
                    SharedPreferences sharedPreferences6;
                    List B10;
                    switch (i5) {
                        case 0:
                            C0167a c0167a2 = c0167a;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            kotlin.jvm.internal.i.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            try {
                                B2 = AbstractC0083a.m(c0167a2.b((String) obj2, (List) list.get(1)));
                            } catch (Throwable th) {
                                B2 = AbstractC0253j.B(th.getClass().getSimpleName(), th.toString(), C1.a.j("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                            }
                            eVar.f(B2);
                            return;
                        case 1:
                            C0167a c0167a3 = c0167a;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj).get(0);
                            kotlin.jvm.internal.i.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj3;
                            try {
                                c0167a3.getClass();
                                sharedPreferences = c0167a3.f2923b;
                            } catch (Throwable th2) {
                                B3 = AbstractC0253j.B(th2.getClass().getSimpleName(), th2.toString(), C1.a.j("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                            }
                            if (sharedPreferences == null) {
                                kotlin.jvm.internal.i.i("preferences");
                                throw null;
                            }
                            B3 = AbstractC0083a.m(Boolean.valueOf(sharedPreferences.edit().remove(str).commit()));
                            eVar.f(B3);
                            return;
                        case 2:
                            C0167a c0167a4 = c0167a;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            kotlin.jvm.internal.i.c(obj4, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj4;
                            Object obj5 = list2.get(1);
                            kotlin.jvm.internal.i.c(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj5).booleanValue();
                            try {
                                c0167a4.getClass();
                                sharedPreferences2 = c0167a4.f2923b;
                            } catch (Throwable th3) {
                                B4 = AbstractC0253j.B(th3.getClass().getSimpleName(), th3.toString(), C1.a.j("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                            }
                            if (sharedPreferences2 == null) {
                                kotlin.jvm.internal.i.i("preferences");
                                throw null;
                            }
                            B4 = AbstractC0083a.m(Boolean.valueOf(sharedPreferences2.edit().putBoolean(str2, booleanValue).commit()));
                            eVar.f(B4);
                            return;
                        case 3:
                            C0167a c0167a5 = c0167a;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            kotlin.jvm.internal.i.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj6;
                            Object obj7 = list3.get(1);
                            kotlin.jvm.internal.i.c(obj7, "null cannot be cast to non-null type kotlin.String");
                            try {
                                B5 = AbstractC0083a.m(Boolean.valueOf(c0167a5.c(str3, (String) obj7)));
                            } catch (Throwable th4) {
                                B5 = AbstractC0253j.B(th4.getClass().getSimpleName(), th4.toString(), C1.a.j("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                            }
                            eVar.f(B5);
                            return;
                        case 4:
                            C0167a c0167a6 = c0167a;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            kotlin.jvm.internal.i.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj8;
                            Object obj9 = list4.get(1);
                            kotlin.jvm.internal.i.c(obj9, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj9).longValue();
                            try {
                                c0167a6.getClass();
                                sharedPreferences3 = c0167a6.f2923b;
                            } catch (Throwable th5) {
                                B6 = AbstractC0253j.B(th5.getClass().getSimpleName(), th5.toString(), C1.a.j("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                            }
                            if (sharedPreferences3 == null) {
                                kotlin.jvm.internal.i.i("preferences");
                                throw null;
                            }
                            B6 = AbstractC0083a.m(Boolean.valueOf(sharedPreferences3.edit().putLong(str4, longValue).commit()));
                            eVar.f(B6);
                            return;
                        case 5:
                            C0167a c0167a7 = c0167a;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            kotlin.jvm.internal.i.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj10;
                            Object obj11 = list5.get(1);
                            kotlin.jvm.internal.i.c(obj11, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj11).doubleValue();
                            try {
                                c0167a7.getClass();
                                valueOf = String.valueOf(doubleValue);
                                sharedPreferences4 = c0167a7.f2923b;
                            } catch (Throwable th6) {
                                B7 = AbstractC0253j.B(th6.getClass().getSimpleName(), th6.toString(), C1.a.j("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                            }
                            if (sharedPreferences4 == null) {
                                kotlin.jvm.internal.i.i("preferences");
                                throw null;
                            }
                            B7 = AbstractC0083a.m(Boolean.valueOf(sharedPreferences4.edit().putString(str5, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + valueOf).commit()));
                            eVar.f(B7);
                            return;
                        case 6:
                            C0167a c0167a8 = c0167a;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            kotlin.jvm.internal.i.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj12;
                            Object obj13 = list6.get(1);
                            kotlin.jvm.internal.i.c(obj13, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj13;
                            try {
                                c0167a8.getClass();
                                sharedPreferences5 = c0167a8.f2923b;
                            } catch (Throwable th7) {
                                B8 = AbstractC0253j.B(th7.getClass().getSimpleName(), th7.toString(), C1.a.j("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                            }
                            if (sharedPreferences5 == null) {
                                kotlin.jvm.internal.i.i("preferences");
                                throw null;
                            }
                            B8 = AbstractC0083a.m(Boolean.valueOf(sharedPreferences5.edit().putString(str6, str7).commit()));
                            eVar.f(B8);
                            return;
                        case 7:
                            C0167a c0167a9 = c0167a;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            kotlin.jvm.internal.i.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            kotlin.jvm.internal.i.c(obj15, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list8 = (List) obj15;
                            try {
                                sharedPreferences6 = c0167a9.f2923b;
                            } catch (Throwable th8) {
                                B9 = AbstractC0253j.B(th8.getClass().getSimpleName(), th8.toString(), C1.a.j("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                            }
                            if (sharedPreferences6 == null) {
                                kotlin.jvm.internal.i.i("preferences");
                                throw null;
                            }
                            B9 = AbstractC0083a.m(Boolean.valueOf(sharedPreferences6.edit().putString(str8, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu".concat(c0167a9.f2922a.h(list8))).commit()));
                            eVar.f(B9);
                            return;
                        default:
                            C0167a c0167a10 = c0167a;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj16 = list9.get(0);
                            kotlin.jvm.internal.i.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            try {
                                B10 = AbstractC0083a.m(Boolean.valueOf(c0167a10.a((String) obj16, (List) list9.get(1))));
                            } catch (Throwable th9) {
                                B10 = AbstractC0253j.B(th9.getClass().getSimpleName(), th9.toString(), C1.a.j("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                            }
                            eVar.f(B10);
                            return;
                    }
                }
            });
        } else {
            c0038n4.h(null);
        }
        C0038n c0038n5 = new C0038n(binaryMessenger, C1.a.i("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setDouble", concat), a(), e2);
        if (c0167a != null) {
            final int i6 = 5;
            c0038n5.h(new InterfaceC0086b() { // from class: f1.c
                @Override // a1.InterfaceC0086b
                public final void g(Object obj, x0.e eVar) {
                    List B2;
                    List B3;
                    SharedPreferences sharedPreferences;
                    List B4;
                    SharedPreferences sharedPreferences2;
                    List B5;
                    List B6;
                    SharedPreferences sharedPreferences3;
                    List B7;
                    String valueOf;
                    SharedPreferences sharedPreferences4;
                    List B8;
                    SharedPreferences sharedPreferences5;
                    List B9;
                    SharedPreferences sharedPreferences6;
                    List B10;
                    switch (i6) {
                        case 0:
                            C0167a c0167a2 = c0167a;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            kotlin.jvm.internal.i.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            try {
                                B2 = AbstractC0083a.m(c0167a2.b((String) obj2, (List) list.get(1)));
                            } catch (Throwable th) {
                                B2 = AbstractC0253j.B(th.getClass().getSimpleName(), th.toString(), C1.a.j("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                            }
                            eVar.f(B2);
                            return;
                        case 1:
                            C0167a c0167a3 = c0167a;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj).get(0);
                            kotlin.jvm.internal.i.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj3;
                            try {
                                c0167a3.getClass();
                                sharedPreferences = c0167a3.f2923b;
                            } catch (Throwable th2) {
                                B3 = AbstractC0253j.B(th2.getClass().getSimpleName(), th2.toString(), C1.a.j("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                            }
                            if (sharedPreferences == null) {
                                kotlin.jvm.internal.i.i("preferences");
                                throw null;
                            }
                            B3 = AbstractC0083a.m(Boolean.valueOf(sharedPreferences.edit().remove(str).commit()));
                            eVar.f(B3);
                            return;
                        case 2:
                            C0167a c0167a4 = c0167a;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            kotlin.jvm.internal.i.c(obj4, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj4;
                            Object obj5 = list2.get(1);
                            kotlin.jvm.internal.i.c(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj5).booleanValue();
                            try {
                                c0167a4.getClass();
                                sharedPreferences2 = c0167a4.f2923b;
                            } catch (Throwable th3) {
                                B4 = AbstractC0253j.B(th3.getClass().getSimpleName(), th3.toString(), C1.a.j("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                            }
                            if (sharedPreferences2 == null) {
                                kotlin.jvm.internal.i.i("preferences");
                                throw null;
                            }
                            B4 = AbstractC0083a.m(Boolean.valueOf(sharedPreferences2.edit().putBoolean(str2, booleanValue).commit()));
                            eVar.f(B4);
                            return;
                        case 3:
                            C0167a c0167a5 = c0167a;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            kotlin.jvm.internal.i.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj6;
                            Object obj7 = list3.get(1);
                            kotlin.jvm.internal.i.c(obj7, "null cannot be cast to non-null type kotlin.String");
                            try {
                                B5 = AbstractC0083a.m(Boolean.valueOf(c0167a5.c(str3, (String) obj7)));
                            } catch (Throwable th4) {
                                B5 = AbstractC0253j.B(th4.getClass().getSimpleName(), th4.toString(), C1.a.j("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                            }
                            eVar.f(B5);
                            return;
                        case 4:
                            C0167a c0167a6 = c0167a;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            kotlin.jvm.internal.i.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj8;
                            Object obj9 = list4.get(1);
                            kotlin.jvm.internal.i.c(obj9, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj9).longValue();
                            try {
                                c0167a6.getClass();
                                sharedPreferences3 = c0167a6.f2923b;
                            } catch (Throwable th5) {
                                B6 = AbstractC0253j.B(th5.getClass().getSimpleName(), th5.toString(), C1.a.j("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                            }
                            if (sharedPreferences3 == null) {
                                kotlin.jvm.internal.i.i("preferences");
                                throw null;
                            }
                            B6 = AbstractC0083a.m(Boolean.valueOf(sharedPreferences3.edit().putLong(str4, longValue).commit()));
                            eVar.f(B6);
                            return;
                        case 5:
                            C0167a c0167a7 = c0167a;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            kotlin.jvm.internal.i.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj10;
                            Object obj11 = list5.get(1);
                            kotlin.jvm.internal.i.c(obj11, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj11).doubleValue();
                            try {
                                c0167a7.getClass();
                                valueOf = String.valueOf(doubleValue);
                                sharedPreferences4 = c0167a7.f2923b;
                            } catch (Throwable th6) {
                                B7 = AbstractC0253j.B(th6.getClass().getSimpleName(), th6.toString(), C1.a.j("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                            }
                            if (sharedPreferences4 == null) {
                                kotlin.jvm.internal.i.i("preferences");
                                throw null;
                            }
                            B7 = AbstractC0083a.m(Boolean.valueOf(sharedPreferences4.edit().putString(str5, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + valueOf).commit()));
                            eVar.f(B7);
                            return;
                        case 6:
                            C0167a c0167a8 = c0167a;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            kotlin.jvm.internal.i.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj12;
                            Object obj13 = list6.get(1);
                            kotlin.jvm.internal.i.c(obj13, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj13;
                            try {
                                c0167a8.getClass();
                                sharedPreferences5 = c0167a8.f2923b;
                            } catch (Throwable th7) {
                                B8 = AbstractC0253j.B(th7.getClass().getSimpleName(), th7.toString(), C1.a.j("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                            }
                            if (sharedPreferences5 == null) {
                                kotlin.jvm.internal.i.i("preferences");
                                throw null;
                            }
                            B8 = AbstractC0083a.m(Boolean.valueOf(sharedPreferences5.edit().putString(str6, str7).commit()));
                            eVar.f(B8);
                            return;
                        case 7:
                            C0167a c0167a9 = c0167a;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            kotlin.jvm.internal.i.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            kotlin.jvm.internal.i.c(obj15, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list8 = (List) obj15;
                            try {
                                sharedPreferences6 = c0167a9.f2923b;
                            } catch (Throwable th8) {
                                B9 = AbstractC0253j.B(th8.getClass().getSimpleName(), th8.toString(), C1.a.j("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                            }
                            if (sharedPreferences6 == null) {
                                kotlin.jvm.internal.i.i("preferences");
                                throw null;
                            }
                            B9 = AbstractC0083a.m(Boolean.valueOf(sharedPreferences6.edit().putString(str8, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu".concat(c0167a9.f2922a.h(list8))).commit()));
                            eVar.f(B9);
                            return;
                        default:
                            C0167a c0167a10 = c0167a;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj16 = list9.get(0);
                            kotlin.jvm.internal.i.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            try {
                                B10 = AbstractC0083a.m(Boolean.valueOf(c0167a10.a((String) obj16, (List) list9.get(1))));
                            } catch (Throwable th9) {
                                B10 = AbstractC0253j.B(th9.getClass().getSimpleName(), th9.toString(), C1.a.j("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                            }
                            eVar.f(B10);
                            return;
                    }
                }
            });
        } else {
            c0038n5.h(null);
        }
        C0038n c0038n6 = new C0038n(binaryMessenger, C1.a.i("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setEncodedStringList", concat), a(), e2);
        if (c0167a != null) {
            final int i7 = 6;
            c0038n6.h(new InterfaceC0086b() { // from class: f1.c
                @Override // a1.InterfaceC0086b
                public final void g(Object obj, x0.e eVar) {
                    List B2;
                    List B3;
                    SharedPreferences sharedPreferences;
                    List B4;
                    SharedPreferences sharedPreferences2;
                    List B5;
                    List B6;
                    SharedPreferences sharedPreferences3;
                    List B7;
                    String valueOf;
                    SharedPreferences sharedPreferences4;
                    List B8;
                    SharedPreferences sharedPreferences5;
                    List B9;
                    SharedPreferences sharedPreferences6;
                    List B10;
                    switch (i7) {
                        case 0:
                            C0167a c0167a2 = c0167a;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            kotlin.jvm.internal.i.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            try {
                                B2 = AbstractC0083a.m(c0167a2.b((String) obj2, (List) list.get(1)));
                            } catch (Throwable th) {
                                B2 = AbstractC0253j.B(th.getClass().getSimpleName(), th.toString(), C1.a.j("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                            }
                            eVar.f(B2);
                            return;
                        case 1:
                            C0167a c0167a3 = c0167a;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj).get(0);
                            kotlin.jvm.internal.i.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj3;
                            try {
                                c0167a3.getClass();
                                sharedPreferences = c0167a3.f2923b;
                            } catch (Throwable th2) {
                                B3 = AbstractC0253j.B(th2.getClass().getSimpleName(), th2.toString(), C1.a.j("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                            }
                            if (sharedPreferences == null) {
                                kotlin.jvm.internal.i.i("preferences");
                                throw null;
                            }
                            B3 = AbstractC0083a.m(Boolean.valueOf(sharedPreferences.edit().remove(str).commit()));
                            eVar.f(B3);
                            return;
                        case 2:
                            C0167a c0167a4 = c0167a;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            kotlin.jvm.internal.i.c(obj4, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj4;
                            Object obj5 = list2.get(1);
                            kotlin.jvm.internal.i.c(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj5).booleanValue();
                            try {
                                c0167a4.getClass();
                                sharedPreferences2 = c0167a4.f2923b;
                            } catch (Throwable th3) {
                                B4 = AbstractC0253j.B(th3.getClass().getSimpleName(), th3.toString(), C1.a.j("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                            }
                            if (sharedPreferences2 == null) {
                                kotlin.jvm.internal.i.i("preferences");
                                throw null;
                            }
                            B4 = AbstractC0083a.m(Boolean.valueOf(sharedPreferences2.edit().putBoolean(str2, booleanValue).commit()));
                            eVar.f(B4);
                            return;
                        case 3:
                            C0167a c0167a5 = c0167a;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            kotlin.jvm.internal.i.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj6;
                            Object obj7 = list3.get(1);
                            kotlin.jvm.internal.i.c(obj7, "null cannot be cast to non-null type kotlin.String");
                            try {
                                B5 = AbstractC0083a.m(Boolean.valueOf(c0167a5.c(str3, (String) obj7)));
                            } catch (Throwable th4) {
                                B5 = AbstractC0253j.B(th4.getClass().getSimpleName(), th4.toString(), C1.a.j("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                            }
                            eVar.f(B5);
                            return;
                        case 4:
                            C0167a c0167a6 = c0167a;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            kotlin.jvm.internal.i.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj8;
                            Object obj9 = list4.get(1);
                            kotlin.jvm.internal.i.c(obj9, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj9).longValue();
                            try {
                                c0167a6.getClass();
                                sharedPreferences3 = c0167a6.f2923b;
                            } catch (Throwable th5) {
                                B6 = AbstractC0253j.B(th5.getClass().getSimpleName(), th5.toString(), C1.a.j("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                            }
                            if (sharedPreferences3 == null) {
                                kotlin.jvm.internal.i.i("preferences");
                                throw null;
                            }
                            B6 = AbstractC0083a.m(Boolean.valueOf(sharedPreferences3.edit().putLong(str4, longValue).commit()));
                            eVar.f(B6);
                            return;
                        case 5:
                            C0167a c0167a7 = c0167a;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            kotlin.jvm.internal.i.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj10;
                            Object obj11 = list5.get(1);
                            kotlin.jvm.internal.i.c(obj11, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj11).doubleValue();
                            try {
                                c0167a7.getClass();
                                valueOf = String.valueOf(doubleValue);
                                sharedPreferences4 = c0167a7.f2923b;
                            } catch (Throwable th6) {
                                B7 = AbstractC0253j.B(th6.getClass().getSimpleName(), th6.toString(), C1.a.j("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                            }
                            if (sharedPreferences4 == null) {
                                kotlin.jvm.internal.i.i("preferences");
                                throw null;
                            }
                            B7 = AbstractC0083a.m(Boolean.valueOf(sharedPreferences4.edit().putString(str5, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + valueOf).commit()));
                            eVar.f(B7);
                            return;
                        case 6:
                            C0167a c0167a8 = c0167a;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            kotlin.jvm.internal.i.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj12;
                            Object obj13 = list6.get(1);
                            kotlin.jvm.internal.i.c(obj13, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj13;
                            try {
                                c0167a8.getClass();
                                sharedPreferences5 = c0167a8.f2923b;
                            } catch (Throwable th7) {
                                B8 = AbstractC0253j.B(th7.getClass().getSimpleName(), th7.toString(), C1.a.j("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                            }
                            if (sharedPreferences5 == null) {
                                kotlin.jvm.internal.i.i("preferences");
                                throw null;
                            }
                            B8 = AbstractC0083a.m(Boolean.valueOf(sharedPreferences5.edit().putString(str6, str7).commit()));
                            eVar.f(B8);
                            return;
                        case 7:
                            C0167a c0167a9 = c0167a;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            kotlin.jvm.internal.i.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            kotlin.jvm.internal.i.c(obj15, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list8 = (List) obj15;
                            try {
                                sharedPreferences6 = c0167a9.f2923b;
                            } catch (Throwable th8) {
                                B9 = AbstractC0253j.B(th8.getClass().getSimpleName(), th8.toString(), C1.a.j("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                            }
                            if (sharedPreferences6 == null) {
                                kotlin.jvm.internal.i.i("preferences");
                                throw null;
                            }
                            B9 = AbstractC0083a.m(Boolean.valueOf(sharedPreferences6.edit().putString(str8, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu".concat(c0167a9.f2922a.h(list8))).commit()));
                            eVar.f(B9);
                            return;
                        default:
                            C0167a c0167a10 = c0167a;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj16 = list9.get(0);
                            kotlin.jvm.internal.i.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            try {
                                B10 = AbstractC0083a.m(Boolean.valueOf(c0167a10.a((String) obj16, (List) list9.get(1))));
                            } catch (Throwable th9) {
                                B10 = AbstractC0253j.B(th9.getClass().getSimpleName(), th9.toString(), C1.a.j("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                            }
                            eVar.f(B10);
                            return;
                    }
                }
            });
        } else {
            c0038n6.h(null);
        }
        C0038n c0038n7 = new C0038n(binaryMessenger, C1.a.i("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setDeprecatedStringList", concat), a(), e2);
        if (c0167a != null) {
            final int i8 = 7;
            c0038n7.h(new InterfaceC0086b() { // from class: f1.c
                @Override // a1.InterfaceC0086b
                public final void g(Object obj, x0.e eVar) {
                    List B2;
                    List B3;
                    SharedPreferences sharedPreferences;
                    List B4;
                    SharedPreferences sharedPreferences2;
                    List B5;
                    List B6;
                    SharedPreferences sharedPreferences3;
                    List B7;
                    String valueOf;
                    SharedPreferences sharedPreferences4;
                    List B8;
                    SharedPreferences sharedPreferences5;
                    List B9;
                    SharedPreferences sharedPreferences6;
                    List B10;
                    switch (i8) {
                        case 0:
                            C0167a c0167a2 = c0167a;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            kotlin.jvm.internal.i.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            try {
                                B2 = AbstractC0083a.m(c0167a2.b((String) obj2, (List) list.get(1)));
                            } catch (Throwable th) {
                                B2 = AbstractC0253j.B(th.getClass().getSimpleName(), th.toString(), C1.a.j("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                            }
                            eVar.f(B2);
                            return;
                        case 1:
                            C0167a c0167a3 = c0167a;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj).get(0);
                            kotlin.jvm.internal.i.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj3;
                            try {
                                c0167a3.getClass();
                                sharedPreferences = c0167a3.f2923b;
                            } catch (Throwable th2) {
                                B3 = AbstractC0253j.B(th2.getClass().getSimpleName(), th2.toString(), C1.a.j("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                            }
                            if (sharedPreferences == null) {
                                kotlin.jvm.internal.i.i("preferences");
                                throw null;
                            }
                            B3 = AbstractC0083a.m(Boolean.valueOf(sharedPreferences.edit().remove(str).commit()));
                            eVar.f(B3);
                            return;
                        case 2:
                            C0167a c0167a4 = c0167a;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            kotlin.jvm.internal.i.c(obj4, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj4;
                            Object obj5 = list2.get(1);
                            kotlin.jvm.internal.i.c(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj5).booleanValue();
                            try {
                                c0167a4.getClass();
                                sharedPreferences2 = c0167a4.f2923b;
                            } catch (Throwable th3) {
                                B4 = AbstractC0253j.B(th3.getClass().getSimpleName(), th3.toString(), C1.a.j("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                            }
                            if (sharedPreferences2 == null) {
                                kotlin.jvm.internal.i.i("preferences");
                                throw null;
                            }
                            B4 = AbstractC0083a.m(Boolean.valueOf(sharedPreferences2.edit().putBoolean(str2, booleanValue).commit()));
                            eVar.f(B4);
                            return;
                        case 3:
                            C0167a c0167a5 = c0167a;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            kotlin.jvm.internal.i.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj6;
                            Object obj7 = list3.get(1);
                            kotlin.jvm.internal.i.c(obj7, "null cannot be cast to non-null type kotlin.String");
                            try {
                                B5 = AbstractC0083a.m(Boolean.valueOf(c0167a5.c(str3, (String) obj7)));
                            } catch (Throwable th4) {
                                B5 = AbstractC0253j.B(th4.getClass().getSimpleName(), th4.toString(), C1.a.j("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                            }
                            eVar.f(B5);
                            return;
                        case 4:
                            C0167a c0167a6 = c0167a;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            kotlin.jvm.internal.i.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj8;
                            Object obj9 = list4.get(1);
                            kotlin.jvm.internal.i.c(obj9, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj9).longValue();
                            try {
                                c0167a6.getClass();
                                sharedPreferences3 = c0167a6.f2923b;
                            } catch (Throwable th5) {
                                B6 = AbstractC0253j.B(th5.getClass().getSimpleName(), th5.toString(), C1.a.j("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                            }
                            if (sharedPreferences3 == null) {
                                kotlin.jvm.internal.i.i("preferences");
                                throw null;
                            }
                            B6 = AbstractC0083a.m(Boolean.valueOf(sharedPreferences3.edit().putLong(str4, longValue).commit()));
                            eVar.f(B6);
                            return;
                        case 5:
                            C0167a c0167a7 = c0167a;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            kotlin.jvm.internal.i.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj10;
                            Object obj11 = list5.get(1);
                            kotlin.jvm.internal.i.c(obj11, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj11).doubleValue();
                            try {
                                c0167a7.getClass();
                                valueOf = String.valueOf(doubleValue);
                                sharedPreferences4 = c0167a7.f2923b;
                            } catch (Throwable th6) {
                                B7 = AbstractC0253j.B(th6.getClass().getSimpleName(), th6.toString(), C1.a.j("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                            }
                            if (sharedPreferences4 == null) {
                                kotlin.jvm.internal.i.i("preferences");
                                throw null;
                            }
                            B7 = AbstractC0083a.m(Boolean.valueOf(sharedPreferences4.edit().putString(str5, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + valueOf).commit()));
                            eVar.f(B7);
                            return;
                        case 6:
                            C0167a c0167a8 = c0167a;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            kotlin.jvm.internal.i.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj12;
                            Object obj13 = list6.get(1);
                            kotlin.jvm.internal.i.c(obj13, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj13;
                            try {
                                c0167a8.getClass();
                                sharedPreferences5 = c0167a8.f2923b;
                            } catch (Throwable th7) {
                                B8 = AbstractC0253j.B(th7.getClass().getSimpleName(), th7.toString(), C1.a.j("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                            }
                            if (sharedPreferences5 == null) {
                                kotlin.jvm.internal.i.i("preferences");
                                throw null;
                            }
                            B8 = AbstractC0083a.m(Boolean.valueOf(sharedPreferences5.edit().putString(str6, str7).commit()));
                            eVar.f(B8);
                            return;
                        case 7:
                            C0167a c0167a9 = c0167a;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            kotlin.jvm.internal.i.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            kotlin.jvm.internal.i.c(obj15, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list8 = (List) obj15;
                            try {
                                sharedPreferences6 = c0167a9.f2923b;
                            } catch (Throwable th8) {
                                B9 = AbstractC0253j.B(th8.getClass().getSimpleName(), th8.toString(), C1.a.j("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                            }
                            if (sharedPreferences6 == null) {
                                kotlin.jvm.internal.i.i("preferences");
                                throw null;
                            }
                            B9 = AbstractC0083a.m(Boolean.valueOf(sharedPreferences6.edit().putString(str8, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu".concat(c0167a9.f2922a.h(list8))).commit()));
                            eVar.f(B9);
                            return;
                        default:
                            C0167a c0167a10 = c0167a;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj16 = list9.get(0);
                            kotlin.jvm.internal.i.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            try {
                                B10 = AbstractC0083a.m(Boolean.valueOf(c0167a10.a((String) obj16, (List) list9.get(1))));
                            } catch (Throwable th9) {
                                B10 = AbstractC0253j.B(th9.getClass().getSimpleName(), th9.toString(), C1.a.j("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                            }
                            eVar.f(B10);
                            return;
                    }
                }
            });
        } else {
            c0038n7.h(null);
        }
        C0038n c0038n8 = new C0038n(binaryMessenger, C1.a.i("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.clear", concat), a(), e2);
        if (c0167a != null) {
            final int i9 = 8;
            c0038n8.h(new InterfaceC0086b() { // from class: f1.c
                @Override // a1.InterfaceC0086b
                public final void g(Object obj, x0.e eVar) {
                    List B2;
                    List B3;
                    SharedPreferences sharedPreferences;
                    List B4;
                    SharedPreferences sharedPreferences2;
                    List B5;
                    List B6;
                    SharedPreferences sharedPreferences3;
                    List B7;
                    String valueOf;
                    SharedPreferences sharedPreferences4;
                    List B8;
                    SharedPreferences sharedPreferences5;
                    List B9;
                    SharedPreferences sharedPreferences6;
                    List B10;
                    switch (i9) {
                        case 0:
                            C0167a c0167a2 = c0167a;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            kotlin.jvm.internal.i.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            try {
                                B2 = AbstractC0083a.m(c0167a2.b((String) obj2, (List) list.get(1)));
                            } catch (Throwable th) {
                                B2 = AbstractC0253j.B(th.getClass().getSimpleName(), th.toString(), C1.a.j("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                            }
                            eVar.f(B2);
                            return;
                        case 1:
                            C0167a c0167a3 = c0167a;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj).get(0);
                            kotlin.jvm.internal.i.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj3;
                            try {
                                c0167a3.getClass();
                                sharedPreferences = c0167a3.f2923b;
                            } catch (Throwable th2) {
                                B3 = AbstractC0253j.B(th2.getClass().getSimpleName(), th2.toString(), C1.a.j("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                            }
                            if (sharedPreferences == null) {
                                kotlin.jvm.internal.i.i("preferences");
                                throw null;
                            }
                            B3 = AbstractC0083a.m(Boolean.valueOf(sharedPreferences.edit().remove(str).commit()));
                            eVar.f(B3);
                            return;
                        case 2:
                            C0167a c0167a4 = c0167a;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            kotlin.jvm.internal.i.c(obj4, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj4;
                            Object obj5 = list2.get(1);
                            kotlin.jvm.internal.i.c(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj5).booleanValue();
                            try {
                                c0167a4.getClass();
                                sharedPreferences2 = c0167a4.f2923b;
                            } catch (Throwable th3) {
                                B4 = AbstractC0253j.B(th3.getClass().getSimpleName(), th3.toString(), C1.a.j("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                            }
                            if (sharedPreferences2 == null) {
                                kotlin.jvm.internal.i.i("preferences");
                                throw null;
                            }
                            B4 = AbstractC0083a.m(Boolean.valueOf(sharedPreferences2.edit().putBoolean(str2, booleanValue).commit()));
                            eVar.f(B4);
                            return;
                        case 3:
                            C0167a c0167a5 = c0167a;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            kotlin.jvm.internal.i.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj6;
                            Object obj7 = list3.get(1);
                            kotlin.jvm.internal.i.c(obj7, "null cannot be cast to non-null type kotlin.String");
                            try {
                                B5 = AbstractC0083a.m(Boolean.valueOf(c0167a5.c(str3, (String) obj7)));
                            } catch (Throwable th4) {
                                B5 = AbstractC0253j.B(th4.getClass().getSimpleName(), th4.toString(), C1.a.j("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                            }
                            eVar.f(B5);
                            return;
                        case 4:
                            C0167a c0167a6 = c0167a;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            kotlin.jvm.internal.i.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj8;
                            Object obj9 = list4.get(1);
                            kotlin.jvm.internal.i.c(obj9, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj9).longValue();
                            try {
                                c0167a6.getClass();
                                sharedPreferences3 = c0167a6.f2923b;
                            } catch (Throwable th5) {
                                B6 = AbstractC0253j.B(th5.getClass().getSimpleName(), th5.toString(), C1.a.j("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                            }
                            if (sharedPreferences3 == null) {
                                kotlin.jvm.internal.i.i("preferences");
                                throw null;
                            }
                            B6 = AbstractC0083a.m(Boolean.valueOf(sharedPreferences3.edit().putLong(str4, longValue).commit()));
                            eVar.f(B6);
                            return;
                        case 5:
                            C0167a c0167a7 = c0167a;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            kotlin.jvm.internal.i.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj10;
                            Object obj11 = list5.get(1);
                            kotlin.jvm.internal.i.c(obj11, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj11).doubleValue();
                            try {
                                c0167a7.getClass();
                                valueOf = String.valueOf(doubleValue);
                                sharedPreferences4 = c0167a7.f2923b;
                            } catch (Throwable th6) {
                                B7 = AbstractC0253j.B(th6.getClass().getSimpleName(), th6.toString(), C1.a.j("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                            }
                            if (sharedPreferences4 == null) {
                                kotlin.jvm.internal.i.i("preferences");
                                throw null;
                            }
                            B7 = AbstractC0083a.m(Boolean.valueOf(sharedPreferences4.edit().putString(str5, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + valueOf).commit()));
                            eVar.f(B7);
                            return;
                        case 6:
                            C0167a c0167a8 = c0167a;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            kotlin.jvm.internal.i.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj12;
                            Object obj13 = list6.get(1);
                            kotlin.jvm.internal.i.c(obj13, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj13;
                            try {
                                c0167a8.getClass();
                                sharedPreferences5 = c0167a8.f2923b;
                            } catch (Throwable th7) {
                                B8 = AbstractC0253j.B(th7.getClass().getSimpleName(), th7.toString(), C1.a.j("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                            }
                            if (sharedPreferences5 == null) {
                                kotlin.jvm.internal.i.i("preferences");
                                throw null;
                            }
                            B8 = AbstractC0083a.m(Boolean.valueOf(sharedPreferences5.edit().putString(str6, str7).commit()));
                            eVar.f(B8);
                            return;
                        case 7:
                            C0167a c0167a9 = c0167a;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            kotlin.jvm.internal.i.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            kotlin.jvm.internal.i.c(obj15, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list8 = (List) obj15;
                            try {
                                sharedPreferences6 = c0167a9.f2923b;
                            } catch (Throwable th8) {
                                B9 = AbstractC0253j.B(th8.getClass().getSimpleName(), th8.toString(), C1.a.j("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                            }
                            if (sharedPreferences6 == null) {
                                kotlin.jvm.internal.i.i("preferences");
                                throw null;
                            }
                            B9 = AbstractC0083a.m(Boolean.valueOf(sharedPreferences6.edit().putString(str8, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu".concat(c0167a9.f2922a.h(list8))).commit()));
                            eVar.f(B9);
                            return;
                        default:
                            C0167a c0167a10 = c0167a;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj16 = list9.get(0);
                            kotlin.jvm.internal.i.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            try {
                                B10 = AbstractC0083a.m(Boolean.valueOf(c0167a10.a((String) obj16, (List) list9.get(1))));
                            } catch (Throwable th9) {
                                B10 = AbstractC0253j.B(th9.getClass().getSimpleName(), th9.toString(), C1.a.j("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                            }
                            eVar.f(B10);
                            return;
                    }
                }
            });
        } else {
            c0038n8.h(null);
        }
        C0038n c0038n9 = new C0038n(binaryMessenger, C1.a.i("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.getAll", concat), a(), e2);
        if (c0167a == null) {
            c0038n9.h(null);
        } else {
            final int i10 = 0;
            c0038n9.h(new InterfaceC0086b() { // from class: f1.c
                @Override // a1.InterfaceC0086b
                public final void g(Object obj, x0.e eVar) {
                    List B2;
                    List B3;
                    SharedPreferences sharedPreferences;
                    List B4;
                    SharedPreferences sharedPreferences2;
                    List B5;
                    List B6;
                    SharedPreferences sharedPreferences3;
                    List B7;
                    String valueOf;
                    SharedPreferences sharedPreferences4;
                    List B8;
                    SharedPreferences sharedPreferences5;
                    List B9;
                    SharedPreferences sharedPreferences6;
                    List B10;
                    switch (i10) {
                        case 0:
                            C0167a c0167a2 = c0167a;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            kotlin.jvm.internal.i.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            try {
                                B2 = AbstractC0083a.m(c0167a2.b((String) obj2, (List) list.get(1)));
                            } catch (Throwable th) {
                                B2 = AbstractC0253j.B(th.getClass().getSimpleName(), th.toString(), C1.a.j("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                            }
                            eVar.f(B2);
                            return;
                        case 1:
                            C0167a c0167a3 = c0167a;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj).get(0);
                            kotlin.jvm.internal.i.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj3;
                            try {
                                c0167a3.getClass();
                                sharedPreferences = c0167a3.f2923b;
                            } catch (Throwable th2) {
                                B3 = AbstractC0253j.B(th2.getClass().getSimpleName(), th2.toString(), C1.a.j("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                            }
                            if (sharedPreferences == null) {
                                kotlin.jvm.internal.i.i("preferences");
                                throw null;
                            }
                            B3 = AbstractC0083a.m(Boolean.valueOf(sharedPreferences.edit().remove(str).commit()));
                            eVar.f(B3);
                            return;
                        case 2:
                            C0167a c0167a4 = c0167a;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            kotlin.jvm.internal.i.c(obj4, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj4;
                            Object obj5 = list2.get(1);
                            kotlin.jvm.internal.i.c(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj5).booleanValue();
                            try {
                                c0167a4.getClass();
                                sharedPreferences2 = c0167a4.f2923b;
                            } catch (Throwable th3) {
                                B4 = AbstractC0253j.B(th3.getClass().getSimpleName(), th3.toString(), C1.a.j("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                            }
                            if (sharedPreferences2 == null) {
                                kotlin.jvm.internal.i.i("preferences");
                                throw null;
                            }
                            B4 = AbstractC0083a.m(Boolean.valueOf(sharedPreferences2.edit().putBoolean(str2, booleanValue).commit()));
                            eVar.f(B4);
                            return;
                        case 3:
                            C0167a c0167a5 = c0167a;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj6 = list3.get(0);
                            kotlin.jvm.internal.i.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj6;
                            Object obj7 = list3.get(1);
                            kotlin.jvm.internal.i.c(obj7, "null cannot be cast to non-null type kotlin.String");
                            try {
                                B5 = AbstractC0083a.m(Boolean.valueOf(c0167a5.c(str3, (String) obj7)));
                            } catch (Throwable th4) {
                                B5 = AbstractC0253j.B(th4.getClass().getSimpleName(), th4.toString(), C1.a.j("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                            }
                            eVar.f(B5);
                            return;
                        case 4:
                            C0167a c0167a6 = c0167a;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            kotlin.jvm.internal.i.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj8;
                            Object obj9 = list4.get(1);
                            kotlin.jvm.internal.i.c(obj9, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj9).longValue();
                            try {
                                c0167a6.getClass();
                                sharedPreferences3 = c0167a6.f2923b;
                            } catch (Throwable th5) {
                                B6 = AbstractC0253j.B(th5.getClass().getSimpleName(), th5.toString(), C1.a.j("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                            }
                            if (sharedPreferences3 == null) {
                                kotlin.jvm.internal.i.i("preferences");
                                throw null;
                            }
                            B6 = AbstractC0083a.m(Boolean.valueOf(sharedPreferences3.edit().putLong(str4, longValue).commit()));
                            eVar.f(B6);
                            return;
                        case 5:
                            C0167a c0167a7 = c0167a;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            kotlin.jvm.internal.i.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj10;
                            Object obj11 = list5.get(1);
                            kotlin.jvm.internal.i.c(obj11, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj11).doubleValue();
                            try {
                                c0167a7.getClass();
                                valueOf = String.valueOf(doubleValue);
                                sharedPreferences4 = c0167a7.f2923b;
                            } catch (Throwable th6) {
                                B7 = AbstractC0253j.B(th6.getClass().getSimpleName(), th6.toString(), C1.a.j("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                            }
                            if (sharedPreferences4 == null) {
                                kotlin.jvm.internal.i.i("preferences");
                                throw null;
                            }
                            B7 = AbstractC0083a.m(Boolean.valueOf(sharedPreferences4.edit().putString(str5, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + valueOf).commit()));
                            eVar.f(B7);
                            return;
                        case 6:
                            C0167a c0167a8 = c0167a;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            kotlin.jvm.internal.i.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj12;
                            Object obj13 = list6.get(1);
                            kotlin.jvm.internal.i.c(obj13, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj13;
                            try {
                                c0167a8.getClass();
                                sharedPreferences5 = c0167a8.f2923b;
                            } catch (Throwable th7) {
                                B8 = AbstractC0253j.B(th7.getClass().getSimpleName(), th7.toString(), C1.a.j("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                            }
                            if (sharedPreferences5 == null) {
                                kotlin.jvm.internal.i.i("preferences");
                                throw null;
                            }
                            B8 = AbstractC0083a.m(Boolean.valueOf(sharedPreferences5.edit().putString(str6, str7).commit()));
                            eVar.f(B8);
                            return;
                        case 7:
                            C0167a c0167a9 = c0167a;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            kotlin.jvm.internal.i.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            kotlin.jvm.internal.i.c(obj15, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list8 = (List) obj15;
                            try {
                                sharedPreferences6 = c0167a9.f2923b;
                            } catch (Throwable th8) {
                                B9 = AbstractC0253j.B(th8.getClass().getSimpleName(), th8.toString(), C1.a.j("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                            }
                            if (sharedPreferences6 == null) {
                                kotlin.jvm.internal.i.i("preferences");
                                throw null;
                            }
                            B9 = AbstractC0083a.m(Boolean.valueOf(sharedPreferences6.edit().putString(str8, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu".concat(c0167a9.f2922a.h(list8))).commit()));
                            eVar.f(B9);
                            return;
                        default:
                            C0167a c0167a10 = c0167a;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj16 = list9.get(0);
                            kotlin.jvm.internal.i.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            try {
                                B10 = AbstractC0083a.m(Boolean.valueOf(c0167a10.a((String) obj16, (List) list9.get(1))));
                            } catch (Throwable th9) {
                                B10 = AbstractC0253j.B(th9.getClass().getSimpleName(), th9.toString(), C1.a.j("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                            }
                            eVar.f(B10);
                            return;
                    }
                }
            });
        }
    }
}
