package com.gamericefishpro.space.d9;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.os.Bundle;
import android.os.Looper;
import android.text.InputFilter;
import android.text.TextUtils;
import android.util.Log;
import android.util.LongSparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.translation.TranslationResponseValue;
import android.view.translation.ViewTranslationResponse;
import com.gamericefishpro.space.R;
import com.gamericefishpro.space.bb.v;
import com.gamericefishpro.space.c8.q;
import com.gamericefishpro.space.d0.b1;
import com.gamericefishpro.space.d0.d1;
import com.gamericefishpro.space.d0.g1;
import com.gamericefishpro.space.d0.h0;
import com.gamericefishpro.space.d0.w;
import com.gamericefishpro.space.d0.w0;
import com.gamericefishpro.space.d0.z;
import com.gamericefishpro.space.ei.b0;
import com.gamericefishpro.space.f2.l0;
import com.gamericefishpro.space.g3.o;
import com.gamericefishpro.space.h2.y;
import com.gamericefishpro.space.i9.a4;
import com.gamericefishpro.space.i9.y3;
import com.gamericefishpro.space.n9.a0;
import com.gamericefishpro.space.o1.j0;
import com.gamericefishpro.space.o1.m0;
import com.gamericefishpro.space.o1.s;
import com.gamericefishpro.space.o2.p;
import com.gamericefishpro.space.ph.g0;
import com.gamericefishpro.space.q0.r0;
import com.gamericefishpro.space.r2.i0;
import com.gamericefishpro.space.t0.l1;
import com.gamericefishpro.space.t0.p1;
import com.gamericefishpro.space.t0.r;
import com.gamericefishpro.space.t0.s2;
import com.gamericefishpro.space.t0.v0;
import com.gamericefishpro.space.tb.u;
import com.gamericefishpro.space.v8.c0;
import com.gamericefishpro.space.w.t;
import com.gamericefishpro.space.z4.s0;
import com.gamericefishpro.space.z4.x0;
import com.gamericefishpro.space.z4.y0;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {
    public static ClassLoader a = null;
    public static Thread b = null;
    public static boolean c = true;
    public static Field d;
    public static boolean e;
    public static com.gamericefishpro.space.u1.f f;
    public static com.gamericefishpro.space.u1.f g;
    public static com.gamericefishpro.space.u1.f h;

    public static final Object A(com.gamericefishpro.space.p4.b bVar, com.gamericefishpro.space.p4.d key, Serializable serializable) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Object objC = bVar.c(key);
        return objC == null ? serializable : objC;
    }

    public static final com.gamericefishpro.space.u1.f C() {
        com.gamericefishpro.space.u1.f fVar = h;
        if (fVar != null) {
            return fVar;
        }
        com.gamericefishpro.space.u1.e eVar = new com.gamericefishpro.space.u1.e("Filled.WarningAmber", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        g0 g0Var = com.gamericefishpro.space.u1.g0.a;
        long j = s.b;
        m0 m0Var = new m0(j);
        u uVar = new u(1);
        uVar.B(12.0f, 5.99f);
        uVar.z(19.53f, 19.0f);
        uVar.x(4.47f);
        uVar.z(12.0f, 5.99f);
        uVar.B(12.0f, 2.0f);
        uVar.z(1.0f, 21.0f);
        uVar.y(22.0f);
        uVar.z(12.0f, 2.0f);
        uVar.z(12.0f, 2.0f);
        uVar.s();
        com.gamericefishpro.space.u1.e.a(eVar, (ArrayList) uVar.e, m0Var);
        m0 m0Var2 = new m0(j);
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(new com.gamericefishpro.space.u1.n(13.0f, 16.0f));
        arrayList.add(new com.gamericefishpro.space.u1.u(-2.0f, 0.0f));
        arrayList.add(new com.gamericefishpro.space.u1.u(0.0f, 2.0f));
        arrayList.add(new com.gamericefishpro.space.u1.u(2.0f, 0.0f));
        com.gamericefishpro.space.u1.j jVar = com.gamericefishpro.space.u1.j.c;
        arrayList.add(jVar);
        com.gamericefishpro.space.u1.e.a(eVar, arrayList, m0Var2);
        m0 m0Var3 = new m0(j);
        ArrayList arrayList2 = new ArrayList(32);
        arrayList2.add(new com.gamericefishpro.space.u1.n(13.0f, 10.0f));
        arrayList2.add(new com.gamericefishpro.space.u1.u(-2.0f, 0.0f));
        arrayList2.add(new com.gamericefishpro.space.u1.u(0.0f, 5.0f));
        arrayList2.add(new com.gamericefishpro.space.u1.u(2.0f, 0.0f));
        arrayList2.add(jVar);
        com.gamericefishpro.space.u1.e.a(eVar, arrayList2, m0Var3);
        com.gamericefishpro.space.u1.f fVarB = eVar.b();
        h = fVarB;
        return fVarB;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x017c  */
    /* JADX WARN: Code duplicated, block: B:108:0x0195  */
    /* JADX WARN: Code duplicated, block: B:110:0x019e  */
    /* JADX WARN: Code duplicated, block: B:111:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:120:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:121:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:140:0x0171 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:146:0x0088 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:148:0x0155 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:150:0x01aa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:152:0x018b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:50:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:51:0x00db A[PHI: r6
      0x00db: PHI (r6v24 java.lang.String) = (r6v23 java.lang.String), (r6v36 java.lang.String) binds: [B:46:0x00c3, B:50:0x00d5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:53:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:59:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:61:0x00f4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:62:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:65:0x0101  */
    /* JADX WARN: Code duplicated, block: B:68:0x010b  */
    /* JADX WARN: Code duplicated, block: B:69:0x010d  */
    /* JADX WARN: Code duplicated, block: B:76:0x0121  */
    /* JADX WARN: Code duplicated, block: B:77:0x0124  */
    /* JADX WARN: Code duplicated, block: B:80:0x012e  */
    /* JADX WARN: Code duplicated, block: B:81:0x0130  */
    /* JADX WARN: Code duplicated, block: B:84:0x0139  */
    /* JADX WARN: Code duplicated, block: B:85:0x013c  */
    /* JADX WARN: Code duplicated, block: B:88:0x0146  */
    /* JADX WARN: Code duplicated, block: B:89:0x0149  */
    /* JADX WARN: Code duplicated, block: B:96:0x0164  */
    /* JADX WARN: Multi-variable type inference failed */
    public static void D(Intent intent) {
        int iIntValue;
        int i;
        String string;
        com.gamericefishpro.space.ub.b bVar;
        String string2;
        Object[] objArr;
        String string3;
        String str;
        String string4;
        String str2;
        String string5;
        String str3;
        String string6;
        String str4;
        String string7;
        String str5;
        long j;
        long j2;
        com.gamericefishpro.space.wa.g gVarC;
        com.gamericefishpro.space.wa.h hVar;
        String str6;
        String str7;
        String[] strArrSplit;
        String str8;
        if (P(intent)) {
            E("_nr", intent.getExtras());
        }
        int i2 = 0;
        if ((intent == null || "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction())) ? false : q()) {
            com.gamericefishpro.space.z7.e eVar = (com.gamericefishpro.space.z7.e) FirebaseMessaging.l.get();
            if (eVar == null) {
                Log.e("FirebaseMessaging", "TransportFactory is null. Skip exporting message delivery metrics to Big Query");
                return;
            }
            com.gamericefishpro.space.ub.d dVar = null;
            str = null;
            String str9 = null;
            if (intent != null) {
                Bundle extras = intent.getExtras();
                if (extras == null) {
                    extras = Bundle.EMPTY;
                }
                Object obj = extras.get("google.ttl");
                if (obj instanceof Integer) {
                    iIntValue = ((Integer) obj).intValue();
                } else {
                    if (obj instanceof String) {
                        try {
                            iIntValue = Integer.parseInt((String) obj);
                        } catch (NumberFormatException unused) {
                            Log.w("FirebaseMessaging", "Invalid TTL: " + obj);
                            i = 0;
                        }
                    }
                    i = 0;
                    string = extras.getString("google.to");
                    if (TextUtils.isEmpty(string)) {
                        try {
                            com.gamericefishpro.space.wa.g gVarC2 = com.gamericefishpro.space.wa.g.c();
                            try {
                                Object obj2 = com.gamericefishpro.space.ob.c.m;
                                string = (String) j(((com.gamericefishpro.space.ob.c) gVarC2.b(com.gamericefishpro.space.ob.d.class)).c());
                            } catch (InterruptedException e2) {
                                e = e2;
                                throw new RuntimeException(e);
                            }
                        } catch (InterruptedException | ExecutionException e3) {
                            e = e3;
                        }
                    }
                    String str10 = string;
                    com.gamericefishpro.space.wa.g gVarC3 = com.gamericefishpro.space.wa.g.c();
                    gVarC3.a();
                    String packageName = gVarC3.a.getPackageName();
                    if (com.gamericefishpro.space.m.d.x(extras)) {
                        bVar = com.gamericefishpro.space.ub.b.DISPLAY_NOTIFICATION;
                    } else {
                        bVar = com.gamericefishpro.space.ub.b.DATA_MESSAGE;
                    }
                    com.gamericefishpro.space.ub.b bVar2 = bVar;
                    string2 = extras.getString("google.delivered_priority");
                    if (string2 != null) {
                        if ("high".equals(string2)) {
                            objArr = 1;
                        } else if ("normal".equals(string2)) {
                            objArr = 2;
                        } else {
                            objArr = 0;
                        }
                    } else if ("1".equals(extras.getString("google.priority_reduced"))) {
                        objArr = 2;
                    } else {
                        string2 = extras.getString("google.priority");
                        if ("high".equals(string2)) {
                            objArr = 1;
                        } else if ("normal".equals(string2)) {
                            objArr = 2;
                        } else {
                            objArr = 0;
                        }
                    }
                    if (objArr == 2) {
                        i2 = 5;
                    } else if (objArr == 1) {
                        i2 = 10;
                    }
                    int i3 = i2;
                    string3 = extras.getString("google.message_id");
                    if (string3 == null) {
                        string3 = extras.getString("message_id");
                    }
                    if (string3 != null) {
                        str = string3;
                    } else {
                        str = "";
                    }
                    string4 = extras.getString("from");
                    if (string4 != null && string4.startsWith("/topics/")) {
                        str9 = string4;
                    }
                    if (str9 != null) {
                        str2 = str9;
                    } else {
                        str2 = "";
                    }
                    string5 = extras.getString("collapse_key");
                    if (string5 != null) {
                        str3 = string5;
                    } else {
                        str3 = "";
                    }
                    string6 = extras.getString("google.c.a.m_l");
                    if (string6 != null) {
                        str4 = string6;
                    } else {
                        str4 = "";
                    }
                    string7 = extras.getString("google.c.a.c_l");
                    if (string7 != null) {
                        str5 = string7;
                    } else {
                        str5 = "";
                    }
                    if (extras.containsKey("google.c.sender.id")) {
                        try {
                            j = Long.parseLong(extras.getString("google.c.sender.id"));
                        } catch (NumberFormatException e4) {
                            Log.w("FirebaseMessaging", "error parsing project number", e4);
                            gVarC = com.gamericefishpro.space.wa.g.c();
                            hVar = gVarC.c;
                            gVarC.a();
                            str6 = hVar.e;
                            if (str6 != null) {
                                try {
                                    j = Long.parseLong(str6);
                                } catch (NumberFormatException e5) {
                                    Log.w("FirebaseMessaging", "error parsing sender ID", e5);
                                    gVarC.a();
                                    str7 = hVar.b;
                                    if (str7.startsWith("1:")) {
                                        strArrSplit = str7.split(":");
                                        if (strArrSplit.length < 2) {
                                            j = 0;
                                        } else {
                                            str8 = strArrSplit[1];
                                            if (str8.isEmpty()) {
                                                j = 0;
                                            } else {
                                                try {
                                                    j = Long.parseLong(str8);
                                                } catch (NumberFormatException e6) {
                                                    Log.w("FirebaseMessaging", "error parsing app ID", e6);
                                                    j = 0;
                                                }
                                            }
                                        }
                                    } else {
                                        try {
                                            j = Long.parseLong(str7);
                                        } catch (NumberFormatException e7) {
                                            Log.w("FirebaseMessaging", "error parsing app ID", e7);
                                            j = 0;
                                        }
                                    }
                                }
                            } else {
                                gVarC.a();
                                str7 = hVar.b;
                                if (str7.startsWith("1:")) {
                                    j = Long.parseLong(str7);
                                } else {
                                    strArrSplit = str7.split(":");
                                    if (strArrSplit.length < 2) {
                                        j = 0;
                                    } else {
                                        str8 = strArrSplit[1];
                                        if (str8.isEmpty()) {
                                            j = 0;
                                        } else {
                                            j = Long.parseLong(str8);
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        gVarC = com.gamericefishpro.space.wa.g.c();
                        hVar = gVarC.c;
                        gVarC.a();
                        str6 = hVar.e;
                        if (str6 != null) {
                            j = Long.parseLong(str6);
                        } else {
                            gVarC.a();
                            str7 = hVar.b;
                            if (str7.startsWith("1:")) {
                                j = Long.parseLong(str7);
                            } else {
                                strArrSplit = str7.split(":");
                                if (strArrSplit.length < 2) {
                                    j = 0;
                                } else {
                                    str8 = strArrSplit[1];
                                    if (str8.isEmpty()) {
                                        j = 0;
                                    } else {
                                        j = Long.parseLong(str8);
                                    }
                                }
                            }
                        }
                    }
                    if (j > 0) {
                        j2 = j;
                    } else {
                        j2 = 0;
                    }
                    dVar = new com.gamericefishpro.space.ub.d(j2, str, str10, bVar2, packageName, str3, i3, i, str2, str4, str5);
                }
                i = iIntValue;
                string = extras.getString("google.to");
                if (TextUtils.isEmpty(string)) {
                    com.gamericefishpro.space.wa.g gVarC4 = com.gamericefishpro.space.wa.g.c();
                    Object obj3 = com.gamericefishpro.space.ob.c.m;
                    string = (String) j(((com.gamericefishpro.space.ob.c) gVarC4.b(com.gamericefishpro.space.ob.d.class)).c());
                }
                String str11 = string;
                com.gamericefishpro.space.wa.g gVarC5 = com.gamericefishpro.space.wa.g.c();
                gVarC5.a();
                String packageName2 = gVarC5.a.getPackageName();
                if (com.gamericefishpro.space.m.d.x(extras)) {
                    bVar = com.gamericefishpro.space.ub.b.DISPLAY_NOTIFICATION;
                } else {
                    bVar = com.gamericefishpro.space.ub.b.DATA_MESSAGE;
                }
                com.gamericefishpro.space.ub.b bVar3 = bVar;
                string2 = extras.getString("google.delivered_priority");
                if (string2 != null) {
                    if ("high".equals(string2)) {
                        objArr = 1;
                    } else if ("normal".equals(string2)) {
                        objArr = 2;
                    } else {
                        objArr = 0;
                    }
                } else if ("1".equals(extras.getString("google.priority_reduced"))) {
                    objArr = 2;
                } else {
                    string2 = extras.getString("google.priority");
                    if ("high".equals(string2)) {
                        objArr = 1;
                    } else if ("normal".equals(string2)) {
                        objArr = 2;
                    } else {
                        objArr = 0;
                    }
                }
                if (objArr == 2) {
                    i2 = 5;
                } else if (objArr == 1) {
                    i2 = 10;
                }
                int i4 = i2;
                string3 = extras.getString("google.message_id");
                if (string3 == null) {
                    string3 = extras.getString("message_id");
                }
                if (string3 != null) {
                    str = string3;
                } else {
                    str = "";
                }
                string4 = extras.getString("from");
                if (string4 != null) {
                    str9 = string4;
                }
                if (str9 != null) {
                    str2 = str9;
                } else {
                    str2 = "";
                }
                string5 = extras.getString("collapse_key");
                if (string5 != null) {
                    str3 = string5;
                } else {
                    str3 = "";
                }
                string6 = extras.getString("google.c.a.m_l");
                if (string6 != null) {
                    str4 = string6;
                } else {
                    str4 = "";
                }
                string7 = extras.getString("google.c.a.c_l");
                if (string7 != null) {
                    str5 = string7;
                } else {
                    str5 = "";
                }
                if (extras.containsKey("google.c.sender.id")) {
                    j = Long.parseLong(extras.getString("google.c.sender.id"));
                } else {
                    gVarC = com.gamericefishpro.space.wa.g.c();
                    hVar = gVarC.c;
                    gVarC.a();
                    str6 = hVar.e;
                    if (str6 != null) {
                        j = Long.parseLong(str6);
                    } else {
                        gVarC.a();
                        str7 = hVar.b;
                        if (str7.startsWith("1:")) {
                            j = Long.parseLong(str7);
                        } else {
                            strArrSplit = str7.split(":");
                            if (strArrSplit.length < 2) {
                                j = 0;
                            } else {
                                str8 = strArrSplit[1];
                                if (str8.isEmpty()) {
                                    j = 0;
                                } else {
                                    j = Long.parseLong(str8);
                                }
                            }
                        }
                    }
                }
                if (j > 0) {
                    j2 = j;
                } else {
                    j2 = 0;
                }
                dVar = new com.gamericefishpro.space.ub.d(j2, str, str11, bVar3, packageName2, str3, i4, i, str2, str4, str5);
            }
            if (dVar == null) {
                return;
            }
            try {
                com.gamericefishpro.space.z7.b bVar4 = new com.gamericefishpro.space.z7.b(Integer.valueOf(intent.getIntExtra("google.product_id", 111881503)));
                com.gamericefishpro.space.z7.c cVar = new com.gamericefishpro.space.z7.c("proto");
                com.gamericefishpro.space.tb.j jVar = new com.gamericefishpro.space.tb.j(3);
                q qVar = (q) eVar;
                Set set = qVar.a;
                if (!set.contains(cVar)) {
                    throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", cVar, set));
                }
                new com.gamericefishpro.space.a8.c(qVar.b, cVar, jVar, qVar.c).A(new com.gamericefishpro.space.z7.a(new com.gamericefishpro.space.ub.e(dVar), bVar4));
            } catch (RuntimeException e8) {
                Log.w("FirebaseMessaging", "Failed to send big query analytics payload.", e8);
            }
        }
    }

    public static void E(String str, Bundle bundle) {
        try {
            com.gamericefishpro.space.wa.g.c();
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = new Bundle();
            String string = bundle.getString("google.c.a.c_id");
            if (string != null) {
                bundle2.putString("_nmid", string);
            }
            String string2 = bundle.getString("google.c.a.c_l");
            if (string2 != null) {
                bundle2.putString("_nmn", string2);
            }
            String string3 = bundle.getString("google.c.a.m_l");
            if (!TextUtils.isEmpty(string3)) {
                bundle2.putString("label", string3);
            }
            String string4 = bundle.getString("google.c.a.m_c");
            if (!TextUtils.isEmpty(string4)) {
                bundle2.putString("message_channel", string4);
            }
            String string5 = bundle.getString("from");
            if (string5 == null || !string5.startsWith("/topics/")) {
                string5 = null;
            }
            if (string5 != null) {
                bundle2.putString("_nt", string5);
            }
            String string6 = bundle.getString("google.c.a.ts");
            if (string6 != null) {
                try {
                    bundle2.putInt("_nmt", Integer.parseInt(string6));
                } catch (NumberFormatException e2) {
                    Log.w("FirebaseMessaging", "Error while parsing timestamp in GCM event", e2);
                }
            }
            String string7 = bundle.containsKey("google.c.a.udt") ? bundle.getString("google.c.a.udt") : null;
            if (string7 != null) {
                try {
                    bundle2.putInt("_ndt", Integer.parseInt(string7));
                } catch (NumberFormatException e3) {
                    Log.w("FirebaseMessaging", "Error while parsing use_device_time in GCM event", e3);
                }
            }
            String str2 = com.gamericefishpro.space.m.d.x(bundle) ? "display" : "data";
            if ("_nr".equals(str) || "_nf".equals(str)) {
                bundle2.putString("_nmc", str2);
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                bundle2.toString();
            }
            com.gamericefishpro.space.ya.a aVar = (com.gamericefishpro.space.ya.a) com.gamericefishpro.space.wa.g.c().b(com.gamericefishpro.space.ya.a.class);
            if (aVar != null) {
                ((com.gamericefishpro.space.ya.b) aVar).a(str, bundle2);
            } else {
                Log.w("FirebaseMessaging", "Unable to log event: analytics library is missing");
            }
        } catch (IllegalStateException unused) {
            Log.e("FirebaseMessaging", "Default FirebaseApp has not been initialized. Skip logging event to GA.");
        }
    }

    public static final com.gamericefishpro.space.h1.m F(com.gamericefishpro.space.h1.m mVar, r rVar) {
        rVar.a0(439770924);
        if (!mVar.a(com.gamericefishpro.space.h1.i.d)) {
            rVar.W(1219399079, 0, null, null);
            mVar = (com.gamericefishpro.space.h1.m) mVar.b(com.gamericefishpro.space.h1.j.a, new com.gamericefishpro.space.g3.e(2, rVar));
            rVar.p(false);
        }
        rVar.p(false);
        return mVar;
    }

    public static TypedValue I(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static TypedValue J(int i, Context context, String str) {
        TypedValue typedValueI = I(context, i);
        if (typedValueI != null) {
            return typedValueI;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i)));
    }

    public static final s0 K(com.gamericefishpro.space.ei.g modelClass, x0 store, com.gamericefishpro.space.c5.c defaultCreationExtras, com.gamericefishpro.space.pj.a scope, Function0 function0) {
        Intrinsics.checkNotNullParameter(modelClass, "vmClass");
        Intrinsics.checkNotNullParameter(store, "viewModelStore");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "extras");
        Intrinsics.checkNotNullParameter(scope, "scope");
        com.gamericefishpro.space.tj.b factory = new com.gamericefishpro.space.tj.b(modelClass, scope, function0);
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "extras");
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        com.gamericefishpro.space.u6.i iVar = new com.gamericefishpro.space.u6.i(store, factory, defaultCreationExtras);
        Intrinsics.checkNotNullParameter(modelClass, "kClass");
        modelClass.b();
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        String strB = modelClass.b();
        if (strB != null) {
            return iVar.d(modelClass, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strB));
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public static boolean P(Intent intent) {
        Bundle extras;
        if (intent == null || "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction()) || (extras = intent.getExtras()) == null) {
            return false;
        }
        return "1".equals(extras.getString("google.c.a.e"));
    }

    public static final long Q(long j) {
        return (((long) Float.floatToRawIntBits((int) (j & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits((int) (j >> 32)) << 32);
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00b7 A[Catch: all -> 0x00b3, PHI: r2
      0x00b7: PHI (r2v1 java.lang.Thread) = (r2v0 java.lang.Thread), (r2v11 java.lang.Thread) binds: [B:7:0x000c, B:47:0x00b0] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #3 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x000e, B:46:0x00ae, B:61:0x00e5, B:12:0x0023, B:52:0x00b6, B:53:0x00b7, B:64:0x00e9, B:65:0x00ea, B:13:0x0024, B:15:0x0031, B:25:0x004b, B:26:0x0052, B:28:0x005d, B:34:0x0072, B:35:0x0079, B:43:0x008a, B:44:0x00ac, B:18:0x0040, B:54:0x00b8, B:60:0x00e4, B:59:0x00c2), top: B:76:0x0003, inners: #2, #6 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x00b8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static synchronized ClassLoader R() {
        SecurityException e2;
        Thread thread;
        ThreadGroup threadGroup;
        if (a == null) {
            Thread thread2 = b;
            ClassLoader contextClassLoader = null;
            if (thread2 != null) {
                synchronized (thread2) {
                    try {
                        contextClassLoader = b.getContextClassLoader();
                    } catch (SecurityException e3) {
                        String message = e3.getMessage();
                        StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 41);
                        sb.append("Failed to get thread context classloader ");
                        sb.append(message);
                        Log.w("DynamiteLoaderV2CL", sb.toString());
                    }
                }
                a = contextClassLoader;
            } else {
                ThreadGroup threadGroup2 = Looper.getMainLooper().getThread().getThreadGroup();
                if (threadGroup2 == null) {
                    thread2 = null;
                } else {
                    synchronized (Void.class) {
                        try {
                            try {
                                int iActiveGroupCount = threadGroup2.activeGroupCount();
                                ThreadGroup[] threadGroupArr = new ThreadGroup[iActiveGroupCount];
                                threadGroup2.enumerate(threadGroupArr);
                                int i = 0;
                                int i2 = 0;
                                while (true) {
                                    if (i2 >= iActiveGroupCount) {
                                        threadGroup = null;
                                        break;
                                    }
                                    threadGroup = threadGroupArr[i2];
                                    if ("dynamiteLoader".equals(threadGroup.getName())) {
                                        break;
                                    }
                                    i2++;
                                }
                                if (threadGroup == null) {
                                    threadGroup = new ThreadGroup(threadGroup2, "dynamiteLoader");
                                }
                                int iActiveCount = threadGroup.activeCount();
                                Thread[] threadArr = new Thread[iActiveCount];
                                threadGroup.enumerate(threadArr);
                                while (true) {
                                    if (i >= iActiveCount) {
                                        thread = null;
                                        break;
                                    }
                                    thread = threadArr[i];
                                    if ("GmsDynamite".equals(thread.getName())) {
                                        break;
                                    }
                                    i++;
                                }
                                if (thread == null) {
                                    try {
                                        g gVar = new g(threadGroup, "GmsDynamite");
                                        try {
                                            gVar.setContextClassLoader(null);
                                            gVar.start();
                                            thread = gVar;
                                        } catch (SecurityException e4) {
                                            e2 = e4;
                                            thread = gVar;
                                            String message2 = e2.getMessage();
                                            StringBuilder sb2 = new StringBuilder(String.valueOf(message2).length() + 39);
                                            sb2.append("Failed to enumerate thread/threadgroup ");
                                            sb2.append(message2);
                                            Log.w("DynamiteLoaderV2CL", sb2.toString());
                                        }
                                    } catch (SecurityException e5) {
                                        e2 = e5;
                                    }
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        } catch (SecurityException e6) {
                            e2 = e6;
                            thread = null;
                        }
                    }
                    thread2 = thread;
                }
                b = thread2;
                if (thread2 != null) {
                    synchronized (thread2) {
                        contextClassLoader = b.getContextClassLoader();
                    }
                }
                a = contextClassLoader;
            }
        }
        return a;
    }

    public static Object S(Task task) throws ExecutionException {
        if (task.isSuccessful()) {
            return task.getResult();
        }
        if (task.i()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(task.getException());
    }

    public static final void a(Function0 onBack, com.gamericefishpro.space.k7.f fVar, r rVar, int i) {
        int i2;
        com.gamericefishpro.space.k7.f fVar2;
        com.gamericefishpro.space.k7.f fVar3;
        r rVar2 = rVar;
        Intrinsics.checkNotNullParameter(onBack, "onBack");
        rVar2.b0(300910492);
        int i3 = i | (rVar2.h(onBack) ? 4 : 2) | 16;
        if ((i3 & 19) == 18 && rVar2.E()) {
            rVar2.V();
            fVar3 = fVar;
        } else {
            rVar2.X();
            if ((i & 1) == 0 || rVar2.B()) {
                rVar2.a0(-1614864554);
                y0 y0VarA = com.gamericefishpro.space.d5.a.a(rVar2);
                if (y0VarA == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                s0 s0VarK = K(b0.a(com.gamericefishpro.space.k7.f.class), y0VarA.f(), com.gamericefishpro.space.b9.a.p(y0VarA), com.gamericefishpro.space.cj.b.a(rVar2), null);
                rVar2.p(false);
                i2 = i3 & (-113);
                fVar2 = (com.gamericefishpro.space.k7.f) s0VarK;
            } else {
                rVar2.V();
                i2 = i3 & (-113);
                fVar2 = fVar;
            }
            int i4 = i2;
            rVar2.q();
            v0 v0VarL = com.gamericefishpro.space.t0.i.l(fVar2.c, rVar2);
            h0 h0Var = g1.c;
            l0 l0VarD = com.gamericefishpro.space.d0.r.d(com.gamericefishpro.space.h1.b.d, false);
            int iHashCode = Long.hashCode(rVar2.T);
            l1 l1VarL = rVar2.l();
            com.gamericefishpro.space.h1.m mVarF = F(h0Var, rVar2);
            com.gamericefishpro.space.h2.g.a.getClass();
            y yVar = com.gamericefishpro.space.h2.f.b;
            rVar2.d0();
            if (rVar2.S) {
                rVar2.k(yVar);
            } else {
                rVar2.n0();
            }
            com.gamericefishpro.space.h2.e eVar = com.gamericefishpro.space.h2.f.e;
            com.gamericefishpro.space.t0.i.B(rVar2, l0VarD, eVar);
            com.gamericefishpro.space.h2.e eVar2 = com.gamericefishpro.space.h2.f.d;
            com.gamericefishpro.space.t0.i.B(rVar2, l1VarL, eVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            com.gamericefishpro.space.h2.e eVar3 = com.gamericefishpro.space.h2.f.f;
            com.gamericefishpro.space.t0.i.t(rVar2, numValueOf, eVar3);
            com.gamericefishpro.space.h2.d dVar = com.gamericefishpro.space.h2.f.g;
            com.gamericefishpro.space.t0.i.x(rVar2, dVar);
            com.gamericefishpro.space.h2.e eVar4 = com.gamericefishpro.space.h2.f.c;
            com.gamericefishpro.space.t0.i.B(rVar2, mVarF, eVar4);
            com.gamericefishpro.space.y.q.b(com.gamericefishpro.space.u6.f.I(R.drawable.background, rVar2, 0), null, h0Var, null, com.gamericefishpro.space.f2.h.a, 0.0f, rVar2, 25016, 104);
            Float fValueOf = Float.valueOf(0.0f);
            long j = s.b;
            com.gamericefishpro.space.k7.f fVar4 = fVar2;
            com.gamericefishpro.space.d0.r.a(com.gamericefishpro.space.y.q.d(h0Var, a0.f(new Pair[]{new Pair(fValueOf, new s(s.c(j, 0.5f))), new Pair(Float.valueOf(0.4f), new s(s.c(j, 0.2f))), new Pair(Float.valueOf(1.0f), new s(s.c(j, 0.85f)))}), null, 6), rVar2, 6);
            a4.f(rVar2, 0);
            float f2 = 20;
            com.gamericefishpro.space.h1.m mVarM = com.gamericefishpro.space.d0.j.m(h0Var, f2, 48);
            com.gamericefishpro.space.d0.b0 b0VarA = z.a(com.gamericefishpro.space.d0.h.b, com.gamericefishpro.space.h1.b.F, rVar2, 0);
            int iHashCode2 = Long.hashCode(rVar2.T);
            l1 l1VarL2 = rVar2.l();
            com.gamericefishpro.space.h1.m mVarF2 = F(mVarM, rVar2);
            rVar2.d0();
            if (rVar2.S) {
                rVar2.k(yVar);
            } else {
                rVar2.n0();
            }
            com.gamericefishpro.space.t0.i.B(rVar2, b0VarA, eVar);
            com.gamericefishpro.space.t0.i.B(rVar2, l1VarL2, eVar2);
            com.gamericefishpro.space.m5.a.o(iHashCode2, rVar2, eVar3, rVar2, dVar);
            com.gamericefishpro.space.t0.i.B(rVar2, mVarF2, eVar4);
            com.gamericefishpro.space.h1.j jVar = com.gamericefishpro.space.h1.j.a;
            com.gamericefishpro.space.h1.m mVarB = g1.b(jVar, 1.0f);
            d1 d1VarA = b1.a(com.gamericefishpro.space.d0.h.a, com.gamericefishpro.space.h1.b.D, rVar2, 48);
            int iHashCode3 = Long.hashCode(rVar2.T);
            l1 l1VarL3 = rVar2.l();
            com.gamericefishpro.space.h1.m mVarF3 = F(mVarB, rVar2);
            rVar2.d0();
            if (rVar2.S) {
                rVar2.k(yVar);
            } else {
                rVar2.n0();
            }
            com.gamericefishpro.space.t0.i.B(rVar2, d1VarA, eVar);
            com.gamericefishpro.space.t0.i.B(rVar2, l1VarL3, eVar2);
            com.gamericefishpro.space.m5.a.o(iHashCode3, rVar2, eVar3, rVar2, dVar);
            com.gamericefishpro.space.t0.i.B(rVar2, mVarF3, eVar4);
            y3.h(onBack, rVar2, i4 & 14);
            com.gamericefishpro.space.d0.j.c(g1.g(jVar, 16), rVar2);
            r0.a("ACHIEVEMENTS", null, s.c, com.gamericefishpro.space.hj.c.C(26), com.gamericefishpro.space.u2.k.y, com.gamericefishpro.space.hj.c.C(1), null, 0L, 0, false, 0, 0, new i0(new j0(s.c(j, 0.6f), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(4.0f)) & 4294967295L), 4.0f), 16769023), rVar, 102261126, 12582912, 130730);
            rVar.p(true);
            com.gamericefishpro.space.d0.j.c(g1.d(jVar, 24), rVar);
            com.gamericefishpro.space.d0.e eVarG = com.gamericefishpro.space.d0.h.g(14);
            com.gamericefishpro.space.h1.m mVarB2 = g1.b(jVar, 1.0f);
            w0 w0VarB = com.gamericefishpro.space.d0.j.b(f2);
            rVar.a0(1185017784);
            boolean zF = rVar.f(v0VarL);
            Object objP = rVar.P();
            if (zF || objP == com.gamericefishpro.space.t0.n.a) {
                objP = new com.gamericefishpro.space.a7.c(13, v0VarL);
                rVar.k0(objP);
            }
            rVar.p(false);
            f(mVarB2, null, w0VarB, eVarG, null, null, false, null, (Function1) objP, rVar, 24966);
            rVar2 = rVar;
            rVar2.p(true);
            rVar2.p(true);
            fVar3 = fVar4;
        }
        p1 p1VarT = rVar2.t();
        if (p1VarT != null) {
            p1VarT.d = new w(i, 8, onBack, fVar3);
        }
    }

    public static final void b(Function0 function0, o oVar, com.gamericefishpro.space.b1.h hVar, r rVar, int i, int i2) {
        int i3;
        o oVar2;
        int i4;
        r rVar2;
        o oVar3;
        com.gamericefishpro.space.c3.l lVar;
        rVar.b0(826668973);
        if ((i & 6) == 0) {
            i3 = i | (rVar.h(function0) ? 4 : 2);
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i4 = i3 | 48;
            oVar2 = oVar;
        } else {
            oVar2 = oVar;
            i4 = i3 | (rVar.f(oVar2) ? 32 : 16);
        }
        int i6 = i4;
        if (rVar.S(i6 & 1, (i6 & 147) != 146)) {
            o oVar4 = i5 != 0 ? new o() : oVar2;
            View view = (View) rVar.j(com.gamericefishpro.space.i2.j0.f);
            com.gamericefishpro.space.c3.c cVar = (com.gamericefishpro.space.c3.c) rVar.j(com.gamericefishpro.space.i2.b1.h);
            com.gamericefishpro.space.c3.l lVar2 = (com.gamericefishpro.space.c3.l) rVar.j(com.gamericefishpro.space.i2.b1.n);
            com.gamericefishpro.space.t0.q qVarY = com.gamericefishpro.space.t0.i.y(rVar);
            v0 v0VarZ = com.gamericefishpro.space.t0.i.z(hVar, rVar);
            Object[] objArr = new Object[0];
            Object objP = rVar.P();
            com.gamericefishpro.space.t0.f fVar = com.gamericefishpro.space.t0.n.a;
            if (objP == fVar) {
                objP = com.gamericefishpro.space.g3.f.e;
                rVar.k0(objP);
            }
            rVar2 = rVar;
            UUID uuid = (UUID) com.gamericefishpro.space.e1.k.c(Arrays.copyOf(objArr, 0), com.gamericefishpro.space.e1.k.a, (Function0) objP, rVar, 3456, 0);
            boolean zF = rVar2.f(view) | rVar2.f(cVar);
            Object objP2 = rVar2.P();
            if (zF || objP2 == fVar) {
                oVar3 = oVar4;
                lVar = lVar2;
                com.gamericefishpro.space.g3.q qVar = new com.gamericefishpro.space.g3.q(function0, oVar3, view, lVar, cVar, uuid);
                com.gamericefishpro.space.b1.h hVar2 = new com.gamericefishpro.space.b1.h(346960332, new com.gamericefishpro.space.g3.e(0, v0VarZ), true);
                com.gamericefishpro.space.g3.n nVar = qVar.A;
                nVar.setParentCompositionContext(qVarY);
                nVar.C.setValue(hVar2);
                nVar.G = true;
                if (nVar.v == null && !nVar.isAttachedToWindow()) {
                    throw new IllegalStateException("createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference.");
                }
                nVar.c();
                rVar2.k0(qVar);
                objP2 = qVar;
            } else {
                oVar3 = oVar4;
                lVar = lVar2;
            }
            com.gamericefishpro.space.g3.q qVar2 = (com.gamericefishpro.space.g3.q) objP2;
            boolean zH = rVar2.h(qVar2);
            Object objP3 = rVar2.P();
            if (zH || objP3 == fVar) {
                objP3 = new com.gamericefishpro.space.g3.a(qVar2, 0);
                rVar2.k0(objP3);
            }
            com.gamericefishpro.space.t0.i.d(qVar2, (Function1) objP3, rVar2);
            boolean zH2 = rVar2.h(qVar2) | ((i6 & 14) == 4) | ((i6 & 112) == 32) | rVar2.d(lVar.ordinal());
            Object objP4 = rVar2.P();
            if (zH2 || objP4 == fVar) {
                objP4 = new com.gamericefishpro.space.g3.b(qVar2, function0, oVar3, lVar);
                rVar2.k0(objP4);
            }
            com.gamericefishpro.space.t0.i.g((Function0) objP4, rVar2);
        } else {
            rVar2 = rVar;
            rVar2.V();
            oVar3 = oVar2;
        }
        p1 p1VarT = rVar2.t();
        if (p1VarT != null) {
            p1VarT.d = new com.gamericefishpro.space.g3.c(function0, oVar3, hVar, i, i2);
        }
    }

    public static final void c(Function0 onClick, r rVar, int i) {
        int i2;
        r rVar2 = rVar;
        Intrinsics.checkNotNullParameter("Back to Map", "label");
        Intrinsics.checkNotNullParameter("📍", "icon");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        rVar2.b0(-1513550511);
        if ((i & 6) == 0) {
            i2 = (rVar2.f("Back to Map") ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= rVar2.f("📍") ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= rVar2.h(onClick) ? 256 : 128;
        }
        int i3 = i2;
        if ((i3 & 147) == 146 && rVar2.E()) {
            rVar2.V();
        } else {
            rVar2.a0(448627562);
            Object objP = rVar2.P();
            if (objP == com.gamericefishpro.space.t0.n.a) {
                objP = com.gamericefishpro.space.t0.y0.d(rVar2);
            }
            com.gamericefishpro.space.b0.i iVar = (com.gamericefishpro.space.b0.i) objP;
            rVar2.p(false);
            s2 s2VarA = com.gamericefishpro.space.w.d.a(((Boolean) com.gamericefishpro.space.i.a.n(iVar, rVar2).getValue()).booleanValue() ? 4 : 0, com.gamericefishpro.space.w.c.o(100, 6, null), "press", rVar2, 432, 8);
            com.gamericefishpro.space.h1.j jVar = com.gamericefishpro.space.h1.j.a;
            com.gamericefishpro.space.h1.m mVarI = com.gamericefishpro.space.y.q.i(g1.d(g1.b(jVar, 1.0f), 56), iVar, false, onClick, 28);
            l0 l0VarD = com.gamericefishpro.space.d0.r.d(com.gamericefishpro.space.h1.b.A, false);
            int iHashCode = Long.hashCode(rVar2.T);
            l1 l1VarL = rVar2.l();
            com.gamericefishpro.space.h1.m mVarF = F(mVarI, rVar2);
            com.gamericefishpro.space.h2.g.a.getClass();
            y yVar = com.gamericefishpro.space.h2.f.b;
            rVar2.d0();
            if (rVar2.S) {
                rVar2.k(yVar);
            } else {
                rVar2.n0();
            }
            com.gamericefishpro.space.h2.e eVar = com.gamericefishpro.space.h2.f.e;
            com.gamericefishpro.space.t0.i.B(rVar2, l0VarD, eVar);
            com.gamericefishpro.space.h2.e eVar2 = com.gamericefishpro.space.h2.f.d;
            com.gamericefishpro.space.t0.i.B(rVar2, l1VarL, eVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            com.gamericefishpro.space.h2.e eVar3 = com.gamericefishpro.space.h2.f.f;
            com.gamericefishpro.space.t0.i.t(rVar2, numValueOf, eVar3);
            com.gamericefishpro.space.h2.d dVar = com.gamericefishpro.space.h2.f.g;
            com.gamericefishpro.space.t0.i.x(rVar2, dVar);
            com.gamericefishpro.space.h2.e eVar4 = com.gamericefishpro.space.h2.f.c;
            com.gamericefishpro.space.t0.i.B(rVar2, mVarF, eVar4);
            h0 h0Var = g1.c;
            float f2 = 4;
            float f3 = 16;
            com.gamericefishpro.space.d0.r.a(com.gamericefishpro.space.y.q.e(com.gamericefishpro.space.d0.j.o(h0Var, 0.0f, f2, 0.0f, 0.0f, 13), com.gamericefishpro.space.o1.o.c(4278202455L), com.gamericefishpro.space.k0.e.a(f3)), rVar2, 0);
            com.gamericefishpro.space.h1.m mVarI2 = com.gamericefishpro.space.d0.j.i(com.gamericefishpro.space.d0.j.o(h0Var, 0.0f, 0.0f, 0.0f, f2, 7), 0, ((com.gamericefishpro.space.c3.f) s2VarA.getValue()).d);
            long j = s.c;
            com.gamericefishpro.space.h1.m mVarG = com.gamericefishpro.space.y.q.g(com.gamericefishpro.space.y.q.e(mVarI2, s.c(j, 0.1f), com.gamericefishpro.space.k0.e.a(f3)), 1, s.c(j, 0.3f), com.gamericefishpro.space.k0.e.a(f3));
            d1 d1VarA = b1.a(com.gamericefishpro.space.d0.h.c, com.gamericefishpro.space.h1.b.D, rVar2, 54);
            int iHashCode2 = Long.hashCode(rVar2.T);
            l1 l1VarL2 = rVar2.l();
            com.gamericefishpro.space.h1.m mVarF2 = F(mVarG, rVar2);
            rVar2.d0();
            if (rVar2.S) {
                rVar2.k(yVar);
            } else {
                rVar2.n0();
            }
            com.gamericefishpro.space.t0.i.B(rVar2, d1VarA, eVar);
            com.gamericefishpro.space.t0.i.B(rVar2, l1VarL2, eVar2);
            com.gamericefishpro.space.m5.a.o(iHashCode2, rVar2, eVar3, rVar2, dVar);
            com.gamericefishpro.space.t0.i.B(rVar2, mVarF2, eVar4);
            r0.a("📍", null, 0L, com.gamericefishpro.space.hj.c.C(16), null, 0L, null, 0L, 0, false, 0, 0, null, rVar, ((i3 >> 3) & 14) | 24576, 0, 262126);
            com.gamericefishpro.space.d0.j.c(g1.g(jVar, 8), rVar);
            r0.a("Back to Map", null, s.c(j, 0.9f), com.gamericefishpro.space.hj.c.C(16), com.gamericefishpro.space.u2.k.w, 0L, null, 0L, 0, false, 0, 0, new i0(new j0(s.c(s.b, 0.6f), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(2.0f)) & 4294967295L), 2.0f), 16769023), rVar, (i3 & 14) | 1597824, 12582912, 130986);
            rVar2 = rVar;
            rVar2.p(true);
            rVar2.p(true);
        }
        p1 p1VarT = rVar2.t();
        if (p1VarT != null) {
            p1VarT.d = new com.gamericefishpro.space.k7.g(onClick, i, 1);
        }
    }

    public static final void d(final List board, final Pair pair, final com.gamericefishpro.space.i7.d dVar, final com.gamericefishpro.space.n7.a0 a0Var, final Function2 onTileClick, r rVar, int i) {
        com.gamericefishpro.space.t0.f fVar;
        r rVar2;
        s2 s2VarE;
        r rVar3;
        Intrinsics.checkNotNullParameter(board, "board");
        Intrinsics.checkNotNullParameter(onTileClick, "onTileClick");
        rVar.b0(-602840254);
        int i2 = (rVar.h(onTileClick) ? 16384 : 8192) | i | (rVar.h(board) ? 4 : 2) | (rVar.f(pair) ? 32 : 16) | (rVar.f(dVar) ? 256 : 128) | (rVar.h(a0Var) ? 2048 : 1024);
        if ((i2 & 9363) == 9362 && rVar.E()) {
            rVar.V();
        } else {
            final int size = board.size();
            int size2 = size > 0 ? ((List) board.get(0)).size() : 0;
            if (size2 == 0) {
                p1 p1VarT = rVar.t();
                if (p1VarT != null) {
                    p1VarT.d = new com.gamericefishpro.space.n7.s(board, pair, dVar, a0Var, onTileClick, i, 0);
                    return;
                }
                return;
            }
            com.gamericefishpro.space.t0.f fVar2 = com.gamericefishpro.space.t0.n.a;
            if (a0Var != null) {
                rVar.a0(560365264);
                fVar = fVar2;
                s2VarE = com.gamericefishpro.space.w.c.e(com.gamericefishpro.space.w.c.m("pu_flash", rVar), 0.5f, 1.0f, com.gamericefishpro.space.w.c.l(com.gamericefishpro.space.w.c.o(200, 2, t.a), com.gamericefishpro.space.w.j0.e), "flash_alpha", rVar, 29112);
                rVar2 = rVar;
                rVar2.p(false);
            } else {
                fVar = fVar2;
                rVar2 = rVar;
                rVar2.a0(560656323);
                rVar2.a0(-813198001);
                Object objP = rVar2.P();
                if (objP == fVar) {
                    objP = new com.gamericefishpro.space.t0.b1(0.0f);
                    rVar2.k0(objP);
                }
                s2VarE = (com.gamericefishpro.space.t0.b1) objP;
                rVar2.p(false);
                rVar2.p(false);
            }
            com.gamericefishpro.space.g0.a aVar = new com.gamericefishpro.space.g0.a(size2);
            com.gamericefishpro.space.h1.m mVarB = g1.b(com.gamericefishpro.space.h1.j.a, 1.0f);
            rVar2.a0(-813187003);
            boolean zD = rVar2.d(size) | rVar2.d(size2) | rVar2.h(board) | ((i2 & 112) == 32) | ((i2 & 896) == 256) | rVar2.h(a0Var) | rVar2.f(s2VarE) | ((57344 & i2) == 16384);
            Object objP2 = rVar2.P();
            if (zD || objP2 == fVar) {
                final s2 s2Var = s2VarE;
                final int i3 = size2;
                rVar3 = rVar2;
                Function1 function1 = new Function1() { // from class: com.gamericefishpro.space.n7.t
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        com.gamericefishpro.space.g0.g LazyVerticalGrid = (com.gamericefishpro.space.g0.g) obj;
                        Intrinsics.checkNotNullParameter(LazyVerticalGrid, "$this$LazyVerticalGrid");
                        int i4 = size;
                        int i5 = i3;
                        LazyVerticalGrid.c.a(i4 * i5, new com.gamericefishpro.space.g0.f(com.gamericefishpro.space.g0.g.d, com.gamericefishpro.space.g0.o.d, new com.gamericefishpro.space.b1.h(41445981, new v(i5, board, pair, dVar, a0Var, onTileClick, s2Var), true)));
                        return Unit.a;
                    }
                };
                rVar3.k0(function1);
                objP2 = function1;
            } else {
                rVar3 = rVar2;
            }
            rVar3.p(false);
            a4.h(aVar, mVarB, null, null, null, null, null, false, null, (Function1) objP2, rVar3, 100663344, 764);
        }
        p1 p1VarT2 = rVar.t();
        if (p1VarT2 != null) {
            p1VarT2.d = new com.gamericefishpro.space.n7.s(board, pair, dVar, a0Var, onTileClick, i, 1);
        }
    }

    public static final void e(String label, String icon, com.gamericefishpro.space.h1.m mVar, Function0 onClick, r rVar, int i) {
        int i2;
        r rVar2 = rVar;
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        rVar2.b0(520762810);
        if ((i & 6) == 0) {
            i2 = (rVar2.f(label) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= rVar2.f(icon) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= rVar2.f(mVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= rVar2.h(onClick) ? 2048 : 1024;
        }
        int i3 = i2;
        if ((i3 & 1171) == 1170 && rVar2.E()) {
            rVar2.V();
        } else {
            rVar2.a0(1640475434);
            Object objP = rVar2.P();
            if (objP == com.gamericefishpro.space.t0.n.a) {
                objP = com.gamericefishpro.space.t0.y0.d(rVar2);
            }
            com.gamericefishpro.space.b0.i iVar = (com.gamericefishpro.space.b0.i) objP;
            rVar2.p(false);
            s2 s2VarA = com.gamericefishpro.space.w.d.a(((Boolean) com.gamericefishpro.space.i.a.n(iVar, rVar2).getValue()).booleanValue() ? 4 : 0, com.gamericefishpro.space.w.c.o(100, 6, null), "press", rVar2, 432, 8);
            com.gamericefishpro.space.h1.m mVarI = com.gamericefishpro.space.y.q.i(g1.d(mVar, 56), iVar, false, onClick, 28);
            l0 l0VarD = com.gamericefishpro.space.d0.r.d(com.gamericefishpro.space.h1.b.A, false);
            int iHashCode = Long.hashCode(rVar2.T);
            l1 l1VarL = rVar2.l();
            com.gamericefishpro.space.h1.m mVarF = F(mVarI, rVar2);
            com.gamericefishpro.space.h2.g.a.getClass();
            y yVar = com.gamericefishpro.space.h2.f.b;
            rVar2.d0();
            if (rVar2.S) {
                rVar2.k(yVar);
            } else {
                rVar2.n0();
            }
            com.gamericefishpro.space.h2.e eVar = com.gamericefishpro.space.h2.f.e;
            com.gamericefishpro.space.t0.i.B(rVar2, l0VarD, eVar);
            com.gamericefishpro.space.h2.e eVar2 = com.gamericefishpro.space.h2.f.d;
            com.gamericefishpro.space.t0.i.B(rVar2, l1VarL, eVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            com.gamericefishpro.space.h2.e eVar3 = com.gamericefishpro.space.h2.f.f;
            com.gamericefishpro.space.t0.i.t(rVar2, numValueOf, eVar3);
            com.gamericefishpro.space.h2.d dVar = com.gamericefishpro.space.h2.f.g;
            com.gamericefishpro.space.t0.i.x(rVar2, dVar);
            com.gamericefishpro.space.h2.e eVar4 = com.gamericefishpro.space.h2.f.c;
            com.gamericefishpro.space.t0.i.B(rVar2, mVarF, eVar4);
            h0 h0Var = g1.c;
            float f2 = 4;
            float f3 = 16;
            com.gamericefishpro.space.d0.r.a(com.gamericefishpro.space.y.q.e(com.gamericefishpro.space.d0.j.o(h0Var, 0.0f, f2, 0.0f, 0.0f, 13), com.gamericefishpro.space.o1.o.c(4278202455L), com.gamericefishpro.space.k0.e.a(f3)), rVar2, 0);
            com.gamericefishpro.space.h1.m mVarI2 = com.gamericefishpro.space.d0.j.i(com.gamericefishpro.space.d0.j.o(h0Var, 0.0f, 0.0f, 0.0f, f2, 7), 0, ((com.gamericefishpro.space.c3.f) s2VarA.getValue()).d);
            long j = s.c;
            com.gamericefishpro.space.h1.m mVarG = com.gamericefishpro.space.y.q.g(com.gamericefishpro.space.y.q.e(mVarI2, s.c(j, 0.15f), com.gamericefishpro.space.k0.e.a(f3)), 1, s.c(j, 0.4f), com.gamericefishpro.space.k0.e.a(f3));
            d1 d1VarA = b1.a(com.gamericefishpro.space.d0.h.c, com.gamericefishpro.space.h1.b.D, rVar2, 54);
            int iHashCode2 = Long.hashCode(rVar2.T);
            l1 l1VarL2 = rVar2.l();
            com.gamericefishpro.space.h1.m mVarF2 = F(mVarG, rVar2);
            rVar2.d0();
            if (rVar2.S) {
                rVar2.k(yVar);
            } else {
                rVar2.n0();
            }
            com.gamericefishpro.space.t0.i.B(rVar2, d1VarA, eVar);
            com.gamericefishpro.space.t0.i.B(rVar2, l1VarL2, eVar2);
            com.gamericefishpro.space.m5.a.o(iHashCode2, rVar2, eVar3, rVar2, dVar);
            com.gamericefishpro.space.t0.i.B(rVar2, mVarF2, eVar4);
            r0.a(icon, null, 0L, com.gamericefishpro.space.hj.c.C(16), null, 0L, null, 0L, 0, false, 0, 0, null, rVar, ((i3 >> 3) & 14) | 24576, 0, 262126);
            com.gamericefishpro.space.d0.j.c(g1.g(com.gamericefishpro.space.h1.j.a, 6), rVar);
            r0.a(label, null, j, com.gamericefishpro.space.hj.c.C(15), com.gamericefishpro.space.u2.k.w, 0L, null, 0L, 0, false, 0, 0, new i0(new j0(s.c(s.b, 0.6f), (((long) Float.floatToRawIntBits(2.0f)) & 4294967295L) | (((long) Float.floatToRawIntBits(0.0f)) << 32), 2.0f), 16769023), rVar, (i3 & 14) | 1597824, 12582912, 130986);
            rVar2 = rVar;
            rVar2.p(true);
            rVar2.p(true);
        }
        p1 p1VarT = rVar2.t();
        if (p1VarT != null) {
            p1VarT.d = new com.gamericefishpro.space.a5.a(label, icon, mVar, onClick, i, 4);
        }
    }

    public static final void f(final com.gamericefishpro.space.h1.m mVar, com.gamericefishpro.space.f0.w wVar, final w0 w0Var, final com.gamericefishpro.space.d0.g gVar, com.gamericefishpro.space.h1.c cVar, com.gamericefishpro.space.z.k kVar, boolean z, com.gamericefishpro.space.y.l lVar, final Function1 function1, r rVar, final int i) {
        int i2;
        final com.gamericefishpro.space.f0.w wVar2;
        final com.gamericefishpro.space.h1.c cVar2;
        final com.gamericefishpro.space.z.k kVar2;
        final boolean z2;
        final com.gamericefishpro.space.y.l lVar2;
        int i3;
        com.gamericefishpro.space.f0.w wVar3;
        com.gamericefishpro.space.z.k kVarW;
        boolean z3;
        com.gamericefishpro.space.y.l lVarA;
        rVar.b0(53695811);
        if ((i & 6) == 0) {
            i2 = i | (rVar.f(mVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        int i4 = i2 | 46861328;
        if ((i & 805306368) == 0) {
            i4 |= rVar.h(function1) ? 536870912 : 268435456;
        }
        if (rVar.S(i4 & 1, (306783379 & i4) != 306783378)) {
            rVar.X();
            if ((i & 1) == 0 || rVar.B()) {
                com.gamericefishpro.space.f0.q qVar = com.gamericefishpro.space.f0.y.a;
                Object[] objArr = new Object[0];
                com.gamericefishpro.space.u6.c cVar3 = com.gamericefishpro.space.f0.w.x;
                boolean zD = rVar.d(0) | rVar.d(0);
                Object objP = rVar.P();
                if (zD || objP == com.gamericefishpro.space.t0.n.a) {
                    objP = new com.gamericefishpro.space.a5.h(16);
                    rVar.k0(objP);
                }
                com.gamericefishpro.space.f0.w wVar4 = (com.gamericefishpro.space.f0.w) com.gamericefishpro.space.e1.k.b(objArr, cVar3, (Function0) objP, rVar, 0);
                com.gamericefishpro.space.h1.c cVar4 = com.gamericefishpro.space.h1.b.F;
                i3 = i4 & (-238551153);
                wVar3 = wVar4;
                kVarW = y3.w(rVar);
                cVar2 = cVar4;
                z3 = true;
                lVarA = com.gamericefishpro.space.y.y0.a(rVar);
            } else {
                rVar.V();
                cVar2 = cVar;
                kVarW = kVar;
                z3 = z;
                lVarA = lVar;
                i3 = i4 & (-238551153);
                wVar3 = wVar;
            }
            rVar.q();
            com.gamericefishpro.space.hj.c.g(mVar, wVar3, w0Var, kVarW, z3, lVarA, cVar2, gVar, function1, rVar, 806907264 | (i3 & 14), 6 | ((i3 >> 18) & 7168));
            kVar2 = kVarW;
            z2 = z3;
            lVar2 = lVarA;
            wVar2 = wVar3;
        } else {
            rVar.V();
            wVar2 = wVar;
            cVar2 = cVar;
            kVar2 = kVar;
            z2 = z;
            lVar2 = lVar;
        }
        p1 p1VarT = rVar.t();
        if (p1VarT != null) {
            p1VarT.d = new Function2() { // from class: com.gamericefishpro.space.f0.b
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    com.gamericefishpro.space.d9.h.f(mVar, wVar2, w0Var, gVar, cVar2, kVar2, z2, lVar2, function1, (com.gamericefishpro.space.t0.r) obj, com.gamericefishpro.space.t0.i.D(i | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final void g(Boolean bool, Object obj, com.gamericefishpro.space.z4.u uVar, Function1 function1, r rVar, int i) {
        int i2;
        rVar.b0(696924721);
        if ((i & 6) == 0) {
            i2 = (rVar.h(bool) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= rVar.h(obj) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= 128;
        }
        if ((i & 3072) == 0) {
            i2 |= rVar.h(function1) ? 2048 : 1024;
        }
        if (rVar.S(i2 & 1, (i2 & 1171) != 1170)) {
            rVar.X();
            if ((i & 1) == 0 || rVar.B()) {
                uVar = (com.gamericefishpro.space.z4.u) rVar.j(com.gamericefishpro.space.a5.i.a);
            } else {
                rVar.V();
            }
            int i3 = i2 & (-897);
            rVar.q();
            boolean zF = rVar.f(bool) | rVar.f(obj) | rVar.f(uVar);
            Object objP = rVar.P();
            if (zF || objP == com.gamericefishpro.space.t0.n.a) {
                objP = new com.gamericefishpro.space.a5.g(uVar.g());
                rVar.k0(objP);
            }
            h(uVar, (com.gamericefishpro.space.a5.g) objP, function1, rVar, (i3 >> 3) & 896);
        } else {
            rVar.V();
        }
        com.gamericefishpro.space.z4.u uVar2 = uVar;
        p1 p1VarT = rVar.t();
        if (p1VarT != null) {
            p1VarT.d = new com.gamericefishpro.space.a5.a(bool, obj, uVar2, function1, i, 0);
        }
    }

    public static final void h(com.gamericefishpro.space.z4.u uVar, com.gamericefishpro.space.a5.g gVar, Function1 function1, r rVar, int i) {
        int i2;
        rVar.b0(228371534);
        if ((i & 6) == 0) {
            i2 = (rVar.h(uVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= rVar.h(gVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= rVar.h(function1) ? 256 : 128;
        }
        if (rVar.S(i2 & 1, (i2 & 147) != 146)) {
            boolean zH = rVar.h(gVar) | ((i2 & 896) == 256) | rVar.h(uVar);
            Object objP = rVar.P();
            if (zH || objP == com.gamericefishpro.space.t0.n.a) {
                objP = new com.gamericefishpro.space.a5.b(uVar, gVar, function1, 0);
                rVar.k0(objP);
            }
            com.gamericefishpro.space.t0.i.c(uVar, gVar, (Function1) objP, rVar);
        } else {
            rVar.V();
        }
        p1 p1VarT = rVar.t();
        if (p1VarT != null) {
            p1VarT.d = new com.gamericefishpro.space.a5.c(uVar, gVar, function1, i, 0);
        }
    }

    public static final void i(com.gamericefishpro.space.h1.m mVar, Function2 function2, r rVar, int i) {
        int i2;
        rVar.b0(1090521195);
        if ((i & 6) == 0) {
            i2 = (rVar.f(mVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= rVar.h(function2) ? 32 : 16;
        }
        if (rVar.S(i2 & 1, (i2 & 19) != 18)) {
            Object objP = rVar.P();
            if (objP == com.gamericefishpro.space.t0.n.a) {
                objP = com.gamericefishpro.space.g3.g.a;
                rVar.k0(objP);
            }
            l0 l0Var = (l0) objP;
            int iHashCode = Long.hashCode(rVar.T);
            l1 l1VarL = rVar.l();
            com.gamericefishpro.space.h1.m mVarF = F(mVar, rVar);
            com.gamericefishpro.space.h2.g.a.getClass();
            y yVar = com.gamericefishpro.space.h2.f.b;
            int i3 = (((((i2 << 3) & 112) | (((i2 >> 3) & 14) | 384)) << 6) & 896) | 6;
            rVar.d0();
            if (rVar.S) {
                rVar.k(yVar);
            } else {
                rVar.n0();
            }
            com.gamericefishpro.space.t0.i.B(rVar, l0Var, com.gamericefishpro.space.h2.f.e);
            com.gamericefishpro.space.t0.i.B(rVar, l1VarL, com.gamericefishpro.space.h2.f.d);
            com.gamericefishpro.space.t0.i.t(rVar, Integer.valueOf(iHashCode), com.gamericefishpro.space.h2.f.f);
            com.gamericefishpro.space.t0.i.x(rVar, com.gamericefishpro.space.h2.f.g);
            com.gamericefishpro.space.t0.i.B(rVar, mVarF, com.gamericefishpro.space.h2.f.c);
            function2.invoke(rVar, Integer.valueOf((i3 >> 6) & 14));
            rVar.p(true);
        } else {
            rVar.V();
        }
        p1 p1VarT = rVar.t();
        if (p1VarT != null) {
            p1VarT.d = new com.gamericefishpro.space.f3.n(mVar, function2, i);
        }
    }

    public static Object j(Task task) throws InterruptedException {
        c0.f("Must not be called on the main application thread");
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != null && Objects.equals(looperMyLooper.getThread().getName(), "GoogleApiHandler")) {
            throw new IllegalStateException("Must not be called on GoogleApiHandler thread.");
        }
        c0.h(task, "Task must not be null");
        if (task.j()) {
            return S(task);
        }
        com.gamericefishpro.space.r8.i iVar = new com.gamericefishpro.space.r8.i();
        Executor executor = com.gamericefishpro.space.r9.i.b;
        task.e(executor, iVar);
        task.c(executor, iVar);
        task.a(executor, iVar);
        iVar.d.await();
        return S(task);
    }

    public static Object k(Task task, long j, TimeUnit timeUnit) throws TimeoutException {
        c0.f("Must not be called on the main application thread");
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != null && Objects.equals(looperMyLooper.getThread().getName(), "GoogleApiHandler")) {
            throw new IllegalStateException("Must not be called on GoogleApiHandler thread.");
        }
        c0.h(task, "Task must not be null");
        c0.h(timeUnit, "TimeUnit must not be null");
        if (task.j()) {
            return S(task);
        }
        com.gamericefishpro.space.r8.i iVar = new com.gamericefishpro.space.r8.i();
        Executor executor = com.gamericefishpro.space.r9.i.b;
        task.e(executor, iVar);
        task.c(executor, iVar);
        task.a(executor, iVar);
        if (iVar.d.await(j, timeUnit)) {
            return S(task);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    public static com.gamericefishpro.space.r9.o l(Executor executor, Callable callable) {
        c0.h(executor, "Executor must not be null");
        com.gamericefishpro.space.r9.o oVar = new com.gamericefishpro.space.r9.o();
        executor.execute(new com.gamericefishpro.space.r9.l(2, oVar, callable, false));
        return oVar;
    }

    public static com.gamericefishpro.space.m.d p(com.gamericefishpro.space.m.d dVar, List migrations, com.gamericefishpro.space.ui.c scope, com.gamericefishpro.space.b2.b produceFile) {
        Intrinsics.checkNotNullParameter(migrations, "migrations");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(produceFile, "produceFile");
        com.gamericefishpro.space.l4.h0 storage = new com.gamericefishpro.space.l4.h0(new com.gamericefishpro.space.a2.b(10, produceFile));
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(migrations, "migrations");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(migrations, "migrations");
        Intrinsics.checkNotNullParameter(scope, "scope");
        com.gamericefishpro.space.l4.c fVar = dVar;
        if (dVar == null) {
            fVar = new com.gamericefishpro.space.ka.f(9);
        }
        Intrinsics.checkNotNullParameter(migrations, "migrations");
        return new com.gamericefishpro.space.m.d(new com.gamericefishpro.space.m.d(new com.gamericefishpro.space.l4.c0(storage, com.gamericefishpro.space.ph.w.c(new com.gamericefishpro.space.b0.o(migrations, (com.gamericefishpro.space.th.a) null, 11)), fVar, scope)));
    }

    public static boolean q() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            com.gamericefishpro.space.wa.g.c();
            com.gamericefishpro.space.wa.g gVarC = com.gamericefishpro.space.wa.g.c();
            gVarC.a();
            Context context = gVarC.a;
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("export_to_big_query")) {
                return sharedPreferences.getBoolean("export_to_big_query", false);
            }
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("delivery_metrics_exported_to_big_query_enabled")) {
                return applicationInfo.metaData.getBoolean("delivery_metrics_exported_to_big_query_enabled", false);
            }
            return false;
        } catch (PackageManager.NameNotFoundException | IllegalStateException unused) {
        }
    }

    public static void r(ArrayList arrayList) {
        HashMap map = new HashMap(arrayList.size());
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            com.gamericefishpro.space.bb.b bVar = (com.gamericefishpro.space.bb.b) obj;
            com.gamericefishpro.space.bb.j jVar = new com.gamericefishpro.space.bb.j(bVar);
            for (v vVar : bVar.b) {
                boolean z = bVar.e == 0;
                com.gamericefishpro.space.bb.k kVar = new com.gamericefishpro.space.bb.k(vVar, !z);
                if (!map.containsKey(kVar)) {
                    map.put(kVar, new HashSet());
                }
                Set set = (Set) map.get(kVar);
                if (!set.isEmpty() && z) {
                    throw new IllegalArgumentException("Multiple components provide " + vVar + ".");
                }
                set.add(jVar);
            }
        }
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            for (com.gamericefishpro.space.bb.j jVar2 : (Set) it.next()) {
                for (com.gamericefishpro.space.bb.l lVar : jVar2.a.c) {
                    if (lVar.c == 0) {
                        Set<com.gamericefishpro.space.bb.j> set2 = (Set) map.get(new com.gamericefishpro.space.bb.k(lVar.a, lVar.b == 2));
                        if (set2 != null) {
                            for (com.gamericefishpro.space.bb.j jVar3 : set2) {
                                jVar2.b.add(jVar3);
                                jVar3.c.add(jVar2);
                            }
                        }
                    }
                }
            }
        }
        HashSet<com.gamericefishpro.space.bb.j> hashSet = new HashSet();
        Iterator it2 = map.values().iterator();
        while (it2.hasNext()) {
            hashSet.addAll((Set) it2.next());
        }
        HashSet hashSet2 = new HashSet();
        for (com.gamericefishpro.space.bb.j jVar4 : hashSet) {
            if (jVar4.c.isEmpty()) {
                hashSet2.add(jVar4);
            }
        }
        while (!hashSet2.isEmpty()) {
            com.gamericefishpro.space.bb.j jVar5 = (com.gamericefishpro.space.bb.j) hashSet2.iterator().next();
            hashSet2.remove(jVar5);
            i++;
            for (com.gamericefishpro.space.bb.j jVar6 : jVar5.b) {
                jVar6.c.remove(jVar5);
                if (jVar6.c.isEmpty()) {
                    hashSet2.add(jVar6);
                }
            }
        }
        if (i == arrayList.size()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        for (com.gamericefishpro.space.bb.j jVar7 : hashSet) {
            if (!jVar7.c.isEmpty() && !jVar7.b.isEmpty()) {
                arrayList2.add(jVar7.a);
            }
        }
        throw new com.gamericefishpro.space.bb.m("Dependency cycle detected: " + Arrays.toString(arrayList2.toArray()));
    }

    public static void s(com.gamericefishpro.space.j1.d dVar, LongSparseArray longSparseArray) {
        TranslationResponseValue value;
        CharSequence text;
        p pVar;
        com.gamericefishpro.space.o2.o oVar;
        Function1 function1;
        int size = longSparseArray.size();
        for (int i = 0; i < size; i++) {
            long jKeyAt = longSparseArray.keyAt(i);
            ViewTranslationResponse viewTranslationResponseR = com.gamericefishpro.space.a4.b.r(longSparseArray.get(jKeyAt));
            if (viewTranslationResponseR != null && (value = viewTranslationResponseR.getValue("android:text")) != null && (text = value.getText()) != null && (pVar = (p) dVar.f().b((int) jKeyAt)) != null && (oVar = pVar.a) != null) {
                Object objG = oVar.d.d.g(com.gamericefishpro.space.o2.k.l);
                if (objG == null) {
                    objG = null;
                }
                com.gamericefishpro.space.o2.a aVar = (com.gamericefishpro.space.o2.a) objG;
                if (aVar != null && (function1 = (Function1) aVar.b) != null) {
                }
            }
        }
    }

    public static final Object t(com.gamericefishpro.space.s5.m mVar, String str, com.gamericefishpro.space.vh.c cVar) {
        Object objC = mVar.c(str, new com.gamericefishpro.space.r2.z(5), cVar);
        return objC == com.gamericefishpro.space.uh.a.d ? objC : Unit.a;
    }

    public static int u(int i, int i2) {
        if (i2 < 0) {
            throw new AssertionError("cannot store more than MAX_VALUE elements");
        }
        int iHighestOneBit = i + (i >> 1) + 1;
        if (iHighestOneBit < i2) {
            iHighestOneBit = Integer.highestOneBit(i2 - 1) << 1;
        }
        if (iHighestOneBit < 0) {
            return Integer.MAX_VALUE;
        }
        return iHighestOneBit;
    }

    public static com.gamericefishpro.space.r9.o v(Exception exc) {
        com.gamericefishpro.space.r9.o oVar = new com.gamericefishpro.space.r9.o();
        oVar.l(exc);
        return oVar;
    }

    public static com.gamericefishpro.space.r9.o w(Object obj) {
        com.gamericefishpro.space.r9.o oVar = new com.gamericefishpro.space.r9.o();
        oVar.m(obj);
        return oVar;
    }

    public static final com.gamericefishpro.space.u1.f x() {
        com.gamericefishpro.space.u1.f fVar = f;
        if (fVar != null) {
            return fVar;
        }
        com.gamericefishpro.space.u1.e eVar = new com.gamericefishpro.space.u1.e("Filled.ArrowBack", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        g0 g0Var = com.gamericefishpro.space.u1.g0.a;
        m0 m0Var = new m0(s.b);
        u uVar = new u(1);
        uVar.B(20.0f, 11.0f);
        uVar.x(7.83f);
        uVar.A(5.59f, -5.59f);
        uVar.z(12.0f, 4.0f);
        uVar.A(-8.0f, 8.0f);
        uVar.A(8.0f, 8.0f);
        uVar.A(1.41f, -1.41f);
        uVar.z(7.83f, 13.0f);
        uVar.x(20.0f);
        uVar.G(-2.0f);
        uVar.s();
        com.gamericefishpro.space.u1.e.a(eVar, (ArrayList) uVar.e, m0Var);
        com.gamericefishpro.space.u1.f fVarB = eVar.b();
        f = fVarB;
        return fVarB;
    }

    public static final int y(Cursor c2, String name) {
        String strV;
        Intrinsics.checkNotNullParameter(c2, "c");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(c2, "c");
        Intrinsics.checkNotNullParameter(name, "name");
        int columnIndex = c2.getColumnIndex(name);
        if (columnIndex < 0) {
            columnIndex = c2.getColumnIndex("`" + name + '`');
            if (columnIndex < 0) {
                columnIndex = -1;
            }
        }
        if (columnIndex >= 0) {
            return columnIndex;
        }
        try {
            String[] columnNames = c2.getColumnNames();
            Intrinsics.checkNotNullExpressionValue(columnNames, "getColumnNames(...)");
            strV = com.gamericefishpro.space.ph.v.v(63, columnNames);
        } catch (Exception unused) {
            strV = "unknown";
        }
        throw new IllegalArgumentException("column '" + name + "' does not exist. Available columns: " + strV);
    }

    public float B(View view) {
        if (c) {
            try {
                return view.getTransitionAlpha();
            } catch (NoSuchMethodError unused) {
                c = false;
            }
        }
        return view.getAlpha();
    }

    public abstract void G(com.gamericefishpro.space.w6.g gVar, com.gamericefishpro.space.w6.g gVar2);

    public abstract void H(com.gamericefishpro.space.w6.g gVar, Thread thread);

    public abstract void L(boolean z);

    public abstract void M(boolean z);

    public void N(View view, float f2) {
        if (c) {
            try {
                view.setTransitionAlpha(f2);
                return;
            } catch (NoSuchMethodError unused) {
                c = false;
            }
        }
        view.setAlpha(f2);
    }

    public void O(View view, int i) {
        if (!e) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                d = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            e = true;
        }
        Field field = d;
        if (field != null) {
            try {
                d.setInt(view, i | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    public abstract boolean m(com.gamericefishpro.space.w6.h hVar, com.gamericefishpro.space.w6.c cVar, com.gamericefishpro.space.w6.c cVar2);

    public abstract boolean n(com.gamericefishpro.space.w6.h hVar, Object obj, Object obj2);

    public abstract boolean o(com.gamericefishpro.space.w6.h hVar, com.gamericefishpro.space.w6.g gVar, com.gamericefishpro.space.w6.g gVar2);

    public abstract InputFilter[] z(InputFilter[] inputFilterArr);
}
