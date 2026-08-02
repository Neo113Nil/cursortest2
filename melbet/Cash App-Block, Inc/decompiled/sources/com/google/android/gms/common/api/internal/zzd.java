package com.google.android.gms.common.api.internal;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.BackStackRecord;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import org.brotli.dec.HuffmanTreeGroup;

/* loaded from: classes4.dex */
public final class zzd extends Fragment implements LifecycleFragment {
    public static final WeakHashMap zza = new WeakHashMap();
    public final HuffmanTreeGroup zzb = new HuffmanTreeGroup(14);

    public static zzd zza(FragmentActivity fragmentActivity) {
        zzd zzdVar;
        FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
        WeakHashMap weakHashMap = zza;
        WeakReference weakReference = (WeakReference) weakHashMap.get(fragmentActivity);
        if (weakReference != null && (zzdVar = (zzd) weakReference.get()) != null) {
            return zzdVar;
        }
        try {
            zzd zzdVar2 = (zzd) supportFragmentManager.findFragmentByTag("SLifecycleFragmentImpl");
            if (zzdVar2 == null || zzdVar2.isRemoving()) {
                zzdVar2 = new zzd();
                BackStackRecord backStackRecord = new BackStackRecord(supportFragmentManager);
                backStackRecord.doAddOp(0, zzdVar2, "SLifecycleFragmentImpl", 1);
                backStackRecord.commitInternal(true, true);
            }
            weakHashMap.put(fragmentActivity, new WeakReference(zzdVar2));
            return zzdVar2;
        } catch (ClassCastException e) {
            a$$ExternalSyntheticBUOutline0.m("Fragment with tag SLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e);
            return null;
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleFragment
    public final void addCallback(String str, zap zapVar) {
        this.zzb.zzb(str, zapVar);
    }

    @Override // androidx.fragment.app.Fragment
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

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.zzb.zzh(i, i2, intent);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.zzb.zze(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        HuffmanTreeGroup huffmanTreeGroup = this.zzb;
        huffmanTreeGroup.alphabetSize = 5;
        Iterator it = ((Map) huffmanTreeGroup.codes).values().iterator();
        while (it.hasNext()) {
            ((zap) it.next()).getClass();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        HuffmanTreeGroup huffmanTreeGroup = this.zzb;
        huffmanTreeGroup.alphabetSize = 3;
        Iterator it = ((Map) huffmanTreeGroup.codes).values().iterator();
        while (it.hasNext()) {
            ((zap) it.next()).onResume();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.zzb.zzi(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        HuffmanTreeGroup huffmanTreeGroup = this.zzb;
        huffmanTreeGroup.alphabetSize = 2;
        Iterator it = ((Map) huffmanTreeGroup.codes).values().iterator();
        while (it.hasNext()) {
            ((zap) it.next()).onStart();
        }
    }

    @Override // androidx.fragment.app.Fragment
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
