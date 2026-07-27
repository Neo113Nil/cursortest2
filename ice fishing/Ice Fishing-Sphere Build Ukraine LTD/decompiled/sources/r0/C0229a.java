package r0;

import D.C0013n;
import L.Q;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import j0.InterfaceC0188a;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import m0.InterfaceC0217b;

/* renamed from: r0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0229a implements InterfaceC0188a {

    /* renamed from: e, reason: collision with root package name */
    public SharedPreferences f2876e;

    /* renamed from: f, reason: collision with root package name */
    public final E.a f2877f = new E.a(24);

    public static void e(m0.f fVar, final C0229a c0229a) {
        E.a d2 = fVar.d(new m0.i());
        C0230b c0230b = C0230b.f2878e;
        C0013n c0013n = new C0013n(fVar, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.remove", c0230b, d2);
        if (c0229a != null) {
            final int i2 = 0;
            c0013n.j(new InterfaceC0217b(c0229a) { // from class: r0.c

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ C0229a f2881f;

                {
                    this.f2881f = c0229a;
                }

                @Override // m0.InterfaceC0217b
                public final void k(Object obj, Q q2) {
                    switch (i2) {
                        case 0:
                            C0229a c0229a2 = this.f2881f;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, Boolean.valueOf(c0229a2.f2876e.edit().remove((String) ((ArrayList) obj).get(0)).commit()));
                            } catch (Throwable th) {
                                arrayList = o.g.A(th);
                            }
                            q2.e(arrayList);
                            break;
                        case 1:
                            C0229a c0229a3 = this.f2881f;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, Boolean.valueOf(c0229a3.f2876e.edit().putBoolean((String) arrayList3.get(0), ((Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (Throwable th2) {
                                arrayList2 = o.g.A(th2);
                            }
                            q2.e(arrayList2);
                            break;
                        case F.k.FLOAT_FIELD_NUMBER /* 2 */:
                            C0229a c0229a4 = this.f2881f;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, c0229a4.d((String) arrayList5.get(0), (String) arrayList5.get(1)));
                            } catch (Throwable th3) {
                                arrayList4 = o.g.A(th3);
                            }
                            q2.e(arrayList4);
                            break;
                        case F.k.INTEGER_FIELD_NUMBER /* 3 */:
                            C0229a c0229a5 = this.f2881f;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                arrayList6.add(0, Boolean.valueOf(c0229a5.f2876e.edit().putLong((String) arrayList7.get(0), ((Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (Throwable th4) {
                                arrayList6 = o.g.A(th4);
                            }
                            q2.e(arrayList6);
                            break;
                        case F.k.LONG_FIELD_NUMBER /* 4 */:
                            C0229a c0229a6 = this.f2881f;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            String str = (String) arrayList9.get(0);
                            Double d3 = (Double) arrayList9.get(1);
                            try {
                                c0229a6.getClass();
                                String d4 = Double.toString(d3.doubleValue());
                                arrayList8.add(0, Boolean.valueOf(c0229a6.f2876e.edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d4).commit()));
                            } catch (Throwable th5) {
                                arrayList8 = o.g.A(th5);
                            }
                            q2.e(arrayList8);
                            break;
                        case F.k.STRING_FIELD_NUMBER /* 5 */:
                            C0229a c0229a7 = this.f2881f;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                arrayList10.add(0, Boolean.valueOf(c0229a7.f2876e.edit().putString((String) arrayList11.get(0), (String) arrayList11.get(1)).commit()));
                            } catch (Throwable th6) {
                                arrayList10 = o.g.A(th6);
                            }
                            q2.e(arrayList10);
                            break;
                        case F.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0229a c0229a8 = this.f2881f;
                            ArrayList arrayList12 = new ArrayList();
                            ArrayList arrayList13 = (ArrayList) obj;
                            String str2 = (String) arrayList13.get(0);
                            List list = (List) arrayList13.get(1);
                            try {
                                arrayList12.add(0, Boolean.valueOf(c0229a8.f2876e.edit().putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0229a8.f2877f.d(list)).commit()));
                            } catch (Throwable th7) {
                                arrayList12 = o.g.A(th7);
                            }
                            q2.e(arrayList12);
                            break;
                        case F.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0229a c0229a9 = this.f2881f;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            try {
                                arrayList14.add(0, c0229a9.a((String) arrayList15.get(0), (List) arrayList15.get(1)));
                            } catch (Throwable th8) {
                                arrayList14 = o.g.A(th8);
                            }
                            q2.e(arrayList14);
                            break;
                        default:
                            C0229a c0229a10 = this.f2881f;
                            ArrayList arrayList16 = new ArrayList();
                            ArrayList arrayList17 = (ArrayList) obj;
                            try {
                                arrayList16.add(0, c0229a10.b((String) arrayList17.get(0), (List) arrayList17.get(1)));
                            } catch (Throwable th9) {
                                arrayList16 = o.g.A(th9);
                            }
                            q2.e(arrayList16);
                            break;
                    }
                }
            });
        } else {
            c0013n.j(null);
        }
        C0013n c0013n2 = new C0013n(fVar, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setBool", c0230b, d2);
        if (c0229a != null) {
            final int i3 = 1;
            c0013n2.j(new InterfaceC0217b(c0229a) { // from class: r0.c

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ C0229a f2881f;

                {
                    this.f2881f = c0229a;
                }

                @Override // m0.InterfaceC0217b
                public final void k(Object obj, Q q2) {
                    switch (i3) {
                        case 0:
                            C0229a c0229a2 = this.f2881f;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, Boolean.valueOf(c0229a2.f2876e.edit().remove((String) ((ArrayList) obj).get(0)).commit()));
                            } catch (Throwable th) {
                                arrayList = o.g.A(th);
                            }
                            q2.e(arrayList);
                            break;
                        case 1:
                            C0229a c0229a3 = this.f2881f;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, Boolean.valueOf(c0229a3.f2876e.edit().putBoolean((String) arrayList3.get(0), ((Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (Throwable th2) {
                                arrayList2 = o.g.A(th2);
                            }
                            q2.e(arrayList2);
                            break;
                        case F.k.FLOAT_FIELD_NUMBER /* 2 */:
                            C0229a c0229a4 = this.f2881f;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, c0229a4.d((String) arrayList5.get(0), (String) arrayList5.get(1)));
                            } catch (Throwable th3) {
                                arrayList4 = o.g.A(th3);
                            }
                            q2.e(arrayList4);
                            break;
                        case F.k.INTEGER_FIELD_NUMBER /* 3 */:
                            C0229a c0229a5 = this.f2881f;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                arrayList6.add(0, Boolean.valueOf(c0229a5.f2876e.edit().putLong((String) arrayList7.get(0), ((Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (Throwable th4) {
                                arrayList6 = o.g.A(th4);
                            }
                            q2.e(arrayList6);
                            break;
                        case F.k.LONG_FIELD_NUMBER /* 4 */:
                            C0229a c0229a6 = this.f2881f;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            String str = (String) arrayList9.get(0);
                            Double d3 = (Double) arrayList9.get(1);
                            try {
                                c0229a6.getClass();
                                String d4 = Double.toString(d3.doubleValue());
                                arrayList8.add(0, Boolean.valueOf(c0229a6.f2876e.edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d4).commit()));
                            } catch (Throwable th5) {
                                arrayList8 = o.g.A(th5);
                            }
                            q2.e(arrayList8);
                            break;
                        case F.k.STRING_FIELD_NUMBER /* 5 */:
                            C0229a c0229a7 = this.f2881f;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                arrayList10.add(0, Boolean.valueOf(c0229a7.f2876e.edit().putString((String) arrayList11.get(0), (String) arrayList11.get(1)).commit()));
                            } catch (Throwable th6) {
                                arrayList10 = o.g.A(th6);
                            }
                            q2.e(arrayList10);
                            break;
                        case F.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0229a c0229a8 = this.f2881f;
                            ArrayList arrayList12 = new ArrayList();
                            ArrayList arrayList13 = (ArrayList) obj;
                            String str2 = (String) arrayList13.get(0);
                            List list = (List) arrayList13.get(1);
                            try {
                                arrayList12.add(0, Boolean.valueOf(c0229a8.f2876e.edit().putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0229a8.f2877f.d(list)).commit()));
                            } catch (Throwable th7) {
                                arrayList12 = o.g.A(th7);
                            }
                            q2.e(arrayList12);
                            break;
                        case F.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0229a c0229a9 = this.f2881f;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            try {
                                arrayList14.add(0, c0229a9.a((String) arrayList15.get(0), (List) arrayList15.get(1)));
                            } catch (Throwable th8) {
                                arrayList14 = o.g.A(th8);
                            }
                            q2.e(arrayList14);
                            break;
                        default:
                            C0229a c0229a10 = this.f2881f;
                            ArrayList arrayList16 = new ArrayList();
                            ArrayList arrayList17 = (ArrayList) obj;
                            try {
                                arrayList16.add(0, c0229a10.b((String) arrayList17.get(0), (List) arrayList17.get(1)));
                            } catch (Throwable th9) {
                                arrayList16 = o.g.A(th9);
                            }
                            q2.e(arrayList16);
                            break;
                    }
                }
            });
        } else {
            c0013n2.j(null);
        }
        C0013n c0013n3 = new C0013n(fVar, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setString", c0230b, d2);
        if (c0229a != null) {
            final int i4 = 2;
            c0013n3.j(new InterfaceC0217b(c0229a) { // from class: r0.c

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ C0229a f2881f;

                {
                    this.f2881f = c0229a;
                }

                @Override // m0.InterfaceC0217b
                public final void k(Object obj, Q q2) {
                    switch (i4) {
                        case 0:
                            C0229a c0229a2 = this.f2881f;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, Boolean.valueOf(c0229a2.f2876e.edit().remove((String) ((ArrayList) obj).get(0)).commit()));
                            } catch (Throwable th) {
                                arrayList = o.g.A(th);
                            }
                            q2.e(arrayList);
                            break;
                        case 1:
                            C0229a c0229a3 = this.f2881f;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, Boolean.valueOf(c0229a3.f2876e.edit().putBoolean((String) arrayList3.get(0), ((Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (Throwable th2) {
                                arrayList2 = o.g.A(th2);
                            }
                            q2.e(arrayList2);
                            break;
                        case F.k.FLOAT_FIELD_NUMBER /* 2 */:
                            C0229a c0229a4 = this.f2881f;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, c0229a4.d((String) arrayList5.get(0), (String) arrayList5.get(1)));
                            } catch (Throwable th3) {
                                arrayList4 = o.g.A(th3);
                            }
                            q2.e(arrayList4);
                            break;
                        case F.k.INTEGER_FIELD_NUMBER /* 3 */:
                            C0229a c0229a5 = this.f2881f;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                arrayList6.add(0, Boolean.valueOf(c0229a5.f2876e.edit().putLong((String) arrayList7.get(0), ((Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (Throwable th4) {
                                arrayList6 = o.g.A(th4);
                            }
                            q2.e(arrayList6);
                            break;
                        case F.k.LONG_FIELD_NUMBER /* 4 */:
                            C0229a c0229a6 = this.f2881f;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            String str = (String) arrayList9.get(0);
                            Double d3 = (Double) arrayList9.get(1);
                            try {
                                c0229a6.getClass();
                                String d4 = Double.toString(d3.doubleValue());
                                arrayList8.add(0, Boolean.valueOf(c0229a6.f2876e.edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d4).commit()));
                            } catch (Throwable th5) {
                                arrayList8 = o.g.A(th5);
                            }
                            q2.e(arrayList8);
                            break;
                        case F.k.STRING_FIELD_NUMBER /* 5 */:
                            C0229a c0229a7 = this.f2881f;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                arrayList10.add(0, Boolean.valueOf(c0229a7.f2876e.edit().putString((String) arrayList11.get(0), (String) arrayList11.get(1)).commit()));
                            } catch (Throwable th6) {
                                arrayList10 = o.g.A(th6);
                            }
                            q2.e(arrayList10);
                            break;
                        case F.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0229a c0229a8 = this.f2881f;
                            ArrayList arrayList12 = new ArrayList();
                            ArrayList arrayList13 = (ArrayList) obj;
                            String str2 = (String) arrayList13.get(0);
                            List list = (List) arrayList13.get(1);
                            try {
                                arrayList12.add(0, Boolean.valueOf(c0229a8.f2876e.edit().putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0229a8.f2877f.d(list)).commit()));
                            } catch (Throwable th7) {
                                arrayList12 = o.g.A(th7);
                            }
                            q2.e(arrayList12);
                            break;
                        case F.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0229a c0229a9 = this.f2881f;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            try {
                                arrayList14.add(0, c0229a9.a((String) arrayList15.get(0), (List) arrayList15.get(1)));
                            } catch (Throwable th8) {
                                arrayList14 = o.g.A(th8);
                            }
                            q2.e(arrayList14);
                            break;
                        default:
                            C0229a c0229a10 = this.f2881f;
                            ArrayList arrayList16 = new ArrayList();
                            ArrayList arrayList17 = (ArrayList) obj;
                            try {
                                arrayList16.add(0, c0229a10.b((String) arrayList17.get(0), (List) arrayList17.get(1)));
                            } catch (Throwable th9) {
                                arrayList16 = o.g.A(th9);
                            }
                            q2.e(arrayList16);
                            break;
                    }
                }
            });
        } else {
            c0013n3.j(null);
        }
        C0013n c0013n4 = new C0013n(fVar, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setInt", c0230b, d2);
        if (c0229a != null) {
            final int i5 = 3;
            c0013n4.j(new InterfaceC0217b(c0229a) { // from class: r0.c

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ C0229a f2881f;

                {
                    this.f2881f = c0229a;
                }

                @Override // m0.InterfaceC0217b
                public final void k(Object obj, Q q2) {
                    switch (i5) {
                        case 0:
                            C0229a c0229a2 = this.f2881f;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, Boolean.valueOf(c0229a2.f2876e.edit().remove((String) ((ArrayList) obj).get(0)).commit()));
                            } catch (Throwable th) {
                                arrayList = o.g.A(th);
                            }
                            q2.e(arrayList);
                            break;
                        case 1:
                            C0229a c0229a3 = this.f2881f;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, Boolean.valueOf(c0229a3.f2876e.edit().putBoolean((String) arrayList3.get(0), ((Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (Throwable th2) {
                                arrayList2 = o.g.A(th2);
                            }
                            q2.e(arrayList2);
                            break;
                        case F.k.FLOAT_FIELD_NUMBER /* 2 */:
                            C0229a c0229a4 = this.f2881f;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, c0229a4.d((String) arrayList5.get(0), (String) arrayList5.get(1)));
                            } catch (Throwable th3) {
                                arrayList4 = o.g.A(th3);
                            }
                            q2.e(arrayList4);
                            break;
                        case F.k.INTEGER_FIELD_NUMBER /* 3 */:
                            C0229a c0229a5 = this.f2881f;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                arrayList6.add(0, Boolean.valueOf(c0229a5.f2876e.edit().putLong((String) arrayList7.get(0), ((Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (Throwable th4) {
                                arrayList6 = o.g.A(th4);
                            }
                            q2.e(arrayList6);
                            break;
                        case F.k.LONG_FIELD_NUMBER /* 4 */:
                            C0229a c0229a6 = this.f2881f;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            String str = (String) arrayList9.get(0);
                            Double d3 = (Double) arrayList9.get(1);
                            try {
                                c0229a6.getClass();
                                String d4 = Double.toString(d3.doubleValue());
                                arrayList8.add(0, Boolean.valueOf(c0229a6.f2876e.edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d4).commit()));
                            } catch (Throwable th5) {
                                arrayList8 = o.g.A(th5);
                            }
                            q2.e(arrayList8);
                            break;
                        case F.k.STRING_FIELD_NUMBER /* 5 */:
                            C0229a c0229a7 = this.f2881f;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                arrayList10.add(0, Boolean.valueOf(c0229a7.f2876e.edit().putString((String) arrayList11.get(0), (String) arrayList11.get(1)).commit()));
                            } catch (Throwable th6) {
                                arrayList10 = o.g.A(th6);
                            }
                            q2.e(arrayList10);
                            break;
                        case F.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0229a c0229a8 = this.f2881f;
                            ArrayList arrayList12 = new ArrayList();
                            ArrayList arrayList13 = (ArrayList) obj;
                            String str2 = (String) arrayList13.get(0);
                            List list = (List) arrayList13.get(1);
                            try {
                                arrayList12.add(0, Boolean.valueOf(c0229a8.f2876e.edit().putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0229a8.f2877f.d(list)).commit()));
                            } catch (Throwable th7) {
                                arrayList12 = o.g.A(th7);
                            }
                            q2.e(arrayList12);
                            break;
                        case F.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0229a c0229a9 = this.f2881f;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            try {
                                arrayList14.add(0, c0229a9.a((String) arrayList15.get(0), (List) arrayList15.get(1)));
                            } catch (Throwable th8) {
                                arrayList14 = o.g.A(th8);
                            }
                            q2.e(arrayList14);
                            break;
                        default:
                            C0229a c0229a10 = this.f2881f;
                            ArrayList arrayList16 = new ArrayList();
                            ArrayList arrayList17 = (ArrayList) obj;
                            try {
                                arrayList16.add(0, c0229a10.b((String) arrayList17.get(0), (List) arrayList17.get(1)));
                            } catch (Throwable th9) {
                                arrayList16 = o.g.A(th9);
                            }
                            q2.e(arrayList16);
                            break;
                    }
                }
            });
        } else {
            c0013n4.j(null);
        }
        C0013n c0013n5 = new C0013n(fVar, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setDouble", c0230b, d2);
        if (c0229a != null) {
            final int i6 = 4;
            c0013n5.j(new InterfaceC0217b(c0229a) { // from class: r0.c

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ C0229a f2881f;

                {
                    this.f2881f = c0229a;
                }

                @Override // m0.InterfaceC0217b
                public final void k(Object obj, Q q2) {
                    switch (i6) {
                        case 0:
                            C0229a c0229a2 = this.f2881f;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, Boolean.valueOf(c0229a2.f2876e.edit().remove((String) ((ArrayList) obj).get(0)).commit()));
                            } catch (Throwable th) {
                                arrayList = o.g.A(th);
                            }
                            q2.e(arrayList);
                            break;
                        case 1:
                            C0229a c0229a3 = this.f2881f;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, Boolean.valueOf(c0229a3.f2876e.edit().putBoolean((String) arrayList3.get(0), ((Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (Throwable th2) {
                                arrayList2 = o.g.A(th2);
                            }
                            q2.e(arrayList2);
                            break;
                        case F.k.FLOAT_FIELD_NUMBER /* 2 */:
                            C0229a c0229a4 = this.f2881f;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, c0229a4.d((String) arrayList5.get(0), (String) arrayList5.get(1)));
                            } catch (Throwable th3) {
                                arrayList4 = o.g.A(th3);
                            }
                            q2.e(arrayList4);
                            break;
                        case F.k.INTEGER_FIELD_NUMBER /* 3 */:
                            C0229a c0229a5 = this.f2881f;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                arrayList6.add(0, Boolean.valueOf(c0229a5.f2876e.edit().putLong((String) arrayList7.get(0), ((Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (Throwable th4) {
                                arrayList6 = o.g.A(th4);
                            }
                            q2.e(arrayList6);
                            break;
                        case F.k.LONG_FIELD_NUMBER /* 4 */:
                            C0229a c0229a6 = this.f2881f;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            String str = (String) arrayList9.get(0);
                            Double d3 = (Double) arrayList9.get(1);
                            try {
                                c0229a6.getClass();
                                String d4 = Double.toString(d3.doubleValue());
                                arrayList8.add(0, Boolean.valueOf(c0229a6.f2876e.edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d4).commit()));
                            } catch (Throwable th5) {
                                arrayList8 = o.g.A(th5);
                            }
                            q2.e(arrayList8);
                            break;
                        case F.k.STRING_FIELD_NUMBER /* 5 */:
                            C0229a c0229a7 = this.f2881f;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                arrayList10.add(0, Boolean.valueOf(c0229a7.f2876e.edit().putString((String) arrayList11.get(0), (String) arrayList11.get(1)).commit()));
                            } catch (Throwable th6) {
                                arrayList10 = o.g.A(th6);
                            }
                            q2.e(arrayList10);
                            break;
                        case F.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0229a c0229a8 = this.f2881f;
                            ArrayList arrayList12 = new ArrayList();
                            ArrayList arrayList13 = (ArrayList) obj;
                            String str2 = (String) arrayList13.get(0);
                            List list = (List) arrayList13.get(1);
                            try {
                                arrayList12.add(0, Boolean.valueOf(c0229a8.f2876e.edit().putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0229a8.f2877f.d(list)).commit()));
                            } catch (Throwable th7) {
                                arrayList12 = o.g.A(th7);
                            }
                            q2.e(arrayList12);
                            break;
                        case F.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0229a c0229a9 = this.f2881f;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            try {
                                arrayList14.add(0, c0229a9.a((String) arrayList15.get(0), (List) arrayList15.get(1)));
                            } catch (Throwable th8) {
                                arrayList14 = o.g.A(th8);
                            }
                            q2.e(arrayList14);
                            break;
                        default:
                            C0229a c0229a10 = this.f2881f;
                            ArrayList arrayList16 = new ArrayList();
                            ArrayList arrayList17 = (ArrayList) obj;
                            try {
                                arrayList16.add(0, c0229a10.b((String) arrayList17.get(0), (List) arrayList17.get(1)));
                            } catch (Throwable th9) {
                                arrayList16 = o.g.A(th9);
                            }
                            q2.e(arrayList16);
                            break;
                    }
                }
            });
        } else {
            c0013n5.j(null);
        }
        C0013n c0013n6 = new C0013n(fVar, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setEncodedStringList", c0230b, d2);
        if (c0229a != null) {
            final int i7 = 5;
            c0013n6.j(new InterfaceC0217b(c0229a) { // from class: r0.c

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ C0229a f2881f;

                {
                    this.f2881f = c0229a;
                }

                @Override // m0.InterfaceC0217b
                public final void k(Object obj, Q q2) {
                    switch (i7) {
                        case 0:
                            C0229a c0229a2 = this.f2881f;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, Boolean.valueOf(c0229a2.f2876e.edit().remove((String) ((ArrayList) obj).get(0)).commit()));
                            } catch (Throwable th) {
                                arrayList = o.g.A(th);
                            }
                            q2.e(arrayList);
                            break;
                        case 1:
                            C0229a c0229a3 = this.f2881f;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, Boolean.valueOf(c0229a3.f2876e.edit().putBoolean((String) arrayList3.get(0), ((Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (Throwable th2) {
                                arrayList2 = o.g.A(th2);
                            }
                            q2.e(arrayList2);
                            break;
                        case F.k.FLOAT_FIELD_NUMBER /* 2 */:
                            C0229a c0229a4 = this.f2881f;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, c0229a4.d((String) arrayList5.get(0), (String) arrayList5.get(1)));
                            } catch (Throwable th3) {
                                arrayList4 = o.g.A(th3);
                            }
                            q2.e(arrayList4);
                            break;
                        case F.k.INTEGER_FIELD_NUMBER /* 3 */:
                            C0229a c0229a5 = this.f2881f;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                arrayList6.add(0, Boolean.valueOf(c0229a5.f2876e.edit().putLong((String) arrayList7.get(0), ((Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (Throwable th4) {
                                arrayList6 = o.g.A(th4);
                            }
                            q2.e(arrayList6);
                            break;
                        case F.k.LONG_FIELD_NUMBER /* 4 */:
                            C0229a c0229a6 = this.f2881f;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            String str = (String) arrayList9.get(0);
                            Double d3 = (Double) arrayList9.get(1);
                            try {
                                c0229a6.getClass();
                                String d4 = Double.toString(d3.doubleValue());
                                arrayList8.add(0, Boolean.valueOf(c0229a6.f2876e.edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d4).commit()));
                            } catch (Throwable th5) {
                                arrayList8 = o.g.A(th5);
                            }
                            q2.e(arrayList8);
                            break;
                        case F.k.STRING_FIELD_NUMBER /* 5 */:
                            C0229a c0229a7 = this.f2881f;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                arrayList10.add(0, Boolean.valueOf(c0229a7.f2876e.edit().putString((String) arrayList11.get(0), (String) arrayList11.get(1)).commit()));
                            } catch (Throwable th6) {
                                arrayList10 = o.g.A(th6);
                            }
                            q2.e(arrayList10);
                            break;
                        case F.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0229a c0229a8 = this.f2881f;
                            ArrayList arrayList12 = new ArrayList();
                            ArrayList arrayList13 = (ArrayList) obj;
                            String str2 = (String) arrayList13.get(0);
                            List list = (List) arrayList13.get(1);
                            try {
                                arrayList12.add(0, Boolean.valueOf(c0229a8.f2876e.edit().putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0229a8.f2877f.d(list)).commit()));
                            } catch (Throwable th7) {
                                arrayList12 = o.g.A(th7);
                            }
                            q2.e(arrayList12);
                            break;
                        case F.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0229a c0229a9 = this.f2881f;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            try {
                                arrayList14.add(0, c0229a9.a((String) arrayList15.get(0), (List) arrayList15.get(1)));
                            } catch (Throwable th8) {
                                arrayList14 = o.g.A(th8);
                            }
                            q2.e(arrayList14);
                            break;
                        default:
                            C0229a c0229a10 = this.f2881f;
                            ArrayList arrayList16 = new ArrayList();
                            ArrayList arrayList17 = (ArrayList) obj;
                            try {
                                arrayList16.add(0, c0229a10.b((String) arrayList17.get(0), (List) arrayList17.get(1)));
                            } catch (Throwable th9) {
                                arrayList16 = o.g.A(th9);
                            }
                            q2.e(arrayList16);
                            break;
                    }
                }
            });
        } else {
            c0013n6.j(null);
        }
        C0013n c0013n7 = new C0013n(fVar, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setDeprecatedStringList", c0230b, d2);
        if (c0229a != null) {
            final int i8 = 6;
            c0013n7.j(new InterfaceC0217b(c0229a) { // from class: r0.c

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ C0229a f2881f;

                {
                    this.f2881f = c0229a;
                }

                @Override // m0.InterfaceC0217b
                public final void k(Object obj, Q q2) {
                    switch (i8) {
                        case 0:
                            C0229a c0229a2 = this.f2881f;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, Boolean.valueOf(c0229a2.f2876e.edit().remove((String) ((ArrayList) obj).get(0)).commit()));
                            } catch (Throwable th) {
                                arrayList = o.g.A(th);
                            }
                            q2.e(arrayList);
                            break;
                        case 1:
                            C0229a c0229a3 = this.f2881f;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, Boolean.valueOf(c0229a3.f2876e.edit().putBoolean((String) arrayList3.get(0), ((Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (Throwable th2) {
                                arrayList2 = o.g.A(th2);
                            }
                            q2.e(arrayList2);
                            break;
                        case F.k.FLOAT_FIELD_NUMBER /* 2 */:
                            C0229a c0229a4 = this.f2881f;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, c0229a4.d((String) arrayList5.get(0), (String) arrayList5.get(1)));
                            } catch (Throwable th3) {
                                arrayList4 = o.g.A(th3);
                            }
                            q2.e(arrayList4);
                            break;
                        case F.k.INTEGER_FIELD_NUMBER /* 3 */:
                            C0229a c0229a5 = this.f2881f;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                arrayList6.add(0, Boolean.valueOf(c0229a5.f2876e.edit().putLong((String) arrayList7.get(0), ((Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (Throwable th4) {
                                arrayList6 = o.g.A(th4);
                            }
                            q2.e(arrayList6);
                            break;
                        case F.k.LONG_FIELD_NUMBER /* 4 */:
                            C0229a c0229a6 = this.f2881f;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            String str = (String) arrayList9.get(0);
                            Double d3 = (Double) arrayList9.get(1);
                            try {
                                c0229a6.getClass();
                                String d4 = Double.toString(d3.doubleValue());
                                arrayList8.add(0, Boolean.valueOf(c0229a6.f2876e.edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d4).commit()));
                            } catch (Throwable th5) {
                                arrayList8 = o.g.A(th5);
                            }
                            q2.e(arrayList8);
                            break;
                        case F.k.STRING_FIELD_NUMBER /* 5 */:
                            C0229a c0229a7 = this.f2881f;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                arrayList10.add(0, Boolean.valueOf(c0229a7.f2876e.edit().putString((String) arrayList11.get(0), (String) arrayList11.get(1)).commit()));
                            } catch (Throwable th6) {
                                arrayList10 = o.g.A(th6);
                            }
                            q2.e(arrayList10);
                            break;
                        case F.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0229a c0229a8 = this.f2881f;
                            ArrayList arrayList12 = new ArrayList();
                            ArrayList arrayList13 = (ArrayList) obj;
                            String str2 = (String) arrayList13.get(0);
                            List list = (List) arrayList13.get(1);
                            try {
                                arrayList12.add(0, Boolean.valueOf(c0229a8.f2876e.edit().putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0229a8.f2877f.d(list)).commit()));
                            } catch (Throwable th7) {
                                arrayList12 = o.g.A(th7);
                            }
                            q2.e(arrayList12);
                            break;
                        case F.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0229a c0229a9 = this.f2881f;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            try {
                                arrayList14.add(0, c0229a9.a((String) arrayList15.get(0), (List) arrayList15.get(1)));
                            } catch (Throwable th8) {
                                arrayList14 = o.g.A(th8);
                            }
                            q2.e(arrayList14);
                            break;
                        default:
                            C0229a c0229a10 = this.f2881f;
                            ArrayList arrayList16 = new ArrayList();
                            ArrayList arrayList17 = (ArrayList) obj;
                            try {
                                arrayList16.add(0, c0229a10.b((String) arrayList17.get(0), (List) arrayList17.get(1)));
                            } catch (Throwable th9) {
                                arrayList16 = o.g.A(th9);
                            }
                            q2.e(arrayList16);
                            break;
                    }
                }
            });
        } else {
            c0013n7.j(null);
        }
        C0013n c0013n8 = new C0013n(fVar, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.clear", c0230b, d2);
        if (c0229a != null) {
            final int i9 = 7;
            c0013n8.j(new InterfaceC0217b(c0229a) { // from class: r0.c

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ C0229a f2881f;

                {
                    this.f2881f = c0229a;
                }

                @Override // m0.InterfaceC0217b
                public final void k(Object obj, Q q2) {
                    switch (i9) {
                        case 0:
                            C0229a c0229a2 = this.f2881f;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, Boolean.valueOf(c0229a2.f2876e.edit().remove((String) ((ArrayList) obj).get(0)).commit()));
                            } catch (Throwable th) {
                                arrayList = o.g.A(th);
                            }
                            q2.e(arrayList);
                            break;
                        case 1:
                            C0229a c0229a3 = this.f2881f;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, Boolean.valueOf(c0229a3.f2876e.edit().putBoolean((String) arrayList3.get(0), ((Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (Throwable th2) {
                                arrayList2 = o.g.A(th2);
                            }
                            q2.e(arrayList2);
                            break;
                        case F.k.FLOAT_FIELD_NUMBER /* 2 */:
                            C0229a c0229a4 = this.f2881f;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, c0229a4.d((String) arrayList5.get(0), (String) arrayList5.get(1)));
                            } catch (Throwable th3) {
                                arrayList4 = o.g.A(th3);
                            }
                            q2.e(arrayList4);
                            break;
                        case F.k.INTEGER_FIELD_NUMBER /* 3 */:
                            C0229a c0229a5 = this.f2881f;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                arrayList6.add(0, Boolean.valueOf(c0229a5.f2876e.edit().putLong((String) arrayList7.get(0), ((Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (Throwable th4) {
                                arrayList6 = o.g.A(th4);
                            }
                            q2.e(arrayList6);
                            break;
                        case F.k.LONG_FIELD_NUMBER /* 4 */:
                            C0229a c0229a6 = this.f2881f;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            String str = (String) arrayList9.get(0);
                            Double d3 = (Double) arrayList9.get(1);
                            try {
                                c0229a6.getClass();
                                String d4 = Double.toString(d3.doubleValue());
                                arrayList8.add(0, Boolean.valueOf(c0229a6.f2876e.edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d4).commit()));
                            } catch (Throwable th5) {
                                arrayList8 = o.g.A(th5);
                            }
                            q2.e(arrayList8);
                            break;
                        case F.k.STRING_FIELD_NUMBER /* 5 */:
                            C0229a c0229a7 = this.f2881f;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                arrayList10.add(0, Boolean.valueOf(c0229a7.f2876e.edit().putString((String) arrayList11.get(0), (String) arrayList11.get(1)).commit()));
                            } catch (Throwable th6) {
                                arrayList10 = o.g.A(th6);
                            }
                            q2.e(arrayList10);
                            break;
                        case F.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0229a c0229a8 = this.f2881f;
                            ArrayList arrayList12 = new ArrayList();
                            ArrayList arrayList13 = (ArrayList) obj;
                            String str2 = (String) arrayList13.get(0);
                            List list = (List) arrayList13.get(1);
                            try {
                                arrayList12.add(0, Boolean.valueOf(c0229a8.f2876e.edit().putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0229a8.f2877f.d(list)).commit()));
                            } catch (Throwable th7) {
                                arrayList12 = o.g.A(th7);
                            }
                            q2.e(arrayList12);
                            break;
                        case F.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0229a c0229a9 = this.f2881f;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            try {
                                arrayList14.add(0, c0229a9.a((String) arrayList15.get(0), (List) arrayList15.get(1)));
                            } catch (Throwable th8) {
                                arrayList14 = o.g.A(th8);
                            }
                            q2.e(arrayList14);
                            break;
                        default:
                            C0229a c0229a10 = this.f2881f;
                            ArrayList arrayList16 = new ArrayList();
                            ArrayList arrayList17 = (ArrayList) obj;
                            try {
                                arrayList16.add(0, c0229a10.b((String) arrayList17.get(0), (List) arrayList17.get(1)));
                            } catch (Throwable th9) {
                                arrayList16 = o.g.A(th9);
                            }
                            q2.e(arrayList16);
                            break;
                    }
                }
            });
        } else {
            c0013n8.j(null);
        }
        C0013n c0013n9 = new C0013n(fVar, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.getAll", c0230b, d2);
        if (c0229a == null) {
            c0013n9.j(null);
        } else {
            final int i10 = 8;
            c0013n9.j(new InterfaceC0217b(c0229a) { // from class: r0.c

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ C0229a f2881f;

                {
                    this.f2881f = c0229a;
                }

                @Override // m0.InterfaceC0217b
                public final void k(Object obj, Q q2) {
                    switch (i10) {
                        case 0:
                            C0229a c0229a2 = this.f2881f;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, Boolean.valueOf(c0229a2.f2876e.edit().remove((String) ((ArrayList) obj).get(0)).commit()));
                            } catch (Throwable th) {
                                arrayList = o.g.A(th);
                            }
                            q2.e(arrayList);
                            break;
                        case 1:
                            C0229a c0229a3 = this.f2881f;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, Boolean.valueOf(c0229a3.f2876e.edit().putBoolean((String) arrayList3.get(0), ((Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (Throwable th2) {
                                arrayList2 = o.g.A(th2);
                            }
                            q2.e(arrayList2);
                            break;
                        case F.k.FLOAT_FIELD_NUMBER /* 2 */:
                            C0229a c0229a4 = this.f2881f;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, c0229a4.d((String) arrayList5.get(0), (String) arrayList5.get(1)));
                            } catch (Throwable th3) {
                                arrayList4 = o.g.A(th3);
                            }
                            q2.e(arrayList4);
                            break;
                        case F.k.INTEGER_FIELD_NUMBER /* 3 */:
                            C0229a c0229a5 = this.f2881f;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                arrayList6.add(0, Boolean.valueOf(c0229a5.f2876e.edit().putLong((String) arrayList7.get(0), ((Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (Throwable th4) {
                                arrayList6 = o.g.A(th4);
                            }
                            q2.e(arrayList6);
                            break;
                        case F.k.LONG_FIELD_NUMBER /* 4 */:
                            C0229a c0229a6 = this.f2881f;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            String str = (String) arrayList9.get(0);
                            Double d3 = (Double) arrayList9.get(1);
                            try {
                                c0229a6.getClass();
                                String d4 = Double.toString(d3.doubleValue());
                                arrayList8.add(0, Boolean.valueOf(c0229a6.f2876e.edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d4).commit()));
                            } catch (Throwable th5) {
                                arrayList8 = o.g.A(th5);
                            }
                            q2.e(arrayList8);
                            break;
                        case F.k.STRING_FIELD_NUMBER /* 5 */:
                            C0229a c0229a7 = this.f2881f;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                arrayList10.add(0, Boolean.valueOf(c0229a7.f2876e.edit().putString((String) arrayList11.get(0), (String) arrayList11.get(1)).commit()));
                            } catch (Throwable th6) {
                                arrayList10 = o.g.A(th6);
                            }
                            q2.e(arrayList10);
                            break;
                        case F.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0229a c0229a8 = this.f2881f;
                            ArrayList arrayList12 = new ArrayList();
                            ArrayList arrayList13 = (ArrayList) obj;
                            String str2 = (String) arrayList13.get(0);
                            List list = (List) arrayList13.get(1);
                            try {
                                arrayList12.add(0, Boolean.valueOf(c0229a8.f2876e.edit().putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0229a8.f2877f.d(list)).commit()));
                            } catch (Throwable th7) {
                                arrayList12 = o.g.A(th7);
                            }
                            q2.e(arrayList12);
                            break;
                        case F.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0229a c0229a9 = this.f2881f;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            try {
                                arrayList14.add(0, c0229a9.a((String) arrayList15.get(0), (List) arrayList15.get(1)));
                            } catch (Throwable th8) {
                                arrayList14 = o.g.A(th8);
                            }
                            q2.e(arrayList14);
                            break;
                        default:
                            C0229a c0229a10 = this.f2881f;
                            ArrayList arrayList16 = new ArrayList();
                            ArrayList arrayList17 = (ArrayList) obj;
                            try {
                                arrayList16.add(0, c0229a10.b((String) arrayList17.get(0), (List) arrayList17.get(1)));
                            } catch (Throwable th9) {
                                arrayList16 = o.g.A(th9);
                            }
                            q2.e(arrayList16);
                            break;
                    }
                }
            });
        }
    }

    public final Boolean a(String str, List list) {
        SharedPreferences.Editor edit = this.f2876e.edit();
        Map<String, ?> all = this.f2876e.getAll();
        ArrayList arrayList = new ArrayList();
        for (String str2 : all.keySet()) {
            if (str2.startsWith(str) && (list == null || list.contains(str2))) {
                arrayList.add(str2);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            edit.remove((String) it.next());
        }
        return Boolean.valueOf(edit.commit());
    }

    public final HashMap b(String str, List list) {
        Object obj;
        Set hashSet = list == null ? null : new HashSet(list);
        Map<String, ?> all = this.f2876e.getAll();
        HashMap hashMap = new HashMap();
        for (String str2 : all.keySet()) {
            if (str2.startsWith(str) && (hashSet == null || hashSet.contains(str2))) {
                Object obj2 = all.get(str2);
                Objects.requireNonNull(obj2);
                boolean z2 = obj2 instanceof String;
                E.a aVar = this.f2877f;
                if (z2) {
                    String str3 = (String) obj2;
                    if (str3.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu")) {
                        if (!str3.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!")) {
                            obj2 = aVar.c(str3.substring(40));
                        }
                    } else if (str3.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBCaWdJbnRlZ2Vy")) {
                        obj = new BigInteger(str3.substring(44), 36);
                        obj2 = obj;
                    } else if (str3.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu")) {
                        obj2 = Double.valueOf(str3.substring(40));
                    }
                    hashMap.put(str2, obj2);
                } else {
                    if (obj2 instanceof Set) {
                        ArrayList arrayList = new ArrayList((Set) obj2);
                        this.f2876e.edit().remove(str2).putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + aVar.d(arrayList)).apply();
                        obj = arrayList;
                        obj2 = obj;
                    }
                    hashMap.put(str2, obj2);
                }
            }
        }
        return hashMap;
    }

    @Override // j0.InterfaceC0188a
    public final void c(Q q2) {
        e((m0.f) q2.f520g, null);
    }

    public final Boolean d(String str, String str2) {
        if (str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu") || str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBCaWdJbnRlZ2Vy") || str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu")) {
            throw new RuntimeException("StorageError: This string cannot be stored as it clashes with special identifier prefixes");
        }
        return Boolean.valueOf(this.f2876e.edit().putString(str, str2).commit());
    }

    @Override // j0.InterfaceC0188a
    public final void h(Q q2) {
        m0.f fVar = (m0.f) q2.f520g;
        this.f2876e = ((Context) q2.f519f).getSharedPreferences("FlutterSharedPreferences", 0);
        try {
            e(fVar, this);
        } catch (Exception e2) {
            Log.e("SharedPreferencesPlugin", "Received exception while setting up SharedPreferencesPlugin", e2);
        }
    }
}
