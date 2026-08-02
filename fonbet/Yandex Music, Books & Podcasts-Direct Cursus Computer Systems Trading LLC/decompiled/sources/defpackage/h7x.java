package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import androidx.fragment.app.o;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class h7x extends o implements vyf {
    public static final WeakHashMap j = new WeakHashMap();
    public final Map g = Collections.synchronizedMap(new xy0(0));
    public int h = 0;
    public Bundle i;

    @Override // defpackage.vyf
    public final void a(String str, uyw uywVar) {
        Map map = this.g;
        if (map.containsKey(str)) {
            xq0.x(hrg.q("LifecycleCallback with tag ", str, " already added to this fragment."));
            return;
        }
        map.put(str, uywVar);
        if (this.h > 0) {
            new fsn(Looper.getMainLooper(), 6).post(new nud(26, this, uywVar, str));
        }
    }

    @Override // defpackage.vyf
    public final LifecycleCallback b(String str, Class cls) {
        return (LifecycleCallback) cls.cast(this.g.get(str));
    }

    @Override // androidx.fragment.app.o
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        Iterator it = this.g.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).a(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // androidx.fragment.app.o
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        Iterator it = this.g.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).d(i, i2, intent);
        }
    }

    @Override // androidx.fragment.app.o
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.h = 1;
        this.i = bundle;
        for (Map.Entry entry : this.g.entrySet()) {
            ((LifecycleCallback) entry.getValue()).e(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    @Override // androidx.fragment.app.o
    public final void onDestroy() {
        super.onDestroy();
        this.h = 5;
        Iterator it = this.g.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).f();
        }
    }

    @Override // androidx.fragment.app.o
    public final void onResume() {
        super.onResume();
        this.h = 3;
        Iterator it = this.g.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).g();
        }
    }

    @Override // androidx.fragment.app.o
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle == null) {
            return;
        }
        for (Map.Entry entry : this.g.entrySet()) {
            Bundle bundle2 = new Bundle();
            ((LifecycleCallback) entry.getValue()).h(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    @Override // androidx.fragment.app.o
    public final void onStart() {
        super.onStart();
        this.h = 2;
        Iterator it = this.g.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).i();
        }
    }

    @Override // androidx.fragment.app.o
    public final void onStop() {
        super.onStop();
        this.h = 4;
        Iterator it = this.g.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).j();
        }
    }
}
