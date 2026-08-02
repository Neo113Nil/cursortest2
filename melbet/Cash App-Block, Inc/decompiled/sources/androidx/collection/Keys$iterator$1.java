package androidx.collection;

import androidx.compose.runtime.collection.ScatterSetWrapper;
import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.SequenceScope;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class Keys$iterator$1 extends RestrictedSuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public int I$0;
    public int I$1;
    public int I$2;
    public int I$3;
    public long J$0;
    public /* synthetic */ Object L$0;
    public Object L$1;
    public long[] L$2;
    public int label;
    public final /* synthetic */ Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Keys$iterator$1(Object obj, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.this$0;
        switch (i) {
            case 0:
                Keys$iterator$1 keys$iterator$1 = new Keys$iterator$1((Keys) obj2, continuation, 0);
                keys$iterator$1.L$0 = obj;
                return keys$iterator$1;
            case 1:
                Keys$iterator$1 keys$iterator$12 = new Keys$iterator$1((Keys) obj2, continuation, 1);
                keys$iterator$12.L$0 = obj;
                return keys$iterator$12;
            case 2:
                Keys$iterator$1 keys$iterator$13 = new Keys$iterator$1((Values) obj2, continuation, 2);
                keys$iterator$13.L$0 = obj;
                return keys$iterator$13;
            default:
                Keys$iterator$1 keys$iterator$14 = new Keys$iterator$1((ScatterSetWrapper) obj2, continuation, 3);
                keys$iterator$14.L$0 = obj;
                return keys$iterator$14;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        SequenceScope sequenceScope = (SequenceScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((Keys$iterator$1) create(sequenceScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0081  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0085 -> B:7:0x00a5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x006b -> B:16:0x00af). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x006d -> B:8:0x007f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0121 -> B:30:0x0141). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x0108 -> B:38:0x014a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x010a -> B:31:0x011b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x01ba -> B:52:0x01e8). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x01a0 -> B:60:0x01f2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:64:0x01a2 -> B:53:0x01b4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:79:0x0265 -> B:75:0x0226). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:89:0x024e -> B:77:0x025f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:90:0x0291 -> B:85:0x0292). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        SequenceScope sequenceScope;
        Object[] objArr;
        long[] jArr;
        int length;
        int i;
        long j;
        SequenceScope sequenceScope2;
        Keys keys;
        long[] jArr2;
        int length2;
        int i2;
        long j2;
        SequenceScope sequenceScope3;
        Object[] objArr2;
        long[] jArr3;
        int length3;
        int i3;
        long j3;
        long j4;
        long j5;
        char c;
        long j6;
        SequenceScope sequenceScope4;
        Object[] objArr3;
        long[] jArr4;
        int length4;
        int i4;
        long j7;
        int i5 = this.$r8$classId;
        Object obj2 = this.this$0;
        int i6 = 1;
        switch (i5) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i7 = this.label;
                if (i7 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    sequenceScope = (SequenceScope) this.L$0;
                    MutableScatterMap mutableScatterMap = ((Keys) obj2).parent;
                    objArr = mutableScatterMap.keys;
                    jArr = mutableScatterMap.metadata;
                    length = jArr.length - 2;
                    if (length >= 0) {
                        i = 0;
                        j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                        }
                    }
                } else if (i7 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    int i8 = this.I$3;
                    int i9 = this.I$2;
                    long j8 = this.J$0;
                    i = this.I$1;
                    int i10 = this.I$0;
                    long[] jArr5 = this.L$2;
                    Object[] objArr4 = (Object[]) this.L$1;
                    SequenceScope sequenceScope5 = (SequenceScope) this.L$0;
                    SafeTrace.throwOnFailure(obj);
                    j8 >>= 8;
                    i8++;
                    if (i8 < i9) {
                        if (i9 == 8) {
                            length = i10;
                            jArr = jArr5;
                            objArr = objArr4;
                            sequenceScope = sequenceScope5;
                            if (i != length) {
                                i++;
                                j = jArr[i];
                                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                                    sequenceScope5 = sequenceScope;
                                    i8 = 0;
                                    jArr5 = jArr;
                                    i10 = length;
                                    i9 = 8 - ((~(i - length)) >>> 31);
                                    objArr4 = objArr;
                                    j8 = j;
                                    if (i8 < i9) {
                                        if ((j8 & 255) < 128) {
                                            Object obj3 = objArr4[(i << 3) + i8];
                                            this.L$0 = sequenceScope5;
                                            this.L$1 = objArr4;
                                            this.L$2 = jArr5;
                                            this.I$0 = i10;
                                            this.I$1 = i;
                                            this.J$0 = j8;
                                            this.I$2 = i9;
                                            this.I$3 = i8;
                                            this.label = 1;
                                            sequenceScope5.yield(obj3, this);
                                            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                            break;
                                        }
                                        j8 >>= 8;
                                        i8++;
                                        if (i8 < i9) {
                                        }
                                    }
                                } else if (i != length) {
                                }
                            }
                        }
                        break;
                    }
                }
            case 1:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i11 = this.label;
                if (i11 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    sequenceScope2 = (SequenceScope) this.L$0;
                    keys = (Keys) obj2;
                    jArr2 = keys.parent.metadata;
                    length2 = jArr2.length - 2;
                    if (length2 >= 0) {
                        i2 = 0;
                        j2 = jArr2[i2];
                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                        }
                        if (i2 != length2) {
                        }
                    }
                } else if (i11 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    int i12 = this.I$3;
                    int i13 = this.I$2;
                    long j9 = this.J$0;
                    int i14 = this.I$1;
                    int i15 = this.I$0;
                    long[] jArr6 = this.L$2;
                    Keys keys2 = (Keys) this.L$1;
                    SequenceScope sequenceScope6 = (SequenceScope) this.L$0;
                    SafeTrace.throwOnFailure(obj);
                    j9 >>= 8;
                    i12 += i6;
                    if (i12 < i13) {
                        if (i13 == 8) {
                            i2 = i14;
                            length2 = i15;
                            jArr2 = jArr6;
                            keys = keys2;
                            sequenceScope2 = sequenceScope6;
                            if (i2 != length2) {
                                i2++;
                                i6 = 1;
                                j2 = jArr2[i2];
                                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    sequenceScope6 = sequenceScope2;
                                    i12 = 0;
                                    jArr6 = jArr2;
                                    i13 = 8 - ((~(i2 - length2)) >>> 31);
                                    keys2 = keys;
                                    i15 = length2;
                                    i14 = i2;
                                    j9 = j2;
                                    if (i12 < i13) {
                                        if ((j9 & 255) < 128) {
                                            int i16 = (i14 << 3) + i12;
                                            MutableScatterMap mutableScatterMap2 = keys2.parent;
                                            MapEntry mapEntry = new MapEntry(0, mutableScatterMap2.keys[i16], mutableScatterMap2.values[i16]);
                                            this.L$0 = sequenceScope6;
                                            this.L$1 = keys2;
                                            this.L$2 = jArr6;
                                            this.I$0 = i15;
                                            this.I$1 = i14;
                                            this.J$0 = j9;
                                            this.I$2 = i13;
                                            this.I$3 = i12;
                                            this.label = 1;
                                            sequenceScope6.yield(mapEntry, this);
                                            CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                            break;
                                        }
                                        j9 >>= 8;
                                        i12 += i6;
                                        if (i12 < i13) {
                                        }
                                    }
                                }
                                if (i2 != length2) {
                                }
                            }
                        }
                        break;
                    }
                }
            case 2:
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i17 = this.label;
                if (i17 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    sequenceScope3 = (SequenceScope) this.L$0;
                    MutableScatterMap mutableScatterMap3 = (MutableScatterMap) ((Values) obj2).parent;
                    objArr2 = mutableScatterMap3.values;
                    jArr3 = mutableScatterMap3.metadata;
                    length3 = jArr3.length - 2;
                    if (length3 >= 0) {
                        i3 = 0;
                        j3 = jArr3[i3];
                        if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                        }
                        if (i3 != length3) {
                        }
                    }
                } else if (i17 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    int i18 = this.I$3;
                    int i19 = this.I$2;
                    long j10 = this.J$0;
                    i3 = this.I$1;
                    int i20 = this.I$0;
                    long[] jArr7 = this.L$2;
                    Object[] objArr5 = (Object[]) this.L$1;
                    SequenceScope sequenceScope7 = (SequenceScope) this.L$0;
                    SafeTrace.throwOnFailure(obj);
                    j10 >>= 8;
                    i18++;
                    if (i18 < i19) {
                        if (i19 == 8) {
                            length3 = i20;
                            jArr3 = jArr7;
                            objArr2 = objArr5;
                            sequenceScope3 = sequenceScope7;
                            if (i3 != length3) {
                                i3++;
                                j3 = jArr3[i3];
                                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    sequenceScope7 = sequenceScope3;
                                    i18 = 0;
                                    jArr7 = jArr3;
                                    i20 = length3;
                                    i19 = 8 - ((~(i3 - length3)) >>> 31);
                                    objArr5 = objArr2;
                                    j10 = j3;
                                    if (i18 < i19) {
                                        if ((j10 & 255) < 128) {
                                            Object obj4 = objArr5[(i3 << 3) + i18];
                                            this.L$0 = sequenceScope7;
                                            this.L$1 = objArr5;
                                            this.L$2 = jArr7;
                                            this.I$0 = i20;
                                            this.I$1 = i3;
                                            this.J$0 = j10;
                                            this.I$2 = i19;
                                            this.I$3 = i18;
                                            this.label = 1;
                                            sequenceScope7.yield(obj4, this);
                                            CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                            break;
                                        }
                                        j10 >>= 8;
                                        i18++;
                                        if (i18 < i19) {
                                        }
                                    }
                                }
                                if (i3 != length3) {
                                }
                            }
                        }
                        break;
                    }
                }
            default:
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i21 = this.label;
                if (i21 == 0) {
                    j4 = 128;
                    j5 = 255;
                    c = 7;
                    j6 = -9187201950435737472L;
                    SafeTrace.throwOnFailure(obj);
                    sequenceScope4 = (SequenceScope) this.L$0;
                    MutableScatterSet mutableScatterSet = ((ScatterSetWrapper) obj2).set;
                    objArr3 = mutableScatterSet.elements;
                    jArr4 = mutableScatterSet.metadata;
                    length4 = jArr4.length - 2;
                    if (length4 >= 0) {
                        i4 = 0;
                        j7 = jArr4[i4];
                        if ((((~j7) << c) & j7 & j6) != j6) {
                        }
                        if (i4 != length4) {
                        }
                    }
                } else if (i21 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    int i22 = this.I$3;
                    int i23 = this.I$2;
                    j4 = 128;
                    long j11 = this.J$0;
                    int i24 = this.I$1;
                    j5 = 255;
                    int i25 = this.I$0;
                    long[] jArr8 = this.L$2;
                    c = 7;
                    Object[] objArr6 = (Object[]) this.L$1;
                    j6 = -9187201950435737472L;
                    SequenceScope sequenceScope8 = (SequenceScope) this.L$0;
                    SafeTrace.throwOnFailure(obj);
                    j11 >>= 8;
                    i22++;
                    if (i22 < i23) {
                        if (i23 == 8) {
                            jArr4 = jArr8;
                            sequenceScope4 = sequenceScope8;
                            length4 = i25;
                            objArr3 = objArr6;
                            i4 = i24;
                            if (i4 != length4) {
                                i4++;
                                j7 = jArr4[i4];
                                if ((((~j7) << c) & j7 & j6) != j6) {
                                    int i26 = 8 - ((~(i4 - length4)) >>> 31);
                                    sequenceScope8 = sequenceScope4;
                                    int i27 = length4;
                                    jArr8 = jArr4;
                                    j11 = j7;
                                    i23 = i26;
                                    i22 = 0;
                                    i24 = i4;
                                    objArr6 = objArr3;
                                    i25 = i27;
                                    if (i22 < i23) {
                                        if ((j11 & j5) < j4) {
                                            Object obj5 = objArr6[(i24 << 3) + i22];
                                            this.L$0 = sequenceScope8;
                                            this.L$1 = objArr6;
                                            this.L$2 = jArr8;
                                            this.I$0 = i25;
                                            this.I$1 = i24;
                                            this.J$0 = j11;
                                            this.I$2 = i23;
                                            this.I$3 = i22;
                                            this.label = 1;
                                            sequenceScope8.yield(obj5, this);
                                            CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                            break;
                                        }
                                        j11 >>= 8;
                                        i22++;
                                        if (i22 < i23) {
                                        }
                                    }
                                }
                                if (i4 != length4) {
                                }
                            }
                        }
                        break;
                    }
                }
        }
        return Unit.INSTANCE;
    }
}
