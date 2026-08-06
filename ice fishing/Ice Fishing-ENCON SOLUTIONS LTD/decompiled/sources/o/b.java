package o;

import android.content.Context;
import android.os.Handler;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.regex.Matcher;

/* loaded from: classes.dex */
public final class b implements D0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8225a;

    /* renamed from: b, reason: collision with root package name */
    public Object f8226b;

    /* renamed from: c, reason: collision with root package name */
    public Object f8227c;

    public /* synthetic */ b(int i2, Object obj, Object obj2) {
        this.f8225a = i2;
        this.f8227c = obj;
        this.f8226b = obj2;
    }

    public void a(Object obj, String str) {
        ((ArrayList) this.f8226b).add(str + "=" + String.valueOf(obj));
    }

    public void b(v.e eVar) {
        int i2 = eVar.f8492b;
        Handler handler = (Handler) this.f8227c;
        Z0.i iVar = (Z0.i) this.f8226b;
        if (i2 == 0) {
            handler.post(new D0.f(iVar, eVar.f8491a, 8, false));
        } else {
            handler.post(new C.b(iVar, i2));
        }
    }

    public void c(boolean z2, Status status) {
        HashMap hashMap;
        HashMap hashMap2;
        synchronized (((Map) this.f8226b)) {
            hashMap = new HashMap((Map) this.f8226b);
        }
        synchronized (((Map) this.f8227c)) {
            hashMap2 = new HashMap((Map) this.f8227c);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (z2 || ((Boolean) entry.getValue()).booleanValue()) {
                entry.getKey().getClass();
                throw new ClassCastException();
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (z2 || ((Boolean) entry2.getValue()).booleanValue()) {
                ((D0.d) entry2.getKey()).a(new n0.d(status));
            }
        }
    }

    @Override // D0.a
    public void onComplete(Task task) {
        ((Map) ((b) this.f8227c).f8227c).remove((D0.d) this.f8226b);
    }

    public String toString() {
        switch (this.f8225a) {
            case 4:
                StringBuilder sb = new StringBuilder(100);
                sb.append(this.f8227c.getClass().getSimpleName());
                sb.append('{');
                ArrayList arrayList = (ArrayList) this.f8226b;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    sb.append((String) arrayList.get(i2));
                    if (i2 < size - 1) {
                        sb.append(", ");
                    }
                }
                sb.append('}');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public b(Context context) {
        x0.e eVar;
        this.f8225a = 7;
        this.f8226b = new x0.g(context, m0.g.f8175b);
        synchronized (x0.e.class) {
            try {
                if (x0.e.f8526d == null) {
                    x0.e.f8526d = new x0.e(context.getApplicationContext());
                }
                eVar = x0.e.f8526d;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f8227c = eVar;
    }

    public /* synthetic */ b(Object obj) {
        this.f8225a = 4;
        this.f8227c = obj;
        this.f8226b = new ArrayList();
    }

    public b(int i2) {
        this.f8225a = i2;
        switch (i2) {
            case 2:
                this.f8226b = Collections.synchronizedMap(new WeakHashMap());
                this.f8227c = Collections.synchronizedMap(new WeakHashMap());
                break;
            case 5:
                m0.f fVar = m0.f.f8173d;
                this.f8226b = new SparseIntArray();
                this.f8227c = fVar;
                break;
        }
    }

    public b(Z0.i iVar, Handler handler) {
        this.f8225a = 6;
        this.f8226b = iVar;
        this.f8227c = handler;
    }

    public b(Matcher matcher, String str) {
        this.f8225a = 8;
        this.f8226b = matcher;
    }
}
