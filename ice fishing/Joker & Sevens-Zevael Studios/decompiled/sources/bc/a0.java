package bc;

import ac.o;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.database.Cursor;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Log;
import android.util.LongSparseArray;
import android.util.Size;
import android.util.SizeF;
import android.view.DragEvent;
import android.view.KeyEvent;
import android.view.View;
import android.view.translation.TranslationResponseValue;
import android.view.translation.ViewTranslationResponse;
import android.widget.EdgeEffect;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b0.l0;
import bc.a0;
import java.io.Closeable;
import java.io.IOException;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import m0.d1;
import m0.r;
import m0.x1;
import m0.z;
import org.fortheloss.st.R;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class a0 {

    /* renamed from: a, reason: collision with root package name */
    public static Thread f1046a;

    public static void A(String str) {
        if (Log.isLoggable("InstallReferrerClient", 5)) {
            Log.w("InstallReferrerClient", str);
        }
    }

    public static int B(int i10) {
        if (i10 < 0) {
            return i10;
        }
        if (i10 < 3) {
            return i10 + 1;
        }
        if (i10 < 1073741824) {
            return (int) ((i10 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static Map C(ac.i iVar) {
        pc.j.e(iVar, "pair");
        Map singletonMap = Collections.singletonMap(iVar.f270g, iVar.f271h);
        pc.j.d(singletonMap, "singletonMap(...)");
        return singletonMap;
    }

    public static float D(EdgeEffect edgeEffect, float f10, float f11) {
        if (Build.VERSION.SDK_INT >= 31) {
            return l3.d.c(edgeEffect, f10, f11);
        }
        l3.c.a(edgeEffect, f10, f11);
        return f10;
    }

    public static final long E(long j3, float f10) {
        long floatToRawIntBits = j3 | (Float.floatToRawIntBits(f10) & 4294967295L);
        s2.o[] oVarArr = s2.n.f6400b;
        return floatToRawIntBits;
    }

    public static r3.b F(MappedByteBuffer mappedByteBuffer) {
        long j3;
        ByteBuffer duplicate = mappedByteBuffer.duplicate();
        duplicate.order(ByteOrder.BIG_ENDIAN);
        duplicate.position(duplicate.position() + 4);
        int i10 = duplicate.getShort() & 65535;
        if (i10 > 100) {
            throw new IOException("Cannot read metadata.");
        }
        duplicate.position(duplicate.position() + 6);
        int i11 = 0;
        while (true) {
            if (i11 >= i10) {
                j3 = -1;
                break;
            }
            int i12 = duplicate.getInt();
            duplicate.position(duplicate.position() + 4);
            j3 = duplicate.getInt() & 4294967295L;
            duplicate.position(duplicate.position() + 4);
            if (1835365473 == i12) {
                break;
            }
            i11++;
        }
        if (j3 != -1) {
            duplicate.position(duplicate.position() + ((int) (j3 - duplicate.position())));
            duplicate.position(duplicate.position() + 12);
            long j6 = duplicate.getInt() & 4294967295L;
            for (int i13 = 0; i13 < j6; i13++) {
                int i14 = duplicate.getInt();
                long j10 = duplicate.getInt() & 4294967295L;
                duplicate.getInt();
                if (1164798569 == i14 || 1701669481 == i14) {
                    duplicate.position((int) (j10 + j3));
                    r3.b bVar = new r3.b();
                    duplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int position = duplicate.position() + duplicate.getInt(duplicate.position());
                    bVar.f1313j = duplicate;
                    bVar.f1310g = position;
                    int i15 = position - duplicate.getInt(position);
                    bVar.f1311h = i15;
                    bVar.f1312i = ((ByteBuffer) bVar.f1313j).getShort(i15);
                    return bVar;
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    public static final List G(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("id");
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        cc.c cVar = new cc.c(10);
        while (cursor.moveToNext()) {
            int i10 = cursor.getInt(columnIndex);
            int i11 = cursor.getInt(columnIndex2);
            String string = cursor.getString(columnIndex3);
            pc.j.d(string, "cursor.getString(fromColumnIndex)");
            String string2 = cursor.getString(columnIndex4);
            pc.j.d(string2, "cursor.getString(toColumnIndex)");
            cVar.add(new d4.c(i10, i11, string, string2));
        }
        cc.c n7 = i7.b.n(cVar);
        pc.j.e(n7, "<this>");
        if (n7.a() <= 1) {
            return m.e0(n7);
        }
        Object[] array = n7.toArray(new Comparable[0]);
        Comparable[] comparableArr = (Comparable[]) array;
        if (comparableArr.length > 1) {
            Arrays.sort(comparableArr);
        }
        return l.N(array);
    }

    public static final d4.d H(i4.c cVar, String str, boolean z10) {
        Cursor m10 = cVar.m("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int columnIndex = m10.getColumnIndex("seqno");
            int columnIndex2 = m10.getColumnIndex("cid");
            int columnIndex3 = m10.getColumnIndex("name");
            int columnIndex4 = m10.getColumnIndex("desc");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1 && columnIndex4 != -1) {
                TreeMap treeMap = new TreeMap();
                TreeMap treeMap2 = new TreeMap();
                while (m10.moveToNext()) {
                    if (m10.getInt(columnIndex2) >= 0) {
                        int i10 = m10.getInt(columnIndex);
                        String string = m10.getString(columnIndex3);
                        String str2 = m10.getInt(columnIndex4) > 0 ? "DESC" : "ASC";
                        Integer valueOf = Integer.valueOf(i10);
                        pc.j.d(string, "columnName");
                        treeMap.put(valueOf, string);
                        treeMap2.put(Integer.valueOf(i10), str2);
                    }
                }
                Collection values = treeMap.values();
                pc.j.d(values, "columnsMap.values");
                List e02 = m.e0(values);
                Collection values2 = treeMap2.values();
                pc.j.d(values2, "ordersMap.values");
                d4.d dVar = new d4.d(str, z10, e02, m.e0(values2));
                m10.close();
                return dVar;
            }
            m10.close();
            return null;
        } finally {
        }
    }

    public static int I(float f10) {
        if (Float.isNaN(f10)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(f10);
    }

    public static final Object J(dd.t tVar, dd.t tVar2, oc.e eVar) {
        Object pVar;
        Object T;
        try {
            pc.v.c(2, eVar);
            pVar = eVar.invoke(tVar2, tVar);
        } catch (Throwable th) {
            pVar = new yc.p(th, false);
        }
        gc.a aVar = gc.a.f2559g;
        if (pVar == aVar || (T = tVar.T(pVar)) == yc.a0.f8822e) {
            return aVar;
        }
        if (T instanceof yc.p) {
            throw ((yc.p) T).f8889a;
        }
        return yc.a0.y(T);
    }

    public static final qd.k K(nd.o oVar) {
        Object obj;
        pc.j.e(oVar, "<this>");
        String str = oVar.f5107a;
        qd.l.f5870h.getClass();
        Iterator it = qd.l.f5875m.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((qd.l) obj).f5876g.equals(str)) {
                break;
            }
        }
        qd.l lVar = (qd.l) obj;
        if (lVar == null) {
            return null;
        }
        return new qd.k(lVar, oVar.f5108b, oVar.f5109c, (int) oVar.f5110d, (int) oVar.f5111e);
    }

    public static final String L(float f10) {
        if (Float.isNaN(f10)) {
            return "NaN";
        }
        if (Float.isInfinite(f10)) {
            return f10 < 0.0f ? "-Infinity" : "Infinity";
        }
        int max = Math.max(1, 0);
        float pow = (float) Math.pow(10.0f, max);
        float f11 = f10 * pow;
        int i10 = (int) f11;
        if (f11 - i10 >= 0.5f) {
            i10++;
        }
        float f12 = i10 / pow;
        return max > 0 ? String.valueOf(f12) : String.valueOf((int) f12);
    }

    public static Object M(oc.e eVar, Object obj, fc.d dVar) {
        pc.j.e(eVar, "<this>");
        fc.i context = dVar.getContext();
        Object dVar2 = context == fc.j.f2348g ? new gc.d(dVar) : new gc.e(dVar, context);
        pc.v.c(2, eVar);
        return eVar.invoke(obj, dVar2);
    }

    public static final void a(final boolean z10, final m5.a aVar, m0.r rVar, final int i10) {
        rVar.Z(-361453782);
        int i11 = (rVar.g(z10) ? 4 : 2) | i10 | (rVar.h(aVar) ? 32 : 16);
        if ((i11 & 19) == 18 && rVar.B()) {
            rVar.S();
        } else {
            d1 u10 = m0.z.u(aVar, rVar);
            Object M = rVar.M();
            Object obj = m0.l.f4646a;
            if (M == obj) {
                M = new e.g(z10, u10);
                rVar.i0(M);
            }
            final e.g gVar = (e.g) M;
            boolean h10 = ((i11 & 14) == 4) | rVar.h(gVar);
            Object M2 = rVar.M();
            if (h10 || M2 == obj) {
                M2 = new oc.a() { // from class: e.d
                    /* JADX WARN: Type inference failed for: r0v1, types: [oc.a, pc.h] */
                    @Override // oc.a
                    public final Object invoke() {
                        boolean z11 = z10;
                        g gVar2 = g.this;
                        gVar2.f1531a = z11;
                        ?? r02 = gVar2.f1533c;
                        if (r02 != 0) {
                            r02.invoke();
                        }
                        return o.f277a;
                    }
                };
                rVar.i0(M2);
            }
            m0.z.g((oc.a) M2, rVar);
            d.z zVar = (d.z) rVar.j(e.j.f1913a);
            Object obj2 = null;
            if (zVar == null) {
                rVar.X(1208426157);
                View view = (View) rVar.j(AndroidCompositionLocals_androidKt.f607f);
                pc.j.e(view, "<this>");
                while (true) {
                    if (view == null) {
                        zVar = null;
                        break;
                    }
                    Object tag = view.getTag(R.id.view_tree_on_back_pressed_dispatcher_owner);
                    d.z zVar2 = tag instanceof d.z ? (d.z) tag : null;
                    if (zVar2 != null) {
                        zVar = zVar2;
                        break;
                    } else {
                        Object z11 = a.a.z(view);
                        view = z11 instanceof View ? (View) z11 : null;
                    }
                }
                rVar.q(false);
            } else {
                rVar.X(1208423708);
                rVar.q(false);
            }
            if (zVar == null) {
                rVar.X(1208428160);
                Object obj3 = (Context) rVar.j(AndroidCompositionLocals_androidKt.f603b);
                while (true) {
                    if (!(obj3 instanceof ContextWrapper)) {
                        break;
                    }
                    if (obj3 instanceof d.z) {
                        obj2 = obj3;
                        break;
                    }
                    obj3 = ((ContextWrapper) obj3).getBaseContext();
                }
                zVar = (d.z) obj2;
                rVar.q(false);
            } else {
                rVar.X(1208423789);
                rVar.q(false);
            }
            if (zVar == null) {
                throw new IllegalStateException("No OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner");
            }
            Object a6 = zVar.a();
            Object obj4 = (androidx.lifecycle.u) rVar.j(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            boolean h11 = rVar.h(a6) | rVar.h(obj4) | rVar.h(gVar);
            Object M3 = rVar.M();
            if (h11 || M3 == obj) {
                M3 = new e.e(a6, obj4, gVar, 0);
                rVar.i0(M3);
            }
            m0.z.c(obj4, a6, (oc.c) M3, rVar);
        }
        x1 s10 = rVar.s();
        if (s10 != null) {
            s10.f4809d = new oc.e(z10, aVar, i10) { // from class: e.f

                /* renamed from: g, reason: collision with root package name */
                public final /* synthetic */ boolean f1908g;

                /* renamed from: h, reason: collision with root package name */
                public final /* synthetic */ m5.a f1909h;

                @Override // oc.e
                public final Object invoke(Object obj5, Object obj6) {
                    ((Integer) obj6).getClass();
                    int y10 = z.y(1);
                    a0.a(this.f1908g, this.f1909h, (r) obj5, y10);
                    return o.f277a;
                }
            };
        }
    }

    public static final void b(String str, m0.r rVar, int i10) {
        rVar.Z(7063671);
        if ((((rVar.f(str) ? 4 : 2) | i10) & 3) == 2 && rVar.B()) {
            rVar.S();
        } else {
            Context context = (Context) rVar.j(AndroidCompositionLocals_androidKt.f603b);
            androidx.lifecycle.u uVar = (androidx.lifecycle.u) rVar.j(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            rVar.X(1844175758);
            Object M = rVar.M();
            fc.d dVar = null;
            Object obj = m0.l.f4646a;
            if (M == obj) {
                M = m0.z.s(null);
                rVar.i0(M);
            }
            d1 d1Var = (d1) M;
            rVar.q(false);
            d1 u10 = m0.z.u(str, rVar);
            rVar.X(1844180182);
            Object M2 = rVar.M();
            if (M2 == obj) {
                M2 = new ae.e(d1Var);
                rVar.i0(M2);
            }
            ae.e eVar = (ae.e) M2;
            rVar.q(false);
            rVar.X(1844201097);
            Object M3 = rVar.M();
            if (M3 == obj) {
                b4.e eVar2 = new b4.e((p.j) d1Var.getValue());
                Intent intent = (Intent) eVar2.f961b;
                intent.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", 1);
                intent.putExtra("android.support.customtabs.extra.ENABLE_URLBAR_HIDING", true);
                ((m7.g) eVar2.f962c).f4957h = -16777216;
                M3 = eVar2.a();
                rVar.i0(M3);
            }
            p.g gVar = (p.g) M3;
            rVar.q(false);
            pc.j.b(gVar);
            rVar.X(1844210984);
            boolean h10 = rVar.h(context);
            Object M4 = rVar.M();
            if (h10 || M4 == obj) {
                M4 = new ae.c(context, eVar, dVar, 0);
                rVar.i0(M4);
            }
            rVar.q(false);
            m0.z.f(ac.o.f277a, rVar, (oc.e) M4);
            Object value = u10.getValue();
            rVar.X(1844219298);
            boolean f10 = rVar.f(u10) | rVar.h(gVar) | rVar.h(context);
            Object M5 = rVar.M();
            if (f10 || M5 == obj) {
                M5 = new ae.d(u10, gVar, context, null);
                rVar.i0(M5);
            }
            rVar.q(false);
            m0.z.f(value, rVar, (oc.e) M5);
            rVar.X(1844229356);
            boolean h11 = rVar.h(context);
            Object M6 = rVar.M();
            if (h11 || M6 == obj) {
                M6 = new ae.a(0, context, eVar);
                rVar.i0(M6);
            }
            rVar.q(false);
            m0.z.d(uVar, (oc.c) M6, rVar);
        }
        x1 s10 = rVar.s();
        if (s10 != null) {
            s10.f4809d = new ae.b(i10, 0, str);
        }
    }

    public static final c5.c c(int i10, String[] strArr, g5.j jVar, String str, String str2, oc.c cVar) {
        pc.j.e(jVar, "driver");
        return new c5.c(i10, strArr, jVar, str, str2, cVar);
    }

    public static final void d(m5.c cVar, a0.a0 a0Var, oc.c cVar2, u0.d dVar, m0.r rVar, int i10) {
        int i11;
        y0.f fVar = y0.c.f8419g;
        pc.j.e(cVar, "navigator");
        rVar.Z(-2062617034);
        if ((i10 & 14) == 0) {
            i11 = (rVar.f(cVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= rVar.h(a0Var) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= rVar.f(y0.k.f8442a) ? 256 : 128;
        }
        if ((i10 & 7168) == 0) {
            i11 |= rVar.f(fVar) ? 2048 : 1024;
        }
        if ((57344 & i10) == 0) {
            i11 |= rVar.g(false) ? 16384 : 8192;
        }
        if ((i10 & 458752) == 0) {
            i11 |= rVar.h(cVar2) ? 131072 : 65536;
        }
        if ((3670016 & i10) == 0) {
            i11 |= rVar.h(dVar) ? 1048576 : 524288;
        }
        if ((2995931 & i11) == 599186 && rVar.B()) {
            rVar.S();
        } else {
            d1 d1Var = (d1) v0.k.b(new Object[0], new v0.j(p5.f.f5537g, p5.c.f5527i), null, p5.e.f5536g, rVar, 3144, 4);
            cVar.b();
            rVar.Y(527504208);
            rVar.q(false);
            x4.f.b((k5.a) cVar.f4883f.getValue(), new l0(5, a0Var, cVar), null, cVar2, u0.e.b(rVar, -1148408837, new j5.f(cVar, d1Var, dVar)), rVar, ((i11 >> 3) & 112) | 1572872 | (i11 & 7168) | (458752 & i11));
        }
        x1 s10 = rVar.s();
        if (s10 != null) {
            s10.f4809d = new j0.w(cVar, a0Var, cVar2, dVar, i10);
        }
    }

    public static final Bundle e(ac.i... iVarArr) {
        Bundle bundle = new Bundle(iVarArr.length);
        for (ac.i iVar : iVarArr) {
            String str = (String) iVar.f270g;
            Object obj = iVar.f271h;
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Byte) {
                bundle.putByte(str, ((Number) obj).byteValue());
            } else if (obj instanceof Character) {
                bundle.putChar(str, ((Character) obj).charValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Number) obj).doubleValue());
            } else if (obj instanceof Float) {
                bundle.putFloat(str, ((Number) obj).floatValue());
            } else if (obj instanceof Integer) {
                bundle.putInt(str, ((Number) obj).intValue());
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Number) obj).longValue());
            } else if (obj instanceof Short) {
                bundle.putShort(str, ((Number) obj).shortValue());
            } else if (obj instanceof Bundle) {
                bundle.putBundle(str, (Bundle) obj);
            } else if (obj instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) obj);
            } else if (obj instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) obj);
            } else if (obj instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) obj);
            } else if (obj instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) obj);
            } else if (obj instanceof char[]) {
                bundle.putCharArray(str, (char[]) obj);
            } else if (obj instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) obj);
            } else if (obj instanceof float[]) {
                bundle.putFloatArray(str, (float[]) obj);
            } else if (obj instanceof int[]) {
                bundle.putIntArray(str, (int[]) obj);
            } else if (obj instanceof long[]) {
                bundle.putLongArray(str, (long[]) obj);
            } else if (obj instanceof short[]) {
                bundle.putShortArray(str, (short[]) obj);
            } else if (obj instanceof Object[]) {
                Class<?> componentType = obj.getClass().getComponentType();
                pc.j.b(componentType);
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    bundle.putParcelableArray(str, (Parcelable[]) obj);
                } else if (String.class.isAssignableFrom(componentType)) {
                    bundle.putStringArray(str, (String[]) obj);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    bundle.putCharSequenceArray(str, (CharSequence[]) obj);
                } else {
                    if (!Serializable.class.isAssignableFrom(componentType)) {
                        throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str + '\"');
                    }
                    bundle.putSerializable(str, (Serializable) obj);
                }
            } else if (obj instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) obj);
            } else if (obj instanceof IBinder) {
                bundle.putBinder(str, (IBinder) obj);
            } else if (obj instanceof Size) {
                bundle.putSize(str, (Size) obj);
            } else {
                if (!(obj instanceof SizeF)) {
                    throw new IllegalArgumentException("Illegal value type " + obj.getClass().getCanonicalName() + " for key \"" + str + '\"');
                }
                bundle.putSizeF(str, (SizeF) obj);
            }
        }
        return bundle;
    }

    public static final void f(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                i7.b.k(th, th2);
            }
        }
    }

    public static l7.b g(String str, String str2) {
        f8.a aVar = new f8.a(str, str2);
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(l7.r.a(f8.a.class));
        return new l7.b(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 1, new c6.f(9, aVar), hashSet3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static fc.d h(fc.d dVar, fc.d dVar2, oc.e eVar) {
        pc.j.e(eVar, "<this>");
        if (eVar instanceof hc.a) {
            return ((hc.a) eVar).create(dVar, dVar2);
        }
        fc.i context = dVar2.getContext();
        return context == fc.j.f2348g ? new gc.b(dVar2, dVar, eVar) : new gc.c(dVar2, context, eVar, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0016, code lost:
    
        r5 = r5.getValue("android:text");
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001c, code lost:
    
        r5 = r5.getText();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void i(a1.h hVar, LongSparseArray longSparseArray) {
        TranslationResponseValue value;
        CharSequence text;
        e2.o oVar;
        e2.n nVar;
        oc.c cVar;
        int size = longSparseArray.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            long keyAt = longSparseArray.keyAt(i11);
            ViewTranslationResponse n7 = a1.c.n(longSparseArray.get(keyAt));
            if (n7 != null && value != null && text != null && (oVar = (e2.o) hVar.i().b((int) keyAt)) != null && (nVar = oVar.f2000a) != null) {
                Object g8 = nVar.f1996d.f1985g.g(e2.i.f1969k);
                if (g8 == null) {
                    g8 = null;
                }
                e2.a aVar = (e2.a) g8;
                if (aVar != null && (cVar = (oc.c) aVar.f1945b) != null) {
                }
            }
        }
    }

    public static final int j(int i10, a0.i iVar, Object obj) {
        int b2;
        return (obj == null || iVar.c() == 0 || (i10 < iVar.c() && obj.equals(iVar.d(i10))) || (b2 = iVar.f55d.b(obj)) == -1) ? i10 : b2;
    }

    public static long k(int i10, int i11, int i12, int i13) {
        int i14 = 262142;
        int min = Math.min(i12, 262142);
        int min2 = i13 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i13, 262142);
        int i15 = min2 == Integer.MAX_VALUE ? min : min2;
        if (i15 >= 8191) {
            if (i15 < 32767) {
                i14 = 65534;
            } else if (i15 < 65535) {
                i14 = 32766;
            } else {
                if (i15 >= 262143) {
                    s2.b.j(i15);
                    throw new ac.d();
                }
                i14 = 8190;
            }
        }
        return s2.b.a(Math.min(i14, i10), i11 != Integer.MAX_VALUE ? Math.min(i14, i11) : Integer.MAX_VALUE, min, min2);
    }

    public static long l(int i10, int i11, int i12, int i13) {
        int i14 = 262142;
        int min = Math.min(i10, 262142);
        int min2 = i11 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i11, 262142);
        int i15 = min2 == Integer.MAX_VALUE ? min : min2;
        if (i15 >= 8191) {
            if (i15 < 32767) {
                i14 = 65534;
            } else if (i15 < 65535) {
                i14 = 32766;
            } else {
                if (i15 >= 262143) {
                    s2.b.j(i15);
                    throw new ac.d();
                }
                i14 = 8190;
            }
        }
        return s2.b.a(min, min2, Math.min(i14, i12), i13 != Integer.MAX_VALUE ? Math.min(i14, i13) : Integer.MAX_VALUE);
    }

    public static l7.b m(String str, d6.f fVar) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(l7.r.a(f8.a.class));
        for (Class cls : new Class[0]) {
            i7.b.p(cls, "Null interface");
            hashSet.add(l7.r.a(cls));
        }
        l7.j a6 = l7.j.a(Context.class);
        if (hashSet.contains(a6.f4236a)) {
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }
        hashSet2.add(a6);
        return new l7.b(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 1, new c6.j(5, str, fVar), hashSet3);
    }

    public static float n(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return l3.d.b(edgeEffect);
        }
        return 0.0f;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final Class o(vc.b bVar) {
        pc.j.e(bVar, "<this>");
        Class a6 = ((pc.d) bVar).a();
        if (a6.isPrimitive()) {
            String name = a6.getName();
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals("double")) {
                        return Double.class;
                    }
                    break;
                case 104431:
                    if (name.equals("int")) {
                        return Integer.class;
                    }
                    break;
                case 3039496:
                    if (name.equals("byte")) {
                        return Byte.class;
                    }
                    break;
                case 3052374:
                    if (name.equals("char")) {
                        return Character.class;
                    }
                    break;
                case 3327612:
                    if (name.equals("long")) {
                        return Long.class;
                    }
                    break;
                case 3625364:
                    if (name.equals("void")) {
                        return Void.class;
                    }
                    break;
                case 64711720:
                    if (name.equals("boolean")) {
                        return Boolean.class;
                    }
                    break;
                case 97526364:
                    if (name.equals("float")) {
                        return Float.class;
                    }
                    break;
                case 109413500:
                    if (name.equals("short")) {
                        return Short.class;
                    }
                    break;
            }
        }
        return a6;
    }

    public static final n3.a p(View view) {
        n3.a aVar = (n3.a) view.getTag(R.id.pooling_container_listener_holder_tag);
        if (aVar != null) {
            return aVar;
        }
        n3.a aVar2 = new n3.a();
        view.setTag(R.id.pooling_container_listener_holder_tag, aVar2);
        return aVar2;
    }

    public static final long q(f8.c cVar) {
        DragEvent dragEvent = (DragEvent) cVar.f2340h;
        float x10 = dragEvent.getX();
        float y10 = dragEvent.getY();
        return (Float.floatToRawIntBits(x10) << 32) | (Float.floatToRawIntBits(y10) & 4294967295L);
    }

    public static final Bundle r(String str, Bundle bundle) {
        pc.j.e(str, "key");
        Bundle bundle2 = bundle.getBundle(str);
        if (bundle2 != null) {
            return bundle2;
        }
        throw new IllegalArgumentException(a4.d.j("No valid saved state was found for the key '", str, "'. It may be missing, null, or not of the expected type. This can occur if the value was saved with a different type or if the saved state was modified unexpectedly."));
    }

    public static final long s(double d10) {
        return E(4294967296L, (float) d10);
    }

    public static final long t(int i10) {
        return E(4294967296L, i10);
    }

    public static final int u(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        if (action != 0) {
            return action != 1 ? 0 : 1;
        }
        return 2;
    }

    public static int v(int i10) {
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 1;
        }
        if (i10 == 4) {
            return 2;
        }
        if (i10 == 8) {
            return 3;
        }
        if (i10 == 16) {
            return 4;
        }
        if (i10 == 32) {
            return 5;
        }
        if (i10 == 64) {
            return 6;
        }
        if (i10 == 128) {
            return 7;
        }
        if (i10 == 256) {
            return 8;
        }
        if (i10 == 512) {
            return 9;
        }
        throw new IllegalArgumentException(a4.d.g("type needs to be >= FIRST and <= LAST, type=", i10));
    }

    public static fc.d w(fc.d dVar) {
        fc.d intercepted;
        pc.j.e(dVar, "<this>");
        hc.c cVar = dVar instanceof hc.c ? (hc.c) dVar : null;
        return (cVar == null || (intercepted = cVar.intercepted()) == null) ? dVar : intercepted;
    }

    public static ac.f x(oc.a aVar) {
        ac.p pVar = new ac.p();
        pVar.f278g = aVar;
        pVar.f279h = ac.n.f276a;
        return pVar;
    }

    public static ac.m y(oc.a aVar) {
        pc.j.e(aVar, "initializer");
        return new ac.m(aVar);
    }

    public static void z(String str) {
        if (Log.isLoggable("InstallReferrerClient", 2)) {
            Log.v("InstallReferrerClient", str);
        }
    }
}
