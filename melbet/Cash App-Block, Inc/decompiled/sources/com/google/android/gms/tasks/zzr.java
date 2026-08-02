package com.google.android.gms.tasks;

import androidx.camera.video.Recorder;
import androidx.compose.ui.input.pointer.PointerId;
import androidx.compose.ui.input.pointer.PointerInputEventData;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes.dex */
public final class zzr {
    public final Object zza;
    public Object zzb;
    public boolean zzc;

    public zzr(CoroutineScope coroutineScope, CoroutineScope coroutineScope2) {
        coroutineScope.getClass();
        coroutineScope2.getClass();
        this.zza = new ArrayList();
        this.zzb = new ArrayList();
    }

    /* renamed from: activeHoverEvent-0FcD4WY, reason: not valid java name */
    public boolean m2031activeHoverEvent0FcD4WY(long j) {
        Object obj;
        List pointers = ((Recorder.AnonymousClass1) this.zzb).getPointers();
        int size = pointers.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = pointers.get(i);
            if (PointerId.m812equalsimpl0(((PointerInputEventData) obj).m820getIdJ3iCeTQ(), j)) {
                break;
            }
            i++;
        }
        PointerInputEventData pointerInputEventData = (PointerInputEventData) obj;
        if (pointerInputEventData != null) {
            return pointerInputEventData.getActiveHover();
        }
        return false;
    }

    public void zza(zzq zzqVar) {
        synchronized (this.zza) {
            try {
                if (((ArrayDeque) this.zzb) == null) {
                    this.zzb = new ArrayDeque();
                }
                ((ArrayDeque) this.zzb).add(zzqVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void zzb(Task task) {
        zzq zzqVar;
        Object obj = this.zza;
        synchronized (obj) {
            if (((ArrayDeque) this.zzb) != null && !this.zzc) {
                this.zzc = true;
                while (true) {
                    synchronized (obj) {
                        try {
                            zzqVar = (zzq) ((ArrayDeque) this.zzb).poll();
                            if (zzqVar == null) {
                                this.zzc = false;
                                return;
                            }
                        } finally {
                        }
                    }
                    zzqVar.zza(task);
                }
            }
        }
    }

    public /* synthetic */ zzr(Object obj, Object obj2) {
        this.zza = obj;
        this.zzb = obj2;
    }

    public zzr() {
        this.zza = new Object();
    }
}
