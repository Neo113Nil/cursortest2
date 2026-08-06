package R1;

import A1.C0015p;
import C.o;
import C.p;
import C.q;
import C.r;
import J1.t;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.util.Log;
import android.view.ActionMode;
import android.view.Display;
import android.view.WindowManager;
import android.view.WindowMetrics;
import android.widget.TextView;
import androidx.datastore.preferences.protobuf.C0107g;
import d0.C0143a;
import h.C0223t;
import h1.C0235e;
import io.flutter.embedding.engine.FlutterEngine;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.KotlinVersion;
import n0.InterfaceC0989c;
import w.C1056b;
import y.F;
import y.G;
import y.H;
import y.Q;

/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static long f1762a;

    /* renamed from: b, reason: collision with root package name */
    public static Method f1763b;

    /* renamed from: c, reason: collision with root package name */
    public static Method f1764c;

    /* renamed from: d, reason: collision with root package name */
    public static Method f1765d;

    /* renamed from: e, reason: collision with root package name */
    public static Boolean f1766e;

    /* renamed from: f, reason: collision with root package name */
    public static Boolean f1767f;

    /* renamed from: g, reason: collision with root package name */
    public static Boolean f1768g;

    /* renamed from: h, reason: collision with root package name */
    public static Boolean f1769h;

    public static void C(TextView textView, int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException();
        }
        if (Build.VERSION.SDK_INT >= 28) {
            q.d(textView, i2);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i3 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i2 > Math.abs(i3)) {
            textView.setPadding(textView.getPaddingLeft(), i2 + i3, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void D(TextView textView, int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException();
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i3 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i2 > Math.abs(i3)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i2 - i3);
        }
    }

    public static void E(Parcel parcel, int i2) {
        parcel.setDataPosition(parcel.dataPosition() + y(parcel, i2));
    }

    public static final void F(Object obj) {
        if (obj instanceof C0235e) {
            throw ((C0235e) obj).f3388a;
        }
    }

    public static String G(String str) {
        return str.length() <= 127 ? str : str.substring(0, 127);
    }

    public static int H(Parcel parcel) {
        int readInt = parcel.readInt();
        int y2 = y(parcel, readInt);
        char c2 = (char) readInt;
        int dataPosition = parcel.dataPosition();
        if (c2 != 20293) {
            throw new C0015p("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(readInt))), parcel);
        }
        int i2 = y2 + dataPosition;
        if (i2 < dataPosition || i2 > parcel.dataSize()) {
            throw new C0015p(C1.a.h("Size read is invalid start=", dataPosition, i2, " end="), parcel);
        }
        return i2;
    }

    public static ActionMode.Callback I(ActionMode.Callback callback, TextView textView) {
        int i2 = Build.VERSION.SDK_INT;
        return (i2 < 26 || i2 > 27 || (callback instanceof r) || callback == null) ? callback : new r(callback, textView);
    }

    public static ArrayList J(Throwable th) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(th.toString());
        arrayList.add(th.getClass().getSimpleName());
        arrayList.add("Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
        return arrayList;
    }

    public static void K(Parcel parcel, int i2, int i3) {
        int y2 = y(parcel, i2);
        if (y2 == i3) {
            return;
        }
        String hexString = Integer.toHexString(y2);
        StringBuilder sb = new StringBuilder("Expected size ");
        sb.append(i3);
        sb.append(" got ");
        sb.append(y2);
        sb.append(" (0x");
        throw new C0015p(C1.a.k(sb, hexString, ")"), parcel);
    }

    public static void a(StringBuilder sb, Object obj, t1.l lVar) {
        if (lVar != null) {
            sb.append((CharSequence) lVar.invoke(obj));
            return;
        }
        if (obj == null ? true : obj instanceof CharSequence) {
            sb.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            sb.append(((Character) obj).charValue());
        } else {
            sb.append((CharSequence) obj.toString());
        }
    }

    public static void d(long j2, W1.g gVar, int i2, ArrayList arrayList, int i3, int i4, ArrayList arrayList2) {
        int i5;
        int i6;
        int i7;
        int i8;
        W1.g gVar2;
        int i9 = i2;
        if (i3 >= i4) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        for (int i10 = i3; i10 < i4; i10++) {
            if (((W1.j) arrayList.get(i10)).a() < i9) {
                throw new IllegalArgumentException("Failed requirement.");
            }
        }
        W1.j jVar = (W1.j) arrayList.get(i3);
        W1.j jVar2 = (W1.j) arrayList.get(i4 - 1);
        int i11 = -1;
        if (i9 == jVar.a()) {
            int intValue = ((Number) arrayList2.get(i3)).intValue();
            int i12 = i3 + 1;
            W1.j jVar3 = (W1.j) arrayList.get(i12);
            i5 = i12;
            i6 = intValue;
            jVar = jVar3;
        } else {
            i5 = i3;
            i6 = -1;
        }
        if (jVar.d(i9) == jVar2.d(i9)) {
            int min = Math.min(jVar.a(), jVar2.a());
            int i13 = 0;
            for (int i14 = i9; i14 < min && jVar.d(i14) == jVar2.d(i14); i14++) {
                i13++;
            }
            long j3 = 4;
            long j4 = (gVar.f1875b / j3) + j2 + 2 + i13 + 1;
            gVar.w(-i13);
            gVar.w(i6);
            int i15 = i13 + i9;
            while (i9 < i15) {
                gVar.w(jVar.d(i9) & KotlinVersion.MAX_COMPONENT_VALUE);
                i9++;
            }
            if (i5 + 1 == i4) {
                if (i15 != ((W1.j) arrayList.get(i5)).a()) {
                    throw new IllegalStateException("Check failed.");
                }
                gVar.w(((Number) arrayList2.get(i5)).intValue());
                return;
            } else {
                W1.g gVar3 = new W1.g();
                gVar.w(((int) ((gVar3.f1875b / j3) + j4)) * (-1));
                d(j4, gVar3, i15, arrayList, i5, i4, arrayList2);
                gVar.t(gVar3);
                return;
            }
        }
        int i16 = 1;
        for (int i17 = i5 + 1; i17 < i4; i17++) {
            if (((W1.j) arrayList.get(i17 - 1)).d(i9) != ((W1.j) arrayList.get(i17)).d(i9)) {
                i16++;
            }
        }
        long j5 = 4;
        long j6 = (gVar.f1875b / j5) + j2 + 2 + (i16 * 2);
        gVar.w(i16);
        gVar.w(i6);
        for (int i18 = i5; i18 < i4; i18++) {
            int d2 = ((W1.j) arrayList.get(i18)).d(i9);
            if (i18 == i5 || d2 != ((W1.j) arrayList.get(i18 - 1)).d(i9)) {
                gVar.w(d2 & KotlinVersion.MAX_COMPONENT_VALUE);
            }
        }
        W1.g gVar4 = new W1.g();
        int i19 = i5;
        while (i19 < i4) {
            byte d3 = ((W1.j) arrayList.get(i19)).d(i9);
            int i20 = i19 + 1;
            int i21 = i20;
            while (true) {
                if (i21 >= i4) {
                    i7 = i4;
                    break;
                } else {
                    if (d3 != ((W1.j) arrayList.get(i21)).d(i9)) {
                        i7 = i21;
                        break;
                    }
                    i21++;
                }
            }
            if (i20 == i7 && i9 + 1 == ((W1.j) arrayList.get(i19)).a()) {
                gVar.w(((Number) arrayList2.get(i19)).intValue());
                i8 = i7;
                gVar2 = gVar4;
            } else {
                gVar.w(((int) ((gVar4.f1875b / j5) + j6)) * i11);
                i8 = i7;
                gVar2 = gVar4;
                d(j6, gVar4, i9 + 1, arrayList, i19, i7, arrayList2);
            }
            gVar4 = gVar2;
            i19 = i8;
            i11 = -1;
        }
        gVar.t(gVar4);
    }

    public static void e(Context context, g1.b bVar) {
        Rect rect;
        Q _windowInsetsCompat;
        WindowMetrics maximumWindowMetrics;
        Activity p2 = p(context);
        if (p2 != null) {
            Z.l.f1950a.getClass();
            int i2 = Z.m.f1951b;
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 30) {
                maximumWindowMetrics = ((WindowManager) p2.getSystemService(WindowManager.class)).getMaximumWindowMetrics();
                rect = maximumWindowMetrics.getBounds();
                kotlin.jvm.internal.i.d(rect, "wm.maximumWindowMetrics.bounds");
            } else {
                Object systemService = p2.getSystemService("window");
                kotlin.jvm.internal.i.c(systemService, "null cannot be cast to non-null type android.view.WindowManager");
                Display display = ((WindowManager) systemService).getDefaultDisplay();
                kotlin.jvm.internal.i.d(display, "display");
                Point point = new Point();
                display.getRealSize(point);
                rect = new Rect(0, 0, point.x, point.y);
            }
            if (i3 < 30) {
                _windowInsetsCompat = (i3 >= 30 ? new H() : i3 >= 29 ? new G() : new F()).b();
                kotlin.jvm.internal.i.d(_windowInsetsCompat, "{\n            WindowInse…ilder().build()\n        }");
            } else {
                if (i3 < 30) {
                    throw new Exception("Incompatible SDK version");
                }
                _windowInsetsCompat = C0143a.f2826a.a(p2);
            }
            int i4 = rect.left;
            int i5 = rect.top;
            int i6 = rect.right;
            int i7 = rect.bottom;
            if (i4 > i6) {
                throw new IllegalArgumentException(C1.a.h("Left must be less than or equal to right, left: ", i4, i6, ", right: ").toString());
            }
            if (i5 > i7) {
                throw new IllegalArgumentException(C1.a.h("top must be less than or equal to bottom, top: ", i5, i7, ", bottom: ").toString());
            }
            kotlin.jvm.internal.i.e(_windowInsetsCompat, "_windowInsetsCompat");
            ((FlutterEngine) bVar).f7706a.updateDisplayMetrics(0, new Rect(i4, i5, i6, i7).width(), new Rect(i4, i5, i6, i7).height(), context.getResources().getDisplayMetrics().density);
        }
    }

    public static final long g(InputStream inputStream, OutputStream outputStream, int i2) {
        byte[] bArr = new byte[i2];
        int read = inputStream.read(bArr);
        long j2 = 0;
        while (read >= 0) {
            outputStream.write(bArr, 0, read);
            j2 += read;
            read = inputStream.read(bArr);
        }
        return j2;
    }

    public static final C0235e h(Throwable exception) {
        kotlin.jvm.internal.i.e(exception, "exception");
        return new C0235e(exception);
    }

    public static Parcelable i(Parcel parcel, int i2, Parcelable.Creator creator) {
        int y2 = y(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (y2 == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + y2);
        return parcelable;
    }

    public static String j(Parcel parcel, int i2) {
        int y2 = y(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (y2 == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + y2);
        return readString;
    }

    public static Object[] k(Parcel parcel, int i2, Parcelable.Creator creator) {
        int y2 = y(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (y2 == 0) {
            return null;
        }
        Object[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + y2);
        return createTypedArray;
    }

    public static int l(String str, int i2, int i3, boolean z2) {
        while (i2 < i3) {
            int i4 = i2 + 1;
            char charAt = str.charAt(i2);
            if (((charAt < ' ' && charAt != '\t') || charAt >= 127 || (charAt <= '9' && '0' <= charAt) || ((charAt <= 'z' && 'a' <= charAt) || ((charAt <= 'Z' && 'A' <= charAt) || charAt == ':'))) == (!z2)) {
                return i2;
            }
            i2 = i4;
        }
        return i3;
    }

    public static void m(Parcel parcel, int i2) {
        if (parcel.dataPosition() != i2) {
            throw new C0015p(C1.a.f(i2, "Overread allowed size end="), parcel);
        }
    }

    public static String n(C0107g c0107g) {
        StringBuilder sb = new StringBuilder(c0107g.size());
        for (int i2 = 0; i2 < c0107g.size(); i2++) {
            byte a2 = c0107g.a(i2);
            if (a2 == 34) {
                sb.append("\\\"");
            } else if (a2 == 39) {
                sb.append("\\'");
            } else if (a2 != 92) {
                switch (a2) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (a2 < 32 || a2 > 126) {
                            sb.append('\\');
                            sb.append((char) (((a2 >>> 6) & 3) + 48));
                            sb.append((char) (((a2 >>> 3) & 7) + 48));
                            sb.append((char) ((a2 & 7) + 48));
                            break;
                        } else {
                            sb.append((char) a2);
                            break;
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static t o(String str) {
        if (str.equals("http/1.0")) {
            return t.HTTP_1_0;
        }
        if (str.equals("http/1.1")) {
            return t.HTTP_1_1;
        }
        if (str.equals("h2_prior_knowledge")) {
            return t.H2_PRIOR_KNOWLEDGE;
        }
        if (str.equals("h2")) {
            return t.HTTP_2;
        }
        if (str.equals("spdy/3.1")) {
            return t.SPDY_3;
        }
        if (str.equals("quic")) {
            return t.QUIC;
        }
        throw new IOException(kotlin.jvm.internal.i.h(str, "Unexpected protocol: "));
    }

    public static Activity p(Context context) {
        if (context == null) {
            return null;
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return p(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public static C1056b q(C0223t c0223t) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            return new C1056b(q.c(c0223t));
        }
        TextPaint textPaint = new TextPaint(c0223t.getPaint());
        TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        int a2 = o.a(c0223t);
        int d2 = o.d(c0223t);
        if (c0223t.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else {
            if (i2 < 28 || (c0223t.getInputType() & 15) != 3) {
                boolean z2 = c0223t.getLayoutDirection() == 1;
                switch (c0223t.getTextDirection()) {
                    case 2:
                        textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                        break;
                    case 3:
                        textDirectionHeuristic = TextDirectionHeuristics.LTR;
                        break;
                    case 4:
                        textDirectionHeuristic = TextDirectionHeuristics.RTL;
                        break;
                    case 5:
                        textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                        break;
                    case 6:
                        break;
                    case 7:
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                        break;
                    default:
                        if (z2) {
                            textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                            break;
                        }
                        break;
                }
            } else {
                byte directionality = Character.getDirectionality(q.b(p.a(c0223t.getTextLocale()))[0].codePointAt(0));
                textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
            }
        }
        return new C1056b(textPaint, textDirectionHeuristic, a2, d2);
    }

    public static void r(String str, Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (!(cause instanceof RuntimeException)) {
                throw new RuntimeException(cause);
            }
            throw ((RuntimeException) cause);
        }
        Log.v("Trace", "Unable to call " + str + " via reflection", exc);
    }

    public static boolean s(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f1766e == null) {
            f1766e = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        f1766e.booleanValue();
        if (f1767f == null) {
            f1767f = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
        }
        if (!f1767f.booleanValue()) {
            return false;
        }
        int i2 = Build.VERSION.SDK_INT;
        return i2 < 26 || i2 >= 30;
    }

    public static long t(int i2, String str) {
        int l2 = l(str, 0, i2, false);
        Matcher matcher = J1.j.f879m.matcher(str);
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        int i6 = -1;
        int i7 = -1;
        int i8 = -1;
        while (l2 < i2) {
            int l3 = l(str, l2 + 1, i2, true);
            matcher.region(l2, l3);
            if (i4 == -1 && matcher.usePattern(J1.j.f879m).matches()) {
                String group = matcher.group(1);
                kotlin.jvm.internal.i.d(group, "matcher.group(1)");
                i4 = Integer.parseInt(group);
                String group2 = matcher.group(2);
                kotlin.jvm.internal.i.d(group2, "matcher.group(2)");
                i7 = Integer.parseInt(group2);
                String group3 = matcher.group(3);
                kotlin.jvm.internal.i.d(group3, "matcher.group(3)");
                i8 = Integer.parseInt(group3);
            } else if (i5 == -1 && matcher.usePattern(J1.j.f878l).matches()) {
                String group4 = matcher.group(1);
                kotlin.jvm.internal.i.d(group4, "matcher.group(1)");
                i5 = Integer.parseInt(group4);
            } else {
                if (i6 == -1) {
                    Pattern pattern = J1.j.f877k;
                    if (matcher.usePattern(pattern).matches()) {
                        String group5 = matcher.group(1);
                        kotlin.jvm.internal.i.d(group5, "matcher.group(1)");
                        Locale US = Locale.US;
                        kotlin.jvm.internal.i.d(US, "US");
                        String lowerCase = group5.toLowerCase(US);
                        kotlin.jvm.internal.i.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                        String pattern2 = pattern.pattern();
                        kotlin.jvm.internal.i.d(pattern2, "MONTH_PATTERN.pattern()");
                        i6 = z1.g.Y(pattern2, lowerCase, 0, false, 6) / 4;
                    }
                }
                if (i3 == -1 && matcher.usePattern(J1.j.f876j).matches()) {
                    String group6 = matcher.group(1);
                    kotlin.jvm.internal.i.d(group6, "matcher.group(1)");
                    i3 = Integer.parseInt(group6);
                }
            }
            l2 = l(str, l3 + 1, i2, false);
        }
        if (70 <= i3 && i3 < 100) {
            i3 += 1900;
        }
        if (i3 >= 0 && i3 < 70) {
            i3 += 2000;
        }
        if (i3 < 1601) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i6 == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (1 > i5 || i5 >= 32) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i4 < 0 || i4 >= 24) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i7 < 0 || i7 >= 60) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i8 < 0 || i8 >= 60) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(K1.b.f1054d);
        gregorianCalendar.setLenient(false);
        gregorianCalendar.set(1, i3);
        gregorianCalendar.set(2, i6 - 1);
        gregorianCalendar.set(5, i5);
        gregorianCalendar.set(11, i4);
        gregorianCalendar.set(12, i7);
        gregorianCalendar.set(13, i8);
        gregorianCalendar.set(14, 0);
        return gregorianCalendar.getTimeInMillis();
    }

    public static final boolean u(String method) {
        kotlin.jvm.internal.i.e(method, "method");
        return (method.equals("GET") || method.equals("HEAD")) ? false : true;
    }

    public static boolean v(Parcel parcel, int i2) {
        K(parcel, i2, 4);
        return parcel.readInt() != 0;
    }

    public static final byte[] w(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, inputStream.available()));
        g(inputStream, byteArrayOutputStream, 8192);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        kotlin.jvm.internal.i.d(byteArray, "toByteArray(...)");
        return byteArray;
    }

    public static int x(Parcel parcel, int i2) {
        K(parcel, i2, 4);
        return parcel.readInt();
    }

    public static int y(Parcel parcel, int i2) {
        return (i2 & (-65536)) != -65536 ? (char) (i2 >> 16) : parcel.readInt();
    }

    public static final void z(Object[] objArr, int i2, int i3) {
        kotlin.jvm.internal.i.e(objArr, "<this>");
        while (i2 < i3) {
            objArr[i2] = null;
            i2++;
        }
    }

    public abstract void B(boolean z2);

    public InterfaceC0989c b(Context context, Looper looper, Q0.c cVar, Object obj, n0.g gVar, n0.h hVar) {
        return c(context, looper, cVar, obj, (o0.l) gVar, (o0.l) hVar);
    }

    public InterfaceC0989c c(Context context, Looper looper, Q0.c cVar, Object obj, o0.l lVar, o0.l lVar2) {
        throw new UnsupportedOperationException("buildClient must be implemented");
    }

    public abstract List f(String str, List list);

    public void A(boolean z2) {
    }
}
