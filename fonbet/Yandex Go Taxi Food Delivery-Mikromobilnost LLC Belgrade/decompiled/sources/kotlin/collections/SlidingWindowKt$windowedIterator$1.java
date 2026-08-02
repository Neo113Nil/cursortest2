package kotlin.collections;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.prk0;
import defpackage.srq0;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lsrq0;", "", "Lzy11;", "<anonymous>", "(Lsrq0;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "kotlin.collections.SlidingWindowKt$windowedIterator$1", f = "SlidingWindow.kt", l = {34, 40, 49, SystemProfileProtos$SystemProfileProto.ComponentId.SODA_DE_DE_VALUE, 58}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class SlidingWindowKt$windowedIterator$1 extends RestrictedSuspendLambda implements wls {
    final /* synthetic */ Iterator<Object> $iterator;
    final /* synthetic */ boolean $partialWindows;
    final /* synthetic */ boolean $reuseBuffer;
    final /* synthetic */ int $size;
    final /* synthetic */ int $step;
    int I$0;
    int I$1;
    int I$2;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SlidingWindowKt$windowedIterator$1(int i, int i2, Iterator it, boolean z, boolean z2, Continuation continuation) {
        super(2, continuation);
        this.$size = i;
        this.$step = i2;
        this.$iterator = it;
        this.$reuseBuffer = z;
        this.$partialWindows = z2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SlidingWindowKt$windowedIterator$1 slidingWindowKt$windowedIterator$1 = new SlidingWindowKt$windowedIterator$1(this.$size, this.$step, this.$iterator, this.$reuseBuffer, this.$partialWindows, continuation);
        slidingWindowKt$windowedIterator$1.L$0 = obj;
        return slidingWindowKt$windowedIterator$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SlidingWindowKt$windowedIterator$1) create((srq0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0164, code lost:
    
        if (r0.a(r12, r11) == r1) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0185, code lost:
    
        if (r0.a(r6, r11) == r1) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0130, code lost:
    
        if (r0.a(r12, r11) == r1) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0094, code lost:
    
        r11.L$0 = r0;
        r11.L$1 = r5;
        r11.L$2 = r4;
        r11.L$3 = null;
        r11.I$0 = r3;
        r11.I$1 = r2;
        r11.I$2 = r12;
        r11.label = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00a8, code lost:
    
        if (r0.a(r5, r11) != r1) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x00e4, code lost:
    
        if (r0.a(r5, r11) == r1) goto L82;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00be A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0164 -> B:16:0x0167). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x0130 -> B:31:0x0133). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x00a8 -> B:50:0x005b). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Iterator<Object> it;
        int i;
        int i2;
        prk0 prk0Var;
        ArrayList arrayList;
        int i3;
        Iterator<Object> it2;
        int i4;
        int i5;
        int i6;
        prk0 prk0Var2;
        srq0 srq0Var = (srq0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i7 = this.label;
        if (i7 == 0) {
            kotlin.b.b(obj);
            int i8 = this.$size;
            int i9 = i8 <= 1024 ? i8 : 1024;
            int i10 = this.$step - i8;
            if (i10 >= 0) {
                arrayList = new ArrayList(i9);
                i3 = 0;
                it2 = this.$iterator;
                i4 = i9;
                i5 = i10;
                while (true) {
                    if (!it2.hasNext()) {
                    }
                }
                return coroutineSingletons;
            }
            prk0 prk0Var3 = new prk0(i9);
            it = this.$iterator;
            i = i9;
            i2 = i10;
            prk0Var = prk0Var3;
            while (it.hasNext()) {
            }
            if (this.$partialWindows) {
            }
            return zy11.a;
        }
        if (i7 == 1) {
            i5 = this.I$1;
            i4 = this.I$0;
            it2 = (Iterator) this.L$2;
            arrayList = (ArrayList) this.L$1;
            kotlin.b.b(obj);
            i3 = i5;
            if (this.$reuseBuffer) {
                arrayList.clear();
            } else {
                arrayList = new ArrayList(this.$size);
            }
            i5 = i3;
            while (true) {
                if (!it2.hasNext()) {
                    Object next = it2.next();
                    if (i3 > 0) {
                        i3--;
                    } else {
                        arrayList.add(next);
                        if (arrayList.size() == this.$size) {
                            break;
                        }
                    }
                } else if (!arrayList.isEmpty() && (this.$partialWindows || arrayList.size() == this.$size)) {
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.I$0 = i4;
                    this.I$1 = i5;
                    this.I$2 = i3;
                    this.label = 2;
                }
            }
            return coroutineSingletons;
        }
        if (i7 == 2) {
        } else {
            if (i7 == 3) {
                i2 = this.I$1;
                i = this.I$0;
                it = (Iterator) this.L$2;
                prk0Var = (prk0) this.L$1;
                kotlin.b.b(obj);
                prk0Var.g(this.$step);
                while (it.hasNext()) {
                    prk0Var.a(it.next());
                    if (prk0Var.f()) {
                        int size = prk0Var.size();
                        int i11 = this.$size;
                        if (size >= i11) {
                            Object arrayList2 = this.$reuseBuffer ? prk0Var : new ArrayList(prk0Var);
                            this.L$0 = srq0Var;
                            this.L$1 = prk0Var;
                            this.L$2 = it;
                            this.L$3 = null;
                            this.I$0 = i;
                            this.I$1 = i2;
                            this.label = 3;
                        } else {
                            prk0Var = prk0Var.b(i11);
                        }
                    }
                }
                if (this.$partialWindows) {
                    i6 = i;
                    prk0Var2 = prk0Var;
                    if (prk0Var2.size() <= this.$step) {
                    }
                    return coroutineSingletons;
                }
                return zy11.a;
            }
            if (i7 == 4) {
                i2 = this.I$1;
                i6 = this.I$0;
                prk0Var2 = (prk0) this.L$1;
                kotlin.b.b(obj);
                prk0Var2.g(this.$step);
                if (prk0Var2.size() <= this.$step) {
                    if (!prk0Var2.isEmpty()) {
                        this.L$0 = null;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.I$0 = i6;
                        this.I$1 = i2;
                        this.label = 5;
                    }
                    return zy11.a;
                }
                Object arrayList3 = this.$reuseBuffer ? prk0Var2 : new ArrayList(prk0Var2);
                this.L$0 = srq0Var;
                this.L$1 = prk0Var2;
                this.L$2 = null;
                this.L$3 = null;
                this.I$0 = i6;
                this.I$1 = i2;
                this.label = 4;
                return coroutineSingletons;
            }
            if (i7 != 5) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }
        kotlin.b.b(obj);
        return zy11.a;
    }
}
