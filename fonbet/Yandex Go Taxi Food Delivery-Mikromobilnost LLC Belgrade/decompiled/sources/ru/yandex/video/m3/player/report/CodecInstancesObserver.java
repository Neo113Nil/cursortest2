package ru.yandex.video.m3.player.report;

import defpackage.g050;
import defpackage.gtq0;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.b;
import kotlin.collections.a;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u0013B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b\t\u0010\bJ\u0010\u0010\n\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b\n\u0010\u000bR \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\r0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lru/yandex/video/m3/player/report/CodecInstancesObserver;", "", "<init>", "()V", "", "codecName", "Lzy11;", "onCodecCreated", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onCodecReleased", "getCodecsForLog", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Lru/yandex/video/m3/player/report/CodecInstancesObserver$CodecInstancesInfo;", "codecs", "Ljava/util/Map;", "Lg050;", "mutex", "Lg050;", "CodecInstancesInfo", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CodecInstancesObserver {
    public static final CodecInstancesObserver INSTANCE = new CodecInstancesObserver();
    private static final Map<String, CodecInstancesInfo> codecs = new LinkedHashMap();
    private static final g050 mutex = gtq0.a();
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lru/yandex/video/m3/player/report/CodecInstancesObserver$CodecInstancesInfo;", "", "currentCount", "", "totalAllocations", "(II)V", "getCurrentCount", "()I", "getTotalAllocations", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class CodecInstancesInfo {
        public static final int $stable = 0;
        private final int currentCount;
        private final int totalAllocations;

        public CodecInstancesInfo(int i, int i2) {
            this.currentCount = i;
            this.totalAllocations = i2;
        }

        public static /* synthetic */ CodecInstancesInfo copy$default(CodecInstancesInfo codecInstancesInfo, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = codecInstancesInfo.currentCount;
            }
            if ((i3 & 2) != 0) {
                i2 = codecInstancesInfo.totalAllocations;
            }
            return codecInstancesInfo.copy(i, i2);
        }

        /* renamed from: component1, reason: from getter */
        public final int getCurrentCount() {
            return this.currentCount;
        }

        /* renamed from: component2, reason: from getter */
        public final int getTotalAllocations() {
            return this.totalAllocations;
        }

        public final CodecInstancesInfo copy(int currentCount, int totalAllocations) {
            return new CodecInstancesInfo(currentCount, totalAllocations);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CodecInstancesInfo)) {
                return false;
            }
            CodecInstancesInfo codecInstancesInfo = (CodecInstancesInfo) other;
            return this.currentCount == codecInstancesInfo.currentCount && this.totalAllocations == codecInstancesInfo.totalAllocations;
        }

        public final int getCurrentCount() {
            return this.currentCount;
        }

        public final int getTotalAllocations() {
            return this.totalAllocations;
        }

        public int hashCode() {
            return Integer.hashCode(this.totalAllocations) + (Integer.hashCode(this.currentCount) * 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("CodecInstancesInfo(currentCount=");
            sb.append(this.currentCount);
            sb.append(", totalAllocations=");
            return oyr.s(sb, this.totalAllocations, ')');
        }
    }

    private CodecInstancesObserver() {
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0060 A[Catch: all -> 0x00a0, LOOP:0: B:12:0x005a->B:14:0x0060, LOOP_END, TryCatch #0 {all -> 0x00a0, blocks: (B:11:0x0043, B:12:0x005a, B:14:0x0060, B:16:0x00a3), top: B:10:0x0043 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getCodecsForLog(Continuation<? super String> continuation) {
        CodecInstancesObserver$getCodecsForLog$1 codecInstancesObserver$getCodecsForLog$1;
        int i;
        g050 g050Var;
        try {
            if (continuation instanceof CodecInstancesObserver$getCodecsForLog$1) {
                codecInstancesObserver$getCodecsForLog$1 = (CodecInstancesObserver$getCodecsForLog$1) continuation;
                int i2 = codecInstancesObserver$getCodecsForLog$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    codecInstancesObserver$getCodecsForLog$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = codecInstancesObserver$getCodecsForLog$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = codecInstancesObserver$getCodecsForLog$1.label;
                    if (i != 0) {
                        b.b(obj);
                        g050 g050Var2 = mutex;
                        codecInstancesObserver$getCodecsForLog$1.L$0 = g050Var2;
                        codecInstancesObserver$getCodecsForLog$1.label = 1;
                        if (g050Var2.a(codecInstancesObserver$getCodecsForLog$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        g050Var = g050Var2;
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        g050Var = (g050) codecInstancesObserver$getCodecsForLog$1.L$0;
                        b.b(obj);
                    }
                    Map t = kotlin.collections.b.t(codecs);
                    ArrayList arrayList = new ArrayList(t.size());
                    for (Map.Entry entry : t.entrySet()) {
                        arrayList.add(((String) entry.getKey()) + ", currentCount=" + ((CodecInstancesInfo) entry.getValue()).getCurrentCount() + ", totalAllocations=" + ((CodecInstancesInfo) entry.getValue()).getTotalAllocations());
                    }
                    String X = a.X(arrayList, "\n", null, null, null, 62);
                    g050Var.d(null);
                    return X;
                }
            }
            Map t2 = kotlin.collections.b.t(codecs);
            ArrayList arrayList2 = new ArrayList(t2.size());
            while (r10.hasNext()) {
            }
            String X2 = a.X(arrayList2, "\n", null, null, null, 62);
            g050Var.d(null);
            return X2;
        } catch (Throwable th) {
            g050Var.d(null);
            throw th;
        }
        codecInstancesObserver$getCodecsForLog$1 = new CodecInstancesObserver$getCodecsForLog$1(this, continuation);
        Object obj2 = codecInstancesObserver$getCodecsForLog$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = codecInstancesObserver$getCodecsForLog$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0054 A[Catch: all -> 0x005d, TryCatch #0 {all -> 0x005d, blocks: (B:11:0x004a, B:13:0x0054, B:14:0x0071, B:19:0x005f), top: B:10:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005f A[Catch: all -> 0x005d, TryCatch #0 {all -> 0x005d, blocks: (B:11:0x004a, B:13:0x0054, B:14:0x0071, B:19:0x005f), top: B:10:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object onCodecCreated(String str, Continuation<? super zy11> continuation) {
        CodecInstancesObserver$onCodecCreated$1 codecInstancesObserver$onCodecCreated$1;
        int i;
        g050 g050Var;
        CodecInstancesInfo codecInstancesInfo;
        try {
            if (continuation instanceof CodecInstancesObserver$onCodecCreated$1) {
                codecInstancesObserver$onCodecCreated$1 = (CodecInstancesObserver$onCodecCreated$1) continuation;
                int i2 = codecInstancesObserver$onCodecCreated$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    codecInstancesObserver$onCodecCreated$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = codecInstancesObserver$onCodecCreated$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = codecInstancesObserver$onCodecCreated$1.label;
                    if (i != 0) {
                        b.b(obj);
                        g050Var = mutex;
                        codecInstancesObserver$onCodecCreated$1.L$0 = str;
                        codecInstancesObserver$onCodecCreated$1.L$1 = g050Var;
                        codecInstancesObserver$onCodecCreated$1.label = 1;
                        if (g050Var.a(codecInstancesObserver$onCodecCreated$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        g050 g050Var2 = (g050) codecInstancesObserver$onCodecCreated$1.L$1;
                        String str2 = (String) codecInstancesObserver$onCodecCreated$1.L$0;
                        b.b(obj);
                        g050Var = g050Var2;
                        str = str2;
                    }
                    Map<String, CodecInstancesInfo> map = codecs;
                    codecInstancesInfo = map.get(str);
                    if (codecInstancesInfo != null) {
                        map.put(str, new CodecInstancesInfo(1, 1));
                    } else {
                        map.put(str, new CodecInstancesInfo(codecInstancesInfo.getCurrentCount() + 1, codecInstancesInfo.getTotalAllocations() + 1));
                    }
                    zy11 zy11Var = zy11.a;
                    g050Var.d(null);
                    return zy11Var;
                }
            }
            Map<String, CodecInstancesInfo> map2 = codecs;
            codecInstancesInfo = map2.get(str);
            if (codecInstancesInfo != null) {
            }
            zy11 zy11Var2 = zy11.a;
            g050Var.d(null);
            return zy11Var2;
        } catch (Throwable th) {
            g050Var.d(null);
            throw th;
        }
        codecInstancesObserver$onCodecCreated$1 = new CodecInstancesObserver$onCodecCreated$1(this, continuation);
        Object obj2 = codecInstancesObserver$onCodecCreated$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = codecInstancesObserver$onCodecCreated$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0054 A[Catch: all -> 0x0063, TryCatch #0 {all -> 0x0063, blocks: (B:11:0x004a, B:13:0x0054, B:14:0x0065), top: B:10:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object onCodecReleased(String str, Continuation<? super zy11> continuation) {
        CodecInstancesObserver$onCodecReleased$1 codecInstancesObserver$onCodecReleased$1;
        int i;
        g050 g050Var;
        CodecInstancesInfo codecInstancesInfo;
        try {
            if (continuation instanceof CodecInstancesObserver$onCodecReleased$1) {
                codecInstancesObserver$onCodecReleased$1 = (CodecInstancesObserver$onCodecReleased$1) continuation;
                int i2 = codecInstancesObserver$onCodecReleased$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    codecInstancesObserver$onCodecReleased$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = codecInstancesObserver$onCodecReleased$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = codecInstancesObserver$onCodecReleased$1.label;
                    if (i != 0) {
                        b.b(obj);
                        g050Var = mutex;
                        codecInstancesObserver$onCodecReleased$1.L$0 = str;
                        codecInstancesObserver$onCodecReleased$1.L$1 = g050Var;
                        codecInstancesObserver$onCodecReleased$1.label = 1;
                        if (g050Var.a(codecInstancesObserver$onCodecReleased$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        g050 g050Var2 = (g050) codecInstancesObserver$onCodecReleased$1.L$1;
                        String str2 = (String) codecInstancesObserver$onCodecReleased$1.L$0;
                        b.b(obj);
                        g050Var = g050Var2;
                        str = str2;
                    }
                    Map<String, CodecInstancesInfo> map = codecs;
                    codecInstancesInfo = map.get(str);
                    if (codecInstancesInfo != null) {
                        map.put(str, CodecInstancesInfo.copy$default(codecInstancesInfo, codecInstancesInfo.getCurrentCount() - 1, 0, 2, null));
                    }
                    zy11 zy11Var = zy11.a;
                    g050Var.d(null);
                    return zy11Var;
                }
            }
            Map<String, CodecInstancesInfo> map2 = codecs;
            codecInstancesInfo = map2.get(str);
            if (codecInstancesInfo != null) {
            }
            zy11 zy11Var2 = zy11.a;
            g050Var.d(null);
            return zy11Var2;
        } catch (Throwable th) {
            g050Var.d(null);
            throw th;
        }
        codecInstancesObserver$onCodecReleased$1 = new CodecInstancesObserver$onCodecReleased$1(this, continuation);
        Object obj2 = codecInstancesObserver$onCodecReleased$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = codecInstancesObserver$onCodecReleased$1.label;
        if (i != 0) {
        }
    }
}
