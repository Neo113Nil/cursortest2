package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import org.brotli.dec.HuffmanTreeGroup;

/* loaded from: classes4.dex */
public final class zza extends Fragment implements LifecycleFragment {
    public static final WeakHashMap zza = new WeakHashMap();
    public final HuffmanTreeGroup zzb = new HuffmanTreeGroup(14);

    public static zza zza(Activity activity) {
        zza zzaVar;
        WeakHashMap weakHashMap = zza;
        WeakReference weakReference = (WeakReference) weakHashMap.get(activity);
        if (weakReference != null && (zzaVar = (zza) weakReference.get()) != null) {
            return zzaVar;
        }
        try {
            zza zzaVar2 = (zza) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
            if (zzaVar2 == null || zzaVar2.isRemoving()) {
                zzaVar2 = new zza();
                activity.getFragmentManager().beginTransaction().add(zzaVar2, "LifecycleFragmentImpl").commitAllowingStateLoss();
            }
            weakHashMap.put(activity, new WeakReference(zzaVar2));
            return zzaVar2;
        } catch (ClassCastException e) {
            a$$ExternalSyntheticBUOutline0.m("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e);
            return null;
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleFragment
    public final void addCallback(String str, zap zapVar) {
        this.zzb.zzb(str, zapVar);
    }

    @Override // android.app.Fragment
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        Iterator it = ((Map) this.zzb.codes).values().iterator();
        while (it.hasNext()) {
            ((zap) it.next()).dump(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleFragment
    public final zap getCallbackOrNull(Class cls, String str) {
        return (zap) cls.cast(((Map) this.zzb.codes).get(str));
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleFragment
    public final Activity getLifecycleActivity() {
        return getActivity();
    }

    @Override // android.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.zzb.zzh(i, i2, intent);
    }

    @Override // android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.zzb.zze(bundle);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        HuffmanTreeGroup huffmanTreeGroup = this.zzb;
        huffmanTreeGroup.alphabetSize = 5;
        Iterator it = ((Map) huffmanTreeGroup.codes).values().iterator();
        while (it.hasNext()) {
            ((zap) it.next()).getClass();
        }
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        HuffmanTreeGroup huffmanTreeGroup = this.zzb;
        huffmanTreeGroup.alphabetSize = 3;
        Iterator it = ((Map) huffmanTreeGroup.codes).values().iterator();
        while (it.hasNext()) {
            ((zap) it.next()).onResume();
        }
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.zzb.zzi(bundle);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        HuffmanTreeGroup huffmanTreeGroup = this.zzb;
        huffmanTreeGroup.alphabetSize = 2;
        Iterator it = ((Map) huffmanTreeGroup.codes).values().iterator();
        while (it.hasNext()) {
            ((zap) it.next()).onStart();
        }
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        HuffmanTreeGroup huffmanTreeGroup = this.zzb;
        huffmanTreeGroup.alphabetSize = 4;
        Iterator it = ((Map) huffmanTreeGroup.codes).values().iterator();
        while (it.hasNext()) {
            ((zap) it.next()).onStop();
        }
    }
}
