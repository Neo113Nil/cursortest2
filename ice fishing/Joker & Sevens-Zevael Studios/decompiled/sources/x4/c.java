package x4;

import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Matrix;
import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.view.View;
import androidx.work.impl.WorkDatabase_Impl;
import com.google.android.gms.common.api.Status;
import f1.d0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import y1.e0;
import y1.r0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class c implements bd.e, r0 {

    /* renamed from: g, reason: collision with root package name */
    public Object f8290g;

    /* renamed from: h, reason: collision with root package name */
    public Object f8291h;

    public /* synthetic */ c(Object obj, Object obj2) {
        this.f8290g = obj;
        this.f8291h = obj2;
    }

    @Override // y1.r0
    public void a(View view, float[] fArr) {
        d0.o(fArr);
        f(view, fArr);
    }

    public boolean b(long j3) {
        Object obj;
        List list = (List) ((e) this.f8291h).f8294g;
        int size = list.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i10);
            if (r1.m.a(((r1.p) obj).f5981a, j3)) {
                break;
            }
            i10++;
        }
        r1.p pVar = (r1.p) obj;
        if (pVar != null) {
            return pVar.f5988h;
        }
        return false;
    }

    @Override // bd.e
    public Object c(bd.f fVar, fc.d dVar) {
        Object c3 = ((f8.c) this.f8290g).c(new e5.c(fVar, (fc.i) this.f8291h, 0), dVar);
        return c3 == gc.a.f2559g ? c3 : ac.o.f277a;
    }

    public ArrayList d(String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f8290g;
        b4.o a6 = b4.o.a("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?", 1);
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

    public String e(String str) {
        String str2 = (String) this.f8291h;
        Resources resources = (Resources) this.f8290g;
        int identifier = resources.getIdentifier(str, "string", str2);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }

    public void f(View view, float[] fArr) {
        float[] fArr2 = (float[]) this.f8290g;
        Object parent = view.getParent();
        if (parent instanceof View) {
            f((View) parent, fArr);
            d0.o(fArr2);
            d0.x(fArr2, -view.getScrollX(), -view.getScrollY());
            e0.u(fArr, fArr2);
            float left = view.getLeft();
            float top = view.getTop();
            d0.o(fArr2);
            d0.x(fArr2, left, top);
            e0.u(fArr, fArr2);
        } else {
            int[] iArr = (int[]) this.f8291h;
            view.getLocationInWindow(iArr);
            d0.o(fArr2);
            d0.x(fArr2, -view.getScrollX(), -view.getScrollY());
            e0.u(fArr, fArr2);
            float f10 = iArr[0];
            float f11 = iArr[1];
            d0.o(fArr2);
            d0.x(fArr2, f10, f11);
            e0.u(fArr, fArr2);
        }
        Matrix matrix = view.getMatrix();
        if (matrix.isIdentity()) {
            return;
        }
        d0.p(fArr2, matrix);
        e0.u(fArr, fArr2);
    }

    public void g(boolean z10, Status status) {
        HashMap hashMap;
        HashMap hashMap2;
        synchronized (((Map) this.f8290g)) {
            hashMap = new HashMap((Map) this.f8290g);
        }
        synchronized (((Map) this.f8291h)) {
            hashMap2 = new HashMap((Map) this.f8291h);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (z10 || ((Boolean) entry.getValue()).booleanValue()) {
                entry.getKey().getClass();
                throw new ClassCastException();
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (z10 || ((Boolean) entry2.getValue()).booleanValue()) {
                ((g7.h) entry2.getKey()).b(new n6.d(status));
            }
        }
    }

    public c(IBinder iBinder) {
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if (interfaceDescriptor == "android.os.IMessenger" || (interfaceDescriptor != null && interfaceDescriptor.equals("android.os.IMessenger"))) {
            this.f8290g = new Messenger(iBinder);
            this.f8291h = null;
        } else {
            if (interfaceDescriptor != "com.google.android.gms.iid.IMessengerCompat" && (interfaceDescriptor == null || !interfaceDescriptor.equals("com.google.android.gms.iid.IMessengerCompat"))) {
                Log.w("MessengerIpcClient", "Invalid interface descriptor: ".concat(String.valueOf(interfaceDescriptor)));
                throw new RemoteException();
            }
            this.f8291h = new l6.f(iBinder);
            this.f8290g = null;
        }
    }

    public c(int i10) {
        switch (i10) {
            case 7:
                this.f8290g = Collections.synchronizedMap(new WeakHashMap());
                this.f8291h = Collections.synchronizedMap(new WeakHashMap());
                break;
            default:
                this.f8290g = new LinkedHashMap();
                this.f8291h = new LinkedHashMap();
                break;
        }
    }
}
