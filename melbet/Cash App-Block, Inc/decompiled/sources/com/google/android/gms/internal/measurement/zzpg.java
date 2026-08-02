package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import android.os.StrictMode;
import android.util.Pair;
import androidx.core.view.NestedScrollingParentHelper;
import androidx.media3.common.util.StuckPlayerDetector;
import androidx.room.TransactorKt;
import androidx.room.util.DBUtil;
import androidx.tracing.Trace;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.util.AndroidSystemCallbacks;
import com.google.common.base.Present;
import com.google.common.base.Supplier;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import com.google.common.collect.RegularImmutableList;
import com.google.common.collect.RegularImmutableSet;
import com.google.common.util.concurrent.AbstractCatchingFuture;
import com.google.common.util.concurrent.AbstractTransformFuture;
import com.google.common.util.concurrent.DirectExecutor;
import com.google.common.util.concurrent.FluentFuture;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ImmediateFuture;
import com.google.common.util.concurrent.MoreExecutors$ScheduledListeningDecorator;
import com.nimbusds.jose.JWECryptoParts;
import com.squareup.wire.GrpcMethod;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class zzpg {
    public static final zzon zza;
    public static final zzxs zzc = new zzxs(3);
    public volatile AndroidSystemCallbacks zzd;
    public final zzlk zze;
    public final String zzf;
    public final String zzg;
    public final boolean zzh;
    public final ImmutableSet zzi;
    public final zzxs zzj;
    public final GrpcMethod zzk;

    static {
        zzox zzoxVar = zzox.zza;
        int i = ImmutableSet.$r8$clinit;
        zza = new zzon(zzoxVar, false, RegularImmutableSet.EMPTY);
    }

    public zzpg(zzlk zzlkVar, zzon zzonVar) {
        this.zze = zzlkVar;
        Context context = zzlkVar.zzh;
        String str = zzonVar.zzd;
        if (str == null) {
            str = (String) zzonVar.zza.apply(context);
            zzonVar.zzd = str;
        }
        this.zzf = str;
        this.zzg = "";
        this.zzh = zzonVar.zzb;
        this.zzi = zzonVar.zzc;
        this.zzd = null;
        this.zzj = new zzxs(4);
        GrpcMethod grpcMethod = new GrpcMethod();
        grpcMethod.requestAdapter = zzlkVar;
        grpcMethod.path = str;
        Context context2 = zzlkVar.zzh;
        Pattern pattern = zzsa.zzc;
        zzlj zzljVar = new zzlj(context2);
        zzljVar.zzb("phenotype");
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 4);
        sb.append("/");
        sb.append(str);
        sb.append(".pb");
        zzljVar.zzc(sb.toString());
        grpcMethod.responseAdapter = zzljVar.zzd();
        this.zzk = grpcMethod;
    }

    public final AndroidSystemCallbacks zzq() {
        AndroidSystemCallbacks androidSystemCallbacks;
        AndroidSystemCallbacks androidSystemCallbacks2 = this.zzd;
        if (androidSystemCallbacks2 != null) {
            return androidSystemCallbacks2;
        }
        synchronized (this) {
            try {
                androidSystemCallbacks = this.zzd;
                if (androidSystemCallbacks == null) {
                    StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
                    try {
                        AndroidSystemCallbacks zza2 = this.zzk.zza();
                        StrictMode.setThreadPolicy(allowThreadDiskWrites);
                        int i = ((NestedScrollingParentHelper) zza2.application).mNestedScrollAxesNonTouch - 2;
                        if (i != 15 && i != 16) {
                            zzlk zzlkVar = this.zze;
                            zzlkVar.zzm.zza();
                            if (this.zzh || this.zzk.zzb() || !((String) zza2.imageLoader).isEmpty()) {
                                zzlkVar.zzg().execute(new Runnable() { // from class: com.google.android.gms.internal.measurement.zzoy
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        AbstractCatchingFuture.AsyncCatchingFuture zzb;
                                        zzpg zzpgVar = zzpg.this;
                                        AndroidSystemCallbacks zzq = zzpgVar.zzq();
                                        String str = (String) zzq.imageLoader;
                                        zzlk zzlkVar2 = zzpgVar.zze;
                                        Supplier supplier = zzlkVar2.zzj;
                                        zzqn zzc2 = zzlkVar2.zzm.zzc();
                                        boolean z = zzc2.zzi;
                                        if (zzc2.zzj) {
                                            if (TransactorKt.stringIsNullOrEmpty(str) && !z) {
                                                ImmediateFuture immediateFuture = ImmediateFuture.NULL;
                                                return;
                                            }
                                            zzmb zzb2 = zzme.zzb();
                                            NestedScrollingParentHelper nestedScrollingParentHelper = (NestedScrollingParentHelper) zzq.application;
                                            int i2 = nestedScrollingParentHelper.mNestedScrollAxesTouch;
                                            zzmc zza3 = zzmd.zza();
                                            zza3.zza$1(i2);
                                            zza3.zzb$2(nestedScrollingParentHelper.mNestedScrollAxesNonTouch);
                                            zzb2.zzb((zzmd) zza3.zzbd());
                                            if (!TransactorKt.stringIsNullOrEmpty(str)) {
                                                zzb2.zza$4(str);
                                            }
                                            if (z) {
                                                zzb2.zzc$3(zzpgVar.zzf);
                                            }
                                            zzb = ((zzmn) supplier.get()).zzc((zzme) zzb2.zzbd());
                                        } else {
                                            if (TransactorKt.stringIsNullOrEmpty(str)) {
                                                ImmediateFuture immediateFuture2 = ImmediateFuture.NULL;
                                                return;
                                            }
                                            zzb = ((zzmn) supplier.get()).zzb(str);
                                        }
                                        AbstractCatchingFuture.createAsync(zzb, zzmk.class, new zzos(zzpgVar, 0), zzlkVar2.zzg());
                                    }
                                });
                                zzlkVar.zzg.zza((zzacr) zza2.activityCallbacks, this.zzi, this.zzf);
                                if (!this.zzg.equals("")) {
                                    final int i2 = 1;
                                    zzlkVar.zzg().execute(new Runnable(this) { // from class: com.google.android.gms.internal.measurement.zzop
                                        public final /* synthetic */ zzpg zza;

                                        {
                                            this.zza = this;
                                        }

                                        /* JADX WARN: Multi-variable type inference failed */
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            zzlk zzlkVar2;
                                            int i3;
                                            zznu zznuVar;
                                            zzte zzteVar;
                                            int i4;
                                            zztw zztwVar;
                                            FluentFuture.TrustedFuture zze;
                                            int i5 = i2;
                                            int i6 = 0;
                                            zzpg zzpgVar = this.zza;
                                            switch (i5) {
                                                case 0:
                                                    zzpgVar.zzr();
                                                    return;
                                                case 1:
                                                    zzlk zzlkVar3 = zzpgVar.zze;
                                                    String str = zzpgVar.zzf;
                                                    zzvb zzvbVar = zzpu.zzb;
                                                    zztw zztwVar2 = zztw.zza;
                                                    Context context = zzlkVar3.zzh;
                                                    Pattern pattern = zzsa.zzc;
                                                    zzlj zzljVar = new zzlj(context);
                                                    zzljVar.zzb("phenotype");
                                                    zzljVar.zzc("all_accounts.pb");
                                                    Uri zzd = zzljVar.zzd();
                                                    if (zzd == null) {
                                                        a$$ExternalSyntheticBUOutline0.m$2("Null uri");
                                                        return;
                                                    }
                                                    zznu zzb = zznu.zzb();
                                                    if (zzb == null) {
                                                        a$$ExternalSyntheticBUOutline0.m$2("Null schema");
                                                        return;
                                                    }
                                                    zzvb zzvbVar2 = zzpu.zzb;
                                                    zzvbVar2.getClass();
                                                    Present present = new Present(zzvbVar2);
                                                    ImmutableList.Itr itr = ImmutableList.EMPTY_ITR;
                                                    RegularImmutableList regularImmutableList = RegularImmutableList.EMPTY;
                                                    zzte zzteVar2 = new zzte(zzd, zzb, present, regularImmutableList);
                                                    JWECryptoParts jWECryptoParts = zzpu.zzd;
                                                    if (jWECryptoParts == null) {
                                                        synchronized (zzpu.zzc) {
                                                            try {
                                                                jWECryptoParts = zzpu.zzd;
                                                                if (jWECryptoParts == null) {
                                                                    HashMap hashMap = new HashMap();
                                                                    MoreExecutors$ScheduledListeningDecorator zzg = zzlkVar3.zzg();
                                                                    zzru zzruVar = (zzru) zzlkVar3.zzl.get();
                                                                    zztx zztxVar = zztx.zza;
                                                                    i3 = 1;
                                                                    zzlkVar2 = zzlkVar3;
                                                                    Trace.checkArgument("There is already a factory registered for the ID %s", "singleproc", !hashMap.containsKey("singleproc"));
                                                                    hashMap.put("singleproc", zztxVar);
                                                                    JWECryptoParts jWECryptoParts2 = new JWECryptoParts();
                                                                    jWECryptoParts2.header = new ConcurrentHashMap();
                                                                    zzg.getClass();
                                                                    jWECryptoParts2.encryptedKey = zzg;
                                                                    zzruVar.getClass();
                                                                    jWECryptoParts2.iv = zzruVar;
                                                                    jWECryptoParts2.authenticationTag = hashMap;
                                                                    Trace.checkArgument(!hashMap.isEmpty());
                                                                    jWECryptoParts2.cipherText = zzml.zza$1;
                                                                    zzpu.zzd = jWECryptoParts2;
                                                                    jWECryptoParts = jWECryptoParts2;
                                                                } else {
                                                                    zzlkVar2 = zzlkVar3;
                                                                    i3 = 1;
                                                                }
                                                            } finally {
                                                            }
                                                        }
                                                    } else {
                                                        zzlkVar2 = zzlkVar3;
                                                        i3 = 1;
                                                    }
                                                    ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) jWECryptoParts.header;
                                                    Pair pair = (Pair) concurrentHashMap.get(zzd);
                                                    if (pair == null) {
                                                        Trace.checkArgument("Uri must be hierarchical: %s", zzd, zzd.isHierarchical());
                                                        String lastPathSegment = zzd.getLastPathSegment();
                                                        if (lastPathSegment == null) {
                                                            lastPathSegment = "";
                                                        }
                                                        int lastIndexOf = lastPathSegment.lastIndexOf(46);
                                                        Trace.checkArgument("Uri extension must be .pb: %s", zzd, (lastIndexOf == -1 ? "" : lastPathSegment.substring(lastIndexOf + 1)).equals("pb"));
                                                        zztx zztxVar2 = (zztx) ((HashMap) jWECryptoParts.authenticationTag).get("singleproc");
                                                        Trace.checkArgument("No XDataStoreVariantFactory registered for ID %s", "singleproc", zztxVar2 != null ? i3 : 0);
                                                        String lastPathSegment2 = zzd.getLastPathSegment();
                                                        String str2 = lastPathSegment2 != null ? lastPathSegment2 : "";
                                                        int lastIndexOf2 = str2.lastIndexOf(46);
                                                        if (lastIndexOf2 != -1) {
                                                            str2 = str2.substring(0, lastIndexOf2);
                                                        }
                                                        AbstractTransformFuture.AsyncTransformFuture transformAsync = Futures.transformAsync(Futures.immediateFuture(zzd), (zzml) jWECryptoParts.cipherText, DirectExecutor.INSTANCE);
                                                        Executor executor = (Executor) jWECryptoParts.encryptedKey;
                                                        zzru zzruVar2 = (zzru) jWECryptoParts.iv;
                                                        zztxVar2.getClass();
                                                        zzvd zzvdVar = new zzvd(zzb, zzadf.zzb());
                                                        String str3 = str2;
                                                        i4 = i3;
                                                        zztwVar = zztwVar2;
                                                        zznuVar = zzb;
                                                        zzteVar = zzteVar2;
                                                        zztp zztpVar = new zztp(new StuckPlayerDetector(str3, Futures.immediateFuture(zzd), zzvdVar, executor, zzruVar2, present, new zztw(12)), transformAsync);
                                                        if (!regularImmutableList.isEmpty()) {
                                                            zzqa zzqaVar = new zzqa(i4, regularImmutableList, executor);
                                                            synchronized (zztpVar.zzg) {
                                                                zztpVar.zzi.add(zzqaVar);
                                                            }
                                                        }
                                                        pair = Pair.create(zztpVar, zzteVar);
                                                        Pair pair2 = (Pair) concurrentHashMap.putIfAbsent(zzd, pair);
                                                        if (pair2 != null) {
                                                            pair = pair2;
                                                        }
                                                    } else {
                                                        zznuVar = zzb;
                                                        zzteVar = zzteVar2;
                                                        i4 = i3;
                                                        zztwVar = zztwVar2;
                                                    }
                                                    zztp zztpVar2 = (zztp) pair.first;
                                                    zzte zzteVar3 = (zzte) pair.second;
                                                    if (zzteVar.equals(zzteVar3)) {
                                                        AbstractTransformFuture.TransformFuture zzb2 = zztpVar2.zzb(new zzow(str, i4), zzlkVar2.zzg());
                                                        zzb2.addListener(new zzot(zzpgVar, zzb2, 0), zzlkVar2.zzg());
                                                        return;
                                                    }
                                                    String lenientFormat = DBUtil.lenientFormat("ProtoDataStoreConfig<%s> doesn't match previous call [uri=%s] [%s]", "zznu", zzd);
                                                    Trace.checkArgument(lenientFormat, "uri", zzd.equals(zzteVar3.zza));
                                                    Trace.checkArgument(lenientFormat, "schema", zznuVar.equals(zzteVar3.zzb));
                                                    Trace.checkArgument(lenientFormat, "handler", present.equals(zzteVar3.zzc));
                                                    ImmutableList immutableList = zzteVar3.zzd;
                                                    regularImmutableList.getClass();
                                                    Trace.checkArgument(lenientFormat, "migrations", Maps.equalsImpl(immutableList, regularImmutableList));
                                                    Object obj = zztwVar;
                                                    Trace.checkArgument(lenientFormat, "variantConfig", obj.equals(obj));
                                                    a$$ExternalSyntheticBUOutline0.m$3(DBUtil.lenientFormat(lenientFormat, "unknown"));
                                                    return;
                                                default:
                                                    zzqe zzqeVar = zzpgVar.zze.zzo;
                                                    boolean z = zzpgVar.zzh;
                                                    zzou zzouVar = zzou.zza;
                                                    zzqm zzqmVar = (zzqm) zzqeVar.zzc.get();
                                                    if (zzqmVar == null && !z) {
                                                        ImmediateFuture immediateFuture = ImmediateFuture.NULL;
                                                        return;
                                                    }
                                                    if ((zzqeVar.zze & 64) == 0) {
                                                        CopyOnWriteArrayList copyOnWriteArrayList = zzqeVar.zzf;
                                                        synchronized (copyOnWriteArrayList) {
                                                            try {
                                                                int i7 = zzqeVar.zze;
                                                                if ((i7 & 64) == 0) {
                                                                    copyOnWriteArrayList.add(zzouVar);
                                                                    zzqeVar.zze = i7 | 64;
                                                                }
                                                            } finally {
                                                            }
                                                        }
                                                    }
                                                    if (zzqeVar.zzh == null) {
                                                        synchronized (zzqeVar.zzg) {
                                                            try {
                                                                if (zzqeVar.zzh == null) {
                                                                    if (zzqmVar == null) {
                                                                        zzqmVar = zzqb.zza;
                                                                    }
                                                                    Context context2 = zzqeVar.zza;
                                                                    if (zzky.zzi(context2)) {
                                                                        zze = ((zzmn) zzqeVar.zzd.get()).zze(new zzqd(zzqeVar, zzqmVar));
                                                                        zzqeVar.zzh = zze;
                                                                    } else {
                                                                        zzpz zzpzVar = zzpz.zza;
                                                                        Supplier supplier = zzqeVar.zzb;
                                                                        zze = Futures.transformAsync(zzky.zzd(context2, Executors.callable(zzpzVar, null), (Executor) supplier.get()), new zzqa(i6, zzqeVar, zzqmVar), (Executor) supplier.get());
                                                                        zzqeVar.zzh = zze;
                                                                    }
                                                                    zze.addListener(new zzpv(zze, 2), (Executor) zzqeVar.zzb.get());
                                                                }
                                                            } finally {
                                                            }
                                                        }
                                                        return;
                                                    }
                                                    return;
                                            }
                                        }
                                    });
                                }
                                if (this.zzk.zzb()) {
                                    final int i3 = 2;
                                    zzlkVar.zzg().execute(new Runnable(this) { // from class: com.google.android.gms.internal.measurement.zzop
                                        public final /* synthetic */ zzpg zza;

                                        {
                                            this.zza = this;
                                        }

                                        /* JADX WARN: Multi-variable type inference failed */
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            zzlk zzlkVar2;
                                            int i32;
                                            zznu zznuVar;
                                            zzte zzteVar;
                                            int i4;
                                            zztw zztwVar;
                                            FluentFuture.TrustedFuture zze;
                                            int i5 = i3;
                                            int i6 = 0;
                                            zzpg zzpgVar = this.zza;
                                            switch (i5) {
                                                case 0:
                                                    zzpgVar.zzr();
                                                    return;
                                                case 1:
                                                    zzlk zzlkVar3 = zzpgVar.zze;
                                                    String str = zzpgVar.zzf;
                                                    zzvb zzvbVar = zzpu.zzb;
                                                    zztw zztwVar2 = zztw.zza;
                                                    Context context = zzlkVar3.zzh;
                                                    Pattern pattern = zzsa.zzc;
                                                    zzlj zzljVar = new zzlj(context);
                                                    zzljVar.zzb("phenotype");
                                                    zzljVar.zzc("all_accounts.pb");
                                                    Uri zzd = zzljVar.zzd();
                                                    if (zzd == null) {
                                                        a$$ExternalSyntheticBUOutline0.m$2("Null uri");
                                                        return;
                                                    }
                                                    zznu zzb = zznu.zzb();
                                                    if (zzb == null) {
                                                        a$$ExternalSyntheticBUOutline0.m$2("Null schema");
                                                        return;
                                                    }
                                                    zzvb zzvbVar2 = zzpu.zzb;
                                                    zzvbVar2.getClass();
                                                    Present present = new Present(zzvbVar2);
                                                    ImmutableList.Itr itr = ImmutableList.EMPTY_ITR;
                                                    RegularImmutableList regularImmutableList = RegularImmutableList.EMPTY;
                                                    zzte zzteVar2 = new zzte(zzd, zzb, present, regularImmutableList);
                                                    JWECryptoParts jWECryptoParts = zzpu.zzd;
                                                    if (jWECryptoParts == null) {
                                                        synchronized (zzpu.zzc) {
                                                            try {
                                                                jWECryptoParts = zzpu.zzd;
                                                                if (jWECryptoParts == null) {
                                                                    HashMap hashMap = new HashMap();
                                                                    MoreExecutors$ScheduledListeningDecorator zzg = zzlkVar3.zzg();
                                                                    zzru zzruVar = (zzru) zzlkVar3.zzl.get();
                                                                    zztx zztxVar = zztx.zza;
                                                                    i32 = 1;
                                                                    zzlkVar2 = zzlkVar3;
                                                                    Trace.checkArgument("There is already a factory registered for the ID %s", "singleproc", !hashMap.containsKey("singleproc"));
                                                                    hashMap.put("singleproc", zztxVar);
                                                                    JWECryptoParts jWECryptoParts2 = new JWECryptoParts();
                                                                    jWECryptoParts2.header = new ConcurrentHashMap();
                                                                    zzg.getClass();
                                                                    jWECryptoParts2.encryptedKey = zzg;
                                                                    zzruVar.getClass();
                                                                    jWECryptoParts2.iv = zzruVar;
                                                                    jWECryptoParts2.authenticationTag = hashMap;
                                                                    Trace.checkArgument(!hashMap.isEmpty());
                                                                    jWECryptoParts2.cipherText = zzml.zza$1;
                                                                    zzpu.zzd = jWECryptoParts2;
                                                                    jWECryptoParts = jWECryptoParts2;
                                                                } else {
                                                                    zzlkVar2 = zzlkVar3;
                                                                    i32 = 1;
                                                                }
                                                            } finally {
                                                            }
                                                        }
                                                    } else {
                                                        zzlkVar2 = zzlkVar3;
                                                        i32 = 1;
                                                    }
                                                    ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) jWECryptoParts.header;
                                                    Pair pair = (Pair) concurrentHashMap.get(zzd);
                                                    if (pair == null) {
                                                        Trace.checkArgument("Uri must be hierarchical: %s", zzd, zzd.isHierarchical());
                                                        String lastPathSegment = zzd.getLastPathSegment();
                                                        if (lastPathSegment == null) {
                                                            lastPathSegment = "";
                                                        }
                                                        int lastIndexOf = lastPathSegment.lastIndexOf(46);
                                                        Trace.checkArgument("Uri extension must be .pb: %s", zzd, (lastIndexOf == -1 ? "" : lastPathSegment.substring(lastIndexOf + 1)).equals("pb"));
                                                        zztx zztxVar2 = (zztx) ((HashMap) jWECryptoParts.authenticationTag).get("singleproc");
                                                        Trace.checkArgument("No XDataStoreVariantFactory registered for ID %s", "singleproc", zztxVar2 != null ? i32 : 0);
                                                        String lastPathSegment2 = zzd.getLastPathSegment();
                                                        String str2 = lastPathSegment2 != null ? lastPathSegment2 : "";
                                                        int lastIndexOf2 = str2.lastIndexOf(46);
                                                        if (lastIndexOf2 != -1) {
                                                            str2 = str2.substring(0, lastIndexOf2);
                                                        }
                                                        AbstractTransformFuture.AsyncTransformFuture transformAsync = Futures.transformAsync(Futures.immediateFuture(zzd), (zzml) jWECryptoParts.cipherText, DirectExecutor.INSTANCE);
                                                        Executor executor = (Executor) jWECryptoParts.encryptedKey;
                                                        zzru zzruVar2 = (zzru) jWECryptoParts.iv;
                                                        zztxVar2.getClass();
                                                        zzvd zzvdVar = new zzvd(zzb, zzadf.zzb());
                                                        String str3 = str2;
                                                        i4 = i32;
                                                        zztwVar = zztwVar2;
                                                        zznuVar = zzb;
                                                        zzteVar = zzteVar2;
                                                        zztp zztpVar = new zztp(new StuckPlayerDetector(str3, Futures.immediateFuture(zzd), zzvdVar, executor, zzruVar2, present, new zztw(12)), transformAsync);
                                                        if (!regularImmutableList.isEmpty()) {
                                                            zzqa zzqaVar = new zzqa(i4, regularImmutableList, executor);
                                                            synchronized (zztpVar.zzg) {
                                                                zztpVar.zzi.add(zzqaVar);
                                                            }
                                                        }
                                                        pair = Pair.create(zztpVar, zzteVar);
                                                        Pair pair2 = (Pair) concurrentHashMap.putIfAbsent(zzd, pair);
                                                        if (pair2 != null) {
                                                            pair = pair2;
                                                        }
                                                    } else {
                                                        zznuVar = zzb;
                                                        zzteVar = zzteVar2;
                                                        i4 = i32;
                                                        zztwVar = zztwVar2;
                                                    }
                                                    zztp zztpVar2 = (zztp) pair.first;
                                                    zzte zzteVar3 = (zzte) pair.second;
                                                    if (zzteVar.equals(zzteVar3)) {
                                                        AbstractTransformFuture.TransformFuture zzb2 = zztpVar2.zzb(new zzow(str, i4), zzlkVar2.zzg());
                                                        zzb2.addListener(new zzot(zzpgVar, zzb2, 0), zzlkVar2.zzg());
                                                        return;
                                                    }
                                                    String lenientFormat = DBUtil.lenientFormat("ProtoDataStoreConfig<%s> doesn't match previous call [uri=%s] [%s]", "zznu", zzd);
                                                    Trace.checkArgument(lenientFormat, "uri", zzd.equals(zzteVar3.zza));
                                                    Trace.checkArgument(lenientFormat, "schema", zznuVar.equals(zzteVar3.zzb));
                                                    Trace.checkArgument(lenientFormat, "handler", present.equals(zzteVar3.zzc));
                                                    ImmutableList immutableList = zzteVar3.zzd;
                                                    regularImmutableList.getClass();
                                                    Trace.checkArgument(lenientFormat, "migrations", Maps.equalsImpl(immutableList, regularImmutableList));
                                                    Object obj = zztwVar;
                                                    Trace.checkArgument(lenientFormat, "variantConfig", obj.equals(obj));
                                                    a$$ExternalSyntheticBUOutline0.m$3(DBUtil.lenientFormat(lenientFormat, "unknown"));
                                                    return;
                                                default:
                                                    zzqe zzqeVar = zzpgVar.zze.zzo;
                                                    boolean z = zzpgVar.zzh;
                                                    zzou zzouVar = zzou.zza;
                                                    zzqm zzqmVar = (zzqm) zzqeVar.zzc.get();
                                                    if (zzqmVar == null && !z) {
                                                        ImmediateFuture immediateFuture = ImmediateFuture.NULL;
                                                        return;
                                                    }
                                                    if ((zzqeVar.zze & 64) == 0) {
                                                        CopyOnWriteArrayList copyOnWriteArrayList = zzqeVar.zzf;
                                                        synchronized (copyOnWriteArrayList) {
                                                            try {
                                                                int i7 = zzqeVar.zze;
                                                                if ((i7 & 64) == 0) {
                                                                    copyOnWriteArrayList.add(zzouVar);
                                                                    zzqeVar.zze = i7 | 64;
                                                                }
                                                            } finally {
                                                            }
                                                        }
                                                    }
                                                    if (zzqeVar.zzh == null) {
                                                        synchronized (zzqeVar.zzg) {
                                                            try {
                                                                if (zzqeVar.zzh == null) {
                                                                    if (zzqmVar == null) {
                                                                        zzqmVar = zzqb.zza;
                                                                    }
                                                                    Context context2 = zzqeVar.zza;
                                                                    if (zzky.zzi(context2)) {
                                                                        zze = ((zzmn) zzqeVar.zzd.get()).zze(new zzqd(zzqeVar, zzqmVar));
                                                                        zzqeVar.zzh = zze;
                                                                    } else {
                                                                        zzpz zzpzVar = zzpz.zza;
                                                                        Supplier supplier = zzqeVar.zzb;
                                                                        zze = Futures.transformAsync(zzky.zzd(context2, Executors.callable(zzpzVar, null), (Executor) supplier.get()), new zzqa(i6, zzqeVar, zzqmVar), (Executor) supplier.get());
                                                                        zzqeVar.zzh = zze;
                                                                    }
                                                                    zze.addListener(new zzpv(zze, 2), (Executor) zzqeVar.zzb.get());
                                                                }
                                                            } finally {
                                                            }
                                                        }
                                                        return;
                                                    }
                                                    return;
                                            }
                                        }
                                    });
                                }
                            } else {
                                final int i4 = 0;
                                zzlkVar.zzg().execute(new Runnable(this) { // from class: com.google.android.gms.internal.measurement.zzop
                                    public final /* synthetic */ zzpg zza;

                                    {
                                        this.zza = this;
                                    }

                                    /* JADX WARN: Multi-variable type inference failed */
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        zzlk zzlkVar2;
                                        int i32;
                                        zznu zznuVar;
                                        zzte zzteVar;
                                        int i42;
                                        zztw zztwVar;
                                        FluentFuture.TrustedFuture zze;
                                        int i5 = i4;
                                        int i6 = 0;
                                        zzpg zzpgVar = this.zza;
                                        switch (i5) {
                                            case 0:
                                                zzpgVar.zzr();
                                                return;
                                            case 1:
                                                zzlk zzlkVar3 = zzpgVar.zze;
                                                String str = zzpgVar.zzf;
                                                zzvb zzvbVar = zzpu.zzb;
                                                zztw zztwVar2 = zztw.zza;
                                                Context context = zzlkVar3.zzh;
                                                Pattern pattern = zzsa.zzc;
                                                zzlj zzljVar = new zzlj(context);
                                                zzljVar.zzb("phenotype");
                                                zzljVar.zzc("all_accounts.pb");
                                                Uri zzd = zzljVar.zzd();
                                                if (zzd == null) {
                                                    a$$ExternalSyntheticBUOutline0.m$2("Null uri");
                                                    return;
                                                }
                                                zznu zzb = zznu.zzb();
                                                if (zzb == null) {
                                                    a$$ExternalSyntheticBUOutline0.m$2("Null schema");
                                                    return;
                                                }
                                                zzvb zzvbVar2 = zzpu.zzb;
                                                zzvbVar2.getClass();
                                                Present present = new Present(zzvbVar2);
                                                ImmutableList.Itr itr = ImmutableList.EMPTY_ITR;
                                                RegularImmutableList regularImmutableList = RegularImmutableList.EMPTY;
                                                zzte zzteVar2 = new zzte(zzd, zzb, present, regularImmutableList);
                                                JWECryptoParts jWECryptoParts = zzpu.zzd;
                                                if (jWECryptoParts == null) {
                                                    synchronized (zzpu.zzc) {
                                                        try {
                                                            jWECryptoParts = zzpu.zzd;
                                                            if (jWECryptoParts == null) {
                                                                HashMap hashMap = new HashMap();
                                                                MoreExecutors$ScheduledListeningDecorator zzg = zzlkVar3.zzg();
                                                                zzru zzruVar = (zzru) zzlkVar3.zzl.get();
                                                                zztx zztxVar = zztx.zza;
                                                                i32 = 1;
                                                                zzlkVar2 = zzlkVar3;
                                                                Trace.checkArgument("There is already a factory registered for the ID %s", "singleproc", !hashMap.containsKey("singleproc"));
                                                                hashMap.put("singleproc", zztxVar);
                                                                JWECryptoParts jWECryptoParts2 = new JWECryptoParts();
                                                                jWECryptoParts2.header = new ConcurrentHashMap();
                                                                zzg.getClass();
                                                                jWECryptoParts2.encryptedKey = zzg;
                                                                zzruVar.getClass();
                                                                jWECryptoParts2.iv = zzruVar;
                                                                jWECryptoParts2.authenticationTag = hashMap;
                                                                Trace.checkArgument(!hashMap.isEmpty());
                                                                jWECryptoParts2.cipherText = zzml.zza$1;
                                                                zzpu.zzd = jWECryptoParts2;
                                                                jWECryptoParts = jWECryptoParts2;
                                                            } else {
                                                                zzlkVar2 = zzlkVar3;
                                                                i32 = 1;
                                                            }
                                                        } finally {
                                                        }
                                                    }
                                                } else {
                                                    zzlkVar2 = zzlkVar3;
                                                    i32 = 1;
                                                }
                                                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) jWECryptoParts.header;
                                                Pair pair = (Pair) concurrentHashMap.get(zzd);
                                                if (pair == null) {
                                                    Trace.checkArgument("Uri must be hierarchical: %s", zzd, zzd.isHierarchical());
                                                    String lastPathSegment = zzd.getLastPathSegment();
                                                    if (lastPathSegment == null) {
                                                        lastPathSegment = "";
                                                    }
                                                    int lastIndexOf = lastPathSegment.lastIndexOf(46);
                                                    Trace.checkArgument("Uri extension must be .pb: %s", zzd, (lastIndexOf == -1 ? "" : lastPathSegment.substring(lastIndexOf + 1)).equals("pb"));
                                                    zztx zztxVar2 = (zztx) ((HashMap) jWECryptoParts.authenticationTag).get("singleproc");
                                                    Trace.checkArgument("No XDataStoreVariantFactory registered for ID %s", "singleproc", zztxVar2 != null ? i32 : 0);
                                                    String lastPathSegment2 = zzd.getLastPathSegment();
                                                    String str2 = lastPathSegment2 != null ? lastPathSegment2 : "";
                                                    int lastIndexOf2 = str2.lastIndexOf(46);
                                                    if (lastIndexOf2 != -1) {
                                                        str2 = str2.substring(0, lastIndexOf2);
                                                    }
                                                    AbstractTransformFuture.AsyncTransformFuture transformAsync = Futures.transformAsync(Futures.immediateFuture(zzd), (zzml) jWECryptoParts.cipherText, DirectExecutor.INSTANCE);
                                                    Executor executor = (Executor) jWECryptoParts.encryptedKey;
                                                    zzru zzruVar2 = (zzru) jWECryptoParts.iv;
                                                    zztxVar2.getClass();
                                                    zzvd zzvdVar = new zzvd(zzb, zzadf.zzb());
                                                    String str3 = str2;
                                                    i42 = i32;
                                                    zztwVar = zztwVar2;
                                                    zznuVar = zzb;
                                                    zzteVar = zzteVar2;
                                                    zztp zztpVar = new zztp(new StuckPlayerDetector(str3, Futures.immediateFuture(zzd), zzvdVar, executor, zzruVar2, present, new zztw(12)), transformAsync);
                                                    if (!regularImmutableList.isEmpty()) {
                                                        zzqa zzqaVar = new zzqa(i42, regularImmutableList, executor);
                                                        synchronized (zztpVar.zzg) {
                                                            zztpVar.zzi.add(zzqaVar);
                                                        }
                                                    }
                                                    pair = Pair.create(zztpVar, zzteVar);
                                                    Pair pair2 = (Pair) concurrentHashMap.putIfAbsent(zzd, pair);
                                                    if (pair2 != null) {
                                                        pair = pair2;
                                                    }
                                                } else {
                                                    zznuVar = zzb;
                                                    zzteVar = zzteVar2;
                                                    i42 = i32;
                                                    zztwVar = zztwVar2;
                                                }
                                                zztp zztpVar2 = (zztp) pair.first;
                                                zzte zzteVar3 = (zzte) pair.second;
                                                if (zzteVar.equals(zzteVar3)) {
                                                    AbstractTransformFuture.TransformFuture zzb2 = zztpVar2.zzb(new zzow(str, i42), zzlkVar2.zzg());
                                                    zzb2.addListener(new zzot(zzpgVar, zzb2, 0), zzlkVar2.zzg());
                                                    return;
                                                }
                                                String lenientFormat = DBUtil.lenientFormat("ProtoDataStoreConfig<%s> doesn't match previous call [uri=%s] [%s]", "zznu", zzd);
                                                Trace.checkArgument(lenientFormat, "uri", zzd.equals(zzteVar3.zza));
                                                Trace.checkArgument(lenientFormat, "schema", zznuVar.equals(zzteVar3.zzb));
                                                Trace.checkArgument(lenientFormat, "handler", present.equals(zzteVar3.zzc));
                                                ImmutableList immutableList = zzteVar3.zzd;
                                                regularImmutableList.getClass();
                                                Trace.checkArgument(lenientFormat, "migrations", Maps.equalsImpl(immutableList, regularImmutableList));
                                                Object obj = zztwVar;
                                                Trace.checkArgument(lenientFormat, "variantConfig", obj.equals(obj));
                                                a$$ExternalSyntheticBUOutline0.m$3(DBUtil.lenientFormat(lenientFormat, "unknown"));
                                                return;
                                            default:
                                                zzqe zzqeVar = zzpgVar.zze.zzo;
                                                boolean z = zzpgVar.zzh;
                                                zzou zzouVar = zzou.zza;
                                                zzqm zzqmVar = (zzqm) zzqeVar.zzc.get();
                                                if (zzqmVar == null && !z) {
                                                    ImmediateFuture immediateFuture = ImmediateFuture.NULL;
                                                    return;
                                                }
                                                if ((zzqeVar.zze & 64) == 0) {
                                                    CopyOnWriteArrayList copyOnWriteArrayList = zzqeVar.zzf;
                                                    synchronized (copyOnWriteArrayList) {
                                                        try {
                                                            int i7 = zzqeVar.zze;
                                                            if ((i7 & 64) == 0) {
                                                                copyOnWriteArrayList.add(zzouVar);
                                                                zzqeVar.zze = i7 | 64;
                                                            }
                                                        } finally {
                                                        }
                                                    }
                                                }
                                                if (zzqeVar.zzh == null) {
                                                    synchronized (zzqeVar.zzg) {
                                                        try {
                                                            if (zzqeVar.zzh == null) {
                                                                if (zzqmVar == null) {
                                                                    zzqmVar = zzqb.zza;
                                                                }
                                                                Context context2 = zzqeVar.zza;
                                                                if (zzky.zzi(context2)) {
                                                                    zze = ((zzmn) zzqeVar.zzd.get()).zze(new zzqd(zzqeVar, zzqmVar));
                                                                    zzqeVar.zzh = zze;
                                                                } else {
                                                                    zzpz zzpzVar = zzpz.zza;
                                                                    Supplier supplier = zzqeVar.zzb;
                                                                    zze = Futures.transformAsync(zzky.zzd(context2, Executors.callable(zzpzVar, null), (Executor) supplier.get()), new zzqa(i6, zzqeVar, zzqmVar), (Executor) supplier.get());
                                                                    zzqeVar.zzh = zze;
                                                                }
                                                                zze.addListener(new zzpv(zze, 2), (Executor) zzqeVar.zzb.get());
                                                            }
                                                        } finally {
                                                        }
                                                    }
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                androidSystemCallbacks = new AndroidSystemCallbacks(zzqv.zzi(), (NestedScrollingParentHelper) zza2.application);
                                if (this.zzh || ((NestedScrollingParentHelper) androidSystemCallbacks.application).mNestedScrollAxesNonTouch != 17) {
                                    this.zzd = androidSystemCallbacks;
                                }
                            }
                        }
                        androidSystemCallbacks = zza2;
                        if (this.zzh) {
                        }
                        this.zzd = androidSystemCallbacks;
                    } catch (Throwable th) {
                        StrictMode.setThreadPolicy(allowThreadDiskWrites);
                        throw th;
                    }
                }
            } finally {
            }
        }
        return androidSystemCallbacks;
    }

    public final void zzr() {
        GrpcMethod grpcMethod = this.zzk;
        zzlk zzlkVar = (zzlk) grpcMethod.requestAdapter;
        AbstractTransformFuture.TransformFuture transform = Futures.transform(((zzmn) zzlkVar.zzj.get()).zza((String) grpcMethod.path), zzqp.zza, zzlkVar.zzg());
        int i = 1;
        zzos zzosVar = new zzos(grpcMethod, i);
        zzlk zzlkVar2 = this.zze;
        Futures.transformAsync(transform, zzosVar, zzlkVar2.zzg()).addListener(new zzot(this, transform, i), zzlkVar2.zzg());
    }
}
