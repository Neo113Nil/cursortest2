package x4;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.Choreographer;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.widget.ImageView;
import androidx.work.impl.WorkDatabase_Impl;
import b0.p0;
import bd.a0;
import h2.g0;
import h2.z;
import h3.w;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import m.c0;
import m.l1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class s implements bd.e, g7.c {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f8355g;

    /* renamed from: h, reason: collision with root package name */
    public Object f8356h;

    /* renamed from: i, reason: collision with root package name */
    public Object f8357i;

    public /* synthetic */ s(int i10, Object obj, Object obj2) {
        this.f8355g = i10;
        this.f8356h = obj;
        this.f8357i = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0046 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0041 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static s a(Context context) {
        FileChannel fileChannel;
        FileLock fileLock;
        try {
            fileChannel = new RandomAccessFile(new File(context.getFilesDir(), "generatefid.lock"), "rw").getChannel();
            try {
                fileLock = fileChannel.lock();
            } catch (IOException | Error | OverlappingFileLockException e10) {
                e = e10;
                fileLock = null;
            }
        } catch (IOException | Error | OverlappingFileLockException e11) {
            e = e11;
            fileChannel = null;
            fileLock = null;
        }
        try {
            return new s(10, fileChannel, fileLock);
        } catch (IOException e12) {
            e = e12;
            Log.e("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", e);
            if (fileLock != null) {
                try {
                    fileLock.release();
                } catch (IOException unused) {
                }
            }
            if (fileChannel != null) {
                try {
                    fileChannel.close();
                } catch (IOException unused2) {
                }
            }
            return null;
        } catch (Error e13) {
            e = e13;
            Log.e("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", e);
            if (fileLock != null) {
            }
            if (fileChannel != null) {
            }
            return null;
        } catch (OverlappingFileLockException e14) {
            e = e14;
            Log.e("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", e);
            if (fileLock != null) {
            }
            if (fileChannel != null) {
            }
            return null;
        }
    }

    public void b(Object obj, String str) {
        ((ArrayList) this.f8356h).add(str + "=" + String.valueOf(obj));
    }

    @Override // bd.e
    public Object c(bd.f fVar, fc.d dVar) {
        Object c3 = ((cd.k) this.f8356h).c(new bd.i(new pc.o(), fVar, (a0) this.f8357i, 0), dVar);
        return c3 == gc.a.f2559g ? c3 : ac.o.f277a;
    }

    public void d() {
        l1 l1Var;
        ImageView imageView = (ImageView) this.f8356h;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            int i10 = c0.f4278a;
        }
        if (drawable == null || (l1Var = (l1) this.f8357i) == null) {
            return;
        }
        m.o.c(drawable, l1Var, imageView.getDrawableState());
    }

    public ArrayList e(String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f8356h;
        b4.o a6 = b4.o.a("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?", 1);
        if (str == null) {
            a6.h(1);
        } else {
            a6.c(str, 1);
        }
        workDatabase_Impl.b();
        Cursor m10 = workDatabase_Impl.m(a6);
        try {
            ArrayList arrayList = new ArrayList(m10.getCount());
            while (m10.moveToNext()) {
                arrayList.add(m10.isNull(0) ? null : m10.getString(0));
            }
            return arrayList;
        } finally {
            m10.close();
            a6.f();
        }
    }

    public void f(int i10) {
        int resourceId;
        ImageView imageView = (ImageView) this.f8356h;
        Context context = imageView.getContext();
        int[] iArr = i.a.f2914e;
        a5.c C = a5.c.C(context, null, iArr, i10);
        TypedArray typedArray = (TypedArray) C.f261g;
        w.a(imageView, imageView.getContext(), iArr, null, (TypedArray) C.f261g, i10);
        try {
            Drawable drawable = imageView.getDrawable();
            if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = j.a.a(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                int i11 = c0.f4278a;
            }
            if (typedArray.hasValue(2)) {
                imageView.setImageTintList(C.u(2));
            }
            if (typedArray.hasValue(3)) {
                imageView.setImageTintMode(c0.b(typedArray.getInt(3, -1), null));
            }
            C.F();
        } catch (Throwable th) {
            C.F();
            throw th;
        }
    }

    public void g() {
        ((g4.a) this.f8356h).a();
    }

    public void h(Bundle bundle) {
        g4.a aVar = (g4.a) this.f8356h;
        e4.e eVar = aVar.f2507a;
        if (!aVar.f2511e) {
            aVar.a();
        }
        if (eVar.h().f723c.compareTo(androidx.lifecycle.p.f700j) >= 0) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + eVar.h().f723c).toString());
        }
        if (aVar.f2513g) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        Bundle bundle2 = null;
        if (bundle != null && bundle.containsKey("androidx.lifecycle.BundlableSavedStateRegistry.key")) {
            bundle2 = bc.a0.r("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle);
        }
        aVar.f2512f = bundle2;
        aVar.f2513g = true;
    }

    public void i(Bundle bundle) {
        pc.j.e(bundle, "outBundle");
        g4.a aVar = (g4.a) this.f8356h;
        Bundle e10 = bc.a0.e((ac.i[]) Arrays.copyOf(new ac.i[0], 0));
        Bundle bundle2 = aVar.f2512f;
        if (bundle2 != null) {
            e10.putAll(bundle2);
        }
        synchronized (aVar.f2509c) {
            for (Map.Entry entry : aVar.f2510d.entrySet()) {
                String str = (String) entry.getKey();
                Bundle a6 = ((e4.d) entry.getValue()).a();
                pc.j.e(str, "key");
                pc.j.e(a6, "value");
                e10.putBundle(str, a6);
            }
        }
        if (e10.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", e10);
    }

    public void j() {
        try {
            ((FileLock) this.f8357i).release();
            ((FileChannel) this.f8356h).close();
        } catch (IOException e10) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e10);
        }
    }

    @Override // g7.c
    public void k(g7.o oVar) {
        ((Map) ((c) this.f8357i).f8291h).remove((g7.h) this.f8356h);
    }

    public void m(int i10, int i11, int i12, int i13) {
        r.a aVar = (r.a) this.f8357i;
        aVar.f5882j.set(i10, i11, i12, i13);
        Rect rect = aVar.f5881i;
        super/*android.view.View*/.setPadding(i10 + rect.left, i11 + rect.top, i12 + rect.right, i13 + rect.bottom);
    }

    public String toString() {
        switch (this.f8355g) {
            case 7:
                StringBuilder sb = new StringBuilder(100);
                sb.append(this.f8357i.getClass().getSimpleName());
                sb.append('{');
                ArrayList arrayList = (ArrayList) this.f8356h;
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    sb.append((String) arrayList.get(i10));
                    if (i10 < size - 1) {
                        sb.append(", ");
                    }
                }
                sb.append('}');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public s(c cVar, g7.h hVar) {
        this.f8355g = 6;
        this.f8357i = cVar;
        this.f8356h = hVar;
    }

    public /* synthetic */ s(Object obj) {
        this.f8355g = 7;
        this.f8357i = obj;
        this.f8356h = new ArrayList();
    }

    public s(g4.a aVar) {
        this.f8355g = 2;
        this.f8356h = aVar;
        this.f8357i = new l(aVar);
    }

    public s(WorkDatabase_Impl workDatabase_Impl) {
        this.f8355g = 0;
        this.f8356h = workDatabase_Impl;
        this.f8357i = new b(workDatabase_Impl, 6);
        new h(workDatabase_Impl, 16);
    }

    public s(ImageView imageView) {
        this.f8355g = 5;
        this.f8356h = imageView;
    }

    public s(View view, y1.r rVar) {
        this.f8355g = 4;
        new l(view);
        Choreographer.getInstance();
        this.f8356h = view;
        long j3 = g0.f2670b;
        int length = new h2.e("", 0).f2648h.length();
        int i10 = g0.f2671c;
        int i11 = (int) (j3 >> 32);
        int i12 = i11 < 0 ? 0 : i11;
        i12 = i12 > length ? length : i12;
        int i13 = (int) (j3 & 4294967295L);
        int i14 = i13 >= 0 ? i13 : 0;
        length = i14 <= length ? i14 : length;
        if (i12 != i11 || length != i13) {
            z.b(i12, length);
        }
        int i15 = l2.b.f4114e;
        new ArrayList();
        this.f8357i = bc.a0.x(new p0(11, this));
        new CursorAnchorInfo.Builder();
        new Matrix();
    }

    public s(ArrayList arrayList, ArrayList arrayList2) {
        this.f8355g = 11;
        int size = arrayList.size();
        this.f8356h = new int[size];
        this.f8357i = new float[size];
        for (int i10 = 0; i10 < size; i10++) {
            ((int[]) this.f8356h)[i10] = ((Integer) arrayList.get(i10)).intValue();
            ((float[]) this.f8357i)[i10] = ((Float) arrayList2.get(i10)).floatValue();
        }
    }

    public s(int i10, int i11) {
        this.f8355g = 11;
        this.f8356h = new int[]{i10, i11};
        this.f8357i = new float[]{0.0f, 1.0f};
    }

    public s(int i10, int i11, int i12) {
        this.f8355g = 11;
        this.f8356h = new int[]{i10, i11, i12};
        this.f8357i = new float[]{0.0f, 0.5f, 1.0f};
    }

    public s(r.a aVar) {
        this.f8355g = 8;
        this.f8357i = aVar;
    }
}
