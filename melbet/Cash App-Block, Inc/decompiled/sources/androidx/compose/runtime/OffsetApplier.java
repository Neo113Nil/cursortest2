package androidx.compose.runtime;

import android.animation.ArgbEvaluator;
import android.graphics.Point;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder;
import androidx.compose.foundation.text.ValidatingOffsetMappingKt;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.media3.common.Format;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.container.Mp4Box$LeafBox;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DefaultHttpDataSource;
import androidx.media3.extractor.mp4.BoxParser;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.tracing.Trace;
import com.google.android.gms.internal.mlkit_vision_barcode.zzbl;
import com.google.android.gms.internal.mlkit_vision_barcode.zzbv;
import com.google.android.gms.internal.mlkit_vision_barcode.zzbw;
import com.google.android.gms.internal.mlkit_vision_barcode.zzcq;
import com.google.android.gms.internal.mlkit_vision_barcode.zzcs;
import com.google.android.gms.internal.mlkit_vision_barcode.zzdk;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrc;
import com.google.android.gms.internal.mlkit_vision_barcode.zzxf;
import com.google.android.gms.internal.mlkit_vision_barcode.zzxg;
import com.google.android.gms.internal.mlkit_vision_barcode.zzxk;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.libraries.places.internal.zzbor;
import com.google.android.libraries.places.internal.zzbqd;
import com.google.common.collect.AbstractMapBasedMultimap$1;
import com.google.common.collect.Maps;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.google.mlkit.vision.barcode.internal.zzh;
import com.squareup.cash.clientroutes.PatternRedaction;
import com.withpersona.sdk2.inquiry.shared.ui.dotsIndicator.Pi2DotsTabIndicator;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntProgressionIterator;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;

/* loaded from: classes3.dex */
public final class OffsetApplier implements OffsetMapping, Applier, DataSource.Factory, BoxParser.SampleSizeBox, SuccessContinuation {
    public final /* synthetic */ int $r8$classId;
    public Object applier;
    public int nesting;
    public int offset;

    public OffsetApplier(Mp4Box$LeafBox mp4Box$LeafBox, Format format2) {
        this.$r8$classId = 4;
        ParsableByteArray parsableByteArray = mp4Box$LeafBox.data;
        this.applier = parsableByteArray;
        parsableByteArray.setPosition(12);
        int readUnsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
        if ("audio/raw".equals(format2.sampleMimeType)) {
            int byteDepth = Util.getByteDepth(format2.pcmEncoding) * format2.channelCount;
            if (readUnsignedIntToInt % byteDepth != 0) {
                Log.w("BoxParsers", "Audio sample size mismatch. stsd sample size: " + byteDepth + ", stsz sample size: " + readUnsignedIntToInt);
                readUnsignedIntToInt = byteDepth;
            }
        }
        this.offset = readUnsignedIntToInt == 0 ? -1 : readUnsignedIntToInt;
        this.nesting = parsableByteArray.readUnsignedIntToInt();
    }

    @Override // androidx.compose.runtime.Applier
    public void apply(Object obj, Function2 function2) {
        ((Applier) this.applier).apply(obj, function2);
    }

    @Override // androidx.compose.runtime.Applier
    public void clear() {
        ComposerKt.composeImmediateRuntimeError("Clear is not valid on OffsetApplier");
    }

    @Override // androidx.media3.datasource.DataSource.Factory
    public DataSource createDataSource() {
        return new DefaultHttpDataSource(null, this.offset, this.nesting, (Recorder.AnonymousClass4) this.applier);
    }

    @Override // androidx.compose.runtime.Applier
    public void down(Object obj) {
        this.nesting++;
        ((Applier) this.applier).down(obj);
    }

    public byte get(int i, int i2) {
        return ((byte[][]) this.applier)[i2][i];
    }

    @Override // androidx.compose.runtime.Applier
    public Object getCurrent() {
        return ((Applier) this.applier).getCurrent();
    }

    @Override // androidx.media3.extractor.mp4.BoxParser.SampleSizeBox
    public int getFixedSampleSize() {
        return this.offset;
    }

    public int getHeight() {
        return this.nesting;
    }

    public Function0 getPlace() {
        return (Function0) this.applier;
    }

    @Override // androidx.media3.extractor.mp4.BoxParser.SampleSizeBox
    public int getSampleCount() {
        return this.nesting;
    }

    public int getWidth() {
        return this.offset;
    }

    @Override // androidx.compose.runtime.Applier
    public void insertBottomUp(int i, Object obj) {
        ((Applier) this.applier).insertBottomUp(i + (this.nesting == 0 ? this.offset : 0), obj);
    }

    @Override // androidx.compose.runtime.Applier
    public void insertTopDown(int i, Object obj) {
        ((Applier) this.applier).insertTopDown(i + (this.nesting == 0 ? this.offset : 0), obj);
    }

    @Override // androidx.compose.runtime.Applier
    public void move(int i, int i2, int i3) {
        int i4 = this.nesting == 0 ? this.offset : 0;
        ((Applier) this.applier).move(i + i4, i2 + i4, i3);
    }

    public void onPageScrolled(float f, int i) {
        int i2;
        float f2;
        float f3;
        float f4 = i + f;
        Pi2DotsTabIndicator pi2DotsTabIndicator = (Pi2DotsTabIndicator) this.applier;
        ArrayList arrayList = pi2DotsTabIndicator.dots;
        float size = arrayList.size() - 1;
        int i3 = (int) f4;
        int i4 = i3 + 1;
        if (i3 < 0) {
            i3 = -1;
        }
        if (i4 > size) {
            i4 = -1;
        }
        float f5 = f4 % 1.0f;
        ArgbEvaluator argbEvaluator = pi2DotsTabIndicator.argbEvaluator;
        float f6 = pi2DotsTabIndicator.dotsSize;
        Pi2DotsTabIndicator.Dot dot = (Pi2DotsTabIndicator.Dot) CollectionsKt.getOrNull(i3, arrayList);
        if (dot != null) {
            float m = CameraState$Type$EnumUnboxingLocalUtility.m(1.0f, f5, pi2DotsTabIndicator.selectedDotWidth - f6, f6);
            dot.width = (int) m;
            if (i4 < 0 || i4 >= arrayList.size()) {
                f2 = 1.0f;
                f3 = 0.0f;
            } else {
                Object obj = arrayList.get(i4);
                obj.getClass();
                Pi2DotsTabIndicator.Dot dot2 = (Pi2DotsTabIndicator.Dot) obj;
                f3 = CameraState$Type$EnumUnboxingLocalUtility.m(pi2DotsTabIndicator.selectedDotWidth, f6, f5, f6);
                dot2.width = (int) f3;
                f2 = 1.0f;
                Object evaluate = argbEvaluator.evaluate(f5, Integer.valueOf(pi2DotsTabIndicator.selectedDotColor), Integer.valueOf(pi2DotsTabIndicator.dotsColor));
                evaluate.getClass();
                int intValue = ((Integer) evaluate).intValue();
                Object evaluate2 = argbEvaluator.evaluate(f5, Integer.valueOf(pi2DotsTabIndicator.dotsColor), Integer.valueOf(pi2DotsTabIndicator.selectedDotColor));
                evaluate2.getClass();
                dot2.color = ((Integer) evaluate2).intValue();
                dot.color = intValue;
            }
            if (pi2DotsTabIndicator.contentWidth > pi2DotsTabIndicator.getMeasuredWidth()) {
                float f7 = f6 + pi2DotsTabIndicator.spaceBetweenDots;
                float f8 = i3 + f5;
                float measuredWidth = (((((f8 - f2) * f7) + m) + f3) - pi2DotsTabIndicator.getMeasuredWidth()) + f7;
                float f9 = (f8 * f7) - f7;
                if (pi2DotsTabIndicator.getScrollX() < measuredWidth) {
                    pi2DotsTabIndicator.setScrollX((int) Math.min(Math.max(measuredWidth, RecyclerView.DECELERATION_RATE), pi2DotsTabIndicator.contentWidth - pi2DotsTabIndicator.getMeasuredWidth()));
                } else if (pi2DotsTabIndicator.getScrollX() > f9) {
                    pi2DotsTabIndicator.setScrollX((int) Math.min(Math.max(f9, RecyclerView.DECELERATION_RATE), pi2DotsTabIndicator.contentWidth - pi2DotsTabIndicator.getMeasuredWidth()));
                }
            } else {
                pi2DotsTabIndicator.setScrollX(0);
            }
            pi2DotsTabIndicator.invalidate();
        }
        int i5 = this.offset;
        if (i5 != -1) {
            if (i3 != -1 && i3 > i5) {
                IntProgressionIterator it = RangesKt___RangesKt.until(i5, i3).iterator();
                while (it.hasNext) {
                    resetPosition$shared_release(it.nextInt());
                }
            }
            if (i4 != -1 && i4 < (i2 = this.nesting)) {
                resetPosition$shared_release(i2);
                IntProgressionIterator it2 = new IntRange(i4 + 1, this.nesting, 1).iterator();
                while (it2.hasNext) {
                    resetPosition$shared_release(it2.nextInt());
                }
            }
        }
        this.offset = i3;
        this.nesting = i4;
    }

    @Override // androidx.compose.ui.text.input.OffsetMapping
    public int originalToTransformed(int i) {
        int originalToTransformed = ((OffsetMapping) this.applier).originalToTransformed(i);
        if (i >= 0 && i <= this.offset) {
            ValidatingOffsetMappingKt.validateOriginalToTransformed(originalToTransformed, this.nesting, i);
        }
        return originalToTransformed;
    }

    @Override // androidx.media3.extractor.mp4.BoxParser.SampleSizeBox
    public int readNextSampleSize() {
        int i = this.offset;
        return i == -1 ? ((ParsableByteArray) this.applier).readUnsignedIntToInt() : i;
    }

    @Override // androidx.compose.runtime.Applier
    public void remove(int i, int i2) {
        ((Applier) this.applier).remove(i + (this.nesting == 0 ? this.offset : 0), i2);
    }

    public void resetPosition$shared_release(int i) {
        Pi2DotsTabIndicator pi2DotsTabIndicator = (Pi2DotsTabIndicator) this.applier;
        ArrayList arrayList = pi2DotsTabIndicator.dots;
        ((Pi2DotsTabIndicator.Dot) arrayList.get(i)).width = (int) pi2DotsTabIndicator.dotsSize;
        ((Pi2DotsTabIndicator.Dot) arrayList.get(i)).color = pi2DotsTabIndicator.dotsColor;
        pi2DotsTabIndicator.invalidate();
    }

    @Override // androidx.compose.runtime.Applier
    public void reuse() {
        ((Applier) this.applier).reuse();
    }

    public void set(int i, int i2, int i3) {
        ((byte[][]) this.applier)[i2][i] = (byte) i3;
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        char c;
        int i;
        int i2;
        int i3;
        char c2;
        Iterator it;
        int i4;
        float f;
        List unmodifiableList;
        zzh zzhVar = (zzh) this.applier;
        int i5 = this.offset;
        int i6 = this.nesting;
        List list = (List) obj;
        if (zzhVar.zzb == null) {
            return Room.forResult(list);
        }
        zzhVar.zzg++;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = list.iterator();
        while (true) {
            c = 65535;
            if (!it2.hasNext()) {
                break;
            }
            Barcode barcode = (Barcode) it2.next();
            int format2 = barcode.zza.getFormat();
            if (format2 > 4096 || format2 == 0) {
                format2 = -1;
            }
            if (format2 == -1) {
                arrayList2.add(barcode);
            } else {
                arrayList.add(barcode);
            }
        }
        if (arrayList.isEmpty()) {
            int size = arrayList2.size();
            int i7 = 0;
            while (i7 < size) {
                Point[] pointArr = ((Barcode) arrayList2.get(i7)).zzc;
                if (pointArr != null) {
                    zzxk zzxkVar = zzhVar.zzb;
                    int i8 = zzhVar.zzg;
                    int i9 = i6;
                    int i10 = i5;
                    c2 = c;
                    int i11 = 0;
                    int i12 = 0;
                    for (Point point : Arrays.asList(pointArr)) {
                        i10 = Math.min(i10, point.x);
                        i9 = Math.min(i9, point.y);
                        i12 = Math.max(i12, point.x);
                        i11 = Math.max(i11, point.y);
                    }
                    float f2 = i10 + RecyclerView.DECELERATION_RATE;
                    float f3 = i5;
                    float f4 = i9 + RecyclerView.DECELERATION_RATE;
                    float f5 = i6;
                    float f6 = f2 / f3;
                    float f7 = f4 / f5;
                    float f8 = (i12 + RecyclerView.DECELERATION_RATE) / f3;
                    float f9 = (i11 + RecyclerView.DECELERATION_RATE) / f5;
                    zzxg zzxgVar = new zzxg(f6, f7, f8, f9);
                    synchronized (zzxkVar.zzh) {
                        try {
                            i = i6;
                            if (zzxkVar.zze != 2) {
                                i2 = i5;
                                i3 = size;
                            } else {
                                if (zzxgVar.zzh()) {
                                    zzxf zzxfVar = zzxkVar.zza;
                                    if (!zzxfVar.zzf || zzxfVar.zzg <= RecyclerView.DECELERATION_RATE) {
                                        if (!zzxkVar.zzr) {
                                            zzrc zzrcVar = zzrc.SCANNER_AUTO_ZOOM_FIRST_ATTEMPT;
                                            float f10 = zzxkVar.zzn;
                                            zzxkVar.zzq(zzrcVar, f10, f10, zzxgVar);
                                            zzxkVar.zzr = true;
                                        }
                                        PatternRedaction patternRedaction = zzxk.zzf;
                                        Locale locale = Locale.getDefault();
                                        i2 = i5;
                                        Float valueOf = Float.valueOf(f6);
                                        Float valueOf2 = Float.valueOf(f7);
                                        Float valueOf3 = Float.valueOf(f8);
                                        Float valueOf4 = Float.valueOf(f9);
                                        Float valueOf5 = Float.valueOf(RecyclerView.DECELERATION_RATE);
                                        Integer valueOf6 = Integer.valueOf(i8);
                                        patternRedaction.i(String.format(locale, "Process PredictedArea: [%.2f, %.2f, %.2f, %.2f, %.2f], frameIndex = %d", valueOf, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6));
                                        zzxkVar.zzb.zzt(valueOf6, zzxgVar);
                                        Set zzw = zzxkVar.zzb.zzw();
                                        int size2 = ((zzbl) zzw).zzb.size() - 1;
                                        zzxkVar.zza.getClass();
                                        if (size2 > 10) {
                                            Iterator it3 = ((zzbl) zzw).iterator();
                                            int i13 = i8;
                                            while (it3.hasNext()) {
                                                int intValue = ((Integer) it3.next()).intValue();
                                                if (i13 > intValue) {
                                                    i13 = intValue;
                                                }
                                            }
                                            zzxk.zzf.i("Removing recent frameIndex = " + i13);
                                            zzbw zzbwVar = zzxkVar.zzb;
                                            Collection collection = (Collection) zzbwVar.zza.remove(Integer.valueOf(i13));
                                            if (collection == null) {
                                                unmodifiableList = Collections.EMPTY_LIST;
                                            } else {
                                                ArrayList arrayList3 = new ArrayList(3);
                                                arrayList3.addAll(collection);
                                                zzbwVar.zzb -= collection.size();
                                                collection.clear();
                                                unmodifiableList = Collections.unmodifiableList(arrayList3);
                                            }
                                            List list2 = unmodifiableList;
                                        }
                                        HashSet hashSet = new HashSet();
                                        zzbw zzbwVar2 = zzxkVar.zzb;
                                        Maps.Values values = ((zzbv) zzbwVar2).zza;
                                        if (values == null) {
                                            values = new Maps.Values(zzbwVar2, 1);
                                            ((zzbv) zzbwVar2).zza = values;
                                        }
                                        Iterator it4 = values.iterator();
                                        while (true) {
                                            AbstractMapBasedMultimap$1 abstractMapBasedMultimap$1 = (AbstractMapBasedMultimap$1) it4;
                                            if (!abstractMapBasedMultimap$1.hasNext()) {
                                                break;
                                            }
                                            Map.Entry entry = (Map.Entry) abstractMapBasedMultimap$1.next();
                                            if (((Integer) entry.getKey()).intValue() != i8) {
                                                zzxg zzxgVar2 = (zzxg) entry.getValue();
                                                if (zzxgVar2.zzh() && zzxgVar.zzh()) {
                                                    it = it4;
                                                    i4 = size;
                                                    zzxg zzxgVar3 = new zzxg(Math.max(zzxgVar2.zza, zzxgVar.zza), Math.max(zzxgVar2.zzb, zzxgVar.zzb), Math.min(zzxgVar2.zzc, zzxgVar.zzc), Math.min(zzxgVar2.zzd, zzxgVar.zzd));
                                                    f = zzxgVar3.zzf() / ((zzxgVar2.zzf() + zzxgVar.zzf()) - zzxgVar3.zzf());
                                                } else {
                                                    it = it4;
                                                    i4 = size;
                                                    f = 0.0f;
                                                }
                                                if (f >= zzxkVar.zza.zzd) {
                                                    hashSet.add((Integer) entry.getKey());
                                                }
                                                it4 = it;
                                                size = i4;
                                            }
                                        }
                                        i3 = size;
                                        int size3 = hashSet.size();
                                        zzxf zzxfVar2 = zzxkVar.zza;
                                        if (size3 < zzxfVar2.zzc) {
                                            if (zzxfVar2.zzf && zzxfVar2.zzh <= RecyclerView.DECELERATION_RATE) {
                                            }
                                        }
                                        synchronized (zzxkVar.zzh) {
                                            if (zzxkVar.zza() >= zzxkVar.zza.zzi) {
                                                Float valueOf7 = Float.valueOf(zzxgVar.zza);
                                                Float valueOf8 = Float.valueOf(zzxgVar.zzb);
                                                Float valueOf9 = Float.valueOf(zzxgVar.zzc);
                                                Float valueOf10 = Float.valueOf(zzxgVar.zzd);
                                                zzcq zzcqVar = zzcs.zza;
                                                Object[] objArr = {valueOf7, valueOf8, valueOf9, valueOf10};
                                                Trace.zza(4, objArr);
                                                zzcq listIterator = new zzdk(4, objArr).listIterator(0);
                                                float f11 = 1.0E9f;
                                                while (listIterator.hasNext()) {
                                                    float max = (zzxkVar.zza.zze / 2.0f) / Math.max(Math.abs(((Float) listIterator.next()).floatValue() - 0.5f), 0.001f);
                                                    if (f11 > max) {
                                                        f11 = max;
                                                    }
                                                }
                                                float f12 = zzxkVar.zzn;
                                                float f13 = f11 * f12;
                                                float f14 = zzxkVar.zzo;
                                                if (f13 < 1.0f) {
                                                    f13 = 1.0f;
                                                }
                                                if (f14 <= RecyclerView.DECELERATION_RATE || f13 <= f14) {
                                                    f14 = f13;
                                                }
                                                zzxf zzxfVar3 = zzxkVar.zza;
                                                if (zzxfVar3.zzk) {
                                                    float f15 = (f14 - f12) / f12;
                                                    if (f15 <= zzxfVar3.zzl && f15 >= (-zzxfVar3.zzm)) {
                                                        zzxk.zzf.i("Auto zoom to " + f14 + " is filtered by threshold");
                                                        zzxkVar.zzp = zzxkVar.zzj.zza();
                                                    }
                                                }
                                                zzxk.zzf.i("Going to set zoom = " + f14);
                                                zzxkVar.zzl(f14, zzrc.SCANNER_AUTO_ZOOM_AUTO_ZOOM, zzxgVar);
                                            }
                                        }
                                    }
                                }
                                i2 = i5;
                                i3 = size;
                            }
                        } catch (Throwable th) {
                            throw th;
                        } finally {
                        }
                    }
                    i7++;
                    c = c2;
                    i6 = i;
                    i5 = i2;
                    size = i3;
                } else {
                    i = i6;
                    i2 = i5;
                    i3 = size;
                    c2 = c;
                }
                i7++;
                c = c2;
                i6 = i;
                i5 = i2;
                size = i3;
            }
        } else {
            zzhVar.zzh = true;
        }
        zzhVar.zzf.getClass();
        return Room.forResult(arrayList);
    }

    public String toString() {
        switch (this.$r8$classId) {
            case 8:
                int i = this.offset;
                int i2 = this.nesting;
                StringBuilder sb = new StringBuilder((i * 2 * i2) + 2);
                for (int i3 = 0; i3 < i2; i3++) {
                    byte[] bArr = ((byte[][]) this.applier)[i3];
                    for (int i4 = 0; i4 < i; i4++) {
                        byte b = bArr[i4];
                        if (b == 0) {
                            sb.append(" 0");
                        } else if (b != 1) {
                            sb.append("  ");
                        } else {
                            sb.append(" 1");
                        }
                    }
                    sb.append('\n');
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    @Override // androidx.compose.ui.text.input.OffsetMapping
    public int transformedToOriginal(int i) {
        int transformedToOriginal = ((OffsetMapping) this.applier).transformedToOriginal(i);
        if (i >= 0 && i <= this.nesting) {
            ValidatingOffsetMappingKt.validateTransformedToOriginal(transformedToOriginal, this.offset, i);
        }
        return transformedToOriginal;
    }

    @Override // androidx.compose.runtime.Applier
    public void up() {
        if (this.nesting <= 0) {
            ComposerKt.composeImmediateRuntimeError("OffsetApplier up called with no corresponding down");
        }
        this.nesting--;
        ((Applier) this.applier).up();
    }

    public void zzd() {
        this.offset = 0;
        this.nesting = 0;
    }

    public zzbor zzf() {
        return ((zzbqd) ((List) this.applier).get(this.offset)).zze;
    }

    public void set(int i, int i2, boolean z) {
        ((byte[][]) this.applier)[i2][i] = z ? (byte) 1 : (byte) 0;
    }

    public /* synthetic */ OffsetApplier(Object obj, int i, int i2, int i3) {
        this.$r8$classId = i3;
        this.applier = obj;
        this.offset = i;
        this.nesting = i2;
    }

    public OffsetApplier(Pi2DotsTabIndicator pi2DotsTabIndicator) {
        this.$r8$classId = 9;
        this.applier = pi2DotsTabIndicator;
        this.offset = -1;
        this.nesting = -1;
    }

    public OffsetApplier(int i, int i2) {
        this.$r8$classId = 8;
        this.applier = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, i2, i);
        this.offset = i;
        this.nesting = i2;
    }

    public OffsetApplier(int i) {
        this.$r8$classId = i;
        switch (i) {
            case 6:
                break;
            default:
                this.applier = new Recorder.AnonymousClass4(28);
                this.offset = 8000;
                this.nesting = 8000;
                break;
        }
    }

    public OffsetApplier(Applier applier, int i) {
        this.$r8$classId = 0;
        this.applier = applier;
        this.offset = i;
    }

    public /* synthetic */ OffsetApplier(int i, int i2, Object obj, int i3) {
        this.$r8$classId = i3;
        this.offset = i;
        this.nesting = i2;
        this.applier = obj;
    }
}
