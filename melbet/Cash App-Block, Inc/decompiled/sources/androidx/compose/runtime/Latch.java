package androidx.compose.runtime;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.zzae;
import com.google.android.gms.measurement.internal.zzhh;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final class Latch {
    public boolean _isOpen;
    public Serializable awaiters;
    public final Object lock;
    public Object spareList;

    public Latch() {
        this.lock = new Object();
        this.awaiters = new ArrayList();
        this.spareList = new ArrayList();
        this._isOpen = true;
    }

    public boolean onObserverAdded$room_runtime_release(int[] iArr) {
        iArr.getClass();
        ReentrantLock reentrantLock = (ReentrantLock) this.lock;
        reentrantLock.lock();
        try {
            boolean z = false;
            for (int i : iArr) {
                long[] jArr = (long[]) this.awaiters;
                long j = jArr[i];
                jArr[i] = 1 + j;
                if (j == 0) {
                    z = true;
                    this._isOpen = true;
                }
            }
            return z;
        } finally {
            reentrantLock.unlock();
        }
    }

    public boolean onObserverRemoved$room_runtime_release(int[] iArr) {
        iArr.getClass();
        ReentrantLock reentrantLock = (ReentrantLock) this.lock;
        reentrantLock.lock();
        try {
            boolean z = false;
            for (int i : iArr) {
                long[] jArr = (long[]) this.awaiters;
                long j = jArr[i];
                jArr[i] = j - 1;
                if (j == 1) {
                    z = true;
                    this._isOpen = true;
                }
            }
            return z;
        } finally {
            reentrantLock.unlock();
        }
    }

    public String zza() {
        if (!this._isOpen) {
            this._isOpen = true;
            zzhh zzhhVar = (zzhh) this.spareList;
            this.awaiters = zzhhVar.zzd().getString((String) this.lock, null);
        }
        return (String) this.awaiters;
    }

    public void zzb(String str) {
        SharedPreferences.Editor edit = ((zzhh) this.spareList).zzd().edit();
        edit.putString((String) this.lock, str);
        edit.apply();
        this.awaiters = str;
    }

    public Latch(zzhh zzhhVar, String str) {
        this.spareList = zzhhVar;
        zzae.checkNotEmpty(str);
        this.lock = str;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.io.Serializable, long[]] */
    public Latch(int i) {
        this.lock = new ReentrantLock();
        this.awaiters = new long[i];
        this.spareList = new boolean[i];
    }
}
