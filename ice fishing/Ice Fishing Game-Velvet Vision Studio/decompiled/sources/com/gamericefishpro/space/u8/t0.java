package com.gamericefishpro.space.u8;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class t0 extends Fragment implements e {
    public final com.gamericefishpro.space.tb.u d = new com.gamericefishpro.space.tb.u(11);

    static {
        new WeakHashMap();
    }

    @Override // android.app.Fragment
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        Iterator it = ((Map) this.d.e).values().iterator();
        while (it.hasNext()) {
            ((q0) it.next()).a(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        Iterator it = ((Map) this.d.e).values().iterator();
        if (it.hasNext()) {
            ((q0) it.next()).getClass();
            throw null;
        }
    }

    @Override // android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        for (Map.Entry entry : ((Map) this.d.e).entrySet()) {
            ((q0) entry.getValue()).c(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        com.gamericefishpro.space.tb.u uVar = this.d;
        uVar.getClass();
        Iterator it = ((Map) uVar.e).values().iterator();
        while (it.hasNext()) {
            ((q0) it.next()).getClass();
        }
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        com.gamericefishpro.space.tb.u uVar = this.d;
        uVar.getClass();
        Iterator it = ((Map) uVar.e).values().iterator();
        while (it.hasNext()) {
            ((q0) it.next()).d();
        }
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        com.gamericefishpro.space.tb.u uVar = this.d;
        if (bundle == null) {
            uVar.getClass();
            return;
        }
        Iterator it = ((Map) uVar.e).entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            new Bundle();
            ((q0) entry.getValue()).getClass();
            throw null;
        }
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        com.gamericefishpro.space.tb.u uVar = this.d;
        uVar.getClass();
        Iterator it = ((Map) uVar.e).values().iterator();
        while (it.hasNext()) {
            ((q0) it.next()).e();
        }
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        com.gamericefishpro.space.tb.u uVar = this.d;
        uVar.getClass();
        Iterator it = ((Map) uVar.e).values().iterator();
        while (it.hasNext()) {
            ((q0) it.next()).f();
        }
    }
}
