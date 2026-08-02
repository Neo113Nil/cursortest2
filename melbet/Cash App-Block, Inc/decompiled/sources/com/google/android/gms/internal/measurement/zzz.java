package com.google.android.gms.internal.measurement;

import android.net.Uri;
import android.os.Process;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.fillr.featuretoggle.UnleashContext;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.UnsupportedApiCallException;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.google.common.util.concurrent.AsyncCallable;
import com.google.common.util.concurrent.AsyncFunction;
import com.google.common.util.concurrent.CombinedFuture;
import com.google.common.util.concurrent.ImmediateFuture;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes4.dex */
public final class zzz implements Continuation, zzrt, AsyncCallable {
    public final /* synthetic */ int $r8$classId;
    public Object zza;
    public Object zzb;

    public zzz(int i) {
        this.$r8$classId = i;
        switch (i) {
            case 1:
                this.zza = new HashMap();
                this.zzb = new zzau(6);
                zzau zzauVar = new zzau(0);
                zzbk zzbkVar = zzbk.BITWISE_AND;
                ArrayList arrayList = zzauVar.zza;
                arrayList.add(zzbkVar);
                arrayList.add(zzbk.BITWISE_LEFT_SHIFT);
                arrayList.add(zzbk.BITWISE_NOT);
                arrayList.add(zzbk.BITWISE_OR);
                arrayList.add(zzbk.BITWISE_RIGHT_SHIFT);
                arrayList.add(zzbk.BITWISE_UNSIGNED_RIGHT_SHIFT);
                arrayList.add(zzbk.BITWISE_XOR);
                zza(zzauVar);
                zzau zzauVar2 = new zzau(1);
                zzbk zzbkVar2 = zzbk.EQUALS;
                ArrayList arrayList2 = zzauVar2.zza;
                arrayList2.add(zzbkVar2);
                arrayList2.add(zzbk.GREATER_THAN);
                arrayList2.add(zzbk.GREATER_THAN_EQUALS);
                arrayList2.add(zzbk.IDENTITY_EQUALS);
                arrayList2.add(zzbk.IDENTITY_NOT_EQUALS);
                arrayList2.add(zzbk.LESS_THAN);
                arrayList2.add(zzbk.LESS_THAN_EQUALS);
                arrayList2.add(zzbk.NOT_EQUALS);
                zza(zzauVar2);
                zzau zzauVar3 = new zzau(2);
                zzbk zzbkVar3 = zzbk.APPLY;
                ArrayList arrayList3 = zzauVar3.zza;
                arrayList3.add(zzbkVar3);
                arrayList3.add(zzbk.BLOCK);
                arrayList3.add(zzbk.BREAK);
                arrayList3.add(zzbk.CASE);
                arrayList3.add(zzbk.DEFAULT);
                arrayList3.add(zzbk.CONTINUE);
                arrayList3.add(zzbk.DEFINE_FUNCTION);
                arrayList3.add(zzbk.FN);
                arrayList3.add(zzbk.IF);
                arrayList3.add(zzbk.QUOTE);
                arrayList3.add(zzbk.RETURN);
                arrayList3.add(zzbk.SWITCH);
                arrayList3.add(zzbk.TERNARY);
                zza(zzauVar3);
                zzau zzauVar4 = new zzau(3);
                zzbk zzbkVar4 = zzbk.AND;
                ArrayList arrayList4 = zzauVar4.zza;
                arrayList4.add(zzbkVar4);
                arrayList4.add(zzbk.NOT);
                arrayList4.add(zzbk.OR);
                zza(zzauVar4);
                zzau zzauVar5 = new zzau(4);
                zzbk zzbkVar5 = zzbk.FOR_IN;
                ArrayList arrayList5 = zzauVar5.zza;
                arrayList5.add(zzbkVar5);
                arrayList5.add(zzbk.FOR_IN_CONST);
                arrayList5.add(zzbk.FOR_IN_LET);
                arrayList5.add(zzbk.FOR_LET);
                arrayList5.add(zzbk.FOR_OF);
                arrayList5.add(zzbk.FOR_OF_CONST);
                arrayList5.add(zzbk.FOR_OF_LET);
                arrayList5.add(zzbk.WHILE);
                zza(zzauVar5);
                zzau zzauVar6 = new zzau(5);
                zzbk zzbkVar6 = zzbk.ADD;
                ArrayList arrayList6 = zzauVar6.zza;
                arrayList6.add(zzbkVar6);
                arrayList6.add(zzbk.DIVIDE);
                arrayList6.add(zzbk.MODULUS);
                arrayList6.add(zzbk.MULTIPLY);
                arrayList6.add(zzbk.NEGATE);
                arrayList6.add(zzbk.POST_DECREMENT);
                arrayList6.add(zzbk.POST_INCREMENT);
                arrayList6.add(zzbk.PRE_DECREMENT);
                arrayList6.add(zzbk.PRE_INCREMENT);
                arrayList6.add(zzbk.SUBTRACT);
                zza(zzauVar6);
                zzau zzauVar7 = new zzau(7);
                zzbk zzbkVar7 = zzbk.ASSIGN;
                ArrayList arrayList7 = zzauVar7.zza;
                arrayList7.add(zzbkVar7);
                arrayList7.add(zzbk.CONST);
                arrayList7.add(zzbk.CREATE_ARRAY);
                arrayList7.add(zzbk.CREATE_OBJECT);
                arrayList7.add(zzbk.EXPRESSION_LIST);
                arrayList7.add(zzbk.GET);
                arrayList7.add(zzbk.GET_INDEX);
                arrayList7.add(zzbk.GET_PROPERTY);
                arrayList7.add(zzbk.NULL);
                arrayList7.add(zzbk.SET_PROPERTY);
                arrayList7.add(zzbk.TYPEOF);
                arrayList7.add(zzbk.UNDEFINED);
                arrayList7.add(zzbk.VAR);
                zza(zzauVar7);
                break;
            case 2:
            default:
                this.zza = new TreeMap();
                this.zzb = new TreeMap();
                break;
            case 3:
                break;
        }
    }

    @Override // com.google.common.util.concurrent.AsyncCallable
    public ListenableFuture call() {
        switch (this.$r8$classId) {
            case 5:
                zztp zztpVar = (zztp) this.zzb;
                String valueOf = String.valueOf(zztpVar.zza);
                zztw zztwVar = zztpVar.zzh;
                String concat = "Initialize ".concat(valueOf);
                zztwVar.getClass();
                zzwi zza = zztw.zza(concat);
                try {
                    synchronized (zztpVar.zzg) {
                        try {
                            if (((List) this.zza) == null) {
                                this.zza = zztpVar.zzi;
                                zztpVar.zzi = Collections.EMPTY_LIST;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    ArrayList arrayList = new ArrayList(((List) this.zza).size());
                    zzus zzusVar = new zzus((zztp) this.zzb);
                    Iterator it = ((List) this.zza).iterator();
                    while (it.hasNext()) {
                        try {
                            arrayList.add(((AsyncFunction) it.next()).apply(zzusVar));
                        } catch (Exception e) {
                            arrayList.add(new ImmediateFuture.ImmediateFailedFuture(e));
                        }
                    }
                    ImmutableList copyOf = ImmutableList.copyOf((Iterable) arrayList);
                    zza zzaVar = new zza(this, 2);
                    CombinedFuture combinedFuture = new CombinedFuture(copyOf, true);
                    combinedFuture.task = new CombinedFuture.CallableInterruptibleTask(combinedFuture, zzaVar);
                    combinedFuture.init();
                    zza.zza(combinedFuture);
                    zza.close();
                    return combinedFuture;
                } catch (Throwable th2) {
                    try {
                        zza.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            default:
                zzws zzwsVar = (zzws) this.zza;
                zzwq zzd = zzvy.zzd();
                zzws zzc = zzvy.zzc(zzd, zzwsVar);
                try {
                    ListenableFuture call = ((AsyncCallable) this.zzb).call();
                    zzvy.zzc(zzd, zzc);
                    call.getClass();
                    return call;
                } finally {
                }
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        boolean z = task.getException() instanceof UnsupportedApiCallException;
        zzme zzmeVar = (zzme) this.zzb;
        zzkk zzkkVar = (zzkk) this.zza;
        if (z) {
            return zzkkVar.zzc(zzmeVar.zza());
        }
        if (task.getException() instanceof ApiException) {
            ApiException apiException = (ApiException) task.getException();
            apiException.getClass();
            if (apiException.mStatus.zza == 29514) {
                return zzkkVar.zzc(zzmeVar.zza());
            }
        }
        return task;
    }

    public String toString() {
        switch (this.$r8$classId) {
            case 6:
                AsyncCallable asyncCallable = (AsyncCallable) this.zzb;
                StringBuilder sb = new StringBuilder(asyncCallable.toString().length() + 14);
                sb.append("propagating=[");
                sb.append(asyncCallable);
                sb.append("]");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzrt
    public Object zza(zzzm zzzmVar) {
        Uri uri = (Uri) zzzmVar.zzf;
        AtomicLong atomicLong = zzsu.zza;
        int myPid = Process.myPid();
        long id = Thread.currentThread().getId();
        long currentTimeMillis = System.currentTimeMillis();
        long andIncrement = zzsu.zza.getAndIncrement();
        int length = String.valueOf(myPid).length();
        StringBuilder sb = new StringBuilder(length + 15 + String.valueOf(id).length() + 1 + String.valueOf(currentTimeMillis).length() + 1 + String.valueOf(andIncrement).length());
        sb.append(".mobstore_tmp-");
        sb.append(myPid);
        sb.append("-");
        sb.append(id);
        Boxes$$ExternalSyntheticOutline1.m1151m(currentTimeMillis, "-", "-", sb);
        sb.append(andIncrement);
        Uri build = uri.buildUpon().path(String.valueOf(uri.getPath()).concat(sb.toString())).build();
        zzsx zzsxVar = (zzsx) zzzmVar.zzc;
        ArrayList zzd = zzzmVar.zzd(zzsxVar.zzj(build));
        zzz[] zzzVarArr = (zzz[]) this.zzb;
        if (zzzVarArr != null) {
            zzzVarArr[0].zza(zzd);
        }
        try {
            OutputStream outputStream = (OutputStream) zzd.get(0);
            try {
                zzacb zzacbVar = (zzacb) this.zza;
                zzacbVar.getClass();
                zzadu zzaduVar = (zzadu) zzacbVar;
                int zzcq = zzaduVar.zzcq();
                boolean z = zzada.zzc;
                if (zzcq > 4096) {
                    zzcq = 4096;
                }
                zzacz zzaczVar = new zzacz(outputStream, zzcq);
                zzaduVar.zzcH(zzaczVar);
                zzaczVar.zzx();
                zzz[] zzzVarArr2 = (zzz[]) this.zzb;
                if (zzzVarArr2 != null) {
                    zzz zzzVar = zzzVarArr2[0];
                    if (((zzsm) zzzVar.zzb) == null) {
                        throw new zzsk("Cannot sync underlying stream");
                    }
                    ((OutputStream) zzzVar.zza).flush();
                    ((zzsm) zzzVar.zzb).zza.getFD().sync();
                }
                outputStream.close();
                zzsxVar.zzl(build, uri);
                return null;
            } finally {
            }
        } catch (Exception e) {
            try {
                zzsxVar.zzk(build);
            } catch (FileNotFoundException unused) {
            }
            if (e instanceof IOException) {
                throw ((IOException) e);
            }
            throw new IOException(e);
        }
    }

    public void zzb(UnleashContext unleashContext, com.google.android.gms.maps.zzah zzahVar) {
        zzl zzlVar = new zzl(zzahVar);
        TreeMap treeMap = (TreeMap) this.zza;
        for (Integer num : treeMap.keySet()) {
            zzaa clone = ((zzaa) zzahVar.zzb).clone();
            zzao zza = ((zzan) treeMap.get(num)).zza(unleashContext, Collections.singletonList(zzlVar));
            int zzg = zza instanceof zzah ? zzh.zzg(((zzah) zza).zza.doubleValue()) : -1;
            if (zzg == 2 || zzg == -1) {
                zzahVar.zzb = clone;
            }
        }
        TreeMap treeMap2 = (TreeMap) this.zzb;
        Iterator it = treeMap2.keySet().iterator();
        while (it.hasNext()) {
            zzao zza2 = ((zzan) treeMap2.get((Integer) it.next())).zza(unleashContext, Collections.singletonList(zzlVar));
            if (zza2 instanceof zzah) {
                zzh.zzg(((zzah) zza2).zza.doubleValue());
            }
        }
    }

    public zzao zzb(UnleashContext unleashContext, zzao zzaoVar) {
        zzau zzauVar;
        zzh.zzl(unleashContext);
        if (!(zzaoVar instanceof zzap)) {
            return zzaoVar;
        }
        zzap zzapVar = (zzap) zzaoVar;
        ArrayList arrayList = zzapVar.zzb;
        String str = zzapVar.zza;
        HashMap hashMap = (HashMap) this.zza;
        if (hashMap.containsKey(str)) {
            zzauVar = (zzau) hashMap.get(str);
        } else {
            zzauVar = (zzau) this.zzb;
        }
        return zzauVar.zza(str, unleashContext, arrayList);
    }

    public void zza(zzau zzauVar) {
        Iterator it = zzauVar.zza.iterator();
        while (it.hasNext()) {
            ((HashMap) this.zza).put(Integer.valueOf(((zzbk) it.next()).zzao).toString(), zzauVar);
        }
    }

    public void zza(ArrayList arrayList) {
        OutputStream outputStream = (OutputStream) Maps.getLast(arrayList);
        if (outputStream instanceof zzsm) {
            this.zzb = (zzsm) outputStream;
            this.zza = (OutputStream) arrayList.get(0);
        }
    }

    public zzz(zzacb zzacbVar) {
        this.$r8$classId = 4;
        this.zza = zzacbVar;
    }

    public /* synthetic */ zzz(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.zza = obj;
        this.zzb = obj2;
    }

    public /* synthetic */ zzz(zztp zztpVar) {
        this.$r8$classId = 5;
        this.zzb = zztpVar;
    }
}
