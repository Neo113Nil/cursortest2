package androidx.media3.extractor;

import androidx.lifecycle.viewmodel.InitializerViewModelFactory;
import androidx.lifecycle.viewmodel.ViewModelInitializer;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.tracing.Trace;
import com.google.common.primitives.Longs;
import com.withpersona.sdk2.inquiry.governmentid.IdConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Locale;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KClass;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes3.dex */
public final class ChunkIndexMerger {
    public final LinkedHashMap chunkMap;

    public ChunkIndexMerger(int i) {
        switch (i) {
            case 1:
                this.chunkMap = new LinkedHashMap();
                break;
            case 2:
                this.chunkMap = new LinkedHashMap();
                break;
            case 3:
                this.chunkMap = new LinkedHashMap();
                break;
            default:
                this.chunkMap = new LinkedHashMap();
                break;
        }
    }

    public void add(ChunkIndex chunkIndex) {
        long[] jArr = chunkIndex.timesUs;
        if (jArr.length > 0) {
            Long valueOf = Long.valueOf(jArr[0]);
            LinkedHashMap linkedHashMap = this.chunkMap;
            if (linkedHashMap.containsKey(valueOf)) {
                return;
            }
            linkedHashMap.put(Long.valueOf(chunkIndex.timesUs[0]), chunkIndex);
        }
    }

    public void addInitializer(KClass kClass, Function1 function1) {
        kClass.getClass();
        function1.getClass();
        LinkedHashMap linkedHashMap = this.chunkMap;
        if (linkedHashMap.containsKey(kClass)) {
            Path$$ExternalSyntheticBUOutline0.m$1("A `initializer` with the same `clazz` has already been added: ", 46, kClass.getQualifiedName());
        } else {
            linkedHashMap.put(kClass, new ViewModelInitializer(kClass, function1));
        }
    }

    public InitializerViewModelFactory build() {
        Collection values = this.chunkMap.values();
        values.getClass();
        ViewModelInitializer[] viewModelInitializerArr = (ViewModelInitializer[]) values.toArray(new ViewModelInitializer[0]);
        return new InitializerViewModelFactory((ViewModelInitializer[]) Arrays.copyOf(viewModelInitializerArr, viewModelInitializerArr.length), 0);
    }

    public ChunkIndex merge() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (ChunkIndex chunkIndex : this.chunkMap.values()) {
            arrayList.add(chunkIndex.sizes);
            arrayList2.add(chunkIndex.offsets);
            arrayList3.add(chunkIndex.durationsUs);
            arrayList4.add(chunkIndex.timesUs);
        }
        int[][] iArr = (int[][]) arrayList.toArray(new int[arrayList.size()][]);
        long j = 0;
        for (int[] iArr2 : iArr) {
            j += iArr2.length;
        }
        int i = (int) j;
        Trace.checkArgument(j, "the total number of elements (%s) in the arrays must fit in an int", j == ((long) i));
        int[] iArr3 = new int[i];
        int i2 = 0;
        for (int[] iArr4 : iArr) {
            System.arraycopy(iArr4, 0, iArr3, i2, iArr4.length);
            i2 += iArr4.length;
        }
        return new ChunkIndex(iArr3, Longs.concat((long[][]) arrayList2.toArray(new long[arrayList2.size()][])), Longs.concat((long[][]) arrayList3.toArray(new long[arrayList3.size()][])), Longs.concat((long[][]) arrayList4.toArray(new long[arrayList4.size()][])));
    }

    public void putText(String str, String str2, IdConfig.Side side, String str3) {
        side.getClass();
        str3.getClass();
        String m$1 = Boxes$$ExternalSyntheticOutline1.m$1(str, "-", str2, "-", side.key);
        Locale locale = Locale.US;
        locale.getClass();
        String lowerCase = m$1.toLowerCase(locale);
        lowerCase.getClass();
        this.chunkMap.put(lowerCase, str3);
    }
}
