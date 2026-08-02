package ru.yandex.taxi.map;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.a58;
import defpackage.dot0;
import defpackage.g8e;
import defpackage.m7x0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qbv;
import defpackage.sp2;
import defpackage.tse;
import defpackage.v48;
import defpackage.wls;
import defpackage.zy11;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "La58;", "<anonymous>", "(Ltse;)La58;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.map.CarOnMapInOrderIconsProviderImpl$carIcon$2", f = "CarOnMapInOrderIconsProviderImpl.kt", l = {52, SystemProfileProtos$SystemProfileProto.ComponentId.SODA_ES_ES_VALUE, 58, 64}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class CarOnMapInOrderIconsProviderImpl$carIcon$2 extends SuspendLambda implements wls {
    final /* synthetic */ v48 $carIconData;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CarOnMapInOrderIconsProviderImpl$carIcon$2(v48 v48Var, a aVar, Continuation continuation) {
        super(2, continuation);
        this.$carIconData = v48Var;
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CarOnMapInOrderIconsProviderImpl$carIcon$2(this.$carIconData, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CarOnMapInOrderIconsProviderImpl$carIcon$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0194, code lost:
    
        if (r12 == r0) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0154, code lost:
    
        if (r12 == r0) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0116, code lost:
    
        if (r12 == r0) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0120  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Integer a;
        Bitmap bitmap;
        String str;
        Bitmap bitmap2;
        Bitmap bitmap3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            v48 v48Var = this.$carIconData;
            String str2 = v48Var.b;
            String str3 = v48Var.a;
            String str4 = (String) ((dot0) this.this$0.h.b()).i.get(g8e.p(str2, "_", str3 != null ? str3.toLowerCase(Locale.ROOT) : null));
            Map map = ((dot0) this.this$0.h.b()).h;
            String str5 = this.$carIconData.b;
            a = this.this$0.d.a((String) map.getOrDefault(str5, String.format(Locale.US, "class_%s_poi", Arrays.copyOf(new Object[]{str5}, 1))));
            if (str4 != null) {
                a aVar = this.this$0;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = a;
                this.L$5 = null;
                this.label = 1;
                obj = ru.yandex.taxi.utils.a.b(aVar.b.b().b(((m7x0) aVar.c).a(str4)), this);
            } else {
                bitmap = null;
                if (bitmap == null) {
                    a aVar2 = this.this$0;
                    v48 v48Var2 = this.$carIconData;
                    if (a != null) {
                        bitmap = aVar2.b(a.intValue(), v48Var2);
                    } else {
                        this.L$0 = null;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.L$4 = null;
                        this.L$5 = null;
                        this.label = 2;
                        obj = ru.yandex.taxi.utils.a.b(aVar2.b.b().b(aVar2.e.b(v48Var2.b)), this);
                    }
                }
                str = this.$carIconData.c;
                if (str != null) {
                }
            }
        } else if (i == 1) {
            a = (Integer) this.L$4;
            kotlin.b.b(obj);
        } else {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    bitmap2 = (Bitmap) this.L$6;
                    kotlin.b.b(obj);
                    bitmap3 = (Bitmap) obj;
                    if (bitmap3 != null) {
                        return new a58(bitmap2, null);
                    }
                    this.this$0.getClass();
                    if (bitmap3.getWidth() != bitmap2.getWidth() || bitmap3.getHeight() != bitmap2.getHeight()) {
                        float min = Math.min(bitmap2.getWidth() / bitmap3.getWidth(), bitmap2.getHeight() / bitmap3.getHeight());
                        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap3, (int) (bitmap3.getWidth() * min), (int) (bitmap3.getHeight() * min), true);
                        Bitmap createBitmap = Bitmap.createBitmap(bitmap2.getWidth(), bitmap2.getHeight(), Bitmap.Config.ARGB_8888);
                        new Canvas(createBitmap).drawBitmap(createScaledBitmap, (bitmap2.getWidth() - r2) / 2.0f, (bitmap2.getHeight() - r11) / 2.0f, (Paint) null);
                        bitmap3 = createBitmap;
                    }
                    return new a58(bitmap2, bitmap3);
                }
                kotlin.b.b(obj);
                bitmap = (Bitmap) obj;
                if (bitmap == null) {
                    a aVar3 = this.this$0;
                    v48 v48Var3 = this.$carIconData;
                    aVar3.getClass();
                    String format = String.format(Locale.US, "class_%s_poi", Arrays.copyOf(new Object[]{v48Var3.b}, 1));
                    sp2 sp2Var = aVar3.d;
                    Integer a2 = sp2Var.a(format);
                    bitmap = aVar3.b(a2 != null ? a2.intValue() : sp2Var.b(), v48Var3);
                }
                str = this.$carIconData.c;
                if (str != null) {
                    return new a58(bitmap, null);
                }
                a aVar4 = this.this$0;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = bitmap;
                this.L$7 = null;
                this.label = 4;
                Object b = ru.yandex.taxi.utils.a.b(aVar4.b.b().i(new qbv(((m7x0) aVar4.c).a(str))), this);
                if (b != coroutineSingletons) {
                    bitmap2 = bitmap;
                    obj = b;
                    bitmap3 = (Bitmap) obj;
                    if (bitmap3 != null) {
                    }
                }
                return coroutineSingletons;
            }
            kotlin.b.b(obj);
            bitmap = (Bitmap) obj;
            if (bitmap == null) {
                a aVar5 = this.this$0;
                v48 v48Var4 = this.$carIconData;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.label = 3;
                obj = ru.yandex.taxi.utils.a.b(aVar5.b.b().b(((m7x0) aVar5.c).a(String.format(Locale.US, "class_%s_poi", Arrays.copyOf(new Object[]{v48Var4.b}, 1)))), this);
            }
            str = this.$carIconData.c;
            if (str != null) {
            }
        }
        bitmap = (Bitmap) obj;
        if (bitmap == null) {
        }
        str = this.$carIconData.c;
        if (str != null) {
        }
    }
}
