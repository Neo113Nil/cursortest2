package Z0;

import F.C0044u;
import P.C0064m;
import P0.AbstractActivityC0072e;
import P0.C;
import P0.G;
import Q1.A;
import a1.C0093i;
import a1.C0099o;
import a1.InterfaceC0095k;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.SystemClock;
import android.util.Log;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.autofill.AutofillManager;
import android.view.inputmethod.InputMethodManager;
import b1.C0130a;
import com.google.android.gms.tasks.Task;
import d1.C0144a;
import g.t;
import h.C0213i;
import h.InterfaceC0203J;
import h.InterfaceC0216l;
import h1.C0239i;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.plugin.platform.q;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.concurrent.ExecutorService;
import m1.EnumC0985a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p0.C1012i;
import r0.C1039a;
import r0.C1041c;
import y.AbstractC1084q;
import y.Q;
import y.x;

/* loaded from: classes.dex */
public final class i implements InterfaceC0095k, D1.d, InterfaceC0203J, g.o, InterfaceC0216l, o0.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1991a;

    /* renamed from: b, reason: collision with root package name */
    public Object f1992b;

    public /* synthetic */ i() {
        this.f1991a = 26;
    }

    public static boolean n(int i2) {
        return (48 <= i2 && i2 <= 57) || i2 == 35 || i2 == 42;
    }

    @Override // g.o
    public void a(g.j jVar, boolean z2) {
        if (jVar instanceof t) {
            ((t) jVar).f3128v.j().c(false);
        }
        g.o oVar = ((C0213i) this.f1992b).f3256e;
        if (oVar != null) {
            oVar.a(jVar, z2);
        }
    }

    @Override // h.InterfaceC0203J
    public void b(g.j jVar, g.k kVar) {
        ((g.g) this.f1992b).f3024f.removeCallbacksAndMessages(jVar);
    }

    @Override // o0.h
    public void c(Object obj, Object obj2) {
        D0.d dVar = (D0.d) obj2;
        C1039a c1039a = (C1039a) ((C1041c) obj).q();
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(c1039a.f8599b);
        int i2 = y0.b.f8600a;
        C1012i c1012i = (C1012i) this.f1992b;
        if (c1012i == null) {
            obtain.writeInt(0);
        } else {
            obtain.writeInt(1);
            c1012i.writeToParcel(obtain, 0);
        }
        try {
            c1039a.f8598a.transact(1, obtain, null, 1);
            obtain.recycle();
            dVar.f210a.f(null);
        } catch (Throwable th) {
            obtain.recycle();
            throw th;
        }
    }

    @Override // h.InterfaceC0203J
    public void d(g.j jVar, g.k kVar) {
        g.g gVar = (g.g) this.f1992b;
        gVar.f3024f.removeCallbacksAndMessages(null);
        ArrayList arrayList = gVar.f3026h;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (jVar == ((g.f) arrayList.get(i2)).f3018b) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 == -1) {
            return;
        }
        int i3 = i2 + 1;
        gVar.f3024f.postAtTime(new g.e(this, i3 < arrayList.size() ? (g.f) arrayList.get(i3) : null, kVar, jVar), jVar, SystemClock.uptimeMillis() + 200);
    }

    @Override // g.o
    public boolean e(t tVar) {
        if (tVar == null) {
            return false;
        }
        tVar.f3129w.getClass();
        C0213i c0213i = (C0213i) this.f1992b;
        c0213i.getClass();
        g.o oVar = c0213i.f3256e;
        if (oVar != null) {
            return oVar.e(tVar);
        }
        return false;
    }

    public void f(String str) {
        x0.e eVar = (x0.e) this.f1992b;
        P0.t tVar = (P0.t) eVar.f8530b;
        C c2 = x0.e.f8528f;
        Integer valueOf = Integer.valueOf(AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT);
        if (c2 == null) {
            C c3 = new C();
            c3.put("alias", 1010);
            c3.put("allScroll", 1013);
            c3.put("basic", valueOf);
            c3.put("cell", 1006);
            c3.put("click", 1002);
            c3.put("contextMenu", 1001);
            c3.put("copy", 1011);
            c3.put("forbidden", 1012);
            c3.put("grab", 1020);
            c3.put("grabbing", 1021);
            c3.put("help", 1003);
            c3.put("move", 1013);
            c3.put("none", 0);
            c3.put("noDrop", 1012);
            c3.put("precise", 1007);
            c3.put("text", 1008);
            c3.put("resizeColumn", 1014);
            c3.put("resizeDown", 1015);
            c3.put("resizeUpLeft", 1016);
            c3.put("resizeDownRight", 1017);
            c3.put("resizeLeft", 1014);
            c3.put("resizeLeftRight", 1014);
            c3.put("resizeRight", 1014);
            c3.put("resizeRow", 1015);
            c3.put("resizeUp", 1015);
            c3.put("resizeUpDown", 1015);
            c3.put("resizeUpLeft", 1017);
            c3.put("resizeUpRight", 1016);
            c3.put("resizeUpLeftDownRight", 1017);
            c3.put("resizeUpRightDownLeft", 1016);
            c3.put("verticalText", 1009);
            c3.put("wait", 1004);
            c3.put("zoomIn", 1018);
            c3.put("zoomOut", 1019);
            x0.e.f8528f = c3;
        }
        tVar.setPointerIcon(PointerIcon.getSystemIcon(((P0.t) eVar.f8530b).getContext(), ((Integer) x0.e.f8528f.getOrDefault(str, valueOf)).intValue()));
    }

    public void g(int i2) {
        io.flutter.plugin.platform.k kVar = (io.flutter.plugin.platform.k) this.f1992b;
        if (kVar.d(i2)) {
            ((q) kVar.f7865i.get(Integer.valueOf(i2))).getClass();
            Log.e("PlatformViewsController", "Clearing focus on a null view with id: " + i2);
            return;
        }
        if (kVar.f7867k.get(i2) != null) {
            throw new ClassCastException();
        }
        Log.e("PlatformViewsController", "Clearing focus on an unknown view with id: " + i2);
    }

    public void h(A a2) {
        io.flutter.plugin.platform.k kVar = (io.flutter.plugin.platform.k) this.f1992b;
        io.flutter.plugin.platform.k.b(kVar, a2);
        if (kVar.f7860d.IsSurfaceControlEnabled()) {
            throw new IllegalStateException("Trying to create a Hybrid Composition view with HC++ enabled.");
        }
        HashMap hashMap = kVar.f7857a.f1552a;
        String str = (String) a2.f1556c;
        if (hashMap.get(str) != null) {
            throw new ClassCastException();
        }
        throw new IllegalStateException(C1.a.i("Trying to create a platform view of unregistered type: ", str));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // a1.InterfaceC0095k
    public void i(x0.e eVar, j jVar) {
        char c2;
        char c3;
        boolean isStylusHandwritingAvailable;
        boolean isStylusHandwritingAvailable2;
        char c4;
        char c5;
        Bundle bundle;
        int i2 = 3;
        int i3 = 2;
        r15 = false;
        boolean z2 = false;
        switch (this.f1991a) {
            case 0:
                i iVar = (i) this.f1992b;
                if (((i) iVar.f1992b) == null) {
                    return;
                }
                String str = (String) eVar.f8530b;
                str.getClass();
                Object obj = eVar.f8531c;
                switch (str.hashCode()) {
                    case -1352294148:
                        if (str.equals("create")) {
                            c2 = 0;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -756050293:
                        if (str.equals("clearFocus")) {
                            c2 = 1;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 110550847:
                        if (str.equals("touch")) {
                            c2 = 2;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 576796989:
                        if (str.equals("setDirection")) {
                            c2 = 3;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 751366695:
                        if (str.equals("isSurfaceControlEnabled")) {
                            c2 = 4;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 1671767583:
                        if (str.equals("dispose")) {
                            c2 = 5;
                            break;
                        }
                        c2 = 65535;
                        break;
                    default:
                        c2 = 65535;
                        break;
                }
                switch (c2) {
                    case 0:
                        Map map = (Map) obj;
                        if (map.containsKey("params")) {
                            ByteBuffer.wrap((byte[]) map.get("params"));
                        }
                        try {
                            ((Integer) map.get("id")).intValue();
                            String str2 = (String) map.get("viewType");
                            ((Integer) map.get("direction")).intValue();
                            if (((io.flutter.plugin.platform.j) ((i) iVar.f1992b).f1992b).f7843a.f1552a.get(str2) != null) {
                                throw new ClassCastException();
                            }
                            throw new IllegalStateException("Trying to create a platform view of unregistered type: " + str2);
                        } catch (IllegalStateException e2) {
                            jVar.a("error", Log.getStackTraceString(e2), null);
                            return;
                        }
                    case 1:
                        int intValue = ((Integer) obj).intValue();
                        try {
                            C1.a.n(((io.flutter.plugin.platform.j) ((i) iVar.f1992b).f1992b).f7849g.get(intValue));
                            Log.e("PlatformViewsController2", "Clearing focus on an unknown view with id: " + intValue);
                            jVar.c(null);
                            return;
                        } catch (IllegalStateException e3) {
                            jVar.a("error", Log.getStackTraceString(e3), null);
                            return;
                        }
                    case 2:
                        List list = (List) obj;
                        int intValue2 = ((Integer) list.get(0)).intValue();
                        ((Integer) list.get(3)).getClass();
                        ((Integer) list.get(4)).getClass();
                        list.get(5);
                        list.get(6);
                        ((Integer) list.get(7)).getClass();
                        ((Integer) list.get(8)).getClass();
                        ((Double) list.get(9)).getClass();
                        ((Double) list.get(10)).getClass();
                        ((Integer) list.get(11)).getClass();
                        ((Integer) list.get(12)).getClass();
                        ((Integer) list.get(13)).getClass();
                        ((Integer) list.get(14)).getClass();
                        ((Number) list.get(15)).longValue();
                        try {
                            i iVar2 = (i) iVar.f1992b;
                            iVar2.getClass();
                            io.flutter.plugin.platform.j jVar2 = (io.flutter.plugin.platform.j) iVar2.f1992b;
                            float f2 = jVar2.f7844b.getResources().getDisplayMetrics().density;
                            if (jVar2.f7849g.get(intValue2) != null) {
                                throw new ClassCastException();
                            }
                            Log.e("PlatformViewsController2", "Sending touch to an unknown view with id: " + intValue2);
                            jVar.c(null);
                            return;
                        } catch (IllegalStateException e4) {
                            jVar.a("error", Log.getStackTraceString(e4), null);
                            return;
                        }
                    case 3:
                        Map map2 = (Map) obj;
                        int intValue3 = ((Integer) map2.get("id")).intValue();
                        ((Integer) map2.get("direction")).getClass();
                        try {
                            if (((io.flutter.plugin.platform.j) ((i) iVar.f1992b).f1992b).f7849g.get(intValue3) != null) {
                                throw new ClassCastException();
                            }
                            Log.e("PlatformViewsController2", "Setting direction to an unknown view with id: " + intValue3);
                            jVar.c(null);
                            return;
                        } catch (IllegalStateException e5) {
                            jVar.a("error", Log.getStackTraceString(e5), null);
                            return;
                        }
                    case 4:
                        FlutterJNI flutterJNI = ((io.flutter.plugin.platform.j) ((i) iVar.f1992b).f1992b).f7846d;
                        jVar.c(Boolean.valueOf(flutterJNI != null ? flutterJNI.IsSurfaceControlEnabled() : false));
                        return;
                    case 5:
                        try {
                            ((i) iVar.f1992b).k(((Integer) ((Map) obj).get("id")).intValue());
                            jVar.c(null);
                            return;
                        } catch (IllegalStateException e6) {
                            jVar.a("error", Log.getStackTraceString(e6), null);
                            return;
                        }
                    default:
                        jVar.b();
                        return;
                }
            case 1:
            case 2:
            case 6:
            case 8:
            default:
                x0.e eVar2 = (x0.e) this.f1992b;
                if (((io.flutter.plugin.editing.i) eVar2.f8531c) == null) {
                    return;
                }
                String str3 = (String) eVar.f8530b;
                str3.getClass();
                Object obj2 = eVar.f8531c;
                switch (str3.hashCode()) {
                    case -1779068172:
                        if (str3.equals("TextInput.setPlatformViewClient")) {
                            c5 = 0;
                            break;
                        }
                        c5 = 65535;
                        break;
                    case -1015421462:
                        if (str3.equals("TextInput.setEditingState")) {
                            c5 = 1;
                            break;
                        }
                        c5 = 65535;
                        break;
                    case -37561188:
                        if (str3.equals("TextInput.setClient")) {
                            c5 = 2;
                            break;
                        }
                        c5 = 65535;
                        break;
                    case 270476819:
                        if (str3.equals("TextInput.hide")) {
                            c5 = 3;
                            break;
                        }
                        c5 = 65535;
                        break;
                    case 270803918:
                        if (str3.equals("TextInput.show")) {
                            c5 = 4;
                            break;
                        }
                        c5 = 65535;
                        break;
                    case 649192816:
                        if (str3.equals("TextInput.sendAppPrivateCommand")) {
                            c5 = 5;
                            break;
                        }
                        c5 = 65535;
                        break;
                    case 1204752139:
                        if (str3.equals("TextInput.setEditableSizeAndTransform")) {
                            c5 = 6;
                            break;
                        }
                        c5 = 65535;
                        break;
                    case 1727570905:
                        if (str3.equals("TextInput.finishAutofillContext")) {
                            c5 = 7;
                            break;
                        }
                        c5 = 65535;
                        break;
                    case 1904427655:
                        if (str3.equals("TextInput.clearClient")) {
                            c5 = '\b';
                            break;
                        }
                        c5 = 65535;
                        break;
                    case 2113369584:
                        if (str3.equals("TextInput.requestAutofill")) {
                            c5 = '\t';
                            break;
                        }
                        c5 = 65535;
                        break;
                    default:
                        c5 = 65535;
                        break;
                }
                switch (c5) {
                    case 0:
                        try {
                            JSONObject jSONObject = (JSONObject) obj2;
                            int i4 = jSONObject.getInt("platformViewId");
                            boolean optBoolean = jSONObject.optBoolean("usesVirtualDisplay", false);
                            io.flutter.plugin.editing.j jVar3 = ((io.flutter.plugin.editing.i) eVar2.f8531c).f7814a;
                            if (optBoolean) {
                                P0.t tVar = jVar3.f7815a;
                                tVar.requestFocus();
                                jVar3.f7819e = new C0064m(3, i4);
                                jVar3.f7816b.restartInput(tVar);
                                jVar3.f7823i = false;
                            } else {
                                jVar3.getClass();
                                jVar3.f7819e = new C0064m(4, i4);
                                jVar3.f7824j = null;
                            }
                            jVar.c(null);
                            return;
                        } catch (JSONException e7) {
                            jVar.a("error", e7.getMessage(), null);
                            return;
                        }
                    case 1:
                        try {
                            ((io.flutter.plugin.editing.i) eVar2.f8531c).c(p.a((JSONObject) obj2));
                            jVar.c(null);
                            return;
                        } catch (JSONException e8) {
                            jVar.a("error", e8.getMessage(), null);
                            return;
                        }
                    case 2:
                        try {
                            JSONArray jSONArray = (JSONArray) obj2;
                            ((io.flutter.plugin.editing.i) eVar2.f8531c).a(jSONArray.getInt(0), n.a(jSONArray.getJSONObject(1)));
                            jVar.c(null);
                            return;
                        } catch (NoSuchFieldException | JSONException e9) {
                            jVar.a("error", e9.getMessage(), null);
                            return;
                        }
                    case 3:
                        io.flutter.plugin.editing.j jVar4 = ((io.flutter.plugin.editing.i) eVar2.f8531c).f7814a;
                        if (jVar4.f7819e.f1355b == 4) {
                            jVar4.c();
                        } else {
                            jVar4.c();
                            jVar4.f7816b.hideSoftInputFromWindow(jVar4.f7815a.getApplicationWindowToken(), 0);
                        }
                        jVar.c(null);
                        return;
                    case 4:
                        io.flutter.plugin.editing.j jVar5 = ((io.flutter.plugin.editing.i) eVar2.f8531c).f7814a;
                        P0.t tVar2 = jVar5.f7815a;
                        n nVar = jVar5.f7820f;
                        InputMethodManager inputMethodManager = jVar5.f7816b;
                        if (nVar == null || nVar.f2013g.f2020a != 11) {
                            tVar2.requestFocus();
                            inputMethodManager.showSoftInput(tVar2, 0);
                        } else {
                            jVar5.c();
                            inputMethodManager.hideSoftInputFromWindow(tVar2.getApplicationWindowToken(), 0);
                        }
                        jVar.c(null);
                        return;
                    case 5:
                        try {
                            JSONObject jSONObject2 = (JSONObject) obj2;
                            String string = jSONObject2.getString("action");
                            String string2 = jSONObject2.getString("data");
                            if (string2 == null || string2.isEmpty()) {
                                bundle = null;
                            } else {
                                bundle = new Bundle();
                                bundle.putString("data", string2);
                            }
                            io.flutter.plugin.editing.j jVar6 = ((io.flutter.plugin.editing.i) eVar2.f8531c).f7814a;
                            jVar6.f7816b.sendAppPrivateCommand(jVar6.f7815a, string, bundle);
                            jVar.c(null);
                            return;
                        } catch (JSONException e10) {
                            jVar.a("error", e10.getMessage(), null);
                            return;
                        }
                    case 6:
                        try {
                            JSONObject jSONObject3 = (JSONObject) obj2;
                            double d2 = jSONObject3.getDouble("width");
                            double d3 = jSONObject3.getDouble("height");
                            JSONArray jSONArray2 = jSONObject3.getJSONArray("transform");
                            double[] dArr = new double[16];
                            for (int i5 = 0; i5 < 16; i5++) {
                                dArr[i5] = jSONArray2.getDouble(i5);
                            }
                            ((io.flutter.plugin.editing.i) eVar2.f8531c).b(d2, d3, dArr);
                            jVar.c(null);
                            return;
                        } catch (JSONException e11) {
                            jVar.a("error", e11.getMessage(), null);
                            return;
                        }
                    case 7:
                        io.flutter.plugin.editing.i iVar3 = (io.flutter.plugin.editing.i) eVar2.f8531c;
                        boolean booleanValue = ((Boolean) obj2).booleanValue();
                        if (Build.VERSION.SDK_INT >= 26) {
                            AutofillManager autofillManager = iVar3.f7814a.f7817c;
                            if (autofillManager != null) {
                                if (booleanValue) {
                                    autofillManager.commit();
                                } else {
                                    autofillManager.cancel();
                                }
                            }
                        } else {
                            iVar3.getClass();
                        }
                        jVar.c(null);
                        return;
                    case '\b':
                        io.flutter.plugin.editing.j jVar7 = ((io.flutter.plugin.editing.i) eVar2.f8531c).f7814a;
                        if (jVar7.f7819e.f1355b != 3) {
                            jVar7.f7822h.e(jVar7);
                            jVar7.c();
                            jVar7.f7820f = null;
                            jVar7.d(null);
                            jVar7.f7819e = new C0064m(1, 0);
                            jVar7.f7827m = null;
                            Field field = x.f8596a;
                            P0.t tVar3 = jVar7.f7815a;
                            Q a2 = AbstractC1084q.a(tVar3);
                            if (a2 != null && !a2.f8566a.m(8)) {
                                jVar7.f7816b.restartInput(tVar3);
                            }
                        }
                        jVar.c(null);
                        return;
                    case '\t':
                        io.flutter.plugin.editing.i iVar4 = (io.flutter.plugin.editing.i) eVar2.f8531c;
                        int i6 = Build.VERSION.SDK_INT;
                        io.flutter.plugin.editing.j jVar8 = iVar4.f7814a;
                        if (i6 < 26) {
                            jVar8.getClass();
                        } else if (jVar8.f7817c != null && jVar8.f7821g != null) {
                            String str4 = (String) jVar8.f7820f.f2016j.f532a;
                            int[] iArr = new int[2];
                            P0.t tVar4 = jVar8.f7815a;
                            tVar4.getLocationOnScreen(iArr);
                            Rect rect = new Rect(jVar8.f7827m);
                            rect.offset(iArr[0], iArr[1]);
                            jVar8.f7817c.notifyViewEntered(tVar4, str4.hashCode(), rect);
                        }
                        jVar.c(null);
                        return;
                    default:
                        jVar.b();
                        return;
                }
            case 3:
                x0.e eVar3 = (x0.e) this.f1992b;
                if (((C0144a) eVar3.f8531c) == null) {
                    return;
                }
                String str5 = (String) eVar.f8530b;
                Object obj3 = eVar.f8531c;
                str5.getClass();
                if (str5.equals("ProcessText.processTextAction")) {
                    try {
                        ArrayList arrayList = (ArrayList) obj3;
                        ((C0144a) eVar3.f8531c).a((String) arrayList.get(0), (String) arrayList.get(1), ((Boolean) arrayList.get(2)).booleanValue(), jVar);
                        return;
                    } catch (IllegalStateException e12) {
                        jVar.a("error", e12.getMessage(), null);
                        return;
                    }
                }
                if (!str5.equals("ProcessText.queryTextActions")) {
                    jVar.b();
                    return;
                }
                try {
                    jVar.c(((C0144a) eVar3.f8531c).b());
                    return;
                } catch (IllegalStateException e13) {
                    jVar.a("error", e13.getMessage(), null);
                    return;
                }
            case 4:
                String str6 = (String) eVar.f8530b;
                str6.getClass();
                k kVar = (k) this.f1992b;
                if (!str6.equals("get")) {
                    if (!str6.equals("put")) {
                        jVar.b();
                        return;
                    } else {
                        kVar.f1997b = (byte[]) eVar.f8531c;
                        jVar.c(null);
                        return;
                    }
                }
                kVar.f2001f = true;
                if (kVar.f2000e || !kVar.f1996a) {
                    jVar.c(k.a(kVar.f1997b));
                    return;
                } else {
                    kVar.f1999d = jVar;
                    return;
                }
            case 5:
                i iVar5 = (i) this.f1992b;
                if (((x0.e) iVar5.f1992b) == null) {
                    return;
                }
                String str7 = (String) eVar.f8530b;
                str7.getClass();
                switch (str7.hashCode()) {
                    case -705821951:
                        if (str7.equals("Scribe.isFeatureAvailable")) {
                            c3 = 0;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 1759284829:
                        if (str7.equals("Scribe.startStylusHandwriting")) {
                            c3 = 1;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 2119738044:
                        if (str7.equals("Scribe.isStylusHandwritingAvailable")) {
                            c3 = 2;
                            break;
                        }
                        c3 = 65535;
                        break;
                    default:
                        c3 = 65535;
                        break;
                }
                switch (c3) {
                    case 0:
                        try {
                            x0.e eVar4 = (x0.e) iVar5.f1992b;
                            if (Build.VERSION.SDK_INT >= 34) {
                                isStylusHandwritingAvailable = ((InputMethodManager) eVar4.f8530b).isStylusHandwritingAvailable();
                                if (isStylusHandwritingAvailable) {
                                    z2 = true;
                                }
                            } else {
                                eVar4.getClass();
                            }
                            jVar.c(Boolean.valueOf(z2));
                            return;
                        } catch (IllegalStateException e14) {
                            jVar.a("error", e14.getMessage(), null);
                            return;
                        }
                    case 1:
                        if (Build.VERSION.SDK_INT < 33) {
                            jVar.a("error", "Requires API level 33 or higher.", null);
                            return;
                        }
                        try {
                            x0.e eVar5 = (x0.e) iVar5.f1992b;
                            ((InputMethodManager) eVar5.f8530b).startStylusHandwriting((P0.t) eVar5.f8531c);
                            jVar.c(null);
                            return;
                        } catch (IllegalStateException e15) {
                            jVar.a("error", e15.getMessage(), null);
                            return;
                        }
                    case 2:
                        if (Build.VERSION.SDK_INT < 34) {
                            jVar.a("error", "Requires API level 34 or higher.", null);
                            return;
                        }
                        try {
                            isStylusHandwritingAvailable2 = ((InputMethodManager) ((x0.e) iVar5.f1992b).f8530b).isStylusHandwritingAvailable();
                            jVar.c(Boolean.valueOf(isStylusHandwritingAvailable2));
                            return;
                        } catch (IllegalStateException e16) {
                            jVar.a("error", e16.getMessage(), null);
                            return;
                        }
                    default:
                        jVar.b();
                        return;
                }
            case 7:
                i iVar6 = (i) this.f1992b;
                if (((O1.h) iVar6.f1992b) == null) {
                    return;
                }
                String str8 = (String) eVar.f8530b;
                str8.getClass();
                switch (str8.hashCode()) {
                    case -1937987631:
                        if (str8.equals("SensitiveContent.getContentSensitivity")) {
                            c4 = 0;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case 598223325:
                        if (str8.equals("SensitiveContent.setContentSensitivity")) {
                            c4 = 1;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case 1615625817:
                        if (str8.equals("SensitiveContent.isSupported")) {
                            c4 = 2;
                            break;
                        }
                        c4 = 65535;
                        break;
                    default:
                        c4 = 65535;
                        break;
                }
                switch (c4) {
                    case 0:
                        try {
                            int a3 = ((O1.h) iVar6.f1992b).a();
                            if (a3 == 0) {
                                i2 = 0;
                            } else if (a3 == 1) {
                                i2 = 1;
                            } else if (a3 == 2) {
                                i2 = 2;
                            }
                            jVar.c(Integer.valueOf(i2));
                            return;
                        } catch (IllegalArgumentException | IllegalStateException e17) {
                            jVar.a("error", e17.getMessage(), null);
                            return;
                        }
                    case 1:
                        int intValue4 = ((Integer) eVar.f8531c).intValue();
                        try {
                            O1.h hVar = (O1.h) iVar6.f1992b;
                            iVar6.getClass();
                            if (intValue4 == 0) {
                                i3 = 0;
                            } else if (intValue4 == 1) {
                                i3 = 1;
                            } else if (intValue4 != 2) {
                                throw new IllegalArgumentException(C1.a.g(intValue4, "contentSensitivityIndex ", " not known to the SensitiveContentChannel."));
                            }
                            hVar.b(i3);
                            return;
                        } catch (IllegalArgumentException | IllegalStateException e18) {
                            jVar.a("error", e18.getMessage(), null);
                            return;
                        }
                    case 2:
                        ((O1.h) iVar6.f1992b).getClass();
                        jVar.c(Boolean.valueOf(Build.VERSION.SDK_INT >= 35));
                        return;
                    default:
                        jVar.b();
                        return;
                }
            case 9:
                i iVar7 = (i) this.f1992b;
                if (((io.flutter.plugin.editing.g) iVar7.f1992b) == null) {
                    return;
                }
                String str9 = (String) eVar.f8530b;
                Object obj4 = eVar.f8531c;
                str9.getClass();
                if (!str9.equals("SpellCheck.initiateSpellCheck")) {
                    jVar.b();
                    return;
                }
                try {
                    ArrayList arrayList2 = (ArrayList) obj4;
                    ((io.flutter.plugin.editing.g) iVar7.f1992b).a((String) arrayList2.get(0), (String) arrayList2.get(1), jVar);
                    return;
                } catch (IllegalStateException e19) {
                    jVar.a("error", e19.getMessage(), null);
                    return;
                }
        }
    }

    public long j(A a2) {
        io.flutter.plugin.platform.k kVar = (io.flutter.plugin.platform.k) this.f1992b;
        io.flutter.plugin.platform.k.b(kVar, a2);
        SparseArray sparseArray = kVar.f7870n;
        int i2 = a2.f1554a;
        if (sparseArray.get(i2) != null) {
            throw new IllegalStateException(C1.a.f(i2, "Trying to create an already created platform view, view id: "));
        }
        if (kVar.f7861e == null) {
            throw new IllegalStateException(C1.a.f(i2, "Texture registry is null. This means that platform views controller was detached, view id: "));
        }
        if (kVar.f7859c == null) {
            throw new IllegalStateException(C1.a.f(i2, "Flutter view is null. This means the platform views controller doesn't have an attached view, view id: "));
        }
        HashMap hashMap = kVar.f7857a.f1552a;
        String str = (String) a2.f1556c;
        if (hashMap.get(str) == null) {
            throw new IllegalStateException(C1.a.i("Trying to create a platform view of unregistered type: ", str));
        }
        throw new ClassCastException();
    }

    public void k(int i2) {
        switch (this.f1991a) {
            case 23:
                C1.a.n(((io.flutter.plugin.platform.k) this.f1992b).f7867k.get(i2));
                Log.e("PlatformViewsController", "Disposing unknown platform view with id: " + i2);
                break;
            default:
                io.flutter.plugin.platform.j jVar = (io.flutter.plugin.platform.j) this.f1992b;
                jVar.f7855m.remove(Integer.valueOf(i2));
                C1.a.n(jVar.f7849g.get(i2));
                Log.e("PlatformViewsController2", "Disposing unknown platform view with id: " + i2);
                break;
        }
    }

    public CharSequence l(d dVar) {
        AbstractActivityC0072e abstractActivityC0072e = ((io.flutter.plugin.platform.e) this.f1992b).f7837a;
        ClipboardManager clipboardManager = (ClipboardManager) abstractActivityC0072e.getSystemService("clipboard");
        CharSequence charSequence = null;
        if (!clipboardManager.hasPrimaryClip()) {
            return null;
        }
        try {
            try {
                ClipData primaryClip = clipboardManager.getPrimaryClip();
                if (primaryClip == null) {
                    return null;
                }
                if (dVar != null && dVar != d.f1958b) {
                    return null;
                }
                ClipData.Item itemAt = primaryClip.getItemAt(0);
                CharSequence text = itemAt.getText();
                if (text != null) {
                    return text;
                }
                try {
                    Uri uri = itemAt.getUri();
                    if (uri == null) {
                        Log.w("PlatformPlugin", "Clipboard item contained no textual content nor a URI to retrieve it from.");
                    } else {
                        String scheme = uri.getScheme();
                        if (scheme.equals("content")) {
                            AssetFileDescriptor openTypedAssetFileDescriptor = abstractActivityC0072e.getContentResolver().openTypedAssetFileDescriptor(uri, "text/*", null);
                            CharSequence coerceToText = itemAt.coerceToText(abstractActivityC0072e);
                            if (openTypedAssetFileDescriptor != null) {
                                try {
                                    openTypedAssetFileDescriptor.close();
                                } catch (IOException e2) {
                                    charSequence = coerceToText;
                                    e = e2;
                                    Log.w("PlatformPlugin", "Failed to close AssetFileDescriptor while trying to read text from URI.", e);
                                    return charSequence;
                                }
                            }
                            charSequence = coerceToText;
                        } else {
                            Log.w("PlatformPlugin", "Clipboard item contains a Uri with scheme '" + scheme + "'that is unhandled.");
                        }
                    }
                    return charSequence;
                } catch (IOException e3) {
                    e = e3;
                    charSequence = text;
                }
            } catch (IOException e4) {
                e = e4;
            }
        } catch (FileNotFoundException unused) {
            Log.w("PlatformPlugin", "Clipboard text was unable to be received from content URI.");
            return null;
        } catch (SecurityException e5) {
            Log.w("PlatformPlugin", "Attempted to get clipboard data that requires additional permission(s).\nSee the exception details for which permission(s) are required, and consider adding them to your Android Manifest as described in:\nhttps://developer.android.com/guide/topics/permissions/overview", e5);
            return null;
        }
    }

    public String m(String str, String str2) {
        C0130a c0130a = (C0130a) this.f1992b;
        Context context = c0130a.f2617b;
        AbstractActivityC0072e abstractActivityC0072e = c0130a.f2617b;
        if (str2 != null) {
            Locale a2 = C0130a.a(str2);
            Configuration configuration = new Configuration(abstractActivityC0072e.getResources().getConfiguration());
            configuration.setLocale(a2);
            context = abstractActivityC0072e.createConfigurationContext(configuration);
        }
        int identifier = context.getResources().getIdentifier(str, "string", abstractActivityC0072e.getPackageName());
        if (identifier != 0) {
            return context.getResources().getString(identifier);
        }
        return null;
    }

    public void p(int i2, double d2, double d3) {
        io.flutter.plugin.platform.k kVar = (io.flutter.plugin.platform.k) this.f1992b;
        if (kVar.d(i2)) {
            return;
        }
        Log.e("PlatformViewsController", "Setting offset for unknown platform view with id: " + i2);
    }

    public void q(g gVar) {
        PriorityQueue priorityQueue;
        LongSparseArray longSparseArray;
        long j2;
        io.flutter.plugin.platform.k kVar = (io.flutter.plugin.platform.k) this.f1992b;
        float f2 = kVar.f7858b.getResources().getDisplayMetrics().density;
        int i2 = gVar.f1972a;
        if (!kVar.d(i2)) {
            if (kVar.f7867k.get(i2) != null) {
                throw new ClassCastException();
            }
            Log.e("PlatformViewsController", "Sending touch to an unknown view with id: " + i2);
            return;
        }
        q qVar = (q) kVar.f7865i.get(Integer.valueOf(i2));
        G g2 = new G(gVar.f1987p);
        while (true) {
            x0.e eVar = kVar.t;
            priorityQueue = (PriorityQueue) eVar.f8531c;
            boolean isEmpty = priorityQueue.isEmpty();
            longSparseArray = (LongSparseArray) eVar.f8530b;
            j2 = g2.f1390a;
            if (isEmpty || ((Long) priorityQueue.peek()).longValue() >= j2) {
                break;
            } else {
                longSparseArray.remove(((Long) priorityQueue.poll()).longValue());
            }
        }
        if (!priorityQueue.isEmpty() && ((Long) priorityQueue.peek()).longValue() == j2) {
            priorityQueue.poll();
        }
        longSparseArray.remove(j2);
        List<List> list = (List) gVar.f1978g;
        ArrayList arrayList = new ArrayList();
        for (List list2 : list) {
            MotionEvent.PointerCoords pointerCoords = new MotionEvent.PointerCoords();
            pointerCoords.orientation = (float) ((Double) list2.get(0)).doubleValue();
            pointerCoords.pressure = (float) ((Double) list2.get(1)).doubleValue();
            pointerCoords.size = (float) ((Double) list2.get(2)).doubleValue();
            double d2 = f2;
            pointerCoords.toolMajor = (float) (((Double) list2.get(3)).doubleValue() * d2);
            pointerCoords.toolMinor = (float) (((Double) list2.get(4)).doubleValue() * d2);
            pointerCoords.touchMajor = (float) (((Double) list2.get(5)).doubleValue() * d2);
            pointerCoords.touchMinor = (float) (((Double) list2.get(6)).doubleValue() * d2);
            pointerCoords.x = (float) (((Double) list2.get(7)).doubleValue() * d2);
            pointerCoords.y = (float) (((Double) list2.get(8)).doubleValue() * d2);
            arrayList.add(pointerCoords);
        }
        int i3 = gVar.f1976e;
        MotionEvent.PointerCoords[] pointerCoordsArr = (MotionEvent.PointerCoords[]) arrayList.toArray(new MotionEvent.PointerCoords[i3]);
        List<List> list3 = (List) gVar.f1977f;
        ArrayList arrayList2 = new ArrayList();
        for (List list4 : list3) {
            MotionEvent.PointerProperties pointerProperties = new MotionEvent.PointerProperties();
            pointerProperties.id = ((Integer) list4.get(0)).intValue();
            pointerProperties.toolType = ((Integer) list4.get(1)).intValue();
            arrayList2.add(pointerProperties);
        }
        MotionEvent.obtain(gVar.f1973b.longValue(), gVar.f1974c.longValue(), gVar.f1975d, gVar.f1976e, (MotionEvent.PointerProperties[]) arrayList2.toArray(new MotionEvent.PointerProperties[i3]), pointerCoordsArr, gVar.f1979h, gVar.f1980i, gVar.f1981j, gVar.f1982k, gVar.f1983l, gVar.f1984m, gVar.f1985n, gVar.f1986o);
        qVar.getClass();
    }

    @Override // D1.d
    public Object r(D1.e eVar, l1.d dVar) {
        Object r2 = ((D1.d) this.f1992b).r(new C0044u(eVar, 1), dVar);
        return r2 == EnumC0985a.f8194a ? r2 : C0239i.f3393a;
    }

    public void s(h hVar, H0.b bVar) {
        io.flutter.plugin.platform.k kVar = (io.flutter.plugin.platform.k) this.f1992b;
        int i2 = kVar.i(hVar.f1989b);
        int i3 = kVar.i(hVar.f1990c);
        int i4 = hVar.f1988a;
        if (!kVar.d(i4)) {
            if (kVar.f7867k.get(i4) != null) {
                throw new ClassCastException();
            }
            Log.e("PlatformViewsController", "Resizing unknown platform view with id: " + i4);
            return;
        }
        float f2 = kVar.f7858b.getResources().getDisplayMetrics().density;
        q qVar = (q) kVar.f7865i.get(Integer.valueOf(i4));
        io.flutter.plugin.editing.j jVar = kVar.f7862f;
        if (jVar != null) {
            if (jVar.f7819e.f1355b == 3) {
                jVar.f7830p = true;
            }
            qVar.getClass();
        }
        qVar.getClass();
        if (i2 == 0 && i3 == 0) {
            throw null;
        }
        if (Build.VERSION.SDK_INT < 31) {
            throw null;
        }
        throw null;
    }

    public void t(int i2, int i3) {
        if (i3 != 0 && i3 != 1) {
            throw new IllegalStateException("Trying to set unknown direction value: " + i3 + "(view id: " + i2 + ")");
        }
        io.flutter.plugin.platform.k kVar = (io.flutter.plugin.platform.k) this.f1992b;
        if (kVar.d(i2)) {
            ((q) kVar.f7865i.get(Integer.valueOf(i2))).getClass();
            Log.e("PlatformViewsController", "Setting direction to a null view with id: " + i2);
            return;
        }
        if (kVar.f7867k.get(i2) != null) {
            throw new ClassCastException();
        }
        Log.e("PlatformViewsController", "Setting direction to an unknown view with id: " + i2);
    }

    public void u(ArrayList arrayList) {
        io.flutter.plugin.platform.e eVar = (io.flutter.plugin.platform.e) this.f1992b;
        if (eVar.f7842f) {
            eVar.f7842f = false;
            R1.d.E(eVar.f7837a.getWindow(), true);
        }
        int i2 = arrayList.isEmpty() ? 5894 : 1798;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            int ordinal = ((f) arrayList.get(i3)).ordinal();
            if (ordinal == 0) {
                i2 &= -5;
            } else if (ordinal == 1) {
                i2 &= -515;
            }
        }
        eVar.f7841e = i2;
        eVar.b();
    }

    public void v(int i2) {
        int i3;
        io.flutter.plugin.platform.e eVar = (io.flutter.plugin.platform.e) this.f1992b;
        eVar.getClass();
        AbstractActivityC0072e abstractActivityC0072e = eVar.f7837a;
        if (i2 != 4 && eVar.f7842f) {
            eVar.f7842f = false;
            R1.d.E(abstractActivityC0072e.getWindow(), true);
        }
        if (i2 == 1) {
            i3 = 1798;
        } else if (i2 == 2) {
            i3 = 3846;
        } else {
            if (i2 != 3) {
                if (i2 != 4 || Build.VERSION.SDK_INT < 29) {
                    return;
                }
                eVar.f7842f = true;
                R1.d.E(abstractActivityC0072e.getWindow(), false);
                e eVar2 = eVar.f7840d;
                if (eVar2 != null) {
                    eVar.a(eVar2);
                    return;
                }
                return;
            }
            i3 = 5894;
        }
        eVar.f7841e = i3;
        eVar.b();
    }

    public Task w(Task task) {
        o.b bVar = (o.b) this.f1992b;
        if (!task.d() && !((D0.m) task).f232d) {
            Exception b2 = task.b();
            if (b2 instanceof n0.d) {
                int i2 = ((n0.d) b2).f8199a.f2680a;
                if (i2 == 43001 || i2 == 43002 || i2 == 43003 || i2 == 17) {
                    x0.e eVar = (x0.e) bVar.f8227c;
                    eVar.getClass();
                    D0.d dVar = new D0.d();
                    ((ExecutorService) eVar.f8531c).execute(new D0.f(eVar, dVar, 10, false));
                    task = dVar.f210a;
                } else if (i2 == 43000) {
                    Exception exc = new Exception("Failed to get app set ID due to an internal error. Please try again later.");
                    D0.m mVar = new D0.m();
                    mVar.e(exc);
                    task = mVar;
                } else if (i2 == 15) {
                    Exception exc2 = new Exception("The operation to get app set ID timed out. Please try again later.");
                    D0.m mVar2 = new D0.m();
                    mVar2.e(exc2);
                    return mVar2;
                }
            }
        }
        return task;
    }

    public void x(int i2) {
        View decorView = ((io.flutter.plugin.platform.e) this.f1992b).f7837a.getWindow().getDecorView();
        switch (H.j.b(i2)) {
            case 0:
                decorView.performHapticFeedback(0);
                break;
            case 1:
                decorView.performHapticFeedback(1);
                break;
            case 2:
                decorView.performHapticFeedback(3);
                break;
            case 3:
                decorView.performHapticFeedback(6);
                break;
            case 4:
                decorView.performHapticFeedback(4);
                break;
            case 5:
                if (Build.VERSION.SDK_INT >= 30) {
                    decorView.performHapticFeedback(16);
                    break;
                }
                break;
            case 6:
                if (Build.VERSION.SDK_INT >= 30) {
                    decorView.performHapticFeedback(3);
                    break;
                }
                break;
            case 7:
                if (Build.VERSION.SDK_INT >= 30) {
                    decorView.performHapticFeedback(17);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ i(int i2, Object obj) {
        this.f1991a = i2;
        this.f1992b = obj;
    }

    public i(R0.b bVar, int i2) {
        this.f1991a = i2;
        switch (i2) {
            case 2:
                new I0.b(bVar, "flutter/platform_views", C0099o.f2035b, 9).M(new C.j(29, this));
                break;
            case 6:
                new I0.b(bVar, "flutter/scribe", C0093i.f2034a, 9).M(new i(5, this));
                break;
            case 8:
                new I0.b(bVar, "flutter/sensitivecontent", C0099o.f2035b, 9).M(new i(7, this));
                break;
            case 10:
                new I0.b(bVar, "flutter/spellcheck", C0099o.f2035b, 9).M(new i(9, this));
                break;
            default:
                new I0.b(bVar, "flutter/platform_views_2", C0099o.f2035b, 9).M(new i(0, this));
                break;
        }
    }
}
