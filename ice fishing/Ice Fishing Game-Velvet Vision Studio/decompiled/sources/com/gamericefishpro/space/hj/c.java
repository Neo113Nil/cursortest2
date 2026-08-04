package com.gamericefishpro.space.hj;

import android.app.NotificationManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.gamericefishpro.space.R;
import com.gamericefishpro.space.c3.n;
import com.gamericefishpro.space.c3.o;
import com.gamericefishpro.space.d0.b0;
import com.gamericefishpro.space.d0.b1;
import com.gamericefishpro.space.d0.d1;
import com.gamericefishpro.space.d0.e1;
import com.gamericefishpro.space.d0.g1;
import com.gamericefishpro.space.d0.h0;
import com.gamericefishpro.space.d0.n1;
import com.gamericefishpro.space.d0.w0;
import com.gamericefishpro.space.d0.z;
import com.gamericefishpro.space.d9.h;
import com.gamericefishpro.space.e.q;
import com.gamericefishpro.space.e1.k;
import com.gamericefishpro.space.f0.w;
import com.gamericefishpro.space.f2.l0;
import com.gamericefishpro.space.h0.p;
import com.gamericefishpro.space.h0.p0;
import com.gamericefishpro.space.h1.l;
import com.gamericefishpro.space.h1.m;
import com.gamericefishpro.space.h2.a1;
import com.gamericefishpro.space.h2.f0;
import com.gamericefishpro.space.h2.y;
import com.gamericefishpro.space.i2.j0;
import com.gamericefishpro.space.i9.a4;
import com.gamericefishpro.space.i9.g;
import com.gamericefishpro.space.i9.y3;
import com.gamericefishpro.space.m1.u;
import com.gamericefishpro.space.o2.s;
import com.gamericefishpro.space.ph.g0;
import com.gamericefishpro.space.ph.q0;
import com.gamericefishpro.space.ph.x;
import com.gamericefishpro.space.pi.a0;
import com.gamericefishpro.space.pi.k0;
import com.gamericefishpro.space.pi.u1;
import com.gamericefishpro.space.q0.r0;
import com.gamericefishpro.space.r2.i0;
import com.gamericefishpro.space.s2.j;
import com.gamericefishpro.space.s5.t;
import com.gamericefishpro.space.s5.v;
import com.gamericefishpro.space.t0.c1;
import com.gamericefishpro.space.t0.d0;
import com.gamericefishpro.space.t0.e0;
import com.gamericefishpro.space.t0.i;
import com.gamericefishpro.space.t0.l1;
import com.gamericefishpro.space.t0.n2;
import com.gamericefishpro.space.t0.p1;
import com.gamericefishpro.space.t0.r;
import com.gamericefishpro.space.t0.s2;
import com.gamericefishpro.space.t0.y0;
import com.gamericefishpro.space.u1.f;
import com.gamericefishpro.space.wi.e;
import com.gamericefishpro.space.z.n0;
import com.gamericefishpro.space.z.v0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    public static f a;
    public static f b;

    public static final float A(Layout layout, int i, Paint paint) {
        float width;
        float width2;
        ThreadLocal threadLocal = j.a;
        if (layout.getEllipsisCount(i) <= 0) {
            return 0.0f;
        }
        if (layout.getParagraphDirection(i) != -1 || layout.getWidth() >= layout.getLineRight(i)) {
            return 0.0f;
        }
        float fMeasureText = paint.measureText("…") + (layout.getLineRight(i) - layout.getPrimaryHorizontal(layout.getEllipsisStart(i) + layout.getLineStart(i)));
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i);
        if ((paragraphAlignment != null ? com.gamericefishpro.space.t2.d.a[paragraphAlignment.ordinal()] : -1) == 1) {
            width = layout.getWidth() - layout.getLineRight(i);
            width2 = (layout.getWidth() - fMeasureText) / 2.0f;
        } else {
            width = layout.getWidth() - layout.getLineRight(i);
            width2 = layout.getWidth() - fMeasureText;
        }
        return width - width2;
    }

    public static final ViewParent B(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        ViewParent parent = view.getParent();
        if (parent != null) {
            return parent;
        }
        Object tag = view.getTag(R.id.view_tree_disjoint_parent);
        if (tag instanceof ViewParent) {
            return (ViewParent) tag;
        }
        return null;
    }

    public static final long C(int i) {
        return G(4294967296L, i);
    }

    public static void D(final Context context) {
        final boolean z;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        if (y3.x(context).getBoolean("proxy_notification_initialized", false)) {
            return;
        }
        try {
            Context applicationContext = context.getApplicationContext();
            PackageManager packageManager = applicationContext.getPackageManager();
            z = (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_notification_delegation_enabled")) ? true : applicationInfo.metaData.getBoolean("firebase_messaging_notification_delegation_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
        }
        if (Build.VERSION.SDK_INT < 29) {
            h.w(null);
        } else {
            final com.gamericefishpro.space.r9.h hVar = new com.gamericefishpro.space.r9.h();
            new Runnable() { // from class: com.gamericefishpro.space.tb.p
                @Override // java.lang.Runnable
                public final void run() {
                    Context context2 = context;
                    com.gamericefishpro.space.r9.h hVar2 = hVar;
                    try {
                        if (!(Binder.getCallingUid() == context2.getApplicationInfo().uid)) {
                            Log.e("FirebaseMessaging", "error configuring notification delegate for package " + context2.getPackageName());
                            return;
                        }
                        SharedPreferences.Editor editorEdit = y3.x(context2).edit();
                        editorEdit.putBoolean("proxy_notification_initialized", true);
                        editorEdit.apply();
                        NotificationManager notificationManager = (NotificationManager) context2.getSystemService(NotificationManager.class);
                        if (z) {
                            notificationManager.setNotificationDelegate("com.google.android.gms");
                        } else if ("com.google.android.gms".equals(notificationManager.getNotificationDelegate())) {
                            notificationManager.setNotificationDelegate(null);
                        }
                    } finally {
                        hVar2.c(null);
                    }
                }
            }.run();
        }
    }

    public static boolean E(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    public static String F(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb = new StringBuilder(str2.length() + str.length());
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            if (str2.length() > i) {
                sb.append(str2.charAt(i));
            }
        }
        return sb.toString();
    }

    public static final long G(long j, float f) {
        long jFloatToRawIntBits = j | (((long) Float.floatToRawIntBits(f)) & 4294967295L);
        o[] oVarArr = n.b;
        return jFloatToRawIntBits;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public static final Object H(t tVar, com.gamericefishpro.space.th.a aVar, Function1 function1, boolean z, boolean z2) {
        com.gamericefishpro.space.y5.c cVar;
        t tVar2;
        Function1 function2;
        boolean z3;
        boolean z4;
        if (aVar instanceof com.gamericefishpro.space.y5.c) {
            cVar = (com.gamericefishpro.space.y5.c) aVar;
            int i = cVar.y;
            if ((i & Integer.MIN_VALUE) != 0) {
                cVar.y = i - Integer.MIN_VALUE;
            } else {
                cVar = new com.gamericefishpro.space.y5.c(aVar);
            }
        } else {
            cVar = new com.gamericefishpro.space.y5.c(aVar);
        }
        com.gamericefishpro.space.y5.c cVar2 = cVar;
        Object obj = cVar2.w;
        com.gamericefishpro.space.uh.a aVar2 = com.gamericefishpro.space.uh.a.d;
        int i2 = cVar2.y;
        if (i2 == 0) {
            com.gamericefishpro.space.wa.b.P(obj);
            if (tVar.o() && tVar.s() && tVar.p()) {
                com.gamericefishpro.space.y5.d dVar = new com.gamericefishpro.space.y5.d(tVar, null, function1, z2, z);
                cVar2.y = 1;
                Object objV = tVar.v(z, dVar, cVar2);
                if (objV != aVar2) {
                    return objV;
                }
            } else {
                cVar2.d = tVar;
                cVar2.e = function1;
                cVar2.i = z;
                cVar2.v = z2;
                cVar2.y = 2;
                CoroutineContext coroutineContextX = x(tVar, z2, cVar2);
                if (coroutineContextX != aVar2) {
                    tVar2 = tVar;
                    function2 = function1;
                    obj = coroutineContextX;
                    z3 = z2;
                    z4 = z;
                }
            }
        }
        if (i2 == 1) {
            com.gamericefishpro.space.wa.b.P(obj);
            return obj;
        }
        if (i2 != 2) {
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.gamericefishpro.space.wa.b.P(obj);
            return obj;
        }
        boolean z5 = cVar2.v;
        boolean z6 = cVar2.i;
        Function1 function3 = cVar2.e;
        t tVar3 = cVar2.d;
        com.gamericefishpro.space.wa.b.P(obj);
        z3 = z5;
        z4 = z6;
        function2 = function3;
        tVar2 = tVar3;
        com.gamericefishpro.space.y5.b bVar = new com.gamericefishpro.space.y5.b(tVar2, null, function2, z4, z3);
        cVar2.d = null;
        cVar2.e = null;
        cVar2.y = 3;
        Object objD = a0.D((CoroutineContext) obj, bVar, cVar2);
        return objD == aVar2 ? aVar2 : objD;
    }

    public static com.gamericefishpro.space.o4.b I(String name, com.gamericefishpro.space.m.d dVar, com.gamericefishpro.space.db.a aVar, int i) {
        if ((i & 2) != 0) {
            dVar = null;
        }
        Function1 produceMigrations = aVar;
        if ((i & 4) != 0) {
            produceMigrations = com.gamericefishpro.space.o4.a.d;
        }
        e eVar = k0.a;
        com.gamericefishpro.space.wi.d dVar2 = com.gamericefishpro.space.wi.d.i;
        u1 u1VarD = a0.d();
        dVar2.getClass();
        com.gamericefishpro.space.ui.c scope = a0.b(kotlin.coroutines.e.c(dVar2, u1VarD));
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(produceMigrations, "produceMigrations");
        Intrinsics.checkNotNullParameter(scope, "scope");
        return new com.gamericefishpro.space.o4.b(name, dVar, produceMigrations, scope);
    }

    public static final long J(com.gamericefishpro.space.y1.b bVar, v0 v0Var, com.gamericefishpro.space.y1.a aVar) {
        float fIntBitsToFloat;
        long jFloatToRawIntBits;
        long j;
        if (v0Var == null) {
            return bVar.c;
        }
        int i = aVar.a;
        if (i == 1) {
            fIntBitsToFloat = Float.intBitsToFloat((int) (bVar.c >> 32));
        } else {
            if (i != 2) {
                return bVar.c;
            }
            fIntBitsToFloat = Float.intBitsToFloat((int) (bVar.c & 4294967295L));
        }
        if (v0Var == v0.e) {
            long jFloatToRawIntBits2 = Float.floatToRawIntBits(fIntBitsToFloat);
            jFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
            j = jFloatToRawIntBits2 << 32;
        } else {
            long jFloatToRawIntBits3 = Float.floatToRawIntBits(0.0f);
            jFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat);
            j = jFloatToRawIntBits3 << 32;
        }
        return j | (4294967295L & jFloatToRawIntBits);
    }

    public static final long K(com.gamericefishpro.space.y1.b bVar, v0 v0Var, com.gamericefishpro.space.y1.a aVar) {
        float fIntBitsToFloat;
        long j = bVar.g;
        if (v0Var == null) {
            return j;
        }
        int i = aVar.a;
        if (i == 1) {
            fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        } else {
            if (i != 2) {
                return j;
            }
            fIntBitsToFloat = Float.intBitsToFloat((int) (j & 4294967295L));
        }
        if (v0Var == v0.e) {
            return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
        }
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32);
    }

    public static final Cursor L(t db, v query) {
        Intrinsics.checkNotNullParameter(db, "db");
        Intrinsics.checkNotNullParameter(query, "sqLiteQuery");
        db.getClass();
        Intrinsics.checkNotNullParameter(query, "query");
        db.a();
        db.b();
        return db.j().L().f(query);
    }

    public static boolean M(Parcel parcel, int i) {
        Z(parcel, i, 4);
        return parcel.readInt() != 0;
    }

    public static IBinder N(Parcel parcel, int i) {
        int iQ = Q(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iQ == 0) {
            return null;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(iDataPosition + iQ);
        return strongBinder;
    }

    public static int O(Parcel parcel, int i) {
        Z(parcel, i, 4);
        return parcel.readInt();
    }

    public static long P(Parcel parcel, int i) {
        Z(parcel, i, 8);
        return parcel.readLong();
    }

    public static int Q(Parcel parcel, int i) {
        return (i & (-65536)) != -65536 ? (char) (i >> 16) : parcel.readInt();
    }

    public static final q R(com.gamericefishpro.space.i.a aVar, Function1 function1, r rVar, int i) {
        i.z(aVar, rVar);
        Object objZ = i.z(function1, rVar);
        Object[] objArr = new Object[0];
        Object objP = rVar.P();
        Object obj = com.gamericefishpro.space.t0.n.a;
        if (objP == obj) {
            objP = new com.gamericefishpro.space.a5.h(8);
            rVar.k0(objP);
        }
        String str = (String) k.c(Arrays.copyOf(objArr, 0), k.a, (Function0) objP, rVar, 3456, 0);
        com.gamericefishpro.space.h.e eVar = (com.gamericefishpro.space.h.e) rVar.j(com.gamericefishpro.space.e.o.a);
        if (eVar == null) {
            rVar.a0(1213380307);
            Object baseContext = (Context) rVar.j(j0.b);
            while (true) {
                if (!(baseContext instanceof ContextWrapper)) {
                    baseContext = null;
                    break;
                }
                if (baseContext instanceof com.gamericefishpro.space.h.e) {
                    break;
                }
                baseContext = ((ContextWrapper) baseContext).getBaseContext();
            }
            eVar = (com.gamericefishpro.space.h.e) baseContext;
        } else {
            rVar.a0(1213379439);
        }
        rVar.p(false);
        if (eVar == null) {
            throw new IllegalStateException("No ActivityResultRegistryOwner was provided via LocalActivityResultRegistryOwner");
        }
        Object obj2 = ((com.gamericefishpro.space.d.k) eVar).A;
        Object objP2 = rVar.P();
        if (objP2 == obj) {
            objP2 = new com.gamericefishpro.space.e.a();
            rVar.k0(objP2);
        }
        com.gamericefishpro.space.e.a aVar2 = (com.gamericefishpro.space.e.a) objP2;
        Object objP3 = rVar.P();
        if (objP3 == obj) {
            objP3 = new q(aVar2);
            rVar.k0(objP3);
        }
        q qVar = (q) objP3;
        boolean zH = rVar.h(aVar2) | rVar.h(obj2) | rVar.f(str) | rVar.h(aVar) | rVar.f(objZ);
        Object objP4 = rVar.P();
        if (zH || objP4 == obj) {
            Object bVar = new com.gamericefishpro.space.e.b(aVar2, obj2, str, aVar, objZ, 0);
            rVar.k0(bVar);
            objP4 = bVar;
        }
        Function1 function2 = (Function1) objP4;
        boolean zF = rVar.f(obj2) | rVar.f(str) | rVar.f(aVar);
        Object objP5 = rVar.P();
        if (zF || objP5 == obj) {
            objP5 = new e0(function2);
            rVar.k0(objP5);
        }
        return qVar;
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00a1 A[PHI: r0
      0x00a1: PHI (r0v10 int) = (r0v5 int), (r0v6 int), (r0v7 int), (r0v8 int) binds: [B:54:0x009f, B:57:0x00a4, B:60:0x00a8, B:63:0x00ac] A[DONT_GENERATE, DONT_INLINE]] */
    public static final Object S(u uVar, int i, Function1 function1) {
        int i2;
        int i3;
        Object objInvoke;
        l lVarE;
        com.gamericefishpro.space.h0.q qVarE0;
        a1 a1Var;
        if (!uVar.d.G) {
            com.gamericefishpro.space.e2.a.b("visitAncestors called on an unattached node");
        }
        l lVar = uVar.d.w;
        f0 f0VarS = com.gamericefishpro.space.h2.k.s(uVar);
        loop0: while (true) {
            i2 = 0;
            i3 = 1;
            objInvoke = null;
            if (f0VarS == null) {
                lVarE = null;
                break;
            }
            if ((f0VarS.Z.f.v & 1024) != 0) {
                while (lVar != null) {
                    if ((lVar.i & 1024) != 0) {
                        lVarE = lVar;
                        com.gamericefishpro.space.v0.e eVar = null;
                        while (lVarE != null) {
                            if (lVarE instanceof u) {
                                break loop0;
                            }
                            if ((lVarE.i & 1024) != 0 && (lVarE instanceof com.gamericefishpro.space.h2.j)) {
                                int i4 = 0;
                                for (l lVar2 = ((com.gamericefishpro.space.h2.j) lVarE).I; lVar2 != null; lVar2 = lVar2.y) {
                                    if ((lVar2.i & 1024) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            lVarE = lVar2;
                                        } else {
                                            if (eVar == null) {
                                                eVar = new com.gamericefishpro.space.v0.e(new l[16]);
                                            }
                                            if (lVarE != null) {
                                                eVar.b(lVarE);
                                                lVarE = null;
                                            }
                                            eVar.b(lVar2);
                                        }
                                    }
                                }
                                if (i4 == 1) {
                                }
                            }
                            lVarE = com.gamericefishpro.space.h2.k.e(eVar);
                        }
                    }
                    lVar = lVar.w;
                }
            }
            f0VarS = f0VarS.v();
            lVar = (f0VarS == null || (a1Var = f0VarS.Z) == null) ? null : a1Var.e;
        }
        u uVar2 = (u) lVarE;
        if ((uVar2 != null && Intrinsics.a(uVar2.E0(), uVar.E0())) || (qVarE0 = uVar.E0()) == null) {
            return null;
        }
        int i5 = 5;
        if (i == 5) {
            i3 = i5;
        } else {
            i5 = 6;
            if (i == 6) {
                i3 = i5;
            } else {
                i5 = 3;
                if (i == 3) {
                    i3 = i5;
                } else {
                    i5 = 4;
                    if (i == 4) {
                        i3 = i5;
                    } else if (i == 1) {
                        i3 = 2;
                    } else if (i != 2) {
                        throw new IllegalStateException("Unsupported direction for beyond bounds layout");
                    }
                }
            }
        }
        if (qVarE0.H.a() <= 0 || !qVarE0.H.c() || !qVarE0.G) {
            return function1.invoke(com.gamericefishpro.space.h0.q.K);
        }
        int iB = qVarE0.B0(i3) ? qVarE0.H.b() : qVarE0.H.e();
        com.gamericefishpro.space.ei.a0 a0Var = new com.gamericefishpro.space.ei.a0();
        com.gamericefishpro.space.h0.l lVar3 = qVarE0.I;
        lVar3.getClass();
        com.gamericefishpro.space.h0.k kVar = new com.gamericefishpro.space.h0.k(iB, iB);
        lVar3.a.b(kVar);
        a0Var.d = kVar;
        int iD = qVarE0.H.d() * 2;
        int iA = qVarE0.H.a();
        if (iD > iA) {
            iD = iA;
        }
        while (objInvoke == null && qVarE0.A0((com.gamericefishpro.space.h0.k) a0Var.d, i3) && i2 < iD) {
            com.gamericefishpro.space.h0.k kVar2 = (com.gamericefishpro.space.h0.k) a0Var.d;
            int i6 = kVar2.a;
            int i7 = kVar2.b;
            if (qVarE0.B0(i3)) {
                i7++;
            } else {
                i6--;
            }
            com.gamericefishpro.space.h0.l lVar4 = qVarE0.I;
            lVar4.getClass();
            com.gamericefishpro.space.h0.k kVar3 = new com.gamericefishpro.space.h0.k(i6, i7);
            lVar4.a.b(kVar3);
            qVarE0.I.a.k((com.gamericefishpro.space.h0.k) a0Var.d);
            a0Var.d = kVar3;
            i2++;
            com.gamericefishpro.space.h2.k.s(qVarE0).k();
            objInvoke = function1.invoke(new p(qVarE0, a0Var, i3));
        }
        qVarE0.I.a.k((com.gamericefishpro.space.h0.k) a0Var.d);
        com.gamericefishpro.space.h2.k.s(qVarE0).k();
        return objInvoke;
    }

    public static final void T(com.gamericefishpro.space.e4.h hVar, com.gamericefishpro.space.o2.o oVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = hVar.a;
        Object objG = oVar.k().d.g(s.f);
        if (objG == null) {
            objG = null;
        }
        com.gamericefishpro.space.o2.c cVar = (com.gamericefishpro.space.o2.c) objG;
        if (cVar != null) {
            accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(cVar.a, cVar.b, false, 0));
            return;
        }
        ArrayList arrayList = new ArrayList();
        Object objG2 = oVar.k().d.g(s.e);
        if ((objG2 != null ? objG2 : null) != null) {
            List listJ = com.gamericefishpro.space.o2.o.j(4, oVar);
            int size = listJ.size();
            for (int i = 0; i < size; i++) {
                com.gamericefishpro.space.o2.o oVar2 = (com.gamericefishpro.space.o2.o) listJ.get(i);
                if (oVar2.k().d.c(s.G)) {
                    arrayList.add(oVar2);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        boolean zK = k(arrayList);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(zK ? 1 : arrayList.size(), zK ? arrayList.size() : 1, false, 0));
    }

    public static final void U(com.gamericefishpro.space.e4.h hVar, com.gamericefishpro.space.o2.o oVar) {
        Object objG = oVar.k().d.g(s.g);
        if (objG == null) {
            objG = null;
        }
        if (objG != null) {
            throw new ClassCastException();
        }
        com.gamericefishpro.space.o2.o oVarL = oVar.l();
        if (oVarL == null) {
            return;
        }
        Object objG2 = oVarL.k().d.g(s.e);
        if (objG2 == null) {
            objG2 = null;
        }
        if (objG2 != null) {
            Object objG3 = oVarL.k().d.g(s.f);
            com.gamericefishpro.space.o2.c cVar = (com.gamericefishpro.space.o2.c) (objG3 != null ? objG3 : null);
            if (cVar == null || (cVar.a >= 0 && cVar.b >= 0)) {
                if (oVar.k().d.c(s.G)) {
                    ArrayList arrayList = new ArrayList();
                    List listJ = com.gamericefishpro.space.o2.o.j(4, oVarL);
                    int size = listJ.size();
                    int i = 0;
                    for (int i2 = 0; i2 < size; i2++) {
                        com.gamericefishpro.space.o2.o oVar2 = (com.gamericefishpro.space.o2.o) listJ.get(i2);
                        if (oVar2.k().d.c(s.G)) {
                            arrayList.add(oVar2);
                            if (oVar2.c.w() < oVar.c.w()) {
                                i++;
                            }
                        }
                    }
                    if (arrayList.isEmpty()) {
                        return;
                    }
                    boolean zK = k(arrayList);
                    int i3 = zK ? 0 : i;
                    int i4 = zK ? i : 0;
                    Object objG4 = oVar.k().d.g(s.G);
                    if (objG4 == null) {
                        objG4 = Boolean.FALSE;
                    }
                    hVar.a.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(i3, 1, i4, 1, false, ((Boolean) objG4).booleanValue()));
                }
            }
        }
    }

    public static void V(Parcel parcel, int i) {
        parcel.setDataPosition(parcel.dataPosition() + Q(parcel, i));
    }

    public static final com.gamericefishpro.space.p4.d W(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new com.gamericefishpro.space.p4.d(name);
    }

    public static int X(Parcel parcel) {
        int i = parcel.readInt();
        int iQ = Q(parcel, i);
        char c = (char) i;
        int iDataPosition = parcel.dataPosition();
        if (c != 20293) {
            throw new com.gamericefishpro.space.w8.b("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(i))), parcel);
        }
        int i2 = iQ + iDataPosition;
        if (i2 >= iDataPosition && i2 <= parcel.dataSize()) {
            return i2;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(iDataPosition).length() + 32 + String.valueOf(i2).length());
        sb.append("Size read is invalid start=");
        sb.append(iDataPosition);
        sb.append(" end=");
        sb.append(i2);
        throw new com.gamericefishpro.space.w8.b(sb.toString(), parcel);
    }

    public static final m Y(m mVar, float f) {
        return mVar.c(new com.gamericefishpro.space.h1.o(f));
    }

    public static void Z(Parcel parcel, int i, int i2) {
        int iQ = Q(parcel, i);
        if (iQ == i2) {
            return;
        }
        String hexString = Integer.toHexString(iQ);
        int length = String.valueOf(i2).length();
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + length + 19 + String.valueOf(iQ).length() + 4 + 1);
        sb.append("Expected size ");
        sb.append(i2);
        sb.append(" got ");
        sb.append(iQ);
        throw new com.gamericefishpro.space.w8.b(com.gamericefishpro.space.m5.a.j(sb, " (0x", hexString, ")"), parcel);
    }

    public static com.gamericefishpro.space.ri.e a(int i, int i2, com.gamericefishpro.space.ri.a aVar) {
        if ((i2 & 2) != 0) {
            aVar = com.gamericefishpro.space.ri.a.d;
        }
        if (i == -2) {
            if (aVar != com.gamericefishpro.space.ri.a.d) {
                return new com.gamericefishpro.space.ri.o(1, aVar);
            }
            com.gamericefishpro.space.ri.i.t.getClass();
            return new com.gamericefishpro.space.ri.e(com.gamericefishpro.space.ri.h.b);
        }
        if (i == -1) {
            if (aVar == com.gamericefishpro.space.ri.a.d) {
                return new com.gamericefishpro.space.ri.o(1, com.gamericefishpro.space.ri.a.e);
            }
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
        }
        if (i == 0) {
            return aVar == com.gamericefishpro.space.ri.a.d ? new com.gamericefishpro.space.ri.e(0) : new com.gamericefishpro.space.ri.o(1, aVar);
        }
        if (i != Integer.MAX_VALUE) {
            return aVar == com.gamericefishpro.space.ri.a.d ? new com.gamericefishpro.space.ri.e(i) : new com.gamericefishpro.space.ri.o(i, aVar);
        }
        return new com.gamericefishpro.space.ri.e(Integer.MAX_VALUE);
    }

    public static com.gamericefishpro.space.i9.n a0(com.gamericefishpro.space.i9.d dVar, com.gamericefishpro.space.u6.n nVar, ArrayList arrayList, boolean z) {
        com.gamericefishpro.space.i9.n nVarA;
        a4.L("reduce", arrayList, 1);
        a4.M("reduce", 2, arrayList);
        com.gamericefishpro.space.i9.n nVarC = ((com.gamericefishpro.space.i9.t) nVar.e).c(nVar, (com.gamericefishpro.space.i9.n) arrayList.get(0));
        if (!(nVarC instanceof com.gamericefishpro.space.i9.h)) {
            throw new IllegalArgumentException("Callback should be a method");
        }
        if (arrayList.size() == 2) {
            nVarA = ((com.gamericefishpro.space.i9.t) nVar.e).c(nVar, (com.gamericefishpro.space.i9.n) arrayList.get(1));
            if (nVarA instanceof com.gamericefishpro.space.i9.f) {
                throw new IllegalArgumentException("Failed to parse initial value");
            }
        } else {
            if (dVar.r() == 0) {
                throw new IllegalStateException("Empty array with no initial value error");
            }
            nVarA = null;
        }
        com.gamericefishpro.space.i9.h hVar = (com.gamericefishpro.space.i9.h) nVarC;
        int iR = dVar.r();
        int i = z ? 0 : iR - 1;
        int i2 = z ? iR - 1 : 0;
        int i3 = true == z ? 1 : -1;
        if (nVarA == null) {
            nVarA = dVar.s(i);
            i += i3;
        }
        while ((i2 - i) * i3 >= 0) {
            if (dVar.u(i)) {
                nVarA = hVar.a(nVar, Arrays.asList(nVarA, dVar.s(i), new g(Double.valueOf(i)), dVar));
                if (nVarA instanceof com.gamericefishpro.space.i9.f) {
                    throw new IllegalStateException("Reduce operation failed");
                }
                i += i3;
            } else {
                i += i3;
            }
        }
        return nVarA;
    }

    public static final void b(com.gamericefishpro.space.d7.g achievement, r rVar, int i) {
        com.gamericefishpro.space.h2.e eVar;
        long j;
        com.gamericefishpro.space.h2.e eVar2;
        com.gamericefishpro.space.h2.e eVar3;
        com.gamericefishpro.space.h1.j jVar;
        int i2;
        boolean z;
        r rVar2 = rVar;
        Intrinsics.checkNotNullParameter(achievement, "achievement");
        rVar2.b0(-104625971);
        if (((i | (rVar2.f(achievement) ? 4 : 2)) & 3) == 2 && rVar2.E()) {
            rVar2.V();
        } else {
            boolean z2 = achievement.d;
            com.gamericefishpro.space.o1.a0 a0VarC = z2 ? com.gamericefishpro.space.n9.a0.c(x.f(new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.l7.c.a), new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.s.c(com.gamericefishpro.space.l7.c.b, 0.8f))), 0.0f, 0.0f, 14) : com.gamericefishpro.space.n9.a0.c(x.f(new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.s.c(com.gamericefishpro.space.o1.o.c(4278197305L), 0.6f)), new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.s.c(com.gamericefishpro.space.o1.o.c(4278197305L), 0.4f))), 0.0f, 0.0f, 14);
            long jC = z2 ? com.gamericefishpro.space.o1.s.c(com.gamericefishpro.space.o1.s.c, 0.5f) : com.gamericefishpro.space.o1.s.c(com.gamericefishpro.space.o1.s.c, 0.15f);
            com.gamericefishpro.space.h1.j jVar2 = com.gamericefishpro.space.h1.j.a;
            float f = 20;
            float f2 = 1;
            m mVarG = com.gamericefishpro.space.y.q.g(com.gamericefishpro.space.y.q.d(com.gamericefishpro.space.l1.h.b(g1.b(jVar2, 1.0f), com.gamericefishpro.space.k0.e.a(f)), a0VarC, null, 6), f2, jC, com.gamericefishpro.space.k0.e.a(f));
            float f3 = 16;
            m mVarL = com.gamericefishpro.space.d0.j.l(mVarG, f3);
            d1 d1VarA = b1.a(com.gamericefishpro.space.d0.h.a, com.gamericefishpro.space.h1.b.D, rVar2, 48);
            int iHashCode = Long.hashCode(rVar2.T);
            l1 l1VarL = rVar2.l();
            m mVarF = h.F(mVarL, rVar2);
            com.gamericefishpro.space.h2.g.a.getClass();
            y yVar = com.gamericefishpro.space.h2.f.b;
            rVar2.d0();
            if (rVar2.S) {
                rVar2.k(yVar);
            } else {
                rVar2.n0();
            }
            com.gamericefishpro.space.h2.e eVar4 = com.gamericefishpro.space.h2.f.e;
            i.B(rVar2, d1VarA, eVar4);
            com.gamericefishpro.space.h2.e eVar5 = com.gamericefishpro.space.h2.f.d;
            i.B(rVar2, l1VarL, eVar5);
            Integer numValueOf = Integer.valueOf(iHashCode);
            com.gamericefishpro.space.h2.e eVar6 = com.gamericefishpro.space.h2.f.f;
            i.t(rVar2, numValueOf, eVar6);
            com.gamericefishpro.space.h2.d dVar = com.gamericefishpro.space.h2.f.g;
            i.x(rVar2, dVar);
            com.gamericefishpro.space.h2.e eVar7 = com.gamericefishpro.space.h2.f.c;
            i.B(rVar2, mVarF, eVar7);
            m mVarB = com.gamericefishpro.space.l1.h.b(g1.f(jVar2, 56), com.gamericefishpro.space.k0.e.a(f3));
            long j2 = com.gamericefishpro.space.o1.s.c;
            m mVarG2 = com.gamericefishpro.space.y.q.g(com.gamericefishpro.space.y.q.d(mVarB, com.gamericefishpro.space.n9.a0.e(x.f(new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.s.c(j2, 0.15f)), new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.s.c(j2, 0.05f))), 0.0f, 14), null, 6), f2, com.gamericefishpro.space.o1.s.c(j2, 0.2f), com.gamericefishpro.space.k0.e.a(f3));
            com.gamericefishpro.space.h1.e eVar8 = com.gamericefishpro.space.h1.b.w;
            l0 l0VarD = com.gamericefishpro.space.d0.r.d(eVar8, false);
            int iHashCode2 = Long.hashCode(rVar2.T);
            l1 l1VarL2 = rVar2.l();
            m mVarF2 = h.F(mVarG2, rVar2);
            rVar2.d0();
            if (rVar2.S) {
                rVar2.k(yVar);
            } else {
                rVar2.n0();
            }
            i.B(rVar2, l0VarD, eVar4);
            i.B(rVar2, l1VarL2, eVar5);
            com.gamericefishpro.space.m5.a.o(iHashCode2, rVar2, eVar6, rVar2, dVar);
            i.B(rVar2, mVarF2, eVar7);
            if (z2) {
                rVar2.a0(4396042);
                i2 = 0;
                eVar = eVar4;
                eVar2 = eVar5;
                eVar3 = eVar6;
                jVar = jVar2;
                j = j2;
                com.gamericefishpro.space.y.q.b(com.gamericefishpro.space.u6.f.I(R.drawable.golden_bonus_item, rVar2, 0), "Unlocked", g1.f(jVar2, 36), null, com.gamericefishpro.space.f2.h.b, 0.0f, rVar, 25016, 104);
                rVar2 = rVar;
                rVar2.p(false);
            } else {
                eVar = eVar4;
                j = j2;
                eVar2 = eVar5;
                eVar3 = eVar6;
                jVar = jVar2;
                rVar2.a0(4714660);
                com.gamericefishpro.space.q0.j.b(com.gamericefishpro.space.b9.a.t(), "Locked", g1.f(jVar, 28), com.gamericefishpro.space.o1.s.c(j, 0.4f), rVar2, 3504);
                i2 = 0;
                rVar2.p(false);
            }
            rVar2.p(true);
            com.gamericefishpro.space.d0.j.c(g1.g(jVar, f3), rVar2);
            m mVarA = e1.a();
            b0 b0VarA = z.a(com.gamericefishpro.space.d0.h.b, com.gamericefishpro.space.h1.b.F, rVar2, i2);
            int iHashCode3 = Long.hashCode(rVar2.T);
            l1 l1VarL3 = rVar2.l();
            m mVarF3 = h.F(mVarA, rVar2);
            rVar2.d0();
            if (rVar2.S) {
                rVar2.k(yVar);
            } else {
                rVar2.n0();
            }
            i.B(rVar2, b0VarA, eVar);
            i.B(rVar2, l1VarL3, eVar2);
            com.gamericefishpro.space.h2.e eVar9 = eVar3;
            com.gamericefishpro.space.m5.a.o(iHashCode3, rVar2, eVar9, rVar2, dVar);
            i.B(rVar2, mVarF3, eVar7);
            String str = achievement.b;
            long jC2 = z2 ? j : com.gamericefishpro.space.o1.s.c(j, 0.7f);
            com.gamericefishpro.space.h2.e eVar10 = eVar2;
            com.gamericefishpro.space.h1.j jVar3 = jVar;
            long j3 = j;
            com.gamericefishpro.space.h2.e eVar11 = eVar;
            r rVar3 = rVar2;
            r0.a(str, null, jC2, C(17), com.gamericefishpro.space.u2.k.y, 0L, null, 0L, 0, false, 0, 0, new i0(new com.gamericefishpro.space.o1.j0(com.gamericefishpro.space.o1.s.c(com.gamericefishpro.space.o1.s.b, 0.6f), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(2.0f)) & 4294967295L), 2.0f), 16769023), rVar3, 1597440, 12582912, 130986);
            com.gamericefishpro.space.d0.j.c(g1.d(jVar3, 4), rVar3);
            r0.a(achievement.c, null, com.gamericefishpro.space.o1.s.c(r45, z2 ? 0.9f : 0.5f), C(13), com.gamericefishpro.space.u2.k.v, 0L, null, C(18), 0, false, 0, 0, null, rVar, 1597440, 48, 260010);
            rVar2 = rVar;
            rVar2.p(true);
            rVar2.a0(-1438899985);
            if (z2) {
                com.gamericefishpro.space.d0.j.c(g1.g(jVar3, 8), rVar2);
                m mVarE = com.gamericefishpro.space.y.q.e(com.gamericefishpro.space.l1.h.b(g1.f(jVar3, 32), com.gamericefishpro.space.k0.e.a), com.gamericefishpro.space.o1.s.c(j3, 0.2f), com.gamericefishpro.space.o1.o.b);
                l0 l0VarD2 = com.gamericefishpro.space.d0.r.d(eVar8, false);
                int iHashCode4 = Long.hashCode(rVar2.T);
                l1 l1VarL4 = rVar2.l();
                m mVarF4 = h.F(mVarE, rVar2);
                rVar2.d0();
                if (rVar2.S) {
                    rVar2.k(yVar);
                } else {
                    rVar2.n0();
                }
                i.B(rVar2, l0VarD2, eVar11);
                i.B(rVar2, l1VarL4, eVar10);
                com.gamericefishpro.space.m5.a.o(iHashCode4, rVar2, eVar9, rVar2, dVar);
                i.B(rVar2, mVarF4, eVar7);
                z = true;
                r0.a("★", null, com.gamericefishpro.space.l7.c.e, C(18), null, 0L, null, 0L, 0, false, 0, 0, new i0(new com.gamericefishpro.space.o1.j0(com.gamericefishpro.space.o1.o.c(4287917824L), 4.0f, 2), 16769023), rVar, 24966, 12582912, 131050);
                rVar2 = rVar;
                rVar2.p(true);
            } else {
                z = true;
            }
            rVar2.p(false);
            rVar2.p(z);
        }
        p1 p1VarT = rVar2.t();
        if (p1VarT != null) {
            p1VarT.d = new n1(i, 6, achievement);
        }
    }

    public static void b0(Parcel parcel, int i, int i2) {
        if (i == i2) {
            return;
        }
        String hexString = Integer.toHexString(i);
        int length = String.valueOf(i2).length();
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + length + 19 + String.valueOf(i).length() + 4 + 1);
        sb.append("Expected size ");
        sb.append(i2);
        sb.append(" got ");
        sb.append(i);
        throw new com.gamericefishpro.space.w8.b(com.gamericefishpro.space.m5.a.j(sb, " (0x", hexString, ")"), parcel);
    }

    public static final void c(final float f, final long j, final long j2, final m mVar, r rVar, final int i) {
        rVar.b0(54572589);
        int i2 = i | (rVar.c(f) ? 4 : 2);
        if ((i & 48) == 0) {
            i2 |= rVar.e(j) ? 32 : 16;
        }
        if (((i2 | (rVar.f(mVar) ? 2048 : 1024)) & 1171) == 1170 && rVar.E()) {
            rVar.V();
        } else {
            m mVarD = g1.d(mVar, 16);
            com.gamericefishpro.space.k0.d dVar = com.gamericefishpro.space.k0.e.a;
            long j3 = com.gamericefishpro.space.o1.s.c;
            m mVarL = com.gamericefishpro.space.d0.j.l(com.gamericefishpro.space.y.q.g(com.gamericefishpro.space.y.q.e(com.gamericefishpro.space.l1.h.b(mVarD, dVar), j2, com.gamericefishpro.space.o1.o.b), (float) 1.5d, com.gamericefishpro.space.o1.s.c(j3, 0.3f), dVar), 3);
            l0 l0VarD = com.gamericefishpro.space.d0.r.d(com.gamericefishpro.space.h1.b.d, false);
            int iHashCode = Long.hashCode(rVar.T);
            l1 l1VarL = rVar.l();
            m mVarF = h.F(mVarL, rVar);
            com.gamericefishpro.space.h2.g.a.getClass();
            y yVar = com.gamericefishpro.space.h2.f.b;
            rVar.d0();
            if (rVar.S) {
                rVar.k(yVar);
            } else {
                rVar.n0();
            }
            i.B(rVar, l0VarD, com.gamericefishpro.space.h2.f.e);
            i.B(rVar, l1VarL, com.gamericefishpro.space.h2.f.d);
            i.t(rVar, Integer.valueOf(iHashCode), com.gamericefishpro.space.h2.f.f);
            i.x(rVar, com.gamericefishpro.space.h2.f.g);
            i.B(rVar, mVarF, com.gamericefishpro.space.h2.f.c);
            com.gamericefishpro.space.d0.r.a(com.gamericefishpro.space.l1.h.g(com.gamericefishpro.space.y.q.d(com.gamericefishpro.space.l1.h.b(g1.b(g1.b, f), dVar), com.gamericefishpro.space.n9.a0.c(x.f(new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.s.c(j, 0.6f)), new com.gamericefishpro.space.o1.s(j), new com.gamericefishpro.space.o1.s(j3)), 0.0f, 0.0f, 14), null, 6), 4, dVar, 0L, 0L, 28), rVar, 0);
            rVar.p(true);
        }
        p1 p1VarT = rVar.t();
        if (p1VarT != null) {
            p1VarT.d = new Function2() { // from class: com.gamericefishpro.space.n7.w
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    com.gamericefishpro.space.hj.c.c(f, j, j2, mVar, (com.gamericefishpro.space.t0.r) obj, com.gamericefishpro.space.t0.i.D(i | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static com.gamericefishpro.space.i9.d c0(com.gamericefishpro.space.i9.d dVar, com.gamericefishpro.space.u6.n nVar, com.gamericefishpro.space.i9.m mVar, Boolean bool, Boolean bool2) {
        com.gamericefishpro.space.i9.d dVar2 = new com.gamericefishpro.space.i9.d();
        Iterator itQ = dVar.q();
        while (itQ.hasNext()) {
            int iIntValue = ((Integer) itQ.next()).intValue();
            if (dVar.u(iIntValue)) {
                com.gamericefishpro.space.i9.n nVarA = mVar.a(nVar, Arrays.asList(dVar.s(iIntValue), new g(Double.valueOf(iIntValue)), dVar));
                if (nVarA.b().equals(bool)) {
                    break;
                }
                if (bool2 == null || nVarA.b().equals(bool2)) {
                    dVar2.t(iIntValue, nVarA);
                }
            }
        }
        return dVar2;
    }

    public static final void d(String label, f iconVector, long j, Function0 onClick, r rVar, int i) {
        int i2;
        r rVar2 = rVar;
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(iconVector, "iconVector");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        rVar2.b0(1336719695);
        if ((i & 6) == 0) {
            i2 = (rVar2.f(label) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | (rVar2.f(iconVector) ? 32 : 16);
        if ((i & 3072) == 0) {
            i3 |= rVar2.h(onClick) ? 2048 : 1024;
        }
        int i4 = i3;
        if ((i4 & 1171) == 1170 && rVar2.E()) {
            rVar2.V();
        } else {
            com.gamericefishpro.space.h1.j jVar = com.gamericefishpro.space.h1.j.a;
            m mVarB = g1.b(jVar, 1.0f);
            rVar2.a0(1434033256);
            Object objP = rVar2.P();
            if (objP == com.gamericefishpro.space.t0.n.a) {
                objP = y0.d(rVar2);
            }
            rVar2.p(false);
            m mVarI = com.gamericefishpro.space.y.q.i(mVarB, (com.gamericefishpro.space.b0.i) objP, false, onClick, 28);
            float f = 20;
            m mVarM = com.gamericefishpro.space.d0.j.m(mVarI, f, 14);
            d1 d1VarA = b1.a(com.gamericefishpro.space.d0.h.a, com.gamericefishpro.space.h1.b.D, rVar2, 48);
            int iHashCode = Long.hashCode(rVar2.T);
            l1 l1VarL = rVar2.l();
            m mVarF = h.F(mVarM, rVar2);
            com.gamericefishpro.space.h2.g.a.getClass();
            y yVar = com.gamericefishpro.space.h2.f.b;
            rVar2.d0();
            if (rVar2.S) {
                rVar2.k(yVar);
            } else {
                rVar2.n0();
            }
            com.gamericefishpro.space.h2.e eVar = com.gamericefishpro.space.h2.f.e;
            i.B(rVar2, d1VarA, eVar);
            com.gamericefishpro.space.h2.e eVar2 = com.gamericefishpro.space.h2.f.d;
            i.B(rVar2, l1VarL, eVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            com.gamericefishpro.space.h2.e eVar3 = com.gamericefishpro.space.h2.f.f;
            i.t(rVar2, numValueOf, eVar3);
            com.gamericefishpro.space.h2.d dVar = com.gamericefishpro.space.h2.f.g;
            i.x(rVar2, dVar);
            com.gamericefishpro.space.h2.e eVar4 = com.gamericefishpro.space.h2.f.c;
            i.B(rVar2, mVarF, eVar4);
            float f2 = 12;
            m mVarG = com.gamericefishpro.space.y.q.g(com.gamericefishpro.space.y.q.e(com.gamericefishpro.space.l1.h.b(g1.f(jVar, 40), com.gamericefishpro.space.k0.e.a(f2)), com.gamericefishpro.space.o1.s.c(j, 0.1f), com.gamericefishpro.space.o1.o.b), 1, com.gamericefishpro.space.o1.s.c(j, 0.2f), com.gamericefishpro.space.k0.e.a(f2));
            l0 l0VarD = com.gamericefishpro.space.d0.r.d(com.gamericefishpro.space.h1.b.w, false);
            int iHashCode2 = Long.hashCode(rVar2.T);
            l1 l1VarL2 = rVar2.l();
            m mVarF2 = h.F(mVarG, rVar2);
            rVar2.d0();
            if (rVar2.S) {
                rVar2.k(yVar);
            } else {
                rVar2.n0();
            }
            i.B(rVar2, l0VarD, eVar);
            i.B(rVar2, l1VarL2, eVar2);
            com.gamericefishpro.space.m5.a.o(iHashCode2, rVar2, eVar3, rVar2, dVar);
            i.B(rVar2, mVarF2, eVar4);
            com.gamericefishpro.space.q0.j.b(iconVector, label, g1.f(jVar, f), j, rVar2, ((i4 >> 3) & 14) | 384 | ((i4 << 3) & 112) | 3072);
            rVar2.p(true);
            com.gamericefishpro.space.d0.j.c(g1.g(jVar, 16), rVar2);
            r0.a(label, null, j, C(16), com.gamericefishpro.space.u2.k.w, 0L, null, 0L, 0, false, 0, 0, null, rVar, (i4 & 14) | 1597824, 0, 262058);
            rVar2 = rVar;
            rVar2.p(true);
        }
        p1 p1VarT = rVar2.t();
        if (p1VarT != null) {
            p1VarT.d = new com.gamericefishpro.space.q0.i(label, iconVector, j, onClick, i);
        }
    }

    public static final void e(Function0 onClick, r rVar, int i) {
        int i2;
        r rVar2 = rVar;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        rVar2.b0(70878485);
        if ((i & 6) == 0) {
            i2 = i | (rVar2.h(onClick) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && rVar2.E()) {
            rVar2.V();
        } else {
            rVar2.a0(-220952604);
            Object objP = rVar2.P();
            if (objP == com.gamericefishpro.space.t0.n.a) {
                objP = y0.d(rVar2);
            }
            com.gamericefishpro.space.b0.i iVar = (com.gamericefishpro.space.b0.i) objP;
            rVar2.p(false);
            s2 s2VarA = com.gamericefishpro.space.w.d.a(((Boolean) com.gamericefishpro.space.i.a.n(iVar, rVar2).getValue()).booleanValue() ? 6 : 0, com.gamericefishpro.space.w.c.o(100, 6, null), "button_press", rVar2, 432, 8);
            m mVarI = com.gamericefishpro.space.y.q.i(g1.d(g1.b(com.gamericefishpro.space.h1.j.a, 1.0f), 72), iVar, false, onClick, 28);
            l0 l0VarD = com.gamericefishpro.space.d0.r.d(com.gamericefishpro.space.h1.b.A, false);
            int iHashCode = Long.hashCode(rVar2.T);
            l1 l1VarL = rVar2.l();
            m mVarF = h.F(mVarI, rVar2);
            com.gamericefishpro.space.h2.g.a.getClass();
            y yVar = com.gamericefishpro.space.h2.f.b;
            rVar2.d0();
            if (rVar2.S) {
                rVar2.k(yVar);
            } else {
                rVar2.n0();
            }
            com.gamericefishpro.space.h2.e eVar = com.gamericefishpro.space.h2.f.e;
            i.B(rVar2, l0VarD, eVar);
            com.gamericefishpro.space.h2.e eVar2 = com.gamericefishpro.space.h2.f.d;
            i.B(rVar2, l1VarL, eVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            com.gamericefishpro.space.h2.e eVar3 = com.gamericefishpro.space.h2.f.f;
            i.t(rVar2, numValueOf, eVar3);
            com.gamericefishpro.space.h2.d dVar = com.gamericefishpro.space.h2.f.g;
            i.x(rVar2, dVar);
            com.gamericefishpro.space.h2.e eVar4 = com.gamericefishpro.space.h2.f.c;
            i.B(rVar2, mVarF, eVar4);
            h0 h0Var = g1.c;
            float f = 6;
            float f2 = 24;
            com.gamericefishpro.space.d0.r.a(com.gamericefishpro.space.y.q.e(com.gamericefishpro.space.d0.j.o(h0Var, 0.0f, f, 0.0f, 0.0f, 13), com.gamericefishpro.space.q7.d.b, com.gamericefishpro.space.k0.e.a(f2)), rVar2, 0);
            long j = com.gamericefishpro.space.o1.s.c;
            m mVarG = com.gamericefishpro.space.y.q.g(com.gamericefishpro.space.y.q.d(com.gamericefishpro.space.d0.j.i(com.gamericefishpro.space.d0.j.o(h0Var, 0.0f, 0.0f, 0.0f, f, 7), 0, ((com.gamericefishpro.space.c3.f) s2VarA.getValue()).d), com.gamericefishpro.space.n9.a0.e(x.f(new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.o.c(4294922834L)), new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.q7.d.a)), 0.0f, 14), com.gamericefishpro.space.k0.e.a(f2), 4), 1, com.gamericefishpro.space.o1.s.c(j, 0.5f), com.gamericefishpro.space.k0.e.a(f2));
            l0 l0VarD2 = com.gamericefishpro.space.d0.r.d(com.gamericefishpro.space.h1.b.w, false);
            int iHashCode2 = Long.hashCode(rVar2.T);
            l1 l1VarL2 = rVar2.l();
            m mVarF2 = h.F(mVarG, rVar2);
            rVar2.d0();
            if (rVar2.S) {
                rVar2.k(yVar);
            } else {
                rVar2.n0();
            }
            i.B(rVar2, l0VarD2, eVar);
            i.B(rVar2, l1VarL2, eVar2);
            com.gamericefishpro.space.m5.a.o(iHashCode2, rVar2, eVar3, rVar2, dVar);
            i.B(rVar2, mVarF2, eVar4);
            com.gamericefishpro.space.d0.r.a(com.gamericefishpro.space.y.q.d(com.gamericefishpro.space.l1.h.b(h0Var, com.gamericefishpro.space.k0.e.a(f2)), com.gamericefishpro.space.n9.a0.f(new Pair[]{new Pair(Float.valueOf(0.0f), new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.s.c(j, 0.3f))), new Pair(Float.valueOf(0.4f), new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.s.f))}), null, 6), rVar2, 0);
            r0.a("NEXT LEVEL", null, j, C(24), com.gamericefishpro.space.u2.k.y, C(1), null, 0L, 0, false, 0, 0, new i0(new com.gamericefishpro.space.o1.j0(com.gamericefishpro.space.o1.s.c(com.gamericefishpro.space.o1.s.b, 0.5f), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(4.0f)) & 4294967295L), 4.0f), 16769023), rVar, 102261126, 12582912, 130730);
            rVar2 = rVar;
            rVar2.p(true);
            rVar2.p(true);
        }
        p1 p1VarT = rVar2.t();
        if (p1VarT != null) {
            p1VarT.d = new com.gamericefishpro.space.k7.g(onClick, i, 4);
        }
    }

    public static final void f(Function0 onClick, r rVar, int i) {
        int i2;
        r rVar2 = rVar;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        rVar2.b0(-703376335);
        if ((i & 6) == 0) {
            i2 = i | (rVar2.h(onClick) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && rVar2.E()) {
            rVar2.V();
        } else {
            rVar2.a0(738294349);
            Object objP = rVar2.P();
            if (objP == com.gamericefishpro.space.t0.n.a) {
                objP = y0.d(rVar2);
            }
            com.gamericefishpro.space.b0.i iVar = (com.gamericefishpro.space.b0.i) objP;
            rVar2.p(false);
            s2 s2VarA = com.gamericefishpro.space.w.d.a(((Boolean) com.gamericefishpro.space.i.a.n(iVar, rVar2).getValue()).booleanValue() ? 6 : 0, com.gamericefishpro.space.w.c.o(100, 6, null), "button_press", rVar2, 432, 8);
            m mVarI = com.gamericefishpro.space.y.q.i(g1.d(g1.b(com.gamericefishpro.space.h1.j.a, 1.0f), 72), iVar, false, onClick, 28);
            l0 l0VarD = com.gamericefishpro.space.d0.r.d(com.gamericefishpro.space.h1.b.A, false);
            int iHashCode = Long.hashCode(rVar2.T);
            l1 l1VarL = rVar2.l();
            m mVarF = h.F(mVarI, rVar2);
            com.gamericefishpro.space.h2.g.a.getClass();
            y yVar = com.gamericefishpro.space.h2.f.b;
            rVar2.d0();
            if (rVar2.S) {
                rVar2.k(yVar);
            } else {
                rVar2.n0();
            }
            com.gamericefishpro.space.h2.e eVar = com.gamericefishpro.space.h2.f.e;
            i.B(rVar2, l0VarD, eVar);
            com.gamericefishpro.space.h2.e eVar2 = com.gamericefishpro.space.h2.f.d;
            i.B(rVar2, l1VarL, eVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            com.gamericefishpro.space.h2.e eVar3 = com.gamericefishpro.space.h2.f.f;
            i.t(rVar2, numValueOf, eVar3);
            com.gamericefishpro.space.h2.d dVar = com.gamericefishpro.space.h2.f.g;
            i.x(rVar2, dVar);
            com.gamericefishpro.space.h2.e eVar4 = com.gamericefishpro.space.h2.f.c;
            i.B(rVar2, mVarF, eVar4);
            h0 h0Var = g1.c;
            float f = 6;
            float f2 = 24;
            com.gamericefishpro.space.d0.r.a(com.gamericefishpro.space.y.q.e(com.gamericefishpro.space.d0.j.o(h0Var, 0.0f, f, 0.0f, 0.0f, 13), com.gamericefishpro.space.m7.a.b, com.gamericefishpro.space.k0.e.a(f2)), rVar2, 0);
            long j = com.gamericefishpro.space.o1.s.c;
            m mVarG = com.gamericefishpro.space.y.q.g(com.gamericefishpro.space.y.q.d(com.gamericefishpro.space.d0.j.i(com.gamericefishpro.space.d0.j.o(h0Var, 0.0f, 0.0f, 0.0f, f, 7), 0, ((com.gamericefishpro.space.c3.f) s2VarA.getValue()).d), com.gamericefishpro.space.n9.a0.e(x.f(new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.o.c(4294922834L)), new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.m7.a.a)), 0.0f, 14), com.gamericefishpro.space.k0.e.a(f2), 4), 1, com.gamericefishpro.space.o1.s.c(j, 0.5f), com.gamericefishpro.space.k0.e.a(f2));
            l0 l0VarD2 = com.gamericefishpro.space.d0.r.d(com.gamericefishpro.space.h1.b.w, false);
            int iHashCode2 = Long.hashCode(rVar2.T);
            l1 l1VarL2 = rVar2.l();
            m mVarF2 = h.F(mVarG, rVar2);
            rVar2.d0();
            if (rVar2.S) {
                rVar2.k(yVar);
            } else {
                rVar2.n0();
            }
            i.B(rVar2, l0VarD2, eVar);
            i.B(rVar2, l1VarL2, eVar2);
            com.gamericefishpro.space.m5.a.o(iHashCode2, rVar2, eVar3, rVar2, dVar);
            i.B(rVar2, mVarF2, eVar4);
            com.gamericefishpro.space.d0.r.a(com.gamericefishpro.space.y.q.d(com.gamericefishpro.space.l1.h.b(h0Var, com.gamericefishpro.space.k0.e.a(f2)), com.gamericefishpro.space.n9.a0.f(new Pair[]{new Pair(Float.valueOf(0.0f), new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.s.c(j, 0.3f))), new Pair(Float.valueOf(0.4f), new com.gamericefishpro.space.o1.s(com.gamericefishpro.space.o1.s.f))}), null, 6), rVar2, 0);
            r0.a("TRY AGAIN", null, j, C(22), com.gamericefishpro.space.u2.k.y, C(1), null, 0L, 0, false, 0, 0, new i0(new com.gamericefishpro.space.o1.j0(com.gamericefishpro.space.o1.s.c(com.gamericefishpro.space.o1.s.b, 0.5f), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(4.0f)) & 4294967295L), 4.0f), 16769023), rVar, 102261126, 12582912, 130730);
            rVar2 = rVar;
            rVar2.p(true);
            rVar2.p(true);
        }
        p1 p1VarT = rVar2.t();
        if (p1VarT != null) {
            p1VarT.d = new com.gamericefishpro.space.k7.g(onClick, i, 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:173:0x0291  */
    /* JADX WARN: Code duplicated, block: B:197:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:211:0x030c  */
    /* JADX WARN: Code duplicated, block: B:214:0x0327  */
    /* JADX WARN: Code duplicated, block: B:226:0x0352  */
    /* JADX WARN: Code duplicated, block: B:228:0x0367  */
    public static final void g(final m mVar, w wVar, final w0 w0Var, final com.gamericefishpro.space.z.k kVar, final boolean z, final com.gamericefishpro.space.y.l lVar, final com.gamericefishpro.space.h1.c cVar, final com.gamericefishpro.space.d0.g gVar, final Function1 function1, r rVar, final int i, final int i2) {
        int i3;
        int i4;
        w wVar2;
        boolean z2;
        Object obj;
        boolean z3;
        boolean z4;
        boolean zF;
        Object oVar;
        w wVar3;
        boolean z5;
        com.gamericefishpro.space.ei.q qVar;
        v0 v0Var;
        m mVarM;
        boolean zD;
        Object objP;
        rVar.b0(924924659);
        if ((i & 6) == 0) {
            i3 = (rVar.f(mVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= rVar.f(wVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= rVar.f(w0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= rVar.g(false) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= rVar.g(true) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= rVar.f(kVar) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= rVar.g(z) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= rVar.f(lVar) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= rVar.f(cVar) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (rVar.f(gVar) ? 4 : 2);
        } else {
            i4 = i2;
        }
        int i5 = i4 | 432;
        if ((i2 & 3072) == 0) {
            i5 |= rVar.h(function1) ? 2048 : 1024;
        }
        if (rVar.S(i3 & 1, ((i3 & 306783379) == 306783378 && (i5 & 1171) == 1170) ? false : true)) {
            rVar.X();
            if ((i & 1) != 0 && !rVar.B()) {
                rVar.V();
            }
            int i6 = i3 & (-234881025);
            rVar.q();
            int i7 = i6 >> 3;
            int i8 = i7 & 14;
            int i9 = i8 | ((i5 >> 6) & 112);
            com.gamericefishpro.space.t0.v0 v0VarZ = i.z(function1, rVar);
            boolean z6 = (((i9 & 14) ^ 6) > 4 && rVar.f(wVar)) || (i9 & 6) == 4;
            Object objP2 = rVar.P();
            Object obj2 = com.gamericefishpro.space.t0.n.a;
            if (z6 || objP2 == obj2) {
                com.gamericefishpro.space.f0.c cVar2 = new com.gamericefishpro.space.f0.c();
                cVar2.a = new c1(Integer.MAX_VALUE);
                cVar2.b = new c1(Integer.MAX_VALUE);
                com.gamericefishpro.space.f0.k kVar2 = new com.gamericefishpro.space.f0.k(v0VarZ, 0);
                com.gamericefishpro.space.t0.f fVar = com.gamericefishpro.space.t0.f.w;
                com.gamericefishpro.space.a8.c cVar3 = n2.a;
                objP2 = new com.gamericefishpro.space.f0.l(0, 0, s2.class, new d0(new com.gamericefishpro.space.b1.b(new d0(kVar2, fVar), wVar, cVar2, 1), fVar), "value", "getValue()Ljava/lang/Object;");
                rVar.k0(objP2);
            }
            com.gamericefishpro.space.ei.q qVar2 = (com.gamericefishpro.space.ei.q) objP2;
            int i10 = i6 >> 9;
            int i11 = (i10 & 112) | i8;
            boolean z7 = ((((i11 & 112) ^ 48) > 32 && rVar.g(true)) || (i11 & 48) == 32) | ((((i11 & 14) ^ 6) > 4 && rVar.f(wVar)) || (i11 & 6) == 4);
            Object objP3 = rVar.P();
            if (z7 || objP3 == obj2) {
                objP3 = new com.gamericefishpro.space.f0.d(wVar);
                rVar.k0(objP3);
            }
            p0 p0Var = (p0) objP3;
            Object objP4 = rVar.P();
            if (objP4 == obj2) {
                objP4 = i.n(kotlin.coroutines.g.d, rVar);
                rVar.k0(objP4);
            }
            com.gamericefishpro.space.pi.x xVar = (com.gamericefishpro.space.pi.x) objP4;
            com.gamericefishpro.space.o1.v vVar = (com.gamericefishpro.space.o1.v) rVar.j(com.gamericefishpro.space.i2.b1.g);
            com.gamericefishpro.space.h0.f0 f0Var = !((Boolean) rVar.j(com.gamericefishpro.space.i2.b1.v)).booleanValue() ? com.gamericefishpro.space.h0.e1.a : null;
            int i12 = i5 << 18;
            int i13 = (i6 & 65520) | (i10 & 3670016) | (i12 & 29360128) | (i12 & 234881024) | ((i5 << 27) & 1879048192);
            boolean z8 = ((((i13 & 896) ^ 384) > 256 && rVar.f(w0Var)) || (i13 & 384) == 256) | ((((i13 & 112) ^ 48) > 32 && rVar.f(wVar)) || (i13 & 48) == 32) | ((((i13 & 7168) ^ 3072) > 2048 && rVar.g(false)) || (i13 & 3072) == 2048);
            if (((57344 & i13) ^ 24576) > 16384 && rVar.g(true)) {
                z2 = true;
            } else if ((i13 & 24576) == 16384) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean zD2 = z8 | z2 | rVar.d(0) | ((((i13 & 3670016) ^ 1572864) > 1048576 && rVar.f(cVar)) || (i13 & 1572864) == 1048576);
            if (((i13 & 29360128) ^ 12582912) > 8388608) {
                obj = null;
                if (rVar.f(null)) {
                    z3 = true;
                }
                boolean z9 = zD2 | z3;
                if (((i13 & 234881024) ^ 100663296) > 67108864 || !rVar.f(obj)) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                zF = z4 | z9 | ((((i13 & 1879048192) ^ 805306368) <= 536870912 && rVar.f(gVar)) || (i13 & 805306368) == 536870912) | rVar.f(vVar) | rVar.f(f0Var);
                Object objP5 = rVar.P();
                if (!zF || objP5 == obj2) {
                    wVar3 = wVar;
                    z5 = true;
                    oVar = new com.gamericefishpro.space.f0.o(wVar3, w0Var, qVar2, gVar, xVar, vVar, f0Var, cVar);
                    qVar = qVar2;
                    rVar.k0(oVar);
                } else {
                    oVar = objP5;
                    qVar = qVar2;
                    z5 = true;
                    wVar3 = wVar;
                }
                com.gamericefishpro.space.f0.o oVar2 = (com.gamericefishpro.space.f0.o) oVar;
                v0Var = v0.d;
                if (z) {
                    rVar.a0(-2077147368);
                    zD = (((((i7 & 14) ^ 6) > 4 || !rVar.f(wVar3)) && (i7 & 6) != 4) ? false : z5) | rVar.d(0);
                    objP = rVar.P();
                    if (zD || objP == obj2) {
                        objP = new com.gamericefishpro.space.f0.e(wVar3);
                        rVar.k0(objP);
                    }
                    mVarM = com.gamericefishpro.space.h0.n.m((com.gamericefishpro.space.f0.e) objP, wVar3.o, v0Var);
                    rVar.p(false);
                } else {
                    rVar.a0(-2076718545);
                    rVar.p(false);
                    mVarM = com.gamericefishpro.space.h1.j.a;
                }
                wVar2 = wVar3;
                com.gamericefishpro.space.h0.n.a(qVar, com.gamericefishpro.space.y.q.l(com.gamericefishpro.space.h0.n.n(mVar.c(wVar3.l).c(wVar3.m), qVar, p0Var, v0Var, z).c(mVarM).c(wVar3.n.i), wVar3, v0Var, lVar, z, kVar, wVar3.g), wVar2.p, oVar2, rVar, 0);
            } else {
                obj = null;
            }
            z3 = false;
            boolean z10 = zD2 | z3;
            if (((i13 & 234881024) ^ 100663296) > 67108864) {
                z4 = false;
            } else {
                z4 = false;
            }
            zF = z4 | z10 | ((((i13 & 1879048192) ^ 805306368) <= 536870912 && rVar.f(gVar)) || (i13 & 805306368) == 536870912) | rVar.f(vVar) | rVar.f(f0Var);
            Object objP6 = rVar.P();
            if (zF) {
                wVar3 = wVar;
                z5 = true;
                oVar = new com.gamericefishpro.space.f0.o(wVar3, w0Var, qVar2, gVar, xVar, vVar, f0Var, cVar);
                qVar = qVar2;
                rVar.k0(oVar);
            } else {
                wVar3 = wVar;
                z5 = true;
                oVar = new com.gamericefishpro.space.f0.o(wVar3, w0Var, qVar2, gVar, xVar, vVar, f0Var, cVar);
                qVar = qVar2;
                rVar.k0(oVar);
            }
            com.gamericefishpro.space.f0.o oVar3 = (com.gamericefishpro.space.f0.o) oVar;
            v0Var = v0.d;
            if (z) {
                rVar.a0(-2077147368);
                zD = (((((i7 & 14) ^ 6) > 4 || !rVar.f(wVar3)) && (i7 & 6) != 4) ? false : z5) | rVar.d(0);
                objP = rVar.P();
                if (zD) {
                    objP = new com.gamericefishpro.space.f0.e(wVar3);
                    rVar.k0(objP);
                } else {
                    objP = new com.gamericefishpro.space.f0.e(wVar3);
                    rVar.k0(objP);
                }
                mVarM = com.gamericefishpro.space.h0.n.m((com.gamericefishpro.space.f0.e) objP, wVar3.o, v0Var);
                rVar.p(false);
            } else {
                rVar.a0(-2076718545);
                rVar.p(false);
                mVarM = com.gamericefishpro.space.h1.j.a;
            }
            wVar2 = wVar3;
            com.gamericefishpro.space.h0.n.a(qVar, com.gamericefishpro.space.y.q.l(com.gamericefishpro.space.h0.n.n(mVar.c(wVar3.l).c(wVar3.m), qVar, p0Var, v0Var, z).c(mVarM).c(wVar3.n.i), wVar3, v0Var, lVar, z, kVar, wVar3.g), wVar2.p, oVar3, rVar, 0);
        } else {
            wVar2 = wVar;
            rVar.V();
        }
        p1 p1VarT = rVar.t();
        if (p1VarT != null) {
            final w wVar4 = wVar2;
            p1VarT.d = new Function2() { // from class: com.gamericefishpro.space.f0.m
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    com.gamericefishpro.space.hj.c.g(mVar, wVar4, w0Var, kVar, z, lVar, cVar, gVar, function1, (com.gamericefishpro.space.t0.r) obj3, com.gamericefishpro.space.t0.i.D(i | 1), com.gamericefishpro.space.t0.i.D(i2));
                    return Unit.a;
                }
            };
        }
    }

    public static final void h(com.gamericefishpro.space.vb.c cVar, com.gamericefishpro.space.y1.b bVar, v0 v0Var, com.gamericefishpro.space.y1.a aVar, n0 n0Var, long j) {
        float fIntBitsToFloat;
        ArrayList arrayList = n0Var.b;
        long j2 = bVar.c;
        boolean z = bVar.d;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j2 >> 32));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (bVar.c & 4294967295L));
        boolean z2 = bVar.h;
        if (!z2 && z) {
            n0Var.a = 0;
            arrayList.clear();
        }
        if (!i(bVar) && (z2 || !z)) {
            if (arrayList.size() == 3) {
                int i = n0Var.a;
                n0Var.a = i + 1;
                arrayList.set(i, bVar);
            } else {
                arrayList.add(bVar);
            }
            if (n0Var.a == 3) {
                n0Var.a = 0;
            }
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList2.add(Float.valueOf(Float.intBitsToFloat((int) (((com.gamericefishpro.space.y1.b) arrayList.get(i2)).c >> 32))));
            }
            fIntBitsToFloat2 = (float) CollectionsKt.s(arrayList2);
            ArrayList arrayList3 = new ArrayList(arrayList.size());
            int size2 = arrayList.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList3.add(Float.valueOf(Float.intBitsToFloat((int) (((com.gamericefishpro.space.y1.b) arrayList.get(i3)).c & 4294967295L))));
            }
            fIntBitsToFloat3 = (float) CollectionsKt.s(arrayList3);
        }
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) & 4294967295L);
        if (v0Var != null) {
            int i4 = aVar.a;
            if (i4 == 1) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
            } else if (i4 == 2) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
            }
            jFloatToRawIntBits = v0Var == v0.e ? (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L) : (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L);
        }
        ((com.gamericefishpro.space.c2.b) cVar.e).a(bVar.b, com.gamericefishpro.space.n1.b.e(jFloatToRawIntBits, j));
    }

    public static final boolean i(com.gamericefishpro.space.y1.b bVar) {
        return bVar.h && !bVar.d;
    }

    public static final com.gamericefishpro.space.p4.d j(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new com.gamericefishpro.space.p4.d(name);
    }

    public static final boolean k(ArrayList arrayList) {
        List list;
        long j;
        if (arrayList.size() >= 2) {
            if (arrayList.size() <= 1) {
                list = g0.d;
            } else {
                ArrayList arrayList2 = new ArrayList();
                Object obj = arrayList.get(0);
                int iE = x.e(arrayList);
                int i = 0;
                while (i < iE) {
                    i++;
                    Object obj2 = arrayList.get(i);
                    com.gamericefishpro.space.o2.o oVar = (com.gamericefishpro.space.o2.o) obj2;
                    com.gamericefishpro.space.o2.o oVar2 = (com.gamericefishpro.space.o2.o) obj;
                    arrayList2.add(new com.gamericefishpro.space.n1.b((((long) Float.floatToRawIntBits(Math.abs(Float.intBitsToFloat((int) (oVar2.g().a() >> 32)) - Float.intBitsToFloat((int) (oVar.g().a() >> 32))))) << 32) | (((long) Float.floatToRawIntBits(Math.abs(Float.intBitsToFloat((int) (oVar2.g().a() & 4294967295L)) - Float.intBitsToFloat((int) (oVar.g().a() & 4294967295L))))) & 4294967295L)));
                    obj = obj2;
                }
                list = arrayList2;
            }
            if (list.size() == 1) {
                j = ((com.gamericefishpro.space.n1.b) CollectionsKt.w(list)).a;
            } else {
                if (list.isEmpty()) {
                    com.gamericefishpro.space.e3.a.b("Empty collection can't be reduced.");
                }
                Object objW = CollectionsKt.w(list);
                int iE2 = x.e(list);
                if (1 <= iE2) {
                    int i2 = 1;
                    while (true) {
                        objW = new com.gamericefishpro.space.n1.b(com.gamericefishpro.space.n1.b.e(((com.gamericefishpro.space.n1.b) objW).a, ((com.gamericefishpro.space.n1.b) list.get(i2)).a));
                        if (i2 == iE2) {
                            break;
                        }
                        i2++;
                    }
                }
                j = ((com.gamericefishpro.space.n1.b) objW).a;
            }
            if (Float.intBitsToFloat((int) (4294967295L & j)) >= Float.intBitsToFloat((int) (j >> 32))) {
                return false;
            }
        }
        return true;
    }

    public static void l(int i, Object[] objArr) {
        for (int i2 = 0; i2 < i; i2++) {
            if (objArr[i2] == null) {
                StringBuilder sb = new StringBuilder(20);
                sb.append("at index ");
                sb.append(i2);
                throw new NullPointerException(sb.toString());
            }
        }
    }

    public static void m(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static Bundle n(Parcel parcel, int i) {
        int iQ = Q(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iQ == 0) {
            return null;
        }
        Bundle bundle = parcel.readBundle();
        parcel.setDataPosition(iDataPosition + iQ);
        return bundle;
    }

    public static final com.gamericefishpro.space.si.y o(t db, String[] tableNames, Function1 block) {
        Intrinsics.checkNotNullParameter(db, "db");
        Intrinsics.checkNotNullParameter(tableNames, "tableNames");
        Intrinsics.checkNotNullParameter(block, "block");
        com.gamericefishpro.space.s5.g gVarI = db.i();
        String[] names = (String[]) Arrays.copyOf(tableNames, tableNames.length);
        Intrinsics.checkNotNullParameter(names, "tables");
        com.gamericefishpro.space.s5.k0 k0Var = gVarI.b;
        k0Var.getClass();
        Intrinsics.checkNotNullParameter(names, "names");
        com.gamericefishpro.space.qh.m mVar = new com.gamericefishpro.space.qh.m();
        for (String str : names) {
            HashMap map = k0Var.c;
            String lowerCase = str.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            Set set = (Set) map.get(lowerCase);
            if (set != null) {
                mVar.addAll(set);
            } else {
                mVar.add(str);
            }
        }
        String[] strArr = (String[]) q0.a(mVar).toArray(new String[0]);
        int length = strArr.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            String str2 = strArr[i];
            LinkedHashMap linkedHashMap = k0Var.f;
            String lowerCase2 = str2.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
            Integer num = (Integer) linkedHashMap.get(lowerCase2);
            if (num == null) {
                throw new IllegalArgumentException("There is no table with name ".concat(str2));
            }
            iArr[i] = num.intValue();
        }
        Pair pair = new Pair(strArr, iArr);
        String[] resolvedTableNames = (String[]) pair.d;
        int[] tableIds = (int[]) pair.e;
        Intrinsics.checkNotNullParameter(resolvedTableNames, "resolvedTableNames");
        Intrinsics.checkNotNullParameter(tableIds, "tableIds");
        return new com.gamericefishpro.space.si.y(com.gamericefishpro.space.si.e0.e(new com.gamericefishpro.space.l4.p(new com.gamericefishpro.space.g5.y(k0Var, tableIds, resolvedTableNames, null, 2)), -1), db, block);
    }

    public static Parcelable p(Parcel parcel, int i, Parcelable.Creator creator) {
        int iQ = Q(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iQ == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(iDataPosition + iQ);
        return parcelable;
    }

    public static String q(Parcel parcel, int i) {
        int iQ = Q(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iQ == 0) {
            return null;
        }
        String string = parcel.readString();
        parcel.setDataPosition(iDataPosition + iQ);
        return string;
    }

    public static Object[] r(Parcel parcel, int i, Parcelable.Creator creator) {
        int iQ = Q(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iQ == 0) {
            return null;
        }
        Object[] objArrCreateTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(iDataPosition + iQ);
        return objArrCreateTypedArray;
    }

    public static ArrayList s(Parcel parcel, int i, Parcelable.Creator creator) {
        int iQ = Q(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iQ == 0) {
            return null;
        }
        ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(iDataPosition + iQ);
        return arrayListCreateTypedArrayList;
    }

    public static final void t(com.gamericefishpro.space.c6.a connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        com.gamericefishpro.space.qh.d dVarB = com.gamericefishpro.space.ph.w.b();
        com.gamericefishpro.space.c6.c cVarO = connection.O("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (cVarO.H()) {
            try {
                dVarB.add(cVarO.g(0));
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    y3.r(cVarO, th);
                    throw th2;
                }
            }
        }
        Unit unit = Unit.a;
        y3.r(cVarO, null);
        ListIterator listIterator = com.gamericefishpro.space.ph.w.a(dVarB).listIterator(0);
        while (true) {
            com.gamericefishpro.space.f1.a0 a0Var = (com.gamericefishpro.space.f1.a0) listIterator;
            if (!a0Var.hasNext()) {
                return;
            }
            String str = (String) a0Var.next();
            if (kotlin.text.d.j(str, "room_fts_content_sync_")) {
                com.gamericefishpro.space.i.a.r(connection, "DROP TRIGGER IF EXISTS ".concat(str));
            }
        }
    }

    public static void u(Parcel parcel, int i) {
        if (parcel.dataPosition() == i) {
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 26);
        sb.append("Overread allowed size end=");
        sb.append(i);
        throw new com.gamericefishpro.space.w8.b(sb.toString(), parcel);
    }

    public static ColorStateList v(Context context, TypedArray typedArray, int i) {
        int resourceId;
        ColorStateList colorStateListC;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListC = com.gamericefishpro.space.s3.a.c(context, resourceId)) == null) ? typedArray.getColorStateList(i) : colorStateListC;
    }

    public static ColorStateList w(Context context, com.gamericefishpro.space.a8.c cVar, int i) {
        int resourceId;
        ColorStateList colorStateListC;
        TypedArray typedArray = (TypedArray) cVar.i;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListC = com.gamericefishpro.space.s3.a.c(context, resourceId)) == null) ? cVar.k(i) : colorStateListC;
    }

    public static final CoroutineContext x(t tVar, boolean z, com.gamericefishpro.space.vh.c cVar) {
        if (!tVar.o()) {
            com.gamericefishpro.space.ui.c cVar2 = tVar.a;
            if (cVar2 != null) {
                return cVar2.d;
            }
            Intrinsics.h("coroutineScope");
            throw null;
        }
        if (cVar.getContext().j(com.gamericefishpro.space.s5.x.d) != null) {
            throw new ClassCastException();
        }
        if (z) {
            CoroutineContext coroutineContext = tVar.b;
            if (coroutineContext != null) {
                return coroutineContext;
            }
            Intrinsics.h("transactionContext");
            throw null;
        }
        com.gamericefishpro.space.ui.c cVar3 = tVar.a;
        if (cVar3 != null) {
            return cVar3.d;
        }
        Intrinsics.h("coroutineScope");
        throw null;
    }

    public static Drawable y(Context context, TypedArray typedArray, int i) {
        int resourceId;
        Drawable drawableX;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (drawableX = com.gamericefishpro.space.u6.f.x(context, resourceId)) == null) ? typedArray.getDrawable(i) : drawableX;
    }

    public static final float z(Layout layout, int i, Paint paint) {
        float fAbs;
        float width;
        float lineLeft = layout.getLineLeft(i);
        ThreadLocal threadLocal = j.a;
        if (layout.getEllipsisCount(i) <= 0 || layout.getParagraphDirection(i) != 1 || lineLeft >= 0.0f) {
            return 0.0f;
        }
        float fMeasureText = paint.measureText("…") + (layout.getPrimaryHorizontal(layout.getEllipsisStart(i) + layout.getLineStart(i)) - lineLeft);
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i);
        if ((paragraphAlignment == null ? -1 : com.gamericefishpro.space.t2.d.a[paragraphAlignment.ordinal()]) == 1) {
            fAbs = Math.abs(lineLeft);
            width = (layout.getWidth() - fMeasureText) / 2.0f;
        } else {
            fAbs = Math.abs(lineLeft);
            width = layout.getWidth() - fMeasureText;
        }
        return width + fAbs;
    }
}
