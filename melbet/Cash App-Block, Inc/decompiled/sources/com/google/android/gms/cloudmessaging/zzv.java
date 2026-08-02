package com.google.android.gms.cloudmessaging;

import android.content.Context;
import android.os.Bundle;
import android.os.HandlerThread;
import android.util.Log;
import androidx.camera.camera2.adapter.ZslControlImpl$$ExternalSyntheticLambda1;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.impl.Timebase;
import androidx.camera.video.AudioSpec;
import androidx.camera.video.internal.audio.AutoValue_AudioSettings;
import androidx.camera.video.internal.config.AudioConfigUtil;
import androidx.core.util.Supplier;
import androidx.lifecycle.SavedStateHandle;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.tracing.Trace;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.internal.measurement.zzacb;
import com.google.android.gms.internal.measurement.zzml;
import com.google.android.gms.internal.measurement.zzqa;
import com.google.android.gms.internal.measurement.zzvy;
import com.google.android.gms.internal.measurement.zzxa;
import com.google.android.gms.tasks.zzw;
import com.google.android.libraries.places.internal.zzche;
import com.google.android.libraries.places.internal.zzchy;
import com.google.android.libraries.places.internal.zzcij;
import com.google.android.libraries.places.internal.zzcil;
import com.google.android.libraries.places.internal.zzclo;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.MaterialDatePicker;
import com.google.android.material.datepicker.Month;
import com.google.android.material.datepicker.SingleDateSelector;
import com.google.android.material.datepicker.UtcDates;
import com.google.common.util.concurrent.AsyncCallable;
import com.google.common.util.concurrent.DirectExecutor;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.squareup.cash.R;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.workflow1.internal.SubtreeManager;
import com.withpersona.sdk2.inquiry.internal.fallbackmode.ApiController;
import com.withpersona.sdk2.inquiry.internal.fallbackmode.FallbackException;
import com.withpersona.sdk2.inquiry.internal.fallbackmode.RealFallbackModeManager$transition$1;
import com.withpersona.sdk2.inquiry.internal.fallbackmode.RealFallbackModeManager$transitionBack$1;
import com.withpersona.sdk2.inquiry.internal.fallbackmode.StaticTemplateSession;
import com.withpersona.sdk2.inquiry.internal.fallbackmode.StaticTemplateSession_Factory_Impl;
import com.withpersona.sdk2.inquiry.internal.network.InquiryAttributes;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.Result;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.StructureKind;
import kotlinx.serialization.json.JsonConfiguration;
import kotlinx.serialization.json.internal.JsonPath$Tombstone;
import okhttp3.RequestBody;
import okhttp3.RequestBody$Companion$toRequestBody$3;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.json.JSONArray;
import org.json.JSONObject;
import papa.AppUpdateData;
import retrofit2.Response;
import utils.StringUtilsKt;

/* loaded from: classes4.dex */
public class zzv implements Supplier, AsyncCallable, ApiController {
    public static zzv zza;
    public final /* synthetic */ int $r8$classId;
    public final Object zzb;
    public Object zzc;
    public Object zzd;
    public int zze;

    public zzv(JsonConfiguration jsonConfiguration) {
        this.$r8$classId = 8;
        this.zzb = jsonConfiguration;
        this.zzc = new Object[8];
        int[] iArr = new int[8];
        for (int i = 0; i < 8; i++) {
            iArr[i] = -1;
        }
        this.zzd = iArr;
        this.zze = -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x006c, code lost:
    
        if (r2.compareTo(r3.end) <= 0) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MaterialDatePicker build() {
        Month month;
        SingleDateSelector singleDateSelector = (SingleDateSelector) this.zzb;
        if (((CalendarConstraints) this.zzc) == null) {
            this.zzc = new CalendarConstraints.Builder().build();
        }
        if (this.zze == 0) {
            this.zze = R.string.mtrl_picker_date_header_title;
        }
        Long l = (Long) this.zzd;
        if (l != null) {
            singleDateSelector.selectedItem = Long.valueOf(UtcDates.canonicalYearMonthDay(l.longValue()));
        }
        CalendarConstraints calendarConstraints = (CalendarConstraints) this.zzc;
        if (calendarConstraints.openAt == null) {
            if (!singleDateSelector.getSelectedDays().isEmpty()) {
                month = Month.create(((Long) singleDateSelector.getSelectedDays().iterator().next()).longValue());
                CalendarConstraints calendarConstraints2 = (CalendarConstraints) this.zzc;
                if (month.compareTo(calendarConstraints2.start) >= 0) {
                }
            }
            month = new Month(UtcDates.getTodayCalendar());
            CalendarConstraints calendarConstraints3 = (CalendarConstraints) this.zzc;
            if (month.compareTo(calendarConstraints3.start) < 0 || month.compareTo(calendarConstraints3.end) > 0) {
                month = ((CalendarConstraints) this.zzc).start;
            }
            calendarConstraints.openAt = month;
        }
        MaterialDatePicker materialDatePicker = new MaterialDatePicker();
        Bundle bundle = new Bundle();
        bundle.putInt("OVERRIDE_THEME_RES_ID", 0);
        bundle.putParcelable("DATE_SELECTOR_KEY", singleDateSelector);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", (CalendarConstraints) this.zzc);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.zze);
        bundle.putCharSequence("TITLE_TEXT_KEY", null);
        bundle.putInt("INPUT_MODE_KEY", 0);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", 0);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", null);
        bundle.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", 0);
        bundle.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", null);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", 0);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", null);
        bundle.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", 0);
        bundle.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", null);
        materialDatePicker.setArguments(bundle);
        return materialDatePicker;
    }

    @Override // com.google.common.util.concurrent.AsyncCallable
    public ListenableFuture call() {
        zzqa zzqaVar = (zzqa) this.zzb;
        zzacb zzacbVar = (zzacb) this.zzc;
        int i = this.zze;
        ArrayList arrayList = (ArrayList) this.zzd;
        ListenableFuture immediateFuture = Futures.immediateFuture(zzacbVar);
        for (int i2 = 0; i2 < i; i2++) {
            if (((Boolean) Futures.getDone((Future) arrayList.get(i2))).booleanValue()) {
                if (((List) zzqaVar.zza).get(i2) != null) {
                    a$$ExternalSyntheticBUOutline0.m$1();
                    return null;
                }
                zzml zzmlVar = new zzml(1);
                int i3 = zzxa.$r8$clinit;
                immediateFuture = Futures.transformAsync(immediateFuture, new zzqa(4, zzvy.zzb(), zzmlVar), DirectExecutor.INSTANCE);
            }
        }
        return immediateFuture;
    }

    @Override // com.withpersona.sdk2.inquiry.internal.fallbackmode.ApiController
    /* renamed from: createSession-gIAlu-s, reason: not valid java name */
    public Object mo1999createSessiongIAlus(InquiryAttributes inquiryAttributes, Continuation continuation) {
        String jSONArray;
        ArrayList arrayList;
        try {
            InputStream openRawResource = ((Context) this.zzb).getResources().openRawResource(this.zze);
            openRawResource.getClass();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(openRawResource, Charsets.UTF_8), PKIFailureInfo.certRevoked);
            try {
                String readText = AppUpdateData.readText(bufferedReader);
                bufferedReader.close();
                JSONArray optJSONArray = new JSONObject(readText).optJSONArray("steps");
                if (optJSONArray == null || (jSONArray = optJSONArray.toString()) == null) {
                    Result.Companion companion = Result.Companion;
                    return new Result.Failure(new FallbackException("Failed to open resource as static template"));
                }
                List list = (List) ((Moshi) this.zzc).adapter(Types.newParameterizedType(List.class, NextStep.class)).fromJson(jSONArray);
                if (list != null) {
                    List list2 = list;
                    arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList.add((NextStep) it.next());
                    }
                } else {
                    arrayList = null;
                }
                if (arrayList == null || arrayList.isEmpty()) {
                    Result.Companion companion2 = Result.Companion;
                    return new Result.Failure(new FallbackException("Expected steps to contain at least one step"));
                }
                Result.Companion companion3 = Result.Companion;
                return new StaticTemplateSession(arrayList, Boxes$$ExternalSyntheticOutline1.m(), (SavedStateHandle) ((StaticTemplateSession_Factory_Impl) this.zzd).delegateFactory.savedStateHandleProvider.get());
            } finally {
            }
        } catch (Exception unused) {
            Result.Companion companion4 = Result.Companion;
            return new Result.Failure(new FallbackException("Failed to open resource as static template. Resource not found."));
        }
    }

    public Object dequeue() {
        Object removeLast;
        synchronized (this.zzc) {
            removeLast = ((ArrayDeque) this.zzb).removeLast();
        }
        return removeLast;
    }

    public void enqueue(Object obj) {
        Object dequeue;
        synchronized (this.zzc) {
            try {
                dequeue = ((ArrayDeque) this.zzb).size() >= this.zze ? dequeue() : null;
                ((ArrayDeque) this.zzb).addFirst(obj);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (((ZslControlImpl$$ExternalSyntheticLambda1) this.zzd) == null || dequeue == null) {
            return;
        }
        ((ImageProxy) dequeue).close();
    }

    @Override // androidx.core.util.Supplier
    public Object get() {
        ((AudioSpec) this.zzc).getClass();
        StringUtilsKt.d("AudioEncCfgDefaultRslvr", "Using fallback AUDIO bitrate");
        AutoValue_AudioSettings autoValue_AudioSettings = (AutoValue_AudioSettings) this.zzd;
        int i = autoValue_AudioSettings.channelCount;
        int i2 = autoValue_AudioSettings.encodeSampleRate;
        int scaleBitrate = AudioConfigUtil.scaleBitrate(156000, i, 2, i2, 48000);
        SubtreeManager subtreeManager = new SubtreeManager();
        subtreeManager.contextForChildren = -1;
        String str = (String) this.zzb;
        if (str == null) {
            a$$ExternalSyntheticBUOutline0.m$2("Null mimeType");
            return null;
        }
        subtreeManager.snapshotCache = str;
        subtreeManager.contextForChildren = Integer.valueOf(this.zze);
        subtreeManager.emitActionToParent = Timebase.UPTIME;
        subtreeManager.children = Integer.valueOf(i);
        subtreeManager.interceptor = Integer.valueOf(autoValue_AudioSettings.captureSampleRate);
        subtreeManager.idCounter = Integer.valueOf(i2);
        subtreeManager.workflowSession = Integer.valueOf(scaleBitrate);
        return subtreeManager.m4004build();
    }

    public String getPath() {
        StringBuilder sb = new StringBuilder("$");
        int i = this.zze + 1;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = ((Object[]) this.zzc)[i2];
            if (obj instanceof SerialDescriptor) {
                SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
                boolean areEqual = Intrinsics.areEqual(serialDescriptor.getKind(), StructureKind.MAP.INSTANCE$1);
                int[] iArr = (int[]) this.zzd;
                if (!areEqual) {
                    int i3 = iArr[i2];
                    if (i3 >= 0) {
                        sb.append(".");
                        sb.append(serialDescriptor.getElementName(i3));
                    }
                } else if (iArr[i2] != -1) {
                    sb.append("[");
                    sb.append(((int[]) this.zzd)[i2]);
                    sb.append("]");
                }
            } else if (obj == JsonPath$Tombstone.INSTANCE$1) {
                sb.append("[<debug info disabled>]");
            } else if (obj != JsonPath$Tombstone.INSTANCE) {
                sb.append("['");
                sb.append(obj);
                sb.append("']");
            }
        }
        return sb.toString();
    }

    public boolean isEmpty() {
        boolean isEmpty;
        synchronized (this.zzc) {
            isEmpty = ((ArrayDeque) this.zzb).isEmpty();
        }
        return isEmpty;
    }

    public void releaseLooper() {
        HandlerThread handlerThread;
        synchronized (this.zzb) {
            try {
                Trace.checkState(this.zze > 0);
                int i = this.zze - 1;
                this.zze = i;
                if (i == 0 && (handlerThread = (HandlerThread) this.zzd) != null) {
                    handlerThread.quit();
                    this.zzd = null;
                    this.zzc = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void resize() {
        int i = this.zze * 2;
        this.zzc = Arrays.copyOf((Object[]) this.zzc, i);
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = -1;
        }
        ArraysKt___ArraysJvmKt.copyInto$default(0, (int[]) this.zzd, 0, 14, iArr);
        this.zzd = iArr;
    }

    public String toString() {
        switch (this.$r8$classId) {
            case 8:
                return getPath();
            default:
                return super.toString();
        }
    }

    @Override // com.withpersona.sdk2.inquiry.internal.fallbackmode.ApiController
    public Object transitionBack(String str, RequestBody$Companion$toRequestBody$3 requestBody$Companion$toRequestBody$3, RealFallbackModeManager$transitionBack$1 realFallbackModeManager$transitionBack$1) {
        return Response.success(null);
    }

    @Override // com.withpersona.sdk2.inquiry.internal.fallbackmode.ApiController
    public Object transitionWithRequestBody(String str, RequestBody requestBody, RealFallbackModeManager$transition$1 realFallbackModeManager$transition$1) {
        return Response.success(null);
    }

    public boolean zza(int i) {
        if (i < 0) {
            a$$ExternalSyntheticBUOutline0.m$3(Boxes$$ExternalSyntheticOutline1.m(i, "Invalid initial window size: ", new StringBuilder(String.valueOf(i).length() + 29)));
            return false;
        }
        int i2 = i - this.zze;
        this.zze = i;
        for (zzcij zzcijVar : ((zzchy) this.zzb).zzn()) {
            zzcijVar.zzf(i2);
        }
        return i2 > 0;
    }

    public void zzb(zzcij zzcijVar, int i) {
        if (zzcijVar == null) {
            ((zzcij) this.zzd).zzf(i);
            zzf();
            return;
        }
        zzcijVar.zzf(i);
        zzcil zzcilVar = new zzcil();
        zzcijVar.zzi(Math.min(zzcijVar.zzd, ((zzcij) zzcijVar.zza.zzd).zzd), zzcilVar);
        if (zzcilVar.zza > 0) {
            try {
                ((zzche) this.zzc).zze();
            } catch (IOException e) {
                a$$ExternalSyntheticBUOutline0.m((Throwable) e);
            }
        }
    }

    public void zzc(boolean z, zzcij zzcijVar, zzclo zzcloVar, boolean z2) {
        Trace.checkNotNull(zzcloVar, "source");
        int min = Math.min(zzcijVar.zzd, ((zzcij) zzcijVar.zza.zzd).zzd);
        zzclo zzcloVar2 = zzcijVar.zzb;
        boolean z3 = zzcloVar2.zzb > 0;
        int i = (int) zzcloVar.zzb;
        if (z3 || min < i) {
            if (!z3 && min > 0) {
                zzcijVar.zzj(min, zzcloVar, false);
            }
            zzcloVar2.zzc(zzcloVar, (int) zzcloVar.zzb);
            zzcijVar.zzg = z | zzcijVar.zzg;
        } else {
            zzcijVar.zzj(i, zzcloVar, z);
        }
        if (z2) {
            try {
                ((zzche) this.zzc).zze();
            } catch (IOException e) {
                a$$ExternalSyntheticBUOutline0.m((Throwable) e);
            }
        }
    }

    public zzw zzd(int i, Bundle bundle) {
        int i2;
        synchronized (this) {
            i2 = this.zze;
            this.zze = i2 + 1;
        }
        return zzg(new zzr(i2, i, bundle, 1));
    }

    /*  JADX ERROR: JadxOverflowException in pass: LoopRegionVisitor
        jadx.core.utils.exceptions.JadxOverflowException: LoopRegionVisitor.assignOnlyInLoop endless recursion
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public void zzf() {
        /*
            r13 = this;
            java.lang.Object r0 = r13.zzb
            com.google.android.libraries.places.internal.zzchy r0 = (com.google.android.libraries.places.internal.zzchy) r0
            com.google.android.libraries.places.internal.zzcij[] r1 = r0.zzn()
            java.util.List r2 = java.util.Arrays.asList(r1)
            java.util.Collections.shuffle(r2)
            int r2 = r1.length
            java.lang.Object r3 = r13.zzd
            com.google.android.libraries.places.internal.zzcij r3 = (com.google.android.libraries.places.internal.zzcij) r3
            int r3 = r3.zzd
        L16:
            r4 = 0
            if (r2 <= 0) goto L6e
            if (r3 <= 0) goto L6e
            float r5 = (float) r3
            float r6 = (float) r2
            float r5 = r5 / r6
            double r5 = (double) r5
            double r5 = java.lang.Math.ceil(r5)
            int r5 = (int) r5
            r6 = r3
            r3 = r4
            r7 = r3
        L27:
            if (r7 >= r2) goto L6b
            if (r6 <= 0) goto L6b
            r8 = r1[r7]
            com.google.android.libraries.places.internal.zzclo r9 = r8.zzb
            int r10 = r8.zzd
            long r11 = r9.zzb
            int r9 = (int) r11
            int r9 = java.lang.Math.min(r10, r9)
            int r9 = java.lang.Math.max(r4, r9)
            int r10 = r8.zze
            int r9 = r9 - r10
            int r9 = java.lang.Math.min(r9, r5)
            int r9 = java.lang.Math.min(r6, r9)
            if (r9 <= 0) goto L4f
            int r10 = r8.zze
            int r10 = r10 + r9
            r8.zze = r10
            int r6 = r6 - r9
        L4f:
            com.google.android.libraries.places.internal.zzclo r9 = r8.zzb
            int r10 = r8.zzd
            long r11 = r9.zzb
            int r9 = (int) r11
            int r9 = java.lang.Math.min(r10, r9)
            int r9 = java.lang.Math.max(r4, r9)
            int r10 = r8.zze
            int r9 = r9 - r10
            if (r9 <= 0) goto L68
            int r9 = r3 + 1
            r1[r3] = r8
            r3 = r9
        L68:
            int r7 = r7 + 1
            goto L27
        L6b:
            r2 = r3
            r3 = r6
            goto L16
        L6e:
            com.google.android.libraries.places.internal.zzcil r1 = new com.google.android.libraries.places.internal.zzcil
            r1.<init>()
            com.google.android.libraries.places.internal.zzcij[] r0 = r0.zzn()
            int r2 = r0.length
            r3 = r4
        L79:
            if (r3 >= r2) goto L87
            r5 = r0[r3]
            int r6 = r5.zze
            r5.zzi(r6, r1)
            r5.zze = r4
            int r3 = r3 + 1
            goto L79
        L87:
            int r0 = r1.zza
            if (r0 <= 0) goto L97
            java.lang.Object r13 = r13.zzc     // Catch: java.io.IOException -> L93
            com.google.android.libraries.places.internal.zzche r13 = (com.google.android.libraries.places.internal.zzche) r13     // Catch: java.io.IOException -> L93
            r13.zze()     // Catch: java.io.IOException -> L93
            return
        L93:
            r13 = move-exception
            bo.app.a$$ExternalSyntheticBUOutline0.m(r13)
        L97:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.cloudmessaging.zzv.zzf():void");
    }

    public synchronized zzw zzg(zzr zzrVar) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Queueing ".concat(zzrVar.toString()));
            }
            if (!((zzp) this.zzd).zzg(zzrVar)) {
                zzp zzpVar = new zzp(this);
                this.zzd = zzpVar;
                zzpVar.zzg(zzrVar);
            }
        } catch (Throwable th) {
            throw th;
        }
        return zzrVar.zzb.zza;
    }

    public zzv(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.$r8$classId = 0;
        this.zzd = new zzp(this);
        this.zze = 1;
        this.zzc = scheduledExecutorService;
        this.zzb = context.getApplicationContext();
    }

    public zzv(zzchy zzchyVar, zzche zzcheVar) {
        this.$r8$classId = 5;
        this.zzb = zzchyVar;
        this.zzc = zzcheVar;
        this.zze = 65535;
        this.zzd = new zzcij(this, 0, 65535, null);
    }

    public /* synthetic */ zzv(zzqa zzqaVar, zzacb zzacbVar, int i, ArrayList arrayList) {
        this.$r8$classId = 4;
        this.zzb = zzqaVar;
        this.zzc = zzacbVar;
        this.zze = i;
        this.zzd = arrayList;
    }

    public zzv(String str, int i, AudioSpec audioSpec, AutoValue_AudioSettings autoValue_AudioSettings) {
        this.$r8$classId = 2;
        str.getClass();
        audioSpec.getClass();
        this.zzb = str;
        this.zze = i;
        this.zzc = audioSpec;
        this.zzd = autoValue_AudioSettings;
    }

    public zzv(int i, ZslControlImpl$$ExternalSyntheticLambda1 zslControlImpl$$ExternalSyntheticLambda1) {
        this.$r8$classId = 1;
        this.zzc = new Object();
        this.zze = i;
        this.zzb = new ArrayDeque(i);
        this.zzd = zslControlImpl$$ExternalSyntheticLambda1;
    }

    public zzv() {
        this.$r8$classId = 3;
        this.zzb = new Object();
        this.zzc = null;
        this.zzd = null;
        this.zze = 0;
    }

    public zzv(Moshi moshi, Context context, StaticTemplateSession_Factory_Impl staticTemplateSession_Factory_Impl, int i) {
        this.$r8$classId = 7;
        moshi.getClass();
        context.getClass();
        staticTemplateSession_Factory_Impl.getClass();
        this.zzc = moshi;
        this.zzb = context;
        this.zzd = staticTemplateSession_Factory_Impl;
        this.zze = i;
    }

    public zzv(SingleDateSelector singleDateSelector) {
        this.$r8$classId = 6;
        this.zze = 0;
        this.zzd = null;
        this.zzb = singleDateSelector;
    }

    public static synchronized zzv zzb(Context context) {
        zzv zzvVar;
        synchronized (zzv.class) {
            try {
                if (zza == null) {
                    zza = new zzv(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new NamedThreadFactory("MessengerIpcClient"))));
                }
                zzvVar = zza;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzvVar;
    }

    public zzw zzc(int i, Bundle bundle) {
        int i2;
        synchronized (this) {
            i2 = this.zze;
            this.zze = i2 + 1;
        }
        return zzg(new zzr(i2, i, bundle, 0));
    }
}
