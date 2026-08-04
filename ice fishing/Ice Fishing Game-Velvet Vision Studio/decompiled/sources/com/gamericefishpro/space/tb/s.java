package com.gamericefishpro.space.tb;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Log;
import com.gamericefishpro.space.i9.a4;
import com.gamericefishpro.space.i9.g4;
import com.gamericefishpro.space.i9.r8;
import com.gamericefishpro.space.n9.f1;
import com.gamericefishpro.space.n9.r1;
import com.gamericefishpro.space.n9.v0;
import com.gamericefishpro.space.si.n0;
import com.gamericefishpro.space.v.m0;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class s implements com.gamericefishpro.space.i1.f, com.gamericefishpro.space.e8.b {
    public static s w;
    public Object d;
    public Object e;
    public Object i;
    public Object v;

    public s(f1 f1Var, String str) {
        this.v = f1Var;
        com.gamericefishpro.space.v8.c0.d(str);
        this.d = str;
        this.e = new Bundle();
    }

    public static void a(s dispatcher, com.gamericefishpro.space.j5.d handler) {
        dispatcher.getClass();
        Intrinsics.checkNotNullParameter(handler, "handler");
        if (((LinkedHashSet) dispatcher.i).add(handler)) {
            com.gamericefishpro.space.j5.g gVar = (com.gamericefishpro.space.j5.g) dispatcher.e;
            gVar.getClass();
            Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
            Intrinsics.checkNotNullParameter(handler, "handler");
            if (handler.e == null) {
                gVar.e.addFirst(handler);
                handler.e = dispatcher;
                gVar.b();
            } else {
                throw new IllegalArgumentException(("Handler '" + handler + "' is already registered with a dispatcher").toString());
            }
        }
    }

    public static synchronized s f() {
        try {
            if (w == null) {
                s sVar = new s();
                sVar.d = null;
                sVar.e = null;
                sVar.i = null;
                sVar.v = new ArrayDeque();
                w = sVar;
            }
        } catch (Throwable th) {
            throw th;
        }
        return w;
    }

    public void b(com.gamericefishpro.space.j5.f input) {
        Intrinsics.checkNotNullParameter(input, "input");
        if (((LinkedHashSet) this.v).add(input)) {
            ((com.gamericefishpro.space.j5.g) this.e).a(this, input, -1);
        }
    }

    public void c(com.gamericefishpro.space.j5.k input, int i) {
        Intrinsics.checkNotNullParameter(input, "input");
        if (i != 1 && i != 0) {
            throw new IllegalArgumentException(com.gamericefishpro.space.m5.a.g(i, "Unsupported priority value: ").toString());
        }
        if (((LinkedHashSet) this.v).add(input)) {
            ((com.gamericefishpro.space.j5.g) this.e).a(this, input, i);
        }
    }

    public void d(com.gamericefishpro.space.j5.f input, com.gamericefishpro.space.j5.b latestEvent) {
        Intrinsics.checkNotNullParameter(input, "input");
        com.gamericefishpro.space.j5.g gVar = (com.gamericefishpro.space.j5.g) this.e;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(input, "input");
        if (gVar.g != 0) {
            return;
        }
        com.gamericefishpro.space.j5.d dVarC = gVar.c(-1);
        gVar.f = dVarC;
        gVar.g = -1;
        gVar.h = input;
        if (latestEvent != null) {
            if (dVarC != null) {
                Intrinsics.checkNotNullParameter(latestEvent, "event");
                Intrinsics.checkNotNullParameter(latestEvent, "latestEvent");
                dVarC.d(latestEvent);
            }
            n0 n0Var = gVar.a;
            com.gamericefishpro.space.j5.i iVar = new com.gamericefishpro.space.j5.i(latestEvent);
            n0Var.getClass();
            n0Var.j(null, iVar);
        }
    }

    public void e(com.gamericefishpro.space.b2.h hVar, boolean z) {
        com.gamericefishpro.space.b2.v vVar = (com.gamericefishpro.space.b2.v) this.v;
        List list = hVar.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((com.gamericefishpro.space.b2.m) list.get(i)).b()) {
                j(hVar);
                return;
            }
        }
        com.gamericefishpro.space.f2.u uVar = (com.gamericefishpro.space.f2.u) this.d;
        if (uVar == null) {
            throw new IllegalStateException("layoutCoordinates not set");
        }
        com.gamericefishpro.space.wa.b.Q(hVar, uVar.H(0L), new com.gamericefishpro.space.b2.t(0, this, vVar), false);
        if (((com.gamericefishpro.space.b2.s) this.e) == com.gamericefishpro.space.b2.s.e) {
            if (z) {
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    ((com.gamericefishpro.space.b2.m) list.get(i2)).a();
                }
            }
            g4 g4Var = hVar.b;
            if (g4Var != null) {
                g4Var.a = !vVar.c;
            }
        }
    }

    public com.gamericefishpro.space.w.o g(long j, com.gamericefishpro.space.w.o oVar, com.gamericefishpro.space.w.o oVar2) {
        if (((com.gamericefishpro.space.w.o) this.i) == null) {
            this.i = oVar.c();
        }
        com.gamericefishpro.space.w.o oVar3 = (com.gamericefishpro.space.w.o) this.i;
        if (oVar3 == null) {
            Intrinsics.h("velocityVector");
            throw null;
        }
        int iB = oVar3.b();
        for (int i = 0; i < iB; i++) {
            com.gamericefishpro.space.w.o oVar4 = (com.gamericefishpro.space.w.o) this.i;
            if (oVar4 == null) {
                Intrinsics.h("velocityVector");
                throw null;
            }
            u uVar = (u) this.d;
            oVar.getClass();
            long j2 = j / 1000000;
            m0 m0VarA = ((com.gamericefishpro.space.r4.d) uVar.e).a(oVar2.a(i));
            long j3 = m0VarA.c;
            oVar4.e(i, (((Math.signum(m0VarA.a) * com.gamericefishpro.space.v.b.a(j3 > 0 ? j2 / j3 : 1.0f).b) * m0VarA.b) / j3) * 1000.0f);
        }
        com.gamericefishpro.space.w.o oVar5 = (com.gamericefishpro.space.w.o) this.i;
        if (oVar5 != null) {
            return oVar5;
        }
        Intrinsics.h("velocityVector");
        throw null;
    }

    @Override // com.gamericefishpro.space.nh.a
    public Object get() {
        Executor executor = (Executor) ((com.gamericefishpro.space.nh.a) this.d).get();
        com.gamericefishpro.space.j8.d dVar = (com.gamericefishpro.space.j8.d) ((com.gamericefishpro.space.nh.a) this.e).get();
        com.gamericefishpro.space.a8.c cVar = (com.gamericefishpro.space.a8.c) ((com.gamericefishpro.space.a8.c) this.i).get();
        com.gamericefishpro.space.k8.c cVar2 = (com.gamericefishpro.space.k8.c) ((com.gamericefishpro.space.nh.a) this.v).get();
        com.gamericefishpro.space.u6.n nVar = new com.gamericefishpro.space.u6.n();
        nVar.d = executor;
        nVar.e = dVar;
        nVar.i = cVar;
        nVar.v = cVar2;
        return nVar;
    }

    public boolean h(Context context) {
        if (((Boolean) this.i) == null) {
            this.i = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!((Boolean) this.e).booleanValue()) {
            Log.isLoggable("FirebaseMessaging", 3);
        }
        return ((Boolean) this.i).booleanValue();
    }

    public boolean i(Context context) {
        if (((Boolean) this.e) == null) {
            this.e = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!((Boolean) this.e).booleanValue()) {
            Log.isLoggable("FirebaseMessaging", 3);
        }
        return ((Boolean) this.e).booleanValue();
    }

    public void j(com.gamericefishpro.space.b2.h hVar) {
        if (((com.gamericefishpro.space.b2.s) this.e) == com.gamericefishpro.space.b2.s.e) {
            com.gamericefishpro.space.f2.u uVar = (com.gamericefishpro.space.f2.u) this.d;
            if (uVar == null) {
                throw new IllegalStateException("layoutCoordinates not set");
            }
            com.gamericefishpro.space.wa.b.Q(hVar, uVar.H(0L), new com.gamericefishpro.space.b2.u((com.gamericefishpro.space.b2.v) this.v, 1), true);
        }
        this.e = com.gamericefishpro.space.b2.s.i;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00fe A[Catch: NumberFormatException | JSONException -> 0x010b, NumberFormatException | JSONException -> 0x010b, TRY_LEAVE, TryCatch #0 {NumberFormatException | JSONException -> 0x010b, blocks: (B:10:0x0031, B:24:0x0065, B:24:0x0065, B:26:0x0072, B:26:0x0072, B:28:0x0084, B:28:0x0084, B:29:0x008d, B:29:0x008d, B:51:0x00fe, B:51:0x00fe, B:33:0x009a, B:33:0x009a, B:35:0x00a7, B:35:0x00a7, B:37:0x00b9, B:37:0x00b9, B:38:0x00c2, B:38:0x00c2, B:42:0x00ce, B:42:0x00ce, B:46:0x00de, B:46:0x00de, B:50:0x00f2, B:50:0x00f2), top: B:63:0x0031, outer: #1 }] */
    public Bundle k() {
        f1 f1Var = (f1) this.v;
        if (((Bundle) this.i) == null) {
            String str = (String) this.d;
            SharedPreferences sharedPreferencesV = f1Var.v();
            r1 r1Var = (r1) f1Var.d;
            String string = sharedPreferencesV.getString(str, null);
            if (string != null) {
                try {
                    Bundle bundle = new Bundle();
                    JSONArray jSONArray = new JSONArray(string);
                    for (int i = 0; i < jSONArray.length(); i++) {
                        try {
                            JSONObject jSONObject = jSONArray.getJSONObject(i);
                            String string2 = jSONObject.getString(com.gamericefishpro.space.jf.a.PUSH_MINIFIED_BUTTON_TEXT);
                            String string3 = jSONObject.getString("t");
                            int iHashCode = string3.hashCode();
                            if (iHashCode != 100) {
                                if (iHashCode != 108) {
                                    if (iHashCode != 115) {
                                        if (iHashCode != 3352) {
                                            if (iHashCode == 3445 && string3.equals("la")) {
                                                r8.a();
                                                if (r1Var.v.B(null, com.gamericefishpro.space.n9.e0.Q0)) {
                                                    JSONArray jSONArray2 = new JSONArray(jSONObject.getString("v"));
                                                    int length = jSONArray2.length();
                                                    long[] jArr = new long[length];
                                                    for (int i2 = 0; i2 < length; i2++) {
                                                        jArr[i2] = jSONArray2.optLong(i2);
                                                    }
                                                    bundle.putLongArray(string2, jArr);
                                                }
                                            } else {
                                                v0 v0Var = r1Var.y;
                                                r1.l(v0Var);
                                                v0Var.y.b(string3, "Unrecognized persisted bundle type. Type");
                                            }
                                        } else if (string3.equals("ia")) {
                                            r8.a();
                                            if (r1Var.v.B(null, com.gamericefishpro.space.n9.e0.Q0)) {
                                                JSONArray jSONArray3 = new JSONArray(jSONObject.getString("v"));
                                                int length2 = jSONArray3.length();
                                                int[] iArr = new int[length2];
                                                for (int i3 = 0; i3 < length2; i3++) {
                                                    iArr[i3] = jSONArray3.optInt(i3);
                                                }
                                                bundle.putIntArray(string2, iArr);
                                            }
                                        } else {
                                            v0 v0Var2 = r1Var.y;
                                            r1.l(v0Var2);
                                            v0Var2.y.b(string3, "Unrecognized persisted bundle type. Type");
                                        }
                                    } else if (string3.equals("s")) {
                                        bundle.putString(string2, jSONObject.getString("v"));
                                    } else {
                                        v0 v0Var3 = r1Var.y;
                                        r1.l(v0Var3);
                                        v0Var3.y.b(string3, "Unrecognized persisted bundle type. Type");
                                    }
                                } else if (string3.equals("l")) {
                                    bundle.putLong(string2, Long.parseLong(jSONObject.getString("v")));
                                } else {
                                    v0 v0Var4 = r1Var.y;
                                    r1.l(v0Var4);
                                    v0Var4.y.b(string3, "Unrecognized persisted bundle type. Type");
                                }
                            } else if (string3.equals("d")) {
                                bundle.putDouble(string2, Double.parseDouble(jSONObject.getString("v")));
                            } else {
                                v0 v0Var5 = r1Var.y;
                                r1.l(v0Var5);
                                v0Var5.y.b(string3, "Unrecognized persisted bundle type. Type");
                            }
                        } catch (NumberFormatException | JSONException unused) {
                            v0 v0Var6 = r1Var.y;
                            r1.l(v0Var6);
                            v0Var6.y.a("Error reading value from SharedPreferences. Value dropped");
                        }
                    }
                    this.i = bundle;
                } catch (JSONException unused2) {
                    v0 v0Var7 = r1Var.y;
                    r1.l(v0Var7);
                    v0Var7.y.a("Error loading bundle from SharedPreferences. Values will be lost");
                }
            }
            if (((Bundle) this.i) == null) {
                this.i = (Bundle) this.e;
            }
        }
        Bundle bundle2 = (Bundle) this.i;
        com.gamericefishpro.space.v8.c0.g(bundle2);
        return new Bundle(bundle2);
    }

    public void l(Bundle bundle) {
        String str = (String) this.d;
        f1 f1Var = (f1) this.v;
        Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        SharedPreferences sharedPreferencesV = f1Var.v();
        r1 r1Var = (r1) f1Var.d;
        SharedPreferences.Editor editorEdit = sharedPreferencesV.edit();
        if (bundle2.size() == 0) {
            editorEdit.remove(str);
        } else {
            JSONArray jSONArray = new JSONArray();
            for (String str2 : bundle2.keySet()) {
                Object obj = bundle2.get(str2);
                if (obj != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put(com.gamericefishpro.space.jf.a.PUSH_MINIFIED_BUTTON_TEXT, str2);
                        r8.a();
                        if (r1Var.v.B(null, com.gamericefishpro.space.n9.e0.Q0)) {
                            if (obj instanceof String) {
                                jSONObject.put("v", obj.toString());
                                jSONObject.put("t", "s");
                            } else if (obj instanceof Long) {
                                jSONObject.put("v", obj.toString());
                                jSONObject.put("t", "l");
                            } else if (obj instanceof int[]) {
                                jSONObject.put("v", Arrays.toString((int[]) obj));
                                jSONObject.put("t", "ia");
                            } else if (obj instanceof long[]) {
                                jSONObject.put("v", Arrays.toString((long[]) obj));
                                jSONObject.put("t", "la");
                            } else if (obj instanceof Double) {
                                jSONObject.put("v", obj.toString());
                                jSONObject.put("t", "d");
                            } else {
                                v0 v0Var = r1Var.y;
                                r1.l(v0Var);
                                v0Var.y.b(obj.getClass(), "Cannot serialize bundle value to SharedPreferences. Type");
                            }
                            jSONArray.put(jSONObject);
                        } else {
                            jSONObject.put("v", obj.toString());
                            if (obj instanceof String) {
                                jSONObject.put("t", "s");
                            } else if (obj instanceof Long) {
                                jSONObject.put("t", "l");
                            } else if (obj instanceof Double) {
                                jSONObject.put("t", "d");
                            } else {
                                v0 v0Var2 = r1Var.y;
                                r1.l(v0Var2);
                                v0Var2.y.b(obj.getClass(), "Cannot serialize bundle value to SharedPreferences. Type");
                            }
                            jSONArray.put(jSONObject);
                        }
                    } catch (JSONException e) {
                        v0 v0Var3 = r1Var.y;
                        r1.l(v0Var3);
                        v0Var3.y.b(e, "Cannot serialize bundle value to SharedPreferences");
                    }
                }
            }
            editorEdit.putString(str, jSONArray.toString());
        }
        editorEdit.apply();
        this.i = bundle2;
    }

    public s(Typeface typeface, com.gamericefishpro.space.t4.b bVar) {
        int i;
        int i2;
        int i3;
        int i4;
        this.v = typeface;
        this.d = bVar;
        this.i = new com.gamericefishpro.space.s4.s(1024);
        int iA = bVar.a(6);
        if (iA != 0) {
            int i5 = iA + bVar.d;
            i = ((ByteBuffer) bVar.v).getInt(((ByteBuffer) bVar.v).getInt(i5) + i5);
        } else {
            i = 0;
        }
        this.e = new char[i * 2];
        int iA2 = bVar.a(6);
        if (iA2 != 0) {
            int i6 = iA2 + bVar.d;
            i2 = ((ByteBuffer) bVar.v).getInt(((ByteBuffer) bVar.v).getInt(i6) + i6);
        } else {
            i2 = 0;
        }
        for (int i7 = 0; i7 < i2; i7++) {
            com.gamericefishpro.space.s4.v vVar = new com.gamericefishpro.space.s4.v(this, i7);
            com.gamericefishpro.space.t4.a aVarB = vVar.b();
            int iA3 = aVarB.a(4);
            Character.toChars(iA3 != 0 ? ((ByteBuffer) aVarB.v).getInt(iA3 + aVarB.d) : 0, (char[]) this.e, i7 * 2);
            com.gamericefishpro.space.t4.a aVarB2 = vVar.b();
            int iA4 = aVarB2.a(16);
            if (iA4 != 0) {
                int i8 = iA4 + aVarB2.d;
                i3 = ((ByteBuffer) aVarB2.v).getInt(((ByteBuffer) aVarB2.v).getInt(i8) + i8);
            } else {
                i3 = 0;
            }
            a4.n("invalid metadata codepoint length", i3 > 0);
            com.gamericefishpro.space.s4.s sVar = (com.gamericefishpro.space.s4.s) this.i;
            com.gamericefishpro.space.t4.a aVarB3 = vVar.b();
            int iA5 = aVarB3.a(16);
            if (iA5 != 0) {
                int i9 = iA5 + aVarB3.d;
                i4 = ((ByteBuffer) aVarB3.v).getInt(((ByteBuffer) aVarB3.v).getInt(i9) + i9);
            } else {
                i4 = 0;
            }
            sVar.a(vVar, 0, i4 - 1);
        }
    }
}
